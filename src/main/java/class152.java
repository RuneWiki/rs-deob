import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class152 extends class120 {

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public int field2259;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public int field2252;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "[I")
    public int[] field2263;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "[I")
    public int[] field2261;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "[Z")
    public boolean[] field2250;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "[[I")
    public int[][] field2258;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field2251 = 0;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field2256 = 0;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2260 = "M";

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "Ldl;")
    public static class123 field2249;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "Ldl;")
    public static class123 field2262;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V")
    public static final void method1010(int arg0) {
        int var1 = class50.field658.length;
        field2254++;
        for (int var2 = arg0; var2 < var1; var2++) {
            if (class50.field658[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class158.field2436; var4++) {
                    if (class246.field3946[var4] == class154.field2295[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class246.field3946[class158.field2436] = class154.field2295[var2];
                    var3 = class158.field2436++;
                }
                class25 var5 = new class25(class50.field658[var2]);
                int var6 = 0;
                while (class50.field658[var2].length > var5.field349 && var6 < 511) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method190(-3);
                    int var9 = var8 & 0x3F;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 >> 14;
                    int var12 = (class154.field2295[var2] & 0xFF) * 64 + var9 - class246.field3943;
                    int var13 = (class154.field2295[var2] >> 8) * 64 + var10 - class126.field1869;
                    class136 var14 = class252.method1691(var5.method190(-3), (byte) -128);
                    if (class100.field1566[var7] == null && (var14.field2032 & 0x1) > 0 && class104.field1610 == var11 && var13 >= 0 && (var14.field2012 + var13) < 104 && var12 >= 0 && var12 + var14.field2012 < 104) {
                        class100.field1566[var7] = new class56();
                        class56 var15 = class100.field1566[var7];
                        class248.field3967[class236.field3774++] = var7;
                        var15.field1210 = class111.field1684;
                        var15.method411(var14, true);
                        var15.method576(var15.field793.field2012, -122);
                        var15.field1211 = var15.field1222 = class3.field36[var15.field793.field2000];
                        var15.field1203 = var15.field793.field2011;
                        var15.field1289 = var15.field793.field1986;
                        if (var15.field1289 == 0) {
                            var15.field1222 = 0;
                        }
                        var15.method566(true, var13, var12, var15.method565((byte) 0), true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B[B)V")
    public static final void method1011(byte arg0, byte[] arg1) {
        field2255++;
        class25 var2 = new class25(arg1);
        if (arg0 <= 3) {
            return;
        }
        var2.field349 = arg1.length - 2;
        class35.field454 = var2.method190(-3);
        class101.field1574 = new byte[class35.field454][];
        class226.field3653 = new int[class35.field454];
        class228.field3696 = new int[class35.field454];
        class236.field3777 = new int[class35.field454];
        class80.field1148 = new boolean[class35.field454];
        class37.field496 = new byte[class35.field454][];
        class206.field3221 = new int[class35.field454];
        var2.field349 = arg1.length - class35.field454 * 8 - 7;
        class46.field583 = var2.method190(-3);
        class209.field3253 = var2.method190(-3);
        int var3 = (var2.method201(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class35.field454; var4++) {
            class206.field3221[var4] = var2.method190(-3);
        }
        for (int var5 = 0; var5 < class35.field454; var5++) {
            class226.field3653[var5] = var2.method190(-3);
        }
        for (int var6 = 0; var6 < class35.field454; var6++) {
            class236.field3777[var6] = var2.method190(-3);
        }
        for (int var7 = 0; var7 < class35.field454; var7++) {
            class228.field3696[var7] = var2.method190(-3);
        }
        var2.field349 = arg1.length - (class35.field454 * 8) - ((var3 + -1) * 3) - 7;
        class72.field1023 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class72.field1023[var8] = var2.method215((byte) 105);
            if (class72.field1023[var8] == 0) {
                class72.field1023[var8] = 1;
            }
        }
        var2.field349 = 0;
        for (int var9 = 0; var9 < class35.field454; var9++) {
            int var10 = class228.field3696[var9];
            int var11 = class236.field3777[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            boolean var14 = false;
            byte[] var15 = new byte[var12];
            class101.field1574[var9] = var13;
            class37.field496[var9] = var15;
            int var16 = var2.method201(255);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method188(-127);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var15[var18] = var2.method188(-105);
                        var14 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var20 >= var11) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var11) {
                                break label101;
                            }
                            for (int var22 = 0; var22 < var10; var22++) {
                                byte var23 = var15[var11 * var22 + var21] = var2.method188(-98);
                                var14 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var10; var24++) {
                        var13[var11 * var24 + var20] = var2.method188(-114);
                    }
                    var20++;
                }
            }
            class80.field1148[var9] = var14;
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V")
    public static void method1012(int arg0) {
        field2249 = null;
        if (arg0 == 0) {
            field2262 = null;
            field2260 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)Z")
    public static final boolean method1013(byte arg0) {
        field2257++;
        if (arg0 > -72) {
            return true;
        }
        if (class248.field3965) {
            try {
                if ((Boolean) class113.method730(class2.field23.field237, 188, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(I[B)V")
    public class152(int arg0, byte[] arg1) {
        this.field2259 = arg0;
        class25 var3 = new class25(arg1);
        this.field2252 = var3.method201(255);
        this.field2263 = new int[this.field2252];
        this.field2261 = new int[this.field2252];
        this.field2250 = new boolean[this.field2252];
        this.field2258 = new int[this.field2252][];
        for (int var4 = 0; var4 < this.field2252; var4++) {
            this.field2263[var4] = var3.method201(255);
        }
        for (int var5 = 0; var5 < this.field2252; var5++) {
            this.field2250[var5] = var3.method201(255) == 1;
        }
        for (int var6 = 0; var6 < this.field2252; var6++) {
            this.field2261[var6] = var3.method190(-3);
        }
        for (int var7 = 0; var7 < this.field2252; var7++) {
            this.field2258[var7] = new int[var3.method201(255)];
        }
        for (int var8 = 0; var8 < this.field2252; var8++) {
            for (int var9 = 0; var9 < this.field2258[var8].length; var9++) {
                this.field2258[var8][var9] = var3.method201(255);
            }
        }
    }
}
