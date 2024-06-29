import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class189 {

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "Lmia;")
    public static class63 field2862 = new class63(39, -1);

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2866 = new String[100];

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "Lio;")
    public static class439 field2867 = new class439(8, 1);

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "Lqe;")
    public static class469 field2868 = new class469(101, 3);

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field2869 = 0;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public static int field2870 = 0;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public static int field2871 = 0;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)I")
    public static final int method1315(int arg0, int arg1) {
        if (arg1 != 3) {
            method1317((byte) 29);
        }
        field2864++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
    public static void method1316(boolean arg0) {
        field2866 = null;
        if (!arg0) {
            field2862 = null;
        }
        field2868 = null;
        field2867 = null;
        field2862 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public static final void method1317(byte arg0) {
        class337.field4914 = null;
        class273.field3883 = null;
        int var1 = -123 % ((arg0 + 10) / 60);
        class222.field3265 = null;
        class182.field2800 = null;
        field2865++;
        class597.field8461 = null;
        class259.field3701 = null;
        class304.field4312 = null;
        class750.field10491 = null;
        class421.field6279 = null;
    }
}
