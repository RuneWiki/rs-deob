import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class175 {

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field2408 = 0;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Lkr;")
    public static class602 field2403 = new class602(76, -2);

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "Z")
    public static boolean field2409 = false;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "F")
    public static float field2405;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lob;Lob;I)V")
    public static final void method1108(class4 arg0, class4 arg1, int arg2) {
        if (arg1.field35 != null) {
            arg1.method21(98);
        }
        field2407++;
        arg1.field33 = arg0.field33;
        arg1.field35 = arg0;
        arg1.field35.field33 = arg1;
        arg1.field33.field35 = arg1;
        if (arg2 < 59) {
            method1108(null, null, -19);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
    public static final void method1109(byte arg0) {
        if (arg0 != -50) {
            method1110(-128);
        }
        field2406++;
        if (class151.field2084 == null) {
            class605 var1 = new class605();
            byte[] var2 = var1.method3447(16, 128, 128, (byte) -106);
            class151.field2084 = class733.method4084(false, 824028812, var2);
        }
        if (class531.field7362 == null) {
            class432 var3 = new class432();
            byte[] var4 = var3.method2669(128, 16, 128, arg0 ^ 0x5C);
            class531.field7362 = class733.method4084(false, 824028812, var4);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static void method1110(int arg0) {
        if (arg0 == 76) {
            field2403 = null;
        }
    }
}
