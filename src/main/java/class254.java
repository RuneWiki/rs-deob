import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class254 {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Lqa;")
    public static class167 field3703;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Lmj;")
    public static class313 field3704;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field3705;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIIIIZI)V")
    public static final void method1600(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class322.field4665 = arg1;
        class130.field2114 = arg4;
        class129.field2100 = arg6;
        class598.field8508 = arg3;
        field3701++;
        class168.field2453 = arg2;
        int var7 = 17 / ((38 - arg0) / 40);
        if (arg5 && class130.field2114 >= 100) {
            class216.field3274 = class322.field4665 * 128 + 64;
            class545.field7584 = class168.field2453 * 128 + 64;
            class448.field6535 = class355.method2160(class545.field7584, class216.field3274, class545.field7583, (byte) 103) - class129.field2100;
        }
        class377.field5547 = 2;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static final void method1601(int arg0) {
        field3702++;
        class117.field1898.method739(2048);
        int var1 = 46 % ((arg0 + 58) / 38);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
    public static void method1602(boolean arg0) {
        field3705 = null;
        if (!arg0) {
            field3703 = null;
            field3704 = null;
        }
    }

    static {
        new class567("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }
}
