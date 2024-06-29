import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class520 extends class134 {

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Leo;")
    private class296 field7385;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public int field7403;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public int field7390;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "Lnv;")
    private class417 field7408;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    public int field7410;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "[I")
    private int[] field7407;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public int field7395;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "F")
    public float field7389;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "Lht;")
    private class579 field7400;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field7396 = -1;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "Z")
    public static boolean field7393 = false;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "Ltp;")
    public static class532 field7402 = null;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "[I")
    public static int[] field7406 = new int[13];

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "[F")
    public static float[] field7397 = new float[4];

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "Ldh;")
    public static class320 field7392 = new class320(22, 3);

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "Lpw;")
    private class704 field7388;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7404;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field7387;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method3049(int arg0) {
        field7402 = null;
        if (arg0 != 0) {
            field7402 = null;
        }
        field7406 = null;
        field7397 = null;
        field7392 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
    public final void method3050(int arg0, int arg1) {
        if (arg0 <= 36) {
            return;
        }
        field7398++;
        this.field7404.method3821();
        class583 var3 = this.field7408.method2607(4, false, arg1 * 4, this.field7387, (byte) -47);
        this.field7388 = new class704(var3, 5121, 4, 0);
        this.field7404 = null;
        this.field7387 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Loh;I)V")
    public static final void method3051(class404 arg0, int arg1) {
        if (arg1 == -17905) {
            class711.field10010 = arg0;
            field7386++;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIILvp;)V")
    public static final void method3052(int arg0, int arg1, int arg2, class188 arg3) {
        class691 var4 = class510.method3014(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field9736 = arg3;
        int var5 = class504.field7120 == class159.field1758 ? 1 : 0;
        if (arg3.method986(-110)) {
            if (arg3.method989(-120)) {
                arg3.field4634 = class300.field3729[var5];
                class300.field3729[var5] = arg3;
                return;
            }
            arg3.field4634 = class436.field6357[var5];
            class436.field6357[var5] = arg3;
            class568.field8076 = true;
            return;
        }
        arg3.field4634 = class228.field2626[var5];
        class228.field2626[var5] = arg3;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)V")
    public final void method3053(int arg0, int arg1) {
        field7391++;
        this.field7387 = this.field7408.field5918.method3806(arg0 * arg1, true);
        this.field7404 = new Stream(this.field7387);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIII)V")
    public final void method3054(int arg0, int arg1, int arg2, int arg3) {
        this.field7407[this.field7385.field3410 * arg3 + arg2] = class695.method3919(this.field7407[this.field7385.field3410 * arg3 + arg2], 0x1 << arg0);
        field7394++;
        if (arg1 != 65535) {
            field7392 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIFI)V")
    public final void method3055(int arg0, int arg1, int arg2, float arg3, int arg4) {
        field7401++;
        if (this.field7410 != -1) {
            class298 var6 = this.field7408.field578.method931(this.field7410, true);
            int var7 = var6.field3696 & 0xFF;
            if (var7 != 0 && var6.field3702 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field3709 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg0 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg0 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg0 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg0 = (var14 >> 8) + (var12 << 8 & 0xFF00B2) + (var13 & 0xFF00);
            }
        }
        if (arg2 != -1609616944) {
            return;
        }
        this.field7404.method3811(arg4 * 4);
        if (arg3 != 1.0F) {
            int var15 = (arg0 & 0xFF9473) >> 16;
            int var16 = (arg0 & 0xFFCD) >> 8;
            int var17 = arg0 & 0xFF;
            int var18 = (int) ((float) var15 * arg3);
            int var19 = (int) ((float) var16 * arg3);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg3);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg0 = var20 | var19 << 8 | var18 << 16;
        }
        this.field7404.method3814((byte) (arg0 >> 16));
        this.field7404.method3814((byte) (arg0 >> 8));
        this.field7404.method3814((byte) arg0);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[I)V")
    public final void method3056(int arg0, int arg1, int[] arg2) {
        field7409++;
        if (arg1 != -16530) {
            this.method3054(52, -47, 82, -79);
        }
        int var4 = 0;
        class685 var5 = this.field7408.field6059;
        var5.field2903 = 0;
        if (this.field7408.field5992) {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg2[var12];
                int var14 = this.field7407[var13];
                short[] var15 = this.field7385.field3671[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var15.length > var17) {
                        if ((0x1 << var16++ & var14) == 0) {
                            var17 += 3;
                        } else {
                            var5.method1446(var15[var17++] & 0xFFFF, true);
                            var4++;
                            var5.method1446(var15[var17++] & 0xFFFF, true);
                            var4++;
                            var4++;
                            var5.method1446(var15[var17++] & 0xFFFF, true);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg2[var6];
                int var8 = this.field7407[var7];
                short[] var9 = this.field7385.field3671[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var5.method1432(var9[var11++] & 0xFFFF, (byte) -95);
                            var4++;
                            var5.method1432(var9[var11++] & 0xFFFF, (byte) 109);
                            var4++;
                            var4++;
                            var5.method1432(var9[var11++] & 0xFFFF, (byte) -99);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field7400.method919(var5.field2912, var5.field2903, 6748, 5123);
        this.field7408.method2589(this.field7388, this.field7385.field3686, this.field7385.field3685, false, this.field7385.field3683);
        this.field7408.method2577(this.field7410, (this.field7385.field3678 & 0x8) != 0, (this.field7385.field3678 & 0x7) != 0, 0);
        if (this.field7408.field6037) {
            this.field7408.method355(Integer.MAX_VALUE, this.field7403, this.field7390, this.field7395);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field7389, 1.0F / this.field7389, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field7408.method2589(this.field7388, this.field7385.field3686, this.field7385.field3685, false, this.field7385.field3683);
        this.field7408.method2593(4, var4, this.field7400, (byte) -9, 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)V")
    public final void method3057(int arg0, boolean arg1) {
        field7399++;
        this.field7404.method3811(arg0 * 4 + 3);
        if (!arg1) {
            this.method3050(122, -50);
        }
        this.field7404.method3814(-1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([[[Lcj;I)V")
    public static final void method3058(class691[][][] arg0, int arg1) {
        field7405++;
        if (arg1 <= 109) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class691[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class691 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field9736 instanceof class281) {
                            ((class281) var6.field9736).method1237((byte) -104);
                        }
                        if (var6.field9731 instanceof class281) {
                            ((class281) var6.field9731).method1237((byte) -115);
                        }
                        if (var6.field9735 instanceof class281) {
                            ((class281) var6.field9735).method1237((byte) -124);
                        }
                        if (var6.field9728 instanceof class281) {
                            ((class281) var6.field9728).method1237((byte) -82);
                        }
                        if (var6.field9725 instanceof class281) {
                            ((class281) var6.field9725).method1237((byte) -82);
                        }
                        for (class398 var7 = var6.field9739; var7 != null; var7 = var7.field5451) {
                            class340 var8 = var7.field5449;
                            if (var8 instanceof class281) {
                                ((class281) var8).method1237((byte) -71);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Leo;IIIII)V")
    public class520(class296 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7385 = arg0;
        this.field7403 = arg3;
        this.field7390 = arg4;
        this.field7408 = this.field7385.field3656;
        this.field7410 = arg1;
        this.field7407 = new int[this.field7385.field3410 * this.field7385.field3408];
        this.field7395 = arg5;
        this.field7389 = arg2;
        this.field7400 = new class579(this.field7408, 5123, null, 1);
    }
}
