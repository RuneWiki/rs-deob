import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends class71 {

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Lof;")
    public class103 field69 = new class103();

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "Lnc;")
    public class93 field90 = new class93();

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "Lpd;")
    private class108 field73;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "Lwd;")
    public static class150 field81 = class2.method9(true, "@cr2@");

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "Lce;")
    public static class20 field87;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "Lff;")
    public static class42 field83;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "[I")
    public static int[] field76;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZII)I")
    public static final int method17(int arg0, boolean arg1, int arg2, int arg3) {
        field86++;
        int var4 = arg0 / arg3;
        int var5 = arg0 & arg3 - 1;
        int var6 = arg2 / arg3;
        int var7 = class142.method1075(var6, -1, var4);
        int var8 = arg2 & arg3 - 1;
        int var9 = class142.method1075(var6, -1, var4 + 1);
        int var10 = class142.method1075(var6 + 1, -1, var4);
        int var11 = class142.method1075(var6 + 1, -1, var4 + 1);
        int var12 = class9.method54(var5, var7, arg3, 98, var9);
        int var13 = class9.method54(var5, var10, arg3, -128, var11);
        return arg1 ? -42 : class9.method54(var8, var12, arg3, -103, var13);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILqc;BII[I)V")
    private final void method18(int arg0, class113 arg1, byte arg2, int arg3, int arg4, int[] arg5) {
        if (arg2 != -21) {
            return;
        }
        if ((this.field73.field2465[arg1.field2604] & 0x4) != 0 && arg1.field2621 < 0) {
            int var7 = this.field73.field2495[arg1.field2604] / class37.field1007;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field2613) / var7;
                if (arg3 < var8) {
                    arg1.field2613 += arg3 * var7;
                    break;
                }
                arg1.field2623.method19(arg5, arg0, var8);
                arg1.field2613 += var7 * var8 - 1048576;
                int var9 = class37.field1007 / 100;
                arg0 += var8;
                arg3 -= var8;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class117 var11 = arg1.field2623;
                if (this.field73.field2476[arg1.field2604] == 0) {
                    arg1.field2623 = class117.method847(arg1.field2625, var11.method839(), var11.method826(), var11.method840());
                } else {
                    arg1.field2623 = class117.method847(arg1.field2625, var11.method839(), 0, var11.method840());
                    this.field73.method757(arg1.field2614.field2146[arg1.field2615] < 0, arg1, (byte) 95);
                    arg1.field2623.method817(var9, var11.method826());
                }
                if (arg1.field2614.field2146[arg1.field2615] < 0) {
                    arg1.field2623.method838(-1);
                }
                var11.method820(var9);
                var11.method19(arg5, arg0, arg4 - arg0);
                if (var11.method827()) {
                    this.field90.method662(var11);
                }
            }
        }
        arg1.field2623.method19(arg5, arg0, arg3);
        field84++;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "([III)V")
    public final void method19(int[] arg0, int arg1, int arg2) {
        field72++;
        this.field90.method19(arg0, arg1, arg2);
        int var4 = arg1 + arg2;
        for (class113 var5 = (class113) this.field69.method702((byte) -118); var5 != null; var5 = (class113) this.field69.method698(-1610612736)) {
            if (!this.field73.method770(41, var5)) {
                int var6 = arg2;
                int var7 = arg1;
                do {
                    if (var6 <= var5.field2637) {
                        this.method18(var7, var5, (byte) -21, var6, var4, arg0);
                        var5.field2637 -= var6;
                        break;
                    }
                    this.method18(var7, var5, (byte) -21, var5.field2637, var4, arg0);
                    var6 -= var5.field2637;
                    var7 += var5.field2637;
                } while (!this.field73.method759(var5, (byte) 29));
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public final void method20(int arg0) {
        field78++;
        for (class113 var2 = (class113) this.field69.method702((byte) -126); var2 != null; var2 = (class113) this.field69.method698(-1610612736)) {
            if (!this.field73.method770(116, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2637) {
                        this.method30(var2, var3, 218);
                        var2.field2637 -= var3;
                        break;
                    }
                    this.method30(var2, var2.field2637, 218);
                    var3 -= var2.field2637;
                } while (!this.field73.method759(var2, (byte) 29));
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()I")
    public final int method21() {
        field85++;
        return 0;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public static final void method22(int arg0) {
        if (arg0 != -12780) {
            method22(-10);
        }
        field79++;
        if (class58.field1496 != null) {
            class58.field1496.method121((byte) 82);
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "()Lkb;")
    public final class71 method23() {
        field74++;
        class113 var1 = (class113) this.field69.method702((byte) -127);
        if (var1 == null) {
            return null;
        } else if (var1.field2623 == null) {
            return this.method29();
        } else {
            return var1.field2623;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
    public static void method24(boolean arg0) {
        field76 = null;
        field81 = null;
        field83 = null;
        if (arg0) {
            method28(true);
        }
        field87 = null;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
    public static final void method25(byte arg0) {
        if (arg0 <= -99) {
            field71++;
            class15.field392.method431(0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)Lcf;")
    public static final class21 method26(byte arg0, int arg1) {
        if (arg0 <= 84) {
            field76 = null;
        }
        field88++;
        class21 var2 = (class21) class68.field1720.method440((long) arg1, 26976);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class24.field678.method315(arg1, true, 10);
        class21 var4 = new class21();
        var4.field598 = arg1;
        if (var3 != null) {
            var4.method160((byte) 91, new class148(var3));
        }
        var4.method162((byte) 84);
        if (var4.field572 != -1) {
            var4.method152(method26((byte) 90, var4.field555), method26((byte) 124, var4.field572), (byte) 73);
        }
        if (!class99.field2266 && var4.field591) {
            var4.field558 = class118.field2687;
            var4.field584 = 0;
            var4.field599 = null;
            var4.field582 = null;
        }
        class68.field1720.method433(var4, (long) arg1, (byte) -122);
        return var4;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBIIII)V")
    public static final void method27(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class111.field2548.method938(arg0, arg3, arg4);
        if (arg1 != 93) {
            field81 = null;
        }
        if (var6 != 0) {
            int var7 = class111.field2548.method904(arg0, arg3, arg4, var6);
            int var8 = var7 & 0x1F;
            int var9 = arg5;
            int var10 = var7 >> 6 & 0x3;
            int[] var11 = class101.field2300.field1377;
            int var12 = (52736 - arg4 * 512) * 4 + arg3 * 4 + 24624;
            if (var6 > 0) {
                var9 = arg2;
            }
            int var13 = var6 >> 14 & 0x7FFF;
            class61 var14 = class20.method145(var13, (byte) -26);
            if (var14.field1583 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var10 == 0) {
                        var11[var12] = var9;
                        var11[var12 + 512] = var9;
                        var11[var12 + 1024] = var9;
                        var11[var12 + 1536] = var9;
                    } else if (var10 == 1) {
                        var11[var12] = var9;
                        var11[var12 + 1] = var9;
                        var11[var12 + 2] = var9;
                        var11[var12 + 3] = var9;
                    } else if (var10 == 2) {
                        var11[var12 + 3] = var9;
                        var11[var12 + 515] = var9;
                        var11[var12 + 3 + 1024] = var9;
                        var11[var12 + 1536 + 3] = var9;
                    } else if (var10 == 3) {
                        var11[var12 + 1536] = var9;
                        var11[var12 + 1536 + 1] = var9;
                        var11[var12 + 1536 + 2] = var9;
                        var11[var12 + 3 + 1536] = var9;
                    }
                }
                if (var8 == 3) {
                    if (var10 == 0) {
                        var11[var12] = var9;
                    } else if (var10 == 1) {
                        var11[var12 + 3] = var9;
                    } else if (var10 == 2) {
                        var11[var12 + 1539] = var9;
                    } else if (var10 == 3) {
                        var11[var12 + 1536] = var9;
                    }
                }
                if (var8 == 2) {
                    if (var10 == 3) {
                        var11[var12] = var9;
                        var11[var12 + 512] = var9;
                        var11[var12 + 1024] = var9;
                        var11[var12 + 1536] = var9;
                    } else if (var10 == 0) {
                        var11[var12] = var9;
                        var11[var12 + 1] = var9;
                        var11[var12 + 2] = var9;
                        var11[var12 + 3] = var9;
                    } else if (var10 == 1) {
                        var11[var12 + 3] = var9;
                        var11[var12 + 3 + 512] = var9;
                        var11[var12 + 3 + 1024] = var9;
                        var11[var12 + 3 + 1536] = var9;
                    } else if (var10 == 2) {
                        var11[var12 + 1536] = var9;
                        var11[var12 + 1536 + 1] = var9;
                        var11[var12 + 2 + 1536] = var9;
                        var11[var12 + 1536 + 3] = var9;
                    }
                }
            } else {
                class114 var15 = class142.field3443[var14.field1583];
                if (var15 != null) {
                    int var16 = (var14.field1563 * 4 - var15.field2647) / 2;
                    int var17 = (var14.field1571 * 4 - var15.field2653) / 2;
                    var15.method803(arg3 * 4 + var17 + 48, (-arg4 + 104 + -var14.field1563) * 4 + var16 + 48);
                }
            }
        }
        int var18 = class111.field2548.method935(arg0, arg3, arg4);
        if (var18 != 0) {
            int var19 = class111.field2548.method904(arg0, arg3, arg4, var18);
            int var20 = var19 >> 6 & 0x3;
            int var21 = var19 & 0x1F;
            int var22 = var18 >> 14 & 0x7FFF;
            class61 var23 = class20.method145(var22, (byte) -14);
            if (var23.field1583 != -1) {
                class114 var27 = class142.field3443[var23.field1583];
                if (var27 != null) {
                    int var28 = (var23.field1563 * 4 - var27.field2647) / 2;
                    int var29 = (var23.field1571 * 4 - var27.field2653) / 2;
                    var27.method803(arg3 * 4 + var29 + 48, (-arg4 + 104 + -var23.field1563) * 4 + var28 + 48);
                }
            } else if (var21 == 9) {
                int[] var24 = class101.field2300.field1377;
                int var25 = arg3 * 4 + (103 - arg4) * 512 * 4 + 24624;
                int var26 = 15658734;
                if (var18 > 0) {
                    var26 = 15597568;
                }
                if (var20 == 0 || var20 == 2) {
                    var24[var25 + 1536] = var26;
                    var24[var25 + 1 + 1024] = var26;
                    var24[var25 + 514] = var26;
                    var24[var25 + 3] = var26;
                } else {
                    var24[var25] = var26;
                    var24[var25 + 512 + 1] = var26;
                    var24[var25 + 2 + 1024] = var26;
                    var24[var25 + 1536 + 3] = var26;
                }
            }
        }
        int var30 = class111.field2548.method902(arg0, arg3, arg4);
        if (var30 != 0) {
            int var31 = var30 >> 14 & 0x7FFF;
            class61 var32 = class20.method145(var31, (byte) -65);
            if (var32.field1583 != -1) {
                class114 var33 = class142.field3443[var32.field1583];
                if (var33 != null) {
                    int var34 = (var32.field1571 * 4 - var33.field2653) / 2;
                    int var35 = (var32.field1563 * 4 - var33.field2647) / 2;
                    var33.method803(arg3 * 4 + var34 + 48, (-var32.field1563 + 104 - arg4) * 4 + (48 - -var35));
                }
            }
        }
        field89++;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V")
    public static final void method28(boolean arg0) {
        field75++;
        class80 var1 = class83.field1986;
        synchronized (class83.field1986) {
            class143.field3466 = class137.field3208;
            if (arg0) {
                method22(-80);
            }
            class111.field2557 = class22.field638;
            class113.field2602 = class86.field2037;
            client.field618 = class72.field1802;
            class14.field370 = class88.field2042;
            class131.field3098 = class95.field2210;
            class106.field2390 = class10.field244;
            class72.field1802 = 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()Lkb;")
    public final class71 method29() {
        field77++;
        class113 var1;
        do {
            var1 = (class113) this.field69.method698(-1610612736);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2623 == null);
        return var1.field2623;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lpd;)V")
    public class4(class108 arg0) {
        this.field73 = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lqc;II)V")
    private final void method30(class113 arg0, int arg1, int arg2) {
        if ((this.field73.field2465[arg0.field2604] & 0x4) != 0 && arg0.field2621 < 0) {
            int var4 = this.field73.field2495[arg0.field2604] / class37.field1007;
            int var5 = (var4 + 1048575 - arg0.field2613) / var4;
            arg0.field2613 = arg1 * var4 + arg0.field2613 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field73.field2476[arg0.field2604] == 0) {
                    arg0.field2623 = class117.method847(arg0.field2625, arg0.field2623.method839(), arg0.field2623.method826(), arg0.field2623.method840());
                } else {
                    arg0.field2623 = class117.method847(arg0.field2625, arg0.field2623.method839(), 0, arg0.field2623.method840());
                    this.field73.method757(arg0.field2614.field2146[arg0.field2615] < 0, arg0, (byte) 118);
                }
                if (arg0.field2614.field2146[arg0.field2615] < 0) {
                    arg0.field2623.method838(-1);
                }
                arg1 = arg0.field2613 / var4;
            }
        }
        field70++;
        if (arg2 != 218) {
            field87 = null;
        }
        arg0.field2623.method20(arg1);
    }
}
