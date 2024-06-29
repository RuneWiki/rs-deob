import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class107 extends class108 {

    @OriginalMember(owner = "client!ms", name = "B", descriptor = "Lnk;")
    private class376 field1396;

    @OriginalMember(owner = "client!ms", name = "D", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "F")
    public float field1386;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "Luq;")
    private class313 field1379;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "[I")
    private int[] field1392;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "Lrc;")
    private class29 field1384;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!ms", name = "C", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "Lkr;")
    public static class329 field1383;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "Lcd;")
    private class86 field1381;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1385;

    @OriginalMember(owner = "client!ms", name = "A", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field1395;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "([III)V")
    public final void method581(int[] arg0, int arg1, int arg2) {
        field1390++;
        int var4 = 0;
        class616 var5 = this.field1379.field4285;
        var5.field7707 = 0;
        if (this.field1379.field4291) {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg0[var6];
                short[] var8 = this.field1396.field5270[var7];
                int var9 = this.field1392[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method3042(var8[var11++] & 0xFFFF, 120);
                            var5.method3042(var8[var11++] & 0xFFFF, 123);
                            var4++;
                            var4++;
                            var5.method3042(var8[var11++] & 0xFFFF, 114);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg0[var12];
                int var14 = this.field1392[var13];
                short[] var15 = this.field1396.field5270[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var15.length > var17) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method3094(true, var15[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method3094(true, var15[var17++] & 0xFFFF);
                            var5.method3094(true, var15[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (arg1 >= -35) {
            this.method588(27, false);
        }
        if (var4 <= 0) {
            return;
        }
        this.field1384.method173((byte) 33, var5.field7693, 5123, var5.field7707);
        this.field1379.method1924(this.field1396.field5282, 0, this.field1396.field5281, this.field1396.field5275, this.field1381);
        this.field1379.method1922(this.field1388, (this.field1396.field5265 & 0x7) != 0, 2, (this.field1396.field5265 & 0x8) != 0);
        if (this.field1379.field4322) {
            this.field1379.method953(Integer.MAX_VALUE, this.field1398, this.field1387, this.field1378);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field1386, 1.0F / this.field1386, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field1379.method1924(this.field1396.field5282, 0, this.field1396.field5281, this.field1396.field5275, this.field1381);
        this.field1379.method1923(var4, -70, 4, this.field1384, 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static void method582(int arg0) {
        if (arg0 != 4) {
            field1389 = 59;
        }
        field1383 = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIB)V")
    public final void method583(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 106) {
            field1394++;
            this.field1392[this.field1396.field7581 * arg0 + arg1] = class292.method1790(this.field1392[this.field1396.field7581 * arg0 + arg1], 0x1 << arg2);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIBIF)V")
    public final void method584(int arg0, int arg1, byte arg2, int arg3, float arg4) {
        field1393++;
        if (this.field1388 != -1) {
            class41 var6 = this.field1379.field2114.method2151(true, this.field1388);
            int var7 = var6.field600 & 0xFF;
            if (var7 != 0 && var6.field620 != 4) {
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
                    arg3 = ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field614 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg3 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg3 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = ((var12 & 0x2700FF00) << 8) + (var13 & 0xFF00) + (var14 >> 8);
            }
        }
        if (arg4 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = (arg3 & 0xFF7E) >> 8;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg4);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg4);
            int var20 = (int) ((float) var17 * arg4);
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
            arg3 = var20 | var18 << 16 | var19 << 8;
        }
        this.field1385.method3204(arg0 * 4);
        this.field1385.method3205((byte) (arg3 >> 16));
        if (arg2 == 30) {
            this.field1385.method3205((byte) (arg3 >> 8));
            this.field1385.method3205((byte) arg3);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
    public final void method585(int arg0, int arg1) {
        if (arg1 != 255) {
            this.field1392 = null;
        }
        field1391++;
        this.field1395 = this.field1379.field4202.method3194(arg0 * 4, true);
        this.field1385 = new Stream(this.field1395);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method586(int arg0, boolean arg1, int arg2) {
        field1382++;
        if (arg1 && arg2 >= 0) {
            if (arg0 != -1) {
                field1383 = null;
            }
            return class585.method3372(arg1, (byte) -126, arg2, 10);
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(II)V")
    public final void method587(int arg0, int arg1) {
        if (arg1 == 0) {
            field1380++;
            this.field1385.method3204(arg0 * 4 + 3);
            this.field1385.method3205(-1);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZ)V")
    public final void method588(int arg0, boolean arg1) {
        this.field1385.method3207();
        field1397++;
        class159 var3 = this.field1379.method1958(arg0 * 4, arg1, 4, this.field1395, (byte) -126);
        this.field1381 = new class86(var3, 5121, 4, 0);
        this.field1385 = null;
        this.field1395 = null;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lnk;IIIII)V")
    public class107(class376 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1396 = arg0;
        this.field1398 = arg3;
        this.field1386 = arg2;
        this.field1379 = this.field1396.field5250;
        this.field1378 = arg5;
        this.field1392 = new int[this.field1396.field7585 * this.field1396.field7581];
        this.field1387 = arg4;
        this.field1388 = arg1;
        this.field1384 = new class29(this.field1379, 5123, null, 1);
    }
}
