import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class69 extends class107 {

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
    public static int field1549 = 0;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
    public static int field1547 = 0;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
    public static int field1546 = 0;

    @OriginalMember(owner = "client!lc", name = "eb", descriptor = "I")
    public static int field1551 = 0;

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!lc", name = "fb", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "[I")
    public static int[] field1548;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method580(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1546) {
            arg2 -= field1546 - arg0;
            arg0 = field1546;
        }
        if (arg1 < field1549) {
            arg3 -= field1549 - arg1;
            arg1 = field1549;
        }
        if (arg0 + arg2 > field1551) {
            arg2 = field1551 - arg0;
        }
        if (arg1 + arg3 > field1547) {
            arg3 = field1547 - arg1;
        }
        int var5 = field1552 - arg2;
        int var6 = field1552 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1548[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)V", line = 49)
    public static final void method581(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1552) {
            arg2 = field1552;
        }
        if (arg3 > field1550) {
            arg3 = field1550;
        }
        field1546 = arg0;
        field1549 = arg1;
        field1551 = arg2;
        field1547 = arg3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([III)V", line = 67)
    public static final void method582(int[] arg0, int arg1, int arg2) {
        field1548 = arg0;
        field1552 = arg1;
        field1550 = arg2;
        method581(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()V", line = 74)
    public static final void method583() {
        int var0 = 0;
        int var1 = field1552 * field1550 - 7;
        while (var0 < var1) {
            field1548[var0++] = 0;
            field1548[var0++] = 0;
            field1548[var0++] = 0;
            field1548[var0++] = 0;
            field1548[var0++] = 0;
            field1548[var0++] = 0;
            field1548[var0++] = 0;
            field1548[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1548[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(IIIII)V", line = 97)
    private static final void method584(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1549 || arg1 >= field1547) {
            return;
        }
        if (arg0 < field1546) {
            arg2 -= field1546 - arg0;
            arg0 = field1546;
        }
        if (arg0 + arg2 > field1551) {
            arg2 = field1551 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1552 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1548[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1548[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1548[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1548[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([I)V", line = 139)
    public static final void method585(int[] arg0) {
        field1546 = arg0[0];
        field1549 = arg0[1];
        field1551 = arg0[2];
        field1547 = arg0[3];
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(IIIII)V", line = 151)
    public static final void method586(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method589(arg0, arg1, var5 + 1, arg4);
            } else {
                method589(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field1546) {
                    var8 += (field1546 - arg0) * var10;
                    arg0 = field1546;
                }
                if (var11 >= field1551) {
                    var11 = field1551 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1549 && var12 < field1547) {
                        field1548[field1552 * var12 + arg0] = arg4;
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
                if (arg1 < field1549) {
                    var14 += (field1549 - arg1) * var16;
                    arg1 = field1549;
                }
                if (var17 >= field1547) {
                    var17 = field1547 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1546 && var18 < field1551) {
                        field1548[field1552 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method594(arg0, arg1, var6 + 1, arg4);
        } else {
            method594(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "()V", line = 248)
    public static void method587() {
        field1548 = null;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(IIIII)V", line = 251)
    public static final void method588(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method589(arg0, arg1, arg2, arg4);
        method589(arg0, arg1 + arg3 - 1, arg2, arg4);
        method594(arg0, arg1, arg3, arg4);
        method594(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(IIII)V", line = 257)
    public static final void method589(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1549 || arg1 >= field1547) {
            return;
        }
        if (arg0 < field1546) {
            arg2 -= field1546 - arg0;
            arg0 = field1546;
        }
        if (arg0 + arg2 > field1551) {
            arg2 = field1551 - arg0;
        }
        int var4 = field1552 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1548[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIII)V", line = 289)
    public static final void method590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1546) {
            arg2 -= field1546 - arg0;
            arg0 = field1546;
        }
        if (arg1 < field1549) {
            arg3 -= field1549 - arg1;
            arg1 = field1549;
        }
        if (arg0 + arg2 > field1551) {
            arg2 = field1551 - arg0;
        }
        if (arg1 + arg3 > field1547) {
            arg3 = field1547 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field1552 - arg2;
        int var11 = field1552 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field1548[var11] >> 16 & 0xFF) * var6;
                int var15 = (field1548[var11] >> 8 & 0xFF) * var6;
                int var16 = (field1548[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field1548[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(IIIII)V", line = 349)
    private static final void method591(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1546 || arg0 >= field1551) {
            return;
        }
        if (arg1 < field1549) {
            arg2 -= field1549 - arg1;
            arg1 = field1549;
        }
        if (arg1 + arg2 > field1547) {
            arg2 = field1547 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1552 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1548[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1548[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1548[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1548[var9] = var14;
            var9 += field1552;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "([I)V", line = 391)
    public static final void method592(int[] arg0) {
        arg0[0] = field1546;
        arg0[1] = field1549;
        arg0[2] = field1551;
        arg0[3] = field1547;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "()V", line = 397)
    public static final void method593() {
        field1546 = 0;
        field1549 = 0;
        field1551 = field1552;
        field1547 = field1550;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(IIII)V", line = 407)
    public static final void method594(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1546 || arg0 >= field1551) {
            return;
        }
        if (arg1 < field1549) {
            arg2 -= field1549 - arg1;
            arg1 = field1549;
        }
        if (arg1 + arg2 > field1547) {
            arg2 = field1547 - arg1;
        }
        int var4 = field1552 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1548[field1552 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(IIIIII)V", line = 431)
    public static final void method595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method584(arg0, arg1, arg2, arg4, arg5);
        method584(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method591(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method591(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }
}
