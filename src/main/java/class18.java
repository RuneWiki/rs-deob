import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GWOEELWB")
public class class18 {

    @OriginalMember(owner = "GWOEELWB", name = "a", descriptor = "Z")
    private boolean field849 = true;

    @OriginalMember(owner = "GWOEELWB", name = "b", descriptor = "I")
    private int field850 = -578;

    @OriginalMember(owner = "GWOEELWB", name = "d", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "GWOEELWB", name = "i", descriptor = "Z")
    private boolean field857;

    @OriginalMember(owner = "GWOEELWB", name = "c", descriptor = "[B")
    public byte[] field851;

    @OriginalMember(owner = "GWOEELWB", name = "e", descriptor = "[I")
    public int[] field853;

    @OriginalMember(owner = "GWOEELWB", name = "f", descriptor = "[I")
    public int[] field854;

    @OriginalMember(owner = "GWOEELWB", name = "g", descriptor = "[I")
    public int[] field855;

    @OriginalMember(owner = "GWOEELWB", name = "h", descriptor = "[I")
    public int[] field856;

    @OriginalMember(owner = "GWOEELWB", name = "<init>", descriptor = "([BI)V")
    public class18(byte[] arg0, int arg1) {
        if (arg1 < 8 || arg1 > 8) {
            throw new NullPointerException();
        }
        this.method248(arg0, -446);
    }

    @OriginalMember(owner = "GWOEELWB", name = "a", descriptor = "([BI)V")
    private void method248(byte[] arg0, int arg1) {
        class30 var3 = new class30(true, arg0);
        int var4 = var3.method300();
        int var5 = var3.method300();
        if (var4 == var5) {
            this.field851 = arg0;
            this.field857 = false;
        } else {
            byte[] var6 = new byte[var4];
            class57.method553(var6, var4, arg0, var5, 6);
            this.field851 = var6;
            var3 = new class30(true, this.field851);
            this.field857 = true;
        }
        this.field852 = var3.method298();
        this.field853 = new int[this.field852];
        this.field854 = new int[this.field852];
        this.field855 = new int[this.field852];
        this.field856 = new int[this.field852];
        int var7 = this.field852 * 10 + var3.field1092;
        if (arg1 >= 0) {
            return;
        }
        for (int var8 = 0; var8 < this.field852; var8++) {
            this.field853[var8] = var3.method301();
            this.field854[var8] = var3.method300();
            this.field855[var8] = var3.method300();
            this.field856[var8] = var7;
            var7 += this.field855[var8];
        }
    }

    @OriginalMember(owner = "GWOEELWB", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method249(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field852; var6++) {
            if (this.field853[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field854[var6]];
                }
                if (this.field857) {
                    for (int var7 = 0; var7 < this.field854[var6]; var7++) {
                        arg1[var7] = this.field851[this.field856[var6] + var7];
                    }
                } else {
                    class57.method553(arg1, this.field854[var6], this.field851, this.field855[var6], this.field856[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
