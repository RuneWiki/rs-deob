import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class291 extends class11 implements class338 {

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Lvl;")
    public class11 field3806;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "[I")
    public static int[] field3819 = new int[8];

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "Lcu;")
    public static class145 field3808 = new class145(28, -1);

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "Lcu;")
    public static class145 field3821 = new class145(34, 3);

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "[Lsq;")
    public static class117[] field3822 = new class117[32768];

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "[Z")
    public static boolean[] field3824 = new boolean[8];

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "Lkh;")
    public static class13 field3825;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "Lde;")
    public static class368 field3823;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)I")
    public final int method345(int arg0) {
        field3812++;
        return arg0 == -1736 ? 0 : -82;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)Z")
    public final boolean method338(int arg0) {
        field3813++;
        return arg0 > -8 ? false : false;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) {
        field3810++;
        int var2 = -98 / ((arg0 - 56) / 52);
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
    public static void method1709(int arg0) {
        field3825 = null;
        if (arg0 >= -76) {
            method1710(-1.0129011F, -81, -58, -1.2555703F, null, -0.16447243F, null, -1.8991821F, -47, true, -22, -104, -0.95640194F);
        }
        field3819 = null;
        field3808 = null;
        field3822 = null;
        field3824 = null;
        field3823 = null;
        field3821 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method343(int arg0, int arg1, class162 arg2, int arg3) {
        field3805++;
        if (arg0 != -1) {
            field3819 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lqa;Z)V")
    public final void method334(class162 arg0, boolean arg1) {
        if (!arg1) {
            field3821 = null;
        }
        field3809++;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)I")
    public final int method344(int arg0) {
        if (arg0 != -4534) {
            field3821 = null;
        }
        field3820++;
        return 0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILqa;)V")
    public final void method337(int arg0, class162 arg1) {
        field3807++;
        if (arg0 != -7803) {
            field3819 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLqa;I)Lc;")
    public final class121 method336(byte arg0, class162 arg1, int arg2) {
        field3815++;
        if (arg0 != -102) {
            this.field3806 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lqa;I)V")
    public final void method340(class162 arg0, int arg1) {
        field3804++;
        if (arg1 != 20203) {
            field3822 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(FIIF[BFLv;FIZIIF)V")
    public static final void method1710(float arg0, int arg1, int arg2, float arg3, byte[] arg4, float arg5, class407 arg6, float arg7, int arg8, boolean arg9, int arg10, int arg11, float arg12) {
        field3817++;
        if (arg9) {
            for (int var13 = 0; var13 < arg10; var13++) {
                class326.method1888(arg6, arg10, arg12, (byte) -50, arg7, arg8, arg1, var13, arg5, arg0, arg3, arg4, arg11, arg2);
                arg8 += arg1 * arg11;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ldc;IIIIIZ)V")
    public static final void method1711(class5 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3814++;
        if (class104.field1527 >= 50 || arg0 == null || arg0.field137 == null || arg1 >= arg0.field137.length || arg0.field137[arg1] == null) {
            return;
        }
        int var7 = arg0.field137[arg1][0];
        int var8 = var7 >> 8;
        int var9 = var7 >> 5 & 0x7;
        int var10 = var7 & 0x1F;
        if (arg3 >= -6) {
            method1709(64);
        }
        if (arg0.field137[arg1].length > 1) {
            int var11 = (int) ((double) arg0.field137[arg1].length * Math.random());
            if (var11 > 0) {
                var8 = arg0.field137[arg1][var11];
            }
        }
        if (var10 == 0) {
            if (arg6) {
                class259.method1568(0, 255, var9, 0, var8);
            }
        } else if (class154.field2244.field7772 != 0) {
            int var12 = arg5 - 64 >> 7;
            int var13 = arg2 - 64 >> 7;
            class520.field7703[class104.field1527++] = new class231((byte) 1, var8, var9, 0, 255, (var13 << 8) + (arg4 << 24) + (var12 << 16) + var10);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(ILqa;)Lfm;")
    public final class514 method339(int arg0, class162 arg1) {
        field3811++;
        return arg0 == 9124 ? null : null;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)I")
    public final int method128(byte arg0) {
        field3818++;
        if (arg0 < 44) {
            this.field3806 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(IIIIILvl;)V")
    public class291(int arg0, int arg1, int arg2, int arg3, int arg4, class11 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class466.method2650(true, arg1, arg0));
        this.field3806 = arg5;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)I")
    public final int method347(byte arg0) {
        if (arg0 != -87) {
            field3822 = null;
        }
        field3816++;
        return 0;
    }
}
