import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class251 {

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "[Leo;")
    private class341[] field3866 = new class341[10];

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    private int field3865;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    private int field3867;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()Lqj;", line = 4)
    public final class225 method1865() {
        byte[] var1 = this.method1868();
        return new class225(22050, var1, this.field3865 * 22050 / 1000, this.field3867 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lug;)V", line = 129)
    private class251(class25 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method281(-125);
            if (var3 != 0) {
                arg0.field397--;
                this.field3866[var2] = new class341();
                this.field3866[var2].method2395(arg0);
            }
        }
        this.field3865 = arg0.method314((byte) 47);
        this.field3867 = arg0.method314((byte) 122);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 149)
    private class251() {
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lrn;II)Lej;", line = 18)
    public static final class251 method1866(class18 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method187(arg1, arg2, -1);
        return var3 == null ? null : new class251(new class25(var3));
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()I", line = 27)
    public final int method1867() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3866[var2] != null && this.field3866[var2].field5240 / 20 < var1) {
                var1 = this.field3866[var2].field5240 / 20;
            }
        }
        if (this.field3865 < this.field3867 && this.field3865 / 20 < var1) {
            var1 = this.field3865 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3866[var3] != null) {
                this.field3866[var3].field5240 -= var1 * 20;
            }
        }
        if (this.field3865 < this.field3867) {
            this.field3865 -= var1 * 20;
            this.field3867 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "()[B", line = 71)
    private final byte[] method1868() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3866[var2] != null && this.field3866[var2].field5248 + this.field3866[var2].field5240 > var1) {
                var1 = this.field3866[var2].field5248 + this.field3866[var2].field5240;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3866[var5] != null) {
                int var6 = this.field3866[var5].field5248 * 22050 / 1000;
                int var7 = this.field3866[var5].field5240 * 22050 / 1000;
                int[] var8 = this.field3866[var5].method2396(var6, this.field3866[var5].field5248);
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
}
