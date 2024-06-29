import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class254 extends class247 {

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Luf;")
    public static class168 field4346 = class148.method1019(-1720, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "[I")
    public static int[] field4343 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field4348 = 0;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field4349 = 128;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "J")
    public static long field4342;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "[I")
    public static int[] field4341;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ldk;II)Z", line = 6)
    public static final boolean method1748(class241 arg0, int arg1, int arg2) {
        field4345++;
        byte[] var3 = arg0.method1645(true, arg2);
        if (var3 == null) {
            return false;
        }
        if (arg1 != 1) {
            method1748((class241) null, -91, 53);
        }
        class217.method1505(-2, var3);
        return true;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V", line = 41)
    public static void method1749(byte arg0) {
        field4341 = null;
        if (arg0 == -115) {
            field4346 = null;
            field4343 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V", line = 53)
    public static final void method1750(byte arg0) {
        field4344++;
        if (class103.field1601 != null) {
            class103.field1601.method992((byte) -82);
        }
        if (class291.field4907 != null) {
            class291.field4907.method992((byte) -47);
        }
        int var1 = -63 / ((32 - arg0) / 34);
    }
}
