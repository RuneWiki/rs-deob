import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class123 {

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Lrc;")
    private static class105 field3024 = class43.method374("New User", 0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lrc;")
    public static class105 field3020 = field3024;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lab;")
    public static class3 field3026 = new class3();

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field3029 = -1;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lrc;")
    public static class105 field3027 = class43.method374("@gr1@", 0);

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lrc;")
    public static class105 field3032 = class43.method374(":0", 0);

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Lrc;")
    private static class105 field3030 = class43.method374("Private chat", 0);

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Lrc;")
    public static class105 field3033 = field3030;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lfc;")
    public static class34 field3028;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Lfc;")
    public static class34 field3031;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lib;", line = 3)
    public static final class50 method1000(Throwable arg0, String arg1) {
        field3022++;
        class50 var2;
        if (arg0 instanceof class50) {
            var2 = (class50) arg0;
            var2.field1065 = var2.field1065 + ' ' + arg1;
        } else {
            var2 = new class50(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 39)
    public static void method1001(byte arg0) {
        field3028 = null;
        field3020 = null;
        field3024 = null;
        field3030 = null;
        field3026 = null;
        field3031 = null;
        field3033 = null;
        field3027 = null;
        field3032 = null;
        if (arg0 >= -80) {
            method1001((byte) -88);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILpb;I)Lbd;", line = 90)
    public static final class11 method1002(int arg0, int arg1, class92 arg2, int arg3) {
        if (arg1 < 83) {
            method1002(122, -14, null, 52);
        }
        field3023++;
        return class58.method466(arg0, arg3, (byte) 127, arg2) ? class57.method458((byte) 75) : null;
    }
}
