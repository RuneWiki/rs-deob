import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class class170 {

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "[I")
    public static int[] field2452 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2455 = new String[100];

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2453 = "Loading title screen - ";

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Lhf;")
    public static class330 field2457;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "[[[B")
    public static byte[][][] field2456;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 12)
    public static void method1198(int arg0) {
        field2455 = null;
        field2456 = (byte[][][]) null;
        field2453 = null;
        field2457 = null;
        if (arg0 < -92) {
            field2452 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V", line = 32)
    public static final void method1199(int arg0, int arg1) {
        class263.field4030.method464(arg1 - 52, arg0);
        if (arg1 != 3450) {
            field2457 = (class330) null;
        }
        field2458++;
        class357.field5473.method464(3398, arg0);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1197(int arg0);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z[B)V")
    public abstract void method1200(boolean arg0, byte[] arg1);
}
