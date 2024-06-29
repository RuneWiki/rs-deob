import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class213 extends class513 {

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "Ldn;")
    private class375 field3010;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "F")
    public float field2993;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public int field2992;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "Lep;")
    private class371 field2999;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "[I")
    private int[] field3001;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "Liia;")
    private class319 field3016;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field2998 = 0;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field3003 = 0;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public static int field3004 = 0;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field3006 = 1403;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "Lcd;")
    public static class22 field3015;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "Leca;")
    private class329 field3007;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3011;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3014;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
    public final void method1403(int arg0, int arg1) {
        field3008++;
        this.field3011.method2551();
        if (arg0 == -12629) {
            class227 var3 = this.field2999.method2077(false, -95, this.field3014, arg1 * 4, 4);
            this.field3007 = new class329(var3, 5121, 4, 0);
            this.field3011 = null;
            this.field3014 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)V")
    public final void method1404(int arg0, int arg1) {
        field3005++;
        this.field3014 = this.field2999.field4949.method2558(arg0 * 4, true);
        if (arg1 != -19472) {
            this.field2992 = -13;
        }
        this.field3011 = new Stream(this.field3014);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZIIFI)V")
    public final void method1405(boolean arg0, int arg1, int arg2, float arg3, int arg4) {
        field3012++;
        if (this.field2992 != -1) {
            class468 var6 = this.field2999.field7694.method91(this.field2992, -22805);
            int var7 = var6.field6381 & 0xFF;
            if (var7 != 0 && var6.field6386 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 <= 127) {
                    var8 = arg2 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((var8 & 0xFF00FF) * var7 + ((arg1 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field6399 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg1 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg1 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = (var13 & 0xFF00) + ((var12 << 8 & 0xFF00FE) + (var14 >> 8));
            }
        }
        if (!arg0) {
            this.field3014 = null;
        }
        this.field3011.method2555(arg4 * 4);
        if (arg3 != 1.0F) {
            int var15 = (arg1 & 0xFFB87B) >> 16;
            int var16 = (arg1 & 0xFFAD) >> 8;
            int var17 = (int) ((float) var15 * arg3);
            int var18 = arg1 & 0xFF;
            int var19 = (int) ((float) var16 * arg3);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg3);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg1 = var17 << 16 | var19 << 8 | var20;
        }
        this.field3011.method2542((byte) (arg1 >> 16));
        this.field3011.method2542((byte) (arg1 >> 8));
        this.field3011.method2542((byte) arg1);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;BIZI)V")
    public static final void method1406(String arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        if (arg1 < 25) {
            field3003 = -2;
        }
        class495.method2961(arg0, 65, arg2, false, arg4, arg3, null);
        field2997++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/String;Lep;I)Lsea;")
    public static final class282 method1407(int arg0, String arg1, class371 arg2, int arg3) {
        field2996++;
        if (arg3 <= 13) {
            method1406(null, (byte) -1, -59, false, -93);
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class487.field6570, 0);
        if (class487.field6570[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class282(arg2, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([III)V")
    public final void method1408(int[] arg0, int arg1, int arg2) {
        field3000++;
        if (arg2 > -1) {
            return;
        }
        int var4 = 0;
        class128 var5 = this.field2999.field5033;
        var5.field330 = 0;
        if (this.field2999.field4992) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg0[var6];
                short[] var8 = this.field3010.field5179[var7];
                int var9 = this.field3001[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method147((byte) 53, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method147((byte) 53, var8[var11++] & 0xFFFF);
                            var5.method147((byte) 53, var8[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg0[var12];
                int var14 = this.field3001[var13];
                short[] var15 = this.field3010.field5179[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var15.length > var17) {
                        if ((0x1 << var16++ & var14) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method139(var15[var17++] & 0xFFFF, -113);
                            var5.method139(var15[var17++] & 0xFFFF, 123);
                            var4++;
                            var5.method139(var15[var17++] & 0xFFFF, -118);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field3016.method1857(var5.field279, -13491, var5.field330, 5123);
        this.field2999.method2172(this.field3007, 32886, this.field3010.field5217, this.field3010.field5214, this.field3010.field5221);
        this.field2999.method2199(-26468, this.field2992, (this.field3010.field5197 & 0x8) != 0, (this.field3010.field5197 & 0x7) != 0);
        if (this.field2999.field5083) {
            this.field2999.method2186(Integer.MAX_VALUE, this.field2994, this.field2995, this.field3009);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field2993, 1.0F / this.field2993, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field2999.method2172(this.field3007, 32886, this.field3010.field5217, this.field3010.field5214, this.field3010.field5221);
        this.field2999.method2229(4, 32, var4, 0, this.field3016);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method1409(int arg0) {
        if (arg0 != 34379) {
            method1407(77, null, null, -94);
        }
        field3015 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)V")
    public final void method1410(boolean arg0, int arg1) {
        this.field3011.method2555(arg1 * 4 + 3);
        field3013++;
        this.field3011.method2542(-1);
        if (!arg0) {
            this.method1405(true, -85, 4, -0.5388598F, -78);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIB)V")
    public final void method1411(int arg0, int arg1, int arg2, byte arg3) {
        this.field3001[this.field3010.field4344 * arg1 + arg2] = class747.method4153(this.field3001[this.field3010.field4344 * arg1 + arg2], 0x1 << arg0);
        field3002++;
        if (arg3 < 92) {
            this.field3007 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Ldn;IIIII)V")
    public class213(class375 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3010 = arg0;
        this.field2993 = arg2;
        this.field2992 = arg1;
        this.field2994 = arg3;
        this.field3009 = arg5;
        this.field2995 = arg4;
        this.field2999 = this.field3010.field5193;
        this.field3001 = new int[this.field3010.field4348 * this.field3010.field4344];
        this.field3016 = new class319(this.field2999, 5123, null, 1);
    }
}
