import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class576 extends class283 {

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "[I")
    private int[] field8162;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    private int field8157;

    @OriginalMember(owner = "client!qd", name = "mb", descriptor = "I")
    private int field8181;

    @OriginalMember(owner = "client!qd", name = "qb", descriptor = "I")
    private int field8185;

    @OriginalMember(owner = "client!qd", name = "Mb", descriptor = "[S")
    private short[] field8207;

    @OriginalMember(owner = "client!qd", name = "hb", descriptor = "I")
    private int field8176;

    @OriginalMember(owner = "client!qd", name = "sb", descriptor = "[I")
    private int[] field8187;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    private int field8151;

    @OriginalMember(owner = "client!qd", name = "vb", descriptor = "[I")
    private int[] field8190;

    @OriginalMember(owner = "client!qd", name = "gc", descriptor = "[I")
    private int[] field8227;

    @OriginalMember(owner = "client!qd", name = "Vb", descriptor = "[Lhr;")
    private class57[] field8216;

    @OriginalMember(owner = "client!qd", name = "wb", descriptor = "[Loo;")
    private class648[] field8191;

    @OriginalMember(owner = "client!qd", name = "hc", descriptor = "I")
    private int field8228;

    @OriginalMember(owner = "client!qd", name = "ic", descriptor = "[Les;")
    private class298[] field8229;

    @OriginalMember(owner = "client!qd", name = "Lb", descriptor = "[Lke;")
    private class356[] field8206;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "[S")
    private short[] field8137;

    @OriginalMember(owner = "client!qd", name = "mc", descriptor = "[S")
    private short[] field8233;

    @OriginalMember(owner = "client!qd", name = "Fc", descriptor = "[S")
    private short[] field8252;

    @OriginalMember(owner = "client!qd", name = "dc", descriptor = "[S")
    private short[] field8224;

    @OriginalMember(owner = "client!qd", name = "lb", descriptor = "[S")
    private short[] field8180;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "S")
    private short field8159;

    @OriginalMember(owner = "client!qd", name = "oc", descriptor = "[B")
    private byte[] field8235;

    @OriginalMember(owner = "client!qd", name = "xb", descriptor = "[S")
    private short[] field8192;

    @OriginalMember(owner = "client!qd", name = "jb", descriptor = "[B")
    private byte[] field8178;

    @OriginalMember(owner = "client!qd", name = "nb", descriptor = "[S")
    private short[] field8182;

    @OriginalMember(owner = "client!qd", name = "Rb", descriptor = "[S")
    private short[] field8212;

    @OriginalMember(owner = "client!qd", name = "Ib", descriptor = "[F")
    private float[] field8203;

    @OriginalMember(owner = "client!qd", name = "Ec", descriptor = "[S")
    private short[] field8251;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "[S")
    private short[] field8161;

    @OriginalMember(owner = "client!qd", name = "wc", descriptor = "[S")
    private short[] field8243;

    @OriginalMember(owner = "client!qd", name = "Dc", descriptor = "S")
    private short field8250;

    @OriginalMember(owner = "client!qd", name = "rc", descriptor = "[F")
    private float[] field8238;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "[S")
    private short[] field8138;

    @OriginalMember(owner = "client!qd", name = "pb", descriptor = "[I")
    private int[] field8184;

    @OriginalMember(owner = "client!qd", name = "bc", descriptor = "[I")
    private int[] field8222;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "[I")
    private int[] field8166;

    @OriginalMember(owner = "client!qd", name = "rb", descriptor = "I")
    private int field8186;

    @OriginalMember(owner = "client!qd", name = "Sb", descriptor = "I")
    private int field8213;

    @OriginalMember(owner = "client!qd", name = "yc", descriptor = "[[I")
    private int[][] field8245;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "[[I")
    private int[][] field8140;

    @OriginalMember(owner = "client!qd", name = "Gb", descriptor = "[[I")
    private int[][] field8201;

    @OriginalMember(owner = "client!qd", name = "Tb", descriptor = "Z")
    private boolean field8214;

    @OriginalMember(owner = "client!qd", name = "zc", descriptor = "Z")
    private boolean field8246;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "Z")
    private boolean field8169;

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "Z")
    private boolean field8173;

    @OriginalMember(owner = "client!qd", name = "vc", descriptor = "Z")
    private boolean field8242;

    @OriginalMember(owner = "client!qd", name = "lc", descriptor = "Lpga;")
    private class492 field8232;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "Lao;")
    private class65 field8139;

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "Lao;")
    private class65 field8174;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "Lao;")
    private class65 field8152;

    @OriginalMember(owner = "client!qd", name = "jc", descriptor = "Lao;")
    private class65 field8230;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "Lhga;")
    private class300 field8163;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public static int field8155 = 0;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    private int field8135;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field8142;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field8146;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public static int field8156;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public static int field8160;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
    private int field8165;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
    public static int field8167;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
    public static int field8168;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "I")
    public static int field8171;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!qd", name = "ib", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!qd", name = "kb", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!qd", name = "ob", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!qd", name = "tb", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!qd", name = "ub", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!qd", name = "yb", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!qd", name = "zb", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!qd", name = "Ab", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!qd", name = "Bb", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!qd", name = "Cb", descriptor = "I")
    public static int field8197;

    @OriginalMember(owner = "client!qd", name = "Db", descriptor = "I")
    public static int field8198;

    @OriginalMember(owner = "client!qd", name = "Eb", descriptor = "I")
    public static int field8199;

    @OriginalMember(owner = "client!qd", name = "Fb", descriptor = "I")
    public static int field8200;

    @OriginalMember(owner = "client!qd", name = "Hb", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!qd", name = "Jb", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!qd", name = "Kb", descriptor = "I")
    public static int field8205;

    @OriginalMember(owner = "client!qd", name = "Nb", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!qd", name = "Ob", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!qd", name = "Pb", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!qd", name = "Qb", descriptor = "I")
    private int field8211;

    @OriginalMember(owner = "client!qd", name = "Ub", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!qd", name = "Wb", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!qd", name = "Xb", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!qd", name = "Yb", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!qd", name = "Zb", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!qd", name = "ac", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!qd", name = "cc", descriptor = "I")
    private int field8223;

    @OriginalMember(owner = "client!qd", name = "ec", descriptor = "I")
    public static int field8225;

    @OriginalMember(owner = "client!qd", name = "fc", descriptor = "I")
    public static int field8226;

    @OriginalMember(owner = "client!qd", name = "kc", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!qd", name = "nc", descriptor = "I")
    private int field8234;

    @OriginalMember(owner = "client!qd", name = "pc", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!qd", name = "qc", descriptor = "I")
    public static int field8237;

    @OriginalMember(owner = "client!qd", name = "sc", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!qd", name = "tc", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!qd", name = "uc", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!qd", name = "xc", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!qd", name = "Ac", descriptor = "I")
    private int field8247;

    @OriginalMember(owner = "client!qd", name = "Bc", descriptor = "I")
    private int field8248;

    @OriginalMember(owner = "client!qd", name = "Gc", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!qd", name = "Hc", descriptor = "I")
    public static int field8254;

    @OriginalMember(owner = "client!qd", name = "Ic", descriptor = "I")
    private int field8255;

    @OriginalMember(owner = "client!qd", name = "Jc", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!qd", name = "Kc", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!qd", name = "Cc", descriptor = "Lqda;")
    private class119 field8249;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "Lc", descriptor = "Ljava/lang/Class;")
    public static Class field8258;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3445(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "()[Lhr;", line = 6)
    public final class57[] method1158() {
        field8170++;
        return this.field8216;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 16)
    private final void method3426(int arg0) {
        field8129++;
        if (this.field8229 != null) {
            this.field8232.method2148(!this.field8214);
            this.field8232.method2910(false, (byte) -49);
            this.field8232.method2946(1, class123.field1675, (byte) 127);
            this.field8232.method2923(-96, 1, class123.field1675);
            for (int var2 = 0; var2 < this.field8228; var2++) {
                class298 var3 = this.field8229[var2];
                class356 var4 = this.field8206[var2];
                if (!var3.field3897 || !this.field8232.method569()) {
                    float var5 = (float) (this.field8190[var3.field3900] + this.field8190[var3.field3893] + this.field8190[var3.field3898]) * 0.3333333F;
                    float var6 = (float) (this.field8187[var3.field3900] + this.field8187[var3.field3893] + this.field8187[var3.field3898]) * 0.3333333F;
                    float var7 = (float) (this.field8227[var3.field3898] + this.field8227[var3.field3900] + this.field8227[var3.field3893]) * 0.3333333F;
                    float var8 = class231.field3216 * var7 + class497.field6966 * var6 + class327.field4204 * var5 + class207.field2952;
                    float var9 = class140.field1928 * var7 + class645.field9149 * var5 + class542.field7581 * var6 + class439.field6022;
                    float var10 = class460.field6320 * var7 + class743.field10351 * var6 + class123.field1688 * var5 + class211.field2991;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9))) * (float) var3.field3903;
                    class173 var12 = this.field8232.method2891(-56);
                    var12.method1082(arg0 - 17164, var4.field4578, (float) var4.field4574 + var8 - var8 * var11, var3.field3899 * var4.field4567 >> 7, (float) var4.field4568 + var9 - var9 * var11, var3.field3889 * var4.field4577 >> 7, var10 - var10 * var11);
                    var12.method1083(arg0 ^ 0x4320, this.field8232.field6805);
                    this.field8232.method2901((byte) 53);
                    int var13 = var4.field4569;
                    this.field8232.method2951(true, false, false, var3.field3892);
                    this.field8232.method2945(var3.field3895, 22630);
                    this.field8232.method2912((byte) 9, var13);
                    this.field8232.method2879((byte) 3);
                }
            }
            this.field8232.method2923(-103, 1, class214.field3017);
            this.field8232.method2946(1, class214.field3017, (byte) 127);
            this.field8232.method2148(true);
        }
        if (arg0 != 17166) {
            this.method1154(-13, -92, null, null, 100, -88, -13);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILuha;ZI)Z", line = 81)
    public final boolean method1155(int arg0, int arg1, class723 arg2, boolean arg3, int arg4) {
        field8149++;
        return this.method3430(arg1, -1, (byte) 95, arg0, arg2, arg4, arg3);
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V", line = 90)
    private final void method3427(int arg0) {
        field8177++;
        if (!this.field8242) {
            return;
        }
        this.field8242 = false;
        if (this.field8216 == null && this.field8191 == null && this.field8229 == null) {
            if (this.field8190 != null && !class609.method3560(this.field8213, this.field8185, 458752)) {
                if (this.field8139 == null || this.field8139.method429((byte) -82)) {
                    if (!this.field8173) {
                        this.method3435((byte) -121);
                    }
                    this.field8190 = null;
                } else {
                    this.field8242 = true;
                }
            }
            if (this.field8187 != null && !class530.method3150(77, this.field8213, this.field8185)) {
                if (this.field8139 == null || this.field8139.method429((byte) -82)) {
                    if (!this.field8173) {
                        this.method3435((byte) -128);
                    }
                    this.field8187 = null;
                } else {
                    this.field8242 = true;
                }
            }
            if (this.field8227 != null && !class186.method1248(this.field8213, 42, this.field8185)) {
                if (this.field8139 == null || this.field8139.method429((byte) -82)) {
                    if (!this.field8173) {
                        this.method3435((byte) -123);
                    }
                    this.field8227 = null;
                } else {
                    this.field8242 = true;
                }
            }
        }
        if (this.field8180 != null && this.field8190 == null && this.field8187 == null && this.field8227 == null) {
            this.field8180 = null;
            this.field8162 = null;
        }
        if (this.field8178 != null && !class347.method1987(this.field8213, this.field8185, arg0 + 73734)) {
            label207: {
                label206: {
                    boolean var10000;
                    if ((this.field8213 & 0x37) == 0) {
                        if (this.field8152 == null || this.field8152.method429((byte) -82)) {
                            break label206;
                        }
                        var10000 = false;
                    } else {
                        if (this.field8230 == null || this.field8230.method429((byte) -82)) {
                            break label206;
                        }
                        var10000 = false;
                    }
                    if (!var10000) {
                        this.field8242 = true;
                        break label207;
                    }
                }
                this.field8243 = this.field8251 = this.field8137 = null;
                this.field8178 = null;
            }
        }
        if (this.field8224 != null && !class7.method29(this.field8185, this.field8213, 0)) {
            if (this.field8152 == null || this.field8152.method429((byte) -82)) {
                this.field8224 = null;
            } else {
                this.field8242 = true;
            }
        }
        if (this.field8235 != null && !class471.method2802((byte) -117, this.field8213, this.field8185)) {
            if (this.field8152 == null || this.field8152.method429((byte) -82)) {
                this.field8235 = null;
            } else {
                this.field8242 = true;
            }
        }
        if (this.field8238 != null && !class647.method3750(this.field8185, -32446, this.field8213)) {
            if (this.field8174 == null || this.field8174.method429((byte) -82)) {
                this.field8238 = this.field8203 = null;
            } else {
                this.field8242 = true;
            }
        }
        if (this.field8252 != null && !class121.method785(2048, this.field8213, this.field8185)) {
            if (this.field8152 == null || this.field8152.method429((byte) -82)) {
                this.field8252 = null;
            } else {
                this.field8242 = true;
            }
        }
        if (this.field8233 != null && !class142.method932(this.field8185, 0, this.field8213)) {
            if ((this.field8163 == null || this.field8163.method1762(2075817543)) && (this.field8152 == null || this.field8152.method429((byte) -82))) {
                this.field8233 = this.field8138 = this.field8182 = null;
            } else {
                this.field8242 = true;
            }
        }
        if (this.field8192 != null) {
            if (this.field8139 == null || this.field8139.method429((byte) -82)) {
                this.field8192 = null;
            } else {
                this.field8242 = true;
            }
        }
        if (this.field8161 != null) {
            if (this.field8152 == null || this.field8152.method429((byte) -82)) {
                this.field8161 = null;
            } else {
                this.field8242 = true;
            }
        }
        if (this.field8201 != null && !class226.method1468(this.field8185, this.field8213, 7961)) {
            this.field8201 = null;
            this.field8212 = null;
        }
        if (this.field8245 != null && !class218.method1427((byte) -91, this.field8213, this.field8185)) {
            this.field8245 = null;
            this.field8207 = null;
        }
        if (arg0 != -8198) {
            return;
        }
        if (this.field8140 != null && !class50.method346(this.field8213, (byte) 124, this.field8185)) {
            this.field8140 = null;
        }
        if (this.field8184 != null && (this.field8185 & 0x800) == 0 && (this.field8185 & 0x40000) == 0) {
            this.field8222 = null;
            this.field8166 = null;
            this.field8184 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V", line = 272)
    private final void method3428(int arg0) {
        if (arg0 != -1) {
            this.method1123();
        }
        field8208++;
        if (this.field8139 != null) {
            this.field8139.field901 = false;
        }
    }

    @OriginalMember(owner = "client!qd", name = "EA", descriptor = "()I", line = 285)
    public final int method1126() {
        if (!this.field8173) {
            this.method3435((byte) -123);
        }
        field8158++;
        return this.field8247;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()[Loo;", line = 298)
    public final class648[] method1145() {
        field8231++;
        return this.field8191;
    }

    @OriginalMember(owner = "client!qd", name = "ma", descriptor = "()I", line = 308)
    public final int method1113() {
        field8256++;
        if (!this.field8173) {
            this.method3435((byte) -124);
        }
        return this.field8135;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)V", line = 321)
    public final void method1149(int arg0, int arg1, int arg2, int arg3) {
        field8136++;
        for (int var5 = 0; var5 < this.field8157; var5++) {
            int var9 = this.field8224[var5] & 0xFFFF;
            int var10 = (var9 & 0xFC98) >> 10;
            int var11 = var9 >> 7 & 0x7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field8224[var5] = (short) class747.method4153(class747.method4153(var10 << 10, var11 << 7), var12);
        }
        if (this.field8229 != null) {
            for (int var6 = 0; var6 < this.field8228; var6++) {
                class298 var7 = this.field8229[var6];
                class356 var8 = this.field8206[var6];
                var8.field4569 = class673.field9471[this.field8224[var7.field3890] & 0xFFFF] & 0xFFFFFF | var8.field4569 & 0xFF000000;
            }
        }
        this.method3431(9);
    }

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "()I", line = 376)
    public final int method1114() {
        field8194++;
        if (!this.field8173) {
            this.method3435((byte) -126);
        }
        return this.field8248;
    }

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "(IIII)V", line = 390)
    public final void method1166(int arg0, int arg1, int arg2, int arg3) {
        field8198++;
        if (arg0 == 0) {
            class561.field7973 = 0;
            int var5 = 0;
            class631.field8997 = 0;
            class483.field6545 = 0;
            for (int var6 = 0; var6 < this.field8176; var6++) {
                class561.field7973 += this.field8190[var6];
                class631.field8997 += this.field8187[var6];
                class483.field6545 += this.field8227[var6];
                var5++;
            }
            if (var5 <= 0) {
                class631.field8997 = arg2;
                class483.field6545 = arg3;
                class561.field7973 = arg1;
            } else {
                class631.field8997 = class631.field8997 / var5 + arg2;
                class561.field7973 = class561.field7973 / var5 + arg1;
                class483.field6545 = class483.field6545 / var5 + arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field8176; var7++) {
                this.field8190[var7] += arg1;
                this.field8187[var7] += arg2;
                this.field8227[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field8176; var8++) {
                this.field8190[var8] -= class561.field7973;
                this.field8187[var8] -= class631.field8997;
                this.field8227[var8] -= class483.field6545;
                if (arg3 != 0) {
                    int var9 = class231.field3217[arg3];
                    int var10 = class231.field3218[arg3];
                    int var11 = this.field8190[var8] * var10 + this.field8187[var8] * var9 + 16383 >> 14;
                    this.field8187[var8] = this.field8187[var8] * var10 + 16383 - (this.field8190[var8] * var9) >> 14;
                    this.field8190[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class231.field3217[arg1];
                    int var13 = class231.field3218[arg1];
                    int var14 = this.field8187[var8] * var13 + 16383 - this.field8227[var8] * var12 >> 14;
                    this.field8227[var8] = this.field8187[var8] * var12 + this.field8227[var8] * var13 + 16383 >> 14;
                    this.field8187[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class231.field3217[arg2];
                    int var16 = class231.field3218[arg2];
                    int var17 = this.field8227[var8] * var15 + this.field8190[var8] * var16 + 16383 >> 14;
                    this.field8227[var8] = this.field8227[var8] * var16 + 16383 - this.field8190[var8] * var15 >> 14;
                    this.field8190[var8] = var17;
                }
                this.field8190[var8] += class561.field7973;
                this.field8187[var8] += class631.field8997;
                this.field8227[var8] += class483.field6545;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field8176; var18++) {
                this.field8190[var18] -= class561.field7973;
                this.field8187[var18] -= class631.field8997;
                this.field8227[var18] -= class483.field6545;
                this.field8190[var18] = this.field8190[var18] * arg1 / 128;
                this.field8187[var18] = this.field8187[var18] * arg2 / 128;
                this.field8227[var18] = this.field8227[var18] * arg3 / 128;
                this.field8190[var18] += class561.field7973;
                this.field8187[var18] += class631.field8997;
                this.field8227[var18] += class483.field6545;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field8157; var19++) {
                int var23 = (this.field8235[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field8235[var19] = (byte) var23;
            }
            if (this.field8229 != null) {
                for (int var20 = 0; var20 < this.field8228; var20++) {
                    class298 var21 = this.field8229[var20];
                    class356 var22 = this.field8206[var20];
                    var22.field4569 = 255 - (this.field8235[var21.field3890] & 0xFF) << 24 | var22.field4569 & 0xFFFFFF;
                }
            }
            this.method3431(9);
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field8157; var24++) {
                int var28 = this.field8224[var24] & 0xFFFF;
                int var29 = (var28 & 0xFC15) >> 10;
                int var30 = (var28 & 0x39B) >> 7;
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
                this.field8224[var24] = (short) class747.method4153(var34, class747.method4153(var31 << 7, var33 << 10));
            }
            if (this.field8229 != null) {
                for (int var25 = 0; var25 < this.field8228; var25++) {
                    class298 var26 = this.field8229[var25];
                    class356 var27 = this.field8206[var25];
                    var27.field4569 = var27.field4569 & 0xFF000000 | class673.field9471[this.field8224[var26.field3890] & 0xFFFF] & 0xFFFFFF;
                }
            }
            this.method3431(9);
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field8228; var35++) {
                class356 var36 = this.field8206[var35];
                var36.field4574 += arg1;
                var36.field4568 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field8228; var37++) {
                class356 var38 = this.field8206[var37];
                var38.field4577 = var38.field4577 * arg2 >> 7;
                var38.field4567 = var38.field4567 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field8228; var39++) {
                class356 var40 = this.field8206[var39];
                var40.field4578 = var40.field4578 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILuha;ZII)Z", line = 701)
    public final boolean method1151(int arg0, int arg1, class723 arg2, boolean arg3, int arg4, int arg5) {
        field8141++;
        return this.method3430(arg1, arg5, (byte) 101, arg0, arg2, arg4, arg3);
    }

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "()V", line = 709)
    public final void method1150() {
        field8147++;
        for (int var1 = 0; var1 < this.field8176; var1++) {
            this.field8227[var1] = -this.field8227[var1];
        }
        for (int var2 = 0; var2 < this.field8186; var2++) {
            this.field8137[var2] = (short) (-this.field8137[var2]);
        }
        for (int var3 = 0; var3 < this.field8157; var3++) {
            short var4 = this.field8233[var3];
            this.field8233[var3] = this.field8182[var3];
            this.field8182[var3] = var4;
        }
        this.method3428(-1);
        this.method3429(-53);
        this.method3442(false);
        this.field8173 = false;
    }

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "(III)V", line = 751)
    public final void method1161(int arg0, int arg1, int arg2) {
        field8219++;
        for (int var4 = 0; var4 < this.field8176; var4++) {
            if (arg0 != 128) {
                this.field8190[var4] = this.field8190[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field8187[var4] = this.field8187[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field8227[var4] = this.field8227[var4] * arg2 >> 7;
            }
        }
        this.method3428(-1);
        this.field8173 = false;
    }

    @OriginalMember(owner = "client!qd", name = "WA", descriptor = "()I", line = 783)
    public final int method1119() {
        field8179++;
        return this.field8250;
    }

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "()Z", line = 793)
    public final boolean method1140() {
        field8175++;
        return this.field8246;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Luha;Lau;II)V", line = 801)
    public final void method1164(class723 arg0, class247 arg1, int arg2, int arg3) {
        field8225++;
        if (this.field8186 == 0) {
            return;
        }
        class173 var5 = this.field8232.field6801;
        if (!this.field8173) {
            this.method3435((byte) -121);
        }
        class173 var6 = (class173) arg0;
        class743.field10351 = var5.field2331 * var6.field2339 + var5.field2339 * var6.field2364 + var5.field2332 * var6.field2352;
        class211.field2991 = var5.field2331 * var6.field2328 + var5.field2339 * var6.field2340 + var5.field2332 * var6.field2343 + var5.field2328;
        float var7 = (float) this.field8211 * class743.field10351 + class211.field2991;
        float var8 = (float) this.field8247 * class743.field10351 + class211.field2991;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var9 = (float) this.field8255 + var7;
            var10 = var8 - (float) this.field8255;
        } else {
            var9 = (float) this.field8255 + var8;
            var10 = var7 - (float) this.field8255;
        }
        if ((this.field8232.field6848 <= var10) || (var9 <= (float) this.field8232.field6878)) {
            return;
        }
        class207.field2952 = var5.field2370 * var6.field2328 + var5.field2372 * var6.field2343 + var5.field2352 * var6.field2340 + var5.field2343;
        class497.field6966 = var5.field2370 * var6.field2339 + var5.field2372 * var6.field2352 + var5.field2352 * var6.field2364;
        float var11 = (float) this.field8211 * class497.field6966 + class207.field2952;
        float var12 = (float) this.field8247 * class497.field6966 + class207.field2952;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = (var12 - (float) this.field8255) * (float) this.field8232.field6821;
            var14 = ((float) this.field8255 + var11) * (float) this.field8232.field6821;
        } else {
            var14 = ((float) this.field8255 + var12) * (float) this.field8232.field6821;
            var13 = ((float) (-this.field8255) + var11) * (float) this.field8232.field6821;
        }
        if ((this.field8232.field6815 <= var13 / (float) arg2) || (var14 / (float) arg2 <= this.field8232.field6904)) {
            return;
        }
        class542.field7581 = var5.field2335 * var6.field2339 + var5.field2378 * var6.field2352 + var5.field2364 * var6.field2364;
        class439.field6022 = var5.field2335 * var6.field2328 + var5.field2378 * var6.field2343 + var5.field2364 * var6.field2340 + var5.field2340;
        float var15 = (float) this.field8211 * class542.field7581 + class439.field6022;
        float var16 = (float) this.field8247 * class542.field7581 + class439.field6022;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = (var16 - (float) this.field8255) * (float) this.field8232.field6882;
            var18 = ((float) this.field8255 + var15) * (float) this.field8232.field6882;
        } else {
            var17 = (var15 - (float) this.field8255) * (float) this.field8232.field6882;
            var18 = ((float) this.field8255 + var16) * (float) this.field8232.field6882;
        }
        if ((this.field8232.field6897 <= var17 / (float) arg2) || (this.field8232.field6908 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field8229 != null) {
            class460.field6320 = var5.field2331 * var6.field2331 + var5.field2339 * var6.field2335 + var5.field2332 * var6.field2370;
            class140.field1928 = var5.field2335 * var6.field2331 + var5.field2378 * var6.field2370 + var5.field2364 * var6.field2335;
            class123.field1688 = var5.field2331 * var6.field2332 + var5.field2339 * var6.field2378 + var5.field2332 * var6.field2372;
            class231.field3216 = var5.field2370 * var6.field2331 + var5.field2372 * var6.field2370 + var5.field2352 * var6.field2335;
            class645.field9149 = var5.field2335 * var6.field2332 + var5.field2378 * var6.field2372 + var5.field2364 * var6.field2378;
            class327.field4204 = var5.field2370 * var6.field2332 + var5.field2372 * var6.field2372 + var5.field2352 * var6.field2378;
        }
        if (arg1 != null) {
            int var19 = this.field8248 + this.field8223 >> 1;
            int var20 = this.field8234 + this.field8165 >> 1;
            int var21 = (int) ((float) var20 * class231.field3216 + (float) this.field8211 * class497.field6966 + (float) var19 * class327.field4204 + class207.field2952);
            int var22 = (int) ((float) var20 * class140.field1928 + (float) this.field8211 * class542.field7581 + (float) var19 * class645.field9149 + class439.field6022);
            int var23 = (int) ((float) var20 * class460.field6320 + (float) this.field8211 * class743.field10351 + (float) var19 * class123.field1688 + class211.field2991);
            int var24 = (int) ((float) var20 * class231.field3216 + (float) this.field8247 * class497.field6966 + (float) var19 * class327.field4204 + class207.field2952);
            int var25 = (int) ((float) var20 * class140.field1928 + (float) this.field8247 * class542.field7581 + (float) var19 * class645.field9149 + class439.field6022);
            arg1.field3429 = this.field8232.field6882 * var22 / arg2 + this.field8232.field6905;
            arg1.field3433 = this.field8232.field6882 * var25 / arg2 + this.field8232.field6905;
            arg1.field3428 = this.field8232.field6821 * var21 / arg2 + this.field8232.field6829;
            arg1.field3430 = this.field8232.field6829 + (this.field8232.field6821 * var24 / arg2);
            int var26 = (int) ((float) var20 * class460.field6320 + (float) this.field8247 * class743.field10351 + (float) var19 * class123.field1688 + class211.field2991);
            if (this.field8232.field6878 <= var23 || this.field8232.field6878 <= var26) {
                arg1.field3431 = true;
                arg1.field3432 = this.field8232.field6829 + ((this.field8255 + var21) * this.field8232.field6821 / arg2) - arg1.field3428;
            }
        }
        this.field8232.method2932((float) arg2, 17736);
        this.field8232.method2952(-114);
        this.field8232.method2873(0, var6);
        this.method3437((byte) -110);
        this.method3426(17166);
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V", line = 951)
    private final void method3429(int arg0) {
        field8196++;
        int var2 = -3 % ((57 - arg0) / 51);
        if ((this.field8213 & 0x37) == 0) {
            if (this.field8152 == null) {
                return;
            }
            this.field8152.field901 = false;
        } else if (this.field8230 != null) {
            this.field8230.field901 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIBILuha;IZ)Z", line = 975)
    private final boolean method3430(int arg0, int arg1, byte arg2, int arg3, class723 arg4, int arg5, boolean arg6) {
        field8210++;
        class173 var8 = (class173) arg4;
        class173 var9 = this.field8232.field6801;
        float var10 = var8.field2328 * var9.field2370 + var8.field2343 * var9.field2372 + var8.field2340 * var9.field2352 + var9.field2343;
        float var11 = var8.field2328 * var9.field2335 + var8.field2343 * var9.field2378 + var8.field2340 * var9.field2364 + var9.field2340;
        class497.field6966 = var8.field2339 * var9.field2370 + var8.field2364 * var9.field2352 + var8.field2352 * var9.field2372;
        float var12 = var8.field2328 * var9.field2331 + var8.field2343 * var9.field2332 + var8.field2340 * var9.field2339 + var9.field2328;
        class460.field6320 = var8.field2331 * var9.field2331 + var8.field2370 * var9.field2332 + var8.field2335 * var9.field2339;
        class231.field3216 = var8.field2331 * var9.field2370 + var8.field2370 * var9.field2372 + var8.field2335 * var9.field2352;
        class542.field7581 = var8.field2339 * var9.field2335 + var8.field2364 * var9.field2364 + var8.field2352 * var9.field2378;
        class140.field1928 = var8.field2331 * var9.field2335 + var8.field2370 * var9.field2378 + var8.field2335 * var9.field2364;
        class123.field1688 = var8.field2332 * var9.field2331 + var8.field2378 * var9.field2339 + var8.field2372 * var9.field2332;
        class743.field10351 = var8.field2339 * var9.field2331 + var8.field2364 * var9.field2339 + var8.field2352 * var9.field2332;
        class327.field4204 = var8.field2332 * var9.field2370 + var8.field2378 * var9.field2352 + var8.field2372 * var9.field2372;
        class645.field9149 = var8.field2332 * var9.field2335 + var8.field2378 * var9.field2364 + var8.field2372 * var9.field2378;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field8232.field6821;
        int var19 = this.field8232.field6882;
        if (!this.field8173) {
            this.method3435((byte) -125);
        }
        int var20 = this.field8223 - this.field8248 >> 1;
        int var21 = this.field8247 - this.field8211 >> 1;
        int var22 = this.field8165 - this.field8234 >> 1;
        int var23 = this.field8248 + var20;
        int var24 = this.field8211 + var21;
        int var25 = this.field8234 + var22;
        int var26 = var23 - (var20 << arg5);
        int var27 = var24 - (var21 << arg5);
        int var28 = var25 - (var22 << arg5);
        int var29 = (var20 << arg5) + var23;
        int var30 = (var21 << arg5) + var24;
        class274.field3679[0] = var26;
        int var31 = var25 + (var22 << arg5);
        class721.field10180[0] = var27;
        class81.field1109[0] = var28;
        class274.field3679[1] = var29;
        class721.field10180[1] = var27;
        class274.field3679[2] = var26;
        class81.field1109[1] = var28;
        class721.field10180[2] = var30;
        class274.field3679[3] = var29;
        class81.field1109[2] = var28;
        if (arg2 < 66) {
            this.method1167(-33);
        }
        class721.field10180[3] = var30;
        class274.field3679[4] = var26;
        class81.field1109[3] = var28;
        class721.field10180[4] = var27;
        class81.field1109[4] = var31;
        class274.field3679[5] = var29;
        class721.field10180[5] = var27;
        class274.field3679[6] = var26;
        class81.field1109[5] = var31;
        class721.field10180[6] = var30;
        class81.field1109[6] = var31;
        class274.field3679[7] = var29;
        class721.field10180[7] = var30;
        class81.field1109[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var51 = (float) class81.field1109[var32];
            float var52 = (float) class721.field10180[var32];
            float var53 = (float) class274.field3679[var32];
            float var54 = class231.field3216 * var51 + class497.field6966 * var52 + class327.field4204 * var53 + var10;
            float var55 = class460.field6320 * var51 + class743.field10351 * var52 + class123.field1688 * var53 + var12;
            float var56 = class140.field1928 * var51 + class645.field9149 * var53 + class542.field7581 * var52 + var11;
            if ((float) this.field8232.field6878 <= var55) {
                if (arg1 > 0) {
                    var55 = arg1;
                }
                float var57 = (float) var18 * var54 / var55 + (float) this.field8232.field6829;
                if (var57 > var15) {
                    var15 = var57;
                }
                float var58 = (float) var19 * var56 / var55 + (float) this.field8232.field6905;
                if (var57 < var14) {
                    var14 = var57;
                }
                if (var58 < var16) {
                    var16 = var58;
                }
                var13 = true;
                if (var17 < var58) {
                    var17 = var58;
                }
            }
        }
        if (var13 && (float) arg3 > var14 && (float) arg3 < var15 && (float) arg0 > var16 && (float) arg0 < var17) {
            if (arg6) {
                return true;
            }
            if (class64.field895.length < this.field8186) {
                class36.field514 = new int[this.field8186];
                class64.field895 = new int[this.field8186];
            }
            for (int var33 = 0; var33 < this.field8176; var33++) {
                float var35 = (float) this.field8190[var33];
                float var36 = (float) this.field8187[var33];
                float var37 = (float) this.field8227[var33];
                float var38 = class140.field1928 * var37 + class645.field9149 * var35 + class542.field7581 * var36 + var11;
                float var39 = class231.field3216 * var37 + class497.field6966 * var36 + class327.field4204 * var35 + var10;
                float var40 = class460.field6320 * var37 + class743.field10351 * var36 + class123.field1688 * var35 + var12;
                if ((float) this.field8232.field6878 <= var40) {
                    if (arg1 > 0) {
                        var40 = arg1;
                    }
                    int var41 = (int) ((float) var18 * var39 / var40 + (float) this.field8232.field6829);
                    int var42 = (int) ((float) var19 * var38 / var40 + (float) this.field8232.field6905);
                    int var43 = this.field8162[var33];
                    int var44 = this.field8162[var33 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field8180[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        class64.field895[var46] = var41;
                        class36.field514[var46] = var42;
                    }
                } else {
                    int var47 = this.field8162[var33];
                    int var48 = this.field8162[var33 + 1];
                    for (int var49 = var47; var49 < var48; var49++) {
                        int var50 = this.field8180[var49] - 1;
                        if (var50 == -1) {
                            break;
                        }
                        class64.field895[this.field8180[var49] - 1] = -999999;
                    }
                }
            }
            for (int var34 = 0; var34 < this.field8157; var34++) {
                if (class64.field895[this.field8233[var34]] != -999999 && class64.field895[this.field8138[var34]] != -999999 && class64.field895[this.field8182[var34]] != -999999 && this.method3438(class36.field514[this.field8233[var34]], arg3, class36.field514[this.field8182[var34]], -29864, arg0, class64.field895[this.field8182[var34]], class64.field895[this.field8233[var34]], class64.field895[this.field8138[var34]], class36.field514[this.field8138[var34]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V", line = 1229)
    private final void method3431(int arg0) {
        if (arg0 != 9) {
            this.field8157 = -32;
        }
        field8142++;
        if (this.field8152 != null) {
            this.field8152.field901 = false;
        }
    }

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "(IILs;Ls;III)V", line = 1245)
    public final void method1154(int arg0, int arg1, class339 arg2, class339 arg3, int arg4, int arg5, int arg6) {
        field8240++;
        if (!this.field8173) {
            this.method3435((byte) -128);
        }
        int var8 = this.field8248 + arg4;
        int var9 = this.field8223 + arg4;
        int var10 = arg6 + this.field8234;
        int var11 = this.field8165 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field4344 <= (var9 + arg2.field4346 >> arg2.field4349) || var10 < 0 || (var11 + arg2.field4346 >> arg2.field4349) >= arg2.field4348) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field4344 <= (arg3.field4346 + var9 >> arg3.field4349) || var10 < 0 || arg3.field4346 + var11 >> arg3.field4349 >= arg3.field4348) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field4349;
            int var13 = var9 + arg2.field4346 - 1 >> arg2.field4349;
            int var14 = var10 >> arg2.field4349;
            int var15 = -(-arg2.field4346 - var11) - 1 >> arg2.field4349;
            if (arg2.method1959(124, var14, var12) == arg5 && arg2.method1959(123, var14, var13) == arg5 && arg2.method1959(126, var15, var12) == arg5 && arg5 == arg2.method1959(127, var15, var13)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field8176; var32++) {
                this.field8187[var32] += arg2.method1960(this.field8190[var32] + arg4, this.field8227[var32] + arg6, 119) - arg5;
            }
        } else if (arg0 == 2) {
            int var16 = this.field8211;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field8176; var17++) {
                int var18 = (this.field8187[var17] << 16) / var16;
                if (arg1 > var18) {
                    this.field8187[var17] += (arg1 - var18) * (arg2.method1960(this.field8190[var17] + arg4, this.field8227[var17] - -arg6, 118) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var28 = (arg1 & 0xFF) * 4;
            int var29 = ((arg1 & 0xFF73) >> 8) * 4;
            int var30 = arg1 >> 16 & 0xFF << 6;
            int var31 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var28 >> 1)) < 0 || (var28 >> 1) + arg2.field4346 + arg4 >= arg2.field4344 << arg2.field4349 || (arg6 - (var29 >> 1)) < 0 || (arg2.field4348 << arg2.field4349) <= ((var29 >> 1) + arg2.field4346 + arg6)) {
                return;
            }
            this.method1694(arg6, var31, (byte) -53, var30, arg2, arg5, var29, arg4, var28);
        } else if (arg0 == 4) {
            int var26 = this.field8247 - this.field8211;
            for (int var27 = 0; var27 < this.field8176; var27++) {
                this.field8187[var27] = this.field8187[var27] + arg3.method1960(this.field8190[var27] + arg4, this.field8227[var27] - -arg6, 116) + var26 - arg5;
            }
        } else if (arg0 == 5) {
            int var19 = this.field8247 - this.field8211;
            for (int var20 = 0; var20 < this.field8176; var20++) {
                int var21 = this.field8190[var20] + arg4;
                int var22 = this.field8227[var20] + arg6;
                int var23 = arg2.method1960(var21, var22, 119);
                int var24 = arg3.method1960(var21, var22, 125);
                int var25 = var23 - var24 - arg1;
                this.field8187[var20] = ((this.field8187[var20] << 8) / var19 * var25 >> 8) + var23 - arg5;
            }
        }
        this.method3428(-1);
        this.field8173 = false;
    }

    @OriginalMember(owner = "client!qd", name = "NA", descriptor = "()Z", line = 1401)
    public final boolean method1122() {
        field8195++;
        if (this.field8245 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field8151; var1++) {
            this.field8190[var1] <<= 0x4;
            this.field8187[var1] <<= 0x4;
            this.field8227[var1] <<= 0x4;
        }
        class561.field7973 = 0;
        class483.field6545 = 0;
        class631.field8997 = 0;
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[IIIIIZ)V", line = 1430)
    public final void method1142(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field8254++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            class561.field7973 = 0;
            class483.field6545 = 0;
            int var12 = 0;
            class631.field8997 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field8245.length > var14) {
                    int[] var15 = this.field8245[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class561.field7973 += this.field8190[var17];
                        class631.field8997 += this.field8187[var17];
                        class483.field6545 += this.field8227[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class561.field7973 = class561.field7973 / var12 + var11;
                class483.field6545 = class483.field6545 / var12 + var10;
                class631.field8997 = class631.field8997 / var12 + var9;
            } else {
                class561.field7973 = var11;
                class631.field8997 = var9;
                class483.field6545 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg4 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field8245.length > var22) {
                    int[] var23 = this.field8245[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field8190[var25] += var18;
                        this.field8187[var25] += var20;
                        this.field8227[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field8245.length) {
                    int[] var46 = this.field8245[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field8190[var48] -= class561.field7973;
                            this.field8187[var48] -= class631.field8997;
                            this.field8227[var48] -= class483.field6545;
                            if (arg4 != 0) {
                                int var49 = class231.field3217[arg4];
                                int var50 = class231.field3218[arg4];
                                int var51 = this.field8190[var48] * var50 + this.field8187[var48] * var49 + 16383 >> 14;
                                this.field8187[var48] = this.field8187[var48] * var50 + 16383 - (this.field8190[var48] * var49) >> 14;
                                this.field8190[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class231.field3217[arg2];
                                int var53 = class231.field3218[arg2];
                                int var54 = this.field8187[var48] * var53 + 16383 - this.field8227[var48] * var52 >> 14;
                                this.field8227[var48] = this.field8227[var48] * var53 + this.field8187[var48] * var52 + 16383 >> 14;
                                this.field8187[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class231.field3217[arg3];
                                int var56 = class231.field3218[arg3];
                                int var57 = this.field8227[var48] * var55 + (this.field8190[var48] * var56) + 16383 >> 14;
                                this.field8227[var48] = this.field8227[var48] * var56 + 16383 - (this.field8190[var48] * var55) >> 14;
                                this.field8190[var48] = var57;
                            }
                            this.field8190[var48] += class561.field7973;
                            this.field8187[var48] += class631.field8997;
                            this.field8227[var48] += class483.field6545;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field8190[var59] -= class561.field7973;
                            this.field8187[var59] -= class631.field8997;
                            this.field8227[var59] -= class483.field6545;
                            if (arg2 != 0) {
                                int var60 = class231.field3217[arg2];
                                int var61 = class231.field3218[arg2];
                                int var62 = this.field8187[var59] * var61 + 16383 - (this.field8227[var59] * var60) >> 14;
                                this.field8227[var59] = this.field8227[var59] * var61 + this.field8187[var59] * var60 + 16383 >> 14;
                                this.field8187[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class231.field3217[arg4];
                                int var64 = class231.field3218[arg4];
                                int var65 = this.field8190[var59] * var64 + this.field8187[var59] * var63 + 16383 >> 14;
                                this.field8187[var59] = this.field8187[var59] * var64 + 16383 - this.field8190[var59] * var63 >> 14;
                                this.field8190[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class231.field3217[arg3];
                                int var67 = class231.field3218[arg3];
                                int var68 = this.field8190[var59] * var67 + this.field8227[var59] * var66 + 16383 >> 14;
                                this.field8227[var59] = this.field8227[var59] * var67 + 16383 - (this.field8190[var59] * var66) >> 14;
                                this.field8190[var59] = var68;
                            }
                            this.field8190[var59] += class561.field7973;
                            this.field8187[var59] += class631.field8997;
                            this.field8227[var59] += class483.field6545;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field8245.length > var28) {
                        int[] var29 = this.field8245[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field8162[var31];
                            int var33 = this.field8162[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field8180[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class231.field3217[arg4];
                                    int var37 = class231.field3218[arg4];
                                    int var38 = this.field8251[var35] * var36 + this.field8243[var35] * var37 + 16383 >> 14;
                                    this.field8251[var35] = (short) (this.field8251[var35] * var37 + 16383 - (this.field8243[var35] * var36) >> 14);
                                    this.field8243[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class231.field3217[arg2];
                                    int var40 = class231.field3218[arg2];
                                    int var41 = this.field8251[var35] * var40 + 16383 - (this.field8137[var35] * var39) >> 14;
                                    this.field8137[var35] = (short) (this.field8251[var35] * var39 + this.field8137[var35] * var40 + 16383 >> 14);
                                    this.field8251[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class231.field3217[arg3];
                                    int var43 = class231.field3218[arg3];
                                    int var44 = this.field8137[var35] * var42 + (this.field8243[var35] * var43) + 16383 >> 14;
                                    this.field8137[var35] = (short) (this.field8137[var35] * var43 + 16383 - (this.field8243[var35] * var42) >> 14);
                                    this.field8243[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                this.method3429(-32);
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field8245.length > var70) {
                    int[] var71 = this.field8245[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field8190[var73] -= class561.field7973;
                        this.field8187[var73] -= class631.field8997;
                        this.field8227[var73] -= class483.field6545;
                        this.field8190[var73] = this.field8190[var73] * arg2 >> 7;
                        this.field8187[var73] = this.field8187[var73] * arg3 >> 7;
                        this.field8227[var73] = this.field8227[var73] * arg4 >> 7;
                        this.field8190[var73] += class561.field7973;
                        this.field8187[var73] += class631.field8997;
                        this.field8227[var73] += class483.field6545;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8201 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var79 = arg1[var75];
                    if (var79 < this.field8201.length) {
                        int[] var80 = this.field8201[var79];
                        for (int var81 = 0; var81 < var80.length; var81++) {
                            int var82 = var80[var81];
                            int var83 = (this.field8235[var82] & 0xFF) + arg2 * 8;
                            if (var83 < 0) {
                                var83 = 0;
                            } else if (var83 > 255) {
                                var83 = 255;
                            }
                            this.field8235[var82] = (byte) var83;
                        }
                        var74 |= var80.length > 0;
                    }
                }
                if (var74) {
                    if (this.field8229 != null) {
                        for (int var76 = 0; var76 < this.field8228; var76++) {
                            class298 var77 = this.field8229[var76];
                            class356 var78 = this.field8206[var76];
                            var78.field4569 = var78.field4569 & 0xFFFFFF | 255 - (this.field8235[var77.field3890] & 0xFF) << 24;
                        }
                    }
                    this.method3431(9);
                }
            }
        } else if (arg0 == 7) {
            if (this.field8201 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var89 = arg1[var85];
                    if (var89 < this.field8201.length) {
                        int[] var90 = this.field8201[var89];
                        for (int var91 = 0; var91 < var90.length; var91++) {
                            int var92 = var90[var91];
                            int var93 = this.field8224[var92] & 0xFFFF;
                            int var94 = var93 >> 10 & 0x3F;
                            int var95 = (var93 & 0x391) >> 7;
                            int var96 = arg3 / 4 + var95;
                            int var97 = arg2 + var94 & 0x3F;
                            int var98 = var93 & 0x7F;
                            int var99 = arg4 + var98;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            if (var99 < 0) {
                                var99 = 0;
                            } else if (var99 > 127) {
                                var99 = 127;
                            }
                            this.field8224[var92] = (short) class747.method4153(class747.method4153(var97 << 10, var96 << 7), var99);
                        }
                        var84 |= var90.length > 0;
                    }
                }
                if (var84) {
                    if (this.field8229 != null) {
                        for (int var86 = 0; var86 < this.field8228; var86++) {
                            class298 var87 = this.field8229[var86];
                            class356 var88 = this.field8206[var86];
                            var88.field4569 = class673.field9471[this.field8224[var87.field3890] & 0xFFFF] & 0xFFFFFF | var88.field4569 & 0xFF000000;
                        }
                    }
                    this.method3431(9);
                }
            }
        } else if (arg0 == 8) {
            if (this.field8140 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (var101 < this.field8140.length) {
                        int[] var102 = this.field8140[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            class356 var104 = this.field8206[var102[var103]];
                            var104.field4568 += arg3;
                            var104.field4574 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8140 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field8140.length) {
                        int[] var107 = this.field8140[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            class356 var109 = this.field8206[var107[var108]];
                            var109.field4577 = var109.field4577 * arg3 >> 7;
                            var109.field4567 = var109.field4567 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8140 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (var111 < this.field8140.length) {
                    int[] var112 = this.field8140[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        class356 var114 = this.field8206[var112[var113]];
                        var114.field4578 = var114.field4578 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Luha;Lau;I)V", line = 2087)
    public final void method1168(class723 arg0, class247 arg1, int arg2) {
        field8168++;
        if (this.field8186 == 0) {
            return;
        }
        class173 var4 = this.field8232.field6801;
        if (!this.field8173) {
            this.method3435((byte) -125);
        }
        class173 var5 = (class173) arg0;
        class211.field2991 = var4.field2331 * var5.field2328 + var4.field2339 * var5.field2340 + var4.field2332 * var5.field2343 + var4.field2328;
        class743.field10351 = var4.field2331 * var5.field2339 + var4.field2339 * var5.field2364 + var4.field2332 * var5.field2352;
        float var6 = (float) this.field8211 * class743.field10351 + class211.field2991;
        float var7 = (float) this.field8247 * class743.field10351 + class211.field2991;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = var7 - (float) this.field8255;
            var9 = (float) this.field8255 + var6;
        } else {
            var8 = (float) (-this.field8255) + var6;
            var9 = (float) this.field8255 + var7;
        }
        if ((this.field8232.field6866 <= var8) || (var9 <= (float) this.field8232.field6878)) {
            return;
        }
        class207.field2952 = var4.field2370 * var5.field2328 + var4.field2372 * var5.field2343 + var4.field2352 * var5.field2340 + var4.field2343;
        class497.field6966 = var4.field2370 * var5.field2339 + var4.field2372 * var5.field2352 + var4.field2352 * var5.field2364;
        float var10 = (float) this.field8211 * class497.field6966 + class207.field2952;
        float var11 = (float) this.field8247 * class497.field6966 + class207.field2952;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = ((float) this.field8255 + var10) * (float) this.field8232.field6821;
            var13 = (var11 - (float) this.field8255) * (float) this.field8232.field6821;
        } else {
            var13 = (var10 - (float) this.field8255) * (float) this.field8232.field6821;
            var12 = ((float) this.field8255 + var11) * (float) this.field8232.field6821;
        }
        if ((var13 / var9 >= this.field8232.field6815) || (this.field8232.field6904 >= var12 / var9)) {
            return;
        }
        class439.field6022 = var4.field2335 * var5.field2328 + var4.field2378 * var5.field2343 + var4.field2364 * var5.field2340 + var4.field2340;
        class542.field7581 = var4.field2335 * var5.field2339 + var4.field2378 * var5.field2352 + var4.field2364 * var5.field2364;
        float var14 = (float) this.field8211 * class542.field7581 + class439.field6022;
        float var15 = (float) this.field8247 * class542.field7581 + class439.field6022;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = ((float) this.field8255 + var14) * (float) this.field8232.field6882;
            var17 = ((float) (-this.field8255) + var15) * (float) this.field8232.field6882;
        } else {
            var16 = ((float) this.field8255 + var15) * (float) this.field8232.field6882;
            var17 = ((float) (-this.field8255) + var14) * (float) this.field8232.field6882;
        }
        if ((this.field8232.field6897 <= var17 / var9) || (var16 / var9 <= this.field8232.field6908)) {
            return;
        }
        if (arg1 != null || this.field8229 != null) {
            class645.field9149 = var4.field2335 * var5.field2332 + var4.field2378 * var5.field2372 + var4.field2364 * var5.field2378;
            class460.field6320 = var4.field2331 * var5.field2331 + var4.field2339 * var5.field2335 + var4.field2332 * var5.field2370;
            class231.field3216 = var4.field2370 * var5.field2331 + var4.field2372 * var5.field2370 + var4.field2352 * var5.field2335;
            class123.field1688 = var4.field2331 * var5.field2332 + var4.field2339 * var5.field2378 + var4.field2332 * var5.field2372;
            class327.field4204 = var4.field2370 * var5.field2332 + var4.field2372 * var5.field2372 + var4.field2352 * var5.field2378;
            class140.field1928 = var4.field2335 * var5.field2331 + var4.field2378 * var5.field2370 + var4.field2364 * var5.field2335;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field8248 + this.field8223 >> 1;
            int var21 = this.field8234 + this.field8165 >> 1;
            int var22 = (int) ((float) var21 * class231.field3216 + (float) this.field8211 * class497.field6966 + (float) var20 * class327.field4204 + class207.field2952);
            int var23 = (int) ((float) var21 * class140.field1928 + (float) this.field8211 * class542.field7581 + (float) var20 * class645.field9149 + class439.field6022);
            int var24 = (int) ((float) var21 * class460.field6320 + (float) this.field8211 * class743.field10351 + (float) var20 * class123.field1688 + class211.field2991);
            if (this.field8232.field6878 > var24) {
                var18 = true;
            } else {
                arg1.field3429 = this.field8232.field6905 + (this.field8232.field6882 * var23 / var24);
                arg1.field3428 = this.field8232.field6821 * var22 / var24 + this.field8232.field6829;
            }
            int var25 = (int) ((float) var21 * class231.field3216 + (float) this.field8247 * class497.field6966 + (float) var20 * class327.field4204 + class207.field2952);
            int var26 = (int) ((float) var21 * class140.field1928 + (float) this.field8247 * class542.field7581 + (float) var20 * class645.field9149 + class439.field6022);
            int var27 = (int) ((float) var21 * class460.field6320 + (float) this.field8247 * class743.field10351 + (float) var20 * class123.field1688 + class211.field2991);
            if (var27 >= this.field8232.field6878) {
                arg1.field3430 = this.field8232.field6821 * var25 / var27 + this.field8232.field6829;
                arg1.field3433 = this.field8232.field6905 + (this.field8232.field6882 * var26 / var27);
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field8232.field6878 > var24 && var27 < this.field8232.field6878) {
                    var19 = false;
                } else if (this.field8232.field6878 > var24) {
                    int var28 = (var27 - this.field8232.field6878 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field3428 = this.field8232.field6821 * var29 / this.field8232.field6878 + this.field8232.field6829;
                    int var30 = var26 + ((var26 - var23) * var28 >> 16);
                    arg1.field3429 = this.field8232.field6905 + (this.field8232.field6882 * var30 / this.field8232.field6878);
                } else if (var27 < this.field8232.field6878) {
                    int var31 = (var24 - this.field8232.field6878 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = var23 + ((var23 - var26) * var31 >> 16);
                    arg1.field3428 = this.field8232.field6829 + (this.field8232.field6821 * var32 / this.field8232.field6878);
                    arg1.field3429 = this.field8232.field6882 * var33 / this.field8232.field6878 + this.field8232.field6905;
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field3432 = (this.field8255 + var22) * this.field8232.field6821 / var24 + this.field8232.field6829 - arg1.field3428;
                } else {
                    arg1.field3432 = (this.field8255 + var25) * this.field8232.field6821 / var27 + this.field8232.field6829 - arg1.field3430;
                }
                arg1.field3431 = true;
            }
        }
        this.field8232.method2914(8);
        this.field8232.method2873(0, var5);
        this.method3437((byte) -108);
        this.method3426(17166);
    }

    @OriginalMember(owner = "client!qd", name = "HA", descriptor = "()I", line = 2285)
    public final int method1128() {
        if (!this.field8173) {
            this.method3435((byte) -128);
        }
        field8183++;
        return this.field8234;
    }

    @OriginalMember(owner = "client!qd", name = "FA", descriptor = "(I)V", line = 2297)
    public final void method1165(int arg0) {
        field8221++;
        int var2 = class231.field3217[arg0];
        int var3 = class231.field3218[arg0];
        for (int var4 = 0; var4 < this.field8176; var4++) {
            int var5 = this.field8187[var4] * var3 - (this.field8227[var4] * var2) >> 14;
            this.field8227[var4] = this.field8227[var4] * var3 + this.field8187[var4] * var2 >> 14;
            this.field8187[var4] = var5;
        }
        this.method3428(-1);
        this.field8173 = false;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLw;)V", line = 2324)
    private final void method3432(byte arg0, class450 arg1) {
        if (class64.field895.length < this.field8186) {
            class64.field895 = new int[this.field8186];
            class36.field514 = new int[this.field8186];
        }
        field8133++;
        for (int var3 = 0; var3 < this.field8176; var3++) {
            int var14 = (this.field8190[var3] - (this.field8187[var3] * this.field8232.field6902 >> 8) >> this.field8232.field6818) - arg1.field6180;
            int var15 = (this.field8227[var3] - (this.field8187[var3] * this.field8232.field6862 >> 8) >> this.field8232.field6818) - arg1.field6190;
            int var16 = this.field8162[var3];
            int var17 = this.field8162[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field8180[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class64.field895[var19] = var14;
                class36.field514[var19] = var15;
            }
        }
        if (arg0 < 76) {
            return;
        }
        for (int var4 = 0; var4 < this.field8181; var4++) {
            if (this.field8235 == null || this.field8235[var4] <= 128) {
                short var5 = this.field8233[var4];
                short var6 = this.field8138[var4];
                short var7 = this.field8182[var4];
                int var8 = class64.field895[var5];
                int var9 = class64.field895[var6];
                int var10 = class64.field895[var7];
                int var11 = class36.field514[var5];
                int var12 = class36.field514[var6];
                int var13 = class36.field514[var7];
                if ((var8 - var9) * (var12 - var13) - (var10 - var9) * (var12 - var11) > 0) {
                    arg1.method2704((byte) -111, var10, var11, var12, var8, var9, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "(I)V", line = 2408)
    public final void method1159(int arg0) {
        this.field8250 = (short) arg0;
        field8153++;
        this.method3431(9);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIII)I", line = 2421)
    public static final int method3433(int arg0, int arg1, int arg2, int arg3) {
        field8164++;
        int var4 = arg1 & 0x3;
        if (arg2 == var4) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 2442)
    public final void method1133(int arg0) {
        field8132++;
        int var2 = class231.field3217[arg0];
        int var3 = class231.field3218[arg0];
        for (int var4 = 0; var4 < this.field8176; var4++) {
            int var5 = this.field8227[var4] * var2 + this.field8190[var4] * var3 >> 14;
            this.field8227[var4] = this.field8227[var4] * var3 - (this.field8190[var4] * var2) >> 14;
            this.field8190[var4] = var5;
        }
        this.method3428(-1);
        this.field8173 = false;
    }

    @OriginalMember(owner = "client!qd", name = "ua", descriptor = "()I", line = 2469)
    public final int method1135() {
        field8130++;
        return this.field8185;
    }

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "(I)V", line = 2478)
    public final void method1118(int arg0) {
        field8236++;
        if (this.field8139 != null) {
            this.field8139.field908 = class705.method3964(this.field8213, arg0, (byte) 78);
        }
        if (this.field8174 != null) {
            this.field8174.field908 = class691.method3933(this.field8213, (byte) -39, arg0);
        }
        if (this.field8152 != null) {
            this.field8152.field908 = class620.method3631(this.field8213, 55, arg0);
        }
        if (this.field8230 != null) {
            this.field8230.field908 = class412.method2515(arg0, this.field8213, 118);
        }
        this.field8185 = arg0;
        if (this.field8249 != null && (this.field8185 & 0x10000) == 0) {
            this.field8243 = this.field8249.field1644;
            this.field8251 = this.field8249.field1647;
            this.field8137 = this.field8249.field1646;
            this.field8178 = this.field8249.field1645;
            this.field8249 = null;
        }
        this.field8242 = true;
        this.method3427(-8198);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Luha;)V", line = 2515)
    public final void method1172(class723 arg0) {
        field8150++;
        class173 var2 = (class173) arg0;
        if (this.field8216 != null) {
            for (int var3 = 0; var3 < this.field8216.length; var3++) {
                class57 var4 = this.field8216[var3];
                class57 var5 = var4;
                if (var4.field806 != null) {
                    var5 = var4.field806;
                }
                var5.field795 = (int) ((float) this.field8227[var4.field800] * var2.field2370 + (float) this.field8190[var4.field800] * var2.field2372 + (float) this.field8187[var4.field800] * var2.field2352 + var2.field2343);
                var5.field788 = (int) ((float) this.field8227[var4.field800] * var2.field2335 + (float) this.field8190[var4.field800] * var2.field2378 + (float) this.field8187[var4.field800] * var2.field2364 + var2.field2340);
                var5.field792 = (int) ((float) this.field8227[var4.field800] * var2.field2331 + (float) this.field8190[var4.field800] * var2.field2332 + (float) this.field8187[var4.field800] * var2.field2339 + var2.field2328);
                var5.field796 = (int) ((float) this.field8227[var4.field786] * var2.field2370 + (float) this.field8190[var4.field786] * var2.field2372 + (float) this.field8187[var4.field786] * var2.field2352 + var2.field2343);
                var5.field799 = (int) ((float) this.field8227[var4.field786] * var2.field2335 + (float) this.field8190[var4.field786] * var2.field2378 + (float) this.field8187[var4.field786] * var2.field2364 + var2.field2340);
                var5.field805 = (int) ((float) this.field8227[var4.field786] * var2.field2331 + (float) this.field8190[var4.field786] * var2.field2332 + (float) this.field8187[var4.field786] * var2.field2339 + var2.field2328);
                var5.field794 = (int) ((float) this.field8227[var4.field790] * var2.field2370 + (float) this.field8190[var4.field790] * var2.field2372 + (float) this.field8187[var4.field790] * var2.field2352 + var2.field2343);
                var5.field797 = (int) ((float) this.field8227[var4.field790] * var2.field2335 + (float) this.field8190[var4.field790] * var2.field2378 + (float) this.field8187[var4.field790] * var2.field2364 + var2.field2340);
                var5.field803 = (int) ((float) this.field8227[var4.field790] * var2.field2331 + (float) this.field8190[var4.field790] * var2.field2332 + (float) this.field8187[var4.field790] * var2.field2339 + var2.field2328);
            }
        }
        if (this.field8191 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field8191.length; var6++) {
            class648 var7 = this.field8191[var6];
            class648 var8 = var7;
            if (var7.field9188 != null) {
                var8 = var7.field9188;
            }
            if (var7.field9191 == null) {
                var7.field9191 = var2.method859();
            } else {
                var7.field9191.method864(var2);
            }
            var8.field9185 = (int) ((float) this.field8227[var7.field9184] * var2.field2370 + (float) this.field8190[var7.field9184] * var2.field2372 + (float) this.field8187[var7.field9184] * var2.field2352 + var2.field2343);
            var8.field9186 = (int) ((float) this.field8227[var7.field9184] * var2.field2335 + (float) this.field8190[var7.field9184] * var2.field2378 + (float) this.field8187[var7.field9184] * var2.field2364 + var2.field2340);
            var8.field9190 = (int) ((float) this.field8227[var7.field9184] * var2.field2331 + (float) this.field8190[var7.field9184] * var2.field2332 + (float) this.field8187[var7.field9184] * var2.field2339 + var2.field2328);
        }
    }

    @OriginalMember(owner = "client!qd", name = "aa", descriptor = "(SS)V", line = 2584)
    public final void method1148(short arg0, short arg1) {
        field8167++;
        class268 var3 = this.field8232.field7694;
        for (int var4 = 0; var4 < this.field8157; var4++) {
            if (this.field8252[var4] == arg0) {
                this.field8252[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class468 var7 = var3.method91(arg0 & 0xFFFF, -22805);
            var5 = var7.field6381;
            var6 = var7.field6399;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class468 var10 = var3.method91(arg1 & 0xFFFF, -22805);
            var9 = var10.field6399;
            if (var10.field6388 != 0 || var10.field6390 != 0) {
                this.field8246 = true;
            }
            var8 = var10.field6381;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field8229 != null) {
            for (int var11 = 0; var11 < this.field8228; var11++) {
                class298 var12 = this.field8229[var11];
                class356 var13 = this.field8206[var11];
                var13.field4569 = class673.field9471[this.field8224[var12.field3890] & 0xFFFF] & 0xFFFFFF | var13.field4569 & 0xFF000000;
            }
        }
        this.method3431(9);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLqd;IZLqd;I)Lka;", line = 2660)
    private final class283 method3434(boolean arg0, class576 arg1, int arg2, boolean arg3, class576 arg4, int arg5) {
        arg4.field8246 = this.field8246;
        arg4.field8185 = arg5;
        arg4.field8159 = this.field8159;
        arg4.field8181 = this.field8181;
        arg4.field8157 = this.field8157;
        arg4.field8228 = this.field8228;
        field8197++;
        arg4.field8176 = this.field8176;
        arg4.field8213 = this.field8213;
        arg4.field8186 = this.field8186;
        arg4.field8250 = this.field8250;
        if ((arg5 & 0x100) == 0) {
            arg4.field8214 = this.field8214;
        } else {
            arg4.field8214 = true;
        }
        arg4.field8151 = this.field8151;
        boolean var7 = class104.method702((byte) 115, arg5, this.field8213);
        boolean var8 = class555.method3302(this.field8213, 16, arg5);
        boolean var9 = class453.method2727(110, arg5, this.field8213);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg4.field8190 = this.field8190;
            } else if (arg1.field8190 == null || this.field8151 > arg1.field8190.length) {
                arg4.field8190 = arg1.field8190 = new int[this.field8151];
            } else {
                arg4.field8190 = arg1.field8190;
            }
            if (!var8) {
                arg4.field8187 = this.field8187;
            } else if (arg1.field8187 == null || arg1.field8187.length < this.field8151) {
                arg4.field8187 = arg1.field8187 = new int[this.field8151];
            } else {
                arg4.field8187 = arg1.field8187;
            }
            if (!var9) {
                arg4.field8227 = this.field8227;
            } else if (arg1.field8227 == null || arg1.field8227.length < this.field8151) {
                arg4.field8227 = arg1.field8227 = new int[this.field8151];
            } else {
                arg4.field8227 = arg1.field8227;
            }
            for (int var11 = 0; var11 < this.field8151; var11++) {
                if (var7) {
                    arg4.field8190[var11] = this.field8190[var11];
                }
                if (var8) {
                    arg4.field8187[var11] = this.field8187[var11];
                }
                if (var9) {
                    arg4.field8227[var11] = this.field8227[var11];
                }
            }
        } else {
            arg4.field8227 = this.field8227;
            arg4.field8190 = this.field8190;
            arg4.field8187 = this.field8187;
        }
        if (class705.method3964(this.field8213, arg5, (byte) 110)) {
            arg4.field8139 = arg1.field8139;
            arg4.field8139.field907 = this.field8139.field907;
            arg4.field8139.field908 = true;
            arg4.field8139.field901 = this.field8139.field901;
        } else if (class321.method1875(this.field8213, arg5, (byte) 95)) {
            arg4.field8139 = this.field8139;
        } else {
            arg4.field8139 = null;
        }
        if (class71.method449(this.field8213, arg5, false)) {
            if (arg1.field8224 == null || this.field8157 > arg1.field8224.length) {
                arg4.field8224 = arg1.field8224 = new short[this.field8157];
            } else {
                arg4.field8224 = arg1.field8224;
            }
            for (int var12 = 0; var12 < this.field8157; var12++) {
                arg4.field8224[var12] = this.field8224[var12];
            }
        } else {
            arg4.field8224 = this.field8224;
        }
        if (class664.method3812(arg2 ^ 0x107, arg5, this.field8213)) {
            if (arg1.field8235 == null || this.field8157 > arg1.field8235.length) {
                arg4.field8235 = arg1.field8235 = new byte[this.field8157];
            } else {
                arg4.field8235 = arg1.field8235;
            }
            for (int var13 = 0; var13 < this.field8157; var13++) {
                arg4.field8235[var13] = this.field8235[var13];
            }
        } else {
            arg4.field8235 = this.field8235;
        }
        if (class620.method3631(this.field8213, 55, arg5)) {
            arg4.field8152 = arg1.field8152;
            arg4.field8152.field901 = this.field8152.field901;
            arg4.field8152.field907 = this.field8152.field907;
            arg4.field8152.field908 = true;
        } else if (class755.method4186(this.field8213, arg5, (byte) 36)) {
            arg4.field8152 = this.field8152;
        } else {
            arg4.field8152 = null;
        }
        if (class440.method2633(arg5, (byte) -121, this.field8213)) {
            if (arg1.field8243 == null || arg1.field8243.length < this.field8186) {
                int var14 = this.field8186;
                arg4.field8243 = arg1.field8243 = new short[var14];
                arg4.field8251 = arg1.field8251 = new short[var14];
                arg4.field8137 = arg1.field8137 = new short[var14];
            } else {
                arg4.field8251 = arg1.field8251;
                arg4.field8137 = arg1.field8137;
                arg4.field8243 = arg1.field8243;
            }
            if (this.field8249 == null) {
                arg4.field8249 = null;
                for (int var15 = 0; var15 < this.field8186; var15++) {
                    arg4.field8243[var15] = this.field8243[var15];
                    arg4.field8251[var15] = this.field8251[var15];
                    arg4.field8137[var15] = this.field8137[var15];
                }
            } else {
                if (arg1.field8249 == null) {
                    arg1.field8249 = new class119();
                }
                class119 var16 = arg4.field8249 = arg1.field8249;
                if (var16.field1644 == null || var16.field1644.length < this.field8186) {
                    int var17 = this.field8186;
                    var16.field1645 = new byte[var17];
                    var16.field1647 = new short[var17];
                    var16.field1644 = new short[var17];
                    var16.field1646 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field8186; var18++) {
                    arg4.field8243[var18] = this.field8243[var18];
                    arg4.field8251[var18] = this.field8251[var18];
                    arg4.field8137[var18] = this.field8137[var18];
                    var16.field1644[var18] = this.field8249.field1644[var18];
                    var16.field1647[var18] = this.field8249.field1647[var18];
                    var16.field1646[var18] = this.field8249.field1646[var18];
                    var16.field1645[var18] = this.field8249.field1645[var18];
                }
            }
            arg4.field8178 = this.field8178;
        } else {
            arg4.field8178 = this.field8178;
            arg4.field8243 = this.field8243;
            arg4.field8137 = this.field8137;
            arg4.field8251 = this.field8251;
            arg4.field8249 = this.field8249;
        }
        if (arg2 != 7) {
            return null;
        }
        if (class412.method2515(arg5, this.field8213, -109)) {
            arg4.field8230 = arg1.field8230;
            arg4.field8230.field908 = true;
            arg4.field8230.field907 = this.field8230.field907;
            arg4.field8230.field901 = this.field8230.field901;
        } else if (class450.method2708(arg5, (byte) 40, this.field8213)) {
            arg4.field8230 = this.field8230;
        } else {
            arg4.field8230 = null;
        }
        if (class682.method3899(this.field8213, false, arg5)) {
            if (arg1.field8238 == null || arg1.field8238.length < this.field8157) {
                int var19 = this.field8186;
                arg4.field8238 = arg1.field8238 = new float[var19];
                arg4.field8203 = arg1.field8203 = new float[var19];
            } else {
                arg4.field8203 = arg1.field8203;
                arg4.field8238 = arg1.field8238;
            }
            for (int var20 = 0; var20 < this.field8186; var20++) {
                arg4.field8238[var20] = this.field8238[var20];
                arg4.field8203[var20] = this.field8203[var20];
            }
        } else {
            arg4.field8203 = this.field8203;
            arg4.field8238 = this.field8238;
        }
        if (class691.method3933(this.field8213, (byte) -39, arg5)) {
            arg4.field8174 = arg1.field8174;
            arg4.field8174.field907 = this.field8174.field907;
            arg4.field8174.field901 = this.field8174.field901;
            arg4.field8174.field908 = true;
        } else if (class565.method3379(arg5, (byte) 76, this.field8213)) {
            arg4.field8174 = this.field8174;
        } else {
            arg4.field8174 = null;
        }
        if (class551.method3292(true, arg5, this.field8213)) {
            if (arg1.field8233 == null || this.field8157 > arg1.field8233.length) {
                int var21 = this.field8157;
                arg4.field8233 = arg1.field8233 = new short[var21];
                arg4.field8138 = arg1.field8138 = new short[var21];
                arg4.field8182 = arg1.field8182 = new short[var21];
            } else {
                arg4.field8182 = arg1.field8182;
                arg4.field8138 = arg1.field8138;
                arg4.field8233 = arg1.field8233;
            }
            for (int var22 = 0; var22 < this.field8157; var22++) {
                arg4.field8233[var22] = this.field8233[var22];
                arg4.field8138[var22] = this.field8138[var22];
                arg4.field8182[var22] = this.field8182[var22];
            }
        } else {
            arg4.field8233 = this.field8233;
            arg4.field8182 = this.field8182;
            arg4.field8138 = this.field8138;
        }
        if (class712.method3998((byte) 82, this.field8213, arg5)) {
            arg4.field8163 = arg1.field8163;
            arg4.field8163.field3912 = true;
            arg4.field8163.field3913 = this.field8163.field3913;
            arg4.field8163.field3911 = this.field8163.field3911;
        } else if (class296.method1741(this.field8213, (byte) -103, arg5)) {
            arg4.field8163 = this.field8163;
        } else {
            arg4.field8163 = null;
        }
        if (class304.method1783(arg5, (byte) 97, this.field8213)) {
            if (arg1.field8252 == null || this.field8157 > arg1.field8252.length) {
                int var23 = this.field8157;
                arg4.field8252 = arg1.field8252 = new short[var23];
            } else {
                arg4.field8252 = arg1.field8252;
            }
            for (int var24 = 0; var24 < this.field8157; var24++) {
                arg4.field8252[var24] = this.field8252[var24];
            }
        } else {
            arg4.field8252 = this.field8252;
        }
        if (!class240.method1531(arg5, arg2 ^ 0xFFFFA9EB, this.field8213)) {
            arg4.field8206 = this.field8206;
        } else if (arg1.field8206 == null || this.field8228 > arg1.field8206.length) {
            int var26 = this.field8228;
            arg4.field8206 = arg1.field8206 = new class356[var26];
            for (int var27 = 0; var27 < this.field8228; var27++) {
                arg4.field8206[var27] = this.field8206[var27].method2011(false);
            }
        } else {
            arg4.field8206 = arg1.field8206;
            for (int var25 = 0; var25 < this.field8228; var25++) {
                arg4.field8206[var25].method2015(this.field8206[var25], (byte) -98);
            }
        }
        arg4.field8222 = this.field8222;
        arg4.field8140 = this.field8140;
        arg4.field8180 = this.field8180;
        arg4.field8191 = this.field8191;
        arg4.field8192 = this.field8192;
        arg4.field8229 = this.field8229;
        arg4.field8184 = this.field8184;
        arg4.field8245 = this.field8245;
        arg4.field8201 = this.field8201;
        arg4.field8161 = this.field8161;
        arg4.field8166 = this.field8166;
        arg4.field8207 = this.field8207;
        arg4.field8162 = this.field8162;
        arg4.field8212 = this.field8212;
        if (this.field8173) {
            arg4.field8234 = this.field8234;
            arg4.field8165 = this.field8165;
            arg4.field8247 = this.field8247;
            arg4.field8248 = this.field8248;
            arg4.field8255 = this.field8255;
            arg4.field8135 = this.field8135;
            arg4.field8211 = this.field8211;
            arg4.field8173 = true;
            arg4.field8223 = this.field8223;
        } else {
            arg4.field8173 = false;
        }
        arg4.field8216 = this.field8216;
        return arg4;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V", line = 3120)
    private final void method3435(byte arg0) {
        field8215++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        if (arg0 > -120) {
            this.field8162 = null;
        }
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field8176; var10++) {
            int var11 = this.field8190[var10];
            int var12 = this.field8187[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var3 > var12) {
                var3 = var12;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            int var13 = this.field8227[var10];
            if (var6 < var12) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var12 * var12 + var13 * var13;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field8165 = var7;
        this.field8248 = var2;
        this.field8234 = var4;
        this.field8223 = var5;
        this.field8211 = var3;
        this.field8247 = var6;
        this.field8255 = (int) (Math.sqrt((double) var8) + 0.99D);
        this.field8135 = (int) (Math.sqrt((double) var9) + 0.99D);
        this.field8173 = true;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lpga;IIZZ)V", line = 6472)
    public class576(class492 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field8169 = false;
        this.field8157 = 0;
        this.field8151 = 0;
        this.field8181 = 0;
        this.field8173 = false;
        this.field8176 = 0;
        this.field8186 = 0;
        this.field8214 = false;
        this.field8246 = false;
        this.field8242 = true;
        this.field8213 = arg2;
        this.field8169 = arg4;
        this.field8232 = arg0;
        this.field8185 = arg1;
        if (arg3 || class321.method1875(this.field8213, this.field8185, (byte) -57)) {
            this.field8139 = new class65(class705.method3964(this.field8213, this.field8185, (byte) 75));
        }
        if (arg3 || class565.method3379(this.field8185, (byte) 77, this.field8213)) {
            this.field8174 = new class65(class691.method3933(this.field8213, (byte) -39, this.field8185));
        }
        if (arg3 || class755.method4186(this.field8213, this.field8185, (byte) 70)) {
            this.field8152 = new class65(class620.method3631(this.field8213, 55, this.field8185));
        }
        if (arg3 || class450.method2708(this.field8185, (byte) 40, this.field8213)) {
            this.field8230 = new class65(class412.method2515(this.field8185, this.field8213, -67));
        }
        if (arg3 || class296.method1741(this.field8213, (byte) -107, this.field8185)) {
            this.field8163 = new class300(class712.method3998((byte) -115, this.field8213, this.field8185));
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BIZ)Lka;", line = 3204)
    public final class283 method1147(byte arg0, int arg1, boolean arg2) {
        field8188++;
        class576 var4;
        class576 var5;
        if (arg0 == 1) {
            var5 = this.field8232.field6911;
            var4 = this.field8232.field6915;
        } else if (arg0 == 2) {
            var4 = this.field8232.field6924;
            var5 = this.field8232.field6917;
        } else if (arg0 == 3) {
            var4 = this.field8232.field6926;
            var5 = this.field8232.field6919;
        } else if (arg0 == 4) {
            var4 = this.field8232.field6932;
            var5 = this.field8232.field6918;
        } else if (arg0 == 5) {
            var4 = this.field8232.field6927;
            var5 = this.field8232.field6914;
        } else {
            var4 = var5 = new class576(this.field8232, 0, 0, true, false);
        }
        return this.method3434(arg2, var5, 7, arg0 != 0, var4, arg1);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lpga;Lkda;IIII)V", line = 3254)
    public class576(class492 arg0, class64 arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        class268 var7 = arg0.field7694;
        int[] var8 = new int[arg1.field851];
        this.field8162 = new int[arg1.field874 + 1];
        for (int var9 = 0; var9 < arg1.field851; var9++) {
            if (arg1.field858 == null || arg1.field858[var9] != 2) {
                if (arg1.field859 != null && arg1.field859[var9] != -1) {
                    class468 var178 = var7.method91(arg1.field859[var9] & 0xFFFF, -22805);
                    if (((this.field8213 & 0x40) == 0 || !var178.field6389) && var178.field6383) {
                        continue;
                    }
                }
                var8[this.field8157++] = var9;
                this.field8162[arg1.field863[var9]]++;
                this.field8162[arg1.field865[var9]]++;
                this.field8162[arg1.field852[var9]]++;
            }
        }
        this.field8181 = this.field8157;
        long[] var10 = new long[this.field8157];
        boolean var11 = (this.field8185 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field8157; var12++) {
            int var161 = var8[var12];
            class468 var162 = null;
            int var163 = 0;
            byte var164 = 0;
            byte var165 = 0;
            byte var166 = 0;
            if (arg1.field879 != null) {
                boolean var167 = false;
                for (int var168 = 0; var168 < arg1.field879.length; var168++) {
                    class9 var169 = arg1.field879[var168];
                    if (var169.field83 == var161) {
                        class501 var170 = class67.method435(90, var169.field86);
                        if (var170.field7002) {
                            var167 = true;
                        }
                        if (var170.field7004 != -1) {
                            class468 var171 = var7.method91(var170.field7004, -22805);
                            if (var171.field6393 == 2) {
                                this.field8214 = true;
                            }
                        }
                    }
                }
                if (var167) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field8181--;
                    continue;
                }
            }
            short var172 = -1;
            if (arg1.field859 != null) {
                var172 = arg1.field859[var161];
                if (var172 != -1) {
                    var162 = var7.method91(var172 & 0xFFFF, -22805);
                    if ((this.field8213 & 0x40) != 0 && var162.field6389) {
                        var162 = null;
                        var172 = -1;
                    } else {
                        var166 = var162.field6398;
                        var165 = var162.field6386;
                    }
                }
            }
            boolean var173 = arg1.field864 != null && arg1.field864[var161] != 0 || var162 != null && var162.field6393 != 0;
            if ((var11 || var173) && arg1.field860 != null) {
                var163 += arg1.field860[var161] << 17;
            }
            if (var173) {
                var163 += 65536;
            }
            int var174 = (var165 & 0xFF << 8) + var163;
            int var175 = (var166 & 0xFF) + var174;
            int var176 = ((var172 & 0xFFFF) << 16) + var164;
            int var177 = (var12 & 0xFFFF) + var176;
            var10[var12] = ((long) var175 << 32) + (long) var177;
            this.field8246 |= var162 != null && (var162.field6388 != 0 || var162.field6390 != 0);
            this.field8214 |= var173;
        }
        class13.method71(var10, var8, -1);
        this.field8207 = arg1.field861;
        this.field8176 = arg1.field874;
        this.field8187 = arg1.field887;
        this.field8151 = arg1.field866;
        this.field8190 = arg1.field876;
        this.field8227 = arg1.field884;
        this.field8216 = arg1.field857;
        class190[] var13 = new class190[this.field8176];
        this.field8191 = arg1.field848;
        if (arg1.field879 != null) {
            this.field8228 = arg1.field879.length;
            this.field8229 = new class298[this.field8228];
            this.field8206 = new class356[this.field8228];
            for (int var14 = 0; var14 < this.field8228; var14++) {
                class9 var15 = arg1.field879[var14];
                class501 var16 = class67.method435(107, var15.field86);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field8157; var18++) {
                    if (var8[var18] == var15.field83) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class673.field9471[arg1.field872[var15.field83] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field864 == null ? 0 : arg1.field864[var15.field83]) << 24;
                this.field8229[var14] = new class298(var17, arg1.field863[var15.field83], arg1.field865[var15.field83], arg1.field852[var15.field83], var16.field7009, var16.field7015, var16.field7004, var16.field7008, var16.field7007, var16.field7002, var16.field7000, var15.field87);
                this.field8206[var14] = new class356(var20);
            }
        }
        int var21 = this.field8157 * 3;
        this.field8137 = new short[var21];
        this.field8233 = new short[this.field8157];
        this.field8252 = new short[this.field8157];
        this.field8224 = new short[this.field8157];
        this.field8180 = new short[var21];
        this.field8159 = (short) arg4;
        this.field8235 = new byte[this.field8157];
        this.field8192 = new short[var21];
        this.field8178 = new byte[var21];
        this.field8182 = new short[this.field8157];
        class640.field9092 = new long[var21];
        if (arg1.field883 != null) {
            this.field8212 = new short[this.field8157];
        }
        this.field8203 = new float[var21];
        this.field8251 = new short[var21];
        this.field8161 = new short[var21];
        this.field8243 = new short[var21];
        this.field8250 = (short) arg3;
        this.field8238 = new float[var21];
        this.field8138 = new short[this.field8157];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field874; var23++) {
            int var160 = this.field8162[var23];
            this.field8162[var23] = var22;
            var13[var23] = new class190();
            var22 += var160;
        }
        this.field8162[arg1.field874] = var22;
        class611 var24 = class714.method4028(var8, (byte) 74, this.field8157, arg1);
        class332[] var25 = new class332[arg1.field851];
        for (int var26 = 0; var26 < arg1.field851; var26++) {
            short var139 = arg1.field863[var26];
            short var140 = arg1.field865[var26];
            short var141 = arg1.field852[var26];
            int var142 = this.field8190[var140] - this.field8190[var139];
            int var143 = this.field8187[var140] - this.field8187[var139];
            int var144 = this.field8227[var140] - this.field8227[var139];
            int var145 = this.field8190[var141] - this.field8190[var139];
            int var146 = this.field8187[var141] - this.field8187[var139];
            int var147 = this.field8227[var141] - this.field8227[var139];
            int var148 = var143 * var147 - (var144 * var146);
            int var149 = var144 * var145 - (var142 * var147);
            int var150 = var142 * var146 - (var143 * var145);
            while (var148 > 8192 || var149 > 8192 || var150 > 8192 || var148 < -8192 || var149 < -8192 || var150 < -8192) {
                var149 >>= 0x1;
                var150 >>= 0x1;
                var148 >>= 0x1;
            }
            int var151 = (int) Math.sqrt((double) (var148 * var148 + var149 * var149 + var150 * var150));
            if (var151 <= 0) {
                var151 = 1;
            }
            int var152 = var148 * 256 / var151;
            int var153 = var149 * 256 / var151;
            int var154 = var150 * 256 / var151;
            byte var155 = arg1.field858 == null ? 0 : arg1.field858[var26];
            if (var155 == 0) {
                class190 var156 = var13[var139];
                var156.field2760 += var152;
                var156.field2765++;
                var156.field2758 += var154;
                var156.field2763 += var153;
                class190 var157 = var13[var140];
                var157.field2763 += var153;
                var157.field2758 += var154;
                var157.field2765++;
                var157.field2760 += var152;
                class190 var158 = var13[var141];
                var158.field2758 += var154;
                var158.field2765++;
                var158.field2760 += var152;
                var158.field2763 += var153;
            } else if (var155 == 1) {
                class332 var159 = var25[var26] = new class332();
                var159.field4258 = var153;
                var159.field4254 = var154;
                var159.field4259 = var152;
            }
        }
        for (int var27 = 0; var27 < this.field8157; var27++) {
            int var48 = var8[var27];
            int var49 = arg1.field872[var48] & 0xFFFF;
            int var50;
            if (arg1.field897 == null) {
                var50 = -1;
            } else {
                var50 = arg1.field897[var48];
            }
            int var51;
            if (arg1.field864 == null) {
                var51 = 0;
            } else {
                var51 = arg1.field864[var48] & 0xFF;
            }
            short var52 = arg1.field859 == null ? -1 : arg1.field859[var48];
            if (var52 != -1 && (this.field8213 & 0x40) != 0) {
                class468 var53 = var7.method91(var52 & 0xFFFF, -22805);
                if (var53.field6389) {
                    var52 = -1;
                }
            }
            float var54 = 0.0F;
            float var55 = 0.0F;
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            byte var60 = 0;
            byte var61 = 0;
            int var62 = 0;
            if (var52 != -1) {
                if (var50 == -1) {
                    var60 = 1;
                    var57 = 1.0F;
                    var59 = 0.0F;
                    var58 = 0.0F;
                    var61 = 2;
                    var55 = 1.0F;
                    var56 = 1.0F;
                    var54 = 0.0F;
                } else {
                    var50 &= 0xFF;
                    byte var63 = arg1.field867[var50];
                    if (var63 == 0) {
                        short var64 = arg1.field863[var48];
                        short var65 = arg1.field865[var48];
                        short var66 = arg1.field852[var48];
                        short var67 = arg1.field847[var50];
                        short var68 = arg1.field899[var50];
                        short var69 = arg1.field898[var50];
                        float var70 = (float) arg1.field876[var67];
                        float var71 = (float) arg1.field887[var67];
                        float var72 = (float) arg1.field884[var67];
                        float var73 = (float) arg1.field876[var68] - var70;
                        float var74 = (float) arg1.field887[var68] - var71;
                        float var75 = (float) arg1.field884[var68] - var72;
                        float var76 = (float) arg1.field876[var69] - var70;
                        float var77 = (float) arg1.field887[var69] - var71;
                        float var78 = (float) arg1.field884[var69] - var72;
                        float var79 = (float) arg1.field876[var64] - var70;
                        float var80 = (float) arg1.field887[var64] - var71;
                        float var81 = (float) arg1.field884[var64] - var72;
                        float var82 = (float) arg1.field876[var65] - var70;
                        float var83 = (float) arg1.field887[var65] - var71;
                        float var84 = (float) arg1.field884[var65] - var72;
                        float var85 = (float) arg1.field876[var66] - var70;
                        float var86 = (float) arg1.field887[var66] - var71;
                        float var87 = (float) arg1.field884[var66] - var72;
                        float var88 = var74 * var78 - (var75 * var77);
                        float var89 = var75 * var76 - (var73 * var78);
                        float var90 = var73 * var77 - var74 * var76;
                        float var91 = var77 * var90 - var78 * var89;
                        float var92 = var78 * var88 - var76 * var90;
                        float var93 = var76 * var89 - (var77 * var88);
                        float var94 = 1.0F / (var75 * var93 + var73 * var91 + var74 * var92);
                        var58 = (var87 * var93 + var85 * var91 + var86 * var92) * var94;
                        var54 = (var81 * var93 + var79 * var91 + var80 * var92) * var94;
                        var56 = (var84 * var93 + var82 * var91 + var83 * var92) * var94;
                        float var95 = var75 * var88 - var73 * var90;
                        float var96 = var73 * var89 - var74 * var88;
                        float var97 = var74 * var90 - (var75 * var89);
                        float var98 = 1.0F / (var78 * var96 + var76 * var97 + var77 * var95);
                        var59 = (var87 * var96 + var85 * var97 + var86 * var95) * var98;
                        var55 = (var81 * var96 + var79 * var97 + var80 * var95) * var98;
                        var57 = (var84 * var96 + var82 * var97 + var83 * var95) * var98;
                    } else {
                        short var99 = arg1.field863[var48];
                        short var100 = arg1.field865[var48];
                        short var101 = arg1.field852[var48];
                        int var102 = var24.field8694[var50];
                        int var103 = var24.field8691[var50];
                        int var104 = var24.field8689[var50];
                        float[] var105 = var24.field8695[var50];
                        byte var106 = arg1.field853[var50];
                        float var107 = (float) arg1.field886[var50] / 256.0F;
                        if (var63 == 1) {
                            float var125 = (float) arg1.field856[var50] / 1024.0F;
                            class37.method259(arg1.field887[var99], var102, arg1.field876[var99], arg1.field884[var99], var106, var103, var107, var125, var105, class693.field9690, var104, false);
                            var55 = class693.field9690[1];
                            var54 = class693.field9690[0];
                            class37.method259(arg1.field887[var100], var102, arg1.field876[var100], arg1.field884[var100], var106, var103, var107, var125, var105, class693.field9690, var104, false);
                            var56 = class693.field9690[0];
                            var57 = class693.field9690[1];
                            class37.method259(arg1.field887[var101], var102, arg1.field876[var101], arg1.field884[var101], var106, var103, var107, var125, var105, class693.field9690, var104, false);
                            var58 = class693.field9690[0];
                            var59 = class693.field9690[1];
                            float var126 = var125 / 2.0F;
                            if ((var106 & 0x1) == 0) {
                                if (var126 < var56 - var54) {
                                    var60 = 1;
                                    var56 -= var125;
                                } else if (var126 < var54 - var56) {
                                    var60 = 2;
                                    var56 += var125;
                                }
                                if ((var126 < var58 - var54)) {
                                    var58 -= var125;
                                    var61 = 1;
                                } else if (var126 < var54 - var58) {
                                    var61 = 2;
                                    var58 += var125;
                                }
                            } else {
                                if (var126 < var59 - var55) {
                                    var59 -= var125;
                                    var61 = 1;
                                } else if (var55 - var59 > var126) {
                                    var61 = 2;
                                    var59 += var125;
                                }
                                if ((var57 - var55 > var126)) {
                                    var57 -= var125;
                                    var60 = 1;
                                } else if (var55 - var57 > var126) {
                                    var60 = 2;
                                    var57 += var125;
                                }
                            }
                        } else if (var63 == 2) {
                            float var108 = (float) arg1.field868[var50] / 256.0F;
                            float var109 = (float) arg1.field880[var50] / 256.0F;
                            int var110 = arg1.field876[var100] - arg1.field876[var99];
                            int var111 = arg1.field887[var100] - arg1.field887[var99];
                            int var112 = arg1.field884[var100] - arg1.field884[var99];
                            int var113 = arg1.field876[var101] - arg1.field876[var99];
                            int var114 = arg1.field887[var101] - arg1.field887[var99];
                            int var115 = arg1.field884[var101] - arg1.field884[var99];
                            int var116 = var111 * var115 - (var112 * var114);
                            int var117 = var112 * var113 - (var110 * var115);
                            int var118 = var110 * var114 - var111 * var113;
                            float var119 = 64.0F / (float) arg1.field862[var50];
                            float var120 = 64.0F / (float) arg1.field889[var50];
                            float var121 = 64.0F / (float) arg1.field856[var50];
                            float var122 = (var105[2] * (float) var118 + var105[0] * (float) var116 + var105[1] * (float) var117) / var119;
                            float var123 = (var105[5] * (float) var118 + var105[4] * (float) var117 + var105[3] * (float) var116) / var120;
                            float var124 = (var105[8] * (float) var118 + var105[7] * (float) var117 + var105[6] * (float) var116) / var121;
                            var62 = class220.method1442((byte) -126, var124, var122, var123);
                            class566.method3390(var62, var107, var103, class693.field9690, var102, var105, var109, arg1.field884[var99], 5, var104, var106, arg1.field887[var99], arg1.field876[var99], var108);
                            var54 = class693.field9690[0];
                            var55 = class693.field9690[1];
                            class566.method3390(var62, var107, var103, class693.field9690, var102, var105, var109, arg1.field884[var100], 5, var104, var106, arg1.field887[var100], arg1.field876[var100], var108);
                            var57 = class693.field9690[1];
                            var56 = class693.field9690[0];
                            class566.method3390(var62, var107, var103, class693.field9690, var102, var105, var109, arg1.field884[var101], 5, var104, var106, arg1.field887[var101], arg1.field876[var101], var108);
                            var59 = class693.field9690[1];
                            var58 = class693.field9690[0];
                        } else if (var63 == 3) {
                            class621.method3639(class693.field9690, (byte) -128, arg1.field876[var99], var102, var103, var105, var107, arg1.field884[var99], var104, arg1.field887[var99], var106);
                            var55 = class693.field9690[1];
                            var54 = class693.field9690[0];
                            class621.method3639(class693.field9690, (byte) -128, arg1.field876[var100], var102, var103, var105, var107, arg1.field884[var100], var104, arg1.field887[var100], var106);
                            var57 = class693.field9690[1];
                            var56 = class693.field9690[0];
                            class621.method3639(class693.field9690, (byte) -128, arg1.field876[var101], var102, var103, var105, var107, arg1.field884[var101], var104, arg1.field887[var101], var106);
                            var58 = class693.field9690[0];
                            var59 = class693.field9690[1];
                            if ((var106 & 0x1) == 0) {
                                if ((var56 - var54 > 0.5F)) {
                                    var60 = 1;
                                    var56--;
                                } else if (var54 - var56 > 0.5F) {
                                    var56++;
                                    var60 = 2;
                                }
                                if ((var58 - var54 > 0.5F)) {
                                    var58--;
                                    var61 = 1;
                                } else if (var54 - var58 > 0.5F) {
                                    var58++;
                                    var61 = 2;
                                }
                            } else {
                                if ((var59 - var55 > 0.5F)) {
                                    var61 = 1;
                                    var59--;
                                } else if (var55 - var59 > 0.5F) {
                                    var61 = 2;
                                    var59++;
                                }
                                if (var57 - var55 > 0.5F) {
                                    var57--;
                                    var60 = 1;
                                } else if (var55 - var57 > 0.5F) {
                                    var57++;
                                    var60 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var127;
            if (arg1.field858 == null) {
                var127 = 0;
            } else {
                var127 = arg1.field858[var48];
            }
            if (var127 == 0) {
                long var128 = (long) (var50 << 2) + ((long) (var49 << 8) + (long) var51 + (long) (var62 << 24) << 32);
                short var130 = arg1.field863[var48];
                short var131 = arg1.field865[var48];
                short var132 = arg1.field852[var48];
                class190 var133 = var13[var130];
                this.field8233[var27] = this.method3441(var133.field2760, var128, var133.field2763, 0, var133.field2765, arg1, var133.field2758, var130, var54, var27, var55);
                class190 var134 = var13[var131];
                this.field8138[var27] = this.method3441(var134.field2760, (long) var60 + var128, var134.field2763, 0, var134.field2765, arg1, var134.field2758, var131, var56, var27, var57);
                class190 var135 = var13[var132];
                this.field8182[var27] = this.method3441(var135.field2760, (long) var61 + var128, var135.field2763, 0, var135.field2765, arg1, var135.field2758, var132, var58, var27, var59);
            } else if (var127 == 1) {
                class332 var136 = var25[var48];
                long var137 = (long) ((var136.field4259 > 0 ? 1024 : 2048) + (var50 << 2) + (var136.field4258 + 256 << 12) + (var136.field4254 + 256 << 22)) + ((long) (var62 << 24) + ((long) (var49 << 8)) + (long) var51 << 32);
                this.field8233[var27] = this.method3441(var136.field4259, var137, var136.field4258, 0, 0, arg1, var136.field4254, arg1.field863[var48], var54, var27, var55);
                this.field8138[var27] = this.method3441(var136.field4259, (long) var60 + var137, var136.field4258, 0, 0, arg1, var136.field4254, arg1.field865[var48], var56, var27, var57);
                this.field8182[var27] = this.method3441(var136.field4259, (long) var61 + var137, var136.field4258, 0, 0, arg1, var136.field4254, arg1.field852[var48], var58, var27, var59);
            }
            if (arg1.field864 != null) {
                this.field8235[var27] = arg1.field864[var48];
            }
            if (arg1.field883 != null) {
                this.field8212[var27] = arg1.field883[var48];
            }
            this.field8224[var27] = arg1.field872[var48];
            this.field8252[var27] = var52;
        }
        if (this.field8181 > 0) {
            int var28 = 1;
            short var29 = this.field8252[0];
            for (int var30 = 0; var30 < this.field8181; var30++) {
                short var40 = this.field8252[var30];
                if (var29 != var40) {
                    var29 = var40;
                    var28++;
                }
            }
            this.field8184 = new int[var28 + 1];
            this.field8222 = new int[var28];
            this.field8166 = new int[var28];
            this.field8184[0] = 0;
            int var31 = this.field8186;
            int var32 = 0;
            short var33 = this.field8252[0];
            short var34 = 0;
            for (int var35 = 0; var35 < this.field8181; var35++) {
                short var36 = this.field8252[var35];
                if (var33 != var36) {
                    this.field8222[var32] = var31;
                    this.field8166[var32] = var34 + 1 - var31;
                    var32++;
                    this.field8184[var32] = var35;
                    var31 = this.field8186;
                    var33 = var36;
                    var34 = 0;
                }
                short var37 = this.field8233[var35];
                if (var34 < var37) {
                    var34 = var37;
                }
                if (var31 > var37) {
                    var31 = var37;
                }
                short var38 = this.field8138[var35];
                if (var34 < var38) {
                    var34 = var38;
                }
                if (var31 > var38) {
                    var31 = var38;
                }
                short var39 = this.field8182[var35];
                if (var39 > var34) {
                    var34 = var39;
                }
                if (var39 < var31) {
                    var31 = var39;
                }
            }
            this.field8222[var32] = var31;
            this.field8166[var32] = var34 + 1 - var31;
            var32++;
            this.field8184[var32] = this.field8181;
        }
        class640.field9092 = null;
        this.field8192 = class473.method2812(this.field8186, this.field8192, (byte) 55);
        this.field8161 = class473.method2812(this.field8186, this.field8161, (byte) 55);
        this.field8243 = class473.method2812(this.field8186, this.field8243, (byte) 55);
        this.field8251 = class473.method2812(this.field8186, this.field8251, (byte) 55);
        this.field8137 = class473.method2812(this.field8186, this.field8137, (byte) 55);
        this.field8178 = class713.method4021(0, this.field8178, this.field8186);
        this.field8238 = class674.method3863(this.field8186, this.field8238, (byte) 47);
        this.field8203 = class674.method3863(this.field8186, this.field8203, (byte) 100);
        if (arg1.field855 != null && class218.method1427((byte) -120, this.field8213, arg2)) {
            this.field8245 = arg1.method424(false, (byte) -98);
        }
        if (arg1.field879 != null && class50.method346(this.field8213, (byte) 123, arg2)) {
            this.field8140 = arg1.method411(-63);
        }
        if (arg1.field878 != null && class226.method1468(arg2, this.field8213, 7961)) {
            int var41 = 0;
            int[] var42 = new int[256];
            for (int var43 = 0; var43 < this.field8157; var43++) {
                int var47 = arg1.field878[var8[var43]];
                if (var47 >= 0) {
                    int var10002 = var42[var47]++;
                    if (var41 < var47) {
                        var41 = var47;
                    }
                }
            }
            this.field8201 = new int[var41 + 1][];
            for (int var44 = 0; var44 <= var41; var44++) {
                this.field8201[var44] = new int[var42[var44]];
                var42[var44] = 0;
            }
            for (int var45 = 0; var45 < this.field8157; var45++) {
                int var46 = arg1.field878[var8[var45]];
                if (var46 >= 0) {
                    this.field8201[var46][var42[var46]++] = var45;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)V", line = 4151)
    public final void method3436(int arg0) {
        if (this.field8139 != null) {
            this.field8139.method430((byte) -123);
        }
        field8144++;
        if (arg0 <= 113) {
            this.method1161(104, -100, -62);
        }
        if (this.field8174 != null) {
            this.field8174.method430((byte) -106);
        }
        if (this.field8152 != null) {
            this.field8152.method430((byte) -72);
        }
        if (this.field8230 != null) {
            this.field8230.method430((byte) -104);
        }
        if (this.field8163 != null) {
            this.field8163.method1759(2075817543);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Luha;IZ)V", line = 4178)
    public final void method1129(class723 arg0, int arg1, boolean arg2) {
        field8193++;
        if (this.field8207 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field8176; var5++) {
            if ((this.field8207[var5] & arg1) != 0) {
                if (arg2) {
                    arg0.method871(this.field8190[var5], this.field8187[var5], this.field8227[var5], var4);
                } else {
                    arg0.method861(this.field8190[var5], this.field8187[var5], this.field8227[var5], var4);
                }
                this.field8190[var5] = var4[0];
                this.field8187[var5] = var4[1];
                this.field8227[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "wa", descriptor = "()V", line = 4218)
    public final void method1116() {
        field8143++;
        for (int var1 = 0; var1 < this.field8151; var1++) {
            this.field8190[var1] = this.field8190[var1] + 7 >> 4;
            this.field8187[var1] = this.field8187[var1] + 7 >> 4;
            this.field8227[var1] = this.field8227[var1] + 7 >> 4;
        }
        this.method3428(-1);
        this.field8173 = false;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V", line = 4242)
    private final void method3437(byte arg0) {
        field8146++;
        if (arg0 >= -99 || this.field8181 == 0) {
            return;
        }
        if (this.method3439((byte) 80) && this.method3440(7782)) {
            this.field8232.method564(0, this.field8139.field907, false);
            this.field8232.method564(1, this.field8152.field907, false);
            this.field8232.method564(2, this.field8174.field907, false);
            boolean var2;
            if ((this.field8213 & 0x37) == 0) {
                this.field8232.method2910(false, (byte) -20);
                var2 = false;
                this.field8232.method565(false, this.field8232.field6930);
            } else {
                this.field8232.method2910(true, (byte) -56);
                var2 = true;
                this.field8232.method564(3, this.field8230.field907, false);
                this.field8232.method565(false, this.field8232.field6920);
            }
            for (int var3 = 0; var3 < this.field8222.length; var3++) {
                int var4 = this.field8184[var3];
                int var5 = this.field8184[var3 + 1];
                int var6 = this.field8252[var4] & 0xFFFF;
                if (var6 == 65535) {
                    var6 = -1;
                }
                this.field8232.method2951(true, var2, true, var6);
                this.field8232.method612(class756.field10497, var4 * 3, this.field8222[var3], true, this.field8166[var3], this.field8163.field3911, var5 - var4);
            }
        }
        this.method3427(-8198);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lka;IIIZ)V", line = 4301)
    public final void method1152(class283 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8154++;
        class576 var6 = (class576) arg0;
        if (this.field8157 == 0 || var6.field8157 == 0) {
            return;
        }
        int var7 = var6.field8176;
        int[] var8 = var6.field8190;
        int[] var9 = var6.field8187;
        int[] var10 = var6.field8227;
        short[] var11 = var6.field8243;
        short[] var12 = var6.field8251;
        short[] var13 = var6.field8137;
        byte[] var14 = var6.field8178;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field8249 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var17 = this.field8249.field1647;
            var15 = this.field8249.field1645;
            var16 = this.field8249.field1646;
            var18 = this.field8249.field1644;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field8249 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field8249.field1644;
            var20 = var6.field8249.field1647;
            var22 = var6.field8249.field1645;
            var21 = var6.field8249.field1646;
        }
        int[] var23 = var6.field8162;
        short[] var24 = var6.field8180;
        if (!var6.field8173) {
            var6.method3435((byte) -121);
        }
        int var25 = var6.field8211;
        int var26 = var6.field8247;
        int var27 = var6.field8248;
        int var28 = var6.field8223;
        int var29 = var6.field8234;
        int var30 = var6.field8165;
        for (int var31 = 0; var31 < this.field8176; var31++) {
            int var32 = this.field8187[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field8190[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field8227[var31] - arg3;
                    if (var29 <= var34 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field8162[var31];
                        int var37 = this.field8162[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field8180[var38] - 1;
                            if (var35 == -1 || this.field8178[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39 + 1];
                                    int var41 = var23[var39];
                                    int var42 = -1;
                                    for (int var43 = var41; var43 < var40; var43++) {
                                        var42 = var24[var43] - 1;
                                        if (var42 == -1 || var14[var42] != 0) {
                                            break;
                                        }
                                    }
                                    if (var42 != -1) {
                                        if (var18 == null) {
                                            this.field8249 = new class119();
                                            var18 = this.field8249.field1644 = class347.method1985(0, this.field8243);
                                            var17 = this.field8249.field1647 = class347.method1985(0, this.field8251);
                                            var16 = this.field8249.field1646 = class347.method1985(0, this.field8137);
                                            var15 = this.field8249.field1645 = class82.method486(-100, this.field8178);
                                        }
                                        if (var19 == null) {
                                            class119 var44 = var6.field8249 = new class119();
                                            var19 = var44.field1644 = class347.method1985(0, var11);
                                            var20 = var44.field1647 = class347.method1985(0, var12);
                                            var21 = var44.field1646 = class347.method1985(0, var13);
                                            var22 = var44.field1645 = class82.method486(99, var14);
                                        }
                                        short var45 = this.field8243[var35];
                                        short var46 = this.field8251[var35];
                                        short var47 = this.field8137[var35];
                                        int var48 = var23[var39];
                                        byte var49 = this.field8178[var35];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var48; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var49;
                                            }
                                        }
                                        short var53 = var13[var42];
                                        int var54 = this.field8162[var31];
                                        short var55 = var11[var42];
                                        byte var56 = var14[var42];
                                        short var57 = var12[var42];
                                        int var58 = this.field8162[var31 + 1];
                                        for (int var59 = var54; var59 < var58; var59++) {
                                            int var60 = this.field8180[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var18[var60] += var55;
                                                var17[var60] += var57;
                                                var16[var60] += var53;
                                                var15[var60] += var56;
                                            }
                                        }
                                        var6.method3429(-5);
                                        this.method3429(3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "()V", line = 4567)
    public final void method1160() {
        field8239++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIIII)Z", line = 4576)
    private final boolean method3438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8148++;
        if (arg4 < arg0 && arg4 < arg8 && arg2 > arg4) {
            return false;
        } else if (arg3 != -29864) {
            return false;
        } else if (arg0 < arg4 && arg4 > arg8 && arg2 < arg4) {
            return false;
        } else if (arg6 > arg1 && arg7 > arg1 && arg1 < arg5) {
            return false;
        } else {
            return arg1 <= arg6 || arg1 <= arg7 || arg1 <= arg5;
        }
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "()V", line = 4604)
    public final void method1112() {
        field8134++;
        if (this.field8186 > 0 && this.field8181 > 0) {
            this.method3439((byte) 50);
            this.method3440(7782);
            this.method3427(-8198);
        }
    }

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "()Z", line = 4623)
    public final boolean method1130() {
        field8209++;
        return this.field8214;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)Z", line = 4634)
    private final boolean method3439(byte arg0) {
        field8205++;
        boolean var2 = !this.field8152.field901;
        if (arg0 <= 38) {
            this.field8182 = null;
        }
        boolean var3 = (this.field8213 & 0x37) != 0 && !this.field8230.field901;
        boolean var4 = !this.field8139.field901;
        boolean var5 = !this.field8174.field901;
        if (!var4 && !var2 && !var3 && !var5) {
            return true;
        }
        boolean var6 = true;
        if (var4) {
            if (this.field8139.field906 == null) {
                this.field8139.field906 = this.field8232.method638((byte) -85, this.field8169);
            }
            class251 var7 = this.field8139.field906;
            var7.method1591(-17230, this.field8186 * 12, 12);
            Buffer var8 = var7.method1590((byte) 64, true);
            if (var8 == null) {
                var6 = false;
            } else {
                this.field8232.field6741.copyPositions(this.field8190, this.field8187, this.field8227, this.field8192, 0, 12, this.field8186, var8.getAddress());
                if (var7.method1592(-14952)) {
                    this.field8139.field907 = var7;
                    this.field8139.field901 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var2) {
            if (this.field8152.field906 == null) {
                this.field8152.field906 = this.field8232.method638((byte) -111, this.field8169);
            }
            class251 var9 = this.field8152.field906;
            var9.method1591(-17230, this.field8186 * 4, 4);
            Buffer var10 = var9.method1590((byte) 64, true);
            if (var10 == null) {
                var6 = false;
            } else {
                if ((this.field8213 & 0x37) == 0) {
                    short[] var11;
                    short[] var12;
                    short[] var13;
                    byte[] var14;
                    if (this.field8249 == null) {
                        var11 = this.field8243;
                        var12 = this.field8251;
                        var13 = this.field8137;
                        var14 = this.field8178;
                    } else {
                        var13 = this.field8249.field1646;
                        var14 = this.field8249.field1645;
                        var12 = this.field8249.field1647;
                        var11 = this.field8249.field1644;
                    }
                    this.field8232.field6741.copyLighting(this.field8224, this.field8235, this.field8252, var11, var12, var13, var14, this.field8250, this.field8159, this.field8161, 0, 4, this.field8186, var10.getAddress());
                } else {
                    this.field8232.field6741.copyColours(this.field8224, this.field8235, this.field8252, this.field8250, this.field8161, 0, 4, this.field8186, var10.getAddress());
                }
                if (var9.method1592(-14952)) {
                    this.field8152.field901 = true;
                    this.field8152.field907 = var9;
                } else {
                    var6 = false;
                }
            }
        }
        if (var3) {
            if (this.field8230.field906 == null) {
                this.field8230.field906 = this.field8232.method638((byte) -91, this.field8169);
            }
            class251 var15 = this.field8230.field906;
            var15.method1591(-17230, this.field8186 * 12, 12);
            Buffer var16 = var15.method1590((byte) 64, true);
            if (var16 == null) {
                var6 = false;
            } else {
                short[] var17;
                short[] var18;
                short[] var19;
                byte[] var20;
                if (this.field8249 == null) {
                    var19 = this.field8137;
                    var17 = this.field8251;
                    var18 = this.field8243;
                    var20 = this.field8178;
                } else {
                    var17 = this.field8249.field1647;
                    var18 = this.field8249.field1644;
                    var19 = this.field8249.field1646;
                    var20 = this.field8249.field1645;
                }
                this.field8232.field6741.copyNormals(var18, var17, var19, var20, 3.0F / (float) this.field8159, 3.0F / (float) (this.field8159 / 2 + this.field8159), 0, 12, this.field8186, var16.getAddress());
                if (var15.method1592(-14952)) {
                    this.field8230.field901 = true;
                    this.field8230.field907 = var15;
                } else {
                    var6 = false;
                }
            }
        }
        if (var5) {
            if (this.field8174.field906 == null) {
                this.field8174.field906 = this.field8232.method638((byte) -122, this.field8169);
            }
            class251 var21 = this.field8174.field906;
            var21.method1591(-17230, this.field8186 * 8, 8);
            Buffer var22 = var21.method1590((byte) 64, true);
            if (var22 == null) {
                var6 = false;
            } else {
                this.field8232.field6741.copyTexCoords(this.field8238, this.field8203, 0, 8, this.field8186, var22.getAddress());
                if (var21.method1592(-14952)) {
                    this.field8174.field901 = true;
                    this.field8174.field907 = var21;
                } else {
                    var6 = false;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "(I)Z", line = 4828)
    private final boolean method3440(int arg0) {
        field8217++;
        if (this.field8163.field3913) {
            return true;
        }
        if (this.field8163.field3910 == null) {
            this.field8163.field3910 = this.field8232.method634(this.field8169, true);
        }
        class212 var2 = this.field8163.field3910;
        if (arg0 != 7782) {
            return true;
        }
        var2.method1399(this.field8181 * 6, true);
        Buffer var3 = var2.method1401(true, 67);
        if (var3 != null) {
            Stream var4 = this.field8232.method2917(var3, false);
            if (Stream.method2541()) {
                for (int var6 = 0; var6 < this.field8181; var6++) {
                    var4.method2554(this.field8233[var6]);
                    var4.method2554(this.field8138[var6]);
                    var4.method2554(this.field8182[var6]);
                }
            } else {
                for (int var5 = 0; var5 < this.field8181; var5++) {
                    var4.method2544(this.field8233[var5]);
                    var4.method2544(this.field8138[var5]);
                    var4.method2544(this.field8182[var5]);
                }
            }
            var4.method2551();
            if (var2.method1400(false)) {
                this.field8163.field3913 = true;
                this.field8242 = true;
                this.field8163.field3911 = var2;
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qd", name = "ia", descriptor = "(SS)V", line = 4894)
    public final void method1134(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field8157; var3++) {
            if (this.field8224[var3] == arg0) {
                this.field8224[var3] = arg1;
            }
        }
        field8200++;
        if (this.field8229 != null) {
            for (int var4 = 0; var4 < this.field8228; var4++) {
                class298 var5 = this.field8229[var4];
                class356 var6 = this.field8206[var4];
                var6.field4569 = var6.field4569 & 0xFF000000 | class673.field9471[this.field8224[var5.field3890] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method3431(9);
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "()V", line = 4934)
    public final void method1123() {
        field8172++;
    }

    @OriginalMember(owner = "client!qd", name = "RA", descriptor = "()I", line = 4948)
    public final int method1169() {
        if (!this.field8173) {
            this.method3435((byte) -127);
        }
        field8204++;
        return this.field8223;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IJIIILkda;IIFIF)S", line = 4964)
    private final short method3441(int arg0, long arg1, int arg2, int arg3, int arg4, class64 arg5, int arg6, int arg7, float arg8, int arg9, float arg10) {
        field8202++;
        int var13 = this.field8162[arg7];
        int var14 = this.field8162[arg7 + 1];
        int var15 = arg3;
        for (int var16 = var13; var16 < var14; var16++) {
            short var17 = this.field8180[var16];
            if (var17 == 0) {
                var15 = var16;
                break;
            }
            if (class640.field9092[var16] == arg1) {
                return (short) (var17 - 1);
            }
        }
        this.field8180[var15] = (short) (this.field8186 + 1);
        class640.field9092[var15] = arg1;
        this.field8161[this.field8186] = (short) arg9;
        this.field8192[this.field8186] = (short) arg7;
        this.field8243[this.field8186] = (short) arg0;
        this.field8251[this.field8186] = (short) arg2;
        this.field8137[this.field8186] = (short) arg6;
        this.field8178[this.field8186] = (byte) arg4;
        this.field8238[this.field8186] = arg8;
        this.field8203[this.field8186] = arg10;
        return (short) (this.field8186++);
    }

    @OriginalMember(owner = "client!qd", name = "da", descriptor = "()I", line = 5009)
    public final int method1141() {
        field8171++;
        return this.field8159;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 5021)
    private final void method3442(boolean arg0) {
        if (!arg0) {
            if (this.field8163 != null) {
                this.field8163.field3913 = false;
            }
            field8131++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "na", descriptor = "()I", line = 5036)
    public final int method1132() {
        if (!this.field8173) {
            this.method3435((byte) -124);
        }
        field8257++;
        return this.field8255;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "()Z", line = 5051)
    public final boolean method1153() {
        field8253++;
        if (this.field8252 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field8252.length; var1++) {
            if (this.field8252[var1] != -1 && !this.field8232.field7694.method86((byte) 117, this.field8252[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "(III)V", line = 5075)
    public final void method1117(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field8176; var4++) {
            if (arg0 != 0) {
                this.field8190[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field8187[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field8227[var4] += arg2;
            }
        }
        field8156++;
        this.method3428(-1);
        this.field8173 = false;
    }

    @OriginalMember(owner = "client!qd", name = "fa", descriptor = "()I", line = 5105)
    public final int method1120() {
        field8160++;
        if (!this.field8173) {
            this.method3435((byte) -122);
        }
        return this.field8211;
    }

    @OriginalMember(owner = "client!qd", name = "ba", descriptor = "(Lr;)Lr;", line = 5116)
    public final class706 method1124(class706 arg0) {
        field8145++;
        if (this.field8186 == 0) {
            return null;
        }
        if (!this.field8173) {
            this.method3435((byte) -124);
        }
        int var2;
        int var3;
        if (this.field8232.field6902 <= 0) {
            var2 = this.field8248 - (this.field8232.field6902 * this.field8211 >> 8) >> this.field8232.field6818;
            var3 = this.field8223 - (this.field8232.field6902 * this.field8247 >> 8) >> this.field8232.field6818;
        } else {
            var2 = this.field8248 - (this.field8232.field6902 * this.field8247 >> 8) >> this.field8232.field6818;
            var3 = this.field8223 - (this.field8232.field6902 * this.field8211 >> 8) >> this.field8232.field6818;
        }
        int var4;
        int var5;
        if (this.field8232.field6862 > 0) {
            var4 = this.field8234 - (this.field8232.field6862 * this.field8247 >> 8) >> this.field8232.field6818;
            var5 = this.field8165 - (this.field8232.field6862 * this.field8211 >> 8) >> this.field8232.field6818;
        } else {
            var4 = this.field8234 - (this.field8232.field6862 * this.field8211 >> 8) >> this.field8232.field6818;
            var5 = this.field8165 - (this.field8232.field6862 * this.field8247 >> 8) >> this.field8232.field6818;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class450 var8 = (class450) arg0;
        class450 var9;
        if (var8 != null && var8.method2709(var6, var7, 1073741824)) {
            var9 = var8;
            var8.method2702((byte) -13);
        } else {
            var9 = new class450(this.field8232, var6, var7);
        }
        var9.method2705((byte) -74, var5, var4, var2, var3);
        this.method3432((byte) 98, var9);
        return var9;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([BIILjava/lang/String;ZI)I", line = 5176)
    public static final int method3443(byte[] arg0, int arg1, int arg2, String arg3, boolean arg4, int arg5) {
        field8189++;
        int var6 = arg5 - arg2;
        if (!arg4) {
            return -47;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg3.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg1 + var7] = -97;
            } else {
                arg0[arg1 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "(I[IIIIZI[I)V", line = 5314)
    public final void method1138(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field8244++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            int var12 = arg3 << 4;
            class631.field8997 = 0;
            int var13 = 0;
            class561.field7973 = 0;
            class483.field6545 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field8245.length) {
                    int[] var16 = this.field8245[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field8207 == null || (arg6 & this.field8207[var18]) != 0) {
                            class561.field7973 += this.field8190[var18];
                            class631.field8997 += this.field8187[var18];
                            class483.field6545 += this.field8227[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class561.field7973 = class561.field7973 / var13 + var10;
                class483.field6545 = class483.field6545 / var13 + var11;
                class631.field8997 = class631.field8997 / var13 + var12;
                class354.field4551 = true;
            } else {
                class631.field8997 = var12;
                class561.field7973 = var10;
                class483.field6545 = var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + (arg7[1] * arg3 - (-(arg7[2] * arg4) - 8192)) >> 14;
                int var20 = arg7[3] * arg2 + 8192 - (-(arg7[4] * arg3) - arg7[5] * arg4) >> 14;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
                arg4 = var21;
                arg3 = var20;
                arg2 = var19;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field8245.length > var26) {
                    int[] var27 = this.field8245[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field8207 == null || (arg6 & this.field8207[var29]) != 0) {
                            this.field8190[var29] += var24;
                            this.field8187[var29] += var23;
                            this.field8227[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field8245.length) {
                        int[] var50 = this.field8245[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field8207 == null || (arg6 & this.field8207[var52]) != 0) {
                                this.field8190[var52] -= class561.field7973;
                                this.field8187[var52] -= class631.field8997;
                                this.field8227[var52] -= class483.field6545;
                                if (arg4 != 0) {
                                    int var53 = class231.field3217[arg4];
                                    int var54 = class231.field3218[arg4];
                                    int var55 = this.field8190[var52] * var54 + this.field8187[var52] * var53 + 16383 >> 14;
                                    this.field8187[var52] = this.field8187[var52] * var54 + 16383 - (this.field8190[var52] * var53) >> 14;
                                    this.field8190[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class231.field3217[arg2];
                                    int var57 = class231.field3218[arg2];
                                    int var58 = this.field8187[var52] * var57 + (16383 - (this.field8227[var52] * var56)) >> 14;
                                    this.field8227[var52] = this.field8187[var52] * var56 + this.field8227[var52] * var57 + 16383 >> 14;
                                    this.field8187[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class231.field3217[arg3];
                                    int var60 = class231.field3218[arg3];
                                    int var61 = this.field8227[var52] * var59 + this.field8190[var52] * var60 + 16383 >> 14;
                                    this.field8227[var52] = this.field8227[var52] * var60 + 16383 - (this.field8190[var52] * var59) >> 14;
                                    this.field8190[var52] = var61;
                                }
                                this.field8190[var52] += class561.field7973;
                                this.field8187[var52] += class631.field8997;
                                this.field8227[var52] += class483.field6545;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field8245.length > var32) {
                            int[] var33 = this.field8245[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field8207 == null || (this.field8207[var35] & arg6) != 0) {
                                    int var36 = this.field8162[var35];
                                    int var37 = this.field8162[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field8180[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class231.field3217[arg4];
                                            int var41 = class231.field3218[arg4];
                                            int var42 = this.field8251[var39] * var40 + (this.field8243[var39] * var41) + 16383 >> 14;
                                            this.field8251[var39] = (short) (this.field8251[var39] * var41 + 16383 - (this.field8243[var39] * var40) >> 14);
                                            this.field8243[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class231.field3217[arg2];
                                            int var44 = class231.field3218[arg2];
                                            int var45 = this.field8251[var39] * var44 + 16383 - (this.field8137[var39] * var43) >> 14;
                                            this.field8137[var39] = (short) (this.field8251[var39] * var43 + this.field8137[var39] * var44 + 16383 >> 14);
                                            this.field8251[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class231.field3217[arg3];
                                            int var47 = class231.field3218[arg3];
                                            int var48 = this.field8137[var39] * var46 + this.field8243[var39] * var47 + 16383 >> 14;
                                            this.field8137[var39] = (short) (this.field8137[var39] * var47 + 16383 - (this.field8243[var39] * var46) >> 14);
                                            this.field8243[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method3429(122);
                    return;
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class354.field4551) {
                    int var68 = arg7[6] * class483.field6545 + arg7[0] * class561.field7973 + (arg7[3] * class631.field8997) + 8192 >> 14;
                    int var69 = arg7[7] * class483.field6545 + arg7[4] * class631.field8997 + arg7[1] * class561.field7973 + 8192 >> 14;
                    int var70 = var66 + var69;
                    int var71 = var65 + var68;
                    int var72 = arg7[2] * class561.field7973 - (-(arg7[5] * class631.field8997) - arg7[8] * class483.field6545 - 8192) >> 14;
                    class561.field7973 = var71;
                    int var73 = var67 + var72;
                    class631.field8997 = var70;
                    class354.field4551 = false;
                    class483.field6545 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class231.field3218[arg2];
                int var76 = class231.field3217[arg2];
                int var77 = class231.field3218[arg3];
                int var78 = class231.field3217[arg3];
                int var79 = class231.field3218[arg4];
                int var80 = class231.field3217[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[1] = -var77 * var80 + var78 * var81 + 8192 >> 14;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[5] = -var76;
                var74[7] = var77 * var81 + var78 * var80 + 8192 >> 14;
                var74[6] = -var78 * var79 + (var77 * var82) + 8192 >> 14;
                int var83 = var74[0] * -class561.field7973 + (var74[2] * -class483.field6545) + var74[1] * -class631.field8997 + 8192 >> 14;
                int var84 = var74[4] * -class631.field8997 + var74[3] * -class561.field7973 + var74[5] * -class483.field6545 + 8192 >> 14;
                int var85 = var74[6] * -class561.field7973 + (var74[7] * -class631.field8997) - (-(var74[8] * -class483.field6545) - 8192) >> 14;
                int var86 = class561.field7973 + var83;
                int var87 = var84 + class631.field8997;
                int var88 = var85 + class483.field6545;
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
                int var91 = var74[1] * var66 + (var74[0] * var65 + (var74[2] * var67)) + 8192 >> 14;
                int var92 = var74[3] * var65 + 8192 - (-(var74[4] * var66) - var74[5] * var67) >> 14;
                int var93 = var86 + var91;
                int var94 = var74[6] * var65 + var74[7] * var66 - (-(var74[8] * var67) + -8192) >> 14;
                int var95 = var87 + var92;
                int var96 = var88 + var94;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += var89[var116 + (var118 * 3)] * arg7[var98 * 3 + var118];
                        }
                        var97[var98 * 3 + var116] = var117 + 8192 >> 14;
                    }
                }
                int var99 = arg7[2] * var96 + arg7[1] * var95 + arg7[0] * var93 + 8192 >> 14;
                int var100 = arg7[5] * var96 + arg7[4] * var95 + arg7[3] * var93 + 8192 >> 14;
                int var101 = arg7[7] * var95 + (arg7[8] * var96) + arg7[6] * var93 + 8192 >> 14;
                int var102 = var63 + var100;
                int var103 = var62 + var99;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field8245.length) {
                        int[] var107 = this.field8245[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field8207 == null || (arg6 & this.field8207[var109]) != 0) {
                                int var110 = this.field8190[var109] * var97[0] + 8192 - (-(this.field8227[var109] * var97[2]) - (this.field8187[var109] * var97[1])) >> 14;
                                int var111 = this.field8227[var109] * var97[5] + this.field8190[var109] * var97[3] + this.field8187[var109] * var97[4] + 8192 >> 14;
                                int var112 = var103 + var110;
                                int var113 = this.field8187[var109] * var97[7] + (this.field8190[var109] * var97[6] - (-(this.field8227[var109] * var97[8]) - 8192)) >> 14;
                                int var114 = var102 + var111;
                                this.field8190[var109] = var112;
                                int var115 = var104 + var113;
                                this.field8187[var109] = var114;
                                this.field8227[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field8245.length) {
                        int[] var124 = this.field8245[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field8207 == null || (arg6 & this.field8207[var126]) != 0) {
                                this.field8190[var126] -= class561.field7973;
                                this.field8187[var126] -= class631.field8997;
                                this.field8227[var126] -= class483.field6545;
                                this.field8190[var126] = this.field8190[var126] * arg2 >> 7;
                                this.field8187[var126] = this.field8187[var126] * arg3 >> 7;
                                this.field8227[var126] = this.field8227[var126] * arg4 >> 7;
                                this.field8190[var126] += class561.field7973;
                                this.field8187[var126] += class631.field8997;
                                this.field8227[var126] += class483.field6545;
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
                if (class354.field4551) {
                    int var133 = arg7[6] * class483.field6545 + arg7[0] * class561.field7973 + (arg7[3] * class631.field8997 - -8192) >> 14;
                    int var134 = arg7[1] * class561.field7973 + arg7[7] * class483.field6545 + arg7[4] * class631.field8997 + 8192 >> 14;
                    int var135 = var130 + var133;
                    int var136 = arg7[8] * class483.field6545 + arg7[2] * class561.field7973 + arg7[5] * class631.field8997 + 8192 >> 14;
                    int var137 = var131 + var134;
                    class631.field8997 = var137;
                    int var138 = var132 + var136;
                    class561.field7973 = var135;
                    class483.field6545 = var138;
                    class354.field4551 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class561.field7973 * var139 + 8192 >> 14;
                int var143 = -class631.field8997 * var140 + 8192 >> 14;
                int var144 = -class483.field6545 * var141 + 8192 >> 14;
                int var145 = class561.field7973 + var142;
                int var146 = class631.field8997 + var143;
                int var147 = class483.field6545 + var144;
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
                int var157 = arg7[0] * var151 + arg7[2] * var154 + arg7[1] * var153 + 8192 >> 14;
                int var158 = arg7[4] * var153 + arg7[3] * var151 + arg7[5] * var154 + 8192 >> 14;
                int var159 = arg7[7] * var153 + arg7[6] * var151 - (-(arg7[8] * var154) - 8192) >> 14;
                int var160 = var127 + var157;
                int var161 = var128 + var158;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field8245.length > var164) {
                        int[] var165 = this.field8245[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field8207 == null || (arg6 & this.field8207[var167]) != 0) {
                                int var168 = this.field8227[var167] * var155[2] + this.field8190[var167] * var155[0] + this.field8187[var167] * var155[1] + 8192 >> 14;
                                int var169 = this.field8190[var167] * var155[3] + this.field8187[var167] * var155[4] + this.field8227[var167] * var155[5] + 8192 >> 14;
                                int var170 = var161 + var169;
                                int var171 = this.field8227[var167] * var155[8] + (this.field8190[var167] * var155[6] + this.field8187[var167] * var155[7] + 8192) >> 14;
                                int var172 = var160 + var168;
                                this.field8190[var167] = var172;
                                int var173 = var162 + var171;
                                this.field8187[var167] = var170;
                                this.field8227[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8201 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var182 = arg1[var178];
                    if (var182 < this.field8201.length) {
                        int[] var183 = this.field8201[var182];
                        for (int var184 = 0; var184 < var183.length; var184++) {
                            int var185 = var183[var184];
                            if (this.field8212 == null || (this.field8212[var185] & arg6) != 0) {
                                int var186 = (this.field8235[var185] & 0xFF) + arg2 * 8;
                                if (var186 < 0) {
                                    var186 = 0;
                                } else if (var186 > 255) {
                                    var186 = 255;
                                }
                                this.field8235[var185] = (byte) var186;
                            }
                        }
                        var177 |= var183.length > 0;
                    }
                }
                if (var177) {
                    if (this.field8229 != null) {
                        for (int var179 = 0; var179 < this.field8228; var179++) {
                            class298 var180 = this.field8229[var179];
                            class356 var181 = this.field8206[var179];
                            var181.field4569 = var181.field4569 & 0xFFFFFF | 255 - (this.field8235[var180.field3890] & 0xFF) << 24;
                        }
                    }
                    this.method3431(9);
                }
            }
        } else if (arg0 == 7) {
            if (this.field8201 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var192 = arg1[var188];
                    if (this.field8201.length > var192) {
                        int[] var193 = this.field8201[var192];
                        for (int var194 = 0; var194 < var193.length; var194++) {
                            int var195 = var193[var194];
                            if (this.field8212 == null || (this.field8212[var195] & arg6) != 0) {
                                int var196 = this.field8224[var195] & 0xFFFF;
                                int var197 = var196 >> 10 & 0x3F;
                                int var198 = var196 >> 7 & 0x7;
                                int var199 = arg3 / 4 + var198;
                                int var200 = var196 & 0x7F;
                                int var201 = arg2 + var197 & 0x3F;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                int var202 = arg4 + var200;
                                if (var202 < 0) {
                                    var202 = 0;
                                } else if (var202 > 127) {
                                    var202 = 127;
                                }
                                this.field8224[var195] = (short) class747.method4153(var202, class747.method4153(var201 << 10, var199 << 7));
                            }
                        }
                        var187 |= var193.length > 0;
                    }
                }
                if (var187) {
                    if (this.field8229 != null) {
                        for (int var189 = 0; var189 < this.field8228; var189++) {
                            class298 var190 = this.field8229[var189];
                            class356 var191 = this.field8206[var189];
                            var191.field4569 = var191.field4569 & 0xFF000000 | class673.field9471[this.field8224[var190.field3890] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method3431(9);
                }
            }
        } else if (arg0 == 8) {
            if (this.field8140 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (this.field8140.length > var204) {
                        int[] var205 = this.field8140[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            class356 var207 = this.field8206[var205[var206]];
                            var207.field4574 += arg2;
                            var207.field4568 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8140 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (var209 < this.field8140.length) {
                        int[] var210 = this.field8140[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            class356 var212 = this.field8206[var210[var211]];
                            var212.field4577 = var212.field4577 * arg3 >> 7;
                            var212.field4567 = var212.field4567 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8140 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (var214 < this.field8140.length) {
                    int[] var215 = this.field8140[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        class356 var217 = this.field8206[var215[var216]];
                        var217.field4578 = var217.field4578 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "(I)V", line = 6304)
    public final void method1131(int arg0) {
        field8220++;
        int var2 = class231.field3217[arg0];
        int var3 = class231.field3218[arg0];
        for (int var4 = 0; var4 < this.field8176; var4++) {
            int var7 = this.field8227[var4] * var2 + this.field8190[var4] * var3 >> 14;
            this.field8227[var4] = this.field8227[var4] * var3 - (this.field8190[var4] * var2) >> 14;
            this.field8190[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field8186; var5++) {
            int var6 = this.field8137[var5] * var2 + (this.field8243[var5] * var3) >> 14;
            this.field8137[var5] = (short) (this.field8137[var5] * var3 - (this.field8243[var5] * var2) >> 14);
            this.field8243[var5] = (short) var6;
        }
        this.method3428(-1);
        this.method3429(113);
        this.field8173 = false;
    }

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "()I", line = 6344)
    public final int method1136() {
        field8241++;
        if (!this.field8173) {
            this.method3435((byte) -122);
        }
        return this.field8165;
    }

    @OriginalMember(owner = "client!qd", name = "VA", descriptor = "(I)V", line = 6370)
    public final void method1167(int arg0) {
        field8218++;
        int var2 = class231.field3217[arg0];
        int var3 = class231.field3218[arg0];
        for (int var4 = 0; var4 < this.field8176; var4++) {
            int var5 = this.field8190[var4] * var3 + this.field8187[var4] * var2 >> 14;
            this.field8187[var4] = this.field8187[var4] * var3 - (this.field8190[var4] * var2) >> 14;
            this.field8190[var4] = var5;
        }
        this.method3428(-1);
        this.field8173 = false;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLvr;)V", line = 6397)
    public static final void method3444(boolean arg0, class200 arg1) {
        field8199++;
        if (class352.field4549 == null) {
            return;
        }
        class649 var2 = null;
        if (arg1.field2894 == 0) {
            var2 = (class649) class204.method1367(arg1.field2893, arg1.field2900, arg1.field2895);
        }
        if (arg1.field2894 == 1) {
            var2 = (class649) class744.method4146(arg1.field2893, arg1.field2900, arg1.field2895);
        }
        if (arg1.field2894 == 2) {
            var2 = (class649) class151.method970(arg1.field2893, arg1.field2900, arg1.field2895, field8258 == null ? (field8258 = method3445("vea")) : field8258);
        }
        if (arg1.field2894 == 3) {
            var2 = (class649) class340.method1963(arg1.field2893, arg1.field2900, arg1.field2895);
        }
        if (var2 == null) {
            arg1.field2901 = 0;
            arg1.field2898 = -1;
            arg1.field2892 = 0;
        } else {
            arg1.field2898 = var2.method275(24263);
            arg1.field2901 = var2.method276(-25963);
            arg1.field2892 = var2.method269(-17174);
        }
        if (!arg0) {
            field8226 = 39;
        }
    }

    @OriginalMember(owner = "client!qd", name = "LA", descriptor = "(I)V", line = 6439)
    public final void method1162(int arg0) {
        field8237++;
        this.field8159 = (short) arg0;
        this.method3428(-1);
        this.method3429(126);
    }
}
