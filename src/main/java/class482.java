import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class482 {

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "Ltb;")
    public static class657 field6532 = new class657();

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Lju;")
    public static class102 field6535 = new class102(53, 7);

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public static void method2837(int arg0) {
        if (arg0 == 63) {
            field6535 = null;
            field6532 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIZ)I")
    public final int method2838(int arg0, int arg1, boolean arg2) {
        field6533++;
        int var4 = class582.field8281 > arg1 ? class582.field8281 : arg1;
        if (!arg2) {
            field6535 = null;
        }
        if (class71.field998 == this) {
            return 0;
        } else if (class122.field1672 == this) {
            return var4 - arg0;
        } else if (class680.field9576 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6531++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII)V")
    public static final void method2839(int arg0, int arg1, int arg2, int arg3) {
        field6534++;
        if (arg0 != -4118) {
            method2839(67, -9, -52, 95);
        }
        String var4 = "tele " + arg1 + "," + (arg2 >> 6) + "," + (arg3 >> 6) + "," + (arg2 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class564.method3367(arg0 + 3992, false, var4, true);
    }
}
