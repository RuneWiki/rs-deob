import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class169 {

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "J")
    public long field3049 = 0L;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Lqe;")
    public static class179 field3045 = class206.method1380(":", (byte) -2);

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field3043 = 0;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Lqe;")
    public static class179 field3048 = class206.method1380("", (byte) -126);

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public int field3039;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public int field3040;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public int field3041;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public int field3042;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public int field3044;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public int field3046;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Lrb;")
    public class186 field3038;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Lrb;")
    public class186 field3051;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIILae;II)V")
    public static final void method1074(int arg0, int arg1, int arg2, int arg3, class6 arg4, int arg5, int arg6) {
        if (arg0 != 20) {
            return;
        }
        field3052++;
        int var7 = arg5 * arg5 + arg6 * arg6;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg4.field169 / 2, arg4.field73 / 2);
        if (var7 <= var8 * var8) {
            class138.method879(arg4, arg5, arg1, arg3, (byte) -19, class216.field3999[arg2], arg6);
            return;
        }
        var8 -= 10;
        int var9 = class236.field4342 + class143.field2608 & 0x7FF;
        int var10 = class27.field600[var9];
        int var11 = var10 * 256 / (class68.field1364 + 256);
        int var12 = class27.field612[var9];
        int var13 = var12 * 256 / (class68.field1364 + 256);
        int var14 = arg5 * var13 + arg6 * var11 >> 16;
        int var15 = arg5 * var11 - arg6 * var13 >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) ((double) var8 * Math.cos(var16));
        ((class126) class99.field1846[arg2]).method816(arg4.field169 / 2 + arg1 + var18 - 10, arg3 - -(arg4.field73 / 2) - (var19 + 10), 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method1075(byte arg0) {
        field3048 = null;
        if (arg0 != 24) {
            method1075((byte) -110);
        }
        field3045 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method1076(boolean arg0, Component arg1) {
        field3050++;
        if (!arg0) {
            method1076(false, null);
        }
        arg1.addMouseListener(class232.field4266);
        arg1.addMouseMotionListener(class232.field4266);
        arg1.addFocusListener(class232.field4266);
    }
}
