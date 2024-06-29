import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class116 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field2544 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field2551 = 0;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field2548 = 0;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lea;")
    private static class38 field2552 = class9.method46((byte) 124, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lea;")
    public static class38 field2546 = field2552;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLdd;Lea;Lea;)Lk;")
    public static final class89 method898(boolean arg0, class32 arg1, class38 arg2, class38 arg3) {
        if (arg0) {
            field2546 = null;
        }
        field2549++;
        int var4 = arg1.method207((byte) 32, arg3);
        int var5 = arg1.method212(arg2, -128, var4);
        return class18.method105(117, var4, var5, arg1);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method872(int arg0, Component arg1);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lt;")
    public static final class170 method899(byte arg0, int arg1) {
        if (arg0 < 126) {
            field2546 = null;
        }
        field2547++;
        class170 var2 = (class170) class198.field3908.method1078((byte) 106, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class170 var3 = class80.method680(class98.field2180, arg1, (byte) 125, false, class18.field374);
        if (var3 != null) {
            class198.field3908.method1076((long) arg1, -4, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
    public abstract int method873(int arg0);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIB)I")
    public static final int method900(int arg0, int arg1, byte arg2) {
        if (arg2 == -74) {
            int var3 = arg0 >> 31 & arg1 - 1;
            field2545++;
            return ((arg0 >>> 31) + arg0) % arg1 + var3;
        } else {
            return -48;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method874(Component arg0, byte arg1);

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public static void method901(int arg0) {
        field2546 = null;
        if (arg0 == 0) {
            field2552 = null;
        }
    }
}
