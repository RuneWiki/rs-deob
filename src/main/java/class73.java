import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class73 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field1105 = 0;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "[I")
    public static int[] field1110 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "[I")
    public static int[] field1108 = new int[2];

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1111 = "rating: ";

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field1107 = 0;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field1106 = 127;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[[B")
    public static byte[][] field1109 = new byte[250][];

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Lpk;")
    public static class120 field1113;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Lln;")
    public static class27 field1115;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 4)
    public static void method584(int arg0) {
        field1111 = null;
        field1108 = null;
        field1110 = null;
        field1115 = null;
        if (arg0 != 1) {
            method585(true, 16, -112, 95);
        }
        field1113 = null;
        field1109 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZIII)V", line = 30)
    public static final void method585(boolean arg0, int arg1, int arg2, int arg3) {
        field1114++;
        if (!arg0) {
            method584(-126);
        }
        class170 var4 = class221.method1613(11, arg2, -8410);
        var4.method1269(false);
        var4.field2730 = arg1;
        var4.field2734 = arg3;
    }
}
