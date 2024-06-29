import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class41 {

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lkh;")
    public static class117 field932 = class224.method1450((byte) 116, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field929 = 0;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Ldb;")
    public static class36 field931 = new class36();

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)Z")
    public static final boolean method355(int arg0, byte arg1) {
        int var2 = 62 / ((66 - arg1) / 44);
        field926++;
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[S[Lkh;)V")
    public static final void method356(int arg0, short[] arg1, class117[] arg2) {
        int var3 = 76 / ((41 - arg0) / 41);
        field928++;
        class27.method233(arg2, 125, 0, arg2.length - 1, arg1);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static void method357(byte arg0) {
        field931 = null;
        field932 = null;
        if (arg0 != -84) {
            field929 = 126;
        }
    }
}
