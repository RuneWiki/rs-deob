import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class33 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[Z")
    public static boolean[] field516 = new boolean[100];

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
    public static int[] field517 = new int[32];

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Ljava/lang/String;")
    public static String field515 = "";

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "F")
    public static float field518;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lq;")
    public static class396 field519;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIIB)V")
    public static final void method230(boolean arg0, int arg1, int arg2, byte arg3) {
        field520++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class278.field3535 = arg2;
        if (arg3 != 106) {
            field516 = null;
        }
        class487.field6095 = arg0;
        class364.field4667 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB)V")
    public static final void method231(int arg0, int arg1, byte arg2) {
        field514++;
        class243 var3 = class546.method2926(arg1, 6, true);
        var3.method1457(111);
        var3.field3132 = arg0;
        if (arg2 != -8) {
            method231(89, -19, (byte) 98);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method232(int arg0) {
        field516 = null;
        field517 = null;
        field519 = null;
        if (arg0 != -14575) {
            field517 = null;
        }
        field515 = null;
    }
}
