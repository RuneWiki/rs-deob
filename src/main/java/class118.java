import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class118 {

    @OriginalMember(owner = "client!r", name = "s", descriptor = "J")
    private long field2611 = -1L;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    private int field2621 = 0;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "J")
    private long field2618 = -1L;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "Loa;")
    private class98 field2614;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "J")
    private long field2599;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "J")
    private long field2609;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "[B")
    private byte[] field2616;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "[B")
    private byte[] field2593;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "J")
    private long field2607;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Lpe;")
    public static class109 field2597 = class141.method1120("rect_debug=", 0);

    @OriginalMember(owner = "client!r", name = "u", descriptor = "Lpe;")
    public static class109 field2613 = class141.method1120("leuchten2:", 0);

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Lpe;")
    public static class109 field2606 = class141.method1120("Einloggen", 0);

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field2617 = 0;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "Lpe;")
    public static class109 field2622 = class141.method1120("RuneScape wird geladen )2 bitte warten)3)3)3", 0);

    @OriginalMember(owner = "client!r", name = "F", descriptor = "[I")
    public static int[] field2624 = new int[99];

    @OriginalMember(owner = "client!r", name = "H", descriptor = "[I")
    public static int[] field2626;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "Lpe;")
    public static class109 field2625;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    private int field2610;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "J")
    private long field2604;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "[I")
    public static int[] field2627;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    private final void method957(int arg0) throws IOException {
        if (arg0 != 17810) {
            method964(11, 85, null, 106, 122, 60, -44, 93, 86);
        }
        if (this.field2611 != -1L) {
            long var2 = -1L;
            if (this.field2611 != this.field2604) {
                this.field2614.method794(this.field2611, 0);
                this.field2604 = this.field2611;
            }
            this.field2614.method792(this.field2621, this.field2593, 0, true);
            this.field2604 += this.field2621;
            if (this.field2604 > this.field2599) {
                this.field2599 = this.field2604;
            }
            long var4 = -1L;
            if (this.field2611 + (long) this.field2621 > this.field2618 && this.field2618 + (long) this.field2610 >= (long) this.field2621 + this.field2611) {
                var4 = (long) this.field2621 + this.field2611;
            } else if (this.field2618 + (long) this.field2610 > this.field2611 && (long) this.field2610 + this.field2618 <= this.field2611 - -((long) this.field2621)) {
                var4 = this.field2618 + (long) this.field2610;
            }
            if (this.field2611 >= this.field2618 && (long) this.field2610 + this.field2618 > this.field2611) {
                var2 = this.field2611;
            } else if (this.field2611 <= this.field2618 && (long) this.field2621 + this.field2611 > this.field2618) {
                var2 = this.field2618;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class26.method237(this.field2593, (int) (var2 - this.field2611), this.field2616, (int) (var2 - this.field2618), var6);
            }
            this.field2611 = -1L;
            this.field2621 = 0;
        }
        field2598++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)V")
    public static final void method958(boolean arg0, int arg1) {
        field2600++;
        if (class153.field3373 == arg1) {
            return;
        }
        if (class153.field3373 == 0) {
            class63.method500((byte) 54);
        }
        if (arg0) {
            field2624 = null;
        }
        if (arg1 == 20 || arg1 == 40) {
            class1.field21 = 0;
            class154.field3516 = 0;
            class14.field374 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class149.field3312 != null) {
            class149.field3312.method83((byte) -114);
            class149.field3312 = null;
        }
        if (class153.field3373 == 25) {
            class91.field1967 = 0;
            class122.field2690 = 0;
            class55.field1125 = 1;
            class136.field2958 = 0;
            class148.field3238 = 1;
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class93.method772(class19.field481, class137.field2980, 0, class18.field453);
        } else {
            class158.method1231((byte) -93);
        }
        class153.field3373 = arg1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static final void method959(byte arg0) {
        field2608++;
        if (arg0 >= -79) {
            method958(false, 123);
        }
        class114.field2508.method92((byte) 106);
        class91.field1911.method92((byte) 102);
        class45.field949.method92((byte) 114);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public final void method960(byte arg0) throws IOException {
        if (arg0 != 9) {
            method959((byte) -75);
        }
        field2619++;
        this.method957(17810);
        this.field2614.method791(-24709);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(JI)V")
    public final void method961(long arg0, int arg1) throws IOException {
        field2605++;
        int var4 = -18 / ((-arg1 - 82) / 34);
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method966(-20196));
        }
        this.field2607 = arg0;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    private final void method962(int arg0) throws IOException {
        field2612++;
        if (arg0 != -13555) {
            this.method966(122);
        }
        this.field2610 = 0;
        if (this.field2607 != this.field2604) {
            this.field2614.method794(this.field2607, arg0 ^ 0xFFFFCB0D);
            this.field2604 = this.field2607;
        }
        this.field2618 = this.field2607;
        while (this.field2610 < this.field2616.length) {
            int var2 = this.field2614.method793(23, this.field2616.length - this.field2610, this.field2616, this.field2610);
            if (var2 == -1) {
                break;
            }
            this.field2604 += var2;
            this.field2610 += var2;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III[B)V")
    public final void method963(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2594++;
        try {
            if (arg1 != 15251) {
                this.field2614 = null;
            }
            if (this.field2609 < (long) arg2 + this.field2607) {
                this.field2609 = (long) arg2 + this.field2607;
            }
            if (this.field2611 != -1L && (this.field2607 < this.field2611 || this.field2607 > (long) this.field2621 + this.field2611)) {
                this.method957(17810);
            }
            if (this.field2611 != -1L && this.field2611 + (long) this.field2593.length < (long) arg2 + this.field2607) {
                int var5 = (int) (this.field2611 + (long) this.field2593.length - this.field2607);
                class26.method237(arg3, arg0, this.field2593, (int) (this.field2607 - this.field2611), var5);
                this.field2607 += var5;
                arg2 -= var5;
                this.field2621 = this.field2593.length;
                this.method957(17810);
                arg0 += var5;
            }
            if (this.field2593.length < arg2) {
                if (this.field2607 != this.field2604) {
                    this.field2614.method794(this.field2607, arg1 ^ 0x3B93);
                    this.field2604 = this.field2607;
                }
                long var6 = -1L;
                this.field2614.method792(arg2, arg3, arg0, true);
                this.field2604 += arg2;
                long var8 = -1L;
                if (this.field2618 <= this.field2607 && this.field2607 < (long) this.field2610 + this.field2618) {
                    var8 = this.field2607;
                } else if (this.field2607 <= this.field2618 && (long) arg2 + this.field2607 > this.field2618) {
                    var8 = this.field2618;
                }
                if (this.field2618 < (long) arg2 + this.field2607 && (long) arg2 + this.field2607 <= (long) this.field2610 + this.field2618) {
                    var6 = (long) arg2 + this.field2607;
                } else if ((long) this.field2610 + this.field2618 > this.field2607 && (long) arg2 + this.field2607 >= (long) this.field2610 + this.field2618) {
                    var6 = (long) this.field2610 + this.field2618;
                }
                if (this.field2599 < this.field2604) {
                    this.field2599 = this.field2604;
                }
                if (var8 > -1L && var8 < var6) {
                    int var10 = (int) (var6 - var8);
                    class26.method237(arg3, (int) ((long) arg0 + var8 - this.field2607), this.field2616, (int) (var8 - this.field2618), var10);
                }
                this.field2607 += arg2;
            } else if (arg2 > 0) {
                if (this.field2611 == -1L) {
                    this.field2611 = this.field2607;
                }
                class26.method237(arg3, arg0, this.field2593, (int) (this.field2607 - this.field2611), arg2);
                this.field2607 += arg2;
                if (this.field2607 - this.field2611 > (long) this.field2621) {
                    this.field2621 = (int) (this.field2607 - this.field2611);
                }
            }
        } catch (IOException var12) {
            this.field2604 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[Lwa;IIIIII)V")
    public static final void method964(int arg0, int arg1, class154[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2602++;
        if (arg0 != 30) {
            method969(null, null, true, false);
        }
        for (int var9 = 0; var9 < arg2.length; var9++) {
            class154 var10 = arg2[var9];
            if (var10 != null && (!var10.field3473 || var10.field3476 == 0 || var10.field3465 || class136.method1084(0, var10) != 0 || class100.field2100 == var10) && var10.field3458 == arg5 && (!var10.field3473 || !class153.method1179((byte) -62, var10))) {
                int var11 = var10.field3390 + arg1;
                int var12 = var10.field3384 + arg3;
                if (class66.field1334 == var10) {
                    class23.field540 = var12;
                    class113.field2482 = true;
                    class20.field507 = var11;
                }
                int var13;
                int var14;
                int var15;
                int var16;
                if (var10.field3476 == 2) {
                    var13 = arg8;
                    var14 = arg6;
                    var15 = arg4;
                    var16 = arg7;
                } else if (var10.field3476 == 9) {
                    int var17 = var12;
                    int var18 = var11;
                    int var19 = var11 + var10.field3382;
                    int var20 = var10.field3427 + var12;
                    if (var20 < var12) {
                        var17 = var20;
                        var20 = var12;
                    }
                    var20++;
                    var13 = var17 > arg8 ? var17 : arg8;
                    if (var19 < var11) {
                        var18 = var19;
                        var19 = var11;
                    }
                    var15 = arg4 < var18 ? var18 : arg4;
                    var14 = arg6 <= var20 ? arg6 : var20;
                    var19++;
                    var16 = arg7 > var19 ? var19 : arg7;
                } else {
                    var15 = arg4 < var11 ? var11 : arg4;
                    int var23 = var10.field3427 + var12;
                    var14 = var23 < arg6 ? var23 : arg6;
                    var13 = var12 <= arg8 ? arg8 : var12;
                    int var24 = var11 + var10.field3382;
                    var16 = arg7 > var24 ? var24 : arg7;
                }
                if (!var10.field3473 || var13 < var14 && var15 < var16) {
                    if (var10.field3459 == 1337) {
                        class138.method1092(0, var10);
                    } else if (var10.field3459 == 1338) {
                        class55.method443(var11, var12, 105);
                    } else {
                        if (var10.field3476 == 0) {
                            if (!var10.field3473 && class153.method1179((byte) -100, var10) && class4.field81 != var10) {
                                continue;
                            }
                            method964(arg0, var11 - var10.field3417, arg2, var12 - var10.field3481, var15, var10.field3514, var14, var16, var13);
                            if (var10.field3520 != null) {
                                method964(30, var11 - var10.field3417, var10.field3520, var12 - var10.field3481, var15, var10.field3514, var14, var16, var13);
                            }
                            class79 var25 = (class79) class134.field2916.method505((byte) -46, (long) var10.field3514);
                            if (var25 != null) {
                                class91.method747(var11, var16, var25.field1655, -1, var12, var13, var14, var15);
                            }
                        }
                        if (var10.field3473) {
                            boolean var26;
                            if (var13 <= class82.field1754 && var15 <= class48.field992 && class82.field1754 < var14 && var16 > class48.field992) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            boolean var28 = false;
                            if (class19.field467 == 1 && var26) {
                                var28 = true;
                            }
                            if (class19.field484 == 1 && var13 <= class115.field2538 && class120.field2671 >= var15 && class115.field2538 < var14 && class120.field2671 < var16) {
                                var27 = true;
                            }
                            if (var27) {
                                class43.method395(class115.field2538 - var12, var10, class120.field2671 - var11, arg0 + 66);
                            }
                            if (class66.field1334 != null && class66.field1334 != var10 && var26 && class133.method1064(1584502260, class136.method1084(0, var10))) {
                                class19.field470 = var10;
                            }
                            if (class100.field2100 == var10) {
                                class82.field1731 = true;
                                class20.field509 = var11;
                                class110.field2327 = var12;
                            }
                            if (var10.field3465) {
                                if (var26 && class154.field3519 != 0 && var10.field3398 != null) {
                                    class93 var29 = new class93();
                                    var29.field2009 = class154.field3519;
                                    var29.field2001 = var10.field3398;
                                    var29.field2014 = var10;
                                    class116.field2572.method188(arg0 ^ 0xFFFFFFE0, var29);
                                }
                                if (class66.field1334 != null || class114.field2526 != null || class3.field64) {
                                    var28 = false;
                                    var26 = false;
                                    var27 = false;
                                }
                                if (!var10.field3456 && var27) {
                                    var10.field3456 = true;
                                    if (var10.field3448 != null) {
                                        class93 var30 = new class93();
                                        var30.field2014 = var10;
                                        var30.field2009 = class120.field2671 - var11;
                                        var30.field2016 = class115.field2538 - var12;
                                        var30.field2001 = var10.field3448;
                                        class116.field2572.method188(arg0 - 32, var30);
                                    }
                                }
                                if (var10.field3456 && var28 && var10.field3387 != null) {
                                    class93 var31 = new class93();
                                    var31.field2009 = class48.field992 - var11;
                                    var31.field2001 = var10.field3387;
                                    var31.field2016 = class82.field1754 - var12;
                                    var31.field2014 = var10;
                                    class116.field2572.method188(-2, var31);
                                }
                                if (var10.field3456 && !var28) {
                                    var10.field3456 = false;
                                    if (var10.field3493 != null) {
                                        class93 var32 = new class93();
                                        var32.field2016 = class82.field1754 - var12;
                                        var32.field2001 = var10.field3493;
                                        var32.field2014 = var10;
                                        var32.field2009 = class48.field992 - var11;
                                        class68.field1377.method188(arg0 ^ 0xFFFFFFE0, var32);
                                    }
                                }
                                if (var28 && var10.field3395 != null) {
                                    class93 var33 = new class93();
                                    var33.field2009 = class48.field992 - var11;
                                    var33.field2016 = class82.field1754 - var12;
                                    var33.field2001 = var10.field3395;
                                    var33.field2014 = var10;
                                    class116.field2572.method188(arg0 ^ 0xFFFFFFE0, var33);
                                }
                                if (!var10.field3497 && var26) {
                                    var10.field3497 = true;
                                    if (var10.field3455 != null) {
                                        class93 var34 = new class93();
                                        var34.field2016 = class82.field1754 - var12;
                                        var34.field2009 = class48.field992 - var11;
                                        var34.field2001 = var10.field3455;
                                        var34.field2014 = var10;
                                        class116.field2572.method188(-2, var34);
                                    }
                                }
                                if (var10.field3497 && var26 && var10.field3429 != null) {
                                    class93 var35 = new class93();
                                    var35.field2014 = var10;
                                    var35.field2009 = class48.field992 - var11;
                                    var35.field2001 = var10.field3429;
                                    var35.field2016 = class82.field1754 - var12;
                                    class116.field2572.method188(-2, var35);
                                }
                                if (var10.field3497 && !var26) {
                                    var10.field3497 = false;
                                    if (var10.field3399 != null) {
                                        class93 var36 = new class93();
                                        var36.field2001 = var10.field3399;
                                        var36.field2009 = class48.field992 - var11;
                                        var36.field2014 = var10;
                                        var36.field2016 = class82.field1754 - var12;
                                        class68.field1377.method188(-2, var36);
                                    }
                                }
                                if (var10.field3421 != null) {
                                    class93 var37 = new class93();
                                    var37.field2001 = var10.field3421;
                                    var37.field2014 = var10;
                                    class41.field844.method188(arg0 ^ 0xFFFFFFE0, var37);
                                }
                                if (var10.field3424 != null && var10.field3492 < class114.field2510) {
                                    if (var10.field3422 == null || class114.field2510 - var10.field3492 > 32) {
                                        class93 var42 = new class93();
                                        var42.field2014 = var10;
                                        var42.field2001 = var10.field3424;
                                        class116.field2572.method188(-2, var42);
                                    } else {
                                        label377: for (int var38 = var10.field3492; var38 < class114.field2510; var38++) {
                                            int var39 = class152.field3356[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var10.field3422.length; var40++) {
                                                if (var10.field3422[var40] == var39) {
                                                    class93 var41 = new class93();
                                                    var41.field2001 = var10.field3424;
                                                    var41.field2014 = var10;
                                                    class116.field2572.method188(arg0 ^ 0xFFFFFFE0, var41);
                                                    break label377;
                                                }
                                            }
                                        }
                                    }
                                    var10.field3492 = class114.field2510;
                                }
                                if (var10.field3437 != null && class100.field2102 > var10.field3423) {
                                    if (var10.field3394 == null || class100.field2102 - var10.field3423 > 32) {
                                        class93 var47 = new class93();
                                        var47.field2014 = var10;
                                        var47.field2001 = var10.field3437;
                                        class116.field2572.method188(-2, var47);
                                    } else {
                                        label357: for (int var43 = var10.field3423; var43 < class100.field2102; var43++) {
                                            int var44 = class60.field1167[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var10.field3394.length; var45++) {
                                                if (var10.field3394[var45] == var44) {
                                                    class93 var46 = new class93();
                                                    var46.field2001 = var10.field3437;
                                                    var46.field2014 = var10;
                                                    class116.field2572.method188(arg0 - 32, var46);
                                                    break label357;
                                                }
                                            }
                                        }
                                    }
                                    var10.field3423 = class100.field2102;
                                }
                                if (var10.field3413 != null && var10.field3388 < class128.field2835) {
                                    if (var10.field3443 == null || class128.field2835 - var10.field3388 > 32) {
                                        class93 var52 = new class93();
                                        var52.field2001 = var10.field3413;
                                        var52.field2014 = var10;
                                        class116.field2572.method188(-2, var52);
                                    } else {
                                        label337: for (int var48 = var10.field3388; var48 < class128.field2835; var48++) {
                                            int var49 = class66.field1328[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var10.field3443.length; var50++) {
                                                if (var10.field3443[var50] == var49) {
                                                    class93 var51 = new class93();
                                                    var51.field2014 = var10;
                                                    var51.field2001 = var10.field3413;
                                                    class116.field2572.method188(-2, var51);
                                                    break label337;
                                                }
                                            }
                                        }
                                    }
                                    var10.field3388 = class128.field2835;
                                }
                                if (class6.field145 > var10.field3447 && var10.field3393 != null) {
                                    class93 var53 = new class93();
                                    var53.field2014 = var10;
                                    var53.field2001 = var10.field3393;
                                    class116.field2572.method188(-2, var53);
                                }
                                if (class75.field1498 > var10.field3447 && var10.field3405 != null) {
                                    class93 var54 = new class93();
                                    var54.field2014 = var10;
                                    var54.field2001 = var10.field3405;
                                    class116.field2572.method188(-2, var54);
                                }
                                if (var10.field3447 < class158.field3655 && var10.field3401 != null) {
                                    class93 var55 = new class93();
                                    var55.field2014 = var10;
                                    var55.field2001 = var10.field3401;
                                    class116.field2572.method188(-2, var55);
                                }
                                if (class68.field1381 > var10.field3447 && var10.field3506 != null) {
                                    class93 var56 = new class93();
                                    var56.field2014 = var10;
                                    var56.field2001 = var10.field3506;
                                    class116.field2572.method188(-2, var56);
                                }
                                var10.field3447 = class9.field219;
                                if (var10.field3502 != null) {
                                    for (int var57 = 0; var57 < class77.field1619; var57++) {
                                        class93 var58 = new class93();
                                        var58.field2014 = var10;
                                        var58.field2013 = class136.field2976[var57];
                                        var58.field2021 = class133.field2902[var57];
                                        var58.field2001 = var10.field3502;
                                        class116.field2572.method188(-2, var58);
                                    }
                                }
                            }
                        }
                        if (!var10.field3473) {
                            if (class66.field1334 != null || class114.field2526 != null || class3.field64) {
                                return;
                            }
                            if ((var10.field3490 >= 0 || var10.field3431 != 0) && var13 <= class82.field1754 && class48.field992 >= var15 && var14 > class82.field1754 && class48.field992 < var16) {
                                if (var10.field3490 >= 0) {
                                    class4.field81 = arg2[var10.field3490];
                                } else {
                                    class4.field81 = var10;
                                }
                            }
                            if (var10.field3476 == 8 && class82.field1754 >= var13 && var15 <= class48.field992 && var14 > class82.field1754 && var16 > class48.field992) {
                                class139.field3023 = var10;
                            }
                            if (var10.field3425 > var10.field3382) {
                                class6.method63(var11, class82.field1754, var10.field3427 + var12, var10.field3425, class48.field992, var10.field3382, var10, (byte) 112);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)J")
    public final long method965(byte arg0) {
        field2603++;
        return arg0 >= -21 ? -22L : this.field2609;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method966(int arg0) {
        if (arg0 != -20196) {
            field2613 = null;
        }
        field2620++;
        return this.field2614.method795(-91);
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public static void method967(int arg0) {
        field2613 = null;
        field2625 = null;
        field2624 = null;
        field2597 = null;
        int var1 = -53 % ((arg0 - 22) / 53);
        field2627 = null;
        field2626 = null;
        field2622 = null;
        field2606 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
    public static final void method968(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 75) {
            field2624 = null;
        }
        field2595++;
        class19.field482 = 0;
        for (int var5 = -1; var5 < class44.field927 + class131.field2885; var5++) {
            class141 var21;
            if (var5 == -1) {
                var21 = class136.field2975;
            } else if (class44.field927 > var5) {
                var21 = class104.field2194[class92.field1973[var5]];
            } else {
                var21 = class52.field1067[class139.field3035[var5 - class44.field927]];
            }
            if (var21 != null && var21.method426(false)) {
                if (var21 instanceof class108) {
                    class113 var22 = ((class108) var21).field2265;
                    if (var22.field2470 != null) {
                        var22 = var22.method932(true);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (var5 >= class44.field927) {
                    class113 var25 = ((class108) var21).field2265;
                    if (var25.field2470 != null) {
                        var25 = var25.method932(true);
                    }
                    if (var25.field2491 >= 0 && var25.field2491 < class19.field475.length) {
                        class107.method862(-1316490014, var21.field3087 + 15, var21);
                        if (class134.field2918 > -1) {
                            class19.field475[var25.field2491].method279(class134.field2918 + arg3 - 12, arg1 - 30 + class102.field2142);
                        }
                    }
                    if (class32.field696 == 1 && class139.field3035[var5 - class44.field927] == class125.field2769 && class12.field264 % 20 < 10) {
                        class107.method862(-1316490014, var21.field3087 + 15, var21);
                        if (class134.field2918 > -1) {
                            class102.field2143[0].method279(class134.field2918 + arg3 - 12, class102.field2142 + -28 + arg1);
                        }
                    }
                } else {
                    int var23 = 30;
                    class50 var24 = (class50) var21;
                    if (var24.field1053 != -1 || var24.field1041 != -1) {
                        class107.method862(-1316490014, var21.field3087 + 15, var21);
                        if (class134.field2918 > -1) {
                            if (var24.field1053 != -1) {
                                class49.field1024[var24.field1053].method279(class134.field2918 + arg3 - 12, class102.field2142 + arg1 + -var23);
                                var23 += 25;
                            }
                            if (var24.field1041 != -1) {
                                class19.field475[var24.field1041].method279(arg3 + class134.field2918 - 12, arg1 - -class102.field2142 - var23);
                                var23 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class32.field696 == 10 && class92.field1973[var5] == class18.field458) {
                        class107.method862(-1316490014, var21.field3087 + 15, var21);
                        if (class134.field2918 > -1) {
                            class102.field2143[1].method279(arg3 + class134.field2918 - 12, -var23 + class102.field2142 + arg1);
                        }
                    }
                }
                if (var21.field3091 != null && (class44.field927 <= var5 || class52.field1075 == 0 || class52.field1075 == 3 || class52.field1075 == 1 && class41.method380(((class50) var21).field1051, 0))) {
                    class107.method862(-1316490014, var21.field3087, var21);
                    if (class134.field2918 > -1 && class91.field1962 > class19.field482) {
                        class91.field1954[class19.field482] = class2.field46.method546(var21.field3091) / 2;
                        class91.field1949[class19.field482] = class2.field46.field1411;
                        class91.field1955[class19.field482] = class134.field2918;
                        class91.field1966[class19.field482] = class102.field2142;
                        class91.field1946[class19.field482] = var21.field3117;
                        class91.field1961[class19.field482] = var21.field3096;
                        class91.field1948[class19.field482] = var21.field3103;
                        class91.field1947[class19.field482] = var21.field3091;
                        class19.field482++;
                    }
                }
                if (var21.field3097 > class12.field264) {
                    class107.method862(-1316490014, var21.field3087 + 15, var21);
                    if (class134.field2918 > -1) {
                        int var26 = var21.field3085 * 30 / var21.field3118;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class140.method1118(arg3 + class134.field2918 - 15, arg1 + -3 - -class102.field2142, var26, 5, 65280);
                        class140.method1118(class134.field2918 + arg3 + var26 - 15, class102.field2142 + arg1 - 3, 30 - var26, 5, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (class12.field264 < var21.field3099[var27]) {
                        class107.method862(-1316490014, var21.field3087 / 2, var21);
                        if (class134.field2918 > -1) {
                            if (var27 == 1) {
                                class102.field2142 -= 20;
                            }
                            if (var27 == 2) {
                                class102.field2142 -= 10;
                                class134.field2918 -= 15;
                            }
                            if (var27 == 3) {
                                class102.field2142 -= 10;
                                class134.field2918 += 15;
                            }
                            class60.field1176[var21.field3079[var27]].method279(arg3 + class134.field2918 - 12, arg1 - (-class102.field2142 - -12));
                            class127.field2833.method545(class143.method1132(var21.field3061[var27], 107), class134.field2918 + arg3 - 1, arg1 - -class102.field2142 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var6 = 0; var6 < class19.field482; var6++) {
            int var7 = class91.field1966[var6];
            int var8 = class91.field1954[var6];
            int var9 = class91.field1955[var6];
            int var10 = class91.field1949[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (var7 + 2 > class91.field1966[var20] + -class91.field1949[var20] && var7 - var10 < class91.field1966[var20] - -2 && var9 - var8 < class91.field1955[var20] + class91.field1954[var20] && class91.field1955[var20] - class91.field1954[var20] < var8 + var9 && var7 > class91.field1966[var20] - class91.field1949[var20]) {
                        var7 = class91.field1966[var20] - class91.field1949[var20];
                        var11 = true;
                    }
                }
            }
            class134.field2918 = class91.field1955[var6];
            class102.field2142 = class91.field1966[var6] = var7;
            class109 var12 = class91.field1947[var6];
            if (class88.field1861 == 0) {
                int var13 = 16776960;
                if (class91.field1946[var6] < 6) {
                    var13 = class55.field1130[class91.field1946[var6]];
                }
                if (class91.field1946[var6] == 6) {
                    var13 = class93.field2000 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class91.field1946[var6] == 7) {
                    var13 = class93.field2000 % 20 >= 10 ? 65535 : 255;
                }
                if (class91.field1946[var6] == 8) {
                    var13 = class93.field2000 % 20 < 10 ? 45056 : 8454016;
                }
                if (class91.field1946[var6] == 9) {
                    int var14 = 150 - class91.field1948[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 33160960 - var14 * 327680;
                    } else if (var14 < 150) {
                        var13 = var14 * 5 + 65280 - 500;
                    }
                }
                if (class91.field1946[var6] == 10) {
                    int var15 = 150 - class91.field1948[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var13 = var15 * 327680 - (var15 - 100) * 5 - 32767745;
                    }
                }
                if (class91.field1946[var6] == 11) {
                    int var16 = 150 - class91.field1948[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = (var16 - 50) * 327685 + 65280;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class91.field1961[var6] == 0) {
                    class2.field46.method545(var12, class134.field2918 + arg3, class102.field2142 + arg1, var13, 0);
                }
                if (class91.field1961[var6] == 1) {
                    class2.field46.method562(var12, arg3 + class134.field2918, class102.field2142 + arg1, var13, 0, class93.field2000);
                }
                if (class91.field1961[var6] == 2) {
                    class2.field46.method544(var12, class134.field2918 + arg3, class102.field2142 + arg1, var13, 0, class93.field2000);
                }
                if (class91.field1961[var6] == 3) {
                    class2.field46.method542(var12, class134.field2918 + arg3, class102.field2142 + arg1, var13, 0, class93.field2000, 150 - class91.field1948[var6]);
                }
                if (class91.field1961[var6] == 4) {
                    int var17 = (150 - class91.field1948[var6]) * (class2.field46.method546(var12) + 100) / 150;
                    class140.method1106(arg3 + class134.field2918 - 50, arg1, class134.field2918 + arg3 + 50, arg1 + arg2);
                    class2.field46.method558(var12, class134.field2918 + arg3 + 50 - var17, arg1 - -class102.field2142, var13, 0);
                    class140.method1110(arg3, arg1, arg3 + arg0, arg1 - -arg2);
                }
                if (class91.field1961[var6] == 5) {
                    int var18 = 150 - class91.field1948[var6];
                    class140.method1106(arg3, arg1 + class102.field2142 - class2.field46.field1411 - 1, arg0 + arg3, arg1 + class102.field2142 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class2.field46.method545(var12, class134.field2918 + arg3, class102.field2142 + arg1 + var19, var13, 0);
                    class140.method1110(arg3, arg1, arg0 + arg3, arg1 - -arg2);
                }
            } else {
                class2.field46.method545(var12, class134.field2918 + arg3, class102.field2142 + arg1, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lna;Lna;ZZ)V")
    public static final void method969(class91 arg0, class91 arg1, boolean arg2, boolean arg3) {
        class15.field383 = arg0;
        class141.field3127 = arg1;
        if (arg2) {
            method969(null, null, true, true);
        }
        field2623++;
        class125.field2758 = arg3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[B)V")
    public final void method970(int arg0, byte[] arg1) throws IOException {
        field2596++;
        if (arg0 != 29303) {
            method959((byte) 28);
        }
        this.method971(arg1, 0, arg0 + 16682632, arg1.length);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BIII)V")
    public final void method971(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2615++;
        try {
            if (arg0.length < arg1 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field2611 != -1L && this.field2611 <= this.field2607 && (long) arg3 + this.field2607 <= this.field2611 - -((long) this.field2621)) {
                class26.method237(this.field2593, (int) (this.field2607 - this.field2611), arg0, arg1, arg3);
                this.field2607 += arg3;
                return;
            }
            if (arg2 != 16711935) {
                return;
            }
            long var5 = this.field2607;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field2618 <= this.field2607 && this.field2618 + (long) this.field2610 > this.field2607) {
                int var9 = (int) ((long) this.field2610 + this.field2618 - this.field2607);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class26.method237(this.field2616, (int) (this.field2607 - this.field2618), arg0, arg1, var9);
                arg1 += var9;
                this.field2607 += var9;
                arg3 -= var9;
            }
            if (arg3 > this.field2616.length) {
                this.field2614.method794(this.field2607, 0);
                this.field2604 = this.field2607;
                while (arg3 > 0) {
                    int var10 = this.field2614.method793(-116, arg3, arg0, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 -= var10;
                    arg1 += var10;
                    this.field2607 += var10;
                    this.field2604 += var10;
                }
            } else if (arg3 > 0) {
                this.method962(-13555);
                int var11 = arg3;
                if (arg3 > this.field2610) {
                    var11 = this.field2610;
                }
                arg3 -= var11;
                class26.method237(this.field2616, 0, arg0, arg1, var11);
                arg1 += var11;
                this.field2607 += var11;
            }
            if (this.field2611 != -1L) {
                if (this.field2611 > this.field2607 && arg3 > 0) {
                    int var12 = arg1 + (int) (this.field2611 - this.field2607);
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg1) {
                        arg3--;
                        arg0[arg1++] = 0;
                        this.field2607++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field2611 >= var5 && this.field2611 < var5 + (long) var8) {
                    var15 = this.field2611;
                } else if (var5 >= this.field2611 && var5 < (long) this.field2621 + this.field2611) {
                    var15 = var5;
                }
                if ((long) this.field2621 + this.field2611 > var5 && (long) this.field2621 + this.field2611 <= var5 - -((long) var8)) {
                    var13 = (long) this.field2621 + this.field2611;
                } else if (var5 + (long) var8 > this.field2611 && (long) var8 + var5 <= (long) this.field2621 + this.field2611) {
                    var13 = var5 + (long) var8;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class26.method237(this.field2593, (int) (var15 - this.field2611), arg0, (int) (var15 - var5) + var7, var17);
                    if (var13 > this.field2607) {
                        arg3 = (int) ((long) arg3 + this.field2607 - var13);
                        this.field2607 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2604 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Loa;II)V")
    public class118(class98 arg0, int arg1, int arg2) throws IOException {
        this.field2614 = arg0;
        this.field2609 = this.field2599 = arg0.method796(31422);
        this.field2616 = new byte[arg1];
        this.field2593 = new byte[arg2];
        this.field2607 = 0L;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2624[var1] = var0 / 4;
        }
        field2626 = new int[1000];
        field2625 = class141.method1120("Sichtbare Karte vorbereitet)3", 0);
    }
}
