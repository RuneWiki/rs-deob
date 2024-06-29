import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class163 {

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "[I")
    public static int[] field2046 = new int[1];

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "[I")
    public static int[] field2045 = new int[8];

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "Lnd;")
    public static class545 field2049 = new class545();

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "J")
    public static long field2051;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)V")
    public static final void method961(boolean arg0, String arg1, int arg2, String arg3) {
        class551.field7807 = arg1;
        class463.field6399 = arg3;
        class265.field3505 = arg0;
        field2048++;
        if (!class265.field3505 && class551.field7807.equals("") || class463.field6399.equals("")) {
            class158.method948(3, (byte) -55);
            return;
        }
        class430.field6054 = false;
        if (class8.field55 != 1) {
            class671.field9319 = 0;
            class36.field371 = -1;
        }
        int var4 = -97 / ((arg2 + 10) / 40);
        class158.method948(-3, (byte) -55);
        class121.field1579 = 0;
        class361.field4776 = 0;
        class421.field5893 = 1;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
    public static final void method962(int arg0, int arg1) {
        field2050++;
        class491.field6702 = 1000000000L / (long) arg0;
        if (arg1 < 40) {
            method962(-114, -57);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public static void method963(int arg0) {
        if (arg0 != 30935) {
            method961(true, null, 125, null);
        }
        field2045 = null;
        field2049 = null;
        field2046 = null;
    }
}
