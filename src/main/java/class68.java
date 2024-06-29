import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class68 extends class19 {

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "I")
    public static int field1624 = 0;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
    public static int field1626 = 0;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
    public static int field1627 = 0;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "I")
    public static int field1629 = 0;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "[I")
    public static int[] field1630;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method555(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1628) {
            arg2 = field1628;
        }
        if (arg3 > field1625) {
            arg3 = field1625;
        }
        field1627 = arg0;
        field1629 = arg1;
        field1626 = arg2;
        field1624 = arg3;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIII)V", line = 23)
    public static final void method556(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1629 || arg1 >= field1624) {
            return;
        }
        if (arg0 < field1627) {
            arg2 -= field1627 - arg0;
            arg0 = field1627;
        }
        if (arg0 + arg2 > field1626) {
            arg2 = field1626 - arg0;
        }
        int var4 = field1628 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1630[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V", line = 52)
    private static final void method557(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1629 || arg1 >= field1624) {
            return;
        }
        if (arg0 < field1627) {
            arg2 -= field1627 - arg0;
            arg0 = field1627;
        }
        if (arg0 + arg2 > field1626) {
            arg2 = field1626 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1628 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1630[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1630[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1630[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1630[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V", line = 93)
    public static void method558() {
        field1630 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIIII)V", line = 97)
    private static final void method559(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1627 || arg0 >= field1626) {
            return;
        }
        if (arg1 < field1629) {
            arg2 -= field1629 - arg1;
            arg1 = field1629;
        }
        if (arg1 + arg2 > field1624) {
            arg2 = field1624 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1628 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1630[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1630[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1630[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1630[var9] = var14;
            var9 += field1628;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([I)V", line = 141)
    public static final void method560(int[] arg0) {
        arg0[0] = field1627;
        arg0[1] = field1629;
        arg0[2] = field1626;
        arg0[3] = field1624;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(IIIII)V", line = 149)
    public static final void method561(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method556(arg0, arg1, arg2, arg4);
        method556(arg0, arg1 + arg3 - 1, arg2, arg4);
        method562(arg0, arg1, arg3, arg4);
        method562(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(IIII)V", line = 155)
    public static final void method562(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1627 || arg0 >= field1626) {
            return;
        }
        if (arg1 < field1629) {
            arg2 -= field1629 - arg1;
            arg1 = field1629;
        }
        if (arg1 + arg2 > field1624) {
            arg2 = field1624 - arg1;
        }
        int var4 = field1628 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1630[field1628 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([III)V", line = 181)
    public static final void method563(int[] arg0, int arg1, int arg2) {
        field1630 = arg0;
        field1628 = arg1;
        field1625 = arg2;
        method555(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "([I)V", line = 188)
    public static final void method564(int[] arg0) {
        field1627 = arg0[0];
        field1629 = arg0[1];
        field1626 = arg0[2];
        field1624 = arg0[3];
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "()V", line = 197)
    public static final void method565() {
        int var0 = 0;
        int var1 = field1628 * field1625 - 7;
        while (var0 < var1) {
            field1630[var0++] = 0;
            field1630[var0++] = 0;
            field1630[var0++] = 0;
            field1630[var0++] = 0;
            field1630[var0++] = 0;
            field1630[var0++] = 0;
            field1630[var0++] = 0;
            field1630[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1630[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(IIIII)V", line = 221)
    public static final void method566(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method556(arg0, arg1, var5 + 1, arg4);
            } else {
                method556(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field1627) {
                    var8 += (field1627 - arg0) * var10;
                    arg0 = field1627;
                }
                if (var11 >= field1626) {
                    var11 = field1626 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1629 && var12 < field1624) {
                        field1630[field1628 * var12 + arg0] = arg4;
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
                if (arg1 < field1629) {
                    var14 += (field1629 - arg1) * var16;
                    arg1 = field1629;
                }
                if (var17 >= field1624) {
                    var17 = field1624 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1627 && var18 < field1626) {
                        field1630[field1628 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method562(arg0, arg1, var6 + 1, arg4);
        } else {
            method562(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "()V", line = 313)
    public static final void method567() {
        field1627 = 0;
        field1629 = 0;
        field1626 = field1628;
        field1624 = field1625;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIII)V", line = 319)
    public static final void method568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method557(arg0, arg1, arg2, arg4, arg5);
        method557(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method559(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method559(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(IIIII)V", line = 330)
    public static final void method569(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1627) {
            arg2 -= field1627 - arg0;
            arg0 = field1627;
        }
        if (arg1 < field1629) {
            arg3 -= field1629 - arg1;
            arg1 = field1629;
        }
        if (arg0 + arg2 > field1626) {
            arg2 = field1626 - arg0;
        }
        if (arg1 + arg3 > field1624) {
            arg3 = field1624 - arg1;
        }
        int var5 = field1628 - arg2;
        int var6 = field1628 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1630[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIIIII)V", line = 378)
    public static final void method570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1627) {
            arg2 -= field1627 - arg0;
            arg0 = field1627;
        }
        if (arg1 < field1629) {
            arg3 -= field1629 - arg1;
            arg1 = field1629;
        }
        if (arg0 + arg2 > field1626) {
            arg2 = field1626 - arg0;
        }
        if (arg1 + arg3 > field1624) {
            arg3 = field1624 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field1628 - arg2;
        int var11 = field1628 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field1630[var11] >> 16 & 0xFF) * var6;
                int var15 = (field1630[var11] >> 8 & 0xFF) * var6;
                int var16 = (field1630[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field1630[var11++] = var17;
            }
            var11 += var10;
        }
    }
}
