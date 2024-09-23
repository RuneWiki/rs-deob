import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MNPBQFWE")
public class class37 {

    @OriginalMember(owner = "MNPBQFWE", name = "a", descriptor = "Z")
    private boolean field1216 = false;

    @OriginalMember(owner = "MNPBQFWE", name = "b", descriptor = "I")
    private int field1217 = 6;

    @OriginalMember(owner = "MNPBQFWE", name = "d", descriptor = "I")
    public int field1219;

    @OriginalMember(owner = "MNPBQFWE", name = "i", descriptor = "Z")
    private boolean field1224;

    @OriginalMember(owner = "MNPBQFWE", name = "c", descriptor = "[B")
    public byte[] field1218;

    @OriginalMember(owner = "MNPBQFWE", name = "e", descriptor = "[I")
    public int[] field1220;

    @OriginalMember(owner = "MNPBQFWE", name = "f", descriptor = "[I")
    public int[] field1221;

    @OriginalMember(owner = "MNPBQFWE", name = "g", descriptor = "[I")
    public int[] field1222;

    @OriginalMember(owner = "MNPBQFWE", name = "h", descriptor = "[I")
    public int[] field1223;

    @OriginalMember(owner = "MNPBQFWE", name = "<init>", descriptor = "(I[B)V")
    public class37(int arg0, byte[] arg1) {
        if (arg0 != 17074) {
            throw new NullPointerException();
        }
        this.method428(arg1, this.field1216);
    }

    @OriginalMember(owner = "MNPBQFWE", name = "a", descriptor = "([BZ)V")
    private void method428(byte[] arg0, boolean arg1) {
        class3 var3 = new class3(false, arg0);
        int var4 = var3.method19();
        int var5 = var3.method19();
        if (arg1) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var4 == var5) {
            this.field1218 = arg0;
            this.field1224 = false;
        } else {
            byte[] var7 = new byte[var4];
            class60.method525(var7, var4, arg0, var5, 6);
            this.field1218 = var7;
            var3 = new class3(false, this.field1218);
            this.field1224 = true;
        }
        this.field1219 = var3.method17();
        this.field1220 = new int[this.field1219];
        this.field1221 = new int[this.field1219];
        this.field1222 = new int[this.field1219];
        this.field1223 = new int[this.field1219];
        int var8 = this.field1219 * 10 + var3.field20;
        for (int var9 = 0; var9 < this.field1219; var9++) {
            this.field1220[var9] = var3.method20();
            this.field1221[var9] = var3.method19();
            this.field1222[var9] = var3.method19();
            this.field1223[var9] = var8;
            var8 += this.field1222[var9];
        }
    }

    @OriginalMember(owner = "MNPBQFWE", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method429(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1219; var6++) {
            if (this.field1220[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1221[var6]];
                }
                if (this.field1224) {
                    for (int var7 = 0; var7 < this.field1221[var6]; var7++) {
                        arg1[var7] = this.field1218[this.field1223[var6] + var7];
                    }
                } else {
                    class60.method525(arg1, this.field1221[var6], this.field1218, this.field1222[var6], this.field1223[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
