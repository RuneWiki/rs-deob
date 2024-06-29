import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class207 extends class196 {

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
    private final int field3577;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "I")
    private final int field3588;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
    private final int field3592;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    private final int field3574;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "Loa;")
    private static class99 field3583 = class221.method1463(2844, ")3fr");

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "Loa;")
    private static class99 field3579 = class221.method1463(2844, "en");

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "Loa;")
    private static class99 field3582 = class221.method1463(2844, ")3de");

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
    public static int field3591 = 0;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "Loa;")
    public static class99 field3580 = class221.method1463(2844, "<col=c0ff00>");

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "Loa;")
    public static class99 field3585 = class221.method1463(2844, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    public static int field3593 = 0;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "Loa;")
    private static class99 field3590 = class221.method1463(2844, ")3en");

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "Loa;")
    private static class99 field3594 = class221.method1463(2844, "pt");

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "Loa;")
    public static class99 field3587 = class221.method1463(2844, "Chargement des textures )2 ");

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "Loa;")
    private static class99 field3589 = class221.method1463(2844, "fr");

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "Loa;")
    private static class99 field3575 = class221.method1463(2844, ")3pt");

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "Loa;")
    private static class99 field3597 = class221.method1463(2844, "de");

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "[Loa;")
    private static class99[] field3596 = new class99[] { field3590, field3582, field3583, field3575 };

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "[Loa;")
    public static class99[] field3584 = new class99[] { field3579, field3597, field3589, field3594 };

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "Ltg;")
    public static class182 field3576;

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "Ltg;")
    public static class182 field3595;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "[Laa;")
    public static class170[] field3586;

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(IIIIII)V")
    public class207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3577 = arg2;
        this.field3588 = arg0;
        this.field3592 = arg1;
        this.field3574 = arg3;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(III)V")
    public final void method277(int arg0, int arg1, int arg2) {
        ++field3581;
        if (arg2 != 0) {
            field3589 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V")
    public static final void method1386(int arg0, int arg1) {
        if (arg1 <= 112) {
            field3587 = null;
        }
        if (arg0 == -1 && !class127.field2222) {
            class133.method889((byte) 89);
        } else if (arg0 != -1 && (class62.field1037 != arg0 || !class118.method795((byte) 124)) && ~class160.field2839 != -1 && !class127.field2222) {
            class167.method1132(arg0, 2, 0, false, 0, class160.field2839, class227.field3923);
        }
        class62.field1037 = arg0;
        ++field3573;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V")
    public final void method275(int arg0, int arg1, int arg2) {
        int var4 = this.field3577 * arg0 >> 12;
        if (arg2 != 205) {
            this.method277(-69, -89, -21);
        }
        int var5 = this.field3588 * arg0 >> 12;
        ++field3572;
        int var6 = this.field3592 * arg1 >> 12;
        int var7 = this.field3574 * arg1 >> 12;
        class118.method791(super.field3412, var7, var5, var4, (byte) 125, var6);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIB)V")
    public final void method271(int arg0, int arg1, byte arg2) {
        if (arg2 == 108) {
            ++field3578;
        }
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V")
    public static void method1387(int arg0) {
        field3582 = null;
        field3583 = null;
        field3597 = null;
        field3580 = null;
        field3595 = null;
        field3584 = null;
        field3596 = null;
        field3590 = null;
        field3594 = null;
        field3575 = null;
        field3589 = null;
        field3587 = null;
        field3576 = null;
        field3579 = null;
        field3586 = null;
        field3585 = null;
        if (arg0 != -1) {
            field3595 = null;
        }
    }
}
