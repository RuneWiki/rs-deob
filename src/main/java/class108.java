import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class108 {

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "[I")
    private int[] field1622;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "[I")
    private int[] field1610;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "[I")
    public static int[] field1612 = new int[2];

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "[I")
    public static int[] field1617 = new int[2048];

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    private int field1614;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
    private int field1624;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "Lr;")
    public static class110 field1627;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "[I")
    public static int[] field1626;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I")
    public final int method665(int arg0) {
        field1613++;
        if (this.field1625 == 0) {
            this.method670(11611);
            this.field1625 = 256;
        }
        int var2 = 121 % ((arg0 + 46) / 60);
        return this.field1622[this.field1625 - 1];
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)I")
    public final int method666(byte arg0) {
        field1620++;
        if (arg0 != 63) {
            this.field1614 = 109;
        }
        if (this.field1625 == 0) {
            this.method670(11611);
            this.field1625 = 256;
        }
        return this.field1622[--this.field1625];
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
    public static void method667(boolean arg0) {
        field1626 = null;
        field1612 = null;
        if (arg0) {
            field1617 = null;
            field1627 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lhc;IIIII)V")
    public static final void method668(class84 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field1100 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class132.field1943[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class263 var13 = class276.field3652[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field1100; var14++) {
                            if (arg0.field1107[var14] == var13) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field1107[arg0.field1100++] = var13;
                        if (arg0.field1100 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field1100; var15 < 4; var15++) {
            arg0.field1107[var15] = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
    private final void method669(int arg0) {
        field1616++;
        if (arg0 != -5170) {
            this.method666((byte) -3);
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var5 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var63 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var66 + var69;
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var69 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            int var76 = var73 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1622[var11 + 6] + var3;
            int var38 = this.field1622[var11 + 4] + var5;
            int var39 = this.field1622[var11 + 7] + var2;
            int var40 = this.field1622[var11 + 5] + var4;
            int var41 = this.field1622[var11 + 3] + var6;
            int var42 = this.field1622[var11 + 1] + var8;
            int var43 = this.field1622[var11 + 2] + var7;
            int var44 = this.field1622[var11] + var9;
            int var45 = var44 ^ var42 << 11;
            int var46 = var41 + var45;
            int var47 = var42 + var43;
            int var48 = var47 ^ var43 >>> 2;
            int var49 = var43 + var46;
            int var50 = var38 + var48;
            int var51 = var49 ^ var46 << 8;
            int var52 = var46 + var50;
            int var53 = var40 + var51;
            var6 = var52 ^ var50 >>> 16;
            int var54 = var50 + var53;
            int var55 = var6 + var37;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            int var57 = var5 + var39;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var55 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field1610[var11] = var9;
            this.field1610[var11 + 1] = var8;
            this.field1610[var11 + 2] = var7;
            this.field1610[var11 + 3] = var6;
            this.field1610[var11 + 4] = var5;
            this.field1610[var11 + 5] = var4;
            this.field1610[var11 + 6] = var3;
            this.field1610[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1610[var12 + 7] + var2;
            int var14 = this.field1610[var12] + var9;
            int var15 = this.field1610[var12 + 5] + var4;
            int var16 = this.field1610[var12 + 4] + var5;
            int var17 = this.field1610[var12 + 1] + var8;
            int var18 = this.field1610[var12 + 6] + var3;
            int var19 = this.field1610[var12 + 3] + var6;
            int var20 = this.field1610[var12 + 2] + var7;
            int var21 = var14 ^ var17 << 11;
            int var22 = var17 + var20;
            int var23 = var19 + var21;
            int var24 = var22 ^ var20 >>> 2;
            int var25 = var20 + var23;
            int var26 = var16 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var23 + var26;
            int var29 = var15 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var6 + var18;
            int var31 = var26 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            int var33 = var5 + var13;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field1610[var12] = var9;
            this.field1610[var12 + 1] = var8;
            this.field1610[var12 + 2] = var7;
            this.field1610[var12 + 3] = var6;
            this.field1610[var12 + 4] = var5;
            this.field1610[var12 + 5] = var4;
            this.field1610[var12 + 6] = var3;
            this.field1610[var12 + 7] = var2;
        }
        this.method670(arg0 + 16781);
        this.field1625 = 256;
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
    private final void method670(int arg0) {
        if (arg0 != 11611) {
            this.field1621 = -26;
        }
        field1623++;
        this.field1621 += ++this.field1624;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1610[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1614 ^= this.field1614 << 13;
                } else {
                    this.field1614 ^= this.field1614 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1614 ^= this.field1614 << 2;
            } else {
                this.field1614 ^= this.field1614 >>> 16;
            }
            this.field1614 += this.field1610[var2 + 128 & 0xFF];
            int var4;
            this.field1610[var2] = var4 = this.field1621 + this.field1610[class99.method612(var3, 1020) >> 2] + this.field1614;
            this.field1622[var2] = this.field1621 = this.field1610[class99.method612(1020, var4 >> 8) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)[Ls;")
    public static final class169[] method671(int arg0) {
        field1615++;
        return arg0 <= 87 ? null : new class169[] { class96.field1415, class120.field1769, class129.field1901, class206.field2790, class143.field2072, class39.field566, class225.field2976, class490.field6831, class162.field2262, class80.field1073, class140.field2045, class231.field3067, class324.field4324, class76.field1017, class1.field22 };
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)I")
    public static final int method672(int arg0, int arg1) {
        if (arg0 > -125) {
            method668((class84) null, 123, -73, 42, 96, -58);
        }
        field1611++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field1619++;
        if (arg6 < 128 || arg1 < 128 || (class295.field3947 - 2) * 128 < arg6 || (class39.field567 - 2) * 128 < arg1) {
            class168.field2324[0] = class168.field2324[1] = -1;
        } else if (arg8 == 25) {
            int var10 = class247.method1385(arg8 - 131, arg6, arg1, arg2) - arg0;
            class62.field820.method1027(arg3, 0, 0);
            class98.field1432.method1956(class62.field820);
            class98.field1432.method1986(arg6, var10, arg1, class168.field2324);
            class62.field820.method1027(-arg3, 0, 0);
            class98.field1432.method1956(class62.field820);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lnh;I)V")
    public static final void method674(class487 arg0, int arg1) {
        field1618++;
        int var2 = 69 % ((arg1 + 58) / 43);
        class279 var3 = (class279) class208.field2806.method1528((long) arg0.field1163, 112);
        if (var3 == null) {
            class412.method2473((class88) null, arg0.field1197[0], 0, arg0, (class121) null, (byte) 110, arg0.field1193[0], arg0.field6502);
        } else {
            var3.method1575(false);
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
    private class108() {
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "([I)V")
    public class108(int[] arg0) {
        this.field1622 = new int[256];
        this.field1610 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1622[var2] = arg0[var2];
        }
        this.method669(-5170);
    }
}
