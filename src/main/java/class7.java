import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 implements Runnable {

    @OriginalMember(owner = "client!il", name = "e", descriptor = "[Lkv;")
    public volatile class245[] field68 = new class245[2];

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Z")
    public volatile boolean field71 = false;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "Z")
    public volatile boolean field64 = false;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "[I")
    public static int[] field73 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!il", name = "i", descriptor = "Lwo;")
    public static class690 field72 = new class690(116, -1);

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Ljk;")
    public static class585 field76 = new class585(71, -1);

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lwd;")
    public class248 field65;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method41(int arg0) {
        field76 = null;
        if (arg0 != -316598032) {
            field76 = null;
        }
        field72 = null;
        field73 = null;
    }

    @OriginalMember(owner = "client!il", name = "run", descriptor = "()V")
    public final void run() {
        field67++;
        this.field64 = true;
        try {
            while (!this.field71) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class245 var2 = this.field68[var1];
                    if (var2 != null) {
                        var2.method1485(0);
                    }
                }
                class151.method974((byte) -102, 10L);
                class142.method933(this.field65, -51, null);
            }
        } catch (Exception var9) {
            class544.method3184(23383, null, var9);
        } finally {
            Object var6 = null;
            this.field64 = false;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)Z")
    public static final boolean method42(int arg0, int arg1, int arg2) {
        field69++;
        if (arg0 == 0) {
            return (arg2 & 0x22) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILdc;)V")
    public static final void method43(int arg0, class5 arg1) {
        field70++;
        arg1.method26(8);
        if (arg0 != -994059972) {
            return;
        }
        int var2 = class63.field1016;
        class613 var3 = class206.field2472 = class184.field2252[var2] = new class613();
        var3.field2664 = var2;
        int var4 = arg1.method25(30, 255);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFF6E8) >> 14;
        var3.field2689[0] = var6 - class36.field689;
        int var7 = var4 & 0x3FFF;
        var3.field530 = (var3.field2689[0] << 9) + (var3.method1284((byte) -124) << 8);
        var3.field2686[0] = var7 - class88.field1239;
        var3.field531 = (var3.field2686[0] << 9) + (var3.method1284((byte) -124) << 8);
        class617.field8853 = var3.field532 = var3.field535 = var5;
        if (class626.method3602(var3.field2689[0], var3.field2686[0], (byte) 95)) {
            var3.field535++;
        }
        if (class69.field1062[var2] != null) {
            var3.method3517(class69.field1062[var2], (byte) -88);
        }
        class394.field5564 = 0;
        class82.field1176[class394.field5564++] = var2;
        class506.field7240[var2] = 0;
        class565.field8241 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method25(18, 255);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFFEB) >> 8;
                int var12 = var9 & 0xFF;
                class19 var13 = class195.field2364[var8] = new class19();
                var13.field516 = -1;
                var13.field521 = (var10 << 28) + ((var11 << 14) + var12);
                var13.field520 = 0;
                var13.field519 = false;
                class419.field5947[class565.field8241++] = var8;
                class506.field7240[var8] = 0;
            }
        }
        arg1.method32((byte) -128);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(III)Lse;")
    public static final class233 method44(int arg0, int arg1, int arg2) {
        field66++;
        if (arg2 != -1) {
            method42(-53, -83, -58);
        }
        class233 var3 = (class233) class612.field8766.method3678((long) arg0 | (long) arg1 << 32, arg2 ^ 0x7A);
        if (var3 == null) {
            var3 = new class233(arg1, arg0);
            class612.field8766.method3670(var3.field7519, var3, (byte) 127);
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILec;)V")
    public static final void method45(int arg0, class213 arg1) {
        if (arg1.field2634 != -1) {
            class282 var2 = class195.field2367.method3273(arg1.field2634, 0);
            if (var2 == null || var2.field3827 == null) {
                arg1.field2594 = false;
                arg1.field2634 = -1;
            } else {
                label366: {
                    arg1.field2614++;
                    if (var2.field3827.length > arg1.field2620 && var2.field3840[arg1.field2620] < arg1.field2614) {
                        arg1.field2620++;
                        arg1.field2608++;
                        arg1.field2614 = 1;
                        if (!arg1.field2597) {
                            class563.method3294((byte) 119, var2, arg1, arg1.field2620);
                        }
                    }
                    if (var2.field3827.length <= arg1.field2620) {
                        arg1.field2620 = 0;
                        arg1.field2614 = 0;
                        if (arg1.field2594) {
                            arg1.field2634 = arg1.method1280(-1).method3358(0);
                            if (arg1.field2634 == -1) {
                                arg1.field2594 = false;
                                break label366;
                            }
                            var2 = class195.field2367.method3273(arg1.field2634, 0);
                        }
                        if (!arg1.field2597) {
                            class563.method3294((byte) 111, var2, arg1, arg1.field2620);
                        }
                    }
                    arg1.field2608 = arg1.field2620 + 1;
                    if (var2.field3827 == null) {
                        arg1.field2594 = false;
                        arg1.field2634 = -1;
                    } else if (var2.field3827.length <= arg1.field2608) {
                        arg1.field2608 = 0;
                    }
                }
            }
        }
        if (arg0 <= 87) {
            return;
        }
        field74++;
        if (arg1.field2626 != -1 && class543.field7882 >= arg1.field2657) {
            class596 var3 = class276.field3774.method136(arg1.field2626, false);
            int var4 = var3.field8614;
            if (var4 == -1) {
                arg1.field2626 = -1;
            } else {
                label367: {
                    class282 var5 = class195.field2367.method3273(var4, 0);
                    if (var3.field8600) {
                        if (var5.field3825 == 3) {
                            if (arg1.field2680 > 0 && class543.field7882 >= arg1.field2653 && class543.field7882 > arg1.field2638) {
                                arg1.field2626 = -1;
                                break label367;
                            }
                        } else if (var5.field3825 == 1 && arg1.field2680 > 0 && class543.field7882 >= arg1.field2653 && class543.field7882 > arg1.field2638) {
                            arg1.field2657 = class543.field7882 + 1;
                            break label367;
                        }
                    }
                    if (var5 == null || var5.field3827 == null) {
                        arg1.field2626 = -1;
                    } else {
                        if (arg1.field2644 < 0) {
                            arg1.field2644 = 0;
                            if (!arg1.field2597) {
                                class563.method3294((byte) -81, var5, arg1, 0);
                            }
                        }
                        arg1.field2619++;
                        if (arg1.field2644 < var5.field3827.length && arg1.field2619 > var5.field3840[arg1.field2644]) {
                            arg1.field2619 = 1;
                            arg1.field2644++;
                            if (!arg1.field2597) {
                                class563.method3294((byte) -83, var5, arg1, arg1.field2644);
                            }
                        }
                        if (var5.field3827.length <= arg1.field2644) {
                            if (var3.field8600) {
                                arg1.field2644 -= var5.field3821;
                                arg1.field2627++;
                                if (var5.field3829 <= arg1.field2627) {
                                    arg1.field2626 = -1;
                                } else if (arg1.field2644 < 0 || var5.field3827.length <= arg1.field2644) {
                                    arg1.field2626 = -1;
                                } else if (!arg1.field2597) {
                                    class563.method3294((byte) 50, var5, arg1, arg1.field2644);
                                }
                            } else {
                                arg1.field2626 = -1;
                            }
                        }
                        arg1.field2618 = arg1.field2644 + 1;
                        if (var5.field3827.length <= arg1.field2618) {
                            if (var3.field8600) {
                                arg1.field2618 -= var5.field3821;
                                if ((arg1.field2627 + 1) >= var5.field3829) {
                                    arg1.field2618 = -1;
                                } else if (arg1.field2618 < 0 || var5.field3827.length <= arg1.field2618) {
                                    arg1.field2618 = -1;
                                }
                            } else {
                                arg1.field2618 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field2629 != -1 && arg1.field2593 <= class543.field7882) {
            class596 var6 = class276.field3774.method136(arg1.field2629, false);
            int var7 = var6.field8614;
            if (var7 == -1) {
                arg1.field2629 = -1;
            } else {
                label370: {
                    class282 var8 = class195.field2367.method3273(var7, 0);
                    if (var6.field8600) {
                        if (var8.field3825 == 3) {
                            if (arg1.field2680 > 0 && arg1.field2653 <= class543.field7882 && class543.field7882 > arg1.field2638) {
                                arg1.field2629 = -1;
                                break label370;
                            }
                        } else if (var8.field3825 == 1 && arg1.field2680 > 0 && class543.field7882 >= arg1.field2653 && arg1.field2638 < class543.field7882) {
                            arg1.field2593 = class543.field7882 + 1;
                            break label370;
                        }
                    }
                    if (var8 == null || var8.field3827 == null) {
                        arg1.field2629 = -1;
                    } else {
                        if (arg1.field2605 < 0) {
                            arg1.field2605 = 0;
                            if (!arg1.field2597) {
                                class563.method3294((byte) 51, var8, arg1, 0);
                            }
                        }
                        arg1.field2661++;
                        if (var8.field3827.length > arg1.field2605 && arg1.field2661 > var8.field3840[arg1.field2605]) {
                            arg1.field2605++;
                            arg1.field2661 = 1;
                            if (!arg1.field2597) {
                                class563.method3294((byte) 120, var8, arg1, arg1.field2605);
                            }
                        }
                        if (arg1.field2605 >= var8.field3827.length) {
                            if (var6.field8600) {
                                arg1.field2643++;
                                arg1.field2605 -= var8.field3821;
                                if (var8.field3829 <= arg1.field2643) {
                                    arg1.field2629 = -1;
                                } else if (arg1.field2605 < 0 || var8.field3827.length <= arg1.field2605) {
                                    arg1.field2629 = -1;
                                } else if (!arg1.field2597) {
                                    class563.method3294((byte) -82, var8, arg1, arg1.field2605);
                                }
                            } else {
                                arg1.field2629 = -1;
                            }
                        }
                        arg1.field2648 = arg1.field2605 + 1;
                        if (arg1.field2648 >= var8.field3827.length) {
                            if (var6.field8600) {
                                arg1.field2648 -= var8.field3821;
                                if (var8.field3829 <= arg1.field2643 + 1) {
                                    arg1.field2648 = -1;
                                } else if (arg1.field2648 < 0 || var8.field3827.length <= arg1.field2648) {
                                    arg1.field2648 = -1;
                                }
                            } else {
                                arg1.field2648 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field2637 != -1 && arg1.field2596 <= 1) {
            class282 var9 = class195.field2367.method3273(arg1.field2637, 0);
            if (var9.field3825 == 3) {
                if (arg1.field2680 > 0 && class543.field7882 >= arg1.field2653 && arg1.field2638 < class543.field7882) {
                    arg1.field2637 = -1;
                    arg1.field2655 = null;
                }
            } else if (var9.field3825 == 1 && arg1.field2680 > 0 && class543.field7882 >= arg1.field2653 && class543.field7882 > arg1.field2638) {
                arg1.field2596 = 2;
            }
        }
        if (arg1.field2637 != -1 && arg1.field2596 == 0) {
            class282 var10 = class195.field2367.method3273(arg1.field2637, 0);
            if (var10 == null || var10.field3827 == null) {
                arg1.field2637 = -1;
                arg1.field2655 = null;
            } else {
                arg1.field2662++;
                if (arg1.field2613 < var10.field3827.length && var10.field3840[arg1.field2613] < arg1.field2662) {
                    arg1.field2613++;
                    arg1.field2662 = 1;
                    if (!arg1.field2597) {
                        class563.method3294((byte) 98, var10, arg1, arg1.field2613);
                    }
                }
                if (arg1.field2613 >= var10.field3827.length) {
                    arg1.field2613 -= var10.field3821;
                    arg1.field2665++;
                    if (var10.field3829 <= arg1.field2665) {
                        arg1.field2655 = null;
                        arg1.field2637 = -1;
                    } else if (arg1.field2613 < 0 || arg1.field2613 >= var10.field3827.length) {
                        arg1.field2655 = null;
                        arg1.field2637 = -1;
                    } else if (!arg1.field2597) {
                        class563.method3294((byte) 38, var10, arg1, arg1.field2613);
                    }
                }
                arg1.field2585 = arg1.field2613 + 1;
                if (arg1.field2585 >= var10.field3827.length) {
                    arg1.field2585 -= var10.field3821;
                    if ((arg1.field2665 + 1) >= var10.field3829) {
                        arg1.field2585 = -1;
                    } else if (arg1.field2585 < 0 || var10.field3827.length <= arg1.field2585) {
                        arg1.field2585 = -1;
                    }
                }
            }
        }
        if (arg1.field2596 > 0) {
            arg1.field2596--;
        }
        for (int var11 = 0; var11 < arg1.field2642.length; var11++) {
            class153 var12 = arg1.field2642[var11];
            if (var12 != null) {
                if (var12.field1889 > 0) {
                    var12.field1889--;
                } else {
                    class282 var13 = class195.field2367.method3273(var12.field1891, 0);
                    if (var13 == null || var13.field3827 == null) {
                        arg1.field2642[var11] = null;
                    } else {
                        var12.field1894++;
                        if (var12.field1886 < var13.field3827.length && var12.field1894 > var13.field3840[var12.field1886]) {
                            var12.field1886++;
                            var12.field1894 = 1;
                            if (!arg1.field2597) {
                                class563.method3294((byte) 48, var13, arg1, var12.field1886);
                            }
                        }
                        if (var12.field1886 >= var13.field3827.length) {
                            var12.field1885++;
                            var12.field1886 -= var13.field3821;
                            if (var12.field1885 >= var13.field3829) {
                                arg1.field2642[var11] = null;
                            } else if (var12.field1886 < 0 || var13.field3827.length <= var12.field1886) {
                                arg1.field2642[var11] = null;
                            } else if (!arg1.field2597) {
                                class563.method3294((byte) -96, var13, arg1, var12.field1886);
                            }
                        }
                        var12.field1892 = var12.field1886 + 1;
                        if (var13.field3827.length <= var12.field1892) {
                            var12.field1892 -= var13.field3821;
                            if (var12.field1885 + 1 >= var13.field3829) {
                                var12.field1892 = -1;
                            } else if (var12.field1892 < 0 || var12.field1892 >= var13.field3827.length) {
                                var12.field1892 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
