import jaclib.memory.Stream;
import jaggl.OpenGL;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class649 extends class358 {

    @OriginalMember(owner = "client!ev", name = "s", descriptor = "Z")
    private boolean field8689 = false;

    @OriginalMember(owner = "client!ev", name = "P", descriptor = "Z")
    private boolean field8712 = true;

    @OriginalMember(owner = "client!ev", name = "Kb", descriptor = "I")
    private int field8759 = 0;

    @OriginalMember(owner = "client!ev", name = "X", descriptor = "I")
    private int field8720 = 0;

    @OriginalMember(owner = "client!ev", name = "Nb", descriptor = "I")
    private int field8762 = 0;

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "I")
    private int field8696 = 0;

    @OriginalMember(owner = "client!ev", name = "mc", descriptor = "I")
    private int field8787 = 0;

    @OriginalMember(owner = "client!ev", name = "Jb", descriptor = "Lno;")
    private class658 field8758;

    @OriginalMember(owner = "client!ev", name = "y", descriptor = "Lgda;")
    private class51 field8695;

    @OriginalMember(owner = "client!ev", name = "Rb", descriptor = "Lgda;")
    private class51 field8766;

    @OriginalMember(owner = "client!ev", name = "zb", descriptor = "Lgda;")
    private class51 field8748;

    @OriginalMember(owner = "client!ev", name = "jc", descriptor = "Lgda;")
    private class51 field8784;

    @OriginalMember(owner = "client!ev", name = "fb", descriptor = "Lrn;")
    private class249 field8728;

    @OriginalMember(owner = "client!ev", name = "pb", descriptor = "I")
    private int field8738;

    @OriginalMember(owner = "client!ev", name = "G", descriptor = "I")
    private int field8703;

    @OriginalMember(owner = "client!ev", name = "rc", descriptor = "[I")
    private int[] field8792;

    @OriginalMember(owner = "client!ev", name = "M", descriptor = "[S")
    private short[] field8709;

    @OriginalMember(owner = "client!ev", name = "nc", descriptor = "[I")
    private int[] field8788;

    @OriginalMember(owner = "client!ev", name = "v", descriptor = "[I")
    private int[] field8692;

    @OriginalMember(owner = "client!ev", name = "oc", descriptor = "[I")
    private int[] field8789;

    @OriginalMember(owner = "client!ev", name = "A", descriptor = "[Ljt;")
    private class93[] field8697;

    @OriginalMember(owner = "client!ev", name = "w", descriptor = "[Lefa;")
    private class171[] field8693;

    @OriginalMember(owner = "client!ev", name = "Zb", descriptor = "I")
    private int field8774;

    @OriginalMember(owner = "client!ev", name = "Ab", descriptor = "[Lib;")
    private class142[] field8749;

    @OriginalMember(owner = "client!ev", name = "ac", descriptor = "[Ldl;")
    private class59[] field8775;

    @OriginalMember(owner = "client!ev", name = "V", descriptor = "[S")
    private short[] field8718;

    @OriginalMember(owner = "client!ev", name = "fc", descriptor = "[S")
    private short[] field8780;

    @OriginalMember(owner = "client!ev", name = "ec", descriptor = "[F")
    private float[] field8779;

    @OriginalMember(owner = "client!ev", name = "D", descriptor = "S")
    private short field8700;

    @OriginalMember(owner = "client!ev", name = "Db", descriptor = "[B")
    private byte[] field8752;

    @OriginalMember(owner = "client!ev", name = "bb", descriptor = "[B")
    private byte[] field8724;

    @OriginalMember(owner = "client!ev", name = "F", descriptor = "[S")
    private short[] field8702;

    @OriginalMember(owner = "client!ev", name = "u", descriptor = "[F")
    private float[] field8691;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "[S")
    private short[] field8685;

    @OriginalMember(owner = "client!ev", name = "bc", descriptor = "[S")
    private short[] field8776;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "[S")
    private short[] field8684;

    @OriginalMember(owner = "client!ev", name = "J", descriptor = "[S")
    private short[] field8706;

    @OriginalMember(owner = "client!ev", name = "ic", descriptor = "[S")
    private short[] field8783;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "[S")
    private short[] field8686;

    @OriginalMember(owner = "client!ev", name = "xb", descriptor = "[S")
    private short[] field8746;

    @OriginalMember(owner = "client!ev", name = "R", descriptor = "S")
    private short field8714;

    @OriginalMember(owner = "client!ev", name = "Vb", descriptor = "[I")
    private int[] field8770;

    @OriginalMember(owner = "client!ev", name = "Gb", descriptor = "[[I")
    private int[][] field8755;

    @OriginalMember(owner = "client!ev", name = "Lb", descriptor = "[[I")
    private int[][] field8760;

    @OriginalMember(owner = "client!ev", name = "qc", descriptor = "[[I")
    private int[][] field8791;

    @OriginalMember(owner = "client!ev", name = "vb", descriptor = "Z")
    public static boolean field8744 = false;

    @OriginalMember(owner = "client!ev", name = "W", descriptor = "B")
    private byte field8719;

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!ev", name = "t", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!ev", name = "x", descriptor = "I")
    public static int field8694;

    @OriginalMember(owner = "client!ev", name = "B", descriptor = "I")
    public static int field8698;

    @OriginalMember(owner = "client!ev", name = "C", descriptor = "I")
    public static int field8699;

    @OriginalMember(owner = "client!ev", name = "E", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!ev", name = "H", descriptor = "I")
    public static int field8704;

    @OriginalMember(owner = "client!ev", name = "I", descriptor = "I")
    public static int field8705;

    @OriginalMember(owner = "client!ev", name = "K", descriptor = "I")
    public static int field8707;

    @OriginalMember(owner = "client!ev", name = "L", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!ev", name = "N", descriptor = "I")
    public static int field8710;

    @OriginalMember(owner = "client!ev", name = "Q", descriptor = "I")
    public static int field8713;

    @OriginalMember(owner = "client!ev", name = "T", descriptor = "I")
    public static int field8716;

    @OriginalMember(owner = "client!ev", name = "U", descriptor = "I")
    public static int field8717;

    @OriginalMember(owner = "client!ev", name = "Z", descriptor = "I")
    public static int field8722;

    @OriginalMember(owner = "client!ev", name = "cb", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!ev", name = "db", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!ev", name = "eb", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!ev", name = "gb", descriptor = "I")
    public static int field8729;

    @OriginalMember(owner = "client!ev", name = "hb", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!ev", name = "ib", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!ev", name = "jb", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!ev", name = "kb", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!ev", name = "lb", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!ev", name = "mb", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!ev", name = "qb", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!ev", name = "rb", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!ev", name = "sb", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!ev", name = "tb", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!ev", name = "ub", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!ev", name = "wb", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!ev", name = "Bb", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!ev", name = "Cb", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!ev", name = "Eb", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!ev", name = "Fb", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!ev", name = "Hb", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!ev", name = "Ib", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!ev", name = "Mb", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!ev", name = "Ob", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!ev", name = "Pb", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!ev", name = "Qb", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!ev", name = "Sb", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!ev", name = "Ub", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!ev", name = "Wb", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!ev", name = "Xb", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!ev", name = "cc", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!ev", name = "dc", descriptor = "I")
    public static int field8778;

    @OriginalMember(owner = "client!ev", name = "gc", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!ev", name = "kc", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!ev", name = "lc", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!ev", name = "pc", descriptor = "I")
    public static int field8790;

    @OriginalMember(owner = "client!ev", name = "r", descriptor = "Lwk;")
    private class131 field8688;

    @OriginalMember(owner = "client!ev", name = "Tb", descriptor = "Lgb;")
    private class202 field8768;

    @OriginalMember(owner = "client!ev", name = "Y", descriptor = "Lsba;")
    public static class204 field8721;

    @OriginalMember(owner = "client!ev", name = "ab", descriptor = "Lqn;")
    private class60 field8723;

    @OriginalMember(owner = "client!ev", name = "O", descriptor = "S")
    private short field8711;

    @OriginalMember(owner = "client!ev", name = "S", descriptor = "S")
    private short field8715;

    @OriginalMember(owner = "client!ev", name = "nb", descriptor = "S")
    private short field8736;

    @OriginalMember(owner = "client!ev", name = "ob", descriptor = "S")
    private short field8737;

    @OriginalMember(owner = "client!ev", name = "yb", descriptor = "S")
    private short field8747;

    @OriginalMember(owner = "client!ev", name = "Yb", descriptor = "S")
    private short field8773;

    @OriginalMember(owner = "client!ev", name = "hc", descriptor = "S")
    private short field8782;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "()[Lefa;")
    public final class171[] method1917() {
        field8786++;
        return this.field8693;
    }

    @OriginalMember(owner = "client!ev", name = "ha", descriptor = "()I")
    public final int method1951() {
        field8769++;
        if (!this.field8689) {
            this.method3562((byte) 126);
        }
        return this.field8715;
    }

    @OriginalMember(owner = "client!ev", name = "DA", descriptor = "()I")
    public final int method1939() {
        field8771++;
        if (!this.field8689) {
            this.method3562((byte) 126);
        }
        return this.field8747;
    }

    @OriginalMember(owner = "client!ev", name = "LA", descriptor = "()I")
    public final int method1935() {
        field8730++;
        if (!this.field8689) {
            this.method3562((byte) 126);
        }
        return this.field8737;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method1931(int arg0, int arg1, class397 arg2, boolean arg3) {
        field8743++;
        class701 var5 = (class701) arg2;
        class701 var6 = this.field8758.field9276;
        float var7 = var5.field9868 * var6.field9860 + var5.field9874 * var6.field9878 + var5.field9863 * var6.field9881 + var6.field9874;
        float var8 = var5.field9868 * var6.field9861 + var5.field9874 * var6.field9887 + var5.field9863 * var6.field9884 + var6.field9863;
        class491.field6620 = var5.field9856 * var6.field9861 + var5.field9887 * var6.field9884 + var5.field9878 * var6.field9887;
        class177.field2727 = var5.field9883 * var6.field9861 + var5.field9861 * var6.field9884 + var5.field9860 * var6.field9887;
        class561.field7441 = var5.field9856 * var6.field9860 + var5.field9887 * var6.field9881 + var5.field9878 * var6.field9878;
        class1.field8 = var5.field9883 * var6.field9860 + var5.field9861 * var6.field9881 + var5.field9860 * var6.field9878;
        class441.field6055 = var5.field9883 * var6.field9883 + var5.field9861 * var6.field9858 + var5.field9860 * var6.field9856;
        class696.field9770 = var5.field9858 * var6.field9861 + var5.field9884 * var6.field9884 + var5.field9881 * var6.field9887;
        class158.field2489 = var5.field9856 * var6.field9883 + var5.field9887 * var6.field9858 + var5.field9878 * var6.field9856;
        class67.field1024 = var5.field9858 * var6.field9860 + var5.field9884 * var6.field9881 + var5.field9881 * var6.field9878;
        class346.field4759 = var5.field9858 * var6.field9883 + var5.field9884 * var6.field9858 + var5.field9881 * var6.field9856;
        float var9 = var5.field9868 * var6.field9883 + var5.field9874 * var6.field9856 + var5.field9863 * var6.field9858 + var6.field9868;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field8758.field9295;
        int var16 = this.field8758.field9306;
        if (!this.field8689) {
            this.method3562((byte) 126);
        }
        class38.field565[0] = this.field8715;
        class283.field4012[0] = this.field8747;
        class131.field2161[0] = this.field8737;
        class38.field565[1] = this.field8711;
        class283.field4012[1] = this.field8747;
        class38.field565[2] = this.field8715;
        class131.field2161[1] = this.field8737;
        class283.field4012[2] = this.field8736;
        class38.field565[3] = this.field8711;
        class131.field2161[2] = this.field8737;
        class283.field4012[3] = this.field8736;
        class131.field2161[3] = this.field8737;
        class38.field565[4] = this.field8715;
        class283.field4012[4] = this.field8747;
        class131.field2161[4] = this.field8782;
        class38.field565[5] = this.field8711;
        class283.field4012[5] = this.field8747;
        class38.field565[6] = this.field8715;
        class131.field2161[5] = this.field8782;
        class283.field4012[6] = this.field8736;
        class38.field565[7] = this.field8711;
        class131.field2161[6] = this.field8782;
        class283.field4012[7] = this.field8736;
        class131.field2161[7] = this.field8782;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class38.field565[var17];
            float var39 = (float) class131.field2161[var17];
            float var40 = (float) class283.field4012[var17];
            float var41 = class441.field6055 * var39 + class346.field4759 * var40 + class158.field2489 * var38 + var9;
            float var42 = class1.field8 * var39 + class67.field1024 * var40 + class561.field7441 * var38 + var7;
            float var43 = class177.field2727 * var39 + class696.field9770 * var40 + class491.field6620 * var38 + var8;
            if (var41 >= (float) this.field8758.field9326) {
                float var44 = (float) var15 * var42 / var41 + (float) this.field8758.field9233;
                float var45 = (float) var16 * var43 / var41 + (float) this.field8758.field9318;
                if (var44 < var11) {
                    var11 = var44;
                }
                if (var44 > var12) {
                    var12 = var44;
                }
                if (var45 < var13) {
                    var13 = var45;
                }
                var10 = true;
                if (var45 > var14) {
                    var14 = var45;
                }
            }
        }
        if (var10 && (float) arg0 > var11 && (float) arg0 < var12 && var13 < (float) arg1 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field8758.field9334.length < this.field8762) {
                this.field8758.field9334 = new int[this.field8762];
                this.field8758.field9339 = new int[this.field8762];
            }
            int[] var18 = this.field8758.field9334;
            int[] var19 = this.field8758.field9339;
            for (int var20 = 0; var20 < this.field8696; var20++) {
                float var22 = (float) this.field8788[var20];
                float var23 = (float) this.field8692[var20];
                float var24 = (float) this.field8789[var20];
                float var25 = class177.field2727 * var23 + class696.field9770 * var24 + class491.field6620 * var22 + var8;
                float var26 = class1.field8 * var23 + class67.field1024 * var24 + class561.field7441 * var22 + var7;
                float var27 = class441.field6055 * var23 + class346.field4759 * var24 + class158.field2489 * var22 + var9;
                if (var27 >= (float) this.field8758.field9326) {
                    int var28 = (int) ((float) var15 * var26 / var27 + (float) this.field8758.field9233);
                    int var29 = (int) ((float) var16 * var25 / var27 + (float) this.field8758.field9318);
                    int var30 = this.field8792[var20];
                    int var31 = this.field8792[var20 + 1];
                    for (int var32 = var30; var32 < var31; var32++) {
                        int var33 = this.field8684[var32] - 1;
                        if (var33 == -1) {
                            break;
                        }
                        var18[var33] = var28;
                        var19[var33] = var29;
                    }
                } else {
                    int var34 = this.field8792[var20];
                    int var35 = this.field8792[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field8684[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[this.field8684[var36] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field8720; var21++) {
                if (var18[this.field8780[var21]] != -999999 && var18[this.field8706[var21]] != -999999 && var18[this.field8783[var21]] != -999999 && this.method3553(var18[this.field8706[var21]], var18[this.field8780[var21]], 5, arg1, var18[this.field8783[var21]], var19[this.field8706[var21]], var19[this.field8783[var21]], arg0, var19[this.field8780[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "(III)V")
    public final void method1932(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field8696; var4++) {
            if (arg0 != 0) {
                this.field8788[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field8789[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field8692[var4] += arg2;
            }
        }
        field8707++;
        this.field8689 = false;
        if (this.field8695 != null) {
            this.field8695.field710 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
    private final void method3550(int arg0) {
        field8764++;
        if (arg0 != -1263217992 || this.field8759 == 0) {
            return;
        }
        if (this.field8719 != 0) {
            this.method3555(0, true);
        }
        this.method3555(0, false);
        if (this.field8728 != null) {
            if (this.field8728.field3447 == null) {
                this.method3551(false, (this.field8719 & 0x10) != 0);
            }
            if (this.field8728.field3447 != null) {
                this.field8758.method3653(this.field8748 != null, 1000);
                this.field8758.method3661(this.field8784, this.field8695, this.field8748, this.field8766, -79);
                int var2 = this.field8770.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field8770[var3];
                    int var5 = this.field8770[var3 + 1];
                    int var6 = this.field8718[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field8758.method3656(var6, this.field8748 != null, 20961);
                    this.field8758.method3605(var4 * 3, this.field8728.field3447, (var5 - var4) * 3, 4, (byte) 6);
                }
            }
        }
        this.method3559(0);
    }

    @OriginalMember(owner = "client!ev", name = "EA", descriptor = "()I")
    public final int method1952() {
        if (!this.field8689) {
            this.method3562((byte) 126);
        }
        field8761++;
        return this.field8736;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZZ)V")
    private final void method3551(boolean arg0, boolean arg1) {
        field8699++;
        if (this.field8758.field9278.field4600.length < (this.field8759 * 6)) {
            this.field8758.field9278 = new class85((this.field8759 + 100) * 6);
        } else {
            this.field8758.field9278.field4619 = 0;
        }
        class85 var3 = this.field8758.field9278;
        if (arg0) {
            this.method1913();
        }
        if (this.field8758.field9272) {
            for (int var5 = 0; var5 < this.field8759; var5++) {
                var3.method2031((byte) 54, this.field8780[var5]);
                var3.method2031((byte) 54, this.field8706[var5]);
                var3.method2031((byte) 54, this.field8783[var5]);
            }
        } else {
            for (int var4 = 0; var4 < this.field8759; var4++) {
                var3.method2008(27798, this.field8780[var4]);
                var3.method2008(27798, this.field8706[var4]);
                var3.method2008(27798, this.field8783[var4]);
            }
        }
        if (var3.field4619 == 0) {
            return;
        }
        if (arg1) {
            if (this.field8723 == null) {
                this.field8723 = this.field8758.method3625(true, var3.field4600, -7206, var3.field4619, 5123);
            } else {
                this.field8723.method490(5123, var3.field4619, !arg0, var3.field4600);
            }
            this.field8728.field3447 = this.field8723;
        } else {
            this.field8728.field3447 = this.field8758.method3625(false, var3.field4600, -7206, var3.field4619, 5123);
        }
        if (!arg1) {
            this.field8712 = true;
        }
    }

    @OriginalMember(owner = "client!ev", name = "ua", descriptor = "(IIII)V")
    public final void method1911(int arg0, int arg1, int arg2, int arg3) {
        field8753++;
        if (arg0 == 0) {
            class460.field6244 = 0;
            class658.field9063 = 0;
            int var5 = 0;
            class39.field580 = 0;
            for (int var6 = 0; var6 < this.field8696; var6++) {
                class460.field6244 += this.field8788[var6];
                class39.field580 += this.field8789[var6];
                var5++;
                class658.field9063 += this.field8692[var6];
            }
            if (var5 > 0) {
                class460.field6244 = class460.field6244 / var5 + arg1;
                class39.field580 = class39.field580 / var5 + arg2;
                class658.field9063 = class658.field9063 / var5 + arg3;
            } else {
                class39.field580 = arg2;
                class658.field9063 = arg3;
                class460.field6244 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field8696; var7++) {
                this.field8788[var7] += arg1;
                this.field8789[var7] += arg2;
                this.field8692[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field8696; var8++) {
                this.field8788[var8] -= class460.field6244;
                this.field8789[var8] -= class39.field580;
                this.field8692[var8] -= class658.field9063;
                if (arg3 != 0) {
                    int var9 = class126.field2116[arg3];
                    int var10 = class126.field2105[arg3];
                    int var11 = this.field8789[var8] * var9 + this.field8788[var8] * var10 + 16383 >> 14;
                    this.field8789[var8] = this.field8789[var8] * var10 + 16383 - (this.field8788[var8] * var9) >> 14;
                    this.field8788[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class126.field2116[arg1];
                    int var13 = class126.field2105[arg1];
                    int var14 = this.field8789[var8] * var13 + 16383 - (this.field8692[var8] * var12) >> 14;
                    this.field8692[var8] = this.field8789[var8] * var12 + this.field8692[var8] * var13 + 16383 >> 14;
                    this.field8789[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class126.field2116[arg2];
                    int var16 = class126.field2105[arg2];
                    int var17 = this.field8788[var8] * var16 + this.field8692[var8] * var15 + 16383 >> 14;
                    this.field8692[var8] = this.field8692[var8] * var16 + 16383 - (this.field8788[var8] * var15) >> 14;
                    this.field8788[var8] = var17;
                }
                this.field8788[var8] += class460.field6244;
                this.field8789[var8] += class39.field580;
                this.field8692[var8] += class658.field9063;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field8696; var18++) {
                this.field8788[var18] -= class460.field6244;
                this.field8789[var18] -= class39.field580;
                this.field8692[var18] -= class658.field9063;
                this.field8788[var18] = this.field8788[var18] * arg1 / 128;
                this.field8789[var18] = this.field8789[var18] * arg2 / 128;
                this.field8692[var18] = this.field8692[var18] * arg3 / 128;
                this.field8788[var18] += class460.field6244;
                this.field8789[var18] += class39.field580;
                this.field8692[var18] += class658.field9063;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field8720; var19++) {
                int var23 = (this.field8752[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field8752[var19] = (byte) var23;
            }
            if (this.field8784 != null) {
                this.field8784.field710 = null;
            }
            if (this.field8749 != null) {
                for (int var20 = 0; var20 < this.field8774; var20++) {
                    class142 var21 = this.field8749[var20];
                    class59 var22 = this.field8775[var20];
                    var22.field908 = 255 - (this.field8752[var21.field2292] & 0xFF) << 24 | var22.field908 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field8720; var24++) {
                int var28 = this.field8702[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3AD) >> 7;
                int var31 = arg2 / 4 + var30;
                int var32 = var28 & 0x7F;
                int var33 = arg1 + var29 & 0x3F;
                int var34 = arg3 + var32;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field8702[var24] = (short) class220.method1393(class220.method1393(var33 << 10, var31 << 7), var34);
            }
            if (this.field8784 != null) {
                this.field8784.field710 = null;
            }
            if (this.field8749 != null) {
                for (int var25 = 0; var25 < this.field8774; var25++) {
                    class142 var26 = this.field8749[var25];
                    class59 var27 = this.field8775[var25];
                    var27.field908 = class444.field6084[this.field8702[var26.field2292] & 0xFFFF] & 0xFFFFFF | var27.field908 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field8774; var35++) {
                class59 var36 = this.field8775[var35];
                var36.field915 += arg2;
                var36.field909 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field8774; var37++) {
                class59 var38 = this.field8775[var37];
                var38.field911 = var38.field911 * arg2 >> 7;
                var38.field907 = var38.field907 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field8774; var39++) {
                class59 var40 = this.field8775[var39];
                var40.field913 = var40.field913 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lq;Lot;II)V")
    public final void method1906(class397 arg0, class552 arg1, int arg2, int arg3) {
        field8732++;
        if (this.field8762 == 0) {
            return;
        }
        class701 var5 = this.field8758.field9276;
        if (!this.field8689) {
            this.method3562((byte) 126);
        }
        class701 var6 = (class701) arg0;
        class346.field4759 = var5.field9883 * var6.field9858 + var5.field9858 * var6.field9884 + var5.field9856 * var6.field9881;
        class29.field480 = var5.field9883 * var6.field9868 + var5.field9858 * var6.field9863 + var5.field9856 * var6.field9874 + var5.field9868;
        float var7 = (float) this.field8747 * class346.field4759 + class29.field480;
        float var8 = (float) this.field8736 * class346.field4759 + class29.field480;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var9 = (float) (-this.field8773) + var8;
            var10 = (float) this.field8773 + var7;
        } else {
            var9 = (float) (-this.field8773) + var7;
            var10 = (float) this.field8773 + var8;
        }
        if ((var9 >= this.field8758.field9265) || ((float) this.field8758.field9326 >= var10)) {
            return;
        }
        class67.field1024 = var5.field9860 * var6.field9858 + var5.field9881 * var6.field9884 + var5.field9878 * var6.field9881;
        class172.field2656 = var5.field9860 * var6.field9868 + var5.field9881 * var6.field9863 + var5.field9878 * var6.field9874 + var5.field9874;
        float var11 = (float) this.field8747 * class67.field1024 + class172.field2656;
        float var12 = (float) this.field8736 * class67.field1024 + class172.field2656;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var14 = ((float) this.field8773 + var11) * (float) this.field8758.field9295;
            var13 = (var12 - (float) this.field8773) * (float) this.field8758.field9295;
        } else {
            var13 = ((float) (-this.field8773) + var11) * (float) this.field8758.field9295;
            var14 = ((float) this.field8773 + var12) * (float) this.field8758.field9295;
        }
        if ((var13 / (float) arg2 >= this.field8758.field9261) || (var14 / (float) arg2 <= this.field8758.field9327)) {
            return;
        }
        class637.field8583 = var5.field9861 * var6.field9868 + var5.field9887 * var6.field9874 + var5.field9884 * var6.field9863 + var5.field9863;
        class696.field9770 = var5.field9861 * var6.field9858 + var5.field9887 * var6.field9881 + var5.field9884 * var6.field9884;
        float var15 = (float) this.field8747 * class696.field9770 + class637.field8583;
        float var16 = (float) this.field8736 * class696.field9770 + class637.field8583;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) this.field8773 + var15) * (float) this.field8758.field9306;
            var18 = ((float) (-this.field8773) + var16) * (float) this.field8758.field9306;
        } else {
            var18 = (var15 - (float) this.field8773) * (float) this.field8758.field9306;
            var17 = ((float) this.field8773 + var16) * (float) this.field8758.field9306;
        }
        if ((this.field8758.field9323 <= var18 / (float) arg2) || (this.field8758.field9312 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field8749 != null) {
            class177.field2727 = var5.field9861 * var6.field9883 + var5.field9887 * var6.field9860 + var5.field9884 * var6.field9861;
            class561.field7441 = var5.field9860 * var6.field9856 + var5.field9881 * var6.field9887 + var5.field9878 * var6.field9878;
            class158.field2489 = var5.field9883 * var6.field9856 + var5.field9858 * var6.field9887 + var5.field9856 * var6.field9878;
            class491.field6620 = var5.field9861 * var6.field9856 + var5.field9887 * var6.field9878 + var5.field9884 * var6.field9887;
            class441.field6055 = var5.field9883 * var6.field9883 + var5.field9858 * var6.field9861 + var5.field9856 * var6.field9860;
            class1.field8 = var5.field9860 * var6.field9883 + var5.field9881 * var6.field9861 + var5.field9878 * var6.field9860;
        }
        if (arg1 != null) {
            int var19 = this.field8715 + this.field8711 >> 1;
            int var20 = this.field8782 + this.field8737 >> 1;
            int var21 = (int) ((float) var20 * class1.field8 + (float) this.field8747 * class67.field1024 + (float) var19 * class561.field7441 + class172.field2656);
            int var22 = (int) ((float) var20 * class177.field2727 + (float) this.field8747 * class696.field9770 + (float) var19 * class491.field6620 + class637.field8583);
            int var23 = (int) ((float) var20 * class441.field6055 + (float) this.field8747 * class346.field4759 + (float) var19 * class158.field2489 + class29.field480);
            int var24 = (int) ((float) var20 * class1.field8 + (float) this.field8736 * class67.field1024 + (float) var19 * class561.field7441 + class172.field2656);
            int var25 = (int) ((float) var20 * class177.field2727 + (float) this.field8736 * class696.field9770 + (float) var19 * class491.field6620 + class637.field8583);
            arg1.field7343 = this.field8758.field9295 * var24 / arg2 + this.field8758.field9233;
            arg1.field7342 = this.field8758.field9318 + (this.field8758.field9306 * var25 / arg2);
            int var26 = (int) ((float) var20 * class441.field6055 + (float) this.field8736 * class346.field4759 + (float) var19 * class158.field2489 + class29.field480);
            arg1.field7346 = this.field8758.field9295 * var21 / arg2 + this.field8758.field9233;
            arg1.field7345 = this.field8758.field9306 * var22 / arg2 + this.field8758.field9318;
            if (this.field8758.field9326 > var23 && this.field8758.field9326 > var26) {
                arg1.field7344 = this.field8758.field9233 + ((this.field8773 + var21) * this.field8758.field9295 / arg2) - arg1.field7346;
                arg1.field7341 = true;
            }
        }
        this.field8758.method3655((float) arg2, 86);
        this.field8758.method3676(-42);
        this.field8758.method3634(var6, (byte) -122);
        this.method3550(-1263217992);
        this.field8758.method3681(34166);
        this.method3554(-25037);
    }

    @OriginalMember(owner = "client!ev", name = "P", descriptor = "()V")
    public final void method1903() {
        for (int var1 = 0; var1 < this.field8696; var1++) {
            this.field8692[var1] = -this.field8692[var1];
        }
        field8729++;
        for (int var2 = 0; var2 < this.field8762; var2++) {
            this.field8746[var2] = (short) (-this.field8746[var2]);
        }
        for (int var3 = 0; var3 < this.field8720; var3++) {
            short var4 = this.field8780[var3];
            this.field8780[var3] = this.field8783[var3];
            this.field8783[var3] = var4;
        }
        if (this.field8748 == null && this.field8784 != null) {
            this.field8784.field710 = null;
        }
        if (this.field8748 != null) {
            this.field8748.field710 = null;
        }
        if (this.field8728 != null) {
            this.field8728.field3447 = null;
        }
        this.field8689 = false;
        if (this.field8695 != null) {
            this.field8695.field710 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "()Z")
    public final boolean method1948() {
        field8772++;
        if (this.field8718 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field8718.length; var1++) {
            if (this.field8718[var1] != -1 && !this.field8758.field8808.method2759(32700, this.field8718[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ev", name = "AA", descriptor = "(I)V")
    public final void method1933(int arg0) {
        field8767++;
        int var2 = class126.field2116[arg0];
        int var3 = class126.field2105[arg0];
        for (int var4 = 0; var4 < this.field8696; var4++) {
            int var5 = this.field8789[var4] * var3 - (this.field8692[var4] * var2) >> 14;
            this.field8692[var4] = this.field8789[var4] * var2 + (this.field8692[var4] * var3) >> 14;
            this.field8789[var4] = var5;
        }
        this.field8689 = false;
        if (this.field8695 != null) {
            this.field8695.field710 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "F", descriptor = "()I")
    public final int method1928() {
        field8717++;
        return this.field8700;
    }

    @OriginalMember(owner = "client!ev", name = "OA", descriptor = "(IILd;Ld;III)V")
    public final void method1919(int arg0, int arg1, class139 arg2, class139 arg3, int arg4, int arg5, int arg6) {
        field8785++;
        if (!this.field8689) {
            this.method3562((byte) 126);
        }
        int var8 = this.field8715 + arg4;
        int var9 = this.field8711 + arg4;
        int var10 = arg6 + this.field8737;
        int var11 = this.field8782 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field2250 + var9 >> arg2.field2245 >= arg2.field2247 || var10 < 0 || arg2.field2248 <= (var11 + arg2.field2250 >> arg2.field2245)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (arg3.field2250 + var9 >> arg3.field2245) >= arg3.field2247 || var10 < 0 || arg3.field2248 <= (arg3.field2250 + var11 >> arg3.field2245)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field2245;
            int var13 = var9 + arg2.field2250 - 1 >> arg2.field2245;
            int var14 = var10 >> arg2.field2245;
            int var15 = var11 - (1 - arg2.field2250) >> arg2.field2245;
            if (arg5 == arg2.method195(var12, var14) && arg2.method195(var13, var14) == arg5 && arg5 == arg2.method195(var12, var15) && arg5 == arg2.method195(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field8696; var16++) {
                this.field8789[var16] = this.field8789[var16] + arg2.method200(this.field8788[var16] + arg4, this.field8692[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field8747;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field8696; var18++) {
                int var19 = (this.field8789[var18] << 16) / var17;
                if (arg1 > var19) {
                    this.field8789[var18] += (arg2.method200(this.field8788[var18] + arg4, this.field8692[var18] + arg6) - arg5) * (arg1 - var19) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = (arg1 >> 8 & 0xFF) * 4;
            int var22 = arg1 >> 16 & 0xFF << 6;
            int var23 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var20 >> 1)) < 0 || ((var20 >> 1) + arg4 + arg2.field2250) >= (arg2.field2247 << arg2.field2245) || arg6 - (var21 >> 1) < 0 || arg2.field2248 << arg2.field2245 <= arg2.field2250 + arg6 + (var21 >> 1)) {
                return;
            }
            this.method2109(var21, var20, arg6, arg2, arg5, -2461, var23, var22, arg4);
        } else if (arg0 == 4) {
            int var24 = this.field8736 - this.field8747;
            for (int var25 = 0; var25 < this.field8696; var25++) {
                this.field8789[var25] = this.field8789[var25] + arg3.method200(this.field8788[var25] + arg4, this.field8692[var25] + arg6) - (arg5 - var24);
            }
        } else if (arg0 == 5) {
            int var26 = this.field8736 - this.field8747;
            for (int var27 = 0; var27 < this.field8696; var27++) {
                int var28 = this.field8788[var27] + arg4;
                int var29 = this.field8692[var27] + arg6;
                int var30 = arg2.method200(var28, var29);
                int var31 = arg3.method200(var28, var29);
                int var32 = var30 - var31 - arg1;
                this.field8789[var27] = ((this.field8789[var27] << 8) / var26 * var32 >> 8) + var30 - arg5;
            }
        }
        if (this.field8695 != null) {
            this.field8695.field710 = null;
        }
        this.field8689 = false;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(FIJFIBLpf;III)S")
    private final short method3552(float arg0, int arg1, long arg2, float arg3, int arg4, byte arg5, class545 arg6, int arg7, int arg8, int arg9) {
        field8687++;
        int var12 = this.field8792[arg4];
        int var13 = this.field8792[arg4 + 1];
        int var14 = 0;
        if (arg5 != 98) {
            this.field8773 = 116;
        }
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field8684[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class115.field1971[var15] == arg2) {
                return (short) (var16 - 1);
            }
        }
        this.field8684[var14] = (short) (this.field8762 + 1);
        class115.field1971[var14] = arg2;
        this.field8776[this.field8762] = (short) arg1;
        this.field8685[this.field8762] = (short) arg7;
        this.field8746[this.field8762] = (short) arg9;
        this.field8724[this.field8762] = (byte) arg8;
        this.field8779[this.field8762] = arg0;
        this.field8691[this.field8762] = arg3;
        return (short) (this.field8762++);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method3553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8751++;
        if (arg8 > arg3 && arg5 > arg3 && arg6 > arg3) {
            return false;
        }
        if (arg2 != 5) {
            this.field8783 = null;
        }
        if (arg8 < arg3 && arg5 < arg3 && arg6 < arg3) {
            return false;
        } else if (arg7 < arg1 && arg0 > arg7 && arg4 > arg7) {
            return false;
        } else {
            return arg1 >= arg7 || arg7 <= arg0 || arg7 <= arg4;
        }
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)V")
    private final void method3554(int arg0) {
        if (this.field8749 != null) {
            class701 var2 = this.field8758.field9182;
            float var3 = this.field8758.method3667();
            float var4 = this.field8758.method3670();
            this.field8758.method3673(260);
            this.field8758.method407(false);
            this.field8758.method3653(false, arg0 ^ 0xFFFF9DDB);
            this.field8758.method3661(null, this.field8758.field9255, null, this.field8758.field9325, -36);
            for (int var5 = 0; var5 < this.field8774; var5++) {
                class142 var6 = this.field8749[var5];
                class59 var7 = this.field8775[var5];
                if (!var6.field2293 || !this.field8758.method96()) {
                    float var8 = (float) (this.field8788[var6.field2299] + this.field8788[var6.field2297] + this.field8788[var6.field2290]) * 0.3333333F;
                    float var9 = (float) (this.field8789[var6.field2299] + this.field8789[var6.field2297] + this.field8789[var6.field2290]) * 0.3333333F;
                    float var10 = (float) (this.field8692[var6.field2299] + this.field8692[var6.field2290] + this.field8692[var6.field2297]) * 0.3333333F;
                    float var11 = class1.field8 * var10 + class67.field1024 * var9 + class561.field7441 * var8 + class172.field2656;
                    float var12 = class177.field2727 * var10 + class696.field9770 * var9 + class491.field6620 * var8 + class637.field8583;
                    float var13 = class441.field6055 * var10 + class346.field4759 * var9 + class158.field2489 * var8 + class29.field480;
                    var2.method3876(arg0 ^ 0xFFFFA1CC, var6.field2296 * var7.field911 >> 7, var6.field2294 * var7.field907 >> 7, -var13, (float) var7.field909 + var11, (float) var7.field915 + -var12, var7.field913);
                    this.field8758.method3618(-81, var2);
                    this.field8758.method385(var4, var3 - ((float) var6.field2298 * 1.5F));
                    int var14 = var7.field908;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field8758.method3679(-72, var6.field2289);
                    this.field8758.method3646(arg0 ^ 0x61CD, var6.field2295);
                    this.field8758.method3615(7, 0, false, 4);
                }
            }
            this.field8758.method385(var4, var3);
            this.field8758.method407(true);
            this.field8758.method3681(arg0 + 59203);
        }
        field8705++;
        if (arg0 != -25037) {
            this.field8780 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIII)V")
    public final void method1897(int arg0, int arg1, int arg2, int arg3) {
        field8778++;
        for (int var5 = 0; var5 < this.field8720; var5++) {
            int var9 = this.field8702[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x3F2) >> 7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field8702[var5] = (short) class220.method1393(var12, class220.method1393(var11 << 7, var10 << 10));
        }
        if (this.field8749 != null) {
            for (int var6 = 0; var6 < this.field8774; var6++) {
                class142 var7 = this.field8749[var6];
                class59 var8 = this.field8775[var6];
                var8.field908 = class444.field6084[this.field8702[var7.field2292] & 0xFFFF] & 0xFFFFFF | var8.field908 & 0xFF000000;
            }
        }
        if (this.field8784 != null) {
            this.field8784.field710 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "I", descriptor = "(I)V")
    public final void method1898(int arg0) {
        field8765++;
        int var2 = class126.field2116[arg0];
        int var3 = class126.field2105[arg0];
        for (int var4 = 0; var4 < this.field8696; var4++) {
            int var5 = this.field8788[var4] * var3 + this.field8692[var4] * var2 >> 14;
            this.field8692[var4] = this.field8692[var4] * var3 - (this.field8788[var4] * var2) >> 14;
            this.field8788[var4] = var5;
        }
        if (this.field8695 != null) {
            this.field8695.field710 = null;
        }
        this.field8689 = false;
    }

    @OriginalMember(owner = "client!ev", name = "M", descriptor = "()I")
    public final int method1936() {
        field8756++;
        if (!this.field8689) {
            this.method3562((byte) 126);
        }
        return this.field8711;
    }

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "()[Ljt;")
    public final class93[] method1920() {
        field8757++;
        return this.field8697;
    }

    @OriginalMember(owner = "client!ev", name = "Q", descriptor = "()Z")
    public final boolean method1900() {
        field8701++;
        if (this.field8755 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field8787; var1++) {
            this.field8788[var1] <<= 0x4;
            this.field8789[var1] <<= 0x4;
            this.field8692[var1] <<= 0x4;
        }
        class658.field9063 = 0;
        class460.field6244 = 0;
        class39.field580 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ev", name = "D", descriptor = "(I)V")
    public final void method1946(int arg0) {
        this.field8714 = (short) arg0;
        if (this.field8784 != null) {
            this.field8784.field710 = null;
        }
        field8726++;
    }

    @OriginalMember(owner = "client!ev", name = "u", descriptor = "()I")
    public final int method1950() {
        field8731++;
        return this.field8714;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZ)V")
    private final void method3555(int arg0, boolean arg1) {
        field8763++;
        boolean var3 = this.field8784 != null && this.field8784.field710 == null;
        boolean var4 = this.field8748 != null && this.field8748.field710 == null;
        boolean var5 = this.field8695 != null && this.field8695.field710 == null;
        boolean var6 = this.field8766 != null && this.field8766.field710 == null;
        if (arg1) {
            var3 &= (this.field8719 & 0x2) != 0;
            var4 &= (this.field8719 & 0x4) != 0;
            var5 &= (this.field8719 & 0x1) != 0;
            var6 &= (this.field8719 & 0x8) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        byte var11 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
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
        if (this.field8758.field9278.field4600.length < (this.field8762 * var7)) {
            this.field8758.field9278 = new class85((this.field8762 + 100) * var7);
        } else {
            this.field8758.field9278.field4619 = 0;
        }
        class85 var12 = this.field8758.field9278;
        if (var5) {
            if (this.field8758.field9272) {
                for (int var21 = 0; var21 < this.field8696; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field8788[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field8789[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field8692[var21]);
                    int var25 = this.field8792[var21];
                    int var26 = this.field8792[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field8684[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field4619 = var7 * var28;
                        var12.method1982(var22, (byte) 63);
                        var12.method1982(var23, (byte) 63);
                        var12.method1982(var24, (byte) 63);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field8696; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field8788[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field8789[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field8692[var13]);
                    int var17 = this.field8792[var13];
                    int var18 = this.field8792[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field8684[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field4619 = var7 * var20;
                        var12.method2032(var14, false);
                        var12.method2032(var15, false);
                        var12.method2032(var16, false);
                    }
                }
            }
        }
        if (var3) {
            if (this.field8748 == null) {
                short[] var29;
                short[] var30;
                short[] var31;
                byte[] var32;
                if (this.field8688 == null) {
                    var31 = this.field8776;
                    var30 = this.field8746;
                    var29 = this.field8685;
                    var32 = this.field8724;
                } else {
                    var29 = this.field8688.field2155;
                    var30 = this.field8688.field2163;
                    var31 = this.field8688.field2162;
                    var32 = this.field8688.field2160;
                }
                float var33 = this.field8758.field9216[0];
                float var34 = this.field8758.field9216[1];
                float var35 = this.field8758.field9216[2];
                float var36 = this.field8758.field9293;
                float var37 = this.field8758.field9213 * 768.0F / (float) this.field8700;
                float var38 = this.field8758.field9235 * 768.0F / (float) this.field8700;
                for (int var39 = 0; var39 < this.field8720; var39++) {
                    int var40 = this.method3561(this.field8718[var39], this.field8702[var39], arg0 ^ 0x36EF, this.field8714, this.field8752[var39]);
                    float var41 = (float) (var40 >>> 24) * this.field8758.field9239;
                    float var42 = (float) ((var40 & 0xFFD922) >> 16) * this.field8758.field9214;
                    float var43 = (float) (var40 >> 8 & 0xFF) * this.field8758.field9324;
                    short var44 = this.field8780[var39];
                    short var45 = (short) var32[var44];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var30[var44] * var35 + (float) var29[var44] * var34 + (float) var31[var44] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var30[var44] * var35 + (float) var29[var44] * var34 + (float) var31[var44] * var33) / (float) (var45 * 256);
                    }
                    float var47 = var46 * (var46 < 0.0F ? var38 : var37) + var36;
                    int var48 = (int) (var41 * var47);
                    int var49 = (int) (var42 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var50 = (int) (var43 * var47);
                    var12.field4619 = var7 * var44 + var9;
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method1980(-345277664, var48);
                    var12.method1980(-345277664, var49);
                    var12.method1980(arg0 - 345277664, var50);
                    var12.method1980(arg0 - 345277664, -(this.field8752[var39] & 0xFF) + 255);
                    short var51 = this.field8706[var39];
                    short var52 = (short) var32[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var30[var51] * var35 + (float) var29[var51] * var34 + (float) var31[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var30[var51] * var35 + (float) var29[var51] * var34 + (float) var31[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = var36 + ((var53 < 0.0F) ? var38 : var37) * var53;
                    int var55 = (int) (var41 * var54);
                    int var56 = (int) (var42 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var57 = (int) (var43 * var54);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    var12.field4619 = var7 * var51 + var9;
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.method1980(arg0 ^ 0xEB6B7B20, var55);
                    var12.method1980(arg0 ^ 0xEB6B7B20, var56);
                    var12.method1980(-345277664, var57);
                    var12.method1980(-345277664, 255 - (this.field8752[var39] & 0xFF));
                    short var58 = this.field8783[var39];
                    short var59 = (short) var32[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var30[var58] * var35 + (float) var29[var58] * var34 + (float) var31[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var30[var58] * var35 + (float) var29[var58] * var34 + (float) var31[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = ((var60 < 0.0F) ? var38 : var37) * var60 + var36;
                    int var62 = (int) (var41 * var61);
                    int var63 = (int) (var42 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var64 = (int) (var43 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    var12.field4619 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method1980(-345277664, var62);
                    var12.method1980(-345277664, var63);
                    var12.method1980(-345277664, var64);
                    var12.method1980(-345277664, 255 - (this.field8752[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field8720; var65++) {
                    int var66 = this.method3561(this.field8718[var65], this.field8702[var65], 14063, this.field8714, this.field8752[var65]);
                    var12.field4619 = this.field8780[var65] * var7 + var9;
                    var12.method1982(var66, (byte) 63);
                    var12.field4619 = this.field8706[var65] * var7 + var9;
                    var12.method1982(var66, (byte) 63);
                    var12.field4619 = this.field8783[var65] * var7 + var9;
                    var12.method1982(var66, (byte) 63);
                }
            }
        }
        if (var4) {
            short[] var67;
            byte[] var68;
            short[] var69;
            short[] var70;
            if (this.field8688 == null) {
                var67 = this.field8685;
                var68 = this.field8724;
                var69 = this.field8776;
                var70 = this.field8746;
            } else {
                var67 = this.field8688.field2155;
                var68 = this.field8688.field2160;
                var69 = this.field8688.field2162;
                var70 = this.field8688.field2163;
            }
            float var71 = 3.0F / (float) this.field8700;
            float var72 = 3.0F / (float) (this.field8700 / 2 + this.field8700);
            var12.field4619 = var10;
            if (this.field8758.field9272) {
                for (int var73 = 0; var73 < this.field8762; var73++) {
                    int var74 = var68[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method693((float) var69[var73] * var72, 103);
                        var12.method693((float) var67[var73] * var72, arg0 + 79);
                        var12.method693((float) var70[var73] * var72, arg0 + 35);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method693((float) var69[var73] * var75, 92);
                        var12.method693((float) var67[var73] * var75, arg0 + 95);
                        var12.method693((float) var70[var73] * var75, 68);
                    }
                    var12.field4619 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field8762; var76++) {
                    int var77 = var68[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method692(116, (float) var69[var76] * var72);
                        var12.method692(117, (float) var67[var76] * var72);
                        var12.method692(117, (float) var70[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method692(arg0 + 124, (float) var69[var76] * var78);
                        var12.method692(-114, (float) var67[var76] * var78);
                        var12.method692(118, (float) var70[var76] * var78);
                    }
                    var12.field4619 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field4619 = var11;
            if (this.field8758.field9272) {
                for (int var79 = 0; var79 < this.field8762; var79++) {
                    var12.method693(this.field8779[var79], 75);
                    var12.method693(this.field8691[var79], 64);
                    var12.field4619 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field8762; var80++) {
                    var12.method692(arg0 - 62, this.field8779[var80]);
                    var12.method692(arg0 ^ 0x6E, this.field8691[var80]);
                    var12.field4619 += var7 - 8;
                }
            }
        }
        var12.field4619 = this.field8762 * var7;
        class202 var81;
        if (arg1) {
            if (this.field8768 == null) {
                this.field8768 = this.field8758.method3641(var7, var12.field4600, true, 5225, var12.field4619);
            } else {
                this.field8768.method1322(var12.field4600, var7, var12.field4619, 9043);
            }
            this.field8719 = 0;
            var81 = this.field8768;
        } else {
            var81 = this.field8758.method3641(var7, var12.field4600, false, 5225, var12.field4619);
            this.field8712 = true;
        }
        if (var5) {
            this.field8695.field711 = var8;
            this.field8695.field710 = var81;
        }
        if (var6) {
            this.field8766.field710 = var81;
            this.field8766.field711 = var11;
        }
        if (var3) {
            this.field8784.field710 = var81;
            this.field8784.field711 = var9;
        }
        if (arg0 == 0 && var4) {
            this.field8748.field711 = var10;
            this.field8748.field710 = var81;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILev;Lev;IZZ)Lba;")
    private final class358 method3556(int arg0, class649 arg1, class649 arg2, int arg3, boolean arg4, boolean arg5) {
        arg2.field8719 = 0;
        arg2.field8700 = this.field8700;
        arg2.field8703 = arg0;
        arg2.field8787 = this.field8787;
        arg2.field8759 = this.field8759;
        arg2.field8714 = this.field8714;
        arg2.field8696 = this.field8696;
        arg2.field8762 = this.field8762;
        arg2.field8738 = this.field8738;
        arg2.field8720 = this.field8720;
        arg2.field8774 = this.field8774;
        field8745++;
        boolean var7 = class445.method2510((byte) -117, this.field8738, arg0);
        boolean var8 = class290.method1786(this.field8738, arg0, (byte) 127);
        boolean var9 = class480.method2679(this.field8738, -1, arg0);
        boolean var10 = var9 | var8 | var7;
        if (var10) {
            if (!var7) {
                arg2.field8788 = this.field8788;
            } else if (arg1.field8788 == null || arg1.field8788.length < this.field8787) {
                arg2.field8788 = arg1.field8788 = new int[this.field8787];
            } else {
                arg2.field8788 = arg1.field8788;
            }
            if (!var8) {
                arg2.field8789 = this.field8789;
            } else if (arg1.field8789 == null || arg1.field8789.length < this.field8787) {
                arg2.field8789 = arg1.field8789 = new int[this.field8787];
            } else {
                arg2.field8789 = arg1.field8789;
            }
            if (!var9) {
                arg2.field8692 = this.field8692;
            } else if (arg1.field8692 == null || arg1.field8692.length < this.field8787) {
                arg2.field8692 = arg1.field8692 = new int[this.field8787];
            } else {
                arg2.field8692 = arg1.field8692;
            }
            for (int var11 = 0; var11 < this.field8787; var11++) {
                if (var7) {
                    arg2.field8788[var11] = this.field8788[var11];
                }
                if (var8) {
                    arg2.field8789[var11] = this.field8789[var11];
                }
                if (var9) {
                    arg2.field8692[var11] = this.field8692[var11];
                }
            }
        } else {
            arg2.field8692 = this.field8692;
            arg2.field8789 = this.field8789;
            arg2.field8788 = this.field8788;
        }
        if (class565.method3097((byte) 17, this.field8738, arg0)) {
            arg2.field8695 = arg1.field8695;
            if (arg5) {
                arg2.field8719 = (byte) (arg2.field8719 | 0x1);
            }
            arg2.field8695.field711 = this.field8695.field711;
            arg2.field8695.field710 = this.field8695.field710;
        } else if (class239.method1482(0, arg0, this.field8738)) {
            arg2.field8695 = this.field8695;
        } else {
            arg2.field8695 = null;
        }
        if (class280.method1744(-8401, this.field8738, arg0)) {
            if (arg1.field8702 == null || this.field8720 > arg1.field8702.length) {
                arg2.field8702 = arg1.field8702 = new short[this.field8720];
            } else {
                arg2.field8702 = arg1.field8702;
            }
            for (int var12 = 0; var12 < this.field8720; var12++) {
                arg2.field8702[var12] = this.field8702[var12];
            }
        } else {
            arg2.field8702 = this.field8702;
        }
        if (class281.method1748(arg3 + 15118, this.field8738, arg0)) {
            if (arg1.field8752 == null || this.field8720 > arg1.field8752.length) {
                arg2.field8752 = arg1.field8752 = new byte[this.field8720];
            } else {
                arg2.field8752 = arg1.field8752;
            }
            for (int var13 = 0; var13 < this.field8720; var13++) {
                arg2.field8752[var13] = this.field8752[var13];
            }
        } else {
            arg2.field8752 = this.field8752;
        }
        if (class252.method1532(this.field8738, (byte) -54, arg0)) {
            if (arg5) {
                arg2.field8719 = (byte) (arg2.field8719 | 0x2);
            }
            arg2.field8784 = arg1.field8784;
            arg2.field8784.field710 = this.field8784.field710;
            arg2.field8784.field711 = this.field8784.field711;
        } else if (class620.method3399((byte) 75, this.field8738, arg0)) {
            arg2.field8784 = this.field8784;
        } else {
            arg2.field8784 = null;
        }
        if (class492.method2747((byte) -128, this.field8738, arg0)) {
            if (arg1.field8776 == null || arg1.field8776.length < this.field8762) {
                int var14 = this.field8762;
                arg2.field8776 = arg1.field8776 = new short[var14];
                arg2.field8746 = arg1.field8746 = new short[var14];
                arg2.field8685 = arg1.field8685 = new short[var14];
            } else {
                arg2.field8776 = arg1.field8776;
                arg2.field8685 = arg1.field8685;
                arg2.field8746 = arg1.field8746;
            }
            if (this.field8688 == null) {
                for (int var15 = 0; var15 < this.field8762; var15++) {
                    arg2.field8776[var15] = this.field8776[var15];
                    arg2.field8685[var15] = this.field8685[var15];
                    arg2.field8746[var15] = this.field8746[var15];
                }
            } else {
                if (arg1.field8688 == null) {
                    arg1.field8688 = new class131();
                }
                class131 var16 = arg2.field8688 = arg1.field8688;
                if (var16.field2162 == null || var16.field2162.length < this.field8762) {
                    int var17 = this.field8762;
                    var16.field2163 = new short[var17];
                    var16.field2162 = new short[var17];
                    var16.field2155 = new short[var17];
                    var16.field2160 = new byte[var17];
                }
                for (int var18 = 0; var18 < this.field8762; var18++) {
                    arg2.field8776[var18] = this.field8776[var18];
                    arg2.field8685[var18] = this.field8685[var18];
                    arg2.field8746[var18] = this.field8746[var18];
                    var16.field2162[var18] = this.field8688.field2162[var18];
                    var16.field2155[var18] = this.field8688.field2155[var18];
                    var16.field2163[var18] = this.field8688.field2163[var18];
                    var16.field2160[var18] = this.field8688.field2160[var18];
                }
            }
            arg2.field8724 = this.field8724;
        } else {
            arg2.field8688 = this.field8688;
            arg2.field8776 = this.field8776;
            arg2.field8685 = this.field8685;
            arg2.field8746 = this.field8746;
            arg2.field8724 = this.field8724;
        }
        if (class679.method3792(arg0, this.field8738, -853061855)) {
            if (arg5) {
                arg2.field8719 = (byte) (arg2.field8719 | 0x4);
            }
            arg2.field8748 = arg1.field8748;
            arg2.field8748.field711 = this.field8748.field711;
            arg2.field8748.field710 = this.field8748.field710;
        } else if (class66.method533(arg0, -15077, this.field8738)) {
            arg2.field8748 = this.field8748;
        } else {
            arg2.field8748 = null;
        }
        if (class115.method914((byte) 110, this.field8738, arg0)) {
            if (arg1.field8779 == null || arg1.field8779.length < this.field8720) {
                int var19 = this.field8762;
                arg2.field8691 = arg1.field8691 = new float[var19];
                arg2.field8779 = arg1.field8779 = new float[var19];
            } else {
                arg2.field8691 = arg1.field8691;
                arg2.field8779 = arg1.field8779;
            }
            for (int var20 = 0; var20 < this.field8762; var20++) {
                arg2.field8779[var20] = this.field8779[var20];
                arg2.field8691[var20] = this.field8691[var20];
            }
        } else {
            arg2.field8691 = this.field8691;
            arg2.field8779 = this.field8779;
        }
        if (class173.method1172(-970, this.field8738, arg0)) {
            arg2.field8766 = arg1.field8766;
            if (arg5) {
                arg2.field8719 = (byte) (arg2.field8719 | 0x8);
            }
            arg2.field8766.field710 = this.field8766.field710;
            arg2.field8766.field711 = this.field8766.field711;
        } else if (class680.method3799(arg0, this.field8738, -1718)) {
            arg2.field8766 = this.field8766;
        } else {
            arg2.field8766 = null;
        }
        if (class254.method1556(-1, this.field8738, arg0)) {
            if (arg1.field8780 == null || arg1.field8780.length < this.field8720) {
                int var21 = this.field8720;
                arg2.field8783 = arg1.field8783 = new short[var21];
                arg2.field8706 = arg1.field8706 = new short[var21];
                arg2.field8780 = arg1.field8780 = new short[var21];
            } else {
                arg2.field8780 = arg1.field8780;
                arg2.field8783 = arg1.field8783;
                arg2.field8706 = arg1.field8706;
            }
            for (int var22 = 0; var22 < this.field8720; var22++) {
                arg2.field8780[var22] = this.field8780[var22];
                arg2.field8706[var22] = this.field8706[var22];
                arg2.field8783[var22] = this.field8783[var22];
            }
        } else {
            arg2.field8706 = this.field8706;
            arg2.field8780 = this.field8780;
            arg2.field8783 = this.field8783;
        }
        if (class332.method1971(1, this.field8738, arg0)) {
            if (arg5) {
                arg2.field8719 = (byte) (arg2.field8719 | 0x10);
            }
            arg2.field8728 = arg1.field8728;
            arg2.field8728.field3447 = this.field8728.field3447;
        } else if (class623.method3405(this.field8738, 2048, arg0)) {
            arg2.field8728 = this.field8728;
        } else {
            arg2.field8728 = null;
        }
        if (class294.method1812((byte) -74, this.field8738, arg0)) {
            if (arg1.field8718 == null || this.field8720 > arg1.field8718.length) {
                int var23 = this.field8720;
                arg2.field8718 = arg1.field8718 = new short[var23];
            } else {
                arg2.field8718 = arg1.field8718;
            }
            for (int var24 = 0; var24 < this.field8720; var24++) {
                arg2.field8718[var24] = this.field8718[var24];
            }
        } else {
            arg2.field8718 = this.field8718;
        }
        if (!class445.method2507(arg0, this.field8738, arg3 ^ 0xC3B)) {
            arg2.field8775 = this.field8775;
        } else if (arg1.field8775 == null || arg1.field8775.length < this.field8774) {
            int var26 = this.field8774;
            arg2.field8775 = arg1.field8775 = new class59[var26];
            for (int var27 = 0; var27 < this.field8774; var27++) {
                arg2.field8775[var27] = this.field8775[var27].method489(true);
            }
        } else {
            arg2.field8775 = arg1.field8775;
            for (int var25 = 0; var25 < this.field8774; var25++) {
                arg2.field8775[var25].method488(this.field8775[var25], true);
            }
        }
        arg2.field8770 = this.field8770;
        arg2.field8749 = this.field8749;
        arg2.field8693 = this.field8693;
        arg2.field8709 = this.field8709;
        arg2.field8792 = this.field8792;
        if (this.field8689) {
            arg2.field8689 = true;
            arg2.field8711 = this.field8711;
            arg2.field8736 = this.field8736;
            arg2.field8773 = this.field8773;
            arg2.field8747 = this.field8747;
            arg2.field8782 = this.field8782;
            arg2.field8715 = this.field8715;
            arg2.field8737 = this.field8737;
        } else {
            arg2.field8689 = false;
        }
        arg2.field8697 = this.field8697;
        arg2.field8760 = this.field8760;
        arg2.field8755 = this.field8755;
        if (arg3 != -3135) {
            this.method1919(67, -3, null, null, 113, -19, 62);
        }
        arg2.field8686 = this.field8686;
        arg2.field8791 = this.field8791;
        arg2.field8684 = this.field8684;
        return arg2;
    }

    @OriginalMember(owner = "client!ev", name = "K", descriptor = "()I")
    public final int method1934() {
        if (!this.field8689) {
            this.method3562((byte) 126);
        }
        field8698++;
        return this.field8782;
    }

    @OriginalMember(owner = "client!ev", name = "E", descriptor = "(I[IIIIIZ)V")
    public final void method1924(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field8690++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            class658.field9063 = 0;
            class460.field6244 = 0;
            int var12 = 0;
            class39.field580 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field8755.length) {
                    int[] var15 = this.field8755[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class460.field6244 += this.field8788[var17];
                        class39.field580 += this.field8789[var17];
                        var12++;
                        class658.field9063 += this.field8692[var17];
                    }
                }
            }
            if (var12 > 0) {
                class39.field580 = class39.field580 / var12 + var9;
                class460.field6244 = class460.field6244 / var12 + var11;
                class658.field9063 = class658.field9063 / var12 + var10;
            } else {
                class39.field580 = var9;
                class460.field6244 = var11;
                class658.field9063 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg2 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field8755.length > var22) {
                    int[] var23 = this.field8755[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field8788[var25] += var19;
                        this.field8789[var25] += var18;
                        this.field8692[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field8755.length > var45) {
                    int[] var46 = this.field8755[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field8788[var59] -= class460.field6244;
                            this.field8789[var59] -= class39.field580;
                            this.field8692[var59] -= class658.field9063;
                            if (arg4 != 0) {
                                int var60 = class126.field2116[arg4];
                                int var61 = class126.field2105[arg4];
                                int var62 = this.field8788[var59] * var61 + (this.field8789[var59] * var60 + 16383) >> 14;
                                this.field8789[var59] = this.field8789[var59] * var61 - (this.field8788[var59] * var60 - 16383) >> 14;
                                this.field8788[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class126.field2116[arg2];
                                int var64 = class126.field2105[arg2];
                                int var65 = this.field8789[var59] * var64 + 16383 - (this.field8692[var59] * var63) >> 14;
                                this.field8692[var59] = this.field8789[var59] * var63 - (-(this.field8692[var59] * var64) - 16383) >> 14;
                                this.field8789[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class126.field2116[arg3];
                                int var67 = class126.field2105[arg3];
                                int var68 = this.field8692[var59] * var66 + (this.field8788[var59] * var67) + 16383 >> 14;
                                this.field8692[var59] = this.field8692[var59] * var67 + 16383 - (this.field8788[var59] * var66) >> 14;
                                this.field8788[var59] = var68;
                            }
                            this.field8788[var59] += class460.field6244;
                            this.field8789[var59] += class39.field580;
                            this.field8692[var59] += class658.field9063;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field8788[var48] -= class460.field6244;
                            this.field8789[var48] -= class39.field580;
                            this.field8692[var48] -= class658.field9063;
                            if (arg2 != 0) {
                                int var49 = class126.field2116[arg2];
                                int var50 = class126.field2105[arg2];
                                int var51 = this.field8789[var48] * var50 + 16383 - this.field8692[var48] * var49 >> 14;
                                this.field8692[var48] = this.field8789[var48] * var49 + this.field8692[var48] * var50 + 16383 >> 14;
                                this.field8789[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class126.field2116[arg4];
                                int var53 = class126.field2105[arg4];
                                int var54 = this.field8789[var48] * var52 + this.field8788[var48] * var53 + 16383 >> 14;
                                this.field8789[var48] = this.field8789[var48] * var53 - (this.field8788[var48] * var52 - 16383) >> 14;
                                this.field8788[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class126.field2116[arg3];
                                int var56 = class126.field2105[arg3];
                                int var57 = this.field8692[var48] * var55 + this.field8788[var48] * var56 + 16383 >> 14;
                                this.field8692[var48] = this.field8692[var48] * var56 + 16383 - (this.field8788[var48] * var55) >> 14;
                                this.field8788[var48] = var57;
                            }
                            this.field8788[var48] += class460.field6244;
                            this.field8789[var48] += class39.field580;
                            this.field8692[var48] += class658.field9063;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field8755.length) {
                        int[] var29 = this.field8755[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field8792[var31];
                            int var33 = this.field8792[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field8684[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class126.field2116[arg4];
                                    int var37 = class126.field2105[arg4];
                                    int var38 = this.field8776[var35] * var37 + this.field8685[var35] * var36 + 16383 >> 14;
                                    this.field8685[var35] = (short) (this.field8685[var35] * var37 + 16383 - (this.field8776[var35] * var36) >> 14);
                                    this.field8776[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class126.field2116[arg2];
                                    int var40 = class126.field2105[arg2];
                                    int var41 = this.field8685[var35] * var40 + 16383 - (this.field8746[var35] * var39) >> 14;
                                    this.field8746[var35] = (short) (this.field8746[var35] * var40 + this.field8685[var35] * var39 + 16383 >> 14);
                                    this.field8685[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class126.field2116[arg3];
                                    int var43 = class126.field2105[arg3];
                                    int var44 = this.field8776[var35] * var43 + this.field8746[var35] * var42 + 16383 >> 14;
                                    this.field8746[var35] = (short) (this.field8746[var35] * var43 + 16383 - (this.field8776[var35] * var42) >> 14);
                                    this.field8776[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field8748 == null && this.field8784 != null) {
                    this.field8784.field710 = null;
                }
                if (this.field8748 != null) {
                    this.field8748.field710 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field8755.length > var70) {
                    int[] var71 = this.field8755[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field8788[var73] -= class460.field6244;
                        this.field8789[var73] -= class39.field580;
                        this.field8692[var73] -= class658.field9063;
                        this.field8788[var73] = this.field8788[var73] * arg2 >> 7;
                        this.field8789[var73] = this.field8789[var73] * arg3 >> 7;
                        this.field8692[var73] = this.field8692[var73] * arg4 >> 7;
                        this.field8788[var73] += class460.field6244;
                        this.field8789[var73] += class39.field580;
                        this.field8692[var73] += class658.field9063;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8791 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field8791.length > var78) {
                        int[] var79 = this.field8791[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field8752[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field8752[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field8784 != null) {
                            this.field8784.field710 = null;
                        }
                    }
                }
                if (this.field8749 != null) {
                    for (int var75 = 0; var75 < this.field8774; var75++) {
                        class142 var76 = this.field8749[var75];
                        class59 var77 = this.field8775[var75];
                        var77.field908 = 255 - (this.field8752[var76.field2292] & 0xFF) << 24 | var77.field908 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field8791 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field8791.length > var87) {
                        int[] var88 = this.field8791[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field8702[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFFDF) >> 10;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var92 + arg2 & 0x3F;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            int var97 = arg4 + var94;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field8702[var90] = (short) class220.method1393(var97, class220.method1393(var96 << 10, var95 << 7));
                        }
                        if (var88.length > 0 && this.field8784 != null) {
                            this.field8784.field710 = null;
                        }
                    }
                }
                if (this.field8749 != null) {
                    for (int var84 = 0; var84 < this.field8774; var84++) {
                        class142 var85 = this.field8749[var84];
                        class59 var86 = this.field8775[var84];
                        var86.field908 = var86.field908 & 0xFF000000 | class444.field6084[this.field8702[var85.field2292] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field8760 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field8760.length > var99) {
                        int[] var100 = this.field8760[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class59 var102 = this.field8775[var100[var101]];
                            var102.field909 += arg2;
                            var102.field915 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8760 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field8760.length) {
                        int[] var105 = this.field8760[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class59 var107 = this.field8775[var105[var106]];
                            var107.field911 = var107.field911 * arg3 >> 7;
                            var107.field907 = var107.field907 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8760 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field8760.length > var109) {
                    int[] var110 = this.field8760[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class59 var112 = this.field8775[var110[var111]];
                        var112.field913 = var112.field913 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lnw;B)V")
    private final void method3557(class548 arg0, byte arg1) {
        if (this.field8758.field9334.length < this.field8762) {
            this.field8758.field9339 = new int[this.field8762];
            this.field8758.field9334 = new int[this.field8762];
        }
        field8708++;
        int[] var3 = this.field8758.field9334;
        int[] var4 = this.field8758.field9339;
        if (arg1 != 85) {
            this.method3552(-1.8986065F, 107, -78L, 2.1944036F, -83, (byte) 59, null, -26, -92, 5);
        }
        for (int var5 = 0; var5 < this.field8696; var5++) {
            int var16 = (this.field8788[var5] - (this.field8789[var5] * this.field8758.field9254 >> 8) >> this.field8758.field9187) - arg0.field7317;
            int var17 = (this.field8692[var5] - (this.field8789[var5] * this.field8758.field9219 >> 8) >> this.field8758.field9187) - arg0.field7306;
            int var18 = this.field8792[var5];
            int var19 = this.field8792[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field8684[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field8759; var6++) {
            if (this.field8752 == null || this.field8752[var6] <= 128) {
                short var7 = this.field8780[var6];
                short var8 = this.field8706[var6];
                short var9 = this.field8783[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var10 - var11) * (var14 - var15) - (var12 - var11) * (var14 - var13)) > 0) {
                    arg0.method3049(var11, false, var15, var13, var14, var12, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "ZA", descriptor = "()I")
    public final int method1940() {
        field8739++;
        if (!this.field8689) {
            this.method3562((byte) 126);
        }
        return this.field8773;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lq;Lot;I)V")
    public final void method1947(class397 arg0, class552 arg1, int arg2) {
        field8694++;
        if (this.field8762 == 0) {
            return;
        }
        class701 var4 = this.field8758.field9276;
        if (!this.field8689) {
            this.method3562((byte) 126);
        }
        class701 var5 = (class701) arg0;
        class346.field4759 = var4.field9883 * var5.field9858 + var4.field9858 * var5.field9884 + var4.field9856 * var5.field9881;
        class29.field480 = var4.field9883 * var5.field9868 + var4.field9858 * var5.field9863 + var4.field9856 * var5.field9874 + var4.field9868;
        float var6 = (float) this.field8747 * class346.field4759 + class29.field480;
        float var7 = (float) this.field8736 * class346.field4759 + class29.field480;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var9 = (float) this.field8773 + var6;
            var8 = var7 - (float) this.field8773;
        } else {
            var8 = (float) (-this.field8773) + var6;
            var9 = (float) this.field8773 + var7;
        }
        if ((var8 >= this.field8758.field9245) || (var9 <= (float) this.field8758.field9326)) {
            return;
        }
        class67.field1024 = var4.field9860 * var5.field9858 + var4.field9881 * var5.field9884 + var4.field9878 * var5.field9881;
        class172.field2656 = var4.field9860 * var5.field9868 + var4.field9881 * var5.field9863 + var4.field9878 * var5.field9874 + var4.field9874;
        float var10 = (float) this.field8747 * class67.field1024 + class172.field2656;
        float var11 = (float) this.field8736 * class67.field1024 + class172.field2656;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = (var11 - (float) this.field8773) * (float) this.field8758.field9295;
            var13 = ((float) this.field8773 + var10) * (float) this.field8758.field9295;
        } else {
            var12 = (var10 - (float) this.field8773) * (float) this.field8758.field9295;
            var13 = ((float) this.field8773 + var11) * (float) this.field8758.field9295;
        }
        if ((this.field8758.field9261 <= var12 / var9) || (this.field8758.field9327 >= var13 / var9)) {
            return;
        }
        class696.field9770 = var4.field9861 * var5.field9858 + var4.field9887 * var5.field9881 + var4.field9884 * var5.field9884;
        class637.field8583 = var4.field9861 * var5.field9868 + var4.field9887 * var5.field9874 + var4.field9884 * var5.field9863 + var4.field9863;
        float var14 = (float) this.field8747 * class696.field9770 + class637.field8583;
        float var15 = (float) this.field8736 * class696.field9770 + class637.field8583;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var16 = ((float) this.field8773 + var14) * (float) this.field8758.field9306;
            var17 = ((float) (-this.field8773) + var15) * (float) this.field8758.field9306;
        } else {
            var16 = ((float) this.field8773 + var15) * (float) this.field8758.field9306;
            var17 = (var14 - (float) this.field8773) * (float) this.field8758.field9306;
        }
        if ((var17 / var9 >= this.field8758.field9323) || (this.field8758.field9312 >= var16 / var9)) {
            return;
        }
        if (arg1 != null || this.field8749 != null) {
            class158.field2489 = var4.field9883 * var5.field9856 + var4.field9858 * var5.field9887 + var4.field9856 * var5.field9878;
            class491.field6620 = var4.field9861 * var5.field9856 + var4.field9887 * var5.field9878 + var4.field9884 * var5.field9887;
            class177.field2727 = var4.field9861 * var5.field9883 + var4.field9887 * var5.field9860 + var4.field9884 * var5.field9861;
            class1.field8 = var4.field9860 * var5.field9883 + var4.field9881 * var5.field9861 + var4.field9878 * var5.field9860;
            class561.field7441 = var4.field9860 * var5.field9856 + var4.field9881 * var5.field9887 + var4.field9878 * var5.field9878;
            class441.field6055 = var4.field9883 * var5.field9883 + var4.field9858 * var5.field9861 + var4.field9856 * var5.field9860;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field8715 + this.field8711 >> 1;
            int var21 = this.field8782 + this.field8737 >> 1;
            int var22 = (int) ((float) var21 * class1.field8 + (float) this.field8747 * class67.field1024 + (float) var20 * class561.field7441 + class172.field2656);
            int var23 = (int) ((float) var21 * class177.field2727 + (float) this.field8747 * class696.field9770 + (float) var20 * class491.field6620 + class637.field8583);
            int var24 = (int) ((float) var21 * class441.field6055 + (float) this.field8747 * class346.field4759 + (float) var20 * class158.field2489 + class29.field480);
            if (var24 >= this.field8758.field9326) {
                arg1.field7345 = this.field8758.field9318 + (this.field8758.field9306 * var23 / var24);
                arg1.field7346 = this.field8758.field9295 * var22 / var24 + this.field8758.field9233;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class1.field8 + (float) this.field8736 * class67.field1024 + (float) var20 * class561.field7441 + class172.field2656);
            int var26 = (int) ((float) var21 * class177.field2727 + (float) this.field8736 * class696.field9770 + (float) var20 * class491.field6620 + class637.field8583);
            int var27 = (int) ((float) var21 * class441.field6055 + (float) this.field8736 * class346.field4759 + (float) var20 * class158.field2489 + class29.field480);
            if (this.field8758.field9326 > var27) {
                var18 = true;
            } else {
                arg1.field7342 = this.field8758.field9306 * var26 / var27 + this.field8758.field9318;
                arg1.field7343 = this.field8758.field9295 * var25 / var27 + this.field8758.field9233;
            }
            if (var18) {
                if (this.field8758.field9326 > var24 && var27 < this.field8758.field9326) {
                    var19 = false;
                } else if (var24 < this.field8758.field9326) {
                    int var31 = (var27 - this.field8758.field9326 << 16) / (var27 - var24);
                    int var32 = var25 + ((var25 - var22) * var31 >> 16);
                    arg1.field7346 = this.field8758.field9233 + (this.field8758.field9295 * var32 / this.field8758.field9326);
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field7345 = this.field8758.field9306 * var33 / this.field8758.field9326 + this.field8758.field9318;
                } else if (var27 < this.field8758.field9326) {
                    int var28 = (var24 - this.field8758.field9326 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field7346 = this.field8758.field9295 * var29 / this.field8758.field9326 + this.field8758.field9233;
                    arg1.field7345 = this.field8758.field9306 * var30 / this.field8758.field9326 + this.field8758.field9318;
                }
            }
            if (var19) {
                if (var24 > var27) {
                    arg1.field7344 = (this.field8773 + var22) * this.field8758.field9295 / var24 + this.field8758.field9233 - arg1.field7346;
                } else {
                    arg1.field7344 = this.field8758.field9233 + ((var25 - -this.field8773) * this.field8758.field9295 / var27) - arg1.field7343;
                }
                arg1.field7341 = true;
            }
        }
        this.field8758.method3660((byte) 42);
        this.field8758.method3634(var5, (byte) -107);
        this.method3550(-1263217992);
        this.field8758.method3681(34166);
        this.method3554(-25037);
    }

    @OriginalMember(owner = "client!ev", name = "V", descriptor = "(I)V")
    public final void method1942(int arg0) {
        field8713++;
        int var2 = class126.field2116[arg0];
        int var3 = class126.field2105[arg0];
        for (int var4 = 0; var4 < this.field8696; var4++) {
            int var7 = this.field8692[var4] * var2 + (this.field8788[var4] * var3) >> 14;
            this.field8692[var4] = this.field8692[var4] * var3 - (this.field8788[var4] * var2) >> 14;
            this.field8788[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field8762; var5++) {
            int var6 = this.field8746[var5] * var2 + (this.field8776[var5] * var3) >> 14;
            this.field8746[var5] = (short) (this.field8746[var5] * var3 - (this.field8776[var5] * var2) >> 14);
            this.field8776[var5] = (short) var6;
        }
        if (this.field8748 == null && this.field8784 != null) {
            this.field8784.field710 = null;
        }
        if (this.field8748 != null) {
            this.field8748.field710 = null;
        }
        this.field8689 = false;
        if (this.field8695 != null) {
            this.field8695.field710 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Ljava/lang/String;IB)Z")
    public static final boolean method3558(String arg0, int arg1, byte arg2) {
        field8740++;
        if (class688.field9669.field6915) {
            class214.field3059 = new class204();
            class214.field3059.field2955 = arg1;
            class214.field3059.field2957 = arg0;
            if (class616.field8169 != class137.field2222) {
                class214.field3059.field2958 = class214.field3059.field2955 + 40000;
                class214.field3059.field2956 = class214.field3059.field2955 + 50000;
            }
            if (class471.field6307.length > arg1 && class471.field6307[arg1] != null) {
                class331.field4538 = class471.field6307[arg1].field700;
            }
            return true;
        }
        String var3 = "";
        if (class616.field8169 != class137.field2222) {
            var3 = ":" + (arg1 + 7000);
        }
        if (arg2 <= 58) {
            field8721 = null;
        }
        String var4 = "";
        if (class482.field6480 != null) {
            var4 = "/p=" + class482.field6480;
        }
        String var5 = "http://" + arg0 + var3 + "/l=" + class516.field6892 + "/a=" + class88.field1330 + var4 + "/j" + (class292.field4152 ? "1" : "0") + ",o" + (class325.field4501 ? "1" : "0") + ",a2";
        try {
            class139.field2244.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "(III)V")
    public final void method1918(int arg0, int arg1, int arg2) {
        field8741++;
        for (int var4 = 0; var4 < this.field8696; var4++) {
            if (arg0 != 128) {
                this.field8788[var4] = this.field8788[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field8789[var4] = this.field8789[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field8692[var4] = this.field8692[var4] * arg2 >> 7;
            }
        }
        if (this.field8695 != null) {
            this.field8695.field710 = null;
        }
        this.field8689 = false;
    }

    @OriginalMember(owner = "client!ev", name = "da", descriptor = "(I[IIIIZI[I)V")
    public final void method1914(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field8735++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = arg3 << 4;
            class39.field580 = 0;
            int var13 = 0;
            class658.field9063 = 0;
            class460.field6244 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field8755.length > var15) {
                    int[] var16 = this.field8755[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field8709 == null || (this.field8709[var18] & arg6) != 0) {
                            class460.field6244 += this.field8788[var18];
                            class39.field580 += this.field8789[var18];
                            var13++;
                            class658.field9063 += this.field8692[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class658.field9063 = var10;
                class460.field6244 = var11;
                class39.field580 = var12;
            } else {
                class566.field7483 = true;
                class460.field6244 = class460.field6244 / var13 + var11;
                class39.field580 = class39.field580 / var13 + var12;
                class658.field9063 = class658.field9063 / var13 + var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 8192 >> 14;
                arg4 = var21;
                arg3 = var20;
                arg2 = var19;
            }
            int var22 = arg3 << 4;
            int var23 = arg4 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field8755.length > var26) {
                    int[] var27 = this.field8755[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field8709 == null || (arg6 & this.field8709[var29]) != 0) {
                            this.field8788[var29] += var24;
                            this.field8789[var29] += var22;
                            this.field8692[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (this.field8755.length > var49) {
                        int[] var50 = this.field8755[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field8709 == null || (this.field8709[var52] & arg6) != 0) {
                                this.field8788[var52] -= class460.field6244;
                                this.field8789[var52] -= class39.field580;
                                this.field8692[var52] -= class658.field9063;
                                if (arg4 != 0) {
                                    int var53 = class126.field2116[arg4];
                                    int var54 = class126.field2105[arg4];
                                    int var55 = this.field8789[var52] * var53 + this.field8788[var52] * var54 + 16383 >> 14;
                                    this.field8789[var52] = this.field8789[var52] * var54 + 16383 - this.field8788[var52] * var53 >> 14;
                                    this.field8788[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class126.field2116[arg2];
                                    int var57 = class126.field2105[arg2];
                                    int var58 = this.field8789[var52] * var57 + 16383 - (this.field8692[var52] * var56) >> 14;
                                    this.field8692[var52] = this.field8789[var52] * var56 + (this.field8692[var52] * var57) + 16383 >> 14;
                                    this.field8789[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class126.field2116[arg3];
                                    int var60 = class126.field2105[arg3];
                                    int var61 = this.field8788[var52] * var60 + this.field8692[var52] * var59 + 16383 >> 14;
                                    this.field8692[var52] = this.field8692[var52] * var60 + 16383 - (this.field8788[var52] * var59) >> 14;
                                    this.field8788[var52] = var61;
                                }
                                this.field8788[var52] += class460.field6244;
                                this.field8789[var52] += class39.field580;
                                this.field8692[var52] += class658.field9063;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field8755.length > var32) {
                            int[] var33 = this.field8755[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field8709 == null || (arg6 & this.field8709[var35]) != 0) {
                                    int var36 = this.field8792[var35];
                                    int var37 = this.field8792[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field8684[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class126.field2116[arg4];
                                            int var41 = class126.field2105[arg4];
                                            int var42 = this.field8776[var39] * var41 + this.field8685[var39] * var40 + 16383 >> 14;
                                            this.field8685[var39] = (short) (this.field8685[var39] * var41 + 16383 - (this.field8776[var39] * var40) >> 14);
                                            this.field8776[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class126.field2116[arg2];
                                            int var44 = class126.field2105[arg2];
                                            int var45 = this.field8685[var39] * var44 + 16383 - (this.field8746[var39] * var43) >> 14;
                                            this.field8746[var39] = (short) (this.field8685[var39] * var43 + (this.field8746[var39] * var44 + 16383) >> 14);
                                            this.field8685[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class126.field2116[arg3];
                                            int var47 = class126.field2105[arg3];
                                            int var48 = this.field8746[var39] * var46 + this.field8776[var39] * var47 + 16383 >> 14;
                                            this.field8746[var39] = (short) (this.field8746[var39] * var47 + 16383 - (this.field8776[var39] * var46) >> 14);
                                            this.field8776[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field8748 == null && this.field8784 != null) {
                        this.field8784.field710 = null;
                    }
                    if (this.field8748 != null) {
                        this.field8748.field710 = null;
                        return;
                    }
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class566.field7483) {
                    int var68 = arg7[0] * class460.field6244 + arg7[3] * class39.field580 + (arg7[6] * class658.field9063) + 8192 >> 14;
                    int var69 = arg7[1] * class460.field6244 - (-(arg7[4] * class39.field580) - (arg7[7] * class658.field9063) - 8192) >> 14;
                    int var70 = var65 + var68;
                    int var71 = arg7[8] * class658.field9063 + arg7[2] * class460.field6244 + (arg7[5] * class39.field580) + 8192 >> 14;
                    int var72 = var66 + var69;
                    int var73 = var67 + var71;
                    class39.field580 = var72;
                    class460.field6244 = var70;
                    class566.field7483 = false;
                    class658.field9063 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class126.field2105[arg2];
                int var76 = class126.field2116[arg2];
                int var77 = class126.field2105[arg3];
                int var78 = class126.field2116[arg3];
                int var79 = class126.field2105[arg4];
                int var80 = class126.field2116[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[7] = var77 * var81 + var78 * var80 + 8192 >> 14;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[1] = -var77 * var80 + var78 * var81 + 8192 >> 14;
                var74[6] = var77 * var82 + -var78 * var79 + 8192 >> 14;
                var74[5] = -var76;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                int var83 = var74[1] * -class39.field580 + var74[0] * -class460.field6244 + (var74[2] * -class658.field9063) + 8192 >> 14;
                int var84 = var74[3] * -class460.field6244 + var74[4] * -class39.field580 + var74[5] * -class658.field9063 + 8192 >> 14;
                int var85 = var74[8] * -class658.field9063 + var74[6] * -class460.field6244 - (-(var74[7] * -class39.field580) - 8192) >> 14;
                int var86 = var83 + class460.field6244;
                int var87 = class39.field580 + var84;
                int var88 = class658.field9063 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += arg7[var119 * 3 + var121] * var74[var90 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[2] * var67 + var74[1] * var66 + var74[0] * var65 + 8192 >> 14;
                int var92 = var74[3] * var65 + 8192 - (-(var74[4] * var66) - (var74[5] * var67)) >> 14;
                int var93 = var87 + var92;
                int var94 = var86 + var91;
                int var95 = var74[7] * var66 + var74[8] * var67 + var74[6] * var65 + 8192 >> 14;
                int var96 = var88 + var95;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 8192 >> 14;
                    }
                }
                int var99 = arg7[2] * var96 + arg7[1] * var93 + arg7[0] * var94 + 8192 >> 14;
                int var100 = arg7[5] * var96 + (arg7[4] * var93 + arg7[3] * var94 + 8192) >> 14;
                int var101 = var62 + var99;
                int var102 = var63 + var100;
                int var103 = arg7[8] * var96 + arg7[6] * var94 + (arg7[7] * var93) + 8192 >> 14;
                int var104 = var64 + var103;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field8755.length > var106) {
                        int[] var107 = this.field8755[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field8709 == null || (this.field8709[var109] & arg6) != 0) {
                                int var110 = this.field8692[var109] * var97[2] + this.field8788[var109] * var97[0] + (this.field8789[var109] * var97[1]) + 8192 >> 14;
                                int var111 = this.field8789[var109] * var97[4] + this.field8692[var109] * var97[5] + this.field8788[var109] * var97[3] + 8192 >> 14;
                                int var112 = var101 + var110;
                                int var113 = var102 + var111;
                                int var114 = this.field8692[var109] * var97[8] + (this.field8789[var109] * var97[7] + this.field8788[var109] * var97[6] + 8192) >> 14;
                                int var115 = var104 + var114;
                                this.field8788[var109] = var112;
                                this.field8789[var109] = var113;
                                this.field8692[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field8755.length > var123) {
                        int[] var124 = this.field8755[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field8709 == null || (this.field8709[var126] & arg6) != 0) {
                                this.field8788[var126] -= class460.field6244;
                                this.field8789[var126] -= class39.field580;
                                this.field8692[var126] -= class658.field9063;
                                this.field8788[var126] = this.field8788[var126] * arg2 >> 7;
                                this.field8789[var126] = this.field8789[var126] * arg3 >> 7;
                                this.field8692[var126] = this.field8692[var126] * arg4 >> 7;
                                this.field8788[var126] += class460.field6244;
                                this.field8789[var126] += class39.field580;
                                this.field8692[var126] += class658.field9063;
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
                if (class566.field7483) {
                    int var133 = arg7[3] * class39.field580 + (arg7[0] * class460.field6244 + (arg7[6] * class658.field9063)) + 8192 >> 14;
                    int var134 = arg7[7] * class658.field9063 + arg7[4] * class39.field580 + arg7[1] * class460.field6244 + 8192 >> 14;
                    int var135 = var131 + var134;
                    int var136 = arg7[8] * class658.field9063 + arg7[2] * class460.field6244 + arg7[5] * class39.field580 + 8192 >> 14;
                    int var137 = var130 + var133;
                    class460.field6244 = var137;
                    int var138 = var132 + var136;
                    class39.field580 = var135;
                    class566.field7483 = false;
                    class658.field9063 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class460.field6244 * var139 + 8192 >> 14;
                int var143 = -class39.field580 * var140 + 8192 >> 14;
                int var144 = -class658.field9063 * var141 + 8192 >> 14;
                int var145 = class460.field6244 + var142;
                int var146 = class39.field580 + var143;
                int var147 = class658.field9063 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var145 + var149;
                int var152 = var132 * var141 + 8192 >> 14;
                int var153 = var146 + var150;
                int var154 = var147 + var152;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[2] * var154 + arg7[0] * var151 + arg7[1] * var153 + 8192 >> 14;
                int var158 = arg7[5] * var154 + (arg7[3] * var151 + (arg7[4] * var153)) + 8192 >> 14;
                int var159 = var127 + var157;
                int var160 = var128 + var158;
                int var161 = arg7[7] * var153 + arg7[6] * var151 + (arg7[8] * var154) + 8192 >> 14;
                int var162 = var129 + var161;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field8755.length) {
                        int[] var165 = this.field8755[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field8709 == null || (arg6 & this.field8709[var167]) != 0) {
                                int var168 = this.field8692[var167] * var155[2] + this.field8789[var167] * var155[1] + this.field8788[var167] * var155[0] + 8192 >> 14;
                                int var169 = this.field8788[var167] * var155[3] + this.field8789[var167] * var155[4] + this.field8692[var167] * var155[5] + 8192 >> 14;
                                int var170 = var160 + var169;
                                int var171 = this.field8692[var167] * var155[8] + this.field8789[var167] * var155[7] + this.field8788[var167] * var155[6] + 8192 >> 14;
                                int var172 = var159 + var168;
                                int var173 = var162 + var171;
                                this.field8788[var167] = var172;
                                this.field8789[var167] = var170;
                                this.field8692[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8791 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field8791.length > var181) {
                        int[] var182 = this.field8791[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field8686 == null || (arg6 & this.field8686[var184]) != 0) {
                                int var185 = (this.field8752[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field8752[var184] = (byte) var185;
                                if (this.field8784 != null) {
                                    this.field8784.field710 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field8749 != null) {
                    for (int var178 = 0; var178 < this.field8774; var178++) {
                        class142 var179 = this.field8749[var178];
                        class59 var180 = this.field8775[var178];
                        var180.field908 = var180.field908 & 0xFFFFFF | 255 - (this.field8752[var179.field2292] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field8791 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field8791.length > var190) {
                        int[] var191 = this.field8791[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field8686 == null || (this.field8686[var193] & arg6) != 0) {
                                int var194 = this.field8702[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFF7A) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = arg2 + var195 & 0x3F;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                int var200 = arg4 + var197;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field8702[var193] = (short) class220.method1393(var200, class220.method1393(var198 << 7, var199 << 10));
                                if (this.field8784 != null) {
                                    this.field8784.field710 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field8749 != null) {
                    for (int var187 = 0; var187 < this.field8774; var187++) {
                        class142 var188 = this.field8749[var187];
                        class59 var189 = this.field8775[var187];
                        var189.field908 = var189.field908 & 0xFF000000 | class444.field6084[this.field8702[var188.field2292] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field8760 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field8760.length > var202) {
                        int[] var203 = this.field8760[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class59 var205 = this.field8775[var203[var204]];
                            var205.field915 += arg3;
                            var205.field909 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8760 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field8760.length) {
                        int[] var208 = this.field8760[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class59 var210 = this.field8775[var208[var209]];
                            var210.field911 = var210.field911 * arg3 >> 7;
                            var210.field907 = var210.field907 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8760 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field8760.length > var212) {
                    int[] var213 = this.field8760[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class59 var215 = this.field8775[var213[var214]];
                        var215.field913 = var215.field913 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "ka", descriptor = "(SS)V")
    public final void method1937(short arg0, short arg1) {
        field8722++;
        class498 var3 = this.field8758.field8808;
        for (int var4 = 0; var4 < this.field8720; var4++) {
            if (this.field8718[var4] == arg0) {
                this.field8718[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class364 var7 = var3.method2760(arg0 & 0xFFFF, 21351);
            var5 = var7.field4929;
            var6 = var7.field4926;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class364 var10 = var3.method2760(arg1 & 0xFFFF, 21351);
            var9 = var10.field4926;
            var8 = var10.field4929;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field8749 != null) {
            for (int var11 = 0; var11 < this.field8774; var11++) {
                class142 var12 = this.field8749[var11];
                class59 var13 = this.field8775[var11];
                var13.field908 = class444.field6084[this.field8702[var12.field2292] & 0xFFFF] & 0xFFFFFF | var13.field908 & 0xFF000000;
            }
        }
        if (this.field8784 != null) {
            this.field8784.field710 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)V")
    private final void method3559(int arg0) {
        field8754++;
        if (!this.field8712) {
            return;
        }
        this.field8712 = false;
        if (this.field8697 == null && this.field8693 == null && this.field8749 == null) {
            if (this.field8788 != null && !class315.method1877(458752, this.field8738, this.field8703)) {
                if (this.field8695 != null && this.field8695.field710 == null) {
                    this.field8712 = true;
                } else {
                    if (!this.field8689) {
                        this.method3562((byte) 126);
                    }
                    this.field8788 = null;
                }
            }
            if (this.field8789 != null && !class139.method1022(this.field8703, arg0 ^ 0x3386, this.field8738)) {
                if (this.field8695 != null && this.field8695.field710 == null) {
                    this.field8712 = true;
                } else {
                    if (!this.field8689) {
                        this.method3562((byte) 126);
                    }
                    this.field8789 = null;
                }
            }
            if (this.field8692 != null && !class3.method17(this.field8703, this.field8738, (byte) -71)) {
                if (this.field8695 != null && this.field8695.field710 == null) {
                    this.field8712 = true;
                } else {
                    if (!this.field8689) {
                        this.method3562((byte) 126);
                    }
                    this.field8692 = null;
                }
            }
        }
        if (this.field8684 != null && this.field8788 == null && this.field8789 == null && this.field8692 == null) {
            this.field8792 = null;
            this.field8684 = null;
        }
        if (this.field8724 != null && !class233.method1455(this.field8738, this.field8703, (byte) 124)) {
            if (this.field8748 == null) {
                if (this.field8784 != null && this.field8784.field710 == null) {
                    this.field8712 = true;
                } else {
                    this.field8724 = null;
                    this.field8776 = this.field8685 = this.field8746 = null;
                }
            } else if (this.field8748.field710 == null) {
                this.field8712 = true;
            } else {
                this.field8776 = this.field8685 = this.field8746 = null;
                this.field8724 = null;
            }
        }
        if (this.field8702 != null && !class454.method2589(this.field8703, this.field8738, (byte) 62)) {
            if (this.field8784 != null && this.field8784.field710 == null) {
                this.field8712 = true;
            } else {
                this.field8702 = null;
            }
        }
        if (this.field8752 != null && !class335.method2010(arg0 + 1187316440, this.field8703, this.field8738)) {
            if (this.field8784 != null && this.field8784.field710 == null) {
                this.field8712 = true;
            } else {
                this.field8752 = null;
            }
        }
        if (this.field8779 != null && !class239.method1480(16723, this.field8738, this.field8703)) {
            if (this.field8766 != null && this.field8766.field710 == null) {
                this.field8712 = true;
            } else {
                this.field8779 = this.field8691 = null;
            }
        }
        if (this.field8718 != null && !class556.method3075(this.field8738, this.field8703, arg0 ^ 0xFFFFFFA0)) {
            if (this.field8784 != null && this.field8784.field710 == null) {
                this.field8712 = true;
            } else {
                this.field8718 = null;
            }
        }
        if (this.field8780 != null && !class39.method302(this.field8738, this.field8703, (byte) -82)) {
            if (this.field8728 != null && this.field8728.field3447 == null || this.field8784 != null && this.field8784.field710 == null) {
                this.field8712 = true;
            } else {
                this.field8780 = this.field8706 = this.field8783 = null;
            }
        }
        if (arg0 != 0) {
            this.method3555(-18, true);
        }
        if (this.field8791 != null && !class520.method2921(this.field8703, (byte) -67, this.field8738)) {
            this.field8791 = null;
            this.field8686 = null;
        }
        if (this.field8755 != null && !class106.method803(this.field8738, 255, this.field8703)) {
            this.field8709 = null;
            this.field8755 = null;
        }
        if (this.field8760 != null && !class316.method1883(this.field8703, this.field8738, arg0 ^ 0x72)) {
            this.field8760 = null;
        }
        if (this.field8770 != null && (this.field8703 & 0x800) == 0 && (this.field8703 & 0x40000) == 0) {
            this.field8770 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lba;IIIZ)V")
    public final void method1923(class358 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8750++;
        class649 var6 = (class649) arg0;
        if (this.field8720 == 0 || var6.field8720 == 0) {
            return;
        }
        int var7 = var6.field8696;
        int[] var8 = var6.field8788;
        int[] var9 = var6.field8789;
        int[] var10 = var6.field8692;
        short[] var11 = var6.field8776;
        short[] var12 = var6.field8685;
        short[] var13 = var6.field8746;
        byte[] var14 = var6.field8724;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field8688 == null) {
            var17 = null;
            var16 = null;
            var15 = null;
            var18 = null;
        } else {
            var15 = this.field8688.field2162;
            var16 = this.field8688.field2163;
            var17 = this.field8688.field2155;
            var18 = this.field8688.field2160;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field8688 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var22 = var6.field8688.field2162;
            var21 = var6.field8688.field2160;
            var20 = var6.field8688.field2155;
            var19 = var6.field8688.field2163;
        }
        int[] var23 = var6.field8792;
        short[] var24 = var6.field8684;
        if (!var6.field8689) {
            var6.method3562((byte) 126);
        }
        short var25 = var6.field8747;
        short var26 = var6.field8736;
        short var27 = var6.field8715;
        short var28 = var6.field8711;
        short var29 = var6.field8737;
        short var30 = var6.field8782;
        for (int var31 = 0; var31 < this.field8696; var31++) {
            int var32 = this.field8789[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field8788[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field8692[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field8792[var31];
                        int var37 = this.field8792[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field8684[var38] - 1;
                            if (var35 == -1 || this.field8724[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39 + 1];
                                    int var42 = var23[var39];
                                    for (int var43 = var42; var43 < var41; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field8688 = new class131();
                                            var15 = this.field8688.field2162 = class253.method1541(this.field8776, true);
                                            var17 = this.field8688.field2155 = class253.method1541(this.field8685, true);
                                            var16 = this.field8688.field2163 = class253.method1541(this.field8746, true);
                                            var18 = this.field8688.field2160 = class379.method2223(0, this.field8724);
                                        }
                                        if (var22 == null) {
                                            class131 var44 = var6.field8688 = new class131();
                                            var22 = var44.field2162 = class253.method1541(var11, true);
                                            var20 = var44.field2155 = class253.method1541(var12, true);
                                            var19 = var44.field2163 = class253.method1541(var13, true);
                                            var21 = var44.field2160 = class379.method2223(0, var14);
                                        }
                                        short var45 = this.field8776[var35];
                                        short var46 = this.field8685[var35];
                                        short var47 = this.field8746[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field8724[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var22[var52] += var45;
                                                var20[var52] += var46;
                                                var19[var52] += var47;
                                                var21[var52] += var49;
                                            }
                                        }
                                        int var53 = this.field8792[var31];
                                        short var54 = var13[var40];
                                        short var55 = var11[var40];
                                        short var56 = var12[var40];
                                        int var57 = this.field8792[var31 + 1];
                                        byte var58 = var14[var40];
                                        for (int var59 = var53; var59 < var57; var59++) {
                                            int var60 = this.field8684[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var55;
                                                var17[var60] += var56;
                                                var16[var60] += var54;
                                                var18[var60] += var58;
                                            }
                                        }
                                        if (this.field8748 == null && this.field8784 != null) {
                                            this.field8784.field710 = null;
                                        }
                                        if (this.field8748 != null) {
                                            this.field8748.field710 = null;
                                        }
                                        if (var6.field8748 == null && var6.field8784 != null) {
                                            var6.field8784.field710 = null;
                                        }
                                        if (var6.field8748 != null) {
                                            var6.field8748.field710 = null;
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

    @OriginalMember(owner = "client!ev", name = "ia", descriptor = "(I)V")
    public final void method1899(int arg0) {
        field8742++;
        this.field8703 = arg0;
        if (this.field8688 != null && (this.field8703 & 0x10000) == 0) {
            this.field8746 = this.field8688.field2163;
            this.field8685 = this.field8688.field2155;
            this.field8776 = this.field8688.field2162;
            this.field8724 = this.field8688.field2160;
            this.field8688 = null;
        }
        this.field8712 = true;
        this.method3559(0);
    }

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "(I)V")
    public static void method3560(int arg0) {
        field8721 = null;
        if (arg0 != 15201) {
            method3558(null, -32, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!ev", name = "Y", descriptor = "()V")
    public final void method1901() {
        field8733++;
        for (int var1 = 0; var1 < this.field8787; var1++) {
            this.field8788[var1] = this.field8788[var1] + 7 >> 4;
            this.field8789[var1] = this.field8789[var1] + 7 >> 4;
            this.field8692[var1] = this.field8692[var1] + 7 >> 4;
        }
        this.field8689 = false;
        if (this.field8695 != null) {
            this.field8695.field710 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "v", descriptor = "(I)V")
    public final void method1904(int arg0) {
        field8683++;
        int var2 = class126.field2116[arg0];
        int var3 = class126.field2105[arg0];
        for (int var4 = 0; var4 < this.field8696; var4++) {
            int var5 = this.field8789[var4] * var2 + (this.field8788[var4] * var3) >> 14;
            this.field8789[var4] = this.field8789[var4] * var3 - (this.field8788[var4] * var2) >> 14;
            this.field8788[var4] = var5;
        }
        this.field8689 = false;
        if (this.field8695 != null) {
            this.field8695.field710 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(BIZ)Lba;")
    public final class358 method1519(byte arg0, int arg1, boolean arg2) {
        field8727++;
        class649 var4;
        class649 var5;
        if (arg0 == 1) {
            var5 = this.field8758.field9292;
            var4 = this.field8758.field9305;
        } else if (arg0 == 2) {
            var5 = this.field8758.field9240;
            var4 = this.field8758.field9232;
        } else if (arg0 == 3) {
            var4 = this.field8758.field9311;
            var5 = this.field8758.field9227;
        } else if (arg0 == 4) {
            var4 = this.field8758.field9321;
            var5 = this.field8758.field9224;
        } else if (arg0 == 5) {
            var5 = this.field8758.field9253;
            var4 = this.field8758.field9248;
        } else {
            var4 = var5 = new class649(this.field8758);
        }
        return this.method3556(arg1, var5, var4, -3135, arg2, arg0 != 0);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(SIIIB)I")
    private final int method3561(short arg0, int arg1, int arg2, int arg3, byte arg4) {
        field8725++;
        int var6 = class444.field6084[class149.method1067(true, arg1, arg3)];
        if (arg0 != -1) {
            class364 var7 = this.field8758.field8808.method2760(arg0 & 0xFFFF, arg2 ^ 0x6588);
            int var8 = var7.field4929 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg3 < 0) {
                    var9 = 0;
                } else if (arg3 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg3 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field4926 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((var6 & 0xFF0000) >> 16) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((var6 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var15 >> 8) + (var13 << 8 & 0xFF00CD) + (var14 & 0xFF00);
            }
        }
        return arg2 == 14063 ? (var6 << 8) + 255 - (arg4 & 0xFF) : -54;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lq;)V")
    public final void method1949(class397 arg0) {
        field8777++;
        class701 var2 = (class701) arg0;
        if (this.field8697 != null) {
            for (int var3 = 0; var3 < this.field8697.length; var3++) {
                class93 var4 = this.field8697[var3];
                class93 var5 = var4;
                if (var4.field1412 != null) {
                    var5 = var4.field1412;
                }
                var5.field1419 = (int) ((float) this.field8692[var4.field1431] * var2.field9860 + (float) this.field8789[var4.field1431] * var2.field9881 + (float) this.field8788[var4.field1431] * var2.field9878 + var2.field9874);
                var5.field1414 = (int) ((float) this.field8692[var4.field1431] * var2.field9861 + (float) this.field8789[var4.field1431] * var2.field9884 + (float) this.field8788[var4.field1431] * var2.field9887 + var2.field9863);
                var5.field1410 = (int) ((float) this.field8692[var4.field1431] * var2.field9883 + (float) this.field8789[var4.field1431] * var2.field9858 + (float) this.field8788[var4.field1431] * var2.field9856 + var2.field9868);
                var5.field1418 = (int) ((float) this.field8692[var4.field1413] * var2.field9860 + (float) this.field8789[var4.field1413] * var2.field9881 + (float) this.field8788[var4.field1413] * var2.field9878 + var2.field9874);
                var5.field1408 = (int) ((float) this.field8692[var4.field1413] * var2.field9861 + (float) this.field8789[var4.field1413] * var2.field9884 + (float) this.field8788[var4.field1413] * var2.field9887 + var2.field9863);
                var5.field1428 = (int) ((float) this.field8692[var4.field1413] * var2.field9883 + (float) this.field8789[var4.field1413] * var2.field9858 + (float) this.field8788[var4.field1413] * var2.field9856 + var2.field9868);
                var5.field1421 = (int) ((float) this.field8692[var4.field1409] * var2.field9860 + (float) this.field8789[var4.field1409] * var2.field9881 + (float) this.field8788[var4.field1409] * var2.field9878 + var2.field9874);
                var5.field1415 = (int) ((float) this.field8692[var4.field1409] * var2.field9861 + (float) this.field8789[var4.field1409] * var2.field9884 + (float) this.field8788[var4.field1409] * var2.field9887 + var2.field9863);
                var5.field1423 = (int) ((float) this.field8692[var4.field1409] * var2.field9883 + (float) this.field8789[var4.field1409] * var2.field9858 + (float) this.field8788[var4.field1409] * var2.field9856 + var2.field9868);
            }
        }
        if (this.field8693 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field8693.length; var6++) {
            class171 var7 = this.field8693[var6];
            class171 var8 = var7;
            if (var7.field2646 != null) {
                var8 = var7.field2646;
            }
            if (var7.field2641 == null) {
                var7.field2641 = var2.method587();
            } else {
                var7.field2641.method560(var2);
            }
            var8.field2648 = (int) ((float) this.field8692[var7.field2645] * var2.field9860 + (float) this.field8789[var7.field2645] * var2.field9881 + (float) this.field8788[var7.field2645] * var2.field9878 + var2.field9874);
            var8.field2635 = (int) ((float) this.field8692[var7.field2645] * var2.field9861 + (float) this.field8789[var7.field2645] * var2.field9884 + (float) this.field8788[var7.field2645] * var2.field9887 + var2.field9863);
            var8.field2643 = (int) ((float) this.field8692[var7.field2645] * var2.field9883 + (float) this.field8789[var7.field2645] * var2.field9858 + (float) this.field8788[var7.field2645] * var2.field9856 + var2.field9868);
        }
    }

    @OriginalMember(owner = "client!ev", name = "va", descriptor = "(I)V")
    public final void method1907(int arg0) {
        this.field8700 = (short) arg0;
        field8710++;
        if (this.field8784 != null) {
            this.field8784.field710 = null;
        }
        if (this.field8748 != null) {
            this.field8748.field710 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "UA", descriptor = "(SS)V")
    public final void method1929(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field8720; var3++) {
            if (this.field8702[var3] == arg0) {
                this.field8702[var3] = arg1;
            }
        }
        field8734++;
        if (this.field8749 != null) {
            for (int var4 = 0; var4 < this.field8774; var4++) {
                class142 var5 = this.field8749[var4];
                class59 var6 = this.field8775[var4];
                var6.field908 = class444.field6084[this.field8702[var5.field2292] & 0xFFFF] & 0xFFFFFF | var6.field908 & 0xFF000000;
            }
        }
        if (this.field8784 != null) {
            this.field8784.field710 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "()V")
    public final void method1913() {
        field8790++;
        if (this.field8762 <= 0 || this.field8759 <= 0) {
            return;
        }
        this.method3555(0, false);
        if ((this.field8719 & 0x10) == 0 && this.field8728.field3447 == null) {
            this.method3551(false, false);
        }
        this.method3559(0);
    }

    @OriginalMember(owner = "client!ev", name = "Z", descriptor = "(Lw;)Lw;")
    public final class276 method1930(class276 arg0) {
        field8716++;
        if (this.field8762 == 0) {
            return null;
        }
        if (!this.field8689) {
            this.method3562((byte) 126);
        }
        int var2;
        int var3;
        if (this.field8758.field9254 <= 0) {
            var2 = this.field8715 - (this.field8758.field9254 * this.field8747 >> 8) >> this.field8758.field9187;
            var3 = this.field8711 - (this.field8758.field9254 * this.field8736 >> 8) >> this.field8758.field9187;
        } else {
            var2 = this.field8715 - (this.field8758.field9254 * this.field8736 >> 8) >> this.field8758.field9187;
            var3 = this.field8711 - (this.field8758.field9254 * this.field8747 >> 8) >> this.field8758.field9187;
        }
        int var4;
        int var5;
        if (this.field8758.field9219 <= 0) {
            var4 = this.field8737 - (this.field8758.field9219 * this.field8747 >> 8) >> this.field8758.field9187;
            var5 = this.field8782 - (this.field8758.field9219 * this.field8736 >> 8) >> this.field8758.field9187;
        } else {
            var4 = this.field8737 - (this.field8758.field9219 * this.field8736 >> 8) >> this.field8758.field9187;
            var5 = this.field8782 - (this.field8758.field9219 * this.field8747 >> 8) >> this.field8758.field9187;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class548 var8 = (class548) arg0;
        class548 var9;
        if (var8 != null && var8.method3050(var6, -25219, var7)) {
            var9 = var8;
            var8.method3045(true);
        } else {
            var9 = new class548(this.field8758, var6, var7);
        }
        var9.method3046(var4, var5, var2, 112, var3);
        this.method3557(var9, (byte) 85);
        return var9;
    }

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "()I")
    public final int method1945() {
        field8781++;
        return this.field8703;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lno;)V")
    public class649(class658 arg0) {
        this.field8758 = arg0;
        this.field8695 = new class51(null, 5126, 3, 0);
        this.field8766 = new class51(null, 5126, 2, 0);
        this.field8748 = new class51(null, 5126, 3, 0);
        this.field8784 = new class51(null, 5121, 4, 0);
        this.field8728 = new class249();
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lno;Lpf;IIII)V")
    public class649(class658 arg0, class545 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8758 = arg0;
        this.field8738 = arg5;
        this.field8703 = arg2;
        if (class239.method1482(0, arg2, arg5)) {
            this.field8695 = new class51(null, 5126, 3, 0);
        }
        if (class680.method3799(arg2, arg5, -1718)) {
            this.field8766 = new class51(null, 5126, 2, 0);
        }
        if (class66.method533(arg2, -15077, arg5)) {
            this.field8748 = new class51(null, 5126, 3, 0);
        }
        if (class620.method3399((byte) 75, arg5, arg2)) {
            this.field8784 = new class51(null, 5121, 4, 0);
        }
        if (class623.method3405(arg5, 2048, arg2)) {
            this.field8728 = new class249();
        }
        class498 var7 = arg0.field8808;
        this.field8792 = new int[arg1.field7255 + 1];
        int[] var8 = new int[arg1.field7262];
        for (int var9 = 0; var9 < arg1.field7262; var9++) {
            if ((arg1.field7219 == null || arg1.field7219[var9] != 2) && (arg1.field7225 == null || arg1.field7225[var9] == -1 || !var7.method2760(arg1.field7225[var9] & 0xFFFF, 21351).field4917)) {
                var8[this.field8720++] = var9;
                this.field8792[arg1.field7246[var9]]++;
                this.field8792[arg1.field7243[var9]]++;
                this.field8792[arg1.field7218[var9]]++;
            }
        }
        this.field8759 = this.field8720;
        long[] var10 = new long[this.field8720];
        boolean var11 = (this.field8703 & 0x100) != 0;
        label499: for (int var12 = 0; var12 < this.field8720; var12++) {
            int var180 = var8[var12];
            class364 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field7220 != null) {
                for (int var186 = 0; var186 < arg1.field7220.length; var186++) {
                    class263 var187 = arg1.field7220[var186];
                    if (var187.field3651 == var180) {
                        class460 var188 = class54.method363(var187.field3655, (byte) -126);
                        if (var188.field6242) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field8759--;
                            continue label499;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field7225 != null) {
                var189 = arg1.field7225[var180];
                if (var189 != -1) {
                    var181 = var7.method2760(var189 & 0xFFFF, 21351);
                    var184 = var181.field4937;
                    var185 = var181.field4928;
                }
            }
            boolean var190 = arg1.field7223 != null && arg1.field7223[var180] != 0 || var181 != null && var181.field4931 | !var181.field4924;
            if ((var11 || var190) && arg1.field7233 != null) {
                var182 += arg1.field7233[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = ((var189 & 0xFFFF) << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + (long) var194;
        }
        class371.method2187(101, var8, var10);
        this.field8709 = arg1.field7222;
        this.field8788 = arg1.field7237;
        this.field8696 = arg1.field7255;
        this.field8692 = arg1.field7224;
        this.field8787 = arg1.field7230;
        this.field8789 = arg1.field7235;
        this.field8697 = arg1.field7217;
        class663[] var13 = new class663[this.field8696];
        this.field8693 = arg1.field7265;
        if (arg1.field7220 != null) {
            this.field8774 = arg1.field7220.length;
            this.field8749 = new class142[this.field8774];
            this.field8775 = new class59[this.field8774];
            for (int var14 = 0; var14 < this.field8774; var14++) {
                class263 var15 = arg1.field7220[var14];
                class460 var16 = class54.method363(var15.field3655, (byte) -126);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field8720; var18++) {
                    if (var8[var18] == var15.field3651) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class444.field6084[arg1.field7253[var15.field3651] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field7223 == null ? 0 : arg1.field7223[var15.field3651]) << 24;
                this.field8749[var14] = new class142(var17, arg1.field7246[var15.field3651], arg1.field7243[var15.field3651], arg1.field7218[var15.field3651], var16.field6239, var16.field6234, var16.field6240, var16.field6232, var16.field6241, var16.field6242, var16.field6238, var15.field3650);
                this.field8775[var14] = new class59(var20);
            }
        }
        int var21 = this.field8720 * 3;
        this.field8718 = new short[this.field8720];
        this.field8780 = new short[this.field8720];
        this.field8779 = new float[var21];
        this.field8700 = (short) arg4;
        this.field8752 = new byte[this.field8720];
        this.field8724 = new byte[var21];
        class115.field1971 = new long[var21];
        this.field8702 = new short[this.field8720];
        this.field8691 = new float[var21];
        this.field8685 = new short[var21];
        this.field8776 = new short[var21];
        this.field8684 = new short[var21];
        this.field8706 = new short[this.field8720];
        this.field8783 = new short[this.field8720];
        if (arg1.field7241 != null) {
            this.field8686 = new short[this.field8720];
        }
        this.field8746 = new short[var21];
        this.field8714 = (short) arg3;
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field7255; var23++) {
            int var179 = this.field8792[var23];
            this.field8792[var23] = var22;
            var22 += var179;
            var13[var23] = new class663();
        }
        this.field8792[arg1.field7255] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field7263 != null) {
            int var28 = arg1.field7247;
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
            var24 = new int[var28];
            var26 = new int[var28];
            for (int var36 = 0; var36 < this.field8720; var36++) {
                int var43 = var8[var36];
                if (arg1.field7263[var43] != -1) {
                    int var44 = arg1.field7263[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field7246[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field7243[var43];
                        } else {
                            var46 = arg1.field7218[var43];
                        }
                        int var47 = arg1.field7237[var46];
                        int var48 = arg1.field7235[var46];
                        int var49 = arg1.field7224[var46];
                        if (var29[var44] > var47) {
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
            var25 = new int[var28];
            var27 = new float[var28][];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field7254[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field7252[var37];
                        if (var39 == 0) {
                            var40 = 1.0F;
                            var41 = 1.0F;
                        } else if (var39 > 0) {
                            var41 = (float) var39 / 1024.0F;
                            var40 = 1.0F;
                        } else {
                            var41 = 1.0F;
                            var40 = (float) (-var39) / 1024.0F;
                        }
                        var42 = 64.0F / (float) arg1.field7216[var37];
                    } else if (var38 == 2) {
                        var40 = 64.0F / (float) arg1.field7252[var37];
                        var41 = 64.0F / (float) arg1.field7266[var37];
                        var42 = 64.0F / (float) arg1.field7216[var37];
                    } else {
                        var42 = (float) arg1.field7216[var37] / 1024.0F;
                        var40 = (float) arg1.field7252[var37] / 1024.0F;
                        var41 = (float) arg1.field7266[var37] / 1024.0F;
                    }
                    var27[var37] = class517.method2885(arg1.field7264[var37], var42, arg1.field7236[var37], 0, var41, arg1.field7221[var37], var40, class571.method3139(255, arg1.field7234[var37]));
                }
            }
        }
        class638[] var50 = new class638[arg1.field7262];
        for (int var51 = 0; var51 < arg1.field7262; var51++) {
            short var158 = arg1.field7246[var51];
            short var159 = arg1.field7243[var51];
            short var160 = arg1.field7218[var51];
            int var161 = this.field8788[var159] - this.field8788[var158];
            int var162 = this.field8789[var159] - this.field8789[var158];
            int var163 = this.field8692[var159] - this.field8692[var158];
            int var164 = this.field8788[var160] - this.field8788[var158];
            int var165 = this.field8789[var160] - this.field8789[var158];
            int var166 = this.field8692[var160] - this.field8692[var158];
            int var167 = var162 * var166 - var163 * var165;
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var169 >>= 0x1;
                var167 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var167 * var167 + var168 * var168 + (var169 * var169)));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var169 * 256 / var170;
            int var172 = var167 * 256 / var170;
            int var173 = var168 * 256 / var170;
            byte var174 = arg1.field7219 == null ? 0 : arg1.field7219[var51];
            if (var174 == 0) {
                class663 var176 = var13[var158];
                var176.field9413++;
                var176.field9415 += var172;
                var176.field9414 += var173;
                var176.field9416 += var171;
                class663 var177 = var13[var159];
                var177.field9415 += var172;
                var177.field9414 += var173;
                var177.field9413++;
                var177.field9416 += var171;
                class663 var178 = var13[var160];
                var178.field9414 += var173;
                var178.field9415 += var172;
                var178.field9413++;
                var178.field9416 += var171;
            } else if (var174 == 1) {
                class638 var175 = var50[var51] = new class638();
                var175.field8588 = var171;
                var175.field8586 = var172;
                var175.field8587 = var173;
            }
        }
        for (int var52 = 0; var52 < this.field8720; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field7253[var68] & 0xFFFF;
            short var70;
            if (arg1.field7225 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field7225[var68];
            }
            int var71;
            if (arg1.field7263 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field7263[var68];
            }
            int var72;
            if (arg1.field7223 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field7223[var68] & 0xFF;
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
                    var75 = 1.0F;
                    var77 = 0.0F;
                    var74 = 1.0F;
                    var76 = 1.0F;
                    var79 = 1;
                    var78 = 0.0F;
                    var73 = 0.0F;
                    var80 = 2;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field7254[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field7246[var68];
                        short var84 = arg1.field7243[var68];
                        short var85 = arg1.field7218[var68];
                        short var86 = arg1.field7221[var71];
                        short var87 = arg1.field7236[var71];
                        short var88 = arg1.field7264[var71];
                        float var89 = (float) arg1.field7237[var86];
                        float var90 = (float) arg1.field7235[var86];
                        float var91 = (float) arg1.field7224[var86];
                        float var92 = (float) arg1.field7237[var87] - var89;
                        float var93 = (float) arg1.field7235[var87] - var90;
                        float var94 = (float) arg1.field7224[var87] - var91;
                        float var95 = (float) arg1.field7237[var88] - var89;
                        float var96 = (float) arg1.field7235[var88] - var90;
                        float var97 = (float) arg1.field7224[var88] - var91;
                        float var98 = (float) arg1.field7237[var83] - var89;
                        float var99 = (float) arg1.field7235[var83] - var90;
                        float var100 = (float) arg1.field7224[var83] - var91;
                        float var101 = (float) arg1.field7237[var84] - var89;
                        float var102 = (float) arg1.field7235[var84] - var90;
                        float var103 = (float) arg1.field7224[var84] - var91;
                        float var104 = (float) arg1.field7237[var85] - var89;
                        float var105 = (float) arg1.field7235[var85] - var90;
                        float var106 = (float) arg1.field7224[var85] - var91;
                        float var107 = var93 * var97 - var94 * var96;
                        float var108 = var94 * var95 - var92 * var97;
                        float var109 = var92 * var96 - (var93 * var95);
                        float var110 = var96 * var109 - (var97 * var108);
                        float var111 = var97 * var107 - (var95 * var109);
                        float var112 = var95 * var108 - (var96 * var107);
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        float var114 = var93 * var109 - var94 * var108;
                        float var115 = var92 * var108 - (var93 * var107);
                        float var116 = var94 * var107 - (var92 * var109);
                        float var117 = 1.0F / (var97 * var115 + var95 * var114 + var96 * var116);
                        var74 = (var100 * var115 + var98 * var114 + var99 * var116) * var117;
                        var78 = (var106 * var115 + var104 * var114 + var105 * var116) * var117;
                        var76 = (var103 * var115 + var101 * var114 + var102 * var116) * var117;
                    } else {
                        short var118 = arg1.field7246[var68];
                        short var119 = arg1.field7243[var68];
                        short var120 = arg1.field7218[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field7267[var71];
                        float var126 = (float) arg1.field7251[var71] / 256.0F;
                        if (var82 == 1) {
                            float var127 = (float) arg1.field7266[var71] / 1024.0F;
                            class338.method2055(var121, arg1.field7235[var118], arg1.field7224[var118], var126, var127, arg1.field7237[var118], var124, (byte) -120, var122, var123, var125);
                            var73 = class568.field7543;
                            var74 = class471.field6300;
                            class338.method2055(var121, arg1.field7235[var119], arg1.field7224[var119], var126, var127, arg1.field7237[var119], var124, (byte) -120, var122, var123, var125);
                            var75 = class568.field7543;
                            var76 = class471.field6300;
                            class338.method2055(var121, arg1.field7235[var120], arg1.field7224[var120], var126, var127, arg1.field7237[var120], var124, (byte) -120, var122, var123, var125);
                            var78 = class471.field6300;
                            var77 = class568.field7543;
                            float var128 = var127 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if ((var128 < var77 - var73)) {
                                    var77 -= var127;
                                    var80 = 1;
                                } else if (var73 - var77 > var128) {
                                    var80 = 2;
                                    var77 += var127;
                                }
                                if (var75 - var73 > var128) {
                                    var79 = 1;
                                    var75 -= var127;
                                } else if (var128 < var73 - var75) {
                                    var79 = 2;
                                    var75 += var127;
                                }
                            } else {
                                if (var78 - var74 > var128) {
                                    var78 -= var127;
                                    var80 = 1;
                                } else if (var128 < var74 - var78) {
                                    var80 = 2;
                                    var78 += var127;
                                }
                                if (var76 - var74 > var128) {
                                    var76 -= var127;
                                    var79 = 1;
                                } else if (var128 < var74 - var76) {
                                    var76 += var127;
                                    var79 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var129 = (float) arg1.field7240[var71] / 256.0F;
                            float var130 = (float) arg1.field7259[var71] / 256.0F;
                            int var131 = arg1.field7237[var119] - arg1.field7237[var118];
                            int var132 = arg1.field7235[var119] - arg1.field7235[var118];
                            int var133 = arg1.field7224[var119] - arg1.field7224[var118];
                            int var134 = arg1.field7237[var120] - arg1.field7237[var118];
                            int var135 = arg1.field7235[var120] - arg1.field7235[var118];
                            int var136 = arg1.field7224[var120] - arg1.field7224[var118];
                            int var137 = var132 * var136 - var133 * var135;
                            int var138 = var133 * var134 - var131 * var136;
                            int var139 = var131 * var135 - (var132 * var134);
                            float var140 = 64.0F / (float) arg1.field7252[var71];
                            float var141 = 64.0F / (float) arg1.field7216[var71];
                            float var142 = 64.0F / (float) arg1.field7266[var71];
                            float var143 = (var124[2] * (float) var139 + var124[1] * (float) var138 + var124[0] * (float) var137) / var140;
                            float var144 = (var124[5] * (float) var139 + var124[3] * (float) var137 + var124[4] * (float) var138) / var141;
                            float var145 = (var124[8] * (float) var139 + var124[6] * (float) var137 + var124[7] * (float) var138) / var142;
                            var81 = class65.method526(var145, 3, var143, var144);
                            class461.method2619(arg1.field7224[var118], (byte) -90, arg1.field7237[var118], arg1.field7235[var118], var125, var129, var122, var123, var126, var124, var130, var121, var81);
                            var74 = class300.field4194;
                            var73 = class313.field4307;
                            class461.method2619(arg1.field7224[var119], (byte) -87, arg1.field7237[var119], arg1.field7235[var119], var125, var129, var122, var123, var126, var124, var130, var121, var81);
                            var75 = class313.field4307;
                            var76 = class300.field4194;
                            class461.method2619(arg1.field7224[var120], (byte) -111, arg1.field7237[var120], arg1.field7235[var120], var125, var129, var122, var123, var126, var124, var130, var121, var81);
                            var78 = class300.field4194;
                            var77 = class313.field4307;
                        } else if (var82 == 3) {
                            class270.method1646((byte) -127, var125, var121, arg1.field7235[var118], var126, var124, arg1.field7237[var118], var123, var122, arg1.field7224[var118]);
                            var74 = class48.field693;
                            var73 = class205.field2966;
                            class270.method1646((byte) -102, var125, var121, arg1.field7235[var119], var126, var124, arg1.field7237[var119], var123, var122, arg1.field7224[var119]);
                            var75 = class205.field2966;
                            var76 = class48.field693;
                            class270.method1646((byte) -122, var125, var121, arg1.field7235[var120], var126, var124, arg1.field7237[var120], var123, var122, arg1.field7224[var120]);
                            var77 = class205.field2966;
                            var78 = class48.field693;
                            if ((var125 & 0x1) == 0) {
                                if (var77 - var73 > 0.5F) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                                if ((var75 - var73 > 0.5F)) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                            } else {
                                if ((var76 - var74 > 0.5F)) {
                                    var79 = 1;
                                    var76--;
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
            if (arg1.field7219 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field7219[var68];
            }
            if (var146 == 0) {
                long var147 = ((long) (var69 << 8) + (long) var72 + (long) (var81 << 24) << 32) + (long) (var71 << 2);
                short var149 = arg1.field7246[var68];
                short var150 = arg1.field7243[var68];
                short var151 = arg1.field7218[var68];
                class663 var152 = var13[var149];
                this.field8780[var52] = this.method3552(var73, var152.field9415, var147, var74, var149, (byte) 98, arg1, var152.field9414, var152.field9413, var152.field9416);
                class663 var153 = var13[var150];
                this.field8706[var52] = this.method3552(var75, var153.field9415, (long) var79 + var147, var76, var150, (byte) 98, arg1, var153.field9414, var153.field9413, var153.field9416);
                class663 var154 = var13[var151];
                this.field8783[var52] = this.method3552(var77, var154.field9415, (long) var80 + var147, var78, var151, (byte) 98, arg1, var154.field9414, var154.field9413, var154.field9416);
            } else if (var146 == 1) {
                class638 var155 = var50[var68];
                long var156 = (long) ((var155.field8586 > 0 ? 1024 : 2048) + (var71 << 2) + ((var155.field8587 + 256 << 12) - -(var155.field8588 + 256 << 22))) + ((long) (var81 << 24) - (-((long) (var69 << 8)) - ((long) var72)) << 32);
                this.field8780[var52] = this.method3552(var73, var155.field8586, var156, var74, arg1.field7246[var68], (byte) 98, arg1, var155.field8587, 0, var155.field8588);
                this.field8706[var52] = this.method3552(var75, var155.field8586, (long) var79 + var156, var76, arg1.field7243[var68], (byte) 98, arg1, var155.field8587, 0, var155.field8588);
                this.field8783[var52] = this.method3552(var77, var155.field8586, (long) var80 + var156, var78, arg1.field7218[var68], (byte) 98, arg1, var155.field8587, 0, var155.field8588);
            }
            if (arg1.field7225 == null) {
                this.field8718[var52] = -1;
            } else {
                this.field8718[var52] = arg1.field7225[var68];
            }
            if (arg1.field7223 != null) {
                this.field8752[var52] = arg1.field7223[var68];
            }
            if (arg1.field7241 != null) {
                this.field8686[var52] = arg1.field7241[var68];
            }
            this.field8702[var52] = arg1.field7253[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field8759; var55++) {
            short var67 = this.field8718[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field8770 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field8759; var58++) {
            short var66 = this.field8718[var58];
            if (var56 != var66) {
                this.field8770[var57++] = var58;
                var56 = var66;
            }
        }
        this.field8770[var57] = this.field8759;
        class115.field1971 = null;
        this.field8776 = class659.method3689(this.field8762, this.field8776, -16036);
        this.field8685 = class659.method3689(this.field8762, this.field8685, -16036);
        this.field8746 = class659.method3689(this.field8762, this.field8746, -16036);
        this.field8724 = class586.method3224((byte) -19, this.field8762, this.field8724);
        this.field8779 = class18.method189(this.field8762, this.field8779, (byte) 125);
        this.field8691 = class18.method189(this.field8762, this.field8691, (byte) 125);
        if (arg1.field7248 != null && class106.method803(this.field8738, 255, arg2)) {
            this.field8755 = arg1.method3033(28086, false);
        }
        if (arg1.field7220 != null && class316.method1883(arg2, this.field8738, 117)) {
            this.field8760 = arg1.method3021((byte) -13);
        }
        if (arg1.field7239 != null && class520.method2921(arg2, (byte) -67, this.field8738)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field8720; var61++) {
                int var65 = arg1.field7239[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var59 < var65) {
                        var59 = var65;
                    }
                }
            }
            this.field8791 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field8791[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field8720; var63++) {
                int var64 = arg1.field7239[var8[var63]];
                if (var64 >= 0) {
                    this.field8791[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(B)V")
    private final void method3562(byte arg0) {
        field8704++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field8696; var10++) {
            int var11 = this.field8788[var10];
            int var12 = this.field8789[var10];
            if (var6 < var12) {
                var6 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            int var13 = this.field8692[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + (var13 * var13);
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var13 * var13 + var11 * var11 + var12 * var12;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field8711 = (short) var5;
        this.field8747 = (short) var3;
        if (arg0 != 126) {
            return;
        }
        this.field8736 = (short) var6;
        this.field8715 = (short) var2;
        this.field8737 = (short) var4;
        this.field8782 = (short) var7;
        this.field8773 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field8689 = true;
    }
}
