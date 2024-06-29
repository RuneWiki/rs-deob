import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class68 extends class233 {

    @OriginalMember(owner = "client!qb", name = "eb", descriptor = "I")
    private int field1035 = 0;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    private int field1006 = 0;

    @OriginalMember(owner = "client!qb", name = "Ib", descriptor = "Z")
    private boolean field1065 = false;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    private int field1024 = 0;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "Z")
    private boolean field1012 = false;

    @OriginalMember(owner = "client!qb", name = "mc", descriptor = "Z")
    private boolean field1095 = false;

    @OriginalMember(owner = "client!qb", name = "Ac", descriptor = "I")
    private int field1109 = 0;

    @OriginalMember(owner = "client!qb", name = "ub", descriptor = "Z")
    private boolean field1051 = true;

    @OriginalMember(owner = "client!qb", name = "kc", descriptor = "I")
    private int field1093 = 0;

    @OriginalMember(owner = "client!qb", name = "uc", descriptor = "Llea;")
    private class573 field1103;

    @OriginalMember(owner = "client!qb", name = "Db", descriptor = "Lpc;")
    private class282 field1060;

    @OriginalMember(owner = "client!qb", name = "kb", descriptor = "Lpc;")
    private class282 field1041;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "Lpc;")
    private class282 field1017;

    @OriginalMember(owner = "client!qb", name = "Gb", descriptor = "Lpc;")
    private class282 field1063;

    @OriginalMember(owner = "client!qb", name = "Cc", descriptor = "Lrea;")
    private class39 field1111;

    @OriginalMember(owner = "client!qb", name = "gb", descriptor = "I")
    private int field1037;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    private int field1011;

    @OriginalMember(owner = "client!qb", name = "Bb", descriptor = "[I")
    private int[] field1058;

    @OriginalMember(owner = "client!qb", name = "hb", descriptor = "[S")
    private short[] field1038;

    @OriginalMember(owner = "client!qb", name = "cc", descriptor = "[I")
    private int[] field1085;

    @OriginalMember(owner = "client!qb", name = "sb", descriptor = "[I")
    private int[] field1049;

    @OriginalMember(owner = "client!qb", name = "Hb", descriptor = "[I")
    private int[] field1064;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "[Lgfa;")
    private class740[] field1008;

    @OriginalMember(owner = "client!qb", name = "Ec", descriptor = "[Lpi;")
    private class335[] field1113;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "client!qb", name = "jc", descriptor = "[Lqn;")
    private class531[] field1092;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "[Lpm;")
    private class615[] field1026;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "[S")
    private short[] field1016;

    @OriginalMember(owner = "client!qb", name = "fc", descriptor = "[S")
    private short[] field1088;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "[S")
    private short[] field1022;

    @OriginalMember(owner = "client!qb", name = "oc", descriptor = "S")
    private short field1097;

    @OriginalMember(owner = "client!qb", name = "lb", descriptor = "[S")
    private short[] field1042;

    @OriginalMember(owner = "client!qb", name = "mb", descriptor = "[S")
    private short[] field1043;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "[F")
    private float[] field1013;

    @OriginalMember(owner = "client!qb", name = "gc", descriptor = "[S")
    private short[] field1089;

    @OriginalMember(owner = "client!qb", name = "sc", descriptor = "S")
    private short field1101;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "[B")
    private byte[] field1025;

    @OriginalMember(owner = "client!qb", name = "Eb", descriptor = "[S")
    private short[] field1061;

    @OriginalMember(owner = "client!qb", name = "Bc", descriptor = "[B")
    private byte[] field1110;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "[S")
    private short[] field1000;

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "[S")
    private short[] field1033;

    @OriginalMember(owner = "client!qb", name = "ec", descriptor = "[F")
    private float[] field1087;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "[S")
    private short[] field1023;

    @OriginalMember(owner = "client!qb", name = "Ob", descriptor = "[I")
    private int[] field1071;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "[[I")
    private int[][] field1027;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "[[I")
    private int[][] field996;

    @OriginalMember(owner = "client!qb", name = "qc", descriptor = "[[I")
    private int[][] field1099;

    @OriginalMember(owner = "client!qb", name = "vc", descriptor = "I")
    public static int field1104 = 0;

    @OriginalMember(owner = "client!qb", name = "rc", descriptor = "I")
    public static int field1100 = 0;

    @OriginalMember(owner = "client!qb", name = "ac", descriptor = "Lsv;")
    public static class570 field1083 = new class570(57, 3);

    @OriginalMember(owner = "client!qb", name = "Hc", descriptor = "D")
    public static double field1116 = -1.0D;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "B")
    private byte field993;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!qb", name = "fb", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!qb", name = "ib", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!qb", name = "jb", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!qb", name = "pb", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!qb", name = "qb", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!qb", name = "rb", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!qb", name = "tb", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!qb", name = "vb", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!qb", name = "wb", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!qb", name = "xb", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!qb", name = "yb", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!qb", name = "zb", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!qb", name = "Ab", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!qb", name = "Cb", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!qb", name = "Fb", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!qb", name = "Jb", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!qb", name = "Kb", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!qb", name = "Lb", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!qb", name = "Mb", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!qb", name = "Pb", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!qb", name = "Qb", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!qb", name = "Rb", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!qb", name = "Tb", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!qb", name = "Ub", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!qb", name = "Vb", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!qb", name = "Wb", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!qb", name = "Xb", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!qb", name = "Yb", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!qb", name = "Zb", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!qb", name = "bc", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!qb", name = "dc", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!qb", name = "hc", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!qb", name = "ic", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!qb", name = "nc", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!qb", name = "pc", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!qb", name = "tc", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!qb", name = "wc", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!qb", name = "xc", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!qb", name = "yc", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!qb", name = "zc", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!qb", name = "Dc", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!qb", name = "Gc", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!qb", name = "Ic", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!qb", name = "Jc", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "Lat;")
    private class164 field1032;

    @OriginalMember(owner = "client!qb", name = "lc", descriptor = "Lcq;")
    private class305 field1094;

    @OriginalMember(owner = "client!qb", name = "nb", descriptor = "Ltj;")
    private class690 field1044;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "S")
    private short field1014;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "S")
    private short field1015;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "S")
    private short field1029;

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "S")
    private short field1030;

    @OriginalMember(owner = "client!qb", name = "ob", descriptor = "S")
    private short field1045;

    @OriginalMember(owner = "client!qb", name = "Nb", descriptor = "S")
    private short field1070;

    @OriginalMember(owner = "client!qb", name = "Sb", descriptor = "S")
    private short field1075;

    @OriginalMember(owner = "client!qb", name = "Fc", descriptor = "S")
    private short field1114;

    @OriginalMember(owner = "client!qb", name = "ua", descriptor = "()I", line = 4)
    public final int method591() {
        field1091++;
        return this.field1037;
    }

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "(I)V", line = 12)
    public final void method530(int arg0) {
        field1004++;
        int var2 = class253.field3634[arg0];
        int var3 = class253.field3633[arg0];
        for (int var4 = 0; var4 < this.field1035; var4++) {
            int var7 = this.field1064[var4] * var2 + (this.field1049[var4] * var3) >> 14;
            this.field1064[var4] = this.field1064[var4] * var3 - (this.field1049[var4] * var2) >> 14;
            this.field1049[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field1109; var5++) {
            int var6 = this.field1088[var5] * var2 + this.field1061[var5] * var3 >> 14;
            this.field1088[var5] = (short) (this.field1088[var5] * var3 - (this.field1061[var5] * var2) >> 14);
            this.field1061[var5] = (short) var6;
        }
        if (this.field1017 == null && this.field1063 != null) {
            this.field1063.field4148 = null;
        }
        if (this.field1017 != null) {
            this.field1017.field4148 = null;
        }
        this.field1012 = false;
        if (this.field1060 != null) {
            this.field1060.field4148 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 62)
    public final void method599(int arg0) {
        field1076++;
        int var2 = class253.field3634[arg0];
        int var3 = class253.field3633[arg0];
        for (int var4 = 0; var4 < this.field1035; var4++) {
            int var5 = this.field1064[var4] * var2 + this.field1049[var4] * var3 >> 14;
            this.field1064[var4] = this.field1064[var4] * var3 - (this.field1049[var4] * var2) >> 14;
            this.field1049[var4] = var5;
        }
        this.field1012 = false;
        if (this.field1060 != null) {
            this.field1060.field4148 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "(IILs;Ls;III)V", line = 94)
    public final void method554(int arg0, int arg1, class419 arg2, class419 arg3, int arg4, int arg5, int arg6) {
        if (!this.field1012) {
            this.method662((byte) -82);
        }
        field1059++;
        int var8 = this.field1075 + arg4;
        int var9 = this.field1014 + arg4;
        int var10 = this.field1070 + arg6;
        int var11 = arg6 + this.field1114;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field5808 <= (arg2.field5805 + var9 >> arg2.field5807) || var10 < 0 || arg2.field5809 <= (var11 + arg2.field5805 >> arg2.field5807)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field5808 <= arg3.field5805 + var9 >> arg3.field5807 || var10 < 0 || arg3.field5805 + var11 >> arg3.field5807 >= arg3.field5809) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field5807;
            int var13 = arg2.field5805 + var9 - 1 >> arg2.field5807;
            int var14 = var10 >> arg2.field5807;
            int var15 = -(-arg2.field5805 - var11) - 1 >> arg2.field5807;
            if (arg2.method2476(var14, var12, -1) == arg5 && arg2.method2476(var14, var13, -1) == arg5 && arg2.method2476(var15, var12, -1) == arg5 && arg2.method2476(var15, var13, -1) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field1035; var16++) {
                this.field1085[var16] = this.field1085[var16] + arg2.method2478(true, this.field1064[var16] + arg6, this.field1049[var16] + arg4) - arg5;
            }
        } else if (arg0 == 2) {
            short var30 = this.field1045;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field1035; var31++) {
                int var32 = (this.field1085[var31] << 16) / var30;
                if (arg1 > var32) {
                    this.field1085[var31] += (arg1 - var32) * (arg2.method2478(true, this.field1064[var31] + arg6, this.field1049[var31] + arg4) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var26 = (arg1 & 0xFF) * 4;
            int var27 = (arg1 >> 8 & 0xFF) * 4;
            int var28 = arg1 >> 16 & 0xFF << 6;
            int var29 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var26 >> 1) < 0 || arg2.field5808 << arg2.field5807 <= (var26 >> 1) + arg4 + arg2.field5805 || (arg6 - (var27 >> 1)) < 0 || (var27 >> 1) + arg6 + arg2.field5805 >= arg2.field5809 << arg2.field5807) {
                return;
            }
            this.method1586(var29, arg5, var26, var27, var28, 76, arg4, arg6, arg2);
        } else if (arg0 == 4) {
            int var24 = this.field1030 - this.field1045;
            for (int var25 = 0; var25 < this.field1035; var25++) {
                this.field1085[var25] = var24 + (this.field1085[var25] - (arg5 - arg3.method2478(true, this.field1064[var25] + arg6, this.field1049[var25] + arg4)));
            }
        } else if (arg0 == 5) {
            int var17 = this.field1030 - this.field1045;
            for (int var18 = 0; var18 < this.field1035; var18++) {
                int var19 = this.field1049[var18] + arg4;
                int var20 = this.field1064[var18] + arg6;
                int var21 = arg2.method2478(true, var20, var19);
                int var22 = arg3.method2478(true, var20, var19);
                int var23 = var21 - var22 - arg1;
                this.field1085[var18] = ((this.field1085[var18] << 8) / var17 * var23 >> 8) + var21 - arg5;
            }
        }
        if (this.field1060 != null) {
            this.field1060.field4148 = null;
        }
        this.field1012 = false;
    }

    @OriginalMember(owner = "client!qb", name = "VA", descriptor = "(I)V", line = 247)
    public final void method543(int arg0) {
        field1048++;
        int var2 = class253.field3634[arg0];
        int var3 = class253.field3633[arg0];
        for (int var4 = 0; var4 < this.field1035; var4++) {
            int var5 = this.field1085[var4] * var2 + this.field1049[var4] * var3 >> 14;
            this.field1085[var4] = this.field1085[var4] * var3 - (this.field1049[var4] * var2) >> 14;
            this.field1049[var4] = var5;
        }
        this.field1012 = false;
        if (this.field1060 != null) {
            this.field1060.field4148 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "()Z", line = 279)
    public final boolean method597() {
        field1020++;
        if (this.field1016 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field1016.length; var1++) {
            if (this.field1016[var1] != -1 && !this.field1103.field6447.method846(this.field1016[var1], true)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qb", name = "EA", descriptor = "()I", line = 308)
    public final int method541() {
        if (!this.field1012) {
            this.method662((byte) -94);
        }
        field1096++;
        return this.field1030;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ldm;Let;II)V", line = 321)
    public final void method546(class765 arg0, class749 arg1, int arg2, int arg3) {
        field1107++;
        if (this.field1109 == 0) {
            return;
        }
        class229 var5 = this.field1103.field8164;
        if (!this.field1012) {
            this.method662((byte) -110);
        }
        class229 var6 = (class229) arg0;
        class629.field8925 = var5.field3360 * var6.field3333 + var5.field3363 * var6.field3335 + var5.field3333 * var6.field3340;
        class259.field3677 = var5.field3360 * var6.field3325 + var5.field3363 * var6.field3327 + var5.field3333 * var6.field3365 + var5.field3325;
        float var7 = (float) this.field1045 * class629.field8925 + class259.field3677;
        float var8 = (float) this.field1030 * class629.field8925 + class259.field3677;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) (-this.field1015) + var8;
            var10 = (float) this.field1015 + var7;
        } else {
            var9 = var7 - (float) this.field1015;
            var10 = (float) this.field1015 + var8;
        }
        if ((var9 >= this.field1103.field8262) || (var10 <= (float) this.field1103.field8214)) {
            return;
        }
        class329.field4690 = var5.field3349 * var6.field3333 + var5.field3346 * var6.field3335 + var5.field3335 * var6.field3340;
        class86.field1285 = var5.field3349 * var6.field3325 + var5.field3346 * var6.field3327 + var5.field3335 * var6.field3365 + var5.field3327;
        float var11 = (float) this.field1045 * class329.field4690 + class86.field1285;
        float var12 = (float) this.field1030 * class329.field4690 + class86.field1285;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = (var12 - (float) this.field1015) * (float) this.field1103.field8237;
            var14 = ((float) this.field1015 + var11) * (float) this.field1103.field8237;
        } else {
            var13 = (var11 - (float) this.field1015) * (float) this.field1103.field8237;
            var14 = ((float) this.field1015 + var12) * (float) this.field1103.field8237;
        }
        if ((this.field1103.field8267 <= var13 / (float) arg2) || (this.field1103.field8256 >= var14 / (float) arg2)) {
            return;
        }
        class149.field2401 = var5.field3352 * var6.field3325 + var5.field3359 * var6.field3327 + var5.field3340 * var6.field3365 + var5.field3365;
        class161.field2491 = var5.field3352 * var6.field3333 + var5.field3359 * var6.field3335 + var5.field3340 * var6.field3340;
        float var15 = (float) this.field1045 * class161.field2491 + class149.field2401;
        float var16 = (float) this.field1030 * class161.field2491 + class149.field2401;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = (var16 - (float) this.field1015) * (float) this.field1103.field8204;
            var18 = ((float) this.field1015 + var15) * (float) this.field1103.field8204;
        } else {
            var18 = ((float) this.field1015 + var16) * (float) this.field1103.field8204;
            var17 = (var15 - (float) this.field1015) * (float) this.field1103.field8204;
        }
        if ((this.field1103.field8268 <= var17 / (float) arg2) || (this.field1103.field8247 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field1026 != null) {
            class692.field9755 = var5.field3352 * var6.field3360 + var5.field3359 * var6.field3349 + var5.field3340 * var6.field3352;
            class414.field5687 = var5.field3360 * var6.field3363 + var5.field3363 * var6.field3346 + var5.field3333 * var6.field3359;
            class14.field170 = var5.field3360 * var6.field3360 + var5.field3363 * var6.field3349 + var5.field3333 * var6.field3352;
            class67.field991 = var5.field3352 * var6.field3363 + var5.field3359 * var6.field3346 + var5.field3340 * var6.field3359;
            class481.field6605 = var5.field3349 * var6.field3363 + var5.field3346 * var6.field3346 + var5.field3335 * var6.field3359;
            class224.field3293 = var5.field3349 * var6.field3360 + var5.field3346 * var6.field3349 + var5.field3335 * var6.field3352;
        }
        if (arg1 != null) {
            int var19 = this.field1075 + this.field1014 >> 1;
            int var20 = this.field1070 + this.field1114 >> 1;
            int var21 = (int) ((float) var20 * class224.field3293 + (float) this.field1045 * class329.field4690 + (float) var19 * class481.field6605 + class86.field1285);
            int var22 = (int) ((float) var20 * class692.field9755 + (float) this.field1045 * class161.field2491 + (float) var19 * class67.field991 + class149.field2401);
            int var23 = (int) ((float) var20 * class14.field170 + (float) this.field1045 * class629.field8925 + (float) var19 * class414.field5687 + class259.field3677);
            int var24 = (int) ((float) var20 * class224.field3293 + (float) this.field1030 * class329.field4690 + (float) var19 * class481.field6605 + class86.field1285);
            int var25 = (int) ((float) var20 * class692.field9755 + (float) this.field1030 * class161.field2491 + (float) var19 * class67.field991 + class149.field2401);
            arg1.field10401 = this.field1103.field8204 * var25 / arg2 + this.field1103.field8177;
            arg1.field10403 = this.field1103.field8237 * var21 / arg2 + this.field1103.field8217;
            arg1.field10405 = this.field1103.field8204 * var22 / arg2 + this.field1103.field8177;
            arg1.field10402 = this.field1103.field8217 + (this.field1103.field8237 * var24 / arg2);
            int var26 = (int) ((float) var20 * class14.field170 + (float) this.field1030 * class629.field8925 + (float) var19 * class414.field5687 + class259.field3677);
            if (var23 >= this.field1103.field8214 || var26 >= this.field1103.field8214) {
                arg1.field10404 = true;
                arg1.field10400 = (this.field1015 + var21) * this.field1103.field8237 / arg2 + this.field1103.field8217 - arg1.field10403;
            }
        }
        this.field1103.method3319((float) arg2, true);
        this.field1103.method3360(22131);
        this.field1103.method3311(var6, 0);
        this.method663(-16833);
        this.field1103.method3310((byte) 82);
        this.method669(true);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[IIIIIZ)V", line = 472)
    public final void method577(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1034++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class368.field5211 = 0;
            int var12 = 0;
            class769.field10619 = 0;
            class133.field2233 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field1027.length > var14) {
                    int[] var15 = this.field1027[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class133.field2233 += this.field1049[var17];
                        class769.field10619 += this.field1085[var17];
                        class368.field5211 += this.field1064[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class368.field5211 = var10;
                class769.field10619 = var11;
                class133.field2233 = var9;
            } else {
                class133.field2233 = class133.field2233 / var12 + var9;
                class368.field5211 = class368.field5211 / var12 + var10;
                class769.field10619 = class769.field10619 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg2 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field1027.length > var22) {
                    int[] var23 = this.field1027[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field1049[var25] += var19;
                        this.field1085[var25] += var20;
                        this.field1064[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field1027.length > var45) {
                    int[] var46 = this.field1027[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field1049[var48] -= class133.field2233;
                            this.field1085[var48] -= class769.field10619;
                            this.field1064[var48] -= class368.field5211;
                            if (arg4 != 0) {
                                int var49 = class253.field3634[arg4];
                                int var50 = class253.field3633[arg4];
                                int var51 = this.field1085[var48] * var49 + this.field1049[var48] * var50 + 16383 >> 14;
                                this.field1085[var48] = this.field1085[var48] * var50 + 16383 - (this.field1049[var48] * var49) >> 14;
                                this.field1049[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class253.field3634[arg2];
                                int var53 = class253.field3633[arg2];
                                int var54 = this.field1085[var48] * var53 - (this.field1064[var48] * var52 - 16383) >> 14;
                                this.field1064[var48] = this.field1085[var48] * var52 + this.field1064[var48] * var53 + 16383 >> 14;
                                this.field1085[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class253.field3634[arg3];
                                int var56 = class253.field3633[arg3];
                                int var57 = this.field1064[var48] * var55 + this.field1049[var48] * var56 + 16383 >> 14;
                                this.field1064[var48] = this.field1064[var48] * var56 + 16383 - (this.field1049[var48] * var55) >> 14;
                                this.field1049[var48] = var57;
                            }
                            this.field1049[var48] += class133.field2233;
                            this.field1085[var48] += class769.field10619;
                            this.field1064[var48] += class368.field5211;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field1049[var59] -= class133.field2233;
                            this.field1085[var59] -= class769.field10619;
                            this.field1064[var59] -= class368.field5211;
                            if (arg2 != 0) {
                                int var60 = class253.field3634[arg2];
                                int var61 = class253.field3633[arg2];
                                int var62 = this.field1085[var59] * var61 + 16383 - (this.field1064[var59] * var60) >> 14;
                                this.field1064[var59] = this.field1085[var59] * var60 + this.field1064[var59] * var61 + 16383 >> 14;
                                this.field1085[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class253.field3634[arg4];
                                int var64 = class253.field3633[arg4];
                                int var65 = this.field1085[var59] * var63 + (this.field1049[var59] * var64) + 16383 >> 14;
                                this.field1085[var59] = this.field1085[var59] * var64 + 16383 - this.field1049[var59] * var63 >> 14;
                                this.field1049[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class253.field3634[arg3];
                                int var67 = class253.field3633[arg3];
                                int var68 = this.field1049[var59] * var67 + this.field1064[var59] * var66 + 16383 >> 14;
                                this.field1064[var59] = this.field1064[var59] * var67 + 16383 - this.field1049[var59] * var66 >> 14;
                                this.field1049[var59] = var68;
                            }
                            this.field1049[var59] += class133.field2233;
                            this.field1085[var59] += class769.field10619;
                            this.field1064[var59] += class368.field5211;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field1027.length > var28) {
                        int[] var29 = this.field1027[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field1058[var31];
                            int var33 = this.field1058[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field1023[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class253.field3634[arg4];
                                    int var37 = class253.field3633[arg4];
                                    int var38 = this.field1042[var35] * var36 + this.field1061[var35] * var37 + 16383 >> 14;
                                    this.field1042[var35] = (short) (this.field1042[var35] * var37 + 16383 - (this.field1061[var35] * var36) >> 14);
                                    this.field1061[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class253.field3634[arg2];
                                    int var40 = class253.field3633[arg2];
                                    int var41 = this.field1042[var35] * var40 + 16383 - (this.field1088[var35] * var39) >> 14;
                                    this.field1088[var35] = (short) (this.field1088[var35] * var40 + this.field1042[var35] * var39 + 16383 >> 14);
                                    this.field1042[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class253.field3634[arg3];
                                    int var43 = class253.field3633[arg3];
                                    int var44 = this.field1088[var35] * var42 + this.field1061[var35] * var43 + 16383 >> 14;
                                    this.field1088[var35] = (short) (this.field1088[var35] * var43 + 16383 - (this.field1061[var35] * var42) >> 14);
                                    this.field1061[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field1017 == null && this.field1063 != null) {
                    this.field1063.field4148 = null;
                }
                if (this.field1017 != null) {
                    this.field1017.field4148 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field1027.length) {
                    int[] var71 = this.field1027[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field1049[var73] -= class133.field2233;
                        this.field1085[var73] -= class769.field10619;
                        this.field1064[var73] -= class368.field5211;
                        this.field1049[var73] = this.field1049[var73] * arg2 >> 7;
                        this.field1085[var73] = this.field1085[var73] * arg3 >> 7;
                        this.field1064[var73] = this.field1064[var73] * arg4 >> 7;
                        this.field1049[var73] += class133.field2233;
                        this.field1085[var73] += class769.field10619;
                        this.field1064[var73] += class368.field5211;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1099 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field1099.length > var78) {
                        int[] var79 = this.field1099[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field1110[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field1110[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field1063 != null) {
                            this.field1063.field4148 = null;
                        }
                    }
                }
                if (this.field1026 != null) {
                    for (int var75 = 0; var75 < this.field1009; var75++) {
                        class615 var76 = this.field1026[var75];
                        class531 var77 = this.field1092[var75];
                        var77.field7394 = var77.field7394 & 0xFFFFFF | 255 - (this.field1110[var76.field8722] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1099 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field1099.length > var87) {
                        int[] var88 = this.field1099[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field1089[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3F5) >> 7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = var91 & 0x7F;
                            int var96 = var92 + arg2 & 0x3F;
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
                            this.field1089[var90] = (short) class694.method3895(class694.method3895(var94 << 7, var96 << 10), var97);
                        }
                        if (var88.length > 0 && this.field1063 != null) {
                            this.field1063.field4148 = null;
                        }
                    }
                }
                if (this.field1026 != null) {
                    for (int var84 = 0; var84 < this.field1009; var84++) {
                        class615 var85 = this.field1026[var84];
                        class531 var86 = this.field1092[var84];
                        var86.field7394 = class789.field10788[this.field1089[var85.field8722] & 0xFFFF] & 0xFFFFFF | var86.field7394 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field996 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field996.length) {
                        int[] var100 = this.field996[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class531 var102 = this.field1092[var100[var101]];
                            var102.field7398 += arg3;
                            var102.field7392 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field996 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field996.length) {
                        int[] var105 = this.field996[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class531 var107 = this.field1092[var105[var106]];
                            var107.field7400 = var107.field7400 * arg2 >> 7;
                            var107.field7389 = var107.field7389 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field996 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field996.length > var109) {
                    int[] var110 = this.field996[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class531 var112 = this.field1092[var110[var111]];
                        var112.field7396 = var112.field7396 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "RA", descriptor = "()I", line = 1130)
    public final int method527() {
        field1098++;
        if (!this.field1012) {
            this.method662((byte) -85);
        }
        return this.field1014;
    }

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "(III)V", line = 1143)
    public final void method568(int arg0, int arg1, int arg2) {
        field1066++;
        for (int var4 = 0; var4 < this.field1035; var4++) {
            if (arg0 != 0) {
                this.field1049[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field1085[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field1064[var4] += arg2;
            }
        }
        if (this.field1060 != null) {
            this.field1060.field4148 = null;
        }
        this.field1012 = false;
    }

    @OriginalMember(owner = "client!qb", name = "ia", descriptor = "(SS)V", line = 1177)
    public final void method563(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1024; var3++) {
            if (this.field1089[var3] == arg0) {
                this.field1089[var3] = arg1;
            }
        }
        field1055++;
        if (this.field1026 != null) {
            for (int var4 = 0; var4 < this.field1009; var4++) {
                class615 var5 = this.field1026[var4];
                class531 var6 = this.field1092[var4];
                var6.field7394 = var6.field7394 & 0xFF000000 | class789.field10788[this.field1089[var5.field8722] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1063 != null) {
            this.field1063.field4148 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 1224)
    private final void method658(int arg0) {
        if (arg0 != -19077) {
            this.field1075 = 82;
        }
        field1057++;
        if (!this.field1051) {
            return;
        }
        this.field1051 = false;
        if (this.field1113 == null && this.field1008 == null && this.field1026 == null) {
            if (this.field1049 != null && !class167.method1241(true, this.field1011, this.field1037)) {
                if (this.field1060 != null && this.field1060.field4148 == null) {
                    this.field1051 = true;
                } else {
                    if (!this.field1012) {
                        this.method662((byte) -95);
                    }
                    this.field1049 = null;
                }
            }
            if (this.field1085 != null && !class386.method2323(this.field1037, (byte) -86, this.field1011)) {
                if (this.field1060 != null && this.field1060.field4148 == null) {
                    this.field1051 = true;
                } else {
                    if (!this.field1012) {
                        this.method662((byte) -101);
                    }
                    this.field1085 = null;
                }
            }
            if (this.field1064 != null && !class79.method701(arg0 ^ 0x4A84, this.field1011, this.field1037)) {
                if (this.field1060 != null && this.field1060.field4148 == null) {
                    this.field1051 = true;
                } else {
                    if (!this.field1012) {
                        this.method662((byte) -95);
                    }
                    this.field1064 = null;
                }
            }
        }
        if (this.field1023 != null && this.field1049 == null && this.field1085 == null && this.field1064 == null) {
            this.field1058 = null;
            this.field1023 = null;
        }
        if (this.field1025 != null && !class216.method1483(-1, this.field1037, this.field1011)) {
            if (this.field1017 == null) {
                if (this.field1063 != null && this.field1063.field4148 == null) {
                    this.field1051 = true;
                } else {
                    this.field1061 = this.field1042 = this.field1088 = null;
                    this.field1025 = null;
                }
            } else if (this.field1017.field4148 == null) {
                this.field1051 = true;
            } else {
                this.field1061 = this.field1042 = this.field1088 = null;
                this.field1025 = null;
            }
        }
        if (this.field1089 != null && !class631.method3605(this.field1037, this.field1011, 0)) {
            if (this.field1063 != null && this.field1063.field4148 == null) {
                this.field1051 = true;
            } else {
                this.field1089 = null;
            }
        }
        if (this.field1110 != null && !class558.method3254((byte) 27, this.field1011, this.field1037)) {
            if (this.field1063 != null && this.field1063.field4148 == null) {
                this.field1051 = true;
            } else {
                this.field1110 = null;
            }
        }
        if (this.field1087 != null && !class191.method1368(this.field1037, arg0 ^ 0x6BFB, this.field1011)) {
            if (this.field1041 != null && this.field1041.field4148 == null) {
                this.field1051 = true;
            } else {
                this.field1087 = this.field1013 = null;
            }
        }
        if (this.field1016 != null && !class104.method851(this.field1037, this.field1011, -1)) {
            if (this.field1063 != null && this.field1063.field4148 == null) {
                this.field1051 = true;
            } else {
                this.field1016 = null;
            }
        }
        if (this.field1033 != null && !class47.method365(this.field1037, this.field1011, (byte) 102)) {
            if ((this.field1111 == null || this.field1111.field455 != null) && (this.field1063 == null || this.field1063.field4148 != null)) {
                this.field1033 = this.field1043 = this.field1000 = null;
            } else {
                this.field1051 = true;
            }
        }
        if (this.field1099 != null && !class246.method1639(this.field1011, this.field1037, -116)) {
            this.field1099 = null;
            this.field1022 = null;
        }
        if (this.field1027 != null && !class104.method850(this.field1037, this.field1011, 32)) {
            this.field1038 = null;
            this.field1027 = null;
        }
        if (this.field996 != null && !class421.method2486(this.field1011, false, this.field1037)) {
            this.field996 = null;
        }
        if (this.field1071 != null && (this.field1037 & 0x800) == 0 && (this.field1037 & 0x40000) == 0) {
            this.field1071 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lkw;B)V", line = 1399)
    private final void method659(class9 arg0, byte arg1) {
        field1082++;
        if (arg1 > -32) {
            this.field1094 = null;
        }
        if (this.field1109 > this.field1103.field8283.length) {
            this.field1103.field8284 = new int[this.field1109];
            this.field1103.field8283 = new int[this.field1109];
        }
        int[] var3 = this.field1103.field8283;
        int[] var4 = this.field1103.field8284;
        for (int var5 = 0; var5 < this.field1035; var5++) {
            int var16 = (this.field1049[var5] - (this.field1085[var5] * this.field1103.field8221 >> 8) >> this.field1103.field8134) - arg0.field132;
            int var17 = (this.field1064[var5] - (this.field1085[var5] * this.field1103.field8205 >> 8) >> this.field1103.field8134) - arg0.field131;
            int var18 = this.field1058[var5];
            int var19 = this.field1058[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field1023[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field1093; var6++) {
            if (this.field1110 == null || this.field1110[var6] <= 128) {
                short var7 = this.field1033[var6];
                short var8 = this.field1043[var6];
                short var9 = this.field1000[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg0.method148(var14, var13, var12, var10, 0, var15, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "()V", line = 1490)
    public final void method562() {
        field1084++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZIIIIIII)Z", line = 1501)
    public static final boolean method660(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1007++;
        if (arg0 + arg4 <= arg7 || (arg7 + arg8) <= arg0) {
            return false;
        } else if (arg1) {
            return arg2 + arg5 > arg3 && (arg3 + arg6) > arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "()Z", line = 1520)
    public final boolean method558() {
        field1052++;
        return this.field1095;
    }

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "(III)V", line = 1533)
    public final void method564(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1035; var4++) {
            if (arg0 != 128) {
                this.field1049[var4] = this.field1049[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field1085[var4] = this.field1085[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field1064[var4] = this.field1064[var4] * arg2 >> 7;
            }
        }
        field1077++;
        if (this.field1060 != null) {
            this.field1060.field4148 = null;
        }
        this.field1012 = false;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIBSB)I", line = 1567)
    private final int method661(int arg0, int arg1, byte arg2, short arg3, byte arg4) {
        field1090++;
        int var6 = class789.field10788[class301.method1876(arg0, 23738, arg1)];
        if (arg4 != -76) {
            this.method583();
        }
        if (arg3 != -1) {
            class719 var7 = this.field1103.field6447.method847(arg3 & 0xFFFF, arg4 - 50);
            int var8 = var7.field10046 & 0xFF;
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
                    var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var9 & 0xFF00) * var8 + ((var6 & 0xFF00) * var11) & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field10043 & 0xFF;
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
                var6 = (var15 >> 8) + ((var13 & 0x5600FF00) << 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg2 & 0xFF);
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "()[Lgfa;", line = 1641)
    public final class740[] method588() {
        field999++;
        return this.field1008;
    }

    @OriginalMember(owner = "client!qb", name = "NA", descriptor = "()Z", line = 1650)
    public final boolean method526() {
        field1036++;
        if (this.field1027 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field1006; var1++) {
            this.field1049[var1] <<= 0x4;
            this.field1085[var1] <<= 0x4;
            this.field1064[var1] <<= 0x4;
        }
        class368.field5211 = 0;
        class133.field2233 = 0;
        class769.field10619 = 0;
        return true;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Llea;)V", line = 5798)
    public class68(class573 arg0) {
        this.field1103 = arg0;
        this.field1060 = new class282(null, 5126, 3, 0);
        this.field1041 = new class282(null, 5126, 2, 0);
        this.field1017 = new class282(null, 5126, 3, 0);
        this.field1063 = new class282(null, 5121, 4, 0);
        this.field1111 = new class39();
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Llea;Lida;IIII)V", line = 5816)
    public class68(class573 arg0, class678 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1103 = arg0;
        this.field1037 = arg2;
        this.field1011 = arg5;
        if (class18.method177(62, arg5, arg2)) {
            this.field1060 = new class282(null, 5126, 3, 0);
        }
        if (class527.method3084(arg2, 5616, arg5)) {
            this.field1041 = new class282(null, 5126, 2, 0);
        }
        if (class453.method2662(arg2, (byte) -45, arg5)) {
            this.field1017 = new class282(null, 5126, 3, 0);
        }
        if (class533.method3100(2048, arg5, arg2)) {
            this.field1063 = new class282(null, 5121, 4, 0);
        }
        if (class562.method3277(arg2, arg5, (byte) -30)) {
            this.field1111 = new class39();
        }
        class103 var7 = arg0.field6447;
        int[] var8 = new int[arg1.field9569];
        this.field1058 = new int[arg1.field9587 + 1];
        for (int var9 = 0; var9 < arg1.field9569; var9++) {
            if (arg1.field9542 == null || arg1.field9542[var9] != 2) {
                if (arg1.field9570 != null && arg1.field9570[var9] != -1) {
                    class719 var173 = var7.method847(arg1.field9570[var9] & 0xFFFF, -119);
                    if (((this.field1011 & 0x40) == 0 || !var173.field10029) && var173.field10033) {
                        continue;
                    }
                }
                var8[this.field1024++] = var9;
                this.field1058[arg1.field9582[var9]]++;
                this.field1058[arg1.field9586[var9]]++;
                this.field1058[arg1.field9557[var9]]++;
            }
        }
        this.field1093 = this.field1024;
        long[] var10 = new long[this.field1024];
        boolean var11 = (this.field1037 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field1024; var12++) {
            int var156 = var8[var12];
            class719 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field9583 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field9583.length; var163++) {
                    class143 var164 = arg1.field9583[var163];
                    if (var164.field2329 == var156) {
                        class480 var165 = class639.method3631(0, var164.field2328);
                        if (var165.field6602) {
                            var162 = true;
                        }
                        if (var165.field6594 != -1) {
                            class719 var166 = var7.method847(var165.field6594, -127);
                            if (var166.field10042 == 2) {
                                this.field1095 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field1093--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field9570 != null) {
                var167 = arg1.field9570[var156];
                if (var167 != -1) {
                    var157 = var7.method847(var167 & 0xFFFF, -105);
                    if ((this.field1011 & 0x40) != 0 && var157.field10029) {
                        var167 = -1;
                        var157 = null;
                    } else {
                        var161 = var157.field10036;
                        if (var157.field10028 != 0 || var157.field10038 != 0) {
                            this.field1065 = true;
                        }
                        var160 = var157.field10031;
                    }
                }
            }
            boolean var168 = arg1.field9559 != null && arg1.field9559[var156] != 0 || var157 != null && var157.field10042 != 0;
            if ((var11 || var168) && arg1.field9575 != null) {
                var158 += arg1.field9575[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = (var160 & 0xFF << 8) + var158;
            int var170 = (var161 & 0xFF) + var169;
            int var171 = ((var167 & 0xFFFF) << 16) + var159;
            int var172 = (var12 & 0xFFFF) + var171;
            var10[var12] = ((long) var170 << 32) + (long) var172;
            this.field1095 |= var168;
            this.field1065 |= var157 != null && (var157.field10028 != 0 || var157.field10038 != 0);
        }
        class739.method4072(var10, var8, (byte) -110);
        this.field1038 = arg1.field9563;
        this.field1085 = arg1.field9580;
        this.field1049 = arg1.field9561;
        this.field1035 = arg1.field9587;
        this.field1006 = arg1.field9551;
        this.field1064 = arg1.field9584;
        this.field1008 = arg1.field9553;
        class445[] var13 = new class445[this.field1035];
        this.field1113 = arg1.field9556;
        if (arg1.field9583 != null) {
            this.field1009 = arg1.field9583.length;
            this.field1092 = new class531[this.field1009];
            this.field1026 = new class615[this.field1009];
            for (int var14 = 0; var14 < this.field1009; var14++) {
                class143 var15 = arg1.field9583[var14];
                class480 var16 = class639.method3631(0, var15.field2328);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field1024; var18++) {
                    if (var8[var18] == var15.field2329) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class789.field10788[arg1.field9581[var15.field2329] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field9559 == null ? 0 : arg1.field9559[var15.field2329]) << 24;
                this.field1026[var14] = new class615(var17, arg1.field9582[var15.field2329], arg1.field9586[var15.field2329], arg1.field9557[var15.field2329], var16.field6596, var16.field6597, var16.field6594, var16.field6595, var16.field6600, var16.field6602, var16.field6603, var15.field2330);
                this.field1092[var14] = new class531(var20);
            }
        }
        int var21 = this.field1024 * 3;
        this.field1016 = new short[this.field1024];
        this.field1088 = new short[var21];
        if (arg1.field9590 != null) {
            this.field1022 = new short[this.field1024];
        }
        class645.field9174 = new long[var21];
        this.field1097 = (short) arg4;
        this.field1042 = new short[var21];
        this.field1043 = new short[this.field1024];
        this.field1013 = new float[var21];
        this.field1089 = new short[this.field1024];
        this.field1101 = (short) arg3;
        this.field1025 = new byte[var21];
        this.field1061 = new short[var21];
        this.field1110 = new byte[this.field1024];
        this.field1000 = new short[this.field1024];
        this.field1033 = new short[this.field1024];
        this.field1087 = new float[var21];
        this.field1023 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field9587; var23++) {
            int var155 = this.field1058[var23];
            this.field1058[var23] = var22;
            var13[var23] = new class445();
            var22 += var155;
        }
        this.field1058[arg1.field9587] = var22;
        class741 var24 = class345.method2109(-3, this.field1024, arg1, var8);
        class365[] var25 = new class365[arg1.field9569];
        for (int var26 = 0; var26 < arg1.field9569; var26++) {
            short var134 = arg1.field9582[var26];
            short var135 = arg1.field9586[var26];
            short var136 = arg1.field9557[var26];
            int var137 = this.field1049[var135] - this.field1049[var134];
            int var138 = this.field1085[var135] - this.field1085[var134];
            int var139 = this.field1064[var135] - this.field1064[var134];
            int var140 = this.field1049[var136] - this.field1049[var134];
            int var141 = this.field1085[var136] - this.field1085[var134];
            int var142 = this.field1064[var136] - this.field1064[var134];
            int var143 = var138 * var142 - (var139 * var141);
            int var144 = var139 * var140 - (var137 * var142);
            int var145 = var137 * var141 - (var138 * var140);
            while (var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192) {
                var143 >>= 0x1;
                var145 >>= 0x1;
                var144 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var145 * var145 + var143 * var143 + var144 * var144));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var144 * 256 / var146;
            int var148 = var145 * 256 / var146;
            int var149 = var143 * 256 / var146;
            byte var150 = arg1.field9542 == null ? 0 : arg1.field9542[var26];
            if (var150 == 0) {
                class445 var151 = var13[var134];
                var151.field6152 += var147;
                var151.field6149++;
                var151.field6157 += var149;
                var151.field6153 += var148;
                class445 var152 = var13[var135];
                var152.field6152 += var147;
                var152.field6157 += var149;
                var152.field6149++;
                var152.field6153 += var148;
                class445 var153 = var13[var136];
                var153.field6149++;
                var153.field6153 += var148;
                var153.field6157 += var149;
                var153.field6152 += var147;
            } else if (var150 == 1) {
                class365 var154 = var25[var26] = new class365();
                var154.field5182 = var147;
                var154.field5183 = var149;
                var154.field5180 = var148;
            }
        }
        for (int var27 = 0; var27 < this.field1024; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field9581[var43] & 0xFFFF;
            int var45;
            if (arg1.field9578 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field9578[var43];
            }
            int var46;
            if (arg1.field9559 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field9559[var43] & 0xFF;
            }
            short var47 = arg1.field9570 == null ? -1 : arg1.field9570[var43];
            if (var47 != -1 && (this.field1011 & 0x40) != 0) {
                class719 var48 = var7.method847(var47 & 0xFFFF, -126);
                if (var48.field10029) {
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
                    var50 = 1.0F;
                    var49 = 0.0F;
                    var54 = 0.0F;
                    var52 = 1.0F;
                    var55 = 1;
                    var51 = 1.0F;
                    var56 = 2;
                    var53 = 0.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field9554[var45];
                    if (var58 == 0) {
                        short var87 = arg1.field9582[var43];
                        short var88 = arg1.field9586[var43];
                        short var89 = arg1.field9557[var43];
                        short var90 = arg1.field9552[var45];
                        short var91 = arg1.field9543[var45];
                        short var92 = arg1.field9546[var45];
                        float var93 = (float) arg1.field9561[var90];
                        float var94 = (float) arg1.field9580[var90];
                        float var95 = (float) arg1.field9584[var90];
                        float var96 = (float) arg1.field9561[var91] - var93;
                        float var97 = (float) arg1.field9580[var91] - var94;
                        float var98 = (float) arg1.field9584[var91] - var95;
                        float var99 = (float) arg1.field9561[var92] - var93;
                        float var100 = (float) arg1.field9580[var92] - var94;
                        float var101 = (float) arg1.field9584[var92] - var95;
                        float var102 = (float) arg1.field9561[var87] - var93;
                        float var103 = (float) arg1.field9580[var87] - var94;
                        float var104 = (float) arg1.field9584[var87] - var95;
                        float var105 = (float) arg1.field9561[var88] - var93;
                        float var106 = (float) arg1.field9580[var88] - var94;
                        float var107 = (float) arg1.field9584[var88] - var95;
                        float var108 = (float) arg1.field9561[var89] - var93;
                        float var109 = (float) arg1.field9580[var89] - var94;
                        float var110 = (float) arg1.field9584[var89] - var95;
                        float var111 = var97 * var101 - (var98 * var100);
                        float var112 = var98 * var99 - var96 * var101;
                        float var113 = var96 * var100 - (var97 * var99);
                        float var114 = var100 * var113 - (var101 * var112);
                        float var115 = var101 * var111 - (var99 * var113);
                        float var116 = var99 * var112 - (var100 * var111);
                        float var117 = 1.0F / (var98 * var116 + var96 * var114 + var97 * var115);
                        var53 = (var110 * var116 + var108 * var114 + var109 * var115) * var117;
                        var49 = (var104 * var116 + var102 * var114 + var103 * var115) * var117;
                        var51 = (var107 * var116 + var105 * var114 + var106 * var115) * var117;
                        float var118 = var97 * var113 - (var98 * var112);
                        float var119 = var96 * var112 - (var97 * var111);
                        float var120 = var98 * var111 - var96 * var113;
                        float var121 = 1.0F / (var101 * var119 + var99 * var118 + var100 * var120);
                        var50 = (var104 * var119 + var102 * var118 + var103 * var120) * var121;
                        var52 = (var107 * var119 + var105 * var118 + var106 * var120) * var121;
                        var54 = (var110 * var119 + var108 * var118 + var109 * var120) * var121;
                    } else {
                        short var59 = arg1.field9582[var43];
                        short var60 = arg1.field9586[var43];
                        short var61 = arg1.field9557[var43];
                        int var62 = var24.field10256[var45];
                        int var63 = var24.field10257[var45];
                        int var64 = var24.field10262[var45];
                        float[] var65 = var24.field10258[var45];
                        byte var66 = arg1.field9555[var45];
                        float var67 = (float) arg1.field9550[var45] / 256.0F;
                        if (var58 == 1) {
                            float var85 = (float) arg1.field9558[var45] / 1024.0F;
                            class451.method2652(arg1.field9580[var59], arg1.field9561[var59], arg1.field9584[var59], class778.field10673, var63, (byte) -115, var67, var66, var65, var64, var85, var62);
                            var50 = class778.field10673[1];
                            var49 = class778.field10673[0];
                            class451.method2652(arg1.field9580[var60], arg1.field9561[var60], arg1.field9584[var60], class778.field10673, var63, (byte) -82, var67, var66, var65, var64, var85, var62);
                            var52 = class778.field10673[1];
                            var51 = class778.field10673[0];
                            class451.method2652(arg1.field9580[var61], arg1.field9561[var61], arg1.field9584[var61], class778.field10673, var63, (byte) -78, var67, var66, var65, var64, var85, var62);
                            var53 = class778.field10673[0];
                            var54 = class778.field10673[1];
                            float var86 = var85 / 2.0F;
                            if ((var66 & 0x1) == 0) {
                                if (var51 - var49 > var86) {
                                    var55 = 1;
                                    var51 -= var85;
                                } else if (var86 < var49 - var51) {
                                    var55 = 2;
                                    var51 += var85;
                                }
                                if ((var86 < var53 - var49)) {
                                    var56 = 1;
                                    var53 -= var85;
                                } else if (var49 - var53 > var86) {
                                    var56 = 2;
                                    var53 += var85;
                                }
                            } else {
                                if (var54 - var50 > var86) {
                                    var54 -= var85;
                                    var56 = 1;
                                } else if (var50 - var54 > var86) {
                                    var54 += var85;
                                    var56 = 2;
                                }
                                if ((var86 < var52 - var50)) {
                                    var52 -= var85;
                                    var55 = 1;
                                } else if (var50 - var52 > var86) {
                                    var52 += var85;
                                    var55 = 2;
                                }
                            }
                        } else if (var58 == 2) {
                            float var68 = (float) arg1.field9576[var45] / 256.0F;
                            float var69 = (float) arg1.field9562[var45] / 256.0F;
                            int var70 = arg1.field9561[var60] - arg1.field9561[var59];
                            int var71 = arg1.field9580[var60] - arg1.field9580[var59];
                            int var72 = arg1.field9584[var60] - arg1.field9584[var59];
                            int var73 = arg1.field9561[var61] - arg1.field9561[var59];
                            int var74 = arg1.field9580[var61] - arg1.field9580[var59];
                            int var75 = arg1.field9584[var61] - arg1.field9584[var59];
                            int var76 = var71 * var75 - (var72 * var74);
                            int var77 = var72 * var73 - (var70 * var75);
                            int var78 = var70 * var74 - (var71 * var73);
                            float var79 = 64.0F / (float) arg1.field9568[var45];
                            float var80 = 64.0F / (float) arg1.field9589[var45];
                            float var81 = 64.0F / (float) arg1.field9558[var45];
                            float var82 = (var65[2] * (float) var78 + var65[0] * (float) var76 + var65[1] * (float) var77) / var79;
                            float var83 = (var65[5] * (float) var78 + var65[4] * (float) var77 + var65[3] * (float) var76) / var80;
                            float var84 = (var65[8] * (float) var78 + var65[7] * (float) var77 + var65[6] * (float) var76) / var81;
                            var57 = class151.method1188(var83, 0, var84, var82);
                            class585.method3433(arg1.field9561[var59], var65, var64, arg1.field9584[var59], var67, var63, var66, var69, (byte) -116, var57, var62, var68, class778.field10673, arg1.field9580[var59]);
                            var49 = class778.field10673[0];
                            var50 = class778.field10673[1];
                            class585.method3433(arg1.field9561[var60], var65, var64, arg1.field9584[var60], var67, var63, var66, var69, (byte) -111, var57, var62, var68, class778.field10673, arg1.field9580[var60]);
                            var52 = class778.field10673[1];
                            var51 = class778.field10673[0];
                            class585.method3433(arg1.field9561[var61], var65, var64, arg1.field9584[var61], var67, var63, var66, var69, (byte) -98, var57, var62, var68, class778.field10673, arg1.field9580[var61]);
                            var54 = class778.field10673[1];
                            var53 = class778.field10673[0];
                        } else if (var58 == 3) {
                            class43.method326(var66, var67, (byte) -118, arg1.field9584[var59], class778.field10673, arg1.field9580[var59], var63, arg1.field9561[var59], var65, var64, var62);
                            var49 = class778.field10673[0];
                            var50 = class778.field10673[1];
                            class43.method326(var66, var67, (byte) 39, arg1.field9584[var60], class778.field10673, arg1.field9580[var60], var63, arg1.field9561[var60], var65, var64, var62);
                            var51 = class778.field10673[0];
                            var52 = class778.field10673[1];
                            class43.method326(var66, var67, (byte) -103, arg1.field9584[var61], class778.field10673, arg1.field9580[var61], var63, arg1.field9561[var61], var65, var64, var62);
                            var54 = class778.field10673[1];
                            var53 = class778.field10673[0];
                            if ((var66 & 0x1) == 0) {
                                if (var51 - var49 > 0.5F) {
                                    var51--;
                                    var55 = 1;
                                } else if (var49 - var51 > 0.5F) {
                                    var51++;
                                    var55 = 2;
                                }
                                if ((var53 - var49 > 0.5F)) {
                                    var56 = 1;
                                    var53--;
                                } else if (var49 - var53 > 0.5F) {
                                    var56 = 2;
                                    var53++;
                                }
                            } else {
                                if (var54 - var50 > 0.5F) {
                                    var56 = 1;
                                    var54--;
                                } else if (var50 - var54 > 0.5F) {
                                    var56 = 2;
                                    var54++;
                                }
                                if ((var52 - var50 > 0.5F)) {
                                    var55 = 1;
                                    var52--;
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
            if (arg1.field9542 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field9542[var43];
            }
            if (var122 == 0) {
                long var123 = ((long) (var44 << 8) + (long) (var57 << 24) + ((long) var46) << 32) + (long) (var45 << 2);
                short var125 = arg1.field9582[var43];
                short var126 = arg1.field9586[var43];
                short var127 = arg1.field9557[var43];
                class445 var128 = var13[var125];
                this.field1033[var27] = this.method670(var128.field6149, var125, var128.field6152, arg1, var128.field6153, 1060572487, var50, var128.field6157, var123, var49);
                class445 var129 = var13[var126];
                this.field1043[var27] = this.method670(var129.field6149, var126, var129.field6152, arg1, var129.field6153, 1060572487, var52, var129.field6157, (long) var55 + var123, var51);
                class445 var130 = var13[var127];
                this.field1000[var27] = this.method670(var130.field6149, var127, var130.field6152, arg1, var130.field6153, 1060572487, var54, var130.field6157, (long) var56 + var123, var53);
            } else if (var122 == 1) {
                class365 var131 = var25[var43];
                long var132 = (long) ((var131.field5182 + 256 << 12) + (var45 << 2) + (var131.field5183 <= 0 ? 2048 : 1024) + (var131.field5180 + 256 << 22)) + ((long) (var44 << 8) + (long) (var57 << 24) + ((long) var46) << 32);
                this.field1033[var27] = this.method670(0, arg1.field9582[var43], var131.field5182, arg1, var131.field5180, 1060572487, var50, var131.field5183, var132, var49);
                this.field1043[var27] = this.method670(0, arg1.field9586[var43], var131.field5182, arg1, var131.field5180, 1060572487, var52, var131.field5183, (long) var55 + var132, var51);
                this.field1000[var27] = this.method670(0, arg1.field9557[var43], var131.field5182, arg1, var131.field5180, 1060572487, var54, var131.field5183, (long) var56 + var132, var53);
            }
            if (arg1.field9559 != null) {
                this.field1110[var27] = arg1.field9559[var43];
            }
            if (arg1.field9590 != null) {
                this.field1022[var27] = arg1.field9590[var43];
            }
            this.field1089[var27] = arg1.field9581[var43];
            this.field1016[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field1093; var30++) {
            short var42 = this.field1016[var30];
            if (var29 != var42) {
                var28++;
                var29 = var42;
            }
        }
        this.field1071 = new int[var28 + 1];
        int var31 = 0;
        short var32 = -10000;
        for (int var33 = 0; var33 < this.field1093; var33++) {
            short var41 = this.field1016[var33];
            if (var32 != var41) {
                this.field1071[var31++] = var33;
                var32 = var41;
            }
        }
        this.field1071[var31] = this.field1093;
        class645.field9174 = null;
        this.field1061 = class688.method3882(this.field1109, -115, this.field1061);
        this.field1042 = class688.method3882(this.field1109, -10, this.field1042);
        this.field1088 = class688.method3882(this.field1109, -47, this.field1088);
        this.field1025 = class454.method2667(this.field1109, Integer.MAX_VALUE, this.field1025);
        this.field1087 = class722.method4013(this.field1109, this.field1087, (byte) -66);
        this.field1013 = class722.method4013(this.field1109, this.field1013, (byte) -103);
        if (arg1.field9545 != null && class104.method850(arg2, this.field1011, 32)) {
            this.field1027 = arg1.method3812(false, (byte) -61);
        }
        if (arg1.field9583 != null && class421.method2486(this.field1011, false, arg2)) {
            this.field996 = arg1.method3800(true);
        }
        if (arg1.field9573 != null && class246.method1639(this.field1011, arg2, -113)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field1024; var36++) {
                int var40 = arg1.field9573[var8[var36]];
                if (var40 >= 0) {
                    int var10002 = var35[var40]++;
                    if (var34 < var40) {
                        var34 = var40;
                    }
                }
            }
            this.field1099 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field1099[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field1024; var38++) {
                int var39 = arg1.field9573[var8[var38]];
                if (var39 >= 0) {
                    this.field1099[var39][var35[var39]++] = var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V", line = 1683)
    private final void method662(byte arg0) {
        field1067++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        if (arg0 > -71) {
            this.method661(5, 70, (byte) -15, (short) -118, (byte) 124);
        }
        for (int var10 = 0; var10 < this.field1035; var10++) {
            int var11 = this.field1049[var10];
            int var12 = this.field1085[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            int var13 = this.field1064[var10];
            if (var11 > var5) {
                var5 = var11;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field1114 = (short) var7;
        this.field1070 = (short) var4;
        this.field1075 = (short) var2;
        this.field1030 = (short) var6;
        this.field1045 = (short) var3;
        this.field1014 = (short) var5;
        this.field1015 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field1029 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field1012 = true;
    }

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "()V", line = 1768)
    public final void method576() {
        field1010++;
        for (int var1 = 0; var1 < this.field1035; var1++) {
            this.field1064[var1] = -this.field1064[var1];
        }
        for (int var2 = 0; var2 < this.field1109; var2++) {
            this.field1088[var2] = (short) (-this.field1088[var2]);
        }
        for (int var3 = 0; var3 < this.field1024; var3++) {
            short var4 = this.field1033[var3];
            this.field1033[var3] = this.field1000[var3];
            this.field1000[var3] = var4;
        }
        if (this.field1017 == null && this.field1063 != null) {
            this.field1063.field4148 = null;
        }
        if (this.field1017 != null) {
            this.field1017.field4148 = null;
        }
        if (this.field1111 != null) {
            this.field1111.field455 = null;
        }
        this.field1012 = false;
        if (this.field1060 != null) {
            this.field1060.field4148 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "()I", line = 1819)
    public final int method566() {
        if (!this.field1012) {
            this.method662((byte) -92);
        }
        field1073++;
        return this.field1075;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lka;IIIZ)V", line = 1835)
    public final void method559(class233 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1062++;
        class68 var6 = (class68) arg0;
        if (this.field1024 == 0 || var6.field1024 == 0) {
            return;
        }
        int var7 = var6.field1035;
        int[] var8 = var6.field1049;
        int[] var9 = var6.field1085;
        int[] var10 = var6.field1064;
        short[] var11 = var6.field1061;
        short[] var12 = var6.field1042;
        short[] var13 = var6.field1088;
        byte[] var14 = var6.field1025;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field1032 == null) {
            var16 = null;
            var18 = null;
            var15 = null;
            var17 = null;
        } else {
            var15 = this.field1032.field2514;
            var16 = this.field1032.field2513;
            var17 = this.field1032.field2510;
            var18 = this.field1032.field2515;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field1032 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field1032.field2510;
            var22 = var6.field1032.field2515;
            var20 = var6.field1032.field2513;
            var21 = var6.field1032.field2514;
        }
        int[] var23 = var6.field1058;
        short[] var24 = var6.field1023;
        if (!var6.field1012) {
            var6.method662((byte) -97);
        }
        short var25 = var6.field1045;
        short var26 = var6.field1030;
        short var27 = var6.field1075;
        short var28 = var6.field1014;
        short var29 = var6.field1070;
        short var30 = var6.field1114;
        for (int var31 = 0; var31 < this.field1035; var31++) {
            int var32 = this.field1085[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field1049[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field1064[var31] - arg3;
                    if (var29 <= var34 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field1058[var31];
                        int var37 = this.field1058[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1023[var38] - 1;
                            if (var35 == -1 || this.field1025[var35] != 0) {
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
                                        if (var17 == null) {
                                            this.field1032 = new class164();
                                            var17 = this.field1032.field2510 = class259.method1686((byte) 110, this.field1061);
                                            var18 = this.field1032.field2515 = class259.method1686((byte) 105, this.field1042);
                                            var16 = this.field1032.field2513 = class259.method1686((byte) -103, this.field1088);
                                            var15 = this.field1032.field2514 = class442.method2619((byte) 100, this.field1025);
                                        }
                                        if (var19 == null) {
                                            class164 var44 = var6.field1032 = new class164();
                                            var19 = var44.field2510 = class259.method1686((byte) 89, var11);
                                            var22 = var44.field2515 = class259.method1686((byte) 91, var12);
                                            var20 = var44.field2513 = class259.method1686((byte) 94, var13);
                                            var21 = var44.field2514 = class442.method2619((byte) 100, var14);
                                        }
                                        short var45 = this.field1061[var35];
                                        short var46 = this.field1042[var35];
                                        short var47 = this.field1088[var35];
                                        byte var48 = this.field1025[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var19[var52] += var45;
                                                var22[var52] += var46;
                                                var20[var52] += var47;
                                                var21[var52] += var48;
                                            }
                                        }
                                        byte var53 = var14[var42];
                                        int var54 = this.field1058[var31 + 1];
                                        short var55 = var12[var42];
                                        short var56 = var13[var42];
                                        int var57 = this.field1058[var31];
                                        short var58 = var11[var42];
                                        for (int var59 = var57; var59 < var54; var59++) {
                                            int var60 = this.field1023[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var17[var60] += var58;
                                                var18[var60] += var55;
                                                var16[var60] += var56;
                                                var15[var60] += var53;
                                            }
                                        }
                                        if (this.field1017 == null && this.field1063 != null) {
                                            this.field1063.field4148 = null;
                                        }
                                        if (this.field1017 != null) {
                                            this.field1017.field4148 = null;
                                        }
                                        if (var6.field1017 == null && var6.field1063 != null) {
                                            var6.field1063.field4148 = null;
                                        }
                                        if (var6.field1017 != null) {
                                            var6.field1017.field4148 = null;
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

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V", line = 2097)
    private final void method663(int arg0) {
        field1047++;
        if (this.field1093 == 0) {
            return;
        }
        if (this.field993 != 0) {
            this.method672(7, true);
        }
        if (arg0 != -16833) {
            this.field1038 = null;
        }
        this.method672(7, false);
        if (this.field1111 != null) {
            if (this.field1111.field455 == null) {
                this.method668(false, (this.field993 & 0x10) != 0);
            }
            if (this.field1111.field455 != null) {
                this.field1103.method3385(this.field1017 != null, -8);
                this.field1103.method3344(this.field1017, this.field1060, this.field1063, this.field1041, (byte) 111);
                int var2 = this.field1071.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field1071[var3];
                    int var5 = this.field1071[var3 + 1];
                    int var6 = this.field1016[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field1103.method3386(this.field1017 != null, var6, (byte) -65);
                    this.field1103.method3339(-111, (var5 - var4) * 3, var4 * 3, this.field1111.field455, 4);
                }
            }
        }
        this.method658(-19077);
    }

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "()Z", line = 2155)
    public final boolean method587() {
        field1046++;
        return this.field1065;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILdm;ZI)Z", line = 2163)
    public final boolean method589(int arg0, int arg1, class765 arg2, boolean arg3, int arg4) {
        field1001++;
        return this.method671(arg3, arg2, -1, (byte) -106, arg0, arg4, arg1);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()V", line = 2171)
    public final void method583() {
        field1106++;
        if (this.field1109 <= 0 || this.field1093 <= 0) {
            return;
        }
        this.method672(7, false);
        if ((this.field993 & 0x10) == 0 && this.field1111.field455 == null) {
            this.method668(false, false);
        }
        this.method658(-19077);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZZLqb;ILqb;I)Lka;", line = 2189)
    private final class233 method664(boolean arg0, boolean arg1, class68 arg2, int arg3, class68 arg4, int arg5) {
        arg2.field993 = 0;
        if ((arg3 & 0x100) == 0) {
            arg2.field1095 = this.field1095;
        } else {
            arg2.field1095 = true;
        }
        arg2.field1065 = this.field1065;
        arg2.field1037 = arg3;
        arg2.field1011 = this.field1011;
        field1081++;
        arg2.field1109 = this.field1109;
        arg2.field1093 = this.field1093;
        arg2.field1024 = this.field1024;
        arg2.field1009 = this.field1009;
        arg2.field1101 = this.field1101;
        arg2.field1006 = this.field1006;
        arg2.field1097 = this.field1097;
        arg2.field1035 = this.field1035;
        boolean var7 = class219.method1510(90, this.field1011, arg3);
        boolean var8 = class289.method1825(arg3, this.field1011, -87);
        boolean var9 = class356.method2149(arg3, this.field1011, (byte) 99);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg2.field1049 = this.field1049;
            } else if (arg4.field1049 == null || this.field1006 > arg4.field1049.length) {
                arg2.field1049 = arg4.field1049 = new int[this.field1006];
            } else {
                arg2.field1049 = arg4.field1049;
            }
            if (!var8) {
                arg2.field1085 = this.field1085;
            } else if (arg4.field1085 == null || arg4.field1085.length < this.field1006) {
                arg2.field1085 = arg4.field1085 = new int[this.field1006];
            } else {
                arg2.field1085 = arg4.field1085;
            }
            if (!var9) {
                arg2.field1064 = this.field1064;
            } else if (arg4.field1064 == null || arg4.field1064.length < this.field1006) {
                arg2.field1064 = arg4.field1064 = new int[this.field1006];
            } else {
                arg2.field1064 = arg4.field1064;
            }
            for (int var11 = 0; var11 < this.field1006; var11++) {
                if (var7) {
                    arg2.field1049[var11] = this.field1049[var11];
                }
                if (var8) {
                    arg2.field1085[var11] = this.field1085[var11];
                }
                if (var9) {
                    arg2.field1064[var11] = this.field1064[var11];
                }
            }
        } else {
            arg2.field1049 = this.field1049;
            arg2.field1064 = this.field1064;
            arg2.field1085 = this.field1085;
        }
        if (arg5 <= 62) {
            this.method594((short) 36, (short) 12);
        }
        if (class692.method3890(arg3, this.field1011, (byte) 69)) {
            arg2.field1060 = arg4.field1060;
            if (arg0) {
                arg2.field993 = (byte) (arg2.field993 | 0x1);
            }
            arg2.field1060.field4146 = this.field1060.field4146;
            arg2.field1060.field4148 = this.field1060.field4148;
        } else if (class18.method177(60, this.field1011, arg3)) {
            arg2.field1060 = this.field1060;
        } else {
            arg2.field1060 = null;
        }
        if (class630.method3598(arg3, (byte) -99, this.field1011)) {
            if (arg4.field1089 == null || this.field1024 > arg4.field1089.length) {
                arg2.field1089 = arg4.field1089 = new short[this.field1024];
            } else {
                arg2.field1089 = arg4.field1089;
            }
            for (int var12 = 0; var12 < this.field1024; var12++) {
                arg2.field1089[var12] = this.field1089[var12];
            }
        } else {
            arg2.field1089 = this.field1089;
        }
        if (class131.method1102(this.field1011, -3157, arg3)) {
            if (arg4.field1110 == null || arg4.field1110.length < this.field1024) {
                arg2.field1110 = arg4.field1110 = new byte[this.field1024];
            } else {
                arg2.field1110 = arg4.field1110;
            }
            for (int var13 = 0; var13 < this.field1024; var13++) {
                arg2.field1110[var13] = this.field1110[var13];
            }
        } else {
            arg2.field1110 = this.field1110;
        }
        if (class518.method3033(arg3, -103, this.field1011)) {
            if (arg0) {
                arg2.field993 = (byte) (arg2.field993 | 0x2);
            }
            arg2.field1063 = arg4.field1063;
            arg2.field1063.field4148 = this.field1063.field4148;
            arg2.field1063.field4146 = this.field1063.field4146;
        } else if (class533.method3100(2048, this.field1011, arg3)) {
            arg2.field1063 = this.field1063;
        } else {
            arg2.field1063 = null;
        }
        if (class637.method3628(true, this.field1011, arg3)) {
            if (arg4.field1061 == null || arg4.field1061.length < this.field1109) {
                int var14 = this.field1109;
                arg2.field1088 = arg4.field1088 = new short[var14];
                arg2.field1061 = arg4.field1061 = new short[var14];
                arg2.field1042 = arg4.field1042 = new short[var14];
            } else {
                arg2.field1042 = arg4.field1042;
                arg2.field1088 = arg4.field1088;
                arg2.field1061 = arg4.field1061;
            }
            if (this.field1032 == null) {
                for (int var18 = 0; var18 < this.field1109; var18++) {
                    arg2.field1061[var18] = this.field1061[var18];
                    arg2.field1042[var18] = this.field1042[var18];
                    arg2.field1088[var18] = this.field1088[var18];
                }
            } else {
                if (arg4.field1032 == null) {
                    arg4.field1032 = new class164();
                }
                class164 var15 = arg2.field1032 = arg4.field1032;
                if (var15.field2510 == null || this.field1109 > var15.field2510.length) {
                    int var16 = this.field1109;
                    var15.field2514 = new byte[var16];
                    var15.field2513 = new short[var16];
                    var15.field2515 = new short[var16];
                    var15.field2510 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field1109; var17++) {
                    arg2.field1061[var17] = this.field1061[var17];
                    arg2.field1042[var17] = this.field1042[var17];
                    arg2.field1088[var17] = this.field1088[var17];
                    var15.field2510[var17] = this.field1032.field2510[var17];
                    var15.field2515[var17] = this.field1032.field2515[var17];
                    var15.field2513[var17] = this.field1032.field2513[var17];
                    var15.field2514[var17] = this.field1032.field2514[var17];
                }
            }
            arg2.field1025 = this.field1025;
        } else {
            arg2.field1025 = this.field1025;
            arg2.field1088 = this.field1088;
            arg2.field1061 = this.field1061;
            arg2.field1042 = this.field1042;
            arg2.field1032 = this.field1032;
        }
        if (class547.method3163((byte) 102, this.field1011, arg3)) {
            arg2.field1017 = arg4.field1017;
            if (arg0) {
                arg2.field993 = (byte) (arg2.field993 | 0x4);
            }
            arg2.field1017.field4146 = this.field1017.field4146;
            arg2.field1017.field4148 = this.field1017.field4148;
        } else if (class453.method2662(arg3, (byte) -45, this.field1011)) {
            arg2.field1017 = this.field1017;
        } else {
            arg2.field1017 = null;
        }
        if (class464.method2700(this.field1011, -1, arg3)) {
            if (arg4.field1087 == null || this.field1024 > arg4.field1087.length) {
                int var19 = this.field1109;
                arg2.field1013 = arg4.field1013 = new float[var19];
                arg2.field1087 = arg4.field1087 = new float[var19];
            } else {
                arg2.field1013 = arg4.field1013;
                arg2.field1087 = arg4.field1087;
            }
            for (int var20 = 0; var20 < this.field1109; var20++) {
                arg2.field1087[var20] = this.field1087[var20];
                arg2.field1013[var20] = this.field1013[var20];
            }
        } else {
            arg2.field1087 = this.field1087;
            arg2.field1013 = this.field1013;
        }
        if (class608.method3522(this.field1011, false, arg3)) {
            arg2.field1041 = arg4.field1041;
            if (arg0) {
                arg2.field993 = (byte) (arg2.field993 | 0x8);
            }
            arg2.field1041.field4148 = this.field1041.field4148;
            arg2.field1041.field4146 = this.field1041.field4146;
        } else if (class527.method3084(arg3, 5616, this.field1011)) {
            arg2.field1041 = this.field1041;
        } else {
            arg2.field1041 = null;
        }
        if (class724.method4019(arg3, this.field1011, false)) {
            if (arg4.field1033 == null || this.field1024 > arg4.field1033.length) {
                int var21 = this.field1024;
                arg2.field1033 = arg4.field1033 = new short[var21];
                arg2.field1000 = arg4.field1000 = new short[var21];
                arg2.field1043 = arg4.field1043 = new short[var21];
            } else {
                arg2.field1000 = arg4.field1000;
                arg2.field1033 = arg4.field1033;
                arg2.field1043 = arg4.field1043;
            }
            for (int var22 = 0; var22 < this.field1024; var22++) {
                arg2.field1033[var22] = this.field1033[var22];
                arg2.field1043[var22] = this.field1043[var22];
                arg2.field1000[var22] = this.field1000[var22];
            }
        } else {
            arg2.field1033 = this.field1033;
            arg2.field1000 = this.field1000;
            arg2.field1043 = this.field1043;
        }
        if (class439.method2613(this.field1011, (byte) -104, arg3)) {
            if (arg0) {
                arg2.field993 = (byte) (arg2.field993 | 0x10);
            }
            arg2.field1111 = arg4.field1111;
            arg2.field1111.field455 = this.field1111.field455;
        } else if (class562.method3277(arg3, this.field1011, (byte) 76)) {
            arg2.field1111 = this.field1111;
        } else {
            arg2.field1111 = null;
        }
        if (class464.method2707(this.field1011, (byte) -93, arg3)) {
            if (arg4.field1016 == null || this.field1024 > arg4.field1016.length) {
                int var23 = this.field1024;
                arg2.field1016 = arg4.field1016 = new short[var23];
            } else {
                arg2.field1016 = arg4.field1016;
            }
            for (int var24 = 0; var24 < this.field1024; var24++) {
                arg2.field1016[var24] = this.field1016[var24];
            }
        } else {
            arg2.field1016 = this.field1016;
        }
        if (!class40.method300((byte) -71, this.field1011, arg3)) {
            arg2.field1092 = this.field1092;
        } else if (arg4.field1092 == null || this.field1009 > arg4.field1092.length) {
            int var26 = this.field1009;
            arg2.field1092 = arg4.field1092 = new class531[var26];
            for (int var27 = 0; var27 < this.field1009; var27++) {
                arg2.field1092[var27] = this.field1092[var27].method3096((byte) 122);
            }
        } else {
            arg2.field1092 = arg4.field1092;
            for (int var25 = 0; var25 < this.field1009; var25++) {
                arg2.field1092[var25].method3097((byte) 41, this.field1092[var25]);
            }
        }
        arg2.field1008 = this.field1008;
        arg2.field1058 = this.field1058;
        if (this.field1012) {
            arg2.field1045 = this.field1045;
            arg2.field1029 = this.field1029;
            arg2.field1075 = this.field1075;
            arg2.field1014 = this.field1014;
            arg2.field1030 = this.field1030;
            arg2.field1070 = this.field1070;
            arg2.field1015 = this.field1015;
            arg2.field1114 = this.field1114;
            arg2.field1012 = true;
        } else {
            arg2.field1012 = false;
        }
        arg2.field1027 = this.field1027;
        arg2.field996 = this.field996;
        arg2.field1113 = this.field1113;
        arg2.field1099 = this.field1099;
        arg2.field1022 = this.field1022;
        arg2.field1038 = this.field1038;
        arg2.field1071 = this.field1071;
        arg2.field1023 = this.field1023;
        arg2.field1026 = this.field1026;
        return arg2;
    }

    @OriginalMember(owner = "client!qb", name = "da", descriptor = "()I", line = 2661)
    public final int method596() {
        field1005++;
        return this.field1097;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V", line = 2674)
    public static final void method665(byte arg0) {
        int var1 = 61 / ((30 - arg0) / 62);
        field994++;
        if (class636.field8987 == 1 || class636.field8987 == 3 || class636.field8987 != class542.field7500 && (class636.field8987 == 0 || class542.field7500 == 0)) {
            class51.field731 = 0;
            class657.field9270 = 0;
            class486.field6697.method4249((byte) 118);
        }
        class542.field7500 = class636.field8987;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V", line = 2698)
    public static void method666(byte arg0) {
        if (arg0 < 104) {
            field1028 = 10;
        }
        field1083 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIZ)Lka;", line = 2714)
    public final class233 method585(byte arg0, int arg1, boolean arg2) {
        field1002++;
        class68 var4;
        class68 var5;
        if (arg0 == 1) {
            var4 = this.field1103.field8195;
            var5 = this.field1103.field8255;
        } else if (arg0 == 2) {
            var5 = this.field1103.field8197;
            var4 = this.field1103.field8261;
        } else if (arg0 == 3) {
            var4 = this.field1103.field8275;
            var5 = this.field1103.field8280;
        } else if (arg0 == 4) {
            var5 = this.field1103.field8248;
            var4 = this.field1103.field8227;
        } else if (arg0 == 5) {
            var4 = this.field1103.field8174;
            var5 = this.field1103.field8236;
        } else {
            var5 = var4 = new class68(this.field1103);
        }
        return this.method664(arg0 != 0, arg2, var5, arg1, var4, 93);
    }

    @OriginalMember(owner = "client!qb", name = "fa", descriptor = "()I", line = 2765)
    public final int method534() {
        field1086++;
        if (!this.field1012) {
            this.method662((byte) -94);
        }
        return this.field1045;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(B)I", line = 2777)
    public static final int method667(byte arg0) {
        if (arg0 < 32) {
            return -85;
        }
        field1118++;
        int var1 = class40.field464.method2112(28235);
        if (var1 < class247.field3547.length - 1) {
            class40.field464 = class247.field3547[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ldm;IZ)V", line = 2795)
    public final void method556(class765 arg0, int arg1, boolean arg2) {
        field1102++;
        if (this.field1038 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field1035; var5++) {
            if ((this.field1038[var5] & arg1) != 0) {
                if (arg2) {
                    arg0.method1559(this.field1049[var5], this.field1085[var5], this.field1064[var5], var4);
                } else {
                    arg0.method1571(this.field1049[var5], this.field1085[var5], this.field1064[var5], var4);
                }
                this.field1049[var5] = var4[0];
                this.field1085[var5] = var4[1];
                this.field1064[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZZ)V", line = 2828)
    private final void method668(boolean arg0, boolean arg1) {
        field1115++;
        if (this.field1103.field8238.field6002.length < this.field1093 * 6) {
            this.field1103.field8238 = new class501((this.field1093 + 100) * 6);
        } else {
            this.field1103.field8238.field5983 = 0;
        }
        if (arg0) {
            return;
        }
        class501 var3 = this.field1103.field8238;
        if (this.field1103.field8231) {
            for (int var4 = 0; var4 < this.field1093; var4++) {
                var3.method2546(true, this.field1033[var4]);
                var3.method2546(true, this.field1043[var4]);
                var3.method2546(true, this.field1000[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field1093; var5++) {
                var3.method2582((byte) -126, this.field1033[var5]);
                var3.method2582((byte) -102, this.field1043[var5]);
                var3.method2582((byte) -24, this.field1000[var5]);
            }
        }
        if (var3.field5983 == 0) {
            return;
        }
        if (arg1) {
            if (this.field1044 == null) {
                this.field1044 = this.field1103.method3333(var3.field6002, true, (byte) -120, 5123, var3.field5983);
            } else {
                this.field1044.method2600(-8525, var3.field6002, var3.field5983, 5123);
            }
            this.field1111.field455 = this.field1044;
        } else {
            this.field1111.field455 = this.field1103.method3333(var3.field6002, false, (byte) 70, 5123, var3.field5983);
        }
        if (!arg1) {
            this.field1051 = true;
        }
    }

    @OriginalMember(owner = "client!qb", name = "WA", descriptor = "()I", line = 2894)
    public final int method581() {
        field1074++;
        return this.field1101;
    }

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "()I", line = 2902)
    public final int method572() {
        if (!this.field1012) {
            this.method662((byte) -106);
        }
        field1105++;
        return this.field1114;
    }

    @OriginalMember(owner = "client!qb", name = "FA", descriptor = "(I)V", line = 2914)
    public final void method550(int arg0) {
        field1040++;
        int var2 = class253.field3634[arg0];
        int var3 = class253.field3633[arg0];
        for (int var4 = 0; var4 < this.field1035; var4++) {
            int var5 = this.field1085[var4] * var3 - this.field1064[var4] * var2 >> 14;
            this.field1064[var4] = this.field1085[var4] * var2 + this.field1064[var4] * var3 >> 14;
            this.field1085[var4] = var5;
        }
        if (this.field1060 != null) {
            this.field1060.field4148 = null;
        }
        this.field1012 = false;
    }

    @OriginalMember(owner = "client!qb", name = "ba", descriptor = "(Lr;)Lr;", line = 2949)
    public final class115 method539(class115 arg0) {
        field1078++;
        if (this.field1109 == 0) {
            return null;
        }
        if (!this.field1012) {
            this.method662((byte) -87);
        }
        int var2;
        int var3;
        if (this.field1103.field8221 > 0) {
            var2 = this.field1075 - (this.field1103.field8221 * this.field1030 >> 8) >> this.field1103.field8134;
            var3 = this.field1014 - (this.field1103.field8221 * this.field1045 >> 8) >> this.field1103.field8134;
        } else {
            var2 = this.field1075 - (this.field1103.field8221 * this.field1045 >> 8) >> this.field1103.field8134;
            var3 = this.field1014 - (this.field1103.field8221 * this.field1030 >> 8) >> this.field1103.field8134;
        }
        int var4;
        int var5;
        if (this.field1103.field8205 > 0) {
            var4 = this.field1070 - (this.field1103.field8205 * this.field1030 >> 8) >> this.field1103.field8134;
            var5 = this.field1114 - (this.field1103.field8205 * this.field1045 >> 8) >> this.field1103.field8134;
        } else {
            var4 = this.field1070 - (this.field1103.field8205 * this.field1045 >> 8) >> this.field1103.field8134;
            var5 = this.field1114 - (this.field1103.field8205 * this.field1030 >> 8) >> this.field1103.field8134;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 - (var4 - 1);
        class9 var8 = (class9) arg0;
        class9 var9;
        if (var8 != null && var8.method149(-13, var7, var6)) {
            var9 = var8;
            var8.method147((byte) 0);
        } else {
            var9 = new class9(this.field1103, var6, var7);
        }
        var9.method145(-53, var5, var3, var4, var2);
        this.method659(var9, (byte) -72);
        return var9;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V", line = 3011)
    private final void method669(boolean arg0) {
        if (this.field1026 != null) {
            class229 var2 = this.field1103.field8131;
            this.field1103.method3346(0);
            this.field1103.method513(!this.field1095);
            this.field1103.method3385(false, -8);
            this.field1103.method3344(null, this.field1103.field8170, null, this.field1103.field8179, (byte) 123);
            for (int var3 = 0; var3 < this.field1009; var3++) {
                class615 var4 = this.field1026[var3];
                class531 var5 = this.field1092[var3];
                if (!var4.field8732 || !this.field1103.method99()) {
                    float var6 = (float) (this.field1049[var4.field8731] + this.field1049[var4.field8723] + this.field1049[var4.field8727]) * 0.3333333F;
                    float var7 = (float) (this.field1085[var4.field8727] + this.field1085[var4.field8731] + this.field1085[var4.field8723]) * 0.3333333F;
                    float var8 = (float) (this.field1064[var4.field8731] + this.field1064[var4.field8723] + this.field1064[var4.field8727]) * 0.3333333F;
                    float var9 = class224.field3293 * var8 + class481.field6605 * var6 + class329.field4690 * var7 + class86.field1285;
                    float var10 = class692.field9755 * var8 + class67.field991 * var6 + class161.field2491 * var7 + class149.field2401;
                    float var11 = class14.field170 * var8 + class629.field8925 * var7 + class414.field5687 * var6 + class259.field3677;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field8718;
                    var2.method1557(var11 * var12 - var11, (float) var5.field7392 + var9 + -(var9 * var12), var4.field8730 * var5.field7400 >> 7, var5.field7396, false, var4.field8719 * var5.field7389 >> 7, var10 * var12 + (float) var5.field7398 - var10);
                    this.field1103.method3358(0, var2);
                    int var13 = var5.field7394;
                    OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                    this.field1103.method3364(0, var4.field8721);
                    this.field1103.method3308((byte) 76, var4.field8726);
                    this.field1103.method3342(7, 124, 0, 4);
                }
            }
            this.field1103.method513(true);
            this.field1103.method3310((byte) 54);
        }
        if (!arg0) {
            this.method664(true, true, null, 32, null, -35);
        }
        field1003++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ldm;Let;I)V", line = 3076)
    public final void method575(class765 arg0, class749 arg1, int arg2) {
        field1021++;
        if (this.field1109 == 0) {
            return;
        }
        class229 var4 = this.field1103.field8164;
        class229 var5 = (class229) arg0;
        if (!this.field1012) {
            this.method662((byte) -108);
        }
        class629.field8925 = var4.field3360 * var5.field3333 + var4.field3363 * var5.field3335 + var4.field3333 * var5.field3340;
        class259.field3677 = var4.field3360 * var5.field3325 + var4.field3363 * var5.field3327 + var4.field3333 * var5.field3365 + var4.field3325;
        float var6 = (float) this.field1045 * class629.field8925 + class259.field3677;
        float var7 = (float) this.field1030 * class629.field8925 + class259.field3677;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = (float) (-this.field1015) + var7;
            var8 = (float) this.field1015 + var6;
        } else {
            var8 = (float) this.field1015 + var7;
            var9 = (float) (-this.field1015) + var6;
        }
        if ((var9 >= this.field1103.field8178) || (var8 <= (float) this.field1103.field8214)) {
            return;
        }
        class86.field1285 = var4.field3349 * var5.field3325 + var4.field3346 * var5.field3327 + var4.field3335 * var5.field3365 + var4.field3327;
        class329.field4690 = var4.field3349 * var5.field3333 + var4.field3346 * var5.field3335 + var4.field3335 * var5.field3340;
        float var10 = (float) this.field1045 * class329.field4690 + class86.field1285;
        float var11 = (float) this.field1030 * class329.field4690 + class86.field1285;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = ((float) this.field1015 + var10) * (float) this.field1103.field8237;
            var13 = ((float) (-this.field1015) + var11) * (float) this.field1103.field8237;
        } else {
            var13 = (var10 - (float) this.field1015) * (float) this.field1103.field8237;
            var12 = ((float) this.field1015 + var11) * (float) this.field1103.field8237;
        }
        if ((var13 / var8 >= this.field1103.field8267) || (var12 / var8 <= this.field1103.field8256)) {
            return;
        }
        class161.field2491 = var4.field3352 * var5.field3333 + var4.field3359 * var5.field3335 + var4.field3340 * var5.field3340;
        class149.field2401 = var4.field3352 * var5.field3325 + var4.field3359 * var5.field3327 + var4.field3340 * var5.field3365 + var4.field3365;
        float var14 = (float) this.field1045 * class161.field2491 + class149.field2401;
        float var15 = (float) this.field1030 * class161.field2491 + class149.field2401;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = (var15 - (float) this.field1015) * (float) this.field1103.field8204;
            var17 = ((float) this.field1015 + var14) * (float) this.field1103.field8204;
        } else {
            var16 = (var14 - (float) this.field1015) * (float) this.field1103.field8204;
            var17 = ((float) this.field1015 + var15) * (float) this.field1103.field8204;
        }
        if ((this.field1103.field8268 <= var16 / var8) || (var17 / var8 <= this.field1103.field8247)) {
            return;
        }
        if (arg1 != null || this.field1026 != null) {
            class481.field6605 = var4.field3349 * var5.field3363 + var4.field3346 * var5.field3346 + var4.field3335 * var5.field3359;
            class692.field9755 = var4.field3352 * var5.field3360 + var4.field3359 * var5.field3349 + var4.field3340 * var5.field3352;
            class67.field991 = var4.field3352 * var5.field3363 + var4.field3359 * var5.field3346 + var4.field3340 * var5.field3359;
            class224.field3293 = var4.field3349 * var5.field3360 + var4.field3346 * var5.field3349 + var4.field3335 * var5.field3352;
            class14.field170 = var4.field3360 * var5.field3360 + var4.field3363 * var5.field3349 + var4.field3333 * var5.field3352;
            class414.field5687 = var4.field3360 * var5.field3363 + var4.field3363 * var5.field3346 + var4.field3333 * var5.field3359;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field1075 + this.field1014 >> 1;
            int var21 = this.field1070 + this.field1114 >> 1;
            int var22 = (int) ((float) var21 * class224.field3293 + (float) this.field1045 * class329.field4690 + (float) var20 * class481.field6605 + class86.field1285);
            int var23 = (int) ((float) var21 * class692.field9755 + (float) this.field1045 * class161.field2491 + (float) var20 * class67.field991 + class149.field2401);
            int var24 = (int) ((float) var21 * class14.field170 + (float) this.field1045 * class629.field8925 + (float) var20 * class414.field5687 + class259.field3677);
            if (var24 < this.field1103.field8214) {
                var18 = true;
            } else {
                arg1.field10405 = this.field1103.field8204 * var23 / var24 + this.field1103.field8177;
                arg1.field10403 = this.field1103.field8237 * var22 / var24 + this.field1103.field8217;
            }
            int var25 = (int) ((float) var21 * class224.field3293 + (float) this.field1030 * class329.field4690 + (float) var20 * class481.field6605 + class86.field1285);
            int var26 = (int) ((float) var21 * class692.field9755 + (float) this.field1030 * class161.field2491 + (float) var20 * class67.field991 + class149.field2401);
            int var27 = (int) ((float) var21 * class14.field170 + (float) this.field1030 * class629.field8925 + (float) var20 * class414.field5687 + class259.field3677);
            if (this.field1103.field8214 > var27) {
                var18 = true;
            } else {
                arg1.field10401 = this.field1103.field8204 * var26 / var27 + this.field1103.field8177;
                arg1.field10402 = this.field1103.field8237 * var25 / var27 + this.field1103.field8217;
            }
            if (var18) {
                if (this.field1103.field8214 > var24 && var27 < this.field1103.field8214) {
                    var19 = false;
                } else if (this.field1103.field8214 > var24) {
                    int var28 = (var27 - this.field1103.field8214 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field10403 = this.field1103.field8237 * var29 / this.field1103.field8214 + this.field1103.field8217;
                    arg1.field10405 = this.field1103.field8177 + (this.field1103.field8204 * var30 / this.field1103.field8214);
                } else if (var27 < this.field1103.field8214) {
                    int var31 = (var24 - this.field1103.field8214 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    arg1.field10403 = this.field1103.field8237 * var32 / this.field1103.field8214 + this.field1103.field8217;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field10405 = this.field1103.field8204 * var33 / this.field1103.field8214 + this.field1103.field8177;
                }
            }
            if (var19) {
                if (var24 <= var27) {
                    arg1.field10400 = (this.field1015 + var25) * this.field1103.field8237 / var27 + this.field1103.field8217 - arg1.field10402;
                } else {
                    arg1.field10400 = (this.field1015 + var22) * this.field1103.field8237 / var24 + this.field1103.field8217 - arg1.field10403;
                }
                arg1.field10404 = true;
            }
        }
        this.field1103.method3314(false);
        this.field1103.method3311(var5, 0);
        this.method663(-16833);
        this.field1103.method3310((byte) -123);
        this.method669(true);
    }

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "(I)V", line = 3279)
    public final void method555(int arg0) {
        if (this.field1063 != null) {
            this.field1063.field4148 = null;
        }
        this.field1101 = (short) arg0;
        field1112++;
    }

    @OriginalMember(owner = "client!qb", name = "wa", descriptor = "()V", line = 3296)
    public final void method567() {
        for (int var1 = 0; var1 < this.field1006; var1++) {
            this.field1049[var1] = this.field1049[var1] + 7 >> 4;
            this.field1085[var1] = this.field1085[var1] + 7 >> 4;
            this.field1064[var1] = this.field1064[var1] + 7 >> 4;
        }
        field1018++;
        this.field1012 = false;
        if (this.field1060 != null) {
            this.field1060.field4148 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "(I[IIIIZI[I)V", line = 3320)
    public final void method565(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field1069++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            int var12 = arg3 << 4;
            class769.field10619 = 0;
            class368.field5211 = 0;
            int var13 = 0;
            class133.field2233 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field1027.length) {
                    int[] var16 = this.field1027[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field1038 == null || (arg6 & this.field1038[var18]) != 0) {
                            class133.field2233 += this.field1049[var18];
                            class769.field10619 += this.field1085[var18];
                            var13++;
                            class368.field5211 += this.field1064[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class769.field10619 = class769.field10619 / var13 + var12;
                class133.field2233 = class133.field2233 / var13 + var10;
                class368.field5211 = class368.field5211 / var13 + var11;
                class455.field6220 = true;
            } else {
                class133.field2233 = var10;
                class368.field5211 = var11;
                class769.field10619 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[2] * arg4 + arg7[0] * arg2 + 8192 >> 14;
                int var20 = arg7[4] * arg3 + arg7[3] * arg2 + arg7[5] * arg4 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + (arg7[6] * arg2 + (arg7[7] * arg3)) + 8192 >> 14;
                arg4 = var21;
                arg3 = var20;
                arg2 = var19;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1027.length) {
                    int[] var27 = this.field1027[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field1038 == null || (this.field1038[var29] & arg6) != 0) {
                            this.field1049[var29] += var24;
                            this.field1085[var29] += var23;
                            this.field1064[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field1027.length > var109) {
                        int[] var110 = this.field1027[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field1038 == null || (arg6 & this.field1038[var112]) != 0) {
                                this.field1049[var112] -= class133.field2233;
                                this.field1085[var112] -= class769.field10619;
                                this.field1064[var112] -= class368.field5211;
                                if (arg4 != 0) {
                                    int var113 = class253.field3634[arg4];
                                    int var114 = class253.field3633[arg4];
                                    int var115 = this.field1085[var112] * var113 + this.field1049[var112] * var114 + 16383 >> 14;
                                    this.field1085[var112] = this.field1085[var112] * var114 + 16383 - (this.field1049[var112] * var113) >> 14;
                                    this.field1049[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class253.field3634[arg2];
                                    int var117 = class253.field3633[arg2];
                                    int var118 = this.field1085[var112] * var117 + 16383 - (this.field1064[var112] * var116) >> 14;
                                    this.field1064[var112] = this.field1064[var112] * var117 + this.field1085[var112] * var116 + 16383 >> 14;
                                    this.field1085[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class253.field3634[arg3];
                                    int var120 = class253.field3633[arg3];
                                    int var121 = this.field1064[var112] * var119 + this.field1049[var112] * var120 + 16383 >> 14;
                                    this.field1064[var112] = this.field1064[var112] * var120 + 16383 - (this.field1049[var112] * var119) >> 14;
                                    this.field1049[var112] = var121;
                                }
                                this.field1049[var112] += class133.field2233;
                                this.field1085[var112] += class769.field10619;
                                this.field1064[var112] += class368.field5211;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field1027.length) {
                            int[] var93 = this.field1027[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field1038 == null || (this.field1038[var95] & arg6) != 0) {
                                    int var96 = this.field1058[var95];
                                    int var97 = this.field1058[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field1023[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class253.field3634[arg4];
                                            int var101 = class253.field3633[arg4];
                                            int var102 = this.field1042[var99] * var100 + (this.field1061[var99] * var101) + 16383 >> 14;
                                            this.field1042[var99] = (short) (this.field1042[var99] * var101 + 16383 - (this.field1061[var99] * var100) >> 14);
                                            this.field1061[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class253.field3634[arg2];
                                            int var104 = class253.field3633[arg2];
                                            int var105 = this.field1042[var99] * var104 + 16383 - this.field1088[var99] * var103 >> 14;
                                            this.field1088[var99] = (short) (this.field1088[var99] * var104 + this.field1042[var99] * var103 + 16383 >> 14);
                                            this.field1042[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class253.field3634[arg3];
                                            int var107 = class253.field3633[arg3];
                                            int var108 = this.field1088[var99] * var106 + (this.field1061[var99] * var107) + 16383 >> 14;
                                            this.field1088[var99] = (short) (this.field1088[var99] * var107 + 16383 - (this.field1061[var99] * var106) >> 14);
                                            this.field1061[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field1017 == null && this.field1063 != null) {
                        this.field1063.field4148 = null;
                    }
                    if (this.field1017 != null) {
                        this.field1017.field4148 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class455.field6220) {
                    int var36 = arg7[3] * class769.field10619 + (arg7[6] * class368.field5211) + arg7[0] * class133.field2233 + 8192 >> 14;
                    int var37 = arg7[1] * class133.field2233 + arg7[4] * class769.field10619 + arg7[7] * class368.field5211 + 8192 >> 14;
                    int var38 = arg7[5] * class769.field10619 + (arg7[2] * class133.field2233 + (arg7[8] * class368.field5211)) + 8192 >> 14;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    class769.field10619 = var40;
                    int var41 = var35 + var38;
                    class133.field2233 = var39;
                    class368.field5211 = var41;
                    class455.field6220 = false;
                }
                int[] var42 = new int[9];
                int var43 = class253.field3633[arg2];
                int var44 = class253.field3634[arg2];
                int var45 = class253.field3633[arg3];
                int var46 = class253.field3634[arg3];
                int var47 = class253.field3633[arg4];
                int var48 = class253.field3634[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[0] = var46 * var50 + var45 * var47 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[6] = -var46 * var47 + (var45 * var50) + 8192 >> 14;
                var42[5] = -var44;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[7] = var46 * var48 - (-(var45 * var49) - 8192) >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                int var51 = var42[1] * -class769.field10619 + var42[0] * -class133.field2233 + (var42[2] * -class368.field5211) + 8192 >> 14;
                int var52 = var42[5] * -class368.field5211 + var42[3] * -class133.field2233 + (var42[4] * -class769.field10619) + 8192 >> 14;
                int var53 = var42[8] * -class368.field5211 + var42[7] * -class769.field10619 + var42[6] * -class133.field2233 + 8192 >> 14;
                int var54 = class133.field2233 + var51;
                int var55 = class769.field10619 + var52;
                int var56 = class368.field5211 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 8192 >> 14;
                    }
                }
                int var59 = var42[0] * var33 + var42[2] * var35 + var42[1] * var34 + 8192 >> 14;
                int var60 = var42[5] * var35 + var42[4] * var34 + var42[3] * var33 + 8192 >> 14;
                int var61 = var42[8] * var35 + var42[7] * var34 + var42[6] * var33 + 8192 >> 14;
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
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[2] * var64 + arg7[0] * var62 + (arg7[1] * var63) + 8192 >> 14;
                int var68 = arg7[5] * var64 + arg7[3] * var62 - (-(arg7[4] * var63) + -8192) >> 14;
                int var69 = arg7[6] * var62 + arg7[7] * var63 + arg7[8] * var64 + 8192 >> 14;
                int var70 = var30 + var67;
                int var71 = var31 + var68;
                int var72 = var32 + var69;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field1027.length) {
                        int[] var75 = this.field1027[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field1038 == null || (arg6 & this.field1038[var77]) != 0) {
                                int var78 = this.field1085[var77] * var65[1] + this.field1049[var77] * var65[0] + this.field1064[var77] * var65[2] + 8192 >> 14;
                                int var79 = this.field1085[var77] * var65[4] + this.field1064[var77] * var65[5] + this.field1049[var77] * var65[3] + 8192 >> 14;
                                int var80 = this.field1049[var77] * var65[6] + this.field1085[var77] * var65[7] + this.field1064[var77] * var65[8] + 8192 >> 14;
                                int var81 = var71 + var79;
                                int var82 = var70 + var78;
                                int var83 = var72 + var80;
                                this.field1049[var77] = var82;
                                this.field1085[var77] = var81;
                                this.field1064[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field1027.length) {
                        int[] var174 = this.field1027[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field1038 == null || (this.field1038[var176] & arg6) != 0) {
                                this.field1049[var176] -= class133.field2233;
                                this.field1085[var176] -= class769.field10619;
                                this.field1064[var176] -= class368.field5211;
                                this.field1049[var176] = this.field1049[var176] * arg2 >> 7;
                                this.field1085[var176] = this.field1085[var176] * arg3 >> 7;
                                this.field1064[var176] = this.field1064[var176] * arg4 >> 7;
                                this.field1049[var176] += class133.field2233;
                                this.field1085[var176] += class769.field10619;
                                this.field1064[var176] += class368.field5211;
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
                if (class455.field6220) {
                    int var128 = arg7[0] * class133.field2233 + (arg7[3] * class769.field10619 - (-(arg7[6] * class368.field5211) - 8192)) >> 14;
                    int var129 = arg7[1] * class133.field2233 + arg7[4] * class769.field10619 + arg7[7] * class368.field5211 + 8192 >> 14;
                    int var130 = var125 + var128;
                    int var131 = var126 + var129;
                    int var132 = arg7[8] * class368.field5211 + arg7[5] * class769.field10619 + arg7[2] * class133.field2233 + 8192 >> 14;
                    class769.field10619 = var131;
                    class133.field2233 = var130;
                    int var133 = var127 + var132;
                    class455.field6220 = false;
                    class368.field5211 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class133.field2233 * var134 + 8192 >> 14;
                int var138 = -class769.field10619 * var135 + 8192 >> 14;
                int var139 = -class368.field5211 * var136 + 8192 >> 14;
                int var140 = var137 + class133.field2233;
                int var141 = class769.field10619 + var138;
                int var142 = class368.field5211 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var141 + var145;
                int var147 = var140 + var144;
                int var148 = var127 * var136 + 8192 >> 14;
                int var149 = var142 + var148;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 8192 >> 14;
                    }
                }
                int var152 = arg7[1] * var146 + arg7[0] * var147 + arg7[2] * var149 + 8192 >> 14;
                int var153 = arg7[5] * var149 + arg7[4] * var146 + arg7[3] * var147 + 8192 >> 14;
                int var154 = var123 + var153;
                int var155 = var122 + var152;
                int var156 = arg7[8] * var149 + arg7[6] * var147 - (-(arg7[7] * var146) + -8192) >> 14;
                int var157 = var124 + var156;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field1027.length > var159) {
                        int[] var160 = this.field1027[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field1038 == null || (this.field1038[var162] & arg6) != 0) {
                                int var163 = this.field1049[var162] * var150[0] + this.field1064[var162] * var150[2] + (this.field1085[var162] * var150[1]) + 8192 >> 14;
                                int var164 = this.field1049[var162] * var150[3] + this.field1085[var162] * var150[4] + this.field1064[var162] * var150[5] + 8192 >> 14;
                                int var165 = var155 + var163;
                                int var166 = this.field1049[var162] * var150[6] + 8192 - (-(this.field1085[var162] * var150[7]) + -(this.field1064[var162] * var150[8])) >> 14;
                                int var167 = var154 + var164;
                                int var168 = var157 + var166;
                                this.field1049[var162] = var165;
                                this.field1085[var162] = var167;
                                this.field1064[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1099 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field1099.length > var181) {
                        int[] var182 = this.field1099[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field1022 == null || (arg6 & this.field1022[var184]) != 0) {
                                int var185 = (this.field1110[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field1110[var184] = (byte) var185;
                                if (this.field1063 != null) {
                                    this.field1063.field4148 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1026 != null) {
                    for (int var178 = 0; var178 < this.field1009; var178++) {
                        class615 var179 = this.field1026[var178];
                        class531 var180 = this.field1092[var178];
                        var180.field7394 = 255 - (this.field1110[var179.field8722] & 0xFF) << 24 | var180.field7394 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1099 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field1099.length > var190) {
                        int[] var191 = this.field1099[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field1022 == null || (arg6 & this.field1022[var193]) != 0) {
                                int var194 = this.field1089[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFEA8) >> 10;
                                int var196 = (var194 & 0x3C4) >> 7;
                                int var197 = arg2 + var195 & 0x3F;
                                int var198 = var194 & 0x7F;
                                int var199 = arg3 / 4 + var196;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                int var200 = arg4 + var198;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field1089[var193] = (short) class694.method3895(var200, class694.method3895(var199 << 7, var197 << 10));
                                if (this.field1063 != null) {
                                    this.field1063.field4148 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1026 != null) {
                    for (int var187 = 0; var187 < this.field1009; var187++) {
                        class615 var188 = this.field1026[var187];
                        class531 var189 = this.field1092[var187];
                        var189.field7394 = var189.field7394 & 0xFF000000 | class789.field10788[this.field1089[var188.field8722] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field996 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field996.length) {
                        int[] var203 = this.field996[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class531 var205 = this.field1092[var203[var204]];
                            var205.field7392 += arg2;
                            var205.field7398 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field996 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field996.length) {
                        int[] var208 = this.field996[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class531 var210 = this.field1092[var208[var209]];
                            var210.field7400 = var210.field7400 * arg2 >> 7;
                            var210.field7389 = var210.field7389 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field996 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field996.length > var212) {
                    int[] var213 = this.field996[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class531 var215 = this.field1092[var213[var214]];
                        var215.field7396 = var215.field7396 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIILida;IIFIJF)S", line = 4309)
    private final short method670(int arg0, int arg1, int arg2, class678 arg3, int arg4, int arg5, float arg6, int arg7, long arg8, float arg9) {
        field998++;
        int var12 = this.field1058[arg1];
        int var13 = this.field1058[arg1 + 1];
        if (arg5 != 1060572487) {
            this.method594((short) -46, (short) 37);
        }
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field1023[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class645.field9174[var15] == arg8) {
                return (short) (var16 - 1);
            }
        }
        this.field1023[var14] = (short) (this.field1109 + 1);
        class645.field9174[var14] = arg8;
        this.field1061[this.field1109] = (short) arg7;
        this.field1042[this.field1109] = (short) arg2;
        this.field1088[this.field1109] = (short) arg4;
        this.field1025[this.field1109] = (byte) arg0;
        this.field1087[this.field1109] = arg9;
        this.field1013[this.field1109] = arg6;
        return (short) (this.field1109++);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V", line = 4356)
    public final void method549() {
        field1080++;
    }

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "(IIII)V", line = 4373)
    public final void method574(int arg0, int arg1, int arg2, int arg3) {
        field997++;
        if (arg0 == 0) {
            class368.field5211 = 0;
            int var5 = 0;
            class769.field10619 = 0;
            class133.field2233 = 0;
            for (int var6 = 0; var6 < this.field1035; var6++) {
                class133.field2233 += this.field1049[var6];
                class769.field10619 += this.field1085[var6];
                class368.field5211 += this.field1064[var6];
                var5++;
            }
            if (var5 <= 0) {
                class368.field5211 = arg3;
                class133.field2233 = arg1;
                class769.field10619 = arg2;
            } else {
                class368.field5211 = class368.field5211 / var5 + arg3;
                class769.field10619 = class769.field10619 / var5 + arg2;
                class133.field2233 = class133.field2233 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1035; var7++) {
                this.field1049[var7] += arg1;
                this.field1085[var7] += arg2;
                this.field1064[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1035; var8++) {
                this.field1049[var8] -= class133.field2233;
                this.field1085[var8] -= class769.field10619;
                this.field1064[var8] -= class368.field5211;
                if (arg3 != 0) {
                    int var9 = class253.field3634[arg3];
                    int var10 = class253.field3633[arg3];
                    int var11 = this.field1049[var8] * var10 + this.field1085[var8] * var9 + 16383 >> 14;
                    this.field1085[var8] = this.field1085[var8] * var10 + 16383 - this.field1049[var8] * var9 >> 14;
                    this.field1049[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class253.field3634[arg1];
                    int var13 = class253.field3633[arg1];
                    int var14 = this.field1085[var8] * var13 + 16383 - (this.field1064[var8] * var12) >> 14;
                    this.field1064[var8] = this.field1085[var8] * var12 + this.field1064[var8] * var13 + 16383 >> 14;
                    this.field1085[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class253.field3634[arg2];
                    int var16 = class253.field3633[arg2];
                    int var17 = this.field1064[var8] * var15 + this.field1049[var8] * var16 + 16383 >> 14;
                    this.field1064[var8] = this.field1064[var8] * var16 + 16383 - this.field1049[var8] * var15 >> 14;
                    this.field1049[var8] = var17;
                }
                this.field1049[var8] += class133.field2233;
                this.field1085[var8] += class769.field10619;
                this.field1064[var8] += class368.field5211;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1035; var18++) {
                this.field1049[var18] -= class133.field2233;
                this.field1085[var18] -= class769.field10619;
                this.field1064[var18] -= class368.field5211;
                this.field1049[var18] = this.field1049[var18] * arg1 / 128;
                this.field1085[var18] = this.field1085[var18] * arg2 / 128;
                this.field1064[var18] = this.field1064[var18] * arg3 / 128;
                this.field1049[var18] += class133.field2233;
                this.field1085[var18] += class769.field10619;
                this.field1064[var18] += class368.field5211;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1024; var19++) {
                int var23 = (this.field1110[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field1110[var19] = (byte) var23;
            }
            if (this.field1063 != null) {
                this.field1063.field4148 = null;
            }
            if (this.field1026 != null) {
                for (int var20 = 0; var20 < this.field1009; var20++) {
                    class615 var21 = this.field1026[var20];
                    class531 var22 = this.field1092[var20];
                    var22.field7394 = var22.field7394 & 0xFFFFFF | 255 - (this.field1110[var21.field8722] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field1024; var24++) {
                int var28 = this.field1089[var24] & 0xFFFF;
                int var29 = (var28 & 0xFF98) >> 10;
                int var30 = (var28 & 0x3B3) >> 7;
                int var31 = arg2 / 4 + var30;
                int var32 = var28 & 0x7F;
                int var33 = var29 + arg1 & 0x3F;
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
                this.field1089[var24] = (short) class694.method3895(class694.method3895(var33 << 10, var31 << 7), var34);
            }
            if (this.field1063 != null) {
                this.field1063.field4148 = null;
            }
            if (this.field1026 != null) {
                for (int var25 = 0; var25 < this.field1009; var25++) {
                    class615 var26 = this.field1026[var25];
                    class531 var27 = this.field1092[var25];
                    var27.field7394 = var27.field7394 & 0xFF000000 | class789.field10788[this.field1089[var26.field8722] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field1009; var35++) {
                class531 var36 = this.field1092[var35];
                var36.field7392 += arg1;
                var36.field7398 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field1009; var37++) {
                class531 var38 = this.field1092[var37];
                var38.field7400 = var38.field7400 * arg1 >> 7;
                var38.field7389 = var38.field7389 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field1009; var39++) {
                class531 var40 = this.field1092[var39];
                var40.field7396 = var40.field7396 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILdm;ZII)Z", line = 4683)
    public final boolean method584(int arg0, int arg1, class765 arg2, boolean arg3, int arg4, int arg5) {
        field1053++;
        return this.method671(arg3, arg2, arg5, (byte) 124, arg0, arg4, arg1);
    }

    @OriginalMember(owner = "client!qb", name = "ma", descriptor = "()I", line = 4691)
    public final int method544() {
        field1039++;
        if (!this.field1012) {
            this.method662((byte) -119);
        }
        return this.field1029;
    }

    @OriginalMember(owner = "client!qb", name = "LA", descriptor = "(I)V", line = 4704)
    public final void method557(int arg0) {
        this.field1097 = (short) arg0;
        if (this.field1063 != null) {
            this.field1063.field4148 = null;
        }
        field1117++;
        if (this.field1017 != null) {
            this.field1017.field4148 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ldm;)V", line = 4721)
    public final void method582(class765 arg0) {
        field1056++;
        class229 var2 = (class229) arg0;
        if (this.field1113 != null) {
            for (int var3 = 0; var3 < this.field1113.length; var3++) {
                class335 var4 = this.field1113[var3];
                class335 var5 = var4;
                if (var4.field4756 != null) {
                    var5 = var4.field4756;
                }
                var5.field4762 = (int) ((float) this.field1064[var4.field4765] * var2.field3349 + (float) this.field1085[var4.field4765] * var2.field3335 + (float) this.field1049[var4.field4765] * var2.field3346 + var2.field3327);
                var5.field4755 = (int) ((float) this.field1064[var4.field4765] * var2.field3352 + (float) this.field1085[var4.field4765] * var2.field3340 + (float) this.field1049[var4.field4765] * var2.field3359 + var2.field3365);
                var5.field4752 = (int) ((float) this.field1064[var4.field4765] * var2.field3360 + (float) this.field1085[var4.field4765] * var2.field3333 + (float) this.field1049[var4.field4765] * var2.field3363 + var2.field3325);
                var5.field4751 = (int) ((float) this.field1064[var4.field4770] * var2.field3349 + (float) this.field1085[var4.field4770] * var2.field3335 + (float) this.field1049[var4.field4770] * var2.field3346 + var2.field3327);
                var5.field4761 = (int) ((float) this.field1064[var4.field4770] * var2.field3352 + (float) this.field1085[var4.field4770] * var2.field3340 + (float) this.field1049[var4.field4770] * var2.field3359 + var2.field3365);
                var5.field4771 = (int) ((float) this.field1064[var4.field4770] * var2.field3360 + (float) this.field1085[var4.field4770] * var2.field3333 + (float) this.field1049[var4.field4770] * var2.field3363 + var2.field3325);
                var5.field4758 = (int) ((float) this.field1064[var4.field4753] * var2.field3349 + (float) this.field1085[var4.field4753] * var2.field3335 + (float) this.field1049[var4.field4753] * var2.field3346 + var2.field3327);
                var5.field4764 = (int) ((float) this.field1064[var4.field4753] * var2.field3352 + (float) this.field1085[var4.field4753] * var2.field3340 + (float) this.field1049[var4.field4753] * var2.field3359 + var2.field3365);
                var5.field4750 = (int) ((float) this.field1064[var4.field4753] * var2.field3360 + (float) this.field1085[var4.field4753] * var2.field3333 + (float) this.field1049[var4.field4753] * var2.field3363 + var2.field3325);
            }
        }
        if (this.field1008 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field1008.length; var6++) {
            class740 var7 = this.field1008[var6];
            class740 var8 = var7;
            if (var7.field10252 != null) {
                var8 = var7.field10252;
            }
            if (var7.field10247 == null) {
                var7.field10247 = var2.method1556();
            } else {
                var7.field10247.method1552(var2);
            }
            var8.field10251 = (int) ((float) this.field1064[var7.field10249] * var2.field3349 + (float) this.field1085[var7.field10249] * var2.field3335 + (float) this.field1049[var7.field10249] * var2.field3346 + var2.field3327);
            var8.field10245 = (int) ((float) this.field1064[var7.field10249] * var2.field3352 + (float) this.field1085[var7.field10249] * var2.field3340 + (float) this.field1049[var7.field10249] * var2.field3359 + var2.field3365);
            var8.field10244 = (int) ((float) this.field1064[var7.field10249] * var2.field3360 + (float) this.field1085[var7.field10249] * var2.field3333 + (float) this.field1049[var7.field10249] * var2.field3363 + var2.field3325);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V", line = 4793)
    public final void method578(int arg0, int arg1, int arg2, int arg3) {
        field1079++;
        for (int var5 = 0; var5 < this.field1024; var5++) {
            int var9 = this.field1089[var5] & 0xFFFF;
            int var10 = (var9 & 0xFE7E) >> 10;
            int var11 = (var9 & 0x3CC) >> 7;
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 -= -((arg0 - var10) * arg3 >> 7);
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field1089[var5] = (short) class694.method3895(class694.method3895(var10 << 10, var11 << 7), var12);
        }
        if (this.field1026 != null) {
            for (int var6 = 0; var6 < this.field1009; var6++) {
                class615 var7 = this.field1026[var6];
                class531 var8 = this.field1092[var6];
                var8.field7394 = class789.field10788[this.field1089[var7.field8722] & 0xFFFF] & 0xFFFFFF | var8.field7394 & 0xFF000000;
            }
        }
        if (this.field1063 != null) {
            this.field1063.field4148 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLdm;IBIII)Z", line = 4850)
    private final boolean method671(boolean arg0, class765 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field1108++;
        class229 var8 = (class229) arg1;
        class229 var9 = this.field1103.field8164;
        float var10 = var8.field3325 * var9.field3349 + var8.field3365 * var9.field3335 + var8.field3327 * var9.field3346 + var9.field3327;
        float var11 = var8.field3325 * var9.field3352 + var8.field3365 * var9.field3340 + var8.field3327 * var9.field3359 + var9.field3365;
        class414.field5687 = var8.field3363 * var9.field3360 + var8.field3359 * var9.field3333 + var8.field3346 * var9.field3363;
        float var12 = var8.field3325 * var9.field3360 + var8.field3365 * var9.field3333 + var8.field3327 * var9.field3363 + var9.field3325;
        class692.field9755 = var8.field3360 * var9.field3352 + var8.field3352 * var9.field3340 + var8.field3349 * var9.field3359;
        class224.field3293 = var8.field3360 * var9.field3349 + var8.field3352 * var9.field3335 + var8.field3349 * var9.field3346;
        class629.field8925 = var8.field3333 * var9.field3360 + var8.field3340 * var9.field3333 + var8.field3335 * var9.field3363;
        class481.field6605 = var8.field3363 * var9.field3349 + var8.field3359 * var9.field3335 + var8.field3346 * var9.field3346;
        class329.field4690 = var8.field3333 * var9.field3349 + var8.field3340 * var9.field3335 + var8.field3335 * var9.field3346;
        class161.field2491 = var8.field3333 * var9.field3352 + var8.field3340 * var9.field3340 + var8.field3335 * var9.field3359;
        class67.field991 = var8.field3363 * var9.field3352 + var8.field3359 * var9.field3340 + var8.field3346 * var9.field3359;
        class14.field170 = var8.field3360 * var9.field3360 + var8.field3352 * var9.field3333 + var8.field3349 * var9.field3363;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field1103.field8237;
        int var19 = this.field1103.field8204;
        if (!this.field1012) {
            this.method662((byte) -101);
        }
        int var20 = this.field1014 - this.field1075 >> 1;
        int var21 = this.field1030 - this.field1045 >> 1;
        int var22 = this.field1114 - this.field1070 >> 1;
        int var23 = this.field1075 + var20;
        int var24 = this.field1045 + var21;
        int var25 = this.field1070 + var22;
        int var26 = var23 - (var20 << arg5);
        int var27 = var24 - (var21 << arg5);
        int var28 = var25 - (var22 << arg5);
        int var29 = -125 / ((arg3 - 60) / 60);
        int var30 = (var20 << arg5) + var23;
        int var31 = (var21 << arg5) + var24;
        class607.field8639[0] = var26;
        int var32 = (var22 << arg5) + var25;
        class622.field8776[0] = var27;
        class286.field4210[0] = var28;
        class607.field8639[1] = var30;
        class622.field8776[1] = var27;
        class286.field4210[1] = var28;
        class607.field8639[2] = var26;
        class622.field8776[2] = var31;
        class607.field8639[3] = var30;
        class286.field4210[2] = var28;
        class622.field8776[3] = var31;
        class286.field4210[3] = var28;
        class607.field8639[4] = var26;
        class622.field8776[4] = var27;
        class286.field4210[4] = var32;
        class607.field8639[5] = var30;
        class622.field8776[5] = var27;
        class286.field4210[5] = var32;
        class607.field8639[6] = var26;
        class622.field8776[6] = var31;
        class607.field8639[7] = var30;
        class286.field4210[6] = var32;
        class622.field8776[7] = var31;
        class286.field4210[7] = var32;
        for (int var33 = 0; var33 < 8; var33++) {
            float var54 = (float) class607.field8639[var33];
            float var55 = (float) class286.field4210[var33];
            float var56 = (float) class622.field8776[var33];
            float var57 = class692.field9755 * var55 + class67.field991 * var54 + class161.field2491 * var56 + var11;
            float var58 = class14.field170 * var55 + class629.field8925 * var56 + class414.field5687 * var54 + var12;
            float var59 = class224.field3293 * var55 + class481.field6605 * var54 + class329.field4690 * var56 + var10;
            if ((float) this.field1103.field8214 <= var58) {
                if (arg2 > 0) {
                    var58 = arg2;
                }
                float var60 = (float) var18 * var59 / var58 + (float) this.field1103.field8217;
                if (var60 > var15) {
                    var15 = var60;
                }
                float var61 = (float) var19 * var57 / var58 + (float) this.field1103.field8177;
                if (var14 > var60) {
                    var14 = var60;
                }
                if (var61 < var16) {
                    var16 = var61;
                }
                if (var61 > var17) {
                    var17 = var61;
                }
                var13 = true;
            }
        }
        if (var13 && (float) arg4 > var14 && var15 > (float) arg4 && var16 < (float) arg6 && (float) arg6 < var17) {
            if (arg0) {
                return true;
            }
            if (this.field1109 > this.field1103.field8283.length) {
                this.field1103.field8284 = new int[this.field1109];
                this.field1103.field8283 = new int[this.field1109];
            }
            int[] var34 = this.field1103.field8283;
            int[] var35 = this.field1103.field8284;
            for (int var36 = 0; var36 < this.field1035; var36++) {
                float var38 = (float) this.field1085[var36];
                float var39 = (float) this.field1064[var36];
                float var40 = (float) this.field1049[var36];
                float var41 = class224.field3293 * var39 + class481.field6605 * var40 + class329.field4690 * var38 + var10;
                float var42 = class14.field170 * var39 + class629.field8925 * var38 + class414.field5687 * var40 + var12;
                float var43 = class692.field9755 * var39 + class67.field991 * var40 + class161.field2491 * var38 + var11;
                if (((float) this.field1103.field8214 <= var42)) {
                    if (arg2 > 0) {
                        var42 = arg2;
                    }
                    int var48 = (int) ((float) var18 * var41 / var42 + (float) this.field1103.field8217);
                    int var49 = (int) ((float) var19 * var43 / var42 + (float) this.field1103.field8177);
                    int var50 = this.field1058[var36];
                    int var51 = this.field1058[var36 + 1];
                    for (int var52 = var50; var52 < var51; var52++) {
                        int var53 = this.field1023[var52] - 1;
                        if (var53 == -1) {
                            break;
                        }
                        var34[var53] = var48;
                        var35[var53] = var49;
                    }
                } else {
                    int var44 = this.field1058[var36];
                    int var45 = this.field1058[var36 + 1];
                    for (int var46 = var44; var46 < var45; var46++) {
                        int var47 = this.field1023[var46] - 1;
                        if (var47 == -1) {
                            break;
                        }
                        var34[this.field1023[var46] - 1] = -999999;
                    }
                }
            }
            for (int var37 = 0; var37 < this.field1024; var37++) {
                if (var34[this.field1033[var37]] != -999999 && var34[this.field1043[var37]] != -999999 && var34[this.field1000[var37]] != -999999 && this.method673(var34[this.field1033[var37]], -126, var34[this.field1043[var37]], arg4, arg6, var34[this.field1000[var37]], var35[this.field1033[var37]], var35[this.field1043[var37]], var35[this.field1000[var37]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qb", name = "na", descriptor = "()I", line = 5095)
    public final int method547() {
        if (!this.field1012) {
            this.method662((byte) -114);
        }
        field1031++;
        return this.field1015;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)V", line = 5113)
    private final void method672(int arg0, boolean arg1) {
        field995++;
        boolean var3 = this.field1063 != null && this.field1063.field4148 == null;
        boolean var4 = this.field1017 != null && this.field1017.field4148 == null;
        boolean var5 = this.field1060 != null && this.field1060.field4148 == null;
        boolean var6 = this.field1041 != null && this.field1041.field4148 == null;
        if (arg1) {
            var6 &= (this.field993 & 0x8) != 0;
            var3 &= (this.field993 & 0x2) != 0;
            var5 &= (this.field993 & 0x1) != 0;
            var4 &= (this.field993 & 0x4) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        if (arg0 != 7) {
            this.field1035 = 121;
        }
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
        if (this.field1103.field8238.field6002.length >= (this.field1109 * var7)) {
            this.field1103.field8238.field5983 = 0;
        } else {
            this.field1103.field8238 = new class501((this.field1109 + 100) * var7);
        }
        class501 var12 = this.field1103.field8238;
        if (var5) {
            if (this.field1103.field8231) {
                for (int var21 = 0; var21 < this.field1035; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field1049[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field1085[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field1064[var21]);
                    int var25 = this.field1058[var21];
                    int var26 = this.field1058[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field1023[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field5983 = var7 * var28;
                        var12.method2548(var22, (byte) -119);
                        var12.method2548(var23, (byte) -123);
                        var12.method2548(var24, (byte) -114);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field1035; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field1049[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field1085[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field1064[var13]);
                    int var17 = this.field1058[var13];
                    int var18 = this.field1058[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field1023[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field5983 = var7 * var20;
                        var12.method2539(false, var14);
                        var12.method2539(false, var15);
                        var12.method2539(false, var16);
                    }
                }
            }
        }
        if (var3) {
            if (this.field1017 == null) {
                short[] var29;
                short[] var30;
                short[] var31;
                byte[] var32;
                if (this.field1032 == null) {
                    var31 = this.field1061;
                    var32 = this.field1025;
                    var29 = this.field1088;
                    var30 = this.field1042;
                } else {
                    var29 = this.field1032.field2513;
                    var30 = this.field1032.field2515;
                    var31 = this.field1032.field2510;
                    var32 = this.field1032.field2514;
                }
                float var33 = this.field1103.field8278[0];
                float var34 = this.field1103.field8278[1];
                float var35 = this.field1103.field8278[2];
                float var36 = this.field1103.field8243;
                float var37 = this.field1103.field8173 * 768.0F / (float) this.field1097;
                float var38 = this.field1103.field8265 * 768.0F / (float) this.field1097;
                for (int var39 = 0; var39 < this.field1024; var39++) {
                    int var40 = this.method661(this.field1089[var39], this.field1101, this.field1110[var39], this.field1016[var39], (byte) -76);
                    float var41 = (float) (var40 >>> 24) * this.field1103.field8273;
                    float var42 = (float) (var40 >> 8 & 0xFF) * this.field1103.field8193;
                    float var43 = (float) (var40 >> 16 & 0xFF) * this.field1103.field8202;
                    short var44 = this.field1033[var39];
                    short var45 = (short) var32[var44];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var29[var44] * var35 + (float) var30[var44] * var34 + (float) var31[var44] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var29[var44] * var35 + (float) var30[var44] * var34 + (float) var31[var44] * var33) / (float) (var45 * 256);
                    }
                    float var47 = ((var46 < 0.0F) ? var38 : var37) * var46 + var36;
                    int var48 = (int) (var41 * var47);
                    int var49 = (int) (var43 * var47);
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
                    int var50 = (int) (var42 * var47);
                    var12.field5983 = var9 + (var7 * var44);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method2524(false, var48);
                    var12.method2524(false, var49);
                    var12.method2524(false, var50);
                    var12.method2524(false, 255 - (this.field1110[var39] & 0xFF));
                    short var51 = this.field1043[var39];
                    short var52 = (short) var32[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var29[var51] * var35 + (float) var30[var51] * var34 + (float) var31[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var29[var51] * var35 + (float) var30[var51] * var34 + (float) var31[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = var36 + (var53 < 0.0F ? var38 : var37) * var53;
                    int var55 = (int) (var41 * var54);
                    int var56 = (int) (var43 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var42 * var54);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.field5983 = var7 * var51 + var9;
                    var12.method2524(false, var55);
                    var12.method2524(false, var56);
                    var12.method2524(false, var57);
                    var12.method2524(false, 255 - (this.field1110[var39] & 0xFF));
                    short var58 = this.field1000[var39];
                    short var59 = (short) var32[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var29[var58] * var35 + (float) var30[var58] * var34 + (float) var31[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var29[var58] * var35 + (float) var30[var58] * var34 + (float) var31[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = var36 + ((var60 < 0.0F) ? var38 : var37) * var60;
                    int var62 = (int) (var41 * var61);
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
                    int var64 = (int) (var42 * var61);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.field5983 = var7 * var58 + var9;
                    var12.method2524(false, var62);
                    var12.method2524(false, var63);
                    var12.method2524(false, var64);
                    var12.method2524(false, 255 - (this.field1110[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field1024; var65++) {
                    int var66 = this.method661(this.field1089[var65], this.field1101, this.field1110[var65], this.field1016[var65], (byte) -76);
                    var12.field5983 = var9 + (this.field1033[var65] * var7);
                    var12.method2548(var66, (byte) -117);
                    var12.field5983 = this.field1043[var65] * var7 + var9;
                    var12.method2548(var66, (byte) -88);
                    var12.field5983 = this.field1000[var65] * var7 + var9;
                    var12.method2548(var66, (byte) -106);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field1032 == null) {
                var67 = this.field1025;
                var68 = this.field1088;
                var69 = this.field1061;
                var70 = this.field1042;
            } else {
                var68 = this.field1032.field2513;
                var67 = this.field1032.field2514;
                var70 = this.field1032.field2515;
                var69 = this.field1032.field2510;
            }
            float var71 = 3.0F / (float) this.field1097;
            float var72 = 3.0F / (float) (this.field1097 + (this.field1097 / 2));
            var12.field5983 = var10;
            if (this.field1103.field8231) {
                for (int var73 = 0; var73 < this.field1109; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2926((byte) 66, (float) var69[var73] * var72);
                        var12.method2926((byte) 87, (float) var70[var73] * var72);
                        var12.method2926((byte) 88, (float) var68[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2926((byte) 60, (float) var69[var73] * var75);
                        var12.method2926((byte) 94, (float) var70[var73] * var75);
                        var12.method2926((byte) 119, (float) var68[var73] * var75);
                    }
                    var12.field5983 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field1109; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2925((float) var69[var76] * var72, true);
                        var12.method2925((float) var70[var76] * var72, true);
                        var12.method2925((float) var68[var76] * var72, true);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2925((float) var69[var76] * var78, true);
                        var12.method2925((float) var70[var76] * var78, true);
                        var12.method2925((float) var68[var76] * var78, true);
                    }
                    var12.field5983 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field5983 = var11;
            if (this.field1103.field8231) {
                for (int var79 = 0; var79 < this.field1109; var79++) {
                    var12.method2926((byte) 79, this.field1087[var79]);
                    var12.method2926((byte) 69, this.field1013[var79]);
                    var12.field5983 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field1109; var80++) {
                    var12.method2925(this.field1087[var80], true);
                    var12.method2925(this.field1013[var80], true);
                    var12.field5983 += var7 - 8;
                }
            }
        }
        var12.field5983 = this.field1109 * var7;
        class305 var81;
        if (arg1) {
            if (this.field1094 == null) {
                this.field1094 = this.field1103.method3336(var12.field6002, var7, var12.field5983, (byte) 105, true);
            } else {
                this.field1094.method1332(var12.field6002, var12.field5983, var7, 30192);
            }
            var81 = this.field1094;
            this.field993 = 0;
        } else {
            var81 = this.field1103.method3336(var12.field6002, var7, var12.field5983, (byte) 87, false);
            this.field1051 = true;
        }
        if (var5) {
            this.field1060.field4146 = var8;
            this.field1060.field4148 = var81;
        }
        if (var6) {
            this.field1041.field4146 = var11;
            this.field1041.field4148 = var81;
        }
        if (var3) {
            this.field1063.field4148 = var81;
            this.field1063.field4146 = var9;
        }
        if (var4) {
            this.field1017.field4148 = var81;
            this.field1017.field4146 = var10;
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "()[Lpi;", line = 5630)
    public final class335[] method590() {
        field1068++;
        return this.field1113;
    }

    @OriginalMember(owner = "client!qb", name = "HA", descriptor = "()I", line = 5646)
    public final int method525() {
        field1019++;
        if (!this.field1012) {
            this.method662((byte) -84);
        }
        return this.field1070;
    }

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "(I)V", line = 5671)
    public final void method523(int arg0) {
        field1050++;
        this.field1037 = arg0;
        if (this.field1032 != null && (this.field1037 & 0x10000) == 0) {
            this.field1025 = this.field1032.field2514;
            this.field1042 = this.field1032.field2515;
            this.field1061 = this.field1032.field2510;
            this.field1088 = this.field1032.field2513;
            this.field1032 = null;
        }
        this.field1051 = true;
        this.method658(-19077);
    }

    @OriginalMember(owner = "client!qb", name = "aa", descriptor = "(SS)V", line = 5695)
    public final void method594(short arg0, short arg1) {
        field1054++;
        class103 var3 = this.field1103.field6447;
        for (int var4 = 0; var4 < this.field1024; var4++) {
            if (this.field1016[var4] == arg0) {
                this.field1016[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class719 var7 = var3.method847(arg0 & 0xFFFF, -106);
            var5 = var7.field10046;
            var6 = var7.field10043;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class719 var10 = var3.method847(arg1 & 0xFFFF, -117);
            if (var10.field10028 != 0 || var10.field10038 != 0) {
                this.field1065 = true;
            }
            var8 = var10.field10046;
            var9 = var10.field10043;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field1026 != null) {
            for (int var11 = 0; var11 < this.field1009; var11++) {
                class615 var12 = this.field1026[var11];
                class531 var13 = this.field1092[var11];
                var13.field7394 = var13.field7394 & 0xFF000000 | class789.field10788[this.field1089[var12.field8722] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1063 != null) {
            this.field1063.field4148 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIII)Z", line = 5773)
    private final boolean method673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 >= -124) {
            this.field1097 = -82;
        }
        field1072++;
        if (arg4 < arg6 && arg4 < arg7 && arg4 < arg8) {
            return false;
        } else if (arg6 < arg4 && arg7 < arg4 && arg8 < arg4) {
            return false;
        } else if (arg3 < arg0 && arg2 > arg3 && arg3 < arg5) {
            return false;
        } else {
            return arg0 >= arg3 || arg3 <= arg2 || arg3 <= arg5;
        }
    }
}
