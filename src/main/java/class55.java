import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class55 extends class42 {

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "I")
    public static int field1375 = 0;

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "I")
    public static int field1377 = 0;

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "I")
    public static int field1379 = 0;

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "I")
    public static int field1378 = 0;

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!ja", name = "ib", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ja", name = "hb", descriptor = "[I")
    public static int[] field1380;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V", line = 6)
    private static final void method442(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1377 || arg0 >= field1379) {
            return;
        }
        if (arg1 < field1375) {
            arg2 -= field1375 - arg1;
            arg1 = field1375;
        }
        if (arg1 + arg2 > field1378) {
            arg2 = field1378 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1381 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1380[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1380[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1380[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1380[var9] = var14;
            var9 += field1381;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIIII)V", line = 50)
    public static final void method443(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1377) {
            arg2 -= field1377 - arg0;
            arg0 = field1377;
        }
        if (arg1 < field1375) {
            arg3 -= field1375 - arg1;
            arg1 = field1375;
        }
        if (arg0 + arg2 > field1379) {
            arg2 = field1379 - arg0;
        }
        if (arg1 + arg3 > field1378) {
            arg3 = field1378 - arg1;
        }
        int var5 = field1381 - arg2;
        int var6 = field1381 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1380[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)V", line = 94)
    public static final void method444(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1375 || arg1 >= field1378) {
            return;
        }
        if (arg0 < field1377) {
            arg2 -= field1377 - arg0;
            arg0 = field1377;
        }
        if (arg0 + arg2 > field1379) {
            arg2 = field1379 - arg0;
        }
        int var4 = field1381 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1380[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V", line = 118)
    public static final void method445() {
        int var0 = 0;
        int var1 = field1381 * field1376 - 7;
        while (var0 < var1) {
            field1380[var0++] = 0;
            field1380[var0++] = 0;
            field1380[var0++] = 0;
            field1380[var0++] = 0;
            field1380[var0++] = 0;
            field1380[var0++] = 0;
            field1380[var0++] = 0;
            field1380[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1380[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V", line = 142)
    public static void method446() {
        field1380 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([III)V", line = 150)
    public static final void method447(int[] arg0, int arg1, int arg2) {
        field1380 = arg0;
        field1381 = arg1;
        field1376 = arg2;
        method454(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V", line = 157)
    public static final void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1377) {
            arg2 -= field1377 - arg0;
            arg0 = field1377;
        }
        if (arg1 < field1375) {
            arg3 -= field1375 - arg1;
            arg1 = field1375;
        }
        if (arg0 + arg2 > field1379) {
            arg2 = field1379 - arg0;
        }
        if (arg1 + arg3 > field1378) {
            arg3 = field1378 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field1381 - arg2;
        int var11 = field1381 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field1380[var11] >> 16 & 0xFF) * var6;
                int var15 = (field1380[var11] >> 8 & 0xFF) * var6;
                int var16 = (field1380[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field1380[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIII)V", line = 216)
    public static final void method449(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1377 || arg0 >= field1379) {
            return;
        }
        if (arg1 < field1375) {
            arg2 -= field1375 - arg1;
            arg1 = field1375;
        }
        if (arg1 + arg2 > field1378) {
            arg2 = field1378 - arg1;
        }
        int var4 = field1381 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1380[field1381 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "()V", line = 243)
    public static final void method450() {
        field1377 = 0;
        field1375 = 0;
        field1379 = field1381;
        field1378 = field1376;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(IIIII)V", line = 249)
    private static final void method451(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1375 || arg1 >= field1378) {
            return;
        }
        if (arg0 < field1377) {
            arg2 -= field1377 - arg0;
            arg0 = field1377;
        }
        if (arg0 + arg2 > field1379) {
            arg2 = field1379 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1381 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1380[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1380[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1380[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1380[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(IIIII)V", line = 293)
    public static final void method452(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method444(arg0, arg1, arg2, arg4);
        method444(arg0, arg1 + arg3 - 1, arg2, arg4);
        method449(arg0, arg1, arg3, arg4);
        method449(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIIIII)V", line = 300)
    public static final void method453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method451(arg0, arg1, arg2, arg4, arg5);
        method451(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method442(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method442(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(IIII)V", line = 313)
    public static final void method454(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1381) {
            arg2 = field1381;
        }
        if (arg3 > field1376) {
            arg3 = field1376;
        }
        field1377 = arg0;
        field1375 = arg1;
        field1379 = arg2;
        field1378 = arg3;
    }
}
