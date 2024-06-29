import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class186 {

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field2700 = 1337;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "[S")
    public static short[] field2703;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public int field2697;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public int field2699;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public int field2705;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "Z")
    public boolean field2701;

    static {
        new class466(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
        new class466("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field2703 = new short[] { 960, 957, -21568, -21571, 22464 };
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 3)
    public static void method1171(int arg0) {
        field2703 = null;
        if (arg0 != -5067) {
            field2703 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)Z", line = 18)
    public static final boolean method1172(int arg0, int arg1, int arg2) {
        field2696++;
        if ((class483.method2834(arg1 - 65656, arg2, arg0) | (arg0 & arg1) != 0) || class500.method2936(arg2, -1, arg0)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && class266.method1598(-95, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZLdr;ZILjava/lang/String;)V", line = 31)
    public static final void method1173(boolean arg0, class504 arg1, boolean arg2, int arg3, String arg4) {
        field2698++;
        if (arg3 != 3) {
            return;
        }
        if (!arg0) {
            class329.method1905(arg4, (byte) 112, 3, arg1);
            return;
        }
        if (class504.field7420.startsWith("win") && class504.field7417 != 3) {
            String var5 = null;
            if (arg1.field7425 != null) {
                var5 = arg1.field7425.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class56 var6 = class329.method1905(arg4, (byte) 87, 0, arg1);
                class231.field3256 = arg4;
                class266.field3671 = var6;
                class432.field6340 = arg1;
                return;
            }
        }
        if (class504.field7420.startsWith("mac")) {
            String var7 = null;
            if (arg1.field7425 != null) {
                var7 = arg1.field7425.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg2) {
                class329.method1905(arg4, (byte) 101, 1, arg1);
                return;
            }
        }
        class329.method1905(arg4, (byte) 113, 2, arg1);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 102)
    public static final void method1174(byte arg0) {
        class166.field2481 = null;
        if (arg0 >= -109) {
            field2704 = -89;
        }
        field2702++;
        class247.method1484(class117.field1754, 1, -1, 0, 0, 0, class188.field2723, class27.field359, 0);
        if (class166.field2481 != null) {
            class437.method2574(115, class166.field2481, 0, class121.field1798, class483.field7046, -1412584499, 0, class117.field1754, class257.field3566.field2317, class27.field359);
            class166.field2481 = null;
        }
    }
}
