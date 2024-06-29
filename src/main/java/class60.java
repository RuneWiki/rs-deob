import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class60 extends class189 {

    @OriginalMember(owner = "client!gd", name = "rb", descriptor = "I")
    private int field1531 = 4;

    @OriginalMember(owner = "client!gd", name = "vb", descriptor = "I")
    private int field1535 = 4;

    @OriginalMember(owner = "client!gd", name = "jb", descriptor = "[Z")
    public static boolean[] field1523 = new boolean[100];

    @OriginalMember(owner = "client!gd", name = "kb", descriptor = "I")
    public static int field1524 = 0;

    @OriginalMember(owner = "client!gd", name = "lb", descriptor = "Lgg;")
    public static class63 field1525 = class116.method911(43, "Mem:");

    @OriginalMember(owner = "client!gd", name = "xb", descriptor = "Lgg;")
    private static class63 field1537 = class116.method911(43, "Welcome to RuneScape");

    @OriginalMember(owner = "client!gd", name = "qb", descriptor = "Z")
    public static volatile boolean field1530 = true;

    @OriginalMember(owner = "client!gd", name = "ub", descriptor = "Lgg;")
    public static class63 field1534 = class116.method911(43, "<col=00ffff>");

    @OriginalMember(owner = "client!gd", name = "nb", descriptor = "Lgg;")
    public static class63 field1527 = field1537;

    @OriginalMember(owner = "client!gd", name = "Cb", descriptor = "Lgg;")
    public static class63 field1542 = class116.method911(43, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!gd", name = "sb", descriptor = "Lgg;")
    private static class63 field1532 = class116.method911(43, "Enter your username (V password)3");

    @OriginalMember(owner = "client!gd", name = "zb", descriptor = "Lgg;")
    public static class63 field1539 = field1532;

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!gd", name = "ib", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!gd", name = "mb", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!gd", name = "ob", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!gd", name = "pb", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!gd", name = "tb", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!gd", name = "wb", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!gd", name = "yb", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!gd", name = "Ab", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!gd", name = "Bb", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!gd", name = "hb", descriptor = "[I")
    public static int[] field1521;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lbh;B)V")
    public static final void method556(class19 arg0, byte arg1) {
        ++field1528;
        if (~class158.field3280 == -2) {
            short var2 = 280;
            if (~class110.field2480 <= ~var2 && ~class110.field2480 >= ~(var2 + 14) && ~class143.field3074 <= -5 && ~class143.field3074 >= -19) {
                class103.method851(28228, 0, 0);
                return;
            }
            if (var2 + 15 <= class110.field2480 && var2 + 80 >= class110.field2480 && ~class143.field3074 <= -5 && ~class143.field3074 >= -19) {
                class103.method851(28228, 1, 0);
                return;
            }
            short var3 = 390;
            if (class110.field2480 >= var3 && ~(var3 + 14) <= ~class110.field2480 && class143.field3074 >= 4 && ~class143.field3074 >= -19) {
                class103.method851(28228, 0, 1);
                return;
            }
            if (~(var3 + 15) >= ~class110.field2480 && ~class110.field2480 >= ~(var3 - -80) && class143.field3074 >= 4 && ~class143.field3074 >= -19) {
                class103.method851(28228, 1, 1);
                return;
            }
            short var4 = 500;
            if (~class110.field2480 <= ~var4 && class110.field2480 <= var4 + 14 && ~class143.field3074 <= -5 && class143.field3074 <= 18) {
                class103.method851(28228, 0, 2);
                return;
            }
            if (~class110.field2480 <= ~(var4 + 15) && var4 + 80 >= class110.field2480 && class143.field3074 >= 4 && ~class143.field3074 >= -19) {
                class103.method851(28228, 1, 2);
                return;
            }
            short var5 = 610;
            if (var5 <= class110.field2480 && var5 + 14 >= class110.field2480 && ~class143.field3074 <= -5 && ~class143.field3074 >= -19) {
                class103.method851(28228, 0, 3);
                return;
            }
            if (~(var5 + 15) >= ~class110.field2480 && var5 + 80 >= class110.field2480 && class143.field3074 >= 4 && class143.field3074 <= 18) {
                class103.method851(28228, 1, 3);
                return;
            }
            if (~class110.field2480 <= -709 && ~class143.field3074 <= -5 && class110.field2480 <= 758 && ~class143.field3074 >= -21) {
                class88.field2081 = false;
                class114.field2549.method1314(0, 0);
                class124.field2752.method1314(382, 0);
                class41.field952.method1083(382 - class41.field952.field3254 / 2, 18);
                return;
            }
            if (~class56.field1489 != 0) {
                class69 var6 = class47.field1111[class56.field1489];
                if (!var6.field1728 == !class51.field1259) {
                    byte[] var7 = class89.method772((byte) 32, new class63[] { var6.field1719, class15.field369 }).method604((byte) 78);
                    class83.field1966 = new String(var7, 0, var7.length);
                    if (~class175.field3589 != -1) {
                        class175.field3589 = 0;
                        class186.field3761 = 43594;
                        class167.field3461 = 43594;
                        class203.field4046 = 443;
                    }
                    class105.field2408 = var6.field1722;
                    class88.field2081 = false;
                    class114.field2549.method1314(0, 0);
                    class124.field2752.method1314(382, 0);
                    class41.field952.method1083(-(class41.field952.field3254 / 2) + 382, 18);
                    return;
                }
                class63 var8 = class89.method772((byte) 55, new class63[] { class122.field2695, var6.field1719, class15.field369, class151.field3178, class93.field2185, class175.method1162((byte) -126, !class198.field3964 ? 0 : 1), class91.field2125, class175.method1162((byte) -126, class59.field1518), class32.field779, class175.method1162((byte) -126, class91.field2131) });
                try {
                    arg0.getAppletContext().showDocument(var8.method571(0), "_self");
                } catch (Exception var10) {
                }
            }
        }
        int var9 = -126 % (arg1 / 56);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        ++field1540;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field1531 = arg2.method64(31790);
            }
        } else {
            this.field1535 = arg2.method64(31790);
        }
        if (arg1 < 32) {
            method557((class85) null, (class85) null, (byte) 11, (class85) null, (class85) null);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljc;Ljc;BLjc;Ljc;)V")
    public static final void method557(class85 arg0, class85 arg1, byte arg2, class85 arg3, class85 arg4) {
        class191.field3876 = arg0;
        class30.field763 = arg1;
        ++field1520;
        if (arg2 != -125) {
            method559(40, -19, -15, 127, -93, 115);
        }
        class90.field2104 = arg4;
        class198.field3953 = arg3;
        class23.field539 = new class54[class90.field2104.method763(0)][];
        class14.field332 = new boolean[class90.field2104.method763(0)];
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public static void method558(int arg0) {
        field1537 = null;
        field1521 = null;
        field1534 = null;
        field1525 = null;
        field1539 = null;
        field1532 = null;
        field1523 = null;
        if (arg0 != 4) {
            method558(28);
        }
        field1527 = null;
        field1542 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        if (arg0 != 0) {
            method560(44, 68, (class85) null, true, -80, -48);
        }
        ++field1533;
        int[] var3 = super.field3825.method681(arg1, (byte) -119);
        if (super.field3825.field1840) {
            int var4 = class54.field1430 / this.field1535;
            int var5 = class12.field287 / this.field1531;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method1245(0, 0, 11433);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1245(0, class12.field287 * var7 / var5, arg0 ^ 11433);
            }
            for (int var8 = 0; var8 < class54.field1430; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class54.field1430 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIII)V")
    public static final void method559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = class40.method366(arg5, arg1, arg3);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 3;
            int var9 = (508087 & (int) var6) >> 14;
            int var10 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            int var11 = arg4;
            int[] var12 = class101.field2369.field3994;
            int var13 = (-arg3 + 103) * 2048 + arg1 * 4 + 24624;
            if (~var6 < -1L) {
                var11 = arg0;
            }
            class37 var14 = class167.method1133(true, var10);
            if (var14.field864 != -1) {
                class156 var15 = class111.field2502[var14.field864];
                if (var15 != null) {
                    int var16 = (var14.field893 * 4 - var15.field3255) / 2;
                    int var17 = (var14.field914 * 4 + -var15.field3254) / 2;
                    var15.method1083(arg1 * 4 + (48 - -var17), var16 + 48 - -((-var14.field893 + -arg3 + 104) * 4));
                }
            } else {
                if (var9 == 0 || var9 == 2) {
                    if (var8 != 0) {
                        if (var8 == 1) {
                            var12[var13] = var11;
                            var12[var13 + 1] = var11;
                            var12[var13 - -2] = var11;
                            var12[var13 + 3] = var11;
                        } else if (~var8 == -3) {
                            var12[var13 + 3] = var11;
                            var12[var13 + 3 + 512] = var11;
                            var12[var13 + 1024 - -3] = var11;
                            var12[var13 + 3 + 1536] = var11;
                        } else if (~var8 == -4) {
                            var12[var13 + 1536] = var11;
                            var12[var13 + 1 + 1536] = var11;
                            var12[var13 + 1536 + 2] = var11;
                            var12[var13 + 1536 - -3] = var11;
                        }
                    } else {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    }
                }
                if (var9 == 3) {
                    if (var8 != 0) {
                        if (~var8 == -2) {
                            var12[var13 + 3] = var11;
                        } else if (~var8 != -3) {
                            if (~var8 == -4) {
                                var12[var13 - -1536] = var11;
                            }
                        } else {
                            var12[var13 - -3 + 1536] = var11;
                        }
                    } else {
                        var12[var13] = var11;
                    }
                }
                if (var9 == 2) {
                    if (~var8 == -4) {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    } else if (var8 != 0) {
                        if (var8 == 1) {
                            var12[var13 + 3] = var11;
                            var12[var13 - -515] = var11;
                            var12[var13 + 1027] = var11;
                            var12[var13 + 1536 + 3] = var11;
                        } else if (var8 == 2) {
                            var12[var13 + 1536] = var11;
                            var12[var13 - -1537] = var11;
                            var12[var13 + 1536 - -2] = var11;
                            var12[var13 - -1536 + 3] = var11;
                        }
                    } else {
                        var12[var13] = var11;
                        var12[var13 + 1] = var11;
                        var12[var13 - -2] = var11;
                        var12[var13 + 3] = var11;
                    }
                }
            }
        }
        ++field1529;
        long var18 = class116.method910(arg5, arg1, arg3);
        if (~var18 != -1L) {
            int var20 = (523790 & (int) var18) >> 14;
            int var21 = 3 & (int) var18 >> 20;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class37 var23 = class167.method1133(true, var22);
            if (var23.field864 == -1) {
                if (~var20 == -10) {
                    int var24 = 15658734;
                    if (var18 > 0L) {
                        var24 = 15597568;
                    }
                    int[] var25 = class101.field2369.field3994;
                    int var26 = arg1 * 4 + 24624 - -((52736 - arg3 * 512) * 4);
                    if (~var21 != -1 && ~var21 != -3) {
                        var25[var26] = var24;
                        var25[var26 + 1 + 512] = var24;
                        var25[var26 + 1026] = var24;
                        var25[var26 + 1536 + 3] = var24;
                    } else {
                        var25[var26 + 1536] = var24;
                        var25[var26 + 1024 - -1] = var24;
                        var25[var26 + 2 + 512] = var24;
                        var25[var26 + 3] = var24;
                    }
                }
            } else {
                class156 var27 = class111.field2502[var23.field864];
                if (var27 != null) {
                    int var28 = (var23.field914 * 4 + -var27.field3254) / 2;
                    int var29 = (var23.field893 * 4 + -var27.field3255) / 2;
                    var27.method1083(arg1 * 4 + var28 + 48, (-arg3 + 104 + -var23.field893) * 4 + 48 + var29);
                }
            }
        }
        long var30 = class21.method221(arg5, arg1, arg3);
        if (~var30 != -1L) {
            int var32 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
            class37 var33 = class167.method1133(true, var32);
            if (var33.field864 != -1) {
                class156 var34 = class111.field2502[var33.field864];
                if (var34 != null) {
                    int var35 = (var33.field914 * 4 - var34.field3254) / 2;
                    int var36 = (var33.field893 * 4 - var34.field3255) / 2;
                    var34.method1083(arg1 * 4 + (48 - -var35), 48 - -((104 - (arg3 - -var33.field893)) * 4) - -var36);
                }
            }
        }
        if (arg2 >= -121) {
            method560(-2, -46, (class85) null, true, -3, 89);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILjc;ZII)V")
    public static final void method560(int arg0, int arg1, class85 arg2, boolean arg3, int arg4, int arg5) {
        class117.field2618 = 10000;
        class150.field3156 = arg0;
        class49.field1187 = arg2;
        class90.field2110 = arg3;
        ++field1536;
        class42.field971 = 1;
        if (arg1 != 32599) {
            method557((class85) null, (class85) null, (byte) 56, (class85) null, (class85) null);
        }
        class101.field2368 = arg5;
        class97.field2308 = arg4;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class60() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZILgg;)V")
    public static final void method561(boolean arg0, int arg1, class63 arg2) {
        int var3 = -60 % ((arg1 - -2) / 60);
        ++field1526;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class62.field1560.method649(arg2, 250);
        int var8 = 13 * class62.field1560.method645(arg2, 250);
        class178.method1191(var5 - var4, var6 - var4, var7 - -var4 - -var4, var4 + var8 - -var4, 0);
        class178.method1186(-var4 + var5, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, 16777215);
        class62.field1560.method648(arg2, var5, var6, var7, var8, 16777215, -1, 1, 1, 0);
        class19.method196(var4 + var8 + var4, -var4 + var6, -var4 + var5, var7 - -var4 + var4, -51);
        if (!arg0) {
            class45.method453(var7, var5, var6, var8, (byte) 61);
        } else {
            try {
                Graphics var9 = class49.field1193.getGraphics();
                class63.field1621.method188(0, 0, var9, (byte) -121);
            } catch (Exception var10) {
                class49.field1193.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        if (arg1 <= 34) {
            return null;
        } else {
            ++field1522;
            int[][] var3 = super.field3808.method237(-1, arg0);
            if (super.field3808.field561) {
                int var4 = class54.field1430 / this.field1535;
                int var5 = class12.field287 / this.field1531;
                int[][] var6;
                if (~var5 >= -1) {
                    var6 = this.method1244((byte) 20, 0, 0);
                } else {
                    int var7 = arg0 % var5;
                    var6 = this.method1244((byte) 20, class12.field287 * var7 / var5, 0);
                }
                int[] var8 = var6[1];
                int[] var9 = var6[2];
                int[] var10 = var3[0];
                int[] var11 = var6[0];
                int[] var12 = var3[2];
                int[] var13 = var3[1];
                for (int var14 = 0; ~var14 > ~class54.field1430; ++var14) {
                    int var16;
                    if (var4 > 0) {
                        int var15 = var14 % var4;
                        var16 = class54.field1430 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var10[var14] = var11[var16];
                    var13[var14] = var8[var16];
                    var12[var14] = var9[var16];
                }
            }
            return var3;
        }
    }
}
