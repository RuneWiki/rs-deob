import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class516 extends class467 {

    @OriginalMember(owner = "client!io", name = "w", descriptor = "Llh;")
    private class257 field7651;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "F")
    public float field7654;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "Lbv;")
    private class282 field7645;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "I")
    public int field7643;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "I")
    public int field7647;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "[I")
    private int[] field7642;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    public int field7657;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "I")
    public int field7644;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "Lmv;")
    private class227 field7664;

    @OriginalMember(owner = "client!io", name = "F", descriptor = "[[B")
    public static byte[][] field7660 = new byte[1000][];

    @OriginalMember(owner = "client!io", name = "A", descriptor = "Lpg;")
    public static class492 field7655 = new class492(0, -1);

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    public static int field7662 = 0;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "Z")
    public static boolean field7661 = false;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!io", name = "B", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!io", name = "D", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "Lit;")
    private class509 field7648;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field7652;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field7653;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IZ)V")
    public final void method3066(int arg0, boolean arg1) {
        field7650++;
        if (!arg1) {
            this.field7653 = null;
        }
        this.field7652 = this.field7645.field4084.method159(arg0 * 4);
        this.field7653 = new NativeStream(this.field7652);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
    public final void method3067(int arg0, int arg1) {
        field7646++;
        this.field7653.method153(arg0 * 4 + 3);
        this.field7653.method154(-1);
        if (arg1 <= 45) {
            this.field7643 = 105;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I[IB)V")
    public final void method3068(int arg0, int[] arg1, byte arg2) {
        field7656++;
        int var4 = 0;
        class91 var5 = class128.field1807;
        var5.field1292 = 0;
        if (arg2 > -7) {
            return;
        }
        if (this.field7645.field4197) {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg1[var12];
                int var14 = this.field7642[var13];
                short[] var15 = this.field7651.field3556[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var15.length > var17) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var5.method600(var15[var17++] & 0xFFFF, -12891);
                            var4++;
                            var4++;
                            var5.method600(var15[var17++] & 0xFFFF, -12891);
                            var4++;
                            var5.method600(var15[var17++] & 0xFFFF, -12891);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg1[var6];
                int var8 = this.field7642[var7];
                short[] var9 = this.field7651.field3556[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var9.length > var11) {
                        if ((var8 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method628(-115, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method628(61, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method628(-110, var9[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field7664.method1270(var5.field1292, -15, 5123, var5.field1277);
        this.field7645.method1790(this.field7651.field3587, (byte) 43, this.field7651.field3598, this.field7651.field3597, this.field7648);
        this.field7645.method1786((this.field7651.field3574 & 0x8) != 0, this.field7647, (this.field7651.field3574 & 0x7) != 0, 50);
        if (this.field7645.field4109) {
            this.field7645.method1108(Integer.MAX_VALUE, this.field7657, this.field7644, this.field7643);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field7654, 1.0F / this.field7654, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field7645.method1790(this.field7651.field3587, (byte) 43, this.field7651.field3598, this.field7651.field3597, this.field7648);
        this.field7645.method1829(1, 0, var4, this.field7664, 4);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
    public static void method3069(int arg0) {
        if (arg0 < 80) {
            field7661 = false;
        }
        field7660 = null;
        field7655 = null;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(II)V")
    public final void method3070(int arg0, int arg1) {
        field7658++;
        this.field7653.method157();
        class46 var3 = this.field7645.method1773(4, arg1 * 4, true, this.field7652, false);
        this.field7648 = new class509(var3, 5121, 4, arg0);
        this.field7652 = null;
        this.field7653 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIII)V")
    public final void method3071(int arg0, int arg1, int arg2, int arg3) {
        this.field7642[this.field7651.field2912 * arg2 + arg0] = class286.method1860(this.field7642[this.field7651.field2912 * arg2 + arg0], 0x1 << arg1);
        if (arg3 == -21235) {
            field7659++;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IFIIB)V")
    public final void method3072(int arg0, float arg1, int arg2, int arg3, byte arg4) {
        if (this.field7647 != -1) {
            class263 var6 = this.field7645.field7256.method1558(this.field7647, (byte) 125);
            int var7 = var6.field3660 & 0xFF;
            if (var7 != 0 && var6.field3671 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg0 * 131586;
                }
                if (var7 == 256) {
                    arg2 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg2 = ((arg2 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg2 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field3661 & 0xFF;
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
                arg2 = (var14 >> 8) + (((var12 & 0xE000FF00) << 8) + (var13 & 0xFF00));
            }
        }
        field7649++;
        this.field7653.method153(arg3 * 4);
        if (arg1 != 1.0F) {
            int var15 = (arg2 & 0xFFCDF1) >> 16;
            int var16 = arg2 >> 8 & 0xFF;
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
            arg2 = var19 << 8 | var17 << 16 | var20;
        }
        this.field7653.method154((byte) (arg2 >> 16));
        this.field7653.method154((byte) (arg2 >> 8));
        if (arg4 <= 69) {
            method3069(25);
        }
        this.field7653.method154((byte) arg2);
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Llh;IIIII)V")
    public class516(class257 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7651 = arg0;
        this.field7654 = arg2;
        this.field7645 = this.field7651.field3552;
        this.field7643 = arg5;
        this.field7647 = arg1;
        this.field7642 = new int[this.field7651.field2914 * this.field7651.field2912];
        this.field7657 = arg3;
        this.field7644 = arg4;
        this.field7664 = new class227(this.field7645, 5123, null, 1);
    }
}
