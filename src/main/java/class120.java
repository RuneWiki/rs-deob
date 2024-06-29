import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class120 extends class134 {

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public static int field2774 = 0;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field2776 = 0;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
    public static int field2773 = 0;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    public static int field2770 = 0;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "[I")
    public static int[] field2771;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V")
    public static final void method866(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method867(arg0, arg1, arg2, arg4);
        method867(arg0, arg1 + arg3 - 1, arg2, arg4);
        method881(arg0, arg1, arg3, arg4);
        method881(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V")
    public static final void method867(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2770 || arg1 >= field2773) {
            return;
        }
        if (arg0 < field2774) {
            arg2 -= field2774 - arg0;
            arg0 = field2774;
        }
        if (arg0 + arg2 > field2776) {
            arg2 = field2776 - arg0;
        }
        int var4 = field2775 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2771[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([I)V")
    public static final void method868(int[] arg0) {
        field2774 = arg0[0];
        field2770 = arg0[1];
        field2776 = arg0[2];
        field2773 = arg0[3];
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII)V")
    public static final void method869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2774) {
            arg2 -= field2774 - arg0;
            arg0 = field2774;
        }
        if (arg1 < field2770) {
            arg3 -= field2770 - arg1;
            arg1 = field2770;
        }
        if (arg0 + arg2 > field2776) {
            arg2 = field2776 - arg0;
        }
        if (arg1 + arg3 > field2773) {
            arg3 = field2773 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field2775 - arg2;
        int var11 = field2775 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field2771[var11] >> 16 & 0xFF) * var6;
                int var15 = (field2771[var11] >> 8 & 0xFF) * var6;
                int var16 = (field2771[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field2771[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
    public static void method870() {
        field2771 = null;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()V")
    public static final void method871() {
        field2774 = 0;
        field2770 = 0;
        field2776 = field2775;
        field2773 = field2772;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIIII)V")
    public static final void method872(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2774) {
            arg2 -= field2774 - arg0;
            arg0 = field2774;
        }
        if (arg1 < field2770) {
            arg3 -= field2770 - arg1;
            arg1 = field2770;
        }
        if (arg0 + arg2 > field2776) {
            arg2 = field2776 - arg0;
        }
        if (arg1 + arg3 > field2773) {
            arg3 = field2773 - arg1;
        }
        int var5 = field2775 - arg2;
        int var6 = field2775 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2771[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "([I)V")
    public static final void method873(int[] arg0) {
        arg0[0] = field2774;
        arg0[1] = field2770;
        arg0[2] = field2776;
        arg0[3] = field2773;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIII)V")
    public static final void method874(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2775) {
            arg2 = field2775;
        }
        if (arg3 > field2772) {
            arg3 = field2772;
        }
        field2774 = arg0;
        field2770 = arg1;
        field2776 = arg2;
        field2773 = arg3;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIIIII)V")
    public static final void method875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field2774) {
            arg2 -= field2774 - arg0;
            arg0 = field2774;
        }
        if (arg1 < field2770) {
            var6 += (field2770 - arg1) * var7;
            arg3 -= field2770 - arg1;
            arg1 = field2770;
        }
        if (arg0 + arg2 > field2776) {
            arg2 = field2776 - arg0;
        }
        if (arg1 + arg3 > field2773) {
            arg3 = field2773 - arg1;
        }
        int var8 = field2775 - arg2;
        int var9 = field2775 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                field2771[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(IIIII)V")
    private static final void method876(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2770 || arg1 >= field2773) {
            return;
        }
        if (arg0 < field2774) {
            arg2 -= field2774 - arg0;
            arg0 = field2774;
        }
        if (arg0 + arg2 > field2776) {
            arg2 = field2776 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2775 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2771[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2771[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2771[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2771[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(IIIII)V")
    public static final void method877(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method867(arg0, arg1, var5 + 1, arg4);
            } else {
                method867(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field2774) {
                    var8 += (field2774 - arg0) * var10;
                    arg0 = field2774;
                }
                if (var11 >= field2776) {
                    var11 = field2776 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field2770 && var12 < field2773) {
                        field2771[field2775 * var12 + arg0] = arg4;
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
                if (arg1 < field2770) {
                    var14 += (field2770 - arg1) * var16;
                    arg1 = field2770;
                }
                if (var17 >= field2773) {
                    var17 = field2773 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field2774 && var18 < field2776) {
                        field2771[field2775 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method881(arg0, arg1, var6 + 1, arg4);
        } else {
            method881(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "()V")
    public static final void method878() {
        int var0 = 0;
        int var1 = field2775 * field2772 - 7;
        while (var0 < var1) {
            field2771[var0++] = 0;
            field2771[var0++] = 0;
            field2771[var0++] = 0;
            field2771[var0++] = 0;
            field2771[var0++] = 0;
            field2771[var0++] = 0;
            field2771[var0++] = 0;
            field2771[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2771[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([III)V")
    public static final void method879(int[] arg0, int arg1, int arg2) {
        field2771 = arg0;
        field2775 = arg1;
        field2772 = arg2;
        method874(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(IIIII)V")
    private static final void method880(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2774 || arg0 >= field2776) {
            return;
        }
        if (arg1 < field2770) {
            arg2 -= field2770 - arg1;
            arg1 = field2770;
        }
        if (arg1 + arg2 > field2773) {
            arg2 = field2773 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2775 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2771[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2771[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2771[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2771[var9] = var14;
            var9 += field2775;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(IIII)V")
    public static final void method881(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2774 || arg0 >= field2776) {
            return;
        }
        if (arg1 < field2770) {
            arg2 -= field2770 - arg1;
            arg1 = field2770;
        }
        if (arg1 + arg2 > field2773) {
            arg2 = field2773 - arg1;
        }
        int var4 = field2775 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2771[field2775 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(IIIIII)V")
    public static final void method882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method876(arg0, arg1, arg2, arg4, arg5);
        method876(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method880(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method880(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }
}
