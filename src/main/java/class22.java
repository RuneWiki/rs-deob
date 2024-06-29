import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class22 {

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field409 = 2;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "Lsg;")
    private static class30 field418 = class167.method1221((byte) 33, "Cancel");

    @OriginalMember(owner = "client!na", name = "s", descriptor = "Lsg;")
    public static class30 field416 = field418;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "[I")
    public static int[] field419 = new int[50];

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public int field405;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public int field422;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
    public static void method203(boolean arg0) {
        field418 = null;
        field419 = null;
        field416 = null;
        if (arg0) {
            method205(64);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lni;IIIII)V")
    public static final void method204(class20 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class182.field3347 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class209.field3759) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class44.field1050 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class195 var14 = class71.field1613[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class242.field4333[var11][var12 + 1][var13] + class242.field4333[var11][var12][var13] + class242.field4333[var11][var12][var13 + 1] + class242.field4333[var11][var12 + 1][var13 + 1]) / 4 - (class242.field4333[arg1][arg2 + 1][arg3] + class242.field4333[arg1][arg2][arg3] + class242.field4333[arg1][arg2][arg3 + 1] + class242.field4333[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class225 var16 = var14.field3532;
                                    if (var16 != null) {
                                        if (var16.field4031.method192()) {
                                            arg0.method196(var16.field4031, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field4029 != null && var16.field4029.method192()) {
                                            arg0.method196(var16.field4029, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3522; var17++) {
                                        class35 var18 = var14.field3540[var17];
                                        if (var18 != null && var18.field857.method192() && (var18.field854 == var12 || var7 == var12) && (var18.field856 == var13 || var9 == var13)) {
                                            int var19 = var18.field844 + 1 - var18.field854;
                                            int var20 = var18.field853 + 1 - var18.field856;
                                            arg0.method196(var18.field857, (var18.field854 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field856 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static final void method205(int arg0) {
        field398++;
        class234.field4165.method1650(104);
        if (arg0 <= 95) {
            method204((class20) null, -68, -43, 59, 23, -62);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIILni;IJZ)Z")
    public static final boolean method206(int arg0, int arg1, int arg2, int arg3, int arg4, class20 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class203.method1434(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }
}
