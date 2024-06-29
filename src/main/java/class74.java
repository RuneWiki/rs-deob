import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class74 {

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field1173 = 1;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "Lbd;")
    private static class162 field1176 = class17.method142(0, "Loading sprites )2 ");

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "Lbd;")
    private static class162 field1180 = class17.method142(0, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field1175 = 0;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "Lbd;")
    public static class162 field1181 = field1176;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field1178 = 0;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "Lbd;")
    public static class162 field1179 = field1180;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "[Lpm;")
    public static class99[] field1172;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)I", line = 31)
    public static final int method530(int arg0, int arg1, int arg2) {
        field1177++;
        class101 var3 = (class101) class40.field651.method1672((long) arg1, 19760);
        if (arg0 != -13458) {
            method532((byte) 73);
        }
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && arg2 < var3.field1847.length) {
            return var3.field1847[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lec;", line = 140)
    public static final class158 method531(Throwable arg0, String arg1) {
        field1174++;
        class158 var2;
        if (arg0 instanceof class158) {
            var2 = (class158) arg0;
            var2.field2788 = var2.field2788 + ' ' + arg1;
        } else {
            var2 = new class158(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V", line = 161)
    public static void method532(byte arg0) {
        field1179 = null;
        field1176 = null;
        int var1 = 76 / ((arg0 - 39) / 36);
        field1180 = null;
        field1172 = null;
        field1181 = null;
    }
}
