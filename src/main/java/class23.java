import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 extends class179 {

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Ltn;")
    private class55 field283;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "F")
    public float field299;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "[I")
    private int[] field291;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Lbl;")
    private class442 field295;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Loi;")
    private class49 field286;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "F")
    public static float field289 = 0.0F;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field292 = -1;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field297 = -1;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lig;")
    public static class154 field293;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "Lot;")
    private class400 field300;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Llt;")
    public static class458 field284;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "Lwc;")
    public static class46 field305;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field303;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field288;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[II)V")
    public final void method116(int arg0, int[] arg1, int arg2) {
        if (arg0 < 48) {
            this.field306 = 113;
        }
        field298++;
        int var4 = 0;
        class40 var5 = class456.field6997;
        var5.field585 = 0;
        if (this.field295.field6745) {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field283.field835[var13];
                int var15 = this.field291[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var5.method246((byte) -78, var14[var17++] & 0xFFFF);
                            var4++;
                            var5.method246((byte) -90, var14[var17++] & 0xFFFF);
                            var4++;
                            var5.method246((byte) -70, var14[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg1[var6];
                int var8 = this.field291[var7];
                short[] var9 = this.field283.field835[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var5.method260(var9[var11++] & 0xFFFF, -2916);
                            var4++;
                            var4++;
                            var5.method260(var9[var11++] & 0xFFFF, -2916);
                            var4++;
                            var5.method260(var9[var11++] & 0xFFFF, -2916);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field286.method353(5123, var5.field536, var5.field585, (byte) -27);
        this.field295.method2646(this.field283.field874, this.field283.field870, -19887, this.field300, this.field283.field875);
        this.field295.method2637((this.field283.field855 & 0x8) != 0, -15340, (this.field283.field855 & 0x7) != 0, this.field304);
        if (this.field295.field6779) {
            this.field295.method1977(Integer.MAX_VALUE, this.field306, this.field290, this.field287);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field299, 1.0F / this.field299, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field295.method2646(this.field283.field874, this.field283.field870, -19887, this.field300, this.field283.field875);
        this.field295.method2593(4, true, 0, var4, this.field286);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([FFIFIBIIIIIIF)V")
    public static final void method117(float[] arg0, float arg1, int arg2, float arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, float arg12) {
        int var13 = arg7 - arg2;
        field294++;
        if (arg5 >= -108) {
            method117(null, -0.49734405F, -75, 0.8370151F, -82, (byte) -92, -83, 121, -115, 89, 77, 73, 0.6153445F);
        }
        int var14 = arg6 - arg4;
        int var15 = arg8 - arg11;
        float var16 = arg0[2] * (float) var15 + arg0[1] * (float) var13 + arg0[0] * (float) var14;
        float var17 = arg0[5] * (float) var15 + arg0[4] * (float) var13 + arg0[3] * (float) var14;
        float var18 = arg0[8] * (float) var15 + arg0[6] * (float) var14 + arg0[7] * (float) var13;
        float var19;
        float var20;
        if (arg9 == 0) {
            var19 = arg3 + 0.5F - var18;
            var20 = arg1 + var16 + 0.5F;
        } else if (arg9 == 1) {
            var19 = arg3 + var18 + 0.5F;
            var20 = arg1 + var16 + 0.5F;
        } else if (arg9 == 2) {
            var20 = arg1 + 0.5F - var16;
            var19 = arg12 + 0.5F - var17;
        } else if (arg9 == 3) {
            var19 = arg12 + 0.5F - var17;
            var20 = arg1 + var16 + 0.5F;
        } else if (arg9 == 4) {
            var19 = arg12 + 0.5F - var17;
            var20 = arg3 + var18 + 0.5F;
        } else {
            var19 = arg12 + 0.5F - var17;
            var20 = arg3 + 0.5F - var18;
        }
        if (arg10 == 1) {
            float var21 = var20;
            var20 = -var19;
            var19 = var21;
        } else if (arg10 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg10 == 3) {
            float var22 = var20;
            var20 = var19;
            var19 = -var22;
        }
        class367.field5396 = var20;
        class343.field5110 = var19;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
    public final void method118(int arg0, int arg1) {
        if (arg1 > 64) {
            this.field288.method2487(arg0 * 4 + 3);
            field296++;
            this.field288.method2486(-1);
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
    public static void method119(int arg0) {
        if (arg0 != 3) {
            field292 = 108;
        }
        field305 = null;
        field284 = null;
        field293 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)V")
    public final void method120(boolean arg0, int arg1) {
        field302++;
        this.field303 = this.field295.field6690.method2490(arg1 * 4);
        if (!arg0) {
            method119(-96);
        }
        this.field288 = new NativeStream(this.field303);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIF)V")
    public final void method121(int arg0, int arg1, int arg2, int arg3, float arg4) {
        if (this.field304 != -1) {
            class48 var6 = this.field295.field4784.method59(this.field304, 21645);
            int var7 = var6.field727 & 0xFF;
            if (var7 != 0 && var6.field728 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg0 * 131586;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((var8 & 0xFF00FF) * var7 + ((arg3 & 0xFF00FF) * var10) & 0xFF00FF00) + ((var8 & 0xFF00) * var7 + ((arg3 & 0xFF00) * var10) & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field723 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg3 & 0xFF0000) >> 16) * var11;
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
                arg3 = (var13 & 0xFF00) + (var14 >> 8) + (var12 << 8 & 0xFF00FD);
            }
        }
        field307++;
        this.field288.method2487(arg2 * 4);
        if (arg4 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = (arg3 & 0xFF67) >> 8;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg4);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg4);
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
            arg3 = var20 | var18 << 16 | var19 << 8;
        }
        this.field288.method2486((byte) (arg3 >> 16));
        this.field288.method2486((byte) (arg3 >> 8));
        if (arg1 != -3509) {
            this.field290 = -95;
        }
        this.field288.method2486((byte) arg3);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V")
    public final void method122(byte arg0, int arg1) {
        if (arg0 != -117) {
            this.method120(false, -56);
        }
        field285++;
        this.field288.method2484();
        class186 var3 = this.field295.method2626(arg0 ^ 0x15, this.field303, false, arg1 * 4, 4);
        this.field300 = new class400(this.field295, var3, 5121, 4, 0);
        this.field303 = null;
        this.field288 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V")
    public final void method123(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 65535) {
            this.field291[this.field283.field5108 * arg2 + arg1] = class318.method1973(this.field291[this.field283.field5108 * arg2 + arg1], 0x1 << arg0);
            field301++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ltn;IIIII)V")
    public class23(class55 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field283 = arg0;
        this.field287 = arg5;
        this.field299 = arg2;
        this.field291 = new int[this.field283.field5108 * this.field283.field5105];
        this.field306 = arg3;
        this.field304 = arg1;
        this.field295 = this.field283.field854;
        this.field290 = arg4;
        this.field286 = new class49(this.field295, 5123, null, 1);
    }
}
