import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class79 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[B")
    public static byte[] field1183 = new byte[520];

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "[[I")
    public static int[][] field1187 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1191 = "Please remove ";

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Lkb;")
    public static class39 field1189;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "[I")
    public static int[] field1185;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 8)
    public static final void method581(int arg0) {
        field1184++;
        int var1 = class218.method1598(7829);
        if (var1 == 0) {
            class280.field4416 = (byte[][][]) null;
            class78.method577((byte) 105, 0);
        } else if (var1 == 1) {
            class162.method1125((byte) 0, (byte) 42);
            class78.method577((byte) 104, 512);
            if (class81.field1229 != null) {
                class136.method925(112);
            }
        } else {
            class162.method1125((byte) (class162.field2649 - 4 & 0xFF), (byte) 80);
            class78.method577((byte) 112, 2);
        }
        if (arg0 <= 103) {
            field1189 = (class39) null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I", line = 44)
    public static final int method582(int arg0, int arg1) {
        int var2 = -37 % ((arg0 - 58) / 45);
        field1186++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V", line = 54)
    public static final void method583(int arg0) {
        class338.field5249.method1623(1);
        if (arg0 == 11) {
            field1190++;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V", line = 74)
    public static void method584(int arg0) {
        field1183 = null;
        if (arg0 != 13) {
            field1191 = (String) null;
        }
        field1187 = (int[][]) null;
        field1189 = null;
        field1191 = null;
        field1185 = null;
    }
}
