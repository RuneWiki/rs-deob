import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class82 extends class159 {

    @OriginalMember(owner = "client!qu", name = "J", descriptor = "I")
    private int field1103 = 0;

    @OriginalMember(owner = "client!qu", name = "H", descriptor = "Z")
    private boolean field1101 = false;

    @OriginalMember(owner = "client!qu", name = "ib", descriptor = "I")
    private int field1128 = 0;

    @OriginalMember(owner = "client!qu", name = "Ub", descriptor = "I")
    private int field1166 = 0;

    @OriginalMember(owner = "client!qu", name = "jb", descriptor = "Z")
    private boolean field1129 = true;

    @OriginalMember(owner = "client!qu", name = "dc", descriptor = "I")
    private int field1175 = 0;

    @OriginalMember(owner = "client!qu", name = "tb", descriptor = "I")
    private int field1139 = 0;

    @OriginalMember(owner = "client!qu", name = "yb", descriptor = "Lte;")
    private class527 field1144;

    @OriginalMember(owner = "client!qu", name = "Mb", descriptor = "Lmaa;")
    private class403 field1158;

    @OriginalMember(owner = "client!qu", name = "P", descriptor = "Lmaa;")
    private class403 field1109;

    @OriginalMember(owner = "client!qu", name = "r", descriptor = "Lmaa;")
    private class403 field1085;

    @OriginalMember(owner = "client!qu", name = "K", descriptor = "Lmaa;")
    private class403 field1104;

    @OriginalMember(owner = "client!qu", name = "pb", descriptor = "Lim;")
    private class491 field1135;

    @OriginalMember(owner = "client!qu", name = "kc", descriptor = "I")
    private int field1182;

    @OriginalMember(owner = "client!qu", name = "Kb", descriptor = "I")
    private int field1156;

    @OriginalMember(owner = "client!qu", name = "pc", descriptor = "[I")
    private int[] field1187;

    @OriginalMember(owner = "client!qu", name = "Ob", descriptor = "[S")
    private short[] field1160;

    @OriginalMember(owner = "client!qu", name = "mc", descriptor = "[I")
    private int[] field1184;

    @OriginalMember(owner = "client!qu", name = "cc", descriptor = "[I")
    private int[] field1174;

    @OriginalMember(owner = "client!qu", name = "nb", descriptor = "[I")
    private int[] field1133;

    @OriginalMember(owner = "client!qu", name = "Sb", descriptor = "[Llh;")
    private class450[] field1164;

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "[Lia;")
    private class506[] field1083;

    @OriginalMember(owner = "client!qu", name = "db", descriptor = "I")
    private int field1123;

    @OriginalMember(owner = "client!qu", name = "S", descriptor = "[Lge;")
    private class609[] field1112;

    @OriginalMember(owner = "client!qu", name = "lb", descriptor = "[Lvd;")
    private class35[] field1131;

    @OriginalMember(owner = "client!qu", name = "Qb", descriptor = "S")
    private short field1162;

    @OriginalMember(owner = "client!qu", name = "Jb", descriptor = "[S")
    private short[] field1155;

    @OriginalMember(owner = "client!qu", name = "eb", descriptor = "S")
    private short field1124;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "[S")
    private short[] field1082;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "[S")
    private short[] field1084;

    @OriginalMember(owner = "client!qu", name = "M", descriptor = "[F")
    private float[] field1106;

    @OriginalMember(owner = "client!qu", name = "Yb", descriptor = "[F")
    private float[] field1170;

    @OriginalMember(owner = "client!qu", name = "jc", descriptor = "[S")
    private short[] field1181;

    @OriginalMember(owner = "client!qu", name = "ub", descriptor = "[S")
    private short[] field1140;

    @OriginalMember(owner = "client!qu", name = "C", descriptor = "[S")
    private short[] field1096;

    @OriginalMember(owner = "client!qu", name = "x", descriptor = "[S")
    private short[] field1091;

    @OriginalMember(owner = "client!qu", name = "X", descriptor = "[B")
    private byte[] field1117;

    @OriginalMember(owner = "client!qu", name = "N", descriptor = "[S")
    private short[] field1107;

    @OriginalMember(owner = "client!qu", name = "hc", descriptor = "[S")
    private short[] field1179;

    @OriginalMember(owner = "client!qu", name = "Z", descriptor = "[B")
    private byte[] field1119;

    @OriginalMember(owner = "client!qu", name = "Hb", descriptor = "[S")
    private short[] field1153;

    @OriginalMember(owner = "client!qu", name = "gc", descriptor = "[I")
    private int[] field1178;

    @OriginalMember(owner = "client!qu", name = "Ab", descriptor = "[[I")
    private int[][] field1146;

    @OriginalMember(owner = "client!qu", name = "cb", descriptor = "[[I")
    private int[][] field1122;

    @OriginalMember(owner = "client!qu", name = "u", descriptor = "[[I")
    private int[][] field1088;

    @OriginalMember(owner = "client!qu", name = "w", descriptor = "B")
    private byte field1090;

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!qu", name = "s", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!qu", name = "t", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!qu", name = "v", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!qu", name = "A", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!qu", name = "B", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!qu", name = "D", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!qu", name = "E", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!qu", name = "F", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!qu", name = "G", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!qu", name = "I", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!qu", name = "L", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!qu", name = "O", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!qu", name = "Q", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!qu", name = "U", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!qu", name = "V", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!qu", name = "W", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!qu", name = "Y", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!qu", name = "ab", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!qu", name = "bb", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!qu", name = "gb", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!qu", name = "kb", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!qu", name = "mb", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!qu", name = "ob", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!qu", name = "qb", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!qu", name = "rb", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!qu", name = "vb", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!qu", name = "wb", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!qu", name = "xb", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!qu", name = "zb", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!qu", name = "Bb", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!qu", name = "Cb", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!qu", name = "Db", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!qu", name = "Eb", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!qu", name = "Fb", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!qu", name = "Gb", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!qu", name = "Ib", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!qu", name = "Lb", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!qu", name = "Nb", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!qu", name = "Pb", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!qu", name = "Rb", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!qu", name = "Tb", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!qu", name = "Vb", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!qu", name = "Wb", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!qu", name = "ac", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!qu", name = "bc", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!qu", name = "ec", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!qu", name = "fc", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!qu", name = "ic", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!qu", name = "lc", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!qu", name = "oc", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!qu", name = "qc", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!qu", name = "sc", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!qu", name = "tc", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!qu", name = "uc", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!qu", name = "R", descriptor = "Ljf;")
    private class184 field1111;

    @OriginalMember(owner = "client!qu", name = "T", descriptor = "Lsp;")
    private class544 field1113;

    @OriginalMember(owner = "client!qu", name = "hb", descriptor = "Lmj;")
    private class562 field1127;

    @OriginalMember(owner = "client!qu", name = "y", descriptor = "S")
    private short field1092;

    @OriginalMember(owner = "client!qu", name = "fb", descriptor = "S")
    private short field1125;

    @OriginalMember(owner = "client!qu", name = "sb", descriptor = "S")
    private short field1138;

    @OriginalMember(owner = "client!qu", name = "Xb", descriptor = "S")
    private short field1169;

    @OriginalMember(owner = "client!qu", name = "Zb", descriptor = "S")
    private short field1171;

    @OriginalMember(owner = "client!qu", name = "nc", descriptor = "S")
    private short field1185;

    @OriginalMember(owner = "client!qu", name = "rc", descriptor = "S")
    private short field1189;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIZIIZ)V", line = 5)
    public static final void method615(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        field1151++;
        if (class420.field5697 == null) {
            class99.field1445.method1378(!arg5, arg3, -16777216, arg1, arg4, arg0);
        } else if (class541.field8119.field8496 >= 0 && class146.field2125 * 128 > class541.field8119.field8496 && class541.field8119.field8500 >= 0 && (class410.field5609 * 128) > class541.field8119.field8500) {
            class84.field1205++;
            if (class541.field8119 != null && class541.field8119.field8496 - (class541.field8119.method940(-1) - 1) * 64 >> 7 == class618.field9137 && class541.field8119.field8500 + 64 - class541.field8119.method940(-1) * 64 >> 7 == class349.field4776) {
                class618.field9137 = -1;
                class349.field4776 = -1;
                class169.method1204(-61);
            }
            class354.method2140((byte) -45);
            if (!arg2) {
                class388.method2309((byte) -78);
            }
            class376.method2248((byte) 51);
            class55.method360((byte) 38, arg3, arg1, arg0, arg4, true);
            int var6 = class549.field8211;
            int var7 = class595.field8777;
            int var8 = class354.field4828;
            int var9 = class151.field2297;
            if (class531.field7929 == 1) {
                int var10 = (int) class278.field3902;
                if (var10 < (class1.field2 >> 8)) {
                    var10 = class1.field2 >> 8;
                }
                if (class345.field4750[4] && class642.field9354[4] + 128 > var10) {
                    var10 = class642.field9354[4] + 128;
                }
                int var11 = (int) class539.field8023 + class232.field3379 & 0x3FFF;
                class323.method1939(var6, var10, class24.field224, var11, class111.field1579, (var10 >> 3) * 3 + 600 << 0, class132.method919(class89.field1339, class541.field8119.field8500, class541.field8119.field8496, (byte) -82) - 50, false);
            } else if (class531.field7929 == 4) {
                int var12 = (int) class278.field3902;
                if ((class1.field2 >> 8) > var12) {
                    var12 = class1.field2 >> 8;
                }
                if (class345.field4750[4] && var12 < class642.field9354[4] + 128) {
                    var12 = class642.field9354[4] + 128;
                }
                int var13 = (int) class539.field8023 & 0x3FFF;
                class323.method1939(var6, var12, class24.field224, var13, class111.field1579, (var12 >> 3) * 3 + 600 << 0, class132.method919(class89.field1339, class399.field5489, class214.field3160, (byte) -82) - 50, arg5);
            } else if (class531.field7929 == 5) {
                class519.method3072(var6, (byte) 102);
            }
            int var14 = class125.field1760;
            int var15 = class118.field1665;
            if (!arg5) {
                int var16 = class214.field3161;
                int var17 = class517.field7371;
                int var18 = class222.field3222;
                for (int var19 = 0; var19 < 5; var19++) {
                    if (class345.field4750[var19]) {
                        int var22 = (int) ((double) (class116.field1638[var19] * 2 + 1) * Math.random() + Math.sin((double) class312.field4311[var19] / 100.0D * (double) class365.field5031[var19]) * (double) class642.field9354[var19] - (double) class116.field1638[var19]);
                        if (var19 == 2) {
                            class214.field3161 += var22 << 0;
                        }
                        if (var19 == 0) {
                            class125.field1760 += var22 << 0;
                        }
                        if (var19 == 3) {
                            class222.field3222 = class222.field3222 + var22 & 0x3FFF;
                        }
                        if (var19 == 4) {
                            class517.field7371 += var22;
                            if (class517.field7371 < 1024) {
                                class517.field7371 = 1024;
                            } else if (class517.field7371 > 3072) {
                                class517.field7371 = 3072;
                            }
                        }
                        if (var19 == 1) {
                            class118.field1665 += var22 << 0;
                        }
                    }
                }
                if (class125.field1760 < 0) {
                    class125.field1760 = 0;
                }
                if (((class145.field2083 << 7) - 1) < class125.field1760) {
                    class125.field1760 = (class145.field2083 << 7) - 1;
                }
                if (class214.field3161 < 0) {
                    class214.field3161 = 0;
                }
                if ((class384.field5282 << 7) - 1 < class214.field3161) {
                    class214.field3161 = (class384.field5282 << 7) - 1;
                }
                class180.method1263(127);
                class80.method609(283268810);
                class99.field1445.method510(var7, var9, var7 + var8, var9 - -var6);
                class99.field1445.method465();
                int var20 = class149.field2211;
                if (class212.field3123 == null) {
                    class99.field1445.method421(var20);
                } else {
                    class212.field3123.method3381(var7, var9, class99.field1445, var20, var8, !arg5, class2.field8 << 3, class517.field7371, var6, class222.field3222);
                }
                class539.method3268(5);
                class259.field3707.method339(class125.field1760, class118.field1665, class214.field3161, -class517.field7371 & 0x3FFF, -class222.field3222 & 0x3FFF, -class234.field3396 & 0x3FFF);
                class99.field1445.method483(class259.field3707);
                class99.field1445.method516(var8 / 2 + var7, var6 / 2 + var9, class103.field1496 << 1, class103.field1496 << 1);
                class367.method2206(var8 / 2 + var7, -1, var6 / 2 + var9, class103.field1496 << 1, class103.field1496 << 1);
                class55.method356(class125.field1760, class214.field3161, -class517.field7371 & 0x3FFF, class118.field1665, (byte) 30, -class234.field3396 & 0x3FFF, -class222.field3222 & 0x3FFF);
                byte var21 = class56.field668.method1477(class526.field7533, 1) == 2 ? (byte) class84.field1205 : 1;
                class115.method829(class99.field1445, class617.field9123, class238.field3433, class259.field3707, class125.field1760, class118.field1665, class214.field3161, class383.field5270, class25.field240, class168.field2631, class144.field2013, class149.field2208, class513.field7337, class541.field8119.field8501 + 1, var21, class541.field8119.field8496 >> 7, class541.field8119.field8500 >> 7, !class56.field668.field6836);
                class539.method3268(5);
                if (class472.field6670 == 9) {
                    class276.method1733(var8, 256, var7, var9, 256, (byte) 70, var6);
                    class199.method1334(256, true, var7, var6, 256, var9, var8);
                    class437.method2549(var9, 256, var6, 256, (byte) -113, var7, var8);
                    class525.method3097(var6, var7, (byte) -108, var9, var8);
                }
                class368.method2208();
                class222.field3222 = var18;
                class125.field1760 = var14;
                class214.field3161 = var16;
                class517.field7371 = var17;
                class118.field1665 = var15;
                if (class491.field6999 && class177.field2706.method2462(0) == 0) {
                    class491.field6999 = false;
                }
                if (class491.field6999) {
                    class99.field1445.method1378(!arg5, var7, -16777216, var8, var6, var9);
                    class438.method2554(class459.field6493.method3408(86, class63.field795), false, (byte) -26, class465.field6539);
                }
            }
        } else {
            class99.field1445.method1378(true, arg3, -16777216, arg1, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!qu", name = "ga", descriptor = "()I", line = 199)
    public final int method53() {
        field1157++;
        return this.field1124;
    }

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "(I)V", line = 212)
    public final void method87(int arg0) {
        field1110++;
        int var2 = class589.field8742[arg0];
        int var3 = class589.field8735[arg0];
        for (int var4 = 0; var4 < this.field1103; var4++) {
            int var7 = this.field1174[var4] * var2 + (this.field1133[var4] * var3) >> 15;
            this.field1174[var4] = this.field1174[var4] * var3 - (this.field1133[var4] * var2) >> 15;
            this.field1133[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field1139; var5++) {
            int var6 = this.field1155[var5] * var2 + this.field1107[var5] * var3 >> 15;
            this.field1155[var5] = (short) (this.field1155[var5] * var3 - (this.field1107[var5] * var2) >> 15);
            this.field1107[var5] = (short) var6;
        }
        if (this.field1085 == null && this.field1104 != null) {
            this.field1104.field5515 = null;
        }
        if (this.field1085 != null) {
            this.field1085.field5515 = null;
        }
        if (this.field1158 != null) {
            this.field1158.field5515 = null;
        }
        this.field1101 = false;
    }

    @OriginalMember(owner = "client!qu", name = "va", descriptor = "()I", line = 264)
    public final int method58() {
        field1105++;
        if (!this.field1101) {
            this.method625((byte) 81);
        }
        return this.field1138;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIZI)V", line = 277)
    public static final void method616(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            method616(82, 88, -107, true, 96);
        }
        field1118++;
        if (class56.field668.field6840 != 0 && arg0 != 0 && class359.field4885 < 50 && arg2 != -1) {
            class378.field5206[class359.field4885++] = new class300((byte) 2, arg2, arg0, arg4, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLda;)V", line = 295)
    private final void method617(byte arg0, class54 arg1) {
        if (arg0 > -75) {
            this.field1112 = null;
        }
        field1141++;
        if (this.field1164 != null) {
            for (int var3 = 0; var3 < this.field1164.length; var3++) {
                class450 var4 = this.field1164[var3];
                class450 var5 = var4;
                if (var4.field6316 != null) {
                    var5 = var4.field6316;
                }
                var5.field6319 = (int) ((float) this.field1174[var4.field6320] * arg1.field622 + (float) this.field1184[var4.field6320] * arg1.field623 + (float) this.field1133[var4.field6320] * arg1.field645 + arg1.field629);
                var5.field6307 = (int) ((float) this.field1174[var4.field6320] * arg1.field627 + (float) this.field1184[var4.field6320] * arg1.field624 + (float) this.field1133[var4.field6320] * arg1.field634 + arg1.field612);
                var5.field6305 = (int) ((float) this.field1174[var4.field6320] * arg1.field642 + (float) this.field1184[var4.field6320] * arg1.field643 + (float) this.field1133[var4.field6320] * arg1.field619 + arg1.field616);
                var5.field6306 = (int) ((float) this.field1174[var4.field6313] * arg1.field622 + (float) this.field1184[var4.field6313] * arg1.field623 + (float) this.field1133[var4.field6313] * arg1.field645 + arg1.field629);
                var5.field6312 = (int) ((float) this.field1174[var4.field6313] * arg1.field627 + (float) this.field1184[var4.field6313] * arg1.field624 + (float) this.field1133[var4.field6313] * arg1.field634 + arg1.field612);
                var5.field6304 = (int) ((float) this.field1174[var4.field6313] * arg1.field642 + (float) this.field1184[var4.field6313] * arg1.field643 + (float) this.field1133[var4.field6313] * arg1.field619 + arg1.field616);
                var5.field6322 = (int) ((float) this.field1174[var4.field6311] * arg1.field622 + (float) this.field1184[var4.field6311] * arg1.field623 + (float) this.field1133[var4.field6311] * arg1.field645 + arg1.field629);
                var5.field6317 = (int) ((float) this.field1174[var4.field6311] * arg1.field627 + (float) this.field1184[var4.field6311] * arg1.field624 + (float) this.field1133[var4.field6311] * arg1.field634 + arg1.field612);
                var5.field6310 = (int) ((float) this.field1174[var4.field6311] * arg1.field642 + (float) this.field1184[var4.field6311] * arg1.field643 + (float) this.field1133[var4.field6311] * arg1.field619 + arg1.field616);
            }
        }
        if (this.field1083 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field1083.length; var6++) {
            class506 var7 = this.field1083[var6];
            class506 var8 = var7;
            if (var7.field7160 != null) {
                var8 = var7.field7160;
            }
            if (var7.field7159 == null) {
                var7.field7159 = arg1.method335();
            } else {
                var7.field7159.method337(arg1);
            }
            var8.field7156 = (int) ((float) this.field1174[var7.field7149] * arg1.field622 + (float) this.field1184[var7.field7149] * arg1.field623 + (float) this.field1133[var7.field7149] * arg1.field645 + arg1.field629);
            var8.field7150 = (int) ((float) this.field1174[var7.field7149] * arg1.field627 + (float) this.field1184[var7.field7149] * arg1.field624 + (float) this.field1133[var7.field7149] * arg1.field634 + arg1.field612);
            var8.field7152 = (int) ((float) this.field1174[var7.field7149] * arg1.field642 + (float) this.field1184[var7.field7149] * arg1.field643 + (float) this.field1133[var7.field7149] * arg1.field619 + arg1.field616);
        }
    }

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "()I", line = 362)
    public final int method88() {
        field1081++;
        if (!this.field1101) {
            this.method625((byte) 32);
        }
        return this.field1185;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIII)V", line = 376)
    public final void method70(int arg0, int arg1, int arg2, int arg3) {
        field1115++;
        for (int var5 = 0; var5 < this.field1128; var5++) {
            int var9 = this.field1082[var5] & 0xFFFF;
            int var10 = (var9 & 0xFE39) >> 10;
            int var11 = var9 >> 7 & 0x7;
            if (arg0 != -1) {
                var10 -= -((arg0 - var10) * arg3 >> 7);
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field1082[var5] = (short) class473.method2847(class473.method2847(var10 << 10, var11 << 7), var12);
        }
        if (this.field1112 != null) {
            for (int var6 = 0; var6 < this.field1123; var6++) {
                class609 var7 = this.field1112[var6];
                class35 var8 = this.field1131[var6];
                var8.field414 = var8.field414 & 0xFF000000 | class60.field758[this.field1082[var7.field9029] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1104 != null) {
            this.field1104.field5515 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lm;Lpr;I)V", line = 432)
    public final void method93(class165 arg0, class381 arg1, int arg2) {
        field1163++;
        if (this.field1139 == 0) {
            return;
        }
        class54 var4 = this.field1144.field7875;
        class54 var5 = (class54) arg0;
        if (!this.field1101) {
            this.method625((byte) 32);
        }
        this.method617((byte) -88, var5);
        class336.field4648 = var4.field642 * var5.field643 + var4.field643 * var5.field624 + var4.field619 * var5.field623;
        class66.field810 = var4.field642 * var5.field616 + var4.field643 * var5.field612 + var4.field619 * var5.field629 + var4.field616;
        float var6 = (float) this.field1092 * class336.field4648 + class66.field810;
        float var7 = (float) this.field1185 * class336.field4648 + class66.field810;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var8 = (float) this.field1125 + var6;
            var9 = (float) (-this.field1125) + var7;
        } else {
            var8 = (float) this.field1125 + var7;
            var9 = var6 - (float) this.field1125;
        }
        if ((this.field1144.field7767 <= var9) || ((float) this.field1144.field7829 >= var8)) {
            return;
        }
        class340.field4707 = var4.field622 * var5.field643 + var4.field645 * var5.field623 + var4.field623 * var5.field624;
        class452.field6388 = var4.field622 * var5.field616 + var4.field645 * var5.field629 + var4.field623 * var5.field612 + var4.field629;
        float var10 = (float) this.field1092 * class340.field4707 + class452.field6388;
        float var11 = (float) this.field1185 * class340.field4707 + class452.field6388;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = ((float) this.field1125 + var10) * (float) this.field1144.field7804;
            var13 = ((float) (-this.field1125) + var11) * (float) this.field1144.field7804;
        } else {
            var13 = ((float) (-this.field1125) + var10) * (float) this.field1144.field7804;
            var12 = ((float) this.field1125 + var11) * (float) this.field1144.field7804;
        }
        if ((var13 / var8 >= this.field1144.field7769) || (var12 / var8 <= this.field1144.field7880)) {
            return;
        }
        class519.field7408 = var4.field627 * var5.field616 + var4.field634 * var5.field629 + var4.field624 * var5.field612 + var4.field612;
        class515.field7351 = var4.field627 * var5.field643 + var4.field634 * var5.field623 + var4.field624 * var5.field624;
        float var14 = (float) this.field1092 * class515.field7351 + class519.field7408;
        float var15 = (float) this.field1185 * class515.field7351 + class519.field7408;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = (var15 - (float) this.field1125) * (float) this.field1144.field7864;
            var16 = ((float) this.field1125 + var14) * (float) this.field1144.field7864;
        } else {
            var16 = ((float) this.field1125 + var15) * (float) this.field1144.field7864;
            var17 = ((float) (-this.field1125) + var14) * (float) this.field1144.field7864;
        }
        if ((this.field1144.field7773 <= var17 / var8) || (var16 / var8 <= this.field1144.field7831)) {
            return;
        }
        if (arg1 != null || this.field1112 != null) {
            class627.field9230 = var4.field627 * var5.field642 + var4.field634 * var5.field622 + var4.field624 * var5.field627;
            class301.field4134 = var4.field642 * var5.field619 + var4.field643 * var5.field634 + var4.field619 * var5.field645;
            class84.field1210 = var4.field627 * var5.field619 + var4.field634 * var5.field645 + var4.field624 * var5.field634;
            class623.field9187 = var4.field622 * var5.field642 + var4.field645 * var5.field622 + var4.field623 * var5.field627;
            class205.field3055 = var4.field642 * var5.field642 + var4.field643 * var5.field627 + var4.field619 * var5.field622;
            class289.field4018 = var4.field622 * var5.field619 + var4.field645 * var5.field645 + var4.field623 * var5.field634;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field1189 + this.field1138 >> 1;
            int var21 = this.field1171 + this.field1169 >> 1;
            int var22 = (int) ((float) var21 * class623.field9187 + (float) this.field1092 * class340.field4707 + (float) var20 * class289.field4018 + class452.field6388);
            int var23 = (int) ((float) var21 * class627.field9230 + (float) this.field1092 * class515.field7351 + (float) var20 * class84.field1210 + class519.field7408);
            int var24 = (int) ((float) var21 * class205.field3055 + (float) this.field1092 * class336.field4648 + (float) var20 * class301.field4134 + class66.field810);
            if (var24 < this.field1144.field7829) {
                var18 = true;
            } else {
                arg1.field5243 = this.field1144.field7804 * var22 / var24 + this.field1144.field7876;
                arg1.field5245 = this.field1144.field7864 * var23 / var24 + this.field1144.field7861;
            }
            int var25 = (int) ((float) var21 * class623.field9187 + (float) this.field1185 * class340.field4707 + (float) var20 * class289.field4018 + class452.field6388);
            int var26 = (int) ((float) var21 * class627.field9230 + (float) this.field1185 * class515.field7351 + (float) var20 * class84.field1210 + class519.field7408);
            int var27 = (int) ((float) var21 * class205.field3055 + (float) this.field1185 * class336.field4648 + (float) var20 * class301.field4134 + class66.field810);
            if (var27 >= this.field1144.field7829) {
                arg1.field5242 = this.field1144.field7861 + (this.field1144.field7864 * var26 / var27);
                arg1.field5246 = this.field1144.field7804 * var25 / var27 + this.field1144.field7876;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field1144.field7829 > var24 && this.field1144.field7829 > var27) {
                    var19 = false;
                } else if (var24 < this.field1144.field7829) {
                    int var28 = (var27 - this.field1144.field7829 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field5243 = this.field1144.field7876 + (this.field1144.field7804 * var29 / this.field1144.field7829);
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field5245 = this.field1144.field7864 * var30 / this.field1144.field7829 + this.field1144.field7861;
                } else if (var27 < this.field1144.field7829) {
                    int var31 = (var24 - this.field1144.field7829 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = var23 + ((var23 - var26) * var31 >> 16);
                    arg1.field5243 = this.field1144.field7876 + (this.field1144.field7804 * var32 / this.field1144.field7829);
                    arg1.field5245 = this.field1144.field7864 * var33 / this.field1144.field7829 + this.field1144.field7861;
                }
            }
            if (var19) {
                arg1.field5247 = true;
                if (var27 >= var24) {
                    arg1.field5244 = (this.field1125 + var25) * this.field1144.field7804 / var27 + (this.field1144.field7876 - arg1.field5246);
                } else {
                    arg1.field5244 = (this.field1125 + var22) * this.field1144.field7804 / var24 + this.field1144.field7876 - arg1.field5243;
                }
            }
        }
        this.field1144.method3130(62);
        this.field1144.method3145((byte) 118, var5);
        this.method624((byte) 75);
        this.field1144.method3166(-18072);
        this.method619(-103);
    }

    @OriginalMember(owner = "client!qu", name = "Q", descriptor = "()I", line = 637)
    public final int method81() {
        if (!this.field1101) {
            this.method625((byte) -18);
        }
        field1167++;
        return this.field1171;
    }

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "()V", line = 650)
    public final void method55() {
        field1116++;
        if (this.field1139 <= 0 || this.field1166 <= 0) {
            return;
        }
        this.method627(false, false);
        if ((this.field1090 & 0x10) == 0 && this.field1135.field6996 == null) {
            this.method628(false, 5123);
        }
        this.method631(-126);
    }

    @OriginalMember(owner = "client!qu", name = "V", descriptor = "(III)V", line = 667)
    public final void method76(int arg0, int arg1, int arg2) {
        field1095++;
        for (int var4 = 0; var4 < this.field1103; var4++) {
            if (arg0 != 128) {
                this.field1133[var4] = this.field1133[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field1184[var4] = this.field1184[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field1174[var4] = this.field1174[var4] * arg2 >> 7;
            }
        }
        this.field1101 = false;
        if (this.field1158 != null) {
            this.field1158.field5515 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "BA", descriptor = "(I[IIIIZI[I)V", line = 702)
    public final void method64(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field1165++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            int var12 = arg3 << 4;
            int var13 = 0;
            class253.field3652 = 0;
            class631.field9274 = 0;
            class341.field4712 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field1146.length) {
                    int[] var16 = this.field1146[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field1160 == null || (arg6 & this.field1160[var18]) != 0) {
                            class341.field4712 += this.field1133[var18];
                            class631.field9274 += this.field1184[var18];
                            class253.field3652 += this.field1174[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class341.field4712 = class341.field4712 / var13 + var10;
                class631.field9274 = class631.field9274 / var13 + var12;
                class20.field199 = true;
                class253.field3652 = class253.field3652 / var13 + var11;
            } else {
                class253.field3652 = var11;
                class631.field9274 = var12;
                class341.field4712 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[2] * arg4 + arg7[0] * arg2 + 16384 >> 15;
                int var20 = arg7[3] * arg2 + 16384 - (-(arg7[4] * arg3) + -(arg7[5] * arg4)) >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + (arg7[7] * arg3) + 16384 >> 15;
                arg2 = var19;
                arg4 = var21;
                arg3 = var20;
            }
            int var22 = arg3 << 4;
            int var23 = arg4 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field1146.length > var26) {
                    int[] var27 = this.field1146[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field1160 == null || (arg6 & this.field1160[var29]) != 0) {
                            this.field1133[var29] += var24;
                            this.field1184[var29] += var22;
                            this.field1174[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field1146.length) {
                        int[] var110 = this.field1146[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field1160 == null || (this.field1160[var112] & arg6) != 0) {
                                this.field1133[var112] -= class341.field4712;
                                this.field1184[var112] -= class631.field9274;
                                this.field1174[var112] -= class253.field3652;
                                if (arg4 != 0) {
                                    int var113 = class589.field8742[arg4];
                                    int var114 = class589.field8735[arg4];
                                    int var115 = this.field1184[var112] * var113 + this.field1133[var112] * var114 + 32767 >> 15;
                                    this.field1184[var112] = this.field1184[var112] * var114 + 32767 - (this.field1133[var112] * var113) >> 15;
                                    this.field1133[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class589.field8742[arg2];
                                    int var117 = class589.field8735[arg2];
                                    int var118 = this.field1184[var112] * var117 + 32767 - (this.field1174[var112] * var116) >> 15;
                                    this.field1174[var112] = this.field1184[var112] * var116 + this.field1174[var112] * var117 + 32767 >> 15;
                                    this.field1184[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class589.field8742[arg3];
                                    int var120 = class589.field8735[arg3];
                                    int var121 = this.field1133[var112] * var120 + this.field1174[var112] * var119 + 32767 >> 15;
                                    this.field1174[var112] = this.field1174[var112] * var120 + 32767 - (this.field1133[var112] * var119) >> 15;
                                    this.field1133[var112] = var121;
                                }
                                this.field1133[var112] += class341.field4712;
                                this.field1184[var112] += class631.field9274;
                                this.field1174[var112] += class253.field3652;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field1146.length > var92) {
                            int[] var93 = this.field1146[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field1160 == null || (arg6 & this.field1160[var95]) != 0) {
                                    int var96 = this.field1187[var95];
                                    int var97 = this.field1187[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field1091[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class589.field8742[arg4];
                                            int var101 = class589.field8735[arg4];
                                            int var102 = this.field1107[var99] * var101 + this.field1096[var99] * var100 + 32767 >> 15;
                                            this.field1096[var99] = (short) (this.field1096[var99] * var101 + 32767 - (this.field1107[var99] * var100) >> 15);
                                            this.field1107[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class589.field8742[arg2];
                                            int var104 = class589.field8735[arg2];
                                            int var105 = this.field1096[var99] * var104 + 32767 - (this.field1155[var99] * var103) >> 15;
                                            this.field1155[var99] = (short) (this.field1155[var99] * var104 + this.field1096[var99] * var103 + 32767 >> 15);
                                            this.field1096[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class589.field8742[arg3];
                                            int var107 = class589.field8735[arg3];
                                            int var108 = this.field1155[var99] * var106 + this.field1107[var99] * var107 + 32767 >> 15;
                                            this.field1155[var99] = (short) (this.field1155[var99] * var107 + 32767 - (this.field1107[var99] * var106) >> 15);
                                            this.field1107[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field1085 == null && this.field1104 != null) {
                        this.field1104.field5515 = null;
                    }
                    if (this.field1085 != null) {
                        this.field1085.field5515 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class20.field199) {
                    int var36 = arg7[6] * class253.field3652 + arg7[3] * class631.field9274 + arg7[0] * class341.field4712 + 16384 >> 15;
                    int var37 = arg7[7] * class253.field3652 + arg7[1] * class341.field4712 + arg7[4] * class631.field9274 + 16384 >> 15;
                    int var38 = arg7[8] * class253.field3652 + (arg7[2] * class341.field4712 + (arg7[5] * class631.field9274)) + 16384 >> 15;
                    int var39 = var34 + var37;
                    int var40 = var33 + var36;
                    class341.field4712 = var40;
                    int var41 = var35 + var38;
                    class631.field9274 = var39;
                    class253.field3652 = var41;
                    class20.field199 = false;
                }
                int[] var42 = new int[9];
                int var43 = class589.field8735[arg2];
                int var44 = class589.field8742[arg2];
                int var45 = class589.field8735[arg3];
                int var46 = class589.field8742[arg3];
                int var47 = class589.field8735[arg4];
                int var48 = class589.field8742[arg4];
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[6] = var45 * var50 + -var46 * var47 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[5] = -var44;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                int var51 = var42[1] * -class631.field9274 + var42[0] * -class341.field4712 + (var42[2] * -class253.field3652) + 16384 >> 15;
                int var52 = var42[5] * -class253.field3652 + var42[3] * -class341.field4712 + var42[4] * -class631.field9274 + 16384 >> 15;
                int var53 = var42[8] * -class253.field3652 + var42[7] * -class631.field9274 + var42[6] * -class341.field4712 + 16384 >> 15;
                int var54 = var51 + class341.field4712;
                int var55 = class631.field9274 + var52;
                int var56 = class253.field3652 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 16384 >> 15;
                    }
                }
                int var59 = var42[1] * var34 + (var42[0] * var33 + var42[2] * var35 + 16384) >> 15;
                int var60 = var42[5] * var35 + var42[4] * var34 + var42[3] * var33 + 16384 >> 15;
                int var61 = var54 + var59;
                int var62 = var55 + var60;
                int var63 = var42[6] * var33 + (var42[7] * var34) + var42[8] * var35 + 16384 >> 15;
                int var64 = var56 + var63;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 16384 >> 15;
                    }
                }
                int var67 = arg7[1] * var62 + arg7[0] * var61 + arg7[2] * var64 + 16384 >> 15;
                int var68 = arg7[3] * var61 - (-(arg7[4] * var62) - arg7[5] * var64 - 16384) >> 15;
                int var69 = var30 + var67;
                int var70 = arg7[8] * var64 + arg7[7] * var62 + arg7[6] * var61 + 16384 >> 15;
                int var71 = var31 + var68;
                int var72 = var32 + var70;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field1146.length > var74) {
                        int[] var75 = this.field1146[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field1160 == null || (this.field1160[var77] & arg6) != 0) {
                                int var78 = this.field1133[var77] * var65[0] + this.field1184[var77] * var65[1] + this.field1174[var77] * var65[2] + 16384 >> 15;
                                int var79 = this.field1184[var77] * var65[4] + this.field1133[var77] * var65[3] + this.field1174[var77] * var65[5] + 16384 >> 15;
                                int var80 = var69 + var78;
                                int var81 = this.field1174[var77] * var65[8] + this.field1133[var77] * var65[6] - (-(this.field1184[var77] * var65[7]) - 16384) >> 15;
                                int var82 = var71 + var79;
                                this.field1133[var77] = var80;
                                int var83 = var72 + var81;
                                this.field1184[var77] = var82;
                                this.field1174[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field1146.length) {
                        int[] var174 = this.field1146[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field1160 == null || (this.field1160[var176] & arg6) != 0) {
                                this.field1133[var176] -= class341.field4712;
                                this.field1184[var176] -= class631.field9274;
                                this.field1174[var176] -= class253.field3652;
                                this.field1133[var176] = this.field1133[var176] * arg2 >> 7;
                                this.field1184[var176] = this.field1184[var176] * arg3 >> 7;
                                this.field1174[var176] = this.field1174[var176] * arg4 >> 7;
                                this.field1133[var176] += class341.field4712;
                                this.field1184[var176] += class631.field9274;
                                this.field1174[var176] += class253.field3652;
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
                if (class20.field199) {
                    int var128 = arg7[3] * class631.field9274 + arg7[0] * class341.field4712 + (arg7[6] * class253.field3652) + 16384 >> 15;
                    int var129 = arg7[7] * class253.field3652 + arg7[1] * class341.field4712 + arg7[4] * class631.field9274 + 16384 >> 15;
                    int var130 = arg7[8] * class253.field3652 + arg7[5] * class631.field9274 + arg7[2] * class341.field4712 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    class341.field4712 = var131;
                    class631.field9274 = var132;
                    int var133 = var127 + var130;
                    class253.field3652 = var133;
                    class20.field199 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class341.field4712 * var134 + 16384 >> 15;
                int var138 = -class631.field9274 * var135 + 16384 >> 15;
                int var139 = -class253.field3652 * var136 + 16384 >> 15;
                int var140 = var137 + class341.field4712;
                int var141 = class631.field9274 + var138;
                int var142 = class253.field3652 + var139;
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
                int var152 = arg7[2] * var149 + arg7[0] * var146 + arg7[1] * var147 + 16384 >> 15;
                int var153 = arg7[3] * var146 + arg7[5] * var149 + arg7[4] * var147 + 16384 >> 15;
                int var154 = var123 + var153;
                int var155 = arg7[6] * var146 + (arg7[7] * var147) - (-(arg7[8] * var149) - 16384) >> 15;
                int var156 = var122 + var152;
                int var157 = var124 + var155;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field1146.length) {
                        int[] var160 = this.field1146[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field1160 == null || (arg6 & this.field1160[var162]) != 0) {
                                int var163 = this.field1133[var162] * var150[0] + this.field1184[var162] * var150[1] + this.field1174[var162] * var150[2] + 16384 >> 15;
                                int var164 = this.field1174[var162] * var150[5] + (this.field1133[var162] * var150[3] + (this.field1184[var162] * var150[4])) + 16384 >> 15;
                                int var165 = this.field1184[var162] * var150[7] + this.field1174[var162] * var150[8] + this.field1133[var162] * var150[6] + 16384 >> 15;
                                int var166 = var156 + var163;
                                int var167 = var154 + var164;
                                this.field1133[var162] = var166;
                                int var168 = var157 + var165;
                                this.field1184[var162] = var167;
                                this.field1174[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1088 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field1088.length > var181) {
                        int[] var182 = this.field1088[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field1153 == null || (arg6 & this.field1153[var184]) != 0) {
                                int var185 = (this.field1117[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field1117[var184] = (byte) var185;
                                if (this.field1104 != null) {
                                    this.field1104.field5515 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1112 != null) {
                    for (int var178 = 0; var178 < this.field1123; var178++) {
                        class609 var179 = this.field1112[var178];
                        class35 var180 = this.field1131[var178];
                        var180.field414 = var180.field414 & 0xFFFFFF | 255 - (this.field1117[var179.field9029] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1088 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field1088.length) {
                        int[] var191 = this.field1088[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field1153 == null || (arg6 & this.field1153[var193]) != 0) {
                                int var194 = this.field1082[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFD4F) >> 10;
                                int var196 = (var194 & 0x3E1) >> 7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = var194 & 0x7F;
                                int var199 = arg2 + var195 & 0x3F;
                                int var200 = arg4 + var198;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 7) {
                                    var197 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field1082[var193] = (short) class473.method2847(class473.method2847(var199 << 10, var197 << 7), var200);
                                if (this.field1104 != null) {
                                    this.field1104.field5515 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1112 != null) {
                    for (int var187 = 0; var187 < this.field1123; var187++) {
                        class609 var188 = this.field1112[var187];
                        class35 var189 = this.field1131[var187];
                        var189.field414 = class60.field758[this.field1082[var188.field9029] & 0xFFFF] & 0xFFFFFF | var189.field414 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field1122 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field1122.length) {
                        int[] var203 = this.field1122[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class35 var205 = this.field1131[var203[var204]];
                            var205.field417 += arg2;
                            var205.field415 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1122 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field1122.length) {
                        int[] var208 = this.field1122[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class35 var210 = this.field1131[var208[var209]];
                            var210.field416 = var210.field416 * arg3 >> 7;
                            var210.field413 = var210.field413 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1122 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field1122.length) {
                    int[] var213 = this.field1122[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class35 var215 = this.field1131[var213[var214]];
                        var215.field411 = var215.field411 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "(I)V", line = 1684)
    public final void method75(int arg0) {
        if (this.field1104 != null) {
            this.field1104.field5515 = null;
        }
        this.field1162 = (short) arg0;
        field1145++;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IJFLfd;IIIIIF)S", line = 1698)
    private final short method618(int arg0, long arg1, float arg2, class451 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9) {
        field1097++;
        int var12 = this.field1187[arg7];
        int var13 = this.field1187[arg7 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field1091[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class229.field3357[var15] == arg1) {
                return (short) (var16 - 1);
            }
        }
        this.field1091[var14] = (short) (this.field1139 + 1);
        class229.field3357[var14] = arg1;
        this.field1107[this.field1139] = (short) arg4;
        this.field1096[this.field1139] = (short) arg0;
        this.field1155[this.field1139] = (short) arg8;
        this.field1119[this.field1139] = (byte) arg5;
        this.field1170[this.field1139] = arg9;
        if (arg6 == 32767) {
            this.field1106[this.field1139] = arg2;
            return (short) (this.field1139++);
        } else {
            return 38;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V", line = 1756)
    private final void method619(int arg0) {
        if (this.field1112 != null) {
            class54 var2 = this.field1144.field7740;
            float var3 = this.field1144.method472();
            float var4 = this.field1144.method450();
            this.field1144.method3175((byte) 87);
            this.field1144.method460(false);
            this.field1144.method3184(true, false);
            this.field1144.method3164(this.field1144.field7805, (byte) -55, this.field1144.field7774, null, null);
            for (int var5 = 0; var5 < this.field1123; var5++) {
                class609 var6 = this.field1112[var5];
                class35 var7 = this.field1131[var5];
                if (!var6.field9039 || !this.field1144.method423()) {
                    float var8 = (float) (this.field1133[var6.field9036] + this.field1133[var6.field9027] + this.field1133[var6.field9030]) * 0.3333333F;
                    float var9 = (float) (this.field1184[var6.field9030] + this.field1184[var6.field9027] + this.field1184[var6.field9036]) * 0.3333333F;
                    float var10 = (float) (this.field1174[var6.field9036] + this.field1174[var6.field9030] + this.field1174[var6.field9027]) * 0.3333333F;
                    float var11 = class623.field9187 * var10 + class340.field4707 * var9 + class289.field4018 * var8 + class452.field6388;
                    float var12 = class627.field9230 * var10 + class84.field1210 * var8 + class515.field7351 * var9 + class519.field7408;
                    float var13 = class205.field3055 * var10 + class336.field4648 * var9 + class301.field4134 * var8 + class66.field810;
                    var2.method348((float) var7.field417 + var11, true, -var13, var6.field9038 * var7.field413 >> 7, var6.field9031 * var7.field416 >> 7, var7.field411, (float) var7.field415 - var12);
                    this.field1144.method3140(var2, (byte) 91);
                    this.field1144.method422(var4, var3 - (float) var6.field9032 * 1.5F);
                    int var14 = var7.field414;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field1144.method3123(var6.field9026, false);
                    this.field1144.method3105(var6.field9028, 2);
                    this.field1144.method3121(-27745, var6.field9035);
                    this.field1144.method3151(7, 0, 53, 4);
                }
            }
            this.field1144.method422(var4, var3);
            this.field1144.method460(true);
            this.field1144.method3166(-18072);
        }
        field1188++;
        if (arg0 > -80) {
            this.method64(-51, null, -49, 111, -85, true, 104, null);
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V", line = 1822)
    public final void method77(int arg0) {
        field1136++;
        int var2 = class589.field8742[arg0];
        int var3 = class589.field8735[arg0];
        for (int var4 = 0; var4 < this.field1103; var4++) {
            int var5 = this.field1184[var4] * var2 + (this.field1133[var4] * var3) >> 15;
            this.field1184[var4] = this.field1184[var4] * var3 - (this.field1133[var4] * var2) >> 15;
            this.field1133[var4] = var5;
        }
        this.field1101 = false;
        if (this.field1158 != null) {
            this.field1158.field5515 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)V", line = 1852)
    public static final void method620(int arg0, int arg1, int arg2) {
        field1089++;
        if (class438.field5847 != arg2) {
            class200.field2965 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class200.field2965[var3] = (var3 << 12) / arg2;
            }
            class410.field5604 = arg2 - 1;
            class433.field5803 = arg2 * 32;
            class438.field5847 = arg2;
        }
        if (arg1 != 1647477356 || class14.field148 == arg0) {
            return;
        }
        if (class438.field5847 == arg0) {
            class309.field4265 = class200.field2965;
        } else {
            class309.field4265 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class309.field4265[var4] = (var4 << 12) / arg0;
            }
        }
        class285.field3989 = arg0 - 1;
        class14.field148 = arg0;
    }

    @OriginalMember(owner = "client!qu", name = "ea", descriptor = "(I[IIIIIZ)V", line = 1900)
    public final void method96(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1190++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            class253.field3652 = 0;
            int var12 = 0;
            class341.field4712 = 0;
            class631.field9274 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field1146.length > var14) {
                    int[] var15 = this.field1146[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class341.field4712 += this.field1133[var17];
                        class631.field9274 += this.field1184[var17];
                        var12++;
                        class253.field3652 += this.field1174[var17];
                    }
                }
            }
            if (var12 > 0) {
                class631.field9274 = class631.field9274 / var12 + var10;
                class341.field4712 = class341.field4712 / var12 + var11;
                class253.field3652 = class253.field3652 / var12 + var9;
            } else {
                class631.field9274 = var10;
                class341.field4712 = var11;
                class253.field3652 = var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field1146.length > var22) {
                    int[] var23 = this.field1146[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field1133[var25] += var20;
                        this.field1184[var25] += var18;
                        this.field1174[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field1146.length) {
                    int[] var46 = this.field1146[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field1133[var59] -= class341.field4712;
                            this.field1184[var59] -= class631.field9274;
                            this.field1174[var59] -= class253.field3652;
                            if (arg4 != 0) {
                                int var60 = class589.field8742[arg4];
                                int var61 = class589.field8735[arg4];
                                int var62 = this.field1184[var59] * var60 + this.field1133[var59] * var61 + 32767 >> 15;
                                this.field1184[var59] = this.field1184[var59] * var61 + 32767 - (this.field1133[var59] * var60) >> 15;
                                this.field1133[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class589.field8742[arg2];
                                int var64 = class589.field8735[arg2];
                                int var65 = this.field1184[var59] * var64 + 32767 - (this.field1174[var59] * var63) >> 15;
                                this.field1174[var59] = this.field1184[var59] * var63 + (this.field1174[var59] * var64) + 32767 >> 15;
                                this.field1184[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class589.field8742[arg3];
                                int var67 = class589.field8735[arg3];
                                int var68 = this.field1174[var59] * var66 + this.field1133[var59] * var67 + 32767 >> 15;
                                this.field1174[var59] = this.field1174[var59] * var67 + 32767 - (this.field1133[var59] * var66) >> 15;
                                this.field1133[var59] = var68;
                            }
                            this.field1133[var59] += class341.field4712;
                            this.field1184[var59] += class631.field9274;
                            this.field1174[var59] += class253.field3652;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field1133[var48] -= class341.field4712;
                            this.field1184[var48] -= class631.field9274;
                            this.field1174[var48] -= class253.field3652;
                            if (arg2 != 0) {
                                int var49 = class589.field8742[arg2];
                                int var50 = class589.field8735[arg2];
                                int var51 = this.field1184[var48] * var50 + 32767 - (this.field1174[var48] * var49) >> 15;
                                this.field1174[var48] = this.field1184[var48] * var49 + (this.field1174[var48] * var50) + 32767 >> 15;
                                this.field1184[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class589.field8742[arg4];
                                int var53 = class589.field8735[arg4];
                                int var54 = this.field1184[var48] * var52 + (this.field1133[var48] * var53) + 32767 >> 15;
                                this.field1184[var48] = this.field1184[var48] * var53 - (this.field1133[var48] * var52 - 32767) >> 15;
                                this.field1133[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class589.field8742[arg3];
                                int var56 = class589.field8735[arg3];
                                int var57 = this.field1133[var48] * var56 + this.field1174[var48] * var55 + 32767 >> 15;
                                this.field1174[var48] = this.field1174[var48] * var56 + 32767 - (this.field1133[var48] * var55) >> 15;
                                this.field1133[var48] = var57;
                            }
                            this.field1133[var48] += class341.field4712;
                            this.field1184[var48] += class631.field9274;
                            this.field1174[var48] += class253.field3652;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field1146.length > var28) {
                        int[] var29 = this.field1146[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field1187[var31];
                            int var33 = this.field1187[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field1091[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class589.field8742[arg4];
                                    int var37 = class589.field8735[arg4];
                                    int var38 = this.field1107[var35] * var37 + (this.field1096[var35] * var36 + 32767) >> 15;
                                    this.field1096[var35] = (short) (this.field1096[var35] * var37 + (32767 - (this.field1107[var35] * var36)) >> 15);
                                    this.field1107[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class589.field8742[arg2];
                                    int var40 = class589.field8735[arg2];
                                    int var41 = this.field1096[var35] * var40 + 32767 - (this.field1155[var35] * var39) >> 15;
                                    this.field1155[var35] = (short) (this.field1096[var35] * var39 + (this.field1155[var35] * var40 + 32767) >> 15);
                                    this.field1096[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class589.field8742[arg3];
                                    int var43 = class589.field8735[arg3];
                                    int var44 = this.field1155[var35] * var42 + this.field1107[var35] * var43 + 32767 >> 15;
                                    this.field1155[var35] = (short) (this.field1155[var35] * var43 + 32767 - (this.field1107[var35] * var42) >> 15);
                                    this.field1107[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field1085 == null && this.field1104 != null) {
                    this.field1104.field5515 = null;
                }
                if (this.field1085 != null) {
                    this.field1085.field5515 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field1146.length) {
                    int[] var71 = this.field1146[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field1133[var73] -= class341.field4712;
                        this.field1184[var73] -= class631.field9274;
                        this.field1174[var73] -= class253.field3652;
                        this.field1133[var73] = this.field1133[var73] * arg2 >> 7;
                        this.field1184[var73] = this.field1184[var73] * arg3 >> 7;
                        this.field1174[var73] = this.field1174[var73] * arg4 >> 7;
                        this.field1133[var73] += class341.field4712;
                        this.field1184[var73] += class631.field9274;
                        this.field1174[var73] += class253.field3652;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1088 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field1088.length > var78) {
                        int[] var79 = this.field1088[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field1117[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field1117[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field1104 != null) {
                            this.field1104.field5515 = null;
                        }
                    }
                }
                if (this.field1112 != null) {
                    for (int var75 = 0; var75 < this.field1123; var75++) {
                        class609 var76 = this.field1112[var75];
                        class35 var77 = this.field1131[var75];
                        var77.field414 = 255 - (this.field1117[var76.field9029] & 0xFF) << 24 | var77.field414 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1088 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field1088.length) {
                        int[] var88 = this.field1088[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field1082[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFFD0) >> 10;
                            int var93 = (var91 & 0x38B) >> 7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = arg2 + var92 & 0x3F;
                            int var96 = var91 & 0x7F;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 7) {
                                var94 = 7;
                            }
                            int var97 = arg4 + var96;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field1082[var90] = (short) class473.method2847(class473.method2847(var94 << 7, var95 << 10), var97);
                        }
                        if (var88.length > 0 && this.field1104 != null) {
                            this.field1104.field5515 = null;
                        }
                    }
                }
                if (this.field1112 != null) {
                    for (int var84 = 0; var84 < this.field1123; var84++) {
                        class609 var85 = this.field1112[var84];
                        class35 var86 = this.field1131[var84];
                        var86.field414 = var86.field414 & 0xFF000000 | class60.field758[this.field1082[var85.field9029] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field1122 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field1122.length) {
                        int[] var100 = this.field1122[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class35 var102 = this.field1131[var100[var101]];
                            var102.field417 += arg2;
                            var102.field415 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1122 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field1122.length) {
                        int[] var105 = this.field1122[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class35 var107 = this.field1131[var105[var106]];
                            var107.field413 = var107.field413 * arg2 >> 7;
                            var107.field416 = var107.field416 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1122 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field1122.length) {
                    int[] var110 = this.field1122[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class35 var112 = this.field1131[var110[var111]];
                        var112.field411 = var112.field411 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "U", descriptor = "()I", line = 2560)
    public final int method68() {
        if (!this.field1101) {
            this.method625((byte) -117);
        }
        field1114++;
        return this.field1169;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IILm;Z)Z", line = 2572)
    public final boolean method72(int arg0, int arg1, class165 arg2, boolean arg3) {
        field1100++;
        class54 var5 = (class54) arg2;
        class54 var6 = this.field1144.field7875;
        float var7 = var5.field616 * var6.field622 + var5.field629 * var6.field645 + var5.field612 * var6.field623 + var6.field629;
        float var8 = var5.field616 * var6.field627 + var5.field629 * var6.field634 + var5.field612 * var6.field624 + var6.field612;
        class289.field4018 = var5.field619 * var6.field622 + var5.field645 * var6.field645 + var5.field634 * var6.field623;
        class205.field3055 = var5.field642 * var6.field642 + var5.field627 * var6.field643 + var5.field622 * var6.field619;
        class623.field9187 = var5.field642 * var6.field622 + var5.field627 * var6.field623 + var5.field622 * var6.field645;
        class515.field7351 = var5.field643 * var6.field627 + var5.field624 * var6.field624 + var5.field623 * var6.field634;
        class340.field4707 = var5.field643 * var6.field622 + var5.field624 * var6.field623 + var5.field623 * var6.field645;
        float var9 = var5.field616 * var6.field642 + var5.field629 * var6.field619 + var5.field612 * var6.field643 + var6.field616;
        class301.field4134 = var5.field619 * var6.field642 + var5.field645 * var6.field619 + var5.field634 * var6.field643;
        class84.field1210 = var5.field619 * var6.field627 + var5.field645 * var6.field634 + var5.field634 * var6.field624;
        class627.field9230 = var5.field642 * var6.field627 + var5.field627 * var6.field624 + var5.field622 * var6.field634;
        class336.field4648 = var5.field643 * var6.field642 + var5.field624 * var6.field643 + var5.field623 * var6.field619;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field1144.field7804;
        int var16 = this.field1144.field7864;
        if (!this.field1101) {
            this.method625((byte) -112);
        }
        class311.field4289[0] = this.field1189;
        class84.field1211[0] = this.field1092;
        class311.field4289[1] = this.field1138;
        class643.field9371[0] = this.field1171;
        class84.field1211[1] = this.field1092;
        class311.field4289[2] = this.field1189;
        class643.field9371[1] = this.field1171;
        class84.field1211[2] = this.field1185;
        class643.field9371[2] = this.field1171;
        class311.field4289[3] = this.field1138;
        class84.field1211[3] = this.field1185;
        class311.field4289[4] = this.field1189;
        class643.field9371[3] = this.field1171;
        class84.field1211[4] = this.field1092;
        class643.field9371[4] = this.field1169;
        class311.field4289[5] = this.field1138;
        class84.field1211[5] = this.field1092;
        class311.field4289[6] = this.field1189;
        class643.field9371[5] = this.field1169;
        class84.field1211[6] = this.field1185;
        class311.field4289[7] = this.field1138;
        class643.field9371[6] = this.field1169;
        class84.field1211[7] = this.field1185;
        class643.field9371[7] = this.field1169;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class311.field4289[var17];
            float var39 = (float) class643.field9371[var17];
            float var40 = (float) class84.field1211[var17];
            float var41 = class623.field9187 * var39 + class340.field4707 * var40 + class289.field4018 * var38 + var7;
            float var42 = class627.field9230 * var39 + class84.field1210 * var38 + class515.field7351 * var40 + var8;
            float var43 = class205.field3055 * var39 + class336.field4648 * var40 + class301.field4134 * var38 + var9;
            if (var43 >= (float) this.field1144.field7829) {
                float var44 = (float) var15 * var41 / var43 + (float) this.field1144.field7876;
                float var45 = (float) var16 * var42 / var43 + (float) this.field1144.field7861;
                if (var12 < var44) {
                    var12 = var44;
                }
                if (var44 < var11) {
                    var11 = var44;
                }
                if (var45 > var14) {
                    var14 = var45;
                }
                if (var45 < var13) {
                    var13 = var45;
                }
                var10 = true;
            }
        }
        if (var10 && var11 < (float) arg0 && (float) arg0 < var12 && (float) arg1 > var13 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field1144.field7887.length < this.field1139) {
                this.field1144.field7887 = new int[this.field1139];
                this.field1144.field7890 = new int[this.field1139];
            }
            int[] var18 = this.field1144.field7887;
            int[] var19 = this.field1144.field7890;
            for (int var20 = 0; var20 < this.field1103; var20++) {
                float var22 = (float) this.field1133[var20];
                float var23 = (float) this.field1184[var20];
                float var24 = (float) this.field1174[var20];
                float var25 = class627.field9230 * var24 + class84.field1210 * var22 + class515.field7351 * var23 + var8;
                float var26 = class623.field9187 * var24 + class340.field4707 * var23 + class289.field4018 * var22 + var7;
                float var27 = class205.field3055 * var24 + class336.field4648 * var23 + class301.field4134 * var22 + var9;
                if (((float) this.field1144.field7829 <= var27)) {
                    int var32 = (int) ((float) var15 * var26 / var27 + (float) this.field1144.field7876);
                    int var33 = (int) ((float) var16 * var25 / var27 + (float) this.field1144.field7861);
                    int var34 = this.field1187[var20];
                    int var35 = this.field1187[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field1091[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[var37] = var32;
                        var19[var37] = var33;
                    }
                } else {
                    int var28 = this.field1187[var20];
                    int var29 = this.field1187[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field1091[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        var18[this.field1091[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field1128; var21++) {
                if (var18[this.field1140[var21]] != -999999 && var18[this.field1181[var21]] != -999999 && var18[this.field1179[var21]] != -999999 && this.method621(var18[this.field1179[var21]], arg1, var19[this.field1179[var21]], var19[this.field1181[var21]], var19[this.field1140[var21]], var18[this.field1140[var21]], arg0, 0, var18[this.field1181[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qu", name = "sa", descriptor = "()Z", line = 2788)
    public final boolean method71() {
        field1161++;
        if (this.field1146 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field1175; var1++) {
            this.field1133[var1] <<= 0x4;
            this.field1184[var1] <<= 0x4;
            this.field1174[var1] <<= 0x4;
        }
        class341.field4712 = 0;
        class253.field3652 = 0;
        class631.field9274 = 0;
        return true;
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lte;)V", line = 5902)
    public class82(class527 arg0) {
        this.field1144 = arg0;
        this.field1158 = new class403(null, 5126, 3, 0);
        this.field1109 = new class403(null, 5126, 2, 0);
        this.field1085 = new class403(null, 5126, 3, 0);
        this.field1104 = new class403(null, 5121, 4, 0);
        this.field1135 = new class491();
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lte;Lfd;IIII)V", line = 5914)
    public class82(class527 arg0, class451 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1182 = arg5;
        this.field1144 = arg0;
        this.field1156 = arg2;
        if (class243.method1543(arg5, arg2, (byte) 101)) {
            this.field1158 = new class403(null, 5126, 3, 0);
        }
        if (class591.method3508(arg2, arg5, 84)) {
            this.field1109 = new class403(null, 5126, 2, 0);
        }
        if (class358.method2157(arg5, 122, arg2)) {
            this.field1085 = new class403(null, 5126, 3, 0);
        }
        if (class68.method538(arg5, -84, arg2)) {
            this.field1104 = new class403(null, 5121, 4, 0);
        }
        if (class599.method3540(0, arg5, arg2)) {
            this.field1135 = new class491();
        }
        class17 var7 = arg0.field3092;
        int[] var8 = new int[arg1.field6371];
        this.field1187 = new int[arg1.field6367 + 1];
        for (int var9 = 0; var9 < arg1.field6371; var9++) {
            if ((arg1.field6332 == null || arg1.field6332[var9] != 2) && (arg1.field6346 == null || arg1.field6346[var9] == -1 || !var7.method110(arg1.field6346[var9] & 0xFFFF, (byte) 102).field6640)) {
                var8[this.field1128++] = var9;
                this.field1187[arg1.field6334[var9]]++;
                this.field1187[arg1.field6359[var9]]++;
                this.field1187[arg1.field6375[var9]]++;
            }
        }
        this.field1166 = this.field1128;
        long[] var10 = new long[this.field1128];
        boolean var11 = (this.field1156 & 0x100) != 0;
        label501: for (int var12 = 0; var12 < this.field1128; var12++) {
            int var180 = var8[var12];
            class471 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field6363 != null) {
                for (int var186 = 0; var186 < arg1.field6363.length; var186++) {
                    class55 var187 = arg1.field6363[var186];
                    if (var187.field646 == var180) {
                        class151 var188 = class36.method221(var187.field647, (byte) -83);
                        if (var188.field2289) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field1166--;
                            continue label501;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field6346 != null) {
                var189 = arg1.field6346[var180];
                if (var189 != -1) {
                    var181 = var7.method110(var189 & 0xFFFF, (byte) 100);
                    var185 = var181.field6649;
                    var184 = var181.field6646;
                }
            }
            boolean var190 = arg1.field6329 != null && arg1.field6329[var180] != 0 || var181 != null && !var181.field6658 | var181.field6645;
            if ((var11 || var190) && arg1.field6355 != null) {
                var182 += arg1.field6355[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = ((var189 & 0xFFFF) << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + ((long) var194);
        }
        class509.method3030(var8, 5675, var10);
        this.field1160 = arg1.field6348;
        this.field1184 = arg1.field6368;
        this.field1174 = arg1.field6350;
        this.field1103 = arg1.field6367;
        this.field1133 = arg1.field6383;
        this.field1175 = arg1.field6351;
        class196[] var13 = new class196[this.field1103];
        this.field1164 = arg1.field6382;
        this.field1083 = arg1.field6352;
        if (arg1.field6363 != null) {
            this.field1123 = arg1.field6363.length;
            this.field1112 = new class609[this.field1123];
            this.field1131 = new class35[this.field1123];
            for (int var14 = 0; var14 < this.field1123; var14++) {
                class55 var15 = arg1.field6363[var14];
                class151 var16 = class36.method221(var15.field647, (byte) -83);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field1128; var18++) {
                    if (var8[var18] == var15.field646) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class60.field758[arg1.field6362[var15.field646] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field6329 == null ? 0 : arg1.field6329[var15.field646]) << 24;
                this.field1112[var14] = new class609(var17, arg1.field6334[var15.field646], arg1.field6359[var15.field646], arg1.field6375[var15.field646], var16.field2292, var16.field2296, var16.field2300, var16.field2288, var16.field2295, var16.field2289, var16.field2293, var15.field651);
                this.field1131[var14] = new class35(var20);
            }
        }
        int var21 = this.field1128 * 3;
        this.field1162 = (short) arg3;
        class229.field3357 = new long[var21];
        this.field1155 = new short[var21];
        this.field1124 = (short) arg4;
        this.field1082 = new short[this.field1128];
        this.field1084 = new short[this.field1128];
        this.field1106 = new float[var21];
        this.field1170 = new float[var21];
        this.field1181 = new short[this.field1128];
        this.field1140 = new short[this.field1128];
        this.field1096 = new short[var21];
        this.field1091 = new short[var21];
        this.field1117 = new byte[this.field1128];
        this.field1107 = new short[var21];
        this.field1179 = new short[this.field1128];
        this.field1119 = new byte[var21];
        if (arg1.field6338 != null) {
            this.field1153 = new short[this.field1128];
        }
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field6367; var23++) {
            int var179 = this.field1187[var23];
            this.field1187[var23] = var22;
            var13[var23] = new class196();
            var22 += var179;
        }
        this.field1187[arg1.field6367] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field6360 != null) {
            int var28 = arg1.field6335;
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
            var27 = new float[var28][];
            for (int var36 = 0; var36 < this.field1128; var36++) {
                int var43 = var8[var36];
                if (arg1.field6360[var43] != -1) {
                    int var44 = arg1.field6360[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field6334[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field6359[var43];
                        } else {
                            var46 = arg1.field6375[var43];
                        }
                        int var47 = arg1.field6383[var46];
                        int var48 = arg1.field6368[var46];
                        int var49 = arg1.field6350[var46];
                        if (var29[var44] > var47) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
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
            var26 = new int[var28];
            var24 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field6373[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field6336[var37];
                        if (var42 == 0) {
                            var40 = 1.0F;
                            var41 = 1.0F;
                        } else if (var42 > 0) {
                            var41 = 1.0F;
                            var40 = (float) var42 / 1024.0F;
                        } else {
                            var40 = 1.0F;
                            var41 = (float) (-var42) / 1024.0F;
                        }
                        var39 = 64.0F / (float) arg1.field6370[var37];
                    } else if (var38 == 2) {
                        var40 = 64.0F / (float) arg1.field6357[var37];
                        var39 = 64.0F / (float) arg1.field6370[var37];
                        var41 = 64.0F / (float) arg1.field6336[var37];
                    } else {
                        var39 = (float) arg1.field6370[var37] / 1024.0F;
                        var40 = (float) arg1.field6357[var37] / 1024.0F;
                        var41 = (float) arg1.field6336[var37] / 1024.0F;
                    }
                    var27[var37] = class6.method14(arg1.field6347[var37], arg1.field6341[var37], class37.method245(255, arg1.field6376[var37]), (byte) 70, var41, arg1.field6349[var37], var40, var39);
                }
            }
        }
        class531[] var50 = new class531[arg1.field6371];
        for (int var51 = 0; var51 < arg1.field6371; var51++) {
            short var158 = arg1.field6334[var51];
            short var159 = arg1.field6359[var51];
            short var160 = arg1.field6375[var51];
            int var161 = this.field1133[var159] - this.field1133[var158];
            int var162 = this.field1184[var159] - this.field1184[var158];
            int var163 = this.field1174[var159] - this.field1174[var158];
            int var164 = this.field1133[var160] - this.field1133[var158];
            int var165 = this.field1184[var160] - this.field1184[var158];
            int var166 = this.field1174[var160] - this.field1174[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - var161 * var166;
            int var169;
            for (var169 = var161 * var165 - (var162 * var164); var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192; var169 >>= 0x1) {
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + (var167 * var167 + (var168 * var168))));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var169 * 256 / var170;
            byte var174 = arg1.field6332 == null ? 0 : arg1.field6332[var51];
            if (var174 == 0) {
                class196 var176 = var13[var158];
                var176.field2895 += var173;
                var176.field2899 += var172;
                var176.field2894 += var171;
                var176.field2900++;
                class196 var177 = var13[var159];
                var177.field2900++;
                var177.field2899 += var172;
                var177.field2894 += var171;
                var177.field2895 += var173;
                class196 var178 = var13[var160];
                var178.field2899 += var172;
                var178.field2900++;
                var178.field2895 += var173;
                var178.field2894 += var171;
            } else if (var174 == 1) {
                class531 var175 = var50[var51] = new class531();
                var175.field7928 = var171;
                var175.field7925 = var173;
                var175.field7927 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field1128; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field6362[var68] & 0xFFFF;
            short var70;
            if (arg1.field6346 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field6346[var68];
            }
            int var71;
            if (arg1.field6360 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field6360[var68];
            }
            int var72;
            if (arg1.field6329 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field6329[var68] & 0xFF;
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
                    var73 = 0.0F;
                    var79 = 1;
                    var76 = 1.0F;
                    var78 = 0.0F;
                    var77 = 0.0F;
                    var80 = 2;
                    var75 = 1.0F;
                    var74 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field6373[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field6334[var68];
                        short var112 = arg1.field6359[var68];
                        short var113 = arg1.field6375[var68];
                        short var114 = arg1.field6349[var71];
                        short var115 = arg1.field6347[var71];
                        short var116 = arg1.field6341[var71];
                        float var117 = (float) arg1.field6383[var114];
                        float var118 = (float) arg1.field6368[var114];
                        float var119 = (float) arg1.field6350[var114];
                        float var120 = (float) arg1.field6383[var115] - var117;
                        float var121 = (float) arg1.field6368[var115] - var118;
                        float var122 = (float) arg1.field6350[var115] - var119;
                        float var123 = (float) arg1.field6383[var116] - var117;
                        float var124 = (float) arg1.field6368[var116] - var118;
                        float var125 = (float) arg1.field6350[var116] - var119;
                        float var126 = (float) arg1.field6383[var111] - var117;
                        float var127 = (float) arg1.field6368[var111] - var118;
                        float var128 = (float) arg1.field6350[var111] - var119;
                        float var129 = (float) arg1.field6383[var112] - var117;
                        float var130 = (float) arg1.field6368[var112] - var118;
                        float var131 = (float) arg1.field6350[var112] - var119;
                        float var132 = (float) arg1.field6383[var113] - var117;
                        float var133 = (float) arg1.field6368[var113] - var118;
                        float var134 = (float) arg1.field6350[var113] - var119;
                        float var135 = var121 * var125 - var122 * var124;
                        float var136 = var122 * var123 - var120 * var125;
                        float var137 = var120 * var124 - (var121 * var123);
                        float var138 = var124 * var137 - var125 * var136;
                        float var139 = var125 * var135 - var123 * var137;
                        float var140 = var123 * var136 - var124 * var135;
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        float var142 = var122 * var135 - var120 * var137;
                        float var143 = var121 * var137 - (var122 * var136);
                        float var144 = var120 * var136 - var121 * var135;
                        float var145 = 1.0F / (var125 * var144 + var123 * var143 + var124 * var142);
                        var74 = (var128 * var144 + var126 * var143 + var127 * var142) * var145;
                        var76 = (var131 * var144 + var129 * var143 + var130 * var142) * var145;
                        var78 = (var134 * var144 + var132 * var143 + var133 * var142) * var145;
                    } else {
                        short var83 = arg1.field6334[var68];
                        short var84 = arg1.field6359[var68];
                        short var85 = arg1.field6375[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field6377[var71];
                        float var91 = (float) arg1.field6345[var71] / 256.0F;
                        if (var82 == 1) {
                            float var92 = (float) arg1.field6357[var71] / 1024.0F;
                            class429.method2515((byte) 104, var86, var88, arg1.field6350[var83], var89, var92, var91, var90, arg1.field6368[var83], var87, arg1.field6383[var83]);
                            var74 = class239.field3447;
                            var73 = class359.field4883;
                            class429.method2515((byte) 79, var86, var88, arg1.field6350[var84], var89, var92, var91, var90, arg1.field6368[var84], var87, arg1.field6383[var84]);
                            var76 = class239.field3447;
                            var75 = class359.field4883;
                            class429.method2515((byte) 87, var86, var88, arg1.field6350[var85], var89, var92, var91, var90, arg1.field6368[var85], var87, arg1.field6383[var85]);
                            var78 = class239.field3447;
                            var77 = class359.field4883;
                            float var93 = var92 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if (var77 - var73 > var93) {
                                    var80 = 1;
                                    var77 -= var92;
                                } else if (var93 < var73 - var77) {
                                    var77 += var92;
                                    var80 = 2;
                                }
                                if ((var93 < var75 - var73)) {
                                    var75 -= var92;
                                    var79 = 1;
                                } else if (var73 - var75 > var93) {
                                    var79 = 2;
                                    var75 += var92;
                                }
                            } else {
                                if (var93 < var78 - var74) {
                                    var80 = 1;
                                    var78 -= var92;
                                } else if (var93 < var74 - var78) {
                                    var80 = 2;
                                    var78 += var92;
                                }
                                if (var76 - var74 > var93) {
                                    var79 = 1;
                                    var76 -= var92;
                                } else if (var93 < var74 - var76) {
                                    var79 = 2;
                                    var76 += var92;
                                }
                            }
                        } else if (var82 == 2) {
                            float var94 = (float) arg1.field6331[var71] / 256.0F;
                            float var95 = (float) arg1.field6340[var71] / 256.0F;
                            int var96 = arg1.field6383[var84] - arg1.field6383[var83];
                            int var97 = arg1.field6368[var84] - arg1.field6368[var83];
                            int var98 = arg1.field6350[var84] - arg1.field6350[var83];
                            int var99 = arg1.field6383[var85] - arg1.field6383[var83];
                            int var100 = arg1.field6368[var85] - arg1.field6368[var83];
                            int var101 = arg1.field6350[var85] - arg1.field6350[var83];
                            int var102 = var97 * var101 - (var98 * var100);
                            int var103 = var98 * var99 - var96 * var101;
                            int var104 = var96 * var100 - (var97 * var99);
                            float var105 = 64.0F / (float) arg1.field6336[var71];
                            float var106 = 64.0F / (float) arg1.field6370[var71];
                            float var107 = 64.0F / (float) arg1.field6357[var71];
                            float var108 = (var89[2] * (float) var104 + var89[0] * (float) var102 + var89[1] * (float) var103) / var105;
                            float var109 = (var89[5] * (float) var104 + var89[3] * (float) var102 + var89[4] * (float) var103) / var106;
                            float var110 = (var89[8] * (float) var104 + var89[6] * (float) var102 + var89[7] * (float) var103) / var107;
                            var81 = class451.method2737(var110, var108, true, var109);
                            class568.method3391(var91, var94, var88, -117, arg1.field6383[var83], arg1.field6368[var83], var86, var95, var89, var87, var90, arg1.field6350[var83], var81);
                            var73 = class55.field648;
                            var74 = class520.field7416;
                            class568.method3391(var91, var94, var88, -116, arg1.field6383[var84], arg1.field6368[var84], var86, var95, var89, var87, var90, arg1.field6350[var84], var81);
                            var75 = class55.field648;
                            var76 = class520.field7416;
                            class568.method3391(var91, var94, var88, -112, arg1.field6383[var85], arg1.field6368[var85], var86, var95, var89, var87, var90, arg1.field6350[var85], var81);
                            var78 = class520.field7416;
                            var77 = class55.field648;
                        } else if (var82 == 3) {
                            class27.method175(arg1.field6383[var83], var89, -2, var86, var90, arg1.field6368[var83], var91, arg1.field6350[var83], var88, var87);
                            var74 = class635.field9296;
                            var73 = class505.field7144;
                            class27.method175(arg1.field6383[var84], var89, -2, var86, var90, arg1.field6368[var84], var91, arg1.field6350[var84], var88, var87);
                            var75 = class505.field7144;
                            var76 = class635.field9296;
                            class27.method175(arg1.field6383[var85], var89, -2, var86, var90, arg1.field6368[var85], var91, arg1.field6350[var85], var88, var87);
                            var78 = class635.field9296;
                            var77 = class505.field7144;
                            if ((var90 & 0x1) == 0) {
                                if ((var75 - var73 > 0.5F)) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                                if (var77 - var73 > 0.5F) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
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
            if (arg1.field6332 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field6332[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) (var71 << 2);
                short var152 = arg1.field6334[var68];
                short var153 = arg1.field6359[var68];
                short var154 = arg1.field6375[var68];
                class196 var155 = var13[var152];
                this.field1140[var52] = this.method618(var155.field2899, var150, var74, arg1, var155.field2894, var155.field2900, 32767, var152, var155.field2895, var73);
                class196 var156 = var13[var153];
                this.field1181[var52] = this.method618(var156.field2899, (long) var79 + var150, var76, arg1, var156.field2894, var156.field2900, 32767, var153, var156.field2895, var75);
                class196 var157 = var13[var154];
                this.field1179[var52] = this.method618(var157.field2899, (long) var80 + var150, var78, arg1, var157.field2894, var157.field2900, 32767, var154, var157.field2895, var77);
            } else if (var146 == 1) {
                class531 var147 = var50[var68];
                long var148 = (long) ((var147.field7927 + 256 << 12) + (var147.field7925 + 256 << 22) + ((var71 << 2) - -(var147.field7928 > 0 ? 1024 : 2048))) + ((long) (var81 << 24) + (long) var72 + (long) (var69 << 8) << 32);
                this.field1140[var52] = this.method618(var147.field7927, var148, var74, arg1, var147.field7928, 0, 32767, arg1.field6334[var68], var147.field7925, var73);
                this.field1181[var52] = this.method618(var147.field7927, (long) var79 + var148, var76, arg1, var147.field7928, 0, 32767, arg1.field6359[var68], var147.field7925, var75);
                this.field1179[var52] = this.method618(var147.field7927, (long) var80 + var148, var78, arg1, var147.field7928, 0, 32767, arg1.field6375[var68], var147.field7925, var77);
            }
            if (arg1.field6346 == null) {
                this.field1084[var52] = -1;
            } else {
                this.field1084[var52] = arg1.field6346[var68];
            }
            if (arg1.field6329 != null) {
                this.field1117[var52] = arg1.field6329[var68];
            }
            if (arg1.field6338 != null) {
                this.field1153[var52] = arg1.field6338[var68];
            }
            this.field1082[var52] = arg1.field6362[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field1166; var55++) {
            short var67 = this.field1084[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field1178 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field1166; var58++) {
            short var66 = this.field1084[var58];
            if (var57 != var66) {
                var57 = var66;
                this.field1178[var56++] = var58;
            }
        }
        this.field1178[var56] = this.field1166;
        class229.field3357 = null;
        this.field1107 = class345.method2106(this.field1107, this.field1139, 0);
        this.field1096 = class345.method2106(this.field1096, this.field1139, 0);
        this.field1155 = class345.method2106(this.field1155, this.field1139, 0);
        this.field1119 = class636.method3693(this.field1119, 0, this.field1139);
        this.field1170 = class342.method2096(this.field1139, this.field1170, -121);
        this.field1106 = class342.method2096(this.field1139, this.field1106, 57);
        if (arg1.field6337 != null && class212.method1396(arg2, -105, this.field1182)) {
            this.field1146 = arg1.method2729(true, false);
        }
        if (arg1.field6363 != null && class552.method3341(true, this.field1182, arg2)) {
            this.field1122 = arg1.method2731(-1);
        }
        if (arg1.field6333 != null && class306.method1869(arg2, this.field1182, 124)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field1128; var61++) {
                int var65 = arg1.field6333[var8[var61]];
                if (var65 >= 0) {
                    if (var59 < var65) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field1088 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field1088[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field1128; var63++) {
                int var64 = arg1.field6333[var8[var63]];
                if (var64 >= 0) {
                    this.field1088[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "ba", descriptor = "()I", line = 2823)
    public final int method90() {
        field1176++;
        return this.field1156;
    }

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "(IIII)V", line = 2833)
    public final void method56(int arg0, int arg1, int arg2, int arg3) {
        field1093++;
        if (arg0 == 0) {
            int var5 = 0;
            class341.field4712 = 0;
            class631.field9274 = 0;
            class253.field3652 = 0;
            for (int var6 = 0; var6 < this.field1103; var6++) {
                class341.field4712 += this.field1133[var6];
                class631.field9274 += this.field1184[var6];
                var5++;
                class253.field3652 += this.field1174[var6];
            }
            if (var5 <= 0) {
                class253.field3652 = arg3;
                class341.field4712 = arg1;
                class631.field9274 = arg2;
            } else {
                class631.field9274 = class631.field9274 / var5 + arg2;
                class341.field4712 = class341.field4712 / var5 + arg1;
                class253.field3652 = class253.field3652 / var5 + arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1103; var7++) {
                this.field1133[var7] += arg1;
                this.field1184[var7] += arg2;
                this.field1174[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1103; var8++) {
                this.field1133[var8] -= class341.field4712;
                this.field1184[var8] -= class631.field9274;
                this.field1174[var8] -= class253.field3652;
                if (arg3 != 0) {
                    int var9 = class589.field8742[arg3];
                    int var10 = class589.field8735[arg3];
                    int var11 = this.field1184[var8] * var9 + this.field1133[var8] * var10 + 32767 >> 15;
                    this.field1184[var8] = this.field1184[var8] * var10 + 32767 - (this.field1133[var8] * var9) >> 15;
                    this.field1133[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class589.field8742[arg1];
                    int var13 = class589.field8735[arg1];
                    int var14 = this.field1184[var8] * var13 + 32767 - this.field1174[var8] * var12 >> 15;
                    this.field1174[var8] = this.field1184[var8] * var12 + this.field1174[var8] * var13 + 32767 >> 15;
                    this.field1184[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class589.field8742[arg2];
                    int var16 = class589.field8735[arg2];
                    int var17 = this.field1174[var8] * var15 + this.field1133[var8] * var16 + 32767 >> 15;
                    this.field1174[var8] = this.field1174[var8] * var16 + 32767 - (this.field1133[var8] * var15) >> 15;
                    this.field1133[var8] = var17;
                }
                this.field1133[var8] += class341.field4712;
                this.field1184[var8] += class631.field9274;
                this.field1174[var8] += class253.field3652;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1103; var18++) {
                this.field1133[var18] -= class341.field4712;
                this.field1184[var18] -= class631.field9274;
                this.field1174[var18] -= class253.field3652;
                this.field1133[var18] = this.field1133[var18] * arg1 / 128;
                this.field1184[var18] = this.field1184[var18] * arg2 / 128;
                this.field1174[var18] = this.field1174[var18] * arg3 / 128;
                this.field1133[var18] += class341.field4712;
                this.field1184[var18] += class631.field9274;
                this.field1174[var18] += class253.field3652;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1128; var19++) {
                int var23 = (this.field1117[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field1117[var19] = (byte) var23;
            }
            if (this.field1104 != null) {
                this.field1104.field5515 = null;
            }
            if (this.field1112 != null) {
                for (int var20 = 0; var20 < this.field1123; var20++) {
                    class609 var21 = this.field1112[var20];
                    class35 var22 = this.field1131[var20];
                    var22.field414 = var22.field414 & 0xFFFFFF | 255 - (this.field1117[var21.field9029] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field1128; var24++) {
                int var28 = this.field1082[var24] & 0xFFFF;
                int var29 = (var28 & 0xFE72) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg1 + var29 & 0x3F;
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
                this.field1082[var24] = (short) class473.method2847(class473.method2847(var31 << 10, var33 << 7), var34);
            }
            if (this.field1104 != null) {
                this.field1104.field5515 = null;
            }
            if (this.field1112 != null) {
                for (int var25 = 0; var25 < this.field1123; var25++) {
                    class609 var26 = this.field1112[var25];
                    class35 var27 = this.field1131[var25];
                    var27.field414 = class60.field758[this.field1082[var26.field9029] & 0xFFFF] & 0xFFFFFF | var27.field414 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field1123; var35++) {
                class35 var36 = this.field1131[var35];
                var36.field417 += arg1;
                var36.field415 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field1123; var37++) {
                class35 var38 = this.field1131[var37];
                var38.field413 = var38.field413 * arg1 >> 7;
                var38.field416 = var38.field416 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field1123; var39++) {
                class35 var40 = this.field1131[var39];
                var40.field411 = var40.field411 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "MA", descriptor = "()V", line = 3138)
    public final void method91() {
        field1192++;
        for (int var1 = 0; var1 < this.field1175; var1++) {
            this.field1133[var1] = this.field1133[var1] + 7 >> 4;
            this.field1184[var1] = this.field1184[var1] + 7 >> 4;
            this.field1174[var1] = this.field1174[var1] + 7 >> 4;
        }
        if (this.field1158 != null) {
            this.field1158.field5515 = null;
        }
        this.field1101 = false;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIIIII)Z", line = 3160)
    private final boolean method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1086++;
        if (arg1 < arg4 && arg1 < arg3 && arg1 < arg2) {
            return false;
        } else if (arg4 < arg1 && arg3 < arg1 && arg2 < arg1) {
            return false;
        } else {
            if (arg7 != 0) {
                this.method77(-9);
            }
            if (arg6 < arg5 && arg8 > arg6 && arg0 > arg6) {
                return false;
            } else {
                return arg5 >= arg6 || arg8 >= arg6 || arg6 <= arg0;
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BII)Z", line = 3186)
    public static final boolean method622(byte arg0, int arg1, int arg2) {
        if (arg0 <= 83) {
            return true;
        } else {
            field1099++;
            return (arg2 & 0x21) != 0;
        }
    }

    @OriginalMember(owner = "client!qu", name = "OA", descriptor = "(I)V", line = 3198)
    public final void method61(int arg0) {
        field1152++;
        int var2 = class589.field8742[arg0];
        int var3 = class589.field8735[arg0];
        for (int var4 = 0; var4 < this.field1103; var4++) {
            int var5 = this.field1174[var4] * var2 + (this.field1133[var4] * var3) >> 15;
            this.field1174[var4] = this.field1174[var4] * var3 - (this.field1133[var4] * var2) >> 15;
            this.field1133[var4] = var5;
        }
        if (this.field1158 != null) {
            this.field1158.field5515 = null;
        }
        this.field1101 = false;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "()Z", line = 3228)
    public final boolean method54() {
        field1137++;
        if (this.field1084 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field1084.length; var1++) {
            if (this.field1084[var1] != -1 && !this.field1144.field3092.method109(this.field1084[var1], 1680)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lqu;Lqu;ZZIB)Lr;", line = 3253)
    private final class159 method623(class82 arg0, class82 arg1, boolean arg2, boolean arg3, int arg4, byte arg5) {
        field1132++;
        arg0.field1162 = this.field1162;
        if (arg5 <= 79) {
            this.field1092 = -5;
        }
        arg0.field1090 = 0;
        arg0.field1156 = arg4;
        arg0.field1128 = this.field1128;
        arg0.field1103 = this.field1103;
        arg0.field1175 = this.field1175;
        arg0.field1182 = this.field1182;
        arg0.field1139 = this.field1139;
        arg0.field1123 = this.field1123;
        arg0.field1124 = this.field1124;
        arg0.field1166 = this.field1166;
        boolean var7 = method622((byte) 107, this.field1182, arg4);
        boolean var8 = class573.method3412(this.field1182, (byte) -54, arg4);
        boolean var9 = class90.method670((byte) 61, arg4, this.field1182);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg0.field1133 = this.field1133;
            } else if (arg1.field1133 == null || this.field1175 > arg1.field1133.length) {
                arg0.field1133 = arg1.field1133 = new int[this.field1175];
            } else {
                arg0.field1133 = arg1.field1133;
            }
            if (!var8) {
                arg0.field1184 = this.field1184;
            } else if (arg1.field1184 == null || this.field1175 > arg1.field1184.length) {
                arg0.field1184 = arg1.field1184 = new int[this.field1175];
            } else {
                arg0.field1184 = arg1.field1184;
            }
            if (!var9) {
                arg0.field1174 = this.field1174;
            } else if (arg1.field1174 == null || arg1.field1174.length < this.field1175) {
                arg0.field1174 = arg1.field1174 = new int[this.field1175];
            } else {
                arg0.field1174 = arg1.field1174;
            }
            for (int var11 = 0; var11 < this.field1175; var11++) {
                if (var7) {
                    arg0.field1133[var11] = this.field1133[var11];
                }
                if (var8) {
                    arg0.field1184[var11] = this.field1184[var11];
                }
                if (var9) {
                    arg0.field1174[var11] = this.field1174[var11];
                }
            }
        } else {
            arg0.field1174 = this.field1174;
            arg0.field1133 = this.field1133;
            arg0.field1184 = this.field1184;
        }
        if (class47.method294(this.field1182, arg4, 1119090531)) {
            arg0.field1158 = arg1.field1158;
            if (arg3) {
                arg0.field1090 = (byte) (arg0.field1090 | 0x1);
            }
            arg0.field1158.field5511 = this.field1158.field5511;
            arg0.field1158.field5515 = this.field1158.field5515;
        } else if (class243.method1543(this.field1182, arg4, (byte) 101)) {
            arg0.field1158 = this.field1158;
        } else {
            arg0.field1158 = null;
        }
        if (class162.method1157(this.field1182, arg4, 119)) {
            if (arg1.field1082 == null || this.field1128 > arg1.field1082.length) {
                arg0.field1082 = arg1.field1082 = new short[this.field1128];
            } else {
                arg0.field1082 = arg1.field1082;
            }
            for (int var12 = 0; var12 < this.field1128; var12++) {
                arg0.field1082[var12] = this.field1082[var12];
            }
        } else {
            arg0.field1082 = this.field1082;
        }
        if (class460.method2786(-128, this.field1182, arg4)) {
            if (arg1.field1117 == null || this.field1128 > arg1.field1117.length) {
                arg0.field1117 = arg1.field1117 = new byte[this.field1128];
            } else {
                arg0.field1117 = arg1.field1117;
            }
            for (int var13 = 0; var13 < this.field1128; var13++) {
                arg0.field1117[var13] = this.field1117[var13];
            }
        } else {
            arg0.field1117 = this.field1117;
        }
        if (class444.method2666(-13624, arg4, this.field1182)) {
            arg0.field1104 = arg1.field1104;
            if (arg3) {
                arg0.field1090 = (byte) (arg0.field1090 | 0x2);
            }
            arg0.field1104.field5511 = this.field1104.field5511;
            arg0.field1104.field5515 = this.field1104.field5515;
        } else if (class68.method538(this.field1182, -110, arg4)) {
            arg0.field1104 = this.field1104;
        } else {
            arg0.field1104 = null;
        }
        if (class560.method3375(this.field1182, (byte) -122, arg4)) {
            if (arg1.field1107 == null || arg1.field1107.length < this.field1139) {
                int var14 = this.field1139;
                arg0.field1096 = arg1.field1096 = new short[var14];
                arg0.field1155 = arg1.field1155 = new short[var14];
                arg0.field1107 = arg1.field1107 = new short[var14];
            } else {
                arg0.field1107 = arg1.field1107;
                arg0.field1155 = arg1.field1155;
                arg0.field1096 = arg1.field1096;
            }
            if (this.field1111 == null) {
                for (int var18 = 0; var18 < this.field1139; var18++) {
                    arg0.field1107[var18] = this.field1107[var18];
                    arg0.field1096[var18] = this.field1096[var18];
                    arg0.field1155[var18] = this.field1155[var18];
                }
            } else {
                if (arg1.field1111 == null) {
                    arg1.field1111 = new class184();
                }
                class184 var15 = arg0.field1111 = arg1.field1111;
                if (var15.field2767 == null || var15.field2767.length < this.field1139) {
                    int var16 = this.field1139;
                    var15.field2762 = new byte[var16];
                    var15.field2767 = new short[var16];
                    var15.field2764 = new short[var16];
                    var15.field2768 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field1139; var17++) {
                    arg0.field1107[var17] = this.field1107[var17];
                    arg0.field1096[var17] = this.field1096[var17];
                    arg0.field1155[var17] = this.field1155[var17];
                    var15.field2767[var17] = this.field1111.field2767[var17];
                    var15.field2764[var17] = this.field1111.field2764[var17];
                    var15.field2768[var17] = this.field1111.field2768[var17];
                    var15.field2762[var17] = this.field1111.field2762[var17];
                }
            }
            arg0.field1119 = this.field1119;
        } else {
            arg0.field1119 = this.field1119;
            arg0.field1107 = this.field1107;
            arg0.field1155 = this.field1155;
            arg0.field1111 = this.field1111;
            arg0.field1096 = this.field1096;
        }
        if (class464.method2796(arg4, (byte) -60, this.field1182)) {
            if (arg3) {
                arg0.field1090 = (byte) (arg0.field1090 | 0x4);
            }
            arg0.field1085 = arg1.field1085;
            arg0.field1085.field5515 = this.field1085.field5515;
            arg0.field1085.field5511 = this.field1085.field5511;
        } else if (class358.method2157(this.field1182, 119, arg4)) {
            arg0.field1085 = this.field1085;
        } else {
            arg0.field1085 = null;
        }
        if (class194.method1312(arg4, 9, this.field1182)) {
            if (arg1.field1170 == null || this.field1128 > arg1.field1170.length) {
                int var19 = this.field1139;
                arg0.field1106 = arg1.field1106 = new float[var19];
                arg0.field1170 = arg1.field1170 = new float[var19];
            } else {
                arg0.field1170 = arg1.field1170;
                arg0.field1106 = arg1.field1106;
            }
            for (int var20 = 0; var20 < this.field1139; var20++) {
                arg0.field1170[var20] = this.field1170[var20];
                arg0.field1106[var20] = this.field1106[var20];
            }
        } else {
            arg0.field1106 = this.field1106;
            arg0.field1170 = this.field1170;
        }
        if (class142.method974((byte) 108, this.field1182, arg4)) {
            if (arg3) {
                arg0.field1090 = (byte) (arg0.field1090 | 0x8);
            }
            arg0.field1109 = arg1.field1109;
            arg0.field1109.field5511 = this.field1109.field5511;
            arg0.field1109.field5515 = this.field1109.field5515;
        } else if (class591.method3508(arg4, this.field1182, -118)) {
            arg0.field1109 = this.field1109;
        } else {
            arg0.field1109 = null;
        }
        if (class397.method2358(this.field1182, 8468, arg4)) {
            if (arg1.field1140 == null || arg1.field1140.length < this.field1128) {
                int var21 = this.field1128;
                arg0.field1140 = arg1.field1140 = new short[var21];
                arg0.field1179 = arg1.field1179 = new short[var21];
                arg0.field1181 = arg1.field1181 = new short[var21];
            } else {
                arg0.field1179 = arg1.field1179;
                arg0.field1181 = arg1.field1181;
                arg0.field1140 = arg1.field1140;
            }
            for (int var22 = 0; var22 < this.field1128; var22++) {
                arg0.field1140[var22] = this.field1140[var22];
                arg0.field1181[var22] = this.field1181[var22];
                arg0.field1179[var22] = this.field1179[var22];
            }
        } else {
            arg0.field1181 = this.field1181;
            arg0.field1140 = this.field1140;
            arg0.field1179 = this.field1179;
        }
        if (class583.method3477(-14993, this.field1182, arg4)) {
            if (arg3) {
                arg0.field1090 = (byte) (arg0.field1090 | 0x10);
            }
            arg0.field1135 = arg1.field1135;
            arg0.field1135.field6996 = this.field1135.field6996;
        } else if (class599.method3540(0, this.field1182, arg4)) {
            arg0.field1135 = this.field1135;
        } else {
            arg0.field1135 = null;
        }
        if (class187.method1291(this.field1182, 32768, arg4)) {
            if (arg1.field1084 == null || this.field1128 > arg1.field1084.length) {
                int var23 = this.field1128;
                arg0.field1084 = arg1.field1084 = new short[var23];
            } else {
                arg0.field1084 = arg1.field1084;
            }
            for (int var24 = 0; var24 < this.field1128; var24++) {
                arg0.field1084[var24] = this.field1084[var24];
            }
        } else {
            arg0.field1084 = this.field1084;
        }
        if (!class354.method2139((byte) -125, this.field1182, arg4)) {
            arg0.field1131 = this.field1131;
        } else if (arg1.field1131 == null || this.field1123 > arg1.field1131.length) {
            int var26 = this.field1123;
            arg0.field1131 = arg1.field1131 = new class35[var26];
            for (int var27 = 0; var27 < this.field1123; var27++) {
                arg0.field1131[var27] = this.field1131[var27].method219(0);
            }
        } else {
            arg0.field1131 = arg1.field1131;
            for (int var25 = 0; var25 < this.field1123; var25++) {
                arg0.field1131[var25].method218(this.field1131[var25], false);
            }
        }
        arg0.field1088 = this.field1088;
        arg0.field1122 = this.field1122;
        arg0.field1153 = this.field1153;
        arg0.field1112 = this.field1112;
        if (this.field1101) {
            arg0.field1189 = this.field1189;
            arg0.field1125 = this.field1125;
            arg0.field1138 = this.field1138;
            arg0.field1101 = true;
            arg0.field1169 = this.field1169;
            arg0.field1185 = this.field1185;
            arg0.field1171 = this.field1171;
            arg0.field1092 = this.field1092;
        } else {
            arg0.field1101 = false;
        }
        arg0.field1091 = this.field1091;
        arg0.field1178 = this.field1178;
        arg0.field1083 = this.field1083;
        arg0.field1146 = this.field1146;
        arg0.field1164 = this.field1164;
        arg0.field1160 = this.field1160;
        arg0.field1187 = this.field1187;
        return arg0;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V", line = 3715)
    private final void method624(byte arg0) {
        field1149++;
        if (this.field1166 == 0) {
            return;
        }
        if (arg0 <= 28) {
            this.method73();
        }
        if (this.field1090 != 0) {
            this.method627(false, true);
        }
        this.method627(false, false);
        if (this.field1135 != null) {
            if (this.field1135.field6996 == null) {
                this.method628((this.field1090 & 0x10) != 0, 5123);
            }
            if (this.field1135.field6996 != null) {
                this.field1144.method3184(true, this.field1085 != null);
                this.field1144.method3164(this.field1109, (byte) -113, this.field1158, this.field1085, this.field1104);
                int var2 = this.field1178.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field1178[var3];
                    int var5 = this.field1178[var3 + 1];
                    int var6 = this.field1084[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field1144.method3146((byte) 46, var6, this.field1085 != null);
                    this.field1144.method3170(var4 * 3, 68, 4, (var5 - var4) * 3, this.field1135.field6996);
                }
            }
        }
        this.method631(-15);
    }

    @OriginalMember(owner = "client!qu", name = "wa", descriptor = "()I", line = 3773)
    public final int method85() {
        field1120++;
        if (!this.field1101) {
            this.method625((byte) 29);
        }
        return this.field1189;
    }

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "()I", line = 3785)
    public final int method62() {
        field1150++;
        if (!this.field1101) {
            this.method625((byte) -125);
        }
        return this.field1125;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lr;IIIZ)V", line = 3797)
    public final void method78(class159 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1126++;
        class82 var6 = (class82) arg0;
        if (this.field1128 == 0 || var6.field1128 == 0) {
            return;
        }
        int var7 = var6.field1103;
        int[] var8 = var6.field1133;
        int[] var9 = var6.field1184;
        int[] var10 = var6.field1174;
        short[] var11 = var6.field1107;
        short[] var12 = var6.field1096;
        short[] var13 = var6.field1155;
        byte[] var14 = var6.field1119;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field1111 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var16 = this.field1111.field2767;
            var18 = this.field1111.field2768;
            var15 = this.field1111.field2764;
            var17 = this.field1111.field2762;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field1111 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var20 = var6.field1111.field2768;
            var19 = var6.field1111.field2764;
            var21 = var6.field1111.field2762;
            var22 = var6.field1111.field2767;
        }
        int[] var23 = var6.field1187;
        short[] var24 = var6.field1091;
        if (!var6.field1101) {
            var6.method625((byte) 7);
        }
        short var25 = var6.field1092;
        short var26 = var6.field1185;
        short var27 = var6.field1189;
        short var28 = var6.field1138;
        short var29 = var6.field1171;
        short var30 = var6.field1169;
        for (int var31 = 0; var31 < this.field1103; var31++) {
            int var32 = this.field1184[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field1133[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field1174[var31] - arg3;
                    if (var29 <= var34 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field1187[var31];
                        int var37 = this.field1187[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1091[var38] - 1;
                            if (var35 == -1 || this.field1119[var35] != 0) {
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
                                            this.field1111 = new class184();
                                            var16 = this.field1111.field2767 = class479.method2885(this.field1107, 120);
                                            var15 = this.field1111.field2764 = class479.method2885(this.field1096, 65);
                                            var18 = this.field1111.field2768 = class479.method2885(this.field1155, 64);
                                            var17 = this.field1111.field2762 = class601.method3552(-6300, this.field1119);
                                        }
                                        if (var22 == null) {
                                            class184 var44 = var6.field1111 = new class184();
                                            var22 = var44.field2767 = class479.method2885(var11, 107);
                                            var19 = var44.field2764 = class479.method2885(var12, 115);
                                            var20 = var44.field2768 = class479.method2885(var13, 66);
                                            var21 = var44.field2762 = class601.method3552(-6300, var14);
                                        }
                                        short var45 = this.field1107[var35];
                                        short var46 = this.field1096[var35];
                                        short var47 = this.field1155[var35];
                                        byte var48 = this.field1119[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var22[var52] += var45;
                                                var19[var52] += var46;
                                                var20[var52] += var47;
                                                var21[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        int var54 = this.field1187[var31];
                                        short var55 = var12[var40];
                                        int var56 = this.field1187[var31 + 1];
                                        short var57 = var13[var40];
                                        byte var58 = var14[var40];
                                        for (int var59 = var54; var59 < var56; var59++) {
                                            int var60 = this.field1091[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var16[var60] += var53;
                                                var15[var60] += var55;
                                                var18[var60] += var57;
                                                var17[var60] += var58;
                                            }
                                        }
                                        if (this.field1085 == null && this.field1104 != null) {
                                            this.field1104.field5515 = null;
                                        }
                                        if (this.field1085 != null) {
                                            this.field1085.field5515 = null;
                                        }
                                        if (var6.field1085 == null && var6.field1104 != null) {
                                            var6.field1104.field5515 = null;
                                        }
                                        if (var6.field1085 != null) {
                                            var6.field1085.field5515 = null;
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

    @OriginalMember(owner = "client!qu", name = "M", descriptor = "()I", line = 4066)
    public final int method73() {
        field1102++;
        return this.field1162;
    }

    @OriginalMember(owner = "client!qu", name = "L", descriptor = "(SS)V", line = 4085)
    public final void method80(short arg0, short arg1) {
        field1159++;
        class17 var3 = this.field1144.field3092;
        for (int var4 = 0; var4 < this.field1128; var4++) {
            if (this.field1084[var4] == arg0) {
                this.field1084[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class471 var7 = var3.method110(arg0 & 0xFFFF, (byte) 117);
            var6 = var7.field6657;
            var5 = var7.field6660;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class471 var10 = var3.method110(arg1 & 0xFFFF, (byte) 100);
            var9 = var10.field6657;
            var8 = var10.field6660;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field1112 != null) {
            for (int var11 = 0; var11 < this.field1123; var11++) {
                class609 var12 = this.field1112[var11];
                class35 var13 = this.field1131[var11];
                var13.field414 = var13.field414 & 0xFF000000 | class60.field758[this.field1082[var12.field9029] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1104 != null) {
            this.field1104.field5515 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)V", line = 4167)
    private final void method625(byte arg0) {
        int var2 = 39 % ((-arg0 - 69) / 42);
        field1121++;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = 32767;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = -32768;
        int var9 = 0;
        int var10 = 0;
        for (int var11 = 0; var11 < this.field1103; var11++) {
            int var12 = this.field1133[var11];
            int var13 = this.field1184[var11];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            int var14 = this.field1174[var11];
            if (var8 < var14) {
                var8 = var14;
            }
            if (var14 < var5) {
                var5 = var14;
            }
            int var15 = var12 * var12 + var14 * var14;
            if (var9 < var15) {
                var9 = var15;
            }
            int var16 = var14 * var14 + (var12 * var12 + (var13 * var13));
            if (var16 > var10) {
                var10 = var16;
            }
        }
        this.field1189 = (short) var3;
        this.field1169 = (short) var8;
        this.field1171 = (short) var5;
        this.field1138 = (short) var6;
        this.field1092 = (short) var4;
        this.field1185 = (short) var7;
        this.field1125 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        Math.sqrt((double) var10);
        this.field1101 = true;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "()[Lia;", line = 4259)
    public final class506[] method57() {
        field1173++;
        return this.field1083;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "()[Llh;", line = 4273)
    public final class450[] method60() {
        field1172++;
        return this.field1164;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lm;Lpr;II)V", line = 4284)
    public final void method74(class165 arg0, class381 arg1, int arg2, int arg3) {
        field1094++;
        if (this.field1139 == 0) {
            return;
        }
        class54 var5 = this.field1144.field7875;
        if (!this.field1101) {
            this.method625((byte) -18);
        }
        class54 var6 = (class54) arg0;
        class66.field810 = var5.field642 * var6.field616 + var5.field643 * var6.field612 + var5.field619 * var6.field629 + var5.field616;
        class336.field4648 = var5.field642 * var6.field643 + var5.field643 * var6.field624 + var5.field619 * var6.field623;
        float var7 = (float) this.field1092 * class336.field4648 + class66.field810;
        float var8 = (float) this.field1185 * class336.field4648 + class66.field810;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var10 = (float) (-this.field1125) + var8;
            var9 = (float) this.field1125 + var7;
        } else {
            var9 = (float) this.field1125 + var8;
            var10 = var7 - (float) this.field1125;
        }
        if ((var10 >= this.field1144.field7781) || ((float) this.field1144.field7829 >= var9)) {
            return;
        }
        class452.field6388 = var5.field622 * var6.field616 + var5.field645 * var6.field629 + var5.field623 * var6.field612 + var5.field629;
        class340.field4707 = var5.field622 * var6.field643 + var5.field645 * var6.field623 + var5.field623 * var6.field624;
        float var11 = (float) this.field1092 * class340.field4707 + class452.field6388;
        float var12 = (float) this.field1185 * class340.field4707 + class452.field6388;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = ((float) (-this.field1125) + var12) * (float) this.field1144.field7804;
            var14 = ((float) this.field1125 + var11) * (float) this.field1144.field7804;
        } else {
            var14 = ((float) this.field1125 + var12) * (float) this.field1144.field7804;
            var13 = ((float) (-this.field1125) + var11) * (float) this.field1144.field7804;
        }
        if ((var13 / (float) arg2 >= this.field1144.field7769) || (var14 / (float) arg2 <= this.field1144.field7880)) {
            return;
        }
        class515.field7351 = var5.field627 * var6.field643 + var5.field634 * var6.field623 + var5.field624 * var6.field624;
        class519.field7408 = var5.field627 * var6.field616 + var5.field634 * var6.field629 + var5.field624 * var6.field612 + var5.field612;
        float var15 = (float) this.field1092 * class515.field7351 + class519.field7408;
        float var16 = (float) this.field1185 * class515.field7351 + class519.field7408;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var18 = ((float) this.field1125 + var15) * (float) this.field1144.field7864;
            var17 = (var16 - (float) this.field1125) * (float) this.field1144.field7864;
        } else {
            var17 = ((float) (-this.field1125) + var15) * (float) this.field1144.field7864;
            var18 = ((float) this.field1125 + var16) * (float) this.field1144.field7864;
        }
        if ((this.field1144.field7773 <= var17 / (float) arg2) || (var18 / (float) arg2 <= this.field1144.field7831)) {
            return;
        }
        if (arg1 != null || this.field1112 != null) {
            class301.field4134 = var5.field642 * var6.field619 + var5.field643 * var6.field634 + var5.field619 * var6.field645;
            class289.field4018 = var5.field622 * var6.field619 + var5.field645 * var6.field645 + var5.field623 * var6.field634;
            class627.field9230 = var5.field627 * var6.field642 + var5.field634 * var6.field622 + var5.field624 * var6.field627;
            class623.field9187 = var5.field622 * var6.field642 + var5.field645 * var6.field622 + var5.field623 * var6.field627;
            class205.field3055 = var5.field642 * var6.field642 + var5.field643 * var6.field627 + var5.field619 * var6.field622;
            class84.field1210 = var5.field627 * var6.field619 + var5.field634 * var6.field645 + var5.field624 * var6.field634;
        }
        if (arg1 != null) {
            int var19 = this.field1189 + this.field1138 >> 1;
            int var20 = this.field1171 + this.field1169 >> 1;
            int var21 = (int) ((float) var20 * class623.field9187 + (float) this.field1092 * class340.field4707 + (float) var19 * class289.field4018 + class452.field6388);
            int var22 = (int) ((float) var20 * class627.field9230 + (float) this.field1092 * class515.field7351 + (float) var19 * class84.field1210 + class519.field7408);
            int var23 = (int) ((float) var20 * class205.field3055 + (float) this.field1092 * class336.field4648 + (float) var19 * class301.field4134 + class66.field810);
            int var24 = (int) ((float) var20 * class623.field9187 + (float) this.field1185 * class340.field4707 + (float) var19 * class289.field4018 + class452.field6388);
            int var25 = (int) ((float) var20 * class627.field9230 + (float) this.field1185 * class515.field7351 + (float) var19 * class84.field1210 + class519.field7408);
            arg1.field5243 = this.field1144.field7804 * var21 / arg2 + this.field1144.field7876;
            arg1.field5245 = this.field1144.field7864 * var22 / arg2 + this.field1144.field7861;
            arg1.field5246 = this.field1144.field7804 * var24 / arg2 + this.field1144.field7876;
            int var26 = (int) ((float) var20 * class205.field3055 + (float) this.field1185 * class336.field4648 + (float) var19 * class301.field4134 + class66.field810);
            arg1.field5242 = this.field1144.field7864 * var25 / arg2 + this.field1144.field7861;
            if (this.field1144.field7829 > var23 && var26 < this.field1144.field7829) {
                arg1.field5244 = (this.field1125 + var21) * this.field1144.field7804 / arg2 + this.field1144.field7876 - arg1.field5243;
                arg1.field5247 = true;
            }
        }
        this.field1144.method3135(29573, (float) arg2);
        this.field1144.method3163(-23);
        this.field1144.method3145((byte) 107, var6);
        this.method624((byte) 89);
        this.field1144.method3166(-18072);
        this.method619(-103);
    }

    @OriginalMember(owner = "client!qu", name = "pa", descriptor = "(SS)V", line = 4431)
    public final void method95(short arg0, short arg1) {
        field1177++;
        for (int var3 = 0; var3 < this.field1128; var3++) {
            if (this.field1082[var3] == arg0) {
                this.field1082[var3] = arg1;
            }
        }
        if (this.field1112 != null) {
            for (int var4 = 0; var4 < this.field1123; var4++) {
                class609 var5 = this.field1112[var4];
                class35 var6 = this.field1131[var4];
                var6.field414 = var6.field414 & 0xFF000000 | class60.field758[this.field1082[var5.field9029] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1104 != null) {
            this.field1104.field5515 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(SIBII)I", line = 4472)
    private final int method626(short arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1183++;
        int var6 = class60.field758[class513.method3046(arg3, true, arg4)];
        if (~arg0 != arg1) {
            class471 var7 = this.field1144.field3092.method110(arg0 & 0xFFFF, (byte) 115);
            int var8 = var7.field6660 & 0xFF;
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
            int var12 = var7.field6657 & 0xFF;
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
                var6 = (var15 >> 8) + ((var13 & 0x7700FF00) << 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg2 & 0xFF);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BIZ)Lr;", line = 4542)
    public final class159 method94(byte arg0, int arg1, boolean arg2) {
        field1148++;
        class82 var4;
        class82 var5;
        if (arg0 == 1) {
            var4 = this.field1144.field7848;
            var5 = this.field1144.field7820;
        } else if (arg0 == 2) {
            var4 = this.field1144.field7878;
            var5 = this.field1144.field7794;
        } else if (arg0 == 3) {
            var5 = this.field1144.field7811;
            var4 = this.field1144.field7879;
        } else if (arg0 == 4) {
            var4 = this.field1144.field7803;
            var5 = this.field1144.field7787;
        } else if (arg0 == 5) {
            var5 = this.field1144.field7834;
            var4 = this.field1144.field7860;
        } else {
            var4 = var5 = new class82(this.field1144);
        }
        return this.method623(var4, var5, arg2, arg0 != 0, arg1, (byte) 106);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZZ)V", line = 4593)
    private final void method627(boolean arg0, boolean arg1) {
        field1087++;
        boolean var3 = this.field1104 != null && this.field1104.field5515 == null;
        boolean var4 = this.field1085 != null && this.field1085.field5515 == null;
        boolean var5 = this.field1158 != null && this.field1158.field5515 == null;
        boolean var6 = this.field1109 != null && this.field1109.field5515 == null;
        if (arg1) {
            var5 &= (this.field1090 & 0x1) != 0;
            var4 &= (this.field1090 & 0x4) != 0;
            var3 &= (this.field1090 & 0x2) != 0;
            var6 &= (this.field1090 & 0x8) != 0;
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
        if (this.field1144.field7836.field2146.length < (this.field1139 * var7)) {
            this.field1144.field7836 = new class247((this.field1139 + 100) * var7);
        } else {
            this.field1144.field7836.field2177 = 0;
        }
        class247 var12 = this.field1144.field7836;
        if (arg0) {
            return;
        }
        if (var5) {
            if (this.field1144.field7842) {
                for (int var13 = 0; var13 < this.field1103; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field1133[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field1184[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field1174[var13]);
                    int var17 = this.field1187[var13];
                    int var18 = this.field1187[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field1091[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field2177 = var7 * var20;
                        var12.method1058(602643080, var14);
                        var12.method1058(602643080, var15);
                        var12.method1058(602643080, var16);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1103; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field1133[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field1184[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field1174[var21]);
                    int var25 = this.field1187[var21];
                    int var26 = this.field1187[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field1091[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field2177 = var7 * var28;
                        var12.method1064(-17430, var22);
                        var12.method1064(-17430, var23);
                        var12.method1064(-17430, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field1085 == null) {
                byte[] var31;
                short[] var32;
                short[] var33;
                short[] var34;
                if (this.field1111 == null) {
                    var31 = this.field1119;
                    var32 = this.field1096;
                    var33 = this.field1155;
                    var34 = this.field1107;
                } else {
                    var32 = this.field1111.field2764;
                    var31 = this.field1111.field2762;
                    var34 = this.field1111.field2767;
                    var33 = this.field1111.field2768;
                }
                float var35 = this.field1144.field7800[0];
                float var36 = this.field1144.field7800[1];
                float var37 = this.field1144.field7800[2];
                float var38 = this.field1144.field7778;
                float var39 = this.field1144.field7849 * 768.0F / (float) this.field1124;
                float var40 = this.field1144.field7882 * 768.0F / (float) this.field1124;
                for (int var41 = 0; var41 < this.field1128; var41++) {
                    int var42 = this.method626(this.field1084[var41], 0, this.field1117[var41], this.field1082[var41], this.field1162);
                    short var43 = this.field1140[var41];
                    float var44 = (float) ((var42 & 0xFFC9) >> 8) * this.field1144.field7865;
                    float var45 = (float) (var42 >>> 24) * this.field1144.field7840;
                    float var46 = (float) ((var42 & 0xFFD3FE) >> 16) * this.field1144.field7828;
                    short var47 = (short) var31[var43];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var33[var43] * var37 + (float) var32[var43] * var36 + (float) var34[var43] * var35) * 0.0026041667F;
                    } else {
                        var48 = ((float) var33[var43] * var37 + (float) var32[var43] * var36 + (float) var34[var43] * var35) / (float) (var47 * 256);
                    }
                    float var49 = (var48 < 0.0F ? var40 : var39) * var48 + var38;
                    int var50 = (int) (var45 * var49);
                    int var51 = (int) (var46 * var49);
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
                    int var52 = (int) (var44 * var49);
                    var12.field2177 = var7 * var43 + var9;
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.method1049(-1, var50);
                    var12.method1049(-1, var51);
                    var12.method1049(-1, var52);
                    var12.method1049(-1, 255 - (this.field1117[var41] & 0xFF));
                    short var53 = this.field1181[var41];
                    short var54 = (short) var31[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var33[var53] * var37 + (float) var32[var53] * var36 + (float) var34[var53] * var35) * 0.0026041667F;
                    } else {
                        var55 = ((float) var33[var53] * var37 + (float) var32[var53] * var36 + (float) var34[var53] * var35) / (float) (var54 * 256);
                    }
                    float var56 = var38 + var55 * (var55 < 0.0F ? var40 : var39);
                    int var57 = (int) (var45 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var46 * var56);
                    int var59 = (int) (var44 * var56);
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.field2177 = var7 * var53 + var9;
                    var12.method1049(-1, var57);
                    var12.method1049(-1, var58);
                    var12.method1049(-1, var59);
                    var12.method1049(-1, 255 - (this.field1117[var41] & 0xFF));
                    short var60 = this.field1179[var41];
                    short var61 = (short) var31[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var33[var60] * var37 + (float) var32[var60] * var36 + (float) var34[var60] * var35) * 0.0026041667F;
                    } else {
                        var62 = ((float) var33[var60] * var37 + (float) var32[var60] * var36 + (float) var34[var60] * var35) / (float) (var61 * 256);
                    }
                    float var63 = var38 + var62 * ((var62 < 0.0F) ? var40 : var39);
                    int var64 = (int) (var45 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var65 = (int) (var46 * var63);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    int var66 = (int) (var44 * var63);
                    var12.field2177 = var7 * var60 + var9;
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.method1049(-1, var64);
                    var12.method1049(-1, var65);
                    var12.method1049(-1, var66);
                    var12.method1049(-1, 255 - (this.field1117[var41] & 0xFF));
                }
            } else {
                for (int var29 = 0; var29 < this.field1128; var29++) {
                    int var30 = this.method626(this.field1084[var29], 0, this.field1117[var29], this.field1082[var29], this.field1162);
                    var12.field2177 = this.field1140[var29] * var7 + var9;
                    var12.method1058(602643080, var30);
                    var12.field2177 = this.field1181[var29] * var7 + var9;
                    var12.method1058(602643080, var30);
                    var12.field2177 = this.field1179[var29] * var7 + var9;
                    var12.method1058(602643080, var30);
                }
            }
        }
        if (var4) {
            short[] var67;
            byte[] var68;
            short[] var69;
            short[] var70;
            if (this.field1111 == null) {
                var69 = this.field1096;
                var70 = this.field1107;
                var67 = this.field1155;
                var68 = this.field1119;
            } else {
                var67 = this.field1111.field2768;
                var68 = this.field1111.field2762;
                var69 = this.field1111.field2764;
                var70 = this.field1111.field2767;
            }
            float var71 = 3.0F / (float) this.field1124;
            float var72 = 3.0F / (float) (this.field1124 / 2 + this.field1124);
            var12.field2177 = var10;
            if (this.field1144.field7842) {
                for (int var76 = 0; var76 < this.field1139; var76++) {
                    int var77 = var68[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1564(0, (float) var70[var76] * var72);
                        var12.method1564(0, (float) var69[var76] * var72);
                        var12.method1564(0, (float) var67[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1564(0, (float) var70[var76] * var78);
                        var12.method1564(0, (float) var69[var76] * var78);
                        var12.method1564(0, (float) var67[var76] * var78);
                    }
                    var12.field2177 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field1139; var73++) {
                    int var74 = var68[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1563(true, (float) var70[var73] * var72);
                        var12.method1563(true, (float) var69[var73] * var72);
                        var12.method1563(true, (float) var67[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1563(true, (float) var70[var73] * var75);
                        var12.method1563(true, (float) var69[var73] * var75);
                        var12.method1563(!arg0, (float) var67[var73] * var75);
                    }
                    var12.field2177 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field2177 = var11;
            if (this.field1144.field7842) {
                for (int var80 = 0; var80 < this.field1139; var80++) {
                    var12.method1564(0, this.field1170[var80]);
                    var12.method1564(0, this.field1106[var80]);
                    var12.field2177 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field1139; var79++) {
                    var12.method1563(true, this.field1170[var79]);
                    var12.method1563(true, this.field1106[var79]);
                    var12.field2177 += var7 - 8;
                }
            }
        }
        var12.field2177 = this.field1139 * var7;
        class544 var81;
        if (arg1) {
            if (this.field1113 == null) {
                this.field1113 = this.field1144.method3180(var12.field2146, true, (byte) 123, var12.field2177, var7);
            } else {
                this.field1113.method3312(var12.field2146, (byte) 102, var7, var12.field2177);
            }
            this.field1090 = 0;
            var81 = this.field1113;
        } else {
            var81 = this.field1144.method3180(var12.field2146, false, (byte) 127, var12.field2177, var7);
            this.field1129 = true;
        }
        if (var5) {
            this.field1158.field5515 = var81;
            this.field1158.field5511 = var8;
        }
        if (var6) {
            this.field1109.field5515 = var81;
            this.field1109.field5511 = var11;
        }
        if (var3) {
            this.field1104.field5511 = var9;
            this.field1104.field5515 = var81;
        }
        if (var4) {
            this.field1085.field5515 = var81;
            this.field1085.field5511 = var10;
        }
    }

    @OriginalMember(owner = "client!qu", name = "EA", descriptor = "(Lk;)Lk;", line = 5109)
    public final class485 method92(class485 arg0) {
        field1191++;
        if (this.field1139 == 0) {
            return null;
        }
        if (!this.field1101) {
            this.method625((byte) 26);
        }
        int var2;
        int var3;
        if (this.field1144.field7871 <= 0) {
            var2 = this.field1189 - (this.field1144.field7871 * this.field1092 >> 8) >> this.field1144.field7742;
            var3 = this.field1138 - (this.field1144.field7871 * this.field1185 >> 8) >> this.field1144.field7742;
        } else {
            var2 = this.field1189 - (this.field1144.field7871 * this.field1185 >> 8) >> this.field1144.field7742;
            var3 = this.field1138 - (this.field1144.field7871 * this.field1092 >> 8) >> this.field1144.field7742;
        }
        int var4;
        int var5;
        if (this.field1144.field7867 > 0) {
            var4 = this.field1171 - (this.field1144.field7867 * this.field1185 >> 8) >> this.field1144.field7742;
            var5 = this.field1169 - (this.field1144.field7867 * this.field1092 >> 8) >> this.field1144.field7742;
        } else {
            var4 = this.field1171 - (this.field1144.field7867 * this.field1092 >> 8) >> this.field1144.field7742;
            var5 = this.field1169 - (this.field1144.field7867 * this.field1185 >> 8) >> this.field1144.field7742;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class198 var8 = (class198) arg0;
        class198 var9;
        if (var8 != null && var8.method1332(var7, -77, var6)) {
            var9 = var8;
            var8.method1330(-8);
        } else {
            var9 = new class198(this.field1144, var6, var7);
        }
        var9.method1333(var2, var4, 95, var3, var5);
        this.method629(var9, false);
        return var9;
    }

    @OriginalMember(owner = "client!qu", name = "ca", descriptor = "(III)V", line = 5172)
    public final void method82(int arg0, int arg1, int arg2) {
        field1180++;
        for (int var4 = 0; var4 < this.field1103; var4++) {
            if (arg0 != 0) {
                this.field1133[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field1184[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field1174[var4] += arg2;
            }
        }
        if (this.field1158 != null) {
            this.field1158.field5515 = null;
        }
        this.field1101 = false;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZI)V", line = 5204)
    private final void method628(boolean arg0, int arg1) {
        if ((this.field1166 * 6) > this.field1144.field7836.field2146.length) {
            this.field1144.field7836 = new class247(this.field1166 * 6 + 600);
        } else {
            this.field1144.field7836.field2177 = 0;
        }
        field1098++;
        class247 var3 = this.field1144.field7836;
        if (this.field1144.field7842) {
            for (int var4 = 0; var4 < this.field1166; var4++) {
                var3.method1027(255, this.field1140[var4]);
                var3.method1027(arg1 ^ 0x14FC, this.field1181[var4]);
                var3.method1027(arg1 ^ 0x14FC, this.field1179[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field1166; var5++) {
                var3.method1057(this.field1140[var5], (byte) 85);
                var3.method1057(this.field1181[var5], (byte) 85);
                var3.method1057(this.field1179[var5], (byte) 85);
            }
        }
        if (arg1 != 5123) {
            this.method95((short) -63, (short) -23);
        }
        if (var3.field2177 == 0) {
            return;
        }
        if (arg0) {
            if (this.field1127 == null) {
                this.field1127 = this.field1144.method3138(var3.field2146, var3.field2177, (byte) 107, 5123, true);
            } else {
                this.field1127.method1220(5123, var3.field2177, var3.field2146, arg1 ^ 0xFFFF818F);
            }
            this.field1135.field6996 = this.field1127;
        } else {
            this.field1135.field6996 = this.field1144.method3138(var3.field2146, var3.field2177, (byte) -111, 5123, false);
        }
        if (!arg0) {
            this.field1129 = true;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lfa;Z)V", line = 5270)
    private final void method629(class198 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field1168++;
        if (this.field1139 > this.field1144.field7887.length) {
            this.field1144.field7890 = new int[this.field1139];
            this.field1144.field7887 = new int[this.field1139];
        }
        int[] var3 = this.field1144.field7887;
        int[] var4 = this.field1144.field7890;
        for (int var5 = 0; var5 < this.field1103; var5++) {
            int var16 = (this.field1133[var5] - (this.field1184[var5] * this.field1144.field7871 >> 8) >> this.field1144.field7742) - arg0.field2923;
            int var17 = (this.field1174[var5] - (this.field1184[var5] * this.field1144.field7867 >> 8) >> this.field1144.field7742) - arg0.field2916;
            int var18 = this.field1187[var5];
            int var19 = this.field1187[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field1091[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field1166; var6++) {
            if (this.field1117 == null || this.field1117[var6] <= 128) {
                short var7 = this.field1140[var6];
                short var8 = this.field1181[var6];
                short var9 = this.field1179[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - (var12 - var11) * (var14 - var13) > 0) {
                    arg0.method1329(var15, var14, var12, (byte) -102, var10, var11, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "RA", descriptor = "(IILsa;Lsa;III)V", line = 5366)
    public final void method69(int arg0, int arg1, class176 arg2, class176 arg3, int arg4, int arg5, int arg6) {
        field1142++;
        if (!this.field1101) {
            this.method625((byte) -7);
        }
        int var8 = this.field1189 + arg4;
        int var9 = arg4 + this.field1138;
        int var10 = this.field1171 + arg6;
        int var11 = this.field1169 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field2694 + var9 >> arg2.field2695 >= arg2.field2697 || var10 < 0 || arg2.field2694 + var11 >> arg2.field2695 >= arg2.field2693) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field2697 <= arg3.field2694 + var9 >> arg3.field2695 || var10 < 0 || arg3.field2694 + var11 >> arg3.field2695 >= arg3.field2693) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field2695;
            int var13 = var9 + arg2.field2694 - 1 >> arg2.field2695;
            int var14 = var10 >> arg2.field2695;
            int var15 = arg2.field2694 + var11 - 1 >> arg2.field2695;
            if (arg5 == arg2.method1239(var12, var14) && arg2.method1239(var13, var14) == arg5 && arg2.method1239(var12, var15) == arg5 && arg2.method1239(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field1103; var16++) {
                this.field1184[var16] -= arg5 - arg2.method1233(this.field1133[var16] + arg4, this.field1174[var16] + arg6);
            }
        } else if (arg0 == 2) {
            short var30 = this.field1092;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field1103; var31++) {
                int var32 = (this.field1184[var31] << 16) / var30;
                if (arg1 > var32) {
                    this.field1184[var31] -= -((arg1 - var32) * (arg2.method1233(this.field1133[var31] + arg4, this.field1174[var31] + arg6) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var26 = (arg1 & 0xFF) * 4;
            int var27 = (arg1 >> 8 & 0xFF) * 4;
            int var28 = (arg1 & 0xFFD87E) >> 16 << 6;
            int var29 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var26 >> 1)) < 0 || (arg2.field2697 << arg2.field2695) <= ((var26 >> 1) + (arg4 + arg2.field2694)) || arg6 - (var27 >> 1) < 0 || arg2.field2693 << arg2.field2695 <= (var27 >> 1) + arg2.field2694 + arg6) {
                return;
            }
            this.method1147(var27, var26, (byte) -57, arg4, var28, var29, arg5, arg2, arg6);
        } else if (arg0 == 4) {
            int var17 = this.field1185 - this.field1092;
            for (int var18 = 0; var18 < this.field1103; var18++) {
                this.field1184[var18] = this.field1184[var18] + var17 + arg3.method1233(this.field1133[var18] - -arg4, this.field1174[var18] + arg6) - arg5;
            }
        } else if (arg0 == 5) {
            int var19 = this.field1185 - this.field1092;
            for (int var20 = 0; var20 < this.field1103; var20++) {
                int var21 = this.field1133[var20] + arg4;
                int var22 = this.field1174[var20] + arg6;
                int var23 = arg2.method1233(var21, var22);
                int var24 = arg3.method1233(var21, var22);
                int var25 = var23 - var24 - arg1;
                this.field1184[var20] = ((this.field1184[var20] << 8) / var19 * var25 >> 8) - (arg5 - var23);
            }
        }
        if (this.field1158 != null) {
            this.field1158.field5515 = null;
        }
        this.field1101 = false;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(Z)V", line = 5519)
    public static final void method630(boolean arg0) {
        class632.field9278.method3416(8);
        field1154++;
        if (!arg0) {
            return;
        }
        int var1 = class632.field9278.method3417(8, (byte) -86);
        if (var1 < class527.field7717) {
            for (int var2 = var1; var2 < class527.field7717; var2++) {
                class471.field6662[class470.field6631++] = class634.field9290[var2];
            }
        }
        if (var1 > class527.field7717) {
            throw new RuntimeException("gnpov1");
        }
        class527.field7717 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class634.field9290[var3];
            class571 var5 = ((class505) class510.field7260.method2799((long) var4, true)).field7148;
            int var6 = class632.field9278.method3417(1, (byte) -86);
            if (var6 == 0) {
                class634.field9290[class527.field7717++] = var4;
                var5.field1897 = class617.field9123;
            } else {
                int var7 = class632.field9278.method3417(2, (byte) -86);
                if (var7 == 0) {
                    class634.field9290[class527.field7717++] = var4;
                    var5.field1897 = class617.field9123;
                    class444.field5987[class427.field5745++] = var4;
                } else if (var7 == 1) {
                    class634.field9290[class527.field7717++] = var4;
                    var5.field1897 = class617.field9123;
                    int var8 = class632.field9278.method3417(3, (byte) -86);
                    var5.method3402(1, 39, var8);
                    int var9 = class632.field9278.method3417(1, (byte) -86);
                    if (var9 == 1) {
                        class444.field5987[class427.field5745++] = var4;
                    }
                } else if (var7 == 2) {
                    class634.field9290[class527.field7717++] = var4;
                    var5.field1897 = class617.field9123;
                    if (class632.field9278.method3417(1, (byte) -86) == 1) {
                        int var10 = class632.field9278.method3417(3, (byte) -86);
                        var5.method3402(2, 95, var10);
                        int var11 = class632.field9278.method3417(3, (byte) -86);
                        var5.method3402(2, 96, var11);
                    } else {
                        int var12 = class632.field9278.method3417(3, (byte) -86);
                        var5.method3402(0, 30, var12);
                    }
                    int var13 = class632.field9278.method3417(1, (byte) -86);
                    if (var13 == 1) {
                        class444.field5987[class427.field5745++] = var4;
                    }
                } else if (var7 == 3) {
                    class471.field6662[class470.field6631++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V", line = 5630)
    private final void method631(int arg0) {
        field1134++;
        if (!this.field1129) {
            return;
        }
        this.field1129 = false;
        if (this.field1164 == null && this.field1083 == null && this.field1112 == null) {
            if (this.field1133 != null && !class328.method1991(this.field1182, this.field1156, (byte) 120)) {
                if (this.field1158 != null && this.field1158.field5515 == null) {
                    this.field1129 = true;
                } else {
                    if (!this.field1101) {
                        this.method625((byte) 21);
                    }
                    this.field1133 = null;
                }
            }
            if (this.field1184 != null && !class237.method1515(-30193, this.field1182, this.field1156)) {
                if (this.field1158 != null && this.field1158.field5515 == null) {
                    this.field1129 = true;
                } else {
                    if (!this.field1101) {
                        this.method625((byte) -112);
                    }
                    this.field1184 = null;
                }
            }
            if (this.field1174 != null && !class139.method967((byte) -104, this.field1156, this.field1182)) {
                if (this.field1158 != null && this.field1158.field5515 == null) {
                    this.field1129 = true;
                } else {
                    if (!this.field1101) {
                        this.method625((byte) 9);
                    }
                    this.field1174 = null;
                }
            }
        }
        if (this.field1091 != null && this.field1133 == null && this.field1184 == null && this.field1174 == null) {
            this.field1187 = null;
            this.field1091 = null;
        }
        if (this.field1119 != null && !class15.method105(107, this.field1156, this.field1182)) {
            if (this.field1085 == null) {
                if (this.field1104 != null && this.field1104.field5515 == null) {
                    this.field1129 = true;
                } else {
                    this.field1119 = null;
                    this.field1107 = this.field1096 = this.field1155 = null;
                }
            } else if (this.field1085.field5515 == null) {
                this.field1129 = true;
            } else {
                this.field1107 = this.field1096 = this.field1155 = null;
                this.field1119 = null;
            }
        }
        if (this.field1082 != null && !class378.method2258(this.field1182, this.field1156, -116)) {
            if (this.field1104 != null && this.field1104.field5515 == null) {
                this.field1129 = true;
            } else {
                this.field1082 = null;
            }
        }
        if (this.field1117 != null && !class143.method977(51, this.field1156, this.field1182)) {
            if (this.field1104 != null && this.field1104.field5515 == null) {
                this.field1129 = true;
            } else {
                this.field1117 = null;
            }
        }
        int var2 = 105 % ((arg0 - 45) / 56);
        if (this.field1170 != null && !class183.method1271(-2, this.field1156, this.field1182)) {
            if (this.field1109 != null && this.field1109.field5515 == null) {
                this.field1129 = true;
            } else {
                this.field1170 = this.field1106 = null;
            }
        }
        if (this.field1084 != null && !class227.method1456(-70, this.field1182, this.field1156)) {
            if (this.field1104 != null && this.field1104.field5515 == null) {
                this.field1129 = true;
            } else {
                this.field1084 = null;
            }
        }
        if (this.field1140 != null && !class516.method3056(-1, this.field1156, this.field1182)) {
            if ((this.field1135 == null || this.field1135.field6996 != null) && (this.field1104 == null || this.field1104.field5515 != null)) {
                this.field1140 = this.field1181 = this.field1179 = null;
            } else {
                this.field1129 = true;
            }
        }
        if (this.field1088 != null && !class306.method1869(this.field1156, this.field1182, 122)) {
            this.field1153 = null;
            this.field1088 = null;
        }
        if (this.field1146 != null && !class212.method1396(this.field1156, -94, this.field1182)) {
            this.field1160 = null;
            this.field1146 = null;
        }
        if (this.field1122 != null && !class552.method3341(true, this.field1182, this.field1156)) {
            this.field1122 = null;
        }
        if (this.field1178 != null && (this.field1156 & 0x800) == 0 && (this.field1156 & 0x40000) == 0) {
            this.field1178 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "(I)V", line = 5809)
    public final void method79(int arg0) {
        field1143++;
        this.field1156 = arg0;
        if (this.field1111 != null && (this.field1156 & 0x10000) == 0) {
            this.field1155 = this.field1111.field2768;
            this.field1107 = this.field1111.field2767;
            this.field1096 = this.field1111.field2764;
            this.field1119 = this.field1111.field2762;
            this.field1111 = null;
        }
        this.field1129 = true;
        this.method631(-114);
    }

    @OriginalMember(owner = "client!qu", name = "TA", descriptor = "()I", line = 5837)
    public final int method86() {
        field1130++;
        if (!this.field1101) {
            this.method625((byte) 11);
        }
        return this.field1092;
    }

    @OriginalMember(owner = "client!qu", name = "D", descriptor = "(I)V", line = 5849)
    public final void method84(int arg0) {
        field1147++;
        int var2 = class589.field8742[arg0];
        int var3 = class589.field8735[arg0];
        for (int var4 = 0; var4 < this.field1103; var4++) {
            int var5 = this.field1184[var4] * var3 - (this.field1174[var4] * var2) >> 15;
            this.field1174[var4] = this.field1184[var4] * var2 + this.field1174[var4] * var3 >> 15;
            this.field1184[var4] = var5;
        }
        this.field1101 = false;
        if (this.field1158 != null) {
            this.field1158.field5515 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "I", descriptor = "(I)V", line = 5879)
    public final void method89(int arg0) {
        field1108++;
        this.field1124 = (short) arg0;
        if (this.field1104 != null) {
            this.field1104.field5515 = null;
        }
        if (this.field1085 != null) {
            this.field1085.field5515 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "X", descriptor = "()V", line = 6925)
    public final void method67() {
        field1186++;
        for (int var1 = 0; var1 < this.field1103; var1++) {
            this.field1174[var1] = -this.field1174[var1];
        }
        for (int var2 = 0; var2 < this.field1139; var2++) {
            this.field1155[var2] = (short) (-this.field1155[var2]);
        }
        for (int var3 = 0; var3 < this.field1128; var3++) {
            short var4 = this.field1140[var3];
            this.field1140[var3] = this.field1179[var3];
            this.field1179[var3] = var4;
        }
        if (this.field1085 == null && this.field1104 != null) {
            this.field1104.field5515 = null;
        }
        if (this.field1085 != null) {
            this.field1085.field5515 = null;
        }
        if (this.field1158 != null) {
            this.field1158.field5515 = null;
        }
        if (this.field1135 != null) {
            this.field1135.field6996 = null;
        }
        this.field1101 = false;
    }
}
