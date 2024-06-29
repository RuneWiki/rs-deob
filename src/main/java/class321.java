import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public abstract class class321 {

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "Lgf;")
    public static class46 field4982 = new class46("", 16);

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "[I")
    public static int[] field4987;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
    public static void method2144(int arg0) {
        if (arg0 == 0) {
            field4987 = null;
            field4982 = null;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIIIIIIIBII)V")
    public static final void method2145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte arg11, int arg12, int arg13) {
        field4984++;
        if (class53.field732 == null) {
            return;
        }
        class55 var14 = null;
        if (arg7 < 0) {
            int var15 = -arg7 - 1;
            if (class528.field7772 == var15) {
                var14 = class358.field5565;
            } else {
                var14 = class264.field4276[var15];
            }
        } else {
            int var16 = arg7 - 1;
            class38 var17 = (class38) class365.field5659.method1122((byte) 59, (long) var16);
            if (var17 != null) {
                var14 = var17.field378;
            }
        }
        if (var14 == null) {
            return;
        }
        class156 var18 = class454.field7029.method3002(-1, arg12);
        int var19;
        int var20;
        if (arg10 == 1 || arg10 == 3) {
            var20 = var18.field2139;
            var19 = var18.field2123;
        } else {
            var19 = var18.field2139;
            var20 = var18.field2123;
        }
        int var21 = (var19 >> 1) + arg8;
        int var22 = (var19 + 1 >> 1) + arg8;
        int var23 = arg13 + (var20 >> 1);
        int var24 = arg13 + (var20 + 1 >> 1);
        class223 var25 = class53.field732[arg1];
        int var26 = var25.method688(var21, var23) - (-var25.method688(var22, var23) - var25.method688(var21, var24)) + var25.method688(var22, var24) >> 2;
        class45 var27 = new class45();
        var27.field587 = arg12;
        var27.field581 = arg10;
        var27.field578 = class88.field1278 + arg5;
        if (arg0 > arg6) {
            int var28 = arg0;
            arg0 = arg6;
            arg6 = var28;
        }
        var27.field590 = arg9;
        var27.field579 = arg13;
        var27.field592 = var14.field6419;
        var27.field594 = arg8;
        var27.field576 = class88.field1278 + arg3;
        if (arg2 > arg4) {
            int var29 = arg2;
            arg2 = arg4;
            arg4 = var29;
        }
        var27.field593 = arg0 + arg8;
        var27.field591 = arg6 + arg8;
        var27.field577 = arg2 + arg13;
        var27.field585 = (var27.field579 << 7) + (var20 << 6);
        var27.field589 = var26;
        var27.field582 = (var27.field594 << 7) + (var19 << 6);
        var27.field584 = arg4 + arg13;
        class49.field626.method2124(var27, (byte) 96);
        var14.field890 = var27;
        if (arg11 != 76) {
            field4985 = 5;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(CB)Z")
    public static final boolean method2146(char arg0, byte arg1) {
        int var2 = -21 % ((arg1 + 34) / 57);
        field4986++;
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIII)I")
    public static final int method2147(int arg0, int arg1, int arg2, int arg3) {
        field4983++;
        if (class213.field3643 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        if (arg1 < 102) {
            return 120;
        }
        int var6 = arg2 - class194.field2883;
        int var7 = arg3 - class194.field2900;
        for (class224 var8 = (class224) class194.field2876.method2123(88); var8 != null; var8 = (class224) class194.field2876.method2126((byte) 61)) {
            if (var8.field3759 == arg0) {
                int var9 = var8.field3758;
                int var10 = var8.field3763;
                int var11 = var10 + class194.field2900 | class194.field2883 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var5 > var12) {
                    var5 = var12;
                    var4 = var11;
                }
            }
        }
        return var4;
    }

    static {
        new class213(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
        field4988 = 0;
    }
}
