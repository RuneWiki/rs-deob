import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class229 extends class584 {

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "Z")
    private boolean field2921 = false;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "[J")
    public static long[] field2913 = new long[100];

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "Z")
    public static boolean field2917 = true;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "[I")
    public static int[] field2918 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "Z")
    public static volatile boolean field2914 = true;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "Lkfa;")
    public static class549 field2920 = new class549(11, 16);

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "Ljo;")
    public static class303 field2923;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZZ)V")
    public final void method177(boolean arg0, boolean arg1) {
        super.field8309.method2759(class676.field9584, (byte) -5, class193.field2323);
        if (!arg1) {
            this.method180(false, 44);
        }
        ++field2915;
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(B)V")
    public static void method1333(byte arg0) {
        field2923 = null;
        field2913 = null;
        if (arg0 != 20) {
            method1334(4, -59, -71, -121, 20, -86, -121, 49, -108);
        }
        field2918 = null;
        field2920 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 != 0) {
            method1334(-9, -116, -59, 37, 53, 92, -67, 19, 59);
        }
        ++field2916;
        if (~arg7 <= -2 && ~arg6 <= -2 && arg7 <= class399.field5338 + -2 && ~arg6 >= ~(class349.field4567 + -2)) {
            int var9 = arg2;
            if (~arg2 > -4 && class166.method996(arg7, 30405, arg6)) {
                var9 = arg2 + 1;
            }
            if (!class601.field8530.method1835(class150.field1711, (byte) 102) && !class177.method1042(arg6, (byte) -73, arg7, var9, class676.field9588)) {
                return;
            }
            if (class97.field1074 == null) {
                return;
            }
            class110.field1273.method2277(arg5, class475.field6919[arg2], arg7, -1, class453.field6284, arg2, arg6);
            if (~arg3 <= -1) {
                boolean var10 = class601.field8530.field2839;
                class601.field8530.field2839 = true;
                class110.field1273.method2273(false, var9, class475.field6919[arg2], arg2, arg3, arg6, arg8, arg0, class453.field6284, arg1, arg7);
                class601.field8530.field2839 = var10;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(B)Z")
    public final boolean method178(byte arg0) {
        ++field2911;
        if (arg0 > -6) {
            field2917 = false;
        }
        return true;
    }

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)V")
    public final void method174(int arg0) {
        if (this.field2921) {
            super.field8309.method2690(1, 5);
            super.field8309.method1180(6, class392.field5226);
            super.field8309.method2759(class193.field2323, (byte) -5, class193.field2323);
            super.field8309.method2757(class521.field7461, (byte) -73, 2);
            super.field8309.method2723(class67.field708, -30892, 0);
            super.field8309.method2699((byte) -51);
            super.field8309.method2696(-2, (class155) null);
            super.field8309.method2690(0, 5);
            this.field2921 = false;
        } else {
            super.field8309.method2723(class67.field708, -30892, 0);
        }
        ++field2912;
        int var2 = -18 % ((arg0 - 86) / 40);
        super.field8309.method2759(class193.field2323, (byte) -5, class193.field2323);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V")
    public final void method175(int arg0, int arg1, int arg2) {
        ++field2922;
        if (arg2 < 116) {
            this.method185(12, (class155) null, (byte) 41);
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(ZI)V")
    public final void method180(boolean arg0, int arg1) {
        ++field2919;
        if (arg1 != -1) {
            field2918 = null;
        }
        class614 var3 = super.field8309.method2717((byte) -49);
        if (var3 != null && arg0) {
            super.field8309.method2690(1, 5);
            super.field8309.method2696(-2, var3);
            super.field8309.method1180(6, class23.field206);
            super.field8309.method2690(1, 5);
            super.field8309.method2759(class676.field9584, (byte) -5, class471.field6575);
            super.field8309.method1168(false, true, class19.field171, 2, arg1 + -120);
            super.field8309.method2723(class561.field7981, -30892, 0);
            class667 var4 = super.field8309.method2730(101);
            var4.method3755((byte) 55, super.field8309.method2728((byte) 49));
            super.field8309.method2689(false, class136.field1555);
            super.field8309.method2690(0, 5);
            this.field2921 = true;
        } else {
            super.field8309.method2723(class561.field7981, -30892, 0);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILld;B)V")
    public final void method185(int arg0, class155 arg1, byte arg2) {
        super.field8309.method2696(-2, arg1);
        ++field2910;
        if (arg2 <= 17) {
            this.method174(102);
        }
        super.field8309.method2725(arg0, -31628);
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lfo;)V")
    public class229(class473 arg0) {
        super(arg0);
    }
}
