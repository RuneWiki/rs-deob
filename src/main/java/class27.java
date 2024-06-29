import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class27 extends class67 {

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    public static int field603 = 0;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "I")
    public static int field602 = 0;

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "I")
    public static int field604 = 0;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
    public static int field600 = 0;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "[I")
    public static int[] field605;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIII)V", line = 9)
    public static final void method158(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method171(arg0, arg1, var5 + 1, arg4);
            } else {
                method171(arg0 + var5, arg1, 1 - var5, arg4);
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
                if (arg0 < field604) {
                    var8 += (field604 - arg0) * var10;
                    arg0 = field604;
                }
                if (var11 >= field600) {
                    var11 = field600 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field602 && var12 < field603) {
                        field605[field601 * var12 + arg0] = arg4;
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
                if (arg1 < field602) {
                    var14 += (field602 - arg1) * var16;
                    arg1 = field602;
                }
                if (var17 >= field603) {
                    var17 = field603 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field604 && var18 < field600) {
                        field605[field601 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method172(arg0, arg1, var6 + 1, arg4);
        } else {
            method172(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()V", line = 101)
    public static void method159() {
        field605 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([I)V", line = 106)
    public static final void method160(int[] arg0) {
        field604 = arg0[0];
        field602 = arg0[1];
        field600 = arg0[2];
        field603 = arg0[3];
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "([I)V", line = 113)
    public static final void method161(int[] arg0) {
        arg0[0] = field604;
        arg0[1] = field602;
        arg0[2] = field600;
        arg0[3] = field603;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()V", line = 120)
    public static final void method162() {
        int var0 = 0;
        int var1 = field606 * field601 - 7;
        while (var0 < var1) {
            field605[var0++] = 0;
            field605[var0++] = 0;
            field605[var0++] = 0;
            field605[var0++] = 0;
            field605[var0++] = 0;
            field605[var0++] = 0;
            field605[var0++] = 0;
            field605[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field605[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(IIIII)V", line = 141)
    private static final void method163(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field602 || arg1 >= field603) {
            return;
        }
        if (arg0 < field604) {
            arg2 -= field604 - arg0;
            arg0 = field604;
        }
        if (arg0 + arg2 > field600) {
            arg2 = field600 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field601 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field605[var9] >> 16 & 0xFF) * var5;
            int var12 = (field605[var9] >> 8 & 0xFF) * var5;
            int var13 = (field605[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field605[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(IIIII)V", line = 184)
    public static final void method164(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field604) {
            arg2 -= field604 - arg0;
            arg0 = field604;
        }
        if (arg1 < field602) {
            arg3 -= field602 - arg1;
            arg1 = field602;
        }
        if (arg0 + arg2 > field600) {
            arg2 = field600 - arg0;
        }
        if (arg1 + arg3 > field603) {
            arg3 = field603 - arg1;
        }
        int var5 = field601 - arg2;
        int var6 = field601 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field605[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(IIIII)V", line = 227)
    private static final void method165(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field604 || arg0 >= field600) {
            return;
        }
        if (arg1 < field602) {
            arg2 -= field602 - arg1;
            arg1 = field602;
        }
        if (arg1 + arg2 > field603) {
            arg2 = field603 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field601 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field605[var9] >> 16 & 0xFF) * var5;
            int var12 = (field605[var9] >> 8 & 0xFF) * var5;
            int var13 = (field605[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field605[var9] = var14;
            var9 += field601;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)V", line = 272)
    public static final void method166(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field601) {
            arg2 = field601;
        }
        if (arg3 > field606) {
            arg3 = field606;
        }
        field604 = arg0;
        field602 = arg1;
        field600 = arg2;
        field603 = arg3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII)V", line = 297)
    public static final void method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method163(arg0, arg1, arg2, arg4, arg5);
        method163(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method165(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method165(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(IIIII)V", line = 307)
    public static final void method168(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method171(arg0, arg1, arg2, arg4);
        method171(arg0, arg1 + arg3 - 1, arg2, arg4);
        method172(arg0, arg1, arg3, arg4);
        method172(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()V", line = 313)
    public static final void method169() {
        field604 = 0;
        field602 = 0;
        field600 = field601;
        field603 = field606;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([III)V", line = 319)
    public static final void method170(int[] arg0, int arg1, int arg2) {
        field605 = arg0;
        field601 = arg1;
        field606 = arg2;
        method166(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(IIII)V", line = 325)
    public static final void method171(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field602 || arg1 >= field603) {
            return;
        }
        if (arg0 < field604) {
            arg2 -= field604 - arg0;
            arg0 = field604;
        }
        if (arg0 + arg2 > field600) {
            arg2 = field600 - arg0;
        }
        int var4 = field601 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field605[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(IIII)V", line = 348)
    public static final void method172(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field604 || arg0 >= field600) {
            return;
        }
        if (arg1 < field602) {
            arg2 -= field602 - arg1;
            arg1 = field602;
        }
        if (arg1 + arg2 > field603) {
            arg2 = field603 - arg1;
        }
        int var4 = field601 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field605[field601 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(IIIIII)V", line = 372)
    public static final void method173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field604) {
            arg2 -= field604 - arg0;
            arg0 = field604;
        }
        if (arg1 < field602) {
            arg3 -= field602 - arg1;
            arg1 = field602;
        }
        if (arg0 + arg2 > field600) {
            arg2 = field600 - arg0;
        }
        if (arg1 + arg3 > field603) {
            arg3 = field603 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field601 - arg2;
        int var11 = field601 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field605[var11] >> 16 & 0xFF) * var6;
                int var15 = (field605[var11] >> 8 & 0xFF) * var6;
                int var16 = (field605[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field605[var11++] = var17;
            }
            var11 += var10;
        }
    }
}
