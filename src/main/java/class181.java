import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class181 extends class110 {

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "Leh;")
    public static class47 field3472 = class195.method1282((byte) -4, "");

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "Leh;")
    public static class47 field3471 = class195.method1282((byte) -4, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field3466 = 0;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "Leh;")
    public static class47 field3469 = field3472;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "Leh;")
    private static class47 field3473 = class195.method1282((byte) -4, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "Leh;")
    public static class47 field3465 = field3473;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Ldh;")
    public static class38 field3462;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "Lfb;")
    public static class50 field3464;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "Lfd;")
    public class52 field3474;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "Lgg;")
    public class62 field3475;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "Lkf;")
    public static class96 field3468;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "[B")
    public byte[] field3467;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIBI)I")
    public static final int method1202(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3477++;
        int var5 = 65536 - class17.field350[arg2 * 1024 / arg4] >> 1;
        return arg3 < 88 ? 96 : ((65536 - var5) * arg1 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public static void method1203(int arg0) {
        field3462 = null;
        field3469 = null;
        field3468 = null;
        if (arg0 != -2210) {
            return;
        }
        field3465 = null;
        field3471 = null;
        field3464 = null;
        field3472 = null;
        field3473 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)I")
    public static final int method1204(int arg0, int arg1, byte arg2) {
        field3470++;
        class120 var3 = (class120) class2.field21.method1342((long) arg0, (byte) -20);
        if (var3 == null) {
            return -1;
        } else {
            int var4 = 32 % ((arg2 + 61) / 35);
            return arg1 >= 0 && var3.field2426.length > arg1 ? var3.field2426[arg1] : -1;
        }
    }
}
