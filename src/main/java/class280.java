import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class280 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "[Loe;")
    private class54[] field4438 = new class54[10];

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    private int field4439;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    private int field4440;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lsb;II)Lhh;")
    public static final class280 method1881(class124 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method900(arg1, arg2, false);
        return var3 == null ? null : new class280(new class136(var3));
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()[B")
    private final byte[] method1882() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4438[var2] != null && this.field4438[var2].field962 + this.field4438[var2].field957 > var1) {
                var1 = this.field4438[var2].field962 + this.field4438[var2].field957;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4438[var5] != null) {
                int var6 = this.field4438[var5].field962 * 22050 / 1000;
                int var7 = this.field4438[var5].field957 * 22050 / 1000;
                int[] var8 = this.field4438[var5].method443(var6, this.field4438[var5].field962);
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

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "()Lbe;")
    public final class86 method1883() {
        byte[] var1 = this.method1882();
        return new class86(22050, var1, this.field4439 * 22050 / 1000, this.field4440 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lig;)V")
    private class280(class136 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1012(4);
            if (var3 != 0) {
                arg0.field2231--;
                this.field4438[var2] = new class54();
                this.field4438[var2].method444(arg0);
            }
        }
        this.field4439 = arg0.method996(65280);
        this.field4440 = arg0.method996(65280);
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    private class280() {
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "()I")
    public final int method1884() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4438[var2] != null && this.field4438[var2].field957 / 20 < var1) {
                var1 = this.field4438[var2].field957 / 20;
            }
        }
        if (this.field4439 < this.field4440 && this.field4439 / 20 < var1) {
            var1 = this.field4439 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4438[var3] != null) {
                this.field4438[var3].field957 -= var1 * 20;
            }
        }
        if (this.field4439 < this.field4440) {
            this.field4439 -= var1 * 20;
            this.field4440 -= var1 * 20;
        }
        return var1;
    }
}
