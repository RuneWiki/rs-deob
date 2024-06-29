import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class334 {

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "[I")
    public int[] field4379 = new int[100];

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "[Lor;")
    public class451[] field4380 = new class451[8];

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "[Ldm;")
    public class37[] field4384 = new class37[100];

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "[I")
    public int[] field4385 = new int[3];

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Z")
    public static boolean field4377 = false;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public int field4383;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field4382;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Z")
    public static boolean field4378;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZI)V")
    public static final void method1914(int arg0, boolean arg1, int arg2) {
        field4381++;
        class32 var3 = class222.method1397(arg1, arg0, false);
        if (var3 != null) {
            if (arg2 <= 61) {
                method1914(-61, false, 13);
            }
            var3.method300(false);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILqa;ILcr;IIILea;)V")
    public static final void method1915(int arg0, int arg1, class162 arg2, int arg3, class403 arg4, int arg5, int arg6, int arg7, class381 arg8) {
        field4386++;
        class460 var9 = class267.field3522.method1014(arg0, -22947);
        if (var9 != null && var9.field6328 && var9.method2621(0, class301.field3980)) {
            if (var9.field6330 != null) {
                int[] var10 = new int[var9.field6330.length];
                for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                    int var13;
                    if (class42.field623 == 4) {
                        var13 = (int) class184.field2621 & 0x3FFF;
                    } else {
                        var13 = (int) class184.field2621 + class361.field4871 & 0x3FFF;
                    }
                    int var14 = class305.field4019[var13];
                    int var15 = class305.field4022[var13];
                    if (class42.field623 != 4) {
                        var15 = var15 * 256 / (class514.field7589 + 256);
                        var14 = var14 * 256 / (class514.field7589 + 256);
                    }
                    var10[var11 * 2] = ((var9.field6330[var11 * 2] * 4 + arg7) * var15 + (var9.field6330[var11 * 2 + 1] * 4 + arg5) * var14 >> 15) + arg4.field5450 / 2 + arg3;
                    var10[var11 * 2 + 1] = arg4.field5404 / 2 + arg1 - ((arg5 - -(var9.field6330[var11 * 2 + 1] * 4)) * var15 + -((var9.field6330[var11 * 2] * 4 + arg7) * var14) >> 15);
                }
                class531.method3128(arg2, var10, var9.field6324, arg4.field5514, arg4.field5490);
                for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                    arg2.method553(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field6356, 1, arg8, arg3, arg1);
                }
                arg2.method553(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field6356, 1, arg8, arg3, arg1);
            }
            class529 var16 = null;
            if (var9.field6364 != -1) {
                var16 = var9.method2614(49783229, arg2, false);
                if (var16 != null) {
                    class482.method2778(arg3, arg4, arg5, var16, arg1, arg8, true, arg7);
                }
            }
            if (var9.field6352 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method161();
                }
                class489 var18 = class30.field508;
                class425 var19 = class433.field5928;
                if (var9.field6327 == 1) {
                    var18 = class302.field3995;
                    var19 = client.field2732;
                }
                if (var9.field6327 == 2) {
                    var18 = class219.field2961;
                    var19 = class173.field2525;
                }
                class236.method1464(arg1, arg5, arg7, var9.field6359, var18, var17, var9.field6352, arg4, var19, arg3, (byte) 81, arg8);
            }
        }
        if (arg6 != 0) {
            field4377 = false;
        }
    }
}
