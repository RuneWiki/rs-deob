import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class61 extends class104 {

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "Le;")
    public static class191 field1090 = class54.method368("AUS", 2047);

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "[I")
    public static int[] field1093 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "Lwe;")
    public static class147 field1099 = new class147(50);

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "Le;")
    private static class191 field1103 = class54.method368("Allocated memory", 2047);

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "Z")
    public static boolean field1105 = true;

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "Le;")
    public static class191 field1104 = field1103;

    @OriginalMember(owner = "client!kk", name = "W", descriptor = "I")
    public static int field1107 = 0;

    @OriginalMember(owner = "client!kk", name = "X", descriptor = "[I")
    public static int[] field1108 = new int[100];

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "Le;")
    public static class191 field1106 = class54.method368("Cache:", 2047);

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "Le;")
    public class191 field1095;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "Leg;")
    public class33 field1088;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "Leg;")
    public class33 field1089;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "Z")
    public boolean field1092;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "[Ljava/lang/Object;")
    public Object[] field1101;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "[[B")
    public static byte[][] field1098;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V")
    public static void method411(int arg0) {
        if (arg0 != -8694) {
            method412(false);
        }
        field1103 = null;
        field1098 = null;
        field1090 = null;
        field1099 = null;
        field1106 = null;
        field1108 = null;
        field1093 = null;
        field1104 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V")
    public static final void method412(boolean arg0) {
        field1097++;
        if (arg0) {
            method412(false);
        }
        class132.field2203.method985(0);
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V")
    public static final void method413(int arg0) {
        field1087++;
        int var1 = class129.method875((byte) 62);
        if (arg0 != -12379) {
            field1108 = null;
        }
        if (var1 == 0) {
            class137.field2301 = null;
            class63.method422(-671859316, 0);
        } else if (var1 == 1) {
            class268.method1836(arg0 ^ 0x3068, (byte) 0);
            class63.method422(arg0 - 671846937, 512);
            class260.method1783(32245);
        } else {
            class268.method1836(91, (byte) (class182.field3131 - 4 & 0xFF));
            class63.method422(arg0 - 671846937, 2);
        }
    }
}
