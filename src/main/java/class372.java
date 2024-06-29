import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class372 extends class270 {

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "Lmh;")
    private class575 field4838;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "[I")
    private int[] field4819;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public int field4822;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public int field4824;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    public int field4832;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "F")
    public float field4825;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "Lap;")
    private class435 field4817;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public int field4818;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "Lus;")
    private class1 field4829;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "Lpr;")
    public static class407 field4830 = new class407(53, -2);

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "I")
    public static int field4837 = 328;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "Ljl;")
    private class245 field4820;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4826;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field4816;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)V", line = 5)
    public final void method2035(int arg0, byte arg1) {
        if (arg1 >= -33) {
            this.field4820 = null;
        }
        field4828++;
        this.field4816 = this.field4817.field5925.method3431(arg0 * 4, true);
        this.field4826 = new Stream(this.field4816);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IFIII)V", line = 24)
    public final void method2036(int arg0, float arg1, int arg2, int arg3, int arg4) {
        if (this.field4824 != -1) {
            class414 var6 = this.field4817.field8990.method846((byte) -115, this.field4824);
            int var7 = var6.field5484 & 0xFF;
            if (var7 != 0 && var6.field5486 != 4) {
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
                    arg4 = ((var8 & 0xFF00FF) * var7 + ((arg4 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field5482 & 0xFF;
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
                arg4 = (var12 << 8 & 0xFF00DF) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        field4823++;
        this.field4826.method3432(arg0 * arg3);
        if (arg1 != 1.0F) {
            int var15 = (arg4 & 0xFF484F) >> 16;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg1);
            int var18 = arg4 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg1);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg1);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var20 | var17 << 16 | var19 << 8;
        }
        this.field4826.method3445((byte) (arg4 >> 16));
        this.field4826.method3445((byte) (arg4 >> 8));
        this.field4826.method3445((byte) arg4);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([I[Ljava/lang/Object;ZII)V", line = 135)
    public static final void method2037(int[] arg0, Object[] arg1, boolean arg2, int arg3, int arg4) {
        field4834++;
        if (arg4 < arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg4; var10 < arg3; var10++) {
                if (arg0[var10] < ((var9 & var10) + var7)) {
                    int var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    Object var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var8;
            method2037(arg0, arg1, true, var6 - 1, arg4);
            method2037(arg0, arg1, true, arg3, var6 + 1);
        }
        if (!arg2) {
            method2037(null, null, false, -12, -45);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)V", line = 190)
    public final void method2038(byte arg0, int arg1) {
        this.field4826.method3434();
        field4831++;
        class659 var3 = this.field4817.method2347(this.field4816, 4, true, false, arg1 * 4);
        this.field4820 = new class245(var3, 5121, 4, 0);
        this.field4826 = null;
        this.field4816 = null;
        if (arg0 != -61) {
            this.method2035(13, (byte) -5);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(IB)V", line = 207)
    public final void method2039(int arg0, byte arg1) {
        int var3 = -118 / ((arg1 + 5) / 38);
        field4821++;
        this.field4826.method3432(arg0 * 4 + 3);
        this.field4826.method3445(-1);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([III)V", line = 220)
    public final void method2040(int[] arg0, int arg1, int arg2) {
        field4836++;
        int var4 = 0;
        if (arg1 != -20871) {
            this.field4832 = 1;
        }
        class146 var5 = this.field4817.field6033;
        var5.field6215 = 0;
        if (this.field4817.field6030) {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg0[var6];
                short[] var8 = this.field4838.field8193[var7];
                int var9 = this.field4819[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2537(arg1 ^ 0xFFFFE93D, var8[var11++] & 0xFFFF);
                            var5.method2537(arg1 ^ 0xFFFFE93D, var8[var11++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method2537(arg1 ^ 0xFFFFE93D, var8[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg0[var12];
                int var14 = this.field4819[var13];
                short[] var15 = this.field4838.field8193[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var15.length > var17) {
                        if ((0x1 << var16++ & var14) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method2568((byte) -31, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method2568((byte) -31, var15[var17++] & 0xFFFF);
                            var5.method2568((byte) -31, var15[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field4829.method4(var5.field6215, (byte) 5, var5.field6209, 5123);
        this.field4817.method2379(this.field4838.field8202, arg1 + 36003, this.field4838.field8201, this.field4820, this.field4838.field8196);
        this.field4817.method2373((byte) -70, (this.field4838.field8158 & 0x8) != 0, (this.field4838.field8158 & 0x7) != 0, this.field4824);
        if (this.field4817.field6023) {
            this.field4817.method299(Integer.MAX_VALUE, this.field4818, this.field4832, this.field4822);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field4825, 1.0F / this.field4825, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field4817.method2379(this.field4838.field8202, 15132, this.field4838.field8201, this.field4820, this.field4838.field8196);
        this.field4817.method2364(var4, 0, 4, (byte) 77, this.field4829);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 344)
    public static final void method2041(byte arg0) {
        field4833++;
        int var1 = 0;
        for (int var2 = 0; var2 < class399.field5338; var2++) {
            for (int var3 = 0; var3 < class349.field4567; var3++) {
                if (class375.method2059(var2, -1, var3, var1, true, class97.field1074)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 < 56) {
            field4837 = 2;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 380)
    public static void method2042(int arg0) {
        field4830 = null;
        int var1 = 122 % ((arg0 + 29) / 50);
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)I", line = 397)
    public static final int method2043(int arg0) {
        if (arg0 != -25453) {
            method2037(null, null, false, 59, -66);
        }
        field4827++;
        return class648.method3644(false, -19558);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII)V", line = 408)
    public final void method2044(int arg0, int arg1, int arg2, int arg3) {
        this.field4819[this.field4838.field1558 * arg0 + arg1] = class139.method776(this.field4819[this.field4838.field1558 * arg0 + arg1], 0x1 << arg2);
        field4835++;
        if (arg3 != 7) {
            this.field4826 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lmh;IIIII)V", line = 423)
    public class372(class575 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4838 = arg0;
        this.field4819 = new int[this.field4838.field1562 * this.field4838.field1558];
        this.field4822 = arg5;
        this.field4824 = arg1;
        this.field4832 = arg4;
        this.field4825 = arg2;
        this.field4817 = this.field4838.field8179;
        this.field4818 = arg3;
        this.field4829 = new class1(this.field4817, 5123, null, 1);
    }
}
