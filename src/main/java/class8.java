import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DEVPLWNC")
public class class8 extends class2 {

    @OriginalMember(owner = "client!DEVPLWNC", name = "h", descriptor = "I")
    private static int field577 = 404;

    @OriginalMember(owner = "client!DEVPLWNC", name = "i", descriptor = "I")
    private static int field578 = 404;

    @OriginalMember(owner = "client!DEVPLWNC", name = "j", descriptor = "I")
    private static int field579 = 562;

    @OriginalMember(owner = "client!DEVPLWNC", name = "k", descriptor = "Z")
    private static boolean field580 = true;

    @OriginalMember(owner = "client!DEVPLWNC", name = "m", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!DEVPLWNC", name = "n", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!DEVPLWNC", name = "o", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!DEVPLWNC", name = "p", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!DEVPLWNC", name = "q", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!DEVPLWNC", name = "r", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!DEVPLWNC", name = "s", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!DEVPLWNC", name = "t", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!DEVPLWNC", name = "u", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!DEVPLWNC", name = "v", descriptor = "Z")
    public static boolean field591;

    @OriginalMember(owner = "client!DEVPLWNC", name = "l", descriptor = "[I")
    public static int[] field581;

    @OriginalMember(owner = "client!DEVPLWNC", name = "a", descriptor = "([IIIZ)V")
    public static void method159(int[] arg0, int arg1, int arg2, boolean arg3) {
        field581 = arg0;
        field582 = arg1;
        field583 = arg2;
        method161(arg1, 0, arg2, field577, 0);
        if (!arg3) {
            ;
        }
    }

    @OriginalMember(owner = "client!DEVPLWNC", name = "a", descriptor = "(I)V")
    public static void method160(int arg0) {
        field586 = 0;
        field584 = 0;
        field587 = field582;
        field585 = field583;
        field588 = field587 - 1;
        field589 = field587 / 2;
        int var1 = 88 / arg0;
    }

    @OriginalMember(owner = "client!DEVPLWNC", name = "a", descriptor = "(IIIII)V")
    public static void method161(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg0 > field582) {
            arg0 = field582;
        }
        if (arg2 > field583) {
            arg2 = field583;
        }
        field586 = arg1;
        field584 = arg4;
        if (arg3 <= 0) {
            return;
        }
        field587 = arg0;
        field585 = arg2;
        field588 = field587 - 1;
        field589 = field587 / 2;
        field590 = field585 / 2;
    }

    @OriginalMember(owner = "client!DEVPLWNC", name = "b", descriptor = "(I)V")
    public static void method162(int arg0) {
        int var1 = field583 * field582;
        if (arg0 < 0 || arg0 > 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        for (int var3 = 0; var3 < var1; var3++) {
            field581[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!DEVPLWNC", name = "a", descriptor = "(ZIIIIII)V")
    public static void method163(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 < field586) {
            arg4 -= field586 - arg5;
            arg5 = field586;
        }
        if (arg2 < field584) {
            arg3 -= field584 - arg2;
            arg2 = field584;
        }
        if (arg4 + arg5 > field587) {
            arg4 = field587 - arg5;
        }
        if (arg2 + arg3 > field585) {
            arg3 = field585 - arg2;
        }
        int var7 = 256 - arg1;
        int var8 = (arg6 >> 16 & 0xFF) * arg1;
        int var9 = (arg6 >> 8 & 0xFF) * arg1;
        int var10 = (arg6 & 0xFF) * arg1;
        if (!arg0) {
            return;
        }
        int var11 = field582 - arg4;
        int var12 = field582 * arg2 + arg5;
        for (int var13 = 0; var13 < arg3; var13++) {
            for (int var14 = -arg4; var14 < 0; var14++) {
                int var15 = (field581[var12] >> 16 & 0xFF) * var7;
                int var16 = (field581[var12] >> 8 & 0xFF) * var7;
                int var17 = (field581[var12] & 0xFF) * var7;
                int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
                field581[var12++] = var18;
            }
            var12 += var11;
        }
    }

    @OriginalMember(owner = "client!DEVPLWNC", name = "a", descriptor = "(IIIIII)V")
    public static void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 21899) {
            return;
        }
        if (arg3 < field586) {
            arg4 -= field586 - arg3;
            arg3 = field586;
        }
        if (arg5 < field584) {
            arg2 -= field584 - arg5;
            arg5 = field584;
        }
        if (arg3 + arg4 > field587) {
            arg4 = field587 - arg3;
        }
        if (arg2 + arg5 > field585) {
            arg2 = field585 - arg5;
        }
        int var6 = field582 - arg4;
        int var7 = field582 * arg5 + arg3;
        for (int var8 = -arg2; var8 < 0; var8++) {
            for (int var9 = -arg4; var9 < 0; var9++) {
                field581[var7++] = arg0;
            }
            var7 += var6;
        }
    }

    @OriginalMember(owner = "client!DEVPLWNC", name = "b", descriptor = "(IIIIII)V")
    public static void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method167(arg1, arg5, 0, arg0, arg3);
        method167(arg1, arg5, 0, arg0, arg3 + arg4 - 1);
        method169(7, arg3, arg1, arg0, arg4);
        method169(7, arg3, arg1 + arg5 - 1, arg0, arg4);
        if (arg2 == -13126) {
            ;
        }
    }

