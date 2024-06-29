import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class316 extends InputStream {

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "[B")
    public static byte[] field4347 = new byte[2048];

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Lus;")
    public static class1 field4345 = new class1();

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Lada;")
    public static class144 field4349 = new class144(3, 6);

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Llu;")
    public static class610 field4350 = new class610(61, 3);

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "Llu;")
    public static class610 field4351;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field4348;

    static {
        new class572("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field4351 = new class610(3, 18);
    }

    @OriginalMember(owner = "client!bk", name = "read", descriptor = "()I", line = 3)
    public final int read() {
        field4346++;
        class236.method1513(true, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 14)
    public static final void method1913(byte arg0) {
        field4348++;
        if (class467.field6580 == 0) {
            return;
        }
        try {
            if (++class536.field7972 > 2000) {
                if (class296.field4075 != null) {
                    class296.field4075.method1830(-127);
                    class296.field4075 = null;
                }
                if (class111.field1587 >= 1) {
                    class467.field6580 = 0;
                    class593.field8768 = -5;
                    return;
                }
                class467.field6580 = 1;
                class471.field6659.field5712 = !class471.field6659.field5712;
                class536.field7972 = 0;
                class111.field1587++;
            }
            if (class467.field6580 == 1) {
                class641.field9339 = class442.field5896.method2023(class471.field6659.field5719, class471.field6659.method2483(arg0 - 69), arg0 ^ 0xFFFFFFCF);
                class467.field6580 = 2;
            }
            if (class467.field6580 == 2) {
                if (class641.field9339.field202 == 2) {
                    throw new IOException();
                }
                if (class641.field9339.field202 != 1) {
                    return;
                }
                class296.field4075 = class15.method106(5000, (Socket) class641.field9339.field201, (byte) -97);
                class641.field9339 = null;
                class296.field4075.method1829(class112.field1589.field2177, 82, 0, class112.field1589.field2146);
                class467.field6580 = 4;
            }
            if (class467.field6580 == 4) {
                if (!class296.field4075.method1831(false, 1)) {
                    return;
                }
                class296.field4075.method1833(1, (byte) 3, class632.field9278.field2146, 0);
                int var1 = class632.field9278.field2146[0] & 0xFF;
                if (var1 != 21) {
                    class593.field8768 = var1;
                    class467.field6580 = 0;
                    class296.field4075.method1830(arg0 + 87);
                    class296.field4075 = null;
                    return;
                }
                class467.field6580 = 5;
            }
            if (arg0 != -49) {
                field4345 = null;
            }
            if (class467.field6580 == 5) {
                if (!class296.field4075.method1831(false, 1)) {
                    return;
                }
                class296.field4075.method1833(1, (byte) 3, class632.field9278.field2146, 0);
                class480.field6820 = new String[class632.field9278.field2146[0] & 0xFF];
                class467.field6580 = 6;
            }
            if (class467.field6580 == 6 && class296.field4075.method1831(false, class480.field6820.length * 8)) {
                class632.field9278.field2177 = 0;
                class296.field4075.method1833(class480.field6820.length * 8, (byte) 3, class632.field9278.field2146, 0);
                for (int var2 = 0; var2 < class480.field6820.length; var2++) {
                    class480.field6820[var2] = class217.method1415(class632.field9278.method1004((byte) 75), -109);
                }
                class593.field8768 = 21;
                class467.field6580 = 0;
                class296.field4075.method1830(-127);
                class296.field4075 = null;
            }
        } catch (IOException var3) {
            if (class296.field4075 != null) {
                class296.field4075.method1830(24);
                class296.field4075 = null;
            }
            if (class111.field1587 >= 1) {
                class467.field6580 = 0;
                class593.field8768 = -4;
            } else {
                class471.field6659.field5712 = !class471.field6659.field5712;
                class111.field1587++;
                class467.field6580 = 1;
                class536.field7972 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 163)
    public static void method1914(int arg0) {
        field4351 = null;
        field4345 = null;
        field4349 = null;
        field4347 = null;
        field4350 = null;
        if (arg0 != -5) {
            method1913((byte) 61);
        }
    }
}
