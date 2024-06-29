import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class28 {

    @OriginalMember(owner = "client!il", name = "b", descriptor = "[Loh;")
    private class264[] field442 = new class264[10];

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lnh;II)Lil;")
    public static final class28 method183(class305 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2050(99, arg1, arg2);
        return var3 == null ? null : new class28(new class215(var3));
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()[B")
    private final byte[] method184() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field442[var2] != null && this.field442[var2].field4243 + this.field442[var2].field4240 > var1) {
                var1 = this.field442[var2].field4243 + this.field442[var2].field4240;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field442[var5] != null) {
                int var6 = this.field442[var5].field4240 * 22050 / 1000;
                int var7 = this.field442[var5].field4243 * 22050 / 1000;
                int[] var8 = this.field442[var5].method1714(var6, this.field442[var5].field4240);
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

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()Lqm;")
    public final class173 method185() {
        byte[] var1 = this.method184();
        return new class173(22050, var1, this.field441 * 22050 / 1000, this.field443 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lbj;)V")
    private class28(class215 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1374((byte) -60);
            if (var3 != 0) {
                arg0.field3280--;
                this.field442[var2] = new class264();
                this.field442[var2].method1715(arg0);
            }
        }
        this.field441 = arg0.method1379(-82);
        this.field443 = arg0.method1379(-101);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    private class28() {
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "()I")
    public final int method186() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field442[var2] != null && this.field442[var2].field4243 / 20 < var1) {
                var1 = this.field442[var2].field4243 / 20;
            }
        }
        if (this.field441 < this.field443 && this.field441 / 20 < var1) {
            var1 = this.field441 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field442[var3] != null) {
                this.field442[var3].field4243 -= var1 * 20;
            }
        }
        if (this.field441 < this.field443) {
            this.field441 -= var1 * 20;
            this.field443 -= var1 * 20;
        }
        return var1;
    }
}
