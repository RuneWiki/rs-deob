import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class657 extends class504 {

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "Lsm;")
    private class262 field8959;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "F")
    public float field8973;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
    public int field8970;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "Lno;")
    private class658 field8958;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
    public int field8969;

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "I")
    public int field8974;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
    public int field8968;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "[I")
    private int[] field8961;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "Lfl;")
    private class692 field8971;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "J")
    public static long field8965;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "Lbi;")
    public static class449 field8956;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "Lgda;")
    private class51 field8964;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8955;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field8962;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)V")
    public final void method3594(int arg0, int arg1, int arg2, int arg3) {
        this.field8961[this.field8959.field2247 * arg3 + arg2] = class220.method1393(this.field8961[this.field8959.field2247 * arg3 + arg2], arg1 << arg0);
        field8972++;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V")
    public final void method3595(int arg0, int arg1) {
        this.field8962 = this.field8958.field9185.method3467(arg0 * arg1, true);
        field8963++;
        this.field8955 = new Stream(this.field8962);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V")
    public static void method3596(byte arg0) {
        if (arg0 == 52) {
            field8956 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIFI)V")
    public final void method3597(int arg0, int arg1, int arg2, float arg3, int arg4) {
        field8957++;
        if (this.field8968 != -1) {
            class364 var6 = this.field8958.field8808.method2760(this.field8968, arg0 ^ 0xFFFFE9E7);
            int var7 = var6.field4929 & 0xFF;
            if (var7 != 0 && var6.field4937 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg2 * 131586;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((var8 & 0xFF00) * var7 + ((arg1 & 0xFF00) * var10) & 0xFF0000) + ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field4926 & 0xFF;
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
                arg1 = (var13 & 0xFF00) + ((var12 << 8 & 0xFF000C) + (var14 >> 8));
            }
        }
        this.field8955.method3475(arg4 * 4);
        if (arg3 != 1.0F) {
            int var15 = arg1 >> 16 & 0xFF;
            int var16 = (arg1 & 0xFFA0) >> 8;
            int var17 = (int) ((float) var15 * arg3);
            int var18 = arg1 & 0xFF;
            int var19 = (int) ((float) var16 * arg3);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
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
            arg1 = var19 << 8 | var17 << 16 | var20;
        }
        this.field8955.method3482((byte) (arg1 >> 16));
        if (arg0 != -17792) {
            this.method3599(-72, null, 13);
        }
        this.field8955.method3482((byte) (arg1 >> 8));
        this.field8955.method3482((byte) arg1);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)V")
    public final void method3598(int arg0, int arg1) {
        field8954++;
        this.field8955.method3479();
        class202 var3 = this.field8958.method3608(false, 1, arg1 * 4, 4, this.field8962);
        this.field8964 = new class51(var3, 5121, 4, arg0);
        this.field8955 = null;
        this.field8962 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[II)V")
    public final void method3599(int arg0, int[] arg1, int arg2) {
        field8960++;
        int var4 = 0;
        class85 var5 = this.field8958.field9278;
        var5.field4619 = 0;
        if (this.field8958.field9272) {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg1[var6];
                short[] var8 = this.field8959.field3599[var7];
                int var9 = this.field8961[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2031((byte) 54, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method2031((byte) 54, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method2031((byte) 54, var8[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field8959.field3599[var13];
                int var15 = this.field8961[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method2008(27798, var14[var17++] & 0xFFFF);
                            var4++;
                            var5.method2008(27798, var14[var17++] & 0xFFFF);
                            var4++;
                            var5.method2008(27798, var14[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 > 0) {
            this.field8971.method490(5123, var5.field4619, true, var5.field4600);
            this.field8958.method3661(this.field8964, this.field8959.field3640, this.field8959.field3630, this.field8959.field3634, 117);
            this.field8958.method3622((this.field8959.field3593 & 0x7) != 0, 95, this.field8968, (this.field8959.field3593 & 0x8) != 0);
            if (this.field8958.field9313) {
                this.field8958.method445(Integer.MAX_VALUE, this.field8969, this.field8974, this.field8970);
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(1.0F / this.field8973, 1.0F / this.field8973, 1.0F);
            OpenGL.glMatrixMode(5888);
            this.field8958.method3661(this.field8964, this.field8959.field3640, this.field8959.field3630, this.field8959.field3634, -44);
            this.field8958.method3605(0, this.field8971, var4, 4, (byte) 6);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
        if (arg0 < 63) {
            this.field8968 = 121;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BI)V")
    public final void method3600(byte arg0, int arg1) {
        this.field8955.method3475(arg1 * 4 + 3);
        if (arg0 == -103) {
            field8967++;
            this.field8955.method3482(-1);
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lsm;IIIII)V")
    public class657(class262 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8959 = arg0;
        this.field8973 = arg2;
        this.field8970 = arg5;
        this.field8958 = this.field8959.field3620;
        this.field8969 = arg3;
        this.field8974 = arg4;
        this.field8968 = arg1;
        this.field8961 = new int[this.field8959.field2248 * this.field8959.field2247];
        this.field8971 = new class692(this.field8958, 5123, null, 1);
    }
}
