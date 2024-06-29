import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class149 extends class127 {

    @OriginalMember(owner = "client!wd", name = "Cc", descriptor = "Lr;")
    public static class118 field3687 = new class118(64);

    @OriginalMember(owner = "client!wd", name = "Lc", descriptor = "I")
    public static int field3696 = 0;

    @OriginalMember(owner = "client!wd", name = "Mc", descriptor = "Loc;")
    private static class99 field3697 = class48.method402((byte) -104, "Close");

    @OriginalMember(owner = "client!wd", name = "Ic", descriptor = "Loc;")
    public static class99 field3693 = field3697;

    @OriginalMember(owner = "client!wd", name = "Nc", descriptor = "I")
    public static int field3698 = (int) (33.0D * Math.random()) + -16;

    @OriginalMember(owner = "client!wd", name = "Jc", descriptor = "Loc;")
    public static class99 field3694 = class48.method402((byte) -104, ":duelreq:");

    @OriginalMember(owner = "client!wd", name = "Gc", descriptor = "[Lwd;")
    public static class149[] field3691 = new class149[32768];

    @OriginalMember(owner = "client!wd", name = "zc", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!wd", name = "Ac", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!wd", name = "Bc", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!wd", name = "Dc", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!wd", name = "Fc", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!wd", name = "Kc", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!wd", name = "Oc", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!wd", name = "Ec", descriptor = "Lgd;")
    public class46 field3689;

    @OriginalMember(owner = "client!wd", name = "Hc", descriptor = "[I")
    public static int[] field3692;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V")
    public static void method1204(int arg0) {
        field3687 = null;
        field3693 = null;
        field3691 = null;
        field3694 = null;
        field3692 = null;
        field3697 = null;
        if (arg0 != 0) {
            method1208((byte) 17);
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)Ldd;")
    public final class26 method276(byte arg0) {
        ++field3686;
        if (arg0 != 19) {
            return null;
        } else if (this.field3689 == null) {
            return null;
        } else {
            class81 var2 = ~super.field3132 != 0 && super.field3128 == 0 ? class142.method1163(-113, super.field3132) : null;
            class81 var3 = ~super.field3092 == 0 || super.field3126 == super.field3092 && var2 != null ? null : class142.method1163(-126, super.field3092);
            class26 var4 = this.field3689.method386(super.field3081, arg0 ^ -108, super.field3108, var2, var3);
            if (var4 == null) {
                return null;
            } else {
                var4.method239();
                super.field3087 = var4.field2187;
                if (~super.field3088 != 0 && ~super.field3062 != 0) {
                    class26 var5 = class52.method434(super.field3088, 25138).method147(super.field3062, (byte) -103);
                    if (var5 != null) {
                        var5.method232(0, -super.field3106, 0);
                        class26[] var6 = new class26[] { var4, var5 };
                        var4 = new class26(var6, 2);
                    }
                }
                if (this.field3689.field1095 == 1) {
                    var4.field596 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)La;")
    public static final class4 method1205(Throwable arg0, String arg1) {
        class4 var2;
        if (arg0 instanceof class4) {
            var2 = (class4) arg0;
            var2.field76 = var2.field76 + ' ' + arg1;
        } else {
            var2 = new class4(arg0, arg1);
        }
        ++field3690;
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)Lgd;")
    public static final class46 method1206(int arg0, byte arg1) {
        class46 var2 = (class46) field3687.method997(arg1 + -47, (long) arg0);
        ++field3684;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class23.field553.method903(9, (byte) -128, arg0);
            if (arg1 != 46) {
                method1204(-59);
            }
            class46 var4 = new class46();
            var4.field1088 = arg0;
            if (var3 != null) {
                var4.method387(125, new class57(var3));
            }
            var4.method389((byte) 92);
            field3687.method993((byte) 100, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)I")
    public static final int method1207(int arg0, int arg1, int arg2, int arg3) {
        ++field3688;
        int var4 = arg0 & 3;
        if (~var4 == -1) {
            return arg1;
        } else {
            int var5 = -54 / ((arg3 - -85) / 37);
            if (~var4 == -2) {
                return -arg2 + 7;
            } else {
                return var4 == 2 ? 7 - arg1 : arg2;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)Z")
    public final boolean method1032(int arg0) {
        ++field3699;
        if (this.field3689 == null) {
            return false;
        } else {
            if (arg0 != -16) {
                field3691 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(B)V")
    public static final void method1208(byte arg0) {
        ++field3695;
        if (class68.field1756 == 104) {
            int var1;
            if (class25.field583 == -1) {
                var1 = class77.field1907;
            } else {
                var1 = class25.field583;
            }
            if (~class77.field1907 != ~class25.field583) {
                --var1;
                if (var1 < 0) {
                    var1 = 19;
                }
                if (class105.field2573[var1] != null) {
                    class137.field3419 = class105.field2573[var1];
                    class113.field2832 = true;
                    class25.field583 = var1;
                }
            }
        }
        if (class68.field1756 == 105 && ~class25.field583 != 0) {
            ++class25.field583;
            if (~class25.field583 <= -21) {
                class25.field583 = 0;
            }
            if (class77.field1907 != class25.field583) {
                if (class105.field2573[class25.field583] != null) {
                    class137.field3419 = class105.field2573[class25.field583];
                    class113.field2832 = true;
                }
            } else {
                class25.field583 = -1;
                class113.field2832 = true;
                class137.field3419 = class137.field3407;
            }
        }
        if (arg0 > -66) {
            field3694 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V")
    public static final void method1209(int arg0) {
        ++field3685;
        if (arg0 != 0) {
            method1209(123);
        }
        for (class110 var1 = (class110) class108.field2638.method722(118); var1 != null; var1 = (class110) class108.field2638.method716(true)) {
            if (var1.field2724 != null) {
                class140.field3481.method96(var1.field2724);
                var1.field2724 = null;
            }
            if (var1.field2718 != null) {
                class140.field3481.method96(var1.field2718);
                var1.field2718 = null;
            }
        }
        class108.field2638.method714((byte) 76);
    }
}
