import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class49 extends class29 {

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
    public static int field1305 = 0;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field1303 = 0;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    public static int field1306 = 0;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
    public static int field1304 = 0;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "[I")
    public static int[] field1308;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method431(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method438(arg0, arg1, arg2, arg4);
        method438(arg0, arg1 + arg3 - 1, arg2, arg4);
        method434(arg0, arg1, arg3, arg4);
        method434(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V", line = 10)
    public static final void method432(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1302) {
            arg2 = field1302;
        }
        if (arg3 > field1307) {
            arg3 = field1307;
        }
        field1304 = arg0;
        field1303 = arg1;
        field1305 = arg2;
        field1306 = arg3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V", line = 32)
    public static final void method433() {
        int var0 = 0;
        int var1 = field1307 * field1302 - 7;
        while (var0 < var1) {
            field1308[var0++] = 0;
            field1308[var0++] = 0;
            field1308[var0++] = 0;
            field1308[var0++] = 0;
            field1308[var0++] = 0;
            field1308[var0++] = 0;
            field1308[var0++] = 0;
            field1308[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1308[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(IIII)V", line = 53)
    public static final void method434(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1304 || arg0 >= field1305) {
            return;
        }
        if (arg1 < field1303) {
            arg2 -= field1303 - arg1;
            arg1 = field1303;
        }
        if (arg1 + arg2 > field1306) {
            arg2 = field1306 - arg1;
        }
        int var4 = field1302 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1308[field1302 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIII)V", line = 77)
    public static final void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1304) {
            arg2 -= field1304 - arg0;
            arg0 = field1304;
        }
        if (arg1 < field1303) {
            arg3 -= field1303 - arg1;
            arg1 = field1303;
        }
        if (arg0 + arg2 > field1305) {
            arg2 = field1305 - arg0;
        }
        if (arg1 + arg3 > field1306) {
            arg3 = field1306 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field1302 - arg2;
        int var11 = field1302 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field1308[var11] >> 16 & 0xFF) * var6;
                int var15 = (field1308[var11] >> 8 & 0xFF) * var6;
                int var16 = (field1308[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field1308[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(IIIII)V", line = 135)
    private static final void method436(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1304 || arg0 >= field1305) {
            return;
        }
        if (arg1 < field1303) {
            arg2 -= field1303 - arg1;
            arg1 = field1303;
        }
        if (arg1 + arg2 > field1306) {
            arg2 = field1306 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1302 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1308[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1308[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1308[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1308[var9] = var14;
            var9 += field1302;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()V", line = 178)
    public static final void method437() {
        field1304 = 0;
        field1303 = 0;
        field1305 = field1302;
        field1306 = field1307;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(IIII)V", line = 185)
    public static final void method438(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1303 || arg1 >= field1306) {
            return;
        }
        if (arg0 < field1304) {
            arg2 -= field1304 - arg0;
            arg0 = field1304;
        }
        if (arg0 + arg2 > field1305) {
            arg2 = field1305 - arg0;
        }
        int var4 = field1302 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1308[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(IIIII)V", line = 208)
    private static final void method439(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1303 || arg1 >= field1306) {
            return;
        }
        if (arg0 < field1304) {
            arg2 -= field1304 - arg0;
            arg0 = field1304;
        }
        if (arg0 + arg2 > field1305) {
            arg2 = field1305 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1302 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1308[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1308[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1308[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1308[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(IIIII)V", line = 252)
    public static final void method440(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1304) {
            arg2 -= field1304 - arg0;
            arg0 = field1304;
        }
        if (arg1 < field1303) {
            arg3 -= field1303 - arg1;
            arg1 = field1303;
        }
        if (arg0 + arg2 > field1305) {
            arg2 = field1305 - arg0;
        }
        if (arg1 + arg3 > field1306) {
            arg3 = field1306 - arg1;
        }
        int var5 = field1302 - arg2;
        int var6 = field1302 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1308[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "()V", line = 302)
    public static void method441() {
        field1308 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([III)V", line = 326)
    public static final void method442(int[] arg0, int arg1, int arg2) {
        field1308 = arg0;
        field1302 = arg1;
        field1307 = arg2;
        method432(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(IIIIII)V", line = 338)
    public static final void method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method439(arg0, arg1, arg2, arg4, arg5);
        method439(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method436(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method436(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }
}
