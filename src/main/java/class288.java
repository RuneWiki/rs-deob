import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class288 extends class396 {

    @OriginalMember(owner = "client!va", name = "u", descriptor = "[I")
    private int[] field4070;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "[I")
    private int[] field4067;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "Lik;")
    private class115 field4069;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "Lik;")
    private class115 field4073;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "Lik;")
    private class115 field4074;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "[Lik;")
    private class115[] field4076;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "[I")
    public static int[] field4077 = new int[5];

    @OriginalMember(owner = "client!va", name = "v", descriptor = "Lbn;")
    public static class257 field4071 = new class257();

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    public static int field4081 = 2;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lbm;ILra;)Z", line = 4)
    public final boolean method1831(class60 arg0, int arg1, class57 arg2) {
        field4079++;
        if (class115.field1353 <= 0) {
            for (int var4 = 0; var4 < this.field4067.length; var4++) {
                if (!arg2.method345(arg1 ^ 0xF7, this.field4067[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4067.length; var5++) {
                if (!arg2.method355(this.field4067[var5], class115.field1353, arg1 - 4259)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field4070.length; var6++) {
            if (!arg0.method369(this.field4070[var6], (byte) -100)) {
                return false;
            }
        }
        if (arg1 != 246) {
            field4081 = 102;
        }
        return true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIZLbm;Lra;)[F", line = 67)
    public final float[] method1832(int arg0, int arg1, int arg2, boolean arg3, class60 arg4, class57 arg5) {
        class59.field710 = arg5;
        field4068++;
        class16.field167 = arg4;
        for (int var7 = arg1; var7 < this.field4076.length; var7++) {
            this.field4076[var7].method634(arg2, arg0, (byte) -52);
        }
        class215.method1407(arg0, arg2, (byte) 20);
        float[] var8 = new float[arg0 * arg2 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4073.field1347) {
                int[] var12 = this.field4073.method57(var10, 0);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field4073.method144(var10, -8);
                var13 = var16[1];
                var14 = var16[2];
                var15 = var16[0];
            }
            int[] var17;
            if (this.field4074.field1347) {
                var17 = this.field4074.method57(var10, arg1);
            } else {
                var17 = this.field4074.method144(var10, arg1 - 128)[0];
            }
            int[] var18;
            if (this.field4069.field1347) {
                var18 = this.field4069.method57(var10, 0);
            } else {
                var18 = this.field4069.method144(var10, arg1 - 4)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field4076.length; var11++) {
            this.field4076[var11].method630(-118);
        }
        return var8;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(DIILbm;BZLra;)[I", line = 179)
    public final int[] method1833(double arg0, int arg1, int arg2, class60 arg3, byte arg4, boolean arg5, class57 arg6) {
        field4078++;
        class16.field167 = arg3;
        class59.field710 = arg6;
        for (int var9 = 0; var9 < this.field4076.length; var9++) {
            this.field4076[var9].method634(arg2, arg1, (byte) -52);
        }
        class206.method1307(arg0, 0);
        if (arg4 != 101) {
            this.field4076 = null;
        }
        class215.method1407(arg1, arg2, (byte) 84);
        int[] var10 = new int[arg2 * 4 * arg1];
        int var11 = 0;
        for (int var12 = 0; var12 < arg2; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4073.field1347) {
                int[] var18 = this.field4073.method57(var12, arg4 - 101);
                var15 = var18;
                var16 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field4073.method144(var12, -125);
                var15 = var14[1];
                var16 = var14[0];
                var17 = var14[2];
            }
            if (arg5) {
                var11 = var12;
            }
            int[] var19;
            if (this.field4074.field1347) {
                var19 = this.field4074.method57(var12, arg4 - 101);
            } else {
                var19 = this.field4074.method144(var12, 86)[0];
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class323.field4552[var21];
                int var25 = class323.field4552[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class323.field4552[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var25 << 8) + (var27 << 24) + var26 + (var24 << 16);
                if (arg5) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field4076.length; var13++) {
            this.field4076[var13].method630(55);
        }
        return var10;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V", line = 318)
    public static void method1834(int arg0) {
        field4071 = null;
        field4077 = null;
        if (arg0 != 2130182632) {
            field4071 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 334)
    public static final String method1835(byte[] arg0, int arg1, int arg2, int arg3) {
        field4072++;
        char[] var4 = new char[arg1];
        int var5 = 49 / ((-arg3 - 20) / 44);
        int var6 = 0;
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg0[arg2 + var7] & 0xFF;
            if (var8 != 0) {
                if (var8 >= 128 && var8 < 160) {
                    char var9 = class330.field4713[var8 - 128];
                    if (var9 == '\u0000') {
                        var9 = '?';
                    }
                    var8 = var9;
                }
                var4[var6++] = (char) var8;
            }
        }
        return new String(var4, 0, var6);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 375)
    public class288() {
        this.field4070 = new int[0];
        this.field4067 = new int[0];
        this.field4069 = new class351(0);
        this.field4069.field1345 = 1;
        this.field4073 = new class351();
        this.field4073.field1345 = 1;
        this.field4074 = new class351();
        this.field4074.field1345 = 1;
        this.field4076 = new class115[] { this.field4073, this.field4074, this.field4069 };
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lbk;)V", line = 391)
    public class288(class211 arg0) {
        int var2 = arg0.method1342((byte) -126);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field4076 = new class115[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class115 var16 = class40.method252(arg0, 74);
            if (var16.method636(14257) >= 0) {
                var3++;
            }
            if (var16.method635(-73) >= 0) {
                var4++;
            }
            int var17 = var16.field1339.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1342((byte) -126);
            }
            this.field4076[var6] = var16;
        }
        this.field4067 = new int[var3];
        int var7 = 0;
        this.field4070 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class115 var11 = this.field4076[var9];
            int var12 = var11.field1339.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1339[var13] = this.field4076[var5[var9][var13]];
            }
            int var14 = var11.method636(14257);
            int var15 = var11.method635(-79);
            if (var14 > 0) {
                this.field4067[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4070[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4073 = this.field4076[arg0.method1342((byte) -128)];
        this.field4074 = this.field4076[arg0.method1342((byte) -128)];
        this.field4069 = this.field4076[arg0.method1342((byte) -128)];
        Object var10 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/lang/String;)I", line = 486)
    public static final int method1836(int arg0, String arg1) {
        field4082++;
        if (arg1 == null) {
            return -1;
        }
        if (arg0 != -7376) {
            method1834(-13);
        }
        for (int var2 = 0; var2 < class100.field1124; var2++) {
            if (arg1.equalsIgnoreCase(class302.field4300[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(DIBIZLbm;Lra;Z)[I", line = 513)
    public final int[] method1837(double arg0, int arg1, byte arg2, int arg3, boolean arg4, class60 arg5, class57 arg6, boolean arg7) {
        field4080++;
        class16.field167 = arg5;
        class59.field710 = arg6;
        for (int var10 = 0; var10 < this.field4076.length; var10++) {
            this.field4076[var10].method634(arg3, arg1, (byte) -52);
        }
        class206.method1307(arg0, 0);
        class215.method1407(arg1, arg3, (byte) 97);
        int[] var11 = new int[arg1 * arg3];
        int var12;
        byte var13;
        int var14;
        if (arg4) {
            var12 = arg1 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var13 = 1;
            var14 = arg1;
            var12 = 0;
        }
        int var15 = 0;
        if (arg2 < 46) {
            method1835((byte[]) null, 80, -80, -52);
        }
        for (int var16 = 0; var16 < arg3; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4073.field1347) {
                int[] var18 = this.field4073.method57(var16, 0);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field4073.method144(var16, -128);
                var20 = var22[1];
                var19 = var22[0];
                var21 = var22[2];
            }
            if (arg7) {
                var15 = var16;
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class323.field4552[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class323.field4552[var25];
                int var29 = class323.field4552[var26];
                int var30 = (var27 << 16) + ((var28 << 8) + var29);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4076.length; var17++) {
            this.field4076[var17].method630(-117);
        }
        return var11;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(CI)C", line = 648)
    public static final char method1838(char arg0, int arg1) {
        field4075++;
        if (arg1 != 110) {
            return (char) 65528;
        } else if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }
}
