import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Envelope {

    @OriginalMember(owner = "xb", name = "a", descriptor = "I")
    private int field752 = 363;

    @OriginalMember(owner = "xb", name = "b", descriptor = "I")
    private int field753;

    @OriginalMember(owner = "xb", name = "e", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "xb", name = "f", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "xb", name = "g", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "xb", name = "h", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "xb", name = "i", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "xb", name = "j", descriptor = "I")
    private int field761;

    @OriginalMember(owner = "xb", name = "k", descriptor = "I")
    private int field762;

    @OriginalMember(owner = "xb", name = "l", descriptor = "I")
    private int field763;

    @OriginalMember(owner = "xb", name = "c", descriptor = "[I")
    private int[] field754;

    @OriginalMember(owner = "xb", name = "d", descriptor = "[I")
    private int[] field755;

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Lkb;I)V")
    public final void method260(Packet arg0, int arg1) {
        this.field758 = arg0.method209();
        this.field756 = arg0.method214();
        this.field757 = arg0.method214();
        this.field753 = arg0.method209();
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.field754 = new int[this.field753];
        this.field755 = new int[this.field753];
        for (int var3 = 0; var3 < this.field753; var3++) {
            this.field754[var3] = arg0.method211();
            this.field755[var3] = arg0.method211();
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Z)V")
    public final void method261(boolean arg0) {
        this.field759 = 0;
        this.field760 = 0;
        if (arg0) {
            this.field752 = -412;
        }
        this.field761 = 0;
        this.field762 = 0;
        this.field763 = 0;
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(II)I")
    public final int method262(int arg0, int arg1) {
        if (this.field763 >= this.field759) {
            this.field762 = this.field755[this.field760++] << 15;
            if (this.field760 >= this.field753) {
                this.field760 = this.field753 - 1;
            }
            this.field759 = (int) ((double) this.field754[this.field760] / 65536.0D * (double) arg1);
            if (this.field759 > this.field763) {
                this.field761 = ((this.field755[this.field760] << 15) - this.field762) / (this.field759 - this.field763);
            }
        }
        this.field762 += this.field761;
        this.field763++;
        int var3 = 61 / arg0;
        return this.field762 - this.field761 >> 15;
    }
}
