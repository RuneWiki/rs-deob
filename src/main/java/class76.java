import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class76 {

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "[S")
    public static short[] field1075 = new short[256];

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "Ljo;")
    public class353 field1072;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "[I")
    public static int[] field1067;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "[I")
    public int[] field1080;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "[I")
    public int[] field1081;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "[I")
    public int[] field1083;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "[I")
    public int[] field1084;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "[I")
    public int[] field1085;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "[I")
    public int[] field1086;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "[Ljo;")
    public class353[] field1069;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "[S")
    public static short[] field1071;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "[[I")
    public int[][] field1070;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "[[I")
    public int[][] field1074;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V", line = 15)
    public static void method646(byte arg0) {
        if (arg0 > -1) {
            field1082 = -71;
        }
        field1067 = null;
        field1075 = null;
        field1071 = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B[B)V", line = 28)
    private final void method647(byte arg0, byte[] arg1) {
        field1066++;
        int var3 = 15 / ((arg0 + 73) / 48);
        class446 var4 = new class446(class229.method1503(arg1, 0));
        int var5 = var4.method2628(49152);
        if (var5 != 5 && var5 != 6) {
            throw new RuntimeException();
        }
        if (var5 >= 6) {
            this.field1078 = var4.method2604(112);
        } else {
            this.field1078 = 0;
        }
        int var6 = var4.method2628(49152);
        this.field1076 = var4.method2631(2530);
        int var7 = 0;
        this.field1086 = new int[this.field1076];
        int var8 = -1;
        for (int var9 = 0; var9 < this.field1076; var9++) {
            this.field1086[var9] = var7 += var4.method2631(2530);
            if (this.field1086[var9] > var8) {
                var8 = this.field1086[var9];
            }
        }
        this.field1077 = var8 + 1;
        this.field1074 = new int[this.field1077][];
        this.field1085 = new int[this.field1077];
        this.field1084 = new int[this.field1077];
        this.field1080 = new int[this.field1077];
        this.field1081 = new int[this.field1077];
        if (var6 != 0) {
            this.field1083 = new int[this.field1077];
            for (int var10 = 0; var10 < this.field1077; var10++) {
                this.field1083[var10] = -1;
            }
            for (int var11 = 0; var11 < this.field1076; var11++) {
                this.field1083[this.field1086[var11]] = var4.method2604(-118);
            }
            this.field1072 = new class353(this.field1083);
        }
        for (int var12 = 0; var12 < this.field1076; var12++) {
            this.field1081[this.field1086[var12]] = var4.method2604(-110);
        }
        for (int var13 = 0; var13 < this.field1076; var13++) {
            this.field1080[this.field1086[var13]] = var4.method2604(-124);
        }
        for (int var14 = 0; var14 < this.field1076; var14++) {
            this.field1084[this.field1086[var14]] = var4.method2631(2530);
        }
        for (int var15 = 0; var15 < this.field1076; var15++) {
            int var22 = this.field1086[var15];
            int var23 = this.field1084[var22];
            int var24 = 0;
            int var25 = -1;
            this.field1074[var22] = new int[var23];
            for (int var26 = 0; var26 < var23; var26++) {
                int var27 = this.field1074[var22][var26] = var24 += var4.method2631(2530);
                if (var27 > var25) {
                    var25 = var27;
                }
            }
            this.field1085[var22] = var25 + 1;
            if (var25 + 1 == var23) {
                this.field1074[var22] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field1069 = new class353[var8 + 1];
        this.field1070 = new int[var8 + 1][];
        for (int var16 = 0; var16 < this.field1076; var16++) {
            int var17 = this.field1086[var16];
            int var18 = this.field1084[var17];
            this.field1070[var17] = new int[this.field1085[var17]];
            for (int var19 = 0; var19 < this.field1085[var17]; var19++) {
                this.field1070[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field1074[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field1074[var17][var20];
                }
                this.field1070[var17][var21] = var4.method2604(81);
            }
            this.field1069[var17] = new class353(this.field1070[var17]);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)I", line = 196)
    public static int method648(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V", line = 205)
    public static final void method649(byte arg0) {
        field1068++;
        if (class81.field1140 != null) {
            return;
        }
        class81.field1140 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var9 = var8;
                    var10 = var18;
                } else if (var14 == 1) {
                    var11 = var16;
                    var9 = var17;
                    var10 = var8;
                } else if (var14 == 2) {
                    var11 = var18;
                    var9 = var16;
                    var10 = var8;
                } else if (var14 == 3) {
                    var11 = var8;
                    var9 = var16;
                    var10 = var17;
                } else if (var14 == 4) {
                    var11 = var8;
                    var9 = var18;
                    var10 = var16;
                } else if (var14 == 5) {
                    var9 = var8;
                    var10 = var16;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = var24 - (-(var22 << 16) - (var23 << 8)) - 16777216;
                class81.field1140[var3++] = var25;
            }
        }
        if (arg0 != 21) {
            field1071 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BIIIZ)V", line = 332)
    public static final void method650(byte arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class467.field6576 = 0L;
        int var5 = -27 % ((arg0 - 46) / 41);
        field1073++;
        int var6 = class419.method2487((byte) -108);
        if (arg2 == 3 || var6 == 3) {
            arg4 = true;
        }
        if (!class138.field1976.method495()) {
            arg4 = true;
        }
        class99.method764(var6, arg3, arg2, arg1, arg4, -103);
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "([BI)V", line = 355)
    public class76(byte[] arg0, int arg1) {
        this.field1079 = class350.method2158(102, arg0.length, arg0);
        if (this.field1079 != arg1) {
            throw new RuntimeException();
        }
        this.method647((byte) -123, arg0);
    }
}
