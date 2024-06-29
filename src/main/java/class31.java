import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class31 {

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "Ldp;")
    public static class347 field449;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "Lcd;")
    public static class65 field445;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lkh;ZI)V")
    public static final void method272(class400 arg0, boolean arg1, int arg2) {
        field440++;
        int var3 = -1;
        int var4 = 0;
        if (class86.field1350 < arg0.field6054) {
            class531.method3155(arg0, (byte) 43);
        } else if (class86.field1350 > arg0.field6051) {
            class16.method193(arg0, (byte) -94, false);
            var4 = class236.field3311;
            var3 = class350.field5387;
        } else {
            class514.method3027((byte) -38, arg0);
        }
        if (arg0.field7681 < 128 || arg0.field7671 < 128 || arg0.field7681 >= class50.field640 * 128 - 128 || (class448.field6611 - 1) * 128 <= arg0.field7671) {
            arg0.field6054 = 0;
            arg0.field5998 = -1;
            arg0.field5973 = -1;
            arg0.field6051 = 0;
            var3 = -1;
            var4 = 0;
            arg0.field5997 = -1;
            arg0.field7681 = arg0.field6065[0] * 128 + (arg0.method2419((byte) 120) * 64);
            arg0.field7671 = arg0.field6068[0] * 128 + (arg0.method2419((byte) 116) * 64);
            arg0.method2417((byte) -105);
        }
        if (!arg1) {
            method274(-78);
        }
        if (class410.field6198 == arg0 && (arg0.field7681 < 1536 || arg0.field7671 < 1536 || class50.field640 * 128 - 1536 <= arg0.field7681 || ((class448.field6611 - 12) * 128) <= arg0.field7671)) {
            arg0.field5973 = -1;
            arg0.field5997 = -1;
            var4 = 0;
            arg0.field6054 = 0;
            arg0.field6051 = 0;
            var3 = -1;
            arg0.field5998 = -1;
            arg0.field7681 = arg0.field6065[0] * 128 + arg0.method2419((byte) 103) * 64;
            arg0.field7671 = arg0.field6068[0] * 128 + arg0.method2419((byte) 110) * 64;
            arg0.method2417((byte) -91);
        }
        int var5 = class302.method1878(arg0, 0);
        class433.method2555(var5, var4, (byte) 60, arg0, var3);
        class231.method1435((byte) -89, arg0);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lya;Lok;ILok;)V")
    public static final void method273(class11 arg0, class74 arg1, int arg2, class74 arg3) {
        if (arg2 > 0) {
            field439 = 127;
        }
        class269.field3996 = class19.method210(arg3, 0, class172.field2523, (byte) 124);
        field446++;
        class267.field3975 = arg0.method61(class269.field3996, class319.method1995(arg1, class172.field2523, 0), true);
        class192.field2837 = class19.method210(arg3, 0, class89.field1391, (byte) 125);
        class164.field2445 = arg0.method61(class192.field2837, class319.method1995(arg1, class89.field1391, 0), true);
        class342.field5252 = class19.method210(arg3, 0, class261.field3902, (byte) 76);
        class345.field5325 = arg0.method61(class342.field5252, class319.method1995(arg1, class261.field3902, 0), true);
    }

    @OriginalMember(owner = "client!oo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field443++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
    public static void method274(int arg0) {
        if (arg0 <= 95) {
            field439 = 97;
        }
        field445 = null;
        field449 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)I")
    public final int method275(byte arg0) {
        field441++;
        if (arg0 <= 124) {
            method277(false);
        }
        return this.field447;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
    public static final void method276(boolean arg0) {
        class473.field6950 = null;
        class41.field535 = null;
        class73.field1011 = null;
        class225.field3177 = null;
        if (!arg0) {
            method276(true);
        }
        class184.field2715 = null;
        class297.field4431 = null;
        field448++;
        class230.field3235 = null;
        class456.field6687 = null;
        class78.field1087 = null;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class31(String arg0, int arg1) {
        this.field447 = arg1;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(Z)V")
    public static final void method277(boolean arg0) {
        field444++;
        class197.field2894.method2796(true);
        class43.field559.field6830 = 0;
        class496.field7360 = null;
        class2.field16 = null;
        class400.field6033 = null;
        class89.field1392 = 0;
        class104.field1562 = 0;
        class400.field5966.field6830 = 0;
        class305.field4553 = null;
        class219.field3135 = 0;
        for (int var1 = 0; var1 < 100; var1++) {
            class330.field5142[var1] = null;
        }
        if (arg0) {
            return;
        }
        class293.field4399 = null;
        class510.field7492 = null;
        class516.field7572 = 0;
        class222.field3162 = 0;
        class159.field2396 = 0;
        class318.field4913 = 0;
    }

    static {
        new class347("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field449 = new class347("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");
    }
}
