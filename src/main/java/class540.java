import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class540 extends class66 {

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Ltv;")
    private class521 field7871;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public int field7876;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "Ler;")
    private class92 field7886;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "F")
    public float field7875;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public int field7880;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public int field7883;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "[I")
    private int[] field7884;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public int field7878;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "Llda;")
    private class450 field7874;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "Lrl;")
    public static class672 field7882 = new class672(55, 4);

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field7888;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "Lmk;")
    private class51 field7877;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7890;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field7885;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)V")
    public final void method3272(byte arg0, int arg1) {
        this.field7890.method3626();
        if (arg0 != -7) {
            return;
        }
        field7873++;
        class36 var3 = this.field7886.method896(this.field7885, arg0 ^ 0xFFFFFCF9, 4, arg1 * 4, false);
        this.field7877 = new class51(var3, 5121, 4, 0);
        this.field7885 = null;
        this.field7890 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IFIIB)V")
    public final void method3273(int arg0, float arg1, int arg2, int arg3, byte arg4) {
        if (this.field7876 != -1) {
            class258 var6 = this.field7886.field2812.method1610(18904, this.field7876);
            int var7 = var6.field4131 & 0xFF;
            if (var7 != 0 && var6.field4134 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 <= 127) {
                    var8 = arg3 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field4126 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg2 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg2 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg2 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg2 = (var14 >> 8) + (((var12 & 0xA100FF00) << 8) + (var13 & 0xFF00));
            }
        }
        field7887++;
        if (arg1 != 1.0F) {
            int var15 = arg2 >> 16 & 0xFF;
            int var16 = (arg2 & 0xFF0E) >> 8;
            int var17 = (int) ((float) var15 * arg1);
            int var18 = arg2 & 0xFF;
            int var19 = (int) ((float) var16 * arg1);
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
            int var20 = (int) ((float) var18 * arg1);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg2 = var17 << 16 | var19 << 8 | var20;
        }
        this.field7890.method3618(arg0 * 4);
        this.field7890.method3631((byte) (arg2 >> 16));
        if (arg4 < 72) {
            method3279(-101);
        }
        this.field7890.method3631((byte) (arg2 >> 8));
        this.field7890.method3631((byte) arg2);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIBI)V")
    public final void method3274(int arg0, int arg1, byte arg2, int arg3) {
        this.field7884[this.field7871.field510 * arg3 + arg1] = class81.method769(this.field7884[this.field7871.field510 * arg3 + arg1], 0x1 << arg0);
        if (arg2 != -59) {
            this.method3276(null, 76, 62);
        }
        field7881++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
    public final void method3275(int arg0, int arg1) {
        this.field7885 = this.field7886.field1325.method3617(arg0 * 4, true);
        field7888++;
        this.field7890 = new Stream(this.field7885);
        if (arg1 != 255) {
            this.field7880 = 80;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([III)V")
    public final void method3276(int[] arg0, int arg1, int arg2) {
        field7889++;
        int var4 = 0;
        class148 var5 = this.field7886.field1468;
        var5.field57 = 0;
        if (this.field7886.field1410) {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg0[var12];
                short[] var14 = this.field7871.field7541[var13];
                int var15 = this.field7884[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((0x1 << var16++ & var15) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method25(true, var14[var17++] & 0xFFFF);
                            var4++;
                            var5.method25(true, var14[var17++] & 0xFFFF);
                            var5.method25(true, var14[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg0[var6];
                int var8 = this.field7884[var7];
                short[] var9 = this.field7871.field7541[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method49(-1060492440, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method49(-1060492440, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method49(arg2 ^ 0x3F35A222, var9[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (arg2 != -30390 || var4 <= 0) {
            return;
        }
        this.field7874.method694(var5.field57, 2112, var5.field96, 5123);
        this.field7886.method858(this.field7871.field7569, this.field7877, (byte) 62, this.field7871.field7564, this.field7871.field7556);
        this.field7886.method861(-9476, (this.field7871.field7545 & 0x8) != 0, this.field7876, (this.field7871.field7545 & 0x7) != 0);
        if (this.field7886.field1440) {
            this.field7886.method309(Integer.MAX_VALUE, this.field7878, this.field7880, this.field7883);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field7875, 1.0F / this.field7875, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field7886.method858(this.field7871.field7569, this.field7877, (byte) 107, this.field7871.field7564, this.field7871.field7556);
        this.field7886.method819(var4, 125, 0, 4, this.field7874);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lqaa;I)I")
    public static final int method3277(class26 arg0, int arg1) {
        field7879++;
        if (class406.field6268 == arg0) {
            return 7681;
        } else if (class646.field9074 == arg0) {
            return 8448;
        } else if (class51.field681 == arg0) {
            return 34165;
        } else if (class471.field6979 == arg0) {
            return 260;
        } else if (class636.field8947 == arg0) {
            return 34023;
        } else if (arg1 == 25865) {
            throw new IllegalArgumentException();
        } else {
            return -9;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)V")
    public final void method3278(int arg0, boolean arg1) {
        this.field7890.method3618(arg0 * 4 + 3);
        field7872++;
        if (!arg1) {
            this.field7890.method3631(-1);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method3279(int arg0) {
        if (arg0 == 3) {
            field7882 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Ltv;IIIII)V")
    public class540(class521 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7871 = arg0;
        this.field7876 = arg1;
        this.field7886 = this.field7871.field7542;
        this.field7875 = arg2;
        this.field7880 = arg4;
        this.field7883 = arg5;
        this.field7884 = new int[this.field7871.field513 * this.field7871.field510];
        this.field7878 = arg3;
        this.field7874 = new class450(this.field7886, 5123, null, 1);
    }
}
