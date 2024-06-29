import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class128 {

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public int field1647 = -1;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Ljg;")
    public static class241 field1633 = new class241(4);

    @OriginalMember(owner = "client!we", name = "t", descriptor = "B")
    public static byte field1646;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    private int field1649;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "J")
    private long field1628;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "J")
    private long field1631;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Z")
    public boolean field1645;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "[I")
    public int[] field1634;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "[I")
    private int[] field1644;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[[I")
    private int[][] field1637;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILgr;ILsn;IIILdr;)Lwp;")
    public final class292 method749(int arg0, class379 arg1, int arg2, class183 arg3, int arg4, int arg5, int arg6, class261 arg7) {
        field1636++;
        if (this.field1647 != arg0) {
            return class228.method1385(this.field1647, (byte) 61).method1682(arg6, (byte) 113, arg1, arg7, arg4, arg5, arg2);
        }
        int var9 = arg4;
        if (arg1 != null) {
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = true;
            boolean var14 = true;
            Object var15 = null;
            var9 = arg4 | 0x20;
            Object var16 = null;
            int var17 = arg1.field5539[arg5];
            int var18 = var17 >>> 16;
            int var19 = var17 & 0xFFFF;
            class265 var20 = class374.method2243(false, var18);
            if (var20 != null) {
                var11 |= var20.method1640(var19, (byte) 11);
                var10 |= var20.method1639(arg0, var19);
                var12 |= arg1.field5522;
            }
            if ((arg1.field5532 || class440.field6479) && arg2 != -1 && arg2 < arg1.field5539.length) {
                int var21 = arg1.field5539[arg2];
                int var22 = var21 >>> 16;
                class265 var23 = var18 == var22 ? var20 : class374.method2243(false, var22);
                int var24 = var21 & 0xFFFF;
                if (var23 != null) {
                    var11 |= var23.method1640(var24, (byte) 11);
                    var10 |= var23.method1639(-1, var24);
                }
            }
            if (var11) {
                var9 |= 0x80;
            }
            if (var10) {
                var9 |= 0x100;
            }
            if (var12) {
                var9 |= 0x200;
            }
        }
        class241 var25 = class306.field4633;
        class292 var26;
        synchronized (class306.field4633) {
            var26 = (class292) class306.field4633.method1491(this.field1631, 0);
        }
        if (var26 == null || arg7.method372(var26.method1274(), var9) != 0) {
            if (var26 != null) {
                var9 = arg7.method407(var9, var26.method1274());
            }
            boolean var28 = false;
            for (int var29 = 0; var29 < 12; var29++) {
                int var30 = this.field1644[var29];
                if ((var30 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var30) != 0 && !class343.method2094(var30 & 0x3FFFFFFF, arg0 + 26058).method1787((byte) 11)) {
                        var28 = true;
                    }
                } else if (!arg3.method1106(50, var30 & 0x3FFFFFFF).method1007(this.field1645, 88)) {
                    var28 = true;
                }
            }
            if (var28) {
                return null;
            }
            class49[] var31 = new class49[12];
            int var32 = 0;
            for (int var33 = 0; var33 < 12; var33++) {
                int var34 = this.field1644[var33];
                if ((var34 & 0x40000000) != 0) {
                    class49 var36 = arg3.method1106(50, var34 & 0x3FFFFFFF).method1003(this.field1645, (byte) -124);
                    if (var36 != null) {
                        var31[var32++] = var36;
                    }
                } else if ((var34 & Integer.MIN_VALUE) != 0) {
                    class49 var35 = class343.method2094(var34 & 0x3FFFFFFF, 26057).method1791(true);
                    if (var35 != null) {
                        var31[var32++] = var35;
                    }
                }
            }
            int var37 = var9 | 0x2000;
            class49 var38 = new class49(var31, var32);
            var26 = arg7.method390(var38, var37, class26.field327, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (class246.field3685[var39].length > this.field1634[var39]) {
                    var26.method1259(class295.field4481[var39], class246.field3685[var39][this.field1634[var39]]);
                }
                if (class372.field5435[var39].length > this.field1634[var39]) {
                    var26.method1259(class201.field3032[var39], class372.field5435[var39][this.field1634[var39]]);
                }
            }
            var26.method1277(var9);
            class241 var40 = class306.field4633;
            synchronized (class306.field4633) {
                class306.field4633.method1488(128, this.field1631, var26);
            }
        }
        if (arg1 == null) {
            return var26;
        } else {
            var26.method1264((byte) 4, var9, true);
            return arg1.method2279(var26, arg5, arg2, arg4, (byte) -111, arg6);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([IIII[IZ)V")
    public final void method750(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5) {
        this.field1644 = arg4;
        this.field1647 = arg2;
        if (this.field1649 != arg1) {
            this.field1649 = arg1;
            this.field1637 = null;
        }
        this.field1645 = arg5;
        if (arg3 >= -92) {
            method751(-35, 126);
        }
        field1641++;
        this.field1634 = arg0;
        this.method755(0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lug;")
    public static final class291 method751(int arg0, int arg1) {
        field1630++;
        class291 var2 = (class291) class310.field4664.method1491((long) arg1, 0);
        if (var2 != null) {
            return var2;
        } else if (arg0 == -31686) {
            byte[] var3 = class427.field6277.method823(1, -20334, arg1);
            class291 var4 = new class291();
            var4.field4435 = arg1;
            if (var3 != null) {
                var4.method1801(new class385(var3), 0);
            }
            var4.method1804(-104);
            if (var4.field4429 == 2 && class243.field3648.method2302((long) arg1, 23576) == null) {
                class243.field3648.method2301(99, new class350(class53.field715), (long) arg1);
                class25.field323[class53.field715++] = var4;
            }
            class310.field4664.method1488(128, (long) arg1, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILef;)Ljava/lang/String;")
    public static final String method752(int arg0, class385 arg1) {
        int var2 = 103 / ((arg0 + 14) / 49);
        field1640++;
        return class387.method2386(32767, (byte) -114, arg1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([Lvs;IZLgr;Lsn;Ldr;IIIILgr;III)Lwp;")
    public final class292 method753(class410[] arg0, int arg1, boolean arg2, class379 arg3, class183 arg4, class261 arg5, int arg6, int arg7, int arg8, int arg9, class379 arg10, int arg11, int arg12, int arg13) {
        field1627++;
        if (this.field1647 != -1) {
            return class228.method1385(this.field1647, (byte) 61).method1687(arg1, arg13, 121, arg3, arg9, arg5, arg11, arg7, arg10, arg0, arg12, arg6);
        }
        int var15 = arg7;
        long var16 = this.field1631;
        int[] var18 = this.field1644;
        if (arg3 != null && (arg3.field5519 >= 0 || arg3.field5524 >= 0)) {
            var18 = new int[12];
            for (int var19 = 0; var19 < 12; var19++) {
                var18[var19] = this.field1644[var19];
            }
            if (arg3.field5519 >= 0) {
                if (arg3.field5519 == 65535) {
                    var18[5] = 0;
                    var16 ^= 0xFFFFFFFF00000000L;
                } else {
                    var18[5] = class276.method1712(arg3.field5519, 1073741824);
                    var16 ^= (long) var18[5] << 32;
                }
            }
            if (arg3.field5524 >= 0) {
                if (arg3.field5524 == 65535) {
                    var18[3] = 0;
                    var16 ^= 0xFFFFFFFFL;
                } else {
                    var18[3] = class276.method1712(arg3.field5524, 1073741824);
                    var16 ^= (long) var18[3];
                }
            }
        }
        boolean var20 = false;
        boolean var21 = false;
        boolean var22 = arg3 != null || arg10 != null;
        int var23 = arg0 == null ? 0 : arg0.length;
        for (int var24 = 0; var24 < var23; var24++) {
            class441.field6482[var24] = null;
            if (arg0[var24] != null) {
                class379 var25 = class98.method629(arg0[var24].field6105, (byte) -115);
                if (var25.field5539 != null) {
                    class80.field1053[var24] = var25;
                    var22 = true;
                    int var26 = arg0[var24].field6102;
                    int var27 = arg0[var24].field6107;
                    int var28 = var25.field5539[var26];
                    class441.field6482[var24] = class374.method2243(false, var28 >>> 16);
                    int var29 = var28 & 0xFFFF;
                    class126.field1614[var24] = var29;
                    if (class441.field6482[var24] != null) {
                        var21 |= class441.field6482[var24].method1640(var29, (byte) 11);
                        var20 |= class441.field6482[var24].method1639(-1, var29);
                    }
                    if ((var25.field5532 || class440.field6479) && var27 != -1 && var25.field5539.length > var27) {
                        class282.field4313[var24] = var25.field5540[var26];
                        class374.field5448[var24] = arg0[var24].field6106;
                        int var30 = var25.field5539[var27];
                        class258.field3956[var24] = class374.method2243(false, var30 >>> 16);
                        int var31 = var30 & 0xFFFF;
                        class387.field5731[var24] = var31;
                        if (class258.field3956[var24] != null) {
                            var21 |= class258.field3956[var24].method1640(var31, (byte) 11);
                            var20 |= class258.field3956[var24].method1639(-1, var31);
                        }
                    } else {
                        class282.field4313[var24] = 0;
                        class374.field5448[var24] = 0;
                        class258.field3956[var24] = null;
                        class387.field5731[var24] = -1;
                    }
                }
            }
        }
        int var32 = -1;
        int var33 = -1;
        int var34 = 0;
        class265 var35 = null;
        class265 var36 = null;
        int var37 = -1;
        if (arg8 > -120) {
            return null;
        }
        int var38 = -1;
        int var39 = 0;
        class265 var40 = null;
        class265 var41 = null;
        if (var22) {
            if (arg3 != null) {
                int var42 = arg3.field5539[arg6];
                int var43 = var42 >>> 16;
                var32 = var42 & 0xFFFF;
                var35 = class374.method2243(false, var43);
                if (var35 != null) {
                    var21 |= var35.method1640(var32, (byte) 11);
                    var20 |= var35.method1639(-1, var32);
                }
                if ((arg3.field5532 || class440.field6479) && arg12 != -1 && arg12 < arg3.field5539.length) {
                    int var44 = arg3.field5539[arg12];
                    var34 = arg3.field5540[arg6];
                    int var45 = var44 >>> 16;
                    var36 = var43 == var45 ? var35 : class374.method2243(false, var45);
                    var33 = var44 & 0xFFFF;
                    if (var36 != null) {
                        var21 |= var36.method1640(var33, (byte) 11);
                        var20 |= var36.method1639(-1, var33);
                    }
                }
            }
            var15 = arg7 | 0x20;
            if (arg10 != null) {
                int var46 = arg10.field5539[arg11];
                int var47 = var46 >>> 16;
                var40 = class374.method2243(false, var47);
                var37 = var46 & 0xFFFF;
                if (var40 != null) {
                    var21 |= var40.method1640(var37, (byte) 11);
                    var20 |= var40.method1639(-1, var37);
                }
                if ((arg10.field5532 || class440.field6479) && arg13 != -1 && arg13 < arg10.field5539.length) {
                    var39 = arg10.field5540[arg11];
                    int var48 = arg10.field5539[arg13];
                    int var49 = var48 >>> 16;
                    var38 = var48 & 0xFFFF;
                    var41 = var47 == var49 ? var40 : class374.method2243(false, var49);
                    if (var41 != null) {
                        var21 |= var41.method1640(var38, (byte) 11);
                        var20 |= var41.method1639(-1, var38);
                    }
                }
            }
            if (var21) {
                var15 |= 0x80;
            }
            if (var20) {
                var15 |= 0x100;
            }
        }
        class241 var50 = class386.field5705;
        class292 var51;
        synchronized (class386.field5705) {
            var51 = (class292) class386.field5705.method1491(var16, 0);
        }
        class433 var52 = null;
        if (this.field1649 != -1) {
            var52 = class180.method1092(false, this.field1649);
        }
        if (var51 == null || arg5.method372(var51.method1274(), var15) != 0 || var52 != null && var52.field6370 != null && this.field1637 == null) {
            if (var51 != null) {
                var15 = arg5.method407(var15, var51.method1274());
            }
            boolean var54 = false;
            int var55 = 0;
            while (true) {
                if (var55 >= 12) {
                    if (var54) {
                        if (this.field1628 != -1L) {
                            class241 var57 = class386.field5705;
                            synchronized (class386.field5705) {
                                var51 = (class292) class386.field5705.method1491(this.field1628, 0);
                            }
                        }
                        if (var51 == null || arg5.method372(var51.method1274(), var15) != 0 || var52 != null && var52.field6370 != null && this.field1637 == null) {
                            return null;
                        }
                    } else {
                        class49[] var58 = new class49[12];
                        for (int var59 = 0; var59 < 12; var59++) {
                            int var60 = var18[var59];
                            if ((var60 & 0x40000000) != 0) {
                                class49 var62 = arg4.method1106(50, var60 & 0x3FFFFFFF).method1008((byte) 103, this.field1645);
                                if (var62 != null) {
                                    var58[var59] = var62;
                                }
                            } else if ((Integer.MIN_VALUE & var60) != 0) {
                                class49 var61 = class343.method2094(var60 & 0x3FFFFFFF, 26057).method1788(0);
                                if (var61 != null) {
                                    var58[var59] = var61;
                                }
                            }
                        }
                        if (var52 != null && var52.field6370 != null) {
                            for (int var63 = 0; var63 < var52.field6370.length; var63++) {
                                if (var52.field6370[var63] != null && var58[var63] != null) {
                                    int var64 = var52.field6370[var63][0];
                                    int var65 = var52.field6370[var63][1];
                                    int var66 = var52.field6370[var63][2];
                                    int var67 = var52.field6370[var63][3] << 3;
                                    int var68 = var52.field6370[var63][4] << 3;
                                    int var69 = var52.field6370[var63][5] << 3;
                                    if (this.field1637 == null) {
                                        this.field1637 = new int[var52.field6370.length][];
                                    }
                                    if (this.field1637[var63] == null) {
                                        int[] var70 = this.field1637[var63] = new int[15];
                                        if (var67 == 0 && var68 == 0 && var69 == 0) {
                                            var70[14] = -var66;
                                            var70[12] = -var64;
                                            var70[0] = var70[4] = var70[8] = 32768;
                                            var70[13] = -var65;
                                        } else {
                                            int var71 = class110.field1452[var67];
                                            int var72 = class110.field1450[var67];
                                            int var73 = class110.field1452[var68];
                                            int var74 = class110.field1450[var68];
                                            int var75 = class110.field1452[var69];
                                            int var76 = class110.field1450[var69];
                                            int var77 = var72 * var75 + 16384 >> 15;
                                            int var78 = var72 * var76 + 16384 >> 15;
                                            var70[2] = var71 * var74 + 16384 >> 15;
                                            var70[8] = var71 * var73 + 16384 >> 15;
                                            var70[0] = var74 * var78 + var73 * var75 + 16384 >> 15;
                                            var70[5] = -var72;
                                            var70[4] = var71 * var75 + 16384 >> 15;
                                            var70[6] = -var74 * var75 + var73 * var78 + 16384 >> 15;
                                            var70[1] = -var76 * var73 + var74 * var77 + 16384 >> 15;
                                            var70[3] = var71 * var76 + 16384 >> 15;
                                            var70[7] = -var74 * -var76 + var73 * var77 + 16384 >> 15;
                                            var70[13] = var70[7] * -var66 + var70[1] * -var64 + var70[4] * -var65 + 16384 >> 15;
                                            var70[14] = var70[2] * -var64 + var70[5] * -var65 + (var70[8] * -var66 - -16384) >> 15;
                                            var70[12] = var70[0] * -var64 + 16384 - (-(var70[3] * -var65) + -(var70[6] * -var66)) >> 15;
                                        }
                                        var70[9] = var64;
                                        var70[11] = var66;
                                        var70[10] = var65;
                                    }
                                    if (var67 != 0 || var68 != 0 || var69 != 0) {
                                        var58[var63].method273(var68, var69, var67, 89);
                                    }
                                    if (var64 != 0 || var65 != 0 || var66 != 0) {
                                        var58[var63].method275((byte) 122, var64, var65, var66);
                                    }
                                }
                            }
                        }
                        int var79 = var15 | 0x2000;
                        class49 var80 = new class49(var58, var58.length);
                        var51 = arg5.method390(var80, var79, class26.field327, 64, 850);
                        for (int var81 = 0; var81 < 5; var81++) {
                            if (class246.field3685[var81].length > this.field1634[var81]) {
                                var51.method1259(class295.field4481[var81], class246.field3685[var81][this.field1634[var81]]);
                            }
                            if (this.field1634[var81] < class372.field5435[var81].length) {
                                var51.method1259(class201.field3032[var81], class372.field5435[var81][this.field1634[var81]]);
                            }
                        }
                        if (arg2) {
                            var51.method1277(var15);
                            class241 var82 = class386.field5705;
                            synchronized (class386.field5705) {
                                class386.field5705.method1488(128, var16, var51);
                            }
                            this.field1628 = var16;
                        }
                    }
                    break;
                }
                int var56 = var18[var55];
                if ((var56 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var56) != 0 && !class343.method2094(var56 & 0x3FFFFFFF, 26057).method1785((byte) -67)) {
                        var54 = true;
                    }
                } else if (!arg4.method1106(50, var56 & 0x3FFFFFFF).method1012((byte) -93, this.field1645)) {
                    var54 = true;
                }
                var55++;
            }
        }
        class292 var83 = var51.method1264((byte) 4, var15, true);
        if (!var22) {
            return var83;
        }
        int var84 = 0;
        int var85 = 1;
        while (var84 < var23) {
            if (class441.field6482[var84] != null) {
                var83.method1807(class282.field4313[var84], class258.field3956[var84], class441.field6482[var84], this.field1637 == null ? null : this.field1637[var84], class126.field1614[var84], class387.field5731[var84], 0, var85, 0, false, class374.field5448[var84] - 1);
            }
            var84++;
            var85 <<= 0x1;
        }
        if (var35 != null && var40 != null) {
            var83.method1813(var38, var40, false, var37, var39, var41, var32, 0, var35, var33, var34, arg1 - 1, arg3.field5513, var36, arg9 - 1);
        } else if (var35 != null) {
            var83.method1817(var34, var33, 0, (byte) 79, var36, arg9 - 1, var35, false, var32);
        } else if (var40 != null) {
            var83.method1817(var39, var38, 0, (byte) 122, var41, arg1 - 1, var40, false, var37);
        }
        for (int var86 = 0; var86 < var23; var86++) {
            class441.field6482[var86] = null;
            class258.field3956[var86] = null;
            class80.field1053[var86] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public static final void method754(boolean arg0) {
        field1629++;
        if (arg0) {
            field1633 = null;
        }
        class440.field6476.method1485(-22032);
        class155.field2160.method1485(-22032);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    private final void method755(int arg0) {
        field1642++;
        this.field1631 = -1L;
        long[] var2 = class359.field5286;
        this.field1631 = this.field1631 >>> 8 ^ var2[(int) ((this.field1631 ^ (long) (this.field1649 >> 8)) & 0xFFL)];
        this.field1631 = var2[(int) (((long) this.field1649 ^ this.field1631) & 0xFFL)] ^ this.field1631 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field1631 = this.field1631 >>> 8 ^ var2[(int) (((long) (this.field1644[var3] >> 24) ^ this.field1631) & 0xFFL)];
            this.field1631 = var2[(int) ((this.field1631 ^ (long) (this.field1644[var3] >> 16)) & 0xFFL)] ^ this.field1631 >>> 8;
            this.field1631 = var2[(int) (((long) (this.field1644[var3] >> 8) ^ this.field1631) & 0xFFL)] ^ this.field1631 >>> 8;
            this.field1631 = this.field1631 >>> 8 ^ var2[(int) (((long) this.field1644[var3] ^ this.field1631) & 0xFFL)];
        }
        for (int var4 = arg0; var4 < 5; var4++) {
            this.field1631 = this.field1631 >>> 8 ^ var2[(int) (((long) this.field1634[var4] ^ this.field1631) & 0xFFL)];
        }
        this.field1631 = var2[(int) ((this.field1631 ^ (long) (this.field1645 ? 1 : 0)) & 0xFFL)] ^ this.field1631 >>> 8;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
    public final void method756(int arg0, int arg1, int arg2) {
        this.field1634[arg0] = arg1;
        int var4 = 63 % ((arg2 + 74) / 39);
        field1635++;
        this.method755(0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
    public final void method757(boolean arg0, int arg1) {
        this.field1645 = arg0;
        field1638++;
        this.method755(0);
        int var3 = -58 % ((arg1 + 31) / 32);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)V")
    public static final void method758(boolean arg0) {
        class440.field6476.method1482((byte) 81);
        if (!arg0) {
            field1646 = 11;
        }
        field1643++;
        class155.field2160.method1482((byte) 67);
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(Z)V")
    public static void method759(boolean arg0) {
        field1633 = null;
        if (arg0) {
            field1646 = 82;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public static final void method760(int arg0) {
        if (arg0 != 11074) {
            field1633 = null;
        }
        class320.method1952(-127);
        field1648++;
        class57.field763 = null;
        class303.field4581 = null;
        class375.field5461 = null;
        class8.field91 = null;
        class247.field3702 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILdr;IBIIIILgr;I)Lwp;")
    public final class292 method761(int arg0, class261 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, class379 arg8, int arg9) {
        field1639++;
        int var11 = arg7;
        if (arg8 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            int var18 = arg8.field5539[arg9];
            var11 = arg7 | 0x20;
            Object var19 = null;
            int var20 = var18 >>> 16;
            class265 var21 = class374.method2243(false, var20);
            int var22 = var18 & 0xFFFF;
            if (var21 != null) {
                var13 |= var21.method1640(var22, (byte) 11);
                var12 |= var21.method1639(-1, var22);
                var14 |= arg8.field5522;
            }
            if ((arg8.field5532 || class440.field6479) && arg0 != -1 && arg0 < arg8.field5539.length) {
                int var23 = arg8.field5539[arg0];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class265 var26;
                if (var20 == var24) {
                    var26 = var21;
                } else {
                    var26 = class374.method2243(false, var25 >>> 16);
                }
                if (var26 != null) {
                    var13 |= var26.method1640(var25, (byte) 11);
                    var12 |= var26.method1639(-1, var25);
                }
            }
            if (var13) {
                var11 |= 0x80;
            }
            if (var12) {
                var11 |= 0x100;
            }
            if (var14) {
                var11 |= 0x200;
            }
        }
        if (arg3 != -103) {
            return null;
        }
        long var27 = (long) arg5 | (long) (arg6 << 16) | (long) arg4 << 32;
        class241 var29 = class306.field4633;
        class292 var30;
        synchronized (class306.field4633) {
            var30 = (class292) class306.field4633.method1491(var27, 0);
        }
        if (var30 == null || arg1.method372(var30.method1274(), var11) != 0) {
            if (var30 != null) {
                var11 = arg1.method407(var11, var30.method1274());
            }
            class49[] var32 = new class49[3];
            int var33 = 0;
            if (!class343.method2094(arg5, 26057).method1787((byte) 11) || !class343.method2094(arg6, 26057).method1787((byte) 11) || !class343.method2094(arg4, 26057).method1787((byte) 11)) {
                return null;
            }
            class49 var34 = class343.method2094(arg5, 26057).method1791(true);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class49 var35 = class343.method2094(arg6, 26057).method1791(true);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class49 var36 = class343.method2094(arg4, 26057).method1791(true);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            int var37 = var11 | 0x2000;
            class49 var38 = new class49(var32, var33);
            var30 = arg1.method390(var38, var37, class26.field327, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (class246.field3685[var39].length > this.field1634[var39]) {
                    var30.method1259(class295.field4481[var39], class246.field3685[var39][this.field1634[var39]]);
                }
                if (class372.field5435[var39].length > this.field1634[var39]) {
                    var30.method1259(class201.field3032[var39], class372.field5435[var39][this.field1634[var39]]);
                }
            }
            var30.method1277(var11);
            class241 var40 = class306.field4633;
            synchronized (class306.field4633) {
                class306.field4633.method1488(arg3 + 231, var27, var30);
            }
        }
        if (arg8 == null) {
            return var30;
        } else {
            class292 var41 = var30.method1264((byte) 4, var11, true);
            return arg8.method2279(var41, arg9, arg0, arg7, (byte) 55, arg2);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIB)V")
    public final void method762(int arg0, int arg1, byte arg2) {
        field1632++;
        if (arg2 != 39) {
            field1646 = -27;
        }
        int var4 = class314.field4760[arg0];
        if (this.field1644[var4] != 0 && class343.method2094(arg1, 26057) != null) {
            this.field1644[var4] = class276.method1712(arg1, Integer.MIN_VALUE);
            this.method755(0);
        }
    }
}
