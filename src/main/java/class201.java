import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class201 extends class102 {

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "Z")
    private boolean field2674 = false;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "Z")
    public boolean field2682 = false;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    private int field2696 = 0;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "Lkr;")
    public class6 field2690;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "Lho;")
    public class359 field2681;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "J")
    private long field2700;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "Lhh;")
    public class182 field2685;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "Lke;")
    public class162 field2697;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "Lnj;")
    public static class228 field2699 = new class228(new byte[5000]);

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "[I")
    public static int[] field2702 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "[I")
    public static int[] field2703 = new int[32];

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field2701 = 0;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "[I")
    public static int[] field2704 = new int[14];

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    private int field2665;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    private int field2668;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    private int field2669;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    private int field2670;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    private int field2671;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    private int field2672;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    private int field2676;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    private int field2677;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    private int field2678;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    private int field2679;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public int field2680;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    private int field2683;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    private int field2687;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    private int field2688;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "I")
    private int field2689;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    private int field2691;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    private int field2698;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public final void method1189(int arg0) {
        field2673++;
        this.field2689 = this.field2681.field5201;
        this.field2683 = this.field2681.field5193;
        this.field2679 = this.field2681.field5187;
        this.field2687 = this.field2681.field5181;
        this.field2678 = this.field2681.field5184;
        this.field2669 = this.field2681.field5190;
        this.field2688 = this.field2681.field5198;
        this.field2698 = this.field2681.field5199;
        this.field2665 = this.field2681.field5197;
        if (this.field2687 == this.field2683 && this.field2698 == this.field2687 && this.field2679 == this.field2678 && this.field2679 == this.field2665 && this.field2689 == this.field2669 && this.field2688 == this.field2669) {
            this.field2674 = true;
            return;
        }
        this.field2674 = false;
        int var2 = (this.field2687 + this.field2683 + this.field2698) / 3;
        int var3 = (this.field2679 + this.field2665 + this.field2678) / 3;
        if (arg0 > -3) {
            return;
        }
        int var4 = (this.field2689 + this.field2669 + this.field2688) / 3;
        if (this.field2675 == var2 && this.field2695 == var3 && this.field2680 == var4) {
            return;
        }
        this.field2680 = var4;
        this.field2675 = var2;
        this.field2695 = var3;
        int var5 = this.field2687 - this.field2683;
        int var6 = this.field2679 - this.field2678;
        int var7 = this.field2669 - this.field2689;
        int var8 = this.field2698 - this.field2683;
        int var9 = this.field2665 - this.field2678;
        int var10 = this.field2688 - this.field2689;
        this.field2671 = var7 * var8 - (var5 * var10);
        this.field2677 = var5 * var9 - (var6 * var8);
        this.field2672 = var6 * var10 - var7 * var9;
        while (this.field2672 > 32767 || this.field2671 > 32767 || this.field2677 > 32767 || this.field2672 < -32767 || this.field2671 < -32767 || this.field2677 < -32767) {
            this.field2671 >>= 0x1;
            this.field2672 >>= 0x1;
            this.field2677 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field2672 * this.field2672 + this.field2671 * this.field2671 + (this.field2677 * this.field2677)));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field2677 = this.field2677 * 32767 / var11;
        this.field2672 = this.field2672 * 32767 / var11;
        this.field2671 = this.field2671 * 32767 / var11;
        if (this.field2685.field2406 <= 0 && this.field2685.field2421 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field2677, (double) this.field2672) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field2671, Math.sqrt((double) (this.field2677 * this.field2677 + this.field2672 * this.field2672))) * 2607.5945876176133D);
        this.field2668 = this.field2685.field2406 - this.field2685.field2472;
        this.field2691 = this.field2685.field2472 + var12 - (this.field2668 >> 1);
        this.field2676 = this.field2685.field2421 - this.field2685.field2427;
        this.field2670 = this.field2685.field2427 + var13 - (this.field2676 >> 1);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V")
    public static final void method1190(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 32767) {
            method1191((byte) 37);
        }
        if (arg3 < arg1) {
            class207.method1221((byte) -125, arg3, arg1, class384.field5560[arg2], arg0);
        } else {
            class207.method1221((byte) -123, arg1, arg3, class384.field5560[arg2], arg0);
        }
        field2692++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static final void method1191(byte arg0) {
        field2686++;
        class189 var1 = class329.field4793;
        synchronized (class329.field4793) {
            class329.field4793.method1141(256);
            if (arg0 != -92) {
                method1191((byte) 93);
            }
        }
        class189 var2 = class211.field2816;
        synchronized (class211.field2816) {
            class211.field2816.method1141(256);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public static void method1192(boolean arg0) {
        field2699 = null;
        field2702 = null;
        field2704 = null;
        if (!arg0) {
            field2699 = null;
        }
        field2703 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IJ)V")
    public final void method1193(int arg0, long arg1) {
        field2693++;
        if (arg0 != 1) {
            method1190(-34, -52, 22, 66, 82);
        }
        for (class443 var4 = (class443) this.field2697.method1005(88); var4 != null; var4 = (class443) this.field2697.method1009(false)) {
            var4.method2790(arg1);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lii;JIZI)V")
    public final void method1194(class405 arg0, long arg1, int arg2, boolean arg3, int arg4) {
        if (this.field2682) {
            arg3 = false;
        } else if (class363.field5247 < this.field2685.field2475) {
            arg3 = false;
        } else if (class112.field1574 > class439.field6441[class363.field5247]) {
            arg3 = false;
        } else if (this.field2674) {
            arg3 = false;
        } else if (this.field2685.field2448 != -1) {
            int var7 = (int) (arg1 - this.field2700);
            if (this.field2685.field2463 || this.field2685.field2448 >= var7) {
                var7 %= this.field2685.field2448;
            } else {
                arg3 = false;
            }
            if (!this.field2685.field2435 && this.field2685.field2450 > var7) {
                arg3 = false;
            }
            if (this.field2685.field2435 && this.field2685.field2450 <= var7) {
                arg3 = false;
            }
        }
        field2666++;
        if (arg3) {
            this.field2696 += (int) (((double) this.field2685.field2464 + (double) (this.field2685.field2417 - this.field2685.field2464) * Math.random()) * (double) arg2);
            if (this.field2696 > 63) {
                int var8 = this.field2696 >> 6;
                this.field2696 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field2685.field2406 <= 0 && this.field2685.field2421 <= 0) {
                        var10 = this.field2677;
                        var11 = this.field2672;
                        var12 = this.field2671;
                    } else {
                        int var13 = (int) ((double) this.field2668 * Math.random()) + this.field2691;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class117.field1644[var14];
                        int var16 = class117.field1636[var14];
                        int var17 = this.field2670 + ((int) (Math.random() * (double) this.field2676));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class117.field1644[var18];
                        var11 = var16 * var19 >> 15;
                        int var20 = class117.field1636[var18];
                        var12 = var20 * -1;
                        var10 = var15 * var19 >> 15;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if (var21 + var22 > 65535) {
                        var21 = 65535 - var21;
                        var22 = 65535 - var22;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field2683 * var21 + (this.field2687 * var22) + (this.field2698 * var23) >> 16;
                    int var25 = this.field2678 * var21 + this.field2665 * var23 + (this.field2679 * var22) >> 16;
                    int var26 = this.field2689 * var21 + (this.field2669 * var22 + (this.field2688 * var23)) >> 16;
                    int var27 = (int) ((double) (this.field2685.field2473 - this.field2685.field2425) * Math.random()) + this.field2685.field2425;
                    int var28 = this.field2685.field2432 + (int) (Math.random() * (double) (this.field2685.field2453 - this.field2685.field2432));
                    int var29 = this.field2685.field2440 + ((int) (Math.random() * (double) (this.field2685.field2466 - this.field2685.field2440)));
                    int var30;
                    if (this.field2685.field2420) {
                        double var31 = Math.random();
                        var30 = (int) ((double) this.field2685.field2415 * var31 + (double) this.field2685.field2458) << 24 | (int) ((double) this.field2685.field2434 * var31 + (double) this.field2685.field2462) | (int) ((double) this.field2685.field2414 * var31 + (double) this.field2685.field2449) << 16 | (int) ((double) this.field2685.field2452 * var31 + (double) this.field2685.field2416) << 8;
                    } else {
                        var30 = (int) (Math.random() * (double) this.field2685.field2415 + (double) this.field2685.field2458) << 24 | (int) ((double) this.field2685.field2462 + (double) this.field2685.field2434 * Math.random()) | (int) ((double) this.field2685.field2414 * Math.random() + (double) this.field2685.field2449) << 16 | (int) ((double) this.field2685.field2452 * Math.random() + (double) this.field2685.field2416) << 8;
                    }
                    int var33 = this.field2685.field2409;
                    if (!arg0.method1770() && !this.field2685.field2410) {
                        var33 = -1;
                    }
                    if (class177.field2344 == class126.field1768) {
                        new class443(this, var24, var25, var26, var11, var12, var10, var27, var28, var30, var29, var33, this.field2685.field2407);
                    } else {
                        class443 var34 = class43.field611[class126.field1768];
                        class126.field1768 = class126.field1768 + 1 & 0x3FF;
                        var34.method2788(this, var24, var25, var26, var11, var12, var10, var27, var28, var30, var29, var33, this.field2685.field2407);
                    }
                }
            }
        }
        if (arg4 != 16383) {
            field2702 = null;
        }
        this.field2684 = 0;
        for (class443 var36 = (class443) this.field2697.method1005(arg4 - 16472); var36 != null; var36 = (class443) this.field2697.method1009(false)) {
            var36.method2789(arg1, arg2);
            this.field2684++;
        }
        class21.field282 += this.field2684;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lii;Lho;Lkr;J)V")
    public class201(class405 arg0, class359 arg1, class6 arg2, long arg3) {
        this.field2690 = arg2;
        this.field2681 = arg1;
        this.field2700 = arg3;
        this.field2685 = class347.method2269(-43, this.field2681.field5183);
        if (!arg0.method1770() && this.field2685.field2429 != -1) {
            this.field2685 = class347.method2269(-108, this.field2685.field2429);
        }
        this.field2697 = new class162();
        this.field2696 = (int) ((double) this.field2696 + Math.random() * 64.0D);
        this.method1189(-102);
    }
}
