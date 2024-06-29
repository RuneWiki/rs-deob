import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class152 extends class88 {

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "Ljava/lang/String;")
    public static String field2355 = "Connection lost.";

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "[I")
    public static int[] field2360 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "F")
    public static float field2359 = 0.0F;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field2362 = 0;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field2363 = 0;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "Leh;")
    public static class137 field2358;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method898(byte arg0);

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(II)V")
    public static final void method1040(int arg0, int arg1) {
        class112.field1598 = arg1;
        class190.field3070 = 1;
        class4.field55 = -1;
        field2361++;
        class278.field4410 = -1;
        if (arg0 != 3389) {
            method1041((byte) -77);
        }
        class160.field2558 = null;
        class216.field3473 = false;
        class215.field3446 = 0;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)Z")
    public abstract boolean method899(byte arg0);

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(B)V")
    public static void method1041(byte arg0) {
        if (arg0 < -77) {
            field2358 = null;
            field2360 = null;
            field2355 = null;
        }
    }
}
