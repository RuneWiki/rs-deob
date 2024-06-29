import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class160 extends class50 {

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    private final int field2874;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    private final int field2870;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    private final int field2877;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    private final int field2880;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "[I")
    public static int[] field2865 = new int[256];

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "[I")
    public static int[] field2867 = new int[128];

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field2869 = 0;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Lr;")
    private static class66 field2866 = class93.method641(43, "Hidden");

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public static int field2876 = 0;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Lr;")
    public static class66 field2871 = field2866;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "Lei;")
    public static class232 field2881;

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIII)V")
    public class160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2874 = arg1;
        this.field2870 = arg2;
        this.field2877 = arg0;
        this.field2880 = arg3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLfa;)V")
    public static final void method1085(byte arg0, class45 arg1) {
        if (arg0 != -10) {
            method1086((class28) null, -124, 33, 69);
        }
        class217 var2 = (class217) class52.field921.method1381(arg1.field815.method479(10908), 117);
        ++field2873;
        if (var2 == null) {
            class242.method1596(19395, arg1.field2086[0], (class37) null, (class231) null, 0, arg1.field2039[0], class196.field3401, arg1);
        } else {
            var2.method1397(31506);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lcj;III)[Ldh;")
    public static final class265[] method1086(class28 arg0, int arg1, int arg2, int arg3) {
        ++field2879;
        if (arg3 > -93) {
            return null;
        } else {
            return !class31.method174(-29381, arg1, arg0, arg2) ? null : class64.method434(31);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZII)V")
    public final void method79(boolean arg0, int arg1, int arg2) {
        ++field2872;
        int var4 = this.field2877 * arg1 >> 12;
        if (!arg0) {
            this.method80(-20, -94, 39);
        }
        int var5 = this.field2870 * arg1 >> 12;
        int var6 = this.field2880 * arg2 >> 12;
        int var7 = this.field2874 * arg2 >> 12;
        class234.method1527(var4, super.field893, var7, var5, (byte) -126, var6);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method1087(byte arg0) {
        field2867 = null;
        field2881 = null;
        if (arg0 != 15) {
            field2865 = null;
        }
        field2871 = null;
        field2865 = null;
        field2866 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Llh;ILr;)I")
    public static final int method1088(class249 arg0, int arg1, class66 arg2) {
        ++field2868;
        int var3 = arg0.field4335;
        arg0.method1683(arg2.field1308, -1);
        arg0.field4335 += class82.field1595.method628(arg2.field1308, arg0.field4350, arg2.field1283, Integer.MIN_VALUE, arg0.field4335, arg1);
        return -var3 + arg0.field4335;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)V")
    public final void method75(int arg0, int arg1, int arg2) {
        ++field2878;
        int var4 = -17 % ((arg1 - -49) / 43);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
    public final void method80(int arg0, int arg1, int arg2) {
        ++field2882;
        if (arg1 != 23700) {
            field2867 = null;
        }
    }
}
