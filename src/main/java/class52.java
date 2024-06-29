import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class52 extends class194 {

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "Lqk;")
    public static class207 field1009 = class24.method212(255, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "Lqk;")
    public static class207 field1010 = class24.method212(255, "d-Broulement:");

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "B")
    public byte field1006;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Lqk;")
    public static class207 field1000;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lqk;")
    public class207 field1002;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lqk;")
    public class207 field1003;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class129 var20 = new class129(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class82.field1498[var21][arg1][arg2] == null) {
                    class82.field1498[var21][arg1][arg2] = new class174(var21, arg1, arg2);
                }
            }
            class82.field1498[arg0][arg1][arg2].field3141 = var20;
        } else if (arg3 == 1) {
            class129 var22 = new class129(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class82.field1498[var23][arg1][arg2] == null) {
                    class82.field1498[var23][arg1][arg2] = new class174(var23, arg1, arg2);
                }
            }
            class82.field1498[arg0][arg1][arg2].field3141 = var22;
        } else {
            class122 var24 = new class122(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class82.field1498[var25][arg1][arg2] == null) {
                    class82.field1498[var25][arg1][arg2] = new class174(var25, arg1, arg2);
                }
            }
            class82.field1498[arg0][arg1][arg2].field3135 = var24;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lpk;I)V")
    public static final void method401(class99 arg0, int arg1) {
        field1008++;
        if (arg1 < 97) {
            field1010 = null;
        }
        class217.field3854 = arg0.method711(114, class83.field1520);
        class121.field2091 = arg0.method711(117, class233.field4288);
        class199.field3491 = arg0.method711(115, class89.field1603);
        class161.field2849 = arg0.method711(119, class46.field922);
        class197.field3466 = arg0.method711(112, class175.field3161);
        class82.field1488 = arg0.method711(127, class87.field1587);
        class182.field3240 = arg0.method711(117, class272.field4797);
        class167.field2944 = arg0.method711(105, class140.field2411);
        class65.field1184 = arg0.method711(113, class193.field3397);
        class132.field2295 = arg0.method711(116, class136.field2345);
        class155.field2720 = arg0.method711(100, class128.field2230);
        class128.field2223 = arg0.method711(119, class167.field2941);
        class36.field696 = arg0.method711(112, class209.field3700);
        class102.field1839 = arg0.method711(125, class192.field3391);
        class126.field2183 = arg0.method711(116, class129.field2243);
        class49.field968 = arg0.method711(100, class32.field642);
        class70.field1242 = arg0.method711(120, class129.field2256);
        class98.field1719 = arg0.method711(102, class121.field2095);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public static final void method402(int arg0) {
        field1005++;
        class223.field4080.method1390((byte) 125);
        if (arg0 != 25492) {
            method400(109, -20, 54, 119, 100, -52, 89, 23, 59, 44, -103, 46, -5, 24, -85, -44, 52, -41, 109, 82);
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
    public static final void method403(int arg0) {
        class86.field1566.method1390((byte) 122);
        field1007++;
        if (arg0 != 0) {
            method400(-36, 80, 1, 44, 79, 7, 115, 108, -104, -76, 89, -81, 23, -10, 106, 126, -124, 52, -75, -100);
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
    public static void method404(int arg0) {
        field1009 = null;
        field1000 = null;
        field1010 = null;
        if (arg0 != 684) {
            method404(31);
        }
    }
}
