import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class716 extends class206 {

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "Laq;")
    private class170 field10361;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public int field10357;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
    public int field10353;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "F")
    public float field10358;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "Lffa;")
    private class197 field10351;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
    public int field10364;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public int field10354;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "[I")
    private int[] field10350;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "Lkfa;")
    private class628 field10352;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field10368 = new String[] { method5216(method5215("*d^a\u001d")), method5216(method5215("*d^c\u001d")), method5216(method5215("*d^`\u001d")), method5216(method5215("*d^f\u001d")), method5216(method5215("*d^\u001b\\.`\u0004\u0019\u001d")), method5216(method5215(".|\u001cK")), method5216(method5215(";'^\tH")), method5216(method5215("*d^d\u001d")), method5216(method5215("*d^e\u001d")), method5216(method5215("*d^b\u001d")) };

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "[I")
    public static int[] field10363 = new int[16];

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "Lel;")
    public static class573 field10348 = new class573(14, 4);

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
    public static int field10367 = 1406;

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
    public static int field10347;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
    public static int field10355;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "I")
    public static int field10356;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "I")
    public static int field10359;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field10365;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field10366;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "Luo;")
    private class602 field10362;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "Ljaclib/memory/Stream;")
    private Stream field10349;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field10360;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)V")
    public final void method5208(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field10350[this.field10361.field4337 * arg1 + arg2] = class544.method4107(this.field10350[this.field10361.field4337 * arg1 + arg2], 0x1 << arg3);
            field10347++;
            if (arg0 < 67) {
                this.method5210((byte) 27, null, 16);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10368[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIFI)V")
    public final void method5209(int arg0, int arg1, int arg2, float arg3, int arg4) {
        try {
            field10356++;
            if (this.field10364 != -1) {
                class439 var6 = this.field10351.field679.method1366((byte) -68, this.field10364);
                int var7 = var6.field6476 & 0xFF;
                if (var7 != 0 && var6.field6467 != 4) {
                    int var8;
                    if (arg4 < 0) {
                        var8 = 0;
                    } else if (arg4 > 127) {
                        var8 = 16777215;
                    } else {
                        var8 = arg4 * 131586;
                    }
                    if (var7 == 256) {
                        arg2 = var8;
                    } else {
                        int var10 = 256 - var7;
                        arg2 = ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                    }
                }
                int var11 = var6.field6480 & 0xFF;
                if (var11 != 0) {
                    var11 += 256;
                    int var12 = (arg2 >> 16 & 0xFF) * var11;
                    if (var12 > 65535) {
                        var12 = 65535;
                    }
                    int var13 = ((arg2 & 0xFF00) >> 8) * var11;
                    if (var13 > 65535) {
                        var13 = 65535;
                    }
                    int var14 = (arg2 & 0xFF) * var11;
                    if (var14 > 65535) {
                        var14 = 65535;
                    }
                    arg2 = ((var12 & 0xE100FF00) << 8) + (var13 & 0xFF00) + (var14 >> 8);
                }
            }
            this.field10349.method5110(arg0 * 4);
            if (arg3 != 1.0F) {
                int var15 = arg2 >> 16 & 0xFF;
                int var16 = arg2 >> 8 & 0xFF;
                int var17 = (int) ((float) var15 * arg3);
                int var18 = arg2 & 0xFF;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                int var19 = (int) ((float) var16 * arg3);
                int var20 = (int) ((float) var18 * arg3);
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
                arg2 = var17 << 16 | var19 << 8 | var20;
            }
            int var21 = 64 % ((10 - arg1) / 60);
            this.field10349.method5106((byte) (arg2 >> 16));
            this.field10349.method5106((byte) (arg2 >> 8));
            this.field10349.method5106((byte) arg2);
        } catch (RuntimeException var23) {
            throw class759.method5498(var23, field10368[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B[II)V")
    public final void method5210(byte arg0, int[] arg1, int arg2) {
        try {
            field10355++;
            if (arg0 > -7) {
                this.method5213(-66, -38);
            }
            int var4 = 0;
            class353 var5 = this.field10351.field2994;
            var5.field2201 = 0;
            if (this.field10351.field2922) {
                for (int var6 = 0; var6 < arg2; var6++) {
                    int var7 = arg1[var6];
                    int var8 = this.field10350[var7];
                    short[] var9 = this.field10361.field2328[var7];
                    if (var8 != 0 && var9 != null) {
                        int var10 = 0;
                        int var11 = 0;
                        while (var9.length > var11) {
                            if ((var8 & 0x1 << var10++) == 0) {
                                var11 += 3;
                            } else {
                                var4++;
                                var5.method1406(var9[var11++] & 0xFFFF, 380332136);
                                var5.method1406(var9[var11++] & 0xFFFF, 380332136);
                                var4++;
                                var4++;
                                var5.method1406(var9[var11++] & 0xFFFF, 380332136);
                            }
                        }
                    }
                }
            } else {
                for (int var12 = 0; var12 < arg2; var12++) {
                    int var13 = arg1[var12];
                    int var14 = this.field10350[var13];
                    short[] var15 = this.field10361.field2328[var13];
                    if (var14 != 0 && var15 != null) {
                        int var16 = 0;
                        int var17 = 0;
                        while (var17 < var15.length) {
                            if ((0x1 << var16++ & var14) == 0) {
                                var17 += 3;
                            } else {
                                var4++;
                                var5.method1465(var15[var17++] & 0xFFFF, (byte) -125);
                                var4++;
                                var5.method1465(var15[var17++] & 0xFFFF, (byte) -105);
                                var5.method1465(var15[var17++] & 0xFFFF, (byte) -101);
                                var4++;
                            }
                        }
                    }
                }
            }
            if (var4 > 0) {
                this.field10352.method452(5123, (byte) 44, var5.field2209, var5.field2201);
                this.field10351.method1724(this.field10361.field2368, this.field10361.field2356, 2916, this.field10362, this.field10361.field2363);
                this.field10351.method1701(2, (this.field10361.field2323 & 0x8) != 0, (this.field10361.field2323 & 0x7) != 0, this.field10364);
                if (this.field10351.field2896) {
                    this.field10351.method480(Integer.MAX_VALUE, this.field10357, this.field10354, this.field10353);
                }
                OpenGL.glMatrixMode(5890);
                OpenGL.glPushMatrix();
                OpenGL.glScalef(1.0F / this.field10358, 1.0F / this.field10358, 1.0F);
                OpenGL.glMatrixMode(5888);
                this.field10351.method1724(this.field10361.field2368, this.field10361.field2356, 2916, this.field10362, this.field10361.field2363);
                this.field10351.method1694(this.field10352, 4, var4, 6056, 0);
                OpenGL.glMatrixMode(5890);
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
            }
        } catch (RuntimeException var19) {
            throw class759.method5498(var19, field10368[8] + arg0 + ',' + (arg1 == null ? field10368[5] : field10368[6]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BI)V")
    public final void method5211(byte arg0, int arg1) {
        try {
            this.field10349.method5103();
            field10365++;
            if (arg0 > 47) {
                class407 var3 = this.field10351.method1715(this.field10360, arg1 * 4, false, 9, 4);
                this.field10362 = new class602(var3, 5121, 4, 0);
                this.field10349 = null;
                this.field10360 = null;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10368[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(II)V")
    public final void method5212(int arg0, int arg1) {
        try {
            this.field10360 = this.field10351.field2848.method5097(arg1 * 4, true);
            field10359++;
            if (arg0 <= 102) {
                this.method5213(36, -48);
            }
            this.field10349 = new Stream(this.field10360);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10368[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Laq;IIIII)V")
    public class716(class170 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field10361 = arg0;
            this.field10357 = arg3;
            this.field10353 = arg5;
            this.field10358 = arg2;
            this.field10351 = this.field10361.field2334;
            this.field10364 = arg1;
            this.field10354 = arg4;
            this.field10350 = new int[this.field10361.field4337 * this.field10361.field4336];
            this.field10352 = new class628(this.field10351, 5123, null, 1);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10368[4] + (arg0 == null ? field10368[5] : field10368[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V")
    public final void method5213(int arg0, int arg1) {
        try {
            field10366++;
            if (arg0 != 476834768) {
                this.method5210((byte) -96, null, -79);
            }
            this.field10349.method5110(arg1 * 4 + 3);
            this.field10349.method5106(-1);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10368[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
    public static void method5214(boolean arg0) {
        try {
            field10348 = null;
            if (!arg0) {
                method5214(false);
            }
            field10363 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10368[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5215(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5216(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 9;
                    break;
                case 2:
                    var10005 = 112;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 53;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
