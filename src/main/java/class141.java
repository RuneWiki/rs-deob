import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class141 {

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lve;")
    private static class255 field2341 = class87.method607(83, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Z")
    public static boolean field2340 = false;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Lve;")
    public static class255 field2339 = field2341;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Ltb;")
    public static class209 field2338 = new class209();

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Lrg;")
    public static class88 field2344;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 4)
    public static void method1049(byte arg0) {
        field2341 = null;
        int var1 = -77 / ((arg0) / 48);
        field2344 = null;
        field2339 = null;
        field2338 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;", line = 40)
    public static final Object method1052(int arg0, boolean arg1, byte[] arg2) {
        field2343++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class280.field4803) {
            try {
                class141 var3 = (class141) Class.forName("km").getDeclaredConstructor().newInstance();
                var3.method1051(arg2, 27438);
                return var3;
            } catch (Throwable var5) {
                class280.field4803 = true;
            }
        }
        if (arg0 > -38) {
            field2340 = false;
        }
        return arg1 ? class284.method2022(0, arg2) : arg2;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)Z", line = 72)
    public static final boolean method1053(int arg0, byte arg1) {
        field2342++;
        if (arg1 <= 82) {
            field2344 = (class88) null;
        }
        if (class93.field1604 != arg0) {
            return false;
        }
        class93.field1604++;
        class314.field5320 = true;
        if (class93.field1604 > 65535) {
            class93.field1604 = 0;
        }
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1050(int arg0);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([BI)V")
    public abstract void method1051(byte[] arg0, int arg1);
}
