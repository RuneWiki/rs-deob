import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class233 {

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field3543 = 0;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3544 = "Loaded world list data";

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lpd;")
    public static class3 field3545 = new class3(512);

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field3548 = -1;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Lpk;")
    public static class120 field3546;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[BI)I", line = 7)
    public static final int method1680(int arg0, byte[] arg1, int arg2) {
        int var3 = -37 % ((-arg0 - 40) / 37);
        field3542++;
        return class288.method2031(arg1, 0, arg2, 54);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 21)
    public static void method1681(int arg0) {
        field3545 = null;
        field3544 = null;
        field3546 = null;
        if (arg0 >= -57) {
            method1681(25);
        }
    }
}
