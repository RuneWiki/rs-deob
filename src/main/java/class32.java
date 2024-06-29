import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class32 extends class55 {

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field634 = 0;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public static int field635 = 0;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public static int field637 = 0;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    public static int field636 = 0;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "[I")
    public static int[] field639;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method281(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field637 || arg1 >= field636) {
            return;
        }
        if (arg0 < field635) {
            arg2 -= field635 - arg0;
            arg0 = field635;
        }
        if (arg0 + arg2 > field634) {
            arg2 = field634 - arg0;
        }
        int var4 = field638 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field639[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([III)V", line = 29)
    public static final void method282(int[] arg0, int arg1, int arg2) {
        field639 = arg0;
        field638 = arg1;
        field633 = arg2;
        method291(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()V", line = 41)
    public static void method283() {
        field639 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V", line = 52)
    private static final void method284(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field637 || arg1 >= field636) {
            return;
        }
        if (arg0 < field635) {
            arg2 -= field635 - arg0;
            arg0 = field635;
        }
        if (arg0 + arg2 > field634) {
            arg2 = field634 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field638 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field639[var9] >> 16 & 0xFF) * var5;
            int var12 = (field639[var9] >> 8 & 0xFF) * var5;
            int var13 = (field639[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field639[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(IIIII)V", line = 100)
    public static final void method285(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method281(arg0, arg1, arg2, arg4);
        method281(arg0, arg1 + arg3 - 1, arg2, arg4);
        method289(arg0, arg1, arg3, arg4);
        method289(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(IIIII)V", line = 106)
    private static final void method286(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field635 || arg0 >= field634) {
            return;
        }
        if (arg1 < field637) {
            arg2 -= field637 - arg1;
            arg1 = field637;
        }
        if (arg1 + arg2 > field636) {
            arg2 = field636 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field638 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field639[var9] >> 16 & 0xFF) * var5;
            int var12 = (field639[var9] >> 8 & 0xFF) * var5;
            int var13 = (field639[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field639[var9] = var14;
            var9 += field638;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIII)V", line = 153)
    public static final void method287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method284(arg0, arg1, arg2, arg4, arg5);
        method284(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method286(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method286(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()V", line = 166)
    public static final void method288() {
        int var0 = 0;
        int var1 = field638 * field633 - 7;
        while (var0 < var1) {
            field639[var0++] = 0;
            field639[var0++] = 0;
            field639[var0++] = 0;
            field639[var0++] = 0;
            field639[var0++] = 0;
            field639[var0++] = 0;
            field639[var0++] = 0;
            field639[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field639[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(IIII)V", line = 190)
    public static final void method289(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field635 || arg0 >= field634) {
            return;
        }
        if (arg1 < field637) {
            arg2 -= field637 - arg1;
            arg1 = field637;
        }
        if (arg1 + arg2 > field636) {
            arg2 = field636 - arg1;
        }
        int var4 = field638 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field639[field638 * var5 + var4] = arg3;
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(IIIII)V", line = 214)
    public static final void method290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field635) {
            arg2 -= field635 - arg0;
            arg0 = field635;
        }
        if (arg1 < field637) {
            arg3 -= field637 - arg1;
            arg1 = field637;
        }
        if (arg0 + arg2 > field634) {
            arg2 = field634 - arg0;
        }
        if (arg1 + arg3 > field636) {
            arg3 = field636 - arg1;
        }
        int var5 = field638 - arg2;
        int var6 = field638 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field639[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(IIII)V", line = 257)
    public static final void method291(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field638) {
            arg2 = field638;
        }
        if (arg3 > field633) {
            arg3 = field633;
        }
        field635 = arg0;
        field637 = arg1;
        field634 = arg2;
        field636 = arg3;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "()V", line = 275)
    public static final void method292() {
        field635 = 0;
        field637 = 0;
        field634 = field638;
        field636 = field633;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(IIIIII)V", line = 288)
    public static final void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field635) {
            arg2 -= field635 - arg0;
            arg0 = field635;
        }
        if (arg1 < field637) {
            arg3 -= field637 - arg1;
            arg1 = field637;
        }
        if (arg0 + arg2 > field634) {
            arg2 = field634 - arg0;
        }
        if (arg1 + arg3 > field636) {
            arg3 = field636 - arg1;
        }
        int var6 = 256 - arg5;
        int var7 = (arg4 >> 16 & 0xFF) * arg5;
        int var8 = (arg4 >> 8 & 0xFF) * arg5;
        int var9 = (arg4 & 0xFF) * arg5;
        int var10 = field638 - arg2;
        int var11 = field638 * arg1 + arg0;
        for (int var12 = 0; var12 < arg3; var12++) {
            for (int var13 = -arg2; var13 < 0; var13++) {
                int var14 = (field639[var11] >> 16 & 0xFF) * var6;
                int var15 = (field639[var11] >> 8 & 0xFF) * var6;
                int var16 = (field639[var11] & 0xFF) * var6;
                int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
                field639[var11++] = var17;
            }
            var11 += var10;
        }
    }
}
