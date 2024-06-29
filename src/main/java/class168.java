import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class168 extends class115 {

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2435 = "flash3:";

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "[Z")
    public static boolean[] field2434 = new boolean[8];

    @OriginalMember(owner = "client!pl", name = "Z", descriptor = "Z")
    public static boolean field2441 = false;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "Lh;")
    public static class190 field2428 = new class190(32);

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!pl", name = "V", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!pl", name = "W", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!pl", name = "X", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!pl", name = "Y", descriptor = "Luk;")
    public static class78 field2440;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "[Lrh;")
    private class119[] field2431;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2437;
        int var8 = 0;
        int var9 = arg6;
        int var10 = arg1;
        int var11 = -arg0 + arg5;
        int var12 = -arg0 + arg6;
        int var13 = arg5 * arg5;
        int var14 = var11 * var11;
        int var15 = arg6 * arg6;
        int var16 = var12 * var12;
        int var17 = var15 << 1;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = arg6 << 1;
        int var21 = var13 << 1;
        int var22 = var15 - (var20 + -1) * var21;
        int var23 = var12 << 1;
        int var24 = (-var20 + 1) * var13 + var17;
        int var25 = (-var23 + 1) * var14 + var19;
        int var26 = -((var23 + -1) * var18) + var16;
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var20 + -3) * var21;
        int var33 = var19 * 3;
        int var34 = (var23 - 3) * var18;
        int var35 = var28;
        int var36 = (arg6 + -1) * var27;
        int var37 = (var12 + -1) * var29;
        if (~arg4 <= ~class93.field1418 && class254.field3857 >= arg4) {
            int[] var38 = class163.field2370[arg4];
            int var39 = class177.method1152(class93.field1412, class142.field2061, -arg5 + arg7, 119);
            int var40 = class177.method1152(class93.field1412, class142.field2061, arg5 + arg7, 118);
            int var41 = class177.method1152(class93.field1412, class142.field2061, arg7 - var11, arg1 ^ 114);
            int var42 = class177.method1152(class93.field1412, class142.field2061, arg7 + var11, 116);
            class183.method1181(arg3, (byte) -69, var41, var38, var39);
            class183.method1181(arg2, (byte) -69, var42, var38, var41);
            class183.method1181(arg3, (byte) -69, var40, var38, var42);
        }
        int var43 = var30;
        while (~var9 < -1) {
            if (var24 < 0) {
                while (~var24 > -1) {
                    var24 += var31;
                    ++var8;
                    var31 += var28;
                    var22 += var35;
                    var35 += var28;
                }
            }
            if (~var22 > -1) {
                var22 += var35;
                var24 += var31;
                var35 += var28;
                var31 += var28;
                ++var8;
            }
            var22 += -var32;
            var32 -= var27;
            var24 += -var36;
            var36 -= var27;
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (~var25 > -1) {
                        ++var10;
                        var26 += var43;
                        var43 += var30;
                        var25 += var33;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    ++var10;
                    var26 += var43;
                    var33 += var30;
                    var43 += var30;
                }
                var25 += -var37;
                var26 += -var34;
                var37 -= var29;
                var34 -= var29;
            }
            --var9;
            int var45 = arg4 - -var9;
            int var46 = -var9 + arg4;
            if (~class93.field1418 >= ~var45 && ~class254.field3857 <= ~var46) {
                int var47 = class177.method1152(class93.field1412, class142.field2061, arg7 - -var8, 123);
                int var48 = class177.method1152(class93.field1412, class142.field2061, arg7 - var8, -59);
                if (var44) {
                    int var49 = class177.method1152(class93.field1412, class142.field2061, arg7 + var10, 122);
                    int var50 = class177.method1152(class93.field1412, class142.field2061, -var10 + arg7, arg1 ^ 15);
                    if (class93.field1418 <= var46) {
                        int[] var51 = class163.field2370[var46];
                        class183.method1181(arg3, (byte) -69, var50, var51, var48);
                        class183.method1181(arg2, (byte) -69, var49, var51, var50);
                        class183.method1181(arg3, (byte) -69, var47, var51, var49);
                    }
                    if (~class254.field3857 <= ~var45) {
                        int[] var52 = class163.field2370[var45];
                        class183.method1181(arg3, (byte) -69, var50, var52, var48);
                        class183.method1181(arg2, (byte) -69, var49, var52, var50);
                        class183.method1181(arg3, (byte) -69, var47, var52, var49);
                    }
                } else {
                    if (class93.field1418 <= var46) {
                        class183.method1181(arg3, (byte) -69, var47, class163.field2370[var46], var48);
                    }
                    if (~var45 >= ~class254.field3857) {
                        class183.method1181(arg3, (byte) -69, var47, class163.field2370[var45], var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lve;Lve;ZLve;)V")
    public static final void method1112(class233 arg0, class233 arg1, boolean arg2, class233 arg3) {
        ++field2436;
        class45.field636 = arg0;
        if (!arg2) {
            class37.field542 = arg3;
            class284.field4531 = arg1;
        }
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V")
    public static void method1113(int arg0) {
        field2440 = null;
        field2428 = null;
        field2435 = null;
        field2434 = null;
        if (arg0 != 3) {
            method1115((byte) 62);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZII)V")
    public static final void method1114(boolean arg0, int arg1, int arg2) {
        ++field2427;
        if (arg0) {
            field2440 = null;
        }
        if (class159.method1072((byte) -14, arg1)) {
            class281.method1888(arg2, 30001, class19.field268[arg1]);
        }
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(B)V")
    public static final void method1115(byte arg0) {
        ++field2439;
        if (arg0 >= 6) {
            if (!class202.method1310(false) && ~class31.field456 != ~class163.field2364) {
                class271.method1823(class55.field847.field119[0], class156.field2280, class55.field847.field50[0], class163.field2364, 0, class200.field2893, false);
            } else if (class163.field2364 != class129.field1891 && class5.method56(32, class163.field2364)) {
                class129.field1891 = class163.field2364;
                class209.method1340((byte) 0);
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "(I)Ljava/lang/String;")
    public static final String method1116(int arg0) {
        ++field2430;
        if (arg0 != 2) {
            field2441 = false;
        }
        String var1;
        if (~class204.field2963 == -2 && class283.field4508 < 2) {
            var1 = class240.field3609 + class20.field272 + class207.field3002 + " ->";
        } else if (class275.field4406 && ~class283.field4508 > -3) {
            var1 = class214.field3087 + class20.field272 + class14.field214 + " ->";
        } else if (class268.field4204 && class19.field267[81] && class283.field4508 > 2) {
            var1 = class274.method1849((byte) 98, class283.field4508 + -2);
        } else {
            var1 = class274.method1849((byte) 98, class283.field4508 - 1);
        }
        if (~class283.field4508 < -3) {
            var1 = var1 + "<col=ffffff> / " + (class283.field4508 + -2) + class99.field1481;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        if (arg0 != 242152972) {
            method1116(-94);
        }
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            this.method1117((byte) 117, super.field1705.method462((byte) -86));
        }
        ++field2426;
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        if (arg0 >= -33) {
            return null;
        } else {
            ++field2429;
            int[][] var3 = super.field1716.method6(arg1, (byte) -84);
            if (super.field1716.field23) {
                int var4 = class192.field2753;
                int var5 = class77.field1178;
                int[][] var6 = new int[var4][var5];
                int[][][] var7 = super.field1716.method4(122);
                this.method1117((byte) 116, var6);
                for (int var8 = 0; class192.field2753 > var8; ++var8) {
                    int[][] var9 = var7[var8];
                    int[] var10 = var6[var8];
                    int[] var11 = var9[2];
                    int[] var12 = var9[1];
                    int[] var13 = var9[0];
                    for (int var14 = 0; var14 < class77.field1178; ++var14) {
                        int var15 = var10[var14];
                        var11[var14] = class184.method1188(4080, var15 << 4);
                        var12[var14] = class184.method1188(4080, var15 >> 4);
                        var13[var14] = class184.method1188(16711680, var15) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
    public class168() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B[[I)V")
    private final void method1117(byte arg0, int[][] arg1) {
        if (arg0 >= 113) {
            ++field2433;
            int var3 = class192.field2753;
            int var4 = class77.field1178;
            class202.method1312(0, arg1);
            class107.method703(0, class5.field136, false, 0, class207.field2992);
            if (this.field2431 != null) {
                for (int var5 = 0; var5 < this.field2431.length; ++var5) {
                    class119 var6 = this.field2431[var5];
                    int var7 = var6.field1745;
                    int var8 = var6.field1749;
                    if (~var7 > -1) {
                        if (~var8 <= -1) {
                            var6.method311(var4, (byte) 122, var3);
                        }
                    } else if (var8 < 0) {
                        var6.method313(-1, var4, var3);
                    } else {
                        var6.method310(var3, var4, -11777);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        ++field2438;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field1713 = ~arg1.method760(false) == -2;
            }
        } else {
            this.field2431 = new class119[arg1.method760(false)];
            for (int var4 = 0; ~this.field2431.length < ~var4; ++var4) {
                int var5 = arg1.method760(false);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field2431[var4] = class180.method1164(74, arg1);
                            }
                        } else {
                            this.field2431[var4] = class5.method55((byte) -111, arg1);
                        }
                    } else {
                        this.field2431[var4] = client.method1431((byte) -32, arg1);
                    }
                } else {
                    this.field2431[var4] = class222.method1444(arg1, (byte) 103);
                }
            }
        }
        if (arg0 != -1) {
            method1115((byte) 117);
        }
    }
}
