import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[Lod;")
    private class101[] field2508 = new class101[10];

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    private int field2507;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    private int field2509;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()[B")
    private final byte[] method884() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2508[var2] != null && this.field2508[var2].field2356 + this.field2508[var2].field2353 > var1) {
                var1 = this.field2508[var2].field2356 + this.field2508[var2].field2353;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2508[var5] != null) {
                int var6 = this.field2508[var5].field2353 * 22050 / 1000;
                int var7 = this.field2508[var5].field2356 * 22050 / 1000;
                int[] var8 = this.field2508[var5].method815(var6, this.field2508[var5].field2353);
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

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "()Lke;")
    public final class74 method885() {
        byte[] var1 = this.method884();
        return new class74(22050, var1, this.field2507 * 22050 / 1000, this.field2509 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "()I")
    public final int method886() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2508[var2] != null && this.field2508[var2].field2356 / 20 < var1) {
                var1 = this.field2508[var2].field2356 / 20;
            }
        }
        if (this.field2507 < this.field2509 && this.field2507 / 20 < var1) {
            var1 = this.field2507 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2508[var3] != null) {
                this.field2508[var3].field2356 -= var1 * 20;
            }
        }
        if (this.field2507 < this.field2509) {
            this.field2507 -= var1 * 20;
            this.field2509 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lpd;II)Lpe;")
    public static final class109 method887(class108 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method867(arg1, 15, arg2);
        return var3 == null ? null : new class109(new class128(var3));
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Ls;)V")
    private class109(class128 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1025(255);
            if (var3 != 0) {
                arg0.field2873--;
                this.field2508[var2] = new class101();
                this.field2508[var2].method813(arg0);
            }
        }
        this.field2507 = arg0.method1041(212464720);
        this.field2509 = arg0.method1041(212464720);
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    private class109() {
    }
}
