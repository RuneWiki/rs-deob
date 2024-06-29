import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class67 extends class139 {

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public int field1134 = 0;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "B")
    public byte field1137 = 0;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "I")
    public int field1170 = 0;

    @OriginalMember(owner = "client!dd", name = "gb", descriptor = "Z")
    private boolean field1174 = false;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "[I")
    public int[] field1153;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "[I")
    public int[] field1171;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "[I")
    public int[] field1156;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "[I")
    private int[] field1164;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "[I")
    public int[] field1133;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "[I")
    public int[] field1159;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "[I")
    public int[] field1151;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "[B")
    public byte[] field1167;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "[B")
    public byte[] field1154;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "[B")
    public byte[] field1143;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "[S")
    public short[] field1136;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "[S")
    public short[] field1128;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "[B")
    public byte[] field1160;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "[I")
    private int[] field1141;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "[B")
    public byte[] field1142;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "[S")
    public short[] field1155;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "[S")
    public short[] field1135;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "[S")
    public short[] field1163;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "[S")
    private short[] field1161;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "[S")
    private short[] field1139;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "[S")
    private short[] field1138;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "[B")
    private byte[] field1166;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "[B")
    private byte[] field1144;

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "[B")
    private byte[] field1172;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "[B")
    private byte[] field1148;

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "[B")
    private byte[] field1173;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public int field1147;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "[[I")
    public int[][] field1168;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "[[I")
    public int[][] field1145;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "[Lci;")
    public class56[] field1152;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "[Lqb;")
    public class271[] field1157;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "[Lci;")
    public class56[] field1158;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "S")
    public short field1129;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "S")
    public short field1162;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "[I")
    private static int[] field1146 = new int[10000];

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "[I")
    private static int[] field1149 = new int[10000];

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
    private static int field1169 = 0;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "[I")
    private static int[] field1140 = class62.field1042;

    @OriginalMember(owner = "client!dd", name = "hb", descriptor = "[I")
    private static int[] field1175 = class62.field1049;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "S")
    private short field1130;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "S")
    private short field1131;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "S")
    private short field1132;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "S")
    private short field1150;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "S")
    private short field1165;

    @OriginalMember(owner = "client!dd", name = "ib", descriptor = "S")
    private short field1176;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)I")
    public final int method460(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1170; var4++) {
            if (this.field1153[var4] == arg0 && this.field1171[var4] == arg1 && this.field1156[var4] == arg2) {
                return var4;
            }
        }
        this.field1153[this.field1170] = arg0;
        this.field1171[this.field1170] = arg1;
        this.field1156[this.field1170] = arg2;
        return this.field1170++;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "()V")
    public final void method461() {
        this.field1164 = null;
        this.field1141 = null;
        this.field1168 = null;
        this.field1145 = null;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(III)V")
    public final void method462(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1170; var4++) {
            this.field1153[var4] += arg0;
            this.field1171[var4] += arg1;
            this.field1156[var4] += arg2;
        }
        this.method482();
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(III)V")
    public final void method463(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field1140[arg2];
            int var5 = field1175[arg2];
            for (int var6 = 0; var6 < this.field1170; var6++) {
                int var7 = this.field1171[var6] * var4 + this.field1153[var6] * var5 >> 16;
                this.field1171[var6] = this.field1171[var6] * var5 - this.field1153[var6] * var4 >> 16;
                this.field1153[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field1140[arg0];
            int var9 = field1175[arg0];
            for (int var10 = 0; var10 < this.field1170; var10++) {
                int var11 = this.field1171[var10] * var9 - this.field1156[var10] * var8 >> 16;
                this.field1156[var10] = this.field1171[var10] * var8 + this.field1156[var10] * var9 >> 16;
                this.field1171[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field1140[arg1];
        int var13 = field1175[arg1];
        for (int var14 = 0; var14 < this.field1170; var14++) {
            int var15 = this.field1156[var14] * var12 + this.field1153[var14] * var13 >> 16;
            this.field1156[var14] = this.field1156[var14] * var13 - this.field1153[var14] * var12 >> 16;
            this.field1153[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lpi;II)Ldd;")
    public static final class67 method464(class181 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1293(arg2, arg1, (byte) -110);
        return var3 == null ? null : new class67(var3);
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "()V")
    public final void method465() {
        for (int var1 = 0; var1 < this.field1170; var1++) {
            this.field1153[var1] = -this.field1153[var1];
            this.field1156[var1] = -this.field1156[var1];
        }
        this.method482();
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([[III)I")
    private static final int method466(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lj;IIIZ)V")
    public final void method467(class139 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class67 var6 = (class67) arg0;
        var6.method479();
        var6.method489();
        field1169++;
        int var7 = 0;
        int[] var8 = var6.field1153;
        int var9 = var6.field1170;
        for (int var10 = 0; var10 < this.field1170; var10++) {
            class56 var13 = this.field1152[var10];
            if (var13.field935 != 0) {
                int var14 = this.field1171[var10] - arg2;
                if (var14 >= var6.field1176 && var14 <= var6.field1150) {
                    int var15 = this.field1153[var10] - arg1;
                    if (var15 >= var6.field1130 && var15 <= var6.field1132) {
                        int var16 = this.field1156[var10] - arg3;
                        if (var16 >= var6.field1131 && var16 <= var6.field1165) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class56 var18 = var6.field1152[var17];
                                if (var8[var17] == var15 && var6.field1156[var17] == var16 && var6.field1171[var17] == var14 && var18.field935 != 0) {
                                    if (this.field1158 == null) {
                                        this.field1158 = new class56[this.field1170];
                                    }
                                    if (var6.field1158 == null) {
                                        var6.field1158 = new class56[var9];
                                    }
                                    class56 var19 = this.field1158[var10];
                                    if (var19 == null) {
                                        var19 = this.field1158[var10] = new class56(var13);
                                    }
                                    class56 var20 = var6.field1158[var17];
                                    if (var20 == null) {
                                        var20 = var6.field1158[var17] = new class56(var18);
                                    }
                                    var19.field943 += var18.field943;
                                    var19.field944 += var18.field944;
                                    var19.field932 += var18.field932;
                                    var19.field935 += var18.field935;
                                    var20.field943 += var13.field943;
                                    var20.field944 += var13.field944;
                                    var20.field932 += var13.field932;
                                    var20.field935 += var13.field935;
                                    var7++;
                                    field1149[var10] = field1169;
                                    field1146[var17] = field1169;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field1134; var11++) {
            if (field1149[this.field1133[var11]] == field1169 && field1149[this.field1159[var11]] == field1169 && field1149[this.field1151[var11]] == field1169) {
                if (this.field1167 == null) {
                    this.field1167 = new byte[this.field1134];
                }
                this.field1167[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field1134; var12++) {
            if (field1146[var6.field1133[var12]] == field1169 && field1146[var6.field1159[var12]] == field1169 && field1146[var6.field1151[var12]] == field1169) {
                if (var6.field1167 == null) {
                    var6.field1167 = new byte[var6.field1134];
                }
                var6.field1167[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "()V")
    public final void method468() {
        for (int var1 = 0; var1 < this.field1170; var1++) {
            this.field1156[var1] = -this.field1156[var1];
        }
        for (int var2 = 0; var2 < this.field1134; var2++) {
            int var3 = this.field1133[var2];
            this.field1133[var2] = this.field1151[var2];
            this.field1151[var2] = var3;
        }
        this.method482();
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIBSB)I")
    public final int method469(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field1133[this.field1134] = arg0;
        this.field1159[this.field1134] = arg1;
        this.field1151[this.field1134] = arg2;
        this.field1167[this.field1134] = arg3;
        this.field1160[this.field1134] = -1;
        this.field1136[this.field1134] = arg4;
        this.field1128[this.field1134] = -1;
        this.field1143[this.field1134] = arg5;
        return this.field1134++;
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "()V")
    public static void method470() {
        field1149 = null;
        field1146 = null;
        field1140 = null;
        field1175 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([B)V")
    private final void method471(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class75 var4 = new class75(arg0);
        class75 var5 = new class75(arg0);
        class75 var6 = new class75(arg0);
        class75 var7 = new class75(arg0);
        class75 var8 = new class75(arg0);
        var4.field1380 = arg0.length - 18;
        int var9 = var4.method545((byte) -60);
        int var10 = var4.method545((byte) 124);
        int var11 = var4.method558(1);
        int var12 = var4.method558(1);
        int var13 = var4.method558(1);
        int var14 = var4.method558(1);
        int var15 = var4.method558(1);
        int var16 = var4.method558(1);
        int var17 = var4.method545((byte) 114);
        int var18 = var4.method545((byte) 73);
        int var19 = var4.method545((byte) -70);
        int var20 = var4.method545((byte) -61);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field1170 = var9;
        this.field1134 = var10;
        this.field1147 = var11;
        this.field1153 = new int[var9];
        this.field1171 = new int[var9];
        this.field1156 = new int[var9];
        this.field1133 = new int[var10];
        this.field1159 = new int[var10];
        this.field1151 = new int[var10];
        if (var11 > 0) {
            this.field1142 = new byte[var11];
            this.field1155 = new short[var11];
            this.field1135 = new short[var11];
            this.field1163 = new short[var11];
        }
        if (var16 == 1) {
            this.field1164 = new int[var9];
        }
        if (var12 == 1) {
            this.field1167 = new byte[var10];
            this.field1160 = new byte[var10];
            this.field1128 = new short[var10];
        }
        if (var13 == 255) {
            this.field1154 = new byte[var10];
        } else {
            this.field1137 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1143 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1141 = new int[var10];
        }
        this.field1136 = new short[var10];
        var4.field1380 = var21;
        var5.field1380 = var36;
        var6.field1380 = var38;
        var7.field1380 = var40;
        var8.field1380 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method558(1);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method549(-73);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method549(83);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method549(-17);
            }
            this.field1153[var46] = var43 + var63;
            this.field1171[var46] = var44 + var64;
            this.field1156[var46] = var45 + var65;
            var43 = this.field1153[var46];
            var44 = this.field1171[var46];
            var45 = this.field1156[var46];
            if (var16 == 1) {
                this.field1164[var46] = var8.method558(1);
            }
        }
        var4.field1380 = var32;
        var5.field1380 = var28;
        var6.field1380 = var26;
        var7.field1380 = var30;
        var8.field1380 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field1136[var47] = (short) var4.method545((byte) 77);
            if (var12 == 1) {
                int var61 = var5.method558(1);
                if ((var61 & 0x1) == 1) {
                    this.field1167[var47] = 1;
                    var2 = true;
                } else {
                    this.field1167[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field1160[var47] = (byte) (var61 >> 2);
                    this.field1128[var47] = this.field1136[var47];
                    this.field1136[var47] = 127;
                    if (this.field1128[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1160[var47] = -1;
                    this.field1128[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field1154[var47] = var6.method569((byte) -110);
            }
            if (var14 == 1) {
                this.field1143[var47] = var7.method569((byte) -110);
            }
            if (var15 == 1) {
                this.field1141[var47] = var8.method558(1);
            }
        }
        var4.field1380 = var25;
        var5.field1380 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method558(1);
            if (var57 == 1) {
                var48 = var4.method549(-79) + var51;
                var49 = var4.method549(-38) + var48;
                var50 = var4.method549(95) + var49;
                var51 = var50;
                this.field1133[var52] = var48;
                this.field1159[var52] = var49;
                this.field1151[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method549(105) + var51;
                var51 = var50;
                this.field1133[var52] = var48;
                this.field1159[var52] = var49;
                this.field1151[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method549(116) + var51;
                var51 = var50;
                this.field1133[var52] = var48;
                this.field1159[var52] = var49;
                this.field1151[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method549(111) + var51;
                var51 = var50;
                this.field1133[var52] = var48;
                this.field1159[var52] = var60;
                this.field1151[var52] = var50;
            }
        }
        var4.field1380 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field1142[var53] = 0;
            this.field1155[var53] = (short) var4.method545((byte) 114);
            this.field1135[var53] = (short) var4.method545((byte) 56);
            this.field1163[var53] = (short) var4.method545((byte) -67);
        }
        if (this.field1160 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field1160[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field1155[var56] & 0xFFFF) == this.field1133[var55] && (this.field1135[var56] & 0xFFFF) == this.field1159[var55] && (this.field1163[var56] & 0xFFFF) == this.field1151[var55]) {
                        this.field1160[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field1160 = null;
            }
        }
        if (!var3) {
            this.field1128 = null;
        }
        if (!var2) {
            this.field1167 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()I")
    public final int method183() {
        if (!this.field1174) {
            this.method479();
        }
        return this.field1176;
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "()Ldd;")
    public final class67 method472() {
        class67 var1 = new class67();
        if (this.field1167 != null) {
            var1.field1167 = new byte[this.field1134];
            for (int var2 = 0; var2 < this.field1134; var2++) {
                var1.field1167[var2] = this.field1167[var2];
            }
        }
        var1.field1170 = this.field1170;
        var1.field1134 = this.field1134;
        var1.field1147 = this.field1147;
        var1.field1153 = this.field1153;
        var1.field1171 = this.field1171;
        var1.field1156 = this.field1156;
        var1.field1133 = this.field1133;
        var1.field1159 = this.field1159;
        var1.field1151 = this.field1151;
        var1.field1154 = this.field1154;
        var1.field1143 = this.field1143;
        var1.field1160 = this.field1160;
        var1.field1136 = this.field1136;
        var1.field1128 = this.field1128;
        var1.field1137 = this.field1137;
        var1.field1142 = this.field1142;
        var1.field1155 = this.field1155;
        var1.field1135 = this.field1135;
        var1.field1163 = this.field1163;
        var1.field1161 = this.field1161;
        var1.field1139 = this.field1139;
        var1.field1138 = this.field1138;
        var1.field1166 = this.field1166;
        var1.field1144 = this.field1144;
        var1.field1172 = this.field1172;
        var1.field1148 = this.field1148;
        var1.field1173 = this.field1173;
        var1.field1164 = this.field1164;
        var1.field1141 = this.field1141;
        var1.field1168 = this.field1168;
        var1.field1145 = this.field1145;
        var1.field1152 = this.field1152;
        var1.field1157 = this.field1157;
        var1.field1129 = this.field1129;
        var1.field1162 = this.field1162;
        return var1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)Lke;")
    public final class192 method473(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class192(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)Lj;")
    public final class139 method474(int arg0, int arg1, int arg2) {
        return this.method490(this.field1129, this.field1162, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    private final void method475(int arg0) {
        int var2 = field1140[arg0];
        int var3 = field1175[arg0];
        for (int var4 = 0; var4 < this.field1170; var4++) {
            int var5 = this.field1171[var4] * var3 - this.field1156[var4] * var2 >> 16;
            this.field1156[var4] = this.field1171[var4] * var2 + this.field1156[var4] * var3 >> 16;
            this.field1171[var4] = var5;
        }
        this.method482();
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "([B)V")
    private final void method476(byte[] arg0) {
        class75 var2 = new class75(arg0);
        class75 var3 = new class75(arg0);
        class75 var4 = new class75(arg0);
        class75 var5 = new class75(arg0);
        class75 var6 = new class75(arg0);
        class75 var7 = new class75(arg0);
        class75 var8 = new class75(arg0);
        var2.field1380 = arg0.length - 23;
        int var9 = var2.method545((byte) -97);
        int var10 = var2.method545((byte) 94);
        int var11 = var2.method558(1);
        int var12 = var2.method558(1);
        int var13 = var2.method558(1);
        int var14 = var2.method558(1);
        int var15 = var2.method558(1);
        int var16 = var2.method558(1);
        int var17 = var2.method558(1);
        int var18 = var2.method545((byte) 48);
        int var19 = var2.method545((byte) -98);
        int var20 = var2.method545((byte) -104);
        int var21 = var2.method545((byte) -80);
        int var22 = var2.method545((byte) 116);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1142 = new byte[var11];
            var2.field1380 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1142[var26] = var2.method569((byte) -110);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field1170 = var9;
        this.field1134 = var10;
        this.field1147 = var11;
        this.field1153 = new int[var9];
        this.field1171 = new int[var9];
        this.field1156 = new int[var9];
        this.field1133 = new int[var10];
        this.field1159 = new int[var10];
        this.field1151 = new int[var10];
        if (var17 == 1) {
            this.field1164 = new int[var9];
        }
        if (var12 == 1) {
            this.field1167 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1154 = new byte[var10];
        } else {
            this.field1137 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1143 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1141 = new int[var10];
        }
        if (var16 == 1) {
            this.field1128 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1160 = new byte[var10];
        }
        this.field1136 = new short[var10];
        if (var11 > 0) {
            this.field1155 = new short[var11];
            this.field1135 = new short[var11];
            this.field1163 = new short[var11];
            if (var24 > 0) {
                this.field1161 = new short[var24];
                this.field1139 = new short[var24];
                this.field1138 = new short[var24];
                this.field1166 = new byte[var24];
                this.field1144 = new byte[var24];
                this.field1172 = new byte[var24];
            }
            if (var25 > 0) {
                this.field1148 = new byte[var25];
                this.field1173 = new byte[var25];
            }
        }
        var2.field1380 = var11;
        var3.field1380 = var44;
        var4.field1380 = var46;
        var5.field1380 = var48;
        var6.field1380 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method558(1);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method549(86);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method549(-20);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method549(107);
            }
            this.field1153[var66] = var63 + var80;
            this.field1171[var66] = var64 + var81;
            this.field1156[var66] = var65 + var82;
            var63 = this.field1153[var66];
            var64 = this.field1171[var66];
            var65 = this.field1156[var66];
            if (var17 == 1) {
                this.field1164[var66] = var6.method558(1);
            }
        }
        var2.field1380 = var42;
        var3.field1380 = var31;
        var4.field1380 = var34;
        var5.field1380 = var37;
        var6.field1380 = var35;
        var7.field1380 = var40;
        var8.field1380 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field1136[var67] = (short) var2.method545((byte) 83);
            if (var12 == 1) {
                this.field1167[var67] = var3.method569((byte) -110);
            }
            if (var13 == 255) {
                this.field1154[var67] = var4.method569((byte) -110);
            }
            if (var14 == 1) {
                this.field1143[var67] = var5.method569((byte) -110);
            }
            if (var15 == 1) {
                this.field1141[var67] = var6.method558(1);
            }
            if (var16 == 1) {
                this.field1128[var67] = (short) (var7.method545((byte) -94) - 1);
            }
            if (this.field1160 != null) {
                if (this.field1128[var67] == -1) {
                    this.field1160[var67] = -1;
                } else {
                    this.field1160[var67] = (byte) (var8.method558(1) - 1);
                }
            }
        }
        var2.field1380 = var33;
        var3.field1380 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method558(1);
            if (var75 == 1) {
                var68 = var2.method549(110) + var71;
                var69 = var2.method549(84) + var68;
                var70 = var2.method549(108) + var69;
                var71 = var70;
                this.field1133[var72] = var68;
                this.field1159[var72] = var69;
                this.field1151[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method549(119) + var71;
                var71 = var70;
                this.field1133[var72] = var68;
                this.field1159[var72] = var69;
                this.field1151[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method549(-71) + var71;
                var71 = var70;
                this.field1133[var72] = var68;
                this.field1159[var72] = var69;
                this.field1151[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method549(-127) + var71;
                var71 = var70;
                this.field1133[var72] = var68;
                this.field1159[var72] = var78;
                this.field1151[var72] = var70;
            }
        }
        var2.field1380 = var50;
        var3.field1380 = var52;
        var4.field1380 = var54;
        var5.field1380 = var56;
        var6.field1380 = var58;
        var7.field1380 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field1142[var73] & 0xFF;
            if (var74 == 0) {
                this.field1155[var73] = (short) var2.method545((byte) -116);
                this.field1135[var73] = (short) var2.method545((byte) 97);
                this.field1163[var73] = (short) var2.method545((byte) -113);
            }
            if (var74 == 1) {
                this.field1155[var73] = (short) var3.method545((byte) -102);
                this.field1135[var73] = (short) var3.method545((byte) 117);
                this.field1163[var73] = (short) var3.method545((byte) 73);
                this.field1161[var73] = (short) var4.method545((byte) 45);
                this.field1139[var73] = (short) var4.method545((byte) 58);
                this.field1138[var73] = (short) var4.method545((byte) 101);
                this.field1166[var73] = var5.method569((byte) -110);
                this.field1144[var73] = var6.method569((byte) -110);
                this.field1172[var73] = var7.method569((byte) -110);
            }
            if (var74 == 2) {
                this.field1155[var73] = (short) var3.method545((byte) 55);
                this.field1135[var73] = (short) var3.method545((byte) 81);
                this.field1163[var73] = (short) var3.method545((byte) -78);
                this.field1161[var73] = (short) var4.method545((byte) -104);
                this.field1139[var73] = (short) var4.method545((byte) 86);
                this.field1138[var73] = (short) var4.method545((byte) -107);
                this.field1166[var73] = var5.method569((byte) -110);
                this.field1144[var73] = var6.method569((byte) -110);
                this.field1172[var73] = var7.method569((byte) -110);
                this.field1148[var73] = var7.method569((byte) -110);
                this.field1173[var73] = var7.method569((byte) -110);
            }
            if (var74 == 3) {
                this.field1155[var73] = (short) var3.method545((byte) -109);
                this.field1135[var73] = (short) var3.method545((byte) -57);
                this.field1163[var73] = (short) var3.method545((byte) -58);
                this.field1161[var73] = (short) var4.method545((byte) 37);
                this.field1139[var73] = (short) var4.method545((byte) -110);
                this.field1138[var73] = (short) var4.method545((byte) 39);
                this.field1166[var73] = var5.method569((byte) -110);
                this.field1144[var73] = var6.method569((byte) -110);
                this.field1172[var73] = var7.method569((byte) -110);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(SS)V")
    public final void method477(short arg0, short arg1) {
        if (this.field1128 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1134; var3++) {
            if (this.field1128[var3] == arg0) {
                this.field1128[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(III)V")
    public final void method478(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1170; var4++) {
            this.field1153[var4] = this.field1153[var4] * arg0 / 128;
            this.field1171[var4] = this.field1171[var4] * arg1 / 128;
            this.field1156[var4] = this.field1156[var4] * arg2 / 128;
        }
        this.method482();
    }

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "()V")
    private final void method479() {
        if (this.field1174) {
            return;
        }
        this.field1174 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field1170; var7++) {
            int var8 = this.field1153[var7];
            int var9 = this.field1171[var7];
            int var10 = this.field1156[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field1130 = (short) var1;
        this.field1132 = (short) var4;
        this.field1176 = (short) var2;
        this.field1150 = (short) var5;
        this.field1131 = (short) var3;
        this.field1165 = (short) var6;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(SS)V")
    public final void method480(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1134; var3++) {
            if (this.field1136[var3] == arg0) {
                this.field1136[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    private final void method481(int arg0) {
        int var2 = field1140[arg0];
        int var3 = field1175[arg0];
        for (int var4 = 0; var4 < this.field1170; var4++) {
            int var5 = this.field1171[var4] * var2 + this.field1153[var4] * var3 >> 16;
            this.field1171[var4] = this.field1171[var4] * var3 - this.field1153[var4] * var2 >> 16;
            this.field1153[var4] = var5;
        }
        this.method482();
    }

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "()V")
    private final void method482() {
        this.field1152 = null;
        this.field1158 = null;
        this.field1157 = null;
        this.field1174 = false;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[[I[[IIIIZZ)Ldd;")
    public final class67 method483(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method479();
        int var10 = this.field1130 + arg4;
        int var11 = this.field1132 + arg4;
        int var12 = this.field1131 + arg6;
        int var13 = this.field1165 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class67 var18;
        if (arg7) {
            var18 = new class67();
            var18.field1170 = this.field1170;
            var18.field1134 = this.field1134;
            var18.field1147 = this.field1147;
            var18.field1133 = this.field1133;
            var18.field1159 = this.field1159;
            var18.field1151 = this.field1151;
            var18.field1167 = this.field1167;
            var18.field1154 = this.field1154;
            var18.field1143 = this.field1143;
            var18.field1160 = this.field1160;
            var18.field1136 = this.field1136;
            var18.field1128 = this.field1128;
            var18.field1137 = this.field1137;
            var18.field1142 = this.field1142;
            var18.field1155 = this.field1155;
            var18.field1135 = this.field1135;
            var18.field1163 = this.field1163;
            var18.field1161 = this.field1161;
            var18.field1139 = this.field1139;
            var18.field1138 = this.field1138;
            var18.field1166 = this.field1166;
            var18.field1144 = this.field1144;
            var18.field1172 = this.field1172;
            var18.field1148 = this.field1148;
            var18.field1173 = this.field1173;
            var18.field1164 = this.field1164;
            var18.field1141 = this.field1141;
            var18.field1168 = this.field1168;
            var18.field1145 = this.field1145;
            var18.field1129 = this.field1129;
            var18.field1162 = this.field1162;
            var18.field1152 = this.field1152;
            var18.field1157 = this.field1157;
            var18.field1158 = this.field1158;
            if (arg0 == 3) {
                var18.field1153 = class57.method396(-1, this.field1153);
                var18.field1171 = class57.method396(-1, this.field1171);
                var18.field1156 = class57.method396(-1, this.field1156);
            } else {
                var18.field1153 = this.field1153;
                var18.field1171 = new int[var18.field1170];
                var18.field1156 = this.field1156;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field1170; var19++) {
                int var20 = this.field1153[var19] + arg4;
                int var21 = this.field1156[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field1171[var19] = this.field1171[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field1170; var29++) {
                int var30 = (this.field1171[var29] << 16) / this.field1176;
                if (var30 < arg1) {
                    int var31 = this.field1153[var29] + arg4;
                    int var32 = this.field1156[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field1171[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field1171[var29];
                } else {
                    var18.field1171[var29] = this.field1171[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method491(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field1150 - this.field1176;
            for (int var43 = 0; var43 < this.field1170; var43++) {
                int var44 = this.field1153[var43] + arg4;
                int var45 = this.field1156[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field1171[var43] = var52 + this.field1171[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field1150 - this.field1176;
            for (int var54 = 0; var54 < this.field1170; var54++) {
                int var55 = this.field1153[var54] + arg4;
                int var56 = this.field1156[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field1171[var54] = ((this.field1171[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method482();
        } else {
            this.field1174 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ldd;I)I")
    private final int method484(class67 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1153[arg1];
        int var5 = arg0.field1171[arg1];
        int var6 = arg0.field1156[arg1];
        for (int var7 = 0; var7 < this.field1170; var7++) {
            if (this.field1153[var7] == var4 && this.field1171[var7] == var5 && this.field1156[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1153[this.field1170] = var4;
            this.field1171[this.field1170] = var5;
            this.field1156[this.field1170] = var6;
            if (arg0.field1164 != null) {
                this.field1164[this.field1170] = arg0.field1164[arg1];
            }
            var3 = this.field1170++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "()V")
    public final void method485() {
        int var10002;
        if (this.field1164 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1170; var3++) {
                int var7 = this.field1164[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field1168 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field1168[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field1170) {
                int var6 = this.field1164[var5];
                this.field1168[var6][var1[var6]++] = var5++;
            }
            this.field1164 = null;
        }
        if (this.field1141 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1134; var10++) {
            int var14 = this.field1141[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field1145 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field1145[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field1134) {
            int var13 = this.field1141[var12];
            this.field1145[var13][var8[var13]++] = var12++;
        }
        this.field1141 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "()Z")
    public final boolean method486() {
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "()V")
    public final void method487() {
        for (int var1 = 0; var1 < this.field1170; var1++) {
            int var2 = this.field1156[var1];
            this.field1156[var1] = this.field1153[var1];
            this.field1153[var1] = -var2;
        }
        this.method482();
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "()V")
    public final void method488() {
        for (int var1 = 0; var1 < this.field1170; var1++) {
            int var2 = this.field1153[var1];
            this.field1153[var1] = this.field1156[var1];
            this.field1156[var1] = -var2;
        }
        this.method482();
    }

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "()V")
    public final void method489() {
        if (this.field1152 != null) {
            return;
        }
        this.field1152 = new class56[this.field1170];
        for (int var1 = 0; var1 < this.field1170; var1++) {
            this.field1152[var1] = new class56();
        }
        for (int var2 = 0; var2 < this.field1134; var2++) {
            int var3 = this.field1133[var2];
            int var4 = this.field1159[var2];
            int var5 = this.field1151[var2];
            int var6 = this.field1153[var4] - this.field1153[var3];
            int var7 = this.field1171[var4] - this.field1171[var3];
            int var8 = this.field1156[var4] - this.field1156[var3];
            int var9 = this.field1153[var5] - this.field1153[var3];
            int var10 = this.field1171[var5] - this.field1171[var3];
            int var11 = this.field1156[var5] - this.field1156[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field1167 == null) {
                var19 = 0;
            } else {
                var19 = this.field1167[var2];
            }
            if (var19 == 0) {
                class56 var20 = this.field1152[var3];
                var20.field943 += var16;
                var20.field944 += var17;
                var20.field932 += var18;
                var20.field935++;
                class56 var21 = this.field1152[var4];
                var21.field943 += var16;
                var21.field944 += var17;
                var21.field932 += var18;
                var21.field935++;
                class56 var22 = this.field1152[var5];
                var22.field943 += var16;
                var22.field944 += var17;
                var22.field932 += var18;
                var22.field935++;
            } else if (var19 == 1) {
                if (this.field1157 == null) {
                    this.field1157 = new class271[this.field1134];
                }
                class271 var23 = this.field1157[var2] = new class271();
                var23.field4722 = var16;
                var23.field4730 = var17;
                var23.field4725 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(IIIII)Lme;")
    public final class36 method490(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class192(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([[IIIIII)V")
    private final void method491(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method466(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method466(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method466(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method466(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method475(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method481(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method462(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public final void method492(int arg0) {
        int var2 = field1140[arg0];
        int var3 = field1175[arg0];
        for (int var4 = 0; var4 < this.field1170; var4++) {
            int var5 = this.field1156[var4] * var2 + this.field1153[var4] * var3 >> 16;
            this.field1156[var4] = this.field1156[var4] * var3 - this.field1153[var4] * var2 >> 16;
            this.field1153[var4] = var5;
        }
        this.method482();
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    private class67() {
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([B)V")
    private class67(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method476(arg0);
        } else {
            this.method471(arg0);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(III)V")
    public class67(int arg0, int arg1, int arg2) {
        this.field1153 = new int[arg0];
        this.field1171 = new int[arg0];
        this.field1156 = new int[arg0];
        this.field1164 = new int[arg0];
        this.field1133 = new int[arg1];
        this.field1159 = new int[arg1];
        this.field1151 = new int[arg1];
        this.field1167 = new byte[arg1];
        this.field1154 = new byte[arg1];
        this.field1143 = new byte[arg1];
        this.field1136 = new short[arg1];
        this.field1128 = new short[arg1];
        this.field1160 = new byte[arg1];
        this.field1141 = new int[arg1];
        if (arg2 > 0) {
            this.field1142 = new byte[arg2];
            this.field1155 = new short[arg2];
            this.field1135 = new short[arg2];
            this.field1163 = new short[arg2];
            this.field1161 = new short[arg2];
            this.field1139 = new short[arg2];
            this.field1138 = new short[arg2];
            this.field1166 = new byte[arg2];
            this.field1144 = new byte[arg2];
            this.field1172 = new byte[arg2];
            this.field1148 = new byte[arg2];
            this.field1173 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([Ldd;I)V")
    public class67(class67[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1170 = 0;
        this.field1134 = 0;
        this.field1147 = 0;
        this.field1137 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class67 var15 = arg0[var9];
            if (var15 != null) {
                this.field1170 += var15.field1170;
                this.field1134 += var15.field1134;
                this.field1147 += var15.field1147;
                if (var15.field1154 == null) {
                    if (this.field1137 == -1) {
                        this.field1137 = var15.field1137;
                    }
                    if (this.field1137 != var15.field1137) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field1167 != null;
                var5 |= var15.field1143 != null;
                var6 |= var15.field1141 != null;
                var7 |= var15.field1128 != null;
                var8 |= var15.field1160 != null;
            }
        }
        this.field1153 = new int[this.field1170];
        this.field1171 = new int[this.field1170];
        this.field1156 = new int[this.field1170];
        this.field1164 = new int[this.field1170];
        this.field1133 = new int[this.field1134];
        this.field1159 = new int[this.field1134];
        this.field1151 = new int[this.field1134];
        if (var3) {
            this.field1167 = new byte[this.field1134];
        }
        if (var4) {
            this.field1154 = new byte[this.field1134];
        }
        if (var5) {
            this.field1143 = new byte[this.field1134];
        }
        if (var6) {
            this.field1141 = new int[this.field1134];
        }
        if (var7) {
            this.field1128 = new short[this.field1134];
        }
        if (var8) {
            this.field1160 = new byte[this.field1134];
        }
        this.field1136 = new short[this.field1134];
        if (this.field1147 > 0) {
            this.field1142 = new byte[this.field1147];
            this.field1155 = new short[this.field1147];
            this.field1135 = new short[this.field1147];
            this.field1163 = new short[this.field1147];
            this.field1161 = new short[this.field1147];
            this.field1139 = new short[this.field1147];
            this.field1138 = new short[this.field1147];
            this.field1166 = new byte[this.field1147];
            this.field1144 = new byte[this.field1147];
            this.field1172 = new byte[this.field1147];
            this.field1148 = new byte[this.field1147];
            this.field1173 = new byte[this.field1147];
        }
        this.field1170 = 0;
        this.field1134 = 0;
        this.field1147 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class67 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field1134; var12++) {
                    if (var3 && var11.field1167 != null) {
                        this.field1167[this.field1134] = var11.field1167[var12];
                    }
                    if (var4) {
                        if (var11.field1154 == null) {
                            this.field1154[this.field1134] = var11.field1137;
                        } else {
                            this.field1154[this.field1134] = var11.field1154[var12];
                        }
                    }
                    if (var5 && var11.field1143 != null) {
                        this.field1143[this.field1134] = var11.field1143[var12];
                    }
                    if (var6 && var11.field1141 != null) {
                        this.field1141[this.field1134] = var11.field1141[var12];
                    }
                    if (var7) {
                        if (var11.field1128 == null) {
                            this.field1128[this.field1134] = -1;
                        } else {
                            this.field1128[this.field1134] = var11.field1128[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field1160 == null || var11.field1160[var12] == -1) {
                            this.field1160[this.field1134] = -1;
                        } else {
                            this.field1160[this.field1134] = (byte) (var11.field1160[var12] + this.field1147);
                        }
                    }
                    this.field1136[this.field1134] = var11.field1136[var12];
                    this.field1133[this.field1134] = this.method484(var11, var11.field1133[var12]);
                    this.field1159[this.field1134] = this.method484(var11, var11.field1159[var12]);
                    this.field1151[this.field1134] = this.method484(var11, var11.field1151[var12]);
                    this.field1134++;
                }
                for (int var13 = 0; var13 < var11.field1147; var13++) {
                    byte var14 = this.field1142[this.field1147] = var11.field1142[var13];
                    if (var14 == 0) {
                        this.field1155[this.field1147] = (short) this.method484(var11, var11.field1155[var13]);
                        this.field1135[this.field1147] = (short) this.method484(var11, var11.field1135[var13]);
                        this.field1163[this.field1147] = (short) this.method484(var11, var11.field1163[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field1155[this.field1147] = var11.field1155[var13];
                        this.field1135[this.field1147] = var11.field1135[var13];
                        this.field1163[this.field1147] = var11.field1163[var13];
                        this.field1161[this.field1147] = var11.field1161[var13];
                        this.field1139[this.field1147] = var11.field1139[var13];
                        this.field1138[this.field1147] = var11.field1138[var13];
                        this.field1166[this.field1147] = var11.field1166[var13];
                        this.field1144[this.field1147] = var11.field1144[var13];
                        this.field1172[this.field1147] = var11.field1172[var13];
                    }
                    if (var14 == 2) {
                        this.field1148[this.field1147] = var11.field1148[var13];
                        this.field1173[this.field1147] = var11.field1173[var13];
                    }
                    this.field1147++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Ldd;ZZZZ)V")
    public class67(class67 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1170 = arg0.field1170;
        this.field1134 = arg0.field1134;
        this.field1147 = arg0.field1147;
        if (arg1) {
            this.field1153 = arg0.field1153;
            this.field1171 = arg0.field1171;
            this.field1156 = arg0.field1156;
        } else {
            this.field1153 = new int[this.field1170];
            this.field1171 = new int[this.field1170];
            this.field1156 = new int[this.field1170];
            for (int var6 = 0; var6 < this.field1170; var6++) {
                this.field1153[var6] = arg0.field1153[var6];
                this.field1171[var6] = arg0.field1171[var6];
                this.field1156[var6] = arg0.field1156[var6];
            }
        }
        if (arg2) {
            this.field1136 = arg0.field1136;
        } else {
            this.field1136 = new short[this.field1134];
            for (int var7 = 0; var7 < this.field1134; var7++) {
                this.field1136[var7] = arg0.field1136[var7];
            }
        }
        if (arg3 || arg0.field1128 == null) {
            this.field1128 = arg0.field1128;
        } else {
            this.field1128 = new short[this.field1134];
            for (int var8 = 0; var8 < this.field1134; var8++) {
                this.field1128[var8] = arg0.field1128[var8];
            }
        }
        if (arg4) {
            this.field1143 = arg0.field1143;
        } else {
            this.field1143 = new byte[this.field1134];
            if (arg0.field1143 == null) {
                for (int var9 = 0; var9 < this.field1134; var9++) {
                    this.field1143[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1134; var10++) {
                    this.field1143[var10] = arg0.field1143[var10];
                }
            }
        }
        this.field1133 = arg0.field1133;
        this.field1159 = arg0.field1159;
        this.field1151 = arg0.field1151;
        this.field1167 = arg0.field1167;
        this.field1154 = arg0.field1154;
        this.field1160 = arg0.field1160;
        this.field1137 = arg0.field1137;
        this.field1142 = arg0.field1142;
        this.field1155 = arg0.field1155;
        this.field1135 = arg0.field1135;
        this.field1163 = arg0.field1163;
        this.field1161 = arg0.field1161;
        this.field1139 = arg0.field1139;
        this.field1138 = arg0.field1138;
        this.field1166 = arg0.field1166;
        this.field1144 = arg0.field1144;
        this.field1172 = arg0.field1172;
        this.field1148 = arg0.field1148;
        this.field1173 = arg0.field1173;
        this.field1164 = arg0.field1164;
        this.field1141 = arg0.field1141;
        this.field1168 = arg0.field1168;
        this.field1145 = arg0.field1145;
        this.field1152 = arg0.field1152;
        this.field1157 = arg0.field1157;
        this.field1158 = arg0.field1158;
        this.field1129 = arg0.field1129;
        this.field1162 = arg0.field1162;
    }
}
