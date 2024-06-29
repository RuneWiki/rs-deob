import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 {

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lqf;")
    public static class117 field1150 = class72.method514(103, "sl_back");

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Lqf;")
    public static class117 field1153 = class72.method514(124, "Hidden)2");

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[I")
    public static int[] field1151 = new int[2048];

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1155 = -1;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1152 = 1;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lqf;")
    public static class117 field1148 = class72.method514(101, "<col=ff9040>");

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lqf;")
    public static class117 field1146 = class72.method514(119, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lla;")
    public static class77 field1154 = new class77(new byte[5000]);

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lqf;")
    private static class117 field1159 = class72.method514(113, "Ok");

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Lqf;")
    public static class117 field1158 = field1159;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIB)I")
    public static final int method411(int arg0, int arg1, byte arg2) {
        field1147++;
        if (arg2 < 110) {
            return -61;
        } else {
            int var3 = class77.method562((byte) -9, arg0 - 1, arg1 + -1) + class77.method562((byte) 91, arg0 - 1, arg1 + 1) + class77.method562((byte) -25, arg0 + 1, arg1 + -1) + class77.method562((byte) 118, arg0 + 1, arg1 + 1);
            int var4 = class77.method562((byte) 117, arg0, arg1 - 1) + class77.method562((byte) 125, arg0, arg1 + 1) + class77.method562((byte) 116, arg0 - 1, arg1) + class77.method562((byte) 91, arg0 + 1, arg1);
            int var5 = class77.method562((byte) -7, arg0, arg1);
            return var3 / 16 + var4 / 8 + var5 / 4;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method412(int arg0) {
        field1146 = null;
        if (arg0 >= -51) {
            method411(-51, -25, (byte) -76);
        }
        field1150 = null;
        field1154 = null;
        field1148 = null;
        field1159 = null;
        field1158 = null;
        field1153 = null;
        field1151 = null;
    }
}
