import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class168 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field2829 = 0;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Lsc;")
    public static class181 field2830 = class149.method967(255, "Cabbage");

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lsc;")
    public static class181 field2832 = class149.method967(255, "Untersuchen");

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method1114(byte arg0) {
        if (arg0 != 61) {
            method1114((byte) 19);
        }
        field2832 = null;
        field2830 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lsc;I)Ld;")
    public static final class120 method1115(class181 arg0, int arg1) {
        field2831++;
        if (arg1 > -78) {
            return null;
        }
        for (class120 var2 = (class120) class60.field917.method1686((byte) -83); var2 != null; var2 = (class120) class60.field917.method1683(140)) {
            if (var2.field1969.method1202(arg0, -4557)) {
                return var2;
            }
        }
        return null;
    }
}
