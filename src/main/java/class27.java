import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class27 {

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[Lvb;")
    private class60[] field407 = new class60[10];

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()[B")
    private final byte[] method214() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field407[var2] != null && this.field407[var2].field964 + this.field407[var2].field962 > var1) {
                var1 = this.field407[var2].field964 + this.field407[var2].field962;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field407[var5] != null) {
                int var6 = this.field407[var5].field962 * 22050 / 1000;
                int var7 = this.field407[var5].field964 * 22050 / 1000;
                int[] var8 = this.field407[var5].method483(var6, this.field407[var5].field962);
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

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Luf;II)Lwb;")
    public static final class27 method215(class176 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1163(arg1, arg2, 48);
        return var3 == null ? null : new class27(new class37(var3));
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()Lul;")
    public final class192 method216() {
        byte[] var1 = this.method214();
        return new class192(22050, var1, this.field405 * 22050 / 1000, this.field406 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()I")
    public final int method217() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field407[var2] != null && this.field407[var2].field964 / 20 < var1) {
                var1 = this.field407[var2].field964 / 20;
            }
        }
        if (this.field405 < this.field406 && this.field405 / 20 < var1) {
            var1 = this.field405 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field407[var3] != null) {
                this.field407[var3].field964 -= var1 * 20;
            }
        }
        if (this.field405 < this.field406) {
            this.field405 -= var1 * 20;
            this.field406 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lf;)V")
    private class27(class37 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method333((byte) -59);
            if (var3 != 0) {
                arg0.field588--;
                this.field407[var2] = new class60();
                this.field407[var2].method482(arg0);
            }
        }
        this.field405 = arg0.method293(94);
        this.field406 = arg0.method293(93);
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    private class27() {
    }
}
