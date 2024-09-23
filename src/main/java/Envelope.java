import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Envelope {

    @OriginalMember(owner = "xb", name = "a", descriptor = "B")
    private byte field754 = 6;

    @OriginalMember(owner = "xb", name = "b", descriptor = "I")
    private static int field755 = 48104;

    @OriginalMember(owner = "xb", name = "c", descriptor = "I")
    private int field756;

    @OriginalMember(owner = "xb", name = "f", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "xb", name = "g", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "xb", name = "h", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "xb", name = "i", descriptor = "I")
    private int field762;

    @OriginalMember(owner = "xb", name = "j", descriptor = "I")
    private int field763;

    @OriginalMember(owner = "xb", name = "k", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "xb", name = "l", descriptor = "I")
    private int field765;

    @OriginalMember(owner = "xb", name = "m", descriptor = "I")
    private int field766;

    @OriginalMember(owner = "xb", name = "d", descriptor = "[I")
    private int[] field757;

    @OriginalMember(owner = "xb", name = "e", descriptor = "[I")
    private int[] field758;

    @OriginalMember(owner = "xb", name = "a", descriptor = "(BLkb;)V")
    public final void method260(byte arg0, Packet arg1) {
        this.field761 = arg1.method209();
        if (arg0 != 8) {
            field755 = -267;
        }
        this.field759 = arg1.method214();
        this.field760 = arg1.method214();
        this.field756 = arg1.method209();
        this.field757 = new int[this.field756];
        this.field758 = new int[this.field756];
        for (int var3 = 0; var3 < this.field756; var3++) {
            this.field757[var3] = arg1.method211();
            this.field758[var3] = arg1.method211();
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(I)V")
    public final void method261(int arg0) {
        this.field762 = 0;
        this.field763 = 0;
        this.field764 = 0;
        this.field765 = 0;
        if (arg0 < 0) {
            this.field766 = 0;
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(BI)I")
    public final int method262(byte arg0, int arg1) {
        if (this.field766 >= this.field762) {
            this.field765 = this.field758[this.field763++] << 15;
            if (this.field763 >= this.field756) {
                this.field763 = this.field756 - 1;
            }
            this.field762 = (int) ((double) this.field757[this.field763] / 65536.0D * (double) arg1);
            if (this.field762 > this.field766) {
                this.field764 = ((this.field758[this.field763] << 15) - this.field765) / (this.field762 - this.field766);
            }
        }
        this.field765 += this.field764;
        if (this.field754 != arg0) {
            field755 = -399;
        }
        this.field766++;
        return this.field765 - this.field764 >> 15;
    }
}
