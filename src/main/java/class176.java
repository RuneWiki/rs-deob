import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class176 extends class22 {

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field2500 = 1;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "[I")
    public static int[] field2501 = new int[50];

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field2506 = -1;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public int field2503;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Llb;")
    public static class105 field2499;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Ljava/lang/String;")
    public String field2494;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Ljava/lang/String;")
    public String field2495;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lld;IIIIIIZ)V")
    public static final void method1138(class256 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field3704.length;
        for (int var9 = 0; var9 < var8; ++var9) {
            int var22 = arg0.field3704[var9] - class77.field927;
            int var23 = arg0.field3695[var9] - class130.field1878;
            int var24 = arg0.field3701[var9] - class296.field4671;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field3688 != null) {
                class256.field3690[var9] = var25;
                class256.field3697[var9] = var28;
                class256.field3705[var9] = var29;
            }
            class256.field3699[var9] = (var25 << 9) / var29 + class297.field4692;
            class256.field3700[var9] = (var28 << 9) / var29 + class297.field4696;
        }
        class297.field4700 = 0;
        int var10 = arg0.field3698.length;
        for (int var11 = 0; var11 < var10; ++var11) {
            int var12 = arg0.field3698[var11];
            int var13 = arg0.field3686[var11];
            int var14 = arg0.field3703[var11];
            int var15 = class256.field3699[var12];
            int var16 = class256.field3699[var13];
            int var17 = class256.field3699[var14];
            int var18 = class256.field3700[var12];
            int var19 = class256.field3700[var13];
            int var20 = class256.field3700[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class272.field3987 && class269.method1725(class297.field4692 + class166.field2384, class297.field4696 + class172.field2460, var18, var19, var20, var15, var16, var17)) {
                    class251.field3633 = arg5;
                    field2506 = arg6;
                }
                if (!arg7) {
                    class297.field4690 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class297.field4695 || var16 > class297.field4695 || var17 > class297.field4695) {
                        class297.field4690 = true;
                    }
                    if (arg0.field3688 != null && arg0.field3688[var11] != -1) {
                        if (class234.field3375) {
                            if (arg0.field3689) {
                                class297.method1989(var18, var19, var20, var15, var16, var17, arg0.field3696[var11], arg0.field3694[var11], arg0.field3692[var11], class256.field3690[0], class256.field3690[1], class256.field3690[3], class256.field3697[0], class256.field3697[1], class256.field3697[3], class256.field3705[0], class256.field3705[1], class256.field3705[3], arg0.field3688[var11]);
                            } else {
                                class297.method1989(var18, var19, var20, var15, var16, var17, arg0.field3696[var11], arg0.field3694[var11], arg0.field3692[var11], class256.field3690[var12], class256.field3690[var13], class256.field3690[var14], class256.field3697[var12], class256.field3697[var13], class256.field3697[var14], class256.field3705[var12], class256.field3705[var13], class256.field3705[var14], arg0.field3688[var11]);
                            }
                        } else {
                            int var21 = class297.field4685.method776((byte) 11, arg0.field3688[var11]);
                            class297.method1987(var18, var19, var20, var15, var16, var17, class139.method907(var21, arg0.field3696[var11]), class139.method907(var21, arg0.field3694[var11]), class139.method907(var21, arg0.field3692[var11]));
                        }
                    } else if (arg0.field3696[var11] != 12345678) {
                        class297.method1987(var18, var19, var20, var15, var16, var17, arg0.field3696[var11], arg0.field3694[var11], arg0.field3692[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V")
    public static void method1139(int arg0) {
        field2501 = null;
        if (arg0 <= 56) {
            method1138((class256) null, -51, 104, -100, 100, 20, -73, false);
        }
        field2499 = null;
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)[Lwj;")
    public static final class130[] method1140(int arg0) {
        ++field2504;
        class130[] var1 = new class130[class133.field1921];
        for (int var2 = arg0; ~var2 > ~class133.field1921; ++var2) {
            int var3 = class91.field1236[var2] * class296.field4677[var2];
            byte[] var4 = class277.field4210[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; ~var6 > ~var3; ++var6) {
                var5[var6] = class165.field2367[class5.method26(255, var4[var6])];
            }
            var1[var2] = new class187(class238.field3435, class118.field1660, class233.field3367[var2], class273.field4041[var2], class296.field4677[var2], class91.field1236[var2], var5);
        }
        class294.method1965(true);
        return var1;
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)Z")
    public static final boolean method1141(int arg0) {
        ++field2502;
        if (arg0 != 1) {
            method1138((class256) null, -99, 52, 19, -112, 8, -60, true);
        }
        return class269.field3936;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)Lrh;")
    public final class16 method1142(byte arg0) {
        if (arg0 != -25) {
            this.field2494 = null;
        }
        ++field2496;
        return class173.field2481[super.field273];
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IISIILjava/lang/String;Ljava/lang/String;J)V")
    public static final void method1143(int arg0, int arg1, short arg2, int arg3, int arg4, String arg5, String arg6, long arg7) {
        ++field2497;
        if (arg0 != 4) {
            field2506 = -74;
        }
        if (!class177.field2518) {
            if (class112.field1496 < 500) {
                class153.field2217[class112.field1496] = arg6;
                class240.field3482[class112.field1496] = arg5;
                class209.field2944[class112.field1496] = arg4 == -1 ? class241.field3500 : arg4;
                class190.field2749[class112.field1496] = arg2;
                class6.field72[class112.field1496] = arg7;
                class240.field3485[class112.field1496] = arg1;
                class271.field3978[class112.field1496] = arg3;
                ++class112.field1496;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)I")
    public static final int method1144(int arg0, int arg1) {
        ++field2498;
        int var2 = 0;
        if (~arg1 > -1 || arg1 >= 65536) {
            arg1 >>>= 16;
            var2 += 16;
        }
        if (~arg1 <= -257) {
            var2 += 8;
            arg1 >>>= 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 2;
        }
        if (arg0 < 55) {
            return 76;
        } else {
            if (~arg1 <= -2) {
                arg1 >>>= 1;
                ++var2;
            }
            return arg1 + var2;
        }
    }
}
