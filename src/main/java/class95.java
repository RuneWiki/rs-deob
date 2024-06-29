import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class95 extends class62 {

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field2114 = 0;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "I")
    public static int field2116 = 0;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
    public static int field2118 = 0;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
    public static int field2120 = 0;

    @OriginalMember(owner = "client!q", name = "X", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "[I")
    public static int[] field2115;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIII)V")
    public static final void method717(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method725(arg0, arg1, arg2, arg4);
        method725(arg0, arg1 + arg3 - 1, arg2, arg4);
        method721(arg0, arg1, arg3, arg4);
        method721(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIII)V")
    public static final void method718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2118) {
            arg2 -= field2118 - arg0;
            arg0 = field2118;
        }
        if (arg1 < field2114) {
            arg3 -= field2114 - arg1;
            arg1 = field2114;
        }
        if (arg0 + arg2 > field2120) {
            arg2 = field2120 - arg0;
        }
        if (arg1 + arg3 > field2116) {
            arg3 = field2116 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field2117 - arg2;
        int var11 = field2117 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field2115[var11] >> 16 & 0xFF) * var6;
                int var15 = (field2115[var11] >> 8 & 0xFF) * var6;
                int var16 = (field2115[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field2115[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)V")
    public static final void method719(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field2117) {
            arg2 = field2117;
        }
        if (arg3 > field2119) {
            arg3 = field2119;
        }
        field2118 = arg0;
        field2114 = arg1;
        field2120 = arg2;
        field2116 = arg3;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
    public static void method720() {
        field2115 = null;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IIII)V")
    public static final void method721(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2118 || arg0 >= field2120) {
            return;
        }
        if (arg1 < field2114) {
            arg2 -= field2114 - arg1;
            arg1 = field2114;
        }
        if (arg1 + arg2 > field2116) {
            arg2 = field2116 - arg1;
        }
        int var4 = field2117 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2115[field2117 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IIIII)V")
    private static final void method722(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2114 || arg1 >= field2116) {
            return;
        }
        if (arg0 < field2118) {
            arg2 -= field2118 - arg0;
            arg0 = field2118;
        }
        if (arg0 + arg2 > field2120) {
            arg2 = field2120 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2117 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2115[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2115[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2115[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2115[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IIIIII)V")
    public static final void method723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method722(arg0, arg1, arg2, arg4, arg5);
        method722(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method726(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method726(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "()V")
    public static final void method724() {
        field2118 = 0;
        field2114 = 0;
        field2120 = field2117;
        field2116 = field2119;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(IIII)V")
    public static final void method725(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2114 || arg1 >= field2116) {
            return;
        }
        if (arg0 < field2118) {
            arg2 -= field2118 - arg0;
            arg0 = field2118;
        }
        if (arg0 + arg2 > field2120) {
            arg2 = field2120 - arg0;
        }
        int var4 = field2117 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field2115[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(IIIII)V")
    private static final void method726(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2118 || arg0 >= field2120) {
            return;
        }
        if (arg1 < field2114) {
            arg2 -= field2114 - arg1;
            arg1 = field2114;
        }
        if (arg1 + arg2 > field2116) {
            arg2 = field2116 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field2117 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field2115[var9] >> 16 & 0xFF) * var5;
            int var12 = (field2115[var9] >> 8 & 0xFF) * var5;
            int var13 = (field2115[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field2115[var9] = var14;
            var9 += field2117;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([III)V")
    public static final void method727(int[] arg0, int arg1, int arg2) {
        field2115 = arg0;
        field2117 = arg1;
        field2119 = arg2;
        method719(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(IIIII)V")
    public static final void method728(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2118) {
            arg2 -= field2118 - arg0;
            arg0 = field2118;
        }
        if (arg1 < field2114) {
            arg3 -= field2114 - arg1;
            arg1 = field2114;
        }
        if (arg0 + arg2 > field2120) {
            arg2 = field2120 - arg0;
        }
        if (arg1 + arg3 > field2116) {
            arg3 = field2116 - arg1;
        }
        int var5 = field2117 - arg2;
        int var6 = field2117 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field2115[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "()V")
    public static final void method729() {
        int var0 = 0;
        int var1 = field2119 * field2117 - 7;
        while (var0 < var1) {
            field2115[var0++] = 0;
            field2115[var0++] = 0;
            field2115[var0++] = 0;
            field2115[var0++] = 0;
            field2115[var0++] = 0;
            field2115[var0++] = 0;
            field2115[var0++] = 0;
            field2115[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field2115[var0++] = 0;
        }
    }
}
