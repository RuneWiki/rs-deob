import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class209 extends class168 {

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Lok;")
    public static class166 field2864 = new class166(5, 15);

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "Z")
    public static boolean field2866 = false;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Lff;")
    public static class9 field2867 = new class9(7, -2);

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "S")
    public static short field2869 = 256;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Lcu;")
    public static class145 field2870 = new class145(2, -1);

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "[Lna;")
    public static class35[] field2868;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "[[I")
    public static int[][] field2863;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 3)
    public static void method1327(int arg0) {
        field2867 = null;
        field2868 = null;
        if (arg0 != 4) {
            field2863 = null;
        }
        field2864 = null;
        field2863 = null;
        field2870 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILii;Lii;ZZ)I", line = 32)
    public static final int method1328(int arg0, class386 arg1, class386 arg2, boolean arg3, boolean arg4) {
        field2865++;
        if (arg0 == 1) {
            int var5 = arg2.field2352;
            int var6 = arg1.field2352;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4) {
            return -106;
        } else if (arg0 == 2) {
            return class232.method1445(class489.field6789, arg2.method2286((byte) -23).field2878, arg1.method2286((byte) -58).field2878, !arg4);
        } else if (arg0 == 3) {
            if (arg2.field5249.equals("-")) {
                if (arg1.field5249.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field5249.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class232.method1445(class489.field6789, arg2.field5249, arg1.field5249, true);
            }
        } else if (arg0 == 4) {
            if (arg2.method1084((byte) 33)) {
                return arg1.method1084((byte) -121) ? 0 : 1;
            } else if (arg1.method1084((byte) -120)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 5) {
            if (arg2.method1088(true)) {
                return arg1.method1088(true) ? 0 : 1;
            } else if (arg1.method1088(true)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 6) {
            if (arg2.method1086(60)) {
                return arg1.method1086(110) ? 0 : 1;
            } else if (arg1.method1086(48)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 7) {
            if (arg2.method1083(0)) {
                return arg1.method1083(0) ? 0 : 1;
            } else if (arg1.method1083(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 8) {
            int var7 = arg2.field5253;
            int var8 = arg1.field5253;
            if (arg3) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var8 == -1) {
                    var8 = 1000;
                }
                if (var7 == -1) {
                    var7 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg2.field5250 - arg1.field5250;
        }
    }
}
