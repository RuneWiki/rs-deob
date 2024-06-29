import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class325 extends class337 {

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public int field4632 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
    public int field4633 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "I")
    public int field4634 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cq", name = "v", descriptor = "I")
    public int field4639 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
    public int field4635 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cq", name = "x", descriptor = "I")
    public int field4641 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "I")
    public int field4643 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cq", name = "B", descriptor = "I")
    public int field4645 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cq", name = "w", descriptor = "Lcn;")
    public class355 field4640;

    @OriginalMember(owner = "client!cq", name = "y", descriptor = "Luc;")
    public static class23 field4642;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!cq", name = "A", descriptor = "Ljava/lang/Object;")
    public static Object field4644;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V")
    public static final void method2011(int arg0, int arg1) {
        if (arg1 < 110) {
            field4644 = null;
        }
        field4638++;
        if (class525.method3102(arg0, -1)) {
            class518.method3049(class185.field2754[arg0], (byte) -72, -1);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2012(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != Integer.MAX_VALUE) {
            field4644 = null;
        }
        if (arg1 >= class494.field7297 && class445.field6629 >= arg2 && class37.field393 <= arg5 && class509.field7436 >= arg4) {
            class303.method1906(arg2, arg4, arg1, true, arg7, arg3, arg6, arg5);
        } else {
            class258.method1715(arg7, arg6, (byte) 104, arg1, arg2, arg3, arg4, arg5);
        }
        field4637++;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public static void method2013(int arg0) {
        field4644 = null;
        if (arg0 != -1) {
            field4642 = null;
        }
        field4642 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)Z")
    public final boolean method2014(int arg0, int arg1, int arg2) {
        field4636++;
        if (arg0 >= this.field4633 && this.field4645 >= arg0 && arg2 >= this.field4641 && this.field4634 >= arg2) {
            return true;
        } else if (arg0 >= this.field4635 && arg0 <= this.field4643 && arg2 >= this.field4639 && arg2 <= this.field4632) {
            return true;
        } else {
            if (arg1 != Integer.MIN_VALUE) {
                this.field4643 = 84;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lcn;)V")
    public class325(class355 arg0) {
        this.field4640 = arg0;
    }

    static {
        new class475("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field4642 = new class23(16);
    }
}
