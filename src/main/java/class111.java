import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class111 extends class102 {

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    private int field2063 = 409;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    private int field2065 = 0;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    private int field2068 = 4;

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
    private int field2076 = 1024;

    @OriginalMember(owner = "client!kc", name = "hb", descriptor = "I")
    private int field2084 = 8;

    @OriginalMember(owner = "client!kc", name = "fb", descriptor = "I")
    private int field2082 = 81;

    @OriginalMember(owner = "client!kc", name = "db", descriptor = "I")
    private int field2080 = 1024;

    @OriginalMember(owner = "client!kc", name = "ib", descriptor = "I")
    private int field2085 = 204;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "Lqe;")
    public static class179 field2064 = class206.method1380(" loggt sich ein)3", (byte) -128);

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "[I")
    public static int[] field2079 = new int[32];

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "Lsg;")
    public static class201 field2070 = new class201(50);

    @OriginalMember(owner = "client!kc", name = "lb", descriptor = "Lnc;")
    public static class144 field2088 = new class144(4096);

    @OriginalMember(owner = "client!kc", name = "ob", descriptor = "Lqe;")
    public static class179 field2091 = class206.method1380("Diese Betatest)2Welt ist nur f-Ur eingeladene", (byte) -9);

    @OriginalMember(owner = "client!kc", name = "nb", descriptor = "Ldc;")
    public static class36 field2090 = new class36();

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    private int field2069;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    private int field2072;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
    private int field2077;

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!kc", name = "gb", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!kc", name = "kb", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!kc", name = "mb", descriptor = "Leh;")
    public static class52 field2089;

    @OriginalMember(owner = "client!kc", name = "jb", descriptor = "[I")
    private int[] field2086;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "[[I")
    private int[][] field2067;

    @OriginalMember(owner = "client!kc", name = "eb", descriptor = "[[I")
    private int[][] field2081;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
    public final void method191(int arg0) {
        ++field2071;
        this.method722(arg0 + -14005);
        if (arg0 != 14005) {
            field2079 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(B)V")
    public static void method717(byte arg0) {
        field2079 = null;
        field2089 = null;
        field2091 = null;
        field2070 = null;
        field2090 = null;
        field2088 = null;
        field2064 = null;
        if (arg0 < 90) {
            method719(103, false, 88, true, -48, (byte) 90, -127, -107, 39, -27, (class40) null);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        ++field2083;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 == 7) {
                                        this.field2076 = arg0.method1252(2);
                                    }
                                } else {
                                    this.field2082 = arg0.method1252(2);
                                }
                            } else {
                                this.field2065 = arg0.method1252(2);
                            }
                        } else {
                            this.field2080 = arg0.method1252(2);
                        }
                    } else {
                        this.field2085 = arg0.method1252(2);
                    }
                } else {
                    this.field2063 = arg0.method1252(2);
                }
            } else {
                this.field2084 = arg0.method1243(3);
            }
        } else {
            this.field2068 = arg0.method1243(3);
        }
        if (arg2) {
            this.field2068 = 22;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        ++field2066;
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (!arg0) {
            this.method191(64);
        }
        if (super.field1960.field2007) {
            int var4 = 0;
            int var5;
            for (var5 = class94.field1769[arg1] - -this.field2065; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field2084 && ~var5 <= ~this.field2086[var4]) {
                ++var4;
            }
            boolean var6 = (var4 & 1) == 0;
            int var7 = var4 + -1;
            int var8 = this.field2086[var4 + -1];
            int var9 = this.field2086[var4];
            if (var5 > this.field2072 + var8 && -this.field2072 + var9 > var5) {
                for (int var10 = 0; ~class155.field2796 < ~var10; ++var10) {
                    int var11 = var6 ? this.field2080 : -this.field2080;
                    int var12 = (this.field2069 * var11 >> 12) + class124.field2292[var10];
                    int var13 = 0;
                    while (var12 < 0) {
                        var12 += 4096;
                    }
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    while (this.field2068 > var13 && ~this.field2067[var7][var13] >= ~var12) {
                        ++var13;
                    }
                    int var14 = this.field2067[var7][var13];
                    int var15 = var13 + -1;
                    int var16 = this.field2067[var7][var15];
                    if (this.field2072 + var16 < var12 && -this.field2072 + var14 > var12) {
                        var3[var10] = this.field2081[var7][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class154.method988(var3, 0, class155.field2796, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(B)V")
    public static final void method718(byte arg0) {
        ++field2078;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
        if (arg0 != -78) {
            method720(-44, -47, 10);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZIZIBIIIILdg;)V")
    public static final void method719(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, class40 arg10) {
        ++field2075;
        if (arg1 && (class9.field265[0][arg4][arg6] & 2) == 0) {
            if ((class9.field265[arg2][arg4][arg6] & 16) != 0) {
                return;
            }
            if (~class113.method730(arg4, (byte) 119, arg2, arg6) != ~class182.field3364) {
                return;
            }
        }
        if (~arg2 > ~class46.field1010) {
            class46.field1010 = arg2;
        }
        class134 var11 = class114.method735((byte) -77, arg8);
        int var12;
        int var13;
        if (~arg9 != -2 && arg9 != 3) {
            var12 = var11.field2442;
            var13 = var11.field2430;
        } else {
            var13 = var11.field2442;
            var12 = var11.field2430;
        }
        if (arg5 <= 39) {
            field2087 = -26;
        }
        int var14;
        int var15;
        if (arg4 + var12 <= 104) {
            var14 = (var12 >> 1) + arg4;
            var15 = arg4 - -(var12 - -1 >> 1);
        } else {
            var14 = arg4;
            var15 = arg4 - -1;
        }
        int[][] var16 = class194.field3619[arg0];
        int var17;
        int var18;
        if (arg6 + var13 > 104) {
            var17 = arg6 - -1;
            var18 = arg6;
        } else {
            var17 = (var13 + 1 >> 1) + arg6;
            var18 = (var13 >> 1) + arg6;
        }
        int var19 = (arg4 << 7) + (var12 << 6);
        int var20 = (arg6 << 7) + (var13 << 6);
        int var21 = var16[var14][var17] + var16[var15][var18] + var16[var14][var18] + var16[var15][var17] >> 2;
        long var22 = (long) (arg9 << 20 | arg6 << 7 | arg4 | arg7 << 14 | 1073741824);
        if (var11.field2422 == 0) {
            var22 |= Long.MIN_VALUE;
        }
        if (~var11.field2482 == -2) {
            var22 |= 4194304L;
        }
        long var24 = var22 | (long) arg8 << 32;
        if (arg3 && var11.method859(false)) {
            class205.method1371(831485932, arg6, arg9, var11, arg4, arg2);
        }
        if (arg7 == 22) {
            if (!arg1 || ~var11.field2422 != -1 || var11.field2443 == 1 || var11.field2466) {
                class186 var27;
                if (~var11.field2448 == 0 && var11.field2479 == null) {
                    class92 var26 = var11.method855(var20, 22, var21, var19, 28167, arg3, arg9, var16);
                    var27 = var26.field1743;
                } else {
                    var27 = new class55(arg8, 22, arg9, arg0, arg4, arg6, var11.field2448, var11.field2459, (class186) null);
                }
                class102.method683(arg2, arg4, arg6, var21, var27, var24, var11.field2471);
                if (var11.field2443 == 1 && arg10 != null) {
                    arg10.method268(arg4, arg6, -8261);
                }
            }
        } else if (~arg7 != -11 && arg7 != 11) {
            if (arg7 >= 12) {
                class186 var29;
                if (~var11.field2448 == 0 && var11.field2479 == null) {
                    class92 var28 = var11.method855(var20, arg7, var21, var19, 28167, arg3, arg9, var16);
                    var29 = var28.field1743;
                } else {
                    var29 = new class55(arg8, arg7, arg9, arg0, arg4, arg6, var11.field2448, var11.field2459, (class186) null);
                }
                class88.method586(arg2, arg4, arg6, var21, 1, 1, var29, 0, var24);
                if (arg3 && ~arg7 <= -13 && arg7 <= 17 && ~arg7 != -14 && arg2 > 0) {
                    class70.field1408[arg2][arg4][arg6] = class125.method790(class70.field1408[arg2][arg4][arg6], 2340);
                }
                if (var11.field2443 != 0 && arg10 != null) {
                    arg10.method260(var11.field2477, (byte) -50, arg6, var13, var12, arg4);
                }
            } else if (arg7 == 0) {
                class186 var31;
                if (~var11.field2448 == 0 && var11.field2479 == null) {
                    class92 var30 = var11.method855(var20, 0, var21, var19, 28167, arg3, arg9, var16);
                    var31 = var30.field1743;
                } else {
                    var31 = new class55(arg8, 0, arg9, arg0, arg4, arg6, var11.field2448, var11.field2459, (class186) null);
                }
                class107.method704(arg2, arg4, arg6, var21, var31, (class186) null, class101.field1929[arg9], 0, var24);
                if (arg3) {
                    if (~arg9 != -1) {
                        if (~arg9 != -2) {
                            if (arg9 == 2) {
                                if (var11.field2433) {
                                    class128.field2344[arg2][arg4 + 1][arg6] = 50;
                                    class128.field2344[arg2][arg4 - -1][arg6 + 1] = 50;
                                }
                                if (var11.field2439) {
                                    class70.field1408[arg2][arg4 + 1][arg6] = class125.method790(class70.field1408[arg2][arg4 + 1][arg6], 585);
                                }
                            } else if (arg9 == 3) {
                                if (var11.field2433) {
                                    class128.field2344[arg2][arg4][arg6] = 50;
                                    class128.field2344[arg2][arg4 + 1][arg6] = 50;
                                }
                                if (var11.field2439) {
                                    class70.field1408[arg2][arg4][arg6] = class125.method790(class70.field1408[arg2][arg4][arg6], 1170);
                                }
                            }
                        } else {
                            if (var11.field2433) {
                                class128.field2344[arg2][arg4][arg6 + 1] = 50;
                                class128.field2344[arg2][arg4 - -1][arg6 + 1] = 50;
                            }
                            if (var11.field2439) {
                                class70.field1408[arg2][arg4][arg6 + 1] = class125.method790(class70.field1408[arg2][arg4][arg6 + 1], 1170);
                            }
                        }
                    } else {
                        if (var11.field2433) {
                            class128.field2344[arg2][arg4][arg6] = 50;
                            class128.field2344[arg2][arg4][arg6 - -1] = 50;
                        }
                        if (var11.field2439) {
                            class70.field1408[arg2][arg4][arg6] = class125.method790(class70.field1408[arg2][arg4][arg6], 585);
                        }
                    }
                }
                if (~var11.field2443 != -1 && arg10 != null) {
                    arg10.method265(var11.field2477, arg6, arg9, arg4, arg7, 128);
                }
                if (~var11.field2452 != -17) {
                    class23.method156(arg2, arg4, arg6, var11.field2452);
                }
            } else if (~arg7 == -2) {
                class186 var33;
                if (var11.field2448 == -1 && var11.field2479 == null) {
                    class92 var32 = var11.method855(var20, 1, var21, var19, 28167, arg3, arg9, var16);
                    var33 = var32.field1743;
                } else {
                    var33 = new class55(arg8, 1, arg9, arg0, arg4, arg6, var11.field2448, var11.field2459, (class186) null);
                }
                class107.method704(arg2, arg4, arg6, var21, var33, (class186) null, class218.field4029[arg9], 0, var24);
                if (var11.field2433 && arg3) {
                    if (~arg9 == -1) {
                        class128.field2344[arg2][arg4][arg6 + 1] = 50;
                    } else if (~arg9 != -2) {
                        if (arg9 != 2) {
                            if (~arg9 == -4) {
                                class128.field2344[arg2][arg4][arg6] = 50;
                            }
                        } else {
                            class128.field2344[arg2][arg4 + 1][arg6] = 50;
                        }
                    } else {
                        class128.field2344[arg2][arg4 + 1][arg6 + 1] = 50;
                    }
                }
                if (var11.field2443 != 0 && arg10 != null) {
                    arg10.method265(var11.field2477, arg6, arg9, arg4, arg7, 128);
                }
            } else if (arg7 == 2) {
                int var34 = arg9 + 1 & 3;
                class186 var36;
                class186 var38;
                if (var11.field2448 == -1 && var11.field2479 == null) {
                    class92 var35 = var11.method855(var20, 2, var21, var19, 28167, arg3, arg9 + 4, var16);
                    var36 = var35.field1743;
                    class92 var37 = var11.method855(var20, 2, var21, var19, 28167, arg3, var34, var16);
                    var38 = var37.field1743;
                } else {
                    var36 = new class55(arg8, 2, arg9 + 4, arg0, arg4, arg6, var11.field2448, var11.field2459, (class186) null);
                    var38 = new class55(arg8, 2, var34, arg0, arg4, arg6, var11.field2448, var11.field2459, (class186) null);
                }
                class107.method704(arg2, arg4, arg6, var21, var36, var38, class101.field1929[arg9], class101.field1929[var34], var24);
                if (var11.field2439 && arg3) {
                    if (~arg9 == -1) {
                        class70.field1408[arg2][arg4][arg6] = class125.method790(class70.field1408[arg2][arg4][arg6], 585);
                        class70.field1408[arg2][arg4][arg6 - -1] = class125.method790(class70.field1408[arg2][arg4][arg6 - -1], 1170);
                    } else if (arg9 == 1) {
                        class70.field1408[arg2][arg4][arg6 - -1] = class125.method790(class70.field1408[arg2][arg4][arg6 - -1], 1170);
                        class70.field1408[arg2][arg4 + 1][arg6] = class125.method790(class70.field1408[arg2][arg4 + 1][arg6], 585);
                    } else if (~arg9 == -3) {
                        class70.field1408[arg2][arg4 - -1][arg6] = class125.method790(class70.field1408[arg2][arg4 - -1][arg6], 585);
                        class70.field1408[arg2][arg4][arg6] = class125.method790(class70.field1408[arg2][arg4][arg6], 1170);
                    } else if (arg9 == 3) {
                        class70.field1408[arg2][arg4][arg6] = class125.method790(class70.field1408[arg2][arg4][arg6], 1170);
                        class70.field1408[arg2][arg4][arg6] = class125.method790(class70.field1408[arg2][arg4][arg6], 585);
                    }
                }
                if (~var11.field2443 != -1 && arg10 != null) {
                    arg10.method265(var11.field2477, arg6, arg9, arg4, arg7, 128);
                }
                if (~var11.field2452 != -17) {
                    class23.method156(arg2, arg4, arg6, var11.field2452);
                }
            } else if (arg7 == 3) {
                class186 var40;
                if (var11.field2448 == -1 && var11.field2479 == null) {
                    class92 var39 = var11.method855(var20, 3, var21, var19, 28167, arg3, arg9, var16);
                    var40 = var39.field1743;
                } else {
                    var40 = new class55(arg8, 3, arg9, arg0, arg4, arg6, var11.field2448, var11.field2459, (class186) null);
                }
                class107.method704(arg2, arg4, arg6, var21, var40, (class186) null, class218.field4029[arg9], 0, var24);
                if (var11.field2433 && arg3) {
                    if (~arg9 == -1) {
                        class128.field2344[arg2][arg4][arg6 + 1] = 50;
                    } else if (arg9 == 1) {
                        class128.field2344[arg2][arg4 + 1][arg6 + 1] = 50;
                    } else if (~arg9 != -3) {
                        if (arg9 == 3) {
                            class128.field2344[arg2][arg4][arg6] = 50;
                        }
                    } else {
                        class128.field2344[arg2][arg4 + 1][arg6] = 50;
                    }
                }
                if (~var11.field2443 != -1 && arg10 != null) {
                    arg10.method265(var11.field2477, arg6, arg9, arg4, arg7, 128);
                }
            } else if (arg7 == 9) {
                class186 var42;
                if (var11.field2448 == -1 && var11.field2479 == null) {
                    class92 var41 = var11.method855(var20, arg7, var21, var19, 28167, arg3, arg9, var16);
                    var42 = var41.field1743;
                } else {
                    var42 = new class55(arg8, arg7, arg9, arg0, arg4, arg6, var11.field2448, var11.field2459, (class186) null);
                }
                class88.method586(arg2, arg4, arg6, var21, 1, 1, var42, 0, var24);
                if (~var11.field2443 != -1 && arg10 != null) {
                    arg10.method260(var11.field2477, (byte) -50, arg6, var13, var12, arg4);
                }
                if (~var11.field2452 != -17) {
                    class23.method156(arg2, arg4, arg6, var11.field2452);
                }
            } else if (arg7 == 4) {
                class186 var44;
                if (~var11.field2448 == 0 && var11.field2479 == null) {
                    class92 var43 = var11.method855(var20, 4, var21, var19, 28167, arg3, arg9, var16);
                    var44 = var43.field1743;
                } else {
                    var44 = new class55(arg8, 4, arg9, arg0, arg4, arg6, var11.field2448, var11.field2459, (class186) null);
                }
                class32.method206(arg2, arg4, arg6, var21, var44, (class186) null, class101.field1929[arg9], 0, 0, 0, var24);
            } else if (arg7 == 5) {
                int var45 = 16;
                long var46 = class239.method1551(arg2, arg4, arg6);
                if (var46 != 0L) {
                    var45 = class114.method735((byte) -77, (int) (var46 >>> 32) & Integer.MAX_VALUE).field2452;
                }
                class186 var49;
                if (var11.field2448 == -1 && var11.field2479 == null) {
                    class92 var48 = var11.method855(var20, 4, var21, var19, 28167, arg3, arg9, var16);
                    var49 = var48.field1743;
                } else {
                    var49 = new class55(arg8, 4, arg9, arg0, arg4, arg6, var11.field2448, var11.field2459, (class186) null);
                }
                class32.method206(arg2, arg4, arg6, var21, var49, (class186) null, class101.field1929[arg9], 0, class109.field2039[arg9] * var45, class193.field3598[arg9] * var45, var24);
            } else if (arg7 == 6) {
                int var50 = 8;
                long var51 = class239.method1551(arg2, arg4, arg6);
                if (var51 != 0L) {
                    var50 = class114.method735((byte) -77, Integer.MAX_VALUE & (int) (var51 >>> 32)).field2452 / 2;
                }
                class186 var54;
                if (var11.field2448 == -1 && var11.field2479 == null) {
                    class92 var53 = var11.method855(var20, 4, var21, var19, 28167, arg3, arg9 + 4, var16);
                    var54 = var53.field1743;
                } else {
                    var54 = new class55(arg8, 4, arg9 + 4, arg0, arg4, arg6, var11.field2448, var11.field2459, (class186) null);
                }
                class32.method206(arg2, arg4, arg6, var21, var54, (class186) null, 256, arg9, class152.field2758[arg9] * var50, class182.field3365[arg9] * var50, var24);
            } else if (arg7 == 7) {
                int var55 = 3 & arg9 + 2;
                class186 var57;
                if (~var11.field2448 == 0 && var11.field2479 == null) {
                    class92 var56 = var11.method855(var20, 4, var21, var19, 28167, arg3, var55 + 4, var16);
                    var57 = var56.field1743;
                } else {
                    var57 = new class55(arg8, 4, var55 + 4, arg0, arg4, arg6, var11.field2448, var11.field2459, (class186) null);
                }
                class32.method206(arg2, arg4, arg6, var21, var57, (class186) null, 256, var55, 0, 0, var24);
            } else if (~arg7 == -9) {
                long var58 = class239.method1551(arg2, arg4, arg6);
                int var60 = 3 & arg9 + 2;
                int var61 = 8;
                if (~var58 != -1L) {
                    var61 = class114.method735((byte) -77, (int) (var58 >>> 32) & Integer.MAX_VALUE).field2452 / 2;
                }
                class186 var63;
                class186 var65;
                if (~var11.field2448 == 0 && var11.field2479 == null) {
                    class92 var62 = var11.method855(var20, 4, var21, var19, 28167, arg3, arg9 + 4, var16);
                    var63 = var62.field1743;
                    class92 var64 = var11.method855(var20, 4, var21, var19, 28167, arg3, var60 + 4, var16);
                    var65 = var64.field1743;
                } else {
                    var63 = new class55(arg8, 4, arg9 + 4, arg0, arg4, arg6, var11.field2448, var11.field2459, (class186) null);
                    var65 = new class55(arg8, 4, var60 - -4, arg0, arg4, arg6, var11.field2448, var11.field2459, (class186) null);
                }
                class32.method206(arg2, arg4, arg6, var21, var63, var65, 256, arg9, class152.field2758[arg9] * var61, class182.field3365[arg9] * var61, var24);
            }
        } else {
            class186 var67;
            if (var11.field2448 == -1 && var11.field2479 == null) {
                class92 var66 = var11.method855(var20, 10, var21, var19, 28167, arg3, arg9, var16);
                var67 = var66.field1743;
            } else {
                var67 = new class55(arg8, 10, arg9, arg0, arg4, arg6, var11.field2448, var11.field2459, (class186) null);
            }
            if (var67 != null) {
                boolean var68 = class88.method586(arg2, arg4, arg6, var21, var12, var13, var67, arg7 == 11 ? 256 : 0, var24);
                if (var11.field2433 && var68 && arg3) {
                    int var69 = 15;
                    if (var67 instanceof class75) {
                        var69 = ((class75) var67).method477() / 4;
                        if (~var69 < -31) {
                            var69 = 30;
                        }
                    }
                    for (int var70 = 0; ~var70 >= ~var12; ++var70) {
                        for (int var71 = 0; var13 >= var71; ++var71) {
                            if (class128.field2344[arg2][arg4 + var70][arg6 - -var71] < var69) {
                                class128.field2344[arg2][arg4 + var70][arg6 + var71] = (byte) var69;
                            }
                        }
                    }
                }
            }
            if (~var11.field2443 != -1 && arg10 != null) {
                arg10.method260(var11.field2477, (byte) -50, arg6, var13, var12, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class111() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(III)V")
    public static final void method720(int arg0, int arg1, int arg2) {
        class197 var3 = class229.field4232[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field3680 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0;
        class165[] var8 = class187.field3477;
        while (var7 < var8.length) {
            class165 var9 = var8[var7];
            if (var9 != null && var9.field2991 == 2) {
                class143.method901((-class141.field2582 + var9.field2988 << 7) + var9.field2989, arg6, var9.field2978 * 2, arg4 >> 1, arg5 >> 1, 1220876233, (-class2.field26 + var9.field2990 << 7) + var9.field2993, arg2);
                if (~class174.field3122 < 0 && class13.field322 % 20 < 10) {
                    class194.field3621[var9.field2981].method799(arg3 - -class174.field3122 + -12, class71.field1415 + arg1 + -28);
                }
            }
            ++var7;
        }
        ++field2074;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
    private final void method722(int arg0) {
        ++field2073;
        Random var2 = new Random((long) this.field2084);
        this.field2069 = 4096 / this.field2068;
        int var3 = this.field2069 / 2;
        this.field2067 = new int[this.field2084][this.field2068 + 1];
        this.field2081 = new int[this.field2084][this.field2068];
        this.field2077 = 4096 / this.field2084;
        int var4 = this.field2077 / 2;
        this.field2072 = this.field2082 / 2;
        this.field2086 = new int[this.field2084 + 1];
        this.field2086[0] = arg0;
        for (int var5 = 0; var5 < this.field2084; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field2077;
                int var7 = (class4.method26(var2, 12024, 4096) - 2048) * this.field2085 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field2086[var5] = this.field2086[var5 + -1] + var8;
            }
            this.field2067[var5][0] = 0;
            for (int var9 = 0; ~this.field2068 < ~var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field2069;
                    int var11 = (-2048 + class4.method26(var2, 12024, 4096)) * this.field2063 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field2067[var5][var9] = this.field2067[var5][var9 + -1] + var12;
                }
                this.field2081[var5][var9] = this.field2076 > 0 ? -class4.method26(var2, 12024, this.field2076) + 4096 : 4096;
            }
            this.field2067[var5][this.field2068] = 4096;
        }
        this.field2086[this.field2084] = 4096;
    }
}
