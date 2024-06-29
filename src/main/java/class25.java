import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 {

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "[Lvd;")
    private class30[] field239 = new class30[10];

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    private int field240;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()Ljj;")
    public final class77 method156() {
        byte[] var1 = this.method157();
        return new class77(22050, var1, this.field240 * 22050 / 1000, this.field238 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "()[B")
    private final byte[] method157() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field239[var2] != null && this.field239[var2].field309 + this.field239[var2].field306 > var1) {
                var1 = this.field239[var2].field309 + this.field239[var2].field306;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field239[var5] != null) {
                int var6 = this.field239[var5].field306 * 22050 / 1000;
                int var7 = this.field239[var5].field309 * 22050 / 1000;
                int[] var8 = this.field239[var5].method172(var6, this.field239[var5].field306);
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

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "()I")
    public final int method158() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field239[var2] != null && this.field239[var2].field309 / 20 < var1) {
                var1 = this.field239[var2].field309 / 20;
            }
        }
        if (this.field240 < this.field238 && this.field240 / 20 < var1) {
            var1 = this.field240 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field239[var3] != null) {
                this.field239[var3].field309 -= var1 * 20;
            }
        }
        if (this.field240 < this.field238) {
            this.field240 -= var1 * 20;
            this.field238 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lfo;II)Lrk;")
    public static final class25 method159(class361 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2130(arg1, arg2, -76);
        return var3 == null ? null : new class25(new class396(var3));
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lug;)V")
    private class25(class396 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2388((byte) -120);
            if (var3 != 0) {
                arg0.field5729--;
                this.field239[var2] = new class30();
                this.field239[var2].method175(arg0);
            }
        }
        this.field240 = arg0.method2386(-23648);
        this.field238 = arg0.method2386(-23648);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    private class25() {
    }
}
