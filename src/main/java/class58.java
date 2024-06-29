import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class58 extends class81 {

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Lrd;")
    public static class173 field1147 = class133.method843("blinken3:", -119);

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Lrd;")
    public static class173 field1148 = class133.method843("(U5", -97);

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "Lrd;")
    private static class173 field1151 = class133.method843("wishes to trade with you)3", -84);

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "Lrd;")
    public static class173 field1156 = class133.method843("Suche nach Updates )2 ", -99);

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "Lrd;")
    private static class173 field1154 = class133.method843("You have only just left another world)3", 60);

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "Lrd;")
    public static class173 field1155 = class133.method843("Verbindung mit Update)2Server)3)3)3", 61);

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "Lrd;")
    public static class173 field1150 = field1151;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "Lrd;")
    public static class173 field1149 = field1154;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "La;")
    public static class1 field1152;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)I")
    public static final int method374(int arg0, int arg1, int arg2) {
        field1146++;
        long var3 = (long) ((arg1 << 16) + arg0);
        if (class149.field2846 != null && class149.field2846.field2437 == var3) {
            if (arg2 != -14074) {
                field1156 = null;
            }
            return class112.field2080.field2222 * 99 / (class112.field2080.field2218.length - class149.field2846.field4228) + 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
    public static void method375(int arg0) {
        if (arg0 != 0) {
            method375(110);
        }
        field1151 = null;
        field1150 = null;
        field1147 = null;
        field1155 = null;
        field1148 = null;
        field1152 = null;
        field1156 = null;
        field1154 = null;
        field1149 = null;
    }
}
