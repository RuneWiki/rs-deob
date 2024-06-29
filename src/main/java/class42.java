import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class42 {

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lwb;")
    private static class130 field1171 = class26.method212("Connection lost", -32376);

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field1176 = 0;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lwb;")
    private static class130 field1177 = class26.method212("You have only just left another world)3", -32376);

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Lwb;")
    public static class130 field1174 = field1171;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field1181 = 3;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Lwb;")
    private static class130 field1180 = class26.method212("Prepared sound engine", -32376);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lwb;")
    public static class130 field1170 = field1177;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field1183 = 0;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field1182 = 0;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lwb;")
    public static class130 field1173 = field1180;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Lje;")
    public static class59 field1179;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "[I")
    public static int[] field1175;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "[I")
    public static int[] field1184;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 8)
    public static void method407(int arg0) {
        field1170 = null;
        field1175 = null;
        field1177 = null;
        field1180 = null;
        field1179 = null;
        field1171 = null;
        field1173 = null;
        field1184 = null;
        field1174 = null;
        if (arg0 != 0) {
            method407(-59);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lk;Lwb;Lwb;B)Lec;", line = 37)
    public static final class28 method408(class60 arg0, class130 arg1, class130 arg2, byte arg3) {
        field1178++;
        if (arg3 == -108) {
            int var4 = arg0.method507(arg2, arg3 + 107);
            int var5 = arg0.method502(arg1, false, var4);
            return class89.method664(var4, arg3 ^ 0xFFFFFFBC, arg0, var5);
        } else {
            return null;
        }
    }
}
