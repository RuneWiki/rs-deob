import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class173 {

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "Llh;")
    private class364 field2639 = new class364(64);

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Llh;")
    private class364 field2648 = new class364(100);

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "Lhh;")
    private class84 field2647;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "[I")
    public static int[] field2644 = new int[14];

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "[[[I")
    public static int[][][] field2650 = new int[2][][];

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Lko;")
    public static class348 field2646 = new class348();

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field2656 = new String[100];

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "Lns;")
    public static class277 field2651;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "Lf;")
    public static class528 field2654;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "Lf;")
    public static class528 field2655;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2642;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)Lul;", line = 6)
    public final class402 method1232(byte arg0, int arg1) {
        if (arg0 != -46) {
            this.field2639 = null;
        }
        field2653++;
        class364 var3 = this.field2648;
        class402 var4;
        synchronized (this.field2648) {
            var4 = (class402) this.field2648.method2339(-121, (long) arg1);
            if (var4 == null) {
                var4 = new class402(arg1);
                this.field2648.method2342((long) arg1, var4, -98);
            }
        }
        synchronized (var4) {
            return var4.method2497(arg0 - 66) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)Ldn;", line = 35)
    public final class357 method1233(boolean arg0, int arg1) {
        field2643++;
        class364 var3 = this.field2639;
        class357 var4;
        synchronized (this.field2639) {
            var4 = (class357) this.field2639.method2339(-76, (long) arg1);
        }
        if (!arg0) {
            this.method1232((byte) 29, 41);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2647.method683(class296.method1826(arg1, 2), class250.method1592(arg1, 60), 5);
        class357 var6 = new class357();
        var6.field5393 = this;
        var6.field5403 = arg1;
        if (var5 != null) {
            var6.method2302((byte) 23, new class303(var5));
        }
        var6.method2301(14674);
        class364 var7 = this.field2639;
        synchronized (this.field2639) {
            this.field2639.method2342((long) arg1, var6, 101);
            return var6;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)[B", line = 68)
    public static final byte[] method1234(int arg0, byte arg1) {
        field2638++;
        int var2 = -38 / ((-arg1 - 68) / 51);
        class192 var3 = (class192) class301.field4282.method797(50, (long) arg0);
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg0);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class104.method790((byte) 90, var8, var5);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var3 = new class192(var4);
            class301.field4282.method793((byte) -91, var3, (long) arg0);
        }
        return var3.field2811;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 115)
    public static void method1235(int arg0) {
        field2654 = null;
        field2650 = null;
        field2646 = null;
        field2644 = null;
        if (arg0 <= 2) {
            method1240(-93, 109, 77);
        }
        field2655 = null;
        field2642 = null;
        field2651 = null;
        field2656 = null;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 133)
    public final void method1236(int arg0) {
        field2641++;
        class364 var2 = this.field2639;
        synchronized (this.field2639) {
            this.field2639.method2350((byte) 112);
            if (arg0 != -1) {
                field2655 = null;
            }
        }
        class364 var3 = this.field2648;
        synchronized (this.field2648) {
            this.field2648.method2350((byte) 112);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIBI)V", line = 151)
    public static final void method1237(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field2652++;
        class117.method856(arg1, 51);
        int var7 = 0;
        int var8 = arg1 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg4 >= class229.field3347 && class156.field2366 >= arg4) {
            int[] var14 = class436.field6332[arg4];
            int var15 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg3 - arg1);
            int var16 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg1 + arg3);
            int var17 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg3 - var8);
            int var18 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg3 + var8);
            class217.method1448(var14, var15, arg2, 4, var17);
            class217.method1448(var14, var17, arg6, 4, var18);
            class217.method1448(var14, var18, arg2, 4, var16);
        }
        int var19 = -1;
        int var20 = 20 % ((arg5 - 24) / 57);
        while (var7 < var9) {
            var13 += 2;
            var19 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class453.field6716[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var21 = arg4 - var9;
                int var22 = arg4 + var9;
                if (class229.field3347 <= var22 && var21 <= class156.field2366) {
                    if (var8 <= var9) {
                        int var23 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg3 + var7);
                        int var24 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg3 - var7);
                        if (var22 <= class156.field2366) {
                            class217.method1448(class436.field6332[var22], var24, arg2, 4, var23);
                        }
                        if (var21 >= class229.field3347) {
                            class217.method1448(class436.field6332[var21], var24, arg2, 4, var23);
                        }
                    } else {
                        int var25 = class453.field6716[var9];
                        int var26 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg3 + var7);
                        int var27 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg3 - var7);
                        int var28 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg3 + var25);
                        int var29 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg3 - var25);
                        if (var22 <= class156.field2366) {
                            int[] var30 = class436.field6332[var22];
                            class217.method1448(var30, var27, arg2, 4, var29);
                            class217.method1448(var30, var29, arg6, 4, var28);
                            class217.method1448(var30, var28, arg2, 4, var26);
                        }
                        if (var21 >= class229.field3347) {
                            int[] var31 = class436.field6332[var21];
                            class217.method1448(var31, var27, arg2, 4, var29);
                            class217.method1448(var31, var29, arg6, 4, var28);
                            class217.method1448(var31, var28, arg2, 4, var26);
                        }
                    }
                }
            }
            int var32 = arg4 - var7;
            int var33 = arg4 + var7;
            if (var33 >= class229.field3347 && class156.field2366 >= var32) {
                int var34 = arg3 + var9;
                int var35 = arg3 - var9;
                if (class322.field4945 <= var34 && var35 <= class145.field2134) {
                    int var36 = class39.method299(class322.field4945, (byte) -56, class145.field2134, var34);
                    int var37 = class39.method299(class322.field4945, (byte) -56, class145.field2134, var35);
                    if (var7 < var8) {
                        int var38 = var11 < var7 ? class453.field6716[var7] : var11;
                        int var39 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg3 + var38);
                        int var40 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg3 - var38);
                        if (class156.field2366 >= var33) {
                            int[] var41 = class436.field6332[var33];
                            class217.method1448(var41, var37, arg2, 4, var40);
                            class217.method1448(var41, var40, arg6, 4, var39);
                            class217.method1448(var41, var39, arg2, 4, var36);
                        }
                        if (var32 >= class229.field3347) {
                            int[] var42 = class436.field6332[var32];
                            class217.method1448(var42, var37, arg2, 4, var40);
                            class217.method1448(var42, var40, arg6, 4, var39);
                            class217.method1448(var42, var39, arg2, 4, var36);
                        }
                    } else {
                        if (class156.field2366 >= var33) {
                            class217.method1448(class436.field6332[var33], var37, arg2, 4, var36);
                        }
                        if (var32 >= class229.field3347) {
                            class217.method1448(class436.field6332[var32], var37, arg2, 4, var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V", line = 335)
    public final void method1238(int arg0) {
        class364 var2 = this.field2639;
        synchronized (this.field2639) {
            this.field2639.method2349(0);
        }
        field2649++;
        class364 var3 = this.field2648;
        synchronized (this.field2648) {
            int var4 = 25 % ((arg0 + 15) / 58);
            this.field2648.method2349(0);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(BI)V", line = 356)
    public final void method1239(byte arg0, int arg1) {
        class364 var3 = this.field2639;
        synchronized (this.field2639) {
            this.field2639.method2348(arg1, 31);
        }
        field2640++;
        class364 var4 = this.field2648;
        synchronized (this.field2648) {
            this.field2648.method2348(arg1, 21);
        }
        if (arg0 >= -67) {
            field2654 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lmt;ILhh;Lhh;Lhh;)V", line = 400)
    public class173(class271 arg0, int arg1, class84 arg2, class84 arg3, class84 arg4) {
        this.field2647 = arg2;
        if (this.field2647 != null) {
            int var6 = this.field2647.method658((byte) 96) - 1;
            this.field2647.method656((byte) 122, var6);
        }
        class373.method2385(arg4, arg3, 2082);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V", line = 380)
    public static final void method1240(int arg0, int arg1, int arg2) {
        field2645++;
        if (class364.field5474 == 1) {
            class271.method1738(class87.field1473, arg1, -4879, arg0);
        } else if (class364.field5474 == 2) {
            class60.method542(arg1, arg0, 0);
        }
        class364.field5474 = arg2;
        class87.field1473 = null;
    }
}
