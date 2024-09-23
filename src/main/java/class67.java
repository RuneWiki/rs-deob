import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VQRBOQUI")
public class class67 {

    @OriginalMember(owner = "VQRBOQUI", name = "a", descriptor = "Z")
    private boolean field1677 = false;

    @OriginalMember(owner = "VQRBOQUI", name = "b", descriptor = "I")
    private int field1678 = 7;

    @OriginalMember(owner = "VQRBOQUI", name = "c", descriptor = "Z")
    private boolean field1679 = true;

    @OriginalMember(owner = "VQRBOQUI", name = "d", descriptor = "I")
    private int field1680;

    @OriginalMember(owner = "VQRBOQUI", name = "g", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "VQRBOQUI", name = "h", descriptor = "I")
    public int field1684;

    @OriginalMember(owner = "VQRBOQUI", name = "i", descriptor = "I")
    public int field1685;

    @OriginalMember(owner = "VQRBOQUI", name = "j", descriptor = "I")
    private int field1686;

    @OriginalMember(owner = "VQRBOQUI", name = "k", descriptor = "I")
    private int field1687;

    @OriginalMember(owner = "VQRBOQUI", name = "l", descriptor = "I")
    private int field1688;

    @OriginalMember(owner = "VQRBOQUI", name = "m", descriptor = "I")
    private int field1689;

    @OriginalMember(owner = "VQRBOQUI", name = "n", descriptor = "I")
    private int field1690;

    @OriginalMember(owner = "VQRBOQUI", name = "o", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "VQRBOQUI", name = "e", descriptor = "[I")
    private int[] field1681;

    @OriginalMember(owner = "VQRBOQUI", name = "f", descriptor = "[I")
    private int[] field1682;

    @OriginalMember(owner = "VQRBOQUI", name = "a", descriptor = "(BLCKBTFRZM;)V")
    public final void method578(byte arg0, class5 arg1) {
        this.field1685 = arg1.method44();
        this.field1683 = arg1.method49();
        if (arg0 != -18) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1684 = arg1.method49();
        this.method579(7, arg1);
    }

    @OriginalMember(owner = "VQRBOQUI", name = "a", descriptor = "(ILCKBTFRZM;)V")
    public final void method579(int arg0, class5 arg1) {
        this.field1680 = arg1.method44();
        if (this.field1678 != arg0) {
            this.field1677 = !this.field1677;
        }
        this.field1681 = new int[this.field1680];
        this.field1682 = new int[this.field1680];
        for (int var3 = 0; var3 < this.field1680; var3++) {
            this.field1681[var3] = arg1.method46();
            this.field1682[var3] = arg1.method46();
        }
    }

    @OriginalMember(owner = "VQRBOQUI", name = "a", descriptor = "(I)V")
    public final void method580(int arg0) {
        this.field1686 = 0;
        if (arg0 >= 0) {
            this.field1679 = !this.field1679;
        }
        this.field1687 = 0;
        this.field1688 = 0;
        this.field1689 = 0;
        this.field1690 = 0;
    }

    @OriginalMember(owner = "VQRBOQUI", name = "a", descriptor = "(ZI)I")
    public final int method581(boolean arg0, int arg1) {
        if (this.field1690 >= this.field1686) {
            this.field1689 = this.field1682[this.field1687++] << 15;
            if (this.field1687 >= this.field1680) {
                this.field1687 = this.field1680 - 1;
            }
            this.field1686 = (int) ((double) this.field1681[this.field1687] / 65536.0D * (double) arg1);
            if (this.field1686 > this.field1690) {
                this.field1688 = ((this.field1682[this.field1687] << 15) - this.field1689) / (this.field1686 - this.field1690);
            }
        }
        this.field1689 += this.field1688;
        this.field1690++;
        if (arg0) {
            this.field1677 = !this.field1677;
        }
        return this.field1689 - this.field1688 >> 15;
    }
}
