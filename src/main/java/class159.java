import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class159 extends class242 {

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    private int field2780 = 0;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    private int field2776 = 0;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    private int field2772 = 1365;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    private int field2785 = 20;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "Lp;")
    public static class280 field2769 = class18.method140((byte) -123, "_labels");

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "Lp;")
    public static class280 field2774 = class18.method140((byte) -128, " de votre liste d(Wamis)3");

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "Lp;")
    public static class280 field2782 = class18.method140((byte) -122, "::clientjs5drop");

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "[Lp;")
    public static class280[] field2770 = new class280[1000];

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "Z")
    public static boolean field2773 = false;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "Lp;")
    public static class280 field2771 = class18.method140((byte) -120, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "Lde;")
    public static class108 field2786;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILtg;)Lnd;")
    public static final class258 method1128(int arg0, int arg1, class180 arg2) {
        ++field2778;
        if (arg0 != 31515) {
            field2773 = false;
        }
        byte[] var3 = arg2.method1254(true, arg1);
        return var3 == null ? null : new class258(var3);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        int var3 = -3 % ((73 - arg1) / 41);
        ++field2781;
        int[] var4 = super.field4251.method1417((byte) 104, arg0);
        if (super.field4251.field3655) {
            for (int var5 = 0; var5 < class264.field4654; ++var5) {
                int var6 = (class102.field1701[var5] << 12) / this.field2772 + this.field2776;
                int var7 = (class117.field2106[arg0] << 12) / this.field2772 + this.field2780;
                int var8 = var6;
                int var9 = var7;
                int var10 = var6;
                int var11 = var7;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                for (int var14 = var7 * var7 >> 12; ~(var12 + var14) > -16385 && var13 < this.field2785; var14 = var11 * var11 >> 12) {
                    ++var13;
                    var11 = (var10 * var11 >> 12) * 2 + var9;
                    var10 = var8 + var12 - var14;
                    var12 = var10 * var10 >> 12;
                }
                var4[var5] = var13 < this.field2785 - 1 ? (var13 << 12) / this.field2785 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(III)V")
    public static final void method1129(int arg0, int arg1, int arg2) {
        class193.field3397 = true;
        class160.field2806 = arg0;
        class258.field4574 = arg1;
        class282.field4959 = arg2;
        class115.field2091 = -1;
        class147.field2560 = -1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(JI)V")
    public static final void method1130(long arg0, int arg1) {
        if (arg1 != 0) {
            field2786 = null;
        }
        ++field2775;
        if (~arg0 < -1L) {
            if (~(arg0 % 10L) == -1L) {
                class55.method403(arg0 + -1L, (byte) 125);
                class55.method403(1L, (byte) 107);
            } else {
                class55.method403(arg0, (byte) 87);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)Lcd;")
    public static final class27 method1131(byte arg0, int arg1) {
        if (arg0 > -3) {
            method1131((byte) -23, -90);
        }
        class27 var2 = (class27) class34.field635.method1699((long) arg1, 108);
        ++field2779;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class83.field1377.method1258(11, arg1, (byte) 106);
            class27 var4 = new class27();
            if (var3 != null) {
                var4.method244((byte) 117, new class25(var3));
            }
            class34.field635.method1703(var4, (byte) 111, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class159() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class33 var7 = new class33();
        var7.field625 = arg1 / 128;
        var7.field619 = arg2 / 128;
        var7.field617 = arg3 / 128;
        var7.field602 = arg4 / 128;
        var7.field604 = arg0;
        var7.field621 = arg1;
        var7.field608 = arg2;
        var7.field615 = arg3;
        var7.field609 = arg4;
        var7.field618 = arg5;
        var7.field614 = arg6;
        class191.field3350[class237.field4120++] = var7;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field2780 = arg2.method193((byte) 77);
                    }
                } else {
                    this.field2776 = arg2.method193((byte) 77);
                }
            } else {
                this.field2785 = arg2.method193((byte) 77);
            }
        } else {
            this.field2772 = arg2.method193((byte) 77);
        }
        if (arg0 >= -119) {
            method1130(81L, -123);
        }
        ++field2784;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BJ)Lp;")
    public static final class280 method1133(byte arg0, long arg1) {
        class215.field3706.setTime(new Date(arg1));
        int var3 = class215.field3706.get(7);
        ++field2783;
        int var4 = class215.field3706.get(5);
        if (arg0 != 113) {
            field2782 = null;
        }
        int var5 = class215.field3706.get(2);
        int var6 = class215.field3706.get(1);
        int var7 = class215.field3706.get(11);
        int var8 = class215.field3706.get(12);
        int var9 = class215.field3706.get(13);
        return class30.method266(new class280[] { class182.field3176[var3 - 1], class89.field1449, class249.method1685((byte) -124, var4 / 10), class249.method1685((byte) 103, var4 % 10), class197.field3448, class125.field2190[var5], class197.field3448, class249.method1685((byte) 90, var6), class203.field3530, class249.method1685((byte) -74, var7 / 10), class249.method1685((byte) -128, var7 % 10), class118.field2113, class249.method1685((byte) 81, var8 / 10), class249.method1685((byte) 126, var8 % 10), class118.field2113, class249.method1685((byte) 87, var9 / 10), class249.method1685((byte) -120, var9 % 10), class66.field1109 }, (byte) -87);
    }

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)V")
    public static void method1134(int arg0) {
        field2770 = null;
        field2782 = null;
        field2774 = null;
        field2769 = null;
        int var1 = 74 / ((55 - arg0) / 45);
        field2786 = null;
        field2771 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 2) {
            field2773 = true;
        }
        ++field2777;
        if (~arg5 == ~arg7) {
            class271.method1812(arg6, arg3, arg5, 2, arg4, arg1, arg2);
        } else if (class89.field1440 <= arg6 - arg5 && ~(arg6 - -arg5) >= ~class12.field249 && ~(-arg7 + arg4) <= ~class36.field654 && class249.field4360 >= arg4 - -arg7) {
            class160.method1140(arg1, arg4, arg3, arg7, (byte) 113, arg2, arg5, arg6);
        } else {
            class15.method118(arg1, (byte) 125, arg2, arg4, arg7, arg6, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class169 var20 = new class169(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class220.field3787[var21][arg1][arg2] == null) {
                    class220.field3787[var21][arg1][arg2] = new class162(var21, arg1, arg2);
                }
            }
            class220.field3787[arg0][arg1][arg2].field2847 = var20;
        } else if (arg3 != 1) {
            class63 var24 = new class63(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class220.field3787[var25][arg1][arg2] == null) {
                    class220.field3787[var25][arg1][arg2] = new class162(var25, arg1, arg2);
                }
            }
            class220.field3787[arg0][arg1][arg2].field2837 = var24;
        } else {
            class169 var22 = new class169(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class220.field3787[var23][arg1][arg2] == null) {
                    class220.field3787[var23][arg1][arg2] = new class162(var23, arg1, arg2);
                }
            }
            class220.field3787[arg0][arg1][arg2].field2847 = var22;
        }
    }
}
