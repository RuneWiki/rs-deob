import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class287 {

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public static int field3674 = 0;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method1743(int arg0, boolean arg1, byte[] arg2) {
        if (arg0 != 99999999) {
            method1744(-43, null);
        }
        field3673++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class560.field7110) {
            try {
                class521 var3 = (class521) Class.forName("rb").getDeclaredConstructor().newInstance();
                var3.method2437(-21654, arg2);
                return var3;
            } catch (Throwable var4) {
                class560.field7110 = true;
            }
        }
        return arg1 ? class499.method2770(127, arg2) : arg2;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILfi;)[I")
    public static final int[] method1744(int arg0, class13 arg1) {
        field3672++;
        class234 var2 = new class234(518);
        int[] var3 = new int[4];
        if (arg0 >= -24) {
            field3674 = -59;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method1491(-129, 10);
        var2.method1496(var3[0], (byte) -11);
        var2.method1496(var3[1], (byte) 10);
        var2.method1496(var3[2], (byte) 65);
        var2.method1496(var3[3], (byte) -126);
        for (int var5 = 0; var5 < 10; var5++) {
            var2.method1496((int) (Math.random() * 9.9999999E7D), (byte) -128);
        }
        var2.method1541(374, (int) (Math.random() * 9.9999999E7D));
        var2.method1546(class176.field2315, (byte) -116, class366.field4473);
        arg1.field130.method1530(0, var2.field3133, var2.field3193, 95);
        return var3;
    }
}
