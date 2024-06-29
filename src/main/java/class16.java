import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class16 {

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lqi;")
    public static class131 field184 = null;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public int field179;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field180;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "[I")
    public int[] field181;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "[I")
    public static int[] field183;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static final void method110(int arg0) {
        field182++;
        class32.field401++;
        class220.field3532.method557(127, 8);
        for (class17 var1 = (class17) class124.field1806.method1033(arg0 - 10411); var1 != null; var1 = (class17) class124.field1806.method1031((byte) -7)) {
            if (var1.field188 == 0) {
                class159.method1187((byte) -53, true, var1);
            }
        }
        if (arg0 != 568) {
            method110(71);
        }
        if (class211.field3390 != null) {
            class274.method1896(class211.field3390, 10);
            class211.field3390 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public final void method111(byte arg0) {
        class70.method511(this.field181, this.field175, this.field179);
        field176++;
        if (arg0 != 50) {
            method113(109);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public static void method112(int arg0) {
        if (arg0 != -1) {
            field183 = null;
        }
        field184 = null;
        field183 = null;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
    public static final void method113(int arg0) {
        class220.field3532.method557(45, 8);
        field174++;
        if (arg0 != -31880) {
            field184 = null;
        }
        class180.field2903++;
        class220.field3532.method1069(0L, -107);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method114(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZLth;IZIIBII)V")
    public static final void method115(int arg0, int arg1, boolean arg2, class113 arg3, int arg4, boolean arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        field178++;
        if (arg5 && !class77.method566((byte) -65) && (class86.field1277[0][arg7][arg0] & 0x2) == 0) {
            if ((class86.field1277[arg4][arg7][arg0] & 0x10) != 0) {
                return;
            }
            if (class38.method299(arg4, arg0, arg7, 32768) != class11.field134) {
                return;
            }
        }
        if (class29.field357 > arg4) {
            class29.field357 = arg4;
        }
        class36 var11 = class134.method970(arg1, 0);
        int var12;
        int var13;
        if (arg9 == 1 || arg9 == 3) {
            var13 = var11.field501;
            var12 = var11.field487;
        } else {
            var12 = var11.field501;
            var13 = var11.field487;
        }
        int var14;
        int var15;
        if ((arg7 + var13) > 104) {
            var14 = arg7 + 1;
            var15 = arg7;
        } else {
            var15 = (var13 >> 1) + arg7;
            var14 = (var13 + 1 >> 1) + arg7;
        }
        int var16;
        int var17;
        if (arg0 + var12 <= 104) {
            var16 = (var12 + 1 >> 1) + arg0;
            var17 = (var12 >> 1) + arg0;
        } else {
            var17 = arg0;
            var16 = arg0 + 1;
        }
        int[][] var18 = class220.field3533[arg6];
        int var19 = var18[var15][var16] + var18[var14][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        int var20 = (arg0 << 7) + (var12 << 6);
        int var21 = (arg7 << 7) + (var13 << 6);
        int[][] var22 = null;
        if (arg2) {
            var22 = class169.field2724[0];
        } else if (arg6 < 3) {
            var22 = class220.field3533[arg6 + 1];
        }
        long var23 = (long) (arg0 << 7 | arg7 | arg10 << 14 | arg9 << 20 | 0x40000000);
        if (var11.field481 == 0 || arg2) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field465 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field486) {
            var23 |= 0x80000000L;
        }
        long var25 = var23 | (long) arg1 << 32;
        if (var11.method271((byte) -115)) {
            class188.method1403(arg9, (class18) null, arg0, arg4, 127, var11, arg7, (class29) null);
        }
        boolean var27 = var11.field458 & !arg2;
        if (arg8 != -127) {
            method112(76);
        }
        if (arg10 == 22) {
            if (class207.field3334 || var11.field481 != 0 || var11.field516 == 1 || var11.field518) {
                class178 var29;
                if (var11.field461 == -1 && var11.field476 == null && var11.field471 == null && !var11.field495) {
                    class71 var28 = var11.method283(5, var21, var18, var27, var22, var19, arg5, arg9, 22, var20, (class4) null);
                    var29 = var28.field1042;
                } else {
                    var29 = new class43(arg1, 22, arg9, arg6, arg7, arg0, -1, var11.field513, (class178) null);
                }
                class160.method1194(arg4, arg7, arg0, var19, var29, var25, var11.field507);
                if (var11.field516 == 1 && arg3 != null) {
                    arg3.method825(arg7, arg0, (byte) 114);
                }
            }
        } else if (arg10 == 10 || arg10 == 11) {
            class178 var69;
            if (var11.field461 == -1 && var11.field476 == null && var11.field471 == null && !var11.field495) {
                class71 var68 = var11.method283(5, var21, var18, var27, var22, var19, arg5, arg10 == 11 ? arg9 + 4 : arg9, 10, var20, (class4) null);
                var69 = var68.field1042;
            } else {
                var69 = new class43(arg1, 10, arg10 == 11 ? arg9 + 4 : arg9, arg6, arg7, arg0, -1, var11.field513, (class178) null);
            }
            if (var69 != null) {
                boolean var70 = class97.method750(arg4, arg7, arg0, var19, var13, var12, var69, 0, var25);
                if (var11.field459 && var70 && arg5) {
                    int var71 = 15;
                    if (var69 instanceof class22) {
                        var71 = ((class22) var69).method159() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (class59.field830[arg4][arg7 + var72][arg0 + var73] < var71) {
                                class59.field830[arg4][arg7 + var72][arg0 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field516 != 0 && arg3 != null) {
                arg3.method837(arg0, var13, !var11.field479, arg7, (byte) 4, var12, var11.field491);
            }
        } else if (arg10 >= 12) {
            class178 var31;
            if (var11.field461 == -1 && var11.field476 == null && var11.field471 == null && !var11.field495) {
                class71 var30 = var11.method283(5, var21, var18, var27, var22, var19, arg5, arg9, arg10, var20, (class4) null);
                var31 = var30.field1042;
            } else {
                var31 = new class43(arg1, arg10, arg9, arg6, arg7, arg0, -1, var11.field513, (class178) null);
            }
            class97.method750(arg4, arg7, arg0, var19, 1, 1, var31, 0, var25);
            if (arg5 && arg10 >= 12 && arg10 <= 17 && arg10 != 13 && arg4 > 0 && var11.field478 != 0) {
                class26.field302[arg4][arg7][arg0] = class244.method1747(class26.field302[arg4][arg7][arg0], 4);
            }
            if (var11.field516 != 0 && arg3 != null) {
                arg3.method837(arg0, var13, !var11.field479, arg7, (byte) 17, var12, var11.field491);
            }
        } else if (arg10 == 0) {
            class178 var33;
            if (var11.field461 == -1 && var11.field476 == null && var11.field471 == null && !var11.field495) {
                class71 var32 = var11.method283(5, var21, var18, var27, var22, var19, arg5, arg9, 0, var20, (class4) null);
                var33 = var32.field1042;
            } else {
                var33 = new class43(arg1, 0, arg9, arg6, arg7, arg0, -1, var11.field513, (class178) null);
            }
            class139.method985(arg4, arg7, arg0, var19, var33, (class178) null, class217.field3447[arg9], 0, var25);
            if (arg5) {
                if (arg9 == 0) {
                    if (var11.field459) {
                        class59.field830[arg4][arg7][arg0] = 50;
                        class59.field830[arg4][arg7][arg0 + 1] = 50;
                    }
                    if (var11.field478 == 1) {
                        class26.field302[arg4][arg7][arg0] = class244.method1747(class26.field302[arg4][arg7][arg0], 1);
                    }
                } else if (arg9 == 1) {
                    if (var11.field459) {
                        class59.field830[arg4][arg7][arg0 + 1] = 50;
                        class59.field830[arg4][arg7 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field478 == 1) {
                        class26.field302[arg4][arg7][arg0 + 1] = class244.method1747(class26.field302[arg4][arg7][arg0 + 1], 2);
                    }
                } else if (arg9 == 2) {
                    if (var11.field459) {
                        class59.field830[arg4][arg7 + 1][arg0] = 50;
                        class59.field830[arg4][arg7 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field478 == 1) {
                        class26.field302[arg4][arg7 + 1][arg0] = class244.method1747(class26.field302[arg4][arg7 + 1][arg0], 1);
                    }
                } else if (arg9 == 3) {
                    if (var11.field459) {
                        class59.field830[arg4][arg7][arg0] = 50;
                        class59.field830[arg4][arg7 + 1][arg0] = 50;
                    }
                    if (var11.field478 == 1) {
                        class26.field302[arg4][arg7][arg0] = class244.method1747(class26.field302[arg4][arg7][arg0], 2);
                    }
                }
            }
            if (var11.field516 != 0 && arg3 != null) {
                arg3.method836(arg9, var11.field491, arg0, arg7, arg10, !var11.field479, (byte) -23);
            }
            if (var11.field457 != 16) {
                class33.method251(arg4, arg7, arg0, var11.field457);
            }
        } else if (arg10 == 1) {
            class178 var35;
            if (var11.field461 == -1 && var11.field476 == null && var11.field471 == null && !var11.field495) {
                class71 var34 = var11.method283(arg8 + 132, var21, var18, var27, var22, var19, arg5, arg9, 1, var20, (class4) null);
                var35 = var34.field1042;
            } else {
                var35 = new class43(arg1, 1, arg9, arg6, arg7, arg0, -1, var11.field513, (class178) null);
            }
            class139.method985(arg4, arg7, arg0, var19, var35, (class178) null, class101.field1489[arg9], 0, var25);
            if (var11.field459 && arg5) {
                if (arg9 == 0) {
                    class59.field830[arg4][arg7][arg0 + 1] = 50;
                } else if (arg9 == 1) {
                    class59.field830[arg4][arg7 + 1][arg0 + 1] = 50;
                } else if (arg9 == 2) {
                    class59.field830[arg4][arg7 + 1][arg0] = 50;
                } else if (arg9 == 3) {
                    class59.field830[arg4][arg7][arg0] = 50;
                }
            }
            if (var11.field516 != 0 && arg3 != null) {
                arg3.method836(arg9, var11.field491, arg0, arg7, arg10, !var11.field479, (byte) -41);
            }
        } else if (arg10 == 2) {
            int var36 = arg9 + 1 & 0x3;
            class178 var38;
            class178 var40;
            if (var11.field461 == -1 && var11.field476 == null && var11.field471 == null && !var11.field495) {
                class71 var37 = var11.method283(arg8 ^ 0xFFFFFF84, var21, var18, var27, var22, var19, arg5, arg9 + 4, 2, var20, (class4) null);
                var38 = var37.field1042;
                class71 var39 = var11.method283(5, var21, var18, var27, var22, var19, arg5, var36, 2, var20, (class4) null);
                var40 = var39.field1042;
            } else {
                var38 = new class43(arg1, 2, arg9 + 4, arg6, arg7, arg0, -1, var11.field513, (class178) null);
                var40 = new class43(arg1, 2, var36, arg6, arg7, arg0, -1, var11.field513, (class178) null);
            }
            class139.method985(arg4, arg7, arg0, var19, var38, var40, class217.field3447[arg9], class217.field3447[var36], var25);
            if (var11.field478 == 1 && arg5) {
                if (arg9 == 0) {
                    class26.field302[arg4][arg7][arg0] = class244.method1747(class26.field302[arg4][arg7][arg0], 1);
                    class26.field302[arg4][arg7][arg0 + 1] = class244.method1747(class26.field302[arg4][arg7][arg0 + 1], 2);
                } else if (arg9 == 1) {
                    class26.field302[arg4][arg7][arg0 + 1] = class244.method1747(class26.field302[arg4][arg7][arg0 + 1], 2);
                    class26.field302[arg4][arg7 + 1][arg0] = class244.method1747(class26.field302[arg4][arg7 + 1][arg0], 1);
                } else if (arg9 == 2) {
                    class26.field302[arg4][arg7 + 1][arg0] = class244.method1747(class26.field302[arg4][arg7 + 1][arg0], 1);
                    class26.field302[arg4][arg7][arg0] = class244.method1747(class26.field302[arg4][arg7][arg0], 2);
                } else if (arg9 == 3) {
                    class26.field302[arg4][arg7][arg0] = class244.method1747(class26.field302[arg4][arg7][arg0], 2);
                    class26.field302[arg4][arg7][arg0] = class244.method1747(class26.field302[arg4][arg7][arg0], 1);
                }
            }
            if (var11.field516 != 0 && arg3 != null) {
                arg3.method836(arg9, var11.field491, arg0, arg7, arg10, !var11.field479, (byte) -39);
            }
            if (var11.field457 != 16) {
                class33.method251(arg4, arg7, arg0, var11.field457);
            }
        } else if (arg10 == 3) {
            class178 var42;
            if (var11.field461 == -1 && var11.field476 == null && var11.field471 == null && !var11.field495) {
                class71 var41 = var11.method283(5, var21, var18, var27, var22, var19, arg5, arg9, 3, var20, (class4) null);
                var42 = var41.field1042;
            } else {
                var42 = new class43(arg1, 3, arg9, arg6, arg7, arg0, -1, var11.field513, (class178) null);
            }
            class139.method985(arg4, arg7, arg0, var19, var42, (class178) null, class101.field1489[arg9], 0, var25);
            if (var11.field459 && arg5) {
                if (arg9 == 0) {
                    class59.field830[arg4][arg7][arg0 + 1] = 50;
                } else if (arg9 == 1) {
                    class59.field830[arg4][arg7 + 1][arg0 + 1] = 50;
                } else if (arg9 == 2) {
                    class59.field830[arg4][arg7 + 1][arg0] = 50;
                } else if (arg9 == 3) {
                    class59.field830[arg4][arg7][arg0] = 50;
                }
            }
            if (var11.field516 != 0 && arg3 != null) {
                arg3.method836(arg9, var11.field491, arg0, arg7, arg10, !var11.field479, (byte) -90);
            }
        } else if (arg10 == 9) {
            class178 var44;
            if (var11.field461 == -1 && var11.field476 == null && var11.field471 == null && !var11.field495) {
                class71 var43 = var11.method283(5, var21, var18, var27, var22, var19, arg5, arg9, arg10, var20, (class4) null);
                var44 = var43.field1042;
            } else {
                var44 = new class43(arg1, arg10, arg9, arg6, arg7, arg0, -1, var11.field513, (class178) null);
            }
            class97.method750(arg4, arg7, arg0, var19, 1, 1, var44, 0, var25);
            if (var11.field516 != 0 && arg3 != null) {
                arg3.method837(arg0, var13, !var11.field479, arg7, (byte) -116, var12, var11.field491);
            }
            if (var11.field457 != 16) {
                class33.method251(arg4, arg7, arg0, var11.field457);
            }
        } else if (arg10 == 4) {
            class178 var46;
            if (var11.field461 == -1 && var11.field476 == null && var11.field471 == null && !var11.field495) {
                class71 var45 = var11.method283(5, var21, var18, var27, var22, var19, arg5, arg9, 4, var20, (class4) null);
                var46 = var45.field1042;
            } else {
                var46 = new class43(arg1, 4, arg9, arg6, arg7, arg0, -1, var11.field513, (class178) null);
            }
            class201.method1480(arg4, arg7, arg0, var19, var46, (class178) null, class217.field3447[arg9], 0, 0, 0, var25);
        } else if (arg10 == 5) {
            int var47 = 16;
            long var48 = class267.method1857(arg4, arg7, arg0);
            if (var48 != 0L) {
                var47 = class134.method970(Integer.MAX_VALUE & (int) (var48 >>> 32), 0).field457;
            }
            class178 var51;
            if (var11.field461 == -1 && var11.field476 == null && var11.field471 == null && !var11.field495) {
                class71 var50 = var11.method283(5, var21, var18, var27, var22, var19, arg5, arg9, 4, var20, (class4) null);
                var51 = var50.field1042;
            } else {
                var51 = new class43(arg1, 4, arg9, arg6, arg7, arg0, -1, var11.field513, (class178) null);
            }
            class201.method1480(arg4, arg7, arg0, var19, var51, (class178) null, class217.field3447[arg9], 0, class32.field385[arg9] * var47, class97.field1433[arg9] * var47, var25);
        } else if (arg10 == 6) {
            long var52 = class267.method1857(arg4, arg7, arg0);
            int var54 = 8;
            if (var52 != 0L) {
                var54 = class134.method970(Integer.MAX_VALUE & (int) (var52 >>> 32), 0).field457 / 2;
            }
            class178 var56;
            if (var11.field461 == -1 && var11.field476 == null && var11.field471 == null && !var11.field495) {
                class71 var55 = var11.method283(arg8 ^ 0xFFFFFF84, var21, var18, var27, var22, var19, arg5, arg9 + 4, 4, var20, (class4) null);
                var56 = var55.field1042;
            } else {
                var56 = new class43(arg1, 4, arg9 + 4, arg6, arg7, arg0, -1, var11.field513, (class178) null);
            }
            class201.method1480(arg4, arg7, arg0, var19, var56, (class178) null, 256, arg9, class160.field2625[arg9] * var54, class274.field4406[arg9] * var54, var25);
        } else if (arg10 == 7) {
            int var57 = arg9 + 2 & 0x3;
            class178 var59;
            if (var11.field461 == -1 && var11.field476 == null && var11.field471 == null && !var11.field495) {
                class71 var58 = var11.method283(5, var21, var18, var27, var22, var19, arg5, var57 + 4, 4, var20, (class4) null);
                var59 = var58.field1042;
            } else {
                var59 = new class43(arg1, 4, var57 + 4, arg6, arg7, arg0, -1, var11.field513, (class178) null);
            }
            class201.method1480(arg4, arg7, arg0, var19, var59, (class178) null, 256, var57, 0, 0, var25);
        } else if (arg10 == 8) {
            long var60 = class267.method1857(arg4, arg7, arg0);
            int var62 = 8;
            if (var60 != 0L) {
                var62 = class134.method970(Integer.MAX_VALUE & (int) (var60 >>> 32), 0).field457 / 2;
            }
            int var63 = arg9 + 2 & 0x3;
            class178 var65;
            class178 var67;
            if (var11.field461 == -1 && var11.field476 == null && var11.field471 == null && !var11.field495) {
                class71 var64 = var11.method283(5, var21, var18, var27, var22, var19, arg5, arg9 + 4, 4, var20, (class4) null);
                var65 = var64.field1042;
                class71 var66 = var11.method283(5, var21, var18, var27, var22, var19, arg5, var63 + 4, 4, var20, (class4) null);
                var67 = var66.field1042;
            } else {
                var65 = new class43(arg1, 4, arg9 + 4, arg6, arg7, arg0, -1, var11.field513, (class178) null);
                var67 = new class43(arg1, 4, var63 + 4, arg6, arg7, arg0, -1, var11.field513, (class178) null);
            }
            class201.method1480(arg4, arg7, arg0, var19, var65, var67, 256, arg9, class160.field2625[arg9] * var62, class274.field4406[arg9] * var62, var25);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public abstract void method116(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method117(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    protected class16() {
    }
}
