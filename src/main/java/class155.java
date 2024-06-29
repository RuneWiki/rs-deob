import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class155 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field2749 = 0;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "[[Z")
    public static boolean[][] field2752 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Z")
    public static boolean field2759 = false;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lwb;")
    public static class171 field2753;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V", line = 9)
    public static final void method1240(int arg0, int arg1, int arg2) {
        class67.field1074 = client.field4377[arg1][arg2].field522;
        class180.field3038 = client.field4377[arg1][arg2].field515;
        field2757++;
        class32.field453 = client.field4377[arg1][arg2].field525;
        if (arg0 != 2) {
            method1242((class137) null, -72, -72, 5);
        }
        class9.method70((float) class67.field1074, (float) class180.field3038, (float) class32.field453);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method1241(boolean arg0) {
        field2750++;
        if (!arg0) {
            class203.field3453.method470(12);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Llg;III)V", line = 42)
    public static final void method1242(class137 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2393 == 1) {
            class86.method770((short) 49, "", arg0.field2475, 35, -1, 0L, arg0.field2462, 0);
            class258.field4185++;
        }
        if (arg0.field2393 == 2 && !class179.field3027) {
            String var4 = class191.method1445(arg0, 11156);
            if (var4 != null) {
                class152.field2687++;
                class86.method770((short) 14, "<col=00ff00>" + arg0.field2396, var4, 43, -1, 0L, arg0.field2462, -1);
            }
        }
        if (arg0.field2393 == 3) {
            class86.method770((short) 47, "", class37.field547, 55, -1, 0L, arg0.field2462, 0);
            class189.field3174++;
        }
        if (arg0.field2393 == 4) {
            class86.method770((short) 21, "", arg0.field2475, 25, -1, 0L, arg0.field2462, 0);
            class279.field4433++;
        }
        field2760++;
        if (arg0.field2393 == 5) {
            class86.method770((short) 48, "", arg0.field2475, 45, -1, 0L, arg0.field2462, 0);
            class153.field2707++;
        }
        int var5 = 76 % ((arg1 - 2) / 38);
        if (arg0.field2393 == 6 && class107.field1783 == null) {
            class86.method770((short) 42, "", arg0.field2475, 111, -1, 0L, arg0.field2462, -1);
            class127.field2194++;
        }
        if (arg0.field2490 == 2) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.field2443; var7++) {
                for (int var8 = 0; var8 < arg0.field2435; var8++) {
                    int var9 = (arg0.field2544 + 32) * var7;
                    int var10 = (arg0.field2365 + 32) * var8;
                    if (var6 < 20) {
                        var10 += arg0.field2547[var6];
                        var9 += arg0.field2529[var6];
                    }
                    if (arg2 >= var10 && var9 <= arg3 && arg2 < var10 + 32 && arg3 < var9 + 32) {
                        class166.field2902 = arg0;
                        class91.field1437 = var6;
                        if (arg0.field2379[var6] > 0) {
                            class57 var11 = client.method1894(arg0);
                            class134 var12 = class5.method31(-1731690365, arg0.field2379[var6] - 1);
                            if (class93.field1458 == 1 && var11.method521(-69)) {
                                if (class162.field2870 != arg0.field2462 || class30.field432 != var6) {
                                    class305.field4832++;
                                    class86.method770((short) 5, class207.field3516 + " -> <col=ff9040>" + var12.field2346, class198.field3388, 87, -1, (long) var12.field2293, arg0.field2462, var6);
                                }
                            } else if (class179.field3027 && var11.method521(-23)) {
                                class53 var13 = class52.field811 == -1 ? null : class223.method1631(class52.field811, 11);
                                if ((class161.field2861 & 0x10) != 0 && (var13 == null || var12.method1107(class52.field811, true, var13.field832) != var13.field832)) {
                                    class86.method770((short) 50, class28.field386 + " -> <col=ff9040>" + var12.field2346, class50.field784, 102, class292.field4681, (long) var12.field2293, arg0.field2462, var6);
                                    class347.field5531++;
                                }
                            } else {
                                class133.field2268++;
                                String[] var14 = var12.field2330;
                                if (class49.field778) {
                                    var14 = class172.method1354(var14, 17);
                                }
                                if (var11.method521(83)) {
                                    for (int var15 = 4; var15 >= 3; var15--) {
                                        if (var14 != null && var14[var15] != null) {
                                            class122.field2117++;
                                            byte var16;
                                            if (var15 == 3) {
                                                var16 = 36;
                                            } else {
                                                var16 = 7;
                                            }
                                            class86.method770(var16, "<col=ff9040>" + var12.field2346, var14[var15], 117, -1, (long) var12.field2293, arg0.field2462, var6);
                                        }
                                    }
                                }
                                if (var11.method513(1)) {
                                    class86.method770((short) 12, "<col=ff9040>" + var12.field2346, class198.field3388, 37, class12.field166, (long) var12.field2293, arg0.field2462, var6);
                                    class126.field2188++;
                                }
                                if (var11.method521(-114) && var14 != null) {
                                    for (int var17 = 2; var17 >= 0; var17--) {
                                        if (var14[var17] != null) {
                                            byte var18 = 0;
                                            class195.field3317++;
                                            if (var17 == 0) {
                                                var18 = 25;
                                            }
                                            if (var17 == 1) {
                                                var18 = 59;
                                            }
                                            if (var17 == 2) {
                                                var18 = 35;
                                            }
                                            class86.method770(var18, "<col=ff9040>" + var12.field2346, var14[var17], 42, -1, (long) var12.field2293, arg0.field2462, var6);
                                        }
                                    }
                                }
                                String[] var19 = arg0.field2488;
                                if (class49.field778) {
                                    var19 = class172.method1354(var19, 102);
                                }
                                if (var19 != null) {
                                    for (int var20 = 4; var20 >= 0; var20--) {
                                        if (var19[var20] != null) {
                                            class152.field2692++;
                                            byte var21 = 0;
                                            if (var20 == 0) {
                                                var21 = 44;
                                            }
                                            if (var20 == 1) {
                                                var21 = 2;
                                            }
                                            if (var20 == 2) {
                                                var21 = 29;
                                            }
                                            if (var20 == 3) {
                                                var21 = 10;
                                            }
                                            if (var20 == 4) {
                                                var21 = 23;
                                            }
                                            class86.method770(var21, "<col=ff9040>" + var12.field2346, var19[var20], 104, -1, (long) var12.field2293, arg0.field2462, var6);
                                        }
                                    }
                                }
                                class86.method770((short) 1007, "<col=ff9040>" + var12.field2346, class120.field2077, 37, class44.field703, (long) var12.field2293, arg0.field2462, var6);
                            }
                        }
                    }
                    var6++;
                }
            }
        }
        if (!arg0.field2402) {
            return;
        }
        if (!class179.field3027) {
            for (int var22 = 9; var22 >= 5; var22--) {
                String var23 = class113.method965(var22, -32038, arg0);
                if (var23 != null) {
                    class86.method770((short) 1002, arg0.field2492, var23, 88, class79.method729(-86, var22, arg0), (long) (var22 + 1), arg0.field2462, arg0.field2434);
                    class25.field351++;
                }
            }
            String var24 = class191.method1445(arg0, 11156);
            if (var24 != null) {
                class86.method770((short) 14, arg0.field2492, var24, 88, -1, 0L, arg0.field2462, arg0.field2434);
                class152.field2687++;
            }
            for (int var25 = 4; var25 >= 0; var25--) {
                String var26 = class113.method965(var25, -32038, arg0);
                if (var26 != null) {
                    class25.field351++;
                    class86.method770((short) 38, arg0.field2492, var26, 94, class79.method729(-22, var25, arg0), (long) (var25 + 1), arg0.field2462, arg0.field2434);
                }
            }
            if (client.method1894(arg0).method512((byte) 28)) {
                class127.field2194++;
                if (arg0.field2449 == null) {
                    class86.method770((short) 42, "", class246.field3993, 102, -1, 0L, arg0.field2462, arg0.field2434);
                } else {
                    class86.method770((short) 42, "", arg0.field2449, 87, -1, 0L, arg0.field2462, arg0.field2434);
                }
            }
        } else if (client.method1894(arg0).method510((byte) -121) && (class161.field2861 & 0x20) != 0) {
            class156.field2774++;
            class86.method770((short) 11, class28.field386 + " -> " + arg0.field2492, class50.field784, 59, class292.field4681, 0L, arg0.field2462, arg0.field2434);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 367)
    public static void method1243(int arg0) {
        int var1 = -80 / ((arg0 + 36) / 56);
        field2753 = null;
        field2752 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lld;Lcg;Lcg;B)V", line = 376)
    public static final void method1244(class136 arg0, class49 arg1, class49 arg2, byte arg3) {
        class37.field544 = arg2;
        if (arg3 < 107) {
            field2759 = true;
        }
        class220.field3682 = arg1;
        field2754++;
        class97.field1543 = arg0;
        if (class37.field544 != null) {
            class156.field2768 = class37.field544.method455(1, true);
        }
        if (class220.field3682 != null) {
            class38.field578 = class220.field3682.method455(1, true);
        }
    }
}
