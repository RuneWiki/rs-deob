import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class89 {

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Z")
    public static boolean field1306 = false;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    private static int field1305 = 0;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "[Lka;")
    public static class279[] field1303;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILmh;)[Lka;", line = 32)
    public static final class279[] method635(int arg0, int arg1, class65 arg2) {
        field1304++;
        if (class226.method1628(arg1, (byte) -113, arg2)) {
            return arg0 == 30000 ? class278.method1967(54) : (class279[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[B", line = 46)
    public static final synchronized byte[] method636(int arg0, int arg1) {
        field1302++;
        if (arg1 == 100 && class123.field1826 > 0) {
            byte[] var2 = class142.field2179[--class123.field1826];
            class142.field2179[class123.field1826] = null;
            return var2;
        } else if (~arg1 == arg0 && field1305 > 0) {
            byte[] var3 = class48.field754[--field1305];
            class48.field754[field1305] = null;
            return var3;
        } else if (arg1 == 30000 && class50.field765 > 0) {
            byte[] var4 = class32.field486[--class50.field765];
            class32.field486[class50.field765] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)Z", line = 81)
    public static final boolean method637(int arg0, int arg1) {
        field1308++;
        if (arg0 < arg1) {
            return false;
        }
        int var2 = class296.field4780[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1004;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 102)
    public static final void method638(int arg0) {
        if (arg0 <= 11) {
            method638(-86);
        }
        class107.field1512.method135(18436);
        class112.field1597.method135(18436);
        field1311++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 119)
    public static void method639(byte arg0) {
        if (arg0 < 75) {
            field1309 = -39;
        }
        field1303 = null;
    }
}
