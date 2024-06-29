import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class244 {

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "Lap;")
    public static class450 field3570;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1570(int arg0, boolean arg1) {
        if (arg1) {
            method1572(-75);
        }
        field3571++;
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lek;B)V")
    public static final void method1571(class465 arg0, byte arg1) {
        field3569++;
        int var2 = 0;
        if (arg1 != 38) {
            return;
        }
        while (class254.field3670 > var2) {
            int var3 = arg0.method2720(arg1 ^ 0xFFFFFFA5);
            int var4 = arg0.method2755((byte) -78);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class259.field3713[var3] != null) {
                class259.field3713[var3].field7512 = var4;
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
    public static void method1572(int arg0) {
        field3570 = null;
        if (arg0 != 0) {
            method1573(55, -46, null, null, -121, (byte) 34, null, null, null);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public static final void method1573(int arg0, int arg1, String arg2, String arg3, int arg4, byte arg5, String arg6, String arg7, String arg8) {
        if (arg5 != -87) {
            return;
        }
        field3572++;
        class284 var9 = class131.field2134[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class131.field2134[var10] = class131.field2134[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class284(arg1, arg0, arg3, arg7, arg8, arg2, arg4, arg6);
        } else {
            var9.method1755(arg6, arg5 - 22214, arg4, arg8, arg2, arg1, arg0, arg3, arg7);
        }
        class99.field1482++;
        class443.field6412 = class330.field4562;
        class131.field2134[0] = var9;
    }
}
