import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class225 {

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public int field3784 = -1;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Lia;")
    public static class257 field3776 = class28.method234(122, "<)4col>");

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "[Z")
    public static boolean[] field3777 = new boolean[5];

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field3779 = 0;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Lia;")
    private static class257 field3780 = class28.method234(103, "Type");

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "[I")
    public static int[] field3785 = new int[5];

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "[J")
    public static long[] field3786 = new long[32];

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lia;")
    public static class257 field3781 = field3780;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lbk;")
    public class19 field3783;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Ljava/awt/Image;")
    public static Image field3775;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "[I")
    public int[] field3782;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[Lia;")
    public class257[] field3774;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIILij;IZJ)Z")
    public static final boolean method1472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class166 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class243.field4208 == class152.field2673;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class140.field2491 || var24 >= class73.field1427) {
                    return false;
                }
                class177 var25 = class75.field1463[arg0][var15][var24];
                if (var25 != null && var25.field3012 >= 5) {
                    return false;
                }
            }
        }
        class154 var16 = new class154();
        var16.field2702 = arg11;
        var16.field2699 = arg0;
        var16.field2697 = arg5;
        var16.field2696 = arg6;
        var16.field2691 = arg7;
        var16.field2698 = arg8;
        var16.field2694 = arg9;
        var16.field2693 = arg1;
        var16.field2688 = arg2;
        var16.field2695 = arg1 + arg3 - 1;
        var16.field2700 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class75.field1463[var22][var17][var20] == null) {
                        class75.field1463[var22][var17][var20] = new class177(var22, var17, var20);
                    }
                }
                class177 var23 = class75.field1463[arg0][var17][var20];
                var23.field3017[var23.field3012] = var16;
                var23.field3027[var23.field3012] = var21;
                var23.field3010 |= var21;
                var23.field3012++;
                if (var13 && class178.field3085[var17][var20] != 0) {
                    var14 = class178.field3085[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class178.field3085[var18][var19] == 0) {
                        class178.field3085[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class198.field3388[class253.field4356++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public static void method1473(boolean arg0) {
        if (!arg0) {
            method1473(false);
        }
        field3780 = null;
        field3781 = null;
        field3777 = null;
        field3785 = null;
        field3776 = null;
        field3786 = null;
        field3775 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIB)V")
    public static final void method1474(int arg0, int arg1, int arg2, byte arg3) {
        field3787++;
        class44 var4 = class148.method996(arg0, -1, arg1);
        if (var4 != null && var4.field944 != null) {
            class164 var5 = new class164();
            var5.field2867 = var4.field944;
            var5.field2864 = var4;
            class57.method441(var5, -10305);
        }
        class257.field4404 = true;
        int var6 = -118 / ((32 - arg3) / 58);
        class76.field1491 = arg2;
        class10.field191 = arg1;
        class29.field556 = arg0;
        class257.method1718(false, var4);
    }
}
