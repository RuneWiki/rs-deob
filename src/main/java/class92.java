import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class92 {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1276 = 0;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lo;")
    public static class332 field1274 = new class332("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lsh;")
    public static class472 field1280 = new class472(54, 3);

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "F")
    public static float field1281;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "F")
    public static float field1282;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method710(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class330.field4952; var3++) {
            class27 var4 = class414.field5971[var3];
            if (var4.field353 == 1) {
                int var5 = var4.field340 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field342 * var5 >> 8) + var4.field350;
                    int var7 = (var4.field348 * var5 >> 8) + var4.field337;
                    int var8 = (var4.field339 * var5 >> 8) + var4.field351;
                    int var9 = (var4.field354 * var5 >> 8) + var4.field359;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field353 == 2) {
                int var10 = arg0 - var4.field340;
                if (var10 > 0) {
                    int var11 = (var4.field342 * var10 >> 8) + var4.field350;
                    int var12 = (var4.field348 * var10 >> 8) + var4.field337;
                    int var13 = (var4.field339 * var10 >> 8) + var4.field351;
                    int var14 = (var4.field354 * var10 >> 8) + var4.field359;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field353 == 3) {
                int var15 = var4.field350 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field338 * var15 >> 8) + var4.field340;
                    int var17 = (var4.field344 * var15 >> 8) + var4.field345;
                    int var18 = (var4.field339 * var15 >> 8) + var4.field351;
                    int var19 = (var4.field354 * var15 >> 8) + var4.field359;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field353 == 4) {
                int var20 = arg2 - var4.field350;
                if (var20 > 0) {
                    int var21 = (var4.field338 * var20 >> 8) + var4.field340;
                    int var22 = (var4.field344 * var20 >> 8) + var4.field345;
                    int var23 = (var4.field339 * var20 >> 8) + var4.field351;
                    int var24 = (var4.field354 * var20 >> 8) + var4.field359;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field353 == 5) {
                int var25 = arg1 - var4.field351;
                if (var25 > 0) {
                    int var26 = (var4.field338 * var25 >> 8) + var4.field340;
                    int var27 = (var4.field344 * var25 >> 8) + var4.field345;
                    int var28 = (var4.field342 * var25 >> 8) + var4.field350;
                    int var29 = (var4.field348 * var25 >> 8) + var4.field337;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V", line = 132)
    public static final void method711(byte arg0) {
        field1277++;
        int var1 = 0;
        if (class337.field5038.field3957) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class423.method2495(arg0 ^ 0xFFFFFFD6, var1);
        class206.field3124.method337(var1, -73);
        class23.field309.method2375(var1, -5682);
        if (arg0 != -42) {
            return;
        }
        class448.field6339.method330(var1, 88);
        class322.field4848.method947(false, var1);
        class283.method1815(66, var1);
        class346.method2136(var1, -6768);
        class28.method239(126, var1);
        class129.method898(var1, 0);
        if (class316.field4752 == 10) {
            class144.method987((byte) 29, 28);
        } else if (class316.field4752 == 30) {
            class144.method987((byte) 29, 25);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V", line = 171)
    public static void method712(boolean arg0) {
        field1274 = null;
        if (arg0) {
            field1281 = -1.293977F;
        }
        field1280 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IC)Z", line = 182)
    public static final boolean method713(int arg0, char arg1) {
        if (arg0 != -49) {
            method713(73, '=');
        }
        field1278++;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lsk;IIIILsk;BIII)V", line = 197)
    public static final void method714(class309 arg0, int arg1, int arg2, int arg3, int arg4, class309 arg5, byte arg6, int arg7, int arg8, int arg9) {
        field1279++;
        int var10 = arg5.method1692(127);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class319 var12 = (class319) class19.field246.method2393(-127, (long) var10);
        if (var12 == null) {
            class368[] var13 = class368.method2274(class425.field6075, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class138.field1976.method547(var13[0], true);
            class19.field246.method2395(0, var12, (long) var10);
        }
        class345.method2127(arg0.field4543, (byte) 108, arg2, arg4 >> 1, arg0.field4545, arg7 >> 1, arg0.method1705((byte) 65) * 64, arg8, arg0.field4538, 0);
        int var14 = arg3 + class429.field6114[0] - 18;
        int var15 = arg1 / 4 * 18 + var14;
        int var16 = class429.field6114[1] + arg9 - 16 - 54;
        int var17 = arg1 % 4 * 18 + var16;
        if (arg6 != -104) {
            method710(-88, -70, 93);
        }
        var12.method1958(var15, var17);
        if (arg0 == arg5) {
            class138.field1976.method584((byte) 125, 18, 18, var15 - 1, -256, var17 - 1);
        }
        class97 var18 = class124.method867((byte) 96);
        var18.field1394 = var17;
        var18.field1397 = arg5;
        var18.field1393 = var15;
        var18.field1392 = var17 + 16;
        var18.field1395 = var15 + 16;
        class57.field794.method1597(var18, (byte) -112);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)V", line = 247)
    public static final void method715(boolean arg0) {
        field1275++;
        class223 var1 = null;
        try {
            class397 var2 = class21.field261.method1027(17);
            while (var2.field5822 == 0) {
                class325.method2005(true, 1L);
            }
            if (var2.field5822 == 1) {
                var1 = (class223) var2.field5823;
                class446 var3 = new class446(class64.field873 * 6 + 3);
                var3.method2619((byte) -128, 1);
                var3.method2592(class64.field873, (byte) -96);
                for (int var4 = 0; var4 < class156.field2170.length; var4++) {
                    if (class12.field158[var4]) {
                        var3.method2592(var4, (byte) -99);
                        var3.method2596((byte) 107, class156.field2170[var4]);
                    }
                }
                var1.method1454((byte) 41, var3.field6316, var3.field6315, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method1458((byte) -71);
            }
        } catch (Exception var5) {
        }
        class198.field2990 = class435.method2539(-10659);
        class95.field1349 = arg0;
    }
}
