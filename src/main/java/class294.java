import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class294 extends class147 {

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Lna;")
    public static class26 field4891 = class69.method505("Wordpack geladen)3", (byte) -118);

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "Lna;")
    public static class26 field4902 = class69.method505("details", (byte) -119);

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "Lna;")
    public static class26 field4906 = class69.method505("<)4col> x", (byte) -123);

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public int field4889;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public int field4904;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "[I")
    public int[] field4895;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "[I")
    public int[] field4896;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "[I")
    public int[] field4898;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "[Lim;")
    public class180[] field4894;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "[Lim;")
    public class180[] field4901;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "[[[B")
    public byte[][][] field4900;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V", line = 7)
    public static final void method2063(int arg0, int arg1, int arg2) {
        if (arg0 <= 23) {
            field4906 = (class26) null;
        }
        field4897++;
        if (class71.method509(arg2, 104)) {
            class9.method57(class86.field1416[arg2], true, arg1);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBIILbe;)V", line = 24)
    public static final void method2064(int arg0, byte arg1, int arg2, int arg3, class297 arg4) {
        field4903++;
        class258.method1815(-16385);
        if (class255.field4184) {
            class326.method2279(arg3, arg2, arg4.field4967 + arg3, arg4.field4996 + arg2);
        } else {
            class34.method287(arg3, arg2, arg3 + arg4.field4967, arg4.field4996 + arg2);
        }
        if (class154.field2402 != 2 && class154.field2402 != 5 && class302.field5204 != null) {
            int var5 = class300.field5156 + class158.field2465 & 0x7FF;
            int var6 = class13.field221.field3962 / 32 + 48;
            int var7 = 464 - (class13.field221.field3972 / 32);
            if (class255.field4184) {
                ((class130) class302.field5204).method874(arg3, arg2, arg4.field4967, arg4.field4996, var6, var7, var5, class51.field797 + 256, (class130) arg4.method2100((byte) -113, false));
            } else {
                ((class256) class302.field5204).method1749(arg3, arg2, arg4.field4967, arg4.field4996, var6, var7, var5, class51.field797 + 256, arg4.field5011, arg4.field5102);
            }
            if (class219.field3504 != null) {
                for (int var8 = 0; var8 < class219.field3504.field165; var8++) {
                    if (class219.field3504.method76(var8, arg1 ^ 0x229)) {
                        int var9 = (class219.field3504.field173[var8] - class12.field157) * 4 + 2 - (class13.field221.field3962 / 32);
                        int var10 = class200.field3104[var5];
                        int var11 = class200.field3115[var5];
                        class175 var12 = class283.field4723;
                        int var13 = var10 * 256 / (class51.field797 + 256);
                        int var14 = (class219.field3504.field160[var8] - class165.field2568) * 4 + 2 - class13.field221.field3972 / 32;
                        int var15 = var11 * 256 / (class51.field797 + 256);
                        int var16 = var14 * var15 - (var9 * var13) >> 16;
                        if (class219.field3504.method78(var8, arg1 - 51) == 1) {
                            var12 = class136.field2083;
                        }
                        if (class219.field3504.method78(var8, 8) == 2) {
                            var12 = class89.field1474;
                        }
                        int var17 = var13 * var14 + (var9 * var15) >> 16;
                        int var18 = var12.method1197(class219.field3504.field166[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (var19 >= (-arg4.field4967) && var19 <= arg4.field4967 && var16 >= -arg4.field4996 && var16 <= arg4.field4996) {
                            int var20 = 16777215;
                            if (class219.field3504.field170[var8] != -1) {
                                var20 = class219.field3504.field170[var8];
                            }
                            if (class255.field4184) {
                                class326.method2280((class130) arg4.method2100((byte) -113, false));
                            } else {
                                class34.method277(arg4.field5011, arg4.field5102);
                            }
                            var12.method1210(class219.field3504.field166[var8], arg4.field4967 / 2 + arg3 + var19, arg4.field4996 / 2 + -var16 + arg2, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class255.field4184) {
                                class326.method2265();
                            } else {
                                class34.method273();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class305.field5261; var21++) {
                int var22 = class124.field1926[var21] * 4 + 2 - (class13.field221.field3962 / 32);
                int var23 = class94.field1542[var21] * 4 + 2 - (class13.field221.field3972 / 32);
                class78 var24 = class104.method750(4, class4.field48[var21]);
                if (var24.field1222 != null) {
                    var24 = var24.method552(arg1 - 59);
                    if (var24 == null || var24.field1174 == -1) {
                        continue;
                    }
                }
                class11.method70(arg4, class241.field3983[var24.field1174], var23, var22, arg2, (byte) 11, arg3);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class32 var27 = class268.field4433[class279.field4651][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class13.field221.field3962 / 32);
                        int var29 = var26 * 4 + 2 - (class13.field221.field3972 / 32);
                        class11.method70(arg4, class295.field4917[0], var29, var28, arg2, (byte) 11, arg3);
                    }
                }
            }
            for (int var30 = 0; var30 < class81.field1270; var30++) {
                class324 var31 = class185.field2877[class316.field5412[var30]];
                if (var31 != null && var31.method1082((byte) 17)) {
                    class187 var32 = var31.field5565;
                    if (var32 != null && var32.field2953 != null) {
                        var32 = var32.method1273((byte) -3);
                    }
                    if (var32 != null && var32.field2945 && var32.field2928) {
                        int var33 = var31.field3962 / 32 - class13.field221.field3962 / 32;
                        int var34 = var31.field3972 / 32 - (class13.field221.field3972 / 32);
                        if (var32.field2941 == -1) {
                            class11.method70(arg4, class295.field4917[1], var34, var33, arg2, (byte) 11, arg3);
                        } else {
                            class11.method70(arg4, class241.field3983[var32.field2941], var34, var33, arg2, (byte) 11, arg3);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class80.field1261; var35++) {
                class159 var36 = class268.field4427[class95.field1550[var35]];
                if (var36 != null && var36.method1082((byte) 17)) {
                    int var37 = var36.field3972 / 32 - class13.field221.field3972 / 32;
                    int var38 = var36.field3962 / 32 - (class13.field221.field3962 / 32);
                    long var39 = var36.field2495.method209(-128);
                    boolean var41 = false;
                    for (int var42 = 0; var42 < class321.field5520; var42++) {
                        if (class121.field1890[var42] == var39 && class208.field3226[var42] != 0) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class96.field1567; var44++) {
                        if (class4.field49[var44].field2293 == var39) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class13.field221.field2477 != 0 && var36.field2477 != 0 && class13.field221.field2477 == var36.field2477) {
                        var45 = true;
                    }
                    if (var41) {
                        class11.method70(arg4, class295.field4917[3], var37, var38, arg2, (byte) 11, arg3);
                    } else if (var43) {
                        class11.method70(arg4, class295.field4917[5], var37, var38, arg2, (byte) 11, arg3);
                    } else if (var45) {
                        class11.method70(arg4, class295.field4917[4], var37, var38, arg2, (byte) 11, arg3);
                    } else {
                        class11.method70(arg4, class295.field4917[2], var37, var38, arg2, (byte) 11, arg3);
                    }
                }
            }
            class145[] var46 = class122.field1901;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class145 var48 = var46[var47];
                if (var48 != null && var48.field2213 != 0 && class229.field3626 % 20 < 10) {
                    if (var48.field2213 == 1 && var48.field2212 >= 0 && var48.field2212 < class185.field2877.length) {
                        class324 var49 = class185.field2877[var48.field2212];
                        if (var49 != null) {
                            int var50 = var49.field3962 / 32 - (class13.field221.field3962 / 32);
                            int var51 = var49.field3972 / 32 - (class13.field221.field3972 / 32);
                            class291.method2049(var48.field2203, arg2, arg3, var50, var51, arg4, false);
                        }
                    }
                    if (var48.field2213 == 2) {
                        int var52 = (var48.field2208 - class12.field157) * 4 + 2 - class13.field221.field3962 / 32;
                        int var53 = (var48.field2199 - class165.field2568) * 4 + 2 - (class13.field221.field3972 / 32);
                        class291.method2049(var48.field2203, arg2, arg3, var52, var53, arg4, false);
                    }
                    if (var48.field2213 == 10 && var48.field2212 >= 0 && class268.field4427.length > var48.field2212) {
                        class159 var54 = class268.field4427[var48.field2212];
                        if (var54 != null) {
                            int var55 = var54.field3972 / 32 - (class13.field221.field3972 / 32);
                            int var56 = var54.field3962 / 32 - (class13.field221.field3962 / 32);
                            class291.method2049(var48.field2203, arg2, arg3, var56, var55, arg4, false);
                        }
                    }
                }
            }
            if (class64.field1020 != 0) {
                int var57 = class64.field1020 * 4 + (2 - class13.field221.field3962 / 32);
                int var58 = class7.field84 * 4 + 2 - class13.field221.field3972 / 32;
                class11.method70(arg4, class7.field88, var58, var57, arg2, (byte) 11, arg3);
            }
            if (class255.field4184) {
                class326.method2278(arg3 + (arg4.field4967 / 2) - 1, arg2 + -1 - -(arg4.field4996 / 2), 3, 3, 16777215);
            } else {
                class34.method286(arg4.field4967 / 2 + arg3 - 1, arg4.field4996 / 2 + arg2 + -1, 3, 3, 16777215);
            }
        } else if (class255.field4184) {
            class148 var59 = arg4.method2100((byte) -113, false);
            if (var59 != null) {
                var59.method876(arg3, arg2);
            }
        } else {
            class34.method295(arg3, arg2, 0, arg4.field5011, arg4.field5102);
        }
        if (arg1 == 59) {
            class139.field2123[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIIII)V", line = 367)
    public static final void method2065(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4890++;
        if (!arg0 && arg4 >= class225.field3572 && arg4 <= class27.field454) {
            int var5 = class308.method2151(class117.field1840, arg2, (byte) 0, class80.field1259);
            int var6 = class308.method2151(class117.field1840, arg1, (byte) 0, class80.field1259);
            class20.method132(2, var5, arg4, var6, arg3);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([SI[Lna;II)V", line = 384)
    public static final void method2066(short[] arg0, int arg1, class26[] arg2, int arg3, int arg4) {
        field4907++;
        if (arg1 > arg4) {
            int var5 = arg4;
            int var6 = (arg4 + arg1) / 2;
            class26 var7 = arg2[var6];
            arg2[var6] = arg2[arg1];
            arg2[arg1] = var7;
            short var8 = arg0[var6];
            arg0[var6] = arg0[arg1];
            arg0[arg1] = var8;
            for (int var9 = arg4; var9 < arg1; var9++) {
                if (var7 == null || arg2[var9] != null && arg2[var9].method190(var7, -1) < (var9 & 0x1)) {
                    class26 var10 = arg2[var9];
                    arg2[var9] = arg2[var5];
                    arg2[var5] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5++] = var11;
                }
            }
            arg2[arg1] = arg2[var5];
            arg2[var5] = var7;
            arg0[arg1] = arg0[var5];
            arg0[var5] = var8;
            method2066(arg0, var5 - 1, arg2, -909, arg4);
            method2066(arg0, arg1, arg2, -909, var5 + 1);
        }
        if (arg3 != -909) {
            method2064(-13, (byte) 113, -27, -120, (class297) null);
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V", line = 439)
    public static final void method2067(int arg0) {
        class229.field3638.method1987(3);
        if (arg0 != 2) {
            method2066((short[]) null, -27, (class26[]) null, -4, -64);
        }
        field4905++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)I", line = 452)
    public static final int method2068(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 2) {
            method2070(14);
        }
        field4899++;
        if (arg0 > 243) {
            arg2 >>= 0x4;
        } else if (arg0 > 217) {
            arg2 >>= 0x3;
        } else if (arg0 > 192) {
            arg2 >>= 0x2;
        } else if (arg0 > 179) {
            arg2 >>= 0x1;
        }
        return (arg0 >> 1) + (arg2 >> 5 << 7) + (arg3 >> 2 << 10);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Lba;", line = 480)
    public static final class166 method2069(int arg0, int arg1) {
        field4892++;
        if (class41.field690 && arg1 >= class84.field1365 && arg1 <= class24.field353) {
            int var2 = 120 / ((-arg0) / 32);
            return class193.field3005[arg1 - class84.field1365];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V", line = 498)
    public static void method2070(int arg0) {
        field4891 = null;
        field4902 = null;
        field4906 = null;
        if (arg0 >= -104) {
            method2071((byte) -28);
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)V", line = 525)
    public static final void method2071(byte arg0) {
        field4893++;
        for (int var1 = 0; var1 < class101.field1624; var1++) {
            int var10002 = class26.field437[var1]--;
            if (class26.field437[var1] >= -10) {
                class99 var3 = class13.field194[var1];
                if (var3 == null) {
                    var3 = class99.method734(class189.field2969, class186.field2891[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class26.field437[var1] += var3.method736();
                    class13.field194[var1] = var3;
                }
                if (class26.field437[var1] < 0) {
                    int var10;
                    if (class98.field1603[var1] == 0) {
                        var10 = class263.field4311;
                    } else {
                        int var4 = (class98.field1603[var1] & 0xFF) * 128;
                        int var5 = class98.field1603[var1] >> 8 & 0xFF;
                        int var6 = class98.field1603[var1] >> 16 & 0xFF;
                        int var7 = var5 * 128 + 64 - class13.field221.field3972;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var6 * 128 + 64 - class13.field221.field3962;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var7 + var8 - 128;
                        if (var4 < var9) {
                            class26.field437[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class42.field696 / var4;
                    }
                    if (var10 > 0) {
                        class176 var11 = var3.method735().method1221(class322.field5542);
                        class60 var12 = class60.method453(var11, 100, var10);
                        var12.method444(class10.field128[var1] - 1);
                        class301.field5195.method1309(var12);
                    }
                    class26.field437[var1] = -100;
                }
            } else {
                class101.field1624--;
                for (int var2 = var1; var2 < class101.field1624; var2++) {
                    class186.field2891[var2] = class186.field2891[var2 + 1];
                    class13.field194[var2] = class13.field194[var2 + 1];
                    class10.field128[var2] = class10.field128[var2 + 1];
                    class26.field437[var2] = class26.field437[var2 + 1];
                    class98.field1603[var2] = class98.field1603[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 != -92) {
            method2065(true, 36, 42, 14, 51);
        }
        if (class243.field4003 && !class232.method1565(-1)) {
            if (class92.field1499 != 0 && class271.field4528 != -1) {
                class267.method1902(class36.field593, false, class271.field4528, 0, false, class92.field1499);
            }
            class243.field4003 = false;
        } else if (class92.field1499 != 0 && class271.field4528 != -1 && !class232.method1565(arg0 + 91)) {
            class114.field1789.method1431(0, 137);
            class114.field1789.method577(-127, class271.field4528);
            class271.field4528 = -1;
            class33.field550++;
        }
    }
}
