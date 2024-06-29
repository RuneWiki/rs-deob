import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class666 extends class379 {

    @OriginalMember(owner = "client!wda", name = "q", descriptor = "Lcea;")
    private class227 field9145;

    @OriginalMember(owner = "client!wda", name = "v", descriptor = "I")
    public int field9150;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "I")
    public int field9137;

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "F")
    public float field9141;

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "Lpc;")
    private class700 field9140;

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "[I")
    private int[] field9142;

    @OriginalMember(owner = "client!wda", name = "t", descriptor = "I")
    public int field9148;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
    public int field9138;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "Lvb;")
    private class209 field9139;

    @OriginalMember(owner = "client!wda", name = "u", descriptor = "[Ljava/awt/Color;")
    public static Color[] field9149 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!wda", name = "C", descriptor = "I")
    public static int field9157 = 0;

    @OriginalMember(owner = "client!wda", name = "D", descriptor = "I")
    public static int field9158 = 0;

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!wda", name = "r", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!wda", name = "s", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!wda", name = "w", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!wda", name = "y", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!wda", name = "z", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!wda", name = "A", descriptor = "I")
    public static int field9155;

    @OriginalMember(owner = "client!wda", name = "B", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "Lsf;")
    private class550 field9144;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9136;

    @OriginalMember(owner = "client!wda", name = "x", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field9152;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IB)V")
    public final void method3735(int arg0, byte arg1) {
        field9156++;
        this.field9136.method3992();
        if (arg1 < 13) {
            this.field9137 = -14;
        }
        class339 var3 = this.field9140.method3926((byte) -57, this.field9152, 4, false, arg0 * 4);
        this.field9144 = new class550(var3, 5121, 4, 0);
        this.field9152 = null;
        this.field9136 = null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BIIIF)V")
    public final void method3736(byte arg0, int arg1, int arg2, int arg3, float arg4) {
        field9151++;
        if (this.field9150 != -1) {
            class359 var6 = this.field9140.field890.method1138(this.field9150, 104);
            int var7 = var6.field4462 & 0xFF;
            if (var7 != 0 && var6.field4459 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field4458 & 0xFF;
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
                arg2 = (var14 >> 8) + ((var12 << 8 & 0xFF00D2) + (var13 & 0xFF00));
            }
        }
        this.field9136.method3982(arg3 * 4);
        if (arg4 != 1.0F) {
            int var15 = (arg2 & 0xFFA101) >> 16;
            int var16 = arg2 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg4);
            int var18 = arg2 & 0xFF;
            int var19 = (int) ((float) var16 * arg4);
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
            int var20 = (int) ((float) var18 * arg4);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg2 = var20 | var17 << 16 | var19 << 8;
        }
        this.field9136.method3978((byte) (arg2 >> 16));
        this.field9136.method3978((byte) (arg2 >> 8));
        if (arg0 != -127) {
            this.method3736((byte) -2, -35, 92, -14, 0.23532382F);
        }
        this.field9136.method3978((byte) arg2);
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(Z)V")
    public static void method3737(boolean arg0) {
        field9149 = null;
        if (!arg0) {
            method3737(false);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IB[I)V")
    public final void method3738(int arg0, byte arg1, int[] arg2) {
        if (arg1 != 18) {
            this.field9140 = null;
        }
        field9153++;
        int var4 = 0;
        class283 var5 = this.field9140.field9779;
        var5.field5262 = 0;
        if (this.field9140.field9772) {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg2[var6];
                short[] var8 = this.field9145.field2643[var7];
                int var9 = this.field9142[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var8.length) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var5.method2369(arg1 ^ 0xFFFFB944, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method2369(-18090, var8[var11++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method2369(-18090, var8[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg2[var12];
                short[] var14 = this.field9145.field2643[var13];
                int var15 = this.field9142[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method2379(var14[var17++] & 0xFFFF, -12098);
                            var4++;
                            var5.method2379(var14[var17++] & 0xFFFF, -12098);
                            var4++;
                            var5.method2379(var14[var17++] & 0xFFFF, -12098);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field9139.method1319(var5.field5262, 5123, -21246, var5.field5275);
        this.field9140.method3935(this.field9145.field2678, this.field9145.field2687, this.field9144, this.field9145.field2690, arg1 + 2389);
        this.field9140.method3905(this.field9150, (this.field9145.field2664 & 0x8) != 0, -80, ~(this.field9145.field2664 & 0x7) != -1);
        if (this.field9140.field9851) {
            this.field9140.method555(Integer.MAX_VALUE, this.field9148, this.field9138, this.field9137);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field9141, 1.0F / this.field9141, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field9140.method3935(this.field9145.field2678, this.field9145.field2687, this.field9144, this.field9145.field2690, arg1 ^ 0x975);
        this.field9140.method3944(4, 0, (byte) 78, var4, this.field9139);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(II)V")
    public final void method3739(int arg0, int arg1) {
        field9155++;
        this.field9136.method3982(arg0 * 4 + 3);
        this.field9136.method3978(-1);
        if (arg1 != 0) {
            field9158 = -121;
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(II)V")
    public final void method3740(int arg0, int arg1) {
        this.field9152 = this.field9140.field9725.method3977(arg1 * 4, true);
        field9147++;
        this.field9136 = new Stream(this.field9152);
        if (arg0 != -3791) {
            this.field9150 = 102;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIII)V")
    public final void method3741(int arg0, int arg1, int arg2, int arg3) {
        this.field9142[this.field9145.field3533 * arg1 + arg3] = class5.method105(this.field9142[this.field9145.field3533 * arg1 + arg3], 0x1 << arg0);
        field9146++;
        if (arg2 != 256) {
            this.method3738(3, (byte) 72, null);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IBI)V")
    public static final void method3742(int arg0, byte arg1, int arg2) {
        if (arg1 <= 121) {
            method3743((byte) -97);
        }
        field9143++;
        class659.field9060++;
        class336 var3 = class512.method3076(class365.field4538, class591.field8030, (byte) 121);
        var3.field4150.method2394(arg2, (byte) -125);
        var3.field4150.method2380((byte) -9, arg0);
        class578.method3334(4, var3);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)[Lbja;")
    public static final class34[] method3743(byte arg0) {
        field9154++;
        if (arg0 < 120) {
            field9149 = null;
        }
        return new class34[] { class180.field2205, class260.field3089, class72.field993, class95.field1241, class108.field1356, class363.field4525, class5.field62, class85.field1140, class192.field2293, class61.field820, class356.field4419, class73.field1011, class784.field10817, class257.field3046 };
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lcea;IIIII)V")
    public class666(class227 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9145 = arg0;
        this.field9150 = arg1;
        this.field9137 = arg5;
        this.field9141 = arg2;
        this.field9140 = this.field9145.field2667;
        this.field9142 = new int[this.field9145.field3533 * this.field9145.field3524];
        this.field9148 = arg3;
        this.field9138 = arg4;
        this.field9139 = new class209(this.field9140, 5123, null, 1);
    }
}
