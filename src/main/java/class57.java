import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class57 extends class215 {

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    private int field726 = 1024;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    private int field733 = 1024;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    private int field739 = 0;

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
    private int field740 = 1024;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "I")
    private int field741 = 0;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
    private int field737 = 1024;

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "I")
    private int field743 = 2048;

    @OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
    private int field745 = 819;

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "I")
    private int field744 = 409;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "Lte;")
    public static class244 field730 = new class244(64);

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    private int field728;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "Leh;")
    public static class137 field732;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V")
    public static final void method328(int arg0) {
        ++field736;
        int var1 = class41.field507 * 128 + 64;
        int var2 = class191.field3085 * 128 + 64;
        int var3 = class166.method1148(class244.field4011, var1, var2, (byte) -121) - class222.field3572;
        if (arg0 >= -99) {
            method328(103);
        }
        if (class276.field4405 >= 100) {
            class74.field932 = class41.field507 * 128 + 64;
            class36.field465 = class191.field3085 * 128 + 64;
            class252.field4114 = class166.method1148(class244.field4011, class74.field932, class36.field465, (byte) -114) + -class222.field3572;
        } else {
            if (~var2 < ~class36.field465) {
                class36.field465 += (-class36.field465 + var2) * class276.field4405 / 1000 + class144.field2286;
                if (class36.field465 > var2) {
                    class36.field465 = var2;
                }
            }
            if (var2 < class36.field465) {
                class36.field465 -= class144.field2286 - -((class36.field465 - var2) * class276.field4405 / 1000);
                if (class36.field465 < var2) {
                    class36.field465 = var2;
                }
            }
            if (~var1 < ~class74.field932) {
                class74.field932 += (-class74.field932 + var1) * class276.field4405 / 1000 + class144.field2286;
                if (~class74.field932 < ~var1) {
                    class74.field932 = var1;
                }
            }
            if (~class252.field4114 > ~var3) {
                class252.field4114 += class144.field2286 - -((var3 - class252.field4114) * class276.field4405 / 1000);
                if (class252.field4114 > var3) {
                    class252.field4114 = var3;
                }
            }
            if (class74.field932 > var1) {
                class74.field932 -= (class74.field932 - var1) * class276.field4405 / 1000 + class144.field2286;
                if (var1 > class74.field932) {
                    class74.field932 = var1;
                }
            }
            if (~class252.field4114 < ~var3) {
                class252.field4114 -= (-var3 + class252.field4114) * class276.field4405 / 1000 + class144.field2286;
                if (class252.field4114 < var3) {
                    class252.field4114 = var3;
                }
            }
        }
        int var4 = class148.field2322 * 128 + 64;
        int var5 = class67.field849 * 128 + 64;
        int var6 = class166.method1148(class244.field4011, var4, var5, (byte) 123) - class288.field4597;
        int var7 = -class74.field932 + var4;
        int var8 = var6 - class252.field4114;
        int var9 = var5 - class36.field465;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = 2047 & (int) (325.949D * Math.atan2((double) var8, (double) var10));
        int var12 = 2047 & (int) (-325.949D * Math.atan2((double) var7, (double) var9));
        if (~var11 > -129) {
            var11 = 128;
        }
        int var13 = var12 - class23.field311;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (~var11 < ~class242.field3986) {
            class242.field3986 += class292.field4634 - -((var11 - class242.field3986) * class269.field4299 / 1000);
            if (~class242.field3986 < ~var11) {
                class242.field3986 = var11;
            }
        }
        if (~class242.field3986 < ~var11) {
            class242.field3986 -= (class242.field3986 - var11) * class269.field4299 / 1000 + class292.field4634;
            if (class242.field3986 < var11) {
                class242.field3986 = var11;
            }
        }
        if (var13 > 0) {
            class23.field311 += class269.field4299 * var13 / 1000 + class292.field4634;
            class23.field311 &= 2047;
        }
        if (var13 < 0) {
            class23.field311 -= -var13 * class269.field4299 / 1000 + class292.field4634;
            class23.field311 &= 2047;
        }
        int var14 = -class23.field311 + var12;
        if (~var14 < -1025) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && ~var13 < -1 || var14 > 0 && ~var13 > -1) {
            class23.field311 = var12;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class57() {
        super(0, true);
    }

    @OriginalMember(owner = "client!g", name = "h", descriptor = "(I)V")
    public static final void method329(int arg0) {
        ++field731;
        if (arg0 == 1000) {
            int var1 = class73.field916;
            int var2 = class103.field1392;
            int var3 = class190.field3074;
            int var4 = 6116423;
            int var5 = class67.field850;
            class217.method1526(var1, var3, var2, var5, var4);
            class217.method1526(var1 + 1, var3 + 1, var2 + -2, 16, 0);
            class217.method1528(var1 - -1, var3 + 18, var2 + -2, var5 + -19, 0);
            class280.field4439.method687(class2.field11, var1 + 3, var3 + 14, var4, -1);
            int var6 = class113.field1623;
            int var7 = class92.field1156;
            for (int var8 = 0; ~class34.field437 < ~var8; ++var8) {
                int var9 = 16777215;
                int var10 = (-var8 + -1 + class34.field437) * 15 + var3 + 31;
                if (var1 < var6 && ~(var1 - -var2) < ~var6 && ~var7 < ~(var10 + -13) && var10 + 3 > var7) {
                    var9 = 16776960;
                }
                class280.field4439.method687(class132.method895(var8, 0), var1 - -3, var10, var9, 0);
            }
            class176.method1223(class67.field850, class190.field3074, class73.field916, class103.field1392, arg0 ^ 25613);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILjava/util/Random;I[[IIZ)V")
    private final void method330(int arg0, int arg1, Random arg2, int arg3, int[][] arg4, int arg5, boolean arg6) {
        ++field729;
        int var8 = ~this.field733 >= -1 ? 4096 : 4096 - class40.method222(this.field733, -112, arg2);
        if (arg6) {
            this.field740 = 65;
        }
        int var9 = this.field740 * this.field728 >> 12;
        int var10 = this.field728 + -(~var9 >= -1 ? 0 : class40.method222(var9, 127, arg2));
        if (~arg1 <= ~class244.field4015) {
            arg1 -= class244.field4015;
        }
        if (~var10 >= -1) {
            if (arg1 - -arg3 <= class244.field4015) {
                for (int var11 = 0; var11 < arg5; ++var11) {
                    class72.method405(arg4[arg0 + var11], arg1, arg3, var8);
                }
            } else {
                int var12 = -arg1 + class244.field4015;
                for (int var13 = 0; arg5 > var13; ++var13) {
                    int[] var14 = arg4[arg0 + var13];
                    class72.method405(var14, arg1, var12, var8);
                    class72.method405(var14, 0, -var12 + arg3, var8);
                }
            }
        } else if (arg5 > 0 && arg3 > 0) {
            int var15 = arg3 / 2;
            int var16 = ~var15 <= ~var10 ? var10 : var15;
            int var17 = arg1 + var16;
            int var18 = arg5 / 2;
            int var19 = arg3 - var16 * 2;
            int var20 = var10 <= var18 ? var10 : var18;
            for (int var21 = 0; ~var21 > ~arg5; ++var21) {
                int[] var22 = arg4[arg0 + var21];
                if (var21 < var20) {
                    int var23 = var8 * var21 / var20;
                    if (~this.field739 == -1) {
                        for (int var24 = 0; ~var24 > ~var16; ++var24) {
                            int var25 = var8 * var24 / var16;
                            var22[class173.method1186(class118.field1673, arg1 + var24)] = var22[class173.method1186(-var24 + arg1 + -1 + arg3, class118.field1673)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var16 > var26; ++var26) {
                            int var28 = var8 * var26 / var16;
                            var22[class173.method1186(class118.field1673, arg1 + var26)] = var22[class173.method1186(-var26 + arg1 + arg3 + -1, class118.field1673)] = ~var28 > ~var23 ? var28 : var23;
                        }
                    }
                    if (~(var17 + var19) < ~class244.field4015) {
                        int var27 = -var17 + class244.field4015;
                        class72.method405(var22, var17, var27, var23);
                        class72.method405(var22, 0, -var27 + var19, var23);
                    } else {
                        class72.method405(var22, var17, var19, var23);
                    }
                } else {
                    int var29 = -var21 + arg5 - 1;
                    if (var29 < var20) {
                        int var30 = var8 * var29 / var20;
                        if (~this.field739 != -1) {
                            for (int var31 = 0; var16 > var31; ++var31) {
                                int var32 = var8 * var31 / var16;
                                var22[class173.method1186(arg1 + var31, class118.field1673)] = var22[class173.method1186(-var31 + arg3 + arg1 + -1, class118.field1673)] = ~var32 > ~var30 ? var32 : var30;
                            }
                        } else {
                            for (int var33 = 0; var16 > var33; ++var33) {
                                int var35 = var8 * var33 / var16;
                                var22[class173.method1186(arg1 + var33, class118.field1673)] = var22[class173.method1186(arg1 - 1 + arg3 + -var33, class118.field1673)] = var30 * var35 >> 12;
                            }
                        }
                        if (~class244.field4015 > ~(var17 - -var19)) {
                            int var34 = -var17 + class244.field4015;
                            class72.method405(var22, var17, var34, var30);
                            class72.method405(var22, 0, -var34 + var19, var30);
                        } else {
                            class72.method405(var22, var17, var19, var30);
                        }
                    } else {
                        for (int var36 = 0; var16 > var36; ++var36) {
                            var22[class173.method1186(class118.field1673, arg1 + var36)] = var22[class173.method1186(arg3 - var36 + arg1 + -1, class118.field1673)] = var8 * var36 / var16;
                        }
                        if (~(var17 - -var19) >= ~class244.field4015) {
                            class72.method405(var22, var17, var19, var8);
                        } else {
                            int var37 = -var17 + class244.field4015;
                            class72.method405(var22, var17, var37, var8);
                            class72.method405(var22, 0, -var37 + var19, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
    public final void method331(byte arg0) {
        if (arg0 == -49) {
            ++field738;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field742;
        if (arg1 != 255) {
            this.method47(-18, -73);
        }
        int[] var3 = super.field3445.method1755(arg0, (byte) 116);
        if (super.field3445.field4163) {
            int var4 = 0;
            int[][] var5 = super.field3445.method1752((byte) -89);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = class244.field4015 * this.field737 >> 12;
            int var13 = 0;
            int var14 = 0;
            int var15 = class244.field4015 * this.field743 >> 12;
            int var16 = class80.field998 * this.field744 >> 12;
            int var17 = class80.field998 * this.field745 >> 12;
            if (~var17 >= -2) {
                return var5[arg0];
            } else {
                this.field728 = class244.field4015 / 8 * this.field726 >> 12;
                int var18 = 1 - -(class244.field4015 / var12);
                int[][] var19 = new int[var18][3];
                Random var20 = new Random((long) this.field741);
                int[][] var21 = new int[var18][3];
                while (true) {
                    while (true) {
                        int var22 = var12 + class40.method222(-var12 + var15, arg1 ^ 167, var20);
                        int var23 = var8 - -var22;
                        int var24 = class40.method222(-var16 + var17, 90, var20) + var16;
                        if (var23 > class244.field4015) {
                            var23 = class244.field4015;
                            var22 = -var8 + class244.field4015;
                        }
                        int var26;
                        if (var11) {
                            var26 = 0;
                        } else {
                            int[] var25 = var19[var9];
                            var26 = var25[2];
                            int var27 = 0;
                            int var28 = var9;
                            int var29 = var4 + var23;
                            if (var29 < 0) {
                                var29 += class244.field4015;
                            }
                            if (class244.field4015 < var29) {
                                var29 -= class244.field4015;
                            }
                            while (true) {
                                int[] var30 = var19[var28];
                                if (var30[0] <= var29 && var29 <= var30[1]) {
                                    if (~var9 != ~var28) {
                                        int var31 = var4 + var8;
                                        if (~var31 > -1) {
                                            var31 += class244.field4015;
                                        }
                                        if (~var31 < ~class244.field4015) {
                                            var31 -= class244.field4015;
                                        }
                                        for (int var32 = 1; var27 >= var32; ++var32) {
                                            int[] var40 = var19[(var9 + var32) % var14];
                                            var26 = Math.max(var26, var40[2]);
                                        }
                                        for (int var33 = 0; var27 >= var33; ++var33) {
                                            int[] var34 = var19[(var9 + var33) % var14];
                                            int var35 = var34[2];
                                            if (var26 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 > ~var29) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class244.field4015;
                                                } else {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                }
                                                this.method330(var35, var6 + var38, var20, -var38 + var39, var5, -var35 + var26, false);
                                            }
                                        }
                                    }
                                    var9 = var28;
                                    break;
                                }
                                ++var27;
                                int var10000 = ~var14;
                                ++var28;
                                if (var10000 >= ~var28) {
                                    var28 = 0;
                                }
                            }
                        }
                        if (~class80.field998 <= ~(var24 + var26)) {
                            var10 = false;
                        } else {
                            var24 = -var26 + class80.field998;
                        }
                        if (class244.field4015 != var23) {
                            int[] var41 = var21[var13++];
                            var41[1] = var23;
                            var41[0] = var8;
                            var41[2] = var24 + var26;
                            this.method330(var26, var8 - -var7, var20, var22, var5, var24, false);
                            var8 = var23;
                        } else {
                            this.method330(var26, var7 + var8, var20, var22, var5, var24, false);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            var6 = var7;
                            var9 = 0;
                            int[] var42 = var21[var13++];
                            var42[1] = var23;
                            var14 = var13;
                            var13 = 0;
                            var42[0] = var8;
                            var8 = 0;
                            int[][] var43 = var19;
                            var11 = false;
                            var19 = var21;
                            var21 = var43;
                            var42[2] = var26 - -var24;
                            var7 = class40.method222(class244.field4015, 3, var20);
                            var4 = -var6 + var7;
                            int var44 = var4;
                            if (~var4 > -1) {
                                var44 = class244.field4015 + var4;
                            }
                            if (class244.field4015 < var44) {
                                var44 -= class244.field4015;
                            }
                            while (true) {
                                int[] var45 = var19[var9];
                                if (var44 >= var45[0] && var45[1] >= var44) {
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var14) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field727;
        if (arg0 != 1521146348) {
            method328(-108);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (~arg1 == -9) {
                                            this.field733 = arg2.method549(255);
                                        }
                                    } else {
                                        this.field740 = arg2.method549(arg0 + -1521146093);
                                    }
                                } else {
                                    this.field739 = arg2.method584(255);
                                }
                            } else {
                                this.field726 = arg2.method549(arg0 ^ 1521146131);
                            }
                        } else {
                            this.field745 = arg2.method549(255);
                        }
                    } else {
                        this.field744 = arg2.method549(arg0 ^ 1521146131);
                    }
                } else {
                    this.field743 = arg2.method549(255);
                }
            } else {
                this.field737 = arg2.method549(arg0 ^ 1521146131);
            }
        } else {
            this.field741 = arg2.method584(255);
        }
    }

    @OriginalMember(owner = "client!g", name = "i", descriptor = "(I)V")
    public static void method332(int arg0) {
        field732 = null;
        if (arg0 < 39) {
            field730 = null;
        }
        field730 = null;
    }
}
