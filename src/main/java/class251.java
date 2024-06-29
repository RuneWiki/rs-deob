import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class251 extends class76 {

    @OriginalMember(owner = "client!gg", name = "gb", descriptor = "Z")
    private boolean field4326 = true;

    @OriginalMember(owner = "client!gg", name = "cb", descriptor = "I")
    private int field4322 = 4096;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!gg", name = "db", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!gg", name = "eb", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!gg", name = "fb", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!gg", name = "ib", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!gg", name = "jb", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!gg", name = "kb", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!gg", name = "lb", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!gg", name = "hb", descriptor = "[I")
    public static int[] field4327;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIBII)V")
    public static final void method1639(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field4331;
        if (~class35.field698 > -101) {
            class226.method1482(-1191847007);
        }
        class23.method187(arg1, arg3, arg1 + arg4, arg0 + arg3);
        if (class35.field698 < 100) {
            int var5 = arg1 - -(arg4 / 2);
            byte var6 = 20;
            int var7 = arg3 - var6 + arg0 / 2 + -18;
            class23.method198(arg1, arg3, arg4, arg0, 0);
            class23.method208(var5 + -152, var7, 304, 34, 9179409);
            class23.method208(var5 + -151, var7 + 1, 302, 32, 0);
            class23.method198(var5 + -150, var7 + 2, class35.field698 * 3, 30, 9179409);
            class23.method198(class35.field698 * 3 + var5 + -150, var7 + 2, -(class35.field698 * 3) + 300, 30, 0);
            class71.field1399.method794(class209.field3583, var5, var6 + var7, 16777215, -1);
        } else {
            class89.field1711 = class181.field3146 - (int) ((double) arg4 / class15.field332);
            class184.field3202 = -((int) ((double) arg0 / class15.field332)) + class233.field3997;
            class89.field1706 = (int) ((double) (arg0 * 2) / class15.field332);
            class174.field2978 = (int) ((double) (arg4 * 2) / class15.field332);
            int var8 = -((int) ((double) arg4 / class15.field332)) + class181.field3146;
            int var9 = -((int) ((double) arg0 / class15.field332)) + class233.field3997;
            int var10 = (int) ((double) arg4 / class15.field332) + class181.field3146;
            int var11 = (int) ((double) arg0 / class15.field332) + class233.field3997;
            method1642(var10, arg3, var9, arg0 + arg3, (byte) 49, arg1 - -arg4, var8, arg1, var11);
            class200.method1347(var9, arg3, var8, arg1 - -arg4, arg0 + arg3, (byte) -79, var10, var11, arg1);
            if (arg2 < 98) {
                field4319 = 94;
            }
            if (class244.field4233 > 0) {
                --class244.field4233;
            }
            if (class171.field2937) {
                int var12 = arg1 + arg4 + -5;
                int var13 = arg0 + arg3 + -8;
                class3.field93.method773(class233.method1528(new class257[] { class11.field198, class111.method808(10, class70.field1387) }, 0), var12, var13, 16776960, -1);
                int var17 = var13 - 15;
                int var14 = 16776960;
                Runtime var15 = Runtime.getRuntime();
                int var16 = (int) ((var15.totalMemory() + -var15.freeMemory()) / 1024L);
                if (var16 > 65536) {
                    var14 = 16711680;
                }
                class3.field93.method773(class233.method1528(new class257[] { class213.field3646, class111.method808(10, var16), class117.field2104 }, 0), var12, var17, var14, -1);
                var13 = var17 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLmb;II)[Lte;")
    public static final class184[] method1640(byte arg0, class178 arg1, int arg2, int arg3) {
        ++field4318;
        if (arg0 > -43) {
            method1641((byte) 35, (KeyEvent) null);
        }
        return !class156.method1093(arg2, 125, arg3, arg1) ? null : class195.method1312((byte) 54);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
    public static final int method1641(byte arg0, KeyEvent arg1) {
        ++field4324;
        int var2 = -108 / ((arg0 - 52) / 53);
        int var3 = arg1.getKeyChar();
        if (~var3 == -8365) {
            return 128;
        } else {
            if (var3 <= 0 || var3 >= 256) {
                var3 = -1;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        if (arg1 <= 2) {
            return null;
        } else {
            ++field4323;
            int[][] var3 = super.field1485.method649(arg0, true);
            if (super.field1485.field1692) {
                int[] var4 = this.method562(arg0 + -1 & class105.field1950, 0, (byte) -104);
                int[] var5 = this.method562(arg0, 0, (byte) -104);
                int[] var6 = this.method562(arg0 - -1 & class105.field1950, 0, (byte) -104);
                int[] var7 = var3[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                for (int var10 = 0; var10 < class96.field1807; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field4322;
                    int var12 = (var5[var10 - -1 & class157.field2753] + -var5[var10 + -1 & class157.field2753]) * this.field4322;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (~var17 != -1) {
                        var18 = var11 / var17;
                        var19 = var12 / var17;
                        var20 = 16777216 / var17;
                    } else {
                        var19 = 0;
                        var20 = 0;
                        var18 = 0;
                    }
                    if (this.field4326) {
                        var20 = (var20 >> 1) + 2048;
                        var19 = (var19 >> 1) + 2048;
                        var18 = (var18 >> 1) + 2048;
                    }
                    var8[var10] = var19;
                    var9[var10] = var18;
                    var7[var10] = var20;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        ++field4328;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field4326 = ~arg0.method1051((byte) -112) == -2;
            }
        } else {
            this.field4322 = arg0.method1063(-17162);
        }
        if (arg1 >= -86) {
            field4319 = -37;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method1642(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -arg6 + arg0;
        if (arg4 < 44) {
            field4327 = null;
        }
        ++field4321;
        int var10 = -arg2 + arg8;
        int var11 = (-arg1 + arg3 << 16) / var10;
        if (class181.field3149 > arg8) {
            ++var10;
        }
        int var12 = (-arg7 + arg5 << 16) / var9;
        if (class252.field4337 > arg0) {
            ++var9;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            int var30 = var12 * var13 >> 16;
            int var31 = (var13 - -1) * var12 >> 16;
            int var32 = -var30 + var31;
            if (~var32 < -1) {
                int var33 = arg6 + var13 >> 6;
                int var34 = arg7 + var30;
                byte[][] var35 = class221.field3737[var33];
                int var36 = arg7 + var31;
                int[][] var37 = class244.field4234[var33];
                byte[][] var38 = class207.field3553[var33];
                byte[][] var39 = class250.field4311[var33];
                byte[][] var40 = class94.field1781[var33];
                byte[][] var41 = class158.field2779[var33];
                for (int var42 = 0; var10 > var42; ++var42) {
                    int var43 = (var42 + 1) * var11 >> 16;
                    int var44 = var11 * var42 >> 16;
                    int var45 = -var44 + var43;
                    if (var45 > 0) {
                        int var46 = arg1 + var44;
                        int var47 = arg1 + var43;
                        int var48 = var42 - -arg2 >> 6;
                        int var49 = arg2 + var42 & 63;
                        int var50 = 63 & var13 - -arg6;
                        int var51 = (var49 << 6) + var50;
                        int var54;
                        if (var37[var48] == null) {
                            int var52 = 4 & arg6 + var13;
                            int var53 = 4 & arg2 + var42;
                            if ((var52 >= 2 || var53 <= 2) && (~var52 >= -3 || var53 >= 2)) {
                                var54 = class257.field4452[class37.field739 + 1];
                            } else {
                                var54 = 4936552;
                            }
                        } else {
                            var54 = var37[var48][var51];
                        }
                        if (~var54 == -1) {
                            var54 = 1;
                        }
                        int var55 = var35[var48] != null ? class257.field4452[255 & var35[var48][var51]] : 0;
                        int var56 = var39[var48] == null ? 0 : class257.field4452[var39[var48][var51] & 255];
                        if (~var55 == -1 && ~var56 == -1) {
                            class23.method198(var34, var46, var32, var45, var54);
                        } else {
                            if (~var55 != -1) {
                                if (~var55 == 0) {
                                    var55 = 1;
                                }
                                byte var57 = var38[var48] != null ? var38[var48][var51] : 0;
                                int var58 = 252 & var57;
                                if (~var58 != -1 && ~var32 < -2 && var45 > 1) {
                                    class138.method947(var57 & 3, true, var34, 3, var46, var54, var58 >> 2, var45, var55, class23.field445, var32);
                                } else {
                                    class23.method198(var34, var46, var32, var45, var55);
                                }
                            }
                            if (var56 != 0) {
                                byte var59 = var40[var48][var51];
                                if (~var56 == 0) {
                                    var56 = var54;
                                }
                                int var60 = 252 & var59;
                                if (~var60 == -1 || ~var32 >= -2 || ~var45 >= -2) {
                                    class23.method198(var34, var46, var32, var45, var56);
                                }
                                class138.method947(3 & var59, ~var55 == -1, var34, 3, var46, 0, var60 >> 2, var45, var56, class23.field445, var32);
                            }
                        }
                        if (var41[var48] != null) {
                            int var61 = 255 & var41[var48][var51];
                            if (~var61 != -1) {
                                int var62;
                                if (~var32 != -2) {
                                    var62 = var36 - 1;
                                } else {
                                    var62 = var34;
                                }
                                int var63;
                                if (~var45 == -2) {
                                    var63 = var46;
                                } else {
                                    var63 = var47 + -1;
                                }
                                int var64 = 13421772;
                                if (var61 >= 5 && ~var61 >= -9 || var61 >= 13 && var61 <= 16 || var61 >= 21 && ~var61 >= -25 || ~var61 == -28 || ~var61 == -29) {
                                    var61 -= 4;
                                    var64 = 13369344;
                                }
                                if (var61 == 1) {
                                    class23.method202(var34, var46, var45, var64);
                                } else if (var61 == 2) {
                                    class23.method197(var34, var46, var32, var64);
                                } else if (~var61 != -4) {
                                    if (var61 == 4) {
                                        class23.method197(var34, var63, var32, var64);
                                    } else if (var61 != 9) {
                                        if (var61 == 10) {
                                            class23.method202(var62, var46, var45, 16777215);
                                            class23.method197(var34, var46, var32, var64);
                                        } else if (~var61 != -12) {
                                            if (~var61 == -13) {
                                                class23.method202(var34, var46, var45, 16777215);
                                                class23.method197(var34, var63, var32, var64);
                                            } else if (var61 == 17) {
                                                class23.method197(var34, var46, 1, var64);
                                            } else if (~var61 != -19) {
                                                if (var61 != 19) {
                                                    if (~var61 != -21) {
                                                        if (~var61 == -26) {
                                                            for (int var65 = 0; var65 < var45; ++var65) {
                                                                class23.method197(var34 + var65, var63 - var65, 1, var64);
                                                            }
                                                        } else if (var61 == 26) {
                                                            for (int var66 = 0; var45 > var66; ++var66) {
                                                                class23.method197(var34 + var66, var46 + var66, 1, var64);
                                                            }
                                                        }
                                                    } else {
                                                        class23.method197(var34, var63, 1, var64);
                                                    }
                                                } else {
                                                    class23.method197(var62, var63, 1, var64);
                                                }
                                            } else {
                                                class23.method197(var62, var46, 1, var64);
                                            }
                                        } else {
                                            class23.method202(var62, var46, var45, 16777215);
                                            class23.method197(var34, var63, var32, var64);
                                        }
                                    } else {
                                        class23.method202(var34, var46, var45, 16777215);
                                        class23.method197(var34, var46, var32, var64);
                                    }
                                } else {
                                    class23.method202(var62, var46, var45, var64);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var14 = 0; ~var9 < ~var14; ++var14) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 - -1) * var12 >> 16;
            int var17 = var16 - var15;
            if (~var17 < -1) {
                int var18 = arg7 + var15;
                int var10000 = arg7 + var16;
                byte[][] var20 = class138.field2476[arg6 + var14 >> 6];
                for (int var21 = 0; var10 > var21; ++var21) {
                    int var22 = (var21 + 1) * var11 >> 16;
                    int var23 = var11 * var21 >> 16;
                    int var24 = var22 - var23;
                    if (~var24 < -1) {
                        int var25 = var21 - -arg2 >> 6;
                        var10000 = arg1 + var22;
                        int var27 = ((63 & arg2 + var21) << 6) + (arg6 + var14 & 63);
                        int var28 = arg1 + var23;
                        if (var20[var25] != null) {
                            int var29 = var20[var25][var27] & 255;
                            if (var29 != 0) {
                                if (var29 != 47 && var29 != 53) {
                                    class13.field254[var29 + -1].method1087(var18 - var17 / 2, var28 - var24 / 2, var17 * 2, var24 * 2);
                                } else {
                                    class13.field254[var29 + -1].method1087(var18, var28, var17 * 2 + 1, var24 * 2 + 1);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBILmb;)Lak;")
    public static final class190 method1643(int arg0, byte arg1, int arg2, class178 arg3) {
        int var4 = 44 % ((arg1 - 74) / 49);
        ++field4330;
        return !class156.method1093(arg2, -47, arg0, arg3) ? null : class197.method1320((byte) 45);
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(II)Z")
    public static final boolean method1644(int arg0, int arg1) {
        ++field4320;
        if (~arg1 <= -98 && arg1 <= 122) {
            return true;
        } else {
            if (arg0 != 32350) {
                field4319 = 36;
            }
            if (~arg1 <= -66 && ~arg1 >= -91) {
                return true;
            } else {
                return ~arg1 <= -49 && arg1 <= 57;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class251() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V")
    public static final void method1645(byte arg0) {
        if (arg0 <= 91) {
            method1643(89, (byte) -76, 94, (class178) null);
        }
        ++field4325;
        if (class205.field3514 == null || class106.field1962 == null) {
            class106.field1962 = new int[256];
            class205.field3514 = new int[256];
            for (int var1 = 0; var1 < 256; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class205.field3514[var1] = (int) (4096.0D * Math.sin(var2));
                class106.field1962[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)V")
    public static void method1646(byte arg0) {
        if (arg0 != 76) {
            field4327 = null;
        }
        field4327 = null;
    }
}
