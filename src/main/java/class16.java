import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public abstract class class16 extends class42 {

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field285 = -1;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Z")
    public static boolean field282 = false;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Lvj;")
    public static class304 field286 = new class304("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!l", name = "s", descriptor = "[I")
    public static int[] field287 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static void method166(int arg0) {
        if (arg0 != 3) {
            field282 = false;
        }
        field286 = null;
        field287 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILbo;)V")
    public static final void method167(int arg0, class511 arg1) {
        if (class23.field399 == null) {
            class526 var2 = new class526();
            byte[] var3 = var2.method3093(128, 16, arg0 + 8111, 128);
            class23.field399 = class14.method148(false, arg0 + 2278, var3);
        }
        field283++;
        if (arg0 != -7856) {
            method167(-96, null);
        }
        if (class200.field2773 == null) {
            class427 var4 = new class427();
            byte[] var5 = var4.method2464(128, (byte) -117, 128, 16);
            class200.field2773 = class14.method148(false, arg0 ^ 0xB66, var5);
        }
        class65 var6 = arg1.field7399;
        if (var6.method447(111) && class370.field4988 == null) {
            byte[] var7 = class151.method1036(16.0F, 4.0F, 30938, new class463(419684), 8, 16, 4.0F, 0.6F, 128, 0.5F, 128);
            class370.field4988 = class14.method148(false, -5578, var7);
        }
    }
}
