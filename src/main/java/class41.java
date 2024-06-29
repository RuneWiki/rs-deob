import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NXFIIFAD")
public class class41 {

    @OriginalMember(owner = "client!NXFIIFAD", name = "a", descriptor = "Z")
    private boolean field1249 = false;

    @OriginalMember(owner = "client!NXFIIFAD", name = "b", descriptor = "Z")
    private boolean field1250 = true;

    @OriginalMember(owner = "client!NXFIIFAD", name = "c", descriptor = "I")
    private int field1251 = 503;

    @OriginalMember(owner = "client!NXFIIFAD", name = "e", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!NXFIIFAD", name = "j", descriptor = "Z")
    private boolean field1258;

    @OriginalMember(owner = "client!NXFIIFAD", name = "d", descriptor = "[B")
    public byte[] field1252;

    @OriginalMember(owner = "client!NXFIIFAD", name = "f", descriptor = "[I")
    public int[] field1254;

    @OriginalMember(owner = "client!NXFIIFAD", name = "g", descriptor = "[I")
    public int[] field1255;

    @OriginalMember(owner = "client!NXFIIFAD", name = "h", descriptor = "[I")
    public int[] field1256;

    @OriginalMember(owner = "client!NXFIIFAD", name = "i", descriptor = "[I")
    public int[] field1257;

    @OriginalMember(owner = "client!NXFIIFAD", name = "<init>", descriptor = "([BZ)V")
    public class41(byte[] arg0, boolean arg1) {
        if (!arg1) {
            this.field1249 = !this.field1249;
        }
        this.method430(false, arg0);
    }

    @OriginalMember(owner = "client!NXFIIFAD", name = "a", descriptor = "(Z[B)V")
    private void method430(boolean arg0, byte[] arg1) {
        class37 var3 = new class37(arg1, -670);
        int var4 = var3.method390();
        if (arg0) {
            this.field1251 = -258;
        }
        int var5 = var3.method390();
        if (var4 == var5) {
            this.field1252 = arg1;
            this.field1258 = false;
        } else {
            byte[] var6 = new byte[var4];
            class9.method177(var6, var4, arg1, var5, 6);
            this.field1252 = var6;
            var3 = new class37(this.field1252, -670);
            this.field1258 = true;
        }
        this.field1253 = var3.method388();
        this.field1254 = new int[this.field1253];
        this.field1255 = new int[this.field1253];
        this.field1256 = new int[this.field1253];
        this.field1257 = new int[this.field1253];
        int var7 = this.field1253 * 10 + var3.field1212;
        for (int var8 = 0; var8 < this.field1253; var8++) {
            this.field1254[var8] = var3.method391();
            this.field1255[var8] = var3.method390();
            this.field1256[var8] = var3.method390();
            this.field1257[var8] = var7;
            var7 += this.field1256[var8];
        }
    }

    @OriginalMember(owner = "client!NXFIIFAD", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method431(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1253; var6++) {
            if (this.field1254[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1255[var6]];
                }
                if (this.field1258) {
                    for (int var7 = 0; var7 < this.field1255[var6]; var7++) {
                        arg1[var7] = this.field1252[this.field1257[var6] + var7];
                    }
                } else {
                    class9.method177(arg1, this.field1255[var6], this.field1252, this.field1256[var6], this.field1257[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
