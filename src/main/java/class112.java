import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class112 {

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "[I")
    private int[] field1517;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "[I")
    private int[] field1526;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lfg;")
    public static class83 field1519 = new class83("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Luf;")
    public static class310 field1525 = new class310(101, 7);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)I", line = 6)
    public final int method718(int arg0) {
        int var2 = 23 / ((11 - arg0) / 33);
        field1524++;
        if (this.field1523 == 0) {
            this.method720((byte) 29);
            this.field1523 = 256;
        }
        return this.field1526[this.field1523 - 1];
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)I", line = 24)
    public final int method719(boolean arg0) {
        field1522++;
        if (this.field1523 == 0) {
            this.method720((byte) 29);
            this.field1523 = 256;
        }
        if (!arg0) {
            this.method719(true);
        }
        return this.field1526[--this.field1523];
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V", line = 58)
    private final void method720(byte arg0) {
        field1516++;
        if (arg0 != 29) {
            return;
        }
        this.field1514 += ++this.field1515;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1517[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1513 ^= this.field1513 << 13;
                } else {
                    this.field1513 ^= this.field1513 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1513 ^= this.field1513 << 2;
            } else {
                this.field1513 ^= this.field1513 >>> 16;
            }
            this.field1513 += this.field1517[var2 + 128 & 0xFF];
            int var4;
            this.field1517[var2] = var4 = this.field1514 + this.field1517[class118.method750(var3 >> 2, 255)] + this.field1513;
            this.field1526[var2] = this.field1514 = var3 + this.field1517[class118.method750(261253, var4) >> 8 >> 2];
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V", line = 102)
    private final void method721(byte arg0) {
        field1521++;
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
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var65 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
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
            int var37 = this.field1526[var11 + 2] + var7;
            int var38 = this.field1526[var11] + var9;
            int var39 = this.field1526[var11 + 5] + var4;
            int var40 = this.field1526[var11 + 1] + var8;
            int var41 = this.field1526[var11 + 6] + var3;
            int var42 = this.field1526[var11 + 3] + var6;
            int var43 = this.field1526[var11 + 7] + var2;
            int var44 = this.field1526[var11 + 4] + var5;
            int var45 = var38 ^ var40 << 11;
            int var46 = var42 + var45;
            int var47 = var37 + var40;
            int var48 = var47 ^ var37 >>> 2;
            int var49 = var44 + var48;
            int var50 = var37 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var39 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var41;
            var5 = var54 ^ var52 << 10;
            int var56 = var52 + var55;
            int var57 = var5 + var43;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var57;
            var3 = var59 ^ var57 << 8;
            int var60 = var57 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field1517[var11] = var9;
            this.field1517[var11 + 1] = var8;
            this.field1517[var11 + 2] = var7;
            this.field1517[var11 + 3] = var6;
            this.field1517[var11 + 4] = var5;
            this.field1517[var11 + 5] = var4;
            this.field1517[var11 + 6] = var3;
            this.field1517[var11 + 7] = var2;
        }
        if (arg0 < 112) {
            this.method721((byte) -99);
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1517[var12 + 6] + var3;
            int var14 = this.field1517[var12] + var9;
            int var15 = this.field1517[var12 + 3] + var6;
            int var16 = this.field1517[var12 + 7] + var2;
            int var17 = this.field1517[var12 + 1] + var8;
            int var18 = this.field1517[var12 + 4] + var5;
            int var19 = this.field1517[var12 + 5] + var4;
            int var20 = this.field1517[var12 + 2] + var7;
            int var21 = var14 ^ var17 << 11;
            int var22 = var15 + var21;
            int var23 = var17 + var20;
            int var24 = var23 ^ var20 >>> 2;
            int var25 = var18 + var24;
            int var26 = var20 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var19 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            int var31 = var6 + var13;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            int var33 = var5 + var16;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            int var36 = var33 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field1517[var12] = var9;
            this.field1517[var12 + 1] = var8;
            this.field1517[var12 + 2] = var7;
            this.field1517[var12 + 3] = var6;
            this.field1517[var12 + 4] = var5;
            this.field1517[var12 + 5] = var4;
            this.field1517[var12 + 6] = var3;
            this.field1517[var12 + 7] = var2;
        }
        this.method720((byte) 29);
        this.field1523 = 256;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZZLir;)V", line = 250)
    public static final void method722(boolean arg0, boolean arg1, class22 arg2) {
        field1520++;
        class21 var3 = arg2.method165((byte) -78);
        if (arg2.field368 == 0) {
            class9.field100 = -1;
            class102.field1403 = 0;
            arg2.field371 = 0;
            return;
        }
        if (arg2.field271 != -1 && arg2.field325 == 0) {
            class467 var4 = class275.field3740.method1484(0, arg2.field271);
            if (arg2.field363 > 0 && var4.field6824 == 0) {
                class9.field100 = -1;
                class102.field1403 = 0;
                arg2.field371++;
                return;
            }
            if (arg2.field363 <= 0 && var4.field6822 == 0) {
                class9.field100 = -1;
                arg2.field371++;
                class102.field1403 = 0;
                return;
            }
        }
        if (arg2.field324 != -1 && arg2.field340 <= class393.field5484) {
            class119 var5 = class492.field7279.method2231(arg2.field324, 64);
            if (var5.field1603 && var5.field1616 != -1) {
                class467 var6 = class275.field3740.method1484(0, var5.field1616);
                if (arg2.field363 > 0 && var6.field6824 == 0) {
                    arg2.field371++;
                    class102.field1403 = 0;
                    class9.field100 = -1;
                    return;
                }
                if (arg2.field363 <= 0 && var6.field6822 == 0) {
                    arg2.field371++;
                    class9.field100 = -1;
                    class102.field1403 = 0;
                    return;
                }
            }
        }
        if (arg2.field324 != -1 && class393.field5484 >= arg2.field340) {
            class119 var7 = class492.field7279.method2231(arg2.field324, 64);
            if (var7.field1603 && var7.field1616 != -1) {
                class467 var8 = class275.field3740.method1484(0, var7.field1616);
                if (arg2.field363 > 0 && var8.field6824 == 0) {
                    class102.field1403 = 0;
                    class9.field100 = -1;
                    arg2.field371++;
                    return;
                }
                if (arg2.field363 <= 0 && var8.field6822 == 0) {
                    arg2.field371++;
                    class102.field1403 = 0;
                    class9.field100 = -1;
                    return;
                }
            }
        }
        int var9 = arg2.field466;
        int var10 = arg2.field461;
        int var11 = arg2.field372[arg2.field368 - 1] * 128 + arg2.method167(-1) * 64;
        int var12 = arg2.field362[arg2.field368 - 1] * 128 + (arg2.method167(-1) * 64);
        if (var9 < var11) {
            if (var12 > var10) {
                arg2.method158(10240, true);
            } else if (var10 > var12) {
                arg2.method158(14336, arg1);
            } else {
                arg2.method158(12288, true);
            }
        } else if (var9 <= var11) {
            if (var10 < var12) {
                arg2.method158(8192, true);
            } else if (var12 < var10) {
                arg2.method158(0, true);
            }
        } else if (var12 > var10) {
            arg2.method158(6144, arg1);
        } else if (var12 < var10) {
            arg2.method158(2048, true);
        } else {
            arg2.method158(4096, arg1);
        }
        byte var13 = arg2.field367[arg2.field368 - 1];
        if (!arg0 && (var11 - var9 > 256 || (var11 - var9) < -256 || (var12 - var10) > 256 || (var12 - var10) < -256)) {
            arg2.field461 = var12;
            arg2.field466 = var11;
            arg2.method169(true, arg2.field354);
            class9.field100 = -1;
            class102.field1403 = 0;
            arg2.field368--;
            if (arg2.field363 > 0) {
                arg2.field363--;
            }
            return;
        }
        int var14 = 4;
        boolean var15 = arg1;
        if (arg2 instanceof class405) {
            var15 = ((class405) arg2).field5623.field4620;
        }
        if (var15) {
            int var16 = arg2.field354 - arg2.field357.field1677;
            if (var16 != 0 && arg2.field289 == -1 && arg2.field333 != 0) {
                var14 = 2;
            }
            if (!arg0 && arg2.field368 > 2) {
                var14 = 6;
            }
            if (!arg0 && arg2.field368 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg0 && arg2.field368 > 1) {
                var14 = 6;
            }
            if (!arg0 && arg2.field368 > 2) {
                var14 = 8;
            }
        }
        if (arg2.field371 > 0 && arg2.field368 > 1) {
            var14 = 8;
            arg2.field371--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class102.field1403 = 0;
        if (var3.field219 != -1) {
            int var17 = var14 << 7;
            if (arg2.field368 == 1) {
                int var18 = arg2.field370 * arg2.field370;
                int var19 = (arg2.field466 > var11 ? arg2.field466 - var11 : -arg2.field466 + var11) << 7;
                int var20 = (arg2.field461 > var12 ? arg2.field461 - var12 : -arg2.field461 + var12) << 7;
                int var21 = var20 >= var19 ? var20 : var19;
                int var22 = var3.field219 * 2 * var21;
                if (var22 < var18) {
                    arg2.field370 /= 2;
                } else if (var21 < var18 / 2) {
                    arg2.field370 -= var3.field219;
                    if (arg2.field370 < 0) {
                        arg2.field370 = 0;
                    }
                } else if (var17 > arg2.field370) {
                    arg2.field370 += var3.field219;
                    if (var17 < arg2.field370) {
                        arg2.field370 = var17;
                    }
                }
            } else if (var17 > arg2.field370) {
                arg2.field370 += var3.field219;
                if (var17 < arg2.field370) {
                    arg2.field370 = var17;
                }
            } else if (arg2.field370 > 0) {
                arg2.field370 -= var3.field219;
                if (arg2.field370 < 0) {
                    arg2.field370 = 0;
                }
            }
            var14 = arg2.field370 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var11 > var9) {
            arg2.field466 += var14;
            class102.field1403 |= 0x4;
            if (var11 < arg2.field466) {
                arg2.field466 = var11;
            }
        } else if (var9 > var11) {
            arg2.field466 -= var14;
            class102.field1403 |= 0x8;
            if (var11 > arg2.field466) {
                arg2.field466 = var11;
            }
        }
        if (var12 > var10) {
            arg2.field461 += var14;
            class102.field1403 |= 0x1;
            if (arg2.field461 > var12) {
                arg2.field461 = var12;
            }
        } else if (var10 > var12) {
            arg2.field461 -= var14;
            class102.field1403 |= 0x2;
            if (arg2.field461 < var12) {
                arg2.field461 = var12;
            }
        }
        if (var14 >= 8) {
            class9.field100 = 2;
        } else {
            class9.field100 = var13;
        }
        if (arg2.field466 != var11 || arg2.field461 != var12) {
            return;
        }
        arg2.field368--;
        if (arg2.field363 > 0) {
            arg2.field363--;
            return;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V", line = 583)
    public static void method723(int arg0) {
        if (arg0 != -1) {
            method722(true, false, null);
        }
        field1519 = null;
        field1525 = null;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 593)
    private class112() {
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "([I)V", line = 595)
    public class112(int[] arg0) {
        this.field1517 = new int[256];
        this.field1526 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1526[var2] = arg0[var2];
        }
        this.method721((byte) 127);
    }
}
