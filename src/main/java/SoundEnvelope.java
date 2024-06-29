import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OZKFTHAD")
public class SoundEnvelope {

    @OriginalMember(owner = "client!OZKFTHAD", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = false;

    @OriginalMember(owner = "client!OZKFTHAD", name = "b", descriptor = "B")
    private byte _flowObfuscator2 = -112;

    @OriginalMember(owner = "client!OZKFTHAD", name = "c", descriptor = "Z")
    private boolean _flowObfuscator3 = false;

    @OriginalMember(owner = "client!OZKFTHAD", name = "d", descriptor = "Z")
    private boolean _flowObfuscator4 = true;

    @OriginalMember(owner = "client!OZKFTHAD", name = "p", descriptor = "I")
    public static int _flowObfuscator5;

    @OriginalMember(owner = "client!OZKFTHAD", name = "n", descriptor = "I")
    private int aplitude;

    @OriginalMember(owner = "client!OZKFTHAD", name = "m", descriptor = "I")
    private int delta;

    @OriginalMember(owner = "client!OZKFTHAD", name = "i", descriptor = "I")
    public int end;

    @OriginalMember(owner = "client!OZKFTHAD", name = "j", descriptor = "I")
    public int form;

    @OriginalMember(owner = "client!OZKFTHAD", name = "e", descriptor = "I")
    private int length;

    @OriginalMember(owner = "client!OZKFTHAD", name = "l", descriptor = "I")
    private int position;

    @OriginalMember(owner = "client!OZKFTHAD", name = "h", descriptor = "I")
    public int start;

    @OriginalMember(owner = "client!OZKFTHAD", name = "k", descriptor = "I")
    private int threshold;

    @OriginalMember(owner = "client!OZKFTHAD", name = "o", descriptor = "I")
    private int ticks;

    @OriginalMember(owner = "client!OZKFTHAD", name = "f", descriptor = "[I")
    private int[] shapeDelta;

    @OriginalMember(owner = "client!OZKFTHAD", name = "g", descriptor = "[I")
    private int[] shapePeak;

    @OriginalMember(owner = "client!OZKFTHAD", name = "a", descriptor = "(ZLMBMGIXGO;)V")
    public final void read(boolean arg0, Packet arg1) {
        this.form = arg1.g1();
        if (!arg0) {
            throw new NullPointerException();
        }
        this.start = arg1.g4();
        this.end = arg1.g4();
        this.readShape((byte) -112, arg1);
    }

    @OriginalMember(owner = "client!OZKFTHAD", name = "a", descriptor = "(BLMBMGIXGO;)V")
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

    @OriginalMember(owner = "client!OZKFTHAD", name = "a", descriptor = "(B)V")
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

    @OriginalMember(owner = "client!OZKFTHAD", name = "a", descriptor = "(ZI)I")
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
