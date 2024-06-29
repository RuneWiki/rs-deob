import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class125 {

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public int field3170 = -1;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lkd;")
    public static class73 field3162 = class126.method1070((byte) -66, "Hier wechseln");

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Lkd;")
    private static class73 field3175 = class126.method1070((byte) -66, "No reply from loginserver)3");

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field3166 = 0;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Lkd;")
    public static class73 field3172 = class126.method1070((byte) -66, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "Lkd;")
    public static class73 field3177 = field3175;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Ljb;")
    public static class64 field3171 = new class64(100);

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "Lkd;")
    private static class73 field3180 = class126.method1070((byte) -66, "Off");

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Lkd;")
    public static class73 field3179 = field3180;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Lid;")
    public class60 field3167;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "[I")
    public static int[] field3169;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "[I")
    public int[] field3178;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "[Lde;")
    public static class27[] field3181;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "[Lkd;")
    public class73[] field3163;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lkd;Lkd;Lq;I)Lgd;")
    public static final class46 method1054(class73 arg0, class73 arg1, class111 arg2, int arg3) {
        field3165++;
        if (arg3 == -24841) {
            int var4 = arg2.method905(arg0, (byte) -72);
            int var5 = arg2.method902(0, var4, arg1);
            return class39.method302((byte) 2, arg2, var5, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
    public static final void method1055(int arg0, int arg1) {
        class77 var2 = (class77) class52.field1382.method1096((byte) 98);
        if (arg1 != 8494) {
            return;
        }
        while (var2 != null) {
            if ((long) arg0 == (var2.field3522 >> 48 & 0xFFFFL)) {
                var2.method1147((byte) -46);
            }
            var2 = (class77) class52.field1382.method1094(0);
        }
        field3161++;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)Z")
    public static final boolean method1056(int arg0, int arg1) {
        if (arg0 >= -126) {
            return true;
        } else {
            field3176++;
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method1057(byte arg0) {
        field3177 = null;
        field3171 = null;
        field3180 = null;
        field3175 = null;
        field3172 = null;
        if (arg0 >= 101) {
            field3169 = null;
            field3162 = null;
            field3179 = null;
            field3181 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIILa;I)V")
    public static final void method1058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class1 arg7, int arg8) {
        if (class74.field1916) {
            class14.field430 = 32;
        } else {
            class14.field430 = 0;
        }
        class74.field1916 = false;
        if (arg1 <= arg5 && arg5 < arg1 + 16 && arg4 >= arg0 && arg0 + 16 > arg4) {
            if (arg6 == 1) {
                class38.field1028 = true;
            }
            if (arg6 == 2 || arg6 == 3) {
                class132.field3304 = true;
            }
            arg7.field86 -= class78.field1996 * 4;
        } else if (arg5 >= arg1 && arg1 + 16 > arg5 && arg0 + arg2 - 16 <= arg4 && arg4 < arg0 + arg2) {
            if (arg6 == 2 || arg6 == 3) {
                class132.field3304 = true;
            }
            if (arg6 == 1) {
                class38.field1028 = true;
            }
            arg7.field86 += class78.field1996 * 4;
        } else if (arg1 - class14.field430 <= arg5 && arg5 < class14.field430 + arg1 + 16 && arg4 >= arg0 + 16 && arg0 + arg2 - 16 > arg4 && class78.field1996 > 0) {
            class74.field1916 = true;
            if (arg6 == 1) {
                class38.field1028 = true;
            }
            if (arg6 == 2 || arg6 == 3) {
                class132.field3304 = true;
            }
            int var9 = (arg2 - 32) * arg2 / arg3;
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg2 - var9 - 32;
            int var11 = arg4 - var9 / 2 - arg0 - 16;
            arg7.field86 = (arg3 - arg2) * var11 / var10;
        }
        field3168++;
        if (~class83.field2087 == arg8) {
            return;
        }
        int var12 = arg7.field96;
        if (arg6 == -1) {
            var12 = 479;
        }
        if (arg1 - var12 > arg5 || arg4 < arg0 || arg1 + 16 <= arg5 || arg4 > arg0 + arg2) {
            return;
        }
        if (arg6 == 2 || arg6 == 3) {
            class132.field3304 = true;
        }
        if (arg6 == 1) {
            class38.field1028 = true;
        }
        arg7.field86 += class83.field2087 * 45;
        return;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lq;ILq;Lq;)V")
    public static final void method1059(class111 arg0, int arg1, class111 arg2, class111 arg3) {
        class114.field2882 = arg3;
        if (arg1 != -16) {
            return;
        }
        field3174++;
        class48.field1270 = arg2;
        class62.field1632 = arg0;
        class120.field3066 = new class1[class48.field1270.method904(arg1 ^ 0xFFFF8122)][];
        class70.field1781 = new boolean[class48.field1270.method904(32466)];
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
    public static final void method1060(byte arg0) {
        class98.field2450.method534((byte) -78);
        field3164++;
        class114.field2834.method534((byte) -115);
        class36.field965.method534((byte) -117);
        class78.field1979.method534((byte) -119);
        if (arg0 != -86) {
            method1058(5, 25, -66, -114, -38, -51, 27, null, -71);
        }
    }
}
