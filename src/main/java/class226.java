import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class226 extends class28 {

    @OriginalMember(owner = "client!tw", name = "B", descriptor = "Lle;")
    private class517 field2953;

    @OriginalMember(owner = "client!tw", name = "t", descriptor = "I")
    public int field2945;

    @OriginalMember(owner = "client!tw", name = "q", descriptor = "Lpea;")
    private class641 field2942;

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
    public int field2936;

    @OriginalMember(owner = "client!tw", name = "D", descriptor = "F")
    public float field2955;

    @OriginalMember(owner = "client!tw", name = "w", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!tw", name = "C", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!tw", name = "y", descriptor = "[I")
    private int[] field2950;

    @OriginalMember(owner = "client!tw", name = "A", descriptor = "Lfw;")
    private class167 field2952;

    @OriginalMember(owner = "client!tw", name = "x", descriptor = "[I")
    public static int[] field2949 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "Ljv;")
    public static class606 field2935 = new class606(6, 1);

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!tw", name = "n", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!tw", name = "o", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!tw", name = "r", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!tw", name = "s", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!tw", name = "z", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!tw", name = "u", descriptor = "Lcm;")
    private class158 field2946;

    @OriginalMember(owner = "client!tw", name = "v", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2947;

    @OriginalMember(owner = "client!tw", name = "p", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2941;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)V")
    public final void method1381(int arg0, int arg1) {
        this.field2941 = this.field2942.field8944.method1534(arg1 * 4, true);
        if (arg0 < 16) {
            this.field2941 = null;
        }
        field2937++;
        this.field2947 = new Stream(this.field2941);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(BI)V")
    public final void method1382(byte arg0, int arg1) {
        this.field2947.method1523();
        field2951++;
        class437 var3 = this.field2942.method3545(this.field2941, arg1 * 4, false, false, 4);
        this.field2946 = new class158(var3, 5121, 4, 0);
        this.field2947 = null;
        this.field2941 = null;
        if (arg0 <= 71) {
            this.method1381(-27, 103);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IB)V")
    public final void method1383(int arg0, byte arg1) {
        this.field2947.method1529(arg0 * 4 + 3);
        if (arg1 < 123) {
            this.field2947 = null;
        }
        field2939++;
        this.field2947.method1526(-1);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method1384(String arg0, int arg1, boolean arg2) {
        field2940++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 + (arg2 ? class673.field9539.field6727 : class673.field9539.field6730);
        for (int var8 = var6; var8 < var7; var8++) {
            class572 var11 = class673.field9539.method2804(arg1 ^ 0xFF6DA6, var8);
            if (var11.field7932 && var11.method3230(arg1 ^ 0xFF00AF).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class651.field9216 = -1;
                    class168.field2103 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        if (arg1 != 16711935) {
            method1384(null, 54, true);
        }
        class589.field8084 = 0;
        class168.field2103 = var4;
        class651.field9216 = var5;
        String[] var9 = new String[class651.field9216];
        for (int var10 = 0; var10 < class651.field9216; var10++) {
            var9[var10] = class673.field9539.method2804(class599.method3320(arg1, 16739750), var4[var10]).method3230(class599.method3320(arg1, 16711855));
        }
        class290.method1725(class168.field2103, 0, var9);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I[IZ)V")
    public final void method1385(int arg0, int[] arg1, boolean arg2) {
        field2943++;
        int var4 = 0;
        class457 var5 = this.field2942.field9078;
        var5.field1745 = 0;
        if (this.field2942.field8968) {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg1[var12];
                int var14 = this.field2950[var13];
                short[] var15 = this.field2953.field7101[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method915(var15[var17++] & 0xFFFF, 1502242504);
                            var4++;
                            var5.method915(var15[var17++] & 0xFFFF, 1502242504);
                            var4++;
                            var5.method915(var15[var17++] & 0xFFFF, 1502242504);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg1[var6];
                int var8 = this.field2950[var7];
                short[] var9 = this.field2953.field7101[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method954(var9[var11++] & 0xFFFF, -90);
                            var4++;
                            var5.method954(var9[var11++] & 0xFFFF, -62);
                            var4++;
                            var4++;
                            var5.method954(var9[var11++] & 0xFFFF, -64);
                        }
                    }
                }
            }
        }
        if (!arg2) {
            this.field2952 = null;
        }
        if (var4 <= 0) {
            return;
        }
        this.field2952.method1109(var5.field1712, 5123, 68, var5.field1745);
        this.field2942.method3567(this.field2953.field7123, 0, this.field2953.field7135, this.field2953.field7127, this.field2946);
        this.field2942.method3521(120, (this.field2953.field7110 & 0x7) != 0, (this.field2953.field7110 & 0x8) != 0, this.field2945);
        if (this.field2942.field8978) {
            this.field2942.method1888(Integer.MAX_VALUE, this.field2948, this.field2954, this.field2936);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field2955, 1.0F / this.field2955, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field2942.method3567(this.field2953.field7123, 0, this.field2953.field7135, this.field2953.field7127, this.field2946);
        this.field2942.method3497(-21, var4, 4, 0, this.field2952);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIFII)V")
    public final void method1386(int arg0, int arg1, float arg2, int arg3, int arg4) {
        field2938++;
        if (this.field2945 != -1) {
            class568 var6 = this.field2942.field9731.method1728(-128, this.field2945);
            int var7 = var6.field7869 & 0xFF;
            if (var7 != 0 && var6.field7870 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg4 * 131586;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field7863 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg1 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg1 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = (var14 >> 8) + (var12 << 8 & 0xFF00AE) + (var13 & 0xFF00);
            }
        }
        this.field2947.method1529(arg0 * 4);
        if (arg3 != 255) {
            return;
        }
        if (arg2 != 1.0F) {
            int var15 = (arg1 & 0xFF4DF1) >> 16;
            int var16 = (arg1 & 0xFF18) >> 8;
            int var17 = (int) ((float) var15 * arg2);
            int var18 = arg1 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg2);
            int var20 = (int) ((float) var18 * arg2);
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
            arg1 = var19 << 8 | var17 << 16 | var20;
        }
        this.field2947.method1526((byte) (arg1 >> 16));
        this.field2947.method1526((byte) (arg1 >> 8));
        this.field2947.method1526((byte) arg1);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
    public static void method1387(int arg0) {
        if (arg0 == -5) {
            field2935 = null;
            field2949 = null;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIII)V")
    public final void method1388(int arg0, int arg1, int arg2, int arg3) {
        field2944++;
        if (arg1 != 65280) {
            this.method1386(-41, 120, -1.4863108F, 107, -76);
        }
        this.field2950[this.field2953.field2214 * arg0 + arg2] = class288.method1722(this.field2950[this.field2953.field2214 * arg0 + arg2], 0x1 << arg3);
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lle;IIIII)V")
    public class226(class517 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2953 = arg0;
        this.field2945 = arg1;
        this.field2942 = this.field2953.field7095;
        this.field2936 = arg5;
        this.field2955 = arg2;
        this.field2948 = arg3;
        this.field2954 = arg4;
        this.field2950 = new int[this.field2953.field2215 * this.field2953.field2214];
        this.field2952 = new class167(this.field2942, 5123, null, 1);
    }
}
