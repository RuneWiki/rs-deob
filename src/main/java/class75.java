import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class75 extends class64 {

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "Lcd;")
    private static class23 field1712 = class54.method414("Login limit exceeded)3", -1);

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "Lcd;")
    public static class23 field1708 = field1712;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "Lcd;")
    public static class23 field1714 = class54.method414("Benutzen", -1);

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field1711 = 0;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "Lvf;")
    public static class194 field1713;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
    public static void method532(int arg0) {
        field1708 = null;
        field1714 = null;
        if (arg0 != 8) {
            method533(43, (class26) null, (class26) null);
        }
        field1713 = null;
        field1712 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILcg;Lcg;)V")
    public static final void method533(int arg0, class26 arg1, class26 arg2) {
        if (class74.field1678 == null) {
            class74.field1678 = class96.method635(class12.field274, class105.field2280, (byte) -63, client.field585);
        }
        if (class94.field1979 == null) {
            class94.field1979 = class44.method348(45, class105.field2280, client.field585, class134.field2787);
        }
        ++field1709;
        if (class169.field3377 == null) {
            class169.field3377 = class44.method348(-120, class105.field2280, client.field585, class184.field3611);
        }
        if (class3.field37 == null) {
            class3.field37 = class44.method348(-8, class105.field2280, client.field585, class55.field1296);
        }
        class196.method1281(0, 23, 765, 480, 0);
        class196.method1266(0, 0, 125, 23, 12425273, 9135624);
        class196.method1266(125, 0, 640, 23, 5197647, 2697513);
        arg2.method270(class165.field3299, 62, 15, 0, -1);
        if (class3.field37 != null) {
            class3.field37[1].method836(140, 1);
            arg1.method291(class30.field651, 152, 10, 16777215, -1);
            class3.field37[0].method836(140, 12);
            arg1.method291(class54.field1264, 152, 21, 16777215, -1);
        }
        if (class169.field3377 != null) {
            short var3 = 280;
            if (~class170.field3392[0] == -1 && ~class189.field3742[0] == -1) {
                class169.field3377[2].method836(var3, 4);
            } else {
                class169.field3377[0].method836(var3, 4);
            }
            short var4 = 390;
            if (class170.field3392[0] == 0 && ~class189.field3742[0] == -2) {
                class169.field3377[3].method836(var3 - -15, 4);
            } else {
                class169.field3377[1].method836(var3 - -15, 4);
            }
            arg2.method291(class145.field2965, var3 + 32, 17, 16777215, -1);
            if (class170.field3392[0] == 1 && ~class189.field3742[0] == -1) {
                class169.field3377[2].method836(var4, 4);
            } else {
                class169.field3377[0].method836(var4, 4);
            }
            short var5 = 500;
            if (class170.field3392[0] == 1 && ~class189.field3742[0] == -2) {
                class169.field3377[3].method836(var4 + 15, 4);
            } else {
                class169.field3377[1].method836(var4 - -15, 4);
            }
            short var6 = 610;
            arg2.method291(class64.field1512, var4 + 32, 17, 16777215, -1);
            if (~class170.field3392[0] == -3 && class189.field3742[0] == 0) {
                class169.field3377[2].method836(var5, 4);
            } else {
                class169.field3377[0].method836(var5, 4);
            }
            if (class170.field3392[0] == 2 && ~class189.field3742[0] == -2) {
                class169.field3377[3].method836(var5 + 15, 4);
            } else {
                class169.field3377[1].method836(var5 - -15, 4);
            }
            arg2.method291(class74.field1705, var5 + 32, 17, 16777215, -1);
            if (class170.field3392[0] == 3 && ~class189.field3742[0] == -1) {
                class169.field3377[2].method836(var6, 4);
            } else {
                class169.field3377[0].method836(var6, 4);
            }
            if (~class170.field3392[0] == -4 && ~class189.field3742[0] == -2) {
                class169.field3377[3].method836(var6 + 15, 4);
            } else {
                class169.field3377[1].method836(var6 + 15, 4);
            }
            arg2.method291(class194.field3825, var6 - -32, 17, 16777215, -1);
        }
        class196.method1281(708, 4, 50, 16, 0);
        arg1.method270(class153.field3061, 733, 16, 16777215, -1);
        class70.field1628 = -1;
        if (class74.field1678 != null) {
            byte var7 = 19;
            byte var8 = 88;
            int var9 = 480 / (var7 + 1);
            int var10 = 765 / (var8 + 1);
            int var11;
            int var12;
            do {
                var11 = var9;
                var12 = var10;
                if ((var10 + -1) * var9 >= class5.field99) {
                    --var10;
                }
                if (~((var9 - 1) * var10) <= ~class5.field99) {
                    --var9;
                }
                if ((var9 + -1) * var10 >= class5.field99) {
                    --var9;
                }
            } while (~var9 != ~var11 || ~var10 != ~var12);
            int var13 = (-(var8 * var10) + 765) / (var10 + 1);
            if (~var13 < -6) {
                var13 = 5;
            }
            int var14 = (-(var7 * var9) + 480) / (var9 - -1);
            if (var14 > 5) {
                var14 = 5;
            }
            int var15 = (-((var10 + -1) * var13) + 765 + -(var8 * var10)) / 2;
            int var16 = (-((var9 - 1) * var14) + 480 - var7 * var9) / 2;
            int var17 = var16 + 23;
            int var18 = var15;
            int var19 = 0;
            for (int var20 = 0; var20 < class5.field99; ++var20) {
                class21 var21 = class159.field3188[var20];
                boolean var22 = true;
                class23 var23 = class184.method1132(-1, var21.field448);
                if (var21.field448 != -1) {
                    if (~var21.field448 < -1981) {
                        var22 = false;
                        var23 = class9.field178;
                    }
                } else {
                    var22 = false;
                    var23 = class151.field3025;
                }
                if (~class78.field1724 <= ~var18 && ~var17 >= ~class64.field1518 && class78.field1724 < var8 + var18 && var17 - -var7 > class64.field1518 && var22) {
                    class70.field1628 = var20;
                    class74.field1678[var21.field431 ? 1 : 0].method311(var18, var17, 128, 16777215);
                } else {
                    class74.field1678[!var21.field431 ? 0 : 1].method293(var18, var17);
                }
                if (class94.field1979 != null) {
                    class94.field1979[var21.field435 + (!var21.field431 ? 0 : 8)].method836(var18 + 29, var17);
                }
                arg2.method270(class184.method1132(-1, var21.field449), var18 + 15, var7 / 2 + var17 + 5, 0, -1);
                arg1.method270(var23, var18 + 60, var17 - (-(var7 / 2) - 5), 268435455, -1);
                var17 += var7 + var14;
                ++var19;
                if (~var19 <= ~var9) {
                    var19 = 0;
                    var17 = var16 + 23;
                    var18 += var8 + var13;
                }
            }
        }
        if (arg0 <= 44) {
            method532(4);
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class75() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field1715;
        if (arg1 != -9421) {
            field1714 = null;
        }
        int[] var3 = super.field1513.method1033(-112, arg0);
        if (super.field1513.field3368) {
            for (int var4 = 0; var4 < class168.field3367; ++var4) {
                var3[var4] = class174.field3475[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)V")
    public static final void method534(int arg0, byte arg1) {
        if (arg1 <= 97) {
            method532(114);
        }
        ++field1710;
        if (arg0 == -1 && !class25.field531) {
            class156.method959(1);
        } else if (arg0 != -1 && class28.field600 != arg0 && ~class40.field848 != -1 && !class25.field531) {
            class175.method1104(class193.field3812, 0, false, class40.field848, 2, arg0, (byte) 26);
        }
        class28.field600 = arg0;
    }
}
