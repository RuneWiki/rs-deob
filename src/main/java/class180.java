import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class180 extends class383 {

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "Lul;")
    private class405 field2380;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "[I")
    private int[] field2384;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public int field2370;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public int field2373;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public int field2376;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "F")
    public float field2374;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "Lug;")
    private class395 field2390;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "Lor;")
    private class454 field2389;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Ldq;")
    public static class493 field2375 = new class493(26, 12);

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "F")
    public static float field2385;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "Log;")
    private class460 field2379;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field2378;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field2377;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V")
    public final void method1146(int arg0, byte arg1) {
        this.field2378 = this.field2390.field5499.method2602(arg0 * 4);
        if (arg1 < -44) {
            field2386++;
            this.field2377 = new NativeStream(this.field2378);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
    public static final void method1147(int arg0, int arg1) {
        field2369++;
        class153 var2 = class75.method656(10, 255, arg0);
        var2.method997((byte) 93);
        if (arg1 < 123) {
            field2382 = 97;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method1148(int arg0) {
        int var1 = 55 / ((arg0 - 66) / 47);
        field2375 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[I)V")
    public final void method1149(int arg0, int arg1, int[] arg2) {
        field2383++;
        if (arg0 != 20324) {
            method1148(-124);
        }
        int var4 = 0;
        class498 var5 = this.field2390.field5536;
        var5.field6631 = 0;
        if (this.field2390.field5593) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg2[var6];
                short[] var8 = this.field2380.field5783[var7];
                int var9 = this.field2384[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var8.length) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2759((byte) -122, var8[var11++] & 0xFFFF);
                            var5.method2759((byte) -91, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method2759((byte) -21, var8[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg2[var12];
                short[] var14 = this.field2380.field5783[var13];
                int var15 = this.field2384[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method2790(arg0 - 951350908, var14[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method2790(-951330584, var14[var17++] & 0xFFFF);
                            var5.method2790(-951330584, var14[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field2389.method2505(5123, 6538, var5.field6631, var5.field6618);
        this.field2390.method2295(this.field2380.field5810, this.field2380.field5807, this.field2379, false, this.field2380.field5809);
        this.field2390.method2336((this.field2380.field5757 & 0x8) != 0, (this.field2380.field5757 & 0x7) != 0, (byte) 127, this.field2381);
        if (this.field2390.field5543) {
            this.field2390.method357(Integer.MAX_VALUE, this.field2370, this.field2376, this.field2373);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field2374, 1.0F / this.field2374, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field2390.method2295(this.field2380.field5810, this.field2380.field5807, this.field2379, false, this.field2380.field5809);
        this.field2390.method2343(arg0 ^ 0xFFFFB0E9, this.field2389, 0, var4, 4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(IB)V")
    public final void method1150(int arg0, byte arg1) {
        field2388++;
        this.field2377.method2595();
        if (arg1 < 37) {
            this.method1149(72, -116, null);
        }
        class459 var3 = this.field2390.method2350(false, this.field2378, -1, 4, arg0 * 4);
        this.field2379 = new class460(var3, 5121, 4, 0);
        this.field2378 = null;
        this.field2377 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V")
    public final void method1151(int arg0, int arg1, int arg2, int arg3) {
        this.field2384[this.field2380.field1842 * arg0 + arg2] = class215.method1323(this.field2384[this.field2380.field1842 * arg0 + arg2], 0x1 << arg3);
        field2371++;
        if (arg1 != 22322) {
            this.field2373 = -51;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBFII)V")
    public final void method1152(int arg0, byte arg1, float arg2, int arg3, int arg4) {
        if (this.field2381 != -1) {
            class139 var6 = this.field2390.field502.method1642(this.field2381, -41);
            int var7 = var6.field1785 & 0xFF;
            if (var7 != 0 && var6.field1794 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg4 * 131586;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((var8 & 0xFF00FF) * var7 + ((arg0 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field1788 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg0 >> 16 & 0xFF) * var11;
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
                arg0 = (var13 & 0xFF00) + ((var12 & 0x4500FF00) << 8) + (var14 >> 8);
            }
        }
        int var15 = 65 % ((39 - arg1) / 36);
        field2372++;
        if (arg2 != 1.0F) {
            int var16 = (arg0 & 0xFF2FE4) >> 16;
            int var17 = arg0 >> 8 & 0xFF;
            int var18 = arg0 & 0xFF;
            int var19 = (int) ((float) var16 * arg2);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            int var21 = (int) ((float) var18 * arg2);
            if (var21 < 0) {
                var21 = 0;
            } else if (var21 > 255) {
                var21 = 255;
            }
            arg0 = var21 | var20 << 8 | var19 << 16;
        }
        this.field2377.method2597(arg3 * 4);
        this.field2377.method2598((byte) (arg0 >> 16));
        this.field2377.method2598((byte) (arg0 >> 8));
        this.field2377.method2598((byte) arg0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V")
    public final void method1153(int arg0, boolean arg1) {
        if (arg1) {
            field2368++;
            this.field2377.method2597(arg0 * 4 + 3);
            this.field2377.method2598(-1);
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lul;IIIII)V")
    public class180(class405 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2380 = arg0;
        this.field2384 = new int[this.field2380.field1844 * this.field2380.field1842];
        this.field2370 = arg3;
        this.field2381 = arg1;
        this.field2373 = arg5;
        this.field2376 = arg4;
        this.field2374 = arg2;
        this.field2390 = this.field2380.field5758;
        this.field2389 = new class454(this.field2390, 5123, null, 1);
    }
}
