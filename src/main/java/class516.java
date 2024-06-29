import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class516 {

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public int field7642;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public int field7648;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "Lau;")
    public class516 field7643;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "Lia;")
    public class414 field7644;

    @OriginalMember(owner = "client!au", name = "m", descriptor = "F")
    public static float field7654;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public int field7647;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "I")
    public int field7652;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "I")
    public int field7653;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "Luk;")
    public static class170 field7655;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "Lpr;")
    public static class309 field7649;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "Ljava/lang/String;")
    public static String field7651;

    static {
        new class304("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V", line = 6)
    public static void method3041(byte arg0) {
        field7651 = null;
        if (arg0 > 63) {
            field7649 = null;
            field7655 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IB)Lau;", line = 21)
    public final class516 method3042(int arg0, byte arg1) {
        int var3 = 69 % ((-arg1 - 65) / 53);
        field7646++;
        return new class516(this.field7642, arg0);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)Lbp;", line = 36)
    public final class261 method3043(int arg0) {
        int var2 = -99 % ((arg0 + 23) / 46);
        field7650++;
        return class423.method2436(this.field7642, true);
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V", line = 48)
    public static final void method3044(int arg0) {
        if (arg0 != 20042) {
            field7655 = null;
        }
        field7645++;
        class49.field757.method1458((byte) 99);
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(II)V", line = 60)
    public class516(int arg0, int arg1) {
        this.field7642 = arg0;
        this.field7648 = arg1;
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lau;I)V", line = 73)
    public class516(class516 arg0, int arg1) {
        this.field7643 = arg0;
        this.field7644 = this.field7643.field7644;
        this.field7642 = this.field7643.field7642;
        this.field7648 = this.field7643.field7648 + arg1;
    }
}
