import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class275 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "[Lqg;")
    private class245[] field4823 = new class245[10];

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    private int field4824;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    private int field4825;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lik;II)Lw;", line = 7)
    public static final class275 method1985(class262 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1868(12236, arg1, arg2);
        return var3 == null ? null : new class275(new class249(var3));
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lrm;)V", line = 63)
    private class275(class249 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1731(true);
            if (var3 != 0) {
                arg0.field4314--;
                this.field4823[var2] = new class245();
                this.field4823[var2].method1687(arg0);
            }
        }
        this.field4824 = arg0.method1712(-1);
        this.field4825 = arg0.method1712(-1);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V", line = 88)
    private class275() {
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()I", line = 22)
    public final int method1986() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4823[var2] != null && this.field4823[var2].field4244 / 20 < var1) {
                var1 = this.field4823[var2].field4244 / 20;
            }
        }
        if (this.field4824 < this.field4825 && this.field4824 / 20 < var1) {
            var1 = this.field4824 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4823[var3] != null) {
                this.field4823[var3].field4244 -= var1 * 20;
            }
        }
        if (this.field4824 < this.field4825) {
            this.field4824 -= var1 * 20;
            this.field4825 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()Ltd;", line = 85)
    public final class244 method1987() {
        byte[] var1 = this.method1988();
        return new class244(22050, var1, this.field4824 * 22050 / 1000, this.field4825 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()[B", line = 92)
    private final byte[] method1988() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4823[var2] != null && this.field4823[var2].field4244 + this.field4823[var2].field4240 > var1) {
                var1 = this.field4823[var2].field4244 + this.field4823[var2].field4240;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4823[var5] != null) {
                int var6 = this.field4823[var5].field4240 * 22050 / 1000;
                int var7 = this.field4823[var5].field4244 * 22050 / 1000;
                int[] var8 = this.field4823[var5].method1685(var6, this.field4823[var5].field4240);
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
