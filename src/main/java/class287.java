import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class287 {

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public int field4893 = -1;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public int field4906 = -1;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "Z")
    private boolean field4905 = false;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public int field4902 = 99;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "Z")
    public boolean field4919 = false;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public int field4912 = -1;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    public int field4900 = -1;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    public int field4917 = 2;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public int field4907 = 5;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
    public int field4913 = -1;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "Lok;")
    private static class146 field4897 = class235.method1724(-12908, "flash3:");

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "Lok;")
    public static class146 field4908 = field4897;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "Lok;")
    public static class146 field4911 = field4897;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Lok;")
    public static class146 field4891 = class235.method1724(-12908, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "Lgd;")
    public static class303 field4916 = class192.method1481((byte) -128);

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "[I")
    public static int[] field4922 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "Z")
    public static boolean field4925 = false;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "Lth;")
    public static class82 field4924;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "[I")
    private int[] field4894;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "[I")
    public int[] field4898;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "[I")
    private int[] field4899;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "[I")
    public int[] field4904;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "[[I")
    public int[][] field4914;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lfg;BI)Lfg;", line = 4)
    public final class208 method2061(class208 arg0, byte arg1, int arg2) {
        field4896++;
        int var4 = this.field4904[arg2];
        class72 var5 = class87.method605(98, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1399(true, true);
        }
        class72 var7 = null;
        int var8 = 0;
        if (this.field4894 != null && this.field4894.length > arg2) {
            int var9 = this.field4894[arg2];
            var7 = class87.method605(113, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (arg1 != -105) {
            method2062(-57);
        }
        if (var7 == null || var8 == 65535) {
            class208 var11 = arg0.method1399(!var5.method530((byte) -119, var6), !this.field4905);
            var11.method1375(var5, var6, this.field4905);
            return var11;
        } else {
            class208 var10 = arg0.method1399(!var5.method530((byte) -119, var6) & !var7.method530((byte) -119, var8), !this.field4905);
            var10.method1375(var5, var6, this.field4905);
            var10.method1375(var7, var8, this.field4905);
            return var10;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 49)
    public static void method2062(int arg0) {
        field4916 = null;
        field4891 = null;
        field4911 = null;
        field4908 = null;
        field4897 = null;
        field4924 = null;
        if (arg0 != 2) {
            field4911 = (class146) null;
        }
        field4922 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V", line = 69)
    public final void method2063(byte arg0) {
        if (this.field4900 == -1) {
            if (this.field4899 == null) {
                this.field4900 = 0;
            } else {
                this.field4900 = 2;
            }
        }
        if (this.field4913 == -1) {
            if (this.field4899 == null) {
                this.field4913 = 0;
            } else {
                this.field4913 = 2;
            }
        }
        field4909++;
        if (arg0 != -23) {
            method2066(97, 47, 18, -41, -90);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lwe;I)V", line = 98)
    public final void method2064(class47 arg0, int arg1) {
        if (arg1 > -29) {
            return;
        }
        field4901++;
        while (true) {
            int var3 = arg0.method368(40);
            if (var3 == 0) {
                return;
            }
            this.method2069(arg0, var3, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIZ)V", line = 125)
    public static final void method2065(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class189.field3124 = arg1;
        class192.field3168 = arg2;
        class132.field2230 = arg3;
        class58.field1018 = new class11[arg0][class189.field3124][class192.field3168];
        class300.field5082 = new int[arg0][class189.field3124 + 1][class192.field3168 + 1];
        if (class271.field4640) {
            class278.field4781 = new class286[4][];
        }
        if (arg4) {
            class89.field1426 = new class11[1][class189.field3124][class192.field3168];
            class160.field2707 = new int[class189.field3124][class192.field3168];
            class297.field5051 = new int[1][class189.field3124 + 1][class192.field3168 + 1];
            if (class271.field4640) {
                class261.field4338 = new class286[1][];
            }
        } else {
            class89.field1426 = (class11[][][]) null;
            class160.field2707 = (int[][]) null;
            class297.field5051 = (int[][][]) null;
            class261.field4338 = (class286[][]) null;
        }
        class279.method2025(false);
        class210.field3471 = new class302[500];
        class117.field1889 = 0;
        class64.field1106 = new class302[500];
        class229.field3821 = 0;
        class293.field4979 = new int[arg0][class189.field3124 + 1][class192.field3168 + 1];
        class206.field3433 = new class311[5000];
        class120.field1953 = 0;
        class60.field1022 = new class311[100];
        class202.field3364 = new boolean[class132.field2230 + class132.field2230 + 1][class132.field2230 + class132.field2230 + 1];
        class102.field1645 = new boolean[class132.field2230 + class132.field2230 + 2][class132.field2230 + class132.field2230 + 2];
        class283.field4846 = new byte[arg0][class189.field3124][class192.field3168];
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)V", line = 179)
    public static final void method2066(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4918++;
        if (arg0 > -107) {
            field4924 = (class82) null;
        }
        if ((arg3 - arg2) >= class151.field2564 && (arg2 + arg3) <= class126.field2058 && class123.field2008 <= (arg4 - arg2) && (arg2 + arg4) <= class318.field5394) {
            class264.method1907(0, arg1, arg4, arg3, arg2);
        } else {
            class80.method575(arg4, arg2, arg3, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lfg;IB)Lfg;", line = 205)
    public final class208 method2067(class208 arg0, int arg1, byte arg2) {
        int var4 = this.field4904[arg1];
        field4920++;
        class72 var5 = class87.method605(120, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (arg2 > -62) {
            return (class208) null;
        } else if (var5 == null) {
            return arg0.method1367(true, true);
        } else {
            class208 var7 = arg0.method1367(!var5.method530((byte) -119, var6), !this.field4905);
            var7.method1375(var5, var6, this.field4905);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZLfg;I)Lfg;", line = 229)
    public final class208 method2068(boolean arg0, class208 arg1, int arg2) {
        int var4 = this.field4904[arg2];
        field4903++;
        if (!arg0) {
            return (class208) null;
        }
        class72 var5 = class87.method605(115, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method1399(true, true);
        } else {
            class208 var7 = arg1.method1399(!var5.method530((byte) -119, var6), !this.field4905);
            var7.method1375(var5, var6, this.field4905);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lwe;IB)V", line = 251)
    private final void method2069(class47 arg0, int arg1, byte arg2) {
        if (arg2 <= 94) {
            return;
        }
        field4915++;
        if (arg1 == 1) {
            int var4 = arg0.method379(-2);
            this.field4898 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4898[var5] = arg0.method379(-2);
            }
            this.field4904 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4904[var6] = arg0.method379(-2);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4904[var7] = (arg0.method379(-2) << 16) + this.field4904[var7];
            }
        } else if (arg1 == 2) {
            this.field4893 = arg0.method379(-2);
        } else if (arg1 == 3) {
            int var15 = arg0.method368(-109);
            this.field4899 = new int[var15 + 1];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field4899[var16] = arg0.method368(81);
            }
            this.field4899[var15] = 9999999;
        } else if (arg1 == 4) {
            this.field4919 = true;
        } else if (arg1 == 5) {
            this.field4907 = arg0.method368(-114);
        } else if (arg1 == 6) {
            this.field4912 = arg0.method379(-2);
        } else if (arg1 == 7) {
            this.field4906 = arg0.method379(-2);
        } else if (arg1 == 8) {
            this.field4902 = arg0.method368(-99);
        } else if (arg1 == 9) {
            this.field4913 = arg0.method368(-105);
        } else if (arg1 == 10) {
            this.field4900 = arg0.method368(30);
        } else if (arg1 == 11) {
            this.field4917 = arg0.method368(117);
        } else if (arg1 == 12) {
            int var8 = arg0.method368(124);
            this.field4894 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4894[var9] = arg0.method379(-2);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field4894[var10] = (arg0.method379(-2) << 16) + this.field4894[var10];
            }
        } else if (arg1 == 13) {
            int var11 = arg0.method379(-2);
            this.field4914 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method368(84);
                if (var13 > 0) {
                    this.field4914[var12] = new int[var13];
                    this.field4914[var12][0] = arg0.method389((byte) 31);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field4914[var12][var14] = arg0.method379(-2);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field4905 = true;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIILfg;Lgm;)Lfg;", line = 403)
    public final class208 method2070(int arg0, int arg1, int arg2, class208 arg3, class287 arg4) {
        int var6 = this.field4904[arg2];
        field4910++;
        class72 var7 = class87.method605(arg1 + 12482, var6 >> 16);
        if (arg1 != -12366) {
            this.field4902 = 94;
        }
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method2068(true, arg3, arg0);
        }
        int var9 = arg4.field4904[arg0];
        class72 var10 = class87.method605(arg1 + 12430, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class208 var12 = arg3.method1399(!var7.method530((byte) -119, var8), !this.field4905);
            var12.method1375(var7, var8, this.field4905);
            return var12;
        } else {
            class208 var13 = arg3.method1399(!var7.method530((byte) -119, var8) & !var10.method530((byte) -119, var11), !arg4.field4905 & !this.field4905);
            var13.method1393(var7, var8, var10, var11, this.field4899, this.field4905 | arg4.field4905);
            return var13;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILfg;IB)Lfg;", line = 449)
    public final class208 method2071(int arg0, class208 arg1, int arg2, byte arg3) {
        field4921++;
        int var5 = this.field4904[arg0];
        class72 var6 = class87.method605(107, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method1399(true, true);
        }
        if (arg3 != -1) {
            this.field4902 = -53;
        }
        int var8 = arg2 & 0x3;
        class208 var9 = arg1.method1399(!var6.method530((byte) -119, var7), !this.field4905);
        if (var8 == 1) {
            var9.method1349();
        } else if (var8 == 2) {
            var9.method1356();
        } else if (var8 == 3) {
            var9.method1386();
        }
        var9.method1375(var6, var7, this.field4905);
        if (var8 == 1) {
            var9.method1386();
        } else if (var8 == 2) {
            var9.method1356();
        } else if (var8 == 3) {
            var9.method1349();
        }
        return var9;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZLwe;)V", line = 495)
    public static final void method2072(boolean arg0, class47 arg1) {
        field4895++;
        int var2 = arg1.method350(-32768);
        class189.field3127 = new class292[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class189.field3127[var3] = new class292();
            class189.field3127[var3].field4964 = arg1.method350(-32768);
            class189.field3127[var3].field4967 = arg1.method345(51);
        }
        class71.field1167 = arg1.method350(-32768);
        class39.field697 = arg1.method350(-32768);
        class157.field2649 = arg1.method350(-32768);
        class279.field4783 = new class228[class39.field697 + 1 - class71.field1167];
        for (int var4 = 0; var4 < class157.field2649; var4++) {
            int var5 = arg1.method350(-32768);
            class228 var6 = class279.field4783[var5] = new class228();
            var6.field3161 = arg1.method368(32);
            var6.field3157 = arg1.method373((byte) 36);
            var6.field3806 = class71.field1167 + var5;
            var6.field3802 = arg1.method345(31);
            var6.field3811 = arg1.method345(23);
        }
        class96.field1554 = arg1.method373((byte) 36);
        class320.field5462 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V", line = 571)
    public static final void method2073(int arg0) {
        field4892++;
        class13.field250.method793((byte) -68);
        if (arg0 < 74) {
            field4924 = (class82) null;
        }
    }
}
