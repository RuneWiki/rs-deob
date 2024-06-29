import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class93 {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field1286 = 0;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Z")
    public static boolean field1287;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)V", line = 8)
    public static final void method695(byte arg0, int arg1, String arg2, String arg3) {
        class141.method1021(arg2, arg3, -1, -42, (String) null, arg1);
        int var4 = -4 / ((47 - arg0) / 48);
        field1288++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIZ)V", line = 21)
    public static final void method697(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1284++;
        class52.field701 = 0;
        if (arg6) {
            field1287 = false;
        }
        for (int var7 = -1; var7 < class338.field5084 + class292.field4352; var7++) {
            class256 var8;
            if (var7 == -1) {
                var8 = class173.field2356;
            } else if (class292.field4352 <= var7) {
                var8 = class42.field484[class257.field3807[var7 - class292.field4352]];
            } else {
                var8 = class169.field2306[class4.field35[var7]];
            }
            if (var8 != null && var8.method1652((byte) -50)) {
                if (var8 instanceof class329) {
                    class181 var9 = ((class329) var8).field4961;
                    if (var9.field2476 != null) {
                        var9 = var9.method1266((byte) 126);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class292.field4352) {
                    class181 var15 = ((class329) var8).field4961;
                    if (var15.field2476 != null) {
                        var15 = var15.method1266((byte) 124);
                    }
                    if (var15.field2425 >= 0 && class289.field4312.length > var15.field2425) {
                        int var16;
                        if (var15.field2464 == -1) {
                            var16 = var8.method1748((byte) 93) + 15;
                        } else {
                            var16 = var15.field2464 + 15;
                        }
                        class279.method1933((byte) -93, arg2 >> 1, arg3, arg1 >> 1, arg5, var16, var8);
                        if (class208.field3001 > -1) {
                            class289.field4312[var15.field2425].method840(class208.field3001 + arg4 - 12, class330.field4982 + arg0 + -30);
                        }
                    }
                    class324[] var17 = class294.field4367;
                    for (int var18 = 0; var18 < var17.length; var18++) {
                        class324 var19 = var17[var18];
                        if (var19 != null && var19.field4910 == 1 && class257.field3807[var7 - class292.field4352] == var19.field4906 && class329.field4966 % 20 < 10) {
                            int var20;
                            if (var15.field2464 == -1) {
                                var20 = var8.method1748((byte) 93) + 15;
                            } else {
                                var20 = var15.field2464 + 15;
                            }
                            class279.method1933((byte) -62, arg2 >> 1, arg3, arg1 >> 1, arg5, var20, var8);
                            if (class208.field3001 > -1) {
                                class286.field4252[var19.field4915].method840(class208.field3001 + arg4 - 12, class330.field4982 + arg0 - 28);
                            }
                        }
                    }
                } else {
                    int var10 = 30;
                    class241 var11 = (class241) var8;
                    if (var11.field3411 != -1 || var11.field3431 != -1) {
                        class279.method1933((byte) -33, arg2 >> 1, arg3, arg1 >> 1, arg5, var8.method1748((byte) 93) + 15, var8);
                        if (class208.field3001 > -1) {
                            if (var11.field3411 != -1) {
                                class293.field4360[var11.field3411].method840(arg4 + class208.field3001 - 12, -var10 + arg0 + class330.field4982);
                                var10 += 25;
                            }
                            if (var11.field3431 != -1) {
                                class289.field4312[var11.field3431].method840(class208.field3001 + arg4 - 12, class330.field4982 - var10 + arg0);
                                var10 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var12 = 0;
                        class324[] var13 = class294.field4367;
                        while (var13.length > var12) {
                            class324 var14 = var13[var12];
                            if (var14 != null && var14.field4910 == 10 && class4.field35[var7] == var14.field4906) {
                                class279.method1933((byte) -59, arg2 >> 1, arg3, arg1 >> 1, arg5, var8.method1748((byte) 93) + 15, var8);
                                if (class208.field3001 > -1) {
                                    class286.field4252[var14.field4915].method840(class208.field3001 + arg4 - 12, class330.field4982 + arg0 + -var10);
                                }
                            }
                            var12++;
                        }
                    }
                }
                if (var8.field3739 != null && (var7 >= class292.field4352 || class196.field2738 == 0 || class196.field2738 == 3 || class196.field2738 == 1 && class291.method1993(((class241) var8).field3439, (byte) 110))) {
                    class279.method1933((byte) -124, arg2 >> 1, arg3, arg1 >> 1, arg5, var8.method1748((byte) 93), var8);
                    if (class208.field3001 > -1 && class52.field701 < class126.field1742) {
                        class126.field1733[class52.field701] = class204.field2946.method1904(var8.field3739) / 2;
                        class126.field1720[class52.field701] = class204.field2946.field4143;
                        class126.field1744[class52.field701] = class208.field3001;
                        class126.field1730[class52.field701] = class330.field4982;
                        class126.field1734[class52.field701] = var8.field3763;
                        class126.field1726[class52.field701] = var8.field3765;
                        class126.field1729[class52.field701] = var8.field3677;
                        class126.field1722[class52.field701] = var8.field3739;
                        class52.field701++;
                    }
                }
                if (class329.field4966 < var8.field3707) {
                    class170 var21 = class35.field406[0];
                    class170 var22 = class35.field406[1];
                    int var26;
                    if (var8 instanceof class329) {
                        class329 var23 = (class329) var8;
                        class170[] var24 = (class170[]) ((class170[]) class16.field196.method716((long) var23.field4961.field2462, false));
                        if (var24 == null) {
                            var24 = class119.method867(128, 0, class204.field2948, var23.field4961.field2462);
                            if (var24 != null) {
                                class16.field196.method721((long) var23.field4961.field2462, var24, 0);
                            }
                        }
                        class181 var25 = var23.field4961;
                        if (var24 != null && var24.length == 2) {
                            var22 = var24[1];
                            var21 = var24[0];
                        }
                        if (var25.field2464 == -1) {
                            var26 = var8.method1748((byte) 93);
                        } else {
                            var26 = var25.field2464;
                        }
                    } else {
                        var26 = var8.method1748((byte) 93);
                    }
                    class279.method1933((byte) -34, arg2 >> 1, arg3, arg1 >> 1, arg5, var21.field2317 + var26 + 10, var8);
                    if (class208.field3001 > -1) {
                        int var27 = class208.field3001 + arg4 - (var21.field2323 >> 1);
                        int var28 = arg0 - (3 - class330.field4982);
                        var21.method840(var27, var28);
                        int var29 = var8.field3661 * var21.field2323 / 255;
                        int var30 = var21.field2317;
                        if (class67.field908) {
                            class102.method742(var27, var28, var27 + var29, var28 + var30);
                        } else {
                            class38.method217(var27, var28, var27 + var29, var28 + var30);
                        }
                        var22.method840(var27, var28);
                        if (class67.field908) {
                            class102.method753(arg4, arg0, arg4 + arg1, arg0 + arg2);
                        } else {
                            class38.method220(arg4, arg0, arg1 + arg4, arg0 + arg2);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (class329.field4966 < var8.field3716[var31]) {
                        int var32;
                        if ((var8 instanceof class329)) {
                            class329 var33 = (class329) var8;
                            class181 var34 = var33.field4961;
                            if (var34.field2464 == -1) {
                                var32 = var8.method1748((byte) 93) / 2;
                            } else {
                                var32 = var34.field2464 / 2;
                            }
                        } else {
                            var32 = var8.method1748((byte) 93) / 2;
                        }
                        class279.method1933((byte) -90, arg2 >> 1, arg3, arg1 >> 1, arg5, var32, var8);
                        if (class208.field3001 > -1) {
                            if (var31 == 1) {
                                class330.field4982 -= 20;
                            }
                            if (var31 == 2) {
                                class330.field4982 -= 10;
                                class208.field3001 -= 15;
                            }
                            if (var31 == 3) {
                                class330.field4982 -= 10;
                                class208.field3001 += 15;
                            }
                            class332.field4999[var8.field3695[var31]].method840(class208.field3001 + arg4 - 12, class330.field4982 + arg0 + -12);
                            class37.field426.method1909(Integer.toString(var8.field3714[var31]), class208.field3001 + arg4 - 1, arg0 - -class330.field4982 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var35 = 0; var35 < class52.field701; var35++) {
            int var36 = class126.field1744[var35];
            int var37 = class126.field1730[var35];
            int var38 = class126.field1733[var35];
            int var39 = class126.field1720[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (var37 + 2 > class126.field1730[var41] + -class126.field1720[var41] && (var37 - var39) < (class126.field1730[var41] + 2) && (var36 - var38) < (class126.field1744[var41] + class126.field1733[var41]) && (class126.field1744[var41] - class126.field1733[var41]) < (var36 + var38) && class126.field1730[var41] - class126.field1720[var41] < var37) {
                        var40 = true;
                        var37 = class126.field1730[var41] - class126.field1720[var41];
                    }
                }
            }
            class208.field3001 = class126.field1744[var35];
            class330.field4982 = class126.field1730[var35] = var37;
            String var42 = class126.field1722[var35];
            if (class234.field3316 == 0) {
                int var43 = 16776960;
                if (class126.field1734[var35] < 6) {
                    var43 = class323.field4902[class126.field1734[var35]];
                }
                if (class126.field1734[var35] == 6) {
                    var43 = (class8.field83 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class126.field1734[var35] == 7) {
                    var43 = class8.field83 % 20 >= 10 ? 65535 : 255;
                }
                if (class126.field1734[var35] == 8) {
                    var43 = class8.field83 % 20 < 10 ? 45056 : 8454016;
                }
                if (class126.field1734[var35] == 9) {
                    int var44 = 150 - class126.field1729[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - (var44 * 327680 - 16384000);
                    } else if (var44 < 150) {
                        var43 = var44 * 5 + 64780;
                    }
                }
                if (class126.field1734[var35] == 10) {
                    int var45 = 150 - class126.field1729[var35];
                    if (var45 < 50) {
                        var43 = (var45 * 5) + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - (var45 * 327680 - 16384000);
                    } else if (var45 < 150) {
                        var43 = -((var45 - 100) * 5) - (-(var45 * 327680) - 255) - 32768000;
                    }
                }
                if (class126.field1734[var35] == 11) {
                    int var46 = 150 - class126.field1729[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 49545215 - (var46 * 327680);
                    }
                }
                if (class126.field1726[var35] == 0) {
                    class204.field2946.method1909(var42, class208.field3001 + arg4, class330.field4982 + arg0, var43, 0);
                }
                if (class126.field1726[var35] == 1) {
                    class204.field2946.method1907(var42, class208.field3001 + arg4, arg0 - -class330.field4982, var43, 0, class8.field83);
                }
                if (class126.field1726[var35] == 2) {
                    class204.field2946.method1906(var42, class208.field3001 + arg4, class330.field4982 + arg0, var43, 0, class8.field83);
                }
                if (class126.field1726[var35] == 3) {
                    class204.field2946.method1913(var42, arg4 + class208.field3001, class330.field4982 + arg0, var43, 0, class8.field83, 150 - class126.field1729[var35]);
                }
                if (class126.field1726[var35] == 4) {
                    int var47 = (150 - class126.field1729[var35]) * (class204.field2946.method1904(var42) + 100) / 150;
                    if (class67.field908) {
                        class102.method742(class208.field3001 + arg4 - 50, arg0, class208.field3001 + arg4 + 50, arg0 + arg2);
                    } else {
                        class38.method217(class208.field3001 + arg4 - 50, arg0, arg4 + class208.field3001 + 50, arg0 + arg2);
                    }
                    class204.field2946.method1911(var42, class208.field3001 + arg4 + 50 - var47, class330.field4982 + arg0, var43, 0);
                    if (class67.field908) {
                        class102.method753(arg4, arg0, arg1 + arg4, arg0 - -arg2);
                    } else {
                        class38.method220(arg4, arg0, arg4 + arg1, arg0 - -arg2);
                    }
                }
                if (class126.field1726[var35] == 5) {
                    int var48 = 150 - class126.field1729[var35];
                    if (class67.field908) {
                        class102.method742(arg4, class330.field4982 + arg0 - class204.field2946.field4143 - 1, arg1 + arg4, class330.field4982 + arg0 + 5);
                    } else {
                        class38.method217(arg4, class330.field4982 + arg0 - class204.field2946.field4143 - 1, arg4 - -arg1, class330.field4982 + arg0 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class204.field2946.method1909(var42, class208.field3001 + arg4, class330.field4982 + var49 + arg0, var43, 0);
                    if (class67.field908) {
                        class102.method753(arg4, arg0, arg1 + arg4, arg0 + arg2);
                    } else {
                        class38.method220(arg4, arg0, arg1 + arg4, arg0 + arg2);
                    }
                }
            } else {
                class204.field2946.method1909(var42, class208.field3001 + arg4, class330.field4982 + arg0, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 521)
    public static final void method699(int arg0) {
        if (class312.field4712 < 0) {
            class312.field4712 = 0;
            class126.field1721 = -1;
            class210.field3044 = -1;
        }
        if (class20.field258 < class312.field4712) {
            class126.field1721 = -1;
            class312.field4712 = class20.field258;
            class210.field3044 = -1;
        }
        if (class170.field2315 < 0) {
            class126.field1721 = -1;
            class170.field2315 = 0;
            class210.field3044 = -1;
        }
        if (arg0 < 49) {
            return;
        }
        if (class56.field765 < class170.field2315) {
            class170.field2315 = class56.field765;
            class126.field1721 = -1;
            class210.field3044 = -1;
        }
        field1285++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)Lki;")
    public abstract class160 method696(byte arg0);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)I")
    public abstract int method698(byte arg0, int arg1);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method700(int arg0, byte arg1);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(BI)V")
    public abstract void method701(byte arg0, int arg1);
}
