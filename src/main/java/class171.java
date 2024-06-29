import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class171 extends class154 {

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Lvca;")
    private class297 field2718;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public int field2720;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "[I")
    private int[] field2722;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "F")
    public float field2719;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "Lhk;")
    private class111 field2738;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public int field2721;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public int field2730;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "Lrs;")
    private class679 field2727;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field2726 = 0;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "Lnba;")
    private class316 field2728;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2729;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2737;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V", line = 6)
    public final void method1305(boolean arg0, int arg1) {
        this.field2729.method3901();
        field2723++;
        class212 var3 = this.field2738.method1011(arg1 * 4, this.field2737, -15854, false, 4);
        this.field2728 = new class316(var3, 5121, 4, 0);
        this.field2729 = null;
        this.field2737 = null;
        if (!arg0) {
            this.method1306(0.13614374F, (byte) 121, -58, 75, 61);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(FBIII)V", line = 22)
    public final void method1306(float arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (this.field2721 != -1) {
            class311 var6 = this.field2738.field970.method1270(this.field2721, true);
            int var7 = var6.field4241 & 0xFF;
            if (var7 != 0 && var6.field4250 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg2 * 131586;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field4236 & 0xFF;
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
                arg4 = (var13 & 0xFF00) + ((var12 & 0x300FF00) << 8) + (var14 >> 8);
            }
        }
        field2724++;
        if (arg0 != 1.0F) {
            int var15 = (arg4 & 0xFF3E49) >> 16;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg0);
            int var18 = arg4 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg0);
            int var20 = (int) ((float) var18 * arg0);
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
            arg4 = var20 | var17 << 16 | var19 << 8;
        }
        if (arg1 != 114) {
            this.method1306(-0.16807301F, (byte) -37, -11, -33, -86);
        }
        this.field2729.method3904(arg3 * 4);
        this.field2729.method3908((byte) (arg4 >> 16));
        this.field2729.method3908((byte) (arg4 >> 8));
        this.field2729.method3908((byte) arg4);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)V", line = 135)
    public final void method1307(int arg0, byte arg1) {
        field2732++;
        this.field2729.method3904(arg0 * 4 + 3);
        this.field2729.method3908(arg1);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V", line = 152)
    public final void method1308(int arg0, int arg1) {
        this.field2737 = this.field2738.field1935.method3898(arg0 * 4, true);
        field2731++;
        if (arg1 != 65535) {
            this.field2721 = 13;
        }
        this.field2729 = new Stream(this.field2737);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI[I)V", line = 168)
    public final void method1309(boolean arg0, int arg1, int[] arg2) {
        if (arg0) {
            this.field2720 = 57;
        }
        field2725++;
        int var4 = 0;
        class335 var5 = this.field2738.field2042;
        var5.field1442 = 0;
        if (this.field2738.field2000) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg2[var6];
                short[] var8 = this.field2718.field4055[var7];
                int var9 = this.field2722[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method781(52, var8[var11++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method781(49, var8[var11++] & 0xFFFF);
                            var5.method781(121, var8[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg2[var12];
                short[] var14 = this.field2718.field4055[var13];
                int var15 = this.field2722[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var14.length) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method748(255, var14[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method748(255, var14[var17++] & 0xFFFF);
                            var4++;
                            var5.method748(255, var14[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field2727.method175(arg0, var5.field1413, var5.field1442, 5123);
        this.field2738.method948(this.field2718.field4085, 8448, this.field2718.field4080, this.field2718.field4090, this.field2728);
        this.field2738.method965((this.field2718.field4046 & 0x7) != 0, (byte) 121, this.field2721, (this.field2718.field4046 & 0x8) != 0);
        if (this.field2738.field2075) {
            this.field2738.method569(Integer.MAX_VALUE, this.field2734, this.field2730, this.field2720);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field2719, 1.0F / this.field2719, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field2738.method948(this.field2718.field4085, 8448, this.field2718.field4080, this.field2718.field4090, this.field2728);
        this.field2738.method951(393, 0, this.field2727, var4, 4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIII)V", line = 291)
    public final void method1310(int arg0, int arg1, int arg2, int arg3) {
        field2736++;
        this.field2722[this.field2718.field4037 * arg1 + arg0] = class530.method3011(this.field2722[this.field2718.field4037 * arg1 + arg0], arg3 << arg2);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lvca;IIIII)V", line = 308)
    public class171(class297 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2718 = arg0;
        this.field2720 = arg5;
        this.field2722 = new int[this.field2718.field4037 * this.field2718.field4034];
        this.field2719 = arg2;
        this.field2738 = this.field2718.field4069;
        this.field2721 = arg1;
        this.field2730 = arg4;
        this.field2734 = arg3;
        this.field2727 = new class679(this.field2738, 5123, null, 1);
    }
}
