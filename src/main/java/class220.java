import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class220 extends class134 {

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "Z")
    public static boolean field3359 = false;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "Lud;")
    public static class2 field3360 = new class2();

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public int field3349;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public int field3350;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public int field3352;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public int field3354;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    public int field3358;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public int field3362;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    public int field3363;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    public int field3364;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
    public int field3367;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "I")
    public int field3368;

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "Lub;")
    public static class92 field3355;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "Lub;")
    public static class92 field3361;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "[I")
    public static int[] field3365;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
    public static void method1506(int arg0) {
        int var1 = -64 / ((arg0 + 62) / 44);
        field3355 = null;
        field3365 = null;
        field3361 = null;
        field3360 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIB)V")
    public static final void method1507(int arg0, int arg1, byte arg2) {
        field3356++;
        class2 var3 = class110.field1695[class130.field1941][arg0][arg1];
        if (var3 == null) {
            class299.method2003(class130.field1941, arg0, arg1);
            return;
        }
        int var4 = -99999999;
        class57 var5 = (class57) var3.method6(-127);
        class57 var6 = null;
        while (var5 != null) {
            class179 var13 = class123.method929(22497, var5.field898.field3900);
            int var14 = var13.field2751;
            if (var13.field2795 == 1) {
                var14 = (var5.field898.field3899 + 1) * var14;
            }
            if (var4 < var14) {
                var4 = var14;
                var6 = var5;
            }
            var5 = (class57) var3.method11((byte) 53);
        }
        if (var6 == null) {
            class299.method2003(class130.field1941, arg0, arg1);
            return;
        }
        if (arg2 <= 16) {
            field3365 = null;
        }
        var3.method10(var6, true);
        class57 var7 = (class57) var3.method6(-118);
        class244 var8 = null;
        class244 var9 = null;
        while (var7 != null) {
            class244 var12 = var7.field898;
            if (var6.field898.field3900 != var12.field3900) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field3900 != var12.field3900 && var9 == null) {
                    var9 = var12;
                }
            }
            var7 = (class57) var3.method11((byte) 21);
        }
        long var10 = (long) ((arg1 << 7) + arg0 + 1610612736);
        class202.method1426(class130.field1941, arg0, arg1, class254.method1721(-580808345, class130.field1941, arg1 * 128 + 64, arg0 * 128 - -64), var6.field898, var10, var8, var9);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZ)V")
    public static final void method1508(int arg0, boolean arg1) {
        class92.field1464.method1166((byte) 23, arg0);
        if (!arg1) {
            method1508(121, false);
        }
        class84.field1257.method1166((byte) 23, arg0);
        class199.field3089.method1166((byte) 23, arg0);
        class156.field2326.method1166((byte) 23, arg0);
        field3366++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBLub;)[Llg;")
    public static final class13[] method1509(int arg0, byte arg1, class92 arg2) {
        field3369++;
        if (arg1 != 105) {
            method1508(12, true);
        }
        return client.method1155(arg0, arg1 - 96, arg2) ? class211.method1470(0) : null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)V")
    public static final void method1510(int arg0, int arg1) {
        if (arg1 != -23670) {
            method1510(-42, -38);
        }
        class121.field1829.method1166((byte) 23, arg0);
        field3357++;
    }
}
