import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class255 {

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "Lkh;")
    private class13 field3912 = new class13(64);

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "Lul;")
    private class406 field3903;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "[I")
    public static int[] field3909 = new int[2];

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "Loe;")
    public static class137 field3905 = new class137();

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "S")
    public static short field3913;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V")
    public final void method1698(byte arg0) {
        if (arg0 < 45) {
            this.method1705((byte) 99);
        }
        class13 var2 = this.field3912;
        synchronized (this.field3912) {
            this.field3912.method93((byte) 127);
        }
        field3902++;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
    public static void method1699(int arg0) {
        field3905 = null;
        if (arg0 != 90) {
            field3905 = null;
        }
        field3909 = null;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)V")
    public static final void method1700(int arg0, int arg1) {
        field3911++;
        if (arg1 != -66) {
            method1699(-75);
        }
        class13 var2 = class298.field4532;
        synchronized (class298.field4532) {
            class298.field4532.method91(arg1 + 193, arg0);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZ)V")
    public final void method1701(int arg0, boolean arg1) {
        class13 var3 = this.field3912;
        synchronized (this.field3912) {
            this.field3912.method91(18, arg0);
            if (arg1) {
                field3909 = null;
            }
        }
        field3907++;
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(II)Lrs;")
    public final class465 method1702(int arg0, int arg1) {
        field3906++;
        class13 var3 = this.field3912;
        class465 var4;
        synchronized (this.field3912) {
            var4 = (class465) this.field3912.method87((long) arg1, arg0 ^ 0x851340DE);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field3903;
        byte[] var6;
        synchronized (this.field3903) {
            var6 = this.field3903.method2536(arg0, 0, arg1);
        }
        class465 var7 = new class465();
        if (var6 != null) {
            var7.method2813(-127, new class217(var6));
        }
        class13 var8 = this.field3912;
        synchronized (this.field3912) {
            this.field3912.method84((long) arg1, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(B)V")
    public static final void method1703(byte arg0) {
        if (arg0 != 27) {
            method1700(-91, -48);
        }
        field3908++;
        if (class326.field4910 == null) {
            return;
        }
        if (class326.field4910.field6570 == 1) {
            class326.field4910 = null;
            return;
        }
        if (class326.field4910.field6570 == 2) {
            class482.method2889(class341.field5068, class211.field3451, (byte) 93, 2);
            class326.field4910 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(CB)Z")
    public static final boolean method1704(char arg0, byte arg1) {
        if (arg1 == 15) {
            field3910++;
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(B)V")
    public final void method1705(byte arg0) {
        class13 var2 = this.field3912;
        synchronized (this.field3912) {
            this.field3912.method88(84);
        }
        field3904++;
        if (arg0 > -22) {
            this.field3912 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lee;ILul;)V")
    public class255(class480 arg0, int arg1, class406 arg2) {
        this.field3903 = arg2;
        this.field3903.method2551(31, -26070);
    }

    static {
        new class234("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
        new class234("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        new class234("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field3913 = 205;
    }
}
