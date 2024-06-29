import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class class42 {

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "Z")
    private boolean field998;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "Z")
    private boolean field1011;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field1006 = 0;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "Lge;")
    public static class47 field1001 = new class47(64);

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "Lr;")
    public static class118 field1013 = class153.method1136(89, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "[I")
    public static int[] field1015 = new int[500];

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "Lr;")
    public static class118 field1017 = class153.method1136(81, "Clientscript error in: ");

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "Lr;")
    public static class118 field1014 = class153.method1136(97, "Cabbage");

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    private int field978;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "Laa;")
    private class2 field1000;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "Z")
    public static boolean field1016;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "[I")
    public int[] field1007;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "[I")
    public int[] field1019;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
    public static int[] field974;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "[I")
    public int[] field975;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "[I")
    private int[] field976;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "[I")
    private int[] field979;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "[Laa;")
    private class2[] field995;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field994;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "[[I")
    private int[][] field1002;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "[[I")
    private int[][] field1003;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field992;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)Z")
    public final boolean method335(byte arg0) {
        field1010++;
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field976.length; var3++) {
            int var4 = this.field976[var3];
            if (this.field994[var4] == null) {
                this.method338((byte) 105, var4);
                if (this.field994[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 != -20) {
            this.method352(53, 43);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public final void method336(int arg0) {
        for (int var2 = arg0; var2 < this.field992.length; var2++) {
            if (this.field992[var2] != null) {
                for (int var3 = 0; var3 < this.field992[var2].length; var3++) {
                    this.field992[var2][var3] = null;
                }
            }
        }
        field1008++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[B")
    public final byte[] method337(int arg0, int arg1) {
        field983++;
        if (arg1 > -65) {
            this.method354(null, null, 10);
        }
        if (this.field992.length == 1) {
            return this.method358(0, (byte) -121, arg0);
        } else if (this.field992[arg0].length == 1) {
            return this.method358(arg0, (byte) 117, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)V")
    public void method338(byte arg0, int arg1) {
        field993++;
        int var3 = 96 / ((arg0 - 54) / 42);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lr;Lr;I)[B")
    public final byte[] method339(class118 arg0, class118 arg1, int arg2) {
        field986++;
        class118 var4 = arg0.method913((byte) -89);
        class118 var5 = arg1.method913((byte) -76);
        int var6 = this.field1000.method10((byte) -88, var4.method904((byte) -58));
        int var7 = this.field995[var6].method10((byte) -108, var5.method904((byte) -58));
        if (arg2 != -2) {
            field1015 = null;
        }
        return this.method350(var6, -105, var7);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(BI)V")
    public final void method340(byte arg0, int arg1) {
        for (int var3 = 0; var3 < this.field992[arg1].length; var3++) {
            this.field992[arg1][var3] = null;
        }
        if (arg0 != 2) {
            field974 = null;
        }
        field1018++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[II)Z")
    private final boolean method341(int arg0, int[] arg1, int arg2) {
        field984++;
        if (this.field994[arg0] == null) {
            return false;
        }
        int[] var4 = this.field1003[arg0];
        int var5 = this.field1019[arg0];
        boolean var6 = true;
        Object[] var7 = this.field992[arg0];
        for (int var8 = 0; var8 < var5; var8++) {
            if (var7[var4[var8]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var9;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var9 = class44.method365(21071, this.field994[arg0], false);
        } else {
            var9 = class44.method365(arg2 + 21070, this.field994[arg0], true);
            class105 var10 = new class105(var9);
            var10.method802(arg1, 5, 82, var10.field2405.length);
        }
        byte[] var11;
        try {
            var11 = class39.method329(var9, arg2 + 2282);
        } catch (RuntimeException var28) {
            throw class33.method280(var28, "T3 - " + (arg1 != null) + "," + arg0 + "," + var9.length + "," + class65.method566(var9.length, true, var9) + "," + class65.method566(var9.length - 2, true, var9) + "," + this.field975[arg0] + "," + this.field1005);
        }
        if (this.field1011) {
            this.field994[arg0] = null;
        }
        if (var5 > arg2) {
            int var13 = var11.length;
            int[] var14 = new int[var5];
            int var29 = var13 - 1;
            int var15 = var11[var29] & 0xFF;
            int var16 = var29 - var5 * 4 * var15;
            class105 var17 = new class105(var11);
            var17.field2404 = var16;
            for (int var18 = 0; var18 < var15; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var5; var20++) {
                    var19 += var17.method821((byte) 121);
                    var14[var20] += var19;
                }
            }
            byte[][] var21 = new byte[var5][];
            for (int var22 = 0; var22 < var5; var22++) {
                var21[var22] = new byte[var14[var22]];
                var14[var22] = 0;
            }
            var17.field2404 = var16;
            int var23 = 0;
            for (int var24 = 0; var24 < var15; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var5; var26++) {
                    var25 += var17.method821((byte) 105);
                    class57.method504(var11, var23, var21[var26], var14[var26], var25);
                    var14[var26] += var25;
                    var23 += var25;
                }
            }
            for (int var27 = 0; var27 < var5; var27++) {
                if (this.field998) {
                    var7[var4[var27]] = var21[var27];
                } else {
                    var7[var4[var27]] = class43.method362(var21[var27], false, false);
                }
            }
        } else if (this.field998) {
            var7[var4[0]] = var11;
        } else {
            var7[var4[0]] = class43.method362(var11, false, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[II)[B")
    public final byte[] method342(int arg0, int arg1, int[] arg2, int arg3) {
        field990++;
        if (arg1 < 0 || arg1 >= this.field992.length || this.field992[arg1] == null || arg0 < 0 || this.field992[arg1].length <= arg0) {
            return null;
        }
        if (this.field992[arg1][arg0] == null) {
            boolean var5 = this.method341(arg1, arg2, 1);
            if (!var5) {
                this.method338((byte) 9, arg1);
                boolean var6 = this.method341(arg1, arg2, 1);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg3 != -1) {
            this.field979 = null;
        }
        byte[] var7 = class44.method365(21071, this.field992[arg1][arg0], false);
        if (this.field998) {
            this.field992[arg1][arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(BI)I")
    public final int method343(byte arg0, int arg1) {
        if (arg0 < 86) {
            return -82;
        } else {
            field999++;
            return this.field992[arg1].length;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lr;I)V")
    public final void method344(class118 arg0, int arg1) {
        field981++;
        class118 var3 = arg0.method913((byte) -107);
        int var4 = this.field1000.method10((byte) -124, var3.method904((byte) -58));
        if (var4 >= 0) {
            this.method348(var4, (byte) -87);
            if (arg1 != 1) {
                this.method358(-55, (byte) 35, 82);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(BI)Z")
    public final boolean method345(byte arg0, int arg1) {
        field982++;
        if (this.field994[arg1] != null) {
            return true;
        }
        this.method338((byte) 127, arg1);
        if (this.field994[arg1] == null) {
            return arg0 >= -60;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)[B")
    public final byte[] method346(int arg0, int arg1) {
        field991++;
        if (arg0 != -1) {
            this.method356(null, -20);
        }
        if (this.field992.length == 1) {
            return this.method350(0, -16, arg1);
        } else if (this.field992[arg1].length == 1) {
            return this.method350(arg1, arg0 ^ 0x3D, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)I")
    public static final int method347(int arg0, int arg1, int arg2, int arg3) {
        field977++;
        int var4 = arg0 / arg1;
        int var5 = arg1 - 1 & arg0;
        if (arg2 <= 85) {
            method347(21, -55, -18, -84);
        }
        int var6 = arg1 - 1 & arg3;
        int var7 = arg3 / arg1;
        int var8 = class48.method407(var7, var4, -15508);
        int var9 = class48.method407(var7, var4 + 1, -15508);
        int var10 = class48.method407(var7 + 1, var4, -15508);
        int var11 = class48.method407(var7 + 1, var4 + 1, -15508);
        int var12 = class128.method992(var5, (byte) 109, var9, arg1, var8);
        int var13 = class128.method992(var5, (byte) 120, var11, arg1, var10);
        return class128.method992(var6, (byte) 100, var13, arg1, var12);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V")
    public void method348(int arg0, byte arg1) {
        field980++;
        if (arg1 > -85) {
            field1016 = true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public static void method349(int arg0) {
        field1014 = null;
        field974 = null;
        field1001 = null;
        field1013 = null;
        if (arg0 != -1) {
            method349(-27);
        }
        field1015 = null;
        field1017 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)[B")
    public final byte[] method350(int arg0, int arg1, int arg2) {
        field1004++;
        return arg1 >= -15 ? null : this.method342(arg2, arg0, null, -1);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILr;I)I")
    public final int method351(int arg0, class118 arg1, int arg2) {
        if (arg0 != 5) {
            this.field979 = null;
        }
        class118 var4 = arg1.method913((byte) -119);
        field1009++;
        return this.field995[arg2].method10((byte) -44, var4.method904((byte) -58));
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)[I")
    public final int[] method352(int arg0, int arg1) {
        if (arg1 <= 2) {
            this.method344(null, -25);
        }
        field988++;
        return this.field1003[arg0];
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)Z")
    public final boolean method353(int arg0, int arg1, int arg2) {
        field973++;
        if (arg1 < ~arg0 || this.field992.length <= arg0 || this.field992[arg0] == null || arg2 < 0 || arg2 >= this.field992[arg0].length) {
            return false;
        } else if (this.field992[arg0][arg2] != null) {
            return true;
        } else if (this.field994[arg0] == null) {
            this.method338((byte) 124, arg0);
            return this.field994[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lr;Lr;I)Z")
    public final boolean method354(class118 arg0, class118 arg1, int arg2) {
        field989++;
        class118 var4 = arg1.method913((byte) -127);
        class118 var5 = arg0.method913((byte) 37);
        int var6 = this.field1000.method10((byte) -110, var4.method904((byte) -58));
        int var7 = this.field995[var6].method10((byte) -45, var5.method904((byte) -58));
        int var8 = -90 % ((arg2 + 35) / 50);
        return this.method353(var6, -1, var7);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([BB)V")
    public final void method355(byte[] arg0, byte arg1) {
        this.field1005 = class65.method566(arg0.length, true, arg0);
        field1012++;
        class105 var3 = new class105(class39.method329(arg0, 2283));
        if (arg1 > -33) {
            return;
        }
        int var4 = var3.method831((byte) 76);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method821((byte) 101);
        }
        int var5 = var3.method831((byte) 76);
        int var6 = 0;
        int var7 = -1;
        this.field978 = var3.method838((byte) 5);
        this.field976 = new int[this.field978];
        for (int var8 = 0; var8 < this.field978; var8++) {
            this.field976[var8] = var6 += var3.method838((byte) 5);
            if (this.field976[var8] > var7) {
                var7 = this.field976[var8];
            }
        }
        this.field992 = new Object[var7 + 1][];
        this.field1003 = new int[var7 + 1][];
        this.field975 = new int[var7 + 1];
        this.field1019 = new int[var7 + 1];
        this.field994 = new Object[var7 + 1];
        this.field1007 = new int[var7 + 1];
        if (var5 != 0) {
            this.field979 = new int[var7 + 1];
            for (int var9 = 0; var9 < var7 + 1; var9++) {
                this.field979[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field978; var10++) {
                this.field979[this.field976[var10]] = var3.method821((byte) 72);
            }
            this.field1000 = new class2(this.field979);
        }
        for (int var11 = 0; var11 < this.field978; var11++) {
            this.field975[this.field976[var11]] = var3.method821((byte) 61);
        }
        for (int var12 = 0; var12 < this.field978; var12++) {
            this.field1007[this.field976[var12]] = var3.method821((byte) 51);
        }
        for (int var13 = 0; var13 < this.field978; var13++) {
            this.field1019[this.field976[var13]] = var3.method838((byte) 5);
        }
        for (int var14 = 0; var14 < this.field978; var14++) {
            int var20 = 0;
            int var21 = this.field976[var14];
            int var22 = this.field1019[var21];
            int var23 = -1;
            this.field1003[var21] = new int[var22];
            for (int var24 = 0; var24 < var22; var24++) {
                int var25 = this.field1003[var21][var24] = var20 += var3.method838((byte) 5);
                if (var25 > var23) {
                    var23 = var25;
                }
            }
            this.field992[var21] = new Object[var23 + 1];
        }
        if (var5 == 0) {
            return;
        }
        this.field995 = new class2[var7 + 1];
        this.field1002 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field978; var15++) {
            int var16 = this.field976[var15];
            int var17 = this.field1019[var16];
            this.field1002[var16] = new int[this.field992[var16].length];
            for (int var18 = 0; var18 < this.field992[var16].length; var18++) {
                this.field1002[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                this.field1002[var16][this.field1003[var16][var19]] = var3.method821((byte) 95);
            }
            this.field995[var16] = new class2(this.field1002[var16]);
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lr;I)I")
    public final int method356(class118 arg0, int arg1) {
        if (arg1 != 0) {
            this.field1005 = -91;
        }
        field985++;
        class118 var3 = arg0.method913((byte) 42);
        return this.field1000.method10((byte) -128, var3.method904((byte) -58));
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)I")
    public final int method357(boolean arg0) {
        if (arg0) {
            field997++;
            return this.field992.length;
        } else {
            return 58;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBI)[B")
    public final byte[] method358(int arg0, byte arg1, int arg2) {
        field987++;
        if (arg0 < 0 || arg0 >= this.field992.length || this.field992[arg0] == null || arg2 < 0 || this.field992[arg0].length <= arg2) {
            return null;
        }
        if (this.field992[arg0][arg2] == null) {
            boolean var4 = this.method341(arg0, null, 1);
            if (!var4) {
                this.method338((byte) -16, arg0);
                boolean var5 = this.method341(arg0, null, 1);
                if (!var5) {
                    return null;
                }
            }
        }
        int var6 = 17 % ((-arg1 - 54) / 55);
        return class44.method365(21071, this.field992[arg0][arg2], false);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(ZZ)V")
    public class42(boolean arg0, boolean arg1) {
        this.field998 = arg1;
        this.field1011 = arg0;
    }
}
