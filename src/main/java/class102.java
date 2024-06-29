import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class class102 extends class259 {

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "I")
    public static int field1381 = 0;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1379 = "Connection lost.";

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "Lvh;")
    public static class62 field1378 = new class62(64);

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "Lnk;")
    public static class16 field1380;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)V", line = 6)
    public static void method644(int arg0) {
        field1380 = null;
        field1378 = null;
        field1379 = null;
        if (arg0 != 29069) {
            field1381 = 95;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 19)
    public static final String method645(int arg0, byte arg1) {
        if (arg1 <= 110) {
            method647((byte) 74);
        }
        field1376++;
        return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(B)Lf;", line = 35)
    public static final class274 method647(byte arg0) {
        field1382++;
        try {
            return new class118();
        } catch (Throwable var5) {
            try {
                return (class274) Class.forName("wa").getDeclaredConstructor().newInstance();
            } catch (Throwable var4) {
                int var3 = -119 / ((arg0 - 61) / 59);
                return new class40();
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILnk;)Z", line = 58)
    public static final boolean method648(int arg0, int arg1, int arg2, class16 arg3) {
        field1377++;
        byte[] var4 = arg3.method100(arg0, arg2, (byte) -107);
        if (var4 == null) {
            return false;
        }
        if (arg1 != -1000000000) {
            method648(-99, 117, -52, (class16) null);
        }
        class246.method1750(arg1 + 1000000012, var4);
        return true;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(B)Z")
    public abstract boolean method646(byte arg0);

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method649(byte arg0);
}
