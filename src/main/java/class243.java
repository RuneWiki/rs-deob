import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class243 extends class499 {

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "Ljt;")
    private class67 field3372;

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
    public int field3375;

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!uv", name = "t", descriptor = "I")
    public int field3377;

    @OriginalMember(owner = "client!uv", name = "w", descriptor = "I")
    public int field3380;

    @OriginalMember(owner = "client!uv", name = "y", descriptor = "[I")
    private int[] field3382;

    @OriginalMember(owner = "client!uv", name = "C", descriptor = "Lht;")
    private class410 field3386;

    @OriginalMember(owner = "client!uv", name = "F", descriptor = "F")
    public float field3389;

    @OriginalMember(owner = "client!uv", name = "E", descriptor = "Lva;")
    private class342 field3388;

    @OriginalMember(owner = "client!uv", name = "A", descriptor = "[I")
    public static int[] field3384;

    @OriginalMember(owner = "client!uv", name = "H", descriptor = "Lqo;")
    public static class19 field3391;

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!uv", name = "u", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!uv", name = "v", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!uv", name = "x", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!uv", name = "B", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!uv", name = "D", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!uv", name = "G", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!uv", name = "J", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!uv", name = "K", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "Lds;")
    private class12 field3371;

    @OriginalMember(owner = "client!uv", name = "I", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field3392;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field3373;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BI)V")
    public final void method1431(byte arg0, int arg1) {
        field3379++;
        this.field3392 = this.field3386.field5862.method2627(arg1 * 4);
        this.field3373 = new NativeStream(this.field3392);
        if (arg0 <= 123) {
            this.field3375 = 89;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V")
    public final void method1432(int arg0, int arg1) {
        if (arg0 >= 99) {
            this.field3373.method2626(arg1 * 4 + 3);
            field3387++;
            this.field3373.method2620(-1);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
    public static void method1433(int arg0) {
        field3391 = null;
        if (arg0 > -33) {
            field3391 = null;
        }
        field3384 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "([III)V")
    public final void method1434(int[] arg0, int arg1, int arg2) {
        field3374++;
        int var4 = 0;
        class365 var5 = class170.field2403;
        var5.field5069 = 0;
        if (this.field3386.field5931) {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg0[var12];
                int var14 = this.field3382[var13];
                short[] var15 = this.field3372.field943[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((0x1 << var16++ & var14) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method2070(81954016, var15[var17++] & 0xFFFF);
                            var5.method2070(81954016, var15[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method2070(arg1 ^ 0x4E2841F, var15[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg0[var6];
                int var8 = this.field3382[var7];
                short[] var9 = this.field3372.field943[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2115((byte) 39, var9[var11++] & 0xFFFF);
                            var5.method2115((byte) 80, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method2115((byte) 33, var9[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 > 0) {
            this.field3388.method1911(var5.field5073, 5123, 112, var5.field5069);
            this.field3386.method2439(this.field3372.field961, (byte) -127, this.field3372.field966, this.field3371, this.field3372.field965);
            this.field3386.method2361(this.field3380, (this.field3372.field919 & 0x7) != 0, (this.field3372.field919 & 0x8) != 0, false);
            if (this.field3386.field5898) {
                this.field3386.method466(Integer.MAX_VALUE, this.field3376, this.field3377, this.field3375);
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(1.0F / this.field3389, 1.0F / this.field3389, 1.0F);
            OpenGL.glMatrixMode(5888);
            this.field3386.method2439(this.field3372.field961, (byte) -8, this.field3372.field966, this.field3371, this.field3372.field965);
            this.field3386.method2420(0, var4, -60, this.field3388, 4);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
        if (arg1 != 255) {
            this.field3377 = -2;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIII)V")
    public static final void method1435(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -27914) {
            method1441(69, (byte) 9, 59);
        }
        field3385++;
        class163 var5 = class271.method1546(arg2, 4, true);
        var5.method1017(0);
        var5.field2328 = arg3;
        var5.field2324 = arg4;
        var5.field2332 = arg1;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(FIIBI)V")
    public final void method1436(float arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (this.field3380 != -1) {
            class501 var6 = this.field3386.field2312.method830(this.field3380, (byte) 71);
            int var7 = var6.field7375 & 0xFF;
            if (var7 != 0 && var6.field7366 != 4) {
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
            int var11 = var6.field7362 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg4 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg4 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = ((var12 & 0x7D00FF00) << 8) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        field3381++;
        if (arg0 != 1.0F) {
            int var15 = (arg4 & 0xFF8869) >> 16;
            int var16 = (arg4 & 0xFFAE) >> 8;
            int var17 = arg4 & 0xFF;
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
            arg4 = var19 << 8 | var18 << 16 | var20;
        }
        this.field3373.method2626(arg1 * 4);
        this.field3373.method2620((byte) (arg4 >> 16));
        if (arg3 != -18) {
            this.field3389 = -1.2372754F;
        }
        this.field3373.method2620((byte) (arg4 >> 8));
        this.field3373.method2620((byte) arg4);
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(II)V")
    public static final void method1437(int arg0, int arg1) {
        field3394++;
        class163 var2 = class271.method1546(arg0, 9, true);
        if (arg1 < 46) {
            method1435(35, -43, -82, -62, 25);
        }
        var2.method1010(1504);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BIII)V")
    public final void method1438(byte arg0, int arg1, int arg2, int arg3) {
        field3378++;
        if (arg0 >= -9) {
            field3384 = null;
        }
        this.field3382[this.field3372.field495 * arg2 + arg1] = class25.method183(this.field3382[this.field3372.field495 * arg2 + arg1], 0x1 << arg3);
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(II)V")
    public final void method1439(int arg0, int arg1) {
        field3393++;
        this.field3373.method2625();
        class74 var3 = this.field3386.method2368(false, 4, 0, this.field3392, arg0 * 4);
        this.field3371 = new class12(this.field3386, var3, 5121, 4, 0);
        if (arg1 > -67) {
            method1441(-101, (byte) -93, -76);
        }
        this.field3373 = null;
        this.field3392 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1440(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3390++;
        if (arg4 != -77) {
            field3391 = null;
        }
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg0 * arg0;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg5 - 1) * var15;
        if (arg2 >= class343.field4727 && class54.field753 >= arg2) {
            int var21 = class497.method2935(class175.field2497, arg1 + arg0, class382.field5379, -128);
            int var22 = class497.method2935(class175.field2497, arg1 - arg0, class382.field5379, -126);
            class419.method2511(class225.field3174[arg2], var22, arg3, var21, 118);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var6++;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var20 -= var15;
            var7--;
            int var23 = arg2 - var7;
            int var24 = arg2 + var7;
            if (var24 >= class343.field4727 && class54.field753 >= var23) {
                int var25 = class497.method2935(class175.field2497, arg1 + var6, class382.field5379, arg4 - 50);
                int var26 = class497.method2935(class175.field2497, arg1 - var6, class382.field5379, -127);
                if (class343.field4727 <= var23) {
                    class419.method2511(class225.field3174[var23], var26, arg3, var25, 84);
                }
                if (var24 <= class54.field753) {
                    class419.method2511(class225.field3174[var24], var26, arg3, var25, arg4 - 5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IBI)V")
    public static final void method1441(int arg0, byte arg1, int arg2) {
        class356.field4865 = arg0 - class481.field7046;
        field3383++;
        if (arg1 <= 118) {
            method1435(64, 102, 79, 126, -107);
        }
        class517.field7596 = arg2 - class481.field7066;
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Ljt;IIIII)V")
    public class243(class67 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3372 = arg0;
        this.field3375 = arg5;
        this.field3376 = arg3;
        this.field3377 = arg4;
        this.field3380 = arg1;
        this.field3382 = new int[this.field3372.field497 * this.field3372.field495];
        this.field3386 = this.field3372.field933;
        this.field3389 = arg2;
        this.field3388 = new class342(this.field3386, 5123, null, 1);
    }

    static {
        new class83("Use", "Benutzen", "Utiliser", "Usar");
        field3384 = new int[14];
        field3391 = new class19("", 17);
    }
}
