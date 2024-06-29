import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class213 extends class69 {

    @OriginalMember(owner = "client!lw", name = "K", descriptor = "Lbda;")
    private class222 field2956;

    @OriginalMember(owner = "client!lw", name = "n", descriptor = "I")
    public int field2933;

    @OriginalMember(owner = "client!lw", name = "E", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!lw", name = "y", descriptor = "I")
    public int field2944;

    @OriginalMember(owner = "client!lw", name = "A", descriptor = "F")
    public float field2946;

    @OriginalMember(owner = "client!lw", name = "G", descriptor = "I")
    public int field2952;

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "Lpq;")
    private class194 field2941;

    @OriginalMember(owner = "client!lw", name = "B", descriptor = "[I")
    private int[] field2947;

    @OriginalMember(owner = "client!lw", name = "F", descriptor = "Lvba;")
    private class416 field2951;

    @OriginalMember(owner = "client!lw", name = "l", descriptor = "Laf;")
    public static class39 field2931 = new class39(64);

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "Lrh;")
    public static class718 field2940 = new class718();

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "[[I")
    public static int[][] field2945 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!lw", name = "H", descriptor = "[I")
    public static int[] field2953 = new int[2];

    @OriginalMember(owner = "client!lw", name = "I", descriptor = "I")
    public static int field2954 = -1;

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!lw", name = "k", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!lw", name = "w", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!lw", name = "x", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!lw", name = "D", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!lw", name = "J", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "Lls;")
    private class166 field2935;

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "Lae;")
    public static class283 field2937;

    @OriginalMember(owner = "client!lw", name = "C", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2948;

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2938;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)V")
    public final void method1333(int arg0, int arg1) {
        this.field2938 = this.field2941.field2612.method2333(arg1 * 4, true);
        field2943++;
        this.field2948 = new Stream(this.field2938);
        if (arg0 != 10) {
            this.field2948 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
    public static void method1334(int arg0) {
        field2937 = null;
        field2940 = null;
        field2931 = null;
        field2953 = null;
        if (arg0 == 12) {
            field2945 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZI)V")
    public final void method1335(boolean arg0, int arg1) {
        this.field2948.method2351();
        field2932++;
        class211 var3 = this.field2941.method1235((byte) -31, this.field2938, arg0, 4, arg1 * 4);
        this.field2935 = new class166(var3, 5121, 4, 0);
        this.field2938 = null;
        this.field2948 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIII)V")
    public final void method1336(int arg0, int arg1, int arg2, int arg3) {
        field2939++;
        this.field2947[this.field2956.field5827 * arg0 + arg3] = class613.method3544(this.field2947[this.field2956.field5827 * arg0 + arg3], arg2 << arg1);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I[IB)V")
    public final void method1337(int arg0, int[] arg1, byte arg2) {
        if (arg2 != 66) {
            this.method1339(-3, -111, -20, 16, 0.97752047F);
        }
        field2934++;
        int var4 = 0;
        class296 var5 = this.field2941.field2686;
        var5.field6962 = 0;
        if (this.field2941.field2748) {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg1[var12];
                int var14 = this.field2947[var13];
                short[] var15 = this.field2956.field3064[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method2986(var15[var17++] & 0xFFFF, -63);
                            var4++;
                            var5.method2986(var15[var17++] & 0xFFFF, -111);
                            var4++;
                            var4++;
                            var5.method2986(var15[var17++] & 0xFFFF, -1);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg1[var6];
                short[] var8 = this.field2956.field3064[var7];
                int var9 = this.field2947[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var8.length) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2974(var8[var11++] & 0xFFFF, (byte) 70);
                            var4++;
                            var5.method2974(var8[var11++] & 0xFFFF, (byte) -107);
                            var5.method2974(var8[var11++] & 0xFFFF, (byte) -125);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field2951.method663(5123, -71, var5.field6962, var5.field6979);
        this.field2941.method1248(this.field2956.field3073, this.field2956.field3078, this.field2935, (byte) -89, this.field2956.field3069);
        this.field2941.method1252(this.field2944, -27776, (this.field2956.field3039 & 0x8) != 0, (this.field2956.field3039 & 0x7) != 0);
        if (this.field2941.field2757) {
            this.field2941.method217(Integer.MAX_VALUE, this.field2933, this.field2952, this.field2950);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field2946, 1.0F / this.field2946, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field2941.method1248(this.field2956.field3073, this.field2956.field3078, this.field2935, (byte) 109, this.field2956.field3069);
        this.field2941.method1211((byte) -124, var4, this.field2951, 4, 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)Llp;")
    public static final class82 method1338(byte arg0) {
        field2929++;
        if (arg0 <= 76) {
            field2931 = null;
        }
        return class493.field6796;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIIF)V")
    public final void method1339(int arg0, int arg1, int arg2, int arg3, float arg4) {
        if (this.field2944 != -1) {
            class744 var6 = this.field2941.field6556.method581(-21732, this.field2944);
            int var7 = var6.field10269 & 0xFF;
            if (var7 != 0 && var6.field10273 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg2 * 131586;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((var8 & 0xFF00) * var7 + ((arg3 & 0xFF00) * var10) & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field10262 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg3 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg3 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var14 >> 8) + (var12 << 8 & 0xFF00F9) + (var13 & 0xFF00);
            }
        }
        field2936++;
        if (arg4 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = (arg3 & 0xFF51) >> 8;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg4);
            int var19 = (int) ((float) var16 * arg4);
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
            int var20 = (int) ((float) var17 * arg4);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var20 | var18 << 16 | var19 << 8;
        }
        this.field2948.method2338(arg1 * 4);
        if (arg0 >= -91) {
            this.field2938 = null;
        }
        this.field2948.method2345((byte) (arg3 >> 16));
        this.field2948.method2345((byte) (arg3 >> 8));
        this.field2948.method2345((byte) arg3);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IB)V")
    public final void method1340(int arg0, byte arg1) {
        this.field2948.method2338(arg0 * 4 + 3);
        field2949++;
        this.field2948.method2345(arg1);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)V")
    public static final void method1341(byte arg0) {
        field2942++;
        class495.field6809.method3672(0);
        if (arg0 < 38) {
            method1334(96);
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lbda;IIIII)V")
    public class213(class222 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2956 = arg0;
        this.field2933 = arg3;
        this.field2950 = arg5;
        this.field2944 = arg1;
        this.field2946 = arg2;
        this.field2952 = arg4;
        this.field2941 = this.field2956.field3044;
        this.field2947 = new int[this.field2956.field5827 * this.field2956.field5826];
        this.field2951 = new class416(this.field2941, 5123, null, 1);
    }
}
