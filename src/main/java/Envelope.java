import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Envelope {

    @OriginalMember(owner = "bc", name = "b", descriptor = "Z")
    private boolean field880 = false;

    @OriginalMember(owner = "bc", name = "a", descriptor = "I")
    private int field879;

    @OriginalMember(owner = "bc", name = "c", descriptor = "I")
    private int field881;

    @OriginalMember(owner = "bc", name = "f", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "bc", name = "g", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "bc", name = "h", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "bc", name = "i", descriptor = "I")
    private int field887;

    @OriginalMember(owner = "bc", name = "j", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "bc", name = "k", descriptor = "I")
    private int field889;

    @OriginalMember(owner = "bc", name = "l", descriptor = "I")
    private int field890;

    @OriginalMember(owner = "bc", name = "m", descriptor = "I")
    private int field891;

    @OriginalMember(owner = "bc", name = "d", descriptor = "[I")
    private int[] field882;

    @OriginalMember(owner = "bc", name = "e", descriptor = "[I")
    private int[] field883;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(ILmb;)V")
    public final void method319(int arg0, Packet arg1) {
        this.field886 = arg1.method239();
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field884 = arg1.method244();
        this.field885 = arg1.method244();
        this.field881 = arg1.method239();
        this.field882 = new int[this.field881];
        this.field883 = new int[this.field881];
        for (int var4 = 0; var4 < this.field881; var4++) {
            this.field882[var4] = arg1.method241();
            this.field883[var4] = arg1.method241();
        }
        if (Linkable.field375) {
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Z)V")
    public final void method320(boolean arg0) {
        this.field887 = 0;
        this.field888 = 0;
        this.field889 = 0;
        this.field890 = 0;
        if (arg0) {
            this.field880 = !this.field880;
        }
        this.field891 = 0;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(II)I")
    public final int method321(int arg0, int arg1) {
        if (this.field891 >= this.field887) {
            this.field890 = this.field883[this.field888++] << 15;
            if (this.field888 >= this.field881) {
                this.field888 = this.field881 - 1;
            }
            this.field887 = (int) ((double) this.field882[this.field888] / 65536.0D * (double) arg1);
            if (this.field887 > this.field891) {
                this.field889 = ((this.field883[this.field888] << 15) - this.field890) / (this.field887 - this.field891);
            }
        }
        this.field890 += this.field889;
        this.field891++;
        if (arg0 >= 0) {
            this.field879 = -463;
        }
        return this.field890 - this.field889 >> 15;
    }
}
