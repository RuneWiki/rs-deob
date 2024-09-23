import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Envelope {

    @OriginalMember(owner = "xb", name = "a", descriptor = "Z")
    private boolean field750 = false;

    @OriginalMember(owner = "xb", name = "b", descriptor = "I")
    private int field751;

    @OriginalMember(owner = "xb", name = "e", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "xb", name = "f", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "xb", name = "g", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "xb", name = "h", descriptor = "I")
    private int field757;

    @OriginalMember(owner = "xb", name = "i", descriptor = "I")
    private int field758;

    @OriginalMember(owner = "xb", name = "j", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "xb", name = "k", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "xb", name = "l", descriptor = "I")
    private int field761;

    @OriginalMember(owner = "xb", name = "c", descriptor = "[I")
    private int[] field752;

    @OriginalMember(owner = "xb", name = "d", descriptor = "[I")
    private int[] field753;

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Lkb;Z)V")
    public final void method267(Packet arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        this.field756 = arg0.method216();
        this.field754 = arg0.method221();
        this.field755 = arg0.method221();
        this.field751 = arg0.method216();
        this.field752 = new int[this.field751];
        this.field753 = new int[this.field751];
        for (int var3 = 0; var3 < this.field751; var3++) {
            this.field752[var3] = arg0.method218();
            this.field753[var3] = arg0.method218();
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(I)V")
    public final void method268(int arg0) {
        this.field757 = 0;
        this.field758 = 0;
        if (arg0 >= 5 && arg0 <= 5) {
            this.field759 = 0;
            this.field760 = 0;
            this.field761 = 0;
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(IB)I")
    public final int method269(int arg0, byte arg1) {
        if (arg1 != 47) {
            this.field750 = !this.field750;
        }
        if (this.field761 >= this.field757) {
            this.field760 = this.field753[this.field758++] << 15;
            if (this.field758 >= this.field751) {
                this.field758 = this.field751 - 1;
            }
            this.field757 = (int) ((double) this.field752[this.field758] / 65536.0D * (double) arg0);
            if (this.field757 > this.field761) {
                this.field759 = ((this.field753[this.field758] << 15) - this.field760) / (this.field757 - this.field761);
            }
        }
        this.field760 += this.field759;
        this.field761++;
        return this.field760 - this.field759 >> 15;
    }
}
