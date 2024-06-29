import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class273 extends class619 {

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Lch;")
    public class219 field3598;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Lhfa;")
    public static class331 field3600 = new class331();

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Loa;")
    public static class43 field3602;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 4)
    public static void method1659(int arg0) {
        field3600 = null;
        if (arg0 == -2366) {
            field3602 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(JI)V", line = 17)
    public static final void method1660(long arg0, int arg1) {
        field3597++;
        if (arg1 == 6406) {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var3) {
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLfd;)Luea;", line = 31)
    public static final class256 method1661(boolean arg0, class418 arg1) {
        field3601++;
        class243 var2 = class116.method872(17679, arg1);
        if (arg0) {
            int var3 = arg1.method2365(-46);
            return new class256(var2.field3259, var2.field3257, var2.field3261, var2.field3258, var2.field3262, var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lji;II[B)V", line = 50)
    public class273(class622 arg0, int arg1, int arg2, byte[] arg3) {
        this.field3598 = class521.method2798(6406, arg0, -13842, arg3, false, arg1, 6406, arg2);
        this.field3598.method1504(false, (byte) 90, false);
    }
}
