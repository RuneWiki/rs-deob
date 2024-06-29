import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class292 {

    @OriginalMember(owner = "client!es", name = "b", descriptor = "[Lve;")
    private class308[] field3957 = new class308[10];

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    private int field3956;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    private int field3958;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "()I", line = 5)
    public final int method1889() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3957[var2] != null && this.field3957[var2].field4180 / 20 < var1) {
                var1 = this.field3957[var2].field4180 / 20;
            }
        }
        if (this.field3956 < this.field3958 && this.field3956 / 20 < var1) {
            var1 = this.field3956 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3957[var3] != null) {
                this.field3957[var3].field4180 -= var1 * 20;
            }
        }
        if (this.field3956 < this.field3958) {
            this.field3956 -= var1 * 20;
            this.field3958 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "()[B", line = 51)
    private final byte[] method1890() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3957[var2] != null && this.field3957[var2].field4180 + this.field3957[var2].field4175 > var1) {
                var1 = this.field3957[var2].field4180 + this.field3957[var2].field4175;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3957[var5] != null) {
                int var6 = this.field3957[var5].field4175 * 22050 / 1000;
                int var7 = this.field3957[var5].field4180 * 22050 / 1000;
                int[] var8 = this.field3957[var5].method1980(var6, this.field3957[var5].field4175);
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

    @OriginalMember(owner = "client!es", name = "c", descriptor = "()Lkf;", line = 110)
    public final class294 method1891() {
        byte[] var1 = this.method1890();
        return new class294(22050, var1, this.field3956 * 22050 / 1000, this.field3958 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lrk;II)Les;", line = 118)
    public static final class292 method1892(class427 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2633(arg2, -1, arg1);
        return var3 == null ? null : new class292(new class289(var3));
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lap;)V", line = 129)
    private class292(class289 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1861((byte) -72);
            if (var3 != 0) {
                arg0.field3938--;
                this.field3957[var2] = new class308();
                this.field3957[var2].method1983(arg0);
            }
        }
        this.field3956 = arg0.method1853(-73);
        this.field3958 = arg0.method1853(101);
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V", line = 149)
    private class292() {
    }
}
