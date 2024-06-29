import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class238 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field3887 = 20;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static final void method1669(int arg0) {
        field3889++;
        if (class457.field7048 == 0) {
            return;
        }
        try {
            if (++class76.field1141 > 2000) {
                if (class338.field5281 != null) {
                    class338.field5281.method1892(90);
                    class338.field5281 = null;
                }
                if (class360.field5582 >= 1) {
                    class457.field7048 = 0;
                    class271.field4327 = -5;
                    return;
                }
                class76.field1141 = 0;
                class457.field7048 = 1;
                class407.field6152.field7726 = !class407.field6152.field7726;
                class360.field5582++;
            }
            if (class457.field7048 == 1) {
                class372.field5721 = class339.field5294.method32(class407.field6152.field7721, 0, class407.field6152.method3123(true));
                class457.field7048 = 2;
            }
            if (class457.field7048 == 2) {
                if (class372.field5721.field7458 == 2) {
                    throw new IOException();
                }
                if (class372.field5721.field7458 != 1) {
                    return;
                }
                class338.field5281 = class508.method3080(34037, 5000, (Socket) class372.field5721.field7462);
                class372.field5721 = null;
                class338.field5281.method1895(10, class170.field2488.field3162, class170.field2488.field3193, 0);
                class457.field7048 = 4;
            }
            if (arg0 < 100) {
                field3887 = -116;
            }
            if (class457.field7048 == 4) {
                if (!class338.field5281.method1893((byte) 24, 1)) {
                    return;
                }
                class338.field5281.method1896(0, class279.field4428.field3193, (byte) 83, 1);
                int var1 = class279.field4428.field3193[0] & 0xFF;
                if (var1 != 21) {
                    class457.field7048 = 0;
                    class271.field4327 = var1;
                    class338.field5281.method1892(90);
                    class338.field5281 = null;
                    return;
                }
                class457.field7048 = 5;
            }
            if (class457.field7048 == 5) {
                if (!class338.field5281.method1893((byte) 24, 1)) {
                    return;
                }
                class338.field5281.method1896(0, class279.field4428.field3193, (byte) 56, 1);
                class341.field5332 = new String[class279.field4428.field3193[0] & 0xFF];
                class457.field7048 = 6;
            }
            if (class457.field7048 == 6 && class338.field5281.method1893((byte) 24, class341.field5332.length * 8)) {
                class279.field4428.field3162 = 0;
                class338.field5281.method1896(0, class279.field4428.field3193, (byte) 120, class341.field5332.length * 8);
                for (int var2 = 0; var2 < class341.field5332.length; var2++) {
                    class341.field5332[var2] = class33.method211(0, class279.field4428.method1435(127));
                }
                class457.field7048 = 0;
                class271.field4327 = 21;
                class338.field5281.method1892(90);
                class338.field5281 = null;
            }
        } catch (IOException var3) {
            if (class338.field5281 != null) {
                class338.field5281.method1892(90);
                class338.field5281 = null;
            }
            if (class360.field5582 >= 1) {
                class457.field7048 = 0;
                class271.field4327 = -4;
            } else {
                class76.field1141 = 0;
                class407.field6152.field7726 = !class407.field6152.field7726;
                class360.field5582++;
                class457.field7048 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3888++;
        if (arg0 < 128 || arg3 < 128 || (class135.field1839 - 2) * 128 < arg0 || arg3 > ((class197.field3038 - 2) * 128)) {
            class229.field3812[0] = class229.field3812[1] = -1;
            return;
        }
        int var10 = class532.method3165(arg6, arg0, false, arg3) - arg4;
        class520.field7712.method163(arg2, 0, 0);
        if (arg8 != -7) {
            method1670(99, -117, -59, 33, -123, -40, -17, 119, 66, 17);
        }
        class19.field198.method1314(class520.field7712);
        class19.field198.method1305(arg0, var10, arg3, class229.field3812);
        class520.field7712.method163(-arg2, 0, 0);
        class19.field198.method1314(class520.field7712);
    }

    static {
        new class213("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
    }
}
