import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class249 extends class210 {

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    private int field3663;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "Lvq;")
    public static class24 field3662 = new class24(0, 6);

    @OriginalMember(owner = "client!v", name = "P", descriptor = "Lbn;")
    public static class160 field3668 = new class160(39, 8);

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "[Lae;")
    public static class285[] field3666;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILfp;)V")
    public static final void method1652(int arg0, class9 arg1) {
        if (arg0 >= 105) {
            ++field3665;
            if ((~class237.field3532 <= -3 || class147.field1993) && class157.field2113 == null) {
                String var2;
                if (class147.field1993 && ~class237.field3532 > -3) {
                    var2 = class253.field3723 + class264.field3913.method2543(false, class153.field2073) + class429.field6240 + " ->";
                } else if (class103.field1332 && class436.field6368.method256(-100, 81) && class237.field3532 > 2) {
                    var2 = class265.method1827((class375) class138.field1885.field5735.field3908.field3908, true);
                } else {
                    class375 var3 = (class375) class138.field1885.field5735.field3908;
                    var2 = class265.method1827(var3, true);
                    int[] var4 = null;
                    if (class411.method2553(2661, var3.field5469)) {
                        var4 = class157.field2119.method176((byte) -63, (int) var3.field5480).field6203;
                    } else if (class275.method1878(4, var3.field5469)) {
                        class26 var5 = class364.field5260[(int) var3.field5480];
                        if (var5 != null) {
                            class327 var6 = var5.field369;
                            if (var6.field4871 != null) {
                                var6 = var6.method2139(true);
                            }
                            if (var6 != null) {
                                var4 = var6.field4815;
                            }
                        }
                    } else if (class29.method295(16565, var3.field5469)) {
                        Object var7 = null;
                        class178 var8;
                        if (var3.field5469 == 1006) {
                            var8 = class450.method2785((int) var3.field5480, (byte) 87);
                        } else {
                            var8 = class450.method2785((int) (2147483647L & var3.field5480 >>> 32), (byte) 119);
                        }
                        if (var8.field2489 != null) {
                            var8 = var8.method1240((byte) -116);
                        }
                        if (var8 != null) {
                            var4 = var8.field2509;
                        }
                    }
                    if (var4 != null) {
                        var2 = var2 + class447.method2750((byte) -72, var4);
                    }
                }
                if (class237.field3532 > 2) {
                    var2 = var2 + "<col=ffffff> / " + (class237.field3532 - 2) + class47.field612.method2543(false, class153.field2073);
                }
                if (class34.field494 == null) {
                    if (class105.field1391 != null && class92.field1139 == class408.field5869) {
                        int var9 = class111.field1540.method562(class243.field3609, class319.field4707 - -16, var2, class214.field3022, class34.field488, 0, -7848, class363.field5259 + 4, 16777215, class77.field979);
                        class3.method23(class319.field4707, class363.field5259 - -4, 16, class233.field3502.method2333(-65, var2) + var9, 255);
                        return;
                    }
                } else {
                    class85 var10 = class34.field494.method1530(-1, arg1);
                    if (var10 == null) {
                        var10 = class111.field1540;
                    }
                    var10.method574(class34.field494.field3300, class214.field3022, class34.field494.field3228, class33.field473, class26.field380, class34.field488, class34.field494.field3352, (byte) 49, class34.field494.field3241, class243.field3609, class34.field494.field3233, var2, class34.field494.field3324, class150.field2039, class77.field979);
                    class3.method23(class150.field2039[1], class150.field2039[0], class150.field2039[3], class150.field2039[2], 255);
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        ++field3667;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (arg1 != -38) {
            return null;
        } else {
            if (super.field2950.field4111) {
                class224.method1542(var3, 0, class202.field2852, this.field3663);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
    public static void method1653(byte arg0) {
        field3668 = null;
        field3666 = null;
        int var1 = -42 / ((11 - arg0) / 49);
        field3662 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lct;I)V")
    public static final void method1654(class104 arg0, int arg1) {
        ++field3664;
        class93.field1157 = arg0.method707(-1, "p11_full");
        class359.field5224 = arg0.method707(-1, "p12_full");
        class152.field2060 = arg0.method707(-1, "b12_full");
        if (arg1 == 2) {
            class264.field3914 = arg0.method707(-1, "hitmarks");
            class164.field2174 = arg0.method707(-1, "hitbar_default");
            class356.field5178 = arg0.method707(-1, "timerbar_default");
            class447.field6544 = arg0.method707(-1, "headicons_pk");
            class206.field2883 = arg0.method707(arg1 + -3, "headicons_prayer");
            class358.field5187 = arg0.method707(arg1 + -3, "hint_headicons");
            class153.field2062 = arg0.method707(-1, "hint_mapmarkers");
            class125.field1667 = arg0.method707(-1, "mapflag");
            class223.field3341 = arg0.method707(-1, "cross");
            class332.field4918 = arg0.method707(-1, "mapdots");
            class239.field3560 = arg0.method707(arg1 ^ -3, "scrollbar");
            class465.field6853 = arg0.method707(arg1 ^ -3, "name_icons");
            class106.field1424 = arg0.method707(-1, "floorshadows");
            class305.field4506 = arg0.method707(-1, "compass");
            class376.field5496 = arg0.method707(arg1 ^ -3, "otherlevel");
            class132.field1798 = arg0.method707(-1, "hint_mapedge");
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class249() {
        this(4096);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V")
    public class249(int arg0) {
        super(0, true);
        this.field3663 = 4096;
        this.field3663 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field3669;
        if (~arg0 == -1) {
            this.field3663 = (arg2.method1738((byte) 77) << 12) / 255;
        }
        if (arg1 != -11941) {
            field3666 = null;
        }
    }
}
