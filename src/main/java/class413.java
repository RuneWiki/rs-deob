import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class413 extends class496 {

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Lnba;")
    private class366 field5870;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public int field5871;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "F")
    public float field5875;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public int field5880;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "Los;")
    private class468 field5878;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public int field5869;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "[I")
    private int[] field5879;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public int field5887;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "Lsw;")
    private class11 field5868;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "Lgu;")
    public static class126 field5873 = new class126();

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "Z")
    public static boolean field5885 = false;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "Laf;")
    private class156 field5883;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5882;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field5872;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)V")
    public final void method2447(int arg0, int arg1, int arg2, int arg3) {
        this.field5879[this.field5870.field8121 * arg2 + arg3] = class313.method1926(this.field5879[this.field5870.field8121 * arg2 + arg3], 0x1 << arg0);
        field5886++;
        if (arg1 != -20211) {
            this.method2447(-111, 56, 122, 118);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
    public final void method2448(int arg0, int arg1) {
        if (arg0 != -22051) {
            this.method2452(1.2711588F, 92, 62, 3, 8);
        }
        this.field5882.method3332();
        field5876++;
        class9 var3 = this.field5878.method2830(4, this.field5872, arg1 * 4, arg0 - 313222445, false);
        this.field5883 = new class156(var3, 5121, 4, 0);
        this.field5872 = null;
        this.field5882 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static void method2449(byte arg0) {
        if (arg0 == -65) {
            field5873 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
    public final void method2450(int arg0, int arg1) {
        if (arg0 != 6107) {
            this.field5875 = 1.0024989F;
        }
        this.field5882.method3329(arg1 * 4 + 3);
        field5874++;
        this.field5882.method3330(-1);
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(II)V")
    public final void method2451(int arg0, int arg1) {
        this.field5872 = this.field5878.field6964.method3320(arg0 * 4, true);
        field5881++;
        this.field5882 = new Stream(this.field5872);
        if (arg1 <= 7) {
            this.field5880 = -127;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(FIIII)V")
    public final void method2452(float arg0, int arg1, int arg2, int arg3, int arg4) {
        field5884++;
        if (this.field5869 != -1) {
            class83 var6 = this.field5878.field2262.method1762(this.field5869, (byte) 45);
            int var7 = var6.field962 & 0xFF;
            if (var7 != 0 && var6.field968 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 <= 127) {
                    var8 = arg3 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field960 & 0xFF;
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
                arg1 = (var13 & 0xFF00) + ((var12 & 0xC500FF00) << 8) + (var14 >> 8);
            }
        }
        if (arg0 != 1.0F) {
            int var15 = (arg1 & 0xFF713D) >> 16;
            int var16 = (arg1 & 0xFF24) >> 8;
            int var17 = (int) ((float) var15 * arg0);
            int var18 = arg1 & 0xFF;
            int var19 = (int) ((float) var16 * arg0);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var20 = (int) ((float) var18 * arg0);
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
            arg1 = var20 | var19 << 8 | var17 << 16;
        }
        if (arg4 == -5434) {
            this.field5882.method3329(arg2 * 4);
            this.field5882.method3330((byte) (arg1 >> 16));
            this.field5882.method3330((byte) (arg1 >> 8));
            this.field5882.method3330((byte) arg1);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([III)V")
    public final void method2453(int[] arg0, int arg1, int arg2) {
        field5877++;
        int var4 = 0;
        class444 var5 = this.field5878.field7005;
        var5.field6221 = 0;
        if (this.field5878.field7004) {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg0[var12];
                short[] var14 = this.field5870.field5284[var13];
                int var15 = this.field5879[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method2608(var14[var17++] & 0xFFFF, (byte) 101);
                            var5.method2608(var14[var17++] & 0xFFFF, (byte) 103);
                            var4++;
                            var4++;
                            var5.method2608(var14[var17++] & 0xFFFF, (byte) 105);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg0[var6];
                int var8 = this.field5879[var7];
                short[] var9 = this.field5870.field5284[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2590(var9[var11++] & 0xFFFF, (byte) -76);
                            var4++;
                            var5.method2590(var9[var11++] & 0xFFFF, (byte) -31);
                            var4++;
                            var5.method2590(var9[var11++] & 0xFFFF, (byte) -29);
                        }
                    }
                }
            }
        }
        if (var4 > 0) {
            this.field5868.method55(var5.field6221, var5.field6162, 25321, 5123);
            this.field5878.method2846(this.field5870.field5297, this.field5883, this.field5870.field5302, 32888, this.field5870.field5308);
            this.field5878.method2774((this.field5870.field5270 & 0x8) != 0, this.field5869, false, (this.field5870.field5270 & 0x7) != 0);
            if (this.field5878.field7098) {
                this.field5878.method979(Integer.MAX_VALUE, this.field5887, this.field5880, this.field5871);
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(1.0F / this.field5875, 1.0F / this.field5875, 1.0F);
            OpenGL.glMatrixMode(5888);
            this.field5878.method2846(this.field5870.field5297, this.field5883, this.field5870.field5302, 32888, this.field5870.field5308);
            this.field5878.method2847(-92, this.field5868, 4, var4, 0);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
        if (arg2 > -104) {
            this.method2453(null, -116, 17);
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lnba;IIIII)V")
    public class413(class366 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5870 = arg0;
        this.field5871 = arg5;
        this.field5875 = arg2;
        this.field5880 = arg4;
        this.field5878 = this.field5870.field5277;
        this.field5869 = arg1;
        this.field5879 = new int[this.field5870.field8121 * this.field5870.field8118];
        this.field5887 = arg3;
        this.field5868 = new class11(this.field5878, 5123, null, 1);
    }
}
