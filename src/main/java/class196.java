import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class196 implements class660 {

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    public int field2733;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Ldg;")
    public class20 field2710;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public int field2715;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public int field2711;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public int field2725;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public int field2723;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public int field2719;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "Lpf;")
    public class759 field2718;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public int field2713;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public int field2721;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Ljava/lang/String;")
    public String field2714;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field2716 = 0;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "Z")
    public static boolean field2726 = true;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "Z")
    public static boolean field2727 = false;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "J")
    public static long field2730 = 0L;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Lhv;")
    public static class151 field2717;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "Lvi;")
    public static class388 field2732;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(FI)F")
    public static final float method1351(float arg0, int arg1) {
        field2720++;
        if (arg1 <= 85) {
            field2732 = null;
        }
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)Lgp;")
    public final class576 method3(byte arg0) {
        if (arg0 >= -15) {
            return null;
        } else {
            field2722++;
            return class598.field7611;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method1352(int arg0) {
        field2732 = null;
        if (arg0 != -9451) {
            field2730 = -125L;
        }
        field2717 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIFFIIFI)[F")
    public static final float[] method1353(int arg0, int arg1, float arg2, float arg3, int arg4, int arg5, float arg6, int arg7) {
        field2724++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
        var8[2] = var11;
        var8[5] = 0.0F;
        var8[8] = var10;
        var8[3] = 0.0F;
        var8[1] = 0.0F;
        var8[6] = -var11;
        var8[0] = var10;
        float var12 = 1.0F - var10;
        var8[4] = 1.0F;
        var8[7] = 0.0F;
        float[] var13 = new float[9];
        if (arg7 != 12959) {
            return null;
        }
        float var14 = 1.0F;
        float var15 = (float) arg5 / 32767.0F;
        float var16 = 0.0F;
        float var17 = 1.0F - var15;
        float var18 = -((float) Math.sqrt((double) (1.0F - (var15 * var15))));
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg4 * arg4));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg0 / var19;
                var14 = (float) (-arg4) / var19;
            }
            var13[7] = -var14 * var18;
            var13[4] = var15;
            var13[6] = var14 * var16 * var17;
            var13[2] = var14 * var16 * var17;
            var13[0] = var14 * var14 * var17 + var15;
            var13[8] = var16 * var16 * var17 + var15;
            var13[3] = -var16 * var18;
            var13[5] = var14 * var18;
            var13[1] = var16 * var18;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[0] *= arg3;
        var9[4] *= arg2;
        var9[7] *= arg6;
        var9[8] *= arg6;
        var9[3] *= arg2;
        var9[5] *= arg2;
        var9[6] *= arg6;
        var9[1] *= arg3;
        var9[2] *= arg3;
        return var9;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZII)I")
    public static final int method1354(boolean arg0, int arg1, int arg2) {
        field2731++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (!arg0) {
                return 92;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)Lmf;")
    public static final class766 method1355(int arg0, int arg1, int arg2) {
        if (class28.field252[arg0][arg1][arg2] == null) {
            boolean var3 = class28.field252[0][arg1][arg2] != null && class28.field252[0][arg1][arg2].field10422 != null;
            if (var3 && arg0 >= class78.field1121 - 1) {
                return null;
            }
            class191.method1337(arg0, arg1, arg2);
        }
        return class28.field252[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1356(int arg0, int arg1, byte arg2) {
        field2729++;
        if (arg2 != -65) {
            field2726 = true;
        }
        return class13.method57(arg0, arg1, (byte) -69) | (arg0 & 0x70000) != 0 || class781.method4286(arg0, arg1, (byte) 3);
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/lang/String;Lpf;Ldg;IIIIIIIIII)V")
    public class196(String arg0, class759 arg1, class20 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field2712 = arg9;
        this.field2733 = arg3;
        this.field2710 = arg2;
        this.field2715 = arg7;
        this.field2711 = arg6;
        this.field2725 = arg11;
        this.field2723 = arg12;
        this.field2719 = arg8;
        this.field2718 = arg1;
        this.field2713 = arg5;
        this.field2721 = arg4;
        this.field2714 = arg0;
        this.field2728 = arg10;
    }
}
