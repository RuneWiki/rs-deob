import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QKFGLETG")
public class class50 {

    @OriginalMember(owner = "QKFGLETG", name = "a", descriptor = "I")
    private int field1225 = 7;

    @OriginalMember(owner = "QKFGLETG", name = "c", descriptor = "I")
    private int field1227 = 303;

    @OriginalMember(owner = "QKFGLETG", name = "b", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "QKFGLETG", name = "e", descriptor = "I")
    public int field1229;

    @OriginalMember(owner = "QKFGLETG", name = "j", descriptor = "Z")
    private boolean field1234;

    @OriginalMember(owner = "QKFGLETG", name = "d", descriptor = "[B")
    public byte[] field1228;

    @OriginalMember(owner = "QKFGLETG", name = "f", descriptor = "[I")
    public int[] field1230;

    @OriginalMember(owner = "QKFGLETG", name = "g", descriptor = "[I")
    public int[] field1231;

    @OriginalMember(owner = "QKFGLETG", name = "h", descriptor = "[I")
    public int[] field1232;

    @OriginalMember(owner = "QKFGLETG", name = "i", descriptor = "[I")
    public int[] field1233;

    @OriginalMember(owner = "QKFGLETG", name = "<init>", descriptor = "([BI)V")
    public class50(byte[] arg0, int arg1) {
        if (arg1 < 1 || arg1 > 1) {
            this.field1226 = 401;
        }
        this.method401(arg0, false);
    }

    @OriginalMember(owner = "QKFGLETG", name = "a", descriptor = "([BZ)V")
    private void method401(byte[] arg0, boolean arg1) {
        class68 var3 = new class68((byte) 9, arg0);
        int var4 = var3.method538();
        int var5 = var3.method538();
        if (var4 == var5) {
            this.field1228 = arg0;
            this.field1234 = false;
        } else {
            byte[] var6 = new byte[var4];
            class54.method416(var6, var4, arg0, var5, 6);
            this.field1228 = var6;
            var3 = new class68((byte) 9, this.field1228);
            this.field1234 = true;
        }
        this.field1229 = var3.method536();
        if (arg1) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.field1230 = new int[this.field1229];
        this.field1231 = new int[this.field1229];
        this.field1232 = new int[this.field1229];
        this.field1233 = new int[this.field1229];
        int var8 = this.field1229 * 10 + var3.field1643;
        for (int var9 = 0; var9 < this.field1229; var9++) {
            this.field1230[var9] = var3.method539();
            this.field1231[var9] = var3.method538();
            this.field1232[var9] = var3.method538();
            this.field1233[var9] = var8;
            var8 += this.field1232[var9];
        }
    }

    @OriginalMember(owner = "QKFGLETG", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method402(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1229; var6++) {
            if (this.field1230[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1231[var6]];
                }
                if (this.field1234) {
                    for (int var7 = 0; var7 < this.field1231[var6]; var7++) {
                        arg1[var7] = this.field1228[this.field1233[var6] + var7];
                    }
                } else {
                    class54.method416(arg1, this.field1231[var6], this.field1228, this.field1232[var6], this.field1233[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
