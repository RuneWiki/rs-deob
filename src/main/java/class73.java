import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class73 extends class124 {

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
    private int field1262 = 1;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    private int field1261 = 1;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "Le;")
    public static class191 field1257 = class54.method368("Abbrechen", 2047);

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "Le;")
    private static class191 field1263 = class54.method368("glow2:", 2047);

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "Le;")
    public static class191 field1264 = class54.method368(")2", 2047);

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "Le;")
    public static class191 field1256 = field1263;

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "Le;")
    public static class191 field1267 = field1263;

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "I")
    public static int field1270 = 0;

    @OriginalMember(owner = "client!gb", name = "eb", descriptor = "[I")
    public static int[] field1271 = new int[2048];

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "Lwd;")
    public static class97 field1259 = new class97(8);

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "(I)V")
    public static final void method474(int arg0) {
        ++field1258;
        class184.method1238(class158.field2686, (byte) -43);
        ++class249.field4426;
        if (class163.field2758 && class56.field1034) {
            int var1 = class189.field3325;
            int var2 = class133.field2229;
            int var3 = class158.field2686.field545;
            int var4 = var2 - class61.field1107;
            int var5 = var1 - class258.field4580;
            if (class143.field2374 > var4) {
                var4 = class143.field2374;
            }
            if (~class266.field4714 < ~var5) {
                var5 = class266.field4714;
            }
            if (class158.field2686.field537 + var5 > class266.field4714 + class56.field1037.field537) {
                var5 = class266.field4714 + class56.field1037.field537 + -class158.field2686.field537;
            }
            if (class158.field2686.field561 + var4 > class143.field2374 + class56.field1037.field561) {
                var4 = -class158.field2686.field561 + class56.field1037.field561 + class143.field2374;
            }
            int var6 = -class143.field2374 + class56.field1037.field534 + var4;
            int var7 = class56.field1037.field585 + var5 - class266.field4714;
            int var8 = -class134.field2257 + var4;
            int var9 = -class263.field4657 + var5;
            if (class158.field2686.field511 < class249.field4426 && (~var3 > ~var9 || ~var9 > ~(-var3) || ~var3 > ~var8 || var8 < -var3)) {
                class138.field2323 = true;
            }
            if (class158.field2686.field595 != null && class138.field2323) {
                class61 var10 = new class61();
                var10.field1091 = var6;
                var10.field1100 = var7;
                var10.field1089 = class158.field2686;
                var10.field1101 = class158.field2686.field595;
                class12.method87(var10, arg0 + 3795);
            }
            if (arg0 != -16729) {
                field1267 = null;
            }
            if (~class51.field929 == -1) {
                if (!class138.field2323) {
                    if ((class190.field3342 == 1 || class164.method1107(false, class167.field2824 + -1)) && ~class167.field2824 < -3) {
                        class225.method1609(613072615);
                    } else if (~class167.field2824 < -1) {
                        class172.method1157((byte) 118);
                    }
                } else {
                    if (class158.field2686.field507 != null) {
                        class61 var11 = new class61();
                        var11.field1101 = class158.field2686.field507;
                        var11.field1100 = var7;
                        var11.field1089 = class158.field2686;
                        var11.field1088 = class168.field2838;
                        var11.field1091 = var6;
                        class12.method87(var11, -12934);
                    }
                    if (class168.field2838 != null && client.method673(class158.field2686) != null) {
                        ++class241.field4276;
                        class53.field963.method1096(64, 0);
                        class53.field963.method1616(0, class158.field2686.field491);
                        class53.field963.method1558(120, class158.field2686.field589);
                        class53.field963.method1602(class168.field2838.field589, false);
                        class53.field963.method1565(class168.field2838.field491, true);
                    }
                }
                class158.field2686 = null;
            }
        } else {
            if (class249.field4426 > 1) {
                class158.field2686 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(III)Lag;")
    public static final class254 method475(int arg0, int arg1, int arg2) {
        class199 var3 = class201.field3608[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class254 var4 = var3.field3535;
            var3.field3535 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        ++field1269;
        int[] var3 = super.field2064.method378(arg1, 0);
        if (arg0 <= 68) {
            method477(-40);
        }
        if (super.field2064.field1035) {
            int var4 = this.field1262 + 1 + this.field1262;
            int var5 = 65536 / var4;
            int var6 = this.field1261 + 1 - -this.field1261;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field1262; var9 <= this.field1262 + arg1; ++var9) {
                int[] var13 = this.method844(0, 59, var9 & class181.field3119);
                int[] var14 = new int[class64.field1132];
                int var15 = 0;
                for (int var16 = -this.field1261; var16 <= this.field1261; ++var16) {
                    var15 += var13[class8.field82 & var16];
                }
                int var17 = 0;
                while (class64.field1132 > var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field1261 + var17 & class8.field82];
                    ++var17;
                    var15 = var13[this.field1261 + var17 & class8.field82] + var18;
                }
                var8[var9 - arg1 + this.field1262] = var14;
            }
            for (int var10 = 0; ~var10 > ~class64.field1132; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
    public static void method476(byte arg0) {
        field1271 = null;
        field1264 = null;
        field1267 = null;
        field1263 = null;
        field1257 = null;
        field1256 = null;
        field1259 = null;
        if (arg0 >= -23) {
            field1256 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (!arg2) {
            this.method137(118, (byte) -24);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field2063 = arg1.method1580(-118) == 1;
                }
            } else {
                this.field1262 = arg1.method1580(-54);
            }
        } else {
            this.field1261 = arg1.method1580(-31);
        }
        ++field1266;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        ++field1265;
        if (arg1 != -7) {
            return null;
        } else {
            int[][] var3 = super.field2053.method1775((byte) -126, arg0);
            if (super.field2053.field4558) {
                int var4 = this.field1262 + this.field1262 + 1;
                int var5 = this.field1261 + 1 + this.field1261;
                int var6 = 65536 / var5;
                int[][][] var7 = new int[var4][][];
                for (int var8 = -this.field1262 + arg0; ~(this.field1262 + arg0) <= ~var8; ++var8) {
                    int[][] var19 = this.method843((byte) -125, class181.field3119 & var8, 0);
                    int var20 = 0;
                    int var21 = 0;
                    int var22 = 0;
                    int[] var23 = var19[1];
                    int[] var24 = var19[2];
                    int[] var25 = var19[0];
                    int[][] var26 = new int[3][class64.field1132];
                    for (int var27 = -this.field1261; ~this.field1261 <= ~var27; ++var27) {
                        int var37 = class8.field82 & var27;
                        var20 += var25[var37];
                        var22 += var24[var37];
                        var21 += var23[var37];
                    }
                    int[] var28 = var26[0];
                    int[] var29 = var26[2];
                    int[] var30 = var26[1];
                    int var31 = 0;
                    while (class64.field1132 > var31) {
                        var28[var31] = var6 * var20 >> 16;
                        var30[var31] = var6 * var21 >> 16;
                        var29[var31] = var6 * var22 >> 16;
                        int var32 = class8.field82 & -this.field1261 + var31;
                        int var33 = var21 - var23[var32];
                        ++var31;
                        int var34 = var20 - var25[var32];
                        int var35 = var22 - var24[var32];
                        int var36 = class8.field82 & this.field1261 + var31;
                        var21 = var23[var36] + var33;
                        var20 = var25[var36] + var34;
                        var22 = var24[var36] + var35;
                    }
                    var7[-arg0 + this.field1262 + var8] = var26;
                }
                int var9 = 65536 / var4;
                int[] var10 = var3[1];
                int[] var11 = var3[2];
                int[] var12 = var3[0];
                for (int var13 = 0; class64.field1132 > var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var4 > var17; ++var17) {
                        int[][] var18 = var7[var17];
                        var15 += var18[1][var13];
                        var16 += var18[2][var13];
                        var14 += var18[0][var13];
                    }
                    var12[var13] = var9 * var14 >> 16;
                    var10[var13] = var9 * var15 >> 16;
                    var11[var13] = var9 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class73() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "(I)V")
    public static final void method477(int arg0) {
        ++field1260;
        class107.field1776.method1093((byte) 29);
        int var1 = class107.field1776.method1099((byte) 127, 1);
        if (arg0 == 143320720) {
            if (var1 != 0) {
                int var2 = class107.field1776.method1099((byte) 118, 2);
                if (var2 == 0) {
                    class18.field247[class90.field1460++] = 2047;
                } else if (~var2 == -2) {
                    int var3 = class107.field1776.method1099((byte) 127, 3);
                    class175.field2946.method1190(true, false, var3);
                    int var4 = class107.field1776.method1099((byte) 119, 1);
                    if (var4 == 1) {
                        class18.field247[class90.field1460++] = 2047;
                    }
                } else if (var2 == 2) {
                    int var5 = class107.field1776.method1099((byte) 125, 3);
                    class175.field2946.method1190(true, true, var5);
                    int var6 = class107.field1776.method1099((byte) 116, 3);
                    class175.field2946.method1190(true, true, var6);
                    int var7 = class107.field1776.method1099((byte) 122, 1);
                    if (var7 == 1) {
                        class18.field247[class90.field1460++] = 2047;
                    }
                } else if (~var2 == -4) {
                    int var8 = class107.field1776.method1099((byte) 122, 1);
                    if (var8 == 1) {
                        class18.field247[class90.field1460++] = 2047;
                    }
                    int var9 = class107.field1776.method1099((byte) 118, 7);
                    int var10 = class107.field1776.method1099((byte) 126, 7);
                    class261.field4598 = class107.field1776.method1099((byte) 125, 2);
                    int var11 = class107.field1776.method1099((byte) 125, 1);
                    class175.field2946.method492(var10, var9, (byte) 113, ~var11 == -2);
                }
            }
        }
    }
}
