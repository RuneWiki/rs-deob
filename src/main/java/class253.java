import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class253 extends class168 {

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "Led;")
    private class707 field3230;

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "F")
    public float field3222;

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "Lbi;")
    private class483 field3218;

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
    public int field3221;

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "[I")
    private int[] field3228;

    @OriginalMember(owner = "client!kw", name = "C", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "Lkf;")
    private class256 field3232;

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "Lkg;")
    public static class275 field3225 = new class275(13, 6);

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "Lkg;")
    public static class275 field3237 = new class275(11, -2);

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!kw", name = "B", descriptor = "Luo;")
    private class578 field3235;

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3231;

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3219;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "()V")
    public static final void method1546() {
        if (class123.field1778 != null) {
            for (int var0 = 0; var0 < class123.field1778.length; var0++) {
                for (int var1 = 0; var1 < class289.field3784; var1++) {
                    for (int var2 = 0; var2 < class463.field6223; var2++) {
                        if (class123.field1778[var0][var1][var2] != null) {
                            class123.field1778[var0][var1][var2].method100(false);
                        }
                        class123.field1778[var0][var1][var2] = null;
                    }
                }
            }
        }
        class123.field1778 = null;
        class707.field9826 = null;
        if (class665.field9356 != null) {
            for (int var3 = 0; var3 < class665.field9356.length; var3++) {
                for (int var4 = 0; var4 < class289.field3784; var4++) {
                    for (int var5 = 0; var5 < class463.field6223; var5++) {
                        if (class665.field9356[var3][var4][var5] != null) {
                            class665.field9356[var3][var4][var5].method100(false);
                        }
                        class665.field9356[var3][var4][var5] = null;
                    }
                }
            }
        }
        class665.field9356 = null;
        class395.field5009 = null;
        class197.field2689 = null;
        class195.field2669 = null;
        class449.field5945 = null;
        class214.field2824 = null;
        class307.field4057 = null;
        class499.field7027 = null;
        class619.field8537 = null;
        class282.method1679(false);
        if (class541.field7494 != null) {
            for (int var6 = 0; var6 < class551.field7698; var6++) {
                class541.field7494[var6] = null;
            }
            class551.field7698 = 0;
        }
        class730.field10164 = null;
        class72.field1005 = null;
        class259.field3278 = null;
        if (class381.field4850 != null) {
            for (int var7 = 0; var7 < class381.field4850.length; var7++) {
                class381.field4850[var7] = null;
            }
            class333.field4239 = 0;
        }
        if (class442.field5873 != null) {
            for (int var8 = 0; var8 < class442.field5873.length; var8++) {
                class442.field5873[var8] = null;
            }
            class475.field6397 = 0;
        }
        if (class58.field808 != null) {
            for (int var9 = 0; var9 < class178.field2498; var9++) {
                class58.field808[var9] = null;
            }
            for (int var10 = 0; var10 < class29.field515; var10++) {
                for (int var11 = 0; var11 < class289.field3784; var11++) {
                    for (int var12 = 0; var12 < class463.field6223; var12++) {
                        class454.field6070[var10][var11][var12] = 0L;
                    }
                }
            }
            class178.field2498 = 0;
        }
        class264.method1581(-90);
        class386.field4924 = class386.field4923;
        class386.field4924.method3603(-14913);
        class223.field2984 = null;
        class498.field7019 = null;
        class197.field2682 = null;
        if (class433.field5776 != null) {
            class409.method2285();
            class681.field9504.method452(1);
            class681.field9504.method506(0);
        }
        if (class160.field2211 != null) {
            class160.field2211 = null;
        }
        class681.field9504 = null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
    public static void method1547(int arg0) {
        field3237 = null;
        field3225 = null;
        if (arg0 != -23957) {
            field3225 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)V")
    public final void method1548(int arg0, int arg1) {
        field3223++;
        this.field3231.method3793();
        class128 var3 = this.field3218.method2810(4, this.field3219, false, arg0 * 4, false);
        this.field3235 = new class578(var3, 5121, 4, arg1);
        this.field3231 = null;
        this.field3219 = null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II[I)V")
    public final void method1549(int arg0, int arg1, int[] arg2) {
        field3234++;
        if (arg1 != -9570) {
            return;
        }
        int var4 = 0;
        class736 var5 = this.field3218.field6845;
        var5.field6193 = 0;
        if (this.field3218.field6903) {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg2[var12];
                short[] var14 = this.field3230.field9813[var13];
                int var15 = this.field3228[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var5.method2620(var14[var17++] & 0xFFFF, false);
                            var4++;
                            var4++;
                            var5.method2620(var14[var17++] & 0xFFFF, false);
                            var5.method2620(var14[var17++] & 0xFFFF, false);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg2[var6];
                int var8 = this.field3228[var7];
                short[] var9 = this.field3230.field9813[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2619(var9[var11++] & 0xFFFF, arg1 ^ 0x2561);
                            var5.method2619(var9[var11++] & 0xFFFF, arg1 + 9569);
                            var4++;
                            var5.method2619(var9[var11++] & 0xFFFF, arg1 + 9569);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field3232.method1107(5123, var5.field6180, 21189, var5.field6193);
        this.field3218.method2821((byte) -48, this.field3230.field9825, this.field3230.field9824, this.field3235, this.field3230.field9823);
        this.field3218.method2780(this.field3221, 127, (this.field3230.field9816 & 0x8) != 0, (this.field3230.field9816 & 0x7) != 0);
        if (this.field3218.field6915) {
            this.field3218.method453(Integer.MAX_VALUE, this.field3226, this.field3236, this.field3233);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field3222, 1.0F / this.field3222, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field3218.method2821((byte) -48, this.field3230.field9825, this.field3230.field9824, this.field3235, this.field3230.field9823);
        this.field3218.method2854(4, 0, var4, this.field3232, (byte) -113);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)V")
    public final void method1550(byte arg0, int arg1) {
        int var3 = -1 / ((75 - arg0) / 50);
        this.field3231.method3797(arg1 * 4 + 3);
        field3229++;
        this.field3231.method3792(-1);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIF)V")
    public final void method1551(int arg0, int arg1, int arg2, int arg3, float arg4) {
        if (this.field3221 != -1) {
            class537 var6 = this.field3218.field830.method1072(this.field3221, true);
            int var7 = var6.field7438 & 0xFF;
            if (var7 != 0 && var6.field7443 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field7437 & 0xFF;
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
                arg0 = (var13 & 0xFF00) + ((var12 & 0xBE00FF00) << 8) + (var14 >> 8);
            }
        }
        field3220++;
        if (arg4 != 1.0F) {
            int var15 = arg0 >> 16 & 0xFF;
            int var16 = arg0 >> 8 & 0xFF;
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
            arg0 = var20 | var19 << 8 | var18 << 16;
        }
        this.field3231.method3797(arg3 * 4);
        this.field3231.method3792((byte) (arg0 >> 16));
        if (arg2 > 20) {
            this.field3231.method3792((byte) (arg0 >> 8));
            this.field3231.method3792((byte) arg0);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIII)V")
    public final void method1552(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.method1553(37, 106);
        }
        this.field3228[this.field3230.field3561 * arg0 + arg3] = class683.method3840(this.field3228[this.field3230.field3561 * arg0 + arg3], 0x1 << arg1);
        field3224++;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)V")
    public final void method1553(int arg0, int arg1) {
        if (arg1 != -15936) {
            field3225 = null;
        }
        field3227++;
        this.field3219 = this.field3218.field6778.method3781(arg0 * 4, true);
        this.field3231 = new Stream(this.field3219);
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Led;IIIII)V")
    public class253(class707 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3230 = arg0;
        this.field3226 = arg3;
        this.field3233 = arg5;
        this.field3222 = arg2;
        this.field3218 = this.field3230.field9815;
        this.field3221 = arg1;
        this.field3228 = new int[this.field3230.field3561 * this.field3230.field3555];
        this.field3236 = arg4;
        this.field3232 = new class256(this.field3218, 5123, null, 1);
    }
}
