import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class171 {

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field2586 = 0;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2585 = "shake:";

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field2587 = 0;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[I")
    public static int[] field2588 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIILnh;IZJ)Z")
    public static final boolean method1230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class55 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class233.field3684 == class166.field2507;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class235.field3716 || var24 >= class291.field4515) {
                    return false;
                }
                class22 var25 = class149.field2210[arg0][var15][var24];
                if (var25 != null && var25.field371 >= 5) {
                    return false;
                }
            }
        }
        class19 var16 = new class19();
        var16.field267 = arg11;
        var16.field254 = arg0;
        var16.field256 = arg5;
        var16.field264 = arg6;
        var16.field253 = arg7;
        var16.field266 = arg8;
        var16.field257 = arg9;
        var16.field255 = arg1;
        var16.field258 = arg2;
        var16.field261 = arg1 + arg3 - 1;
        var16.field260 = arg2 + arg4 - 1;
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
                    if (class149.field2210[var22][var17][var20] == null) {
                        class149.field2210[var22][var17][var20] = new class22(var22, var17, var20);
                    }
                }
                class22 var23 = class149.field2210[arg0][var17][var20];
                var23.field355[var23.field371] = var16;
                var23.field367[var23.field371] = var21;
                var23.field378 |= var21;
                var23.field371++;
                if (var13 && class240.field3831[var17][var20] != 0) {
                    var14 = class240.field3831[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class240.field3831[var18][var19] == 0) {
                        class240.field3831[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class246.field3916[class296.field4676++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method1231(int arg0) {
        field2585 = null;
        field2588 = null;
        if (arg0 <= 21) {
            field2585 = null;
        }
    }
}
