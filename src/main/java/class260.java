import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class260 {

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field4257 = 0;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4252 = "Ok";

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Lmj;")
    public static class115 field4254;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Lqi;")
    public static class131 field4250;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4256;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "[[[I")
    public static int[][][] field4255;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(JB)V")
    public static final void method1827(long arg0, byte arg1) {
        if (arg1 < 22) {
            method1828(116);
        }
        field4251++;
        if (arg0 != 0L) {
            class220.field3532.method557(45, 8);
            class220.field3532.method1069(arg0, -73);
            class180.field2903++;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method1828(int arg0) {
        field4256 = null;
        field4254 = null;
        field4252 = null;
        field4250 = null;
        field4255 = null;
        if (arg0 != -18337) {
            field4252 = null;
        }
    }
}
