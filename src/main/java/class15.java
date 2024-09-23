import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DNFIVRJB")
public class class15 {

    @OriginalMember(owner = "DNFIVRJB", name = "a", descriptor = "I")
    private int field629 = 22486;

    @OriginalMember(owner = "DNFIVRJB", name = "b", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "DNFIVRJB", name = "e", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "DNFIVRJB", name = "f", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "DNFIVRJB", name = "g", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "DNFIVRJB", name = "h", descriptor = "I")
    private int field636;

    @OriginalMember(owner = "DNFIVRJB", name = "i", descriptor = "I")
    private int field637;

    @OriginalMember(owner = "DNFIVRJB", name = "j", descriptor = "I")
    private int field638;

    @OriginalMember(owner = "DNFIVRJB", name = "k", descriptor = "I")
    private int field639;

    @OriginalMember(owner = "DNFIVRJB", name = "l", descriptor = "I")
    private int field640;

    @OriginalMember(owner = "DNFIVRJB", name = "m", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "DNFIVRJB", name = "c", descriptor = "[I")
    private int[] field631;

    @OriginalMember(owner = "DNFIVRJB", name = "d", descriptor = "[I")
    private int[] field632;

    @OriginalMember(owner = "DNFIVRJB", name = "a", descriptor = "(LCFARFRSG;I)V")
    public final void method255(class8 arg0, int arg1) {
        this.field635 = arg0.method30();
        if (this.field629 != arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field633 = arg0.method35();
        this.field634 = arg0.method35();
        this.method256(29122, arg0);
    }

    @OriginalMember(owner = "DNFIVRJB", name = "a", descriptor = "(ILCFARFRSG;)V")
    public final void method256(int arg0, class8 arg1) {
        this.field630 = arg1.method30();
        if (arg0 != 29122) {
            this.field629 = 239;
        }
        this.field631 = new int[this.field630];
        this.field632 = new int[this.field630];
        for (int var3 = 0; var3 < this.field630; var3++) {
            this.field631[var3] = arg1.method32();
            this.field632[var3] = arg1.method32();
        }
    }

    @OriginalMember(owner = "DNFIVRJB", name = "a", descriptor = "(I)V")
    public final void method257(int arg0) {
        this.field636 = 0;
        this.field637 = 0;
        int var2 = 24 / arg0;
        this.field638 = 0;
        this.field639 = 0;
        this.field640 = 0;
    }

    @OriginalMember(owner = "DNFIVRJB", name = "a", descriptor = "(II)I")
    public final int method258(int arg0, int arg1) {
        if (this.field640 >= this.field636) {
            this.field639 = this.field632[this.field637++] << 15;
            if (this.field637 >= this.field630) {
                this.field637 = this.field630 - 1;
            }
            this.field636 = (int) ((double) this.field631[this.field637] / 65536.0D * (double) arg1);
            if (this.field636 > this.field640) {
                this.field638 = ((this.field632[this.field637] << 15) - this.field639) / (this.field636 - this.field640);
            }
        }
        this.field639 += this.field638;
        this.field640++;
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field639 - this.field638 >> 15;
    }
}
