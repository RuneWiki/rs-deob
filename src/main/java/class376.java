import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class376 extends class254 {

    @OriginalMember(owner = "client!at", name = "l", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5439;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "Lgr;")
    public static class530 field5440 = new class530(53, -1);

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "I")
    public static int field5446;

    // $FF: synthetic field
    @OriginalMember(owner = "client!at", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field5447;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "Ljava/lang/Object;")
    public static Object field5444;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IZIIIIIIII)V")
    public static final void method2330(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg6 && arg3 == arg5 && arg7 == arg9 && arg0 == arg4) {
            class89.method692(111, arg3, arg9, arg4, arg8, arg2);
        } else {
            int var10 = arg2;
            int var11 = arg3;
            int var12 = arg2 * 3;
            int var13 = arg3 * 3;
            int var14 = arg6 * 3;
            int var15 = arg5 * 3;
            int var16 = arg7 * 3;
            int var17 = arg0 * 3;
            int var18 = arg9 + var14 - var16 - arg2;
            int var19 = arg4 + var15 - arg3 - var17;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg2;
                int var34 = (var28 + var32 + var30 >> 12) + arg3;
                class89.method692(-127, var11, var33, var34, arg8, var10);
                var10 = var33;
                var11 = var34;
            }
        }
        if (!arg1) {
            method2330(78, false, -42, 20, -119, 19, 85, 118, 82, -121);
        }
        field5445++;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(I)V")
    public class376(int arg0) {
        this.field5439 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILha;I)Z")
    public static final boolean method2331(int arg0, class543 arg1, int arg2) {
        field5442++;
        int var3 = (class184.field2546 - 104) / 2;
        int var4 = (class240.field3555 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg0; var58 <= 3; var58++) {
                    if (class583.method3433((byte) 16, arg0, var58, var57, var6)) {
                        int var59 = var58;
                        if (class547.method3292((byte) -83, var57, var6)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class603.method3513(0, var59, var57, var6);
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
        class607.field8612 = arg1.method3265(var7, 512, 512, 512, 0, (byte) 50);
        class716.method4026(117);
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) - (-((int) (Math.random() * 20.0D)) + -238 + 10) | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        if (arg2 < 45) {
            return false;
        }
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
        boolean[][] var12 = new boolean[class228.field3412 + 2 + 1][class228.field3412 + 3];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class228.field3412) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class228.field3412) {
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
                int var41 = class228.field3412 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = class228.field3412 + var36;
                if (var42 < 104) {
                    var42++;
                    var38 += 4;
                }
                arg1.method297(0, 0, class228.field3412 * 4 + var37, var38 - -(class228.field3412 * 4));
                arg1.method1240(-16777216);
                for (int var43 = arg0; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class228.field3412; var50++) {
                        for (int var56 = 0; var56 <= class228.field3412; var56++) {
                            var12[var50][var56] = class583.method3433((byte) 16, arg0, var43, var40 + var56, var39 + var50);
                        }
                    }
                    class491.field7079[var43].method43(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class91.field1297) {
                        for (int var51 = -4; var51 < class228.field3412; var51++) {
                            for (int var52 = -4; var52 < class228.field3412; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var54 >= var4 && class583.method3433((byte) 16, arg0, var43, var54, var53)) {
                                    int var55 = var43;
                                    if (class547.method3292((byte) -100, var54, var53)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class592.method3476(var54, var9, var10, var53, true, arg1, var55, var38 + ((class228.field3412 - var52) * 4) - 4, var51 * 4 + var37);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class91.field1297) {
                    class635 var44 = class6.field57[arg0];
                    for (int var45 = 0; var45 < class228.field3412; var45++) {
                        for (int var46 = 0; var46 < class228.field3412; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field8956[var47 - var44.field8950][var48 - var44.field8968];
                            if ((var49 & 0x40240000) != 0) {
                                arg1.method3263((byte) -83, var45 * 4 + var37, 4, 4, var38 + ((class228.field3412 - var46) * 4) - 4, -1713569622);
                            } else if ((var49 & 0x800000) != 0) {
                                arg1.method3260(var38 + ((class228.field3412 - var46) * 4) - 4, 4, -109, var37 + (var45 * 4), -1713569622);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg1.method3258(-1713569622, (class228.field3412 - var46) * 4 + var38 - 4, 4, 66, var45 * 4 + var37 + 3);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg1.method3260((class228.field3412 - var46) * 4 + var38 - 1, 4, -69, var45 * 4 + var37, -1713569622);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg1.method3258(-1713569622, var38 + ((class228.field3412 - var46) * 4) - 4, 4, 116, var37 + (var45 * 4));
                            }
                        }
                    }
                }
                arg1.method397(var37, var38, class228.field3412 * 4, class228.field3412 * 4, var11, 2);
                class607.field8612.method807((var13 - var3) * 4 + 48, -(class228.field3412 * 4) + 464 + -((var36 - var4) * 4), class228.field3412 * 4, class228.field3412 * 4, var37, var38);
            }
        }
        arg1.method328();
        arg1.method1240(-16777215);
        class328.method2021(-8586);
        class691.field9797 = 0;
        class135.field1856.method3553(0);
        if (!class91.field1297) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg0; (arg0 + 1) >= var21 && var21 <= 3; var21++) {
                        if (class583.method3433((byte) 16, arg0, var21, var20, var14)) {
                            class324 var22 = (class324) class388.method2384(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class324) class360.method2277(var21, var14, var20, field5447 == null ? (field5447 = method2336("as")) : field5447);
                            }
                            if (var22 == null) {
                                var22 = (class324) class256.method1707(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class324) class198.method1415(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class482 var23 = class375.field5421.method2680(var22.method601((byte) 94), (byte) 104);
                                if (!var23.field6918 || class502.field7304) {
                                    int var24 = var23.field6970;
                                    if (var23.field6900 != null) {
                                        for (int var25 = 0; var25 < var23.field6900.length; var25++) {
                                            if (var23.field6900[var25] != -1) {
                                                class482 var26 = class375.field5421.method2680(var23.field6900[var25], (byte) 98);
                                                if (var26.field6970 >= 0) {
                                                    var24 = var26.field6970;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class463 var28 = class386.field5581.method2687(var24, 36);
                                            if (var28 != null && var28.field6572) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class6.field57[var21].field8956;
                                            int var32 = class6.field57[var21].field8950;
                                            int var33 = class6.field57[var21].field8968;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && (var14 - 3) < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 103) > var29 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && (var20 - 3) < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 104 - 1) > var30 && var30 < var20 + 3 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class572.field8258[class691.field9797] = var23.field6965;
                                        class658.field9418[class691.field9797] = var29;
                                        class511.field7412[class691.field9797] = var30;
                                        class691.field9797++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class506.field7353 != null) {
                class284.field3966.field6037 = 1;
                class386.field5581.method2690(64, 1024, 64);
                for (int var15 = 0; var15 < class506.field7353.field7111; var15++) {
                    int var16 = class506.field7353.field7110[var15];
                    if ((var16 >> 28) == class108.field1536.field3920) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class41.field693;
                        int var18 = (var16 & 0x3FFF) - class71.field1085;
                        if (var17 >= 0 && var17 < class184.field2546 && var18 >= 0 && var18 < class240.field3555) {
                            class135.field1856.method3559(new class177(var15), (byte) 12);
                        } else {
                            class463 var19 = class386.field5581.method2687(class506.field7353.field7108[var15], 36);
                            if (var19.field6603 != null && var19.field6567 + var17 >= 0 && class184.field2546 > (var19.field6587 + var17) && (var19.field6610 + var18) >= 0 && var18 + var19.field6582 < class240.field3555) {
                                class135.field1856.method3559(new class177(var15), (byte) 12);
                            }
                        }
                    }
                }
                class386.field5581.method2690(64, 128, 64);
                class284.field3966.field6037 = 2;
                class284.field3966.method2589(0);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
    public static final void method2332(int arg0) {
        field5441++;
        for (int var1 = arg0; var1 < class619.field8816; var1++) {
            int var2 = class545.field7927[var1];
            class63 var3 = (class63) class389.field5608.method4020((long) var2, (byte) -120);
            if (var3 != null) {
                class571 var4 = var3.field1004;
                class78.method645((byte) 105, var4.field8235.field7512, var4);
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V")
    public static void method2333(int arg0) {
        field5440 = null;
        if (arg0 != 30930) {
            method2333(-94);
        }
        field5444 = null;
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)V")
    public final void method2334(int arg0) {
        field5443++;
        this.field5439.method2569();
        if (arg0 > -31) {
            method2333(125);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIBIII)V")
    public static final void method2335(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field5446++;
        class647.field9332 = arg3;
        class405.field5770 = arg1;
        class572.field8256 = arg4;
        class749.field10449 = arg5;
        class80.field1148 = arg0;
        if (class749.field10449 >= 100) {
            int var6 = class572.field8256 * 512 + 256;
            int var7 = class80.field1148 * 512 + 256;
            int var8 = class530.method3211(var7, 2, var6, class687.field9758) - class647.field9332;
            int var9 = var6 - class518.field7473;
            int var10 = var8 - class564.field8174;
            int var11 = var7 - class123.field1698;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class279.field3904 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class179.field2487 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class279.field3904 < 1024) {
                class279.field3904 = 1024;
            }
            class487.field7021 = 0;
            if (class279.field3904 > 3072) {
                class279.field3904 = 3072;
            }
        }
        int var13 = -32 / ((84 - arg2) / 41);
        class616.field8773 = -1;
        class539.field7824 = -1;
        class165.field2351 = 2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2336(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
