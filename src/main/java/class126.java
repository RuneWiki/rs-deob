import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class126 {

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "[Lue;")
    public static class142[] field2976 = new class142[4];

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Lqf;")
    private static class117 field2983 = class72.method514(125, "Enter amount:");

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Lqf;")
    public static class117 field2970 = field2983;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Lqf;")
    private static class117 field2988 = class72.method514(119, "Please wait )2 attempting to reestablish");

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "[Z")
    public static boolean[] field2978 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Lqf;")
    public static class117 field2979 = field2988;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field2992 = 0;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Lqf;")
    public static class117 field2987 = class72.method514(122, "");

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "Lqf;")
    public static class117 field2991 = field2987;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lqf;")
    public static class117 field2975 = field2987;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Lqf;")
    public static class117 field2982 = field2987;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Lqf;")
    public static class117 field2972 = class72.method514(106, "Einloggen");

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Lqf;")
    public static class117 field2984 = field2987;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "J")
    public static long field2985 = 0L;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "Lqf;")
    public static class117 field2997 = field2987;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Lqf;")
    public static class117 field2980 = field2987;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "Lqf;")
    public static class117 field2995 = class72.method514(120, "Menge eingeben:");

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "Lqf;")
    public static class117 field2998 = class72.method514(119, "p12_full");

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field2989 = 0;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "Lqf;")
    private static class117 field2993 = class72.method514(100, "glow3:");

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lqf;")
    public static class117 field2971 = field2993;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lqf;")
    public static class117 field2974 = field2993;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "Lr;")
    public static class118 field2996;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lnc;")
    public static class93 field2977;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(JI)V")
    public static final void method992(long arg0, int arg1) {
        field2994++;
        if (arg0 == 0L) {
            return;
        }
        if (class128.field3029 >= 100) {
            class93.method739(0, 0, class85.field1936, class141.field3351);
            return;
        }
        class117 var3 = class116.method900(arg0, 92).method945(-90);
        for (int var4 = 0; var4 < class128.field3029; var4++) {
            if (class134.field3195[var4] == arg0) {
                class93.method739(0, 0, class73.method530((byte) -83, new class117[] { var3, class117.field2827 }), class141.field3351);
                return;
            }
        }
        if (arg1 <= 115) {
            return;
        }
        for (int var5 = 0; var5 < class75.field1651; var5++) {
            if (class101.field2439[var5] == arg0) {
                class93.method739(0, 0, class73.method530((byte) -83, new class117[] { class78.field1775, var3, class66.field1394 }), class141.field3351);
                return;
            }
        }
        if (var3.method918(class141.field3395.field356, 60)) {
            return;
        }
        class122.field2903++;
        class134.field3195[class128.field3029++] = arg0;
        class139.field3310 = true;
        class99.field2373.method961(39, -1198);
        class99.field2373.method606(arg0, (byte) 114);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public static void method993(boolean arg0) {
        field2983 = null;
        field2995 = null;
        field2980 = null;
        field2993 = null;
        field2974 = null;
        field2970 = null;
        field2978 = null;
        field2984 = null;
        field2997 = null;
        field2976 = null;
        field2996 = null;
        field2977 = null;
        field2987 = null;
        field2975 = null;
        field2972 = null;
        field2988 = null;
        field2998 = null;
        field2971 = null;
        field2982 = null;
        field2991 = null;
        if (arg0) {
            method994((byte) 111, 21);
        }
        field2979 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)Lid;")
    public static final class60 method994(byte arg0, int arg1) {
        field2990++;
        class60 var2 = (class60) class110.field2598.method247(arg0 - 51, (long) arg1);
        if (arg0 != 51) {
            method994((byte) -64, -102);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class68.field1410.method458(false, arg1, 13);
        class60 var4 = new class60();
        var4.field1199 = arg1;
        if (var3 != null) {
            var4.method421(new class77(var3), (byte) 106);
        }
        class110.field2598.method248((long) arg1, (byte) -112, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static final void method995(int arg0) {
        field2981++;
        if (arg0 != -27752) {
            method993(false);
        }
        class148.field3624.method250((byte) -54);
    }
}
