import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("oe")
public class class135 extends class95 {

    @OriginalMember(owner = "oe", name = "sb", descriptor = "I")
    public int field2594 = 0;

    @OriginalMember(owner = "oe", name = "Gb", descriptor = "I")
    public int field2608 = 0;

    @OriginalMember(owner = "oe", name = "bb", descriptor = "B")
    public byte field2577 = 0;

    @OriginalMember(owner = "oe", name = "Db", descriptor = "Z")
    private boolean field2605 = false;

    @OriginalMember(owner = "oe", name = "lb", descriptor = "I")
    public int field2587;

    @OriginalMember(owner = "oe", name = "Cb", descriptor = "[I")
    public int[] field2604;

    @OriginalMember(owner = "oe", name = "ab", descriptor = "[I")
    public int[] field2576;

    @OriginalMember(owner = "oe", name = "fb", descriptor = "[I")
    public int[] field2581;

    @OriginalMember(owner = "oe", name = "Kb", descriptor = "[I")
    private int[] field2612;

    @OriginalMember(owner = "oe", name = "cb", descriptor = "[I")
    public int[] field2578;

    @OriginalMember(owner = "oe", name = "tb", descriptor = "[I")
    public int[] field2595;

    @OriginalMember(owner = "oe", name = "hb", descriptor = "[I")
    public int[] field2583;

    @OriginalMember(owner = "oe", name = "yb", descriptor = "[B")
    public byte[] field2600;

    @OriginalMember(owner = "oe", name = "nb", descriptor = "[B")
    public byte[] field2589;

    @OriginalMember(owner = "oe", name = "Qb", descriptor = "[B")
    public byte[] field2618;

    @OriginalMember(owner = "oe", name = "Nb", descriptor = "[I")
    private int[] field2615;

    @OriginalMember(owner = "oe", name = "ob", descriptor = "[S")
    public short[] field2590;

    @OriginalMember(owner = "oe", name = "ib", descriptor = "[B")
    public byte[] field2584;

    @OriginalMember(owner = "oe", name = "Sb", descriptor = "[S")
    public short[] field2620;

    @OriginalMember(owner = "oe", name = "Tb", descriptor = "[B")
    public byte[] field2621;

    @OriginalMember(owner = "oe", name = "Mb", descriptor = "[S")
    public short[] field2614;

    @OriginalMember(owner = "oe", name = "Rb", descriptor = "[S")
    public short[] field2619;

    @OriginalMember(owner = "oe", name = "gb", descriptor = "[S")
    public short[] field2582;

    @OriginalMember(owner = "oe", name = "Ub", descriptor = "[S")
    private short[] field2622;

    @OriginalMember(owner = "oe", name = "Fb", descriptor = "[S")
    private short[] field2607;

    @OriginalMember(owner = "oe", name = "Lb", descriptor = "[S")
    private short[] field2613;

    @OriginalMember(owner = "oe", name = "db", descriptor = "[B")
    private byte[] field2579;

    @OriginalMember(owner = "oe", name = "Pb", descriptor = "[B")
    private byte[] field2617;

    @OriginalMember(owner = "oe", name = "Eb", descriptor = "[B")
    private byte[] field2606;

    @OriginalMember(owner = "oe", name = "Bb", descriptor = "[B")
    private byte[] field2603;

    @OriginalMember(owner = "oe", name = "Ib", descriptor = "[B")
    private byte[] field2610;

    @OriginalMember(owner = "oe", name = "qb", descriptor = "[[I")
    public int[][] field2592;

    @OriginalMember(owner = "oe", name = "Vb", descriptor = "[[I")
    public int[][] field2623;

    @OriginalMember(owner = "oe", name = "zb", descriptor = "[Lhg;")
    public class76[] field2601;

    @OriginalMember(owner = "oe", name = "vb", descriptor = "[Lca;")
    public class22[] field2597;

    @OriginalMember(owner = "oe", name = "mb", descriptor = "[Lhg;")
    public class76[] field2588;

    @OriginalMember(owner = "oe", name = "Ab", descriptor = "S")
    public short field2602;

    @OriginalMember(owner = "oe", name = "wb", descriptor = "S")
    public short field2598;

    @OriginalMember(owner = "oe", name = "xb", descriptor = "[I")
    private static int[] field2599 = new int[10000];

    @OriginalMember(owner = "oe", name = "Jb", descriptor = "[I")
    private static int[] field2611 = class124.field2387;

    @OriginalMember(owner = "oe", name = "Hb", descriptor = "[I")
    private static int[] field2609 = new int[10000];

    @OriginalMember(owner = "oe", name = "pb", descriptor = "[I")
    private static int[] field2591 = class124.field2383;

    @OriginalMember(owner = "oe", name = "rb", descriptor = "I")
    private static int field2593 = 0;

    @OriginalMember(owner = "oe", name = "eb", descriptor = "S")
    private short field2580;

    @OriginalMember(owner = "oe", name = "jb", descriptor = "S")
    private short field2585;

    @OriginalMember(owner = "oe", name = "kb", descriptor = "S")
    private short field2586;

