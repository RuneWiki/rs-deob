import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class104 {

    @OriginalMember(owner = "client!le", name = "r", descriptor = "[I")
    private int[] field1569;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "[I")
    private int[] field1562;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lmm;")
    public static class43 field1554 = new class43();

    @OriginalMember(owner = "client!le", name = "w", descriptor = "[I")
    public static int[] field1574 = new int[32];

    @OriginalMember(owner = "client!le", name = "s", descriptor = "Ll;")
    public static class66 field1570 = new class66(64);

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field1575 = 0;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    private int field1558;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "[I")
    public static int[] field1571;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 11)
    public static final void method899(int arg0, byte arg1, String arg2) {
        field1553++;
        boolean var3 = false;
        if (arg1 != -37) {
            method902(true, (byte) 21);
        }
        for (int var4 = 0; var4 < class66.field995; var4++) {
            class171 var5 = class177.field2795[class345.field5495[var4]];
            if (var5 != null && var5.field2706 != null && var5.field2706.equalsIgnoreCase(arg2)) {
                var3 = true;
                if (arg0 == 1) {
                    class4.field54++;
                    class99.field1491.method1628((byte) -112, 229);
                    class99.field1491.method263(class345.field5495[var4], false);
                    class99.field1491.method273(arg1 ^ 0xFFFFFFDB, 0);
                } else if (arg0 == 4) {
                    class99.field1491.method1628((byte) -65, 180);
                    class99.field1491.method263(class345.field5495[var4], false);
                    class99.field1491.method285(0, 0);
                    class44.field710++;
                } else if (arg0 == 5) {
                    class290.field4508++;
                    class99.field1491.method1628((byte) -48, 175);
                    class99.field1491.method278(-14598, 0);
                    class99.field1491.method304(false, class345.field5495[var4]);
                } else if (arg0 == 6) {
                    class74.field1105++;
                    class99.field1491.method1628((byte) -85, 207);
                    class99.field1491.method285(0, 0);
                    class99.field1491.method258(class345.field5495[var4], (byte) 78);
                } else if (arg0 == 7) {
                    class134.field2241++;
                    class99.field1491.method1628((byte) -92, 32);
                    class99.field1491.method306(class345.field5495[var4], 124);
                    class99.field1491.method285(0, 0);
                }
                break;
            }
        }
        if (!var3) {
            class101.method882(-1, class314.field4857 + arg2);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V", line = 89)
    public static final void method900(boolean arg0) {
        field1565++;
        class148.field2423.method655(-1);
        if (!arg0) {
            method907((byte) 109, -117);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBIIIIIIIIZ)V", line = 101)
    public static final void method901(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field1559++;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                class335.field5123[var11][var12] = 0;
                class321.field4947[var11][var12] = 99999999;
            }
        }
        if (arg1 >= -67) {
            method903(95);
        }
        int var13 = arg6;
        class335.field5123[arg6][arg2] = 99;
        int var14 = arg2;
        class321.field4947[arg6][arg2] = 0;
        byte var15 = 0;
        int var16 = 0;
        class274.field4253[var15] = arg6;
        int var28 = var15 + 1;
        class89.field1270[var15] = arg2;
        boolean var17 = false;
        int[][] var18 = class57.field905[class119.field1826].field4520;
        while (var28 != var16) {
            var13 = class274.field4253[var16];
            var14 = class89.field1270[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg4 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class57.field905[class119.field1826].method2102(arg3, arg0 - 1, 1, var13, var14, arg4, (byte) -128, arg9)) {
                    var17 = true;
                    break;
                }
                if (arg0 < 10 && class57.field905[class119.field1826].method2093(arg4, arg0 - 1, arg9, var14, arg3, var13, 1, 1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg5 != 0 && class57.field905[class119.field1826].method2095(arg8, arg5, var14, var13, 1, -116, arg3, arg4, arg7)) {
                var17 = true;
                break;
            }
            int var19 = class321.field4947[var13][var14] + 1;
            if (var13 > 0 && class335.field5123[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x2C0108) == 0) {
                class274.field4253[var28] = var13 - 1;
                class89.field1270[var28] = var14;
                class335.field5123[var13 - 1][var14] = 2;
                var28 = var28 + 1 & 0xFFF;
                class321.field4947[var13 - 1][var14] = var19;
            }
            if (var13 < 103 && class335.field5123[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x2C0180) == 0) {
                class274.field4253[var28] = var13 + 1;
                class89.field1270[var28] = var14;
                var28 = var28 + 1 & 0xFFF;
                class335.field5123[var13 + 1][var14] = 8;
                class321.field4947[var13 + 1][var14] = var19;
            }
            if (var14 > 0 && class335.field5123[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x2C0102) == 0) {
                class274.field4253[var28] = var13;
                class89.field1270[var28] = var14 - 1;
                var28 = var28 + 1 & 0xFFF;
                class335.field5123[var13][var14 - 1] = 1;
                class321.field4947[var13][var14 - 1] = var19;
            }
            if (var14 < 103 && class335.field5123[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x2C0120) == 0) {
                class274.field4253[var28] = var13;
                class89.field1270[var28] = var14 + 1;
                var28 = var28 + 1 & 0xFFF;
                class335.field5123[var13][var14 + 1] = 4;
                class321.field4947[var13][var14 + 1] = var19;
            }
            if (var13 > 0 && var14 > 0 && class335.field5123[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x2C010E) == 0 && (var18[var13 - 1][var14] & 0x2C0108) == 0 && (var18[var13][var14 - 1] & 0x2C0102) == 0) {
                class274.field4253[var28] = var13 - 1;
                class89.field1270[var28] = var14 - 1;
                class335.field5123[var13 - 1][var14 - 1] = 3;
                var28 = var28 + 1 & 0xFFF;
                class321.field4947[var13 - 1][var14 - 1] = var19;
            }
            if (var13 < 103 && var14 > 0 && class335.field5123[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x2C0183) == 0 && (var18[var13 + 1][var14] & 0x2C0180) == 0 && (var18[var13][var14 - 1] & 0x2C0102) == 0) {
                class274.field4253[var28] = var13 + 1;
                class89.field1270[var28] = var14 - 1;
                var28 = var28 + 1 & 0xFFF;
                class335.field5123[var13 + 1][var14 - 1] = 9;
                class321.field4947[var13 + 1][var14 - 1] = var19;
            }
            if (var13 > 0 && var14 < 103 && class335.field5123[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x2C0138) == 0 && (var18[var13 - 1][var14] & 0x2C0108) == 0 && (var18[var13][var14 + 1] & 0x2C0120) == 0) {
                class274.field4253[var28] = var13 - 1;
                class89.field1270[var28] = var14 + 1;
                var28 = var28 + 1 & 0xFFF;
                class335.field5123[var13 - 1][var14 + 1] = 6;
                class321.field4947[var13 - 1][var14 + 1] = var19;
            }
            if (var13 < 103 && var14 < 103 && class335.field5123[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x2C01E0) == 0 && (var18[var13 + 1][var14] & 0x2C0180) == 0 && (var18[var13][var14 + 1] & 0x2C0120) == 0) {
                class274.field4253[var28] = var13 + 1;
                class89.field1270[var28] = var14 + 1;
                class335.field5123[var13 + 1][var14 + 1] = 12;
                class321.field4947[var13 + 1][var14 + 1] = var19;
                var28 = var28 + 1 & 0xFFF;
            }
        }
        if (!var17) {
            if (!arg10) {
                return;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg4 - var22; var23 <= (arg4 + var22); var23++) {
                for (int var24 = arg3 - var22; var24 <= (arg3 + var22); var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class321.field4947[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg3 > var24) {
                            var25 = arg3 - var24;
                        } else if (var24 > (arg3 + arg5 - 1)) {
                            var25 = var24 - arg5 - (arg3 - 1);
                        }
                        int var26 = 0;
                        if (arg4 > var23) {
                            var26 = arg4 - var23;
                        } else if (var23 > (arg4 + arg8 - 1)) {
                            var26 = var23 - arg8 - (arg4 - 1);
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && class321.field4947[var23][var24] < var21) {
                            var13 = var23;
                            var14 = var24;
                            var21 = class321.field4947[var23][var24];
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return;
            }
            if (arg6 == var13 && arg2 == var14) {
                return;
            }
        }
        class29.field472 = false;
        class278.field4291 = var14;
        class266.field4126 = var13;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZB)V", line = 340)
    public static final void method902(boolean arg0, byte arg1) {
        field1556++;
        class103.method898(class20.field325, class105.field1584, class154.field2490, class347.field5517);
        if (arg1 != 36) {
            field1574 = (int[]) null;
        }
        class103.method896(class353.field5641, class105.field1580, arg0);
        class103.method893((float) class98.field1483, (float) class337.field5186, (float) class15.field247);
        class103.method892();
        class39.field588 = class146.field2383;
        class41.field657 = class224.field3511;
        class39.field584 = class64.field981;
        class39.field592 = class285.field4428;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 363)
    public static final void method903(int arg0) {
        class231.field3610.method655(arg0);
        field1561++;
        class191.field3002.method655(arg0);
        class346.field5504.method655(arg0 ^ 0x0);
        class223.field3465.method655(-1);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V", line = 378)
    public static final void method904(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= arg3) {
            for (int var5 = arg1; var5 < arg3; var5++) {
                class133.field2235[var5][arg0] = arg4;
            }
        } else {
            for (int var6 = arg3; var6 < arg1; var6++) {
                class133.field2235[var6][arg0] = arg4;
            }
        }
        if (arg2 != 1) {
            field1575 = 63;
        }
        field1564++;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 414)
    private final void method905(int arg0) {
        field1557++;
        this.field1560 += ++this.field1567;
        if (arg0 != 1) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1562[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1558 ^= this.field1558 << 13;
                } else {
                    this.field1558 ^= this.field1558 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1558 ^= this.field1558 << 2;
            } else {
                this.field1558 ^= this.field1558 >>> 16;
            }
            this.field1558 += this.field1562[var2 + 128 & 0xFF];
            int var4;
            this.field1562[var2] = var4 = this.field1562[class301.method2169(255, var3 >> 2)] - (-this.field1560 - this.field1558);
            this.field1569[var2] = this.field1560 = this.field1562[class301.method2169(1020, var4 >> 8) >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)I", line = 457)
    public final int method906(int arg0) {
        field1566++;
        if (this.field1552-- == 0) {
            this.method905(1);
            this.field1552 = 255;
        }
        int var2 = 74 / ((arg0 - 50) / 60);
        return this.field1569[this.field1552];
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)V", line = 473)
    public static final void method907(byte arg0, int arg1) {
        field1555++;
        class138 var2 = class149.method1242(arg1, 0, 4);
        if (arg0 == 103) {
            var2.method1152(125);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BII)I", line = 491)
    public static final int method908(byte arg0, int arg1, int arg2) {
        if (arg0 <= 1) {
            method911(62, -16, 122, 114);
        }
        field1563++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V", line = 530)
    private final void method909(int arg0) {
        field1572++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var7 + var8;
            int var13 = var6 + var11;
            int var14 = var12 ^ var7 >>> 2;
            int var15 = var5 + var14;
            int var16 = var7 + var13;
            int var17 = var16 ^ var13 << 8;
            int var18 = var13 + var15;
            var6 = var18 ^ var15 >>> 16;
            int var19 = var4 + var17;
            int var20 = var15 + var19;
            var5 = var20 ^ var19 << 10;
            int var21 = var2 + var5;
            int var22 = var3 + var6;
            int var23 = var19 + var22;
            var4 = var23 ^ var22 >>> 4;
            int var24 = var4 + var11;
            int var25 = var21 + var22;
            var3 = var25 ^ var21 << 8;
            var8 = var3 + var14;
            int var26 = var21 + var24;
            var2 = var26 ^ var24 >>> 9;
            var9 = var8 + var24;
            var7 = var2 + var17;
        }
        if (arg0 <= 82) {
            this.method906(-98);
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field1569[var27 + 5] + var4;
            int var29 = this.field1569[var27] + var9;
            int var30 = this.field1569[var27 + 7] + var2;
            int var31 = this.field1569[var27 + 6] + var3;
            int var32 = this.field1569[var27 + 1] + var8;
            int var33 = var29 ^ var32 << 11;
            int var34 = this.field1569[var27 + 4] + var5;
            int var35 = this.field1569[var27 + 3] + var6;
            int var36 = var33 + var35;
            int var37 = this.field1569[var27 + 2] + var7;
            int var38 = var32 + var37;
            int var39 = var38 ^ var37 >>> 2;
            int var40 = var34 + var39;
            int var41 = var36 + var37;
            int var42 = var41 ^ var36 << 8;
            int var43 = var28 + var42;
            int var44 = var36 + var40;
            var6 = var44 ^ var40 >>> 16;
            int var45 = var6 + var31;
            int var46 = var40 + var43;
            var5 = var46 ^ var43 << 10;
            int var47 = var5 + var30;
            int var48 = var43 + var45;
            var4 = var48 ^ var45 >>> 4;
            int var49 = var4 + var33;
            int var50 = var45 + var47;
            var3 = var50 ^ var47 << 8;
            int var51 = var47 + var49;
            var2 = var51 ^ var49 >>> 9;
            var7 = var2 + var42;
            var8 = var3 + var39;
            var9 = var8 + var49;
            this.field1562[var27] = var9;
            this.field1562[var27 + 1] = var8;
            this.field1562[var27 + 2] = var7;
            this.field1562[var27 + 3] = var6;
            this.field1562[var27 + 4] = var5;
            this.field1562[var27 + 5] = var4;
            this.field1562[var27 + 6] = var3;
            this.field1562[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field1562[var52 + 6] + var3;
            int var54 = this.field1562[var52 + 5] + var4;
            int var55 = this.field1562[var52 + 4] + var5;
            int var56 = this.field1562[var52] + var9;
            int var57 = this.field1562[var52 + 1] + var8;
            int var58 = this.field1562[var52 + 7] + var2;
            int var59 = this.field1562[var52 + 2] + var7;
            int var60 = var56 ^ var57 << 11;
            int var61 = var57 + var59;
            int var62 = var61 ^ var59 >>> 2;
            int var63 = var55 + var62;
            int var64 = this.field1562[var52 + 3] + var6;
            int var65 = var60 + var64;
            int var66 = var59 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var63 + var65;
            var6 = var68 ^ var63 >>> 16;
            int var69 = var6 + var53;
            int var70 = var54 + var67;
            int var71 = var63 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var5 + var58;
            int var73 = var69 + var70;
            var4 = var73 ^ var69 >>> 4;
            int var74 = var69 + var72;
            int var75 = var4 + var60;
            var3 = var74 ^ var72 << 8;
            int var76 = var72 + var75;
            var8 = var3 + var62;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            this.field1562[var52] = var9;
            this.field1562[var52 + 1] = var8;
            var7 = var2 + var67;
            this.field1562[var52 + 2] = var7;
            this.field1562[var52 + 3] = var6;
            this.field1562[var52 + 4] = var5;
            this.field1562[var52 + 5] = var4;
            this.field1562[var52 + 6] = var3;
            this.field1562[var52 + 7] = var2;
        }
        this.method905(1);
        this.field1552 = 256;
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V", line = 680)
    public static void method910(int arg0) {
        field1574 = null;
        field1571 = null;
        if (arg0 != 28793) {
            field1570 = (class66) null;
        }
        field1554 = null;
        field1570 = null;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V", line = 695)
    private class104() {
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "([I)V", line = 699)
    public class104(int[] arg0) {
        this.field1569 = new int[256];
        this.field1562 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1569[var2] = arg0[var2];
        }
        this.method909(89);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)Lvd;", line = 727)
    public static final class72 method911(int arg0, int arg1, int arg2, int arg3) {
        field1568++;
        int var4 = arg1 << 8 | arg0;
        class72 var5 = (class72) class294.field4567.method1386(-1, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class163.field2599.method203(class163.field2599.method188((byte) -72, var4), (byte) 47);
        if (var6 == null) {
            int var7 = arg0 | arg3 + 65536 << 8;
            class72 var8 = (class72) class294.field4567.method1386(-1, (long) var7 << 16);
            if (var8 != null) {
                return var8;
            }
            byte[] var9 = class163.field2599.method203(class163.field2599.method188((byte) -72, var7), (byte) 47);
            if (var9 == null) {
                int var10 = arg0 | 0xFFFF00;
                class72 var11 = (class72) class294.field4567.method1386(-1, (long) var10 << 16);
                if (var11 != null) {
                    return var11;
                }
                if (arg2 != 1) {
                    method903(121);
                }
                byte[] var12 = class163.field2599.method203(class163.field2599.method188((byte) -72, var10), (byte) 47);
                if (var12 == null) {
                    return null;
                } else if (var12.length > 1) {
                    class72 var13 = class62.method626(var12, true);
                    var13.field1082 = arg0;
                    class294.field4567.method1385(var13, (byte) -30, (long) var10 << 16);
                    return var13;
                } else {
                    return null;
                }
            } else if (var9.length > 1) {
                class72 var14 = class62.method626(var9, true);
                var14.field1082 = arg0;
                class294.field4567.method1385(var14, (byte) -30, (long) var7 << 16);
                return var14;
            } else {
                return null;
            }
        } else if (var6.length > 1) {
            class72 var15 = class62.method626(var6, true);
            var15.field1082 = arg0;
            class294.field4567.method1385(var15, (byte) -30, (long) var4 << 16);
            return var15;
        } else {
            return null;
        }
    }
}
