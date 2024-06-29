import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 extends class26 {

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "Z")
    private boolean field2441 = false;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    private int field2445 = 0;

    @OriginalMember(owner = "client!p", name = "yb", descriptor = "I")
    private int field2467 = 0;

    @OriginalMember(owner = "client!p", name = "vb", descriptor = "B")
    private byte field2464 = 0;

    @OriginalMember(owner = "client!p", name = "ub", descriptor = "I")
    private int field2463;

    @OriginalMember(owner = "client!p", name = "db", descriptor = "[I")
    private int[] field2446;

    @OriginalMember(owner = "client!p", name = "sb", descriptor = "[I")
    private int[] field2461;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "[I")
    private int[] field2437;

    @OriginalMember(owner = "client!p", name = "jb", descriptor = "[I")
    private int[] field2452;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "[I")
    private int[] field2443;

    @OriginalMember(owner = "client!p", name = "Nb", descriptor = "[I")
    private int[] field2482;

    @OriginalMember(owner = "client!p", name = "Fb", descriptor = "[I")
    private int[] field2474;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "[B")
    private byte[] field2442;

    @OriginalMember(owner = "client!p", name = "ib", descriptor = "[B")
    private byte[] field2451;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "[B")
    private byte[] field2439;

    @OriginalMember(owner = "client!p", name = "Jb", descriptor = "[I")
    private int[] field2478;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "[S")
    private short[] field2440;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "[B")
    private byte[] field2438;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "[S")
    private short[] field2436;

    @OriginalMember(owner = "client!p", name = "xb", descriptor = "[B")
    private byte[] field2466;

    @OriginalMember(owner = "client!p", name = "Kb", descriptor = "[S")
    private short[] field2479;

    @OriginalMember(owner = "client!p", name = "kb", descriptor = "[S")
    private short[] field2453;

    @OriginalMember(owner = "client!p", name = "mb", descriptor = "[S")
    private short[] field2455;

    @OriginalMember(owner = "client!p", name = "Hb", descriptor = "[S")
    private short[] field2476;

    @OriginalMember(owner = "client!p", name = "nb", descriptor = "[S")
    private short[] field2456;

    @OriginalMember(owner = "client!p", name = "rb", descriptor = "[S")
    private short[] field2460;

    @OriginalMember(owner = "client!p", name = "ob", descriptor = "[S")
    private short[] field2457;

    @OriginalMember(owner = "client!p", name = "Cb", descriptor = "[B")
    private byte[] field2471;

    @OriginalMember(owner = "client!p", name = "Ab", descriptor = "[S")
    private short[] field2469;

    @OriginalMember(owner = "client!p", name = "lb", descriptor = "[S")
    private short[] field2454;

    @OriginalMember(owner = "client!p", name = "Db", descriptor = "[[I")
    private int[][] field2472;

    @OriginalMember(owner = "client!p", name = "Eb", descriptor = "[[I")
    private int[][] field2473;

    @OriginalMember(owner = "client!p", name = "gb", descriptor = "[Lkb;")
    private class71[] field2449;

    @OriginalMember(owner = "client!p", name = "Lb", descriptor = "[Lna;")
    private class91[] field2480;

    @OriginalMember(owner = "client!p", name = "tb", descriptor = "[Lkb;")
    private class71[] field2462;

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "S")
    public short field2448;

    @OriginalMember(owner = "client!p", name = "qb", descriptor = "S")
    public short field2459;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "I")
    private static int field2447 = 0;

    @OriginalMember(owner = "client!p", name = "hb", descriptor = "[I")
    private static int[] field2450 = class7.field113;

    @OriginalMember(owner = "client!p", name = "zb", descriptor = "[I")
    private static int[] field2468 = new int[10000];

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "[I")
    private static int[] field2444 = class7.field121;

    @OriginalMember(owner = "client!p", name = "Gb", descriptor = "[I")
    private static int[] field2475 = new int[10000];

    @OriginalMember(owner = "client!p", name = "pb", descriptor = "I")
    private int field2458;

    @OriginalMember(owner = "client!p", name = "wb", descriptor = "I")
    private int field2465;

    @OriginalMember(owner = "client!p", name = "Bb", descriptor = "I")
    private int field2470;

    @OriginalMember(owner = "client!p", name = "Ib", descriptor = "I")
    private int field2477;

    @OriginalMember(owner = "client!p", name = "Mb", descriptor = "I")
    private int field2481;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()Lp;")
    public final class104 method834() {
        class104 var1 = new class104();
        if (this.field2442 != null) {
            var1.field2442 = new byte[this.field2467];
            for (int var2 = 0; var2 < this.field2467; ++var2) {
                var1.field2442[var2] = this.field2442[var2];
            }
        }
        var1.field2445 = this.field2445;
        var1.field2467 = this.field2467;
        var1.field2463 = this.field2463;
        var1.field2446 = this.field2446;
        var1.field2461 = this.field2461;
        var1.field2437 = this.field2437;
        var1.field2443 = this.field2443;
        var1.field2482 = this.field2482;
        var1.field2474 = this.field2474;
        var1.field2451 = this.field2451;
        var1.field2439 = this.field2439;
        var1.field2438 = this.field2438;
        var1.field2436 = this.field2436;
        var1.field2440 = this.field2440;
        var1.field2464 = this.field2464;
        var1.field2466 = this.field2466;
        var1.field2479 = this.field2479;
        var1.field2453 = this.field2453;
        var1.field2455 = this.field2455;
        var1.field2476 = this.field2476;
        var1.field2456 = this.field2456;
        var1.field2460 = this.field2460;
        var1.field2457 = this.field2457;
        var1.field2471 = this.field2471;
        var1.field2469 = this.field2469;
        var1.field2454 = this.field2454;
        var1.field2452 = this.field2452;
        var1.field2478 = this.field2478;
        var1.field2472 = this.field2472;
        var1.field2473 = this.field2473;
        var1.field2449 = this.field2449;
        var1.field2480 = this.field2480;
        var1.field2448 = this.field2448;
        var1.field2459 = this.field2459;
        return var1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(SS)V")
    public final void method835(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2467; ++var3) {
            if (this.field2436[var3] == arg0) {
                this.field2436[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(III)V")
    public final void method836(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2445; ++var4) {
            this.field2446[var4] += arg0;
            this.field2461[var4] += arg1;
            this.field2437[var4] += arg2;
        }
        this.method856();
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([B)V")
    private final void method837(byte[] arg0) {
        class66 var2 = new class66(arg0);
        class66 var3 = new class66(arg0);
        class66 var4 = new class66(arg0);
        class66 var5 = new class66(arg0);
        class66 var6 = new class66(arg0);
        class66 var7 = new class66(arg0);
        class66 var8 = new class66(arg0);
        var2.field1569 = arg0.length - 23;
        int var9 = var2.method532(0);
        int var10 = var2.method532(0);
        int var11 = var2.method533(255);
        int var12 = var2.method533(255);
        int var13 = var2.method533(255);
        int var14 = var2.method533(255);
        int var15 = var2.method533(255);
        int var16 = var2.method533(255);
        int var17 = var2.method533(255);
        int var18 = var2.method532(0);
        int var19 = var2.method532(0);
        int var20 = var2.method532(0);
        int var21 = var2.method532(0);
        int var22 = var2.method532(0);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2466 = new byte[var11];
            var2.field1569 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field2466[var26] = var2.method545((byte) 88);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 * 2 + var56;
        int var60 = var24 + var58;
        int var62 = var24 * 2 + var25 * 2 + var60;
        this.field2445 = var9;
        this.field2467 = var10;
        this.field2463 = var11;
        this.field2446 = new int[var9];
        this.field2461 = new int[var9];
        this.field2437 = new int[var9];
        this.field2443 = new int[var10];
        this.field2482 = new int[var10];
        this.field2474 = new int[var10];
        if (var17 == 1) {
            this.field2452 = new int[var9];
        }
        if (var12 == 1) {
            this.field2442 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2451 = new byte[var10];
        } else {
            this.field2464 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2439 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2478 = new int[var10];
        }
        if (var16 == 1) {
            this.field2440 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2438 = new byte[var10];
        }
        this.field2436 = new short[var10];
        if (var11 > 0) {
            this.field2479 = new short[var11];
            this.field2453 = new short[var11];
            this.field2455 = new short[var11];
            if (var24 > 0) {
                this.field2476 = new short[var24];
                this.field2456 = new short[var24];
                this.field2460 = new short[var24];
                this.field2457 = new short[var24];
                this.field2471 = new byte[var24];
                this.field2469 = new short[var24];
            }
            if (var25 > 0) {
                this.field2454 = new short[var25];
            }
        }
        var2.field1569 = var11;
        var3.field1569 = var44;
        var4.field1569 = var46;
        var5.field1569 = var48;
        var6.field1569 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method533(255);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method517(-49152);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method517(-49152);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method517(-49152);
            }
            this.field2446[var67] = var64 + var82;
            this.field2461[var67] = var65 + var83;
            this.field2437[var67] = var66 + var84;
            var64 = this.field2446[var67];
            var65 = this.field2461[var67];
            var66 = this.field2437[var67];
            if (var17 == 1) {
                this.field2452[var67] = var6.method533(255);
            }
        }
        var2.field1569 = var42;
        var3.field1569 = var31;
        var4.field1569 = var34;
        var5.field1569 = var37;
        var6.field1569 = var35;
        var7.field1569 = var40;
        var8.field1569 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field2436[var68] = (short) var2.method532(0);
            if (var12 == 1) {
                this.field2442[var68] = var3.method545((byte) 106);
            }
            if (var13 == 255) {
                this.field2451[var68] = var4.method545((byte) 90);
            }
            if (var14 == 1) {
                this.field2439[var68] = var5.method545((byte) 124);
            }
            if (var15 == 1) {
                this.field2478[var68] = var6.method533(255);
            }
            if (var16 == 1) {
                this.field2440[var68] = (short) (var7.method532(0) - 1);
            }
            if (this.field2438 != null && this.field2440[var68] != -1) {
                this.field2438[var68] = (byte) (var8.method533(255) - 1);
            }
        }
        var2.field1569 = var33;
        var3.field1569 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method533(255);
            if (var77 == 1) {
                var69 = var2.method517(-49152) + var72;
                var70 = var2.method517(-49152) + var69;
                var71 = var2.method517(-49152) + var70;
                var72 = var71;
                this.field2443[var73] = var69;
                this.field2482[var73] = var70;
                this.field2474[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method517(-49152) + var72;
                var72 = var71;
                this.field2443[var73] = var69;
                this.field2482[var73] = var70;
                this.field2474[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method517(-49152) + var72;
                var72 = var71;
                this.field2443[var73] = var69;
                this.field2482[var73] = var70;
                this.field2474[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method517(-49152) + var72;
                var72 = var71;
                this.field2443[var73] = var69;
                this.field2482[var73] = var80;
                this.field2474[var73] = var71;
            }
        }
        var2.field1569 = var50;
        var3.field1569 = var52;
        var4.field1569 = var54;
        var5.field1569 = var56;
        var6.field1569 = var58;
        var7.field1569 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field2466[var74] & 255;
            if (var76 == 0) {
                this.field2479[var74] = (short) var2.method532(0);
                this.field2453[var74] = (short) var2.method532(0);
                this.field2455[var74] = (short) var2.method532(0);
            }
            if (var76 == 1) {
                this.field2479[var74] = (short) var3.method532(0);
                this.field2453[var74] = (short) var3.method532(0);
                this.field2455[var74] = (short) var3.method532(0);
                this.field2476[var74] = (short) var4.method532(0);
                this.field2456[var74] = (short) var4.method532(0);
                this.field2460[var74] = (short) var4.method532(0);
                this.field2457[var74] = (short) var5.method532(0);
                this.field2471[var74] = var6.method545((byte) 99);
                this.field2469[var74] = (short) var7.method532(0);
            }
            if (var76 == 2) {
                this.field2479[var74] = (short) var3.method532(0);
                this.field2453[var74] = (short) var3.method532(0);
                this.field2455[var74] = (short) var3.method532(0);
                this.field2476[var74] = (short) var4.method532(0);
                this.field2456[var74] = (short) var4.method532(0);
                this.field2460[var74] = (short) var4.method532(0);
                this.field2457[var74] = (short) var5.method532(0);
                this.field2471[var74] = var6.method545((byte) 85);
                this.field2469[var74] = (short) var7.method532(0);
                this.field2454[var74] = (short) var7.method532(0);
            }
            if (var76 == 3) {
                this.field2479[var74] = (short) var3.method532(0);
                this.field2453[var74] = (short) var3.method532(0);
                this.field2455[var74] = (short) var3.method532(0);
                this.field2476[var74] = (short) var4.method532(0);
                this.field2456[var74] = (short) var4.method532(0);
                this.field2460[var74] = (short) var4.method532(0);
                this.field2457[var74] = (short) var5.method532(0);
                this.field2471[var74] = var6.method545((byte) 91);
                this.field2469[var74] = (short) var7.method532(0);
            }
        }
        var2.field1569 = var62;
        int var75 = var2.method533(255);
        if (var75 != 0) {
            new class100();
            var2.method532(0);
            var2.method532(0);
            var2.method532(0);
            var2.method539(true);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([[IIIIZI)Lp;")
    public final class104 method838(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method845();
        int var7 = this.field2481 + arg1;
        int var8 = this.field2470 + arg1;
        int var9 = this.field2458 + arg3;
        int var10 = this.field2465 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class104 var15;
                if (arg4) {
                    var15 = new class104();
                    var15.field2445 = this.field2445;
                    var15.field2467 = this.field2467;
                    var15.field2463 = this.field2463;
                    var15.field2446 = this.field2446;
                    var15.field2437 = this.field2437;
                    var15.field2443 = this.field2443;
                    var15.field2482 = this.field2482;
                    var15.field2474 = this.field2474;
                    var15.field2442 = this.field2442;
                    var15.field2451 = this.field2451;
                    var15.field2439 = this.field2439;
                    var15.field2438 = this.field2438;
                    var15.field2436 = this.field2436;
                    var15.field2440 = this.field2440;
                    var15.field2464 = this.field2464;
                    var15.field2466 = this.field2466;
                    var15.field2479 = this.field2479;
                    var15.field2453 = this.field2453;
                    var15.field2455 = this.field2455;
                    var15.field2476 = this.field2476;
                    var15.field2456 = this.field2456;
                    var15.field2460 = this.field2460;
                    var15.field2457 = this.field2457;
                    var15.field2471 = this.field2471;
                    var15.field2469 = this.field2469;
                    var15.field2454 = this.field2454;
                    var15.field2452 = this.field2452;
                    var15.field2478 = this.field2478;
                    var15.field2472 = this.field2472;
                    var15.field2473 = this.field2473;
                    var15.field2448 = this.field2448;
                    var15.field2459 = this.field2459;
                    var15.field2461 = new int[var15.field2445];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field2445; ++var16) {
                        int var17 = this.field2446[var16] + arg1;
                        int var18 = this.field2437[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field2461[var16] = this.field2461[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field2445; ++var26) {
                        int var27 = (-this.field2461[var26] << 16) / super.field470;
                        if (var27 < arg5) {
                            int var28 = this.field2446[var26] + arg1;
                            int var29 = this.field2437[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field2461[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2461[var26];
                        }
                    }
                }
                var15.method856();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()V")
    public final void method839() {
        for (int var1 = 0; var1 < this.field2445; ++var1) {
            int var2 = this.field2446[var1];
            this.field2446[var1] = this.field2437[var1];
            this.field2437[var1] = -var2;
        }
        this.method856();
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()V")
    public final void method840() {
        for (int var1 = 0; var1 < this.field2445; ++var1) {
            int var2 = this.field2437[var1];
            this.field2437[var1] = this.field2446[var1];
            this.field2446[var1] = -var2;
        }
        this.method856();
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "()V")
    public final void method841() {
        if (this.field2449 == null) {
            this.field2449 = new class71[this.field2445];
            for (int var1 = 0; var1 < this.field2445; ++var1) {
                this.field2449[var1] = new class71();
            }
            for (int var2 = 0; var2 < this.field2467; ++var2) {
                int var3 = this.field2443[var2];
                int var4 = this.field2482[var2];
                int var5 = this.field2474[var2];
                int var6 = this.field2446[var4] - this.field2446[var3];
                int var7 = this.field2461[var4] - this.field2461[var3];
                int var8 = this.field2437[var4] - this.field2437[var3];
                int var9 = this.field2446[var5] - this.field2446[var3];
                int var10 = this.field2461[var5] - this.field2461[var3];
                int var11 = this.field2437[var5] - this.field2437[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field2442 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field2442[var2];
                }
                if (var19 == 0) {
                    class71 var20 = this.field2449[var3];
                    var20.field1685 += var16;
                    var20.field1683 += var17;
                    var20.field1673 += var18;
                    ++var20.field1677;
                    class71 var21 = this.field2449[var4];
                    var21.field1685 += var16;
                    var21.field1683 += var17;
                    var21.field1673 += var18;
                    ++var21.field1677;
                    class71 var22 = this.field2449[var5];
                    var22.field1685 += var16;
                    var22.field1683 += var17;
                    var22.field1673 += var18;
                    ++var22.field1677;
                } else if (var19 == 1) {
                    if (this.field2480 == null) {
                        this.field2480 = new class91[this.field2467];
                    }
                    class91 var23 = this.field2480[var2] = new class91();
                    var23.field2077 = var16;
                    var23.field2093 = var17;
                    var23.field2080 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lea;II)Lp;")
    public static final class104 method842(class30 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method206(arg1, arg2, -68);
        return var3 == null ? null : new class104(var3);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "([B)V")
    private final void method843(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class66 var4 = new class66(arg0);
        class66 var5 = new class66(arg0);
        class66 var6 = new class66(arg0);
        class66 var7 = new class66(arg0);
        class66 var8 = new class66(arg0);
        var4.field1569 = arg0.length - 18;
        int var9 = var4.method532(0);
        int var10 = var4.method532(0);
        int var11 = var4.method533(255);
        int var12 = var4.method533(255);
        int var13 = var4.method533(255);
        int var14 = var4.method533(255);
        int var15 = var4.method533(255);
        int var16 = var4.method533(255);
        int var17 = var4.method532(0);
        int var18 = var4.method532(0);
        int var19 = var4.method532(0);
        int var20 = var4.method532(0);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field2445 = var9;
        this.field2467 = var10;
        this.field2463 = var11;
        this.field2446 = new int[var9];
        this.field2461 = new int[var9];
        this.field2437 = new int[var9];
        this.field2443 = new int[var10];
        this.field2482 = new int[var10];
        this.field2474 = new int[var10];
        if (var11 > 0) {
            this.field2466 = new byte[var11];
            this.field2479 = new short[var11];
            this.field2453 = new short[var11];
            this.field2455 = new short[var11];
        }
        if (var16 == 1) {
            this.field2452 = new int[var9];
        }
        if (var12 == 1) {
            this.field2442 = new byte[var10];
            this.field2438 = new byte[var10];
            this.field2440 = new short[var10];
        }
        if (var13 == 255) {
            this.field2451 = new byte[var10];
        } else {
            this.field2464 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2439 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2478 = new int[var10];
        }
        this.field2436 = new short[var10];
        var4.field1569 = var21;
        var5.field1569 = var36;
        var6.field1569 = var38;
        var7.field1569 = var40;
        var8.field1569 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method533(255);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method517(-49152);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method517(-49152);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method517(-49152);
            }
            this.field2446[var46] = var43 + var63;
            this.field2461[var46] = var44 + var64;
            this.field2437[var46] = var45 + var65;
            var43 = this.field2446[var46];
            var44 = this.field2461[var46];
            var45 = this.field2437[var46];
            if (var16 == 1) {
                this.field2452[var46] = var8.method533(255);
            }
        }
        var4.field1569 = var32;
        var5.field1569 = var28;
        var6.field1569 = var26;
        var7.field1569 = var30;
        var8.field1569 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field2436[var47] = (short) var4.method532(0);
            if (var12 == 1) {
                int var61 = var5.method533(255);
                if ((var61 & 1) == 1) {
                    this.field2442[var47] = 1;
                    var2 = true;
                } else {
                    this.field2442[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field2438[var47] = (byte) (var61 >> 2);
                    this.field2440[var47] = this.field2436[var47];
                    this.field2436[var47] = 127;
                    if (this.field2440[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2438[var47] = -1;
                    this.field2440[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2451[var47] = var6.method545((byte) 82);
            }
            if (var14 == 1) {
                this.field2439[var47] = var7.method545((byte) 124);
            }
            if (var15 == 1) {
                this.field2478[var47] = var8.method533(255);
            }
        }
        var4.field1569 = var25;
        var5.field1569 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method533(255);
            if (var57 == 1) {
                var48 = var4.method517(-49152) + var51;
                var49 = var4.method517(-49152) + var48;
                var50 = var4.method517(-49152) + var49;
                var51 = var50;
                this.field2443[var52] = var48;
                this.field2482[var52] = var49;
                this.field2474[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method517(-49152) + var51;
                var51 = var50;
                this.field2443[var52] = var48;
                this.field2482[var52] = var49;
                this.field2474[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method517(-49152) + var51;
                var51 = var50;
                this.field2443[var52] = var48;
                this.field2482[var52] = var49;
                this.field2474[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method517(-49152) + var51;
                var51 = var50;
                this.field2443[var52] = var48;
                this.field2482[var52] = var60;
                this.field2474[var52] = var50;
            }
        }
        var4.field1569 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field2466[var53] = 0;
            this.field2479[var53] = (short) var4.method532(0);
            this.field2453[var53] = (short) var4.method532(0);
            this.field2455[var53] = (short) var4.method532(0);
        }
        if (this.field2438 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field2438[var55] & 255;
                if (var56 != 255) {
                    if ((this.field2479[var56] & 65535) == this.field2443[var55] && (this.field2453[var56] & 65535) == this.field2482[var55] && (this.field2455[var56] & 65535) == this.field2474[var55]) {
                        this.field2438[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2438 = null;
            }
        }
        if (!var3) {
            this.field2440 = null;
        }
        if (!var2) {
            this.field2442 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "()V")
    public final void method844() {
        for (int var1 = 0; var1 < this.field2445; ++var1) {
            this.field2446[var1] = -this.field2446[var1];
            this.field2437[var1] = -this.field2437[var1];
        }
        this.method856();
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "()V")
    private final void method845() {
        if (!this.field2441) {
            super.field470 = 0;
            this.field2477 = 0;
            this.field2481 = 999999;
            this.field2470 = -999999;
            this.field2465 = -99999;
            this.field2458 = 99999;
            for (int var1 = 0; var1 < this.field2445; ++var1) {
                int var2 = this.field2446[var1];
                int var3 = this.field2461[var1];
                int var4 = this.field2437[var1];
                if (var2 < this.field2481) {
                    this.field2481 = var2;
                }
                if (var2 > this.field2470) {
                    this.field2470 = var2;
                }
                if (var4 < this.field2458) {
                    this.field2458 = var4;
                }
                if (var4 > this.field2465) {
                    this.field2465 = var4;
                }
                if (-var3 > super.field470) {
                    super.field470 = -var3;
                }
                if (var3 > this.field2477) {
                    this.field2477 = var3;
                }
            }
            this.field2441 = true;
        }
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "()V")
    public final void method846() {
        for (int var1 = 0; var1 < this.field2445; ++var1) {
            this.field2437[var1] = -this.field2437[var1];
        }
        for (int var2 = 0; var2 < this.field2467; ++var2) {
            int var3 = this.field2443[var2];
            this.field2443[var2] = this.field2474[var2];
            this.field2474[var2] = var3;
        }
        this.method856();
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lp;I)I")
    private final int method847(class104 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2446[arg1];
        int var5 = arg0.field2461[arg1];
        int var6 = arg0.field2437[arg1];
        for (int var7 = 0; var7 < this.field2445; ++var7) {
            if (this.field2446[var7] == var4 && this.field2461[var7] == var5 && this.field2437[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2446[this.field2445] = var4;
            this.field2461[this.field2445] = var5;
            this.field2437[this.field2445] = var6;
            if (arg0.field2452 != null) {
                this.field2452[this.field2445] = arg0.field2452[arg1];
            }
            var3 = this.field2445++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)I")
    private static final int method848(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)Lod;")
    public final class101 method849(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method841();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class101 var8 = new class101();
        var8.field2347 = new int[this.field2467];
        var8.field2329 = new int[this.field2467];
        var8.field2327 = new int[this.field2467];
        if (this.field2463 > 0 && this.field2438 != null) {
            int[] var9 = new int[this.field2463];
            for (int var10 = 0; var10 < this.field2467; ++var10) {
                if (this.field2438[var10] != -1) {
                    ++var9[this.field2438[var10] & 255];
                }
            }
            var8.field2336 = 0;
            for (int var11 = 0; var11 < this.field2463; ++var11) {
                if (var9[var11] > 0 && this.field2466[var11] == 0) {
                    ++var8.field2336;
                }
            }
            var8.field2352 = new int[var8.field2336];
            var8.field2337 = new int[var8.field2336];
            var8.field2328 = new int[var8.field2336];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2463; ++var13) {
                if (var9[var13] > 0 && this.field2466[var13] == 0) {
                    var8.field2352[var12] = this.field2479[var13] & 65535;
                    var8.field2337[var12] = this.field2453[var13] & 65535;
                    var8.field2328[var12] = this.field2455[var13] & 65535;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2341 = new byte[this.field2467];
            for (int var14 = 0; var14 < this.field2467; ++var14) {
                if (this.field2438[var14] != -1) {
                    var8.field2341[var14] = (byte) var9[this.field2438[var14] & 255];
                } else {
                    var8.field2341[var14] = -1;
                }
            }
        }
        for (int var15 = 0; var15 < this.field2467; ++var15) {
            byte var16;
            if (this.field2442 == null) {
                var16 = 0;
            } else {
                var16 = this.field2442[var15];
            }
            byte var17;
            if (this.field2439 == null) {
                var17 = 0;
            } else {
                var17 = this.field2439[var15];
            }
            short var18;
            if (this.field2440 == null) {
                var18 = -1;
            } else {
                var18 = this.field2440[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 != 0) {
                    if (var16 == 1) {
                        class91 var26 = this.field2480[var15];
                        int var27 = (var26.field2080 * arg4 + var26.field2093 * arg3 + var26.field2077 * arg2) / (var7 / 2 + var7) + arg0;
                        var8.field2347[var15] = method848(this.field2436[var15] & 65535, var27);
                        var8.field2327[var15] = -1;
                    } else if (var16 == 3) {
                        var8.field2347[var15] = 128;
                        var8.field2327[var15] = -1;
                    } else {
                        var8.field2327[var15] = -2;
                    }
                } else {
                    int var19 = this.field2436[var15] & 65535;
                    class71 var20;
                    if (this.field2462 != null && this.field2462[this.field2443[var15]] != null) {
                        var20 = this.field2462[this.field2443[var15]];
                    } else {
                        var20 = this.field2449[this.field2443[var15]];
                    }
                    int var21 = (var20.field1673 * arg4 + var20.field1685 * arg2 + var20.field1683 * arg3) / (var20.field1677 * var7) + arg0;
                    var8.field2347[var15] = method848(var19, var21);
                    class71 var22;
                    if (this.field2462 != null && this.field2462[this.field2482[var15]] != null) {
                        var22 = this.field2462[this.field2482[var15]];
                    } else {
                        var22 = this.field2449[this.field2482[var15]];
                    }
                    int var23 = (var22.field1673 * arg4 + var22.field1685 * arg2 + var22.field1683 * arg3) / (var22.field1677 * var7) + arg0;
                    var8.field2329[var15] = method848(var19, var23);
                    class71 var24;
                    if (this.field2462 != null && this.field2462[this.field2474[var15]] != null) {
                        var24 = this.field2462[this.field2474[var15]];
                    } else {
                        var24 = this.field2449[this.field2474[var15]];
                    }
                    int var25 = (var24.field1673 * arg4 + var24.field1685 * arg2 + var24.field1683 * arg3) / (var24.field1677 * var7) + arg0;
                    var8.field2327[var15] = method848(var19, var25);
                }
            } else if (var16 != 0) {
                if (var16 == 1) {
                    class91 var34 = this.field2480[var15];
                    int var35 = (var34.field2080 * arg4 + var34.field2093 * arg3 + var34.field2077 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field2347[var15] = method851(var35);
                    var8.field2327[var15] = -1;
                } else {
                    var8.field2327[var15] = -2;
                }
            } else {
                class71 var28;
                if (this.field2462 != null && this.field2462[this.field2443[var15]] != null) {
                    var28 = this.field2462[this.field2443[var15]];
                } else {
                    var28 = this.field2449[this.field2443[var15]];
                }
                int var29 = (var28.field1673 * arg4 + var28.field1685 * arg2 + var28.field1683 * arg3) / (var28.field1677 * var7) + arg0;
                var8.field2347[var15] = method851(var29);
                class71 var30;
                if (this.field2462 != null && this.field2462[this.field2482[var15]] != null) {
                    var30 = this.field2462[this.field2482[var15]];
                } else {
                    var30 = this.field2449[this.field2482[var15]];
                }
                int var31 = (var30.field1673 * arg4 + var30.field1685 * arg2 + var30.field1683 * arg3) / (var30.field1677 * var7) + arg0;
                var8.field2329[var15] = method851(var31);
                class71 var32;
                if (this.field2462 != null && this.field2462[this.field2474[var15]] != null) {
                    var32 = this.field2462[this.field2474[var15]];
                } else {
                    var32 = this.field2449[this.field2474[var15]];
                }
                int var33 = (var32.field1673 * arg4 + var32.field1685 * arg2 + var32.field1683 * arg3) / (var32.field1677 * var7) + arg0;
                var8.field2327[var15] = method851(var33);
            }
        }
        this.method854();
        var8.field2349 = this.field2445;
        var8.field2339 = this.field2446;
        var8.field2323 = this.field2461;
        var8.field2332 = this.field2437;
        var8.field2350 = this.field2467;
        var8.field2340 = this.field2443;
        var8.field2335 = this.field2482;
        var8.field2348 = this.field2474;
        var8.field2351 = this.field2451;
        var8.field2338 = this.field2439;
        var8.field2330 = this.field2464;
        var8.field2346 = this.field2472;
        var8.field2326 = this.field2473;
        var8.field2334 = this.field2440;
        return var8;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lp;Lp;IIIZ)V")
    public static final void method850(class104 arg0, class104 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method845();
        arg0.method841();
        arg1.method845();
        arg1.method841();
        ++field2447;
        int var6 = 0;
        int[] var7 = arg1.field2446;
        int var8 = arg1.field2445;
        for (int var9 = 0; var9 < arg0.field2445; ++var9) {
            class71 var12 = arg0.field2449[var9];
            if (var12.field1677 != 0) {
                int var13 = arg0.field2461[var9] - arg3;
                if (var13 <= arg1.field2477) {
                    int var14 = arg0.field2446[var9] - arg2;
                    if (var14 >= arg1.field2481 && var14 <= arg1.field2470) {
                        int var15 = arg0.field2437[var9] - arg4;
                        if (var15 >= arg1.field2458 && var15 <= arg1.field2465) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class71 var17 = arg1.field2449[var16];
                                if (var7[var16] == var14 && arg1.field2437[var16] == var15 && arg1.field2461[var16] == var13 && var17.field1677 != 0) {
                                    if (arg0.field2462 == null) {
                                        arg0.field2462 = new class71[arg0.field2445];
                                    }
                                    if (arg1.field2462 == null) {
                                        arg1.field2462 = new class71[var8];
                                    }
                                    class71 var18 = arg0.field2462[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field2462[var9] = new class71(var12);
                                    }
                                    class71 var19 = arg1.field2462[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field2462[var16] = new class71(var17);
                                    }
                                    var18.field1685 += var17.field1685;
                                    var18.field1683 += var17.field1683;
                                    var18.field1673 += var17.field1673;
                                    var18.field1677 += var17.field1677;
                                    var19.field1685 += var12.field1685;
                                    var19.field1683 += var12.field1683;
                                    var19.field1673 += var12.field1673;
                                    var19.field1677 += var12.field1677;
                                    ++var6;
                                    field2475[var9] = field2447;
                                    field2468[var16] = field2447;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field2467; ++var10) {
                if (field2475[arg0.field2443[var10]] == field2447 && field2475[arg0.field2482[var10]] == field2447 && field2475[arg0.field2474[var10]] == field2447) {
                    if (arg0.field2442 == null) {
                        arg0.field2442 = new byte[arg0.field2467];
                    }
                    arg0.field2442[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field2467; ++var11) {
                if (field2468[arg1.field2443[var11]] == field2447 && field2468[arg1.field2482[var11]] == field2447 && field2468[arg1.field2474[var11]] == field2447) {
                    if (arg1.field2442 == null) {
                        arg1.field2442 = new byte[arg1.field2467];
                    }
                    arg1.field2442[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)I")
    private static final int method851(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!p", name = "h", descriptor = "()V")
    public static void method852() {
        field2475 = null;
        field2468 = null;
        field2450 = null;
        field2444 = null;
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
    public final void method853(int arg0) {
        int var2 = field2450[arg0];
        int var3 = field2444[arg0];
        for (int var4 = 0; var4 < this.field2445; ++var4) {
            int var5 = this.field2446[var4] * var3 + this.field2437[var4] * var2 >> 16;
            this.field2437[var4] = this.field2437[var4] * var3 - this.field2446[var4] * var2 >> 16;
            this.field2446[var4] = var5;
        }
        this.method856();
    }

    @OriginalMember(owner = "client!p", name = "i", descriptor = "()V")
    private final void method854() {
        int var10002;
        if (this.field2452 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2445; ++var3) {
                int var7 = this.field2452[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2472 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field2472[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2445) {
                int var6 = this.field2452[var5];
                this.field2472[var6][var1[var6]++] = var5++;
            }
            this.field2452 = null;
        }
        if (this.field2478 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field2467; ++var10) {
                int var14 = this.field2478[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field2473 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field2473[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field2467) {
                int var13 = this.field2478[var12];
                this.field2473[var13][var8[var13]++] = var12++;
            }
            this.field2478 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(SS)V")
    public final void method855(short arg0, short arg1) {
        if (this.field2440 != null) {
            for (int var3 = 0; var3 < this.field2467; ++var3) {
                if (this.field2440[var3] == arg0) {
                    this.field2440[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "j", descriptor = "()V")
    private final void method856() {
        this.field2449 = null;
        this.field2462 = null;
        this.field2480 = null;
        this.field2441 = false;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(III)V")
    public final void method857(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2445; ++var4) {
            this.field2446[var4] = this.field2446[var4] * arg0 / 128;
            this.field2461[var4] = this.field2461[var4] * arg1 / 128;
            this.field2437[var4] = this.field2437[var4] * arg2 / 128;
        }
        this.method856();
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    private class104() {
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "([B)V")
    private class104(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method837(arg0);
        } else {
            this.method843(arg0);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "([Lp;I)V")
    public class104(class104[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2445 = 0;
        this.field2467 = 0;
        this.field2463 = 0;
        this.field2464 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class104 var15 = arg0[var9];
            if (var15 != null) {
                this.field2445 += var15.field2445;
                this.field2467 += var15.field2467;
                this.field2463 += var15.field2463;
                if (var15.field2451 != null) {
                    var4 = true;
                } else {
                    if (this.field2464 == -1) {
                        this.field2464 = var15.field2464;
                    }
                    if (this.field2464 != var15.field2464) {
                        var4 = true;
                    }
                }
                var3 |= var15.field2442 != null;
                var5 |= var15.field2439 != null;
                var6 |= var15.field2478 != null;
                var7 |= var15.field2440 != null;
                var8 |= var15.field2438 != null;
            }
        }
        this.field2446 = new int[this.field2445];
        this.field2461 = new int[this.field2445];
        this.field2437 = new int[this.field2445];
        this.field2452 = new int[this.field2445];
        this.field2443 = new int[this.field2467];
        this.field2482 = new int[this.field2467];
        this.field2474 = new int[this.field2467];
        if (var3) {
            this.field2442 = new byte[this.field2467];
        }
        if (var4) {
            this.field2451 = new byte[this.field2467];
        }
        if (var5) {
            this.field2439 = new byte[this.field2467];
        }
        if (var6) {
            this.field2478 = new int[this.field2467];
        }
        if (var7) {
            this.field2440 = new short[this.field2467];
        }
        if (var8) {
            this.field2438 = new byte[this.field2467];
        }
        this.field2436 = new short[this.field2467];
        if (this.field2463 > 0) {
            this.field2466 = new byte[this.field2463];
            this.field2479 = new short[this.field2463];
            this.field2453 = new short[this.field2463];
            this.field2455 = new short[this.field2463];
            this.field2476 = new short[this.field2463];
            this.field2456 = new short[this.field2463];
            this.field2460 = new short[this.field2463];
            this.field2457 = new short[this.field2463];
            this.field2471 = new byte[this.field2463];
            this.field2469 = new short[this.field2463];
            this.field2454 = new short[this.field2463];
        }
        this.field2445 = 0;
        this.field2467 = 0;
        this.field2463 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class104 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2467; ++var12) {
                    if (var3 && var11.field2442 != null) {
                        this.field2442[this.field2467] = var11.field2442[var12];
                    }
                    if (var4) {
                        if (var11.field2451 != null) {
                            this.field2451[this.field2467] = var11.field2451[var12];
                        } else {
                            this.field2451[this.field2467] = var11.field2464;
                        }
                    }
                    if (var5 && var11.field2439 != null) {
                        this.field2439[this.field2467] = var11.field2439[var12];
                    }
                    if (var6 && var11.field2478 != null) {
                        this.field2478[this.field2467] = var11.field2478[var12];
                    }
                    if (var7) {
                        if (var11.field2440 != null) {
                            this.field2440[this.field2467] = var11.field2440[var12];
                        } else {
                            this.field2440[this.field2467] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field2438 != null && var11.field2438[var12] != -1) {
                            this.field2438[this.field2467] = (byte) (var11.field2438[var12] + this.field2463);
                        } else {
                            this.field2438[this.field2467] = -1;
                        }
                    }
                    this.field2436[this.field2467] = var11.field2436[var12];
                    this.field2443[this.field2467] = this.method847(var11, var11.field2443[var12]);
                    this.field2482[this.field2467] = this.method847(var11, var11.field2482[var12]);
                    this.field2474[this.field2467] = this.method847(var11, var11.field2474[var12]);
                    ++this.field2467;
                }
                for (int var13 = 0; var13 < var11.field2463; ++var13) {
                    byte var14 = this.field2466[this.field2463] = var11.field2466[var13];
                    if (var14 == 0) {
                        this.field2479[this.field2463] = (short) this.method847(var11, var11.field2479[var13]);
                        this.field2453[this.field2463] = (short) this.method847(var11, var11.field2453[var13]);
                        this.field2455[this.field2463] = (short) this.method847(var11, var11.field2455[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2479[this.field2463] = var11.field2479[var13];
                        this.field2453[this.field2463] = var11.field2453[var13];
                        this.field2455[this.field2463] = var11.field2455[var13];
                        this.field2476[this.field2463] = var11.field2476[var13];
                        this.field2456[this.field2463] = var11.field2456[var13];
                        this.field2460[this.field2463] = var11.field2460[var13];
                        this.field2457[this.field2463] = var11.field2457[var13];
                        this.field2471[this.field2463] = var11.field2471[var13];
                        this.field2469[this.field2463] = var11.field2469[var13];
                    }
                    if (var14 == 2) {
                        this.field2454[this.field2463] = var11.field2454[var13];
                    }
                    ++this.field2463;
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lp;ZZZZ)V")
    public class104(class104 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2445 = arg0.field2445;
        this.field2467 = arg0.field2467;
        this.field2463 = arg0.field2463;
        if (arg1) {
            this.field2446 = arg0.field2446;
            this.field2461 = arg0.field2461;
            this.field2437 = arg0.field2437;
        } else {
            this.field2446 = new int[this.field2445];
            this.field2461 = new int[this.field2445];
            this.field2437 = new int[this.field2445];
            for (int var6 = 0; var6 < this.field2445; ++var6) {
                this.field2446[var6] = arg0.field2446[var6];
                this.field2461[var6] = arg0.field2461[var6];
                this.field2437[var6] = arg0.field2437[var6];
            }
        }
        if (arg2) {
            this.field2436 = arg0.field2436;
        } else {
            this.field2436 = new short[this.field2467];
            for (int var7 = 0; var7 < this.field2467; ++var7) {
                this.field2436[var7] = arg0.field2436[var7];
            }
        }
        if (!arg3 && arg0.field2440 != null) {
            this.field2440 = new short[this.field2467];
            for (int var8 = 0; var8 < this.field2467; ++var8) {
                this.field2440[var8] = arg0.field2440[var8];
            }
        } else {
            this.field2440 = arg0.field2440;
        }
        if (arg4) {
            this.field2439 = arg0.field2439;
        } else {
            this.field2439 = new byte[this.field2467];
            if (arg0.field2439 == null) {
                for (int var9 = 0; var9 < this.field2467; ++var9) {
                    this.field2439[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2467; ++var10) {
                    this.field2439[var10] = arg0.field2439[var10];
                }
            }
        }
        this.field2443 = arg0.field2443;
        this.field2482 = arg0.field2482;
        this.field2474 = arg0.field2474;
        this.field2442 = arg0.field2442;
        this.field2451 = arg0.field2451;
        this.field2438 = arg0.field2438;
        this.field2464 = arg0.field2464;
        this.field2466 = arg0.field2466;
        this.field2479 = arg0.field2479;
        this.field2453 = arg0.field2453;
        this.field2455 = arg0.field2455;
        this.field2476 = arg0.field2476;
        this.field2456 = arg0.field2456;
        this.field2460 = arg0.field2460;
        this.field2457 = arg0.field2457;
        this.field2471 = arg0.field2471;
        this.field2469 = arg0.field2469;
        this.field2454 = arg0.field2454;
        this.field2452 = arg0.field2452;
        this.field2478 = arg0.field2478;
        this.field2472 = arg0.field2472;
        this.field2473 = arg0.field2473;
        this.field2449 = arg0.field2449;
        this.field2480 = arg0.field2480;
        this.field2462 = arg0.field2462;
        this.field2448 = arg0.field2448;
        this.field2459 = arg0.field2459;
    }
}
