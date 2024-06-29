import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class339 extends class179 {

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public int field4827 = 1;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "[I")
    public static int[] field4825 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field4830 = 1;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field4826 = 12;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field4829 = 0;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "[I")
    public static int[] field4836 = new int[14];

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "C")
    public char field4824;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "Lof;")
    public static class421 field4837;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method2194(String arg0, int arg1) throws ClassNotFoundException {
        if (arg1 != 14) {
            field4836 = null;
        }
        field4828++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lec;II)V")
    private final void method2195(class37 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field4824 = class254.method1841(arg0.method291(arg1 ^ 0x78), (byte) -127);
        } else if (arg2 == 2) {
            this.field4827 = 0;
        }
        field4834++;
        if (arg1 != 120) {
            this.method2195((class37) null, -31, 115);
        }
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
    public static void method2196(int arg0) {
        field4836 = null;
        if (arg0 != 168) {
            field4829 = -6;
        }
        field4837 = null;
        field4825 = null;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V")
    public static final void method2197(byte arg0) {
        if (arg0 >= -33) {
            field4837 = null;
        }
        field4833++;
        class145.method1151();
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)V")
    public static final void method2198(byte arg0, int arg1) {
        if (arg0 != 4) {
            method2199(116, -80, -113, -27);
        }
        field4832++;
        if (class51.method407(arg1, 4)) {
            class326.method2154(-1, (byte) -57, class45.field710[arg1]);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)I")
    public static final int method2199(int arg0, int arg1, int arg2, int arg3) {
        field4831++;
        if ((class278.field4176[arg2][arg0][arg3] & 0x8) == 0) {
            if (arg1 != -24537) {
                method2198((byte) 15, 10);
            }
            return arg2 <= 0 || (class278.field4176[1][arg0][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lec;I)V")
    public final void method2200(class37 arg0, int arg1) {
        field4835++;
        if (arg1 != -1) {
            this.method2200((class37) null, -5);
        }
        while (true) {
            int var3 = arg0.method271((byte) 117);
            if (var3 == 0) {
                return;
            }
            this.method2195(arg0, arg1 + 121, var3);
        }
    }
}
