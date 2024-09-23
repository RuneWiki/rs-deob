import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OZKFTHAD")
public class Envelope {

    @OriginalMember(owner = "OZKFTHAD", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = false;

    @OriginalMember(owner = "OZKFTHAD", name = "b", descriptor = "B")
    private byte _flowObfuscator2 = -112;

    @OriginalMember(owner = "OZKFTHAD", name = "c", descriptor = "Z")
    private boolean _flowObfuscator3 = false;

    @OriginalMember(owner = "OZKFTHAD", name = "d", descriptor = "Z")
    private boolean _flowObfuscator4 = true;

    @OriginalMember(owner = "OZKFTHAD", name = "p", descriptor = "I")
    public static int _flowObfuscator5;

    @OriginalMember(owner = "OZKFTHAD", name = "n", descriptor = "I")
    private int aplitude;

    @OriginalMember(owner = "OZKFTHAD", name = "m", descriptor = "I")
    private int delta;

    @OriginalMember(owner = "OZKFTHAD", name = "i", descriptor = "I")
    public int end;

    @OriginalMember(owner = "OZKFTHAD", name = "j", descriptor = "I")
    public int form;

    @OriginalMember(owner = "OZKFTHAD", name = "e", descriptor = "I")
    private int length;

    @OriginalMember(owner = "OZKFTHAD", name = "l", descriptor = "I")
    private int position;

    @OriginalMember(owner = "OZKFTHAD", name = "h", descriptor = "I")
    public int start;

    @OriginalMember(owner = "OZKFTHAD", name = "k", descriptor = "I")
    private int threshold;

    @OriginalMember(owner = "OZKFTHAD", name = "o", descriptor = "I")
    private int ticks;

    @OriginalMember(owner = "OZKFTHAD", name = "f", descriptor = "[I")
    private int[] shapeDelta;

    @OriginalMember(owner = "OZKFTHAD", name = "g", descriptor = "[I")
    private int[] shapePeak;

    @OriginalMember(owner = "OZKFTHAD", name = "a", descriptor = "(ZLMBMGIXGO;)V")
    public final void read(boolean arg0, Packet arg1) {
        this.form = arg1.g1();
        if (!arg0) {
            throw new NullPointerException();
        }
        this.start = arg1.g4();
        this.end = arg1.g4();
        this.readShape((byte) -112, arg1);
    }

    @OriginalMember(owner = "OZKFTHAD", name = "a", descriptor = "(BLMBMGIXGO;)V")
    public final void readShape(byte arg0, Packet arg1) {
        if (this._flowObfuscator2 != arg0) {
            this._flowObfuscator3 = !this._flowObfuscator3;
        }
        this.length = arg1.g1();
        this.shapeDelta = new int[this.length];
        this.shapePeak = new int[this.length];
        for (int var3 = 0; var3 < this.length; var3++) {
            this.shapeDelta[var3] = arg1.g2();
            this.shapePeak[var3] = arg1.g2();
        }
    }

    @OriginalMember(owner = "OZKFTHAD", name = "a", descriptor = "(B)V")
    public final void reset(byte arg0) {
        this.threshold = 0;
        if (arg0 == 8) {
            boolean var2 = false;
        } else {
            this._flowObfuscator4 = !this._flowObfuscator4;
        }
        this.position = 0;
        this.delta = 0;
        this.aplitude = 0;
        this.ticks = 0;
    }

    @OriginalMember(owner = "OZKFTHAD", name = "a", descriptor = "(ZI)I")
    public final int evaluate(boolean arg0, int arg1) {
        if (!arg0) {
            this._flowObfuscator1 = !this._flowObfuscator1;
        }
        if (this.ticks >= this.threshold) {
            this.aplitude = this.shapePeak[this.position++] << 15;
            if (this.position >= this.length) {
                this.position = this.length - 1;
            }
            this.threshold = (int) ((double) this.shapeDelta[this.position] / 65536.0D * (double) arg1);
            if (this.threshold > this.ticks) {
                this.delta = ((this.shapePeak[this.position] << 15) - this.aplitude) / (this.threshold - this.ticks);
            }
        }
        this.aplitude += this.delta;
        this.ticks++;
        return this.aplitude - this.delta >> 15;
    }
}
