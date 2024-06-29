import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class168 extends class443 {

    @OriginalMember(owner = "client!cw", name = "H", descriptor = "[I")
    public static int[] field2600 = new int[1];

    @OriginalMember(owner = "client!cw", name = "M", descriptor = "I")
    public static int field2605 = 0;

    @OriginalMember(owner = "client!cw", name = "C", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!cw", name = "D", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!cw", name = "E", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!cw", name = "F", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!cw", name = "J", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!cw", name = "K", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!cw", name = "L", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!cw", name = "I", descriptor = "[B")
    private byte[] field2601;

    @OriginalMember(owner = "client!cw", name = "G", descriptor = "[I")
    public static int[] field2599;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BIB)V", line = 4)
    public final void method1146(byte arg0, int arg1, byte arg2) {
        field2604++;
        int var4 = -106 % ((arg2 - 2) / 62);
        int var5 = arg1 * 2;
        byte var6 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var10001 = var5;
        int var7 = var5 + 1;
        this.field2601[var10001] = var6;
        this.field2601[var7] = var6;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIII)[B", line = 19)
    public final byte[] method1147(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == -26694) {
            this.field2601 = new byte[arg0 * arg3 * arg1 * 2];
            field2596++;
            this.method3463(arg0, true, arg3, arg1);
            return this.field2601;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IBIIIII)V", line = 33)
    public static final void method1148(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2595++;
        int var7 = class664.field9426;
        class511.field6816 = 0;
        int[] var8 = class55.field762;
        for (int var9 = 0; var9 < (class92.field1396 + var7); var9++) {
            class419 var32 = null;
            class411 var33;
            if (var7 > var9) {
                var33 = class572.field7601[var8[var9]];
            } else {
                var33 = ((class280) class616.field8143.method2918((long) class415.field5681[var9 - var7], (byte) -128)).field3983;
                var32 = ((class287) var33).field4052;
                if (var32.field5753 != null) {
                    var32 = var32.method2401(false, class80.field1261);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (var33.field5612 >= 0 && (class20.field321 == var33.field5637 || class199.field2897.field8609 == var33.field8609)) {
                class352.method2098((byte) 42, arg2, arg4, arg6 >> 1, arg3 >> 1, var33, var33.method1773(70));
                if (class601.field7980[0] >= 0) {
                    if (var33.field5587 != null && (var7 <= var9 || class605.field8022 == 0 || class605.field8022 == 3 || class605.field8022 == 1 && class94.method743(((class403) var33).field5398, (byte) -50)) && class511.field6816 < class148.field2357) {
                        class148.field2359[class511.field6816] = class193.field2823.method2847(var33.field5587, (byte) -127) / 2;
                        class148.field2372[class511.field6816] = class601.field7980[0];
                        class148.field2363[class511.field6816] = class601.field7980[1];
                        class148.field2361[class511.field6816] = var33.field5597;
                        class148.field2367[class511.field6816] = var33.field5558;
                        class148.field2374[class511.field6816] = var33.field5599;
                        class148.field2369[class511.field6816] = var33.field5587;
                        class511.field6816++;
                    }
                    int var34 = class601.field7980[1] + arg5;
                    int var45;
                    if (var33.field5564 || var33.field5603 <= class642.field8626) {
                        var45 = var34 - Math.max(class193.field2823.field6828, class270.field3760[0].method1028());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var7 > var9) {
                            class403 var37 = class572.field7601[var8[var9]];
                            var38 = var33.method2353(-1).field7182;
                            if (var37.field5394) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field5790;
                            if (var38 == -1) {
                                var38 = var33.method2353(-1).field7182;
                            }
                        }
                        class468[] var39 = class270.field3760;
                        if (var38 != -1) {
                            class468[] var40 = (class468[]) class24.field400.method3750((long) var38, false);
                            if (var40 == null) {
                                class500[] var41 = class500.method2777(class658.field9155, var38, 0);
                                if (var41 != null) {
                                    var40 = new class468[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class10.field197.method440(var41[var42], true);
                                    }
                                    class24.field400.method3745(1, (long) var38, var40);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var36 >= var39.length) {
                            var36 = 1;
                        }
                        class468 var43 = var39[0];
                        class468 var44 = var39[var36];
                        var45 = var34 - Math.max(class193.field2823.field6828, var43.method1028());
                        int var46 = class601.field7980[0] + arg0 - (var43.method1035() >> 1);
                        int var47 = var43.method1035() * var33.field5636 / 255;
                        if (var33.field5636 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method2637(var46, var45);
                        class10.field197.method459(var46, var45, var46 + var47, var45 - -var43.method1028());
                        var44.method2637(var46, var45);
                        class10.field197.method421(arg0, arg5, arg0 + arg6, arg3 + arg5);
                    }
                    var45 -= 2;
                    if (!var33.field5564) {
                        if (var33.field5550 > class642.field8626) {
                            class468 var48 = class672.field9513[var33.field5621 ? 2 : 0];
                            class468 var49 = class672.field9513[var33.field5621 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if ((var33 instanceof class287)) {
                                var51 = var32.field5769;
                                if (var51 == -1) {
                                    var51 = var33.method2353(-1).field7168;
                                }
                            } else {
                                var51 = var33.method2353(-1).field7168;
                            }
                            if (var51 != -1) {
                                class468[] var52 = (class468[]) class190.field2793.method3750((long) var51, false);
                                if (var52 == null) {
                                    class500[] var53 = class500.method2777(class658.field9155, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class468[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class10.field197.method440(var53[var54], true);
                                        }
                                        class190.field2793.method3745(1, (long) var51, var52);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var49 = var52[var33.field5621 ? 3 : 1];
                                    var48 = var52[var33.field5621 ? 2 : 0];
                                }
                            }
                            int var55 = var33.field5550 - class642.field8626;
                            int var58;
                            if (var33.field5626 < var55) {
                                int var56 = var55 - var33.field5626;
                                int var57 = var33.field5625 == 0 ? 0 : (var33.field5585 - var56) / var33.field5625 * var33.field5625;
                                var58 = var57 * var48.method1035() / var33.field5585;
                            } else {
                                var58 = var48.method1035();
                            }
                            int var59 = var48.method1028();
                            var45 -= var59;
                            int var60 = class601.field7980[0] + (arg0 - (var48.method1035() >> 1));
                            var48.method2637(var60, var45);
                            class10.field197.method459(var60, var45, var58 + var60, var45 + var59);
                            var49.method2637(var60, var45);
                            var45 -= 2;
                            class10.field197.method421(arg0, arg5, arg0 + arg6, arg3 + arg5);
                        }
                        if (var7 > var9) {
                            class403 var62 = (class403) var33;
                            if (var62.field5376 != -1) {
                                var45 -= 25;
                                class379.field5083[var62.field5376].method2637(arg0 + class601.field7980[0] - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field5400 != -1) {
                                var45 -= 25;
                                class218.field3104[var62.field5400].method2637(class601.field7980[0] + arg0 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field5771 >= 0 && var32.field5771 < class218.field3104.length) {
                            var45 -= 25;
                            class468 var61 = class218.field3104[var32.field5771];
                            var61.method2637(arg0 - ((var61.method1035() >> 1) - class601.field7980[0]), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class403) {
                        int var69 = 0;
                        class149[] var70 = class129.field2154;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class149 var76 = var70[var71];
                            if (var76 != null && var76.field2385 == 1 && class415.field5681[var9 - var7] == var76.field2383) {
                                class468 var77 = class179.field2737[var76.field2389];
                                if (var69 < var77.method1028()) {
                                    var69 = var77.method1028();
                                }
                                if ((class642.field8626 % 20) < 10) {
                                    var77.method2637(class601.field7980[0] + arg0 - 12, var45 - var77.method1028());
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class149[] var64 = class129.field2154;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class149 var67 = var64[var65];
                            if (var67 != null && var67.field2385 == 10 && var8[var9] == var67.field2383) {
                                class468 var68 = class179.field2737[var67.field2389];
                                if (var63 < var68.method1028()) {
                                    var63 = var68.method1028();
                                }
                                var68.method2637(class601.field7980[0] + arg0 - 12, var45 + -var68.method1028());
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (var33.field5592[var73] > class642.field8626) {
                            int var74 = var33.method1773(67) / 2;
                            class352.method2098((byte) 42, arg2, arg4, arg6 >> 1, arg3 >> 1, var33, var74);
                            if (class601.field7980[0] > -1) {
                                int var75 = class153.field2419[var33.field5568[var73]].method1035();
                                if (var73 == 1) {
                                    class601.field7980[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class601.field7980[0] -= var75 - 9;
                                    class601.field7980[1] -= 10;
                                }
                                if (var73 == 3) {
                                    class601.field7980[0] += var75 - 9;
                                    class601.field7980[1] -= 10;
                                }
                                class153.field2419[var33.field5568[var73]].method2637(class601.field7980[0] + arg0 - (var75 >> 1), arg5 - -class601.field7980[1] + -12);
                                class700.field9851.method1303(Integer.toString(var33.field5567[var73]), class601.field7980[0] + arg0 - 1, class601.field7980[1] + arg5 + 3, -1, 8364, 0);
                            }
                        }
                    }
                }
            }
        }
        if (arg1 <= 125) {
            method1149(null, false, null);
        }
        for (int var10 = 0; var10 < class262.field3646; var10++) {
            int var28 = class471.field6306[var10];
            class411 var29;
            if (var28 < 2048) {
                var29 = class572.field7601[var28];
            } else {
                var29 = ((class280) class616.field8143.method2918((long) (var28 - 2048), (byte) -126)).field3983;
            }
            int var30 = class94.field1443[var10];
            class411 var31;
            if (var30 < 2048) {
                var31 = class572.field7601[var30];
            } else {
                var31 = ((class280) class616.field8143.method2918((long) (var30 - 2048), (byte) -59)).field3983;
            }
            class414.method2374(--var29.field5565, var31, arg6, var29, arg2, arg5, (byte) 118, arg4, arg0, arg3);
        }
        int var11 = class193.field2823.field6828 + class193.field2823.field6833 + 2;
        for (int var12 = 0; var12 < class511.field6816; var12++) {
            int var13 = class148.field2372[var12];
            int var14 = class148.field2363[var12];
            int var15 = class148.field2359[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((var14 + 2) > (class148.field2363[var27] - var11) && class148.field2363[var27] + 2 > -var11 + var14 && class148.field2372[var27] + class148.field2359[var27] > -var15 + var13 && (var13 + var15) > (class148.field2372[var27] - class148.field2359[var27]) && var14 > class148.field2363[var27] - var11) {
                        var16 = true;
                        var14 = class148.field2363[var27] - var11;
                    }
                }
            }
            class148.field2363[var12] = var14;
            String var17 = class148.field2369[var12];
            if (class149.field2386 == 0) {
                int var18 = 16776960;
                if (class148.field2361[var12] < 6) {
                    var18 = class711.field9944[class148.field2361[var12]];
                }
                if (class148.field2361[var12] == 6) {
                    var18 = class20.field321 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class148.field2361[var12] == 7) {
                    var18 = (class20.field321 % 20) >= 10 ? 65535 : 255;
                }
                if (class148.field2361[var12] == 8) {
                    var18 = (class20.field321 % 20) < 10 ? 45056 : 8454016;
                }
                if (class148.field2361[var12] == 9) {
                    int var19 = 150 - class148.field2374[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16384000 + 16776960 - (var19 * 327680);
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class148.field2361[var12] == 10) {
                    int var20 = 150 - class148.field2374[var12];
                    if (var20 < 50) {
                        var18 = (var20 * 5) + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = var20 * 327680 - ((var20 - 100) * 5) - 32767745;
                    }
                }
                if (class148.field2361[var12] == 11) {
                    int var21 = 150 - class148.field2374[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = var21 * 327685 - 16318970;
                    } else if (var21 < 150) {
                        var18 = 32768000 + 16777215 - (var21 * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class148.field2367[var12] == 0) {
                    class450.field6177.method1303(var17, arg0 + var13, arg5 + var14, var22, 8364, -16777216);
                }
                if (class148.field2367[var12] == 1) {
                    class450.field6177.method1305(14, -16777216, var17, arg0 + var13, arg5 + var14, class20.field321, var22);
                }
                if (class148.field2367[var12] == 2) {
                    class450.field6177.method1304(arg0 + var13, var17, var22, false, -16777216, arg5 + var14, class20.field321);
                }
                if (class148.field2367[var12] == 3) {
                    class450.field6177.method1306(-16777216, var17, var22, arg5 + var14, (byte) -81, arg0 + var13, class20.field321, 150 - class148.field2374[var12]);
                }
                if (class148.field2367[var12] == 4) {
                    int var23 = (150 - class148.field2374[var12]) * (class193.field2823.method2847(var17, (byte) -118) + 100) / 150;
                    class10.field197.method459(arg0 + var13 - 50, arg5, arg0 + var13 + 50, arg3 + arg5);
                    class450.field6177.method1288((byte) 83, arg0 - (-var13 - 50) - var23, var22, -16777216, var17, arg5 + var14);
                    class10.field197.method421(arg0, arg5, arg0 + arg6, arg3 + arg5);
                }
                if (class148.field2367[var12] == 5) {
                    int var24 = 150 - class148.field2374[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class193.field2823.field6828 + class193.field2823.field6833;
                    class10.field197.method459(arg0, arg5 + var14 - var26 - 1, arg0 + arg6, arg5 + var14 + 5);
                    class450.field6177.method1303(var17, arg0 + var13, arg5 + var14 + var25, var22, 8364, -16777216);
                    class10.field197.method421(arg0, arg5, arg0 + arg6, arg3 + arg5);
                }
            } else {
                class450.field6177.method1303(var17, arg0 + var13, arg5 + var14, -256, 8364, -16777216);
            }
        }
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V", line = 617)
    public class168() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "([Lte;ZLno;)Lvca;", line = 622)
    public static final class260 method1149(class575[] arg0, boolean arg1, class658 arg2) {
        field2597++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field7608 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        if (arg1) {
            field2605 = -59;
        }
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field7608);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class701.field9876, 0);
        if (class701.field9876[0] == 0) {
            if (class701.field9876[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class701.field9876, 1);
            if (class701.field9876[1] > 1) {
                byte[] var7 = new byte[class701.field9876[1]];
                OpenGL.glGetInfoLogARB(var4, class701.field9876[1], class701.field9876, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class701.field9876[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field7608);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class260(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "(I)V", line = 692)
    public static void method1150(int arg0) {
        if (arg0 == 0) {
            field2599 = null;
            field2600 = null;
        }
    }
}
