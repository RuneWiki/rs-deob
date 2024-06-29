import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class30 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Z")
    public static boolean field662 = false;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field667 = 0;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field663 = -1;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Lmh;")
    public static class128 field669 = class22.method156(126, "Angreifen");

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Lmh;")
    public static class128 field673 = class22.method156(123, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "Lmh;")
    public static class128 field675 = class22.method156(126, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lbg;")
    public static class194 field671 = new class194(new byte[5000]);

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field678 = 5063219;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "S")
    public static short field680 = 32767;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "Lmh;")
    public static class128 field679 = class22.method156(127, " <col=ffffff>");

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field681 = -1;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "F")
    public static float field668;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "Ldj;")
    public static class314 field676;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "[Lvi;")
    public static class5[] field677;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Lmh;", line = 6)
    public static final class128 method217(int arg0, int arg1) {
        field672++;
        return arg0 > arg1 ? class257.method1811(arg1, (byte) -115) : class104.field1784;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZB)V", line = 45)
    public static final void method218(boolean arg0, byte arg1) {
        class3 var2 = (class3) class232.field4006.method2024(0);
        if (arg1 != -42) {
            method221(-24, -79, -30, -113, -27, 52, 12, 0, -30, -116);
        }
        while (var2 != null) {
            if (var2.field52 != null) {
                class188.field3260.method393(var2.field52);
                var2.field52 = null;
            }
            if (var2.field47 != null) {
                class188.field3260.method393(var2.field47);
                var2.field47 = null;
            }
            var2.method1978((byte) -108);
            var2 = (class3) class232.field4006.method2027(1211754408);
        }
        if (arg0) {
            for (class3 var3 = (class3) class63.field1195.method2024(0); var3 != null; var3 = (class3) class63.field1195.method2027(1211754408)) {
                if (var3.field52 != null) {
                    class188.field3260.method393(var3.field52);
                    var3.field52 = null;
                }
                var3.method1978((byte) -98);
            }
            for (class3 var4 = (class3) class203.field3585.method729(-119); var4 != null; var4 = (class3) class203.field3585.method732(1)) {
                if (var4.field52 != null) {
                    class188.field3260.method393(var4.field52);
                    var4.field52 = null;
                }
                var4.method1978((byte) -102);
            }
        }
        field666++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 111)
    public static final void method219(byte arg0) {
        field674++;
        if (class290.method1997(16745) != 2) {
            return;
        }
        byte var1 = (byte) (class167.field2873 - 4 & 0xFF);
        if (arg0 < 40) {
            method217(35, -86);
        }
        int var2 = class167.field2873 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class31.field684[var3][var2][var4] = var1;
            }
        }
        if (class133.field2315 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class151.field2608[var5] = -1000000;
            class248.field4276[var5] = 1000000;
            class236.field4046[var5] = 0;
            class242.field4143[var5] = 1000000;
            class117.field1981[var5] = 0;
        }
        if (class1.field21 != 1) {
            int var6 = class64.method427(class142.field2436, class143.field2445, class133.field2315, (byte) 105);
            if ((var6 - class187.field3249) < 800 && (class301.field5117[class133.field2315][class142.field2436 >> 7][class143.field2445 >> 7] & 0x4) != 0) {
                class226.method1554(-1, class182.field3184, class143.field2445 >> 7, class142.field2436 >> 7, 1, false);
            }
            return;
        }
        if ((class301.field5117[class133.field2315][class163.field2796.field478 >> 7][class163.field2796.field418 >> 7] & 0x4) != 0) {
            class226.method1554(-1, class182.field3184, class163.field2796.field418 >> 7, class163.field2796.field478 >> 7, 0, false);
        }
        if (class311.field5271 >= 310) {
            return;
        }
        int var7 = class142.field2436 >> 7;
        int var8 = class163.field2796.field478 >> 7;
        int var9 = class143.field2445 >> 7;
        int var10;
        if (var8 > var7) {
            var10 = var8 - var7;
        } else {
            var10 = var7 - var8;
        }
        int var11 = class163.field2796.field418 >> 7;
        int var12;
        if (var9 < var11) {
            var12 = var11 - var9;
        } else {
            var12 = var9 - var11;
        }
        if (var12 >= var10) {
            int var15 = 32768;
            int var16 = var10 * 65536 / var12;
            while (var9 != var11) {
                if (var9 < var11) {
                    var9++;
                } else if (var9 > var11) {
                    var9--;
                }
                if ((class301.field5117[class133.field2315][var7][var9] & 0x4) != 0) {
                    class226.method1554(-1, class182.field3184, var9, var7, 1, false);
                    break;
                }
                var15 += var16;
                if (var15 >= 65536) {
                    if (var8 > var7) {
                        var7++;
                    } else if (var7 > var8) {
                        var7--;
                    }
                    var15 -= 65536;
                    if ((class301.field5117[class133.field2315][var7][var9] & 0x4) != 0) {
                        class226.method1554(-1, class182.field3184, var9, var7, 1, false);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var12 * 65536 / var10;
        int var14 = 32768;
        while (var7 != var8) {
            if (var8 > var7) {
                var7++;
            } else if (var7 > var8) {
                var7--;
            }
            if ((class301.field5117[class133.field2315][var7][var9] & 0x4) != 0) {
                class226.method1554(-1, class182.field3184, var9, var7, 1, false);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var9 < var11) {
                    var9++;
                } else if (var11 < var9) {
                    var9--;
                }
                var14 -= 65536;
                if ((class301.field5117[class133.field2315][var7][var9] & 0x4) != 0) {
                    class226.method1554(-1, class182.field3184, var9, var7, 1, false);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(JIII)Z", line = 303)
    public static final boolean method220(long arg0, int arg1, int arg2, int arg3) {
        field670++;
        int var5 = (int) arg0 >> 20 & 0x3;
        int var6 = ((int) arg0 & 0x7FD76) >> 14;
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (arg1 != 23561) {
            method217(-38, -69);
        }
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class38 var8 = class239.method1629((byte) 113, var7);
            int var9 = var8.field816;
            int var10;
            int var11;
            if (var5 == 0 || var5 == 2) {
                var11 = var8.field778;
                var10 = var8.field758;
            } else {
                var10 = var8.field778;
                var11 = var8.field758;
            }
            if (var5 != 0) {
                var9 = (var9 << var5 & 0xF) + (var9 >> 4 - var5);
            }
            class11.method87(var11, 0, 2, var10, class163.field2796.field422[0], arg3, 0, class163.field2796.field450[0], arg2, 0, var9, true);
        } else {
            class11.method87(0, var6 + 1, 2, 0, class163.field2796.field422[0], arg3, 0, class163.field2796.field450[0], arg2, var5, 0, true);
        }
        class148.field2549 = 0;
        class240.field4097 = class45.field915;
        class34.field727 = 2;
        class97.field1685 = class241.field4129;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIIIIII)V", line = 354)
    public static final void method221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg3 && arg0 == arg6 && arg2 == arg5 && arg7 == arg8) {
            class153.method1016(arg6, arg3, arg4, arg2, false, arg8);
        } else {
            int var10 = arg3;
            int var11 = arg6;
            int var12 = arg3 * 3;
            int var13 = arg6 * 3;
            int var14 = arg0 * 3;
            int var15 = arg1 * 3;
            int var16 = arg5 * 3;
            int var17 = arg7 * 3;
            int var18 = arg2 + var15 - var16 - arg3;
            int var19 = var14 + arg8 - var17 - arg6;
            int var20 = var17 + var13 - var14 - var14;
            int var21 = var15 - var12;
            int var22 = var14 - var13;
            int var23 = var12 + var16 - var15 - var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var23 * var25;
                int var29 = var21 * var24;
                int var30 = var20 * var25;
                int var31 = var22 * var24;
                int var32 = (var28 + var29 + var27 >> 12) + arg3;
                int var33 = var19 * var26;
                int var34 = (var31 + var33 + var30 >> 12) + arg6;
                class153.method1016(var11, var10, arg4, var32, false, var34);
                var10 = var32;
                var11 = var34;
            }
        }
        if (arg9 >= 96) {
            field664++;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 447)
    public static void method222(int arg0) {
        field677 = null;
        field669 = null;
        field675 = null;
        if (arg0 != 21737) {
            method217(100, -126);
        }
        field679 = null;
        field671 = null;
        field676 = null;
        field673 = null;
    }
}
