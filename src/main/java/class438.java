import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class438 extends class507 {

    @OriginalMember(owner = "client!du", name = "j", descriptor = "Z")
    private boolean field6000 = true;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "I")
    private int field6009 = 0;

    @OriginalMember(owner = "client!du", name = "L", descriptor = "I")
    private int field6028 = 0;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "Z")
    private boolean field6010 = false;

    @OriginalMember(owner = "client!du", name = "cb", descriptor = "I")
    private int field6045 = 0;

    @OriginalMember(owner = "client!du", name = "J", descriptor = "I")
    private int field6026 = 0;

    @OriginalMember(owner = "client!du", name = "Nb", descriptor = "I")
    private int field6082 = 0;

    @OriginalMember(owner = "client!du", name = "P", descriptor = "Lgk;")
    private class463 field6032;

    @OriginalMember(owner = "client!du", name = "S", descriptor = "Ltp;")
    private class139 field6035;

    @OriginalMember(owner = "client!du", name = "W", descriptor = "Ltp;")
    private class139 field6039;

    @OriginalMember(owner = "client!du", name = "Bb", descriptor = "Ltp;")
    private class139 field6070;

    @OriginalMember(owner = "client!du", name = "E", descriptor = "Ltp;")
    private class139 field6021;

    @OriginalMember(owner = "client!du", name = "T", descriptor = "Lwu;")
    private class411 field6036;

    @OriginalMember(owner = "client!du", name = "hc", descriptor = "I")
    private int field6102;

    @OriginalMember(owner = "client!du", name = "fc", descriptor = "I")
    private int field6100;

    @OriginalMember(owner = "client!du", name = "Qb", descriptor = "[I")
    private int[] field6085;

    @OriginalMember(owner = "client!du", name = "y", descriptor = "[S")
    private short[] field6015;

    @OriginalMember(owner = "client!du", name = "vb", descriptor = "[I")
    private int[] field6064;

    @OriginalMember(owner = "client!du", name = "Xb", descriptor = "[I")
    private int[] field6092;

    @OriginalMember(owner = "client!du", name = "Lb", descriptor = "[I")
    private int[] field6080;

    @OriginalMember(owner = "client!du", name = "mb", descriptor = "[Lot;")
    private class165[] field6055;

    @OriginalMember(owner = "client!du", name = "Tb", descriptor = "[Lsm;")
    private class473[] field6088;

    @OriginalMember(owner = "client!du", name = "Zb", descriptor = "I")
    private int field6094;

    @OriginalMember(owner = "client!du", name = "yb", descriptor = "[Lub;")
    private class299[] field6067;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "[Lig;")
    private class231[] field6004;

    @OriginalMember(owner = "client!du", name = "Kb", descriptor = "[F")
    private float[] field6079;

    @OriginalMember(owner = "client!du", name = "V", descriptor = "[S")
    private short[] field6038;

    @OriginalMember(owner = "client!du", name = "D", descriptor = "[S")
    private short[] field6020;

    @OriginalMember(owner = "client!du", name = "Db", descriptor = "S")
    private short field6072;

    @OriginalMember(owner = "client!du", name = "B", descriptor = "[S")
    private short[] field6018;

    @OriginalMember(owner = "client!du", name = "rb", descriptor = "S")
    private short field6060;

    @OriginalMember(owner = "client!du", name = "M", descriptor = "[S")
    private short[] field6029;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "[S")
    private short[] field5999;

    @OriginalMember(owner = "client!du", name = "Z", descriptor = "[F")
    private float[] field6042;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "[S")
    private short[] field6011;

    @OriginalMember(owner = "client!du", name = "lb", descriptor = "[S")
    private short[] field6054;

    @OriginalMember(owner = "client!du", name = "dc", descriptor = "[S")
    private short[] field6098;

    @OriginalMember(owner = "client!du", name = "hb", descriptor = "[B")
    private byte[] field6050;

    @OriginalMember(owner = "client!du", name = "Eb", descriptor = "[S")
    private short[] field6073;

    @OriginalMember(owner = "client!du", name = "Yb", descriptor = "[B")
    private byte[] field6093;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "[S")
    private short[] field6003;

    @OriginalMember(owner = "client!du", name = "Wb", descriptor = "[I")
    private int[] field6091;

    @OriginalMember(owner = "client!du", name = "kc", descriptor = "[[I")
    private int[][] field6105;

    @OriginalMember(owner = "client!du", name = "Ob", descriptor = "[[I")
    private int[][] field6083;

    @OriginalMember(owner = "client!du", name = "ic", descriptor = "[[I")
    private int[][] field6103;

    @OriginalMember(owner = "client!du", name = "pb", descriptor = "[Ljava/lang/String;")
    public static String[] field6058 = new String[100];

    @OriginalMember(owner = "client!du", name = "v", descriptor = "Lpi;")
    public static class340 field6012 = new class340(75, 5);

    @OriginalMember(owner = "client!du", name = "jc", descriptor = "[I")
    public static int[] field6104 = new int[16];

    @OriginalMember(owner = "client!du", name = "lc", descriptor = "[I")
    public static int[] field6106 = new int[2];

    @OriginalMember(owner = "client!du", name = "p", descriptor = "B")
    private byte field6006;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!du", name = "w", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!du", name = "x", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!du", name = "z", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!du", name = "A", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!du", name = "C", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!du", name = "F", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!du", name = "G", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!du", name = "H", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!du", name = "N", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!du", name = "Q", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!du", name = "R", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!du", name = "U", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!du", name = "Y", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!du", name = "bb", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!du", name = "db", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!du", name = "eb", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!du", name = "fb", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!du", name = "gb", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!du", name = "ib", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!du", name = "jb", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!du", name = "kb", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!du", name = "nb", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!du", name = "ob", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!du", name = "sb", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!du", name = "tb", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!du", name = "ub", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!du", name = "wb", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!du", name = "xb", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!du", name = "zb", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!du", name = "Ab", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!du", name = "Cb", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!du", name = "Fb", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!du", name = "Gb", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!du", name = "Hb", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!du", name = "Ib", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!du", name = "Jb", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!du", name = "Mb", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!du", name = "Pb", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!du", name = "Rb", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!du", name = "Ub", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!du", name = "Vb", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!du", name = "ac", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!du", name = "bc", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!du", name = "ec", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!du", name = "gc", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!du", name = "mc", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!du", name = "nc", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!du", name = "pc", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!du", name = "K", descriptor = "Lkg;")
    private class39 field6027;

    @OriginalMember(owner = "client!du", name = "Sb", descriptor = "Lcm;")
    private class433 field6087;

    @OriginalMember(owner = "client!du", name = "cc", descriptor = "Lhh;")
    private class500 field6097;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "S")
    private short field6008;

    @OriginalMember(owner = "client!du", name = "I", descriptor = "S")
    private short field6025;

    @OriginalMember(owner = "client!du", name = "O", descriptor = "S")
    private short field6031;

    @OriginalMember(owner = "client!du", name = "X", descriptor = "S")
    private short field6040;

    @OriginalMember(owner = "client!du", name = "ab", descriptor = "S")
    private short field6043;

    @OriginalMember(owner = "client!du", name = "qb", descriptor = "S")
    private short field6059;

    @OriginalMember(owner = "client!du", name = "oc", descriptor = "S")
    private short field6109;

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lgk;)V", line = 5612)
    public class438(class463 arg0) {
        this.field6032 = arg0;
        this.field6035 = new class139(this.field6032, null, 5126, 3, 0);
        this.field6039 = new class139(this.field6032, null, 5126, 2, 0);
        this.field6070 = new class139(this.field6032, null, 5126, 3, 0);
        this.field6021 = new class139(this.field6032, null, 5121, 4, 0);
        this.field6036 = new class411();
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lgk;Luu;IIII)V", line = 5625)
    public class438(class463 arg0, class420 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6102 = arg5;
        this.field6032 = arg0;
        this.field6100 = arg2;
        if (class142.method987(arg2, false, arg5)) {
            this.field6035 = new class139(this.field6032, null, 5126, 3, 0);
        }
        if (class449.method2664(arg2, -1, arg5)) {
            this.field6039 = new class139(this.field6032, null, 5126, 2, 0);
        }
        if (class349.method2053(arg5, arg2, 256)) {
            this.field6070 = new class139(this.field6032, null, 5126, 3, 0);
        }
        if (class428.method2535((byte) 121, arg2, arg5)) {
            this.field6021 = new class139(this.field6032, null, 5121, 4, 0);
        }
        if (class96.method658(-124, arg2, arg5)) {
            this.field6036 = new class411();
        }
        class79 var7 = arg0.field1765;
        int[] var8 = new int[arg1.field5609];
        this.field6085 = new int[arg1.field5615 + 1];
        for (int var9 = 0; var9 < arg1.field5609; var9++) {
            if ((arg1.field5611 == null || arg1.field5611[var9] != 2) && (arg1.field5582 == null || arg1.field5582[var9] == -1 || !var7.method460(-26282, arg1.field5582[var9] & 0xFFFF).field7348)) {
                var8[this.field6045++] = var9;
                this.field6085[arg1.field5590[var9]]++;
                this.field6085[arg1.field5619[var9]]++;
                this.field6085[arg1.field5625[var9]]++;
            }
        }
        this.field6009 = this.field6045;
        long[] var10 = new long[this.field6045];
        boolean var11 = (this.field6100 & 0x100) != 0;
        label494: for (int var12 = 0; var12 < this.field6045; var12++) {
            int var180 = var8[var12];
            class499 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field5613 != null) {
                for (int var186 = 0; var186 < arg1.field5613.length; var186++) {
                    class326 var187 = arg1.field5613[var186];
                    if (var187.field4179 == var180) {
                        class432 var188 = class195.method1261(var187.field4187, 27);
                        if (var188.field5954) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field6009--;
                            continue label494;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field5582 != null) {
                var189 = arg1.field5582[var180];
                if (var189 != -1) {
                    var181 = var7.method460(-26282, var189 & 0xFFFF);
                    var184 = var181.field7352;
                    var185 = var181.field7333;
                }
            }
            boolean var190 = arg1.field5612 != null && arg1.field5612[var180] != 0 || var181 != null && !var181.field7349;
            if ((var11 || var190) && arg1.field5594 != null) {
                var182 += arg1.field5594[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var189 & 0xFFFF << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + ((long) var194);
        }
        class148.method1024(var10, false, var8);
        this.field6015 = arg1.field5602;
        this.field6064 = arg1.field5592;
        this.field6028 = arg1.field5615;
        this.field6092 = arg1.field5591;
        this.field6080 = arg1.field5634;
        this.field6082 = arg1.field5631;
        this.field6055 = arg1.field5589;
        class140[] var13 = new class140[this.field6028];
        this.field6088 = arg1.field5616;
        if (arg1.field5613 != null) {
            this.field6094 = arg1.field5613.length;
            this.field6067 = new class299[this.field6094];
            this.field6004 = new class231[this.field6094];
            for (int var14 = 0; var14 < this.field6094; var14++) {
                class326 var15 = arg1.field5613[var14];
                class432 var16 = class195.method1261(var15.field4187, 27);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field6045; var18++) {
                    if (var8[var18] == var15.field4179) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class9.field97[arg1.field5603[var15.field4179] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field5612 == null ? 0 : arg1.field5612[var15.field4179]) << 24;
                this.field6004[var14] = new class231(var17, arg1.field5590[var15.field4179], arg1.field5619[var15.field4179], arg1.field5625[var15.field4179], var16.field5953, var16.field5957, var16.field5956, var16.field5960, var16.field5959, var16.field5954, var16.field5951, var15.field4184);
                this.field6067[var14] = new class299(var20);
            }
        }
        int var21 = this.field6045 * 3;
        this.field6079 = new float[var21];
        this.field6038 = new short[var21];
        this.field6020 = new short[this.field6045];
        this.field6072 = (short) arg4;
        if (arg1.field5601 != null) {
            this.field6018 = new short[this.field6045];
        }
        this.field6060 = (short) arg3;
        this.field6029 = new short[this.field6045];
        this.field5999 = new short[var21];
        class43.field624 = new long[var21];
        this.field6042 = new float[var21];
        this.field6011 = new short[var21];
        this.field6054 = new short[var21];
        this.field6098 = new short[this.field6045];
        this.field6050 = new byte[var21];
        this.field6073 = new short[this.field6045];
        this.field6093 = new byte[this.field6045];
        this.field6003 = new short[this.field6045];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field5615; var23++) {
            int var179 = this.field6085[var23];
            this.field6085[var23] = var22;
            var22 += var179;
            var13[var23] = new class140();
        }
        this.field6085[arg1.field5615] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field5608 != null) {
            int var28 = arg1.field5624;
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
            var25 = new int[var28];
            var26 = new int[var28];
            for (int var36 = 0; var36 < this.field6045; var36++) {
                int var43 = var8[var36];
                if (arg1.field5608[var43] != -1) {
                    int var44 = arg1.field5608[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field5590[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field5619[var43];
                        } else {
                            var46 = arg1.field5625[var43];
                        }
                        int var47 = arg1.field5634[var46];
                        int var48 = arg1.field5592[var46];
                        int var49 = arg1.field5591[var46];
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
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var27 = new float[var28][];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field5632[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field5598[var37];
                        var41 = 64.0F / (float) arg1.field5595[var37];
                        if (var42 == 0) {
                            var40 = 1.0F;
                            var39 = 1.0F;
                        } else if (var42 <= 0) {
                            var40 = (float) (-var42) / 1024.0F;
                            var39 = 1.0F;
                        } else {
                            var40 = 1.0F;
                            var39 = (float) var42 / 1024.0F;
                        }
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field5596[var37];
                        var40 = 64.0F / (float) arg1.field5598[var37];
                        var41 = 64.0F / (float) arg1.field5595[var37];
                    } else {
                        var40 = (float) arg1.field5598[var37] / 1024.0F;
                        var41 = (float) arg1.field5595[var37] / 1024.0F;
                        var39 = (float) arg1.field5596[var37] / 1024.0F;
                    }
                    var27[var37] = class466.method2816(arg1.field5599[var37], var40, class60.method339(arg1.field5627[var37], 255), var39, arg1.field5604[var37], 2, arg1.field5581[var37], var41);
                }
            }
        }
        class403[] var50 = new class403[arg1.field5609];
        for (int var51 = 0; var51 < arg1.field5609; var51++) {
            short var158 = arg1.field5590[var51];
            short var159 = arg1.field5619[var51];
            short var160 = arg1.field5625[var51];
            int var161 = this.field6080[var159] - this.field6080[var158];
            int var162 = this.field6064[var159] - this.field6064[var158];
            int var163 = this.field6092[var159] - this.field6092[var158];
            int var164 = this.field6080[var160] - this.field6080[var158];
            int var165 = this.field6064[var160] - this.field6064[var158];
            int var166 = this.field6092[var160] - this.field6092[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var168 >>= 0x1;
                var169 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var168 * var168 + var167 * var167 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var168 * 256 / var170;
            int var172 = var167 * 256 / var170;
            int var173 = var169 * 256 / var170;
            byte var174 = arg1.field5611 == null ? 0 : arg1.field5611[var51];
            if (var174 == 0) {
                class140 var175 = var13[var158];
                var175.field1858++;
                var175.field1863 += var171;
                var175.field1862 += var173;
                var175.field1860 += var172;
                class140 var176 = var13[var159];
                var176.field1863 += var171;
                var176.field1862 += var173;
                var176.field1860 += var172;
                var176.field1858++;
                class140 var177 = var13[var160];
                var177.field1863 += var171;
                var177.field1860 += var172;
                var177.field1862 += var173;
                var177.field1858++;
            } else if (var174 == 1) {
                class403 var178 = var50[var51] = new class403();
                var178.field5426 = var172;
                var178.field5428 = var171;
                var178.field5427 = var173;
            }
        }
        for (int var52 = 0; var52 < this.field6045; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field5603[var68] & 0xFFFF;
            short var70;
            if (arg1.field5582 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field5582[var68];
            }
            int var71;
            if (arg1.field5608 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field5608[var68];
            }
            int var72;
            if (arg1.field5612 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field5612[var68] & 0xFF;
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
                    var76 = 1.0F;
                    var78 = 0.0F;
                    var75 = 1.0F;
                    var80 = 2;
                    var73 = 0.0F;
                    var79 = 1;
                    var77 = 0.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field5632[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field5590[var68];
                        short var84 = arg1.field5619[var68];
                        short var85 = arg1.field5625[var68];
                        short var86 = arg1.field5599[var71];
                        short var87 = arg1.field5581[var71];
                        short var88 = arg1.field5604[var71];
                        float var89 = (float) arg1.field5634[var86];
                        float var90 = (float) arg1.field5592[var86];
                        float var91 = (float) arg1.field5591[var86];
                        float var92 = (float) arg1.field5634[var87] - var89;
                        float var93 = (float) arg1.field5592[var87] - var90;
                        float var94 = (float) arg1.field5591[var87] - var91;
                        float var95 = (float) arg1.field5634[var88] - var89;
                        float var96 = (float) arg1.field5592[var88] - var90;
                        float var97 = (float) arg1.field5591[var88] - var91;
                        float var98 = (float) arg1.field5634[var83] - var89;
                        float var99 = (float) arg1.field5592[var83] - var90;
                        float var100 = (float) arg1.field5591[var83] - var91;
                        float var101 = (float) arg1.field5634[var84] - var89;
                        float var102 = (float) arg1.field5592[var84] - var90;
                        float var103 = (float) arg1.field5591[var84] - var91;
                        float var104 = (float) arg1.field5634[var85] - var89;
                        float var105 = (float) arg1.field5592[var85] - var90;
                        float var106 = (float) arg1.field5591[var85] - var91;
                        float var107 = var93 * var97 - (var94 * var96);
                        float var108 = var94 * var95 - (var92 * var97);
                        float var109 = var92 * var96 - var93 * var95;
                        float var110 = var96 * var109 - var97 * var108;
                        float var111 = var97 * var107 - var95 * var109;
                        float var112 = var95 * var108 - var96 * var107;
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        float var114 = var92 * var108 - (var93 * var107);
                        float var115 = var93 * var109 - (var94 * var108);
                        float var116 = var94 * var107 - var92 * var109;
                        float var117 = 1.0F / (var97 * var114 + var95 * var115 + var96 * var116);
                        var78 = (var106 * var114 + var104 * var115 + var105 * var116) * var117;
                        var76 = (var103 * var114 + var101 * var115 + var102 * var116) * var117;
                        var74 = (var100 * var114 + var98 * var115 + var99 * var116) * var117;
                    } else {
                        short var118 = arg1.field5590[var68];
                        short var119 = arg1.field5619[var68];
                        short var120 = arg1.field5625[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field5606[var71];
                        float var126 = (float) arg1.field5597[var71] / 256.0F;
                        if (var82 == 1) {
                            float var144 = (float) arg1.field5596[var71] / 1024.0F;
                            class422.method2490(var144, var125, var124, arg1.field5591[var118], arg1.field5592[var118], var126, (byte) 120, var122, var123, var121, arg1.field5634[var118]);
                            var73 = class512.field7540;
                            var74 = class334.field4285;
                            class422.method2490(var144, var125, var124, arg1.field5591[var119], arg1.field5592[var119], var126, (byte) 94, var122, var123, var121, arg1.field5634[var119]);
                            var75 = class512.field7540;
                            var76 = class334.field4285;
                            class422.method2490(var144, var125, var124, arg1.field5591[var120], arg1.field5592[var120], var126, (byte) 88, var122, var123, var121, arg1.field5634[var120]);
                            var77 = class512.field7540;
                            var78 = class334.field4285;
                            float var145 = var144 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if ((var145 < var77 - var73)) {
                                    var77 -= var144;
                                    var80 = 1;
                                } else if (var145 < var73 - var77) {
                                    var80 = 2;
                                    var77 += var144;
                                }
                                if ((var145 < var75 - var73)) {
                                    var75 -= var144;
                                    var79 = 1;
                                } else if (var73 - var75 > var145) {
                                    var75 += var144;
                                    var79 = 2;
                                }
                            } else {
                                if ((var78 - var74 > var145)) {
                                    var78 -= var144;
                                    var80 = 1;
                                } else if (var145 < var74 - var78) {
                                    var80 = 2;
                                    var78 += var144;
                                }
                                if (var145 < var76 - var74) {
                                    var79 = 1;
                                    var76 -= var144;
                                } else if (var74 - var76 > var145) {
                                    var79 = 2;
                                    var76 += var144;
                                }
                            }
                        } else if (var82 == 2) {
                            float var127 = (float) arg1.field5600[var71] / 256.0F;
                            float var128 = (float) arg1.field5628[var71] / 256.0F;
                            int var129 = arg1.field5634[var119] - arg1.field5634[var118];
                            int var130 = arg1.field5592[var119] - arg1.field5592[var118];
                            int var131 = arg1.field5591[var119] - arg1.field5591[var118];
                            int var132 = arg1.field5634[var120] - arg1.field5634[var118];
                            int var133 = arg1.field5592[var120] - arg1.field5592[var118];
                            int var134 = arg1.field5591[var120] - arg1.field5591[var118];
                            int var135 = var130 * var134 - (var131 * var133);
                            int var136 = var131 * var132 - var129 * var134;
                            int var137 = var129 * var133 - (var130 * var132);
                            float var138 = 64.0F / (float) arg1.field5598[var71];
                            float var139 = 64.0F / (float) arg1.field5595[var71];
                            float var140 = 64.0F / (float) arg1.field5596[var71];
                            float var141 = (var124[2] * (float) var137 + var124[1] * (float) var136 + var124[0] * (float) var135) / var138;
                            float var142 = (var124[5] * (float) var137 + var124[4] * (float) var136 + var124[3] * (float) var135) / var139;
                            float var143 = (var124[8] * (float) var137 + var124[6] * (float) var135 + var124[7] * (float) var136) / var140;
                            var81 = class249.method1557(2, var141, var143, var142);
                            class269.method1660(18822, arg1.field5592[var118], var127, var123, arg1.field5591[var118], var121, var126, var122, var128, arg1.field5634[var118], var124, var125, var81);
                            var73 = class308.field3965;
                            var74 = class221.field2852;
                            class269.method1660(18822, arg1.field5592[var119], var127, var123, arg1.field5591[var119], var121, var126, var122, var128, arg1.field5634[var119], var124, var125, var81);
                            var76 = class221.field2852;
                            var75 = class308.field3965;
                            class269.method1660(18822, arg1.field5592[var120], var127, var123, arg1.field5591[var120], var121, var126, var122, var128, arg1.field5634[var120], var124, var125, var81);
                            var77 = class308.field3965;
                            var78 = class221.field2852;
                        } else if (var82 == 3) {
                            class58.method331(arg1.field5591[var118], arg1.field5634[var118], (byte) 55, var125, var124, var121, var122, arg1.field5592[var118], var126, var123);
                            var74 = class415.field5531;
                            var73 = class344.field4381;
                            class58.method331(arg1.field5591[var119], arg1.field5634[var119], (byte) -115, var125, var124, var121, var122, arg1.field5592[var119], var126, var123);
                            var75 = class344.field4381;
                            var76 = class415.field5531;
                            class58.method331(arg1.field5591[var120], arg1.field5634[var120], (byte) -128, var125, var124, var121, var122, arg1.field5592[var120], var126, var123);
                            var77 = class344.field4381;
                            var78 = class415.field5531;
                            if ((var125 & 0x1) == 0) {
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
                                if ((var76 - var74 > 0.5F)) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var79 = 2;
                                    var76++;
                                }
                                if (var78 - var74 > 0.5F) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field5611 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field5611[var68];
            }
            if (var146 == 0) {
                long var147 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) (var71 << 2);
                short var149 = arg1.field5590[var68];
                short var150 = arg1.field5619[var68];
                short var151 = arg1.field5625[var68];
                class140 var152 = var13[var149];
                this.field6029[var52] = this.method2585(var152.field1862, var147, var74, var152.field1863, var149, (byte) -102, var152.field1860, var73, var152.field1858, arg1);
                class140 var153 = var13[var150];
                this.field6020[var52] = this.method2585(var153.field1862, (long) var79 + var147, var76, var153.field1863, var150, (byte) -108, var153.field1860, var75, var153.field1858, arg1);
                class140 var154 = var13[var151];
                this.field6098[var52] = this.method2585(var154.field1862, (long) var80 + var147, var78, var154.field1863, var151, (byte) -98, var154.field1860, var77, var154.field1858, arg1);
            } else if (var146 == 1) {
                class403 var155 = var50[var68];
                long var156 = (long) ((var155.field5428 + 256 << 12) + (var71 << 2) + (var155.field5426 > 0 ? 1024 : 2048) + (var155.field5427 - -256 << 22)) + ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32);
                this.field6029[var52] = this.method2585(var155.field5427, var156, var74, var155.field5428, arg1.field5590[var68], (byte) -122, var155.field5426, var73, 0, arg1);
                this.field6020[var52] = this.method2585(var155.field5427, (long) var79 + var156, var76, var155.field5428, arg1.field5619[var68], (byte) -98, var155.field5426, var75, 0, arg1);
                this.field6098[var52] = this.method2585(var155.field5427, (long) var80 + var156, var78, var155.field5428, arg1.field5625[var68], (byte) -109, var155.field5426, var77, 0, arg1);
            }
            if (arg1.field5582 == null) {
                this.field6003[var52] = -1;
            } else {
                this.field6003[var52] = arg1.field5582[var68];
            }
            if (arg1.field5612 != null) {
                this.field6093[var52] = arg1.field5612[var68];
            }
            if (arg1.field5601 != null) {
                this.field6018[var52] = arg1.field5601[var68];
            }
            this.field6073[var52] = arg1.field5603[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field6009; var55++) {
            short var67 = this.field6003[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field6091 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field6009; var58++) {
            short var66 = this.field6003[var58];
            if (var56 != var66) {
                this.field6091[var57++] = var58;
                var56 = var66;
            }
        }
        this.field6091[var57] = this.field6009;
        class43.field624 = null;
        this.field6038 = class502.method2999(this.field6038, false, this.field6026);
        this.field6011 = class502.method2999(this.field6011, false, this.field6026);
        this.field5999 = class502.method2999(this.field5999, false, this.field6026);
        this.field6050 = class261.method1635(this.field6050, -99, this.field6026);
        this.field6079 = class446.method2646(0, this.field6079, this.field6026);
        this.field6042 = class446.method2646(0, this.field6042, this.field6026);
        if (arg1.field5614 != null && class9.method61(arg2, this.field6102, 250)) {
            this.field6105 = arg1.method2465(-1);
        }
        if (arg1.field5613 != null && class185.method1225(this.field6102, arg2, false)) {
            this.field6083 = arg1.method2470((byte) -122);
        }
        if (arg1.field5610 != null && class237.method1507(-35, this.field6102, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field6045; var61++) {
                int var65 = arg1.field5610[var8[var61]];
                if (var65 >= 0) {
                    if (var59 < var65) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field6103 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field6103[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field6045; var63++) {
                int var64 = arg1.field5610[var8[var63]];
                if (var64 >= 0) {
                    this.field6103[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "XA", descriptor = "(III)V", line = 11)
    public final void method482(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field6028; var4++) {
            if (arg0 != 128) {
                this.field6080[var4] = this.field6080[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field6064[var4] = this.field6064[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field6092[var4] = this.field6092[var4] * arg2 >> 7;
            }
        }
        field6077++;
        if (this.field6035 != null) {
            this.field6035.field1851 = null;
        }
        this.field6010 = false;
    }

    @OriginalMember(owner = "client!du", name = "la", descriptor = "()I", line = 47)
    public final int method491() {
        field6014++;
        if (!this.field6010) {
            this.method2590((byte) 90);
        }
        return this.field6043;
    }

    @OriginalMember(owner = "client!du", name = "K", descriptor = "(IIII)V", line = 63)
    public final void method505(int arg0, int arg1, int arg2, int arg3) {
        field6044++;
        if (arg0 == 0) {
            class75.field940 = 0;
            class102.field1400 = 0;
            class316.field4073 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field6028; var6++) {
                class75.field940 += this.field6080[var6];
                class102.field1400 += this.field6064[var6];
                class316.field4073 += this.field6092[var6];
                var5++;
            }
            if (var5 <= 0) {
                class75.field940 = arg1;
                class316.field4073 = arg3;
                class102.field1400 = arg2;
            } else {
                class102.field1400 = class102.field1400 / var5 + arg2;
                class316.field4073 = class316.field4073 / var5 + arg3;
                class75.field940 = class75.field940 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field6028; var7++) {
                this.field6080[var7] += arg1;
                this.field6064[var7] += arg2;
                this.field6092[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field6028; var8++) {
                this.field6080[var8] -= class75.field940;
                this.field6064[var8] -= class102.field1400;
                this.field6092[var8] -= class316.field4073;
                if (arg3 != 0) {
                    int var9 = class21.field385[arg3];
                    int var10 = class21.field397[arg3];
                    int var11 = this.field6064[var8] * var9 - (-(this.field6080[var8] * var10) - 32767) >> 15;
                    this.field6064[var8] = this.field6064[var8] * var10 - (this.field6080[var8] * var9 - 32767) >> 15;
                    this.field6080[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class21.field385[arg1];
                    int var13 = class21.field397[arg1];
                    int var14 = this.field6064[var8] * var13 + 32767 - (this.field6092[var8] * var12) >> 15;
                    this.field6092[var8] = this.field6092[var8] * var13 + this.field6064[var8] * var12 + 32767 >> 15;
                    this.field6064[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class21.field385[arg2];
                    int var16 = class21.field397[arg2];
                    int var17 = this.field6092[var8] * var15 + this.field6080[var8] * var16 + 32767 >> 15;
                    this.field6092[var8] = this.field6092[var8] * var16 + 32767 - (this.field6080[var8] * var15) >> 15;
                    this.field6080[var8] = var17;
                }
                this.field6080[var8] += class75.field940;
                this.field6064[var8] += class102.field1400;
                this.field6092[var8] += class316.field4073;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field6028; var18++) {
                this.field6080[var18] -= class75.field940;
                this.field6064[var18] -= class102.field1400;
                this.field6092[var18] -= class316.field4073;
                this.field6080[var18] = this.field6080[var18] * arg1 / 128;
                this.field6064[var18] = this.field6064[var18] * arg2 / 128;
                this.field6092[var18] = this.field6092[var18] * arg3 / 128;
                this.field6080[var18] += class75.field940;
                this.field6064[var18] += class102.field1400;
                this.field6092[var18] += class316.field4073;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field6045; var19++) {
                int var23 = (this.field6093[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field6093[var19] = (byte) var23;
            }
            if (this.field6021 != null) {
                this.field6021.field1851 = null;
            }
            if (this.field6004 != null) {
                for (int var20 = 0; var20 < this.field6094; var20++) {
                    class231 var21 = this.field6004[var20];
                    class299 var22 = this.field6067[var20];
                    var22.field3874 = var22.field3874 & 0xFFFFFF | 255 - (this.field6093[var21.field2985] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field6045; var24++) {
                int var28 = this.field6073[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3EF) >> 7;
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
                this.field6073[var24] = (short) class31.method213(var34, class31.method213(var33 << 10, var31 << 7));
            }
            if (this.field6021 != null) {
                this.field6021.field1851 = null;
            }
            if (this.field6004 != null) {
                for (int var25 = 0; var25 < this.field6094; var25++) {
                    class231 var26 = this.field6004[var25];
                    class299 var27 = this.field6067[var25];
                    var27.field3874 = class9.field97[this.field6073[var26.field2985] & 0xFFFF] & 0xFFFFFF | var27.field3874 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field6094; var35++) {
                class299 var36 = this.field6067[var35];
                var36.field3884 += arg2;
                var36.field3878 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field6094; var37++) {
                class299 var38 = this.field6067[var37];
                var38.field3889 = var38.field3889 * arg2 >> 7;
                var38.field3872 = var38.field3872 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field6094; var39++) {
                class299 var40 = this.field6067[var39];
                var40.field3879 = var40.field3879 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lia;Laq;I)V", line = 375)
    public final void method520(class142 arg0, class530 arg1, int arg2) {
        field6076++;
        if (this.field6026 == 0) {
            return;
        }
        class452 var4 = this.field6032.field6807;
        class452 var5 = (class452) arg0;
        if (!this.field6010) {
            this.method2590((byte) 90);
        }
        this.method2589(var5, -16981);
        class336.field4298 = var4.field6294 * var5.field6288 + var4.field6301 * var5.field6306 + var4.field6288 * var5.field6316;
        class238.field3091 = var4.field6294 * var5.field6286 + var4.field6301 * var5.field6309 + var4.field6288 * var5.field6317 + var4.field6286;
        float var6 = (float) this.field6059 * class336.field4298 + class238.field3091;
        float var7 = (float) this.field6040 * class336.field4298 + class238.field3091;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var9 = (float) this.field6031 + var6;
            var8 = (float) (-this.field6031) + var7;
        } else {
            var8 = (float) (-this.field6031) + var6;
            var9 = (float) this.field6031 + var7;
        }
        if ((this.field6032.field6776 <= var8) || (var9 <= (float) this.field6032.field6830)) {
            return;
        }
        class417.field5555 = var4.field6290 * var5.field6288 + var4.field6306 * var5.field6316 + var4.field6289 * var5.field6306;
        class63.field809 = var4.field6290 * var5.field6286 + var4.field6306 * var5.field6317 + var4.field6289 * var5.field6309 + var4.field6309;
        float var10 = (float) this.field6059 * class417.field5555 + class63.field809;
        float var11 = (float) this.field6040 * class417.field5555 + class63.field809;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = ((float) this.field6031 + var10) * (float) this.field6032.field6740;
            var13 = (var11 - (float) this.field6031) * (float) this.field6032.field6740;
        } else {
            var12 = ((float) this.field6031 + var11) * (float) this.field6032.field6740;
            var13 = ((float) (-this.field6031) + var10) * (float) this.field6032.field6740;
        }
        if ((this.field6032.field6731 <= var13 / var9) || (this.field6032.field6732 >= var12 / var9)) {
            return;
        }
        class199.field2560 = var4.field6313 * var5.field6286 + var4.field6318 * var5.field6309 + var4.field6316 * var5.field6317 + var4.field6317;
        class402.field5423 = var4.field6313 * var5.field6288 + var4.field6318 * var5.field6306 + var4.field6316 * var5.field6316;
        float var14 = (float) this.field6059 * class402.field5423 + class199.field2560;
        float var15 = (float) this.field6040 * class402.field5423 + class199.field2560;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) (-this.field6031) + var15) * (float) this.field6032.field6765;
            var17 = ((float) this.field6031 + var14) * (float) this.field6032.field6765;
        } else {
            var16 = ((float) (-this.field6031) + var14) * (float) this.field6032.field6765;
            var17 = ((float) this.field6031 + var15) * (float) this.field6032.field6765;
        }
        if ((var16 / var9 >= this.field6032.field6744) || (this.field6032.field6784 >= var17 / var9)) {
            return;
        }
        if (arg1 != null || this.field6004 != null) {
            class489.field7137 = var4.field6294 * var5.field6294 + var4.field6301 * var5.field6290 + var4.field6288 * var5.field6313;
            class364.field4695 = var4.field6290 * var5.field6301 + var4.field6306 * var5.field6318 + var4.field6289 * var5.field6289;
            class61.field799 = var4.field6313 * var5.field6301 + var4.field6318 * var5.field6289 + var4.field6316 * var5.field6318;
            class318.field4098 = var4.field6290 * var5.field6294 + var4.field6306 * var5.field6313 + var4.field6289 * var5.field6290;
            class201.field2626 = var4.field6313 * var5.field6294 + var4.field6318 * var5.field6290 + var4.field6316 * var5.field6313;
            class205.field2673 = var4.field6294 * var5.field6301 + var4.field6301 * var5.field6289 + var4.field6288 * var5.field6318;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field6043 + this.field6025 >> 1;
            int var21 = this.field6008 + this.field6109 >> 1;
            int var22 = (int) ((float) var21 * class318.field4098 + (float) this.field6059 * class417.field5555 + (float) var20 * class364.field4695 + class63.field809);
            int var23 = (int) ((float) var21 * class201.field2626 + (float) this.field6059 * class402.field5423 + (float) var20 * class61.field799 + class199.field2560);
            int var24 = (int) ((float) var21 * class489.field7137 + (float) this.field6059 * class336.field4298 + (float) var20 * class205.field2673 + class238.field3091);
            if (this.field6032.field6830 > var24) {
                var18 = true;
            } else {
                arg1.field7810 = this.field6032.field6768 + (this.field6032.field6765 * var23 / var24);
                arg1.field7811 = this.field6032.field6740 * var22 / var24 + this.field6032.field6756;
            }
            int var25 = (int) ((float) var21 * class318.field4098 + (float) this.field6040 * class417.field5555 + (float) var20 * class364.field4695 + class63.field809);
            int var26 = (int) ((float) var21 * class201.field2626 + (float) this.field6040 * class402.field5423 + (float) var20 * class61.field799 + class199.field2560);
            int var27 = (int) ((float) var21 * class489.field7137 + (float) this.field6040 * class336.field4298 + (float) var20 * class205.field2673 + class238.field3091);
            if (var27 >= this.field6032.field6830) {
                arg1.field7809 = this.field6032.field6756 + (this.field6032.field6740 * var25 / var27);
                arg1.field7814 = this.field6032.field6765 * var26 / var27 + this.field6032.field6768;
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field6032.field6830 && var27 < this.field6032.field6830) {
                    var19 = false;
                } else if (this.field6032.field6830 > var24) {
                    int var28 = (var27 - this.field6032.field6830 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field7811 = this.field6032.field6756 + (this.field6032.field6740 * var29 / this.field6032.field6830);
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field7810 = this.field6032.field6765 * var30 / this.field6032.field6830 + this.field6032.field6768;
                } else if (this.field6032.field6830 > var27) {
                    int var31 = (var24 - this.field6032.field6830 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field7811 = this.field6032.field6740 * var32 / this.field6032.field6830 + this.field6032.field6756;
                    arg1.field7810 = this.field6032.field6765 * var33 / this.field6032.field6830 + this.field6032.field6768;
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field7812 = (this.field6031 + var22) * this.field6032.field6740 / var24 + this.field6032.field6756 - arg1.field7811;
                } else {
                    arg1.field7812 = this.field6032.field6756 + ((this.field6031 + var25) * this.field6032.field6740 / var27) - arg1.field7809;
                }
                arg1.field7813 = true;
            }
        }
        this.field6032.method2793((byte) 37);
        this.field6032.method2796((byte) -102, var5);
        this.method2593((byte) 115);
        this.field6032.method2795(-4995);
        this.method2594(5);
    }

    @OriginalMember(owner = "client!du", name = "N", descriptor = "(SS)V", line = 578)
    public final void method478(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field6045; var3++) {
            if (this.field6073[var3] == arg0) {
                this.field6073[var3] = arg1;
            }
        }
        field6110++;
        if (this.field6004 != null) {
            for (int var4 = 0; var4 < this.field6094; var4++) {
                class231 var5 = this.field6004[var4];
                class299 var6 = this.field6067[var4];
                var6.field3874 = var6.field3874 & 0xFF000000 | class9.field97[this.field6073[var5.field2985] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field6021 != null) {
            this.field6021.field1851 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "WA", descriptor = "(I)V", line = 621)
    public final void method535(int arg0) {
        field6017++;
        int var2 = class21.field385[arg0];
        int var3 = class21.field397[arg0];
        for (int var4 = 0; var4 < this.field6028; var4++) {
            int var5 = this.field6064[var4] * var3 - (this.field6092[var4] * var2) >> 15;
            this.field6092[var4] = this.field6092[var4] * var3 + this.field6064[var4] * var2 >> 15;
            this.field6064[var4] = var5;
        }
        this.field6010 = false;
        if (this.field6035 != null) {
            this.field6035.field1851 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "ra", descriptor = "()I", line = 655)
    public final int method519() {
        if (!this.field6010) {
            this.method2590((byte) 90);
        }
        field6056++;
        return this.field6031;
    }

    @OriginalMember(owner = "client!du", name = "FA", descriptor = "()Z", line = 666)
    public final boolean method518() {
        field6101++;
        if (this.field6105 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field6082; var1++) {
            this.field6080[var1] <<= 0x4;
            this.field6064[var1] <<= 0x4;
            this.field6092[var1] <<= 0x4;
        }
        class75.field940 = 0;
        class316.field4073 = 0;
        class102.field1400 = 0;
        return true;
    }

    @OriginalMember(owner = "client!du", name = "sa", descriptor = "()V", line = 693)
    public final void method536() {
        for (int var1 = 0; var1 < this.field6028; var1++) {
            this.field6092[var1] = -this.field6092[var1];
        }
        field6096++;
        for (int var2 = 0; var2 < this.field6026; var2++) {
            this.field5999[var2] = (short) (-this.field5999[var2]);
        }
        for (int var3 = 0; var3 < this.field6045; var3++) {
            short var4 = this.field6029[var3];
            this.field6029[var3] = this.field6098[var3];
            this.field6098[var3] = var4;
        }
        if (this.field6070 == null && this.field6021 != null) {
            this.field6021.field1851 = null;
        }
        if (this.field6070 != null) {
            this.field6070.field1851 = null;
        }
        this.field6010 = false;
        if (this.field6035 != null) {
            this.field6035.field1851 = null;
        }
        if (this.field6036 != null) {
            this.field6036.field5484 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "n", descriptor = "()I", line = 745)
    public final int method475() {
        field6069++;
        return this.field6100;
    }

    @OriginalMember(owner = "client!du", name = "ZA", descriptor = "(I)V", line = 758)
    public final void method486(int arg0) {
        field6052++;
        this.field6060 = (short) arg0;
        if (this.field6021 != null) {
            this.field6021.field1851 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lia;Laq;II)V", line = 776)
    public final void method512(class142 arg0, class530 arg1, int arg2, int arg3) {
        field6051++;
        if (this.field6026 == 0) {
            return;
        }
        class452 var5 = this.field6032.field6807;
        class452 var6 = (class452) arg0;
        if (!this.field6010) {
            this.method2590((byte) 90);
        }
        class238.field3091 = var5.field6294 * var6.field6286 + var5.field6301 * var6.field6309 + var5.field6288 * var6.field6317 + var5.field6286;
        class336.field4298 = var5.field6294 * var6.field6288 + var5.field6301 * var6.field6306 + var5.field6288 * var6.field6316;
        float var7 = (float) this.field6059 * class336.field4298 + class238.field3091;
        float var8 = (float) this.field6040 * class336.field4298 + class238.field3091;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var9 = (float) this.field6031 + var7;
            var10 = (float) (-this.field6031) + var8;
        } else {
            var9 = (float) this.field6031 + var8;
            var10 = (float) (-this.field6031) + var7;
        }
        if ((var10 >= this.field6032.field6741) || (var9 <= (float) this.field6032.field6830)) {
            return;
        }
        class417.field5555 = var5.field6290 * var6.field6288 + var5.field6306 * var6.field6316 + var5.field6289 * var6.field6306;
        class63.field809 = var5.field6290 * var6.field6286 + var5.field6306 * var6.field6317 + var5.field6289 * var6.field6309 + var5.field6309;
        float var11 = (float) this.field6059 * class417.field5555 + class63.field809;
        float var12 = (float) this.field6040 * class417.field5555 + class63.field809;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = (var12 - (float) this.field6031) * (float) this.field6032.field6740;
            var14 = ((float) this.field6031 + var11) * (float) this.field6032.field6740;
        } else {
            var13 = (var11 - (float) this.field6031) * (float) this.field6032.field6740;
            var14 = ((float) this.field6031 + var12) * (float) this.field6032.field6740;
        }
        if ((var13 / (float) arg2 >= this.field6032.field6731) || (var14 / (float) arg2 <= this.field6032.field6732)) {
            return;
        }
        class402.field5423 = var5.field6313 * var6.field6288 + var5.field6318 * var6.field6306 + var5.field6316 * var6.field6316;
        class199.field2560 = var5.field6313 * var6.field6286 + var5.field6318 * var6.field6309 + var5.field6316 * var6.field6317 + var5.field6317;
        float var15 = (float) this.field6059 * class402.field5423 + class199.field2560;
        float var16 = (float) this.field6040 * class402.field5423 + class199.field2560;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var17 = ((float) this.field6031 + var15) * (float) this.field6032.field6765;
            var18 = ((float) (-this.field6031) + var16) * (float) this.field6032.field6765;
        } else {
            var17 = ((float) this.field6031 + var16) * (float) this.field6032.field6765;
            var18 = (var15 - (float) this.field6031) * (float) this.field6032.field6765;
        }
        if ((var18 / (float) arg2 >= this.field6032.field6744) || (var17 / (float) arg2 <= this.field6032.field6784)) {
            return;
        }
        if (arg1 != null || this.field6004 != null) {
            class205.field2673 = var5.field6294 * var6.field6301 + var5.field6301 * var6.field6289 + var5.field6288 * var6.field6318;
            class201.field2626 = var5.field6313 * var6.field6294 + var5.field6318 * var6.field6290 + var5.field6316 * var6.field6313;
            class489.field7137 = var5.field6294 * var6.field6294 + var5.field6301 * var6.field6290 + var5.field6288 * var6.field6313;
            class364.field4695 = var5.field6290 * var6.field6301 + var5.field6306 * var6.field6318 + var5.field6289 * var6.field6289;
            class318.field4098 = var5.field6290 * var6.field6294 + var5.field6306 * var6.field6313 + var5.field6289 * var6.field6290;
            class61.field799 = var5.field6313 * var6.field6301 + var5.field6318 * var6.field6289 + var5.field6316 * var6.field6318;
        }
        if (arg1 != null) {
            int var19 = this.field6043 + this.field6025 >> 1;
            int var20 = this.field6109 + this.field6008 >> 1;
            int var21 = (int) ((float) var20 * class318.field4098 + (float) this.field6059 * class417.field5555 + (float) var19 * class364.field4695 + class63.field809);
            int var22 = (int) ((float) var20 * class201.field2626 + (float) this.field6059 * class402.field5423 + (float) var19 * class61.field799 + class199.field2560);
            int var23 = (int) ((float) var20 * class489.field7137 + (float) this.field6059 * class336.field4298 + (float) var19 * class205.field2673 + class238.field3091);
            int var24 = (int) ((float) var20 * class318.field4098 + (float) this.field6040 * class417.field5555 + (float) var19 * class364.field4695 + class63.field809);
            int var25 = (int) ((float) var20 * class201.field2626 + (float) this.field6040 * class402.field5423 + (float) var19 * class61.field799 + class199.field2560);
            arg1.field7809 = this.field6032.field6740 * var24 / arg2 + this.field6032.field6756;
            arg1.field7814 = this.field6032.field6765 * var25 / arg2 + this.field6032.field6768;
            int var26 = (int) ((float) var20 * class489.field7137 + (float) this.field6040 * class336.field4298 + (float) var19 * class205.field2673 + class238.field3091);
            arg1.field7811 = this.field6032.field6740 * var21 / arg2 + this.field6032.field6756;
            arg1.field7810 = this.field6032.field6765 * var22 / arg2 + this.field6032.field6768;
            if (var23 < this.field6032.field6830 && this.field6032.field6830 > var26) {
                arg1.field7813 = true;
                arg1.field7812 = (this.field6031 + var21) * this.field6032.field6740 / arg2 + (this.field6032.field6756 - arg1.field7811);
            }
        }
        this.field6032.method2748(false, (float) arg2);
        this.field6032.method2726(16);
        this.field6032.method2796((byte) -102, var6);
        this.method2593((byte) 124);
        this.field6032.method2795(-4995);
        this.method2594(5);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BSIII)I", line = 922)
    private final int method2581(byte arg0, short arg1, int arg2, int arg3, int arg4) {
        field6023++;
        int var6 = class9.field97[class208.method1350(arg4, arg3, arg2 + 215)];
        if (arg1 != -1) {
            class499 var7 = this.field6032.field1765.method460(-26282, arg1 & 0xFFFF);
            int var8 = var7.field7334 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg4 < 0) {
                    var9 = 0;
                } else if (arg4 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg4 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field7346 & 0xFF;
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
                var6 = (var13 << 8 & 0xFF00A5) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return arg2 == -257 ? (var6 << 8) + 255 - (arg0 & 0xFF) : 83;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IILia;Z)Z", line = 998)
    public final boolean method499(int arg0, int arg1, class142 arg2, boolean arg3) {
        field6046++;
        class452 var5 = (class452) arg2;
        class452 var6 = this.field6032.field6807;
        float var7 = var5.field6286 * var6.field6290 + var5.field6317 * var6.field6306 + var5.field6309 * var6.field6289 + var6.field6309;
        float var8 = var5.field6286 * var6.field6313 + var5.field6317 * var6.field6316 + var5.field6309 * var6.field6318 + var6.field6317;
        float var9 = var5.field6286 * var6.field6294 + var5.field6317 * var6.field6288 + var5.field6309 * var6.field6301 + var6.field6286;
        class489.field7137 = var5.field6294 * var6.field6294 + var5.field6313 * var6.field6288 + var5.field6290 * var6.field6301;
        class205.field2673 = var5.field6301 * var6.field6294 + var5.field6318 * var6.field6288 + var5.field6289 * var6.field6301;
        class336.field4298 = var5.field6288 * var6.field6294 + var5.field6316 * var6.field6288 + var5.field6306 * var6.field6301;
        class364.field4695 = var5.field6301 * var6.field6290 + var5.field6318 * var6.field6306 + var5.field6289 * var6.field6289;
        class318.field4098 = var5.field6294 * var6.field6290 + var5.field6313 * var6.field6306 + var5.field6290 * var6.field6289;
        class201.field2626 = var5.field6294 * var6.field6313 + var5.field6313 * var6.field6316 + var5.field6290 * var6.field6318;
        class417.field5555 = var5.field6288 * var6.field6290 + var5.field6316 * var6.field6306 + var5.field6306 * var6.field6289;
        class402.field5423 = var5.field6288 * var6.field6313 + var5.field6316 * var6.field6316 + var5.field6306 * var6.field6318;
        class61.field799 = var5.field6301 * var6.field6313 + var5.field6318 * var6.field6316 + var5.field6289 * var6.field6318;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field6032.field6740;
        int var16 = this.field6032.field6765;
        if (!this.field6010) {
            this.method2590((byte) 90);
        }
        class521.field7735[0] = this.field6043;
        class111.field1532[0] = this.field6059;
        class236.field3079[0] = this.field6008;
        class521.field7735[1] = this.field6025;
        class111.field1532[1] = this.field6059;
        class236.field3079[1] = this.field6008;
        class521.field7735[2] = this.field6043;
        class111.field1532[2] = this.field6040;
        class236.field3079[2] = this.field6008;
        class521.field7735[3] = this.field6025;
        class111.field1532[3] = this.field6040;
        class236.field3079[3] = this.field6008;
        class521.field7735[4] = this.field6043;
        class111.field1532[4] = this.field6059;
        class521.field7735[5] = this.field6025;
        class236.field3079[4] = this.field6109;
        class111.field1532[5] = this.field6059;
        class236.field3079[5] = this.field6109;
        class521.field7735[6] = this.field6043;
        class111.field1532[6] = this.field6040;
        class236.field3079[6] = this.field6109;
        class521.field7735[7] = this.field6025;
        class111.field1532[7] = this.field6040;
        class236.field3079[7] = this.field6109;
        for (int var17 = 0; var17 < 8; var17++) {
            float var36 = (float) class111.field1532[var17];
            float var37 = (float) class521.field7735[var17];
            float var38 = (float) class236.field3079[var17];
            float var39 = class201.field2626 * var38 + class61.field799 * var37 + class402.field5423 * var36 + var8;
            float var40 = class489.field7137 * var38 + class336.field4298 * var36 + class205.field2673 * var37 + var9;
            float var41 = class318.field4098 * var38 + class417.field5555 * var36 + class364.field4695 * var37 + var7;
            if ((float) this.field6032.field6830 <= var40) {
                float var42 = (float) var15 * var41 / var40 + (float) this.field6032.field6756;
                if (var42 > var12) {
                    var12 = var42;
                }
                if (var11 > var42) {
                    var11 = var42;
                }
                float var43 = (float) var16 * var39 / var40 + (float) this.field6032.field6768;
                if (var13 > var43) {
                    var13 = var43;
                }
                if (var14 < var43) {
                    var14 = var43;
                }
                var10 = true;
            }
        }
        if (var10 && (float) arg0 > var11 && (float) arg0 < var12 && var13 < (float) arg1 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (class237.field3087.length < this.field6026) {
                class237.field3087 = new int[this.field6026];
                class517.field7620 = new int[this.field6026];
            }
            for (int var18 = 0; var18 < this.field6028; var18++) {
                float var20 = (float) this.field6080[var18];
                float var21 = (float) this.field6092[var18];
                float var22 = (float) this.field6064[var18];
                float var23 = class318.field4098 * var21 + class417.field5555 * var22 + class364.field4695 * var20 + var7;
                float var24 = class489.field7137 * var21 + class336.field4298 * var22 + class205.field2673 * var20 + var9;
                float var25 = class201.field2626 * var21 + class61.field799 * var20 + class402.field5423 * var22 + var8;
                if (((float) this.field6032.field6830 <= var24)) {
                    int var30 = (int) ((float) var15 * var23 / var24 + (float) this.field6032.field6756);
                    int var31 = (int) ((float) var16 * var25 / var24 + (float) this.field6032.field6768);
                    int var32 = this.field6085[var18];
                    int var33 = this.field6085[var18 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field6054[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        class237.field3087[var35] = var30;
                        class517.field7620[var35] = var31;
                    }
                } else {
                    int var26 = this.field6085[var18];
                    int var27 = this.field6085[var18 + 1];
                    for (int var28 = var26; var28 < var27; var28++) {
                        int var29 = this.field6054[var28] - 1;
                        if (var29 == -1) {
                            break;
                        }
                        class237.field3087[this.field6054[var28] - 1] = -999999;
                    }
                }
            }
            for (int var19 = 0; var19 < this.field6045; var19++) {
                if (class237.field3087[this.field6029[var19]] != -999999 && class237.field3087[this.field6020[var19]] != -999999 && class237.field3087[this.field6098[var19]] != -999999 && this.method2586(class237.field3087[this.field6029[var19]], arg0, class517.field7620[this.field6098[var19]], 63, class517.field7620[this.field6029[var19]], arg1, class517.field7620[this.field6020[var19]], class237.field3087[this.field6020[var19]], class237.field3087[this.field6098[var19]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!du", name = "C", descriptor = "()I", line = 1204)
    public final int method531() {
        field6034++;
        if (!this.field6010) {
            this.method2590((byte) 90);
        }
        return this.field6109;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IZ)V", line = 1217)
    private final void method2582(int arg0, boolean arg1) {
        field6089++;
        boolean var3 = this.field6021 != null && this.field6021.field1851 == null;
        boolean var4 = this.field6070 != null && this.field6070.field1851 == null;
        boolean var5 = this.field6035 != null && this.field6035.field1851 == null;
        boolean var6 = this.field6039 != null && this.field6039.field1851 == null;
        if (arg1) {
            var3 &= (this.field6006 & 0x2) != 0;
            var5 &= (this.field6006 & 0x1) != 0;
            var6 &= (this.field6006 & 0x8) != 0;
            var4 &= (this.field6006 & 0x4) != 0;
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
        if (class338.field4327.field1223.length >= (this.field6026 * var7)) {
            class338.field4327.field1176 = 0;
        } else {
            class338.field4327 = new class205((this.field6026 + 100) * var7);
        }
        if (var5) {
            if (this.field6032.field6759) {
                for (int var12 = 0; var12 < this.field6028; var12++) {
                    int var13 = NativeStream.floatToRawIntBits((float) this.field6080[var12]);
                    int var14 = NativeStream.floatToRawIntBits((float) this.field6064[var12]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field6092[var12]);
                    int var16 = this.field6085[var12];
                    int var17 = this.field6085[var12 + 1];
                    for (int var18 = var16; var18 < var17; var18++) {
                        int var19 = this.field6054[var18] - 1;
                        if (var19 == -1) {
                            break;
                        }
                        class338.field4327.field1176 = var7 * var19;
                        class338.field4327.method572(-121, var13);
                        class338.field4327.method572(arg0 - 121, var14);
                        class338.field4327.method572(-112, var15);
                    }
                }
            } else {
                for (int var20 = 0; var20 < this.field6028; var20++) {
                    int var21 = NativeStream.floatToRawIntBits((float) this.field6080[var20]);
                    int var22 = NativeStream.floatToRawIntBits((float) this.field6064[var20]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field6092[var20]);
                    int var24 = this.field6085[var20];
                    int var25 = this.field6085[var20 + 1];
                    for (int var26 = var24; var26 < var25; var26++) {
                        int var27 = this.field6054[var26] - 1;
                        if (var27 == -1) {
                            break;
                        }
                        class338.field4327.field1176 = var7 * var27;
                        class338.field4327.method579(var21, (byte) 43);
                        class338.field4327.method579(var22, (byte) 36);
                        class338.field4327.method579(var23, (byte) 114);
                    }
                }
            }
        }
        if (arg0 != -1) {
            return;
        }
        if (var3) {
            if (this.field6070 == null) {
                short[] var30;
                short[] var31;
                byte[] var32;
                short[] var33;
                if (this.field6027 == null) {
                    var30 = this.field5999;
                    var31 = this.field6038;
                    var32 = this.field6050;
                    var33 = this.field6011;
                } else {
                    var30 = this.field6027.field581;
                    var31 = this.field6027.field584;
                    var32 = this.field6027.field582;
                    var33 = this.field6027.field585;
                }
                float var34 = this.field6032.field6750[0];
                float var35 = this.field6032.field6750[1];
                float var36 = this.field6032.field6750[2];
                float var37 = this.field6032.field6791;
                float var38 = this.field6032.field6766 * 768.0F / (float) this.field6072;
                float var39 = this.field6032.field6725 * 768.0F / (float) this.field6072;
                for (int var40 = 0; var40 < this.field6045; var40++) {
                    int var41 = this.method2581(this.field6093[var40], this.field6003[var40], -257, this.field6073[var40], this.field6060);
                    float var42 = (float) (var41 >>> 24) * this.field6032.field6781;
                    float var43 = (float) ((var41 & 0xFF3B) >> 8) * this.field6032.field6754;
                    short var44 = this.field6029[var40];
                    float var45 = (float) ((var41 & 0xFF4129) >> 16) * this.field6032.field6818;
                    short var46 = (short) var32[var44];
                    float var47;
                    if (var46 == 0) {
                        var47 = ((float) var30[var44] * var36 + (float) var31[var44] * var34 + (float) var33[var44] * var35) * 0.0026041667F;
                    } else {
                        var47 = ((float) var30[var44] * var36 + (float) var31[var44] * var34 + (float) var33[var44] * var35) / (float) (var46 * 256);
                    }
                    float var48 = var37 + var47 * ((var47 < 0.0F) ? var39 : var38);
                    int var49 = (int) (var42 * var48);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var50 = (int) (var45 * var48);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var51 = (int) (var43 * var48);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    class338.field4327.field1176 = var7 * var44 + var9;
                    class338.field4327.method565(arg0 ^ 0x66, var49);
                    class338.field4327.method565(34, var50);
                    class338.field4327.method565(arg0 ^ 0xFFFFFFB8, var51);
                    class338.field4327.method565(-89, 255 - (this.field6093[var40] & 0xFF));
                    short var52 = this.field6020[var40];
                    short var53 = (short) var32[var52];
                    float var54;
                    if (var53 == 0) {
                        var54 = ((float) var30[var52] * var36 + (float) var31[var52] * var34 + (float) var33[var52] * var35) * 0.0026041667F;
                    } else {
                        var54 = ((float) var30[var52] * var36 + (float) var31[var52] * var34 + (float) var33[var52] * var35) / (float) (var53 * 256);
                    }
                    float var55 = var37 + ((var54 < 0.0F) ? var39 : var38) * var54;
                    int var56 = (int) (var42 * var55);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var45 * var55);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var43 * var55);
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    class338.field4327.field1176 = var7 * var52 + var9;
                    class338.field4327.method565(-94, var56);
                    class338.field4327.method565(70, var57);
                    class338.field4327.method565(arg0 - 89, var58);
                    class338.field4327.method565(40, 255 - (this.field6093[var40] & 0xFF));
                    short var59 = this.field6098[var40];
                    short var60 = (short) var32[var59];
                    float var61;
                    if (var60 == 0) {
                        var61 = ((float) var30[var59] * var36 + (float) var31[var59] * var34 + (float) var33[var59] * var35) * 0.0026041667F;
                    } else {
                        var61 = ((float) var30[var59] * var36 + (float) var31[var59] * var34 + (float) var33[var59] * var35) / (float) (var60 * 256);
                    }
                    float var62 = var61 * (var61 < 0.0F ? var39 : var38) + var37;
                    int var63 = (int) (var42 * var62);
                    int var64 = (int) (var45 * var62);
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
                    int var65 = (int) (var43 * var62);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    class338.field4327.field1176 = var7 * var59 + var9;
                    class338.field4327.method565(93, var63);
                    class338.field4327.method565(-119, var64);
                    class338.field4327.method565(47, var65);
                    class338.field4327.method565(92, 255 - (this.field6093[var40] & 0xFF));
                }
            } else {
                for (int var28 = 0; var28 < this.field6045; var28++) {
                    int var29 = this.method2581(this.field6093[var28], this.field6003[var28], -257, this.field6073[var28], this.field6060);
                    class338.field4327.field1176 = this.field6029[var28] * var7 + var9;
                    class338.field4327.method572(-103, var29);
                    class338.field4327.field1176 = var9 + (this.field6020[var28] * var7);
                    class338.field4327.method572(-122, var29);
                    class338.field4327.field1176 = this.field6098[var28] * var7 + var9;
                    class338.field4327.method572(-103, var29);
                }
            }
        }
        if (var4) {
            short[] var66;
            byte[] var67;
            short[] var68;
            short[] var69;
            if (this.field6027 == null) {
                var66 = this.field6011;
                var67 = this.field6050;
                var68 = this.field6038;
                var69 = this.field5999;
            } else {
                var68 = this.field6027.field584;
                var66 = this.field6027.field585;
                var69 = this.field6027.field581;
                var67 = this.field6027.field582;
            }
            float var70 = 3.0F / (float) this.field6072;
            class338.field4327.field1176 = var10;
            float var71 = 3.0F / (float) (this.field6072 / 2 + this.field6072);
            if (this.field6032.field6759) {
                for (int var72 = 0; var72 < this.field6026; var72++) {
                    int var73 = var67[var72] & 0xFF;
                    if (var73 == 0) {
                        class338.field4327.method1343((float) var68[var72] * var71, 1829123664);
                        class338.field4327.method1343((float) var66[var72] * var71, 1829123664);
                        class338.field4327.method1343((float) var69[var72] * var71, 1829123664);
                    } else {
                        float var74 = var70 / (float) var73;
                        class338.field4327.method1343((float) var68[var72] * var74, 1829123664);
                        class338.field4327.method1343((float) var66[var72] * var74, 1829123664);
                        class338.field4327.method1343((float) var69[var72] * var74, 1829123664);
                    }
                    class338.field4327.field1176 += var7 - 12;
                }
            } else {
                for (int var75 = 0; var75 < this.field6026; var75++) {
                    int var76 = var67[var75] & 0xFF;
                    if (var76 == 0) {
                        class338.field4327.method1338((float) var68[var75] * var71, (byte) -114);
                        class338.field4327.method1338((float) var66[var75] * var71, (byte) -109);
                        class338.field4327.method1338((float) var69[var75] * var71, (byte) -76);
                    } else {
                        float var77 = var70 / (float) var76;
                        class338.field4327.method1338((float) var68[var75] * var77, (byte) -74);
                        class338.field4327.method1338((float) var66[var75] * var77, (byte) -41);
                        class338.field4327.method1338((float) var69[var75] * var77, (byte) -120);
                    }
                    class338.field4327.field1176 += var7 - 12;
                }
            }
        }
        if (var6) {
            class338.field4327.field1176 = var11;
            if (this.field6032.field6759) {
                for (int var78 = 0; var78 < this.field6026; var78++) {
                    class338.field4327.method1343(this.field6079[var78], 1829123664);
                    class338.field4327.method1343(this.field6042[var78], 1829123664);
                    class338.field4327.field1176 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field6026; var79++) {
                    class338.field4327.method1338(this.field6079[var79], (byte) -57);
                    class338.field4327.method1338(this.field6042[var79], (byte) -14);
                    class338.field4327.field1176 += var7 - 8;
                }
            }
        }
        class338.field4327.field1176 = this.field6026 * var7;
        class500 var80;
        if (arg1) {
            if (this.field6097 == null) {
                this.field6097 = this.field6032.method2750(class338.field4327.field1176, class338.field4327.field1223, true, arg0 + 256, var7);
            } else {
                this.field6097.method343(var7, class338.field4327.field1223, class338.field4327.field1176, arg0 ^ 0xFFFFF359);
            }
            this.field6006 = 0;
            var80 = this.field6097;
        } else {
            var80 = this.field6032.method2750(class338.field4327.field1176, class338.field4327.field1223, false, 255, var7);
            this.field6000 = true;
        }
        if (var5) {
            this.field6035.field1851 = var80;
            this.field6035.field1854 = var8;
        }
        if (var6) {
            this.field6039.field1854 = var11;
            this.field6039.field1851 = var80;
        }
        if (var3) {
            this.field6021.field1851 = var80;
            this.field6021.field1854 = var9;
        }
        if (var4) {
            this.field6070.field1851 = var80;
            this.field6070.field1854 = var10;
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V", line = 1740)
    private final void method2583(int arg0) {
        field6062++;
        if (!this.field6000) {
            return;
        }
        this.field6000 = false;
        if (this.field6088 == null && this.field6055 == null && this.field6004 == null) {
            if (this.field6080 != null && !class367.method2149(this.field6100, this.field6102, arg0 ^ 0x795B93AB)) {
                if (this.field6035 != null && this.field6035.field1851 == null) {
                    this.field6000 = true;
                } else {
                    if (!this.field6010) {
                        this.method2590((byte) 90);
                    }
                    this.field6080 = null;
                }
            }
            if (this.field6064 != null && !class271.method1668(this.field6102, this.field6100, 458752)) {
                if (this.field6035 != null && this.field6035.field1851 == null) {
                    this.field6000 = true;
                } else {
                    if (!this.field6010) {
                        this.method2590((byte) 90);
                    }
                    this.field6064 = null;
                }
            }
            if (this.field6092 != null && !class307.method1833(this.field6100, this.field6102, 124)) {
                if (this.field6035 != null && this.field6035.field1851 == null) {
                    this.field6000 = true;
                } else {
                    if (!this.field6010) {
                        this.method2590((byte) 90);
                    }
                    this.field6092 = null;
                }
            }
        }
        if (this.field6054 != null && this.field6080 == null && this.field6064 == null && this.field6092 == null) {
            this.field6085 = null;
            this.field6054 = null;
        }
        if (this.field6050 != null && !class482.method2887(this.field6102, (byte) 73, this.field6100)) {
            if (this.field6070 == null) {
                if (this.field6021 != null && this.field6021.field1851 == null) {
                    this.field6000 = true;
                } else {
                    this.field6038 = this.field6011 = this.field5999 = null;
                    this.field6050 = null;
                }
            } else if (this.field6070.field1851 == null) {
                this.field6000 = true;
            } else {
                this.field6050 = null;
                this.field6038 = this.field6011 = this.field5999 = null;
            }
        }
        if (this.field6073 != null && !class27.method183(this.field6100, this.field6102, false)) {
            if (this.field6021 != null && this.field6021.field1851 == null) {
                this.field6000 = true;
            } else {
                this.field6073 = null;
            }
        }
        if (arg0 != -2036044753) {
            return;
        }
        if (this.field6093 != null && !class257.method1612(true, this.field6102, this.field6100)) {
            if (this.field6021 != null && this.field6021.field1851 == null) {
                this.field6000 = true;
            } else {
                this.field6093 = null;
            }
        }
        if (this.field6079 != null && !class90.method621(this.field6102, this.field6100, -128)) {
            if (this.field6039 != null && this.field6039.field1851 == null) {
                this.field6000 = true;
            } else {
                this.field6079 = this.field6042 = null;
            }
        }
        if (this.field6003 != null && !class217.method1391(this.field6102, this.field6100, (byte) 120)) {
            if (this.field6021 != null && this.field6021.field1851 == null) {
                this.field6000 = true;
            } else {
                this.field6003 = null;
            }
        }
        if (this.field6029 != null && !class358.method2107(arg0 ^ 0x86A46C2F, this.field6100, this.field6102)) {
            if ((this.field6036 == null || this.field6036.field5484 != null) && (this.field6021 == null || this.field6021.field1851 != null)) {
                this.field6029 = this.field6020 = this.field6098 = null;
            } else {
                this.field6000 = true;
            }
        }
        if (this.field6103 != null && !class237.method1507(-118, this.field6102, this.field6100)) {
            this.field6103 = null;
            this.field6018 = null;
        }
        if (this.field6105 != null && !class9.method61(this.field6100, this.field6102, 250)) {
            this.field6105 = null;
            this.field6015 = null;
        }
        if (this.field6083 != null && !class185.method1225(this.field6102, this.field6100, false)) {
            this.field6083 = null;
        }
        if (this.field6091 != null && (this.field6100 & 0x800) == 0 && (this.field6100 & 0x40000) == 0) {
            this.field6091 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "YA", descriptor = "(SS)V", line = 1918)
    public final void method508(short arg0, short arg1) {
        field6066++;
        class79 var3 = this.field6032.field1765;
        for (int var4 = 0; var4 < this.field6045; var4++) {
            if (this.field6003[var4] == arg0) {
                this.field6003[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class499 var7 = var3.method460(-26282, arg0 & 0xFFFF);
            var5 = var7.field7334;
            var6 = var7.field7346;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class499 var10 = var3.method460(-26282, arg1 & 0xFFFF);
            var8 = var10.field7334;
            var9 = var10.field7346;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field6004 != null) {
            for (int var11 = 0; var11 < this.field6094; var11++) {
                class231 var12 = this.field6004[var11];
                class299 var13 = this.field6067[var11];
                var13.field3874 = class9.field97[this.field6073[var12.field2985] & 0xFFFF] & 0xFFFFFF | var13.field3874 & 0xFF000000;
            }
        }
        if (this.field6021 != null) {
            this.field6021.field1851 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!du", name = "fa", descriptor = "()I", line = 1993)
    public final int method497() {
        field6016++;
        return this.field6060;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "()I", line = 2005)
    public final int method507() {
        field6007++;
        if (!this.field6010) {
            this.method2590((byte) 90);
        }
        return this.field6059;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V", line = 2017)
    public static void method2584(byte arg0) {
        field6058 = null;
        if (arg0 <= -107) {
            field6106 = null;
            field6104 = null;
            field6012 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "ja", descriptor = "(III)V", line = 2030)
    public final void method537(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field6028; var4++) {
            if (arg0 != 0) {
                this.field6080[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field6064[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field6092[var4] += arg2;
            }
        }
        field6030++;
        if (this.field6035 != null) {
            this.field6035.field1851 = null;
        }
        this.field6010 = false;
    }

    @OriginalMember(owner = "client!du", name = "d", descriptor = "()[Lsm;", line = 2066)
    public final class473[] method493() {
        field6090++;
        return this.field6088;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lc;IIIZ)V", line = 2074)
    public final void method483(class507 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field6078++;
        class438 var6 = (class438) arg0;
        if (this.field6045 == 0 || var6.field6045 == 0) {
            return;
        }
        int var7 = var6.field6028;
        int[] var8 = var6.field6080;
        int[] var9 = var6.field6064;
        int[] var10 = var6.field6092;
        short[] var11 = var6.field6038;
        short[] var12 = var6.field6011;
        short[] var13 = var6.field5999;
        byte[] var14 = var6.field6050;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field6027 == null) {
            var17 = null;
            var16 = null;
            var18 = null;
            var15 = null;
        } else {
            var15 = this.field6027.field582;
            var16 = this.field6027.field581;
            var17 = this.field6027.field585;
            var18 = this.field6027.field584;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field6027 == null) {
            var19 = null;
            var22 = null;
            var20 = null;
            var21 = null;
        } else {
            var19 = var6.field6027.field585;
            var20 = var6.field6027.field584;
            var21 = var6.field6027.field582;
            var22 = var6.field6027.field581;
        }
        int[] var23 = var6.field6085;
        short[] var24 = var6.field6054;
        if (!var6.field6010) {
            var6.method2590((byte) 90);
        }
        short var25 = var6.field6059;
        short var26 = var6.field6040;
        short var27 = var6.field6043;
        short var28 = var6.field6025;
        short var29 = var6.field6008;
        short var30 = var6.field6109;
        for (int var31 = 0; var31 < this.field6028; var31++) {
            int var32 = this.field6064[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field6080[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field6092[var31] - arg3;
                    if (var29 <= var34 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field6085[var31];
                        int var37 = this.field6085[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field6054[var38] - 1;
                            if (var35 == -1 || this.field6050[var35] != 0) {
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
                                        if (var18 == null) {
                                            this.field6027 = new class39();
                                            var18 = this.field6027.field584 = class338.method1994(21603, this.field6038);
                                            var17 = this.field6027.field585 = class338.method1994(21603, this.field6011);
                                            var16 = this.field6027.field581 = class338.method1994(21603, this.field5999);
                                            var15 = this.field6027.field582 = class470.method2823(this.field6050, -1);
                                        }
                                        if (var20 == null) {
                                            class39 var44 = var6.field6027 = new class39();
                                            var20 = var44.field584 = class338.method1994(21603, var11);
                                            var19 = var44.field585 = class338.method1994(21603, var12);
                                            var22 = var44.field581 = class338.method1994(21603, var13);
                                            var21 = var44.field582 = class470.method2823(var14, -1);
                                        }
                                        short var45 = this.field6038[var35];
                                        short var46 = this.field6011[var35];
                                        short var47 = this.field5999[var35];
                                        byte var48 = this.field6050[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var20[var52] += var45;
                                                var19[var52] += var46;
                                                var22[var52] += var47;
                                                var21[var52] += var48;
                                            }
                                        }
                                        short var53 = var12[var40];
                                        short var54 = var11[var40];
                                        byte var55 = var14[var40];
                                        int var56 = this.field6085[var31];
                                        int var57 = this.field6085[var31 + 1];
                                        short var58 = var13[var40];
                                        for (int var59 = var56; var59 < var57; var59++) {
                                            int var60 = this.field6054[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var18[var60] += var54;
                                                var17[var60] += var53;
                                                var16[var60] += var58;
                                                var15[var60] += var55;
                                            }
                                        }
                                        if (this.field6070 == null && this.field6021 != null) {
                                            this.field6021.field1851 = null;
                                        }
                                        if (this.field6070 != null) {
                                            this.field6070.field1851 = null;
                                        }
                                        if (var6.field6070 == null && var6.field6021 != null) {
                                            var6.field6021.field1851 = null;
                                        }
                                        if (var6.field6070 != null) {
                                            var6.field6070.field1851 = null;
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

    @OriginalMember(owner = "client!du", name = "VA", descriptor = "()I", line = 2356)
    public final int method490() {
        if (!this.field6010) {
            this.method2590((byte) 90);
        }
        field6081++;
        return this.field6025;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IJFIIBIFILuu;)S", line = 2372)
    private final short method2585(int arg0, long arg1, float arg2, int arg3, int arg4, byte arg5, int arg6, float arg7, int arg8, class420 arg9) {
        field6075++;
        int var12 = this.field6085[arg4];
        int var13 = this.field6085[arg4 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field6054[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class43.field624[var15] == arg1) {
                return (short) (var16 - 1);
            }
        }
        this.field6054[var14] = (short) (this.field6026 + 1);
        class43.field624[var14] = arg1;
        this.field6038[this.field6026] = (short) arg6;
        this.field6011[this.field6026] = (short) arg3;
        this.field5999[this.field6026] = (short) arg0;
        if (arg5 >= -79) {
            return -33;
        } else {
            this.field6050[this.field6026] = (byte) arg8;
            this.field6079[this.field6026] = arg7;
            this.field6042[this.field6026] = arg2;
            return (short) (this.field6026++);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "()Z", line = 2418)
    public final boolean method523() {
        field6037++;
        if (this.field6003 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field6003.length; var1++) {
            if (this.field6003[var1] != -1 && !this.field6032.field1765.method461(this.field6003[var1], false)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIIIIII)Z", line = 2449)
    private final boolean method2586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6065++;
        if (arg5 < arg4 && arg5 < arg6 && arg5 < arg2) {
            return false;
        } else if (arg4 < arg5 && arg5 > arg6 && arg5 > arg2) {
            return false;
        } else {
            if (arg3 != 63) {
                field6104 = null;
            }
            if (arg1 < arg0 && arg1 < arg7 && arg1 < arg8) {
                return false;
            } else {
                return arg0 >= arg1 || arg1 <= arg7 || arg8 >= arg1;
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "e", descriptor = "()V", line = 2474)
    public final void method492() {
        field6053++;
        if (this.field6026 <= 0 || this.field6009 <= 0) {
            return;
        }
        this.method2582(-1, false);
        if ((this.field6006 & 0x10) == 0 && this.field6036.field5484 == null) {
            this.method2587(false, false);
        }
        this.method2583(-2036044753);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZZ)V", line = 2492)
    private final void method2587(boolean arg0, boolean arg1) {
        if (arg1) {
            field6058 = null;
        }
        if (class338.field4327.field1223.length >= (this.field6009 * 6)) {
            class338.field4327.field1176 = 0;
        } else {
            class338.field4327 = new class205((this.field6009 + 100) * 6);
        }
        field6013++;
        if (this.field6032.field6759) {
            for (int var3 = 0; var3 < this.field6009; var3++) {
                class338.field4327.method609(this.field6029[var3], -90);
                class338.field4327.method609(this.field6020[var3], -79);
                class338.field4327.method609(this.field6098[var3], -59);
            }
        } else {
            for (int var4 = 0; var4 < this.field6009; var4++) {
                class338.field4327.method564(this.field6029[var4], 595249544);
                class338.field4327.method564(this.field6020[var4], 595249544);
                class338.field4327.method564(this.field6098[var4], 595249544);
            }
        }
        if (class338.field4327.field1176 == 0) {
            return;
        }
        if (arg0) {
            if (this.field6087 == null) {
                this.field6087 = this.field6032.method2752(class338.field4327.field1223, 1, 5123, true, class338.field4327.field1176);
            } else {
                this.field6087.method2062(class338.field4327.field1223, (byte) 100, class338.field4327.field1176, 5123);
            }
            this.field6036.field5484 = this.field6087;
        } else {
            this.field6036.field5484 = this.field6032.method2752(class338.field4327.field1223, 1, 5123, false, class338.field4327.field1176);
        }
        if (!arg0) {
            this.field6000 = true;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II)V", line = 2556)
    public static final void method2588(int arg0, int arg1) {
        field6084++;
        if (class495.method2961(arg0, arg1 ^ 0x8B7)) {
            class98.method669(class296.field3842[arg0], arg1 - 2272, -1);
            if (arg1 != 2272) {
                method2584((byte) -14);
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "oa", descriptor = "(I)V", line = 2572)
    public final void method516(int arg0) {
        this.field6072 = (short) arg0;
        field6107++;
        if (this.field6021 != null) {
            this.field6021.field1851 = null;
        }
        if (this.field6070 != null) {
            this.field6070.field1851 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "va", descriptor = "(I[IIIIZI[I)V", line = 2588)
    public final void method533(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field6061++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = arg2 << 4;
            class75.field940 = 0;
            class316.field4073 = 0;
            class102.field1400 = 0;
            int var13 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field6105.length > var15) {
                    int[] var16 = this.field6105[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field6015 == null || (this.field6015[var18] & arg6) != 0) {
                            class75.field940 += this.field6080[var18];
                            class102.field1400 += this.field6064[var18];
                            class316.field4073 += this.field6092[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class316.field4073 = class316.field4073 / var13 + var10;
                class102.field1400 = class102.field1400 / var13 + var11;
                class75.field940 = class75.field940 / var13 + var12;
                class124.field1718 = true;
            } else {
                class75.field940 = var12;
                class316.field4073 = var10;
                class102.field1400 = var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[4] * arg3 + arg7[3] * arg2 - (-(arg7[5] * arg4) - 16384) >> 15;
                int var21 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 16384 >> 15;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field6105.length > var26) {
                    int[] var27 = this.field6105[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field6015 == null || (this.field6015[var29] & arg6) != 0) {
                            this.field6080[var29] += var24;
                            this.field6064[var29] += var23;
                            this.field6092[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field6105.length) {
                        int[] var50 = this.field6105[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field6015 == null || (this.field6015[var52] & arg6) != 0) {
                                this.field6080[var52] -= class75.field940;
                                this.field6064[var52] -= class102.field1400;
                                this.field6092[var52] -= class316.field4073;
                                if (arg4 != 0) {
                                    int var53 = class21.field385[arg4];
                                    int var54 = class21.field397[arg4];
                                    int var55 = this.field6080[var52] * var54 + this.field6064[var52] * var53 + 32767 >> 15;
                                    this.field6064[var52] = this.field6064[var52] * var54 + 32767 - (this.field6080[var52] * var53) >> 15;
                                    this.field6080[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class21.field385[arg2];
                                    int var57 = class21.field397[arg2];
                                    int var58 = this.field6064[var52] * var57 + 32767 - (this.field6092[var52] * var56) >> 15;
                                    this.field6092[var52] = this.field6064[var52] * var56 + (this.field6092[var52] * var57) + 32767 >> 15;
                                    this.field6064[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class21.field385[arg3];
                                    int var60 = class21.field397[arg3];
                                    int var61 = this.field6092[var52] * var59 + this.field6080[var52] * var60 + 32767 >> 15;
                                    this.field6092[var52] = this.field6092[var52] * var60 - (this.field6080[var52] * var59 - 32767) >> 15;
                                    this.field6080[var52] = var61;
                                }
                                this.field6080[var52] += class75.field940;
                                this.field6064[var52] += class102.field1400;
                                this.field6092[var52] += class316.field4073;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field6105.length > var32) {
                            int[] var33 = this.field6105[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field6015 == null || (arg6 & this.field6015[var35]) != 0) {
                                    int var36 = this.field6085[var35];
                                    int var37 = this.field6085[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field6054[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class21.field385[arg4];
                                            int var41 = class21.field397[arg4];
                                            int var42 = this.field6038[var39] * var41 + this.field6011[var39] * var40 + 32767 >> 15;
                                            this.field6011[var39] = (short) (this.field6011[var39] * var41 + 32767 - (this.field6038[var39] * var40) >> 15);
                                            this.field6038[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class21.field385[arg2];
                                            int var44 = class21.field397[arg2];
                                            int var45 = this.field6011[var39] * var44 + 32767 - (this.field5999[var39] * var43) >> 15;
                                            this.field5999[var39] = (short) (this.field6011[var39] * var43 + this.field5999[var39] * var44 + 32767 >> 15);
                                            this.field6011[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class21.field385[arg3];
                                            int var47 = class21.field397[arg3];
                                            int var48 = this.field6038[var39] * var47 + (this.field5999[var39] * var46 + 32767) >> 15;
                                            this.field5999[var39] = (short) (this.field5999[var39] * var47 + 32767 - (this.field6038[var39] * var46) >> 15);
                                            this.field6038[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field6070 == null && this.field6021 != null) {
                        this.field6021.field1851 = null;
                    }
                    if (this.field6070 != null) {
                        this.field6070.field1851 = null;
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
                if (class124.field1718) {
                    int var68 = arg7[6] * class316.field4073 + arg7[0] * class75.field940 - (-(arg7[3] * class102.field1400) - 16384) >> 15;
                    int var69 = arg7[7] * class316.field4073 + arg7[1] * class75.field940 + arg7[4] * class102.field1400 + 16384 >> 15;
                    int var70 = var65 + var68;
                    int var71 = arg7[8] * class316.field4073 + arg7[2] * class75.field940 + arg7[5] * class102.field1400 + 16384 >> 15;
                    int var72 = var66 + var69;
                    class75.field940 = var70;
                    int var73 = var67 + var71;
                    class102.field1400 = var72;
                    class316.field4073 = var73;
                    class124.field1718 = false;
                }
                int[] var74 = new int[9];
                int var75 = class21.field397[arg2];
                int var76 = class21.field385[arg2];
                int var77 = class21.field397[arg3];
                int var78 = class21.field385[arg3];
                int var79 = class21.field397[arg4];
                int var80 = class21.field385[arg4];
                int var81 = var76 * var79 + 16384 >> 15;
                int var82 = var76 * var80 + 16384 >> 15;
                var74[5] = -var76;
                var74[6] = var77 * var82 + -var78 * var79 + 16384 >> 15;
                var74[1] = -var77 * var80 + (var78 * var81) + 16384 >> 15;
                var74[4] = var75 * var79 + 16384 >> 15;
                var74[3] = var75 * var80 + 16384 >> 15;
                var74[2] = var75 * var78 + 16384 >> 15;
                var74[7] = var77 * var81 + var78 * var80 + 16384 >> 15;
                var74[8] = var75 * var77 + 16384 >> 15;
                var74[0] = var77 * var79 + (var78 * var82) + 16384 >> 15;
                int var83 = var74[0] * -class75.field940 - (-(var74[1] * -class102.field1400) - (var74[2] * -class316.field4073) - 16384) >> 15;
                int var84 = var74[5] * -class316.field4073 + (var74[4] * -class102.field1400 + var74[3] * -class75.field940 + 16384) >> 15;
                int var85 = var74[6] * -class75.field940 + var74[8] * -class316.field4073 + var74[7] * -class102.field1400 + 16384 >> 15;
                int var86 = class75.field940 + var83;
                int var87 = class102.field1400 + var84;
                int var88 = var85 + class316.field4073;
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
                int var91 = var74[2] * var67 + var74[1] * var66 + var74[0] * var65 + 16384 >> 15;
                int var92 = var74[5] * var67 + var74[3] * var65 + var74[4] * var66 + 16384 >> 15;
                int var93 = var86 + var91;
                int var94 = var87 + var92;
                int var95 = var74[6] * var65 + var74[8] * var67 + var74[7] * var66 + 16384 >> 15;
                int var96 = var88 + var95;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += var89[var116 + (var118 * 3)] * arg7[var98 * 3 + var118];
                        }
                        var97[var98 * 3 + var116] = var117 + 16384 >> 15;
                    }
                }
                int var99 = arg7[2] * var96 + (arg7[0] * var93 + (arg7[1] * var94)) + 16384 >> 15;
                int var100 = arg7[5] * var96 + arg7[3] * var93 + arg7[4] * var94 + 16384 >> 15;
                int var101 = var63 + var100;
                int var102 = arg7[8] * var96 + arg7[6] * var93 - (-(arg7[7] * var94) + -16384) >> 15;
                int var103 = var62 + var99;
                int var104 = var64 + var102;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field6105.length) {
                        int[] var107 = this.field6105[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field6015 == null || (this.field6015[var109] & arg6) != 0) {
                                int var110 = this.field6092[var109] * var97[2] + (this.field6080[var109] * var97[0] - (-(this.field6064[var109] * var97[1]) - 16384)) >> 15;
                                int var111 = this.field6080[var109] * var97[3] + this.field6064[var109] * var97[4] + (this.field6092[var109] * var97[5]) + 16384 >> 15;
                                int var112 = var101 + var111;
                                int var113 = this.field6080[var109] * var97[6] + this.field6064[var109] * var97[7] + (this.field6092[var109] * var97[8]) + 16384 >> 15;
                                int var114 = var103 + var110;
                                this.field6080[var109] = var114;
                                int var115 = var104 + var113;
                                this.field6064[var109] = var112;
                                this.field6092[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field6105.length > var173) {
                        int[] var174 = this.field6105[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field6015 == null || (this.field6015[var176] & arg6) != 0) {
                                this.field6080[var176] -= class75.field940;
                                this.field6064[var176] -= class102.field1400;
                                this.field6092[var176] -= class316.field4073;
                                this.field6080[var176] = this.field6080[var176] * arg2 >> 7;
                                this.field6064[var176] = this.field6064[var176] * arg3 >> 7;
                                this.field6092[var176] = this.field6092[var176] * arg4 >> 7;
                                this.field6080[var176] += class75.field940;
                                this.field6064[var176] += class102.field1400;
                                this.field6092[var176] += class316.field4073;
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
                if (class124.field1718) {
                    int var128 = arg7[0] * class75.field940 + 16384 - (-(arg7[3] * class102.field1400) + -(arg7[6] * class316.field4073)) >> 15;
                    int var129 = arg7[7] * class316.field4073 + arg7[1] * class75.field940 + (arg7[4] * class102.field1400) + 16384 >> 15;
                    int var130 = var125 + var128;
                    int var131 = var126 + var129;
                    int var132 = arg7[2] * class75.field940 + (arg7[8] * class316.field4073) + arg7[5] * class102.field1400 + 16384 >> 15;
                    int var133 = var127 + var132;
                    class102.field1400 = var131;
                    class75.field940 = var130;
                    class316.field4073 = var133;
                    class124.field1718 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class75.field940 * var134 + 16384 >> 15;
                int var138 = -class102.field1400 * var135 + 16384 >> 15;
                int var139 = -class316.field4073 * var136 + 16384 >> 15;
                int var140 = class75.field940 + var137;
                int var141 = var138 + class102.field1400;
                int var142 = class316.field4073 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var140 + var144;
                int var147 = var141 + var145;
                int var148 = var127 * var136 + 16384 >> 15;
                int var149 = var142 + var148;
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
                int var152 = arg7[0] * var146 + arg7[1] * var147 + (arg7[2] * var149 - -16384) >> 15;
                int var153 = arg7[5] * var149 + arg7[4] * var147 + arg7[3] * var146 + 16384 >> 15;
                int var154 = arg7[6] * var146 + arg7[8] * var149 + arg7[7] * var147 + 16384 >> 15;
                int var155 = var123 + var153;
                int var156 = var122 + var152;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field6105.length > var159) {
                        int[] var160 = this.field6105[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field6015 == null || (arg6 & this.field6015[var162]) != 0) {
                                int var163 = this.field6092[var162] * var150[2] + this.field6080[var162] * var150[0] + this.field6064[var162] * var150[1] + 16384 >> 15;
                                int var164 = this.field6092[var162] * var150[5] + this.field6080[var162] * var150[3] + this.field6064[var162] * var150[4] + 16384 >> 15;
                                int var165 = this.field6080[var162] * var150[6] + this.field6064[var162] * var150[7] + (this.field6092[var162] * var150[8]) + 16384 >> 15;
                                int var166 = var155 + var164;
                                int var167 = var156 + var163;
                                int var168 = var157 + var165;
                                this.field6080[var162] = var167;
                                this.field6064[var162] = var166;
                                this.field6092[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6103 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field6103.length) {
                        int[] var182 = this.field6103[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field6018 == null || (arg6 & this.field6018[var184]) != 0) {
                                int var185 = (this.field6093[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field6093[var184] = (byte) var185;
                                if (this.field6021 != null) {
                                    this.field6021.field1851 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field6004 != null) {
                    for (int var178 = 0; var178 < this.field6094; var178++) {
                        class231 var179 = this.field6004[var178];
                        class299 var180 = this.field6067[var178];
                        var180.field3874 = var180.field3874 & 0xFFFFFF | 255 - (this.field6093[var179.field2985] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6103 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field6103.length) {
                        int[] var191 = this.field6103[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field6018 == null || (arg6 & this.field6018[var193]) != 0) {
                                int var194 = this.field6073[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = (var194 & 0x387) >> 7;
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
                                this.field6073[var193] = (short) class31.method213(class31.method213(var199 << 7, var197 << 10), var200);
                                if (this.field6021 != null) {
                                    this.field6021.field1851 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field6004 != null) {
                    for (int var187 = 0; var187 < this.field6094; var187++) {
                        class231 var188 = this.field6004[var187];
                        class299 var189 = this.field6067[var187];
                        var189.field3874 = var189.field3874 & 0xFF000000 | class9.field97[this.field6073[var188.field2985] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field6083 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field6083.length) {
                        int[] var203 = this.field6083[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class299 var205 = this.field6067[var203[var204]];
                            var205.field3878 += arg2;
                            var205.field3884 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field6083 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field6083.length) {
                        int[] var208 = this.field6083[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class299 var210 = this.field6067[var208[var209]];
                            var210.field3889 = var210.field3889 * arg3 >> 7;
                            var210.field3872 = var210.field3872 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field6083 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field6083.length) {
                    int[] var213 = this.field6083[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class299 var215 = this.field6067[var213[var214]];
                        var215.field3879 = var215.field3879 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "X", descriptor = "()I", line = 3576)
    public final int method515() {
        if (!this.field6010) {
            this.method2590((byte) 90);
        }
        field6047++;
        return this.field6008;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lsf;I)V", line = 3590)
    private final void method2589(class452 arg0, int arg1) {
        if (this.field6088 != null) {
            for (int var3 = 0; var3 < this.field6088.length; var3++) {
                class473 var4 = this.field6088[var3];
                class473 var5 = var4;
                if (var4.field6920 != null) {
                    var5 = var4.field6920;
                }
                var5.field6908 = (int) ((float) this.field6092[var4.field6904] * arg0.field6290 + (float) this.field6080[var4.field6904] * arg0.field6289 + (float) this.field6064[var4.field6904] * arg0.field6306 + arg0.field6309);
                var5.field6910 = (int) ((float) this.field6092[var4.field6904] * arg0.field6313 + (float) this.field6080[var4.field6904] * arg0.field6318 + (float) this.field6064[var4.field6904] * arg0.field6316 + arg0.field6317);
                var5.field6907 = (int) ((float) this.field6092[var4.field6904] * arg0.field6294 + (float) this.field6080[var4.field6904] * arg0.field6301 + (float) this.field6064[var4.field6904] * arg0.field6288 + arg0.field6286);
                var5.field6913 = (int) ((float) this.field6092[var4.field6917] * arg0.field6290 + (float) this.field6080[var4.field6917] * arg0.field6289 + (float) this.field6064[var4.field6917] * arg0.field6306 + arg0.field6309);
                var5.field6902 = (int) ((float) this.field6092[var4.field6917] * arg0.field6313 + (float) this.field6080[var4.field6917] * arg0.field6318 + (float) this.field6064[var4.field6917] * arg0.field6316 + arg0.field6317);
                var5.field6906 = (int) ((float) this.field6092[var4.field6917] * arg0.field6294 + (float) this.field6080[var4.field6917] * arg0.field6301 + (float) this.field6064[var4.field6917] * arg0.field6288 + arg0.field6286);
                var5.field6911 = (int) ((float) this.field6092[var4.field6903] * arg0.field6290 + (float) this.field6080[var4.field6903] * arg0.field6289 + (float) this.field6064[var4.field6903] * arg0.field6306 + arg0.field6309);
                var5.field6923 = (int) ((float) this.field6092[var4.field6903] * arg0.field6313 + (float) this.field6080[var4.field6903] * arg0.field6318 + (float) this.field6064[var4.field6903] * arg0.field6316 + arg0.field6317);
                var5.field6905 = (int) ((float) this.field6092[var4.field6903] * arg0.field6294 + (float) this.field6080[var4.field6903] * arg0.field6301 + (float) this.field6064[var4.field6903] * arg0.field6288 + arg0.field6286);
            }
        }
        if (arg1 != -16981) {
            this.method2589(null, -6);
        }
        field6001++;
        if (this.field6055 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field6055.length; var6++) {
            class165 var7 = this.field6055[var6];
            class165 var8 = var7;
            if (var7.field2133 != null) {
                var8 = var7.field2133;
            }
            if (var7.field2134 == null) {
                var7.field2134 = arg0.method977();
            } else {
                var7.field2134.method988(arg0);
            }
            var8.field2138 = (int) ((float) this.field6092[var7.field2131] * arg0.field6290 + (float) this.field6080[var7.field2131] * arg0.field6289 + (float) this.field6064[var7.field2131] * arg0.field6306 + arg0.field6309);
            var8.field2130 = (int) ((float) this.field6092[var7.field2131] * arg0.field6313 + (float) this.field6080[var7.field2131] * arg0.field6318 + (float) this.field6064[var7.field2131] * arg0.field6316 + arg0.field6317);
            var8.field2137 = (int) ((float) this.field6092[var7.field2131] * arg0.field6294 + (float) this.field6080[var7.field2131] * arg0.field6301 + (float) this.field6064[var7.field2131] * arg0.field6288 + arg0.field6286);
        }
    }

    @OriginalMember(owner = "client!du", name = "xa", descriptor = "(I[IIIIIZ)V", line = 3657)
    public final void method521(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field6086++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            class316.field4073 = 0;
            class102.field1400 = 0;
            int var12 = 0;
            class75.field940 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field6105.length) {
                    int[] var15 = this.field6105[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class75.field940 += this.field6080[var17];
                        class102.field1400 += this.field6064[var17];
                        class316.field4073 += this.field6092[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class75.field940 = var9;
                class102.field1400 = var10;
                class316.field4073 = var11;
            } else {
                class75.field940 = class75.field940 / var12 + var9;
                class316.field4073 = class316.field4073 / var12 + var11;
                class102.field1400 = class102.field1400 / var12 + var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg2 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field6105.length) {
                    int[] var23 = this.field6105[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field6080[var25] += var19;
                        this.field6064[var25] += var18;
                        this.field6092[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field6105.length > var45) {
                    int[] var46 = this.field6105[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field6080[var59] -= class75.field940;
                            this.field6064[var59] -= class102.field1400;
                            this.field6092[var59] -= class316.field4073;
                            if (arg4 != 0) {
                                int var60 = class21.field385[arg4];
                                int var61 = class21.field397[arg4];
                                int var62 = this.field6064[var59] * var60 + this.field6080[var59] * var61 + 32767 >> 15;
                                this.field6064[var59] = this.field6064[var59] * var61 + 32767 - (this.field6080[var59] * var60) >> 15;
                                this.field6080[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class21.field385[arg2];
                                int var64 = class21.field397[arg2];
                                int var65 = this.field6064[var59] * var64 + 32767 - this.field6092[var59] * var63 >> 15;
                                this.field6092[var59] = this.field6064[var59] * var63 + this.field6092[var59] * var64 + 32767 >> 15;
                                this.field6064[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class21.field385[arg3];
                                int var67 = class21.field397[arg3];
                                int var68 = this.field6092[var59] * var66 - (-(this.field6080[var59] * var67) - 32767) >> 15;
                                this.field6092[var59] = this.field6092[var59] * var67 + 32767 - (this.field6080[var59] * var66) >> 15;
                                this.field6080[var59] = var68;
                            }
                            this.field6080[var59] += class75.field940;
                            this.field6064[var59] += class102.field1400;
                            this.field6092[var59] += class316.field4073;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field6080[var48] -= class75.field940;
                            this.field6064[var48] -= class102.field1400;
                            this.field6092[var48] -= class316.field4073;
                            if (arg2 != 0) {
                                int var49 = class21.field385[arg2];
                                int var50 = class21.field397[arg2];
                                int var51 = this.field6064[var48] * var50 + 32767 - this.field6092[var48] * var49 >> 15;
                                this.field6092[var48] = this.field6092[var48] * var50 + this.field6064[var48] * var49 + 32767 >> 15;
                                this.field6064[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class21.field385[arg4];
                                int var53 = class21.field397[arg4];
                                int var54 = this.field6080[var48] * var53 + this.field6064[var48] * var52 + 32767 >> 15;
                                this.field6064[var48] = this.field6064[var48] * var53 + (32767 - (this.field6080[var48] * var52)) >> 15;
                                this.field6080[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class21.field385[arg3];
                                int var56 = class21.field397[arg3];
                                int var57 = this.field6080[var48] * var56 + (this.field6092[var48] * var55 + 32767) >> 15;
                                this.field6092[var48] = this.field6092[var48] * var56 + 32767 - (this.field6080[var48] * var55) >> 15;
                                this.field6080[var48] = var57;
                            }
                            this.field6080[var48] += class75.field940;
                            this.field6064[var48] += class102.field1400;
                            this.field6092[var48] += class316.field4073;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field6105.length) {
                        int[] var29 = this.field6105[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field6085[var31];
                            int var33 = this.field6085[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field6054[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class21.field385[arg4];
                                    int var37 = class21.field397[arg4];
                                    int var38 = this.field6038[var35] * var37 + this.field6011[var35] * var36 + 32767 >> 15;
                                    this.field6011[var35] = (short) (this.field6011[var35] * var37 + 32767 - (this.field6038[var35] * var36) >> 15);
                                    this.field6038[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class21.field385[arg2];
                                    int var40 = class21.field397[arg2];
                                    int var41 = this.field6011[var35] * var40 + 32767 - (this.field5999[var35] * var39) >> 15;
                                    this.field5999[var35] = (short) (this.field5999[var35] * var40 + (this.field6011[var35] * var39 + 32767) >> 15);
                                    this.field6011[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class21.field385[arg3];
                                    int var43 = class21.field397[arg3];
                                    int var44 = this.field6038[var35] * var43 + this.field5999[var35] * var42 + 32767 >> 15;
                                    this.field5999[var35] = (short) (this.field5999[var35] * var43 + 32767 - (this.field6038[var35] * var42) >> 15);
                                    this.field6038[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field6070 == null && this.field6021 != null) {
                    this.field6021.field1851 = null;
                }
                if (this.field6070 != null) {
                    this.field6070.field1851 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field6105.length > var70) {
                    int[] var71 = this.field6105[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field6080[var73] -= class75.field940;
                        this.field6064[var73] -= class102.field1400;
                        this.field6092[var73] -= class316.field4073;
                        this.field6080[var73] = this.field6080[var73] * arg2 >> 7;
                        this.field6064[var73] = this.field6064[var73] * arg3 >> 7;
                        this.field6092[var73] = this.field6092[var73] * arg4 >> 7;
                        this.field6080[var73] += class75.field940;
                        this.field6064[var73] += class102.field1400;
                        this.field6092[var73] += class316.field4073;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6103 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field6103.length) {
                        int[] var79 = this.field6103[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field6093[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field6093[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field6021 != null) {
                            this.field6021.field1851 = null;
                        }
                    }
                }
                if (this.field6004 != null) {
                    for (int var75 = 0; var75 < this.field6094; var75++) {
                        class231 var76 = this.field6004[var75];
                        class299 var77 = this.field6067[var75];
                        var77.field3874 = var77.field3874 & 0xFFFFFF | 255 - (this.field6093[var76.field2985] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6103 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field6103.length > var87) {
                        int[] var88 = this.field6103[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field6073[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3EC) >> 7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = var91 & 0x7F;
                            int var96 = arg2 + var92 & 0x3F;
                            int var97 = arg4 + var95;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 7) {
                                var94 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field6073[var90] = (short) class31.method213(var97, class31.method213(var94 << 7, var96 << 10));
                        }
                        if (var88.length > 0 && this.field6021 != null) {
                            this.field6021.field1851 = null;
                        }
                    }
                }
                if (this.field6004 != null) {
                    for (int var84 = 0; var84 < this.field6094; var84++) {
                        class231 var85 = this.field6004[var84];
                        class299 var86 = this.field6067[var84];
                        var86.field3874 = var86.field3874 & 0xFF000000 | class9.field97[this.field6073[var85.field2985] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field6083 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field6083.length > var99) {
                        int[] var100 = this.field6083[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class299 var102 = this.field6067[var100[var101]];
                            var102.field3884 += arg3;
                            var102.field3878 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field6083 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field6083.length > var104) {
                        int[] var105 = this.field6083[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class299 var107 = this.field6067[var105[var106]];
                            var107.field3889 = var107.field3889 * arg3 >> 7;
                            var107.field3872 = var107.field3872 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field6083 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field6083.length > var109) {
                    int[] var110 = this.field6083[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class299 var112 = this.field6067[var110[var111]];
                        var112.field3879 = var112.field3879 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIII)V", line = 4311)
    public final void method485(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field6045; var5++) {
            int var9 = this.field6073[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x385) >> 7;
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field6073[var5] = (short) class31.method213(var12, class31.method213(var11 << 7, var10 << 10));
        }
        field6108++;
        if (this.field6004 != null) {
            for (int var6 = 0; var6 < this.field6094; var6++) {
                class231 var7 = this.field6004[var6];
                class299 var8 = this.field6067[var6];
                var8.field3874 = class9.field97[this.field6073[var7.field2985] & 0xFFFF] & 0xFFFFFF | var8.field3874 & 0xFF000000;
            }
        }
        if (this.field6021 != null) {
            this.field6021.field1851 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "k", descriptor = "(I)V", line = 4371)
    public final void method522(int arg0) {
        field6095++;
        int var2 = class21.field385[arg0];
        int var3 = class21.field397[arg0];
        for (int var4 = 0; var4 < this.field6028; var4++) {
            int var5 = this.field6092[var4] * var2 + this.field6080[var4] * var3 >> 15;
            this.field6092[var4] = this.field6092[var4] * var3 - this.field6080[var4] * var2 >> 15;
            this.field6080[var4] = var5;
        }
        this.field6010 = false;
        if (this.field6035 != null) {
            this.field6035.field1851 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BIZ)Lc;", line = 4401)
    public final class507 method510(byte arg0, int arg1, boolean arg2) {
        field6002++;
        class438 var4;
        class438 var5;
        if (arg0 == 1) {
            var5 = this.field6032.field6713;
            var4 = this.field6032.field6739;
        } else if (arg0 == 2) {
            var5 = this.field6032.field6786;
            var4 = this.field6032.field6737;
        } else if (arg0 == 3) {
            var4 = this.field6032.field6788;
            var5 = this.field6032.field6730;
        } else if (arg0 == 4) {
            var5 = this.field6032.field6806;
            var4 = this.field6032.field6789;
        } else if (arg0 == 5) {
            var5 = this.field6032.field6721;
            var4 = this.field6032.field6747;
        } else {
            var5 = var4 = new class438(this.field6032);
        }
        return this.method2592(arg0 != 0, arg2, var5, arg1, var4, (byte) 34);
    }

    @OriginalMember(owner = "client!du", name = "W", descriptor = "()V", line = 4451)
    public final void method502() {
        for (int var1 = 0; var1 < this.field6082; var1++) {
            this.field6080[var1] = this.field6080[var1] + 7 >> 4;
            this.field6064[var1] = this.field6064[var1] + 7 >> 4;
            this.field6092[var1] = this.field6092[var1] + 7 >> 4;
        }
        field6099++;
        this.field6010 = false;
        if (this.field6035 != null) {
            this.field6035.field1851 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(B)V", line = 4480)
    private final void method2590(byte arg0) {
        field6048++;
        if (arg0 != 90) {
            this.method497();
        }
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field6028; var10++) {
            int var11 = this.field6080[var10];
            int var12 = this.field6064[var10];
            if (var2 > var11) {
                var2 = var11;
            }
            int var13 = this.field6092[var10];
            if (var12 > var6) {
                var6 = var12;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var13 * var13 + var11 * var11 + var12 * var12;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field6109 = (short) var7;
        this.field6043 = (short) var2;
        this.field6008 = (short) var4;
        this.field6059 = (short) var3;
        this.field6040 = (short) var6;
        this.field6025 = (short) var5;
        this.field6031 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field6010 = true;
    }

    @OriginalMember(owner = "client!du", name = "u", descriptor = "(I)V", line = 4562)
    public final void method517(int arg0) {
        this.field6100 = arg0;
        field6024++;
        if (this.field6027 != null && (this.field6100 & 0x10000) == 0) {
            this.field6050 = this.field6027.field582;
            this.field6038 = this.field6027.field584;
            this.field5999 = this.field6027.field581;
            this.field6011 = this.field6027.field585;
            this.field6027 = null;
        }
        this.field6000 = true;
        this.method2583(-2036044753);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lcb;I)V", line = 4583)
    private final void method2591(class57 arg0, int arg1) {
        field6057++;
        if (class237.field3087.length < this.field6026) {
            class517.field7620 = new int[this.field6026];
            class237.field3087 = new int[this.field6026];
        }
        for (int var3 = 0; var3 < this.field6028; var3++) {
            int var14 = (this.field6080[var3] - (this.field6064[var3] * this.field6032.field6798 >> 8) >> this.field6032.field6689) - arg0.field770;
            int var15 = (this.field6092[var3] - (this.field6064[var3] * this.field6032.field6811 >> 8) >> this.field6032.field6689) - arg0.field760;
            int var16 = this.field6085[var3];
            int var17 = this.field6085[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field6054[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class237.field3087[var19] = var14;
                class517.field7620[var19] = var15;
            }
        }
        for (int var4 = 0; var4 < this.field6009; var4++) {
            if (this.field6093 == null || this.field6093[var4] <= 128) {
                short var5 = this.field6029[var4];
                short var6 = this.field6020[var4];
                short var7 = this.field6098[var4];
                int var8 = class237.field3087[var5];
                int var9 = class237.field3087[var6];
                int var10 = class237.field3087[var7];
                int var11 = class517.field7620[var5];
                int var12 = class517.field7620[var6];
                int var13 = class517.field7620[var7];
                if ((var8 - var9) * (var12 - var13) - ((var12 - var11) * (var10 - var9)) > 0) {
                    arg0.method325(var12, var11, var8, var9, var13, var10, -30107);
                }
            }
        }
        if (arg1 <= 3) {
            this.method475();
        }
    }

    @OriginalMember(owner = "client!du", name = "ea", descriptor = "(IILna;Lna;III)V", line = 4670)
    public final void method534(int arg0, int arg1, class251 arg2, class251 arg3, int arg4, int arg5, int arg6) {
        field6019++;
        if (!this.field6010) {
            this.method2590((byte) 90);
        }
        int var8 = this.field6043 + arg4;
        int var9 = this.field6025 + arg4;
        int var10 = this.field6008 + arg6;
        int var11 = this.field6109 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || (arg2.field3198 + var9 >> arg2.field3193) >= arg2.field3197 || var10 < 0 || arg2.field3194 <= arg2.field3198 + var11 >> arg2.field3193) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field3197 <= arg3.field3198 + var9 >> arg3.field3193 || var10 < 0 || arg3.field3194 <= arg3.field3198 + var11 >> arg3.field3193) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3193;
            int var13 = arg2.field3198 + var9 - 1 >> arg2.field3193;
            int var14 = var10 >> arg2.field3193;
            int var15 = var11 + arg2.field3198 - 1 >> arg2.field3193;
            if (arg5 == arg2.method1187(var12, var14) && arg5 == arg2.method1187(var13, var14) && arg5 == arg2.method1187(var12, var15) && arg5 == arg2.method1187(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field6028; var16++) {
                this.field6064[var16] += arg2.method1185(this.field6080[var16] + arg4, this.field6092[var16] - -arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var30 = this.field6059;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field6028; var31++) {
                int var32 = (this.field6064[var31] << 16) / var30;
                if (arg1 > var32) {
                    this.field6064[var31] -= -((arg1 - var32) * (arg2.method1185(this.field6080[var31] + arg4, this.field6092[var31] + arg6) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var17 = (arg1 & 0xFF) * 4;
            int var18 = ((arg1 & 0xFFC4) >> 8) * 4;
            int var19 = (arg1 >> 16 & 0xFF) << 6;
            int var20 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var17 >> 1) < 0 || arg2.field3197 << arg2.field3193 <= (var17 >> 1) + arg4 + arg2.field3198 || arg6 - (var18 >> 1) < 0 || ((var18 >> 1) + arg6 + arg2.field3198) >= (arg2.field3194 << arg2.field3193)) {
                return;
            }
            this.method3015(var19, var20, var18, var17, arg5, arg6, (byte) 122, arg4, arg2);
        } else if (arg0 == 4) {
            int var28 = this.field6040 - this.field6059;
            for (int var29 = 0; var29 < this.field6028; var29++) {
                this.field6064[var29] = this.field6064[var29] + arg3.method1185(this.field6080[var29] + arg4, this.field6092[var29] + arg6) - (-var28 + arg5);
            }
        } else if (arg0 == 5) {
            int var21 = this.field6040 - this.field6059;
            for (int var22 = 0; var22 < this.field6028; var22++) {
                int var23 = this.field6080[var22] + arg4;
                int var24 = this.field6092[var22] + arg6;
                int var25 = arg2.method1185(var23, var24);
                int var26 = arg3.method1185(var23, var24);
                int var27 = var25 - var26;
                this.field6064[var22] = ((this.field6064[var22] << 8) / var21 * var27 >> 8) + var25 - arg5;
            }
        }
        if (this.field6035 != null) {
            this.field6035.field1851 = null;
        }
        this.field6010 = false;
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "()[Lot;", line = 4827)
    public final class165[] method476() {
        field6074++;
        return this.field6055;
    }

    @OriginalMember(owner = "client!du", name = "E", descriptor = "()I", line = 4841)
    public final int method511() {
        if (!this.field6010) {
            this.method2590((byte) 90);
        }
        field6071++;
        return this.field6040;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZZLdu;ILdu;B)Lc;", line = 4857)
    private final class507 method2592(boolean arg0, boolean arg1, class438 arg2, int arg3, class438 arg4, byte arg5) {
        arg2.field6060 = this.field6060;
        arg2.field6100 = arg3;
        arg2.field6072 = this.field6072;
        arg2.field6094 = this.field6094;
        arg2.field6082 = this.field6082;
        arg2.field6028 = this.field6028;
        field6005++;
        arg2.field6102 = this.field6102;
        arg2.field6009 = this.field6009;
        arg2.field6045 = this.field6045;
        arg2.field6006 = 0;
        arg2.field6026 = this.field6026;
        boolean var7 = class34.method223(arg3, 7350, this.field6102);
        boolean var8 = class257.method1611(arg3, this.field6102, -1);
        boolean var9 = class250.method1566(this.field6102, arg3, -1);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg2.field6080 = this.field6080;
            } else if (arg4.field6080 == null || this.field6082 > arg4.field6080.length) {
                arg2.field6080 = arg4.field6080 = new int[this.field6082];
            } else {
                arg2.field6080 = arg4.field6080;
            }
            if (!var8) {
                arg2.field6064 = this.field6064;
            } else if (arg4.field6064 == null || this.field6082 > arg4.field6064.length) {
                arg2.field6064 = arg4.field6064 = new int[this.field6082];
            } else {
                arg2.field6064 = arg4.field6064;
            }
            if (!var9) {
                arg2.field6092 = this.field6092;
            } else if (arg4.field6092 == null || this.field6082 > arg4.field6092.length) {
                arg2.field6092 = arg4.field6092 = new int[this.field6082];
            } else {
                arg2.field6092 = arg4.field6092;
            }
            for (int var11 = 0; var11 < this.field6082; var11++) {
                if (var7) {
                    arg2.field6080[var11] = this.field6080[var11];
                }
                if (var8) {
                    arg2.field6064[var11] = this.field6064[var11];
                }
                if (var9) {
                    arg2.field6092[var11] = this.field6092[var11];
                }
            }
        } else {
            arg2.field6080 = this.field6080;
            arg2.field6092 = this.field6092;
            arg2.field6064 = this.field6064;
        }
        if (class71.method404(arg3, (byte) 112, this.field6102)) {
            if (arg0) {
                arg2.field6006 = (byte) (arg2.field6006 | 0x1);
            }
            arg2.field6035 = arg4.field6035;
            arg2.field6035.field1851 = this.field6035.field1851;
            arg2.field6035.field1854 = this.field6035.field1854;
        } else if (class142.method987(arg3, false, this.field6102)) {
            arg2.field6035 = this.field6035;
        } else {
            arg2.field6035 = null;
        }
        if (class255.method1593(arg3, 89, this.field6102)) {
            if (arg4.field6073 == null || arg4.field6073.length < this.field6045) {
                arg2.field6073 = arg4.field6073 = new short[this.field6045];
            } else {
                arg2.field6073 = arg4.field6073;
            }
            for (int var12 = 0; var12 < this.field6045; var12++) {
                arg2.field6073[var12] = this.field6073[var12];
            }
        } else {
            arg2.field6073 = this.field6073;
        }
        if (class420.method2481(arg3, 39, this.field6102)) {
            if (arg4.field6093 == null || arg4.field6093.length < this.field6045) {
                arg2.field6093 = arg4.field6093 = new byte[this.field6045];
            } else {
                arg2.field6093 = arg4.field6093;
            }
            for (int var13 = 0; var13 < this.field6045; var13++) {
                arg2.field6093[var13] = this.field6093[var13];
            }
        } else {
            arg2.field6093 = this.field6093;
        }
        if (class386.method2304(this.field6102, arg3, -1)) {
            arg2.field6021 = arg4.field6021;
            if (arg0) {
                arg2.field6006 = (byte) (arg2.field6006 | 0x2);
            }
            arg2.field6021.field1854 = this.field6021.field1854;
            arg2.field6021.field1851 = this.field6021.field1851;
        } else if (class428.method2535((byte) 53, arg3, this.field6102)) {
            arg2.field6021 = this.field6021;
        } else {
            arg2.field6021 = null;
        }
        if (class127.method810(this.field6102, arg3, -103)) {
            if (arg4.field6038 == null || arg4.field6038.length < this.field6026) {
                int var14 = this.field6026;
                arg2.field5999 = arg4.field5999 = new short[var14];
                arg2.field6011 = arg4.field6011 = new short[var14];
                arg2.field6038 = arg4.field6038 = new short[var14];
            } else {
                arg2.field6038 = arg4.field6038;
                arg2.field5999 = arg4.field5999;
                arg2.field6011 = arg4.field6011;
            }
            if (this.field6027 == null) {
                for (int var15 = 0; var15 < this.field6026; var15++) {
                    arg2.field6038[var15] = this.field6038[var15];
                    arg2.field6011[var15] = this.field6011[var15];
                    arg2.field5999[var15] = this.field5999[var15];
                }
            } else {
                if (arg4.field6027 == null) {
                    arg4.field6027 = new class39();
                }
                class39 var16 = arg2.field6027 = arg4.field6027;
                if (var16.field584 == null || this.field6026 > var16.field584.length) {
                    int var17 = this.field6026;
                    var16.field581 = new short[var17];
                    var16.field582 = new byte[var17];
                    var16.field584 = new short[var17];
                    var16.field585 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field6026; var18++) {
                    arg2.field6038[var18] = this.field6038[var18];
                    arg2.field6011[var18] = this.field6011[var18];
                    arg2.field5999[var18] = this.field5999[var18];
                    var16.field584[var18] = this.field6027.field584[var18];
                    var16.field585[var18] = this.field6027.field585[var18];
                    var16.field581[var18] = this.field6027.field581[var18];
                    var16.field582[var18] = this.field6027.field582[var18];
                }
            }
            arg2.field6050 = this.field6050;
        } else {
            arg2.field6011 = this.field6011;
            arg2.field6050 = this.field6050;
            arg2.field5999 = this.field5999;
            arg2.field6038 = this.field6038;
            arg2.field6027 = this.field6027;
        }
        if (class187.method1234(this.field6102, arg3, 9)) {
            arg2.field6070 = arg4.field6070;
            if (arg0) {
                arg2.field6006 = (byte) (arg2.field6006 | 0x4);
            }
            arg2.field6070.field1854 = this.field6070.field1854;
            arg2.field6070.field1851 = this.field6070.field1851;
        } else if (class349.method2053(this.field6102, arg3, 256)) {
            arg2.field6070 = this.field6070;
        } else {
            arg2.field6070 = null;
        }
        if (class365.method2144((byte) -97, this.field6102, arg3)) {
            if (arg4.field6079 == null || arg4.field6079.length < this.field6045) {
                int var19 = this.field6026;
                arg2.field6042 = arg4.field6042 = new float[var19];
                arg2.field6079 = arg4.field6079 = new float[var19];
            } else {
                arg2.field6042 = arg4.field6042;
                arg2.field6079 = arg4.field6079;
            }
            for (int var20 = 0; var20 < this.field6026; var20++) {
                arg2.field6079[var20] = this.field6079[var20];
                arg2.field6042[var20] = this.field6042[var20];
            }
        } else {
            arg2.field6079 = this.field6079;
            arg2.field6042 = this.field6042;
        }
        if (class363.method2135(arg3, 16383, this.field6102)) {
            arg2.field6039 = arg4.field6039;
            if (arg0) {
                arg2.field6006 = (byte) (arg2.field6006 | 0x8);
            }
            arg2.field6039.field1854 = this.field6039.field1854;
            arg2.field6039.field1851 = this.field6039.field1851;
        } else if (class449.method2664(arg3, -1, this.field6102)) {
            arg2.field6039 = this.field6039;
        } else {
            arg2.field6039 = null;
        }
        if (class46.method292(arg3, (byte) 47, this.field6102)) {
            if (arg4.field6029 == null || arg4.field6029.length < this.field6045) {
                int var21 = this.field6045;
                arg2.field6029 = arg4.field6029 = new short[var21];
                arg2.field6098 = arg4.field6098 = new short[var21];
                arg2.field6020 = arg4.field6020 = new short[var21];
            } else {
                arg2.field6098 = arg4.field6098;
                arg2.field6029 = arg4.field6029;
                arg2.field6020 = arg4.field6020;
            }
            for (int var22 = 0; var22 < this.field6045; var22++) {
                arg2.field6029[var22] = this.field6029[var22];
                arg2.field6020[var22] = this.field6020[var22];
                arg2.field6098[var22] = this.field6098[var22];
            }
        } else {
            arg2.field6020 = this.field6020;
            arg2.field6098 = this.field6098;
            arg2.field6029 = this.field6029;
        }
        if (class236.method1502(arg5 - 5735, this.field6102, arg3)) {
            if (arg0) {
                arg2.field6006 = (byte) (arg2.field6006 | 0x10);
            }
            arg2.field6036 = arg4.field6036;
            arg2.field6036.field5484 = this.field6036.field5484;
        } else if (class96.method658(-118, arg3, this.field6102)) {
            arg2.field6036 = this.field6036;
        } else {
            arg2.field6036 = null;
        }
        if (class78.method449(arg3, -117, this.field6102)) {
            if (arg4.field6003 == null || arg4.field6003.length < this.field6045) {
                int var23 = this.field6045;
                arg2.field6003 = arg4.field6003 = new short[var23];
            } else {
                arg2.field6003 = arg4.field6003;
            }
            for (int var24 = 0; var24 < this.field6045; var24++) {
                arg2.field6003[var24] = this.field6003[var24];
            }
        } else {
            arg2.field6003 = this.field6003;
        }
        if (arg5 != 34) {
            this.method516(111);
        }
        if (!class206.method1345(arg3, this.field6102, -98)) {
            arg2.field6067 = this.field6067;
        } else if (arg4.field6067 == null || arg4.field6067.length < this.field6094) {
            int var26 = this.field6094;
            arg2.field6067 = arg4.field6067 = new class299[var26];
            for (int var27 = 0; var27 < this.field6094; var27++) {
                arg2.field6067[var27] = this.field6067[var27].method1794(51);
            }
        } else {
            arg2.field6067 = arg4.field6067;
            for (int var25 = 0; var25 < this.field6094; var25++) {
                arg2.field6067[var25].method1796(-161, this.field6067[var25]);
            }
        }
        arg2.field6091 = this.field6091;
        if (this.field6010) {
            arg2.field6031 = this.field6031;
            arg2.field6043 = this.field6043;
            arg2.field6040 = this.field6040;
            arg2.field6025 = this.field6025;
            arg2.field6008 = this.field6008;
            arg2.field6109 = this.field6109;
            arg2.field6059 = this.field6059;
            arg2.field6010 = true;
        } else {
            arg2.field6010 = false;
        }
        arg2.field6103 = this.field6103;
        arg2.field6085 = this.field6085;
        arg2.field6054 = this.field6054;
        arg2.field6083 = this.field6083;
        arg2.field6105 = this.field6105;
        arg2.field6088 = this.field6088;
        arg2.field6015 = this.field6015;
        arg2.field6004 = this.field6004;
        arg2.field6055 = this.field6055;
        arg2.field6018 = this.field6018;
        return arg2;
    }

    @OriginalMember(owner = "client!du", name = "ia", descriptor = "(I)V", line = 5322)
    public final void method487(int arg0) {
        field6033++;
        int var2 = class21.field385[arg0];
        int var3 = class21.field397[arg0];
        for (int var4 = 0; var4 < this.field6028; var4++) {
            int var7 = this.field6092[var4] * var2 + (this.field6080[var4] * var3) >> 15;
            this.field6092[var4] = this.field6092[var4] * var3 - (this.field6080[var4] * var2) >> 15;
            this.field6080[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field6026; var5++) {
            int var6 = this.field5999[var5] * var2 + (this.field6038[var5] * var3) >> 15;
            this.field5999[var5] = (short) (this.field5999[var5] * var3 - (this.field6038[var5] * var2) >> 15);
            this.field6038[var5] = (short) var6;
        }
        if (this.field6070 == null && this.field6021 != null) {
            this.field6021.field1851 = null;
        }
        if (this.field6070 != null) {
            this.field6070.field1851 = null;
        }
        if (this.field6035 != null) {
            this.field6035.field1851 = null;
        }
        this.field6010 = false;
    }

    @OriginalMember(owner = "client!du", name = "Q", descriptor = "()I", line = 5372)
    public final int method524() {
        field6049++;
        return this.field6072;
    }

    @OriginalMember(owner = "client!du", name = "o", descriptor = "(I)V", line = 5381)
    public final void method506(int arg0) {
        field6022++;
        int var2 = class21.field385[arg0];
        int var3 = class21.field397[arg0];
        for (int var4 = 0; var4 < this.field6028; var4++) {
            int var5 = this.field6080[var4] * var3 + this.field6064[var4] * var2 >> 15;
            this.field6064[var4] = this.field6064[var4] * var3 - this.field6080[var4] * var2 >> 15;
            this.field6080[var4] = var5;
        }
        this.field6010 = false;
        if (this.field6035 != null) {
            this.field6035.field1851 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(B)V", line = 5411)
    private final void method2593(byte arg0) {
        if (arg0 <= 99) {
            this.method491();
        }
        field6041++;
        if (this.field6009 == 0) {
            return;
        }
        if (this.field6006 != 0) {
            this.method2582(-1, true);
        }
        this.method2582(-1, false);
        if (this.field6036 != null) {
            if (this.field6036.field5484 == null) {
                this.method2587((this.field6006 & 0x10) != 0, false);
            }
            if (this.field6036.field5484 != null) {
                this.field6032.method2797(this.field6070 != null, (byte) -22);
                this.field6032.method2788(this.field6070, this.field6035, this.field6021, (byte) -35, this.field6039);
                int var2 = this.field6091.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field6091[var3];
                    int var5 = this.field6091[var3 + 1];
                    int var6 = this.field6003[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field6032.method2738(1, var6, this.field6070 != null);
                    this.field6032.method2769(var4 * 3, this.field6036.field5484, 4, 0, (var5 - var4) * 3);
                }
            }
        }
        this.method2583(-2036044753);
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(I)V", line = 5480)
    private final void method2594(int arg0) {
        if (this.field6004 != null) {
            class452 var2 = this.field6032.field6687;
            float var3 = this.field6032.method828();
            float var4 = this.field6032.method863();
            this.field6032.method2761(arg0 - 14595);
            this.field6032.method825(false);
            this.field6032.method2797(false, (byte) -22);
            this.field6032.method2788(null, this.field6032.field6770, null, (byte) -35, this.field6032.field6824);
            for (int var5 = 0; var5 < this.field6094; var5++) {
                class231 var6 = this.field6004[var5];
                class299 var7 = this.field6067[var5];
                if (!var6.field2984 || !this.field6032.method879()) {
                    float var8 = (float) (this.field6080[var6.field2991] + this.field6080[var6.field2989] + this.field6080[var6.field2993]) * 0.3333333F;
                    float var9 = (float) (this.field6064[var6.field2991] + this.field6064[var6.field2989] + this.field6064[var6.field2993]) * 0.3333333F;
                    float var10 = (float) (this.field6092[var6.field2989] + this.field6092[var6.field2991] + this.field6092[var6.field2993]) * 0.3333333F;
                    float var11 = class318.field4098 * var10 + class417.field5555 * var9 + class364.field4695 * var8 + class63.field809;
                    float var12 = class201.field2626 * var10 + class61.field799 * var8 + class402.field5423 * var9 + class199.field2560;
                    float var13 = class489.field7137 * var10 + class336.field4298 * var9 + class205.field2673 * var8 + class238.field3091;
                    var2.method2680((float) var7.field3884 - var12, var6.field2990 * var7.field3872 >> 7, -var13, var6.field2997 * var7.field3889 >> 7, (byte) 117, (float) var7.field3878 + var11, var7.field3879);
                    this.field6032.method2744(arg0 - 3, var2);
                    this.field6032.method913(var4, var3 - (float) var6.field2988 * 1.5F);
                    int var14 = var7.field3874;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field6032.method2755(var6.field2986, true);
                    this.field6032.method2760(var6.field2987, arg0 ^ 0x7B);
                    this.field6032.method2739(var6.field2992, arg0 ^ 0x5);
                    this.field6032.method2746(0, 7, 0, 4);
                }
            }
            this.field6032.method913(var4, var3);
            this.field6032.method825(true);
            this.field6032.method2795(-4995);
        }
        field6063++;
        if (arg0 != 5) {
            this.field6098 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "ua", descriptor = "(Lj;)Lj;", line = 5544)
    public final class254 method525(class254 arg0) {
        field6068++;
        if (this.field6026 == 0) {
            return null;
        }
        if (!this.field6010) {
            this.method2590((byte) 90);
        }
        int var2;
        int var3;
        if (this.field6032.field6798 > 0) {
            var2 = this.field6043 - (this.field6032.field6798 * this.field6040 >> 8) >> this.field6032.field6689;
            var3 = this.field6025 - (this.field6032.field6798 * this.field6059 >> 8) >> this.field6032.field6689;
        } else {
            var2 = this.field6043 - (this.field6032.field6798 * this.field6059 >> 8) >> this.field6032.field6689;
            var3 = this.field6025 - (this.field6032.field6798 * this.field6040 >> 8) >> this.field6032.field6689;
        }
        int var4;
        int var5;
        if (this.field6032.field6811 <= 0) {
            var4 = this.field6008 - (this.field6032.field6811 * this.field6059 >> 8) >> this.field6032.field6689;
            var5 = this.field6109 - (this.field6032.field6811 * this.field6040 >> 8) >> this.field6032.field6689;
        } else {
            var4 = this.field6008 - (this.field6032.field6811 * this.field6040 >> 8) >> this.field6032.field6689;
            var5 = this.field6109 - (this.field6032.field6811 * this.field6059 >> 8) >> this.field6032.field6689;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class57 var8 = (class57) arg0;
        class57 var9;
        if (var8 != null && var8.method327(var7, (byte) 40, var6)) {
            var9 = var8;
            var8.method328(false);
        } else {
            var9 = new class57(this.field6032, var6, var7);
        }
        var9.method330(var5, var4, (byte) -123, var3, var2);
        this.method2591(var9, 30);
        return var9;
    }
}
