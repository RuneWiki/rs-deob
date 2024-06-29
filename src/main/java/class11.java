import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class11 extends class627 {

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "Lus;")
    public static class328 field124 = new class328(39, 15);

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "Lmq;")
    public static class78 field128 = new class78(72, -1);

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    public static int field129 = -1;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIII)V")
    public static final void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field126++;
        if (class108.field1334 <= arg4 && arg1 <= class592.field8242 && arg3 >= class112.field1386 && class328.field4190 >= arg6) {
            if (arg2 == 1) {
                class418.method2487(arg6, arg4, arg3, arg5, 126, arg1);
            } else {
                class282.method1690(arg3, 0, arg5, arg1, arg4, arg6, arg2);
            }
        } else if (arg2 == 1) {
            class760.method4230(arg5, arg3, arg6, arg4, arg1, (byte) -106);
        } else {
            class426.method2530(arg6, arg5, arg1, arg4, 0, arg2, arg3);
        }
        if (arg0 != -10932) {
            method55(-12);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
    public static final void method54(boolean arg0) throws class510 {
        if (class709.field9973 == 1) {
            class422.field5998.method89(class314.field4027, class437.field6143);
        } else {
            class422.field5998.method89(0, 0);
        }
        field123++;
        if (!arg0) {
            field124 = null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
    public static void method55(int arg0) {
        if (arg0 == 39) {
            field128 = null;
            field124 = null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(II)V")
    public class11(int arg0, int arg1) {
        this.field127 = arg0;
        this.field122 = arg1;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V")
    public static final void method56(int arg0, int arg1) {
        field125++;
        if (arg0 != 39) {
            field129 = -78;
        }
        class548 var2 = class696.method3872(arg1, 10, -1633381944);
        var2.method3127((byte) -124);
    }
}
