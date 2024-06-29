import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class68 {

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public int field1024 = -1;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Z")
    public static boolean field1016 = false;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "Leg;")
    public static class188 field1023 = new class188(4);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public int field1007;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public int field1008;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public int field1013;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public int field1018;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public int field1022;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "Lwf;")
    public static class306 field1020;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "[I")
    public static int[] field1011;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "[Lng;")
    public static class245[] field1014;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 19)
    public static void method486(int arg0) {
        field1014 = null;
        if (arg0 != 31785) {
            method488(-91);
        }
        field1023 = null;
        field1011 = null;
        field1020 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZILjh;)V", line = 34)
    public static final void method487(int arg0, boolean arg1, int arg2, class207 arg3) {
        field1012++;
        if (class50.field706 != null || class260.field4036 || arg3 == null || class61.method410(true, arg3) == null) {
            return;
        }
        class50.field706 = arg3;
        class117.field1809 = class61.method410(arg1, arg3);
        class207.field3290 = 0;
        class282.field4332 = arg2;
        class106.field1624 = arg0;
        class257.field4000 = false;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V", line = 56)
    public static final void method488(int arg0) {
        if (arg0 != -21441) {
            field1016 = true;
        }
        class221.field3513.method1296(255);
        field1009++;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)I", line = 81)
    public static final int method489(int arg0) {
        int var1 = 96 / ((arg0 + 56) / 50);
        field1017++;
        return class86.field1301 && class294.field4534[81] && class168.field2565 > 2 ? class89.field1355[class168.field2565 - 2] : class89.field1355[class168.field2565 - 1];
    }
}
