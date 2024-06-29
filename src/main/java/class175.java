import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class175 extends class129 {

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "Lrd;")
    public class173 field3445;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "[I")
    public static int[] field3440 = new int[32];

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "Laf;")
    public static class7 field3441 = new class7(30);

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "Lrd;")
    public static class173 field3443 = class133.method843("Benutzen", -121);

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "Z")
    public static boolean field3446 = false;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "Laf;")
    public static class7 field3442 = new class7(200);

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "Lrd;")
    public static class173 field3448 = class133.method843("::fpson", -69);

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "Lrd;")
    public static class173 field3449 = class133.method843("(U1", -87);

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "La;")
    public static class1 field3444;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "Lve;")
    public static class212 field3447;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
    public static void method1167(int arg0) {
        field3440 = null;
        field3449 = null;
        field3443 = null;
        field3444 = null;
        field3448 = null;
        field3441 = null;
        field3447 = null;
        field3442 = null;
        if (arg0 != 32) {
            method1167(96);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIII)V")
    public static final void method1168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3439++;
        for (int var6 = arg2; var6 <= arg1; var6++) {
            class51.method350(arg5, arg0, (byte) -118, class107.field1998[var6], arg3);
        }
        if (arg4 != 7412) {
            field3447 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class175() {
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lrd;)V")
    public class175(class173 arg0) {
        this.field3445 = arg0;
    }
}
