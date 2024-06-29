import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class175 {

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lma;")
    private static class5 field2677 = class12.method119("glow1:", (byte) 119);

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field2675 = 0;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "[I")
    public static int[] field2678 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lma;")
    public static class5 field2672 = field2677;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field2680 = 0;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Lma;")
    public static class5 field2676 = field2677;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field2674 = -1;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "F")
    public static float field2670;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public int field2681;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Lv;")
    public class232 field2667;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "[I")
    public int[] field2679;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 7)
    public static void method1145(byte arg0) {
        field2678 = null;
        field2672 = null;
        field2676 = null;
        if (arg0 >= -22) {
            method1148(94, false);
        }
        field2677 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZ)I", line = 29)
    public static final int method1146(int arg0, int arg1, boolean arg2) {
        field2669++;
        if (arg2) {
            return -110;
        } else {
            int var3 = arg1 >>> 31;
            return (arg1 + var3) / arg0 - var3;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V", line = 55)
    public static final void method1147(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -67) {
            return;
        }
        field2668++;
        if (arg3 <= arg0) {
            class239.method1690(arg3, 23267, arg0, class137.field2032[arg2], arg4);
        } else {
            class239.method1690(arg0, 23267, arg3, class137.field2032[arg2], arg4);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)Lma;", line = 88)
    public static final class5 method1148(int arg0, boolean arg1) {
        field2671++;
        return arg1 ? (class5) null : class244.method1711(30995, arg0, false, 10);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[BZLvi;)V", line = 100)
    public static final void method1149(int arg0, byte[] arg1, boolean arg2, class211 arg3) {
        class119 var4 = new class119();
        var4.field1795 = arg1;
        field2673++;
        var4.field1798 = 0;
        if (!arg2) {
            method1148(-35, true);
        }
        var4.field1799 = arg3;
        var4.field5004 = (long) arg0;
        class218 var5 = class29.field477;
        synchronized (class29.field477) {
            class29.field477.method1485(-8564, var4);
        }
        class238.method1679((byte) -9);
    }
}
