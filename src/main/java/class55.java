import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class55 extends class120 {

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
    public static int field1268 = 0;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "I")
    public static int field1269 = 0;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
    public static int field1270 = 0;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
    public static int field1266 = 0;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "[I")
    public static int[] field1271;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method393(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method397(arg0, arg1, arg2, arg4);
        method397(arg0, arg1 + arg3 - 1, arg2, arg4);
        method405(arg0, arg1, arg3, arg4);
        method405(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V", line = 12)
    public static final void method394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method396(arg0, arg1, arg2, arg4, arg5);
        method396(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method398(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method398(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V", line = 25)
    public static final void method395() {
        int var0 = 0;
        int var1 = field1272 * field1267 - 7;
        while (var0 < var1) {
            field1271[var0++] = 0;
            field1271[var0++] = 0;
            field1271[var0++] = 0;
            field1271[var0++] = 0;
            field1271[var0++] = 0;
            field1271[var0++] = 0;
            field1271[var0++] = 0;
            field1271[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1271[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIIII)V", line = 51)
    private static final void method396(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1269 || arg1 >= field1266) {
            return;
        }
        if (arg0 < field1270) {
            arg2 -= field1270 - arg0;
            arg0 = field1270;
        }
        if (arg0 + arg2 > field1268) {
            arg2 = field1268 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1272 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1271[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1271[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1271[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1271[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIII)V", line = 95)
    public static final void method397(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1269 || arg1 >= field1266) {
            return;
        }
        if (arg0 < field1270) {
            arg2 -= field1270 - arg0;
            arg0 = field1270;
        }
        if (arg0 + arg2 > field1268) {
            arg2 = field1268 - arg0;
        }
        int var4 = field1272 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1271[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(IIIII)V", line = 121)
    private static final void method398(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1270 || arg0 >= field1268) {
            return;
        }
        if (arg1 < field1269) {
            arg2 -= field1269 - arg1;
            arg1 = field1269;
        }
        if (arg1 + arg2 > field1266) {
            arg2 = field1266 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1272 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1271[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1271[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1271[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1271[var9] = var14;
            var9 += field1272;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([III)V", line = 165)
    public static final void method399(int[] arg0, int arg1, int arg2) {
        field1271 = arg0;
        field1272 = arg1;
        field1267 = arg2;
        method400(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(IIII)V", line = 171)
    public static final void method400(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1272) {
            arg2 = field1272;
        }
        if (arg3 > field1267) {
            arg3 = field1267;
        }
        field1270 = arg0;
        field1269 = arg1;
        field1268 = arg2;
        field1266 = arg3;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(IIIII)V", line = 191)
    public static final void method401(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1270) {
            arg2 -= field1270 - arg0;
            arg0 = field1270;
        }
        if (arg1 < field1269) {
            arg3 -= field1269 - arg1;
            arg1 = field1269;
        }
        if (arg0 + arg2 > field1268) {
            arg2 = field1268 - arg0;
        }
        if (arg1 + arg3 > field1266) {
            arg3 = field1266 - arg1;
        }
        int var5 = field1272 - arg2;
        int var6 = field1272 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1271[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V", line = 236)
    public static final void method402() {
        field1270 = 0;
        field1269 = 0;
        field1268 = field1272;
        field1266 = field1267;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "()V", line = 248)
    public static void method403() {
        field1271 = null;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIIIII)V", line = 256)
    public static final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1270) {
            arg2 -= field1270 - arg0;
            arg0 = field1270;
        }
        if (arg1 < field1269) {
            arg3 -= field1269 - arg1;
            arg1 = field1269;
        }
        if (arg0 + arg2 > field1268) {
            arg2 = field1268 - arg0;
        }
        if (arg1 + arg3 > field1266) {
            arg3 = field1266 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field1272 - arg2;
        int var11 = field1272 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field1271[var11] >> 16 & 0xFF) * var6;
                int var15 = (field1271[var11] >> 8 & 0xFF) * var6;
                int var16 = (field1271[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field1271[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(IIII)V", line = 325)
    public static final void method405(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1270 || arg0 >= field1268) {
            return;
        }
        if (arg1 < field1269) {
            arg2 -= field1269 - arg1;
            arg1 = field1269;
        }
        if (arg1 + arg2 > field1266) {
            arg2 = field1266 - arg1;
        }
        int var4 = field1272 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1271[field1272 * var5 + var4] = arg3;
        }
    }
}
