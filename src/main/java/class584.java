import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class584 {

    @OriginalMember(owner = "client!du", name = "b", descriptor = "[B")
    private byte[] field8288;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "[I")
    private int[] field8289;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "[I")
    private int[] field8294;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "F")
    public static float field8291;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field8290;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field8292;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II[B[BII)I")
    public final int method3303(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        if (arg5 != 10) {
            field8291 = 1.9476061F;
        }
        field8293++;
        int var7 = 0;
        int var8 = arg0 + arg4;
        int var9 = arg1 << 3;
        while (var8 > arg0) {
            int var10 = arg3[arg0] & 0xFF;
            int var11 = this.field8289[var10];
            byte var12 = this.field8288[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var12 + var14 - 1 >> 3);
            var9 += var12;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class422.method2436(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg2[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIBIIII)V")
    public static final void method3304(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field8290++;
        int var7 = class306.field3786;
        class262.field3267 = 0;
        int[] var8 = class396.field5353;
        for (int var9 = 0; var9 < (class651.field9144 + var7); var9++) {
            class210 var32 = null;
            class677 var33;
            if (var7 > var9) {
                var33 = class139.field1540[var8[var9]];
            } else {
                var33 = ((class214) class274.field3433.method3669((long) class398.field5375[var9 - var7], -1)).field2601;
                var32 = ((class600) var33).field8461;
                if (var32.field2492 != null) {
                    var32 = var32.method1247((byte) 42, class628.field8859);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (var33.field9508 >= 0 && (class330.field4057 == var33.field9470 || class362.field4859.field5166 == var33.field5166)) {
                class465.method2686(var33, arg5 >> 1, 6, arg1, arg0, var33.method3365((byte) -128), arg3 >> 1);
                if (class703.field9873[0] >= 0) {
                    if (var33.field9454 != null && (var9 >= var7 || class593.field8376 == 0 || class593.field8376 == 3 || class593.field8376 == 1 && class573.method3236(((class236) var33).field2893, 0)) && class315.field3923 > class262.field3267) {
                        class315.field3920[class262.field3267] = class488.field7097.method2657((byte) 62, var33.field9454) / 2;
                        class315.field3922[class262.field3267] = class703.field9873[0];
                        class315.field3924[class262.field3267] = class703.field9873[1];
                        class315.field3916[class262.field3267] = var33.field9462;
                        class315.field3915[class262.field3267] = var33.field9437;
                        class315.field3918[class262.field3267] = var33.field9461;
                        class315.field3917[class262.field3267] = var33.field9454;
                        class262.field3267++;
                    }
                    int var34 = class703.field9873[1] + arg6;
                    int var45;
                    if (var33.field9505 || var33.field9471 <= class678.field9539) {
                        var45 = var34 - Math.max(class488.field7097.field6601, class50.field505[0].method306());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var7 > var9) {
                            class236 var37 = class139.field1540[var8[var9]];
                            var38 = var33.method3737((byte) 94).field7639;
                            if (var37.field2895) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field2507;
                            if (var38 == -1) {
                                var38 = var33.method3737((byte) 46).field7639;
                            }
                        }
                        class534[] var39 = class50.field505;
                        if (var38 != -1) {
                            class534[] var40 = (class534[]) class162.field1815.method78(0, (long) var38);
                            if (var40 == null) {
                                class550[] var41 = class550.method3117(class408.field5441, var38, 0);
                                if (var41 != null) {
                                    var40 = new class534[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class701.field9813.method1041(var41[var42], true);
                                    }
                                    class162.field1815.method92(1, (long) var38, var40);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var36 >= var39.length) {
                            var36 = 1;
                        }
                        class534 var43 = var39[0];
                        class534 var44 = var39[var36];
                        var45 = var34 - Math.max(class488.field7097.field6601, var43.method306());
                        int var46 = class703.field9873[0] + (arg4 - (var43.method315() >> 1));
                        int var47 = var43.method315() * var33.field9426 / 255;
                        if (var33.field9426 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method3001(var46, var45);
                        class701.field9813.method941(var46, var45, var46 + var47, var45 + var43.method306());
                        var44.method3001(var46, var45);
                        class701.field9813.method982(arg4, arg6, arg4 + arg5, arg3 + arg6);
                    }
                    var45 -= 2;
                    if (!var33.field9505) {
                        if (class678.field9539 < var33.field9493) {
                            class534 var48 = class356.field4786[var33.field9472 ? 2 : 0];
                            class534 var49 = class356.field4786[var33.field9472 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class600) {
                                var51 = var32.field2509;
                                if (var51 == -1) {
                                    var51 = var33.method3737((byte) 115).field7669;
                                }
                            } else {
                                var51 = var33.method3737((byte) 116).field7669;
                            }
                            if (var51 != -1) {
                                class534[] var52 = (class534[]) class697.field9777.method78(0, (long) var51);
                                if (var52 == null) {
                                    class550[] var53 = class550.method3117(class408.field5441, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class534[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class701.field9813.method1041(var53[var54], true);
                                        }
                                        class697.field9777.method92(1, (long) var51, var52);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var49 = var52[var33.field9472 ? 3 : 1];
                                    var48 = var52[var33.field9472 ? 2 : 0];
                                }
                            }
                            int var55 = var33.field9493 - class678.field9539;
                            int var58;
                            if (var55 > var33.field9419) {
                                int var56 = var55 - var33.field9419;
                                int var57 = var33.field9430 == 0 ? 0 : (var33.field9433 - var56) / var33.field9430 * var33.field9430;
                                var58 = var48.method315() * var57 / var33.field9433;
                            } else {
                                var58 = var48.method315();
                            }
                            int var59 = var48.method306();
                            var45 -= var59;
                            int var60 = class703.field9873[0] + arg4 - (var48.method315() >> 1);
                            var48.method3001(var60, var45);
                            class701.field9813.method941(var60, var45, var58 + var60, var45 - -var59);
                            var49.method3001(var60, var45);
                            var45 -= 2;
                            class701.field9813.method982(arg4, arg6, arg4 + arg5, arg6 - -arg3);
                        }
                        if (var7 > var9) {
                            class236 var62 = (class236) var33;
                            if (var62.field2915 != -1) {
                                var45 -= 25;
                                class526.field7420[var62.field2915].method3001(class703.field9873[0] + arg4 - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field2939 != -1) {
                                var45 -= 25;
                                class286.field3578[var62.field2939].method3001(class703.field9873[0] + arg4 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field2473 >= 0 && var32.field2473 < class286.field3578.length) {
                            class534 var61 = class286.field3578[var32.field2473];
                            var45 -= 25;
                            var61.method3001(arg4 + class703.field9873[0] - (var61.method315() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class236)) {
                        int var63 = 0;
                        class99[] var64 = class497.field7195;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class99 var67 = var64[var65];
                            if (var67 != null && var67.field1066 == 1 && class398.field5375[var9 - var7] == var67.field1071) {
                                class534 var68 = class678.field9535[var67.field1059];
                                if (var68.method306() > var63) {
                                    var63 = var68.method306();
                                }
                                if ((class678.field9539 % 20) < 10) {
                                    var68.method3001(arg4 + class703.field9873[0] - 12, var45 + -var68.method306());
                                }
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var69 = 0;
                        class99[] var70 = class497.field7195;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class99 var73 = var70[var71];
                            if (var73 != null && var73.field1066 == 10 && var8[var9] == var73.field1071) {
                                class534 var74 = class678.field9535[var73.field1059];
                                if (var69 < var74.method306()) {
                                    var69 = var74.method306();
                                }
                                var74.method3001(class703.field9873[0] + arg4 - 12, -var74.method306() + var45);
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var75 = 0; var75 < 4; var75++) {
                        if (class678.field9539 < var33.field9432[var75]) {
                            int var76 = var33.method3365((byte) -124) / 2;
                            class465.method2686(var33, arg5 >> 1, 6, arg1, arg0, var76, arg3 >> 1);
                            if (class703.field9873[0] > -1) {
                                int var77 = class470.field6746[var33.field9463[var75]].method315();
                                if (var75 == 1) {
                                    class703.field9873[1] -= 20;
                                }
                                if (var75 == 2) {
                                    class703.field9873[1] -= 10;
                                    class703.field9873[0] -= var77 - 9;
                                }
                                if (var75 == 3) {
                                    class703.field9873[0] += var77 - 9;
                                    class703.field9873[1] -= 10;
                                }
                                class470.field6746[var33.field9463[var75]].method3001(arg4 + class703.field9873[0] - (var77 >> 1), class703.field9873[1] + arg6 + -12);
                                class198.field2349.method2325(Integer.toString(var33.field9441[var75]), -1, 1292016200, 0, arg6 + class703.field9873[1] + 3, class703.field9873[0] + arg4 + -1);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class436.field6159; var10++) {
            int var28 = class346.field4648[var10];
            class677 var29;
            if (var28 < 2048) {
                var29 = class139.field1540[var28];
            } else {
                var29 = ((class214) class274.field3433.method3669((long) (var28 - 2048), -1)).field2601;
            }
            int var30 = class137.field1502[var10];
            class677 var31;
            if (var30 >= 2048) {
                var31 = ((class214) class274.field3433.method3669((long) (var30 - 2048), -1)).field2601;
            } else {
                var31 = class139.field1540[var30];
            }
            class59.method318(arg0, arg2 ^ 0xFFFFFAB3, arg1, arg6, arg4, var29, var31, arg3, --var29.field9418, arg5);
        }
        int var11 = class488.field7097.field6601 + class488.field7097.field6596 + 2;
        if (arg2 != -119) {
            return;
        }
        for (int var12 = 0; var12 < class262.field3267; var12++) {
            int var13 = class315.field3922[var12];
            int var14 = class315.field3924[var12];
            int var15 = class315.field3920[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if (var14 + 2 > class315.field3924[var27] + -var11 && (class315.field3924[var27] + 2) > (var14 - var11) && class315.field3922[var27] + class315.field3920[var27] > -var15 + var13 && class315.field3922[var27] - class315.field3920[var27] < var13 + var15 && var14 > (class315.field3924[var27] - var11)) {
                        var16 = true;
                        var14 = class315.field3924[var27] - var11;
                    }
                }
            }
            class315.field3924[var12] = var14;
            String var17 = class315.field3917[var12];
            if (class673.field9372 == 0) {
                int var18 = 16776960;
                if (class315.field3916[var12] < 6) {
                    var18 = class422.field5774[class315.field3916[var12]];
                }
                if (class315.field3916[var12] == 6) {
                    var18 = class330.field4057 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class315.field3916[var12] == 7) {
                    var18 = class330.field4057 % 20 < 10 ? 255 : 65535;
                }
                if (class315.field3916[var12] == 8) {
                    var18 = class330.field4057 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class315.field3916[var12] == 9) {
                    int var19 = 150 - class315.field3918[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - ((var19 - 50) * 327680);
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class315.field3916[var12] == 10) {
                    int var20 = 150 - class315.field3918[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16384000 + 16711935 - (var20 * 327680);
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - ((var20 - 100) * 5);
                    }
                }
                if (class315.field3916[var12] == 11) {
                    int var21 = 150 - class315.field3918[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - ((var21 - 100) * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class315.field3915[var12] == 0) {
                    class282.field3535.method2325(var17, var22, 1292016200, -16777216, arg6 + var14, arg4 - -var13);
                }
                if (class315.field3915[var12] == 1) {
                    class282.field3535.method2328(5, var22, arg6 + var14, arg4 + var13, class330.field4057, var17, -16777216);
                }
                if (class315.field3915[var12] == 2) {
                    class282.field3535.method2316(var17, arg6 + var14, arg4 + var13, -16777216, (byte) 61, var22, class330.field4057);
                }
                if (class315.field3915[var12] == 3) {
                    class282.field3535.method2317(2, arg4 + var13, var22, 150 - class315.field3918[var12], -16777216, class330.field4057, arg6 + var14, var17);
                }
                if (class315.field3915[var12] == 4) {
                    int var23 = (150 - class315.field3918[var12]) * (class488.field7097.method2657((byte) 62, var17) + 100) / 150;
                    class701.field9813.method941(arg4 + var13 - 50, arg6, var13 + arg4 + 50, arg3 + arg6);
                    class282.field3535.method2318(var17, -16777216, arg4 + var13 + 50 - var23, 0, var22, arg6 + var14);
                    class701.field9813.method982(arg4, arg6, arg4 + arg5, arg3 + arg6);
                }
                if (class315.field3915[var12] == 5) {
                    int var24 = 150 - class315.field3918[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class488.field7097.field6601 + class488.field7097.field6596;
                    class701.field9813.method941(arg4, var14 + arg6 - var26 - 1, arg4 + arg5, arg6 + var14 + 5);
                    class282.field3535.method2325(var17, var22, 1292016200, -16777216, arg6 + var14 + var25, arg4 + var13);
                    class701.field9813.method982(arg4, arg6, arg4 + arg5, arg3 + arg6);
                }
            } else {
                class282.field3535.method2325(var17, -256, 1292016200, -16777216, arg6 + var14, arg4 + var13);
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([BB[BIII)I")
    public final int method3305(byte[] arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field8287++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg4 + arg5;
        int var8 = -93 / ((69 - arg1) / 54);
        int var9 = 0;
        int var10 = arg3;
        while (true) {
            byte var11 = arg2[var10];
            if (var11 < 0) {
                var9 = this.field8294[var9];
            } else {
                var9++;
            }
            int var12;
            if ((var12 = this.field8294[var9]) < 0) {
                arg0[arg5++] = (byte) (~var12);
                if (var7 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var9++;
            } else {
                var9 = this.field8294[var9];
            }
            int var13;
            if ((var13 = this.field8294[var9]) < 0) {
                arg0[arg5++] = (byte) (~var13);
                if (var7 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var9++;
            } else {
                var9 = this.field8294[var9];
            }
            int var14;
            if ((var14 = this.field8294[var9]) < 0) {
                arg0[arg5++] = (byte) (~var14);
                if (var7 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var9++;
            } else {
                var9 = this.field8294[var9];
            }
            int var15;
            if ((var15 = this.field8294[var9]) < 0) {
                arg0[arg5++] = (byte) (~var15);
                if (var7 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var9++;
            } else {
                var9 = this.field8294[var9];
            }
            int var16;
            if ((var16 = this.field8294[var9]) < 0) {
                arg0[arg5++] = (byte) (~var16);
                if (var7 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var9++;
            } else {
                var9 = this.field8294[var9];
            }
            int var17;
            if ((var17 = this.field8294[var9]) < 0) {
                arg0[arg5++] = (byte) (~var17);
                if (var7 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var9++;
            } else {
                var9 = this.field8294[var9];
            }
            int var18;
            if ((var18 = this.field8294[var9]) < 0) {
                arg0[arg5++] = (byte) (~var18);
                if (arg5 >= var7) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var9++;
            } else {
                var9 = this.field8294[var9];
            }
            int var19;
            if ((var19 = this.field8294[var9]) < 0) {
                arg0[arg5++] = (byte) (~var19);
                if (var7 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg3;
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "([B)V")
    public class584(byte[] arg0) {
        int var2 = arg0.length;
        this.field8288 = arg0;
        this.field8289 = new int[var2];
        int[] var3 = new int[33];
        this.field8294 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field8289[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class422.method2436(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field8294[var14] == 0) {
                            this.field8294[var14] = var4;
                        }
                        var14 = this.field8294[var14];
                    }
                    if (var14 >= this.field8294.length) {
                        int[] var17 = new int[this.field8294.length * 2];
                        for (int var18 = 0; var18 < this.field8294.length; var18++) {
                            var17[var18] = this.field8294[var18];
                        }
                        this.field8294 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field8294[var14] = ~var5;
            }
        }
    }
}
