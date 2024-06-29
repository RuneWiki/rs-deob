import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class199 {

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3170 = "Allocating memory";

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "J")
    public static long field3171 = 0L;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "D")
    public static double field3178 = -1.0D;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public static int field3182 = 50;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "[I")
    public static int[] field3173 = new int[field3182];

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "[I")
    public static int[] field3179 = new int[field3182];

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "[I")
    public static int[] field3180 = new int[field3182];

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "[I")
    public static int[] field3174 = new int[field3182];

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "[I")
    public static int[] field3184 = new int[field3182];

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "[I")
    public static int[] field3188 = new int[field3182];

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field3189 = new String[field3182];

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "[I")
    public static int[] field3187 = new int[field3182];

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "[I")
    public static int[] field3177;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "[Lun;")
    public static class190[] field3186;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method1466(int arg0, byte arg1) {
        field3175++;
        if (!class286.method2022((byte) -33, arg0)) {
            return;
        }
        if (arg1 > -65) {
            field3186 = (class190[]) null;
        }
        class136[] var2 = class269.field4182[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class136 var4 = var2[var3];
            if (var4 != null) {
                var4.field2088 = 0;
                var4.field2130 = 1;
                var4.field2147 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 47)
    public static void method1467(byte arg0) {
        field3174 = null;
        field3180 = null;
        if (arg0 != -104) {
            field3186 = (class190[]) null;
        }
        field3186 = null;
        field3187 = null;
        field3170 = null;
        field3188 = null;
        field3189 = null;
        field3184 = null;
        field3179 = null;
        field3177 = null;
        field3173 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLug;)V", line = 93)
    public static final void method1468(byte arg0, class253 arg1) {
        class47.field621 = class225.method1649(-118, class172.field2839, arg1);
        field3183++;
        class139.field2214 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            int var3 = class297.field4584[var2 + 1] >> 16 & 0xFF;
            float var4 = (float) ((class297.field4584[var2] & 0xFF0000) >> 16);
            int var5 = class297.field4584[var2 + 1] >> 8 & 0xFF;
            float var6 = (float) ((class297.field4584[var2] & 0xFF00) >> 8);
            float var7 = ((float) var3 - var4) / 64.0F;
            float var8 = ((float) var5 - var6) / 64.0F;
            float var9 = (float) (class297.field4584[var2] & 0xFF);
            int var10 = class297.field4584[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var9) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class139.field2214[var2 * 64 + var12] = class214.method1562(class214.method1562((int) var6 << 8, (int) var4 << 16), (int) var9);
                var6 += var8;
                var9 += var11;
                var4 += var7;
            }
        }
        if (arg0 != 28) {
            return;
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class139.field2214[var13] = class297.field4584[3];
        }
        class224.field3556 = new int[32768];
        field3177 = new int[32768];
        class204.method1505((class201) null, (byte) 78);
        class57.field789 = new int[32768];
        class15.field257 = new int[32768];
        class260.field4094 = new class190(128, 254);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([I[IILql;[I)V", line = 167)
    public static final void method1469(int[] arg0, int[] arg1, int arg2, class337 arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg0[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var6 != 0 && arg3.field4705.length > var9; var9++) {
                if ((var6 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg3.field4705[var9] = null;
                    } else {
                        class281 var10 = class295.method2064(arg2 ^ 0x5494, var7);
                        int var11 = var10.field4321;
                        class11 var12 = arg3.field4705[var9];
                        if (var12 != null) {
                            if (var12.field198 == var7) {
                                if (var11 == 0) {
                                    var12 = arg3.field4705[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field200 = var8;
                                    var12.field209 = 1;
                                    var12.field204 = 0;
                                    var12.field199 = 0;
                                    var12.field201 = 0;
                                    class91.method658(var10, true, class146.field2310 == arg3, arg3.field4698, 0, arg3.field4731);
                                } else if (var11 == 2) {
                                    var12.field204 = 0;
                                }
                            } else if (var10.field4338 >= class295.method2064(0, var12.field198).field4338) {
                                var12 = arg3.field4705[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class11 var13 = arg3.field4705[var9] = new class11();
                            var13.field199 = 0;
                            var13.field198 = var7;
                            var13.field204 = 0;
                            var13.field201 = 0;
                            var13.field209 = 1;
                            var13.field200 = var8;
                            class91.method658(var10, true, class146.field2310 == arg3, arg3.field4698, 0, arg3.field4731);
                        }
                    }
                }
                var6 >>>= 0x1;
            }
        }
        field3181++;
        if (arg2 != 21652) {
            method1470(true, (String) null);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 262)
    public static final void method1470(boolean arg0, String arg1) {
        int var2 = class91.method662(0, arg1);
        field3172++;
        if (var2 == -1) {
            return;
        }
        int[] var3 = class136.field2174.method2049(class278.field4290.field4249[var2] & 0x3FFF, class278.field4290.field4249[var2] >> 28 & 0x3, (class278.field4290.field4249[var2] & 0xFFFE461) >> 14, 24540);
        if (arg0) {
            method1471(-87, 72, 122, -88, (byte) 99, -59, 122);
        }
        class25.method242(var3[2], true, var3[1]);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIBII)V", line = 287)
    public static final void method1471(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3185++;
        int var7 = 0;
        class42.method342(-20247, arg0);
        int var8 = arg0 - arg6;
        int var9 = arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class284.field4402[arg3];
        int var16 = 76 % ((64 - arg4) / 57);
        int var17 = arg1 + var8;
        int var18 = arg1 - var8;
        class256.method1853(var15, arg1 - arg0, arg2, var18, 0);
        class256.method1853(var15, var18, arg5, var17, 0);
        class256.method1853(var15, var17, arg2, arg0 + arg1, 0);
        while (var9 > var7) {
            var14 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class105.field1385[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var13 += 2;
            var10 += var13;
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var19 = class284.field4402[arg3 + var9];
                    int[] var20 = class284.field4402[arg3 - var9];
                    int var21 = class105.field1385[var9];
                    int var22 = arg1 + var7;
                    int var23 = arg1 - var7;
                    int var24 = arg1 + var21;
                    int var25 = arg1 - var21;
                    class256.method1853(var19, var23, arg2, var25, 0);
                    class256.method1853(var19, var25, arg5, var24, 0);
                    class256.method1853(var19, var24, arg2, var22, 0);
                    class256.method1853(var20, var23, arg2, var25, 0);
                    class256.method1853(var20, var25, arg5, var24, 0);
                    class256.method1853(var20, var24, arg2, var22, 0);
                } else {
                    int var26 = arg1 + var7;
                    int[] var27 = class284.field4402[arg3 - var9];
                    int var28 = arg1 - var7;
                    int[] var29 = class284.field4402[arg3 + var9];
                    class256.method1853(var29, var28, arg2, var26, 0);
                    class256.method1853(var27, var28, arg2, var26, 0);
                }
            }
            int[] var30 = class284.field4402[arg3 - var7];
            int[] var31 = class284.field4402[arg3 + var7];
            int var32 = arg1 + var9;
            int var33 = arg1 - var9;
            if (var7 < var8) {
                int var34 = var11 >= var7 ? var11 : class105.field1385[var7];
                int var35 = arg1 + var34;
                int var36 = arg1 - var34;
                class256.method1853(var31, var33, arg2, var36, 0);
                class256.method1853(var31, var36, arg5, var35, 0);
                class256.method1853(var31, var35, arg2, var32, 0);
                class256.method1853(var30, var33, arg2, var36, 0);
                class256.method1853(var30, var36, arg5, var35, 0);
                class256.method1853(var30, var35, arg2, var32, 0);
            } else {
                class256.method1853(var31, var33, arg2, var32, 0);
                class256.method1853(var30, var33, arg2, var32, 0);
            }
        }
    }
}
