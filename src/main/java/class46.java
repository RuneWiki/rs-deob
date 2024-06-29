import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class46 extends class224 {

    @OriginalMember(owner = "client!dl", name = "bb", descriptor = "I")
    private int field570 = 0;

    @OriginalMember(owner = "client!dl", name = "Y", descriptor = "I")
    private int field567 = 0;

    @OriginalMember(owner = "client!dl", name = "fb", descriptor = "I")
    private int field574 = 16;

    @OriginalMember(owner = "client!dl", name = "X", descriptor = "I")
    private int field566 = 2000;

    @OriginalMember(owner = "client!dl", name = "hb", descriptor = "I")
    private int field576 = 4096;

    @OriginalMember(owner = "client!dl", name = "ab", descriptor = "Luf;")
    private static class168 field569 = class148.method1019(-1720, "glow1:");

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
    public static int field561 = 0;

    @OriginalMember(owner = "client!dl", name = "W", descriptor = "Luf;")
    public static class168 field565 = class148.method1019(-1720, "showVideoAd");

    @OriginalMember(owner = "client!dl", name = "db", descriptor = "Luf;")
    public static class168 field572 = field569;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "Luf;")
    public static class168 field560 = field569;

    @OriginalMember(owner = "client!dl", name = "ib", descriptor = "S")
    public static short field577 = 32767;

    @OriginalMember(owner = "client!dl", name = "U", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!dl", name = "V", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!dl", name = "Z", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!dl", name = "cb", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!dl", name = "eb", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!dl", name = "gb", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "[[Lvk;")
    public static class192[][] field562;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBLtb;IIII)V", line = 4)
    public static final void method249(int arg0, byte arg1, class189 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 45) {
            method250(-8);
        }
        field563++;
        class134.method932(-124, arg6, arg5, arg0, arg4, arg2.field3021, arg2.field3027, arg3);
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V", line = 22)
    public static void method250(int arg0) {
        field562 = (class192[][]) null;
        field565 = null;
        field560 = null;
        field569 = null;
        if (arg0 != -65) {
            method251(-65, 62, 38, (byte) 16, -28, -43, -128);
        }
        field572 = null;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 54)
    public class46() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZLj;)V", line = 69)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field575++;
        if (arg0 == 0) {
            this.field567 = arg2.method1042((byte) 100);
        } else if (arg0 == 1) {
            this.field566 = arg2.method1069(104);
        } else if (arg0 == 2) {
            this.field574 = arg2.method1042((byte) 107);
        } else if (arg0 == 3) {
            this.field570 = arg2.method1069(41);
        } else if (arg0 == 4) {
            this.field576 = arg2.method1069(98);
        }
        if (arg1) {
            this.method19(-31, true, (class153) null);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIBIII)V", line = 144)
    public static final void method251(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (class211.field3461 == 0 && !class111.field1740) {
            class31.field386++;
            int var7 = class281.field4720;
            int var8 = class133.field2086;
            int var9 = class2.field11;
            int var10 = (arg0 - arg6) * (var8 - var9) / arg2 + var9;
            int var11 = class287.field4838;
            int var12 = (arg5 - arg1) * (var11 - var7) / arg4 + var7;
            class45.method247(var12, class182.field2934, class281.field4724, (short) 35, (byte) 66, 0L, var10);
        }
        if (arg3 != -97) {
            field577 = -54;
        }
        field571++;
        long var13 = -1L;
        for (int var15 = 0; var15 < class122.field1890; var15++) {
            long var16 = class231.field3718[var15];
            int var18 = (int) var16 & 0x7F;
            int var19 = ((int) var16 & 0x3FB8) >> 7;
            int var20 = (int) (var16 >>> 32) & Integer.MAX_VALUE;
            int var21 = (int) var16 >> 29 & 0x3;
            if (var13 != var16) {
                var13 = var16;
                if (var21 == 2 && class149.method1026(class79.field1127, var18, var19, var16)) {
                    class161 var22 = class15.method64(var20, false);
                    if (var22.field2553 != null) {
                        var22 = var22.method1135(-114);
                    }
                    if (var22 == null) {
                        continue;
                    }
                    if (class211.field3461 == 1) {
                        class218.field3550++;
                        class45.method247(var19, class134.method938((byte) -123, new class168[] { class213.field3486, class57.field747, var22.field2576 }), class127.field1957, (short) 39, (byte) 66, var16, var18);
                    } else if (!class111.field1740) {
                        class50.field599++;
                        class168[] var23 = var22.field2591;
                        if (class140.field2173) {
                            var23 = class157.method1113((byte) 80, var23);
                        }
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if (var23[var24] != null) {
                                    short var25 = 0;
                                    class44.field540++;
                                    if (var24 == 0) {
                                        var25 = 36;
                                    }
                                    if (var24 == 1) {
                                        var25 = 21;
                                    }
                                    if (var24 == 2) {
                                        var25 = 6;
                                    }
                                    if (var24 == 3) {
                                        var25 = 37;
                                    }
                                    if (var24 == 4) {
                                        var25 = 1001;
                                    }
                                    class45.method247(var19, class134.method938((byte) -123, new class168[] { class67.field887, var22.field2576 }), var23[var24], var25, (byte) 66, var16, var18);
                                }
                            }
                        }
                        class45.method247(var19, class134.method938((byte) -127, new class168[] { class67.field887, var22.field2576 }), class126.field1948, (short) 1005, (byte) 66, (long) var22.field2579, var18);
                    } else if ((class298.field5055 & 0x4) == 4) {
                        class2.field9++;
                        class45.method247(var19, class134.method938((byte) -127, new class168[] { class233.field3754, class57.field747, var22.field2576 }), class120.field1872, (short) 4, (byte) 66, var16, var18);
                    }
                }
                if (var21 == 1) {
                    class22 var26 = class190.field3065[var20];
                    if (var26.field267.field3211 == 1 && (var26.field3027 & 0x7F) == 64 && (var26.field3021 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < class2.field15; var27++) {
                            class22 var28 = class190.field3065[class116.field1814[var27]];
                            if (var28 != null && var26 != var28 && var28.field267.field3211 == 1 && var26.field3027 == var28.field3027 && var26.field3021 == var28.field3021) {
                                class92.method650(class116.field1814[var27], var19, arg3 ^ 0xFFFFF8D7, var18, var28.field267);
                            }
                        }
                        for (int var29 = 0; var29 < class167.field2676; var29++) {
                            class54 var30 = class9.field117[class281.field4719[var29]];
                            if (var30 != null && var26.field3027 == var30.field3027 && var26.field3021 == var30.field3021) {
                                class6.method22(var18, var19, class281.field4719[var29], var30, arg3 + 12382);
                            }
                        }
                    }
                    class92.method650(var20, var19, arg3 ^ 0xFFFFF8D7, var18, var26.field267);
                }
                if (var21 == 0) {
                    class54 var31 = class9.field117[var20];
                    if ((var31.field3027 & 0x7F) == 64 && (var31.field3021 & 0x7F) == 64) {
                        for (int var32 = 0; var32 < class2.field15; var32++) {
                            class22 var33 = class190.field3065[class116.field1814[var32]];
                            if (var33 != null && var33.field267.field3211 == 1 && var31.field3027 == var33.field3027 && var31.field3021 == var33.field3021) {
                                class92.method650(class116.field1814[var32], var19, arg3 ^ 0xFFFFF8D7, var18, var33.field267);
                            }
                        }
                        for (int var34 = 0; var34 < class167.field2676; var34++) {
                            class54 var35 = class9.field117[class281.field4719[var34]];
                            if (var35 != null && var31 != var35 && var31.field3027 == var35.field3027 && var31.field3021 == var35.field3021) {
                                class6.method22(var18, var19, class281.field4719[var34], var35, arg3 ^ 0xFFFFD062);
                            }
                        }
                    }
                    class6.method22(var18, var19, var20, var31, 12285);
                }
                if (var21 == 3) {
                    class76 var36 = class71.field952[class79.field1127][var18][var19];
                    if (var36 != null) {
                        for (class18 var37 = (class18) var36.method443(-105); var37 != null; var37 = (class18) var36.method444(-27024)) {
                            int var38 = var37.field202.field555;
                            class238 var39 = class284.method1963((byte) -71, var38);
                            if (class211.field3461 == 1) {
                                class244.field4154++;
                                class45.method247(var19, class134.method938((byte) -125, new class168[] { class213.field3486, class80.field1158, var39.field3833 }), class127.field1957, (short) 25, (byte) 66, (long) var38, var18);
                            } else if (!class111.field1740) {
                                class168[] var40 = var39.field3849;
                                if (class140.field2173) {
                                    var40 = class157.method1113((byte) 80, var40);
                                }
                                class1.field5++;
                                for (int var41 = 4; var41 >= 0; var41--) {
                                    if (var40 != null && var40[var41] != null) {
                                        class26.field316++;
                                        byte var42 = 0;
                                        if (var41 == 0) {
                                            var42 = 34;
                                        }
                                        if (var41 == 1) {
                                            var42 = 8;
                                        }
                                        if (var41 == 2) {
                                            var42 = 28;
                                        }
                                        if (var41 == 3) {
                                            var42 = 17;
                                        }
                                        if (var41 == 4) {
                                            var42 = 7;
                                        }
                                        class45.method247(var19, class134.method938((byte) -124, new class168[] { class64.field855, var39.field3833 }), var40[var41], var42, (byte) 66, (long) var38, var18);
                                    } else if (var41 == 2) {
                                        class45.method247(var19, class134.method938((byte) -128, new class168[] { class64.field855, var39.field3833 }), class282.field4750, (short) 28, (byte) 66, (long) var38, var18);
                                        class106.field1636++;
                                    }
                                }
                                class45.method247(var19, class134.method938((byte) -125, new class168[] { class64.field855, var39.field3833 }), class126.field1948, (short) 1002, (byte) 66, (long) var38, var18);
                            } else if ((class298.field5055 & 0x1) == 1) {
                                class45.method247(var19, class134.method938((byte) -128, new class168[] { class233.field3754, class80.field1158, var39.field3833 }), class120.field1872, (short) 22, (byte) 66, (long) var38, var18);
                                class287.field4842++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)[I", line = 452)
    public final int[] method18(byte arg0, int arg1) {
        field564++;
        int[] var3 = this.field3613.method1866(1, arg1);
        int var4 = 14 / ((20 - arg0) / 51);
        if (this.field3613.field4531) {
            int var5 = this.field576 >> 1;
            int[][] var6 = this.field3613.method1868(0);
            Random var7 = new Random((long) this.field567);
            for (int var8 = 0; var8 < this.field566; var8++) {
                int var9 = this.field576 > 0 ? this.field570 + (class103.method774(this.field576, var7, Integer.MIN_VALUE) - var5) : this.field570;
                int var10 = var9 >> 4 & 0xFF;
                int var11 = class103.method774(class187.field2961, var7, Integer.MIN_VALUE);
                int var12 = class103.method774(class115.field1791, var7, Integer.MIN_VALUE);
                int var13 = (class203.field3339[var10] * this.field574 >> 12) + var12;
                int var14 = var13 - var12;
                int var15 = (class261.field4425[var10] * this.field574 >> 12) + var11;
                int var16 = var15 - var11;
                if (var16 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    boolean var17 = var16 < var14;
                    if (var17) {
                        int var18 = var11;
                        int var19 = var15;
                        var15 = var13;
                        var13 = var19;
                        var11 = var12;
                        var12 = var18;
                    }
                    if (var11 > var15) {
                        int var20 = var11;
                        int var21 = var12;
                        var11 = var15;
                        var12 = var13;
                        var13 = var21;
                        var15 = var20;
                    }
                    int var22 = var12;
                    int var23 = var15 - var11;
                    int var24 = var13 - var12;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    int var25 = -var23 / 2;
                    int var26 = 1024 - (class103.method774(4096, var7, Integer.MIN_VALUE) >> 2);
                    int var27 = var12 >= var13 ? -1 : 1;
                    int var28 = 2048 / var23;
                    for (int var29 = var11; var29 < var15; var29++) {
                        var25 += var24;
                        int var30 = (var29 - var11) * var28 + var26 + 1024;
                        int var31 = class169.field2777 & var22;
                        int var32 = class205.field3363 & var29;
                        if (var17) {
                            var6[var31][var32] = var30;
                        } else {
                            var6[var32][var31] = var30;
                        }
                        if (var25 > 0) {
                            var25 += -var23;
                            var22 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V", line = 588)
    public final void method80(boolean arg0) {
        field573++;
        if (arg0) {
            method251(-69, 83, -107, (byte) 22, 111, 92, 105);
        }
        class125.method889(-69);
    }
}
