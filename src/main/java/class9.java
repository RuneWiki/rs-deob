import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class9 {

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field318 = 1;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[I")
    public static int[] field314 = new int[100];

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field323 = 127;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "La;")
    public static class1 field319 = class113.method934(-11538, "backvmid3");

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "La;")
    private static class1 field325 = class113.method934(-11538, "red:");

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "La;")
    public static class1 field326 = class113.method934(-11538, "mapmarker");

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field331 = 3;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field322 = 0;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "La;")
    public static class1 field329 = class113.method934(-11538, " )2> @lre@");

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "La;")
    private static class1 field333 = class113.method934(-11538, "Please contact customer support)3");

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "La;")
    public static class1 field316 = field333;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "La;")
    public static class1 field327 = field325;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lhc;")
    public static class45 field312;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "[I")
    public static int[] field321;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIII[B[Lad;)V", line = 8)
    public static final void method187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, class5[] arg9) {
        if (arg1 != 13941) {
            method187(53, -59, 8, -121, -68, -3, -42, -91, null, null);
        }
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg5 + var10 > 0 && arg5 + var10 < 103 && arg0 + var15 > 0 && arg0 + var15 < 103) {
                    arg9[arg4].field202[arg5 + var10][arg0 + var15] = class132.method1034(arg9[arg4].field202[arg5 + var10][arg0 + var15], -16777217);
                }
            }
        }
        field320++;
        class8 var11 = new class8(arg8);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg3 == var12 && var13 >= arg2 && arg2 + 8 > var13 && var14 >= arg6 && arg6 + 8 > var14) {
                        class98.method844(arg5 + class50.method521(arg7, false, var13 & 0x7, var14 & 0x7), arg7, var11, arg1 ^ 0xFFFFC9C1, arg0 + class72.method680(var13 & 0x7, var14 & 0x7, arg7, false), 0, 0, arg4);
                    } else {
                        class98.method844(-1, 0, var11, -116, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 75)
    public static void method188(byte arg0) {
        field319 = null;
        if (arg0 != -94) {
            return;
        }
        field327 = null;
        field325 = null;
        field329 = null;
        field314 = null;
        field312 = null;
        field326 = null;
        field316 = null;
        field333 = null;
        field321 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 111)
    public static final void method189(int arg0) {
        class128.method1015(arg0 + 29378, class42.field1144);
        field328++;
        if (~class76.field1884 != arg0) {
            class128.method1015(arg0 + 29378, class76.field1884);
        }
        field322 = 0;
        class4.field188.method1057((byte) 90);
        class2.field93 = class27.method363(class2.field93);
        class111.method923();
        class46.method480(0, class42.field1144, 503, (byte) -5, 0, 0, 765);
        if (class76.field1884 != -1) {
            class46.method480(0, class76.field1884, 503, (byte) -5, 0, 0, 765);
        }
        if (class6.field225) {
            class46.method485(-1);
        } else {
            class86.method760(false);
            class32.method392(4);
        }
        try {
            Graphics var1 = class122.field3052.getGraphics();
            class4.field188.method102(0, 0, var1, 0);
        } catch (Exception var2) {
            class122.field3052.repaint();
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 148)
    public static final void method190(int arg0) {
        field332++;
        int var1 = class70.field1749 * 128 + 64;
        int var2 = class45.field1189 * 128 + 64;
        int var3 = class78.method715((byte) -121, class2.field76, var2, var1) - field317;
        if (var2 > class23.field710) {
            class23.field710 += (var2 - class23.field710) * class117.field2921 / 1000 + class6.field240;
            if (class23.field710 > var2) {
                class23.field710 = var2;
            }
        }
        if (var3 > class70.field1751) {
            class70.field1751 += (var3 - class70.field1751) * class117.field2921 / 1000 + class6.field240;
            if (var3 < class70.field1751) {
                class70.field1751 = var3;
            }
        }
        if (class23.field710 > var2) {
            class23.field710 -= class6.field240 + (class23.field710 - var2) * class117.field2921 / 1000;
            if (var2 > class23.field710) {
                class23.field710 = var2;
            }
        }
        if (class46.field1202 < var1) {
            class46.field1202 += class6.field240 + (var1 - class46.field1202) * class117.field2921 / 1000;
            if (class46.field1202 > var1) {
                class46.field1202 = var1;
            }
        }
        if (class70.field1751 > var3) {
            class70.field1751 -= (class70.field1751 - var3) * class117.field2921 / 1000 + class6.field240;
            if (var3 > class70.field1751) {
                class70.field1751 = var3;
            }
        }
        int var4 = class48.field1272 * 128 + 64;
        if (class46.field1202 > var1) {
            class46.field1202 -= (class46.field1202 - var1) * class117.field2921 / 1000 + class6.field240;
            if (class46.field1202 < var1) {
                class46.field1202 = var1;
            }
        }
        int var5 = class76.field1898 * 128 + 64;
        int var6 = class78.method715((byte) -125, class2.field76, var4, var5) - class79.field1943;
        int var7 = var6 - class70.field1751;
        int var8 = var5 - class46.field1202;
        int var9 = var4 - class23.field710;
        int var10 = (int) Math.sqrt((double) (var9 * var9 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var8)) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        int var13 = var12 - class4.field185;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class4.field185 += class38.field1030 * var13 / 1000 + class118.field2948;
            class4.field185 &= 0x7FF;
        }
        if (arg0 <= 0) {
            return;
        }
        if (var13 < 0) {
            class4.field185 -= class118.field2948 + -var13 * class38.field1030 / 1000;
            class4.field185 &= 0x7FF;
        }
        if (var11 > class53.field1403) {
            class53.field1403 += (var11 - class53.field1403) * class38.field1030 / 1000 + class118.field2948;
            if (class53.field1403 > var11) {
                class53.field1403 = var11;
            }
        }
        if (class53.field1403 > var11) {
            class53.field1403 -= (class53.field1403 - var11) * class38.field1030 / 1000 + class118.field2948;
            if (class53.field1403 < var11) {
                class53.field1403 = var11;
            }
        }
        int var14 = var12 - class4.field185;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class4.field185 = var12;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLqd;)Z", line = 319)
    public static final boolean method191(byte arg0, class100 arg1) {
        field315++;
        int var2 = arg1.field2448;
        if (class23.field702 == 2) {
            if (var2 == 201) {
                class78.field1927 = 1;
                class132.field3233 = class100.field2549;
                class37.field1002 = true;
                class114.field2814 = 0;
                class132.field3235 = class132.field3237;
                class105.field2640 = true;
            }
            if (var2 == 202) {
                class78.field1927 = 2;
                class132.field3233 = class24.field739;
                class105.field2640 = true;
                class114.field2814 = 0;
                class37.field1002 = true;
                class132.field3235 = class132.field3237;
            }
        }
        if (var2 == 205) {
            class70.field1753 = 250;
            return true;
        }
        if (var2 == 501) {
            class114.field2814 = 0;
            class78.field1927 = 4;
            class105.field2640 = true;
            class132.field3233 = class103.field2605;
            class132.field3235 = class132.field3237;
            class37.field1002 = true;
        }
        if (var2 == 502) {
            class105.field2640 = true;
            class114.field2814 = 0;
            class78.field1927 = 5;
            class37.field1002 = true;
            class132.field3235 = class132.field3237;
            class132.field3233 = class23.field721;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class92.field2305.method645(var3, var4 == 1, 14);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class92.field2305.method647(-94, ~var6 == -2, var5);
        }
        if (arg0 != 88) {
            method188((byte) 42);
        }
        if (var2 == 324) {
            class92.field2305.method646(false, (byte) -110);
        }
        if (var2 == 325) {
            class92.field2305.method646(true, (byte) -110);
        }
        if (var2 == 326) {
            class38.field1043++;
            class70.field1729.method416(arg0 + 11365, 231);
            class92.field2305.method638(arg0 ^ 0x58, class70.field1729);
            return true;
        }
        if (var2 == 620) {
            class133.field3271 = !class133.field3271;
        }
        if (var2 >= 601 && var2 <= 613) {
            class36.method414(123);
            if (class132.field3220.method10(arg0 ^ 0xFFFFF398) > 0) {
                class70.field1729.method416(11453, 202);
                class93.field2319++;
                class70.field1729.method158(class132.field3220.method9((byte) 102), false);
                class70.field1729.method142(var2 - 601, (byte) -128);
                class70.field1729.method142(class133.field3271 ? 1 : 0, (byte) -128);
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V", line = 437)
    public static final void method192(int arg0) {
        if (arg0 != 1023) {
            method189(89);
        }
        class24.field728.method268((byte) -56);
        field330++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIBLqd;III)V", line = 476)
    public static final void method193(int arg0, int arg1, int arg2, int arg3, byte arg4, class100 arg5, int arg6, int arg7, int arg8) {
        if (class121.field3027) {
            class102.field2576 = 32;
        } else {
            class102.field2576 = 0;
        }
        field313++;
        class121.field3027 = false;
        if (arg6 <= arg2 && arg2 < arg6 + 16 && arg1 >= arg8 && arg8 + 16 > arg1) {
            arg5.field2540 -= class130.field3179 * 4;
            if (arg7 == 1) {
                class39.field1056 = true;
            }
            if (arg7 == 2 || arg7 == 3) {
                class105.field2640 = true;
            }
        } else if (arg2 >= arg6 && arg6 + 16 > arg2 && arg1 >= arg8 + arg0 - 16 && arg1 < arg8 + arg0) {
            arg5.field2540 += class130.field3179 * 4;
            if (arg7 == 2 || arg7 == 3) {
                class105.field2640 = true;
            }
            if (arg7 == 1) {
                class39.field1056 = true;
            }
        } else if (arg6 - class102.field2576 <= arg2 && arg2 < class102.field2576 + arg6 + 16 && arg8 + 16 <= arg1 && arg1 < arg8 + arg0 - 16 && class130.field3179 > 0) {
            class121.field3027 = true;
            int var9 = (arg0 - 32) * arg0 / arg3;
            if (arg7 == 2 || arg7 == 3) {
                class105.field2640 = true;
            }
            if (arg7 == 1) {
                class39.field1056 = true;
            }
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg0 - var9 - 32;
            int var11 = arg1 - arg8 - var9 / 2 - 16;
            arg5.field2540 = (arg3 - arg0) * var11 / var10;
        }
        int var12 = -61 / ((arg4 + 67) / 59);
    }
}
