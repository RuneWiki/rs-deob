import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class206 {

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[[I")
    public static int[][] field3104 = new int[104][104];

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field3103 = 0;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "B")
    public static byte field3118;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public int field3121;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public int field3123;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Llm;")
    public static class210 field3102;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Lfj;")
    public static class290 field3112;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lqk;")
    public class8 field3106;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "[I")
    public int[] field3111;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "[I")
    public int[] field3114;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "[I")
    public int[] field3116;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "[I")
    public int[] field3119;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "[I")
    public int[] field3122;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "[I")
    public int[] field3125;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "[Lqk;")
    public class8[] field3115;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "[[I")
    public int[][] field3110;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "[[I")
    public int[][] field3124;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)La;", line = 7)
    public static final class270 method1414(byte arg0, int arg1) {
        if (arg0 < 83) {
            field3118 = 19;
        }
        field3120++;
        class270 var2 = (class270) class310.field4716.method1674(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class168.field2516.method1441(class132.method975(255, arg1), (byte) -44, class298.method2075(arg1, 3614));
        class270 var4 = new class270();
        if (var3 != null) {
            var4.method1903((byte) 52, new class263(var3));
        }
        class310.field4716.method1672(-126, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[Lf;)V", line = 34)
    public static final void method1415(int arg0, int arg1, class329[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class329 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field5066 == 0) {
                    if (var4.field4964 != null) {
                        method1415(31, arg1, var4.field4964);
                    }
                    class167 var5 = (class167) class295.field4522.method1320((long) var4.field5086, 13002);
                    if (var5 != null) {
                        class136.method991(var5.field2505, arg1, 27011);
                    }
                }
                if (arg1 == 0 && var4.field4981 != null) {
                    class286 var6 = new class286();
                    var6.field4330 = var4;
                    var6.field4310 = var4.field4981;
                    class9.method39(var6, 6514);
                }
                if (arg1 == 1 && var4.field4990 != null) {
                    if (var4.field5040 >= 0) {
                        class329 var7 = class80.method541((byte) 96, var4.field5086);
                        if (var7 == null || var7.field4964 == null || var4.field5040 >= var7.field4964.length || var7.field4964[var4.field5040] != var4) {
                            continue;
                        }
                    }
                    class286 var8 = new class286();
                    var8.field4330 = var4;
                    var8.field4310 = var4.field4990;
                    class9.method39(var8, arg0 + 6483);
                }
            }
        }
        field3105++;
        if (arg0 != 31) {
            field3118 = -17;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 105)
    public static final void method1416(int arg0) {
        field3109++;
        class133.method978();
        class168.field2521 = new class2[7];
        class168.field2521[1] = new class165();
        if (arg0 != 9) {
            field3102 = (class210) null;
        }
        class168.field2521[2] = new class139();
        class168.field2521[3] = new class118();
        class168.field2521[4] = new class143();
        class168.field2521[5] = new class51();
        class168.field2521[6] = new class313();
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 125)
    public static void method1417(int arg0) {
        field3102 = null;
        field3104 = (int[][]) null;
        if (arg0 == -14544) {
            field3112 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLre;)V", line = 139)
    public static final void method1418(boolean arg0, class263 arg1) {
        field3107++;
        if (arg1.field3986.length - arg1.field4025 < 1) {
            return;
        }
        int var2 = arg1.method1787(false);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg1.field3986.length - arg1.field4025) {
            return;
        }
        class272.field4167 = arg1.method1787(false);
        if (class272.field4167 < 1) {
            class272.field4167 = 1;
        } else if (class272.field4167 > 4) {
            class272.field4167 = 4;
        }
        class257.method1743(0, arg1.method1787(false) == 1);
        client.field1945 = arg1.method1787(false) == 1;
        class170.field2549 = arg1.method1787(arg0) == 1;
        class151.field2274 = arg1.method1787(false) == 1;
        class97.field1467 = arg1.method1787(false) == 1;
        class210.field3171 = arg1.method1787(false) == 1;
        class233.field3506 = arg1.method1787(false) == 1;
        class130.field2019 = arg1.method1787(false) == 1;
        class284.field4298 = arg1.method1787(false);
        if (class284.field4298 > 2) {
            class284.field4298 = 2;
        }
        if (var2 < 2) {
            class292.field4447 = arg1.method1787(false) == 1;
            arg1.method1787(false);
        } else {
            class292.field4447 = arg1.method1787(false) == 1;
        }
        class45.field569 = arg1.method1787(false) == 1;
        class197.field2968 = arg1.method1787(false) == 1;
        class157.field2348 = arg1.method1787(false);
        if (arg0) {
            return;
        }
        if (class157.field2348 > 2) {
            class157.field2348 = 2;
        }
        class194.field2902 = class157.field2348;
        class178.field2630 = arg1.method1787(arg0) == 1;
        class287.field4341 = arg1.method1787(arg0);
        if (class287.field4341 > 127) {
            class287.field4341 = 127;
        }
        class115.field1760 = arg1.method1787(arg0);
        class272.field4183 = arg1.method1787(arg0);
        if (class272.field4183 > 127) {
            class272.field4183 = 127;
        }
        if (var2 >= 1) {
            class91.field1360 = arg1.method1830((byte) -77);
            class204.field3064 = arg1.method1830((byte) -77);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1787(false);
        }
        if (var2 >= 4) {
            int var4 = arg1.method1787(arg0);
            if (class84.field1251 < 96) {
                var4 = 0;
            }
            class18.method118(var4);
        }
        if (var2 >= 5) {
            class294.field4499 = arg1.method1826(-206227536);
        }
        if (var2 >= 6) {
            class144.field2175 = arg1.method1787(false);
        }
        if (var2 >= 7) {
            class309.field4704 = arg1.method1787(false) == 1;
        }
        if (var2 >= 8) {
            class131.field2025 = arg1.method1787(false) == 1;
        }
        if (var2 >= 9) {
            class19.field231 = arg1.method1787(false);
        }
        if (var2 >= 10) {
            class179.field2656 = arg1.method1787(arg0) != 0;
        }
        if (var2 >= 11) {
            class36.field442 = arg1.method1787(arg0) != 0;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[B)V", line = 316)
    private final void method1419(int arg0, byte[] arg1) {
        field3126++;
        class263 var3 = new class263(class101.method711(arg1, false));
        int var4 = var3.method1787(false);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field3121 = 0;
        } else {
            this.field3121 = var3.method1826(arg0 ^ 0xC4AC84E);
        }
        int var5 = var3.method1787(false);
        this.field3117 = var3.method1830((byte) -77);
        this.field3122 = new int[this.field3117];
        int var6 = 0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field3117; var8++) {
            this.field3122[var8] = var6 += var3.method1830((byte) -77);
            if (var7 < this.field3122[var8]) {
                var7 = this.field3122[var8];
            }
        }
        this.field3123 = var7 + 1;
        this.field3116 = new int[this.field3123];
        this.field3119 = new int[this.field3123];
        this.field3110 = new int[this.field3123][];
        this.field3111 = new int[this.field3123];
        this.field3125 = new int[this.field3123];
        if (var5 != 0) {
            this.field3114 = new int[this.field3123];
            for (int var9 = 0; var9 < this.field3123; var9++) {
                this.field3114[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3117; var10++) {
                this.field3114[this.field3122[var10]] = var3.method1826(-206227536);
            }
            this.field3106 = new class8(this.field3114);
        }
        for (int var11 = 0; var11 < this.field3117; var11++) {
            this.field3125[this.field3122[var11]] = var3.method1826(-206227536);
        }
        for (int var12 = 0; var12 < this.field3117; var12++) {
            this.field3116[this.field3122[var12]] = var3.method1826(-206227536);
        }
        if (arg0 != -2) {
            return;
        }
        for (int var13 = 0; var13 < this.field3117; var13++) {
            this.field3119[this.field3122[var13]] = var3.method1830((byte) -77);
        }
        for (int var14 = 0; var14 < this.field3117; var14++) {
            int var15 = 0;
            int var16 = this.field3122[var14];
            int var17 = -1;
            int var18 = this.field3119[var16];
            this.field3110[var16] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field3110[var16][var19] = var15 += var3.method1830((byte) -77);
                if (var17 < var20) {
                    var17 = var20;
                }
            }
            this.field3111[var16] = var17 + 1;
            if (var17 + 1 == var18) {
                this.field3110[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3115 = new class8[var7 + 1];
        this.field3124 = new int[var7 + 1][];
        for (int var21 = 0; var21 < this.field3117; var21++) {
            int var22 = this.field3122[var21];
            int var23 = this.field3119[var22];
            this.field3124[var22] = new int[this.field3111[var22]];
            for (int var24 = 0; var24 < this.field3111[var22]; var24++) {
                this.field3124[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field3110[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field3110[var22][var25];
                }
                this.field3124[var22][var26] = var3.method1826(-206227536);
            }
            this.field3115[var22] = new class8(this.field3124[var22]);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(BI)V", line = 490)
    public static final void method1420(byte arg0, int arg1) {
        field3108++;
        class318.method2184(-20238);
        class300.method2090(-1535736372);
        int var2 = class179.method1239(16, arg1).field699;
        if (var2 == 0) {
            return;
        }
        int var3 = class185.field2763[arg1];
        if (var2 == 6) {
            class311.field4725 = var3;
        }
        if (var2 == 5) {
            class226.field3439 = var3;
        }
        if (arg0 < -37 && var2 == 9) {
            class251.field3750 = var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I", line = 524)
    public static int method1421(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([BI)V", line = 538)
    public class206(byte[] arg0, int arg1) {
        this.field3113 = class177.method1228(arg0, arg0.length, 2913);
        if (this.field3113 != arg1) {
            throw new RuntimeException();
        }
        this.method1419(-2, arg0);
    }
}
