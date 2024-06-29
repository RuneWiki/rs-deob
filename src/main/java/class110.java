import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class110 extends class187 {

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Ldm;")
    public static class109 field1351 = new class109();

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "Ljava/lang/String;")
    public static String field1359 = "red:";

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public static int field1358 = -1;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field1357 = 0;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "[I")
    public static int[] field1355;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "[I")
    public static int[] field1363;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)Ltl;", line = 3)
    public static final class98 method579(int arg0) {
        field1349++;
        if (arg0 != 300) {
            method583((byte) 29, (class322) null, (class298) null, -6, 13, 64, false);
        }
        try {
            return (class98) Class.forName("lc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)Lvp;", line = 21)
    public static final class193 method580(int arg0, boolean arg1) {
        field1354++;
        class193 var2 = (class193) class68.field708.method222((long) arg0, -8407);
        if (!arg1) {
            field1359 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class92.field1062.method1687(arg0, 11, 255);
        class193 var4 = new class193();
        if (var3 != null) {
            var4.method1034(new class250(var3), -1);
        }
        class68.field708.method218((long) arg0, (byte) -121, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIBI)I", line = 45)
    public static final int method581(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1356++;
        int var5 = 65536 - class356.field5025[arg4 * 8192 / arg0] >> 1;
        return arg3 == -90 ? ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16) : -83;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILvm;Lir;Lnj;)V", line = 59)
    public static final void method582(int arg0, class322 arg1, class216 arg2, class228 arg3) {
        field1350++;
        class20 var4 = arg3.method1237((byte) 107, arg1);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method97();
        if (var4.method105() > var5) {
            var5 = var4.method105();
        }
        byte var6 = 10;
        int var7 = arg2.field2895;
        int var8 = arg2.field2907;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field3123 != null) {
            var9 = class207.field2798.method2522(arg3.field3123, (class20[]) null, (int[]) null, 31, class367.field5143);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class367.field5143[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class216.field2909.method323(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = var9 * class216.field2909.method325() + (class216.field2909.method322() / 2);
        }
        int var15 = var5 / 2 + arg2.field2895;
        if (var7 < class443.field6475 + var5) {
            var7 = class443.field6475;
            var15 = var5 / 2 + var6 + (var10 / 2) + class443.field6475 + 5;
        } else if (class443.field6459 - var5 < var7) {
            var15 = class443.field6459 - (var5 / 2) - var6 - (var10 / 2) - 5;
            var7 = class443.field6459 - var5;
        }
        int var16 = arg2.field2907;
        if (var8 < class443.field6470 + var5) {
            var16 = class443.field6470 + var6 + (var5 / 2);
            var8 = class443.field6470;
        } else if (var8 > class443.field6460 - var5) {
            var8 = class443.field6460 - var5;
            var16 = class443.field6460 - (var5 / 2) - var11 - var6;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg2.field2895), (double) (var8 - arg2.field2907)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method103((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field3123 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = var16 + class216.field2909.method325() * var9 + 3;
            var20 = var10 + var18 + 10;
            if (arg3.field3146 != 0) {
                arg1.method1860(var16, -3272, var20 - var18, var18, var21 - var16, arg3.field3146);
            }
            if (arg3.field3127 != 0) {
                arg1.method1862(var21 - var16, var20 - var18, var18, var16, (byte) 3, arg3.field3127);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class367.field5143[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class216.field2909.method328(arg1, var23, var15, var16, arg3.field3141, true);
                var16 += class216.field2909.method325();
            }
        }
        if (arg0 != 2525) {
            field1363 = null;
        }
        int var24 = var5 >> 1;
        if (var7 - var24 >= class337.field4493 || var7 + var24 <= class337.field4493 || (var8 - var24) >= class306.field4146 || var8 + var24 <= class306.field4146 && var18 >= class337.field4493 || class337.field4493 >= var20 || var19 >= class306.field4146 || class306.field4146 >= var21) {
            return;
        }
        if (arg3.field3154[4] != null) {
            class380.method2342(0, arg3.field3152, (byte) -123, (long) arg2.field2903, -1, arg3.field3154[4], 0, 1005);
        }
        if (arg3.field3154[3] != null) {
            class380.method2342(0, arg3.field3152, (byte) -95, (long) arg2.field2903, -1, arg3.field3154[3], 0, 1008);
        }
        if (arg3.field3154[2] != null) {
            class380.method2342(0, arg3.field3152, (byte) -100, (long) arg2.field2903, -1, arg3.field3154[2], 0, 1004);
        }
        if (arg3.field3154[1] != null) {
            class380.method2342(0, arg3.field3152, (byte) -107, (long) arg2.field2903, -1, arg3.field3154[1], 0, 1012);
        }
        if (arg3.field3154[0] != null) {
            class380.method2342(0, arg3.field3152, (byte) -127, (long) arg2.field2903, -1, arg3.field3154[0], 0, 1009);
            return;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLvm;Lwm;IIIZ)V", line = 221)
    public static final void method583(byte arg0, class322 arg1, class298 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1352++;
        if (arg6) {
            class289.field3932.method93((class333.field4423 - class289.field3932.method101()) / 2, (class337.field4496 - class289.field3932.method109()) / 2);
            class307.field4156.method93((class333.field4423 - class307.field4156.method101()) / 2, 18);
        }
        arg2.method1766(552, class62.field636 == 1 ? class386.field5500 : class181.field2278, class333.field4423 / 2, arg4, -1, class337.field4496 / 2 - 26);
        int var7 = class337.field4496 / 2 - 18;
        int var8 = -92 % ((88 - arg0) / 32);
        arg1.method1575(class333.field4423 / 2 - 152, var7, 304, 34, arg3, 0);
        arg1.method1575(class333.field4423 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg1.method1614(class333.field4423 / 2 - 150, var7 + 2, class36.field375 * 3, 30, arg5, 0);
        arg1.method1614(class36.field375 * 3 + class333.field4423 / 2 - 150, var7 + 2, 300 - (class36.field375 * 3), 30, 0, 0);
        arg2.method1766(552, class200.field2686, class333.field4423 / 2, arg4, -1, class337.field4496 / 2 + 4);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(ZI)I", line = 246)
    public static final int method584(boolean arg0, int arg1) {
        field1353++;
        if (!arg0) {
            method584(false, 112);
        }
        if (class264.field3605 != null) {
            class264.field3605.method1538((byte) 5);
            class264.field3605 = null;
        }
        class165.field2101++;
        if (class165.field2101 > 4) {
            class165.field2101 = 0;
            class264.field3607 = 0;
            return arg1;
        }
        class264.field3607 = 0;
        if (class40.field404 == class275.field3729) {
            class40.field404 = class449.field6518;
        } else {
            class40.field404 = class275.field3729;
        }
        return -1;
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V", line = 288)
    public static void method585(int arg0) {
        field1363 = null;
        field1355 = null;
        if (arg0 != 1) {
            method581(-35, 28, -110, (byte) -58, -77);
        }
        field1351 = null;
        field1359 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([I[I[ILc;Z)V", line = 303)
    public static final void method586(int[] arg0, int[] arg1, int[] arg2, class158 arg3, boolean arg4) {
        field1362++;
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg3.field6051.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field6051[var9] = null;
                    } else {
                        class208 var10 = class193.method1037(64, var6);
                        int var11 = var10.field2806;
                        class395 var12 = arg3.field6051[var9];
                        if (var12 != null) {
                            if (var12.field5685 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field6051[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5680 = 0;
                                    var12.field5691 = 0;
                                    var12.field5681 = var8;
                                    var12.field5683 = 1;
                                    var12.field5684 = 0;
                                    class320.method1848(class427.field6264 == arg3, 101, var10, 0, arg3.field152, arg3.field154);
                                } else if (var11 == 2) {
                                    var12.field5680 = 0;
                                }
                            } else if (var10.field2819 >= class193.method1037(30, var12.field5685).field2819) {
                                var12 = arg3.field6051[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class395 var13 = arg3.field6051[var9] = new class395();
                            var13.field5691 = 0;
                            var13.field5685 = var6;
                            var13.field5681 = var8;
                            var13.field5680 = 0;
                            var13.field5684 = 0;
                            var13.field5683 = 1;
                            class320.method1848(class427.field6264 == arg3, 62, var10, 0, arg3.field152, arg3.field154);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg4) {
            method579(-86);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)Z")
    public abstract boolean method569(boolean arg0);

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method568(int arg0);
}
