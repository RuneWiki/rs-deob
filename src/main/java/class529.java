import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class529 extends class263 {

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "Lrk;")
    private class30 field6672;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public int field6670;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "Ljaa;")
    private class576 field6681;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "F")
    public float field6668;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public int field6667;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public int field6675;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public int field6674;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "[I")
    private int[] field6671;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "Lea;")
    private class512 field6666;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "Lce;")
    private class288 field6669;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6678;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field6679;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)V", line = 5)
    public final void method2851(int arg0, int arg1) {
        this.field6678.method3529(arg1 * 4 + 3);
        field6673++;
        this.field6678.method3521(-1);
        if (arg0 != 0) {
            this.method2854(42, null, 38);
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)V", line = 22)
    public final void method2852(int arg0, int arg1) {
        field6665++;
        if (arg1 >= -21) {
            this.field6666 = null;
        }
        this.field6679 = this.field6681.field7591.method3516(arg0 * 4, true);
        this.field6678 = new Stream(this.field6679);
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(II)V", line = 38)
    public final void method2853(int arg0, int arg1) {
        field6676++;
        this.field6678.method3530();
        class393 var3 = this.field6681.method3145(-4, 4, arg1 * 4, false, this.field6679);
        this.field6669 = new class288(var3, 5121, 4, 0);
        this.field6679 = null;
        this.field6678 = null;
        if (arg0 != -5) {
            this.field6672 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[II)V", line = 56)
    public final void method2854(int arg0, int[] arg1, int arg2) {
        field6664++;
        int var4 = 0;
        class113 var5 = this.field6681.field7738;
        var5.field7313 = 0;
        if (this.field6681.field7643) {
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1[var12];
                short[] var14 = this.field6672.field388[var13];
                int var15 = this.field6671[var13];
                if (var15 != 0 && var14 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var14.length > var17) {
                        if ((var15 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method3080((byte) -99, var14[var17++] & 0xFFFF);
                            var4++;
                            var5.method3080((byte) -47, var14[var17++] & 0xFFFF);
                            var4++;
                            var5.method3080((byte) -79, var14[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg2; var6++) {
                int var7 = arg1[var6];
                short[] var8 = this.field6672.field388[var7];
                int var9 = this.field6671[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var8.length) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var5.method3060(-32768, var8[var11++] & 0xFFFF);
                            var4++;
                            var5.method3060(-32768, var8[var11++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method3060(-32768, var8[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 > 0) {
            this.field6666.method1826(5123, 29039, var5.field7318, var5.field7313);
            this.field6681.method3190(this.field6672.field397, 32885, this.field6669, this.field6672.field401, this.field6672.field394);
            this.field6681.method3148((this.field6672.field354 & 0x7) != 0, (byte) -104, this.field6670, (this.field6672.field354 & 0x8) != 0);
            if (this.field6681.field7702) {
                this.field6681.method456(Integer.MAX_VALUE, this.field6674, this.field6667, this.field6675);
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(1.0F / this.field6668, 1.0F / this.field6668, 1.0F);
            OpenGL.glMatrixMode(5888);
            this.field6681.method3190(this.field6672.field397, arg0 ^ 0x7FFF7F8A, this.field6669, this.field6672.field401, this.field6672.field394);
            this.field6681.method3129(this.field6666, 78, 0, var4, 4);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
        if (arg0 != Integer.MAX_VALUE) {
            this.field6678 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIII)V", line = 182)
    public final void method2855(int arg0, int arg1, int arg2, int arg3) {
        field6680++;
        if (arg3 == -12788) {
            this.field6671[this.field6672.field1685 * arg1 + arg2] = class364.method2113(this.field6671[this.field6672.field1685 * arg1 + arg2], 0x1 << arg0);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZIIF)V", line = 194)
    public final void method2856(int arg0, boolean arg1, int arg2, int arg3, float arg4) {
        field6677++;
        if (this.field6670 != -1) {
            class152 var6 = this.field6681.field8781.method2718(this.field6670, (byte) 72);
            int var7 = var6.field1820 & 0xFF;
            if (var7 != 0 && var6.field1809 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg3 * 131586;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg0 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field1816 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg0 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg0 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg0 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg0 = (var13 & 0xFF00) + (((var12 & 0xD300FF00) << 8) + (var14 >> 8));
            }
        }
        if (arg4 != 1.0F) {
            int var15 = arg0 >> 16 & 0xFF;
            int var16 = (arg0 & 0xFF37) >> 8;
            int var17 = arg0 & 0xFF;
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
            arg0 = var20 | var19 << 8 | var18 << 16;
        }
        this.field6678.method3529(arg2 * 4);
        if (!arg1) {
            this.method2851(-67, -71);
        }
        this.field6678.method3521((byte) (arg0 >> 16));
        this.field6678.method3521((byte) (arg0 >> 8));
        this.field6678.method3521((byte) arg0);
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lrk;IIIII)V", line = 305)
    public class529(class30 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6672 = arg0;
        this.field6670 = arg1;
        this.field6681 = this.field6672.field386;
        this.field6668 = arg2;
        this.field6667 = arg4;
        this.field6675 = arg5;
        this.field6674 = arg3;
        this.field6671 = new int[this.field6672.field1685 * this.field6672.field1684];
        this.field6666 = new class512(this.field6681, 5123, null, 1);
    }
}
