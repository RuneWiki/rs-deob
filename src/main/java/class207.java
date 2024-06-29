import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class207 extends class77 {

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public int field3867 = 0;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "Ldc;")
    private static class37 field3872 = class185.method1233((byte) 86, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!t", name = "F", descriptor = "Ldc;")
    public static class37 field3865 = class185.method1233((byte) 86, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!t", name = "T", descriptor = "Ldc;")
    private static class37 field3877 = class185.method1233((byte) 86, "Drop");

    @OriginalMember(owner = "client!t", name = "R", descriptor = "Ldc;")
    public static class37 field3875 = field3872;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "Ldc;")
    public static class37 field3864 = field3877;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "Ldc;")
    private static class37 field3868 = class185.method1233((byte) 86, "Loaded textures");

    @OriginalMember(owner = "client!t", name = "U", descriptor = "Ldc;")
    public static class37 field3878 = field3868;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "Ldc;")
    public static class37 field3879 = class185.method1233((byte) 86, "Bitte geben Sie Ihren Benutzernamen ein)3");

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!t", name = "S", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "J")
    public static long field3869;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "Lwa;")
    public static class238 field3871;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILce;)V")
    private final void method1369(int arg0, int arg1, class28 arg2) {
        if (arg0 == arg1) {
            this.field3867 = arg2.method230((byte) -115);
        }
        field3866++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)Lrf;")
    public static final class191 method1370(int arg0, byte arg1) {
        field3870++;
        class191 var2 = (class191) class88.field1533.method87(122, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class131.field2452.method1547(class59.method453(arg0, 255), 0, class17.method121(true, arg0));
        class191 var4 = new class191();
        var4.field3551 = arg0;
        if (var3 != null) {
            var4.method1270((byte) 89, new class28(var3));
        }
        class88.field1533.method92((long) arg0, var4, true);
        return arg1 > -104 ? null : var4;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BJ)V")
    public static final void method1371(byte arg0, long arg1) {
        field3873++;
        if (arg1 == 0L) {
            return;
        }
        class49.field970.method1503(244, 2976);
        if (arg0 >= 51) {
            class68.field1225++;
            class49.field970.method190(arg1, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lce;I)V")
    public final void method1372(class28 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method215(-1797813752);
            if (var3 == 0) {
                field3876++;
                if (arg1 != 128) {
                    method1373(-44, 82, -50, 29, null, 2L, true);
                    return;
                }
                return;
            }
            this.method1369(2, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIILia;JZ)V")
    public static final void method1373(int arg0, int arg1, int arg2, int arg3, class88 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class149 var8 = new class149();
        var8.field2829 = arg4;
        var8.field2831 = arg1 * 128 + 64;
        var8.field2820 = arg2 * 128 + 64;
        var8.field2823 = arg3;
        var8.field2819 = arg5;
        if (class180.field3354[arg0][arg1][arg2] == null) {
            class180.field3354[arg0][arg1][arg2] = new class18(arg0, arg1, arg2);
        }
        class180.field3354[arg0][arg1][arg2].field295 = var8;
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
    public static void method1374(int arg0) {
        if (arg0 != 128) {
            field3871 = null;
        }
        field3871 = null;
        field3872 = null;
        field3877 = null;
        field3865 = null;
        field3878 = null;
        field3868 = null;
        field3864 = null;
        field3879 = null;
        field3875 = null;
    }
}