    @OriginalMember(owner = "oe", name = "ub", descriptor = "S")
    private short field2596;

    @OriginalMember(owner = "oe", name = "Ob", descriptor = "S")
    private short field2616;

    @OriginalMember(owner = "oe", name = "a", descriptor = "()V")
    public static void method954() {
        field2599 = null;
        field2609 = null;
        field2591 = null;
        field2611 = null;
    }

    @OriginalMember(owner = "oe", name = "b", descriptor = "()V")
    public final void method955() {
        for (int var1 = 0; var1 < this.field2608; ++var1) {
            int var2 = this.field2581[var1];
            this.field2581[var1] = this.field2604[var1];
            this.field2604[var1] = -var2;
        }
        this.method973();
    }

    @OriginalMember(owner = "oe", name = "c", descriptor = "()V")
    public final void method956() {
        for (int var1 = 0; var1 < this.field2608; ++var1) {
            this.field2581[var1] = -this.field2581[var1];
        }
        this.method973();
    }

    @OriginalMember(owner = "oe", name = "d", descriptor = "()V")
    public final void method957() {
        for (int var1 = 0; var1 < this.field2608; ++var1) {
            this.field2604[var1] = -this.field2604[var1];
            this.field2581[var1] = -this.field2581[var1];
        }
        this.method973();
    }

    @OriginalMember(owner = "oe", name = "e", descriptor = "()V")
    public final void method958() {
        for (int var1 = 0; var1 < this.field2594; ++var1) {
            int var2 = this.field2578[var1];
            this.field2578[var1] = this.field2583[var1];
            this.field2583[var1] = var2;
        }
        this.method973();
    }

