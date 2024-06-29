import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class173 extends class79 {

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "[I")
    public static int[] field2731 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "Lck;")
    private static class119 field2737 = class298.method1987((byte) 11, "FULL");

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "[I")
    public static int[] field2727 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "Lck;")
    public static class119 field2751 = class298.method1987((byte) 110, "settings");

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "Lck;")
    public static class119 field2744 = field2737;

    @OriginalMember(owner = "client!qj", name = "db", descriptor = "[[B")
    public static byte[][] field2757 = new byte[1000][];

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public int field2725;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public int field2730;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
    public int field2732;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public int field2735;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    public int field2743;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    public int field2745;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public int field2746;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "I")
    public int field2748;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
    public int field2749;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!qj", name = "bb", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!qj", name = "cb", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "Lke;")
    public class177 field2747;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "Lbl;")
    public class202 field2736;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "Loe;")
    public class239 field2733;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "Lph;")
    public class34 field2752;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILva;I)Lra;", line = 29)
    public static final class43 method1102(int arg0, int arg1, class36 arg2, int arg3) {
        field2728++;
        if (arg0 > -53) {
            method1103((Component) null, -4);
        }
        return class56.method414(arg1, arg2, false, arg3) ? class190.method1205(true) : null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 57)
    public static final void method1103(Component arg0, int arg1) {
        field2750++;
        arg0.removeMouseListener(class299.field5049);
        arg0.removeMouseMotionListener(class299.field5049);
        arg0.removeFocusListener(class299.field5049);
        class246.field3980 = 0;
        if (arg1 > 0) {
            field2727 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZIIIIIIIBII)Z", line = 71)
    public static final boolean method1104(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, int arg11) {
        if (arg9 != 9) {
            return true;
        }
        field2739++;
        if (class124.field1917.field4956 == 2) {
            return class260.method1667(arg4, arg5, arg1, arg6, arg2, arg10, arg0, arg11, arg3, arg7, (byte) -115, arg8);
        } else if (class124.field1917.field4956 <= 2) {
            return class140.method923(arg1, arg10, arg3, arg11, arg6, arg0, arg7, (byte) 82, arg2, arg8, arg5, arg4);
        } else {
            return class126.method846(98, arg8, arg5, arg3, arg11, arg1, arg0, arg7, arg10, arg4, arg2, arg6, class124.field1917.field4956);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V", line = 100)
    public static void method1105(int arg0) {
        field2737 = null;
        if (arg0 != 25285) {
            return;
        }
        field2731 = null;
        field2757 = (byte[][]) null;
        field2727 = null;
        field2744 = null;
        field2751 = null;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V", line = 123)
    public final void method1106(int arg0) {
        this.field2736 = null;
        this.field2733 = null;
        field2738++;
        if (arg0 != 64) {
            method1105(105);
        }
        this.field2752 = null;
        this.field2747 = null;
    }
}
