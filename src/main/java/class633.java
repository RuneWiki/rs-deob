import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class633 extends class55 {

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "Z")
    private boolean field8863 = false;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    private int field8841 = 0;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    private int field8849 = 0;

    @OriginalMember(owner = "client!qf", name = "Db", descriptor = "Z")
    private boolean field8903 = false;

    @OriginalMember(owner = "client!qf", name = "ac", descriptor = "I")
    private int field8926 = 0;

    @OriginalMember(owner = "client!qf", name = "pc", descriptor = "I")
    private int field8941 = 0;

    @OriginalMember(owner = "client!qf", name = "wc", descriptor = "Z")
    private boolean field8948 = true;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    private int field8859 = 0;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Lok;")
    private class228 field8864;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "Llq;")
    private class512 field8851;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "Llq;")
    private class512 field8853;

    @OriginalMember(owner = "client!qf", name = "yc", descriptor = "Llq;")
    private class512 field8950;

    @OriginalMember(owner = "client!qf", name = "jc", descriptor = "Llq;")
    private class512 field8935;

    @OriginalMember(owner = "client!qf", name = "dc", descriptor = "Lkc;")
    private class118 field8929;

    @OriginalMember(owner = "client!qf", name = "Xb", descriptor = "I")
    private int field8923;

    @OriginalMember(owner = "client!qf", name = "rc", descriptor = "I")
    private int field8943;

    @OriginalMember(owner = "client!qf", name = "nb", descriptor = "[I")
    private int[] field8887;

    @OriginalMember(owner = "client!qf", name = "Ab", descriptor = "[S")
    private short[] field8900;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "[I")
    private int[] field8870;

    @OriginalMember(owner = "client!qf", name = "tb", descriptor = "[I")
    private int[] field8893;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "[I")
    private int[] field8866;

    @OriginalMember(owner = "client!qf", name = "xb", descriptor = "[Llea;")
    private class568[] field8897;

    @OriginalMember(owner = "client!qf", name = "Sb", descriptor = "[Lin;")
    private class77[] field8918;

    @OriginalMember(owner = "client!qf", name = "vb", descriptor = "I")
    private int field8895;

    @OriginalMember(owner = "client!qf", name = "ob", descriptor = "[Lrfa;")
    private class182[] field8888;

    @OriginalMember(owner = "client!qf", name = "Ac", descriptor = "[Liw;")
    private class284[] field8952;

    @OriginalMember(owner = "client!qf", name = "kc", descriptor = "[S")
    private short[] field8936;

    @OriginalMember(owner = "client!qf", name = "Ic", descriptor = "S")
    private short field8960;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "[F")
    private float[] field8843;

    @OriginalMember(owner = "client!qf", name = "Cc", descriptor = "[B")
    private byte[] field8954;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "[S")
    private short[] field8872;

    @OriginalMember(owner = "client!qf", name = "zc", descriptor = "[S")
    private short[] field8951;

    @OriginalMember(owner = "client!qf", name = "oc", descriptor = "[S")
    private short[] field8940;

    @OriginalMember(owner = "client!qf", name = "uc", descriptor = "[S")
    private short[] field8946;

    @OriginalMember(owner = "client!qf", name = "vc", descriptor = "[S")
    private short[] field8947;

    @OriginalMember(owner = "client!qf", name = "Vb", descriptor = "[S")
    private short[] field8921;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "[S")
    private short[] field8848;

    @OriginalMember(owner = "client!qf", name = "fb", descriptor = "[S")
    private short[] field8879;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "[B")
    private byte[] field8847;

    @OriginalMember(owner = "client!qf", name = "hc", descriptor = "[S")
    private short[] field8933;

    @OriginalMember(owner = "client!qf", name = "lb", descriptor = "[F")
    private float[] field8885;

    @OriginalMember(owner = "client!qf", name = "cb", descriptor = "S")
    private short field8876;

    @OriginalMember(owner = "client!qf", name = "zb", descriptor = "[I")
    private int[] field8899;

    @OriginalMember(owner = "client!qf", name = "Rb", descriptor = "[[I")
    private int[][] field8917;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "[[I")
    private int[][] field8860;

    @OriginalMember(owner = "client!qf", name = "bc", descriptor = "[[I")
    private int[][] field8927;

    @OriginalMember(owner = "client!qf", name = "Zb", descriptor = "Lnea;")
    public static class664 field8925 = new class664(36, -1);

    @OriginalMember(owner = "client!qf", name = "tc", descriptor = "[I")
    public static int[] field8945 = new int[25];

    @OriginalMember(owner = "client!qf", name = "lc", descriptor = "I")
    public static int field8937 = 0;

    @OriginalMember(owner = "client!qf", name = "qc", descriptor = "Lnea;")
    public static class664 field8942 = new class664(88, 19);

    @OriginalMember(owner = "client!qf", name = "Ob", descriptor = "B")
    private byte field8914;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!qf", name = "hb", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!qf", name = "jb", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!qf", name = "kb", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!qf", name = "mb", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!qf", name = "pb", descriptor = "I")
    public static int field8889;

    @OriginalMember(owner = "client!qf", name = "qb", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!qf", name = "rb", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!qf", name = "sb", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!qf", name = "ub", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!qf", name = "wb", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!qf", name = "yb", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!qf", name = "Bb", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!qf", name = "Cb", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!qf", name = "Fb", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!qf", name = "Gb", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!qf", name = "Ib", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!qf", name = "Jb", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!qf", name = "Kb", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!qf", name = "Lb", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!qf", name = "Mb", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!qf", name = "Nb", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!qf", name = "Pb", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!qf", name = "Qb", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!qf", name = "Tb", descriptor = "I")
    public static int field8919;

    @OriginalMember(owner = "client!qf", name = "Ub", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!qf", name = "Wb", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!qf", name = "Yb", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!qf", name = "cc", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!qf", name = "ec", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!qf", name = "gc", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!qf", name = "ic", descriptor = "I")
    public static int field8934;

    @OriginalMember(owner = "client!qf", name = "mc", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!qf", name = "nc", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!qf", name = "sc", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!qf", name = "Bc", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!qf", name = "Dc", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!qf", name = "Ec", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!qf", name = "Fc", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!qf", name = "Gc", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!qf", name = "Hc", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!qf", name = "eb", descriptor = "Lcd;")
    private class283 field8878;

    @OriginalMember(owner = "client!qf", name = "gb", descriptor = "Lvu;")
    private class306 field8880;

    @OriginalMember(owner = "client!qf", name = "Hb", descriptor = "Lpg;")
    private class682 field8907;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "S")
    private short field8856;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "S")
    private short field8871;

    @OriginalMember(owner = "client!qf", name = "bb", descriptor = "S")
    private short field8875;

    @OriginalMember(owner = "client!qf", name = "db", descriptor = "S")
    private short field8877;

    @OriginalMember(owner = "client!qf", name = "ib", descriptor = "S")
    private short field8882;

    @OriginalMember(owner = "client!qf", name = "Eb", descriptor = "S")
    private short field8904;

    @OriginalMember(owner = "client!qf", name = "fc", descriptor = "S")
    private short field8931;

    @OriginalMember(owner = "client!qf", name = "xc", descriptor = "S")
    private short field8949;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "()I", line = 4)
    public final int method488() {
        field8881++;
        if (!this.field8863) {
            this.method3529(-24);
        }
        return this.field8877;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()V", line = 16)
    public final void method530() {
        field8873++;
        if (this.field8841 <= 0 || this.field8926 <= 0) {
            return;
        }
        this.method3527((byte) 109, false);
        if ((this.field8914 & 0x10) == 0 && this.field8929.field1793 == null) {
            this.method3532(false, -11);
        }
        this.method3522((byte) 74);
    }

    @OriginalMember(owner = "client!qf", name = "RA", descriptor = "()I", line = 32)
    public final int method525() {
        if (!this.field8863) {
            this.method3529(-36);
        }
        field8891++;
        return this.field8875;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "()V", line = 44)
    public final void method535() {
        field8861++;
    }

    @OriginalMember(owner = "client!qf", name = "oa", descriptor = "(III)V", line = 51)
    public final void method548(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field8849; var4++) {
            if (arg0 != 0) {
                this.field8893[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field8866[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field8870[var4] += arg2;
            }
        }
        field8854++;
        this.field8863 = false;
        if (this.field8851 != null) {
            this.field8851.field7199 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BIZ)Lda;", line = 84)
    public final class55 method532(byte arg0, int arg1, boolean arg2) {
        field8840++;
        class633 var4;
        class633 var5;
        if (arg0 == 1) {
            var5 = this.field8864.field3530;
            var4 = this.field8864.field3502;
        } else if (arg0 == 2) {
            var4 = this.field8864.field3533;
            var5 = this.field8864.field3548;
        } else if (arg0 == 3) {
            var4 = this.field8864.field3492;
            var5 = this.field8864.field3457;
        } else if (arg0 == 4) {
            var4 = this.field8864.field3527;
            var5 = this.field8864.field3535;
        } else if (arg0 == 5) {
            var5 = this.field8864.field3525;
            var4 = this.field8864.field3444;
        } else {
            var4 = var5 = new class633(this.field8864);
        }
        return this.method3524(true, arg2, arg1, var5, arg0 != 0, var4);
    }

    @OriginalMember(owner = "client!qf", name = "za", descriptor = "()I", line = 132)
    public final int method524() {
        if (!this.field8863) {
            this.method3529(-34);
        }
        field8898++;
        return this.field8882;
    }

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "(III)V", line = 144)
    public final void method499(int arg0, int arg1, int arg2) {
        field8928++;
        for (int var4 = 0; var4 < this.field8849; var4++) {
            if (arg0 != 128) {
                this.field8893[var4] = this.field8893[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field8866[var4] = this.field8866[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field8870[var4] = this.field8870[var4] * arg2 >> 7;
            }
        }
        if (this.field8851 != null) {
            this.field8851.field7199 = null;
        }
        this.field8863 = false;
    }

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "()V", line = 178)
    public final void method514() {
        for (int var1 = 0; var1 < this.field8941; var1++) {
            this.field8893[var1] = this.field8893[var1] + 7 >> 4;
            this.field8866[var1] = this.field8866[var1] + 7 >> 4;
            this.field8870[var1] = this.field8870[var1] + 7 >> 4;
        }
        field8862++;
        this.field8863 = false;
        if (this.field8851 != null) {
            this.field8851.field7199 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "KA", descriptor = "()I", line = 204)
    public final int method512() {
        field8901++;
        if (!this.field8863) {
            this.method3529(-84);
        }
        return this.field8931;
    }

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "()I", line = 217)
    public final int method534() {
        if (!this.field8863) {
            this.method3529(-39);
        }
        field8930++;
        return this.field8904;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V", line = 230)
    public final void method497(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field8859; var5++) {
            int var9 = this.field8947[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x3CB) >> 7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 -= -((arg1 - var11) * arg3 >> 7);
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field8947[var5] = (short) class486.method2826(var12, class486.method2826(var11 << 7, var10 << 10));
        }
        field8958++;
        if (this.field8888 != null) {
            for (int var6 = 0; var6 < this.field8895; var6++) {
                class182 var7 = this.field8888[var6];
                class284 var8 = this.field8952[var6];
                var8.field4263 = var8.field4263 & 0xFF000000 | class437.field6386[this.field8947[var7.field2570] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field8935 != null) {
            this.field8935.field7199 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "TA", descriptor = "()I", line = 288)
    public final int method503() {
        field8886++;
        return this.field8960;
    }

    @OriginalMember(owner = "client!qf", name = "LA", descriptor = "()Z", line = 301)
    public final boolean method545() {
        field8884++;
        return this.field8903;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILq;Z)Z", line = 316)
    public final boolean method529(int arg0, int arg1, class391 arg2, boolean arg3) {
        field8892++;
        return this.method3537(-1, arg0, arg1, 25538, arg3, arg2);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIII)Z", line = 324)
    private final boolean method3521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8910++;
        if (arg3 < arg5 && arg4 > arg3 && arg3 < arg1) {
            return false;
        } else if (arg3 > arg5 && arg4 < arg3 && arg1 < arg3) {
            return false;
        } else if (arg6 < arg8 && arg6 < arg7 && arg0 > arg6) {
            return false;
        } else {
            if (arg2 != 21551) {
                this.field8856 = 107;
            }
            return arg6 <= arg8 || arg7 >= arg6 || arg0 >= arg6;
        }
    }

    @OriginalMember(owner = "client!qf", name = "WA", descriptor = "(IIII)V", line = 349)
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
        field8939++;
        if (arg0 == 0) {
            class443.field6459 = 0;
            class666.field9391 = 0;
            int var5 = 0;
            class370.field5296 = 0;
            for (int var6 = 0; var6 < this.field8849; var6++) {
                class443.field6459 += this.field8893[var6];
                class666.field9391 += this.field8866[var6];
                class370.field5296 += this.field8870[var6];
                var5++;
            }
            if (var5 > 0) {
                class370.field5296 = class370.field5296 / var5 + arg3;
                class443.field6459 = class443.field6459 / var5 + arg1;
                class666.field9391 = class666.field9391 / var5 + arg2;
            } else {
                class443.field6459 = arg1;
                class666.field9391 = arg2;
                class370.field5296 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field8849; var7++) {
                this.field8893[var7] += arg1;
                this.field8866[var7] += arg2;
                this.field8870[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field8849; var8++) {
                this.field8893[var8] -= class443.field6459;
                this.field8866[var8] -= class666.field9391;
                this.field8870[var8] -= class370.field5296;
                if (arg3 != 0) {
                    int var9 = class189.field2719[arg3];
                    int var10 = class189.field2721[arg3];
                    int var11 = this.field8893[var8] * var10 + this.field8866[var8] * var9 + 16383 >> 14;
                    this.field8866[var8] = this.field8866[var8] * var10 + 16383 - (this.field8893[var8] * var9) >> 14;
                    this.field8893[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class189.field2719[arg1];
                    int var13 = class189.field2721[arg1];
                    int var14 = this.field8866[var8] * var13 + 16383 - (this.field8870[var8] * var12) >> 14;
                    this.field8870[var8] = this.field8870[var8] * var13 + (this.field8866[var8] * var12 + 16383) >> 14;
                    this.field8866[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class189.field2719[arg2];
                    int var16 = class189.field2721[arg2];
                    int var17 = this.field8870[var8] * var15 + this.field8893[var8] * var16 + 16383 >> 14;
                    this.field8870[var8] = this.field8870[var8] * var16 - (this.field8893[var8] * var15 - 16383) >> 14;
                    this.field8893[var8] = var17;
                }
                this.field8893[var8] += class443.field6459;
                this.field8866[var8] += class666.field9391;
                this.field8870[var8] += class370.field5296;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field8849; var18++) {
                this.field8893[var18] -= class443.field6459;
                this.field8866[var18] -= class666.field9391;
                this.field8870[var18] -= class370.field5296;
                this.field8893[var18] = this.field8893[var18] * arg1 / 128;
                this.field8866[var18] = this.field8866[var18] * arg2 / 128;
                this.field8870[var18] = this.field8870[var18] * arg3 / 128;
                this.field8893[var18] += class443.field6459;
                this.field8866[var18] += class666.field9391;
                this.field8870[var18] += class370.field5296;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field8859; var19++) {
                int var23 = (this.field8847[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field8847[var19] = (byte) var23;
            }
            if (this.field8935 != null) {
                this.field8935.field7199 = null;
            }
            if (this.field8888 != null) {
                for (int var20 = 0; var20 < this.field8895; var20++) {
                    class182 var21 = this.field8888[var20];
                    class284 var22 = this.field8952[var20];
                    var22.field4263 = 255 - (this.field8847[var21.field2570] & 0xFF) << 24 | var22.field4263 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field8859; var24++) {
                int var28 = this.field8947[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg2 / 4 + var30;
                int var32 = var28 & 0x7F;
                int var33 = arg1 + var29 & 0x3F;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                int var34 = arg3 + var32;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field8947[var24] = (short) class486.method2826(var34, class486.method2826(var33 << 10, var31 << 7));
            }
            if (this.field8935 != null) {
                this.field8935.field7199 = null;
            }
            if (this.field8888 != null) {
                for (int var25 = 0; var25 < this.field8895; var25++) {
                    class182 var26 = this.field8888[var25];
                    class284 var27 = this.field8952[var25];
                    var27.field4263 = var27.field4263 & 0xFF000000 | class437.field6386[this.field8947[var26.field2570] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field8895; var35++) {
                class284 var36 = this.field8952[var35];
                var36.field4254 += arg2;
                var36.field4262 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field8895; var37++) {
                class284 var38 = this.field8952[var37];
                var38.field4259 = var38.field4259 * arg1 >> 7;
                var38.field4255 = var38.field4255 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field8895; var39++) {
                class284 var40 = this.field8952[var39];
                var40.field4257 = var40.field4257 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "(I)V", line = 658)
    public final void method533(int arg0) {
        if (this.field8935 != null) {
            this.field8935.field7199 = null;
        }
        this.field8960 = (short) arg0;
        field8913++;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V", line = 677)
    private final void method3522(byte arg0) {
        field8912++;
        if (!this.field8948) {
            return;
        }
        this.field8948 = false;
        if (this.field8897 == null && this.field8918 == null && this.field8888 == null) {
            if (this.field8893 != null && !class147.method1047(this.field8943, this.field8923, 0)) {
                if (this.field8851 != null && this.field8851.field7199 == null) {
                    this.field8948 = true;
                } else {
                    if (!this.field8863) {
                        this.method3529(-21);
                    }
                    this.field8893 = null;
                }
            }
            if (this.field8866 != null && !class55.method603(2048, this.field8923, this.field8943)) {
                if (this.field8851 != null && this.field8851.field7199 == null) {
                    this.field8948 = true;
                } else {
                    if (!this.field8863) {
                        this.method3529(-75);
                    }
                    this.field8866 = null;
                }
            }
            if (this.field8870 != null && !class141.method1019(this.field8943, this.field8923, 2048)) {
                if (this.field8851 != null && this.field8851.field7199 == null) {
                    this.field8948 = true;
                } else {
                    if (!this.field8863) {
                        this.method3529(-106);
                    }
                    this.field8870 = null;
                }
            }
        }
        if (this.field8921 != null && this.field8893 == null && this.field8866 == null && this.field8870 == null) {
            this.field8887 = null;
            this.field8921 = null;
        }
        if (this.field8954 != null && !class30.method343(this.field8923, this.field8943, 104)) {
            if (this.field8950 == null) {
                if (this.field8935 != null && this.field8935.field7199 == null) {
                    this.field8948 = true;
                } else {
                    this.field8848 = this.field8951 = this.field8936 = null;
                    this.field8954 = null;
                }
            } else if (this.field8950.field7199 == null) {
                this.field8948 = true;
            } else {
                this.field8848 = this.field8951 = this.field8936 = null;
                this.field8954 = null;
            }
        }
        if (this.field8947 != null && !class142.method1024((byte) -86, this.field8923, this.field8943)) {
            if (this.field8935 != null && this.field8935.field7199 == null) {
                this.field8948 = true;
            } else {
                this.field8947 = null;
            }
        }
        int var2 = -99 / ((2 - arg0) / 59);
        if (this.field8847 != null && !class688.method3793(this.field8923, this.field8943, true)) {
            if (this.field8935 != null && this.field8935.field7199 == null) {
                this.field8948 = true;
            } else {
                this.field8847 = null;
            }
        }
        if (this.field8843 != null && !class87.method759(this.field8943, this.field8923, false)) {
            if (this.field8853 != null && this.field8853.field7199 == null) {
                this.field8948 = true;
            } else {
                this.field8843 = this.field8885 = null;
            }
        }
        if (this.field8940 != null && !class592.method3355(this.field8923, 72, this.field8943)) {
            if (this.field8935 != null && this.field8935.field7199 == null) {
                this.field8948 = true;
            } else {
                this.field8940 = null;
            }
        }
        if (this.field8872 != null && !class455.method2685(false, this.field8943, this.field8923)) {
            if ((this.field8929 == null || this.field8929.field1793 != null) && (this.field8935 == null || this.field8935.field7199 != null)) {
                this.field8872 = this.field8933 = this.field8946 = null;
            } else {
                this.field8948 = true;
            }
        }
        if (this.field8927 != null && !class487.method2830(this.field8943, 79, this.field8923)) {
            this.field8927 = null;
            this.field8879 = null;
        }
        if (this.field8917 != null && !class66.method672(235, this.field8923, this.field8943)) {
            this.field8900 = null;
            this.field8917 = null;
        }
        if (this.field8860 != null && !class161.method1112(this.field8923, this.field8943, -1)) {
            this.field8860 = null;
        }
        if (this.field8899 != null && (this.field8943 & 0x800) == 0 && (this.field8943 & 0x40000) == 0) {
            this.field8899 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(SS)V", line = 853)
    public final void method500(short arg0, short arg1) {
        field8944++;
        for (int var3 = 0; var3 < this.field8859; var3++) {
            if (this.field8947[var3] == arg0) {
                this.field8947[var3] = arg1;
            }
        }
        if (this.field8888 != null) {
            for (int var4 = 0; var4 < this.field8895; var4++) {
                class182 var5 = this.field8888[var4];
                class284 var6 = this.field8952[var4];
                var6.field4263 = class437.field6386[this.field8947[var5.field2570] & 0xFFFF] & 0xFFFFFF | var6.field4263 & 0xFF000000;
            }
        }
        if (this.field8935 != null) {
            this.field8935.field7199 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "ba", descriptor = "(IILi;Li;III)V", line = 894)
    public final void method523(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6) {
        field8865++;
        if (!this.field8863) {
            this.method3529(-49);
        }
        int var8 = this.field8931 + arg4;
        int var9 = arg4 + this.field8871;
        int var10 = this.field8856 + arg6;
        int var11 = this.field8882 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field631 <= (arg2.field629 + var9 >> arg2.field625) || var10 < 0 || arg2.field629 + var11 >> arg2.field625 >= arg2.field632) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (arg3.field629 + var9 >> arg3.field625) >= arg3.field631 || var10 < 0 || (arg3.field629 + var11 >> arg3.field625) >= arg3.field632) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field625;
            int var13 = var9 + arg2.field629 - 1 >> arg2.field625;
            int var14 = var10 >> arg2.field625;
            int var15 = arg2.field629 - (1 - var11) >> arg2.field625;
            if (arg2.method432(var12, false, var14) == arg5 && arg5 == arg2.method432(var13, false, var14) && arg5 == arg2.method432(var12, false, var15) && arg2.method432(var13, false, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field8849; var16++) {
                this.field8866[var16] = (this.field8866[var16] + arg2.method442(this.field8893[var16] + arg4, true, this.field8870[var16] + arg6)) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field8877;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field8849; var18++) {
                int var19 = (this.field8866[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field8866[var18] += (arg2.method442(this.field8893[var18] + arg4, true, this.field8870[var18] + arg6) - arg5) * (arg1 - var19) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = ((arg1 & 0xFF84) >> 8) * 4;
            int var22 = arg1 >> 16 & 0xFF << 6;
            int var23 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var20 >> 1) < 0 || (arg2.field631 << arg2.field625) <= ((var20 >> 1) + arg2.field629 + arg4) || (arg6 - (var21 >> 1)) < 0 || (arg2.field632 << arg2.field625) <= (arg2.field629 + arg6 + (var21 >> 1))) {
                return;
            }
            this.method601(var20, var21, false, var22, arg4, arg5, arg2, var23, arg6);
        } else if (arg0 == 4) {
            int var31 = this.field8904 - this.field8877;
            for (int var32 = 0; var32 < this.field8849; var32++) {
                this.field8866[var32] = this.field8866[var32] + arg3.method442(this.field8893[var32] + arg4, true, this.field8870[var32] + arg6) + var31 - arg5;
            }
        } else if (arg0 == 5) {
            int var24 = this.field8904 - this.field8877;
            for (int var25 = 0; var25 < this.field8849; var25++) {
                int var26 = this.field8893[var25] + arg4;
                int var27 = this.field8870[var25] + arg6;
                int var28 = arg2.method442(var26, true, var27);
                int var29 = arg3.method442(var26, true, var27);
                int var30 = var28 - var29 - arg1;
                this.field8866[var25] = ((this.field8866[var25] << 8) / var24 * var30 >> 8) + var28 - arg5;
            }
        }
        this.field8863 = false;
        if (this.field8851 != null) {
            this.field8851.field7199 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BIISI)I", line = 1052)
    private final int method3523(byte arg0, int arg1, int arg2, short arg3, int arg4) {
        field8906++;
        int var6 = class437.field6386[class703.method3919(arg2, 127, arg1)];
        if (arg4 < 124) {
            this.method540(84);
        }
        if (arg3 != -1) {
            class159 var7 = this.field8864.field2384.method1386(arg3 & 0xFFFF, -6514);
            int var8 = var7.field2292 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg1 < 0) {
                    var9 = 0;
                } else if (arg1 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg1 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field2297 & 0xFF;
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
                var6 = (var13 << 8 & 0xFF005A) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) - ((arg0 & 0xFF) - 255);
    }

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "()Z", line = 1124)
    public final boolean method506() {
        field8842++;
        if (this.field8917 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field8941; var1++) {
            this.field8893[var1] <<= 0x4;
            this.field8866[var1] <<= 0x4;
            this.field8870[var1] <<= 0x4;
        }
        class443.field6459 = 0;
        class370.field5296 = 0;
        class666.field9391 = 0;
        return true;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lda;IIIZ)V", line = 1156)
    public final void method539(class55 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8919++;
        class633 var6 = (class633) arg0;
        if (this.field8859 == 0 || var6.field8859 == 0) {
            return;
        }
        int var7 = var6.field8849;
        int[] var8 = var6.field8893;
        int[] var9 = var6.field8866;
        int[] var10 = var6.field8870;
        short[] var11 = var6.field8848;
        short[] var12 = var6.field8951;
        short[] var13 = var6.field8936;
        byte[] var14 = var6.field8954;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field8907 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var18 = this.field8907.field9620;
            var17 = this.field8907.field9615;
            var16 = this.field8907.field9614;
            var15 = this.field8907.field9617;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field8907 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var22 = var6.field8907.field9617;
            var20 = var6.field8907.field9620;
            var19 = var6.field8907.field9615;
            var21 = var6.field8907.field9614;
        }
        int[] var23 = var6.field8887;
        short[] var24 = var6.field8921;
        if (!var6.field8863) {
            var6.method3529(-69);
        }
        short var25 = var6.field8877;
        short var26 = var6.field8904;
        short var27 = var6.field8931;
        short var28 = var6.field8871;
        short var29 = var6.field8856;
        short var30 = var6.field8882;
        for (int var31 = 0; var31 < this.field8849; var31++) {
            int var32 = this.field8866[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field8893[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field8870[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field8887[var31];
                        int var37 = this.field8887[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field8921[var38] - 1;
                            if (var35 == -1 || this.field8954[var35] != 0) {
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
                                        if (var16 == null) {
                                            this.field8907 = new class682();
                                            var16 = this.field8907.field9614 = class224.method1482((byte) 47, this.field8848);
                                            var15 = this.field8907.field9617 = class224.method1482((byte) 47, this.field8951);
                                            var17 = this.field8907.field9615 = class224.method1482((byte) 47, this.field8936);
                                            var18 = this.field8907.field9620 = class153.method1074(this.field8954, -85);
                                        }
                                        if (var21 == null) {
                                            class682 var44 = var6.field8907 = new class682();
                                            var21 = var44.field9614 = class224.method1482((byte) 47, var11);
                                            var22 = var44.field9617 = class224.method1482((byte) 47, var12);
                                            var19 = var44.field9615 = class224.method1482((byte) 47, var13);
                                            var20 = var44.field9620 = class153.method1074(var14, -97);
                                        }
                                        short var45 = this.field8848[var35];
                                        short var46 = this.field8951[var35];
                                        short var47 = this.field8936[var35];
                                        int var48 = var23[var39];
                                        byte var49 = this.field8954[var35];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var48; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var21[var52] += var45;
                                                var22[var52] += var46;
                                                var19[var52] += var47;
                                                var20[var52] += var49;
                                            }
                                        }
                                        short var53 = var13[var40];
                                        byte var54 = var14[var40];
                                        short var55 = var11[var40];
                                        int var56 = this.field8887[var31];
                                        int var57 = this.field8887[var31 + 1];
                                        short var58 = var12[var40];
                                        for (int var59 = var56; var59 < var57; var59++) {
                                            int var60 = this.field8921[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var16[var60] += var55;
                                                var15[var60] += var58;
                                                var17[var60] += var53;
                                                var18[var60] += var54;
                                            }
                                        }
                                        if (this.field8950 == null && this.field8935 != null) {
                                            this.field8935.field7199 = null;
                                        }
                                        if (this.field8950 != null) {
                                            this.field8950.field7199 = null;
                                        }
                                        if (var6.field8950 == null && var6.field8935 != null) {
                                            var6.field8935.field7199 = null;
                                        }
                                        if (var6.field8950 != null) {
                                            var6.field8950.field7199 = null;
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

    @OriginalMember(owner = "client!qf", name = "fa", descriptor = "(I)V", line = 1423)
    public final void method546(int arg0) {
        field8916++;
        int var2 = class189.field2719[arg0];
        int var3 = class189.field2721[arg0];
        for (int var4 = 0; var4 < this.field8849; var4++) {
            int var7 = this.field8893[var4] * var3 + this.field8870[var4] * var2 >> 14;
            this.field8870[var4] = this.field8870[var4] * var3 - (this.field8893[var4] * var2) >> 14;
            this.field8893[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field8841; var5++) {
            int var6 = this.field8936[var5] * var2 + (this.field8848[var5] * var3) >> 14;
            this.field8936[var5] = (short) (this.field8936[var5] * var3 - (this.field8848[var5] * var2) >> 14);
            this.field8848[var5] = (short) var6;
        }
        if (this.field8950 == null && this.field8935 != null) {
            this.field8935.field7199 = null;
        }
        if (this.field8950 != null) {
            this.field8950.field7199 = null;
        }
        if (this.field8851 != null) {
            this.field8851.field7199 = null;
        }
        this.field8863 = false;
    }

    @OriginalMember(owner = "client!qf", name = "MA", descriptor = "(I)V", line = 1473)
    public final void method522(int arg0) {
        field8874++;
        int var2 = class189.field2719[arg0];
        int var3 = class189.field2721[arg0];
        for (int var4 = 0; var4 < this.field8849; var4++) {
            int var5 = this.field8866[var4] * var3 - (this.field8870[var4] * var2) >> 14;
            this.field8870[var4] = this.field8870[var4] * var3 + this.field8866[var4] * var2 >> 14;
            this.field8866[var4] = var5;
        }
        if (this.field8851 != null) {
            this.field8851.field7199 = null;
        }
        this.field8863 = false;
    }

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "(I)V", line = 1504)
    public final void method540(int arg0) {
        field8908++;
        int var2 = class189.field2719[arg0];
        int var3 = class189.field2721[arg0];
        for (int var4 = 0; var4 < this.field8849; var4++) {
            int var5 = this.field8893[var4] * var3 + this.field8870[var4] * var2 >> 14;
            this.field8870[var4] = this.field8870[var4] * var3 - (this.field8893[var4] * var2) >> 14;
            this.field8893[var4] = var5;
        }
        if (this.field8851 != null) {
            this.field8851.field7199 = null;
        }
        this.field8863 = false;
    }

    @OriginalMember(owner = "client!qf", name = "SA", descriptor = "(I)V", line = 1542)
    public final void method536(int arg0) {
        this.field8943 = arg0;
        field8846++;
        this.field8948 = true;
        if (this.field8907 != null && (this.field8943 & 0x10000) == 0) {
            this.field8936 = this.field8907.field9615;
            this.field8951 = this.field8907.field9617;
            this.field8954 = this.field8907.field9620;
            this.field8848 = this.field8907.field9614;
            this.field8907 = null;
        }
        this.method3522((byte) 75);
    }

    @OriginalMember(owner = "client!qf", name = "na", descriptor = "()I", line = 1565)
    public final int method510() {
        field8915++;
        return this.field8876;
    }

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "(I[IIIIZI[I)V", line = 1576)
    public final void method549(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field8844++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = arg3 << 4;
            int var13 = 0;
            class370.field5296 = 0;
            class443.field6459 = 0;
            class666.field9391 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field8917.length) {
                    int[] var16 = this.field8917[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field8900 == null || (this.field8900[var18] & arg6) != 0) {
                            class443.field6459 += this.field8893[var18];
                            class666.field9391 += this.field8866[var18];
                            class370.field5296 += this.field8870[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class443.field6459 = class443.field6459 / var13 + var11;
                class666.field9391 = class666.field9391 / var13 + var12;
                class257.field3928 = true;
                class370.field5296 = class370.field5296 / var13 + var10;
            } else {
                class443.field6459 = var11;
                class666.field9391 = var12;
                class370.field5296 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
                int var20 = arg7[3] * arg2 - (-(arg7[4] * arg3) - (arg7[5] * arg4) - 8192) >> 14;
                int var21 = arg7[6] * arg2 + 8192 - (-(arg7[7] * arg3) - arg7[8] * arg4) >> 14;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field8917.length) {
                    int[] var27 = this.field8917[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field8900 == null || (this.field8900[var29] & arg6) != 0) {
                            this.field8893[var29] += var23;
                            this.field8866[var29] += var22;
                            this.field8870[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field8917.length) {
                        int[] var110 = this.field8917[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field8900 == null || (arg6 & this.field8900[var112]) != 0) {
                                this.field8893[var112] -= class443.field6459;
                                this.field8866[var112] -= class666.field9391;
                                this.field8870[var112] -= class370.field5296;
                                if (arg4 != 0) {
                                    int var113 = class189.field2719[arg4];
                                    int var114 = class189.field2721[arg4];
                                    int var115 = this.field8893[var112] * var114 + this.field8866[var112] * var113 + 16383 >> 14;
                                    this.field8866[var112] = this.field8866[var112] * var114 + 16383 - (this.field8893[var112] * var113) >> 14;
                                    this.field8893[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class189.field2719[arg2];
                                    int var117 = class189.field2721[arg2];
                                    int var118 = this.field8866[var112] * var117 - (this.field8870[var112] * var116 - 16383) >> 14;
                                    this.field8870[var112] = this.field8866[var112] * var116 + (this.field8870[var112] * var117 + 16383) >> 14;
                                    this.field8866[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class189.field2719[arg3];
                                    int var120 = class189.field2721[arg3];
                                    int var121 = this.field8893[var112] * var120 + this.field8870[var112] * var119 + 16383 >> 14;
                                    this.field8870[var112] = this.field8870[var112] * var120 + 16383 - (this.field8893[var112] * var119) >> 14;
                                    this.field8893[var112] = var121;
                                }
                                this.field8893[var112] += class443.field6459;
                                this.field8866[var112] += class666.field9391;
                                this.field8870[var112] += class370.field5296;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field8917.length) {
                            int[] var93 = this.field8917[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field8900 == null || (arg6 & this.field8900[var95]) != 0) {
                                    int var96 = this.field8887[var95];
                                    int var97 = this.field8887[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field8921[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class189.field2719[arg4];
                                            int var101 = class189.field2721[arg4];
                                            int var102 = this.field8951[var99] * var100 + this.field8848[var99] * var101 + 16383 >> 14;
                                            this.field8951[var99] = (short) (this.field8951[var99] * var101 + 16383 - (this.field8848[var99] * var100) >> 14);
                                            this.field8848[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class189.field2719[arg2];
                                            int var104 = class189.field2721[arg2];
                                            int var105 = this.field8951[var99] * var104 + 16383 - (this.field8936[var99] * var103) >> 14;
                                            this.field8936[var99] = (short) (this.field8936[var99] * var104 + this.field8951[var99] * var103 + 16383 >> 14);
                                            this.field8951[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class189.field2719[arg3];
                                            int var107 = class189.field2721[arg3];
                                            int var108 = this.field8936[var99] * var106 + this.field8848[var99] * var107 + 16383 >> 14;
                                            this.field8936[var99] = (short) (this.field8936[var99] * var107 + 16383 - (this.field8848[var99] * var106) >> 14);
                                            this.field8848[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field8950 == null && this.field8935 != null) {
                        this.field8935.field7199 = null;
                    }
                    if (this.field8950 != null) {
                        this.field8950.field7199 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class257.field3928) {
                    int var36 = arg7[3] * class666.field9391 + (arg7[0] * class443.field6459 + (arg7[6] * class370.field5296) + 8192) >> 14;
                    int var37 = arg7[7] * class370.field5296 + arg7[4] * class666.field9391 + arg7[1] * class443.field6459 + 8192 >> 14;
                    int var38 = var34 + var37;
                    int var39 = arg7[8] * class370.field5296 + arg7[5] * class666.field9391 + arg7[2] * class443.field6459 + 8192 >> 14;
                    int var40 = var33 + var36;
                    int var41 = var35 + var39;
                    class666.field9391 = var38;
                    class443.field6459 = var40;
                    class257.field3928 = false;
                    class370.field5296 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class189.field2721[arg2];
                int var44 = class189.field2719[arg2];
                int var45 = class189.field2721[arg3];
                int var46 = class189.field2719[arg3];
                int var47 = class189.field2721[arg4];
                int var48 = class189.field2719[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[0] = var45 * var47 + (var46 * var50 + 8192) >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[5] = -var44;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[6] = -var46 * var47 - (-(var45 * var50) - 8192) >> 14;
                var42[1] = -var45 * var48 + (var46 * var49) + 8192 >> 14;
                var42[7] = var45 * var49 + var46 * var48 + 8192 >> 14;
                int var51 = var42[2] * -class370.field5296 + (var42[0] * -class443.field6459 + (var42[1] * -class666.field9391)) + 8192 >> 14;
                int var52 = var42[5] * -class370.field5296 + var42[3] * -class443.field6459 + (var42[4] * -class666.field9391 - -8192) >> 14;
                int var53 = var42[8] * -class370.field5296 + var42[7] * -class666.field9391 + var42[6] * -class443.field6459 + 8192 >> 14;
                int var54 = class443.field6459 + var51;
                int var55 = class666.field9391 + var52;
                int var56 = class370.field5296 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += arg7[var87 * 3 + var89] * var42[var58 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 8192 >> 14;
                    }
                }
                int var59 = var42[1] * var34 + var42[0] * var33 - (-(var42[2] * var35) - 8192) >> 14;
                int var60 = var42[3] * var33 + var42[5] * var35 + var42[4] * var34 + 8192 >> 14;
                int var61 = var55 + var60;
                int var62 = var42[6] * var33 + var42[7] * var34 + (var42[8] * var35) + 8192 >> 14;
                int var63 = var54 + var59;
                int var64 = var56 + var62;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[1] * var61 + arg7[0] * var63 + arg7[2] * var64 + 8192 >> 14;
                int var68 = arg7[3] * var63 - (-(arg7[5] * var64) - (arg7[4] * var61) - 8192) >> 14;
                int var69 = var31 + var68;
                int var70 = arg7[6] * var63 + (arg7[8] * var64) + arg7[7] * var61 + 8192 >> 14;
                int var71 = var30 + var67;
                int var72 = var32 + var70;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field8917.length > var74) {
                        int[] var75 = this.field8917[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field8900 == null || (this.field8900[var77] & arg6) != 0) {
                                int var78 = this.field8870[var77] * var65[2] + this.field8893[var77] * var65[0] + this.field8866[var77] * var65[1] + 8192 >> 14;
                                int var79 = this.field8893[var77] * var65[3] + this.field8870[var77] * var65[5] - (-(this.field8866[var77] * var65[4]) + -8192) >> 14;
                                int var80 = this.field8893[var77] * var65[6] + this.field8866[var77] * var65[7] + this.field8870[var77] * var65[8] + 8192 >> 14;
                                int var81 = var69 + var79;
                                int var82 = var71 + var78;
                                this.field8893[var77] = var82;
                                int var83 = var72 + var80;
                                this.field8866[var77] = var81;
                                this.field8870[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field8917.length > var123) {
                        int[] var124 = this.field8917[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field8900 == null || (arg6 & this.field8900[var126]) != 0) {
                                this.field8893[var126] -= class443.field6459;
                                this.field8866[var126] -= class666.field9391;
                                this.field8870[var126] -= class370.field5296;
                                this.field8893[var126] = this.field8893[var126] * arg2 >> 7;
                                this.field8866[var126] = this.field8866[var126] * arg3 >> 7;
                                this.field8870[var126] = this.field8870[var126] * arg4 >> 7;
                                this.field8893[var126] += class443.field6459;
                                this.field8866[var126] += class666.field9391;
                                this.field8870[var126] += class370.field5296;
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
                if (class257.field3928) {
                    int var133 = arg7[3] * class666.field9391 + (arg7[6] * class370.field5296) + arg7[0] * class443.field6459 + 8192 >> 14;
                    int var134 = arg7[4] * class666.field9391 + (arg7[7] * class370.field5296) + arg7[1] * class443.field6459 + 8192 >> 14;
                    int var135 = var131 + var134;
                    int var136 = arg7[2] * class443.field6459 + 8192 - (-(arg7[5] * class666.field9391) - (arg7[8] * class370.field5296)) >> 14;
                    int var137 = var130 + var133;
                    class666.field9391 = var135;
                    int var138 = var132 + var136;
                    class443.field6459 = var137;
                    class257.field3928 = false;
                    class370.field5296 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class443.field6459 * var139 + 8192 >> 14;
                int var143 = -class666.field9391 * var140 + 8192 >> 14;
                int var144 = -class370.field5296 * var141 + 8192 >> 14;
                int var145 = class443.field6459 + var142;
                int var146 = class666.field9391 + var143;
                int var147 = class370.field5296 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var132 * var141 + 8192 >> 14;
                int var152 = var145 + var149;
                int var153 = var146 + var150;
                int var154 = var147 + var151;
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
                int var157 = arg7[0] * var152 + 8192 - (-(arg7[1] * var153) + -(arg7[2] * var154)) >> 14;
                int var158 = arg7[5] * var154 + arg7[4] * var153 + arg7[3] * var152 + 8192 >> 14;
                int var159 = var127 + var157;
                int var160 = var128 + var158;
                int var161 = arg7[7] * var153 + (arg7[6] * var152 - (-(arg7[8] * var154) - 8192)) >> 14;
                int var162 = var129 + var161;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field8917.length > var164) {
                        int[] var165 = this.field8917[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field8900 == null || (this.field8900[var167] & arg6) != 0) {
                                int var168 = this.field8866[var167] * var155[1] + (this.field8893[var167] * var155[0] + this.field8870[var167] * var155[2] + 8192) >> 14;
                                int var169 = this.field8893[var167] * var155[3] + this.field8866[var167] * var155[4] + this.field8870[var167] * var155[5] + 8192 >> 14;
                                int var170 = var159 + var168;
                                int var171 = var160 + var169;
                                int var172 = this.field8893[var167] * var155[6] + this.field8870[var167] * var155[8] + this.field8866[var167] * var155[7] + 8192 >> 14;
                                int var173 = var162 + var172;
                                this.field8893[var167] = var170;
                                this.field8866[var167] = var171;
                                this.field8870[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8927 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field8927.length) {
                        int[] var182 = this.field8927[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field8879 == null || (this.field8879[var184] & arg6) != 0) {
                                int var185 = (this.field8847[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field8847[var184] = (byte) var185;
                                if (this.field8935 != null) {
                                    this.field8935.field7199 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field8888 != null) {
                    for (int var178 = 0; var178 < this.field8895; var178++) {
                        class182 var179 = this.field8888[var178];
                        class284 var180 = this.field8952[var178];
                        var180.field4263 = 255 - (this.field8847[var179.field2570] & 0xFF) << 24 | var180.field4263 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field8927 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field8927.length > var190) {
                        int[] var191 = this.field8927[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field8879 == null || (this.field8879[var193] & arg6) != 0) {
                                int var194 = this.field8947[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg2 + var195 & 0x3F;
                                int var199 = arg3 / 4 + var196;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                int var200 = arg4 + var197;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field8947[var193] = (short) class486.method2826(class486.method2826(var198 << 10, var199 << 7), var200);
                                if (this.field8935 != null) {
                                    this.field8935.field7199 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field8888 != null) {
                    for (int var187 = 0; var187 < this.field8895; var187++) {
                        class182 var188 = this.field8888[var187];
                        class284 var189 = this.field8952[var187];
                        var189.field4263 = class437.field6386[this.field8947[var188.field2570] & 0xFFFF] & 0xFFFFFF | var189.field4263 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field8860 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field8860.length) {
                        int[] var203 = this.field8860[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class284 var205 = this.field8952[var203[var204]];
                            var205.field4262 += arg2;
                            var205.field4254 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8860 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field8860.length > var207) {
                        int[] var208 = this.field8860[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class284 var210 = this.field8952[var208[var209]];
                            var210.field4255 = var210.field4255 * arg3 >> 7;
                            var210.field4259 = var210.field4259 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8860 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field8860.length) {
                    int[] var213 = this.field8860[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class284 var215 = this.field8952[var213[var214]];
                        var215.field4257 = var215.field4257 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZZILqf;ZLqf;)Lda;", line = 2569)
    private final class55 method3524(boolean arg0, boolean arg1, int arg2, class633 arg3, boolean arg4, class633 arg5) {
        arg5.field8926 = this.field8926;
        arg5.field8841 = this.field8841;
        arg5.field8859 = this.field8859;
        arg5.field8941 = this.field8941;
        arg5.field8943 = arg2;
        field8955++;
        if ((arg2 & 0x100) == 0) {
            arg5.field8903 = this.field8903;
        } else {
            arg5.field8903 = true;
        }
        arg5.field8895 = this.field8895;
        arg5.field8876 = this.field8876;
        arg5.field8914 = 0;
        arg5.field8923 = this.field8923;
        arg5.field8960 = this.field8960;
        arg5.field8849 = this.field8849;
        boolean var7 = class332.method2094(this.field8923, (byte) -123, arg2);
        boolean var8 = class36.method423((byte) -55, arg2, this.field8923);
        boolean var9 = class161.method1109(-72, this.field8923, arg2);
        boolean var10 = var9 | var8 | var7;
        if (var10) {
            if (!var7) {
                arg5.field8893 = this.field8893;
            } else if (arg3.field8893 == null || arg3.field8893.length < this.field8941) {
                arg5.field8893 = arg3.field8893 = new int[this.field8941];
            } else {
                arg5.field8893 = arg3.field8893;
            }
            if (!var8) {
                arg5.field8866 = this.field8866;
            } else if (arg3.field8866 == null || this.field8941 > arg3.field8866.length) {
                arg5.field8866 = arg3.field8866 = new int[this.field8941];
            } else {
                arg5.field8866 = arg3.field8866;
            }
            if (!var9) {
                arg5.field8870 = this.field8870;
            } else if (arg3.field8870 == null || arg3.field8870.length < this.field8941) {
                arg5.field8870 = arg3.field8870 = new int[this.field8941];
            } else {
                arg5.field8870 = arg3.field8870;
            }
            for (int var11 = 0; var11 < this.field8941; var11++) {
                if (var7) {
                    arg5.field8893[var11] = this.field8893[var11];
                }
                if (var8) {
                    arg5.field8866[var11] = this.field8866[var11];
                }
                if (var9) {
                    arg5.field8870[var11] = this.field8870[var11];
                }
            }
        } else {
            arg5.field8893 = this.field8893;
            arg5.field8866 = this.field8866;
            arg5.field8870 = this.field8870;
        }
        if (class182.method1225(this.field8923, 116, arg2)) {
            arg5.field8851 = arg3.field8851;
            if (arg4) {
                arg5.field8914 = (byte) (arg5.field8914 | 0x1);
            }
            arg5.field8851.field7194 = this.field8851.field7194;
            arg5.field8851.field7199 = this.field8851.field7199;
        } else if (class98.method799(true, arg2, this.field8923)) {
            arg5.field8851 = this.field8851;
        } else {
            arg5.field8851 = null;
        }
        if (class518.method2960(this.field8923, (byte) -37, arg2)) {
            if (arg3.field8947 == null || arg3.field8947.length < this.field8859) {
                arg5.field8947 = arg3.field8947 = new short[this.field8859];
            } else {
                arg5.field8947 = arg3.field8947;
            }
            for (int var12 = 0; var12 < this.field8859; var12++) {
                arg5.field8947[var12] = this.field8947[var12];
            }
        } else {
            arg5.field8947 = this.field8947;
        }
        if (class695.method3875(arg2, 256, this.field8923)) {
            if (arg3.field8847 == null || this.field8859 > arg3.field8847.length) {
                arg5.field8847 = arg3.field8847 = new byte[this.field8859];
            } else {
                arg5.field8847 = arg3.field8847;
            }
            for (int var13 = 0; var13 < this.field8859; var13++) {
                arg5.field8847[var13] = this.field8847[var13];
            }
        } else {
            arg5.field8847 = this.field8847;
        }
        if (class352.method2161(arg2, arg0, this.field8923)) {
            if (arg4) {
                arg5.field8914 = (byte) (arg5.field8914 | 0x2);
            }
            arg5.field8935 = arg3.field8935;
            arg5.field8935.field7194 = this.field8935.field7194;
            arg5.field8935.field7199 = this.field8935.field7199;
        } else if (class302.method1936(this.field8923, arg2, 0)) {
            arg5.field8935 = this.field8935;
        } else {
            arg5.field8935 = null;
        }
        if (class334.method2106(95, this.field8923, arg2)) {
            if (arg3.field8848 == null || arg3.field8848.length < this.field8841) {
                int var14 = this.field8841;
                arg5.field8936 = arg3.field8936 = new short[var14];
                arg5.field8951 = arg3.field8951 = new short[var14];
                arg5.field8848 = arg3.field8848 = new short[var14];
            } else {
                arg5.field8951 = arg3.field8951;
                arg5.field8848 = arg3.field8848;
                arg5.field8936 = arg3.field8936;
            }
            if (this.field8907 == null) {
                for (int var18 = 0; var18 < this.field8841; var18++) {
                    arg5.field8848[var18] = this.field8848[var18];
                    arg5.field8951[var18] = this.field8951[var18];
                    arg5.field8936[var18] = this.field8936[var18];
                }
            } else {
                if (arg3.field8907 == null) {
                    arg3.field8907 = new class682();
                }
                class682 var15 = arg5.field8907 = arg3.field8907;
                if (var15.field9614 == null || this.field8841 > var15.field9614.length) {
                    int var16 = this.field8841;
                    var15.field9617 = new short[var16];
                    var15.field9614 = new short[var16];
                    var15.field9620 = new byte[var16];
                    var15.field9615 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field8841; var17++) {
                    arg5.field8848[var17] = this.field8848[var17];
                    arg5.field8951[var17] = this.field8951[var17];
                    arg5.field8936[var17] = this.field8936[var17];
                    var15.field9614[var17] = this.field8907.field9614[var17];
                    var15.field9617[var17] = this.field8907.field9617[var17];
                    var15.field9615[var17] = this.field8907.field9615[var17];
                    var15.field9620[var17] = this.field8907.field9620[var17];
                }
            }
            arg5.field8954 = this.field8954;
        } else {
            arg5.field8907 = this.field8907;
            arg5.field8954 = this.field8954;
            arg5.field8848 = this.field8848;
            arg5.field8951 = this.field8951;
            arg5.field8936 = this.field8936;
        }
        if (class612.method3418((byte) -127, arg2, this.field8923)) {
            arg5.field8950 = arg3.field8950;
            if (arg4) {
                arg5.field8914 = (byte) (arg5.field8914 | 0x4);
            }
            arg5.field8950.field7199 = this.field8950.field7199;
            arg5.field8950.field7194 = this.field8950.field7194;
        } else if (class30.method345(this.field8923, arg2, (byte) -21)) {
            arg5.field8950 = this.field8950;
        } else {
            arg5.field8950 = null;
        }
        if (class433.method2578(arg2, (byte) 126, this.field8923)) {
            if (arg3.field8843 == null || this.field8859 > arg3.field8843.length) {
                int var19 = this.field8841;
                arg5.field8885 = arg3.field8885 = new float[var19];
                arg5.field8843 = arg3.field8843 = new float[var19];
            } else {
                arg5.field8843 = arg3.field8843;
                arg5.field8885 = arg3.field8885;
            }
            for (int var20 = 0; var20 < this.field8841; var20++) {
                arg5.field8843[var20] = this.field8843[var20];
                arg5.field8885[var20] = this.field8885[var20];
            }
        } else {
            arg5.field8843 = this.field8843;
            arg5.field8885 = this.field8885;
        }
        if (class522.method2981(arg2, (byte) -107, this.field8923)) {
            if (arg4) {
                arg5.field8914 = (byte) (arg5.field8914 | 0x8);
            }
            arg5.field8853 = arg3.field8853;
            arg5.field8853.field7194 = this.field8853.field7194;
            arg5.field8853.field7199 = this.field8853.field7199;
        } else if (class588.method3330(arg2, this.field8923, 22227)) {
            arg5.field8853 = this.field8853;
        } else {
            arg5.field8853 = null;
        }
        if (class230.method1588(this.field8923, (byte) 4, arg2)) {
            if (arg3.field8872 == null || arg3.field8872.length < this.field8859) {
                int var21 = this.field8859;
                arg5.field8872 = arg3.field8872 = new short[var21];
                arg5.field8933 = arg3.field8933 = new short[var21];
                arg5.field8946 = arg3.field8946 = new short[var21];
            } else {
                arg5.field8946 = arg3.field8946;
                arg5.field8933 = arg3.field8933;
                arg5.field8872 = arg3.field8872;
            }
            for (int var22 = 0; var22 < this.field8859; var22++) {
                arg5.field8872[var22] = this.field8872[var22];
                arg5.field8933[var22] = this.field8933[var22];
                arg5.field8946[var22] = this.field8946[var22];
            }
        } else {
            arg5.field8933 = this.field8933;
            arg5.field8872 = this.field8872;
            arg5.field8946 = this.field8946;
        }
        if (class349.method2153(this.field8923, arg2, -274)) {
            arg5.field8929 = arg3.field8929;
            if (arg4) {
                arg5.field8914 = (byte) (arg5.field8914 | 0x10);
            }
            arg5.field8929.field1793 = this.field8929.field1793;
        } else if (class49.method550(this.field8923, (byte) -36, arg2)) {
            arg5.field8929 = this.field8929;
        } else {
            arg5.field8929 = null;
        }
        if (class180.method1217(arg2, this.field8923, (byte) -90)) {
            if (arg3.field8940 == null || this.field8859 > arg3.field8940.length) {
                int var23 = this.field8859;
                arg5.field8940 = arg3.field8940 = new short[var23];
            } else {
                arg5.field8940 = arg3.field8940;
            }
            for (int var24 = 0; var24 < this.field8859; var24++) {
                arg5.field8940[var24] = this.field8940[var24];
            }
        } else {
            arg5.field8940 = this.field8940;
        }
        if (!class190.method1276(this.field8923, (byte) 32, arg2)) {
            arg5.field8952 = this.field8952;
        } else if (arg3.field8952 == null || this.field8895 > arg3.field8952.length) {
            int var26 = this.field8895;
            arg5.field8952 = arg3.field8952 = new class284[var26];
            for (int var27 = 0; var27 < this.field8895; var27++) {
                arg5.field8952[var27] = this.field8952[var27].method1832(128);
            }
        } else {
            arg5.field8952 = arg3.field8952;
            for (int var25 = 0; var25 < this.field8895; var25++) {
                arg5.field8952[var25].method1833(this.field8952[var25], 3);
            }
        }
        arg5.field8888 = this.field8888;
        arg5.field8887 = this.field8887;
        arg5.field8897 = this.field8897;
        if (this.field8863) {
            arg5.field8875 = this.field8875;
            arg5.field8877 = this.field8877;
            arg5.field8949 = this.field8949;
            arg5.field8863 = true;
            arg5.field8856 = this.field8856;
            arg5.field8882 = this.field8882;
            arg5.field8904 = this.field8904;
            arg5.field8871 = this.field8871;
            arg5.field8931 = this.field8931;
        } else {
            arg5.field8863 = false;
        }
        arg5.field8918 = this.field8918;
        arg5.field8900 = this.field8900;
        arg5.field8899 = this.field8899;
        arg5.field8860 = this.field8860;
        arg5.field8921 = this.field8921;
        arg5.field8927 = this.field8927;
        arg5.field8879 = this.field8879;
        arg5.field8917 = this.field8917;
        return arg5;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILtv;)V", line = 3033)
    private final void method3525(int arg0, class520 arg1) {
        if (this.field8841 > this.field8864.field3556.length) {
            this.field8864.field3557 = new int[this.field8841];
            this.field8864.field3556 = new int[this.field8841];
        }
        field8909++;
        int[] var3 = this.field8864.field3556;
        int[] var4 = this.field8864.field3557;
        for (int var5 = 0; var5 < this.field8849; var5++) {
            int var16 = (this.field8893[var5] - (this.field8866[var5] * this.field8864.field3516 >> 8) >> this.field8864.field3404) - arg1.field7327;
            int var17 = (this.field8870[var5] - (this.field8866[var5] * this.field8864.field3518 >> 8) >> this.field8864.field3404) - arg1.field7331;
            int var18 = this.field8887[var5];
            int var19 = this.field8887[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field8921[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        int var6 = 0;
        if (arg0 != -1525) {
            this.method536(-50);
        }
        while (var6 < this.field8926) {
            if (this.field8847 == null || this.field8847[var6] <= 128) {
                short var7 = this.field8872[var6];
                short var8 = this.field8933[var6];
                short var9 = this.field8946[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var14 - var15) * (var10 - var11) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg1.method2971(var12, var10, var11, var15, var13, var14, 25223);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)V", line = 3120)
    public static void method3526(byte arg0) {
        int var1 = 41 / ((7 - arg0) / 59);
        field8942 = null;
        field8925 = null;
        field8945 = null;
    }

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "()I", line = 3131)
    public final int method507() {
        field8890++;
        if (!this.field8863) {
            this.method3529(-16);
        }
        return this.field8949;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BZ)V", line = 3142)
    private final void method3527(byte arg0, boolean arg1) {
        field8894++;
        boolean var3 = this.field8935 != null && this.field8935.field7199 == null;
        boolean var4 = this.field8950 != null && this.field8950.field7199 == null;
        boolean var5 = this.field8851 != null && this.field8851.field7199 == null;
        boolean var6 = this.field8853 != null && this.field8853.field7199 == null;
        if (arg1) {
            var4 &= (this.field8914 & 0x4) != 0;
            var3 &= (this.field8914 & 0x2) != 0;
            var5 &= (this.field8914 & 0x1) != 0;
            var6 &= (this.field8914 & 0x8) != 0;
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
        if (this.field8864.field3510.field9796.length >= this.field8841 * var7) {
            this.field8864.field3510.field9761 = 0;
        } else {
            this.field8864.field3510 = new class231((this.field8841 + 100) * var7);
        }
        class231 var12 = this.field8864.field3510;
        if (var5) {
            if (this.field8864.field3514) {
                for (int var21 = 0; var21 < this.field8849; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field8893[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field8866[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field8870[var21]);
                    int var25 = this.field8887[var21];
                    int var26 = this.field8887[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field8921[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field9761 = var7 * var28;
                        var12.method3868(var22, -318419336);
                        var12.method3868(var23, -318419336);
                        var12.method3868(var24, -318419336);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field8849; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field8893[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field8866[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field8870[var13]);
                    int var17 = this.field8887[var13];
                    int var18 = this.field8887[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field8921[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field9761 = var7 * var20;
                        var12.method3821(var14, (byte) 36);
                        var12.method3821(var15, (byte) 36);
                        var12.method3821(var16, (byte) 36);
                    }
                }
            }
        }
        if (var3) {
            if (this.field8950 == null) {
                short[] var29;
                short[] var30;
                short[] var31;
                byte[] var32;
                if (this.field8907 == null) {
                    var31 = this.field8936;
                    var30 = this.field8951;
                    var29 = this.field8848;
                    var32 = this.field8954;
                } else {
                    var29 = this.field8907.field9614;
                    var30 = this.field8907.field9617;
                    var31 = this.field8907.field9615;
                    var32 = this.field8907.field9620;
                }
                float var33 = this.field8864.field3517[0];
                float var34 = this.field8864.field3517[1];
                float var35 = this.field8864.field3517[2];
                float var36 = this.field8864.field3538;
                float var37 = this.field8864.field3455 * 768.0F / (float) this.field8876;
                float var38 = this.field8864.field3466 * 768.0F / (float) this.field8876;
                for (int var39 = 0; var39 < this.field8859; var39++) {
                    int var40 = this.method3523(this.field8847[var39], this.field8960, this.field8947[var39], this.field8940[var39], 126);
                    float var41 = (float) (var40 >>> 24) * this.field8864.field3451;
                    short var42 = this.field8872[var39];
                    float var43 = (float) (var40 >> 16 & 0xFF) * this.field8864.field3497;
                    float var44 = (float) ((var40 & 0xFFD9) >> 8) * this.field8864.field3503;
                    short var45 = (short) var32[var42];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var31[var42] * var35 + (float) var29[var42] * var33 + (float) var30[var42] * var34) * 0.0026041667F;
                    } else {
                        var46 = ((float) var31[var42] * var35 + (float) var29[var42] * var33 + (float) var30[var42] * var34) / (float) (var45 * 256);
                    }
                    float var47 = ((var46 < 0.0F) ? var38 : var37) * var46 + var36;
                    int var48 = (int) (var41 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var43 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var50 = (int) (var44 * var47);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.field9761 = var7 * var42 + var9;
                    var12.method3853((byte) 51, var48);
                    var12.method3853((byte) 51, var49);
                    var12.method3853((byte) 51, var50);
                    var12.method3853((byte) 51, 255 - (this.field8847[var39] & 0xFF));
                    short var51 = this.field8933[var39];
                    short var52 = (short) var32[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var33 + (float) var30[var51] * var34) * 0.0026041667F;
                    } else {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var33 + (float) var30[var51] * var34) / (float) (var52 * 256);
                    }
                    float var54 = (var53 < 0.0F ? var38 : var37) * var53 + var36;
                    int var55 = (int) (var41 * var54);
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
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.field9761 = var7 * var51 + var9;
                    var12.method3853((byte) 51, var55);
                    var12.method3853((byte) 51, var56);
                    var12.method3853((byte) 51, var57);
                    var12.method3853((byte) 51, 255 - (this.field8847[var39] & 0xFF));
                    short var58 = this.field8946[var39];
                    short var59 = (short) var32[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var33 + (float) var30[var58] * var34) * 0.0026041667F;
                    } else {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var33 + (float) var30[var58] * var34) / (float) (var59 * 256);
                    }
                    float var61 = var36 + (var60 < 0.0F ? var38 : var37) * var60;
                    int var62 = (int) (var41 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var63 = (int) (var43 * var61);
                    int var64 = (int) (var44 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.field9761 = var7 * var58 + var9;
                    var12.method3853((byte) 51, var62);
                    var12.method3853((byte) 51, var63);
                    var12.method3853((byte) 51, var64);
                    var12.method3853((byte) 51, 255 - (this.field8847[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field8859; var65++) {
                    int var66 = this.method3523(this.field8847[var65], this.field8960, this.field8947[var65], this.field8940[var65], 126);
                    var12.field9761 = var9 + (this.field8872[var65] * var7);
                    var12.method3868(var66, -318419336);
                    var12.field9761 = this.field8933[var65] * var7 + var9;
                    var12.method3868(var66, -318419336);
                    var12.field9761 = this.field8946[var65] * var7 + var9;
                    var12.method3868(var66, -318419336);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            short[] var69;
            byte[] var70;
            if (this.field8907 == null) {
                var67 = this.field8951;
                var68 = this.field8936;
                var69 = this.field8848;
                var70 = this.field8954;
            } else {
                var70 = this.field8907.field9620;
                var67 = this.field8907.field9617;
                var68 = this.field8907.field9615;
                var69 = this.field8907.field9614;
            }
            float var71 = 3.0F / (float) this.field8876;
            float var72 = 3.0F / (float) (this.field8876 + (this.field8876 / 2));
            var12.field9761 = var10;
            if (this.field8864.field3514) {
                for (int var73 = 0; var73 < this.field8841; var73++) {
                    int var74 = var70[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1592(false, (float) var69[var73] * var72);
                        var12.method1592(false, (float) var67[var73] * var72);
                        var12.method1592(false, (float) var68[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1592(false, (float) var69[var73] * var75);
                        var12.method1592(false, (float) var67[var73] * var75);
                        var12.method1592(false, (float) var68[var73] * var75);
                    }
                    var12.field9761 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field8841; var76++) {
                    int var77 = var70[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1593((byte) 58, (float) var69[var76] * var72);
                        var12.method1593((byte) 120, (float) var67[var76] * var72);
                        var12.method1593((byte) 95, (float) var68[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1593((byte) 98, (float) var69[var76] * var78);
                        var12.method1593((byte) 96, (float) var67[var76] * var78);
                        var12.method1593((byte) 33, (float) var68[var76] * var78);
                    }
                    var12.field9761 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field9761 = var11;
            if (this.field8864.field3514) {
                for (int var80 = 0; var80 < this.field8841; var80++) {
                    var12.method1592(false, this.field8843[var80]);
                    var12.method1592(false, this.field8885[var80]);
                    var12.field9761 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field8841; var79++) {
                    var12.method1593((byte) 111, this.field8843[var79]);
                    var12.method1593((byte) 93, this.field8885[var79]);
                    var12.field9761 += var7 - 8;
                }
            }
        }
        int var81 = -35 % ((arg0 + 49) / 45);
        var12.field9761 = this.field8841 * var7;
        class283 var82;
        if (arg1) {
            if (this.field8878 == null) {
                this.field8878 = this.field8864.method1573(true, var12.field9761, var7, false, var12.field9796);
            } else {
                this.field8878.method1143((byte) -128, var12.field9761, var7, var12.field9796);
            }
            var82 = this.field8878;
            this.field8914 = 0;
        } else {
            var82 = this.field8864.method1573(false, var12.field9761, var7, false, var12.field9796);
            this.field8948 = true;
        }
        if (var5) {
            this.field8851.field7194 = var8;
            this.field8851.field7199 = var82;
        }
        if (var6) {
            this.field8853.field7194 = var11;
            this.field8853.field7199 = var82;
        }
        if (var3) {
            this.field8935.field7199 = var82;
            this.field8935.field7194 = var9;
        }
        if (var4) {
            this.field8950.field7194 = var10;
            this.field8950.field7199 = var82;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lq;Lkd;I)V", line = 3659)
    public final void method513(class391 arg0, class253 arg1, int arg2) {
        field8922++;
        if (this.field8841 == 0) {
            return;
        }
        class696 var4 = this.field8864.field3434;
        if (!this.field8863) {
            this.method3529(-112);
        }
        class696 var5 = (class696) arg0;
        class347.field5042 = var4.field9832 * var5.field9849 + var4.field9849 * var5.field9837 + var4.field9829 * var5.field9847;
        class203.field2876 = var4.field9832 * var5.field9841 + var4.field9849 * var5.field9824 + var4.field9829 * var5.field9840 + var4.field9841;
        float var6 = (float) this.field8877 * class347.field5042 + class203.field2876;
        float var7 = (float) this.field8904 * class347.field5042 + class203.field2876;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = var7 - (float) this.field8949;
            var9 = (float) this.field8949 + var6;
        } else {
            var8 = var6 - (float) this.field8949;
            var9 = (float) this.field8949 + var7;
        }
        if ((var8 >= this.field8864.field3477) || ((float) this.field8864.field3536 >= var9)) {
            return;
        }
        class704.field9915 = var4.field9852 * var5.field9841 + var4.field9847 * var5.field9824 + var4.field9838 * var5.field9840 + var4.field9840;
        class547.field7689 = var4.field9852 * var5.field9849 + var4.field9847 * var5.field9837 + var4.field9838 * var5.field9847;
        float var10 = (float) this.field8877 * class547.field7689 + class704.field9915;
        float var11 = (float) this.field8904 * class547.field7689 + class704.field9915;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var13 = (var11 - (float) this.field8949) * (float) this.field8864.field3452;
            var12 = ((float) this.field8949 + var10) * (float) this.field8864.field3452;
        } else {
            var12 = ((float) this.field8949 + var11) * (float) this.field8864.field3452;
            var13 = (var10 - (float) this.field8949) * (float) this.field8864.field3452;
        }
        if ((this.field8864.field3480 <= var13 / var9) || (this.field8864.field3501 >= var12 / var9)) {
            return;
        }
        class363.field5185 = var4.field9856 * var5.field9849 + var4.field9837 * var5.field9837 + var4.field9834 * var5.field9847;
        class405.field5936 = var4.field9856 * var5.field9841 + var4.field9837 * var5.field9824 + var4.field9834 * var5.field9840 + var4.field9824;
        float var14 = (float) this.field8877 * class363.field5185 + class405.field5936;
        float var15 = (float) this.field8904 * class363.field5185 + class405.field5936;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = ((float) (-this.field8949) + var15) * (float) this.field8864.field3507;
            var17 = ((float) this.field8949 + var14) * (float) this.field8864.field3507;
        } else {
            var16 = ((float) (-this.field8949) + var14) * (float) this.field8864.field3507;
            var17 = ((float) this.field8949 + var15) * (float) this.field8864.field3507;
        }
        if ((var16 / var9 >= this.field8864.field3454) || (this.field8864.field3519 >= var17 / var9)) {
            return;
        }
        if (arg1 != null || this.field8888 != null) {
            class140.field2061 = var4.field9852 * var5.field9829 + var4.field9847 * var5.field9834 + var4.field9838 * var5.field9838;
            class43.field699 = var4.field9856 * var5.field9832 + var4.field9837 * var5.field9856 + var4.field9834 * var5.field9852;
            class499.field7077 = var4.field9856 * var5.field9829 + var4.field9837 * var5.field9834 + var4.field9834 * var5.field9838;
            class619.field8646 = var4.field9832 * var5.field9832 + var4.field9849 * var5.field9856 + var4.field9829 * var5.field9852;
            class432.field6322 = var4.field9832 * var5.field9829 + var4.field9849 * var5.field9834 + var4.field9829 * var5.field9838;
            class393.field5832 = var4.field9852 * var5.field9832 + var4.field9847 * var5.field9856 + var4.field9838 * var5.field9852;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field8931 + this.field8871 >> 1;
            int var21 = this.field8882 + this.field8856 >> 1;
            int var22 = (int) ((float) var21 * class393.field5832 + (float) this.field8877 * class547.field7689 + (float) var20 * class140.field2061 + class704.field9915);
            int var23 = (int) ((float) var21 * class43.field699 + (float) this.field8877 * class363.field5185 + (float) var20 * class499.field7077 + class405.field5936);
            int var24 = (int) ((float) var21 * class619.field8646 + (float) this.field8877 * class347.field5042 + (float) var20 * class432.field6322 + class203.field2876);
            if (this.field8864.field3536 > var24) {
                var18 = true;
            } else {
                arg1.field3893 = this.field8864.field3507 * var23 / var24 + this.field8864.field3456;
                arg1.field3894 = this.field8864.field3512 + (this.field8864.field3452 * var22 / var24);
            }
            int var25 = (int) ((float) var21 * class393.field5832 + (float) this.field8904 * class547.field7689 + (float) var20 * class140.field2061 + class704.field9915);
            int var26 = (int) ((float) var21 * class43.field699 + (float) this.field8904 * class363.field5185 + (float) var20 * class499.field7077 + class405.field5936);
            int var27 = (int) ((float) var21 * class619.field8646 + (float) this.field8904 * class347.field5042 + (float) var20 * class432.field6322 + class203.field2876);
            if (var27 < this.field8864.field3536) {
                var18 = true;
            } else {
                arg1.field3895 = this.field8864.field3507 * var26 / var27 + this.field8864.field3456;
                arg1.field3897 = this.field8864.field3452 * var25 / var27 + this.field8864.field3512;
            }
            if (var18) {
                if (var24 < this.field8864.field3536 && var27 < this.field8864.field3536) {
                    var19 = false;
                } else if (var24 < this.field8864.field3536) {
                    int var31 = (var27 - this.field8864.field3536 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    arg1.field3894 = this.field8864.field3452 * var32 / this.field8864.field3536 + this.field8864.field3512;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field3893 = this.field8864.field3507 * var33 / this.field8864.field3536 + this.field8864.field3456;
                } else if (var27 < this.field8864.field3536) {
                    int var28 = (var24 - this.field8864.field3536 << 16) / (var24 - var27);
                    int var29 = var22 + ((var22 - var25) * var28 >> 16);
                    int var30 = var23 + ((var23 - var26) * var28 >> 16);
                    arg1.field3894 = this.field8864.field3452 * var29 / this.field8864.field3536 + this.field8864.field3512;
                    arg1.field3893 = this.field8864.field3507 * var30 / this.field8864.field3536 + this.field8864.field3456;
                }
            }
            if (var19) {
                arg1.field3896 = true;
                if (var24 <= var27) {
                    arg1.field3892 = this.field8864.field3512 + ((var25 + this.field8949) * this.field8864.field3452 / var27) - arg1.field3897;
                } else {
                    arg1.field3892 = (this.field8949 + var22) * this.field8864.field3452 / var24 + this.field8864.field3512 - arg1.field3894;
                }
            }
        }
        this.field8864.method1561(1);
        this.field8864.method1509(var5, 1);
        this.method3528((byte) 86);
        this.field8864.method1504(8448);
        this.method3536(true);
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)V", line = 3862)
    private final void method3528(byte arg0) {
        field8896++;
        if (this.field8926 == 0) {
            return;
        }
        if (this.field8914 != 0) {
            this.method3527((byte) 92, true);
        }
        this.method3527((byte) 97, false);
        if (this.field8929 != null) {
            if (this.field8929.field1793 == null) {
                this.method3532((this.field8914 & 0x10) != 0, 125);
            }
            if (this.field8929.field1793 != null) {
                this.field8864.method1493(this.field8950 != null, -58);
                this.field8864.method1562((byte) -12, this.field8853, this.field8950, this.field8935, this.field8851);
                int var2 = this.field8899.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field8899[var3];
                    int var5 = this.field8899[var3 + 1];
                    int var6 = this.field8940[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field8864.method1496((byte) 119, this.field8950 != null, var6);
                    this.field8864.method1522((byte) 31, var4 * 3, 4, this.field8929.field1793, (var5 - var4) * 3);
                }
            }
        }
        this.method3522((byte) 62);
        if (arg0 != 86) {
            this.field8871 = 1;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 3918)
    private final void method3529(int arg0) {
        field8869++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        if (arg0 > -3) {
            this.method540(36);
        }
        for (int var10 = 0; var10 < this.field8849; var10++) {
            int var11 = this.field8893[var10];
            int var12 = this.field8866[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            int var13 = this.field8870[var10];
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + (var13 * var13);
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var13 * var13 + (var12 * var12);
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field8877 = (short) var3;
        this.field8871 = (short) var5;
        this.field8882 = (short) var7;
        this.field8856 = (short) var4;
        this.field8931 = (short) var2;
        this.field8904 = (short) var6;
        this.field8949 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field8875 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field8863 = true;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "()Z", line = 4000)
    public final boolean method509() {
        field8845++;
        if (this.field8940 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field8940.length; var1++) {
            if (this.field8940[var1] != -1 && !this.field8864.field2384.method1383(this.field8940[var1], -87)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lok;)V", line = 5753)
    public class633(class228 arg0) {
        this.field8864 = arg0;
        this.field8851 = new class512(null, 5126, 3, 0);
        this.field8853 = new class512(null, 5126, 2, 0);
        this.field8950 = new class512(null, 5126, 3, 0);
        this.field8935 = new class512(null, 5121, 4, 0);
        this.field8929 = new class118();
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lok;Llm;IIII)V", line = 5768)
    public class633(class228 arg0, class461 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8923 = arg5;
        this.field8943 = arg2;
        this.field8864 = arg0;
        if (class98.method799(true, arg2, arg5)) {
            this.field8851 = new class512(null, 5126, 3, 0);
        }
        if (class588.method3330(arg2, arg5, 22227)) {
            this.field8853 = new class512(null, 5126, 2, 0);
        }
        if (class30.method345(arg5, arg2, (byte) -21)) {
            this.field8950 = new class512(null, 5126, 3, 0);
        }
        if (class302.method1936(arg5, arg2, 0)) {
            this.field8935 = new class512(null, 5121, 4, 0);
        }
        if (class49.method550(arg5, (byte) -11, arg2)) {
            this.field8929 = new class118();
        }
        class209 var7 = arg0.field2384;
        this.field8887 = new int[arg1.field6592 + 1];
        int[] var8 = new int[arg1.field6632];
        for (int var9 = 0; var9 < arg1.field6632; var9++) {
            if ((arg1.field6593 == null || arg1.field6593[var9] != 2) && (arg1.field6620 == null || arg1.field6620[var9] == -1 || !var7.method1386(arg1.field6620[var9] & 0xFFFF, -6514).field2299)) {
                var8[this.field8859++] = var9;
                this.field8887[arg1.field6627[var9]]++;
                this.field8887[arg1.field6639[var9]]++;
                this.field8887[arg1.field6596[var9]]++;
            }
        }
        this.field8926 = this.field8859;
        long[] var10 = new long[this.field8859];
        boolean var11 = (this.field8943 & 0x100) != 0;
        label499: for (int var12 = 0; var12 < this.field8859; var12++) {
            int var180 = var8[var12];
            class159 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field6613 != null) {
                for (int var186 = 0; var186 < arg1.field6613.length; var186++) {
                    class692 var187 = arg1.field6613[var186];
                    if (var187.field9732 == var180) {
                        class298 var188 = class252.method1687((byte) -113, var187.field9726);
                        if (var188.field4449) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field8926--;
                            continue label499;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field6620 != null) {
                var189 = arg1.field6620[var180];
                if (var189 != -1) {
                    var181 = var7.method1386(var189 & 0xFFFF, -6514);
                    var184 = var181.field2300;
                    var185 = var181.field2291;
                }
            }
            boolean var190 = arg1.field6607 != null && arg1.field6607[var180] != 0 || var181 != null && var181.field2295 | !var181.field2289;
            if ((var11 || var190) && arg1.field6601 != null) {
                var182 += arg1.field6601[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = (var184 & 0xFF << 8) + var182;
            int var192 = ((var189 & 0xFFFF) << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + (long) var194;
            this.field8903 |= var190;
        }
        class238.method1622(var8, -25697, var10);
        this.field8900 = arg1.field6611;
        this.field8870 = arg1.field6608;
        this.field8893 = arg1.field6617;
        this.field8941 = arg1.field6598;
        this.field8849 = arg1.field6592;
        this.field8866 = arg1.field6621;
        class2[] var13 = new class2[this.field8849];
        this.field8897 = arg1.field6616;
        this.field8918 = arg1.field6634;
        if (arg1.field6613 != null) {
            this.field8895 = arg1.field6613.length;
            this.field8888 = new class182[this.field8895];
            this.field8952 = new class284[this.field8895];
            for (int var14 = 0; var14 < this.field8895; var14++) {
                class692 var15 = arg1.field6613[var14];
                class298 var16 = class252.method1687((byte) -123, var15.field9726);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field8859; var18++) {
                    if (var8[var18] == var15.field9732) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class437.field6386[arg1.field6614[var15.field9732] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field6607 == null ? 0 : arg1.field6607[var15.field9732]) << 24;
                this.field8888[var14] = new class182(var17, arg1.field6627[var15.field9732], arg1.field6639[var15.field9732], arg1.field6596[var15.field9732], var16.field4457, var16.field4454, var16.field4458, var16.field4459, var16.field4450, var16.field4449, var16.field4451, var15.field9730);
                this.field8952[var14] = new class284(var20);
            }
        }
        int var21 = this.field8859 * 3;
        this.field8936 = new short[var21];
        this.field8960 = (short) arg3;
        this.field8843 = new float[var21];
        this.field8954 = new byte[var21];
        this.field8872 = new short[this.field8859];
        this.field8951 = new short[var21];
        this.field8940 = new short[this.field8859];
        this.field8946 = new short[this.field8859];
        this.field8947 = new short[this.field8859];
        this.field8921 = new short[var21];
        this.field8848 = new short[var21];
        if (arg1.field6629 != null) {
            this.field8879 = new short[this.field8859];
        }
        class454.field6518 = new long[var21];
        this.field8847 = new byte[this.field8859];
        this.field8933 = new short[this.field8859];
        this.field8885 = new float[var21];
        this.field8876 = (short) arg4;
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field6592; var23++) {
            int var179 = this.field8887[var23];
            this.field8887[var23] = var22;
            var13[var23] = new class2();
            var22 += var179;
        }
        this.field8887[arg1.field6592] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field6594 != null) {
            int var28 = arg1.field6600;
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
            var27 = new float[var28][];
            var24 = new int[var28];
            var26 = new int[var28];
            var25 = new int[var28];
            for (int var36 = 0; var36 < this.field8859; var36++) {
                int var43 = var8[var36];
                if (arg1.field6594[var43] != -1) {
                    int var44 = arg1.field6594[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field6627[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field6639[var43];
                        } else {
                            var46 = arg1.field6596[var43];
                        }
                        int var47 = arg1.field6617[var46];
                        int var48 = arg1.field6621[var46];
                        int var49 = arg1.field6608[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
                            var32[var44] = var48;
                        }
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field6618[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field6595[var37];
                        if (var39 == 0) {
                            var41 = 1.0F;
                            var40 = 1.0F;
                        } else if (var39 > 0) {
                            var40 = 1.0F;
                            var41 = (float) var39 / 1024.0F;
                        } else {
                            var40 = (float) (-var39) / 1024.0F;
                            var41 = 1.0F;
                        }
                        var42 = 64.0F / (float) arg1.field6606[var37];
                    } else if (var38 == 2) {
                        var42 = 64.0F / (float) arg1.field6606[var37];
                        var41 = 64.0F / (float) arg1.field6643[var37];
                        var40 = 64.0F / (float) arg1.field6595[var37];
                    } else {
                        var42 = (float) arg1.field6606[var37] / 1024.0F;
                        var40 = (float) arg1.field6595[var37] / 1024.0F;
                        var41 = (float) arg1.field6643[var37] / 1024.0F;
                    }
                    var27[var37] = class685.method3783(arg1.field6636[var37], var41, class689.method3797(255, arg1.field6599[var37]), var40, true, arg1.field6633[var37], var42, arg1.field6603[var37]);
                }
            }
        }
        class349[] var50 = new class349[arg1.field6632];
        for (int var51 = 0; var51 < arg1.field6632; var51++) {
            short var158 = arg1.field6627[var51];
            short var159 = arg1.field6639[var51];
            short var160 = arg1.field6596[var51];
            int var161 = this.field8893[var159] - this.field8893[var158];
            int var162 = this.field8866[var159] - this.field8866[var158];
            int var163 = this.field8870[var159] - this.field8870[var158];
            int var164 = this.field8893[var160] - this.field8893[var158];
            int var165 = this.field8866[var160] - this.field8866[var158];
            int var166 = this.field8870[var160] - this.field8870[var158];
            int var167 = var162 * var166 - var163 * var165;
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var168 >>= 0x1;
                var169 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + var167 * var167 + var168 * var168));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var168 * 256 / var170;
            byte var174 = arg1.field6593 == null ? 0 : arg1.field6593[var51];
            if (var174 == 0) {
                class2 var176 = var13[var158];
                var176.field10 += var171;
                var176.field15++;
                var176.field12 += var172;
                var176.field14 += var173;
                class2 var177 = var13[var159];
                var177.field10 += var171;
                var177.field14 += var173;
                var177.field15++;
                var177.field12 += var172;
                class2 var178 = var13[var160];
                var178.field15++;
                var178.field10 += var171;
                var178.field14 += var173;
                var178.field12 += var172;
            } else if (var174 == 1) {
                class349 var175 = var50[var51] = new class349();
                var175.field5061 = var173;
                var175.field5057 = var171;
                var175.field5058 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field8859; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field6614[var68] & 0xFFFF;
            short var70;
            if (arg1.field6620 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field6620[var68];
            }
            int var71;
            if (arg1.field6594 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field6594[var68];
            }
            int var72;
            if (arg1.field6607 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field6607[var68] & 0xFF;
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
                    var78 = 0.0F;
                    var77 = 0.0F;
                    var80 = 2;
                    var74 = 1.0F;
                    var75 = 1.0F;
                    var79 = 1;
                    var73 = 0.0F;
                    var76 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field6618[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field6627[var68];
                        short var112 = arg1.field6639[var68];
                        short var113 = arg1.field6596[var68];
                        short var114 = arg1.field6603[var71];
                        short var115 = arg1.field6636[var71];
                        short var116 = arg1.field6633[var71];
                        float var117 = (float) arg1.field6617[var114];
                        float var118 = (float) arg1.field6621[var114];
                        float var119 = (float) arg1.field6608[var114];
                        float var120 = (float) arg1.field6617[var115] - var117;
                        float var121 = (float) arg1.field6621[var115] - var118;
                        float var122 = (float) arg1.field6608[var115] - var119;
                        float var123 = (float) arg1.field6617[var116] - var117;
                        float var124 = (float) arg1.field6621[var116] - var118;
                        float var125 = (float) arg1.field6608[var116] - var119;
                        float var126 = (float) arg1.field6617[var111] - var117;
                        float var127 = (float) arg1.field6621[var111] - var118;
                        float var128 = (float) arg1.field6608[var111] - var119;
                        float var129 = (float) arg1.field6617[var112] - var117;
                        float var130 = (float) arg1.field6621[var112] - var118;
                        float var131 = (float) arg1.field6608[var112] - var119;
                        float var132 = (float) arg1.field6617[var113] - var117;
                        float var133 = (float) arg1.field6621[var113] - var118;
                        float var134 = (float) arg1.field6608[var113] - var119;
                        float var135 = var121 * var125 - var122 * var124;
                        float var136 = var122 * var123 - var120 * var125;
                        float var137 = var120 * var124 - var121 * var123;
                        float var138 = var124 * var137 - var125 * var136;
                        float var139 = var125 * var135 - var123 * var137;
                        float var140 = var123 * var136 - (var124 * var135);
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        float var142 = var120 * var136 - (var121 * var135);
                        float var143 = var121 * var137 - var122 * var136;
                        float var144 = var122 * var135 - var120 * var137;
                        float var145 = 1.0F / (var125 * var142 + var123 * var143 + var124 * var144);
                        var76 = (var131 * var142 + var129 * var143 + var130 * var144) * var145;
                        var78 = (var134 * var142 + var132 * var143 + var133 * var144) * var145;
                        var74 = (var128 * var142 + var126 * var143 + var127 * var144) * var145;
                    } else {
                        short var83 = arg1.field6627[var68];
                        short var84 = arg1.field6639[var68];
                        short var85 = arg1.field6596[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field6631[var71];
                        float var91 = (float) arg1.field6609[var71] / 256.0F;
                        if (var82 == 1) {
                            float var92 = (float) arg1.field6643[var71] / 1024.0F;
                            class481.method2807(var92, var91, var87, var89, arg1.field6617[var83], (byte) 114, var86, var88, arg1.field6621[var83], arg1.field6608[var83], var90);
                            var74 = class681.field9613;
                            var73 = class47.field732;
                            class481.method2807(var92, var91, var87, var89, arg1.field6617[var84], (byte) 108, var86, var88, arg1.field6621[var84], arg1.field6608[var84], var90);
                            var76 = class681.field9613;
                            var75 = class47.field732;
                            class481.method2807(var92, var91, var87, var89, arg1.field6617[var85], (byte) 110, var86, var88, arg1.field6621[var85], arg1.field6608[var85], var90);
                            var78 = class681.field9613;
                            var77 = class47.field732;
                            float var93 = var92 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if (var77 - var73 > var93) {
                                    var80 = 1;
                                    var77 -= var92;
                                } else if (var73 - var77 > var93) {
                                    var77 += var92;
                                    var80 = 2;
                                }
                                if (var93 < var75 - var73) {
                                    var79 = 1;
                                    var75 -= var92;
                                } else if (var93 < var73 - var75) {
                                    var75 += var92;
                                    var79 = 2;
                                }
                            } else {
                                if (var93 < var76 - var74) {
                                    var79 = 1;
                                    var76 -= var92;
                                } else if (var93 < var74 - var76) {
                                    var76 += var92;
                                    var79 = 2;
                                }
                                if ((var78 - var74 > var93)) {
                                    var80 = 1;
                                    var78 -= var92;
                                } else if (var74 - var78 > var93) {
                                    var80 = 2;
                                    var78 += var92;
                                }
                            }
                        } else if (var82 == 2) {
                            float var94 = (float) arg1.field6602[var71] / 256.0F;
                            float var95 = (float) arg1.field6630[var71] / 256.0F;
                            int var96 = arg1.field6617[var84] - arg1.field6617[var83];
                            int var97 = arg1.field6621[var84] - arg1.field6621[var83];
                            int var98 = arg1.field6608[var84] - arg1.field6608[var83];
                            int var99 = arg1.field6617[var85] - arg1.field6617[var83];
                            int var100 = arg1.field6621[var85] - arg1.field6621[var83];
                            int var101 = arg1.field6608[var85] - arg1.field6608[var83];
                            int var102 = var97 * var101 - var98 * var100;
                            int var103 = var98 * var99 - var96 * var101;
                            int var104 = var96 * var100 - (var97 * var99);
                            float var105 = 64.0F / (float) arg1.field6595[var71];
                            float var106 = 64.0F / (float) arg1.field6606[var71];
                            float var107 = 64.0F / (float) arg1.field6643[var71];
                            float var108 = (var89[2] * (float) var104 + var89[1] * (float) var103 + var89[0] * (float) var102) / var105;
                            float var109 = (var89[5] * (float) var104 + var89[3] * (float) var102 + var89[4] * (float) var103) / var106;
                            float var110 = (var89[8] * (float) var104 + var89[6] * (float) var102 + var89[7] * (float) var103) / var107;
                            var81 = class553.method3139(var110, var108, var109, 1);
                            class127.method956(var81, var88, var86, arg1.field6621[var83], arg1.field6608[var83], var94, var89, var91, (byte) 71, var90, arg1.field6617[var83], var87, var95);
                            var74 = class264.field4007;
                            var73 = class598.field8456;
                            class127.method956(var81, var88, var86, arg1.field6621[var84], arg1.field6608[var84], var94, var89, var91, (byte) 71, var90, arg1.field6617[var84], var87, var95);
                            var76 = class264.field4007;
                            var75 = class598.field8456;
                            class127.method956(var81, var88, var86, arg1.field6621[var85], arg1.field6608[var85], var94, var89, var91, (byte) 71, var90, arg1.field6617[var85], var87, var95);
                            var77 = class598.field8456;
                            var78 = class264.field4007;
                        } else if (var82 == 3) {
                            class34.method390(arg1.field6608[var83], var88, var90, var86, arg1.field6621[var83], arg1.field6617[var83], var91, (byte) 81, var87, var89);
                            var73 = class167.field2419;
                            var74 = class471.field6736;
                            class34.method390(arg1.field6608[var84], var88, var90, var86, arg1.field6621[var84], arg1.field6617[var84], var91, (byte) 22, var87, var89);
                            var76 = class471.field6736;
                            var75 = class167.field2419;
                            class34.method390(arg1.field6608[var85], var88, var90, var86, arg1.field6621[var85], arg1.field6617[var85], var91, (byte) 89, var87, var89);
                            var78 = class471.field6736;
                            var77 = class167.field2419;
                            if ((var90 & 0x1) == 0) {
                                if ((var77 - var73 > 0.5F)) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                                if (var75 - var73 > 0.5F) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                            } else {
                                if ((var78 - var74 > 0.5F)) {
                                    var80 = 1;
                                    var78--;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                                if (var76 - var74 > 0.5F) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field6593 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field6593[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) (var71 << 2);
                short var152 = arg1.field6627[var68];
                short var153 = arg1.field6639[var68];
                short var154 = arg1.field6596[var68];
                class2 var155 = var13[var152];
                this.field8872[var52] = this.method3533(false, var155.field15, var73, var155.field14, var150, var155.field10, var74, var155.field12, arg1, var152);
                class2 var156 = var13[var153];
                this.field8933[var52] = this.method3533(false, var156.field15, var75, var156.field14, (long) var79 + var150, var156.field10, var76, var156.field12, arg1, var153);
                class2 var157 = var13[var154];
                this.field8946[var52] = this.method3533(false, var157.field15, var77, var157.field14, (long) var80 + var150, var157.field10, var78, var157.field12, arg1, var154);
            } else if (var146 == 1) {
                class349 var147 = var50[var68];
                long var148 = (long) ((var147.field5057 <= 0 ? 2048 : 1024) + (var71 << 2) - (-(var147.field5061 + 256 << 12) - (var147.field5058 + 256 << 22))) + ((long) (var81 << 24) + (long) var72 + (long) (var69 << 8) << 32);
                this.field8872[var52] = this.method3533(false, 0, var73, var147.field5061, var148, var147.field5057, var74, var147.field5058, arg1, arg1.field6627[var68]);
                this.field8933[var52] = this.method3533(false, 0, var75, var147.field5061, (long) var79 + var148, var147.field5057, var76, var147.field5058, arg1, arg1.field6639[var68]);
                this.field8946[var52] = this.method3533(false, 0, var77, var147.field5061, (long) var80 + var148, var147.field5057, var78, var147.field5058, arg1, arg1.field6596[var68]);
            }
            if (arg1.field6620 == null) {
                this.field8940[var52] = -1;
            } else {
                this.field8940[var52] = arg1.field6620[var68];
            }
            if (arg1.field6607 != null) {
                this.field8847[var52] = arg1.field6607[var68];
            }
            if (arg1.field6629 != null) {
                this.field8879[var52] = arg1.field6629[var68];
            }
            this.field8947[var52] = arg1.field6614[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field8926; var55++) {
            short var67 = this.field8940[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field8899 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field8926; var58++) {
            short var66 = this.field8940[var58];
            if (var57 != var66) {
                var57 = var66;
                this.field8899[var56++] = var58;
            }
        }
        this.field8899[var56] = this.field8926;
        class454.field6518 = null;
        this.field8848 = class83.method737(false, this.field8841, this.field8848);
        this.field8951 = class83.method737(false, this.field8841, this.field8951);
        this.field8936 = class83.method737(false, this.field8841, this.field8936);
        this.field8954 = class433.method2579(116, this.field8954, this.field8841);
        this.field8843 = class399.method2447((byte) 117, this.field8843, this.field8841);
        this.field8885 = class399.method2447((byte) 122, this.field8885, this.field8841);
        if (arg1.field6619 != null && class66.method672(235, this.field8923, arg2)) {
            this.field8917 = arg1.method2717(-46, false);
        }
        if (arg1.field6613 != null && class161.method1112(this.field8923, arg2, -1)) {
            this.field8860 = arg1.method2718(0);
        }
        if (arg1.field6625 != null && class487.method2830(arg2, -48, this.field8923)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field8859; var61++) {
                int var65 = arg1.field6625[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var65 > var59) {
                        var59 = var65;
                    }
                }
            }
            this.field8927 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field8927[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field8859; var63++) {
                int var64 = arg1.field6625[var8[var63]];
                if (var64 >= 0) {
                    this.field8927[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBI)Z", line = 4032)
    public static final boolean method3530(int arg0, byte arg1, int arg2) {
        field8850++;
        int var3 = -55 / ((arg1 - 30) / 55);
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 4043)
    public static final void method3531(int arg0) {
        field8852++;
        if (arg0 != 2) {
            method3534(null, -45, (byte) -1);
        }
        if (class487.field6929 == null) {
            return;
        }
        if (class487.field6929.field7024 == 1) {
            class487.field6929 = null;
            return;
        }
        if (class487.field6929.field7024 == 2) {
            class640.method3562(class159.field2302, (byte) -14, 2, class401.field5905);
            class487.field6929 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!qf", name = "FA", descriptor = "()V", line = 4073)
    public final void method502() {
        field8839++;
        for (int var1 = 0; var1 < this.field8849; var1++) {
            this.field8870[var1] = -this.field8870[var1];
        }
        for (int var2 = 0; var2 < this.field8841; var2++) {
            this.field8936[var2] = (short) (-this.field8936[var2]);
        }
        for (int var3 = 0; var3 < this.field8859; var3++) {
            short var4 = this.field8872[var3];
            this.field8872[var3] = this.field8946[var3];
            this.field8946[var3] = var4;
        }
        if (this.field8950 == null && this.field8935 != null) {
            this.field8935.field7199 = null;
        }
        if (this.field8950 != null) {
            this.field8950.field7199 = null;
        }
        if (this.field8851 != null) {
            this.field8851.field7199 = null;
        }
        if (this.field8929 != null) {
            this.field8929.field1793 = null;
        }
        this.field8863 = false;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()[Lin;", line = 4123)
    public final class77[] method487() {
        field8953++;
        return this.field8918;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V", line = 4131)
    private final void method3532(boolean arg0, int arg1) {
        if (this.field8864.field3510.field9796.length < (this.field8926 * 6)) {
            this.field8864.field3510 = new class231(this.field8926 * 6 + 600);
        } else {
            this.field8864.field3510.field9761 = 0;
        }
        field8959++;
        class231 var3 = this.field8864.field3510;
        int var4 = 0 % ((-arg1 - 57) / 45);
        if (this.field8864.field3514) {
            for (int var5 = 0; var5 < this.field8926; var5++) {
                var3.method3852(false, this.field8872[var5]);
                var3.method3852(false, this.field8933[var5]);
                var3.method3852(false, this.field8946[var5]);
            }
        } else {
            for (int var6 = 0; var6 < this.field8926; var6++) {
                var3.method3843(this.field8872[var6], true);
                var3.method3843(this.field8933[var6], true);
                var3.method3843(this.field8946[var6], true);
            }
        }
        if (var3.field9761 == 0) {
            return;
        }
        if (arg0) {
            if (this.field8880 == null) {
                this.field8880 = this.field8864.method1526(false, var3.field9796, 5123, true, var3.field9761);
            } else {
                this.field8880.method1948(var3.field9761, var3.field9796, (byte) -89, 5123);
            }
            this.field8929.field1793 = this.field8880;
        } else {
            this.field8929.field1793 = this.field8864.method1526(false, var3.field9796, 5123, false, var3.field9761);
        }
        if (!arg0) {
            this.field8948 = true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIFIJIFILlm;I)S", line = 4199)
    private final short method3533(boolean arg0, int arg1, float arg2, int arg3, long arg4, int arg5, float arg6, int arg7, class461 arg8, int arg9) {
        field8902++;
        int var12 = this.field8887[arg9];
        int var13 = this.field8887[arg9 + 1];
        int var14 = 0;
        if (arg0) {
            return -98;
        }
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field8921[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class454.field6518[var15] == arg4) {
                return (short) (var16 - 1);
            }
        }
        this.field8921[var14] = (short) (this.field8841 + 1);
        class454.field6518[var14] = arg4;
        this.field8848[this.field8841] = (short) arg5;
        this.field8951[this.field8841] = (short) arg3;
        this.field8936[this.field8841] = (short) arg7;
        this.field8954[this.field8841] = (byte) arg1;
        this.field8843[this.field8841] = arg2;
        this.field8885[this.field8841] = arg6;
        return (short) (this.field8841++);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lvq;IB)V", line = 4249)
    public static final void method3534(class425 arg0, int arg1, byte arg2) {
        if (arg2 <= 106) {
            method3535(-99, (byte) 65);
        }
        if (arg0.field6259 != null) {
            int var3 = arg0.field6259[arg1 + 1];
            if (arg0.field6218 != var3) {
                arg0.field6253 = 0;
                arg0.field6194 = 0;
                arg0.field6222 = 1;
                arg0.field6218 = var3;
                arg0.field6268 = arg0.field6269;
                arg0.field6251 = 0;
                if (arg0.field6218 != -1) {
                    class603.method3399(class188.field2708.method2140(arg0.field6218, 125), arg0.field3024, arg0.field6194, class648.field9106 == arg0, -74, arg0.field3029, arg0.field3019);
                }
            }
        }
        field8911++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[IIIIIZ)V", line = 4281)
    public final void method504(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field8883++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            class443.field6459 = 0;
            class666.field9391 = 0;
            int var12 = 0;
            class370.field5296 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field8917.length) {
                    int[] var15 = this.field8917[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class443.field6459 += this.field8893[var17];
                        class666.field9391 += this.field8866[var17];
                        var12++;
                        class370.field5296 += this.field8870[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class666.field9391 = var9;
                class443.field6459 = var10;
                class370.field5296 = var11;
            } else {
                class370.field5296 = class370.field5296 / var12 + var11;
                class443.field6459 = class443.field6459 / var12 + var10;
                class666.field9391 = class666.field9391 / var12 + var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg3 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field8917.length) {
                    int[] var23 = this.field8917[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field8893[var25] += var20;
                        this.field8866[var25] += var19;
                        this.field8870[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field8917.length > var45) {
                    int[] var46 = this.field8917[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field8893[var59] -= class443.field6459;
                            this.field8866[var59] -= class666.field9391;
                            this.field8870[var59] -= class370.field5296;
                            if (arg4 != 0) {
                                int var60 = class189.field2719[arg4];
                                int var61 = class189.field2721[arg4];
                                int var62 = this.field8866[var59] * var60 + (this.field8893[var59] * var61) + 16383 >> 14;
                                this.field8866[var59] = this.field8866[var59] * var61 + (16383 - (this.field8893[var59] * var60)) >> 14;
                                this.field8893[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class189.field2719[arg2];
                                int var64 = class189.field2721[arg2];
                                int var65 = this.field8866[var59] * var64 + 16383 - (this.field8870[var59] * var63) >> 14;
                                this.field8870[var59] = this.field8870[var59] * var64 + this.field8866[var59] * var63 + 16383 >> 14;
                                this.field8866[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class189.field2719[arg3];
                                int var67 = class189.field2721[arg3];
                                int var68 = this.field8893[var59] * var67 + this.field8870[var59] * var66 + 16383 >> 14;
                                this.field8870[var59] = this.field8870[var59] * var67 + 16383 - this.field8893[var59] * var66 >> 14;
                                this.field8893[var59] = var68;
                            }
                            this.field8893[var59] += class443.field6459;
                            this.field8866[var59] += class666.field9391;
                            this.field8870[var59] += class370.field5296;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field8893[var48] -= class443.field6459;
                            this.field8866[var48] -= class666.field9391;
                            this.field8870[var48] -= class370.field5296;
                            if (arg2 != 0) {
                                int var49 = class189.field2719[arg2];
                                int var50 = class189.field2721[arg2];
                                int var51 = this.field8866[var48] * var50 + 16383 - (this.field8870[var48] * var49) >> 14;
                                this.field8870[var48] = this.field8870[var48] * var50 + this.field8866[var48] * var49 + 16383 >> 14;
                                this.field8866[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class189.field2719[arg4];
                                int var53 = class189.field2721[arg4];
                                int var54 = this.field8866[var48] * var52 + (this.field8893[var48] * var53) + 16383 >> 14;
                                this.field8866[var48] = this.field8866[var48] * var53 + 16383 - this.field8893[var48] * var52 >> 14;
                                this.field8893[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class189.field2719[arg3];
                                int var56 = class189.field2721[arg3];
                                int var57 = this.field8893[var48] * var56 + this.field8870[var48] * var55 + 16383 >> 14;
                                this.field8870[var48] = this.field8870[var48] * var56 + 16383 - (this.field8893[var48] * var55) >> 14;
                                this.field8893[var48] = var57;
                            }
                            this.field8893[var48] += class443.field6459;
                            this.field8866[var48] += class666.field9391;
                            this.field8870[var48] += class370.field5296;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field8917.length) {
                        int[] var29 = this.field8917[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field8887[var31];
                            int var33 = this.field8887[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field8921[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class189.field2719[arg4];
                                    int var37 = class189.field2721[arg4];
                                    int var38 = this.field8951[var35] * var36 + this.field8848[var35] * var37 + 16383 >> 14;
                                    this.field8951[var35] = (short) (this.field8951[var35] * var37 + 16383 - (this.field8848[var35] * var36) >> 14);
                                    this.field8848[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class189.field2719[arg2];
                                    int var40 = class189.field2721[arg2];
                                    int var41 = this.field8951[var35] * var40 + 16383 - this.field8936[var35] * var39 >> 14;
                                    this.field8936[var35] = (short) (this.field8936[var35] * var40 + (this.field8951[var35] * var39 + 16383) >> 14);
                                    this.field8951[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class189.field2719[arg3];
                                    int var43 = class189.field2721[arg3];
                                    int var44 = this.field8936[var35] * var42 + this.field8848[var35] * var43 + 16383 >> 14;
                                    this.field8936[var35] = (short) (this.field8936[var35] * var43 + 16383 - (this.field8848[var35] * var42) >> 14);
                                    this.field8848[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field8950 == null && this.field8935 != null) {
                    this.field8935.field7199 = null;
                }
                if (this.field8950 != null) {
                    this.field8950.field7199 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field8917.length) {
                    int[] var71 = this.field8917[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field8893[var73] -= class443.field6459;
                        this.field8866[var73] -= class666.field9391;
                        this.field8870[var73] -= class370.field5296;
                        this.field8893[var73] = this.field8893[var73] * arg2 >> 7;
                        this.field8866[var73] = this.field8866[var73] * arg3 >> 7;
                        this.field8870[var73] = this.field8870[var73] * arg4 >> 7;
                        this.field8893[var73] += class443.field6459;
                        this.field8866[var73] += class666.field9391;
                        this.field8870[var73] += class370.field5296;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8927 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field8927.length > var78) {
                        int[] var79 = this.field8927[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field8847[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field8847[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field8935 != null) {
                            this.field8935.field7199 = null;
                        }
                    }
                }
                if (this.field8888 != null) {
                    for (int var75 = 0; var75 < this.field8895; var75++) {
                        class182 var76 = this.field8888[var75];
                        class284 var77 = this.field8952[var75];
                        var77.field4263 = var77.field4263 & 0xFFFFFF | 255 - (this.field8847[var76.field2570] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field8927 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field8927.length > var87) {
                        int[] var88 = this.field8927[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field8947[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3E0) >> 7;
                            int var94 = arg2 + var92 & 0x3F;
                            int var95 = var91 & 0x7F;
                            int var96 = arg3 / 4 + var93;
                            int var97 = arg4 + var95;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field8947[var90] = (short) class486.method2826(class486.method2826(var96 << 7, var94 << 10), var97);
                        }
                        if (var88.length > 0 && this.field8935 != null) {
                            this.field8935.field7199 = null;
                        }
                    }
                }
                if (this.field8888 != null) {
                    for (int var84 = 0; var84 < this.field8895; var84++) {
                        class182 var85 = this.field8888[var84];
                        class284 var86 = this.field8952[var84];
                        var86.field4263 = class437.field6386[this.field8947[var85.field2570] & 0xFFFF] & 0xFFFFFF | var86.field4263 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field8860 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field8860.length) {
                        int[] var100 = this.field8860[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class284 var102 = this.field8952[var100[var101]];
                            var102.field4254 += arg3;
                            var102.field4262 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8860 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field8860.length > var104) {
                        int[] var105 = this.field8860[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class284 var107 = this.field8952[var105[var106]];
                            var107.field4259 = var107.field4259 * arg2 >> 7;
                            var107.field4255 = var107.field4255 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8860 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field8860.length > var109) {
                    int[] var110 = this.field8860[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class284 var112 = this.field8952[var110[var111]];
                        var112.field4257 = var112.field4257 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "()[Llea;", line = 4940)
    public final class568[] method501() {
        field8867++;
        return this.field8897;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lq;Lkd;II)V", line = 4948)
    public final void method495(class391 arg0, class253 arg1, int arg2, int arg3) {
        field8924++;
        if (this.field8841 == 0) {
            return;
        }
        class696 var5 = this.field8864.field3434;
        if (!this.field8863) {
            this.method3529(-83);
        }
        class696 var6 = (class696) arg0;
        class347.field5042 = var5.field9832 * var6.field9849 + var5.field9849 * var6.field9837 + var5.field9829 * var6.field9847;
        class203.field2876 = var5.field9832 * var6.field9841 + var5.field9849 * var6.field9824 + var5.field9829 * var6.field9840 + var5.field9841;
        float var7 = (float) this.field8877 * class347.field5042 + class203.field2876;
        float var8 = (float) this.field8904 * class347.field5042 + class203.field2876;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var10 = (float) this.field8949 + var7;
            var9 = (float) (-this.field8949) + var8;
        } else {
            var9 = (float) (-this.field8949) + var7;
            var10 = (float) this.field8949 + var8;
        }
        if ((var9 >= this.field8864.field3550) || (var10 <= (float) this.field8864.field3536)) {
            return;
        }
        class547.field7689 = var5.field9852 * var6.field9849 + var5.field9847 * var6.field9837 + var5.field9838 * var6.field9847;
        class704.field9915 = var5.field9852 * var6.field9841 + var5.field9847 * var6.field9824 + var5.field9838 * var6.field9840 + var5.field9840;
        float var11 = (float) this.field8877 * class547.field7689 + class704.field9915;
        float var12 = (float) this.field8904 * class547.field7689 + class704.field9915;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var13 = ((float) this.field8949 + var11) * (float) this.field8864.field3452;
            var14 = ((float) (-this.field8949) + var12) * (float) this.field8864.field3452;
        } else {
            var13 = ((float) this.field8949 + var12) * (float) this.field8864.field3452;
            var14 = (var11 - (float) this.field8949) * (float) this.field8864.field3452;
        }
        if ((var14 / (float) arg2 >= this.field8864.field3480) || (this.field8864.field3501 >= var13 / (float) arg2)) {
            return;
        }
        class405.field5936 = var5.field9856 * var6.field9841 + var5.field9837 * var6.field9824 + var5.field9834 * var6.field9840 + var5.field9824;
        class363.field5185 = var5.field9856 * var6.field9849 + var5.field9837 * var6.field9837 + var5.field9834 * var6.field9847;
        float var15 = (float) this.field8877 * class363.field5185 + class405.field5936;
        float var16 = (float) this.field8904 * class363.field5185 + class405.field5936;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = ((float) (-this.field8949) + var16) * (float) this.field8864.field3507;
            var18 = ((float) this.field8949 + var15) * (float) this.field8864.field3507;
        } else {
            var18 = ((float) this.field8949 + var16) * (float) this.field8864.field3507;
            var17 = ((float) (-this.field8949) + var15) * (float) this.field8864.field3507;
        }
        if ((var17 / (float) arg2 >= this.field8864.field3454) || (this.field8864.field3519 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field8888 != null) {
            class499.field7077 = var5.field9856 * var6.field9829 + var5.field9837 * var6.field9834 + var5.field9834 * var6.field9838;
            class393.field5832 = var5.field9852 * var6.field9832 + var5.field9847 * var6.field9856 + var5.field9838 * var6.field9852;
            class432.field6322 = var5.field9832 * var6.field9829 + var5.field9849 * var6.field9834 + var5.field9829 * var6.field9838;
            class619.field8646 = var5.field9832 * var6.field9832 + var5.field9849 * var6.field9856 + var5.field9829 * var6.field9852;
            class140.field2061 = var5.field9852 * var6.field9829 + var5.field9847 * var6.field9834 + var5.field9838 * var6.field9838;
            class43.field699 = var5.field9856 * var6.field9832 + var5.field9837 * var6.field9856 + var5.field9834 * var6.field9852;
        }
        if (arg1 != null) {
            int var19 = this.field8931 + this.field8871 >> 1;
            int var20 = this.field8882 + this.field8856 >> 1;
            int var21 = (int) ((float) var20 * class393.field5832 + (float) this.field8877 * class547.field7689 + (float) var19 * class140.field2061 + class704.field9915);
            int var22 = (int) ((float) var20 * class43.field699 + (float) this.field8877 * class363.field5185 + (float) var19 * class499.field7077 + class405.field5936);
            int var23 = (int) ((float) var20 * class619.field8646 + (float) this.field8877 * class347.field5042 + (float) var19 * class432.field6322 + class203.field2876);
            int var24 = (int) ((float) var20 * class393.field5832 + (float) this.field8904 * class547.field7689 + (float) var19 * class140.field2061 + class704.field9915);
            int var25 = (int) ((float) var20 * class43.field699 + (float) this.field8904 * class363.field5185 + (float) var19 * class499.field7077 + class405.field5936);
            int var26 = (int) ((float) var20 * class619.field8646 + (float) this.field8904 * class347.field5042 + (float) var19 * class432.field6322 + class203.field2876);
            arg1.field3895 = this.field8864.field3456 + (this.field8864.field3507 * var25 / arg2);
            arg1.field3893 = this.field8864.field3507 * var22 / arg2 + this.field8864.field3456;
            arg1.field3897 = this.field8864.field3512 + (this.field8864.field3452 * var24 / arg2);
            arg1.field3894 = this.field8864.field3512 + (this.field8864.field3452 * var21 / arg2);
            if (var23 >= this.field8864.field3536 || var26 >= this.field8864.field3536) {
                arg1.field3896 = true;
                arg1.field3892 = this.field8864.field3512 + ((this.field8949 + var21) * this.field8864.field3452 / arg2) - arg1.field3894;
            }
        }
        this.field8864.method1511(31313, (float) arg2);
        this.field8864.method1499(1);
        this.field8864.method1509(var6, 1);
        this.method3528((byte) 86);
        this.field8864.method1504(8448);
        this.method3536(true);
    }

    @OriginalMember(owner = "client!qf", name = "ga", descriptor = "(I)V", line = 5098)
    public final void method496(int arg0) {
        this.field8876 = (short) arg0;
        if (this.field8935 != null) {
            this.field8935.field7199 = null;
        }
        field8932++;
        if (this.field8950 != null) {
            this.field8950.field7199 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "(Lha;)Lha;", line = 5124)
    public final class54 method519(class54 arg0) {
        field8957++;
        if (this.field8841 == 0) {
            return null;
        }
        if (!this.field8863) {
            this.method3529(-6);
        }
        int var2;
        int var3;
        if (this.field8864.field3516 > 0) {
            var2 = this.field8931 - (this.field8864.field3516 * this.field8904 >> 8) >> this.field8864.field3404;
            var3 = this.field8871 - (this.field8864.field3516 * this.field8877 >> 8) >> this.field8864.field3404;
        } else {
            var2 = this.field8931 - (this.field8864.field3516 * this.field8877 >> 8) >> this.field8864.field3404;
            var3 = this.field8871 - (this.field8864.field3516 * this.field8904 >> 8) >> this.field8864.field3404;
        }
        int var4;
        int var5;
        if (this.field8864.field3518 <= 0) {
            var4 = this.field8856 - (this.field8864.field3518 * this.field8877 >> 8) >> this.field8864.field3404;
            var5 = this.field8882 - (this.field8864.field3518 * this.field8904 >> 8) >> this.field8864.field3404;
        } else {
            var4 = this.field8856 - (this.field8864.field3518 * this.field8904 >> 8) >> this.field8864.field3404;
            var5 = this.field8882 - (this.field8864.field3518 * this.field8877 >> 8) >> this.field8864.field3404;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class520 var8 = (class520) arg0;
        class520 var9;
        if (var8 != null && var8.method2969(var7, true, var6)) {
            var9 = var8;
            var8.method2970(false);
        } else {
            var9 = new class520(this.field8864, var6, var7);
        }
        var9.method2967((byte) 117, var3, var2, var5, var4);
        this.method3525(-1525, var9);
        return var9;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lq;)V", line = 5188)
    public final void method538(class391 arg0) {
        field8857++;
        class696 var2 = (class696) arg0;
        if (this.field8897 != null) {
            for (int var3 = 0; var3 < this.field8897.length; var3++) {
                class568 var4 = this.field8897[var3];
                class568 var5 = var4;
                if (var4.field7989 != null) {
                    var5 = var4.field7989;
                }
                var5.field7983 = (int) ((float) this.field8870[var4.field7999] * var2.field9852 + (float) this.field8893[var4.field7999] * var2.field9838 + (float) this.field8866[var4.field7999] * var2.field9847 + var2.field9840);
                var5.field8002 = (int) ((float) this.field8870[var4.field7999] * var2.field9856 + (float) this.field8893[var4.field7999] * var2.field9834 + (float) this.field8866[var4.field7999] * var2.field9837 + var2.field9824);
                var5.field7994 = (int) ((float) this.field8870[var4.field7999] * var2.field9832 + (float) this.field8893[var4.field7999] * var2.field9829 + (float) this.field8866[var4.field7999] * var2.field9849 + var2.field9841);
                var5.field7993 = (int) ((float) this.field8870[var4.field8000] * var2.field9852 + (float) this.field8893[var4.field8000] * var2.field9838 + (float) this.field8866[var4.field8000] * var2.field9847 + var2.field9840);
                var5.field7991 = (int) ((float) this.field8870[var4.field8000] * var2.field9856 + (float) this.field8893[var4.field8000] * var2.field9834 + (float) this.field8866[var4.field8000] * var2.field9837 + var2.field9824);
                var5.field7992 = (int) ((float) this.field8870[var4.field8000] * var2.field9832 + (float) this.field8893[var4.field8000] * var2.field9829 + (float) this.field8866[var4.field8000] * var2.field9849 + var2.field9841);
                var5.field8004 = (int) ((float) this.field8870[var4.field8001] * var2.field9852 + (float) this.field8893[var4.field8001] * var2.field9838 + (float) this.field8866[var4.field8001] * var2.field9847 + var2.field9840);
                var5.field7996 = (int) ((float) this.field8870[var4.field8001] * var2.field9856 + (float) this.field8893[var4.field8001] * var2.field9834 + (float) this.field8866[var4.field8001] * var2.field9837 + var2.field9824);
                var5.field8003 = (int) ((float) this.field8870[var4.field8001] * var2.field9832 + (float) this.field8893[var4.field8001] * var2.field9829 + (float) this.field8866[var4.field8001] * var2.field9849 + var2.field9841);
            }
        }
        if (this.field8918 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field8918.length; var6++) {
            class77 var7 = this.field8918[var6];
            class77 var8 = var7;
            if (var7.field1323 != null) {
                var8 = var7.field1323;
            }
            if (var7.field1332 == null) {
                var7.field1332 = var2.method251();
            } else {
                var7.field1332.method274(var2);
            }
            var8.field1327 = (int) ((float) this.field8870[var7.field1333] * var2.field9852 + (float) this.field8893[var7.field1333] * var2.field9838 + (float) this.field8866[var7.field1333] * var2.field9847 + var2.field9840);
            var8.field1330 = (int) ((float) this.field8870[var7.field1333] * var2.field9856 + (float) this.field8893[var7.field1333] * var2.field9834 + (float) this.field8866[var7.field1333] * var2.field9837 + var2.field9824);
            var8.field1334 = (int) ((float) this.field8870[var7.field1333] * var2.field9832 + (float) this.field8893[var7.field1333] * var2.field9829 + (float) this.field8866[var7.field1333] * var2.field9849 + var2.field9841);
        }
    }

    @OriginalMember(owner = "client!qf", name = "PA", descriptor = "()I", line = 5264)
    public final int method517() {
        field8855++;
        return this.field8943;
    }

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "()I", line = 5272)
    public final int method544() {
        if (!this.field8863) {
            this.method3529(-66);
        }
        field8838++;
        return this.field8871;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 5286)
    public static final String method3535(int arg0, byte arg1) {
        if (arg1 != 54) {
            field8925 = null;
        }
        field8956++;
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFF166B) >> 16) + "." + ((arg0 & 0xFFCE) >> 8) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!qf", name = "DA", descriptor = "(SS)V", line = 5298)
    public final void method527(short arg0, short arg1) {
        field8868++;
        class209 var3 = this.field8864.field2384;
        for (int var4 = 0; var4 < this.field8859; var4++) {
            if (this.field8940[var4] == arg0) {
                this.field8940[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class159 var7 = var3.method1386(arg0 & 0xFFFF, -6514);
            var5 = var7.field2292;
            var6 = var7.field2297;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class159 var10 = var3.method1386(arg1 & 0xFFFF, -6514);
            var9 = var10.field2297;
            var8 = var10.field2292;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field8888 != null) {
            for (int var11 = 0; var11 < this.field8895; var11++) {
                class182 var12 = this.field8888[var11];
                class284 var13 = this.field8952[var11];
                var13.field4263 = class437.field6386[this.field8947[var12.field2570] & 0xFFFF] & 0xFFFFFF | var13.field4263 & 0xFF000000;
            }
        }
        if (this.field8935 != null) {
            this.field8935.field7199 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "()V", line = 5374)
    public final void method511() {
        field8938++;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V", line = 5399)
    private final void method3536(boolean arg0) {
        field8934++;
        if (!arg0) {
            this.method534();
        }
        if (this.field8888 == null) {
            return;
        }
        class696 var2 = this.field8864.field3400;
        this.field8864.method1529((byte) -121);
        this.field8864.method178(false);
        this.field8864.method1493(false, -30);
        this.field8864.method1562((byte) -12, this.field8864.field3469, null, null, this.field8864.field3473);
        for (int var3 = 0; var3 < this.field8895; var3++) {
            class182 var4 = this.field8888[var3];
            class284 var5 = this.field8952[var3];
            if (!var4.field2585 || !this.field8864.method127()) {
                float var6 = (float) (this.field8893[var4.field2569] + this.field8893[var4.field2571] + this.field8893[var4.field2577]) * 0.3333333F;
                float var7 = (float) (this.field8866[var4.field2571] + this.field8866[var4.field2569] + this.field8866[var4.field2577]) * 0.3333333F;
                float var8 = (float) (this.field8870[var4.field2577] + this.field8870[var4.field2571] + this.field8870[var4.field2569]) * 0.3333333F;
                float var9 = class393.field5832 * var8 + class547.field7689 * var7 + class140.field2061 * var6 + class704.field9915;
                float var10 = class43.field699 * var8 + class499.field7077 * var6 + class363.field5185 * var7 + class405.field5936;
                float var11 = class619.field8646 * var8 + class432.field6322 * var6 + class347.field5042 * var7 + class203.field2876;
                var2.method3889((float) var5.field4254 - var10, var5.field4257, (float) var5.field4262 + var9, var4.field2578 * var5.field4259 >> 7, var4.field2565 * var5.field4255 >> 7, (byte) 123, (float) var4.field2568 - var11);
                this.field8864.method1523(var2, -13003);
                int var12 = var5.field4263;
                OpenGL.glColor4ub((byte) (var12 >> 16), (byte) (var12 >> 8), (byte) var12, (byte) (var12 >> 24));
                this.field8864.method1510((byte) 13, var4.field2574);
                this.field8864.method1536(0, var4.field2584);
                this.field8864.method1532(-22319, 0, 4, 7);
            }
        }
        this.field8864.method178(true);
        this.field8864.method1504(8448);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIZLq;)Z", line = 5480)
    private final boolean method3537(int arg0, int arg1, int arg2, int arg3, boolean arg4, class391 arg5) {
        field8920++;
        class696 var7 = (class696) arg5;
        class696 var8 = this.field8864.field3434;
        float var9 = var7.field9841 * var8.field9852 + var7.field9840 * var8.field9838 + var7.field9824 * var8.field9847 + var8.field9840;
        float var10 = var7.field9841 * var8.field9856 + var7.field9840 * var8.field9834 + var7.field9824 * var8.field9837 + var8.field9824;
        class393.field5832 = var7.field9832 * var8.field9852 + var7.field9856 * var8.field9847 + var7.field9852 * var8.field9838;
        class347.field5042 = var7.field9849 * var8.field9832 + var7.field9847 * var8.field9829 + var7.field9837 * var8.field9849;
        class140.field2061 = var7.field9829 * var8.field9852 + var7.field9838 * var8.field9838 + var7.field9834 * var8.field9847;
        class619.field8646 = var7.field9832 * var8.field9832 + var7.field9856 * var8.field9849 + var7.field9852 * var8.field9829;
        float var11 = var7.field9841 * var8.field9832 + var7.field9840 * var8.field9829 + var7.field9824 * var8.field9849 + var8.field9841;
        class363.field5185 = var7.field9849 * var8.field9856 + var7.field9847 * var8.field9834 + var7.field9837 * var8.field9837;
        class547.field7689 = var7.field9849 * var8.field9852 + var7.field9847 * var8.field9838 + var7.field9837 * var8.field9847;
        class43.field699 = var7.field9832 * var8.field9856 + var7.field9856 * var8.field9837 + var7.field9852 * var8.field9834;
        class499.field7077 = var7.field9829 * var8.field9856 + var7.field9838 * var8.field9834 + var7.field9834 * var8.field9837;
        class432.field6322 = var7.field9829 * var8.field9832 + var7.field9838 * var8.field9829 + var7.field9834 * var8.field9849;
        boolean var12 = false;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        float var15 = Float.MAX_VALUE;
        float var16 = -3.4028235E38F;
        int var17 = this.field8864.field3452;
        int var18 = this.field8864.field3507;
        if (!this.field8863) {
            this.method3529(-113);
        }
        class394.field5839[0] = this.field8931;
        if (arg3 != 25538) {
            return true;
        }
        class2.field18[0] = this.field8877;
        class394.field5839[1] = this.field8871;
        class395.field5865[0] = this.field8856;
        class2.field18[1] = this.field8877;
        class395.field5865[1] = this.field8856;
        class394.field5839[2] = this.field8931;
        class2.field18[2] = this.field8904;
        class395.field5865[2] = this.field8856;
        class394.field5839[3] = this.field8871;
        class2.field18[3] = this.field8904;
        class395.field5865[3] = this.field8856;
        class394.field5839[4] = this.field8931;
        class2.field18[4] = this.field8877;
        class394.field5839[5] = this.field8871;
        class395.field5865[4] = this.field8882;
        class2.field18[5] = this.field8877;
        class395.field5865[5] = this.field8882;
        class394.field5839[6] = this.field8931;
        class2.field18[6] = this.field8904;
        class394.field5839[7] = this.field8871;
        class395.field5865[6] = this.field8882;
        class2.field18[7] = this.field8904;
        class395.field5865[7] = this.field8882;
        for (int var19 = 0; var19 < 8; var19++) {
            float var40 = (float) class394.field5839[var19];
            float var41 = (float) class2.field18[var19];
            float var42 = (float) class395.field5865[var19];
            float var43 = class619.field8646 * var42 + class432.field6322 * var40 + class347.field5042 * var41 + var11;
            float var44 = class43.field699 * var42 + class499.field7077 * var40 + class363.field5185 * var41 + var10;
            float var45 = class393.field5832 * var42 + class547.field7689 * var41 + class140.field2061 * var40 + var9;
            if ((float) this.field8864.field3536 <= var43) {
                if (arg0 > 0) {
                    var43 = arg0;
                }
                float var46 = (float) var17 * var45 / var43 + (float) this.field8864.field3512;
                float var47 = (float) var18 * var44 / var43 + (float) this.field8864.field3456;
                if (var46 < var13) {
                    var13 = var46;
                }
                if (var46 > var14) {
                    var14 = var46;
                }
                var12 = true;
                if (var15 > var47) {
                    var15 = var47;
                }
                if (var47 > var16) {
                    var16 = var47;
                }
            }
        }
        if (var12 && var13 < (float) arg1 && (float) arg1 < var14 && (float) arg2 > var15 && (float) arg2 < var16) {
            if (arg4) {
                return true;
            }
            if (this.field8841 > this.field8864.field3556.length) {
                this.field8864.field3557 = new int[this.field8841];
                this.field8864.field3556 = new int[this.field8841];
            }
            int[] var20 = this.field8864.field3556;
            int[] var21 = this.field8864.field3557;
            for (int var22 = 0; var22 < this.field8849; var22++) {
                float var24 = (float) this.field8893[var22];
                float var25 = (float) this.field8870[var22];
                float var26 = (float) this.field8866[var22];
                float var27 = class619.field8646 * var25 + class432.field6322 * var24 + class347.field5042 * var26 + var11;
                float var28 = class393.field5832 * var25 + class547.field7689 * var26 + class140.field2061 * var24 + var9;
                float var29 = class43.field699 * var25 + class499.field7077 * var24 + class363.field5185 * var26 + var10;
                if (var27 >= (float) this.field8864.field3536) {
                    if (arg0 > 0) {
                        var27 = arg0;
                    }
                    int var30 = (int) ((float) var17 * var28 / var27 + (float) this.field8864.field3512);
                    int var31 = (int) ((float) var18 * var29 / var27 + (float) this.field8864.field3456);
                    int var32 = this.field8887[var22];
                    int var33 = this.field8887[var22 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field8921[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        var20[var35] = var30;
                        var21[var35] = var31;
                    }
                } else {
                    int var36 = this.field8887[var22];
                    int var37 = this.field8887[var22 + 1];
                    for (int var38 = var36; var38 < var37; var38++) {
                        int var39 = this.field8921[var38] - 1;
                        if (var39 == -1) {
                            break;
                        }
                        var20[this.field8921[var38] - 1] = -999999;
                    }
                }
            }
            for (int var23 = 0; var23 < this.field8859; var23++) {
                if (var20[this.field8872[var23]] != -999999 && var20[this.field8933[var23]] != -999999 && var20[this.field8946[var23]] != -999999 && this.method3521(var20[this.field8946[var23]], var21[this.field8946[var23]], 21551, arg2, var21[this.field8933[var23]], var21[this.field8872[var23]], arg1, var20[this.field8933[var23]], var20[this.field8872[var23]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qf", name = "OA", descriptor = "()I", line = 5699)
    public final int method531() {
        field8858++;
        if (!this.field8863) {
            this.method3529(-59);
        }
        return this.field8856;
    }

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "(I)V", line = 5711)
    public final void method494(int arg0) {
        field8889++;
        int var2 = class189.field2719[arg0];
        int var3 = class189.field2721[arg0];
        for (int var4 = 0; var4 < this.field8849; var4++) {
            int var5 = this.field8866[var4] * var2 + (this.field8893[var4] * var3) >> 14;
            this.field8866[var4] = this.field8866[var4] * var3 - (this.field8893[var4] * var2) >> 14;
            this.field8893[var4] = var5;
        }
        if (this.field8851 != null) {
            this.field8851.field7199 = null;
        }
        this.field8863 = false;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILq;ZI)Z", line = 5746)
    public final boolean method492(int arg0, int arg1, class391 arg2, boolean arg3, int arg4) {
        field8905++;
        return this.method3537(arg4, arg0, arg1, 25538, arg3, arg2);
    }
}
