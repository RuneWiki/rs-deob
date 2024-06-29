import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class134 {

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[Lna;")
    private class91[] field3049 = new class91[10];

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    private int field3047;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    private int field3048;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()Lm;")
    public final class83 method1053() {
        byte[] var1 = this.method1054();
        return new class83(22050, var1, this.field3047 * 22050 / 1000, this.field3048 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()[B")
    private final byte[] method1054() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3049[var2] != null && this.field3049[var2].field2276 + this.field3049[var2].field2266 > var1) {
                var1 = this.field3049[var2].field2276 + this.field3049[var2].field2266;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3049[var5] != null) {
                int var6 = this.field3049[var5].field2266 * 22050 / 1000;
                int var7 = this.field3049[var5].field2276 * 22050 / 1000;
                int[] var8 = this.field3049[var5].method741(var6, this.field3049[var5].field2266);
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

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lie;II)Ltb;")
    public static final class134 method1055(class61 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method473((byte) 113, arg1, arg2);
        return var3 == null ? null : new class134(new class103(var3));
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "()I")
    public final int method1056() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3049[var2] != null && this.field3049[var2].field2276 / 20 < var1) {
                var1 = this.field3049[var2].field2276 / 20;
            }
        }
        if (this.field3047 < this.field3048 && this.field3047 / 20 < var1) {
            var1 = this.field3047 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3049[var3] != null) {
                this.field3049[var3].field2276 -= var1 * 20;
            }
        }
        if (this.field3047 < this.field3048) {
            this.field3047 -= var1 * 20;
            this.field3048 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lof;)V")
    private class134(class103 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method829((byte) 22);
            if (var3 != 0) {
                arg0.field2501--;
                this.field3049[var2] = new class91();
                this.field3049[var2].method743(arg0);
            }
        }
        this.field3047 = arg0.method808(-20054);
        this.field3048 = arg0.method808(-20054);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    private class134() {
    }
}
