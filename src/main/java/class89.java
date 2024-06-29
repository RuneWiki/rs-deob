import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class89 {

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "[Lpe;")
    private class158[] field1339 = new class158[10];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    private int field1337;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()[B")
    private final byte[] method606() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1339[var2] != null && this.field1339[var2].field2280 + this.field1339[var2].field2274 > var1) {
                var1 = this.field1339[var2].field2280 + this.field1339[var2].field2274;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1339[var5] != null) {
                int var6 = this.field1339[var5].field2274 * 22050 / 1000;
                int var7 = this.field1339[var5].field2280 * 22050 / 1000;
                int[] var8 = this.field1339[var5].method957(var6, this.field1339[var5].field2274);
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                    if ((var10 + 128 & 0xFFFFFF00) != 0) {
                        var10 = var10 >> 31 ^ 0x7F;
                    }
                    var4[var7 + var9] = (byte) var10;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lfc;II)Lvh;")
    public static final class89 method607(class343 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2029(arg1, arg2, 0);
        return var3 == null ? null : new class89(new class425(var3));
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "()I")
    public final int method608() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1339[var2] != null && this.field1339[var2].field2280 / 20 < var1) {
                var1 = this.field1339[var2].field2280 / 20;
            }
        }
        if (this.field1338 < this.field1337 && this.field1338 / 20 < var1) {
            var1 = this.field1338 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1339[var3] != null) {
                this.field1339[var3].field2280 -= var1 * 20;
            }
        }
        if (this.field1338 < this.field1337) {
            this.field1338 -= var1 * 20;
            this.field1337 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "()Lcu;")
    public final class144 method609() {
        byte[] var1 = this.method606();
        return new class144(22050, var1, this.field1338 * 22050 / 1000, this.field1337 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Llk;)V")
    private class89(class425 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2503(true);
            if (var3 != 0) {
                arg0.field5830--;
                this.field1339[var2] = new class158();
                this.field1339[var2].method956(arg0);
            }
        }
        this.field1338 = arg0.method2508(true);
        this.field1337 = arg0.method2508(true);
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    private class89() {
    }
}
