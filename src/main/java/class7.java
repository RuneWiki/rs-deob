import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class7 extends class34 {

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
    private int field80 = 32768;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "Ljava/lang/String;")
    public static String field83 = "K";

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "Ljk;")
    public static class297 field90 = null;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field88 = "slide:";

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "Ljava/lang/String;")
    public static String field84 = "Loading title screen - ";

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field91 = "scroll:";

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        ++field89;
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field604 = ~arg2.method407(arg0 ^ 249) == -2;
            }
        } else {
            this.field80 = arg2.method423(-92) << 4;
        }
        if (arg0 != 6) {
            field88 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
    public static final void method60(int arg0) {
        ++field82;
        if (!class275.field4244) {
            if (!class117.field1767) {
                class101.field1482 += (-class101.field1482 + 24.0F) / 2.0F;
            } else {
                class89.field1349 = (float) (-128 & (int) class89.field1349 - -191);
            }
            class36.field641 = true;
            class275.field4244 = true;
            if (arg0 != 8) {
                field90 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
    public static void method61(int arg0) {
        field90 = null;
        field91 = null;
        field83 = null;
        field84 = null;
        field88 = null;
        int var1 = -92 % ((-30 - arg0) / 42);
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
    public final void method62(int arg0) {
        class189.method1255((byte) 94);
        ++field85;
        int var2 = -98 / ((-2 - arg0) / 43);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)V")
    public static final void method63(int arg0, int arg1, int arg2) {
        if (class226.field3527 != arg0) {
            class112.field1716 = new int[arg0];
            for (int var3 = 0; ~arg0 < ~var3; ++var3) {
                class112.field1716[var3] = (var3 << 12) / arg0;
            }
            class226.field3527 = arg0;
            class23.field379 = arg0 * 32;
            class167.field2457 = arg0 + -1;
        }
        ++field79;
        if (class259.field3965 != arg2) {
            if (~class226.field3527 != ~arg2) {
                class199.field2985 = new int[arg2];
                for (int var4 = 0; ~var4 > ~arg2; ++var4) {
                    class199.field2985[var4] = (var4 << 12) / arg2;
                }
            } else {
                class199.field2985 = class112.field1716;
            }
            class201.field3014 = arg2 + -1;
            class259.field3965 = arg2;
        }
        if (arg1 != 32) {
            field84 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        if (arg0 <= 75) {
            this.field80 = -35;
        }
        ++field87;
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            int[] var4 = this.method230(arg1, -15337, 1);
            int[] var5 = this.method230(arg1, -15337, 2);
            for (int var6 = 0; var6 < class226.field3527; ++var6) {
                int var7 = var5[var6] * this.field80 >> 12;
                int var8 = (var4[var6] & 4081) >> 4;
                int var9 = class21.field356[var8] * var7 >> 12;
                int var10 = var6 - -(var9 >> 12) & class167.field2457;
                int var11 = class87.field1321[var8] * var7 >> 12;
                int var12 = class201.field3014 & (var11 >> 12) + arg1;
                int[] var13 = this.method230(var12, -15337, 0);
                var3[var6] = var13[var10];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(III)Luh;")
    public static final class67 method64(int arg0, int arg1, int arg2) {
        class201 var3 = class3.field40[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3025;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)V")
    public static final void method65(byte arg0) {
        ++field81;
        int var1 = class173.field2543.method1544(-35, 8);
        if (class266.field4155 > var1) {
            for (int var2 = var1; ~var2 > ~class266.field4155; ++var2) {
                class83.field1279[class213.field3277++] = class205.field3068[var2];
            }
        }
        if (var1 > class266.field4155) {
            throw new RuntimeException("gppov1");
        } else {
            class266.field4155 = 0;
            if (arg0 == -115) {
                for (int var3 = 0; ~var3 > ~var1; ++var3) {
                    int var4 = class205.field3068[var3];
                    class224 var5 = class166.field2438[var4];
                    int var6 = class173.field2543.method1544(-53, 1);
                    if (~var6 == -1) {
                        class205.field3068[class266.field4155++] = var4;
                        var5.field486 = class120.field1794;
                    } else {
                        int var7 = class173.field2543.method1544(-28, 2);
                        if (~var7 == -1) {
                            class205.field3068[class266.field4155++] = var4;
                            var5.field486 = class120.field1794;
                            class148.field2149[class165.field2426++] = var4;
                        } else if (~var7 == -2) {
                            class205.field3068[class266.field4155++] = var4;
                            var5.field486 = class120.field1794;
                            int var8 = class173.field2543.method1544(arg0 ^ -18, 3);
                            var5.method164(1, arg0 ^ -18479, var8);
                            int var9 = class173.field2543.method1544(73, 1);
                            if (var9 == 1) {
                                class148.field2149[class165.field2426++] = var4;
                            }
                        } else if (var7 == 2) {
                            class205.field3068[class266.field4155++] = var4;
                            var5.field486 = class120.field1794;
                            if (class173.field2543.method1544(-58, 1) != 1) {
                                int var10 = class173.field2543.method1544(-79, 3);
                                var5.method164(0, 18524, var10);
                            } else {
                                int var11 = class173.field2543.method1544(-116, 3);
                                var5.method164(2, arg0 ^ -18479, var11);
                                int var12 = class173.field2543.method1544(89, 3);
                                var5.method164(2, 18524, var12);
                            }
                            int var13 = class173.field2543.method1544(-128, 1);
                            if (var13 == 1) {
                                class148.field2149[class165.field2426++] = var4;
                            }
                        } else if (~var7 == -4) {
                            class83.field1279[class213.field3277++] = var4;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field86;
        int[][] var3 = super.field618.method91(-127, arg1);
        int var4 = -118 % ((arg0 - -54) / 44);
        if (super.field618.field211) {
            int[] var5 = this.method230(arg1, -15337, 1);
            int[] var6 = this.method230(arg1, -15337, 2);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class226.field3527; ++var10) {
                int var11 = (1044567 & var5[var10] * 255) >> 12;
                int var12 = var6[var10] * this.field80 >> 12;
                int var13 = class21.field356[var11] * var12 >> 12;
                int var14 = class87.field1321[var11] * var12 >> 12;
                int var15 = class201.field3014 & (var14 >> 12) + arg1;
                int var16 = (var13 >> 12) + var10 & class167.field2457;
                int[][] var17 = this.method231(var15, (byte) 71, 0);
                var8[var10] = var17[0][var16];
                var7[var10] = var17[1][var16];
                var9[var10] = var17[2][var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(III)Z")
    public static final boolean method66(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class54.field899; ++var3) {
            class30 var4 = class106.field1567[var3];
            if (var4.field558 == 1) {
                int var5 = var4.field543 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field544 * var5 >> 8) + var4.field549;
                    int var7 = (var4.field554 * var5 >> 8) + var4.field545;
                    int var8 = (var4.field555 * var5 >> 8) + var4.field547;
                    int var9 = (var4.field550 * var5 >> 8) + var4.field563;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field558 == 2) {
                int var10 = arg0 - var4.field543;
                if (var10 > 0) {
                    int var11 = (var4.field544 * var10 >> 8) + var4.field549;
                    int var12 = (var4.field554 * var10 >> 8) + var4.field545;
                    int var13 = (var4.field555 * var10 >> 8) + var4.field547;
                    int var14 = (var4.field550 * var10 >> 8) + var4.field563;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field558 == 3) {
                int var15 = var4.field549 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field548 * var15 >> 8) + var4.field543;
                    int var17 = (var4.field556 * var15 >> 8) + var4.field560;
                    int var18 = (var4.field555 * var15 >> 8) + var4.field547;
                    int var19 = (var4.field550 * var15 >> 8) + var4.field563;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field558 == 4) {
                int var20 = arg2 - var4.field549;
                if (var20 > 0) {
                    int var21 = (var4.field548 * var20 >> 8) + var4.field543;
                    int var22 = (var4.field556 * var20 >> 8) + var4.field560;
                    int var23 = (var4.field555 * var20 >> 8) + var4.field547;
                    int var24 = (var4.field550 * var20 >> 8) + var4.field563;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field558 == 5) {
                int var25 = arg1 - var4.field547;
                if (var25 > 0) {
                    int var26 = (var4.field548 * var25 >> 8) + var4.field543;
                    int var27 = (var4.field556 * var25 >> 8) + var4.field560;
                    int var28 = (var4.field544 * var25 >> 8) + var4.field549;
                    int var29 = (var4.field554 * var25 >> 8) + var4.field545;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class7() {
        super(3, false);
    }
}
