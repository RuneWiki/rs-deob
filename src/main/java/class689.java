import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class689 {

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "F")
    public float field9814 = 0.25F;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "F")
    public float field9810 = 1.0F;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "F")
    public float field9816 = 1.0F;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public int field9818;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public int field9822;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public int field9825;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public int field9826;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "F")
    public float field9812;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public int field9819;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public int field9817;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "F")
    public float field9820;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "F")
    public float field9829;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lwn;")
    public class674 field9821;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field9824 = 0;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "[[F")
    public static float[][] field9830 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field9811;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field9813;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field9815;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field9823;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field9827;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field9828;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ[I[II)V")
    public static final void method3881(int arg0, boolean arg1, int[] arg2, int[] arg3, int arg4) {
        if (arg4 > arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg4; var10++) {
                if (arg3[var10] < ((var9 & var10) + var7)) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method3881(arg0, false, arg2, arg3, var6 - 1);
            method3881(var6 + 1, false, arg2, arg3, arg4);
        }
        if (!arg1) {
            field9813++;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Z")
    public static final boolean method3882(int arg0, int arg1) {
        if (arg1 != -12) {
            field9824 = -122;
        }
        field9823++;
        return arg0 == 10 || arg0 == 11 || arg0 == 12;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method3883(byte arg0) {
        int var1 = 4 % ((-arg0 - 34) / 58);
        field9830 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lhd;I)Z")
    public final boolean method3884(class689 arg0, int arg1) {
        if (arg1 != -1487477086) {
            method3886(112, -8, 11, 37, null, null, 109, -50, -96);
        }
        field9828++;
        return this.field9826 == arg0.field9826 && this.field9820 == arg0.field9820 && this.field9812 == arg0.field9812 && this.field9829 == arg0.field9829 && this.field9814 == arg0.field9814 && this.field9816 == arg0.field9816 && this.field9810 == arg0.field9810 && this.field9822 == arg0.field9822 && this.field9817 == arg0.field9817 && this.field9821 == arg0.field9821;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lac;I)V")
    public final void method3885(class501 arg0, int arg1) {
        this.field9816 = (float) (arg0.method2874((byte) -75) * 8) / 255.0F;
        field9827++;
        if (arg1 < 29) {
            this.field9818 = 72;
        }
        this.field9814 = (float) (arg0.method2874((byte) -75) * 8) / 255.0F;
        this.field9810 = (float) (arg0.method2874((byte) -75) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII[B[BIII)V")
    public static final void method3886(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field9811++;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & arg7);
        for (int var11 = -arg2; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg5[var10001] = (byte) (arg5[var10001] - arg4[arg0++]);
                int var14 = arg6++;
                arg5[var14] = (byte) (arg5[var14] - arg4[arg0++]);
                int var15 = arg6++;
                arg5[var15] = (byte) (arg5[var15] - arg4[arg0++]);
                int var16 = arg6++;
                arg5[var16] = (byte) (arg5[var16] - arg4[arg0++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg5[var10001] = (byte) (arg5[var10001] - arg4[arg0++]);
            }
            arg0 += arg3;
            arg6 += arg1;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class689() {
        this.field9818 = -50;
        this.field9822 = class45.field544;
        this.field9825 = -60;
        this.field9826 = class657.field9136;
        this.field9812 = 0.69921875F;
        this.field9819 = -50;
        this.field9817 = 0;
        this.field9820 = 1.1523438F;
        this.field9829 = 1.2F;
        this.field9821 = class405.field5678;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lac;)V")
    public class689(class501 arg0) {
        int var2 = arg0.method2874((byte) -75);
        if (class366.field4875.method3766(class503.field6917, (byte) -68) && class610.field8463.method203() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field9826 = class657.field9136;
            } else {
                this.field9826 = arg0.method2840(false);
            }
            if ((var2 & 0x2) == 0) {
                this.field9820 = 1.1523438F;
            } else {
                this.field9820 = (float) arg0.method2845(-1) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field9812 = 0.69921875F;
            } else {
                this.field9812 = (float) arg0.method2845(-1) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field9829 = 1.2F;
            } else {
                this.field9829 = (float) arg0.method2845(-1) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2840(false);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2845(-1);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2845(-1);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2845(-1);
            }
            this.field9826 = class657.field9136;
            this.field9829 = 1.2F;
            this.field9812 = 0.69921875F;
            this.field9820 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field9819 = -50;
            this.field9818 = -50;
            this.field9825 = -60;
        } else {
            this.field9818 = arg0.method2875(false);
            this.field9825 = arg0.method2875(false);
            this.field9819 = arg0.method2875(false);
        }
        if ((var2 & 0x20) == 0) {
            this.field9822 = class45.field544;
        } else {
            this.field9822 = arg0.method2840(false);
        }
        if ((var2 & 0x40) == 0) {
            this.field9817 = 0;
        } else {
            this.field9817 = arg0.method2845(-1);
        }
        if ((var2 & 0x80) == 0) {
            this.field9821 = class405.field5678;
        } else {
            int var3 = arg0.method2845(-1);
            int var4 = arg0.method2845(-1);
            int var5 = arg0.method2845(-1);
            int var6 = arg0.method2845(-1);
            int var7 = arg0.method2845(-1);
            int var8 = arg0.method2845(-1);
            this.field9821 = class531.method3019(var6, var3, var4, 13924, var5, var8, var7);
        }
    }
}
