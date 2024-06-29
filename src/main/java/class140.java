import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class140 {

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lfi;")
    public static class331 field1983 = new class331(50);

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Lvn;")
    public static class169 field1986 = new class169();

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "J")
    public static long field1989 = 0L;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "J")
    public static long field1988;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Lra;")
    public static class57 field1987;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "[Lsf;")
    public static class306[] field1985;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static void method832(byte arg0) {
        if (arg0 >= 20) {
            field1987 = null;
            field1986 = null;
            field1983 = null;
            field1985 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method833(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1984++;
        if (arg0 != -3) {
            field1989 = -89L;
        }
        class147.field2059 = arg3;
        class199.field2716 = arg2;
        class88.field991 = arg5;
        class152.field2139 = arg1;
        class102.field1157 = arg4;
        class269.field3783 = arg6;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIBLnj;)V")
    public static final void method834(int arg0, int arg1, byte arg2, class133 arg3) {
        field1981++;
        if ((arg1 & 0x2) != 0) {
            int var4 = class249.field3379.method1356((byte) 99);
            byte[] var5 = new byte[var4];
            class211 var6 = new class211(var5);
            class249.field3379.method1384(0, var4, var5, (byte) -123);
            class138.field1965[arg0] = var6;
            arg3.method796(-115, var6);
        }
        if ((arg1 & 0x80) != 0) {
            arg3.field6334 = class249.field3379.method1385(arg2);
            if (arg3.field6334 == 65535) {
                arg3.field6334 = -1;
            }
        }
        if ((arg1 & 0x800) != 0) {
            int var7 = class249.field3379.method1377(29247);
            arg3.field6303 = class249.field3379.method1342((byte) -128);
            arg3.field6284 = class249.field3379.method1356((byte) -126);
            arg3.field6262 = var7 & 0x7FFF;
            arg3.field6260 = (var7 & 0x8000) != 0;
            arg3.field6317 = class221.field3033 + arg3.field6262 + arg3.field6303;
        }
        if ((arg1 & 0x1000) != 0) {
            int var8 = class249.field3379.method1377(29247);
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = class249.field3379.method1363(84);
            boolean var10 = true;
            if (var8 != -1 && arg3.field6256 != -1) {
                if (arg3.field6256 == var8) {
                    class377 var11 = class251.method1571(var8, (byte) 90);
                    if (var11.field5521 && var11.field5536 != -1) {
                        class182 var12 = class437.method2717(var11.field5536, (byte) -103);
                        int var13 = var12.field2487;
                        if (var13 == 0) {
                            var10 = false;
                        } else if (var13 == 1) {
                            var10 = true;
                        } else if (var13 == 2) {
                            arg3.field6314 = 0;
                            var10 = false;
                        }
                    }
                } else {
                    class377 var14 = class251.method1571(var8, (byte) 90);
                    class377 var15 = class251.method1571(arg3.field6256, (byte) 90);
                    if (var14.field5536 != -1 && var15.field5536 != -1) {
                        class182 var16 = class437.method2717(var14.field5536, (byte) -103);
                        class182 var17 = class437.method2717(var15.field5536, (byte) -103);
                        if (var16.field2489 < var17.field2489) {
                            var10 = false;
                        }
                    }
                }
            }
            if (var10) {
                arg3.field6304 = (var9 & 0xFFFF) + class221.field3033;
                arg3.field6256 = var8;
                arg3.field6319 = var9 >> 16;
                arg3.field6315 = 0;
                arg3.field6332 = 0;
                arg3.field6270 = 1;
                if (arg3.field6304 > class221.field3033) {
                    arg3.field6315 = -1;
                }
                if (arg3.field6256 != -1 && class221.field3033 == arg3.field6304) {
                    int var18 = class251.method1571(arg3.field6256, (byte) 90).field5536;
                    if (var18 != -1) {
                        class182 var19 = class437.method2717(var18, (byte) -103);
                        if (var19 != null && var19.field2493 != null) {
                            class424.method2628(0, arg3.field1304, var19, 0, arg3.field1311, class390.field5715 == arg3);
                        }
                    }
                }
            }
        }
        if ((arg1 & 0x40) != 0) {
            arg3.field6259 = class249.field3379.method1350(arg2 + 192);
            if (arg3.field6259.charAt(0) == '~') {
                arg3.field6259 = arg3.field6259.substring(1);
                class386.method2466(0, -1, arg3.method785(arg2 ^ 0x38, false), 2, arg3.field6259, arg3.method787(-1, true));
            } else if (class390.field5715 == arg3) {
                class386.method2466(0, arg2 ^ 0x69, arg3.method785(-87, false), 2, arg3.field6259, arg3.method787(-1, true));
            }
            arg3.field6301 = 150;
            arg3.field6254 = 0;
            arg3.field6251 = 0;
        }
        if ((arg1 & 0x1) != 0) {
            int var20 = class249.field3379.method1349(123);
            if (var20 == 65535) {
                var20 = -1;
            }
            int var21 = class249.field3379.method1356((byte) 60);
            class295.method1871(var20, var21, arg3, (byte) 79);
        }
        if ((arg1 & 0x100) != 0) {
            arg3.field6246 = class249.field3379.method1342((byte) -128);
            arg3.field6302 = class249.field3379.method1395(124);
            arg3.field6294 = class249.field3379.method1342((byte) -126);
            arg3.field6267 = class249.field3379.method1342((byte) -127);
            arg3.field6331 = class249.field3379.method1355(32136) + class221.field3033;
            arg3.field6285 = class249.field3379.method1355(32136) + class221.field3033;
            arg3.field6311 = class249.field3379.method1382(-28295);
            arg3.field6345 = 1;
            arg3.field6353 = 0;
        }
        if ((arg1 & 0x200) != 0) {
            int var22 = class249.field3379.method1395(-48);
            int[] var23 = new int[var22];
            int[] var24 = new int[var22];
            int[] var25 = new int[var22];
            for (int var26 = 0; var26 < var22; var26++) {
                int var27 = class249.field3379.method1385(-114);
                if (var27 == 65535) {
                    var27 = -1;
                }
                var23[var26] = var27;
                var24[var26] = class249.field3379.method1356((byte) 64);
                var25[var26] = class249.field3379.method1355(32136);
            }
            class2.method19(arg3, 0, var25, var24, var23);
        }
        if ((arg1 & 0x20) != 0) {
            int var28 = class249.field3379.method1355(32136);
            int var29 = class249.field3379.method1395(124);
            int var30 = class249.field3379.method1342((byte) -126);
            int var31 = class249.field3379.field2888;
            boolean var32 = (var28 & 0x8000) != 0;
            if (arg3.field1847 != null && arg3.field1843 != null) {
                boolean var33 = false;
                if (var29 <= 1) {
                    if (!var32 && !(!class149.field2095 || class303.field4330) || class24.field239) {
                        var33 = true;
                    } else if (class117.method656(arg3.field1847, false)) {
                        var33 = true;
                    }
                }
                if (!var33 && class307.field4396 == 0) {
                    class392.field5730.field2888 = 0;
                    class249.field3379.method1346(class392.field5730.field2867, arg2 - 5516, var30, 0);
                    class392.field5730.field2888 = 0;
                    int var34 = -1;
                    String var35;
                    if (var32) {
                        var28 &= 0x7FFF;
                        class204 var36 = class281.method1799(class392.field5730, 1);
                        var34 = var36.field2794;
                        var35 = var36.field2793.method1821((byte) -51, class392.field5730);
                    } else {
                        var35 = class268.method1704(false, class20.method139((byte) -41, class297.method1880(class392.field5730, -101)));
                    }
                    arg3.field6259 = var35.trim();
                    arg3.field6301 = 150;
                    arg3.field6254 = var28 & 0xFF;
                    arg3.field6251 = var28 >> 8;
                    int var37;
                    if (var29 == 1 || var29 == 2) {
                        var37 = var32 ? 17 : 1;
                    } else {
                        var37 = var32 ? 17 : 2;
                    }
                    if (var29 == 2) {
                        class348.method2213("<img=1>" + arg3.method785(-104, false), var35, "<img=1>" + arg3.method787(-1, true), var34, (String) null, 125, var37, 0);
                    } else if (var29 == 1) {
                        class348.method2213("<img=0>" + arg3.method785(arg2 + 15, false), var35, "<img=0>" + arg3.method787(-1, true), var34, (String) null, arg2 + 230, var37, 0);
                    } else {
                        class348.method2213(arg3.method785(arg2, false), var35, arg3.method787(-1, true), var34, (String) null, 124, var37, 0);
                    }
                }
            }
            class249.field3379.field2888 = var30 + var31;
        }
        if (arg2 != -106) {
            method832((byte) -110);
        }
        if ((arg1 & 0x4) != 0) {
            arg3.field6292 = class249.field3379.method1377(arg2 ^ 0xFFFF8DA9);
            arg3.field6309 = class249.field3379.method1355(arg2 ^ 0xFFFF821E);
        }
        if ((arg1 & 0x10) != 0) {
            int var38 = class249.field3379.method1376(arg2 ^ 0xFFFFFF16);
            int var39 = class249.field3379.method1395(-121);
            arg3.method2683(class221.field3033, var39, -25640, var38);
            arg3.field6323 = class221.field3033 + 300;
            arg3.field6258 = class249.field3379.method1382(-28295);
        }
        if ((arg1 & 0x400) != 0) {
            int var40 = class249.field3379.method1376(128);
            int var41 = class249.field3379.method1395(125);
            arg3.method2683(class221.field3033, var41, -25640, var40);
        }
    }
}
