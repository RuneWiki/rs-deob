import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class225 implements Runnable {

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lqd;")
    private class44 field3855 = new class44();

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public int field3857 = 0;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Z")
    private boolean field3858 = false;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Ljava/lang/Thread;")
    private Thread field3859;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Ljf;")
    public static class229 field3841 = class212.method1457((byte) 113, "Chargement en cours)3 Veuillez patienter)3");

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field3848 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field3852 = 0;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Ljf;")
    public static class229 field3843 = class212.method1457((byte) 107, "welle:");

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field3850 = -1;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lhc;")
    public static class175 field3845;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 6)
    public static void method1547(int arg0) {
        if (arg0 != 0) {
            field3852 = -88;
        }
        field3843 = null;
        field3841 = null;
        field3845 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZB)V", line = 21)
    public static final void method1548(boolean arg0, byte arg1) {
        class66.field1123 = 0;
        class19.field294 = (short[][][]) null;
        class48.field869 = null;
        class82.field1515 = (byte[][][]) null;
        class270.field4639 = (int[][][]) null;
        class185.field3228 = (int[][][]) null;
        if (arg0 && class264.field4555 != null) {
            class100.field1763 = class264.field4555.field2723;
        } else {
            class100.field1763 = null;
        }
        class80.field1463 = (byte[][][]) null;
        class264.field4555 = null;
        class329.field5589 = null;
        class91.field1666 = (byte[][][]) null;
        class144.field2517 = (byte[][][]) null;
        class8.field82 = (byte[][][]) null;
        class324.field5473.method2073(true);
        class84.field1615 = null;
        class8.field84 = null;
        class66.field1124 = null;
        field3839++;
        class167.field2872 = null;
        class124.field2183 = null;
        class52.field921 = null;
        if (arg1 != -20) {
            return;
        }
        class173.field3030 = null;
        class241.field4253 = null;
        class137.field2377 = null;
        class235.field4069 = null;
        class156.field2672 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLek;I)[Lrm;", line = 73)
    public static final class248[] method1549(byte arg0, class185 arg1, int arg2) {
        if (arg0 != 69) {
            field3850 = -114;
        }
        field3844++;
        return class50.method414(arg1, 102, arg2) ? class313.method2120((byte) -49) : null;
    }

    @OriginalMember(owner = "client!kf", name = "run", descriptor = "()V", line = 87)
    public final void run() {
        while (!this.field3858) {
            class44 var1 = this.field3855;
            class38 var2;
            synchronized (this.field3855) {
                var2 = (class38) this.field3855.method372(3791);
                if (var2 == null) {
                    try {
                        this.field3855.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3857--;
            }
            try {
                if (var2.field705 == 2) {
                    var2.field707.method733(var2.field709.length, var2.field709, (byte) -25, (int) var2.field4845);
                } else if (var2.field705 == 3) {
                    var2.field709 = var2.field707.method734(38, (int) var2.field4845);
                }
            } catch (Exception var6) {
                class201.method1407(1, (String) null, var6);
            }
            var2.field4499 = false;
        }
        field3856++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILek;Lek;)I", line = 137)
    public static final int method1550(int arg0, class185 arg1, class185 arg2) {
        if (arg0 != -26924) {
            method1548(true, (byte) 84);
        }
        field3849++;
        int var3 = 0;
        if (arg1.method1289(class195.field3392, arg0 ^ 0x6962)) {
            var3++;
        }
        if (arg1.method1289(class56.field998, -61)) {
            var3++;
        }
        if (arg1.method1289(class1.field4, -117)) {
            var3++;
        }
        if (arg2.method1289(class195.field3392, -90)) {
            var3++;
        }
        if (arg2.method1289(class56.field998, -113)) {
            var3++;
        }
        if (arg2.method1289(class1.field4, arg0 + 26850)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILvj;)Lsg;", line = 171)
    public final class38 method1551(int arg0, int arg1, class107 arg2) {
        field3846++;
        class38 var4 = new class38();
        var4.field705 = 1;
        class44 var5 = this.field3855;
        synchronized (this.field3855) {
            if (arg1 != 4) {
                field3845 = (class175) null;
            }
            class38 var6 = (class38) this.field3855.method383(false);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field4845 && var6.field707 == arg2 && var6.field705 == 2) {
                    var4.field709 = var6.field709;
                    var4.field4499 = false;
                    return var4;
                }
                var6 = (class38) this.field3855.method382(arg1 + 44);
            }
        }
        var4.field709 = arg2.method734(arg1 ^ 0x12, arg0);
        var4.field4494 = true;
        var4.field4499 = false;
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lvj;II[B)Lsg;", line = 212)
    public final class38 method1552(class107 arg0, int arg1, int arg2, byte[] arg3) {
        field3840++;
        class38 var5 = new class38();
        var5.field705 = 2;
        if (arg1 != -7521) {
            return (class38) null;
        }
        var5.field709 = arg3;
        var5.field707 = arg0;
        var5.field4494 = false;
        var5.field4845 = (long) arg2;
        this.method1557(var5, false);
        return var5;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V", line = 231)
    public final void method1553(int arg0) {
        this.field3858 = true;
        class44 var2 = this.field3855;
        synchronized (this.field3855) {
            this.field3855.notifyAll();
            if (arg0 != 14724) {
                field3852 = 39;
            }
        }
        field3853++;
        try {
            this.field3859.join();
        } catch (InterruptedException var5) {
        }
        this.field3859 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIIIIII)V", line = 251)
    public static final void method1554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3847++;
        int var11 = arg5 - arg6;
        if (class113.field2037 > arg5) {
            var11++;
        }
        int var12 = arg3 - arg9;
        if (arg3 < class254.field4432) {
            var12++;
        }
        int var10000;
        for (int var13 = arg8; var13 < var11; var13++) {
            int var14 = arg7 * var13 + arg10 >> 16;
            int var15 = (var13 + 1) * arg7 + arg10 >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg6 + var13 >> 6;
                if (var17 >= 0 && var17 <= (class185.field3228.length - 1)) {
                    int var18 = arg4 + var14;
                    int var19 = arg4 + var15;
                    int[][] var20 = class185.field3228[var17];
                    byte[][] var21 = class82.field1515[var17];
                    byte[][] var22 = class80.field1463[var17];
                    byte[][] var23 = class144.field2517[var17];
                    byte[][] var24 = class8.field82[var17];
                    byte[][] var25 = class91.field1666[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg0 * var26 + arg2 >> 16;
                        int var28 = (var26 + 1) * arg0 + arg2 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg1 + var28;
                            int var31 = arg1 + var27;
                            int var32 = arg9 + var26 >> 6;
                            int var33 = arg9 + var26 & 0x3F;
                            int var34 = arg6 + var13 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var32 < 0 || var20.length - 1 < var32 || var20[var32] == null) {
                                if (class264.field4555.field2741 != -1) {
                                    var36 = class264.field4555.field2741;
                                } else if ((arg6 + var13 & 0x4) == (arg9 + var26 & 0x4)) {
                                    var36 = class48.field869[class34.field653 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var32 < 0 || (var20.length - 1) < var32) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class114.method803(var18, var31, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var20[var32][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var23[var32] == null ? 0 : class48.field869[var23[var32][var35] & 0xFF];
                            int var38 = var22[var32] == null ? 0 : class48.field869[var22[var32][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class114.method803(var18, var31, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var21[var32] == null ? 0 : var21[var32][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class114.method803(var18, var31, var16, var29, var37);
                                    } else {
                                        class44.method386(var37, var18, var36, class114.field2050, var29, true, var39 & 0x3, var40 >> 2, var31, var16, (byte) -28);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var24[var32][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class114.method803(var18, var31, var16, var29, var38);
                                    }
                                    class44.method386(var38, var18, 0, class114.field2050, var29, var37 == 0, var41 & 0x3, var42 >> 2, var31, var16, (byte) 97);
                                }
                            }
                            if (var25[var32] != null) {
                                int var43 = var25[var32][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var18;
                                    } else {
                                        var44 = var19 - 1;
                                    }
                                    int var45;
                                    if (var29 == 1) {
                                        var45 = var31;
                                    } else {
                                        var45 = var30 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var43 -= 4;
                                        var46 = 13369344;
                                    }
                                    if (var43 == 1) {
                                        class114.method810(var18, var31, var29, var46);
                                    } else if (var43 == 2) {
                                        class114.method815(var18, var31, var16, var46);
                                    } else if (var43 == 3) {
                                        class114.method810(var44, var31, var29, var46);
                                    } else if (var43 == 4) {
                                        class114.method815(var18, var45, var16, var46);
                                    } else if (var43 == 9) {
                                        class114.method810(var18, var31, var29, 16777215);
                                        class114.method815(var18, var31, var16, var46);
                                    } else if (var43 == 10) {
                                        class114.method810(var44, var31, var29, 16777215);
                                        class114.method815(var18, var31, var16, var46);
                                    } else if (var43 == 11) {
                                        class114.method810(var44, var31, var29, 16777215);
                                        class114.method815(var18, var45, var16, var46);
                                    } else if (var43 == 12) {
                                        class114.method810(var18, var31, var29, 16777215);
                                        class114.method815(var18, var45, var16, var46);
                                    } else if (var43 == 17) {
                                        class114.method815(var18, var31, 1, var46);
                                    } else if (var43 == 18) {
                                        class114.method815(var44, var31, 1, var46);
                                    } else if (var43 == 19) {
                                        class114.method815(var44, var45, 1, var46);
                                    } else if (var43 == 20) {
                                        class114.method815(var18, var45, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class114.method815(var18 + var47, -var47 + var45, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class114.method815(var18 + var48, var31 - -var48, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var49 = arg4 + var14;
                    var10000 = arg4 + var15;
                    for (int var51 = 0; var51 < var12; var51++) {
                        int var52 = (arg2 + (arg0 * var51) >> 16) + arg1;
                        int var53 = ((var51 + 1) * arg0 + arg2 >> 16) + arg1;
                        int var54 = var53 - var52;
                        int var55;
                        if (class264.field4555.field2741 != -1) {
                            var55 = class264.field4555.field2741;
                        } else if ((var13 + arg6 & 0x4) == (arg9 + var51 & 0x4)) {
                            var55 = class48.field869[class34.field653 + 1];
                        } else {
                            var55 = 4936552;
                        }
                        if (var55 == 0) {
                            var55 = 1;
                        }
                        class114.method803(var49, var52, var16, var54, var55);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < var11 + 2; var56++) {
            int var57 = arg10 + ((var56 + 1) * arg7) >> 16;
            int var58 = arg10 + (arg7 * var56) >> 16;
            int var59 = var57 - var58;
            if (var59 > 0) {
                int var60 = arg4 + var58;
                var10000 = arg4 + var57;
                int var62 = arg6 + var56 >> 6;
                if (var62 >= 0 && var62 <= class19.field294.length - 1) {
                    short[][] var63 = class19.field294[var62];
                    for (int var64 = -2; var64 < var12 + 2; var64++) {
                        int var65 = arg0 * var64 + arg2 >> 16;
                        int var66 = (var64 + 1) * arg0 + arg2 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            var10000 = arg1 + var66;
                            int var69 = arg1 + var65;
                            int var70 = var64 + arg9 >> 6;
                            if (var70 >= 0 && var70 <= (var63.length - 1)) {
                                int var71 = ((arg9 + var64 & 0x3F) << 6) + (arg6 + var56 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71] & 0x3FFF;
                                    int var73 = (var63[var70][var71] & 0xF288) >> 14;
                                    if (var72 != 0) {
                                        if (var73 == 0) {
                                            int var83 = class188.field3287[var72 - 1].field2297 * var67 / 4;
                                            int var84 = class188.field3287[var72 - 1].field2298 * var59 / 4;
                                            if (var84 != 0 && var83 != 0) {
                                                int var85 = class188.field3287[var72 - 1].field2299 * var67 / 4;
                                                class188.field3287[var72 - 1].method1793(var60, var69 - var85, var84, var83);
                                            }
                                        } else if (var73 == 1) {
                                            int var80 = class157.field2695[var72 - 1].field2298 * var59 / 4;
                                            int var81 = class157.field2695[var72 - 1].field2297 * var67 / 4;
                                            if (var80 != 0 && var81 != 0) {
                                                int var82 = class157.field2695[var72 - 1].field2299 * var67 / 4;
                                                class157.field2695[var72 - 1].method1793(var60, var69 - var82, var80, var81);
                                            }
                                        } else if (var73 == 2) {
                                            int var74 = class206.field3601[var72 - 1].field2297 * var67 / 4;
                                            int var75 = class206.field3601[var72 - 1].field2298 * var59 / 4;
                                            if (var75 != 0 && var74 != 0) {
                                                int var76 = class206.field3601[var72 - 1].field2299 * var67 / 4;
                                                class206.field3601[var72 - 1].method1793(var60, var69 - var76, var75, var74);
                                            }
                                        } else if (var73 == 3) {
                                            int var77 = class62.field1061[var72 - 1].field2298 * var59 / 4;
                                            int var78 = class62.field1061[var72 - 1].field2297 * var67 / 4;
                                            if (var77 != 0 && var78 != 0) {
                                                int var79 = class62.field1061[var72 - 1].field2299 * var67 / 4;
                                                class62.field1061[var72 - 1].method1793(var60, var69 - var79, var77, var78);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V", line = 691)
    public static final void method1555(int arg0, int arg1) {
        field3851++;
        if (arg0 != 30215) {
            method1550(-68, (class185) null, (class185) null);
        }
        class122 var2 = class323.method2175(4, arg1, -25873);
        var2.method865(-51);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLvj;)Lsg;", line = 706)
    public final class38 method1556(int arg0, byte arg1, class107 arg2) {
        field3854++;
        class38 var4 = new class38();
        var4.field707 = arg2;
        if (arg1 < 19) {
            this.method1552((class107) null, 84, -57, (byte[]) null);
        }
        var4.field705 = 3;
        var4.field4845 = (long) arg0;
        var4.field4494 = false;
        this.method1557(var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 751)
    public class225() {
        class231 var1 = class215.field3689.method1373(this, 4, 5);
        while (var1.field4011 == 0) {
            class235.method1675((byte) -22, 10L);
        }
        if (var1.field4011 == 2) {
            throw new RuntimeException();
        }
        this.field3859 = (Thread) var1.field4009;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lsg;Z)V", line = 733)
    private final void method1557(class38 arg0, boolean arg1) {
        class44 var3 = this.field3855;
        synchronized (this.field3855) {
            this.field3855.method375(42, arg0);
            if (arg1) {
                field3843 = (class229) null;
            }
            this.field3857++;
            this.field3855.notifyAll();
        }
        field3842++;
    }
}
