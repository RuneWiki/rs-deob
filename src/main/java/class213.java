import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class213 {

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field3886 = 0;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Lhh;")
    private static class163 field3887 = class137.method1065("cyan:", 17);

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "[I")
    public static int[] field3882 = new int[500];

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Lhh;")
    public static class163 field3890 = field3887;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Lhh;")
    public static class163 field3879 = field3887;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Lhh;")
    public static class163 field3891 = class137.method1065("underlay", 17);

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "Lhh;")
    public static class163 field3888 = class137.method1065("(Y", 17);

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "[I")
    public static int[] field3881 = new int[2000];

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "S")
    public static short field3892 = 256;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Lv;")
    public static class22 field3880;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Lqh;")
    public static class69 field3885;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLqh;)V")
    public static final void method1517(byte arg0, class69 arg1) {
        if (arg0 == 11) {
            if (class164.field3030 == arg1.field1198) {
                class110.field2086[arg1.field1182] = true;
            }
            field3889++;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIZIII)Lvf;")
    public static final class71 method1518(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = (arg0 << 19) + arg3 + ((arg2 ? 65536 : 0) - -(arg5 << 17));
        field3884++;
        long var8 = (long) arg4 * 3147483667L + (long) var7 * 3849834839L;
        if (arg1 != 462808465) {
            field3885 = null;
        }
        class71 var10 = (class71) class29.field466.method114(var8, 0);
        if (var10 != null) {
            return var10;
        }
        class98.field1845 = false;
        class71 var11 = class127.method1010(arg0, arg5, (byte) -112, false, false, arg2, arg4, arg3);
        if (var11 != null && !class98.field1845) {
            class29.field466.method117(var11, false, var8);
        }
        return var11;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method1519(int arg0) {
        if (arg0 != -614) {
            field3885 = null;
        }
        field3880 = null;
        field3879 = null;
        field3881 = null;
        field3887 = null;
        field3891 = null;
        field3885 = null;
        field3882 = null;
        field3888 = null;
        field3890 = null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public static final void method1520(int arg0) {
        field3883++;
        if (arg0 != 13738) {
            method1518(-73, 102, true, 38, 30, 45);
        }
        class35.field547++;
    }
}
