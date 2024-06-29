import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class254 extends class405 {

    @OriginalMember(owner = "client!vea", name = "Fb", descriptor = "Z")
    public boolean field3526 = false;

    @OriginalMember(owner = "client!vea", name = "Db", descriptor = "Z")
    public boolean field3524 = false;

    @OriginalMember(owner = "client!vea", name = "qb", descriptor = "Z")
    public boolean field3511 = false;

    @OriginalMember(owner = "client!vea", name = "ub", descriptor = "Z")
    public boolean field3515 = false;

    @OriginalMember(owner = "client!vea", name = "kb", descriptor = "Z")
    public boolean field3505 = false;

    @OriginalMember(owner = "client!vea", name = "Eb", descriptor = "[F")
    public static float[] field3525 = new float[4];

    @OriginalMember(owner = "client!vea", name = "Ab", descriptor = "[I")
    public static int[] field3521 = new int[6];

    @OriginalMember(owner = "client!vea", name = "W", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!vea", name = "jb", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!vea", name = "lb", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!vea", name = "mb", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!vea", name = "nb", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!vea", name = "ob", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!vea", name = "pb", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!vea", name = "rb", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!vea", name = "sb", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!vea", name = "tb", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!vea", name = "vb", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!vea", name = "wb", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!vea", name = "xb", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!vea", name = "yb", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!vea", name = "zb", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!vea", name = "Bb", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!vea", name = "Cb", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!vea", name = "Gb", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!vea", name = "Hb", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!vea", name = "Ib", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!vea", name = "Jb", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!vea", name = "Kb", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!vea", name = "Lb", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "(II)Z")
    public final boolean method1549(int arg0, int arg1) {
        if (arg1 >= -69) {
            this.method1565(-63);
        }
        ++field3513;
        return arg0 == 0 ? super.field5451 : true;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Z)V")
    public final void method1550(boolean arg0) {
        this.method1561(true, (byte) -75);
        ++field3504;
        super.field5432 = true;
        super.field5418 = true;
        super.field5423 = true;
        super.field5419 = super.field5449 = 0;
        super.field5459 = true;
        super.field5427 = true;
        super.field5448 = arg0;
        super.field5446 = true;
        super.field5456 = 1;
        super.field5422 = true;
        super.field5415 = true;
        super.field5420 = true;
        super.field5437 = super.field5444 = 2;
        super.field5440 = true;
        if (class660.field9362 > 95) {
            class357.method2108(2, (byte) -107);
        } else {
            class357.method2108(0, (byte) -50);
        }
        super.field5434 = 0;
        super.field5416 = false;
        super.field5428 = true;
        this.method1565(4);
        this.method1551(0, -8);
        super.field5430 = 4;
        class511.method2842(true);
    }

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "(II)V")
    public final void method1551(int arg0, int arg1) {
        super.field5457 = arg0;
        if (arg1 == -8) {
            class370.field4997 = null;
            ++field3531;
            class543.field7145 = true;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
    public final void method1552(int arg0) {
        ++field3520;
        this.method1561(false, (byte) -105);
        super.field5448 = false;
        super.field5440 = false;
        super.field5423 = false;
        super.field5446 = false;
        super.field5427 = false;
        super.field5432 = false;
        super.field5456 = 0;
        super.field5420 = false;
        super.field5419 = super.field5449 = 0;
        super.field5415 = false;
        super.field5418 = false;
        super.field5422 = false;
        super.field5459 = false;
        super.field5437 = super.field5444 = 0;
        class357.method2108(0, (byte) -68);
        super.field5434 = 0;
        super.field5416 = false;
        super.field5428 = false;
        if (arg0 >= 49) {
            this.method1565(4);
            this.method1551(2, -8);
            super.field5430 = 1;
            class511.method2842(true);
        }
    }

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "(II)Z")
    public final boolean method1553(int arg0, int arg1) {
        if (arg1 != -2058) {
            this.method1551(66, -72);
        }
        ++field3530;
        return ~arg0 == -1 && !this.field3511 ? super.field5451 : true;
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)V")
    public static void method1554(int arg0) {
        field3525 = null;
        field3521 = null;
        int var1 = -84 % ((arg0 - -34) / 57);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
    public static final void method1555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        ++field3509;
        if (class218.field3099 != null) {
            class411 var14 = null;
            if (arg5 >= 0) {
                int var15 = arg5 + -1;
                class280 var16 = (class280) class616.field8143.method2918((long) var15, (byte) 119);
                if (var16 != null) {
                    var14 = var16.field3983;
                }
            } else {
                int var17 = -arg5 + -1;
                if (~class416.field5693 != ~var17) {
                    var14 = class572.field7601[var17];
                } else {
                    var14 = class199.field2897;
                }
            }
            if (var14 != null) {
                class58 var18 = class470.field6288.method1258(arg4, (byte) -27);
                if (arg6 == -2) {
                    int var19;
                    int var20;
                    if (arg0 != 1 && arg0 != 3) {
                        var19 = var18.field838;
                        var20 = var18.field885;
                    } else {
                        var20 = var18.field838;
                        var19 = var18.field885;
                    }
                    int var21 = (var19 >> 1) + arg9;
                    int var22 = (var19 - -1 >> 1) + arg9;
                    int var23 = (var20 >> 1) + arg2;
                    int var24 = (var20 - -1 >> 1) + arg2;
                    class139 var25 = class218.field3099[arg1];
                    int var26 = var25.method195(var21, var23) + var25.method195(var22, var23) + var25.method195(var21, var24) - -var25.method195(var22, var24) >> 2;
                    class42 var27 = new class42();
                    var27.field605 = arg10;
                    var27.field614 = arg0;
                    var27.field613 = class642.field8626 + arg3;
                    var27.field615 = arg9;
                    var27.field617 = var14.field8609;
                    if (~arg8 < ~arg12) {
                        int var28 = arg8;
                        arg8 = arg12;
                        arg12 = var28;
                    }
                    var27.field616 = arg4;
                    var27.field620 = arg2;
                    var27.field619 = class642.field8626 + arg7;
                    var27.field618 = arg9 - -arg8;
                    if (arg11 > arg13) {
                        int var29 = arg11;
                        arg11 = arg13;
                        arg13 = var29;
                    }
                    var27.field609 = arg9 + arg12;
                    var27.field610 = arg2 + arg13;
                    var27.field603 = arg2 + arg11;
                    var27.field604 = var26;
                    var27.field608 = (var27.field615 << 9) + (var19 << 8);
                    var27.field611 = (var27.field620 << 9) + (var20 << 8);
                    class39.field584.method3265(var27, (byte) -68);
                    var14.field5646 = var27;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(III)Z")
    public static final boolean method1556(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field3521 = null;
        }
        ++field3512;
        return (arg2 & 16) != 0;
    }

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)V")
    public final void method1557(int arg0) {
        ++field3514;
        this.method1561(true, (byte) -113);
        super.field5420 = false;
        super.field5427 = false;
        super.field5422 = false;
        super.field5432 = false;
        super.field5448 = false;
        super.field5456 = 0;
        super.field5419 = super.field5449 = 0;
        if (arg0 == 16700) {
            super.field5446 = true;
            super.field5415 = false;
            super.field5437 = super.field5444 = 0;
            super.field5440 = false;
            super.field5459 = false;
            super.field5423 = false;
            super.field5418 = false;
            class357.method2108(0, (byte) -99);
            super.field5416 = false;
            super.field5428 = true;
            super.field5434 = 0;
            this.method1565(4);
            this.method1551(2, -8);
            super.field5430 = 2;
            class511.method2842(true);
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BI)I")
    public final int method1558(byte arg0, int arg1) {
        ++field3503;
        if (arg0 != 90) {
            return -79;
        } else if (class435.method2470(arg1, 1494483976) && !class177.method1194((byte) 65, class32.field525)) {
            return ~class660.field9362 > -97 && class517.method2883(arg1, arg0 + -86) && ~super.field5457 == -1 ? 1 : super.field5457;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Leh;Z)V")
    private final void method1559(class335 arg0, boolean arg1) {
        ++field3528;
        if (~(arg0.field4600.length - arg0.field4619) <= -2) {
            int var3 = arg0.method2034(255);
            if (~var3 <= -1 && var3 <= 22) {
                byte var4;
                if (var3 != 22) {
                    if (~var3 == -22) {
                        var4 = 44;
                    } else if (var3 != 20) {
                        if (~var3 != -20) {
                            if (~var3 == -19) {
                                var4 = 41;
                            } else if (var3 != 17) {
                                if (~var3 == -17) {
                                    var4 = 38;
                                } else if (~var3 != -16) {
                                    if (var3 != 14) {
                                        if (var3 == 13) {
                                            var4 = 35;
                                        } else if (var3 != 12) {
                                            if (~var3 == -12) {
                                                var4 = 33;
                                            } else if (var3 == 10) {
                                                var4 = 32;
                                            } else if (var3 == 9) {
                                                var4 = 31;
                                            } else if (~var3 != -9) {
                                                if (~var3 != -8) {
                                                    if (var3 == 6) {
                                                        var4 = 28;
                                                    } else if (var3 == 5) {
                                                        var4 = 28;
                                                    } else if (var3 != 4) {
                                                        if (~var3 == -4) {
                                                            var4 = 23;
                                                        } else if (~var3 != -3) {
                                                            if (~var3 != -2) {
                                                                var4 = 19;
                                                            } else {
                                                                var4 = 23;
                                                            }
                                                        } else {
                                                            var4 = 22;
                                                        }
                                                    } else {
                                                        var4 = 24;
                                                    }
                                                } else {
                                                    var4 = 29;
                                                }
                                            } else {
                                                var4 = 30;
                                            }
                                        } else {
                                            var4 = 34;
                                        }
                                    } else {
                                        var4 = 36;
                                    }
                                } else {
                                    var4 = 37;
                                }
                            } else {
                                var4 = 40;
                            }
                        } else {
                            var4 = 42;
                        }
                    } else {
                        var4 = 43;
                    }
                } else {
                    var4 = 45;
                }
                if (arg0.field4600.length + -arg0.field4619 >= var4) {
                    super.field5453 = arg0.method2034(255);
                    if (~super.field5453 <= -2) {
                        if (~super.field5453 < -5) {
                            super.field5453 = 4;
                        }
                    } else {
                        super.field5453 = 1;
                    }
                    this.method1561(arg0.method2034(255) == 1, (byte) -101);
                    super.field5418 = ~arg0.method2034(255) == -2;
                    super.field5446 = arg0.method2034(255) == 1;
                    super.field5420 = arg0.method2034(255) == 1;
                    super.field5456 = ~arg0.method2034(255) != -2 ? 0 : 1;
                    super.field5427 = ~arg0.method2034(255) == -2;
                    super.field5415 = arg0.method2034(255) == 1;
                    super.field5423 = ~arg0.method2034(255) == -2;
                    super.field5437 = arg0.method2034(255);
                    if (super.field5437 > 2) {
                        super.field5437 = 2;
                    }
                    if (var3 >= 17) {
                        super.field5444 = arg0.method2034(255);
                    }
                    if (var3 < 2) {
                        super.field5432 = arg0.method2034(255) == 1;
                        arg0.method2034(255);
                    } else {
                        super.field5432 = arg0.method2034(255) == 1;
                        if (var3 >= 17) {
                            super.field5440 = ~arg0.method2034(255) == -2;
                        }
                    }
                    super.field5422 = ~arg0.method2034(255) == -2;
                    super.field5448 = ~arg0.method2034(255) == -2;
                    super.field5419 = arg0.method2034(255);
                    if (~super.field5419 < -3) {
                        super.field5419 = 2;
                    }
                    super.field5449 = super.field5419;
                    super.field5424 = arg0.method2034(255) == 1;
                    super.field5450 = arg0.method2034(255);
                    if (~super.field5450 < -128) {
                        super.field5450 = 127;
                    }
                    if (var3 < 20) {
                        super.field5429 = super.field5450;
                    } else {
                        super.field5429 = arg0.method2034(255);
                        if (~super.field5429 < -128) {
                            super.field5429 = 127;
                        }
                    }
                    super.field5445 = arg0.method2034(255);
                    super.field5414 = arg0.method2034(255);
                    if (super.field5414 > 127) {
                        super.field5414 = 127;
                    }
                    if (~var3 <= -22) {
                        super.field5417 = arg0.method2034(255);
                        if (super.field5417 > 127) {
                            super.field5417 = 127;
                        }
                    } else {
                        super.field5417 = super.field5445;
                    }
                    if (var3 >= 1) {
                        super.field5462 = arg0.method2001((byte) -83);
                        super.field5447 = arg0.method2001((byte) -83);
                    }
                    if (var3 >= 3 && ~var3 > -7) {
                        arg0.method2034(255);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg0.method2034(255);
                        if (~var5 > -1 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (class660.field9362 < 96) {
                            var5 = 0;
                        }
                        class357.method2108(var5, (byte) 91);
                    }
                    if (var3 >= 5) {
                        super.field5441 = arg0.method2045(-98);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field5439 = var6 = arg0.method2034(255);
                    }
                    if (~super.field5439 != -2 && ~super.field5439 != -3) {
                        super.field5439 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field5452 = arg0.method2034(255) == 1;
                    }
                    if (~var3 <= -9) {
                        super.field5425 = arg0.method2034(255) == 1;
                    }
                    if (~var3 <= -10) {
                        super.field5434 = arg0.method2034(255);
                    }
                    if (super.field5434 < 0 || ~super.field5434 < ~class689.method3829((byte) 127, class660.field9362)) {
                        super.field5434 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field5416 = ~arg0.method2034(255) != -1;
                    }
                    if (~var3 <= -12) {
                        super.field5458 = arg0.method2034(255) != 0;
                    }
                    if (var3 >= 12) {
                        super.field5456 = arg0.method2034(255);
                    }
                    if (~super.field5456 > -1 || super.field5456 > 2) {
                        super.field5456 = 1;
                    }
                    if (!arg1) {
                        this.field3524 = false;
                    }
                    if (~var3 <= -14) {
                        super.field5428 = ~arg0.method2034(255) == -2;
                    }
                    if (var3 >= 14) {
                        super.field5433 = arg0.method2034(255);
                    } else if (var6 != 0) {
                        super.field5433 = 1;
                    } else {
                        super.field5433 = 2;
                    }
                    if (~super.field5433 > -1 || ~super.field5433 < -6) {
                        super.field5433 = 2;
                    }
                    if (~var3 <= -16) {
                        super.field5454 = arg0.method2034(255);
                        if (super.field5454 < 0 || ~super.field5454 < -5) {
                            super.field5454 = ~class242.field3380 != -2 ? 4 : 2;
                        }
                    }
                    if (var3 >= 16) {
                        super.field5459 = arg0.method2034(255) == 1;
                        try {
                            if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                super.field5459 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (~var3 > -18 && super.field5433 == 0) {
                        super.field5433 = 2;
                    }
                    if (~var3 <= -19) {
                        super.field5430 = arg0.method2034(255);
                        if (super.field5430 < 0 || super.field5430 > 4) {
                            super.field5430 = 0;
                        }
                    }
                    if (~var3 <= -20) {
                        super.field5457 = arg0.method2034(255);
                    } else if (super.field5430 != 1 && ~super.field5430 != -3) {
                        if (super.field5430 != 3) {
                            super.field5457 = 0;
                        } else {
                            super.field5457 = 1;
                        }
                    } else {
                        super.field5457 = 2;
                    }
                    if (var3 >= 22) {
                        super.field5438 = arg0.method2034(255);
                    }
                    if (~super.field5433 == -1 && class660.field9362 < 96 && super.field5430 != 1 && ~super.field5430 != -1) {
                        this.method1552(101);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "(I)V")
    public final void method1560(int arg0) {
        this.method1561(true, (byte) -45);
        ++field3523;
        super.field5437 = super.field5444 = arg0;
        super.field5456 = 1;
        super.field5448 = true;
        super.field5432 = true;
        super.field5418 = true;
        super.field5423 = true;
        super.field5440 = false;
        super.field5459 = true;
        super.field5415 = true;
        super.field5422 = false;
        super.field5420 = true;
        super.field5419 = super.field5449 = 0;
        super.field5446 = true;
        super.field5427 = true;
        if (~class660.field9362 >= -96) {
            class357.method2108(0, (byte) -87);
        } else {
            class357.method2108(1, (byte) -111);
        }
        super.field5416 = false;
        super.field5428 = true;
        super.field5434 = 0;
        this.method1565(4);
        this.method1551(1, -8);
        super.field5430 = 3;
        class511.method2842(true);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(ZB)V")
    public final void method1561(boolean arg0, byte arg1) {
        if (arg1 > -29) {
            this.field3524 = false;
        }
        ++field3506;
        super.field5451 = arg0;
        if (class470.field6288 != null) {
            class470.field6288.method1260(-22754, !this.method1553(class571.field7587, -2058));
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILii;)V")
    public final void method1562(int arg0, class519 arg1) {
        int var3 = -118 / ((arg0 - -57) / 36);
        ++field3519;
        class488 var4 = null;
        try {
            class192 var5 = arg1.method2892("", true, true);
            while (var5.field2816 == 0) {
                class486.method2722(0, 1L);
            }
            if (var5.field2816 == 1) {
                var4 = (class488) var5.field2820;
                class335 var6 = new class335(class561.method3085(-1));
                this.method2325(var6, 1);
                var4.method2730(0, var6.field4600, var6.field4619, -1);
            }
        } catch (Exception var8) {
        }
        try {
            if (var4 != null) {
                var4.method2729((byte) -33);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(Z)I")
    public final int method1563(boolean arg0) {
        ++field3527;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class688.field9669.field6915 && !class688.field9669.field6917) {
            if (!class519.field6923.startsWith("win")) {
                var3 = true;
            } else {
                var3 = true;
                var4 = true;
                if (!class519.field6929.startsWith("amd64") && !class519.field6929.startsWith("x86_64")) {
                    var2 = true;
                }
            }
        }
        if (this.field3524) {
            var3 = false;
        }
        if (this.field3505) {
            var4 = false;
        }
        if (this.field3515) {
            var2 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method1566(4);
        } else {
            int var5 = -1;
            int var6 = -1;
            int var7 = -1;
            if (var2) {
                try {
                    var5 = class457.method2606((byte) -103, 1000, 2);
                } catch (Exception var16) {
                }
            }
            if (var4) {
                try {
                    var7 = class457.method2606((byte) -103, 1000, 3);
                    if (class571.field7587 == 3) {
                        class173 var8 = class10.field197.method55();
                        long var9 = var8.field2663 & 281474976710655L;
                        int var11 = var8.field2665;
                        if (var11 != 4318) {
                            if (~var11 == -4099) {
                                var3 &= var9 >= 60129613779L;
                            }
                        } else {
                            var3 &= var9 >= 64425238954L;
                        }
                    }
                } catch (Exception var15) {
                }
            }
            if (var3) {
                try {
                    var6 = class457.method2606((byte) -103, 1000, 1);
                } catch (Exception var14) {
                }
            }
            if (var5 == -1 && var6 == -1 && ~var7 == 0) {
                return this.method1566(4);
            } else {
                int var12 = (int) ((float) var6 * 1.1F);
                int var13 = (int) ((float) var7 * 1.1F);
                if (!arg0) {
                    this.field3524 = false;
                }
                if (var13 < var5 && var12 < var5) {
                    return this.method1564(var5, !arg0);
                } else {
                    return var12 >= var13 ? this.method1567(var12, 1, 20000) : this.method1567(var13, 3, 20000);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(IZ)I")
    private final int method1564(int arg0, boolean arg1) {
        ++field3508;
        byte var3;
        if (~arg0 >= -12001) {
            if (~arg0 >= -5001) {
                if (arg0 > 2000) {
                    this.method1557(16700);
                    var3 = 2;
                } else {
                    this.method1552(112);
                    var3 = 1;
                }
            } else {
                var3 = 3;
                this.method1560(1);
            }
        } else {
            this.method1550(true);
            var3 = 4;
        }
        if (class571.field7587 != 2) {
            super.field5433 = 2;
            class405.method2326(2, -96);
        }
        this.method1562(-115, class688.field9669);
        return arg1 ? -108 : var3;
    }

    @OriginalMember(owner = "client!vea", name = "g", descriptor = "(I)V")
    private final void method1565(int arg0) {
        ++field3507;
        if (arg0 != 4) {
            this.method1553(-86, -121);
        }
        if (~class242.field3380 >= -2) {
            super.field5454 = 2;
        } else {
            super.field5454 = 4;
        }
    }

    @OriginalMember(owner = "client!vea", name = "h", descriptor = "(I)I")
    private final int method1566(int arg0) {
        if (arg0 != 4) {
            this.field3511 = false;
        }
        ++field3516;
        byte var3;
        if (~class660.field9362 <= -97) {
            int var2 = class689.method3830(0);
            if (~var2 < -101) {
                if (~var2 < -501) {
                    if (var2 <= 1000) {
                        var3 = 2;
                        this.method1557(16700);
                    } else {
                        var3 = 1;
                        this.method1552(69);
                    }
                } else {
                    this.method1560(1);
                    var3 = 3;
                }
            } else {
                this.method1550(true);
                var3 = 4;
            }
        } else {
            var3 = 1;
            this.method1552(111);
        }
        if (class571.field7587 != 0) {
            super.field5433 = 0;
            class405.method2326(0, -111);
        }
        this.method1562(50, class688.field9669);
        return var3;
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(III)I")
    private final int method1567(int arg0, int arg1, int arg2) {
        ++field3510;
        byte var4;
        if (arg0 > arg2) {
            this.method1550(true);
            var4 = 4;
        } else if (~arg0 >= -10001) {
            if (arg0 <= 5000) {
                this.method1552(75);
                var4 = 1;
            } else {
                this.method1557(16700);
                var4 = 2;
            }
        } else {
            var4 = 3;
            this.method1560(1);
        }
        if (class571.field7587 != arg1) {
            super.field5433 = arg1;
            class405.method2326(arg1, -111);
        }
        this.method1562(arg2 ^ -20054, class688.field9669);
        return var4;
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lii;)V")
    public class254(class519 arg0) {
        super.field5453 = 3;
        super.field5430 = 3;
        this.method1561(true, (byte) -40);
        super.field5432 = true;
        super.field5444 = 0;
        super.field5424 = true;
        super.field5440 = false;
        super.field5456 = 1;
        super.field5417 = 127;
        super.field5450 = 127;
        super.field5422 = true;
        super.field5420 = true;
        super.field5415 = true;
        super.field5423 = true;
        super.field5419 = 0;
        super.field5449 = 0;
        super.field5427 = true;
        super.field5462 = 0;
        super.field5429 = 127;
        super.field5447 = 0;
        super.field5418 = true;
        super.field5446 = true;
        super.field5437 = 2;
        super.field5448 = true;
        super.field5445 = 127;
        super.field5414 = 127;
        if (class660.field9362 < 96) {
            class357.method2108(0, (byte) 51);
        } else {
            class357.method2108(2, (byte) 62);
        }
        super.field5452 = false;
        super.field5433 = 2;
        super.field5425 = false;
        super.field5428 = true;
        super.field5416 = false;
        super.field5434 = 0;
        super.field5441 = 0;
        super.field5457 = 0;
        super.field5454 = class242.field3380 == 1 ? 2 : 4;
        super.field5458 = true;
        super.field5439 = 2;
        class488 var2 = null;
        try {
            class192 var3 = arg0.method2892("", true, true);
            while (~var3.field2816 == -1) {
                class486.method2722(0, 1L);
            }
            if (var3.field2816 == 1) {
                var2 = (class488) var3.field2820;
                byte[] var4 = new byte[(int) var2.method2732(90)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2726(var4.length - var5, var5, (byte) -115, var4);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method1559(new class335(var4), true);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2729((byte) 102);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(BI)I")
    public final int method1568(byte arg0, int arg1) {
        ++field3532;
        if (this.field3526) {
            return 0;
        } else if (!this.method1553(arg1, -2058)) {
            return 1;
        } else {
            if (arg0 >= -101) {
                this.field3505 = false;
            }
            return !super.field5418 ? 1 : 2;
        }
    }
}
