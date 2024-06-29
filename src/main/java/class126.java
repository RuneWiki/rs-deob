import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class126 {

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "B")
    private byte field2184;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public int field2179;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public int field2174;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public int field2183;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public int field2181;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "Lch;")
    public static class133 field2169 = new class133(128);

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field2173 = 5063219;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "Z")
    public static boolean field2176 = false;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "Lqd;")
    public static class40 field2180 = class147.method1106("scrollen:", (byte) -98);

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "Lqd;")
    public static class40 field2185 = class147.method1106("::fpson", (byte) -116);

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 9)
    public static final void method941(int arg0) {
        int var1 = class265.field4438.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class265.field4438[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class313.field5285; var4++) {
                    if (class5.field70[var2] == class290.field4851[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class290.field4851[class313.field5285] = class5.field70[var2];
                    var3 = class313.field5285++;
                }
                class26 var5 = new class26(class265.field4438[var2]);
                int var6 = 0;
                while (var5.field478 < class265.field4438[var2].length && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method197(arg0 - 65);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class5.field70[var2] >> 8) * 64 - (class196.field3152 - var10);
                    int var13 = (class5.field70[var2] & 0xFF) * 64 + var11 - class263.field4407;
                    class121 var14 = class246.method1740(var5.method197(-1), (byte) -32);
                    if (class91.field1656[var7] == null && (var14.field2095 & 0x1) > 0 && class188.field3022 == var9 && var12 >= 0 && var14.field2089 + var12 < 104 && var13 >= 0 && (var13 + var14.field2089) < 104) {
                        class91.field1656[var7] = new class42();
                        class42 var15 = class91.field1656[var7];
                        class65.field1229[class177.field2923++] = var7;
                        var15.field1509 = class256.field4266;
                        var15.field796 = var14;
                        var15.method658((byte) -32, var15.field796.field2089);
                        var15.field1482 = var15.field796.field2090;
                        var15.field1498 = var15.field796.field2077;
                        var15.field1533 = var15.field796.field2078;
                        var15.field1510 = var15.field796.field2069;
                        var15.field1538 = var15.field796.field2067;
                        var15.field1542 = var15.field796.field2101;
                        if (var15.field1542 == 0) {
                            var15.field1507 = 0;
                        }
                        var15.field1500 = var15.field796.field2107;
                        var15.field1545 = var15.field796.field2103;
                        var15.method660(true, var12, var15.method666(24207), 128, var13);
                    }
                }
            }
        }
        field2178++;
        if (arg0 != 64) {
            method943(-119);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)V", line = 106)
    public static final void method942(byte arg0, int arg1) {
        class122.field2126.method1348(0, arg1);
        if (arg0 <= 53) {
            method942((byte) -66, -18);
        }
        class274.field4547.method1348(0, arg1);
        class256.field4269.method1348(0, arg1);
        class158.field2646.method1348(0, arg1);
        field2177++;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 131)
    public static void method943(int arg0) {
        if (arg0 >= 98) {
            field2180 = null;
            field2185 = null;
            field2169 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)I", line = 144)
    public final int method944(int arg0) {
        field2171++;
        if (arg0 != -29358) {
            method947(12, -98);
        }
        return (this.field2184 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)I", line = 166)
    public static final int method945(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2170++;
        int var5 = arg0 & 0xF;
        int var6 = 28 / ((arg3 - 34) / 49);
        int var7 = var5 < 8 ? arg2 : arg1;
        int var8 = var5 < 4 ? arg1 : (var5 == 12 || var5 == 14 ? arg2 : arg4);
        return ((var5 & 0x1) == 0 ? var7 : -var7) + ((var5 & 0x2) == 0 ? var8 : -var8);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)I", line = 195)
    public final int method946(byte arg0) {
        field2186++;
        return arg0 > -60 ? 113 : this.field2184 & 0x7;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V", line = 208)
    public static final void method947(int arg0, int arg1) {
        field2175++;
        class99 var2;
        if (class21.field350 || class252.field4189 == null) {
            var2 = new class99(512, 512);
        } else {
            var2 = (class99) class252.field4189;
        }
        int[] var3 = var2.field1761;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = (103 - var6) * 4 * 512 + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class274.field4564[arg1][var8][var6] & 0x18) == 0) {
                    class96.method719(var3, var7, 512, arg1, var8, var6);
                }
                if (arg1 < 3 && (class274.field4564[arg1 + 1][var8][var6] & 0x8) != 0) {
                    class96.method719(var3, var7, 512, arg1 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        var2.method737();
        int var9 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + arg0 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16) + 238 - 10;
        int var10 = ((int) (Math.random() * 20.0D)) + 228 << 16;
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class274.field4564[arg1][var12][var11] & 0x18) == 0) {
                    class121.method910(var11, var12, arg1, var9, var10, (byte) -24);
                }
                if (arg1 < 3 && (class274.field4564[arg1 + 1][var12][var11] & 0x8) != 0) {
                    class121.method910(var11, var12, arg1 + 1, var9, var10, (byte) -37);
                }
            }
        }
        class164.field2719 = 0;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                long var15 = class310.method2122(class160.field2671, var13, var14);
                if (var15 != 0L) {
                    class27 var17 = class72.method540(0, Integer.MAX_VALUE & (int) (var15 >>> 32));
                    int var18 = var17.field558;
                    if (var17.field546 != null) {
                        for (int var19 = 0; var19 < var17.field546.length; var19++) {
                            if (var17.field546[var19] != -1) {
                                class27 var20 = class72.method540(0, var17.field546[var19]);
                                if (var20.field558 >= 0) {
                                    var18 = var20.field558;
                                    break;
                                }
                            }
                        }
                    }
                    if (var18 >= 0) {
                        int var21 = var13;
                        int var22 = var14;
                        if (var18 != 22 && var18 != 29 && var18 != 34 && var18 != 36 && var18 != 46 && var18 != 47 && var18 != 48) {
                            int[][] var23 = class255.field4247[class160.field2671].field839;
                            for (int var24 = 0; var24 < 10; var24++) {
                                int var25 = (int) (Math.random() * 4.0D);
                                if (var25 == 0 && var21 > 0 && var21 > var13 - 3 && (var23[var21 - 1][var22] & 0x12C0108) == 0) {
                                    var21--;
                                }
                                if (var25 == 1 && var21 < 103 && var21 < var13 + 3 && (var23[var21 + 1][var22] & 0x12C0180) == 0) {
                                    var21++;
                                }
                                if (var25 == 2 && var22 > 0 && var14 - 3 < var22 && (var23[var21][var22 - 1] & 0x12C0102) == 0) {
                                    var22--;
                                }
                                if (var25 == 3 && var22 < 103 && var14 + 3 > var22 && (var23[var21][var22 + 1] & 0x12C0120) == 0) {
                                    var22++;
                                }
                            }
                        }
                        class139.field2351[class164.field2719] = var17.field557;
                        class94.field1702[class164.field2719] = var21;
                        class146.field2425[class164.field2719] = var22;
                        class164.field2719++;
                    }
                }
            }
        }
        if (class21.field350) {
            for (int var26 = 0; var26 < var4; var26++) {
                if (var3[var26] == 0) {
                    var3[var26] = 1;
                }
            }
            class252.field4189 = new class100(var2);
        } else {
            class252.field4189 = var2;
        }
        if (class21.field350) {
            class115.field1978 = null;
        } else {
            class237.field3903.method997(9101);
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 410)
    public class126() {
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lsd;)V", line = 412)
    public class126(class26 arg0) {
        this.field2184 = arg0.method234(2193);
        this.field2179 = arg0.method197(-1);
        this.field2174 = arg0.method203(-22066);
        this.field2172 = arg0.method203(-22066);
        this.field2183 = arg0.method203(-22066);
        this.field2181 = arg0.method203(-22066);
    }
}
