import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class259 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[[Z")
    public static boolean[][] field4124;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "[[[B")
    public static byte[][][] field4128;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method1697(byte arg0) {
        field4124 = null;
        int var1 = 2 % ((arg0 + 78) / 43);
        field4128 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static final void method1698(int arg0) {
        if (arg0 < -87) {
            class75.field1024.method1834(0);
            field4127++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1699(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4126++;
        class6.method40(arg5, -325);
        int var7 = 0;
        int var8 = arg5 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg1 != -9) {
            field4128 = null;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (class156.field2507 <= arg6 && client.field3617 >= arg6) {
            int[] var14 = class85.field1162[arg6];
            int var15 = class18.method125(-24914, arg0 - arg5, class121.field2042, class58.field817);
            int var16 = class18.method125(-24914, arg0 + arg5, class121.field2042, class58.field817);
            int var17 = class18.method125(-24914, arg0 - var8, class121.field2042, class58.field817);
            int var18 = class18.method125(-24914, arg0 + var8, class121.field2042, class58.field817);
            class168.method1184(arg1 + 137, var17, var15, arg4, var14);
            class168.method1184(128, var18, var17, arg3, var14);
            class168.method1184(128, var16, var18, arg4, var14);
        }
        int var19 = -1;
        while (var7 < var9) {
            var19 += 2;
            var12 += var19;
            var13 += 2;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class44.field514[var11] = var7;
                var12 -= var11 << 1;
            }
            var10 += var13;
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg6 + var9;
                int var21 = arg6 - var9;
                if (class156.field2507 <= var20 && client.field3617 >= var21) {
                    if (var8 <= var9) {
                        int var22 = class18.method125(-24914, arg0 + var7, class121.field2042, class58.field817);
                        int var23 = class18.method125(-24914, arg0 - var7, class121.field2042, class58.field817);
                        if (client.field3617 >= var20) {
                            class168.method1184(128, var22, var23, arg4, class85.field1162[var20]);
                        }
                        if (var21 >= class156.field2507) {
                            class168.method1184(128, var22, var23, arg4, class85.field1162[var21]);
                        }
                    } else {
                        int var24 = class44.field514[var9];
                        int var25 = class18.method125(-24914, arg0 + var7, class121.field2042, class58.field817);
                        int var26 = class18.method125(-24914, arg0 - var7, class121.field2042, class58.field817);
                        int var27 = class18.method125(-24914, arg0 + var24, class121.field2042, class58.field817);
                        int var28 = class18.method125(arg1 ^ 0x6159, arg0 - var24, class121.field2042, class58.field817);
                        if (client.field3617 >= var20) {
                            int[] var29 = class85.field1162[var20];
                            class168.method1184(128, var28, var26, arg4, var29);
                            class168.method1184(128, var27, var28, arg3, var29);
                            class168.method1184(arg1 + 137, var25, var27, arg4, var29);
                        }
                        if (class156.field2507 <= var21) {
                            int[] var30 = class85.field1162[var21];
                            class168.method1184(128, var28, var26, arg4, var30);
                            class168.method1184(128, var27, var28, arg3, var30);
                            class168.method1184(128, var25, var27, arg4, var30);
                        }
                    }
                }
            }
            int var31 = arg6 - var7;
            int var32 = arg6 + var7;
            if (var32 >= class156.field2507 && var31 <= client.field3617) {
                int var33 = arg0 + var9;
                int var34 = arg0 - var9;
                if (var33 >= class58.field817 && var34 <= class121.field2042) {
                    int var35 = class18.method125(-24914, var33, class121.field2042, class58.field817);
                    int var36 = class18.method125(-24914, var34, class121.field2042, class58.field817);
                    if (var8 <= var7) {
                        if (client.field3617 >= var32) {
                            class168.method1184(128, var35, var36, arg4, class85.field1162[var32]);
                        }
                        if (var31 >= class156.field2507) {
                            class168.method1184(128, var35, var36, arg4, class85.field1162[var31]);
                        }
                    } else {
                        int var37 = var7 <= var11 ? var11 : class44.field514[var7];
                        int var38 = class18.method125(-24914, arg0 + var37, class121.field2042, class58.field817);
                        int var39 = class18.method125(arg1 ^ 0x6159, arg0 - var37, class121.field2042, class58.field817);
                        if (var32 <= client.field3617) {
                            int[] var40 = class85.field1162[var32];
                            class168.method1184(128, var39, var36, arg4, var40);
                            class168.method1184(128, var38, var39, arg3, var40);
                            class168.method1184(128, var35, var38, arg4, var40);
                        }
                        if (var31 >= class156.field2507) {
                            int[] var41 = class85.field1162[var31];
                            class168.method1184(arg1 + 137, var39, var36, arg4, var41);
                            class168.method1184(128, var38, var39, arg3, var41);
                            class168.method1184(arg1 + 137, var35, var38, arg4, var41);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lcj;")
    public static final class288 method1700(int arg0, int arg1) {
        field4123++;
        if (arg0 != 20) {
            return null;
        } else if (arg1 == 0) {
            return new class71();
        } else if (arg1 == 1) {
            return new class131();
        } else if (arg1 == 2) {
            return new class290();
        } else if (arg1 == 3) {
            return new class67();
        } else if (arg1 == 4) {
            return new class7();
        } else if (arg1 == 5) {
            return new class18();
        } else if (arg1 == 6) {
            return new class111();
        } else if (arg1 == 7) {
            return new class51();
        } else if (arg1 == 8) {
            return new class191();
        } else if (arg1 == 9) {
            return new class227();
        } else if (arg1 == 10) {
            return new class72();
        } else if (arg1 == 11) {
            return new class254();
        } else if (arg1 == 12) {
            return new class184();
        } else if (arg1 == 13) {
            return new class92();
        } else if (arg1 == 14) {
            return new class78();
        } else if (arg1 == 15) {
            return new class246();
        } else if (arg1 == 16) {
            return new class153();
        } else if (arg1 == 17) {
            return new class147();
        } else if (arg1 == 18) {
            return new class256();
        } else if (arg1 == 19) {
            return new class20();
        } else if (arg1 == 20) {
            return new class234();
        } else if (arg1 == 21) {
            return new class225();
        } else if (arg1 == 22) {
            return new class28();
        } else if (arg1 == 23) {
            return new class203();
        } else if (arg1 == 24) {
            return new class270();
        } else if (arg1 == 25) {
            return new class5();
        } else if (arg1 == 26) {
            return new class34();
        } else if (arg1 == 27) {
            return new class236();
        } else if (arg1 == 28) {
            return new class267();
        } else if (arg1 == 29) {
            return new class263();
        } else if (arg1 == 30) {
            return new class143();
        } else if (arg1 == 31) {
            return new class112();
        } else if (arg1 == 32) {
            return new class8();
        } else if (arg1 == 33) {
            return new class121();
        } else if (arg1 == 34) {
            return new class3();
        } else if (arg1 == 35) {
            return new class166();
        } else if (arg1 == 36) {
            return new class122();
        } else if (arg1 == 37) {
            return new class87();
        } else if (arg1 == 38) {
            return new class181();
        } else if (arg1 == 39) {
            return new class75();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public static final void method1701(boolean arg0) {
        class235.field3751.method1834(0);
        if (arg0) {
            field4124 = null;
        }
        field4122++;
    }
}
