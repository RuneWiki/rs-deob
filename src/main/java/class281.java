import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class281 {

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public int field4802 = -1;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Z")
    public boolean field4812 = false;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "[I")
    private int[] field4813 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "Z")
    public static boolean field4807 = false;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Z")
    public static boolean field4808 = false;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "Ljf;")
    public static class229 field4814 = class212.method1457((byte) 79, "welle2:");

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "Ljf;")
    private static class229 field4817 = class212.method1457((byte) 57, "Loading textures )2 ");

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public static int field4818 = 0;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "Ljf;")
    public static class229 field4806 = class212.method1457((byte) 79, "Liste des mises -9 jour charg-Be");

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Ljf;")
    public static class229 field4803 = field4817;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public static int field4822 = 3;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field4819 = 3353893;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "[I")
    private int[] field4796;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "[I")
    public static int[] field4824;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "[S")
    private short[] field4797;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "[S")
    private short[] field4798;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "[S")
    private short[] field4816;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "[S")
    private short[] field4820;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V", line = 5)
    public static void method1966(byte arg0) {
        field4806 = null;
        field4803 = null;
        field4814 = null;
        field4824 = null;
        if (arg0 != -57) {
            field4806 = (class229) null;
        }
        field4817 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILkh;)V", line = 24)
    private final void method1967(int arg0, int arg1, class14 arg2) {
        field4810++;
        if (arg0 == 1) {
            this.field4802 = arg2.method93(false);
        } else if (arg0 == 2) {
            int var8 = arg2.method93(false);
            this.field4796 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4796[var9] = arg2.method116(-1);
            }
        } else if (arg0 == 3) {
            this.field4812 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method93(false);
            this.field4820 = new short[var4];
            this.field4797 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4797[var5] = (short) arg2.method116(-1);
                this.field4820[var5] = (short) arg2.method116(-1);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method93(false);
            this.field4816 = new short[var6];
            this.field4798 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4798[var7] = (short) arg2.method116(-1);
                this.field4816[var7] = (short) arg2.method116(-1);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field4813[arg0 - 60] = arg2.method116(-1);
        }
        if (arg1 > -68) {
            this.field4813 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Z", line = 107)
    public final boolean method1968(int arg0) {
        field4809++;
        boolean var2 = true;
        if (arg0 != -23437) {
            field4817 = (class229) null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field4813[var3] != -1 && !class29.field513.method1276(0, -25658, this.field4813[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Z", line = 132)
    public final boolean method1969(int arg0) {
        field4800++;
        if (this.field4796 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != -20033) {
            this.method1969(21);
        }
        while (this.field4796.length > var3) {
            if (!class29.field513.method1276(0, -25658, this.field4796[var3])) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z[[[Llf;IIII)Z", line = 164)
    public static final boolean method1970(boolean arg0, class125[][][] arg1, int arg2, int arg3, int arg4, int arg5) {
        field4823++;
        byte var6 = arg0 ? 1 : (byte) (class295.field5049 & 0xFF);
        if (class288.field4933[class16.field254][arg3][arg5] == var6) {
            return false;
        } else if ((class142.field2464[class16.field254][arg3][arg5] & 0x4) == 0) {
            return false;
        } else if (arg4 == -4376) {
            byte var7 = 0;
            class185.field3224[var7] = arg3;
            int var31 = var7 + 1;
            class319.field5403[var7] = arg5;
            class288.field4933[class16.field254][arg3][arg5] = var6;
            int var8 = 0;
            while (var31 != var8) {
                int var9 = (class185.field3224[var8] & 0xFF5E26) >> 16;
                int var10 = class185.field3224[var8] & 0xFFFF;
                int var11 = class185.field3224[var8] >> 24 & 0xFF;
                int var12 = class319.field5403[var8] & 0xFFFF;
                boolean var13 = false;
                if ((class142.field2464[class16.field254][var10][var12] & 0x4) == 0) {
                    var13 = true;
                }
                int var14 = (class319.field5403[var8] & 0xFF2EB8) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                label242: for (int var16 = class16.field254 + 1; var16 <= 3; var16++) {
                    if ((class142.field2464[var16][var10][var12] & 0x8) == 0) {
                        if (var13 && arg1[var16][var10][var12] != null) {
                            if (arg1[var16][var10][var12].field2198 != null) {
                                int var17 = class141.method985(-2, var9);
                                if (arg1[var16][var10][var12].field2198.field2873 == var17 || arg1[var16][var10][var12].field2198.field2866 == var17) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var18 = class141.method985(-2, var11);
                                    if (arg1[var16][var10][var12].field2198.field2873 == var18 || arg1[var16][var10][var12].field2198.field2866 == var18) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var19 = class141.method985(-2, var14);
                                    if (arg1[var16][var10][var12].field2198.field2873 == var19 || arg1[var16][var10][var12].field2198.field2866 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var10][var12].field2204 != null) {
                                for (int var20 = 0; var20 < arg1[var16][var10][var12].field2201; var20++) {
                                    int var21 = (int) (arg1[var16][var10][var12].field2204[var20].field1814 >> 14 & 0x3FL);
                                    int var22 = (int) (arg1[var16][var10][var12].field2204[var20].field1814 >> 20 & 0x3L);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var23 = var21 | var22 << 6;
                                    if (var9 == var23 || var11 != 0 && var11 == var23 || var14 != 0 && var14 == var23) {
                                        continue label242;
                                    }
                                }
                            }
                        }
                        class125 var24 = arg1[var16][var10][var12];
                        var15 = true;
                        if (var24 != null && var24.field2201 > 0) {
                            for (int var25 = 0; var25 < var24.field2201; var25++) {
                                class104 var26 = var24.field2204[var25];
                                if (var26.field1802 != var26.field1800 || var26.field1812 != var26.field1791) {
                                    for (int var27 = var26.field1800; var27 <= var26.field1802; var27++) {
                                        for (int var28 = var26.field1791; var28 <= var26.field1812; var28++) {
                                            class288.field4933[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class288.field4933[var16][var10][var12] = var6;
                    }
                }
                if (var15) {
                    if (class132.field2328[class16.field254 + 1][var10][var12] > class90.field1644[arg2]) {
                        class90.field1644[arg2] = class132.field2328[class16.field254 + 1][var10][var12];
                    }
                    int var29 = var12 << 7;
                    int var30 = var10 << 7;
                    if (var30 < class186.field3255[arg2]) {
                        class186.field3255[arg2] = var30;
                    } else if (class303.field5145[arg2] < var30) {
                        class303.field5145[arg2] = var30;
                    }
                    if (class223.field3810[arg2] > var29) {
                        class223.field3810[arg2] = var29;
                    } else if (var29 > class81.field1483[arg2]) {
                        class81.field1483[arg2] = var29;
                    }
                }
                if (!var13) {
                    if (var10 >= 1 && class288.field4933[class16.field254][var10 - 1][var12] != var6) {
                        class185.field3224[var31] = class97.method665(-754974720, class97.method665(1179648, var10 - 1));
                        class319.field5403[var31] = class97.method665(1245184, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class288.field4933[class16.field254][var10 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if ((var10 - 1) >= 0 && class288.field4933[class16.field254][var10 - 1][var12] != var6 && (class142.field2464[class16.field254][var10][var12] & 0x4) == 0 && (class142.field2464[class16.field254][var10 - 1][var12 - 1] & 0x4) == 0) {
                            class185.field3224[var31] = class97.method665(1375731712, class97.method665(1179648, var10 - 1));
                            class319.field5403[var31] = class97.method665(var12, 1245184);
                            class288.field4933[class16.field254][var10 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class288.field4933[class16.field254][var10][var12] != var6) {
                            class185.field3224[var31] = class97.method665(class97.method665(var10, 5373952), 318767104);
                            class319.field5403[var31] = class97.method665(5439488, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class288.field4933[class16.field254][var10][var12] = var6;
                        }
                        if (var10 + 1 < 104 && class288.field4933[class16.field254][var10 + 1][var12] != var6 && (class142.field2464[class16.field254][var10][var12] & 0x4) == 0 && (class142.field2464[class16.field254][var10 + 1][var12 - 1] & 0x4) == 0) {
                            class185.field3224[var31] = class97.method665(-1845493760, class97.method665(var10 + 1, 5373952));
                            class319.field5403[var31] = class97.method665(5439488, var12);
                            class288.field4933[class16.field254][var10 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (var10 + 1 < 104 && class288.field4933[class16.field254][var10 + 1][var12] != var6) {
                        class185.field3224[var31] = class97.method665(1392508928, class97.method665(9568256, var10 + 1));
                        class319.field5403[var31] = class97.method665(9633792, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class288.field4933[class16.field254][var10 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var10 - 1 >= 0 && class288.field4933[class16.field254][var10 - 1][var12] != var6 && (class142.field2464[class16.field254][var10][var12] & 0x4) == 0 && (class142.field2464[class16.field254][var10 - 1][var12 + 1] & 0x4) == 0) {
                            class185.field3224[var31] = class97.method665(301989888, class97.method665(13762560, var10 - 1));
                            class319.field5403[var31] = class97.method665(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class288.field4933[class16.field254][var10 - 1][var12] = var6;
                        }
                        if (class288.field4933[class16.field254][var10][var12] != var6) {
                            class185.field3224[var31] = class97.method665(-1828716544, class97.method665(var10, 13762560));
                            class319.field5403[var31] = class97.method665(var12, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class288.field4933[class16.field254][var10][var12] = var6;
                        }
                        if (var10 + 1 < 104 && class288.field4933[class16.field254][var10 + 1][var12] != var6 && (class142.field2464[class16.field254][var10][var12] & 0x4) == 0 && (class142.field2464[class16.field254][var10 + 1][var12 + 1] & 0x4) == 0) {
                            class185.field3224[var31] = class97.method665(class97.method665(9568256, var10 + 1), -771751936);
                            class319.field5403[var31] = class97.method665(var12, 9633792);
                            var31 = var31 + 1 & 0xFFF;
                            class288.field4933[class16.field254][var10 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class90.field1644[arg2] != -1000000) {
                class90.field1644[arg2] += 10;
                class186.field3255[arg2] -= 50;
                class303.field5145[arg2] += 50;
                class81.field1483[arg2] += 50;
                class223.field3810[arg2] -= 50;
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLnf;)Lnf;", line = 472)
    public static final class67 method1971(byte arg0, class67 arg1) {
        field4815++;
        if (arg0 < 9) {
            method1970(true, (class125[][][]) ((class125[][][]) null), -8, 105, 114, -9);
        }
        class67 var2 = client.method1828(arg1);
        if (var2 == null) {
            var2 = arg1.field1169;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLkh;)V", line = 496)
    public final void method1972(byte arg0, class14 arg1) {
        while (true) {
            int var3 = arg1.method93(false);
            if (var3 == 0) {
                field4801++;
                if (arg0 != 87) {
                    method1971((byte) 65, (class67) null);
                }
                return;
            }
            this.method1967(var3, -123, arg1);
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)Lei;", line = 531)
    public final class197 method1973(int arg0) {
        field4821++;
        int var2 = -31 / ((arg0 - 19) / 52);
        class197[] var3 = new class197[5];
        int var4 = 0;
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field4813[var5] != -1) {
                var3[var4++] = class197.method1356(class29.field513, this.field4813[var5], 0);
            }
        }
        class197 var6 = new class197(var3, var4);
        if (this.field4797 != null) {
            for (int var7 = 0; var7 < this.field4797.length; var7++) {
                var6.method1359(this.field4797[var7], this.field4820[var7]);
            }
        }
        if (this.field4798 != null) {
            for (int var8 = 0; var8 < this.field4798.length; var8++) {
                var6.method1368(this.field4798[var8], this.field4816[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)Lei;", line = 589)
    public final class197 method1974(int arg0) {
        field4805++;
        if (this.field4796 == null) {
            return null;
        }
        class197[] var2 = new class197[this.field4796.length];
        for (int var3 = arg0; var3 < this.field4796.length; var3++) {
            var2[var3] = class197.method1356(class29.field513, this.field4796[var3], 0);
        }
        class197 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class197(var2, var2.length);
        }
        if (this.field4797 != null) {
            for (int var5 = 0; var5 < this.field4797.length; var5++) {
                var4.method1359(this.field4797[var5], this.field4820[var5]);
            }
        }
        if (this.field4798 != null) {
            for (int var6 = 0; var6 < this.field4798.length; var6++) {
                var4.method1368(this.field4798[var6], this.field4816[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V", line = 670)
    public static final void method1975(byte arg0) {
        class147.field2548 = null;
        class226.field3861 = null;
        class19.field293 = null;
        class83.field1600 = null;
        class146.field2543 = null;
        class76.field1422 = null;
        if (arg0 != 118) {
            return;
        }
        class232.field4034 = null;
        class104.field1797 = null;
        class319.field5405 = null;
        class320.field5416 = null;
        class144.field2502 = null;
        class83.field1597 = null;
        class152.field2625 = null;
        class217.field3734 = null;
        class44.field796 = null;
        class211.field3636 = null;
        class97.field1716 = null;
        class15.field220 = null;
        field4825++;
        class84.field1612 = null;
        class305.field5169 = null;
        class323.field5450 = null;
        class249.field4385 = null;
        class124.field2182 = null;
    }
}
