import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class43 extends class278 {

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Lte;")
    public static class571 field1087 = new class571("", 17);

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Lkj;")
    public static class527 field1089 = new class527(3, 5);

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "[I")
    public static int[] field1090;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static void method567(int arg0) {
        field1087 = null;
        field1090 = null;
        if (arg0 != -20039) {
            method570(-81, 65, -106);
        }
        field1089 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIZ)V")
    public final void method568(int arg0, int arg1, int arg2, boolean arg3) {
        ++field1085;
        int var5 = this.method1839((byte) -118) * super.field4164.field3492 / 10000;
        class623.field9017.method4(arg1, arg2 + 2, var5, super.field4164.field3491 + -2, ((class705) super.field4164).field9926, 0);
        class623.field9017.method4(arg1 + var5, arg2 + 2, super.field4164.field3492 - var5, super.field4164.field3491 + -2, 0, 0);
        if (arg0 >= -35) {
            field1087 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIZI)V")
    public final void method569(int arg0, int arg1, boolean arg2, int arg3) {
        ++field1088;
        class623.field9017.method108(arg1 + -2, arg3, super.field4164.field3492 + 4, super.field4164.field3491 + arg0, ((class705) super.field4164).field9925, 0);
        class623.field9017.method108(arg1 + -1, arg3 + 1, super.field4164.field3492 + 2, super.field4164.field3491, 0, 0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)Ldf;")
    public static final class370 method570(int arg0, int arg1, int arg2) {
        if (class257.field3792[arg0][arg1][arg2] == null) {
            boolean var3 = class257.field3792[0][arg1][arg2] != null && class257.field3792[0][arg1][arg2].field5492 != null;
            if (var3 && arg0 >= class148.field2557 - 1) {
                return null;
            }
            class406.method2471(arg0, arg1, arg2);
        }
        return class257.field3792[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lom;Lom;Lms;)V")
    public class43(class344 arg0, class344 arg1, class705 arg2) {
        super(arg0, arg1, arg2);
    }
}
