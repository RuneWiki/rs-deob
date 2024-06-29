import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class426 extends class336 {

    @OriginalMember(owner = "client!vs", name = "B", descriptor = "I")
    private int field6042 = 0;

    @OriginalMember(owner = "client!vs", name = "rb", descriptor = "I")
    private int field6084 = 0;

    @OriginalMember(owner = "client!vs", name = "N", descriptor = "I")
    private int field6054 = 0;

    @OriginalMember(owner = "client!vs", name = "Yb", descriptor = "I")
    private int field6117 = 0;

    @OriginalMember(owner = "client!vs", name = "jc", descriptor = "I")
    private int field6128 = 0;

    @OriginalMember(owner = "client!vs", name = "gb", descriptor = "Z")
    private boolean field6073 = true;

    @OriginalMember(owner = "client!vs", name = "lc", descriptor = "Z")
    private boolean field6130 = false;

    @OriginalMember(owner = "client!vs", name = "cb", descriptor = "Lbt;")
    private class33 field6069;

    @OriginalMember(owner = "client!vs", name = "Lb", descriptor = "Ljd;")
    private class157 field6104;

    @OriginalMember(owner = "client!vs", name = "Mb", descriptor = "Ljd;")
    private class157 field6105;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "Ljd;")
    private class157 field6034;

    @OriginalMember(owner = "client!vs", name = "mb", descriptor = "Ljd;")
    private class157 field6079;

    @OriginalMember(owner = "client!vs", name = "y", descriptor = "Ljl;")
    private class182 field6039;

    @OriginalMember(owner = "client!vs", name = "ic", descriptor = "I")
    private int field6127;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
    private int field6032;

    @OriginalMember(owner = "client!vs", name = "M", descriptor = "[I")
    private int[] field6053;

    @OriginalMember(owner = "client!vs", name = "kb", descriptor = "[I")
    private int[] field6077;

    @OriginalMember(owner = "client!vs", name = "F", descriptor = "[I")
    private int[] field6046;

    @OriginalMember(owner = "client!vs", name = "Pb", descriptor = "[I")
    private int[] field6108;

    @OriginalMember(owner = "client!vs", name = "gc", descriptor = "[S")
    private short[] field6125;

    @OriginalMember(owner = "client!vs", name = "Rb", descriptor = "[Leh;")
    private class248[] field6110;

    @OriginalMember(owner = "client!vs", name = "qc", descriptor = "[Ltb;")
    private class280[] field6135;

    @OriginalMember(owner = "client!vs", name = "nb", descriptor = "I")
    private int field6080;

    @OriginalMember(owner = "client!vs", name = "zb", descriptor = "[Lwd;")
    private class184[] field6092;

    @OriginalMember(owner = "client!vs", name = "qb", descriptor = "[Lto;")
    private class8[] field6083;

    @OriginalMember(owner = "client!vs", name = "oc", descriptor = "[S")
    private short[] field6133;

    @OriginalMember(owner = "client!vs", name = "vc", descriptor = "[S")
    private short[] field6140;

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "[S")
    private short[] field6033;

    @OriginalMember(owner = "client!vs", name = "Ob", descriptor = "[B")
    private byte[] field6107;

    @OriginalMember(owner = "client!vs", name = "tb", descriptor = "[F")
    private float[] field6086;

    @OriginalMember(owner = "client!vs", name = "Jb", descriptor = "[S")
    private short[] field6102;

    @OriginalMember(owner = "client!vs", name = "tc", descriptor = "[F")
    private float[] field6138;

    @OriginalMember(owner = "client!vs", name = "Y", descriptor = "[S")
    private short[] field6065;

    @OriginalMember(owner = "client!vs", name = "lb", descriptor = "[S")
    private short[] field6078;

    @OriginalMember(owner = "client!vs", name = "fc", descriptor = "[S")
    private short[] field6124;

    @OriginalMember(owner = "client!vs", name = "hc", descriptor = "[S")
    private short[] field6126;

    @OriginalMember(owner = "client!vs", name = "Bb", descriptor = "[S")
    private short[] field6094;

    @OriginalMember(owner = "client!vs", name = "ob", descriptor = "S")
    private short field6081;

    @OriginalMember(owner = "client!vs", name = "jb", descriptor = "[S")
    private short[] field6076;

    @OriginalMember(owner = "client!vs", name = "Sb", descriptor = "S")
    private short field6111;

    @OriginalMember(owner = "client!vs", name = "P", descriptor = "[B")
    private byte[] field6056;

    @OriginalMember(owner = "client!vs", name = "E", descriptor = "[I")
    private int[] field6045;

    @OriginalMember(owner = "client!vs", name = "Vb", descriptor = "[[I")
    private int[][] field6114;

    @OriginalMember(owner = "client!vs", name = "pc", descriptor = "[[I")
    private int[][] field6134;

    @OriginalMember(owner = "client!vs", name = "R", descriptor = "[[I")
    private int[][] field6058;

    @OriginalMember(owner = "client!vs", name = "Ub", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!vs", name = "S", descriptor = "B")
    private byte field6059;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!vs", name = "C", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!vs", name = "D", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!vs", name = "G", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!vs", name = "H", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!vs", name = "I", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!vs", name = "J", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!vs", name = "K", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!vs", name = "L", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!vs", name = "O", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!vs", name = "Q", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!vs", name = "T", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!vs", name = "V", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!vs", name = "W", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!vs", name = "X", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!vs", name = "ab", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!vs", name = "bb", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!vs", name = "db", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!vs", name = "eb", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!vs", name = "hb", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!vs", name = "ib", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!vs", name = "pb", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!vs", name = "sb", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!vs", name = "vb", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!vs", name = "wb", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!vs", name = "xb", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!vs", name = "Ab", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!vs", name = "Cb", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!vs", name = "Db", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!vs", name = "Eb", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!vs", name = "Fb", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!vs", name = "Gb", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!vs", name = "Hb", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!vs", name = "Ib", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!vs", name = "Kb", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!vs", name = "Nb", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!vs", name = "Qb", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!vs", name = "Xb", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!vs", name = "Zb", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!vs", name = "ac", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!vs", name = "bc", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!vs", name = "cc", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!vs", name = "dc", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!vs", name = "ec", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!vs", name = "kc", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!vs", name = "mc", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!vs", name = "nc", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!vs", name = "rc", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!vs", name = "sc", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!vs", name = "uc", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!vs", name = "wc", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!vs", name = "fb", descriptor = "Lus;")
    private class1 field6072;

    @OriginalMember(owner = "client!vs", name = "yb", descriptor = "Lvn;")
    private class209 field6091;

    @OriginalMember(owner = "client!vs", name = "U", descriptor = "Lwk;")
    private class97 field6061;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "S")
    private short field6031;

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "S")
    private short field6040;

    @OriginalMember(owner = "client!vs", name = "A", descriptor = "S")
    private short field6041;

    @OriginalMember(owner = "client!vs", name = "Z", descriptor = "S")
    private short field6066;

    @OriginalMember(owner = "client!vs", name = "ub", descriptor = "S")
    private short field6087;

    @OriginalMember(owner = "client!vs", name = "Tb", descriptor = "S")
    private short field6112;

    @OriginalMember(owner = "client!vs", name = "Wb", descriptor = "S")
    private short field6115;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IILn;Z)Z")
    public final boolean method1131(int arg0, int arg1, class15 arg2, boolean arg3) {
        field6055++;
        class530 var5 = (class530) arg2;
        class530 var6 = this.field6069.field654;
        float var7 = var5.field7819 * var6.field7809 + var5.field7806 * var6.field7822 + var5.field7797 * var6.field7821 + var6.field7806;
        float var8 = var5.field7819 * var6.field7807 + var5.field7806 * var6.field7817 + var5.field7797 * var6.field7804 + var6.field7797;
        class97.field1530 = var5.field7796 * var6.field7807 + var5.field7809 * var6.field7817 + var5.field7807 * var6.field7804;
        class486.field7049 = var5.field7816 * var6.field7807 + var5.field7822 * var6.field7817 + var5.field7817 * var6.field7804;
        class211.field3184 = var5.field7816 * var6.field7796 + var5.field7822 * var6.field7816 + var5.field7817 * var6.field7814;
        class153.field2327 = var5.field7814 * var6.field7796 + var5.field7821 * var6.field7816 + var5.field7804 * var6.field7814;
        class491.field7078 = var5.field7796 * var6.field7796 + var5.field7809 * var6.field7816 + var5.field7807 * var6.field7814;
        class128.field2004 = var5.field7814 * var6.field7809 + var5.field7821 * var6.field7822 + var5.field7804 * var6.field7821;
        float var9 = var5.field7819 * var6.field7796 + var5.field7806 * var6.field7816 + var5.field7797 * var6.field7814 + var6.field7819;
        class304.field4505 = var5.field7814 * var6.field7807 + var5.field7821 * var6.field7817 + var5.field7804 * var6.field7804;
        class317.field4717 = var5.field7796 * var6.field7809 + var5.field7809 * var6.field7822 + var5.field7807 * var6.field7821;
        class184.field2727 = var5.field7816 * var6.field7809 + var5.field7822 * var6.field7822 + var5.field7817 * var6.field7821;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field6069.field727;
        int var16 = this.field6069.field741;
        if (!this.field6130) {
            this.method2536(30);
        }
        class332.field4923[0] = this.field6087;
        class242.field3637[0] = this.field6115;
        class332.field4923[1] = this.field6112;
        class515.field7470[0] = this.field6041;
        class242.field3637[1] = this.field6115;
        class515.field7470[1] = this.field6041;
        class332.field4923[2] = this.field6087;
        class242.field3637[2] = this.field6040;
        class332.field4923[3] = this.field6112;
        class515.field7470[2] = this.field6041;
        class242.field3637[3] = this.field6040;
        class515.field7470[3] = this.field6041;
        class332.field4923[4] = this.field6087;
        class242.field3637[4] = this.field6115;
        class332.field4923[5] = this.field6112;
        class515.field7470[4] = this.field6031;
        class242.field3637[5] = this.field6115;
        class332.field4923[6] = this.field6087;
        class515.field7470[5] = this.field6031;
        class242.field3637[6] = this.field6040;
        class332.field4923[7] = this.field6112;
        class515.field7470[6] = this.field6031;
        class242.field3637[7] = this.field6040;
        class515.field7470[7] = this.field6031;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class242.field3637[var17];
            float var39 = (float) class332.field4923[var17];
            float var40 = (float) class515.field7470[var17];
            float var41 = class317.field4717 * var40 + class184.field2727 * var39 + class128.field2004 * var38 + var7;
            float var42 = class491.field7078 * var40 + class211.field3184 * var39 + class153.field2327 * var38 + var9;
            float var43 = class97.field1530 * var40 + class486.field7049 * var39 + class304.field4505 * var38 + var8;
            if ((float) this.field6069.field748 <= var42) {
                float var44 = (float) var15 * var41 / var42 + (float) this.field6069.field666;
                float var45 = (float) var16 * var43 / var42 + (float) this.field6069.field714;
                if (var11 > var44) {
                    var11 = var44;
                }
                if (var12 < var44) {
                    var12 = var44;
                }
                if (var14 < var45) {
                    var14 = var45;
                }
                if (var45 < var13) {
                    var13 = var45;
                }
                var10 = true;
            }
        }
        if (var10 && var11 < (float) arg0 && (float) arg0 < var12 && var13 < (float) arg1 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field6069.field765.length < this.field6128) {
                this.field6069.field764 = new int[this.field6128];
                this.field6069.field765 = new int[this.field6128];
            }
            int[] var18 = this.field6069.field765;
            int[] var19 = this.field6069.field764;
            for (int var20 = 0; var20 < this.field6054; var20++) {
                float var22 = (float) this.field6077[var20];
                float var23 = (float) this.field6046[var20];
                float var24 = (float) this.field6108[var20];
                float var25 = class491.field7078 * var23 + class211.field3184 * var22 + class153.field2327 * var24 + var9;
                float var26 = class97.field1530 * var23 + class486.field7049 * var22 + class304.field4505 * var24 + var8;
                float var27 = class317.field4717 * var23 + class184.field2727 * var22 + class128.field2004 * var24 + var7;
                if (var25 >= (float) this.field6069.field748) {
                    int var28 = (int) ((float) var15 * var27 / var25 + (float) this.field6069.field666);
                    int var29 = (int) ((float) var16 * var26 / var25 + (float) this.field6069.field714);
                    int var30 = this.field6053[var20];
                    int var31 = this.field6053[var20 + 1];
                    for (int var32 = var30; var32 < var31; var32++) {
                        int var33 = this.field6078[var32] - 1;
                        if (var33 == -1) {
                            break;
                        }
                        var18[var33] = var28;
                        var19[var33] = var29;
                    }
                } else {
                    int var34 = this.field6053[var20];
                    int var35 = this.field6053[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field6078[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[this.field6078[var36] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field6117; var21++) {
                if (var18[this.field6065[var21]] != -999999 && var18[this.field6076[var21]] != -999999 && var18[this.field6094[var21]] != -999999 && this.method2540(0, var18[this.field6094[var21]], arg1, var19[this.field6076[var21]], var19[this.field6094[var21]], var19[this.field6065[var21]], var18[this.field6065[var21]], var18[this.field6076[var21]], arg0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "(IILo;Lo;III)V")
    public final void method1165(int arg0, int arg1, class24 arg2, class24 arg3, int arg4, int arg5, int arg6) {
        if (!this.field6130) {
            this.method2536(59);
        }
        field6095++;
        int var8 = this.field6087 + arg4;
        int var9 = this.field6112 + arg4;
        int var10 = this.field6041 + arg6;
        int var11 = this.field6031 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field347 <= arg2.field346 + var9 >> arg2.field345 || var10 < 0 || arg2.field350 <= (arg2.field346 + var11 >> arg2.field345)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field347 <= (var9 + arg3.field346 >> arg3.field345) || var10 < 0 || arg3.field346 + var11 >> arg3.field345 >= arg3.field350) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field345;
            int var13 = arg2.field346 - (1 - var9) >> arg2.field345;
            int var14 = var10 >> arg2.field345;
            int var15 = var11 + arg2.field346 - 1 >> arg2.field345;
            if (arg2.method156(var12, var14) == arg5 && arg2.method156(var13, var14) == arg5 && arg2.method156(var12, var15) == arg5 && arg2.method156(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field6054; var32++) {
                this.field6108[var32] -= arg5 - arg2.method143(this.field6077[var32] + arg4, this.field6046[var32] + arg6);
            }
        } else if (arg0 == 2) {
            short var29 = this.field6115;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field6054; var30++) {
                int var31 = (this.field6108[var30] << 16) / var29;
                if (arg1 > var31) {
                    this.field6108[var30] -= -((arg2.method143(this.field6077[var30] + arg4, this.field6046[var30] + arg6) - arg5) * (arg1 - var31) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var25 = (arg1 & 0xFF) * 4;
            int var26 = (arg1 >> 8 & 0xFF) * 4;
            int var27 = (arg1 >> 16 & 0xFF) << 6;
            int var28 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var25 >> 1)) < 0 || arg2.field347 << arg2.field345 <= (var25 >> 1) + arg2.field346 + arg4 || (arg6 - (var26 >> 1)) < 0 || (arg2.field350 << arg2.field345) <= ((var26 >> 1) + (arg6 + arg2.field346))) {
                return;
            }
            this.method2127(arg2, var26, var28, arg6, arg4, var25, (byte) -95, var27, arg5);
        } else if (arg0 == 4) {
            int var23 = this.field6040 - this.field6115;
            for (int var24 = 0; var24 < this.field6054; var24++) {
                this.field6108[var24] = this.field6108[var24] + arg3.method143(this.field6077[var24] + arg4, this.field6046[var24] + arg6) + var23 - arg5;
            }
        } else if (arg0 == 5) {
            int var16 = this.field6040 - this.field6115;
            for (int var17 = 0; var17 < this.field6054; var17++) {
                int var18 = this.field6077[var17] + arg4;
                int var19 = this.field6046[var17] + arg6;
                int var20 = arg2.method143(var18, var19);
                int var21 = arg3.method143(var18, var19);
                int var22 = var20 - arg1 - var21;
                this.field6108[var17] = ((this.field6108[var17] << 8) / var16 * var22 >> 8) - (arg5 - var20);
            }
        }
        if (this.field6104 != null) {
            this.field6104.field2398 = null;
        }
        this.field6130 = false;
    }

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "()[Ltb;")
    public final class280[] method1144() {
        field6103++;
        return this.field6135;
    }

    @OriginalMember(owner = "client!vs", name = "B", descriptor = "(I)V")
    public final void method1133(int arg0) {
        field6050++;
        this.field6127 = arg0;
        this.field6073 = true;
        if (this.field6061 != null && (this.field6127 & 0x10000) == 0) {
            this.field6056 = this.field6061.field1536;
            this.field6033 = this.field6061.field1531;
            this.field6133 = this.field6061.field1535;
            this.field6124 = this.field6061.field1537;
            this.field6061 = null;
        }
        this.method2529((byte) 125);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BLvs;Lvs;ZZI)Lka;")
    private final class336 method2526(byte arg0, class426 arg1, class426 arg2, boolean arg3, boolean arg4, int arg5) {
        arg2.field6117 = this.field6117;
        arg2.field6042 = this.field6042;
        arg2.field6084 = this.field6084;
        arg2.field6127 = arg5;
        field6082++;
        arg2.field6080 = this.field6080;
        arg2.field6128 = this.field6128;
        if (arg0 != 49) {
            this.method2540(-31, 32, -93, -16, -35, -99, -74, -94, 12);
        }
        arg2.field6111 = this.field6111;
        arg2.field6059 = 0;
        arg2.field6054 = this.field6054;
        arg2.field6032 = this.field6032;
        arg2.field6081 = this.field6081;
        boolean var7 = class463.method2749(arg5, this.field6032, 88);
        boolean var8 = class513.method2999(arg5, (byte) -72, this.field6032);
        boolean var9 = class431.method2551(-3, this.field6032, arg5);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg2.field6077 = this.field6077;
            } else if (arg1.field6077 == null || arg1.field6077.length < this.field6042) {
                arg2.field6077 = arg1.field6077 = new int[this.field6042];
            } else {
                arg2.field6077 = arg1.field6077;
            }
            if (!var8) {
                arg2.field6108 = this.field6108;
            } else if (arg1.field6108 == null || this.field6042 > arg1.field6108.length) {
                arg2.field6108 = arg1.field6108 = new int[this.field6042];
            } else {
                arg2.field6108 = arg1.field6108;
            }
            if (!var9) {
                arg2.field6046 = this.field6046;
            } else if (arg1.field6046 == null || this.field6042 > arg1.field6046.length) {
                arg2.field6046 = arg1.field6046 = new int[this.field6042];
            } else {
                arg2.field6046 = arg1.field6046;
            }
            for (int var11 = 0; var11 < this.field6042; var11++) {
                if (var7) {
                    arg2.field6077[var11] = this.field6077[var11];
                }
                if (var8) {
                    arg2.field6108[var11] = this.field6108[var11];
                }
                if (var9) {
                    arg2.field6046[var11] = this.field6046[var11];
                }
            }
        } else {
            arg2.field6108 = this.field6108;
            arg2.field6046 = this.field6046;
            arg2.field6077 = this.field6077;
        }
        if (class409.method2431(this.field6032, arg5, true)) {
            arg2.field6104 = arg1.field6104;
            if (arg4) {
                arg2.field6059 = (byte) (arg2.field6059 | 0x1);
            }
            arg2.field6104.field2398 = this.field6104.field2398;
            arg2.field6104.field2399 = this.field6104.field2399;
        } else if (class514.method3003((byte) -109, arg5, this.field6032)) {
            arg2.field6104 = this.field6104;
        } else {
            arg2.field6104 = null;
        }
        if (class375.method2293(this.field6032, (byte) -6, arg5)) {
            if (arg1.field6102 == null || arg1.field6102.length < this.field6117) {
                arg2.field6102 = arg1.field6102 = new short[this.field6117];
            } else {
                arg2.field6102 = arg1.field6102;
            }
            for (int var12 = 0; var12 < this.field6117; var12++) {
                arg2.field6102[var12] = this.field6102[var12];
            }
        } else {
            arg2.field6102 = this.field6102;
        }
        if (class431.method2557(this.field6032, false, arg5)) {
            if (arg1.field6107 == null || arg1.field6107.length < this.field6117) {
                arg2.field6107 = arg1.field6107 = new byte[this.field6117];
            } else {
                arg2.field6107 = arg1.field6107;
            }
            for (int var13 = 0; var13 < this.field6117; var13++) {
                arg2.field6107[var13] = this.field6107[var13];
            }
        } else {
            arg2.field6107 = this.field6107;
        }
        if (class437.method2573(this.field6032, (byte) 89, arg5)) {
            if (arg4) {
                arg2.field6059 = (byte) (arg2.field6059 | 0x2);
            }
            arg2.field6079 = arg1.field6079;
            arg2.field6079.field2398 = this.field6079.field2398;
            arg2.field6079.field2399 = this.field6079.field2399;
        } else if (class294.method1896(this.field6032, arg5, 258)) {
            arg2.field6079 = this.field6079;
        } else {
            arg2.field6079 = null;
        }
        if (class350.method2203(this.field6032, 0, arg5)) {
            if (arg1.field6033 == null || arg1.field6033.length < this.field6128) {
                int var14 = this.field6128;
                arg2.field6124 = arg1.field6124 = new short[var14];
                arg2.field6033 = arg1.field6033 = new short[var14];
                arg2.field6133 = arg1.field6133 = new short[var14];
            } else {
                arg2.field6124 = arg1.field6124;
                arg2.field6033 = arg1.field6033;
                arg2.field6133 = arg1.field6133;
            }
            if (this.field6061 == null) {
                for (int var18 = 0; var18 < this.field6128; var18++) {
                    arg2.field6033[var18] = this.field6033[var18];
                    arg2.field6133[var18] = this.field6133[var18];
                    arg2.field6124[var18] = this.field6124[var18];
                }
            } else {
                if (arg1.field6061 == null) {
                    arg1.field6061 = new class97();
                }
                class97 var15 = arg2.field6061 = arg1.field6061;
                if (var15.field1531 == null || var15.field1531.length < this.field6128) {
                    int var16 = this.field6128;
                    var15.field1531 = new short[var16];
                    var15.field1536 = new byte[var16];
                    var15.field1535 = new short[var16];
                    var15.field1537 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field6128; var17++) {
                    arg2.field6033[var17] = this.field6033[var17];
                    arg2.field6133[var17] = this.field6133[var17];
                    arg2.field6124[var17] = this.field6124[var17];
                    var15.field1531[var17] = this.field6061.field1531[var17];
                    var15.field1535[var17] = this.field6061.field1535[var17];
                    var15.field1537[var17] = this.field6061.field1537[var17];
                    var15.field1536[var17] = this.field6061.field1536[var17];
                }
            }
            arg2.field6056 = this.field6056;
        } else {
            arg2.field6033 = this.field6033;
            arg2.field6056 = this.field6056;
            arg2.field6133 = this.field6133;
            arg2.field6061 = this.field6061;
            arg2.field6124 = this.field6124;
        }
        if (class358.method2221(arg5, 99, this.field6032)) {
            arg2.field6034 = arg1.field6034;
            if (arg4) {
                arg2.field6059 = (byte) (arg2.field6059 | 0x4);
            }
            arg2.field6034.field2398 = this.field6034.field2398;
            arg2.field6034.field2399 = this.field6034.field2399;
        } else if (class508.method2963(this.field6032, 0, arg5)) {
            arg2.field6034 = this.field6034;
        } else {
            arg2.field6034 = null;
        }
        if (class355.method2212(this.field6032, -88, arg5)) {
            if (arg1.field6138 == null || this.field6117 > arg1.field6138.length) {
                int var19 = this.field6128;
                arg2.field6086 = arg1.field6086 = new float[var19];
                arg2.field6138 = arg1.field6138 = new float[var19];
            } else {
                arg2.field6138 = arg1.field6138;
                arg2.field6086 = arg1.field6086;
            }
            for (int var20 = 0; var20 < this.field6128; var20++) {
                arg2.field6138[var20] = this.field6138[var20];
                arg2.field6086[var20] = this.field6086[var20];
            }
        } else {
            arg2.field6138 = this.field6138;
            arg2.field6086 = this.field6086;
        }
        if (class259.method1669(this.field6032, arg5, -15209)) {
            if (arg4) {
                arg2.field6059 = (byte) (arg2.field6059 | 0x8);
            }
            arg2.field6105 = arg1.field6105;
            arg2.field6105.field2398 = this.field6105.field2398;
            arg2.field6105.field2399 = this.field6105.field2399;
        } else if (class49.method443(this.field6032, arg5, arg0 - 1600)) {
            arg2.field6105 = this.field6105;
        } else {
            arg2.field6105 = null;
        }
        if (class227.method1523(16, arg5, this.field6032)) {
            if (arg1.field6065 == null || arg1.field6065.length < this.field6117) {
                int var21 = this.field6117;
                arg2.field6094 = arg1.field6094 = new short[var21];
                arg2.field6076 = arg1.field6076 = new short[var21];
                arg2.field6065 = arg1.field6065 = new short[var21];
            } else {
                arg2.field6065 = arg1.field6065;
                arg2.field6094 = arg1.field6094;
                arg2.field6076 = arg1.field6076;
            }
            for (int var22 = 0; var22 < this.field6117; var22++) {
                arg2.field6065[var22] = this.field6065[var22];
                arg2.field6076[var22] = this.field6076[var22];
                arg2.field6094[var22] = this.field6094[var22];
            }
        } else {
            arg2.field6094 = this.field6094;
            arg2.field6076 = this.field6076;
            arg2.field6065 = this.field6065;
        }
        if (class344.method2180(this.field6032, (byte) -127, arg5)) {
            if (arg4) {
                arg2.field6059 = (byte) (arg2.field6059 | 0x10);
            }
            arg2.field6039 = arg1.field6039;
            arg2.field6039.field2681 = this.field6039.field2681;
        } else if (class332.method2100(arg5, (byte) -67, this.field6032)) {
            arg2.field6039 = this.field6039;
        } else {
            arg2.field6039 = null;
        }
        if (class221.method1504(this.field6032, arg5, (byte) -112)) {
            if (arg1.field6126 == null || this.field6117 > arg1.field6126.length) {
                int var23 = this.field6117;
                arg2.field6126 = arg1.field6126 = new short[var23];
            } else {
                arg2.field6126 = arg1.field6126;
            }
            for (int var24 = 0; var24 < this.field6117; var24++) {
                arg2.field6126[var24] = this.field6126[var24];
            }
        } else {
            arg2.field6126 = this.field6126;
        }
        if (!class159.method1116(arg5, 1408, this.field6032)) {
            arg2.field6092 = this.field6092;
        } else if (arg1.field6092 == null || this.field6080 > arg1.field6092.length) {
            int var26 = this.field6080;
            arg2.field6092 = arg1.field6092 = new class184[var26];
            for (int var27 = 0; var27 < this.field6080; var27++) {
                arg2.field6092[var27] = this.field6092[var27].method1274((byte) -85);
            }
        } else {
            arg2.field6092 = arg1.field6092;
            for (int var25 = 0; var25 < this.field6080; var25++) {
                arg2.field6092[var25].method1277(this.field6092[var25], arg0 ^ 0xFFFFFFB9);
            }
        }
        arg2.field6078 = this.field6078;
        arg2.field6110 = this.field6110;
        arg2.field6053 = this.field6053;
        arg2.field6125 = this.field6125;
        arg2.field6045 = this.field6045;
        arg2.field6134 = this.field6134;
        arg2.field6058 = this.field6058;
        if (this.field6130) {
            arg2.field6040 = this.field6040;
            arg2.field6087 = this.field6087;
            arg2.field6112 = this.field6112;
            arg2.field6031 = this.field6031;
            arg2.field6041 = this.field6041;
            arg2.field6130 = true;
            arg2.field6115 = this.field6115;
            arg2.field6066 = this.field6066;
        } else {
            arg2.field6130 = false;
        }
        arg2.field6083 = this.field6083;
        arg2.field6140 = this.field6140;
        arg2.field6135 = this.field6135;
        arg2.field6114 = this.field6114;
        return arg2;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZIC)I")
    public static final int method2527(boolean arg0, int arg1, char arg2) {
        field6048++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        if (!arg0) {
            field6113 = 19;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vs", name = "ja", descriptor = "()I")
    public final int method1130() {
        if (!this.field6130) {
            this.method2536(14);
        }
        field6131++;
        return this.field6115;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZI)V")
    private final void method2528(boolean arg0, int arg1) {
        field6075++;
        boolean var3 = this.field6079 != null && this.field6079.field2398 == null;
        boolean var4 = this.field6034 != null && this.field6034.field2398 == null;
        boolean var5 = this.field6104 != null && this.field6104.field2398 == null;
        boolean var6 = this.field6105 != null && this.field6105.field2398 == null;
        if (arg0) {
            var3 &= (this.field6059 & 0x2) != 0;
            var6 &= (this.field6059 & 0x8) != 0;
            var5 &= (this.field6059 & 0x1) != 0;
            var4 &= (this.field6059 & 0x4) != 0;
        }
        if (arg1 != -1) {
            return;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        byte var11 = 0;
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field6128 * var7 <= this.field6069.field719.field7545.length) {
            this.field6069.field719.field7558 = 0;
        } else {
            this.field6069.field719 = new class235((this.field6128 + 100) * var7);
        }
        class235 var12 = this.field6069.field719;
        if (var5) {
            if (this.field6069.field713) {
                for (int var13 = 0; var13 < this.field6054; var13++) {
                    int var14 = NativeStream.floatToRawIntBits((float) this.field6077[var13]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field6108[var13]);
                    int var16 = NativeStream.floatToRawIntBits((float) this.field6046[var13]);
                    int var17 = this.field6053[var13];
                    int var18 = this.field6053[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field6078[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field7558 = var7 * var20;
                        var12.method3019(var14, 11648);
                        var12.method3019(var15, 11648);
                        var12.method3019(var16, arg1 ^ 0xFFFFD27F);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field6054; var21++) {
                    int var22 = NativeStream.floatToRawIntBits((float) this.field6077[var21]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field6108[var21]);
                    int var24 = NativeStream.floatToRawIntBits((float) this.field6046[var21]);
                    int var25 = this.field6053[var21];
                    int var26 = this.field6053[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field6078[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field7558 = var7 * var28;
                        var12.method3066(var22, -242752536);
                        var12.method3066(var23, -242752536);
                        var12.method3066(var24, arg1 - 242752535);
                    }
                }
            }
        }
        if (var3) {
            if (this.field6034 == null) {
                short[] var29;
                byte[] var30;
                short[] var31;
                short[] var32;
                if (this.field6061 == null) {
                    var29 = this.field6124;
                    var30 = this.field6056;
                    var31 = this.field6133;
                    var32 = this.field6033;
                } else {
                    var31 = this.field6061.field1535;
                    var29 = this.field6061.field1537;
                    var32 = this.field6061.field1531;
                    var30 = this.field6061.field1536;
                }
                float var33 = this.field6069.field675[0];
                float var34 = this.field6069.field675[1];
                float var35 = this.field6069.field675[2];
                float var36 = this.field6069.field720;
                float var37 = this.field6069.field661 * 768.0F / (float) this.field6111;
                float var38 = this.field6069.field737 * 768.0F / (float) this.field6111;
                for (int var39 = 0; var39 < this.field6117; var39++) {
                    int var40 = this.method2531(this.field6102[var39], this.field6107[var39], this.field6081, this.field6126[var39], true);
                    short var41 = this.field6065[var39];
                    float var42 = (float) (var40 >>> 24) * this.field6069.field646;
                    float var43 = (float) (var40 >> 16 & 0xFF) * this.field6069.field668;
                    float var44 = (float) ((var40 & 0xFFD4) >> 8) * this.field6069.field690;
                    short var45 = (short) var30[var41];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var29[var41] * var35 + (float) var31[var41] * var34 + (float) var32[var41] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var29[var41] * var35 + (float) var31[var41] * var34 + (float) var32[var41] * var33) / (float) (var45 * 256);
                    }
                    float var47 = var36 + ((var46 < 0.0F) ? var38 : var37) * var46;
                    int var48 = (int) (var42 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var43 * var47);
                    int var50 = (int) (var44 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.field7558 = var7 * var41 + var9;
                    var12.method3048(-2034159384, var48);
                    var12.method3048(arg1 ^ 0x793ECF17, var49);
                    var12.method3048(-2034159384, var50);
                    var12.method3048(-2034159384, 255 - (this.field6107[var39] & 0xFF));
                    short var51 = this.field6076[var39];
                    short var52 = (short) var30[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var29[var51] * var35 + (float) var31[var51] * var34 + (float) var32[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var29[var51] * var35 + (float) var31[var51] * var34 + (float) var32[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = var53 * (var53 < 0.0F ? var38 : var37) + var36;
                    int var55 = (int) (var42 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var56 = (int) (var43 * var54);
                    int var57 = (int) (var44 * var54);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    var12.field7558 = var7 * var51 + var9;
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.method3048(-2034159384, var55);
                    var12.method3048(-2034159384, var56);
                    var12.method3048(-2034159384, var57);
                    var12.method3048(arg1 - 2034159383, 255 - (this.field6107[var39] & 0xFF));
                    short var58 = this.field6094[var39];
                    short var59 = (short) var30[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var29[var58] * var35 + (float) var31[var58] * var34 + (float) var32[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var29[var58] * var35 + (float) var31[var58] * var34 + (float) var32[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = ((var60 < 0.0F) ? var38 : var37) * var60 + var36;
                    int var62 = (int) (var42 * var61);
                    int var63 = (int) (var43 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    int var64 = (int) (var44 * var61);
                    var12.field7558 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method3048(-2034159384, var62);
                    var12.method3048(-2034159384, var63);
                    var12.method3048(arg1 ^ 0x793ECF17, var64);
                    var12.method3048(-2034159384, 255 - (this.field6107[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field6117; var65++) {
                    int var66 = this.method2531(this.field6102[var65], this.field6107[var65], this.field6081, this.field6126[var65], true);
                    var12.field7558 = this.field6065[var65] * var7 + var9;
                    var12.method3019(var66, arg1 ^ 0xFFFFD27F);
                    var12.field7558 = this.field6076[var65] * var7 + var9;
                    var12.method3019(var66, 11648);
                    var12.field7558 = this.field6094[var65] * var7 + var9;
                    var12.method3019(var66, 11648);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field6061 == null) {
                var67 = this.field6056;
                var68 = this.field6133;
                var69 = this.field6124;
                var70 = this.field6033;
            } else {
                var70 = this.field6061.field1531;
                var69 = this.field6061.field1537;
                var67 = this.field6061.field1536;
                var68 = this.field6061.field1535;
            }
            float var71 = 3.0F / (float) this.field6111;
            float var72 = 3.0F / (float) (this.field6111 + (this.field6111 / 2));
            var12.field7558 = var10;
            if (this.field6069.field713) {
                for (int var73 = 0; var73 < this.field6128; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1558((byte) 117, (float) var70[var73] * var72);
                        var12.method1558((byte) 117, (float) var68[var73] * var72);
                        var12.method1558((byte) 117, (float) var69[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1558((byte) 117, (float) var70[var73] * var75);
                        var12.method1558((byte) 117, (float) var68[var73] * var75);
                        var12.method1558((byte) 117, (float) var69[var73] * var75);
                    }
                    var12.field7558 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field6128; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1559(arg1 ^ 0x78, (float) var70[var76] * var72);
                        var12.method1559(-104, (float) var68[var76] * var72);
                        var12.method1559(arg1 - 116, (float) var69[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1559(-117, (float) var70[var76] * var78);
                        var12.method1559(-114, (float) var68[var76] * var78);
                        var12.method1559(arg1 ^ 0x79, (float) var69[var76] * var78);
                    }
                    var12.field7558 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field7558 = var11;
            if (this.field6069.field713) {
                for (int var80 = 0; var80 < this.field6128; var80++) {
                    var12.method1558((byte) 117, this.field6138[var80]);
                    var12.method1558((byte) 117, this.field6086[var80]);
                    var12.field7558 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field6128; var79++) {
                    var12.method1559(-122, this.field6138[var79]);
                    var12.method1559(-98, this.field6086[var79]);
                    var12.field7558 += var7 - 8;
                }
            }
        }
        var12.field7558 = this.field6128 * var7;
        class1 var81;
        if (arg0) {
            if (this.field6072 == null) {
                this.field6072 = this.field6069.method193(267135248, true, var7, var12.field7558, var12.field7545);
            } else {
                this.field6072.method1(var7, var12.field7558, 60, var12.field7545);
            }
            this.field6059 = 0;
            var81 = this.field6072;
        } else {
            var81 = this.field6069.method193(arg1 ^ 0xF013D6EF, false, var7, var12.field7558, var12.field7545);
            this.field6073 = true;
        }
        if (var5) {
            this.field6104.field2398 = var81;
            this.field6104.field2399 = var8;
        }
        if (var6) {
            this.field6105.field2399 = var11;
            this.field6105.field2398 = var81;
        }
        if (var3) {
            this.field6079.field2398 = var81;
            this.field6079.field2399 = var9;
        }
        if (var4) {
            this.field6034.field2398 = var81;
            this.field6034.field2399 = var10;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
    private final void method2529(byte arg0) {
        field6100++;
        if (!this.field6073) {
            return;
        }
        this.field6073 = false;
        if (this.field6110 == null && this.field6135 == null && this.field6083 == null) {
            if (this.field6077 != null && !class465.method2760(this.field6032, (byte) -43, this.field6127)) {
                if (this.field6104 != null && this.field6104.field2398 == null) {
                    this.field6073 = true;
                } else {
                    if (!this.field6130) {
                        this.method2536(115);
                    }
                    this.field6077 = null;
                }
            }
            if (this.field6108 != null && !class197.method1332(this.field6032, this.field6127, 0)) {
                if (this.field6104 != null && this.field6104.field2398 == null) {
                    this.field6073 = true;
                } else {
                    if (!this.field6130) {
                        this.method2536(113);
                    }
                    this.field6108 = null;
                }
            }
            if (this.field6046 != null && !class116.method832(this.field6032, (byte) 94, this.field6127)) {
                if (this.field6104 != null && this.field6104.field2398 == null) {
                    this.field6073 = true;
                } else {
                    if (!this.field6130) {
                        this.method2536(73);
                    }
                    this.field6046 = null;
                }
            }
        }
        if (arg0 <= 124) {
            this.field6084 = -55;
        }
        if (this.field6078 != null && this.field6077 == null && this.field6108 == null && this.field6046 == null) {
            this.field6078 = null;
            this.field6053 = null;
        }
        if (this.field6056 != null && !class149.method1049((byte) -23, this.field6127, this.field6032)) {
            if (this.field6034 == null) {
                if (this.field6079 != null && this.field6079.field2398 == null) {
                    this.field6073 = true;
                } else {
                    this.field6033 = this.field6133 = this.field6124 = null;
                    this.field6056 = null;
                }
            } else if (this.field6034.field2398 == null) {
                this.field6073 = true;
            } else {
                this.field6056 = null;
                this.field6033 = this.field6133 = this.field6124 = null;
            }
        }
        if (this.field6102 != null && !class459.method2725((byte) -102, this.field6127, this.field6032)) {
            if (this.field6079 != null && this.field6079.field2398 == null) {
                this.field6073 = true;
            } else {
                this.field6102 = null;
            }
        }
        if (this.field6107 != null && !class512.method2993(this.field6032, this.field6127, 110)) {
            if (this.field6079 != null && this.field6079.field2398 == null) {
                this.field6073 = true;
            } else {
                this.field6107 = null;
            }
        }
        if (this.field6138 != null && !class469.method2781((byte) 103, this.field6032, this.field6127)) {
            if (this.field6105 != null && this.field6105.field2398 == null) {
                this.field6073 = true;
            } else {
                this.field6138 = this.field6086 = null;
            }
        }
        if (this.field6126 != null && !class268.method1725((byte) -60, this.field6032, this.field6127)) {
            if (this.field6079 != null && this.field6079.field2398 == null) {
                this.field6073 = true;
            } else {
                this.field6126 = null;
            }
        }
        if (this.field6065 != null && !class159.method1113(this.field6032, this.field6127, (byte) 109)) {
            if ((this.field6039 == null || this.field6039.field2681 != null) && (this.field6079 == null || this.field6079.field2398 != null)) {
                this.field6065 = this.field6076 = this.field6094 = null;
            } else {
                this.field6073 = true;
            }
        }
        if (this.field6058 != null && !class87.method652(this.field6127, true, this.field6032)) {
            this.field6058 = null;
            this.field6140 = null;
        }
        if (this.field6114 != null && !class510.method2966(this.field6127, -11712, this.field6032)) {
            this.field6114 = null;
            this.field6125 = null;
        }
        if (this.field6134 != null && !class260.method1672(this.field6032, true, this.field6127)) {
            this.field6134 = null;
        }
        if (this.field6045 != null && (this.field6127 & 0x800) == 0 && (this.field6127 & 0x40000) == 0) {
            this.field6045 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BIFJLch;FIIII)S")
    private final short method2530(byte arg0, int arg1, float arg2, long arg3, class330 arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field6038++;
        int var12 = this.field6053[arg8];
        if (arg0 != 43) {
            this.method1152(126, 112, -16, -99);
        }
        int var13 = this.field6053[arg8 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field6078[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class511.field7431[var15] == arg3) {
                return (short) (var16 - 1);
            }
        }
        this.field6078[var14] = (short) (this.field6128 + 1);
        class511.field7431[var14] = arg3;
        this.field6033[this.field6128] = (short) arg9;
        this.field6133[this.field6128] = (short) arg1;
        this.field6124[this.field6128] = (short) arg7;
        this.field6056[this.field6128] = (byte) arg6;
        this.field6138[this.field6128] = arg5;
        this.field6086[this.field6128] = arg2;
        return (short) (this.field6128++);
    }

    @OriginalMember(owner = "client!vs", name = "Q", descriptor = "(I)V")
    public final void method1170(int arg0) {
        field6036++;
        int var2 = class358.field5204[arg0];
        int var3 = class358.field5203[arg0];
        for (int var4 = 0; var4 < this.field6054; var4++) {
            int var7 = this.field6077[var4] * var3 + this.field6046[var4] * var2 >> 15;
            this.field6046[var4] = this.field6046[var4] * var3 - (this.field6077[var4] * var2) >> 15;
            this.field6077[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field6128; var5++) {
            int var6 = this.field6124[var5] * var2 + this.field6033[var5] * var3 >> 15;
            this.field6124[var5] = (short) (this.field6124[var5] * var3 - (this.field6033[var5] * var2) >> 15);
            this.field6033[var5] = (short) var6;
        }
        if (this.field6034 == null && this.field6079 != null) {
            this.field6079.field2398 = null;
        }
        if (this.field6034 != null) {
            this.field6034.field2398 = null;
        }
        if (this.field6104 != null) {
            this.field6104.field2398 = null;
        }
        this.field6130 = false;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "()V")
    public final void method1162() {
        field6099++;
        if (this.field6128 <= 0 || this.field6084 <= 0) {
            return;
        }
        this.method2528(false, -1);
        if ((this.field6059 & 0x10) == 0 && this.field6039.field2681 == null) {
            this.method2534((byte) 95, false);
        }
        this.method2529((byte) 125);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIII)V")
    public final void method1146(int arg0, int arg1, int arg2, int arg3) {
        field6051++;
        for (int var5 = 0; var5 < this.field6117; var5++) {
            int var9 = this.field6102[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x38E) >> 7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field6102[var5] = (short) class442.method2600(class442.method2600(var10 << 10, var11 << 7), var12);
        }
        if (this.field6083 != null) {
            for (int var6 = 0; var6 < this.field6080; var6++) {
                class8 var7 = this.field6083[var6];
                class184 var8 = this.field6092[var6];
                var8.field2718 = class167.field2517[this.field6102[var7.field63] & 0xFFFF] & 0xFFFFFF | var8.field2718 & 0xFF000000;
            }
        }
        if (this.field6079 != null) {
            this.field6079.field2398 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "YA", descriptor = "()V")
    public final void method1159() {
        field6116++;
        for (int var1 = 0; var1 < this.field6054; var1++) {
            this.field6046[var1] = -this.field6046[var1];
        }
        for (int var2 = 0; var2 < this.field6128; var2++) {
            this.field6124[var2] = (short) (-this.field6124[var2]);
        }
        for (int var3 = 0; var3 < this.field6117; var3++) {
            short var4 = this.field6065[var3];
            this.field6065[var3] = this.field6094[var3];
            this.field6094[var3] = var4;
        }
        if (this.field6034 == null && this.field6079 != null) {
            this.field6079.field2398 = null;
        }
        if (this.field6034 != null) {
            this.field6034.field2398 = null;
        }
        if (this.field6104 != null) {
            this.field6104.field2398 = null;
        }
        if (this.field6039 != null) {
            this.field6039.field2681 = null;
        }
        this.field6130 = false;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IBISZ)I")
    private final int method2531(int arg0, byte arg1, int arg2, short arg3, boolean arg4) {
        field6062++;
        int var6 = class167.field2517[class265.method1708(arg2, 124, arg0)];
        if (arg3 != -1) {
            class39 var7 = this.field6069.field2505.method93((byte) -101, arg3 & 0xFFFF);
            int var8 = var7.field816 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg2 < 0) {
                    var9 = 0;
                } else if (arg2 <= 127) {
                    var9 = arg2 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field822 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var13 << 8 & 0xFF0041) + (var14 & 0xFF00) + (var15 >> 8);
            }
        }
        if (!arg4) {
            this.method1147();
        }
        return (var6 << 8) + 255 - (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!vs", name = "F", descriptor = "()I")
    public final int method1147() {
        field6049++;
        if (!this.field6130) {
            this.method2536(54);
        }
        return this.field6040;
    }

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "(I)V")
    public final void method1151(int arg0) {
        field6044++;
        int var2 = class358.field5204[arg0];
        int var3 = class358.field5203[arg0];
        for (int var4 = 0; var4 < this.field6054; var4++) {
            int var5 = this.field6046[var4] * var2 + (this.field6077[var4] * var3) >> 15;
            this.field6046[var4] = this.field6046[var4] * var3 - this.field6077[var4] * var2 >> 15;
            this.field6077[var4] = var5;
        }
        this.field6130 = false;
        if (this.field6104 != null) {
            this.field6104.field2398 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "(I)V")
    public final void method1169(int arg0) {
        if (this.field6079 != null) {
            this.field6079.field2398 = null;
        }
        field6088++;
        this.field6081 = (short) arg0;
    }

    @OriginalMember(owner = "client!vs", name = "J", descriptor = "()I")
    public final int method1164() {
        field6052++;
        if (!this.field6130) {
            this.method2536(57);
        }
        return this.field6112;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Ldm;I)V")
    private final void method2532(class37 arg0, int arg1) {
        field6120++;
        if (this.field6069.field765.length < this.field6128) {
            this.field6069.field765 = new int[this.field6128];
            this.field6069.field764 = new int[this.field6128];
        }
        int[] var3 = this.field6069.field765;
        int[] var4 = this.field6069.field764;
        for (int var5 = 0; var5 < this.field6054; var5++) {
            int var16 = (this.field6077[var5] - (this.field6108[var5] * this.field6069.field704 >> 8) >> this.field6069.field622) - arg0.field788;
            int var17 = (this.field6046[var5] - (this.field6108[var5] * this.field6069.field752 >> 8) >> this.field6069.field622) - arg0.field796;
            int var18 = this.field6053[var5];
            int var19 = this.field6053[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field6078[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        if (arg1 != -129) {
            this.method1136();
        }
        for (int var6 = 0; var6 < this.field6084; var6++) {
            if (this.field6107 == null || this.field6107[var6] <= 128) {
                short var7 = this.field6065[var6];
                short var8 = this.field6076[var6];
                short var9 = this.field6094[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var14 - var15) * (var10 - var11) - (var14 - var13) * (var12 - var11) > 0) {
                    arg0.method395((byte) -44, var13, var10, var11, var14, var15, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "E", descriptor = "(I)V")
    public final void method1135(int arg0) {
        field6119++;
        int var2 = class358.field5204[arg0];
        int var3 = class358.field5203[arg0];
        for (int var4 = 0; var4 < this.field6054; var4++) {
            int var5 = this.field6108[var4] * var3 - (this.field6046[var4] * var2) >> 15;
            this.field6046[var4] = this.field6108[var4] * var2 + this.field6046[var4] * var3 >> 15;
            this.field6108[var4] = var5;
        }
        if (this.field6104 != null) {
            this.field6104.field2398 = null;
        }
        this.field6130 = false;
    }

    @OriginalMember(owner = "client!vs", name = "Z", descriptor = "(III)V")
    public final void method1156(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field6054; var4++) {
            if (arg0 != 128) {
                this.field6077[var4] = this.field6077[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field6108[var4] = this.field6108[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field6046[var4] = this.field6046[var4] * arg2 >> 7;
            }
        }
        field6037++;
        if (this.field6104 != null) {
            this.field6104.field2398 = null;
        }
        this.field6130 = false;
    }

    @OriginalMember(owner = "client!vs", name = "da", descriptor = "()I")
    public final int method1137() {
        field6121++;
        if (!this.field6130) {
            this.method2536(52);
        }
        return this.field6087;
    }

    @OriginalMember(owner = "client!vs", name = "AA", descriptor = "()Z")
    public final boolean method1149() {
        field6098++;
        if (this.field6114 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field6042; var1++) {
            this.field6077[var1] <<= 0x4;
            this.field6108[var1] <<= 0x4;
            this.field6046[var1] <<= 0x4;
        }
        class69.field1140 = 0;
        class46.field889 = 0;
        class72.field1160 = 0;
        return true;
    }

    @OriginalMember(owner = "client!vs", name = "G", descriptor = "(SS)V")
    public final void method1138(short arg0, short arg1) {
        field6093++;
        class16 var3 = this.field6069.field2505;
        for (int var4 = 0; var4 < this.field6117; var4++) {
            if (this.field6126[var4] == arg0) {
                this.field6126[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class39 var7 = var3.method93((byte) -97, arg0 & 0xFFFF);
            var6 = var7.field822;
            var5 = var7.field816;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class39 var10 = var3.method93((byte) -115, arg1 & 0xFFFF);
            var9 = var10.field822;
            var8 = var10.field816;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field6083 != null) {
            for (int var11 = 0; var11 < this.field6080; var11++) {
                class8 var12 = this.field6083[var11];
                class184 var13 = this.field6092[var11];
                var13.field2718 = class167.field2517[this.field6102[var12.field63] & 0xFFFF] & 0xFFFFFF | var13.field2718 & 0xFF000000;
            }
        }
        if (this.field6079 != null) {
            this.field6079.field2398 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!vs", name = "ia", descriptor = "()I")
    public final int method1160() {
        if (!this.field6130) {
            this.method2536(84);
        }
        field6067++;
        return this.field6031;
    }

    @OriginalMember(owner = "client!vs", name = "ma", descriptor = "()I")
    public final int method1166() {
        field6106++;
        return this.field6127;
    }

    @OriginalMember(owner = "client!vs", name = "R", descriptor = "(III)V")
    public final void method1167(int arg0, int arg1, int arg2) {
        field6123++;
        for (int var4 = 0; var4 < this.field6054; var4++) {
            if (arg0 != 0) {
                this.field6077[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field6108[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field6046[var4] += arg2;
            }
        }
        if (this.field6104 != null) {
            this.field6104.field2398 = null;
        }
        this.field6130 = false;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Ln;Lwc;II)V")
    public final void method1153(class15 arg0, class48 arg1, int arg2, int arg3) {
        field6089++;
        if (this.field6128 == 0) {
            return;
        }
        class530 var5 = this.field6069.field654;
        if (!this.field6130) {
            this.method2536(124);
        }
        class530 var6 = (class530) arg0;
        class153.field2327 = var5.field7796 * var6.field7814 + var5.field7816 * var6.field7821 + var5.field7814 * var6.field7804;
        class442.field6304 = var5.field7796 * var6.field7819 + var5.field7816 * var6.field7806 + var5.field7814 * var6.field7797 + var5.field7819;
        float var7 = (float) this.field6115 * class153.field2327 + class442.field6304;
        float var8 = (float) this.field6040 * class153.field2327 + class442.field6304;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var9 = (float) (-this.field6066) + var8;
            var10 = (float) this.field6066 + var7;
        } else {
            var9 = var7 - (float) this.field6066;
            var10 = (float) this.field6066 + var8;
        }
        if ((this.field6069.field711 <= var9) || (var10 <= (float) this.field6069.field748)) {
            return;
        }
        class532.field7851 = var5.field7809 * var6.field7819 + var5.field7822 * var6.field7806 + var5.field7821 * var6.field7797 + var5.field7806;
        class128.field2004 = var5.field7809 * var6.field7814 + var5.field7822 * var6.field7821 + var5.field7821 * var6.field7804;
        float var11 = (float) this.field6115 * class128.field2004 + class532.field7851;
        float var12 = (float) this.field6040 * class128.field2004 + class532.field7851;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var13 = ((float) (-this.field6066) + var12) * (float) this.field6069.field727;
            var14 = ((float) this.field6066 + var11) * (float) this.field6069.field727;
        } else {
            var13 = (var11 - (float) this.field6066) * (float) this.field6069.field727;
            var14 = ((float) this.field6066 + var12) * (float) this.field6069.field727;
        }
        if ((this.field6069.field702 <= var13 / (float) arg2) || (this.field6069.field705 >= var14 / (float) arg2)) {
            return;
        }
        class55.field1002 = var5.field7807 * var6.field7819 + var5.field7817 * var6.field7806 + var5.field7804 * var6.field7797 + var5.field7797;
        class304.field4505 = var5.field7807 * var6.field7814 + var5.field7817 * var6.field7821 + var5.field7804 * var6.field7804;
        float var15 = (float) this.field6115 * class304.field4505 + class55.field1002;
        float var16 = (float) this.field6040 * class304.field4505 + class55.field1002;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var17 = (var16 - (float) this.field6066) * (float) this.field6069.field741;
            var18 = ((float) this.field6066 + var15) * (float) this.field6069.field741;
        } else {
            var17 = (var15 - (float) this.field6066) * (float) this.field6069.field741;
            var18 = ((float) this.field6066 + var16) * (float) this.field6069.field741;
        }
        if ((this.field6069.field676 <= var17 / (float) arg2) || (this.field6069.field677 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field6083 != null) {
            class184.field2727 = var5.field7809 * var6.field7816 + var5.field7822 * var6.field7822 + var5.field7821 * var6.field7817;
            class97.field1530 = var5.field7807 * var6.field7796 + var5.field7817 * var6.field7809 + var5.field7804 * var6.field7807;
            class211.field3184 = var5.field7796 * var6.field7816 + var5.field7816 * var6.field7822 + var5.field7814 * var6.field7817;
            class491.field7078 = var5.field7796 * var6.field7796 + var5.field7816 * var6.field7809 + var5.field7814 * var6.field7807;
            class317.field4717 = var5.field7809 * var6.field7796 + var5.field7822 * var6.field7809 + var5.field7821 * var6.field7807;
            class486.field7049 = var5.field7807 * var6.field7816 + var5.field7817 * var6.field7822 + var5.field7804 * var6.field7817;
        }
        if (arg1 != null) {
            int var19 = this.field6087 + this.field6112 >> 1;
            int var20 = this.field6041 + this.field6031 >> 1;
            int var21 = (int) ((float) var20 * class317.field4717 + (float) this.field6115 * class128.field2004 + (float) var19 * class184.field2727 + class532.field7851);
            int var22 = (int) ((float) var20 * class97.field1530 + (float) this.field6115 * class304.field4505 + (float) var19 * class486.field7049 + class55.field1002);
            int var23 = (int) ((float) var20 * class491.field7078 + (float) this.field6115 * class153.field2327 + (float) var19 * class211.field3184 + class442.field6304);
            int var24 = (int) ((float) var20 * class317.field4717 + (float) this.field6040 * class128.field2004 + (float) var19 * class184.field2727 + class532.field7851);
            int var25 = (int) ((float) var20 * class97.field1530 + (float) this.field6040 * class304.field4505 + (float) var19 * class486.field7049 + class55.field1002);
            arg1.field907 = this.field6069.field666 + (this.field6069.field727 * var21 / arg2);
            arg1.field906 = this.field6069.field727 * var24 / arg2 + this.field6069.field666;
            arg1.field903 = this.field6069.field714 + (this.field6069.field741 * var25 / arg2);
            arg1.field908 = this.field6069.field714 + (this.field6069.field741 * var22 / arg2);
            int var26 = (int) ((float) var20 * class491.field7078 + (float) this.field6040 * class153.field2327 + (float) var19 * class211.field3184 + class442.field6304);
            if (var23 < this.field6069.field748 && var26 < this.field6069.field748) {
                arg1.field904 = true;
                arg1.field905 = this.field6069.field666 - (arg1.field907 - ((var21 + this.field6066) * this.field6069.field727 / arg2));
            }
        }
        this.field6069.method202((float) arg2, (byte) -92);
        this.field6069.method339((byte) -117);
        this.field6069.method291(var6, 0);
        this.method2535(false);
        this.field6069.method243(115);
        this.method2537(0);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[B)[B")
    private static final byte[] method2533(int arg0, byte[] arg1) {
        field6068++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class282.method1818(arg1, arg0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vs", name = "S", descriptor = "(I)V")
    public final void method1145(int arg0) {
        field6063++;
        int var2 = class358.field5204[arg0];
        int var3 = class358.field5203[arg0];
        for (int var4 = 0; var4 < this.field6054; var4++) {
            int var5 = this.field6108[var4] * var2 + this.field6077[var4] * var3 >> 15;
            this.field6108[var4] = this.field6108[var4] * var3 - this.field6077[var4] * var2 >> 15;
            this.field6077[var4] = var5;
        }
        this.field6130 = false;
        if (this.field6104 != null) {
            this.field6104.field2398 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BZ)V")
    private final void method2534(byte arg0, boolean arg1) {
        if (this.field6084 * 6 > this.field6069.field719.field7545.length) {
            this.field6069.field719 = new class235(this.field6084 * 6 + 600);
        } else {
            this.field6069.field719.field7558 = 0;
        }
        field6057++;
        class235 var3 = this.field6069.field719;
        if (arg0 != 95) {
            return;
        }
        if (this.field6069.field713) {
            for (int var4 = 0; var4 < this.field6084; var4++) {
                var3.method3016(this.field6065[var4], -12);
                var3.method3016(this.field6076[var4], arg0 - 154);
                var3.method3016(this.field6094[var4], -113);
            }
        } else {
            for (int var5 = 0; var5 < this.field6084; var5++) {
                var3.method3062(this.field6065[var5], (byte) -53);
                var3.method3062(this.field6076[var5], (byte) -53);
                var3.method3062(this.field6094[var5], (byte) -53);
            }
        }
        if (var3.field7558 == 0) {
            return;
        }
        if (arg1) {
            if (this.field6091 == null) {
                this.field6091 = this.field6069.method271(false, true, var3.field7545, 5123, var3.field7558);
            } else {
                this.field6091.method412(var3.field7545, 5123, 23432, var3.field7558);
            }
            this.field6039.field2681 = this.field6091;
        } else {
            this.field6039.field2681 = this.field6069.method271(false, false, var3.field7545, 5123, var3.field7558);
        }
        if (!arg1) {
            this.field6073 = true;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)V")
    private final void method2535(boolean arg0) {
        field6035++;
        if (this.field6084 == 0) {
            return;
        }
        if (this.field6059 != 0) {
            this.method2528(true, -1);
        }
        this.method2528(arg0, -1);
        if (this.field6039 != null) {
            if (this.field6039.field2681 == null) {
                this.method2534((byte) 95, (this.field6059 & 0x10) != 0);
            }
            if (this.field6039.field2681 != null) {
                this.field6069.method230((byte) -99, this.field6034 != null);
                this.field6069.method319(this.field6079, this.field6034, this.field6105, 22146, this.field6104);
                int var2 = this.field6045.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field6045[var3];
                    int var5 = this.field6045[var3 + 1];
                    int var6 = this.field6126[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field6069.method298(var6, this.field6034 != null, (byte) 8);
                    this.field6069.method266(4, (byte) 113, var4 * 3, (var5 - var4) * 3, this.field6039.field2681);
                }
            }
        }
        this.method2529((byte) 127);
    }

    @OriginalMember(owner = "client!vs", name = "wa", descriptor = "()I")
    public final int method1136() {
        field6070++;
        return this.field6081;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method1157(class336 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field6071++;
        class426 var6 = (class426) arg0;
        if (this.field6117 == 0 || var6.field6117 == 0) {
            return;
        }
        int var7 = var6.field6054;
        int[] var8 = var6.field6077;
        int[] var9 = var6.field6108;
        int[] var10 = var6.field6046;
        short[] var11 = var6.field6033;
        short[] var12 = var6.field6133;
        short[] var13 = var6.field6124;
        byte[] var14 = var6.field6056;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field6061 == null) {
            var17 = null;
            var15 = null;
            var16 = null;
            var18 = null;
        } else {
            var15 = this.field6061.field1536;
            var16 = this.field6061.field1537;
            var17 = this.field6061.field1531;
            var18 = this.field6061.field1535;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field6061 == null) {
            var20 = null;
            var22 = null;
            var21 = null;
            var19 = null;
        } else {
            var19 = var6.field6061.field1536;
            var20 = var6.field6061.field1531;
            var21 = var6.field6061.field1535;
            var22 = var6.field6061.field1537;
        }
        int[] var23 = var6.field6053;
        short[] var24 = var6.field6078;
        if (!var6.field6130) {
            var6.method2536(84);
        }
        short var25 = var6.field6115;
        short var26 = var6.field6040;
        short var27 = var6.field6087;
        short var28 = var6.field6112;
        short var29 = var6.field6041;
        short var30 = var6.field6031;
        for (int var31 = 0; var31 < this.field6054; var31++) {
            int var32 = this.field6108[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field6077[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field6046[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field6053[var31];
                        int var37 = this.field6053[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field6078[var38] - 1;
                            if (var35 == -1 || this.field6056[var35] != 0) {
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
                                        if (var17 == null) {
                                            this.field6061 = new class97();
                                            var17 = this.field6061.field1531 = class486.method2861((byte) -88, this.field6033);
                                            var18 = this.field6061.field1535 = class486.method2861((byte) -100, this.field6133);
                                            var16 = this.field6061.field1537 = class486.method2861((byte) -79, this.field6124);
                                            var15 = this.field6061.field1536 = method2533(0, this.field6056);
                                        }
                                        if (var20 == null) {
                                            class97 var44 = var6.field6061 = new class97();
                                            var20 = var44.field1531 = class486.method2861((byte) -73, var11);
                                            var21 = var44.field1535 = class486.method2861((byte) -66, var12);
                                            var22 = var44.field1537 = class486.method2861((byte) -79, var13);
                                            var19 = var44.field1536 = method2533(0, var14);
                                        }
                                        short var45 = this.field6033[var35];
                                        short var46 = this.field6133[var35];
                                        short var47 = this.field6124[var35];
                                        byte var48 = this.field6056[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var20[var52] += var45;
                                                var21[var52] += var46;
                                                var22[var52] += var47;
                                                var19[var52] += var48;
                                            }
                                        }
                                        short var53 = var13[var40];
                                        short var54 = var12[var40];
                                        int var55 = this.field6053[var31 + 1];
                                        int var56 = this.field6053[var31];
                                        byte var57 = var14[var40];
                                        short var58 = var11[var40];
                                        for (int var59 = var56; var59 < var55; var59++) {
                                            int var60 = this.field6078[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var17[var60] += var58;
                                                var18[var60] += var54;
                                                var16[var60] += var53;
                                                var15[var60] += var57;
                                            }
                                        }
                                        if (this.field6034 == null && this.field6079 != null) {
                                            this.field6079.field2398 = null;
                                        }
                                        if (this.field6034 != null) {
                                            this.field6034.field2398 = null;
                                        }
                                        if (var6.field6034 == null && var6.field6079 != null) {
                                            var6.field6079.field2398 = null;
                                        }
                                        if (var6.field6034 != null) {
                                            var6.field6034.field2398 = null;
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

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
    private final void method2536(int arg0) {
        field6137++;
        int var2 = 32767;
        if (arg0 < 1) {
            this.method1144();
        }
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field6054; var10++) {
            int var11 = this.field6077[var10];
            int var12 = this.field6108[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = this.field6046[var10];
            if (var13 > var7) {
                var7 = var13;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var13 * var13 + (var11 * var11 + (var12 * var12));
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field6087 = (short) var2;
        this.field6040 = (short) var6;
        this.field6115 = (short) var3;
        this.field6031 = (short) var7;
        this.field6112 = (short) var5;
        this.field6041 = (short) var4;
        this.field6066 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field6130 = true;
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V")
    private final void method2537(int arg0) {
        if (this.field6083 != null) {
            class530 var2 = this.field6069.field618;
            float var3 = this.field6069.method212();
            float var4 = this.field6069.method272();
            this.field6069.method180(515);
            this.field6069.method273(false);
            this.field6069.method230((byte) -99, false);
            this.field6069.method319(null, null, this.field6069.field703, arg0 ^ 0x5682, this.field6069.field664);
            for (int var5 = 0; var5 < this.field6080; var5++) {
                class8 var6 = this.field6083[var5];
                class184 var7 = this.field6092[var5];
                if (!var6.field56 || !this.field6069.method292()) {
                    float var8 = (float) (this.field6077[var6.field66] + this.field6077[var6.field54] + this.field6077[var6.field55]) * 0.3333333F;
                    float var9 = (float) (this.field6108[var6.field54] + this.field6108[var6.field55] + this.field6108[var6.field66]) * 0.3333333F;
                    float var10 = (float) (this.field6046[var6.field54] + this.field6046[var6.field55] + this.field6046[var6.field66]) * 0.3333333F;
                    float var11 = class317.field4717 * var10 + class184.field2727 * var8 + class128.field2004 * var9 + class532.field7851;
                    float var12 = class97.field1530 * var10 + class486.field7049 * var8 + class304.field4505 * var9 + class55.field1002;
                    float var13 = class491.field7078 * var10 + class211.field3184 * var8 + class153.field2327 * var9 + class442.field6304;
                    var2.method3142(var6.field57 * var7.field2722 >> 7, (float) var7.field2719 + var11, -var13, var6.field61 * var7.field2716 >> 7, var7.field2723, 0, (float) var7.field2725 - var12);
                    this.field6069.method261(var2, true);
                    this.field6069.method221(var4, var3 - ((float) var6.field68 * 1.5F));
                    int var14 = var7.field2718;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field6069.method204(var6.field65, 1);
                    this.field6069.method229(var6.field64, -32);
                    this.field6069.method249(var6.field70, arg0 - 2);
                    this.field6069.method343(0, 7, 3, 4);
                }
            }
            this.field6069.method221(var4, var3);
            this.field6069.method273(true);
            this.field6069.method243(-89);
        }
        field6122++;
        if (arg0 != 0) {
            this.field6046 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "(I)V")
    public static final void method2538(int arg0) {
        field6136++;
        int var1 = class452.field6603;
        int[] var2 = class532.field7853;
        int var3 = 11 % ((47 - arg0) / 46);
        for (int var4 = 0; var4 < var1; var4++) {
            class510 var5 = class494.field7143[var2[var4]];
            if (var5 != null) {
                class26.method160(50, var5, var5.method135((byte) 72));
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "K", descriptor = "()I")
    public final int method1139() {
        field6118++;
        if (!this.field6130) {
            this.method2536(62);
        }
        return this.field6041;
    }

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "(SS)V")
    public final void method1163(short arg0, short arg1) {
        field6060++;
        for (int var3 = 0; var3 < this.field6117; var3++) {
            if (this.field6102[var3] == arg0) {
                this.field6102[var3] = arg1;
            }
        }
        if (this.field6083 != null) {
            for (int var4 = 0; var4 < this.field6080; var4++) {
                class8 var5 = this.field6083[var4];
                class184 var6 = this.field6092[var4];
                var6.field2718 = var6.field2718 & 0xFF000000 | class167.field2517[this.field6102[var5.field63] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field6079 != null) {
            this.field6079.field2398 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "()[Leh;")
    public final class248[] method1172() {
        field6096++;
        return this.field6110;
    }

    @OriginalMember(owner = "client!vs", name = "la", descriptor = "(IIII)V")
    public final void method1152(int arg0, int arg1, int arg2, int arg3) {
        field6097++;
        if (arg0 == 0) {
            class72.field1160 = 0;
            int var5 = 0;
            class69.field1140 = 0;
            class46.field889 = 0;
            for (int var6 = 0; var6 < this.field6054; var6++) {
                class46.field889 += this.field6077[var6];
                class69.field1140 += this.field6108[var6];
                var5++;
                class72.field1160 += this.field6046[var6];
            }
            if (var5 <= 0) {
                class72.field1160 = arg3;
                class69.field1140 = arg2;
                class46.field889 = arg1;
            } else {
                class46.field889 = class46.field889 / var5 + arg1;
                class72.field1160 = class72.field1160 / var5 + arg3;
                class69.field1140 = class69.field1140 / var5 + arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field6054; var7++) {
                this.field6077[var7] += arg1;
                this.field6108[var7] += arg2;
                this.field6046[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field6054; var8++) {
                this.field6077[var8] -= class46.field889;
                this.field6108[var8] -= class69.field1140;
                this.field6046[var8] -= class72.field1160;
                if (arg3 != 0) {
                    int var9 = class358.field5204[arg3];
                    int var10 = class358.field5203[arg3];
                    int var11 = this.field6077[var8] * var10 + this.field6108[var8] * var9 + 32767 >> 15;
                    this.field6108[var8] = this.field6108[var8] * var10 + 32767 - this.field6077[var8] * var9 >> 15;
                    this.field6077[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class358.field5204[arg1];
                    int var13 = class358.field5203[arg1];
                    int var14 = this.field6108[var8] * var13 + 32767 - (this.field6046[var8] * var12) >> 15;
                    this.field6046[var8] = this.field6108[var8] * var12 + this.field6046[var8] * var13 + 32767 >> 15;
                    this.field6108[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class358.field5204[arg2];
                    int var16 = class358.field5203[arg2];
                    int var17 = this.field6077[var8] * var16 + this.field6046[var8] * var15 + 32767 >> 15;
                    this.field6046[var8] = this.field6046[var8] * var16 + 32767 - (this.field6077[var8] * var15) >> 15;
                    this.field6077[var8] = var17;
                }
                this.field6077[var8] += class46.field889;
                this.field6108[var8] += class69.field1140;
                this.field6046[var8] += class72.field1160;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field6054; var18++) {
                this.field6077[var18] -= class46.field889;
                this.field6108[var18] -= class69.field1140;
                this.field6046[var18] -= class72.field1160;
                this.field6077[var18] = this.field6077[var18] * arg1 / 128;
                this.field6108[var18] = this.field6108[var18] * arg2 / 128;
                this.field6046[var18] = this.field6046[var18] * arg3 / 128;
                this.field6077[var18] += class46.field889;
                this.field6108[var18] += class69.field1140;
                this.field6046[var18] += class72.field1160;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field6117; var19++) {
                int var23 = (this.field6107[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field6107[var19] = (byte) var23;
            }
            if (this.field6079 != null) {
                this.field6079.field2398 = null;
            }
            if (this.field6083 != null) {
                for (int var20 = 0; var20 < this.field6080; var20++) {
                    class8 var21 = this.field6083[var20];
                    class184 var22 = this.field6092[var20];
                    var22.field2718 = var22.field2718 & 0xFFFFFF | 255 - (this.field6107[var21.field63] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field6117; var24++) {
                int var28 = this.field6102[var24] & 0xFFFF;
                int var29 = (var28 & 0xFE04) >> 10;
                int var30 = (var28 & 0x3A1) >> 7;
                int var31 = var28 & 0x7F;
                int var32 = arg2 / 4 + var30;
                int var33 = arg1 + var29 & 0x3F;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                int var34 = arg3 + var31;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field6102[var24] = (short) class442.method2600(class442.method2600(var33 << 10, var32 << 7), var34);
            }
            if (this.field6079 != null) {
                this.field6079.field2398 = null;
            }
            if (this.field6083 != null) {
                for (int var25 = 0; var25 < this.field6080; var25++) {
                    class8 var26 = this.field6083[var25];
                    class184 var27 = this.field6092[var25];
                    var27.field2718 = var27.field2718 & 0xFF000000 | class167.field2517[this.field6102[var26.field63] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field6080; var35++) {
                class184 var36 = this.field6092[var35];
                var36.field2719 += arg1;
                var36.field2725 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field6080; var37++) {
                class184 var38 = this.field6092[var37];
                var38.field2716 = var38.field2716 * arg1 >> 7;
                var38.field2722 = var38.field2722 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field6080; var39++) {
                class184 var40 = this.field6092[var39];
                var40.field2723 = var40.field2723 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BIZ)Lka;")
    public final class336 method1154(byte arg0, int arg1, boolean arg2) {
        field6064++;
        class426 var4;
        class426 var5;
        if (arg0 == 1) {
            var4 = this.field6069.field644;
            var5 = this.field6069.field749;
        } else if (arg0 == 2) {
            var4 = this.field6069.field660;
            var5 = this.field6069.field739;
        } else if (arg0 == 3) {
            var4 = this.field6069.field680;
            var5 = this.field6069.field684;
        } else if (arg0 == 4) {
            var5 = this.field6069.field732;
            var4 = this.field6069.field698;
        } else if (arg0 == 5) {
            var4 = this.field6069.field725;
            var5 = this.field6069.field657;
        } else {
            var4 = var5 = new class426(this.field6069);
        }
        return this.method2526((byte) 49, var5, var4, arg2, arg0 != 0, arg1);
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "()Z")
    public final boolean method1141() {
        field6074++;
        if (this.field6126 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field6126.length; var1++) {
            if (this.field6126[var1] != -1 && !this.field6069.field2505.method92(12624, this.field6126[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vs", name = "W", descriptor = "(I[IIIIZI[I)V")
    public final void method1143(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field6132++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = arg2 << 4;
            class72.field1160 = 0;
            int var13 = 0;
            class69.field1140 = 0;
            class46.field889 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field6114.length > var15) {
                    int[] var16 = this.field6114[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field6125 == null || (arg6 & this.field6125[var18]) != 0) {
                            class46.field889 += this.field6077[var18];
                            class69.field1140 += this.field6108[var18];
                            class72.field1160 += this.field6046[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class69.field1140 = var11;
                class72.field1160 = var10;
                class46.field889 = var12;
            } else {
                class72.field1160 = class72.field1160 / var13 + var10;
                class46.field889 = class46.field889 / var13 + var12;
                class69.field1140 = class69.field1140 / var13 + var11;
                class176.field2635 = true;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + (arg7[1] * arg3) + 16384 >> 15;
                int var20 = arg7[3] * arg2 + arg7[5] * arg4 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + (arg7[7] * arg3) + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field6114.length > var26) {
                    int[] var27 = this.field6114[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field6125 == null || (arg6 & this.field6125[var29]) != 0) {
                            this.field6077[var29] += var22;
                            this.field6108[var29] += var23;
                            this.field6046[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field6114.length) {
                        int[] var110 = this.field6114[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field6125 == null || (this.field6125[var112] & arg6) != 0) {
                                this.field6077[var112] -= class46.field889;
                                this.field6108[var112] -= class69.field1140;
                                this.field6046[var112] -= class72.field1160;
                                if (arg4 != 0) {
                                    int var113 = class358.field5204[arg4];
                                    int var114 = class358.field5203[arg4];
                                    int var115 = this.field6108[var112] * var113 + (this.field6077[var112] * var114) + 32767 >> 15;
                                    this.field6108[var112] = this.field6108[var112] * var114 + 32767 - (this.field6077[var112] * var113) >> 15;
                                    this.field6077[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class358.field5204[arg2];
                                    int var117 = class358.field5203[arg2];
                                    int var118 = this.field6108[var112] * var117 + 32767 - this.field6046[var112] * var116 >> 15;
                                    this.field6046[var112] = this.field6046[var112] * var117 + (this.field6108[var112] * var116 + 32767) >> 15;
                                    this.field6108[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class358.field5204[arg3];
                                    int var120 = class358.field5203[arg3];
                                    int var121 = this.field6077[var112] * var120 + this.field6046[var112] * var119 + 32767 >> 15;
                                    this.field6046[var112] = this.field6046[var112] * var120 - (this.field6077[var112] * var119 - 32767) >> 15;
                                    this.field6077[var112] = var121;
                                }
                                this.field6077[var112] += class46.field889;
                                this.field6108[var112] += class69.field1140;
                                this.field6046[var112] += class72.field1160;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field6114.length) {
                            int[] var93 = this.field6114[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field6125 == null || (arg6 & this.field6125[var95]) != 0) {
                                    int var96 = this.field6053[var95];
                                    int var97 = this.field6053[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field6078[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class358.field5204[arg4];
                                            int var101 = class358.field5203[arg4];
                                            int var102 = this.field6133[var99] * var100 + this.field6033[var99] * var101 + 32767 >> 15;
                                            this.field6133[var99] = (short) (this.field6133[var99] * var101 + 32767 - (this.field6033[var99] * var100) >> 15);
                                            this.field6033[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class358.field5204[arg2];
                                            int var104 = class358.field5203[arg2];
                                            int var105 = this.field6133[var99] * var104 - (this.field6124[var99] * var103 - 32767) >> 15;
                                            this.field6124[var99] = (short) (this.field6133[var99] * var103 + this.field6124[var99] * var104 + 32767 >> 15);
                                            this.field6133[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class358.field5204[arg3];
                                            int var107 = class358.field5203[arg3];
                                            int var108 = this.field6124[var99] * var106 + (this.field6033[var99] * var107) + 32767 >> 15;
                                            this.field6124[var99] = (short) (this.field6124[var99] * var107 + 32767 - (this.field6033[var99] * var106) >> 15);
                                            this.field6033[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field6034 == null && this.field6079 != null) {
                        this.field6079.field2398 = null;
                    }
                    if (this.field6034 != null) {
                        this.field6034.field2398 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class176.field2635) {
                    int var36 = arg7[3] * class69.field1140 + arg7[0] * class46.field889 + arg7[6] * class72.field1160 + 16384 >> 15;
                    int var37 = arg7[4] * class69.field1140 + (arg7[1] * class46.field889 + (arg7[7] * class72.field1160)) + 16384 >> 15;
                    int var38 = arg7[5] * class69.field1140 + (arg7[2] * class46.field889 + arg7[8] * class72.field1160 + 16384) >> 15;
                    int var39 = var34 + var37;
                    int var40 = var33 + var36;
                    int var41 = var35 + var38;
                    class46.field889 = var40;
                    class69.field1140 = var39;
                    class72.field1160 = var41;
                    class176.field2635 = false;
                }
                int[] var42 = new int[9];
                int var43 = class358.field5203[arg2];
                int var44 = class358.field5204[arg2];
                int var45 = class358.field5203[arg3];
                int var46 = class358.field5204[arg3];
                int var47 = class358.field5203[arg4];
                int var48 = class358.field5204[arg4];
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + (var46 * var50) + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[6] = var45 * var50 + -var46 * var47 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[5] = -var44;
                var42[4] = var43 * var47 + 16384 >> 15;
                int var51 = var42[1] * -class69.field1140 + (var42[0] * -class46.field889 + var42[2] * -class72.field1160 + 16384) >> 15;
                int var52 = var42[3] * -class46.field889 + var42[5] * -class72.field1160 + var42[4] * -class69.field1140 + 16384 >> 15;
                int var53 = var42[8] * -class72.field1160 + var42[7] * -class69.field1140 + var42[6] * -class46.field889 + 16384 >> 15;
                int var54 = class46.field889 + var51;
                int var55 = class69.field1140 + var52;
                int var56 = var53 + class72.field1160;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 16384 >> 15;
                    }
                }
                int var59 = var42[0] * var33 + (var42[2] * var35) + var42[1] * var34 + 16384 >> 15;
                int var60 = var42[4] * var34 + var42[3] * var33 + (var42[5] * var35) + 16384 >> 15;
                int var61 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var62 = var54 + var59;
                int var63 = var55 + var60;
                int var64 = var56 + var61;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 16384 >> 15;
                    }
                }
                int var67 = arg7[0] * var62 + 16384 - (-(arg7[1] * var63) + -(arg7[2] * var64)) >> 15;
                int var68 = arg7[5] * var64 + arg7[4] * var63 + arg7[3] * var62 + 16384 >> 15;
                int var69 = var31 + var68;
                int var70 = arg7[6] * var62 + (arg7[8] * var64) + arg7[7] * var63 + 16384 >> 15;
                int var71 = var30 + var67;
                int var72 = var32 + var70;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field6114.length) {
                        int[] var75 = this.field6114[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field6125 == null || (arg6 & this.field6125[var77]) != 0) {
                                int var78 = this.field6108[var77] * var65[1] + this.field6077[var77] * var65[0] + this.field6046[var77] * var65[2] + 16384 >> 15;
                                int var79 = this.field6077[var77] * var65[3] + this.field6108[var77] * var65[4] + this.field6046[var77] * var65[5] + 16384 >> 15;
                                int var80 = var71 + var78;
                                int var81 = var69 + var79;
                                int var82 = this.field6046[var77] * var65[8] + (this.field6077[var77] * var65[6] + (this.field6108[var77] * var65[7])) + 16384 >> 15;
                                this.field6077[var77] = var80;
                                int var83 = var72 + var82;
                                this.field6108[var77] = var81;
                                this.field6046[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field6114.length > var123) {
                        int[] var124 = this.field6114[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field6125 == null || (this.field6125[var126] & arg6) != 0) {
                                this.field6077[var126] -= class46.field889;
                                this.field6108[var126] -= class69.field1140;
                                this.field6046[var126] -= class72.field1160;
                                this.field6077[var126] = this.field6077[var126] * arg2 >> 7;
                                this.field6108[var126] = this.field6108[var126] * arg3 >> 7;
                                this.field6046[var126] = this.field6046[var126] * arg4 >> 7;
                                this.field6077[var126] += class46.field889;
                                this.field6108[var126] += class69.field1140;
                                this.field6046[var126] += class72.field1160;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class176.field2635) {
                    int var133 = arg7[3] * class69.field1140 + arg7[6] * class72.field1160 + arg7[0] * class46.field889 + 16384 >> 15;
                    int var134 = arg7[1] * class46.field889 + arg7[4] * class69.field1140 + arg7[7] * class72.field1160 + 16384 >> 15;
                    int var135 = arg7[8] * class72.field1160 + arg7[2] * class46.field889 + arg7[5] * class69.field1140 + 16384 >> 15;
                    int var136 = var131 + var134;
                    int var137 = var130 + var133;
                    int var138 = var132 + var135;
                    class46.field889 = var137;
                    class69.field1140 = var136;
                    class72.field1160 = var138;
                    class176.field2635 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class46.field889 * var139 + 16384 >> 15;
                int var143 = -class69.field1140 * var140 + 16384 >> 15;
                int var144 = -class72.field1160 * var141 + 16384 >> 15;
                int var145 = var142 + class46.field889;
                int var146 = var143 + class69.field1140;
                int var147 = var144 + class72.field1160;
                int[] var148 = new int[] { arg7[0] * var139 + 16384 >> 15, arg7[3] * var139 + 16384 >> 15, arg7[6] * var139 + 16384 >> 15, arg7[1] * var140 + 16384 >> 15, arg7[4] * var140 + 16384 >> 15, arg7[7] * var140 + 16384 >> 15, arg7[2] * var141 + 16384 >> 15, arg7[5] * var141 + 16384 >> 15, arg7[8] * var141 + 16384 >> 15 };
                int var149 = var130 * var139 + 16384 >> 15;
                int var150 = var131 * var140 + 16384 >> 15;
                int var151 = var132 * var141 + 16384 >> 15;
                int var152 = var146 + var150;
                int var153 = var145 + var149;
                int var154 = var147 + var151;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 16384 >> 15;
                    }
                }
                int var157 = arg7[0] * var153 + arg7[2] * var154 + arg7[1] * var152 + 16384 >> 15;
                int var158 = arg7[5] * var154 + (arg7[4] * var152 + arg7[3] * var153 + 16384) >> 15;
                int var159 = arg7[6] * var153 + (arg7[8] * var154) + arg7[7] * var152 + 16384 >> 15;
                int var160 = var127 + var157;
                int var161 = var128 + var158;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field6114.length > var164) {
                        int[] var165 = this.field6114[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field6125 == null || (arg6 & this.field6125[var167]) != 0) {
                                int var168 = this.field6077[var167] * var155[0] + this.field6108[var167] * var155[1] + (this.field6046[var167] * var155[2]) + 16384 >> 15;
                                int var169 = this.field6077[var167] * var155[3] + this.field6108[var167] * var155[4] + this.field6046[var167] * var155[5] + 16384 >> 15;
                                int var170 = var161 + var169;
                                int var171 = var160 + var168;
                                int var172 = this.field6077[var167] * var155[6] + this.field6108[var167] * var155[7] + (this.field6046[var167] * var155[8] - -16384) >> 15;
                                int var173 = var162 + var172;
                                this.field6077[var167] = var171;
                                this.field6108[var167] = var170;
                                this.field6046[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6058 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field6058.length > var181) {
                        int[] var182 = this.field6058[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field6140 == null || (this.field6140[var184] & arg6) != 0) {
                                int var185 = (this.field6107[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field6107[var184] = (byte) var185;
                                if (this.field6079 != null) {
                                    this.field6079.field2398 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field6083 != null) {
                    for (int var178 = 0; var178 < this.field6080; var178++) {
                        class8 var179 = this.field6083[var178];
                        class184 var180 = this.field6092[var178];
                        var180.field2718 = var180.field2718 & 0xFFFFFF | 255 - (this.field6107[var179.field63] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6058 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field6058.length > var190) {
                        int[] var191 = this.field6058[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field6140 == null || (this.field6140[var193] & arg6) != 0) {
                                int var194 = this.field6102[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = (var194 & 0x381) >> 7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = var194 & 0x7F;
                                int var199 = arg2 + var195 & 0x3F;
                                int var200 = arg4 + var198;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 7) {
                                    var197 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field6102[var193] = (short) class442.method2600(var200, class442.method2600(var197 << 7, var199 << 10));
                                if (this.field6079 != null) {
                                    this.field6079.field2398 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field6083 != null) {
                    for (int var187 = 0; var187 < this.field6080; var187++) {
                        class8 var188 = this.field6083[var187];
                        class184 var189 = this.field6092[var187];
                        var189.field2718 = class167.field2517[this.field6102[var188.field63] & 0xFFFF] & 0xFFFFFF | var189.field2718 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field6134 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field6134.length) {
                        int[] var203 = this.field6134[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class184 var205 = this.field6092[var203[var204]];
                            var205.field2719 += arg2;
                            var205.field2725 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field6134 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field6134.length > var207) {
                        int[] var208 = this.field6134[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class184 var210 = this.field6092[var208[var209]];
                            var210.field2722 = var210.field2722 * arg3 >> 7;
                            var210.field2716 = var210.field2716 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field6134 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field6134.length > var212) {
                    int[] var213 = this.field6134[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class184 var215 = this.field6092[var213[var214]];
                        var215.field2723 = var215.field2723 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lfl;I)V")
    private final void method2539(class530 arg0, int arg1) {
        field6109++;
        if (this.field6110 != null) {
            for (int var3 = 0; var3 < this.field6110.length; var3++) {
                class248 var4 = this.field6110[var3];
                class248 var5 = var4;
                if (var4.field3695 != null) {
                    var5 = var4.field3695;
                }
                var5.field3700 = (int) ((float) this.field6046[var4.field3712] * arg0.field7809 + (float) this.field6108[var4.field3712] * arg0.field7821 + (float) this.field6077[var4.field3712] * arg0.field7822 + arg0.field7806);
                var5.field3702 = (int) ((float) this.field6046[var4.field3712] * arg0.field7807 + (float) this.field6108[var4.field3712] * arg0.field7804 + (float) this.field6077[var4.field3712] * arg0.field7817 + arg0.field7797);
                var5.field3709 = (int) ((float) this.field6046[var4.field3712] * arg0.field7796 + (float) this.field6108[var4.field3712] * arg0.field7814 + (float) this.field6077[var4.field3712] * arg0.field7816 + arg0.field7819);
                var5.field3705 = (int) ((float) this.field6046[var4.field3710] * arg0.field7809 + (float) this.field6108[var4.field3710] * arg0.field7821 + (float) this.field6077[var4.field3710] * arg0.field7822 + arg0.field7806);
                var5.field3706 = (int) ((float) this.field6046[var4.field3710] * arg0.field7807 + (float) this.field6108[var4.field3710] * arg0.field7804 + (float) this.field6077[var4.field3710] * arg0.field7817 + arg0.field7797);
                var5.field3699 = (int) ((float) this.field6046[var4.field3710] * arg0.field7796 + (float) this.field6108[var4.field3710] * arg0.field7814 + (float) this.field6077[var4.field3710] * arg0.field7816 + arg0.field7819);
                var5.field3716 = (int) ((float) this.field6046[var4.field3708] * arg0.field7809 + (float) this.field6108[var4.field3708] * arg0.field7821 + (float) this.field6077[var4.field3708] * arg0.field7822 + arg0.field7806);
                var5.field3701 = (int) ((float) this.field6046[var4.field3708] * arg0.field7807 + (float) this.field6108[var4.field3708] * arg0.field7804 + (float) this.field6077[var4.field3708] * arg0.field7817 + arg0.field7797);
                var5.field3707 = (int) ((float) this.field6046[var4.field3708] * arg0.field7796 + (float) this.field6108[var4.field3708] * arg0.field7814 + (float) this.field6077[var4.field3708] * arg0.field7816 + arg0.field7819);
            }
        }
        if (this.field6135 != null) {
            for (int var6 = 0; var6 < this.field6135.length; var6++) {
                class280 var7 = this.field6135[var6];
                class280 var8 = var7;
                if (var7.field4177 != null) {
                    var8 = var7.field4177;
                }
                if (var7.field4171 == null) {
                    var7.field4171 = arg0.method38();
                } else {
                    var7.field4171.method45(arg0);
                }
                var8.field4178 = (int) ((float) this.field6046[var7.field4175] * arg0.field7809 + (float) this.field6108[var7.field4175] * arg0.field7821 + (float) this.field6077[var7.field4175] * arg0.field7822 + arg0.field7806);
                var8.field4172 = (int) ((float) this.field6046[var7.field4175] * arg0.field7807 + (float) this.field6108[var7.field4175] * arg0.field7804 + (float) this.field6077[var7.field4175] * arg0.field7817 + arg0.field7797);
                var8.field4166 = (int) ((float) this.field6046[var7.field4175] * arg0.field7796 + (float) this.field6108[var7.field4175] * arg0.field7814 + (float) this.field6077[var7.field4175] * arg0.field7816 + arg0.field7819);
            }
        }
        int var9 = -31 / ((2 - arg1) / 41);
    }

    @OriginalMember(owner = "client!vs", name = "IA", descriptor = "(I)V")
    public final void method1140(int arg0) {
        field6101++;
        if (this.field6079 != null) {
            this.field6079.field2398 = null;
        }
        this.field6111 = (short) arg0;
        if (this.field6034 != null) {
            this.field6034.field2398 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "H", descriptor = "()I")
    public final int method1150() {
        if (!this.field6130) {
            this.method2536(112);
        }
        field6043++;
        return this.field6066;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Ln;Lwc;I)V")
    public final void method1142(class15 arg0, class48 arg1, int arg2) {
        field6047++;
        if (this.field6128 == 0) {
            return;
        }
        class530 var4 = this.field6069.field654;
        class530 var5 = (class530) arg0;
        if (!this.field6130) {
            this.method2536(83);
        }
        this.method2539(var5, 89);
        class442.field6304 = var4.field7796 * var5.field7819 + var4.field7816 * var5.field7806 + var4.field7814 * var5.field7797 + var4.field7819;
        class153.field2327 = var4.field7796 * var5.field7814 + var4.field7816 * var5.field7821 + var4.field7814 * var5.field7804;
        float var6 = (float) this.field6115 * class153.field2327 + class442.field6304;
        float var7 = (float) this.field6040 * class153.field2327 + class442.field6304;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = var7 - (float) this.field6066;
            var9 = (float) this.field6066 + var6;
        } else {
            var8 = var6 - (float) this.field6066;
            var9 = (float) this.field6066 + var7;
        }
        if ((var8 >= this.field6069.field738) || ((float) this.field6069.field748 >= var9)) {
            return;
        }
        class128.field2004 = var4.field7809 * var5.field7814 + var4.field7822 * var5.field7821 + var4.field7821 * var5.field7804;
        class532.field7851 = var4.field7809 * var5.field7819 + var4.field7822 * var5.field7806 + var4.field7821 * var5.field7797 + var4.field7806;
        float var10 = (float) this.field6115 * class128.field2004 + class532.field7851;
        float var11 = (float) this.field6040 * class128.field2004 + class532.field7851;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var12 = (var11 - (float) this.field6066) * (float) this.field6069.field727;
            var13 = ((float) this.field6066 + var10) * (float) this.field6069.field727;
        } else {
            var12 = (var10 - (float) this.field6066) * (float) this.field6069.field727;
            var13 = ((float) this.field6066 + var11) * (float) this.field6069.field727;
        }
        if ((this.field6069.field702 <= var12 / var9) || (this.field6069.field705 >= var13 / var9)) {
            return;
        }
        class304.field4505 = var4.field7807 * var5.field7814 + var4.field7817 * var5.field7821 + var4.field7804 * var5.field7804;
        class55.field1002 = var4.field7807 * var5.field7819 + var4.field7817 * var5.field7806 + var4.field7804 * var5.field7797 + var4.field7797;
        float var14 = (float) this.field6115 * class304.field4505 + class55.field1002;
        float var15 = (float) this.field6040 * class304.field4505 + class55.field1002;
        float var16;
        float var17;
        if ((var15 < var14)) {
            var17 = (var15 - (float) this.field6066) * (float) this.field6069.field741;
            var16 = ((float) this.field6066 + var14) * (float) this.field6069.field741;
        } else {
            var16 = ((float) this.field6066 + var15) * (float) this.field6069.field741;
            var17 = (var14 - (float) this.field6066) * (float) this.field6069.field741;
        }
        if ((this.field6069.field676 <= var17 / var9) || (var16 / var9 <= this.field6069.field677)) {
            return;
        }
        if (arg1 != null || this.field6083 != null) {
            class97.field1530 = var4.field7807 * var5.field7796 + var4.field7817 * var5.field7809 + var4.field7804 * var5.field7807;
            class317.field4717 = var4.field7809 * var5.field7796 + var4.field7822 * var5.field7809 + var4.field7821 * var5.field7807;
            class211.field3184 = var4.field7796 * var5.field7816 + var4.field7816 * var5.field7822 + var4.field7814 * var5.field7817;
            class491.field7078 = var4.field7796 * var5.field7796 + var4.field7816 * var5.field7809 + var4.field7814 * var5.field7807;
            class184.field2727 = var4.field7809 * var5.field7816 + var4.field7822 * var5.field7822 + var4.field7821 * var5.field7817;
            class486.field7049 = var4.field7807 * var5.field7816 + var4.field7817 * var5.field7822 + var4.field7804 * var5.field7817;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field6087 + this.field6112 >> 1;
            int var21 = this.field6041 + this.field6031 >> 1;
            int var22 = (int) ((float) var21 * class317.field4717 + (float) this.field6115 * class128.field2004 + (float) var20 * class184.field2727 + class532.field7851);
            int var23 = (int) ((float) var21 * class97.field1530 + (float) this.field6115 * class304.field4505 + (float) var20 * class486.field7049 + class55.field1002);
            int var24 = (int) ((float) var21 * class491.field7078 + (float) this.field6115 * class153.field2327 + (float) var20 * class211.field3184 + class442.field6304);
            if (this.field6069.field748 > var24) {
                var18 = true;
            } else {
                arg1.field907 = this.field6069.field727 * var22 / var24 + this.field6069.field666;
                arg1.field908 = this.field6069.field714 + (this.field6069.field741 * var23 / var24);
            }
            int var25 = (int) ((float) var21 * class317.field4717 + (float) this.field6040 * class128.field2004 + (float) var20 * class184.field2727 + class532.field7851);
            int var26 = (int) ((float) var21 * class97.field1530 + (float) this.field6040 * class304.field4505 + (float) var20 * class486.field7049 + class55.field1002);
            int var27 = (int) ((float) var21 * class491.field7078 + (float) this.field6040 * class153.field2327 + (float) var20 * class211.field3184 + class442.field6304);
            if (this.field6069.field748 > var27) {
                var18 = true;
            } else {
                arg1.field903 = this.field6069.field741 * var26 / var27 + this.field6069.field714;
                arg1.field906 = this.field6069.field727 * var25 / var27 + this.field6069.field666;
            }
            if (var18) {
                if (var24 < this.field6069.field748 && var27 < this.field6069.field748) {
                    var19 = false;
                } else if (var24 < this.field6069.field748) {
                    int var31 = (var27 - this.field6069.field748 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field907 = this.field6069.field666 + (this.field6069.field727 * var32 / this.field6069.field748);
                    arg1.field908 = this.field6069.field714 + (this.field6069.field741 * var33 / this.field6069.field748);
                } else if (this.field6069.field748 > var27) {
                    int var28 = (var24 - this.field6069.field748 << 16) / (var24 - var27);
                    int var29 = var22 + ((var22 - var25) * var28 >> 16);
                    arg1.field907 = this.field6069.field727 * var29 / this.field6069.field748 + this.field6069.field666;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field908 = this.field6069.field714 + (this.field6069.field741 * var30 / this.field6069.field748);
                }
            }
            if (var19) {
                arg1.field904 = true;
                if (var24 <= var27) {
                    arg1.field905 = (this.field6066 + var25) * this.field6069.field727 / var27 + this.field6069.field666 - arg1.field906;
                } else {
                    arg1.field905 = (this.field6066 + var22) * this.field6069.field727 / var24 + this.field6069.field666 - arg1.field907;
                }
            }
        }
        this.field6069.method227(1);
        this.field6069.method291(var5, 0);
        this.method2535(false);
        this.field6069.method243(123);
        this.method2537(0);
    }

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "(I[IIIIIZ)V")
    public final void method1134(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field6141++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            class46.field889 = 0;
            class69.field1140 = 0;
            class72.field1160 = 0;
            int var12 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field6114.length) {
                    int[] var15 = this.field6114[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class46.field889 += this.field6077[var17];
                        class69.field1140 += this.field6108[var17];
                        var12++;
                        class72.field1160 += this.field6046[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class46.field889 = var10;
                class69.field1140 = var9;
                class72.field1160 = var11;
            } else {
                class72.field1160 = class72.field1160 / var12 + var11;
                class69.field1140 = class69.field1140 / var12 + var9;
                class46.field889 = class46.field889 / var12 + var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field6114.length > var22) {
                    int[] var23 = this.field6114[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field6077[var25] += var20;
                        this.field6108[var25] += var18;
                        this.field6046[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field6114.length > var45) {
                    int[] var46 = this.field6114[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field6077[var59] -= class46.field889;
                            this.field6108[var59] -= class69.field1140;
                            this.field6046[var59] -= class72.field1160;
                            if (arg4 != 0) {
                                int var60 = class358.field5204[arg4];
                                int var61 = class358.field5203[arg4];
                                int var62 = this.field6108[var59] * var60 + (this.field6077[var59] * var61) + 32767 >> 15;
                                this.field6108[var59] = this.field6108[var59] * var61 + 32767 - (this.field6077[var59] * var60) >> 15;
                                this.field6077[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class358.field5204[arg2];
                                int var64 = class358.field5203[arg2];
                                int var65 = this.field6108[var59] * var64 + (32767 - (this.field6046[var59] * var63)) >> 15;
                                this.field6046[var59] = this.field6108[var59] * var63 + (this.field6046[var59] * var64 + 32767) >> 15;
                                this.field6108[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class358.field5204[arg3];
                                int var67 = class358.field5203[arg3];
                                int var68 = this.field6046[var59] * var66 + (this.field6077[var59] * var67) + 32767 >> 15;
                                this.field6046[var59] = this.field6046[var59] * var67 + 32767 - (this.field6077[var59] * var66) >> 15;
                                this.field6077[var59] = var68;
                            }
                            this.field6077[var59] += class46.field889;
                            this.field6108[var59] += class69.field1140;
                            this.field6046[var59] += class72.field1160;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field6077[var48] -= class46.field889;
                            this.field6108[var48] -= class69.field1140;
                            this.field6046[var48] -= class72.field1160;
                            if (arg2 != 0) {
                                int var49 = class358.field5204[arg2];
                                int var50 = class358.field5203[arg2];
                                int var51 = this.field6108[var48] * var50 + 32767 - (this.field6046[var48] * var49) >> 15;
                                this.field6046[var48] = this.field6108[var48] * var49 + this.field6046[var48] * var50 + 32767 >> 15;
                                this.field6108[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class358.field5204[arg4];
                                int var53 = class358.field5203[arg4];
                                int var54 = this.field6108[var48] * var52 + (this.field6077[var48] * var53) + 32767 >> 15;
                                this.field6108[var48] = this.field6108[var48] * var53 + 32767 - (this.field6077[var48] * var52) >> 15;
                                this.field6077[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class358.field5204[arg3];
                                int var56 = class358.field5203[arg3];
                                int var57 = this.field6077[var48] * var56 + this.field6046[var48] * var55 + 32767 >> 15;
                                this.field6046[var48] = this.field6046[var48] * var56 + (32767 - (this.field6077[var48] * var55)) >> 15;
                                this.field6077[var48] = var57;
                            }
                            this.field6077[var48] += class46.field889;
                            this.field6108[var48] += class69.field1140;
                            this.field6046[var48] += class72.field1160;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field6114.length > var28) {
                        int[] var29 = this.field6114[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field6053[var31];
                            int var33 = this.field6053[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field6078[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class358.field5204[arg4];
                                    int var37 = class358.field5203[arg4];
                                    int var38 = this.field6133[var35] * var36 + (this.field6033[var35] * var37) + 32767 >> 15;
                                    this.field6133[var35] = (short) (this.field6133[var35] * var37 + 32767 - (this.field6033[var35] * var36) >> 15);
                                    this.field6033[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class358.field5204[arg2];
                                    int var40 = class358.field5203[arg2];
                                    int var41 = this.field6133[var35] * var40 + 32767 - this.field6124[var35] * var39 >> 15;
                                    this.field6124[var35] = (short) (this.field6124[var35] * var40 + (this.field6133[var35] * var39 + 32767) >> 15);
                                    this.field6133[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class358.field5204[arg3];
                                    int var43 = class358.field5203[arg3];
                                    int var44 = this.field6124[var35] * var42 + this.field6033[var35] * var43 + 32767 >> 15;
                                    this.field6124[var35] = (short) (this.field6124[var35] * var43 + 32767 - (this.field6033[var35] * var42) >> 15);
                                    this.field6033[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field6034 == null && this.field6079 != null) {
                    this.field6079.field2398 = null;
                }
                if (this.field6034 != null) {
                    this.field6034.field2398 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field6114.length) {
                    int[] var71 = this.field6114[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field6077[var73] -= class46.field889;
                        this.field6108[var73] -= class69.field1140;
                        this.field6046[var73] -= class72.field1160;
                        this.field6077[var73] = this.field6077[var73] * arg2 >> 7;
                        this.field6108[var73] = this.field6108[var73] * arg3 >> 7;
                        this.field6046[var73] = this.field6046[var73] * arg4 >> 7;
                        this.field6077[var73] += class46.field889;
                        this.field6108[var73] += class69.field1140;
                        this.field6046[var73] += class72.field1160;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6058 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field6058.length > var78) {
                        int[] var79 = this.field6058[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field6107[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field6107[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field6079 != null) {
                            this.field6079.field2398 = null;
                        }
                    }
                }
                if (this.field6083 != null) {
                    for (int var75 = 0; var75 < this.field6080; var75++) {
                        class8 var76 = this.field6083[var75];
                        class184 var77 = this.field6092[var75];
                        var77.field2718 = var77.field2718 & 0xFFFFFF | 255 - (this.field6107[var76.field63] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6058 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field6058.length > var87) {
                        int[] var88 = this.field6058[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field6102[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFC02) >> 10;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = arg2 + var92 & 0x3F;
                            int var97 = arg4 + var94;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field6102[var90] = (short) class442.method2600(class442.method2600(var96 << 10, var95 << 7), var97);
                        }
                        if (var88.length > 0 && this.field6079 != null) {
                            this.field6079.field2398 = null;
                        }
                    }
                }
                if (this.field6083 != null) {
                    for (int var84 = 0; var84 < this.field6080; var84++) {
                        class8 var85 = this.field6083[var84];
                        class184 var86 = this.field6092[var84];
                        var86.field2718 = class167.field2517[this.field6102[var85.field63] & 0xFFFF] & 0xFFFFFF | var86.field2718 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field6134 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field6134.length > var99) {
                        int[] var100 = this.field6134[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class184 var102 = this.field6092[var100[var101]];
                            var102.field2725 += arg3;
                            var102.field2719 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field6134 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field6134.length > var104) {
                        int[] var105 = this.field6134[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class184 var107 = this.field6092[var105[var106]];
                            var107.field2722 = var107.field2722 * arg3 >> 7;
                            var107.field2716 = var107.field2716 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field6134 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field6134.length) {
                    int[] var110 = this.field6134[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class184 var112 = this.field6092[var110[var111]];
                        var112.field2723 = var112.field2723 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method2540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6129++;
        if (arg5 > arg2 && arg3 > arg2 && arg4 > arg2) {
            return false;
        } else if (arg2 > arg5 && arg3 < arg2 && arg2 > arg4) {
            return false;
        } else if (arg6 > arg8 && arg7 > arg8 && arg8 < arg1) {
            return false;
        } else if (arg6 < arg8 && arg8 > arg7 && arg1 < arg8) {
            return false;
        } else {
            if (arg0 != 0) {
                this.method1146(-57, 84, -23, 126);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vs", name = "ha", descriptor = "()V")
    public final void method1158() {
        field6085++;
        for (int var1 = 0; var1 < this.field6042; var1++) {
            this.field6077[var1] = this.field6077[var1] + 7 >> 4;
            this.field6108[var1] = this.field6108[var1] + 7 >> 4;
            this.field6046[var1] = this.field6046[var1] + 7 >> 4;
        }
        this.field6130 = false;
        if (this.field6104 != null) {
            this.field6104.field2398 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "LA", descriptor = "(Lia;)Lia;")
    public final class424 method1171(class424 arg0) {
        field6090++;
        if (this.field6128 == 0) {
            return null;
        }
        if (!this.field6130) {
            this.method2536(5);
        }
        int var2;
        int var3;
        if (this.field6069.field704 > 0) {
            var2 = this.field6087 - (this.field6069.field704 * this.field6040 >> 8) >> this.field6069.field622;
            var3 = this.field6112 - (this.field6069.field704 * this.field6115 >> 8) >> this.field6069.field622;
        } else {
            var2 = this.field6087 - (this.field6069.field704 * this.field6115 >> 8) >> this.field6069.field622;
            var3 = this.field6112 - (this.field6069.field704 * this.field6040 >> 8) >> this.field6069.field622;
        }
        int var4;
        int var5;
        if (this.field6069.field752 <= 0) {
            var4 = this.field6041 - (this.field6069.field752 * this.field6115 >> 8) >> this.field6069.field622;
            var5 = this.field6031 - (this.field6069.field752 * this.field6040 >> 8) >> this.field6069.field622;
        } else {
            var4 = this.field6041 - (this.field6069.field752 * this.field6040 >> 8) >> this.field6069.field622;
            var5 = this.field6031 - (this.field6069.field752 * this.field6115 >> 8) >> this.field6069.field622;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class37 var8 = (class37) arg0;
        class37 var9;
        if (var8 != null && var8.method390(var6, (byte) -43, var7)) {
            var9 = var8;
            var8.method391(-8);
        } else {
            var9 = new class37(this.field6069, var6, var7);
        }
        var9.method394(var2, var4, var3, (byte) -91, var5);
        this.method2532(var9, -129);
        return var9;
    }

    @OriginalMember(owner = "client!vs", name = "D", descriptor = "()I")
    public final int method1168() {
        field6139++;
        return this.field6111;
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lbt;)V")
    public class426(class33 arg0) {
        this.field6069 = arg0;
        this.field6104 = new class157(null, 5126, 3, 0);
        this.field6105 = new class157(null, 5126, 2, 0);
        this.field6034 = new class157(null, 5126, 3, 0);
        this.field6079 = new class157(null, 5121, 4, 0);
        this.field6039 = new class182();
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lbt;Lch;IIII)V")
    public class426(class33 arg0, class330 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6127 = arg2;
        this.field6032 = arg5;
        this.field6069 = arg0;
        if (class514.method3003((byte) -127, arg2, arg5)) {
            this.field6104 = new class157(null, 5126, 3, 0);
        }
        if (class49.method443(arg5, arg2, -1551)) {
            this.field6105 = new class157(null, 5126, 2, 0);
        }
        if (class508.method2963(arg5, 0, arg2)) {
            this.field6034 = new class157(null, 5126, 3, 0);
        }
        if (class294.method1896(arg5, arg2, 258)) {
            this.field6079 = new class157(null, 5121, 4, 0);
        }
        if (class332.method2100(arg2, (byte) -90, arg5)) {
            this.field6039 = new class182();
        }
        class16 var7 = arg0.field2505;
        int[] var8 = new int[arg1.field4852];
        this.field6053 = new int[arg1.field4853 + 1];
        for (int var9 = 0; var9 < arg1.field4852; var9++) {
            if ((arg1.field4871 == null || arg1.field4871[var9] != 2) && (arg1.field4891 == null || arg1.field4891[var9] == -1 || !var7.method93((byte) -56, arg1.field4891[var9] & 0xFFFF).field831)) {
                var8[this.field6117++] = var9;
                this.field6053[arg1.field4885[var9]]++;
                this.field6053[arg1.field4854[var9]]++;
                this.field6053[arg1.field4849[var9]]++;
            }
        }
        this.field6084 = this.field6117;
        long[] var10 = new long[this.field6117];
        boolean var11 = (this.field6127 & 0x100) != 0;
        label497: for (int var12 = 0; var12 < this.field6117; var12++) {
            int var180 = var8[var12];
            class39 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field4846 != null) {
                for (int var186 = 0; var186 < arg1.field4846.length; var186++) {
                    class295 var187 = arg1.field4846[var186];
                    if (var187.field4411 == var180) {
                        class334 var188 = class284.method1831(var187.field4414, (byte) 30);
                        if (var188.field4956) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field6084--;
                            continue label497;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field4891 != null) {
                var189 = arg1.field4891[var180];
                if (var189 != -1) {
                    var181 = var7.method93((byte) 38, var189 & 0xFFFF);
                    var184 = var181.field819;
                    var185 = var181.field821;
                }
            }
            boolean var190 = arg1.field4887 != null && arg1.field4887[var180] != 0 || var181 != null && !var181.field830 | var181.field818;
            if ((var11 || var190) && arg1.field4876 != null) {
                var182 += arg1.field4876[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = (var184 & 0xFF << 8) + var182;
            int var192 = ((var189 & 0xFFFF) << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + (long) var194;
        }
        class241.method1591(var10, var8, (byte) 87);
        this.field6054 = arg1.field4853;
        this.field6077 = arg1.field4869;
        this.field6042 = arg1.field4877;
        this.field6046 = arg1.field4857;
        this.field6108 = arg1.field4859;
        this.field6125 = arg1.field4844;
        this.field6110 = arg1.field4873;
        class421[] var13 = new class421[this.field6054];
        this.field6135 = arg1.field4858;
        if (arg1.field4846 != null) {
            this.field6080 = arg1.field4846.length;
            this.field6092 = new class184[this.field6080];
            this.field6083 = new class8[this.field6080];
            for (int var14 = 0; var14 < this.field6080; var14++) {
                class295 var15 = arg1.field4846[var14];
                class334 var16 = class284.method1831(var15.field4414, (byte) -96);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field6117; var18++) {
                    if (var8[var18] == var15.field4411) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class167.field2517[arg1.field4886[var15.field4411] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field4887 == null ? 0 : arg1.field4887[var15.field4411]) << 24;
                this.field6083[var14] = new class8(var17, arg1.field4885[var15.field4411], arg1.field4854[var15.field4411], arg1.field4849[var15.field4411], var16.field4946, var16.field4952, var16.field4950, var16.field4955, var16.field4954, var16.field4956, var16.field4951, var15.field4416);
                this.field6092[var14] = new class184(var20);
            }
        }
        int var21 = this.field6117 * 3;
        this.field6133 = new short[var21];
        if (arg1.field4880 != null) {
            this.field6140 = new short[this.field6117];
        }
        this.field6033 = new short[var21];
        this.field6107 = new byte[this.field6117];
        this.field6086 = new float[var21];
        this.field6102 = new short[this.field6117];
        this.field6138 = new float[var21];
        this.field6065 = new short[this.field6117];
        this.field6078 = new short[var21];
        this.field6124 = new short[var21];
        this.field6126 = new short[this.field6117];
        this.field6094 = new short[this.field6117];
        this.field6081 = (short) arg3;
        class511.field7431 = new long[var21];
        this.field6076 = new short[this.field6117];
        this.field6111 = (short) arg4;
        this.field6056 = new byte[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field4853; var23++) {
            int var179 = this.field6053[var23];
            this.field6053[var23] = var22;
            var22 += var179;
            var13[var23] = new class421();
        }
        this.field6053[arg1.field4853] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field4862 != null) {
            int var28 = arg1.field4847;
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
            for (int var36 = 0; var36 < this.field6117; var36++) {
                int var43 = var8[var36];
                if (arg1.field4862[var43] != -1) {
                    int var44 = arg1.field4862[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field4885[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field4854[var43];
                        } else {
                            var46 = arg1.field4849[var43];
                        }
                        int var47 = arg1.field4869[var46];
                        int var48 = arg1.field4859[var46];
                        int var49 = arg1.field4857[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var31[var44] > var48) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var27 = new float[var28][];
            var26 = new int[var28];
            var24 = new int[var28];
            var25 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field4882[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field4842[var37];
                        var40 = 64.0F / (float) arg1.field4894[var37];
                        if (var42 == 0) {
                            var39 = 1.0F;
                            var41 = 1.0F;
                        } else if (var42 > 0) {
                            var39 = 1.0F;
                            var41 = (float) var42 / 1024.0F;
                        } else {
                            var39 = (float) (-var42) / 1024.0F;
                            var41 = 1.0F;
                        }
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field4842[var37];
                        var40 = 64.0F / (float) arg1.field4894[var37];
                        var41 = 64.0F / (float) arg1.field4867[var37];
                    } else {
                        var39 = (float) arg1.field4842[var37] / 1024.0F;
                        var41 = (float) arg1.field4867[var37] / 1024.0F;
                        var40 = (float) arg1.field4894[var37] / 1024.0F;
                    }
                    var27[var37] = class214.method1436(class168.method1203(arg1.field4888[var37], 255), arg1.field4855[var37], arg1.field4868[var37], var40, var39, arg1.field4872[var37], var41, (byte) 120);
                }
            }
        }
        class271[] var50 = new class271[arg1.field4852];
        for (int var51 = 0; var51 < arg1.field4852; var51++) {
            short var158 = arg1.field4885[var51];
            short var159 = arg1.field4854[var51];
            short var160 = arg1.field4849[var51];
            int var161 = this.field6077[var159] - this.field6077[var158];
            int var162 = this.field6108[var159] - this.field6108[var158];
            int var163 = this.field6046[var159] - this.field6046[var158];
            int var164 = this.field6077[var160] - this.field6077[var158];
            int var165 = this.field6108[var160] - this.field6108[var158];
            int var166 = this.field6046[var160] - this.field6046[var158];
            int var167 = var162 * var166 - var163 * var165;
            int var168 = var163 * var164 - var161 * var166;
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var167 >>= 0x1;
                var169 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + (var167 * var167 + (var168 * var168))));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var169 * 256 / var170;
            byte var174 = arg1.field4871 == null ? 0 : arg1.field4871[var51];
            if (var174 == 0) {
                class421 var176 = var13[var158];
                var176.field5965 += var172;
                var176.field5968++;
                var176.field5970 += var171;
                var176.field5969 += var173;
                class421 var177 = var13[var159];
                var177.field5970 += var171;
                var177.field5969 += var173;
                var177.field5965 += var172;
                var177.field5968++;
                class421 var178 = var13[var160];
                var178.field5969 += var173;
                var178.field5970 += var171;
                var178.field5965 += var172;
                var178.field5968++;
            } else if (var174 == 1) {
                class271 var175 = var50[var51] = new class271();
                var175.field4075 = var173;
                var175.field4073 = var172;
                var175.field4074 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field6117; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field4886[var68] & 0xFFFF;
            short var70;
            if (arg1.field4891 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field4891[var68];
            }
            int var71;
            if (arg1.field4862 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field4862[var68];
            }
            int var72;
            if (arg1.field4887 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field4887[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var73 = 0.0F;
                    var78 = 0.0F;
                    var80 = 2;
                    var79 = 1;
                    var77 = 0.0F;
                    var76 = 1.0F;
                    var74 = 1.0F;
                    var75 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field4882[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field4885[var68];
                        short var84 = arg1.field4854[var68];
                        short var85 = arg1.field4849[var68];
                        short var86 = arg1.field4872[var71];
                        short var87 = arg1.field4855[var71];
                        short var88 = arg1.field4868[var71];
                        float var89 = (float) arg1.field4869[var86];
                        float var90 = (float) arg1.field4859[var86];
                        float var91 = (float) arg1.field4857[var86];
                        float var92 = (float) arg1.field4869[var87] - var89;
                        float var93 = (float) arg1.field4859[var87] - var90;
                        float var94 = (float) arg1.field4857[var87] - var91;
                        float var95 = (float) arg1.field4869[var88] - var89;
                        float var96 = (float) arg1.field4859[var88] - var90;
                        float var97 = (float) arg1.field4857[var88] - var91;
                        float var98 = (float) arg1.field4869[var83] - var89;
                        float var99 = (float) arg1.field4859[var83] - var90;
                        float var100 = (float) arg1.field4857[var83] - var91;
                        float var101 = (float) arg1.field4869[var84] - var89;
                        float var102 = (float) arg1.field4859[var84] - var90;
                        float var103 = (float) arg1.field4857[var84] - var91;
                        float var104 = (float) arg1.field4869[var85] - var89;
                        float var105 = (float) arg1.field4859[var85] - var90;
                        float var106 = (float) arg1.field4857[var85] - var91;
                        float var107 = var93 * var97 - (var94 * var96);
                        float var108 = var94 * var95 - (var92 * var97);
                        float var109 = var92 * var96 - (var93 * var95);
                        float var110 = var96 * var109 - var97 * var108;
                        float var111 = var97 * var107 - (var95 * var109);
                        float var112 = var95 * var108 - var96 * var107;
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        float var114 = var92 * var108 - var93 * var107;
                        float var115 = var94 * var107 - var92 * var109;
                        float var116 = var93 * var109 - var94 * var108;
                        float var117 = 1.0F / (var97 * var114 + var95 * var116 + var96 * var115);
                        var78 = (var106 * var114 + var104 * var116 + var105 * var115) * var117;
                        var74 = (var100 * var114 + var98 * var116 + var99 * var115) * var117;
                        var76 = (var103 * var114 + var101 * var116 + var102 * var115) * var117;
                    } else {
                        short var118 = arg1.field4885[var68];
                        short var119 = arg1.field4854[var68];
                        short var120 = arg1.field4849[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field4879[var71];
                        float var126 = (float) arg1.field4845[var71] / 256.0F;
                        if (var82 == 1) {
                            float var144 = (float) arg1.field4867[var71] / 1024.0F;
                            class107.method783(-13031, arg1.field4857[var118], arg1.field4869[var118], var121, var125, var126, var123, var122, var124, var144, arg1.field4859[var118]);
                            var74 = class470.field6824;
                            var73 = class355.field5171;
                            class107.method783(-13031, arg1.field4857[var119], arg1.field4869[var119], var121, var125, var126, var123, var122, var124, var144, arg1.field4859[var119]);
                            var76 = class470.field6824;
                            var75 = class355.field5171;
                            class107.method783(-13031, arg1.field4857[var120], arg1.field4869[var120], var121, var125, var126, var123, var122, var124, var144, arg1.field4859[var120]);
                            var77 = class355.field5171;
                            var78 = class470.field6824;
                            float var145 = var144 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if (var145 < var77 - var73) {
                                    var80 = 1;
                                    var77 -= var144;
                                } else if (var73 - var77 > var145) {
                                    var80 = 2;
                                    var77 += var144;
                                }
                                if ((var145 < var75 - var73)) {
                                    var79 = 1;
                                    var75 -= var144;
                                } else if (var145 < var73 - var75) {
                                    var75 += var144;
                                    var79 = 2;
                                }
                            } else {
                                if (var76 - var74 > var145) {
                                    var79 = 1;
                                    var76 -= var144;
                                } else if (var74 - var76 > var145) {
                                    var76 += var144;
                                    var79 = 2;
                                }
                                if (var78 - var74 > var145) {
                                    var78 -= var144;
                                    var80 = 1;
                                } else if (var145 < var74 - var78) {
                                    var78 += var144;
                                    var80 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var127 = (float) arg1.field4884[var71] / 256.0F;
                            float var128 = (float) arg1.field4848[var71] / 256.0F;
                            int var129 = arg1.field4869[var119] - arg1.field4869[var118];
                            int var130 = arg1.field4859[var119] - arg1.field4859[var118];
                            int var131 = arg1.field4857[var119] - arg1.field4857[var118];
                            int var132 = arg1.field4869[var120] - arg1.field4869[var118];
                            int var133 = arg1.field4859[var120] - arg1.field4859[var118];
                            int var134 = arg1.field4857[var120] - arg1.field4857[var118];
                            int var135 = var130 * var134 - (var131 * var133);
                            int var136 = var131 * var132 - var129 * var134;
                            int var137 = var129 * var133 - (var130 * var132);
                            float var138 = 64.0F / (float) arg1.field4842[var71];
                            float var139 = 64.0F / (float) arg1.field4894[var71];
                            float var140 = 64.0F / (float) arg1.field4867[var71];
                            float var141 = (var124[2] * (float) var137 + var124[1] * (float) var136 + var124[0] * (float) var135) / var138;
                            float var142 = (var124[5] * (float) var137 + var124[3] * (float) var135 + var124[4] * (float) var136) / var139;
                            float var143 = (var124[8] * (float) var137 + var124[7] * (float) var136 + var124[6] * (float) var135) / var140;
                            var81 = class7.method29(var142, var141, 1, var143);
                            class486.method2867(var126, arg1.field4869[var118], var128, var123, var127, var122, var81, var121, arg1.field4859[var118], var125, var124, arg1.field4857[var118], -62);
                            var74 = class249.field3719;
                            var73 = class250.field3726;
                            class486.method2867(var126, arg1.field4869[var119], var128, var123, var127, var122, var81, var121, arg1.field4859[var119], var125, var124, arg1.field4857[var119], -112);
                            var76 = class249.field3719;
                            var75 = class250.field3726;
                            class486.method2867(var126, arg1.field4869[var120], var128, var123, var127, var122, var81, var121, arg1.field4859[var120], var125, var124, arg1.field4857[var120], -74);
                            var78 = class249.field3719;
                            var77 = class250.field3726;
                        } else if (var82 == 3) {
                            class477.method2821(var121, var124, var125, var126, 4, arg1.field4857[var118], arg1.field4859[var118], var122, var123, arg1.field4869[var118]);
                            var74 = class330.field4896;
                            var73 = class471.field6847;
                            class477.method2821(var121, var124, var125, var126, 4, arg1.field4857[var119], arg1.field4859[var119], var122, var123, arg1.field4869[var119]);
                            var76 = class330.field4896;
                            var75 = class471.field6847;
                            class477.method2821(var121, var124, var125, var126, 4, arg1.field4857[var120], arg1.field4859[var120], var122, var123, arg1.field4869[var120]);
                            var77 = class471.field6847;
                            var78 = class330.field4896;
                            if ((var125 & 0x1) == 0) {
                                if (var77 - var73 > 0.5F) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                                if ((var75 - var73 > 0.5F)) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                            } else {
                                if ((var76 - var74 > 0.5F)) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var79 = 2;
                                    var76++;
                                }
                                if (var78 - var74 > 0.5F) {
                                    var80 = 1;
                                    var78--;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var80 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field4871 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field4871[var68];
            }
            if (var146 == 0) {
                long var147 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) (var71 << 2);
                short var149 = arg1.field4885[var68];
                short var150 = arg1.field4854[var68];
                short var151 = arg1.field4849[var68];
                class421 var152 = var13[var149];
                this.field6065[var52] = this.method2530((byte) 43, var152.field5965, var74, var147, arg1, var73, var152.field5968, var152.field5969, var149, var152.field5970);
                class421 var153 = var13[var150];
                this.field6076[var52] = this.method2530((byte) 43, var153.field5965, var76, (long) var79 + var147, arg1, var75, var153.field5968, var153.field5969, var150, var153.field5970);
                class421 var154 = var13[var151];
                this.field6094[var52] = this.method2530((byte) 43, var154.field5965, var78, (long) var80 + var147, arg1, var77, var154.field5968, var154.field5969, var151, var154.field5970);
            } else if (var146 == 1) {
                class271 var155 = var50[var68];
                long var156 = (long) ((var71 << 2) + (var155.field4074 <= 0 ? 2048 : 1024) + (var155.field4073 + 256 << 12) + (var155.field4075 + 256 << 22)) + ((long) (var81 << 24) + (long) var72 + (long) (var69 << 8) << 32);
                this.field6065[var52] = this.method2530((byte) 43, var155.field4073, var74, var156, arg1, var73, 0, var155.field4075, arg1.field4885[var68], var155.field4074);
                this.field6076[var52] = this.method2530((byte) 43, var155.field4073, var76, (long) var79 + var156, arg1, var75, 0, var155.field4075, arg1.field4854[var68], var155.field4074);
                this.field6094[var52] = this.method2530((byte) 43, var155.field4073, var78, (long) var80 + var156, arg1, var77, 0, var155.field4075, arg1.field4849[var68], var155.field4074);
            }
            if (arg1.field4891 == null) {
                this.field6126[var52] = -1;
            } else {
                this.field6126[var52] = arg1.field4891[var68];
            }
            if (arg1.field4887 != null) {
                this.field6107[var52] = arg1.field4887[var68];
            }
            if (arg1.field4880 != null) {
                this.field6140[var52] = arg1.field4880[var68];
            }
            this.field6102[var52] = arg1.field4886[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field6084; var55++) {
            short var67 = this.field6126[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field6045 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field6084; var58++) {
            short var66 = this.field6126[var58];
            if (var57 != var66) {
                this.field6045[var56++] = var58;
                var57 = var66;
            }
        }
        this.field6045[var56] = this.field6084;
        class511.field7431 = null;
        this.field6033 = class393.method2371(this.field6128, this.field6033, 0);
        this.field6133 = class393.method2371(this.field6128, this.field6133, 0);
        this.field6124 = class393.method2371(this.field6128, this.field6124, 0);
        this.field6056 = class235.method1557(this.field6056, this.field6128, (byte) -126);
        this.field6138 = class498.method2919(0, this.field6138, this.field6128);
        this.field6086 = class498.method2919(0, this.field6086, this.field6128);
        if (arg1.field4893 != null && class510.method2966(arg2, -11712, this.field6032)) {
            this.field6114 = arg1.method2095(23313, false);
        }
        if (arg1.field4846 != null && class260.method1672(this.field6032, true, arg2)) {
            this.field6134 = arg1.method2087(-123);
        }
        if (arg1.field4890 != null && class87.method652(arg2, true, this.field6032)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field6117; var61++) {
                int var65 = arg1.field4890[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var65 > var59) {
                        var59 = var65;
                    }
                }
            }
            this.field6058 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field6058[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field6117; var63++) {
                int var64 = arg1.field4890[var8[var63]];
                if (var64 >= 0) {
                    this.field6058[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    static {
        new class44("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field6113 = 1;
    }
}
