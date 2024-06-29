import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class328 {

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Lrt;")
    private class194 field4724 = new class194(null);

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "[B")
    private static byte[] field4725 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public int field4727;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    private int field4729;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "J")
    private long field4728;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "[I")
    private int[] field4726;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "[I")
    public int[] field4730;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "[I")
    private int[] field4731;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "[I")
    private int[] field4732;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "()V", line = 6)
    public static void method2127() {
        field4725 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 9)
    public final void method2128(int arg0) {
        this.field4731[arg0] = this.field4724.field2610;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 14)
    public final void method2129(int arg0) {
        int var2 = this.field4724.method1181(false);
        this.field4730[arg0] += var2;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "()I", line = 19)
    public final int method2130() {
        int var1 = this.field4731.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4731[var4] >= 0 && this.field4730[var4] < var3) {
                var2 = var4;
                var3 = this.field4730[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "()Z", line = 44)
    public final boolean method2131() {
        return this.field4724.field2622 != null;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)I", line = 48)
    private final int method2132(int arg0) {
        byte var2 = this.field4724.field2622[this.field4724.field2610];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4726[arg0] = var3;
            this.field4724.field2610++;
        } else {
            var3 = this.field4726[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2142(arg0, var3);
        }
        int var4 = this.field4724.method1181(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4724.field2622[this.field4724.field2610] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4724.field2610++;
                this.field4726[arg0] = var5;
                return this.method2142(arg0, var5);
            }
        }
        this.field4724.field2610 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "()I", line = 89)
    public final int method2133() {
        return this.field4731.length;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V", line = 222)
    public class328() {
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "([B)V", line = 224)
    public class328(byte[] arg0) {
        this.method2136(arg0);
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V", line = 96)
    public final void method2134(int arg0) {
        this.field4724.field2610 = this.field4731[arg0];
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "()V", line = 100)
    public final void method2135() {
        this.field4724.field2622 = null;
        this.field4732 = null;
        this.field4731 = null;
        this.field4730 = null;
        this.field4726 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([B)V", line = 110)
    public final void method2136(byte[] arg0) {
        this.field4724.field2622 = arg0;
        this.field4724.field2610 = 10;
        int var2 = this.field4724.method1220(-7);
        this.field4727 = this.field4724.method1220(111);
        this.field4729 = 500000;
        this.field4732 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4724.method1178(-230315992);
            int var6 = this.field4724.method1178(-230315992);
            if (var5 == 1297379947) {
                this.field4732[var3] = this.field4724.field2610;
                var3++;
            }
            this.field4724.field2610 += var6;
        }
        this.field4728 = 0L;
        this.field4731 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4731[var4] = this.field4732[var4];
        }
        this.field4730 = new int[var2];
        this.field4726 = new int[var2];
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)I", line = 175)
    public final int method2137(int arg0) {
        return this.method2132(arg0);
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "()Z", line = 182)
    public final boolean method2138() {
        int var1 = this.field4731.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4731[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "()V", line = 195)
    public final void method2139() {
        this.field4724.field2610 = -1;
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)J", line = 199)
    public final long method2140(int arg0) {
        return (long) this.field4729 * (long) arg0 + this.field4728;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(J)V", line = 204)
    public final void method2141(long arg0) {
        this.field4728 = arg0;
        int var3 = this.field4731.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4730[var4] = 0;
            this.field4726[var4] = 0;
            this.field4724.field2610 = this.field4732[var4];
            this.method2129(var4);
            this.field4731[var4] = this.field4724.field2610;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)I", line = 228)
    private final int method2142(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4725[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4724.method1177(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4724.method1177(255) << 16;
            }
            return var8;
        }
        int var3 = this.field4724.method1177(255);
        int var4 = this.field4724.method1181(false);
        if (var3 == 47) {
            this.field4724.field2610 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4724.method1180(-832631516);
            var4 -= 3;
            int var6 = this.field4730[arg0];
            this.field4728 += (long) (this.field4729 - var5) * (long) var6;
            this.field4729 = var5;
            this.field4724.field2610 += var4;
            return 2;
        } else {
            this.field4724.field2610 += var4;
            return 3;
        }
    }
}
