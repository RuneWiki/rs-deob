import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class124 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lck;")
    public static class119 field1905 = class298.method1987((byte) 48, ")2");

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "J")
    public static long field1906 = 0L;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lck;")
    public static class119 field1916 = class298.method1987((byte) 113, "b12_full");

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Lck;")
    public static class119 field1913 = null;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lvk;")
    public static class67 field1915 = new class67(64);

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field1918 = -1;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lba;")
    public static class292 field1917;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "[[[B")
    public static byte[][][] field1909;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIILml;)V", line = 15)
    public static final void method825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class134 arg7) {
        if (arg6 != 8) {
            field1913 = (class119) null;
        }
        field1911++;
        if (class99.field1504) {
            class134.field2156 = 32;
        } else {
            class134.field2156 = 0;
        }
        class99.field1504 = false;
        if (class272.field4475 != 0) {
            if (arg3 <= arg5 && arg5 < arg3 + 16 && arg0 >= arg4 && arg0 < (arg4 + 16)) {
                arg7.field2169 -= 4;
                class26.method194(arg7, -111);
            } else if (arg3 <= arg5 && (arg3 + 16) > arg5 && arg1 + arg4 - 16 <= arg0 && arg0 < (arg1 + arg4)) {
                arg7.field2169 += 4;
                class26.method194(arg7, arg6 - 85);
            } else if (arg5 >= (arg3 - class134.field2156) && class134.field2156 + arg3 + 16 > arg5 && arg0 >= arg4 + 16 && arg4 + arg1 - 16 > arg0) {
                int var8 = (arg1 - 32) * arg1 / arg2;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg0 - (var8 / 2) - arg4 - 16;
                int var10 = arg1 - var8 - 32;
                arg7.field2169 = (arg2 - arg1) * var9 / var10;
                class26.method194(arg7, -79);
                class99.field1504 = true;
            }
        }
        if (class214.field3410 == 0) {
            return;
        }
        int var11 = arg7.field2180;
        if (arg5 >= arg3 - var11 && arg4 <= arg0 && arg3 + 16 > arg5 && arg0 <= (arg1 + arg4)) {
            arg7.field2169 += class214.field3410 * 45;
            class26.method194(arg7, arg6 ^ 0xFFFFFFB7);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)Ljh;", line = 80)
    public static final class295 method826(byte arg0, int arg1) {
        field1907++;
        class295 var2 = (class295) class189.field2984.method524((byte) 118, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class203.field3223.method261(-1, method827(arg1, 1918007197), class69.method500(arg1, 1));
        class295 var4 = new class295();
        if (arg0 >= -10) {
            method826((byte) -82, 49);
        }
        if (var3 != null) {
            var4.method1965((byte) -118, new class3(var3));
        }
        class189.field2984.method527((long) arg1, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I", line = 112)
    private static final int method827(int arg0, int arg1) {
        if (arg1 != 1918007197) {
            field1912 = -44;
        }
        field1910++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)V", line = 123)
    public static final void method828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class198.field3171 == 0 && !class114.field1725) {
            class221.field3539++;
            int var7 = class120.field1892;
            int var8 = field1904;
            int var9 = class85.field1276;
            int var10 = class118.field1782;
            int var11 = (arg0 - arg5) * (var10 - var8) / arg2 + var8;
            int var12 = (arg1 - arg6) * (var9 - var7) / arg3 + var7;
            class222.method1411(class203.field3220, -32768, var11, class79.field1212, var12, (short) 33, 0L);
        }
        long var13 = -1L;
        if (arg4 != -65) {
            return;
        }
        field1908++;
        for (int var15 = 0; var15 < class214.field3405; var15++) {
            long var16 = class287.field4728[var15];
            int var18 = (int) var16 & 0x7F;
            int var19 = ((int) var16 & 0x3FDE) >> 7;
            int var20 = Integer.MAX_VALUE & (int) (var16 >>> 32);
            int var21 = ((int) var16 & 0x7252779D) >> 29;
            if (var13 != var16) {
                var13 = var16;
                if (var21 == 2 && class270.method1796(class10.field189, var18, var19, var16)) {
                    class291 var22 = class291.method1939(0, var20);
                    if (var22.field4817 != null) {
                        var22 = var22.method1940(true);
                    }
                    if (var22 == null) {
                        continue;
                    }
                    if (class198.field3171 == 1) {
                        class71.field1114++;
                        class222.method1411(class170.method1074(new class119[] { class283.field4673, class193.field3088, var22.field4770 }, -110), -32768, var19, class169.field2678, var18, (short) 35, var16);
                    } else if (!class114.field1725) {
                        class119[] var23 = var22.field4837;
                        if (class27.field405) {
                            var23 = class232.method1497(112, var23);
                        }
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if (var23[var24] != null) {
                                    class24.field372++;
                                    short var25 = 0;
                                    if (var24 == 0) {
                                        var25 = 15;
                                    }
                                    if (var24 == 1) {
                                        var25 = 12;
                                    }
                                    if (var24 == 2) {
                                        var25 = 1;
                                    }
                                    if (var24 == 3) {
                                        var25 = 32;
                                    }
                                    if (var24 == 4) {
                                        var25 = 1003;
                                    }
                                    class222.method1411(class170.method1074(new class119[] { class102.field1550, var22.field4770 }, -93), -32768, var19, var23[var24], var18, var25, var16);
                                }
                            }
                        }
                        class184.field2918++;
                        class222.method1411(class170.method1074(new class119[] { class102.field1550, var22.field4770 }, -91), arg4 - 32703, var19, class64.field1015, var18, (short) 1001, (long) var22.field4822);
                    } else if ((class205.field3249 & 0x4) == 4) {
                        class222.method1411(class170.method1074(new class119[] { class150.field2388, class193.field3088, var22.field4770 }, arg4 ^ 0x16), arg4 ^ 0x7FBF, var19, class227.field3633, var18, (short) 57, var16);
                        class19.field259++;
                    }
                }
                if (var21 == 1) {
                    class163 var26 = class70.field1103[var20];
                    if (var26.field2575.field796 == 1 && (var26.field4949 & 0x7F) == 64 && (var26.field4991 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < class157.field2499; var27++) {
                            class163 var28 = class70.field1103[class23.field348[var27]];
                            if (var28 != null && var26 != var28 && var28.field2575.field796 == 1 && var26.field4949 == var28.field4949 && var26.field4991 == var28.field4991) {
                                class73.method525(var18, var28.field2575, var19, 40, class23.field348[var27]);
                            }
                        }
                        for (int var29 = 0; var29 < class233.field3757; var29++) {
                            class292 var30 = class23.field346[class226.field3609[var29]];
                            if (var30 != null && var26.field4949 == var30.field4949 && var26.field4991 == var30.field4991) {
                                class7.method87(class226.field3609[var29], var18, var30, var19, 114);
                            }
                        }
                    }
                    class73.method525(var18, var26.field2575, var19, 40, var20);
                }
                if (var21 == 0) {
                    class292 var31 = class23.field346[var20];
                    if ((var31.field4949 & 0x7F) == 64 && (var31.field4991 & 0x7F) == 64) {
                        for (int var32 = 0; var32 < class157.field2499; var32++) {
                            class163 var33 = class70.field1103[class23.field348[var32]];
                            if (var33 != null && var33.field2575.field796 == 1 && var31.field4949 == var33.field4949 && var31.field4991 == var33.field4991) {
                                class73.method525(var18, var33.field2575, var19, 40, class23.field348[var32]);
                            }
                        }
                        for (int var34 = 0; var34 < class233.field3757; var34++) {
                            class292 var35 = class23.field346[class226.field3609[var34]];
                            if (var35 != null && var31 != var35 && var31.field4949 == var35.field4949 && var31.field4991 == var35.field4991) {
                                class7.method87(class226.field3609[var34], var18, var35, var19, -128);
                            }
                        }
                    }
                    class7.method87(var20, var18, var31, var19, arg4 ^ 0x48);
                }
                if (var21 == 3) {
                    class156 var36 = class240.field3841[class10.field189][var18][var19];
                    if (var36 != null) {
                        for (class155 var37 = (class155) var36.method1000((byte) 110); var37 != null; var37 = (class155) var36.method997(127)) {
                            int var38 = var37.field2476.field4117;
                            class262 var39 = class205.method1296((byte) -81, var38);
                            if (class198.field3171 == 1) {
                                class222.method1411(class170.method1074(new class119[] { class283.field4673, class287.field4727, var39.field4212 }, -102), -32768, var19, class169.field2678, var18, (short) 4, (long) var38);
                                class277.field4546++;
                            } else if (!class114.field1725) {
                                class119[] var40 = var39.field4198;
                                class82.field1249++;
                                if (class27.field405) {
                                    var40 = class232.method1497(63, var40);
                                }
                                for (int var41 = 4; var41 >= 0; var41--) {
                                    if (var40 != null && var40[var41] != null) {
                                        class44.field657++;
                                        byte var42 = 0;
                                        if (var41 == 0) {
                                            var42 = 24;
                                        }
                                        if (var41 == 1) {
                                            var42 = 13;
                                        }
                                        if (var41 == 2) {
                                            var42 = 11;
                                        }
                                        if (var41 == 3) {
                                            var42 = 45;
                                        }
                                        if (var41 == 4) {
                                            var42 = 43;
                                        }
                                        class222.method1411(class170.method1074(new class119[] { class226.field3618, var39.field4212 }, -118), arg4 ^ 0x7FBF, var19, var40[var41], var18, var42, (long) var38);
                                    } else if (var41 == 2) {
                                        class222.method1411(class170.method1074(new class119[] { class226.field3618, var39.field4212 }, arg4 ^ 0x2D), -32768, var19, class135.field2196, var18, (short) 11, (long) var38);
                                        class89.field1363++;
                                    }
                                }
                                class222.method1411(class170.method1074(new class119[] { class226.field3618, var39.field4212 }, -103), -32768, var19, class64.field1015, var18, (short) 1007, (long) var38);
                            } else if ((class205.field3249 & 0x1) == 1) {
                                class289.field4755++;
                                class222.method1411(class170.method1074(new class119[] { class150.field2388, class287.field4727, var39.field4212 }, -82), -32768, var19, class227.field3633, var18, (short) 50, (long) var38);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 440)
    public static void method829(byte arg0) {
        field1916 = null;
        field1905 = null;
        field1909 = (byte[][][]) null;
        field1913 = null;
        field1917 = null;
        if (arg0 == 48) {
            field1915 = null;
        }
    }
}
