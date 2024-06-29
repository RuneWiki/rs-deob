import jaggl.OpenGL;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class753 extends class192 implements class465 {

    @OriginalMember(owner = "client!gfa", name = "I", descriptor = "I")
    private int field10527;

    @OriginalMember(owner = "client!gfa", name = "J", descriptor = "I")
    private int field10528;

    @OriginalMember(owner = "client!gfa", name = "y", descriptor = "I")
    public static int field10517 = 0;

    @OriginalMember(owner = "client!gfa", name = "w", descriptor = "I")
    public static int field10515;

    @OriginalMember(owner = "client!gfa", name = "x", descriptor = "I")
    public static int field10516;

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "I")
    public static int field10518;

    @OriginalMember(owner = "client!gfa", name = "A", descriptor = "I")
    public static int field10519;

    @OriginalMember(owner = "client!gfa", name = "C", descriptor = "I")
    public static int field10521;

    @OriginalMember(owner = "client!gfa", name = "D", descriptor = "I")
    public static int field10522;

    @OriginalMember(owner = "client!gfa", name = "E", descriptor = "I")
    public static int field10523;

    @OriginalMember(owner = "client!gfa", name = "F", descriptor = "I")
    public static int field10524;

    @OriginalMember(owner = "client!gfa", name = "G", descriptor = "I")
    public static int field10525;

    @OriginalMember(owner = "client!gfa", name = "H", descriptor = "I")
    public static int field10526;

    @OriginalMember(owner = "client!gfa", name = "K", descriptor = "I")
    public static int field10529;

    @OriginalMember(owner = "client!gfa", name = "L", descriptor = "I")
    public static int field10530;

    @OriginalMember(owner = "client!gfa", name = "B", descriptor = "Lpk;")
    public static class198 field10520;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gfa", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field10531;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(B)Z")
    public final boolean method1266(byte arg0) {
        ++field10526;
        int var2 = 0 / ((arg0 - -60) / 32);
        return false;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIIII[II)V")
    public final void method1268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        if (arg4 == 0) {
            arg4 = arg1;
        }
        super.field2896.method2294(this, -2);
        ++field10525;
        if (~arg1 != ~arg4) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Di(super.field2907, 0, arg2, arg5, arg1, arg3, 32993, super.field2896.field9922, arg6, arg0);
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
        int var9 = -48 / ((-22 - arg7) / 62);
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lno;Lpd;II[FII)V")
    public class753(class704 arg0, class259 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class256.field3681, arg2 * arg3, false);
        this.field10527 = arg3;
        this.field10528 = arg2;
        super.field2896.method2294(this, -2);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field2907, 0, this.method1330((byte) -37), arg2, arg3, 0, class489.method2929(super.field2904, 6407), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B[B)V")
    public static final void method4196(byte arg0, byte[] arg1) {
        ++field10516;
        class645 var2 = new class645(arg1);
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = var2.method3745(-6314);
                if (var4 == 0) {
                    if (!var3) {
                        if (class272.field3874 == null) {
                            class143.field1872 = 4;
                            class177.field2748 = new int[4];
                            class272.field3874 = new int[4];
                        }
                        for (int var5 = 0; var5 < class272.field3874.length; ++var5) {
                            class272.field3874[var5] = 0;
                            class177.field2748[var5] = var5 * 20;
                        }
                    }
                    int var6 = -125 % ((68 - arg0) / 55);
                    return;
                }
                if (var4 != 1) {
                    if (var4 == 2) {
                        class649.field9150 = var2.method3712((byte) 70);
                    } else if (~var4 == -4) {
                        class143.field1872 = var2.method3745(-6314);
                        class177.field2748 = new int[class143.field1872];
                        class272.field3874 = new int[class143.field1872];
                    }
                } else {
                    if (class272.field3874 == null) {
                        class177.field2748 = new int[4];
                        class272.field3874 = new int[4];
                        class143.field1872 = 4;
                    }
                    var3 = true;
                    for (int var7 = 0; class272.field3874.length > var7; ++var7) {
                        class272.field3874[var7] = var2.method3756(65536);
                        class177.field2748[var7] = var2.method3756(65536);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIIIII[BLpd;)V")
    public final void method1265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, class259 arg8) {
        super.field2896.method2294(this, -2);
        ++field10522;
        if (arg4 == 0) {
            arg4 = arg1;
        }
        OpenGL.glPixelStorei(3317, 1);
        if (~arg1 != ~arg4) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        OpenGL.glTexSubImage2Dub(super.field2907, 0, arg6, arg0, arg1, arg5, class489.method2929(arg8, 6407), 5121, arg7, arg2);
        if (~arg1 != ~arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg3 >= -67) {
            this.method1266((byte) 9);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(FI)F")
    public final float method1273(float arg0, int arg1) {
        if (arg1 > -72) {
            return 0.30095345F;
        } else {
            ++field10518;
            return arg0;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lno;II[III)V")
    public class753(class704 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class752.field10511, class256.field3677, arg1 * arg2, false);
        this.field10528 = arg1;
        this.field10527 = arg2;
        super.field2896.method2294(this, -2);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field2907, 0, 6408, this.field10528, this.field10527, 0, 32993, super.field2896.field9922, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BF)F")
    public final float method1263(byte arg0, float arg1) {
        if (arg0 != 109) {
            return -0.1979763F;
        } else {
            ++field10529;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "(I)V")
    public static void method4197(int arg0) {
        field10520 = null;
        if (arg0 != -6467) {
            method4196((byte) -109, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)I")
    public final int method1264(int arg0) {
        ++field10519;
        if (arg0 != 21110) {
            this.method1263((byte) -49, 0.97064376F);
        }
        return this.field10527;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZBZ)V")
    public final void method1272(boolean arg0, byte arg1, boolean arg2) {
        ++field10524;
        if (arg1 > -65) {
            this.field10527 = 12;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I[IIIIII)V")
    public final void method1271(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field10521;
        int[] var8 = new int[this.field10528 * this.field10527];
        super.field2896.method2294(this, -2);
        OpenGL.glGetTexImagei(super.field2907, 0, 32993, 5121, var8, 0);
        if (arg5 == -4685) {
            for (int var9 = 0; arg2 > var9; ++var9) {
                class319.method2016(var8, (arg2 + -1 + -var9 + arg3) * this.field10528, arg1, arg6 * var9 + arg4, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(Z)V")
    public static final void method4198(boolean arg0) {
        try {
            Method var1 = (field10531 != null ? field10531 : (field10531 = method4200("java.lang.Runtime"))).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class11.field154 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        if (arg0) {
            field10517 = -94;
        }
        ++field10530;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)I")
    public final int method1262(byte arg0) {
        ++field10515;
        return arg0 > -37 ? -31 : this.field10528;
    }

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "(I)V")
    public static final void method4199(int arg0) {
        if (arg0 != -4565) {
            method4198(true);
        }
        ++field10523;
        if (class324.field4632 == null) {
            class324.field4632 = new int[65536];
            double var1 = Math.random() * 0.03D - 0.015D + 0.7D;
            for (int var3 = 0; var3 < 65536; ++var3) {
                double var4 = (double) ((64742 & var3) >> 10) / 64.0D + 0.0078125D;
                double var6 = (double) (var3 >> 7 & 7) / 8.0D + 0.0625D;
                double var8 = (double) (127 & var3) / 128.0D;
                double var10 = var8;
                double var12 = var8;
                double var14 = var8;
                if (var6 != 0.0D) {
                    double var16;
                    if (!(var8 < 0.5D)) {
                        var16 = var6 + var8 + -(var6 * var8);
                    } else {
                        var16 = (var6 + 1.0D) * var8;
                    }
                    double var18 = var8 * 2.0D + -var16;
                    double var20 = var4 + 0.3333333333333333D;
                    if (var20 > 1.0D) {
                        --var20;
                    }
                    double var24 = var4 - 0.3333333333333333D;
                    if (var24 < 0.0D) {
                        ++var24;
                    }
                    if (var20 * 6.0D < 1.0D) {
                        var10 = (var16 - var18) * 6.0D * var20 + var18;
                    } else if (var20 * 2.0D < 1.0D) {
                        var10 = var16;
                    } else if (!(var20 * 3.0D < 2.0D)) {
                        var10 = var18;
                    } else {
                        var10 = (0.6666666666666666D - var20) * (-var18 + var16) * 6.0D + var18;
                    }
                    if (!(var4 * 6.0D < 1.0D)) {
                        if (!(var4 * 2.0D < 1.0D)) {
                            if (var4 * 3.0D < 2.0D) {
                                var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                            } else {
                                var12 = var18;
                            }
                        } else {
                            var12 = var16;
                        }
                    } else {
                        var12 = (-var18 + var16) * 6.0D * var4 + var18;
                    }
                    if (var24 * 6.0D < 1.0D) {
                        var14 = (-var18 + var16) * 6.0D * var24 + var18;
                    } else if (!(var24 * 2.0D < 1.0D)) {
                        if (var24 * 3.0D < 2.0D) {
                            var14 = (0.6666666666666666D - var24) * (-var18 + var16) * 6.0D + var18;
                        } else {
                            var14 = var18;
                        }
                    } else {
                        var14 = var16;
                    }
                }
                double var26 = Math.pow(var10, var1);
                double var28 = Math.pow(var12, var1);
                double var30 = Math.pow(var14, var1);
                int var32 = (int) (var26 * 256.0D);
                int var33 = (int) (var28 * 256.0D);
                int var34 = (int) (var30 * 256.0D);
                int var35 = (var32 << 16) - (-(var33 << 8) - var34);
                class324.field4632[var3] = var35;
            }
        }
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lno;Lpd;II[BII)V")
    public class753(class704 arg0, class259 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class256.field3677, arg2 * arg3, false);
        this.field10527 = arg3;
        this.field10528 = arg2;
        super.field2896.method2294(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field2907, 0, this.method1330((byte) -37), arg2, arg3, 0, class489.method2929(super.field2904, 6407), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lno;Lpd;Lok;II)V")
    public class753(class704 arg0, class259 arg1, class256 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field10527 = arg4;
        this.field10528 = arg3;
        super.field2896.method2294(this, -2);
        OpenGL.glTexImage2Dub(super.field2907, 0, this.method1330((byte) -37), arg3, arg4, 0, class489.method2929(super.field2904, 6407), class754.method4205(super.field2899, 94), (byte[]) null, 0);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4200(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
