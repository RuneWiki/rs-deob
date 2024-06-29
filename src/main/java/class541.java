import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class541 extends class476 {

    @OriginalMember(owner = "client!nga", name = "G", descriptor = "Lam;")
    public static class660 field7383 = new class660();

    @OriginalMember(owner = "client!nga", name = "D", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!nga", name = "E", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!nga", name = "F", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)Z")
    public static final boolean method3055(int arg0, int arg1, int arg2) {
        int var3 = -94 / ((-20 - arg2) / 44);
        ++field7382;
        return (arg1 & 2048) != 0;
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)V")
    public static void method3056(int arg0) {
        if (arg0 > -61) {
            method3056(-44);
        }
        field7383 = null;
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Lgj;Lgj;Lmea;)V")
    public class541(class662 arg0, class662 arg1, class454 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(BIIII)V")
    public final void method2728(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7381;
        int var6 = super.field6440.method224();
        int var7 = ((class454) super.field10732).field6198 * class192.method1400(255) / 10 % var6;
        super.field6440.method3426(-var6 + arg2 + var7, arg4, arg1 - -var6 - var7, arg3);
        if (arg0 < 55) {
            field7383 = null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method3057(int arg0, String arg1) {
        ++field7380;
        if (arg0 != 10) {
            field7383 = null;
        }
        return class488.field6591.containsKey(arg1);
    }
}
