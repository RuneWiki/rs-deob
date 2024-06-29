import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class486 {

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "B")
    public byte field7099 = 0;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "S")
    public short field7102;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "S")
    public short field7120;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "B")
    public byte field7107;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "B")
    public byte field7101;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Z")
    public static boolean field7095 = false;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lwj;")
    public static class270 field7094 = new class270(57, 11);

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "Ldi;")
    public static class83 field7121;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "Z")
    public static boolean field7122;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "B")
    public byte field7106;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "B")
    public byte field7111;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "B")
    public byte field7113;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "B")
    public byte field7117;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Lei;")
    public class117 field7100;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "Lhm;")
    public class147 field7103;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "Lhm;")
    public class147 field7105;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "Lae;")
    public class164 field7115;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Lid;")
    public class413 field7097;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "Lhg;")
    public class486 field7112;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "Lpn;")
    public class523 field7119;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "Lvr;")
    public class90 field7114;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "Lvr;")
    public class90 field7118;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "S")
    public short field7104;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Z")
    public boolean field7098;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "Z")
    public boolean field7108;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "Z")
    public boolean field7109;

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(III)V")
    public class486(int arg0, int arg1, int arg2) {
        this.field7102 = (short) arg1;
        this.field7120 = (short) arg2;
        this.field7101 = this.field7107 = (byte) arg0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public final void method2856(int arg0) {
        while (this.field7115 != null) {
            class164 var2 = this.field7115.field2467;
            this.field7115.method1091(500);
            this.field7115 = var2;
        }
        field7110++;
        this.field7099 = 0;
        if (arg0 != -5255) {
            field7094 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)J")
    public static final long method2857(int arg0) {
        field7096++;
        return arg0 == 47 ? class141.field2029.method705((byte) 63) : -115L;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static void method2858(byte arg0) {
        field7121 = null;
        if (arg0 != 0) {
            field7095 = true;
        }
        field7094 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIZII)Lq;")
    public static final class295 method2859(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field7116++;
        class295 var5 = new class295();
        var5.field4059 = arg0;
        var5.field4055 = arg3;
        class212.field2960.method1487(-114, (long) arg4, var5);
        if (arg1 != 17328) {
            method2859(-41, -119, true, -43, -6);
        }
        class259.method1563(0, arg3);
        class150 var6 = class60.method497(arg4, (byte) -118);
        if (var6 != null) {
            class370.method2222(0, var6);
        }
        if (class408.field5971 != null) {
            class370.method2222(0, class408.field5971);
            class408.field5971 = null;
        }
        class90.method673((byte) 84);
        if (var6 != null) {
            class356.method2132(var6, (byte) 65, !arg2);
        }
        if (!arg2) {
            class429.method2548(arg3);
        }
        if (!arg2 && class188.field2723 != -1) {
            class467.method2736(class188.field2723, 9380, 1);
        }
        return var5;
    }

    static {
        new class466("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field7121 = new class83(47, 8);
        field7122 = false;
    }
}
