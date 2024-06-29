import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class156 extends class42 {

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "Lgu;")
    private class417 field2388;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "[I")
    private int[] field2384;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public int field2376;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "Lbt;")
    private class33 field2387;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public int field2377;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "F")
    public float field2389;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "Lnr;")
    private class41 field2378;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "[I")
    public static int[] field2390 = new int[32];

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "Ljd;")
    private class157 field2383;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "Ljk;")
    public static class456 field2374;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field2380;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field2373;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "[I")
    public static int[] field2375;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "[Laa;")
    public static class343[] field2391;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V", line = 8)
    public final void method1091(int arg0, int arg1) {
        field2379++;
        if (arg1 == 22050) {
            this.field2380 = this.field2387.field623.method2654(arg0 * 4);
            this.field2373 = new NativeStream(this.field2380);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)V", line = 25)
    public static final void method1092(int arg0, int arg1) {
        class28.field390 = arg0;
        if (arg1 == 333074536) {
            field2392++;
            class211.field3186.method2990((byte) -121);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI[I)V", line = 37)
    public final void method1093(boolean arg0, int arg1, int[] arg2) {
        if (arg0) {
            method1096(53);
        }
        field2386++;
        int var4 = 0;
        class235 var5 = this.field2387.field719;
        var5.field7558 = 0;
        if (this.field2387.field713) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg2[var6];
                int var8 = this.field2384[var7];
                short[] var9 = this.field2388.field5902[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method3016(var9[var11++] & 0xFFFF, -91);
                            var5.method3016(var9[var11++] & 0xFFFF, -121);
                            var4++;
                            var5.method3016(var9[var11++] & 0xFFFF, -90);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg2[var12];
                short[] var14 = this.field2388.field5902[var13];
                int var15 = this.field2384[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method3062(var14[var17++] & 0xFFFF, (byte) -53);
                            var4++;
                            var5.method3062(var14[var17++] & 0xFFFF, (byte) -53);
                            var5.method3062(var14[var17++] & 0xFFFF, (byte) -53);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field2378.method412(var5.field7545, 5123, 23432, var5.field7558);
        this.field2387.method319(this.field2383, this.field2388.field5934, this.field2388.field5933, 22146, this.field2388.field5939);
        this.field2387.method239(this.field2371, -7782, (this.field2388.field5889 & 0x7) != 0, (this.field2388.field5889 & 0x8) != 0);
        if (this.field2387.field721) {
            this.field2387.method203(Integer.MAX_VALUE, this.field2393, this.field2376, this.field2377);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field2389, 1.0F / this.field2389, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field2387.method319(this.field2383, this.field2388.field5934, this.field2388.field5933, 22146, this.field2388.field5939);
        this.field2387.method266(4, (byte) 122, 0, var4, this.field2378);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)V", line = 161)
    public final void method1094(byte arg0, int arg1) {
        this.field2373.method2650();
        field2381++;
        class1 var3 = this.field2387.method353(arg1 * 4, -112, false, this.field2380, 4);
        this.field2383 = new class157(var3, 5121, 4, 0);
        if (arg0 == -87) {
            this.field2373 = null;
            this.field2380 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(FIIBI)V", line = 180)
    public final void method1095(float arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2370++;
        if (this.field2371 != -1) {
            class39 var6 = this.field2387.field2505.method93((byte) 97, this.field2371);
            int var7 = var6.field816 & 0xFF;
            if (var7 != 0 && var6.field819 != 4) {
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
                    arg1 = ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field822 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg1 & 0xFF0000) >> 16) * var11;
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
                arg1 = ((var12 & 0x8400FF00) << 8) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        this.field2373.method2645(arg4 * 4);
        if (arg0 != 1.0F) {
            int var15 = (arg1 & 0xFFADC1) >> 16;
            int var16 = (arg1 & 0xFF4C) >> 8;
            int var17 = arg1 & 0xFF;
            int var18 = (int) ((float) var15 * arg0);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg0);
            int var20 = (int) ((float) var17 * arg0);
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
            arg1 = var18 << 16 | var19 << 8 | var20;
        }
        if (arg3 <= -95) {
            this.field2373.method2648((byte) (arg1 >> 16));
            this.field2373.method2648((byte) (arg1 >> 8));
            this.field2373.method2648((byte) arg1);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 290)
    public static final void method1096(int arg0) {
        class492.method2884(1667005479);
        field2372++;
        class222.method1512(22050, (byte) -104, 2, class220.field3371.field2587);
        class66.field1118 = class520.method3086(0, class280.field4173, -152, class481.field6991, 22050);
        class66.field1118.method2957(class217.field3302, 7);
        class445.field6350 = class520.method3086(1, class280.field4173, -152, class481.field6991, 2048);
        if (arg0 == -16674) {
            class445.field6350.method2957(class504.field7295, 7);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V", line = 307)
    public static void method1097(int arg0) {
        field2374 = null;
        if (arg0 != 11403) {
            field2375 = null;
        }
        field2390 = null;
        field2391 = null;
        field2375 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)V", line = 320)
    public final void method1098(int arg0, byte arg1) {
        this.field2373.method2645(arg0 * 4 + 3);
        field2385++;
        this.field2373.method2648(-1);
        if (arg1 > -102) {
            this.field2388 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)V", line = 333)
    public final void method1099(int arg0, int arg1, int arg2, int arg3) {
        field2382++;
        this.field2384[this.field2388.field347 * arg2 + arg1] = class442.method2600(this.field2384[this.field2388.field347 * arg2 + arg1], 0x1 << arg0);
        int var5 = 96 / ((arg3 + 18) / 34);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lgu;IIIII)V", line = 353)
    public class156(class417 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2388 = arg0;
        this.field2384 = new int[this.field2388.field350 * this.field2388.field347];
        this.field2371 = arg1;
        this.field2376 = arg4;
        this.field2387 = this.field2388.field5901;
        this.field2377 = arg5;
        this.field2393 = arg3;
        this.field2389 = arg2;
        this.field2378 = new class41(this.field2387, 5123, null, 1);
    }
}
