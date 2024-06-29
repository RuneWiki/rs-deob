import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class class433 implements class430 {

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "Lcba;")
    private class516 field5923 = class708.field9922;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public int field5915;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Ldc;")
    public class5 field5925;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Z")
    private boolean field5916;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    private int field5910;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Lhi;")
    public class193 field5922;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "Lne;")
    public class294 field5931;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    private int field5911;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "Lfda;")
    public static class296 field5920;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "[I")
    public static int[] field5912;

    @OriginalMember(owner = "client!ch", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2457(94);
        field5913++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(B)V")
    public static void method2454(byte arg0) {
        field5912 = null;
        field5920 = null;
        if (arg0 != 2) {
            method2456((byte) 20, 125, 104, 84);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I")
    private final int method2455(int arg0) {
        if (arg0 != 9728) {
            method2454((byte) 126);
        }
        field5927++;
        int var2 = this.field5931.field4155 * this.field5922.field2828 * this.field5910;
        return this.field5916 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BIII)I")
    public static final int method2456(byte arg0, int arg1, int arg2, int arg3) {
        field5928++;
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        int var4 = -11 % ((82 - arg0) / 35);
        return (arg1 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10) + (arg3 >> 1);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    private final void method2457(int arg0) {
        if (arg0 < 64) {
            this.field5923 = null;
        }
        field5917++;
        if (this.field5911 > 0) {
            this.field5925.method32(this.method2455(9728), this.field5911, -97);
            this.field5911 = 0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
    private final void method2458(int arg0, int arg1) {
        this.field5925.field1812 -= arg0;
        field5930++;
        if (arg1 > 69) {
            this.field5925.field1812 += this.method2455(9728);
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
    private final void method2459(int arg0) {
        field5914++;
        this.field5925.method897(this, true);
        if (class708.field9922 == this.field5923) {
            OpenGL.glTexParameteri(this.field5915, 10241, this.field5916 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field5915, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field5915, 10241, this.field5916 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field5915, 10240, 9728);
        }
        if (arg0 != -9524) {
            this.field5931 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[FII)V")
    public final void method2460(int arg0, int arg1, float[] arg2, int arg3, int arg4) {
        field5919++;
        if (arg4 < arg0 && !class230.method1441(true, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class230.method1441(true, arg1)) {
            int var6 = this.field5922.field2828;
            int var7 = 0;
            int var8 = arg0 < arg1 ? arg0 : arg1;
            int var9 = arg0 >> 1;
            int var10 = arg1 >> 1;
            float[] var11 = arg2;
            float[] var12 = new float[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg3, var7, this.method2461(-93), arg0, arg1, 0, class420.method2414(144, this.field5922), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg0 * var6;
                float[] var14 = var12;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var13 + var15;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            float var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var12[var16] = var26 * 0.25F;
                            var18 = var6 + var25;
                            var16 += var6;
                        }
                        var17 += var13;
                        var18 += var13;
                    }
                }
                var12 = var11;
                arg0 = var9;
                arg1 = var10;
                var11 = var14;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
    public final void method168(byte arg0) {
        field5921++;
        int var2 = this.field5925.method889(120);
        if (arg0 < 104) {
            method2456((byte) 82, 17, 93, 123);
        }
        int var3 = this.field5925.field137[var2];
        if (this.field5915 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field5915);
            this.field5925.field137[var2] = this.field5915;
        }
        OpenGL.glBindTexture(this.field5915, this.field5911);
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)I")
    public final int method2461(int arg0) {
        field5926++;
        if (class294.field4160 == this.field5931) {
            if (class88.field1335 == this.field5922) {
                return 6407;
            }
            if (class5.field100 == this.field5922) {
                return 6408;
            }
            if (class616.field8164 == this.field5922) {
                return 6406;
            }
            if (class390.field5155 == this.field5922) {
                return 6409;
            }
            if (class98.field1488 == this.field5922) {
                return 6410;
            }
            if (class199.field2887 == this.field5922) {
                return 6145;
            }
        } else if (class294.field4163 == this.field5931) {
            if (class88.field1335 == this.field5922) {
                return 34843;
            }
            if (class5.field100 == this.field5922) {
                return 34842;
            }
            if (class616.field8164 == this.field5922) {
                return 34844;
            }
            if (class390.field5155 == this.field5922) {
                return 34846;
            }
            if (class98.field1488 == this.field5922) {
                return 34847;
            }
            if (class199.field2887 == this.field5922) {
                return 6145;
            }
        } else if (class294.field4164 == this.field5931) {
            if (class88.field1335 == this.field5922) {
                return 34837;
            }
            if (class5.field100 == this.field5922) {
                return 34836;
            }
            if (class616.field8164 == this.field5922) {
                return 34838;
            }
            if (class390.field5155 == this.field5922) {
                return 34840;
            }
            if (class98.field1488 == this.field5922) {
                return 34841;
            }
            if (class199.field2887 == this.field5922) {
                return 6145;
            }
        }
        if (arg0 >= -87) {
            this.field5916 = true;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[IIII)V")
    public final void method2462(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field5929++;
        if (arg2 > 0 && !class230.method1441(true, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class230.method1441(true, arg4)) {
            throw new IllegalArgumentException("");
        } else if (class5.field100 != this.field5922) {
            throw new IllegalArgumentException("");
        } else if (arg3 == 22784) {
            int var6 = 0;
            int var7 = arg2 >= arg4 ? arg4 : arg2;
            int var8 = arg2 >> 1;
            int var9 = arg4 >> 1;
            int[] var10 = arg1;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var6, this.method2461(arg3 - 22875), arg2, arg4, 0, 32993, this.field5925.field144, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg2 + var13;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var13++];
                        int var20 = var10[var14++];
                        int var21 = var18 >> 8 & 0xFF;
                        int var22 = var10[var14++];
                        int var23 = (var18 & 0xFFF369) >> 16;
                        int var24 = var18 >> 24 & 0xFF;
                        int var25 = var18 & 0xFF;
                        int var26 = (var19 >> 16 & 0xFF) + var23;
                        int var27 = ((var19 & 0xFF78) >> 8) + var21;
                        int var28 = (var19 & 0xFF) + var25;
                        int var29 = (var19 >> 24 & 0xFF) + var24;
                        int var30 = (var20 >> 24 & 0xFF) + var29;
                        int var31 = ((var20 & 0xFFB4) >> 8) + var27;
                        int var32 = (var20 & 0xFF) + var28;
                        int var33 = ((var20 & 0xFFDE17) >> 16) + var26;
                        int var34 = (var22 >> 8 & 0xFF) + var31;
                        int var35 = ((var22 & 0xFF1200) >> 16) + var33;
                        int var36 = (var22 & 0xFF) + var32;
                        int var37 = (var22 >> 24 & 0xFF) + var30;
                        var11[var12++] = class220.method1393(class571.method3139(1020, var36) >> 2, class220.method1393(class220.method1393(class571.method3139(1020, var37) << 22, class571.method3139(16711680, var35 << 14)), class571.method3139(var34, 1020) << 6));
                    }
                    var13 += arg2;
                    var14 += arg2;
                }
                int[] var16 = var11;
                var11 = var10;
                var10 = var16;
                arg4 = var9;
                arg2 = var8;
                var6++;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var7 >>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lcba;I)V")
    public final void method166(class516 arg0, int arg1) {
        field5918++;
        if (this.field5923 != arg0) {
            this.field5923 = arg0;
            this.method2459(-9524);
        }
        if (arg1 != 7651) {
            method2454((byte) 126);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[BIII)V")
    public final void method2463(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field5924++;
        if (arg4 > 0 && !class230.method1441(true, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class230.method1441(true, arg3)) {
            int var6 = this.field5922.field2828;
            if (arg2 != 1875741761) {
                field5912 = null;
            }
            int var7 = 0;
            int var8 = arg4 >= arg3 ? arg3 : arg4;
            int var9 = arg4 >> 1;
            int var10 = arg3 >> 1;
            byte[] var11 = arg1;
            byte[] var12 = new byte[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg0, var7, this.method2461(arg2 - 1875741871), arg4, arg3, 0, class420.method2414(arg2 - 1875741617, this.field5922), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg4 * var6;
                byte[] var14 = var12;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var13 + var15;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            byte var21 = var11[var17];
                            int var22 = var6 + var17;
                            int var23 = var11[var22] + var21;
                            var17 = var6 + var22;
                            int var24 = var11[var18] + var23;
                            int var25 = var6 + var18;
                            int var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = (byte) (var26 >> 2);
                            var16 += var6;
                        }
                        var17 += var13;
                        var18 += var13;
                    }
                }
                var12 = var11;
                arg3 = var10;
                var11 = var14;
                arg4 = var9;
                var10 >>= 0x1;
                var7++;
                var9 >>= 0x1;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Ldc;ILhi;Lne;IZ)V")
    public class433(class5 arg0, int arg1, class193 arg2, class294 arg3, int arg4, boolean arg5) {
        this.field5915 = arg1;
        this.field5925 = arg0;
        this.field5916 = arg5;
        this.field5910 = arg4;
        this.field5922 = arg2;
        this.field5931 = arg3;
        OpenGL.glGenTextures(1, class178.field2734, 0);
        this.field5911 = class178.field2734[0];
        this.method2459(-9524);
        this.method2458(0, 104);
    }
}
