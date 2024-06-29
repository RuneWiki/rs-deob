import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class128 extends class20 {

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public int field2483 = 0;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "B")
    public byte field2481 = 0;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public int field2500 = 0;

    @OriginalMember(owner = "client!mg", name = "nb", descriptor = "Z")
    private boolean field2528 = false;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "[I")
    public int[] field2490;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "[I")
    public int[] field2511;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "[I")
    public int[] field2495;

    @OriginalMember(owner = "client!mg", name = "kb", descriptor = "[I")
    private int[] field2525;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "[I")
    public int[] field2498;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "[I")
    public int[] field2491;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "[I")
    public int[] field2496;

    @OriginalMember(owner = "client!mg", name = "cb", descriptor = "[B")
    public byte[] field2517;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "[B")
    public byte[] field2506;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "[B")
    public byte[] field2502;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "[S")
    public short[] field2484;

    @OriginalMember(owner = "client!mg", name = "mb", descriptor = "[S")
    public short[] field2527;

    @OriginalMember(owner = "client!mg", name = "gb", descriptor = "[B")
    public byte[] field2521;

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "[I")
    private int[] field2513;

    @OriginalMember(owner = "client!mg", name = "bb", descriptor = "[B")
    public byte[] field2516;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "[S")
    public short[] field2493;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "[S")
    public short[] field2485;

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "[S")
    public short[] field2515;

    @OriginalMember(owner = "client!mg", name = "hb", descriptor = "[S")
    private short[] field2522;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "[S")
    private short[] field2492;

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "[S")
    private short[] field2514;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "[B")
    private byte[] field2501;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "[B")
    private byte[] field2510;

    @OriginalMember(owner = "client!mg", name = "lb", descriptor = "[B")
    private byte[] field2526;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "[B")
    private byte[] field2505;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "[B")
    private byte[] field2508;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    public int field2489;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "[[I")
    public int[][] field2503;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "[[I")
    public int[][] field2486;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "[Lng;")
    public class132[] field2512;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "[Lq;")
    public class78[] field2497;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "[Lng;")
    public class132[] field2487;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "S")
    public short field2482;

    @OriginalMember(owner = "client!mg", name = "ib", descriptor = "S")
    public short field2523;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "[I")
    private static int[] field2488 = class213.field3846;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    private static int field2507 = 0;

    @OriginalMember(owner = "client!mg", name = "db", descriptor = "[I")
    private static int[] field2518 = new int[10000];

    @OriginalMember(owner = "client!mg", name = "jb", descriptor = "[I")
    private static int[] field2524 = class213.field3849;

    @OriginalMember(owner = "client!mg", name = "ob", descriptor = "[I")
    private static int[] field2529 = new int[10000];

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "S")
    private short field2494;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "S")
    private short field2499;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "S")
    private short field2504;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "S")
    private short field2509;

    @OriginalMember(owner = "client!mg", name = "eb", descriptor = "S")
    private short field2519;

    @OriginalMember(owner = "client!mg", name = "fb", descriptor = "S")
    private short field2520;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lni;IIIZ)V")
    public final void method196(class20 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class128 var6 = (class128) arg0;
        var6.method975();
        var6.method967();
        field2507++;
        int var7 = 0;
        int[] var8 = var6.field2490;
        int var9 = var6.field2500;
        for (int var10 = 0; var10 < this.field2500; var10++) {
            class132 var13 = this.field2512[var10];
            if (var13.field2606 != 0) {
                int var14 = this.field2511[var10] - arg2;
                if (var14 >= var6.field2499 && var14 <= var6.field2520) {
                    int var15 = this.field2490[var10] - arg1;
                    if (var15 >= var6.field2519 && var15 <= var6.field2494) {
                        int var16 = this.field2495[var10] - arg3;
                        if (var16 >= var6.field2509 && var16 <= var6.field2504) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class132 var18 = var6.field2512[var17];
                                if (var8[var17] == var15 && var6.field2495[var17] == var16 && var6.field2511[var17] == var14 && var18.field2606 != 0) {
                                    if (this.field2487 == null) {
                                        this.field2487 = new class132[this.field2500];
                                    }
                                    if (var6.field2487 == null) {
                                        var6.field2487 = new class132[var9];
                                    }
                                    class132 var19 = this.field2487[var10];
                                    if (var19 == null) {
                                        var19 = this.field2487[var10] = new class132(var13);
                                    }
                                    class132 var20 = var6.field2487[var17];
                                    if (var20 == null) {
                                        var20 = var6.field2487[var17] = new class132(var18);
                                    }
                                    var19.field2595 += var18.field2595;
                                    var19.field2592 += var18.field2592;
                                    var19.field2599 += var18.field2599;
                                    var19.field2606 += var18.field2606;
                                    var20.field2595 += var13.field2595;
                                    var20.field2592 += var13.field2592;
                                    var20.field2599 += var13.field2599;
                                    var20.field2606 += var13.field2606;
                                    var7++;
                                    field2529[var10] = field2507;
                                    field2518[var17] = field2507;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field2483; var11++) {
            if (field2529[this.field2498[var11]] == field2507 && field2529[this.field2491[var11]] == field2507 && field2529[this.field2496[var11]] == field2507) {
                if (this.field2517 == null) {
                    this.field2517 = new byte[this.field2483];
                }
                this.field2517[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field2483; var12++) {
            if (field2518[var6.field2498[var12]] == field2507 && field2518[var6.field2491[var12]] == field2507 && field2518[var6.field2496[var12]] == field2507) {
                if (var6.field2517 == null) {
                    var6.field2517 = new byte[var6.field2483];
                }
                var6.field2517[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    private final void method951(int arg0) {
        int var2 = field2524[arg0];
        int var3 = field2488[arg0];
        for (int var4 = 0; var4 < this.field2500; var4++) {
            int var5 = this.field2511[var4] * var2 + this.field2490[var4] * var3 >> 16;
            this.field2511[var4] = this.field2511[var4] * var3 - this.field2490[var4] * var2 >> 16;
            this.field2490[var4] = var5;
        }
        this.method974();
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "()V")
    public static void method952() {
        field2529 = null;
        field2518 = null;
        field2524 = null;
        field2488 = null;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(III)V")
    public final void method953(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2500; var4++) {
            this.field2490[var4] = this.field2490[var4] * arg0 / 128;
            this.field2511[var4] = this.field2511[var4] * arg1 / 128;
            this.field2495[var4] = this.field2495[var4] * arg2 / 128;
        }
        this.method974();
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([B)V")
    private final void method954(byte[] arg0) {
        class8 var2 = new class8(arg0);
        class8 var3 = new class8(arg0);
        class8 var4 = new class8(arg0);
        class8 var5 = new class8(arg0);
        class8 var6 = new class8(arg0);
        class8 var7 = new class8(arg0);
        class8 var8 = new class8(arg0);
        var2.field146 = arg0.length - 23;
        int var9 = var2.method65((byte) 121);
        int var10 = var2.method65((byte) 120);
        int var11 = var2.method63((byte) 91);
        int var12 = var2.method63((byte) 121);
        int var13 = var2.method63((byte) 75);
        int var14 = var2.method63((byte) 96);
        int var15 = var2.method63((byte) 119);
        int var16 = var2.method63((byte) 99);
        int var17 = var2.method63((byte) 62);
        int var18 = var2.method65((byte) 119);
        int var19 = var2.method65((byte) 118);
        int var20 = var2.method65((byte) 124);
        int var21 = var2.method65((byte) 110);
        int var22 = var2.method65((byte) 107);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2516 = new byte[var11];
            var2.field146 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2516[var26] = var2.method98(1);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
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
        this.field2500 = var9;
        this.field2483 = var10;
        this.field2489 = var11;
        this.field2490 = new int[var9];
        this.field2511 = new int[var9];
        this.field2495 = new int[var9];
        this.field2498 = new int[var10];
        this.field2491 = new int[var10];
        this.field2496 = new int[var10];
        if (var17 == 1) {
            this.field2525 = new int[var9];
        }
        if (var12 == 1) {
            this.field2517 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2506 = new byte[var10];
        } else {
            this.field2481 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2502 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2513 = new int[var10];
        }
        if (var16 == 1) {
            this.field2527 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2521 = new byte[var10];
        }
        this.field2484 = new short[var10];
        if (var11 > 0) {
            this.field2493 = new short[var11];
            this.field2485 = new short[var11];
            this.field2515 = new short[var11];
            if (var24 > 0) {
                this.field2522 = new short[var24];
                this.field2492 = new short[var24];
                this.field2514 = new short[var24];
                this.field2501 = new byte[var24];
                this.field2510 = new byte[var24];
                this.field2526 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2505 = new byte[var25];
                this.field2508 = new byte[var25];
            }
        }
        var2.field146 = var11;
        var3.field146 = var44;
        var4.field146 = var46;
        var5.field146 = var48;
        var6.field146 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method63((byte) 58);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method82(128);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method82(128);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method82(128);
            }
            this.field2490[var66] = var63 + var80;
            this.field2511[var66] = var64 + var81;
            this.field2495[var66] = var65 + var82;
            var63 = this.field2490[var66];
            var64 = this.field2511[var66];
            var65 = this.field2495[var66];
            if (var17 == 1) {
                this.field2525[var66] = var6.method63((byte) 62);
            }
        }
        var2.field146 = var42;
        var3.field146 = var31;
        var4.field146 = var34;
        var5.field146 = var37;
        var6.field146 = var35;
        var7.field146 = var40;
        var8.field146 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field2484[var67] = (short) var2.method65((byte) 116);
            if (var12 == 1) {
                this.field2517[var67] = var3.method98(1);
            }
            if (var13 == 255) {
                this.field2506[var67] = var4.method98(1);
            }
            if (var14 == 1) {
                this.field2502[var67] = var5.method98(1);
            }
            if (var15 == 1) {
                this.field2513[var67] = var6.method63((byte) 107);
            }
            if (var16 == 1) {
                this.field2527[var67] = (short) (var7.method65((byte) 115) - 1);
            }
            if (this.field2521 != null) {
                if (this.field2527[var67] == -1) {
                    this.field2521[var67] = -1;
                } else {
                    this.field2521[var67] = (byte) (var8.method63((byte) 48) - 1);
                }
            }
        }
        var2.field146 = var33;
        var3.field146 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method63((byte) 55);
            if (var75 == 1) {
                var68 = var2.method82(128) + var71;
                var69 = var2.method82(128) + var68;
                var70 = var2.method82(128) + var69;
                var71 = var70;
                this.field2498[var72] = var68;
                this.field2491[var72] = var69;
                this.field2496[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method82(128) + var71;
                var71 = var70;
                this.field2498[var72] = var68;
                this.field2491[var72] = var69;
                this.field2496[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method82(128) + var71;
                var71 = var70;
                this.field2498[var72] = var68;
                this.field2491[var72] = var69;
                this.field2496[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method82(128) + var71;
                var71 = var70;
                this.field2498[var72] = var68;
                this.field2491[var72] = var78;
                this.field2496[var72] = var70;
            }
        }
        var2.field146 = var50;
        var3.field146 = var52;
        var4.field146 = var54;
        var5.field146 = var56;
        var6.field146 = var58;
        var7.field146 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field2516[var73] & 0xFF;
            if (var74 == 0) {
                this.field2493[var73] = (short) var2.method65((byte) 125);
                this.field2485[var73] = (short) var2.method65((byte) 110);
                this.field2515[var73] = (short) var2.method65((byte) 120);
            }
            if (var74 == 1) {
                this.field2493[var73] = (short) var3.method65((byte) 107);
                this.field2485[var73] = (short) var3.method65((byte) 116);
                this.field2515[var73] = (short) var3.method65((byte) 108);
                this.field2522[var73] = (short) var4.method65((byte) 124);
                this.field2492[var73] = (short) var4.method65((byte) 108);
                this.field2514[var73] = (short) var4.method65((byte) 112);
                this.field2501[var73] = var5.method98(1);
                this.field2510[var73] = var6.method98(1);
                this.field2526[var73] = var7.method98(1);
            }
            if (var74 == 2) {
                this.field2493[var73] = (short) var3.method65((byte) 126);
                this.field2485[var73] = (short) var3.method65((byte) 118);
                this.field2515[var73] = (short) var3.method65((byte) 115);
                this.field2522[var73] = (short) var4.method65((byte) 113);
                this.field2492[var73] = (short) var4.method65((byte) 125);
                this.field2514[var73] = (short) var4.method65((byte) 117);
                this.field2501[var73] = var5.method98(1);
                this.field2510[var73] = var6.method98(1);
                this.field2526[var73] = var7.method98(1);
                this.field2505[var73] = var7.method98(1);
                this.field2508[var73] = var7.method98(1);
            }
            if (var74 == 3) {
                this.field2493[var73] = (short) var3.method65((byte) 110);
                this.field2485[var73] = (short) var3.method65((byte) 114);
                this.field2515[var73] = (short) var3.method65((byte) 119);
                this.field2522[var73] = (short) var4.method65((byte) 119);
                this.field2492[var73] = (short) var4.method65((byte) 110);
                this.field2514[var73] = (short) var4.method65((byte) 115);
                this.field2501[var73] = var5.method98(1);
                this.field2510[var73] = var6.method98(1);
                this.field2526[var73] = var7.method98(1);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
    private final void method955(int arg0) {
        int var2 = field2524[arg0];
        int var3 = field2488[arg0];
        for (int var4 = 0; var4 < this.field2500; var4++) {
            int var5 = this.field2511[var4] * var3 - this.field2495[var4] * var2 >> 16;
            this.field2495[var4] = this.field2511[var4] * var2 + this.field2495[var4] * var3 >> 16;
            this.field2511[var4] = var5;
        }
        this.method974();
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "()V")
    public final void method956() {
        for (int var1 = 0; var1 < this.field2500; var1++) {
            this.field2490[var1] = -this.field2490[var1];
            this.field2495[var1] = -this.field2495[var1];
        }
        this.method974();
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "()Lmg;")
    public final class128 method957() {
        class128 var1 = new class128();
        if (this.field2517 != null) {
            var1.field2517 = new byte[this.field2483];
            for (int var2 = 0; var2 < this.field2483; var2++) {
                var1.field2517[var2] = this.field2517[var2];
            }
        }
        var1.field2500 = this.field2500;
        var1.field2483 = this.field2483;
        var1.field2489 = this.field2489;
        var1.field2490 = this.field2490;
        var1.field2511 = this.field2511;
        var1.field2495 = this.field2495;
        var1.field2498 = this.field2498;
        var1.field2491 = this.field2491;
        var1.field2496 = this.field2496;
        var1.field2506 = this.field2506;
        var1.field2502 = this.field2502;
        var1.field2521 = this.field2521;
        var1.field2484 = this.field2484;
        var1.field2527 = this.field2527;
        var1.field2481 = this.field2481;
        var1.field2516 = this.field2516;
        var1.field2493 = this.field2493;
        var1.field2485 = this.field2485;
        var1.field2515 = this.field2515;
        var1.field2522 = this.field2522;
        var1.field2492 = this.field2492;
        var1.field2514 = this.field2514;
        var1.field2501 = this.field2501;
        var1.field2510 = this.field2510;
        var1.field2526 = this.field2526;
        var1.field2505 = this.field2505;
        var1.field2508 = this.field2508;
        var1.field2525 = this.field2525;
        var1.field2513 = this.field2513;
        var1.field2503 = this.field2503;
        var1.field2486 = this.field2486;
        var1.field2512 = this.field2512;
        var1.field2497 = this.field2497;
        var1.field2482 = this.field2482;
        var1.field2523 = this.field2523;
        return var1;
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "()V")
    public final void method958() {
        int var10002;
        if (this.field2525 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2500; var3++) {
                int var7 = this.field2525[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2503 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field2503[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2500) {
                int var6 = this.field2525[var5];
                this.field2503[var6][var1[var6]++] = var5++;
            }
            this.field2525 = null;
        }
        if (this.field2513 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2483; var10++) {
            int var14 = this.field2513[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field2486 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field2486[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field2483) {
            int var13 = this.field2513[var12];
            this.field2486[var13][var8[var13]++] = var12++;
        }
        this.field2513 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II[[I[[IIIIZZ)Lmg;")
    public final class128 method959(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method975();
        int var10 = this.field2519 + arg4;
        int var11 = this.field2494 + arg4;
        int var12 = this.field2509 + arg6;
        int var13 = this.field2504 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class128 var18;
        if (arg7) {
            var18 = new class128();
            var18.field2500 = this.field2500;
            var18.field2483 = this.field2483;
            var18.field2489 = this.field2489;
            var18.field2498 = this.field2498;
            var18.field2491 = this.field2491;
            var18.field2496 = this.field2496;
            var18.field2517 = this.field2517;
            var18.field2506 = this.field2506;
            var18.field2502 = this.field2502;
            var18.field2521 = this.field2521;
            var18.field2484 = this.field2484;
            var18.field2527 = this.field2527;
            var18.field2481 = this.field2481;
            var18.field2516 = this.field2516;
            var18.field2493 = this.field2493;
            var18.field2485 = this.field2485;
            var18.field2515 = this.field2515;
            var18.field2522 = this.field2522;
            var18.field2492 = this.field2492;
            var18.field2514 = this.field2514;
            var18.field2501 = this.field2501;
            var18.field2510 = this.field2510;
            var18.field2526 = this.field2526;
            var18.field2505 = this.field2505;
            var18.field2508 = this.field2508;
            var18.field2525 = this.field2525;
            var18.field2513 = this.field2513;
            var18.field2503 = this.field2503;
            var18.field2486 = this.field2486;
            var18.field2482 = this.field2482;
            var18.field2523 = this.field2523;
            var18.field2512 = this.field2512;
            var18.field2497 = this.field2497;
            var18.field2487 = this.field2487;
            if (arg0 == 3) {
                var18.field2490 = class71.method661((byte) 126, this.field2490);
                var18.field2511 = class71.method661((byte) -44, this.field2511);
                var18.field2495 = class71.method661((byte) 112, this.field2495);
            } else {
                var18.field2490 = this.field2490;
                var18.field2511 = new int[var18.field2500];
                var18.field2495 = this.field2495;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field2500; var19++) {
                int var20 = this.field2490[var19] + arg4;
                int var21 = this.field2495[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field2511[var19] = this.field2511[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field2500; var29++) {
                int var30 = (this.field2511[var29] << 16) / this.field2499;
                if (var30 < arg1) {
                    int var31 = this.field2490[var29] + arg4;
                    int var32 = this.field2495[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field2511[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field2511[var29];
                } else {
                    var18.field2511[var29] = this.field2511[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method964(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field2520 - this.field2499;
            for (int var43 = 0; var43 < this.field2500; var43++) {
                int var44 = this.field2490[var43] + arg4;
                int var45 = this.field2495[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field2511[var43] = var52 + this.field2511[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field2520 - this.field2499;
            for (int var54 = 0; var54 < this.field2500; var54++) {
                int var55 = this.field2490[var54] + arg4;
                int var56 = this.field2495[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field2511[var54] = ((this.field2511[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method974();
        } else {
            this.field2528 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(III)V")
    public final void method960(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2500; var4++) {
            this.field2490[var4] += arg0;
            this.field2511[var4] += arg1;
            this.field2495[var4] += arg2;
        }
        this.method974();
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(SS)V")
    public final void method961(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2483; var3++) {
            if (this.field2484[var3] == arg0) {
                this.field2484[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([[III)I")
    private static final int method962(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "()V")
    public final void method963() {
        for (int var1 = 0; var1 < this.field2500; var1++) {
            int var2 = this.field2495[var1];
            this.field2495[var1] = this.field2490[var1];
            this.field2490[var1] = -var2;
        }
        this.method974();
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([[IIIIII)V")
    private final void method964(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method962(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method962(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method962(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method962(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method955(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method951(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method960(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(IIIII)Lfi;")
    public final class217 method965(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class214(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(SS)V")
    public final void method966(short arg0, short arg1) {
        if (this.field2527 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2483; var3++) {
            if (this.field2527[var3] == arg0) {
                this.field2527[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "()V")
    public final void method967() {
        if (this.field2512 != null) {
            return;
        }
        this.field2512 = new class132[this.field2500];
        for (int var1 = 0; var1 < this.field2500; var1++) {
            this.field2512[var1] = new class132();
        }
        for (int var2 = 0; var2 < this.field2483; var2++) {
            int var3 = this.field2498[var2];
            int var4 = this.field2491[var2];
            int var5 = this.field2496[var2];
            int var6 = this.field2490[var4] - this.field2490[var3];
            int var7 = this.field2511[var4] - this.field2511[var3];
            int var8 = this.field2495[var4] - this.field2495[var3];
            int var9 = this.field2490[var5] - this.field2490[var3];
            int var10 = this.field2511[var5] - this.field2511[var3];
            int var11 = this.field2495[var5] - this.field2495[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field2517 == null) {
                var19 = 0;
            } else {
                var19 = this.field2517[var2];
            }
            if (var19 == 0) {
                class132 var20 = this.field2512[var3];
                var20.field2595 += var16;
                var20.field2592 += var17;
                var20.field2599 += var18;
                var20.field2606++;
                class132 var21 = this.field2512[var4];
                var21.field2595 += var16;
                var21.field2592 += var17;
                var21.field2599 += var18;
                var21.field2606++;
                class132 var22 = this.field2512[var5];
                var22.field2595 += var16;
                var22.field2592 += var17;
                var22.field2599 += var18;
                var22.field2606++;
            } else if (var19 == 1) {
                if (this.field2497 == null) {
                    this.field2497 = new class78[this.field2483];
                }
                class78 var23 = this.field2497[var2] = new class78();
                var23.field1700 = var16;
                var23.field1691 = var17;
                var23.field1699 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()Z")
    public final boolean method192() {
        return true;
    }

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "()V")
    public final void method968() {
        for (int var1 = 0; var1 < this.field2500; var1++) {
            int var2 = this.field2490[var1];
            this.field2490[var1] = this.field2495[var1];
            this.field2495[var1] = -var2;
        }
        this.method974();
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lmc;II)Lmg;")
    public static final class128 method969(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1115(arg2, (byte) -76, arg1);
        return var3 == null ? null : new class128(var3);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lmg;I)I")
    private final int method970(class128 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2490[arg1];
        int var5 = arg0.field2511[arg1];
        int var6 = arg0.field2495[arg1];
        for (int var7 = 0; var7 < this.field2500; var7++) {
            if (this.field2490[var7] == var4 && this.field2511[var7] == var5 && this.field2495[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2490[this.field2500] = var4;
            this.field2511[this.field2500] = var5;
            this.field2495[this.field2500] = var6;
            if (arg0.field2525 != null) {
                this.field2525[this.field2500] = arg0.field2525[arg1];
            }
            var3 = this.field2500++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(III)I")
    public final int method971(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2500; var4++) {
            if (this.field2490[var4] == arg0 && this.field2511[var4] == arg1 && this.field2495[var4] == arg2) {
                return var4;
            }
        }
        this.field2490[this.field2500] = arg0;
        this.field2511[this.field2500] = arg1;
        this.field2495[this.field2500] = arg2;
        return this.field2500++;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "()I")
    public final int method22() {
        if (!this.field2528) {
            this.method975();
        }
        return this.field2499;
    }

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "()V")
    public final void method972() {
        for (int var1 = 0; var1 < this.field2500; var1++) {
            this.field2495[var1] = -this.field2495[var1];
        }
        for (int var2 = 0; var2 < this.field2483; var2++) {
            int var3 = this.field2498[var2];
            this.field2498[var2] = this.field2496[var2];
            this.field2496[var2] = var3;
        }
        this.method974();
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIBSB)I")
    public final int method973(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field2498[this.field2483] = arg0;
        this.field2491[this.field2483] = arg1;
        this.field2496[this.field2483] = arg2;
        this.field2517[this.field2483] = arg3;
        this.field2521[this.field2483] = -1;
        this.field2484[this.field2483] = arg4;
        this.field2527[this.field2483] = -1;
        this.field2502[this.field2483] = arg5;
        return this.field2483++;
    }

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "()V")
    private final void method974() {
        this.field2512 = null;
        this.field2487 = null;
        this.field2497 = null;
        this.field2528 = false;
    }

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "()V")
    private final void method975() {
        if (this.field2528) {
            return;
        }
        this.field2528 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2500; var7++) {
            int var8 = this.field2490[var7];
            int var9 = this.field2511[var7];
            int var10 = this.field2495[var7];
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
        this.field2519 = (short) var1;
        this.field2494 = (short) var4;
        this.field2499 = (short) var2;
        this.field2520 = (short) var5;
        this.field2509 = (short) var3;
        this.field2504 = (short) var6;
    }

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "()V")
    public final void method976() {
        this.field2525 = null;
        this.field2513 = null;
        this.field2503 = null;
        this.field2486 = null;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "([B)V")
    private final void method977(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class8 var4 = new class8(arg0);
        class8 var5 = new class8(arg0);
        class8 var6 = new class8(arg0);
        class8 var7 = new class8(arg0);
        class8 var8 = new class8(arg0);
        var4.field146 = arg0.length - 18;
        int var9 = var4.method65((byte) 124);
        int var10 = var4.method65((byte) 124);
        int var11 = var4.method63((byte) 53);
        int var12 = var4.method63((byte) 72);
        int var13 = var4.method63((byte) 74);
        int var14 = var4.method63((byte) 53);
        int var15 = var4.method63((byte) 106);
        int var16 = var4.method63((byte) 83);
        int var17 = var4.method65((byte) 116);
        int var18 = var4.method65((byte) 108);
        int var19 = var4.method65((byte) 114);
        int var20 = var4.method65((byte) 115);
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
        this.field2500 = var9;
        this.field2483 = var10;
        this.field2489 = var11;
        this.field2490 = new int[var9];
        this.field2511 = new int[var9];
        this.field2495 = new int[var9];
        this.field2498 = new int[var10];
        this.field2491 = new int[var10];
        this.field2496 = new int[var10];
        if (var11 > 0) {
            this.field2516 = new byte[var11];
            this.field2493 = new short[var11];
            this.field2485 = new short[var11];
            this.field2515 = new short[var11];
        }
        if (var16 == 1) {
            this.field2525 = new int[var9];
        }
        if (var12 == 1) {
            this.field2517 = new byte[var10];
            this.field2521 = new byte[var10];
            this.field2527 = new short[var10];
        }
        if (var13 == 255) {
            this.field2506 = new byte[var10];
        } else {
            this.field2481 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2502 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2513 = new int[var10];
        }
        this.field2484 = new short[var10];
        var4.field146 = var21;
        var5.field146 = var36;
        var6.field146 = var38;
        var7.field146 = var40;
        var8.field146 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method63((byte) 105);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method82(128);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method82(128);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method82(128);
            }
            this.field2490[var46] = var43 + var63;
            this.field2511[var46] = var44 + var64;
            this.field2495[var46] = var45 + var65;
            var43 = this.field2490[var46];
            var44 = this.field2511[var46];
            var45 = this.field2495[var46];
            if (var16 == 1) {
                this.field2525[var46] = var8.method63((byte) 105);
            }
        }
        var4.field146 = var32;
        var5.field146 = var28;
        var6.field146 = var26;
        var7.field146 = var30;
        var8.field146 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field2484[var47] = (short) var4.method65((byte) 127);
            if (var12 == 1) {
                int var61 = var5.method63((byte) 70);
                if ((var61 & 0x1) == 1) {
                    this.field2517[var47] = 1;
                    var2 = true;
                } else {
                    this.field2517[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field2521[var47] = (byte) (var61 >> 2);
                    this.field2527[var47] = this.field2484[var47];
                    this.field2484[var47] = 127;
                    if (this.field2527[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2521[var47] = -1;
                    this.field2527[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2506[var47] = var6.method98(1);
            }
            if (var14 == 1) {
                this.field2502[var47] = var7.method98(1);
            }
            if (var15 == 1) {
                this.field2513[var47] = var8.method63((byte) 118);
            }
        }
        var4.field146 = var25;
        var5.field146 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method63((byte) 54);
            if (var57 == 1) {
                var48 = var4.method82(128) + var51;
                var49 = var4.method82(128) + var48;
                var50 = var4.method82(128) + var49;
                var51 = var50;
                this.field2498[var52] = var48;
                this.field2491[var52] = var49;
                this.field2496[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method82(128) + var51;
                var51 = var50;
                this.field2498[var52] = var48;
                this.field2491[var52] = var49;
                this.field2496[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method82(128) + var51;
                var51 = var50;
                this.field2498[var52] = var48;
                this.field2491[var52] = var49;
                this.field2496[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method82(128) + var51;
                var51 = var50;
                this.field2498[var52] = var48;
                this.field2491[var52] = var60;
                this.field2496[var52] = var50;
            }
        }
        var4.field146 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field2516[var53] = 0;
            this.field2493[var53] = (short) var4.method65((byte) 121);
            this.field2485[var53] = (short) var4.method65((byte) 117);
            this.field2515[var53] = (short) var4.method65((byte) 110);
        }
        if (this.field2521 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field2521[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field2493[var56] & 0xFFFF) == this.field2498[var55] && (this.field2485[var56] & 0xFFFF) == this.field2491[var55] && (this.field2515[var56] & 0xFFFF) == this.field2496[var55]) {
                        this.field2521[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2521 = null;
            }
        }
        if (!var3) {
            this.field2527 = null;
        }
        if (!var2) {
            this.field2517 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(IIIII)Lik;")
    public final class214 method978(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class214(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(III)V")
    public final void method979(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field2524[arg2];
            int var5 = field2488[arg2];
            for (int var6 = 0; var6 < this.field2500; var6++) {
                int var7 = this.field2511[var6] * var4 + this.field2490[var6] * var5 >> 16;
                this.field2511[var6] = this.field2511[var6] * var5 - this.field2490[var6] * var4 >> 16;
                this.field2490[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field2524[arg0];
            int var9 = field2488[arg0];
            for (int var10 = 0; var10 < this.field2500; var10++) {
                int var11 = this.field2511[var10] * var9 - this.field2495[var10] * var8 >> 16;
                this.field2495[var10] = this.field2511[var10] * var8 + this.field2495[var10] * var9 >> 16;
                this.field2511[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field2524[arg1];
        int var13 = field2488[arg1];
        for (int var14 = 0; var14 < this.field2500; var14++) {
            int var15 = this.field2495[var14] * var12 + this.field2490[var14] * var13 >> 16;
            this.field2495[var14] = this.field2495[var14] * var13 - this.field2490[var14] * var12 >> 16;
            this.field2490[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
    public final void method980(int arg0) {
        int var2 = field2524[arg0];
        int var3 = field2488[arg0];
        for (int var4 = 0; var4 < this.field2500; var4++) {
            int var5 = this.field2495[var4] * var2 + this.field2490[var4] * var3 >> 16;
            this.field2495[var4] = this.field2495[var4] * var3 - this.field2490[var4] * var2 >> 16;
            this.field2490[var4] = var5;
        }
        this.method974();
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    private class128() {
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)Lni;")
    public final class20 method193(int arg0, int arg1, int arg2) {
        return this.method965(this.field2482, this.field2523, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "([B)V")
    private class128(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method954(arg0);
        } else {
            this.method977(arg0);
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(III)V")
    public class128(int arg0, int arg1, int arg2) {
        this.field2490 = new int[arg0];
        this.field2511 = new int[arg0];
        this.field2495 = new int[arg0];
        this.field2525 = new int[arg0];
        this.field2498 = new int[arg1];
        this.field2491 = new int[arg1];
        this.field2496 = new int[arg1];
        this.field2517 = new byte[arg1];
        this.field2506 = new byte[arg1];
        this.field2502 = new byte[arg1];
        this.field2484 = new short[arg1];
        this.field2527 = new short[arg1];
        this.field2521 = new byte[arg1];
        this.field2513 = new int[arg1];
        if (arg2 > 0) {
            this.field2516 = new byte[arg2];
            this.field2493 = new short[arg2];
            this.field2485 = new short[arg2];
            this.field2515 = new short[arg2];
            this.field2522 = new short[arg2];
            this.field2492 = new short[arg2];
            this.field2514 = new short[arg2];
            this.field2501 = new byte[arg2];
            this.field2510 = new byte[arg2];
            this.field2526 = new byte[arg2];
            this.field2505 = new byte[arg2];
            this.field2508 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "([Lmg;I)V")
    public class128(class128[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2500 = 0;
        this.field2483 = 0;
        this.field2489 = 0;
        this.field2481 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class128 var15 = arg0[var9];
            if (var15 != null) {
                this.field2500 += var15.field2500;
                this.field2483 += var15.field2483;
                this.field2489 += var15.field2489;
                if (var15.field2506 == null) {
                    if (this.field2481 == -1) {
                        this.field2481 = var15.field2481;
                    }
                    if (this.field2481 != var15.field2481) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field2517 != null;
                var5 |= var15.field2502 != null;
                var6 |= var15.field2513 != null;
                var7 |= var15.field2527 != null;
                var8 |= var15.field2521 != null;
            }
        }
        this.field2490 = new int[this.field2500];
        this.field2511 = new int[this.field2500];
        this.field2495 = new int[this.field2500];
        this.field2525 = new int[this.field2500];
        this.field2498 = new int[this.field2483];
        this.field2491 = new int[this.field2483];
        this.field2496 = new int[this.field2483];
        if (var3) {
            this.field2517 = new byte[this.field2483];
        }
        if (var4) {
            this.field2506 = new byte[this.field2483];
        }
        if (var5) {
            this.field2502 = new byte[this.field2483];
        }
        if (var6) {
            this.field2513 = new int[this.field2483];
        }
        if (var7) {
            this.field2527 = new short[this.field2483];
        }
        if (var8) {
            this.field2521 = new byte[this.field2483];
        }
        this.field2484 = new short[this.field2483];
        if (this.field2489 > 0) {
            this.field2516 = new byte[this.field2489];
            this.field2493 = new short[this.field2489];
            this.field2485 = new short[this.field2489];
            this.field2515 = new short[this.field2489];
            this.field2522 = new short[this.field2489];
            this.field2492 = new short[this.field2489];
            this.field2514 = new short[this.field2489];
            this.field2501 = new byte[this.field2489];
            this.field2510 = new byte[this.field2489];
            this.field2526 = new byte[this.field2489];
            this.field2505 = new byte[this.field2489];
            this.field2508 = new byte[this.field2489];
        }
        this.field2500 = 0;
        this.field2483 = 0;
        this.field2489 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class128 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2483; var12++) {
                    if (var3 && var11.field2517 != null) {
                        this.field2517[this.field2483] = var11.field2517[var12];
                    }
                    if (var4) {
                        if (var11.field2506 == null) {
                            this.field2506[this.field2483] = var11.field2481;
                        } else {
                            this.field2506[this.field2483] = var11.field2506[var12];
                        }
                    }
                    if (var5 && var11.field2502 != null) {
                        this.field2502[this.field2483] = var11.field2502[var12];
                    }
                    if (var6 && var11.field2513 != null) {
                        this.field2513[this.field2483] = var11.field2513[var12];
                    }
                    if (var7) {
                        if (var11.field2527 == null) {
                            this.field2527[this.field2483] = -1;
                        } else {
                            this.field2527[this.field2483] = var11.field2527[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field2521 == null || var11.field2521[var12] == -1) {
                            this.field2521[this.field2483] = -1;
                        } else {
                            this.field2521[this.field2483] = (byte) (var11.field2521[var12] + this.field2489);
                        }
                    }
                    this.field2484[this.field2483] = var11.field2484[var12];
                    this.field2498[this.field2483] = this.method970(var11, var11.field2498[var12]);
                    this.field2491[this.field2483] = this.method970(var11, var11.field2491[var12]);
                    this.field2496[this.field2483] = this.method970(var11, var11.field2496[var12]);
                    this.field2483++;
                }
                for (int var13 = 0; var13 < var11.field2489; var13++) {
                    byte var14 = this.field2516[this.field2489] = var11.field2516[var13];
                    if (var14 == 0) {
                        this.field2493[this.field2489] = (short) this.method970(var11, var11.field2493[var13]);
                        this.field2485[this.field2489] = (short) this.method970(var11, var11.field2485[var13]);
                        this.field2515[this.field2489] = (short) this.method970(var11, var11.field2515[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2493[this.field2489] = var11.field2493[var13];
                        this.field2485[this.field2489] = var11.field2485[var13];
                        this.field2515[this.field2489] = var11.field2515[var13];
                        this.field2522[this.field2489] = var11.field2522[var13];
                        this.field2492[this.field2489] = var11.field2492[var13];
                        this.field2514[this.field2489] = var11.field2514[var13];
                        this.field2501[this.field2489] = var11.field2501[var13];
                        this.field2510[this.field2489] = var11.field2510[var13];
                        this.field2526[this.field2489] = var11.field2526[var13];
                    }
                    if (var14 == 2) {
                        this.field2505[this.field2489] = var11.field2505[var13];
                        this.field2508[this.field2489] = var11.field2508[var13];
                    }
                    this.field2489++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lmg;ZZZZ)V")
    public class128(class128 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2500 = arg0.field2500;
        this.field2483 = arg0.field2483;
        this.field2489 = arg0.field2489;
        if (arg1) {
            this.field2490 = arg0.field2490;
            this.field2511 = arg0.field2511;
            this.field2495 = arg0.field2495;
        } else {
            this.field2490 = new int[this.field2500];
            this.field2511 = new int[this.field2500];
            this.field2495 = new int[this.field2500];
            for (int var6 = 0; var6 < this.field2500; var6++) {
                this.field2490[var6] = arg0.field2490[var6];
                this.field2511[var6] = arg0.field2511[var6];
                this.field2495[var6] = arg0.field2495[var6];
            }
        }
        if (arg2) {
            this.field2484 = arg0.field2484;
        } else {
            this.field2484 = new short[this.field2483];
            for (int var7 = 0; var7 < this.field2483; var7++) {
                this.field2484[var7] = arg0.field2484[var7];
            }
        }
        if (arg3 || arg0.field2527 == null) {
            this.field2527 = arg0.field2527;
        } else {
            this.field2527 = new short[this.field2483];
            for (int var8 = 0; var8 < this.field2483; var8++) {
                this.field2527[var8] = arg0.field2527[var8];
            }
        }
        if (arg4) {
            this.field2502 = arg0.field2502;
        } else {
            this.field2502 = new byte[this.field2483];
            if (arg0.field2502 == null) {
                for (int var9 = 0; var9 < this.field2483; var9++) {
                    this.field2502[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2483; var10++) {
                    this.field2502[var10] = arg0.field2502[var10];
                }
            }
        }
        this.field2498 = arg0.field2498;
        this.field2491 = arg0.field2491;
        this.field2496 = arg0.field2496;
        this.field2517 = arg0.field2517;
        this.field2506 = arg0.field2506;
        this.field2521 = arg0.field2521;
        this.field2481 = arg0.field2481;
        this.field2516 = arg0.field2516;
        this.field2493 = arg0.field2493;
        this.field2485 = arg0.field2485;
        this.field2515 = arg0.field2515;
        this.field2522 = arg0.field2522;
        this.field2492 = arg0.field2492;
        this.field2514 = arg0.field2514;
        this.field2501 = arg0.field2501;
        this.field2510 = arg0.field2510;
        this.field2526 = arg0.field2526;
        this.field2505 = arg0.field2505;
        this.field2508 = arg0.field2508;
        this.field2525 = arg0.field2525;
        this.field2513 = arg0.field2513;
        this.field2503 = arg0.field2503;
        this.field2486 = arg0.field2486;
        this.field2512 = arg0.field2512;
        this.field2497 = arg0.field2497;
        this.field2487 = arg0.field2487;
        this.field2482 = arg0.field2482;
        this.field2523 = arg0.field2523;
    }
}
