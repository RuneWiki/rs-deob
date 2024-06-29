import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class312 {

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Z")
    private boolean field4256 = true;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    private int field4260 = -1;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    private int field4248;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "[Lwe;")
    private class280[] field4251;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    private int field4263;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    private int field4246;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    private int field4259;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "[Lwe;")
    private class280[] field4254;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lwe;")
    private class280 field4262;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    private int field4249;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    private int field4252;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Ll;")
    private class16 field4247;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "[I")
    public static int[] field4257;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 7)
    public static void method1806(byte arg0) {
        if (arg0 >= 43) {
            field4257 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lya;II)Z", line = 19)
    public final boolean method1807(class38 arg0, int arg1, int arg2) {
        if (this.field4260 != arg2) {
            this.field4260 = arg2;
            int var4 = class508.method3034(arg2, true);
            if (var4 > arg2) {
                var4 = class498.method2905(arg2, (byte) 117);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field4252 != var4) {
                this.field4252 = var4;
                this.field4247 = null;
            }
            if (this.field4251 != null) {
                this.field4249 = 0;
                int[] var5 = new int[this.field4251.length];
                for (int var6 = 0; var6 < this.field4251.length; var6++) {
                    class280 var7 = this.field4251[var6];
                    if (var7.method1661(this.field4246, this.field4259, this.field4248, this.field4260)) {
                        var5[this.field4249] = var7.field3834;
                        this.field4254[this.field4249++] = var7;
                    }
                }
                class104.method772(0, var5, this.field4254, (byte) -105, this.field4249 - 1);
            }
            this.field4256 = true;
        }
        if (arg1 != 0) {
            method1809(-121, -35, 114, -122, 19, 40, null);
        }
        field4253++;
        boolean var8 = false;
        if (this.field4256) {
            this.field4256 = false;
            for (int var9 = this.field4249 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field4254[var9].method1670(arg0, this.field4262);
                var8 |= var10;
                this.field4256 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 99)
    public final void method1808(int arg0) {
        if (arg0 != 0) {
            this.field4260 = 29;
        }
        field4255++;
        if (this.field4251 != null) {
            for (int var2 = 0; var2 < this.field4251.length; var2++) {
                this.field4251[var2].method1663();
            }
        }
        this.field4247 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIII[F)V", line = 130)
    public static final void method1809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        field4258++;
        if (arg0 > 0 && !class226.method1402(arg0, (byte) -114)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= arg2 || class226.method1402(arg1, (byte) -126)) {
            int var7 = class359.method2149(arg3, 4);
            int var8 = 0;
            int var9 = arg1 <= arg0 ? arg1 : arg0;
            int var10 = arg0 >> 1;
            int var11 = arg1 >> 1;
            float[] var12 = arg6;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg5, var8, arg4, arg0, arg1, 0, arg3, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg0 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg1 = var11;
                arg0 = var10;
                var12 = var15;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 224)
    public static final void method1810(int arg0) {
        class5.field44++;
        field4250++;
        class491.method2878((byte) 92, class40.field495);
        class481.field7027.method2302(arg0 ^ 0xFFFFFFFC, arg0);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILya;IIIIIIII)V", line = 234)
    public final void method1811(int arg0, class38 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4261++;
        int var11 = arg5 + arg8 & 0x3FFF;
        if (this.field4263 == -1) {
            arg1.method243(arg6, arg4, arg3, arg0, arg9, 0);
        } else {
            class166 var12 = class473.field6916.method1654(50, this.field4263);
            if (this.field4247 == null && class473.field6916.method1652(this.field4263, 29423)) {
                int[] var13 = var12.field2494 ? class473.field6916.method1650(this.field4252, this.field4263, true, 0.7F, false, this.field4252) : class473.field6916.method1651(this.field4252, (byte) -87, this.field4263, false, 0.7F, this.field4252);
                this.field4247 = arg1.method244(var13, 0, this.field4252, this.field4252, this.field4252);
            }
            if (!var12.field2494) {
                arg1.method243(arg6, arg4, arg3, arg0, arg9, 0);
            }
            if (this.field4247 != null) {
                int var14 = var12.field2494 ? 0 : 1;
                int var15 = arg0 * arg7 / -4096;
                int var16;
                for (var16 = (arg3 - arg0) / 2 + (arg0 * var11 / 4096); var16 > arg0; var16 -= arg0) {
                }
                while (arg0 < var15) {
                    var15 -= arg0;
                }
                while (var16 < 0) {
                    var16 += arg0;
                }
                while (var15 < 0) {
                    var15 += arg0;
                }
                for (int var17 = var16 - arg0; var17 < arg3; var17 += arg0) {
                    for (int var18 = var15 - arg0; var18 < arg0; var18 += arg0) {
                        this.field4247.method94(arg6 + var17, arg4 + var18, arg0, arg0, 1, 0, var14);
                    }
                }
            }
        }
        if (arg2 != -21927) {
            this.field4256 = false;
        }
        for (int var19 = this.field4249 - 1; var19 >= 0; var19--) {
            this.field4254[var19].method1662(arg1, arg6, arg4, arg3, arg0, arg7, var11);
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I[Lwe;IIII)V", line = 324)
    public class312(int arg0, class280[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4248 = arg5;
        this.field4251 = arg1;
        this.field4263 = arg0;
        this.field4246 = arg3;
        this.field4259 = arg4;
        if (arg1 == null) {
            this.field4254 = null;
            this.field4262 = null;
        } else {
            this.field4254 = new class280[arg1.length];
            this.field4262 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
