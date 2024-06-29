import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class451 {

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public int field6199 = 0;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public int field6198 = 0;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Z")
    private boolean field6206 = false;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public int field6195;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public int field6200;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    private int field6201;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public int field6202;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public int field6204;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public int field6205;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public int field6207;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public int field6209;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public int field6212;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public int field6213;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "J")
    public long field6214;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field6215;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6196;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2717(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIBIII)V", line = 4)
    public static final void method2710(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field6194++;
        int var6 = class325.method1901(arg5, class675.field9512, class395.field5484, true);
        int var7 = class325.method1901(arg0, class675.field9512, class395.field5484, true);
        int var8 = class325.method1901(arg1, class490.field6592, class116.field1628, true);
        int var9 = class325.method1901(arg4, class490.field6592, class116.field1628, true);
        int var10 = var6;
        if (arg2 <= 73) {
            field6196 = null;
        }
        while (var10 <= var7) {
            class721.method4044(class591.field8480[var10], var8, (byte) -123, var9, arg3);
            var10++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 37)
    public static void method2711(int arg0) {
        field6196 = null;
        if (arg0 != 0) {
            method2714(null, -54, -122, -109, 69, -75, 124, 125, -46, -34, (byte) -7);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBLvj;)V", line = 53)
    private final void method2712(int arg0, byte arg1, class26 arg2) {
        if (arg0 == 1) {
            this.field6201 = arg2.method193(2);
        } else if (arg0 == 2) {
            arg2.method194((byte) 119);
        } else if (arg0 == 3) {
            this.field6195 = arg2.method189(255);
            this.field6213 = arg2.method189(255);
            this.field6200 = arg2.method189(255);
        } else if (arg0 == 4) {
            this.field6212 = arg2.method194((byte) 119);
            this.field6205 = arg2.method189(255);
        } else if (arg0 == 6) {
            this.field6209 = arg2.method194((byte) 119);
        } else if (arg0 == 8) {
            this.field6199 = 1;
        } else if (arg0 == 9) {
            this.field6198 = 1;
        } else if (arg0 == 10) {
            this.field6206 = true;
        }
        field6210++;
        if (arg1 != 75) {
            this.method2716(49);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lvj;I)V", line = 113)
    public final void method2713(class26 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method194((byte) 119);
            if (var3 == 0) {
                if (arg1 != -237) {
                    method2710(107, 38, (byte) 43, 19, -73, -77);
                }
                field6208++;
                return;
            }
            this.method2712(var3, (byte) 75, arg0);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lnt;IIIIIIIIIB)Z", line = 140)
    public static final boolean method2714(class141 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field6203++;
        if (arg10 >= -127) {
            method2710(-8, 34, (byte) -50, -29, -77, -120);
        }
        int var11 = arg3;
        int var12 = arg1;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg3 - var13;
        class757.field10514[var13][var14] = 99;
        int var16 = arg1 - var14;
        class757.field10517[var13][var14] = 0;
        byte var17 = 0;
        class52.field742[var17] = arg3;
        int var18 = 0;
        int var26 = var17 + 1;
        class501.field7003[var17] = arg1;
        int[][] var19 = arg0.field1944;
        while (var26 != var18) {
            var12 = class501.field7003[var18];
            var11 = class52.field742[var18];
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg0.field1940;
            int var23 = var12 - arg0.field1949;
            if (arg9 == -4) {
                if (arg8 == var11 && arg7 == var12) {
                    class670.field9426 = var12;
                    class280.field3723 = var11;
                    return true;
                }
            } else if (arg9 == -3) {
                if (class275.method1669(var12, 2, 4096, var11, arg7, 2, arg4, arg5, arg8)) {
                    class670.field9426 = var12;
                    class280.field3723 = var11;
                    return true;
                }
            } else if (arg9 == -2) {
                if (arg0.method912(-24775, var12, arg4, arg7, arg5, 2, var11, arg8, arg6, 2)) {
                    class670.field9426 = var12;
                    class280.field3723 = var11;
                    return true;
                }
            } else if (arg9 == -1) {
                if (arg0.method920(2, var12, arg6, 0, var11, arg8, arg5, arg4, arg7)) {
                    class280.field3723 = var11;
                    class670.field9426 = var12;
                    return true;
                }
            } else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
                if (arg0.method910(arg9, 2, -10800, var11, var12, arg7, arg2, arg8)) {
                    class280.field3723 = var11;
                    class670.field9426 = var12;
                    return true;
                }
            } else if (arg0.method924(arg8, arg7, var11, (byte) -93, arg9, var12, 2, arg2)) {
                class670.field9426 = var12;
                class280.field3723 = var11;
                return true;
            }
            int var25 = class757.field10517[var20][var21] + 1;
            if (var20 > 0 && class757.field10514[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class52.field742[var26] = var11 - 1;
                class501.field7003[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class757.field10514[var20 - 1][var21] = 2;
                class757.field10517[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class757.field10514[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class52.field742[var26] = var11 + 1;
                class501.field7003[var26] = var12;
                class757.field10514[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class757.field10517[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class757.field10514[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class52.field742[var26] = var11;
                class501.field7003[var26] = var12 - 1;
                class757.field10514[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class757.field10517[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class757.field10514[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class52.field742[var26] = var11;
                class501.field7003[var26] = var12 + 1;
                class757.field10514[var20][var21 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class757.field10517[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class757.field10514[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class52.field742[var26] = var11 - 1;
                class501.field7003[var26] = var12 - 1;
                class757.field10514[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class757.field10517[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class757.field10514[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class52.field742[var26] = var11 + 1;
                class501.field7003[var26] = var12 - 1;
                class757.field10514[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class757.field10517[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class757.field10514[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class52.field742[var26] = var11 - 1;
                class501.field7003[var26] = var12 + 1;
                class757.field10514[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class757.field10517[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class757.field10514[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class52.field742[var26] = var11 + 1;
                class501.field7003[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class757.field10514[var20 + 1][var21 + 1] = 12;
                class757.field10517[var20 + 1][var21 + 1] = var25;
            }
        }
        class280.field3723 = var11;
        class670.field9426 = var12;
        return false;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILha;I)Z", line = 497)
    public static final boolean method2715(int arg0, class545 arg1, int arg2) {
        field6211++;
        int var3 = (class514.field7179 - 104) / 2;
        int var4 = (class456.field6281 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg0; var58 <= 3; var58++) {
                    if (client.method2687(var58, var6, var57, arg0, -125)) {
                        int var59 = var58;
                        if (class753.method4175(-12388, var57, var6)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class412.method2514(var57, var6, var59, false);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class590.field8471 = arg1.method3258(var7, arg2, 0, 512, 512, 512);
        class555.method3303((byte) 28);
        int var9 = (((int) (Math.random() * 20.0D)) + 228 << 8) + (238 - (10 - ((int) (Math.random() * 20.0D))) << 16) + (238 - (-((int) (Math.random() * 20.0D)) - -10)) | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xC05FF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
        boolean[][] var12 = new boolean[class371.field4845 + arg2 + 2][class371.field4845 + 2 + 1];
        for (int var13 = var3; var13 < var3 + 104; var13 += class371.field4845) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class371.field4845) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var37 += 4;
                    var39 = var13 - 1;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class371.field4845 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = class371.field4845 + var36;
                if (var42 < 104) {
                    var38 += 4;
                    var42++;
                }
                arg1.method2097(0, 0, class371.field4845 * 4 + var37, class371.field4845 * 4 + var38);
                arg1.method563(-16777216);
                for (int var43 = arg0; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class371.field4845; var50++) {
                        for (int var56 = 0; var56 <= class371.field4845; var56++) {
                            var12[var50][var56] = client.method2687(var43, var39 + var50, var40 + var56, arg0, 51);
                        }
                    }
                    class155.field2126[var43].method512(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class589.field8460) {
                        for (int var51 = -4; var51 < class371.field4845; var51++) {
                            for (int var52 = -4; var52 < class371.field4845; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var54 >= var4 && client.method2687(var43, var53, var54, arg0, arg2 ^ 0x72)) {
                                    int var55 = var43;
                                    if (class753.method4175(-12388, var54, var53)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class404.method2454(var10, true, var54, var51 * 4 + var37, arg1, var53, var9, var55, (class371.field4845 - var52) * 4 + (var38 - 4));
                                    }
                                }
                            }
                        }
                    }
                }
                if (class589.field8460) {
                    class141 var44 = class464.field6351[arg0];
                    for (int var45 = 0; var45 < class371.field4845; var45++) {
                        for (int var46 = 0; var46 < class371.field4845; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field1944[var47 - var44.field1940][var48 - var44.field1949];
                            if ((var49 & 0x40240000) != 0) {
                                arg1.method3255(4, 4, var45 * 4 + var37, -1713569622, (byte) 118, (class371.field4845 - var46) * 4 + var38 - 4);
                            } else if ((var49 & 0x800000) != 0) {
                                arg1.method3264((class371.field4845 - var46) * 4 + var38 - 4, (byte) 82, -1713569622, var37 + (var45 * 4), 4);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg1.method3260(-84, var37 - (-(var45 * 4) - 3), -1713569622, 4, (class371.field4845 - var46) * 4 + var38 - 4);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg1.method3264(var38 - (-((class371.field4845 - var46) * 4) - 3) - 4, (byte) 41, -1713569622, var45 * 4 + var37, 4);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg1.method3260(91, var45 * 4 + var37, -1713569622, 4, (class371.field4845 - var46) * 4 + var38 - 4);
                            }
                        }
                    }
                }
                arg1.method2194(var37, var38, class371.field4845 * 4, class371.field4845 * 4, var11, 2);
                class590.field8471.method118((var13 - var3) * 4 + 48, -((var36 - var4) * 4) + 464 - class371.field4845 * 4, class371.field4845 * 4, class371.field4845 * 4, var37, var38);
            }
        }
        arg1.method2198();
        arg1.method563(-16777215);
        class330.method1918(arg2 ^ 0x6);
        class431.field5932 = 0;
        class303.field3947.method3122(arg2 - 1);
        if (!class589.field8460) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg0; var21 <= arg0 + 1 && var21 <= 3; var21++) {
                        if (client.method2687(var21, var14, var20, arg0, -83)) {
                            class649 var22 = (class649) class340.method1963(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class649) class151.method970(var21, var14, var20, field6215 == null ? (field6215 = method2717("vea")) : field6215);
                            }
                            if (var22 == null) {
                                var22 = (class649) class204.method1367(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class649) class744.method4146(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class30 var23 = class264.field3604.method3188(var22.method275(24263), (byte) -57);
                                if (!var23.field423 || class191.field2769) {
                                    int var24 = var23.field380;
                                    if (var23.field455 != null) {
                                        for (int var25 = 0; var25 < var23.field455.length; var25++) {
                                            if (var23.field455[var25] != -1) {
                                                class30 var26 = class264.field3604.method3188(var23.field455[var25], (byte) -57);
                                                if (var26.field380 >= 0) {
                                                    var24 = var26.field380;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class185 var28 = class92.field1241.method1971(var24, -23851);
                                            if (var28 != null && var28.field2711) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class464.field6351[var21].field1944;
                                            int var32 = class464.field6351[var21].field1940;
                                            int var33 = class464.field6351[var21].field1949;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var29 > var14 - 3 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 104 - 1 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 104 - 1) > var30 && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class141.field1953[class431.field5932] = var23.field442;
                                        class313.field4019[class431.field5932] = var29;
                                        class671.field9442[class431.field5932] = var30;
                                        class431.field5932++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class669.field9413 != null) {
                class437.field5994.field7898 = 1;
                class92.field1241.method1975(1024, 127, 64);
                for (int var15 = 0; var15 < class669.field9413.field6303; var15++) {
                    int var16 = class669.field9413.field6304[var15];
                    if ((var16 >> 28) == class473.field6483.field9501) {
                        int var17 = ((var16 & 0xFFFC5FA) >> 14) - class179.field2535;
                        int var18 = (var16 & 0x3FFF) - class510.field7109;
                        if (var17 >= 0 && class514.field7179 > var17 && var18 >= 0 && var18 < class456.field6281) {
                            class303.field3947.method3116(arg2 ^ 0x718B, new class285(var15));
                        } else {
                            class185 var19 = class92.field1241.method1971(class669.field9413.field6305[var15], -23851);
                            if (var19.field2703 != null && var19.field2683 + var17 >= 0 && (var19.field2720 + var17) < class514.field7179 && var19.field2701 + var18 >= 0 && class456.field6281 > var19.field2708 + var18) {
                                class303.field3947.method3116(29066, new class285(var15));
                            }
                        }
                    }
                }
                class92.field1241.method1975(128, arg2 - 108, 64);
                class437.field5994.field7898 = 2;
                class437.field5994.method3328((byte) -124);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 956)
    public final void method2716(int arg0) {
        this.field6202 = class231.field3218[this.field6201 << 3];
        field6197++;
        long var2 = (long) this.field6195;
        long var4 = (long) this.field6213;
        long var6 = (long) this.field6200;
        this.field6204 = (int) Math.sqrt((double) (var4 * var4 + var2 * var2 + var6 * var6));
        if (arg0 != -14227) {
            this.field6198 = 86;
        }
        if (this.field6205 == 0) {
            this.field6205 = 1;
        }
        if (this.field6212 == 0) {
            this.field6214 = 2147483647L;
        } else if (this.field6212 == 1) {
            this.field6214 = (this.field6204 * 8 / this.field6205);
            this.field6214 *= this.field6214;
        } else if (this.field6212 == 2) {
            this.field6214 = (this.field6204 * 8 / this.field6205);
        }
        if (this.field6206) {
            this.field6204 *= -1;
        }
    }
}
