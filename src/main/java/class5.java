import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BJPHZZMM")
public class class5 {

    @OriginalMember(owner = "BJPHZZMM", name = "a", descriptor = "I")
    private int field57;

    @OriginalMember(owner = "BJPHZZMM", name = "d", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "BJPHZZMM", name = "e", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "BJPHZZMM", name = "f", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "BJPHZZMM", name = "g", descriptor = "I")
    private int field63;

    @OriginalMember(owner = "BJPHZZMM", name = "h", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "BJPHZZMM", name = "i", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "BJPHZZMM", name = "j", descriptor = "I")
    private int field66;

    @OriginalMember(owner = "BJPHZZMM", name = "k", descriptor = "I")
    private int field67;

    @OriginalMember(owner = "BJPHZZMM", name = "l", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "BJPHZZMM", name = "b", descriptor = "[I")
    private int[] field58;

    @OriginalMember(owner = "BJPHZZMM", name = "c", descriptor = "[I")
    private int[] field59;

    @OriginalMember(owner = "BJPHZZMM", name = "a", descriptor = "(BLXOUQUKZW;)V")
    public final void method30(byte arg0, class62 arg1) {
        this.field62 = arg1.method521();
        this.field60 = arg1.method526();
        this.field61 = arg1.method526();
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        this.method31(false, arg1);
    }

    @OriginalMember(owner = "BJPHZZMM", name = "a", descriptor = "(ZLXOUQUKZW;)V")
    public final void method31(boolean arg0, class62 arg1) {
        this.field57 = arg1.method521();
        this.field58 = new int[this.field57];
        this.field59 = new int[this.field57];
        for (int var3 = 0; var3 < this.field57; var3++) {
            this.field58[var3] = arg1.method523();
            this.field59[var3] = arg1.method523();
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "BJPHZZMM", name = "a", descriptor = "(I)V")
    public final void method32(int arg0) {
        this.field63 = 0;
        this.field64 = 0;
        this.field65 = 0;
        if (arg0 == 0) {
            this.field66 = 0;
            this.field67 = 0;
        }
    }

    @OriginalMember(owner = "BJPHZZMM", name = "a", descriptor = "(ZI)I")
    public final int method33(boolean arg0, int arg1) {
        if (this.field67 >= this.field63) {
            this.field66 = this.field59[this.field64++] << 15;
            if (this.field64 >= this.field57) {
                this.field64 = this.field57 - 1;
            }
            this.field63 = (int) ((double) this.field58[this.field64] / 65536.0D * (double) arg1);
            if (this.field63 > this.field67) {
                this.field65 = ((this.field59[this.field64] << 15) - this.field66) / (this.field63 - this.field67);
            }
        }
        this.field66 += this.field65;
        this.field67++;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field66 - this.field65 >> 15;
    }
}
