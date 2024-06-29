import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class187 {

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "[Lgm;")
    private class291[] field3405 = new class291[10];

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    private int field3403;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    private int field3404;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()[B", line = 4)
    private final byte[] method1435() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3405[var2] != null && this.field3405[var2].field5197 + this.field3405[var2].field5188 > var1) {
                var1 = this.field3405[var2].field5197 + this.field3405[var2].field5188;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3405[var5] != null) {
                int var6 = this.field3405[var5].field5197 * 22050 / 1000;
                int var7 = this.field3405[var5].field5188 * 22050 / 1000;
                int[] var8 = this.field3405[var5].method2078(var6, this.field3405[var5].field5197);
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

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()Ltc;", line = 66)
    public final class40 method1436() {
        byte[] var1 = this.method1435();
        return new class40(22050, var1, this.field3403 * 22050 / 1000, this.field3404 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()I", line = 74)
    public final int method1437() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3405[var2] != null && this.field3405[var2].field5188 / 20 < var1) {
                var1 = this.field3405[var2].field5188 / 20;
            }
        }
        if (this.field3403 < this.field3404 && this.field3403 / 20 < var1) {
            var1 = this.field3403 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3405[var3] != null) {
                this.field3405[var3].field5188 -= var1 * 20;
            }
        }
        if (this.field3403 < this.field3404) {
            this.field3403 -= var1 * 20;
            this.field3404 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lok;II)Luc;", line = 119)
    public static final class187 method1438(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1192(0, arg1, arg2);
        return var3 == null ? null : new class187(new class53(var3));
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lvh;)V", line = 129)
    private class187(class53 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method483(-105);
            if (var3 != 0) {
                arg0.field1142--;
                this.field3405[var2] = new class291();
                this.field3405[var2].method2077(arg0);
            }
        }
        this.field3403 = arg0.method468(28214);
        this.field3404 = arg0.method468(28214);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 149)
    private class187() {
    }
}
