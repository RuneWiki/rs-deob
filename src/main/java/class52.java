import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class52 {

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Lqd;")
    private static class40 field999 = class147.method1106("Loaded update list", (byte) -49);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Lqd;")
    public static class40 field992 = class147.method1106(")4a=", (byte) -56);

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Lqd;")
    public static class40 field998 = field999;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static volatile int field1009 = 0;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field1017 = 0;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "Lqd;")
    public static class40 field1005 = class147.method1106("b12_full", (byte) -93);

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "Lqd;")
    public static class40 field1015 = class147.method1106("Hidden)2use", (byte) -123);

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "J")
    private long field1011;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "J")
    private long field1018;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "Z")
    public boolean field1016;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "[I")
    private int[] field1012;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "[I")
    private int[] field1013;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V", line = 5)
    public final void method447(int arg0, int arg1, int arg2) {
        field1003++;
        this.field1012[arg0] = arg1;
        if (arg2 == -28049) {
            this.method453(Integer.MIN_VALUE);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)I", line = 17)
    public final int method448(byte arg0) {
        field1014++;
        int var2 = 58 / ((arg0 - 42) / 45);
        return this.field997 == -1 ? (this.field1013[8] << 10) + (this.field1012[4] << 20) + ((this.field1012[0] << 25) - -(this.field1013[0] << 15)) - (-(this.field1013[11] << 5) + -this.field1013[1]) : 305419896 - -class246.method1740(this.field997, (byte) -32).field2048;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)V", line = 40)
    public final void method449(int arg0, int arg1, int arg2) {
        field993++;
        int var4 = class156.field2622[arg2];
        if (this.field1013[var4] != 0 && class42.method389(arg1, (byte) -112) != null) {
            int var5 = -72 / ((arg0 + 10) / 49);
            this.field1013[var4] = class11.method71(arg1, Integer.MIN_VALUE);
            this.method453(Integer.MIN_VALUE);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V", line = 63)
    public static final void method450(byte arg0) {
        if (arg0 != 83) {
            method450((byte) 68);
        }
        field996++;
        class181.field2945.method1347(0);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 75)
    public static final void method451(int arg0) {
        field994++;
        class95.field1715.method1458((byte) -19);
        int var1 = class95.field1715.method1466(arg0 ^ 0x7CAE, 8);
        if (class177.field2923 > var1) {
            for (int var2 = var1; var2 < class177.field2923; var2++) {
                class275.field4568[class76.field1314++] = class65.field1229[var2];
            }
        }
        if (var1 > class177.field2923) {
            throw new RuntimeException("gnpov1");
        }
        if (arg0 != -26980) {
            field1005 = (class40) null;
        }
        class177.field2923 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class65.field1229[var3];
            class42 var5 = class91.field1656[var4];
            int var6 = class95.field1715.method1466(-5582, 1);
            if (var6 == 0) {
                class65.field1229[class177.field2923++] = var4;
                var5.field1509 = class256.field4266;
            } else {
                int var7 = class95.field1715.method1466(-5582, 2);
                if (var7 == 0) {
                    class65.field1229[class177.field2923++] = var4;
                    var5.field1509 = class256.field4266;
                    class301.field5048[class87.field1555++] = var4;
                } else if (var7 == 1) {
                    class65.field1229[class177.field2923++] = var4;
                    var5.field1509 = class256.field4266;
                    int var8 = class95.field1715.method1466(-5582, 3);
                    var5.method665(false, arg0 + 26987, var8);
                    int var9 = class95.field1715.method1466(-5582, 1);
                    if (var9 == 1) {
                        class301.field5048[class87.field1555++] = var4;
                    }
                } else if (var7 == 2) {
                    class65.field1229[class177.field2923++] = var4;
                    var5.field1509 = class256.field4266;
                    int var10 = class95.field1715.method1466(-5582, 3);
                    var5.method665(true, arg0 ^ 0xFFFF969B, var10);
                    int var11 = class95.field1715.method1466(-5582, 3);
                    var5.method665(true, 7, var11);
                    int var12 = class95.field1715.method1466(-5582, 1);
                    if (var12 == 1) {
                        class301.field5048[class87.field1555++] = var4;
                    }
                } else if (var7 == 3) {
                    class275.field4568[class76.field1314++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([I[IBIZ)V", line = 180)
    public final void method452(int[] arg0, int[] arg1, byte arg2, int arg3, boolean arg4) {
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class150.field2523; var7++) {
                    class218 var8 = class42.method389(var7, (byte) -115);
                    if (var8 != null && !var8.field3631 && (arg4 ? 7 : 0) + var6 == var8.field3633) {
                        arg1[class156.field2622[var6]] = class11.method71(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field997 = arg3;
        this.field1012 = arg0;
        this.field1013 = arg1;
        this.field1016 = arg4;
        field1008++;
        if (arg2 <= 82) {
            field998 = (class40) null;
        }
        this.method453(Integer.MIN_VALUE);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 228)
    private final void method453(int arg0) {
        long var2 = this.field1018;
        this.field1018 = -1L;
        field995++;
        long[] var4 = class237.field3900;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1018 = var4[(int) (((long) (this.field1013[var5] >> 24) ^ this.field1018) & 0xFFL)] ^ this.field1018 >>> 8;
            this.field1018 = this.field1018 >>> 8 ^ var4[(int) ((this.field1018 ^ (long) (this.field1013[var5] >> 16)) & 0xFFL)];
            this.field1018 = this.field1018 >>> 8 ^ var4[(int) ((this.field1018 ^ (long) (this.field1013[var5] >> 8)) & 0xFFL)];
            this.field1018 = var4[(int) ((this.field1018 ^ (long) this.field1013[var5]) & 0xFFL)] ^ this.field1018 >>> 8;
        }
        if (arg0 != Integer.MIN_VALUE) {
            field992 = (class40) null;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1018 = this.field1018 >>> 8 ^ var4[(int) (((long) this.field1012[var6] ^ this.field1018) & 0xFFL)];
        }
        this.field1018 = var4[(int) (((long) (this.field1016 ? 1 : 0) ^ this.field1018) & 0xFFL)] ^ this.field1018 >>> 8;
        if (var2 != 0L && this.field1018 != var2) {
            class254.field4202.method1351((byte) 99, var2);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)V", line = 266)
    public final void method454(int arg0, boolean arg1) {
        field1010++;
        this.field1016 = arg1;
        this.method453(Integer.MIN_VALUE);
        if (arg0 != -9458) {
            this.method456(false, (class300) null, -11);
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V", line = 293)
    public static void method455(int arg0) {
        field998 = null;
        if (arg0 >= -8) {
            field1007 = -60;
        }
        field992 = null;
        field999 = null;
        field1015 = null;
        field1005 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZLpi;I)Lrf;", line = 310)
    public final class266 method456(boolean arg0, class300 arg1, int arg2) {
        field1006++;
        if (this.field997 != -1) {
            return class246.method1740(this.field997, (byte) -32).method915(arg1, arg2, 0);
        }
        class266 var4 = (class266) class68.field1245.method1345(this.field1018, 28150);
        if (arg0) {
            field998 = (class40) null;
        }
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field1013[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((var7 & Integer.MIN_VALUE) != 0 && !class42.method389(var7 & 0x3FFFFFFF, (byte) 66).method1532(0)) {
                        var5 = true;
                    }
                } else if (!class165.method1243(-80, var7 & 0x3FFFFFFF).method1936(this.field1016, (byte) 8)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class311[] var8 = new class311[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field1013[var10];
                if ((var11 & 0x40000000) != 0) {
                    class311 var12 = class165.method1243(-19, var11 & 0x3FFFFFFF).method1932(true, this.field1016);
                    if (var12 != null) {
                        var8[var9++] = var12;
                    }
                } else if ((Integer.MIN_VALUE & var11) != 0) {
                    class311 var13 = class42.method389(var11 & 0x3FFFFFFF, (byte) 49).method1530(0);
                    if (var13 != null) {
                        var8[var9++] = var13;
                    }
                }
            }
            class311 var14 = new class311(var8, var9);
            for (int var15 = 0; var15 < 5; var15++) {
                if (class226.field3738[var15].length > this.field1012[var15]) {
                    var14.method2127(class80.field1411[var15], class226.field3738[var15][this.field1012[var15]]);
                }
                if (class93.field1685[var15].length > this.field1012[var15]) {
                    var14.method2127(class43.field817[var15], class93.field1685[var15][this.field1012[var15]]);
                }
            }
            var4 = var14.method2138(64, 768, -50, -10, -50);
            class68.field1245.method1350(var4, this.field1018, 114);
        }
        if (arg1 != null) {
            var4 = arg1.method2045(arg2, var4, (byte) -95);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIILpi;I)Lrf;", line = 434)
    public final class266 method457(byte arg0, int arg1, int arg2, class300 arg3, int arg4) {
        field1001++;
        long var6 = (long) arg2 << 32 | (long) (arg1 << 16) | (long) arg2;
        if (arg0 != 85) {
            this.method456(false, (class300) null, -56);
        }
        class266 var8 = (class266) class68.field1245.method1345(var6, 28150);
        if (var8 == null) {
            class311[] var9 = new class311[2];
            int var10 = 0;
            if (!class42.method389(arg2, (byte) -126).method1532(0) || !class42.method389(arg1, (byte) 54).method1532(0)) {
                return null;
            }
            class311 var11 = class42.method389(arg2, (byte) 71).method1530(0);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class311 var12 = class42.method389(arg1, (byte) 95).method1530(0);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class311 var13 = new class311(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field1012[var14] < class226.field3738[var14].length) {
                    var13.method2127(class80.field1411[var14], class226.field3738[var14][this.field1012[var14]]);
                }
                if (this.field1012[var14] < class93.field1685[var14].length) {
                    var13.method2127(class43.field817[var14], class93.field1685[var14][this.field1012[var14]]);
                }
            }
            var8 = var13.method2138(64, 768, -50, -10, -50);
            class68.field1245.method1350(var8, var6, arg0 - 10);
        }
        if (arg3 != null) {
            var8 = arg3.method2045(arg4, var8, (byte) -46);
        }
        return var8;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILjd;)V", line = 496)
    public static final void method458(int arg0, class134 arg1) {
        class310.field5208 = arg1;
        if (arg0 != 3) {
            method455(-60);
        }
        field1004++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBILpi;Lpi;)Lrf;", line = 511)
    public final class266 method459(int arg0, byte arg1, int arg2, class300 arg3, class300 arg4) {
        field1019++;
        if (this.field997 != -1) {
            return class246.method1740(this.field997, (byte) -32).method913((byte) -108, arg4, arg0, arg2, arg3);
        }
        int var6 = 112 % ((arg1 + 44) / 49);
        long var7 = this.field1018;
        int[] var9 = this.field1013;
        if (arg4 != null && (arg4.field5009 >= 0 || arg4.field5034 >= 0)) {
            var9 = new int[12];
            for (int var10 = 0; var10 < 12; var10++) {
                var9[var10] = this.field1013[var10];
            }
            if (arg4.field5009 >= 0) {
                if (arg4.field5009 == 65535) {
                    var9[5] = 0;
                    var7 ^= 0xFFFFFFFF00000000L;
                } else {
                    var9[5] = class11.method71(1073741824, arg4.field5009);
                    var7 ^= (long) var9[5] << 32;
                }
            }
            if (arg4.field5034 >= 0) {
                if (arg4.field5034 == 65535) {
                    var9[3] = 0;
                    var7 ^= 0xFFFFFFFFL;
                } else {
                    var9[3] = class11.method71(arg4.field5034, 1073741824);
                    var7 ^= (long) var9[3];
                }
            }
        }
        class266 var11 = (class266) class254.field4202.method1345(var7, 28150);
        if (var11 == null) {
            boolean var12 = false;
            for (int var13 = 0; var13 < 12; var13++) {
                int var14 = var9[var13];
                if ((var14 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var14) != 0 && !class42.method389(var14 & 0x3FFFFFFF, (byte) -118).method1531((byte) 107)) {
                        var12 = true;
                    }
                } else if (!class165.method1243(-99, var14 & 0x3FFFFFFF).method1931(false, this.field1016)) {
                    var12 = true;
                }
            }
            if (var12) {
                if (this.field1011 != -1L) {
                    var11 = (class266) class254.field4202.method1345(this.field1011, 28150);
                }
                if (var11 == null) {
                    return null;
                }
            }
            if (var11 == null) {
                int var15 = 0;
                class311[] var16 = new class311[12];
                for (int var17 = 0; var17 < 12; var17++) {
                    int var18 = var9[var17];
                    if ((var18 & 0x40000000) != 0) {
                        class311 var19 = class165.method1243(-107, var18 & 0x3FFFFFFF).method1939((byte) -112, this.field1016);
                        if (var19 != null) {
                            var16[var15++] = var19;
                        }
                    } else if ((Integer.MIN_VALUE & var18) != 0) {
                        class311 var20 = class42.method389(var18 & 0x3FFFFFFF, (byte) 120).method1528((byte) -128);
                        if (var20 != null) {
                            var16[var15++] = var20;
                        }
                    }
                }
                int var21 = var9[0];
                if ((var21 & 0x40000000) != 0) {
                    class277 var22 = class165.method1243(-65, var21 & 0x3FFFFFFF);
                    if (var22.field4675 != null) {
                        for (int var23 = 0; var23 < var22.field4675.length; var23++) {
                            if (var22.field4675[var23] != null && var16[var23 + 1] != null) {
                                int var24 = var22.field4675[var23][0];
                                int var25 = var22.field4675[var23][1];
                                int var26 = var22.field4675[var23][3];
                                int var27 = var22.field4675[var23][2];
                                int var28 = var22.field4675[var23][4];
                                int var29 = var22.field4675[var23][5];
                                var16[var23 + 1].method2144(var24, var25, var27);
                                var16[var23 + 1].method2141(var26, var28, var29);
                            }
                        }
                    }
                }
                class311 var30 = new class311(var16, var15);
                for (int var31 = 0; var31 < 5; var31++) {
                    if (class226.field3738[var31].length > this.field1012[var31]) {
                        var30.method2127(class80.field1411[var31], class226.field3738[var31][this.field1012[var31]]);
                    }
                    if (class93.field1685[var31].length > this.field1012[var31]) {
                        var30.method2127(class43.field817[var31], class93.field1685[var31][this.field1012[var31]]);
                    }
                }
                var11 = var30.method2138(64, 850, -30, -50, -30);
                if (class21.field350) {
                    ((class152) var11).method1191(false, false, true, true, false, false, true);
                }
                class254.field4202.method1350(var11, var7, -118);
                this.field1011 = var7;
            }
        }
        if (arg4 == null && arg3 == null) {
            return var11;
        }
        class266 var32;
        if (arg4 != null && arg3 != null) {
            var32 = arg4.method2046((byte) 113, var11, arg2, arg3, arg0);
        } else if (arg4 == null) {
            var32 = arg3.method2042(-5284, arg0, var11);
        } else {
            var32 = arg4.method2042(-5284, arg2, var11);
        }
        return var32;
    }
}
