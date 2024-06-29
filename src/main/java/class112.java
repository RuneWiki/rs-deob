import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class112 extends class5 {

    @OriginalMember(owner = "client!t", name = "X", descriptor = "I")
    public static int field2774 = 0;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "I")
    public static int field2771 = 0;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "I")
    public static int field2775 = 0;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "I")
    public static int field2772 = 0;

    @OriginalMember(owner = "client!t", name = "T", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "[I")
    public static int[] field2776;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IIII)V", line = 7)
    public static final void method850(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2772 || arg0 >= field2774) {
            return;
        }
        if (arg1 < field2775) {
            arg2 -= field2775 - arg1;
            arg1 = field2775;
        }
        if (arg1 + arg2 > field2771) {
            arg2 = field2771 - arg1;
        }
        int var4 = field2773 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2776[field2773 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIII)V", line = 35)
    public static final void method851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method853(arg0, arg1, arg2, arg4, arg5);
        method853(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method855(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method855(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V", line = 45)
    public static void method852() {
        field2776 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIII)V", line = 54)
    private static final void method853(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2775 || arg1 >= field2771) {
            return;
        }
        if (arg0 < field2772) {
            arg2 -= field2772 - arg0;
            arg0 = field2772;
        }
        if (arg0 + arg2 > field2774) {
            arg2 = field2774 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2773 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2776[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2776[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2776[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2776[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V", line = 100)
    public static final void method854() {
        int var0 = 0;
        int var1 = field2773 * field2770 - 7;
        while (var0 < var1) {
            field2776[var0++] = 0;
            field2776[var0++] = 0;
            field2776[var0++] = 0;
            field2776[var0++] = 0;
            field2776[var0++] = 0;
            field2776[var0++] = 0;
            field2776[var0++] = 0;
            field2776[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2776[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IIIII)V", line = 125)
    private static final void method855(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2772 || arg0 >= field2774) {
            return;
        }
        if (arg1 < field2775) {
            arg2 -= field2775 - arg1;
            arg1 = field2775;
        }
        if (arg1 + arg2 > field2771) {
            arg2 = field2771 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2773 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2776[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2776[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2776[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2776[var9] = var14;
            var9 += field2773;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(IIIII)V", line = 173)
    public static final void method856(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2772) {
            arg2 -= field2772 - arg0;
            arg0 = field2772;
        }
        if (arg1 < field2775) {
            arg3 -= field2775 - arg1;
            arg1 = field2775;
        }
        if (arg0 + arg2 > field2774) {
            arg2 = field2774 - arg0;
        }
        if (arg1 + arg3 > field2771) {
            arg3 = field2771 - arg1;
        }
        int var5 = field2773 - arg2;
        int var6 = field2773 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2776[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([III)V", line = 215)
    public static final void method857(int[] arg0, int arg1, int arg2) {
        field2776 = arg0;
        field2773 = arg1;
        field2770 = arg2;
        method859(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IIIIII)V", line = 221)
    public static final void method858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2772) {
            arg2 -= field2772 - arg0;
            arg0 = field2772;
        }
        if (arg1 < field2775) {
            arg3 -= field2775 - arg1;
            arg1 = field2775;
        }
        if (arg0 + arg2 > field2774) {
            arg2 = field2774 - arg0;
        }
        if (arg1 + arg3 > field2771) {
            arg3 = field2771 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field2773 - arg2;
        int var11 = field2773 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field2776[var11] >> 16 & 0xFF) * var6;
                int var15 = (field2776[var11] >> 8 & 0xFF) * var6;
                int var16 = (field2776[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field2776[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(IIII)V", line = 282)
    public static final void method859(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2773) {
            arg2 = field2773;
        }
        if (arg3 > field2770) {
            arg3 = field2770;
        }
        field2772 = arg0;
        field2775 = arg1;
        field2774 = arg2;
        field2771 = arg3;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(IIII)V", line = 312)
    public static final void method860(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2775 || arg1 >= field2771) {
            return;
        }
        if (arg0 < field2772) {
            arg2 -= field2772 - arg0;
            arg0 = field2772;
        }
        if (arg0 + arg2 > field2774) {
            arg2 = field2774 - arg0;
        }
        int var4 = field2773 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2776[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()V", line = 335)
    public static final void method861() {
        field2772 = 0;
        field2775 = 0;
        field2774 = field2773;
        field2771 = field2770;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(IIIII)V", line = 342)
    public static final void method862(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method860(arg0, arg1, arg2, arg4);
        method860(arg0, arg1 + arg3 - 1, arg2, arg4);
        method850(arg0, arg1, arg3, arg4);
        method850(arg0 + arg2 - 1, arg1, arg3, arg4);
    }
}
