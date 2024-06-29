import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class245 extends class97 {

    @OriginalMember(owner = "client!rp", name = "u", descriptor = "I")
    public int field3672 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rp", name = "t", descriptor = "I")
    public int field3671 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rp", name = "w", descriptor = "I")
    public int field3674 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "I")
    public int field3677 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rp", name = "v", descriptor = "I")
    public int field3673 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "I")
    public int field3667 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rp", name = "B", descriptor = "I")
    public int field3678 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rp", name = "x", descriptor = "I")
    public int field3675 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "Ldh;")
    public class227 field3669;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
    public static int field3666 = 2;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "Ljg;")
    public static class241 field3665 = new class241(4);

    @OriginalMember(owner = "client!rp", name = "E", descriptor = "[I")
    public static int[] field3681;

    @OriginalMember(owner = "client!rp", name = "D", descriptor = "Lik;")
    public static class463 field3680;

    @OriginalMember(owner = "client!rp", name = "y", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!rp", name = "C", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "Lil;")
    public static class42 field3670;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "Z")
    public static boolean field3668;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)V")
    public static void method1500(int arg0) {
        field3680 = null;
        int var1 = 59 % ((arg0 + 81) / 34);
        field3665 = null;
        field3681 = null;
        field3670 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)Z")
    public final boolean method1501(int arg0, int arg1, int arg2) {
        if (arg0 <= 0) {
            return false;
        }
        field3679++;
        if (arg2 >= this.field3667 && this.field3675 >= arg2 && this.field3678 <= arg1 && arg1 <= this.field3672) {
            return true;
        } else {
            return this.field3674 <= arg2 && this.field3677 >= arg2 && this.field3671 <= arg1 && this.field3673 >= arg1;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Liq;BLiq;Ldr;)V")
    public static final void method1502(class134 arg0, byte arg1, class134 arg2, class261 arg3) {
        class148.field2044 = class1.method14((byte) 115, arg0, 0, class275.field4207);
        field3676++;
        class284.field4334 = arg3.method410(class148.field2044, class4.method26(arg2, class275.field4207, 0), true);
        int var4 = 52 / ((arg1 + 50) / 50);
        class458.field6795 = class1.method14((byte) 127, arg0, 0, class458.field6782);
        class380.field5552 = arg3.method410(class458.field6795, class4.method26(arg2, class458.field6782, 0), true);
        class188.field2828 = class1.method14((byte) 119, arg0, 0, class376.field5485);
        class161.field2244 = arg3.method410(class188.field2828, class4.method26(arg2, class376.field5485, 0), true);
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Ldh;)V")
    public class245(class227 arg0) {
        this.field3669 = arg0;
    }

    static {
        new class151("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field3681 = new int[25];
        field3680 = new class463("", 16);
    }
}
