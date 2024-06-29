import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class629 extends class435 {

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "Lfw;")
    private class636 field8950;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "Lkfa;")
    private class382 field8949;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public int field8960;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "F")
    public float field8962;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public int field8951;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "[I")
    private int[] field8952;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public int field8956;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public int field8961;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Lkca;")
    private class372 field8945;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field8943 = new String[5];

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field8946;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field8947;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "Lmba;")
    private class70 field8955;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8948;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field8957;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(IB)V")
    public final void method3551(int arg0, byte arg1) {
        field8942++;
        this.field8957 = this.field8949.field5455.method2026(arg0 * 4, true);
        int var3 = -109 % ((2 - arg1) / 53);
        this.field8948 = new Stream(this.field8957);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[IZ)V")
    public final void method3552(int arg0, int[] arg1, boolean arg2) {
        field8946++;
        int var4 = 0;
        class351 var5 = this.field8949.field5537;
        var5.field6710 = 0;
        if (this.field8949.field5558) {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg1[var12];
                int var14 = this.field8952[var13];
                short[] var15 = this.field8950.field9026[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((0x1 << var16++ & var14) == 0) {
                            var17 += 3;
                        } else {
                            var5.method2739((byte) -86, var15[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method2739((byte) -86, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method2739((byte) -86, var15[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg1[var6];
                short[] var8 = this.field8950.field9026[var7];
                int var9 = this.field8952[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var8.length) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2742(var8[var11++] & 0xFFFF, -1557853240);
                            var4++;
                            var5.method2742(var8[var11++] & 0xFFFF, -1557853240);
                            var4++;
                            var5.method2742(var8[var11++] & 0xFFFF, -1557853240);
                        }
                    }
                }
            }
        }
        if (var4 > 0) {
            this.field8945.method1449(var5.field6719, var5.field6710, 5123, -17605);
            this.field8949.method2336((byte) -126, this.field8950.field9042, this.field8950.field9035, this.field8955, this.field8950.field9044);
            this.field8949.method2301(-37, ~(this.field8950.field9012 & 0x7) != -1, (this.field8950.field9012 & 0x8) != 0, this.field8951);
            if (this.field8949.field5516) {
                this.field8949.method809(Integer.MAX_VALUE, this.field8960, this.field8961, this.field8956);
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(1.0F / this.field8962, 1.0F / this.field8962, 1.0F);
            OpenGL.glMatrixMode(5888);
            this.field8949.method2336((byte) -110, this.field8950.field9042, this.field8950.field9035, this.field8955, this.field8950.field9044);
            this.field8949.method2320(4, arg2, 0, var4, this.field8945);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
        if (arg2) {
            this.field8945 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
    public final void method3553(int arg0, int arg1) {
        field8953++;
        this.field8948.method2034();
        class411 var3 = this.field8949.method2294(4, arg0 * 4, false, this.field8957, 1);
        if (arg1 < -15) {
            this.field8955 = new class70(var3, 5121, 4, 0);
            this.field8957 = null;
            this.field8948 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method3554(byte arg0) {
        field8943 = null;
        if (arg0 != 1) {
            field8943 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)V")
    public final void method3555(int arg0, int arg1, int arg2, int arg3) {
        field8944++;
        if (arg3 != -46) {
            this.method3551(69, (byte) 32);
        }
        this.field8952[this.field8950.field9706 * arg0 + arg2] = class460.method2676(this.field8952[this.field8950.field9706 * arg0 + arg2], 0x1 << arg1);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILr;Lfo;IIIILda;IIZII)Lda;")
    public static final class397 method3556(int arg0, int arg1, class98 arg2, class606 arg3, int arg4, int arg5, int arg6, int arg7, class397 arg8, int arg9, int arg10, boolean arg11, int arg12, int arg13) {
        field8959++;
        if (arg8 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg3 != null) {
            int var15 = var14 | arg3.method3452((byte) 29, -1, arg9, false);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg0 << 48) + ((long) arg10 << 32) + (long) ((arg7 << 24) + (arg1 - -(arg5 << 16)));
        class117 var18 = class691.field9789;
        class397 var19;
        synchronized (class691.field9789) {
            var19 = (class397) class691.field9789.method941(var16, 0);
        }
        if (var19 == null || arg2.method754(var19.method468(), var14) != 0) {
            if (var19 != null) {
                var14 = arg2.method738(var14, var19.method468());
            }
            byte var20;
            if (arg1 == 1) {
                var20 = 9;
            } else if (arg1 == 2) {
                var20 = 12;
            } else if (arg1 == 3) {
                var20 = 15;
            } else if (arg1 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class163 var23 = new class163((var20 * var21) + 1, var20 * 2 * var21 - var20, 0);
            int var24 = var23.method1247((byte) 100, 0, 0, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class302.field4241[var30] * var27 >> 14;
                    int var32 = class302.field4242[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method1247((byte) 76, 0, var32, var31);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg5 * var35 + arg7 * var34 >> 8);
                short var37 = (short) (((arg0 & 0xFC00) * var34 + (arg10 & 0xFC00) * var35 & 0xFC0000) + ((arg0 & 0x7F) * var34 + (arg10 & 0x7F) * var35 & 0x7F00) + ((arg0 & 0x380) * var34 + (arg10 & 0x380) * var35 & 0x38000) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method1244(var25[0][var38], -39, (byte) 1, var25[0][(var38 + 1) % var20], var37, (byte) -1, var36, (short) -1, var24);
                    } else {
                        var23.method1244(var25[var33][(var38 + 1) % var20], -120, (byte) 1, var25[var33 - 1][(var38 + 1) % var20], var37, (byte) -1, var36, (short) -1, var25[var33 - 1][var38]);
                        var23.method1244(var25[var33][var38], -114, (byte) 1, var25[var33][(var38 + 1) % var20], var37, (byte) -1, var36, (short) -1, var25[var33 - 1][var38]);
                    }
                }
            }
            var19 = arg2.method795(var23, var14, class136.field2184, 64, 768);
            class117 var39 = class691.field9789;
            synchronized (class691.field9789) {
                class691.field9789.method949(var16, true, var19);
            }
        }
        int var40 = arg8.method432();
        if (!arg11) {
            return null;
        }
        int var41 = arg8.method452();
        int var42 = arg8.method450();
        int var43 = arg8.method431();
        class374 var44 = null;
        if (arg3 != null) {
            int var45 = arg3.field8707[arg9];
            var44 = class480.field6871.method1421((byte) 24, var45 >> 16);
            arg9 = var45 & 0xFFFF;
        }
        class397 var46;
        if (var44 == null) {
            var46 = var19.method475((byte) 3, var14, true);
            var46.method426(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method455(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method475((byte) 3, var14, true);
            var46.method426(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method455(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method2410(105, var44, arg9);
        }
        if (arg13 != 0) {
            var46.method436(arg13);
        }
        if (arg12 != 0) {
            var46.method458(arg12);
        }
        if (arg6 != 0) {
            var46.method455(0, arg6, 0);
        }
        return var46;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILek;)Lnga;")
    public static final class241 method3557(int arg0, class465 arg1) {
        if (arg0 > -64) {
            field8943 = null;
        }
        field8954++;
        return new class241(arg1.method2744(-1), arg1.method2744(-1), arg1.method2744(-1), arg1.method2744(-1), arg1.method2714(true), arg1.method2705(-58));
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIBFI)V")
    public final void method3558(int arg0, int arg1, byte arg2, float arg3, int arg4) {
        field8958++;
        if (this.field8951 != -1) {
            class377 var6 = this.field8949.field1459.method2359(-127, this.field8951);
            int var7 = var6.field5227 & 0xFF;
            if (var7 != 0 && var6.field5217 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 <= 127) {
                    var8 = arg4 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((var8 & 0xFF00) * var7 + ((arg0 & 0xFF00) * var10) & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field5233 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg0 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg0 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg0 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg0 = (var13 & 0xFF00) + (var14 >> 8) + (var12 << 8 & 0xFF0091);
            }
        }
        this.field8948.method2031(arg1 * 4);
        if (arg3 != 1.0F) {
            int var15 = arg0 >> 16 & 0xFF;
            int var16 = arg0 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg3);
            int var18 = arg0 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg3);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg0 = var17 << 16 | var19 << 8 | var20;
        }
        this.field8948.method2029((byte) (arg0 >> 16));
        this.field8948.method2029((byte) (arg0 >> 8));
        this.field8948.method2029((byte) arg0);
        if (arg2 != 0) {
            this.field8949 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V")
    public final void method3559(int arg0, int arg1) {
        if (arg1 != 65535) {
            this.field8949 = null;
        }
        field8947++;
        this.field8948.method2031(arg0 * 4 + 3);
        this.field8948.method2029(-1);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lfw;IIIII)V")
    public class629(class636 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8950 = arg0;
        this.field8949 = this.field8950.field9004;
        this.field8960 = arg3;
        this.field8962 = arg2;
        this.field8951 = arg1;
        this.field8952 = new int[this.field8950.field9706 * this.field8950.field9703];
        this.field8956 = arg5;
        this.field8961 = arg4;
        this.field8945 = new class372(this.field8949, 5123, null, 1);
    }
}
