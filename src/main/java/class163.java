import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class163 extends class262 {

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    private int field2673 = 0;

    @OriginalMember(owner = "client!jm", name = "I", descriptor = "B")
    private byte field2691 = 0;

    @OriginalMember(owner = "client!jm", name = "Q", descriptor = "I")
    private int field2699 = 0;

    @OriginalMember(owner = "client!jm", name = "L", descriptor = "I")
    public int field2694 = 0;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
    private int field2677 = 0;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "Z")
    public boolean field2668 = false;

    @OriginalMember(owner = "client!jm", name = "db", descriptor = "B")
    private byte field2711 = 0;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "[I")
    private int[] field2670;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "[I")
    public int[] field2669;

    @OriginalMember(owner = "client!jm", name = "V", descriptor = "[I")
    public int[] field2704;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "[I")
    public int[] field2676;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "[I")
    private int[] field2671;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "[S")
    private short[] field2688;

    @OriginalMember(owner = "client!jm", name = "bb", descriptor = "[S")
    private short[] field2709;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "[S")
    private short[] field2675;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "[S")
    private short[] field2685;

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "[S")
    private short[] field2680;

    @OriginalMember(owner = "client!jm", name = "K", descriptor = "[F")
    private float[] field2693;

    @OriginalMember(owner = "client!jm", name = "eb", descriptor = "[F")
    private float[] field2712;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "[S")
    private short[] field2674;

    @OriginalMember(owner = "client!jm", name = "P", descriptor = "[B")
    private byte[] field2698;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "[S")
    private short[] field2681;

    @OriginalMember(owner = "client!jm", name = "U", descriptor = "[S")
    private short[] field2703;

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "[S")
    private short[] field2683;

    @OriginalMember(owner = "client!jm", name = "N", descriptor = "[S")
    private short[] field2696;

    @OriginalMember(owner = "client!jm", name = "R", descriptor = "[B")
    private byte[] field2700;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "[S")
    private short[] field2682;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "Lkj;")
    public class30 field2684;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "Lma;")
    public class245 field2687;

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "Lma;")
    private class245 field2689;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "Lma;")
    private class245 field2678;

    @OriginalMember(owner = "client!jm", name = "S", descriptor = "Lma;")
    private class245 field2701;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "Lma;")
    private class245 field2686;

    @OriginalMember(owner = "client!jm", name = "Z", descriptor = "S")
    private short field2707;

    @OriginalMember(owner = "client!jm", name = "O", descriptor = "S")
    private short field2697;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "[S")
    private short[] field2672;

    @OriginalMember(owner = "client!jm", name = "M", descriptor = "[I")
    private int[] field2695;

    @OriginalMember(owner = "client!jm", name = "J", descriptor = "Ljj;")
    private static class44 field2692 = new class44(10000);

    @OriginalMember(owner = "client!jm", name = "Y", descriptor = "Ljm;")
    private static class163 field2706 = new class163();

    @OriginalMember(owner = "client!jm", name = "fb", descriptor = "Ljm;")
    private static class163 field2713 = new class163();

    @OriginalMember(owner = "client!jm", name = "gb", descriptor = "Ljm;")
    private static class163 field2714 = new class163();

    @OriginalMember(owner = "client!jm", name = "hb", descriptor = "Ljm;")
    private static class163 field2715 = new class163();

    @OriginalMember(owner = "client!jm", name = "ib", descriptor = "Ljm;")
    private static class163 field2716 = new class163();

    @OriginalMember(owner = "client!jm", name = "jb", descriptor = "Ljm;")
    private static class163 field2717 = new class163();

    @OriginalMember(owner = "client!jm", name = "pb", descriptor = "Z")
    private static boolean field2723 = false;

    @OriginalMember(owner = "client!jm", name = "ub", descriptor = "[I")
    private static int[] field2728 = new int[1];

    @OriginalMember(owner = "client!jm", name = "sb", descriptor = "[I")
    private static int[] field2726 = new int[1];

    @OriginalMember(owner = "client!jm", name = "kb", descriptor = "F")
    private static float field2718;

    @OriginalMember(owner = "client!jm", name = "nb", descriptor = "F")
    private static float field2721;

    @OriginalMember(owner = "client!jm", name = "ob", descriptor = "F")
    private static float field2722;

    @OriginalMember(owner = "client!jm", name = "rb", descriptor = "F")
    private static float field2725;

    @OriginalMember(owner = "client!jm", name = "tb", descriptor = "F")
    private static float field2727;

    @OriginalMember(owner = "client!jm", name = "vb", descriptor = "F")
    private static float field2729;

    @OriginalMember(owner = "client!jm", name = "lb", descriptor = "I")
    private static int field2719;

    @OriginalMember(owner = "client!jm", name = "mb", descriptor = "I")
    private static int field2720;

    @OriginalMember(owner = "client!jm", name = "qb", descriptor = "I")
    private static int field2724;

    @OriginalMember(owner = "client!jm", name = "T", descriptor = "Lkl;")
    private class267 field2702;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "Lfd;")
    private class306 field2679;

    @OriginalMember(owner = "client!jm", name = "X", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2705;

    @OriginalMember(owner = "client!jm", name = "H", descriptor = "[J")
    private static long[] field2690;

    @OriginalMember(owner = "client!jm", name = "ab", descriptor = "[[I")
    private int[][] field2708;

    @OriginalMember(owner = "client!jm", name = "cb", descriptor = "[[I")
    private int[][] field2710;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "()V", line = 7)
    public final void method1148() {
        for (int var1 = 0; var1 < this.field2694; var1++) {
            this.field2676[var1] = -this.field2676[var1];
        }
        if (this.field2685 != null) {
            for (int var2 = 0; var2 < this.field2699; var2++) {
                this.field2685[var2] = (short) (-this.field2685[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field2677; var3++) {
            short var4 = this.field2681[var3];
            this.field2681[var3] = this.field2683[var3];
            this.field2683[var3] = var4;
        }
        this.field2684.field402 = false;
        this.field2687.field3874 = false;
        if (this.field2678 != null) {
            this.field2678.field3874 = false;
        }
        this.field2686.field3874 = false;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZZZZZZ)V", line = 46)
    public final void method1149(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field2691 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field2699 != 0) {
            if (arg6) {
                boolean var8 = !this.field2689.field3874 && (arg1 || arg2 && !class322.field4994);
                this.method1201(false, !this.field2687.field3874 && arg0, var8, this.field2678 != null && !this.field2678.field3874 && arg2, !this.field2701.field3874 && arg3);
                if (!this.field2686.field3874 && arg4 && arg1) {
                    this.method1173();
                }
            }
            if (arg0) {
                if (this.field2687.field3874) {
                    if (!this.field2684.field402) {
                        this.method1167();
                    }
                    this.field2669 = null;
                    this.field2704 = null;
                    this.field2676 = null;
                    this.field2672 = null;
                    this.field2670 = null;
                } else {
                    this.field2711 = (byte) (this.field2711 | 0x1);
                }
            }
            if (arg1) {
                if (this.field2689.field3874) {
                    this.field2674 = null;
                    this.field2698 = null;
                } else {
                    this.field2711 = (byte) (this.field2711 | 0x2);
                }
            }
            if (arg2 && class322.field4994) {
                if (this.field2678.field3874) {
                    this.field2709 = null;
                    this.field2675 = null;
                    this.field2685 = null;
                    this.field2680 = null;
                } else {
                    this.field2711 = (byte) (this.field2711 | 0x4);
                }
            }
            if (arg3) {
                if (this.field2701.field3874) {
                    this.field2693 = null;
                    this.field2712 = null;
                } else {
                    this.field2711 = (byte) (this.field2711 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field2686.field3874 && this.field2689.field3874) {
                    this.field2681 = null;
                    this.field2703 = null;
                    this.field2683 = null;
                } else {
                    this.field2711 = (byte) (this.field2711 | 0x10);
                }
            }
            if (arg5) {
                this.field2671 = null;
                this.field2700 = null;
                this.field2710 = (int[][]) null;
                this.field2708 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "()V", line = 141)
    public final void method1150() {
        if (this.field2709 == null) {
            this.method1176();
            return;
        }
        for (int var1 = 0; var1 < this.field2694; var1++) {
            int var2 = this.field2676[var1];
            this.field2676[var1] = this.field2669[var1];
            this.field2669[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2699; var3++) {
            short var4 = this.field2685[var3];
            this.field2685[var3] = this.field2709[var3];
            this.field2709[var3] = (short) (-var4);
        }
        this.field2684.field402 = false;
        this.field2687.field3874 = false;
        if (this.field2678 != null) {
            this.field2678.field3874 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ISIB)I", line = 179)
    private static final int method1151(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class170.field2812[class250.method1777(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class170.field2814.method937(true, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class170.field2814.method956(arg1 & 0xFFFF, -29034);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "()I", line = 237)
    public final int method1152() {
        if (!this.field2684.field402) {
            this.method1167();
        }
        return this.field2684.field407;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII[FIF)V", line = 243)
    private static final void method1153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field2727 = var16;
        field2725 = var17;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lgd;IJIIIIFF)S", line = 294)
    private final short method1154(class134 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field2670[arg1];
        int var12 = this.field2670[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field2672[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field2690[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field2672[var13] = (short) (this.field2699 + 1);
        field2690[var13] = arg2;
        this.field2709[this.field2699] = (short) arg3;
        this.field2675[this.field2699] = (short) arg4;
        this.field2685[this.field2699] = (short) arg5;
        this.field2680[this.field2699] = (short) arg6;
        this.field2693[this.field2699] = arg7;
        this.field2712[this.field2699] = arg8;
        return (short) (this.field2699++);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(FFF)I", line = 332)
    private static final int method1155(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII[FFIF)V", line = 367)
    private static final void method1156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field2718 = var16;
        field2729 = var17;
    }

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "()V", line = 412)
    public final void method1157() {
        if (this.field2709 == null) {
            this.method1190();
            return;
        }
        for (int var1 = 0; var1 < this.field2694; var1++) {
            this.field2669[var1] = -this.field2669[var1];
            this.field2676[var1] = -this.field2676[var1];
        }
        for (int var2 = 0; var2 < this.field2699; var2++) {
            this.field2709[var2] = (short) (-this.field2709[var2]);
            this.field2685[var2] = (short) (-this.field2685[var2]);
        }
        this.field2684.field402 = false;
        this.field2687.field3874 = false;
        if (this.field2678 != null) {
            this.field2678.field3874 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "()I", line = 445)
    public final int method1158() {
        if (!this.field2684.field402) {
            this.method1167();
        }
        return this.field2684.field405;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 454)
    public final void method1159(int arg0) {
        int var2 = class170.field2801[arg0];
        int var3 = class170.field2810[arg0];
        for (int var4 = 0; var4 < this.field2694; var4++) {
            int var5 = this.field2676[var4] * var2 + this.field2669[var4] * var3 >> 16;
            this.field2676[var4] = this.field2676[var4] * var3 - this.field2669[var4] * var2 >> 16;
            this.field2669[var4] = var5;
        }
        this.field2684.field402 = false;
        this.field2687.field3874 = false;
    }

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "()V", line = 475)
    public final void method1160() {
        for (int var1 = 0; var1 < this.field2694; var1++) {
            this.field2669[var1] = this.field2669[var1] + 7 >> 4;
            this.field2704[var1] = this.field2704[var1] + 7 >> 4;
            this.field2676[var1] = this.field2676[var1] + 7 >> 4;
        }
        this.field2684.field402 = false;
        this.field2687.field3874 = false;
    }

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "()I", line = 488)
    public final int method1161() {
        return this.field2707;
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)V", line = 491)
    public final void method1162(int arg0) {
        this.field2697 = (short) arg0;
        if (this.field2678 != null) {
            this.field2678.field3874 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 499)
    public final void method1163(int arg0) {
        int var2 = class170.field2801[arg0];
        int var3 = class170.field2810[arg0];
        for (int var4 = 0; var4 < this.field2694; var4++) {
            int var5 = this.field2704[var4] * var3 - this.field2676[var4] * var2 >> 16;
            this.field2676[var4] = this.field2704[var4] * var2 + this.field2676[var4] * var3 >> 16;
            this.field2704[var4] = var5;
        }
        this.field2684.field402 = false;
        this.field2687.field3874 = false;
    }

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "()V", line = 518)
    public static void method1164() {
        field2690 = null;
        field2692 = null;
        field2705 = null;
        field2706 = null;
        field2713 = null;
        field2714 = null;
        field2715 = null;
        field2716 = null;
        field2717 = null;
        field2728 = null;
        field2726 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 532)
    private static final void method1165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field2721 = var18;
        field2722 = var19;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(ZZZ)Lei;", line = 612)
    public final class262 method1166(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1200(arg0, arg1, arg2, field2717, field2716);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lj;IIIZ)V", line = 616)
    public final void method40(class7 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class163 var6 = (class163) arg0;
        if (this.field2677 == 0 || var6.field2677 == 0) {
            return;
        }
        int var7 = var6.field2673;
        int[] var8 = var6.field2669;
        int[] var9 = var6.field2704;
        int[] var10 = var6.field2676;
        short[] var11 = var6.field2709;
        short[] var12 = var6.field2675;
        short[] var13 = var6.field2685;
        short[] var14 = var6.field2680;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field2702 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field2702.field4313;
            var16 = this.field2702.field4311;
            var17 = this.field2702.field4312;
            var18 = this.field2702.field4314;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field2702 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field2702.field4313;
            var20 = var6.field2702.field4311;
            var21 = var6.field2702.field4312;
            var22 = var6.field2702.field4314;
        }
        int[] var23 = var6.field2670;
        short[] var24 = var6.field2672;
        if (!var6.field2684.field402) {
            var6.method1167();
        }
        short var25 = var6.field2684.field403;
        short var26 = var6.field2684.field406;
        short var27 = var6.field2684.field401;
        short var28 = var6.field2684.field404;
        short var29 = var6.field2684.field407;
        short var30 = var6.field2684.field405;
        for (int var31 = 0; var31 < this.field2673; var31++) {
            int var32 = this.field2704[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field2669[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field2676[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field2670[var31];
                        int var37 = this.field2670[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2672[var38] - 1;
                            if (var35 == -1 || this.field2680[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field2702 = new class267();
                                            var15 = this.field2702.field4313 = class273.method1972(this.field2709, (byte) -107);
                                            var16 = this.field2702.field4311 = class273.method1972(this.field2675, (byte) -110);
                                            var17 = this.field2702.field4312 = class273.method1972(this.field2685, (byte) -114);
                                            var18 = this.field2702.field4314 = class273.method1972(this.field2680, (byte) -113);
                                        }
                                        if (var19 == null) {
                                            class267 var44 = var6.field2702 = new class267();
                                            var19 = var44.field4313 = class273.method1972(var11, (byte) -127);
                                            var20 = var44.field4311 = class273.method1972(var12, (byte) -108);
                                            var21 = var44.field4312 = class273.method1972(var13, (byte) -115);
                                            var22 = var44.field4314 = class273.method1972(var14, (byte) -125);
                                        }
                                        short var45 = this.field2709[var35];
                                        short var46 = this.field2675[var35];
                                        short var47 = this.field2685[var35];
                                        short var48 = this.field2680[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field2670[var31];
                                        int var58 = this.field2670[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field2672[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "()V", line = 854)
    private final void method1167() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2673; var9++) {
            int var10 = this.field2669[var9];
            int var11 = this.field2704[var9];
            int var12 = this.field2676[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field2684.field401 = (short) var1;
        this.field2684.field404 = (short) var4;
        this.field2684.field403 = (short) var2;
        this.field2684.field406 = (short) var5;
        this.field2684.field407 = (short) var3;
        this.field2684.field405 = (short) var6;
        this.field2684.field408 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field2684.field402 = true;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIIIJILpe;)V", line = 923)
    public final void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class294 arg10) {
        if (this.field2699 == 0) {
            return;
        }
        if (!this.field2684.field402) {
            this.method1167();
        }
        short var13 = this.field2684.field408;
        short var14 = this.field2684.field403;
        short var15 = this.field2684.field406;
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class74.field1050) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class99.field1443) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class100.field1458) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class207.field3414) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class170.field2801[arg0];
            var27 = class170.field2810[arg0];
        }
        if (arg8 > 0L && class158.field2620 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class51.field734 >= var28 && class51.field734 <= var29 && class243.field3848 >= var30 && class243.field3848 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field2684.field401;
                short var37 = this.field2684.field404;
                short var38 = this.field2684.field407;
                short var39 = this.field2684.field405;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class51.field734 >= var32 && class51.field734 <= var33 && class243.field3848 >= var34 && class243.field3848 <= var35) {
                    if (this.field4178) {
                        class205.field3366[class194.field3174++] = arg8;
                    } else {
                        if (field2728.length < this.field2699) {
                            field2728 = new int[this.field2699];
                            field2726 = new int[this.field2699];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field2673) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field2677) {
                                        break label118;
                                    }
                                    short var80 = this.field2681[var79];
                                    short var81 = this.field2703[var79];
                                    short var82 = this.field2683[var79];
                                    if (this.method1179(class51.field734, class243.field3848, field2726[var80], field2726[var81], field2726[var82], field2728[var80], field2728[var81], field2728[var82])) {
                                        class205.field3366[class194.field3174++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field2669[var59];
                            int var61 = this.field2704[var59];
                            int var62 = this.field2676[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field2670[var59];
                            int var76 = this.field2670[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field2672[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field2728[var78] = var73;
                                field2726[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class232.field3716;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1199();
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIFFF)[F", line = 1197)
    private static final float[] method1168(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float var8 = 1.0F;
        float var9 = 0.0F;
        float var10 = (float) arg1 / 32767.0F;
        float var11 = -((float) Math.sqrt((double) (1.0F - var10 * var10)));
        float var12 = 1.0F - var10;
        float var13 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var13 != 0.0F) {
            var8 = (float) (-arg2) / var13;
            var9 = (float) arg0 / var13;
        }
        var7[0] = var8 * var8 * var12 + var10;
        var7[1] = var9 * var11;
        var7[2] = var8 * var9 * var12;
        var7[3] = -var9 * var11;
        var7[4] = var10;
        var7[5] = var8 * var11;
        var7[6] = var8 * var9 * var12;
        var7[7] = -var8 * var11;
        var7[8] = var9 * var9 * var12 + var10;
        float[] var14 = new float[9];
        float var15 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var16 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var17 = 1.0F - var15;
        var14[0] = var15;
        var14[1] = 0.0F;
        var14[2] = var16;
        var14[3] = 0.0F;
        var14[4] = 1.0F;
        var14[5] = 0.0F;
        var14[6] = -var16;
        var14[7] = 0.0F;
        var14[8] = var15;
        float[] var18 = new float[] { var7[6] * var14[2] + var7[0] * var14[0] + var7[3] * var14[1], var7[7] * var14[2] + var7[1] * var14[0] + var7[4] * var14[1], var7[8] * var14[2] + var7[2] * var14[0] + var7[5] * var14[1], var7[6] * var14[5] + var7[0] * var14[3] + var7[3] * var14[4], var7[7] * var14[5] + var7[1] * var14[3] + var7[4] * var14[4], var7[8] * var14[5] + var7[2] * var14[3] + var7[5] * var14[4], var7[6] * var14[8] + var7[0] * var14[6] + var7[3] * var14[7], var7[7] * var14[8] + var7[1] * var14[6] + var7[4] * var14[7], var7[8] * var14[8] + var7[2] * var14[6] + var7[5] * var14[7] };
        var18[0] *= arg4;
        var18[1] *= arg4;
        var18[2] *= arg4;
        var18[3] *= arg5;
        var18[4] *= arg5;
        var18[5] *= arg5;
        var18[6] *= arg6;
        var18[7] *= arg6;
        var18[8] *= arg6;
        return var18;
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "()V", line = 1265)
    public final void method1169() {
        for (int var1 = 0; var1 < this.field2694; var1++) {
            int var2 = this.field2669[var1];
            this.field2669[var1] = this.field2676[var1];
            this.field2676[var1] = -var2;
        }
        this.field2684.field402 = false;
        this.field2687.field3874 = false;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "()I", line = 1279)
    public final int method33() {
        if (!this.field2684.field402) {
            this.method1167();
        }
        return this.field2684.field403;
    }

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "(I)V", line = 1289)
    public final void method1170(int arg0) {
        this.field2707 = (short) arg0;
        this.field2689.field3874 = false;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIIJ)V", line = 1294)
    public final void method1171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field2699 == 0) {
            return;
        }
        GL var10 = class232.field3716;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1199();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "()V", line = 1317)
    public static final void method1172() {
        field2706 = new class163();
        field2713 = new class163();
        field2714 = new class163();
        field2715 = new class163();
        field2716 = new class163();
        field2717 = new class163();
    }

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "()V", line = 1326)
    private final void method1173() {
        if (field2692.field573.length < this.field2677 * 12) {
            field2692 = new class44((this.field2677 + 100) * 12);
        } else {
            field2692.field586 = 0;
        }
        if (class232.field3718) {
            for (int var1 = 0; var1 < this.field2677; var1++) {
                field2692.method283((byte) -51, this.field2681[var1]);
                field2692.method283((byte) -51, this.field2703[var1]);
                field2692.method283((byte) -51, this.field2683[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field2677; var2++) {
                field2692.method258(this.field2681[var2], (byte) 40);
                field2692.method258(this.field2703[var2], (byte) 40);
                field2692.method258(this.field2683[var2], (byte) 40);
            }
        }
        if (!class232.field3700) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field2692.field586);
            var5.put(field2692.field573, 0, field2692.field586);
            var5.flip();
            this.field2686.field3874 = true;
            this.field2686.field3873 = var5;
            this.field2686.field3876 = null;
            return;
        }
        class306 var3 = new class306();
        ByteBuffer var4 = ByteBuffer.wrap(field2692.field573, 0, field2692.field586);
        var3.method2175(var4);
        this.field2686.field3874 = true;
        this.field2686.field3873 = null;
        this.field2686.field3876 = var3;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILjm;[[I[[IIII)V", line = 1384)
    public final void method1174(int arg0, int arg1, class163 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field2684.field402) {
            arg2.method1167();
        }
        int var9 = arg2.field2684.field401 + arg5;
        int var10 = arg2.field2684.field404 + arg5;
        int var11 = arg2.field2684.field407 + arg7;
        int var12 = arg2.field2684.field405 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field2673; var17++) {
                int var18 = this.field2669[var17] + arg5;
                int var19 = this.field2676[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field2704[var17] = this.field2704[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field2684.field403;
            for (int var28 = 0; var28 < this.field2673; var28++) {
                int var29 = (this.field2704[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field2669[var28] + arg5;
                    int var31 = this.field2676[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field2704[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1872(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field2684.field406 - arg2.field2684.field403;
            for (int var42 = 0; var42 < this.field2673; var42++) {
                int var43 = this.field2669[var42] + arg5;
                int var44 = this.field2676[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field2704[var42] = var51 + this.field2704[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field2684.field406 - arg2.field2684.field403;
            for (int var53 = 0; var53 < this.field2673; var53++) {
                int var54 = this.field2669[var53] + arg5;
                int var55 = this.field2676[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field2704[var53] = ((this.field2704[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field2687.field3874 = false;
        this.field2684.field402 = false;
    }

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "()V", line = 1582)
    public final void method1175() {
        int var10002;
        if (this.field2671 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2694; var3++) {
                int var4 = this.field2671[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2710 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2710[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2694) {
                int var7 = this.field2671[var6] & 0xFF;
                this.field2710[var7][var1[var7]++] = var6++;
            }
            this.field2671 = null;
        }
        if (this.field2700 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2677; var10++) {
            int var11 = this.field2700[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2708 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2708[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2677) {
            int var14 = this.field2700[var13] & 0xFF;
            this.field2708[var14][var8[var14]++] = var13++;
        }
        this.field2700 = null;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "()V", line = 1686)
    public final void method1176() {
        for (int var1 = 0; var1 < this.field2694; var1++) {
            int var2 = this.field2676[var1];
            this.field2676[var1] = this.field2669[var1];
            this.field2669[var1] = -var2;
        }
        this.field2684.field402 = false;
        this.field2687.field3874 = false;
    }

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "()I", line = 1701)
    public final int method1177() {
        return this.field2697;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 4538)
    private class163() {
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lgd;IIZ)V", line = 4545)
    public class163(class134 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2096];
        this.field2670 = new int[arg0.field2131 + 1];
        for (int var6 = 0; var6 < arg0.field2096; var6++) {
            if ((arg0.field2147 == null || arg0.field2147[var6] != 2) && (arg0.field2137 == null || arg0.field2137[var6] == -1 || !class170.field2814.method943((byte) -128, arg0.field2137[var6] & 0xFFFF))) {
                var5[this.field2677++] = var6;
                this.field2670[arg0.field2112[var6]]++;
                this.field2670[arg0.field2115[var6]]++;
                this.field2670[arg0.field2129[var6]]++;
            }
        }
        long[] var7 = new long[this.field2677];
        for (int var8 = 0; var8 < this.field2677; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2137 != null) {
                var14 = arg0.field2137[var9];
                if (var14 != -1) {
                    var12 = class170.field2814.method944(var14 & 0xFFFF, true);
                    var13 = class170.field2814.method941(var14 & 0xFFFF, -101);
                }
            }
            boolean var15 = arg0.field2132 != null && arg0.field2132[var9] != 0 || var14 != -1 && !class170.field2814.method938(var14 & 0xFFFF, (byte) -43);
            if ((arg3 || var15) && arg0.field2116 != null) {
                var10 += arg0.field2116[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class18.method100((byte) -94, var7, var5);
        this.field2694 = arg0.field2131;
        this.field2673 = arg0.field2126;
        this.field2669 = arg0.field2135;
        this.field2704 = arg0.field2100;
        this.field2676 = arg0.field2139;
        this.field2671 = arg0.field2143;
        this.field2688 = arg0.field2103;
        int var20 = this.field2677 * 3;
        this.field2709 = new short[var20];
        this.field2675 = new short[var20];
        this.field2685 = new short[var20];
        this.field2680 = new short[var20];
        this.field2693 = new float[var20];
        this.field2712 = new float[var20];
        this.field2674 = new short[this.field2677];
        this.field2698 = new byte[this.field2677];
        this.field2681 = new short[this.field2677];
        this.field2703 = new short[this.field2677];
        this.field2683 = new short[this.field2677];
        this.field2696 = new short[this.field2677];
        if (arg0.field2107 != null) {
            this.field2700 = new byte[this.field2677];
        }
        if (arg0.field2098 != null) {
            this.field2682 = new short[this.field2677];
        }
        this.field2684 = new class30();
        this.field2687 = new class245();
        this.field2689 = new class245();
        if (class322.field4994) {
            this.field2678 = new class245();
        }
        this.field2701 = new class245();
        this.field2686 = new class245();
        this.field2707 = (short) arg1;
        this.field2697 = (short) arg2;
        this.field2672 = new short[var20];
        field2690 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field2673; var22++) {
            int var23 = this.field2670[var22];
            this.field2670[var22] = var21;
            var21 += var23;
        }
        this.field2670[this.field2673] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2114 != null) {
            int var28 = arg0.field2127;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field2677; var36++) {
                int var37 = var5[var36];
                if (arg0.field2114[var37] != -1) {
                    int var38 = arg0.field2114[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2112[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2115[var37];
                        } else {
                            var40 = arg0.field2129[var37];
                        }
                        int var41 = arg0.field2135[var40];
                        int var42 = arg0.field2100[var40];
                        int var43 = arg0.field2139[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field2136[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2124[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field2123[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2124[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2123[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2145[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2124[var44] / 1024.0F;
                        var49 = (float) arg0.field2123[var44] / 1024.0F;
                        var48 = (float) arg0.field2145[var44] / 1024.0F;
                    }
                    var27[var44] = method1168(arg0.field2101[var44], arg0.field2138[var44], arg0.field2109[var44], arg0.field2125[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field2677; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2144[var51] & 0xFFFF;
            short var53;
            if (arg0.field2137 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2137[var51];
            }
            int var54;
            if (arg0.field2114 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2114[var51];
            }
            int var55;
            if (arg0.field2132 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2132[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field2136[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2112[var51];
                        int var67 = arg0.field2115[var51];
                        int var68 = arg0.field2129[var51];
                        short var69 = arg0.field2101[var54];
                        short var70 = arg0.field2138[var54];
                        short var71 = arg0.field2109[var54];
                        float var72 = (float) arg0.field2135[var69];
                        float var73 = (float) arg0.field2100[var69];
                        float var74 = (float) arg0.field2139[var69];
                        float var75 = (float) arg0.field2135[var70] - var72;
                        float var76 = (float) arg0.field2100[var70] - var73;
                        float var77 = (float) arg0.field2139[var70] - var74;
                        float var78 = (float) arg0.field2135[var71] - var72;
                        float var79 = (float) arg0.field2100[var71] - var73;
                        float var80 = (float) arg0.field2139[var71] - var74;
                        float var81 = (float) arg0.field2135[var66] - var72;
                        float var82 = (float) arg0.field2100[var66] - var73;
                        float var83 = (float) arg0.field2139[var66] - var74;
                        float var84 = (float) arg0.field2135[var67] - var72;
                        float var85 = (float) arg0.field2100[var67] - var73;
                        float var86 = (float) arg0.field2139[var67] - var74;
                        float var87 = (float) arg0.field2135[var68] - var72;
                        float var88 = (float) arg0.field2100[var68] - var73;
                        float var89 = (float) arg0.field2139[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field2112[var51];
                        int var102 = arg0.field2115[var51];
                        int var103 = arg0.field2129[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2128[var54];
                        float var109 = (float) arg0.field2130[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2145[var54] & 0xFFFF) / 1024.0F;
                            method1156(arg0.field2135[var101], arg0.field2100[var101], arg0.field2139[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field2718;
                            var57 = field2729;
                            method1156(arg0.field2135[var102], arg0.field2100[var102], arg0.field2139[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field2718;
                            var59 = field2729;
                            method1156(arg0.field2135[var103], arg0.field2100[var103], arg0.field2139[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field2718;
                            var61 = field2729;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field2108[var54] / 256.0F;
                            float var113 = (float) arg0.field2110[var54] / 256.0F;
                            int var114 = arg0.field2135[var102] - arg0.field2135[var101];
                            int var115 = arg0.field2100[var102] - arg0.field2100[var101];
                            int var116 = arg0.field2139[var102] - arg0.field2139[var101];
                            int var117 = arg0.field2135[var103] - arg0.field2135[var101];
                            int var118 = arg0.field2100[var103] - arg0.field2100[var101];
                            int var119 = arg0.field2139[var103] - arg0.field2139[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2124[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2123[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2145[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1155(var126, var127, var128);
                            method1165(arg0.field2135[var101], arg0.field2100[var101], arg0.field2139[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field2721;
                            var57 = field2722;
                            method1165(arg0.field2135[var102], arg0.field2100[var102], arg0.field2139[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field2721;
                            var59 = field2722;
                            method1165(arg0.field2135[var103], arg0.field2100[var103], arg0.field2139[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field2721;
                            var61 = field2722;
                        } else if (var65 == 3) {
                            method1153(arg0.field2135[var101], arg0.field2100[var101], arg0.field2139[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field2727;
                            var57 = field2725;
                            method1153(arg0.field2135[var102], arg0.field2100[var102], arg0.field2139[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field2727;
                            var59 = field2725;
                            method1153(arg0.field2135[var103], arg0.field2100[var103], arg0.field2139[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field2727;
                            var61 = field2725;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method999();
            byte var129;
            if (arg0.field2147 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2147[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2112[var51];
                class29 var133 = arg0.field2102[var132];
                this.field2681[var50] = this.method1154(arg0, var132, var130, var133.field395, var133.field392, var133.field394, var133.field397, var56, var57);
                int var134 = arg0.field2115[var51];
                class29 var135 = arg0.field2102[var134];
                this.field2703[var50] = this.method1154(arg0, var134, (long) var62 + var130, var135.field395, var135.field392, var135.field394, var135.field397, var58, var59);
                int var136 = arg0.field2129[var51];
                class29 var137 = arg0.field2102[var136];
                this.field2683[var50] = this.method1154(arg0, var136, (long) var63 + var130, var137.field395, var137.field392, var137.field394, var137.field397, var60, var61);
            } else if (var129 == 1) {
                class105 var138 = arg0.field2099[var51];
                long var139 = (long) ((var54 << 2) + (var138.field1544 > 0 ? 1024 : 2048) + (var138.field1538 + 256 << 12) + (var138.field1540 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field2681[var50] = this.method1154(arg0, arg0.field2112[var51], var139, var138.field1544, var138.field1538, var138.field1540, 0, var56, var57);
                this.field2703[var50] = this.method1154(arg0, arg0.field2115[var51], (long) var62 + var139, var138.field1544, var138.field1538, var138.field1540, 0, var58, var59);
                this.field2683[var50] = this.method1154(arg0, arg0.field2129[var51], (long) var63 + var139, var138.field1544, var138.field1538, var138.field1540, 0, var60, var61);
            }
            if (arg0.field2137 == null) {
                this.field2696[var50] = -1;
            } else {
                this.field2696[var50] = arg0.field2137[var51];
            }
            if (this.field2700 != null) {
                this.field2700[var50] = (byte) arg0.field2107[var51];
            }
            this.field2674[var50] = arg0.field2144[var51];
            if (arg0.field2132 != null) {
                this.field2698[var50] = arg0.field2132[var51];
            }
            if (arg0.field2098 != null) {
                this.field2682[var50] = arg0.field2098[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field2677; var143++) {
            short var144 = this.field2696[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field2695 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field2677; var147++) {
            short var148 = this.field2696[var147];
            if (var146 != var148) {
                this.field2695[var145++] = var147;
                var146 = var148;
            }
        }
        this.field2695[var145] = this.field2677;
        field2690 = null;
        this.field2709 = method1193(this.field2709, this.field2699);
        this.field2675 = method1193(this.field2675, this.field2699);
        this.field2685 = method1193(this.field2685, this.field2699);
        this.field2680 = method1193(this.field2680, this.field2699);
        this.field2693 = method1181(this.field2693, this.field2699);
        this.field2712 = method1181(this.field2712, this.field2699);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)V", line = 1707)
    public final void method1178(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field2719 = 0;
            field2720 = 0;
            field2724 = 0;
            for (int var6 = 0; var6 < this.field2694; var6++) {
                field2719 += this.field2669[var6];
                field2720 += this.field2704[var6];
                field2724 += this.field2676[var6];
                var5++;
            }
            if (var5 > 0) {
                field2719 = field2719 / var5 + arg1;
                field2720 = field2720 / var5 + arg2;
                field2724 = field2724 / var5 + arg3;
            } else {
                field2719 = arg1;
                field2720 = arg2;
                field2724 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2694; var7++) {
                this.field2669[var7] += arg1;
                this.field2704[var7] += arg2;
                this.field2676[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2694; var8++) {
                this.field2669[var8] -= field2719;
                this.field2704[var8] -= field2720;
                this.field2676[var8] -= field2724;
                if (arg3 != 0) {
                    int var9 = class170.field2801[arg3];
                    int var10 = class170.field2810[arg3];
                    int var11 = this.field2704[var8] * var9 + this.field2669[var8] * var10 + 32767 >> 16;
                    this.field2704[var8] = this.field2704[var8] * var10 + 32767 - this.field2669[var8] * var9 >> 16;
                    this.field2669[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class170.field2801[arg1];
                    int var13 = class170.field2810[arg1];
                    int var14 = this.field2704[var8] * var13 + 32767 - this.field2676[var8] * var12 >> 16;
                    this.field2676[var8] = this.field2704[var8] * var12 + this.field2676[var8] * var13 + 32767 >> 16;
                    this.field2704[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class170.field2801[arg2];
                    int var16 = class170.field2810[arg2];
                    int var17 = this.field2676[var8] * var15 + this.field2669[var8] * var16 + 32767 >> 16;
                    this.field2676[var8] = this.field2676[var8] * var16 + 32767 - this.field2669[var8] * var15 >> 16;
                    this.field2669[var8] = var17;
                }
                this.field2669[var8] += field2719;
                this.field2704[var8] += field2720;
                this.field2676[var8] += field2724;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2694; var18++) {
                this.field2669[var18] -= field2719;
                this.field2704[var18] -= field2720;
                this.field2676[var18] -= field2724;
                this.field2669[var18] = this.field2669[var18] * arg1 / 128;
                this.field2704[var18] = this.field2704[var18] * arg2 / 128;
                this.field2676[var18] = this.field2676[var18] * arg3 / 128;
                this.field2669[var18] += field2719;
                this.field2704[var18] += field2720;
                this.field2676[var18] += field2724;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2677; var19++) {
                int var20 = (this.field2698[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field2698[var19] = (byte) var20;
            }
            this.field2689.field3874 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field2677; var21++) {
                int var22 = this.field2674[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field2674[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field2689.field3874 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIII)Z", line = 1902)
    private final boolean method1179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "()I", line = 1917)
    public final int method1180() {
        if (!this.field2684.field402) {
            this.method1167();
        }
        return this.field2684.field404;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([FI)[F", line = 1925)
    private static final float[] method1181(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class9.method45(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(SS)V", line = 1932)
    public final void method1182(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2677; var3++) {
            if (this.field2696[var3] == arg0) {
                this.field2696[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class170.field2814.method937(true, arg0 & 0xFFFF);
            var5 = class170.field2814.method956(arg0 & 0xFFFF, -29034);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class170.field2814.method937(true, arg1 & 0xFFFF);
            var7 = class170.field2814.method956(arg1 & 0xFFFF, -29034);
        }
        if (var4 != var6 || var5 != var7) {
            this.field2689.field3874 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZZZZZZZZZZ)Ljm;", line = 1967)
    public final class163 method1183(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class163 var12 = new class163();
        var12.field2694 = this.field2694;
        var12.field2673 = this.field2673;
        var12.field2699 = this.field2699;
        var12.field2677 = this.field2677;
        if (arg0) {
            var12.field2669 = this.field2669;
            var12.field2676 = this.field2676;
        } else {
            var12.field2669 = class225.method1600(this.field2669, 127);
            var12.field2676 = class225.method1600(this.field2676, 120);
        }
        if (arg1) {
            var12.field2704 = this.field2704;
        } else {
            var12.field2704 = class225.method1600(this.field2704, 115);
        }
        if (arg0 && arg1) {
            var12.field2687 = this.field2687;
            var12.field2684 = this.field2684;
        } else {
            var12.field2687 = new class245();
            var12.field2684 = new class30();
        }
        if (arg2) {
            var12.field2674 = this.field2674;
        } else {
            var12.field2674 = class273.method1972(this.field2674, (byte) -122);
        }
        if (arg3) {
            var12.field2698 = this.field2698;
        } else {
            var12.field2698 = class256.method1837(this.field2698, (byte) 90);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class322.field4994) {
            var12.field2689 = new class245();
        } else {
            var12.field2689 = this.field2689;
        }
        if (arg5) {
            var12.field2709 = this.field2709;
            var12.field2675 = this.field2675;
            var12.field2685 = this.field2685;
            var12.field2680 = this.field2680;
        } else {
            var12.field2709 = class273.method1972(this.field2709, (byte) -109);
            var12.field2675 = class273.method1972(this.field2675, (byte) -109);
            var12.field2685 = class273.method1972(this.field2685, (byte) -115);
            var12.field2680 = class273.method1972(this.field2680, (byte) -105);
        }
        if (!class322.field4994) {
            var12.field2678 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field2678 = this.field2678;
        } else {
            var12.field2678 = new class245();
        }
        if (arg8) {
            var12.field2693 = this.field2693;
            var12.field2712 = this.field2712;
            var12.field2701 = this.field2701;
        } else {
            var12.field2693 = class4.method25((byte) 76, this.field2693);
            var12.field2712 = class4.method25((byte) 89, this.field2712);
            var12.field2701 = new class245();
        }
        if (arg9) {
            var12.field2681 = this.field2681;
            var12.field2703 = this.field2703;
            var12.field2683 = this.field2683;
            var12.field2686 = this.field2686;
        } else {
            var12.field2681 = class273.method1972(this.field2681, (byte) -118);
            var12.field2703 = class273.method1972(this.field2703, (byte) -110);
            var12.field2683 = class273.method1972(this.field2683, (byte) -117);
            var12.field2686 = new class245();
        }
        if (arg10) {
            var12.field2696 = this.field2696;
        } else {
            var12.field2696 = class273.method1972(this.field2696, (byte) -106);
        }
        var12.field2671 = this.field2671;
        var12.field2710 = this.field2710;
        var12.field2700 = this.field2700;
        var12.field2708 = this.field2708;
        var12.field2695 = this.field2695;
        var12.field2672 = this.field2672;
        var12.field2670 = this.field2670;
        var12.field2707 = this.field2707;
        var12.field2697 = this.field2697;
        var12.field2688 = this.field2688;
        var12.field2682 = this.field2682;
        return var12;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Lj;", line = 2108)
    public final class7 method34(int arg0, int arg1, int arg2) {
        this.field2668 = false;
        if (this.field2702 != null) {
            this.field2709 = this.field2702.field4313;
            this.field2675 = this.field2702.field4311;
            this.field2685 = this.field2702.field4312;
            this.field2680 = this.field2702.field4314;
            this.field2702 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "()I", line = 2121)
    public final int method1184() {
        if (!this.field2684.field402) {
            this.method1167();
        }
        return this.field2684.field408;
    }

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "()V", line = 2132)
    public final void method1185() {
        if (this.field2709 == null) {
            this.method1169();
            return;
        }
        for (int var1 = 0; var1 < this.field2694; var1++) {
            int var2 = this.field2669[var1];
            this.field2669[var1] = this.field2676[var1];
            this.field2676[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field2699; var3++) {
            short var4 = this.field2709[var3];
            this.field2709[var3] = this.field2685[var3];
            this.field2685[var3] = (short) (-var4);
        }
        this.field2684.field402 = false;
        this.field2687.field3874 = false;
        if (this.field2678 != null) {
            this.field2678.field3874 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)V", line = 2170)
    public final void method1186(int arg0) {
        int var2 = class170.field2801[arg0];
        int var3 = class170.field2810[arg0];
        for (int var4 = 0; var4 < this.field2694; var4++) {
            int var5 = this.field2704[var4] * var2 + this.field2669[var4] * var3 >> 16;
            this.field2704[var4] = this.field2704[var4] * var3 - this.field2669[var4] * var2 >> 16;
            this.field2669[var4] = var5;
        }
        this.field2684.field402 = false;
        this.field2687.field3874 = false;
    }

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "()I", line = 2192)
    public final int method1187() {
        if (!this.field2684.field402) {
            this.method1167();
        }
        return this.field2684.field401;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[IIIIZI[I)V", line = 2202)
    public final void method1188(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field2719 = 0;
            field2720 = 0;
            field2724 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field2710.length) {
                    int[] var16 = this.field2710[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field2688 == null || (arg6 & this.field2688[var18]) != 0) {
                            field2719 += this.field2669[var18];
                            field2720 += this.field2704[var18];
                            field2724 += this.field2676[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field2719 = field2719 / var13 + var10;
                field2720 = field2720 / var13 + var11;
                field2724 = field2724 / var13 + var12;
                field2723 = true;
            } else {
                field2719 = var10;
                field2720 = var11;
                field2724 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2710.length) {
                    int[] var27 = this.field2710[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field2688 == null || (arg6 & this.field2688[var29]) != 0) {
                            this.field2669[var29] += var22;
                            this.field2704[var29] += var23;
                            this.field2676[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field2710.length) {
                        int[] var92 = this.field2710[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field2688 == null || (arg6 & this.field2688[var94]) != 0) {
                                this.field2669[var94] -= field2719;
                                this.field2704[var94] -= field2720;
                                this.field2676[var94] -= field2724;
                                if (arg4 != 0) {
                                    int var95 = class170.field2801[arg4];
                                    int var96 = class170.field2810[arg4];
                                    int var97 = this.field2704[var94] * var95 + this.field2669[var94] * var96 + 32767 >> 16;
                                    this.field2704[var94] = this.field2704[var94] * var96 + 32767 - this.field2669[var94] * var95 >> 16;
                                    this.field2669[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class170.field2801[arg2];
                                    int var99 = class170.field2810[arg2];
                                    int var100 = this.field2704[var94] * var99 + 32767 - this.field2676[var94] * var98 >> 16;
                                    this.field2676[var94] = this.field2704[var94] * var98 + this.field2676[var94] * var99 + 32767 >> 16;
                                    this.field2704[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class170.field2801[arg3];
                                    int var102 = class170.field2810[arg3];
                                    int var103 = this.field2676[var94] * var101 + this.field2669[var94] * var102 + 32767 >> 16;
                                    this.field2676[var94] = this.field2676[var94] * var102 + 32767 - this.field2669[var94] * var101 >> 16;
                                    this.field2669[var94] = var103;
                                }
                                this.field2669[var94] += field2719;
                                this.field2704[var94] += field2720;
                                this.field2676[var94] += field2724;
                            }
                        }
                    }
                }
                if (arg5 && this.field2709 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field2710.length) {
                            int[] var106 = this.field2710[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field2688 == null || (arg6 & this.field2688[var108]) != 0) {
                                    int var109 = this.field2670[var108];
                                    int var110 = this.field2670[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field2672[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class170.field2801[arg4];
                                            int var114 = class170.field2810[arg4];
                                            int var115 = this.field2709[var112] * var114 + this.field2675[var112] * var113 + 32767 >> 16;
                                            this.field2675[var112] = (short) (this.field2675[var112] * var114 + 32767 - this.field2709[var112] * var113 >> 16);
                                            this.field2709[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class170.field2801[arg2];
                                            int var117 = class170.field2810[arg2];
                                            int var118 = this.field2675[var112] * var117 + 32767 - this.field2685[var112] * var116 >> 16;
                                            this.field2685[var112] = (short) (this.field2685[var112] * var117 + this.field2675[var112] * var116 + 32767 >> 16);
                                            this.field2675[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class170.field2801[arg3];
                                            int var120 = class170.field2810[arg3];
                                            int var121 = this.field2709[var112] * var120 + this.field2685[var112] * var119 + 32767 >> 16;
                                            this.field2685[var112] = (short) (this.field2685[var112] * var120 + 32767 - this.field2709[var112] * var119 >> 16);
                                            this.field2709[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field2678 != null) {
                        this.field2678.field3874 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field2723) {
                    int var36 = arg7[6] * field2724 + arg7[0] * field2719 + arg7[3] * field2720 + 16384 >> 15;
                    int var37 = arg7[7] * field2724 + arg7[1] * field2719 + arg7[4] * field2720 + 16384 >> 15;
                    int var38 = arg7[8] * field2724 + arg7[2] * field2719 + arg7[5] * field2720 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field2719 = var39;
                    field2720 = var40;
                    field2724 = var41;
                    field2723 = false;
                }
                int[] var42 = new int[9];
                int var43 = class170.field2810[arg2] >> 1;
                int var44 = class170.field2801[arg2] >> 1;
                int var45 = class170.field2810[arg3] >> 1;
                int var46 = class170.field2801[arg3] >> 1;
                int var47 = class170.field2810[arg4] >> 1;
                int var48 = class170.field2801[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field2724 + var42[0] * -field2719 + var42[1] * -field2720 + 16384 >> 15;
                int var52 = var42[5] * -field2724 + var42[3] * -field2719 + var42[4] * -field2720 + 16384 >> 15;
                int var53 = var42[8] * -field2724 + var42[6] * -field2719 + var42[7] * -field2720 + 16384 >> 15;
                int var54 = field2719 + var51;
                int var55 = field2720 + var52;
                int var56 = field2724 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field2710.length) {
                        int[] var81 = this.field2710[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field2688 == null || (arg6 & this.field2688[var83]) != 0) {
                                int var84 = this.field2676[var83] * var68[2] + this.field2704[var83] * var68[1] + this.field2669[var83] * var68[0] + 16384 >> 15;
                                int var85 = this.field2676[var83] * var68[5] + this.field2704[var83] * var68[4] + this.field2669[var83] * var68[3] + 16384 >> 15;
                                int var86 = this.field2676[var83] * var68[8] + this.field2704[var83] * var68[7] + this.field2669[var83] * var68[6] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field2669[var83] = var87;
                                this.field2704[var83] = var88;
                                this.field2676[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field2710.length) {
                        int[] var174 = this.field2710[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field2688 == null || (arg6 & this.field2688[var176]) != 0) {
                                this.field2669[var176] -= field2719;
                                this.field2704[var176] -= field2720;
                                this.field2676[var176] -= field2724;
                                this.field2669[var176] = this.field2669[var176] * arg2 >> 7;
                                this.field2704[var176] = this.field2704[var176] * arg3 >> 7;
                                this.field2676[var176] = this.field2676[var176] * arg4 >> 7;
                                this.field2669[var176] += field2719;
                                this.field2704[var176] += field2720;
                                this.field2676[var176] += field2724;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field2723) {
                    int var128 = arg7[6] * field2724 + arg7[0] * field2719 + arg7[3] * field2720 + 16384 >> 15;
                    int var129 = arg7[7] * field2724 + arg7[1] * field2719 + arg7[4] * field2720 + 16384 >> 15;
                    int var130 = arg7[8] * field2724 + arg7[2] * field2719 + arg7[5] * field2720 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field2719 = var131;
                    field2720 = var132;
                    field2724 = var133;
                    field2723 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field2719 * var134 + 16384 >> 15;
                int var138 = -field2720 * var135 + 16384 >> 15;
                int var139 = -field2724 * var136 + 16384 >> 15;
                int var140 = field2719 + var137;
                int var141 = field2720 + var138;
                int var142 = field2724 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field2710.length) {
                        int[] var163 = this.field2710[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field2688 == null || (arg6 & this.field2688[var165]) != 0) {
                                int var166 = this.field2676[var165] * var150[2] + this.field2704[var165] * var150[1] + this.field2669[var165] * var150[0] + 16384 >> 15;
                                int var167 = this.field2676[var165] * var150[5] + this.field2704[var165] * var150[4] + this.field2669[var165] * var150[3] + 16384 >> 15;
                                int var168 = this.field2676[var165] * var150[8] + this.field2704[var165] * var150[7] + this.field2669[var165] * var150[6] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field2669[var165] = var169;
                                this.field2704[var165] = var170;
                                this.field2676[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2708 != null && this.field2698 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field2708.length) {
                        int[] var179 = this.field2708[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field2682 == null || (arg6 & this.field2682[var181]) != 0) {
                                int var182 = (this.field2698[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field2698[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field2689.field3874 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field2708 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field2708.length) {
                    int[] var185 = this.field2708[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field2682 == null || (arg6 & this.field2682[var187]) != 0) {
                            int var188 = this.field2674[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field2674[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field2689.field3874 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(III)V", line = 2995)
    public final void method1189(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2694; var4++) {
            this.field2669[var4] += arg0;
            this.field2704[var4] += arg1;
            this.field2676[var4] += arg2;
        }
        this.field2684.field402 = false;
        this.field2687.field3874 = false;
    }

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "()V", line = 3010)
    public final void method1190() {
        for (int var1 = 0; var1 < this.field2694; var1++) {
            this.field2669[var1] = -this.field2669[var1];
            this.field2676[var1] = -this.field2676[var1];
        }
        this.field2684.field402 = false;
        this.field2687.field3874 = false;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(ZZZ)Lei;", line = 3022)
    public final class262 method1191(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1200(arg0, arg1, arg2, field2715, field2714);
    }

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "()Z", line = 3025)
    public final boolean method1192() {
        if (this.field2710 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field2694; var1++) {
            this.field2669[var1] <<= 0x4;
            this.field2704[var1] <<= 0x4;
            this.field2676[var1] <<= 0x4;
        }
        field2719 = 0;
        field2720 = 0;
        field2724 = 0;
        return true;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([SI)[S", line = 3050)
    private static final short[] method1193(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class9.method51(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)V", line = 3055)
    public final void method1194(int arg0) {
        if (this.field2709 == null) {
            this.method1159(arg0);
            return;
        }
        int var2 = class170.field2801[arg0];
        int var3 = class170.field2810[arg0];
        for (int var4 = 0; var4 < this.field2694; var4++) {
            int var5 = this.field2676[var4] * var2 + this.field2669[var4] * var3 >> 16;
            this.field2676[var4] = this.field2676[var4] * var3 - this.field2669[var4] * var2 >> 16;
            this.field2669[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field2699; var6++) {
            int var7 = this.field2709[var6] * var3 + this.field2685[var6] * var2 >> 16;
            this.field2685[var6] = (short) (this.field2685[var6] * var3 - this.field2709[var6] * var2 >> 16);
            this.field2709[var6] = (short) var7;
        }
        this.field2684.field402 = false;
        this.field2687.field3874 = false;
        if (this.field2678 != null) {
            this.field2678.field3874 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZZ)Lei;", line = 3097)
    public final class262 method1195(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1200(arg0, arg1, arg2, field2713, field2706);
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(III)V", line = 3102)
    public final void method1196(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2694; var4++) {
            this.field2669[var4] = this.field2669[var4] * arg0 >> 7;
            this.field2704[var4] = this.field2704[var4] * arg1 >> 7;
            this.field2676[var4] = this.field2676[var4] * arg2 >> 7;
        }
        this.field2684.field402 = false;
        this.field2687.field3874 = false;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "()Z", line = 3115)
    public final boolean method35() {
        return this.field2668 && this.field2669 != null && this.field2709 != null;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(SS)V", line = 3121)
    public final void method1197(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2677; var3++) {
            if (this.field2674[var3] == arg0) {
                this.field2674[var3] = arg1;
            }
        }
        this.field2689.field3874 = false;
    }

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "()I", line = 3134)
    public final int method1198() {
        if (!this.field2684.field402) {
            this.method1167();
        }
        return this.field2684.field406;
    }

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "()V", line = 3145)
    private final void method1199() {
        GL var1 = class232.field3716;
        if (this.field2677 == 0) {
            return;
        }
        if (this.field2691 != 0) {
            this.method1201(true, !this.field2687.field3874 && (this.field2691 & 0x1) != 0, !this.field2689.field3874 && (this.field2691 & 0x2) != 0, this.field2678 != null && !this.field2678.field3874 && (this.field2691 & 0x4) != 0, false);
        }
        this.method1201(false, !this.field2687.field3874, !this.field2689.field3874, this.field2678 != null && !this.field2678.field3874, !this.field2701.field3874);
        if (!this.field2686.field3874) {
            this.method1173();
        }
        if (this.field2711 != 0) {
            if ((this.field2711 & 0x1) != 0) {
                this.field2669 = null;
                this.field2704 = null;
                this.field2676 = null;
                this.field2672 = null;
                this.field2670 = null;
            }
            if ((this.field2711 & 0x2) != 0) {
                this.field2674 = null;
                this.field2698 = null;
            }
            if ((this.field2711 & 0x4) != 0) {
                this.field2709 = null;
                this.field2675 = null;
                this.field2685 = null;
                this.field2680 = null;
            }
            if ((this.field2711 & 0x8) != 0) {
                this.field2693 = null;
                this.field2712 = null;
            }
            if ((this.field2711 & 0x10) != 0) {
                this.field2681 = null;
                this.field2703 = null;
                this.field2683 = null;
            }
            this.field2711 = 0;
        }
        class306 var2 = null;
        if (this.field2687.field3876 != null) {
            this.field2687.field3876.method2177();
            var2 = this.field2687.field3876;
            var1.glVertexPointer(3, 5126, this.field2687.field3875, (long) this.field2687.field3868);
        }
        if (this.field2689.field3876 != null) {
            if (this.field2689.field3876 != var2) {
                this.field2689.field3876.method2177();
                var2 = this.field2689.field3876;
            }
            var1.glColorPointer(4, 5121, this.field2689.field3875, (long) this.field2689.field3868);
        }
        if (class322.field4994 && this.field2678.field3876 != null) {
            if (this.field2678.field3876 != var2) {
                this.field2678.field3876.method2177();
                var2 = this.field2678.field3876;
            }
            var1.glNormalPointer(5126, this.field2678.field3875, (long) this.field2678.field3868);
        }
        if (this.field2701.field3876 != null) {
            if (this.field2701.field3876 != var2) {
                this.field2701.field3876.method2177();
                class306 var3 = this.field2701.field3876;
            }
            var1.glTexCoordPointer(2, 5126, this.field2701.field3875, (long) this.field2701.field3868);
        }
        if (this.field2686.field3876 != null) {
            this.field2686.field3876.method2173();
        }
        if (this.field2687.field3876 == null || this.field2689.field3876 == null || class322.field4994 && this.field2678.field3876 == null || this.field2701.field3876 == null) {
            if (class232.field3700) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field2687.field3876 == null) {
                this.field2687.field3873.position(this.field2687.field3868);
                var1.glVertexPointer(3, 5126, this.field2687.field3875, this.field2687.field3873);
            }
            if (this.field2689.field3876 == null) {
                this.field2689.field3873.position(this.field2689.field3868);
                var1.glColorPointer(4, 5121, this.field2689.field3875, this.field2689.field3873);
            }
            if (class322.field4994 && this.field2678.field3876 == null) {
                this.field2678.field3873.position(this.field2678.field3868);
                var1.glNormalPointer(5126, this.field2678.field3875, this.field2678.field3873);
            }
            if (this.field2701.field3876 == null) {
                this.field2701.field3873.position(this.field2701.field3868);
                var1.glTexCoordPointer(2, 5126, this.field2701.field3875, this.field2701.field3873);
            }
        }
        if (this.field2686.field3876 == null && class232.field3700) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field2695.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field2695[var5];
            int var7 = this.field2695[var5 + 1];
            short var8 = this.field2696[var6];
            if (var8 == -1) {
                class232.method1662(-1);
                class179.method1343(0, 0, -3);
            } else {
                class170.field2814.method955(var8 & 0xFFFF, (byte) 75);
            }
            if (this.field2686.field3876 == null) {
                this.field2686.field3873.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field2686.field3873);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZZLjm;Ljm;)Lei;", line = 3316)
    private final class262 method1200(boolean arg0, boolean arg1, boolean arg2, class163 arg3, class163 arg4) {
        arg3.field2694 = this.field2694;
        arg3.field2673 = this.field2673;
        arg3.field2699 = this.field2699;
        arg3.field2677 = this.field2677;
        arg3.field2707 = this.field2707;
        arg3.field2697 = this.field2697;
        arg3.field2691 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field2669 == null || arg3.field2669.length < this.field2694) {
            arg3.field2669 = new int[this.field2694 + 100];
            arg3.field2704 = new int[this.field2694 + 100];
            arg3.field2676 = new int[this.field2694 + 100];
        }
        for (int var6 = 0; var6 < this.field2694; var6++) {
            arg3.field2669[var6] = this.field2669[var6];
            arg3.field2704[var6] = this.field2704[var6];
            arg3.field2676[var6] = this.field2676[var6];
        }
        if (arg3.field2687 == null) {
            arg3.field2687 = new class245();
        }
        arg3.field2687.field3874 = false;
        if (arg3.field2684 == null) {
            arg3.field2684 = new class30();
        }
        arg3.field2684.field402 = false;
        if (arg0) {
            arg3.field2698 = this.field2698;
        } else {
            if (arg4.field2698 == null || arg4.field2698.length < this.field2677) {
                arg4.field2698 = new byte[this.field2677 + 100];
            }
            arg3.field2698 = arg4.field2698;
            for (int var7 = 0; var7 < this.field2677; var7++) {
                arg3.field2698[var7] = this.field2698[var7];
            }
        }
        if (arg1) {
            arg3.field2674 = this.field2674;
        } else {
            if (arg4.field2674 == null || arg4.field2674.length < this.field2677) {
                arg4.field2674 = new short[this.field2677 + 100];
            }
            arg3.field2674 = arg4.field2674;
            for (int var8 = 0; var8 < this.field2677; var8++) {
                arg3.field2674[var8] = this.field2674[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field2689 = this.field2689;
        } else {
            if (arg4.field2689 == null) {
                arg4.field2689 = new class245();
            }
            arg3.field2689 = arg4.field2689;
            arg3.field2689.field3874 = false;
        }
        if (arg2 || this.field2709 == null) {
            arg3.field2709 = this.field2709;
            arg3.field2675 = this.field2675;
            arg3.field2685 = this.field2685;
            arg3.field2680 = this.field2680;
            arg3.field2678 = this.field2678;
        } else {
            if (arg4.field2709 == null || arg4.field2709.length < this.field2699) {
                arg4.field2709 = new short[this.field2699 + 100];
                arg4.field2675 = new short[this.field2699 + 100];
                arg4.field2685 = new short[this.field2699 + 100];
                arg4.field2680 = new short[this.field2699 + 100];
            }
            arg3.field2709 = arg4.field2709;
            arg3.field2675 = arg4.field2675;
            arg3.field2685 = arg4.field2685;
            arg3.field2680 = arg4.field2680;
            for (int var9 = 0; var9 < this.field2699; var9++) {
                arg3.field2709[var9] = this.field2709[var9];
                arg3.field2675[var9] = this.field2675[var9];
                arg3.field2685[var9] = this.field2685[var9];
                arg3.field2680[var9] = this.field2680[var9];
            }
            if (class322.field4994) {
                if (arg4.field2678 == null) {
                    arg4.field2678 = new class245();
                }
                arg3.field2678 = arg4.field2678;
                arg3.field2678.field3874 = false;
            } else {
                arg3.field2678 = null;
            }
        }
        arg3.field2693 = this.field2693;
        arg3.field2712 = this.field2712;
        arg3.field2671 = this.field2671;
        arg3.field2710 = this.field2710;
        arg3.field2681 = this.field2681;
        arg3.field2703 = this.field2703;
        arg3.field2683 = this.field2683;
        arg3.field2696 = this.field2696;
        arg3.field2700 = this.field2700;
        arg3.field2708 = this.field2708;
        arg3.field2701 = this.field2701;
        arg3.field2686 = this.field2686;
        arg3.field2695 = this.field2695;
        arg3.field2672 = this.field2672;
        arg3.field2670 = this.field2670;
        arg3.field4178 = this.field4178;
        arg3.field2688 = this.field2688;
        arg3.field2682 = this.field2682;
        return arg3;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZZZZ)V", line = 3469)
    private final void method1201(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field2687.field3868 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field2689.field3868 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field2678.field3868 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field2701.field3868 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field2692.field573.length < this.field2699 * var6) {
            field2692 = new class44((this.field2699 + 100) * var6);
        } else {
            field2692.field586 = 0;
        }
        if (arg1) {
            if (class232.field3718) {
                for (int var7 = 0; var7 < this.field2673; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field2669[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field2704[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field2676[var7]);
                    int var11 = this.field2670[var7];
                    int var12 = this.field2670[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field2672[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field2692.field586 = var6 * var14;
                        field2692.method283((byte) -51, var8);
                        field2692.method283((byte) -51, var9);
                        field2692.method283((byte) -51, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field2673; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field2669[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field2704[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field2676[var15]);
                    int var19 = this.field2670[var15];
                    int var20 = this.field2670[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field2672[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field2692.field586 = var6 * var22;
                        field2692.method258(var16, (byte) 40);
                        field2692.method258(var17, (byte) 40);
                        field2692.method258(var18, (byte) 40);
                    }
                }
            }
        }
        if (arg2) {
            if (class322.field4994) {
                for (int var42 = 0; var42 < this.field2677; var42++) {
                    int var43 = method1151(this.field2674[var42], this.field2696[var42], this.field2707, this.field2698[var42]);
                    field2692.field586 = this.field2681[var42] * var6 + this.field2689.field3868;
                    field2692.method283((byte) -51, var43);
                    field2692.field586 = this.field2703[var42] * var6 + this.field2689.field3868;
                    field2692.method283((byte) -51, var43);
                    field2692.field586 = this.field2683[var42] * var6 + this.field2689.field3868;
                    field2692.method283((byte) -51, var43);
                }
            } else {
                int var23 = (int) class87.field1206[0];
                int var24 = (int) class87.field1206[1];
                int var25 = (int) class87.field1206[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field2707 * 1.3F);
                int var28 = this.field2697 * var26 >> 8;
                for (int var29 = 0; var29 < this.field2677; var29++) {
                    short var30 = this.field2681[var29];
                    short var31 = this.field2680[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field2685[var30] * var25 + this.field2709[var30] * var23 + this.field2675[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field2685[var30] * var25 + this.field2709[var30] * var23 + this.field2675[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field2680[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field2703[var29];
                    short var34 = this.field2680[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field2685[var33] * var25 + this.field2709[var33] * var23 + this.field2675[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field2685[var33] * var25 + this.field2709[var33] * var23 + this.field2675[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field2680[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field2683[var29];
                    short var37 = this.field2680[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field2685[var36] * var25 + this.field2709[var36] * var23 + this.field2675[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field2685[var36] * var25 + this.field2709[var36] * var23 + this.field2675[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field2680[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1151(this.field2674[var29], this.field2696[var29], var32, this.field2698[var29]);
                    int var40 = method1151(this.field2674[var29], this.field2696[var29], var35, this.field2698[var29]);
                    int var41 = method1151(this.field2674[var29], this.field2696[var29], var38, this.field2698[var29]);
                    field2692.field586 = var6 * var30 + this.field2689.field3868;
                    field2692.method283((byte) -51, var39);
                    field2692.field586 = var6 * var33 + this.field2689.field3868;
                    field2692.method283((byte) -51, var40);
                    field2692.field586 = var6 * var36 + this.field2689.field3868;
                    field2692.method283((byte) -51, var41);
                }
                this.field2709 = null;
                this.field2675 = null;
                this.field2685 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field2697;
            float var45 = 3.0F / (float) (this.field2697 / 2 + this.field2697);
            field2692.field586 = this.field2678.field3868;
            if (class232.field3718) {
                for (int var46 = 0; var46 < this.field2699; var46++) {
                    short var47 = this.field2680[var46];
                    if (var47 == 0) {
                        field2692.method230(-124, (float) this.field2709[var46] * var45);
                        field2692.method230(-120, (float) this.field2675[var46] * var45);
                        field2692.method230(-126, (float) this.field2685[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field2692.method230(-122, (float) this.field2709[var46] * var48);
                        field2692.method230(-123, (float) this.field2675[var46] * var48);
                        field2692.method230(-121, (float) this.field2685[var46] * var48);
                    }
                    field2692.field586 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field2699; var49++) {
                    short var50 = this.field2680[var49];
                    if (var50 == 0) {
                        field2692.method252(7284, (float) this.field2709[var49] * var45);
                        field2692.method252(7284, (float) this.field2675[var49] * var45);
                        field2692.method252(7284, (float) this.field2685[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field2692.method252(7284, (float) this.field2709[var49] * var51);
                        field2692.method252(7284, (float) this.field2675[var49] * var51);
                        field2692.method252(7284, (float) this.field2685[var49] * var51);
                    }
                    field2692.field586 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field2692.field586 = this.field2701.field3868;
            if (class232.field3718) {
                for (int var52 = 0; var52 < this.field2699; var52++) {
                    field2692.method230(-123, this.field2693[var52]);
                    field2692.method230(-120, this.field2712[var52]);
                    field2692.field586 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field2699; var53++) {
                    field2692.method252(7284, this.field2693[var53]);
                    field2692.method252(7284, this.field2712[var53]);
                    field2692.field586 += var6 - 8;
                }
            }
        }
        field2692.field586 = this.field2699 * var6;
        if (arg0) {
            if (class232.field3723) {
                ByteBuffer var54 = ByteBuffer.wrap(field2692.field573, 0, field2692.field586);
                if (this.field2679 == null) {
                    this.field2679 = new class306(true);
                    this.field2679.method2175(var54);
                } else {
                    this.field2679.method2176(var54);
                }
                if (arg1) {
                    this.field2687.field3874 = true;
                    this.field2687.field3873 = null;
                    this.field2687.field3876 = this.field2679;
                    this.field2687.field3875 = var6;
                }
                if (arg2) {
                    this.field2689.field3874 = true;
                    this.field2689.field3873 = null;
                    this.field2689.field3876 = this.field2679;
                    this.field2689.field3875 = var6;
                }
                if (arg3) {
                    this.field2678.field3874 = true;
                    this.field2678.field3873 = null;
                    this.field2678.field3876 = this.field2679;
                    this.field2678.field3875 = var6;
                }
                if (arg4) {
                    this.field2701.field3874 = true;
                    this.field2701.field3873 = null;
                    this.field2701.field3876 = this.field2679;
                    this.field2701.field3875 = var6;
                }
            } else {
                if (field2705 == null || field2705.capacity() < field2692.field586) {
                    field2705 = ByteBuffer.allocateDirect(var6 * 100 + field2692.field586);
                } else {
                    field2705.clear();
                }
                field2705.put(field2692.field573, 0, field2692.field586);
                field2705.flip();
                if (arg1) {
                    this.field2687.field3874 = true;
                    this.field2687.field3873 = field2705;
                    this.field2687.field3876 = null;
                    this.field2687.field3875 = var6;
                }
                if (arg2) {
                    this.field2689.field3874 = true;
                    this.field2689.field3873 = field2705;
                    this.field2687.field3876 = null;
                    this.field2689.field3875 = var6;
                }
                if (arg3) {
                    this.field2678.field3874 = true;
                    this.field2678.field3873 = field2705;
                    this.field2678.field3876 = null;
                    this.field2678.field3875 = var6;
                }
                if (arg4) {
                    this.field2701.field3874 = true;
                    this.field2701.field3873 = field2705;
                    this.field2701.field3876 = null;
                    this.field2701.field3875 = var6;
                }
            }
        } else if (class232.field3700) {
            class306 var55 = new class306();
            ByteBuffer var56 = ByteBuffer.wrap(field2692.field573, 0, field2692.field586);
            var55.method2175(var56);
            if (arg1) {
                this.field2687.field3874 = true;
                this.field2687.field3873 = null;
                this.field2687.field3876 = var55;
                this.field2687.field3875 = var6;
            }
            if (arg2) {
                this.field2689.field3874 = true;
                this.field2689.field3873 = null;
                this.field2689.field3876 = var55;
                this.field2689.field3875 = var6;
            }
            if (arg3) {
                this.field2678.field3874 = true;
                this.field2678.field3873 = null;
                this.field2678.field3876 = var55;
                this.field2678.field3875 = var6;
            }
            if (arg4) {
                this.field2701.field3874 = true;
                this.field2701.field3873 = null;
                this.field2701.field3876 = var55;
                this.field2701.field3875 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field2692.field586);
            var57.put(field2692.field573, 0, field2692.field586);
            var57.flip();
            if (arg1) {
                this.field2687.field3874 = true;
                this.field2687.field3873 = var57;
                this.field2687.field3876 = null;
                this.field2687.field3875 = var6;
            }
            if (arg2) {
                this.field2689.field3874 = true;
                this.field2689.field3873 = var57;
                this.field2687.field3876 = null;
                this.field2689.field3875 = var6;
            }
            if (arg3) {
                this.field2678.field3874 = true;
                this.field2678.field3873 = var57;
                this.field2678.field3876 = null;
                this.field2678.field3875 = var6;
            }
            if (arg4) {
                this.field2701.field3874 = true;
                this.field2701.field3873 = var57;
                this.field2701.field3876 = null;
                this.field2701.field3875 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[IIIIZ)V", line = 3998)
    public final void method1202(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field2719 = 0;
            field2720 = 0;
            field2724 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field2710.length) {
                    int[] var14 = this.field2710[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field2719 += this.field2669[var16];
                        field2720 += this.field2704[var16];
                        field2724 += this.field2676[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field2719 = field2719 / var11 + var8;
                field2720 = field2720 / var11 + var9;
                field2724 = field2724 / var11 + var10;
            } else {
                field2719 = var8;
                field2720 = var9;
                field2724 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field2710.length) {
                    int[] var22 = this.field2710[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field2669[var24] += var17;
                        this.field2704[var24] += var18;
                        this.field2676[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2710.length) {
                    int[] var27 = this.field2710[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field2669[var29] -= field2719;
                        this.field2704[var29] -= field2720;
                        this.field2676[var29] -= field2724;
                        if (arg4 != 0) {
                            int var30 = class170.field2801[arg4];
                            int var31 = class170.field2810[arg4];
                            int var32 = this.field2704[var29] * var30 + this.field2669[var29] * var31 + 32767 >> 16;
                            this.field2704[var29] = this.field2704[var29] * var31 + 32767 - this.field2669[var29] * var30 >> 16;
                            this.field2669[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class170.field2801[arg2];
                            int var34 = class170.field2810[arg2];
                            int var35 = this.field2704[var29] * var34 + 32767 - this.field2676[var29] * var33 >> 16;
                            this.field2676[var29] = this.field2704[var29] * var33 + this.field2676[var29] * var34 + 32767 >> 16;
                            this.field2704[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class170.field2801[arg3];
                            int var37 = class170.field2810[arg3];
                            int var38 = this.field2676[var29] * var36 + this.field2669[var29] * var37 + 32767 >> 16;
                            this.field2676[var29] = this.field2676[var29] * var37 + 32767 - this.field2669[var29] * var36 >> 16;
                            this.field2669[var29] = var38;
                        }
                        this.field2669[var29] += field2719;
                        this.field2704[var29] += field2720;
                        this.field2676[var29] += field2724;
                    }
                }
            }
            if (arg5 && this.field2709 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field2710.length) {
                        int[] var41 = this.field2710[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field2670[var43];
                            int var45 = this.field2670[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field2672[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class170.field2801[arg4];
                                    int var49 = class170.field2810[arg4];
                                    int var50 = this.field2709[var47] * var49 + this.field2675[var47] * var48 + 32767 >> 16;
                                    this.field2675[var47] = (short) (this.field2675[var47] * var49 + 32767 - this.field2709[var47] * var48 >> 16);
                                    this.field2709[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class170.field2801[arg2];
                                    int var52 = class170.field2810[arg2];
                                    int var53 = this.field2675[var47] * var52 + 32767 - this.field2685[var47] * var51 >> 16;
                                    this.field2685[var47] = (short) (this.field2685[var47] * var52 + this.field2675[var47] * var51 + 32767 >> 16);
                                    this.field2675[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class170.field2801[arg3];
                                    int var55 = class170.field2810[arg3];
                                    int var56 = this.field2709[var47] * var55 + this.field2685[var47] * var54 + 32767 >> 16;
                                    this.field2685[var47] = (short) (this.field2685[var47] * var55 + 32767 - this.field2709[var47] * var54 >> 16);
                                    this.field2709[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field2678 != null) {
                    this.field2678.field3874 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field2710.length) {
                    int[] var59 = this.field2710[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field2669[var61] -= field2719;
                        this.field2704[var61] -= field2720;
                        this.field2676[var61] -= field2724;
                        this.field2669[var61] = this.field2669[var61] * arg2 >> 7;
                        this.field2704[var61] = this.field2704[var61] * arg3 >> 7;
                        this.field2676[var61] = this.field2676[var61] * arg4 >> 7;
                        this.field2669[var61] += field2719;
                        this.field2704[var61] += field2720;
                        this.field2676[var61] += field2724;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2708 != null && this.field2698 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field2708.length) {
                        int[] var64 = this.field2708[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field2698[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field2698[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field2689.field3874 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field2708 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field2708.length) {
                    int[] var70 = this.field2708[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field2674[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field2674[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field2689.field3874 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lrg;)Lrg;", line = 4405)
    public final class326 method1203(class326 arg0) {
        if (this.field2699 == 0) {
            return null;
        }
        if (!this.field2684.field402) {
            this.method1167();
        }
        int var2;
        int var3;
        if (class87.field1207 > 0) {
            var2 = this.field2684.field401 - (class87.field1207 * this.field2684.field406 >> 8) >> 3;
            var3 = this.field2684.field404 - (class87.field1207 * this.field2684.field403 >> 8) >> 3;
        } else {
            var2 = this.field2684.field401 - (class87.field1207 * this.field2684.field403 >> 8) >> 3;
            var3 = this.field2684.field404 - (class87.field1207 * this.field2684.field406 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class87.field1205 > 0) {
            var4 = this.field2684.field407 - (class87.field1205 * this.field2684.field406 >> 8) >> 3;
            var5 = this.field2684.field405 - (class87.field1205 * this.field2684.field403 >> 8) >> 3;
        } else {
            var4 = this.field2684.field407 - (class87.field1205 * this.field2684.field403 >> 8) >> 3;
            var5 = this.field2684.field405 - (class87.field1205 * this.field2684.field406 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class326 var8;
        if (arg0 == null || arg0.field5044.length < var6 * var7) {
            var8 = new class326(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field4154 = arg0.field4163 = var6;
            arg0.field4158 = arg0.field4155 = var7;
            arg0.method2285();
        }
        var8.field4161 = var2;
        var8.field4157 = var4;
        if (field2728.length < this.field2699) {
            field2728 = new int[this.field2699];
            field2726 = new int[this.field2699];
        }
        for (int var9 = 0; var9 < this.field2673; var9++) {
            int var10 = (this.field2669[var9] - (this.field2704[var9] * class87.field1207 >> 8) >> 3) - var2;
            int var11 = (this.field2676[var9] - (this.field2704[var9] * class87.field1205 >> 8) >> 3) - var4;
            int var12 = this.field2670[var9];
            int var13 = this.field2670[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field2672[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field2728[var15] = var10;
                field2726[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field2677; var16++) {
            if (this.field2698[var16] <= 128) {
                short var17 = this.field2681[var16];
                short var18 = this.field2703[var16];
                short var19 = this.field2683[var16];
                int var20 = field2728[var17];
                int var21 = field2728[var18];
                int var22 = field2728[var19];
                int var23 = field2726[var17];
                int var24 = field2726[var18];
                int var25 = field2726[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class170.method1242(var8.field5044, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }
}
