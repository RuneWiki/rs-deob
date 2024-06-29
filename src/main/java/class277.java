import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class277 extends class184 {

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "Lmh;")
    private class634 field3935;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "[I")
    private int[] field3931;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Lwh;")
    private class148 field3927;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public int field3933;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "F")
    public float field3940;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public int field3924;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public int field3928;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "Lck;")
    private class644 field3939;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3936 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "[I")
    public static int[] field3938 = new int[6];

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "Lmia;")
    public static class63 field3944 = new class63(81, 3);

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "Lcl;")
    private class268 field3942;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3923;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3922;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "[[[Lffa;")
    public static class186[][][] field3946;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[II)V")
    public final void method1754(int arg0, int[] arg1, int arg2) {
        field3934++;
        if (arg2 != 65535) {
            return;
        }
        int var4 = 0;
        class699 var5 = this.field3927.field2313;
        var5.field9084 = 0;
        if (this.field3927.field2211) {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg1[var6];
                int var8 = this.field3931[var7];
                short[] var9 = this.field3935.field8889[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method3702(var9[var11++] & 0xFFFF, (byte) -116);
                            var4++;
                            var5.method3702(var9[var11++] & 0xFFFF, (byte) -121);
                            var4++;
                            var5.method3702(var9[var11++] & 0xFFFF, (byte) -110);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field3935.field8889[var13];
                int var15 = this.field3931[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var5.method3758(var14[var17++] & 0xFFFF, 1394247496);
                            var4++;
                            var5.method3758(var14[var17++] & 0xFFFF, arg2 ^ 0x531A78B7);
                            var4++;
                            var4++;
                            var5.method3758(var14[var17++] & 0xFFFF, arg2 ^ 0x531A78B7);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field3939.method3212(var5.field9084, var5.field9068, arg2 ^ 0xFFFF0077, 5123);
        this.field3927.method1048(this.field3935.field8909, 16384, this.field3942, this.field3935.field8917, this.field3935.field8915);
        this.field3927.method1032((byte) -49, this.field3928, (this.field3935.field8880 & 0x8) != 0, (this.field3935.field8880 & 0x7) != 0);
        if (this.field3927.field2235) {
            this.field3927.method439(Integer.MAX_VALUE, this.field3924, this.field3929, this.field3933);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field3940, 1.0F / this.field3940, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field3927.method1048(this.field3935.field8909, 16384, this.field3942, this.field3935.field8917, this.field3935.field8915);
        this.field3927.method1064(false, 4, this.field3939, 0, var4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)V")
    public final void method1755(int arg0, int arg1, int arg2, int arg3) {
        field3925++;
        this.field3931[this.field3935.field3963 * arg0 + arg3] = class625.method3600(this.field3931[this.field3935.field3963 * arg0 + arg3], 0x1 << arg2);
        if (arg1 != 3) {
            this.field3939 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIFII)V")
    public final void method1756(int arg0, int arg1, float arg2, int arg3, int arg4) {
        if (this.field3928 != -1) {
            class293 var6 = this.field3927.field849.method1124((byte) 32, this.field3928);
            int var7 = var6.field4179 & 0xFF;
            if (var7 != 0 && var6.field4185 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((var8 & 0xFF00) * var7 + ((arg4 & 0xFF00) * var10) & 0xFF0000) + ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field4193 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg4 >> 16 & 0xFF) * var11;
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
                arg4 = (var12 << 8 & 0xFF008C) + ((var13 & 0xFF00) + (var14 >> 8));
            }
        }
        field3932++;
        if (arg2 != 1.0F) {
            int var15 = (arg4 & 0xFF8A58) >> 16;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg2);
            int var18 = arg4 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg2);
            int var20 = (int) ((float) var18 * arg2);
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
            arg4 = var17 << 16 | var19 << 8 | var20;
        }
        this.field3923.method3859(arg3 * 4);
        this.field3923.method3871((byte) (arg4 >> 16));
        if (arg1 != 575) {
            this.method1758(-11, -12);
        }
        this.field3923.method3871((byte) (arg4 >> 8));
        this.field3923.method3871((byte) arg4);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)V")
    public final void method1757(byte arg0, int arg1) {
        this.field3923.method3872();
        field3930++;
        class761 var3 = this.field3927.method1050(arg1 * 4, false, false, this.field3922, 4);
        this.field3942 = new class268(var3, 5121, 4, 0);
        this.field3922 = null;
        this.field3923 = null;
        if (arg0 != 11) {
            this.method1756(-72, 123, 1.5363513F, 3, 87);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public final void method1758(int arg0, int arg1) {
        field3943++;
        this.field3923.method3859(arg0 * 4 + 3);
        if (arg1 > -76) {
            this.field3935 = null;
        }
        this.field3923.method3871(-1);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(JI)V")
    public static final void method1759(long arg0, int arg1) {
        int var3 = 6 / ((arg1 + 32) / 58);
        field3926++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class309.method1958(arg0 - 1L, 1199);
            class309.method1958(1L, 1199);
        } else {
            class309.method1958(arg0, 1199);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static final void method1760(byte arg0) {
        if (arg0 != 96) {
            method1761(60);
        }
        field3941++;
        if (class736.field10316 == null) {
            return;
        }
        if (class419.field6265) {
            class515.method3043((byte) 90);
        }
        class177.field2736.method893((byte) -39);
        class252.method1662();
        class85.method696(-1);
        class189.method1317((byte) 85);
        class393.method2517((byte) 111);
        class698.method3962((byte) -15);
        if (class704.field9842 != null) {
            class704.field9842.method2672((byte) 109);
        }
        class152.method1127(false);
        class132.method934(false);
        class738.method4139((byte) 36);
        class119.method866((byte) -16);
        client.method1892(-119, false);
        for (int var1 = 0; var1 < 2048; var1++) {
            class689 var5 = class314.field4456[var1];
            if (var5 != null) {
                for (int var6 = 0; var6 < var5.field6136.length; var6++) {
                    var5.field6136[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class567.field8058; var2++) {
            class282 var3 = class488.field6985[var2].field6439;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field6136.length; var4++) {
                    var3.field6136[var4] = null;
                }
            }
        }
        class124.field1673 = null;
        class562.field8014 = null;
        class736.field10316.method447((byte) -9);
        class736.field10316 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method1761(int arg0) {
        if (arg0 != 5888) {
            field3946 = null;
        }
        field3938 = null;
        field3944 = null;
        field3936 = null;
        field3946 = null;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(BI)V")
    public final void method1762(byte arg0, int arg1) {
        this.field3922 = this.field3927.field2166.method3857(arg1 * 4, true);
        if (arg0 < -22) {
            field3937++;
            this.field3923 = new Stream(this.field3922);
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lmh;IIIII)V")
    public class277(class634 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3935 = arg0;
        this.field3931 = new int[this.field3935.field3963 * this.field3935.field3962];
        this.field3929 = arg4;
        this.field3927 = this.field3935.field8900;
        this.field3933 = arg5;
        this.field3940 = arg2;
        this.field3924 = arg3;
        this.field3928 = arg1;
        this.field3939 = new class644(this.field3927, 5123, null, 1);
    }
}
