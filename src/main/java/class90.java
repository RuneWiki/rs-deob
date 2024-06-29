import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class90 extends class445 {

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public int field1313;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field1311 = 0;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "Lh;")
    public static class434 field1314 = new class434(77, 12);

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "[Lcm;")
    public static class472[] field1319 = new class472[5];

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field1317 = 0;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "Z")
    public static boolean field1315;

    static {
        for (int var0 = 0; var0 < field1319.length; var0++) {
            field1319[var0] = new class472();
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLnh;)I", line = 3)
    public static final int method577(boolean arg0, class487 arg1) {
        field1318++;
        int var2 = arg1.field6745;
        class280 var3 = arg1.method549(-98);
        if (arg0) {
            return -15;
        }
        if (arg1.field1111) {
            var2 = arg1.field6744;
        } else if (arg1.field1122 == var3.field3717 || arg1.field1122 == var3.field3753 || arg1.field1122 == var3.field3763 || arg1.field1122 == var3.field3726) {
            var2 = arg1.field6776;
        } else if (arg1.field1122 == var3.field3719 || arg1.field1122 == var3.field3761 || arg1.field1122 == var3.field3722 || arg1.field1122 == var3.field3741) {
            var2 = arg1.field6765;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIB)V", line = 32)
    public static final void method578(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var6 = -19 / ((-arg5 - 71) / 49);
        field1312++;
        int var7 = arg1 - arg2;
        int var8 = arg0 - arg3;
        if (var7 == 0) {
            if (var8 != 0) {
                class375.method2302(arg0, (byte) -7, arg3, arg4, arg2);
            }
        } else if (var8 == 0) {
            class450.method2645(arg2, arg4, false, arg3, arg1);
        } else {
            int var9 = (var8 << 12) / var7;
            int var10 = arg3 - (arg2 * var9 >> 12);
            int var11;
            int var12;
            if (class425.field5751 > arg2) {
                var11 = class425.field5751;
                var12 = (class425.field5751 * var9 >> 12) + var10;
            } else if (class136.field1985 < arg2) {
                var11 = class136.field1985;
                var12 = (class136.field1985 * var9 >> 12) + var10;
            } else {
                var12 = arg3;
                var11 = arg2;
            }
            int var13;
            int var14;
            if (arg1 < class425.field5751) {
                var14 = (class425.field5751 * var9 >> 12) + var10;
                var13 = class425.field5751;
            } else if (arg1 <= class136.field1985) {
                var13 = arg1;
                var14 = arg0;
            } else {
                var14 = (class136.field1985 * var9 >> 12) + var10;
                var13 = class136.field1985;
            }
            if (class221.field2942 > var14) {
                var14 = class221.field2942;
                var13 = (class221.field2942 - var10 << 12) / var9;
            } else if (class205.field2784 < var14) {
                var13 = (class205.field2784 - var10 << 12) / var9;
                var14 = class205.field2784;
            }
            if (var12 < class221.field2942) {
                var12 = class221.field2942;
                var11 = (class221.field2942 - var10 << 12) / var9;
            } else if (class205.field2784 < var12) {
                var11 = (class205.field2784 - var10 << 12) / var9;
                var12 = class205.field2784;
            }
            class128.method788(var13, var11, -83, var14, var12, arg4);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 133)
    public static void method579(int arg0) {
        field1319 = null;
        field1314 = null;
        if (arg0 != 0) {
            method578(95, -68, -23, 80, -36, (byte) -94);
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(II)V", line = 156)
    public class90(int arg0, int arg1) {
        this.field1316 = arg1;
        this.field1313 = arg0;
    }
}
