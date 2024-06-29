import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class285 {

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "Z")
    public static boolean field5024 = false;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "Leg;")
    public static class37 field5032 = class174.method1167("Connect-B au serveur de mise -9 jour", 122);

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "[I")
    public static int[] field5020 = new int[2048];

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "Leg;")
    public static class37 field5042 = class174.method1167("S-Blectionner", -16);

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "[I")
    public static int[] field5040 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public int field5027;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "J")
    private long field5023;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "J")
    private long field5035;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "Z")
    public boolean field5030;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "[I")
    private int[] field5022;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "[I")
    private int[] field5025;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)I")
    public final int method1904(byte arg0) {
        if (arg0 != 66) {
            this.method1908((class2) null, 69, 117, -66, -71);
        }
        field5021++;
        return this.field5027 == -1 ? (this.field5025[4] << 20) + (this.field5025[0] << 25) + (this.field5022[0] << 15) + (this.field5022[8] << 10) - (-(this.field5022[11] << 5) + -this.field5022[1]) : class148.method1022(this.field5027, (byte) -116).field4881 + 305419896;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I[I[IIZ)V")
    public final void method1905(int arg0, int[] arg1, int[] arg2, int arg3, boolean arg4) {
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class269.field4707; var7++) {
                    class92 var8 = class273.method1830(var7, (byte) 104);
                    if (var8 != null && !var8.field1440 && var8.field1436 == (var6 + (arg4 ? 7 : 0))) {
                        arg1[class242.field4357[var6]] = class94.method617(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field5030 = arg4;
        this.field5027 = arg0;
        field5037++;
        this.field5022 = arg1;
        this.field5025 = arg2;
        this.method1914(-32468);
        if (arg3 != 12) {
            this.field5035 = 59L;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lie;II)Lbl;")
    public final class253 method1906(class2 arg0, int arg1, int arg2) {
        field5019++;
        if (arg2 != 3417) {
            method1910(5, 103);
        }
        if (this.field5027 != -1) {
            return class148.method1022(this.field5027, (byte) -116).method1853(true, arg1, arg0);
        }
        class253 var4 = (class253) class273.field4796.method1411(arg2 ^ 0xFFFFF286, this.field5035);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field5022[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class273.method1830(var15 & 0x3FFFFFFF, (byte) 91).method606(82)) {
                        var5 = true;
                    }
                } else if (!class9.method52(true, var15 & 0x3FFFFFFF).method1667(0, this.field5030)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class211[] var7 = new class211[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field5022[var9];
                if ((var12 & 0x40000000) != 0) {
                    class211 var14 = class9.method52(true, var12 & 0x3FFFFFFF).method1648(true, this.field5030);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class211 var13 = class273.method1830(var12 & 0x3FFFFFFF, (byte) 112).method598(false);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                }
            }
            class211 var10 = new class211(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field5025[var11] < class172.field2890[var11].length) {
                    var10.method1489(class73.field1147[var11], class172.field2890[var11][this.field5025[var11]]);
                }
                if (class235.field4050[var11].length > this.field5025[var11]) {
                    var10.method1489(class41.field655[var11], class235.field4050[var11][this.field5025[var11]]);
                }
            }
            var4 = var10.method1480(64, 768, -50, -10, -50);
            class273.field4796.method1404(this.field5035, false, var4);
        }
        if (arg0 != null) {
            var4 = arg0.method15(var4, 108, arg1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
    public static void method1907(boolean arg0) {
        field5032 = null;
        field5020 = null;
        if (arg0) {
            method1910(-50, 113);
        }
        field5042 = null;
        field5040 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lie;IIII)Lbl;")
    public final class253 method1908(class2 arg0, int arg1, int arg2, int arg3, int arg4) {
        field5029++;
        long var6 = (long) arg2 | (long) arg2 << 32 | (long) (arg4 << 16);
        if (arg1 != 30431) {
            this.method1905(-15, (int[]) null, (int[]) null, -119, false);
        }
        class253 var8 = (class253) class273.field4796.method1411(-107, var6);
        if (var8 == null) {
            class211[] var9 = new class211[2];
            int var10 = 0;
            if (!class273.method1830(arg2, (byte) 74).method606(103) || !class273.method1830(arg4, (byte) 123).method606(arg1 ^ 0x76A8)) {
                return null;
            }
            class211 var11 = class273.method1830(arg2, (byte) 121).method598(false);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class211 var12 = class273.method1830(arg4, (byte) 125).method598(false);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class211 var13 = new class211(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class172.field2890[var14].length > this.field5025[var14]) {
                    var13.method1489(class73.field1147[var14], class172.field2890[var14][this.field5025[var14]]);
                }
                if (class235.field4050[var14].length > this.field5025[var14]) {
                    var13.method1489(class41.field655[var14], class235.field4050[var14][this.field5025[var14]]);
                }
            }
            var8 = var13.method1480(64, 768, -50, -10, -50);
            class273.field4796.method1404(var6, false, var8);
        }
        if (arg0 != null) {
            var8 = arg0.method15(var8, 5, arg3);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)V")
    public final void method1909(int arg0, int arg1, int arg2) {
        field5031++;
        this.field5025[arg1] = arg0;
        this.method1914(-32468);
        if (arg2 != -13) {
            field5020 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)I")
    public static final int method1910(int arg0, int arg1) {
        field5041++;
        return arg1 == -19253 ? (arg0 & 0x3FEF4) >> 11 : -92;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILpi;)I")
    public static final int method1911(int arg0, class188 arg1) {
        field5039++;
        int var2 = arg1.field3202;
        if (arg0 != -50) {
            method1911(-8, (class188) null);
        }
        if (arg1.field1789 == arg1.field1767) {
            var2 = arg1.field3224;
        } else if (arg1.field1789 == arg1.field1764) {
            var2 = arg1.field3231;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZB)V")
    public final void method1912(boolean arg0, byte arg1) {
        this.field5030 = arg0;
        if (arg1 > 94) {
            this.method1914(-32468);
            field5038++;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)Lhg;")
    public static final class271 method1913(byte arg0, int arg1) {
        if (arg0 > -95) {
            method1911(-21, (class188) null);
        }
        field5034++;
        class271 var2 = (class271) class284.field5008.method344((byte) 14, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class59.field968.method666(arg1, 5, (byte) -51);
        class271 var4 = new class271();
        if (var3 != null) {
            var4.method1820(-79, new class187(var3));
        }
        class284.field5008.method341((byte) 16, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    private final void method1914(int arg0) {
        if (arg0 != -32468) {
            return;
        }
        long var2 = this.field5035;
        field5026++;
        long[] var4 = class223.field3824;
        this.field5035 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field5035 = this.field5035 >>> 8 ^ var4[(int) (((long) (this.field5022[var5] >> 24) ^ this.field5035) & 0xFFL)];
            this.field5035 = this.field5035 >>> 8 ^ var4[(int) ((this.field5035 ^ (long) (this.field5022[var5] >> 16)) & 0xFFL)];
            this.field5035 = this.field5035 >>> 8 ^ var4[(int) ((this.field5035 ^ (long) (this.field5022[var5] >> 8)) & 0xFFL)];
            this.field5035 = this.field5035 >>> 8 ^ var4[(int) ((this.field5035 ^ (long) this.field5022[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field5035 = var4[(int) ((this.field5035 ^ (long) this.field5025[var6]) & 0xFFL)] ^ this.field5035 >>> 8;
        }
        this.field5035 = this.field5035 >>> 8 ^ var4[(int) (((long) (this.field5030 ? 1 : 0) ^ this.field5035) & 0xFFL)];
        if (var2 != 0L && this.field5035 != var2) {
            class119.field2017.method1410(-5449, var2);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIZLie;Lie;)Lbl;")
    public final class253 method1915(int arg0, int arg1, int arg2, boolean arg3, class2 arg4, class2 arg5) {
        field5033++;
        if (this.field5027 != -1) {
            return class148.method1022(this.field5027, (byte) -116).method1850(arg1, 0, arg5, arg2, arg4);
        }
        long var7 = this.field5035;
        int[] var9 = this.field5022;
        if (arg4 != null && (arg4.field48 >= 0 || arg4.field35 >= 0)) {
            var9 = new int[12];
            for (int var10 = 0; var10 < 12; var10++) {
                var9[var10] = this.field5022[var10];
            }
            if (arg4.field48 >= 0) {
                if (arg4.field48 == 65535) {
                    var7 ^= 0xFFFFFFFF00000000L;
                    var9[5] = 0;
                } else {
                    var9[5] = class94.method617(arg4.field48, 1073741824);
                    var7 ^= (long) var9[5] << 32;
                }
            }
            if (arg4.field35 >= 0) {
                if (arg4.field35 == 65535) {
                    var7 ^= 0xFFFFFFFFL;
                    var9[3] = 0;
                } else {
                    var9[3] = class94.method617(1073741824, arg4.field35);
                    var7 ^= (long) var9[3];
                }
            }
        }
        class253 var11 = (class253) class119.field2017.method1411(arg0 - 115, var7);
        if (arg0 != 12) {
            method1907(true);
        }
        if (var11 == null) {
            boolean var12 = false;
            for (int var13 = 0; var13 < 12; var13++) {
                int var31 = var9[var13];
                if ((var31 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var31) != 0 && !class273.method1830(var31 & 0x3FFFFFFF, (byte) 75).method603((byte) -86)) {
                        var12 = true;
                    }
                } else if (!class9.method52(true, var31 & 0x3FFFFFFF).method1662((byte) 56, this.field5030)) {
                    var12 = true;
                }
            }
            if (var12) {
                if (this.field5023 != -1L) {
                    var11 = (class253) class119.field2017.method1411(-3, this.field5023);
                }
                if (var11 == null) {
                    return null;
                }
            }
            if (var11 == null) {
                class211[] var14 = new class211[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var28 = var9[var16];
                    if ((var28 & 0x40000000) != 0) {
                        class211 var30 = class9.method52(true, var28 & 0x3FFFFFFF).method1650(this.field5030, 0);
                        if (var30 != null) {
                            var14[var15++] = var30;
                        }
                    } else if ((Integer.MIN_VALUE & var28) != 0) {
                        class211 var29 = class273.method1830(var28 & 0x3FFFFFFF, (byte) 103).method605(-7407);
                        if (var29 != null) {
                            var14[var15++] = var29;
                        }
                    }
                }
                int var17 = var9[0];
                if ((var17 & 0x40000000) != 0) {
                    class241 var18 = class9.method52(true, var17 & 0x3FFFFFFF);
                    if (var18.field4275 != null) {
                        for (int var19 = 0; var19 < var18.field4275.length; var19++) {
                            if (var18.field4275[var19] != null && var14[var19 + 1] != null) {
                                int var20 = var18.field4275[var19][2];
                                int var21 = var18.field4275[var19][0];
                                int var22 = var18.field4275[var19][1];
                                int var23 = var18.field4275[var19][3];
                                int var24 = var18.field4275[var19][4];
                                int var25 = var18.field4275[var19][5];
                                var14[var19 + 1].method1486(var21, var22, var20);
                                var14[var19 + 1].method1507(var23, var24, var25);
                            }
                        }
                    }
                }
                class211 var26 = new class211(var14, var15);
                for (int var27 = 0; var27 < 5; var27++) {
                    if (this.field5025[var27] < class172.field2890[var27].length) {
                        var26.method1489(class73.field1147[var27], class172.field2890[var27][this.field5025[var27]]);
                    }
                    if (this.field5025[var27] < class235.field4050[var27].length) {
                        var26.method1489(class41.field655[var27], class235.field4050[var27][this.field5025[var27]]);
                    }
                }
                var11 = var26.method1480(64, 850, -30, -50, -30);
                if (arg3) {
                    class119.field2017.method1404(var7, false, var11);
                    this.field5023 = var7;
                }
            }
        }
        if (arg4 == null && arg5 == null) {
            return var11;
        }
        class253 var32;
        if (arg4 != null && arg5 != null) {
            var32 = arg4.method12(arg5, var11, -108, arg2, arg1);
        } else if (arg4 == null) {
            var32 = arg5.method10(var11, (byte) 111, arg2);
        } else {
            var32 = arg4.method10(var11, (byte) 111, arg1);
        }
        return var32;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(III)V")
    public final void method1916(int arg0, int arg1, int arg2) {
        field5028++;
        int var4 = class242.field4357[arg2];
        if (this.field5022[var4] == 0 || class273.method1830(arg0, (byte) 72) == null) {
            return;
        }
        if (arg1 != -8236) {
            method1910(121, -70);
        }
        this.field5022[var4] = class94.method617(Integer.MIN_VALUE, arg0);
        this.method1914(arg1 - 24232);
    }
}
