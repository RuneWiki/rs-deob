import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class495 extends class661 {

    @OriginalMember(owner = "client!iaa", name = "D", descriptor = "I")
    public static int field6867 = 0;

    @OriginalMember(owner = "client!iaa", name = "i", descriptor = "F")
    public float field6846;

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "F")
    public float field6849;

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "F")
    public float field6850;

    @OriginalMember(owner = "client!iaa", name = "p", descriptor = "F")
    public float field6853;

    @OriginalMember(owner = "client!iaa", name = "r", descriptor = "F")
    public float field6855;

    @OriginalMember(owner = "client!iaa", name = "w", descriptor = "F")
    public float field6860;

    @OriginalMember(owner = "client!iaa", name = "x", descriptor = "F")
    public float field6861;

    @OriginalMember(owner = "client!iaa", name = "E", descriptor = "F")
    public float field6868;

    @OriginalMember(owner = "client!iaa", name = "F", descriptor = "F")
    public float field6869;

    @OriginalMember(owner = "client!iaa", name = "H", descriptor = "F")
    public float field6871;

    @OriginalMember(owner = "client!iaa", name = "Q", descriptor = "F")
    public float field6880;

    @OriginalMember(owner = "client!iaa", name = "T", descriptor = "F")
    public float field6883;

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!iaa", name = "q", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!iaa", name = "s", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!iaa", name = "t", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!iaa", name = "u", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!iaa", name = "v", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!iaa", name = "y", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!iaa", name = "A", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!iaa", name = "B", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!iaa", name = "C", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!iaa", name = "G", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!iaa", name = "I", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!iaa", name = "J", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!iaa", name = "K", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!iaa", name = "L", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!iaa", name = "M", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!iaa", name = "N", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!iaa", name = "O", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!iaa", name = "P", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!iaa", name = "R", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!iaa", name = "S", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!iaa", name = "U", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "Ldc;")
    public static class5 field6863;

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "(I)V", line = 4)
    public final void method742(int arg0) {
        field6878++;
        this.field6883 = 1.0F;
        this.field6869 = this.field6868 = class734.field9904[arg0 & 0x3FFF];
        this.field6860 = class734.field9902[arg0 & 0x3FFF];
        this.field6880 = this.field6846 = this.field6861 = this.field6871 = this.field6855 = this.field6853 = this.field6850 = 0.0F;
        this.field6849 = -this.field6860;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZFFFF[F)V", line = 16)
    public final void method2909(boolean arg0, float arg1, float arg2, float arg3, float arg4, float[] arg5) {
        field6864++;
        float var8;
        float var9;
        float var10;
        if ((arg1 > 0.00390625F) || (arg1 < -0.00390625F)) {
            float var12 = -arg4 / arg1;
            var8 = this.field6869 * var12 + this.field6846;
            var10 = this.field6855 * var12 + this.field6850;
            var9 = this.field6860 * var12 + this.field6871;
        } else if ((arg3 > 0.00390625F) || (arg3 < -0.00390625F)) {
            float var11 = -arg4 / arg3;
            var9 = this.field6868 * var11 + this.field6871;
            var8 = this.field6849 * var11 + this.field6846;
            var10 = this.field6853 * var11 + this.field6850;
        } else {
            float var7 = -arg4 / arg2;
            var8 = this.field6880 * var7 + this.field6846;
            var9 = this.field6861 * var7 + this.field6871;
            var10 = this.field6883 * var7 + this.field6850;
        }
        arg5[0] = this.field6880 * arg2 + this.field6869 * arg1 + this.field6849 * arg3;
        arg5[2] = this.field6883 * arg2 + this.field6855 * arg1 + this.field6853 * arg3;
        if (!arg0) {
            this.field6871 = -0.4364811F;
        }
        arg5[1] = this.field6861 * arg2 + this.field6868 * arg3 + this.field6860 * arg1;
        arg5[3] = -(arg5[2] * var10 + arg5[0] * var8 + arg5[1] * var9);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III)V", line = 60)
    public final void method752(int arg0, int arg1, int arg2) {
        this.field6850 += arg2;
        this.field6871 += arg1;
        this.field6846 += arg0;
        field6884++;
    }

    @OriginalMember(owner = "client!iaa", name = "i", descriptor = "(I)V", line = 70)
    public static void method2910(int arg0) {
        field6863 = null;
        if (arg0 <= 8) {
            field6863 = null;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "(I)V", line = 83)
    public final void method756(int arg0) {
        field6862++;
        float var2 = class734.field9904[arg0 & 0x3FFF];
        float var3 = class734.field9902[arg0 & 0x3FFF];
        float var4 = this.field6860;
        float var5 = this.field6868;
        float var6 = this.field6861;
        this.field6860 = var2 * var4 - this.field6855 * var3;
        float var7 = this.field6871;
        this.field6855 = this.field6855 * var2 + var3 * var4;
        this.field6868 = var2 * var5 - (this.field6853 * var3);
        this.field6861 = var2 * var6 - this.field6883 * var3;
        this.field6853 = this.field6853 * var2 + var3 * var5;
        this.field6883 = this.field6883 * var2 + var3 * var6;
        this.field6871 = var2 * var7 - (this.field6850 * var3);
        this.field6850 = this.field6850 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(FIFIIIF)V", line = 110)
    public final void method2911(float arg0, int arg1, float arg2, int arg3, int arg4, int arg5, float arg6) {
        if (arg4 == 0) {
            this.field6860 = this.field6855 = this.field6849 = this.field6853 = this.field6880 = this.field6861 = 0.0F;
            this.field6869 = arg1;
            this.field6883 = 1.0F;
            this.field6868 = arg3;
        } else {
            float var8 = class734.field9904[arg4 & 0x3FFF];
            float var9 = class734.field9902[arg4 & 0x3FFF];
            this.field6860 = (float) arg1 * var9;
            this.field6868 = (float) arg3 * var8;
            this.field6855 = this.field6853 = this.field6880 = this.field6861 = 0.0F;
            this.field6883 = 1.0F;
            this.field6849 = (float) arg3 * -var9;
            this.field6869 = (float) arg1 * var8;
        }
        field6845++;
        this.field6846 = arg2;
        this.field6871 = arg6;
        this.field6850 = arg0;
        int var10 = -88 / ((arg5 - 6) / 39);
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(III[I)V", line = 143)
    public final void method770(int arg0, int arg1, int arg2, int[] arg3) {
        field6866++;
        arg3[0] = (int) ((float) arg2 * this.field6880 + (float) arg0 * this.field6869 + (float) arg1 * this.field6849 + this.field6846);
        arg3[2] = (int) ((float) arg2 * this.field6883 + (float) arg0 * this.field6855 + (float) arg1 * this.field6853 + this.field6850);
        arg3[1] = (int) ((float) arg2 * this.field6861 + (float) arg0 * this.field6860 + (float) arg1 * this.field6868 + this.field6871);
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(III)V", line = 155)
    public final void method744(int arg0, int arg1, int arg2) {
        this.field6850 = arg2;
        this.field6846 = arg0;
        this.field6860 = this.field6855 = this.field6849 = this.field6853 = this.field6880 = this.field6861 = 0.0F;
        this.field6871 = arg1;
        this.field6869 = this.field6868 = this.field6883 = 1.0F;
        field6848++;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "([I)V", line = 167)
    public final void method769(int[] arg0) {
        field6874++;
        float var2 = (float) arg0[0] - this.field6846;
        float var3 = (float) arg0[1] - this.field6871;
        float var4 = (float) arg0[2] - this.field6850;
        arg0[1] = (int) (this.field6853 * var4 + this.field6868 * var3 + this.field6849 * var2);
        arg0[2] = (int) (this.field6883 * var4 + this.field6880 * var2 + this.field6861 * var3);
        arg0[0] = (int) (this.field6855 * var4 + this.field6869 * var2 + this.field6860 * var3);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIII)V", line = 184)
    public final void method747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6881++;
        float var7 = class734.field9904[arg3 & 0x3FFF];
        float var8 = class734.field9902[arg3 & 0x3FFF];
        float var9 = class734.field9904[arg4 & 0x3FFF];
        float var10 = class734.field9902[arg4 & 0x3FFF];
        float var11 = class734.field9904[arg5 & 0x3FFF];
        float var12 = class734.field9902[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field6861 = var9 * var13 + var10 * var12;
        this.field6855 = var7 * var10;
        this.field6869 = var9 * var11 + var10 * var14;
        this.field6868 = var7 * var11;
        this.field6853 = -var8;
        this.field6849 = var7 * var12;
        this.field6883 = var7 * var9;
        this.field6880 = -var10 * var11 + var9 * var14;
        this.field6860 = -var9 * var12 + var10 * var13;
        this.field6850 = (float) (-arg0) * this.field6855 - (float) arg1 * this.field6853 - (float) arg2 * this.field6883;
        this.field6846 = (float) (-arg0) * this.field6869 - ((float) arg1 * this.field6849) - (float) arg2 * this.field6880;
        this.field6871 = (float) (-arg0) * this.field6860 - (float) arg1 * this.field6868 - ((float) arg2 * this.field6861);
    }

    @OriginalMember(owner = "client!iaa", name = "g", descriptor = "(I)V", line = 222)
    public final void method768(int arg0) {
        field6873++;
        float var2 = class734.field9904[arg0 & 0x3FFF];
        float var3 = class734.field9902[arg0 & 0x3FFF];
        float var4 = this.field6869;
        float var5 = this.field6849;
        float var6 = this.field6880;
        this.field6869 = var2 * var4 - this.field6860 * var3;
        float var7 = this.field6846;
        this.field6860 = this.field6860 * var2 + var3 * var4;
        this.field6849 = var2 * var5 - (this.field6868 * var3);
        this.field6880 = var2 * var6 - (this.field6861 * var3);
        this.field6868 = this.field6868 * var2 + var3 * var5;
        this.field6861 = this.field6861 * var2 + var3 * var6;
        this.field6846 = var2 * var7 - (this.field6871 * var3);
        this.field6871 = this.field6871 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "(I)[F", line = 256)
    public final float[] method2912(int arg0) {
        class427.field6135[0] = this.field6869;
        class427.field6135[9] = this.field6861;
        class427.field6135[12] = this.field6846;
        field6876++;
        class427.field6135[arg0] = this.field6860;
        class427.field6135[6] = this.field6853;
        class427.field6135[4] = this.field6849;
        class427.field6135[10] = this.field6883;
        class427.field6135[8] = this.field6880;
        class427.field6135[14] = this.field6850;
        class427.field6135[13] = this.field6871;
        class427.field6135[2] = this.field6855;
        class427.field6135[5] = this.field6868;
        return class427.field6135;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "()Lbca;", line = 276)
    public final class661 method763() {
        field6847++;
        class495 var1 = new class495();
        var1.field6846 = this.field6846;
        var1.field6849 = this.field6849;
        var1.field6868 = this.field6868;
        var1.field6883 = this.field6883;
        var1.field6871 = this.field6871;
        var1.field6861 = this.field6861;
        var1.field6880 = this.field6880;
        var1.field6869 = this.field6869;
        var1.field6855 = this.field6855;
        var1.field6860 = this.field6860;
        var1.field6850 = this.field6850;
        var1.field6853 = this.field6853;
        return var1;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V", line = 299)
    public static final void method2913(int arg0, int arg1) {
        class377.field5333 = arg1;
        field6854++;
        if (arg0 <= 113) {
            field6863 = null;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "(I)V", line = 311)
    public final void method2914(int arg0) {
        this.field6853 = -this.field6853;
        field6859++;
        this.field6860 = -this.field6860;
        if (arg0 != 3128) {
            return;
        }
        this.field6868 = -this.field6868;
        this.field6855 = -this.field6855;
        this.field6883 = -this.field6883;
        this.field6861 = -this.field6861;
        this.field6871 = -this.field6871;
        this.field6850 = -this.field6850;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III[I)V", line = 329)
    public final void method750(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg1 - this.field6871);
        field6872++;
        int var6 = (int) ((float) arg2 - this.field6850);
        int var7 = (int) ((float) arg0 - this.field6846);
        arg3[0] = (int) ((float) var6 * this.field6855 + (float) var5 * this.field6860 + (float) var7 * this.field6869);
        arg3[2] = (int) ((float) var6 * this.field6883 + (float) var5 * this.field6861 + (float) var7 * this.field6880);
        arg3[1] = (int) ((float) var6 * this.field6853 + (float) var5 * this.field6868 + (float) var7 * this.field6849);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)Lma;", line = 348)
    public static final class12 method2915(boolean arg0) {
        field6875++;
        if (arg0) {
            method2915(true);
        }
        return class266.field3769;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lbca;)V", line = 359)
    public final void method778(class661 arg0) {
        field6857++;
        class495 var2 = (class495) arg0;
        this.field6850 = var2.field6850;
        this.field6868 = var2.field6868;
        this.field6869 = var2.field6869;
        this.field6880 = var2.field6880;
        this.field6846 = var2.field6846;
        this.field6853 = var2.field6853;
        this.field6860 = var2.field6860;
        this.field6871 = var2.field6871;
        this.field6883 = var2.field6883;
        this.field6861 = var2.field6861;
        this.field6855 = var2.field6855;
        this.field6849 = var2.field6849;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V", line = 380)
    public final void method748(int arg0) {
        field6879++;
        this.field6868 = 1.0F;
        this.field6869 = this.field6883 = class734.field9904[arg0 & 0x3FFF];
        this.field6880 = class734.field9902[arg0 & 0x3FFF];
        this.field6855 = -this.field6880;
        this.field6849 = this.field6846 = this.field6860 = this.field6861 = this.field6871 = this.field6853 = this.field6850 = 0.0F;
    }

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "(I)V", line = 392)
    public final void method749(int arg0) {
        field6856++;
        this.field6869 = 1.0F;
        this.field6868 = this.field6883 = class734.field9904[arg0 & 0x3FFF];
        this.field6853 = class734.field9902[arg0 & 0x3FFF];
        this.field6861 = -this.field6853;
        this.field6849 = this.field6880 = this.field6846 = this.field6860 = this.field6871 = this.field6855 = this.field6850 = 0.0F;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I[[BLvaa;)V", line = 404)
    public static final void method2916(int arg0, byte[][] arg1, class469 arg2) {
        if (arg0 != -8212) {
            method2916(65, null, null);
        }
        field6851++;
        for (int var3 = 0; var3 < arg2.field3692; var3++) {
            class15.method120(false);
            for (int var4 = 0; var4 < (class376.field5325 >> 3); var4++) {
                for (int var5 = 0; var5 < (class175.field2711 >> 3); var5++) {
                    int var6 = class554.field7662[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg2.field3671 || var7 == 0) {
                            int var8 = (var6 & 0x6) >> 1;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FF9) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class199.field2905.length; var12++) {
                                if (class199.field2905[var12] == var11 && arg1[var12] != null) {
                                    arg2.method2760((var9 & 0x7) * 8, var8, arg1[var12], var7, (var10 & 0x7) * 8, class272.field3822, var5 * 8, var4 * 8, arg0 + 8219, class19.field295, var3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "()V", line = 484)
    public final void method745() {
        field6858++;
        this.field6869 = this.field6868 = this.field6883 = 1.0F;
        this.field6860 = this.field6855 = this.field6849 = this.field6853 = this.field6880 = this.field6861 = this.field6846 = this.field6871 = this.field6850 = 0.0F;
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)V", line = 494)
    public final void method774(int arg0) {
        field6865++;
        float var2 = class734.field9904[arg0 & 0x3FFF];
        float var3 = class734.field9902[arg0 & 0x3FFF];
        float var4 = this.field6869;
        float var5 = this.field6849;
        float var6 = this.field6880;
        this.field6869 = this.field6855 * var3 + var2 * var4;
        float var7 = this.field6846;
        this.field6855 = this.field6855 * var2 - var3 * var4;
        this.field6849 = this.field6853 * var3 + var2 * var5;
        this.field6853 = this.field6853 * var2 - (var3 * var5);
        this.field6880 = this.field6883 * var3 + var2 * var6;
        this.field6883 = this.field6883 * var2 - (var3 * var6);
        this.field6846 = this.field6850 * var3 + var2 * var7;
        this.field6850 = this.field6850 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(Z)[F", line = 522)
    public final float[] method2917(boolean arg0) {
        if (!arg0) {
            this.field6855 = 0.66213727F;
        }
        class427.field6135[14] = 0.0F;
        class427.field6135[0] = this.field6869;
        class427.field6135[13] = 0.0F;
        class427.field6135[1] = this.field6860;
        class427.field6135[12] = 0.0F;
        class427.field6135[10] = this.field6883;
        class427.field6135[5] = this.field6868;
        class427.field6135[6] = this.field6853;
        class427.field6135[9] = this.field6861;
        field6877++;
        class427.field6135[2] = this.field6855;
        class427.field6135[4] = this.field6849;
        class427.field6135[8] = this.field6880;
        return class427.field6135;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lbca;I)V", line = 546)
    public final void method2918(class661 arg0, int arg1) {
        field6870++;
        class495 var3 = (class495) arg0;
        this.field6880 = var3.field6855;
        if (arg1 != -7929) {
            this.method749(52);
        }
        this.field6849 = var3.field6860;
        this.field6869 = var3.field6869;
        this.field6855 = var3.field6880;
        this.field6861 = var3.field6853;
        this.field6860 = var3.field6849;
        this.field6868 = var3.field6868;
        this.field6846 = -(this.field6880 * var3.field6850 + this.field6869 * var3.field6846 + this.field6849 * var3.field6871);
        this.field6853 = var3.field6861;
        this.field6883 = var3.field6883;
        this.field6871 = -(this.field6861 * var3.field6850 + this.field6868 * var3.field6871 + this.field6860 * var3.field6846);
        this.field6850 = -(this.field6883 * var3.field6850 + this.field6855 * var3.field6846 + this.field6853 * var3.field6871);
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(B)V", line = 579)
    public static final void method2919(byte arg0) {
        field6882++;
        if (arg0 != 41) {
            field6867 = 38;
        }
        for (class397 var1 = (class397) class754.field10532.method1269(4); var1 != null; var1 = (class397) class754.field10532.method1264((byte) 117)) {
            if (var1.field5818) {
                var1.method2486((byte) 21);
            }
        }
        for (class397 var2 = (class397) client.field4233.method1269(4); var2 != null; var2 = (class397) client.field4233.method1264((byte) 39)) {
            if (var2.field5818) {
                var2.method2486((byte) 21);
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "()V", line = 618)
    public class495() {
        this.method745();
    }

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "(III[I)V", line = 627)
    public final void method771(int arg0, int arg1, int arg2, int[] arg3) {
        field6852++;
        arg3[1] = (int) ((float) arg2 * this.field6861 + (float) arg0 * this.field6860 + (float) arg1 * this.field6868);
        arg3[2] = (int) ((float) arg2 * this.field6883 + (float) arg0 * this.field6855 + (float) arg1 * this.field6853);
        arg3[0] = (int) ((float) arg2 * this.field6880 + (float) arg0 * this.field6869 + (float) arg1 * this.field6849);
    }
}
