import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class132 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field2013 = -1;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Z")
    public static boolean field2012 = false;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Z")
    public static boolean field2016 = false;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Lef;")
    public static class217 field2018 = class98.method733((byte) 14);

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Z")
    public static boolean field2022 = false;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field2024 = 3353893;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V", line = 6)
    public static final void method1020(int arg0, int arg1) {
        field2019++;
        class5 var2 = class63.field841.method1706(0);
        if (arg1 < 97) {
            method1024(32, 119, 78, 22, 19, 60, -75);
        }
        while (var2 != null) {
            if ((var2.field69 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method39(10717);
            }
            var2 = class63.field841.method1705((byte) 53);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIII)Z", line = 26)
    public static final boolean method1021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class96.field1378[arg0][var8][var9] == -class318.field4916) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class203.field3111[arg0][arg1][arg3] + arg5;
            if (!class120.method909(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class120.method909(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class120.method909(var10, var12, var14)) {
                return false;
            } else if (class120.method909(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class257.method1812(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class120.method909(var6 + 1, class203.field3111[arg0][arg1][arg3] + arg5, var7 + 1) && class120.method909(var6 + 128 - 1, class203.field3111[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class120.method909(var6 + 128 - 1, class203.field3111[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class120.method909(var6 + 1, class203.field3111[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II[BI[Lf;IIZIII)[I", line = 91)
    public static final int[] method1022(int arg0, int arg1, byte[] arg2, int arg3, class345[] arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        int var11 = (arg0 & 0x7) * 8;
        field2020++;
        if (!arg7) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    int var14 = arg3 + class283.method1958(var12 & 0x7, arg1, (byte) -115, var13 & 0x7);
                    int var15 = arg8 + class320.method2222(18597, arg1, var13 & 0x7, var12 & 0x7);
                    if (var14 > 0 && var14 < 103 && var15 > 0 && var15 < 103) {
                        arg4[arg6].field5357[var14][var15] = class149.method1117(arg4[arg6].field5357[var14][var15], -2097153);
                    }
                }
            }
        }
        int var16 = (arg9 & 0x7) * 8;
        class254 var17 = new class254(arg2);
        int var18 = (arg0 & 0xFFFFFFF8) << 3;
        int var19 = arg9 & 0x1FFFFFF8 << 3;
        if (arg5 < 12) {
            return (int[]) null;
        }
        byte var20 = 0;
        byte var21 = 0;
        byte var22;
        if (arg7) {
            var22 = 1;
        } else {
            var22 = 4;
        }
        if (arg1 == 1) {
            var21 = 1;
        } else if (arg1 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg1 == 3) {
            var20 = 1;
        }
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg10 != var23 || var24 < var11 || var24 > var11 + 8 || var25 < var16 || var25 > var16 + 8) {
                        class258.method1824(-1, arg7, 0, 0, var17, false, (byte) -81, 0, 0, -1, 0, 0);
                    } else if ((var11 + 8) == var24 || var16 + 8 == var25) {
                        int var32;
                        int var33;
                        if (arg1 == 0) {
                            var32 = var25 + arg8 - var16;
                            var33 = var24 + arg3 - var11;
                        } else if (arg1 == 1) {
                            var33 = var25 + arg3 - var16;
                            var32 = var11 + arg8 + 8 - var24;
                        } else if (arg1 == 2) {
                            var32 = var16 + (arg8 - -8) - var25;
                            var33 = var11 + arg3 + 8 - var24;
                        } else {
                            var32 = arg8 + var24 - var11;
                            var33 = var16 - (var25 - arg3 - 8);
                        }
                        class258.method1824(var33, arg7, 0, 0, var17, true, (byte) -81, arg6, var18 + var24, var32, 0, var19 + var25);
                    } else {
                        int var26 = arg3 + class283.method1958(var24 & 0x7, arg1, (byte) -115, var25 & 0x7);
                        int var27 = arg8 + class320.method2222(18597, arg1, var25 & 0x7, var24 & 0x7);
                        class258.method1824(var26, arg7, arg1, var20, var17, false, (byte) -81, arg6, var18 + var24, var27, var21, var19 + var25);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg1 == 0) {
                                var31 = var29 + arg8 - var16;
                                var30 = var28 + arg3 - var11;
                            } else if (arg1 == 1) {
                                var30 = var29 + arg3 - var16;
                                var31 = var11 + arg8 + 8 - var28;
                            } else if (arg1 == 2) {
                                var31 = var16 + arg8 + 8 - var29;
                                var30 = var11 + arg3 + 8 - var28;
                            } else {
                                var31 = var28 + arg8 - var11;
                                var30 = var16 - (var29 - arg3 - 8);
                            }
                            if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                class203.field3111[arg6][var30][var31] = class203.field3111[arg6][var26 + var20][var21 + var27];
                            }
                        }
                    }
                }
            }
        }
        boolean var34 = false;
        while (var17.field3866 < var17.field3840.length) {
            int var35 = var17.method1774((byte) 98);
            if (var35 == 128) {
                var34 = true;
                class142.field2185[0] = var17.method1755(false);
                class142.field2185[1] = var17.method1768(65536);
                class142.field2185[2] = var17.method1768(65536);
                class142.field2185[3] = var17.method1768(65536);
                class142.field2185[4] = var17.method1755(false);
            } else {
                if (var35 != 129) {
                    var17.field3866--;
                    break;
                }
                for (int var36 = 0; var36 < 4; var36++) {
                    byte var37 = var17.method1733(2023893896);
                    if (var37 == 0) {
                        if (arg10 >= var36) {
                            int var45 = arg3 + 7;
                            int var46 = arg8;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 >= 104) {
                                var45 = 104;
                            }
                            int var47 = arg3;
                            if (arg8 < 0) {
                                var46 = 0;
                            } else if (arg8 >= 104) {
                                var46 = 104;
                            }
                            if (arg3 < 0) {
                                var47 = 0;
                            } else if (arg3 >= 104) {
                                var47 = 104;
                            }
                            int var48 = arg8 + 7;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 >= 104) {
                                var48 = 104;
                            }
                            while (var45 > var47) {
                                while (var48 > var46) {
                                    class78.field1142[arg6][var47][var46] = 0;
                                    var46++;
                                }
                                var47++;
                            }
                        }
                    } else if (var37 == 1) {
                        for (int var38 = 0; var38 < 64; var38 += 4) {
                            for (int var39 = 0; var39 < 64; var39 += 4) {
                                byte var40 = var17.method1733(2023893896);
                                if (var36 <= arg10) {
                                    for (int var41 = var38; var41 < var38 + 4; var41++) {
                                        for (int var42 = var39; var42 < (var39 + 4); var42++) {
                                            if (var41 >= var11 && (var11 + 8) > var41 && var16 <= var42 && var16 < (var16 + 8)) {
                                                int var43 = arg3 + class283.method1958(var41 & 0x7, arg1, (byte) -115, var42 & 0x7);
                                                int var44 = class320.method2222(18597, arg1, var42 & 0x7, var41 & 0x7) + arg8;
                                                if (var43 >= 0 && var43 < 104 && var44 >= 0 && var44 < 104) {
                                                    class78.field1142[arg6][var43][var44] = var40;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var37 == 2) {
                    }
                }
            }
        }
        boolean var49 = false;
        if (class73.field1058 && !arg7) {
            class61 var50 = null;
            while (true) {
                while (var17.field3866 < var17.field3840.length) {
                    int var51 = var17.method1774((byte) -97);
                    if (var51 == 0) {
                        var50 = new class61(var17);
                    } else if (var51 == 1) {
                        int var52 = var17.method1774((byte) -119);
                        if (var52 > 0) {
                            for (int var53 = 0; var53 < var52; var53++) {
                                class255 var54 = new class255(var17);
                                if (var54.field3881 == 31) {
                                    class206 var55 = class313.method2143((byte) -29, var17.method1755(false));
                                    var54.method1795(var55.field3166, var55.field3164, var55.field3155, (byte) 115, var55.field3154);
                                }
                                int var56 = var54.field3902 >> 7;
                                int var57 = var54.field3882 >> 7;
                                if (var54.field3911 == arg10 && var11 <= var57 && (var11 + 8) > var57 && var16 <= var56 && var56 < var16 + 8) {
                                    int var58 = class339.method2361(var54.field3882 & 0x3FF, var54.field3902 & 0x3FF, arg1, true) + (arg3 << 7);
                                    int var59 = class192.method1409(var54.field3902 & 0x3FF, true, var54.field3882 & 0x3FF, arg1) + (arg8 << 7);
                                    var54.field3902 = var59;
                                    int var60 = var54.field3902 >> 7;
                                    var54.field3882 = var58;
                                    int var61 = var54.field3882 >> 7;
                                    if (var61 >= 0 && var60 >= 0 && var61 < 104 && var60 < 104) {
                                        var54.field3893 = (class324.field5005[1][var61][var60] & 0x2) != 0;
                                        var54.field3895 = class203.field3111[var54.field3911][var61][var60] - var54.field3895;
                                        class315.method2157(var54);
                                    }
                                }
                            }
                        }
                    } else if (var51 == 2) {
                        if (var50 == null) {
                            var50 = new class61();
                        }
                        var50.method422((byte) 38, var17);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var50 == null) {
                    var50 = new class61();
                }
                class258.field3966[arg3 >> 3][arg8 >> 3] = var50;
                break;
            }
        }
        if (!var49) {
            int var62 = arg3 + 7;
            int var63 = arg8 + 7;
            for (int var64 = arg3; var64 < var62; var64++) {
                for (int var65 = arg8; var65 < var63; var65++) {
                    class78.field1142[arg6][var64][var65] = 0;
                }
            }
        }
        return var34 ? class142.field2185 : null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 550)
    public static void method1023(int arg0) {
        field2018 = null;
        if (arg0 <= 79) {
            method1025(123);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIII)V", line = 562)
    public static final void method1024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 >= -81) {
            field2024 = 35;
        }
        if (arg3 >= class234.field3569 && class322.field4965 >= arg2 && arg0 >= class212.field3261 && class182.field2888 >= arg6) {
            if (arg5 == 1) {
                class331.method2310(arg2, arg0, arg6, arg3, (byte) -125, arg4);
            } else {
                class213.method1524(arg3, true, arg5, arg2, arg0, arg6, arg4);
            }
        } else if (arg5 == 1) {
            class48.method370(arg2, arg6, arg4, 114, arg0, arg3);
        } else {
            class64.method467((byte) 86, arg0, arg2, arg6, arg3, arg4, arg5);
        }
        field2017++;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 601)
    public static final void method1025(int arg0) {
        field2023++;
        if (arg0 == 1 && class121.field1857 != null) {
            class168 var1 = class121.field1857;
            synchronized (class121.field1857) {
                class121.field1857 = null;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BILvl;Ljava/awt/Component;I)Lwn;", line = 618)
    public static final class330 method1026(byte arg0, int arg1, class6 arg2, Component arg3, int arg4) {
        field2014++;
        if (class260.field4009 == 0) {
            throw new IllegalStateException();
        } else if (arg1 < 0 || arg1 >= 2) {
            throw new IllegalArgumentException();
        } else if (arg0 == -92) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class330 var5 = (class330) Class.forName("jk").getDeclaredConstructor().newInstance();
                var5.field5077 = new int[(class325.field5020 ? 2 : 1) * 256];
                var5.field5093 = arg4;
                var5.method1999(arg3);
                var5.field5102 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field5102 > 16384) {
                    var5.field5102 = 16384;
                }
                var5.method2001(var5.field5102);
                if (class308.field4803 > 0 && class38.field561 == null) {
                    class38.field561 = new class314();
                    class38.field561.field4866 = arg2;
                    arg2.method57(class38.field561, (byte) 9, class308.field4803);
                }
                if (class38.field561 != null) {
                    if (class38.field561.field4867[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class38.field561.field4867[arg1] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class306 var7 = new class306(arg2, arg1);
                    var7.field5077 = new int[(class325.field5020 ? 2 : 1) * 256];
                    var7.field5093 = arg4;
                    var7.method1999(arg3);
                    var7.field5102 = 16384;
                    var7.method2001(var7.field5102);
                    if (class308.field4803 > 0 && class38.field561 == null) {
                        class38.field561 = new class314();
                        class38.field561.field4866 = arg2;
                        arg2.method57(class38.field561, (byte) 9, class308.field4803);
                    }
                    if (class38.field561 != null) {
                        if (class38.field561.field4867[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class38.field561.field4867[arg1] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class330();
                }
            }
        } else {
            return (class330) null;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V", line = 750)
    public class132() {
        new class16();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 736)
    public static final void method1027(byte arg0) {
        if (arg0 > -7) {
            field2024 = 105;
        }
        class29.field355 = new class250(32);
        field2015++;
    }
}
