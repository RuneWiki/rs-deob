import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class101 {

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public int field1532 = -1;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "Ldv;")
    public static class566 field1542;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "J")
    private long field1534;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "J")
    private long field1535;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "Z")
    public boolean field1525;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "[I")
    public int[] field1527;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "[I")
    private int[] field1529;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "[Lha;")
    public static class52[] field1541;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "[[I")
    private int[][] field1537;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IBLea;I)V")
    public final void method718(int arg0, byte arg1, class467 arg2, int arg3) {
        field1528++;
        int var5 = class175.field2514[arg0];
        if (this.field1529[var5] != 0 && arg2.method2724((byte) 101, arg3) != null) {
            this.field1529[var5] = class73.method578(arg3, Integer.MIN_VALUE);
            if (arg1 == -13) {
                this.method724((byte) 22);
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIZ[I[I)V")
    public final void method719(int arg0, int arg1, int arg2, boolean arg3, int[] arg4, int[] arg5) {
        if (this.field1540 != arg2) {
            this.field1537 = null;
            this.field1540 = arg2;
        }
        if (arg0 != 0) {
            this.field1529 = null;
        }
        field1533++;
        this.field1525 = arg3;
        this.field1527 = arg4;
        this.field1529 = arg5;
        this.field1532 = arg1;
        this.method724((byte) 22);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I[Ltr;Lea;Ljj;IIILdba;ZLqm;Ldba;Lbu;IBLkca;Lgba;ILqa;I)Lr;")
    public final class157 method720(int arg0, class244[] arg1, class467 arg2, class100 arg3, int arg4, int arg5, int arg6, class78 arg7, boolean arg8, class124 arg9, class78 arg10, class18 arg11, int arg12, byte arg13, class72 arg14, class573 arg15, int arg16, class207 arg17, int arg18) {
        field1538++;
        if (this.field1532 != -1) {
            return arg15.method3263(this.field1532, (byte) -103).method3511(arg17, arg18, arg12, arg7, arg11, 0, arg4, arg6, arg10, arg3, arg16, arg0, arg1, arg5, arg14);
        }
        int var20 = arg5;
        long var21 = this.field1535;
        int[] var23 = this.field1529;
        if (arg10 != null && (arg10.field1277 >= 0 || arg10.field1264 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field1529[var24];
            }
            if (arg10.field1277 >= 0) {
                if (arg10.field1277 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class73.method578(arg10.field1277, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg10.field1264 >= 0) {
                if (arg10.field1264 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class73.method578(1073741824, arg10.field1264);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        int var26 = -76 / ((8 - arg13) / 51);
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = arg10 != null || arg7 != null;
        int var30 = arg1 == null ? 0 : arg1.length;
        for (int var31 = 0; var31 < var30; var31++) {
            class45.field878[var31] = null;
            if (arg1[var31] != null) {
                class78 var32 = arg11.method195(arg1[var31].field3406, (byte) 13);
                if (var32.field1261 != null) {
                    class477.field6722[var31] = var32;
                    var29 = true;
                    int var33 = arg1[var31].field3400;
                    int var34 = arg1[var31].field3404;
                    int var35 = var32.field1261[var33];
                    class45.field878[var31] = arg11.method194(var35 >>> 16, false);
                    int var36 = var35 & 0xFFFF;
                    class397.field5664[var31] = var36;
                    if (class45.field878[var31] != null) {
                        var27 |= class45.field878[var31].method2115(var36, true);
                        var25 |= class45.field878[var31].method2116((byte) 84, var36);
                        var28 |= class45.field878[var31].method2117(var36, (byte) 69);
                    }
                    if ((var32.field1278 || class536.field7500) && var34 != -1 && var32.field1261.length > var34) {
                        class481.field6789[var31] = var32.field1260[var33];
                        class340.field4580[var31] = arg1[var31].field3409;
                        int var37 = var32.field1261[var34];
                        class559.field7747[var31] = arg11.method194(var37 >>> 16, false);
                        int var38 = var37 & 0xFFFF;
                        class294.field4050[var31] = var38;
                        if (class559.field7747[var31] != null) {
                            var27 |= class559.field7747[var31].method2115(var38, true);
                            var25 |= class559.field7747[var31].method2116((byte) -68, var38);
                            var28 |= class559.field7747[var31].method2117(var38, (byte) 69);
                        }
                    } else {
                        class481.field6789[var31] = 0;
                        class340.field4580[var31] = 0;
                        class559.field7747[var31] = null;
                        class294.field4050[var31] = -1;
                    }
                }
            }
        }
        int var39 = -1;
        int var40 = -1;
        int var41 = 0;
        class353 var42 = null;
        class353 var43 = null;
        int var44 = -1;
        int var45 = -1;
        int var46 = 0;
        class353 var47 = null;
        class353 var48 = null;
        if (var29) {
            if (arg10 != null) {
                int var49 = arg10.field1261[arg18];
                int var50 = var49 >>> 16;
                var39 = var49 & 0xFFFF;
                var42 = arg11.method194(var50, false);
                if (var42 != null) {
                    var27 |= var42.method2115(var39, true);
                    var25 |= var42.method2116((byte) -97, var39);
                    var28 |= var42.method2117(var39, (byte) 69);
                }
                if ((arg10.field1278 || class536.field7500) && arg4 != -1 && arg4 < arg10.field1261.length) {
                    var41 = arg10.field1260[arg18];
                    int var51 = arg10.field1261[arg4];
                    int var52 = var51 >>> 16;
                    var40 = var51 & 0xFFFF;
                    var43 = var50 == var52 ? var42 : arg11.method194(var52, false);
                    if (var43 != null) {
                        var27 |= var43.method2115(var40, true);
                        var25 |= var43.method2116((byte) -44, var40);
                        var28 |= var43.method2117(var40, (byte) 69);
                    }
                }
            }
            var20 = arg5 | 0x20;
            if (arg7 != null) {
                int var53 = arg7.field1261[arg12];
                int var54 = var53 >>> 16;
                var44 = var53 & 0xFFFF;
                var47 = arg11.method194(var54, false);
                if (var47 != null) {
                    var27 |= var47.method2115(var44, true);
                    var25 |= var47.method2116((byte) -121, var44);
                    var28 |= var47.method2117(var44, (byte) 69);
                }
                if ((arg7.field1278 || class536.field7500) && arg6 != -1 && arg7.field1261.length > arg6) {
                    int var55 = arg7.field1261[arg6];
                    var46 = arg7.field1260[arg12];
                    int var56 = var55 >>> 16;
                    var45 = var55 & 0xFFFF;
                    var48 = var54 == var56 ? var47 : arg11.method194(var56, false);
                    if (var48 != null) {
                        var27 |= var48.method2115(var45, true);
                        var25 |= var48.method2116((byte) 104, var45);
                        var28 |= var48.method2117(var45, (byte) 69);
                    }
                }
            }
            if (var27) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var28) {
                var20 |= 0x400;
            }
        }
        class571 var57 = class65.field1110;
        class157 var58;
        synchronized (class65.field1110) {
            var58 = (class157) class65.field1110.method3252(var21, (byte) 71);
        }
        class107 var59 = null;
        if (this.field1540 != -1) {
            var59 = arg3.method710(260522, this.field1540);
        }
        if (var58 == null || arg17.method1357(var58.method166(), var20) != 0 || var59 != null && var59.field1654 != null && this.field1537 == null) {
            if (var58 != null) {
                var20 = arg17.method1306(var20, var58.method166());
            }
            boolean var61 = false;
            int var62 = 0;
            while (true) {
                if (var62 >= 12) {
                    if (var61) {
                        if (this.field1534 != -1L) {
                            class571 var89 = class65.field1110;
                            synchronized (class65.field1110) {
                                var58 = (class157) class65.field1110.method3252(this.field1534, (byte) -65);
                            }
                        }
                        if (var58 == null || arg17.method1357(var58.method166(), var20) != 0 || var59 != null && var59.field1654 != null && this.field1537 == null) {
                            return null;
                        }
                    } else {
                        class317[] var64 = new class317[12];
                        for (int var65 = 0; var65 < 12; var65++) {
                            int var66 = var23[var65];
                            if ((var66 & 0x40000000) != 0) {
                                class317 var67 = arg9.method866(var66 & 0x3FFFFFFF, (byte) 79).method3624(-122, this.field1525);
                                if (var67 != null) {
                                    var64[var65] = var67;
                                }
                            } else if ((Integer.MIN_VALUE & var66) != 0) {
                                class317 var68 = arg2.method2724((byte) 44, var66 & 0x3FFFFFFF).method1573(true);
                                if (var68 != null) {
                                    var64[var65] = var68;
                                }
                            }
                        }
                        if (var59 != null && var59.field1654 != null) {
                            for (int var69 = 0; var69 < var59.field1654.length; var69++) {
                                if (var59.field1654[var69] != null && var64[var69] != null) {
                                    int var70 = var59.field1654[var69][0];
                                    int var71 = var59.field1654[var69][1];
                                    int var72 = var59.field1654[var69][2];
                                    int var73 = var59.field1654[var69][3] << 3;
                                    int var74 = var59.field1654[var69][4] << 3;
                                    int var75 = var59.field1654[var69][5] << 3;
                                    if (this.field1537 == null) {
                                        this.field1537 = new int[var59.field1654.length][];
                                    }
                                    if (this.field1537[var69] == null) {
                                        int[] var76 = this.field1537[var69] = new int[15];
                                        if (var73 == 0 && var74 == 0 && var75 == 0) {
                                            var76[0] = var76[4] = var76[8] = 32768;
                                            var76[13] = -var71;
                                            var76[14] = -var72;
                                            var76[12] = -var70;
                                        } else {
                                            int var77 = class1.field7[var73];
                                            int var78 = class1.field2[var73];
                                            int var79 = class1.field7[var74];
                                            int var80 = class1.field2[var74];
                                            int var81 = class1.field7[var75];
                                            int var82 = class1.field2[var75];
                                            int var83 = var78 * var81 + 16384 >> 15;
                                            int var84 = var78 * var82 + 16384 >> 15;
                                            var76[5] = -var78;
                                            var76[1] = var80 * var83 + -var82 * var79 + 16384 >> 15;
                                            var76[7] = var79 * var83 + -var80 * -var82 + 16384 >> 15;
                                            var76[3] = var77 * var82 + 16384 >> 15;
                                            var76[0] = var79 * var81 + (var80 * var84) + 16384 >> 15;
                                            var76[4] = var77 * var81 + 16384 >> 15;
                                            var76[6] = -var80 * var81 - (-(var79 * var84) - 16384) >> 15;
                                            var76[2] = var77 * var80 + 16384 >> 15;
                                            var76[8] = var77 * var79 + 16384 >> 15;
                                            var76[12] = var76[0] * -var70 + var76[6] * -var72 + var76[3] * -var71 + 16384 >> 15;
                                            var76[14] = var76[5] * -var71 + var76[2] * -var70 - (-(var76[8] * -var72) - 16384) >> 15;
                                            var76[13] = var76[4] * -var71 + (var76[1] * -var70 + (var76[7] * -var72)) + 16384 >> 15;
                                        }
                                        var76[11] = var72;
                                        var76[10] = var71;
                                        var76[9] = var70;
                                    }
                                    if (var73 != 0 || var74 != 0 || var75 != 0) {
                                        var64[var69].method1979(var75, var74, 115, var73);
                                    }
                                    if (var70 != 0 || var71 != 0 || var72 != 0) {
                                        var64[var69].method1976(0, var72, var71, var70);
                                    }
                                }
                            }
                        }
                        int var85 = var20 | 0x4000;
                        class317 var86 = new class317(var64, var64.length);
                        var58 = arg17.method1293(var86, var85, class207.field2910, 64, 850);
                        for (int var87 = 0; var87 < 5; var87++) {
                            if (this.field1527[var87] < class245.field3413[var87].length) {
                                var58.method137(class309.field4173[var87], class245.field3413[var87][this.field1527[var87]]);
                            }
                            if (this.field1527[var87] < class532.field7447[var87].length) {
                                var58.method137(class192.field2724[var87], class532.field7447[var87][this.field1527[var87]]);
                            }
                        }
                        if (arg8) {
                            var58.method138(var20);
                            class571 var88 = class65.field1110;
                            synchronized (class65.field1110) {
                                class65.field1110.method3243(var58, var21, 78);
                            }
                            this.field1534 = var21;
                        }
                    }
                    break;
                }
                int var63 = var23[var62];
                if ((var63 & 0x40000000) == 0) {
                    if ((var63 & Integer.MIN_VALUE) != 0 && !arg2.method2724((byte) 78, var63 & 0x3FFFFFFF).method1572(0)) {
                        var61 = true;
                    }
                } else if (!arg9.method866(var63 & 0x3FFFFFFF, (byte) 79).method3621(48, this.field1525)) {
                    var61 = true;
                }
                var62++;
            }
        }
        class157 var90 = var58.method163((byte) 4, var20, true);
        if (!var29) {
            return var90;
        }
        int var91 = 0;
        int var92 = 1;
        while (var30 > var91) {
            if (class45.field878[var91] != null) {
                var90.method1013(class294.field4050[var91], class45.field878[var91], false, class397.field5664[var91], this.field1537 == null ? null : this.field1537[var91], class481.field6789[var91], 0, var92, class559.field7747[var91], (byte) 44, class340.field4580[var91] - 1);
            }
            var91++;
            var92 <<= 0x1;
        }
        if (var42 != null && var47 != null) {
            var90.method1016(var43, var39, (byte) 114, arg0 - 1, var47, var40, false, var44, arg16 - 1, arg10.field1269, var46, var42, var41, var45, var48);
        } else if (var42 != null) {
            var90.method1014(0, var43, false, 16384, var42, var39, var41, var40, arg0 - 1);
        } else if (var47 != null) {
            var90.method1014(0, var48, false, 16384, var47, var44, var46, var45, arg16 - 1);
        }
        for (int var93 = 0; var93 < var30; var93++) {
            class45.field878[var93] = null;
            class559.field7747[var93] = null;
            class477.field6722[var93] = null;
        }
        return var90;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)V")
    public final void method721(boolean arg0, int arg1) {
        if (arg1 != 16873) {
            field1542 = null;
        }
        field1530++;
        this.field1525 = arg0;
        this.method724((byte) 22);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lqa;Ldba;ZIIILea;IIIILbu;)Lr;")
    public final class157 method722(class207 arg0, class78 arg1, boolean arg2, int arg3, int arg4, int arg5, class467 arg6, int arg7, int arg8, int arg9, int arg10, class18 arg11) {
        field1536++;
        int var13 = arg8;
        if (arg1 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg1.field1261[arg4];
            Object var22 = null;
            var13 = arg8 | 0x20;
            int var23 = var21 >>> 16;
            class353 var24 = arg11.method194(var23, false);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2115(var25, true);
                var14 |= var24.method2116((byte) 80, var25);
                var17 |= var24.method2117(var25, (byte) 69);
                var16 |= arg1.field1265;
            }
            if ((arg1.field1278 || class536.field7500) && arg7 != -1 && arg7 < arg1.field1261.length) {
                int var26 = arg1.field1261[arg7];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class353 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg11.method194(var28 >>> 16, !arg2);
                }
                if (var29 != null) {
                    var15 |= var29.method2115(var28, true);
                    var14 |= var29.method2116((byte) 82, var28);
                    var17 |= var29.method2117(var28, (byte) 69);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) arg5 << 32 | (long) (arg9 << 16) | (long) arg3;
        class571 var32 = class384.field5141;
        class157 var33;
        synchronized (class384.field5141) {
            var33 = (class157) class384.field5141.method3252(var30, (byte) 97);
        }
        if (var33 == null || arg0.method1357(var33.method166(), var13) != 0) {
            if (var33 != null) {
                var13 = arg0.method1306(var13, var33.method166());
            }
            class317[] var35 = new class317[3];
            int var36 = 0;
            if (!arg6.method2724((byte) 124, arg3).method1581(60) || !arg6.method2724((byte) 73, arg9).method1581(-117) || !arg6.method2724((byte) 52, arg5).method1581(-70)) {
                return null;
            }
            class317 var37 = arg6.method2724((byte) 72, arg3).method1579(71);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class317 var38 = arg6.method2724((byte) 111, arg9).method1579(-68);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class317 var39 = arg6.method2724((byte) 26, arg5).method1579(120);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class317 var41 = new class317(var35, var36);
            var33 = arg0.method1293(var41, var40, class207.field2910, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field1527[var42] < class245.field3413[var42].length) {
                    var33.method137(class309.field4173[var42], class245.field3413[var42][this.field1527[var42]]);
                }
                if (class532.field7447[var42].length > this.field1527[var42]) {
                    var33.method137(class192.field2724[var42], class532.field7447[var42][this.field1527[var42]]);
                }
            }
            var33.method138(var13);
            class571 var43 = class384.field5141;
            synchronized (class384.field5141) {
                class384.field5141.method3243(var33, var30, 46);
            }
        }
        if (arg1 == null) {
            return var33;
        } else {
            class157 var44 = var33.method163((byte) 4, var13, arg2);
            return arg1.method600(65535, arg10, arg8, arg4, var44, arg7);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
    public final void method723(int arg0, int arg1, int arg2) {
        field1526++;
        if (arg0 != 1073741823) {
            this.field1537 = null;
        }
        this.field1527[arg1] = arg2;
        this.method724((byte) 22);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
    private final void method724(byte arg0) {
        field1531++;
        long[] var2 = class439.field6245;
        if (arg0 != 22) {
            return;
        }
        this.field1535 = -1L;
        this.field1535 = var2[(int) ((this.field1535 ^ (long) (this.field1540 >> 8)) & 0xFFL)] ^ this.field1535 >>> 8;
        this.field1535 = var2[(int) (((long) this.field1540 ^ this.field1535) & 0xFFL)] ^ this.field1535 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field1535 = this.field1535 >>> 8 ^ var2[(int) (((long) (this.field1529[var3] >> 24) ^ this.field1535) & 0xFFL)];
            this.field1535 = this.field1535 >>> 8 ^ var2[(int) (((long) (this.field1529[var3] >> 16) ^ this.field1535) & 0xFFL)];
            this.field1535 = var2[(int) ((this.field1535 ^ (long) (this.field1529[var3] >> 8)) & 0xFFL)] ^ this.field1535 >>> 8;
            this.field1535 = var2[(int) ((this.field1535 ^ (long) this.field1529[var3]) & 0xFFL)] ^ this.field1535 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field1535 = var2[(int) ((this.field1535 ^ (long) this.field1527[var4]) & 0xFFL)] ^ this.field1535 >>> 8;
        }
        this.field1535 = this.field1535 >>> 8 ^ var2[(int) (((long) (this.field1525 ? 1 : 0) ^ this.field1535) & 0xFFL)];
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static void method725(int arg0) {
        field1542 = null;
        field1541 = null;
        if (arg0 != 26265) {
            field1541 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILbu;ILqa;ILdba;Lqm;ILea;Lgba;Lkca;I)Lr;")
    public final class157 method726(int arg0, class18 arg1, int arg2, class207 arg3, int arg4, class78 arg5, class124 arg6, int arg7, class467 arg8, class573 arg9, class72 arg10, int arg11) {
        field1539++;
        if (this.field1532 != -1) {
            return arg9.method3263(this.field1532, (byte) -103).method3512(arg5, arg2, arg3, arg11, arg0, arg1, arg10, arg4, -144);
        }
        int var13 = arg4;
        if (arg5 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg5.field1261[arg2];
            var13 = arg4 | 0x20;
            int var23 = var22 >>> 16;
            class353 var24 = arg1.method194(var23, false);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2115(var25, true);
                var14 |= var24.method2116((byte) 110, var25);
                var17 |= var24.method2117(var25, (byte) 69);
                var16 |= arg5.field1265;
            }
            if ((arg5.field1278 || class536.field7500) && arg11 != -1 && arg5.field1261.length > arg11) {
                int var26 = arg5.field1261[arg11];
                int var27 = var26 >>> 16;
                class353 var28 = var23 == var27 ? var24 : arg1.method194(var27, false);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method2115(var29, true);
                    var14 |= var28.method2116((byte) 81, var29);
                    var17 |= var28.method2117(var29, (byte) 69);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class571 var30 = class384.field5141;
        class157 var31;
        synchronized (class384.field5141) {
            var31 = (class157) class384.field5141.method3252(this.field1535, (byte) 47);
        }
        if (var31 == null || arg3.method1357(var31.method166(), var13) != 0) {
            if (var31 != null) {
                var13 = arg3.method1306(var13, var31.method166());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field1529[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg8.method2724((byte) 48, var35 & 0x3FFFFFFF).method1581(arg7 ^ 0xFFFFDA55)) {
                        var33 = true;
                    }
                } else if (!arg6.method866(var35 & 0x3FFFFFFF, (byte) 79).method3612(this.field1525, arg7 - 9701)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class317[] var36 = new class317[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field1529[var38];
                if ((var39 & 0x40000000) != 0) {
                    class317 var40 = arg6.method866(var39 & 0x3FFFFFFF, (byte) 79).method3629(this.field1525, arg7 - 24455);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class317 var41 = arg8.method2724((byte) 46, var39 & 0x3FFFFFFF).method1579(-127);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class317 var43 = new class317(var36, var37);
            var31 = arg3.method1293(var43, var42, class207.field2910, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (this.field1527[var44] < class245.field3413[var44].length) {
                    var31.method137(class309.field4173[var44], class245.field3413[var44][this.field1527[var44]]);
                }
                if (class532.field7447[var44].length > this.field1527[var44]) {
                    var31.method137(class192.field2724[var44], class532.field7447[var44][this.field1527[var44]]);
                }
            }
            var31.method138(var13);
            class571 var45 = class384.field5141;
            synchronized (class384.field5141) {
                class384.field5141.method3243(var31, this.field1535, -97);
            }
        }
        if (arg5 == null) {
            return var31;
        }
        var31.method163((byte) 4, var13, true);
        class157 var47 = arg5.method600(65535, arg0, arg4, arg2, var31, arg11);
        if (arg7 != 9701) {
            this.method721(true, -36);
        }
        return var47;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lan;B)V")
    public static final void method727(class21 arg0, byte arg1) {
        field1544++;
        class222.field3175 = arg0;
        if (arg1 <= 120) {
            field1542 = null;
        }
    }

    static {
        new class104("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field1543 = -1;
        field1542 = new class566(54, 7);
    }
}
