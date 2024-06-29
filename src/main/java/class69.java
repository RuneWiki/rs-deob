import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class69 extends class198 {

    @OriginalMember(owner = "client!ri", name = "ab", descriptor = "Z")
    private boolean field1149 = false;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    private int field1111 = 0;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    private int field1129 = 0;

    @OriginalMember(owner = "client!ri", name = "pb", descriptor = "Z")
    private boolean field1164 = true;

    @OriginalMember(owner = "client!ri", name = "ub", descriptor = "I")
    private int field1169 = 0;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    private int field1133 = 0;

    @OriginalMember(owner = "client!ri", name = "gc", descriptor = "I")
    private int field1207 = 0;

    @OriginalMember(owner = "client!ri", name = "yb", descriptor = "Lbl;")
    private class442 field1173;

    @OriginalMember(owner = "client!ri", name = "ob", descriptor = "Lot;")
    private class400 field1163;

    @OriginalMember(owner = "client!ri", name = "Hb", descriptor = "Lot;")
    private class400 field1182;

    @OriginalMember(owner = "client!ri", name = "cb", descriptor = "Lot;")
    private class400 field1151;

    @OriginalMember(owner = "client!ri", name = "bc", descriptor = "Lot;")
    private class400 field1202;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Lfu;")
    private class255 field1110;

    @OriginalMember(owner = "client!ri", name = "hb", descriptor = "I")
    private int field1156;

    @OriginalMember(owner = "client!ri", name = "tb", descriptor = "I")
    private int field1168;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "[I")
    private int[] field1125;

    @OriginalMember(owner = "client!ri", name = "Rb", descriptor = "[I")
    private int[] field1192;

    @OriginalMember(owner = "client!ri", name = "Zb", descriptor = "[I")
    private int[] field1200;

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "[I")
    private int[] field1147;

    @OriginalMember(owner = "client!ri", name = "lb", descriptor = "[S")
    private short[] field1160;

    @OriginalMember(owner = "client!ri", name = "fc", descriptor = "[Lma;")
    private class10[] field1206;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "[Loo;")
    private class425[] field1139;

    @OriginalMember(owner = "client!ri", name = "xb", descriptor = "I")
    private int field1172;

    @OriginalMember(owner = "client!ri", name = "Kb", descriptor = "[Lfa;")
    private class149[] field1185;

    @OriginalMember(owner = "client!ri", name = "Wb", descriptor = "[Lnm;")
    private class316[] field1197;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "S")
    private short field1137;

    @OriginalMember(owner = "client!ri", name = "nb", descriptor = "[S")
    private short[] field1162;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "[S")
    private short[] field1142;

    @OriginalMember(owner = "client!ri", name = "gb", descriptor = "[S")
    private short[] field1155;

    @OriginalMember(owner = "client!ri", name = "Yb", descriptor = "[S")
    private short[] field1199;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "[S")
    private short[] field1118;

    @OriginalMember(owner = "client!ri", name = "qb", descriptor = "[F")
    private float[] field1165;

    @OriginalMember(owner = "client!ri", name = "pc", descriptor = "[S")
    private short[] field1216;

    @OriginalMember(owner = "client!ri", name = "Tb", descriptor = "[F")
    private float[] field1194;

    @OriginalMember(owner = "client!ri", name = "eb", descriptor = "S")
    private short field1153;

    @OriginalMember(owner = "client!ri", name = "mc", descriptor = "[B")
    private byte[] field1213;

    @OriginalMember(owner = "client!ri", name = "rc", descriptor = "[B")
    private byte[] field1218;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "[S")
    private short[] field1130;

    @OriginalMember(owner = "client!ri", name = "Ub", descriptor = "[S")
    private short[] field1195;

    @OriginalMember(owner = "client!ri", name = "Qb", descriptor = "[S")
    private short[] field1191;

    @OriginalMember(owner = "client!ri", name = "fb", descriptor = "[S")
    private short[] field1154;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "[I")
    private int[] field1143;

    @OriginalMember(owner = "client!ri", name = "ic", descriptor = "[[I")
    private int[][] field1209;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "[[I")
    private int[][] field1134;

    @OriginalMember(owner = "client!ri", name = "vb", descriptor = "[[I")
    private int[][] field1170;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public static int field1136 = 0;

    @OriginalMember(owner = "client!ri", name = "Lb", descriptor = "Loe;")
    public static class127 field1186;

    @OriginalMember(owner = "client!ri", name = "cc", descriptor = "Z")
    public static boolean field1203;

    @OriginalMember(owner = "client!ri", name = "nc", descriptor = "[I")
    public static int[] field1214;

    @OriginalMember(owner = "client!ri", name = "Ob", descriptor = "B")
    private byte field1189;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!ri", name = "bb", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!ri", name = "db", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ri", name = "ib", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ri", name = "mb", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!ri", name = "rb", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!ri", name = "sb", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!ri", name = "wb", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!ri", name = "zb", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!ri", name = "Ab", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!ri", name = "Bb", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!ri", name = "Cb", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!ri", name = "Db", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!ri", name = "Eb", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!ri", name = "Fb", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!ri", name = "Gb", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!ri", name = "Ib", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!ri", name = "Mb", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!ri", name = "Nb", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!ri", name = "Pb", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ri", name = "Sb", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!ri", name = "Vb", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!ri", name = "Xb", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!ri", name = "ac", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ri", name = "hc", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!ri", name = "jc", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ri", name = "kc", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ri", name = "qc", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!ri", name = "sc", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ri", name = "tc", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!ri", name = "uc", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "Leo;")
    private class186 field1132;

    @OriginalMember(owner = "client!ri", name = "ec", descriptor = "Llm;")
    private class330 field1205;

    @OriginalMember(owner = "client!ri", name = "Jb", descriptor = "Lph;")
    private class438 field1184;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "S")
    private short field1115;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "S")
    private short field1126;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "S")
    private short field1141;

    @OriginalMember(owner = "client!ri", name = "jb", descriptor = "S")
    private short field1158;

    @OriginalMember(owner = "client!ri", name = "kb", descriptor = "S")
    private short field1159;

    @OriginalMember(owner = "client!ri", name = "dc", descriptor = "S")
    private short field1204;

    @OriginalMember(owner = "client!ri", name = "oc", descriptor = "S")
    private short field1215;

    @OriginalMember(owner = "client!ri", name = "lc", descriptor = "[[I")
    public static int[][] field1212;

    static {
        new class423("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field1186 = new class127(53, -1);
        field1203 = true;
        field1214 = new int[13];
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILun;)V", line = 11)
    private final void method460(int arg0, class279 arg1) {
        field1138++;
        if (this.field1129 > class159.field2508.length) {
            class159.field2508 = new int[this.field1129];
            class462.field7104 = new int[this.field1129];
        }
        for (int var3 = 0; var3 < this.field1133; var3++) {
            int var14 = (this.field1200[var3] - (this.field1192[var3] * this.field1173.field6790 >> 8) >> this.field1173.field6686) - arg1.field4242;
            int var15 = (this.field1147[var3] - (this.field1192[var3] * this.field1173.field6748 >> 8) >> this.field1173.field6686) - arg1.field4233;
            int var16 = this.field1125[var3];
            int var17 = this.field1125[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field1216[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class159.field2508[var19] = var14;
                class462.field7104[var19] = var15;
            }
        }
        for (int var4 = 0; var4 < this.field1207; var4++) {
            if (this.field1213 == null || this.field1213[var4] <= 128) {
                short var5 = this.field1191[var4];
                short var6 = this.field1199[var4];
                short var7 = this.field1155[var4];
                int var8 = class159.field2508[var5];
                int var9 = class159.field2508[var6];
                int var10 = class159.field2508[var7];
                int var11 = class462.field7104[var5];
                int var12 = class462.field7104[var6];
                int var13 = class462.field7104[var7];
                if ((var12 - var13) * (var8 - var9) - (var10 - var9) * (var12 - var11) > 0) {
                    arg1.method1709(var10, var8, var13, (byte) -1, var12, var11, var9);
                }
            }
        }
        if (arg0 != -1) {
            this.method467(70);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lql;Lni;I)V", line = 95)
    public final void method461(class496 arg0, class346 arg1, int arg2) {
        field1176++;
        if (this.field1129 == 0) {
            return;
        }
        class34 var4 = this.field1173.field6780;
        class34 var5 = (class34) arg0;
        if (!this.field1149) {
            this.method465(8);
        }
        this.method491(var5, -57);
        class402.field5858 = var4.field467 * var5.field456 + var4.field477 * var5.field459 + var4.field472 * var5.field473 + var4.field456;
        class52.field795 = var4.field467 * var5.field472 + var4.field477 * var5.field471 + var4.field472 * var5.field478;
        float var6 = (float) this.field1159 * class52.field795 + class402.field5858;
        float var7 = (float) this.field1215 * class52.field795 + class402.field5858;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = (float) this.field1204 + var6;
            var9 = var7 - (float) this.field1204;
        } else {
            var9 = var6 - (float) this.field1204;
            var8 = (float) this.field1204 + var7;
        }
        if ((this.field1173.field6760 <= var9) || ((float) this.field1173.field6800 >= var8)) {
            return;
        }
        class391.field5732 = var4.field479 * var5.field472 + var4.field488 * var5.field471 + var4.field471 * var5.field478;
        class405.field5888 = var4.field479 * var5.field456 + var4.field488 * var5.field459 + var4.field471 * var5.field473 + var4.field459;
        float var10 = (float) this.field1159 * class391.field5732 + class405.field5888;
        float var11 = (float) this.field1215 * class391.field5732 + class405.field5888;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) this.field1204 + var10) * (float) this.field1173.field6830;
            var13 = ((float) (-this.field1204) + var11) * (float) this.field1173.field6830;
        } else {
            var13 = (var10 - (float) this.field1204) * (float) this.field1173.field6830;
            var12 = ((float) this.field1204 + var11) * (float) this.field1173.field6830;
        }
        if ((this.field1173.field6736 <= var13 / var8) || (this.field1173.field6791 >= var12 / var8)) {
            return;
        }
        class402.field5861 = var4.field476 * var5.field472 + var4.field478 * var5.field478 + var4.field475 * var5.field471;
        class372.field5446 = var4.field476 * var5.field456 + var4.field478 * var5.field473 + var4.field475 * var5.field459 + var4.field473;
        float var14 = (float) this.field1159 * class402.field5861 + class372.field5446;
        float var15 = (float) this.field1215 * class402.field5861 + class372.field5446;
        float var16;
        float var17;
        if ((var15 < var14)) {
            var17 = ((float) this.field1204 + var14) * (float) this.field1173.field6738;
            var16 = (var15 - (float) this.field1204) * (float) this.field1173.field6738;
        } else {
            var16 = (var14 - (float) this.field1204) * (float) this.field1173.field6738;
            var17 = ((float) this.field1204 + var15) * (float) this.field1173.field6738;
        }
        if ((var16 / var8 >= this.field1173.field6757) || (this.field1173.field6810 >= var17 / var8)) {
            return;
        }
        if (arg1 != null || this.field1197 != null) {
            class467.field7170 = var4.field476 * var5.field467 + var4.field478 * var5.field476 + var4.field475 * var5.field479;
            class441.field6471 = var4.field467 * var5.field467 + var4.field477 * var5.field479 + var4.field472 * var5.field476;
            class484.field7400 = var4.field479 * var5.field467 + var4.field488 * var5.field479 + var4.field471 * var5.field476;
            class297.field4511 = var4.field476 * var5.field477 + var4.field478 * var5.field475 + var4.field475 * var5.field488;
            class362.field5346 = var4.field467 * var5.field477 + var4.field477 * var5.field488 + var4.field472 * var5.field475;
            class28.field356 = var4.field479 * var5.field477 + var4.field488 * var5.field488 + var4.field471 * var5.field475;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field1141 + this.field1126 >> 1;
            int var21 = this.field1158 + this.field1115 >> 1;
            int var22 = (int) ((float) var21 * class484.field7400 + (float) this.field1159 * class391.field5732 + (float) var20 * class28.field356 + class405.field5888);
            int var23 = (int) ((float) var21 * class467.field7170 + (float) this.field1159 * class402.field5861 + (float) var20 * class297.field4511 + class372.field5446);
            int var24 = (int) ((float) var21 * class441.field6471 + (float) this.field1159 * class52.field795 + (float) var20 * class362.field5346 + class402.field5858);
            if (this.field1173.field6800 <= var24) {
                arg1.field5127 = this.field1173.field6754 + (this.field1173.field6738 * var23 / var24);
                arg1.field5126 = this.field1173.field6830 * var22 / var24 + this.field1173.field6828;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class484.field7400 + (float) this.field1215 * class391.field5732 + (float) var20 * class28.field356 + class405.field5888);
            int var26 = (int) ((float) var21 * class467.field7170 + (float) this.field1215 * class402.field5861 + (float) var20 * class297.field4511 + class372.field5446);
            int var27 = (int) ((float) var21 * class441.field6471 + (float) this.field1215 * class52.field795 + (float) var20 * class362.field5346 + class402.field5858);
            if (this.field1173.field6800 <= var27) {
                arg1.field5125 = this.field1173.field6830 * var25 / var27 + this.field1173.field6828;
                arg1.field5123 = this.field1173.field6754 + (this.field1173.field6738 * var26 / var27);
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field1173.field6800 > var24 && var27 < this.field1173.field6800) {
                    var19 = false;
                } else if (this.field1173.field6800 > var24) {
                    int var28 = (var27 - this.field1173.field6800 << 16) / (var27 - var24);
                    int var29 = var25 + ((var25 - var22) * var28 >> 16);
                    arg1.field5126 = this.field1173.field6830 * var29 / this.field1173.field6800 + this.field1173.field6828;
                    int var30 = var26 + ((var26 - var23) * var28 >> 16);
                    arg1.field5127 = this.field1173.field6738 * var30 / this.field1173.field6800 + this.field1173.field6754;
                } else if (this.field1173.field6800 > var27) {
                    int var31 = (var24 - this.field1173.field6800 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field5126 = this.field1173.field6830 * var32 / this.field1173.field6800 + this.field1173.field6828;
                    arg1.field5127 = this.field1173.field6738 * var33 / this.field1173.field6800 + this.field1173.field6754;
                }
            }
            if (var19) {
                arg1.field5122 = true;
                if (var24 <= var27) {
                    arg1.field5124 = this.field1173.field6828 + ((this.field1204 + var25) * this.field1173.field6830 / var27) - arg1.field5125;
                } else {
                    arg1.field5124 = this.field1173.field6828 + ((this.field1204 + var22) * this.field1173.field6830 / var24) - arg1.field5126;
                }
            }
        }
        this.field1173.method2576(24997);
        this.field1173.method2634(var5, 127);
        this.method494(-4);
        this.field1173.method2645(4353);
        this.method499(79);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BZ)V", line = 301)
    private final void method462(byte arg0, boolean arg1) {
        field1180++;
        boolean var3 = this.field1202 != null && this.field1202.field5831 == null;
        boolean var4 = this.field1151 != null && this.field1151.field5831 == null;
        boolean var5 = this.field1163 != null && this.field1163.field5831 == null;
        boolean var6 = this.field1182 != null && this.field1182.field5831 == null;
        if (arg1) {
            var4 &= (this.field1189 & 0x4) != 0;
            var3 &= (this.field1189 & 0x2) != 0;
            var6 &= (this.field1189 & 0x8) != 0;
            var5 &= (this.field1189 & 0x1) != 0;
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
        if (arg0 < 85) {
            this.method464();
        }
        if (var7 == 0) {
            return;
        }
        if (class273.field4146.field536.length >= this.field1129 * var7) {
            class273.field4146.field585 = 0;
        } else {
            class273.field4146 = new class315((this.field1129 + 100) * var7);
        }
        if (var5) {
            if (this.field1173.field6745) {
                for (int var20 = 0; var20 < this.field1133; var20++) {
                    int var21 = NativeStream.floatToRawIntBits((float) this.field1200[var20]);
                    int var22 = NativeStream.floatToRawIntBits((float) this.field1192[var20]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field1147[var20]);
                    int var24 = this.field1125[var20];
                    int var25 = this.field1125[var20 + 1];
                    for (int var26 = var24; var26 < var25; var26++) {
                        int var27 = this.field1216[var26] - 1;
                        if (var27 == -1) {
                            break;
                        }
                        class273.field4146.field585 = var7 * var27;
                        class273.field4146.method253(-79, var21);
                        class273.field4146.method253(-82, var22);
                        class273.field4146.method253(-88, var23);
                    }
                }
            } else {
                for (int var12 = 0; var12 < this.field1133; var12++) {
                    int var13 = NativeStream.floatToRawIntBits((float) this.field1200[var12]);
                    int var14 = NativeStream.floatToRawIntBits((float) this.field1192[var12]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field1147[var12]);
                    int var16 = this.field1125[var12];
                    int var17 = this.field1125[var12 + 1];
                    for (int var18 = var16; var18 < var17; var18++) {
                        int var19 = this.field1216[var18] - 1;
                        if (var19 == -1) {
                            break;
                        }
                        class273.field4146.field585 = var7 * var19;
                        class273.field4146.method235((byte) 46, var13);
                        class273.field4146.method235((byte) 46, var14);
                        class273.field4146.method235((byte) 46, var15);
                    }
                }
            }
        }
        if (var3) {
            if (this.field1151 == null) {
                short[] var28;
                short[] var29;
                short[] var30;
                byte[] var31;
                if (this.field1205 == null) {
                    var28 = this.field1118;
                    var29 = this.field1195;
                    var30 = this.field1130;
                    var31 = this.field1218;
                } else {
                    var29 = this.field1205.field4943;
                    var31 = this.field1205.field4942;
                    var28 = this.field1205.field4947;
                    var30 = this.field1205.field4940;
                }
                float var32 = this.field1173.field6798[0];
                float var33 = this.field1173.field6798[1];
                float var34 = this.field1173.field6798[2];
                float var35 = this.field1173.field6756;
                float var36 = this.field1173.field6758 * 768.0F / (float) this.field1153;
                float var37 = this.field1173.field6721 * 768.0F / (float) this.field1153;
                for (int var38 = 0; var38 < this.field1111; var38++) {
                    int var39 = this.method473(this.field1142[var38], this.field1137, this.field1154[var38], (byte) -66, this.field1213[var38]);
                    float var40 = (float) ((var39 & 0xFF16) >> 8) * this.field1173.field6768;
                    float var41 = (float) (var39 >> 16 & 0xFF) * this.field1173.field6715;
                    float var42 = (float) (var39 >>> 24) * this.field1173.field6811;
                    short var43 = this.field1191[var38];
                    short var44 = (short) var31[var43];
                    float var45;
                    if (var44 == 0) {
                        var45 = ((float) var30[var43] * var34 + (float) var28[var43] * var33 + (float) var29[var43] * var32) * 0.0026041667F;
                    } else {
                        var45 = ((float) var30[var43] * var34 + (float) var28[var43] * var33 + (float) var29[var43] * var32) / (float) (var44 * 256);
                    }
                    float var46 = var45 * (var45 < 0.0F ? var37 : var36) + var35;
                    int var47 = (int) (var42 * var46);
                    int var48 = (int) (var41 * var46);
                    if (var47 < 0) {
                        var47 = 0;
                    } else if (var47 > 255) {
                        var47 = 255;
                    }
                    int var49 = (int) (var40 * var46);
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
                    class273.field4146.field585 = var7 * var43 + var9;
                    class273.field4146.method221(-1, var47);
                    class273.field4146.method221(-1, var48);
                    class273.field4146.method221(-1, var49);
                    class273.field4146.method221(-1, 255 - (this.field1213[var38] & 0xFF));
                    short var50 = this.field1199[var38];
                    short var51 = (short) var31[var50];
                    float var52;
                    if (var51 == 0) {
                        var52 = ((float) var30[var50] * var34 + (float) var28[var50] * var33 + (float) var29[var50] * var32) * 0.0026041667F;
                    } else {
                        var52 = ((float) var30[var50] * var34 + (float) var28[var50] * var33 + (float) var29[var50] * var32) / (float) (var51 * 256);
                    }
                    float var53 = var52 * (var52 < 0.0F ? var37 : var36) + var35;
                    int var54 = (int) (var42 * var53);
                    int var55 = (int) (var41 * var53);
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
                    int var56 = (int) (var40 * var53);
                    class273.field4146.field585 = var7 * var50 + var9;
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    class273.field4146.method221(-1, var54);
                    class273.field4146.method221(-1, var55);
                    class273.field4146.method221(-1, var56);
                    class273.field4146.method221(-1, 255 - (this.field1213[var38] & 0xFF));
                    short var57 = this.field1155[var38];
                    short var58 = (short) var31[var57];
                    float var59;
                    if (var58 == 0) {
                        var59 = ((float) var30[var57] * var34 + (float) var28[var57] * var33 + (float) var29[var57] * var32) * 0.0026041667F;
                    } else {
                        var59 = ((float) var30[var57] * var34 + (float) var28[var57] * var33 + (float) var29[var57] * var32) / (float) (var58 * 256);
                    }
                    float var60 = var35 + (var59 < 0.0F ? var37 : var36) * var59;
                    int var61 = (int) (var42 * var60);
                    int var62 = (int) (var41 * var60);
                    if (var61 < 0) {
                        var61 = 0;
                    } else if (var61 > 255) {
                        var61 = 255;
                    }
                    int var63 = (int) (var40 * var60);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    class273.field4146.field585 = var9 + (var7 * var57);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    class273.field4146.method221(-1, var61);
                    class273.field4146.method221(-1, var62);
                    class273.field4146.method221(-1, var63);
                    class273.field4146.method221(-1, 255 - (this.field1213[var38] & 0xFF));
                }
            } else {
                for (int var64 = 0; var64 < this.field1111; var64++) {
                    int var65 = this.method473(this.field1142[var64], this.field1137, this.field1154[var64], (byte) -66, this.field1213[var64]);
                    class273.field4146.field585 = this.field1191[var64] * var7 + var9;
                    class273.field4146.method253(-100, var65);
                    class273.field4146.field585 = this.field1199[var64] * var7 + var9;
                    class273.field4146.method253(-68, var65);
                    class273.field4146.field585 = this.field1155[var64] * var7 + var9;
                    class273.field4146.method253(-123, var65);
                }
            }
        }
        if (var4) {
            short[] var66;
            short[] var67;
            short[] var68;
            byte[] var69;
            if (this.field1205 == null) {
                var66 = this.field1130;
                var67 = this.field1118;
                var68 = this.field1195;
                var69 = this.field1218;
            } else {
                var66 = this.field1205.field4940;
                var67 = this.field1205.field4947;
                var68 = this.field1205.field4943;
                var69 = this.field1205.field4942;
            }
            float var70 = 3.0F / (float) this.field1153;
            float var71 = 3.0F / (float) (this.field1153 + (this.field1153 / 2));
            class273.field4146.field585 = var10;
            if (this.field1173.field6745) {
                for (int var75 = 0; var75 < this.field1129; var75++) {
                    int var76 = var69[var75] & 0xFF;
                    if (var76 == 0) {
                        class273.field4146.method1878((byte) -10, (float) var68[var75] * var71);
                        class273.field4146.method1878((byte) 126, (float) var67[var75] * var71);
                        class273.field4146.method1878((byte) 56, (float) var66[var75] * var71);
                    } else {
                        float var77 = var70 / (float) var76;
                        class273.field4146.method1878((byte) 36, (float) var68[var75] * var77);
                        class273.field4146.method1878((byte) 16, (float) var67[var75] * var77);
                        class273.field4146.method1878((byte) -92, (float) var66[var75] * var77);
                    }
                    class273.field4146.field585 += var7 - 12;
                }
            } else {
                for (int var72 = 0; var72 < this.field1129; var72++) {
                    int var73 = var69[var72] & 0xFF;
                    if (var73 == 0) {
                        class273.field4146.method1881((byte) -40, (float) var68[var72] * var71);
                        class273.field4146.method1881((byte) -40, (float) var67[var72] * var71);
                        class273.field4146.method1881((byte) -40, (float) var66[var72] * var71);
                    } else {
                        float var74 = var70 / (float) var73;
                        class273.field4146.method1881((byte) -40, (float) var68[var72] * var74);
                        class273.field4146.method1881((byte) -40, (float) var67[var72] * var74);
                        class273.field4146.method1881((byte) -40, (float) var66[var72] * var74);
                    }
                    class273.field4146.field585 += var7 - 12;
                }
            }
        }
        if (var6) {
            class273.field4146.field585 = var11;
            if (this.field1173.field6745) {
                for (int var79 = 0; var79 < this.field1129; var79++) {
                    class273.field4146.method1878((byte) -4, this.field1194[var79]);
                    class273.field4146.method1878((byte) -128, this.field1165[var79]);
                    class273.field4146.field585 += var7 - 8;
                }
            } else {
                for (int var78 = 0; var78 < this.field1129; var78++) {
                    class273.field4146.method1881((byte) -40, this.field1194[var78]);
                    class273.field4146.method1881((byte) -40, this.field1165[var78]);
                    class273.field4146.field585 += var7 - 8;
                }
            }
        }
        class273.field4146.field585 = this.field1129 * var7;
        class186 var80;
        if (arg1) {
            if (this.field1132 == null) {
                this.field1132 = this.field1173.method2614(class273.field4146.field536, class273.field4146.field585, var7, true, -1);
            } else {
                this.field1132.method1153(class273.field4146.field536, class273.field4146.field585, -2805, var7);
            }
            this.field1189 = 0;
            var80 = this.field1132;
        } else {
            var80 = this.field1173.method2614(class273.field4146.field536, class273.field4146.field585, var7, false, -1);
            this.field1164 = true;
        }
        if (var5) {
            this.field1163.field5831 = var80;
            this.field1163.field5828 = var8;
        }
        if (var6) {
            this.field1182.field5831 = var80;
            this.field1182.field5828 = var11;
        }
        if (var3) {
            this.field1202.field5831 = var80;
            this.field1202.field5828 = var9;
        }
        if (var4) {
            this.field1151.field5828 = var10;
            this.field1151.field5831 = var80;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILfo;Lfo;III)V", line = 819)
    public final void method463(int arg0, int arg1, class343 arg2, class343 arg3, int arg4, int arg5, int arg6) {
        field1145++;
        if (!this.field1149) {
            this.method465(8);
        }
        int var8 = arg4 + this.field1141;
        int var9 = this.field1126 + arg4;
        int var10 = this.field1158 + arg6;
        int var11 = this.field1115 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field5108 <= (arg2.field5107 + var9 >> arg2.field5112) || var10 < 0 || (arg2.field5107 + var11 >> arg2.field5112) >= arg2.field5105) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || var9 + arg3.field5107 >> arg3.field5112 >= arg3.field5108 || var10 < 0 || arg3.field5105 <= arg3.field5107 + var11 >> arg3.field5112) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field5112;
            int var13 = arg2.field5107 - (1 - var9) >> arg2.field5112;
            int var14 = var10 >> arg2.field5112;
            int var15 = var11 - (1 - arg2.field5107) >> arg2.field5112;
            if (arg2.method318(var12, var14) == arg5 && arg5 == arg2.method318(var13, var14) && arg2.method318(var12, var15) == arg5 && arg2.method318(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field1133; var32++) {
                this.field1192[var32] = this.field1192[var32] + arg2.method314(this.field1200[var32] + arg4, this.field1147[var32] - -arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var29 = this.field1159;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field1133; var30++) {
                int var31 = (this.field1192[var30] << 16) / var29;
                if (var31 < arg1) {
                    this.field1192[var30] += (arg1 - var31) * (arg2.method314(this.field1200[var30] + arg4, this.field1147[var30] + arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var16 = (arg1 & 0xFF) * 4;
            int var17 = ((arg1 & 0xFFDF) >> 8) * 4;
            int var18 = arg1 >> 16 & 0xFF << 6;
            int var19 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var16 >> 1) < 0 || (arg2.field5108 << arg2.field5112) <= ((var16 >> 1) + arg2.field5107 + arg4) || arg6 - (var17 >> 1) < 0 || arg2.field5105 << arg2.field5112 <= (var17 >> 1) + arg6 + arg2.field5107) {
                return;
            }
            this.method1228(var19, arg4, var16, arg2, arg6, var18, -27477, arg5, var17);
        } else if (arg0 == 4) {
            int var20 = this.field1215 - this.field1159;
            for (int var21 = 0; var21 < this.field1133; var21++) {
                this.field1192[var21] = this.field1192[var21] - arg5 - (-arg3.method314(this.field1200[var21] + arg4, this.field1147[var21] + arg6) + -var20);
            }
        } else if (arg0 == 5) {
            int var22 = this.field1215 - this.field1159;
            for (int var23 = 0; var23 < this.field1133; var23++) {
                int var24 = this.field1200[var23] + arg4;
                int var25 = this.field1147[var23] + arg6;
                int var26 = arg2.method314(var24, var25);
                int var27 = arg3.method314(var24, var25);
                int var28 = var26 - var27;
                this.field1192[var23] = ((this.field1192[var23] << 8) / var22 * var28 >> 8) + var26 - arg5;
            }
        }
        this.field1149 = false;
        if (this.field1163 != null) {
            this.field1163.field5831 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "()I", line = 972)
    public final int method464() {
        field1109++;
        return this.field1153;
    }

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "(I)V", line = 981)
    private final void method465(int arg0) {
        field1127++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1133; var10++) {
            int var11 = this.field1200[var10];
            int var12 = this.field1192[var10];
            if (var11 < var2) {
                var2 = var11;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = this.field1147[var10];
            if (var3 > var12) {
                var3 = var12;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var13 * var13 + (var12 * var12);
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field1115 = (short) var7;
        this.field1215 = (short) var6;
        this.field1126 = (short) var5;
        this.field1158 = (short) var4;
        this.field1141 = (short) var2;
        this.field1159 = (short) var3;
        this.field1204 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        if (arg0 != 8) {
            this.field1164 = false;
        }
        this.field1149 = true;
    }

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "()I", line = 1076)
    public final int method466() {
        field1187++;
        if (!this.field1149) {
            this.method465(8);
        }
        return this.field1158;
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V", line = 1088)
    public final void method467(int arg0) {
        field1113++;
        int var2 = class195.field3075[arg0];
        int var3 = class195.field3077[arg0];
        for (int var4 = 0; var4 < this.field1133; var4++) {
            int var5 = this.field1200[var4] * var3 + this.field1192[var4] * var2 >> 15;
            this.field1192[var4] = this.field1192[var4] * var3 - (this.field1200[var4] * var2) >> 15;
            this.field1200[var4] = var5;
        }
        this.field1149 = false;
        if (this.field1163 != null) {
            this.field1163.field5831 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "()V", line = 1124)
    public final void method468() {
        for (int var1 = 0; var1 < this.field1169; var1++) {
            this.field1200[var1] = this.field1200[var1] + 7 >> 4;
            this.field1192[var1] = this.field1192[var1] + 7 >> 4;
            this.field1147[var1] = this.field1147[var1] + 7 >> 4;
        }
        field1114++;
        if (this.field1163 != null) {
            this.field1163.field5831 = null;
        }
        this.field1149 = false;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()Z", line = 1147)
    public final boolean method469() {
        field1166++;
        if (this.field1142 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field1142.length; var1++) {
            if (this.field1142[var1] != -1 && !this.field1173.field4784.method61(this.field1142[var1], (byte) -117)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V", line = 1173)
    public final void method470(int arg0) {
        field1148++;
        int var2 = class195.field3075[arg0];
        int var3 = class195.field3077[arg0];
        for (int var4 = 0; var4 < this.field1133; var4++) {
            int var5 = this.field1192[var4] * var3 - this.field1147[var4] * var2 >> 15;
            this.field1147[var4] = this.field1192[var4] * var2 + (this.field1147[var4] * var3) >> 15;
            this.field1192[var4] = var5;
        }
        this.field1149 = false;
        if (this.field1163 != null) {
            this.field1163.field5831 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "()[Lma;", line = 1204)
    public final class10[] method471() {
        field1211++;
        return this.field1206;
    }

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "()I", line = 1218)
    public final int method472() {
        field1210++;
        return this.field1137;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(SIIBB)I", line = 1230)
    private final int method473(short arg0, int arg1, int arg2, byte arg3, byte arg4) {
        field1121++;
        if (arg3 != -66) {
            this.method486(74, 104, 64, 0);
        }
        int var6 = class327.field4907[class365.method2209(arg1, false, arg2)];
        if (arg0 != -1) {
            class48 var7 = this.field1173.field4784.method59(arg0 & 0xFFFF, 21645);
            int var8 = var7.field727 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg1 < 0) {
                    var9 = 0;
                } else if (arg1 <= 127) {
                    var9 = arg1 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00) * var8 + ((var6 & 0xFF00) * var11) & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field723 & 0xFF;
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
                var6 = ((var13 & 0xC000FF00) << 8) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg4 & 0xFF);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lcd;IIIZ)V", line = 1302)
    public final void method474(class198 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1146++;
        class69 var6 = (class69) arg0;
        if (this.field1111 == 0 || var6.field1111 == 0) {
            return;
        }
        int var7 = var6.field1133;
        int[] var8 = var6.field1200;
        int[] var9 = var6.field1192;
        int[] var10 = var6.field1147;
        short[] var11 = var6.field1195;
        short[] var12 = var6.field1118;
        short[] var13 = var6.field1130;
        byte[] var14 = var6.field1218;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field1205 == null) {
            var15 = null;
            var18 = null;
            var17 = null;
            var16 = null;
        } else {
            var15 = this.field1205.field4947;
            var16 = this.field1205.field4942;
            var17 = this.field1205.field4943;
            var18 = this.field1205.field4940;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field1205 == null) {
            var20 = null;
            var22 = null;
            var19 = null;
            var21 = null;
        } else {
            var19 = var6.field1205.field4940;
            var20 = var6.field1205.field4947;
            var21 = var6.field1205.field4942;
            var22 = var6.field1205.field4943;
        }
        int[] var23 = var6.field1125;
        short[] var24 = var6.field1216;
        if (!var6.field1149) {
            var6.method465(8);
        }
        short var25 = var6.field1159;
        short var26 = var6.field1215;
        short var27 = var6.field1141;
        short var28 = var6.field1126;
        short var29 = var6.field1158;
        short var30 = var6.field1115;
        for (int var31 = 0; var31 < this.field1133; var31++) {
            int var32 = this.field1192[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field1200[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field1147[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field1125[var31];
                        int var37 = this.field1125[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1216[var38] - 1;
                            if (var35 == -1 || this.field1218[var35] != 0) {
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
                                            this.field1205 = new class330();
                                            var17 = this.field1205.field4943 = class215.method1322(this.field1195, (byte) 96);
                                            var15 = this.field1205.field4947 = class215.method1322(this.field1118, (byte) 96);
                                            var18 = this.field1205.field4940 = class215.method1322(this.field1130, (byte) 96);
                                            var16 = this.field1205.field4942 = class264.method1613(this.field1218, (byte) -30);
                                        }
                                        if (var22 == null) {
                                            class330 var44 = var6.field1205 = new class330();
                                            var22 = var44.field4943 = class215.method1322(var11, (byte) 96);
                                            var20 = var44.field4947 = class215.method1322(var12, (byte) 96);
                                            var19 = var44.field4940 = class215.method1322(var13, (byte) 96);
                                            var21 = var44.field4942 = class264.method1613(var14, (byte) -35);
                                        }
                                        short var45 = this.field1195[var35];
                                        short var46 = this.field1118[var35];
                                        short var47 = this.field1130[var35];
                                        byte var48 = this.field1218[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var22[var52] += var45;
                                                var20[var52] += var46;
                                                var19[var52] += var47;
                                                var21[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var42];
                                        int var54 = this.field1125[var31];
                                        byte var55 = var14[var42];
                                        int var56 = this.field1125[var31 + 1];
                                        short var57 = var13[var42];
                                        short var58 = var12[var42];
                                        for (int var59 = var54; var59 < var56; var59++) {
                                            int var60 = this.field1216[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var17[var60] += var53;
                                                var15[var60] += var58;
                                                var18[var60] += var57;
                                                var16[var60] += var55;
                                            }
                                        }
                                        if (this.field1151 == null && this.field1202 != null) {
                                            this.field1202.field5831 = null;
                                        }
                                        if (this.field1151 != null) {
                                            this.field1151.field5831 = null;
                                        }
                                        if (var6.field1151 == null && var6.field1202 != null) {
                                            var6.field1202.field5831 = null;
                                        }
                                        if (var6.field1151 != null) {
                                            var6.field1151.field5831 = null;
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

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIZIII)Z", line = 1577)
    private final boolean method475(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        if (arg5) {
            this.field1139 = null;
        }
        field1171++;
        if (arg7 > arg2 && arg2 < arg8 && arg2 < arg4) {
            return false;
        } else if (arg7 < arg2 && arg8 < arg2 && arg4 < arg2) {
            return false;
        } else if (arg3 < arg6 && arg3 < arg1 && arg3 < arg0) {
            return false;
        } else {
            return arg3 <= arg6 || arg1 >= arg3 || arg3 <= arg0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "(I)V", line = 1602)
    public final void method476(int arg0) {
        field1220++;
        int var2 = class195.field3075[arg0];
        int var3 = class195.field3077[arg0];
        for (int var4 = 0; var4 < this.field1133; var4++) {
            int var5 = this.field1147[var4] * var2 + (this.field1200[var4] * var3) >> 15;
            this.field1147[var4] = this.field1147[var4] * var3 - this.field1200[var4] * var2 >> 15;
            this.field1200[var4] = var5;
        }
        if (this.field1163 != null) {
            this.field1163.field5831 = null;
        }
        this.field1149 = false;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 1631)
    public final void method477(int arg0) {
        this.field1153 = (short) arg0;
        if (this.field1202 != null) {
            this.field1202.field5831 = null;
        }
        field1140++;
        if (this.field1151 != null) {
            this.field1151.field5831 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)V", line = 1649)
    public static final void method478(int arg0, byte arg1) {
        field1179++;
        class64 var2 = class230.method1387(arg0, (byte) 40, 8);
        var2.method446(-20033);
        if (arg1 > -32) {
            field1186 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "()I", line = 1662)
    public final int method479() {
        if (!this.field1149) {
            this.method465(8);
        }
        field1167++;
        return this.field1204;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lql;Lni;II)V", line = 1673)
    public final void method480(class496 arg0, class346 arg1, int arg2, int arg3) {
        field1120++;
        if (this.field1129 == 0) {
            return;
        }
        class34 var5 = this.field1173.field6780;
        if (!this.field1149) {
            this.method465(8);
        }
        class34 var6 = (class34) arg0;
        class402.field5858 = var5.field467 * var6.field456 + var5.field477 * var6.field459 + var5.field472 * var6.field473 + var5.field456;
        class52.field795 = var5.field467 * var6.field472 + var5.field477 * var6.field471 + var5.field472 * var6.field478;
        float var7 = (float) this.field1159 * class52.field795 + class402.field5858;
        float var8 = (float) this.field1215 * class52.field795 + class402.field5858;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var9 = var8 - (float) this.field1204;
            var10 = (float) this.field1204 + var7;
        } else {
            var9 = (float) (-this.field1204) + var7;
            var10 = (float) this.field1204 + var8;
        }
        if ((var9 >= this.field1173.field6816) || (var10 <= (float) this.field1173.field6800)) {
            return;
        }
        class391.field5732 = var5.field479 * var6.field472 + var5.field488 * var6.field471 + var5.field471 * var6.field478;
        class405.field5888 = var5.field479 * var6.field456 + var5.field488 * var6.field459 + var5.field471 * var6.field473 + var5.field459;
        float var11 = (float) this.field1159 * class391.field5732 + class405.field5888;
        float var12 = (float) this.field1215 * class391.field5732 + class405.field5888;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var13 = ((float) this.field1204 + var11) * (float) this.field1173.field6830;
            var14 = ((float) (-this.field1204) + var12) * (float) this.field1173.field6830;
        } else {
            var13 = ((float) this.field1204 + var12) * (float) this.field1173.field6830;
            var14 = ((float) (-this.field1204) + var11) * (float) this.field1173.field6830;
        }
        if ((this.field1173.field6736 <= var14 / (float) arg2) || (var13 / (float) arg2 <= this.field1173.field6791)) {
            return;
        }
        class372.field5446 = var5.field476 * var6.field456 + var5.field478 * var6.field473 + var5.field475 * var6.field459 + var5.field473;
        class402.field5861 = var5.field476 * var6.field472 + var5.field478 * var6.field478 + var5.field475 * var6.field471;
        float var15 = (float) this.field1159 * class402.field5861 + class372.field5446;
        float var16 = (float) this.field1215 * class402.field5861 + class372.field5446;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = ((float) (-this.field1204) + var16) * (float) this.field1173.field6738;
            var18 = ((float) this.field1204 + var15) * (float) this.field1173.field6738;
        } else {
            var17 = (var15 - (float) this.field1204) * (float) this.field1173.field6738;
            var18 = ((float) this.field1204 + var16) * (float) this.field1173.field6738;
        }
        if ((this.field1173.field6757 <= var17 / (float) arg2) || (this.field1173.field6810 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field1197 != null) {
            class441.field6471 = var5.field467 * var6.field467 + var5.field477 * var6.field479 + var5.field472 * var6.field476;
            class484.field7400 = var5.field479 * var6.field467 + var5.field488 * var6.field479 + var5.field471 * var6.field476;
            class467.field7170 = var5.field476 * var6.field467 + var5.field478 * var6.field476 + var5.field475 * var6.field479;
            class297.field4511 = var5.field476 * var6.field477 + var5.field478 * var6.field475 + var5.field475 * var6.field488;
            class362.field5346 = var5.field467 * var6.field477 + var5.field477 * var6.field488 + var5.field472 * var6.field475;
            class28.field356 = var5.field479 * var6.field477 + var5.field488 * var6.field488 + var5.field471 * var6.field475;
        }
        if (arg1 != null) {
            int var19 = this.field1141 + this.field1126 >> 1;
            int var20 = this.field1158 + this.field1115 >> 1;
            int var21 = (int) ((float) var20 * class484.field7400 + (float) this.field1159 * class391.field5732 + (float) var19 * class28.field356 + class405.field5888);
            int var22 = (int) ((float) var20 * class467.field7170 + (float) this.field1159 * class402.field5861 + (float) var19 * class297.field4511 + class372.field5446);
            int var23 = (int) ((float) var20 * class441.field6471 + (float) this.field1159 * class52.field795 + (float) var19 * class362.field5346 + class402.field5858);
            int var24 = (int) ((float) var20 * class484.field7400 + (float) this.field1215 * class391.field5732 + (float) var19 * class28.field356 + class405.field5888);
            int var25 = (int) ((float) var20 * class467.field7170 + (float) this.field1215 * class402.field5861 + (float) var19 * class297.field4511 + class372.field5446);
            int var26 = (int) ((float) var20 * class441.field6471 + (float) this.field1215 * class52.field795 + (float) var19 * class362.field5346 + class402.field5858);
            arg1.field5127 = this.field1173.field6738 * var22 / arg2 + this.field1173.field6754;
            arg1.field5126 = this.field1173.field6830 * var21 / arg2 + this.field1173.field6828;
            arg1.field5125 = this.field1173.field6830 * var24 / arg2 + this.field1173.field6828;
            arg1.field5123 = this.field1173.field6754 + (this.field1173.field6738 * var25 / arg2);
            if (var23 < this.field1173.field6800 && var26 < this.field1173.field6800) {
                arg1.field5124 = this.field1173.field6828 + ((this.field1204 + var21) * this.field1173.field6830 / arg2) - arg1.field5126;
                arg1.field5122 = true;
            }
        }
        this.field1173.method2628((float) arg2, -8600);
        this.field1173.method2622((byte) 34);
        this.field1173.method2634(var6, 127);
        this.method494(-4);
        this.field1173.method2645(4353);
        this.method499(24);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[IIIIZI[I)V", line = 1823)
    public final void method481(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field1183++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            class145.field2349 = 0;
            class14.field167 = 0;
            class368.field5406 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field1209.length > var15) {
                    int[] var16 = this.field1209[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field1160 == null || (arg6 & this.field1160[var18]) != 0) {
                            class145.field2349 += this.field1200[var18];
                            class368.field5406 += this.field1192[var18];
                            var13++;
                            class14.field167 += this.field1147[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class368.field5406 = var11;
                class145.field2349 = var10;
                class14.field167 = var12;
            } else {
                class165.field2572 = true;
                class368.field5406 = class368.field5406 / var13 + var11;
                class145.field2349 = class145.field2349 / var13 + var10;
                class14.field167 = class14.field167 / var13 + var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + (arg7[1] * arg3 + arg7[0] * arg2 + 16384) >> 15;
                int var20 = arg7[4] * arg3 + arg7[3] * arg2 + (arg7[5] * arg4) + 16384 >> 15;
                int var21 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 16384 >> 15;
                arg4 = var21;
                arg3 = var20;
                arg2 = var19;
            }
            int var22 = arg4 << 4;
            int var23 = arg2 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1209.length) {
                    int[] var27 = this.field1209[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field1160 == null || (this.field1160[var29] & arg6) != 0) {
                            this.field1200[var29] += var23;
                            this.field1192[var29] += var24;
                            this.field1147[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field1209.length) {
                        int[] var50 = this.field1209[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field1160 == null || (this.field1160[var52] & arg6) != 0) {
                                this.field1200[var52] -= class145.field2349;
                                this.field1192[var52] -= class368.field5406;
                                this.field1147[var52] -= class14.field167;
                                if (arg4 != 0) {
                                    int var53 = class195.field3075[arg4];
                                    int var54 = class195.field3077[arg4];
                                    int var55 = this.field1200[var52] * var54 + this.field1192[var52] * var53 + 32767 >> 15;
                                    this.field1192[var52] = this.field1192[var52] * var54 + 32767 - (this.field1200[var52] * var53) >> 15;
                                    this.field1200[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class195.field3075[arg2];
                                    int var57 = class195.field3077[arg2];
                                    int var58 = this.field1192[var52] * var57 - (this.field1147[var52] * var56 - 32767) >> 15;
                                    this.field1147[var52] = this.field1192[var52] * var56 + this.field1147[var52] * var57 + 32767 >> 15;
                                    this.field1192[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class195.field3075[arg3];
                                    int var60 = class195.field3077[arg3];
                                    int var61 = this.field1200[var52] * var60 + this.field1147[var52] * var59 + 32767 >> 15;
                                    this.field1147[var52] = this.field1147[var52] * var60 + 32767 - (this.field1200[var52] * var59) >> 15;
                                    this.field1200[var52] = var61;
                                }
                                this.field1200[var52] += class145.field2349;
                                this.field1192[var52] += class368.field5406;
                                this.field1147[var52] += class14.field167;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (var32 < this.field1209.length) {
                            int[] var33 = this.field1209[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field1160 == null || (arg6 & this.field1160[var35]) != 0) {
                                    int var36 = this.field1125[var35];
                                    int var37 = this.field1125[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field1216[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class195.field3075[arg4];
                                            int var41 = class195.field3077[arg4];
                                            int var42 = this.field1195[var39] * var41 + this.field1118[var39] * var40 + 32767 >> 15;
                                            this.field1118[var39] = (short) (this.field1118[var39] * var41 + 32767 - (this.field1195[var39] * var40) >> 15);
                                            this.field1195[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class195.field3075[arg2];
                                            int var44 = class195.field3077[arg2];
                                            int var45 = this.field1118[var39] * var44 + 32767 - (this.field1130[var39] * var43) >> 15;
                                            this.field1130[var39] = (short) (this.field1130[var39] * var44 + this.field1118[var39] * var43 + 32767 >> 15);
                                            this.field1118[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class195.field3075[arg3];
                                            int var47 = class195.field3077[arg3];
                                            int var48 = this.field1130[var39] * var46 - (-(this.field1195[var39] * var47) - 32767) >> 15;
                                            this.field1130[var39] = (short) (this.field1130[var39] * var47 + 32767 - (this.field1195[var39] * var46) >> 15);
                                            this.field1195[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field1151 == null && this.field1202 != null) {
                        this.field1202.field5831 = null;
                    }
                    if (this.field1151 != null) {
                        this.field1151.field5831 = null;
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
                if (class165.field2572) {
                    int var68 = arg7[0] * class145.field2349 + arg7[3] * class368.field5406 - (-(arg7[6] * class14.field167) - 16384) >> 15;
                    int var69 = arg7[7] * class14.field167 + (arg7[1] * class145.field2349 - (-(arg7[4] * class368.field5406) - 16384)) >> 15;
                    int var70 = var66 + var69;
                    int var71 = arg7[8] * class14.field167 + arg7[2] * class145.field2349 + arg7[5] * class368.field5406 + 16384 >> 15;
                    int var72 = var65 + var68;
                    int var73 = var67 + var71;
                    class368.field5406 = var70;
                    class145.field2349 = var72;
                    class14.field167 = var73;
                    class165.field2572 = false;
                }
                int[] var74 = new int[9];
                int var75 = class195.field3077[arg2];
                int var76 = class195.field3075[arg2];
                int var77 = class195.field3077[arg3];
                int var78 = class195.field3075[arg3];
                int var79 = class195.field3077[arg4];
                int var80 = class195.field3075[arg4];
                int var81 = var76 * var79 + 16384 >> 15;
                int var82 = var76 * var80 + 16384 >> 15;
                var74[3] = var75 * var80 + 16384 >> 15;
                var74[1] = -var77 * var80 + var78 * var81 + 16384 >> 15;
                var74[4] = var75 * var79 + 16384 >> 15;
                var74[2] = var75 * var78 + 16384 >> 15;
                var74[0] = var78 * var82 + (var77 * var79 + 16384) >> 15;
                var74[5] = -var76;
                var74[7] = var78 * var80 + var77 * var81 + 16384 >> 15;
                var74[6] = -var78 * var79 + var77 * var82 + 16384 >> 15;
                var74[8] = var75 * var77 + 16384 >> 15;
                int var83 = var74[2] * -class14.field167 + (var74[1] * -class368.field5406 + var74[0] * -class145.field2349 + 16384) >> 15;
                int var84 = var74[4] * -class368.field5406 + var74[3] * -class145.field2349 + (var74[5] * -class14.field167) + 16384 >> 15;
                int var85 = var74[8] * -class14.field167 + var74[6] * -class145.field2349 - (-(var74[7] * -class368.field5406) + -16384) >> 15;
                int var86 = class145.field2349 + var83;
                int var87 = class368.field5406 + var84;
                int var88 = var85 + class14.field167;
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
                int var92 = var74[5] * var67 + (var74[3] * var65 + (var74[4] * var66)) + 16384 >> 15;
                int var93 = var87 + var92;
                int var94 = var74[6] * var65 + var74[7] * var66 + (var74[8] * var67) + 16384 >> 15;
                int var95 = var86 + var91;
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
                int var99 = arg7[2] * var96 + arg7[0] * var95 + arg7[1] * var93 + 16384 >> 15;
                int var100 = arg7[4] * var93 + arg7[3] * var95 - (-(arg7[5] * var96) - 16384) >> 15;
                int var101 = var62 + var99;
                int var102 = arg7[8] * var96 + arg7[6] * var95 + arg7[7] * var93 + 16384 >> 15;
                int var103 = var63 + var100;
                int var104 = var64 + var102;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field1209.length > var106) {
                        int[] var107 = this.field1209[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field1160 == null || (this.field1160[var109] & arg6) != 0) {
                                int var110 = this.field1200[var109] * var97[0] + this.field1192[var109] * var97[1] + this.field1147[var109] * var97[2] + 16384 >> 15;
                                int var111 = this.field1200[var109] * var97[3] - (-(this.field1147[var109] * var97[5]) - (this.field1192[var109] * var97[4]) - 16384) >> 15;
                                int var112 = this.field1200[var109] * var97[6] + 16384 - (-(this.field1192[var109] * var97[7]) - (this.field1147[var109] * var97[8])) >> 15;
                                int var113 = var101 + var110;
                                int var114 = var103 + var111;
                                this.field1200[var109] = var113;
                                int var115 = var104 + var112;
                                this.field1192[var109] = var114;
                                this.field1147[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field1209.length) {
                        int[] var174 = this.field1209[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field1160 == null || (arg6 & this.field1160[var176]) != 0) {
                                this.field1200[var176] -= class145.field2349;
                                this.field1192[var176] -= class368.field5406;
                                this.field1147[var176] -= class14.field167;
                                this.field1200[var176] = this.field1200[var176] * arg2 >> 7;
                                this.field1192[var176] = this.field1192[var176] * arg3 >> 7;
                                this.field1147[var176] = this.field1147[var176] * arg4 >> 7;
                                this.field1200[var176] += class145.field2349;
                                this.field1192[var176] += class368.field5406;
                                this.field1147[var176] += class14.field167;
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
                if (class165.field2572) {
                    int var128 = arg7[6] * class14.field167 + arg7[0] * class145.field2349 + arg7[3] * class368.field5406 + 16384 >> 15;
                    int var129 = arg7[4] * class368.field5406 + (arg7[1] * class145.field2349 - (-(arg7[7] * class14.field167) - 16384)) >> 15;
                    int var130 = arg7[5] * class368.field5406 + arg7[8] * class14.field167 + arg7[2] * class145.field2349 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    class368.field5406 = var132;
                    int var133 = var127 + var130;
                    class145.field2349 = var131;
                    class165.field2572 = false;
                    class14.field167 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class145.field2349 * var134 + 16384 >> 15;
                int var138 = -class368.field5406 * var135 + 16384 >> 15;
                int var139 = -class14.field167 * var136 + 16384 >> 15;
                int var140 = class145.field2349 + var137;
                int var141 = class368.field5406 + var138;
                int var142 = class14.field167 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var141 + var145;
                int var147 = var140 + var144;
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
                int var152 = arg7[2] * var149 + arg7[1] * var146 + arg7[0] * var147 + 16384 >> 15;
                int var153 = arg7[3] * var147 + arg7[5] * var149 + arg7[4] * var146 + 16384 >> 15;
                int var154 = arg7[6] * var147 + 16384 - (-(arg7[7] * var146) - arg7[8] * var149) >> 15;
                int var155 = var122 + var152;
                int var156 = var123 + var153;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field1209.length > var159) {
                        int[] var160 = this.field1209[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field1160 == null || (arg6 & this.field1160[var162]) != 0) {
                                int var163 = this.field1200[var162] * var150[0] + (this.field1147[var162] * var150[2]) + this.field1192[var162] * var150[1] + 16384 >> 15;
                                int var164 = this.field1200[var162] * var150[3] + this.field1147[var162] * var150[5] + (this.field1192[var162] * var150[4]) + 16384 >> 15;
                                int var165 = var156 + var164;
                                int var166 = this.field1147[var162] * var150[8] + this.field1200[var162] * var150[6] + this.field1192[var162] * var150[7] + 16384 >> 15;
                                int var167 = var155 + var163;
                                int var168 = var157 + var166;
                                this.field1200[var162] = var167;
                                this.field1192[var162] = var165;
                                this.field1147[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1170 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field1170.length) {
                        int[] var182 = this.field1170[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field1162 == null || (this.field1162[var184] & arg6) != 0) {
                                int var185 = (this.field1213[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field1213[var184] = (byte) var185;
                                if (this.field1202 != null) {
                                    this.field1202.field5831 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1197 != null) {
                    for (int var178 = 0; var178 < this.field1172; var178++) {
                        class316 var179 = this.field1197[var178];
                        class149 var180 = this.field1185[var178];
                        var180.field2405 = 255 - (this.field1213[var179.field4759] & 0xFF) << 24 | var180.field2405 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1170 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field1170.length) {
                        int[] var191 = this.field1170[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field1162 == null || (this.field1162[var193] & arg6) != 0) {
                                int var194 = this.field1154[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFD1D) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = arg2 + var195 & 0x3F;
                                int var200 = arg4 + var197;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field1154[var193] = (short) class318.method1973(var200, class318.method1973(var199 << 10, var198 << 7));
                                if (this.field1202 != null) {
                                    this.field1202.field5831 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1197 != null) {
                    for (int var187 = 0; var187 < this.field1172; var187++) {
                        class316 var188 = this.field1197[var187];
                        class149 var189 = this.field1185[var187];
                        var189.field2405 = var189.field2405 & 0xFF000000 | class327.field4907[this.field1154[var188.field4759] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field1134 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field1134.length > var202) {
                        int[] var203 = this.field1134[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class149 var205 = this.field1185[var203[var204]];
                            var205.field2404 += arg3;
                            var205.field2407 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1134 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field1134.length > var207) {
                        int[] var208 = this.field1134[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class149 var210 = this.field1185[var208[var209]];
                            var210.field2396 = var210.field2396 * arg3 >> 7;
                            var210.field2398 = var210.field2398 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1134 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field1134.length) {
                    int[] var213 = this.field1134[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class149 var215 = this.field1185[var213[var214]];
                        var215.field2403 = var215.field2403 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[IIIIIZ)V", line = 2812)
    public final void method482(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1177++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class145.field2349 = 0;
            int var12 = 0;
            class14.field167 = 0;
            class368.field5406 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field1209.length > var14) {
                    int[] var15 = this.field1209[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class145.field2349 += this.field1200[var17];
                        class368.field5406 += this.field1192[var17];
                        var12++;
                        class14.field167 += this.field1147[var17];
                    }
                }
            }
            if (var12 > 0) {
                class14.field167 = class14.field167 / var12 + var10;
                class368.field5406 = class368.field5406 / var12 + var11;
                class145.field2349 = class145.field2349 / var12 + var9;
            } else {
                class368.field5406 = var11;
                class14.field167 = var10;
                class145.field2349 = var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field1209.length > var22) {
                    int[] var23 = this.field1209[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field1200[var25] += var20;
                        this.field1192[var25] += var18;
                        this.field1147[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field1209.length > var45) {
                    int[] var46 = this.field1209[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field1200[var48] -= class145.field2349;
                            this.field1192[var48] -= class368.field5406;
                            this.field1147[var48] -= class14.field167;
                            if (arg4 != 0) {
                                int var49 = class195.field3075[arg4];
                                int var50 = class195.field3077[arg4];
                                int var51 = this.field1200[var48] * var50 + this.field1192[var48] * var49 + 32767 >> 15;
                                this.field1192[var48] = this.field1192[var48] * var50 + 32767 - this.field1200[var48] * var49 >> 15;
                                this.field1200[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class195.field3075[arg2];
                                int var53 = class195.field3077[arg2];
                                int var54 = this.field1192[var48] * var53 + 32767 - (this.field1147[var48] * var52) >> 15;
                                this.field1147[var48] = this.field1147[var48] * var53 + (this.field1192[var48] * var52 + 32767) >> 15;
                                this.field1192[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class195.field3075[arg3];
                                int var56 = class195.field3077[arg3];
                                int var57 = this.field1200[var48] * var56 + this.field1147[var48] * var55 + 32767 >> 15;
                                this.field1147[var48] = this.field1147[var48] * var56 + 32767 - (this.field1200[var48] * var55) >> 15;
                                this.field1200[var48] = var57;
                            }
                            this.field1200[var48] += class145.field2349;
                            this.field1192[var48] += class368.field5406;
                            this.field1147[var48] += class14.field167;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field1200[var59] -= class145.field2349;
                            this.field1192[var59] -= class368.field5406;
                            this.field1147[var59] -= class14.field167;
                            if (arg2 != 0) {
                                int var60 = class195.field3075[arg2];
                                int var61 = class195.field3077[arg2];
                                int var62 = this.field1192[var59] * var61 + (32767 - (this.field1147[var59] * var60)) >> 15;
                                this.field1147[var59] = this.field1147[var59] * var61 + (this.field1192[var59] * var60 + 32767) >> 15;
                                this.field1192[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class195.field3075[arg4];
                                int var64 = class195.field3077[arg4];
                                int var65 = this.field1192[var59] * var63 + (this.field1200[var59] * var64) + 32767 >> 15;
                                this.field1192[var59] = this.field1192[var59] * var64 + 32767 - (this.field1200[var59] * var63) >> 15;
                                this.field1200[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class195.field3075[arg3];
                                int var67 = class195.field3077[arg3];
                                int var68 = this.field1200[var59] * var67 + this.field1147[var59] * var66 + 32767 >> 15;
                                this.field1147[var59] = this.field1147[var59] * var67 + 32767 - (this.field1200[var59] * var66) >> 15;
                                this.field1200[var59] = var68;
                            }
                            this.field1200[var59] += class145.field2349;
                            this.field1192[var59] += class368.field5406;
                            this.field1147[var59] += class14.field167;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field1209.length) {
                        int[] var29 = this.field1209[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field1125[var31];
                            int var33 = this.field1125[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field1216[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class195.field3075[arg4];
                                    int var37 = class195.field3077[arg4];
                                    int var38 = this.field1118[var35] * var36 - (-(this.field1195[var35] * var37) - 32767) >> 15;
                                    this.field1118[var35] = (short) (this.field1118[var35] * var37 + 32767 - (this.field1195[var35] * var36) >> 15);
                                    this.field1195[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class195.field3075[arg2];
                                    int var40 = class195.field3077[arg2];
                                    int var41 = this.field1118[var35] * var40 - (this.field1130[var35] * var39 - 32767) >> 15;
                                    this.field1130[var35] = (short) (this.field1130[var35] * var40 + this.field1118[var35] * var39 + 32767 >> 15);
                                    this.field1118[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class195.field3075[arg3];
                                    int var43 = class195.field3077[arg3];
                                    int var44 = this.field1195[var35] * var43 + (this.field1130[var35] * var42 + 32767) >> 15;
                                    this.field1130[var35] = (short) (this.field1130[var35] * var43 + 32767 - (this.field1195[var35] * var42) >> 15);
                                    this.field1195[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field1151 == null && this.field1202 != null) {
                    this.field1202.field5831 = null;
                }
                if (this.field1151 != null) {
                    this.field1151.field5831 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field1209.length > var70) {
                    int[] var71 = this.field1209[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field1200[var73] -= class145.field2349;
                        this.field1192[var73] -= class368.field5406;
                        this.field1147[var73] -= class14.field167;
                        this.field1200[var73] = this.field1200[var73] * arg2 >> 7;
                        this.field1192[var73] = this.field1192[var73] * arg3 >> 7;
                        this.field1147[var73] = this.field1147[var73] * arg4 >> 7;
                        this.field1200[var73] += class145.field2349;
                        this.field1192[var73] += class368.field5406;
                        this.field1147[var73] += class14.field167;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1170 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field1170.length > var78) {
                        int[] var79 = this.field1170[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field1213[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field1213[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field1202 != null) {
                            this.field1202.field5831 = null;
                        }
                    }
                }
                if (this.field1197 != null) {
                    for (int var75 = 0; var75 < this.field1172; var75++) {
                        class316 var76 = this.field1197[var75];
                        class149 var77 = this.field1185[var75];
                        var77.field2405 = var77.field2405 & 0xFFFFFF | 255 - (this.field1213[var76.field4759] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1170 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field1170.length > var87) {
                        int[] var88 = this.field1170[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field1154[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFD6F) >> 10;
                            int var93 = (var91 & 0x382) >> 7;
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
                            this.field1154[var90] = (short) class318.method1973(class318.method1973(var96 << 10, var94 << 7), var97);
                        }
                        if (var88.length > 0 && this.field1202 != null) {
                            this.field1202.field5831 = null;
                        }
                    }
                }
                if (this.field1197 != null) {
                    for (int var84 = 0; var84 < this.field1172; var84++) {
                        class316 var85 = this.field1197[var84];
                        class149 var86 = this.field1185[var84];
                        var86.field2405 = class327.field4907[this.field1154[var85.field4759] & 0xFFFF] & 0xFFFFFF | var86.field2405 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field1134 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field1134.length) {
                        int[] var100 = this.field1134[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class149 var102 = this.field1185[var100[var101]];
                            var102.field2404 += arg3;
                            var102.field2407 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1134 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field1134.length) {
                        int[] var105 = this.field1134[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class149 var107 = this.field1185[var105[var106]];
                            var107.field2396 = var107.field2396 * arg3 >> 7;
                            var107.field2398 = var107.field2398 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1134 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field1134.length) {
                    int[] var110 = this.field1134[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class149 var112 = this.field1185[var110[var111]];
                        var112.field2403 = var112.field2403 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lbl;)V", line = 5582)
    public class69(class442 arg0) {
        this.field1173 = arg0;
        this.field1163 = new class400(this.field1173, null, 5126, 3, 0);
        this.field1182 = new class400(this.field1173, null, 5126, 2, 0);
        this.field1151 = new class400(this.field1173, null, 5126, 3, 0);
        this.field1202 = new class400(this.field1173, null, 5121, 4, 0);
        this.field1110 = new class255();
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lbl;Lwr;IIII)V", line = 5642)
    public class69(class442 arg0, class303 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1156 = arg5;
        this.field1168 = arg2;
        this.field1173 = arg0;
        if (class370.method2241((byte) -90, arg5, arg2)) {
            this.field1163 = new class400(this.field1173, null, 5126, 3, 0);
        }
        if (class308.method1851(0, arg5, arg2)) {
            this.field1182 = new class400(this.field1173, null, 5126, 2, 0);
        }
        if (client.method1171(-114, arg2, arg5)) {
            this.field1151 = new class400(this.field1173, null, 5126, 3, 0);
        }
        if (class98.method743(0, arg5, arg2)) {
            this.field1202 = new class400(this.field1173, null, 5121, 4, 0);
        }
        if (class65.method448(arg2, 0, arg5)) {
            this.field1110 = new class255();
        }
        class11 var7 = arg0.field4784;
        int[] var8 = new int[arg1.field4611];
        this.field1125 = new int[arg1.field4606 + 1];
        for (int var9 = 0; var9 < arg1.field4611; var9++) {
            if ((arg1.field4599 == null || arg1.field4599[var9] != 2) && (arg1.field4598 == null || arg1.field4598[var9] == -1 || !var7.method59(arg1.field4598[var9] & 0xFFFF, 21645).field734)) {
                var8[this.field1111++] = var9;
                this.field1125[arg1.field4609[var9]]++;
                this.field1125[arg1.field4581[var9]]++;
                this.field1125[arg1.field4605[var9]]++;
            }
        }
        this.field1207 = this.field1111;
        long[] var10 = new long[this.field1111];
        boolean var11 = (this.field1168 & 0x100) != 0;
        label494: for (int var12 = 0; var12 < this.field1111; var12++) {
            int var180 = var8[var12];
            class48 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field4596 != null) {
                for (int var186 = 0; var186 < arg1.field4596.length; var186++) {
                    class462 var187 = arg1.field4596[var186];
                    if (var187.field7106 == var180) {
                        class500 var188 = class116.method828(var187.field7103, (byte) 118);
                        if (var188.field7584) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field1207--;
                            continue label494;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field4598 != null) {
                var189 = arg1.field4598[var180];
                if (var189 != -1) {
                    var181 = var7.method59(var189 & 0xFFFF, 21645);
                    var184 = var181.field728;
                    var185 = var181.field732;
                }
            }
            boolean var190 = arg1.field4568 != null && arg1.field4568[var180] != 0 || var181 != null && !var181.field739;
            if ((var11 || var190) && arg1.field4608 != null) {
                var182 += arg1.field4608[var180] << 17;
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
        class12.method64(var8, -1, var10);
        this.field1133 = arg1.field4606;
        this.field1192 = arg1.field4602;
        this.field1169 = arg1.field4577;
        this.field1200 = arg1.field4589;
        this.field1147 = arg1.field4601;
        this.field1160 = arg1.field4585;
        class360[] var13 = new class360[this.field1133];
        this.field1206 = arg1.field4579;
        this.field1139 = arg1.field4590;
        if (arg1.field4596 != null) {
            this.field1172 = arg1.field4596.length;
            this.field1185 = new class149[this.field1172];
            this.field1197 = new class316[this.field1172];
            for (int var14 = 0; var14 < this.field1172; var14++) {
                class462 var15 = arg1.field4596[var14];
                class500 var16 = class116.method828(var15.field7103, (byte) 92);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field1111; var18++) {
                    if (var8[var18] == var15.field7106) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class327.field4907[arg1.field4592[var15.field7106] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field4568 == null ? 0 : arg1.field4568[var15.field7106]) << 24;
                this.field1197[var14] = new class316(var17, arg1.field4609[var15.field7106], arg1.field4581[var15.field7106], arg1.field4605[var15.field7106], var16.field7579, var16.field7580, var16.field7573, var16.field7586, var16.field7575, var16.field7584, var16.field7585, var15.field7101);
                this.field1185[var14] = new class149(var20);
            }
        }
        int var21 = this.field1111 * 3;
        this.field1137 = (short) arg3;
        if (arg1.field4565 != null) {
            this.field1162 = new short[this.field1111];
        }
        this.field1142 = new short[this.field1111];
        this.field1155 = new short[this.field1111];
        this.field1199 = new short[this.field1111];
        this.field1118 = new short[var21];
        this.field1165 = new float[var21];
        this.field1216 = new short[var21];
        this.field1194 = new float[var21];
        this.field1153 = (short) arg4;
        this.field1213 = new byte[this.field1111];
        this.field1218 = new byte[var21];
        this.field1130 = new short[var21];
        class119.field1966 = new long[var21];
        this.field1195 = new short[var21];
        this.field1191 = new short[this.field1111];
        this.field1154 = new short[this.field1111];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field4606; var23++) {
            int var179 = this.field1125[var23];
            this.field1125[var23] = var22;
            var22 += var179;
            var13[var23] = new class360();
        }
        this.field1125[arg1.field4606] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field4588 != null) {
            int var28 = arg1.field4584;
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
            for (int var36 = 0; var36 < this.field1111; var36++) {
                int var43 = var8[var36];
                if (arg1.field4588[var43] != -1) {
                    int var44 = arg1.field4588[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field4609[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field4581[var43];
                        } else {
                            var46 = arg1.field4605[var43];
                        }
                        int var47 = arg1.field4589[var46];
                        int var48 = arg1.field4602[var46];
                        int var49 = arg1.field4601[var46];
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
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field4582[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field4614[var37];
                        if (var39 == 0) {
                            var40 = 1.0F;
                            var41 = 1.0F;
                        } else if (var39 > 0) {
                            var40 = 1.0F;
                            var41 = (float) var39 / 1024.0F;
                        } else {
                            var41 = 1.0F;
                            var40 = (float) (-var39) / 1024.0F;
                        }
                        var42 = 64.0F / (float) arg1.field4593[var37];
                    } else if (var38 == 2) {
                        var40 = 64.0F / (float) arg1.field4614[var37];
                        var42 = 64.0F / (float) arg1.field4593[var37];
                        var41 = 64.0F / (float) arg1.field4607[var37];
                    } else {
                        var42 = (float) arg1.field4593[var37] / 1024.0F;
                        var40 = (float) arg1.field4614[var37] / 1024.0F;
                        var41 = (float) arg1.field4607[var37] / 1024.0F;
                    }
                    var27[var37] = class200.method1246(7, arg1.field4575[var37], class330.method2050(255, arg1.field4613[var37]), arg1.field4597[var37], var41, var42, arg1.field4586[var37], var40);
                }
            }
        }
        class338[] var50 = new class338[arg1.field4611];
        for (int var51 = 0; var51 < arg1.field4611; var51++) {
            short var158 = arg1.field4609[var51];
            short var159 = arg1.field4581[var51];
            short var160 = arg1.field4605[var51];
            int var161 = this.field1200[var159] - this.field1200[var158];
            int var162 = this.field1192[var159] - this.field1192[var158];
            int var163 = this.field1147[var159] - this.field1147[var158];
            int var164 = this.field1200[var160] - this.field1200[var158];
            int var165 = this.field1192[var160] - this.field1192[var158];
            int var166 = this.field1147[var160] - this.field1147[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169;
            for (var169 = var161 * var165 - (var162 * var164); var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192; var169 >>= 0x1) {
                var167 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var167 * var167 + var168 * var168 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var168 * 256 / var170;
            int var172 = var167 * 256 / var170;
            int var173 = var169 * 256 / var170;
            byte var174 = arg1.field4599 == null ? 0 : arg1.field4599[var51];
            if (var174 == 0) {
                class360 var176 = var13[var158];
                var176.field5329++;
                var176.field5326 += var171;
                var176.field5328 += var173;
                var176.field5327 += var172;
                class360 var177 = var13[var159];
                var177.field5326 += var171;
                var177.field5329++;
                var177.field5328 += var173;
                var177.field5327 += var172;
                class360 var178 = var13[var160];
                var178.field5327 += var172;
                var178.field5329++;
                var178.field5326 += var171;
                var178.field5328 += var173;
            } else if (var174 == 1) {
                class338 var175 = var50[var51] = new class338();
                var175.field5051 = var173;
                var175.field5053 = var171;
                var175.field5054 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field1111; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field4592[var68] & 0xFFFF;
            short var70;
            if (arg1.field4598 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field4598[var68];
            }
            int var71;
            if (arg1.field4588 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field4588[var68];
            }
            int var72;
            if (arg1.field4568 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field4568[var68] & 0xFF;
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
                    var77 = 0.0F;
                    var75 = 1.0F;
                    var78 = 0.0F;
                    var73 = 0.0F;
                    var74 = 1.0F;
                    var79 = 1;
                    var80 = 2;
                    var76 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field4582[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field4609[var68];
                        short var112 = arg1.field4581[var68];
                        short var113 = arg1.field4605[var68];
                        short var114 = arg1.field4575[var71];
                        short var115 = arg1.field4586[var71];
                        short var116 = arg1.field4597[var71];
                        float var117 = (float) arg1.field4589[var114];
                        float var118 = (float) arg1.field4602[var114];
                        float var119 = (float) arg1.field4601[var114];
                        float var120 = (float) arg1.field4589[var115] - var117;
                        float var121 = (float) arg1.field4602[var115] - var118;
                        float var122 = (float) arg1.field4601[var115] - var119;
                        float var123 = (float) arg1.field4589[var116] - var117;
                        float var124 = (float) arg1.field4602[var116] - var118;
                        float var125 = (float) arg1.field4601[var116] - var119;
                        float var126 = (float) arg1.field4589[var111] - var117;
                        float var127 = (float) arg1.field4602[var111] - var118;
                        float var128 = (float) arg1.field4601[var111] - var119;
                        float var129 = (float) arg1.field4589[var112] - var117;
                        float var130 = (float) arg1.field4602[var112] - var118;
                        float var131 = (float) arg1.field4601[var112] - var119;
                        float var132 = (float) arg1.field4589[var113] - var117;
                        float var133 = (float) arg1.field4602[var113] - var118;
                        float var134 = (float) arg1.field4601[var113] - var119;
                        float var135 = var121 * var125 - var122 * var124;
                        float var136 = var122 * var123 - (var120 * var125);
                        float var137 = var120 * var124 - (var121 * var123);
                        float var138 = var124 * var137 - (var125 * var136);
                        float var139 = var125 * var135 - var123 * var137;
                        float var140 = var123 * var136 - var124 * var135;
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        float var142 = var122 * var135 - (var120 * var137);
                        float var143 = var121 * var137 - (var122 * var136);
                        float var144 = var120 * var136 - (var121 * var135);
                        float var145 = 1.0F / (var125 * var144 + var123 * var143 + var124 * var142);
                        var76 = (var131 * var144 + var129 * var143 + var130 * var142) * var145;
                        var78 = (var134 * var144 + var132 * var143 + var133 * var142) * var145;
                        var74 = (var128 * var144 + var126 * var143 + var127 * var142) * var145;
                    } else {
                        short var83 = arg1.field4609[var68];
                        short var84 = arg1.field4581[var68];
                        short var85 = arg1.field4605[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field4569[var71];
                        float var91 = (float) arg1.field4583[var71] / 256.0F;
                        if (var82 == 1) {
                            float var109 = (float) arg1.field4607[var71] / 1024.0F;
                            class137.method914(var87, var109, arg1.field4601[var83], 56, var90, arg1.field4602[var83], var89, var91, arg1.field4589[var83], var88, var86);
                            var73 = class190.field3029;
                            var74 = class234.field3555;
                            class137.method914(var87, var109, arg1.field4601[var84], 49, var90, arg1.field4602[var84], var89, var91, arg1.field4589[var84], var88, var86);
                            var75 = class190.field3029;
                            var76 = class234.field3555;
                            class137.method914(var87, var109, arg1.field4601[var85], 37, var90, arg1.field4602[var85], var89, var91, arg1.field4589[var85], var88, var86);
                            var78 = class234.field3555;
                            var77 = class190.field3029;
                            float var110 = var109 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if ((var77 - var73 > var110)) {
                                    var77 -= var109;
                                    var80 = 1;
                                } else if (var73 - var77 > var110) {
                                    var80 = 2;
                                    var77 += var109;
                                }
                                if ((var75 - var73 > var110)) {
                                    var79 = 1;
                                    var75 -= var109;
                                } else if (var73 - var75 > var110) {
                                    var75 += var109;
                                    var79 = 2;
                                }
                            } else {
                                if (var110 < var76 - var74) {
                                    var76 -= var109;
                                    var79 = 1;
                                } else if (var110 < var74 - var76) {
                                    var79 = 2;
                                    var76 += var109;
                                }
                                if (var78 - var74 > var110) {
                                    var78 -= var109;
                                    var80 = 1;
                                } else if (var110 < var74 - var78) {
                                    var80 = 2;
                                    var78 += var109;
                                }
                            }
                        } else if (var82 == 2) {
                            float var92 = (float) arg1.field4594[var71] / 256.0F;
                            float var93 = (float) arg1.field4610[var71] / 256.0F;
                            int var94 = arg1.field4589[var84] - arg1.field4589[var83];
                            int var95 = arg1.field4602[var84] - arg1.field4602[var83];
                            int var96 = arg1.field4601[var84] - arg1.field4601[var83];
                            int var97 = arg1.field4589[var85] - arg1.field4589[var83];
                            int var98 = arg1.field4602[var85] - arg1.field4602[var83];
                            int var99 = arg1.field4601[var85] - arg1.field4601[var83];
                            int var100 = var95 * var99 - (var96 * var98);
                            int var101 = var96 * var97 - (var94 * var99);
                            int var102 = var94 * var98 - (var95 * var97);
                            float var103 = 64.0F / (float) arg1.field4614[var71];
                            float var104 = 64.0F / (float) arg1.field4593[var71];
                            float var105 = 64.0F / (float) arg1.field4607[var71];
                            float var106 = (var89[2] * (float) var102 + var89[0] * (float) var100 + var89[1] * (float) var101) / var103;
                            float var107 = (var89[5] * (float) var102 + var89[4] * (float) var101 + var89[3] * (float) var100) / var104;
                            float var108 = (var89[8] * (float) var102 + var89[6] * (float) var100 + var89[7] * (float) var101) / var105;
                            var81 = class113.method811(var107, -10296, var108, var106);
                            class23.method117(var89, var91, var87, var93, var86, (byte) -109, arg1.field4589[var83], arg1.field4602[var83], arg1.field4601[var83], var81, var90, var88, var92);
                            var74 = class343.field5110;
                            var73 = class367.field5396;
                            class23.method117(var89, var91, var87, var93, var86, (byte) -109, arg1.field4589[var84], arg1.field4602[var84], arg1.field4601[var84], var81, var90, var88, var92);
                            var75 = class367.field5396;
                            var76 = class343.field5110;
                            class23.method117(var89, var91, var87, var93, var86, (byte) -121, arg1.field4589[var85], arg1.field4602[var85], arg1.field4601[var85], var81, var90, var88, var92);
                            var77 = class367.field5396;
                            var78 = class343.field5110;
                        } else if (var82 == 3) {
                            class441.method2573((byte) 108, var89, arg1.field4602[var83], var86, var88, arg1.field4589[var83], var91, var87, var90, arg1.field4601[var83]);
                            var74 = class504.field7608;
                            var73 = class21.field273;
                            class441.method2573((byte) 119, var89, arg1.field4602[var84], var86, var88, arg1.field4589[var84], var91, var87, var90, arg1.field4601[var84]);
                            var75 = class21.field273;
                            var76 = class504.field7608;
                            class441.method2573((byte) 90, var89, arg1.field4602[var85], var86, var88, arg1.field4589[var85], var91, var87, var90, arg1.field4601[var85]);
                            var77 = class21.field273;
                            var78 = class504.field7608;
                            if ((var90 & 0x1) == 0) {
                                if ((var75 - var73 > 0.5F)) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                                if ((var77 - var73 > 0.5F)) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                            } else {
                                if (var76 - var74 > 0.5F) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                                if ((var78 - var74 > 0.5F)) {
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
            if (arg1.field4599 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field4599[var68];
            }
            if (var146 == 0) {
                long var150 = (long) (var71 << 2) + ((long) (var69 << 8) + (long) (var81 << 24) + ((long) var72) << 32);
                short var152 = arg1.field4609[var68];
                short var153 = arg1.field4581[var68];
                short var154 = arg1.field4605[var68];
                class360 var155 = var13[var152];
                this.field1191[var52] = this.method512((byte) -13, var152, var155.field5329, arg1, var155.field5326, var74, var155.field5327, var150, var73, var155.field5328);
                class360 var156 = var13[var153];
                this.field1199[var52] = this.method512((byte) -13, var153, var156.field5329, arg1, var156.field5326, var76, var156.field5327, (long) var79 + var150, var75, var156.field5328);
                class360 var157 = var13[var154];
                this.field1155[var52] = this.method512((byte) -13, var154, var157.field5329, arg1, var157.field5326, var78, var157.field5327, (long) var80 + var150, var77, var157.field5328);
            } else if (var146 == 1) {
                class338 var147 = var50[var68];
                long var148 = ((long) (var69 << 8) + (long) var72 + (long) (var81 << 24) << 32) + (long) ((var147.field5053 + 256 << 12) + (var147.field5051 + 256 << 22) + (var147.field5054 > 0 ? 1024 : 2048) + (var71 << 2));
                this.field1191[var52] = this.method512((byte) -13, arg1.field4609[var68], 0, arg1, var147.field5053, var74, var147.field5054, var148, var73, var147.field5051);
                this.field1199[var52] = this.method512((byte) -13, arg1.field4581[var68], 0, arg1, var147.field5053, var76, var147.field5054, (long) var79 + var148, var75, var147.field5051);
                this.field1155[var52] = this.method512((byte) -13, arg1.field4605[var68], 0, arg1, var147.field5053, var78, var147.field5054, (long) var80 + var148, var77, var147.field5051);
            }
            if (arg1.field4598 == null) {
                this.field1142[var52] = -1;
            } else {
                this.field1142[var52] = arg1.field4598[var68];
            }
            if (arg1.field4568 != null) {
                this.field1213[var52] = arg1.field4568[var68];
            }
            if (arg1.field4565 != null) {
                this.field1162[var52] = arg1.field4565[var68];
            }
            this.field1154[var52] = arg1.field4592[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field1207; var55++) {
            short var67 = this.field1142[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field1143 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field1207; var58++) {
            short var66 = this.field1142[var58];
            if (var56 != var66) {
                this.field1143[var57++] = var58;
                var56 = var66;
            }
        }
        this.field1143[var57] = this.field1207;
        class119.field1966 = null;
        this.field1195 = class474.method2851(this.field1129, 5754, this.field1195);
        this.field1118 = class474.method2851(this.field1129, 5754, this.field1118);
        this.field1130 = class474.method2851(this.field1129, 5754, this.field1130);
        this.field1218 = class366.method2214(this.field1129, 0, this.field1218);
        this.field1194 = class232.method1391(true, this.field1194, this.field1129);
        this.field1165 = class232.method1391(true, this.field1165, this.field1129);
        if (arg1.field4587 != null && class134.method882(arg2, 16, this.field1156)) {
            this.field1209 = arg1.method1828(true);
        }
        if (arg1.field4596 != null && class298.method1802(arg2, (byte) -73, this.field1156)) {
            this.field1134 = arg1.method1832((byte) 100);
        }
        if (arg1.field4616 != null && class463.method2760(this.field1156, arg2, 2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field1111; var61++) {
                int var65 = arg1.field4616[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var65 > var59) {
                        var59 = var65;
                    }
                }
            }
            this.field1170 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field1170[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field1111; var63++) {
                int var64 = arg1.field4616[var8[var63]];
                if (var64 >= 0) {
                    this.field1170[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "()I", line = 3475)
    public final int method483() {
        field1178++;
        if (!this.field1149) {
            this.method465(8);
        }
        return this.field1141;
    }

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "(I)V", line = 3487)
    public static void method484(int arg0) {
        field1214 = null;
        if (arg0 == 0) {
            field1186 = null;
            field1212 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(SS)V", line = 3499)
    public final void method485(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1111; var3++) {
            if (this.field1154[var3] == arg0) {
                this.field1154[var3] = arg1;
            }
        }
        field1152++;
        if (this.field1197 != null) {
            for (int var4 = 0; var4 < this.field1172; var4++) {
                class316 var5 = this.field1197[var4];
                class149 var6 = this.field1185[var4];
                var6.field2405 = var6.field2405 & 0xFF000000 | class327.field4907[this.field1154[var5.field4759] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1202 != null) {
            this.field1202.field5831 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIII)V", line = 3546)
    public final void method486(int arg0, int arg1, int arg2, int arg3) {
        field1196++;
        for (int var5 = 0; var5 < this.field1111; var5++) {
            int var9 = this.field1154[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x3AB) >> 7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field1154[var5] = (short) class318.method1973(var12, class318.method1973(var11 << 7, var10 << 10));
        }
        if (this.field1197 != null) {
            for (int var6 = 0; var6 < this.field1172; var6++) {
                class316 var7 = this.field1197[var6];
                class149 var8 = this.field1185[var6];
                var8.field2405 = var8.field2405 & 0xFF000000 | class327.field4907[this.field1154[var7.field4759] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1202 != null) {
            this.field1202.field5831 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V", line = 3607)
    public final void method487(int arg0, int arg1, int arg2) {
        field1221++;
        for (int var4 = 0; var4 < this.field1133; var4++) {
            if (arg0 != 128) {
                this.field1200[var4] = this.field1200[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field1192[var4] = this.field1192[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field1147[var4] = this.field1147[var4] * arg2 >> 7;
            }
        }
        if (this.field1163 != null) {
            this.field1163.field5831 = null;
        }
        this.field1149 = false;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 3645)
    public final void method488(int arg0) {
        this.field1137 = (short) arg0;
        field1190++;
        if (this.field1202 != null) {
            this.field1202.field5831 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "()I", line = 3658)
    public final int method489() {
        field1161++;
        return this.field1168;
    }

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "()I", line = 3671)
    public final int method490() {
        if (!this.field1149) {
            this.method465(8);
        }
        field1117++;
        return this.field1126;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lna;I)V", line = 3684)
    private final void method491(class34 arg0, int arg1) {
        field1208++;
        if (this.field1139 != null) {
            for (int var3 = 0; var3 < this.field1139.length; var3++) {
                class425 var4 = this.field1139[var3];
                class425 var5 = var4;
                if (var4.field6099 != null) {
                    var5 = var4.field6099;
                }
                var5.field6106 = (int) ((float) this.field1147[var4.field6102] * arg0.field479 + (float) this.field1200[var4.field6102] * arg0.field488 + (float) this.field1192[var4.field6102] * arg0.field471 + arg0.field459);
                var5.field6108 = (int) ((float) this.field1147[var4.field6102] * arg0.field476 + (float) this.field1200[var4.field6102] * arg0.field475 + (float) this.field1192[var4.field6102] * arg0.field478 + arg0.field473);
                var5.field6103 = (int) ((float) this.field1147[var4.field6102] * arg0.field467 + (float) this.field1200[var4.field6102] * arg0.field477 + (float) this.field1192[var4.field6102] * arg0.field472 + arg0.field456);
                var5.field6096 = (int) ((float) this.field1147[var4.field6100] * arg0.field479 + (float) this.field1200[var4.field6100] * arg0.field488 + (float) this.field1192[var4.field6100] * arg0.field471 + arg0.field459);
                var5.field6095 = (int) ((float) this.field1147[var4.field6100] * arg0.field476 + (float) this.field1200[var4.field6100] * arg0.field475 + (float) this.field1192[var4.field6100] * arg0.field478 + arg0.field473);
                var5.field6091 = (int) ((float) this.field1147[var4.field6100] * arg0.field467 + (float) this.field1200[var4.field6100] * arg0.field477 + (float) this.field1192[var4.field6100] * arg0.field472 + arg0.field456);
                var5.field6093 = (int) ((float) this.field1147[var4.field6101] * arg0.field479 + (float) this.field1200[var4.field6101] * arg0.field488 + (float) this.field1192[var4.field6101] * arg0.field471 + arg0.field459);
                var5.field6105 = (int) ((float) this.field1147[var4.field6101] * arg0.field476 + (float) this.field1200[var4.field6101] * arg0.field475 + (float) this.field1192[var4.field6101] * arg0.field478 + arg0.field473);
                var5.field6094 = (int) ((float) this.field1147[var4.field6101] * arg0.field467 + (float) this.field1200[var4.field6101] * arg0.field477 + (float) this.field1192[var4.field6101] * arg0.field472 + arg0.field456);
            }
        }
        if (this.field1206 != null) {
            for (int var6 = 0; var6 < this.field1206.length; var6++) {
                class10 var7 = this.field1206[var6];
                class10 var8 = var7;
                if (var7.field133 != null) {
                    var8 = var7.field133;
                }
                if (var7.field131 == null) {
                    var7.field131 = arg0.method203();
                } else {
                    var7.field131.method187(arg0);
                }
                var8.field126 = (int) ((float) this.field1147[var7.field135] * arg0.field479 + (float) this.field1200[var7.field135] * arg0.field488 + (float) this.field1192[var7.field135] * arg0.field471 + arg0.field459);
                var8.field128 = (int) ((float) this.field1147[var7.field135] * arg0.field476 + (float) this.field1200[var7.field135] * arg0.field475 + (float) this.field1192[var7.field135] * arg0.field478 + arg0.field473);
                var8.field124 = (int) ((float) this.field1147[var7.field135] * arg0.field467 + (float) this.field1200[var7.field135] * arg0.field477 + (float) this.field1192[var7.field135] * arg0.field472 + arg0.field456);
            }
        }
        if (arg1 > -28) {
            this.method507((byte) 19, null, null, true, -78, false);
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "()I", line = 3750)
    public final int method492() {
        if (!this.field1149) {
            this.method465(8);
        }
        field1188++;
        return this.field1159;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(IIII)V", line = 3767)
    public final void method493(int arg0, int arg1, int arg2, int arg3) {
        field1193++;
        if (arg0 == 0) {
            int var5 = 0;
            class368.field5406 = 0;
            class145.field2349 = 0;
            class14.field167 = 0;
            for (int var6 = 0; var6 < this.field1133; var6++) {
                class145.field2349 += this.field1200[var6];
                class368.field5406 += this.field1192[var6];
                class14.field167 += this.field1147[var6];
                var5++;
            }
            if (var5 <= 0) {
                class145.field2349 = arg1;
                class368.field5406 = arg2;
                class14.field167 = arg3;
            } else {
                class368.field5406 = class368.field5406 / var5 + arg2;
                class145.field2349 = class145.field2349 / var5 + arg1;
                class14.field167 = class14.field167 / var5 + arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1133; var7++) {
                this.field1200[var7] += arg1;
                this.field1192[var7] += arg2;
                this.field1147[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1133; var8++) {
                this.field1200[var8] -= class145.field2349;
                this.field1192[var8] -= class368.field5406;
                this.field1147[var8] -= class14.field167;
                if (arg3 != 0) {
                    int var9 = class195.field3075[arg3];
                    int var10 = class195.field3077[arg3];
                    int var11 = this.field1200[var8] * var10 + this.field1192[var8] * var9 + 32767 >> 15;
                    this.field1192[var8] = this.field1192[var8] * var10 - (this.field1200[var8] * var9 - 32767) >> 15;
                    this.field1200[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class195.field3075[arg1];
                    int var13 = class195.field3077[arg1];
                    int var14 = this.field1192[var8] * var13 + 32767 - this.field1147[var8] * var12 >> 15;
                    this.field1147[var8] = this.field1192[var8] * var12 + this.field1147[var8] * var13 + 32767 >> 15;
                    this.field1192[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class195.field3075[arg2];
                    int var16 = class195.field3077[arg2];
                    int var17 = this.field1147[var8] * var15 + (this.field1200[var8] * var16) + 32767 >> 15;
                    this.field1147[var8] = this.field1147[var8] * var16 + 32767 - (this.field1200[var8] * var15) >> 15;
                    this.field1200[var8] = var17;
                }
                this.field1200[var8] += class145.field2349;
                this.field1192[var8] += class368.field5406;
                this.field1147[var8] += class14.field167;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1133; var18++) {
                this.field1200[var18] -= class145.field2349;
                this.field1192[var18] -= class368.field5406;
                this.field1147[var18] -= class14.field167;
                this.field1200[var18] = this.field1200[var18] * arg1 / 128;
                this.field1192[var18] = this.field1192[var18] * arg2 / 128;
                this.field1147[var18] = this.field1147[var18] * arg3 / 128;
                this.field1200[var18] += class145.field2349;
                this.field1192[var18] += class368.field5406;
                this.field1147[var18] += class14.field167;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1111; var19++) {
                int var23 = (this.field1213[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field1213[var19] = (byte) var23;
            }
            if (this.field1202 != null) {
                this.field1202.field5831 = null;
            }
            if (this.field1197 != null) {
                for (int var20 = 0; var20 < this.field1172; var20++) {
                    class316 var21 = this.field1197[var20];
                    class149 var22 = this.field1185[var20];
                    var22.field2405 = 255 - (this.field1213[var21.field4759] & 0xFF) << 24 | var22.field2405 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field1111; var24++) {
                int var28 = this.field1154[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var28 & 0x7F;
                int var32 = arg1 + var29 & 0x3F;
                int var33 = arg2 / 4 + var30;
                int var34 = arg3 + var31;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field1154[var24] = (short) class318.method1973(var34, class318.method1973(var33 << 7, var32 << 10));
            }
            if (this.field1202 != null) {
                this.field1202.field5831 = null;
            }
            if (this.field1197 != null) {
                for (int var25 = 0; var25 < this.field1172; var25++) {
                    class316 var26 = this.field1197[var25];
                    class149 var27 = this.field1185[var25];
                    var27.field2405 = class327.field4907[this.field1154[var26.field4759] & 0xFFFF] & 0xFFFFFF | var27.field2405 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field1172; var35++) {
                class149 var36 = this.field1185[var35];
                var36.field2404 += arg2;
                var36.field2407 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field1172; var37++) {
                class149 var38 = this.field1185[var37];
                var38.field2396 = var38.field2396 * arg2 >> 7;
                var38.field2398 = var38.field2398 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field1172; var39++) {
                class149 var40 = this.field1185[var39];
                var40.field2403 = var40.field2403 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "(I)V", line = 4077)
    private final void method494(int arg0) {
        field1135++;
        if (this.field1207 == 0) {
            return;
        }
        if (this.field1189 != 0) {
            this.method462((byte) 112, true);
        }
        this.method462((byte) 90, false);
        if (this.field1110 != null) {
            if (this.field1110.field3885 == null) {
                this.method496(-48, ~(this.field1189 & 0x10) != -1);
            }
            if (this.field1110.field3885 != null) {
                this.field1173.method2600((byte) 98, this.field1151 != null);
                this.field1173.method2646(this.field1151, this.field1182, -19887, this.field1202, this.field1163);
                int var2 = this.field1143.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field1143[var3];
                    int var5 = this.field1143[var3 + 1];
                    int var6 = this.field1142[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field1173.method2643(this.field1151 != null, var6, (byte) -119);
                    this.field1173.method2593(4, true, var4 * 3, (var5 - var4) * 3, this.field1110.field3885);
                }
            }
        }
        this.method506(262144);
        if (arg0 != -4) {
            this.method512((byte) 34, 40, -105, null, 119, 0.98607224F, -113, -59L, 0.17085524F, 97);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILql;Z)Z", line = 4148)
    public final boolean method495(int arg0, int arg1, class496 arg2, boolean arg3) {
        field1175++;
        class34 var5 = (class34) arg2;
        class34 var6 = this.field1173.field6780;
        float var7 = var5.field456 * var6.field479 + var5.field473 * var6.field471 + var5.field459 * var6.field488 + var6.field459;
        float var8 = var5.field456 * var6.field476 + var5.field473 * var6.field478 + var5.field459 * var6.field475 + var6.field473;
        class391.field5732 = var5.field472 * var6.field479 + var5.field478 * var6.field471 + var5.field471 * var6.field488;
        class28.field356 = var5.field477 * var6.field479 + var5.field488 * var6.field488 + var5.field475 * var6.field471;
        class467.field7170 = var5.field467 * var6.field476 + var5.field479 * var6.field475 + var5.field476 * var6.field478;
        class402.field5861 = var5.field472 * var6.field476 + var5.field478 * var6.field478 + var5.field471 * var6.field475;
        float var9 = var5.field456 * var6.field467 + var5.field473 * var6.field472 + var5.field459 * var6.field477 + var6.field456;
        class297.field4511 = var5.field477 * var6.field476 + var5.field488 * var6.field475 + var5.field475 * var6.field478;
        class484.field7400 = var5.field467 * var6.field479 + var5.field479 * var6.field488 + var5.field476 * var6.field471;
        class362.field5346 = var5.field477 * var6.field467 + var5.field488 * var6.field477 + var5.field475 * var6.field472;
        class441.field6471 = var5.field467 * var6.field467 + var5.field479 * var6.field477 + var5.field476 * var6.field472;
        class52.field795 = var5.field472 * var6.field467 + var5.field478 * var6.field472 + var5.field471 * var6.field477;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field1173.field6830;
        int var16 = this.field1173.field6738;
        if (!this.field1149) {
            this.method465(8);
        }
        class279.field4245[0] = this.field1141;
        class131.field2089[0] = this.field1159;
        class279.field4245[1] = this.field1126;
        class236.field3573[0] = this.field1158;
        class131.field2089[1] = this.field1159;
        class236.field3573[1] = this.field1158;
        class279.field4245[2] = this.field1141;
        class131.field2089[2] = this.field1215;
        class279.field4245[3] = this.field1126;
        class236.field3573[2] = this.field1158;
        class131.field2089[3] = this.field1215;
        class236.field3573[3] = this.field1158;
        class279.field4245[4] = this.field1141;
        class131.field2089[4] = this.field1159;
        class236.field3573[4] = this.field1115;
        class279.field4245[5] = this.field1126;
        class131.field2089[5] = this.field1159;
        class279.field4245[6] = this.field1141;
        class236.field3573[5] = this.field1115;
        class131.field2089[6] = this.field1215;
        class279.field4245[7] = this.field1126;
        class236.field3573[6] = this.field1115;
        class131.field2089[7] = this.field1215;
        class236.field3573[7] = this.field1115;
        for (int var17 = 0; var17 < 8; var17++) {
            float var36 = (float) class279.field4245[var17];
            float var37 = (float) class131.field2089[var17];
            float var38 = (float) class236.field3573[var17];
            float var39 = class484.field7400 * var38 + class391.field5732 * var37 + class28.field356 * var36 + var7;
            float var40 = class467.field7170 * var38 + class402.field5861 * var37 + class297.field4511 * var36 + var8;
            float var41 = class441.field6471 * var38 + class52.field795 * var37 + class362.field5346 * var36 + var9;
            if ((float) this.field1173.field6800 <= var41) {
                float var42 = (float) var15 * var39 / var41 + (float) this.field1173.field6828;
                if (var42 > var12) {
                    var12 = var42;
                }
                if (var11 > var42) {
                    var11 = var42;
                }
                float var43 = (float) var16 * var40 / var41 + (float) this.field1173.field6754;
                if (var43 > var14) {
                    var14 = var43;
                }
                if (var43 < var13) {
                    var13 = var43;
                }
                var10 = true;
            }
        }
        if (var10 && var11 < (float) arg0 && var12 > (float) arg0 && var13 < (float) arg1 && var14 > (float) arg1) {
            if (arg3) {
                return true;
            }
            if (this.field1129 > class159.field2508.length) {
                class159.field2508 = new int[this.field1129];
                class462.field7104 = new int[this.field1129];
            }
            for (int var18 = 0; var18 < this.field1133; var18++) {
                float var20 = (float) this.field1147[var18];
                float var21 = (float) this.field1192[var18];
                float var22 = (float) this.field1200[var18];
                float var23 = class441.field6471 * var20 + class52.field795 * var21 + class362.field5346 * var22 + var9;
                float var24 = class484.field7400 * var20 + class391.field5732 * var21 + class28.field356 * var22 + var7;
                float var25 = class467.field7170 * var20 + class402.field5861 * var21 + class297.field4511 * var22 + var8;
                if ((var23 >= (float) this.field1173.field6800)) {
                    int var30 = (int) ((float) var15 * var24 / var23 + (float) this.field1173.field6828);
                    int var31 = (int) ((float) var16 * var25 / var23 + (float) this.field1173.field6754);
                    int var32 = this.field1125[var18];
                    int var33 = this.field1125[var18 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field1216[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        class159.field2508[var35] = var30;
                        class462.field7104[var35] = var31;
                    }
                } else {
                    int var26 = this.field1125[var18];
                    int var27 = this.field1125[var18 + 1];
                    for (int var28 = var26; var28 < var27; var28++) {
                        int var29 = this.field1216[var28] - 1;
                        if (var29 == -1) {
                            break;
                        }
                        class159.field2508[this.field1216[var28] - 1] = -999999;
                    }
                }
            }
            for (int var19 = 0; var19 < this.field1111; var19++) {
                if (class159.field2508[this.field1191[var19]] != -999999 && class159.field2508[this.field1199[var19]] != -999999 && class159.field2508[this.field1155[var19]] != -999999 && this.method475(class159.field2508[this.field1155[var19]], class159.field2508[this.field1199[var19]], arg1, arg0, class462.field7104[this.field1155[var19]], false, class159.field2508[this.field1191[var19]], class462.field7104[this.field1191[var19]], class462.field7104[this.field1199[var19]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)V", line = 4358)
    private final void method496(int arg0, boolean arg1) {
        if (class273.field4146.field536.length < this.field1207 * 6) {
            class273.field4146 = new class315(this.field1207 * 6 + 600);
        } else {
            class273.field4146.field585 = 0;
        }
        int var3 = 1 % ((arg0 - 18) / 56);
        field1116++;
        if (this.field1173.field6745) {
            for (int var4 = 0; var4 < this.field1207; var4++) {
                class273.field4146.method246((byte) -86, this.field1191[var4]);
                class273.field4146.method246((byte) -65, this.field1199[var4]);
                class273.field4146.method246((byte) -55, this.field1155[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field1207; var5++) {
                class273.field4146.method260(this.field1191[var5], -2916);
                class273.field4146.method260(this.field1199[var5], -2916);
                class273.field4146.method260(this.field1155[var5], -2916);
            }
        }
        if (class273.field4146.field585 == 0) {
            return;
        }
        if (arg1) {
            if (this.field1184 == null) {
                this.field1184 = this.field1173.method2601(true, class273.field4146.field585, 5123, (byte) 54, class273.field4146.field536);
            } else {
                this.field1184.method353(5123, class273.field4146.field536, class273.field4146.field585, (byte) -27);
            }
            this.field1110.field3885 = this.field1184;
        } else {
            this.field1110.field3885 = this.field1173.method2601(false, class273.field4146.field585, 5123, (byte) 54, class273.field4146.field536);
        }
        if (!arg1) {
            this.field1164 = true;
        }
    }

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "()V", line = 4419)
    public final void method497() {
        field1201++;
        for (int var1 = 0; var1 < this.field1133; var1++) {
            this.field1147[var1] = -this.field1147[var1];
        }
        for (int var2 = 0; var2 < this.field1129; var2++) {
            this.field1130[var2] = (short) (-this.field1130[var2]);
        }
        for (int var3 = 0; var3 < this.field1111; var3++) {
            short var4 = this.field1191[var3];
            this.field1191[var3] = this.field1155[var3];
            this.field1155[var3] = var4;
        }
        if (this.field1151 == null && this.field1202 != null) {
            this.field1202.field5831 = null;
        }
        if (this.field1151 != null) {
            this.field1151.field5831 = null;
        }
        if (this.field1110 != null) {
            this.field1110.field3885 = null;
        }
        this.field1149 = false;
        if (this.field1163 != null) {
            this.field1163.field5831 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)V", line = 4478)
    public final void method498(int arg0) {
        field1219++;
        int var2 = class195.field3075[arg0];
        int var3 = class195.field3077[arg0];
        for (int var4 = 0; var4 < this.field1133; var4++) {
            int var7 = this.field1200[var4] * var3 + this.field1147[var4] * var2 >> 15;
            this.field1147[var4] = this.field1147[var4] * var3 - (this.field1200[var4] * var2) >> 15;
            this.field1200[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field1129; var5++) {
            int var6 = this.field1195[var5] * var3 + this.field1130[var5] * var2 >> 15;
            this.field1130[var5] = (short) (this.field1130[var5] * var3 - (this.field1195[var5] * var2) >> 15);
            this.field1195[var5] = (short) var6;
        }
        if (this.field1151 == null && this.field1202 != null) {
            this.field1202.field5831 = null;
        }
        if (this.field1151 != null) {
            this.field1151.field5831 = null;
        }
        this.field1149 = false;
        if (this.field1163 != null) {
            this.field1163.field5831 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "(I)V", line = 4534)
    private final void method499(int arg0) {
        if (this.field1197 != null) {
            class34 var2 = this.field1173.field6684;
            float var3 = this.field1173.method1968();
            float var4 = this.field1173.method1984();
            this.field1173.method2611(123);
            this.field1173.method1895(false);
            this.field1173.method2600((byte) -111, false);
            this.field1173.method2646(null, this.field1173.field6747, -19887, null, this.field1173.field6788);
            for (int var5 = 0; var5 < this.field1172; var5++) {
                class316 var6 = this.field1197[var5];
                class149 var7 = this.field1185[var5];
                if (!var6.field4757 || !this.field1173.method1975()) {
                    float var8 = (float) (this.field1200[var6.field4764] + this.field1200[var6.field4754] + this.field1200[var6.field4762]) * 0.3333333F;
                    float var9 = (float) (this.field1192[var6.field4764] + this.field1192[var6.field4762] + this.field1192[var6.field4754]) * 0.3333333F;
                    float var10 = (float) (this.field1147[var6.field4764] + this.field1147[var6.field4762] + this.field1147[var6.field4754]) * 0.3333333F;
                    float var11 = class484.field7400 * var10 + class391.field5732 * var9 + class28.field356 * var8 + class405.field5888;
                    float var12 = class467.field7170 * var10 + class402.field5861 * var9 + class297.field4511 * var8 + class372.field5446;
                    float var13 = class441.field6471 * var10 + class52.field795 * var9 + class362.field5346 * var8 + class402.field5858;
                    var2.method202(var7.field2403, false, (float) var7.field2404 - var12, var6.field4767 * var7.field2398 >> 7, (float) var7.field2407 + var11, var6.field4755 * var7.field2396 >> 7, -var13);
                    this.field1173.method2613(1, var2);
                    this.field1173.method1993(var4, var3 - (float) var6.field4758 * 1.5F);
                    int var14 = var7.field2405;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field1173.method2650((byte) -99, var6.field4763);
                    this.field1173.method2640(27575, var6.field4765);
                    this.field1173.method2610(0, var6.field4760);
                    this.field1173.method2652(7, (byte) -103, 4, 0);
                }
            }
            this.field1173.method1993(var4, var3);
            this.field1173.method1895(true);
            this.field1173.method2645(4353);
        }
        field1217++;
        if (arg0 <= 3) {
            this.field1204 = -82;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lh;)Lh;", line = 4599)
    public final class452 method500(class452 arg0) {
        field1157++;
        if (this.field1129 == 0) {
            return null;
        }
        if (!this.field1149) {
            this.method465(8);
        }
        int var2;
        int var3;
        if (this.field1173.field6790 <= 0) {
            var2 = this.field1141 - (this.field1173.field6790 * this.field1159 >> 8) >> this.field1173.field6686;
            var3 = this.field1126 - (this.field1173.field6790 * this.field1215 >> 8) >> this.field1173.field6686;
        } else {
            var2 = this.field1141 - (this.field1173.field6790 * this.field1215 >> 8) >> this.field1173.field6686;
            var3 = this.field1126 - (this.field1173.field6790 * this.field1159 >> 8) >> this.field1173.field6686;
        }
        int var4;
        int var5;
        if (this.field1173.field6748 > 0) {
            var4 = this.field1158 - (this.field1173.field6748 * this.field1215 >> 8) >> this.field1173.field6686;
            var5 = this.field1115 - (this.field1173.field6748 * this.field1159 >> 8) >> this.field1173.field6686;
        } else {
            var4 = this.field1158 - (this.field1173.field6748 * this.field1159 >> 8) >> this.field1173.field6686;
            var5 = this.field1115 - (this.field1173.field6748 * this.field1215 >> 8) >> this.field1173.field6686;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class279 var8 = (class279) arg0;
        class279 var9;
        if (var8 != null && var8.method1708(var7, var6, -128)) {
            var9 = var8;
            var8.method1706((byte) 0);
        } else {
            var9 = new class279(this.field1173, var6, var7);
        }
        var9.method1710(var5, var2, var3, var4, 0);
        this.method460(-1, var9);
        return var9;
    }

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "()I", line = 4665)
    public final int method501() {
        field1198++;
        if (!this.field1149) {
            this.method465(8);
        }
        return this.field1215;
    }

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "()[Loo;", line = 4684)
    public final class425[] method502() {
        field1131++;
        return this.field1139;
    }

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "()V", line = 4692)
    public final void method503() {
        field1174++;
        if (this.field1129 <= 0 || this.field1207 <= 0) {
            return;
        }
        this.method462((byte) 94, false);
        if ((this.field1189 & 0x10) == 0 && this.field1110.field3885 == null) {
            this.method496(-101, false);
        }
        this.method506(262144);
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V", line = 4709)
    public final void method504(int arg0) {
        this.field1168 = arg0;
        field1122++;
        if (this.field1205 != null && (this.field1168 & 0x10000) == 0) {
            this.field1130 = this.field1205.field4940;
            this.field1218 = this.field1205.field4942;
            this.field1195 = this.field1205.field4943;
            this.field1118 = this.field1205.field4947;
            this.field1205 = null;
        }
        this.field1164 = true;
        this.method506(262144);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(SS)V", line = 4732)
    public final void method505(short arg0, short arg1) {
        field1144++;
        class11 var3 = this.field1173.field4784;
        for (int var4 = 0; var4 < this.field1111; var4++) {
            if (this.field1142[var4] == arg0) {
                this.field1142[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class48 var7 = var3.method59(arg0 & 0xFFFF, 21645);
            var6 = var7.field723;
            var5 = var7.field727;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class48 var10 = var3.method59(arg1 & 0xFFFF, 21645);
            var9 = var10.field723;
            var8 = var10.field727;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field1197 != null) {
            for (int var11 = 0; var11 < this.field1172; var11++) {
                class316 var12 = this.field1197[var11];
                class149 var13 = this.field1185[var11];
                var13.field2405 = var13.field2405 & 0xFF000000 | class327.field4907[this.field1154[var12.field4759] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1202 != null) {
            this.field1202.field5831 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "(I)V", line = 4805)
    private final void method506(int arg0) {
        field1119++;
        if (!this.field1164) {
            return;
        }
        this.field1164 = false;
        if (this.field1139 == null && this.field1206 == null && this.field1197 == null) {
            if (this.field1200 != null && !class361.method2197(this.field1168, -1, this.field1156)) {
                if (this.field1163 != null && this.field1163.field5831 == null) {
                    this.field1164 = true;
                } else {
                    if (!this.field1149) {
                        this.method465(8);
                    }
                    this.field1200 = null;
                }
            }
            if (this.field1192 != null && !class411.method2428(this.field1168, this.field1156, -126)) {
                if (this.field1163 != null && this.field1163.field5831 == null) {
                    this.field1164 = true;
                } else {
                    if (!this.field1149) {
                        this.method465(arg0 - 262136);
                    }
                    this.field1192 = null;
                }
            }
            if (this.field1147 != null && !class215.method1327(this.field1156, (byte) 121, this.field1168)) {
                if (this.field1163 != null && this.field1163.field5831 == null) {
                    this.field1164 = true;
                } else {
                    if (!this.field1149) {
                        this.method465(8);
                    }
                    this.field1147 = null;
                }
            }
        }
        if (this.field1216 != null && this.field1200 == null && this.field1192 == null && this.field1147 == null) {
            this.field1216 = null;
            this.field1125 = null;
        }
        if (this.field1218 != null && !class306.method1838(this.field1168, arg0 - 262144, this.field1156)) {
            if (this.field1151 == null) {
                if (this.field1202 != null && this.field1202.field5831 == null) {
                    this.field1164 = true;
                } else {
                    this.field1195 = this.field1118 = this.field1130 = null;
                    this.field1218 = null;
                }
            } else if (this.field1151.field5831 == null) {
                this.field1164 = true;
            } else {
                this.field1195 = this.field1118 = this.field1130 = null;
                this.field1218 = null;
            }
        }
        if (this.field1154 != null && !class460.method2750(this.field1156, 124, this.field1168)) {
            if (this.field1202 != null && this.field1202.field5831 == null) {
                this.field1164 = true;
            } else {
                this.field1154 = null;
            }
        }
        if (this.field1213 != null && !class217.method1331(this.field1156, (byte) 13, this.field1168)) {
            if (this.field1202 != null && this.field1202.field5831 == null) {
                this.field1164 = true;
            } else {
                this.field1213 = null;
            }
        }
        if (this.field1194 != null && !class350.method2130(this.field1156, this.field1168, (byte) 81)) {
            if (this.field1182 != null && this.field1182.field5831 == null) {
                this.field1164 = true;
            } else {
                this.field1194 = this.field1165 = null;
            }
        }
        if (this.field1142 != null && !class321.method2010(103, this.field1156, this.field1168)) {
            if (this.field1202 != null && this.field1202.field5831 == null) {
                this.field1164 = true;
            } else {
                this.field1142 = null;
            }
        }
        if (this.field1191 != null && !class227.method1367(this.field1168, this.field1156, (byte) -62)) {
            if ((this.field1110 == null || this.field1110.field3885 != null) && (this.field1202 == null || this.field1202.field5831 != null)) {
                this.field1191 = this.field1199 = this.field1155 = null;
            } else {
                this.field1164 = true;
            }
        }
        if (arg0 != 262144) {
            return;
        }
        if (this.field1170 != null && !class463.method2760(this.field1156, this.field1168, arg0 ^ 0x40002)) {
            this.field1170 = null;
            this.field1162 = null;
        }
        if (this.field1209 != null && !class134.method882(this.field1168, 16, this.field1156)) {
            this.field1160 = null;
            this.field1209 = null;
        }
        if (this.field1134 != null && !class298.method1802(this.field1168, (byte) -73, this.field1156)) {
            this.field1134 = null;
        }
        if (this.field1143 != null && (this.field1168 & 0x800) == 0 && (this.field1168 & 0x40000) == 0) {
            this.field1143 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLri;Lri;ZIZ)Lcd;", line = 4987)
    private final class198 method507(byte arg0, class69 arg1, class69 arg2, boolean arg3, int arg4, boolean arg5) {
        arg1.field1156 = this.field1156;
        arg1.field1111 = this.field1111;
        arg1.field1129 = this.field1129;
        arg1.field1207 = this.field1207;
        arg1.field1169 = this.field1169;
        arg1.field1189 = 0;
        arg1.field1133 = this.field1133;
        arg1.field1137 = this.field1137;
        arg1.field1172 = this.field1172;
        arg1.field1153 = this.field1153;
        arg1.field1168 = arg4;
        field1112++;
        boolean var7 = class247.method1494(this.field1156, 17, arg4);
        boolean var8 = class313.method1873(arg4, (byte) 85, this.field1156);
        boolean var9 = class208.method1277(this.field1156, 24719, arg4);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg1.field1200 = this.field1200;
            } else if (arg2.field1200 == null || arg2.field1200.length < this.field1169) {
                arg1.field1200 = arg2.field1200 = new int[this.field1169];
            } else {
                arg1.field1200 = arg2.field1200;
            }
            if (!var8) {
                arg1.field1192 = this.field1192;
            } else if (arg2.field1192 == null || this.field1169 > arg2.field1192.length) {
                arg1.field1192 = arg2.field1192 = new int[this.field1169];
            } else {
                arg1.field1192 = arg2.field1192;
            }
            if (!var9) {
                arg1.field1147 = this.field1147;
            } else if (arg2.field1147 == null || arg2.field1147.length < this.field1169) {
                arg1.field1147 = arg2.field1147 = new int[this.field1169];
            } else {
                arg1.field1147 = arg2.field1147;
            }
            for (int var11 = 0; var11 < this.field1169; var11++) {
                if (var7) {
                    arg1.field1200[var11] = this.field1200[var11];
                }
                if (var8) {
                    arg1.field1192[var11] = this.field1192[var11];
                }
                if (var9) {
                    arg1.field1147[var11] = this.field1147[var11];
                }
            }
        } else {
            arg1.field1192 = this.field1192;
            arg1.field1200 = this.field1200;
            arg1.field1147 = this.field1147;
        }
        if (class178.method1118((byte) -106, arg4, this.field1156)) {
            arg1.field1163 = arg2.field1163;
            if (arg5) {
                arg1.field1189 = (byte) (arg1.field1189 | 0x1);
            }
            arg1.field1163.field5831 = this.field1163.field5831;
            arg1.field1163.field5828 = this.field1163.field5828;
        } else if (class370.method2241((byte) -103, this.field1156, arg4)) {
            arg1.field1163 = this.field1163;
        } else {
            arg1.field1163 = null;
        }
        if (class496.method2984(this.field1156, arg4, (byte) -87)) {
            if (arg2.field1154 == null || this.field1111 > arg2.field1154.length) {
                arg1.field1154 = arg2.field1154 = new short[this.field1111];
            } else {
                arg1.field1154 = arg2.field1154;
            }
            for (int var12 = 0; var12 < this.field1111; var12++) {
                arg1.field1154[var12] = this.field1154[var12];
            }
        } else {
            arg1.field1154 = this.field1154;
        }
        if (class476.method2866(arg4, (byte) -124, this.field1156)) {
            if (arg2.field1213 == null || this.field1111 > arg2.field1213.length) {
                arg1.field1213 = arg2.field1213 = new byte[this.field1111];
            } else {
                arg1.field1213 = arg2.field1213;
            }
            for (int var13 = 0; var13 < this.field1111; var13++) {
                arg1.field1213[var13] = this.field1213[var13];
            }
        } else {
            arg1.field1213 = this.field1213;
        }
        if (class78.method567(arg4, (byte) -121, this.field1156)) {
            if (arg5) {
                arg1.field1189 = (byte) (arg1.field1189 | 0x2);
            }
            arg1.field1202 = arg2.field1202;
            arg1.field1202.field5828 = this.field1202.field5828;
            arg1.field1202.field5831 = this.field1202.field5831;
        } else if (class98.method743(0, this.field1156, arg4)) {
            arg1.field1202 = this.field1202;
        } else {
            arg1.field1202 = null;
        }
        if (class264.method1609(876, arg4, this.field1156)) {
            if (arg2.field1195 == null || arg2.field1195.length < this.field1129) {
                int var14 = this.field1129;
                arg1.field1195 = arg2.field1195 = new short[var14];
                arg1.field1118 = arg2.field1118 = new short[var14];
                arg1.field1130 = arg2.field1130 = new short[var14];
            } else {
                arg1.field1130 = arg2.field1130;
                arg1.field1118 = arg2.field1118;
                arg1.field1195 = arg2.field1195;
            }
            if (this.field1205 == null) {
                for (int var18 = 0; var18 < this.field1129; var18++) {
                    arg1.field1195[var18] = this.field1195[var18];
                    arg1.field1118[var18] = this.field1118[var18];
                    arg1.field1130[var18] = this.field1130[var18];
                }
            } else {
                if (arg2.field1205 == null) {
                    arg2.field1205 = new class330();
                }
                class330 var15 = arg1.field1205 = arg2.field1205;
                if (var15.field4943 == null || var15.field4943.length < this.field1129) {
                    int var16 = this.field1129;
                    var15.field4943 = new short[var16];
                    var15.field4940 = new short[var16];
                    var15.field4947 = new short[var16];
                    var15.field4942 = new byte[var16];
                }
                for (int var17 = 0; var17 < this.field1129; var17++) {
                    arg1.field1195[var17] = this.field1195[var17];
                    arg1.field1118[var17] = this.field1118[var17];
                    arg1.field1130[var17] = this.field1130[var17];
                    var15.field4943[var17] = this.field1205.field4943[var17];
                    var15.field4947[var17] = this.field1205.field4947[var17];
                    var15.field4940[var17] = this.field1205.field4940[var17];
                    var15.field4942[var17] = this.field1205.field4942[var17];
                }
            }
            arg1.field1218 = this.field1218;
        } else {
            arg1.field1130 = this.field1130;
            arg1.field1195 = this.field1195;
            arg1.field1118 = this.field1118;
            arg1.field1218 = this.field1218;
            arg1.field1205 = this.field1205;
        }
        if (class295.method1791(this.field1156, 0, arg4)) {
            arg1.field1151 = arg2.field1151;
            if (arg5) {
                arg1.field1189 = (byte) (arg1.field1189 | 0x4);
            }
            arg1.field1151.field5831 = this.field1151.field5831;
            arg1.field1151.field5828 = this.field1151.field5828;
        } else if (client.method1171(-111, arg4, this.field1156)) {
            arg1.field1151 = this.field1151;
        } else {
            arg1.field1151 = null;
        }
        if (class284.method1732(arg4, 0, this.field1156)) {
            if (arg2.field1194 == null || this.field1111 > arg2.field1194.length) {
                int var19 = this.field1129;
                arg1.field1194 = arg2.field1194 = new float[var19];
                arg1.field1165 = arg2.field1165 = new float[var19];
            } else {
                arg1.field1165 = arg2.field1165;
                arg1.field1194 = arg2.field1194;
            }
            for (int var20 = 0; var20 < this.field1129; var20++) {
                arg1.field1194[var20] = this.field1194[var20];
                arg1.field1165[var20] = this.field1165[var20];
            }
        } else {
            arg1.field1165 = this.field1165;
            arg1.field1194 = this.field1194;
        }
        if (class248.method1498(arg4, this.field1156, (byte) -44)) {
            if (arg5) {
                arg1.field1189 = (byte) (arg1.field1189 | 0x8);
            }
            arg1.field1182 = arg2.field1182;
            arg1.field1182.field5828 = this.field1182.field5828;
            arg1.field1182.field5831 = this.field1182.field5831;
        } else if (class308.method1851(0, this.field1156, arg4)) {
            arg1.field1182 = this.field1182;
        } else {
            arg1.field1182 = null;
        }
        if (class111.method799(1, arg4, this.field1156)) {
            if (arg2.field1191 == null || this.field1111 > arg2.field1191.length) {
                int var21 = this.field1111;
                arg1.field1155 = arg2.field1155 = new short[var21];
                arg1.field1199 = arg2.field1199 = new short[var21];
                arg1.field1191 = arg2.field1191 = new short[var21];
            } else {
                arg1.field1191 = arg2.field1191;
                arg1.field1155 = arg2.field1155;
                arg1.field1199 = arg2.field1199;
            }
            for (int var22 = 0; var22 < this.field1111; var22++) {
                arg1.field1191[var22] = this.field1191[var22];
                arg1.field1199[var22] = this.field1199[var22];
                arg1.field1155[var22] = this.field1155[var22];
            }
        } else {
            arg1.field1191 = this.field1191;
            arg1.field1199 = this.field1199;
            arg1.field1155 = this.field1155;
        }
        if (class366.method2212(arg4, this.field1156, (byte) 93)) {
            if (arg5) {
                arg1.field1189 = (byte) (arg1.field1189 | 0x10);
            }
            arg1.field1110 = arg2.field1110;
            arg1.field1110.field3885 = this.field1110.field3885;
        } else if (class65.method448(arg4, 0, this.field1156)) {
            arg1.field1110 = this.field1110;
        } else {
            arg1.field1110 = null;
        }
        if (class222.method1353(arg4, this.field1156, 119)) {
            if (arg2.field1142 == null || this.field1111 > arg2.field1142.length) {
                int var23 = this.field1111;
                arg1.field1142 = arg2.field1142 = new short[var23];
            } else {
                arg1.field1142 = arg2.field1142;
            }
            for (int var24 = 0; var24 < this.field1111; var24++) {
                arg1.field1142[var24] = this.field1142[var24];
            }
        } else {
            arg1.field1142 = this.field1142;
        }
        if (!class313.method1871(arg4, this.field1156, 127)) {
            arg1.field1185 = this.field1185;
        } else if (arg2.field1185 == null || this.field1172 > arg2.field1185.length) {
            int var26 = this.field1172;
            arg1.field1185 = arg2.field1185 = new class149[var26];
            for (int var27 = 0; var27 < this.field1172; var27++) {
                arg1.field1185[var27] = this.field1185[var27].method968(-1);
            }
        } else {
            arg1.field1185 = arg2.field1185;
            for (int var25 = 0; var25 < this.field1172; var25++) {
                arg1.field1185[var25].method972(this.field1185[var25], 125);
            }
        }
        arg1.field1143 = this.field1143;
        arg1.field1170 = this.field1170;
        arg1.field1209 = this.field1209;
        if (this.field1149) {
            arg1.field1204 = this.field1204;
            arg1.field1158 = this.field1158;
            arg1.field1141 = this.field1141;
            arg1.field1126 = this.field1126;
            arg1.field1159 = this.field1159;
            arg1.field1215 = this.field1215;
            arg1.field1149 = true;
            arg1.field1115 = this.field1115;
        } else {
            arg1.field1149 = false;
        }
        arg1.field1139 = this.field1139;
        arg1.field1206 = this.field1206;
        arg1.field1125 = this.field1125;
        arg1.field1216 = this.field1216;
        arg1.field1162 = this.field1162;
        arg1.field1134 = this.field1134;
        arg1.field1197 = this.field1197;
        arg1.field1160 = this.field1160;
        if (arg0 >= -101) {
            this.field1205 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)V", line = 5451)
    public final void method508(int arg0, int arg1, int arg2) {
        field1128++;
        for (int var4 = 0; var4 < this.field1133; var4++) {
            if (arg0 != 0) {
                this.field1200[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field1192[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field1147[var4] += arg2;
            }
        }
        if (this.field1163 != null) {
            this.field1163.field5831 = null;
        }
        this.field1149 = false;
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "()Z", line = 5487)
    public final boolean method509() {
        field1124++;
        if (this.field1209 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field1169; var1++) {
            this.field1200[var1] <<= 0x4;
            this.field1192[var1] <<= 0x4;
            this.field1147[var1] <<= 0x4;
        }
        class368.field5406 = 0;
        class14.field167 = 0;
        class145.field2349 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "()I", line = 5523)
    public final int method510() {
        if (!this.field1149) {
            this.method465(8);
        }
        field1123++;
        return this.field1115;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIZ)Lcd;", line = 5535)
    public final class198 method511(byte arg0, int arg1, boolean arg2) {
        field1150++;
        class69 var4;
        class69 var5;
        if (arg0 == 1) {
            var5 = this.field1173.field6801;
            var4 = this.field1173.field6733;
        } else if (arg0 == 2) {
            var4 = this.field1173.field6766;
            var5 = this.field1173.field6821;
        } else if (arg0 == 3) {
            var4 = this.field1173.field6784;
            var5 = this.field1173.field6804;
        } else if (arg0 == 4) {
            var4 = this.field1173.field6777;
            var5 = this.field1173.field6764;
        } else if (arg0 == 5) {
            var5 = this.field1173.field6775;
            var4 = this.field1173.field6714;
        } else {
            var4 = var5 = new class69(this.field1173);
        }
        return this.method507((byte) -109, var4, var5, arg2, arg1, arg0 != 0);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIILwr;IFIJFI)S", line = 5596)
    private final short method512(byte arg0, int arg1, int arg2, class303 arg3, int arg4, float arg5, int arg6, long arg7, float arg8, int arg9) {
        field1181++;
        int var12 = this.field1125[arg1];
        int var13 = this.field1125[arg1 + 1];
        if (arg0 != -13) {
            this.method468();
        }
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field1216[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class119.field1966[var15] == arg7) {
                return (short) (var16 - 1);
            }
        }
        this.field1216[var14] = (short) (this.field1129 + 1);
        class119.field1966[var14] = arg7;
        this.field1195[this.field1129] = (short) arg6;
        this.field1118[this.field1129] = (short) arg4;
        this.field1130[this.field1129] = (short) arg9;
        this.field1218[this.field1129] = (byte) arg2;
        this.field1194[this.field1129] = arg8;
        this.field1165[this.field1129] = arg5;
        return (short) (this.field1129++);
    }
}
