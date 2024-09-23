import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FIGUVTWB")
public class class15 {

    @OriginalMember(owner = "FIGUVTWB", name = "a", descriptor = "Z")
    private boolean field670 = true;

    @OriginalMember(owner = "FIGUVTWB", name = "b", descriptor = "I")
    private int field671 = 8;

    @OriginalMember(owner = "FIGUVTWB", name = "c", descriptor = "Z")
    private boolean field672 = true;

    @OriginalMember(owner = "FIGUVTWB", name = "d", descriptor = "I")
    private int field673 = -22512;

    @OriginalMember(owner = "FIGUVTWB", name = "f", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "FIGUVTWB", name = "k", descriptor = "Z")
    private boolean field680;

    @OriginalMember(owner = "FIGUVTWB", name = "e", descriptor = "[B")
    public byte[] field674;

    @OriginalMember(owner = "FIGUVTWB", name = "g", descriptor = "[I")
    public int[] field676;

    @OriginalMember(owner = "FIGUVTWB", name = "h", descriptor = "[I")
    public int[] field677;

    @OriginalMember(owner = "FIGUVTWB", name = "i", descriptor = "[I")
    public int[] field678;

    @OriginalMember(owner = "FIGUVTWB", name = "j", descriptor = "[I")
    public int[] field679;

    @OriginalMember(owner = "FIGUVTWB", name = "<init>", descriptor = "(Z[B)V")
    public class15(boolean arg0, byte[] arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        this.method208((byte) 4, arg1);
    }

    @OriginalMember(owner = "FIGUVTWB", name = "a", descriptor = "(B[B)V")
    private void method208(byte arg0, byte[] arg1) {
        class33 var3 = new class33(this.field671, arg1);
        int var4 = var3.method296();
        int var5 = var3.method296();
        if (arg0 == 4) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (var4 == var5) {
            this.field674 = arg1;
            this.field680 = false;
        } else {
            byte[] var8 = new byte[var4];
            class66.method560(var8, var4, arg1, var5, 6);
            this.field674 = var8;
            var3 = new class33(this.field671, this.field674);
            this.field680 = true;
        }
        this.field675 = var3.method294();
        this.field676 = new int[this.field675];
        this.field677 = new int[this.field675];
        this.field678 = new int[this.field675];
        this.field679 = new int[this.field675];
        int var9 = this.field675 * 10 + var3.field954;
        for (int var10 = 0; var10 < this.field675; var10++) {
            this.field676[var10] = var3.method297();
            this.field677[var10] = var3.method296();
            this.field678[var10] = var3.method296();
            this.field679[var10] = var9;
            var9 += this.field678[var10];
        }
    }

    @OriginalMember(owner = "FIGUVTWB", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method209(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field675; var6++) {
            if (this.field676[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field677[var6]];
                }
                if (this.field680) {
                    for (int var7 = 0; var7 < this.field677[var6]; var7++) {
                        arg1[var7] = this.field674[this.field679[var6] + var7];
                    }
                } else {
                    class66.method560(arg1, this.field677[var6], this.field674, this.field678[var6], this.field679[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
