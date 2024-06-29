import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class511 extends class435 {

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "Lsp;")
    private class452 field7439;

    @OriginalMember(owner = "client!wn", name = "I", descriptor = "I")
    public int field7456;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    public int field7445;

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "F")
    public float field7452;

    @OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
    public int field7457;

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "Lur;")
    private class377 field7451;

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
    public int field7444;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "[I")
    private int[] field7447;

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "Ldj;")
    private class230 field7450;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "[I")
    public static int[] field7437 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "[[S")
    public static short[][] field7435 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "[I")
    public static int[] field7443 = new int[2];

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "S")
    public static short field7458 = 320;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!wn", name = "G", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "Ltp;")
    private class374 field7446;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field7449;

    @OriginalMember(owner = "client!wn", name = "F", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field7453;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII)V")
    public final void method3051(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -18458) {
            this.field7450 = null;
        }
        field7455++;
        this.field7447[this.field7439.field391 * arg1 + arg2] = class219.method1381(this.field7447[this.field7439.field391 * arg1 + arg2], 0x1 << arg0);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILfo;)V")
    public static final void method3052(int arg0, class361 arg1) {
        field7442++;
        if (arg0 == -9952) {
            class58.field683 = arg1;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V")
    public final void method3053(int arg0, int arg1) {
        this.field7453.method2734();
        field7440++;
        class170 var3 = this.field7451.method2287(arg1 * 4, 4, (byte) -74, this.field7449, false);
        if (arg0 == 24090) {
            this.field7446 = new class374(var3, 5121, 4, 0);
            this.field7453 = null;
            this.field7449 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z[II)V")
    public final void method3054(boolean arg0, int[] arg1, int arg2) {
        field7441++;
        int var4 = 0;
        class408 var5 = this.field7451.field5372;
        var5.field5729 = 0;
        if (this.field7451.field5334) {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg1[var6];
                short[] var8 = this.field7439.field6750[var7];
                int var9 = this.field7447[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2444((byte) 65, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method2444((byte) 65, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method2444((byte) 65, var8[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1[var12];
                int var14 = this.field7447[var13];
                short[] var15 = this.field7439.field6750[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var15.length > var17) {
                        if ((0x1 << var16++ & var14) == 0) {
                            var17 += 3;
                        } else {
                            var5.method2434(-12659, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method2434(-12659, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method2434(-12659, var15[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 > 0) {
            this.field7450.method1466(arg0, var5.field5729, var5.field5761, 5123);
            this.field7451.method2293(this.field7439.field6770, this.field7439.field6777, this.field7446, 32884, this.field7439.field6773);
            this.field7451.method2303((this.field7439.field6741 & 0x7) != 0, this.field7456, -11460, ~(this.field7439.field6741 & 0x8) != -1);
            if (this.field7451.field5354) {
                this.field7451.method1137(Integer.MAX_VALUE, this.field7457, this.field7444, this.field7445);
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(1.0F / this.field7452, 1.0F / this.field7452, 1.0F);
            OpenGL.glMatrixMode(5888);
            this.field7451.method2293(this.field7439.field6770, this.field7439.field6777, this.field7446, 32884, this.field7439.field6773);
            this.field7451.method2247(var4, (byte) -122, 0, 4, this.field7450);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
        if (arg0) {
            method3059((byte) -114);
        }
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V")
    public static final void method3055(int arg0) {
        field7454++;
        class492.method2979(class106.field1430, arg0 ^ 0x40);
        class259.field3456++;
        class106.field1443.method2449((byte) 125, arg0);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BI)V")
    public final void method3056(byte arg0, int arg1) {
        field7448++;
        this.field7453.method2732(arg1 * 4 + 3);
        if (arg0 != 75) {
            this.method3056((byte) -47, 104);
        }
        this.field7453.method2737(-1);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIFI)V")
    public final void method3057(int arg0, int arg1, int arg2, float arg3, int arg4) {
        if (this.field7456 != -1) {
            class433 var6 = this.field7451.field3772.method94(this.field7456, (byte) -72);
            int var7 = var6.field6317 & 0xFF;
            if (var7 != 0 && var6.field6320 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg2 * 131586;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field6303 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg1 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg1 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = ((var12 & 0x1500FF00) << 8) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        field7438++;
        if (arg3 != 1.0F) {
            int var15 = arg1 >> 16 & 0xFF;
            int var16 = (arg1 & 0xFF22) >> 8;
            int var17 = (int) ((float) var15 * arg3);
            int var18 = arg1 & 0xFF;
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
            arg1 = var17 << 16 | var19 << 8 | var20;
        }
        this.field7453.method2732(arg4 * 4);
        this.field7453.method2737((byte) (arg1 >> 16));
        int var21 = -123 / ((arg0 + 14) / 48);
        this.field7453.method2737((byte) (arg1 >> 8));
        this.field7453.method2737((byte) arg1);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IB)V")
    public final void method3058(int arg0, byte arg1) {
        this.field7449 = this.field7451.field5312.method2738(arg0 * 4);
        if (arg1 != 50) {
            method3052(97, null);
        }
        field7436++;
        this.field7453 = new NativeStream(this.field7449);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V")
    public static void method3059(byte arg0) {
        field7435 = null;
        if (arg0 == 68) {
            field7437 = null;
            field7443 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lsp;IIIII)V")
    public class511(class452 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7439 = arg0;
        this.field7456 = arg1;
        this.field7445 = arg5;
        this.field7452 = arg2;
        this.field7457 = arg3;
        this.field7451 = this.field7439.field6765;
        this.field7444 = arg4;
        this.field7447 = new int[this.field7439.field394 * this.field7439.field391];
        this.field7450 = new class230(this.field7451, 5123, null, 1);
    }
}
