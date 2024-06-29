import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class246 extends class183 {

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lsc;")
    public static class181 field4293 = class149.method967(255, "null");

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lsc;")
    public static class181 field4291 = class149.method967(255, "(U0a )2 via: ");

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)V")
    public static final void method1679(byte arg0, int arg1) {
        class174.field2918.method1796(arg0 ^ 0xFFFFFFF3, arg1);
        class20.field362.method1796(20, arg1);
        if (arg0 == -25) {
            class96.field1540.method1796(20, arg1);
            field4296++;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public static void method1680(byte arg0) {
        if (arg0 == -31) {
            field4291 = null;
            field4293 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILo;I)Lsc;")
    public static final class181 method1681(int arg0, class175 arg1, int arg2) {
        field4297++;
        int var3 = -78 / ((arg0 + 32) / 49);
        if (!class57.method414(arg2, client.method1058(arg1), -97) && arg1.field2957 == null) {
            return null;
        } else if (arg1.field3016 == null || arg2 >= arg1.field3016.length || arg1.field3016[arg2] == null || arg1.field3016[arg2].method1232(119).method1226(-458531486) == 0) {
            return class166.field2826 ? class175.method1164(new class181[] { class165.field2802, class169.method1119((byte) -103, arg2) }, (byte) 127) : null;
        } else {
            return arg1.field3016[arg2];
        }
    }
}
