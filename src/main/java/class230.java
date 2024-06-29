import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public abstract class class230 {

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "[I")
    public static int[] field3605 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Z")
    public static boolean field3608 = false;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public int field3601;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public int field3607;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public int field3612;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lgi;")
    public static class164 field3599;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Ljava/awt/Image;")
    public static Image field3606;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Z")
    public final boolean method1589(byte arg0) {
        field3600++;
        if (arg0 == -21) {
            return (this.field3612 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Z")
    public final boolean method1590(int arg0) {
        if (arg0 != 0) {
            field3605 = null;
        }
        field3598++;
        return (this.field3612 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
    public static final void method1591(int arg0, int arg1) {
        field3602++;
        int var2 = class182.field3028;
        int var3 = class135.field2184;
        int var4 = class123.field1960;
        int var5 = class95.field1506;
        int var6 = class211.field3361;
        int var7 = (int) class114.field1742 + class117.field1802 & 0x7FF;
        int var8 = (int) class226.field3554;
        if (var8 < class221.field3477 / 256) {
            var8 = class221.field3477 / 256;
        }
        if (class12.field217[4] && (class74.field1186[4] + 128) > var8) {
            var8 = class74.field1186[4] + 128;
        }
        class44.method296(2047, arg1, var8 * 3 + 600, class60.method387(arg0 + -18795, class217.field3408.field929, class217.field3408.field994, class214.field3389) - 50, class256.field4219, var7, class288.field4687, var8);
        if (class135.field2184 == var3 && class182.field3028 == var2 && class123.field1960 == var4 && class95.field1506 == var5 && class211.field3361 == var6) {
            class231.field3613 = 1;
            return;
        }
        class70.field1121 = 10;
        class251.field4132 = 10;
        class179.field2965 = 10;
        if (var3 < class135.field2184) {
            var3 += (class135.field2184 - var3) * class179.field2965 / 1000 + class70.field1121;
            if (var3 < class135.field2184) {
                class135.field2184 = var3;
            }
        }
        if (var4 < class123.field1960) {
            var4 += (class123.field1960 - var4) * class179.field2965 / 1000 + class70.field1121;
            if (class123.field1960 > var4) {
                class123.field1960 = var4;
            }
        }
        if (var2 < class182.field3028) {
            var2 += (class182.field3028 - var2) * class179.field2965 / 1000 + class70.field1121;
            if (var2 < class182.field3028) {
                class182.field3028 = var2;
            }
        }
        int var9 = class211.field3361 - var6;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        class74.field1189 = 10;
        if (var3 > class135.field2184) {
            int var10 = var3 - ((var3 - class135.field2184) * class179.field2965 / 1000 + class70.field1121);
            if (class135.field2184 < var10) {
                class135.field2184 = var10;
            }
        }
        if (class182.field3028 < var2) {
            int var11 = var2 - ((var2 - class182.field3028) * class179.field2965 / 1000 + class70.field1121);
            if (var11 > class182.field3028) {
                class182.field3028 = var11;
            }
        }
        if (var5 < class95.field1506) {
            var5 += (class95.field1506 - var5) * class74.field1189 / 1000 + class251.field4132;
            if (var5 < class95.field1506) {
                class95.field1506 = var5;
            }
        }
        if (var4 > class123.field1960) {
            int var12 = var4 - ((var4 - class123.field1960) * class179.field2965 / 1000 + class70.field1121);
            if (class123.field1960 < var12) {
                class123.field1960 = var12;
            }
        }
        if (var5 > class95.field1506) {
            int var13 = var5 - ((var5 - class95.field1506) * class74.field1189 / 1000 + class251.field4132);
            if (class95.field1506 < var13) {
                class95.field1506 = var13;
            }
        }
        if (var9 < -1024) {
            var9 += 2048;
        }
        if (~var9 < arg0) {
            int var14 = class74.field1189 * var9 / 1000 + class251.field4132 + var6;
            var6 = var14 & 0x7FF;
        }
        if (var9 < 0) {
            int var15 = var6 - (class251.field4132 + (-var9 * class74.field1189 / 1000));
            var6 = var15 & 0x7FF;
        }
        int var16 = class211.field3361 - var6;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var9 <= 0 || var16 > 0 && var9 < 0) {
            class211.field3361 = var6;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Z")
    public final boolean method1592(int arg0) {
        field3610++;
        if (arg0 == 2280) {
            return (this.field3612 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIIIII)V")
    public static final void method1593(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3611++;
        for (int var6 = arg1; var6 <= (arg1 + arg3); var6++) {
            for (int var11 = arg2; var11 <= arg2 + arg4; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class255.field4213[arg5][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
            for (int var10 = arg2; var10 < arg2 + arg4; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class166.field2746[arg5][var10][var7] = arg5 > 0 ? class166.field2746[arg5 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var8 = arg1 + 1; var8 < (arg1 + arg3); var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class166.field2746[arg5][arg2][var8] = class166.field2746[arg5][arg2 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var9 = arg2 + 1; var9 < arg2 + arg4; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class166.field2746[arg5][var9][arg1] = class166.field2746[arg5][var9][arg1 - 1];
                }
            }
        }
        if (arg2 >= 0 && arg1 >= 0 && arg2 < 104 && arg1 < 104) {
            if (arg5 == 0) {
                if (arg2 > 0 && class166.field2746[arg5][arg2 - 1][arg1] != 0) {
                    class166.field2746[arg5][arg2][arg1] = class166.field2746[arg5][arg2 - 1][arg1];
                } else if (arg1 > 0 && class166.field2746[arg5][arg2][arg1 - 1] != 0) {
                    class166.field2746[arg5][arg2][arg1] = class166.field2746[arg5][arg2][arg1 - 1];
                } else if (arg2 > 0 && arg1 > 0 && class166.field2746[arg5][arg2 - 1][arg1 - 1] != 0) {
                    class166.field2746[arg5][arg2][arg1] = class166.field2746[arg5][arg2 - 1][arg1 - 1];
                }
            } else if (arg2 > 0 && class166.field2746[arg5 - 1][arg2 - 1][arg1] != class166.field2746[arg5][arg2 - 1][arg1]) {
                class166.field2746[arg5][arg2][arg1] = class166.field2746[arg5][arg2 - 1][arg1];
            } else if (arg1 > 0 && class166.field2746[arg5 - 1][arg2][arg1 - 1] != class166.field2746[arg5][arg2][arg1 - 1]) {
                class166.field2746[arg5][arg2][arg1] = class166.field2746[arg5][arg2][arg1 - 1];
            } else if (arg2 > 0 && arg1 > 0 && class166.field2746[arg5 - 1][arg2 - 1][arg1 - 1] != class166.field2746[arg5][arg2 - 1][arg1 - 1]) {
                class166.field2746[arg5][arg2][arg1] = class166.field2746[arg5][arg2 - 1][arg1 - 1];
            }
        }
        if (arg0 != 99) {
            method1591(-90, 85);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)V")
    public static final void method1594(int arg0, int arg1) {
        class275.field4497.method1880(-117, arg1);
        field3604++;
        if (arg0 == -13900) {
            class16.field303.method1880(-79, arg1);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)Z")
    public final boolean method1595(byte arg0) {
        field3603++;
        if (arg0 == -73) {
            return (this.field3612 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILmd;III)V")
    public static final void method1596(int arg0, class242 arg1, int arg2, int arg3, int arg4) {
        field3609++;
        if (class291.field4776 >= 400) {
            return;
        }
        if (arg1.field3779 != null) {
            arg1 = arg1.method1649(false);
        }
        if (arg0 != -17561) {
            field3599 = null;
        }
        if (arg1 == null || !arg1.field3834) {
            return;
        }
        String var5 = arg1.field3818;
        if (arg1.field3833 != 0) {
            String var6 = class106.field1656 == 1 ? class14.field293 : class299.field4911;
            var5 = var5 + class298.method2046(376, arg1.field3833, class217.field3408.field224) + " (" + var6 + arg1.field3833 + ")";
        }
        if (class45.field669 == 1) {
            class205.method1420(class33.field537, (long) arg2, 111, arg4, arg3, class90.field1409, class259.field4248 + " -> <col=ffff00>" + var5, (short) 46);
            class63.field1017++;
        } else if (class101.field1579) {
            class11 var7 = class133.field2135 == -1 ? null : class177.method1251(class133.field2135, (byte) -60);
            if ((class44.field652 & 0x2) != 0) {
                if (var7 == null || arg1.method1641(class133.field2135, var7.field204, -2686) != var7.field204) {
                    class205.method1420(class205.field3297, (long) arg2, 105, arg4, arg3, class189.field3096, class211.field3367 + " -> <col=ffff00>" + var5, (short) 30);
                    class45.field666++;
                }
                return;
            }
        } else {
            class300.field4923++;
            String[] var8 = arg1.field3826;
            if (class95.field1512) {
                var8 = class84.method599(var8, (byte) -115);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class106.field1656 != 0 || !var8[var9].equalsIgnoreCase(class200.field3206))) {
                        class86.field1362++;
                        int var10 = -1;
                        byte var11 = 0;
                        if (var9 == 0) {
                            var11 = 35;
                        }
                        if (var9 == 1) {
                            var11 = 14;
                        }
                        if (var9 == 2) {
                            var11 = 7;
                        }
                        if (arg1.field3781 == var9) {
                            var10 = arg1.field3809;
                        }
                        if (var9 == 3) {
                            var11 = 38;
                        }
                        if (arg1.field3816 == var9) {
                            var10 = arg1.field3799;
                        }
                        if (var9 == 4) {
                            var11 = 59;
                        }
                        class205.method1420(var8[var9], (long) arg2, 118, arg4, arg3, var10, "<col=ffff00>" + var5, var11);
                    }
                }
            }
            if (class106.field1656 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class200.field3206)) {
                        class111.field1710++;
                        short var13 = 0;
                        if (arg1.field3833 > class217.field3408.field224) {
                            var13 = 2000;
                        }
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 35;
                        }
                        if (var12 == 1) {
                            var14 = 14;
                        }
                        if (var12 == 2) {
                            var14 = 7;
                        }
                        if (var12 == 3) {
                            var14 = 38;
                        }
                        if (var12 == 4) {
                            var14 = 59;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class205.method1420(var8[var12], (long) arg2, arg0 + 17676, arg4, arg3, arg1.field3829, "<col=ffff00>" + var5, var14);
                    }
                }
            }
            class205.method1420(class98.field1552, (long) arg2, arg0 + 17679, arg4, arg3, class63.field1026, "<col=ffff00>" + var5, (short) 1002);
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
    public static void method1597(int arg0) {
        field3599 = null;
        if (arg0 <= -106) {
            field3605 = null;
            field3606 = null;
        }
    }
}
