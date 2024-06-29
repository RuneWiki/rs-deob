import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class304 extends class380 {

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
    public int field4043 = (int) (class45.method252((byte) -8) / 1000L);

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "Ljava/lang/String;")
    public String field4041;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "S")
    public short field4047;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "Ljk;")
    public static class450 field4048;

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
    public static int field4045;

    static {
        new class305("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field4040 = 0;
        field4048 = null;
        field4046 = 500;
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)V", line = 3)
    public static void method1818(int arg0) {
        if (arg0 == 1000) {
            field4048 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLjava/lang/String;)I", line = 13)
    public static final int method1819(byte arg0, String arg1) {
        field4044++;
        if (arg0 >= -59) {
            field4048 = null;
        }
        return class118.method709(true, 10, (byte) 46, arg1);
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)V", line = 31)
    public static final void method1820(int arg0) {
        field4045++;
        class509 var1 = class528.field7748;
        synchronized (class528.field7748) {
            class528.field7748.method3034((byte) 71);
            if (arg0 > -99) {
                field4042 = -76;
            }
        }
        class509 var2 = class415.field5946;
        synchronized (class415.field5946) {
            class415.field5946.method3034((byte) 93);
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 60)
    public class304(String arg0, int arg1) {
        this.field4041 = arg0;
        this.field4047 = (short) arg1;
    }
}
