import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class453 extends class121 {

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    private int field6621 = 0;

    @OriginalMember(owner = "client!ph", name = "ab", descriptor = "Z")
    private boolean field6645 = true;

    @OriginalMember(owner = "client!ph", name = "Yb", descriptor = "Z")
    private boolean field6695 = false;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    private int field6622 = 0;

    @OriginalMember(owner = "client!ph", name = "Fb", descriptor = "I")
    private int field6676 = 0;

    @OriginalMember(owner = "client!ph", name = "Ub", descriptor = "I")
    private int field6691 = 0;

    @OriginalMember(owner = "client!ph", name = "cc", descriptor = "I")
    private int field6699 = 0;

    @OriginalMember(owner = "client!ph", name = "lc", descriptor = "Lqg;")
    private class321 field6708;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "Lwt;")
    private class202 field6615;

    @OriginalMember(owner = "client!ph", name = "gb", descriptor = "Lwt;")
    private class202 field6651;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "Lwt;")
    private class202 field6623;

    @OriginalMember(owner = "client!ph", name = "Hb", descriptor = "Lwt;")
    private class202 field6678;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "Lle;")
    private class200 field6625;

    @OriginalMember(owner = "client!ph", name = "Xb", descriptor = "I")
    private int field6694;

    @OriginalMember(owner = "client!ph", name = "Kb", descriptor = "I")
    private int field6681;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "[I")
    private int[] field6604;

    @OriginalMember(owner = "client!ph", name = "Pb", descriptor = "[I")
    private int[] field6686;

    @OriginalMember(owner = "client!ph", name = "bc", descriptor = "[I")
    private int[] field6698;

    @OriginalMember(owner = "client!ph", name = "Wb", descriptor = "[S")
    private short[] field6693;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "[I")
    private int[] field6605;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "[Lwq;")
    private class113[] field6620;

    @OriginalMember(owner = "client!ph", name = "W", descriptor = "[Lqr;")
    private class46[] field6641;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    private int field6614;

    @OriginalMember(owner = "client!ph", name = "hb", descriptor = "[Lnb;")
    private class196[] field6652;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "[Lbs;")
    private class481[] field6634;

    @OriginalMember(owner = "client!ph", name = "Ab", descriptor = "[S")
    private short[] field6671;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "[S")
    private short[] field6609;

    @OriginalMember(owner = "client!ph", name = "Nb", descriptor = "[S")
    private short[] field6684;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "S")
    private short field6608;

    @OriginalMember(owner = "client!ph", name = "Cb", descriptor = "[B")
    private byte[] field6673;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "[S")
    private short[] field6610;

    @OriginalMember(owner = "client!ph", name = "tb", descriptor = "[S")
    private short[] field6664;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "[S")
    private short[] field6628;

    @OriginalMember(owner = "client!ph", name = "Tb", descriptor = "[F")
    private float[] field6690;

    @OriginalMember(owner = "client!ph", name = "nb", descriptor = "[B")
    private byte[] field6658;

    @OriginalMember(owner = "client!ph", name = "sb", descriptor = "[S")
    private short[] field6663;

    @OriginalMember(owner = "client!ph", name = "Vb", descriptor = "[S")
    private short[] field6692;

    @OriginalMember(owner = "client!ph", name = "bb", descriptor = "[F")
    private float[] field6646;

    @OriginalMember(owner = "client!ph", name = "Sb", descriptor = "[S")
    private short[] field6689;

    @OriginalMember(owner = "client!ph", name = "lb", descriptor = "[S")
    private short[] field6656;

    @OriginalMember(owner = "client!ph", name = "wb", descriptor = "S")
    private short field6667;

    @OriginalMember(owner = "client!ph", name = "db", descriptor = "[I")
    private int[] field6648;

    @OriginalMember(owner = "client!ph", name = "fc", descriptor = "[[I")
    private int[][] field6702;

    @OriginalMember(owner = "client!ph", name = "ib", descriptor = "[[I")
    private int[][] field6653;

    @OriginalMember(owner = "client!ph", name = "Ib", descriptor = "[[I")
    private int[][] field6679;

    @OriginalMember(owner = "client!ph", name = "oc", descriptor = "Lao;")
    public static class188 field6711 = new class188(36, 20);

    @OriginalMember(owner = "client!ph", name = "pc", descriptor = "I")
    public static int field6712 = 0;

    @OriginalMember(owner = "client!ph", name = "sc", descriptor = "Lao;")
    public static class188 field6715 = new class188(24, 7);

    @OriginalMember(owner = "client!ph", name = "rc", descriptor = "B")
    private byte field6714;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!ph", name = "X", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!ph", name = "Z", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!ph", name = "cb", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!ph", name = "eb", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!ph", name = "fb", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!ph", name = "kb", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!ph", name = "mb", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!ph", name = "ob", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!ph", name = "qb", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!ph", name = "rb", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!ph", name = "ub", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!ph", name = "vb", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!ph", name = "xb", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!ph", name = "yb", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!ph", name = "Bb", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!ph", name = "Db", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!ph", name = "Eb", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!ph", name = "Gb", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!ph", name = "Jb", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!ph", name = "Ob", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!ph", name = "Qb", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!ph", name = "Rb", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!ph", name = "Zb", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!ph", name = "ac", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!ph", name = "dc", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!ph", name = "ec", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!ph", name = "gc", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!ph", name = "hc", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!ph", name = "ic", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!ph", name = "kc", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!ph", name = "nc", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!ph", name = "qc", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!ph", name = "jc", descriptor = "Lce;")
    private class201 field6706;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "Luv;")
    private class243 field6617;

    @OriginalMember(owner = "client!ph", name = "mc", descriptor = "Lct;")
    private class97 field6709;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "S")
    private short field6626;

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "S")
    private short field6639;

    @OriginalMember(owner = "client!ph", name = "jb", descriptor = "S")
    private short field6654;

    @OriginalMember(owner = "client!ph", name = "pb", descriptor = "S")
    private short field6660;

    @OriginalMember(owner = "client!ph", name = "zb", descriptor = "S")
    private short field6670;

    @OriginalMember(owner = "client!ph", name = "Lb", descriptor = "S")
    private short field6682;

    @OriginalMember(owner = "client!ph", name = "Mb", descriptor = "S")
    private short field6683;

    @OriginalMember(owner = "client!ph", name = "tc", descriptor = "[I")
    public static int[] field6716;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "(I)V", line = 9)
    public final void method894(int arg0) {
        this.field6694 = arg0;
        field6657++;
        this.field6645 = true;
        if (this.field6709 != null && (this.field6694 & 0x10000) == 0) {
            this.field6664 = this.field6709.field1571;
            this.field6692 = this.field6709.field1572;
            this.field6673 = this.field6709.field1577;
            this.field6610 = this.field6709.field1570;
            this.field6709 = null;
        }
        this.method2722(48);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lcd;I)V", line = 30)
    private final void method2720(class205 arg0, int arg1) {
        if (this.field6622 > class452.field6596.length) {
            class230.field3359 = new int[this.field6622];
            class452.field6596 = new int[this.field6622];
        }
        field6640++;
        for (int var3 = 0; var3 < this.field6676; var3++) {
            int var14 = (this.field6605[var3] - (this.field6698[var3] * this.field6708.field4879 >> 8) >> this.field6708.field4785) - arg0.field2954;
            int var15 = (this.field6686[var3] - (this.field6698[var3] * this.field6708.field4841 >> 8) >> this.field6708.field4785) - arg0.field2958;
            int var16 = this.field6604[var3];
            int var17 = this.field6604[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field6671[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class452.field6596[var19] = var14;
                class230.field3359[var19] = var15;
            }
        }
        if (arg1 != -2312) {
            this.method877(109);
        }
        for (int var4 = 0; var4 < this.field6691; var4++) {
            if (this.field6658 == null || this.field6658[var4] <= 128) {
                short var5 = this.field6628[var4];
                short var6 = this.field6689[var4];
                short var7 = this.field6663[var4];
                int var8 = class452.field6596[var5];
                int var9 = class452.field6596[var6];
                int var10 = class452.field6596[var7];
                int var11 = class230.field3359[var5];
                int var12 = class230.field3359[var6];
                int var13 = class230.field3359[var7];
                if (((var8 - var9) * (var12 - var13) - ((var10 - var9) * (var12 - var11))) > 0) {
                    arg0.method1371(var8, var9, true, var13, var11, var10, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "VA", descriptor = "()I", line = 118)
    public final int method908() {
        if (!this.field6695) {
            this.method2727((byte) -123);
        }
        field6611++;
        return this.field6682;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BIZ)Lc;", line = 137)
    public final class121 method881(byte arg0, int arg1, boolean arg2) {
        field6633++;
        class453 var4;
        class453 var5;
        if (arg0 == 1) {
            var4 = this.field6708.field4883;
            var5 = this.field6708.field4829;
        } else if (arg0 == 2) {
            var4 = this.field6708.field4811;
            var5 = this.field6708.field4899;
        } else if (arg0 == 3) {
            var5 = this.field6708.field4822;
            var4 = this.field6708.field4809;
        } else if (arg0 == 4) {
            var5 = this.field6708.field4907;
            var4 = this.field6708.field4861;
        } else if (arg0 == 5) {
            var4 = this.field6708.field4915;
            var5 = this.field6708.field4890;
        } else {
            var5 = var4 = new class453(this.field6708);
        }
        return this.method2731(arg0 != 0, -4467, arg1, arg2, var5, var4);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "()I", line = 186)
    public final int method918() {
        if (!this.field6695) {
            this.method2727((byte) -105);
        }
        field6687++;
        return this.field6670;
    }

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "(I)V", line = 199)
    public final void method895(int arg0) {
        field6677++;
        int var2 = class324.field4966[arg0];
        int var3 = class324.field4974[arg0];
        for (int var4 = 0; var4 < this.field6676; var4++) {
            int var5 = this.field6698[var4] * var2 + (this.field6605[var4] * var3) >> 15;
            this.field6698[var4] = this.field6698[var4] * var3 - (this.field6605[var4] * var2) >> 15;
            this.field6605[var4] = var5;
        }
        this.field6695 = false;
        if (this.field6615 != null) {
            this.field6615.field2921 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "ja", descriptor = "(III)V", line = 232)
    public final void method884(int arg0, int arg1, int arg2) {
        field6650++;
        for (int var4 = 0; var4 < this.field6676; var4++) {
            if (arg0 != 0) {
                this.field6605[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field6698[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field6686[var4] += arg2;
            }
        }
        if (this.field6615 != null) {
            this.field6615.field2921 = null;
        }
        this.field6695 = false;
    }

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "(I)V", line = 265)
    public final void method897(int arg0) {
        field6672++;
        int var2 = class324.field4966[arg0];
        int var3 = class324.field4974[arg0];
        for (int var4 = 0; var4 < this.field6676; var4++) {
            int var5 = this.field6686[var4] * var2 + this.field6605[var4] * var3 >> 15;
            this.field6686[var4] = this.field6686[var4] * var3 - this.field6605[var4] * var2 >> 15;
            this.field6605[var4] = var5;
        }
        if (this.field6615 != null) {
            this.field6615.field2921 = null;
        }
        this.field6695 = false;
    }

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "()I", line = 296)
    public final int method898() {
        field6675++;
        if (!this.field6695) {
            this.method2727((byte) -127);
        }
        return this.field6639;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 314)
    private final void method2721(byte arg0) {
        if (this.field6652 != null) {
            class408 var2 = this.field6708.field4780;
            float var3 = this.field6708.method477();
            float var4 = this.field6708.method487();
            this.field6708.method2064(1);
            this.field6708.method494(false);
            this.field6708.method2024(true, false);
            this.field6708.method2085(this.field6708.field4882, null, this.field6708.field4926, arg0 - 29071, null);
            for (int var5 = 0; var5 < this.field6614; var5++) {
                class196 var6 = this.field6652[var5];
                class481 var7 = this.field6634[var5];
                if (!var6.field2894 || !this.field6708.method529()) {
                    float var8 = (float) (this.field6605[var6.field2893] - (-this.field6605[var6.field2901] - this.field6605[var6.field2895])) * 0.3333333F;
                    float var9 = (float) (this.field6698[var6.field2901] + this.field6698[var6.field2893] + this.field6698[var6.field2895]) * 0.3333333F;
                    float var10 = (float) (this.field6686[var6.field2901] + this.field6686[var6.field2895] + this.field6686[var6.field2893]) * 0.3333333F;
                    float var11 = class72.field1208 * var10 + class254.field3672 * var9 + class249.field3585 * var8 + class55.field812;
                    float var12 = class246.field3564 * var10 + class261.field3774 * var9 + class253.field3652 * var8 + class95.field1559;
                    float var13 = class326.field5045 * var10 + class97.field1575 * var8 + class178.field2703 * var9 + class520.field7640;
                    var2.method2529(var6.field2898 * var7.field7060 >> 7, (float) var7.field7056 + var11, var6.field2902 * var7.field7062 >> 7, -var13, (float) var7.field7064 - var12, (byte) 79, var7.field7057);
                    this.field6708.method2082(false, var2);
                    this.field6708.method514(var4, var3 - (float) var6.field2900 * 1.5F);
                    int var14 = var7.field7055;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field6708.method2008(var6.field2903, 848);
                    this.field6708.method2061(var6.field2897, (byte) -47);
                    this.field6708.method2068(var6.field2899, arg0 + 13129);
                    this.field6708.method2048(-114, 4, 0, 7);
                }
            }
            this.field6708.method514(var4, var3);
            this.field6708.method494(true);
            this.field6708.method2041(-1);
        }
        if (arg0 != 5) {
            this.method2720(null, 101);
        }
        field6674++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 384)
    private final void method2722(int arg0) {
        field6613++;
        if (!this.field6645) {
            return;
        }
        this.field6645 = false;
        int var2 = -6 % ((arg0 + 61) / 47);
        if (this.field6641 == null && this.field6620 == null && this.field6652 == null) {
            if (this.field6605 != null && !class266.method1701(-2001, this.field6694, this.field6681)) {
                if (this.field6615 != null && this.field6615.field2921 == null) {
                    this.field6645 = true;
                } else {
                    if (!this.field6695) {
                        this.method2727((byte) -101);
                    }
                    this.field6605 = null;
                }
            }
            if (this.field6698 != null && !class504.method2994(458752, this.field6694, this.field6681)) {
                if (this.field6615 != null && this.field6615.field2921 == null) {
                    this.field6645 = true;
                } else {
                    if (!this.field6695) {
                        this.method2727((byte) -124);
                    }
                    this.field6698 = null;
                }
            }
            if (this.field6686 != null && !class261.method1666(-1, this.field6694, this.field6681)) {
                if (this.field6615 != null && this.field6615.field2921 == null) {
                    this.field6645 = true;
                } else {
                    if (!this.field6695) {
                        this.method2727((byte) -108);
                    }
                    this.field6686 = null;
                }
            }
        }
        if (this.field6671 != null && this.field6605 == null && this.field6698 == null && this.field6686 == null) {
            this.field6671 = null;
            this.field6604 = null;
        }
        if (this.field6673 != null && !class151.method1093(this.field6694, (byte) 82, this.field6681)) {
            if (this.field6623 == null) {
                if (this.field6678 != null && this.field6678.field2921 == null) {
                    this.field6645 = true;
                } else {
                    this.field6692 = this.field6664 = this.field6610 = null;
                    this.field6673 = null;
                }
            } else if (this.field6623.field2921 == null) {
                this.field6645 = true;
            } else {
                this.field6673 = null;
                this.field6692 = this.field6664 = this.field6610 = null;
            }
        }
        if (this.field6656 != null && !class323.method2097(this.field6694, this.field6681, 28927)) {
            if (this.field6678 != null && this.field6678.field2921 == null) {
                this.field6645 = true;
            } else {
                this.field6656 = null;
            }
        }
        if (this.field6658 != null && !class475.method2841(-112, this.field6681, this.field6694)) {
            if (this.field6678 != null && this.field6678.field2921 == null) {
                this.field6645 = true;
            } else {
                this.field6658 = null;
            }
        }
        if (this.field6690 != null && !class400.method2492((byte) 35, this.field6694, this.field6681)) {
            if (this.field6651 != null && this.field6651.field2921 == null) {
                this.field6645 = true;
            } else {
                this.field6690 = this.field6646 = null;
            }
        }
        if (this.field6609 != null && !class372.method2380(this.field6694, false, this.field6681)) {
            if (this.field6678 != null && this.field6678.field2921 == null) {
                this.field6645 = true;
            } else {
                this.field6609 = null;
            }
        }
        if (this.field6628 != null && !class245.method1570(this.field6694, this.field6681, (byte) 23)) {
            if (this.field6625 != null && this.field6625.field2913 == null || this.field6678 != null && this.field6678.field2921 == null) {
                this.field6645 = true;
            } else {
                this.field6628 = this.field6689 = this.field6663 = null;
            }
        }
        if (this.field6679 != null && !class29.method236(-21367, this.field6681, this.field6694)) {
            this.field6684 = null;
            this.field6679 = null;
        }
        if (this.field6702 != null && !class20.method172(this.field6681, this.field6694, 81)) {
            this.field6702 = null;
            this.field6693 = null;
        }
        if (this.field6653 != null && !class167.method1191(this.field6681, (byte) 126, this.field6694)) {
            this.field6653 = null;
        }
        if (this.field6648 != null && (this.field6694 & 0x800) == 0 && (this.field6694 & 0x40000) == 0) {
            this.field6648 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lc;IIIZ)V", line = 556)
    public final void method907(class121 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field6649++;
        class453 var6 = (class453) arg0;
        if (this.field6699 == 0 || var6.field6699 == 0) {
            return;
        }
        int var7 = var6.field6676;
        int[] var8 = var6.field6605;
        int[] var9 = var6.field6698;
        int[] var10 = var6.field6686;
        short[] var11 = var6.field6692;
        short[] var12 = var6.field6664;
        short[] var13 = var6.field6610;
        byte[] var14 = var6.field6673;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field6709 == null) {
            var18 = null;
            var16 = null;
            var17 = null;
            var15 = null;
        } else {
            var15 = this.field6709.field1577;
            var16 = this.field6709.field1571;
            var17 = this.field6709.field1570;
            var18 = this.field6709.field1572;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field6709 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var20 = var6.field6709.field1571;
            var21 = var6.field6709.field1572;
            var19 = var6.field6709.field1577;
            var22 = var6.field6709.field1570;
        }
        int[] var23 = var6.field6604;
        short[] var24 = var6.field6671;
        if (!var6.field6695) {
            var6.method2727((byte) -109);
        }
        short var25 = var6.field6670;
        short var26 = var6.field6639;
        short var27 = var6.field6660;
        short var28 = var6.field6682;
        short var29 = var6.field6626;
        short var30 = var6.field6654;
        for (int var31 = 0; var31 < this.field6676; var31++) {
            int var32 = this.field6698[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field6605[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field6686[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field6604[var31];
                        int var37 = this.field6604[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field6671[var38] - 1;
                            if (var35 == -1 || this.field6673[var35] != 0) {
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
                                        if (var18 == null) {
                                            this.field6709 = new class97();
                                            var18 = this.field6709.field1572 = class133.method983(this.field6692, (byte) 119);
                                            var16 = this.field6709.field1571 = class133.method983(this.field6664, (byte) 119);
                                            var17 = this.field6709.field1570 = class133.method983(this.field6610, (byte) 119);
                                            var15 = this.field6709.field1577 = class503.method2990(-25936, this.field6673);
                                        }
                                        if (var21 == null) {
                                            class97 var44 = var6.field6709 = new class97();
                                            var21 = var44.field1572 = class133.method983(var11, (byte) 119);
                                            var20 = var44.field1571 = class133.method983(var12, (byte) 119);
                                            var22 = var44.field1570 = class133.method983(var13, (byte) 119);
                                            var19 = var44.field1577 = class503.method2990(-25936, var14);
                                        }
                                        short var45 = this.field6692[var35];
                                        short var46 = this.field6664[var35];
                                        short var47 = this.field6610[var35];
                                        int var48 = var23[var39 + 1];
                                        int var49 = var23[var39];
                                        byte var50 = this.field6673[var35];
                                        for (int var51 = var49; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var21[var52] += var45;
                                                var20[var52] += var46;
                                                var22[var52] += var47;
                                                var19[var52] += var50;
                                            }
                                        }
                                        short var53 = var13[var40];
                                        byte var54 = var14[var40];
                                        int var55 = this.field6604[var31];
                                        short var56 = var11[var40];
                                        int var57 = this.field6604[var31 + 1];
                                        short var58 = var12[var40];
                                        for (int var59 = var55; var59 < var57; var59++) {
                                            int var60 = this.field6671[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var18[var60] += var56;
                                                var16[var60] += var58;
                                                var17[var60] += var53;
                                                var15[var60] += var54;
                                            }
                                        }
                                        if (this.field6623 == null && this.field6678 != null) {
                                            this.field6678.field2921 = null;
                                        }
                                        if (this.field6623 != null) {
                                            this.field6623.field2921 = null;
                                        }
                                        if (var6.field6623 == null && var6.field6678 != null) {
                                            var6.field6678.field2921 = null;
                                        }
                                        if (var6.field6623 != null) {
                                            var6.field6623.field2921 = null;
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

    @OriginalMember(owner = "client!ph", name = "YA", descriptor = "(SS)V", line = 824)
    public final void method906(short arg0, short arg1) {
        field6700++;
        class126 var3 = this.field6708.field2449;
        for (int var4 = 0; var4 < this.field6699; var4++) {
            if (this.field6609[var4] == arg0) {
                this.field6609[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class216 var7 = var3.method935(arg0 & 0xFFFF, -8037);
            var5 = var7.field3116;
            var6 = var7.field3099;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class216 var10 = var3.method935(arg1 & 0xFFFF, -8037);
            var8 = var10.field3116;
            var9 = var10.field3099;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field6652 != null) {
            for (int var11 = 0; var11 < this.field6614; var11++) {
                class196 var12 = this.field6652[var11];
                class481 var13 = this.field6634[var11];
                var13.field7055 = var13.field7055 & 0xFF000000 | class430.field6265[this.field6656[var12.field2892] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field6678 != null) {
            this.field6678.field2921 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIII)Z", line = 898)
    private final boolean method2723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = 46 / ((-arg3 - 72) / 46);
        field6619++;
        if (arg4 < arg8 && arg4 < arg7 && arg4 < arg6) {
            return false;
        } else if (arg8 < arg4 && arg4 > arg7 && arg6 < arg4) {
            return false;
        } else if (arg0 > arg1 && arg2 > arg1 && arg5 > arg1) {
            return false;
        } else {
            return arg1 <= arg0 || arg1 <= arg2 || arg5 >= arg1;
        }
    }

    @OriginalMember(owner = "client!ph", name = "ZA", descriptor = "(I)V", line = 927)
    public final void method877(int arg0) {
        this.field6667 = (short) arg0;
        if (this.field6678 != null) {
            this.field6678.field2921 = null;
        }
        field6713++;
    }

    @OriginalMember(owner = "client!ph", name = "fa", descriptor = "()I", line = 942)
    public final int method883() {
        field6710++;
        return this.field6667;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILia;Z)Z", line = 953)
    public final boolean method909(int arg0, int arg1, class413 arg2, boolean arg3) {
        field6705++;
        class408 var5 = (class408) arg2;
        class408 var6 = this.field6708.field4919;
        float var7 = var5.field6011 * var6.field6003 + var5.field6018 * var6.field6024 + var5.field5991 * var6.field6002 + var6.field6018;
        float var8 = var5.field6011 * var6.field6013 + var5.field6018 * var6.field5992 + var5.field5991 * var6.field6027 + var6.field5991;
        class178.field2703 = var5.field6000 * var6.field6015 + var5.field6027 * var6.field6000 + var5.field6002 * var6.field6021;
        class249.field3585 = var5.field6021 * var6.field6003 + var5.field6024 * var6.field6024 + var5.field5992 * var6.field6002;
        class254.field3672 = var5.field6000 * var6.field6003 + var5.field6027 * var6.field6002 + var5.field6002 * var6.field6024;
        class326.field5045 = var5.field6015 * var6.field6015 + var5.field6013 * var6.field6000 + var5.field6003 * var6.field6021;
        class261.field3774 = var5.field6000 * var6.field6013 + var5.field6027 * var6.field6027 + var5.field6002 * var6.field5992;
        class253.field3652 = var5.field6021 * var6.field6013 + var5.field6024 * var6.field5992 + var5.field5992 * var6.field6027;
        float var9 = var5.field6011 * var6.field6015 + var5.field6018 * var6.field6021 + var5.field5991 * var6.field6000 + var6.field6011;
        class72.field1208 = var5.field6015 * var6.field6003 + var5.field6013 * var6.field6002 + var5.field6003 * var6.field6024;
        class97.field1575 = var5.field6021 * var6.field6015 + var5.field6024 * var6.field6021 + var5.field5992 * var6.field6000;
        class246.field3564 = var5.field6015 * var6.field6013 + var5.field6013 * var6.field6027 + var5.field6003 * var6.field5992;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field6708.field4814;
        int var16 = this.field6708.field4922;
        if (!this.field6695) {
            this.method2727((byte) -112);
        }
        class319.field4565[0] = this.field6660;
        class224.field3260[0] = this.field6670;
        class319.field4565[1] = this.field6682;
        class405.field5957[0] = this.field6626;
        class224.field3260[1] = this.field6670;
        class405.field5957[1] = this.field6626;
        class319.field4565[2] = this.field6660;
        class224.field3260[2] = this.field6639;
        class405.field5957[2] = this.field6626;
        class319.field4565[3] = this.field6682;
        class224.field3260[3] = this.field6639;
        class319.field4565[4] = this.field6660;
        class405.field5957[3] = this.field6626;
        class224.field3260[4] = this.field6670;
        class405.field5957[4] = this.field6654;
        class319.field4565[5] = this.field6682;
        class224.field3260[5] = this.field6670;
        class319.field4565[6] = this.field6660;
        class405.field5957[5] = this.field6654;
        class224.field3260[6] = this.field6639;
        class319.field4565[7] = this.field6682;
        class405.field5957[6] = this.field6654;
        class224.field3260[7] = this.field6639;
        class405.field5957[7] = this.field6654;
        for (int var17 = 0; var17 < 8; var17++) {
            float var36 = (float) class319.field4565[var17];
            float var37 = (float) class224.field3260[var17];
            float var38 = (float) class405.field5957[var17];
            float var39 = class326.field5045 * var38 + class97.field1575 * var36 + class178.field2703 * var37 + var9;
            float var40 = class246.field3564 * var38 + class261.field3774 * var37 + class253.field3652 * var36 + var8;
            float var41 = class72.field1208 * var38 + class254.field3672 * var37 + class249.field3585 * var36 + var7;
            if ((float) this.field6708.field4871 <= var39) {
                float var42 = (float) var15 * var41 / var39 + (float) this.field6708.field4925;
                float var43 = (float) var16 * var40 / var39 + (float) this.field6708.field4833;
                if (var42 > var12) {
                    var12 = var42;
                }
                if (var42 < var11) {
                    var11 = var42;
                }
                var10 = true;
                if (var13 > var43) {
                    var13 = var43;
                }
                if (var14 < var43) {
                    var14 = var43;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && var12 > (float) arg0 && var13 < (float) arg1 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field6622 > class452.field6596.length) {
                class452.field6596 = new int[this.field6622];
                class230.field3359 = new int[this.field6622];
            }
            for (int var18 = 0; var18 < this.field6676; var18++) {
                float var20 = (float) this.field6605[var18];
                float var21 = (float) this.field6686[var18];
                float var22 = (float) this.field6698[var18];
                float var23 = class326.field5045 * var21 + class97.field1575 * var20 + class178.field2703 * var22 + var9;
                float var24 = class72.field1208 * var21 + class254.field3672 * var22 + class249.field3585 * var20 + var7;
                float var25 = class246.field3564 * var21 + class261.field3774 * var22 + class253.field3652 * var20 + var8;
                if ((float) this.field6708.field4871 <= var23) {
                    int var26 = (int) ((float) var15 * var24 / var23 + (float) this.field6708.field4925);
                    int var27 = (int) ((float) var16 * var25 / var23 + (float) this.field6708.field4833);
                    int var28 = this.field6604[var18];
                    int var29 = this.field6604[var18 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field6671[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        class452.field6596[var31] = var26;
                        class230.field3359[var31] = var27;
                    }
                } else {
                    int var32 = this.field6604[var18];
                    int var33 = this.field6604[var18 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field6671[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        class452.field6596[this.field6671[var34] - 1] = -999999;
                    }
                }
            }
            for (int var19 = 0; var19 < this.field6699; var19++) {
                if (class452.field6596[this.field6628[var19]] != -999999 && class452.field6596[this.field6689[var19]] != -999999 && class452.field6596[this.field6663[var19]] != -999999 && this.method2723(class452.field6596[this.field6628[var19]], arg0, class452.field6596[this.field6689[var19]], -127, arg1, class452.field6596[this.field6663[var19]], class230.field3359[this.field6663[var19]], class230.field3359[this.field6689[var19]], class230.field3359[this.field6628[var19]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ph", name = "ua", descriptor = "(Lj;)Lj;", line = 1160)
    public final class377 method885(class377 arg0) {
        field6697++;
        if (this.field6622 == 0) {
            return null;
        }
        if (!this.field6695) {
            this.method2727((byte) -113);
        }
        int var2;
        int var3;
        if (this.field6708.field4879 <= 0) {
            var2 = this.field6660 - (this.field6708.field4879 * this.field6670 >> 8) >> this.field6708.field4785;
            var3 = this.field6682 - (this.field6708.field4879 * this.field6639 >> 8) >> this.field6708.field4785;
        } else {
            var2 = this.field6660 - (this.field6708.field4879 * this.field6639 >> 8) >> this.field6708.field4785;
            var3 = this.field6682 - (this.field6708.field4879 * this.field6670 >> 8) >> this.field6708.field4785;
        }
        int var4;
        int var5;
        if (this.field6708.field4841 <= 0) {
            var4 = this.field6626 - (this.field6708.field4841 * this.field6670 >> 8) >> this.field6708.field4785;
            var5 = this.field6654 - (this.field6708.field4841 * this.field6639 >> 8) >> this.field6708.field4785;
        } else {
            var4 = this.field6626 - (this.field6708.field4841 * this.field6639 >> 8) >> this.field6708.field4785;
            var5 = this.field6654 - (this.field6708.field4841 * this.field6670 >> 8) >> this.field6708.field4785;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class205 var8 = (class205) arg0;
        class205 var9;
        if (var8 != null && var8.method1377(var6, (byte) -21, var7)) {
            var9 = var8;
            var8.method1376(-1);
        } else {
            var9 = new class205(this.field6708, var6, var7);
        }
        var9.method1374(var4, var3, (byte) 68, var2, var5);
        this.method2720(var9, -2312);
        return var9;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "()[Lwq;", line = 1224)
    public final class113[] method890() {
        field6630++;
        return this.field6620;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V", line = 1237)
    private final void method2724(boolean arg0, int arg1) {
        if (class317.field4541.field4326.length >= (this.field6691 * 6)) {
            class317.field4541.field4333 = 0;
        } else {
            class317.field4541 = new class382((this.field6691 + 100) * 6);
        }
        field6666++;
        if (this.field6708.field4850) {
            for (int var4 = 0; var4 < this.field6691; var4++) {
                class317.field4541.method1874(this.field6628[var4], (byte) -110);
                class317.field4541.method1874(this.field6689[var4], (byte) -110);
                class317.field4541.method1874(this.field6663[var4], (byte) -110);
            }
        } else {
            for (int var3 = 0; var3 < this.field6691; var3++) {
                class317.field4541.method1863((byte) -127, this.field6628[var3]);
                class317.field4541.method1863((byte) -123, this.field6689[var3]);
                class317.field4541.method1863((byte) -124, this.field6663[var3]);
            }
        }
        if (~class317.field4541.field4333 == arg1) {
            return;
        }
        if (arg0) {
            if (this.field6706 == null) {
                this.field6706 = this.field6708.method2012(5123, class317.field4541.field4333, true, (byte) -25, class317.field4541.field4326);
            } else {
                this.field6706.method760(class317.field4541.field4326, 5123, 123, class317.field4541.field4333);
            }
            this.field6625.field2913 = this.field6706;
        } else {
            this.field6625.field2913 = this.field6708.method2012(5123, class317.field4541.field4333, false, (byte) 110, class317.field4541.field4326);
        }
        if (!arg0) {
            this.field6645 = true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lci;I)[Lne;", line = 1296)
    public static final class207[] method2725(class312 arg0, int arg1) {
        field6632++;
        if (!arg0.method1964(-110)) {
            return new class207[0];
        }
        int var2 = 83 / ((arg1 - 2) / 45);
        class100 var3 = arg0.method1955(-16017);
        while (var3.field1604 == 0) {
            class185.method1285(108, 10L);
        }
        if (var3.field1604 == 2) {
            return new class207[0];
        }
        int[] var4 = (int[]) var3.field1608;
        class207[] var5 = new class207[var4.length >> 2];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class207 var7 = new class207();
            var5[var6] = var7;
            var7.field2973 = var4[var6 << 2];
            var7.field2975 = var4[(var6 << 2) + 1];
            var7.field2979 = var4[(var6 << 2) + 2];
            var7.field2970 = var4[(var6 << 2) + 3];
        }
        return var5;
    }

    @OriginalMember(owner = "client!ph", name = "xa", descriptor = "(I[IIIIIZ)V", line = 1338)
    public final void method905(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field6668++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = 0;
            class51.field747 = 0;
            class113.field1802 = 0;
            class511.field7547 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field6702.length > var14) {
                    int[] var15 = this.field6702[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class51.field747 += this.field6605[var17];
                        class511.field7547 += this.field6698[var17];
                        class113.field1802 += this.field6686[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class51.field747 = var11;
                class511.field7547 = var9;
                class113.field1802 = var10;
            } else {
                class511.field7547 = class511.field7547 / var12 + var9;
                class51.field747 = class51.field747 / var12 + var11;
                class113.field1802 = class113.field1802 / var12 + var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field6702.length > var22) {
                    int[] var23 = this.field6702[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field6605[var25] += var20;
                        this.field6698[var25] += var18;
                        this.field6686[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field6702.length) {
                    int[] var46 = this.field6702[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field6605[var59] -= class51.field747;
                            this.field6698[var59] -= class511.field7547;
                            this.field6686[var59] -= class113.field1802;
                            if (arg4 != 0) {
                                int var60 = class324.field4966[arg4];
                                int var61 = class324.field4974[arg4];
                                int var62 = this.field6698[var59] * var60 + this.field6605[var59] * var61 + 32767 >> 15;
                                this.field6698[var59] = this.field6698[var59] * var61 + 32767 - (this.field6605[var59] * var60) >> 15;
                                this.field6605[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class324.field4966[arg2];
                                int var64 = class324.field4974[arg2];
                                int var65 = this.field6698[var59] * var64 - (this.field6686[var59] * var63 - 32767) >> 15;
                                this.field6686[var59] = this.field6698[var59] * var63 + this.field6686[var59] * var64 + 32767 >> 15;
                                this.field6698[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class324.field4966[arg3];
                                int var67 = class324.field4974[arg3];
                                int var68 = this.field6686[var59] * var66 + this.field6605[var59] * var67 + 32767 >> 15;
                                this.field6686[var59] = this.field6686[var59] * var67 + 32767 - (this.field6605[var59] * var66) >> 15;
                                this.field6605[var59] = var68;
                            }
                            this.field6605[var59] += class51.field747;
                            this.field6698[var59] += class511.field7547;
                            this.field6686[var59] += class113.field1802;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field6605[var48] -= class51.field747;
                            this.field6698[var48] -= class511.field7547;
                            this.field6686[var48] -= class113.field1802;
                            if (arg2 != 0) {
                                int var49 = class324.field4966[arg2];
                                int var50 = class324.field4974[arg2];
                                int var51 = this.field6698[var48] * var50 + 32767 - (this.field6686[var48] * var49) >> 15;
                                this.field6686[var48] = this.field6698[var48] * var49 + this.field6686[var48] * var50 + 32767 >> 15;
                                this.field6698[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class324.field4966[arg4];
                                int var53 = class324.field4974[arg4];
                                int var54 = this.field6605[var48] * var53 + (this.field6698[var48] * var52 + 32767) >> 15;
                                this.field6698[var48] = this.field6698[var48] * var53 + 32767 - (this.field6605[var48] * var52) >> 15;
                                this.field6605[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class324.field4966[arg3];
                                int var56 = class324.field4974[arg3];
                                int var57 = this.field6686[var48] * var55 + (this.field6605[var48] * var56 + 32767) >> 15;
                                this.field6686[var48] = this.field6686[var48] * var56 + 32767 - this.field6605[var48] * var55 >> 15;
                                this.field6605[var48] = var57;
                            }
                            this.field6605[var48] += class51.field747;
                            this.field6698[var48] += class511.field7547;
                            this.field6686[var48] += class113.field1802;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field6702.length) {
                        int[] var29 = this.field6702[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field6604[var31];
                            int var33 = this.field6604[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field6671[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class324.field4966[arg4];
                                    int var37 = class324.field4974[arg4];
                                    int var38 = this.field6692[var35] * var37 + this.field6664[var35] * var36 + 32767 >> 15;
                                    this.field6664[var35] = (short) (this.field6664[var35] * var37 + 32767 - (this.field6692[var35] * var36) >> 15);
                                    this.field6692[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class324.field4966[arg2];
                                    int var40 = class324.field4974[arg2];
                                    int var41 = this.field6664[var35] * var40 + 32767 - (this.field6610[var35] * var39) >> 15;
                                    this.field6610[var35] = (short) (this.field6664[var35] * var39 + this.field6610[var35] * var40 + 32767 >> 15);
                                    this.field6664[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class324.field4966[arg3];
                                    int var43 = class324.field4974[arg3];
                                    int var44 = this.field6692[var35] * var43 + this.field6610[var35] * var42 + 32767 >> 15;
                                    this.field6610[var35] = (short) (this.field6610[var35] * var43 + 32767 - (this.field6692[var35] * var42) >> 15);
                                    this.field6692[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field6623 == null && this.field6678 != null) {
                    this.field6678.field2921 = null;
                }
                if (this.field6623 != null) {
                    this.field6623.field2921 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field6702.length > var70) {
                    int[] var71 = this.field6702[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field6605[var73] -= class51.field747;
                        this.field6698[var73] -= class511.field7547;
                        this.field6686[var73] -= class113.field1802;
                        this.field6605[var73] = this.field6605[var73] * arg2 >> 7;
                        this.field6698[var73] = this.field6698[var73] * arg3 >> 7;
                        this.field6686[var73] = this.field6686[var73] * arg4 >> 7;
                        this.field6605[var73] += class51.field747;
                        this.field6698[var73] += class511.field7547;
                        this.field6686[var73] += class113.field1802;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6679 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field6679.length > var78) {
                        int[] var79 = this.field6679[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field6658[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field6658[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field6678 != null) {
                            this.field6678.field2921 = null;
                        }
                    }
                }
                if (this.field6652 != null) {
                    for (int var75 = 0; var75 < this.field6614; var75++) {
                        class196 var76 = this.field6652[var75];
                        class481 var77 = this.field6634[var75];
                        var77.field7055 = 255 - (this.field6658[var76.field2892] & 0xFF) << 24 | var77.field7055 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6679 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field6679.length) {
                        int[] var88 = this.field6679[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field6656[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFEAE) >> 10;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = var91 & 0x7F;
                            int var95 = var92 + arg2 & 0x3F;
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
                            this.field6656[var90] = (short) class29.method239(var97, class29.method239(var95 << 10, var96 << 7));
                        }
                        if (var88.length > 0 && this.field6678 != null) {
                            this.field6678.field2921 = null;
                        }
                    }
                }
                if (this.field6652 != null) {
                    for (int var84 = 0; var84 < this.field6614; var84++) {
                        class196 var85 = this.field6652[var84];
                        class481 var86 = this.field6634[var84];
                        var86.field7055 = var86.field7055 & 0xFF000000 | class430.field6265[this.field6656[var85.field2892] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field6653 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field6653.length > var99) {
                        int[] var100 = this.field6653[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class481 var102 = this.field6634[var100[var101]];
                            var102.field7064 += arg3;
                            var102.field7056 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field6653 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field6653.length > var104) {
                        int[] var105 = this.field6653[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class481 var107 = this.field6634[var105[var106]];
                            var107.field7060 = var107.field7060 * arg3 >> 7;
                            var107.field7062 = var107.field7062 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field6653 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field6653.length) {
                    int[] var110 = this.field6653[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class481 var112 = this.field6634[var110[var111]];
                        var112.field7057 = var112.field7057 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "W", descriptor = "()V", line = 1989)
    public final void method874() {
        field6703++;
        for (int var1 = 0; var1 < this.field6621; var1++) {
            this.field6605[var1] = this.field6605[var1] + 7 >> 4;
            this.field6698[var1] = this.field6698[var1] + 7 >> 4;
            this.field6686[var1] = this.field6686[var1] + 7 >> 4;
        }
        this.field6695 = false;
        if (this.field6615 != null) {
            this.field6615.field2921 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "X", descriptor = "()I", line = 2015)
    public final int method888() {
        if (!this.field6695) {
            this.method2727((byte) -122);
        }
        field6701++;
        return this.field6626;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lqg;)V", line = 5597)
    public class453(class321 arg0) {
        this.field6708 = arg0;
        this.field6615 = new class202(null, 5126, 3, 0);
        this.field6651 = new class202(null, 5126, 2, 0);
        this.field6623 = new class202(null, 5126, 3, 0);
        this.field6678 = new class202(null, 5121, 4, 0);
        this.field6625 = new class200();
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lqg;Llo;IIII)V", line = 5609)
    public class453(class321 arg0, class527 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6694 = arg2;
        this.field6681 = arg5;
        this.field6708 = arg0;
        if (class402.method2503(arg5, arg2, -113)) {
            this.field6615 = new class202(null, 5126, 3, 0);
        }
        if (class390.method2445(arg5, -5, arg2)) {
            this.field6651 = new class202(null, 5126, 2, 0);
        }
        if (class256.method1624(arg5, arg2, 2)) {
            this.field6623 = new class202(null, 5126, 3, 0);
        }
        if (class465.method2774(5966, arg2, arg5)) {
            this.field6678 = new class202(null, 5121, 4, 0);
        }
        if (class398.method2484(arg5, arg2, 115)) {
            this.field6625 = new class200();
        }
        class126 var7 = arg0.field2449;
        int[] var8 = new int[arg1.field7738];
        this.field6604 = new int[arg1.field7778 + 1];
        for (int var9 = 0; var9 < arg1.field7738; var9++) {
            if ((arg1.field7779 == null || arg1.field7779[var9] != 2) && (arg1.field7783 == null || arg1.field7783[var9] == -1 || !var7.method935(arg1.field7783[var9] & 0xFFFF, -8037).field3097)) {
                var8[this.field6699++] = var9;
                this.field6604[arg1.field7752[var9]]++;
                this.field6604[arg1.field7743[var9]]++;
                this.field6604[arg1.field7777[var9]]++;
            }
        }
        this.field6691 = this.field6699;
        long[] var10 = new long[this.field6699];
        boolean var11 = (this.field6694 & 0x100) != 0;
        label492: for (int var12 = 0; var12 < this.field6699; var12++) {
            int var180 = var8[var12];
            class216 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field7790 != null) {
                for (int var186 = 0; var186 < arg1.field7790.length; var186++) {
                    class146 var187 = arg1.field7790[var186];
                    if (var187.field2150 == var180) {
                        class282 var188 = class481.method2872((byte) -67, var187.field2154);
                        if (var188.field4102) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field6691--;
                            continue label492;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field7783 != null) {
                var189 = arg1.field7783[var180];
                if (var189 != -1) {
                    var181 = var7.method935(var189 & 0xFFFF, -8037);
                    var184 = var181.field3109;
                    var185 = var181.field3118;
                }
            }
            boolean var190 = arg1.field7773 != null && arg1.field7773[var180] != 0 || var181 != null && !var181.field3095;
            if ((var11 || var190) && arg1.field7763 != null) {
                var182 += arg1.field7763[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = (var189 & 0xFFFF << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + (long) var194;
        }
        class169.method1202(var10, var8, (byte) -97);
        this.field6676 = arg1.field7778;
        this.field6686 = arg1.field7787;
        this.field6621 = arg1.field7749;
        this.field6698 = arg1.field7774;
        this.field6693 = arg1.field7782;
        this.field6605 = arg1.field7761;
        this.field6620 = arg1.field7781;
        class83[] var13 = new class83[this.field6676];
        this.field6641 = arg1.field7745;
        if (arg1.field7790 != null) {
            this.field6614 = arg1.field7790.length;
            this.field6652 = new class196[this.field6614];
            this.field6634 = new class481[this.field6614];
            for (int var14 = 0; var14 < this.field6614; var14++) {
                class146 var15 = arg1.field7790[var14];
                class282 var16 = class481.method2872((byte) -114, var15.field2154);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field6699; var18++) {
                    if (var8[var18] == var15.field2150) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class430.field6265[arg1.field7741[var15.field2150] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field7773 == null ? 0 : arg1.field7773[var15.field2150]) << 24;
                this.field6652[var14] = new class196(var17, arg1.field7752[var15.field2150], arg1.field7743[var15.field2150], arg1.field7777[var15.field2150], var16.field4099, var16.field4098, var16.field4092, var16.field4094, var16.field4101, var16.field4102, var16.field4100, var15.field2153);
                this.field6634[var14] = new class481(var20);
            }
        }
        int var21 = this.field6699 * 3;
        this.field6671 = new short[var21];
        this.field6609 = new short[this.field6699];
        if (arg1.field7739 != null) {
            this.field6684 = new short[this.field6699];
        }
        this.field6608 = (short) arg4;
        this.field6673 = new byte[var21];
        this.field6610 = new short[var21];
        class507.field7422 = new long[var21];
        this.field6664 = new short[var21];
        this.field6628 = new short[this.field6699];
        this.field6690 = new float[var21];
        this.field6658 = new byte[this.field6699];
        this.field6663 = new short[this.field6699];
        this.field6692 = new short[var21];
        this.field6646 = new float[var21];
        this.field6689 = new short[this.field6699];
        this.field6656 = new short[this.field6699];
        this.field6667 = (short) arg3;
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field7778; var23++) {
            int var179 = this.field6604[var23];
            this.field6604[var23] = var22;
            var22 += var179;
            var13[var23] = new class83();
        }
        this.field6604[arg1.field7778] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field7766 != null) {
            int var28 = arg1.field7772;
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
            var25 = new int[var28];
            var24 = new int[var28];
            var27 = new float[var28][];
            for (int var36 = 0; var36 < this.field6699; var36++) {
                int var43 = var8[var36];
                if (arg1.field7766[var43] != -1) {
                    int var44 = arg1.field7766[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field7752[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field7743[var43];
                        } else {
                            var46 = arg1.field7777[var43];
                        }
                        int var47 = arg1.field7761[var46];
                        int var48 = arg1.field7774[var46];
                        int var49 = arg1.field7787[var46];
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
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var26 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field7776[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field7750[var37];
                        var40 = 64.0F / (float) arg1.field7784[var37];
                        if (var42 == 0) {
                            var41 = 1.0F;
                            var39 = 1.0F;
                        } else if (var42 <= 0) {
                            var41 = 1.0F;
                            var39 = (float) (-var42) / 1024.0F;
                        } else {
                            var39 = 1.0F;
                            var41 = (float) var42 / 1024.0F;
                        }
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field7750[var37];
                        var40 = 64.0F / (float) arg1.field7784[var37];
                        var41 = 64.0F / (float) arg1.field7747[var37];
                    } else {
                        var39 = (float) arg1.field7750[var37] / 1024.0F;
                        var40 = (float) arg1.field7784[var37] / 1024.0F;
                        var41 = (float) arg1.field7747[var37] / 1024.0F;
                    }
                    var27[var37] = class4.method37(arg1.field7744[var37], arg1.field7770[var37], var39, class388.method2441(arg1.field7785[var37], 255), var40, var41, 122, arg1.field7756[var37]);
                }
            }
        }
        class245[] var50 = new class245[arg1.field7738];
        for (int var51 = 0; var51 < arg1.field7738; var51++) {
            short var158 = arg1.field7752[var51];
            short var159 = arg1.field7743[var51];
            short var160 = arg1.field7777[var51];
            int var161 = this.field6605[var159] - this.field6605[var158];
            int var162 = this.field6698[var159] - this.field6698[var158];
            int var163 = this.field6686[var159] - this.field6686[var158];
            int var164 = this.field6605[var160] - this.field6605[var158];
            int var165 = this.field6698[var160] - this.field6698[var158];
            int var166 = this.field6686[var160] - this.field6686[var158];
            int var167 = var162 * var166 - var163 * var165;
            int var168 = var163 * var164 - (var161 * var166);
            int var169;
            for (var169 = var161 * var165 - (var162 * var164); var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192; var169 >>= 0x1) {
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + var167 * var167 + var168 * var168));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var168 * 256 / var170;
            int var172 = var167 * 256 / var170;
            int var173 = var169 * 256 / var170;
            byte var174 = arg1.field7779 == null ? 0 : arg1.field7779[var51];
            if (var174 == 0) {
                class83 var176 = var13[var158];
                var176.field1359 += var172;
                var176.field1362++;
                var176.field1360 += var173;
                var176.field1365 += var171;
                class83 var177 = var13[var159];
                var177.field1359 += var172;
                var177.field1360 += var173;
                var177.field1365 += var171;
                var177.field1362++;
                class83 var178 = var13[var160];
                var178.field1360 += var173;
                var178.field1365 += var171;
                var178.field1362++;
                var178.field1359 += var172;
            } else if (var174 == 1) {
                class245 var175 = var50[var51] = new class245();
                var175.field3535 = var171;
                var175.field3531 = var173;
                var175.field3533 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field6699; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field7741[var68] & 0xFFFF;
            short var70;
            if (arg1.field7783 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field7783[var68];
            }
            int var71;
            if (arg1.field7766 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field7766[var68];
            }
            int var72;
            if (arg1.field7773 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field7773[var68] & 0xFF;
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
                    var79 = 1;
                    var76 = 1.0F;
                    var74 = 1.0F;
                    var80 = 2;
                    var75 = 1.0F;
                    var77 = 0.0F;
                    var73 = 0.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field7776[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field7752[var68];
                        short var112 = arg1.field7743[var68];
                        short var113 = arg1.field7777[var68];
                        short var114 = arg1.field7756[var71];
                        short var115 = arg1.field7744[var71];
                        short var116 = arg1.field7770[var71];
                        float var117 = (float) arg1.field7761[var114];
                        float var118 = (float) arg1.field7774[var114];
                        float var119 = (float) arg1.field7787[var114];
                        float var120 = (float) arg1.field7761[var115] - var117;
                        float var121 = (float) arg1.field7774[var115] - var118;
                        float var122 = (float) arg1.field7787[var115] - var119;
                        float var123 = (float) arg1.field7761[var116] - var117;
                        float var124 = (float) arg1.field7774[var116] - var118;
                        float var125 = (float) arg1.field7787[var116] - var119;
                        float var126 = (float) arg1.field7761[var111] - var117;
                        float var127 = (float) arg1.field7774[var111] - var118;
                        float var128 = (float) arg1.field7787[var111] - var119;
                        float var129 = (float) arg1.field7761[var112] - var117;
                        float var130 = (float) arg1.field7774[var112] - var118;
                        float var131 = (float) arg1.field7787[var112] - var119;
                        float var132 = (float) arg1.field7761[var113] - var117;
                        float var133 = (float) arg1.field7774[var113] - var118;
                        float var134 = (float) arg1.field7787[var113] - var119;
                        float var135 = var121 * var125 - (var122 * var124);
                        float var136 = var122 * var123 - var120 * var125;
                        float var137 = var120 * var124 - var121 * var123;
                        float var138 = var124 * var137 - var125 * var136;
                        float var139 = var125 * var135 - var123 * var137;
                        float var140 = var123 * var136 - var124 * var135;
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        float var142 = var121 * var137 - (var122 * var136);
                        float var143 = var122 * var135 - (var120 * var137);
                        float var144 = var120 * var136 - (var121 * var135);
                        float var145 = 1.0F / (var125 * var144 + var123 * var142 + var124 * var143);
                        var78 = (var134 * var144 + var132 * var142 + var133 * var143) * var145;
                        var74 = (var128 * var144 + var126 * var142 + var127 * var143) * var145;
                        var76 = (var131 * var144 + var129 * var142 + var130 * var143) * var145;
                    } else {
                        short var83 = arg1.field7752[var68];
                        short var84 = arg1.field7743[var68];
                        short var85 = arg1.field7777[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field7755[var71];
                        float var91 = (float) arg1.field7746[var71] / 256.0F;
                        if (var82 == 1) {
                            float var109 = (float) arg1.field7747[var71] / 1024.0F;
                            class84.method684(var88, var90, arg1.field7787[var83], var86, var87, -13106, arg1.field7774[var83], var89, var91, arg1.field7761[var83], var109);
                            var73 = class66.field1154;
                            var74 = class96.field1567;
                            class84.method684(var88, var90, arg1.field7787[var84], var86, var87, -13106, arg1.field7774[var84], var89, var91, arg1.field7761[var84], var109);
                            var75 = class66.field1154;
                            var76 = class96.field1567;
                            class84.method684(var88, var90, arg1.field7787[var85], var86, var87, -13106, arg1.field7774[var85], var89, var91, arg1.field7761[var85], var109);
                            var78 = class96.field1567;
                            var77 = class66.field1154;
                            float var110 = var109 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if (var110 < var75 - var73) {
                                    var79 = 1;
                                    var75 -= var109;
                                } else if (var73 - var75 > var110) {
                                    var75 += var109;
                                    var79 = 2;
                                }
                                if ((var77 - var73 > var110)) {
                                    var80 = 1;
                                    var77 -= var109;
                                } else if (var73 - var77 > var110) {
                                    var80 = 2;
                                    var77 += var109;
                                }
                            } else {
                                if (var110 < var78 - var74) {
                                    var80 = 1;
                                    var78 -= var109;
                                } else if (var74 - var78 > var110) {
                                    var80 = 2;
                                    var78 += var109;
                                }
                                if (var76 - var74 > var110) {
                                    var76 -= var109;
                                    var79 = 1;
                                } else if (var74 - var76 > var110) {
                                    var79 = 2;
                                    var76 += var109;
                                }
                            }
                        } else if (var82 == 2) {
                            float var92 = (float) arg1.field7748[var71] / 256.0F;
                            float var93 = (float) arg1.field7757[var71] / 256.0F;
                            int var94 = arg1.field7761[var84] - arg1.field7761[var83];
                            int var95 = arg1.field7774[var84] - arg1.field7774[var83];
                            int var96 = arg1.field7787[var84] - arg1.field7787[var83];
                            int var97 = arg1.field7761[var85] - arg1.field7761[var83];
                            int var98 = arg1.field7774[var85] - arg1.field7774[var83];
                            int var99 = arg1.field7787[var85] - arg1.field7787[var83];
                            int var100 = var95 * var99 - (var96 * var98);
                            int var101 = var96 * var97 - (var94 * var99);
                            int var102 = var94 * var98 - (var95 * var97);
                            float var103 = 64.0F / (float) arg1.field7750[var71];
                            float var104 = 64.0F / (float) arg1.field7784[var71];
                            float var105 = 64.0F / (float) arg1.field7747[var71];
                            float var106 = (var89[2] * (float) var102 + var89[1] * (float) var101 + var89[0] * (float) var100) / var103;
                            float var107 = (var89[5] * (float) var102 + var89[4] * (float) var101 + var89[3] * (float) var100) / var104;
                            float var108 = (var89[8] * (float) var102 + var89[6] * (float) var100 + var89[7] * (float) var101) / var105;
                            var81 = class485.method2897(var107, var108, 0, var106);
                            class303.method1893(var87, var81, -119, var93, var92, arg1.field7774[var83], var90, var91, arg1.field7787[var83], var86, arg1.field7761[var83], var89, var88);
                            var73 = class411.field6048;
                            var74 = class292.field4187;
                            class303.method1893(var87, var81, -91, var93, var92, arg1.field7774[var84], var90, var91, arg1.field7787[var84], var86, arg1.field7761[var84], var89, var88);
                            var76 = class292.field4187;
                            var75 = class411.field6048;
                            class303.method1893(var87, var81, -81, var93, var92, arg1.field7774[var85], var90, var91, arg1.field7787[var85], var86, arg1.field7761[var85], var89, var88);
                            var78 = class292.field4187;
                            var77 = class411.field6048;
                        } else if (var82 == 3) {
                            class187.method1294(arg1.field7761[var83], var87, var89, var86, var90, var91, 79, var88, arg1.field7787[var83], arg1.field7774[var83]);
                            var74 = class51.field749;
                            var73 = class472.field6960;
                            class187.method1294(arg1.field7761[var84], var87, var89, var86, var90, var91, 49, var88, arg1.field7787[var84], arg1.field7774[var84]);
                            var75 = class472.field6960;
                            var76 = class51.field749;
                            class187.method1294(arg1.field7761[var85], var87, var89, var86, var90, var91, 71, var88, arg1.field7787[var85], arg1.field7774[var85]);
                            var78 = class51.field749;
                            var77 = class472.field6960;
                            if ((var90 & 0x1) == 0) {
                                if ((var75 - var73 > 0.5F)) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                                if (var77 - var73 > 0.5F) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                            } else {
                                if ((var76 - var74 > 0.5F)) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                                if (var78 - var74 > 0.5F) {
                                    var78--;
                                    var80 = 1;
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
            if (arg1.field7779 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field7779[var68];
            }
            if (var146 == 0) {
                long var147 = (long) (var71 << 2) + ((long) (var69 << 8) + (long) var72 + (long) (var81 << 24) << 32);
                short var149 = arg1.field7752[var68];
                short var150 = arg1.field7743[var68];
                short var151 = arg1.field7777[var68];
                class83 var152 = var13[var149];
                this.field6628[var52] = this.method2733(var152.field1360, var73, arg1, var152.field1365, var152.field1359, var74, var152.field1362, -32216, var149, var147);
                class83 var153 = var13[var150];
                this.field6689[var52] = this.method2733(var153.field1360, var75, arg1, var153.field1365, var153.field1359, var76, var153.field1362, -32216, var150, (long) var79 + var147);
                class83 var154 = var13[var151];
                this.field6663[var52] = this.method2733(var154.field1360, var77, arg1, var154.field1365, var154.field1359, var78, var154.field1362, -32216, var151, (long) var80 + var147);
            } else if (var146 == 1) {
                class245 var155 = var50[var68];
                long var156 = (long) ((var155.field3531 + 256 << 22) + (var71 << 2) + (var155.field3533 <= 0 ? 2048 : 1024) + (var155.field3535 + 256 << 12)) + ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32);
                this.field6628[var52] = this.method2733(var155.field3531, var73, arg1, var155.field3535, var155.field3533, var74, 0, -32216, arg1.field7752[var68], var156);
                this.field6689[var52] = this.method2733(var155.field3531, var75, arg1, var155.field3535, var155.field3533, var76, 0, -32216, arg1.field7743[var68], (long) var79 + var156);
                this.field6663[var52] = this.method2733(var155.field3531, var77, arg1, var155.field3535, var155.field3533, var78, 0, -32216, arg1.field7777[var68], (long) var80 + var156);
            }
            if (arg1.field7783 == null) {
                this.field6609[var52] = -1;
            } else {
                this.field6609[var52] = arg1.field7783[var68];
            }
            if (arg1.field7773 != null) {
                this.field6658[var52] = arg1.field7773[var68];
            }
            if (arg1.field7739 != null) {
                this.field6684[var52] = arg1.field7739[var68];
            }
            this.field6656[var52] = arg1.field7741[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field6691; var55++) {
            short var67 = this.field6609[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field6648 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field6691; var58++) {
            short var66 = this.field6609[var58];
            if (var57 != var66) {
                var57 = var66;
                this.field6648[var56++] = var58;
            }
        }
        this.field6648[var56] = this.field6691;
        class507.field7422 = null;
        this.field6692 = class308.method1933((byte) 109, this.field6692, this.field6622);
        this.field6664 = class308.method1933((byte) 107, this.field6664, this.field6622);
        this.field6610 = class308.method1933((byte) 39, this.field6610, this.field6622);
        this.field6673 = class524.method3098(-122, this.field6622, this.field6673);
        this.field6690 = class169.method1198(this.field6622, this.field6690, (byte) -125);
        this.field6646 = class169.method1198(this.field6622, this.field6646, (byte) -112);
        if (arg1.field7780 != null && class20.method172(this.field6681, arg2, 91)) {
            this.field6702 = arg1.method3116((byte) 65);
        }
        if (arg1.field7790 != null && class167.method1191(this.field6681, (byte) 127, arg2)) {
            this.field6653 = arg1.method3120(2091);
        }
        if (arg1.field7792 != null && class29.method236(-21367, this.field6681, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field6699; var61++) {
                int var65 = arg1.field7792[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var65 > var59) {
                        var59 = var65;
                    }
                }
            }
            this.field6679 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field6679[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field6699; var63++) {
                int var64 = arg1.field7792[var8[var63]];
                if (var64 >= 0) {
                    this.field6679[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBISI)I", line = 2033)
    private final int method2726(int arg0, byte arg1, int arg2, short arg3, int arg4) {
        field6606++;
        int var6 = class430.field6265[class452.method2718(arg0, arg2, (byte) -63)];
        if (arg4 != 256) {
            this.method2722(84);
        }
        if (arg3 != -1) {
            class216 var7 = this.field6708.field2449.method935(arg3 & 0xFFFF, -8037);
            int var8 = var7.field3116 & 0xFF;
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
            int var12 = var7.field3099 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
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
                var6 = (var15 >> 8) + (var13 << 8 & 0xFF0049) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V", line = 2110)
    private final void method2727(byte arg0) {
        field6642++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        if (arg0 >= -92) {
            this.field6708 = null;
        }
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field6676; var10++) {
            int var11 = this.field6605[var10];
            int var12 = this.field6698[var10];
            if (var6 < var12) {
                var6 = var12;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var3 > var12) {
                var3 = var12;
            }
            int var13 = this.field6686[var10];
            if (var2 > var11) {
                var2 = var11;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var11 * var11 + (var13 * var13) + (var12 * var12);
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field6660 = (short) var2;
        this.field6682 = (short) var5;
        this.field6626 = (short) var4;
        this.field6654 = (short) var7;
        this.field6639 = (short) var6;
        this.field6670 = (short) var3;
        this.field6683 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field6695 = true;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZZ)V", line = 2194)
    private final void method2728(boolean arg0, boolean arg1) {
        field6637++;
        boolean var3 = this.field6678 != null && this.field6678.field2921 == null;
        boolean var4 = this.field6623 != null && this.field6623.field2921 == null;
        boolean var5 = this.field6615 != null && this.field6615.field2921 == null;
        boolean var6 = this.field6651 != null && this.field6651.field2921 == null;
        if (arg1) {
            var3 &= (this.field6714 & 0x2) != 0;
            var6 &= (this.field6714 & 0x8) != 0;
            var5 &= (this.field6714 & 0x1) != 0;
            var4 &= (this.field6714 & 0x4) != 0;
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
        if (arg0) {
            this.method884(117, 36, 19);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field6622 * var7 <= class317.field4541.field4326.length) {
            class317.field4541.field4333 = 0;
        } else {
            class317.field4541 = new class382((this.field6622 + 100) * var7);
        }
        if (var5) {
            if (this.field6708.field4850) {
                for (int var20 = 0; var20 < this.field6676; var20++) {
                    int var21 = NativeStream.floatToRawIntBits((float) this.field6605[var20]);
                    int var22 = NativeStream.floatToRawIntBits((float) this.field6698[var20]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field6686[var20]);
                    int var24 = this.field6604[var20];
                    int var25 = this.field6604[var20 + 1];
                    for (int var26 = var24; var26 < var25; var26++) {
                        int var27 = this.field6671[var26] - 1;
                        if (var27 == -1) {
                            break;
                        }
                        class317.field4541.field4333 = var7 * var27;
                        class317.field4541.method1892(397825512, var21);
                        class317.field4541.method1892(397825512, var22);
                        class317.field4541.method1892(397825512, var23);
                    }
                }
            } else {
                for (int var12 = 0; var12 < this.field6676; var12++) {
                    int var13 = NativeStream.floatToRawIntBits((float) this.field6605[var12]);
                    int var14 = NativeStream.floatToRawIntBits((float) this.field6698[var12]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field6686[var12]);
                    int var16 = this.field6604[var12];
                    int var17 = this.field6604[var12 + 1];
                    for (int var18 = var16; var18 < var17; var18++) {
                        int var19 = this.field6671[var18] - 1;
                        if (var19 == -1) {
                            break;
                        }
                        class317.field4541.field4333 = var7 * var19;
                        class317.field4541.method1885(var13, -126);
                        class317.field4541.method1885(var14, -128);
                        class317.field4541.method1885(var15, -124);
                    }
                }
            }
        }
        if (var3) {
            if (this.field6623 == null) {
                byte[] var28;
                short[] var29;
                short[] var30;
                short[] var31;
                if (this.field6709 == null) {
                    var30 = this.field6692;
                    var29 = this.field6664;
                    var28 = this.field6673;
                    var31 = this.field6610;
                } else {
                    var28 = this.field6709.field1577;
                    var29 = this.field6709.field1571;
                    var30 = this.field6709.field1572;
                    var31 = this.field6709.field1570;
                }
                float var32 = this.field6708.field4859[0];
                float var33 = this.field6708.field4859[1];
                float var34 = this.field6708.field4859[2];
                float var35 = this.field6708.field4875;
                float var36 = this.field6708.field4821 * 768.0F / (float) this.field6608;
                float var37 = this.field6708.field4889 * 768.0F / (float) this.field6608;
                for (int var38 = 0; var38 < this.field6699; var38++) {
                    int var39 = this.method2726(this.field6656[var38], this.field6658[var38], this.field6667, this.field6609[var38], 256);
                    short var40 = this.field6628[var38];
                    float var41 = (float) (var39 >>> 24) * this.field6708.field4825;
                    float var42 = (float) (var39 >> 16 & 0xFF) * this.field6708.field4892;
                    float var43 = (float) ((var39 & 0xFF4A) >> 8) * this.field6708.field4838;
                    short var44 = (short) var28[var40];
                    float var45;
                    if (var44 == 0) {
                        var45 = ((float) var31[var40] * var34 + (float) var29[var40] * var33 + (float) var30[var40] * var32) * 0.0026041667F;
                    } else {
                        var45 = ((float) var31[var40] * var34 + (float) var29[var40] * var33 + (float) var30[var40] * var32) / (float) (var44 * 256);
                    }
                    float var46 = var35 + var45 * (var45 < 0.0F ? var37 : var36);
                    int var47 = (int) (var41 * var46);
                    int var48 = (int) (var42 * var46);
                    if (var47 < 0) {
                        var47 = 0;
                    } else if (var47 > 255) {
                        var47 = 255;
                    }
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var43 * var46);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    class317.field4541.field4333 = var7 * var40 + var9;
                    class317.field4541.method1923((byte) 62, var47);
                    class317.field4541.method1923((byte) 62, var48);
                    class317.field4541.method1923((byte) 62, var49);
                    class317.field4541.method1923((byte) 62, 255 - (this.field6658[var38] & 0xFF));
                    short var50 = this.field6689[var38];
                    short var51 = (short) var28[var50];
                    float var52;
                    if (var51 == 0) {
                        var52 = ((float) var31[var50] * var34 + (float) var29[var50] * var33 + (float) var30[var50] * var32) * 0.0026041667F;
                    } else {
                        var52 = ((float) var31[var50] * var34 + (float) var29[var50] * var33 + (float) var30[var50] * var32) / (float) (var51 * 256);
                    }
                    float var53 = var52 * (var52 < 0.0F ? var37 : var36) + var35;
                    int var54 = (int) (var41 * var53);
                    int var55 = (int) (var42 * var53);
                    if (var54 < 0) {
                        var54 = 0;
                    } else if (var54 > 255) {
                        var54 = 255;
                    }
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var56 = (int) (var43 * var53);
                    class317.field4541.field4333 = var7 * var50 + var9;
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    class317.field4541.method1923((byte) 62, var54);
                    class317.field4541.method1923((byte) 62, var55);
                    class317.field4541.method1923((byte) 62, var56);
                    class317.field4541.method1923((byte) 62, 255 - (this.field6658[var38] & 0xFF));
                    short var57 = this.field6663[var38];
                    short var58 = (short) var28[var57];
                    float var59;
                    if (var58 == 0) {
                        var59 = ((float) var31[var57] * var34 + (float) var29[var57] * var33 + (float) var30[var57] * var32) * 0.0026041667F;
                    } else {
                        var59 = ((float) var31[var57] * var34 + (float) var29[var57] * var33 + (float) var30[var57] * var32) / (float) (var58 * 256);
                    }
                    float var60 = var59 * (var59 < 0.0F ? var37 : var36) + var35;
                    int var61 = (int) (var41 * var60);
                    if (var61 < 0) {
                        var61 = 0;
                    } else if (var61 > 255) {
                        var61 = 255;
                    }
                    int var62 = (int) (var42 * var60);
                    int var63 = (int) (var43 * var60);
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
                    class317.field4541.field4333 = var7 * var57 + var9;
                    class317.field4541.method1923((byte) 62, var61);
                    class317.field4541.method1923((byte) 62, var62);
                    class317.field4541.method1923((byte) 62, var63);
                    class317.field4541.method1923((byte) 62, 255 - (this.field6658[var38] & 0xFF));
                }
            } else {
                for (int var64 = 0; var64 < this.field6699; var64++) {
                    int var65 = this.method2726(this.field6656[var64], this.field6658[var64], this.field6667, this.field6609[var64], 256);
                    class317.field4541.field4333 = this.field6628[var64] * var7 + var9;
                    class317.field4541.method1892(397825512, var65);
                    class317.field4541.field4333 = this.field6689[var64] * var7 + var9;
                    class317.field4541.method1892(397825512, var65);
                    class317.field4541.field4333 = this.field6663[var64] * var7 + var9;
                    class317.field4541.method1892(397825512, var65);
                }
            }
        }
        if (var4) {
            byte[] var66;
            short[] var67;
            short[] var68;
            short[] var69;
            if (this.field6709 == null) {
                var66 = this.field6673;
                var69 = this.field6692;
                var68 = this.field6610;
                var67 = this.field6664;
            } else {
                var66 = this.field6709.field1577;
                var67 = this.field6709.field1571;
                var68 = this.field6709.field1570;
                var69 = this.field6709.field1572;
            }
            float var70 = 3.0F / (float) this.field6608;
            class317.field4541.field4333 = var10;
            float var71 = 3.0F / (float) (this.field6608 + (this.field6608 / 2));
            if (this.field6708.field4850) {
                for (int var72 = 0; var72 < this.field6622; var72++) {
                    int var73 = var66[var72] & 0xFF;
                    if (var73 == 0) {
                        class317.field4541.method2421(25785, (float) var69[var72] * var71);
                        class317.field4541.method2421(25785, (float) var67[var72] * var71);
                        class317.field4541.method2421(25785, (float) var68[var72] * var71);
                    } else {
                        float var74 = var70 / (float) var73;
                        class317.field4541.method2421(25785, (float) var69[var72] * var74);
                        class317.field4541.method2421(25785, (float) var67[var72] * var74);
                        class317.field4541.method2421(25785, (float) var68[var72] * var74);
                    }
                    class317.field4541.field4333 += var7 - 12;
                }
            } else {
                for (int var75 = 0; var75 < this.field6622; var75++) {
                    int var76 = var66[var75] & 0xFF;
                    if (var76 == 0) {
                        class317.field4541.method2420((float) var69[var75] * var71, (byte) 4);
                        class317.field4541.method2420((float) var67[var75] * var71, (byte) 4);
                        class317.field4541.method2420((float) var68[var75] * var71, (byte) 4);
                    } else {
                        float var77 = var70 / (float) var76;
                        class317.field4541.method2420((float) var69[var75] * var77, (byte) 4);
                        class317.field4541.method2420((float) var67[var75] * var77, (byte) 4);
                        class317.field4541.method2420((float) var68[var75] * var77, (byte) 4);
                    }
                    class317.field4541.field4333 += var7 - 12;
                }
            }
        }
        if (var6) {
            class317.field4541.field4333 = var11;
            if (this.field6708.field4850) {
                for (int var78 = 0; var78 < this.field6622; var78++) {
                    class317.field4541.method2421(25785, this.field6690[var78]);
                    class317.field4541.method2421(25785, this.field6646[var78]);
                    class317.field4541.field4333 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field6622; var79++) {
                    class317.field4541.method2420(this.field6690[var79], (byte) 4);
                    class317.field4541.method2420(this.field6646[var79], (byte) 4);
                    class317.field4541.field4333 += var7 - 8;
                }
            }
        }
        class317.field4541.field4333 = this.field6622 * var7;
        class243 var80;
        if (arg1) {
            if (this.field6617 == null) {
                this.field6617 = this.field6708.method2013((byte) 84, class317.field4541.field4326, true, var7, class317.field4541.field4333);
            } else {
                this.field6617.method1567(class317.field4541.field4326, class317.field4541.field4333, var7, 9813);
            }
            this.field6714 = 0;
            var80 = this.field6617;
        } else {
            var80 = this.field6708.method2013((byte) -54, class317.field4541.field4326, false, var7, class317.field4541.field4333);
            this.field6645 = true;
        }
        if (var5) {
            this.field6615.field2921 = var80;
            this.field6615.field2925 = var8;
        }
        if (var6) {
            this.field6651.field2921 = var80;
            this.field6651.field2925 = var11;
        }
        if (var3) {
            this.field6678.field2921 = var80;
            this.field6678.field2925 = var9;
        }
        if (var4) {
            this.field6623.field2925 = var10;
            this.field6623.field2921 = var80;
        }
    }

    @OriginalMember(owner = "client!ph", name = "sa", descriptor = "()V", line = 2712)
    public final void method889() {
        for (int var1 = 0; var1 < this.field6676; var1++) {
            this.field6686[var1] = -this.field6686[var1];
        }
        field6647++;
        for (int var2 = 0; var2 < this.field6622; var2++) {
            this.field6610[var2] = (short) (-this.field6610[var2]);
        }
        for (int var3 = 0; var3 < this.field6699; var3++) {
            short var4 = this.field6628[var3];
            this.field6628[var3] = this.field6663[var3];
            this.field6663[var3] = var4;
        }
        if (this.field6623 == null && this.field6678 != null) {
            this.field6678.field2921 = null;
        }
        if (this.field6623 != null) {
            this.field6623.field2921 = null;
        }
        if (this.field6625 != null) {
            this.field6625.field2913 = null;
        }
        if (this.field6615 != null) {
            this.field6615.field2921 = null;
        }
        this.field6695 = false;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V", line = 2765)
    public static void method2729(boolean arg0) {
        field6711 = null;
        field6716 = null;
        field6715 = null;
        if (arg0) {
            method2729(true);
        }
    }

    @OriginalMember(owner = "client!ph", name = "ra", descriptor = "()I", line = 2778)
    public final int method916() {
        field6665++;
        if (!this.field6695) {
            this.method2727((byte) -112);
        }
        return this.field6683;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lia;Lsf;I)V", line = 2790)
    public final void method910(class413 arg0, class361 arg1, int arg2) {
        field6629++;
        if (this.field6622 == 0) {
            return;
        }
        class408 var4 = this.field6708.field4919;
        class408 var5 = (class408) arg0;
        if (!this.field6695) {
            this.method2727((byte) -120);
        }
        this.method2732(71, var5);
        class520.field7640 = var4.field6015 * var5.field6011 + var4.field6021 * var5.field6018 + var4.field6000 * var5.field5991 + var4.field6011;
        class178.field2703 = var4.field6015 * var5.field6000 + var4.field6021 * var5.field6002 + var4.field6000 * var5.field6027;
        float var6 = (float) this.field6670 * class178.field2703 + class520.field7640;
        float var7 = (float) this.field6639 * class178.field2703 + class520.field7640;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = var7 - (float) this.field6683;
            var9 = (float) this.field6683 + var6;
        } else {
            var9 = (float) this.field6683 + var7;
            var8 = (float) (-this.field6683) + var6;
        }
        if ((this.field6708.field4923 <= var8) || ((float) this.field6708.field4871 >= var9)) {
            return;
        }
        class254.field3672 = var4.field6003 * var5.field6000 + var4.field6024 * var5.field6002 + var4.field6002 * var5.field6027;
        class55.field812 = var4.field6003 * var5.field6011 + var4.field6024 * var5.field6018 + var4.field6002 * var5.field5991 + var4.field6018;
        float var10 = (float) this.field6670 * class254.field3672 + class55.field812;
        float var11 = (float) this.field6639 * class254.field3672 + class55.field812;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var12 = ((float) this.field6683 + var10) * (float) this.field6708.field4814;
            var13 = ((float) (-this.field6683) + var11) * (float) this.field6708.field4814;
        } else {
            var12 = ((float) this.field6683 + var11) * (float) this.field6708.field4814;
            var13 = ((float) (-this.field6683) + var10) * (float) this.field6708.field4814;
        }
        if ((this.field6708.field4886 <= var13 / var9) || (this.field6708.field4880 >= var12 / var9)) {
            return;
        }
        class261.field3774 = var4.field6013 * var5.field6000 + var4.field6027 * var5.field6027 + var4.field5992 * var5.field6002;
        class95.field1559 = var4.field6013 * var5.field6011 + var4.field6027 * var5.field5991 + var4.field5992 * var5.field6018 + var4.field5991;
        float var14 = (float) this.field6670 * class261.field3774 + class95.field1559;
        float var15 = (float) this.field6639 * class261.field3774 + class95.field1559;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = ((float) this.field6683 + var14) * (float) this.field6708.field4922;
            var17 = ((float) (-this.field6683) + var15) * (float) this.field6708.field4922;
        } else {
            var17 = ((float) (-this.field6683) + var14) * (float) this.field6708.field4922;
            var16 = ((float) this.field6683 + var15) * (float) this.field6708.field4922;
        }
        if ((var17 / var9 >= this.field6708.field4891) || (var16 / var9 <= this.field6708.field4874)) {
            return;
        }
        if (arg1 != null || this.field6652 != null) {
            class72.field1208 = var4.field6003 * var5.field6015 + var4.field6024 * var5.field6003 + var4.field6002 * var5.field6013;
            class246.field3564 = var4.field6013 * var5.field6015 + var4.field6027 * var5.field6013 + var4.field5992 * var5.field6003;
            class326.field5045 = var4.field6015 * var5.field6015 + var4.field6021 * var5.field6003 + var4.field6000 * var5.field6013;
            class97.field1575 = var4.field6015 * var5.field6021 + var4.field6021 * var5.field6024 + var4.field6000 * var5.field5992;
            class253.field3652 = var4.field6013 * var5.field6021 + var4.field6027 * var5.field5992 + var4.field5992 * var5.field6024;
            class249.field3585 = var4.field6003 * var5.field6021 + var4.field6024 * var5.field6024 + var4.field6002 * var5.field5992;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field6682 + this.field6660 >> 1;
            int var21 = this.field6626 + this.field6654 >> 1;
            int var22 = (int) ((float) var21 * class72.field1208 + (float) this.field6670 * class254.field3672 + (float) var20 * class249.field3585 + class55.field812);
            int var23 = (int) ((float) var21 * class246.field3564 + (float) this.field6670 * class261.field3774 + (float) var20 * class253.field3652 + class95.field1559);
            int var24 = (int) ((float) var21 * class326.field5045 + (float) this.field6670 * class178.field2703 + (float) var20 * class97.field1575 + class520.field7640);
            if (var24 < this.field6708.field4871) {
                var18 = true;
            } else {
                arg1.field5441 = this.field6708.field4922 * var23 / var24 + this.field6708.field4833;
                arg1.field5442 = this.field6708.field4814 * var22 / var24 + this.field6708.field4925;
            }
            int var25 = (int) ((float) var21 * class72.field1208 + (float) this.field6639 * class254.field3672 + (float) var20 * class249.field3585 + class55.field812);
            int var26 = (int) ((float) var21 * class246.field3564 + (float) this.field6639 * class261.field3774 + (float) var20 * class253.field3652 + class95.field1559);
            int var27 = (int) ((float) var21 * class326.field5045 + (float) this.field6639 * class178.field2703 + (float) var20 * class97.field1575 + class520.field7640);
            if (var27 >= this.field6708.field4871) {
                arg1.field5444 = this.field6708.field4922 * var26 / var27 + this.field6708.field4833;
                arg1.field5445 = this.field6708.field4814 * var25 / var27 + this.field6708.field4925;
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field6708.field4871 && this.field6708.field4871 > var27) {
                    var19 = false;
                } else if (this.field6708.field4871 > var24) {
                    int var31 = (var27 - this.field6708.field4871 << 16) / (var27 - var24);
                    int var32 = var25 + ((var25 - var22) * var31 >> 16);
                    arg1.field5442 = this.field6708.field4925 + (this.field6708.field4814 * var32 / this.field6708.field4871);
                    int var33 = var26 + ((var26 - var23) * var31 >> 16);
                    arg1.field5441 = this.field6708.field4833 + (this.field6708.field4922 * var33 / this.field6708.field4871);
                } else if (this.field6708.field4871 > var27) {
                    int var28 = (var24 - this.field6708.field4871 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = var23 + ((var23 - var26) * var28 >> 16);
                    arg1.field5442 = this.field6708.field4814 * var29 / this.field6708.field4871 + this.field6708.field4925;
                    arg1.field5441 = this.field6708.field4833 + (this.field6708.field4922 * var30 / this.field6708.field4871);
                }
            }
            if (var19) {
                arg1.field5443 = true;
                if (var27 >= var24) {
                    arg1.field5446 = (var25 + this.field6683) * this.field6708.field4814 / var27 + this.field6708.field4925 - arg1.field5445;
                } else {
                    arg1.field5446 = (this.field6683 + var22) * this.field6708.field4814 / var24 + this.field6708.field4925 - arg1.field5442;
                }
            }
        }
        this.field6708.method2027(-99);
        this.field6708.method2057(var5, 12391);
        this.method2730(73);
        this.field6708.method2041(-1);
        this.method2721((byte) 5);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)V", line = 2995)
    public final void method904(int arg0, int arg1, int arg2, int arg3) {
        field6631++;
        for (int var5 = 0; var5 < this.field6699; var5++) {
            int var9 = this.field6656[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x3F2) >> 7;
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
            this.field6656[var5] = (short) class29.method239(var12, class29.method239(var10 << 10, var11 << 7));
        }
        if (this.field6652 != null) {
            for (int var6 = 0; var6 < this.field6614; var6++) {
                class196 var7 = this.field6652[var6];
                class481 var8 = this.field6634[var6];
                var8.field7055 = class430.field6265[this.field6656[var7.field2892] & 0xFFFF] & 0xFFFFFF | var8.field7055 & 0xFF000000;
            }
        }
        if (this.field6678 != null) {
            this.field6678.field2921 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "va", descriptor = "(I[IIIIZI[I)V", line = 3055)
    public final void method882(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field6635++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = arg2 << 4;
            class511.field7547 = 0;
            class51.field747 = 0;
            class113.field1802 = 0;
            int var13 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field6702.length > var15) {
                    int[] var16 = this.field6702[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field6693 == null || (this.field6693[var18] & arg6) != 0) {
                            class51.field747 += this.field6605[var18];
                            class511.field7547 += this.field6698[var18];
                            class113.field1802 += this.field6686[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class113.field1802 = var10;
                class511.field7547 = var11;
                class51.field747 = var12;
            } else {
                class511.field7547 = class511.field7547 / var13 + var11;
                class113.field1802 = class113.field1802 / var13 + var10;
                class135.field2071 = true;
                class51.field747 = class51.field747 / var13 + var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + (arg7[1] * arg3) + (arg7[2] * arg4) + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 16384 >> 15;
                int var21 = arg7[6] * arg2 + arg7[8] * arg4 + arg7[7] * arg3 + 16384 >> 15;
                arg3 = var20;
                arg4 = var21;
                arg2 = var19;
            }
            int var22 = arg3 << 4;
            int var23 = arg4 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field6702.length > var26) {
                    int[] var27 = this.field6702[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field6693 == null || (arg6 & this.field6693[var29]) != 0) {
                            this.field6605[var29] += var24;
                            this.field6698[var29] += var22;
                            this.field6686[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (this.field6702.length > var49) {
                        int[] var50 = this.field6702[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field6693 == null || (this.field6693[var52] & arg6) != 0) {
                                this.field6605[var52] -= class51.field747;
                                this.field6698[var52] -= class511.field7547;
                                this.field6686[var52] -= class113.field1802;
                                if (arg4 != 0) {
                                    int var53 = class324.field4966[arg4];
                                    int var54 = class324.field4974[arg4];
                                    int var55 = this.field6698[var52] * var53 + this.field6605[var52] * var54 + 32767 >> 15;
                                    this.field6698[var52] = this.field6698[var52] * var54 + 32767 - (this.field6605[var52] * var53) >> 15;
                                    this.field6605[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class324.field4966[arg2];
                                    int var57 = class324.field4974[arg2];
                                    int var58 = this.field6698[var52] * var57 + 32767 - (this.field6686[var52] * var56) >> 15;
                                    this.field6686[var52] = this.field6698[var52] * var56 + (this.field6686[var52] * var57 + 32767) >> 15;
                                    this.field6698[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class324.field4966[arg3];
                                    int var60 = class324.field4974[arg3];
                                    int var61 = this.field6605[var52] * var60 + this.field6686[var52] * var59 + 32767 >> 15;
                                    this.field6686[var52] = this.field6686[var52] * var60 + 32767 - (this.field6605[var52] * var59) >> 15;
                                    this.field6605[var52] = var61;
                                }
                                this.field6605[var52] += class51.field747;
                                this.field6698[var52] += class511.field7547;
                                this.field6686[var52] += class113.field1802;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (var32 < this.field6702.length) {
                            int[] var33 = this.field6702[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field6693 == null || (arg6 & this.field6693[var35]) != 0) {
                                    int var36 = this.field6604[var35];
                                    int var37 = this.field6604[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field6671[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class324.field4966[arg4];
                                            int var41 = class324.field4974[arg4];
                                            int var42 = this.field6664[var39] * var40 + this.field6692[var39] * var41 + 32767 >> 15;
                                            this.field6664[var39] = (short) (this.field6664[var39] * var41 + 32767 - (this.field6692[var39] * var40) >> 15);
                                            this.field6692[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class324.field4966[arg2];
                                            int var44 = class324.field4974[arg2];
                                            int var45 = this.field6664[var39] * var44 + 32767 - (this.field6610[var39] * var43) >> 15;
                                            this.field6610[var39] = (short) (this.field6610[var39] * var44 + (this.field6664[var39] * var43 + 32767) >> 15);
                                            this.field6664[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class324.field4966[arg3];
                                            int var47 = class324.field4974[arg3];
                                            int var48 = this.field6692[var39] * var47 + this.field6610[var39] * var46 + 32767 >> 15;
                                            this.field6610[var39] = (short) (this.field6610[var39] * var47 + 32767 - (this.field6692[var39] * var46) >> 15);
                                            this.field6692[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field6623 == null && this.field6678 != null) {
                        this.field6678.field2921 = null;
                    }
                    if (this.field6623 != null) {
                        this.field6623.field2921 = null;
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
                if (class135.field2071) {
                    int var68 = arg7[0] * class51.field747 + arg7[3] * class511.field7547 + arg7[6] * class113.field1802 + 16384 >> 15;
                    int var69 = arg7[1] * class51.field747 + arg7[7] * class113.field1802 + arg7[4] * class511.field7547 + 16384 >> 15;
                    int var70 = var66 + var69;
                    int var71 = var65 + var68;
                    int var72 = arg7[8] * class113.field1802 + arg7[5] * class511.field7547 + arg7[2] * class51.field747 + 16384 >> 15;
                    class511.field7547 = var70;
                    int var73 = var67 + var72;
                    class51.field747 = var71;
                    class113.field1802 = var73;
                    class135.field2071 = false;
                }
                int[] var74 = new int[9];
                int var75 = class324.field4974[arg2];
                int var76 = class324.field4966[arg2];
                int var77 = class324.field4974[arg3];
                int var78 = class324.field4966[arg3];
                int var79 = class324.field4974[arg4];
                int var80 = class324.field4966[arg4];
                int var81 = var76 * var79 + 16384 >> 15;
                int var82 = var76 * var80 + 16384 >> 15;
                var74[8] = var75 * var77 + 16384 >> 15;
                var74[0] = var77 * var79 + var78 * var82 + 16384 >> 15;
                var74[4] = var75 * var79 + 16384 >> 15;
                var74[2] = var75 * var78 + 16384 >> 15;
                var74[5] = -var76;
                var74[1] = var78 * var81 + -var77 * var80 + 16384 >> 15;
                var74[6] = -var78 * var79 + (var77 * var82) + 16384 >> 15;
                var74[3] = var75 * var80 + 16384 >> 15;
                var74[7] = var77 * var81 + var78 * var80 + 16384 >> 15;
                int var83 = var74[0] * -class51.field747 - (-(var74[1] * -class511.field7547) - var74[2] * -class113.field1802 - 16384) >> 15;
                int var84 = var74[5] * -class113.field1802 + (var74[3] * -class51.field747 + (var74[4] * -class511.field7547)) + 16384 >> 15;
                int var85 = var74[8] * -class113.field1802 + var74[6] * -class51.field747 + (var74[7] * -class511.field7547) + 16384 >> 15;
                int var86 = class51.field747 + var83;
                int var87 = class511.field7547 + var84;
                int var88 = class113.field1802 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 16384 >> 15;
                    }
                }
                int var91 = var74[0] * var65 + var74[2] * var67 + var74[1] * var66 + 16384 >> 15;
                int var92 = var74[5] * var67 + var74[3] * var65 + (var74[4] * var66) + 16384 >> 15;
                int var93 = var87 + var92;
                int var94 = var86 + var91;
                int var95 = var74[8] * var67 + var74[7] * var66 + var74[6] * var65 + 16384 >> 15;
                int var96 = var88 + var95;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 16384 >> 15;
                    }
                }
                int var99 = arg7[1] * var93 + arg7[0] * var94 + (arg7[2] * var96) + 16384 >> 15;
                int var100 = arg7[3] * var94 + (arg7[4] * var93) - (-(arg7[5] * var96) - 16384) >> 15;
                int var101 = var63 + var100;
                int var102 = var62 + var99;
                int var103 = arg7[7] * var93 + (arg7[6] * var94 - (-(arg7[8] * var96) - 16384)) >> 15;
                int var104 = var64 + var103;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field6702.length > var106) {
                        int[] var107 = this.field6702[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field6693 == null || (this.field6693[var109] & arg6) != 0) {
                                int var110 = this.field6686[var109] * var97[2] + (this.field6605[var109] * var97[0] + (this.field6698[var109] * var97[1])) + 16384 >> 15;
                                int var111 = this.field6698[var109] * var97[4] + this.field6686[var109] * var97[5] + this.field6605[var109] * var97[3] + 16384 >> 15;
                                int var112 = var102 + var110;
                                int var113 = var101 + var111;
                                int var114 = this.field6698[var109] * var97[7] + (this.field6605[var109] * var97[6] - (-(this.field6686[var109] * var97[8]) - 16384)) >> 15;
                                this.field6605[var109] = var112;
                                int var115 = var104 + var114;
                                this.field6698[var109] = var113;
                                this.field6686[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field6702.length) {
                        int[] var124 = this.field6702[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field6693 == null || (this.field6693[var126] & arg6) != 0) {
                                this.field6605[var126] -= class51.field747;
                                this.field6698[var126] -= class511.field7547;
                                this.field6686[var126] -= class113.field1802;
                                this.field6605[var126] = this.field6605[var126] * arg2 >> 7;
                                this.field6698[var126] = this.field6698[var126] * arg3 >> 7;
                                this.field6686[var126] = this.field6686[var126] * arg4 >> 7;
                                this.field6605[var126] += class51.field747;
                                this.field6698[var126] += class511.field7547;
                                this.field6686[var126] += class113.field1802;
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
                if (class135.field2071) {
                    int var133 = arg7[3] * class511.field7547 + arg7[0] * class51.field747 + (arg7[6] * class113.field1802) + 16384 >> 15;
                    int var134 = arg7[1] * class51.field747 + (arg7[4] * class511.field7547) - (-(arg7[7] * class113.field1802) - 16384) >> 15;
                    int var135 = arg7[5] * class511.field7547 + (arg7[2] * class51.field747 + (arg7[8] * class113.field1802)) + 16384 >> 15;
                    int var136 = var131 + var134;
                    int var137 = var130 + var133;
                    class511.field7547 = var136;
                    class51.field747 = var137;
                    int var138 = var132 + var135;
                    class113.field1802 = var138;
                    class135.field2071 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class51.field747 * var139 + 16384 >> 15;
                int var143 = -class511.field7547 * var140 + 16384 >> 15;
                int var144 = -class113.field1802 * var141 + 16384 >> 15;
                int var145 = class51.field747 + var142;
                int var146 = class511.field7547 + var143;
                int var147 = class113.field1802 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 16384 >> 15, arg7[3] * var139 + 16384 >> 15, arg7[6] * var139 + 16384 >> 15, arg7[1] * var140 + 16384 >> 15, arg7[4] * var140 + 16384 >> 15, arg7[7] * var140 + 16384 >> 15, arg7[2] * var141 + 16384 >> 15, arg7[5] * var141 + 16384 >> 15, arg7[8] * var141 + 16384 >> 15 };
                int var149 = var130 * var139 + 16384 >> 15;
                int var150 = var131 * var140 + 16384 >> 15;
                int var151 = var145 + var149;
                int var152 = var146 + var150;
                int var153 = var132 * var141 + 16384 >> 15;
                int var154 = var147 + var153;
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
                int var157 = arg7[0] * var151 + (arg7[1] * var152) + (arg7[2] * var154) + 16384 >> 15;
                int var158 = arg7[3] * var151 + (arg7[4] * var152) + (arg7[5] * var154 - -16384) >> 15;
                int var159 = arg7[8] * var154 + arg7[7] * var152 + arg7[6] * var151 + 16384 >> 15;
                int var160 = var128 + var158;
                int var161 = var127 + var157;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field6702.length) {
                        int[] var165 = this.field6702[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field6693 == null || (this.field6693[var167] & arg6) != 0) {
                                int var168 = this.field6686[var167] * var155[2] + this.field6605[var167] * var155[0] + (this.field6698[var167] * var155[1]) + 16384 >> 15;
                                int var169 = this.field6605[var167] * var155[3] + this.field6698[var167] * var155[4] + this.field6686[var167] * var155[5] + 16384 >> 15;
                                int var170 = this.field6698[var167] * var155[7] + (this.field6605[var167] * var155[6] + (this.field6686[var167] * var155[8])) + 16384 >> 15;
                                int var171 = var160 + var169;
                                int var172 = var161 + var168;
                                this.field6605[var167] = var172;
                                int var173 = var162 + var170;
                                this.field6698[var167] = var171;
                                this.field6686[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6679 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field6679.length > var181) {
                        int[] var182 = this.field6679[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field6684 == null || (this.field6684[var184] & arg6) != 0) {
                                int var185 = (this.field6658[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field6658[var184] = (byte) var185;
                                if (this.field6678 != null) {
                                    this.field6678.field2921 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field6652 != null) {
                    for (int var178 = 0; var178 < this.field6614; var178++) {
                        class196 var179 = this.field6652[var178];
                        class481 var180 = this.field6634[var178];
                        var180.field7055 = 255 - (this.field6658[var179.field2892] & 0xFF) << 24 | var180.field7055 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6679 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field6679.length > var190) {
                        int[] var191 = this.field6679[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field6684 == null || (arg6 & this.field6684[var193]) != 0) {
                                int var194 = this.field6656[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = arg2 + var195 & 0x3F;
                                int var198 = var194 & 0x7F;
                                int var199 = arg3 / 4 + var196;
                                int var200 = arg4 + var198;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field6656[var193] = (short) class29.method239(class29.method239(var197 << 10, var199 << 7), var200);
                                if (this.field6678 != null) {
                                    this.field6678.field2921 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field6652 != null) {
                    for (int var187 = 0; var187 < this.field6614; var187++) {
                        class196 var188 = this.field6652[var187];
                        class481 var189 = this.field6634[var187];
                        var189.field7055 = var189.field7055 & 0xFF000000 | class430.field6265[this.field6656[var188.field2892] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field6653 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field6653.length) {
                        int[] var203 = this.field6653[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class481 var205 = this.field6634[var203[var204]];
                            var205.field7064 += arg3;
                            var205.field7056 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field6653 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field6653.length) {
                        int[] var208 = this.field6653[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class481 var210 = this.field6634[var208[var209]];
                            var210.field7062 = var210.field7062 * arg2 >> 7;
                            var210.field7060 = var210.field7060 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field6653 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field6653.length > var212) {
                    int[] var213 = this.field6653[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class481 var215 = this.field6634[var213[var214]];
                        var215.field7057 = var215.field7057 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "oa", descriptor = "(I)V", line = 4053)
    public final void method880(int arg0) {
        field6643++;
        if (this.field6678 != null) {
            this.field6678.field2921 = null;
        }
        this.field6608 = (short) arg0;
        if (this.field6623 != null) {
            this.field6623.field2921 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V", line = 4074)
    private final void method2730(int arg0) {
        field6612++;
        if (this.field6691 == 0) {
            return;
        }
        if (arg0 < 22) {
            this.field6689 = null;
        }
        if (this.field6714 != 0) {
            this.method2728(false, true);
        }
        this.method2728(false, false);
        if (this.field6625 != null) {
            if (this.field6625.field2913 == null) {
                this.method2724((this.field6714 & 0x10) != 0, -1);
            }
            if (this.field6625.field2913 != null) {
                this.field6708.method2024(true, this.field6623 != null);
                this.field6708.method2085(this.field6615, this.field6623, this.field6651, -29066, this.field6678);
                int var2 = this.field6648.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field6648[var3];
                    int var5 = this.field6648[var3 + 1];
                    int var6 = this.field6609[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field6708.method2049(-125, var6, this.field6623 != null);
                    this.field6708.method2086((var5 - var4) * 3, this.field6625.field2913, var4 * 3, 4, 0);
                }
            }
        }
        this.method2722(-118);
    }

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "()I", line = 4131)
    public final int method915() {
        field6696++;
        return this.field6694;
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "()[Lqr;", line = 4143)
    public final class46[] method913() {
        field6685++;
        return this.field6641;
    }

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "()I", line = 4152)
    public final int method896() {
        if (!this.field6695) {
            this.method2727((byte) -96);
        }
        field6607++;
        return this.field6654;
    }

    @OriginalMember(owner = "client!ph", name = "XA", descriptor = "(III)V", line = 4164)
    public final void method878(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field6676; var4++) {
            if (arg0 != 128) {
                this.field6605[var4] = this.field6605[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field6698[var4] = this.field6698[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field6686[var4] = this.field6686[var4] * arg2 >> 7;
            }
        }
        field6669++;
        this.field6695 = false;
        if (this.field6615 != null) {
            this.field6615.field2921 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIIZLph;Lph;)Lc;", line = 4195)
    private final class121 method2731(boolean arg0, int arg1, int arg2, boolean arg3, class453 arg4, class453 arg5) {
        arg4.field6691 = this.field6691;
        arg4.field6621 = this.field6621;
        arg4.field6694 = arg2;
        arg4.field6676 = this.field6676;
        arg4.field6614 = this.field6614;
        arg4.field6622 = this.field6622;
        arg4.field6608 = this.field6608;
        arg4.field6681 = this.field6681;
        arg4.field6667 = this.field6667;
        field6661++;
        arg4.field6714 = 0;
        arg4.field6699 = this.field6699;
        boolean var7 = class390.method2452(33, this.field6681, arg2);
        boolean var8 = class179.method1270((byte) 104, this.field6681, arg2);
        boolean var9 = class478.method2860(arg1 ^ arg1, this.field6681, arg2);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg4.field6605 = this.field6605;
            } else if (arg5.field6605 == null || arg5.field6605.length < this.field6621) {
                arg4.field6605 = arg5.field6605 = new int[this.field6621];
            } else {
                arg4.field6605 = arg5.field6605;
            }
            if (!var8) {
                arg4.field6698 = this.field6698;
            } else if (arg5.field6698 == null || arg5.field6698.length < this.field6621) {
                arg4.field6698 = arg5.field6698 = new int[this.field6621];
            } else {
                arg4.field6698 = arg5.field6698;
            }
            if (!var9) {
                arg4.field6686 = this.field6686;
            } else if (arg5.field6686 == null || this.field6621 > arg5.field6686.length) {
                arg4.field6686 = arg5.field6686 = new int[this.field6621];
            } else {
                arg4.field6686 = arg5.field6686;
            }
            for (int var11 = 0; var11 < this.field6621; var11++) {
                if (var7) {
                    arg4.field6605[var11] = this.field6605[var11];
                }
                if (var8) {
                    arg4.field6698[var11] = this.field6698[var11];
                }
                if (var9) {
                    arg4.field6686[var11] = this.field6686[var11];
                }
            }
        } else {
            arg4.field6686 = this.field6686;
            arg4.field6698 = this.field6698;
            arg4.field6605 = this.field6605;
        }
        if (class415.method2559(arg1 + 4557, arg2, this.field6681)) {
            if (arg0) {
                arg4.field6714 = (byte) (arg4.field6714 | 0x1);
            }
            arg4.field6615 = arg5.field6615;
            arg4.field6615.field2921 = this.field6615.field2921;
            arg4.field6615.field2925 = this.field6615.field2925;
        } else if (class402.method2503(this.field6681, arg2, -123)) {
            arg4.field6615 = this.field6615;
        } else {
            arg4.field6615 = null;
        }
        if (class91.method742((byte) -118, arg2, this.field6681)) {
            if (arg5.field6656 == null || arg5.field6656.length < this.field6699) {
                arg4.field6656 = arg5.field6656 = new short[this.field6699];
            } else {
                arg4.field6656 = arg5.field6656;
            }
            for (int var12 = 0; var12 < this.field6699; var12++) {
                arg4.field6656[var12] = this.field6656[var12];
            }
        } else {
            arg4.field6656 = this.field6656;
        }
        if (class416.method2562(this.field6681, (byte) 23, arg2)) {
            if (arg5.field6658 == null || this.field6699 > arg5.field6658.length) {
                arg4.field6658 = arg5.field6658 = new byte[this.field6699];
            } else {
                arg4.field6658 = arg5.field6658;
            }
            for (int var13 = 0; var13 < this.field6699; var13++) {
                arg4.field6658[var13] = this.field6658[var13];
            }
        } else {
            arg4.field6658 = this.field6658;
        }
        if (class108.method805(arg2, -88, this.field6681)) {
            arg4.field6678 = arg5.field6678;
            if (arg0) {
                arg4.field6714 = (byte) (arg4.field6714 | 0x2);
            }
            arg4.field6678.field2921 = this.field6678.field2921;
            arg4.field6678.field2925 = this.field6678.field2925;
        } else if (class465.method2774(5966, arg2, this.field6681)) {
            arg4.field6678 = this.field6678;
        } else {
            arg4.field6678 = null;
        }
        if (class145.method1041(this.field6681, (byte) 108, arg2)) {
            if (arg5.field6692 == null || arg5.field6692.length < this.field6622) {
                int var14 = this.field6622;
                arg4.field6664 = arg5.field6664 = new short[var14];
                arg4.field6692 = arg5.field6692 = new short[var14];
                arg4.field6610 = arg5.field6610 = new short[var14];
            } else {
                arg4.field6692 = arg5.field6692;
                arg4.field6610 = arg5.field6610;
                arg4.field6664 = arg5.field6664;
            }
            if (this.field6709 == null) {
                for (int var15 = 0; var15 < this.field6622; var15++) {
                    arg4.field6692[var15] = this.field6692[var15];
                    arg4.field6664[var15] = this.field6664[var15];
                    arg4.field6610[var15] = this.field6610[var15];
                }
            } else {
                if (arg5.field6709 == null) {
                    arg5.field6709 = new class97();
                }
                class97 var16 = arg4.field6709 = arg5.field6709;
                if (var16.field1572 == null || var16.field1572.length < this.field6622) {
                    int var17 = this.field6622;
                    var16.field1571 = new short[var17];
                    var16.field1570 = new short[var17];
                    var16.field1577 = new byte[var17];
                    var16.field1572 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field6622; var18++) {
                    arg4.field6692[var18] = this.field6692[var18];
                    arg4.field6664[var18] = this.field6664[var18];
                    arg4.field6610[var18] = this.field6610[var18];
                    var16.field1572[var18] = this.field6709.field1572[var18];
                    var16.field1571[var18] = this.field6709.field1571[var18];
                    var16.field1570[var18] = this.field6709.field1570[var18];
                    var16.field1577[var18] = this.field6709.field1577[var18];
                }
            }
            arg4.field6673 = this.field6673;
        } else {
            arg4.field6673 = this.field6673;
            arg4.field6692 = this.field6692;
            arg4.field6610 = this.field6610;
            arg4.field6709 = this.field6709;
            arg4.field6664 = this.field6664;
        }
        if (class503.method2993(this.field6681, arg2, (byte) -9)) {
            if (arg0) {
                arg4.field6714 = (byte) (arg4.field6714 | 0x4);
            }
            arg4.field6623 = arg5.field6623;
            arg4.field6623.field2925 = this.field6623.field2925;
            arg4.field6623.field2921 = this.field6623.field2921;
        } else if (class256.method1624(this.field6681, arg2, 2)) {
            arg4.field6623 = this.field6623;
        } else {
            arg4.field6623 = null;
        }
        if (class97.method769(arg2, this.field6681, (byte) -128)) {
            if (arg5.field6690 == null || arg5.field6690.length < this.field6699) {
                int var19 = this.field6622;
                arg4.field6690 = arg5.field6690 = new float[var19];
                arg4.field6646 = arg5.field6646 = new float[var19];
            } else {
                arg4.field6690 = arg5.field6690;
                arg4.field6646 = arg5.field6646;
            }
            for (int var20 = 0; var20 < this.field6622; var20++) {
                arg4.field6690[var20] = this.field6690[var20];
                arg4.field6646[var20] = this.field6646[var20];
            }
        } else {
            arg4.field6646 = this.field6646;
            arg4.field6690 = this.field6690;
        }
        if (class427.method2608(arg2, this.field6681, arg1 + 31933)) {
            arg4.field6651 = arg5.field6651;
            if (arg0) {
                arg4.field6714 = (byte) (arg4.field6714 | 0x8);
            }
            arg4.field6651.field2925 = this.field6651.field2925;
            arg4.field6651.field2921 = this.field6651.field2921;
        } else if (class390.method2445(this.field6681, -5, arg2)) {
            arg4.field6651 = this.field6651;
        } else {
            arg4.field6651 = null;
        }
        if (class204.method1369(this.field6681, arg2, (byte) -117)) {
            if (arg5.field6628 == null || this.field6699 > arg5.field6628.length) {
                int var21 = this.field6699;
                arg4.field6663 = arg5.field6663 = new short[var21];
                arg4.field6628 = arg5.field6628 = new short[var21];
                arg4.field6689 = arg5.field6689 = new short[var21];
            } else {
                arg4.field6628 = arg5.field6628;
                arg4.field6689 = arg5.field6689;
                arg4.field6663 = arg5.field6663;
            }
            for (int var22 = 0; var22 < this.field6699; var22++) {
                arg4.field6628[var22] = this.field6628[var22];
                arg4.field6689[var22] = this.field6689[var22];
                arg4.field6663[var22] = this.field6663[var22];
            }
        } else {
            arg4.field6663 = this.field6663;
            arg4.field6689 = this.field6689;
            arg4.field6628 = this.field6628;
        }
        if (class445.method2702((byte) -96, arg2, this.field6681)) {
            arg4.field6625 = arg5.field6625;
            if (arg0) {
                arg4.field6714 = (byte) (arg4.field6714 | 0x10);
            }
            arg4.field6625.field2913 = this.field6625.field2913;
        } else if (class398.method2484(this.field6681, arg2, 78)) {
            arg4.field6625 = this.field6625;
        } else {
            arg4.field6625 = null;
        }
        if (class511.method3034(32768, arg2, this.field6681)) {
            if (arg5.field6609 == null || this.field6699 > arg5.field6609.length) {
                int var23 = this.field6699;
                arg4.field6609 = arg5.field6609 = new short[var23];
            } else {
                arg4.field6609 = arg5.field6609;
            }
            for (int var24 = 0; var24 < this.field6699; var24++) {
                arg4.field6609[var24] = this.field6609[var24];
            }
        } else {
            arg4.field6609 = this.field6609;
        }
        if (!class379.method2402(arg2, this.field6681, (byte) -81)) {
            arg4.field6634 = this.field6634;
        } else if (arg5.field6634 == null || this.field6614 > arg5.field6634.length) {
            int var26 = this.field6614;
            arg4.field6634 = arg5.field6634 = new class481[var26];
            for (int var27 = 0; var27 < this.field6614; var27++) {
                arg4.field6634[var27] = this.field6634[var27].method2875((byte) -22);
            }
        } else {
            arg4.field6634 = arg5.field6634;
            for (int var25 = 0; var25 < this.field6614; var25++) {
                arg4.field6634[var25].method2877(this.field6634[var25], arg1 + 4464);
            }
        }
        if (this.field6695) {
            arg4.field6682 = this.field6682;
            arg4.field6654 = this.field6654;
            arg4.field6670 = this.field6670;
            arg4.field6626 = this.field6626;
            arg4.field6660 = this.field6660;
            arg4.field6683 = this.field6683;
            arg4.field6695 = true;
            arg4.field6639 = this.field6639;
        } else {
            arg4.field6695 = false;
        }
        arg4.field6653 = this.field6653;
        arg4.field6652 = this.field6652;
        arg4.field6671 = this.field6671;
        arg4.field6648 = this.field6648;
        arg4.field6684 = this.field6684;
        arg4.field6604 = this.field6604;
        arg4.field6693 = this.field6693;
        arg4.field6620 = this.field6620;
        arg4.field6641 = this.field6641;
        arg4.field6679 = this.field6679;
        arg4.field6702 = this.field6702;
        return arg4;
    }

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "(SS)V", line = 4659)
    public final void method917(short arg0, short arg1) {
        field6618++;
        for (int var3 = 0; var3 < this.field6699; var3++) {
            if (this.field6656[var3] == arg0) {
                this.field6656[var3] = arg1;
            }
        }
        if (this.field6652 != null) {
            for (int var4 = 0; var4 < this.field6614; var4++) {
                class196 var5 = this.field6652[var4];
                class481 var6 = this.field6634[var4];
                var6.field7055 = var6.field7055 & 0xFF000000 | class430.field6265[this.field6656[var5.field2892] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field6678 != null) {
            this.field6678.field2921 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "la", descriptor = "()I", line = 4706)
    public final int method876() {
        field6662++;
        if (!this.field6695) {
            this.method2727((byte) -112);
        }
        return this.field6660;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILht;)V", line = 4718)
    private final void method2732(int arg0, class408 arg1) {
        int var3 = -19 % ((-arg0 - 61) / 63);
        if (this.field6641 != null) {
            for (int var4 = 0; var4 < this.field6641.length; var4++) {
                class46 var5 = this.field6641[var4];
                class46 var6 = var5;
                if (var5.field710 != null) {
                    var6 = var5.field710;
                }
                var6.field716 = (int) ((float) this.field6686[var5.field703] * arg1.field6003 + (float) this.field6698[var5.field703] * arg1.field6002 + (float) this.field6605[var5.field703] * arg1.field6024 + arg1.field6018);
                var6.field706 = (int) ((float) this.field6686[var5.field703] * arg1.field6013 + (float) this.field6698[var5.field703] * arg1.field6027 + (float) this.field6605[var5.field703] * arg1.field5992 + arg1.field5991);
                var6.field707 = (int) ((float) this.field6686[var5.field703] * arg1.field6015 + (float) this.field6698[var5.field703] * arg1.field6000 + (float) this.field6605[var5.field703] * arg1.field6021 + arg1.field6011);
                var6.field714 = (int) ((float) this.field6686[var5.field704] * arg1.field6003 + (float) this.field6698[var5.field704] * arg1.field6002 + (float) this.field6605[var5.field704] * arg1.field6024 + arg1.field6018);
                var6.field701 = (int) ((float) this.field6686[var5.field704] * arg1.field6013 + (float) this.field6698[var5.field704] * arg1.field6027 + (float) this.field6605[var5.field704] * arg1.field5992 + arg1.field5991);
                var6.field708 = (int) ((float) this.field6686[var5.field704] * arg1.field6015 + (float) this.field6698[var5.field704] * arg1.field6000 + (float) this.field6605[var5.field704] * arg1.field6021 + arg1.field6011);
                var6.field705 = (int) ((float) this.field6686[var5.field709] * arg1.field6003 + (float) this.field6698[var5.field709] * arg1.field6002 + (float) this.field6605[var5.field709] * arg1.field6024 + arg1.field6018);
                var6.field715 = (int) ((float) this.field6686[var5.field709] * arg1.field6013 + (float) this.field6698[var5.field709] * arg1.field6027 + (float) this.field6605[var5.field709] * arg1.field5992 + arg1.field5991);
                var6.field702 = (int) ((float) this.field6686[var5.field709] * arg1.field6015 + (float) this.field6698[var5.field709] * arg1.field6000 + (float) this.field6605[var5.field709] * arg1.field6021 + arg1.field6011);
            }
        }
        field6616++;
        if (this.field6620 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field6620.length; var7++) {
            class113 var8 = this.field6620[var7];
            class113 var9 = var8;
            if (var8.field1793 != null) {
                var9 = var8.field1793;
            }
            if (var8.field1799 == null) {
                var8.field1799 = arg1.method1002();
            } else {
                var8.field1799.method995(arg1);
            }
            var9.field1790 = (int) ((float) this.field6686[var8.field1792] * arg1.field6003 + (float) this.field6698[var8.field1792] * arg1.field6002 + (float) this.field6605[var8.field1792] * arg1.field6024 + arg1.field6018);
            var9.field1788 = (int) ((float) this.field6686[var8.field1792] * arg1.field6013 + (float) this.field6698[var8.field1792] * arg1.field6027 + (float) this.field6605[var8.field1792] * arg1.field5992 + arg1.field5991);
            var9.field1787 = (int) ((float) this.field6686[var8.field1792] * arg1.field6015 + (float) this.field6698[var8.field1792] * arg1.field6000 + (float) this.field6605[var8.field1792] * arg1.field6021 + arg1.field6011);
        }
    }

    @OriginalMember(owner = "client!ph", name = "WA", descriptor = "(I)V", line = 4785)
    public final void method886(int arg0) {
        field6680++;
        int var2 = class324.field4966[arg0];
        int var3 = class324.field4974[arg0];
        for (int var4 = 0; var4 < this.field6676; var4++) {
            int var5 = this.field6698[var4] * var3 - this.field6686[var4] * var2 >> 15;
            this.field6686[var4] = this.field6698[var4] * var2 + (this.field6686[var4] * var3) >> 15;
            this.field6698[var4] = var5;
        }
        if (this.field6615 != null) {
            this.field6615.field2921 = null;
        }
        this.field6695 = false;
    }

    @OriginalMember(owner = "client!ph", name = "ia", descriptor = "(I)V", line = 4827)
    public final void method911(int arg0) {
        field6644++;
        int var2 = class324.field4966[arg0];
        int var3 = class324.field4974[arg0];
        for (int var4 = 0; var4 < this.field6676; var4++) {
            int var7 = this.field6686[var4] * var2 + this.field6605[var4] * var3 >> 15;
            this.field6686[var4] = this.field6686[var4] * var3 - (this.field6605[var4] * var2) >> 15;
            this.field6605[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field6622; var5++) {
            int var6 = this.field6692[var5] * var3 + this.field6610[var5] * var2 >> 15;
            this.field6610[var5] = (short) (this.field6610[var5] * var3 - (this.field6692[var5] * var2) >> 15);
            this.field6692[var5] = (short) var6;
        }
        if (this.field6623 == null && this.field6678 != null) {
            this.field6678.field2921 = null;
        }
        if (this.field6623 != null) {
            this.field6623.field2921 = null;
        }
        this.field6695 = false;
        if (this.field6615 != null) {
            this.field6615.field2921 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lia;Lsf;II)V", line = 4884)
    public final void method903(class413 arg0, class361 arg1, int arg2, int arg3) {
        field6624++;
        if (this.field6622 == 0) {
            return;
        }
        class408 var5 = this.field6708.field4919;
        if (!this.field6695) {
            this.method2727((byte) -97);
        }
        class408 var6 = (class408) arg0;
        class178.field2703 = var5.field6015 * var6.field6000 + var5.field6021 * var6.field6002 + var5.field6000 * var6.field6027;
        class520.field7640 = var5.field6015 * var6.field6011 + var5.field6021 * var6.field6018 + var5.field6000 * var6.field5991 + var5.field6011;
        float var7 = (float) this.field6670 * class178.field2703 + class520.field7640;
        float var8 = (float) this.field6639 * class178.field2703 + class520.field7640;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = var8 - (float) this.field6683;
            var10 = (float) this.field6683 + var7;
        } else {
            var10 = (float) this.field6683 + var8;
            var9 = var7 - (float) this.field6683;
        }
        if ((var9 >= this.field6708.field4909) || (var10 <= (float) this.field6708.field4871)) {
            return;
        }
        class55.field812 = var5.field6003 * var6.field6011 + var5.field6024 * var6.field6018 + var5.field6002 * var6.field5991 + var5.field6018;
        class254.field3672 = var5.field6003 * var6.field6000 + var5.field6024 * var6.field6002 + var5.field6002 * var6.field6027;
        float var11 = (float) this.field6670 * class254.field3672 + class55.field812;
        float var12 = (float) this.field6639 * class254.field3672 + class55.field812;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var13 = ((float) this.field6683 + var11) * (float) this.field6708.field4814;
            var14 = (var12 - (float) this.field6683) * (float) this.field6708.field4814;
        } else {
            var13 = ((float) this.field6683 + var12) * (float) this.field6708.field4814;
            var14 = ((float) (-this.field6683) + var11) * (float) this.field6708.field4814;
        }
        if ((this.field6708.field4886 <= var14 / (float) arg2) || (var13 / (float) arg2 <= this.field6708.field4880)) {
            return;
        }
        class261.field3774 = var5.field6013 * var6.field6000 + var5.field6027 * var6.field6027 + var5.field5992 * var6.field6002;
        class95.field1559 = var5.field6013 * var6.field6011 + var5.field6027 * var6.field5991 + var5.field5992 * var6.field6018 + var5.field5991;
        float var15 = (float) this.field6670 * class261.field3774 + class95.field1559;
        float var16 = (float) this.field6639 * class261.field3774 + class95.field1559;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = ((float) this.field6683 + var15) * (float) this.field6708.field4922;
            var18 = (var16 - (float) this.field6683) * (float) this.field6708.field4922;
        } else {
            var17 = ((float) this.field6683 + var16) * (float) this.field6708.field4922;
            var18 = (var15 - (float) this.field6683) * (float) this.field6708.field4922;
        }
        if ((this.field6708.field4891 <= var18 / (float) arg2) || (this.field6708.field4874 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field6652 != null) {
            class97.field1575 = var5.field6015 * var6.field6021 + var5.field6021 * var6.field6024 + var5.field6000 * var6.field5992;
            class249.field3585 = var5.field6003 * var6.field6021 + var5.field6024 * var6.field6024 + var5.field6002 * var6.field5992;
            class326.field5045 = var5.field6015 * var6.field6015 + var5.field6021 * var6.field6003 + var5.field6000 * var6.field6013;
            class253.field3652 = var5.field6013 * var6.field6021 + var5.field6027 * var6.field5992 + var5.field5992 * var6.field6024;
            class72.field1208 = var5.field6003 * var6.field6015 + var5.field6024 * var6.field6003 + var5.field6002 * var6.field6013;
            class246.field3564 = var5.field6013 * var6.field6015 + var5.field6027 * var6.field6013 + var5.field5992 * var6.field6003;
        }
        if (arg1 != null) {
            int var19 = this.field6682 + this.field6660 >> 1;
            int var20 = this.field6626 + this.field6654 >> 1;
            int var21 = (int) ((float) var20 * class72.field1208 + (float) this.field6670 * class254.field3672 + (float) var19 * class249.field3585 + class55.field812);
            int var22 = (int) ((float) var20 * class246.field3564 + (float) this.field6670 * class261.field3774 + (float) var19 * class253.field3652 + class95.field1559);
            int var23 = (int) ((float) var20 * class326.field5045 + (float) this.field6670 * class178.field2703 + (float) var19 * class97.field1575 + class520.field7640);
            int var24 = (int) ((float) var20 * class72.field1208 + (float) this.field6639 * class254.field3672 + (float) var19 * class249.field3585 + class55.field812);
            int var25 = (int) ((float) var20 * class246.field3564 + (float) this.field6639 * class261.field3774 + (float) var19 * class253.field3652 + class95.field1559);
            arg1.field5442 = this.field6708.field4925 + (this.field6708.field4814 * var21 / arg2);
            arg1.field5445 = this.field6708.field4814 * var24 / arg2 + this.field6708.field4925;
            arg1.field5444 = this.field6708.field4833 + (this.field6708.field4922 * var25 / arg2);
            arg1.field5441 = this.field6708.field4922 * var22 / arg2 + this.field6708.field4833;
            int var26 = (int) ((float) var20 * class326.field5045 + (float) this.field6639 * class178.field2703 + (float) var19 * class97.field1575 + class520.field7640);
            if (var23 < this.field6708.field4871 && var26 < this.field6708.field4871) {
                arg1.field5446 = (this.field6683 + var21) * this.field6708.field4814 / arg2 + this.field6708.field4925 - arg1.field5442;
                arg1.field5443 = true;
            }
        }
        this.field6708.method2038((float) arg2, false);
        this.field6708.method2050((byte) -91);
        this.field6708.method2057(var6, 12391);
        this.method2730(86);
        this.field6708.method2041(-1);
        this.method2721((byte) 5);
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "()Z", line = 5031)
    public final boolean method912() {
        field6627++;
        if (this.field6609 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field6609.length; var1++) {
            if (this.field6609[var1] != -1 && !this.field6708.field2449.method937((byte) 43, this.field6609[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ph", name = "ea", descriptor = "(IILna;Lna;III)V", line = 5057)
    public final void method879(int arg0, int arg1, class35 arg2, class35 arg3, int arg4, int arg5, int arg6) {
        if (!this.field6695) {
            this.method2727((byte) -96);
        }
        field6704++;
        int var8 = this.field6660 + arg4;
        int var9 = this.field6682 + arg4;
        int var10 = arg6 + this.field6626;
        int var11 = this.field6654 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || var9 + arg2.field534 >> arg2.field535 >= arg2.field532 || var10 < 0 || arg2.field534 + var11 >> arg2.field535 >= arg2.field531) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field532 <= arg3.field534 + var9 >> arg3.field535 || var10 < 0 || var11 + arg3.field534 >> arg3.field535 >= arg3.field531) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field535;
            int var13 = arg2.field534 + var9 - 1 >> arg2.field535;
            int var14 = var10 >> arg2.field535;
            int var15 = arg2.field534 - (1 - var11) >> arg2.field535;
            if (arg2.method271(var12, var14) == arg5 && arg5 == arg2.method271(var13, var14) && arg2.method271(var12, var15) == arg5 && arg5 == arg2.method271(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field6676; var32++) {
                this.field6698[var32] = this.field6698[var32] + arg2.method273(this.field6605[var32] + arg4, this.field6686[var32] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var16 = this.field6670;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field6676; var17++) {
                int var18 = (this.field6698[var17] << 16) / var16;
                if (var18 < arg1) {
                    this.field6698[var17] += (arg2.method273(this.field6605[var17] + arg4, this.field6686[var17] + arg6) - arg5) * (arg1 - var18) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var28 = (arg1 & 0xFF) * 4;
            int var29 = ((arg1 & 0xFF73) >> 8) * 4;
            int var30 = arg1 >> 16 & 0xFF << 6;
            int var31 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var28 >> 1)) < 0 || (arg2.field534 + arg4 + (var28 >> 1)) >= (arg2.field532 << arg2.field535) || (arg6 - (var29 >> 1)) < 0 || arg2.field531 << arg2.field535 <= arg6 + (var29 >> 1) + arg2.field534) {
                return;
            }
            this.method892(true, var30, arg6, var31, arg4, var29, arg2, var28, arg5);
        } else if (arg0 == 4) {
            int var26 = this.field6639 - this.field6670;
            for (int var27 = 0; var27 < this.field6676; var27++) {
                this.field6698[var27] = this.field6698[var27] + arg3.method273(this.field6605[var27] + arg4, this.field6686[var27] + arg6) + var26 - arg5;
            }
        } else if (arg0 == 5) {
            int var19 = this.field6639 - this.field6670;
            for (int var20 = 0; var20 < this.field6676; var20++) {
                int var21 = this.field6605[var20] + arg4;
                int var22 = this.field6686[var20] + arg6;
                int var23 = arg2.method273(var21, var22);
                int var24 = arg3.method273(var21, var22);
                int var25 = var23 - var24;
                this.field6698[var20] = ((this.field6698[var20] << 8) / var19 * var25 >> 8) + var23 - arg5;
            }
        }
        this.field6695 = false;
        if (this.field6615 != null) {
            this.field6615.field2921 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "(IIII)V", line = 5211)
    public final void method919(int arg0, int arg1, int arg2, int arg3) {
        field6638++;
        if (arg0 == 0) {
            class51.field747 = 0;
            class511.field7547 = 0;
            int var5 = 0;
            class113.field1802 = 0;
            for (int var6 = 0; var6 < this.field6676; var6++) {
                class51.field747 += this.field6605[var6];
                class511.field7547 += this.field6698[var6];
                class113.field1802 += this.field6686[var6];
                var5++;
            }
            if (var5 <= 0) {
                class51.field747 = arg1;
                class113.field1802 = arg3;
                class511.field7547 = arg2;
            } else {
                class113.field1802 = class113.field1802 / var5 + arg3;
                class511.field7547 = class511.field7547 / var5 + arg2;
                class51.field747 = class51.field747 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field6676; var7++) {
                this.field6605[var7] += arg1;
                this.field6698[var7] += arg2;
                this.field6686[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field6676; var8++) {
                this.field6605[var8] -= class51.field747;
                this.field6698[var8] -= class511.field7547;
                this.field6686[var8] -= class113.field1802;
                if (arg3 != 0) {
                    int var9 = class324.field4966[arg3];
                    int var10 = class324.field4974[arg3];
                    int var11 = this.field6698[var8] * var9 + this.field6605[var8] * var10 + 32767 >> 15;
                    this.field6698[var8] = this.field6698[var8] * var10 + 32767 - (this.field6605[var8] * var9) >> 15;
                    this.field6605[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class324.field4966[arg1];
                    int var13 = class324.field4974[arg1];
                    int var14 = this.field6698[var8] * var13 + 32767 - (this.field6686[var8] * var12) >> 15;
                    this.field6686[var8] = this.field6686[var8] * var13 + this.field6698[var8] * var12 + 32767 >> 15;
                    this.field6698[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class324.field4966[arg2];
                    int var16 = class324.field4974[arg2];
                    int var17 = this.field6686[var8] * var15 + this.field6605[var8] * var16 + 32767 >> 15;
                    this.field6686[var8] = this.field6686[var8] * var16 + (32767 - (this.field6605[var8] * var15)) >> 15;
                    this.field6605[var8] = var17;
                }
                this.field6605[var8] += class51.field747;
                this.field6698[var8] += class511.field7547;
                this.field6686[var8] += class113.field1802;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field6676; var18++) {
                this.field6605[var18] -= class51.field747;
                this.field6698[var18] -= class511.field7547;
                this.field6686[var18] -= class113.field1802;
                this.field6605[var18] = this.field6605[var18] * arg1 / 128;
                this.field6698[var18] = this.field6698[var18] * arg2 / 128;
                this.field6686[var18] = this.field6686[var18] * arg3 / 128;
                this.field6605[var18] += class51.field747;
                this.field6698[var18] += class511.field7547;
                this.field6686[var18] += class113.field1802;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field6699; var19++) {
                int var23 = (this.field6658[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field6658[var19] = (byte) var23;
            }
            if (this.field6678 != null) {
                this.field6678.field2921 = null;
            }
            if (this.field6652 != null) {
                for (int var20 = 0; var20 < this.field6614; var20++) {
                    class196 var21 = this.field6652[var20];
                    class481 var22 = this.field6634[var20];
                    var22.field7055 = 255 - (this.field6658[var21.field2892] & 0xFF) << 24 | var22.field7055 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field6699; var24++) {
                int var28 = this.field6656[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var29 + arg1 & 0x3F;
                int var32 = var28 & 0x7F;
                int var33 = arg2 / 4 + var30;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                int var34 = arg3 + var32;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field6656[var24] = (short) class29.method239(class29.method239(var31 << 10, var33 << 7), var34);
            }
            if (this.field6678 != null) {
                this.field6678.field2921 = null;
            }
            if (this.field6652 != null) {
                for (int var25 = 0; var25 < this.field6614; var25++) {
                    class196 var26 = this.field6652[var25];
                    class481 var27 = this.field6634[var25];
                    var27.field7055 = var27.field7055 & 0xFF000000 | class430.field6265[this.field6656[var26.field2892] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field6614; var35++) {
                class481 var36 = this.field6634[var35];
                var36.field7064 += arg2;
                var36.field7056 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field6614; var37++) {
                class481 var38 = this.field6634[var37];
                var38.field7062 = var38.field7062 * arg1 >> 7;
                var38.field7060 = var38.field7060 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field6614; var39++) {
                class481 var40 = this.field6634[var39];
                var40.field7057 = var40.field7057 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "()V", line = 5522)
    public final void method891() {
        field6707++;
        if (this.field6622 <= 0 || this.field6691 <= 0) {
            return;
        }
        this.method2728(false, false);
        if ((this.field6714 & 0x10) == 0 && this.field6625.field2913 == null) {
            this.method2724(false, -1);
        }
        this.method2722(98);
    }

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "()I", line = 5537)
    public final int method899() {
        field6655++;
        return this.field6608;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IFLlo;IIFIIIJ)S", line = 5548)
    private final short method2733(int arg0, float arg1, class527 arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, long arg9) {
        field6659++;
        int var12 = this.field6604[arg8];
        int var13 = this.field6604[arg8 + 1];
        int var14 = 0;
        int var15 = var12;
        if (arg7 != -32216) {
            this.field6639 = 85;
        }
        while (var15 < var13) {
            short var16 = this.field6671[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class507.field7422[var15] == arg9) {
                return (short) (var16 - 1);
            }
            var15++;
        }
        this.field6671[var14] = (short) (this.field6622 + 1);
        class507.field7422[var14] = arg9;
        this.field6692[this.field6622] = (short) arg4;
        this.field6664[this.field6622] = (short) arg3;
        this.field6610[this.field6622] = (short) arg0;
        this.field6673[this.field6622] = (byte) arg6;
        this.field6690[this.field6622] = arg1;
        this.field6646[this.field6622] = arg5;
        return (short) (this.field6622++);
    }

    @OriginalMember(owner = "client!ph", name = "FA", descriptor = "()Z", line = 6621)
    public final boolean method901() {
        field6688++;
        if (this.field6702 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field6621; var1++) {
            this.field6605[var1] <<= 0x4;
            this.field6698[var1] <<= 0x4;
            this.field6686[var1] <<= 0x4;
        }
        class113.field1802 = 0;
        class511.field7547 = 0;
        class51.field747 = 0;
        return true;
    }
}
