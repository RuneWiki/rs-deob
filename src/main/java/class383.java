import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class383 extends class194 {

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "Z")
    public static boolean field5241 = false;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "Lcq;")
    public static class72 field5238 = new class72("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field5246 = 1;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field5248 = 0;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "Lhq;")
    public static class365 field5247 = new class365(50);

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "Ljm;")
    public static class184 field5250;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "Lod;")
    public static class399 field5239;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "[Lc;")
    public static class436[] field5249;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lwo;I)V", line = 3)
    public static final void method2385(class285 arg0, int arg1) {
        int var2 = -103 % ((-44 - arg1) / 59);
        class382.field5227 = arg0;
        ++field5245;
    }

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)V", line = 17)
    public static void method2386(int arg0) {
        field5250 = null;
        field5238 = null;
        if (arg0 == -14587) {
            field5249 = null;
            field5239 = null;
            field5247 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "(I)V", line = 34)
    public static final void method2387(int arg0) {
        ++field5243;
        if (class214.field2645) {
            class104.field1221 = null;
            class347.field4724 = null;
            if (arg0 < 74) {
                method2388((class366[]) null, -65, (class118) null, (class279) null, false, -55);
            }
            class214.field2645 = false;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 51)
    public class383() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([Lg;ILuo;Lip;ZI)V", line = 56)
    public static final void method2388(class366[] arg0, int arg1, class118 arg2, class279 arg3, boolean arg4, int arg5) {
        if (!arg4) {
            for (int var6 = 0; ~var6 > -5; ++var6) {
                for (int var7 = 0; class22.field232 > var7; ++var7) {
                    for (int var8 = 0; class196.field2329 > var8; ++var8) {
                        if (~(1 & class222.field2770[var6][var7][var8]) != -1) {
                            int var9 = var6;
                            if ((2 & class222.field2770[1][var7][var8]) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg0[var9].method2304(var8, -104, var7);
                            }
                        }
                    }
                }
            }
        }
        ++field5240;
        int var10 = -119 % ((62 - arg5) / 36);
        int[][] var11 = new int[class22.field232][class196.field2329];
        for (int var12 = 0; ~var12 > ~arg1; ++var12) {
            for (int var14 = 0; var14 < class196.field2329; ++var14) {
                class23.field250[var14] = 0;
                class420.field5730[var14] = 0;
                class281.field3671[var14] = 0;
                class225.field2838[var14] = 0;
                class307.field4176[var14] = 0;
            }
            for (int var15 = -5; ~var15 > ~class22.field232; ++var15) {
                for (int var16 = 0; var16 < class196.field2329; ++var16) {
                    int var25 = var15 + 5;
                    int var10002;
                    if (~class22.field232 < ~var25) {
                        int var26 = 255 & class168.field1959[var12][var25][var16];
                        if (~var26 < -1) {
                            class214 var27 = class75.method447(var26 + -1, (byte) 81);
                            class23.field250[var16] += var27.field2649;
                            class420.field5730[var16] += var27.field2651;
                            class281.field3671[var16] += var27.field2650;
                            class225.field2838[var16] += var27.field2640;
                            var10002 = class307.field4176[var16]++;
                        }
                    }
                    int var28 = var15 + -5;
                    if (~var28 <= -1) {
                        int var29 = 255 & class168.field1959[var12][var28][var16];
                        if (var29 > 0) {
                            class214 var30 = class75.method447(var29 + -1, (byte) 81);
                            class23.field250[var16] -= var30.field2649;
                            class420.field5730[var16] -= var30.field2651;
                            class281.field3671[var16] -= var30.field2650;
                            class225.field2838[var16] -= var30.field2640;
                            var10002 = class307.field4176[var16]--;
                        }
                    }
                }
                if (~var15 <= -1) {
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    int var21 = 0;
                    for (int var22 = -5; ~var22 > ~class196.field2329; ++var22) {
                        int var23 = var22 + 5;
                        if (~class196.field2329 < ~var23) {
                            var18 += class420.field5730[var23];
                            var20 += class225.field2838[var23];
                            var17 += class23.field250[var23];
                            var21 += class307.field4176[var23];
                            var19 += class281.field3671[var23];
                        }
                        int var24 = var22 - 5;
                        if (var24 >= 0) {
                            var17 -= class23.field250[var24];
                            var20 -= class225.field2838[var24];
                            var18 -= class420.field5730[var24];
                            var19 -= class281.field3671[var24];
                            var21 -= class307.field4176[var24];
                        }
                        if (var22 >= 0 && ~var20 < -1 && ~var21 < -1) {
                            var11[var15][var22] = class362.method2276(var17 * 256 / var20, var19 / var21, 28896, var18 / var21);
                        }
                    }
                }
            }
            class422.method2588(var12, class168.field1959[var12], arg3, class196.field2329, class419.field5719[var12], arg2, class102.field1186[var12], arg4, class22.field232, class136.field1546[var12], var11, class304.field4096[var12], 0);
            class168.field1959[var12] = null;
            class102.field1186[var12] = null;
            class419.field5719[var12] = null;
            class136.field1546[var12] = null;
        }
        if (!arg4) {
            if (class252.field3298) {
                class345.method2195();
            }
            if (class333.field4548 != 0) {
                class422.method2585();
            }
        }
        for (int var13 = 0; arg1 > var13; ++var13) {
            class304.field4096[var13].method1053();
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V", line = 266)
    public static final void method2389(byte arg0) {
        class184.field2133 = 0;
        class90.field1043 = -1;
        class68.field818 = -1;
        ++field5242;
        class249.field3276 = -1;
        if (arg0 != 68) {
            method2386(-34);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I", line = 283)
    public final int[] method55(int arg0, int arg1) {
        ++field5244;
        int[] var3 = super.field2292.method1781(arg0, false);
        int var4 = -80 % ((arg1 - 57) / 46);
        if (super.field2292.field3708) {
            int[][] var5 = this.method1200(60, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            for (int var9 = 0; class138.field1579 > var9; ++var9) {
                var3[var9] = (var6[var9] - -var7[var9] + var8[var9]) / 3;
            }
        }
        return var3;
    }
}
