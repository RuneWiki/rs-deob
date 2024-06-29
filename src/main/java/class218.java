import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class218 extends class243 {

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public int field3783;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public int field3782;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public int field3787;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public int field3784;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Llo;")
    public static class306 field3786 = new class306("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
    public static final void method1504(int arg0, int arg1, int arg2) {
        field3785++;
        if (arg0 != -29593) {
            method1505(71);
        }
        class266 var3 = class308.method1961(true, arg2, 12);
        var3.method1781((byte) 95);
        var3.field4454 = arg1;
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V")
    public static void method1505(int arg0) {
        if (arg0 != 12) {
            field3786 = null;
        }
        field3786 = null;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIII)V")
    public class218(int arg0, int arg1, int arg2, int arg3) {
        this.field3783 = arg2;
        this.field3782 = arg0;
        this.field3787 = arg3;
        this.field3784 = arg1;
    }
}
