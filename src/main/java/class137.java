import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class137 extends class481 {

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "I")
    public static int field1958 = 0;

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "Lfg;")
    public static class83 field1955 = new class83("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "I")
    public static int field1959 = 0;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "I")
    public static int field1960 = 0;

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
    public static final void method888(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        class197.field2838++;
        class356.method1978((byte) 29, class296.field4090);
        field1957++;
        class244.field3395.method2096(-186970568, arg0);
        class244.field3395.method2070(81954016, arg1);
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V")
    public static void method889(int arg0) {
        field1955 = null;
        int var1 = -125 % ((arg0 + 41) / 62);
    }
}