    @OriginalMember(owner = "client!DEVPLWNC", name = "a", descriptor = "(IIZIIII)V")
    public static void method166(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        method168(arg1, (byte) 8, arg3, arg4, arg0, arg5);
        if (!arg2) {
            field577 = 184;
        }
        method168(arg1, (byte) 8, arg3, arg4 + arg6 - 1, arg0, arg5);
        if (arg6 >= 3) {
            method170(arg1, arg0, 16230, arg6 - 2, arg3, arg4 + 1);
            method170(arg1, arg0, 16230, arg6 - 2, arg3 + arg5 - 1, arg4 + 1);
        }
    }

    @OriginalMember(owner = "client!DEVPLWNC", name = "b", descriptor = "(IIIII)V")
    public static void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < field584 || arg4 >= field585) {
            return;
        }
        if (arg0 < field586) {
            arg1 -= field586 - arg0;
            arg0 = field586;
        }
        if (arg0 + arg1 > field587) {
            arg1 = field587 - arg0;
        }
        int var5 = field582 * arg4 + arg0;
        if (arg2 == 0) {
            for (int var6 = 0; var6 < arg1; var6++) {
                field581[var5 + var6] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!DEVPLWNC", name = "a", descriptor = "(IBIIII)V")
    public static void method168(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < field584 || arg3 >= field585) {
            return;
        }
        if (arg2 < field586) {
            arg5 -= field586 - arg2;
            arg2 = field586;
        }
        if (arg2 + arg5 > field587) {
            arg5 = field587 - arg2;
        }
        int var6 = 256 - arg4;
        if (arg1 == 8) {
            boolean var7 = false;
        } else {
            field578 = -149;
        }
        int var8 = (arg0 >> 16 & 0xFF) * arg4;
        int var9 = (arg0 >> 8 & 0xFF) * arg4;
        int var10 = (arg0 & 0xFF) * arg4;
        int var11 = field582 * arg3 + arg2;
        for (int var12 = 0; var12 < arg5; var12++) {
            int var13 = (field581[var11] >> 16 & 0xFF) * var6;
            int var14 = (field581[var11] >> 8 & 0xFF) * var6;
            int var15 = (field581[var11] & 0xFF) * var6;
            int var16 = (var10 + var15 >> 8) + (var8 + var13 >> 8 << 16) + (var9 + var14 >> 8 << 8);
            field581[var11++] = var16;
        }
    }

    @OriginalMember(owner = "client!DEVPLWNC", name = "c", descriptor = "(IIIII)V")
    public static void method169(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 7 || arg0 > 7 || (arg2 < field586 || arg2 >= field587)) {
            return;
        }
        if (arg1 < field584) {
            arg4 -= field584 - arg1;
            arg1 = field584;
        }
        if (arg1 + arg4 > field585) {
            arg4 = field585 - arg1;
        }
        int var5 = field582 * arg1 + arg2;
        for (int var6 = 0; var6 < arg4; var6++) {
            field581[field582 * var6 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!DEVPLWNC", name = "c", descriptor = "(IIIIII)V")
    public static void method170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 16230) {
            field580 = !field580;
        }
        if (arg4 < field586 || arg4 >= field587) {
            return;
        }
        if (arg5 < field584) {
            arg3 -= field584 - arg5;
            arg5 = field584;
        }
        if (arg3 + arg5 > field585) {
            arg3 = field585 - arg5;
        }
        int var6 = 256 - arg1;
        int var7 = (arg0 >> 16 & 0xFF) * arg1;
        int var8 = (arg0 >> 8 & 0xFF) * arg1;
        int var9 = (arg0 & 0xFF) * arg1;
        int var10 = field582 * arg5 + arg4;
        for (int var11 = 0; var11 < arg3; var11++) {
            int var12 = (field581[var10] >> 16 & 0xFF) * var6;
            int var13 = (field581[var10] >> 8 & 0xFF) * var6;
            int var14 = (field581[var10] & 0xFF) * var6;
            int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
            field581[var10] = var15;
            var10 += field582;
        }
    }
}
