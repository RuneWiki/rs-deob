import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class57 extends class186 {

    @OriginalMember(owner = "client!ff", name = "hb", descriptor = "B")
    public byte field1182 = 0;

    @OriginalMember(owner = "client!ff", name = "pb", descriptor = "Z")
    private boolean field1190 = false;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
    public int field1170 = 0;

    @OriginalMember(owner = "client!ff", name = "vb", descriptor = "I")
    public int field1196 = 0;

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!ff", name = "nb", descriptor = "[I")
    public int[] field1188;

    @OriginalMember(owner = "client!ff", name = "Bb", descriptor = "[I")
    public int[] field1202;

    @OriginalMember(owner = "client!ff", name = "wb", descriptor = "[I")
    public int[] field1197;

    @OriginalMember(owner = "client!ff", name = "Gb", descriptor = "[I")
    private int[] field1207;

    @OriginalMember(owner = "client!ff", name = "gb", descriptor = "[I")
    public int[] field1181;

    @OriginalMember(owner = "client!ff", name = "rb", descriptor = "[I")
    public int[] field1192;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "[I")
    public int[] field1168;

    @OriginalMember(owner = "client!ff", name = "xb", descriptor = "[B")
    public byte[] field1198;

    @OriginalMember(owner = "client!ff", name = "Fb", descriptor = "[B")
    public byte[] field1206;

    @OriginalMember(owner = "client!ff", name = "kb", descriptor = "[B")
    public byte[] field1185;

    @OriginalMember(owner = "client!ff", name = "Cb", descriptor = "[I")
    private int[] field1203;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "[S")
    public short[] field1175;

    @OriginalMember(owner = "client!ff", name = "sb", descriptor = "[B")
    public byte[] field1193;

    @OriginalMember(owner = "client!ff", name = "ib", descriptor = "[S")
    public short[] field1183;

    @OriginalMember(owner = "client!ff", name = "db", descriptor = "[B")
    public byte[] field1178;

    @OriginalMember(owner = "client!ff", name = "mb", descriptor = "[S")
    public short[] field1187;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "[S")
    public short[] field1166;

    @OriginalMember(owner = "client!ff", name = "Hb", descriptor = "[S")
    public short[] field1208;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "[S")
    private short[] field1174;

    @OriginalMember(owner = "client!ff", name = "cb", descriptor = "[S")
    private short[] field1177;

    @OriginalMember(owner = "client!ff", name = "qb", descriptor = "[S")
    private short[] field1191;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "[B")
    private byte[] field1165;

    @OriginalMember(owner = "client!ff", name = "Db", descriptor = "[B")
    private byte[] field1204;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "[B")
    private byte[] field1163;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "[B")
    private byte[] field1176;

    @OriginalMember(owner = "client!ff", name = "eb", descriptor = "[B")
    private byte[] field1179;

    @OriginalMember(owner = "client!ff", name = "fb", descriptor = "[[I")
    public int[][] field1180;

    @OriginalMember(owner = "client!ff", name = "ub", descriptor = "[[I")
    public int[][] field1195;

    @OriginalMember(owner = "client!ff", name = "tb", descriptor = "[Laf;")
    public class7[] field1194;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "[Lcf;")
    public class27[] field1171;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "[Laf;")
    public class7[] field1167;

    @OriginalMember(owner = "client!ff", name = "Ib", descriptor = "S")
    public short field1209;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "S")
    public short field1164;

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "[I")
    private static int[] field1173 = new int[10000];

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    private static int field1169 = 0;

    @OriginalMember(owner = "client!ff", name = "ob", descriptor = "[I")
    private static int[] field1189 = class194.field3803;

    @OriginalMember(owner = "client!ff", name = "yb", descriptor = "[I")
    private static int[] field1199 = class194.field3787;

    @OriginalMember(owner = "client!ff", name = "Jb", descriptor = "[I")
    private static int[] field1210 = new int[10000];

    @OriginalMember(owner = "client!ff", name = "jb", descriptor = "S")
    private short field1184;

    @OriginalMember(owner = "client!ff", name = "lb", descriptor = "S")
    private short field1186;

    @OriginalMember(owner = "client!ff", name = "zb", descriptor = "S")
    private short field1200;

    @OriginalMember(owner = "client!ff", name = "Ab", descriptor = "S")
    private short field1201;

    @OriginalMember(owner = "client!ff", name = "Eb", descriptor = "S")
    private short field1205;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)V")
    public final void method330(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1170; ++var4) {
            this.field1188[var4] += arg0;
            this.field1202[var4] += arg1;
            this.field1197[var4] += arg2;
        }
        this.method340();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
    public static void method331() {
        field1173 = null;
        field1210 = null;
        field1199 = null;
        field1189 = null;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()V")
    public final void method332() {
        for (int var1 = 0; var1 < this.field1170; ++var1) {
            this.field1188[var1] = -this.field1188[var1];
            this.field1197[var1] = -this.field1197[var1];
        }
        this.method340();
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "()V")
    public final void method333() {
        if (this.field1194 == null) {
            this.field1194 = new class7[this.field1170];
            for (int var1 = 0; var1 < this.field1170; ++var1) {
                this.field1194[var1] = new class7();
            }
            for (int var2 = 0; var2 < this.field1196; ++var2) {
                int var3 = this.field1181[var2];
                int var4 = this.field1192[var2];
                int var5 = this.field1168[var2];
                int var6 = this.field1188[var4] - this.field1188[var3];
                int var7 = this.field1202[var4] - this.field1202[var3];
                int var8 = this.field1197[var4] - this.field1197[var3];
                int var9 = this.field1188[var5] - this.field1188[var3];
                int var10 = this.field1202[var5] - this.field1202[var3];
                int var11 = this.field1197[var5] - this.field1197[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field1198 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field1198[var2];
                }
                if (var19 == 0) {
                    class7 var20 = this.field1194[var3];
                    var20.field313 += var16;
                    var20.field306 += var17;
                    var20.field307 += var18;
                    ++var20.field312;
                    class7 var21 = this.field1194[var4];
                    var21.field313 += var16;
                    var21.field306 += var17;
                    var21.field307 += var18;
                    ++var21.field312;
                    class7 var22 = this.field1194[var5];
                    var22.field313 += var16;
                    var22.field306 += var17;
                    var22.field307 += var18;
                    ++var22.field312;
                } else if (var19 == 1) {
                    if (this.field1171 == null) {
                        this.field1171 = new class27[this.field1196];
                    }
                    class27 var23 = this.field1171[var2] = new class27();
                    var23.field613 = var16;
                    var23.field614 = var17;
                    var23.field604 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V")
    public final void method334(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1170; ++var4) {
            this.field1188[var4] = this.field1188[var4] * arg0 / 128;
            this.field1202[var4] = this.field1202[var4] * arg1 / 128;
            this.field1197[var4] = this.field1197[var4] * arg2 / 128;
        }
        this.method340();
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "()V")
    public final void method335() {
        int var10002;
        if (this.field1207 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1170; ++var3) {
                int var7 = this.field1207[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field1180 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field1180[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field1170) {
                int var6 = this.field1207[var5];
                this.field1180[var6][var1[var6]++] = var5++;
            }
            this.field1207 = null;
        }
        if (this.field1203 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field1196; ++var10) {
                int var14 = this.field1203[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field1195 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field1195[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field1196) {
                int var13 = this.field1203[var12];
                this.field1195[var13][var8[var13]++] = var12++;
            }
            this.field1203 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "()V")
    public final void method336() {
        for (int var1 = 0; var1 < this.field1170; ++var1) {
            int var2 = this.field1197[var1];
            this.field1197[var1] = this.field1188[var1];
            this.field1188[var1] = -var2;
        }
        this.method340();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lff;Lff;IIIZ)V")
    public static final void method337(class57 arg0, class57 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method339();
        arg0.method333();
        arg1.method339();
        arg1.method333();
        ++field1169;
        int var6 = 0;
        int[] var7 = arg1.field1188;
        int var8 = arg1.field1170;
        for (int var9 = 0; var9 < arg0.field1170; ++var9) {
            class7 var12 = arg0.field1194[var9];
            if (var12.field312 != 0) {
                int var13 = arg0.field1202[var9] - arg3;
                if (var13 >= arg1.field3511 && var13 <= arg1.field1200) {
                    int var14 = arg0.field1188[var9] - arg2;
                    if (var14 >= arg1.field1205 && var14 <= arg1.field1184) {
                        int var15 = arg0.field1197[var9] - arg4;
                        if (var15 >= arg1.field1186 && var15 <= arg1.field1201) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class7 var17 = arg1.field1194[var16];
                                if (var7[var16] == var14 && arg1.field1197[var16] == var15 && arg1.field1202[var16] == var13 && var17.field312 != 0) {
                                    if (arg0.field1167 == null) {
                                        arg0.field1167 = new class7[arg0.field1170];
                                    }
                                    if (arg1.field1167 == null) {
                                        arg1.field1167 = new class7[var8];
                                    }
                                    class7 var18 = arg0.field1167[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field1167[var9] = new class7(var12);
                                    }
                                    class7 var19 = arg1.field1167[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field1167[var16] = new class7(var17);
                                    }
                                    var18.field313 += var17.field313;
                                    var18.field306 += var17.field306;
                                    var18.field307 += var17.field307;
                                    var18.field312 += var17.field312;
                                    var19.field313 += var12.field313;
                                    var19.field306 += var12.field306;
                                    var19.field307 += var12.field307;
                                    var19.field312 += var12.field312;
                                    ++var6;
                                    field1173[var9] = field1169;
                                    field1210[var16] = field1169;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field1196; ++var10) {
                if (field1173[arg0.field1181[var10]] == field1169 && field1173[arg0.field1192[var10]] == field1169 && field1173[arg0.field1168[var10]] == field1169) {
                    if (arg0.field1198 == null) {
                        arg0.field1198 = new byte[arg0.field1196];
                    }
                    arg0.field1198[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field1196; ++var11) {
                if (field1210[arg1.field1181[var11]] == field1169 && field1210[arg1.field1192[var11]] == field1169 && field1210[arg1.field1168[var11]] == field1169) {
                    if (arg1.field1198 == null) {
                        arg1.field1198 = new byte[arg1.field1196];
                    }
                    arg1.field1198[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "()V")
    public final void method338() {
        for (int var1 = 0; var1 < this.field1196; ++var1) {
            int var2 = this.field1181[var1];
            this.field1181[var1] = this.field1168[var1];
            this.field1168[var1] = var2;
        }
        this.method340();
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "()V")
    private final void method339() {
        if (!this.field1190) {
            this.field1190 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            for (int var7 = 0; var7 < this.field1170; ++var7) {
                int var8 = this.field1188[var7];
                int var9 = this.field1202[var7];
                int var10 = this.field1197[var7];
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
            this.field1205 = (short) var1;
            this.field1184 = (short) var4;
            super.field3511 = (short) var2;
            this.field1200 = (short) var5;
            this.field1186 = (short) var3;
            this.field1201 = (short) var6;
        }
    }

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "()V")
    private final void method340() {
        this.field1194 = null;
        this.field1167 = null;
        this.field1171 = null;
        this.field1190 = false;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lnh;II)Lff;")
    public static final class57 method341(class133 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method899((byte) 87, arg1, arg2);
        return var3 == null ? null : new class57(var3);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([[IIIIZI)Lff;")
    public final class57 method342(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method339();
        int var7 = this.field1205 + arg1;
        int var8 = this.field1184 + arg1;
        int var9 = this.field1186 + arg3;
        int var10 = this.field1201 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class57 var15;
                if (arg4) {
                    var15 = new class57();
                    var15.field1170 = this.field1170;
                    var15.field1196 = this.field1196;
                    var15.field1172 = this.field1172;
                    var15.field1188 = this.field1188;
                    var15.field1197 = this.field1197;
                    var15.field1181 = this.field1181;
                    var15.field1192 = this.field1192;
                    var15.field1168 = this.field1168;
                    var15.field1198 = this.field1198;
                    var15.field1206 = this.field1206;
                    var15.field1185 = this.field1185;
                    var15.field1193 = this.field1193;
                    var15.field1183 = this.field1183;
                    var15.field1175 = this.field1175;
                    var15.field1182 = this.field1182;
                    var15.field1178 = this.field1178;
                    var15.field1187 = this.field1187;
                    var15.field1166 = this.field1166;
                    var15.field1208 = this.field1208;
                    var15.field1174 = this.field1174;
                    var15.field1177 = this.field1177;
                    var15.field1191 = this.field1191;
                    var15.field1165 = this.field1165;
                    var15.field1204 = this.field1204;
                    var15.field1163 = this.field1163;
                    var15.field1176 = this.field1176;
                    var15.field1179 = this.field1179;
                    var15.field1207 = this.field1207;
                    var15.field1203 = this.field1203;
                    var15.field1180 = this.field1180;
                    var15.field1195 = this.field1195;
                    var15.field1209 = this.field1209;
                    var15.field1164 = this.field1164;
                    var15.field1202 = new int[var15.field1170];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field1170; ++var16) {
                        int var17 = this.field1188[var16] + arg1;
                        int var18 = this.field1197[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field1202[var16] = this.field1202[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field1170; ++var26) {
                        int var27 = (this.field1202[var26] << 16) / super.field3511;
                        if (var27 < arg5) {
                            int var28 = this.field1188[var26] + arg1;
                            int var29 = this.field1197[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field1202[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1202[var26];
                        } else {
                            var15.field1202[var26] = this.field1202[var26];
                        }
                    }
                }
                var15.method340();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lff;I)I")
    private final int method343(class57 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1188[arg1];
        int var5 = arg0.field1202[arg1];
        int var6 = arg0.field1197[arg1];
        for (int var7 = 0; var7 < this.field1170; ++var7) {
            if (this.field1188[var7] == var4 && this.field1202[var7] == var5 && this.field1197[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1188[this.field1170] = var4;
            this.field1202[this.field1170] = var5;
            this.field1197[this.field1170] = var6;
            if (arg0.field1207 != null) {
                this.field1207[this.field1170] = arg0.field1207[arg1];
            }
            var3 = this.field1170++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([B)V")
    private final void method344(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class70 var4 = new class70(arg0);
        class70 var5 = new class70(arg0);
        class70 var6 = new class70(arg0);
        class70 var7 = new class70(arg0);
        class70 var8 = new class70(arg0);
        var4.field1472 = arg0.length - 18;
        int var9 = var4.method442(-21351);
        int var10 = var4.method442(-21351);
        int var11 = var4.method443(255);
        int var12 = var4.method443(255);
        int var13 = var4.method443(255);
        int var14 = var4.method443(255);
        int var15 = var4.method443(255);
        int var16 = var4.method443(255);
        int var17 = var4.method442(-21351);
        int var18 = var4.method442(-21351);
        int var19 = var4.method442(-21351);
        int var20 = var4.method442(-21351);
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
        this.field1196 = var10;
        this.field1172 = var11;
        this.field1188 = new int[var9];
        this.field1202 = new int[var9];
        this.field1197 = new int[var9];
        this.field1181 = new int[var10];
        this.field1192 = new int[var10];
        this.field1168 = new int[var10];
        if (var11 > 0) {
            this.field1178 = new byte[var11];
            this.field1187 = new short[var11];
            this.field1166 = new short[var11];
            this.field1208 = new short[var11];
        }
        if (var16 == 1) {
            this.field1207 = new int[var9];
        }
        if (var12 == 1) {
            this.field1198 = new byte[var10];
            this.field1193 = new byte[var10];
            this.field1175 = new short[var10];
        }
        if (var13 == 255) {
            this.field1206 = new byte[var10];
        } else {
            this.field1182 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1185 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1203 = new int[var10];
        }
        this.field1183 = new short[var10];
        var4.field1472 = var21;
        var5.field1472 = var36;
        var6.field1472 = var38;
        var7.field1472 = var40;
        var8.field1472 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method443(255);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method445((byte) 106);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method445((byte) 112);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method445((byte) 119);
            }
            this.field1188[var46] = var43 + var63;
            this.field1202[var46] = var44 + var64;
            this.field1197[var46] = var45 + var65;
            var43 = this.field1188[var46];
            var44 = this.field1202[var46];
            var45 = this.field1197[var46];
            if (var16 == 1) {
                this.field1207[var46] = var8.method443(255);
            }
        }
        var4.field1472 = var32;
        var5.field1472 = var28;
        var6.field1472 = var26;
        var7.field1472 = var30;
        var8.field1472 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field1183[var47] = (short) var4.method442(-21351);
            if (var12 == 1) {
                int var61 = var5.method443(255);
                if ((var61 & 1) == 1) {
                    this.field1198[var47] = 1;
                    var2 = true;
                } else {
                    this.field1198[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field1193[var47] = (byte) (var61 >> 2);
                    this.field1175[var47] = this.field1183[var47];
                    this.field1183[var47] = 127;
                    if (this.field1175[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1193[var47] = -1;
                    this.field1175[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field1206[var47] = var6.method431(-12469);
            }
            if (var14 == 1) {
                this.field1185[var47] = var7.method431(-12469);
            }
            if (var15 == 1) {
                this.field1203[var47] = var8.method443(255);
            }
        }
        var4.field1472 = var25;
        var5.field1472 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method443(255);
            if (var57 == 1) {
                var48 = var4.method445((byte) 97) + var51;
                var49 = var4.method445((byte) 105) + var48;
                var50 = var4.method445((byte) 101) + var49;
                var51 = var50;
                this.field1181[var52] = var48;
                this.field1192[var52] = var49;
                this.field1168[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method445((byte) 106) + var51;
                var51 = var50;
                this.field1181[var52] = var48;
                this.field1192[var52] = var49;
                this.field1168[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method445((byte) 103) + var51;
                var51 = var50;
                this.field1181[var52] = var48;
                this.field1192[var52] = var49;
                this.field1168[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method445((byte) 125) + var51;
                var51 = var50;
                this.field1181[var52] = var48;
                this.field1192[var52] = var60;
                this.field1168[var52] = var50;
            }
        }
        var4.field1472 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field1178[var53] = 0;
            this.field1187[var53] = (short) var4.method442(-21351);
            this.field1166[var53] = (short) var4.method442(-21351);
            this.field1208[var53] = (short) var4.method442(-21351);
        }
        if (this.field1193 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field1193[var55] & 255;
                if (var56 != 255) {
                    if ((this.field1187[var56] & 65535) == this.field1181[var55] && (this.field1166[var56] & 65535) == this.field1192[var55] && (this.field1208[var56] & 65535) == this.field1168[var55]) {
                        this.field1193[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field1193 = null;
            }
        }
        if (!var3) {
            this.field1175 = null;
        }
        if (!var2) {
            this.field1198 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIZZ)Ldg;")
    public final class38 method345(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        return new class191(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)Luc;")
    public final class191 method346(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class191(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "()V")
    public final void method347() {
        for (int var1 = 0; var1 < this.field1170; ++var1) {
            int var2 = this.field1188[var1];
            this.field1188[var1] = this.field1197[var1];
            this.field1197[var1] = -var2;
        }
        this.method340();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(SS)V")
    public final void method348(short arg0, short arg1) {
        if (this.field1175 != null) {
            for (int var3 = 0; var3 < this.field1196; ++var3) {
                if (this.field1175[var3] == arg0) {
                    this.field1175[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(SS)V")
    public final void method349(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1196; ++var3) {
            if (this.field1183[var3] == arg0) {
                this.field1183[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "([B)V")
    private final void method350(byte[] arg0) {
        class70 var2 = new class70(arg0);
        class70 var3 = new class70(arg0);
        class70 var4 = new class70(arg0);
        class70 var5 = new class70(arg0);
        class70 var6 = new class70(arg0);
        class70 var7 = new class70(arg0);
        class70 var8 = new class70(arg0);
        var2.field1472 = arg0.length - 23;
        int var9 = var2.method442(-21351);
        int var10 = var2.method442(-21351);
        int var11 = var2.method443(255);
        int var12 = var2.method443(255);
        int var13 = var2.method443(255);
        int var14 = var2.method443(255);
        int var15 = var2.method443(255);
        int var16 = var2.method443(255);
        int var17 = var2.method443(255);
        int var18 = var2.method442(-21351);
        int var19 = var2.method442(-21351);
        int var20 = var2.method442(-21351);
        int var21 = var2.method442(-21351);
        int var22 = var2.method442(-21351);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1178 = new byte[var11];
            var2.field1472 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field1178[var26] = var2.method431(-12469);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
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
        this.field1196 = var10;
        this.field1172 = var11;
        this.field1188 = new int[var9];
        this.field1202 = new int[var9];
        this.field1197 = new int[var9];
        this.field1181 = new int[var10];
        this.field1192 = new int[var10];
        this.field1168 = new int[var10];
        if (var17 == 1) {
            this.field1207 = new int[var9];
        }
        if (var12 == 1) {
            this.field1198 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1206 = new byte[var10];
        } else {
            this.field1182 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1185 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1203 = new int[var10];
        }
        if (var16 == 1) {
            this.field1175 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1193 = new byte[var10];
        }
        this.field1183 = new short[var10];
        if (var11 > 0) {
            this.field1187 = new short[var11];
            this.field1166 = new short[var11];
            this.field1208 = new short[var11];
            if (var24 > 0) {
                this.field1174 = new short[var24];
                this.field1177 = new short[var24];
                this.field1191 = new short[var24];
                this.field1165 = new byte[var24];
                this.field1204 = new byte[var24];
                this.field1163 = new byte[var24];
            }
            if (var25 > 0) {
                this.field1176 = new byte[var25];
                this.field1179 = new byte[var25];
            }
        }
        var2.field1472 = var11;
        var3.field1472 = var44;
        var4.field1472 = var46;
        var5.field1472 = var48;
        var6.field1472 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method443(255);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method445((byte) 106);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method445((byte) 121);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method445((byte) 123);
            }
            this.field1188[var67] = var64 + var82;
            this.field1202[var67] = var65 + var83;
            this.field1197[var67] = var66 + var84;
            var64 = this.field1188[var67];
            var65 = this.field1202[var67];
            var66 = this.field1197[var67];
            if (var17 == 1) {
                this.field1207[var67] = var6.method443(255);
            }
        }
        var2.field1472 = var42;
        var3.field1472 = var31;
        var4.field1472 = var34;
        var5.field1472 = var37;
        var6.field1472 = var35;
        var7.field1472 = var40;
        var8.field1472 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field1183[var68] = (short) var2.method442(-21351);
            if (var12 == 1) {
                this.field1198[var68] = var3.method431(-12469);
            }
            if (var13 == 255) {
                this.field1206[var68] = var4.method431(-12469);
            }
            if (var14 == 1) {
                this.field1185[var68] = var5.method431(-12469);
            }
            if (var15 == 1) {
                this.field1203[var68] = var6.method443(255);
            }
            if (var16 == 1) {
                this.field1175[var68] = (short) (var7.method442(-21351) - 1);
            }
            if (this.field1193 != null) {
                if (this.field1175[var68] != -1) {
                    this.field1193[var68] = (byte) (var8.method443(255) - 1);
                } else {
                    this.field1193[var68] = -1;
                }
            }
        }
        var2.field1472 = var33;
        var3.field1472 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method443(255);
            if (var77 == 1) {
                var69 = var2.method445((byte) 110) + var72;
                var70 = var2.method445((byte) 103) + var69;
                var71 = var2.method445((byte) 123) + var70;
                var72 = var71;
                this.field1181[var73] = var69;
                this.field1192[var73] = var70;
                this.field1168[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method445((byte) 126) + var72;
                var72 = var71;
                this.field1181[var73] = var69;
                this.field1192[var73] = var70;
                this.field1168[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method445((byte) 99) + var72;
                var72 = var71;
                this.field1181[var73] = var69;
                this.field1192[var73] = var70;
                this.field1168[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method445((byte) 117) + var72;
                var72 = var71;
                this.field1181[var73] = var69;
                this.field1192[var73] = var80;
                this.field1168[var73] = var71;
            }
        }
        var2.field1472 = var50;
        var3.field1472 = var52;
        var4.field1472 = var54;
        var5.field1472 = var56;
        var6.field1472 = var58;
        var7.field1472 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field1178[var74] & 255;
            if (var76 == 0) {
                this.field1187[var74] = (short) var2.method442(-21351);
                this.field1166[var74] = (short) var2.method442(-21351);
                this.field1208[var74] = (short) var2.method442(-21351);
            }
            if (var76 == 1) {
                this.field1187[var74] = (short) var3.method442(-21351);
                this.field1166[var74] = (short) var3.method442(-21351);
                this.field1208[var74] = (short) var3.method442(-21351);
                this.field1174[var74] = (short) var4.method442(-21351);
                this.field1177[var74] = (short) var4.method442(-21351);
                this.field1191[var74] = (short) var4.method442(-21351);
                this.field1165[var74] = var5.method431(-12469);
                this.field1204[var74] = var6.method431(-12469);
                this.field1163[var74] = var7.method431(-12469);
            }
            if (var76 == 2) {
                this.field1187[var74] = (short) var3.method442(-21351);
                this.field1166[var74] = (short) var3.method442(-21351);
                this.field1208[var74] = (short) var3.method442(-21351);
                this.field1174[var74] = (short) var4.method442(-21351);
                this.field1177[var74] = (short) var4.method442(-21351);
                this.field1191[var74] = (short) var4.method442(-21351);
                this.field1165[var74] = var5.method431(-12469);
                this.field1204[var74] = var6.method431(-12469);
                this.field1163[var74] = var7.method431(-12469);
                this.field1176[var74] = var7.method431(-12469);
                this.field1179[var74] = var7.method431(-12469);
            }
            if (var76 == 3) {
                this.field1187[var74] = (short) var3.method442(-21351);
                this.field1166[var74] = (short) var3.method442(-21351);
                this.field1208[var74] = (short) var3.method442(-21351);
                this.field1174[var74] = (short) var4.method442(-21351);
                this.field1177[var74] = (short) var4.method442(-21351);
                this.field1191[var74] = (short) var4.method442(-21351);
                this.field1165[var74] = var5.method431(-12469);
                this.field1204[var74] = var6.method431(-12469);
                this.field1163[var74] = var7.method431(-12469);
            }
        }
        var2.field1472 = var62;
        int var75 = var2.method443(255);
        if (var75 != 0) {
            new class44();
            var2.method442(-21351);
            var2.method442(-21351);
            var2.method442(-21351);
            var2.method453(102);
        }
    }

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "()Lff;")
    public final class57 method351() {
        class57 var1 = new class57();
        if (this.field1198 != null) {
            var1.field1198 = new byte[this.field1196];
            for (int var2 = 0; var2 < this.field1196; ++var2) {
                var1.field1198[var2] = this.field1198[var2];
            }
        }
        var1.field1170 = this.field1170;
        var1.field1196 = this.field1196;
        var1.field1172 = this.field1172;
        var1.field1188 = this.field1188;
        var1.field1202 = this.field1202;
        var1.field1197 = this.field1197;
        var1.field1181 = this.field1181;
        var1.field1192 = this.field1192;
        var1.field1168 = this.field1168;
        var1.field1206 = this.field1206;
        var1.field1185 = this.field1185;
        var1.field1193 = this.field1193;
        var1.field1183 = this.field1183;
        var1.field1175 = this.field1175;
        var1.field1182 = this.field1182;
        var1.field1178 = this.field1178;
        var1.field1187 = this.field1187;
        var1.field1166 = this.field1166;
        var1.field1208 = this.field1208;
        var1.field1174 = this.field1174;
        var1.field1177 = this.field1177;
        var1.field1191 = this.field1191;
        var1.field1165 = this.field1165;
        var1.field1204 = this.field1204;
        var1.field1163 = this.field1163;
        var1.field1176 = this.field1176;
        var1.field1179 = this.field1179;
        var1.field1207 = this.field1207;
        var1.field1203 = this.field1203;
        var1.field1180 = this.field1180;
        var1.field1195 = this.field1195;
        var1.field1194 = this.field1194;
        var1.field1171 = this.field1171;
        var1.field1209 = this.field1209;
        var1.field1164 = this.field1164;
        return var1;
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V")
    public final void method352(int arg0) {
        int var2 = field1199[arg0];
        int var3 = field1189[arg0];
        for (int var4 = 0; var4 < this.field1170; ++var4) {
            int var5 = this.field1197[var4] * var2 + this.field1188[var4] * var3 >> 16;
            this.field1197[var4] = this.field1197[var4] * var3 - this.field1188[var4] * var2 >> 16;
            this.field1188[var4] = var5;
        }
        this.method340();
    }

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "()V")
    public final void method353() {
        for (int var1 = 0; var1 < this.field1170; ++var1) {
            this.field1197[var1] = -this.field1197[var1];
        }
        this.method340();
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    private class57() {
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([B)V")
    private class57(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method350(arg0);
        } else {
            this.method344(arg0);
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([Lff;I)V")
    public class57(class57[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1170 = 0;
        this.field1196 = 0;
        this.field1172 = 0;
        this.field1182 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class57 var15 = arg0[var9];
            if (var15 != null) {
                this.field1170 += var15.field1170;
                this.field1196 += var15.field1196;
                this.field1172 += var15.field1172;
                if (var15.field1206 != null) {
                    var4 = true;
                } else {
                    if (this.field1182 == -1) {
                        this.field1182 = var15.field1182;
                    }
                    if (this.field1182 != var15.field1182) {
                        var4 = true;
                    }
                }
                var3 |= var15.field1198 != null;
                var5 |= var15.field1185 != null;
                var6 |= var15.field1203 != null;
                var7 |= var15.field1175 != null;
                var8 |= var15.field1193 != null;
            }
        }
        this.field1188 = new int[this.field1170];
        this.field1202 = new int[this.field1170];
        this.field1197 = new int[this.field1170];
        this.field1207 = new int[this.field1170];
        this.field1181 = new int[this.field1196];
        this.field1192 = new int[this.field1196];
        this.field1168 = new int[this.field1196];
        if (var3) {
            this.field1198 = new byte[this.field1196];
        }
        if (var4) {
            this.field1206 = new byte[this.field1196];
        }
        if (var5) {
            this.field1185 = new byte[this.field1196];
        }
        if (var6) {
            this.field1203 = new int[this.field1196];
        }
        if (var7) {
            this.field1175 = new short[this.field1196];
        }
        if (var8) {
            this.field1193 = new byte[this.field1196];
        }
        this.field1183 = new short[this.field1196];
        if (this.field1172 > 0) {
            this.field1178 = new byte[this.field1172];
            this.field1187 = new short[this.field1172];
            this.field1166 = new short[this.field1172];
            this.field1208 = new short[this.field1172];
            this.field1174 = new short[this.field1172];
            this.field1177 = new short[this.field1172];
            this.field1191 = new short[this.field1172];
            this.field1165 = new byte[this.field1172];
            this.field1204 = new byte[this.field1172];
            this.field1163 = new byte[this.field1172];
            this.field1176 = new byte[this.field1172];
            this.field1179 = new byte[this.field1172];
        }
        this.field1170 = 0;
        this.field1196 = 0;
        this.field1172 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class57 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field1196; ++var12) {
                    if (var3 && var11.field1198 != null) {
                        this.field1198[this.field1196] = var11.field1198[var12];
                    }
                    if (var4) {
                        if (var11.field1206 != null) {
                            this.field1206[this.field1196] = var11.field1206[var12];
                        } else {
                            this.field1206[this.field1196] = var11.field1182;
                        }
                    }
                    if (var5 && var11.field1185 != null) {
                        this.field1185[this.field1196] = var11.field1185[var12];
                    }
                    if (var6 && var11.field1203 != null) {
                        this.field1203[this.field1196] = var11.field1203[var12];
                    }
                    if (var7) {
                        if (var11.field1175 != null) {
                            this.field1175[this.field1196] = var11.field1175[var12];
                        } else {
                            this.field1175[this.field1196] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field1193 != null && var11.field1193[var12] != -1) {
                            this.field1193[this.field1196] = (byte) (var11.field1193[var12] + this.field1172);
                        } else {
                            this.field1193[this.field1196] = -1;
                        }
                    }
                    this.field1183[this.field1196] = var11.field1183[var12];
                    this.field1181[this.field1196] = this.method343(var11, var11.field1181[var12]);
                    this.field1192[this.field1196] = this.method343(var11, var11.field1192[var12]);
                    this.field1168[this.field1196] = this.method343(var11, var11.field1168[var12]);
                    ++this.field1196;
                }
                for (int var13 = 0; var13 < var11.field1172; ++var13) {
                    byte var14 = this.field1178[this.field1172] = var11.field1178[var13];
                    if (var14 == 0) {
                        this.field1187[this.field1172] = (short) this.method343(var11, var11.field1187[var13]);
                        this.field1166[this.field1172] = (short) this.method343(var11, var11.field1166[var13]);
                        this.field1208[this.field1172] = (short) this.method343(var11, var11.field1208[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field1187[this.field1172] = var11.field1187[var13];
                        this.field1166[this.field1172] = var11.field1166[var13];
                        this.field1208[this.field1172] = var11.field1208[var13];
                        this.field1174[this.field1172] = var11.field1174[var13];
                        this.field1177[this.field1172] = var11.field1177[var13];
                        this.field1191[this.field1172] = var11.field1191[var13];
                        this.field1165[this.field1172] = var11.field1165[var13];
                        this.field1204[this.field1172] = var11.field1204[var13];
                        this.field1163[this.field1172] = var11.field1163[var13];
                    }
                    if (var14 == 2) {
                        this.field1176[this.field1172] = var11.field1176[var13];
                        this.field1179[this.field1172] = var11.field1179[var13];
                    }
                    ++this.field1172;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lff;ZZZZ)V")
    public class57(class57 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1170 = arg0.field1170;
        this.field1196 = arg0.field1196;
        this.field1172 = arg0.field1172;
        if (arg1) {
            this.field1188 = arg0.field1188;
            this.field1202 = arg0.field1202;
            this.field1197 = arg0.field1197;
        } else {
            this.field1188 = new int[this.field1170];
            this.field1202 = new int[this.field1170];
            this.field1197 = new int[this.field1170];
            for (int var6 = 0; var6 < this.field1170; ++var6) {
                this.field1188[var6] = arg0.field1188[var6];
                this.field1202[var6] = arg0.field1202[var6];
                this.field1197[var6] = arg0.field1197[var6];
            }
        }
        if (arg2) {
            this.field1183 = arg0.field1183;
        } else {
            this.field1183 = new short[this.field1196];
            for (int var7 = 0; var7 < this.field1196; ++var7) {
                this.field1183[var7] = arg0.field1183[var7];
            }
        }
        if (!arg3 && arg0.field1175 != null) {
            this.field1175 = new short[this.field1196];
            for (int var8 = 0; var8 < this.field1196; ++var8) {
                this.field1175[var8] = arg0.field1175[var8];
            }
        } else {
            this.field1175 = arg0.field1175;
        }
        if (arg4) {
            this.field1185 = arg0.field1185;
        } else {
            this.field1185 = new byte[this.field1196];
            if (arg0.field1185 == null) {
                for (int var9 = 0; var9 < this.field1196; ++var9) {
                    this.field1185[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1196; ++var10) {
                    this.field1185[var10] = arg0.field1185[var10];
                }
            }
        }
        this.field1181 = arg0.field1181;
        this.field1192 = arg0.field1192;
        this.field1168 = arg0.field1168;
        this.field1198 = arg0.field1198;
        this.field1206 = arg0.field1206;
        this.field1193 = arg0.field1193;
        this.field1182 = arg0.field1182;
        this.field1178 = arg0.field1178;
        this.field1187 = arg0.field1187;
        this.field1166 = arg0.field1166;
        this.field1208 = arg0.field1208;
        this.field1174 = arg0.field1174;
        this.field1177 = arg0.field1177;
        this.field1191 = arg0.field1191;
        this.field1165 = arg0.field1165;
        this.field1204 = arg0.field1204;
        this.field1163 = arg0.field1163;
        this.field1176 = arg0.field1176;
        this.field1179 = arg0.field1179;
        this.field1207 = arg0.field1207;
        this.field1203 = arg0.field1203;
        this.field1180 = arg0.field1180;
        this.field1195 = arg0.field1195;
        this.field1194 = arg0.field1194;
        this.field1171 = arg0.field1171;
        this.field1167 = arg0.field1167;
        this.field1209 = arg0.field1209;
        this.field1164 = arg0.field1164;
    }
}
