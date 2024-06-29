import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class37 {

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "Ljava/lang/String;")
    public static String field811 = null;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field807 = 0;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field804 = 0;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "[Lbn;")
    public static class75[] field810;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "[[[Lee;")
    public static class312[][][] field814;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 5)
    public static void method267(byte arg0) {
        field811 = null;
        field814 = (class312[][][]) null;
        field810 = null;
        if (arg0 != -42) {
            method270(-54);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "()V", line = 39)
    public static final void method268() {
        GL var0 = class241.field4012;
        var0.glDisableClientState(32886);
        class241.method1716(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class241.method1689();
        for (int var1 = 0; var1 < class341.field5399[0].length; var1++) {
            class102 var2 = class341.field5399[0][var1];
            if (var2.field1861 >= 0 && class125.method899((byte) -74, class305.field4968.method63(var2.field1861, -1))) {
                var0.glColor4fv(class147.method1057(false, var2.field1872), 0);
                float var3 = 201.5F - (var2.field1858 ? 1.0F : 0.5F);
                var2.method773(class353.field5644, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class241.method1695();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class241.method1700();
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([IILvb;Lsd;[[FII[[I[[FI[[F)V", line = 73)
    public static final void method269(int[] arg0, int arg1, class63 arg2, class33 arg3, float[][] arg4, int arg5, int arg6, int[][] arg7, float[][] arg8, int arg9, float[][] arg10) {
        if (arg6 > -59) {
            return;
        }
        field813++;
        int[] var11 = new int[arg0.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg0[var12 + var12];
            int var14 = arg0[var12 + var12 + 1];
            if (arg9 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg9 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg9 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg10[arg5][arg1];
                var18 = arg8[arg5][arg1];
                var19 = arg4[arg5][arg1];
            } else if (var13 == 128 && var14 == 0) {
                var18 = arg8[arg5 + 1][arg1];
                var17 = arg10[arg5 + 1][arg1];
                var19 = arg4[arg5 + 1][arg1];
            } else if (var13 == 128 && var14 == 128) {
                var17 = arg10[arg5 + 1][arg1 + 1];
                var18 = arg8[arg5 + 1][arg1 + 1];
                var19 = arg4[arg5 + 1][arg1 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var18 = arg8[arg5][arg1 + 1];
                var17 = arg10[arg5][arg1 + 1];
                var19 = arg4[arg5][arg1 + 1];
            } else {
                float var20 = (float) var13 / 128.0F;
                float var21 = arg8[arg5][arg1];
                float var22 = (arg8[arg5 + 1][arg1] - var21) * var20 + var21;
                float var23 = (float) var14 / 128.0F;
                float var24 = arg10[arg5][arg1];
                float var25 = arg8[arg5][arg1 + 1];
                float var26 = (arg8[arg5 + 1][arg1 + 1] - var25) * var20 + var25;
                var18 = (var26 - var22) * var23 + var22;
                float var27 = arg10[arg5][arg1 + 1];
                float var28 = arg4[arg5][arg1 + 1];
                float var29 = (arg10[arg5 + 1][arg1] - var24) * var20 + var24;
                float var30 = (arg4[arg5 + 1][arg1 + 1] - var28) * var20 + var28;
                float var31 = arg4[arg5][arg1];
                float var32 = (arg10[arg5 + 1][arg1 + 1] - var27) * var20 + var27;
                var17 = (var32 - var29) * var23 + var29;
                float var33 = (arg4[arg5 + 1][arg1] - var31) * var20 + var31;
                var19 = (var30 - var33) * var23 + var33;
            }
            int var34 = class171.method1216(arg5, var13, arg1, (byte) -125, arg7, var14);
            int var35 = (arg1 << 7) + var14;
            int var36 = (arg5 << 7) + var13;
            var11[var12] = arg2.method512(arg3, var36, var34, var35, var17, var18, var19);
        }
        arg2.method510(var11);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)I", line = 192)
    public static final int method270(int arg0) {
        field809++;
        if (arg0 != -3) {
            method270(116);
        }
        return class274.field4473 && class261.field4307[81] && class137.field2343 > 2 ? class73.field1327[class137.field2343 - 2] : class73.field1327[class137.field2343 - 1];
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V", line = 205)
    public class37() {
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lfn;)V", line = 207)
    public class37(class37 arg0) {
        this.field812 = arg0.field812;
        this.field815 = arg0.field815;
        this.field816 = arg0.field816;
        this.field808 = arg0.field808;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZ)V", line = 219)
    public static final void method271(int arg0, boolean arg1) {
        if (!arg1) {
            method271(-82, true);
        }
        field805++;
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class201.field3369 += arg0 * 128;
        if (class201.field3369 > class161.field2716.length) {
            class201.field3369 -= class161.field2716.length;
            int var3 = (int) (Math.random() * 12.0D);
            class7.method67((byte) 35, class199.field3347[var3]);
        }
        int var4 = (var2 - arg0) * 128;
        int var5 = 0;
        int var6 = arg0 * 128;
        for (int var7 = 0; var7 < var4; var7++) {
            int var8 = class349.field5591[var5 + var6] - class161.field2716[class161.field2716.length - 1 & class201.field3369 + var5] * arg0 / 6;
            if (var8 < 0) {
                var8 = 0;
            }
            class349.field5591[var5++] = var8;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class349.field5591[var10 + var11] = 255;
                } else {
                    class349.field5591[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg0; var13++) {
            class7.field254[var13] = class7.field254[arg0 + var13];
        }
        for (int var14 = var2 - arg0; var14 < var2; var14++) {
            class7.field254[var14] = (int) (Math.sin((double) class232.field3801 / 14.0D) * 16.0D + Math.sin((double) class232.field3801 / 15.0D) * 14.0D + Math.sin((double) class232.field3801 / 16.0D) * 12.0D);
            class232.field3801++;
        }
        class92.field1634 += arg0;
        int var15 = (arg0 + (class267.field4371 & 0x1)) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class92.field1634; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class349.field5591[(var18 << 7) + var17] = 192;
        }
        class92.field1634 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var15 + var22) < 128) {
                    var20 += class349.field5591[var15 + var22 + var21];
                }
                if ((var22 - (var15 + 1)) >= 0) {
                    var20 -= class349.field5591[var21 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class199.field3342[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > var15 + var25) {
                    var24 += class199.field3342[var23 + var26 + (var15 * 128)];
                }
                if ((-(var15 - var25) - 1) >= 0) {
                    var24 -= class199.field3342[var23 + var26 - ((var15 + 1) * 128)];
                }
                if (var25 >= 0) {
                    class349.field5591[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }
}
