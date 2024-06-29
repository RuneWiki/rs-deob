import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class449 {

    @OriginalMember(owner = "client!am", name = "a", descriptor = "Z")
    public static boolean field6536 = false;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field6537 = 0;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Law;")
    public static class55 field6540 = new class55(128);

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)Z", line = 3)
    public static final boolean method2773(byte arg0, int arg1) {
        field6541++;
        if (arg0 == -118) {
            return arg1 == 2 || arg1 == 3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BLjk;)V", line = 33)
    public static final void method2774(byte arg0, class450 arg1) {
        field6539++;
        class450 var2 = class274.method1666(arg1, (byte) 64);
        if (arg0 <= 33) {
            field6536 = true;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class372.field5051;
            var3 = class430.field6244;
        } else {
            var3 = var2.field6573;
            var4 = var2.field6612;
        }
        class380.method2321(false, arg1, var3, 0, var4);
        class274.method1668(-50, arg1, var4, var3);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 64)
    public static void method2775(int arg0) {
        if (arg0 != -1) {
            method2773((byte) 5, -54);
        }
        field6540 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Lka;", line = 78)
    public static final class331 method2776(int arg0, int arg1) {
        field6538++;
        if (arg0 != -29410) {
            field6540 = null;
        }
        class331[] var2 = class153.method913(103);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class331 var4 = var2[var3];
            if (var4.field4389 == arg1) {
                return var4;
            }
        }
        return null;
    }
}
