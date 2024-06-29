import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class57 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "J")
    public static long field828 = 0L;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field830 = Calendar.getInstance();

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Lsf;")
    public static class108 field834 = class140.method973(255, " ");

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "Lcd;")
    public static class69 field833 = new class69(128);

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "Lsf;")
    public static class108 field839 = class140.method973(255, "(Z");

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "Lsf;")
    public static class108 field836 = class140.method973(255, "(U5");

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "Lsf;")
    public static class108 field837 = class140.method973(255, "::rebuild");

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "[I")
    public static int[] field838;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 13)
    public static final void method395(int arg0) {
        field835++;
        if (arg0 < 49) {
            method396((byte) 48);
        }
        class141 var1 = class206.field3694;
        synchronized (class206.field3694) {
            class134.field2315++;
            class83.field1298 = class211.field3770;
            class317.field5456 = class92.field1475;
            class171.field3116 = class312.field5398;
            class331.field5645 = class295.field5157;
            class87.field1382 = class19.field274;
            class170.field3041 = class232.field4108;
            class100.field1771 = class221.field3930;
            class295.field5157 = 0;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 41)
    public static void method396(byte arg0) {
        field836 = null;
        field838 = null;
        field833 = null;
        field834 = null;
        field837 = null;
        field839 = null;
        int var1 = 69 % ((arg0 + 26) / 48);
        field830 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)Lmh;", line = 73)
    public static final class136 method397(int arg0, int arg1) {
        if (arg0 != 0) {
            field830 = (Calendar) null;
        }
        field832++;
        class136 var2 = (class136) class331.field5651.method642((long) arg1, (byte) -113);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class209.field3729.method1868(12236, class155.method1080(arg1, 23236), class52.method372(arg1, 124));
        class136 var4 = new class136();
        var4.field2364 = arg1;
        if (var3 != null) {
            var4.method931(new class249(var3), -96);
        }
        var4.method941(-110);
        class331.field5651.method643((byte) -49, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIBIII)V", line = 102)
    public static final void method398(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field829++;
        if (class84.field1347 == 0) {
            class129.field2217++;
            int var7 = class64.field1022;
            int var8 = class122.field2080;
            int var9 = class21.field308;
            int var10 = (var7 - var9) * (arg5 - arg6) / arg1 + var9;
            int var11 = class299.field5216;
            int var12 = (arg2 - arg0) * (var11 - var8) / arg4 + var8;
            if (class172.field3132 && (class21.field324 & 0x40) == 64) {
                class98 var13 = class45.method324(class218.field3873, class163.field2927, (byte) 77);
                if (var13 == null) {
                    class307.method2152(arg3 + 96);
                } else {
                    class62.method428(var10, -128, class72.field1103, class173.field3164, 0L, (short) 10, var12);
                }
            } else {
                if (class223.field3947 == 1) {
                    class62.method428(var10, -113, class322.field5514, class63.field1016, 0L, (short) 23, var12);
                }
                class62.method428(var10, -116, class236.field4143, class63.field1016, 0L, (short) 17, var12);
            }
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class289.field5066; var16++) {
            long var17 = class252.field4399[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 7 & 0x7F;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class308.method2157(class295.field5159, var19, var20, var17)) {
                    class60 var23 = class201.method1424(var22, (byte) 117);
                    if (var23.field912 != null) {
                        var23 = var23.method409(arg3 ^ 0xFFFFFFA1);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class84.field1347 == 1) {
                        class163.field2910++;
                        class62.method428(var19, -123, class288.field5045, class117.method833(new class108[] { class331.field5662, class52.field767, var23.field911 }, false), var17, (short) 49, var20);
                    } else if (!class172.field3132) {
                        class326.field5558++;
                        class108[] var24 = var23.field918;
                        if (class324.field5527) {
                            var24 = class26.method174(var24, (byte) 116);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class305.field5296++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 31;
                                    }
                                    if (var25 == 1) {
                                        var26 = 60;
                                    }
                                    if (var25 == 2) {
                                        var26 = 24;
                                    }
                                    if (var25 == 3) {
                                        var26 = 25;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1004;
                                    }
                                    class62.method428(var19, -122, var24[var25], class117.method833(new class108[] { class160.field2867, var23.field911 }, false), var17, var26, var20);
                                }
                            }
                        }
                        class62.method428(var19, -113, class149.field2725, class117.method833(new class108[] { class160.field2867, var23.field911 }, false), (long) var23.field902, (short) 1003, var20);
                    } else if ((class21.field324 & 0x4) == 4) {
                        class34.field460++;
                        class62.method428(var19, -113, class72.field1103, class117.method833(new class108[] { class131.field2248, class52.field767, var23.field911 }, false), var17, (short) 44, var20);
                    }
                }
                if (var21 == 1) {
                    class45 var27 = class159.field2863[var22];
                    if (var27.field646.field2381 == 1 && (var27.field4452 & 0x7F) == 64 && (var27.field4457 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class61.field969; var28++) {
                            class45 var29 = class159.field2863[class168.field3020[var28]];
                            if (var29 != null && var27 != var29 && var29.field646.field2381 == 1 && var27.field4452 == var29.field4452 && var27.field4457 == var29.field4457) {
                                class154.method1076(class168.field3020[var28], var29.field646, var20, var19, -128);
                            }
                        }
                        for (int var30 = 0; var30 < class43.field569; var30++) {
                            class51 var31 = class96.field1558[class194.field3511[var30]];
                            if (var31 != null && var27.field4452 == var31.field4452 && var27.field4457 == var31.field4457) {
                                class14.method93(var31, class194.field3511[var30], var19, -401, var20);
                            }
                        }
                    }
                    class154.method1076(var22, var27.field646, var20, var19, -126);
                }
                if (var21 == 0) {
                    class51 var32 = class96.field1558[var22];
                    if ((var32.field4452 & 0x7F) == 64 && (var32.field4457 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class61.field969; var33++) {
                            class45 var34 = class159.field2863[class168.field3020[var33]];
                            if (var34 != null && var34.field646.field2381 == 1 && var32.field4452 == var34.field4452 && var32.field4457 == var34.field4457) {
                                class154.method1076(class168.field3020[var33], var34.field646, var20, var19, -126);
                            }
                        }
                        for (int var35 = 0; var35 < class43.field569; var35++) {
                            class51 var36 = class96.field1558[class194.field3511[var35]];
                            if (var36 != null && var32 != var36 && var32.field4452 == var36.field4452 && var32.field4457 == var36.field4457) {
                                class14.method93(var36, class194.field3511[var35], var19, -401, var20);
                            }
                        }
                    }
                    class14.method93(var32, var22, var19, arg3 - 306, var20);
                }
                if (var21 == 3) {
                    class1 var37 = class182.field3333[class295.field5159][var19][var20];
                    if (var37 != null) {
                        for (class248 var38 = (class248) var37.method11((byte) 117); var38 != null; var38 = (class248) var37.method1(-121)) {
                            int var39 = var38.field4302.field2724;
                            class145 var40 = class144.method994(true, var39);
                            if (class84.field1347 == 1) {
                                class199.field3585++;
                                class62.method428(var19, -122, class288.field5045, class117.method833(new class108[] { class331.field5662, class216.field3853, var40.field2610 }, false), (long) var39, (short) 40, var20);
                            } else if (!class172.field3132) {
                                class108[] var41 = var40.field2606;
                                if (class324.field5527) {
                                    var41 = class26.method174(var41, (byte) 113);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        class141.field2491++;
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 5;
                                        }
                                        if (var42 == 1) {
                                            var43 = 33;
                                        }
                                        if (var42 == 2) {
                                            var43 = 45;
                                        }
                                        if (var42 == 3) {
                                            var43 = 47;
                                        }
                                        if (var42 == 4) {
                                            var43 = 1;
                                        }
                                        class62.method428(var19, arg3 ^ 0x2E, var41[var42], class117.method833(new class108[] { class320.field5486, var40.field2610 }, false), (long) var39, var43, var20);
                                    } else if (var42 == 2) {
                                        class62.method428(var19, -121, class207.field3711, class117.method833(new class108[] { class320.field5486, var40.field2610 }, false), (long) var39, (short) 45, var20);
                                        class301.field5229++;
                                    }
                                }
                                class145.field2613++;
                                class62.method428(var19, -117, class149.field2725, class117.method833(new class108[] { class320.field5486, var40.field2610 }, false), (long) var39, (short) 1005, var20);
                            } else if ((class21.field324 & 0x1) == 1) {
                                class62.method428(var19, arg3 - 22, class72.field1103, class117.method833(new class108[] { class131.field2248, class216.field3853, var40.field2610 }, false), (long) var39, (short) 46, var20);
                                class183.field3364++;
                            }
                        }
                    }
                }
            }
        }
        if (arg3 != -95) {
            field828 = -15L;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V", line = 432)
    public static final void method399(byte arg0) {
        field831++;
        if (arg0 != 24) {
            field833 = (class69) null;
        }
        class177.field3222.method639(-67);
    }
}
