import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Envelope {

    @OriginalMember(owner = "xb", name = "a", descriptor = "I")
    private int field753;

    @OriginalMember(owner = "xb", name = "d", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "xb", name = "e", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "xb", name = "f", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "xb", name = "g", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "xb", name = "h", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "xb", name = "i", descriptor = "I")
    private int field761;

    @OriginalMember(owner = "xb", name = "j", descriptor = "I")
    private int field762;

    @OriginalMember(owner = "xb", name = "k", descriptor = "I")
    private int field763;

    @OriginalMember(owner = "xb", name = "b", descriptor = "[I")
    private int[] field754;

    @OriginalMember(owner = "xb", name = "c", descriptor = "[I")
    private int[] field755;

    @OriginalMember(owner = "xb", name = "a", descriptor = "(ZLkb;)V")
    public final void method267(boolean arg0, Packet arg1) {
        this.field758 = arg1.method216();
        this.field756 = arg1.method221();
        this.field757 = arg1.method221();
        this.field753 = arg1.method216();
        this.field754 = new int[this.field753];
        this.field755 = new int[this.field753];
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < this.field753; var4++) {
            this.field754[var4] = arg1.method218();
            this.field755[var4] = arg1.method218();
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(I)V")
    public final void method268(int arg0) {
        this.field759 = 0;
        this.field760 = 0;
        this.field761 = 0;
        this.field762 = 0;
        if (arg0 >= 8 && arg0 <= 8) {
            this.field763 = 0;
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(ZI)I")
    public final int method269(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
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
        return this.field762 - this.field761 >> 15;
    }
}
