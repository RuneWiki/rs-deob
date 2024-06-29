import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class74 extends class72 {

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public static int field1682 = 0;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
    public static int field1685 = 0;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
    public static int field1681 = 0;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field1686 = 0;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "[I")
    public static int[] field1680;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method577(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1686 || arg0 >= field1685) {
            return;
        }
        if (arg1 < field1682) {
            arg2 -= field1682 - arg1;
            arg1 = field1682;
        }
        if (arg1 + arg2 > field1681) {
            arg2 = field1681 - arg1;
        }
        int var4 = field1683 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1680[field1683 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([III)V", line = 28)
    public static final void method578(int[] arg0, int arg1, int arg2) {
        field1680 = arg0;
        field1683 = arg1;
        field1684 = arg2;
        method587(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIII)V", line = 34)
    public static final void method579(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1686) {
            arg2 -= field1686 - arg0;
            arg0 = field1686;
        }
        if (arg1 < field1682) {
            arg3 -= field1682 - arg1;
            arg1 = field1682;
        }
        if (arg0 + arg2 > field1685) {
            arg2 = field1685 - arg0;
        }
        if (arg1 + arg3 > field1681) {
            arg3 = field1681 - arg1;
        }
        int var5 = field1683 - arg2;
        int var6 = field1683 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1680[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIIII)V", line = 76)
    public static final void method580(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method584(arg0, arg1, var5 + 1, arg4);
            } else {
                method584(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field1686) {
                    var8 += (field1686 - arg0) * var10;
                    arg0 = field1686;
                }
                if (var11 >= field1685) {
                    var11 = field1685 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1682 && var12 < field1681) {
                        field1680[field1683 * var12 + arg0] = arg4;
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
                if (arg1 < field1682) {
                    var14 += (field1682 - arg1) * var16;
                    arg1 = field1682;
                }
                if (var17 >= field1681) {
                    var17 = field1681 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1686 && var18 < field1685) {
                        field1680[field1683 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method577(arg0, arg1, var6 + 1, arg4);
        } else {
            method577(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 167)
    public static void method581() {
        field1680 = null;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(IIIII)V", line = 170)
    public static final void method582(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method584(arg0, arg1, arg2, arg4);
        method584(arg0, arg1 + arg3 - 1, arg2, arg4);
        method577(arg0, arg1, arg3, arg4);
        method577(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V", line = 180)
    public static final void method583() {
        field1686 = 0;
        field1682 = 0;
        field1685 = field1683;
        field1681 = field1684;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIII)V", line = 186)
    public static final void method584(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1682 || arg1 >= field1681) {
            return;
        }
        if (arg0 < field1686) {
            arg2 -= field1686 - arg0;
            arg0 = field1686;
        }
        if (arg0 + arg2 > field1685) {
            arg2 = field1685 - arg0;
        }
        int var4 = field1683 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1680[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(IIIII)V", line = 210)
    private static final void method585(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1682 || arg1 >= field1681) {
            return;
        }
        if (arg0 < field1686) {
            arg2 -= field1686 - arg0;
            arg0 = field1686;
        }
        if (arg0 + arg2 > field1685) {
            arg2 = field1685 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1683 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1680[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1680[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1680[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1680[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(IIIII)V", line = 254)
    private static final void method586(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1686 || arg0 >= field1685) {
            return;
        }
        if (arg1 < field1682) {
            arg2 -= field1682 - arg1;
            arg1 = field1682;
        }
        if (arg1 + arg2 > field1681) {
            arg2 = field1681 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1683 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1680[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1680[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1680[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1680[var9] = var14;
            var9 += field1683;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(IIII)V", line = 304)
    public static final void method587(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1683) {
            arg2 = field1683;
        }
        if (arg3 > field1684) {
            arg3 = field1684;
        }
        field1686 = arg0;
        field1682 = arg1;
        field1685 = arg2;
        field1681 = arg3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIII)V", line = 327)
    public static final void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method585(arg0, arg1, arg2, arg4, arg5);
        method585(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method586(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method586(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([I)V", line = 337)
    public static final void method589(int[] arg0) {
        field1686 = arg0[0];
        field1682 = arg0[1];
        field1685 = arg0[2];
        field1681 = arg0[3];
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()V", line = 344)
    public static final void method590() {
        int var0 = 0;
        int var1 = field1684 * field1683 - 7;
        while (var0 < var1) {
            field1680[var0++] = 0;
            field1680[var0++] = 0;
            field1680[var0++] = 0;
            field1680[var0++] = 0;
            field1680[var0++] = 0;
            field1680[var0++] = 0;
            field1680[var0++] = 0;
            field1680[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1680[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "([I)V", line = 366)
    public static final void method591(int[] arg0) {
        arg0[0] = field1686;
        arg0[1] = field1682;
        arg0[2] = field1685;
        arg0[3] = field1681;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIIIII)V", line = 377)
    public static final void method592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1686) {
            arg2 -= field1686 - arg0;
            arg0 = field1686;
        }
        if (arg1 < field1682) {
            arg3 -= field1682 - arg1;
            arg1 = field1682;
        }
        if (arg0 + arg2 > field1685) {
            arg2 = field1685 - arg0;
        }
        if (arg1 + arg3 > field1681) {
            arg3 = field1681 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field1683 - arg2;
        int var11 = field1683 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field1680[var11] >> 16 & 0xFF) * var6;
                int var15 = (field1680[var11] >> 8 & 0xFF) * var6;
                int var16 = (field1680[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field1680[var11++] = var17;
            }
            var11 += var10;
        }
    }
}
