import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class58 {

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "Z")
    private boolean field1168;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Z")
    private boolean field1135;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Led;")
    public static class43 field1145 = class191.method1219("Suche nach Updates )2 ", false);

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Led;")
    public static class43 field1130 = class191.method1219(":assist:", false);

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field1162 = 0;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Ltd;")
    public static class176 field1131 = new class176(64);

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "Z")
    public static boolean field1174 = false;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    private int field1170;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "Lmc;")
    private class112 field1155;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "Lwc;")
    public static class202 field1172;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "Lig;")
    public static class80 field1166;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "[I")
    private int[] field1137;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "[I")
    public int[] field1146;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "[I")
    public int[] field1147;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "[I")
    public int[] field1156;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "[I")
    private int[] field1164;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "[Lmc;")
    private class112[] field1144;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field1152;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "[[I")
    private int[][] field1158;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "[[I")
    private int[][] field1160;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1129;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I")
    public final int method344(int arg0, int arg1) {
        field1138++;
        if (arg1 != 1) {
            this.field1135 = false;
        }
        return this.field1129[arg0].length;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)V")
    public void method345(int arg0, byte arg1) {
        field1148++;
        if (arg1 > -1) {
            field1131 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)[B")
    public final byte[] method346(int arg0, int arg1, int arg2) {
        field1171++;
        if (arg0 < 0 || this.field1129.length <= arg0 || this.field1129[arg0] == null || arg2 < 0 || this.field1129[arg0].length <= arg2) {
            return null;
        }
        if (this.field1129[arg0][arg2] == null) {
            boolean var4 = this.method360(arg0, arg1 ^ 0xFFFFF374, null);
            if (!var4) {
                this.method345(arg0, (byte) -93);
                boolean var5 = this.method360(arg0, arg1 + 3212, null);
                if (!var5) {
                    return null;
                }
            }
        }
        return arg1 == -1 ? class128.method823(arg1 ^ 0x63, false, this.field1129[arg0][arg2]) : null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Led;B)I")
    public final int method347(class43 arg0, byte arg1) {
        int var3 = -22 / ((-arg1 - 6) / 53);
        field1140++;
        class43 var4 = arg0.method244(19404);
        return this.field1155.method691(var4.method263(-52), false);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([IIII)[B")
    public final byte[] method348(int[] arg0, int arg1, int arg2, int arg3) {
        field1128++;
        if (arg3 > arg1 || this.field1129.length <= arg1 || this.field1129[arg1] == null || arg2 < 0 || this.field1129[arg1].length <= arg2) {
            return null;
        }
        if (this.field1129[arg1][arg2] == null) {
            boolean var5 = this.method360(arg1, 3211, arg0);
            if (!var5) {
                this.method345(arg1, (byte) -111);
                boolean var6 = this.method360(arg1, 3211, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class128.method823(-54, false, this.field1129[arg1][arg2]);
        if (this.field1135) {
            this.field1129[arg1][arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZI)V")
    public final void method349(boolean arg0, int arg1) {
        field1132++;
        if (!arg0) {
            for (int var3 = 0; var3 < this.field1129[arg1].length; var3++) {
                this.field1129[arg1][var3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZ)Z")
    public final boolean method350(int arg0, int arg1, boolean arg2) {
        field1157++;
        if (arg0 < 0 || arg0 >= this.field1129.length || this.field1129[arg0] == null || arg1 < 0 || arg1 >= this.field1129[arg0].length) {
            return false;
        } else if (this.field1129[arg0][arg1] == null) {
            if (arg2) {
                this.method367(39, -73, (byte) 114);
            }
            if (this.field1152[arg0] == null) {
                this.method345(arg0, (byte) -18);
                return this.field1152[arg0] != null;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static void method351(byte arg0) {
        if (arg0 != 42) {
            method351((byte) -110);
        }
        field1145 = null;
        field1131 = null;
        field1130 = null;
        field1172 = null;
        field1166 = null;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Z")
    public final boolean method352(int arg0, int arg1) {
        field1141++;
        if (this.field1129.length == 1) {
            return this.method350(0, arg0, false);
        } else if (arg1 != 0) {
            return true;
        } else if (this.field1129[arg0].length == 1) {
            return this.method350(arg0, 0, false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(IB)V")
    public void method353(int arg0, byte arg1) {
        if (arg1 < 59) {
            this.method352(38, 44);
        }
        field1159++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Z")
    public final boolean method354(int arg0) {
        field1136++;
        boolean var2 = true;
        if (arg0 >= -99) {
            this.method357(54);
        }
        for (int var3 = 0; var3 < this.field1137.length; var3++) {
            int var4 = this.field1137[var3];
            if (this.field1152[var4] == null) {
                this.method345(var4, (byte) -51);
                if (this.field1152[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Led;BLed;)[B")
    public final byte[] method355(class43 arg0, byte arg1, class43 arg2) {
        class43 var4 = arg2.method244(19404);
        if (arg1 != 12) {
            this.method349(false, -94);
        }
        field1163++;
        class43 var5 = arg0.method244(arg1 ^ 0x4BC0);
        int var6 = this.field1155.method691(var4.method263(arg1 ^ 0xFFFFFF8E), false);
        int var7 = this.field1144[var6].method691(var5.method263(117), false);
        return this.method367(var6, var7, (byte) -34);
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)[I")
    public final int[] method356(int arg0, int arg1) {
        if (arg0 == 16816) {
            field1143++;
            return this.field1158[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I")
    public final int method357(int arg0) {
        field1134++;
        if (arg0 < 14) {
            this.field1158 = null;
        }
        return this.field1129.length;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)Z")
    public final boolean method358(int arg0, boolean arg1) {
        field1169++;
        if (!arg1) {
            return true;
        } else if (this.field1152[arg0] == null) {
            this.method345(arg0, (byte) -105);
            return this.field1152[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([BI)V")
    public final void method359(byte[] arg0, int arg1) {
        if (arg1 != -16988) {
            field1172 = null;
        }
        this.field1149 = class71.method439(arg0, arg0.length, (byte) 43);
        field1167++;
        class89 var3 = new class89(class127.method822(arg0, -24334));
        int var4 = var3.method538((byte) -112);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method545(arg1 ^ 0x5F50);
        }
        int var5 = 0;
        int var6 = var3.method538((byte) -114);
        this.field1170 = var3.method555(arg1 - 1113610108);
        this.field1137 = new int[this.field1170];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field1170; var8++) {
            this.field1137[var8] = var5 += var3.method555(class127.method818(arg1, 1113643916));
            if (this.field1137[var8] > var7) {
                var7 = this.field1137[var8];
            }
        }
        this.field1158 = new int[var7 + 1][];
        this.field1146 = new int[var7 + 1];
        this.field1156 = new int[var7 + 1];
        this.field1129 = new Object[var7 + 1][];
        this.field1152 = new Object[var7 + 1];
        this.field1147 = new int[var7 + 1];
        if (var6 != 0) {
            this.field1164 = new int[var7 + 1];
            for (int var9 = 0; var9 < var7 + 1; var9++) {
                this.field1164[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1170; var10++) {
                this.field1164[this.field1137[var10]] = var3.method545(-7436);
            }
            this.field1155 = new class112(this.field1164);
        }
        for (int var11 = 0; var11 < this.field1170; var11++) {
            this.field1156[this.field1137[var11]] = var3.method545(-7436);
        }
        for (int var12 = 0; var12 < this.field1170; var12++) {
            this.field1147[this.field1137[var12]] = var3.method545(class127.method818(arg1, 24400));
        }
        for (int var13 = 0; var13 < this.field1170; var13++) {
            this.field1146[this.field1137[var13]] = var3.method555(-1113627096);
        }
        for (int var14 = 0; var14 < this.field1170; var14++) {
            int var20 = 0;
            int var21 = -1;
            int var22 = this.field1137[var14];
            int var23 = this.field1146[var22];
            this.field1158[var22] = new int[var23];
            for (int var24 = 0; var24 < var23; var24++) {
                int var25 = this.field1158[var22][var24] = var20 += var3.method555(-1113627096);
                if (var25 > var21) {
                    var21 = var25;
                }
            }
            this.field1129[var22] = new Object[var21 + 1];
        }
        if (var6 == 0) {
            return;
        }
        this.field1144 = new class112[var7 + 1];
        this.field1160 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field1170; var15++) {
            int var16 = this.field1137[var15];
            int var17 = this.field1146[var16];
            this.field1160[var16] = new int[this.field1129[var16].length];
            for (int var18 = 0; var18 < this.field1129[var16].length; var18++) {
                this.field1160[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                this.field1160[var16][this.field1158[var16][var19]] = var3.method545(-7436);
            }
            this.field1144[var16] = new class112(this.field1160[var16]);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II[I)Z")
    private final boolean method360(int arg0, int arg1, int[] arg2) {
        field1161++;
        if (this.field1152[arg0] == null) {
            return false;
        }
        int var4 = this.field1146[arg0];
        int[] var5 = this.field1158[arg0];
        if (arg1 != 3211) {
            return true;
        }
        Object[] var6 = this.field1129[arg0];
        boolean var7 = true;
        for (int var8 = 0; var8 < var4; var8++) {
            if (var6[var5[var8]] == null) {
                var7 = false;
                break;
            }
        }
        if (var7) {
            return true;
        }
        byte[] var9;
        if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
            var9 = class128.method823(-14, false, this.field1152[arg0]);
        } else {
            var9 = class128.method823(-35, true, this.field1152[arg0]);
            class89 var10 = new class89(var9);
            var10.method582(5, arg2, true, var10.field1769.length);
        }
        byte[] var11;
        try {
            var11 = class127.method822(var9, -24334);
        } catch (RuntimeException var28) {
            throw class5.method32(var28, "T3 - " + (arg2 != null) + "," + arg0 + "," + var9.length + "," + class71.method439(var9, var9.length, (byte) 91) + "," + class71.method439(var9, var9.length - 2, (byte) 91) + "," + this.field1156[arg0] + "," + this.field1149);
        }
        if (this.field1168) {
            this.field1152[arg0] = null;
        }
        if (var4 > 1) {
            int var13 = var11.length;
            int var29 = var13 - 1;
            int var14 = var11[var29] & 0xFF;
            int var15 = var29 - var4 * var14 * 4;
            int[] var16 = new int[var4];
            class89 var17 = new class89(var11);
            var17.field1727 = var15;
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var17.method545(-7436);
                    var16[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var4][];
            for (int var22 = 0; var22 < var4; var22++) {
                var21[var22] = new byte[var16[var22]];
                var16[var22] = 0;
            }
            var17.field1727 = var15;
            int var23 = 0;
            for (int var24 = 0; var24 < var14; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var4; var26++) {
                    var25 += var17.method545(-7436);
                    class42.method234(var11, var23, var21[var26], var16[var26], var25);
                    var23 += var25;
                    var16[var26] += var25;
                }
            }
            for (int var27 = 0; var27 < var4; var27++) {
                if (this.field1135) {
                    var6[var5[var27]] = var21[var27];
                } else {
                    var6[var5[var27]] = class207.method1344(false, 27042, var21[var27]);
                }
            }
        } else if (this.field1135) {
            var6[var5[0]] = var11;
        } else {
            var6[var5[0]] = class207.method1344(false, 27042, var11);
        }
        return true;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLed;Led;)Z")
    public final boolean method361(byte arg0, class43 arg1, class43 arg2) {
        field1153++;
        class43 var4 = arg1.method244(19404);
        class43 var5 = arg2.method244(19404);
        int var6 = this.field1155.method691(var4.method263(115), false);
        int var7 = this.field1144[var6].method691(var5.method263(120), false);
        if (arg0 <= 119) {
            field1173 = 32;
        }
        return this.method350(var6, var7, false);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Led;BI)I")
    public final int method362(class43 arg0, byte arg1, int arg2) {
        class43 var4 = arg0.method244(19404);
        field1139++;
        if (arg1 != -47) {
            this.method344(-125, -52);
        }
        return this.field1144[arg2].method691(var4.method263(arg1 ^ 0xFFFFFFA3), false);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BII)V")
    public static final void method363(byte arg0, int arg1, int arg2) {
        field1154++;
        class29.field522.method338(253, 121);
        class29.field522.method581(arg2, -268435456);
        class198.field3899++;
        if (arg0 >= -9) {
            field1173 = -77;
        }
        class29.field522.method572((byte) 53, arg1);
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(II)[B")
    public final byte[] method364(int arg0, int arg1) {
        field1142++;
        if (this.field1129.length == 1) {
            return this.method367(0, arg1, (byte) -34);
        } else if (this.field1129[arg1].length == 1) {
            return this.method367(arg1, 0, (byte) -34);
        } else {
            if (arg0 != 26552) {
                field1166 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public final void method365(int arg0) {
        int var2 = 0;
        int var3 = 58 / ((-arg0 - 17) / 53);
        while (var2 < this.field1129.length) {
            if (this.field1129[var2] != null) {
                for (int var4 = 0; var4 < this.field1129[var2].length; var4++) {
                    this.field1129[var2][var4] = null;
                }
            }
            var2++;
        }
        field1151++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Led;Z)V")
    public final void method366(class43 arg0, boolean arg1) {
        field1150++;
        class43 var3 = arg0.method244(19404);
        int var4 = this.field1155.method691(var3.method263(19), arg1);
        if (var4 >= 0) {
            this.method353(var4, (byte) 64);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIB)[B")
    public final byte[] method367(int arg0, int arg1, byte arg2) {
        field1165++;
        if (arg2 != -34) {
            this.method355(null, (byte) 11, null);
        }
        return this.method348(null, arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(ZZ)V")
    public class58(boolean arg0, boolean arg1) {
        this.field1168 = arg0;
        this.field1135 = arg1;
    }
}
