import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class606 extends class359 {

    @OriginalMember(owner = "client!og", name = "Qb", descriptor = "[I")
    private int[] field8246;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    private int field8174;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    private int field8187;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    private int field8167;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    private int field8171;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "[I")
    private int[] field8190;

    @OriginalMember(owner = "client!og", name = "zb", descriptor = "[I")
    private int[] field8229;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "[S")
    private short[] field8165;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "[I")
    private int[] field8172;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    private int field8198;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "[Lfd;")
    private class493[] field8173;

    @OriginalMember(owner = "client!og", name = "Xb", descriptor = "[Let;")
    private class556[] field8253;

    @OriginalMember(owner = "client!og", name = "jb", descriptor = "I")
    private int field8213;

    @OriginalMember(owner = "client!og", name = "kb", descriptor = "[Llg;")
    private class384[] field8214;

    @OriginalMember(owner = "client!og", name = "qb", descriptor = "[Lnaa;")
    private class67[] field8220;

    @OriginalMember(owner = "client!og", name = "Yb", descriptor = "[S")
    private short[] field8254;

    @OriginalMember(owner = "client!og", name = "rc", descriptor = "[S")
    private short[] field8273;

    @OriginalMember(owner = "client!og", name = "vb", descriptor = "[B")
    private byte[] field8225;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "[B")
    private byte[] field8196;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "[S")
    private short[] field8199;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "[S")
    private short[] field8185;

    @OriginalMember(owner = "client!og", name = "cc", descriptor = "[S")
    private short[] field8258;

    @OriginalMember(owner = "client!og", name = "Hb", descriptor = "S")
    private short field8237;

    @OriginalMember(owner = "client!og", name = "oc", descriptor = "[S")
    private short[] field8270;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "[S")
    private short[] field8168;

    @OriginalMember(owner = "client!og", name = "ib", descriptor = "S")
    private short field8212;

    @OriginalMember(owner = "client!og", name = "ub", descriptor = "[S")
    private short[] field8224;

    @OriginalMember(owner = "client!og", name = "dc", descriptor = "[S")
    private short[] field8259;

    @OriginalMember(owner = "client!og", name = "Pb", descriptor = "[F")
    private float[] field8245;

    @OriginalMember(owner = "client!og", name = "tb", descriptor = "[S")
    private short[] field8223;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "[S")
    private short[] field8193;

    @OriginalMember(owner = "client!og", name = "lb", descriptor = "[F")
    private float[] field8215;

    @OriginalMember(owner = "client!og", name = "Lb", descriptor = "[S")
    private short[] field8241;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "[I")
    private int[] field8200;

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "[I")
    private int[] field8204;

    @OriginalMember(owner = "client!og", name = "Ib", descriptor = "[I")
    private int[] field8238;

    @OriginalMember(owner = "client!og", name = "ob", descriptor = "I")
    private int field8218;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    private int field8195;

    @OriginalMember(owner = "client!og", name = "fc", descriptor = "[[I")
    private int[][] field8261;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "[[I")
    private int[][] field8201;

    @OriginalMember(owner = "client!og", name = "sb", descriptor = "[[I")
    private int[][] field8222;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "Z")
    private boolean field8178;

    @OriginalMember(owner = "client!og", name = "rb", descriptor = "Z")
    private boolean field8221;

    @OriginalMember(owner = "client!og", name = "sc", descriptor = "Z")
    private boolean field8274;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "Lkea;")
    private class223 field8162;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Lde;")
    private class497 field8164;

    @OriginalMember(owner = "client!og", name = "wb", descriptor = "Lde;")
    private class497 field8226;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "Lde;")
    private class497 field8177;

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "Lde;")
    private class497 field8205;

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "Lrj;")
    private class557 field8206;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    private int field8160;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field8161;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field8163;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    private int field8181;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "I")
    public static int field8182;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    private int field8194;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    private int field8197;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!og", name = "db", descriptor = "I")
    public static int field8207;

    @OriginalMember(owner = "client!og", name = "eb", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!og", name = "fb", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!og", name = "gb", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!og", name = "hb", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!og", name = "mb", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!og", name = "nb", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!og", name = "pb", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!og", name = "xb", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!og", name = "yb", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!og", name = "Ab", descriptor = "I")
    private int field8230;

    @OriginalMember(owner = "client!og", name = "Bb", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!og", name = "Cb", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!og", name = "Db", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!og", name = "Eb", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!og", name = "Fb", descriptor = "I")
    public static int field8235;

    @OriginalMember(owner = "client!og", name = "Gb", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!og", name = "Jb", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!og", name = "Kb", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!og", name = "Mb", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!og", name = "Ob", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!og", name = "Rb", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!og", name = "Sb", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!og", name = "Tb", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!og", name = "Ub", descriptor = "I")
    public static int field8250;

    @OriginalMember(owner = "client!og", name = "Vb", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!og", name = "Wb", descriptor = "I")
    public static int field8252;

    @OriginalMember(owner = "client!og", name = "Zb", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!og", name = "ac", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!og", name = "bc", descriptor = "I")
    private int field8257;

    @OriginalMember(owner = "client!og", name = "ec", descriptor = "I")
    private int field8260;

    @OriginalMember(owner = "client!og", name = "gc", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!og", name = "hc", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!og", name = "ic", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!og", name = "jc", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!og", name = "kc", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!og", name = "lc", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!og", name = "mc", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!og", name = "nc", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!og", name = "pc", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!og", name = "qc", descriptor = "I")
    public static int field8272;

    @OriginalMember(owner = "client!og", name = "Nb", descriptor = "Lon;")
    private class314 field8243;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)V")
    public final void method2060(int arg0, int arg1, int arg2, int arg3) {
        field8184++;
        for (int var5 = 0; var5 < this.field8174; var5++) {
            int var9 = this.field8224[var5] & 0xFFFF;
            int var10 = (var9 & 0xFD43) >> 10;
            int var11 = var9 >> 7 & 0x7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field8224[var5] = (short) class364.method2113(var12, class364.method2113(var10 << 10, var11 << 7));
        }
        if (this.field8214 != null) {
            for (int var6 = 0; var6 < this.field8213; var6++) {
                class384 var7 = this.field8214[var6];
                class67 var8 = this.field8220[var6];
                var8.field810 = class76.field999[this.field8224[var7.field4937] & 0xFFFF] & 0xFFFFFF | var8.field810 & 0xFF000000;
            }
        }
        this.method3366(-110);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lq;Lpo;II)V")
    public final void method2059(class396 arg0, class524 arg1, int arg2, int arg3) {
        field8203++;
        if (this.field8218 == 0) {
            return;
        }
        class581 var5 = this.field8162.field2776;
        if (!this.field8178) {
            this.method3375((byte) 107);
        }
        class581 var6 = (class581) arg0;
        class635.field8611 = var5.field7802 * var6.field7807 + var5.field7807 * var6.field7819 + var5.field7788 * var6.field7779;
        class436.field5483 = var5.field7802 * var6.field7826 + var5.field7807 * var6.field7806 + var5.field7788 * var6.field7785 + var5.field7826;
        float var7 = (float) this.field8257 * class635.field8611 + class436.field5483;
        float var8 = (float) this.field8260 * class635.field8611 + class436.field5483;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = var8 - (float) this.field8230;
            var10 = (float) this.field8230 + var7;
        } else {
            var9 = (float) (-this.field8230) + var7;
            var10 = (float) this.field8230 + var8;
        }
        if ((this.field8162.field2821 <= var9) || ((float) this.field8162.field2806 >= var10)) {
            return;
        }
        class5.field37 = var5.field7798 * var6.field7807 + var5.field7781 * var6.field7779 + var5.field7779 * var6.field7819;
        class98.field1260 = var5.field7798 * var6.field7826 + var5.field7781 * var6.field7785 + var5.field7779 * var6.field7806 + var5.field7785;
        float var11 = (float) this.field8257 * class5.field37 + class98.field1260;
        float var12 = (float) this.field8260 * class5.field37 + class98.field1260;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = ((float) this.field8230 + var11) * (float) this.field8162.field2858;
            var14 = (var12 - (float) this.field8230) * (float) this.field8162.field2858;
        } else {
            var14 = ((float) (-this.field8230) + var11) * (float) this.field8162.field2858;
            var13 = ((float) this.field8230 + var12) * (float) this.field8162.field2858;
        }
        if ((this.field8162.field2807 <= var14 / (float) arg2) || (var13 / (float) arg2 <= this.field8162.field2791)) {
            return;
        }
        class349.field4482 = var5.field7822 * var6.field7807 + var5.field7819 * var6.field7819 + var5.field7812 * var6.field7779;
        class479.field5961 = var5.field7822 * var6.field7826 + var5.field7819 * var6.field7806 + var5.field7812 * var6.field7785 + var5.field7806;
        float var15 = (float) this.field8257 * class349.field4482 + class479.field5961;
        float var16 = (float) this.field8260 * class349.field4482 + class479.field5961;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) (-this.field8230) + var16) * (float) this.field8162.field2867;
            var18 = ((float) this.field8230 + var15) * (float) this.field8162.field2867;
        } else {
            var18 = ((float) this.field8230 + var16) * (float) this.field8162.field2867;
            var17 = (var15 - (float) this.field8230) * (float) this.field8162.field2867;
        }
        if ((var17 / (float) arg2 >= this.field8162.field2786) || (var18 / (float) arg2 <= this.field8162.field2870)) {
            return;
        }
        if (arg1 != null || this.field8214 != null) {
            class274.field3477 = var5.field7802 * var6.field7788 + var5.field7807 * var6.field7812 + var5.field7788 * var6.field7781;
            class174.field2036 = var5.field7822 * var6.field7788 + var5.field7819 * var6.field7812 + var5.field7812 * var6.field7781;
            class152.field1813 = var5.field7802 * var6.field7802 + var5.field7807 * var6.field7822 + var5.field7788 * var6.field7798;
            class160.field1887 = var5.field7798 * var6.field7788 + var5.field7781 * var6.field7781 + var5.field7779 * var6.field7812;
            class205.field2370 = var5.field7798 * var6.field7802 + var5.field7781 * var6.field7798 + var5.field7779 * var6.field7822;
            class5.field45 = var5.field7822 * var6.field7802 + var5.field7819 * var6.field7822 + var5.field7812 * var6.field7798;
        }
        if (arg1 != null) {
            int var19 = this.field8194 + this.field8160 >> 1;
            int var20 = this.field8181 + this.field8197 >> 1;
            int var21 = (int) ((float) var20 * class205.field2370 + (float) this.field8257 * class5.field37 + (float) var19 * class160.field1887 + class98.field1260);
            int var22 = (int) ((float) var20 * class5.field45 + (float) this.field8257 * class349.field4482 + (float) var19 * class174.field2036 + class479.field5961);
            int var23 = (int) ((float) var20 * class152.field1813 + (float) this.field8257 * class635.field8611 + (float) var19 * class274.field3477 + class436.field5483);
            int var24 = (int) ((float) var20 * class205.field2370 + (float) this.field8260 * class5.field37 + (float) var19 * class160.field1887 + class98.field1260);
            int var25 = (int) ((float) var20 * class5.field45 + (float) this.field8260 * class349.field4482 + (float) var19 * class174.field2036 + class479.field5961);
            arg1.field6628 = this.field8162.field2867 * var25 / arg2 + this.field8162.field2848;
            arg1.field6624 = this.field8162.field2881 + (this.field8162.field2858 * var21 / arg2);
            arg1.field6626 = this.field8162.field2858 * var24 / arg2 + this.field8162.field2881;
            arg1.field6627 = this.field8162.field2867 * var22 / arg2 + this.field8162.field2848;
            int var26 = (int) ((float) var20 * class152.field1813 + (float) this.field8260 * class635.field8611 + (float) var19 * class274.field3477 + class436.field5483);
            if (var23 < this.field8162.field2806 && this.field8162.field2806 > var26) {
                arg1.field6623 = (var21 + this.field8230) * this.field8162.field2858 / arg2 + this.field8162.field2881 - arg1.field6624;
                arg1.field6625 = true;
            }
        }
        this.field8162.method1279(-88, (float) arg2);
        this.field8162.method1316(52);
        this.field8162.method1333(115, var6);
        this.method3367(0);
        this.method3368(159);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    private final void method3359(byte arg0) {
        field8267++;
        if (!this.field8221) {
            return;
        }
        this.field8221 = false;
        if (this.field8253 == null && this.field8173 == null && this.field8214 == null) {
            if (this.field8190 != null && !class15.method86(88, this.field8195, this.field8167)) {
                if (this.field8164 == null || this.field8164.method2712(2)) {
                    if (!this.field8178) {
                        this.method3375((byte) 105);
                    }
                    this.field8190 = null;
                } else {
                    this.field8221 = true;
                }
            }
            if (this.field8172 != null && !class582.method3232(this.field8167, this.field8195, (byte) 70)) {
                if (this.field8164 == null || this.field8164.method2712(2)) {
                    if (!this.field8178) {
                        this.method3375((byte) 89);
                    }
                    this.field8172 = null;
                } else {
                    this.field8221 = true;
                }
            }
            if (this.field8229 != null && !class72.method562(this.field8167, -29056, this.field8195)) {
                if (this.field8164 == null || this.field8164.method2712(2)) {
                    if (!this.field8178) {
                        this.method3375((byte) 103);
                    }
                    this.field8229 = null;
                } else {
                    this.field8221 = true;
                }
            }
        }
        if (arg0 >= -81) {
            return;
        }
        if (this.field8185 != null && this.field8190 == null && this.field8172 == null && this.field8229 == null) {
            this.field8185 = null;
            this.field8246 = null;
        }
        if (this.field8225 != null && !class638.method3583(true, this.field8195, this.field8167)) {
            label198: {
                label197: {
                    boolean var10000;
                    if ((this.field8195 & 0x37) == 0) {
                        if (this.field8177 == null || this.field8177.method2712(2)) {
                            break label197;
                        }
                        var10000 = false;
                    } else {
                        if (this.field8205 == null || this.field8205.method2712(2)) {
                            break label197;
                        }
                        var10000 = false;
                    }
                    if (!var10000) {
                        this.field8221 = true;
                        break label198;
                    }
                }
                this.field8225 = null;
                this.field8273 = this.field8270 = this.field8193 = null;
            }
        }
        if (this.field8224 != null && !class193.method1139(this.field8167, this.field8195, -2)) {
            if (this.field8177 == null || this.field8177.method2712(2)) {
                this.field8224 = null;
            } else {
                this.field8221 = true;
            }
        }
        if (this.field8196 != null && !class8.method29(this.field8195, 101, this.field8167)) {
            if (this.field8177 == null || this.field8177.method2712(2)) {
                this.field8196 = null;
            } else {
                this.field8221 = true;
            }
        }
        if (this.field8215 != null && !class183.method1088(this.field8167, this.field8195, (byte) 99)) {
            if (this.field8226 == null || this.field8226.method2712(2)) {
                this.field8215 = this.field8245 = null;
            } else {
                this.field8221 = true;
            }
        }
        if (this.field8168 != null && !class301.method1795(this.field8167, this.field8195, (byte) 124)) {
            if (this.field8177 == null || this.field8177.method2712(2)) {
                this.field8168 = null;
            } else {
                this.field8221 = true;
            }
        }
        if (this.field8199 != null && !class644.method3602(393216, this.field8167, this.field8195)) {
            if ((this.field8206 == null || this.field8206.method2963((byte) 52)) && (this.field8177 == null || this.field8177.method2712(2))) {
                this.field8199 = this.field8254 = this.field8259 = null;
            } else {
                this.field8221 = true;
            }
        }
        if (this.field8258 != null) {
            if (this.field8164 == null || this.field8164.method2712(2)) {
                this.field8258 = null;
            } else {
                this.field8221 = true;
            }
        }
        if (this.field8223 != null) {
            if (this.field8177 == null || this.field8177.method2712(2)) {
                this.field8223 = null;
            } else {
                this.field8221 = true;
            }
        }
        if (this.field8222 != null && !class532.method2875(this.field8195, 111, this.field8167)) {
            this.field8241 = null;
            this.field8222 = null;
        }
        if (this.field8261 != null && !class232.method1400(this.field8195, this.field8167, -16711936)) {
            this.field8165 = null;
            this.field8261 = null;
        }
        if (this.field8201 != null && !class557.method2965(this.field8195, 0, this.field8167)) {
            this.field8201 = null;
        }
        if (this.field8204 != null && (this.field8167 & 0x800) == 0 && (this.field8167 & 0x40000) == 0) {
            this.field8200 = null;
            this.field8238 = null;
            this.field8204 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "OA", descriptor = "(IILd;Ld;III)V")
    public final void method2086(int arg0, int arg1, class140 arg2, class140 arg3, int arg4, int arg5, int arg6) {
        if (!this.field8178) {
            this.method3375((byte) 93);
        }
        field8232++;
        int var8 = this.field8194 + arg4;
        int var9 = arg4 + this.field8160;
        int var10 = this.field8181 + arg6;
        int var11 = arg6 + this.field8197;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field1686 + var9 >> arg2.field1683 >= arg2.field1685 || var10 < 0 || arg2.field1684 <= (arg2.field1686 + var11 >> arg2.field1683)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field1685 <= (var9 + arg3.field1686 >> arg3.field1683) || var10 < 0 || arg3.field1684 <= (arg3.field1686 + var11 >> arg3.field1683)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field1683;
            int var13 = var9 + arg2.field1686 - 1 >> arg2.field1683;
            int var14 = var10 >> arg2.field1683;
            int var15 = -(-arg2.field1686 - var11) - 1 >> arg2.field1683;
            if (arg2.method201(var12, var14) == arg5 && arg2.method201(var13, var14) == arg5 && arg2.method201(var12, var15) == arg5 && arg5 == arg2.method201(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field8171; var16++) {
                this.field8172[var16] = this.field8172[var16] + arg2.method194(this.field8190[var16] + arg4, this.field8229[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            int var17 = this.field8257;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field8171; var18++) {
                int var19 = (this.field8172[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field8172[var18] -= -((arg2.method194(this.field8190[var18] + arg4, this.field8229[var18] + arg6) - arg5) * (arg1 - var19) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var29 = (arg1 & 0xFF) * 4;
            int var30 = (arg1 >> 8 & 0xFF) * 4;
            int var31 = arg1 >> 16 & 0xFF << 6;
            int var32 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var29 >> 1) < 0 || arg2.field1685 << arg2.field1683 <= (var29 >> 1) + arg4 + arg2.field1686 || (arg6 - (var30 >> 1)) < 0 || (arg2.field1684 << arg2.field1683) <= ((var30 >> 1) + arg2.field1686 + arg6)) {
                return;
            }
            this.method2082(var31, (byte) -111, var30, var29, arg5, arg2, var32, arg6, arg4);
        } else if (arg0 == 4) {
            int var20 = this.field8260 - this.field8257;
            for (int var21 = 0; var21 < this.field8171; var21++) {
                this.field8172[var21] = this.field8172[var21] + var20 - (arg5 + -arg3.method194(this.field8190[var21] - -arg4, this.field8229[var21] + arg6));
            }
        } else if (arg0 == 5) {
            int var22 = this.field8260 - this.field8257;
            for (int var23 = 0; var23 < this.field8171; var23++) {
                int var24 = this.field8190[var23] + arg4;
                int var25 = this.field8229[var23] + arg6;
                int var26 = arg2.method194(var24, var25);
                int var27 = arg3.method194(var24, var25);
                int var28 = var26 - var27;
                this.field8172[var23] = ((this.field8172[var23] << 8) / var22 * var28 >> 8) + var26 - arg5;
            }
        }
        this.method3363((byte) -5);
        this.field8178 = false;
    }

    @OriginalMember(owner = "client!og", name = "ka", descriptor = "(SS)V")
    public final void method2079(short arg0, short arg1) {
        field8242++;
        class498 var3 = this.field8162.field8781;
        for (int var4 = 0; var4 < this.field8174; var4++) {
            if (this.field8168[var4] == arg0) {
                this.field8168[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class152 var7 = var3.method2718(arg0 & 0xFFFF, (byte) 72);
            var6 = var7.field1816;
            var5 = var7.field1820;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class152 var10 = var3.method2718(arg1 & 0xFFFF, (byte) 72);
            var8 = var10.field1820;
            var9 = var10.field1816;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field8214 != null) {
            for (int var11 = 0; var11 < this.field8213; var11++) {
                class384 var12 = this.field8214[var11];
                class67 var13 = this.field8220[var11];
                var13.field810 = var13.field810 & 0xFF000000 | class76.field999[this.field8224[var12.field4937] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method3366(-125);
    }

    @OriginalMember(owner = "client!og", name = "DA", descriptor = "()I")
    public final int method2084() {
        if (!this.field8178) {
            this.method3375((byte) 90);
        }
        field8271++;
        return this.field8257;
    }

    @OriginalMember(owner = "client!og", name = "ha", descriptor = "()I")
    public final int method2061() {
        if (!this.field8178) {
            this.method3375((byte) 109);
        }
        field8256++;
        return this.field8194;
    }

    @OriginalMember(owner = "client!og", name = "D", descriptor = "(I)V")
    public final void method2072(int arg0) {
        this.field8212 = (short) arg0;
        field8202++;
        this.method3366(60);
    }

    @OriginalMember(owner = "client!og", name = "ia", descriptor = "(I)V")
    public final void method2069(int arg0) {
        field8236++;
        if (this.field8164 != null) {
            this.field8164.field6224 = class20.method124(arg0, 23008, this.field8195);
        }
        if (this.field8226 != null) {
            this.field8226.field6224 = class39.method253((byte) 11, this.field8195, arg0);
        }
        if (this.field8177 != null) {
            this.field8177.field6224 = class587.method3261(this.field8195, arg0, -1);
        }
        if (this.field8205 != null) {
            this.field8205.field6224 = class453.method2492(this.field8195, arg0, (byte) -82);
        }
        this.field8167 = arg0;
        if (this.field8243 != null && (this.field8167 & 0x10000) == 0) {
            this.field8225 = this.field8243.field3939;
            this.field8193 = this.field8243.field3943;
            this.field8273 = this.field8243.field3937;
            this.field8270 = this.field8243.field3940;
            this.field8243 = null;
        }
        this.field8221 = true;
        this.method3359((byte) -119);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lkea;Lnj;IIII)V")
    public class606(class223 arg0, class229 arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        class498 var7 = arg0.field8781;
        int[] var8 = new int[arg1.field2972];
        this.field8246 = new int[arg1.field2965 + 1];
        for (int var9 = 0; var9 < arg1.field2972; var9++) {
            if ((arg1.field2988 == null || arg1.field2988[var9] != 2) && (arg1.field2986 == null || arg1.field2986[var9] == -1 || !var7.method2718(arg1.field2986[var9] & 0xFFFF, (byte) 72).field1817)) {
                var8[this.field8174++] = var9;
                this.field8246[arg1.field2953[var9]]++;
                this.field8246[arg1.field2995[var9]]++;
                this.field8246[arg1.field3004[var9]]++;
            }
        }
        this.field8187 = this.field8174;
        long[] var10 = new long[this.field8174];
        boolean var11 = (this.field8167 & 0x100) != 0;
        label502: for (int var12 = 0; var12 < this.field8174; var12++) {
            int var185 = var8[var12];
            class152 var186 = null;
            int var187 = 0;
            byte var188 = 0;
            byte var189 = 0;
            byte var190 = 0;
            if (arg1.field2990 != null) {
                for (int var191 = 0; var191 < arg1.field2990.length; var191++) {
                    class417 var192 = arg1.field2990[var191];
                    if (var192.field5333 == var185) {
                        class692 var193 = class234.method1413(true, var192.field5339);
                        if (var193.field9595) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field8187--;
                            continue label502;
                        }
                    }
                }
            }
            short var194 = -1;
            if (arg1.field2986 != null) {
                var194 = arg1.field2986[var185];
                if (var194 != -1) {
                    var186 = var7.method2718(var194 & 0xFFFF, (byte) 72);
                    var189 = var186.field1809;
                    var190 = var186.field1815;
                }
            }
            boolean var195 = arg1.field3005 != null && arg1.field3005[var185] != 0 || var186 != null && !var186.field1811;
            if ((var11 || var195) && arg1.field2959 != null) {
                var187 += arg1.field2959[var185] << 17;
            }
            if (var195) {
                var187 += 65536;
            }
            int var196 = ((var189 & 0xFF) << 8) + var187;
            int var197 = (var190 & 0xFF) + var196;
            int var198 = (var194 & 0xFFFF << 16) + var188;
            int var199 = (var12 & 0xFFFF) + var198;
            var10[var12] = ((long) var197 << 32) + (long) var199;
        }
        class608.method3380(var8, -1, var10);
        this.field8171 = arg1.field2965;
        this.field8190 = arg1.field2981;
        this.field8229 = arg1.field2982;
        this.field8165 = arg1.field2973;
        this.field8172 = arg1.field2991;
        this.field8198 = arg1.field2993;
        class168[] var13 = new class168[this.field8171];
        this.field8173 = arg1.field2997;
        this.field8253 = arg1.field2956;
        if (arg1.field2990 != null) {
            this.field8213 = arg1.field2990.length;
            this.field8214 = new class384[this.field8213];
            this.field8220 = new class67[this.field8213];
            for (int var14 = 0; var14 < this.field8213; var14++) {
                class417 var15 = arg1.field2990[var14];
                class692 var16 = class234.method1413(true, var15.field5339);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field8174; var18++) {
                    if (var8[var18] == var15.field5333) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class76.field999[arg1.field2985[var15.field5333] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field3005 == null ? 0 : arg1.field3005[var15.field5333]) << 24;
                this.field8214[var14] = new class384(var17, arg1.field2953[var15.field5333], arg1.field2995[var15.field5333], arg1.field3004[var15.field5333], var16.field9598, var16.field9590, var16.field9594, var16.field9597, var16.field9593, var16.field9595, var16.field9599, var15.field5331);
                this.field8220[var14] = new class67(var20);
            }
        }
        int var21 = this.field8174 * 3;
        this.field8254 = new short[this.field8174];
        this.field8273 = new short[var21];
        this.field8225 = new byte[var21];
        this.field8196 = new byte[this.field8174];
        this.field8199 = new short[this.field8174];
        this.field8185 = new short[var21];
        this.field8258 = new short[var21];
        this.field8237 = (short) arg4;
        this.field8270 = new short[var21];
        this.field8168 = new short[this.field8174];
        this.field8212 = (short) arg3;
        this.field8224 = new short[this.field8174];
        class109.field1365 = new long[var21];
        this.field8259 = new short[this.field8174];
        this.field8245 = new float[var21];
        this.field8223 = new short[var21];
        this.field8193 = new short[var21];
        this.field8215 = new float[var21];
        if (arg1.field2992 != null) {
            this.field8241 = new short[this.field8174];
        }
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field2965; var23++) {
            int var184 = this.field8246[var23];
            this.field8246[var23] = var22;
            var22 += var184;
            var13[var23] = new class168();
        }
        this.field8246[arg1.field2965] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field2979 != null) {
            int var28 = arg1.field2962;
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
            var26 = new int[var28];
            var25 = new int[var28];
            var24 = new int[var28];
            var27 = new float[var28][];
            for (int var36 = 0; var36 < this.field8174; var36++) {
                int var43 = var8[var36];
                if (arg1.field2979[var43] != -1) {
                    int var44 = arg1.field2979[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field2953[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field2995[var43];
                        } else {
                            var46 = arg1.field3004[var43];
                        }
                        int var47 = arg1.field2981[var46];
                        int var48 = arg1.field2991[var46];
                        int var49 = arg1.field2982[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field2969[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field2955[var37];
                        if (var42 == 0) {
                            var40 = 1.0F;
                            var39 = 1.0F;
                        } else if (var42 <= 0) {
                            var39 = 1.0F;
                            var40 = (float) (-var42) / 1024.0F;
                        } else {
                            var40 = 1.0F;
                            var39 = (float) var42 / 1024.0F;
                        }
                        var41 = 64.0F / (float) arg1.field2996[var37];
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field3002[var37];
                        var40 = 64.0F / (float) arg1.field2955[var37];
                        var41 = 64.0F / (float) arg1.field2996[var37];
                    } else {
                        var41 = (float) arg1.field2996[var37] / 1024.0F;
                        var39 = (float) arg1.field3002[var37] / 1024.0F;
                        var40 = (float) arg1.field2955[var37] / 1024.0F;
                    }
                    var27[var37] = class593.method3280(arg1.field3001[var37], var39, var40, arg1.field2987[var37], class109.method762(arg1.field2976[var37], 255), var41, (byte) -116, arg1.field2954[var37]);
                }
            }
        }
        class8[] var50 = new class8[arg1.field2972];
        for (int var51 = 0; var51 < arg1.field2972; var51++) {
            short var163 = arg1.field2953[var51];
            short var164 = arg1.field2995[var51];
            short var165 = arg1.field3004[var51];
            int var166 = this.field8190[var164] - this.field8190[var163];
            int var167 = this.field8172[var164] - this.field8172[var163];
            int var168 = this.field8229[var164] - this.field8229[var163];
            int var169 = this.field8190[var165] - this.field8190[var163];
            int var170 = this.field8172[var165] - this.field8172[var163];
            int var171 = this.field8229[var165] - this.field8229[var163];
            int var172 = var167 * var171 - var168 * var170;
            int var173 = var168 * var169 - (var166 * var171);
            int var174 = var166 * var170 - var167 * var169;
            while (var172 > 8192 || var173 > 8192 || var174 > 8192 || var172 < -8192 || var173 < -8192 || var174 < -8192) {
                var174 >>= 0x1;
                var173 >>= 0x1;
                var172 >>= 0x1;
            }
            int var175 = (int) Math.sqrt((double) (var174 * var174 + var172 * var172 + var173 * var173));
            if (var175 <= 0) {
                var175 = 1;
            }
            int var176 = var174 * 256 / var175;
            int var177 = var172 * 256 / var175;
            int var178 = var173 * 256 / var175;
            byte var179 = arg1.field2988 == null ? 0 : arg1.field2988[var51];
            if (var179 == 0) {
                class168 var180 = var13[var163];
                var180.field1969++;
                var180.field1970 += var177;
                var180.field1968 += var176;
                var180.field1972 += var178;
                class168 var181 = var13[var164];
                var181.field1969++;
                var181.field1968 += var176;
                var181.field1970 += var177;
                var181.field1972 += var178;
                class168 var182 = var13[var165];
                var182.field1972 += var178;
                var182.field1969++;
                var182.field1968 += var176;
                var182.field1970 += var177;
            } else if (var179 == 1) {
                class8 var183 = var50[var51] = new class8();
                var183.field79 = var178;
                var183.field78 = var177;
                var183.field84 = var176;
            }
        }
        for (int var52 = 0; var52 < this.field8174; var52++) {
            int var73 = var8[var52];
            int var74 = arg1.field2985[var73] & 0xFFFF;
            short var75;
            if (arg1.field2986 == null) {
                var75 = -1;
            } else {
                var75 = arg1.field2986[var73];
            }
            int var76;
            if (arg1.field2979 == null) {
                var76 = -1;
            } else {
                var76 = arg1.field2979[var73];
            }
            int var77;
            if (arg1.field3005 == null) {
                var77 = 0;
            } else {
                var77 = arg1.field3005[var73] & 0xFF;
            }
            float var78 = 0.0F;
            float var79 = 0.0F;
            float var80 = 0.0F;
            float var81 = 0.0F;
            float var82 = 0.0F;
            float var83 = 0.0F;
            byte var84 = 0;
            byte var85 = 0;
            int var86 = 0;
            if (var75 != -1) {
                if (var76 == -1) {
                    var78 = 0.0F;
                    var82 = 0.0F;
                    var79 = 1.0F;
                    var84 = 1;
                    var80 = 1.0F;
                    var83 = 0.0F;
                    var85 = 2;
                    var81 = 1.0F;
                } else {
                    var76 &= 0xFF;
                    byte var87 = arg1.field2969[var76];
                    if (var87 == 0) {
                        short var116 = arg1.field2953[var73];
                        short var117 = arg1.field2995[var73];
                        short var118 = arg1.field3004[var73];
                        short var119 = arg1.field3001[var76];
                        short var120 = arg1.field2987[var76];
                        short var121 = arg1.field2954[var76];
                        float var122 = (float) arg1.field2981[var119];
                        float var123 = (float) arg1.field2991[var119];
                        float var124 = (float) arg1.field2982[var119];
                        float var125 = (float) arg1.field2981[var120] - var122;
                        float var126 = (float) arg1.field2991[var120] - var123;
                        float var127 = (float) arg1.field2982[var120] - var124;
                        float var128 = (float) arg1.field2981[var121] - var122;
                        float var129 = (float) arg1.field2991[var121] - var123;
                        float var130 = (float) arg1.field2982[var121] - var124;
                        float var131 = (float) arg1.field2981[var116] - var122;
                        float var132 = (float) arg1.field2991[var116] - var123;
                        float var133 = (float) arg1.field2982[var116] - var124;
                        float var134 = (float) arg1.field2981[var117] - var122;
                        float var135 = (float) arg1.field2991[var117] - var123;
                        float var136 = (float) arg1.field2982[var117] - var124;
                        float var137 = (float) arg1.field2981[var118] - var122;
                        float var138 = (float) arg1.field2991[var118] - var123;
                        float var139 = (float) arg1.field2982[var118] - var124;
                        float var140 = var126 * var130 - (var127 * var129);
                        float var141 = var127 * var128 - var125 * var130;
                        float var142 = var125 * var129 - var126 * var128;
                        float var143 = var129 * var142 - (var130 * var141);
                        float var144 = var130 * var140 - var128 * var142;
                        float var145 = var128 * var141 - (var129 * var140);
                        float var146 = 1.0F / (var127 * var145 + var125 * var143 + var126 * var144);
                        var80 = (var136 * var145 + var134 * var143 + var135 * var144) * var146;
                        var78 = (var133 * var145 + var131 * var143 + var132 * var144) * var146;
                        var82 = (var139 * var145 + var137 * var143 + var138 * var144) * var146;
                        float var147 = var127 * var140 - (var125 * var142);
                        float var148 = var125 * var141 - (var126 * var140);
                        float var149 = var126 * var142 - var127 * var141;
                        float var150 = 1.0F / (var130 * var148 + var128 * var149 + var129 * var147);
                        var81 = (var136 * var148 + var134 * var149 + var135 * var147) * var150;
                        var79 = (var133 * var148 + var131 * var149 + var132 * var147) * var150;
                        var83 = (var139 * var148 + var137 * var149 + var138 * var147) * var150;
                    } else {
                        short var88 = arg1.field2953[var73];
                        short var89 = arg1.field2995[var73];
                        short var90 = arg1.field3004[var73];
                        int var91 = var24[var76];
                        int var92 = var25[var76];
                        int var93 = var26[var76];
                        float[] var94 = var27[var76];
                        byte var95 = arg1.field2974[var76];
                        float var96 = (float) arg1.field2968[var76] / 256.0F;
                        if (var87 == 1) {
                            float var97 = (float) arg1.field3002[var76] / 1024.0F;
                            class168.method1021(arg1.field2991[var88], 0, arg1.field2981[var88], var92, var94, var93, arg1.field2982[var88], var95, var97, var91, var96);
                            var78 = class351.field4527;
                            var79 = class453.field5672;
                            class168.method1021(arg1.field2991[var89], 0, arg1.field2981[var89], var92, var94, var93, arg1.field2982[var89], var95, var97, var91, var96);
                            var80 = class351.field4527;
                            var81 = class453.field5672;
                            class168.method1021(arg1.field2991[var90], 0, arg1.field2981[var90], var92, var94, var93, arg1.field2982[var90], var95, var97, var91, var96);
                            var82 = class351.field4527;
                            var83 = class453.field5672;
                            float var98 = var97 / 2.0F;
                            if ((var95 & 0x1) == 0) {
                                if (var80 - var78 > var98) {
                                    var84 = 1;
                                    var80 -= var97;
                                } else if (var78 - var80 > var98) {
                                    var84 = 2;
                                    var80 += var97;
                                }
                                if ((var82 - var78 > var98)) {
                                    var82 -= var97;
                                    var85 = 1;
                                } else if (var78 - var82 > var98) {
                                    var85 = 2;
                                    var82 += var97;
                                }
                            } else {
                                if ((var83 - var79 > var98)) {
                                    var83 -= var97;
                                    var85 = 1;
                                } else if (var98 < var79 - var83) {
                                    var83 += var97;
                                    var85 = 2;
                                }
                                if ((var81 - var79 > var98)) {
                                    var81 -= var97;
                                    var84 = 1;
                                } else if (var79 - var81 > var98) {
                                    var84 = 2;
                                    var81 += var97;
                                }
                            }
                        } else if (var87 == 2) {
                            float var99 = (float) arg1.field2966[var76] / 256.0F;
                            float var100 = (float) arg1.field2975[var76] / 256.0F;
                            int var101 = arg1.field2981[var89] - arg1.field2981[var88];
                            int var102 = arg1.field2991[var89] - arg1.field2991[var88];
                            int var103 = arg1.field2982[var89] - arg1.field2982[var88];
                            int var104 = arg1.field2981[var90] - arg1.field2981[var88];
                            int var105 = arg1.field2991[var90] - arg1.field2991[var88];
                            int var106 = arg1.field2982[var90] - arg1.field2982[var88];
                            int var107 = var102 * var106 - var103 * var105;
                            int var108 = var103 * var104 - (var101 * var106);
                            int var109 = var101 * var105 - (var102 * var104);
                            float var110 = 64.0F / (float) arg1.field2955[var76];
                            float var111 = 64.0F / (float) arg1.field2996[var76];
                            float var112 = 64.0F / (float) arg1.field3002[var76];
                            float var113 = (var94[2] * (float) var109 + var94[1] * (float) var108 + var94[0] * (float) var107) / var110;
                            float var114 = (var94[5] * (float) var109 + var94[3] * (float) var107 + var94[4] * (float) var108) / var111;
                            float var115 = (var94[8] * (float) var109 + var94[6] * (float) var107 + var94[7] * (float) var108) / var112;
                            var86 = class441.method2419(var115, var113, var114, (byte) -88);
                            class473.method2568(var100, var96, arg1.field2991[var88], var91, var95, var93, arg1.field2982[var88], var86, arg1.field2981[var88], false, var92, var99, var94);
                            var78 = class213.field2497;
                            var79 = class432.field5454;
                            class473.method2568(var100, var96, arg1.field2991[var89], var91, var95, var93, arg1.field2982[var89], var86, arg1.field2981[var89], false, var92, var99, var94);
                            var81 = class432.field5454;
                            var80 = class213.field2497;
                            class473.method2568(var100, var96, arg1.field2991[var90], var91, var95, var93, arg1.field2982[var90], var86, arg1.field2981[var90], false, var92, var99, var94);
                            var82 = class213.field2497;
                            var83 = class432.field5454;
                        } else if (var87 == 3) {
                            class275.method1637(var93, arg1.field2981[var88], var92, var96, arg1.field2982[var88], -115, arg1.field2991[var88], var95, var91, var94);
                            var79 = class437.field5495;
                            var78 = class20.field209;
                            class275.method1637(var93, arg1.field2981[var89], var92, var96, arg1.field2982[var89], -87, arg1.field2991[var89], var95, var91, var94);
                            var81 = class437.field5495;
                            var80 = class20.field209;
                            class275.method1637(var93, arg1.field2981[var90], var92, var96, arg1.field2982[var90], -63, arg1.field2991[var90], var95, var91, var94);
                            var82 = class20.field209;
                            var83 = class437.field5495;
                            if ((var95 & 0x1) == 0) {
                                if ((var82 - var78 > 0.5F)) {
                                    var85 = 1;
                                    var82--;
                                } else if (var78 - var82 > 0.5F) {
                                    var82++;
                                    var85 = 2;
                                }
                                if ((var80 - var78 > 0.5F)) {
                                    var84 = 1;
                                    var80--;
                                } else if (var78 - var80 > 0.5F) {
                                    var84 = 2;
                                    var80++;
                                }
                            } else {
                                if ((var81 - var79 > 0.5F)) {
                                    var81--;
                                    var84 = 1;
                                } else if (var79 - var81 > 0.5F) {
                                    var81++;
                                    var84 = 2;
                                }
                                if (var83 - var79 > 0.5F) {
                                    var83--;
                                    var85 = 1;
                                } else if (var79 - var83 > 0.5F) {
                                    var85 = 2;
                                    var83++;
                                }
                            }
                        }
                    }
                }
            }
            byte var151;
            if (arg1.field2988 == null) {
                var151 = 0;
            } else {
                var151 = arg1.field2988[var73];
            }
            if (var151 == 0) {
                long var152 = ((long) (var86 << 24) + (long) var77 + (long) (var74 << 8) << 32) + (long) (var76 << 2);
                short var154 = arg1.field2953[var73];
                short var155 = arg1.field2995[var73];
                short var156 = arg1.field3004[var73];
                class168 var157 = var13[var154];
                this.field8199[var52] = this.method3371(var157.field1969, var79, var154, arg1, var152, 2, var157.field1972, var157.field1970, var157.field1968, var52, var78);
                class168 var158 = var13[var155];
                this.field8254[var52] = this.method3371(var158.field1969, var81, var155, arg1, (long) var84 + var152, 2, var158.field1972, var158.field1970, var158.field1968, var52, var80);
                class168 var159 = var13[var156];
                this.field8259[var52] = this.method3371(var159.field1969, var83, var156, arg1, (long) var85 + var152, 2, var159.field1972, var159.field1970, var159.field1968, var52, var82);
            } else if (var151 == 1) {
                class8 var160 = var50[var73];
                long var161 = (long) ((var160.field79 + 256 << 12) + (var76 << 2) + (var160.field78 <= 0 ? 2048 : 1024) + (var160.field84 - -256 << 22)) + ((long) (var86 << 24) - (-((long) (var74 << 8)) - (long) var77) << 32);
                this.field8199[var52] = this.method3371(0, var79, arg1.field2953[var73], arg1, var161, 2, var160.field79, var160.field78, var160.field84, var52, var78);
                this.field8254[var52] = this.method3371(0, var81, arg1.field2995[var73], arg1, (long) var84 + var161, 2, var160.field79, var160.field78, var160.field84, var52, var80);
                this.field8259[var52] = this.method3371(0, var83, arg1.field3004[var73], arg1, (long) var85 + var161, 2, var160.field79, var160.field78, var160.field84, var52, var82);
            }
            if (arg1.field2986 == null) {
                this.field8168[var52] = -1;
            } else {
                this.field8168[var52] = arg1.field2986[var73];
            }
            if (arg1.field3005 != null) {
                this.field8196[var52] = arg1.field3005[var73];
            }
            if (arg1.field2992 != null) {
                this.field8241[var52] = arg1.field2992[var73];
            }
            this.field8224[var52] = arg1.field2985[var73];
        }
        if (this.field8187 > 0) {
            int var53 = 1;
            short var54 = this.field8168[0];
            for (int var55 = 0; var55 < this.field8187; var55++) {
                short var65 = this.field8168[var55];
                if (var54 != var65) {
                    var53++;
                    var54 = var65;
                }
            }
            this.field8200 = new int[var53];
            this.field8204 = new int[var53 + 1];
            this.field8238 = new int[var53];
            this.field8204[0] = 0;
            int var56 = this.field8218;
            int var57 = 0;
            short var58 = 0;
            short var59 = this.field8168[0];
            for (int var60 = 0; var60 < this.field8187; var60++) {
                short var61 = this.field8168[var60];
                if (var59 != var61) {
                    this.field8238[var57] = var56;
                    this.field8200[var57] = var58 + 1 - var56;
                    var57++;
                    this.field8204[var57] = var60;
                    var58 = 0;
                    var59 = var61;
                    var56 = this.field8218;
                }
                short var62 = this.field8199[var60];
                if (var62 < var56) {
                    var56 = var62;
                }
                if (var58 < var62) {
                    var58 = var62;
                }
                short var63 = this.field8254[var60];
                if (var63 > var58) {
                    var58 = var63;
                }
                if (var56 > var63) {
                    var56 = var63;
                }
                short var64 = this.field8259[var60];
                if (var58 < var64) {
                    var58 = var64;
                }
                if (var64 < var56) {
                    var56 = var64;
                }
            }
            this.field8238[var57] = var56;
            this.field8200[var57] = var58 + 1 - var56;
            var57++;
            this.field8204[var57] = this.field8187;
        }
        class109.field1365 = null;
        this.field8258 = class643.method3600(0, this.field8218, this.field8258);
        this.field8223 = class643.method3600(0, this.field8218, this.field8223);
        this.field8273 = class643.method3600(0, this.field8218, this.field8273);
        this.field8270 = class643.method3600(0, this.field8218, this.field8270);
        this.field8193 = class643.method3600(0, this.field8218, this.field8193);
        this.field8225 = class693.method3825(this.field8218, (byte) 115, this.field8225);
        this.field8215 = class256.method1533(this.field8215, this.field8218, (byte) 111);
        this.field8245 = class256.method1533(this.field8245, this.field8218, (byte) 119);
        if (arg1.field2971 != null && class232.method1400(this.field8195, arg2, -16711936)) {
            this.field8261 = arg1.method1385((byte) -128, false);
        }
        if (arg1.field2990 != null && class557.method2965(this.field8195, 0, arg2)) {
            this.field8201 = arg1.method1389((byte) -107);
        }
        if (arg1.field2994 != null && class532.method2875(this.field8195, 98, arg2)) {
            int var66 = 0;
            int[] var67 = new int[256];
            for (int var68 = 0; var68 < this.field8174; var68++) {
                int var72 = arg1.field2994[var8[var68]];
                if (var72 >= 0) {
                    int var10002 = var67[var72]++;
                    if (var72 > var66) {
                        var66 = var72;
                    }
                }
            }
            this.field8222 = new int[var66 + 1][];
            for (int var69 = 0; var69 <= var66; var69++) {
                this.field8222[var69] = new int[var67[var69]];
                var67[var69] = 0;
            }
            for (int var70 = 0; var70 < this.field8174; var70++) {
                int var71 = arg1.field2994[var8[var70]];
                if (var71 >= 0) {
                    this.field8222[var71][var67[var71]++] = var70;
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "EA", descriptor = "()I")
    public final int method2085() {
        field8272++;
        if (!this.field8178) {
            this.method3375((byte) 118);
        }
        return this.field8260;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIB)V")
    public static final void method3360(int arg0, int arg1, int arg2, byte arg3) {
        field8263++;
        if (arg3 != 8) {
            method3360(-45, -60, -22, (byte) -12);
        }
        class243 var4 = class546.method2926(arg0, 9, true);
        var4.method1457(124);
        var4.field3135 = arg2;
        var4.field3132 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILpca;)V")
    private final void method3361(int arg0, class670 arg1) {
        field8209++;
        if (class566.field7096.length < this.field8218) {
            class403.field5210 = new int[this.field8218];
            class566.field7096 = new int[this.field8218];
        }
        for (int var3 = 0; var3 < this.field8171; var3++) {
            int var14 = (this.field8190[var3] - (this.field8172[var3] * this.field8162.field2828 >> 8) >> this.field8162.field2833) - arg1.field9108;
            int var15 = (this.field8229[var3] - (this.field8172[var3] * this.field8162.field2784 >> 8) >> this.field8162.field2833) - arg1.field9101;
            int var16 = this.field8246[var3];
            int var17 = this.field8246[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field8185[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class566.field7096[var19] = var14;
                class403.field5210[var19] = var15;
            }
        }
        if (arg0 != 6407) {
            return;
        }
        for (int var4 = 0; var4 < this.field8187; var4++) {
            if (this.field8196 == null || this.field8196[var4] <= 128) {
                short var5 = this.field8199[var4];
                short var6 = this.field8254[var4];
                short var7 = this.field8259[var4];
                int var8 = class566.field7096[var5];
                int var9 = class566.field7096[var6];
                int var10 = class566.field7096[var7];
                int var11 = class403.field5210[var5];
                int var12 = class403.field5210[var6];
                int var13 = class403.field5210[var7];
                if ((var8 - var9) * (var12 - var13) - ((var10 - var9) * (var12 - var11)) > 0) {
                    arg1.method3717(var10, var12, var13, var11, var8, false, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "()V")
    public final void method2056() {
        for (int var1 = 0; var1 < this.field8198; var1++) {
            this.field8190[var1] = this.field8190[var1] + 7 >> 4;
            this.field8172[var1] = this.field8172[var1] + 7 >> 4;
            this.field8229[var1] = this.field8229[var1] + 7 >> 4;
        }
        field8240++;
        this.method3363((byte) -5);
        this.field8178 = false;
    }

    @OriginalMember(owner = "client!og", name = "va", descriptor = "(I)V")
    public final void method2048(int arg0) {
        field8268++;
        this.field8237 = (short) arg0;
        this.method3363((byte) -5);
        this.method3365(55);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)Z")
    private final boolean method3362(byte arg0) {
        if (arg0 != 51) {
            this.method2090();
        }
        field8219++;
        boolean var2 = !this.field8177.field6223;
        boolean var3 = (this.field8195 & 0x37) != 0 && !this.field8205.field6223;
        boolean var4 = !this.field8164.field6223;
        boolean var5 = !this.field8226.field6223;
        if (!var4 && !var2 && !var3 && !var5) {
            return true;
        }
        boolean var6 = true;
        if (var4) {
            if (this.field8164.field6226 == null) {
                this.field8164.field6226 = this.field8162.method341(arg0 + 53, this.field8274);
            }
            class519 var7 = this.field8164.field6226;
            var7.method2814(12, (byte) -99, this.field8218 * 12);
            Buffer var8 = var7.method62(true, true);
            if (var8 == null) {
                var6 = false;
            } else {
                this.field8162.field2632.copyPositions(this.field8190, this.field8172, this.field8229, this.field8258, 0, 12, this.field8218, var8.getAddress());
                if (var7.method61((byte) 96)) {
                    this.field8164.field6220 = var7;
                    this.field8164.field6223 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var2) {
            if (this.field8177.field6226 == null) {
                this.field8177.field6226 = this.field8162.method341(105, this.field8274);
            }
            class519 var9 = this.field8177.field6226;
            var9.method2814(4, (byte) -99, this.field8218 * 4);
            Buffer var10 = var9.method62(true, true);
            if (var10 == null) {
                var6 = false;
            } else {
                if ((this.field8195 & 0x37) == 0) {
                    byte[] var11;
                    short[] var12;
                    short[] var13;
                    short[] var14;
                    if (this.field8243 == null) {
                        var11 = this.field8225;
                        var12 = this.field8273;
                        var13 = this.field8270;
                        var14 = this.field8193;
                    } else {
                        var12 = this.field8243.field3937;
                        var13 = this.field8243.field3940;
                        var11 = this.field8243.field3939;
                        var14 = this.field8243.field3943;
                    }
                    this.field8162.field2632.copyLighting(this.field8224, this.field8196, this.field8168, var12, var13, var14, var11, this.field8212, this.field8237, this.field8223, 0, 4, this.field8218, var10.getAddress());
                } else {
                    this.field8162.field2632.copyColours(this.field8224, this.field8196, this.field8168, this.field8212, this.field8223, 0, 4, this.field8218, var10.getAddress());
                }
                if (var9.method61((byte) 96)) {
                    this.field8177.field6220 = var9;
                    this.field8177.field6223 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var3) {
            if (this.field8205.field6226 == null) {
                this.field8205.field6226 = this.field8162.method341(122, this.field8274);
            }
            class519 var15 = this.field8205.field6226;
            var15.method2814(12, (byte) -99, this.field8218 * 12);
            Buffer var16 = var15.method62(true, true);
            if (var16 == null) {
                var6 = false;
            } else {
                short[] var17;
                byte[] var18;
                short[] var19;
                short[] var20;
                if (this.field8243 == null) {
                    var19 = this.field8270;
                    var20 = this.field8193;
                    var17 = this.field8273;
                    var18 = this.field8225;
                } else {
                    var17 = this.field8243.field3937;
                    var18 = this.field8243.field3939;
                    var19 = this.field8243.field3940;
                    var20 = this.field8243.field3943;
                }
                this.field8162.field2632.copyNormals(var17, var19, var20, var18, 3.0F / (float) this.field8237, 3.0F / (float) (this.field8237 / 2 + this.field8237), 0, 12, this.field8218, var16.getAddress());
                if (var15.method61((byte) 96)) {
                    this.field8205.field6220 = var15;
                    this.field8205.field6223 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var5) {
            if (this.field8226.field6226 == null) {
                this.field8226.field6226 = this.field8162.method341(122, this.field8274);
            }
            class519 var21 = this.field8226.field6226;
            var21.method2814(8, (byte) -99, this.field8218 * 8);
            Buffer var22 = var21.method62(true, true);
            if (var22 == null) {
                var6 = false;
            } else {
                this.field8162.field2632.copyTexCoords(this.field8215, this.field8245, 0, 8, this.field8218, var22.getAddress());
                if (var21.method61((byte) 96)) {
                    this.field8226.field6223 = true;
                    this.field8226.field6220 = var21;
                } else {
                    var6 = false;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!og", name = "V", descriptor = "(I)V")
    public final void method2058(int arg0) {
        field8169++;
        int var2 = class243.field3129[arg0];
        int var3 = class243.field3128[arg0];
        for (int var4 = 0; var4 < this.field8171; var4++) {
            int var7 = this.field8229[var4] * var2 + this.field8190[var4] * var3 >> 14;
            this.field8229[var4] = this.field8229[var4] * var3 - (this.field8190[var4] * var2) >> 14;
            this.field8190[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field8218; var5++) {
            int var6 = this.field8273[var5] * var3 + this.field8193[var5] * var2 >> 14;
            this.field8193[var5] = (short) (this.field8193[var5] * var3 - (this.field8273[var5] * var2) >> 14);
            this.field8273[var5] = (short) var6;
        }
        this.method3363((byte) -5);
        this.method3365(55);
        this.field8178 = false;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method2074(int arg0, int arg1, class396 arg2, boolean arg3) {
        field8239++;
        class581 var5 = (class581) arg2;
        class581 var6 = this.field8162.field2776;
        float var7 = var5.field7826 * var6.field7798 + var5.field7806 * var6.field7779 + var5.field7785 * var6.field7781 + var6.field7785;
        float var8 = var5.field7826 * var6.field7822 + var5.field7806 * var6.field7819 + var5.field7785 * var6.field7812 + var6.field7806;
        class5.field45 = var5.field7802 * var6.field7822 + var5.field7822 * var6.field7819 + var5.field7798 * var6.field7812;
        class152.field1813 = var5.field7802 * var6.field7802 + var5.field7822 * var6.field7807 + var5.field7798 * var6.field7788;
        class635.field8611 = var5.field7807 * var6.field7802 + var5.field7819 * var6.field7807 + var5.field7779 * var6.field7788;
        class174.field2036 = var5.field7788 * var6.field7822 + var5.field7812 * var6.field7819 + var5.field7781 * var6.field7812;
        class274.field3477 = var5.field7788 * var6.field7802 + var5.field7812 * var6.field7807 + var5.field7781 * var6.field7788;
        class5.field37 = var5.field7807 * var6.field7798 + var5.field7819 * var6.field7779 + var5.field7779 * var6.field7781;
        class349.field4482 = var5.field7807 * var6.field7822 + var5.field7819 * var6.field7819 + var5.field7779 * var6.field7812;
        float var9 = var5.field7826 * var6.field7802 + var5.field7806 * var6.field7807 + var5.field7785 * var6.field7788 + var6.field7826;
        class160.field1887 = var5.field7788 * var6.field7798 + var5.field7812 * var6.field7779 + var5.field7781 * var6.field7781;
        class205.field2370 = var5.field7802 * var6.field7798 + var5.field7822 * var6.field7779 + var5.field7798 * var6.field7781;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field8162.field2858;
        int var16 = this.field8162.field2867;
        if (!this.field8178) {
            this.method3375((byte) 92);
        }
        class184.field2164[0] = this.field8194;
        class268.field3392[0] = this.field8257;
        class386.field4954[0] = this.field8181;
        class184.field2164[1] = this.field8160;
        class268.field3392[1] = this.field8257;
        class386.field4954[1] = this.field8181;
        class184.field2164[2] = this.field8194;
        class268.field3392[2] = this.field8260;
        class184.field2164[3] = this.field8160;
        class386.field4954[2] = this.field8181;
        class268.field3392[3] = this.field8260;
        class386.field4954[3] = this.field8181;
        class184.field2164[4] = this.field8194;
        class268.field3392[4] = this.field8257;
        class184.field2164[5] = this.field8160;
        class386.field4954[4] = this.field8197;
        class268.field3392[5] = this.field8257;
        class386.field4954[5] = this.field8197;
        class184.field2164[6] = this.field8194;
        class268.field3392[6] = this.field8260;
        class184.field2164[7] = this.field8160;
        class386.field4954[6] = this.field8197;
        class268.field3392[7] = this.field8260;
        class386.field4954[7] = this.field8197;
        for (int var17 = 0; var17 < 8; var17++) {
            float var36 = (float) class268.field3392[var17];
            float var37 = (float) class386.field4954[var17];
            float var38 = (float) class184.field2164[var17];
            float var39 = class5.field45 * var37 + class349.field4482 * var36 + class174.field2036 * var38 + var8;
            float var40 = class152.field1813 * var37 + class635.field8611 * var36 + class274.field3477 * var38 + var9;
            float var41 = class205.field2370 * var37 + class5.field37 * var36 + class160.field1887 * var38 + var7;
            if (var40 >= (float) this.field8162.field2806) {
                float var42 = (float) var15 * var41 / var40 + (float) this.field8162.field2881;
                if (var11 > var42) {
                    var11 = var42;
                }
                float var43 = (float) var16 * var39 / var40 + (float) this.field8162.field2848;
                if (var12 < var42) {
                    var12 = var42;
                }
                if (var14 < var43) {
                    var14 = var43;
                }
                var10 = true;
                if (var43 < var13) {
                    var13 = var43;
                }
            }
        }
        if (var10 && (float) arg0 > var11 && var12 > (float) arg0 && (float) arg1 > var13 && var14 > (float) arg1) {
            if (arg3) {
                return true;
            }
            if (this.field8218 > class566.field7096.length) {
                class403.field5210 = new int[this.field8218];
                class566.field7096 = new int[this.field8218];
            }
            for (int var18 = 0; var18 < this.field8171; var18++) {
                float var20 = (float) this.field8172[var18];
                float var21 = (float) this.field8229[var18];
                float var22 = (float) this.field8190[var18];
                float var23 = class205.field2370 * var21 + class5.field37 * var20 + class160.field1887 * var22 + var7;
                float var24 = class152.field1813 * var21 + class635.field8611 * var20 + class274.field3477 * var22 + var9;
                float var25 = class5.field45 * var21 + class349.field4482 * var20 + class174.field2036 * var22 + var8;
                if (((float) this.field8162.field2806 <= var24)) {
                    int var30 = (int) ((float) var15 * var23 / var24 + (float) this.field8162.field2881);
                    int var31 = (int) ((float) var16 * var25 / var24 + (float) this.field8162.field2848);
                    int var32 = this.field8246[var18];
                    int var33 = this.field8246[var18 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field8185[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        class566.field7096[var35] = var30;
                        class403.field5210[var35] = var31;
                    }
                } else {
                    int var26 = this.field8246[var18];
                    int var27 = this.field8246[var18 + 1];
                    for (int var28 = var26; var28 < var27; var28++) {
                        int var29 = this.field8185[var28] - 1;
                        if (var29 == -1) {
                            break;
                        }
                        class566.field7096[this.field8185[var28] - 1] = -999999;
                    }
                }
            }
            for (int var19 = 0; var19 < this.field8174; var19++) {
                if (class566.field7096[this.field8199[var19]] != -999999 && class566.field7096[this.field8254[var19]] != -999999 && class566.field7096[this.field8259[var19]] != -999999 && this.method3369(true, class403.field5210[this.field8259[var19]], arg1, class566.field7096[this.field8259[var19]], arg0, class566.field7096[this.field8199[var19]], class566.field7096[this.field8254[var19]], class403.field5210[this.field8254[var19]], class403.field5210[this.field8199[var19]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!og", name = "P", descriptor = "()V")
    public final void method2052() {
        for (int var1 = 0; var1 < this.field8171; var1++) {
            this.field8229[var1] = -this.field8229[var1];
        }
        field8265++;
        for (int var2 = 0; var2 < this.field8218; var2++) {
            this.field8193[var2] = (short) (-this.field8193[var2]);
        }
        for (int var3 = 0; var3 < this.field8174; var3++) {
            short var4 = this.field8199[var3];
            this.field8199[var3] = this.field8259[var3];
            this.field8259[var3] = var4;
        }
        this.method3363((byte) -5);
        this.method3365(55);
        this.method3373((byte) 90);
        this.field8178 = false;
    }

    @OriginalMember(owner = "client!og", name = "M", descriptor = "()I")
    public final int method2068() {
        if (!this.field8178) {
            this.method3375((byte) 94);
        }
        field8216++;
        return this.field8160;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)V")
    private final void method3363(byte arg0) {
        if (arg0 == -5) {
            if (this.field8164 != null) {
                this.field8164.field6223 = false;
            }
            field8252++;
        }
    }

    @OriginalMember(owner = "client!og", name = "ZA", descriptor = "()I")
    public final int method2071() {
        field8235++;
        if (!this.field8178) {
            this.method3375((byte) 90);
        }
        return this.field8230;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BIZ)Lba;")
    public final class359 method951(byte arg0, int arg1, boolean arg2) {
        field8186++;
        class606 var4;
        class606 var5;
        if (arg0 == 1) {
            var5 = this.field8162.field2891;
            var4 = this.field8162.field2894;
        } else if (arg0 == 2) {
            var4 = this.field8162.field2888;
            var5 = this.field8162.field2899;
        } else if (arg0 == 3) {
            var4 = this.field8162.field2893;
            var5 = this.field8162.field2897;
        } else if (arg0 == 4) {
            var4 = this.field8162.field2884;
            var5 = this.field8162.field2890;
        } else if (arg0 == 5) {
            var4 = this.field8162.field2886;
            var5 = this.field8162.field2902;
        } else {
            var5 = var4 = new class606(this.field8162, 0, 0, true, false);
        }
        return this.method3370(arg2, (byte) -91, var4, arg0 != 0, var5, arg1);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Z")
    private final boolean method3364(int arg0) {
        field8183++;
        if (this.field8206.field6971) {
            return true;
        }
        if (this.field8206.field6966 == null) {
            this.field8206.field6966 = this.field8162.method340((byte) 125, this.field8274);
        }
        class13 var2 = this.field8206.field6966;
        var2.method59(-29529, this.field8187 * 6);
        Buffer var3 = var2.method62(true, true);
        if (arg0 != 3) {
            this.field8241 = null;
        }
        if (var3 != null) {
            Stream var4 = this.field8162.method1289(100, var3);
            if (Stream.method3525()) {
                for (int var5 = 0; var5 < this.field8187; var5++) {
                    var4.method3526(this.field8199[var5]);
                    var4.method3526(this.field8254[var5]);
                    var4.method3526(this.field8259[var5]);
                }
            } else {
                for (int var6 = 0; var6 < this.field8187; var6++) {
                    var4.method3519(this.field8199[var6]);
                    var4.method3519(this.field8254[var6]);
                    var4.method3519(this.field8259[var6]);
                }
            }
            var4.method3530();
            if (var2.method61((byte) 96)) {
                this.field8206.field6971 = true;
                this.field8206.field6968 = var2;
                this.field8221 = true;
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    private final void method3365(int arg0) {
        if ((this.field8195 & arg0) == 0) {
            if (this.field8177 != null) {
                this.field8177.field6223 = false;
            }
        } else if (this.field8205 != null) {
            this.field8205.field6223 = false;
        }
        field8262++;
    }

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "(Lw;)Lw;")
    public final class279 method2055(class279 arg0) {
        field8176++;
        if (this.field8218 == 0) {
            return null;
        }
        if (!this.field8178) {
            this.method3375((byte) 127);
        }
        int var2;
        int var3;
        if (this.field8162.field2828 > 0) {
            var2 = this.field8194 - (this.field8162.field2828 * this.field8260 >> 8) >> this.field8162.field2833;
            var3 = this.field8160 - (this.field8162.field2828 * this.field8257 >> 8) >> this.field8162.field2833;
        } else {
            var2 = this.field8194 - (this.field8162.field2828 * this.field8257 >> 8) >> this.field8162.field2833;
            var3 = this.field8160 - (this.field8162.field2828 * this.field8260 >> 8) >> this.field8162.field2833;
        }
        int var4;
        int var5;
        if (this.field8162.field2784 > 0) {
            var4 = this.field8181 - (this.field8162.field2784 * this.field8260 >> 8) >> this.field8162.field2833;
            var5 = this.field8197 - (this.field8162.field2784 * this.field8257 >> 8) >> this.field8162.field2833;
        } else {
            var4 = this.field8181 - (this.field8162.field2784 * this.field8257 >> 8) >> this.field8162.field2833;
            var5 = this.field8197 - (this.field8162.field2784 * this.field8260 >> 8) >> this.field8162.field2833;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class670 var8 = (class670) arg0;
        class670 var9;
        if (var8 != null && var8.method3718(var7, var6, 95)) {
            var9 = var8;
            var8.method3721(-1);
        } else {
            var9 = new class670(this.field8162, var6, var7);
        }
        var9.method3719(var4, var5, var3, -33, var2);
        this.method3361(6407, var9);
        return var9;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    private final void method3366(int arg0) {
        if (this.field8177 != null) {
            this.field8177.field6223 = false;
        }
        int var2 = -103 / ((arg0 + 17) / 62);
        field8180++;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
    private final void method3367(int arg0) {
        field8188++;
        if (this.field8187 == 0 || arg0 != 0) {
            return;
        }
        if (this.method3362((byte) 51) && this.method3364(3)) {
            this.field8162.method363(-103, 0, this.field8164.field6220);
            this.field8162.method363(arg0 ^ 0xFFFFFF8D, 1, this.field8177.field6220);
            this.field8162.method363(-82, 2, this.field8226.field6220);
            boolean var2;
            if ((this.field8195 & 0x37) == 0) {
                var2 = false;
                this.field8162.method1294(false, -29852);
                this.field8162.method344(arg0 ^ 0x6E8F, this.field8162.field2898);
            } else {
                var2 = true;
                this.field8162.method1294(true, -29852);
                this.field8162.method363(arg0 - 77, 3, this.field8205.field6220);
                this.field8162.method344(28303, this.field8162.field2901);
            }
            for (int var3 = 0; var3 < this.field8238.length; var3++) {
                int var4 = this.field8204[var3];
                int var5 = this.field8204[var3 + 1];
                int var6 = this.field8168[var4] & 0xFFFF;
                if (var6 == 65535) {
                    var6 = -1;
                }
                this.field8162.method1312(var2, 0, var6, true);
                this.field8162.method375(var4 * 3, (byte) 125, this.field8238[var3], this.field8200[var3], var5 - var4, class701.field9803, this.field8206.field6968);
            }
        }
        this.method3359((byte) -106);
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
    private final void method3368(int arg0) {
        if (arg0 != 159) {
            return;
        }
        field8249++;
        if (this.field8214 == null) {
            return;
        }
        float var2 = this.field8162.method1275();
        float var3 = this.field8162.method1273();
        this.field8162.method455(false);
        this.field8162.method1294(false, -29852);
        this.field8162.method1274((byte) -120, class666.field9048, 1);
        this.field8162.method1304(class666.field9048, 1, (byte) -37);
        for (int var4 = 0; var4 < this.field8213; var4++) {
            class384 var5 = this.field8214[var4];
            class67 var6 = this.field8220[var4];
            if (!var5.field4933 || !this.field8162.method393()) {
                float var7 = (float) (this.field8190[var5.field4938] + this.field8190[var5.field4929] + this.field8190[var5.field4934]) * 0.3333333F;
                float var8 = (float) (this.field8172[var5.field4938] + this.field8172[var5.field4929] + this.field8172[var5.field4934]) * 0.3333333F;
                float var9 = (float) (this.field8229[var5.field4938] + this.field8229[var5.field4929] + this.field8229[var5.field4934]) * 0.3333333F;
                float var10 = class205.field2370 * var9 + class5.field37 * var8 + class160.field1887 * var7 + class98.field1260;
                float var11 = class5.field45 * var9 + class349.field4482 * var8 + class174.field2036 * var7 + class479.field5961;
                float var12 = class152.field1813 * var9 + class635.field8611 * var8 + class274.field3477 * var7 + class436.field5483;
                class581 var13 = this.field8162.method1329(1);
                var13.method3215(var5.field4935 * var6.field814 >> 7, var12, var6.field805, (byte) -72, (float) var6.field813 + var11, var5.field4939 * var6.field808 >> 7, (float) var6.field800 + var10);
                var13.method3218(0, this.field8162.field2777);
                this.field8162.method1348(94);
                this.field8162.method406(var3, var2 - ((float) var5.field4936 * 1.5F));
                int var14 = var6.field810;
                this.field8162.method1312(false, arg0 - 159, var5.field4928, false);
                this.field8162.method1321(-77, var5.field4930);
                this.field8162.method1341((byte) 12, var14);
                this.field8162.method1335(true);
            }
        }
        this.field8162.method1304(class251.field3237, 1, (byte) 127);
        this.field8162.method1274((byte) -68, class251.field3237, 1);
        this.field8162.method406(var3, var2);
        this.field8162.method455(true);
    }

    @OriginalMember(owner = "client!og", name = "ua", descriptor = "(IIII)V")
    public final void method2076(int arg0, int arg1, int arg2, int arg3) {
        field8170++;
        if (arg0 == 0) {
            class175.field2048 = 0;
            class161.field1895 = 0;
            int var5 = 0;
            class279.field3539 = 0;
            for (int var6 = 0; var6 < this.field8171; var6++) {
                class279.field3539 += this.field8190[var6];
                class175.field2048 += this.field8172[var6];
                var5++;
                class161.field1895 += this.field8229[var6];
            }
            if (var5 > 0) {
                class175.field2048 = class175.field2048 / var5 + arg2;
                class279.field3539 = class279.field3539 / var5 + arg1;
                class161.field1895 = class161.field1895 / var5 + arg3;
            } else {
                class175.field2048 = arg2;
                class161.field1895 = arg3;
                class279.field3539 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field8171; var7++) {
                this.field8190[var7] += arg1;
                this.field8172[var7] += arg2;
                this.field8229[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field8171; var8++) {
                this.field8190[var8] -= class279.field3539;
                this.field8172[var8] -= class175.field2048;
                this.field8229[var8] -= class161.field1895;
                if (arg3 != 0) {
                    int var9 = class243.field3129[arg3];
                    int var10 = class243.field3128[arg3];
                    int var11 = this.field8172[var8] * var9 + this.field8190[var8] * var10 + 16383 >> 14;
                    this.field8172[var8] = this.field8172[var8] * var10 + 16383 - (this.field8190[var8] * var9) >> 14;
                    this.field8190[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class243.field3129[arg1];
                    int var13 = class243.field3128[arg1];
                    int var14 = this.field8172[var8] * var13 + 16383 - (this.field8229[var8] * var12) >> 14;
                    this.field8229[var8] = this.field8172[var8] * var12 + (this.field8229[var8] * var13 + 16383) >> 14;
                    this.field8172[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class243.field3129[arg2];
                    int var16 = class243.field3128[arg2];
                    int var17 = this.field8229[var8] * var15 + this.field8190[var8] * var16 + 16383 >> 14;
                    this.field8229[var8] = this.field8229[var8] * var16 + 16383 - this.field8190[var8] * var15 >> 14;
                    this.field8190[var8] = var17;
                }
                this.field8190[var8] += class279.field3539;
                this.field8172[var8] += class175.field2048;
                this.field8229[var8] += class161.field1895;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field8171; var18++) {
                this.field8190[var18] -= class279.field3539;
                this.field8172[var18] -= class175.field2048;
                this.field8229[var18] -= class161.field1895;
                this.field8190[var18] = this.field8190[var18] * arg1 / 128;
                this.field8172[var18] = this.field8172[var18] * arg2 / 128;
                this.field8229[var18] = this.field8229[var18] * arg3 / 128;
                this.field8190[var18] += class279.field3539;
                this.field8172[var18] += class175.field2048;
                this.field8229[var18] += class161.field1895;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field8174; var19++) {
                int var23 = (this.field8196[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field8196[var19] = (byte) var23;
            }
            if (this.field8214 != null) {
                for (int var20 = 0; var20 < this.field8213; var20++) {
                    class384 var21 = this.field8214[var20];
                    class67 var22 = this.field8220[var20];
                    var22.field810 = 255 - (this.field8196[var21.field4937] & 0xFF) << 24 | var22.field810 & 0xFFFFFF;
                }
            }
            this.method3366(-86);
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field8174; var24++) {
                int var28 = this.field8224[var24] & 0xFFFF;
                int var29 = (var28 & 0xFDA1) >> 10;
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
                this.field8224[var24] = (short) class364.method2113(var34, class364.method2113(var32 << 10, var31 << 7));
            }
            if (this.field8214 != null) {
                for (int var25 = 0; var25 < this.field8213; var25++) {
                    class384 var26 = this.field8214[var25];
                    class67 var27 = this.field8220[var25];
                    var27.field810 = class76.field999[this.field8224[var26.field4937] & 0xFFFF] & 0xFFFFFF | var27.field810 & 0xFF000000;
                }
            }
            this.method3366(-92);
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field8213; var35++) {
                class67 var36 = this.field8220[var35];
                var36.field800 += arg1;
                var36.field813 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field8213; var37++) {
                class67 var38 = this.field8220[var37];
                var38.field814 = var38.field814 * arg2 >> 7;
                var38.field808 = var38.field808 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field8213; var39++) {
                class67 var40 = this.field8220[var39];
                var40.field805 = var40.field805 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZIIIIIIII)Z")
    private final boolean method3369(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8182++;
        if (arg2 < arg8 && arg2 < arg7 && arg2 < arg1) {
            return false;
        }
        if (!arg0) {
            this.method3371(11, -0.18119009F, -7, null, -39L, -67, -31, -90, 117, -66, -0.11744975F);
        }
        if (arg2 > arg8 && arg7 < arg2 && arg1 < arg2) {
            return false;
        } else if (arg4 < arg5 && arg6 > arg4 && arg4 < arg3) {
            return false;
        } else {
            return arg5 >= arg4 || arg6 >= arg4 || arg4 <= arg3;
        }
    }

    @OriginalMember(owner = "client!og", name = "h", descriptor = "()I")
    public final int method2075() {
        field8210++;
        return this.field8167;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZBLog;ZLog;I)Lba;")
    private final class359 method3370(boolean arg0, byte arg1, class606 arg2, boolean arg3, class606 arg4, int arg5) {
        arg4.field8195 = this.field8195;
        arg4.field8174 = this.field8174;
        arg4.field8187 = this.field8187;
        arg4.field8198 = this.field8198;
        arg4.field8212 = this.field8212;
        arg4.field8213 = this.field8213;
        arg4.field8171 = this.field8171;
        field8264++;
        arg4.field8167 = arg5;
        arg4.field8218 = this.field8218;
        arg4.field8237 = this.field8237;
        boolean var7 = class549.method2935((byte) 91, arg5, this.field8195);
        boolean var8 = class39.method252(arg5, (byte) 122, this.field8195);
        boolean var9 = class89.method668(this.field8195, true, arg5);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg4.field8190 = this.field8190;
            } else if (arg2.field8190 == null || this.field8198 > arg2.field8190.length) {
                arg4.field8190 = arg2.field8190 = new int[this.field8198];
            } else {
                arg4.field8190 = arg2.field8190;
            }
            if (!var8) {
                arg4.field8172 = this.field8172;
            } else if (arg2.field8172 == null || arg2.field8172.length < this.field8198) {
                arg4.field8172 = arg2.field8172 = new int[this.field8198];
            } else {
                arg4.field8172 = arg2.field8172;
            }
            if (!var9) {
                arg4.field8229 = this.field8229;
            } else if (arg2.field8229 == null || this.field8198 > arg2.field8229.length) {
                arg4.field8229 = arg2.field8229 = new int[this.field8198];
            } else {
                arg4.field8229 = arg2.field8229;
            }
            for (int var11 = 0; var11 < this.field8198; var11++) {
                if (var7) {
                    arg4.field8190[var11] = this.field8190[var11];
                }
                if (var8) {
                    arg4.field8172[var11] = this.field8172[var11];
                }
                if (var9) {
                    arg4.field8229[var11] = this.field8229[var11];
                }
            }
        } else {
            arg4.field8229 = this.field8229;
            arg4.field8172 = this.field8172;
            arg4.field8190 = this.field8190;
        }
        if (arg1 > -32) {
            this.method3371(15, -0.106419675F, -77, null, 30L, 112, 30, -2, 96, -40, -0.22097686F);
        }
        if (class20.method124(arg5, 23008, this.field8195)) {
            arg4.field8164 = arg2.field8164;
            arg4.field8164.field6223 = this.field8164.field6223;
            arg4.field8164.field6224 = true;
            arg4.field8164.field6220 = this.field8164.field6220;
        } else if (class38.method244(this.field8195, false, arg5)) {
            arg4.field8164 = this.field8164;
        } else {
            arg4.field8164 = null;
        }
        if (class252.method1518(arg5, this.field8195, 540800)) {
            if (arg2.field8224 == null || this.field8174 > arg2.field8224.length) {
                arg4.field8224 = arg2.field8224 = new short[this.field8174];
            } else {
                arg4.field8224 = arg2.field8224;
            }
            for (int var12 = 0; var12 < this.field8174; var12++) {
                arg4.field8224[var12] = this.field8224[var12];
            }
        } else {
            arg4.field8224 = this.field8224;
        }
        if (class290.method1739(this.field8195, arg5, (byte) -14)) {
            if (arg2.field8196 == null || arg2.field8196.length < this.field8174) {
                arg4.field8196 = arg2.field8196 = new byte[this.field8174];
            } else {
                arg4.field8196 = arg2.field8196;
            }
            for (int var13 = 0; var13 < this.field8174; var13++) {
                arg4.field8196[var13] = this.field8196[var13];
            }
        } else {
            arg4.field8196 = this.field8196;
        }
        if (class587.method3261(this.field8195, arg5, -1)) {
            arg4.field8177 = arg2.field8177;
            arg4.field8177.field6220 = this.field8177.field6220;
            arg4.field8177.field6224 = true;
            arg4.field8177.field6223 = this.field8177.field6223;
        } else if (class226.method1366(this.field8195, arg5, (byte) -76)) {
            arg4.field8177 = this.field8177;
        } else {
            arg4.field8177 = null;
        }
        if (class518.method2807(arg5, this.field8195, -23925)) {
            if (arg2.field8273 == null || this.field8218 > arg2.field8273.length) {
                int var14 = this.field8218;
                arg4.field8193 = arg2.field8193 = new short[var14];
                arg4.field8270 = arg2.field8270 = new short[var14];
                arg4.field8273 = arg2.field8273 = new short[var14];
            } else {
                arg4.field8193 = arg2.field8193;
                arg4.field8270 = arg2.field8270;
                arg4.field8273 = arg2.field8273;
            }
            if (this.field8243 == null) {
                arg4.field8243 = null;
                for (int var15 = 0; var15 < this.field8218; var15++) {
                    arg4.field8273[var15] = this.field8273[var15];
                    arg4.field8270[var15] = this.field8270[var15];
                    arg4.field8193[var15] = this.field8193[var15];
                }
            } else {
                if (arg2.field8243 == null) {
                    arg2.field8243 = new class314();
                }
                class314 var16 = arg4.field8243 = arg2.field8243;
                if (var16.field3937 == null || this.field8218 > var16.field3937.length) {
                    int var17 = this.field8218;
                    var16.field3939 = new byte[var17];
                    var16.field3940 = new short[var17];
                    var16.field3937 = new short[var17];
                    var16.field3943 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field8218; var18++) {
                    arg4.field8273[var18] = this.field8273[var18];
                    arg4.field8270[var18] = this.field8270[var18];
                    arg4.field8193[var18] = this.field8193[var18];
                    var16.field3937[var18] = this.field8243.field3937[var18];
                    var16.field3940[var18] = this.field8243.field3940[var18];
                    var16.field3943[var18] = this.field8243.field3943[var18];
                    var16.field3939[var18] = this.field8243.field3939[var18];
                }
            }
            arg4.field8225 = this.field8225;
        } else {
            arg4.field8225 = this.field8225;
            arg4.field8193 = this.field8193;
            arg4.field8270 = this.field8270;
            arg4.field8243 = this.field8243;
            arg4.field8273 = this.field8273;
        }
        if (class453.method2492(this.field8195, arg5, (byte) -82)) {
            arg4.field8205 = arg2.field8205;
            arg4.field8205.field6224 = true;
            arg4.field8205.field6220 = this.field8205.field6220;
            arg4.field8205.field6223 = this.field8205.field6223;
        } else if (class686.method3784(-1, this.field8195, arg5)) {
            arg4.field8205 = this.field8205;
        } else {
            arg4.field8205 = null;
        }
        if (class514.method2799(24419, this.field8195, arg5)) {
            if (arg2.field8215 == null || arg2.field8215.length < this.field8174) {
                int var19 = this.field8218;
                arg4.field8245 = arg2.field8245 = new float[var19];
                arg4.field8215 = arg2.field8215 = new float[var19];
            } else {
                arg4.field8215 = arg2.field8215;
                arg4.field8245 = arg2.field8245;
            }
            for (int var20 = 0; var20 < this.field8218; var20++) {
                arg4.field8215[var20] = this.field8215[var20];
                arg4.field8245[var20] = this.field8245[var20];
            }
        } else {
            arg4.field8215 = this.field8215;
            arg4.field8245 = this.field8245;
        }
        if (class39.method253((byte) 11, this.field8195, arg5)) {
            arg4.field8226 = arg2.field8226;
            arg4.field8226.field6223 = this.field8226.field6223;
            arg4.field8226.field6224 = true;
            arg4.field8226.field6220 = this.field8226.field6220;
        } else if (class148.method929(2048, this.field8195, arg5)) {
            arg4.field8226 = this.field8226;
        } else {
            arg4.field8226 = null;
        }
        if (class638.method3584(this.field8195, arg5, 13896)) {
            if (arg2.field8199 == null || arg2.field8199.length < this.field8174) {
                int var21 = this.field8174;
                arg4.field8259 = arg2.field8259 = new short[var21];
                arg4.field8254 = arg2.field8254 = new short[var21];
                arg4.field8199 = arg2.field8199 = new short[var21];
            } else {
                arg4.field8259 = arg2.field8259;
                arg4.field8254 = arg2.field8254;
                arg4.field8199 = arg2.field8199;
            }
            for (int var22 = 0; var22 < this.field8174; var22++) {
                arg4.field8199[var22] = this.field8199[var22];
                arg4.field8254[var22] = this.field8254[var22];
                arg4.field8259[var22] = this.field8259[var22];
            }
        } else {
            arg4.field8254 = this.field8254;
            arg4.field8259 = this.field8259;
            arg4.field8199 = this.field8199;
        }
        if (class211.method1237(this.field8195, (byte) 93, arg5)) {
            arg4.field8206 = arg2.field8206;
            arg4.field8206.field6971 = this.field8206.field6971;
            arg4.field8206.field6967 = true;
            arg4.field8206.field6968 = this.field8206.field6968;
        } else if (class42.method263(arg5, this.field8195, (byte) -13)) {
            arg4.field8206 = this.field8206;
        } else {
            arg4.field8206 = null;
        }
        if (class564.method2993(arg5, true, this.field8195)) {
            if (arg2.field8168 == null || this.field8174 > arg2.field8168.length) {
                int var23 = this.field8174;
                arg4.field8168 = arg2.field8168 = new short[var23];
            } else {
                arg4.field8168 = arg2.field8168;
            }
            for (int var24 = 0; var24 < this.field8174; var24++) {
                arg4.field8168[var24] = this.field8168[var24];
            }
        } else {
            arg4.field8168 = this.field8168;
        }
        if (!class236.method1425(arg5, 32879, this.field8195)) {
            arg4.field8220 = this.field8220;
        } else if (arg2.field8220 == null || this.field8213 > arg2.field8220.length) {
            int var26 = this.field8213;
            arg4.field8220 = arg2.field8220 = new class67[var26];
            for (int var27 = 0; var27 < this.field8213; var27++) {
                arg4.field8220[var27] = this.field8220[var27].method527(0);
            }
        } else {
            arg4.field8220 = arg2.field8220;
            for (int var25 = 0; var25 < this.field8213; var25++) {
                arg4.field8220[var25].method526(this.field8220[var25], (byte) 117);
            }
        }
        arg4.field8222 = this.field8222;
        arg4.field8185 = this.field8185;
        arg4.field8200 = this.field8200;
        arg4.field8241 = this.field8241;
        arg4.field8238 = this.field8238;
        arg4.field8214 = this.field8214;
        arg4.field8173 = this.field8173;
        arg4.field8258 = this.field8258;
        arg4.field8201 = this.field8201;
        arg4.field8246 = this.field8246;
        arg4.field8223 = this.field8223;
        if (this.field8178) {
            arg4.field8260 = this.field8260;
            arg4.field8181 = this.field8181;
            arg4.field8178 = true;
            arg4.field8194 = this.field8194;
            arg4.field8197 = this.field8197;
            arg4.field8230 = this.field8230;
            arg4.field8257 = this.field8257;
            arg4.field8160 = this.field8160;
        } else {
            arg4.field8178 = false;
        }
        arg4.field8253 = this.field8253;
        arg4.field8204 = this.field8204;
        arg4.field8165 = this.field8165;
        arg4.field8261 = this.field8261;
        return arg4;
    }

    @OriginalMember(owner = "client!og", name = "u", descriptor = "()I")
    public final int method2064() {
        field8251++;
        return this.field8212;
    }

    @OriginalMember(owner = "client!og", name = "m", descriptor = "(III)V")
    public final void method2066(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field8171; var4++) {
            if (arg0 != 0) {
                this.field8190[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field8172[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field8229[var4] += arg2;
            }
        }
        field8217++;
        this.method3363((byte) -5);
        this.field8178 = false;
    }

    @OriginalMember(owner = "client!og", name = "E", descriptor = "(I[IIIIIZ)V")
    public final void method2081(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field8234++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            class161.field1895 = 0;
            int var12 = 0;
            class279.field3539 = 0;
            class175.field2048 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field8261.length) {
                    int[] var15 = this.field8261[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class279.field3539 += this.field8190[var17];
                        class175.field2048 += this.field8172[var17];
                        class161.field1895 += this.field8229[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class279.field3539 = class279.field3539 / var12 + var11;
                class175.field2048 = class175.field2048 / var12 + var10;
                class161.field1895 = class161.field1895 / var12 + var9;
            } else {
                class175.field2048 = var10;
                class279.field3539 = var11;
                class161.field1895 = var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field8261.length > var22) {
                    int[] var23 = this.field8261[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field8190[var25] += var20;
                        this.field8172[var25] += var18;
                        this.field8229[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field8261.length) {
                    int[] var46 = this.field8261[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field8190[var48] -= class279.field3539;
                            this.field8172[var48] -= class175.field2048;
                            this.field8229[var48] -= class161.field1895;
                            if (arg4 != 0) {
                                int var49 = class243.field3129[arg4];
                                int var50 = class243.field3128[arg4];
                                int var51 = this.field8190[var48] * var50 + (this.field8172[var48] * var49 + 16383) >> 14;
                                this.field8172[var48] = this.field8172[var48] * var50 + 16383 - (this.field8190[var48] * var49) >> 14;
                                this.field8190[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class243.field3129[arg2];
                                int var53 = class243.field3128[arg2];
                                int var54 = this.field8172[var48] * var53 + 16383 - (this.field8229[var48] * var52) >> 14;
                                this.field8229[var48] = this.field8172[var48] * var52 + (this.field8229[var48] * var53) + 16383 >> 14;
                                this.field8172[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class243.field3129[arg3];
                                int var56 = class243.field3128[arg3];
                                int var57 = this.field8229[var48] * var55 + this.field8190[var48] * var56 + 16383 >> 14;
                                this.field8229[var48] = this.field8229[var48] * var56 + 16383 - (this.field8190[var48] * var55) >> 14;
                                this.field8190[var48] = var57;
                            }
                            this.field8190[var48] += class279.field3539;
                            this.field8172[var48] += class175.field2048;
                            this.field8229[var48] += class161.field1895;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field8190[var59] -= class279.field3539;
                            this.field8172[var59] -= class175.field2048;
                            this.field8229[var59] -= class161.field1895;
                            if (arg2 != 0) {
                                int var60 = class243.field3129[arg2];
                                int var61 = class243.field3128[arg2];
                                int var62 = this.field8172[var59] * var61 + 16383 - (this.field8229[var59] * var60) >> 14;
                                this.field8229[var59] = this.field8229[var59] * var61 + this.field8172[var59] * var60 + 16383 >> 14;
                                this.field8172[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class243.field3129[arg4];
                                int var64 = class243.field3128[arg4];
                                int var65 = this.field8172[var59] * var63 + (this.field8190[var59] * var64) + 16383 >> 14;
                                this.field8172[var59] = this.field8172[var59] * var64 + 16383 - (this.field8190[var59] * var63) >> 14;
                                this.field8190[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class243.field3129[arg3];
                                int var67 = class243.field3128[arg3];
                                int var68 = this.field8229[var59] * var66 + (this.field8190[var59] * var67) + 16383 >> 14;
                                this.field8229[var59] = this.field8229[var59] * var67 + 16383 - this.field8190[var59] * var66 >> 14;
                                this.field8190[var59] = var68;
                            }
                            this.field8190[var59] += class279.field3539;
                            this.field8172[var59] += class175.field2048;
                            this.field8229[var59] += class161.field1895;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field8261.length > var28) {
                        int[] var29 = this.field8261[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field8246[var31];
                            int var33 = this.field8246[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field8185[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class243.field3129[arg4];
                                    int var37 = class243.field3128[arg4];
                                    int var38 = this.field8273[var35] * var37 + this.field8270[var35] * var36 + 16383 >> 14;
                                    this.field8270[var35] = (short) (this.field8270[var35] * var37 + 16383 - (this.field8273[var35] * var36) >> 14);
                                    this.field8273[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class243.field3129[arg2];
                                    int var40 = class243.field3128[arg2];
                                    int var41 = this.field8270[var35] * var40 + 16383 - this.field8193[var35] * var39 >> 14;
                                    this.field8193[var35] = (short) (this.field8270[var35] * var39 + this.field8193[var35] * var40 + 16383 >> 14);
                                    this.field8270[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class243.field3129[arg3];
                                    int var43 = class243.field3128[arg3];
                                    int var44 = this.field8273[var35] * var43 + this.field8193[var35] * var42 + 16383 >> 14;
                                    this.field8193[var35] = (short) (this.field8193[var35] * var43 + 16383 - (this.field8273[var35] * var42) >> 14);
                                    this.field8273[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                this.method3365(55);
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field8261.length) {
                    int[] var71 = this.field8261[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field8190[var73] -= class279.field3539;
                        this.field8172[var73] -= class175.field2048;
                        this.field8229[var73] -= class161.field1895;
                        this.field8190[var73] = this.field8190[var73] * arg2 >> 7;
                        this.field8172[var73] = this.field8172[var73] * arg3 >> 7;
                        this.field8229[var73] = this.field8229[var73] * arg4 >> 7;
                        this.field8190[var73] += class279.field3539;
                        this.field8172[var73] += class175.field2048;
                        this.field8229[var73] += class161.field1895;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8222 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var79 = arg1[var75];
                    if (this.field8222.length > var79) {
                        int[] var80 = this.field8222[var79];
                        for (int var81 = 0; var81 < var80.length; var81++) {
                            int var82 = var80[var81];
                            int var83 = (this.field8196[var82] & 0xFF) + arg2 * 8;
                            if (var83 < 0) {
                                var83 = 0;
                            } else if (var83 > 255) {
                                var83 = 255;
                            }
                            this.field8196[var82] = (byte) var83;
                        }
                        var74 |= var80.length > 0;
                    }
                }
                if (var74) {
                    if (this.field8214 != null) {
                        for (int var76 = 0; var76 < this.field8213; var76++) {
                            class384 var77 = this.field8214[var76];
                            class67 var78 = this.field8220[var76];
                            var78.field810 = 255 - (this.field8196[var77.field4937] & 0xFF) << 24 | var78.field810 & 0xFFFFFF;
                        }
                    }
                    this.method3366(111);
                }
            }
        } else if (arg0 == 7) {
            if (this.field8222 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var89 = arg1[var85];
                    if (var89 < this.field8222.length) {
                        int[] var90 = this.field8222[var89];
                        for (int var91 = 0; var91 < var90.length; var91++) {
                            int var92 = var90[var91];
                            int var93 = this.field8224[var92] & 0xFFFF;
                            int var94 = (var93 & 0xFE8D) >> 10;
                            int var95 = (var93 & 0x3D5) >> 7;
                            int var96 = arg3 / 4 + var95;
                            int var97 = var93 & 0x7F;
                            int var98 = arg2 + var94 & 0x3F;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            int var99 = arg4 + var97;
                            if (var99 < 0) {
                                var99 = 0;
                            } else if (var99 > 127) {
                                var99 = 127;
                            }
                            this.field8224[var92] = (short) class364.method2113(class364.method2113(var96 << 7, var98 << 10), var99);
                        }
                        var84 |= var90.length > 0;
                    }
                }
                if (var84) {
                    if (this.field8214 != null) {
                        for (int var86 = 0; var86 < this.field8213; var86++) {
                            class384 var87 = this.field8214[var86];
                            class67 var88 = this.field8220[var86];
                            var88.field810 = var88.field810 & 0xFF000000 | class76.field999[this.field8224[var87.field4937] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method3366(-84);
                }
            }
        } else if (arg0 == 8) {
            if (this.field8201 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (this.field8201.length > var101) {
                        int[] var102 = this.field8201[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            class67 var104 = this.field8220[var102[var103]];
                            var104.field800 += arg2;
                            var104.field813 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8201 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (this.field8201.length > var106) {
                        int[] var107 = this.field8201[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            class67 var109 = this.field8220[var107[var108]];
                            var109.field814 = var109.field814 * arg3 >> 7;
                            var109.field808 = var109.field808 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8201 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (this.field8201.length > var111) {
                    int[] var112 = this.field8201[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        class67 var114 = this.field8220[var112[var113]];
                        var114.field805 = var114.field805 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "I", descriptor = "(I)V")
    public final void method2053(int arg0) {
        field8231++;
        int var2 = class243.field3129[arg0];
        int var3 = class243.field3128[arg0];
        for (int var4 = 0; var4 < this.field8171; var4++) {
            int var5 = this.field8229[var4] * var2 + this.field8190[var4] * var3 >> 14;
            this.field8229[var4] = this.field8229[var4] * var3 - (this.field8190[var4] * var2) >> 14;
            this.field8190[var4] = var5;
        }
        this.method3363((byte) -5);
        this.field8178 = false;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "()[Lfd;")
    public final class493[] method2063() {
        field8211++;
        return this.field8173;
    }

    @OriginalMember(owner = "client!og", name = "F", descriptor = "()I")
    public final int method2062() {
        field8179++;
        return this.field8237;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "()[Let;")
    public final class556[] method2077() {
        field8163++;
        return this.field8253;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lq;Lpo;I)V")
    public final void method2049(class396 arg0, class524 arg1, int arg2) {
        field8191++;
        if (this.field8218 == 0) {
            return;
        }
        class581 var4 = this.field8162.field2776;
        class581 var5 = (class581) arg0;
        if (!this.field8178) {
            this.method3375((byte) 125);
        }
        class436.field5483 = var4.field7802 * var5.field7826 + var4.field7807 * var5.field7806 + var4.field7788 * var5.field7785 + var4.field7826;
        class635.field8611 = var4.field7802 * var5.field7807 + var4.field7807 * var5.field7819 + var4.field7788 * var5.field7779;
        float var6 = (float) this.field8257 * class635.field8611 + class436.field5483;
        float var7 = (float) this.field8260 * class635.field8611 + class436.field5483;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var9 = (float) this.field8230 + var6;
            var8 = (float) (-this.field8230) + var7;
        } else {
            var8 = (float) (-this.field8230) + var6;
            var9 = (float) this.field8230 + var7;
        }
        if ((this.field8162.field2836 <= var8) || (var9 <= (float) this.field8162.field2806)) {
            return;
        }
        class98.field1260 = var4.field7798 * var5.field7826 + var4.field7781 * var5.field7785 + var4.field7779 * var5.field7806 + var4.field7785;
        class5.field37 = var4.field7798 * var5.field7807 + var4.field7781 * var5.field7779 + var4.field7779 * var5.field7819;
        float var10 = (float) this.field8257 * class5.field37 + class98.field1260;
        float var11 = (float) this.field8260 * class5.field37 + class98.field1260;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) this.field8230 + var10) * (float) this.field8162.field2858;
            var13 = (var11 - (float) this.field8230) * (float) this.field8162.field2858;
        } else {
            var13 = ((float) (-this.field8230) + var10) * (float) this.field8162.field2858;
            var12 = ((float) this.field8230 + var11) * (float) this.field8162.field2858;
        }
        if ((var13 / var9 >= this.field8162.field2807) || (var12 / var9 <= this.field8162.field2791)) {
            return;
        }
        class349.field4482 = var4.field7822 * var5.field7807 + var4.field7819 * var5.field7819 + var4.field7812 * var5.field7779;
        class479.field5961 = var4.field7822 * var5.field7826 + var4.field7819 * var5.field7806 + var4.field7812 * var5.field7785 + var4.field7806;
        float var14 = (float) this.field8257 * class349.field4482 + class479.field5961;
        float var15 = (float) this.field8260 * class349.field4482 + class479.field5961;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) this.field8230 + var14) * (float) this.field8162.field2867;
            var17 = ((float) (-this.field8230) + var15) * (float) this.field8162.field2867;
        } else {
            var17 = (var14 - (float) this.field8230) * (float) this.field8162.field2867;
            var16 = ((float) this.field8230 + var15) * (float) this.field8162.field2867;
        }
        if ((this.field8162.field2786 <= var17 / var9) || (var16 / var9 <= this.field8162.field2870)) {
            return;
        }
        if (arg1 != null || this.field8214 != null) {
            class5.field45 = var4.field7822 * var5.field7802 + var4.field7819 * var5.field7822 + var4.field7812 * var5.field7798;
            class160.field1887 = var4.field7798 * var5.field7788 + var4.field7781 * var5.field7781 + var4.field7779 * var5.field7812;
            class205.field2370 = var4.field7798 * var5.field7802 + var4.field7781 * var5.field7798 + var4.field7779 * var5.field7822;
            class274.field3477 = var4.field7802 * var5.field7788 + var4.field7807 * var5.field7812 + var4.field7788 * var5.field7781;
            class174.field2036 = var4.field7822 * var5.field7788 + var4.field7819 * var5.field7812 + var4.field7812 * var5.field7781;
            class152.field1813 = var4.field7802 * var5.field7802 + var4.field7807 * var5.field7822 + var4.field7788 * var5.field7798;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field8194 + this.field8160 >> 1;
            int var21 = this.field8181 + this.field8197 >> 1;
            int var22 = (int) ((float) var21 * class205.field2370 + (float) this.field8257 * class5.field37 + (float) var20 * class160.field1887 + class98.field1260);
            int var23 = (int) ((float) var21 * class5.field45 + (float) this.field8257 * class349.field4482 + (float) var20 * class174.field2036 + class479.field5961);
            int var24 = (int) ((float) var21 * class152.field1813 + (float) this.field8257 * class635.field8611 + (float) var20 * class274.field3477 + class436.field5483);
            if (var24 < this.field8162.field2806) {
                var18 = true;
            } else {
                arg1.field6624 = this.field8162.field2858 * var22 / var24 + this.field8162.field2881;
                arg1.field6627 = this.field8162.field2867 * var23 / var24 + this.field8162.field2848;
            }
            int var25 = (int) ((float) var21 * class205.field2370 + (float) this.field8260 * class5.field37 + (float) var20 * class160.field1887 + class98.field1260);
            int var26 = (int) ((float) var21 * class5.field45 + (float) this.field8260 * class349.field4482 + (float) var20 * class174.field2036 + class479.field5961);
            int var27 = (int) ((float) var21 * class152.field1813 + (float) this.field8260 * class635.field8611 + (float) var20 * class274.field3477 + class436.field5483);
            if (var27 >= this.field8162.field2806) {
                arg1.field6628 = this.field8162.field2867 * var26 / var27 + this.field8162.field2848;
                arg1.field6626 = this.field8162.field2858 * var25 / var27 + this.field8162.field2881;
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field8162.field2806 && var27 < this.field8162.field2806) {
                    var19 = false;
                } else if (var24 < this.field8162.field2806) {
                    int var28 = (var27 - this.field8162.field2806 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field6624 = this.field8162.field2881 + (this.field8162.field2858 * var29 / this.field8162.field2806);
                    arg1.field6627 = this.field8162.field2867 * var30 / this.field8162.field2806 + this.field8162.field2848;
                } else if (this.field8162.field2806 > var27) {
                    int var31 = (var24 - this.field8162.field2806 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field6624 = this.field8162.field2858 * var32 / this.field8162.field2806 + this.field8162.field2881;
                    arg1.field6627 = this.field8162.field2867 * var33 / this.field8162.field2806 + this.field8162.field2848;
                }
            }
            if (var19) {
                if (var24 > var27) {
                    arg1.field6623 = (this.field8230 + var22) * this.field8162.field2858 / var24 + this.field8162.field2881 - arg1.field6624;
                } else {
                    arg1.field6623 = this.field8162.field2881 + ((this.field8230 + var25) * this.field8162.field2858 / var27) - arg1.field6626;
                }
                arg1.field6625 = true;
            }
        }
        this.field8162.method1347((byte) -8);
        this.field8162.method1333(116, var5);
        this.method3367(0);
        this.method3368(159);
    }

    @OriginalMember(owner = "client!og", name = "v", descriptor = "(I)V")
    public final void method2070(int arg0) {
        field8192++;
        int var2 = class243.field3129[arg0];
        int var3 = class243.field3128[arg0];
        for (int var4 = 0; var4 < this.field8171; var4++) {
            int var5 = this.field8172[var4] * var2 + (this.field8190[var4] * var3) >> 14;
            this.field8172[var4] = this.field8172[var4] * var3 - this.field8190[var4] * var2 >> 14;
            this.field8190[var4] = var5;
        }
        this.method3363((byte) -5);
        this.field8178 = false;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IFILnj;JIIIIIF)S")
    private final short method3371(int arg0, float arg1, int arg2, class229 arg3, long arg4, int arg5, int arg6, int arg7, int arg8, int arg9, float arg10) {
        field8266++;
        int var13 = this.field8246[arg2];
        int var14 = this.field8246[arg2 + 1];
        int var15 = 0;
        if (arg5 != 2) {
            this.method2085();
        }
        for (int var16 = var13; var16 < var14; var16++) {
            short var17 = this.field8185[var16];
            if (var17 == 0) {
                var15 = var16;
                break;
            }
            if (class109.field1365[var16] == arg4) {
                return (short) (var17 - 1);
            }
        }
        this.field8185[var15] = (short) (this.field8218 + 1);
        class109.field1365[var15] = arg4;
        this.field8223[this.field8218] = (short) arg9;
        this.field8258[this.field8218] = (short) arg2;
        this.field8273[this.field8218] = (short) arg7;
        this.field8270[this.field8218] = (short) arg6;
        this.field8193[this.field8218] = (short) arg8;
        this.field8225[this.field8218] = (byte) arg0;
        this.field8215[this.field8218] = arg10;
        this.field8245[this.field8218] = arg1;
        return (short) (this.field8218++);
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(B)V")
    public final void method3372(byte arg0) {
        field8166++;
        if (arg0 != 1) {
            return;
        }
        if (this.field8164 != null) {
            this.field8164.method2713(-1);
        }
        if (this.field8226 != null) {
            this.field8226.method2713(arg0 ^ 0xFFFFFFFE);
        }
        if (this.field8177 != null) {
            this.field8177.method2713(-1);
        }
        if (this.field8205 != null) {
            this.field8205.method2713(-1);
        }
        if (this.field8206 != null) {
            this.field8206.method2964((byte) -78);
        }
    }

    @OriginalMember(owner = "client!og", name = "l", descriptor = "(III)V")
    public final void method2088(int arg0, int arg1, int arg2) {
        field8250++;
        for (int var4 = 0; var4 < this.field8171; var4++) {
            if (arg0 != 128) {
                this.field8190[var4] = this.field8190[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field8172[var4] = this.field8172[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field8229[var4] = this.field8229[var4] * arg2 >> 7;
            }
        }
        this.method3363((byte) -5);
        this.field8178 = false;
    }

    @OriginalMember(owner = "client!og", name = "K", descriptor = "()I")
    public final int method2054() {
        field8161++;
        if (!this.field8178) {
            this.method3375((byte) 113);
        }
        return this.field8197;
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(B)V")
    private final void method3373(byte arg0) {
        if (this.field8206 != null) {
            this.field8206.field6971 = false;
        }
        field8175++;
        if (arg0 < 20) {
            this.field8218 = 74;
        }
    }

    @OriginalMember(owner = "client!og", name = "LA", descriptor = "()I")
    public final int method2089() {
        if (!this.field8178) {
            this.method3375((byte) 111);
        }
        field8233++;
        return this.field8181;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "()V")
    public final void method2090() {
        field8227++;
        if (this.field8218 > 0 && this.field8187 > 0) {
            this.method3362((byte) 51);
            this.method3364(3);
            this.method3359((byte) -102);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBIIZI)V")
    public static final void method3374(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if ((arg4 ? class611.field8310.field8681 : class611.field8310.field8689) != 0 && arg5 != 0 && class141.field1697 < 50 && arg0 != -1) {
            class266.field3358[class141.field1697++] = new class175((byte) (arg4 ? 3 : 2), arg0, arg5, arg2, arg3, 0);
        }
        field8248++;
        if (arg1 >= 97) {
            ;
        }
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(B)V")
    private final void method3375(byte arg0) {
        field8228++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        if (arg0 <= 88) {
            this.method2071();
        }
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field8171; var10++) {
            int var11 = this.field8190[var10];
            int var12 = this.field8172[var10];
            if (var11 < var2) {
                var2 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            int var13 = this.field8229[var10];
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
            int var15 = var11 * var11 + var12 * var12 + var13 * var13;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field8181 = var4;
        this.field8197 = var7;
        this.field8257 = var3;
        this.field8260 = var6;
        this.field8160 = var5;
        this.field8194 = var2;
        this.field8230 = (int) (Math.sqrt((double) var8) + 0.99D);
        Math.sqrt((double) var9);
        this.field8178 = true;
    }

    @OriginalMember(owner = "client!og", name = "UA", descriptor = "(SS)V")
    public final void method2080(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field8174; var3++) {
            if (this.field8224[var3] == arg0) {
                this.field8224[var3] = arg1;
            }
        }
        field8269++;
        if (this.field8214 != null) {
            for (int var4 = 0; var4 < this.field8213; var4++) {
                class384 var5 = this.field8214[var4];
                class67 var6 = this.field8220[var4];
                var6.field810 = var6.field810 & 0xFF000000 | class76.field999[this.field8224[var5.field4937] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method3366(117);
    }

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "()Z")
    public final boolean method2091() {
        field8244++;
        if (this.field8261 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field8198; var1++) {
            this.field8190[var1] <<= 0x4;
            this.field8172[var1] <<= 0x4;
            this.field8229[var1] <<= 0x4;
        }
        class279.field3539 = 0;
        class175.field2048 = 0;
        class161.field1895 = 0;
        return true;
    }

    @OriginalMember(owner = "client!og", name = "da", descriptor = "(I[IIIIZI[I)V")
    public final void method2050(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field8189++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = arg2 << 4;
            class175.field2048 = 0;
            int var13 = 0;
            class279.field3539 = 0;
            class161.field1895 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field8261.length) {
                    int[] var16 = this.field8261[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field8165 == null || (this.field8165[var18] & arg6) != 0) {
                            class279.field3539 += this.field8190[var18];
                            class175.field2048 += this.field8172[var18];
                            class161.field1895 += this.field8229[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class279.field3539 = var12;
                class161.field1895 = var11;
                class175.field2048 = var10;
            } else {
                class279.field3539 = class279.field3539 / var13 + var12;
                class175.field2048 = class175.field2048 / var13 + var10;
                class323.field4029 = true;
                class161.field1895 = class161.field1895 / var13 + var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
                int var21 = arg7[6] * arg2 + arg7[7] * arg3 + (arg7[8] * arg4) + 8192 >> 14;
                arg4 = var21;
                arg3 = var20;
                arg2 = var19;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field8261.length > var26) {
                    int[] var27 = this.field8261[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field8165 == null || (this.field8165[var29] & arg6) != 0) {
                            this.field8190[var29] += var22;
                            this.field8172[var29] += var23;
                            this.field8229[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (this.field8261.length > var49) {
                        int[] var50 = this.field8261[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field8165 == null || (arg6 & this.field8165[var52]) != 0) {
                                this.field8190[var52] -= class279.field3539;
                                this.field8172[var52] -= class175.field2048;
                                this.field8229[var52] -= class161.field1895;
                                if (arg4 != 0) {
                                    int var53 = class243.field3129[arg4];
                                    int var54 = class243.field3128[arg4];
                                    int var55 = this.field8172[var52] * var53 + this.field8190[var52] * var54 + 16383 >> 14;
                                    this.field8172[var52] = this.field8172[var52] * var54 + 16383 - (this.field8190[var52] * var53) >> 14;
                                    this.field8190[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class243.field3129[arg2];
                                    int var57 = class243.field3128[arg2];
                                    int var58 = this.field8172[var52] * var57 + 16383 - (this.field8229[var52] * var56) >> 14;
                                    this.field8229[var52] = this.field8229[var52] * var57 + (this.field8172[var52] * var56 + 16383) >> 14;
                                    this.field8172[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class243.field3129[arg3];
                                    int var60 = class243.field3128[arg3];
                                    int var61 = this.field8229[var52] * var59 + this.field8190[var52] * var60 + 16383 >> 14;
                                    this.field8229[var52] = this.field8229[var52] * var60 + 16383 - (this.field8190[var52] * var59) >> 14;
                                    this.field8190[var52] = var61;
                                }
                                this.field8190[var52] += class279.field3539;
                                this.field8172[var52] += class175.field2048;
                                this.field8229[var52] += class161.field1895;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (var32 < this.field8261.length) {
                            int[] var33 = this.field8261[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field8165 == null || (this.field8165[var35] & arg6) != 0) {
                                    int var36 = this.field8246[var35];
                                    int var37 = this.field8246[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field8185[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class243.field3129[arg4];
                                            int var41 = class243.field3128[arg4];
                                            int var42 = this.field8273[var39] * var41 + this.field8270[var39] * var40 + 16383 >> 14;
                                            this.field8270[var39] = (short) (this.field8270[var39] * var41 + 16383 - (this.field8273[var39] * var40) >> 14);
                                            this.field8273[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class243.field3129[arg2];
                                            int var44 = class243.field3128[arg2];
                                            int var45 = this.field8270[var39] * var44 + 16383 - (this.field8193[var39] * var43) >> 14;
                                            this.field8193[var39] = (short) (this.field8270[var39] * var43 + this.field8193[var39] * var44 + 16383 >> 14);
                                            this.field8270[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class243.field3129[arg3];
                                            int var47 = class243.field3128[arg3];
                                            int var48 = this.field8193[var39] * var46 + this.field8273[var39] * var47 + 16383 >> 14;
                                            this.field8193[var39] = (short) (this.field8193[var39] * var47 + 16383 - (this.field8273[var39] * var46) >> 14);
                                            this.field8273[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method3365(55);
                    return;
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class323.field4029) {
                    int var68 = arg7[0] * class279.field3539 + arg7[6] * class161.field1895 + arg7[3] * class175.field2048 + 8192 >> 14;
                    int var69 = arg7[4] * class175.field2048 + arg7[1] * class279.field3539 + (arg7[7] * class161.field1895) + 8192 >> 14;
                    int var70 = var66 + var69;
                    int var71 = arg7[8] * class161.field1895 + arg7[2] * class279.field3539 - (-(arg7[5] * class175.field2048) + -8192) >> 14;
                    int var72 = var65 + var68;
                    class175.field2048 = var70;
                    int var73 = var67 + var71;
                    class279.field3539 = var72;
                    class161.field1895 = var73;
                    class323.field4029 = false;
                }
                int[] var74 = new int[9];
                int var75 = class243.field3128[arg2];
                int var76 = class243.field3129[arg2];
                int var77 = class243.field3128[arg3];
                int var78 = class243.field3129[arg3];
                int var79 = class243.field3128[arg4];
                int var80 = class243.field3129[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[6] = -var78 * var79 + (var77 * var82) + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[7] = var78 * var80 + var77 * var81 + 8192 >> 14;
                var74[0] = var78 * var82 + var77 * var79 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[5] = -var76;
                var74[1] = -var77 * var80 + var78 * var81 + 8192 >> 14;
                int var83 = var74[1] * -class175.field2048 + var74[0] * -class279.field3539 + var74[2] * -class161.field1895 + 8192 >> 14;
                int var84 = var74[5] * -class161.field1895 + var74[3] * -class279.field3539 + var74[4] * -class175.field2048 + 8192 >> 14;
                int var85 = var74[8] * -class161.field1895 + var74[7] * -class175.field2048 + (var74[6] * -class279.field3539 - -8192) >> 14;
                int var86 = class279.field3539 + var83;
                int var87 = class175.field2048 + var84;
                int var88 = var85 + class161.field1895;
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
                int var91 = var74[1] * var66 + var74[0] * var65 + (var74[2] * var67) + 8192 >> 14;
                int var92 = var74[4] * var66 + (var74[3] * var65 + (var74[5] * var67)) + 8192 >> 14;
                int var93 = var86 + var91;
                int var94 = var74[6] * var65 + var74[8] * var67 + var74[7] * var66 + 8192 >> 14;
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
                int var99 = arg7[2] * var96 + arg7[0] * var93 + (arg7[1] * var95) + 8192 >> 14;
                int var100 = arg7[5] * var96 + arg7[4] * var95 + arg7[3] * var93 + 8192 >> 14;
                int var101 = arg7[6] * var93 + (arg7[7] * var95 + arg7[8] * var96 + 8192) >> 14;
                int var102 = var63 + var100;
                int var103 = var62 + var99;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field8261.length > var106) {
                        int[] var107 = this.field8261[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field8165 == null || (arg6 & this.field8165[var109]) != 0) {
                                int var110 = this.field8190[var109] * var97[0] + this.field8172[var109] * var97[1] + (this.field8229[var109] * var97[2]) + 8192 >> 14;
                                int var111 = this.field8190[var109] * var97[3] + this.field8172[var109] * var97[4] + (this.field8229[var109] * var97[5]) + 8192 >> 14;
                                int var112 = var103 + var110;
                                int var113 = this.field8229[var109] * var97[8] + this.field8190[var109] * var97[6] + this.field8172[var109] * var97[7] + 8192 >> 14;
                                int var114 = var102 + var111;
                                this.field8190[var109] = var112;
                                int var115 = var104 + var113;
                                this.field8172[var109] = var114;
                                this.field8229[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field8261.length) {
                        int[] var124 = this.field8261[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field8165 == null || (arg6 & this.field8165[var126]) != 0) {
                                this.field8190[var126] -= class279.field3539;
                                this.field8172[var126] -= class175.field2048;
                                this.field8229[var126] -= class161.field1895;
                                this.field8190[var126] = this.field8190[var126] * arg2 >> 7;
                                this.field8172[var126] = this.field8172[var126] * arg3 >> 7;
                                this.field8229[var126] = this.field8229[var126] * arg4 >> 7;
                                this.field8190[var126] += class279.field3539;
                                this.field8172[var126] += class175.field2048;
                                this.field8229[var126] += class161.field1895;
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
                if (class323.field4029) {
                    int var133 = arg7[3] * class175.field2048 + arg7[0] * class279.field3539 + arg7[6] * class161.field1895 + 8192 >> 14;
                    int var134 = arg7[1] * class279.field3539 + arg7[7] * class161.field1895 + (arg7[4] * class175.field2048) + 8192 >> 14;
                    int var135 = var130 + var133;
                    int var136 = var131 + var134;
                    int var137 = arg7[8] * class161.field1895 + arg7[5] * class175.field2048 + arg7[2] * class279.field3539 + 8192 >> 14;
                    class279.field3539 = var135;
                    int var138 = var132 + var137;
                    class175.field2048 = var136;
                    class323.field4029 = false;
                    class161.field1895 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class279.field3539 * var139 + 8192 >> 14;
                int var143 = -class175.field2048 * var140 + 8192 >> 14;
                int var144 = -class161.field1895 * var141 + 8192 >> 14;
                int var145 = class279.field3539 + var142;
                int var146 = class175.field2048 + var143;
                int var147 = class161.field1895 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var146 + var150;
                int var152 = var145 + var149;
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
                int var157 = arg7[0] * var152 + arg7[1] * var151 + (arg7[2] * var154) + 8192 >> 14;
                int var158 = arg7[4] * var151 + arg7[3] * var152 - (-(arg7[5] * var154) - 8192) >> 14;
                int var159 = var127 + var157;
                int var160 = arg7[8] * var154 + arg7[6] * var152 + arg7[7] * var151 + 8192 >> 14;
                int var161 = var128 + var158;
                int var162 = var129 + var160;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field8261.length > var164) {
                        int[] var165 = this.field8261[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field8165 == null || (arg6 & this.field8165[var167]) != 0) {
                                int var168 = this.field8229[var167] * var155[2] + (this.field8190[var167] * var155[0] + (this.field8172[var167] * var155[1])) + 8192 >> 14;
                                int var169 = this.field8190[var167] * var155[3] + 8192 - (-(this.field8172[var167] * var155[4]) - this.field8229[var167] * var155[5]) >> 14;
                                int var170 = var159 + var168;
                                int var171 = var161 + var169;
                                int var172 = this.field8190[var167] * var155[6] + this.field8172[var167] * var155[7] + (this.field8229[var167] * var155[8] - -8192) >> 14;
                                int var173 = var162 + var172;
                                this.field8190[var167] = var170;
                                this.field8172[var167] = var171;
                                this.field8229[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8222 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var182 = arg1[var178];
                    if (var182 < this.field8222.length) {
                        int[] var183 = this.field8222[var182];
                        for (int var184 = 0; var184 < var183.length; var184++) {
                            int var185 = var183[var184];
                            if (this.field8241 == null || (this.field8241[var185] & arg6) != 0) {
                                int var186 = (this.field8196[var185] & 0xFF) + arg2 * 8;
                                if (var186 < 0) {
                                    var186 = 0;
                                } else if (var186 > 255) {
                                    var186 = 255;
                                }
                                this.field8196[var185] = (byte) var186;
                            }
                        }
                        var177 |= var183.length > 0;
                    }
                }
                if (var177) {
                    if (this.field8214 != null) {
                        for (int var179 = 0; var179 < this.field8213; var179++) {
                            class384 var180 = this.field8214[var179];
                            class67 var181 = this.field8220[var179];
                            var181.field810 = 255 - (this.field8196[var180.field4937] & 0xFF) << 24 | var181.field810 & 0xFFFFFF;
                        }
                    }
                    this.method3366(104);
                }
            }
        } else if (arg0 == 7) {
            if (this.field8222 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var192 = arg1[var188];
                    if (this.field8222.length > var192) {
                        int[] var193 = this.field8222[var192];
                        for (int var194 = 0; var194 < var193.length; var194++) {
                            int var195 = var193[var194];
                            if (this.field8241 == null || (this.field8241[var195] & arg6) != 0) {
                                int var196 = this.field8224[var195] & 0xFFFF;
                                int var197 = (var196 & 0xFD4A) >> 10;
                                int var198 = var196 >> 7 & 0x7;
                                int var199 = var196 & 0x7F;
                                int var200 = arg3 / 4 + var198;
                                int var201 = arg2 + var197 & 0x3F;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 7) {
                                    var200 = 7;
                                }
                                int var202 = arg4 + var199;
                                if (var202 < 0) {
                                    var202 = 0;
                                } else if (var202 > 127) {
                                    var202 = 127;
                                }
                                this.field8224[var195] = (short) class364.method2113(var202, class364.method2113(var201 << 10, var200 << 7));
                            }
                        }
                        var187 |= var193.length > 0;
                    }
                }
                if (var187) {
                    if (this.field8214 != null) {
                        for (int var189 = 0; var189 < this.field8213; var189++) {
                            class384 var190 = this.field8214[var189];
                            class67 var191 = this.field8220[var189];
                            var191.field810 = class76.field999[this.field8224[var190.field4937] & 0xFFFF] & 0xFFFFFF | var191.field810 & 0xFF000000;
                        }
                    }
                    this.method3366(-105);
                }
            }
        } else if (arg0 == 8) {
            if (this.field8201 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (this.field8201.length > var204) {
                        int[] var205 = this.field8201[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            class67 var207 = this.field8220[var205[var206]];
                            var207.field813 += arg3;
                            var207.field800 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8201 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (var209 < this.field8201.length) {
                        int[] var210 = this.field8201[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            class67 var212 = this.field8220[var210[var211]];
                            var212.field814 = var212.field814 * arg3 >> 7;
                            var212.field808 = var212.field808 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8201 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (this.field8201.length > var214) {
                    int[] var215 = this.field8201[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        class67 var217 = this.field8220[var215[var216]];
                        var217.field805 = var217.field805 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()Z")
    public final boolean method2046() {
        field8208++;
        if (this.field8168 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field8168.length; var1++) {
            if (this.field8168[var1] != -1 && !this.field8162.field8781.method2717(this.field8168[var1], false)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!og", name = "AA", descriptor = "(I)V")
    public final void method2083(int arg0) {
        field8255++;
        int var2 = class243.field3129[arg0];
        int var3 = class243.field3128[arg0];
        for (int var4 = 0; var4 < this.field8171; var4++) {
            int var5 = this.field8172[var4] * var3 - this.field8229[var4] * var2 >> 14;
            this.field8229[var4] = this.field8229[var4] * var3 + this.field8172[var4] * var2 >> 14;
            this.field8172[var4] = var5;
        }
        this.method3363((byte) -5);
        this.field8178 = false;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lba;IIIZ)V")
    public final void method2057(class359 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8207++;
        class606 var6 = (class606) arg0;
        if (this.field8174 == 0 || var6.field8174 == 0) {
            return;
        }
        int var7 = var6.field8171;
        int[] var8 = var6.field8190;
        int[] var9 = var6.field8172;
        int[] var10 = var6.field8229;
        short[] var11 = var6.field8273;
        short[] var12 = var6.field8270;
        short[] var13 = var6.field8193;
        byte[] var14 = var6.field8225;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field8243 == null) {
            var17 = null;
            var16 = null;
            var18 = null;
            var15 = null;
        } else {
            var15 = this.field8243.field3943;
            var16 = this.field8243.field3937;
            var17 = this.field8243.field3940;
            var18 = this.field8243.field3939;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field8243 == null) {
            var22 = null;
            var20 = null;
            var21 = null;
            var19 = null;
        } else {
            var19 = var6.field8243.field3939;
            var20 = var6.field8243.field3937;
            var21 = var6.field8243.field3943;
            var22 = var6.field8243.field3940;
        }
        int[] var23 = var6.field8246;
        short[] var24 = var6.field8185;
        if (!var6.field8178) {
            var6.method3375((byte) 125);
        }
        int var25 = var6.field8257;
        int var26 = var6.field8260;
        int var27 = var6.field8194;
        int var28 = var6.field8160;
        int var29 = var6.field8181;
        int var30 = var6.field8197;
        for (int var31 = 0; var31 < this.field8171; var31++) {
            int var32 = this.field8172[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field8190[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field8229[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field8246[var31];
                        int var37 = this.field8246[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field8185[var38] - 1;
                            if (var35 == -1 || this.field8225[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39 + 1];
                                    int var41 = -1;
                                    int var42 = var23[var39];
                                    for (int var43 = var42; var43 < var40; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var16 == null) {
                                            this.field8243 = new class314();
                                            var16 = this.field8243.field3937 = class475.method2579(this.field8273, -28073);
                                            var17 = this.field8243.field3940 = class475.method2579(this.field8270, -28073);
                                            var15 = this.field8243.field3943 = class475.method2579(this.field8193, -28073);
                                            var18 = this.field8243.field3939 = class11.method50(this.field8225, (byte) -92);
                                        }
                                        if (var20 == null) {
                                            class314 var44 = var6.field8243 = new class314();
                                            var20 = var44.field3937 = class475.method2579(var11, -28073);
                                            var22 = var44.field3940 = class475.method2579(var12, -28073);
                                            var21 = var44.field3943 = class475.method2579(var13, -28073);
                                            var19 = var44.field3939 = class11.method50(var14, (byte) -92);
                                        }
                                        short var45 = this.field8273[var35];
                                        short var46 = this.field8270[var35];
                                        short var47 = this.field8193[var35];
                                        int var48 = var23[var39];
                                        byte var49 = this.field8225[var35];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var48; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var20[var52] += var45;
                                                var22[var52] += var46;
                                                var21[var52] += var47;
                                                var19[var52] += var49;
                                            }
                                        }
                                        short var53 = var13[var41];
                                        short var54 = var12[var41];
                                        int var55 = this.field8246[var31 + 1];
                                        byte var56 = var14[var41];
                                        short var57 = var11[var41];
                                        int var58 = this.field8246[var31];
                                        for (int var59 = var58; var59 < var55; var59++) {
                                            int var60 = this.field8185[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var16[var60] += var57;
                                                var17[var60] += var54;
                                                var15[var60] += var53;
                                                var18[var60] += var56;
                                            }
                                        }
                                        var6.method3365(55);
                                        this.method3365(55);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lq;)V")
    public final void method2067(class396 arg0) {
        field8247++;
        class581 var2 = (class581) arg0;
        if (this.field8253 != null) {
            for (int var3 = 0; var3 < this.field8253.length; var3++) {
                class556 var4 = this.field8253[var3];
                class556 var5 = var4;
                if (var4.field6959 != null) {
                    var5 = var4.field6959;
                }
                var5.field6943 = (int) ((float) this.field8229[var4.field6951] * var2.field7798 + (float) this.field8190[var4.field6951] * var2.field7781 + (float) this.field8172[var4.field6951] * var2.field7779 + var2.field7785);
                var5.field6958 = (int) ((float) this.field8229[var4.field6951] * var2.field7822 + (float) this.field8190[var4.field6951] * var2.field7812 + (float) this.field8172[var4.field6951] * var2.field7819 + var2.field7806);
                var5.field6960 = (int) ((float) this.field8229[var4.field6951] * var2.field7802 + (float) this.field8190[var4.field6951] * var2.field7788 + (float) this.field8172[var4.field6951] * var2.field7807 + var2.field7826);
                var5.field6944 = (int) ((float) this.field8229[var4.field6953] * var2.field7798 + (float) this.field8190[var4.field6953] * var2.field7781 + (float) this.field8172[var4.field6953] * var2.field7779 + var2.field7785);
                var5.field6947 = (int) ((float) this.field8229[var4.field6953] * var2.field7822 + (float) this.field8190[var4.field6953] * var2.field7812 + (float) this.field8172[var4.field6953] * var2.field7819 + var2.field7806);
                var5.field6957 = (int) ((float) this.field8229[var4.field6953] * var2.field7802 + (float) this.field8190[var4.field6953] * var2.field7788 + (float) this.field8172[var4.field6953] * var2.field7807 + var2.field7826);
                var5.field6945 = (int) ((float) this.field8229[var4.field6949] * var2.field7798 + (float) this.field8190[var4.field6949] * var2.field7781 + (float) this.field8172[var4.field6949] * var2.field7779 + var2.field7785);
                var5.field6952 = (int) ((float) this.field8229[var4.field6949] * var2.field7822 + (float) this.field8190[var4.field6949] * var2.field7812 + (float) this.field8172[var4.field6949] * var2.field7819 + var2.field7806);
                var5.field6964 = (int) ((float) this.field8229[var4.field6949] * var2.field7802 + (float) this.field8190[var4.field6949] * var2.field7788 + (float) this.field8172[var4.field6949] * var2.field7807 + var2.field7826);
            }
        }
        if (this.field8173 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field8173.length; var6++) {
            class493 var7 = this.field8173[var6];
            class493 var8 = var7;
            if (var7.field6145 != null) {
                var8 = var7.field6145;
            }
            if (var7.field6142 == null) {
                var7.field6142 = var2.method576();
            } else {
                var7.field6142.method583(var2);
            }
            var8.field6141 = (int) ((float) this.field8229[var7.field6148] * var2.field7798 + (float) this.field8190[var7.field6148] * var2.field7781 + (float) this.field8172[var7.field6148] * var2.field7779 + var2.field7785);
            var8.field6151 = (int) ((float) this.field8229[var7.field6148] * var2.field7822 + (float) this.field8190[var7.field6148] * var2.field7812 + (float) this.field8172[var7.field6148] * var2.field7819 + var2.field7806);
            var8.field6147 = (int) ((float) this.field8229[var7.field6148] * var2.field7802 + (float) this.field8190[var7.field6148] * var2.field7788 + (float) this.field8172[var7.field6148] * var2.field7807 + var2.field7826);
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lkea;IIZZ)V")
    public class606(class223 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field8178 = false;
        this.field8171 = 0;
        this.field8198 = 0;
        this.field8218 = 0;
        this.field8187 = 0;
        this.field8221 = true;
        this.field8174 = 0;
        this.field8274 = false;
        this.field8162 = arg0;
        this.field8167 = arg1;
        this.field8195 = arg2;
        this.field8274 = arg4;
        if (arg3 || class38.method244(this.field8195, false, this.field8167)) {
            this.field8164 = new class497(class20.method124(this.field8167, 23008, this.field8195));
        }
        if (arg3 || class148.method929(2048, this.field8195, this.field8167)) {
            this.field8226 = new class497(class39.method253((byte) 11, this.field8195, this.field8167));
        }
        if (arg3 || class226.method1366(this.field8195, this.field8167, (byte) -78)) {
            this.field8177 = new class497(class587.method3261(this.field8195, this.field8167, -1));
        }
        if (arg3 || class686.method3784(-1, this.field8195, this.field8167)) {
            this.field8205 = new class497(class453.method2492(this.field8195, this.field8167, (byte) -82));
        }
        if (arg3 || class42.method263(this.field8167, this.field8195, (byte) -13)) {
            this.field8206 = new class557(class211.method1237(this.field8195, (byte) 106, this.field8167));
        }
    }
}
