import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JUPFHAZZ")
public class class32 {

    @OriginalMember(owner = "client!JUPFHAZZ", name = "a", descriptor = "I")
    private int field1123 = 720;

    @OriginalMember(owner = "client!JUPFHAZZ", name = "b", descriptor = "Z")
    private boolean field1124 = false;

    @OriginalMember(owner = "client!JUPFHAZZ", name = "c", descriptor = "I")
    private int field1125 = -223;

    @OriginalMember(owner = "client!JUPFHAZZ", name = "e", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!JUPFHAZZ", name = "j", descriptor = "Z")
    private boolean field1132;

    @OriginalMember(owner = "client!JUPFHAZZ", name = "d", descriptor = "[B")
    public byte[] field1126;

    @OriginalMember(owner = "client!JUPFHAZZ", name = "f", descriptor = "[I")
    public int[] field1128;

    @OriginalMember(owner = "client!JUPFHAZZ", name = "g", descriptor = "[I")
    public int[] field1129;

    @OriginalMember(owner = "client!JUPFHAZZ", name = "h", descriptor = "[I")
    public int[] field1130;

    @OriginalMember(owner = "client!JUPFHAZZ", name = "i", descriptor = "[I")
    public int[] field1131;

    @OriginalMember(owner = "client!JUPFHAZZ", name = "<init>", descriptor = "(I[B)V")
    public class32(int arg0, byte[] arg1) {
        if (arg0 != -6438) {
            throw new NullPointerException();
        }
        this.method371(true, arg1);
    }

    @OriginalMember(owner = "client!JUPFHAZZ", name = "a", descriptor = "(Z[B)V")
    private void method371(boolean arg0, byte[] arg1) {
        class59 var3 = new class59(859, arg1);
        int var4 = var3.method533();
        int var5 = var3.method533();
        if (var4 == var5) {
            this.field1126 = arg1;
            this.field1132 = false;
        } else {
            byte[] var6 = new byte[var4];
            class27.method263(var6, var4, arg1, var5, 6);
            this.field1126 = var6;
            var3 = new class59(859, this.field1126);
            this.field1132 = true;
        }
        this.field1127 = var3.method531();
        this.field1128 = new int[this.field1127];
        this.field1129 = new int[this.field1127];
        this.field1130 = new int[this.field1127];
        this.field1131 = new int[this.field1127];
        int var7 = this.field1127 * 10 + var3.field1589;
        if (!arg0) {
            this.field1124 = !this.field1124;
        }
        for (int var8 = 0; var8 < this.field1127; var8++) {
            this.field1128[var8] = var3.method534();
            this.field1129[var8] = var3.method533();
            this.field1130[var8] = var3.method533();
            this.field1131[var8] = var7;
            var7 += this.field1130[var8];
        }
    }

    @OriginalMember(owner = "client!JUPFHAZZ", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method372(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1127; var6++) {
            if (this.field1128[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1129[var6]];
                }
                if (this.field1132) {
                    for (int var7 = 0; var7 < this.field1129[var6]; var7++) {
                        arg1[var7] = this.field1126[this.field1131[var6] + var7];
                    }
                } else {
                    class27.method263(arg1, this.field1129[var6], this.field1126, this.field1130[var6], this.field1131[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
