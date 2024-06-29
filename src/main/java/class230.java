import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class230 extends class656 {

    @OriginalMember(owner = "client!aia", name = "i", descriptor = "Lmu;")
    private class304 field3267;

    @OriginalMember(owner = "client!aia", name = "s", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!aia", name = "m", descriptor = "Lrda;")
    private class663 field3271;

    @OriginalMember(owner = "client!aia", name = "y", descriptor = "[I")
    private int[] field3283;

    @OriginalMember(owner = "client!aia", name = "x", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!aia", name = "v", descriptor = "I")
    public int field3280;

    @OriginalMember(owner = "client!aia", name = "k", descriptor = "I")
    public int field3269;

    @OriginalMember(owner = "client!aia", name = "w", descriptor = "F")
    public float field3281;

    @OriginalMember(owner = "client!aia", name = "u", descriptor = "Lvp;")
    private class190 field3279;

    @OriginalMember(owner = "client!aia", name = "E", descriptor = "Lkaa;")
    public static class47 field3288 = new class47(85, -1);

    @OriginalMember(owner = "client!aia", name = "l", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!aia", name = "n", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!aia", name = "o", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!aia", name = "p", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!aia", name = "q", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!aia", name = "z", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!aia", name = "A", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!aia", name = "B", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!aia", name = "D", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!aia", name = "r", descriptor = "Lim;")
    private class572 field3276;

    @OriginalMember(owner = "client!aia", name = "t", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3278;

    @OriginalMember(owner = "client!aia", name = "j", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3268;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIIZ)V")
    public final void method1459(int arg0, int arg1, int arg2, boolean arg3) {
        field3287++;
        this.field3283[this.field3267.field3992 * arg0 + arg2] = class446.method2556(this.field3283[this.field3267.field3992 * arg0 + arg2], 0x1 << arg1);
        if (arg3) {
            this.method1465(0, 49, 22, 0.35313132F, 80);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(II[I)V")
    public final void method1460(int arg0, int arg1, int[] arg2) {
        field3272++;
        int var4 = 0;
        class451 var5 = this.field3271.field8994;
        if (arg1 < 125) {
            return;
        }
        var5.field9419 = 0;
        if (this.field3271.field9021) {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg2[var6];
                short[] var8 = this.field3267.field4329[var7];
                int var9 = this.field3283[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method3831(1182, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method3831(1182, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method3831(1182, var8[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg2[var12];
                int var14 = this.field3283[var13];
                short[] var15 = this.field3267.field4329[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method3819(var15[var17++] & 0xFFFF, 106);
                            var4++;
                            var4++;
                            var5.method3819(var15[var17++] & 0xFFFF, -125);
                            var5.method3819(var15[var17++] & 0xFFFF, 65);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field3279.method678(var5.field9419, 20218, 5123, var5.field9399);
        this.field3271.method3593(32886, this.field3267.field4344, this.field3267.field4352, this.field3267.field4343, this.field3276);
        this.field3271.method3643((this.field3267.field4338 & 0x8) != 0, 0, this.field3282, (this.field3267.field4338 & 0x7) != 0);
        if (this.field3271.field9063) {
            this.field3271.method502(Integer.MAX_VALUE, this.field3280, this.field3269, this.field3277);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field3281, 1.0F / this.field3281, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field3271.method3593(32886, this.field3267.field4344, this.field3267.field4352, this.field3267.field4343, this.field3276);
        this.field3271.method3647(this.field3279, 0, (byte) -108, 4, var4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(B[S)[S")
    public static final short[] method1461(byte arg0, short[] arg1) {
        field3273++;
        if (arg1 == null) {
            return null;
        }
        short[] var2 = new short[arg1.length];
        class335.method2022(arg1, 0, var2, 0, arg1.length);
        if (arg0 != 64) {
            method1461((byte) -68, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(BI)V")
    public final void method1462(byte arg0, int arg1) {
        field3270++;
        this.field3278.method3734();
        if (arg0 < 103) {
            method1461((byte) -107, null);
        }
        class345 var3 = this.field3271.method3655(false, 4, -51, this.field3268, arg1 * 4);
        this.field3276 = new class572(var3, 5121, 4, 0);
        this.field3278 = null;
        this.field3268 = null;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZI)V")
    public final void method1463(boolean arg0, int arg1) {
        this.field3268 = this.field3271.field8948.method3729(arg1 * 4, arg0);
        field3274++;
        this.field3278 = new Stream(this.field3268);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V")
    public static final void method1464(int arg0) {
        class295.field4222 = null;
        class164.field2491 = null;
        class575.field7552 = null;
        if (arg0 != 5123) {
            method1461((byte) 16, null);
        }
        class588.field7676 = null;
        class657.field8682 = null;
        class85.field1030 = null;
        class314.field4486 = null;
        class48.field608 = null;
        class4.field119 = null;
        field3285++;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIIFI)V")
    public final void method1465(int arg0, int arg1, int arg2, float arg3, int arg4) {
        field3284++;
        if (this.field3282 != -1) {
            class758 var6 = this.field3271.field717.method91(this.field3282, (byte) 127);
            int var7 = var6.field10542 & 0xFF;
            if (var7 != 0 && var6.field10536 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 <= 127) {
                    var8 = arg2 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((var8 & 0xFF00) * var7 + ((arg4 & 0xFF00) * var10) & 0xFF0000) + ((var8 & 0xFF00FF) * var7 + ((arg4 & 0xFF00FF) * var10) & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field10537 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg4 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg4 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var12 << 8 & 0xFF00F4) + (var13 & 0xFF00) + (var14 >> 8);
            }
        }
        if (arg1 <= 42) {
            method1461((byte) -85, null);
        }
        if (arg3 != 1.0F) {
            int var15 = arg4 >> 16 & 0xFF;
            int var16 = (arg4 & 0xFFA9) >> 8;
            int var17 = (int) ((float) var15 * arg3);
            int var18 = arg4 & 0xFF;
            int var19 = (int) ((float) var16 * arg3);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var20 = (int) ((float) var18 * arg3);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var20 | var17 << 16 | var19 << 8;
        }
        this.field3278.method3738(arg0 * 4);
        this.field3278.method3745((byte) (arg4 >> 16));
        this.field3278.method3745((byte) (arg4 >> 8));
        this.field3278.method3745((byte) arg4);
    }

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(I)V")
    public static void method1466(int arg0) {
        if (arg0 != -9111) {
            method1466(-24);
        }
        field3288 = null;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)V")
    public final void method1467(int arg0, int arg1) {
        this.field3278.method3738(arg0 * 4 + arg1);
        field3286++;
        this.field3278.method3745(-1);
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lmu;IIIII)V")
    public class230(class304 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3267 = arg0;
        this.field3277 = arg5;
        this.field3271 = this.field3267.field4335;
        this.field3283 = new int[this.field3267.field3996 * this.field3267.field3992];
        this.field3282 = arg1;
        this.field3280 = arg3;
        this.field3269 = arg4;
        this.field3281 = arg2;
        this.field3279 = new class190(this.field3271, 5123, null, 1);
    }
}
