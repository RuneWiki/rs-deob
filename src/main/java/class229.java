import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class229 {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field3182 = 0;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lfi;")
    public static class166 field3187 = new class166();

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "[I")
    public static int[] field3181;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIBII)V")
    public static final void method1538(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field3188++;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg5 * arg5;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        if (arg3 != 126) {
            field3184 = 81;
        }
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg4 - 1) * var15;
        if (class39.field595 <= arg0 && arg0 <= class134.field1917) {
            int var21 = class359.method2251(class69.field1047, arg2 + arg5, 72, class433.field6144);
            int var22 = class359.method2251(class69.field1047, arg2 - arg5, 125, class433.field6144);
            class396.method2436(-1070, arg1, var22, class186.field2697[arg0], var21);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var17 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var7--;
            var20 -= var15;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            if (var24 >= class39.field595 && var23 <= class134.field1917) {
                int var25 = class359.method2251(class69.field1047, arg2 + var6, 84, class433.field6144);
                int var26 = class359.method2251(class69.field1047, arg2 - var6, -68, class433.field6144);
                if (class39.field595 <= var23) {
                    class396.method2436(arg3 ^ 0xFFFFFBAC, arg1, var26, class186.field2697[var23], var25);
                }
                if (var24 <= class134.field1917) {
                    class396.method2436(arg3 - 1196, arg1, var26, class186.field2697[var24], var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    public static final void method1539(int arg0, int arg1) {
        if (arg1 != -1316648191) {
            field3184 = -104;
        }
        field3186++;
        class450 var2 = class59.method540(14, arg0, 1000);
        var2.method2798(arg1 + 652119213);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method1540(int arg0) {
        if (arg0 == -2139360062) {
            field3187 = null;
            field3181 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IJ)V")
    public static final void method1541(int arg0, long arg1) {
        field3183++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class76.method654(arg1 - 1L, (byte) 63);
            class76.method654(1L, (byte) 57);
        } else {
            class76.method654(arg1, (byte) 106);
        }
        if (arg0 <= 55) {
            method1539(-72, 45);
        }
    }
}
