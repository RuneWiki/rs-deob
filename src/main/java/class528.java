import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class528 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Lsw;")
    public static class641 field7388 = new class641(200);

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field7392 = -1;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "Lug;")
    public static class480 field7391 = new class480();

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Lcea;")
    public static class180 field7393 = new class180("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Lpt;")
    public static class451 field7394 = new class451(8);

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Lvj;")
    public static class373 field7395 = new class373(59, 3);

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Lvj;")
    public static class373 field7396 = new class373(78, 7);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public static void method3005(boolean arg0) {
        field7395 = null;
        field7391 = null;
        field7393 = null;
        field7394 = null;
        field7396 = null;
        if (arg0) {
            method3006(90);
        }
        field7388 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static final void method3006(int arg0) {
        if (class382.field5052 != null) {
            class382.field5052.method1252(286331153);
        }
        field7389++;
        if (class441.field6089 != null) {
            class441.field6089.method1252(286331153);
        }
        if (arg0 != -3083) {
            field7395 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)Z")
    public static final boolean method3007(int arg0) {
        field7390++;
        return ~class578.field8436 == arg0 ? class390.field5159.method1550(arg0 + 32625) : true;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)Z")
    public static final boolean method3008(int arg0, int arg1, int arg2, int arg3) {
        if (class544.method3186(arg0, arg1, arg2)) {
            int var4 = arg1 << class362.field4756;
            int var5 = arg2 << class362.field4756;
            return class497.method2868(var4 + 1, class128.field1574[arg0].method855(arg1, arg2) + arg3, var5 + 1) && class497.method2868(class79.field929 + var4 - 1, class128.field1574[arg0].method855(arg1 + 1, arg2) + arg3, var5 + 1) && class497.method2868(class79.field929 + var4 - 1, class128.field1574[arg0].method855(arg1 + 1, arg2 + 1) + arg3, class79.field929 + var5 - 1) && class497.method2868(var4 + 1, class128.field1574[arg0].method855(arg1, arg2 + 1) + arg3, class79.field929 + var5 - 1);
        } else {
            return false;
        }
    }
}
