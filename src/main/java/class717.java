import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class717 extends class362 {

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "Led;")
    private class704 field9769;

    @OriginalMember(owner = "client!jn", name = "G", descriptor = "[I")
    private int[] field9772;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
    public int field9755;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "F")
    public float field9762;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "Lqo;")
    private class22 field9761;

    @OriginalMember(owner = "client!jn", name = "F", descriptor = "I")
    public int field9771;

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "I")
    public int field9763;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public int field9756;

    @OriginalMember(owner = "client!jn", name = "H", descriptor = "Lwv;")
    private class35 field9773;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "[I")
    public static int[] field9760 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "F")
    public static float field9765;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    public static int field9757;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
    public static int field9758;

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "I")
    public static int field9759;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
    public static int field9764;

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "I")
    public static int field9766;

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "I")
    public static int field9768;

    @OriginalMember(owner = "client!jn", name = "J", descriptor = "I")
    public static int field9775;

    @OriginalMember(owner = "client!jn", name = "I", descriptor = "Lnh;")
    private class744 field9774;

    @OriginalMember(owner = "client!jn", name = "K", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9776;

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field9770;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBII)V")
    public final void method3989(int arg0, byte arg1, int arg2, int arg3) {
        field9775++;
        if (arg1 != 18) {
            this.field9755 = 85;
        }
        this.field9772[this.field9769.field3937 * arg2 + arg0] = class418.method2577(this.field9772[this.field9769.field3937 * arg2 + arg0], 0x1 << arg3);
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(II)V")
    public final void method3990(int arg0, int arg1) {
        this.field9770 = this.field9761.field552.method3777(arg1 * 4, true);
        field9764++;
        if (arg0 != Integer.MAX_VALUE) {
            this.field9761 = null;
        }
        this.field9776 = new Stream(this.field9770);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZIIIII)V")
    public static final void method3991(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9767++;
        if (!arg0) {
            method3994(121);
        }
        if (class693.field9368.field4469.method820(-32350) != 0 && arg3 != 0 && class649.field8920 < 50 && arg2 != -1) {
            class429.field6148[class649.field8920++] = new class456((byte) 1, arg2, arg3, arg4, arg1, 0, arg5, null);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II[I)V")
    public final void method3992(int arg0, int arg1, int[] arg2) {
        field9759++;
        int var4 = 0;
        class548 var5 = this.field9761.field620;
        var5.field3109 = 0;
        if (this.field9761.field597) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg2[var6];
                short[] var8 = this.field9769.field9524[var7];
                int var9 = this.field9772[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method1485((byte) 107, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method1485((byte) 107, var8[var11++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method1485((byte) 107, var8[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg2[var12];
                int var14 = this.field9772[var13];
                short[] var15 = this.field9769.field9524[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method1545(97, var15[var17++] & 0xFFFF);
                            var5.method1545(125, var15[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method1545(arg0 ^ 0x142F, var15[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 > 0) {
            this.field9773.method448(var5.field3066, 5123, 64, var5.field3109);
            this.field9761.method317(this.field9769.field9533, this.field9774, -26411, this.field9769.field9534, this.field9769.field9532);
            this.field9761.method202((this.field9769.field9492 & 0x7) != 0, this.field9771, (this.field9769.field9492 & 0x8) != 0, 112);
            if (this.field9761.field668) {
                this.field9761.method196(Integer.MAX_VALUE, this.field9755, this.field9763, this.field9756);
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(1.0F / this.field9762, 1.0F / this.field9762, 1.0F);
            OpenGL.glMatrixMode(5888);
            this.field9761.method317(this.field9769.field9533, this.field9774, -26411, this.field9769.field9534, this.field9769.field9532);
            this.field9761.method232(var4, -128, 4, this.field9773, 0);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
        if (arg0 != 5123) {
            this.field9756 = 66;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BIIIF)V")
    public final void method3993(byte arg0, int arg1, int arg2, int arg3, float arg4) {
        if (arg0 != 97) {
            return;
        }
        if (this.field9771 != -1) {
            class739 var6 = this.field9761.field1170.method1180(this.field9771, -6662);
            int var7 = var6.field9943 & 0xFF;
            if (var7 != 0 && var6.field9955 != 4) {
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
                    arg3 = ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field9958 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg3 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg3 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var13 & 0xFF00) + (((var12 & 0xFA00FF00) << 8) + (var14 >> 8));
            }
        }
        field9768++;
        this.field9776.method3791(arg1 * 4);
        if (arg4 != 1.0F) {
            int var15 = (arg3 & 0xFF1A66) >> 16;
            int var16 = (arg3 & 0xFF1D) >> 8;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg4);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg4);
            int var20 = (int) ((float) var17 * arg4);
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
            arg3 = var19 << 8 | var18 << 16 | var20;
        }
        this.field9776.method3793((byte) (arg3 >> 16));
        this.field9776.method3793((byte) (arg3 >> 8));
        this.field9776.method3793((byte) arg3);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public static void method3994(int arg0) {
        if (arg0 <= 37) {
            field9765 = 2.1337976F;
        }
        field9760 = null;
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(II)V")
    public final void method3995(int arg0, int arg1) {
        this.field9776.method3791(arg1 * 4 + arg0);
        field9757++;
        this.field9776.method3793(-1);
    }

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "(II)V")
    public final void method3996(int arg0, int arg1) {
        if (arg0 != 17795) {
            return;
        }
        this.field9776.method3784();
        field9758++;
        class490 var3 = this.field9761.method191(8448, this.field9770, false, 4, arg1 * 4);
        this.field9774 = new class744(var3, 5121, 4, 0);
        this.field9776 = null;
        this.field9770 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public static final void method3997(byte arg0) {
        if (arg0 > -102) {
            field9760 = null;
        }
        field9766++;
        if (class214.field3036 == 3) {
            class215.method1527(2, 4);
        } else if (class214.field3036 == 7) {
            class215.method1527(2, 8);
        } else if (class214.field3036 == 10) {
            class215.method1527(2, 11);
            return;
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Led;IIIII)V")
    public class717(class704 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9769 = arg0;
        this.field9772 = new int[this.field9769.field3940 * this.field9769.field3937];
        this.field9755 = arg3;
        this.field9762 = arg2;
        this.field9761 = this.field9769.field9529;
        this.field9771 = arg1;
        this.field9763 = arg4;
        this.field9756 = arg5;
        this.field9773 = new class35(this.field9761, 5123, null, 1);
    }
}
