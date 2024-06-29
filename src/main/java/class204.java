import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class204 {

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "[S")
    public static short[] field3689 = new short[256];

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field3690 = 2;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "[Z")
    public static boolean[] field3686 = new boolean[100];

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "[[I")
    public static int[][] field3694 = new int[5][5000];

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[Ljd;")
    public static class86[] field3688;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZII)Lcg;")
    public static final class161 method1456(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1458(false);
        }
        class161 var3 = (class161) class185.field3284.method1698((long) arg1 << 32 | (long) arg2, (byte) 121);
        field3687++;
        if (var3 == null) {
            var3 = new class161(arg1, arg2);
            class185.field3284.method1699(-28407, var3, var3.field3759);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static final void method1457(int arg0) {
        for (class14 var1 = (class14) class258.field4574.method1737((byte) 74); var1 != null; var1 = (class14) class258.field4574.method1740(-8843)) {
            if (var1.field427) {
                var1.method104((byte) -71);
            }
        }
        field3693++;
        for (class14 var2 = (class14) class82.field1613.method1737((byte) 74); var2 != null; var2 = (class14) class82.field1613.method1740(-8843)) {
            if (var2.field427) {
                var2.method104((byte) -95);
            }
        }
        if (arg0 <= 112) {
            field3686 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public static void method1458(boolean arg0) {
        field3688 = null;
        field3689 = null;
        field3686 = null;
        if (!arg0) {
            method1456(true, 115, -66);
        }
        field3694 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 46) {
            method1457(32);
        }
        field3691++;
        int var7 = arg3 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg4;
            arg4 = var8;
        }
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return 7 - arg0 - (arg6 - 1);
        } else if (var7 == 2) {
            return 7 + 1 - arg1 - arg4;
        } else {
            return arg0;
        }
    }
}
