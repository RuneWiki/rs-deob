import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class221 extends class36 {

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "[I")
    public static int[] field3173 = new int[1000];

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "Z")
    public static boolean field3165 = false;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public int field3170;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public int field3175;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public int field3178;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "Lkm;")
    public static class133 field3172;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "Lkm;")
    public static class133 field3179;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "Ljava/lang/String;")
    public String field3168;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "[I")
    public int[] field3166;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "[I")
    public int[] field3174;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "[Lik;")
    public class17[] field3169;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "[Ljava/lang/String;")
    public String[] field3176;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "[[[B")
    public static byte[][][] field3164;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 4)
    public static final void method1557(int arg0, boolean arg1, String arg2) {
        field3180++;
        if (arg0 >= -77) {
            return;
        }
        if (!arg1) {
            try {
                class325.method2277(-21230, class165.field2258.field1157, "loggedout");
            } catch (Throwable var8) {
            }
            try {
                class96.field1293.getAppletContext().showDocument(new URL(class96.field1293.getCodeBase(), arg2), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class67.field908 && class179.field2405) {
            try {
                class325.method2278("openjs", new Object[] { (new URL(class96.field1293.getCodeBase(), arg2)).toString() }, 26014, class165.field2258.field1157);
                return;
            } catch (Throwable var10) {
            }
        }
        try {
            class96.field1293.getAppletContext().showDocument(new URL(class96.field1293.getCodeBase(), arg2), "_blank");
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V", line = 49)
    public static final void method1558(byte arg0) {
        field3182++;
        class106.field1430.method717((byte) 124);
        if (arg0 != 125) {
            field3172 = (class133) null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIIII)V", line = 66)
    public static final void method1559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class132.field1811.field2397; var9++) {
            if (class132.field1811.method1223((byte) 44, var9)) {
                int[] var10 = class135.field1864.method2024((class132.field1811.field2389[var9] & 0xFFFED31) >> 14, (byte) 93, class132.field1811.field2389[var9] & 0x3FFF, class132.field1811.field2389[var9] >> 28 & 0x3);
                if (var10 != null) {
                    int var11 = class42.field481 + class56.field765 - (var10[2] + 1);
                    int var12 = var10[1] - class174.field2374;
                    int var13 = (arg1 - arg0) * (var12 - arg2) / (arg4 - arg2) + arg0;
                    int var14 = (arg7 - arg3) * (var11 - arg5) / (arg8 - arg5) + arg3;
                    int var15 = 16777215;
                    class283 var16 = null;
                    int var17 = class132.field1811.method1220(-98, var9);
                    if (var17 == 0) {
                        if ((double) class273.field4084 == 3.0D) {
                            var16 = class28.field357;
                        }
                        if ((double) class273.field4084 == 4.0D) {
                            var16 = class98.field1327;
                        }
                        if ((double) class273.field4084 == 6.0D) {
                            var16 = class198.field2765;
                        }
                        if ((double) class273.field4084 >= 8.0D) {
                            var16 = class235.field3328;
                        }
                    }
                    if (var17 == 1) {
                        if ((double) class273.field4084 == 3.0D) {
                            var16 = class198.field2765;
                        }
                        if ((double) class273.field4084 == 4.0D) {
                            var16 = class235.field3328;
                        }
                        if ((double) class273.field4084 == 6.0D) {
                            var16 = class235.field3332;
                        }
                        if ((double) class273.field4084 >= 8.0D) {
                            var16 = class315.field4753;
                        }
                    }
                    if (var17 == 2) {
                        var15 = 16755200;
                        if ((double) class273.field4084 == 3.0D) {
                            var16 = class235.field3332;
                        }
                        if ((double) class273.field4084 == 4.0D) {
                            var16 = class315.field4753;
                        }
                        if ((double) class273.field4084 == 6.0D) {
                            var16 = class323.field4897;
                        }
                        if ((double) class273.field4084 >= 8.0D) {
                            var16 = class111.field1508;
                        }
                    }
                    if (class132.field1811.field2401[var9] != -1) {
                        var15 = class132.field1811.field2401[var9];
                    }
                    if (var16 != null) {
                        int var18 = class37.field426.method1924(class132.field1811.field2390[var9], (int[]) null, class126.field1736);
                        int var19 = var14 - (var18 - 1) * var16.method1957() / 2;
                        int var20 = var19 + var16.method1953() / 2;
                        for (int var21 = 0; var21 < var18; var21++) {
                            String var22 = class126.field1736[var21];
                            if (var21 < (var18 - 1)) {
                                var22 = var22.substring(0, var22.length() - 4);
                            }
                            var16.method1955(var22, var13, var20, var15, true);
                            var20 += var16.method1957();
                        }
                    }
                }
            }
        }
        if (arg6 != 19317) {
            field3165 = false;
        }
        field3177++;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V", line = 194)
    public static void method1560(int arg0) {
        field3173 = null;
        if (arg0 != -261129081) {
            method1564(88, 111, 57, -7, false, 93, -127, -102, -91);
        }
        field3172 = null;
        field3179 = null;
        field3164 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V", line = 211)
    public static final void method1561(boolean arg0) {
        field3183++;
        if (class201.method1432((byte) -43) != 2) {
            return;
        }
        byte var1 = (byte) (class8.field83 - 4 & 0xFF);
        int var2 = class8.field83 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class136.field1887[var3][var2][var4] = var1;
            }
        }
        if (class251.field3603 == 3) {
            return;
        }
        int var5 = 0;
        if (!arg0) {
            return;
        }
        while (var5 < 2) {
            class124.field1672[var5] = -1000000;
            class289.field4306[var5] = 1000000;
            class21.field277[var5] = 0;
            class100.field1372[var5] = 1000000;
            class254.field3632[var5] = 0;
            var5++;
        }
        if (class343.field5168 != 1) {
            int var16 = class135.method985(class275.field4123, class251.field3603, class198.field2820, (byte) -94);
            if ((var16 - class101.field1394) < 800 && (class240.field3406[class251.field3603][class198.field2820 >> 7][class275.field4123 >> 7] & 0x4) != 0) {
                class275.method1892(1, class198.field2820 >> 7, class142.field1940, class275.field4123 >> 7, false, 50);
            }
            return;
        }
        if ((class240.field3406[class251.field3603][class173.field2356.field3745 >> 7][class173.field2356.field3679 >> 7] & 0x4) != 0) {
            class275.method1892(0, class173.field2356.field3745 >> 7, class142.field1940, class173.field2356.field3679 >> 7, false, 50);
        }
        if (class204.field2944 >= 310) {
            return;
        }
        int var6 = class198.field2820 >> 7;
        int var7 = class173.field2356.field3745 >> 7;
        int var8 = class173.field2356.field3679 >> 7;
        int var9;
        if (var7 <= var6) {
            var9 = var6 - var7;
        } else {
            var9 = var7 - var6;
        }
        int var10 = class275.field4123 >> 7;
        int var11;
        if (var10 < var8) {
            var11 = var8 - var10;
        } else {
            var11 = var10 - var8;
        }
        if (var9 == 0 && var11 == 0 || var9 <= -104 || var9 >= 104 || var11 <= -104 || var11 >= 104) {
            class187.method1307("RC: " + var6 + "," + var10 + " " + var7 + "," + var8 + " " + class132.field1809 + "," + class296.field4394, (Throwable) null, -103);
            return;
        }
        if (var9 > var11) {
            int var14 = var11 * 65536 / var9;
            int var15 = 32768;
            while (var6 != var7) {
                if (var7 > var6) {
                    var6++;
                } else if (var7 < var6) {
                    var6--;
                }
                if ((class240.field3406[class251.field3603][var6][var10] & 0x4) != 0) {
                    class275.method1892(1, var6, class142.field1940, var10, false, 50);
                    break;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var10 < var8) {
                        var10++;
                    } else if (var8 < var10) {
                        var10--;
                    }
                    if ((class240.field3406[class251.field3603][var6][var10] & 0x4) != 0) {
                        class275.method1892(1, var6, class142.field1940, var10, false, 50);
                        break;
                    }
                }
            }
            return;
        }
        int var12 = var9 * 65536 / var11;
        int var13 = 32768;
        while (var8 != var10) {
            if (var10 < var8) {
                var10++;
            } else if (var10 > var8) {
                var10--;
            }
            if ((class240.field3406[class251.field3603][var6][var10] & 0x4) != 0) {
                class275.method1892(1, var6, class142.field1940, var10, false, 50);
                break;
            }
            var13 += var12;
            if (var13 >= 65536) {
                var13 -= 65536;
                if (var6 < var7) {
                    var6++;
                } else if (var6 > var7) {
                    var6--;
                }
                if ((class240.field3406[class251.field3603][var6][var10] & 0x4) != 0) {
                    class275.method1892(1, var6, class142.field1940, var10, false, 50);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ICB)I", line = 407)
    public static final int method1562(int arg0, char arg1, byte arg2) {
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        if (arg2 <= 110) {
            field3179 = (class133) null;
        }
        field3167++;
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)V", line = 439)
    public static final void method1563(byte arg0) {
        if (class186.field2565 != null) {
            class96 var1 = class186.field2565;
            synchronized (class186.field2565) {
                class186.field2565 = null;
            }
        }
        if (arg0 == -28) {
            field3181++;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIZIIII)V", line = 467)
    public static final void method1564(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field3184++;
        if (class269.method1854((byte) -107, arg6)) {
            class16.method102(-1, arg3, arg0, arg2, class241.field3419[arg6], arg4, arg7, arg5, arg1, arg8);
            if (arg4) {
                method1561(false);
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class121.field1644[var9] = true;
            }
        } else {
            class121.field1644[arg2] = true;
        }
    }
}
