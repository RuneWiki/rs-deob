import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class66 extends class129 {

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    public static int field1716 = 0;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    public static int field1717 = 0;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "I")
    public static int field1719 = 0;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public static int field1718 = 0;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!l", name = "X", descriptor = "[I")
    public static int[] field1722;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)V", line = 7)
    public static final void method569(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1716) {
            arg2 -= field1716 - arg0;
            arg0 = field1716;
        }
        if (arg1 < field1717) {
            arg3 -= field1717 - arg1;
            arg1 = field1717;
        }
        if (arg0 + arg2 > field1719) {
            arg2 = field1719 - arg0;
        }
        if (arg1 + arg3 > field1718) {
            arg3 = field1718 - arg1;
        }
        int var5 = field1721 - arg2;
        int var6 = field1721 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field1722[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V", line = 49)
    public static final void method570(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field1721) {
            arg2 = field1721;
        }
        if (arg3 > field1720) {
            arg3 = field1720;
        }
        field1716 = arg0;
        field1717 = arg1;
        field1719 = arg2;
        field1718 = arg3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V", line = 85)
    public static final void method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1716) {
            arg2 -= field1716 - arg0;
            arg0 = field1716;
        }
        if (arg1 < field1717) {
            arg3 -= field1717 - arg1;
            arg1 = field1717;
        }
        if (arg0 + arg2 > field1719) {
            arg2 = field1719 - arg0;
        }
        if (arg1 + arg3 > field1718) {
            arg3 = field1718 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field1721 - arg2;
        int var11 = field1721 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field1722[var11] >> 16 & 0xFF) * var6;
                int var15 = (field1722[var11] >> 8 & 0xFF) * var6;
                int var16 = (field1722[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field1722[var11++] = var17;
            }
            var11 += var10;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()V", line = 143)
    public static final void method572() {
        field1716 = 0;
        field1717 = 0;
        field1719 = field1721;
        field1718 = field1720;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()V", line = 149)
    public static void method573() {
        field1722 = null;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIII)V", line = 152)
    private static final void method574(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1717 || arg1 >= field1718) {
            return;
        }
        if (arg0 < field1716) {
            arg2 -= field1716 - arg0;
            arg0 = field1716;
        }
        if (arg0 + arg2 > field1719) {
            arg2 = field1719 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1721 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1722[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1722[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1722[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1722[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()V", line = 199)
    public static final void method575() {
        int var0 = 0;
        int var1 = field1721 * field1720 - 7;
        while (var0 < var1) {
            field1722[var0++] = 0;
            field1722[var0++] = 0;
            field1722[var0++] = 0;
            field1722[var0++] = 0;
            field1722[var0++] = 0;
            field1722[var0++] = 0;
            field1722[var0++] = 0;
            field1722[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field1722[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIII)V", line = 225)
    public static final void method576(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1716 || arg0 >= field1719) {
            return;
        }
        if (arg1 < field1717) {
            arg2 -= field1717 - arg1;
            arg1 = field1717;
        }
        if (arg1 + arg2 > field1718) {
            arg2 = field1718 - arg1;
        }
        int var4 = field1721 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1722[field1721 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIII)V", line = 248)
    public static final void method577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method574(arg0, arg1, arg2, arg4, arg5);
        method574(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method579(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method579(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIII)V", line = 258)
    public static final void method578(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method580(arg0, arg1, arg2, arg4);
        method580(arg0, arg1 + arg3 - 1, arg2, arg4);
        method576(arg0, arg1, arg3, arg4);
        method576(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(IIIII)V", line = 268)
    private static final void method579(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1716 || arg0 >= field1719) {
            return;
        }
        if (arg1 < field1717) {
            arg2 -= field1717 - arg1;
            arg1 = field1717;
        }
        if (arg1 + arg2 > field1718) {
            arg2 = field1718 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field1721 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field1722[var9] >> 16 & 0xFF) * var5;
            int var12 = (field1722[var9] >> 8 & 0xFF) * var5;
            int var13 = (field1722[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field1722[var9] = var14;
            var9 += field1721;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(IIII)V", line = 311)
    public static final void method580(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1717 || arg1 >= field1718) {
            return;
        }
        if (arg0 < field1716) {
            arg2 -= field1716 - arg0;
            arg0 = field1716;
        }
        if (arg0 + arg2 > field1719) {
            arg2 = field1719 - arg0;
        }
        int var4 = field1721 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field1722[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([III)V", line = 340)
    public static final void method581(int[] arg0, int arg1, int arg2) {
        field1722 = arg0;
        field1721 = arg1;
        field1720 = arg2;
        method570(0, 0, arg1, arg2);
    }
}
