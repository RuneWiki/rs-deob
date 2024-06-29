import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class718 extends class475 {

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
    private int field9897 = 0;

    @OriginalMember(owner = "client!nk", name = "xb", descriptor = "I")
    private int field9940 = 0;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    private int field9882 = 0;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
    private int field9898 = 0;

    @OriginalMember(owner = "client!nk", name = "db", descriptor = "Z")
    private boolean field9920 = true;

    @OriginalMember(owner = "client!nk", name = "nc", descriptor = "Z")
    private boolean field9982 = false;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
    private int field9892 = 0;

    @OriginalMember(owner = "client!nk", name = "kb", descriptor = "Z")
    private boolean field9927 = false;

    @OriginalMember(owner = "client!nk", name = "sb", descriptor = "Z")
    private boolean field9935 = false;

    @OriginalMember(owner = "client!nk", name = "cb", descriptor = "Lrda;")
    private class663 field9919;

    @OriginalMember(owner = "client!nk", name = "Eb", descriptor = "Lim;")
    private class572 field9947;

    @OriginalMember(owner = "client!nk", name = "sc", descriptor = "Lim;")
    private class572 field9987;

    @OriginalMember(owner = "client!nk", name = "rb", descriptor = "Lim;")
    private class572 field9934;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "Lim;")
    private class572 field9893;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "Lvea;")
    private class277 field9906;

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
    private int field9915;

    @OriginalMember(owner = "client!nk", name = "Pb", descriptor = "I")
    private int field9958;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "[I")
    private int[] field9901;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "[S")
    private short[] field9885;

    @OriginalMember(owner = "client!nk", name = "fc", descriptor = "[I")
    private int[] field9974;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "[I")
    private int[] field9911;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "[I")
    private int[] field9894;

    @OriginalMember(owner = "client!nk", name = "fb", descriptor = "[Lcm;")
    private class730[] field9922;

    @OriginalMember(owner = "client!nk", name = "bc", descriptor = "[Lhi;")
    private class207[] field9970;

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "I")
    private int field9918;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "[Lvf;")
    private class153[] field9883;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "[Lbaa;")
    private class524[] field9887;

    @OriginalMember(owner = "client!nk", name = "wb", descriptor = "S")
    private short field9939;

    @OriginalMember(owner = "client!nk", name = "Ec", descriptor = "[S")
    private short[] field9999;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "[S")
    private short[] field9905;

    @OriginalMember(owner = "client!nk", name = "gc", descriptor = "[S")
    private short[] field9975;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "[F")
    private float[] field9912;

    @OriginalMember(owner = "client!nk", name = "jc", descriptor = "[S")
    private short[] field9978;

    @OriginalMember(owner = "client!nk", name = "Qb", descriptor = "[S")
    private short[] field9959;

    @OriginalMember(owner = "client!nk", name = "Yb", descriptor = "[S")
    private short[] field9967;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "[S")
    private short[] field9888;

    @OriginalMember(owner = "client!nk", name = "Kb", descriptor = "[S")
    private short[] field9953;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "[S")
    private short[] field9880;

    @OriginalMember(owner = "client!nk", name = "Cc", descriptor = "[S")
    private short[] field9997;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "[B")
    private byte[] field9916;

    @OriginalMember(owner = "client!nk", name = "Bb", descriptor = "[F")
    private float[] field9944;

    @OriginalMember(owner = "client!nk", name = "ob", descriptor = "S")
    private short field9931;

    @OriginalMember(owner = "client!nk", name = "qb", descriptor = "[B")
    private byte[] field9933;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "[I")
    private int[] field9909;

    @OriginalMember(owner = "client!nk", name = "hb", descriptor = "[[I")
    private int[][] field9924;

    @OriginalMember(owner = "client!nk", name = "ib", descriptor = "[[I")
    private int[][] field9925;

    @OriginalMember(owner = "client!nk", name = "Cb", descriptor = "[[I")
    private int[][] field9945;

    @OriginalMember(owner = "client!nk", name = "jb", descriptor = "Z")
    public static boolean field9926 = false;

    @OriginalMember(owner = "client!nk", name = "Hb", descriptor = "Lms;")
    public static class763 field9950 = new class763("game3", 2);

    @OriginalMember(owner = "client!nk", name = "Ab", descriptor = "B")
    private byte field9943;

    @OriginalMember(owner = "client!nk", name = "Fc", descriptor = "I")
    public static int field10000;

    @OriginalMember(owner = "client!nk", name = "Gc", descriptor = "I")
    public static int field10001;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field9881;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    public static int field9884;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    public static int field9890;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "I")
    public static int field9891;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "I")
    public static int field9895;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    public static int field9896;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "I")
    public static int field9899;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public static int field9903;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    public static int field9907;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field9908;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    public static int field9913;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "I")
    public static int field9917;

    @OriginalMember(owner = "client!nk", name = "eb", descriptor = "I")
    public static int field9921;

    @OriginalMember(owner = "client!nk", name = "gb", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!nk", name = "lb", descriptor = "I")
    public static int field9928;

    @OriginalMember(owner = "client!nk", name = "mb", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!nk", name = "nb", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!nk", name = "tb", descriptor = "I")
    public static int field9936;

    @OriginalMember(owner = "client!nk", name = "ub", descriptor = "I")
    public static int field9937;

    @OriginalMember(owner = "client!nk", name = "vb", descriptor = "I")
    public static int field9938;

    @OriginalMember(owner = "client!nk", name = "yb", descriptor = "I")
    public static int field9941;

    @OriginalMember(owner = "client!nk", name = "zb", descriptor = "I")
    public static int field9942;

    @OriginalMember(owner = "client!nk", name = "Db", descriptor = "I")
    public static int field9946;

    @OriginalMember(owner = "client!nk", name = "Fb", descriptor = "I")
    public static int field9948;

    @OriginalMember(owner = "client!nk", name = "Gb", descriptor = "I")
    public static int field9949;

    @OriginalMember(owner = "client!nk", name = "Jb", descriptor = "I")
    public static int field9952;

    @OriginalMember(owner = "client!nk", name = "Lb", descriptor = "I")
    public static int field9954;

    @OriginalMember(owner = "client!nk", name = "Mb", descriptor = "I")
    public static int field9955;

    @OriginalMember(owner = "client!nk", name = "Nb", descriptor = "I")
    public static int field9956;

    @OriginalMember(owner = "client!nk", name = "Ob", descriptor = "I")
    public static int field9957;

    @OriginalMember(owner = "client!nk", name = "Tb", descriptor = "I")
    public static int field9962;

    @OriginalMember(owner = "client!nk", name = "Ub", descriptor = "I")
    public static int field9963;

    @OriginalMember(owner = "client!nk", name = "Xb", descriptor = "I")
    public static int field9966;

    @OriginalMember(owner = "client!nk", name = "ac", descriptor = "I")
    public static int field9969;

    @OriginalMember(owner = "client!nk", name = "cc", descriptor = "I")
    public static int field9971;

    @OriginalMember(owner = "client!nk", name = "dc", descriptor = "I")
    public static int field9972;

    @OriginalMember(owner = "client!nk", name = "ec", descriptor = "I")
    public static int field9973;

    @OriginalMember(owner = "client!nk", name = "hc", descriptor = "I")
    public static int field9976;

    @OriginalMember(owner = "client!nk", name = "ic", descriptor = "I")
    public static int field9977;

    @OriginalMember(owner = "client!nk", name = "lc", descriptor = "I")
    public static int field9980;

    @OriginalMember(owner = "client!nk", name = "mc", descriptor = "I")
    public static int field9981;

    @OriginalMember(owner = "client!nk", name = "oc", descriptor = "I")
    public static int field9983;

    @OriginalMember(owner = "client!nk", name = "pc", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!nk", name = "qc", descriptor = "I")
    public static int field9985;

    @OriginalMember(owner = "client!nk", name = "tc", descriptor = "I")
    public static int field9988;

    @OriginalMember(owner = "client!nk", name = "vc", descriptor = "I")
    public static int field9990;

    @OriginalMember(owner = "client!nk", name = "wc", descriptor = "I")
    public static int field9991;

    @OriginalMember(owner = "client!nk", name = "xc", descriptor = "I")
    public static int field9992;

    @OriginalMember(owner = "client!nk", name = "yc", descriptor = "I")
    public static int field9993;

    @OriginalMember(owner = "client!nk", name = "zc", descriptor = "I")
    public static int field9994;

    @OriginalMember(owner = "client!nk", name = "Ac", descriptor = "I")
    public static int field9995;

    @OriginalMember(owner = "client!nk", name = "Bc", descriptor = "I")
    public static int field9996;

    @OriginalMember(owner = "client!nk", name = "Dc", descriptor = "I")
    public static int field9998;

    @OriginalMember(owner = "client!nk", name = "uc", descriptor = "Las;")
    private class154 field9989;

    @OriginalMember(owner = "client!nk", name = "pb", descriptor = "Lcs;")
    private class345 field9932;

    @OriginalMember(owner = "client!nk", name = "Sb", descriptor = "Lom;")
    private class377 field9961;

    @OriginalMember(owner = "client!nk", name = "kc", descriptor = "Ljava/lang/String;")
    public static String field9979;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "S")
    private short field9904;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "S")
    private short field9910;

    @OriginalMember(owner = "client!nk", name = "Ib", descriptor = "S")
    private short field9951;

    @OriginalMember(owner = "client!nk", name = "Rb", descriptor = "S")
    private short field9960;

    @OriginalMember(owner = "client!nk", name = "Vb", descriptor = "S")
    private short field9964;

    @OriginalMember(owner = "client!nk", name = "Wb", descriptor = "S")
    private short field9965;

    @OriginalMember(owner = "client!nk", name = "Zb", descriptor = "S")
    private short field9968;

    @OriginalMember(owner = "client!nk", name = "rc", descriptor = "S")
    private short field9986;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V", line = 3)
    private final void method4016(int arg0) {
        if (this.field9883 != null) {
            class288 var2 = this.field9919.field8946;
            this.field9919.method3668(0);
            this.field9919.method493(!this.field9935);
            this.field9919.method3628(false, arg0 ^ 0xFFFF87D3);
            this.field9919.method3593(32886, this.field9919.field9067, this.field9919.field9047, null, null);
            for (int var3 = 0; var3 < this.field9918; var3++) {
                class153 var4 = this.field9883[var3];
                class524 var5 = this.field9887[var3];
                if (!var4.field2352 || !this.field9919.method459()) {
                    float var6 = (float) (this.field9974[var4.field2355] + this.field9974[var4.field2347] + this.field9974[var4.field2348]) * 0.3333333F;
                    float var7 = (float) (this.field9894[var4.field2355] + this.field9894[var4.field2347] + this.field9894[var4.field2348]) * 0.3333333F;
                    float var8 = (float) (this.field9911[var4.field2348] + this.field9911[var4.field2347] + this.field9911[var4.field2355]) * 0.3333333F;
                    float var9 = class69.field843 * var8 + class719.field10022 * var7 + class123.field2066 * var6 + class278.field3910;
                    float var10 = class181.field2731 * var8 + class534.field7040 * var7 + class14.field206 * var6 + class524.field6956;
                    float var11 = class733.field10145 * var8 + class278.field3878 * var6 + class204.field3062 * var7 + class701.field9734;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field2354;
                    var2.method1789(false, var10 * var12 + ((float) var5.field6950 - var10), (float) var5.field6949 + var9 - var9 * var12, var11 * var12 - var11, var4.field2344 * var5.field6951 >> 7, var5.field6957, var4.field2356 * var5.field6952 >> 7);
                    this.field9919.method3598(var2, (byte) 70);
                    int var13 = var5.field6958;
                    OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                    this.field9919.method3632(var4.field2351, (byte) 105);
                    this.field9919.method3635(arg0 - 30803, var4.field2346);
                    this.field9919.method3626(7, 24873, 4, 0);
                }
            }
            this.field9919.method493(true);
            this.field9919.method3590(true);
        }
        field9891++;
        if (arg0 != 30803) {
            this.field9892 = 49;
        }
    }

    @OriginalMember(owner = "client!nk", name = "LA", descriptor = "(I)V", line = 63)
    public final void method156(int arg0) {
        this.field9931 = (short) arg0;
        if (this.field9893 != null) {
            this.field9893.field7506 = null;
        }
        field9936++;
        if (this.field9934 != null) {
            this.field9934.field7506 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "()V", line = 81)
    public final void method187() {
        field9991++;
    }

    @OriginalMember(owner = "client!nk", name = "ia", descriptor = "(SS)V", line = 91)
    public final void method206(short arg0, short arg1) {
        field9895++;
        for (int var3 = 0; var3 < this.field9897; var3++) {
            if (this.field9978[var3] == arg0) {
                this.field9978[var3] = arg1;
            }
        }
        if (this.field9883 != null) {
            for (int var4 = 0; var4 < this.field9918; var4++) {
                class153 var5 = this.field9883[var4];
                class524 var6 = this.field9887[var4];
                var6.field6958 = class169.field2606[this.field9978[var5.field2350] & 0xFFFF] & 0xFFFFFF | var6.field6958 & 0xFF000000;
            }
        }
        if (this.field9893 != null) {
            this.field9893.field7506 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "()Z", line = 132)
    public final boolean method192() {
        field9976++;
        return this.field9927;
    }

    @OriginalMember(owner = "client!nk", name = "VA", descriptor = "(I)V", line = 141)
    public final void method210(int arg0) {
        field9981++;
        int var2 = class451.field6174[arg0];
        int var3 = class451.field6177[arg0];
        for (int var4 = 0; var4 < this.field9940; var4++) {
            int var5 = this.field9894[var4] * var2 + (this.field9974[var4] * var3) >> 14;
            this.field9894[var4] = this.field9894[var4] * var3 - (this.field9974[var4] * var2) >> 14;
            this.field9974[var4] = var5;
        }
        this.field9982 = false;
        if (this.field9947 != null) {
            this.field9947.field7506 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "na", descriptor = "()I", line = 172)
    public final int method209() {
        if (!this.field9982) {
            this.method4024(29866);
        }
        field9902++;
        return this.field9951;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V", line = 184)
    private final void method4017(byte arg0) {
        field9983++;
        if (!this.field9920) {
            return;
        }
        this.field9920 = false;
        if (this.field9922 == null && this.field9970 == null && this.field9883 == null) {
            if (this.field9974 != null && !class573.method3154(this.field9958, this.field9915, arg0 + 86)) {
                if (this.field9947 != null && this.field9947.field7506 == null) {
                    this.field9920 = true;
                } else {
                    if (!this.field9982) {
                        this.method4024(29866);
                    }
                    this.field9974 = null;
                }
            }
            if (this.field9894 != null && !class721.method4052((byte) 109, this.field9915, this.field9958)) {
                if (this.field9947 != null && this.field9947.field7506 == null) {
                    this.field9920 = true;
                } else {
                    if (!this.field9982) {
                        this.method4024(arg0 ^ 0xFFFF8B18);
                    }
                    this.field9894 = null;
                }
            }
            if (this.field9911 != null && !class712.method4001(arg0 - 7035, this.field9915, this.field9958)) {
                if (this.field9947 != null && this.field9947.field7506 == null) {
                    this.field9920 = true;
                } else {
                    if (!this.field9982) {
                        this.method4024(29866);
                    }
                    this.field9911 = null;
                }
            }
        }
        if (this.field9959 != null && this.field9974 == null && this.field9894 == null && this.field9911 == null) {
            this.field9901 = null;
            this.field9959 = null;
        }
        if (this.field9933 != null && !class753.method4217(this.field9958, this.field9915, 65536)) {
            if (this.field9934 == null) {
                if (this.field9893 != null && this.field9893.field7506 == null) {
                    this.field9920 = true;
                } else {
                    this.field9997 = this.field9999 = this.field9953 = null;
                    this.field9933 = null;
                }
            } else if (this.field9934.field7506 == null) {
                this.field9920 = true;
            } else {
                this.field9997 = this.field9999 = this.field9953 = null;
                this.field9933 = null;
            }
        }
        if (this.field9978 != null && !class78.method625(this.field9958, -19107, this.field9915)) {
            if (this.field9893 != null && this.field9893.field7506 == null) {
                this.field9920 = true;
            } else {
                this.field9978 = null;
            }
        }
        if (arg0 != -78) {
            this.method172();
        }
        if (this.field9916 != null && !class155.method1122(this.field9958, false, this.field9915)) {
            if (this.field9893 != null && this.field9893.field7506 == null) {
                this.field9920 = true;
            } else {
                this.field9916 = null;
            }
        }
        if (this.field9944 != null && !class217.method1408(this.field9915, this.field9958, (byte) -113)) {
            if (this.field9987 != null && this.field9987.field7506 == null) {
                this.field9920 = true;
            } else {
                this.field9944 = this.field9912 = null;
            }
        }
        if (this.field9880 != null && !class204.method1368(this.field9915, -27679, this.field9958)) {
            if (this.field9893 != null && this.field9893.field7506 == null) {
                this.field9920 = true;
            } else {
                this.field9880 = null;
            }
        }
        if (this.field9905 != null && !class306.method1894(this.field9958, this.field9915, 117)) {
            if ((this.field9906 == null || this.field9906.field3862 != null) && (this.field9893 == null || this.field9893.field7506 != null)) {
                this.field9905 = this.field9967 = this.field9888 = null;
            } else {
                this.field9920 = true;
            }
        }
        if (this.field9945 != null && !class571.method3147(this.field9958, -58, this.field9915)) {
            this.field9975 = null;
            this.field9945 = null;
        }
        if (this.field9924 != null && !class384.method2273(96, this.field9958, this.field9915)) {
            this.field9885 = null;
            this.field9924 = null;
        }
        if (this.field9925 != null && !class442.method2545(this.field9915, this.field9958, (byte) -124)) {
            this.field9925 = null;
        }
        if (this.field9909 != null && (this.field9958 & 0x800) == 0 && (this.field9958 & 0x40000) == 0) {
            this.field9909 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V", line = 358)
    public static void method4018(boolean arg0) {
        field9950 = null;
        if (arg0) {
            method4018(true);
        }
        field9979 = null;
    }

    @OriginalMember(owner = "client!nk", name = "aa", descriptor = "(SS)V", line = 372)
    public final void method152(short arg0, short arg1) {
        field9956++;
        class152 var3 = this.field9919.field717;
        for (int var4 = 0; var4 < this.field9897; var4++) {
            if (this.field9880[var4] == arg0) {
                this.field9880[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class758 var7 = var3.method91(arg0 & 0xFFFF, (byte) 124);
            var5 = var7.field10542;
            var6 = var7.field10537;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class758 var10 = var3.method91(arg1 & 0xFFFF, (byte) 126);
            var8 = var10.field10542;
            if (var10.field10555 != 0 || var10.field10554 != 0) {
                this.field9927 = true;
            }
            var9 = var10.field10537;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field9883 != null) {
            for (int var11 = 0; var11 < this.field9918; var11++) {
                class153 var12 = this.field9883[var11];
                class524 var13 = this.field9887[var11];
                var13.field6958 = class169.field2606[this.field9978[var12.field2350] & 0xFFFF] & 0xFFFFFF | var13.field6958 & 0xFF000000;
            }
        }
        if (this.field9893 != null) {
            this.field9893.field7506 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lofa;Lvh;II)V", line = 456)
    public final void method160(class333 arg0, class364 arg1, int arg2, int arg3) {
        field9884++;
        if (this.field9898 == 0) {
            return;
        }
        class288 var5 = this.field9919.field8981;
        if (!this.field9982) {
            this.method4024(29866);
        }
        class288 var6 = (class288) arg0;
        class204.field3062 = var5.field4101 * var6.field4099 + var5.field4099 * var6.field4080 + var5.field4083 * var6.field4092;
        class701.field9734 = var5.field4101 * var6.field4105 + var5.field4099 * var6.field4078 + var5.field4083 * var6.field4088 + var5.field4105;
        float var7 = (float) this.field9964 * class204.field3062 + class701.field9734;
        float var8 = (float) this.field9986 * class204.field3062 + class701.field9734;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var10 = var8 - (float) this.field9951;
            var9 = (float) this.field9951 + var7;
        } else {
            var9 = (float) this.field9951 + var8;
            var10 = (float) (-this.field9951) + var7;
        }
        if ((var10 >= this.field9919.field9093) || ((float) this.field9919.field9046 >= var9)) {
            return;
        }
        class278.field3910 = var5.field4093 * var6.field4105 + var5.field4102 * var6.field4088 + var5.field4092 * var6.field4078 + var5.field4088;
        class719.field10022 = var5.field4093 * var6.field4099 + var5.field4102 * var6.field4092 + var5.field4092 * var6.field4080;
        float var11 = (float) this.field9964 * class719.field10022 + class278.field3910;
        float var12 = (float) this.field9986 * class719.field10022 + class278.field3910;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = ((float) this.field9951 + var11) * (float) this.field9919.field9013;
            var14 = (var12 - (float) this.field9951) * (float) this.field9919.field9013;
        } else {
            var14 = (var11 - (float) this.field9951) * (float) this.field9919.field9013;
            var13 = ((float) this.field9951 + var12) * (float) this.field9919.field9013;
        }
        if ((this.field9919.field8993 <= var14 / (float) arg2) || (var13 / (float) arg2 <= this.field9919.field9065)) {
            return;
        }
        class524.field6956 = var5.field4094 * var6.field4105 + var5.field4080 * var6.field4078 + var5.field4069 * var6.field4088 + var5.field4078;
        class534.field7040 = var5.field4094 * var6.field4099 + var5.field4080 * var6.field4080 + var5.field4069 * var6.field4092;
        float var15 = (float) this.field9964 * class534.field7040 + class524.field6956;
        float var16 = (float) this.field9986 * class534.field7040 + class524.field6956;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var18 = ((float) (-this.field9951) + var16) * (float) this.field9919.field9012;
            var17 = ((float) this.field9951 + var15) * (float) this.field9919.field9012;
        } else {
            var17 = ((float) this.field9951 + var16) * (float) this.field9919.field9012;
            var18 = ((float) (-this.field9951) + var15) * (float) this.field9919.field9012;
        }
        if ((var18 / (float) arg2 >= this.field9919.field9049) || (this.field9919.field9089 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field9883 != null) {
            class181.field2731 = var5.field4094 * var6.field4101 + var5.field4080 * var6.field4094 + var5.field4069 * var6.field4093;
            class123.field2066 = var5.field4093 * var6.field4083 + var5.field4102 * var6.field4102 + var5.field4092 * var6.field4069;
            class69.field843 = var5.field4093 * var6.field4101 + var5.field4102 * var6.field4093 + var5.field4092 * var6.field4094;
            class733.field10145 = var5.field4101 * var6.field4101 + var5.field4099 * var6.field4094 + var5.field4083 * var6.field4093;
            class278.field3878 = var5.field4101 * var6.field4083 + var5.field4099 * var6.field4069 + var5.field4083 * var6.field4102;
            class14.field206 = var5.field4094 * var6.field4083 + var5.field4080 * var6.field4069 + var5.field4069 * var6.field4102;
        }
        if (arg1 != null) {
            int var19 = this.field9960 + this.field9904 >> 1;
            int var20 = this.field9968 + this.field9965 >> 1;
            int var21 = (int) ((float) var20 * class69.field843 + (float) this.field9964 * class719.field10022 + (float) var19 * class123.field2066 + class278.field3910);
            int var22 = (int) ((float) var20 * class181.field2731 + (float) this.field9964 * class534.field7040 + (float) var19 * class14.field206 + class524.field6956);
            int var23 = (int) ((float) var20 * class733.field10145 + (float) this.field9964 * class204.field3062 + (float) var19 * class278.field3878 + class701.field9734);
            int var24 = (int) ((float) var20 * class69.field843 + (float) this.field9986 * class719.field10022 + (float) var19 * class123.field2066 + class278.field3910);
            int var25 = (int) ((float) var20 * class181.field2731 + (float) this.field9986 * class534.field7040 + (float) var19 * class14.field206 + class524.field6956);
            arg1.field5120 = this.field9919.field9039 + (this.field9919.field9013 * var24 / arg2);
            arg1.field5121 = this.field9919.field9012 * var22 / arg2 + this.field9919.field9082;
            arg1.field5122 = this.field9919.field9039 + (this.field9919.field9013 * var21 / arg2);
            arg1.field5118 = this.field9919.field9012 * var25 / arg2 + this.field9919.field9082;
            int var26 = (int) ((float) var20 * class733.field10145 + (float) this.field9986 * class204.field3062 + (float) var19 * class278.field3878 + class701.field9734);
            if (this.field9919.field9046 <= var23 || this.field9919.field9046 <= var26) {
                arg1.field5117 = true;
                arg1.field5119 = (this.field9951 + var21) * this.field9919.field9013 / arg2 + this.field9919.field9039 - arg1.field5122;
            }
        }
        this.field9919.method3617((float) arg2, false);
        this.field9919.method3604(-105);
        this.field9919.method3595(var6, 28727);
        this.method4023(3227);
        this.field9919.method3590(true);
        this.method4016(30803);
    }

    @OriginalMember(owner = "client!nk", name = "WA", descriptor = "()I", line = 602)
    public final int method213() {
        field9923++;
        return this.field9939;
    }

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "(IIII)V", line = 612)
    public final void method179(int arg0, int arg1, int arg2, int arg3) {
        field9984++;
        if (arg0 == 0) {
            class519.field6924 = 0;
            class97.field1202 = 0;
            class113.field1863 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field9940; var6++) {
                class113.field1863 += this.field9974[var6];
                class97.field1202 += this.field9894[var6];
                class519.field6924 += this.field9911[var6];
                var5++;
            }
            if (var5 <= 0) {
                class97.field1202 = arg2;
                class113.field1863 = arg1;
                class519.field6924 = arg3;
            } else {
                class113.field1863 = class113.field1863 / var5 + arg1;
                class97.field1202 = class97.field1202 / var5 + arg2;
                class519.field6924 = class519.field6924 / var5 + arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field9940; var7++) {
                this.field9974[var7] += arg1;
                this.field9894[var7] += arg2;
                this.field9911[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field9940; var8++) {
                this.field9974[var8] -= class113.field1863;
                this.field9894[var8] -= class97.field1202;
                this.field9911[var8] -= class519.field6924;
                if (arg3 != 0) {
                    int var9 = class451.field6174[arg3];
                    int var10 = class451.field6177[arg3];
                    int var11 = this.field9974[var8] * var10 + this.field9894[var8] * var9 + 16383 >> 14;
                    this.field9894[var8] = this.field9894[var8] * var10 + 16383 - (this.field9974[var8] * var9) >> 14;
                    this.field9974[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class451.field6174[arg1];
                    int var13 = class451.field6177[arg1];
                    int var14 = this.field9894[var8] * var13 + 16383 - this.field9911[var8] * var12 >> 14;
                    this.field9911[var8] = this.field9911[var8] * var13 + this.field9894[var8] * var12 + 16383 >> 14;
                    this.field9894[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class451.field6174[arg2];
                    int var16 = class451.field6177[arg2];
                    int var17 = this.field9911[var8] * var15 + (this.field9974[var8] * var16) + 16383 >> 14;
                    this.field9911[var8] = this.field9911[var8] * var16 + 16383 - (this.field9974[var8] * var15) >> 14;
                    this.field9974[var8] = var17;
                }
                this.field9974[var8] += class113.field1863;
                this.field9894[var8] += class97.field1202;
                this.field9911[var8] += class519.field6924;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field9940; var18++) {
                this.field9974[var18] -= class113.field1863;
                this.field9894[var18] -= class97.field1202;
                this.field9911[var18] -= class519.field6924;
                this.field9974[var18] = this.field9974[var18] * arg1 / 128;
                this.field9894[var18] = this.field9894[var18] * arg2 / 128;
                this.field9911[var18] = this.field9911[var18] * arg3 / 128;
                this.field9974[var18] += class113.field1863;
                this.field9894[var18] += class97.field1202;
                this.field9911[var18] += class519.field6924;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field9897; var19++) {
                int var23 = (this.field9916[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field9916[var19] = (byte) var23;
            }
            if (this.field9893 != null) {
                this.field9893.field7506 = null;
            }
            if (this.field9883 != null) {
                for (int var20 = 0; var20 < this.field9918; var20++) {
                    class153 var21 = this.field9883[var20];
                    class524 var22 = this.field9887[var20];
                    var22.field6958 = var22.field6958 & 0xFFFFFF | 255 - (this.field9916[var21.field2350] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field9897; var24++) {
                int var28 = this.field9978[var24] & 0xFFFF;
                int var29 = (var28 & 0xFD56) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg2 / 4 + var30;
                int var32 = arg1 + var29 & 0x3F;
                int var33 = var28 & 0x7F;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                int var34 = arg3 + var33;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field9978[var24] = (short) class446.method2556(var34, class446.method2556(var32 << 10, var31 << 7));
            }
            if (this.field9893 != null) {
                this.field9893.field7506 = null;
            }
            if (this.field9883 != null) {
                for (int var25 = 0; var25 < this.field9918; var25++) {
                    class153 var26 = this.field9883[var25];
                    class524 var27 = this.field9887[var25];
                    var27.field6958 = class169.field2606[this.field9978[var26.field2350] & 0xFFFF] & 0xFFFFFF | var27.field6958 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field9918; var35++) {
                class524 var36 = this.field9887[var35];
                var36.field6949 += arg1;
                var36.field6950 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field9918; var37++) {
                class524 var38 = this.field9887[var37];
                var38.field6951 = var38.field6951 * arg2 >> 7;
                var38.field6952 = var38.field6952 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field9918; var39++) {
                class524 var40 = this.field9887[var39];
                var40.field6957 = var40.field6957 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()Z", line = 922)
    public final boolean method172() {
        field9941++;
        if (this.field9880 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field9880.length; var1++) {
            if (this.field9880[var1] != -1 && !this.field9919.field717.method85(this.field9880[var1], -32345)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nk", name = "fa", descriptor = "()I", line = 945)
    public final int method180() {
        if (!this.field9982) {
            this.method4024(29866);
        }
        field9900++;
        return this.field9964;
    }

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "()I", line = 959)
    public final int method211() {
        if (!this.field9982) {
            this.method4024(29866);
        }
        field9899++;
        return this.field9960;
    }

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "(IILs;Ls;III)V", line = 971)
    public final void method207(int arg0, int arg1, class282 arg2, class282 arg3, int arg4, int arg5, int arg6) {
        if (!this.field9982) {
            this.method4024(29866);
        }
        field9908++;
        int var8 = this.field9960 + arg4;
        int var9 = this.field9904 + arg4;
        int var10 = arg6 + this.field9968;
        int var11 = arg6 + this.field9965;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3992 <= var9 + arg2.field3989 >> arg2.field3990 || var10 < 0 || arg2.field3989 + var11 >> arg2.field3990 >= arg2.field3996) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field3992 <= arg3.field3989 + var9 >> arg3.field3990 || var10 < 0 || var11 + arg3.field3989 >> arg3.field3990 >= arg3.field3996) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3990;
            int var13 = var9 - (1 - arg2.field3989) >> arg2.field3990;
            int var14 = var10 >> arg2.field3990;
            int var15 = var11 + arg2.field3989 - 1 >> arg2.field3990;
            if (arg5 == arg2.method1742(var12, 109, var14) && arg5 == arg2.method1742(var13, 78, var14) && arg2.method1742(var12, 64, var15) == arg5 && arg2.method1742(var13, 64, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field9940; var32++) {
                this.field9894[var32] = (this.field9894[var32] + arg2.method1750((byte) 121, this.field9974[var32] + arg4, this.field9911[var32] + arg6)) - arg5;
            }
        } else if (arg0 == 2) {
            short var16 = this.field9964;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field9940; var17++) {
                int var18 = (this.field9894[var17] << 16) / var16;
                if (var18 < arg1) {
                    this.field9894[var17] += (arg2.method1750((byte) 112, this.field9974[var17] + arg4, this.field9911[var17] + arg6) - arg5) * (arg1 - var18) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var19 = (arg1 & 0xFF) * 4;
            int var20 = (arg1 >> 8 & 0xFF) * 4;
            int var21 = (arg1 >> 16 & 0xFF) << 6;
            int var22 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var19 >> 1)) < 0 || arg2.field3992 << arg2.field3990 <= (var19 >> 1) + arg4 + arg2.field3989 || (arg6 - (var20 >> 1)) < 0 || (arg6 - (-(var20 >> 1) - arg2.field3989)) >= (arg2.field3996 << arg2.field3990)) {
                return;
            }
            this.method2678(arg2, var21, arg6, arg4, var19, 0, var22, arg5, var20);
        } else if (arg0 == 4) {
            int var30 = this.field9986 - this.field9964;
            for (int var31 = 0; var31 < this.field9940; var31++) {
                this.field9894[var31] = this.field9894[var31] + arg3.method1750((byte) 100, this.field9974[var31] + arg4, this.field9911[var31] + arg6) + var30 - arg5;
            }
        } else if (arg0 == 5) {
            int var23 = this.field9986 - this.field9964;
            for (int var24 = 0; var24 < this.field9940; var24++) {
                int var25 = this.field9974[var24] + arg4;
                int var26 = this.field9911[var24] + arg6;
                int var27 = arg2.method1750((byte) 109, var25, var26);
                int var28 = arg3.method1750((byte) 105, var25, var26);
                int var29 = var27 - arg1 - var28;
                this.field9894[var24] = ((this.field9894[var24] << 8) / var23 * var29 >> 8) + (var27 - arg5);
            }
        }
        if (this.field9947 != null) {
            this.field9947.field7506 = null;
        }
        this.field9982 = false;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)V", line = 1126)
    public final void method199(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field9897; var5++) {
            int var9 = this.field9978[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field9978[var5] = (short) class446.method2556(var12, class446.method2556(var11 << 7, var10 << 10));
        }
        field9921++;
        if (this.field9883 != null) {
            for (int var6 = 0; var6 < this.field9918; var6++) {
                class153 var7 = this.field9883[var6];
                class524 var8 = this.field9887[var6];
                var8.field6958 = var8.field6958 & 0xFF000000 | class169.field2606[this.field9978[var7.field2350] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field9893 != null) {
            this.field9893.field7506 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "()[Lhi;", line = 1186)
    public final class207[] method195() {
        field9985++;
        return this.field9970;
    }

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "(III)V", line = 1199)
    public final void method188(int arg0, int arg1, int arg2) {
        field9917++;
        for (int var4 = 0; var4 < this.field9940; var4++) {
            if (arg0 != 0) {
                this.field9974[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field9894[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field9911[var4] += arg2;
            }
        }
        this.field9982 = false;
        if (this.field9947 != null) {
            this.field9947.field7506 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "()Z", line = 1233)
    public final boolean method159() {
        field9994++;
        return this.field9935;
    }

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "(I[IIIIZI[I)V", line = 1241)
    public final void method165(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field9955++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = arg3 << 4;
            class113.field1863 = 0;
            class519.field6924 = 0;
            int var13 = 0;
            class97.field1202 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field9924.length > var15) {
                    int[] var16 = this.field9924[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field9885 == null || (this.field9885[var18] & arg6) != 0) {
                            class113.field1863 += this.field9974[var18];
                            class97.field1202 += this.field9894[var18];
                            var13++;
                            class519.field6924 += this.field9911[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class97.field1202 = class97.field1202 / var13 + var12;
                class113.field1863 = class113.field1863 / var13 + var11;
                class34.field510 = true;
                class519.field6924 = class519.field6924 / var13 + var10;
            } else {
                class113.field1863 = var11;
                class97.field1202 = var12;
                class519.field6924 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
                int var20 = arg7[3] * arg2 + arg7[4] * arg3 + (arg7[5] * arg4) + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
                arg4 = var21;
                arg2 = var19;
                arg3 = var20;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field9924.length) {
                    int[] var27 = this.field9924[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field9885 == null || (this.field9885[var29] & arg6) != 0) {
                            this.field9974[var29] += var23;
                            this.field9894[var29] += var22;
                            this.field9911[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field9924.length) {
                        int[] var50 = this.field9924[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field9885 == null || (arg6 & this.field9885[var52]) != 0) {
                                this.field9974[var52] -= class113.field1863;
                                this.field9894[var52] -= class97.field1202;
                                this.field9911[var52] -= class519.field6924;
                                if (arg4 != 0) {
                                    int var53 = class451.field6174[arg4];
                                    int var54 = class451.field6177[arg4];
                                    int var55 = this.field9894[var52] * var53 - (-(this.field9974[var52] * var54) - 16383) >> 14;
                                    this.field9894[var52] = this.field9894[var52] * var54 + 16383 - (this.field9974[var52] * var53) >> 14;
                                    this.field9974[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class451.field6174[arg2];
                                    int var57 = class451.field6177[arg2];
                                    int var58 = this.field9894[var52] * var57 + 16383 - (this.field9911[var52] * var56) >> 14;
                                    this.field9911[var52] = this.field9911[var52] * var57 + this.field9894[var52] * var56 + 16383 >> 14;
                                    this.field9894[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class451.field6174[arg3];
                                    int var60 = class451.field6177[arg3];
                                    int var61 = this.field9911[var52] * var59 + (this.field9974[var52] * var60) + 16383 >> 14;
                                    this.field9911[var52] = this.field9911[var52] * var60 + 16383 - (this.field9974[var52] * var59) >> 14;
                                    this.field9974[var52] = var61;
                                }
                                this.field9974[var52] += class113.field1863;
                                this.field9894[var52] += class97.field1202;
                                this.field9911[var52] += class519.field6924;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field9924.length > var32) {
                            int[] var33 = this.field9924[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field9885 == null || (this.field9885[var35] & arg6) != 0) {
                                    int var36 = this.field9901[var35];
                                    int var37 = this.field9901[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field9959[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class451.field6174[arg4];
                                            int var41 = class451.field6177[arg4];
                                            int var42 = this.field9997[var39] * var41 + (this.field9999[var39] * var40 + 16383) >> 14;
                                            this.field9999[var39] = (short) (this.field9999[var39] * var41 + 16383 - (this.field9997[var39] * var40) >> 14);
                                            this.field9997[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class451.field6174[arg2];
                                            int var44 = class451.field6177[arg2];
                                            int var45 = this.field9999[var39] * var44 + 16383 - (this.field9953[var39] * var43) >> 14;
                                            this.field9953[var39] = (short) (this.field9999[var39] * var43 + this.field9953[var39] * var44 + 16383 >> 14);
                                            this.field9999[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class451.field6174[arg3];
                                            int var47 = class451.field6177[arg3];
                                            int var48 = this.field9997[var39] * var47 + this.field9953[var39] * var46 + 16383 >> 14;
                                            this.field9953[var39] = (short) (this.field9953[var39] * var47 + 16383 - (this.field9997[var39] * var46) >> 14);
                                            this.field9997[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field9934 == null && this.field9893 != null) {
                        this.field9893.field7506 = null;
                    }
                    if (this.field9934 != null) {
                        this.field9934.field7506 = null;
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
                if (class34.field510) {
                    int var68 = arg7[3] * class97.field1202 + (arg7[0] * class113.field1863 + (arg7[6] * class519.field6924)) + 8192 >> 14;
                    int var69 = arg7[1] * class113.field1863 + 8192 - (-(arg7[4] * class97.field1202) - arg7[7] * class519.field6924) >> 14;
                    int var70 = var65 + var68;
                    int var71 = var66 + var69;
                    int var72 = arg7[2] * class113.field1863 + arg7[8] * class519.field6924 + (arg7[5] * class97.field1202) + 8192 >> 14;
                    class113.field1863 = var70;
                    int var73 = var67 + var72;
                    class97.field1202 = var71;
                    class34.field510 = false;
                    class519.field6924 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class451.field6177[arg2];
                int var76 = class451.field6174[arg2];
                int var77 = class451.field6177[arg3];
                int var78 = class451.field6174[arg3];
                int var79 = class451.field6177[arg4];
                int var80 = class451.field6174[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[1] = var78 * var81 + (-var77 * var80 + 8192) >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                var74[7] = var78 * var80 + var77 * var81 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[5] = -var76;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[0] = var77 * var79 + (var78 * var82) + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                int var83 = var74[0] * -class113.field1863 + (var74[1] * -class97.field1202) + var74[2] * -class519.field6924 + 8192 >> 14;
                int var84 = var74[4] * -class97.field1202 + (var74[3] * -class113.field1863 + (var74[5] * -class519.field6924)) + 8192 >> 14;
                int var85 = var74[6] * -class113.field1863 + var74[7] * -class97.field1202 + (var74[8] * -class519.field6924) + 8192 >> 14;
                int var86 = class113.field1863 + var83;
                int var87 = var84 + class97.field1202;
                int var88 = class519.field6924 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[0] * var65 + 8192 - (-(var74[1] * var66) + -(var74[2] * var67)) >> 14;
                int var92 = var74[3] * var65 + var74[5] * var67 + var74[4] * var66 + 8192 >> 14;
                int var93 = var87 + var92;
                int var94 = var86 + var91;
                int var95 = var74[7] * var66 + var74[6] * var65 - (-(var74[8] * var67) - 8192) >> 14;
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
                int var99 = arg7[1] * var93 + arg7[0] * var94 + arg7[2] * var96 + 8192 >> 14;
                int var100 = arg7[5] * var96 + (arg7[3] * var94 + (arg7[4] * var93)) + 8192 >> 14;
                int var101 = var62 + var99;
                int var102 = arg7[6] * var94 + arg7[7] * var93 + arg7[8] * var96 + 8192 >> 14;
                int var103 = var63 + var100;
                int var104 = var64 + var102;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field9924.length > var106) {
                        int[] var107 = this.field9924[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field9885 == null || (arg6 & this.field9885[var109]) != 0) {
                                int var110 = this.field9974[var109] * var97[0] + this.field9911[var109] * var97[2] + this.field9894[var109] * var97[1] + 8192 >> 14;
                                int var111 = this.field9894[var109] * var97[4] + (this.field9974[var109] * var97[3] - (-(this.field9911[var109] * var97[5]) - 8192)) >> 14;
                                int var112 = var103 + var111;
                                int var113 = var101 + var110;
                                int var114 = this.field9974[var109] * var97[6] + this.field9894[var109] * var97[7] + this.field9911[var109] * var97[8] + 8192 >> 14;
                                int var115 = var104 + var114;
                                this.field9974[var109] = var113;
                                this.field9894[var109] = var112;
                                this.field9911[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field9924.length) {
                        int[] var124 = this.field9924[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field9885 == null || (arg6 & this.field9885[var126]) != 0) {
                                this.field9974[var126] -= class113.field1863;
                                this.field9894[var126] -= class97.field1202;
                                this.field9911[var126] -= class519.field6924;
                                this.field9974[var126] = this.field9974[var126] * arg2 >> 7;
                                this.field9894[var126] = this.field9894[var126] * arg3 >> 7;
                                this.field9911[var126] = this.field9911[var126] * arg4 >> 7;
                                this.field9974[var126] += class113.field1863;
                                this.field9894[var126] += class97.field1202;
                                this.field9911[var126] += class519.field6924;
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
                if (class34.field510) {
                    int var133 = arg7[3] * class97.field1202 + (arg7[0] * class113.field1863 - (-(arg7[6] * class519.field6924) - 8192)) >> 14;
                    int var134 = arg7[1] * class113.field1863 + (arg7[4] * class97.field1202 + (arg7[7] * class519.field6924) + 8192) >> 14;
                    int var135 = arg7[8] * class519.field6924 + arg7[5] * class97.field1202 + arg7[2] * class113.field1863 + 8192 >> 14;
                    int var136 = var130 + var133;
                    int var137 = var131 + var134;
                    int var138 = var132 + var135;
                    class113.field1863 = var136;
                    class97.field1202 = var137;
                    class34.field510 = false;
                    class519.field6924 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class113.field1863 * var139 + 8192 >> 14;
                int var143 = -class97.field1202 * var140 + 8192 >> 14;
                int var144 = -class519.field6924 * var141 + 8192 >> 14;
                int var145 = class113.field1863 + var142;
                int var146 = class97.field1202 + var143;
                int var147 = var144 + class519.field6924;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var145 + var149;
                int var152 = var146 + var150;
                int var153 = var132 * var141 + 8192 >> 14;
                int var154 = var147 + var153;
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
                int var157 = arg7[1] * var152 + arg7[0] * var151 + (arg7[2] * var154) + 8192 >> 14;
                int var158 = arg7[3] * var151 + arg7[4] * var152 + (arg7[5] * var154) + 8192 >> 14;
                int var159 = arg7[7] * var152 + arg7[8] * var154 + arg7[6] * var151 + 8192 >> 14;
                int var160 = var127 + var157;
                int var161 = var128 + var158;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field9924.length > var164) {
                        int[] var165 = this.field9924[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field9885 == null || (this.field9885[var167] & arg6) != 0) {
                                int var168 = this.field9974[var167] * var155[0] + this.field9894[var167] * var155[1] - (-(this.field9911[var167] * var155[2]) - 8192) >> 14;
                                int var169 = this.field9974[var167] * var155[3] + 8192 - (-(this.field9894[var167] * var155[4]) - this.field9911[var167] * var155[5]) >> 14;
                                int var170 = this.field9974[var167] * var155[6] + this.field9894[var167] * var155[7] + this.field9911[var167] * var155[8] + 8192 >> 14;
                                int var171 = var161 + var169;
                                int var172 = var160 + var168;
                                int var173 = var162 + var170;
                                this.field9974[var167] = var172;
                                this.field9894[var167] = var171;
                                this.field9911[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field9945 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field9945.length) {
                        int[] var182 = this.field9945[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field9975 == null || (arg6 & this.field9975[var184]) != 0) {
                                int var185 = (this.field9916[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field9916[var184] = (byte) var185;
                                if (this.field9893 != null) {
                                    this.field9893.field7506 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field9883 != null) {
                    for (int var178 = 0; var178 < this.field9918; var178++) {
                        class153 var179 = this.field9883[var178];
                        class524 var180 = this.field9887[var178];
                        var180.field6958 = var180.field6958 & 0xFFFFFF | 255 - (this.field9916[var179.field2350] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field9945 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field9945.length > var190) {
                        int[] var191 = this.field9945[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field9975 == null || (this.field9975[var193] & arg6) != 0) {
                                int var194 = this.field9978[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFCA2) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var195 + arg2 & 0x3F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = var194 & 0x7F;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                int var200 = arg4 + var199;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field9978[var193] = (short) class446.method2556(class446.method2556(var198 << 7, var197 << 10), var200);
                                if (this.field9893 != null) {
                                    this.field9893.field7506 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field9883 != null) {
                    for (int var187 = 0; var187 < this.field9918; var187++) {
                        class153 var188 = this.field9883[var187];
                        class524 var189 = this.field9887[var187];
                        var189.field6958 = class169.field2606[this.field9978[var188.field2350] & 0xFFFF] & 0xFFFFFF | var189.field6958 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field9925 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field9925.length) {
                        int[] var203 = this.field9925[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class524 var205 = this.field9887[var203[var204]];
                            var205.field6950 += arg3;
                            var205.field6949 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field9925 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field9925.length > var207) {
                        int[] var208 = this.field9925[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class524 var210 = this.field9887[var208[var209]];
                            var210.field6951 = var210.field6951 * arg3 >> 7;
                            var210.field6952 = var210.field6952 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field9925 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field9925.length) {
                    int[] var213 = this.field9925[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class524 var215 = this.field9887[var213[var214]];
                        var215.field6957 = var215.field6957 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILofa;ZI)Z", line = 2227)
    public final boolean method158(int arg0, int arg1, class333 arg2, boolean arg3, int arg4) {
        field9929++;
        return this.method4025(arg3, arg0, 1238578060, arg4, -1, arg2, arg1);
    }

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "(I)V", line = 2235)
    public final void method194(int arg0) {
        field9886++;
        int var2 = class451.field6174[arg0];
        int var3 = class451.field6177[arg0];
        for (int var4 = 0; var4 < this.field9940; var4++) {
            int var7 = this.field9974[var4] * var3 + this.field9911[var4] * var2 >> 14;
            this.field9911[var4] = this.field9911[var4] * var3 - (this.field9974[var4] * var2) >> 14;
            this.field9974[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field9898; var5++) {
            int var6 = this.field9997[var5] * var3 + this.field9953[var5] * var2 >> 14;
            this.field9953[var5] = (short) (this.field9953[var5] * var3 - (this.field9997[var5] * var2) >> 14);
            this.field9997[var5] = (short) var6;
        }
        if (this.field9934 == null && this.field9893 != null) {
            this.field9893.field7506 = null;
        }
        if (this.field9934 != null) {
            this.field9934.field7506 = null;
        }
        if (this.field9947 != null) {
            this.field9947.field7506 = null;
        }
        this.field9982 = false;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lrda;)V", line = 5444)
    public class718(class663 arg0) {
        this.field9919 = arg0;
        this.field9947 = new class572(null, 5126, 3, 0);
        this.field9987 = new class572(null, 5126, 2, 0);
        this.field9934 = new class572(null, 5126, 3, 0);
        this.field9893 = new class572(null, 5121, 4, 0);
        this.field9906 = new class277();
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lrda;Lur;IIII)V", line = 5732)
    public class718(class663 arg0, class538 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9915 = arg5;
        this.field9919 = arg0;
        this.field9958 = arg2;
        if (class495.method2794(104, arg5, arg2)) {
            this.field9947 = new class572(null, 5126, 3, 0);
        }
        if (class148.method1112(arg2, (byte) 85, arg5)) {
            this.field9987 = new class572(null, 5126, 2, 0);
        }
        if (class327.method1980(arg2, arg5, false)) {
            this.field9934 = new class572(null, 5126, 3, 0);
        }
        if (class101.method756(arg5, arg2, -17286)) {
            this.field9893 = new class572(null, 5121, 4, 0);
        }
        if (class77.method616((byte) 78, arg5, arg2)) {
            this.field9906 = new class277();
        }
        class152 var7 = arg0.field717;
        int[] var8 = new int[arg1.field7084];
        this.field9901 = new int[arg1.field7131 + 1];
        for (int var9 = 0; var9 < arg1.field7084; var9++) {
            if (arg1.field7132 == null || arg1.field7132[var9] != 2) {
                if (arg1.field7112 != null && arg1.field7112[var9] != -1) {
                    class758 var173 = var7.method91(arg1.field7112[var9] & 0xFFFF, (byte) 127);
                    if (((this.field9915 & 0x40) == 0 || !var173.field10534) && var173.field10543) {
                        continue;
                    }
                }
                var8[this.field9897++] = var9;
                this.field9901[arg1.field7102[var9]]++;
                this.field9901[arg1.field7080[var9]]++;
                this.field9901[arg1.field7129[var9]]++;
            }
        }
        this.field9882 = this.field9897;
        long[] var10 = new long[this.field9897];
        boolean var11 = (this.field9958 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field9897; var12++) {
            int var156 = var8[var12];
            class758 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field7104 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field7104.length; var163++) {
                    class492 var164 = arg1.field7104[var163];
                    if (var164.field6660 == var156) {
                        class119 var165 = class591.method3219(0, var164.field6663);
                        if (var165.field1913) {
                            var162 = true;
                        }
                        if (var165.field1905 != -1) {
                            class758 var166 = var7.method91(var165.field1905, (byte) 125);
                            if (var166.field10541 == 2) {
                                this.field9935 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field9882--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field7112 != null) {
                var167 = arg1.field7112[var156];
                if (var167 != -1) {
                    var157 = var7.method91(var167 & 0xFFFF, (byte) 125);
                    if ((this.field9915 & 0x40) != 0 && var157.field10534) {
                        var167 = -1;
                        var157 = null;
                    } else {
                        var161 = var157.field10558;
                        if (var157.field10555 != 0 || var157.field10554 != 0) {
                            this.field9927 = true;
                        }
                        var160 = var157.field10536;
                    }
                }
            }
            boolean var168 = arg1.field7117 != null && arg1.field7117[var156] != 0 || var157 != null && var157.field10541 != 0;
            if ((var11 || var168) && arg1.field7128 != null) {
                var158 += arg1.field7128[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = (var161 & 0xFF) + var169;
            int var171 = ((var167 & 0xFFFF) << 16) + var159;
            int var172 = (var12 & 0xFFFF) + var171;
            var10[var12] = ((long) var170 << 32) + (long) var172;
            this.field9935 |= var168;
            this.field9927 |= var157 != null && (var157.field10555 != 0 || var157.field10554 != 0);
        }
        class109.method804(var10, var8, (byte) -123);
        this.field9885 = arg1.field7094;
        this.field9940 = arg1.field7131;
        this.field9974 = arg1.field7083;
        this.field9892 = arg1.field7119;
        this.field9911 = arg1.field7096;
        this.field9894 = arg1.field7125;
        this.field9922 = arg1.field7101;
        class290[] var13 = new class290[this.field9940];
        this.field9970 = arg1.field7116;
        if (arg1.field7104 != null) {
            this.field9918 = arg1.field7104.length;
            this.field9883 = new class153[this.field9918];
            this.field9887 = new class524[this.field9918];
            for (int var14 = 0; var14 < this.field9918; var14++) {
                class492 var15 = arg1.field7104[var14];
                class119 var16 = class591.method3219(0, var15.field6663);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field9897; var18++) {
                    if (var8[var18] == var15.field6660) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class169.field2606[arg1.field7110[var15.field6660] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field7117 == null ? 0 : arg1.field7117[var15.field6660]) << 24;
                this.field9883[var14] = new class153(var17, arg1.field7102[var15.field6660], arg1.field7080[var15.field6660], arg1.field7129[var15.field6660], var16.field1909, var16.field1908, var16.field1905, var16.field1910, var16.field1904, var16.field1913, var16.field1906, var15.field6662);
                this.field9887[var14] = new class524(var20);
            }
        }
        int var21 = this.field9897 * 3;
        this.field9939 = (short) arg3;
        this.field9999 = new short[var21];
        this.field9905 = new short[this.field9897];
        if (arg1.field7120 != null) {
            this.field9975 = new short[this.field9897];
        }
        this.field9912 = new float[var21];
        class99.field1269 = new long[var21];
        this.field9978 = new short[this.field9897];
        this.field9959 = new short[var21];
        this.field9967 = new short[this.field9897];
        this.field9888 = new short[this.field9897];
        this.field9953 = new short[var21];
        this.field9880 = new short[this.field9897];
        this.field9997 = new short[var21];
        this.field9916 = new byte[this.field9897];
        this.field9944 = new float[var21];
        this.field9931 = (short) arg4;
        this.field9933 = new byte[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field7131; var23++) {
            int var155 = this.field9901[var23];
            this.field9901[var23] = var22;
            var13[var23] = new class290();
            var22 += var155;
        }
        this.field9901[arg1.field7131] = var22;
        class365 var24 = class366.method2163(this.field9897, arg1, 0, var8);
        class494[] var25 = new class494[arg1.field7084];
        for (int var26 = 0; var26 < arg1.field7084; var26++) {
            short var134 = arg1.field7102[var26];
            short var135 = arg1.field7080[var26];
            short var136 = arg1.field7129[var26];
            int var137 = this.field9974[var135] - this.field9974[var134];
            int var138 = this.field9894[var135] - this.field9894[var134];
            int var139 = this.field9911[var135] - this.field9911[var134];
            int var140 = this.field9974[var136] - this.field9974[var134];
            int var141 = this.field9894[var136] - this.field9894[var134];
            int var142 = this.field9911[var136] - this.field9911[var134];
            int var143 = var138 * var142 - var139 * var141;
            int var144 = var139 * var140 - (var137 * var142);
            int var145 = var137 * var141 - (var138 * var140);
            while (var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192) {
                var143 >>= 0x1;
                var145 >>= 0x1;
                var144 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var144 * var144 + (var143 * var143 + (var145 * var145))));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var144 * 256 / var146;
            int var148 = var143 * 256 / var146;
            int var149 = var145 * 256 / var146;
            byte var150 = arg1.field7132 == null ? 0 : arg1.field7132[var26];
            if (var150 == 0) {
                class290 var152 = var13[var134];
                var152.field4139++;
                var152.field4138 += var147;
                var152.field4145 += var148;
                var152.field4140 += var149;
                class290 var153 = var13[var135];
                var153.field4138 += var147;
                var153.field4140 += var149;
                var153.field4145 += var148;
                var153.field4139++;
                class290 var154 = var13[var136];
                var154.field4138 += var147;
                var154.field4145 += var148;
                var154.field4139++;
                var154.field4140 += var149;
            } else if (var150 == 1) {
                class494 var151 = var25[var26] = new class494();
                var151.field6672 = var148;
                var151.field6671 = var147;
                var151.field6669 = var149;
            }
        }
        for (int var27 = 0; var27 < this.field9897; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field7110[var43] & 0xFFFF;
            int var45;
            if (arg1.field7082 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field7082[var43];
            }
            int var46;
            if (arg1.field7117 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field7117[var43] & 0xFF;
            }
            short var47 = arg1.field7112 == null ? -1 : arg1.field7112[var43];
            if (var47 != -1 && (this.field9915 & 0x40) != 0) {
                class758 var48 = var7.method91(var47 & 0xFFFF, (byte) 127);
                if (var48.field10534) {
                    var47 = -1;
                }
            }
            float var49 = 0.0F;
            float var50 = 0.0F;
            float var51 = 0.0F;
            float var52 = 0.0F;
            float var53 = 0.0F;
            float var54 = 0.0F;
            byte var55 = 0;
            byte var56 = 0;
            int var57 = 0;
            if (var47 != -1) {
                if (var45 == -1) {
                    var56 = 2;
                    var52 = 1.0F;
                    var50 = 1.0F;
                    var55 = 1;
                    var53 = 0.0F;
                    var49 = 0.0F;
                    var51 = 1.0F;
                    var54 = 0.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field7089[var45];
                    if (var58 == 0) {
                        short var59 = arg1.field7102[var43];
                        short var60 = arg1.field7080[var43];
                        short var61 = arg1.field7129[var43];
                        short var62 = arg1.field7103[var45];
                        short var63 = arg1.field7105[var45];
                        short var64 = arg1.field7126[var45];
                        float var65 = (float) arg1.field7083[var62];
                        float var66 = (float) arg1.field7125[var62];
                        float var67 = (float) arg1.field7096[var62];
                        float var68 = (float) arg1.field7083[var63] - var65;
                        float var69 = (float) arg1.field7125[var63] - var66;
                        float var70 = (float) arg1.field7096[var63] - var67;
                        float var71 = (float) arg1.field7083[var64] - var65;
                        float var72 = (float) arg1.field7125[var64] - var66;
                        float var73 = (float) arg1.field7096[var64] - var67;
                        float var74 = (float) arg1.field7083[var59] - var65;
                        float var75 = (float) arg1.field7125[var59] - var66;
                        float var76 = (float) arg1.field7096[var59] - var67;
                        float var77 = (float) arg1.field7083[var60] - var65;
                        float var78 = (float) arg1.field7125[var60] - var66;
                        float var79 = (float) arg1.field7096[var60] - var67;
                        float var80 = (float) arg1.field7083[var61] - var65;
                        float var81 = (float) arg1.field7125[var61] - var66;
                        float var82 = (float) arg1.field7096[var61] - var67;
                        float var83 = var69 * var73 - var70 * var72;
                        float var84 = var70 * var71 - var68 * var73;
                        float var85 = var68 * var72 - (var69 * var71);
                        float var86 = var72 * var85 - var73 * var84;
                        float var87 = var73 * var83 - var71 * var85;
                        float var88 = var71 * var84 - (var72 * var83);
                        float var89 = 1.0F / (var70 * var88 + var68 * var86 + var69 * var87);
                        var53 = (var82 * var88 + var80 * var86 + var81 * var87) * var89;
                        var49 = (var76 * var88 + var74 * var86 + var75 * var87) * var89;
                        var51 = (var79 * var88 + var77 * var86 + var78 * var87) * var89;
                        float var90 = var70 * var83 - var68 * var85;
                        float var91 = var68 * var84 - (var69 * var83);
                        float var92 = var69 * var85 - (var70 * var84);
                        float var93 = 1.0F / (var73 * var91 + var71 * var92 + var72 * var90);
                        var50 = (var76 * var91 + var74 * var92 + var75 * var90) * var93;
                        var54 = (var82 * var91 + var80 * var92 + var81 * var90) * var93;
                        var52 = (var79 * var91 + var77 * var92 + var78 * var90) * var93;
                    } else {
                        short var94 = arg1.field7102[var43];
                        short var95 = arg1.field7080[var43];
                        short var96 = arg1.field7129[var43];
                        int var97 = var24.field5125[var45];
                        int var98 = var24.field5124[var45];
                        int var99 = var24.field5127[var45];
                        float[] var100 = var24.field5130[var45];
                        byte var101 = arg1.field7098[var45];
                        float var102 = (float) arg1.field7097[var45] / 256.0F;
                        if (var58 == 1) {
                            float var103 = (float) arg1.field7077[var45] / 1024.0F;
                            class101.method757(-126, arg1.field7096[var94], class369.field5153, var101, arg1.field7083[var94], var98, var102, var100, var103, var97, arg1.field7125[var94], var99);
                            var50 = class369.field5153[1];
                            var49 = class369.field5153[0];
                            class101.method757(-118, arg1.field7096[var95], class369.field5153, var101, arg1.field7083[var95], var98, var102, var100, var103, var97, arg1.field7125[var95], var99);
                            var52 = class369.field5153[1];
                            var51 = class369.field5153[0];
                            class101.method757(-107, arg1.field7096[var96], class369.field5153, var101, arg1.field7083[var96], var98, var102, var100, var103, var97, arg1.field7125[var96], var99);
                            var54 = class369.field5153[1];
                            var53 = class369.field5153[0];
                            float var104 = var103 / 2.0F;
                            if ((var101 & 0x1) == 0) {
                                if ((var104 < var53 - var49)) {
                                    var53 -= var103;
                                    var56 = 1;
                                } else if (var49 - var53 > var104) {
                                    var53 += var103;
                                    var56 = 2;
                                }
                                if ((var51 - var49 > var104)) {
                                    var55 = 1;
                                    var51 -= var103;
                                } else if (var104 < var49 - var51) {
                                    var51 += var103;
                                    var55 = 2;
                                }
                            } else {
                                if (var54 - var50 > var104) {
                                    var54 -= var103;
                                    var56 = 1;
                                } else if (var104 < var50 - var54) {
                                    var56 = 2;
                                    var54 += var103;
                                }
                                if (var52 - var50 > var104) {
                                    var55 = 1;
                                    var52 -= var103;
                                } else if (var50 - var52 > var104) {
                                    var52 += var103;
                                    var55 = 2;
                                }
                            }
                        } else if (var58 == 2) {
                            float var105 = (float) arg1.field7088[var45] / 256.0F;
                            float var106 = (float) arg1.field7090[var45] / 256.0F;
                            int var107 = arg1.field7083[var95] - arg1.field7083[var94];
                            int var108 = arg1.field7125[var95] - arg1.field7125[var94];
                            int var109 = arg1.field7096[var95] - arg1.field7096[var94];
                            int var110 = arg1.field7083[var96] - arg1.field7083[var94];
                            int var111 = arg1.field7125[var96] - arg1.field7125[var94];
                            int var112 = arg1.field7096[var96] - arg1.field7096[var94];
                            int var113 = var108 * var112 - (var109 * var111);
                            int var114 = var109 * var110 - (var107 * var112);
                            int var115 = var107 * var111 - (var108 * var110);
                            float var116 = 64.0F / (float) arg1.field7114[var45];
                            float var117 = 64.0F / (float) arg1.field7085[var45];
                            float var118 = 64.0F / (float) arg1.field7077[var45];
                            float var119 = (var100[2] * (float) var115 + var100[1] * (float) var114 + var100[0] * (float) var113) / var116;
                            float var120 = (var100[5] * (float) var115 + var100[3] * (float) var113 + var100[4] * (float) var114) / var117;
                            float var121 = (var100[8] * (float) var115 + var100[7] * (float) var114 + var100[6] * (float) var113) / var118;
                            var57 = class6.method84(var119, var120, var121, (byte) 49);
                            class24.method241(var106, var97, arg1.field7096[var94], var99, var105, (byte) 9, var98, arg1.field7083[var94], arg1.field7125[var94], var102, var101, class369.field5153, var100, var57);
                            var50 = class369.field5153[1];
                            var49 = class369.field5153[0];
                            class24.method241(var106, var97, arg1.field7096[var95], var99, var105, (byte) 9, var98, arg1.field7083[var95], arg1.field7125[var95], var102, var101, class369.field5153, var100, var57);
                            var52 = class369.field5153[1];
                            var51 = class369.field5153[0];
                            class24.method241(var106, var97, arg1.field7096[var96], var99, var105, (byte) 9, var98, arg1.field7083[var96], arg1.field7125[var96], var102, var101, class369.field5153, var100, var57);
                            var53 = class369.field5153[0];
                            var54 = class369.field5153[1];
                        } else if (var58 == 3) {
                            class433.method2492(var101, arg1.field7125[var94], class369.field5153, 8, var102, var98, arg1.field7096[var94], arg1.field7083[var94], var97, var99, var100);
                            var50 = class369.field5153[1];
                            var49 = class369.field5153[0];
                            class433.method2492(var101, arg1.field7125[var95], class369.field5153, 8, var102, var98, arg1.field7096[var95], arg1.field7083[var95], var97, var99, var100);
                            var51 = class369.field5153[0];
                            var52 = class369.field5153[1];
                            class433.method2492(var101, arg1.field7125[var96], class369.field5153, 8, var102, var98, arg1.field7096[var96], arg1.field7083[var96], var97, var99, var100);
                            var54 = class369.field5153[1];
                            var53 = class369.field5153[0];
                            if ((var101 & 0x1) == 0) {
                                if ((var51 - var49 > 0.5F)) {
                                    var55 = 1;
                                    var51--;
                                } else if (var49 - var51 > 0.5F) {
                                    var55 = 2;
                                    var51++;
                                }
                                if ((var53 - var49 > 0.5F)) {
                                    var56 = 1;
                                    var53--;
                                } else if (var49 - var53 > 0.5F) {
                                    var53++;
                                    var56 = 2;
                                }
                            } else {
                                if (var54 - var50 > 0.5F) {
                                    var54--;
                                    var56 = 1;
                                } else if (var50 - var54 > 0.5F) {
                                    var54++;
                                    var56 = 2;
                                }
                                if (var52 - var50 > 0.5F) {
                                    var52--;
                                    var55 = 1;
                                } else if (var50 - var52 > 0.5F) {
                                    var55 = 2;
                                    var52++;
                                }
                            }
                        }
                    }
                }
            }
            byte var122;
            if (arg1.field7132 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field7132[var43];
            }
            if (var122 == 0) {
                long var123 = (long) (var45 << 2) + ((long) (var57 << 24) + (long) var46 + (long) (var44 << 8) << 32);
                short var125 = arg1.field7102[var43];
                short var126 = arg1.field7080[var43];
                short var127 = arg1.field7129[var43];
                class290 var128 = var13[var125];
                this.field9905[var27] = this.method4020(var128.field4140, var128.field4138, (byte) 98, var49, arg1, var128.field4139, var125, var123, var50, var128.field4145);
                class290 var129 = var13[var126];
                this.field9967[var27] = this.method4020(var129.field4140, var129.field4138, (byte) 98, var51, arg1, var129.field4139, var126, (long) var55 + var123, var52, var129.field4145);
                class290 var130 = var13[var127];
                this.field9888[var27] = this.method4020(var130.field4140, var130.field4138, (byte) 98, var53, arg1, var130.field4139, var127, (long) var56 + var123, var54, var130.field4145);
            } else if (var122 == 1) {
                class494 var131 = var25[var43];
                long var132 = ((long) (var57 << 24) + (long) var46 + (long) (var44 << 8) << 32) + (long) ((var131.field6671 + 256 << 12) + (var131.field6669 + 256 << 22) + (var131.field6672 <= 0 ? 2048 : 1024) + (var45 << 2));
                this.field9905[var27] = this.method4020(var131.field6669, var131.field6671, (byte) 98, var49, arg1, 0, arg1.field7102[var43], var132, var50, var131.field6672);
                this.field9967[var27] = this.method4020(var131.field6669, var131.field6671, (byte) 98, var51, arg1, 0, arg1.field7080[var43], (long) var55 + var132, var52, var131.field6672);
                this.field9888[var27] = this.method4020(var131.field6669, var131.field6671, (byte) 98, var53, arg1, 0, arg1.field7129[var43], (long) var56 + var132, var54, var131.field6672);
            }
            if (arg1.field7117 != null) {
                this.field9916[var27] = arg1.field7117[var43];
            }
            if (arg1.field7120 != null) {
                this.field9975[var27] = arg1.field7120[var43];
            }
            this.field9978[var27] = arg1.field7110[var43];
            this.field9880[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field9882; var30++) {
            short var42 = this.field9880[var30];
            if (var29 != var42) {
                var28++;
                var29 = var42;
            }
        }
        this.field9909 = new int[var28 + 1];
        short var31 = -10000;
        int var32 = 0;
        for (int var33 = 0; var33 < this.field9882; var33++) {
            short var41 = this.field9880[var33];
            if (var31 != var41) {
                this.field9909[var32++] = var33;
                var31 = var41;
            }
        }
        this.field9909[var32] = this.field9882;
        class99.field1269 = null;
        this.field9997 = class127.method1001(this.field9997, this.field9898, (byte) 103);
        this.field9999 = class127.method1001(this.field9999, this.field9898, (byte) 103);
        this.field9953 = class127.method1001(this.field9953, this.field9898, (byte) 103);
        this.field9933 = class91.method690(this.field9898, this.field9933, (byte) 108);
        this.field9944 = class363.method2157(false, this.field9944, this.field9898);
        this.field9912 = class363.method2157(false, this.field9912, this.field9898);
        if (arg1.field7113 != null && class384.method2273(106, arg2, this.field9915)) {
            this.field9924 = arg1.method2989(false, 61);
        }
        if (arg1.field7104 != null && class442.method2545(this.field9915, arg2, (byte) -124)) {
            this.field9925 = arg1.method2991(-15362);
        }
        if (arg1.field7086 != null && class571.method3147(arg2, 126, this.field9915)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field9897; var36++) {
                int var40 = arg1.field7086[var8[var36]];
                if (var40 >= 0) {
                    if (var34 < var40) {
                        var34 = var40;
                    }
                    int var10002 = var35[var40]++;
                }
            }
            this.field9945 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field9945[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field9897; var38++) {
                int var39 = arg1.field7086[var8[var38]];
                if (var39 >= 0) {
                    this.field9945[var39][var35[var39]++] = var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "ma", descriptor = "()I", line = 2287)
    public final int method167() {
        if (!this.field9982) {
            this.method4024(29866);
        }
        field9954++;
        return this.field9910;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILofa;ZII)Z", line = 2298)
    public final boolean method203(int arg0, int arg1, class333 arg2, boolean arg3, int arg4, int arg5) {
        field9896++;
        return this.method4025(arg3, arg0, 1238578060, arg4, arg5, arg2, arg1);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIZIIIII)Z", line = 2306)
    private final boolean method4019(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field9889++;
        if (arg4 < arg5 && arg8 > arg4 && arg7 > arg4) {
            return false;
        } else if (arg5 < arg4 && arg4 > arg8 && arg4 > arg7) {
            return false;
        } else if (arg2 > arg6 && arg6 < arg1 && arg6 < arg0) {
            return false;
        } else if (arg6 > arg2 && arg6 > arg1 && arg0 < arg6) {
            return false;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BIZ)Lka;", line = 2335)
    public final class475 method171(byte arg0, int arg1, boolean arg2) {
        field9998++;
        class718 var4;
        class718 var5;
        if (arg0 == 1) {
            var4 = this.field9919.field8998;
            var5 = this.field9919.field9025;
        } else if (arg0 == 2) {
            var4 = this.field9919.field9034;
            var5 = this.field9919.field9053;
        } else if (arg0 == 3) {
            var4 = this.field9919.field9095;
            var5 = this.field9919.field9043;
        } else if (arg0 == 4) {
            var5 = this.field9919.field9014;
            var4 = this.field9919.field9057;
        } else if (arg0 == 5) {
            var5 = this.field9919.field9054;
            var4 = this.field9919.field9023;
        } else {
            var5 = var4 = new class718(this.field9919);
        }
        return this.method4027(arg2, arg1, var4, var5, arg0 != 0, (byte) 116);
    }

    @OriginalMember(owner = "client!nk", name = "ba", descriptor = "(Lr;)Lr;", line = 2385)
    public final class184 method154(class184 arg0) {
        field9946++;
        if (this.field9898 == 0) {
            return null;
        }
        if (!this.field9982) {
            this.method4024(29866);
        }
        int var2;
        int var3;
        if (this.field9919.field9011 <= 0) {
            var2 = this.field9960 - (this.field9919.field9011 * this.field9964 >> 8) >> this.field9919.field8947;
            var3 = this.field9904 - (this.field9919.field9011 * this.field9986 >> 8) >> this.field9919.field8947;
        } else {
            var2 = this.field9960 - (this.field9919.field9011 * this.field9986 >> 8) >> this.field9919.field8947;
            var3 = this.field9904 - (this.field9919.field9011 * this.field9964 >> 8) >> this.field9919.field8947;
        }
        int var4;
        int var5;
        if (this.field9919.field9084 > 0) {
            var4 = this.field9968 - (this.field9919.field9084 * this.field9986 >> 8) >> this.field9919.field8947;
            var5 = this.field9965 - (this.field9919.field9084 * this.field9964 >> 8) >> this.field9919.field8947;
        } else {
            var4 = this.field9968 - (this.field9919.field9084 * this.field9964 >> 8) >> this.field9919.field8947;
            var5 = this.field9965 - (this.field9919.field9084 * this.field9986 >> 8) >> this.field9919.field8947;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class330 var8 = (class330) arg0;
        class330 var9;
        if (var8 != null && var8.method1994(var7, -1, var6)) {
            var9 = var8;
            var8.method1992(true);
        } else {
            var9 = new class330(this.field9919, var6, var7);
        }
        var9.method1993(var3, var2, -111, var5, var4);
        this.method4021(var9, 255);
        return var9;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lofa;IZ)V", line = 2454)
    public final void method191(class333 arg0, int arg1, boolean arg2) {
        field9995++;
        if (this.field9885 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field9940; var5++) {
            if ((arg1 & this.field9885[var5]) != 0) {
                if (arg2) {
                    arg0.method1723(this.field9974[var5], this.field9894[var5], this.field9911[var5], var4);
                } else {
                    arg0.method1708(this.field9974[var5], this.field9894[var5], this.field9911[var5], var4);
                }
                this.field9974[var5] = var4[0];
                this.field9894[var5] = var4[1];
                this.field9911[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "ua", descriptor = "()I", line = 2488)
    public final int method214() {
        field9993++;
        return this.field9958;
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "()[Lcm;", line = 2496)
    public final class730[] method150() {
        field9907++;
        return this.field9922;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lofa;)V", line = 2508)
    public final void method200(class333 arg0) {
        field9903++;
        class288 var2 = (class288) arg0;
        if (this.field9922 != null) {
            for (int var3 = 0; var3 < this.field9922.length; var3++) {
                class730 var4 = this.field9922[var3];
                class730 var5 = var4;
                if (var4.field10122 != null) {
                    var5 = var4.field10122;
                }
                var5.field10121 = (int) ((float) this.field9911[var4.field10120] * var2.field4093 + (float) this.field9974[var4.field10120] * var2.field4102 + (float) this.field9894[var4.field10120] * var2.field4092 + var2.field4088);
                var5.field10132 = (int) ((float) this.field9911[var4.field10120] * var2.field4094 + (float) this.field9974[var4.field10120] * var2.field4069 + (float) this.field9894[var4.field10120] * var2.field4080 + var2.field4078);
                var5.field10131 = (int) ((float) this.field9911[var4.field10120] * var2.field4101 + (float) this.field9974[var4.field10120] * var2.field4083 + (float) this.field9894[var4.field10120] * var2.field4099 + var2.field4105);
                var5.field10127 = (int) ((float) this.field9911[var4.field10125] * var2.field4093 + (float) this.field9974[var4.field10125] * var2.field4102 + (float) this.field9894[var4.field10125] * var2.field4092 + var2.field4088);
                var5.field10126 = (int) ((float) this.field9911[var4.field10125] * var2.field4094 + (float) this.field9974[var4.field10125] * var2.field4069 + (float) this.field9894[var4.field10125] * var2.field4080 + var2.field4078);
                var5.field10114 = (int) ((float) this.field9911[var4.field10125] * var2.field4101 + (float) this.field9974[var4.field10125] * var2.field4083 + (float) this.field9894[var4.field10125] * var2.field4099 + var2.field4105);
                var5.field10113 = (int) ((float) this.field9911[var4.field10130] * var2.field4093 + (float) this.field9974[var4.field10130] * var2.field4102 + (float) this.field9894[var4.field10130] * var2.field4092 + var2.field4088);
                var5.field10115 = (int) ((float) this.field9911[var4.field10130] * var2.field4094 + (float) this.field9974[var4.field10130] * var2.field4069 + (float) this.field9894[var4.field10130] * var2.field4080 + var2.field4078);
                var5.field10129 = (int) ((float) this.field9911[var4.field10130] * var2.field4101 + (float) this.field9974[var4.field10130] * var2.field4083 + (float) this.field9894[var4.field10130] * var2.field4099 + var2.field4105);
            }
        }
        if (this.field9970 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field9970.length; var6++) {
            class207 var7 = this.field9970[var6];
            class207 var8 = var7;
            if (var7.field3068 != null) {
                var8 = var7.field3068;
            }
            if (var7.field3070 == null) {
                var7.field3070 = var2.method1703();
            } else {
                var7.field3070.method1712(var2);
            }
            var8.field3073 = (int) ((float) this.field9911[var7.field3066] * var2.field4093 + (float) this.field9974[var7.field3066] * var2.field4102 + (float) this.field9894[var7.field3066] * var2.field4092 + var2.field4088);
            var8.field3072 = (int) ((float) this.field9911[var7.field3066] * var2.field4094 + (float) this.field9974[var7.field3066] * var2.field4069 + (float) this.field9894[var7.field3066] * var2.field4080 + var2.field4078);
            var8.field3079 = (int) ((float) this.field9911[var7.field3066] * var2.field4101 + (float) this.field9974[var7.field3066] * var2.field4083 + (float) this.field9894[var7.field3066] * var2.field4099 + var2.field4105);
        }
    }

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "()I", line = 2573)
    public final int method205() {
        field9990++;
        if (!this.field9982) {
            this.method4024(29866);
        }
        return this.field9965;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIBFLur;IIJFI)S", line = 2595)
    private final short method4020(int arg0, int arg1, byte arg2, float arg3, class538 arg4, int arg5, int arg6, long arg7, float arg8, int arg9) {
        field9992++;
        int var12 = this.field9901[arg6];
        int var13 = this.field9901[arg6 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field9959[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class99.field1269[var15] == arg7) {
                return (short) (var16 - 1);
            }
        }
        this.field9959[var14] = (short) (this.field9898 + 1);
        if (arg2 != 98) {
            this.method144(-49, null, -123, -74, -97, -16, true);
        }
        class99.field1269[var14] = arg7;
        this.field9997[this.field9898] = (short) arg9;
        this.field9999[this.field9898] = (short) arg1;
        this.field9953[this.field9898] = (short) arg0;
        this.field9933[this.field9898] = (byte) arg5;
        this.field9944[this.field9898] = arg3;
        this.field9912[this.field9898] = arg8;
        return (short) (this.field9898++);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "()V", line = 2643)
    public final void method157() {
        field9928++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lhs;I)V", line = 2651)
    private final void method4021(class330 arg0, int arg1) {
        if (this.field9898 > this.field9919.field9099.length) {
            this.field9919.field9096 = new int[this.field9898];
            this.field9919.field9099 = new int[this.field9898];
        }
        field9948++;
        int[] var3 = this.field9919.field9099;
        int[] var4 = this.field9919.field9096;
        for (int var5 = 0; var5 < this.field9940; var5++) {
            int var16 = (this.field9974[var5] - (this.field9894[var5] * this.field9919.field9011 >> 8) >> this.field9919.field8947) - arg0.field4709;
            int var17 = (this.field9911[var5] - (this.field9894[var5] * this.field9919.field9084 >> 8) >> this.field9919.field8947) - arg0.field4706;
            int var18 = this.field9901[var5];
            int var19 = this.field9901[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field9959[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field9882; var6++) {
            if (this.field9916 == null || this.field9916[var6] <= 128) {
                short var7 = this.field9905[var6];
                short var8 = this.field9967[var6];
                short var9 = this.field9888[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg0.method1991(var11, var13, -2745, var10, var15, var12, var14);
                }
            }
        }
        if (arg1 != 255) {
            this.field9951 = 71;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)V", line = 2742)
    private final void method4022(int arg0, boolean arg1) {
        field9942++;
        boolean var3 = this.field9893 != null && this.field9893.field7506 == null;
        boolean var4 = this.field9934 != null && this.field9934.field7506 == null;
        boolean var5 = this.field9947 != null && this.field9947.field7506 == null;
        boolean var6 = this.field9987 != null && this.field9987.field7506 == null;
        if (arg1) {
            var5 &= (this.field9943 & 0x1) != 0;
            var4 &= (this.field9943 & 0x4) != 0;
            var3 &= (this.field9943 & 0x2) != 0;
            var6 &= (this.field9943 & 0x8) != 0;
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
        if (this.field9919.field8994.field9399.length >= this.field9898 * var7) {
            this.field9919.field8994.field9419 = 0;
        } else {
            this.field9919.field8994 = new class451((this.field9898 + 100) * var7);
        }
        class451 var12 = this.field9919.field8994;
        if (var5) {
            if (this.field9919.field9021) {
                for (int var13 = 0; var13 < this.field9940; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field9974[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field9894[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field9911[var13]);
                    int var17 = this.field9901[var13];
                    int var18 = this.field9901[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field9959[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field9419 = var7 * var20;
                        var12.method3798(27695, var14);
                        var12.method3798(27695, var15);
                        var12.method3798(27695, var16);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field9940; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field9974[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field9894[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field9911[var21]);
                    int var25 = this.field9901[var21];
                    int var26 = this.field9901[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field9959[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field9419 = var7 * var28;
                        var12.method3789(var22, arg0 - 118);
                        var12.method3789(var23, -93);
                        var12.method3789(var24, -103);
                    }
                }
            }
        }
        if (var3) {
            if (this.field9934 == null) {
                byte[] var29;
                short[] var30;
                short[] var31;
                short[] var32;
                if (this.field9961 == null) {
                    var29 = this.field9933;
                    var30 = this.field9997;
                    var31 = this.field9999;
                    var32 = this.field9953;
                } else {
                    var30 = this.field9961.field5249;
                    var32 = this.field9961.field5248;
                    var29 = this.field9961.field5247;
                    var31 = this.field9961.field5250;
                }
                float var33 = this.field9919.field8987[0];
                float var34 = this.field9919.field8987[1];
                float var35 = this.field9919.field8987[2];
                float var36 = this.field9919.field9027;
                float var37 = this.field9919.field8989 * 768.0F / (float) this.field9931;
                float var38 = this.field9919.field8995 * 768.0F / (float) this.field9931;
                for (int var39 = 0; var39 < this.field9897; var39++) {
                    int var40 = this.method4028(this.field9978[var39], this.field9880[var39], this.field9939, this.field9916[var39], 6);
                    float var41 = (float) (var40 >>> 24) * this.field9919.field9033;
                    float var42 = (float) ((var40 & 0xFF2F) >> 8) * this.field9919.field9042;
                    short var43 = this.field9905[var39];
                    float var44 = (float) (var40 >> 16 & 0xFF) * this.field9919.field9016;
                    short var45 = (short) var29[var43];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var32[var43] * var35 + (float) var30[var43] * var33 + (float) var31[var43] * var34) * 0.0026041667F;
                    } else {
                        var46 = ((float) var32[var43] * var35 + (float) var30[var43] * var33 + (float) var31[var43] * var34) / (float) (var45 * 256);
                    }
                    float var47 = var46 * (var46 < 0.0F ? var38 : var37) + var36;
                    int var48 = (int) (var41 * var47);
                    int var49 = (int) (var44 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var50 = (int) (var42 * var47);
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
                    var12.field9419 = var7 * var43 + var9;
                    var12.method3823(-35, var48);
                    var12.method3823(-27, var49);
                    var12.method3823(-111, var50);
                    var12.method3823(-98, 255 - (this.field9916[var39] & 0xFF));
                    short var51 = this.field9967[var39];
                    short var52 = (short) var29[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var32[var51] * var35 + (float) var30[var51] * var33 + (float) var31[var51] * var34) * 0.0026041667F;
                    } else {
                        var53 = ((float) var32[var51] * var35 + (float) var30[var51] * var33 + (float) var31[var51] * var34) / (float) (var52 * 256);
                    }
                    float var54 = var53 * (var53 < 0.0F ? var38 : var37) + var36;
                    int var55 = (int) (var41 * var54);
                    int var56 = (int) (var44 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var57 = (int) (var42 * var54);
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
                    var12.field9419 = var7 * var51 + var9;
                    var12.method3823(-95, var55);
                    var12.method3823(-54, var56);
                    var12.method3823(arg0 ^ 0xFFFFFFA8, var57);
                    var12.method3823(-118, 255 - (this.field9916[var39] & 0xFF));
                    short var58 = this.field9888[var39];
                    short var59 = (short) var29[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var32[var58] * var35 + (float) var30[var58] * var33 + (float) var31[var58] * var34) * 0.0026041667F;
                    } else {
                        var60 = ((float) var32[var58] * var35 + (float) var30[var58] * var33 + (float) var31[var58] * var34) / (float) (var59 * 256);
                    }
                    float var61 = var36 + var60 * (var60 < 0.0F ? var38 : var37);
                    int var62 = (int) (var41 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var63 = (int) (var44 * var61);
                    int var64 = (int) (var42 * var61);
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
                    var12.field9419 = var9 + (var7 * var58);
                    var12.method3823(-128, var62);
                    var12.method3823(-93, var63);
                    var12.method3823(arg0 ^ 0xFFFFFFB0, var64);
                    var12.method3823(arg0 ^ 0xFFFFFFCA, 255 - (this.field9916[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field9897; var65++) {
                    int var66 = this.method4028(this.field9978[var65], this.field9880[var65], this.field9939, this.field9916[var65], arg0 + 6);
                    var12.field9419 = this.field9905[var65] * var7 + var9;
                    var12.method3798(27695, var66);
                    var12.field9419 = var9 + (this.field9967[var65] * var7);
                    var12.method3798(27695, var66);
                    var12.field9419 = this.field9888[var65] * var7 + var9;
                    var12.method3798(27695, var66);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            short[] var69;
            byte[] var70;
            if (this.field9961 == null) {
                var67 = this.field9997;
                var68 = this.field9999;
                var69 = this.field9953;
                var70 = this.field9933;
            } else {
                var67 = this.field9961.field5249;
                var68 = this.field9961.field5250;
                var69 = this.field9961.field5248;
                var70 = this.field9961.field5247;
            }
            float var71 = 3.0F / (float) this.field9931;
            float var72 = 3.0F / (float) (this.field9931 / 2 + this.field9931);
            var12.field9419 = var10;
            if (this.field9919.field9021) {
                for (int var76 = 0; var76 < this.field9898; var76++) {
                    int var77 = var70[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2574(50, (float) var67[var76] * var72);
                        var12.method2574(arg0 ^ 0x7B, (float) var68[var76] * var72);
                        var12.method2574(arg0 ^ 0x22, (float) var69[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2574(47, (float) var67[var76] * var78);
                        var12.method2574(102, (float) var68[var76] * var78);
                        var12.method2574(37, (float) var69[var76] * var78);
                    }
                    var12.field9419 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field9898; var73++) {
                    int var74 = var70[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2573(arg0 + 4440, (float) var67[var73] * var72);
                        var12.method2573(4440, (float) var68[var73] * var72);
                        var12.method2573(4440, (float) var69[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2573(arg0 ^ 0x1158, (float) var67[var73] * var75);
                        var12.method2573(arg0 ^ 0x1158, (float) var68[var73] * var75);
                        var12.method2573(4440, (float) var69[var73] * var75);
                    }
                    var12.field9419 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field9419 = var11;
            if (this.field9919.field9021) {
                for (int var80 = 0; var80 < this.field9898; var80++) {
                    var12.method2574(92, this.field9944[var80]);
                    var12.method2574(36, this.field9912[var80]);
                    var12.field9419 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field9898; var79++) {
                    var12.method2573(4440, this.field9944[var79]);
                    var12.method2573(4440, this.field9912[var79]);
                    var12.field9419 += var7 - 8;
                }
            }
        }
        if (arg0 != 0) {
            return;
        }
        var12.field9419 = this.field9898 * var7;
        class345 var81;
        if (arg1) {
            if (this.field9932 == null) {
                this.field9932 = this.field9919.method3619((byte) 108, var12.field9419, true, var7, var12.field9399);
            } else {
                this.field9932.method2063((byte) 77, var12.field9419, var7, var12.field9399);
            }
            var81 = this.field9932;
            this.field9943 = 0;
        } else {
            var81 = this.field9919.method3619((byte) 107, var12.field9419, false, var7, var12.field9399);
            this.field9920 = true;
        }
        if (var5) {
            this.field9947.field7508 = var8;
            this.field9947.field7506 = var81;
        }
        if (var6) {
            this.field9987.field7506 = var81;
            this.field9987.field7508 = var11;
        }
        if (var3) {
            this.field9893.field7508 = var9;
            this.field9893.field7506 = var81;
        }
        if (var4) {
            this.field9934.field7508 = var10;
            this.field9934.field7506 = var81;
        }
    }

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "(I)V", line = 3263)
    public final void method185(int arg0) {
        if (this.field9893 != null) {
            this.field9893.field7506 = null;
        }
        field9962++;
        this.field9939 = (short) arg0;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V", line = 3280)
    private final void method4023(int arg0) {
        field10001++;
        if (this.field9882 == 0) {
            return;
        }
        if (this.field9943 != 0) {
            this.method4022(0, true);
        }
        this.method4022(arg0 ^ arg0, false);
        if (this.field9906 != null) {
            if (this.field9906.field3862 == null) {
                this.method4026(11297, (this.field9943 & 0x10) != 0);
            }
            if (this.field9906.field3862 != null) {
                this.field9919.method3628(this.field9934 != null, -119);
                this.field9919.method3593(32886, this.field9987, this.field9947, this.field9934, this.field9893);
                int var2 = this.field9909.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field9909[var3];
                    int var5 = this.field9909[var3 + 1];
                    int var6 = this.field9880[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field9919.method3657(var6, this.field9934 != null, 37922160);
                    this.field9919.method3647(this.field9906.field3862, var4 * 3, (byte) -92, 4, (var5 - var4) * 3);
                }
            }
        }
        this.method4017((byte) -78);
    }

    @OriginalMember(owner = "client!nk", name = "FA", descriptor = "(I)V", line = 3334)
    public final void method143(int arg0) {
        field9952++;
        int var2 = class451.field6174[arg0];
        int var3 = class451.field6177[arg0];
        for (int var4 = 0; var4 < this.field9940; var4++) {
            int var5 = this.field9894[var4] * var3 - this.field9911[var4] * var2 >> 14;
            this.field9911[var4] = this.field9894[var4] * var2 + (this.field9911[var4] * var3) >> 14;
            this.field9894[var4] = var5;
        }
        if (this.field9947 != null) {
            this.field9947.field7506 = null;
        }
        this.field9982 = false;
    }

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "(III)V", line = 3370)
    public final void method183(int arg0, int arg1, int arg2) {
        field9957++;
        for (int var4 = 0; var4 < this.field9940; var4++) {
            if (arg0 != 128) {
                this.field9974[var4] = this.field9974[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field9894[var4] = this.field9894[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field9911[var4] = this.field9911[var4] * arg2 >> 7;
            }
        }
        this.field9982 = false;
        if (this.field9947 != null) {
            this.field9947.field7506 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "NA", descriptor = "()Z", line = 3406)
    public final boolean method145() {
        field9963++;
        if (this.field9924 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field9892; var1++) {
            this.field9974[var1] <<= 0x4;
            this.field9894[var1] <<= 0x4;
            this.field9911[var1] <<= 0x4;
        }
        class97.field1202 = 0;
        class113.field1863 = 0;
        class519.field6924 = 0;
        return true;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 3440)
    public final void method146(int arg0) {
        field9971++;
        int var2 = class451.field6174[arg0];
        int var3 = class451.field6177[arg0];
        for (int var4 = 0; var4 < this.field9940; var4++) {
            int var5 = this.field9911[var4] * var2 + (this.field9974[var4] * var3) >> 14;
            this.field9911[var4] = this.field9911[var4] * var3 - this.field9974[var4] * var2 >> 14;
            this.field9974[var4] = var5;
        }
        if (this.field9947 != null) {
            this.field9947.field7506 = null;
        }
        this.field9982 = false;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[IIIIIZ)V", line = 3469)
    public final void method144(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field9937++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class97.field1202 = 0;
            class113.field1863 = 0;
            int var12 = 0;
            class519.field6924 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field9924.length) {
                    int[] var15 = this.field9924[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class113.field1863 += this.field9974[var17];
                        class97.field1202 += this.field9894[var17];
                        class519.field6924 += this.field9911[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class519.field6924 = class519.field6924 / var12 + var10;
                class113.field1863 = class113.field1863 / var12 + var9;
                class97.field1202 = class97.field1202 / var12 + var11;
            } else {
                class113.field1863 = var9;
                class519.field6924 = var10;
                class97.field1202 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field9924.length) {
                    int[] var23 = this.field9924[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field9974[var25] += var18;
                        this.field9894[var25] += var19;
                        this.field9911[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field9924.length) {
                    int[] var46 = this.field9924[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field9974[var59] -= class113.field1863;
                            this.field9894[var59] -= class97.field1202;
                            this.field9911[var59] -= class519.field6924;
                            if (arg4 != 0) {
                                int var60 = class451.field6174[arg4];
                                int var61 = class451.field6177[arg4];
                                int var62 = this.field9974[var59] * var61 + this.field9894[var59] * var60 + 16383 >> 14;
                                this.field9894[var59] = this.field9894[var59] * var61 + 16383 - (this.field9974[var59] * var60) >> 14;
                                this.field9974[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class451.field6174[arg2];
                                int var64 = class451.field6177[arg2];
                                int var65 = this.field9894[var59] * var64 + 16383 - (this.field9911[var59] * var63) >> 14;
                                this.field9911[var59] = this.field9911[var59] * var64 + this.field9894[var59] * var63 + 16383 >> 14;
                                this.field9894[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class451.field6174[arg3];
                                int var67 = class451.field6177[arg3];
                                int var68 = this.field9911[var59] * var66 + (this.field9974[var59] * var67) + 16383 >> 14;
                                this.field9911[var59] = this.field9911[var59] * var67 + 16383 - (this.field9974[var59] * var66) >> 14;
                                this.field9974[var59] = var68;
                            }
                            this.field9974[var59] += class113.field1863;
                            this.field9894[var59] += class97.field1202;
                            this.field9911[var59] += class519.field6924;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field9974[var48] -= class113.field1863;
                            this.field9894[var48] -= class97.field1202;
                            this.field9911[var48] -= class519.field6924;
                            if (arg2 != 0) {
                                int var49 = class451.field6174[arg2];
                                int var50 = class451.field6177[arg2];
                                int var51 = this.field9894[var48] * var50 + 16383 - (this.field9911[var48] * var49) >> 14;
                                this.field9911[var48] = this.field9911[var48] * var50 + this.field9894[var48] * var49 + 16383 >> 14;
                                this.field9894[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class451.field6174[arg4];
                                int var53 = class451.field6177[arg4];
                                int var54 = this.field9974[var48] * var53 + this.field9894[var48] * var52 + 16383 >> 14;
                                this.field9894[var48] = this.field9894[var48] * var53 + 16383 - (this.field9974[var48] * var52) >> 14;
                                this.field9974[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class451.field6174[arg3];
                                int var56 = class451.field6177[arg3];
                                int var57 = this.field9911[var48] * var55 + (this.field9974[var48] * var56) + 16383 >> 14;
                                this.field9911[var48] = this.field9911[var48] * var56 - (this.field9974[var48] * var55 - 16383) >> 14;
                                this.field9974[var48] = var57;
                            }
                            this.field9974[var48] += class113.field1863;
                            this.field9894[var48] += class97.field1202;
                            this.field9911[var48] += class519.field6924;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field9924.length > var28) {
                        int[] var29 = this.field9924[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field9901[var31];
                            int var33 = this.field9901[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field9959[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class451.field6174[arg4];
                                    int var37 = class451.field6177[arg4];
                                    int var38 = this.field9997[var35] * var37 + this.field9999[var35] * var36 + 16383 >> 14;
                                    this.field9999[var35] = (short) (this.field9999[var35] * var37 + 16383 - (this.field9997[var35] * var36) >> 14);
                                    this.field9997[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class451.field6174[arg2];
                                    int var40 = class451.field6177[arg2];
                                    int var41 = this.field9999[var35] * var40 + 16383 - (this.field9953[var35] * var39) >> 14;
                                    this.field9953[var35] = (short) (this.field9999[var35] * var39 + this.field9953[var35] * var40 + 16383 >> 14);
                                    this.field9999[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class451.field6174[arg3];
                                    int var43 = class451.field6177[arg3];
                                    int var44 = this.field9997[var35] * var43 + this.field9953[var35] * var42 + 16383 >> 14;
                                    this.field9953[var35] = (short) (this.field9953[var35] * var43 + 16383 - (this.field9997[var35] * var42) >> 14);
                                    this.field9997[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field9934 == null && this.field9893 != null) {
                    this.field9893.field7506 = null;
                }
                if (this.field9934 != null) {
                    this.field9934.field7506 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field9924.length > var70) {
                    int[] var71 = this.field9924[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field9974[var73] -= class113.field1863;
                        this.field9894[var73] -= class97.field1202;
                        this.field9911[var73] -= class519.field6924;
                        this.field9974[var73] = this.field9974[var73] * arg2 >> 7;
                        this.field9894[var73] = this.field9894[var73] * arg3 >> 7;
                        this.field9911[var73] = this.field9911[var73] * arg4 >> 7;
                        this.field9974[var73] += class113.field1863;
                        this.field9894[var73] += class97.field1202;
                        this.field9911[var73] += class519.field6924;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field9945 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field9945.length) {
                        int[] var79 = this.field9945[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field9916[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field9916[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field9893 != null) {
                            this.field9893.field7506 = null;
                        }
                    }
                }
                if (this.field9883 != null) {
                    for (int var75 = 0; var75 < this.field9918; var75++) {
                        class153 var76 = this.field9883[var75];
                        class524 var77 = this.field9887[var75];
                        var77.field6958 = var77.field6958 & 0xFFFFFF | 255 - (this.field9916[var76.field2350] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field9945 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field9945.length) {
                        int[] var88 = this.field9945[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field9978[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3DA) >> 7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg2 + var92 & 0x3F;
                            int var96 = arg3 / 4 + var93;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            int var97 = arg4 + var94;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field9978[var90] = (short) class446.method2556(var97, class446.method2556(var96 << 7, var95 << 10));
                        }
                        if (var88.length > 0 && this.field9893 != null) {
                            this.field9893.field7506 = null;
                        }
                    }
                }
                if (this.field9883 != null) {
                    for (int var84 = 0; var84 < this.field9918; var84++) {
                        class153 var85 = this.field9883[var84];
                        class524 var86 = this.field9887[var84];
                        var86.field6958 = class169.field2606[this.field9978[var85.field2350] & 0xFFFF] & 0xFFFFFF | var86.field6958 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field9925 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field9925.length > var99) {
                        int[] var100 = this.field9925[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class524 var102 = this.field9887[var100[var101]];
                            var102.field6949 += arg2;
                            var102.field6950 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field9925 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field9925.length) {
                        int[] var105 = this.field9925[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class524 var107 = this.field9887[var105[var106]];
                            var107.field6952 = var107.field6952 * arg2 >> 7;
                            var107.field6951 = var107.field6951 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field9925 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field9925.length) {
                    int[] var110 = this.field9925[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class524 var112 = this.field9887[var110[var111]];
                        var112.field6957 = var112.field6957 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V", line = 4128)
    private final void method4024(int arg0) {
        field9914++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        if (arg0 != 29866) {
            field9979 = null;
        }
        for (int var10 = 0; var10 < this.field9940; var10++) {
            int var11 = this.field9974[var10];
            int var12 = this.field9894[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            int var13 = this.field9911[var10];
            if (var12 > var6) {
                var6 = var12;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var13 * var13 + var11 * var11 + var12 * var12;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field9968 = (short) var4;
        this.field9960 = (short) var2;
        this.field9964 = (short) var3;
        this.field9904 = (short) var5;
        this.field9965 = (short) var7;
        this.field9986 = (short) var6;
        this.field9951 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field9910 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field9982 = true;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZIIIILofa;I)Z", line = 4212)
    private final boolean method4025(boolean arg0, int arg1, int arg2, int arg3, int arg4, class333 arg5, int arg6) {
        field9930++;
        class288 var8 = (class288) arg5;
        class288 var9 = this.field9919.field8981;
        float var10 = var8.field4105 * var9.field4093 + var8.field4088 * var9.field4102 + var8.field4078 * var9.field4092 + var9.field4088;
        float var11 = var8.field4105 * var9.field4094 + var8.field4088 * var9.field4069 + var8.field4078 * var9.field4080 + var9.field4078;
        float var12 = var8.field4105 * var9.field4101 + var8.field4088 * var9.field4083 + var8.field4078 * var9.field4099 + var9.field4105;
        class534.field7040 = var8.field4099 * var9.field4094 + var8.field4092 * var9.field4069 + var8.field4080 * var9.field4080;
        class14.field206 = var8.field4083 * var9.field4094 + var8.field4102 * var9.field4069 + var8.field4069 * var9.field4080;
        class123.field2066 = var8.field4083 * var9.field4093 + var8.field4102 * var9.field4102 + var8.field4069 * var9.field4092;
        class181.field2731 = var8.field4101 * var9.field4094 + var8.field4094 * var9.field4080 + var8.field4093 * var9.field4069;
        class733.field10145 = var8.field4101 * var9.field4101 + var8.field4094 * var9.field4099 + var8.field4093 * var9.field4083;
        class69.field843 = var8.field4101 * var9.field4093 + var8.field4094 * var9.field4092 + var8.field4093 * var9.field4102;
        class719.field10022 = var8.field4099 * var9.field4093 + var8.field4092 * var9.field4102 + var8.field4080 * var9.field4092;
        class278.field3878 = var8.field4083 * var9.field4101 + var8.field4102 * var9.field4083 + var8.field4069 * var9.field4099;
        class204.field3062 = var8.field4099 * var9.field4101 + var8.field4092 * var9.field4083 + var8.field4080 * var9.field4099;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field9919.field9013;
        int var19 = this.field9919.field9012;
        if (!this.field9982) {
            this.method4024(29866);
        }
        int var20 = this.field9904 - this.field9960 >> 1;
        int var21 = this.field9986 - this.field9964 >> 1;
        int var22 = this.field9965 - this.field9968 >> 1;
        if (arg2 != 1238578060) {
            this.field9909 = null;
        }
        int var23 = this.field9960 + var20;
        int var24 = this.field9964 + var21;
        int var25 = this.field9968 + var22;
        int var26 = var23 - (var20 << arg3);
        int var27 = var24 - (var21 << arg3);
        int var28 = var25 - (var22 << arg3);
        int var29 = (var20 << arg3) + var23;
        int var30 = (var21 << arg3) + var24;
        int var31 = var25 + (var22 << arg3);
        class200.field2997[0] = var26;
        class609.field8123[0] = var27;
        class539.field7143[0] = var28;
        class200.field2997[1] = var29;
        class609.field8123[1] = var27;
        class539.field7143[1] = var28;
        class200.field2997[2] = var26;
        class609.field8123[2] = var30;
        class200.field2997[3] = var29;
        class539.field7143[2] = var28;
        class609.field8123[3] = var30;
        class539.field7143[3] = var28;
        class200.field2997[4] = var26;
        class609.field8123[4] = var27;
        class539.field7143[4] = var31;
        class200.field2997[5] = var29;
        class609.field8123[5] = var27;
        class539.field7143[5] = var31;
        class200.field2997[6] = var26;
        class609.field8123[6] = var30;
        class200.field2997[7] = var29;
        class539.field7143[6] = var31;
        class609.field8123[7] = var30;
        class539.field7143[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class539.field7143[var32];
            float var54 = (float) class609.field8123[var32];
            float var55 = (float) class200.field2997[var32];
            float var56 = class69.field843 * var53 + class719.field10022 * var54 + class123.field2066 * var55 + var10;
            float var57 = class733.field10145 * var53 + class278.field3878 * var55 + class204.field3062 * var54 + var12;
            float var58 = class181.field2731 * var53 + class534.field7040 * var54 + class14.field206 * var55 + var11;
            if ((float) this.field9919.field9046 <= var57) {
                if (arg4 > 0) {
                    var57 = arg4;
                }
                float var59 = (float) var18 * var56 / var57 + (float) this.field9919.field9039;
                float var60 = (float) var19 * var58 / var57 + (float) this.field9919.field9082;
                if (var59 > var15) {
                    var15 = var59;
                }
                if (var14 > var59) {
                    var14 = var59;
                }
                if (var16 > var60) {
                    var16 = var60;
                }
                if (var17 < var60) {
                    var17 = var60;
                }
                var13 = true;
            }
        }
        if (var13 && (float) arg1 > var14 && (float) arg1 < var15 && (float) arg6 > var16 && var17 > (float) arg6) {
            if (arg0) {
                return true;
            }
            if (this.field9919.field9099.length < this.field9898) {
                this.field9919.field9096 = new int[this.field9898];
                this.field9919.field9099 = new int[this.field9898];
            }
            int[] var33 = this.field9919.field9099;
            int[] var34 = this.field9919.field9096;
            for (int var35 = 0; var35 < this.field9940; var35++) {
                float var37 = (float) this.field9911[var35];
                float var38 = (float) this.field9974[var35];
                float var39 = (float) this.field9894[var35];
                float var40 = class69.field843 * var37 + class719.field10022 * var39 + class123.field2066 * var38 + var10;
                float var41 = class181.field2731 * var37 + class534.field7040 * var39 + class14.field206 * var38 + var11;
                float var42 = class733.field10145 * var37 + class278.field3878 * var38 + class204.field3062 * var39 + var12;
                if (((float) this.field9919.field9046 <= var42)) {
                    if (arg4 > 0) {
                        var42 = arg4;
                    }
                    int var47 = (int) ((float) var18 * var40 / var42 + (float) this.field9919.field9039);
                    int var48 = (int) ((float) var19 * var41 / var42 + (float) this.field9919.field9082);
                    int var49 = this.field9901[var35];
                    int var50 = this.field9901[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field9959[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[var52] = var47;
                        var34[var52] = var48;
                    }
                } else {
                    int var43 = this.field9901[var35];
                    int var44 = this.field9901[var35 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field9959[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        var33[this.field9959[var45] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field9897; var36++) {
                if (var33[this.field9905[var36]] != -999999 && var33[this.field9967[var36]] != -999999 && var33[this.field9888[var36]] != -999999 && this.method4019(var33[this.field9888[var36]], var33[this.field9967[var36]], var33[this.field9905[var36]], true, arg6, var34[this.field9905[var36]], arg1, var34[this.field9888[var36]], var34[this.field9967[var36]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nk", name = "RA", descriptor = "()I", line = 4461)
    public final int method175() {
        if (!this.field9982) {
            this.method4024(29866);
        }
        field9949++;
        return this.field9904;
    }

    @OriginalMember(owner = "client!nk", name = "wa", descriptor = "()V", line = 4475)
    public final void method178() {
        field9966++;
        for (int var1 = 0; var1 < this.field9892; var1++) {
            this.field9974[var1] = this.field9974[var1] + 7 >> 4;
            this.field9894[var1] = this.field9894[var1] + 7 >> 4;
            this.field9911[var1] = this.field9911[var1] + 7 >> 4;
        }
        this.field9982 = false;
        if (this.field9947 != null) {
            this.field9947.field7506 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "()V", line = 4502)
    public final void method202() {
        field9969++;
        for (int var1 = 0; var1 < this.field9940; var1++) {
            this.field9911[var1] = -this.field9911[var1];
        }
        for (int var2 = 0; var2 < this.field9898; var2++) {
            this.field9953[var2] = (short) (-this.field9953[var2]);
        }
        for (int var3 = 0; var3 < this.field9897; var3++) {
            short var4 = this.field9905[var3];
            this.field9905[var3] = this.field9888[var3];
            this.field9888[var3] = var4;
        }
        if (this.field9934 == null && this.field9893 != null) {
            this.field9893.field7506 = null;
        }
        if (this.field9934 != null) {
            this.field9934.field7506 = null;
        }
        this.field9982 = false;
        if (this.field9906 != null) {
            this.field9906.field3862 = null;
        }
        if (this.field9947 != null) {
            this.field9947.field7506 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "da", descriptor = "()I", line = 4556)
    public final int method163() {
        field10000++;
        return this.field9931;
    }

    @OriginalMember(owner = "client!nk", name = "HA", descriptor = "()I", line = 4570)
    public final int method217() {
        field9996++;
        if (!this.field9982) {
            this.method4024(29866);
        }
        return this.field9968;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IZ)V", line = 4583)
    private final void method4026(int arg0, boolean arg1) {
        if ((this.field9882 * 6) > this.field9919.field8994.field9399.length) {
            this.field9919.field8994 = new class451(this.field9882 * 6 + 600);
        } else {
            this.field9919.field8994.field9419 = 0;
        }
        if (arg0 != 11297) {
            return;
        }
        field9977++;
        class451 var3 = this.field9919.field8994;
        if (this.field9919.field9021) {
            for (int var5 = 0; var5 < this.field9882; var5++) {
                var3.method3831(1182, this.field9905[var5]);
                var3.method3831(arg0 - 10115, this.field9967[var5]);
                var3.method3831(1182, this.field9888[var5]);
            }
        } else {
            for (int var4 = 0; var4 < this.field9882; var4++) {
                var3.method3819(this.field9905[var4], 44);
                var3.method3819(this.field9967[var4], 64);
                var3.method3819(this.field9888[var4], arg0 - 11407);
            }
        }
        if (var3.field9419 == 0) {
            return;
        }
        if (arg1) {
            if (this.field9989 == null) {
                this.field9989 = this.field9919.method3627(5123, (byte) -85, var3.field9399, var3.field9419, true);
            } else {
                this.field9989.method678(var3.field9419, 20218, 5123, var3.field9399);
            }
            this.field9906.field3862 = this.field9989;
        } else {
            this.field9906.field3862 = this.field9919.method3627(5123, (byte) -85, var3.field9399, var3.field9419, false);
        }
        if (!arg1) {
            this.field9920 = true;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lofa;Lvh;I)V", line = 4648)
    public final void method155(class333 arg0, class364 arg1, int arg2) {
        field9881++;
        if (this.field9898 == 0) {
            return;
        }
        class288 var4 = this.field9919.field8981;
        if (!this.field9982) {
            this.method4024(29866);
        }
        class288 var5 = (class288) arg0;
        class701.field9734 = var4.field4101 * var5.field4105 + var4.field4099 * var5.field4078 + var4.field4083 * var5.field4088 + var4.field4105;
        class204.field3062 = var4.field4101 * var5.field4099 + var4.field4099 * var5.field4080 + var4.field4083 * var5.field4092;
        float var6 = (float) this.field9964 * class204.field3062 + class701.field9734;
        float var7 = (float) this.field9986 * class204.field3062 + class701.field9734;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var8 = (float) this.field9951 + var6;
            var9 = var7 - (float) this.field9951;
        } else {
            var8 = (float) this.field9951 + var7;
            var9 = (float) (-this.field9951) + var6;
        }
        if ((this.field9919.field9068 <= var9) || (var8 <= (float) this.field9919.field9046)) {
            return;
        }
        class719.field10022 = var4.field4093 * var5.field4099 + var4.field4102 * var5.field4092 + var4.field4092 * var5.field4080;
        class278.field3910 = var4.field4093 * var5.field4105 + var4.field4102 * var5.field4088 + var4.field4092 * var5.field4078 + var4.field4088;
        float var10 = (float) this.field9964 * class719.field10022 + class278.field3910;
        float var11 = (float) this.field9986 * class719.field10022 + class278.field3910;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var12 = ((float) this.field9951 + var10) * (float) this.field9919.field9013;
            var13 = (var11 - (float) this.field9951) * (float) this.field9919.field9013;
        } else {
            var12 = ((float) this.field9951 + var11) * (float) this.field9919.field9013;
            var13 = (var10 - (float) this.field9951) * (float) this.field9919.field9013;
        }
        if ((var13 / var8 >= this.field9919.field8993) || (var12 / var8 <= this.field9919.field9065)) {
            return;
        }
        class534.field7040 = var4.field4094 * var5.field4099 + var4.field4080 * var5.field4080 + var4.field4069 * var5.field4092;
        class524.field6956 = var4.field4094 * var5.field4105 + var4.field4080 * var5.field4078 + var4.field4069 * var5.field4088 + var4.field4078;
        float var14 = (float) this.field9964 * class534.field7040 + class524.field6956;
        float var15 = (float) this.field9986 * class534.field7040 + class524.field6956;
        float var16;
        float var17;
        if ((var15 < var14)) {
            var16 = (var15 - (float) this.field9951) * (float) this.field9919.field9012;
            var17 = ((float) this.field9951 + var14) * (float) this.field9919.field9012;
        } else {
            var16 = (var14 - (float) this.field9951) * (float) this.field9919.field9012;
            var17 = ((float) this.field9951 + var15) * (float) this.field9919.field9012;
        }
        if ((var16 / var8 >= this.field9919.field9049) || (this.field9919.field9089 >= var17 / var8)) {
            return;
        }
        if (arg1 != null || this.field9883 != null) {
            class181.field2731 = var4.field4094 * var5.field4101 + var4.field4080 * var5.field4094 + var4.field4069 * var5.field4093;
            class69.field843 = var4.field4093 * var5.field4101 + var4.field4102 * var5.field4093 + var4.field4092 * var5.field4094;
            class278.field3878 = var4.field4101 * var5.field4083 + var4.field4099 * var5.field4069 + var4.field4083 * var5.field4102;
            class14.field206 = var4.field4094 * var5.field4083 + var4.field4080 * var5.field4069 + var4.field4069 * var5.field4102;
            class123.field2066 = var4.field4093 * var5.field4083 + var4.field4102 * var5.field4102 + var4.field4092 * var5.field4069;
            class733.field10145 = var4.field4101 * var5.field4101 + var4.field4099 * var5.field4094 + var4.field4083 * var5.field4093;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field9960 + this.field9904 >> 1;
            int var21 = this.field9968 + this.field9965 >> 1;
            int var22 = (int) ((float) var21 * class69.field843 + (float) this.field9964 * class719.field10022 + (float) var20 * class123.field2066 + class278.field3910);
            int var23 = (int) ((float) var21 * class181.field2731 + (float) this.field9964 * class534.field7040 + (float) var20 * class14.field206 + class524.field6956);
            int var24 = (int) ((float) var21 * class733.field10145 + (float) this.field9964 * class204.field3062 + (float) var20 * class278.field3878 + class701.field9734);
            if (var24 < this.field9919.field9046) {
                var18 = true;
            } else {
                arg1.field5121 = this.field9919.field9012 * var23 / var24 + this.field9919.field9082;
                arg1.field5122 = this.field9919.field9013 * var22 / var24 + this.field9919.field9039;
            }
            int var25 = (int) ((float) var21 * class69.field843 + (float) this.field9986 * class719.field10022 + (float) var20 * class123.field2066 + class278.field3910);
            int var26 = (int) ((float) var21 * class181.field2731 + (float) this.field9986 * class534.field7040 + (float) var20 * class14.field206 + class524.field6956);
            int var27 = (int) ((float) var21 * class733.field10145 + (float) this.field9986 * class204.field3062 + (float) var20 * class278.field3878 + class701.field9734);
            if (this.field9919.field9046 <= var27) {
                arg1.field5120 = this.field9919.field9013 * var25 / var27 + this.field9919.field9039;
                arg1.field5118 = this.field9919.field9012 * var26 / var27 + this.field9919.field9082;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field9919.field9046 > var24 && this.field9919.field9046 > var27) {
                    var19 = false;
                } else if (this.field9919.field9046 > var24) {
                    int var31 = (var27 - this.field9919.field9046 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    arg1.field5122 = this.field9919.field9039 + (this.field9919.field9013 * var32 / this.field9919.field9046);
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field5121 = this.field9919.field9082 + (this.field9919.field9012 * var33 / this.field9919.field9046);
                } else if (this.field9919.field9046 > var27) {
                    int var28 = (var24 - this.field9919.field9046 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field5122 = this.field9919.field9013 * var29 / this.field9919.field9046 + this.field9919.field9039;
                    arg1.field5121 = this.field9919.field9012 * var30 / this.field9919.field9046 + this.field9919.field9082;
                }
            }
            if (var19) {
                if (var27 >= var24) {
                    arg1.field5119 = (this.field9951 + var25) * this.field9919.field9013 / var27 + this.field9919.field9039 - arg1.field5120;
                } else {
                    arg1.field5119 = this.field9919.field9039 + ((this.field9951 + var22) * this.field9919.field9013 / var24) - arg1.field5122;
                }
                arg1.field5117 = true;
            }
        }
        this.field9919.method3613(-1);
        this.field9919.method3595(var5, 28727);
        this.method4023(3227);
        this.field9919.method3590(true);
        this.method4016(30803);
    }

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "(I)V", line = 4856)
    public final void method190(int arg0) {
        field9972++;
        this.field9958 = arg0;
        if (this.field9961 != null && (this.field9958 & 0x10000) == 0) {
            this.field9933 = this.field9961.field5247;
            this.field9999 = this.field9961.field5250;
            this.field9953 = this.field9961.field5248;
            this.field9997 = this.field9961.field5249;
            this.field9961 = null;
        }
        this.field9920 = true;
        this.method4017((byte) -78);
    }

    @OriginalMember(owner = "client!nk", name = "EA", descriptor = "()I", line = 4882)
    public final int method148() {
        field9890++;
        if (!this.field9982) {
            this.method4024(29866);
        }
        return this.field9986;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZILnk;Lnk;ZB)Lka;", line = 4894)
    private final class475 method4027(boolean arg0, int arg1, class718 arg2, class718 arg3, boolean arg4, byte arg5) {
        arg3.field9918 = this.field9918;
        arg3.field9897 = this.field9897;
        if ((arg1 & 0x100) == 0) {
            arg3.field9935 = this.field9935;
        } else {
            arg3.field9935 = true;
        }
        arg3.field9915 = this.field9915;
        field9938++;
        arg3.field9927 = this.field9927;
        arg3.field9898 = this.field9898;
        arg3.field9943 = 0;
        arg3.field9892 = this.field9892;
        arg3.field9940 = this.field9940;
        arg3.field9931 = this.field9931;
        arg3.field9958 = arg1;
        if (arg5 < 108) {
            return null;
        }
        arg3.field9939 = this.field9939;
        arg3.field9882 = this.field9882;
        boolean var7 = class435.method2501(arg1, this.field9915, 33);
        boolean var8 = class614.method3342(arg1, this.field9915, 3828);
        boolean var9 = class481.method2708(this.field9915, arg1, 123);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg3.field9974 = this.field9974;
            } else if (arg2.field9974 == null || this.field9892 > arg2.field9974.length) {
                arg3.field9974 = arg2.field9974 = new int[this.field9892];
            } else {
                arg3.field9974 = arg2.field9974;
            }
            if (!var8) {
                arg3.field9894 = this.field9894;
            } else if (arg2.field9894 == null || this.field9892 > arg2.field9894.length) {
                arg3.field9894 = arg2.field9894 = new int[this.field9892];
            } else {
                arg3.field9894 = arg2.field9894;
            }
            if (!var9) {
                arg3.field9911 = this.field9911;
            } else if (arg2.field9911 == null || this.field9892 > arg2.field9911.length) {
                arg3.field9911 = arg2.field9911 = new int[this.field9892];
            } else {
                arg3.field9911 = arg2.field9911;
            }
            for (int var11 = 0; var11 < this.field9892; var11++) {
                if (var7) {
                    arg3.field9974[var11] = this.field9974[var11];
                }
                if (var8) {
                    arg3.field9894[var11] = this.field9894[var11];
                }
                if (var9) {
                    arg3.field9911[var11] = this.field9911[var11];
                }
            }
        } else {
            arg3.field9911 = this.field9911;
            arg3.field9974 = this.field9974;
            arg3.field9894 = this.field9894;
        }
        if (class601.method3269(arg1, this.field9915, (byte) 8)) {
            if (arg4) {
                arg3.field9943 = (byte) (arg3.field9943 | 0x1);
            }
            arg3.field9947 = arg2.field9947;
            arg3.field9947.field7506 = this.field9947.field7506;
            arg3.field9947.field7508 = this.field9947.field7508;
        } else if (class495.method2794(93, this.field9915, arg1)) {
            arg3.field9947 = this.field9947;
        } else {
            arg3.field9947 = null;
        }
        if (class606.method3294(arg1, 0, this.field9915)) {
            if (arg2.field9978 == null || this.field9897 > arg2.field9978.length) {
                arg3.field9978 = arg2.field9978 = new short[this.field9897];
            } else {
                arg3.field9978 = arg2.field9978;
            }
            for (int var12 = 0; var12 < this.field9897; var12++) {
                arg3.field9978[var12] = this.field9978[var12];
            }
        } else {
            arg3.field9978 = this.field9978;
        }
        if (class378.method2239(arg1, 0, this.field9915)) {
            if (arg2.field9916 == null || arg2.field9916.length < this.field9897) {
                arg3.field9916 = arg2.field9916 = new byte[this.field9897];
            } else {
                arg3.field9916 = arg2.field9916;
            }
            for (int var13 = 0; var13 < this.field9897; var13++) {
                arg3.field9916[var13] = this.field9916[var13];
            }
        } else {
            arg3.field9916 = this.field9916;
        }
        if (class439.method2531(arg1, 127, this.field9915)) {
            if (arg4) {
                arg3.field9943 = (byte) (arg3.field9943 | 0x2);
            }
            arg3.field9893 = arg2.field9893;
            arg3.field9893.field7508 = this.field9893.field7508;
            arg3.field9893.field7506 = this.field9893.field7506;
        } else if (class101.method756(this.field9915, arg1, -17286)) {
            arg3.field9893 = this.field9893;
        } else {
            arg3.field9893 = null;
        }
        if (class549.method3069(112, this.field9915, arg1)) {
            if (arg2.field9997 == null || arg2.field9997.length < this.field9898) {
                int var14 = this.field9898;
                arg3.field9953 = arg2.field9953 = new short[var14];
                arg3.field9997 = arg2.field9997 = new short[var14];
                arg3.field9999 = arg2.field9999 = new short[var14];
            } else {
                arg3.field9953 = arg2.field9953;
                arg3.field9997 = arg2.field9997;
                arg3.field9999 = arg2.field9999;
            }
            if (this.field9961 == null) {
                for (int var15 = 0; var15 < this.field9898; var15++) {
                    arg3.field9997[var15] = this.field9997[var15];
                    arg3.field9999[var15] = this.field9999[var15];
                    arg3.field9953[var15] = this.field9953[var15];
                }
            } else {
                if (arg2.field9961 == null) {
                    arg2.field9961 = new class377();
                }
                class377 var16 = arg3.field9961 = arg2.field9961;
                if (var16.field5249 == null || this.field9898 > var16.field5249.length) {
                    int var17 = this.field9898;
                    var16.field5248 = new short[var17];
                    var16.field5249 = new short[var17];
                    var16.field5247 = new byte[var17];
                    var16.field5250 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field9898; var18++) {
                    arg3.field9997[var18] = this.field9997[var18];
                    arg3.field9999[var18] = this.field9999[var18];
                    arg3.field9953[var18] = this.field9953[var18];
                    var16.field5249[var18] = this.field9961.field5249[var18];
                    var16.field5250[var18] = this.field9961.field5250[var18];
                    var16.field5248[var18] = this.field9961.field5248[var18];
                    var16.field5247[var18] = this.field9961.field5247[var18];
                }
            }
            arg3.field9933 = this.field9933;
        } else {
            arg3.field9961 = this.field9961;
            arg3.field9997 = this.field9997;
            arg3.field9933 = this.field9933;
            arg3.field9953 = this.field9953;
            arg3.field9999 = this.field9999;
        }
        if (class545.method3051(this.field9915, arg1, 0)) {
            arg3.field9934 = arg2.field9934;
            if (arg4) {
                arg3.field9943 = (byte) (arg3.field9943 | 0x4);
            }
            arg3.field9934.field7508 = this.field9934.field7508;
            arg3.field9934.field7506 = this.field9934.field7506;
        } else if (class327.method1980(arg1, this.field9915, false)) {
            arg3.field9934 = this.field9934;
        } else {
            arg3.field9934 = null;
        }
        if (class53.method365((byte) -109, this.field9915, arg1)) {
            if (arg2.field9944 == null || this.field9897 > arg2.field9944.length) {
                int var19 = this.field9898;
                arg3.field9912 = arg2.field9912 = new float[var19];
                arg3.field9944 = arg2.field9944 = new float[var19];
            } else {
                arg3.field9912 = arg2.field9912;
                arg3.field9944 = arg2.field9944;
            }
            for (int var20 = 0; var20 < this.field9898; var20++) {
                arg3.field9944[var20] = this.field9944[var20];
                arg3.field9912[var20] = this.field9912[var20];
            }
        } else {
            arg3.field9944 = this.field9944;
            arg3.field9912 = this.field9912;
        }
        if (class371.method2180(this.field9915, 13, arg1)) {
            if (arg4) {
                arg3.field9943 = (byte) (arg3.field9943 | 0x8);
            }
            arg3.field9987 = arg2.field9987;
            arg3.field9987.field7508 = this.field9987.field7508;
            arg3.field9987.field7506 = this.field9987.field7506;
        } else if (class148.method1112(arg1, (byte) 34, this.field9915)) {
            arg3.field9987 = this.field9987;
        } else {
            arg3.field9987 = null;
        }
        if (class319.method1935(arg1, -1, this.field9915)) {
            if (arg2.field9905 == null || arg2.field9905.length < this.field9897) {
                int var21 = this.field9897;
                arg3.field9967 = arg2.field9967 = new short[var21];
                arg3.field9905 = arg2.field9905 = new short[var21];
                arg3.field9888 = arg2.field9888 = new short[var21];
            } else {
                arg3.field9888 = arg2.field9888;
                arg3.field9967 = arg2.field9967;
                arg3.field9905 = arg2.field9905;
            }
            for (int var22 = 0; var22 < this.field9897; var22++) {
                arg3.field9905[var22] = this.field9905[var22];
                arg3.field9967[var22] = this.field9967[var22];
                arg3.field9888[var22] = this.field9888[var22];
            }
        } else {
            arg3.field9888 = this.field9888;
            arg3.field9967 = this.field9967;
            arg3.field9905 = this.field9905;
        }
        if (class60.method521(arg1, -1, this.field9915)) {
            if (arg4) {
                arg3.field9943 = (byte) (arg3.field9943 | 0x10);
            }
            arg3.field9906 = arg2.field9906;
            arg3.field9906.field3862 = this.field9906.field3862;
        } else if (class77.method616((byte) 112, this.field9915, arg1)) {
            arg3.field9906 = this.field9906;
        } else {
            arg3.field9906 = null;
        }
        if (class303.method1849(3, arg1, this.field9915)) {
            if (arg2.field9880 == null || arg2.field9880.length < this.field9897) {
                int var23 = this.field9897;
                arg3.field9880 = arg2.field9880 = new short[var23];
            } else {
                arg3.field9880 = arg2.field9880;
            }
            for (int var24 = 0; var24 < this.field9897; var24++) {
                arg3.field9880[var24] = this.field9880[var24];
            }
        } else {
            arg3.field9880 = this.field9880;
        }
        if (!class275.method1652(arg1, (byte) -124, this.field9915)) {
            arg3.field9887 = this.field9887;
        } else if (arg2.field9887 == null || this.field9918 > arg2.field9887.length) {
            int var26 = this.field9918;
            arg3.field9887 = arg2.field9887 = new class524[var26];
            for (int var27 = 0; var27 < this.field9918; var27++) {
                arg3.field9887[var27] = this.field9887[var27].method2897(-1);
            }
        } else {
            arg3.field9887 = arg2.field9887;
            for (int var25 = 0; var25 < this.field9918; var25++) {
                arg3.field9887[var25].method2899(this.field9887[var25], false);
            }
        }
        arg3.field9970 = this.field9970;
        arg3.field9883 = this.field9883;
        arg3.field9959 = this.field9959;
        arg3.field9925 = this.field9925;
        arg3.field9901 = this.field9901;
        arg3.field9924 = this.field9924;
        arg3.field9909 = this.field9909;
        if (this.field9982) {
            arg3.field9982 = true;
            arg3.field9965 = this.field9965;
            arg3.field9904 = this.field9904;
            arg3.field9960 = this.field9960;
            arg3.field9951 = this.field9951;
            arg3.field9910 = this.field9910;
            arg3.field9968 = this.field9968;
            arg3.field9964 = this.field9964;
            arg3.field9986 = this.field9986;
        } else {
            arg3.field9982 = false;
        }
        arg3.field9922 = this.field9922;
        arg3.field9945 = this.field9945;
        arg3.field9975 = this.field9975;
        arg3.field9885 = this.field9885;
        return arg3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ISIBI)I", line = 5365)
    private final int method4028(int arg0, short arg1, int arg2, byte arg3, int arg4) {
        field9973++;
        if (arg4 != 6) {
            return 119;
        }
        int var6 = class169.field2606[class622.method3421(arg2, (byte) -124, arg0)];
        if (arg1 != -1) {
            class758 var7 = this.field9919.field717.method91(arg1 & 0xFFFF, (byte) 126);
            int var8 = var7.field10542 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg2 < 0) {
                    var9 = 0;
                } else if (arg2 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg2 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field10537 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((var6 & 0xFF0000) >> 16) * var12;
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
                var6 = (var13 << 8 & 0xFF0088) + (var14 & 0xFF00) + (var15 >> 8);
            }
        }
        return (var6 << 8) + 255 - (arg3 & 0xFF);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lka;IIIZ)V", line = 5460)
    public final void method170(class475 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field9980++;
        class718 var6 = (class718) arg0;
        if (this.field9897 == 0 || var6.field9897 == 0) {
            return;
        }
        int var7 = var6.field9940;
        int[] var8 = var6.field9974;
        int[] var9 = var6.field9894;
        int[] var10 = var6.field9911;
        short[] var11 = var6.field9997;
        short[] var12 = var6.field9999;
        short[] var13 = var6.field9953;
        byte[] var14 = var6.field9933;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field9961 == null) {
            var16 = null;
            var18 = null;
            var17 = null;
            var15 = null;
        } else {
            var15 = this.field9961.field5248;
            var16 = this.field9961.field5250;
            var17 = this.field9961.field5249;
            var18 = this.field9961.field5247;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field9961 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field9961.field5250;
            var22 = var6.field9961.field5248;
            var20 = var6.field9961.field5249;
            var21 = var6.field9961.field5247;
        }
        int[] var23 = var6.field9901;
        short[] var24 = var6.field9959;
        if (!var6.field9982) {
            var6.method4024(29866);
        }
        short var25 = var6.field9964;
        short var26 = var6.field9986;
        short var27 = var6.field9960;
        short var28 = var6.field9904;
        short var29 = var6.field9968;
        short var30 = var6.field9965;
        for (int var31 = 0; var31 < this.field9940; var31++) {
            int var32 = this.field9894[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field9974[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field9911[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field9901[var31];
                        int var37 = this.field9901[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field9959[var38] - 1;
                            if (var35 == -1 || this.field9933[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = -1;
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var40; var43 < var42; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var17 == null) {
                                            this.field9961 = new class377();
                                            var17 = this.field9961.field5249 = class230.method1461((byte) 64, this.field9997);
                                            var16 = this.field9961.field5250 = class230.method1461((byte) 64, this.field9999);
                                            var15 = this.field9961.field5248 = class230.method1461((byte) 64, this.field9953);
                                            var18 = this.field9961.field5247 = client.method1862((byte) 3, this.field9933);
                                        }
                                        if (var20 == null) {
                                            class377 var44 = var6.field9961 = new class377();
                                            var20 = var44.field5249 = class230.method1461((byte) 64, var11);
                                            var19 = var44.field5250 = class230.method1461((byte) 64, var12);
                                            var22 = var44.field5248 = class230.method1461((byte) 64, var13);
                                            var21 = var44.field5247 = client.method1862((byte) 3, var14);
                                        }
                                        short var45 = this.field9997[var35];
                                        short var46 = this.field9999[var35];
                                        short var47 = this.field9953[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field9933[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var20[var52] += var45;
                                                var19[var52] += var46;
                                                var22[var52] += var47;
                                                var21[var52] += var49;
                                            }
                                        }
                                        short var53 = var11[var41];
                                        int var54 = this.field9901[var31];
                                        int var55 = this.field9901[var31 + 1];
                                        short var56 = var13[var41];
                                        byte var57 = var14[var41];
                                        short var58 = var12[var41];
                                        for (int var59 = var54; var59 < var55; var59++) {
                                            int var60 = this.field9959[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var17[var60] += var53;
                                                var16[var60] += var58;
                                                var15[var60] += var56;
                                                var18[var60] += var57;
                                            }
                                        }
                                        if (this.field9934 == null && this.field9893 != null) {
                                            this.field9893.field7506 = null;
                                        }
                                        if (this.field9934 != null) {
                                            this.field9934.field7506 = null;
                                        }
                                        if (var6.field9934 == null && var6.field9893 != null) {
                                            var6.field9893.field7506 = null;
                                        }
                                        if (var6.field9934 != null) {
                                            var6.field9934.field7506 = null;
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

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "()V", line = 6619)
    public final void method181() {
        field9988++;
        if (this.field9898 <= 0 || this.field9882 <= 0) {
            return;
        }
        this.method4022(0, false);
        if ((this.field9943 & 0x10) == 0 && this.field9906.field3862 == null) {
            this.method4026(11297, false);
        }
        this.method4017((byte) -78);
    }
}
