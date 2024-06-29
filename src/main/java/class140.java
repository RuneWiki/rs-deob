import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class140 extends class313 {

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    private int field2574 = 0;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    private int field2581 = 0;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    private int field2564 = 0;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "[Ldd;")
    public static class272[] field2578 = new class272[29];

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field2569 = 0;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    private int field2567;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    private int field2571;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    private int field2572;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    private int field2573;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    private int field2579;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    private int field2580;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IIII)V", line = 5)
    private final void method1137(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 > arg1 ? arg3 : arg1;
        field2565++;
        int var6 = var5 < arg2 ? arg2 : var5;
        int var7 = arg1 > arg3 ? arg3 : arg1;
        if (arg0 > -96) {
            method1140((Throwable) null, (String) null);
        }
        int var8 = arg2 < var7 ? arg2 : var7;
        int var9 = var6 - var8;
        if (var9 > 0) {
            int var10 = (var6 - arg3 << 12) / var9;
            int var11 = (var6 - arg2 << 12) / var9;
            int var12 = (var6 - arg1 << 12) / var9;
            if (arg3 == var6) {
                this.field2571 = arg1 == var8 ? var11 + 20480 : -var12 + 4096;
            } else if (arg1 == var6) {
                this.field2571 = arg2 == var8 ? var10 + 4096 : -var11 + 12288;
            } else {
                this.field2571 = arg3 == var8 ? var12 + 12288 : 20480 - var10;
            }
            this.field2571 /= 6;
        } else {
            this.field2571 = 0;
        }
        this.field2572 = (var6 + var8) / 2;
        if (this.field2572 > 0 && this.field2572 < 4096) {
            this.field2579 = (var9 << 12) / (this.field2572 <= 2048 ? this.field2572 * 2 : 8192 - (this.field2572 * 2));
        } else {
            this.field2579 = 0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[[I", line = 64)
    public final int[][] method299(int arg0, int arg1) {
        int[][] var3 = this.field4958.method2404(arg0, (byte) 117);
        if (this.field4958.field5463) {
            int[][] var4 = this.method2161(0, 4, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class133.field2269; var11++) {
                this.method1137(-117, var9[var11], var6[var11], var5[var11]);
                this.field2572 += this.field2564;
                for (this.field2571 += this.field2574; this.field2571 < 0; this.field2571 += 4096) {
                }
                while (this.field2571 > 4096) {
                    this.field2571 -= 4096;
                }
                if (this.field2572 < 0) {
                    this.field2572 = 0;
                }
                if (this.field2572 > 4096) {
                    this.field2572 = 4096;
                }
                this.field2579 += this.field2581;
                if (this.field2579 < 0) {
                    this.field2579 = 0;
                }
                if (this.field2579 > 4096) {
                    this.field2579 = 4096;
                }
                this.method1139(this.field2571, this.field2572, -1, this.field2579);
                var7[var11] = this.field2580;
                var8[var11] = this.field2573;
                var10[var11] = this.field2567;
            }
        }
        if (arg1 == 2) {
            field2570++;
            return var3;
        } else {
            return (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 135)
    public class140() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)V", line = 144)
    public static void method1138(boolean arg0) {
        if (!arg0) {
            field2566 = 18;
        }
        field2578 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILpi;)V", line = 158)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg1 != -17848) {
            return;
        }
        if (arg0 == 0) {
            this.field2574 = arg2.method2326(56);
        } else if (arg0 == 1) {
            this.field2581 = (arg2.method2323(111) << 12) / 100;
        } else if (arg0 == 2) {
            this.field2564 = (arg2.method2323(-98) << 12) / 100;
        }
        field2577++;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(IIII)V", line = 202)
    private final void method1139(int arg0, int arg1, int arg2, int arg3) {
        field2576++;
        int var5 = arg1 <= 2048 ? (arg3 + 4096) * arg1 >> 12 : arg3 + arg1 - (arg1 * arg3 >> 12);
        if (arg2 <= ~var5) {
            this.field2580 = this.field2573 = this.field2567 = arg1;
            return;
        }
        int var6 = arg1 + arg1 - var5;
        int var7 = arg0 * 6;
        int var8 = (var5 - var6 << 12) / var5;
        int var10 = var8 * var5 >> 12;
        int var11 = var7 >> 12;
        int var12 = var7 - (var11 << 12);
        int var13 = var10 * var12 >> 12;
        int var14 = var5 - var13;
        int var15 = var6 + var13;
        if (var11 == 0) {
            this.field2580 = var5;
            this.field2567 = var6;
            this.field2573 = var15;
        } else if (var11 == 1) {
            this.field2567 = var6;
            this.field2573 = var5;
            this.field2580 = var14;
        } else if (var11 == 2) {
            this.field2573 = var5;
            this.field2567 = var15;
            this.field2580 = var6;
        } else if (var11 == 3) {
            this.field2573 = var14;
            this.field2580 = var6;
            this.field2567 = var5;
        } else if (var11 == 4) {
            this.field2567 = var5;
            this.field2580 = var15;
            this.field2573 = var6;
        } else if (var11 == 5) {
            this.field2567 = var14;
            this.field2573 = var6;
            this.field2580 = var5;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lcj;", line = 321)
    public static final class344 method1140(Throwable arg0, String arg1) {
        class344 var2;
        if ((arg0 instanceof class344)) {
            var2 = (class344) arg0;
            var2.field5480 = var2.field5480 + ' ' + arg1;
        } else {
            var2 = new class344(arg0, arg1);
        }
        field2575++;
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)V", line = 348)
    public static final void method1141(int arg0, int arg1) {
        if (arg1 == 4096) {
            field2568++;
            class200.field3405.method469(-11815, arg0);
            class262.field4247.method469(arg1 ^ 0xFFFFC1D9, arg0);
            class253.field4069.method469(-11815, arg0);
        }
    }
}
