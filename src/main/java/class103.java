import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class103 {

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "[Z")
    public static boolean[] field1386 = new boolean[100];

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "Lgi;")
    public class273 field1391;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "[I")
    public static int[] field1387;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "[I")
    public int[] field1388;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIILv;I)Z")
    public static final boolean method623(int arg0, int arg1, int arg2, int arg3, int arg4, class228 arg5, int arg6) {
        class253 var7 = class159.method1111(arg5.field3644, 47);
        field1385++;
        if (var7.field4126 == -1) {
            return true;
        }
        int var8;
        if (arg5.field3656) {
            int var9 = arg5.field3698 + arg0;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class149 var10 = var7.method1739(arg5.field3658, -625313968, var8);
        if (var10 == null) {
            return false;
        }
        int var11 = arg5.field3655;
        int var12 = arg5.field3714;
        if ((var8 & 0x1) == 1) {
            var11 = arg5.field3714;
            var12 = arg5.field3655;
        }
        if (arg6 < 2) {
            return false;
        }
        int var13 = var10.field2134;
        int var14 = var10.field2142;
        if (var7.field4127) {
            var14 = var11 * 4;
            var13 = var12 * 4;
        }
        if (var7.field4119 == 0) {
            var10.method1027((arg3 * 4) + 48, 48 - -((-var12 + 104 + -arg1) * 4), var14, var13);
        } else {
            var10.method1031(arg3 * 4 + 48, (-arg1 + 104 + -var12) * 4 + 48, var14, var13, var7.field4119);
        }
        return true;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1394++;
        class123 var7 = class247.method1714(arg6, arg5, 0);
        if (arg4 >= -62) {
            return;
        }
        if (var7 != null && var7.field1866 != null) {
            class156 var8 = new class156();
            var8.field2512 = var7.field1866;
            var8.field2516 = var7;
            class296.method1985(var8, 200000);
        }
        class136.field2157 = arg1;
        class78.field984 = arg3;
        class73.field918 = arg2;
        class247.field4076 = true;
        class236.field3913 = arg6;
        class78.field983 = arg0;
        class236.field3911 = arg5;
        class129.method875((byte) -21, var7);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)I")
    public static final int method625(int arg0, int arg1) {
        if (arg1 <= 124) {
            field1386 = null;
        }
        field1389++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZZZI)Leh;")
    public static final class137 method626(int arg0, boolean arg1, boolean arg2, boolean arg3, int arg4) {
        field1393++;
        class107 var5 = null;
        if (class190.field3071 != null) {
            var5 = new class107(arg0, class190.field3071, class16.field200[arg0], 1000000);
        }
        class296.field4682[arg0] = class147.field2303.method1959(90, class39.field488, var5, arg0);
        if (arg4 != 1000000) {
            method623(-26, 54, -39, 125, -38, (class228) null, -39);
        }
        if (arg1) {
            class296.field4682[arg0].method1558((byte) -69);
        }
        return new class137(class296.field4682[arg0], arg2, arg3);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method627(byte arg0) {
        if (arg0 < 118) {
            field1386 = null;
        }
        field1387 = null;
        field1386 = null;
    }
}
