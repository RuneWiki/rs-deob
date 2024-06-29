import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class386 {

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "[B")
    public static byte[] field5822;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Lpi;")
    public static class342 field5826;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    private int field5815;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public int field5817;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public int field5824;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Lwb;")
    public class215 field5814;

    static {
        new class342("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field5822 = new byte[2048];
        field5826 = new class342("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V", line = 3)
    public static final void method2386(int arg0, int arg1, int arg2) {
        field5819++;
        class54 var3 = class442.method2651(arg2, arg0, -13208);
        var3.method480(0);
        var3.field934 = arg1;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Lwe;", line = 15)
    public final synchronized class279 method2387(int arg0) {
        field5823++;
        int var2 = 24 / ((arg0 + 27) / 59);
        class279 var3 = (class279) this.field5814.field3105.method494(0, (long) this.field5815);
        if (var3 != null) {
            return var3;
        }
        class279 var4 = class279.method1789(this.field5814.field3094, this.field5815, 0);
        if (var4 != null) {
            this.field5814.field3105.method485((long) this.field5815, (byte) -125, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lcu;II)V", line = 35)
    private final void method2388(class145 arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            method2392(44);
        }
        field5818++;
        if (arg2 == 1) {
            this.field5815 = arg0.method1069((byte) -50);
        } else if (arg2 == 2) {
            this.field5817 = arg0.method1063((byte) 125);
            this.field5824 = arg0.method1063((byte) 111);
            return;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V", line = 58)
    public static final void method2389(int arg0) {
        field5816++;
        if (class427.field6349 != null) {
            class427.field6349.method670(-11723);
        }
        if (class199.field2921 != null) {
            class199.field2921.method670(-11723);
        }
        if (arg0 != 15804) {
            method2386(77, -108, 3);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lqa;Lbu;I)V", line = 80)
    public static final void method2390(class162 arg0, class17 arg1, int arg2) {
        field5825++;
        if (class171.field2648) {
            return;
        }
        arg0.method241(0);
        class275.field3980 = arg0.method304(class279.method1787(arg1, class127.field2029), true);
        class275.field3980.method3137((class466.field6952 - class275.field3980.method100()) / 2, (class77.field1297 - class275.field3980.method104()) / 2);
        class416.field6214 = arg0.method304(class279.method1787(arg1, class318.field4783), true);
        if (arg2 != 5) {
            method2391(null, (byte) 18);
        }
        class416.field6214.method3137((class466.field6952 - class416.field6214.method100()) / 2, 18);
        class171.field2648 = true;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lmq;B)Z", line = 107)
    public static final boolean method2391(class350 arg0, byte arg1) {
        if (arg1 != 92) {
            method2392(-52);
        }
        field5821++;
        if (class412.field6164 == arg0.field5219) {
            class349.field5212 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 131)
    public static void method2392(int arg0) {
        if (arg0 != 5) {
            field5822 = null;
        }
        field5822 = null;
        field5826 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILcu;)V", line = 143)
    public final void method2393(int arg0, class145 arg1) {
        while (true) {
            int var3 = arg1.method1063((byte) -75);
            if (var3 == 0) {
                field5820++;
                if (arg0 != -1) {
                    method2389(-40);
                    return;
                }
                return;
            }
            this.method2388(arg1, arg0 ^ 0xFFFFFFFD, var3);
        }
    }
}
