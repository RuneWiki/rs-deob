import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class143 {

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "Lnea;")
    public static class664 field2111 = new class664(101, -1);

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "Lmf;")
    public static class382 field2112 = new class382(64);

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field2114 = 0;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field2113 = 0;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "Lf;")
    public static class702 field2110;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V", line = 6)
    public static void method1027(int arg0) {
        field2111 = null;
        if (arg0 < -1) {
            field2110 = null;
            field2112 = null;
        }
    }
}
