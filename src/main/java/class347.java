import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class347 extends class6 {

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "Lpd;")
    public class169 field4967;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "Lwl;")
    public class281 field4965;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "Z")
    public static boolean field4963 = true;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "[I")
    public static int[] field4973;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "[I")
    public static int[] field4975;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public int field4961;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public int field4962;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public int field4966;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public int field4969;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public int field4971;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)V")
    public static void method2050(int arg0) {
        field4973 = null;
        field4975 = null;
        if (arg0 <= 59) {
            field4972 = 24;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public final void method2051(byte arg0) {
        this.field4966 = this.field4967.field2520;
        field4968++;
        this.field4962 = this.field4967.field2526;
        this.field4971 = this.field4967.field2529;
        if (this.field4967.field2518 != null) {
            this.field4967.field2518.method185(this.field4965.field3849, this.field4965.field3848, this.field4965.field3842, class202.field2842);
        }
        if (arg0 >= -104) {
            this.field4971 = 117;
        }
        this.field4961 = class202.field2842[2];
        this.field4969 = class202.field2842[0];
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ldw;B)V")
    public static final void method2052(class502 arg0, byte arg1) {
        field4974++;
        int var2 = 76 % ((arg1 + 16) / 60);
        for (class365 var3 = (class365) class281.field3860.method2818((byte) 120); var3 != null; var3 = (class365) class281.field3860.method2820((byte) -58)) {
            if (var3.field5337 == arg0) {
                if (var3.field5356 != null) {
                    class361.field5267.method582(var3.field5356);
                    var3.field5356 = null;
                }
                var3.method1565(0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lpd;Lbq;)V")
    public class347(class169 arg0, class190 arg1) {
        this.field4967 = arg0;
        this.field4965 = this.field4967.method1109(-127);
        this.method2051((byte) -121);
    }

    static {
        new class466("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field4972 = -1;
        field4973 = new int[32];
        field4975 = new int[5];
    }
}
