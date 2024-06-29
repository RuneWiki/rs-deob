import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class46 {

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field578 = 0;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field581 = 0;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field582 = 0;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field583 = 0;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "[I")
    public static int[] field577;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "[I")
    public static int[] field584;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "[I")
    public static int[] field585;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)V", line = 7)
    private static final void method298(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method308(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field583) {
            var4 = field583;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field581) {
            var5 = field581;
        }
        int var6 = var4;
        int var7 = arg2 * arg2;
        int var8 = 0;
        int var9 = arg1 - var4;
        int var10 = var9 * var9;
        int var11 = var10 - var9;
        if (arg1 > var5) {
            arg1 = var5;
        }
        while (var6 < arg1) {
            while (var11 <= var7 || var10 <= var7) {
                var10 += var8 + var8;
                var11 += var8++ + var8;
            }
            int var12 = arg0 + 1 - var8;
            if (var12 < field582) {
                var12 = field582;
            }
            int var13 = arg0 + var8;
            if (var13 > field578) {
                var13 = field578;
            }
            int var14 = field580 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field577[var14++] = arg3;
            }
            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
        }
        int var16 = arg2;
        int var17 = var6 - arg1;
        int var18 = var17 * var17 + var7;
        int var19 = var18 - arg2;
        int var20 = var18 - var17;
        while (var6 < var5) {
            while (var20 > var7 && var19 > var7) {
                var20 -= var16-- + var16;
                var19 -= var16 + var16;
            }
            int var21 = arg0 - var16;
            if (var21 < field582) {
                var21 = field582;
            }
            int var22 = arg0 + var16;
            if (var22 > field578 - 1) {
                var22 = field578 - 1;
            }
            int var23 = field580 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field577[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIII)V", line = 114)
    public static final void method299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        int var8 = var6 >= 0 ? var6 : -var6;
        int var9 = var7 >= 0 ? var7 : -var7;
        int var10 = var8;
        if (var8 < var9) {
            var10 = var9;
        }
        if (var10 == 0) {
            return;
        }
        int var11 = (var6 << 16) / var10;
        int var12 = (var7 << 16) / var10;
        if (var12 <= var11) {
            var11 = -var11;
        } else {
            var12 = -var12;
        }
        int var13 = arg5 * var12 >> 17;
        int var14 = arg5 * var12 + 1 >> 17;
        int var15 = arg5 * var11 >> 17;
        int var16 = arg5 * var11 + 1 >> 17;
        int var17 = arg0 - class148.method1053();
        int var18 = arg1 - class148.method1063();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class148.method1066(var19, var20, var21);
        class148.method1064(var23, var24, var25, var19, var20, var21, arg4);
        class148.method1066(var19, var21, var22);
        class148.method1064(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()V", line = 171)
    public static final void method300() {
        field582 = 0;
        field583 = 0;
        field578 = field580;
        field581 = field579;
        method320();
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IIII)V", line = 179)
    public static final void method301(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field580) {
            arg2 = field580;
        }
        if (arg3 > field579) {
            arg3 = field579;
        }
        field582 = arg0;
        field583 = arg1;
        field578 = arg2;
        field581 = arg3;
        method320();
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()V", line = 200)
    public static final void method302() {
        int var0 = 0;
        int var1 = field580 * field579 - 7;
        while (var0 < var1) {
            field577[var0++] = 0;
            field577[var0++] = 0;
            field577[var0++] = 0;
            field577[var0++] = 0;
            field577[var0++] = 0;
            field577[var0++] = 0;
            field577[var0++] = 0;
            field577[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field577[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(IIII)V", line = 224)
    public static final void method303(int arg0, int arg1, int arg2, int arg3) {
        if (field582 < arg0) {
            field582 = arg0;
        }
        if (field583 < arg1) {
            field583 = arg1;
        }
        if (field578 > arg2) {
            field578 = arg2;
        }
        if (field581 > arg3) {
            field581 = arg3;
        }
        method320();
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IIIIII)V", line = 241)
    public static final void method304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method310(arg0, arg1, arg2, arg4, arg5);
        method310(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method315(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method315(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIII)V", line = 252)
    public static final void method305(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method298(arg0, arg1, arg2, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < field583) {
            var9 = field583;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field581) {
            var10 = field581;
        }
        int var11 = var9;
        int var12 = arg2 * arg2;
        int var13 = 0;
        int var14 = arg1 - var9;
        int var15 = var14 * var14;
        int var16 = var15 - var14;
        if (arg1 > var10) {
            arg1 = var10;
        }
        while (var11 < arg1) {
            while (var16 <= var12 || var15 <= var12) {
                var15 += var13 + var13;
                var16 += var13++ + var13;
            }
            int var17 = arg0 + 1 - var13;
            if (var17 < field582) {
                var17 = field582;
            }
            int var18 = arg0 + var13;
            if (var18 > field578) {
                var18 = field578;
            }
            int var19 = field580 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field577[var19] >> 16 & 0xFF) * var5;
                int var22 = (field577[var19] >> 8 & 0xFF) * var5;
                int var23 = (field577[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field577[var19++] = var24;
            }
            var11++;
            var15 -= var14-- + var14;
            var16 -= var14 + var14;
        }
        int var25 = arg2;
        int var26 = -var14;
        int var27 = var26 * var26 + var12;
        int var28 = var27 - arg2;
        int var29 = var27 - var26;
        while (var11 < var10) {
            while (var29 > var12 && var28 > var12) {
                var29 -= var25-- + var25;
                var28 -= var25 + var25;
            }
            int var30 = arg0 - var25;
            if (var30 < field582) {
                var30 = field582;
            }
            int var31 = arg0 + var25;
            if (var31 > field578 - 1) {
                var31 = field578 - 1;
            }
            int var32 = field580 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field577[var32] >> 16 & 0xFF) * var5;
                int var35 = (field577[var32] >> 8 & 0xFF) * var5;
                int var36 = (field577[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field577[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III[I[I)V", line = 387)
    public static final void method306(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field580 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field577[var7++] = arg2;
            }
            var5 += field580;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IIIII)V", line = 408)
    public static final void method307(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method313(arg0, arg1, var5 + 1, arg4);
            } else {
                method313(arg0 + var5, arg1, 1 - var5, arg4);
            }
        } else if (var5 != 0) {
            if (var5 + var6 < 0) {
                arg0 += var5;
                var5 = -var5;
                arg1 += var6;
                var6 = -var6;
            }
            if (var5 > var6) {
                int var7 = arg1 << 16;
                int var8 = var7 + 32768;
                int var9 = var6 << 16;
                int var10 = (int) Math.floor((double) var9 / (double) var5 + 0.5D);
                int var11 = arg0 + var5;
                if (arg0 < field582) {
                    var8 += (field582 - arg0) * var10;
                    arg0 = field582;
                }
                if (var11 >= field578) {
                    var11 = field578 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field583 && var12 < field581) {
                        field577[field580 * var12 + arg0] = arg4;
                    }
                    var8 += var10;
                    arg0++;
                }
            } else {
                int var13 = arg0 << 16;
                int var14 = var13 + 32768;
                int var15 = var5 << 16;
                int var16 = (int) Math.floor((double) var15 / (double) var6 + 0.5D);
                int var17 = arg1 + var6;
                if (arg1 < field583) {
                    var14 += (field583 - arg1) * var16;
                    arg1 = field583;
                }
                if (var17 >= field581) {
                    var17 = field581 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field582 && var18 < field578) {
                        field577[field580 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method316(arg0, arg1, var6 + 1, arg4);
        } else {
            method316(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V", line = 500)
    private static final void method308(int arg0, int arg1, int arg2) {
        if (arg0 >= field582 && arg1 >= field583 && arg0 < field578 && arg1 < field581) {
            field577[field580 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "()V", line = 508)
    public static void method309() {
        field577 = null;
        field585 = null;
        field584 = null;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(IIIII)V", line = 513)
    private static final void method310(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field583 || arg1 >= field581) {
            return;
        }
        if (arg0 < field582) {
            arg2 -= field582 - arg0;
            arg0 = field582;
        }
        if (arg0 + arg2 > field578) {
            arg2 = field578 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field580 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field577[var9] >> 16 & 0xFF) * var5;
            int var12 = (field577[var9] >> 8 & 0xFF) * var5;
            int var13 = (field577[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field577[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([I[I)V", line = 560)
    public static final void method311(int[] arg0, int[] arg1) {
        if (field581 - field583 != arg0.length || field581 - field583 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field585 = arg0;
        field584 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(IIIII)V", line = 577)
    public static final void method312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field582) {
            arg2 -= field582 - arg0;
            arg0 = field582;
        }
        if (arg1 < field583) {
            arg3 -= field583 - arg1;
            arg1 = field583;
        }
        if (arg0 + arg2 > field578) {
            arg2 = field578 - arg0;
        }
        if (arg1 + arg3 > field581) {
            arg3 = field581 - arg1;
        }
        int var5 = field580 - arg2;
        int var6 = field580 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field577[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(IIII)V", line = 619)
    public static final void method313(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field583 || arg1 >= field581) {
            return;
        }
        if (arg0 < field582) {
            arg2 -= field582 - arg0;
            arg0 = field582;
        }
        if (arg0 + arg2 > field578) {
            arg2 = field578 - arg0;
        }
        int var4 = field580 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field577[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([I)V", line = 642)
    public static final void method314(int[] arg0) {
        arg0[0] = field582;
        arg0[1] = field583;
        arg0[2] = field578;
        arg0[3] = field581;
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(IIIII)V", line = 657)
    private static final void method315(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field582 || arg0 >= field578) {
            return;
        }
        if (arg1 < field583) {
            arg2 -= field583 - arg1;
            arg1 = field583;
        }
        if (arg1 + arg2 > field581) {
            arg2 = field581 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field580 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field577[var9] >> 16 & 0xFF) * var5;
            int var12 = (field577[var9] >> 8 & 0xFF) * var5;
            int var13 = (field577[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field577[var9] = var14;
            var9 += field580;
        }
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(IIII)V", line = 710)
    public static final void method316(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field582 || arg0 >= field578) {
            return;
        }
        if (arg1 < field583) {
            arg2 -= field583 - arg1;
            arg1 = field583;
        }
        if (arg1 + arg2 > field581) {
            arg2 = field581 - arg1;
        }
        int var4 = field580 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field577[field580 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "([I)V", line = 733)
    public static final void method317(int[] arg0) {
        field582 = arg0[0];
        field583 = arg0[1];
        field578 = arg0[2];
        field581 = arg0[3];
        method320();
    }

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(IIIII)V", line = 740)
    public static final void method318(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method313(arg0, arg1, arg2, arg4);
        method313(arg0, arg1 + arg3 - 1, arg2, arg4);
        method316(arg0, arg1, arg3, arg4);
        method316(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(IIIIII)V", line = 751)
    public static final void method319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field582) {
            arg2 -= field582 - arg0;
            arg0 = field582;
        }
        if (arg1 < field583) {
            arg3 -= field583 - arg1;
            arg1 = field583;
        }
        if (arg0 + arg2 > field578) {
            arg2 = field578 - arg0;
        }
        if (arg1 + arg3 > field581) {
            arg3 = field581 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field580 - arg2;
        int var9 = field580 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field577[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field577[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "()V", line = 800)
    public static final void method320() {
        field585 = null;
        field584 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([III)V", line = 804)
    public static final void method321(int[] arg0, int arg1, int arg2) {
        field577 = arg0;
        field580 = arg1;
        field579 = arg2;
        method301(0, 0, arg1, arg2);
    }
}
