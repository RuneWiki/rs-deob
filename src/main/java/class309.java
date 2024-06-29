import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class309 extends class333 {

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "Lmea;")
    private class72 field3818;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public int field3822;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "[I")
    private int[] field3813;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "F")
    public float field3821;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public int field3802;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public int field3808;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public int field3826;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Lvj;")
    private class422 field3814;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "Lgj;")
    private class97 field3809;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "[I")
    public static int[] field3823 = new int[2];

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "Lsb;")
    public static class305 field3816 = new class305(75, 16);

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field3825 = 0;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "Lcq;")
    public static class110 field3827 = new class110(101, 5);

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "[[I")
    public static int[][] field3829 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "Lsb;")
    public static class305 field3828 = new class305(17, 15);

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Lhea;")
    private class351 field3806;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3803;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3804;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "[Lf;")
    public static class534[] field3824;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method1770(int arg0) {
        field3829 = null;
        if (arg0 != 21138) {
            field3830 = -113;
        }
        field3824 = null;
        field3827 = null;
        field3823 = null;
        field3828 = null;
        field3816 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1771(int arg0, String arg1, int arg2) {
        field3817++;
        if (arg2 == 0) {
            class701.field9813 = class564.method3199(0, class639.field9075.field6769 * 2, class79.field801, class41.field407, -39, class560.field7998);
            if (arg1 != null) {
                class701.field9813.method1002(0);
                class463 var10 = class306.method1764(class573.field8139, 0, class36.field372, -116);
                class413 var11 = class701.field9813.method998(var10, class550.method3117(class408.field5441, class36.field372, 0), true);
                class80.method421(0);
                class695.method3824(arg1, class701.field9813, var11, false, var10, true);
            }
        } else {
            class564 var3 = null;
            if (arg1 != null) {
                var3 = class564.method3199(0, 0, class79.field801, class41.field407, 124, class560.field7998);
                var3.method1002(0);
                class463 var4 = class306.method1764(class573.field8139, 0, class36.field372, -101);
                class413 var5 = var3.method998(var4, class550.method3117(class408.field5441, class36.field372, 0), true);
                class80.method421(arg0 ^ 0x4546);
                class695.method3824(arg1, var3, var5, false, var4, true);
            }
            try {
                class701.field9813 = class564.method3199(arg2, class639.field9075.field6769 * 2, class79.field801, class41.field407, -51, class560.field7998);
                if (arg1 != null) {
                    var3.method1002(0);
                    class463 var6 = class306.method1764(class573.field8139, 0, class36.field372, arg0 - 17835);
                    class413 var7 = var3.method998(var6, class550.method3117(class408.field5441, class36.field372, 0), true);
                    class80.method421(0);
                    class695.method3824(arg1, var3, var7, false, var6, true);
                }
                if (class701.field9813.method1038()) {
                    boolean var8 = true;
                    try {
                        var8 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var13) {
                    }
                    class385 var9;
                    if (var8) {
                        var9 = class701.field9813.method1012(146800640);
                    } else {
                        var9 = class701.field9813.method1012(104857600);
                    }
                    class701.field9813.method1043(var9);
                }
            } catch (Throwable var14) {
                class701.field9813 = class564.method3199(0, 0, class79.field801, class41.field407, -96, class560.field7998);
                arg2 = 0;
            }
            if (var3 != null) {
                try {
                    var3.method3203(5);
                } catch (Throwable var12) {
                }
            }
        }
        class430.field6109 = arg2;
        class39.method202(-114238164);
        class701.field9813.method1027(32);
        class499.field7213 = class701.field9813.method1035();
        class143.field1593 = class701.field9813.method1035();
        class554.method3144((byte) -118);
        class701.field9813.method1015(!class639.field9075.field6775);
        if (class701.field9813.method994()) {
            class700.method3848(class639.field9075.field6771, 95);
        }
        class498.method2874(3, class140.field1550 >> 3, class142.field1574 >> 3, class701.field9813);
        class173.method1055(1678);
        class298.field3721 = true;
        class359.field4820 = null;
        if (arg0 != 17734) {
            method1771(-116, null, 57);
        }
        class389.field5269 = false;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)I")
    public static final int method1772(int arg0) {
        field3805++;
        class19 var1 = class139.field1538;
        synchronized (class139.field1538) {
            return arg0 == 255 ? class139.field1538.method89(-64) : 22;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IFIII)V")
    public final void method1773(int arg0, float arg1, int arg2, int arg3, int arg4) {
        if (this.field3822 != -1) {
            class295 var6 = this.field3814.field8050.method140(this.field3822, 862);
            int var7 = var6.field3671 & 0xFF;
            if (var7 != 0 && var6.field3669 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg3 * 131586;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field3667 & 0xFF;
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
                arg2 = (var14 >> 8) + (var12 << 8 & 0xFF0057) + (var13 & 0xFF00);
            }
        }
        field3820++;
        if (arg1 != 1.0F) {
            int var15 = (arg2 & 0xFFBCF0) >> 16;
            int var16 = (arg2 & 0xFF03) >> 8;
            int var17 = arg2 & 0xFF;
            int var18 = (int) ((float) var15 * arg1);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg1);
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
            arg2 = var20 | var18 << 16 | var19 << 8;
        }
        this.field3803.method3479(arg4 * 4);
        if (arg0 >= 12) {
            this.field3803.method3471((byte) (arg2 >> 16));
            this.field3803.method3471((byte) (arg2 >> 8));
            this.field3803.method3471((byte) arg2);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILr;)V")
    public static final void method1774(int arg0, class564 arg1) {
        if (arg0 != 3) {
            return;
        }
        if (class213.field2597) {
            class469.method2707(arg1, 0);
        } else {
            class603.method3371(arg1, 25657);
        }
        field3819++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIBI)V")
    public final void method1775(int arg0, int arg1, byte arg2, int arg3) {
        this.field3813[this.field3818.field3428 * arg0 + arg1] = class422.method2436(this.field3813[this.field3818.field3428 * arg0 + arg1], 0x1 << arg3);
        if (arg2 == 124) {
            field3812++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
    public final void method1776(int arg0, int arg1) {
        field3800++;
        this.field3803.method3472();
        class199 var3 = this.field3814.method2406((byte) -4, arg0 * 4, this.field3804, false, 4);
        this.field3806 = new class351(var3, 5121, 4, 0);
        this.field3803 = null;
        if (arg1 != 65535) {
            this.field3814 = null;
        }
        this.field3804 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB[I)V")
    public final void method1777(int arg0, byte arg1, int[] arg2) {
        field3811++;
        int var4 = 0;
        class209 var5 = this.field3814.field5965;
        int var6 = -104 / ((79 - arg1) / 37);
        var5.field1218 = 0;
        if (this.field3814.field5874) {
            for (int var7 = 0; var7 < arg0; var7++) {
                int var8 = arg2[var7];
                short[] var9 = this.field3818.field707[var8];
                int var10 = this.field3813[var8];
                if (var10 != 0 && var9 != null) {
                    int var11 = 0;
                    int var12 = 0;
                    while (var12 < var9.length) {
                        if ((var10 & 0x1 << var11++) == 0) {
                            var12 += 3;
                        } else {
                            var4++;
                            var5.method645(-672168216, var9[var12++] & 0xFFFF);
                            var5.method645(-672168216, var9[var12++] & 0xFFFF);
                            var4++;
                            var5.method645(-672168216, var9[var12++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < arg0; var13++) {
                int var14 = arg2[var13];
                short[] var15 = this.field3818.field707[var14];
                int var16 = this.field3813[var14];
                if (var16 != 0 && var15 != null) {
                    int var17 = 0;
                    int var18 = 0;
                    while (var15.length > var18) {
                        if ((0x1 << var17++ & var16) == 0) {
                            var18 += 3;
                        } else {
                            var4++;
                            var5.method667(13224, var15[var18++] & 0xFFFF);
                            var5.method667(13224, var15[var18++] & 0xFFFF);
                            var4++;
                            var5.method667(13224, var15[var18++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field3809.method97(var5.field1269, var5.field1218, 5123, 101);
        this.field3814.method2419(this.field3818.field749, 121, this.field3806, this.field3818.field741, this.field3818.field753);
        this.field3814.method2374((this.field3818.field706 & 0x8) != 0, (this.field3818.field706 & 0x7) != 0, this.field3822, 0);
        if (this.field3814.field5869) {
            this.field3814.method1031(Integer.MAX_VALUE, this.field3802, this.field3808, this.field3826);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field3821, 1.0F / this.field3821, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field3814.method2419(this.field3818.field749, 125, this.field3806, this.field3818.field741, this.field3818.field753);
        this.field3814.method2403(this.field3809, 0, var4, 4, 111);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)V")
    public final void method1778(int arg0, int arg1) {
        this.field3804 = this.field3814.field5820.method3462(arg1 * 4, true);
        field3807++;
        int var3 = -87 % ((arg0 + 79) / 46);
        this.field3803 = new Stream(this.field3804);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lnp;I)Ldd;")
    public static final class176 method1779(class115 arg0, int arg1) {
        field3810++;
        class240 var2 = class579.method3275(0)[arg0.method620((byte) 61)];
        class648 var3 = class564.method3198(25624)[arg0.method620((byte) -32)];
        int var4 = arg0.method676(-5);
        int var5 = arg0.method676(-5);
        int var6 = arg0.method643((byte) -77);
        if (arg1 > -63) {
            method1772(-77);
        }
        int var7 = arg0.method643((byte) -77);
        int var8 = arg0.method676(-5);
        int var9 = arg0.method631(false);
        int var10 = arg0.method631(false);
        return new class176(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)V")
    public final void method1780(int arg0, byte arg1) {
        field3815++;
        if (arg1 == -5) {
            this.field3803.method3479(arg0 * 4 + 3);
            this.field3803.method3471(-1);
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lmea;IIIII)V")
    public class309(class72 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3818 = arg0;
        this.field3822 = arg1;
        this.field3813 = new int[this.field3818.field3428 * this.field3818.field3426];
        this.field3821 = arg2;
        this.field3802 = arg3;
        this.field3808 = arg4;
        this.field3826 = arg5;
        this.field3814 = this.field3818.field721;
        this.field3809 = new class97(this.field3814, 5123, null, 1);
    }
}
