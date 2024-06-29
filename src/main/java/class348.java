import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class348 extends class471 {

    @OriginalMember(owner = "client!ko", name = "X", descriptor = "Z")
    private boolean field5014 = false;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    private int field4981 = 0;

    @OriginalMember(owner = "client!ko", name = "Q", descriptor = "I")
    private int field5007 = 0;

    @OriginalMember(owner = "client!ko", name = "V", descriptor = "I")
    private int field5012 = 0;

    @OriginalMember(owner = "client!ko", name = "Rb", descriptor = "I")
    private int field5060 = 0;

    @OriginalMember(owner = "client!ko", name = "bc", descriptor = "I")
    private int field5070 = 0;

    @OriginalMember(owner = "client!ko", name = "mc", descriptor = "Z")
    private boolean field5081 = true;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "Lef;")
    private class338 field4982;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "Lwc;")
    private class48 field4978;

    @OriginalMember(owner = "client!ko", name = "jc", descriptor = "Lwc;")
    private class48 field5078;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "Lwc;")
    private class48 field4991;

    @OriginalMember(owner = "client!ko", name = "rb", descriptor = "Lwc;")
    private class48 field5034;

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "Ldv;")
    private class467 field5000;

    @OriginalMember(owner = "client!ko", name = "vb", descriptor = "I")
    private int field5038;

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
    private int field4993;

    @OriginalMember(owner = "client!ko", name = "dc", descriptor = "[I")
    private int[] field5072;

    @OriginalMember(owner = "client!ko", name = "ic", descriptor = "[S")
    private short[] field5077;

    @OriginalMember(owner = "client!ko", name = "Kb", descriptor = "[I")
    private int[] field5053;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "[I")
    private int[] field4985;

    @OriginalMember(owner = "client!ko", name = "Nb", descriptor = "[I")
    private int[] field5056;

    @OriginalMember(owner = "client!ko", name = "cc", descriptor = "[Lpd;")
    private class169[] field5071;

    @OriginalMember(owner = "client!ko", name = "fc", descriptor = "[Lqc;")
    private class521[] field5074;

    @OriginalMember(owner = "client!ko", name = "gc", descriptor = "I")
    private int field5075;

    @OriginalMember(owner = "client!ko", name = "zb", descriptor = "[Lbi;")
    private class336[] field5042;

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "[Lhs;")
    private class214[] field5001;

    @OriginalMember(owner = "client!ko", name = "Mb", descriptor = "[F")
    private float[] field5055;

    @OriginalMember(owner = "client!ko", name = "qb", descriptor = "[S")
    private short[] field5033;

    @OriginalMember(owner = "client!ko", name = "ub", descriptor = "S")
    private short field5037;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "[S")
    private short[] field4987;

    @OriginalMember(owner = "client!ko", name = "T", descriptor = "[S")
    private short[] field5010;

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "[S")
    private short[] field5004;

    @OriginalMember(owner = "client!ko", name = "sc", descriptor = "[B")
    private byte[] field5087;

    @OriginalMember(owner = "client!ko", name = "nb", descriptor = "[S")
    private short[] field5030;

    @OriginalMember(owner = "client!ko", name = "Db", descriptor = "[S")
    private short[] field5046;

    @OriginalMember(owner = "client!ko", name = "hc", descriptor = "[B")
    private byte[] field5076;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "[S")
    private short[] field4984;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "[F")
    private float[] field4995;

    @OriginalMember(owner = "client!ko", name = "S", descriptor = "S")
    private short field5009;

    @OriginalMember(owner = "client!ko", name = "Xb", descriptor = "[S")
    private short[] field5066;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "[S")
    private short[] field4979;

    @OriginalMember(owner = "client!ko", name = "Wb", descriptor = "[S")
    private short[] field5065;

    @OriginalMember(owner = "client!ko", name = "Ob", descriptor = "[I")
    private int[] field5057;

    @OriginalMember(owner = "client!ko", name = "Hb", descriptor = "[[I")
    private int[][] field5050;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "[[I")
    private int[][] field4983;

    @OriginalMember(owner = "client!ko", name = "Bb", descriptor = "[[I")
    private int[][] field5044;

    @OriginalMember(owner = "client!ko", name = "Ab", descriptor = "Lqp;")
    public static class466 field5043 = new class466("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!ko", name = "oc", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field5083;

    @OriginalMember(owner = "client!ko", name = "uc", descriptor = "[B")
    public static byte[] field5089;

    @OriginalMember(owner = "client!ko", name = "ab", descriptor = "B")
    private byte field5017;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!ko", name = "G", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!ko", name = "O", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!ko", name = "R", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!ko", name = "U", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!ko", name = "W", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!ko", name = "Y", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!ko", name = "Z", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!ko", name = "bb", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!ko", name = "cb", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!ko", name = "db", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!ko", name = "eb", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!ko", name = "fb", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!ko", name = "gb", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!ko", name = "hb", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!ko", name = "ib", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!ko", name = "jb", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!ko", name = "lb", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!ko", name = "ob", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!ko", name = "pb", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!ko", name = "sb", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!ko", name = "tb", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!ko", name = "xb", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!ko", name = "yb", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!ko", name = "Cb", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!ko", name = "Eb", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!ko", name = "Fb", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!ko", name = "Ib", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!ko", name = "Lb", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!ko", name = "Qb", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!ko", name = "Sb", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!ko", name = "Tb", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!ko", name = "Ub", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!ko", name = "Vb", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!ko", name = "Zb", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!ko", name = "ac", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!ko", name = "ec", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!ko", name = "kc", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!ko", name = "lc", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!ko", name = "nc", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!ko", name = "pc", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!ko", name = "qc", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!ko", name = "rc", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!ko", name = "tc", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "Lrt;")
    private class151 field4999;

    @OriginalMember(owner = "client!ko", name = "wb", descriptor = "Lap;")
    private class334 field5039;

    @OriginalMember(owner = "client!ko", name = "kb", descriptor = "Lnd;")
    private class381 field5027;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "S")
    private short field4977;

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "S")
    private short field5006;

    @OriginalMember(owner = "client!ko", name = "mb", descriptor = "S")
    private short field5029;

    @OriginalMember(owner = "client!ko", name = "Gb", descriptor = "S")
    private short field5049;

    @OriginalMember(owner = "client!ko", name = "Jb", descriptor = "S")
    private short field5052;

    @OriginalMember(owner = "client!ko", name = "Pb", descriptor = "S")
    private short field5058;

    @OriginalMember(owner = "client!ko", name = "Yb", descriptor = "S")
    private short field5067;

    static {
        new class187("", 73);
        field5083 = new CRC32();
        field5089 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
    }

    @OriginalMember(owner = "client!ko", name = "UA", descriptor = "(I)V", line = 4)
    public final void method402(int arg0) {
        field5064++;
        this.field4993 = arg0;
        this.field5081 = true;
        if (this.field5027 != null && (this.field4993 & 0x10000) == 0) {
            this.field5033 = this.field5027.field5570;
            this.field5087 = this.field5027.field5569;
            this.field5004 = this.field5027.field5563;
            this.field5066 = this.field5027.field5568;
            this.field5027 = null;
        }
        this.method2069((byte) 92);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(SIBIB)I", line = 27)
    private final int method2053(short arg0, int arg1, byte arg2, int arg3, byte arg4) {
        field4986++;
        if (arg4 >= -60) {
            return 41;
        }
        int var6 = class166.field2487[class336.method1921(arg3, (byte) -32, arg1)];
        if (arg0 != -1) {
            class166 var7 = this.field4982.field471.method1654(84, arg0 & 0xFFFF);
            int var8 = var7.field2486 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg3 < 0) {
                    var9 = 0;
                } else if (arg3 <= 127) {
                    var9 = arg3 * 131586;
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
            int var12 = var7.field2499 & 0xFF;
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
                var6 = (var15 >> 8) + (var13 << 8 & 0xFF0021) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg2 & 0xFF);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ltc;I)V", line = 104)
    private final void method2054(class234 arg0, int arg1) {
        field4994++;
        if (this.field5074 != null) {
            for (int var3 = 0; var3 < this.field5074.length; var3++) {
                class521 var4 = this.field5074[var3];
                class521 var5 = var4;
                if (var4.field7715 != null) {
                    var5 = var4.field7715;
                }
                var5.field7713 = (int) ((float) this.field4985[var4.field7726] * arg0.field3326 + (float) this.field5056[var4.field7726] * arg0.field3296 + (float) this.field5053[var4.field7726] * arg0.field3309 + arg0.field3313);
                var5.field7716 = (int) ((float) this.field4985[var4.field7726] * arg0.field3323 + (float) this.field5056[var4.field7726] * arg0.field3319 + (float) this.field5053[var4.field7726] * arg0.field3297 + arg0.field3328);
                var5.field7714 = (int) ((float) this.field4985[var4.field7726] * arg0.field3317 + (float) this.field5056[var4.field7726] * arg0.field3329 + (float) this.field5053[var4.field7726] * arg0.field3314 + arg0.field3312);
                var5.field7718 = (int) ((float) this.field4985[var4.field7719] * arg0.field3326 + (float) this.field5056[var4.field7719] * arg0.field3296 + (float) this.field5053[var4.field7719] * arg0.field3309 + arg0.field3313);
                var5.field7712 = (int) ((float) this.field4985[var4.field7719] * arg0.field3323 + (float) this.field5056[var4.field7719] * arg0.field3319 + (float) this.field5053[var4.field7719] * arg0.field3297 + arg0.field3328);
                var5.field7708 = (int) ((float) this.field4985[var4.field7719] * arg0.field3317 + (float) this.field5056[var4.field7719] * arg0.field3329 + (float) this.field5053[var4.field7719] * arg0.field3314 + arg0.field3312);
                var5.field7710 = (int) ((float) this.field4985[var4.field7722] * arg0.field3326 + (float) this.field5056[var4.field7722] * arg0.field3296 + (float) this.field5053[var4.field7722] * arg0.field3309 + arg0.field3313);
                var5.field7711 = (int) ((float) this.field4985[var4.field7722] * arg0.field3323 + (float) this.field5056[var4.field7722] * arg0.field3319 + (float) this.field5053[var4.field7722] * arg0.field3297 + arg0.field3328);
                var5.field7717 = (int) ((float) this.field4985[var4.field7722] * arg0.field3317 + (float) this.field5056[var4.field7722] * arg0.field3329 + (float) this.field5053[var4.field7722] * arg0.field3314 + arg0.field3312);
            }
        }
        if (this.field5071 != null) {
            for (int var6 = 0; var6 < this.field5071.length; var6++) {
                class169 var7 = this.field5071[var6];
                class169 var8 = var7;
                if (var7.field2528 != null) {
                    var8 = var7.field2528;
                }
                if (var7.field2518 == null) {
                    var7.field2518 = arg0.method189();
                } else {
                    var7.field2518.method192(arg0);
                }
                var8.field2526 = (int) ((float) this.field4985[var7.field2524] * arg0.field3326 + (float) this.field5056[var7.field2524] * arg0.field3296 + (float) this.field5053[var7.field2524] * arg0.field3309 + arg0.field3313);
                var8.field2520 = (int) ((float) this.field4985[var7.field2524] * arg0.field3323 + (float) this.field5056[var7.field2524] * arg0.field3319 + (float) this.field5053[var7.field2524] * arg0.field3297 + arg0.field3328);
                var8.field2529 = (int) ((float) this.field4985[var7.field2524] * arg0.field3317 + (float) this.field5056[var7.field2524] * arg0.field3329 + (float) this.field5053[var7.field2524] * arg0.field3314 + arg0.field3312);
            }
        }
        int var9 = -80 % ((-arg1 - 51) / 48);
    }

    @OriginalMember(owner = "client!ko", name = "NA", descriptor = "()I", line = 171)
    public final int method394() {
        field5041++;
        if (!this.field5014) {
            this.method2061(-123);
        }
        return this.field5067;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 182)
    private final void method2055(int arg0) {
        field5023++;
        if (this.field5060 == 0) {
            return;
        }
        if (arg0 < 112) {
            this.field5029 = -17;
        }
        if (this.field5017 != 0) {
            this.method2068(true, -1);
        }
        this.method2068(false, -1);
        if (this.field5000 != null) {
            if (this.field5000.field6845 == null) {
                this.method2063((byte) -73, (this.field5017 & 0x10) != 0);
            }
            if (this.field5000.field6845 != null) {
                this.field4982.method1937(this.field4991 != null, -79);
                this.field4982.method1968(this.field4978, this.field5034, 112, this.field4991, this.field5078);
                int var2 = this.field5057.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field5057[var3];
                    int var5 = this.field5057[var3 + 1];
                    int var6 = this.field5065[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field4982.method1997(this.field4991 != null, var6, 0);
                    this.field4982.method1981((byte) -106, (var5 - var4) * 3, var4 * 3, 4, this.field5000.field6845);
                }
            }
        }
        this.method2069((byte) 29);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lc;Lii;II)V", line = 242)
    public final void method384(class122 arg0, class387 arg1, int arg2, int arg3) {
        field5084++;
        if (this.field5012 == 0) {
            return;
        }
        class234 var5 = this.field4982.field4818;
        class234 var6 = (class234) arg0;
        if (!this.field5014) {
            this.method2061(122);
        }
        class14.field207 = var5.field3317 * var6.field3329 + var5.field3329 * var6.field3319 + var5.field3314 * var6.field3296;
        class78.field1132 = var5.field3317 * var6.field3312 + var5.field3329 * var6.field3328 + var5.field3314 * var6.field3313 + var5.field3312;
        float var7 = (float) this.field5006 * class14.field207 + class78.field1132;
        float var8 = (float) this.field5049 * class14.field207 + class78.field1132;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var10 = (float) (-this.field5058) + var8;
            var9 = (float) this.field5058 + var7;
        } else {
            var9 = (float) this.field5058 + var8;
            var10 = var7 - (float) this.field5058;
        }
        if ((var10 >= this.field4982.field4771) || ((float) this.field4982.field4828 >= var9)) {
            return;
        }
        class420.field6145 = var5.field3326 * var6.field3312 + var5.field3309 * var6.field3313 + var5.field3296 * var6.field3328 + var5.field3313;
        class122.field1824 = var5.field3326 * var6.field3329 + var5.field3309 * var6.field3296 + var5.field3296 * var6.field3319;
        float var11 = (float) this.field5006 * class122.field1824 + class420.field6145;
        float var12 = (float) this.field5049 * class122.field1824 + class420.field6145;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var14 = ((float) this.field5058 + var11) * (float) this.field4982.field4791;
            var13 = (var12 - (float) this.field5058) * (float) this.field4982.field4791;
        } else {
            var13 = ((float) (-this.field5058) + var11) * (float) this.field4982.field4791;
            var14 = ((float) this.field5058 + var12) * (float) this.field4982.field4791;
        }
        if ((this.field4982.field4770 <= var13 / (float) arg2) || (this.field4982.field4837 >= var14 / (float) arg2)) {
            return;
        }
        class307.field4174 = var5.field3323 * var6.field3312 + var5.field3319 * var6.field3328 + var5.field3297 * var6.field3313 + var5.field3328;
        class36.field458 = var5.field3323 * var6.field3329 + var5.field3319 * var6.field3319 + var5.field3297 * var6.field3296;
        float var15 = (float) this.field5006 * class36.field458 + class307.field4174;
        float var16 = (float) this.field5049 * class36.field458 + class307.field4174;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var17 = ((float) (-this.field5058) + var16) * (float) this.field4982.field4789;
            var18 = ((float) this.field5058 + var15) * (float) this.field4982.field4789;
        } else {
            var17 = (var15 - (float) this.field5058) * (float) this.field4982.field4789;
            var18 = ((float) this.field5058 + var16) * (float) this.field4982.field4789;
        }
        if ((var17 / (float) arg2 >= this.field4982.field4808) || (var18 / (float) arg2 <= this.field4982.field4796)) {
            return;
        }
        if (arg1 != null || this.field5001 != null) {
            class117.field1755 = var5.field3317 * var6.field3317 + var5.field3329 * var6.field3323 + var5.field3314 * var6.field3326;
            class389.field5665 = var5.field3323 * var6.field3317 + var5.field3319 * var6.field3323 + var5.field3297 * var6.field3326;
            class168.field2516 = var5.field3326 * var6.field3314 + var5.field3309 * var6.field3309 + var5.field3296 * var6.field3297;
            class98.field1482 = var5.field3323 * var6.field3314 + var5.field3319 * var6.field3297 + var5.field3297 * var6.field3309;
            class200.field2830 = var5.field3326 * var6.field3317 + var5.field3309 * var6.field3326 + var5.field3296 * var6.field3323;
            class200.field2831 = var5.field3317 * var6.field3314 + var5.field3329 * var6.field3297 + var5.field3314 * var6.field3309;
        }
        if (arg1 != null) {
            int var19 = this.field4977 + this.field5067 >> 1;
            int var20 = this.field5052 + this.field5029 >> 1;
            int var21 = (int) ((float) var20 * class200.field2830 + (float) this.field5006 * class122.field1824 + (float) var19 * class168.field2516 + class420.field6145);
            int var22 = (int) ((float) var20 * class389.field5665 + (float) this.field5006 * class36.field458 + (float) var19 * class98.field1482 + class307.field4174);
            int var23 = (int) ((float) var20 * class117.field1755 + (float) this.field5006 * class14.field207 + (float) var19 * class200.field2831 + class78.field1132);
            int var24 = (int) ((float) var20 * class200.field2830 + (float) this.field5049 * class122.field1824 + (float) var19 * class168.field2516 + class420.field6145);
            int var25 = (int) ((float) var20 * class389.field5665 + (float) this.field5049 * class36.field458 + (float) var19 * class98.field1482 + class307.field4174);
            arg1.field5643 = this.field4982.field4791 * var21 / arg2 + this.field4982.field4885;
            arg1.field5645 = this.field4982.field4789 * var22 / arg2 + this.field4982.field4816;
            arg1.field5640 = this.field4982.field4791 * var24 / arg2 + this.field4982.field4885;
            int var26 = (int) ((float) var20 * class117.field1755 + (float) this.field5049 * class14.field207 + (float) var19 * class200.field2831 + class78.field1132);
            arg1.field5642 = this.field4982.field4789 * var25 / arg2 + this.field4982.field4816;
            if (this.field4982.field4828 > var23 && var26 < this.field4982.field4828) {
                arg1.field5641 = (var21 + this.field5058) * this.field4982.field4791 / arg2 + this.field4982.field4885 - arg1.field5643;
                arg1.field5644 = true;
            }
        }
        this.field4982.method1928((float) arg2, true);
        this.field4982.method1995((byte) 114);
        this.field4982.method1948(var6, true);
        this.method2055(117);
        this.field4982.method1954(34162);
        this.method2062(true);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lfk;B)V", line = 389)
    private final void method2056(class462 arg0, byte arg1) {
        field4996++;
        if (this.field5012 > class207.field2895.length) {
            class278.field3811 = new int[this.field5012];
            class207.field2895 = new int[this.field5012];
        }
        for (int var3 = 0; var3 < this.field5007; var3++) {
            int var15 = (this.field5053[var3] - (this.field5056[var3] * this.field4982.field4836 >> 8) >> this.field4982.field4744) - arg0.field6795;
            int var16 = (this.field4985[var3] - (this.field5056[var3] * this.field4982.field4887 >> 8) >> this.field4982.field4744) - arg0.field6798;
            int var17 = this.field5072[var3];
            int var18 = this.field5072[var3 + 1];
            for (int var19 = var17; var19 < var18; var19++) {
                int var20 = this.field4987[var19] - 1;
                if (var20 == -1) {
                    break;
                }
                class207.field2895[var20] = var15;
                class278.field3811[var20] = var16;
            }
        }
        for (int var4 = 0; var4 < this.field5060; var4++) {
            if (this.field5076 == null || this.field5076[var4] <= 128) {
                short var6 = this.field5030[var4];
                short var7 = this.field4984[var4];
                short var8 = this.field5046[var4];
                int var9 = class207.field2895[var6];
                int var10 = class207.field2895[var7];
                int var11 = class207.field2895[var8];
                int var12 = class278.field3811[var6];
                int var13 = class278.field3811[var7];
                int var14 = class278.field3811[var8];
                if ((var9 - var10) * (var13 - var14) - ((var11 - var10) * (var13 - var12)) > 0) {
                    arg0.method2715(var14, var12, var11, var13, var9, var10, (byte) 57);
                }
            }
        }
        int var5 = -103 % ((arg1 + 18) / 57);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILc;Z)Z", line = 486)
    public final boolean method391(int arg0, int arg1, class122 arg2, boolean arg3) {
        field5080++;
        class234 var5 = (class234) arg2;
        class234 var6 = this.field4982.field4818;
        float var7 = var5.field3312 * var6.field3326 + var5.field3328 * var6.field3296 + var5.field3313 * var6.field3309 + var6.field3313;
        float var8 = var5.field3312 * var6.field3323 + var5.field3328 * var6.field3319 + var5.field3313 * var6.field3297 + var6.field3328;
        class122.field1824 = var5.field3329 * var6.field3326 + var5.field3319 * var6.field3296 + var5.field3296 * var6.field3309;
        class14.field207 = var5.field3329 * var6.field3317 + var5.field3319 * var6.field3329 + var5.field3296 * var6.field3314;
        float var9 = var5.field3312 * var6.field3317 + var5.field3328 * var6.field3329 + var5.field3313 * var6.field3314 + var6.field3312;
        class200.field2830 = var5.field3317 * var6.field3326 + var5.field3326 * var6.field3309 + var5.field3323 * var6.field3296;
        class117.field1755 = var5.field3317 * var6.field3317 + var5.field3326 * var6.field3314 + var5.field3323 * var6.field3329;
        class168.field2516 = var5.field3314 * var6.field3326 + var5.field3309 * var6.field3309 + var5.field3297 * var6.field3296;
        class36.field458 = var5.field3329 * var6.field3323 + var5.field3319 * var6.field3319 + var5.field3296 * var6.field3297;
        class98.field1482 = var5.field3314 * var6.field3323 + var5.field3309 * var6.field3297 + var5.field3297 * var6.field3319;
        class200.field2831 = var5.field3314 * var6.field3317 + var5.field3309 * var6.field3314 + var5.field3297 * var6.field3329;
        class389.field5665 = var5.field3317 * var6.field3323 + var5.field3326 * var6.field3297 + var5.field3323 * var6.field3319;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field4982.field4791;
        int var16 = this.field4982.field4789;
        if (!this.field5014) {
            this.method2061(-121);
        }
        class143.field2058[0] = this.field4977;
        class512.field7595[0] = this.field5006;
        class143.field2058[1] = this.field5067;
        class216.field3011[0] = this.field5052;
        class512.field7595[1] = this.field5006;
        class143.field2058[2] = this.field4977;
        class216.field3011[1] = this.field5052;
        class512.field7595[2] = this.field5049;
        class143.field2058[3] = this.field5067;
        class216.field3011[2] = this.field5052;
        class512.field7595[3] = this.field5049;
        class216.field3011[3] = this.field5052;
        class143.field2058[4] = this.field4977;
        class512.field7595[4] = this.field5006;
        class216.field3011[4] = this.field5029;
        class143.field2058[5] = this.field5067;
        class512.field7595[5] = this.field5006;
        class143.field2058[6] = this.field4977;
        class216.field3011[5] = this.field5029;
        class512.field7595[6] = this.field5049;
        class143.field2058[7] = this.field5067;
        class216.field3011[6] = this.field5029;
        class512.field7595[7] = this.field5049;
        class216.field3011[7] = this.field5029;
        for (int var17 = 0; var17 < 8; var17++) {
            float var36 = (float) class216.field3011[var17];
            float var37 = (float) class512.field7595[var17];
            float var38 = (float) class143.field2058[var17];
            float var39 = class117.field1755 * var36 + class200.field2831 * var38 + class14.field207 * var37 + var9;
            float var40 = class200.field2830 * var36 + class168.field2516 * var38 + class122.field1824 * var37 + var7;
            float var41 = class389.field5665 * var36 + class98.field1482 * var38 + class36.field458 * var37 + var8;
            if (var39 >= (float) this.field4982.field4828) {
                float var42 = (float) var15 * var40 / var39 + (float) this.field4982.field4885;
                float var43 = (float) var16 * var41 / var39 + (float) this.field4982.field4816;
                if (var42 < var11) {
                    var11 = var42;
                }
                if (var42 > var12) {
                    var12 = var42;
                }
                if (var14 < var43) {
                    var14 = var43;
                }
                if (var13 > var43) {
                    var13 = var43;
                }
                var10 = true;
            }
        }
        if (var10 && (float) arg0 > var11 && var12 > (float) arg0 && (float) arg1 > var13 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (class207.field2895.length < this.field5012) {
                class207.field2895 = new int[this.field5012];
                class278.field3811 = new int[this.field5012];
            }
            for (int var18 = 0; var18 < this.field5007; var18++) {
                float var20 = (float) this.field5053[var18];
                float var21 = (float) this.field5056[var18];
                float var22 = (float) this.field4985[var18];
                float var23 = class389.field5665 * var22 + class98.field1482 * var20 + class36.field458 * var21 + var8;
                float var24 = class200.field2830 * var22 + class168.field2516 * var20 + class122.field1824 * var21 + var7;
                float var25 = class117.field1755 * var22 + class200.field2831 * var20 + class14.field207 * var21 + var9;
                if ((float) this.field4982.field4828 <= var25) {
                    int var26 = (int) ((float) var15 * var24 / var25 + (float) this.field4982.field4885);
                    int var27 = (int) ((float) var16 * var23 / var25 + (float) this.field4982.field4816);
                    int var28 = this.field5072[var18];
                    int var29 = this.field5072[var18 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field4987[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        class207.field2895[var31] = var26;
                        class278.field3811[var31] = var27;
                    }
                } else {
                    int var32 = this.field5072[var18];
                    int var33 = this.field5072[var18 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field4987[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        class207.field2895[this.field4987[var34] - 1] = -999999;
                    }
                }
            }
            for (int var19 = 0; var19 < this.field4981; var19++) {
                if (class207.field2895[this.field5030[var19]] != -999999 && class207.field2895[this.field4984[var19]] != -999999 && class207.field2895[this.field5046[var19]] != -999999 && this.method2066(class207.field2895[this.field5046[var19]], class278.field3811[this.field5046[var19]], arg0, class278.field3811[this.field4984[var19]], 32767, class207.field2895[this.field4984[var19]], class278.field3811[this.field5030[var19]], class207.field2895[this.field5030[var19]], arg1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ko", name = "R", descriptor = "(I)V", line = 691)
    public final void method409(int arg0) {
        field5016++;
        int var2 = class183.field2684[arg0];
        int var3 = class183.field2678[arg0];
        for (int var4 = 0; var4 < this.field5007; var4++) {
            int var5 = this.field5056[var4] * var2 + this.field5053[var4] * var3 >> 15;
            this.field5056[var4] = this.field5056[var4] * var3 - (this.field5053[var4] * var2) >> 15;
            this.field5053[var4] = var5;
        }
        this.field5014 = false;
        if (this.field4978 != null) {
            this.field4978.field571 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V", line = 723)
    public static final void method2057(boolean arg0) {
        class410[] var1 = class281.field3858;
        synchronized (class281.field3858) {
            for (int var2 = 0; var2 < class281.field3858.length; var2++) {
                class281.field3858[var2] = new class410();
                class487.field7131[var2] = 0;
            }
            if (!arg0) {
                method2060((byte) -32, 50);
            }
        }
        field4990++;
    }

    @OriginalMember(owner = "client!ko", name = "WA", descriptor = "()I", line = 748)
    public final int method395() {
        if (!this.field5014) {
            this.method2061(124);
        }
        field5054++;
        return this.field5049;
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "()V", line = 762)
    public final void method371() {
        field5047++;
        if (this.field5012 <= 0 || this.field5060 <= 0) {
            return;
        }
        this.method2068(false, -1);
        if ((this.field5017 & 0x10) == 0 && this.field5000.field6845 == null) {
            this.method2063((byte) 90, false);
        }
        this.method2069((byte) 110);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(FLkq;FIIIIBIJ)S", line = 780)
    private final short method2058(float arg0, class419 arg1, float arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, long arg9) {
        field4997++;
        int var12 = this.field5072[arg6];
        int var13 = this.field5072[arg6 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field4987[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class446.field6576[var15] == arg9) {
                return (short) (var16 - 1);
            }
        }
        this.field4987[var14] = (short) (this.field5012 + 1);
        class446.field6576[var14] = arg9;
        this.field5004[this.field5012] = (short) arg4;
        int var17 = -113 / ((arg7 - 57) / 39);
        this.field5033[this.field5012] = (short) arg5;
        this.field5066[this.field5012] = (short) arg8;
        this.field5087[this.field5012] = (byte) arg3;
        this.field5055[this.field5012] = arg0;
        this.field4995[this.field5012] = arg2;
        return (short) (this.field5012++);
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V", line = 825)
    public static void method2059(int arg0) {
        field5083 = null;
        field5089 = null;
        if (arg0 == 383495064) {
            field5043 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "()[Lpd;", line = 838)
    public final class169[] method374() {
        field5048++;
        return this.field5071;
    }

    @OriginalMember(owner = "client!ko", name = "JA", descriptor = "(III)V", line = 848)
    public final void method392(int arg0, int arg1, int arg2) {
        field5073++;
        for (int var4 = 0; var4 < this.field5007; var4++) {
            if (arg0 != 0) {
                this.field5053[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field5056[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field4985[var4] += arg2;
            }
        }
        if (this.field4978 != null) {
            this.field4978.field571 = null;
        }
        this.field5014 = false;
    }

    @OriginalMember(owner = "client!ko", name = "aa", descriptor = "(I)V", line = 880)
    public final void method383(int arg0) {
        field5025++;
        this.field5037 = (short) arg0;
        if (this.field5034 != null) {
            this.field5034.field571 = null;
        }
        if (this.field4991 != null) {
            this.field4991.field571 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "BA", descriptor = "(SS)V", line = 897)
    public final void method408(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4981; var3++) {
            if (this.field5010[var3] == arg0) {
                this.field5010[var3] = arg1;
            }
        }
        field4998++;
        if (this.field5001 != null) {
            for (int var4 = 0; var4 < this.field5075; var4++) {
                class214 var5 = this.field5001[var4];
                class336 var6 = this.field5042[var4];
                var6.field4523 = var6.field4523 & 0xFF000000 | class166.field2487[this.field5010[var5.field2993] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5034 != null) {
            this.field5034.field571 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "(IILta;Lta;III)V", line = 937)
    public final void method405(int arg0, int arg1, class142 arg2, class142 arg3, int arg4, int arg5, int arg6) {
        field5040++;
        if (!this.field5014) {
            this.method2061(112);
        }
        int var8 = this.field4977 + arg4;
        int var9 = this.field5067 + arg4;
        int var10 = this.field5052 + arg6;
        int var11 = arg6 + this.field5029;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field2030 + var9 >> arg2.field2035 >= arg2.field2037 || var10 < 0 || arg2.field2030 + var11 >> arg2.field2035 >= arg2.field2031) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field2037 <= (arg3.field2030 + var9 >> arg3.field2035) || var10 < 0 || arg3.field2031 <= var11 + arg3.field2030 >> arg3.field2035) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field2035;
            int var13 = var9 - (1 - arg2.field2030) >> arg2.field2035;
            int var14 = var10 >> arg2.field2035;
            int var15 = arg2.field2030 + var11 - 1 >> arg2.field2035;
            if (arg5 == arg2.method351(var12, var14) && arg5 == arg2.method351(var13, var14) && arg2.method351(var12, var15) == arg5 && arg2.method351(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field5007; var16++) {
                this.field5056[var16] -= arg5 - arg2.method361(this.field5053[var16] + arg4, this.field4985[var16] + arg6);
            }
        } else if (arg0 == 2) {
            short var17 = this.field5006;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field5007; var18++) {
                int var19 = (this.field5056[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field5056[var18] -= -((arg2.method361(this.field5053[var18] + arg4, this.field4985[var18] + arg6) - arg5) * (arg1 - var19) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = ((arg1 & 0xFFBA) >> 8) * 4;
            int var22 = arg1 >> 16 & 0xFF << 6;
            int var23 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var20 >> 1) < 0 || ((var20 >> 1) + arg4 + arg2.field2030) >= (arg2.field2037 << arg2.field2035) || arg6 - (var21 >> 1) < 0 || arg6 + (var21 >> 1) + arg2.field2030 >= arg2.field2031 << arg2.field2035) {
                return;
            }
            this.method2776(81, arg5, var21, var20, arg2, var22, arg4, arg6, var23);
        } else if (arg0 == 4) {
            int var31 = this.field5049 - this.field5006;
            for (int var32 = 0; var32 < this.field5007; var32++) {
                this.field5056[var32] -= (arg5 - var31) - arg3.method361(this.field5053[var32] + arg4, this.field4985[var32] + arg6);
            }
        } else if (arg0 == 5) {
            int var24 = this.field5049 - this.field5006;
            for (int var25 = 0; var25 < this.field5007; var25++) {
                int var26 = this.field5053[var25] + arg4;
                int var27 = this.field4985[var25] + arg6;
                int var28 = arg2.method361(var26, var27);
                int var29 = arg3.method361(var26, var27);
                int var30 = var28 - var29;
                this.field5056[var25] = -arg5 - (-var28 - ((this.field5056[var25] << 8) / var24 * var30 >> 8));
            }
        }
        if (this.field4978 != null) {
            this.field4978.field571 = null;
        }
        this.field5014 = false;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII)V", line = 1095)
    public final void method390(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field4981; var5++) {
            int var9 = this.field5010[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x3C4) >> 7;
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field5010[var5] = (short) class255.method1532(var12, class255.method1532(var11 << 7, var10 << 10));
        }
        field5024++;
        if (this.field5001 != null) {
            for (int var6 = 0; var6 < this.field5075; var6++) {
                class214 var7 = this.field5001[var6];
                class336 var8 = this.field5042[var6];
                var8.field4523 = var8.field4523 & 0xFF000000 | class166.field2487[this.field5010[var7.field2993] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5034 != null) {
            this.field5034.field571 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "MA", descriptor = "()I", line = 1156)
    public final int method380() {
        field5019++;
        if (!this.field5014) {
            this.method2061(-128);
        }
        return this.field5006;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)I", line = 1169)
    public static final int method2060(byte arg0, int arg1) {
        field5021++;
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xFF) >> 6;
        if (arg0 <= 123) {
            field5089 = null;
        }
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ko", name = "fa", descriptor = "(Lba;)Lba;", line = 1224)
    public final class263 method369(class263 arg0) {
        field4992++;
        if (this.field5012 == 0) {
            return null;
        }
        if (!this.field5014) {
            this.method2061(-127);
        }
        int var2;
        int var3;
        if (this.field4982.field4836 > 0) {
            var2 = this.field4977 - (this.field4982.field4836 * this.field5049 >> 8) >> this.field4982.field4744;
            var3 = this.field5067 - (this.field4982.field4836 * this.field5006 >> 8) >> this.field4982.field4744;
        } else {
            var2 = this.field4977 - (this.field4982.field4836 * this.field5006 >> 8) >> this.field4982.field4744;
            var3 = this.field5067 - (this.field4982.field4836 * this.field5049 >> 8) >> this.field4982.field4744;
        }
        int var4;
        int var5;
        if (this.field4982.field4887 > 0) {
            var4 = this.field5052 - (this.field4982.field4887 * this.field5049 >> 8) >> this.field4982.field4744;
            var5 = this.field5029 - (this.field4982.field4887 * this.field5006 >> 8) >> this.field4982.field4744;
        } else {
            var4 = this.field5052 - (this.field4982.field4887 * this.field5006 >> 8) >> this.field4982.field4744;
            var5 = this.field5029 - (this.field4982.field4887 * this.field5049 >> 8) >> this.field4982.field4744;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class462 var8 = (class462) arg0;
        class462 var9;
        if (var8 != null && var8.method2718(var7, 6, var6)) {
            var9 = var8;
            var8.method2717(104);
        } else {
            var9 = new class462(this.field4982, var6, var7);
        }
        var9.method2716(var2, var4, var5, (byte) -115, var3);
        this.method2056(var9, (byte) -111);
        return var9;
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V", line = 1287)
    private final void method2061(int arg0) {
        field5015++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field5007; var10++) {
            int var12 = this.field5053[var10];
            int var13 = this.field5056[var10];
            int var14 = this.field4985[var10];
            if (var13 < var3) {
                var3 = var13;
            }
            if (var12 > var5) {
                var5 = var12;
            }
            if (var2 > var12) {
                var2 = var12;
            }
            if (var13 > var6) {
                var6 = var13;
            }
            if (var14 < var4) {
                var4 = var14;
            }
            if (var14 > var7) {
                var7 = var14;
            }
            int var15 = var12 * var12 + var14 * var14;
            if (var8 < var15) {
                var8 = var15;
            }
            int var16 = var14 * var14 + (var12 * var12 + (var13 * var13));
            if (var16 > var9) {
                var9 = var16;
            }
        }
        this.field5049 = (short) var6;
        this.field5029 = (short) var7;
        this.field4977 = (short) var2;
        this.field5006 = (short) var3;
        this.field5052 = (short) var4;
        this.field5067 = (short) var5;
        this.field5058 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        int var11 = -80 / ((arg0 + 66) / 55);
        this.field5014 = true;
    }

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "()I", line = 1371)
    public final int method404() {
        if (!this.field5014) {
            this.method2061(-7);
        }
        field5032++;
        return this.field5029;
    }

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "()I", line = 1385)
    public final int method370() {
        field5005++;
        return this.field5037;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(Z)V", line = 1396)
    private final void method2062(boolean arg0) {
        if (this.field5001 != null) {
            class234 var2 = this.field4982.field4741;
            float var3 = this.field4982.method271();
            float var4 = this.field4982.method259();
            this.field4982.method1949(3);
            this.field4982.method235(false);
            this.field4982.method1937(false, -83);
            this.field4982.method1968(this.field4982.field4788, null, 107, null, this.field4982.field4780);
            for (int var5 = 0; var5 < this.field5075; var5++) {
                class214 var6 = this.field5001[var5];
                class336 var7 = this.field5042[var5];
                if (!var6.field2979 || !this.field4982.method261()) {
                    float var8 = (float) (this.field5053[var6.field2991] + this.field5053[var6.field2981] + this.field5053[var6.field2976]) * 0.3333333F;
                    float var9 = (float) (this.field5056[var6.field2981] + this.field5056[var6.field2991] + this.field5056[var6.field2976]) * 0.3333333F;
                    float var10 = (float) (this.field4985[var6.field2981] + this.field4985[var6.field2976] + this.field4985[var6.field2991]) * 0.3333333F;
                    float var11 = class200.field2830 * var10 + class168.field2516 * var8 + class122.field1824 * var9 + class420.field6145;
                    float var12 = class389.field5665 * var10 + class98.field1482 * var8 + class36.field458 * var9 + class307.field4174;
                    float var13 = class117.field1755 * var10 + class200.field2831 * var8 + class14.field207 * var9 + class78.field1132;
                    var2.method1439(-var13, var7.field4531, 16383, (float) var7.field4527 + var11, var6.field2992 * var7.field4526 >> 7, var6.field2990 * var7.field4535 >> 7, (float) var7.field4528 - var12);
                    this.field4982.method2010(22, var2);
                    this.field4982.method245(var4, var3 - ((float) var6.field2988 * 1.5F));
                    int var14 = var7.field4523;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field4982.method1944(var6.field2983, 12429);
                    this.field4982.method1976(-111, var6.field2989);
                    this.field4982.method1974(var6.field2980, 4609);
                    this.field4982.method1960(7, 5889, 4, 0);
                }
            }
            this.field4982.method245(var4, var3);
            this.field4982.method235(true);
            this.field4982.method1954(34162);
        }
        field5082++;
        if (!arg0) {
            method2065(null, 126, -67, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BZ)V", line = 1461)
    private final void method2063(byte arg0, boolean arg1) {
        if ((this.field5060 * 6) <= class10.field148.field5678.length) {
            class10.field148.field5719 = 0;
        } else {
            class10.field148 = new class498((this.field5060 + 100) * 6);
        }
        field5020++;
        if (this.field4982.field4772) {
            for (int var4 = 0; var4 < this.field5060; var4++) {
                class10.field148.method2355(1686288168, this.field5030[var4]);
                class10.field148.method2355(1686288168, this.field4984[var4]);
                class10.field148.method2355(1686288168, this.field5046[var4]);
            }
        } else {
            for (int var3 = 0; var3 < this.field5060; var3++) {
                class10.field148.method2310((byte) 66, this.field5030[var3]);
                class10.field148.method2310((byte) 108, this.field4984[var3]);
                class10.field148.method2310((byte) 117, this.field5046[var3]);
            }
        }
        int var5 = 40 % ((-arg0 - 5) / 60);
        if (class10.field148.field5719 == 0) {
            return;
        }
        if (arg1) {
            if (this.field4999 == null) {
                this.field4999 = this.field4982.method1941(class10.field148.field5719, true, 0, class10.field148.field5678, 5123);
            } else {
                this.field4999.method1016(class10.field148.field5719, class10.field148.field5678, 5123, (byte) -87);
            }
            this.field5000.field6845 = this.field4999;
        } else {
            this.field5000.field6845 = this.field4982.method1941(class10.field148.field5719, false, 0, class10.field148.field5678, 5123);
        }
        if (!arg1) {
            this.field5081 = true;
        }
    }

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "(SS)V", line = 1522)
    public final void method400(short arg0, short arg1) {
        field5068++;
        class277 var3 = this.field4982.field471;
        for (int var4 = 0; var4 < this.field4981; var4++) {
            if (this.field5065[var4] == arg0) {
                this.field5065[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class166 var7 = var3.method1654(85, arg0 & 0xFFFF);
            var5 = var7.field2486;
            var6 = var7.field2499;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class166 var10 = var3.method1654(95, arg1 & 0xFFFF);
            var8 = var10.field2486;
            var9 = var10.field2499;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field5001 != null) {
            for (int var11 = 0; var11 < this.field5075; var11++) {
                class214 var12 = this.field5001[var11];
                class336 var13 = this.field5042[var11];
                var13.field4523 = class166.field2487[this.field5010[var12.field2993] & 0xFFFF] & 0xFFFFFF | var13.field4523 & 0xFF000000;
            }
        }
        if (this.field5034 != null) {
            this.field5034.field571 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lef;)V", line = 6143)
    public class348(class338 arg0) {
        this.field4982 = arg0;
        this.field4978 = new class48(null, 5126, 3, 0);
        this.field5078 = new class48(null, 5126, 2, 0);
        this.field4991 = new class48(null, 5126, 3, 0);
        this.field5034 = new class48(null, 5121, 4, 0);
        this.field5000 = new class467();
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lef;Lkq;IIII)V", line = 6155)
    public class348(class338 arg0, class419 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5038 = arg5;
        this.field4993 = arg2;
        this.field4982 = arg0;
        if (class519.method3087(arg5, 83, arg2)) {
            this.field4978 = new class48(null, 5126, 3, 0);
        }
        if (class98.method719((byte) -3, arg2, arg5)) {
            this.field5078 = new class48(null, 5126, 2, 0);
        }
        if (class338.method1972(true, arg2, arg5)) {
            this.field4991 = new class48(null, 5126, 3, 0);
        }
        if (class105.method777(arg2, true, arg5)) {
            this.field5034 = new class48(null, 5121, 4, 0);
        }
        if (class308.method1789(arg2, (byte) -108, arg5)) {
            this.field5000 = new class467();
        }
        class277 var7 = arg0.field471;
        this.field5072 = new int[arg1.field6096 + 1];
        int[] var8 = new int[arg1.field6120];
        for (int var9 = 0; var9 < arg1.field6120; var9++) {
            if ((arg1.field6119 == null || arg1.field6119[var9] != 2) && (arg1.field6080 == null || arg1.field6080[var9] == -1 || !var7.method1654(82, arg1.field6080[var9] & 0xFFFF).field2493)) {
                var8[this.field4981++] = var9;
                this.field5072[arg1.field6097[var9]]++;
                this.field5072[arg1.field6086[var9]]++;
                this.field5072[arg1.field6106[var9]]++;
            }
        }
        this.field5060 = this.field4981;
        long[] var10 = new long[this.field4981];
        boolean var11 = (this.field4993 & 0x100) != 0;
        label494: for (int var12 = 0; var12 < this.field4981; var12++) {
            int var180 = var8[var12];
            class166 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field6113 != null) {
                for (int var186 = 0; var186 < arg1.field6113.length; var186++) {
                    class176 var187 = arg1.field6113[var186];
                    if (var187.field2603 == var180) {
                        class218 var188 = class201.method1251(var187.field2612, (byte) -114);
                        if (var188.field3032) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field5060--;
                            continue label494;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field6080 != null) {
                var189 = arg1.field6080[var180];
                if (var189 != -1) {
                    var181 = var7.method1654(35, var189 & 0xFFFF);
                    var184 = var181.field2492;
                    var185 = var181.field2490;
                }
            }
            boolean var190 = arg1.field6125 != null && arg1.field6125[var180] != 0 || var181 != null && !var181.field2494;
            if ((var11 || var190) && arg1.field6085 != null) {
                var182 += arg1.field6085[var180] << 17;
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
        class209.method1291(0, var10, var8);
        this.field5077 = arg1.field6081;
        this.field5053 = arg1.field6101;
        this.field4985 = arg1.field6127;
        this.field5070 = arg1.field6084;
        this.field5007 = arg1.field6096;
        this.field5056 = arg1.field6099;
        class18[] var13 = new class18[this.field5007];
        this.field5071 = arg1.field6089;
        this.field5074 = arg1.field6079;
        if (arg1.field6113 != null) {
            this.field5075 = arg1.field6113.length;
            this.field5042 = new class336[this.field5075];
            this.field5001 = new class214[this.field5075];
            for (int var14 = 0; var14 < this.field5075; var14++) {
                class176 var15 = arg1.field6113[var14];
                class218 var16 = class201.method1251(var15.field2612, (byte) -126);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field4981; var18++) {
                    if (var8[var18] == var15.field2603) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class166.field2487[arg1.field6100[var15.field2603] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field6125 == null ? 0 : arg1.field6125[var15.field2603]) << 24;
                this.field5001[var14] = new class214(var17, arg1.field6097[var15.field2603], arg1.field6086[var15.field2603], arg1.field6106[var15.field2603], var16.field3036, var16.field3033, var16.field3030, var16.field3041, var16.field3038, var16.field3032, var16.field3043, var15.field2611);
                this.field5042[var14] = new class336(var20);
            }
        }
        int var21 = this.field4981 * 3;
        this.field5055 = new float[var21];
        this.field5033 = new short[var21];
        this.field5037 = (short) arg4;
        this.field4987 = new short[var21];
        this.field5010 = new short[this.field4981];
        this.field5004 = new short[var21];
        this.field5087 = new byte[var21];
        this.field5030 = new short[this.field4981];
        this.field5046 = new short[this.field4981];
        this.field5076 = new byte[this.field4981];
        this.field4984 = new short[this.field4981];
        this.field4995 = new float[var21];
        this.field5009 = (short) arg3;
        this.field5066 = new short[var21];
        if (arg1.field6122 != null) {
            this.field4979 = new short[this.field4981];
        }
        this.field5065 = new short[this.field4981];
        class446.field6576 = new long[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field6096; var23++) {
            int var179 = this.field5072[var23];
            this.field5072[var23] = var22;
            var22 += var179;
            var13[var23] = new class18();
        }
        this.field5072[arg1.field6096] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field6078 != null) {
            int var28 = arg1.field6092;
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
            var24 = new int[var28];
            var25 = new int[var28];
            var27 = new float[var28][];
            for (int var36 = 0; var36 < this.field4981; var36++) {
                int var43 = var8[var36];
                if (arg1.field6078[var43] != -1) {
                    int var44 = arg1.field6078[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field6097[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field6086[var43];
                        } else {
                            var46 = arg1.field6106[var43];
                        }
                        int var47 = arg1.field6101[var46];
                        int var48 = arg1.field6099[var46];
                        int var49 = arg1.field6127[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
                            var30[var44] = var47;
                        }
                        if (var31[var44] > var48) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
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
                byte var38 = arg1.field6117[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field6109[var37];
                        if (var39 == 0) {
                            var40 = 1.0F;
                            var41 = 1.0F;
                        } else if (var39 > 0) {
                            var41 = (float) var39 / 1024.0F;
                            var40 = 1.0F;
                        } else {
                            var40 = (float) (-var39) / 1024.0F;
                            var41 = 1.0F;
                        }
                        var42 = 64.0F / (float) arg1.field6103[var37];
                    } else if (var38 == 2) {
                        var42 = 64.0F / (float) arg1.field6103[var37];
                        var41 = 64.0F / (float) arg1.field6094[var37];
                        var40 = 64.0F / (float) arg1.field6109[var37];
                    } else {
                        var40 = (float) arg1.field6109[var37] / 1024.0F;
                        var42 = (float) arg1.field6103[var37] / 1024.0F;
                        var41 = (float) arg1.field6094[var37] / 1024.0F;
                    }
                    var27[var37] = class258.method1553(var41, arg1.field6104[var37], var42, true, var40, class251.method1501(arg1.field6093[var37], 255), arg1.field6111[var37], arg1.field6107[var37]);
                }
            }
        }
        class384[] var50 = new class384[arg1.field6120];
        for (int var51 = 0; var51 < arg1.field6120; var51++) {
            short var158 = arg1.field6097[var51];
            short var159 = arg1.field6086[var51];
            short var160 = arg1.field6106[var51];
            int var161 = this.field5053[var159] - this.field5053[var158];
            int var162 = this.field5056[var159] - this.field5056[var158];
            int var163 = this.field4985[var159] - this.field4985[var158];
            int var164 = this.field5053[var160] - this.field5053[var158];
            int var165 = this.field5056[var160] - this.field5056[var158];
            int var166 = this.field4985[var160] - this.field4985[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169;
            for (var169 = var161 * var165 - var162 * var164; var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192; var169 >>= 0x1) {
                var167 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + var167 * var167 + var168 * var168));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var169 * 256 / var170;
            int var172 = var167 * 256 / var170;
            int var173 = var168 * 256 / var170;
            byte var174 = arg1.field6119 == null ? 0 : arg1.field6119[var51];
            if (var174 == 0) {
                class18 var175 = var13[var158];
                var175.field243 += var173;
                var175.field239 += var172;
                var175.field244++;
                var175.field234 += var171;
                class18 var176 = var13[var159];
                var176.field239 += var172;
                var176.field244++;
                var176.field234 += var171;
                var176.field243 += var173;
                class18 var177 = var13[var160];
                var177.field244++;
                var177.field243 += var173;
                var177.field234 += var171;
                var177.field239 += var172;
            } else if (var174 == 1) {
                class384 var178 = var50[var51] = new class384();
                var178.field5599 = var173;
                var178.field5596 = var171;
                var178.field5597 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field4981; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field6100[var68] & 0xFFFF;
            short var70;
            if (arg1.field6080 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field6080[var68];
            }
            int var71;
            if (arg1.field6078 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field6078[var68];
            }
            int var72;
            if (arg1.field6125 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field6125[var68] & 0xFF;
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
                    var74 = 1.0F;
                    var75 = 1.0F;
                    var73 = 0.0F;
                    var80 = 2;
                    var79 = 1;
                    var77 = 0.0F;
                    var76 = 1.0F;
                    var78 = 0.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field6117[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field6097[var68];
                        short var84 = arg1.field6086[var68];
                        short var85 = arg1.field6106[var68];
                        short var86 = arg1.field6107[var71];
                        short var87 = arg1.field6104[var71];
                        short var88 = arg1.field6111[var71];
                        float var89 = (float) arg1.field6101[var86];
                        float var90 = (float) arg1.field6099[var86];
                        float var91 = (float) arg1.field6127[var86];
                        float var92 = (float) arg1.field6101[var87] - var89;
                        float var93 = (float) arg1.field6099[var87] - var90;
                        float var94 = (float) arg1.field6127[var87] - var91;
                        float var95 = (float) arg1.field6101[var88] - var89;
                        float var96 = (float) arg1.field6099[var88] - var90;
                        float var97 = (float) arg1.field6127[var88] - var91;
                        float var98 = (float) arg1.field6101[var83] - var89;
                        float var99 = (float) arg1.field6099[var83] - var90;
                        float var100 = (float) arg1.field6127[var83] - var91;
                        float var101 = (float) arg1.field6101[var84] - var89;
                        float var102 = (float) arg1.field6099[var84] - var90;
                        float var103 = (float) arg1.field6127[var84] - var91;
                        float var104 = (float) arg1.field6101[var85] - var89;
                        float var105 = (float) arg1.field6099[var85] - var90;
                        float var106 = (float) arg1.field6127[var85] - var91;
                        float var107 = var93 * var97 - (var94 * var96);
                        float var108 = var94 * var95 - (var92 * var97);
                        float var109 = var92 * var96 - (var93 * var95);
                        float var110 = var96 * var109 - var97 * var108;
                        float var111 = var97 * var107 - (var95 * var109);
                        float var112 = var95 * var108 - var96 * var107;
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        float var114 = var93 * var109 - (var94 * var108);
                        float var115 = var92 * var108 - var93 * var107;
                        float var116 = var94 * var107 - var92 * var109;
                        float var117 = 1.0F / (var97 * var115 + var95 * var114 + var96 * var116);
                        var74 = (var100 * var115 + var98 * var114 + var99 * var116) * var117;
                        var78 = (var106 * var115 + var104 * var114 + var105 * var116) * var117;
                        var76 = (var103 * var115 + var101 * var114 + var102 * var116) * var117;
                    } else {
                        short var118 = arg1.field6097[var68];
                        short var119 = arg1.field6086[var68];
                        short var120 = arg1.field6106[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field6129[var71];
                        float var126 = (float) arg1.field6116[var71] / 256.0F;
                        if (var82 == 1) {
                            float var127 = (float) arg1.field6094[var71] / 1024.0F;
                            class18.method113(6, var123, arg1.field6099[var118], var126, arg1.field6127[var118], var124, var121, var122, arg1.field6101[var118], var127, var125);
                            var73 = class195.field2783;
                            var74 = class226.field3208;
                            class18.method113(6, var123, arg1.field6099[var119], var126, arg1.field6127[var119], var124, var121, var122, arg1.field6101[var119], var127, var125);
                            var75 = class195.field2783;
                            var76 = class226.field3208;
                            class18.method113(6, var123, arg1.field6099[var120], var126, arg1.field6127[var120], var124, var121, var122, arg1.field6101[var120], var127, var125);
                            var78 = class226.field3208;
                            var77 = class195.field2783;
                            float var128 = var127 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if ((var75 - var73 > var128)) {
                                    var75 -= var127;
                                    var79 = 1;
                                } else if (var128 < var73 - var75) {
                                    var79 = 2;
                                    var75 += var127;
                                }
                                if (var128 < var77 - var73) {
                                    var77 -= var127;
                                    var80 = 1;
                                } else if (var73 - var77 > var128) {
                                    var80 = 2;
                                    var77 += var127;
                                }
                            } else {
                                if ((var78 - var74 > var128)) {
                                    var78 -= var127;
                                    var80 = 1;
                                } else if (var128 < var74 - var78) {
                                    var80 = 2;
                                    var78 += var127;
                                }
                                if ((var76 - var74 > var128)) {
                                    var76 -= var127;
                                    var79 = 1;
                                } else if (var128 < var74 - var76) {
                                    var76 += var127;
                                    var79 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var129 = (float) arg1.field6108[var71] / 256.0F;
                            float var130 = (float) arg1.field6118[var71] / 256.0F;
                            int var131 = arg1.field6101[var119] - arg1.field6101[var118];
                            int var132 = arg1.field6099[var119] - arg1.field6099[var118];
                            int var133 = arg1.field6127[var119] - arg1.field6127[var118];
                            int var134 = arg1.field6101[var120] - arg1.field6101[var118];
                            int var135 = arg1.field6099[var120] - arg1.field6099[var118];
                            int var136 = arg1.field6127[var120] - arg1.field6127[var118];
                            int var137 = var132 * var136 - var133 * var135;
                            int var138 = var133 * var134 - var131 * var136;
                            int var139 = var131 * var135 - (var132 * var134);
                            float var140 = 64.0F / (float) arg1.field6109[var71];
                            float var141 = 64.0F / (float) arg1.field6103[var71];
                            float var142 = 64.0F / (float) arg1.field6094[var71];
                            float var143 = (var124[2] * (float) var139 + var124[1] * (float) var138 + var124[0] * (float) var137) / var140;
                            float var144 = (var124[5] * (float) var139 + var124[3] * (float) var137 + var124[4] * (float) var138) / var141;
                            float var145 = (var124[8] * (float) var139 + var124[7] * (float) var138 + var124[6] * (float) var137) / var142;
                            var81 = class416.method2478(13981, var144, var145, var143);
                            class463.method2720(var122, var81, true, var129, arg1.field6127[var118], var123, var124, var126, var130, var125, arg1.field6101[var118], arg1.field6099[var118], var121);
                            var74 = class141.field2015;
                            var73 = class216.field3002;
                            class463.method2720(var122, var81, true, var129, arg1.field6127[var119], var123, var124, var126, var130, var125, arg1.field6101[var119], arg1.field6099[var119], var121);
                            var76 = class141.field2015;
                            var75 = class216.field3002;
                            class463.method2720(var122, var81, true, var129, arg1.field6127[var120], var123, var124, var126, var130, var125, arg1.field6101[var120], arg1.field6099[var120], var121);
                            var77 = class216.field3002;
                            var78 = class141.field2015;
                        } else if (var82 == 3) {
                            class109.method797(var125, 64, var124, arg1.field6101[var118], var121, var126, arg1.field6127[var118], arg1.field6099[var118], var122, var123);
                            var73 = class87.field1276;
                            var74 = class278.field3813;
                            class109.method797(var125, 67, var124, arg1.field6101[var119], var121, var126, arg1.field6127[var119], arg1.field6099[var119], var122, var123);
                            var76 = class278.field3813;
                            var75 = class87.field1276;
                            class109.method797(var125, 79, var124, arg1.field6101[var120], var121, var126, arg1.field6127[var120], arg1.field6099[var120], var122, var123);
                            var78 = class278.field3813;
                            var77 = class87.field1276;
                            if ((var125 & 0x1) == 0) {
                                if (var77 - var73 > 0.5F) {
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
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var80 = 2;
                                }
                                if (var76 - var74 > 0.5F) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var79 = 2;
                                    var76++;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field6119 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field6119[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) (var71 << 2);
                short var152 = arg1.field6097[var68];
                short var153 = arg1.field6086[var68];
                short var154 = arg1.field6106[var68];
                class18 var155 = var13[var152];
                this.field5030[var52] = this.method2058(var73, arg1, var74, var155.field244, var155.field239, var155.field243, var152, (byte) 97, var155.field234, var150);
                class18 var156 = var13[var153];
                this.field4984[var52] = this.method2058(var75, arg1, var76, var156.field244, var156.field239, var156.field243, var153, (byte) 100, var156.field234, (long) var79 + var150);
                class18 var157 = var13[var154];
                this.field5046[var52] = this.method2058(var77, arg1, var78, var157.field244, var157.field239, var157.field243, var154, (byte) -13, var157.field234, (long) var80 + var150);
            } else if (var146 == 1) {
                class384 var147 = var50[var68];
                long var148 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) ((var147.field5596 + 256 << 22) + (var147.field5599 + 256 << 12) + (var71 << 2) + (var147.field5597 > 0 ? 1024 : 2048));
                this.field5030[var52] = this.method2058(var73, arg1, var74, 0, var147.field5597, var147.field5599, arg1.field6097[var68], (byte) 97, var147.field5596, var148);
                this.field4984[var52] = this.method2058(var75, arg1, var76, 0, var147.field5597, var147.field5599, arg1.field6086[var68], (byte) -121, var147.field5596, (long) var79 + var148);
                this.field5046[var52] = this.method2058(var77, arg1, var78, 0, var147.field5597, var147.field5599, arg1.field6106[var68], (byte) 123, var147.field5596, (long) var80 + var148);
            }
            if (arg1.field6080 == null) {
                this.field5065[var52] = -1;
            } else {
                this.field5065[var52] = arg1.field6080[var68];
            }
            if (arg1.field6125 != null) {
                this.field5076[var52] = arg1.field6125[var68];
            }
            if (arg1.field6122 != null) {
                this.field4979[var52] = arg1.field6122[var68];
            }
            this.field5010[var52] = arg1.field6100[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field5060; var55++) {
            short var67 = this.field5065[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field5057 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field5060; var58++) {
            short var66 = this.field5065[var58];
            if (var57 != var66) {
                var57 = var66;
                this.field5057[var56++] = var58;
            }
        }
        this.field5057[var56] = this.field5060;
        class446.field6576 = null;
        this.field5004 = class418.method2485(this.field5004, this.field5012, -22395);
        this.field5033 = class418.method2485(this.field5033, this.field5012, -22395);
        this.field5066 = class418.method2485(this.field5066, this.field5012, -22395);
        this.field5087 = class485.method2850((byte) 120, this.field5012, this.field5087);
        this.field5055 = class216.method1340(0, this.field5055, this.field5012);
        this.field4995 = class216.method1340(0, this.field4995, this.field5012);
        if (arg1.field6098 != null && class523.method3110(32, this.field5038, arg2)) {
            this.field5050 = arg1.method2499(82);
        }
        if (arg1.field6113 != null && class444.method2639(this.field5038, arg2, (byte) 11)) {
            this.field4983 = arg1.method2497((byte) 18);
        }
        if (arg1.field6088 != null && class457.method2682(29521, arg2, this.field5038)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field4981; var61++) {
                int var65 = arg1.field6088[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var59 < var65) {
                        var59 = var65;
                    }
                }
            }
            this.field5044 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field5044[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field4981; var63++) {
                int var64 = arg1.field6088[var8[var63]];
                if (var64 >= 0) {
                    this.field5044[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "()V", line = 1603)
    public final void method373() {
        for (int var1 = 0; var1 < this.field5070; var1++) {
            this.field5053[var1] = this.field5053[var1] + 7 >> 4;
            this.field5056[var1] = this.field5056[var1] + 7 >> 4;
            this.field4985[var1] = this.field4985[var1] + 7 >> 4;
        }
        field5011++;
        this.field5014 = false;
        if (this.field4978 != null) {
            this.field4978.field571 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BIZ)Lt;", line = 1626)
    public final class471 method381(byte arg0, int arg1, boolean arg2) {
        field5036++;
        class348 var4;
        class348 var5;
        if (arg0 == 1) {
            var4 = this.field4982.field4827;
            var5 = this.field4982.field4806;
        } else if (arg0 == 2) {
            var4 = this.field4982.field4859;
            var5 = this.field4982.field4849;
        } else if (arg0 == 3) {
            var4 = this.field4982.field4880;
            var5 = this.field4982.field4793;
        } else if (arg0 == 4) {
            var5 = this.field4982.field4853;
            var4 = this.field4982.field4869;
        } else if (arg0 == 5) {
            var5 = this.field4982.field4795;
            var4 = this.field4982.field4767;
        } else {
            var4 = var5 = new class348(this.field4982);
        }
        return this.method2067(false, arg2, var5, var4, arg1, arg0 != 0);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lt;IIIZ)V", line = 1675)
    public final void method375(class471 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5062++;
        class348 var6 = (class348) arg0;
        if (this.field4981 == 0 || var6.field4981 == 0) {
            return;
        }
        int var7 = var6.field5007;
        int[] var8 = var6.field5053;
        int[] var9 = var6.field5056;
        int[] var10 = var6.field4985;
        short[] var11 = var6.field5004;
        short[] var12 = var6.field5033;
        short[] var13 = var6.field5066;
        byte[] var14 = var6.field5087;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field5027 == null) {
            var17 = null;
            var16 = null;
            var18 = null;
            var15 = null;
        } else {
            var15 = this.field5027.field5570;
            var16 = this.field5027.field5569;
            var17 = this.field5027.field5563;
            var18 = this.field5027.field5568;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field5027 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field5027.field5570;
            var21 = var6.field5027.field5568;
            var22 = var6.field5027.field5563;
            var20 = var6.field5027.field5569;
        }
        int[] var23 = var6.field5072;
        short[] var24 = var6.field4987;
        if (!var6.field5014) {
            var6.method2061(-121);
        }
        short var25 = var6.field5006;
        short var26 = var6.field5049;
        short var27 = var6.field4977;
        short var28 = var6.field5067;
        short var29 = var6.field5052;
        short var30 = var6.field5029;
        for (int var31 = 0; var31 < this.field5007; var31++) {
            int var32 = this.field5056[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field5053[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field4985[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field5072[var31];
                        int var37 = this.field5072[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field4987[var38] - 1;
                            if (var35 == -1 || this.field5087[var35] != 0) {
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
                                            this.field5027 = new class381();
                                            var17 = this.field5027.field5563 = class490.method2864(this.field5004, false);
                                            var15 = this.field5027.field5570 = class490.method2864(this.field5033, false);
                                            var18 = this.field5027.field5568 = class490.method2864(this.field5066, false);
                                            var16 = this.field5027.field5569 = class498.method2908(0, this.field5087);
                                        }
                                        if (var22 == null) {
                                            class381 var44 = var6.field5027 = new class381();
                                            var22 = var44.field5563 = class490.method2864(var11, false);
                                            var19 = var44.field5570 = class490.method2864(var12, false);
                                            var21 = var44.field5568 = class490.method2864(var13, false);
                                            var20 = var44.field5569 = class498.method2908(0, var14);
                                        }
                                        short var45 = this.field5004[var35];
                                        short var46 = this.field5033[var35];
                                        short var47 = this.field5066[var35];
                                        int var48 = var23[var39];
                                        byte var49 = this.field5087[var35];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var48; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var22[var52] += var45;
                                                var19[var52] += var46;
                                                var21[var52] += var47;
                                                var20[var52] += var49;
                                            }
                                        }
                                        int var53 = this.field5072[var31];
                                        short var54 = var11[var40];
                                        short var55 = var13[var40];
                                        int var56 = this.field5072[var31 + 1];
                                        short var57 = var12[var40];
                                        byte var58 = var14[var40];
                                        for (int var59 = var53; var59 < var56; var59++) {
                                            int var60 = this.field4987[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var17[var60] += var54;
                                                var15[var60] += var57;
                                                var18[var60] += var55;
                                                var16[var60] += var58;
                                            }
                                        }
                                        if (this.field4991 == null && this.field5034 != null) {
                                            this.field5034.field571 = null;
                                        }
                                        if (this.field4991 != null) {
                                            this.field4991.field571 = null;
                                        }
                                        if (var6.field4991 == null && var6.field5034 != null) {
                                            var6.field5034.field571 = null;
                                        }
                                        if (var6.field4991 != null) {
                                            var6.field4991.field571 = null;
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

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "()Z", line = 1940)
    public final boolean method388() {
        field5018++;
        if (this.field5065 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field5065.length; var1++) {
            if (this.field5065[var1] != -1 && !this.field4982.field471.method1652(this.field5065[var1], 29423)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ko", name = "PA", descriptor = "()I", line = 1966)
    public final int method382() {
        field5008++;
        if (!this.field5014) {
            this.method2061(22);
        }
        return this.field5052;
    }

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "()Z", line = 1977)
    public final boolean method379() {
        field5069++;
        if (this.field5050 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5070; var1++) {
            this.field5053[var1] <<= 0x4;
            this.field5056[var1] <<= 0x4;
            this.field4985[var1] <<= 0x4;
        }
        class196.field2790 = 0;
        class126.field1883 = 0;
        class222.field3171 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ko", name = "U", descriptor = "()I", line = 2004)
    public final int method389() {
        if (!this.field5014) {
            this.method2061(-122);
        }
        field5079++;
        return this.field5058;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Lqm;", line = 2015)
    public static final class97 method2064(int arg0, int arg1, int arg2) {
        field5085++;
        class97 var3 = (class97) class267.field3694.method1492((long) arg1 << 32 | (long) arg0, 6340);
        int var4 = -80 % ((arg2 - 34) / 63);
        if (var3 == null) {
            var3 = new class97(arg1, arg0);
            class267.field3694.method1487(-118, var3.field3615, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "()I", line = 2035)
    public final int method372() {
        field5088++;
        return this.field4993;
    }

    @OriginalMember(owner = "client!ko", name = "XA", descriptor = "(I[IIIIIZ)V", line = 2046)
    public final void method410(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5051++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            class126.field1883 = 0;
            class222.field3171 = 0;
            int var12 = 0;
            class196.field2790 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field5050.length > var14) {
                    int[] var15 = this.field5050[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class222.field3171 += this.field5053[var17];
                        class196.field2790 += this.field5056[var17];
                        class126.field1883 += this.field4985[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class222.field3171 = var10;
                class126.field1883 = var9;
                class196.field2790 = var11;
            } else {
                class126.field1883 = class126.field1883 / var12 + var9;
                class222.field3171 = class222.field3171 / var12 + var10;
                class196.field2790 = class196.field2790 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field5050.length) {
                    int[] var23 = this.field5050[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field5053[var25] += var18;
                        this.field5056[var25] += var19;
                        this.field4985[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field5050.length) {
                    int[] var46 = this.field5050[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field5053[var48] -= class222.field3171;
                            this.field5056[var48] -= class196.field2790;
                            this.field4985[var48] -= class126.field1883;
                            if (arg4 != 0) {
                                int var49 = class183.field2684[arg4];
                                int var50 = class183.field2678[arg4];
                                int var51 = this.field5056[var48] * var49 + (this.field5053[var48] * var50) + 32767 >> 15;
                                this.field5056[var48] = this.field5056[var48] * var50 + 32767 - (this.field5053[var48] * var49) >> 15;
                                this.field5053[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class183.field2684[arg2];
                                int var53 = class183.field2678[arg2];
                                int var54 = this.field5056[var48] * var53 + 32767 - (this.field4985[var48] * var52) >> 15;
                                this.field4985[var48] = this.field4985[var48] * var53 + this.field5056[var48] * var52 + 32767 >> 15;
                                this.field5056[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class183.field2684[arg3];
                                int var56 = class183.field2678[arg3];
                                int var57 = this.field4985[var48] * var55 + (this.field5053[var48] * var56) + 32767 >> 15;
                                this.field4985[var48] = this.field4985[var48] * var56 + 32767 - (this.field5053[var48] * var55) >> 15;
                                this.field5053[var48] = var57;
                            }
                            this.field5053[var48] += class222.field3171;
                            this.field5056[var48] += class196.field2790;
                            this.field4985[var48] += class126.field1883;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field5053[var59] -= class222.field3171;
                            this.field5056[var59] -= class196.field2790;
                            this.field4985[var59] -= class126.field1883;
                            if (arg2 != 0) {
                                int var60 = class183.field2684[arg2];
                                int var61 = class183.field2678[arg2];
                                int var62 = this.field5056[var59] * var61 + 32767 - (this.field4985[var59] * var60) >> 15;
                                this.field4985[var59] = this.field5056[var59] * var60 + this.field4985[var59] * var61 + 32767 >> 15;
                                this.field5056[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class183.field2684[arg4];
                                int var64 = class183.field2678[arg4];
                                int var65 = this.field5056[var59] * var63 + (this.field5053[var59] * var64 + 32767) >> 15;
                                this.field5056[var59] = this.field5056[var59] * var64 - (this.field5053[var59] * var63 - 32767) >> 15;
                                this.field5053[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class183.field2684[arg3];
                                int var67 = class183.field2678[arg3];
                                int var68 = this.field5053[var59] * var67 + this.field4985[var59] * var66 + 32767 >> 15;
                                this.field4985[var59] = this.field4985[var59] * var67 + 32767 - (this.field5053[var59] * var66) >> 15;
                                this.field5053[var59] = var68;
                            }
                            this.field5053[var59] += class222.field3171;
                            this.field5056[var59] += class196.field2790;
                            this.field4985[var59] += class126.field1883;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field5050.length) {
                        int[] var29 = this.field5050[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field5072[var31];
                            int var33 = this.field5072[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field4987[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class183.field2684[arg4];
                                    int var37 = class183.field2678[arg4];
                                    int var38 = this.field5033[var35] * var36 + this.field5004[var35] * var37 + 32767 >> 15;
                                    this.field5033[var35] = (short) (this.field5033[var35] * var37 + 32767 - (this.field5004[var35] * var36) >> 15);
                                    this.field5004[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class183.field2684[arg2];
                                    int var40 = class183.field2678[arg2];
                                    int var41 = this.field5033[var35] * var40 + 32767 - (this.field5066[var35] * var39) >> 15;
                                    this.field5066[var35] = (short) (this.field5066[var35] * var40 + this.field5033[var35] * var39 + 32767 >> 15);
                                    this.field5033[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class183.field2684[arg3];
                                    int var43 = class183.field2678[arg3];
                                    int var44 = this.field5066[var35] * var42 + (this.field5004[var35] * var43) + 32767 >> 15;
                                    this.field5066[var35] = (short) (this.field5066[var35] * var43 + 32767 - (this.field5004[var35] * var42) >> 15);
                                    this.field5004[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field4991 == null && this.field5034 != null) {
                    this.field5034.field571 = null;
                }
                if (this.field4991 != null) {
                    this.field4991.field571 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field5050.length > var70) {
                    int[] var71 = this.field5050[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field5053[var73] -= class222.field3171;
                        this.field5056[var73] -= class196.field2790;
                        this.field4985[var73] -= class126.field1883;
                        this.field5053[var73] = this.field5053[var73] * arg2 >> 7;
                        this.field5056[var73] = this.field5056[var73] * arg3 >> 7;
                        this.field4985[var73] = this.field4985[var73] * arg4 >> 7;
                        this.field5053[var73] += class222.field3171;
                        this.field5056[var73] += class196.field2790;
                        this.field4985[var73] += class126.field1883;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5044 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field5044.length > var78) {
                        int[] var79 = this.field5044[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field5076[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field5076[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field5034 != null) {
                            this.field5034.field571 = null;
                        }
                    }
                }
                if (this.field5001 != null) {
                    for (int var75 = 0; var75 < this.field5075; var75++) {
                        class214 var76 = this.field5001[var75];
                        class336 var77 = this.field5042[var75];
                        var77.field4523 = var77.field4523 & 0xFFFFFF | 255 - (this.field5076[var76.field2993] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5044 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field5044.length) {
                        int[] var88 = this.field5044[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field5010[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFEBE) >> 10;
                            int var93 = (var91 & 0x3BA) >> 7;
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
                            this.field5010[var90] = (short) class255.method1532(var97, class255.method1532(var95 << 7, var96 << 10));
                        }
                        if (var88.length > 0 && this.field5034 != null) {
                            this.field5034.field571 = null;
                        }
                    }
                }
                if (this.field5001 != null) {
                    for (int var84 = 0; var84 < this.field5075; var84++) {
                        class214 var85 = this.field5001[var84];
                        class336 var86 = this.field5042[var84];
                        var86.field4523 = class166.field2487[this.field5010[var85.field2993] & 0xFFFF] & 0xFFFFFF | var86.field4523 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4983 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field4983.length) {
                        int[] var100 = this.field4983[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class336 var102 = this.field5042[var100[var101]];
                            var102.field4528 += arg3;
                            var102.field4527 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4983 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field4983.length > var104) {
                        int[] var105 = this.field4983[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class336 var107 = this.field5042[var105[var106]];
                            var107.field4535 = var107.field4535 * arg3 >> 7;
                            var107.field4526 = var107.field4526 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4983 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field4983.length > var109) {
                    int[] var110 = this.field4983[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class336 var112 = this.field5042[var110[var111]];
                        var112.field4531 = var112.field4531 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "(I[IIIIZI[I)V", line = 2702)
    public final void method378(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field5059++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            class222.field3171 = 0;
            int var13 = 0;
            class196.field2790 = 0;
            class126.field1883 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field5050.length) {
                    int[] var16 = this.field5050[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5077 == null || (this.field5077[var18] & arg6) != 0) {
                            class222.field3171 += this.field5053[var18];
                            class196.field2790 += this.field5056[var18];
                            var13++;
                            class126.field1883 += this.field4985[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class196.field2790 = var11;
                class222.field3171 = var10;
                class126.field1883 = var12;
            } else {
                class196.field2790 = class196.field2790 / var13 + var11;
                class147.field2139 = true;
                class222.field3171 = class222.field3171 / var13 + var10;
                class126.field1883 = class126.field1883 / var13 + var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + arg7[1] * arg3 - (-(arg7[2] * arg4) + -16384) >> 15;
                int var20 = arg7[4] * arg3 + (arg7[5] * arg4) + arg7[3] * arg2 + 16384 >> 15;
                int var21 = arg7[7] * arg3 + arg7[6] * arg2 + arg7[8] * arg4 + 16384 >> 15;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field5050.length) {
                    int[] var27 = this.field5050[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5077 == null || (arg6 & this.field5077[var29]) != 0) {
                            this.field5053[var29] += var23;
                            this.field5056[var29] += var22;
                            this.field4985[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field5050.length) {
                        int[] var50 = this.field5050[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field5077 == null || (arg6 & this.field5077[var52]) != 0) {
                                this.field5053[var52] -= class222.field3171;
                                this.field5056[var52] -= class196.field2790;
                                this.field4985[var52] -= class126.field1883;
                                if (arg4 != 0) {
                                    int var53 = class183.field2684[arg4];
                                    int var54 = class183.field2678[arg4];
                                    int var55 = this.field5053[var52] * var54 + this.field5056[var52] * var53 + 32767 >> 15;
                                    this.field5056[var52] = this.field5056[var52] * var54 + 32767 - (this.field5053[var52] * var53) >> 15;
                                    this.field5053[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class183.field2684[arg2];
                                    int var57 = class183.field2678[arg2];
                                    int var58 = this.field5056[var52] * var57 + 32767 - (this.field4985[var52] * var56) >> 15;
                                    this.field4985[var52] = this.field4985[var52] * var57 + this.field5056[var52] * var56 + 32767 >> 15;
                                    this.field5056[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class183.field2684[arg3];
                                    int var60 = class183.field2678[arg3];
                                    int var61 = this.field4985[var52] * var59 + this.field5053[var52] * var60 + 32767 >> 15;
                                    this.field4985[var52] = this.field4985[var52] * var60 + 32767 - (this.field5053[var52] * var59) >> 15;
                                    this.field5053[var52] = var61;
                                }
                                this.field5053[var52] += class222.field3171;
                                this.field5056[var52] += class196.field2790;
                                this.field4985[var52] += class126.field1883;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (var32 < this.field5050.length) {
                            int[] var33 = this.field5050[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field5077 == null || (this.field5077[var35] & arg6) != 0) {
                                    int var36 = this.field5072[var35];
                                    int var37 = this.field5072[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field4987[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class183.field2684[arg4];
                                            int var41 = class183.field2678[arg4];
                                            int var42 = this.field5033[var39] * var40 + this.field5004[var39] * var41 + 32767 >> 15;
                                            this.field5033[var39] = (short) (this.field5033[var39] * var41 + (32767 - (this.field5004[var39] * var40)) >> 15);
                                            this.field5004[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class183.field2684[arg2];
                                            int var44 = class183.field2678[arg2];
                                            int var45 = this.field5033[var39] * var44 + 32767 - (this.field5066[var39] * var43) >> 15;
                                            this.field5066[var39] = (short) (this.field5033[var39] * var43 + (this.field5066[var39] * var44 + 32767) >> 15);
                                            this.field5033[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class183.field2684[arg3];
                                            int var47 = class183.field2678[arg3];
                                            int var48 = this.field5066[var39] * var46 + this.field5004[var39] * var47 + 32767 >> 15;
                                            this.field5066[var39] = (short) (this.field5066[var39] * var47 + 32767 - (this.field5004[var39] * var46) >> 15);
                                            this.field5004[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field4991 == null && this.field5034 != null) {
                        this.field5034.field571 = null;
                    }
                    if (this.field4991 != null) {
                        this.field4991.field571 = null;
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
                if (class147.field2139) {
                    int var68 = arg7[6] * class126.field1883 + arg7[0] * class222.field3171 - (-(arg7[3] * class196.field2790) + -16384) >> 15;
                    int var69 = arg7[7] * class126.field1883 + arg7[1] * class222.field3171 - (-(arg7[4] * class196.field2790) + -16384) >> 15;
                    int var70 = var66 + var69;
                    int var71 = arg7[5] * class196.field2790 + arg7[8] * class126.field1883 + arg7[2] * class222.field3171 + 16384 >> 15;
                    int var72 = var65 + var68;
                    int var73 = var67 + var71;
                    class222.field3171 = var72;
                    class196.field2790 = var70;
                    class126.field1883 = var73;
                    class147.field2139 = false;
                }
                int[] var74 = new int[9];
                int var75 = class183.field2678[arg2];
                int var76 = class183.field2684[arg2];
                int var77 = class183.field2678[arg3];
                int var78 = class183.field2684[arg3];
                int var79 = class183.field2678[arg4];
                int var80 = class183.field2684[arg4];
                int var81 = var76 * var79 + 16384 >> 15;
                int var82 = var76 * var80 + 16384 >> 15;
                var74[1] = -var77 * var80 + (var78 * var81) + 16384 >> 15;
                var74[4] = var75 * var79 + 16384 >> 15;
                var74[5] = -var76;
                var74[6] = -var78 * var79 - (-(var77 * var82) - 16384) >> 15;
                var74[2] = var75 * var78 + 16384 >> 15;
                var74[0] = var77 * var79 + var78 * var82 + 16384 >> 15;
                var74[3] = var75 * var80 + 16384 >> 15;
                var74[8] = var75 * var77 + 16384 >> 15;
                var74[7] = var77 * var81 + var78 * var80 + 16384 >> 15;
                int var83 = var74[1] * -class196.field2790 + (var74[2] * -class126.field1883) + var74[0] * -class222.field3171 + 16384 >> 15;
                int var84 = var74[5] * -class126.field1883 + var74[4] * -class196.field2790 + var74[3] * -class222.field3171 + 16384 >> 15;
                int var85 = var74[8] * -class126.field1883 + var74[6] * -class222.field3171 + var74[7] * -class196.field2790 + 16384 >> 15;
                int var86 = class222.field3171 + var83;
                int var87 = var84 + class196.field2790;
                int var88 = class126.field1883 + var85;
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
                int var91 = var74[0] * var65 + (var74[1] * var66) + var74[2] * var67 + 16384 >> 15;
                int var92 = var74[5] * var67 + var74[3] * var65 + var74[4] * var66 + 16384 >> 15;
                int var93 = var86 + var91;
                int var94 = var74[8] * var67 + var74[7] * var66 + var74[6] * var65 + 16384 >> 15;
                int var95 = var87 + var92;
                int var96 = var88 + var94;
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
                int var99 = arg7[2] * var96 + arg7[1] * var95 + arg7[0] * var93 + 16384 >> 15;
                int var100 = arg7[5] * var96 + arg7[3] * var93 + arg7[4] * var95 + 16384 >> 15;
                int var101 = var62 + var99;
                int var102 = var63 + var100;
                int var103 = arg7[8] * var96 + arg7[7] * var95 + arg7[6] * var93 + 16384 >> 15;
                int var104 = var64 + var103;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field5050.length) {
                        int[] var107 = this.field5050[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field5077 == null || (this.field5077[var109] & arg6) != 0) {
                                int var110 = this.field5056[var109] * var97[1] + this.field5053[var109] * var97[0] + this.field4985[var109] * var97[2] + 16384 >> 15;
                                int var111 = this.field5056[var109] * var97[4] + this.field5053[var109] * var97[3] + (this.field4985[var109] * var97[5]) + 16384 >> 15;
                                int var112 = this.field4985[var109] * var97[8] + (this.field5056[var109] * var97[7] + this.field5053[var109] * var97[6] + 16384) >> 15;
                                int var113 = var102 + var111;
                                int var114 = var101 + var110;
                                this.field5053[var109] = var114;
                                int var115 = var104 + var112;
                                this.field5056[var109] = var113;
                                this.field4985[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field5050.length > var173) {
                        int[] var174 = this.field5050[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field5077 == null || (arg6 & this.field5077[var176]) != 0) {
                                this.field5053[var176] -= class222.field3171;
                                this.field5056[var176] -= class196.field2790;
                                this.field4985[var176] -= class126.field1883;
                                this.field5053[var176] = this.field5053[var176] * arg2 >> 7;
                                this.field5056[var176] = this.field5056[var176] * arg3 >> 7;
                                this.field4985[var176] = this.field4985[var176] * arg4 >> 7;
                                this.field5053[var176] += class222.field3171;
                                this.field5056[var176] += class196.field2790;
                                this.field4985[var176] += class126.field1883;
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
                if (class147.field2139) {
                    int var128 = arg7[3] * class196.field2790 + arg7[0] * class222.field3171 + (arg7[6] * class126.field1883) + 16384 >> 15;
                    int var129 = arg7[4] * class196.field2790 + arg7[1] * class222.field3171 + (arg7[7] * class126.field1883) + 16384 >> 15;
                    int var130 = var126 + var129;
                    int var131 = var125 + var128;
                    int var132 = arg7[8] * class126.field1883 + arg7[5] * class196.field2790 + arg7[2] * class222.field3171 + 16384 >> 15;
                    class222.field3171 = var131;
                    int var133 = var127 + var132;
                    class196.field2790 = var130;
                    class147.field2139 = false;
                    class126.field1883 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class222.field3171 * var134 + 16384 >> 15;
                int var138 = -class196.field2790 * var135 + 16384 >> 15;
                int var139 = -class126.field1883 * var136 + 16384 >> 15;
                int var140 = class222.field3171 + var137;
                int var141 = class196.field2790 + var138;
                int var142 = class126.field1883 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 16384 >> 15;
                    }
                }
                int var152 = arg7[1] * var148 + arg7[0] * var147 + arg7[2] * var149 + 16384 >> 15;
                int var153 = arg7[4] * var148 + arg7[3] * var147 + (arg7[5] * var149) + 16384 >> 15;
                int var154 = var122 + var152;
                int var155 = arg7[8] * var149 + arg7[6] * var147 + (arg7[7] * var148) + 16384 >> 15;
                int var156 = var123 + var153;
                int var157 = var124 + var155;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field5050.length > var159) {
                        int[] var160 = this.field5050[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field5077 == null || (this.field5077[var162] & arg6) != 0) {
                                int var163 = this.field5053[var162] * var150[0] + this.field4985[var162] * var150[2] + (this.field5056[var162] * var150[1]) + 16384 >> 15;
                                int var164 = this.field5053[var162] * var150[3] + 16384 - (-(this.field5056[var162] * var150[4]) - this.field4985[var162] * var150[5]) >> 15;
                                int var165 = this.field4985[var162] * var150[8] + (this.field5053[var162] * var150[6] + (this.field5056[var162] * var150[7]) + 16384) >> 15;
                                int var166 = var156 + var164;
                                int var167 = var154 + var163;
                                int var168 = var157 + var165;
                                this.field5053[var162] = var167;
                                this.field5056[var162] = var166;
                                this.field4985[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5044 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field5044.length > var181) {
                        int[] var182 = this.field5044[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field4979 == null || (arg6 & this.field4979[var184]) != 0) {
                                int var185 = (this.field5076[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field5076[var184] = (byte) var185;
                                if (this.field5034 != null) {
                                    this.field5034.field571 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5001 != null) {
                    for (int var178 = 0; var178 < this.field5075; var178++) {
                        class214 var179 = this.field5001[var178];
                        class336 var180 = this.field5042[var178];
                        var180.field4523 = var180.field4523 & 0xFFFFFF | 255 - (this.field5076[var179.field2993] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5044 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field5044.length) {
                        int[] var191 = this.field5044[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field4979 == null || (arg6 & this.field4979[var193]) != 0) {
                                int var194 = this.field5010[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFD7F) >> 10;
                                int var196 = (var194 & 0x3B5) >> 7;
                                int var197 = arg2 + var195 & 0x3F;
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
                                this.field5010[var193] = (short) class255.method1532(class255.method1532(var198 << 7, var197 << 10), var200);
                                if (this.field5034 != null) {
                                    this.field5034.field571 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5001 != null) {
                    for (int var187 = 0; var187 < this.field5075; var187++) {
                        class214 var188 = this.field5001[var187];
                        class336 var189 = this.field5042[var187];
                        var189.field4523 = var189.field4523 & 0xFF000000 | class166.field2487[this.field5010[var188.field2993] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4983 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field4983.length) {
                        int[] var203 = this.field4983[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class336 var205 = this.field5042[var203[var204]];
                            var205.field4528 += arg3;
                            var205.field4527 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4983 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field4983.length > var207) {
                        int[] var208 = this.field4983[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class336 var210 = this.field5042[var208[var209]];
                            var210.field4526 = var210.field4526 * arg2 >> 7;
                            var210.field4535 = var210.field4535 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4983 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field4983.length) {
                    int[] var213 = this.field4983[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class336 var215 = this.field5042[var213[var214]];
                        var215.field4531 = var215.field4531 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lya;IIB)V", line = 3684)
    public static final void method2065(class38 arg0, int arg1, int arg2, byte arg3) {
        field5022++;
        if (arg1 < 0 || arg2 < 0 || class116.field1741 == 0 || class20.field258 == 0) {
            return;
        }
        arg0.method296(class115.field1725, class259.field3605, class116.field1741, class20.field258);
        if (arg3 > -59) {
            method2060((byte) 21, 90);
        }
        arg0.method279(class531.field7825, class147.field2135, class116.field1741, class20.field258);
        class122 var4 = arg0.method310();
        var4.method180(class210.field2931, class26.field347, class451.field6651, class125.field1874, class309.field4199, class274.field3762);
        arg0.method299(var4);
        if (class385.field5608 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg0.method224();
            int var8 = (arg1 - class115.field1725) * var7 / class116.field1741;
            int var9 = (arg2 - class259.field3605) * var7 / class20.field258;
            int var10 = arg0.method237();
            int var11 = (arg1 - class115.field1725) * var10 / class116.field1741;
            int var12 = (arg2 - class259.field3605) * var10 / class20.field258;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method184(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method184(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class527.field7799 > var20 && var22 < class422.field6182) {
                    int var23 = class316.field4324.field1738;
                    if (var23 < 3 && (class267.field3700[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class385.field5608[var23].method361(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class316.field4324.method626((byte) 120) - 1 << 6) >> 7;
                        var6 = var21 + (class316.field4324.method626((byte) 120) - 1 << 6) >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class59.field720 && (class13.field199 & 0x40) != 0) {
                    class150 var24 = class525.method3121(class214.field2994, class250.field3462, -9140);
                    if (var24 == null) {
                        class88.method668((byte) -70);
                    } else {
                        class407.method2438(51, class352.field5167, true, 0L, class78.field1131, var5, " ->", -1, 500, false, var6);
                    }
                } else {
                    if (class323.field4400 == class11.field173) {
                        class407.method2438(44, -1, true, 0L, class111.field1674.method2731(62, class372.field5455), var5, "", -1, 500, false, var6);
                    }
                    class404.field5926++;
                    class407.method2438(59, class347.field4972, true, 0L, class259.field3609, var5, "", -1, 500, false, var6);
                }
            }
        }
        class410 var25 = class296.field4069;
        for (class289 var26 = (class289) var25.method2461(-125); var26 != null; var26 = (class289) var25.method2458(109)) {
            if (class316.field4324.field1738 == var26.field4002 && var26.method1724((byte) 95, arg0, arg2, arg1)) {
                if (var26.field4005 instanceof class438) {
                    class438 var27 = (class438) var26.field4005;
                    int var28 = var27.method626((byte) 120);
                    if ((var28 & 0x1) == 0 && (var27.field1732 & 0x7F) == 0 && (var27.field1735 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field1732 & 0x7F) == 64 && (var27.field1735 & 0x7F) == 64) {
                        int var29 = var27.field1732 - (var27.method626((byte) 120) - 1 << 6);
                        int var30 = var27.field1735 - (var27.method626((byte) 120) - 1 << 6);
                        for (int var31 = 0; var31 < class275.field3772; var31++) {
                            class502 var38 = class378.field5533[class65.field899[var31]];
                            if (var38 != null && class441.field6516 != var38.field1107 && var38.field1071) {
                                int var39 = var38.field1732 - (var38.field7387.field1168 - 1 << 6);
                                int var40 = var38.field1735 - (var38.field7387.field1168 - 1 << 6);
                                if (var39 >= var29 && var38.field7387.field1168 <= var27.method626((byte) 120) - (var39 - var29 >> 7) && var30 <= var40 && var38.field7387.field1168 <= (var27.method626((byte) 120) - (var40 - var30 >> 7))) {
                                    class291.method1729(true, var38, class316.field4324.field1738 != var26.field4002);
                                    var38.field1107 = class441.field6516;
                                }
                            }
                        }
                        int var32 = class375.field5498;
                        int[] var33 = class397.field5793;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class438 var35 = class12.field182[var33[var34]];
                            if (var35 != null && class441.field6516 != var35.field1107 && var27 != var35 && var35.field1071) {
                                int var36 = var35.field1732 - (var35.method626((byte) 120) - 1 << 6);
                                int var37 = var35.field1735 - (var35.method626((byte) 120) - 1 << 6);
                                if (var29 <= var36 && var35.method626((byte) 120) <= (var27.method626((byte) 120) - (var36 - var29 >> 7)) && var30 <= var37 && var35.method626((byte) 120) <= (var27.method626((byte) 120) - (var37 - var30 >> 7))) {
                                    class408.method2440(var35, 5, class316.field4324.field1738 != var26.field4002);
                                    var35.field1107 = class441.field6516;
                                }
                            }
                        }
                    }
                    if (class441.field6516 == var27.field1107) {
                        continue;
                    }
                    class408.method2440(var27, 5, class316.field4324.field1738 != var26.field4002);
                    var27.field1107 = class441.field6516;
                }
                if (var26.field4005 instanceof class502) {
                    class502 var41 = (class502) var26.field4005;
                    if (var41.field7387 != null) {
                        if ((var41.field7387.field1168 & 0x1) == 0 && (var41.field1732 & 0x7F) == 0 && (var41.field1735 & 0x7F) == 0 || (var41.field7387.field1168 & 0x1) == 1 && (var41.field1732 & 0x7F) == 64 && (var41.field1735 & 0x7F) == 64) {
                            int var42 = var41.field1732 - (var41.field7387.field1168 - 1 << 6);
                            int var43 = var41.field1735 - (var41.field7387.field1168 - 1 << 6);
                            for (int var44 = 0; var44 < class275.field3772; var44++) {
                                class502 var51 = class378.field5533[class65.field899[var44]];
                                if (var51 != null && class441.field6516 != var51.field1107 && var41 != var51 && var51.field1071) {
                                    int var52 = var51.field1732 - (var51.field7387.field1168 - 1 << 6);
                                    int var53 = var51.field1735 - (var51.field7387.field1168 - 1 << 6);
                                    if (var52 >= var42 && (var41.field7387.field1168 - (var52 - var42 >> 7)) >= var51.field7387.field1168 && var43 <= var53 && (var41.field7387.field1168 - (var53 - var43 >> 7)) >= var51.field7387.field1168) {
                                        class291.method1729(true, var51, class316.field4324.field1738 != var26.field4002);
                                        var51.field1107 = class441.field6516;
                                    }
                                }
                            }
                            int var45 = class375.field5498;
                            int[] var46 = class397.field5793;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class438 var48 = class12.field182[var46[var47]];
                                if (var48 != null && class441.field6516 != var48.field1107 && var48.field1071) {
                                    int var49 = var48.field1732 - (var48.method626((byte) 120) - 1 << 6);
                                    int var50 = var48.field1735 - (var48.method626((byte) 120) - 1 << 6);
                                    if (var42 <= var49 && var48.method626((byte) 120) <= var41.field7387.field1168 - (var49 - var42 >> 7) && var43 <= var50 && var48.method626((byte) 120) <= (var41.field7387.field1168 - (var50 - var43 >> 7))) {
                                        class408.method2440(var48, 5, class316.field4324.field1738 != var26.field4002);
                                        var48.field1107 = class441.field6516;
                                    }
                                }
                            }
                        }
                        if (class441.field6516 == var41.field1107) {
                            continue;
                        }
                        class291.method1729(true, var41, class316.field4324.field1738 != var26.field4002);
                        var41.field1107 = class441.field6516;
                    }
                }
                if (var26.field4005 instanceof class296) {
                    class135 var54 = (class135) class36.field457.method1492((long) (var26.field4006 | var26.field4002 << 28 | var26.field4008 << 14), 6340);
                    if (var54 != null) {
                        for (class440 var55 = (class440) var54.field1950.method2811(2); var55 != null; var55 = (class440) var54.field1950.method2813(29)) {
                            class508 var56 = class328.field4480.method3091(92, var55.field6509);
                            if (!class59.field720) {
                                if (class316.field4324.field1738 == var26.field4002) {
                                    String[] var57 = var56.field7502;
                                    for (int var58 = 4; var58 >= 0; var58--) {
                                        if (var57 != null && var57[var58] != null) {
                                            byte var59 = 0;
                                            int var60 = class380.field5557;
                                            if (var58 == 0) {
                                                var59 = 17;
                                            }
                                            if (var58 == 1) {
                                                var59 = 23;
                                            }
                                            if (var58 == 2) {
                                                var59 = 20;
                                            }
                                            if (var58 == 3) {
                                                var59 = 3;
                                            }
                                            if (var56.field7525 == var58) {
                                                var60 = var56.field7518;
                                            }
                                            if (var58 == 4) {
                                                var59 = 19;
                                            }
                                            if (var56.field7471 == var58) {
                                                var60 = var56.field7524;
                                            }
                                            class407.method2438(var59, var60, true, (long) var55.field6509, var57[var58], var26.field4006, "<col=ff9040>" + var56.field7506, -1, 500, false, var26.field4008);
                                            class59.field713++;
                                        }
                                    }
                                }
                                class490.field7149++;
                                class407.method2438(1007, class6.field111, true, (long) var55.field6509, class70.field966.method2731(62, class372.field5455), var26.field4006, "<col=ff9040>" + var56.field7506, -1, 500, class316.field4324.field1738 != var26.field4002, var26.field4008);
                            } else if (class316.field4324.field1738 == var26.field4002) {
                                class177 var61 = class292.field4043 == -1 ? null : class177.field2622.method2033((byte) -95, class292.field4043);
                                if ((class13.field199 & 0x1) != 0 && (var61 == null || var56.method3044(class292.field4043, -29012, var61.field2615) != var61.field2615)) {
                                    class407.method2438(18, class352.field5167, true, (long) var55.field6509, class78.field1131, var26.field4006, class253.field3513 + " -> <col=ff9040>" + var56.field7506, -1, 500, false, var26.field4008);
                                    client.field2797++;
                                }
                            }
                        }
                    }
                }
                if (var26.field4005 instanceof class503) {
                    class503 var62 = (class503) var26.field4005;
                    class220 var63 = class78.field1141.method2103(var62.method490(-29679), true);
                    if (var63.field3080 != null) {
                        var63 = var63.method1362(true, class421.field6166);
                    }
                    if (var63 != null) {
                        if (!class59.field720) {
                            if (class316.field4324.field1738 == var26.field4002) {
                                String[] var65 = var63.field3094;
                                if (var65 != null) {
                                    for (int var66 = 4; var66 >= 0; var66--) {
                                        if (var65[var66] != null) {
                                            short var67 = 0;
                                            if (var66 == 0) {
                                                var67 = 6;
                                            }
                                            int var68 = class380.field5557;
                                            if (var66 == 1) {
                                                var67 = 45;
                                            }
                                            if (var66 == 2) {
                                                var67 = 58;
                                            }
                                            if (var66 == 3) {
                                                var67 = 48;
                                            }
                                            if (var63.field3095 == var66) {
                                                var68 = var63.field3065;
                                            }
                                            if (var66 == 4) {
                                                var67 = 1011;
                                            }
                                            if (var63.field3077 == var66) {
                                                var68 = var63.field3083;
                                            }
                                            class407.method2438(var67, var68, true, class98.method717(var26.field4006, var62, var26.field4008, (byte) 76), var65[var66], var26.field4006, "<col=00ffff>" + var63.field3150, -1, 500, false, var26.field4008);
                                            class295.field4057++;
                                        }
                                    }
                                }
                            }
                            class407.method2438(1006, class6.field111, true, (long) var63.field3110, class70.field966.method2731(62, class372.field5455), var26.field4006, "<col=00ffff>" + var63.field3150, -1, 500, class316.field4324.field1738 != var26.field4002, var26.field4008);
                            class423.field6199++;
                        } else if (class316.field4324.field1738 == var26.field4002) {
                            class177 var64 = class292.field4043 == -1 ? null : class177.field2622.method2033((byte) 119, class292.field4043);
                            if ((class13.field199 & 0x4) != 0 && (var64 == null || var63.method1373(var64.field2615, -101, class292.field4043) != var64.field2615)) {
                                class407.method2438(10, class352.field5167, true, class98.method717(var26.field4006, var62, var26.field4008, (byte) 76), class78.field1131, var26.field4006, class253.field3513 + " -> <col=00ffff>" + var63.field3150, -1, 500, false, var26.field4008);
                                class107.field1612++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIIIIII)Z", line = 4145)
    private final boolean method2066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5035++;
        if (arg4 != 32767) {
            this.method2058(-1.7241751F, null, -1.293382F, -91, 83, 107, -7, (byte) -15, 113, -93L);
        }
        if (arg6 > arg8 && arg8 < arg3 && arg8 < arg1) {
            return false;
        } else if (arg8 > arg6 && arg3 < arg8 && arg8 > arg1) {
            return false;
        } else if (arg2 < arg7 && arg5 > arg2 && arg0 > arg2) {
            return false;
        } else {
            return arg2 <= arg7 || arg2 <= arg5 || arg2 <= arg0;
        }
    }

    @OriginalMember(owner = "client!ko", name = "IA", descriptor = "()V", line = 4181)
    public final void method398() {
        field5003++;
        for (int var1 = 0; var1 < this.field5007; var1++) {
            this.field4985[var1] = -this.field4985[var1];
        }
        for (int var2 = 0; var2 < this.field5012; var2++) {
            this.field5066[var2] = (short) (-this.field5066[var2]);
        }
        for (int var3 = 0; var3 < this.field4981; var3++) {
            short var4 = this.field5030[var3];
            this.field5030[var3] = this.field5046[var3];
            this.field5046[var3] = var4;
        }
        if (this.field4991 == null && this.field5034 != null) {
            this.field5034.field571 = null;
        }
        if (this.field4991 != null) {
            this.field4991.field571 = null;
        }
        if (this.field4978 != null) {
            this.field4978.field571 = null;
        }
        if (this.field5000 != null) {
            this.field5000.field6845 = null;
        }
        this.field5014 = false;
    }

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "(III)V", line = 4231)
    public final void method403(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5007; var4++) {
            if (arg0 != 128) {
                this.field5053[var4] = this.field5053[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field5056[var4] = this.field5056[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field4985[var4] = this.field4985[var4] * arg2 >> 7;
            }
        }
        field5063++;
        if (this.field4978 != null) {
            this.field4978.field571 = null;
        }
        this.field5014 = false;
    }

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "(I)V", line = 4266)
    public final void method385(int arg0) {
        if (this.field5034 != null) {
            this.field5034.field571 = null;
        }
        field5045++;
        this.field5009 = (short) arg0;
    }

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "()I", line = 4284)
    public final int method386() {
        field4989++;
        return this.field5009;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lc;Lii;I)V", line = 4292)
    public final void method397(class122 arg0, class387 arg1, int arg2) {
        field5002++;
        if (this.field5012 == 0) {
            return;
        }
        class234 var4 = this.field4982.field4818;
        if (!this.field5014) {
            this.method2061(62);
        }
        class234 var5 = (class234) arg0;
        this.method2054(var5, 119);
        class14.field207 = var4.field3317 * var5.field3329 + var4.field3329 * var5.field3319 + var4.field3314 * var5.field3296;
        class78.field1132 = var4.field3317 * var5.field3312 + var4.field3329 * var5.field3328 + var4.field3314 * var5.field3313 + var4.field3312;
        float var6 = (float) this.field5006 * class14.field207 + class78.field1132;
        float var7 = (float) this.field5049 * class14.field207 + class78.field1132;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = (float) this.field5058 + var6;
            var8 = (float) (-this.field5058) + var7;
        } else {
            var8 = var6 - (float) this.field5058;
            var9 = (float) this.field5058 + var7;
        }
        if ((var8 >= this.field4982.field4782) || (var9 <= (float) this.field4982.field4828)) {
            return;
        }
        class122.field1824 = var4.field3326 * var5.field3329 + var4.field3309 * var5.field3296 + var4.field3296 * var5.field3319;
        class420.field6145 = var4.field3326 * var5.field3312 + var4.field3309 * var5.field3313 + var4.field3296 * var5.field3328 + var4.field3313;
        float var10 = (float) this.field5006 * class122.field1824 + class420.field6145;
        float var11 = (float) this.field5049 * class122.field1824 + class420.field6145;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var13 = ((float) (-this.field5058) + var11) * (float) this.field4982.field4791;
            var12 = ((float) this.field5058 + var10) * (float) this.field4982.field4791;
        } else {
            var12 = ((float) this.field5058 + var11) * (float) this.field4982.field4791;
            var13 = (var10 - (float) this.field5058) * (float) this.field4982.field4791;
        }
        if ((var13 / var9 >= this.field4982.field4770) || (var12 / var9 <= this.field4982.field4837)) {
            return;
        }
        class36.field458 = var4.field3323 * var5.field3329 + var4.field3319 * var5.field3319 + var4.field3297 * var5.field3296;
        class307.field4174 = var4.field3323 * var5.field3312 + var4.field3319 * var5.field3328 + var4.field3297 * var5.field3313 + var4.field3328;
        float var14 = (float) this.field5006 * class36.field458 + class307.field4174;
        float var15 = (float) this.field5049 * class36.field458 + class307.field4174;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) this.field5058 + var14) * (float) this.field4982.field4789;
            var17 = ((float) (-this.field5058) + var15) * (float) this.field4982.field4789;
        } else {
            var17 = (var14 - (float) this.field5058) * (float) this.field4982.field4789;
            var16 = ((float) this.field5058 + var15) * (float) this.field4982.field4789;
        }
        if ((var17 / var9 >= this.field4982.field4808) || (var16 / var9 <= this.field4982.field4796)) {
            return;
        }
        if (arg1 != null || this.field5001 != null) {
            class117.field1755 = var4.field3317 * var5.field3317 + var4.field3329 * var5.field3323 + var4.field3314 * var5.field3326;
            class98.field1482 = var4.field3323 * var5.field3314 + var4.field3319 * var5.field3297 + var4.field3297 * var5.field3309;
            class200.field2830 = var4.field3326 * var5.field3317 + var4.field3309 * var5.field3326 + var4.field3296 * var5.field3323;
            class168.field2516 = var4.field3326 * var5.field3314 + var4.field3309 * var5.field3309 + var4.field3296 * var5.field3297;
            class200.field2831 = var4.field3317 * var5.field3314 + var4.field3329 * var5.field3297 + var4.field3314 * var5.field3309;
            class389.field5665 = var4.field3323 * var5.field3317 + var4.field3319 * var5.field3323 + var4.field3297 * var5.field3326;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field5067 + this.field4977 >> 1;
            int var21 = this.field5052 + this.field5029 >> 1;
            int var22 = (int) ((float) var21 * class200.field2830 + (float) this.field5006 * class122.field1824 + (float) var20 * class168.field2516 + class420.field6145);
            int var23 = (int) ((float) var21 * class389.field5665 + (float) this.field5006 * class36.field458 + (float) var20 * class98.field1482 + class307.field4174);
            int var24 = (int) ((float) var21 * class117.field1755 + (float) this.field5006 * class14.field207 + (float) var20 * class200.field2831 + class78.field1132);
            if (this.field4982.field4828 <= var24) {
                arg1.field5645 = this.field4982.field4816 + (this.field4982.field4789 * var23 / var24);
                arg1.field5643 = this.field4982.field4791 * var22 / var24 + this.field4982.field4885;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class200.field2830 + (float) this.field5049 * class122.field1824 + (float) var20 * class168.field2516 + class420.field6145);
            int var26 = (int) ((float) var21 * class389.field5665 + (float) this.field5049 * class36.field458 + (float) var20 * class98.field1482 + class307.field4174);
            int var27 = (int) ((float) var21 * class117.field1755 + (float) this.field5049 * class14.field207 + (float) var20 * class200.field2831 + class78.field1132);
            if (this.field4982.field4828 > var27) {
                var18 = true;
            } else {
                arg1.field5642 = this.field4982.field4789 * var26 / var27 + this.field4982.field4816;
                arg1.field5640 = this.field4982.field4885 + (this.field4982.field4791 * var25 / var27);
            }
            if (var18) {
                if (var24 < this.field4982.field4828 && this.field4982.field4828 > var27) {
                    var19 = false;
                } else if (this.field4982.field4828 > var24) {
                    int var31 = (var27 - this.field4982.field4828 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    arg1.field5643 = this.field4982.field4791 * var32 / this.field4982.field4828 + this.field4982.field4885;
                    int var33 = var26 + ((var26 - var23) * var31 >> 16);
                    arg1.field5645 = this.field4982.field4789 * var33 / this.field4982.field4828 + this.field4982.field4816;
                } else if (var27 < this.field4982.field4828) {
                    int var28 = (var24 - this.field4982.field4828 << 16) / (var24 - var27);
                    int var29 = var22 + ((var22 - var25) * var28 >> 16);
                    arg1.field5643 = this.field4982.field4791 * var29 / this.field4982.field4828 + this.field4982.field4885;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field5645 = this.field4982.field4789 * var30 / this.field4982.field4828 + this.field4982.field4816;
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field5641 = this.field4982.field4885 + ((this.field5058 + var22) * this.field4982.field4791 / var24) - arg1.field5643;
                } else {
                    arg1.field5641 = (this.field5058 + var25) * this.field4982.field4791 / var27 + this.field4982.field4885 - arg1.field5640;
                }
                arg1.field5644 = true;
            }
        }
        this.field4982.method1988(-1);
        this.field4982.method1948(var5, true);
        this.method2055(113);
        this.field4982.method1954(34162);
        this.method2062(true);
    }

    @OriginalMember(owner = "client!ko", name = "Q", descriptor = "(I)V", line = 4497)
    public final void method393(int arg0) {
        field5013++;
        int var2 = class183.field2684[arg0];
        int var3 = class183.field2678[arg0];
        for (int var4 = 0; var4 < this.field5007; var4++) {
            int var5 = this.field4985[var4] * var2 + (this.field5053[var4] * var3) >> 15;
            this.field4985[var4] = this.field4985[var4] * var3 - (this.field5053[var4] * var2) >> 15;
            this.field5053[var4] = var5;
        }
        if (this.field4978 != null) {
            this.field4978.field571 = null;
        }
        this.field5014 = false;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZZLko;Lko;IZ)Lt;", line = 4531)
    private final class471 method2067(boolean arg0, boolean arg1, class348 arg2, class348 arg3, int arg4, boolean arg5) {
        arg3.field5012 = this.field5012;
        arg3.field5007 = this.field5007;
        arg3.field5038 = this.field5038;
        field5061++;
        arg3.field5009 = this.field5009;
        arg3.field5075 = this.field5075;
        arg3.field5060 = this.field5060;
        arg3.field5070 = this.field5070;
        arg3.field5017 = 0;
        arg3.field4981 = this.field4981;
        arg3.field5037 = this.field5037;
        if (arg0) {
            method2059(-63);
        }
        arg3.field4993 = arg4;
        boolean var7 = class438.method2587(0, arg4, this.field5038);
        boolean var8 = class317.method1850(arg4, this.field5038, 0);
        boolean var9 = class121.method853(arg4, (byte) -107, this.field5038);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg3.field5053 = this.field5053;
            } else if (arg2.field5053 == null || this.field5070 > arg2.field5053.length) {
                arg3.field5053 = arg2.field5053 = new int[this.field5070];
            } else {
                arg3.field5053 = arg2.field5053;
            }
            if (!var8) {
                arg3.field5056 = this.field5056;
            } else if (arg2.field5056 == null || this.field5070 > arg2.field5056.length) {
                arg3.field5056 = arg2.field5056 = new int[this.field5070];
            } else {
                arg3.field5056 = arg2.field5056;
            }
            if (!var9) {
                arg3.field4985 = this.field4985;
            } else if (arg2.field4985 == null || arg2.field4985.length < this.field5070) {
                arg3.field4985 = arg2.field4985 = new int[this.field5070];
            } else {
                arg3.field4985 = arg2.field4985;
            }
            for (int var11 = 0; var11 < this.field5070; var11++) {
                if (var7) {
                    arg3.field5053[var11] = this.field5053[var11];
                }
                if (var8) {
                    arg3.field5056[var11] = this.field5056[var11];
                }
                if (var9) {
                    arg3.field4985[var11] = this.field4985[var11];
                }
            }
        } else {
            arg3.field4985 = this.field4985;
            arg3.field5053 = this.field5053;
            arg3.field5056 = this.field5056;
        }
        if (class211.method1306(arg4, 32, this.field5038)) {
            if (arg5) {
                arg3.field5017 = (byte) (arg3.field5017 | 0x1);
            }
            arg3.field4978 = arg2.field4978;
            arg3.field4978.field571 = this.field4978.field571;
            arg3.field4978.field573 = this.field4978.field573;
        } else if (class519.method3087(this.field5038, 96, arg4)) {
            arg3.field4978 = this.field4978;
        } else {
            arg3.field4978 = null;
        }
        if (class472.method2778(arg4, this.field5038, (byte) -117)) {
            if (arg2.field5010 == null || arg2.field5010.length < this.field4981) {
                arg3.field5010 = arg2.field5010 = new short[this.field4981];
            } else {
                arg3.field5010 = arg2.field5010;
            }
            for (int var12 = 0; var12 < this.field4981; var12++) {
                arg3.field5010[var12] = this.field5010[var12];
            }
        } else {
            arg3.field5010 = this.field5010;
        }
        if (class462.method2713((byte) 66, this.field5038, arg4)) {
            if (arg2.field5076 == null || this.field4981 > arg2.field5076.length) {
                arg3.field5076 = arg2.field5076 = new byte[this.field4981];
            } else {
                arg3.field5076 = arg2.field5076;
            }
            for (int var13 = 0; var13 < this.field4981; var13++) {
                arg3.field5076[var13] = this.field5076[var13];
            }
        } else {
            arg3.field5076 = this.field5076;
        }
        if (class266.method1598(-90, arg4, this.field5038)) {
            arg3.field5034 = arg2.field5034;
            if (arg5) {
                arg3.field5017 = (byte) (arg3.field5017 | 0x2);
            }
            arg3.field5034.field571 = this.field5034.field571;
            arg3.field5034.field573 = this.field5034.field573;
        } else if (class105.method777(arg4, true, this.field5038)) {
            arg3.field5034 = this.field5034;
        } else {
            arg3.field5034 = null;
        }
        if (class483.method2834(-120, this.field5038, arg4)) {
            if (arg2.field5004 == null || arg2.field5004.length < this.field5012) {
                int var14 = this.field5012;
                arg3.field5033 = arg2.field5033 = new short[var14];
                arg3.field5066 = arg2.field5066 = new short[var14];
                arg3.field5004 = arg2.field5004 = new short[var14];
            } else {
                arg3.field5004 = arg2.field5004;
                arg3.field5066 = arg2.field5066;
                arg3.field5033 = arg2.field5033;
            }
            if (this.field5027 == null) {
                for (int var18 = 0; var18 < this.field5012; var18++) {
                    arg3.field5004[var18] = this.field5004[var18];
                    arg3.field5033[var18] = this.field5033[var18];
                    arg3.field5066[var18] = this.field5066[var18];
                }
            } else {
                if (arg2.field5027 == null) {
                    arg2.field5027 = new class381();
                }
                class381 var15 = arg3.field5027 = arg2.field5027;
                if (var15.field5563 == null || var15.field5563.length < this.field5012) {
                    int var16 = this.field5012;
                    var15.field5569 = new byte[var16];
                    var15.field5570 = new short[var16];
                    var15.field5563 = new short[var16];
                    var15.field5568 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field5012; var17++) {
                    arg3.field5004[var17] = this.field5004[var17];
                    arg3.field5033[var17] = this.field5033[var17];
                    arg3.field5066[var17] = this.field5066[var17];
                    var15.field5563[var17] = this.field5027.field5563[var17];
                    var15.field5570[var17] = this.field5027.field5570[var17];
                    var15.field5568[var17] = this.field5027.field5568[var17];
                    var15.field5569[var17] = this.field5027.field5569[var17];
                }
            }
            arg3.field5087 = this.field5087;
        } else {
            arg3.field5033 = this.field5033;
            arg3.field5004 = this.field5004;
            arg3.field5087 = this.field5087;
            arg3.field5027 = this.field5027;
            arg3.field5066 = this.field5066;
        }
        if (class500.method2936(this.field5038, -1, arg4)) {
            if (arg5) {
                arg3.field5017 = (byte) (arg3.field5017 | 0x4);
            }
            arg3.field4991 = arg2.field4991;
            arg3.field4991.field571 = this.field4991.field571;
            arg3.field4991.field573 = this.field4991.field573;
        } else if (class338.method1972(!arg0, arg4, this.field5038)) {
            arg3.field4991 = this.field4991;
        } else {
            arg3.field4991 = null;
        }
        if (class50.method440(arg4, this.field5038, 1)) {
            if (arg2.field5055 == null || this.field4981 > arg2.field5055.length) {
                int var19 = this.field5012;
                arg3.field5055 = arg2.field5055 = new float[var19];
                arg3.field4995 = arg2.field4995 = new float[var19];
            } else {
                arg3.field4995 = arg2.field4995;
                arg3.field5055 = arg2.field5055;
            }
            for (int var20 = 0; var20 < this.field5012; var20++) {
                arg3.field5055[var20] = this.field5055[var20];
                arg3.field4995[var20] = this.field4995[var20];
            }
        } else {
            arg3.field5055 = this.field5055;
            arg3.field4995 = this.field4995;
        }
        if (class333.method1916(121, this.field5038, arg4)) {
            arg3.field5078 = arg2.field5078;
            if (arg5) {
                arg3.field5017 = (byte) (arg3.field5017 | 0x8);
            }
            arg3.field5078.field573 = this.field5078.field573;
            arg3.field5078.field571 = this.field5078.field571;
        } else if (class98.method719((byte) -3, arg4, this.field5038)) {
            arg3.field5078 = this.field5078;
        } else {
            arg3.field5078 = null;
        }
        if (class102.method759(103, this.field5038, arg4)) {
            if (arg2.field5030 == null || this.field4981 > arg2.field5030.length) {
                int var21 = this.field4981;
                arg3.field4984 = arg2.field4984 = new short[var21];
                arg3.field5046 = arg2.field5046 = new short[var21];
                arg3.field5030 = arg2.field5030 = new short[var21];
            } else {
                arg3.field5030 = arg2.field5030;
                arg3.field5046 = arg2.field5046;
                arg3.field4984 = arg2.field4984;
            }
            for (int var22 = 0; var22 < this.field4981; var22++) {
                arg3.field5030[var22] = this.field5030[var22];
                arg3.field4984[var22] = this.field4984[var22];
                arg3.field5046[var22] = this.field5046[var22];
            }
        } else {
            arg3.field4984 = this.field4984;
            arg3.field5030 = this.field5030;
            arg3.field5046 = this.field5046;
        }
        if (class154.method1036(4, arg4, this.field5038)) {
            if (arg5) {
                arg3.field5017 = (byte) (arg3.field5017 | 0x10);
            }
            arg3.field5000 = arg2.field5000;
            arg3.field5000.field6845 = this.field5000.field6845;
        } else if (class308.method1789(arg4, (byte) -94, this.field5038)) {
            arg3.field5000 = this.field5000;
        } else {
            arg3.field5000 = null;
        }
        if (class483.method2836(arg4, 112, this.field5038)) {
            if (arg2.field5065 == null || this.field4981 > arg2.field5065.length) {
                int var23 = this.field4981;
                arg3.field5065 = arg2.field5065 = new short[var23];
            } else {
                arg3.field5065 = arg2.field5065;
            }
            for (int var24 = 0; var24 < this.field4981; var24++) {
                arg3.field5065[var24] = this.field5065[var24];
            }
        } else {
            arg3.field5065 = this.field5065;
        }
        if (!class254.method1524(-1, arg4, this.field5038)) {
            arg3.field5042 = this.field5042;
        } else if (arg2.field5042 == null || this.field5075 > arg2.field5042.length) {
            int var26 = this.field5075;
            arg3.field5042 = arg2.field5042 = new class336[var26];
            for (int var27 = 0; var27 < this.field5075; var27++) {
                arg3.field5042[var27] = this.field5042[var27].method1920(-118);
            }
        } else {
            arg3.field5042 = arg2.field5042;
            for (int var25 = 0; var25 < this.field5075; var25++) {
                arg3.field5042[var25].method1922(128, this.field5042[var25]);
            }
        }
        arg3.field5050 = this.field5050;
        arg3.field4987 = this.field4987;
        arg3.field5071 = this.field5071;
        arg3.field5074 = this.field5074;
        arg3.field4983 = this.field4983;
        arg3.field5057 = this.field5057;
        arg3.field5044 = this.field5044;
        if (this.field5014) {
            arg3.field5052 = this.field5052;
            arg3.field5006 = this.field5006;
            arg3.field4977 = this.field4977;
            arg3.field5029 = this.field5029;
            arg3.field5049 = this.field5049;
            arg3.field5067 = this.field5067;
            arg3.field5014 = true;
            arg3.field5058 = this.field5058;
        } else {
            arg3.field5014 = false;
        }
        arg3.field5072 = this.field5072;
        arg3.field5077 = this.field5077;
        arg3.field4979 = this.field4979;
        arg3.field5001 = this.field5001;
        return arg3;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)V", line = 5005)
    private final void method2068(boolean arg0, int arg1) {
        field5086++;
        boolean var3 = this.field5034 != null && this.field5034.field571 == null;
        boolean var4 = this.field4991 != null && this.field4991.field571 == null;
        boolean var5 = this.field4978 != null && this.field4978.field571 == null;
        boolean var6 = this.field5078 != null && this.field5078.field571 == null;
        if (arg0) {
            var3 &= (this.field5017 & 0x2) != 0;
            var5 &= (this.field5017 & 0x1) != 0;
            var6 &= (this.field5017 & 0x8) != 0;
            var4 &= (this.field5017 & 0x4) != 0;
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
        if (~var7 == arg1) {
            return;
        }
        if (this.field5012 * var7 > class10.field148.field5678.length) {
            class10.field148 = new class498((this.field5012 + 100) * var7);
        } else {
            class10.field148.field5719 = 0;
        }
        if (var5) {
            if (this.field4982.field4772) {
                for (int var20 = 0; var20 < this.field5007; var20++) {
                    int var21 = NativeStream.floatToRawIntBits((float) this.field5053[var20]);
                    int var22 = NativeStream.floatToRawIntBits((float) this.field5056[var20]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field4985[var20]);
                    int var24 = this.field5072[var20];
                    int var25 = this.field5072[var20 + 1];
                    for (int var26 = var24; var26 < var25; var26++) {
                        int var27 = this.field4987[var26] - 1;
                        if (var27 == -1) {
                            break;
                        }
                        class10.field148.field5719 = var7 * var27;
                        class10.field148.method2359(var21, -122);
                        class10.field148.method2359(var22, -117);
                        class10.field148.method2359(var23, arg1 - 85);
                    }
                }
            } else {
                for (int var12 = 0; var12 < this.field5007; var12++) {
                    int var13 = NativeStream.floatToRawIntBits((float) this.field5053[var12]);
                    int var14 = NativeStream.floatToRawIntBits((float) this.field5056[var12]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field4985[var12]);
                    int var16 = this.field5072[var12];
                    int var17 = this.field5072[var12 + 1];
                    for (int var18 = var16; var18 < var17; var18++) {
                        int var19 = this.field4987[var18] - 1;
                        if (var19 == -1) {
                            break;
                        }
                        class10.field148.field5719 = var7 * var19;
                        class10.field148.method2357(var13, (byte) -84);
                        class10.field148.method2357(var14, (byte) -84);
                        class10.field148.method2357(var15, (byte) -84);
                    }
                }
            }
        }
        if (var3) {
            if (this.field4991 == null) {
                short[] var30;
                byte[] var31;
                short[] var32;
                short[] var33;
                if (this.field5027 == null) {
                    var30 = this.field5033;
                    var31 = this.field5087;
                    var32 = this.field5066;
                    var33 = this.field5004;
                } else {
                    var33 = this.field5027.field5563;
                    var31 = this.field5027.field5569;
                    var30 = this.field5027.field5570;
                    var32 = this.field5027.field5568;
                }
                float var34 = this.field4982.field4769[0];
                float var35 = this.field4982.field4769[1];
                float var36 = this.field4982.field4769[2];
                float var37 = this.field4982.field4825;
                float var38 = this.field4982.field4784 * 768.0F / (float) this.field5037;
                float var39 = this.field4982.field4846 * 768.0F / (float) this.field5037;
                for (int var40 = 0; var40 < this.field4981; var40++) {
                    int var41 = this.method2053(this.field5065[var40], this.field5010[var40], this.field5076[var40], this.field5009, (byte) -65);
                    float var42 = (float) (var41 >> 8 & 0xFF) * this.field4982.field4822;
                    float var43 = (float) ((var41 & 0xFF6FD3) >> 16) * this.field4982.field4847;
                    short var44 = this.field5030[var40];
                    float var45 = (float) (var41 >>> 24) * this.field4982.field4866;
                    short var46 = (short) var31[var44];
                    float var47;
                    if (var46 == 0) {
                        var47 = ((float) var32[var44] * var36 + (float) var30[var44] * var35 + (float) var33[var44] * var34) * 0.0026041667F;
                    } else {
                        var47 = ((float) var32[var44] * var36 + (float) var30[var44] * var35 + (float) var33[var44] * var34) / (float) (var46 * 256);
                    }
                    float var48 = var37 + ((var47 < 0.0F) ? var39 : var38) * var47;
                    int var49 = (int) (var45 * var48);
                    int var50 = (int) (var43 * var48);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var51 = (int) (var42 * var48);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    class10.field148.field5719 = var7 * var44 + var9;
                    class10.field148.method2302(arg1 ^ 0x3, var49);
                    class10.field148.method2302(-4, var50);
                    class10.field148.method2302(-4, var51);
                    class10.field148.method2302(-4, 255 - (this.field5076[var40] & 0xFF));
                    short var52 = this.field4984[var40];
                    short var53 = (short) var31[var52];
                    float var54;
                    if (var53 == 0) {
                        var54 = ((float) var32[var52] * var36 + (float) var30[var52] * var35 + (float) var33[var52] * var34) * 0.0026041667F;
                    } else {
                        var54 = ((float) var32[var52] * var36 + (float) var30[var52] * var35 + (float) var33[var52] * var34) / (float) (var53 * 256);
                    }
                    float var55 = var54 * ((var54 < 0.0F) ? var39 : var38) + var37;
                    int var56 = (int) (var45 * var55);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var43 * var55);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var42 * var55);
                    class10.field148.field5719 = var7 * var52 + var9;
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    class10.field148.method2302(arg1 - 3, var56);
                    class10.field148.method2302(arg1 - 3, var57);
                    class10.field148.method2302(-4, var58);
                    class10.field148.method2302(-4, 255 - (this.field5076[var40] & 0xFF));
                    short var59 = this.field5046[var40];
                    short var60 = (short) var31[var59];
                    float var61;
                    if (var60 == 0) {
                        var61 = ((float) var32[var59] * var36 + (float) var30[var59] * var35 + (float) var33[var59] * var34) * 0.0026041667F;
                    } else {
                        var61 = ((float) var32[var59] * var36 + (float) var30[var59] * var35 + (float) var33[var59] * var34) / (float) (var60 * 256);
                    }
                    float var62 = (var61 < 0.0F ? var39 : var38) * var61 + var37;
                    int var63 = (int) (var45 * var62);
                    int var64 = (int) (var43 * var62);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    int var65 = (int) (var42 * var62);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    class10.field148.field5719 = var7 * var59 + var9;
                    class10.field148.method2302(arg1 - 3, var63);
                    class10.field148.method2302(-4, var64);
                    class10.field148.method2302(-4, var65);
                    class10.field148.method2302(arg1 - 3, -(this.field5076[var40] & 0xFF) + 255);
                }
            } else {
                for (int var28 = 0; var28 < this.field4981; var28++) {
                    int var29 = this.method2053(this.field5065[var28], this.field5010[var28], this.field5076[var28], this.field5009, (byte) -86);
                    class10.field148.field5719 = var9 + (this.field5030[var28] * var7);
                    class10.field148.method2359(var29, -116);
                    class10.field148.field5719 = this.field4984[var28] * var7 + var9;
                    class10.field148.method2359(var29, -95);
                    class10.field148.field5719 = this.field5046[var28] * var7 + var9;
                    class10.field148.method2359(var29, arg1 ^ 0x78);
                }
            }
        }
        if (var4) {
            short[] var66;
            byte[] var67;
            short[] var68;
            short[] var69;
            if (this.field5027 == null) {
                var67 = this.field5087;
                var68 = this.field5004;
                var69 = this.field5066;
                var66 = this.field5033;
            } else {
                var66 = this.field5027.field5570;
                var67 = this.field5027.field5569;
                var68 = this.field5027.field5563;
                var69 = this.field5027.field5568;
            }
            float var70 = 3.0F / (float) this.field5037;
            class10.field148.field5719 = var10;
            float var71 = 3.0F / (float) (this.field5037 / 2 + this.field5037);
            if (this.field4982.field4772) {
                for (int var72 = 0; var72 < this.field5012; var72++) {
                    int var73 = var67[var72] & 0xFF;
                    if (var73 == 0) {
                        class10.field148.method2906((byte) 80, (float) var68[var72] * var71);
                        class10.field148.method2906((byte) 80, (float) var66[var72] * var71);
                        class10.field148.method2906((byte) 80, (float) var69[var72] * var71);
                    } else {
                        float var74 = var70 / (float) var73;
                        class10.field148.method2906((byte) 80, (float) var68[var72] * var74);
                        class10.field148.method2906((byte) 80, (float) var66[var72] * var74);
                        class10.field148.method2906((byte) 80, (float) var69[var72] * var74);
                    }
                    class10.field148.field5719 += var7 - 12;
                }
            } else {
                for (int var75 = 0; var75 < this.field5012; var75++) {
                    int var76 = var67[var75] & 0xFF;
                    if (var76 == 0) {
                        class10.field148.method2909(1107866360, (float) var68[var75] * var71);
                        class10.field148.method2909(arg1 + 1107866361, (float) var66[var75] * var71);
                        class10.field148.method2909(1107866360, (float) var69[var75] * var71);
                    } else {
                        float var77 = var70 / (float) var76;
                        class10.field148.method2909(arg1 ^ 0xBDF74D07, (float) var68[var75] * var77);
                        class10.field148.method2909(1107866360, (float) var66[var75] * var77);
                        class10.field148.method2909(arg1 + 1107866361, (float) var69[var75] * var77);
                    }
                    class10.field148.field5719 += var7 - 12;
                }
            }
        }
        if (var6) {
            class10.field148.field5719 = var11;
            if (this.field4982.field4772) {
                for (int var78 = 0; var78 < this.field5012; var78++) {
                    class10.field148.method2906((byte) 80, this.field5055[var78]);
                    class10.field148.method2906((byte) 80, this.field4995[var78]);
                    class10.field148.field5719 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field5012; var79++) {
                    class10.field148.method2909(1107866360, this.field5055[var79]);
                    class10.field148.method2909(arg1 + 1107866361, this.field4995[var79]);
                    class10.field148.field5719 += var7 - 8;
                }
            }
        }
        class10.field148.field5719 = this.field5012 * var7;
        class334 var80;
        if (arg0) {
            if (this.field5039 == null) {
                this.field5039 = this.field4982.method1943(class10.field148.field5719, var7, class10.field148.field5678, (byte) 49, true);
            } else {
                this.field5039.method103(-13851, class10.field148.field5678, var7, class10.field148.field5719);
            }
            this.field5017 = 0;
            var80 = this.field5039;
        } else {
            var80 = this.field4982.method1943(class10.field148.field5719, var7, class10.field148.field5678, (byte) 49, false);
            this.field5081 = true;
        }
        if (var5) {
            this.field4978.field571 = var80;
            this.field4978.field573 = var8;
        }
        if (var6) {
            this.field5078.field573 = var11;
            this.field5078.field571 = var80;
        }
        if (var3) {
            this.field5034.field573 = var9;
            this.field5034.field571 = var80;
        }
        if (var4) {
            this.field4991.field571 = var80;
            this.field4991.field573 = var10;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V", line = 5519)
    private final void method2069(byte arg0) {
        field4976++;
        if (!this.field5081) {
            return;
        }
        this.field5081 = false;
        if (this.field5074 == null && this.field5071 == null && this.field5001 == null) {
            if (this.field5053 != null && !class479.method2815(this.field4993, this.field5038, (byte) 81)) {
                if (this.field4978 != null && this.field4978.field571 == null) {
                    this.field5081 = true;
                } else {
                    if (!this.field5014) {
                        this.method2061(62);
                    }
                    this.field5053 = null;
                }
            }
            if (this.field5056 != null && !class195.method1215(this.field4993, this.field5038, 80)) {
                if (this.field4978 != null && this.field4978.field571 == null) {
                    this.field5081 = true;
                } else {
                    if (!this.field5014) {
                        this.method2061(10);
                    }
                    this.field5056 = null;
                }
            }
            if (this.field4985 != null && !class30.method177(this.field4993, this.field5038, (byte) 103)) {
                if (this.field4978 != null && this.field4978.field571 == null) {
                    this.field5081 = true;
                } else {
                    if (!this.field5014) {
                        this.method2061(-2);
                    }
                    this.field4985 = null;
                }
            }
        }
        if (this.field4987 != null && this.field5053 == null && this.field5056 == null && this.field4985 == null) {
            this.field5072 = null;
            this.field4987 = null;
        }
        if (this.field5087 != null && !class186.method1172(this.field4993, 65536, this.field5038)) {
            if (this.field4991 == null) {
                if (this.field5034 != null && this.field5034.field571 == null) {
                    this.field5081 = true;
                } else {
                    this.field5087 = null;
                    this.field5004 = this.field5033 = this.field5066 = null;
                }
            } else if (this.field4991.field571 == null) {
                this.field5081 = true;
            } else {
                this.field5087 = null;
                this.field5004 = this.field5033 = this.field5066 = null;
            }
        }
        if (this.field5010 != null && !class153.method1022(this.field5038, this.field4993, -88)) {
            if (this.field5034 != null && this.field5034.field571 == null) {
                this.field5081 = true;
            } else {
                this.field5010 = null;
            }
        }
        if (arg0 < 19) {
            this.method2054(null, 85);
        }
        if (this.field5076 != null && !class220.method1376(this.field5038, 125, this.field4993)) {
            if (this.field5034 != null && this.field5034.field571 == null) {
                this.field5081 = true;
            } else {
                this.field5076 = null;
            }
        }
        if (this.field5055 != null && !class70.method589(-15, this.field5038, this.field4993)) {
            if (this.field5078 != null && this.field5078.field571 == null) {
                this.field5081 = true;
            } else {
                this.field5055 = this.field4995 = null;
            }
        }
        if (this.field5065 != null && !class209.method1295(this.field4993, this.field5038, 64)) {
            if (this.field5034 != null && this.field5034.field571 == null) {
                this.field5081 = true;
            } else {
                this.field5065 = null;
            }
        }
        if (this.field5030 != null && !class166.method1102(this.field5038, this.field4993, (byte) 109)) {
            if ((this.field5000 == null || this.field5000.field6845 != null) && (this.field5034 == null || this.field5034.field571 != null)) {
                this.field5030 = this.field4984 = this.field5046 = null;
            } else {
                this.field5081 = true;
            }
        }
        if (this.field5044 != null && !class457.method2682(29521, this.field4993, this.field5038)) {
            this.field5044 = null;
            this.field4979 = null;
        }
        if (this.field5050 != null && !class523.method3110(32, this.field5038, this.field4993)) {
            this.field5050 = null;
            this.field5077 = null;
        }
        if (this.field4983 != null && !class444.method2639(this.field5038, this.field4993, (byte) 11)) {
            this.field4983 = null;
        }
        if (this.field5057 != null && (this.field4993 & 0x800) == 0 && (this.field4993 & 0x40000) == 0) {
            this.field5057 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "()[Lqc;", line = 5694)
    public final class521[] method406() {
        field5026++;
        return this.field5074;
    }

    @OriginalMember(owner = "client!ko", name = "Z", descriptor = "(I)V", line = 5702)
    public final void method396(int arg0) {
        field5028++;
        int var2 = class183.field2684[arg0];
        int var3 = class183.field2678[arg0];
        for (int var4 = 0; var4 < this.field5007; var4++) {
            int var5 = this.field5056[var4] * var3 - (this.field4985[var4] * var2) >> 15;
            this.field4985[var4] = this.field5056[var4] * var2 + this.field4985[var4] * var3 >> 15;
            this.field5056[var4] = var5;
        }
        if (this.field4978 != null) {
            this.field4978.field571 = null;
        }
        this.field5014 = false;
    }

    @OriginalMember(owner = "client!ko", name = "HA", descriptor = "()I", line = 5732)
    public final int method368() {
        if (!this.field5014) {
            this.method2061(-121);
        }
        field4988++;
        return this.field4977;
    }

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "(IIII)V", line = 5745)
    public final void method387(int arg0, int arg1, int arg2, int arg3) {
        field5031++;
        if (arg0 == 0) {
            class196.field2790 = 0;
            int var5 = 0;
            class222.field3171 = 0;
            class126.field1883 = 0;
            for (int var6 = 0; var6 < this.field5007; var6++) {
                class222.field3171 += this.field5053[var6];
                class196.field2790 += this.field5056[var6];
                class126.field1883 += this.field4985[var6];
                var5++;
            }
            if (var5 <= 0) {
                class222.field3171 = arg1;
                class126.field1883 = arg3;
                class196.field2790 = arg2;
            } else {
                class196.field2790 = class196.field2790 / var5 + arg2;
                class126.field1883 = class126.field1883 / var5 + arg3;
                class222.field3171 = class222.field3171 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field5007; var7++) {
                this.field5053[var7] += arg1;
                this.field5056[var7] += arg2;
                this.field4985[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field5007; var8++) {
                this.field5053[var8] -= class222.field3171;
                this.field5056[var8] -= class196.field2790;
                this.field4985[var8] -= class126.field1883;
                if (arg3 != 0) {
                    int var9 = class183.field2684[arg3];
                    int var10 = class183.field2678[arg3];
                    int var11 = this.field5053[var8] * var10 + (this.field5056[var8] * var9 + 32767) >> 15;
                    this.field5056[var8] = this.field5056[var8] * var10 - (this.field5053[var8] * var9 - 32767) >> 15;
                    this.field5053[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class183.field2684[arg1];
                    int var13 = class183.field2678[arg1];
                    int var14 = this.field5056[var8] * var13 + 32767 - (this.field4985[var8] * var12) >> 15;
                    this.field4985[var8] = this.field5056[var8] * var12 + this.field4985[var8] * var13 + 32767 >> 15;
                    this.field5056[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class183.field2684[arg2];
                    int var16 = class183.field2678[arg2];
                    int var17 = this.field4985[var8] * var15 + this.field5053[var8] * var16 + 32767 >> 15;
                    this.field4985[var8] = this.field4985[var8] * var16 + 32767 - (this.field5053[var8] * var15) >> 15;
                    this.field5053[var8] = var17;
                }
                this.field5053[var8] += class222.field3171;
                this.field5056[var8] += class196.field2790;
                this.field4985[var8] += class126.field1883;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field5007; var18++) {
                this.field5053[var18] -= class222.field3171;
                this.field5056[var18] -= class196.field2790;
                this.field4985[var18] -= class126.field1883;
                this.field5053[var18] = this.field5053[var18] * arg1 / 128;
                this.field5056[var18] = this.field5056[var18] * arg2 / 128;
                this.field4985[var18] = this.field4985[var18] * arg3 / 128;
                this.field5053[var18] += class222.field3171;
                this.field5056[var18] += class196.field2790;
                this.field4985[var18] += class126.field1883;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field4981; var19++) {
                int var23 = (this.field5076[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field5076[var19] = (byte) var23;
            }
            if (this.field5034 != null) {
                this.field5034.field571 = null;
            }
            if (this.field5001 != null) {
                for (int var20 = 0; var20 < this.field5075; var20++) {
                    class214 var21 = this.field5001[var20];
                    class336 var22 = this.field5042[var20];
                    var22.field4523 = 255 - (this.field5076[var21.field2993] & 0xFF) << 24 | var22.field4523 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field4981; var24++) {
                int var28 = this.field5010[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3E8) >> 7;
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
                this.field5010[var24] = (short) class255.method1532(var34, class255.method1532(var31 << 7, var32 << 10));
            }
            if (this.field5034 != null) {
                this.field5034.field571 = null;
            }
            if (this.field5001 != null) {
                for (int var25 = 0; var25 < this.field5075; var25++) {
                    class214 var26 = this.field5001[var25];
                    class336 var27 = this.field5042[var25];
                    var27.field4523 = var27.field4523 & 0xFF000000 | class166.field2487[this.field5010[var26.field2993] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field5075; var35++) {
                class336 var36 = this.field5042[var35];
                var36.field4528 += arg2;
                var36.field4527 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field5075; var37++) {
                class336 var38 = this.field5042[var37];
                var38.field4535 = var38.field4535 * arg2 >> 7;
                var38.field4526 = var38.field4526 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field5075; var39++) {
                class336 var40 = this.field5042[var39];
                var40.field4531 = var40.field4531 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V", line = 6057)
    public final void method376(int arg0) {
        field4980++;
        int var2 = class183.field2684[arg0];
        int var3 = class183.field2678[arg0];
        for (int var4 = 0; var4 < this.field5007; var4++) {
            int var7 = this.field4985[var4] * var2 + (this.field5053[var4] * var3) >> 15;
            this.field4985[var4] = this.field4985[var4] * var3 - (this.field5053[var4] * var2) >> 15;
            this.field5053[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field5012; var5++) {
            int var6 = this.field5066[var5] * var2 + (this.field5004[var5] * var3) >> 15;
            this.field5066[var5] = (short) (this.field5066[var5] * var3 - (this.field5004[var5] * var2) >> 15);
            this.field5004[var5] = (short) var6;
        }
        if (this.field4991 == null && this.field5034 != null) {
            this.field5034.field571 = null;
        }
        if (this.field4991 != null) {
            this.field4991.field571 = null;
        }
        if (this.field4978 != null) {
            this.field4978.field571 = null;
        }
        this.field5014 = false;
    }
}
