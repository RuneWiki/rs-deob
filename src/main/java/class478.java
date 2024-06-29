import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class478 extends class176 {

    @OriginalMember(owner = "client!nda", name = "z", descriptor = "Lql;")
    private class627 field6744;

    @OriginalMember(owner = "client!nda", name = "q", descriptor = "I")
    public int field6735;

    @OriginalMember(owner = "client!nda", name = "w", descriptor = "F")
    public float field6741;

    @OriginalMember(owner = "client!nda", name = "s", descriptor = "I")
    public int field6737;

    @OriginalMember(owner = "client!nda", name = "u", descriptor = "Lgi;")
    private class583 field6739;

    @OriginalMember(owner = "client!nda", name = "A", descriptor = "I")
    public int field6745;

    @OriginalMember(owner = "client!nda", name = "r", descriptor = "I")
    public int field6736;

    @OriginalMember(owner = "client!nda", name = "x", descriptor = "[I")
    private int[] field6742;

    @OriginalMember(owner = "client!nda", name = "n", descriptor = "Luba;")
    private class363 field6732;

    @OriginalMember(owner = "client!nda", name = "m", descriptor = "Ldv;")
    public static class566 field6731 = new class566(58, 6);

    @OriginalMember(owner = "client!nda", name = "G", descriptor = "Lcba;")
    public static class471 field6751 = new class471(4, 5);

    @OriginalMember(owner = "client!nda", name = "t", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!nda", name = "v", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!nda", name = "y", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!nda", name = "B", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!nda", name = "C", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!nda", name = "D", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!nda", name = "H", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!nda", name = "F", descriptor = "Lan;")
    public static class21 field6750;

    @OriginalMember(owner = "client!nda", name = "p", descriptor = "Ldd;")
    private class603 field6734;

    @OriginalMember(owner = "client!nda", name = "o", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6733;

    @OriginalMember(owner = "client!nda", name = "E", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6749;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)V")
    public final void method2784(int arg0, int arg1) {
        int var3 = -37 % ((arg0 - 68) / 42);
        field6740++;
        this.field6733.method3299(arg1 * 4 + 3);
        this.field6733.method3297(-1);
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(II)V")
    public final void method2785(int arg0, int arg1) {
        if (arg0 != 6376) {
            this.method2785(-33, -79);
        }
        field6747++;
        this.field6749 = this.field6739.field8203.method3286(arg1 * 4, true);
        this.field6733 = new Stream(this.field6749);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIII)V")
    public final void method2786(int arg0, int arg1, int arg2, int arg3) {
        this.field6742[this.field6744.field2505 * arg0 + arg3] = class73.method578(this.field6742[this.field6744.field2505 * arg0 + arg3], 0x1 << arg2);
        field6743++;
        int var5 = 70 / ((-arg1 - 48) / 49);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "([III)V")
    public final void method2787(int[] arg0, int arg1, int arg2) {
        field6752++;
        if (arg2 <= 83) {
            return;
        }
        int var4 = 0;
        class541 var5 = this.field6739.field8288;
        var5.field165 = 0;
        if (this.field6739.field8254) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg0[var6];
                int var8 = this.field6742[var7];
                short[] var9 = this.field6744.field9156[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method84(var9[var11++] & 0xFFFF, (byte) -114);
                            var5.method84(var9[var11++] & 0xFFFF, (byte) -118);
                            var4++;
                            var4++;
                            var5.method84(var9[var11++] & 0xFFFF, (byte) -108);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg0[var12];
                int var14 = this.field6742[var13];
                short[] var15 = this.field6744.field9156[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method95(1412209512, var15[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method95(1412209512, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method95(1412209512, var15[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field6732.method1998((byte) 121, var5.field138, var5.field165, 5123);
        this.field6739.method3380(this.field6734, this.field6744.field9181, this.field6744.field9185, 15097, this.field6744.field9178);
        this.field6739.method3378((this.field6744.field9149 & 0x7) != 0, this.field6735, (this.field6744.field9149 & 0x8) != 0, (byte) 2);
        if (this.field6739.field8262) {
            this.field6739.method1314(Integer.MAX_VALUE, this.field6737, this.field6736, this.field6745);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field6741, 1.0F / this.field6741, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field6739.method3380(this.field6734, this.field6744.field9181, this.field6744.field9185, 15097, this.field6744.field9178);
        this.field6739.method3366(this.field6732, var4, -22887, 4, 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
    public static void method2788(int arg0) {
        field6750 = null;
        field6731 = null;
        if (arg0 != 30281) {
            method2788(-116);
        }
        field6751 = null;
    }

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "(II)V")
    public final void method2789(int arg0, int arg1) {
        field6748++;
        this.field6733.method3288();
        class381 var3 = this.field6739.method3383(4, false, arg0 ^ 0xFFFF94D8, arg1 * 4, this.field6749);
        this.field6734 = new class603(var3, 5121, 4, 0);
        this.field6749 = null;
        if (arg0 != -9803) {
            this.method2786(14, 123, -107, 0);
        }
        this.field6733 = null;
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lql;IIIII)V")
    public class478(class627 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6744 = arg0;
        this.field6735 = arg1;
        this.field6741 = arg2;
        this.field6737 = arg3;
        this.field6739 = this.field6744.field9143;
        this.field6745 = arg5;
        this.field6736 = arg4;
        this.field6742 = new int[this.field6744.field2505 * this.field6744.field2503];
        this.field6732 = new class363(this.field6739, 5123, null, 1);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIF)V")
    public final void method2790(int arg0, int arg1, int arg2, int arg3, float arg4) {
        field6738++;
        if (arg3 != 740) {
            this.field6749 = null;
        }
        if (this.field6735 != -1) {
            class211 var6 = this.field6739.field2924.method190((byte) -89, this.field6735);
            int var7 = var6.field2973 & 0xFF;
            if (var7 != 0 && var6.field2984 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 <= 127) {
                    var8 = arg2 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((var8 & 0xFF00FF) * var7 + ((arg0 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field2975 & 0xFF;
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
                arg0 = (var12 << 8 & 0xFF0052) + (var13 & 0xFF00) + (var14 >> 8);
            }
        }
        if (arg4 != 1.0F) {
            int var15 = (arg0 & 0xFF5A21) >> 16;
            int var16 = (arg0 & 0xFFB1) >> 8;
            int var17 = arg0 & 0xFF;
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
            arg0 = var19 << 8 | var18 << 16 | var20;
        }
        this.field6733.method3299(arg1 * 4);
        this.field6733.method3297((byte) (arg0 >> 16));
        this.field6733.method3297((byte) (arg0 >> 8));
        this.field6733.method3297((byte) arg0);
    }
}
