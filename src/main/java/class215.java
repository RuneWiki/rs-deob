import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class215 extends class61 {

    @OriginalMember(owner = "client!me", name = "L", descriptor = "Ljava/lang/Object;")
    private Object field3819;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "[J")
    public static long[] field3814 = new long[500];

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "Loh;")
    public static class263 field3824 = class253.method1681(-123, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "Z")
    public static boolean field3820;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)Z")
    public final boolean method380(int arg0) {
        if (arg0 != 2000) {
            this.method370(true);
        }
        field3822++;
        return false;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method370(boolean arg0) {
        field3823++;
        return arg0 ? null : this.field3819;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V")
    public static final void method1456(int arg0, byte arg1) {
        field3817++;
        int var2 = 35 / ((arg1 - 6) / 59);
        class64 var3 = class84.method563(8, arg0, -95);
        var3.method393(-78);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(JB)V")
    public static final void method1457(long arg0, byte arg1) {
        field3813++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg1 < 99) {
            field3814 = null;
        }
        if (arg0 % 10L == 0L) {
            class216.method1463(true, arg0 - 1L);
            class216.method1463(true, 1L);
        } else {
            class216.method1463(true, arg0);
        }
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public static final void method1458(int arg0) {
        if (arg0 > -43) {
            method1459((byte) 103);
        }
        class224.field3949.method825(0);
        class18.field406.method825(0);
        class103.field1956.method825(0);
        field3821++;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class215(Object arg0) {
        this.field3819 = arg0;
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(B)V")
    public static void method1459(byte arg0) {
        field3824 = null;
        if (arg0 == 70) {
            field3814 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lue;ILue;)V")
    public static final void method1460(class86 arg0, int arg1, class86 arg2) {
        field3815++;
        int var3 = -94 % ((-arg1 - 23) / 44);
        class122.field2268 = arg0;
        class37.field855 = arg2;
    }
}
