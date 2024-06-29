import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class151 extends class65 {

    @OriginalMember(owner = "client!nea", name = "p", descriptor = "Lru;")
    private class680 field2358;

    @OriginalMember(owner = "client!nea", name = "y", descriptor = "[I")
    private int[] field2367;

    @OriginalMember(owner = "client!nea", name = "C", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!nea", name = "t", descriptor = "Lrs;")
    private class166 field2362;

    @OriginalMember(owner = "client!nea", name = "v", descriptor = "F")
    public float field2364;

    @OriginalMember(owner = "client!nea", name = "u", descriptor = "I")
    public int field2363;

    @OriginalMember(owner = "client!nea", name = "l", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!nea", name = "w", descriptor = "I")
    public int field2365;

    @OriginalMember(owner = "client!nea", name = "m", descriptor = "Lmn;")
    private class510 field2355;

    @OriginalMember(owner = "client!nea", name = "r", descriptor = "Lcb;")
    public static class631 field2360 = new class631(62, -1);

    @OriginalMember(owner = "client!nea", name = "k", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!nea", name = "n", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!nea", name = "o", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!nea", name = "s", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!nea", name = "A", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!nea", name = "B", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!nea", name = "D", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!nea", name = "q", descriptor = "Lak;")
    private class497 field2359;

    @OriginalMember(owner = "client!nea", name = "x", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2366;

    @OriginalMember(owner = "client!nea", name = "z", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2368;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BIII)V")
    public final void method1147(byte arg0, int arg1, int arg2, int arg3) {
        this.field2367[this.field2358.field4956 * arg3 + arg2] = class112.method903(this.field2367[this.field2358.field4956 * arg3 + arg2], 0x1 << arg1);
        if (arg0 >= 67) {
            field2372++;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)V")
    public static void method1148(byte arg0) {
        field2360 = null;
        if (arg0 >= -32) {
            method1148((byte) 87);
        }
    }

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "(II)V")
    public final void method1149(int arg0, int arg1) {
        this.field2368 = this.field2362.field2754.method2591(arg0 * arg1, true);
        field2357++;
        this.field2366 = new Stream(this.field2368);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BI)V")
    public final void method1150(byte arg0, int arg1) {
        field2361++;
        if (arg0 < -113) {
            this.field2366.method2581(arg1 * 4 + 3);
            this.field2366.method2574(-1);
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IB)V")
    public final void method1151(int arg0, byte arg1) {
        field2356++;
        if (arg1 != -100) {
            this.field2371 = -97;
        }
        this.field2366.method2573();
        class170 var3 = this.field2362.method1336(4, arg0 * 4, -11, this.field2368, false);
        this.field2359 = new class497(var3, 5121, 4, 0);
        this.field2366 = null;
        this.field2368 = null;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IFIII)V")
    public final void method1152(int arg0, float arg1, int arg2, int arg3, int arg4) {
        if (this.field2365 != -1) {
            class569 var6 = this.field2362.field7764.method1774(64, this.field2365);
            int var7 = var6.field8069 & 0xFF;
            if (var7 != 0 && var6.field8079 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 <= 127) {
                    var8 = arg3 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field8077 & 0xFF;
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
                arg4 = (var12 << 8 & 0xFF00BD) - (-(var13 & 0xFF00) - (var14 >> 8));
            }
        }
        field2370++;
        if (arg1 != 1.0F) {
            int var15 = (arg4 & 0xFFF2FF) >> 16;
            int var16 = (arg4 & 0xFF50) >> 8;
            int var17 = arg4 & 0xFF;
            int var18 = (int) ((float) var15 * arg1);
            int var19 = (int) ((float) var16 * arg1);
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
            int var20 = (int) ((float) var17 * arg1);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var19 << 8 | var18 << 16 | var20;
        }
        this.field2366.method2581(arg2 * 4);
        if (arg0 <= 52) {
            this.field2363 = -66;
        }
        this.field2366.method2574((byte) (arg4 >> 16));
        this.field2366.method2574((byte) (arg4 >> 8));
        this.field2366.method2574((byte) arg4);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I[II)V")
    public final void method1153(int arg0, int[] arg1, int arg2) {
        field2353++;
        int var4 = arg0;
        class547 var5 = this.field2362.field2870;
        var5.field4534 = 0;
        if (this.field2362.field2796) {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg1[var6];
                int var8 = this.field2367[var7];
                short[] var9 = this.field2358.field9616[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method1939(var9[var11++] & 0xFFFF, 1134947720);
                            var4++;
                            var4++;
                            var5.method1939(var9[var11++] & 0xFFFF, 1134947720);
                            var5.method1939(var9[var11++] & 0xFFFF, 1134947720);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1[var12];
                int var14 = this.field2367[var13];
                short[] var15 = this.field2358.field9616[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var15.length > var17) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method1969(var15[var17++] & 0xFFFF, (byte) -100);
                            var4++;
                            var5.method1969(var15[var17++] & 0xFFFF, (byte) -100);
                            var4++;
                            var5.method1969(var15[var17++] & 0xFFFF, (byte) -100);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field2355.method1409(var5.field4543, var5.field4534, 5123, true);
        this.field2362.method1329(this.field2358.field9621, this.field2359, this.field2358.field9627, this.field2358.field9624, -128);
        this.field2362.method1337(-118, (this.field2358.field9589 & 0x8) != 0, (this.field2358.field9589 & 0x7) != 0, this.field2365);
        if (this.field2362.field2876) {
            this.field2362.method355(Integer.MAX_VALUE, this.field2354, this.field2363, this.field2371);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field2364, 1.0F / this.field2364, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field2362.method1329(this.field2358.field9621, this.field2359, this.field2358.field9627, this.field2358.field9624, arg0 - 103);
        this.field2362.method1315(0, true, 4, var4, this.field2355);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lru;IIIII)V")
    public class151(class680 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2358 = arg0;
        this.field2367 = new int[this.field2358.field4960 * this.field2358.field4956];
        this.field2371 = arg5;
        this.field2362 = this.field2358.field9575;
        this.field2364 = arg2;
        this.field2363 = arg4;
        this.field2354 = arg3;
        this.field2365 = arg1;
        this.field2355 = new class510(this.field2362, 5123, null, 1);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)I")
    public static final int method1154(int arg0, int arg1, int arg2) {
        field2369++;
        if (arg1 != -311570175) {
            return -122;
        }
        int var3 = 0;
        while (arg0 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
            arg0--;
        }
        return var3;
    }
}