    @OriginalMember(owner = "oe", name = "a", descriptor = "(Loe;Loe;IIIZ)V")
    public static final void method959(class135 arg0, class135 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method977();
        arg0.method975();
        arg1.method977();
        arg1.method975();
        ++field2593;
        int var6 = 0;
        int[] var7 = arg1.field2604;
        int var8 = arg1.field2608;
        for (int var9 = 0; var9 < arg0.field2608; ++var9) {
            class76 var12 = arg0.field2601[var9];
            if (var12.field1456 != 0) {
                int var13 = arg0.field2576[var9] - arg3;
                if (var13 >= arg1.field1945 && var13 <= arg1.field2580) {
                    int var14 = arg0.field2604[var9] - arg2;
                    if (var14 >= arg1.field2586 && var14 <= arg1.field2616) {
                        int var15 = arg0.field2581[var9] - arg4;
                        if (var15 >= arg1.field2585 && var15 <= arg1.field2596) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class76 var17 = arg1.field2601[var16];
                                if (var7[var16] == var14 && arg1.field2581[var16] == var15 && arg1.field2576[var16] == var13 && var17.field1456 != 0) {
                                    if (arg0.field2588 == null) {
                                        arg0.field2588 = new class76[arg0.field2608];
                                    }
                                    if (arg1.field2588 == null) {
                                        arg1.field2588 = new class76[var8];
                                    }
                                    class76 var18 = arg0.field2588[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field2588[var9] = new class76(var12);
                                    }
                                    class76 var19 = arg1.field2588[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field2588[var16] = new class76(var17);
                                    }
                                    var18.field1460 += var17.field1460;
                                    var18.field1458 += var17.field1458;
                                    var18.field1463 += var17.field1463;
                                    var18.field1456 += var17.field1456;
                                    var19.field1460 += var12.field1460;
                                    var19.field1458 += var12.field1458;
                                    var19.field1463 += var12.field1463;
                                    var19.field1456 += var12.field1456;
                                    ++var6;
                                    field2599[var9] = field2593;
                                    field2609[var16] = field2593;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field2594; ++var10) {
                if (field2599[arg0.field2578[var10]] == field2593 && field2599[arg0.field2595[var10]] == field2593 && field2599[arg0.field2583[var10]] == field2593) {
                    if (arg0.field2600 == null) {
                        arg0.field2600 = new byte[arg0.field2594];
                    }
                    arg0.field2600[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field2594; ++var11) {
                if (field2609[arg1.field2578[var11]] == field2593 && field2609[arg1.field2595[var11]] == field2593 && field2609[arg1.field2583[var11]] == field2593) {
                    if (arg1.field2600 == null) {
                        arg1.field2600 = new byte[arg1.field2594];
                    }
                    arg1.field2600[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "oe", name = "f", descriptor = "()Loe;")
    public final class135 method960() {
        class135 var1 = new class135();
        if (this.field2600 != null) {
            var1.field2600 = new byte[this.field2594];
            for (int var2 = 0; var2 < this.field2594; ++var2) {
                var1.field2600[var2] = this.field2600[var2];
            }
        }
        var1.field2608 = this.field2608;
        var1.field2594 = this.field2594;
        var1.field2587 = this.field2587;
        var1.field2604 = this.field2604;
        var1.field2576 = this.field2576;
        var1.field2581 = this.field2581;
        var1.field2578 = this.field2578;
        var1.field2595 = this.field2595;
        var1.field2583 = this.field2583;
        var1.field2589 = this.field2589;
        var1.field2618 = this.field2618;
        var1.field2584 = this.field2584;
        var1.field2620 = this.field2620;
        var1.field2590 = this.field2590;
        var1.field2577 = this.field2577;
        var1.field2621 = this.field2621;
        var1.field2614 = this.field2614;
        var1.field2619 = this.field2619;
        var1.field2582 = this.field2582;
        var1.field2622 = this.field2622;
        var1.field2607 = this.field2607;
        var1.field2613 = this.field2613;
        var1.field2579 = this.field2579;
        var1.field2617 = this.field2617;
        var1.field2606 = this.field2606;
        var1.field2603 = this.field2603;
        var1.field2610 = this.field2610;
        var1.field2612 = this.field2612;
        var1.field2615 = this.field2615;
        var1.field2592 = this.field2592;
        var1.field2623 = this.field2623;
        var1.field2601 = this.field2601;
        var1.field2597 = this.field2597;
        var1.field2602 = this.field2602;
        var1.field2598 = this.field2598;
        return var1;
    }

    @OriginalMember(owner = "oe", name = "a", descriptor = "([[IIIIZI)Loe;")
    public final class135 method961(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method977();
        int var7 = this.field2586 + arg1;
        int var8 = this.field2616 + arg1;
        int var9 = this.field2585 + arg3;
        int var10 = this.field2596 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class135 var15;
                if (arg4) {
                    var15 = new class135();
                    var15.field2608 = this.field2608;
                    var15.field2594 = this.field2594;
                    var15.field2587 = this.field2587;
                    var15.field2604 = this.field2604;
                    var15.field2581 = this.field2581;
                    var15.field2578 = this.field2578;
                    var15.field2595 = this.field2595;
                    var15.field2583 = this.field2583;
                    var15.field2600 = this.field2600;
                    var15.field2589 = this.field2589;
                    var15.field2618 = this.field2618;
                    var15.field2584 = this.field2584;
                    var15.field2620 = this.field2620;
                    var15.field2590 = this.field2590;
                    var15.field2577 = this.field2577;
                    var15.field2621 = this.field2621;
                    var15.field2614 = this.field2614;
                    var15.field2619 = this.field2619;
                    var15.field2582 = this.field2582;
                    var15.field2622 = this.field2622;
                    var15.field2607 = this.field2607;
                    var15.field2613 = this.field2613;
                    var15.field2579 = this.field2579;
                    var15.field2617 = this.field2617;
                    var15.field2606 = this.field2606;
                    var15.field2603 = this.field2603;
                    var15.field2610 = this.field2610;
                    var15.field2612 = this.field2612;
                    var15.field2615 = this.field2615;
                    var15.field2592 = this.field2592;
                    var15.field2623 = this.field2623;
                    var15.field2602 = this.field2602;
                    var15.field2598 = this.field2598;
                    var15.field2576 = new int[var15.field2608];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field2608; ++var16) {
                        int var17 = this.field2604[var16] + arg1;
                        int var18 = this.field2581[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field2576[var16] = this.field2576[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field2608; ++var26) {
                        int var27 = (this.field2576[var26] << 16) / super.field1945;
                        if (var27 < arg5) {
                            int var28 = this.field2604[var26] + arg1;
                            int var29 = this.field2581[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field2576[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2576[var26];
                        } else {
                            var15.field2576[var26] = this.field2576[var26];
                        }
                    }
                }
                var15.method973();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "oe", name = "a", descriptor = "([B)V")
    private final void method962(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class86 var4 = new class86(arg0);
        class86 var5 = new class86(arg0);
        class86 var6 = new class86(arg0);
        class86 var7 = new class86(arg0);
        class86 var8 = new class86(arg0);
        var4.field1773 = arg0.length - 18;
        int var9 = var4.method569(true);
        int var10 = var4.method569(true);
        int var11 = var4.method598((byte) 91);
        int var12 = var4.method598((byte) 120);
        int var13 = var4.method598((byte) 114);
        int var14 = var4.method598((byte) 82);
        int var15 = var4.method598((byte) 98);
        int var16 = var4.method598((byte) 113);
        int var17 = var4.method569(true);
        int var18 = var4.method569(true);
        int var19 = var4.method569(true);
        int var20 = var4.method569(true);
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
        this.field2608 = var9;
        this.field2594 = var10;
        this.field2587 = var11;
        this.field2604 = new int[var9];
        this.field2576 = new int[var9];
        this.field2581 = new int[var9];
        this.field2578 = new int[var10];
        this.field2595 = new int[var10];
        this.field2583 = new int[var10];
        if (var11 > 0) {
            this.field2621 = new byte[var11];
            this.field2614 = new short[var11];
            this.field2619 = new short[var11];
            this.field2582 = new short[var11];
        }
        if (var16 == 1) {
            this.field2612 = new int[var9];
        }
        if (var12 == 1) {
            this.field2600 = new byte[var10];
            this.field2584 = new byte[var10];
            this.field2590 = new short[var10];
        }
        if (var13 == 255) {
            this.field2589 = new byte[var10];
        } else {
            this.field2577 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2618 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2615 = new int[var10];
        }
        this.field2620 = new short[var10];
        var4.field1773 = var21;
        var5.field1773 = var36;
        var6.field1773 = var38;
        var7.field1773 = var40;
        var8.field1773 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method598((byte) 126);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method550(128);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method550(128);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method550(128);
            }
            this.field2604[var46] = var43 + var63;
            this.field2576[var46] = var44 + var64;
            this.field2581[var46] = var45 + var65;
            var43 = this.field2604[var46];
            var44 = this.field2576[var46];
            var45 = this.field2581[var46];
            if (var16 == 1) {
                this.field2612[var46] = var8.method598((byte) 74);
            }
        }
        var4.field1773 = var32;
        var5.field1773 = var28;
        var6.field1773 = var26;
        var7.field1773 = var30;
        var8.field1773 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field2620[var47] = (short) var4.method569(true);
            if (var12 == 1) {
                int var61 = var5.method598((byte) 115);
                if ((var61 & 1) == 1) {
                    this.field2600[var47] = 1;
                    var2 = true;
                } else {
                    this.field2600[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field2584[var47] = (byte) (var61 >> 2);
                    this.field2590[var47] = this.field2620[var47];
                    this.field2620[var47] = 127;
                    if (this.field2590[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2584[var47] = -1;
                    this.field2590[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2589[var47] = var6.method584(3);
            }
            if (var14 == 1) {
                this.field2618[var47] = var7.method584(3);
            }
            if (var15 == 1) {
                this.field2615[var47] = var8.method598((byte) 80);
            }
        }
        var4.field1773 = var25;
        var5.field1773 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method598((byte) 127);
            if (var57 == 1) {
                var48 = var4.method550(128) + var51;
                var49 = var4.method550(128) + var48;
                var50 = var4.method550(128) + var49;
                var51 = var50;
                this.field2578[var52] = var48;
                this.field2595[var52] = var49;
                this.field2583[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method550(128) + var51;
                var51 = var50;
                this.field2578[var52] = var48;
                this.field2595[var52] = var49;
                this.field2583[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method550(128) + var51;
                var51 = var50;
                this.field2578[var52] = var48;
                this.field2595[var52] = var49;
                this.field2583[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method550(128) + var51;
                var51 = var50;
                this.field2578[var52] = var48;
                this.field2595[var52] = var60;
                this.field2583[var52] = var50;
            }
        }
        var4.field1773 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field2621[var53] = 0;
            this.field2614[var53] = (short) var4.method569(true);
            this.field2619[var53] = (short) var4.method569(true);
            this.field2582[var53] = (short) var4.method569(true);
        }
        if (this.field2584 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field2584[var55] & 255;
                if (var56 != 255) {
                    if ((this.field2614[var56] & 65535) == this.field2578[var55] && (this.field2619[var56] & 65535) == this.field2595[var55] && (this.field2582[var56] & 65535) == this.field2583[var55]) {
                        this.field2584[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2584 = null;
            }
        }
        if (!var3) {
            this.field2590 = null;
        }
        if (!var2) {
            this.field2600 = null;
        }
    }

    @OriginalMember(owner = "oe", name = "a", descriptor = "(Loe;I)I")
    private final int method963(class135 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2604[arg1];
        int var5 = arg0.field2576[arg1];
        int var6 = arg0.field2581[arg1];
        for (int var7 = 0; var7 < this.field2608; ++var7) {
            if (this.field2604[var7] == var4 && this.field2576[var7] == var5 && this.field2581[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2604[this.field2608] = var4;
            this.field2576[this.field2608] = var5;
            this.field2581[this.field2608] = var6;
            if (arg0.field2612 != null) {
                this.field2612[this.field2608] = arg0.field2612[arg1];
            }
            var3 = this.field2608++;
        }
        return var3;
    }

    @OriginalMember(owner = "oe", name = "g", descriptor = "()V")
    public final void method964() {
        for (int var1 = 0; var1 < this.field2608; ++var1) {
            int var2 = this.field2604[var1];
            this.field2604[var1] = this.field2581[var1];
            this.field2581[var1] = -var2;
        }
        this.method973();
    }

    @OriginalMember(owner = "oe", name = "a", descriptor = "(SS)V")
    public final void method965(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2594; ++var3) {
            if (this.field2620[var3] == arg0) {
                this.field2620[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "oe", name = "b", descriptor = "(IIIII)Lgf;")
    public final class66 method966(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class66(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "oe", name = "a", descriptor = "(IIIIIZZ)Lue;")
    public final class189 method967(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        return new class66(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "oe", name = "c", descriptor = "(I)V")
    public final void method968(int arg0) {
        int var2 = field2591[arg0];
        int var3 = field2611[arg0];
        for (int var4 = 0; var4 < this.field2608; ++var4) {
            int var5 = this.field2604[var4] * var3 + this.field2581[var4] * var2 >> 16;
            this.field2581[var4] = this.field2581[var4] * var3 - this.field2604[var4] * var2 >> 16;
            this.field2604[var4] = var5;
        }
        this.method973();
    }

    @OriginalMember(owner = "oe", name = "a", descriptor = "(Lbg;II)Loe;")
    public static final class135 method969(class18 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method147(0, arg2, arg1);
        return var3 == null ? null : new class135(var3);
    }

    @OriginalMember(owner = "oe", name = "h", descriptor = "()V")
    public final void method970() {
        int var10002;
        if (this.field2612 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2608; ++var3) {
                int var7 = this.field2612[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2592 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field2592[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2608) {
                int var6 = this.field2612[var5];
                this.field2592[var6][var1[var6]++] = var5++;
            }
            this.field2612 = null;
        }
        if (this.field2615 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field2594; ++var10) {
                int var14 = this.field2615[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field2623 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field2623[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field2594) {
                int var13 = this.field2615[var12];
                this.field2623[var13][var8[var13]++] = var12++;
            }
            this.field2615 = null;
        }
    }

    @OriginalMember(owner = "oe", name = "a", descriptor = "(III)V")
    public final void method971(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2608; ++var4) {
            this.field2604[var4] = this.field2604[var4] * arg0 / 128;
            this.field2576[var4] = this.field2576[var4] * arg1 / 128;
            this.field2581[var4] = this.field2581[var4] * arg2 / 128;
        }
        this.method973();
    }

    @OriginalMember(owner = "oe", name = "b", descriptor = "([B)V")
    private final void method972(byte[] arg0) {
        class86 var2 = new class86(arg0);
        class86 var3 = new class86(arg0);
        class86 var4 = new class86(arg0);
        class86 var5 = new class86(arg0);
        class86 var6 = new class86(arg0);
        class86 var7 = new class86(arg0);
        class86 var8 = new class86(arg0);
        var2.field1773 = arg0.length - 23;
        int var9 = var2.method569(true);
        int var10 = var2.method569(true);
        int var11 = var2.method598((byte) 116);
        int var12 = var2.method598((byte) 118);
        int var13 = var2.method598((byte) 110);
        int var14 = var2.method598((byte) 84);
        int var15 = var2.method598((byte) 103);
        int var16 = var2.method598((byte) 73);
        int var17 = var2.method598((byte) 87);
        int var18 = var2.method569(true);
        int var19 = var2.method569(true);
        int var20 = var2.method569(true);
        int var21 = var2.method569(true);
        int var22 = var2.method569(true);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2621 = new byte[var11];
            var2.field1773 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field2621[var26] = var2.method584(3);
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
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field2608 = var9;
        this.field2594 = var10;
        this.field2587 = var11;
        this.field2604 = new int[var9];
        this.field2576 = new int[var9];
        this.field2581 = new int[var9];
        this.field2578 = new int[var10];
        this.field2595 = new int[var10];
        this.field2583 = new int[var10];
        if (var17 == 1) {
            this.field2612 = new int[var9];
        }
        if (var12 == 1) {
            this.field2600 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2589 = new byte[var10];
        } else {
            this.field2577 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2618 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2615 = new int[var10];
        }
        if (var16 == 1) {
            this.field2590 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2584 = new byte[var10];
        }
        this.field2620 = new short[var10];
        if (var11 > 0) {
            this.field2614 = new short[var11];
            this.field2619 = new short[var11];
            this.field2582 = new short[var11];
            if (var24 > 0) {
                this.field2622 = new short[var24];
                this.field2607 = new short[var24];
                this.field2613 = new short[var24];
                this.field2579 = new byte[var24];
                this.field2617 = new byte[var24];
                this.field2606 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2603 = new byte[var25];
                this.field2610 = new byte[var25];
            }
        }
        var2.field1773 = var11;
        var3.field1773 = var44;
        var4.field1773 = var46;
        var5.field1773 = var48;
        var6.field1773 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method598((byte) 113);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method550(128);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method550(128);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method550(128);
            }
            this.field2604[var67] = var64 + var82;
            this.field2576[var67] = var65 + var83;
            this.field2581[var67] = var66 + var84;
            var64 = this.field2604[var67];
            var65 = this.field2576[var67];
            var66 = this.field2581[var67];
            if (var17 == 1) {
                this.field2612[var67] = var6.method598((byte) 74);
            }
        }
        var2.field1773 = var42;
        var3.field1773 = var31;
        var4.field1773 = var34;
        var5.field1773 = var37;
        var6.field1773 = var35;
        var7.field1773 = var40;
        var8.field1773 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field2620[var68] = (short) var2.method569(true);
            if (var12 == 1) {
                this.field2600[var68] = var3.method584(3);
            }
            if (var13 == 255) {
                this.field2589[var68] = var4.method584(3);
            }
            if (var14 == 1) {
                this.field2618[var68] = var5.method584(3);
            }
            if (var15 == 1) {
                this.field2615[var68] = var6.method598((byte) 127);
            }
            if (var16 == 1) {
                this.field2590[var68] = (short) (var7.method569(true) - 1);
            }
            if (this.field2584 != null) {
                if (this.field2590[var68] != -1) {
                    this.field2584[var68] = (byte) (var8.method598((byte) 106) - 1);
                } else {
                    this.field2584[var68] = -1;
                }
            }
        }
        var2.field1773 = var33;
        var3.field1773 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method598((byte) 122);
            if (var77 == 1) {
                var69 = var2.method550(128) + var72;
                var70 = var2.method550(128) + var69;
                var71 = var2.method550(128) + var70;
                var72 = var71;
                this.field2578[var73] = var69;
                this.field2595[var73] = var70;
                this.field2583[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method550(128) + var72;
                var72 = var71;
                this.field2578[var73] = var69;
                this.field2595[var73] = var70;
                this.field2583[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method550(128) + var72;
                var72 = var71;
                this.field2578[var73] = var69;
                this.field2595[var73] = var70;
                this.field2583[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method550(128) + var72;
                var72 = var71;
                this.field2578[var73] = var69;
                this.field2595[var73] = var80;
                this.field2583[var73] = var71;
            }
        }
        var2.field1773 = var50;
        var3.field1773 = var52;
        var4.field1773 = var54;
        var5.field1773 = var56;
        var6.field1773 = var58;
        var7.field1773 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field2621[var74] & 255;
            if (var76 == 0) {
                this.field2614[var74] = (short) var2.method569(true);
                this.field2619[var74] = (short) var2.method569(true);
                this.field2582[var74] = (short) var2.method569(true);
            }
            if (var76 == 1) {
                this.field2614[var74] = (short) var3.method569(true);
                this.field2619[var74] = (short) var3.method569(true);
                this.field2582[var74] = (short) var3.method569(true);
                this.field2622[var74] = (short) var4.method569(true);
                this.field2607[var74] = (short) var4.method569(true);
                this.field2613[var74] = (short) var4.method569(true);
                this.field2579[var74] = var5.method584(3);
                this.field2617[var74] = var6.method584(3);
                this.field2606[var74] = var7.method584(3);
            }
            if (var76 == 2) {
                this.field2614[var74] = (short) var3.method569(true);
                this.field2619[var74] = (short) var3.method569(true);
                this.field2582[var74] = (short) var3.method569(true);
                this.field2622[var74] = (short) var4.method569(true);
                this.field2607[var74] = (short) var4.method569(true);
                this.field2613[var74] = (short) var4.method569(true);
                this.field2579[var74] = var5.method584(3);
                this.field2617[var74] = var6.method584(3);
                this.field2606[var74] = var7.method584(3);
                this.field2603[var74] = var7.method584(3);
                this.field2610[var74] = var7.method584(3);
            }
            if (var76 == 3) {
                this.field2614[var74] = (short) var3.method569(true);
                this.field2619[var74] = (short) var3.method569(true);
                this.field2582[var74] = (short) var3.method569(true);
                this.field2622[var74] = (short) var4.method569(true);
                this.field2607[var74] = (short) var4.method569(true);
                this.field2613[var74] = (short) var4.method569(true);
                this.field2579[var74] = var5.method584(3);
                this.field2617[var74] = var6.method584(3);
                this.field2606[var74] = var7.method584(3);
            }
        }
        var2.field1773 = var62;
        int var75 = var2.method598((byte) 80);
        if (var75 != 0) {
            new class42();
            var2.method569(true);
            var2.method569(true);
            var2.method569(true);
            var2.method582(15);
        }
    }

    @OriginalMember(owner = "oe", name = "i", descriptor = "()V")
    private final void method973() {
        this.field2601 = null;
        this.field2588 = null;
        this.field2597 = null;
        this.field2605 = false;
    }

    @OriginalMember(owner = "oe", name = "b", descriptor = "(SS)V")
    public final void method974(short arg0, short arg1) {
        if (this.field2590 != null) {
            for (int var3 = 0; var3 < this.field2594; ++var3) {
                if (this.field2590[var3] == arg0) {
                    this.field2590[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "oe", name = "j", descriptor = "()V")
    public final void method975() {
        if (this.field2601 == null) {
            this.field2601 = new class76[this.field2608];
            for (int var1 = 0; var1 < this.field2608; ++var1) {
                this.field2601[var1] = new class76();
            }
            for (int var2 = 0; var2 < this.field2594; ++var2) {
                int var3 = this.field2578[var2];
                int var4 = this.field2595[var2];
                int var5 = this.field2583[var2];
                int var6 = this.field2604[var4] - this.field2604[var3];
                int var7 = this.field2576[var4] - this.field2576[var3];
                int var8 = this.field2581[var4] - this.field2581[var3];
                int var9 = this.field2604[var5] - this.field2604[var3];
                int var10 = this.field2576[var5] - this.field2576[var3];
                int var11 = this.field2581[var5] - this.field2581[var3];
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
                if (this.field2600 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field2600[var2];
                }
                if (var19 == 0) {
                    class76 var20 = this.field2601[var3];
                    var20.field1460 += var16;
                    var20.field1458 += var17;
                    var20.field1463 += var18;
                    ++var20.field1456;
                    class76 var21 = this.field2601[var4];
                    var21.field1460 += var16;
                    var21.field1458 += var17;
                    var21.field1463 += var18;
                    ++var21.field1456;
                    class76 var22 = this.field2601[var5];
                    var22.field1460 += var16;
                    var22.field1458 += var17;
                    var22.field1463 += var18;
                    ++var22.field1456;
                } else if (var19 == 1) {
                    if (this.field2597 == null) {
                        this.field2597 = new class22[this.field2594];
                    }
                    class22 var23 = this.field2597[var2] = new class22();
                    var23.field503 = var16;
                    var23.field498 = var17;
                    var23.field497 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "oe", name = "b", descriptor = "(III)V")
    public final void method976(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2608; ++var4) {
            this.field2604[var4] += arg0;
            this.field2576[var4] += arg1;
            this.field2581[var4] += arg2;
        }
        this.method973();
    }

    @OriginalMember(owner = "oe", name = "k", descriptor = "()V")
    private final void method977() {
        if (!this.field2605) {
            this.field2605 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            for (int var7 = 0; var7 < this.field2608; ++var7) {
                int var8 = this.field2604[var7];
                int var9 = this.field2576[var7];
                int var10 = this.field2581[var7];
                if (var8 < var1) {
                    var1 = var8;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var9 < var2) {
                    var2 = var9;
                }
                if (var9 > var5) {
                    var5 = var9;
                }
                if (var10 < var3) {
                    var3 = var10;
                }
                if (var10 > var6) {
                    var6 = var10;
                }
            }
            this.field2586 = (short) var1;
            this.field2616 = (short) var4;
            super.field1945 = (short) var2;
            this.field2580 = (short) var5;
            this.field2585 = (short) var3;
            this.field2596 = (short) var6;
        }
    }

    @OriginalMember(owner = "oe", name = "<init>", descriptor = "()V")
    private class135() {
    }

    @OriginalMember(owner = "oe", name = "<init>", descriptor = "([B)V")
    private class135(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method972(arg0);
        } else {
            this.method962(arg0);
        }
    }

    @OriginalMember(owner = "oe", name = "<init>", descriptor = "([Loe;I)V")
    public class135(class135[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2608 = 0;
        this.field2594 = 0;
        this.field2587 = 0;
        this.field2577 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class135 var15 = arg0[var9];
            if (var15 != null) {
                this.field2608 += var15.field2608;
                this.field2594 += var15.field2594;
                this.field2587 += var15.field2587;
                if (var15.field2589 != null) {
                    var4 = true;
                } else {
                    if (this.field2577 == -1) {
                        this.field2577 = var15.field2577;
                    }
                    if (this.field2577 != var15.field2577) {
                        var4 = true;
                    }
                }
                var3 |= var15.field2600 != null;
                var5 |= var15.field2618 != null;
                var6 |= var15.field2615 != null;
                var7 |= var15.field2590 != null;
                var8 |= var15.field2584 != null;
            }
        }
        this.field2604 = new int[this.field2608];
        this.field2576 = new int[this.field2608];
        this.field2581 = new int[this.field2608];
        this.field2612 = new int[this.field2608];
        this.field2578 = new int[this.field2594];
        this.field2595 = new int[this.field2594];
        this.field2583 = new int[this.field2594];
        if (var3) {
            this.field2600 = new byte[this.field2594];
        }
        if (var4) {
            this.field2589 = new byte[this.field2594];
        }
        if (var5) {
            this.field2618 = new byte[this.field2594];
        }
        if (var6) {
            this.field2615 = new int[this.field2594];
        }
        if (var7) {
            this.field2590 = new short[this.field2594];
        }
        if (var8) {
            this.field2584 = new byte[this.field2594];
        }
        this.field2620 = new short[this.field2594];
        if (this.field2587 > 0) {
            this.field2621 = new byte[this.field2587];
            this.field2614 = new short[this.field2587];
            this.field2619 = new short[this.field2587];
            this.field2582 = new short[this.field2587];
            this.field2622 = new short[this.field2587];
            this.field2607 = new short[this.field2587];
            this.field2613 = new short[this.field2587];
            this.field2579 = new byte[this.field2587];
            this.field2617 = new byte[this.field2587];
            this.field2606 = new byte[this.field2587];
            this.field2603 = new byte[this.field2587];
            this.field2610 = new byte[this.field2587];
        }
        this.field2608 = 0;
        this.field2594 = 0;
        this.field2587 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class135 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2594; ++var12) {
                    if (var3 && var11.field2600 != null) {
                        this.field2600[this.field2594] = var11.field2600[var12];
                    }
                    if (var4) {
                        if (var11.field2589 != null) {
                            this.field2589[this.field2594] = var11.field2589[var12];
                        } else {
                            this.field2589[this.field2594] = var11.field2577;
                        }
                    }
                    if (var5 && var11.field2618 != null) {
                        this.field2618[this.field2594] = var11.field2618[var12];
                    }
                    if (var6 && var11.field2615 != null) {
                        this.field2615[this.field2594] = var11.field2615[var12];
                    }
                    if (var7) {
                        if (var11.field2590 != null) {
                            this.field2590[this.field2594] = var11.field2590[var12];
                        } else {
                            this.field2590[this.field2594] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field2584 != null && var11.field2584[var12] != -1) {
                            this.field2584[this.field2594] = (byte) (var11.field2584[var12] + this.field2587);
                        } else {
                            this.field2584[this.field2594] = -1;
                        }
                    }
                    this.field2620[this.field2594] = var11.field2620[var12];
                    this.field2578[this.field2594] = this.method963(var11, var11.field2578[var12]);
                    this.field2595[this.field2594] = this.method963(var11, var11.field2595[var12]);
                    this.field2583[this.field2594] = this.method963(var11, var11.field2583[var12]);
                    ++this.field2594;
                }
                for (int var13 = 0; var13 < var11.field2587; ++var13) {
                    byte var14 = this.field2621[this.field2587] = var11.field2621[var13];
                    if (var14 == 0) {
                        this.field2614[this.field2587] = (short) this.method963(var11, var11.field2614[var13]);
                        this.field2619[this.field2587] = (short) this.method963(var11, var11.field2619[var13]);
                        this.field2582[this.field2587] = (short) this.method963(var11, var11.field2582[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2614[this.field2587] = var11.field2614[var13];
                        this.field2619[this.field2587] = var11.field2619[var13];
                        this.field2582[this.field2587] = var11.field2582[var13];
                        this.field2622[this.field2587] = var11.field2622[var13];
                        this.field2607[this.field2587] = var11.field2607[var13];
                        this.field2613[this.field2587] = var11.field2613[var13];
                        this.field2579[this.field2587] = var11.field2579[var13];
                        this.field2617[this.field2587] = var11.field2617[var13];
                        this.field2606[this.field2587] = var11.field2606[var13];
                    }
                    if (var14 == 2) {
                        this.field2603[this.field2587] = var11.field2603[var13];
                        this.field2610[this.field2587] = var11.field2610[var13];
                    }
                    ++this.field2587;
                }
            }
        }
    }

    @OriginalMember(owner = "oe", name = "<init>", descriptor = "(Loe;ZZZZ)V")
    public class135(class135 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2608 = arg0.field2608;
        this.field2594 = arg0.field2594;
        this.field2587 = arg0.field2587;
        if (arg1) {
            this.field2604 = arg0.field2604;
            this.field2576 = arg0.field2576;
            this.field2581 = arg0.field2581;
        } else {
            this.field2604 = new int[this.field2608];
            this.field2576 = new int[this.field2608];
            this.field2581 = new int[this.field2608];
            for (int var6 = 0; var6 < this.field2608; ++var6) {
                this.field2604[var6] = arg0.field2604[var6];
                this.field2576[var6] = arg0.field2576[var6];
                this.field2581[var6] = arg0.field2581[var6];
            }
        }
        if (arg2) {
            this.field2620 = arg0.field2620;
        } else {
            this.field2620 = new short[this.field2594];
            for (int var7 = 0; var7 < this.field2594; ++var7) {
                this.field2620[var7] = arg0.field2620[var7];
            }
        }
        if (!arg3 && arg0.field2590 != null) {
            this.field2590 = new short[this.field2594];
            for (int var8 = 0; var8 < this.field2594; ++var8) {
                this.field2590[var8] = arg0.field2590[var8];
            }
        } else {
            this.field2590 = arg0.field2590;
        }
        if (arg4) {
            this.field2618 = arg0.field2618;
        } else {
            this.field2618 = new byte[this.field2594];
            if (arg0.field2618 == null) {
                for (int var9 = 0; var9 < this.field2594; ++var9) {
                    this.field2618[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2594; ++var10) {
                    this.field2618[var10] = arg0.field2618[var10];
                }
            }
        }
        this.field2578 = arg0.field2578;
        this.field2595 = arg0.field2595;
        this.field2583 = arg0.field2583;
        this.field2600 = arg0.field2600;
        this.field2589 = arg0.field2589;
        this.field2584 = arg0.field2584;
        this.field2577 = arg0.field2577;
        this.field2621 = arg0.field2621;
        this.field2614 = arg0.field2614;
        this.field2619 = arg0.field2619;
        this.field2582 = arg0.field2582;
        this.field2622 = arg0.field2622;
        this.field2607 = arg0.field2607;
        this.field2613 = arg0.field2613;
        this.field2579 = arg0.field2579;
        this.field2617 = arg0.field2617;
        this.field2606 = arg0.field2606;
        this.field2603 = arg0.field2603;
        this.field2610 = arg0.field2610;
        this.field2612 = arg0.field2612;
        this.field2615 = arg0.field2615;
        this.field2592 = arg0.field2592;
        this.field2623 = arg0.field2623;
        this.field2601 = arg0.field2601;
        this.field2597 = arg0.field2597;
        this.field2588 = arg0.field2588;
        this.field2602 = arg0.field2602;
        this.field2598 = arg0.field2598;
    }
}
