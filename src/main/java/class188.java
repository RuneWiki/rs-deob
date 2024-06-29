import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class188 extends class151 {

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public int field3237;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "Lbd;")
    private static class162 field3235 = class17.method142(0, "Loaded config");

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "Lbd;")
    public static class162 field3238 = field3235;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "[I")
    public static int[] field3236;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V", line = 14)
    public static void method1408(byte arg0) {
        if (arg0 != 76) {
            field3235 = (class162) null;
        }
        field3238 = null;
        field3235 = null;
        field3236 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIILrk;IZJ)Z", line = 26)
    public static final boolean method1409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class255 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class31.field517 == class206.field3473;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class32.field524 || var16 >= class158.field2787) {
                    return false;
                }
                class225 var17 = class288.field4856[arg0][var15][var16];
                if (var17 != null && var17.field3756 >= 5) {
                    return false;
                }
            }
        }
        class43 var18 = new class43();
        var18.field697 = arg11;
        var18.field705 = arg0;
        var18.field700 = arg5;
        var18.field703 = arg6;
        var18.field716 = arg7;
        var18.field712 = arg8;
        var18.field704 = arg9;
        var18.field711 = arg1;
        var18.field699 = arg2;
        var18.field707 = arg1 + arg3 - 1;
        var18.field701 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class288.field4856[var22][var19][var20] == null) {
                        class288.field4856[var22][var19][var20] = new class225(var22, var19, var20);
                    }
                }
                class225 var23 = class288.field4856[arg0][var19][var20];
                var23.field3765[var23.field3756] = var18;
                var23.field3768[var23.field3756] = var21;
                var23.field3769 |= var21;
                var23.field3756++;
                if (var13 && class17.field285[var19][var20] != 0) {
                    var14 = class17.field285[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class17.field285[var24][var25] == 0) {
                        class17.field285[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class98.field1785[class72.field1145++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V", line = 146)
    public class188() {
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V", line = 152)
    public class188(int arg0) {
        this.field3237 = arg0;
    }
}
