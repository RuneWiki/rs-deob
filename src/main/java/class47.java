import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class class47 {

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field712 = -1;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "[Lmd;")
    public static class233[] field715 = new class233[14];

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Lka;")
    public static class379 field709;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "[I")
    public static int[] field710;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method333(String arg0, byte arg1) {
        field717++;
        if (arg1 != -128) {
            method336(-46, -89, 24, 57, 35, -19, 117);
        }
        for (int var2 = 0; var2 < class113.field1465.length; var2++) {
            if (class113.field1465[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public abstract void method334(byte arg0);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method335(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        field713++;
        if (arg1 < 1) {
            arg1 = 1;
        }
        int var6 = arg1 - 334;
        if (arg0 < ~var6) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class39.field581 - class1.field2) * var6 / 100 + class1.field2;
        if (var7 < class331.field4876) {
            var7 = class331.field4876;
        } else if (class378.field5528 < var7) {
            var7 = class378.field5528;
        }
        int var8 = arg1 * 512 * var7 / (arg4 * 334);
        if (var8 < class95.field1281) {
            short var12 = class95.field1281;
            var7 = var12 * 334 * arg4 / (arg1 * 512);
            if (var7 > class378.field5528) {
                var7 = class378.field5528;
                int var13 = arg1 * var7 * 512 / (var12 * 334);
                int var14 = (arg4 - var13) / 2;
                if (arg5) {
                    class126.field1647.method472();
                    class126.field1647.method2023(arg1, arg2, arg3, -11682, var14, -16777216);
                    class126.field1647.method2023(arg1, arg2 + arg4 - var14, arg3, -11682, var14, -16777216);
                }
                arg2 += var14;
                arg4 -= var14 * 2;
            }
        } else if (class159.field1998 < var8) {
            short var9 = class159.field1998;
            var7 = arg4 * 334 * var9 / (arg1 * 512);
            if (class331.field4876 > var7) {
                var7 = class331.field4876;
                int var10 = arg4 * var9 * 334 / (var7 * 512);
                int var11 = (arg1 - var10) / 2;
                if (arg5) {
                    class126.field1647.method472();
                    class126.field1647.method2023(var11, arg2, arg3, -11682, arg4, -16777216);
                    class126.field1647.method2023(var11, arg2, arg1 + arg3 - var11, -11682, arg4, -16777216);
                }
                arg1 -= var11 * 2;
                arg3 += var11;
            }
        }
        class132.field1724 = arg3;
        class366.field5406 = (short) arg4;
        class27.field472 = arg1 * var7 / 334;
        class383.field5611 = (short) arg1;
        class162.field2118 = arg2;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIII)I")
    public static final int method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 18315) {
            method338((byte) -85);
        }
        if ((arg4 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg1;
            arg1 = var7;
        }
        field708++;
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 7 - arg5 - (arg2 + -1);
        } else {
            return 1 + 7 - arg1 - arg3;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)I")
    public abstract int method337(int arg0, boolean arg1);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
    public static void method338(byte arg0) {
        if (arg0 != -18) {
            method336(-67, -16, -86, -46, -13, -97, -32);
        }
        field710 = null;
        field715 = null;
        field709 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)J")
    public abstract long method339(boolean arg0);
}
