import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class class267 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field4753 = 0;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[B")
    public static byte[] field4758 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "[I")
    public static int[] field4759 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lid;")
    public static class149 field4762 = class60.method382(" <col=00ff80>", (byte) 42);

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "[Lea;")
    public static class37[] field4760 = new class37[6];

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Leg;")
    public static class225 field4754;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[I")
    public static int[] field4761;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZIBII)V")
    public static final void method1852(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4757++;
        if (arg2 != 91) {
            method1852(false, 85, (byte) -100, 94, 27);
        }
        if (class104.method735(arg4, false)) {
            class137.method956(arg3, arg1, -1, (byte) 100, class14.field206[arg4], arg0);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static void method1853(byte arg0) {
        field4760 = null;
        field4758 = null;
        field4762 = null;
        field4754 = null;
        field4761 = null;
        field4759 = null;
        if (arg0 != 106) {
            method1852(true, -11, (byte) -58, -2, -67);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)Ltb;")
    public static final class69 method1854(int arg0, int arg1, int arg2) {
        field4756++;
        class69 var3 = new class69();
        if (arg2 != -29055) {
            field4759 = null;
        }
        for (class24 var4 = (class24) class167.field3095.method1140(0); var4 != null; var4 = (class24) class167.field3095.method1127(0)) {
            if (var4.field369 && var4.method137(arg0, arg1, false)) {
                var3.method433(var4, -225);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B[B)V")
    public abstract void method1487(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)[B")
    public abstract byte[] method1486(byte arg0);
}
