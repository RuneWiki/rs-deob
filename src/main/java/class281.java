import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class281 extends class513 {

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lvg;")
    public static class49 field3811 = new class49();

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Loe;")
    public static class183 field3812 = new class183();

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Lvk;")
    public static class337 field3813;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "[[[Lcq;")
    public static class433[][][] field3808;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method1689(int arg0) {
        field3808 = null;
        int var1 = -17 / ((84 - arg0) / 39);
        field3813 = null;
        field3812 = null;
        field3811 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1690(boolean arg0, String[] arg1) {
        if (!arg0) {
            field3813 = null;
        }
        field3806++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method1691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3810++;
        int var7 = arg0 + arg6;
        int var8 = arg1 + arg4;
        int var9 = arg3 + arg5;
        if (!class201.method1227(var8, var8, var9, arg6, var9, 4637, var8, arg6, arg3, var7)) {
            return false;
        }
        if (arg2 != -6) {
            field3814 = -11;
        }
        if (!class201.method1227(var8, var8, arg3, arg6, var9, 4637, var8, var7, arg3, var7)) {
            return false;
        }
        if (class53.field856 <= arg6) {
            if (!class201.method1227(var8, var8, arg3, var7, var9, arg2 + 4643, arg1, var7, var9, var7)) {
                return false;
            }
            if (!class201.method1227(var8, arg1, arg3, var7, arg3, 4637, arg1, var7, var9, var7)) {
                return false;
            }
        } else if (!class201.method1227(var8, var8, arg3, arg6, var9, 4637, arg1, arg6, var9, arg6)) {
            return false;
        } else if (!class201.method1227(var8, arg1, arg3, arg6, arg3, arg2 ^ 0xFFFFEDE7, arg1, arg6, var9, arg6)) {
            return false;
        }
        if (class206.field2469 > arg3) {
            if (!class201.method1227(var8, var8, arg3, arg6, arg3, 4637, arg1, arg6, arg3, var7)) {
                return false;
            }
            if (!class201.method1227(var8, arg1, arg3, arg6, arg3, 4637, arg1, var7, arg3, var7)) {
                return false;
            }
        } else if (!class201.method1227(var8, var8, var9, arg6, var9, 4637, arg1, arg6, var9, var7)) {
            return false;
        } else if (!class201.method1227(var8, arg1, var9, arg6, var9, 4637, arg1, var7, var9, var7)) {
            return false;
        }
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(II)V")
    public class281(int arg0, int arg1) {
        this.field3807 = arg0;
        this.field3809 = arg1;
    }
}
