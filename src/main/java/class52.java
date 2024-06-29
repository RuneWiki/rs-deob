import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Loa;")
    private static class98 field1137 = class38.method349(255, "You have only just left another world)3");

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Loa;")
    private static class98 field1143 = class38.method349(255, "Invalid username or password)3");

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Loa;")
    public static class98 field1136 = field1143;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1148 = 0;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1144 = 0;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Loa;")
    public static class98 field1154 = field1137;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Ln;")
    public static class90 field1151 = new class90(100);

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field1161 = 0;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "J")
    public static long field1160 = 0L;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "[I")
    public static int[] field1163 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "[I")
    public static int[] field1158 = new int[128];

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "[[I")
    public static int[][] field1164 = new int[104][104];

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "Loa;")
    public static class98 field1165 = class38.method349(255, "@cr2@");

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field1159 = 0;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public int field1147;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public int field1156;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "Ltb;")
    public static class130 field1155;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "Lmd;")
    public static class87 field1157;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[B")
    public byte[] field1138;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[B")
    public byte[] field1146;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "[I")
    public static int[] field1162;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "[Loc;")
    public static class100[] field1139;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "[[I")
    public static int[][] field1145;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method431(int arg0) {
        field1139 = null;
        field1163 = null;
        field1157 = null;
        field1143 = null;
        field1162 = null;
        field1145 = null;
        field1164 = null;
        field1151 = null;
        field1158 = null;
        field1155 = null;
        field1136 = null;
        field1165 = null;
        field1154 = null;
        field1137 = null;
        if (arg0 >= -39) {
            field1139 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static final void method432(byte arg0) {
        class56.field1252.method660(121);
        class71.field1483 = 1;
        field1153++;
        class55.field1213 = null;
        if (arg0 != -23) {
            method431(97);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ltd;Ltd;III)Ltd;")
    public static final class132 method433(class132 arg0, class132 arg1, int arg2, int arg3, int arg4) {
        field1150++;
        class132 var5 = class67.method548(0, arg1.field3165, arg0, arg3, 0, arg4, class36.field901[arg1.field3135 >> 16], arg1.field3135, 0, arg2, 0, arg1.field3215);
        if (var5 == null) {
            if (arg1.field3113 != null) {
                var5 = class67.method548(0, arg1.field3165, arg0, arg3, 0, 0, arg1.field3113, arg1.field3135, 0, arg2, 0, arg1.field3215);
            }
            return var5;
        } else {
            return var5;
        }
    }
}
