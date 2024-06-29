import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public abstract class class190 {

    @OriginalMember(owner = "client!av", name = "c", descriptor = "Lnk;")
    public static class326 field2961 = new class326(56, 2);

    @OriginalMember(owner = "client!av", name = "d", descriptor = "Lvv;")
    public static class313 field2962 = new class313(29, -2);

    @OriginalMember(owner = "client!av", name = "f", descriptor = "Z")
    public static boolean field2964 = false;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(B)V", line = 6)
    public static void method1282(byte arg0) {
        if (arg0 != -118) {
            field2964 = false;
        }
        field2962 = null;
        field2961 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V", line = 21)
    public static final void method1285(int arg0) {
        field2960++;
        if (arg0 <= 125) {
            field2964 = true;
        }
        class38.field566 = null;
        class339.field5323 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(III)Z", line = 35)
    public static final boolean method1286(int arg0, int arg1, int arg2) {
        field2959++;
        if (arg1 != 31730) {
            method1282((byte) -67);
        }
        return class270.method1802(arg0, (byte) 73, arg2) || class206.method1354(-2, arg2, arg0);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1281(byte arg0);

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IBI)[B")
    public abstract byte[] method1283(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!av", name = "a", descriptor = "([BB)V")
    public abstract void method1284(byte[] arg0, byte arg1);
}
