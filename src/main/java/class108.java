import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class108 extends class42 {

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
    private int field2704 = 128;

    @OriginalMember(owner = "client!s", name = "lb", descriptor = "I")
    private int field2709 = 128;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "[I")
    private int[] field2701 = new int[6];

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
    private int field2705 = 0;

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "I")
    private int field2702 = 0;

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "[I")
    private int[] field2703 = new int[6];

    @OriginalMember(owner = "client!s", name = "jb", descriptor = "I")
    private int field2707 = 0;

    @OriginalMember(owner = "client!s", name = "Ab", descriptor = "I")
    public int field2724 = -1;

    @OriginalMember(owner = "client!s", name = "kb", descriptor = "Lad;")
    public static class5 field2708 = class88.method674("m-Ochte sich mit Ihnen duellieren)3", 99);

    @OriginalMember(owner = "client!s", name = "nb", descriptor = "Lbb;")
    public static class9 field2711 = new class9(100);

    @OriginalMember(owner = "client!s", name = "wb", descriptor = "I")
    public static int field2720 = 0;

    @OriginalMember(owner = "client!s", name = "tb", descriptor = "Lad;")
    public static class5 field2717 = class88.method674(")3", -123);

    @OriginalMember(owner = "client!s", name = "xb", descriptor = "Lad;")
    public static class5 field2721 = class88.method674("backleft1", 48);

    @OriginalMember(owner = "client!s", name = "Bb", descriptor = "[I")
    public static int[] field2725 = new int[50];

    @OriginalMember(owner = "client!s", name = "zb", descriptor = "Lbb;")
    public static class9 field2723 = new class9(64);

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!s", name = "ib", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!s", name = "mb", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!s", name = "ob", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!s", name = "qb", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!s", name = "rb", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!s", name = "sb", descriptor = "I")
    private int field2716;

    @OriginalMember(owner = "client!s", name = "ub", descriptor = "I")
    public int field2718;

    @OriginalMember(owner = "client!s", name = "vb", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!s", name = "yb", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!s", name = "Cb", descriptor = "Lrc;")
    public static class105 field2726;

    @OriginalMember(owner = "client!s", name = "pb", descriptor = "Ltb;")
    public static class116 field2713;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)Z", line = 16)
    public static final boolean method874(boolean arg0, int arg1) {
        field2710++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else if (arg1 >= 48 && arg1 <= 57) {
            return true;
        } else {
            if (!arg0) {
                field2708 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V", line = 45)
    public static void method875(byte arg0) {
        field2708 = null;
        field2721 = null;
        field2726 = null;
        field2725 = null;
        field2717 = null;
        field2723 = null;
        field2713 = null;
        int var1 = 33 % ((arg0 - 62) / 38);
        field2711 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILgb;I)V", line = 65)
    private final void method876(int arg0, class39 arg1, int arg2) {
        if (arg0 == 1) {
            this.field2716 = arg1.method343((byte) -6);
        } else if (arg0 == 2) {
            this.field2724 = arg1.method343((byte) -6);
        } else if (arg0 == 4) {
            this.field2709 = arg1.method343((byte) -6);
        } else if (arg0 == 5) {
            this.field2704 = arg1.method343((byte) -6);
        } else if (arg0 == 6) {
            this.field2707 = arg1.method343((byte) -6);
        } else if (arg0 == 7) {
            this.field2705 = arg1.method330(-30864);
        } else if (arg0 == 8) {
            this.field2702 = arg1.method330(-30864);
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field2701[arg0 - 40] = arg1.method343((byte) -6);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field2703[arg0 - 50] = arg1.method343((byte) -6);
        }
        field2712++;
        if (arg2 < 70) {
            this.method880(75, null);
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(B)V", line = 125)
    public static final void method877(byte arg0) {
        class5.field163.field957 = 0;
        class1.field3 = 0;
        class75.field1804 = 0;
        class18.field481 = -1;
        class7.field267 = 0;
        class35.field883 = 0;
        class36.field907.field957 = 0;
        class43.field1108 = -1;
        class12.field373 = 0;
        class4.field145 = 0;
        class4.field139 = -1;
        if (arg0 > -123) {
            return;
        }
        field2722++;
        class128.field3069 = false;
        class3.field118 = -1;
        for (int var1 = 0; var1 < class7.field251.length; var1++) {
            if (class7.field251[var1] != null) {
                class7.field251[var1].field45 = -1;
            }
        }
        for (int var2 = 0; var2 < class103.field2504.length; var2++) {
            if (class103.field2504[var2] != null) {
                class103.field2504[var2].field45 = -1;
            }
        }
        class69.method541(30, 20);
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V", line = 172)
    public static final void method878(int arg0) {
        int var1 = 73 / ((19 - arg0) / 54);
        field2706++;
        for (class132 var2 = (class132) class78.field1844.method180(0); var2 != null; var2 = (class132) class78.field1844.method181(0)) {
            if (var2.field3186 > 0) {
                var2.field3186--;
            }
            if (var2.field3186 != 0) {
                if (var2.field3202 > 0) {
                    var2.field3202--;
                }
                if (var2.field3202 == 0 && var2.field3200 >= 1 && var2.field3187 >= 1 && var2.field3200 <= 102 && var2.field3187 <= 102 && (var2.field3197 < 0 || client.method149(var2.field3203, var2.field3197, true))) {
                    class133.method1027(var2.field3205, var2.field3197, var2.field3203, var2.field3200, var2.field3193, var2.field3187, var2.field3198, (byte) -89);
                    var2.field3202 = -1;
                    if (var2.field3197 == var2.field3194 && var2.field3194 == -1) {
                        var2.method114(-3789);
                    } else if (var2.field3197 == var2.field3194 && var2.field3205 == var2.field3185 && var2.field3203 == var2.field3188) {
                        var2.method114(-3789);
                    }
                }
            } else if (var2.field3194 < 0 || client.method149(var2.field3188, var2.field3194, true)) {
                class133.method1027(var2.field3185, var2.field3194, var2.field3188, var2.field3200, var2.field3193, var2.field3187, var2.field3198, (byte) -89);
                var2.method114(-3789);
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lhc;", line = 238)
    public final class45 method879(int arg0, int arg1) {
        field2719++;
        class45 var3 = (class45) class7.field257.method98(-8, (long) this.field2718);
        if (var3 == null) {
            var3 = class45.method400(class112.field2794, this.field2716, 0);
            if (var3 == null) {
                return null;
            }
            for (int var4 = 0; var4 < 6; var4++) {
                if (this.field2701[0] != 0) {
                    var3.method381(this.field2701[var4], this.field2703[var4]);
                }
            }
            var3.method378();
            var3.method392(this.field2705 + 64, this.field2702 + 850, -30, -50, -30, true);
            class7.field257.method102((long) this.field2718, var3, arg0 ^ 0xFFFFFF82);
        }
        class45 var5;
        if (this.field2724 == arg0 || arg1 == -1) {
            var5 = var3.method385(true);
        } else {
            var5 = class78.method605(this.field2724, (byte) 20).method576(0, var3, arg1);
        }
        if (this.field2709 != 128 || this.field2704 != 128) {
            var5.method373(this.field2709, this.field2704, this.field2709);
        }
        if (this.field2707 != 0) {
            if (this.field2707 == 90) {
                var5.method380();
            }
            if (this.field2707 == 180) {
                var5.method380();
                var5.method380();
            }
            if (this.field2707 == 270) {
                var5.method380();
                var5.method380();
                var5.method380();
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILgb;)V", line = 316)
    public final void method880(int arg0, class39 arg1) {
        if (arg0 != -4113) {
            return;
        }
        while (true) {
            int var3 = arg1.method330(-30864);
            if (var3 == 0) {
                field2715++;
                return;
            }
            this.method876(var3, arg1, arg0 + 4214);
        }
    }
}
