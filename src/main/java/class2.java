import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class2 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public int field22 = 99;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Z")
    private boolean field33 = false;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Z")
    public boolean field29 = false;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public int field42 = -1;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public int field35 = -1;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public int field27 = -1;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public int field38 = 2;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public int field47 = -1;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public int field25 = 5;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public int field48 = -1;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Leg;")
    public static class37 field36 = class174.method1167("Fichiers config charg-Bs", 87);

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "Leg;")
    public static class37 field43 = class174.method1167("http:)4)4", -107);

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "Z")
    public static boolean field50 = false;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Ljl;")
    public static class101 field21;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "Lnc;")
    public static class11 field39;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "[I")
    public int[] field24;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "[I")
    private int[] field37;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "[I")
    private int[] field41;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "[I")
    public int[] field46;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[[I")
    public int[][] field26;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILbl;II)Lbl;")
    public final class253 method9(int arg0, class253 arg1, int arg2, int arg3) {
        field40++;
        int var5 = this.field24[arg2];
        class63 var6 = class203.method1416((byte) -82, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method1450(true, true);
        }
        class253 var8 = arg1.method1450(!var6.method446(false, var7), !this.field33);
        int var9 = arg0 & 0x3;
        if (var9 == 1) {
            var8.method1470();
        } else if (var9 == 2) {
            var8.method1446();
        } else if (var9 == 3) {
            var8.method1451();
        }
        var8.method1448(var6, var7, this.field33);
        if (var9 == 1) {
            var8.method1451();
        } else if (var9 == 2) {
            var8.method1446();
        } else if (var9 == 3) {
            var8.method1470();
        }
        if (arg3 != -1) {
            method16(false, true, 87, 107, 70, 120, -93);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lbl;BI)Lbl;")
    public final class253 method10(class253 arg0, byte arg1, int arg2) {
        field28++;
        int var4 = this.field24[arg2];
        if (arg1 != 111) {
            return null;
        }
        class63 var5 = class203.method1416((byte) -82, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1450(true, true);
        } else {
            class253 var7 = arg0.method1450(!var5.method446(false, var6), !this.field33);
            var7.method1448(var5, var6, this.field33);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static void method11(byte arg0) {
        field21 = null;
        if (arg0 == -72) {
            field36 = null;
            field39 = null;
            field43 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lie;Lbl;III)Lbl;")
    public final class253 method12(class2 arg0, class253 arg1, int arg2, int arg3, int arg4) {
        field51++;
        int var6 = this.field24[arg4];
        class63 var7 = class203.method1416((byte) -82, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method10(arg1, (byte) 111, arg3);
        }
        int var9 = arg0.field24[arg3];
        if (arg2 > -87) {
            this.field22 = 104;
        }
        class63 var10 = class203.method1416((byte) -82, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class253 var12 = arg1.method1450(!var7.method446(false, var8), !this.field33);
            var12.method1448(var7, var8, this.field33);
            return var12;
        } else {
            class253 var13 = arg1.method1450(!var7.method446(false, var8) & !var10.method446(false, var11), !arg0.field33 & !this.field33);
            var13.method1462(var7, var8, var10, var11, this.field41, arg0.field33 | this.field33);
            return var13;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZLva;)V")
    private final void method13(int arg0, boolean arg1, class187 arg2) {
        field23++;
        if (arg0 == 1) {
            int var13 = arg2.method1244(false);
            this.field46 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field46[var14] = arg2.method1244(!arg1);
            }
            this.field24 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field24[var15] = arg2.method1244(false);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field24[var16] = (arg2.method1244(false) << 16) + this.field24[var16];
            }
        } else if (arg0 == 2) {
            this.field47 = arg2.method1244(!arg1);
        } else if (arg0 == 3) {
            int var4 = arg2.method1268(255);
            this.field41 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field41[var5] = arg2.method1268(255);
            }
            this.field41[var4] = 9999999;
        } else if (arg0 == 4) {
            this.field29 = true;
        } else if (arg0 == 5) {
            this.field25 = arg2.method1268(255);
        } else if (arg0 == 6) {
            this.field48 = arg2.method1244(false);
        } else if (arg0 == 7) {
            this.field35 = arg2.method1244(false);
        } else if (arg0 == 8) {
            this.field22 = arg2.method1268(255);
        } else if (arg0 == 9) {
            this.field27 = arg2.method1268(255);
        } else if (arg0 == 10) {
            this.field42 = arg2.method1268(255);
        } else if (arg0 == 11) {
            this.field38 = arg2.method1268(255);
        } else if (arg0 == 12) {
            int var10 = arg2.method1268(255);
            this.field37 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field37[var11] = arg2.method1244(false);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field37[var12] += arg2.method1244(false) << 16;
            }
        } else if (arg0 == 13) {
            int var6 = arg2.method1244(false);
            this.field26 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method1268(255);
                if (var8 > 0) {
                    this.field26[var7] = new int[var8];
                    this.field26[var7][0] = arg2.method1248((byte) 79);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field26[var7][var9] = arg2.method1244(!arg1);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field33 = true;
        }
        if (!arg1) {
            this.method15((class253) null, 1, -88);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BILjl;)Lni;")
    public static final class195 method14(byte arg0, int arg1, class101 arg2) {
        field31++;
        if (class170.method1139((byte) 26, arg1, arg2)) {
            return arg0 >= -39 ? null : class252.method1727(-110);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lbl;II)Lbl;")
    public final class253 method15(class253 arg0, int arg1, int arg2) {
        field30++;
        int var4 = this.field24[arg2];
        class63 var5 = class203.method1416((byte) -82, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1450(true, true);
        }
        class63 var7 = null;
        int var8 = 0;
        if (this.field37 != null && arg2 < this.field37.length) {
            int var9 = this.field37[arg2];
            var7 = class203.method1416((byte) -82, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class253 var12 = arg0.method1450(!var5.method446(false, var6), !this.field33);
            var12.method1448(var5, var6, this.field33);
            return var12;
        }
        class253 var10 = arg0.method1450(!var5.method446(false, var6) & !var7.method446(false, var8), !this.field33);
        int var11 = -96 / ((56 - arg1) / 44);
        var10.method1448(var5, var6, this.field33);
        var10.method1448(var7, var8, this.field33);
        return var10;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZZIIIII)V")
    public static final void method16(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field49++;
        if (class260.field4598 == arg5 && class68.field1073 == arg3 && class73.field1149 == arg6 || class72.method492(-2001)) {
            return;
        }
        class260.field4598 = arg5;
        class73.field1149 = arg6;
        class68.field1073 = arg3;
        if (class72.method492(-2001)) {
            class73.field1149 = 0;
        }
        if (arg1) {
            class102.method683(28, false);
        } else {
            class102.method683(25, false);
        }
        class115.method824((byte) 79, class228.field3926, true);
        int var7 = class144.field2456;
        class144.field2456 = (arg3 - 6) * 8;
        int var8 = class40.field642;
        class40.field642 = arg5 * 8 - 48;
        class260.field4603 = class134.method964(-8239, class260.field4598 * 8, class68.field1073 * 8);
        class27.field393 = null;
        int var9 = class40.field642 - var8;
        int var10 = class144.field2456 - var7;
        int var11 = class144.field2456;
        int var12 = class40.field642;
        if (arg1) {
            class46.field729 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class163 var14 = class55.field833[var13];
                if (var14 != null) {
                    var14.field1799 -= var9 * 128;
                    var14.field1793 -= var10 * 128;
                    if (var14.field1799 >= 0 && var14.field1799 <= 13184 && var14.field1793 >= 0 && var14.field1793 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field1812[var15] -= var9;
                            var14.field1780[var15] -= var10;
                        }
                        class98.field1525[class46.field729++] = var13;
                    } else {
                        class55.field833[var13].field2691 = null;
                        class55.field833[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class163 var32 = class55.field833[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field1812[var33] -= var9;
                        var32.field1780[var33] -= var10;
                    }
                    var32.field1799 -= var9 * 128;
                    var32.field1793 -= var10 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class188 var30 = class98.field1526[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field1812[var31] -= var9;
                    var30.field1780[var31] -= var10;
                }
                var30.field1799 -= var9 * 128;
                var30.field1793 -= var10 * 128;
            }
        }
        class237.field4140 = arg6;
        byte var18 = 104;
        byte var19 = 0;
        byte var20 = 1;
        if (var9 < 0) {
            var20 = -1;
            var18 = -1;
            var19 = 103;
        }
        class82.field1285.method1301(arg2, arg4, arg0, 4484);
        byte var21 = 0;
        byte var22 = 104;
        byte var23 = 1;
        if (var10 < 0) {
            var21 = 103;
            var22 = -1;
            var23 = -1;
        }
        for (int var24 = var19; var24 != var18; var24 += var20) {
            for (int var26 = var21; var26 != var22; var26 += var23) {
                int var27 = var9 + var24;
                int var28 = var10 + var26;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class210.field3621[var29][var24][var26] = class210.field3621[var29][var27][var28];
                    } else {
                        class210.field3621[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class81 var25 = (class81) class140.field2402.method1566(-3); var25 != null; var25 = (class81) class140.field2402.method1570(3)) {
            var25.field1272 -= var10;
            var25.field1261 -= var9;
            if (var25.field1261 < 0 || var25.field1272 < 0 || var25.field1261 >= 104 || var25.field1272 >= 104) {
                var25.method441(16773377);
            }
        }
        class84.field1314 = -1;
        if (arg1) {
            class213.field3683 -= var9 * 128;
            class24.field327 -= var10;
            class200.field3403 -= var10 * 128;
            class81.field1268 -= var9;
            class262.field4619 -= var10;
            class49.field776 -= var9;
        } else {
            class273.field4794 = 1;
        }
        class159.field2658 = 0;
        if (class73.field1159 != 0) {
            class59.field975 -= var10;
            class73.field1159 -= var9;
        }
        class281.field4956.method1573(84);
        class59.field952.method1573(124);
        class193.method1325();
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lva;B)V")
    public final void method17(class187 arg0, byte arg1) {
        field44++;
        while (true) {
            int var3 = arg0.method1268(255);
            if (var3 == 0) {
                int var4 = -123 % ((58 - arg1) / 50);
                return;
            }
            this.method13(var3, true, arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
    public final void method18(boolean arg0) {
        if (!arg0) {
            this.field29 = true;
        }
        if (this.field42 == -1) {
            if (this.field41 == null) {
                this.field42 = 0;
            } else {
                this.field42 = 2;
            }
        }
        field45++;
        if (this.field27 != -1) {
            return;
        }
        if (this.field41 == null) {
            this.field27 = 0;
        } else {
            this.field27 = 2;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lbl;II)Lbl;")
    public final class253 method19(class253 arg0, int arg1, int arg2) {
        field34++;
        int var4 = this.field24[arg2];
        class63 var5 = class203.method1416((byte) -82, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1464(true, true);
        }
        class253 var7 = arg0.method1464(!var5.method446(false, var6), !this.field33);
        if (arg1 != 157809136) {
            field43 = null;
        }
        var7.method1448(var5, var6, this.field33);
        return var7;
    }
}
