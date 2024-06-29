import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class166 {

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Lck;")
    public static class119 field2617 = class298.method1987((byte) 29, ":duelstake:");

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Le;")
    public static class94 field2612 = new class94(0, 0);

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "Lck;")
    public static class119 field2618 = class298.method1987((byte) 73, ")4g");

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Lck;")
    public static class119 field2622 = class298.method1987((byte) 53, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Lck;")
    public static class119 field2620 = class298.method1987((byte) 104, "(U3");

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "[Lbe;")
    public static class81[] field2619;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1046(byte arg0) {
        if (class67.field1045 == null || class237.field3802 == null) {
            class67.field1045 = new int[256];
            class237.field3802 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class67.field1045[var1] = (int) (Math.sin(var2) * 4096.0D);
                class237.field3802[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 < 8) {
            field2622 = (class119) null;
        }
        field2615++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILck;B)Z", line = 39)
    public static final boolean method1047(int arg0, class119 arg1, byte arg2) {
        int var3 = 66 / ((arg2 + 31) / 57);
        field2614++;
        return class203.method1287(16711680, arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)Lve;", line = 48)
    public static final class33 method1048(byte arg0) {
        field2611++;
        class33 var1 = new class33(class227.field3641, class207.field3304, class155.field2475[0], class7.field152[0], class232.field3741[0], class64.field1006[0], class247.field3989[0], class161.field2553);
        if (arg0 > -50) {
            field2621 = 106;
        }
        class162.method1035(-20432);
        return var1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIII)V", line = 64)
    public static final void method1049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2610++;
        int var7 = 0;
        class259.method1656(false, arg4);
        int var8 = arg4 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        if (arg2 != 2) {
            field2619 = (class81[]) null;
        }
        if (class108.field1650 <= arg0 && class236.field3800 >= arg0) {
            int[] var11 = class256.field4113[arg0];
            int var12 = class197.method1264(-113, arg3 - arg4, class79.field1226, class59.field957);
            int var13 = class197.method1264(-107, arg3 + arg4, class79.field1226, class59.field957);
            int var14 = class197.method1264(-107, arg3 - var8, class79.field1226, class59.field957);
            int var15 = class197.method1264(-125, arg3 + var8, class79.field1226, class59.field957);
            class36.method282(var14, var12, arg1, var11, arg2 ^ 0x663D);
            class36.method282(var15, var14, arg6, var11, 26175);
            class36.method282(var13, var15, arg1, var11, 26175);
        }
        int var16 = -1;
        int var17 = var8;
        int var18 = -1;
        int var19 = -var8;
        while (var7 < var9) {
            var16 += 2;
            var19 += var16;
            var18 += 2;
            var10 += var18;
            if (var19 >= 0 && var17 >= 1) {
                var17--;
                class87.field1320[var17] = var7;
                var19 -= var17 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                int var20 = arg0 - var9;
                var10 -= var9 << 1;
                int var21 = arg0 + var9;
                if (var21 >= class108.field1650 && var20 <= class236.field3800) {
                    if (var9 < var8) {
                        int var22 = class87.field1320[var9];
                        int var23 = class197.method1264(-91, arg3 + var7, class79.field1226, class59.field957);
                        int var24 = class197.method1264(arg2 ^ 0xFFFFFF86, arg3 - var7, class79.field1226, class59.field957);
                        int var25 = class197.method1264(-127, arg3 + var22, class79.field1226, class59.field957);
                        int var26 = class197.method1264(arg2 - 119, -var22 + arg3, class79.field1226, class59.field957);
                        if (var21 <= class236.field3800) {
                            int[] var27 = class256.field4113[var21];
                            class36.method282(var26, var24, arg1, var27, arg2 + 26173);
                            class36.method282(var25, var26, arg6, var27, 26175);
                            class36.method282(var23, var25, arg1, var27, 26175);
                        }
                        if (var20 >= class108.field1650) {
                            int[] var28 = class256.field4113[var20];
                            class36.method282(var26, var24, arg1, var28, 26175);
                            class36.method282(var25, var26, arg6, var28, 26175);
                            class36.method282(var23, var25, arg1, var28, 26175);
                        }
                    } else {
                        int var29 = class197.method1264(-97, arg3 + var7, class79.field1226, class59.field957);
                        int var30 = class197.method1264(-111, arg3 - var7, class79.field1226, class59.field957);
                        if (class236.field3800 >= var21) {
                            class36.method282(var29, var30, arg1, class256.field4113[var21], 26175);
                        }
                        if (class108.field1650 <= var20) {
                            class36.method282(var29, var30, arg1, class256.field4113[var20], 26175);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (var32 >= class108.field1650 && var31 <= class236.field3800) {
                int var33 = arg3 + var9;
                int var34 = arg3 - var9;
                if (class79.field1226 <= var33 && class59.field957 >= var34) {
                    int var35 = class197.method1264(arg2 ^ 0xFFFFFF80, var33, class79.field1226, class59.field957);
                    int var36 = class197.method1264(-99, var34, class79.field1226, class59.field957);
                    if (var8 > var7) {
                        int var37 = var7 > var17 ? class87.field1320[var7] : var17;
                        int var38 = class197.method1264(-126, arg3 + var37, class79.field1226, class59.field957);
                        int var39 = class197.method1264(-108, arg3 - var37, class79.field1226, class59.field957);
                        if (var32 <= class236.field3800) {
                            int[] var40 = class256.field4113[var32];
                            class36.method282(var39, var36, arg1, var40, 26175);
                            class36.method282(var38, var39, arg6, var40, 26175);
                            class36.method282(var35, var38, arg1, var40, 26175);
                        }
                        if (class108.field1650 <= var31) {
                            int[] var41 = class256.field4113[var31];
                            class36.method282(var39, var36, arg1, var41, 26175);
                            class36.method282(var38, var39, arg6, var41, 26175);
                            class36.method282(var35, var38, arg1, var41, arg2 ^ 0x663D);
                        }
                    } else {
                        if (class236.field3800 >= var32) {
                            class36.method282(var35, var36, arg1, class256.field4113[var32], arg2 ^ 0x663D);
                        }
                        if (var31 >= class108.field1650) {
                            class36.method282(var35, var36, arg1, class256.field4113[var31], 26175);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)Z", line = 246)
    public static final boolean method1050(int arg0, int arg1) {
        field2616++;
        if (arg1 < 32) {
            return false;
        } else if (arg0 > -119) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 277)
    public static void method1051(int arg0) {
        field2620 = null;
        if (arg0 != 27512) {
            field2618 = (class119) null;
        }
        field2612 = null;
        field2619 = null;
        field2622 = null;
        field2617 = null;
        field2618 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)I", line = 295)
    public static final int method1052(int arg0, int arg1, int arg2) {
        class142 var3 = (class142) class185.field2933.method1329((byte) 90, (long) arg1);
        field2613++;
        if (var3 == null) {
            return 0;
        } else if (~arg0 == arg2) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2270.length; var5++) {
                if (var3.field2265[var5] == arg0) {
                    var4 += var3.field2270[var5];
                }
            }
            return var4;
        }
    }
}
