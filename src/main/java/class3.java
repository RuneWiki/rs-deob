import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 {

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Lqd;")
    public static class40 field27 = null;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Lqd;")
    public static class40 field29 = class147.method1106("<col=00ff00>", (byte) -120);

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "[Lqd;")
    public static class40[] field37 = new class40[500];

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Lqd;")
    public static class40 field38 = class147.method1106("Bitte warten Sie)3)3)3", (byte) -128);

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "Lrk;")
    public class168 field47;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "[I")
    public int[] field25;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "[I")
    public int[] field30;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "[I")
    public int[] field36;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "[I")
    public int[] field39;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "[I")
    public int[] field44;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "[I")
    public int[] field45;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "[Lda;")
    public static class114[] field46;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "[Lrk;")
    public class168[] field41;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "[[I")
    public int[][] field23;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "[[I")
    public int[][] field42;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V", line = 14)
    public static void method9(boolean arg0) {
        if (arg0) {
            field27 = (class40) null;
        }
        field38 = null;
        field27 = null;
        field29 = null;
        field37 = null;
        field46 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Ldb;", line = 28)
    public static final class177 method10(int arg0) {
        field35++;
        class177 var1 = (class177) class218.field3634.method49((byte) 122);
        if (var1 != null) {
            var1.method2095(0);
            var1.method921(2);
            return var1;
        } else if (arg0 >= -61) {
            return (class177) null;
        } else {
            class177 var2;
            do {
                var2 = (class177) class222.field3683.method49((byte) 126);
                if (var2 == null) {
                    return null;
                }
                if (var2.method1309((byte) -116) > class69.method535(true)) {
                    return null;
                }
                var2.method2095(0);
                var2.method921(2);
            } while ((Long.MIN_VALUE & var2.field2112) == 0L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V", line = 84)
    public static final void method11(int arg0, int arg1) {
        if (arg1 > 28) {
            field28++;
            class2.field16.method1348(0, arg0);
            class83.field1437.method1348(0, arg0);
            class158.field2642.method1348(0, arg0);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)Z", line = 97)
    public static final boolean method12(byte arg0) {
        field40++;
        if (class315.field5319) {
            try {
                return !(Boolean) class296.field4954.method368(class275.field4573.field1876, (byte) -86);
            } catch (Throwable var2) {
            }
        }
        return arg0 < -2;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[B)V", line = 119)
    private final void method13(byte arg0, byte[] arg1) {
        field43++;
        class26 var3 = new class26(class239.method1671(0, arg1));
        int var4 = var3.method226(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field26 = var3.method203(-22066);
        } else {
            this.field26 = 0;
        }
        int var5 = var3.method226(255);
        int var6 = 0;
        this.field33 = var3.method197(-1);
        int var7 = -1;
        this.field36 = new int[this.field33];
        for (int var8 = 0; var8 < this.field33; var8++) {
            this.field36[var8] = var6 += var3.method197(-1);
            if (this.field36[var8] > var7) {
                var7 = this.field36[var8];
            }
        }
        this.field24 = var7 + 1;
        this.field25 = new int[this.field24];
        this.field39 = new int[this.field24];
        this.field23 = new int[this.field24][];
        this.field30 = new int[this.field24];
        this.field44 = new int[this.field24];
        if (var5 != 0) {
            this.field45 = new int[this.field24];
            for (int var9 = 0; var9 < this.field24; var9++) {
                this.field45[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field33; var10++) {
                this.field45[this.field36[var10]] = var3.method203(-22066);
            }
            this.field47 = new class168(this.field45);
        }
        for (int var11 = 0; var11 < this.field33; var11++) {
            this.field39[this.field36[var11]] = var3.method203(-22066);
        }
        for (int var12 = 0; var12 < this.field33; var12++) {
            this.field30[this.field36[var12]] = var3.method203(-22066);
        }
        for (int var13 = 0; var13 < this.field33; var13++) {
            this.field44[this.field36[var13]] = var3.method197(-1);
        }
        for (int var14 = 0; var14 < this.field33; var14++) {
            int var15 = 0;
            int var16 = this.field36[var14];
            int var17 = -1;
            int var18 = this.field44[var16];
            this.field23[var16] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field23[var16][var19] = var15 += var3.method197(-1);
                if (var17 < var20) {
                    var17 = var20;
                }
            }
            this.field25[var16] = var17 + 1;
            if ((var17 + 1) == var18) {
                this.field23[var16] = null;
            }
        }
        if (var5 != 0) {
            this.field41 = new class168[var7 + 1];
            this.field42 = new int[var7 + 1][];
            for (int var21 = 0; var21 < this.field33; var21++) {
                int var22 = this.field36[var21];
                int var23 = this.field44[var22];
                this.field42[var22] = new int[this.field25[var22]];
                for (int var24 = 0; var24 < this.field25[var22]; var24++) {
                    this.field42[var22][var24] = -1;
                }
                for (int var25 = 0; var25 < var23; var25++) {
                    int var26;
                    if (this.field23[var22] == null) {
                        var26 = var25;
                    } else {
                        var26 = this.field23[var22][var25];
                    }
                    this.field42[var22][var26] = var3.method203(-22066);
                }
                this.field41[var22] = new class168(this.field42[var22]);
            }
        }
        int var27 = 99 / ((arg0 - 48) / 57);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([BIIZI[Lm;IIIII)V", line = 294)
    public static final void method14(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4, class44[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class26 var11 = new class26(arg0);
        field34++;
        if (arg7 < 104) {
            method15(21, (byte) 16);
        }
        int var12 = -1;
        while (true) {
            int var13 = var11.method199(false);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method195((byte) 120);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = (var14 & 0xFE0) >> 6;
                int var17 = var14 & 0x3F;
                int var18 = var11.method226(255);
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                int var21 = var14 >> 12;
                if (arg2 == var21 && arg1 <= var16 && (arg1 + 8) > var16 && arg8 <= var17 && (arg8 + 8) > var17) {
                    class27 var22 = class72.method540(0, var12);
                    int var23 = arg9 + class307.method2096(var17 & 0x7, var22.field519, arg4, (byte) 12, var20, var16 & 0x7, var22.field568);
                    int var24 = arg6 + class68.method534(var22.field568, arg4, -66, var20, var17 & 0x7, var22.field519, var16 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class44 var25 = null;
                        if (!arg3) {
                            int var26 = arg10;
                            if ((class274.field4564[1][var23][var24] & 0x2) == 2) {
                                var26 = arg10 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg5[var26];
                            }
                        }
                        class58.method494(!arg3, var24, arg3, arg4 + var20 & 0x3, var23, arg10, var19, arg10, var25, (byte) 122, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V", line = 377)
    public static final void method15(int arg0, byte arg1) {
        field48++;
        class164 var2 = (class164) class48.field934.method1405((byte) 115, (long) arg0);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg1 > -103) {
            method15(-92, (byte) -47);
        }
        while (var3 < var2.field2717.length) {
            var2.field2717[var3] = -1;
            var2.field2725[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([BI)V", line = 418)
    public class3(byte[] arg0, int arg1) {
        this.field32 = class31.method282(arg0.length, arg0, true);
        if (this.field32 != arg1) {
            throw new RuntimeException();
        }
        this.method13((byte) 108, arg0);
    }
}
