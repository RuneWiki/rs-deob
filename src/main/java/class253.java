import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class253 extends class87 {

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    private int field3876;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    private int field3870;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    private int field3864;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    private int field3866;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    private int field3874;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    private int field3872;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    private int field3862;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    private int field3861;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field3859 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field3868 = 0;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field3871 = 0;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "[[[B")
    public static byte[][][] field3877;

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3876 = arg4;
        this.field3870 = arg3;
        this.field3864 = arg6;
        this.field3866 = arg5;
        this.field3874 = arg2;
        this.field3872 = arg1;
        this.field3862 = arg7;
        this.field3861 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLhc;)V")
    public static final void method1689(byte arg0, class235 arg1) {
        ++field3865;
        class28.field358 = arg1.method1568("titlebg", -7551);
        if (arg0 < 11) {
            method1693((byte) 37);
        }
        class245.field3745 = arg1.method1568("logo", -7551);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILse;IIIII)V")
    public static final void method1690(int arg0, int arg1, class211 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3875;
        if (class194.field2685) {
            class171.field2373 = 32;
        } else {
            class171.field2373 = 0;
        }
        class194.field2685 = false;
        if (arg4 != -16) {
            method1691((byte) -119, (Component) null);
        }
        if (class104.field1455 != 0) {
            if (~arg1 <= ~arg7 && arg7 + 16 > arg1 && ~arg6 <= ~arg3 && ~(arg3 + 16) < ~arg6) {
                arg2.field3031 -= 4;
                class236.method1583(arg2, arg4 + 16);
            } else if (~arg1 <= ~arg7 && ~arg1 > ~(arg7 + 16) && arg3 + -16 + arg5 <= arg6 && arg3 - -arg5 > arg6) {
                arg2.field3031 += 4;
                class236.method1583(arg2, 0);
            } else if (arg1 >= -class171.field2373 + arg7 && ~arg1 > ~(arg7 - -16 + class171.field2373) && ~(arg3 + 16) >= ~arg6 && arg3 + arg5 - 16 > arg6) {
                int var8 = (arg5 + -32) * arg5 / arg0;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg5 - 32 - var8;
                int var10 = arg6 + -16 + -arg3 + -(var8 / 2);
                arg2.field3031 = (-arg5 + arg0) * var10 / var9;
                class236.method1583(arg2, 0);
                class194.field2685 = true;
            }
        }
        if (~class215.field3248 != -1) {
            int var11 = arg2.field3112;
            if (~arg1 <= ~(arg7 - var11) && ~arg6 <= ~arg3 && arg1 < arg7 + 16 && ~arg6 >= ~(arg3 + arg5)) {
                arg2.field3031 += class215.field3248 * 45;
                class236.method1583(arg2, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)V")
    public final void method548(int arg0, int arg1, int arg2) {
        ++field3858;
        if (arg0 >= -62) {
            method1693((byte) 51);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1691(byte arg0, Component arg1) {
        arg1.removeMouseListener(class87.field1182);
        ++field3869;
        if (arg0 != -43) {
            method1692((class140) null, 101, -28, -75, 98, -37, (class88) null, (class111) null);
        }
        arg1.removeMouseMotionListener(class87.field1182);
        arg1.removeFocusListener(class87.field1182);
        class206.field2874 = 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZI)V")
    public final void method553(int arg0, boolean arg1, int arg2) {
        int var4 = this.field3861 * arg0 >> 12;
        if (arg1) {
            int var5 = this.field3872 * arg2 >> 12;
            int var6 = this.field3876 * arg0 >> 12;
            int var7 = this.field3870 * arg2 >> 12;
            ++field3873;
            int var8 = this.field3862 * arg2 >> 12;
            int var9 = this.field3864 * arg0 >> 12;
            int var10 = this.field3874 * arg0 >> 12;
            int var11 = this.field3866 * arg2 >> 12;
            class41.method272(var11, var7, var6, var4, -62, var8, var9, var10, var5, super.field1186);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(III)V")
    public final void method552(int arg0, int arg1, int arg2) {
        ++field3867;
        if (arg1 < 94) {
            this.field3876 = -30;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lak;IIIIILai;Lde;)V")
    public static final void method1692(class140 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, class111 arg7) {
        ++field3863;
        class71 var8 = new class71();
        var8.field980 = arg2 * arg3;
        var8.field988 = arg4;
        var8.field970 = arg5 * 128;
        if (arg7 == null) {
            if (arg0 != null) {
                var8.field971 = arg0;
                class284 var11 = arg0.field1946;
                if (var11.field4450 != null) {
                    var8.field982 = true;
                    var11 = var11.method1905((byte) -26);
                }
                if (var11 != null) {
                    var8.field972 = (var11.field4431 + arg3) * 128;
                    var8.field983 = (var11.field4431 + arg5) * 128;
                    var8.field973 = class13.method78(arg0, (byte) 126);
                    var8.field985 = var11.field4439;
                    var8.field990 = var11.field4441 * 128;
                }
                class235.field3541.method988(var8, (byte) -77);
            } else if (arg6 != null) {
                var8.field975 = arg6;
                var8.field972 = 128 * (arg6.method561(-1) + arg3);
                var8.field983 = (arg6.method561(arg2 + -129) + arg5) * 128;
                var8.field973 = class204.method1299(arg6, 79);
                var8.field990 = arg6.field1202 * 128;
                var8.field985 = arg6.field1218;
                class95.field1343.method20(var8, class73.method465((byte) -97, arg6.field1217), 0);
            }
        } else {
            var8.field978 = arg7.field1542;
            var8.field973 = arg7.field1550;
            var8.field990 = arg7.field1588 * 128;
            var8.field987 = arg7.field1562;
            int var9 = arg7.field1582;
            var8.field986 = arg7;
            var8.field969 = arg7.field1592;
            int var10 = arg7.field1598;
            var8.field985 = arg7.field1593;
            if (arg1 == 1 || ~arg1 == -4) {
                var10 = arg7.field1582;
                var9 = arg7.field1598;
            }
            var8.field983 = (arg5 + var10) * 128;
            var8.field972 = (arg3 + var9) * 128;
            if (arg7.field1597 != null) {
                var8.field982 = true;
                var8.method439(arg2 + 22259);
            }
            if (var8.field978 != null) {
                var8.field974 = (int) ((double) (-var8.field969 + var8.field987) * Math.random()) + var8.field969;
            }
            class34.field524.method988(var8, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
    public static void method1693(byte arg0) {
        if (arg0 >= 72) {
            field3877 = null;
            field3859 = null;
        }
    }
}
