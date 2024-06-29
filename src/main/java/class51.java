import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class51 extends class210 {

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field1085 = 0;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "Ljd;")
    public static class92 field1084 = class202.method1325((byte) 90, "0(U");

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Ljd;")
    public static class92 field1079 = class202.method1325((byte) 90, "<col=ff9040>");

    @OriginalMember(owner = "client!f", name = "D", descriptor = "[Z")
    public static boolean[] field1091 = new boolean[8];

    @OriginalMember(owner = "client!f", name = "E", descriptor = "Ljd;")
    public static class92 field1092 = class202.method1325((byte) 90, "<col=c0ff00>");

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field1096 = 50;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "[I")
    public static int[] field1094 = new int[field1096];

    @OriginalMember(owner = "client!f", name = "y", descriptor = "[I")
    public static int[] field1088 = new int[field1096];

    @OriginalMember(owner = "client!f", name = "B", descriptor = "[I")
    public static int[] field1090 = new int[field1096];

    @OriginalMember(owner = "client!f", name = "F", descriptor = "[I")
    public static int[] field1093 = new int[field1096];

    @OriginalMember(owner = "client!f", name = "s", descriptor = "[Ljd;")
    public static class92[] field1082 = new class92[field1096];

    @OriginalMember(owner = "client!f", name = "x", descriptor = "[I")
    public static int[] field1087 = new int[field1096];

    @OriginalMember(owner = "client!f", name = "z", descriptor = "[I")
    public static int[] field1089 = new int[field1096];

    @OriginalMember(owner = "client!f", name = "r", descriptor = "[I")
    public static int[] field1081 = new int[field1096];

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Z")
    public static boolean field1080;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V")
    public static void method307(byte arg0) {
        field1090 = null;
        field1091 = null;
        field1087 = null;
        field1089 = null;
        field1082 = null;
        field1094 = null;
        field1079 = null;
        field1081 = null;
        field1093 = null;
        field1088 = null;
        field1084 = null;
        field1092 = null;
        if (arg0 != -28) {
            field1084 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([BB)Lei;")
    public static final class50 method308(byte[] arg0, byte arg1) {
        field1083++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 >= -112) {
            field1088 = null;
        }
        class50 var2 = new class50(arg0, class153.field3039, class61.field1275, class119.field2419, class39.field876, class123.field2503, class14.field401);
        class146.method955(true);
        return var2;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(II)V")
    public class51(int arg0, int arg1) {
        this.field1086 = arg0;
        this.field1095 = arg1;
    }
}
