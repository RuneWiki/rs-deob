import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class24 extends class71 {

    @OriginalMember(owner = "client!dr", name = "A", descriptor = "Lrq;")
    private class485 field303;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
    public int field292;

    @OriginalMember(owner = "client!dr", name = "D", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "Ldw;")
    private class664 field294;

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "[I")
    private int[] field289;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "F")
    public float field288;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "Lcb;")
    private class633 field293;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "Lmba;")
    public static class646 field295 = new class646();

    @OriginalMember(owner = "client!dr", name = "F", descriptor = "[I")
    public static int[] field308 = new int[16384];

    @OriginalMember(owner = "client!dr", name = "I", descriptor = "I")
    public static int field311 = -1;

    @OriginalMember(owner = "client!dr", name = "G", descriptor = "I")
    public static int field309 = 0;

    @OriginalMember(owner = "client!dr", name = "J", descriptor = "[I")
    public static int[] field312 = new int[16384];

    @OriginalMember(owner = "client!dr", name = "H", descriptor = "D")
    public static double field310;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!dr", name = "C", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!dr", name = "E", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "Lss;")
    private class509 field286;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "Ljaclib/memory/Stream;")
    private Stream field290;

    @OriginalMember(owner = "client!dr", name = "B", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field304;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field312[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field308[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI[I)V", line = 6)
    public final void method131(byte arg0, int arg1, int[] arg2) {
        field296++;
        int var4 = 0;
        class172 var5 = this.field294.field9117;
        var5.field956 = 0;
        if (this.field294.field9051) {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg2[var12];
                int var14 = this.field289[var13];
                short[] var15 = this.field303.field6752[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method492(-2, var15[var17++] & 0xFFFF);
                            var5.method492(-2, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method492(-2, var15[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg2[var6];
                short[] var8 = this.field303.field6752[var7];
                int var9 = this.field289[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method499(-25094, var8[var11++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method499(-25094, var8[var11++] & 0xFFFF);
                            var5.method499(-25094, var8[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 > 0) {
            this.field293.method2486(116, var5.field956, var5.field954, 5123);
            this.field294.method3725(this.field286, (byte) 6, this.field303.field6783, this.field303.field6784, this.field303.field6788);
            this.field294.method3679(this.field287, (this.field303.field6748 & 0x7) != 0, (this.field303.field6748 & 0x8) != 0, true);
            if (this.field294.field9113) {
                this.field294.method1501(Integer.MAX_VALUE, this.field292, this.field299, this.field306);
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(1.0F / this.field288, 1.0F / this.field288, 1.0F);
            OpenGL.glMatrixMode(5888);
            this.field294.method3725(this.field286, (byte) 32, this.field303.field6783, this.field303.field6784, this.field303.field6788);
            this.field294.method3688(0, var4, 4, this.field293, 0);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
        if (arg0 <= 117) {
            this.field306 = 53;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB)V", line = 128)
    public final void method132(int arg0, byte arg1) {
        this.field304 = this.field294.field9010.method2623(arg0 * 4, true);
        field302++;
        if (arg1 < -72) {
            this.field290 = new Stream(this.field304);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V", line = 144)
    public static final void method133(int arg0) {
        if (arg0 != 255) {
            method139(-71);
        }
        class281.method1879((byte) 101);
        field300++;
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V", line = 156)
    public static final void method134(int arg0) {
        class286.method1896(false);
        field297++;
        if (arg0 != 1) {
            method139(57);
        }
        class11.method51(arg0 ^ 0xFFFFFF86);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)V", line = 174)
    public final void method135(int arg0, int arg1) {
        field291++;
        if (arg1 == 1) {
            this.field290.method2618(arg0 * 4 + 3);
            this.field290.method2606(-1);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIBI)V", line = 186)
    public final void method136(int arg0, int arg1, byte arg2, int arg3) {
        field305++;
        this.field289[this.field303.field4814 * arg3 + arg0] = class678.method3817(this.field289[this.field303.field4814 * arg3 + arg0], 0x1 << arg1);
        if (arg2 != -22) {
            this.method136(-54, 90, (byte) 24, -53);
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)V", line = 199)
    public final void method137(int arg0, int arg1) {
        field298++;
        this.field290.method2613();
        class411 var3 = this.field294.method3671(4, this.field304, false, 1, arg0 * 4);
        this.field286 = new class509(var3, arg1, 4, 0);
        this.field304 = null;
        this.field290 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIFI)V", line = 215)
    public final void method138(int arg0, int arg1, int arg2, float arg3, int arg4) {
        field307++;
        if (this.field287 != -1) {
            class239 var6 = this.field294.field7623.method521(this.field287, 121);
            int var7 = var6.field3570 & 0xFF;
            if (var7 != 0 && var6.field3561 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((var8 & 0xFF00) * var7 + ((arg4 & 0xFF00) * var10) & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field3578 & 0xFF;
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
                arg4 = (var13 & 0xFF00) + ((var12 << 8 & 0xFF008E) + (var14 >> 8));
            }
        }
        if (arg3 != 1.0F) {
            int var15 = arg4 >> 16 & 0xFF;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = arg4 & 0xFF;
            int var18 = (int) ((float) var15 * arg3);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            int var20 = (int) ((float) var17 * arg3);
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
            arg4 = var20 | var18 << 16 | var19 << 8;
        }
        this.field290.method2618(arg1 * 4);
        if (arg2 == -890846872) {
            this.field290.method2606((byte) (arg4 >> 16));
            this.field290.method2606((byte) (arg4 >> 8));
            this.field290.method2606((byte) arg4);
        }
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V", line = 331)
    public static final void method139(int arg0) {
        int var1 = 11 / ((arg0 - 29) / 38);
        class676.field9376.method819(23738);
        field301++;
        class561.field7801.method819(23738);
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lrq;IIIII)V", line = 342)
    public class24(class485 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field303 = arg0;
        this.field292 = arg3;
        this.field306 = arg5;
        this.field294 = this.field303.field6753;
        this.field299 = arg4;
        this.field287 = arg1;
        this.field289 = new int[this.field303.field4817 * this.field303.field4814];
        this.field288 = arg2;
        this.field293 = new class633(this.field294, 5123, null, 1);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V", line = 359)
    public static void method140(byte arg0) {
        field312 = null;
        field295 = null;
        if (arg0 != -60) {
            field312 = null;
        }
        field308 = null;
    }
}
