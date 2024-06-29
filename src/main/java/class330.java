import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class330 {

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[Lj;")
    private class321[] field4572 = new class321[10];

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    private int field4570;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    private int field4571;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lnq;II)Lii;")
    public static final class330 method2128(class268 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1745(arg2, (byte) 59, arg1);
        return var3 == null ? null : new class330(new class11(var3));
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()I")
    public final int method2129() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4572[var2] != null && this.field4572[var2].field4395 / 20 < var1) {
                var1 = this.field4572[var2].field4395 / 20;
            }
        }
        if (this.field4570 < this.field4571 && this.field4570 / 20 < var1) {
            var1 = this.field4570 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4572[var3] != null) {
                this.field4572[var3].field4395 -= var1 * 20;
            }
        }
        if (this.field4570 < this.field4571) {
            this.field4570 -= var1 * 20;
            this.field4571 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()[B")
    private final byte[] method2130() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4572[var2] != null && this.field4572[var2].field4399 + this.field4572[var2].field4395 > var1) {
                var1 = this.field4572[var2].field4399 + this.field4572[var2].field4395;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4572[var5] != null) {
                int var6 = this.field4572[var5].field4399 * 22050 / 1000;
                int var7 = this.field4572[var5].field4395 * 22050 / 1000;
                int[] var8 = this.field4572[var5].method2073(var6, this.field4572[var5].field4399);
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

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()Lvj;")
    public final class256 method2131() {
        byte[] var1 = this.method2130();
        return new class256(22050, var1, this.field4570 * 22050 / 1000, this.field4571 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lkh;)V")
    private class330(class11 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method172((byte) 52);
            if (var3 != 0) {
                arg0.field191--;
                this.field4572[var2] = new class321();
                this.field4572[var2].method2075(arg0);
            }
        }
        this.field4570 = arg0.method174(255);
        this.field4571 = arg0.method174(255);
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    private class330() {
    }
}
