import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class449 extends class417 {

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "Lsb;")
    private class244 field6292;

    @OriginalMember(owner = "client!hr", name = "A", descriptor = "I")
    public int field6299;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public int field6282;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    public int field6291;

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "[I")
    private int[] field6297;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "Lte;")
    private class527 field6285;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public int field6284;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "F")
    public float field6288;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "Loe;")
    private class172 field6287;

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "Lada;")
    public static class144 field6293 = new class144(61, 4);

    @OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "Lmaa;")
    private class403 field6298;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6290;

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6294;

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "[I")
    public static int[] field6303;

    static {
        new class572("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field6301 = 0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V", line = 6)
    public static void method2712(byte arg0) {
        field6303 = null;
        field6293 = null;
        if (arg0 != -53) {
            field6303 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIFII)V", line = 18)
    public final void method2713(int arg0, int arg1, float arg2, int arg3, int arg4) {
        if (this.field6284 != -1) {
            class471 var6 = this.field6285.field3092.method110(this.field6284, (byte) 105);
            int var7 = var6.field6660 & 0xFF;
            if (var7 != 0 && var6.field6646 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg1 * 131586;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field6657 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg3 >> 16 & 0xFF) * var11;
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
                arg3 = (var14 >> 8) + ((var12 << 8 & 0xFF00C5) + (var13 & 0xFF00));
            }
        }
        field6300++;
        this.field6290.method3449(arg4 * 4);
        if (arg2 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = arg3 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg2);
            int var18 = arg3 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg2);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var17 << 16 | var19 << 8 | var20;
        }
        this.field6290.method3445((byte) (arg3 >> 16));
        if (arg0 != 24180) {
            field6301 = -89;
        }
        this.field6290.method3445((byte) (arg3 >> 8));
        this.field6290.method3445((byte) arg3);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V", line = 125)
    public static final void method2714(int arg0) {
        field6281++;
        if (arg0 != 128) {
            method2717(-108, 18, -29, -88, 47);
        }
        if (class332.field4598 == null) {
            class13 var1 = new class13();
            byte[] var2 = var1.method99(128, arg0 ^ 0x1080, 128, 16);
            class332.field4598 = class609.method3579(var2, 136, false);
        }
        if (class453.field6397 == null) {
            class301 var3 = new class301();
            byte[] var4 = var3.method1843(16, 128, 128, (byte) 25);
            class453.field6397 = class609.method3579(var4, 136, false);
        }
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)V", line = 155)
    public final void method2715(int arg0, int arg1) {
        field6286++;
        this.field6290.method3449(arg0 * arg1 + 3);
        this.field6290.method3445(-1);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIII)V", line = 171)
    public final void method2716(int arg0, int arg1, int arg2, int arg3) {
        this.field6297[this.field6292.field2697 * arg1 + arg3] = class473.method2847(this.field6297[this.field6292.field2697 * arg1 + arg3], 0x1 << arg2);
        if (arg0 <= 25) {
            this.field6290 = null;
        }
        field6302++;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIII)V", line = 185)
    public static final void method2717(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6295++;
        class221 var5 = class65.method413(10, arg2, (byte) -32);
        if (arg1 <= -115) {
            var5.method1426((byte) -120);
            var5.field3220 = arg4;
            var5.field3208 = arg3;
            var5.field3214 = arg0;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB[I)V", line = 203)
    public final void method2718(int arg0, byte arg1, int[] arg2) {
        field6296++;
        int var4 = 0;
        class247 var5 = this.field6285.field7836;
        if (arg1 < 12) {
            this.method2713(12, 118, -1.3825865F, -75, 69);
        }
        var5.field2177 = 0;
        if (this.field6285.field7842) {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg2[var6];
                int var8 = this.field6297[var7];
                short[] var9 = this.field6292.field3479[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method1027(255, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method1027(255, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method1027(255, var9[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg2[var12];
                int var14 = this.field6297[var13];
                short[] var15 = this.field6292.field3479[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method1057(var15[var17++] & 0xFFFF, (byte) 85);
                            var4++;
                            var5.method1057(var15[var17++] & 0xFFFF, (byte) 85);
                            var4++;
                            var5.method1057(var15[var17++] & 0xFFFF, (byte) 85);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field6287.method1220(5123, var5.field2177, var5.field2146, -27252);
        this.field6285.method3164(this.field6292.field3521, (byte) -98, this.field6292.field3513, this.field6292.field3522, this.field6298);
        this.field6285.method3169((this.field6292.field3490 & 0x8) != 0, 69, (this.field6292.field3490 & 0x7) != 0, this.field6284);
        if (this.field6285.field7818) {
            this.field6285.method453(Integer.MAX_VALUE, this.field6291, this.field6299, this.field6282);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field6288, 1.0F / this.field6288, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field6285.method3164(this.field6292.field3521, (byte) -77, this.field6292.field3513, this.field6292.field3522, this.field6298);
        this.field6285.method3170(0, 99, 4, var4, this.field6287);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(II)V", line = 331)
    public final void method2719(int arg0, int arg1) {
        if (arg0 <= 5) {
            return;
        }
        field6283++;
        this.field6290.method3448();
        class544 var3 = this.field6285.method3172(arg1 * 4, false, 4, false, this.field6294);
        this.field6298 = new class403(var3, 5121, 4, 0);
        this.field6294 = null;
        this.field6290 = null;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lsb;IIIII)V", line = 347)
    public class449(class244 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6292 = arg0;
        this.field6299 = arg4;
        this.field6282 = arg5;
        this.field6291 = arg3;
        this.field6297 = new int[this.field6292.field2697 * this.field6292.field2693];
        this.field6285 = this.field6292.field3488;
        this.field6284 = arg1;
        this.field6288 = arg2;
        this.field6287 = new class172(this.field6285, 5123, null, 1);
    }

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "(II)V", line = 377)
    public final void method2720(int arg0, int arg1) {
        this.field6294 = this.field6285.field7744.method3440(arg0 * arg1, true);
        field6289++;
        this.field6290 = new Stream(this.field6294);
    }
}
