import java.util.Date;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class50 {

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lmb;")
    private static class96 field873 = class243.method1708(")1 ", (byte) 111);

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "[J")
    public static long[] field876 = new long[32];

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "[I")
    public static int[] field875 = new int[2];

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "[Lmi;")
    public static class180[] field879;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "[Lmb;")
    public static class96[] field878;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Lkc;")
    public static final class42 method378(int arg0, int arg1) {
        field877++;
        if (arg0 != 10) {
            return null;
        }
        class42 var2 = (class42) class57.field1007.method158((long) arg1, (byte) -47);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class119.field2215.method23(class226.method1542(true, arg1), 103, class232.method1579(arg1, (byte) -117));
        class42 var4 = new class42();
        if (var3 != null) {
            var4.method329(101, new class239(var3));
        }
        class57.field1007.method155((long) arg1, var4, (byte) 54);
        return var4;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/util/Random;B)I")
    public static final int method379(int arg0, Random arg1, byte arg2) {
        field880++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class215.method1489(arg0, arg2 - 27)) {
            return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            if (arg2 != 26) {
                method379(119, (Random) null, (byte) -28);
            }
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class98.method743(var4, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIBIII)V")
    public static final void method380(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (class148.field2616 == 0) {
            class108.field2002++;
            int var7 = class245.field4263;
            int var8 = class260.field4545;
            int var9 = class224.field3819;
            int var10 = class256.field4469;
            int var11 = (arg5 - arg4) * (var10 - var8) / arg1 + var8;
            int var12 = (arg2 - arg6) * (var7 - var9) / arg0 + var9;
            if (class124.field2301 && (class251.field4343 & 0x40) == 64) {
                class107 var13 = class1.method7(class133.field2382, class48.field851, -94);
                if (var13 == null) {
                    class71.method483(-64);
                } else {
                    class220.method1513(-73, (short) 21, class75.field1302, var12, class51.field896, 0L, var11);
                }
            } else {
                class220.method1513(-24, (short) 5, class250.field4321, var12, class120.field2227, 0L, var11);
            }
        }
        int var14 = -88 / ((43 - arg3) / 48);
        field872++;
        long var15 = -1L;
        for (int var17 = 0; var17 < class227.field3861; var17++) {
            long var18 = class256.field4462[var17];
            int var20 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            int var21 = ((int) var18 & 0x3FF1) >> 7;
            int var22 = (int) var18 & 0x7F;
            int var23 = ((int) var18 & 0x7B0E3146) >> 29;
            if (var15 != var18) {
                var15 = var18;
                if (var23 == 2 && class119.method924(class216.field3712, var22, var21, var18)) {
                    class196 var24 = class132.method995(var20, 0);
                    if (var24.field3408 != null) {
                        var24 = var24.method1377((byte) 31);
                    }
                    if (var24 == null) {
                        continue;
                    }
                    if (class148.field2616 == 1) {
                        class220.method1513(-40, (short) 22, class219.field3754, var22, class36.method289(-5615, new class96[] { class178.field3075, class189.field3306, var24.field3422 }), var18, var21);
                        class209.field3605++;
                    } else if (!class124.field2301) {
                        class152.field2677++;
                        class96[] var25 = var24.field3387;
                        if (class115.field2138) {
                            var25 = class107.method809((byte) 119, var25);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class136.field2445++;
                                    short var27 = 0;
                                    if (var26 == 0) {
                                        var27 = 43;
                                    }
                                    if (var26 == 1) {
                                        var27 = 49;
                                    }
                                    if (var26 == 2) {
                                        var27 = 40;
                                    }
                                    if (var26 == 3) {
                                        var27 = 48;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1003;
                                    }
                                    class220.method1513(-87, var27, var25[var26], var22, class36.method289(-5615, new class96[] { class22.field382, var24.field3422 }), var18, var21);
                                }
                            }
                        }
                        class220.method1513(-38, (short) 1006, class258.field4473, var22, class36.method289(-5615, new class96[] { class22.field382, var24.field3422 }), (long) var24.field3367, var21);
                    } else if ((class251.field4343 & 0x4) == 4) {
                        class220.method1513(-25, (short) 34, class75.field1302, var22, class36.method289(-5615, new class96[] { class138.field2478, class189.field3306, var24.field3422 }), var18, var21);
                        class23.field393++;
                    }
                }
                if (var23 == 1) {
                    class197 var28 = class86.field1450[var20];
                    if (var28.field3436.field3914 == 1 && (var28.field4511 & 0x7F) == 64 && (var28.field4533 & 0x7F) == 64) {
                        for (int var29 = 0; var29 < class132.field2375; var29++) {
                            class197 var32 = class86.field1450[class222.field3797[var29]];
                            if (var32 != null && var28 != var32 && var32.field3436.field3914 == 1 && var28.field4511 == var32.field4511 && var28.field4533 == var32.field4533) {
                                class201.method1405(class222.field3797[var29], var32.field3436, 126, var21, var22);
                            }
                        }
                        for (int var30 = 0; var30 < class145.field2577; var30++) {
                            class47 var31 = class22.field371[class103.field1734[var30]];
                            if (var31 != null && var28.field4511 == var31.field4511 && var28.field4533 == var31.field4533) {
                                class215.method1491((byte) -117, class103.field1734[var30], var21, var31, var22);
                            }
                        }
                    }
                    class201.method1405(var20, var28.field3436, 114, var21, var22);
                }
                if (var23 == 0) {
                    class47 var33 = class22.field371[var20];
                    if ((var33.field4511 & 0x7F) == 64 && (var33.field4533 & 0x7F) == 64) {
                        for (int var34 = 0; var34 < class132.field2375; var34++) {
                            class197 var37 = class86.field1450[class222.field3797[var34]];
                            if (var37 != null && var37.field3436.field3914 == 1 && var33.field4511 == var37.field4511 && var33.field4533 == var37.field4533) {
                                class201.method1405(class222.field3797[var34], var37.field3436, 127, var21, var22);
                            }
                        }
                        for (int var35 = 0; var35 < class145.field2577; var35++) {
                            class47 var36 = class22.field371[class103.field1734[var35]];
                            if (var36 != null && var33 != var36 && var33.field4511 == var36.field4511 && var33.field4533 == var36.field4533) {
                                class215.method1491((byte) -117, class103.field1734[var35], var21, var36, var22);
                            }
                        }
                    }
                    class215.method1491((byte) -117, var20, var21, var33, var22);
                }
                if (var23 == 3) {
                    class262 var38 = class220.field3764[class216.field3712][var22][var21];
                    if (var38 != null) {
                        for (class32 var39 = (class32) var38.method1816((byte) 113); var39 != null; var39 = (class32) var38.method1813(true)) {
                            int var40 = var39.field504.field2679;
                            class159 var41 = class269.method1845(var40, (byte) 61);
                            if (class148.field2616 == 1) {
                                class220.method1513(-118, (short) 17, class219.field3754, var22, class36.method289(-5615, new class96[] { class178.field3075, class233.field3989, var41.field2779 }), (long) var40, var21);
                                class210.field3611++;
                            } else if (!class124.field2301) {
                                class192.field3323++;
                                class96[] var42 = var41.field2788;
                                if (class115.field2138) {
                                    var42 = class107.method809((byte) 119, var42);
                                }
                                for (int var43 = 4; var43 >= 0; var43--) {
                                    if (var42 != null && var42[var43] != null) {
                                        byte var44 = 0;
                                        class247.field4287++;
                                        if (var43 == 0) {
                                            var44 = 3;
                                        }
                                        if (var43 == 1) {
                                            var44 = 24;
                                        }
                                        if (var43 == 2) {
                                            var44 = 32;
                                        }
                                        if (var43 == 3) {
                                            var44 = 28;
                                        }
                                        if (var43 == 4) {
                                            var44 = 11;
                                        }
                                        class220.method1513(-63, var44, var42[var43], var22, class36.method289(-5615, new class96[] { class91.field1513, var41.field2779 }), (long) var40, var21);
                                    } else if (var43 == 2) {
                                        class220.method1513(-111, (short) 32, class73.field1251, var22, class36.method289(-5615, new class96[] { class91.field1513, var41.field2779 }), (long) var40, var21);
                                        class183.field3180++;
                                    }
                                }
                                class220.method1513(-49, (short) 1001, class258.field4473, var22, class36.method289(-5615, new class96[] { class91.field1513, var41.field2779 }), (long) var40, var21);
                            } else if ((class251.field4343 & 0x1) == 1) {
                                class220.method1513(-95, (short) 35, class75.field1302, var22, class36.method289(-5615, new class96[] { class138.field2478, class233.field3989, var41.field2779 }), (long) var40, var21);
                                class219.field3755++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(JZ)Lmb;")
    public static final class96 method381(long arg0, boolean arg1) {
        field871++;
        class207.field3568.setTime(new Date(arg0));
        int var3 = class207.field3568.get(7);
        int var4 = class207.field3568.get(5);
        int var5 = class207.field3568.get(2);
        int var6 = class207.field3568.get(1);
        int var7 = class207.field3568.get(11);
        int var8 = class207.field3568.get(12);
        int var9 = class207.field3568.get(13);
        return arg1 ? null : class36.method289(-5615, new class96[] { class162.field2879[var3 - 1], field873, class31.method205(var4 / 10, (byte) -78), class31.method205(var4 % 10, (byte) -78), class259.field4484, class259.field4492[var5], class259.field4484, class31.method205(var6, (byte) -78), class239.field4132, class31.method205(var7 / 10, (byte) -78), class31.method205(var7 % 10, (byte) -78), class229.field3887, class31.method205(var8 / 10, (byte) -78), class31.method205(var8 % 10, (byte) -78), class229.field3887, class31.method205(var9 / 10, (byte) -78), class31.method205(var9 % 10, (byte) -78), class207.field3562 });
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
    public static final void method382(boolean arg0) {
        class273.field4744++;
        field874++;
        if (!arg0) {
            method381(-6L, false);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method383(int arg0) {
        field876 = null;
        field879 = null;
        field875 = null;
        int var1 = -39 % ((arg0 - 25) / 61);
        field878 = null;
        field873 = null;
    }
}
