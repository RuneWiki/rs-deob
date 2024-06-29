import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class236 {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Lsk;")
    public static class199 field4051 = new class199(64);

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "Lw;")
    public static class38 field4060 = new class38(128);

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Lmh;")
    public static class62 field4061 = class201.method1405(true, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field4062 = 0;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V", line = 9)
    public static final void method1662(byte arg0) {
        class267.field4516 &= 0x7FF;
        if (class20.field208 < 128) {
            class20.field208 = 128;
        }
        if (class20.field208 > 383) {
            class20.field208 = 383;
        }
        field4052++;
        int var1 = class170.field2769 >> 7;
        int var2 = class2.field24 >> 7;
        int var3 = class165.method1186((byte) -58, class170.field2769, class2.field24, class7.field85);
        int var4 = 0;
        if (var2 > 3 && var1 > 3 && var2 < 100 && var1 < 100) {
            for (int var5 = var2 - 4; var5 <= var2 + 4; var5++) {
                for (int var6 = var1 - 4; var6 <= var1 + 4; var6++) {
                    int var7 = class7.field85;
                    if (var7 < 3 && (class42.field641[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class37.field569[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class254.field4316) {
            class254.field4316 += (var9 - class254.field4316) / 24;
        } else if (class254.field4316 > var9) {
            class254.field4316 += (var9 - class254.field4316) / 80;
        }
        if (arg0 <= 82) {
            method1664((byte) 13);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 86)
    public static void method1663(int arg0) {
        field4051 = null;
        field4060 = null;
        field4061 = null;
        if (arg0 != 795797038) {
            field4061 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V", line = 109)
    public static final void method1664(byte arg0) {
        class137.method1037(25, false);
        field4059++;
        boolean var1 = true;
        class306.field5260 = 0;
        for (int var2 = 0; var2 < class196.field3328.length; var2++) {
            if (class43.field657[var2] != -1 && class196.field3328[var2] == null) {
                class196.field3328[var2] = class113.field1874.method157(0, class43.field657[var2], (byte) 19);
                if (class196.field3328[var2] == null) {
                    class306.field5260++;
                    var1 = false;
                }
            }
            if (class212.field3566[var2] != -1 && class85.field1382[var2] == null) {
                class85.field1382[var2] = class113.field1874.method140(0, class212.field3566[var2], class284.field4863[var2], -2);
                if (class85.field1382[var2] == null) {
                    var1 = false;
                    class306.field5260++;
                }
            }
            if (class1.field10[var2] != -1 && class256.field4327[var2] == null) {
                class256.field4327[var2] = class113.field1874.method157(0, class1.field10[var2], (byte) 19);
                if (class256.field4327[var2] == null) {
                    class306.field5260++;
                    var1 = false;
                }
            }
            if (class235.field4043[var2] != -1 && class244.field4140[var2] == null) {
                class244.field4140[var2] = class113.field1874.method157(0, class235.field4043[var2], (byte) 19);
                if (class244.field4140[var2] == null) {
                    class306.field5260++;
                    var1 = false;
                }
            }
            if (class150.field2370 != null && class248.field4223[var2] == null && class150.field2370[var2] != -1) {
                class248.field4223[var2] = class113.field1874.method140(0, class150.field2370[var2], class284.field4863[var2], -2);
                if (class248.field4223[var2] == null) {
                    class306.field5260++;
                    var1 = false;
                }
            }
        }
        if (class144.field2296 == null || !class275.field4718.method164(class254.method1772(new class62[] { class144.field2296.field4650, class39.field607 }, arg0 - 105), true)) {
            class270.field4590 = null;
        } else if (class275.field4718.method158(-92, class254.method1772(new class62[] { class144.field2296.field4650, class39.field607 }, arg0 ^ 0x69))) {
            class270.field4590 = class19.method79(class254.method1772(new class62[] { class144.field2296.field4650, class39.field607 }, arg0 ^ 0x69), (byte) 78, class275.field4718);
        } else {
            var1 = false;
            class306.field5260++;
        }
        if (!var1) {
            class148.field2335 = 1;
            return;
        }
        class290.field4930 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class196.field3328.length; var4++) {
            byte[] var5 = class85.field1382[var4];
            if (var5 != null) {
                int var6 = (class39.field608[var4] & 0xFF) * 64 - class290.field4936;
                int var7 = (class39.field608[var4] >> 8) * 64 - class120.field2006;
                if (class80.field1335) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class308.method2101(var6, var7, arg0 + 3957, var5);
            }
            byte[] var8 = class244.field4140[var4];
            if (var8 != null) {
                int var9 = (class39.field608[var4] >> 8) * 64 - class120.field2006;
                int var10 = (class39.field608[var4] & 0xFF) * 64 - class290.field4936;
                if (class80.field1335) {
                    var9 = 10;
                    var10 = 10;
                }
                var3 &= class308.method2101(var10, var9, 4062, var8);
            }
        }
        if (!var3) {
            class148.field2335 = 2;
            return;
        }
        boolean var11 = false;
        if (class148.field2335 != 0) {
            class17.method67(class254.method1772(new class62[] { class74.field1139, class134.field2176 }, 0), true, arg0 - 95);
        }
        class209.method1460(119);
        class190.method1325((byte) -75);
        class52.method340();
        for (int var12 = 0; var12 < class196.field3328.length; var12++) {
            if (class244.field4140[var12] != null || class256.field4327[var12] != null) {
                var11 = true;
                break;
            }
        }
        if (!class72.field1107) {
            var11 = false;
        }
        if (var11) {
            class230.method1627(1);
        } else {
            class229.method1617();
        }
        for (int var13 = 0; var13 < 4; var13++) {
            class250.field4244[var13].method1560(-35);
        }
        if (arg0 != 105) {
            method1666(90L, 46);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class42.field641[var14][var15][var16] = 0;
                }
            }
        }
        class161.method1171(arg0 + 261386, false);
        class168.field2735.method396();
        for (int var17 = 0; var17 < 13; var17++) {
            for (int var18 = 0; var18 < 13; var18++) {
                class168.field2732[var17][var18].field357 = true;
            }
        }
        class117.method915();
        class73.method526((byte) -36);
        class209.method1460(103);
        System.gc();
        class137.method1037(arg0 ^ 0x70, true);
        class192.method1345(false, 104);
        if (!class80.field1335) {
            class297.method2007((byte) 27, false);
            class137.method1037(25, true);
            int var19 = class268.field4551.field3846[0] >> 3;
            int var20 = class268.field4551.field3828[0] >> 3;
            class307.method2094(var20, -60, var19);
            class185.method1294(false, arg0 ^ 0x93B);
            if (class248.field4223 != null) {
                class294.method2001(false);
            }
        }
        if (class80.field1335) {
            class77.method598((byte) -29, false);
            class137.method1037(25, true);
            int var21 = class268.field4551.field3828[0] >> 3;
            int var22 = class268.field4551.field3846[0] >> 3;
            class307.method2094(var21, -60, var22);
            class171.method1229(false, false);
        }
        class190.method1325((byte) -75);
        class137.method1037(25, true);
        class209.method1465(false, true, class250.field4244);
        class117.method910();
        class137.method1037(25, true);
        int var23 = class169.field2737;
        if (class7.field85 < var23) {
            var23 = class7.field85;
        }
        if (var23 < class7.field85 - 1) {
            int var24 = class7.field85 - 1;
        }
        if (class149.method1073((byte) 95)) {
            class187.method1313(0);
        } else {
            class187.method1313(class169.field2737);
        }
        class186.method1301(arg0 ^ 0xFFFFE73D);
        if (var11) {
            class250.method1743(true);
            class192.method1345(true, arg0 ^ 0x1);
            if (!class80.field1335) {
                class297.method2007((byte) -99, true);
                class137.method1037(25, true);
                class185.method1294(true, 2386);
            }
            if (class80.field1335) {
                class77.method598((byte) -29, true);
                class137.method1037(25, true);
                class171.method1229(true, false);
            }
            class190.method1325((byte) -75);
            class137.method1037(25, true);
            class209.method1465(true, true, class250.field4244);
            class137.method1037(25, true);
            class186.method1301(-6316);
            class250.method1743(false);
        }
        for (int var25 = 0; var25 < 13; var25++) {
            for (int var26 = 0; var26 < 13; var26++) {
                class168.field2732[var25][var26].method169(class37.field569[0], var25 * 8, var26 * 8);
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class262.method1815(var28, var27, (byte) -77);
            }
        }
        class170.method1226(2);
        class209.method1460(125);
        class96.method766(0);
        class190.method1325((byte) -75);
        if (class216.field3686 != null && class200.field3381 != null && class118.field1983 == 25) {
            class195.field3299++;
            class170.field2772.method1693(73, false);
            class170.field2772.method712(1057001181, -104);
        }
        if (!class80.field1335) {
            int var29 = (class237.field4066 - 6) / 8;
            int var30 = (class2.field30 + 6) / 8;
            int var31 = (class237.field4066 + 6) / 8;
            int var32 = (class2.field30 - 6) / 8;
            for (int var33 = var32 - 1; var33 <= var30 + 1; var33++) {
                for (int var34 = var29 - 1; var34 <= (var31 + 1); var34++) {
                    if (var33 < var32 || var30 < var33 || var34 < var29 || var31 < var34) {
                        class113.field1874.method160(class254.method1772(new class62[] { class94.field1542, class42.method284(var33, -128), class155.field2498, class42.method284(var34, arg0 ^ 0xFFFFFFE0) }, 0), arg0 ^ 0x4DDB);
                        class113.field1874.method160(class254.method1772(new class62[] { class99.field1642, class42.method284(var33, -121), class155.field2498, class42.method284(var34, -117) }, arg0 ^ 0x69), 19890);
                    }
                }
            }
        }
        if (class118.field1983 == 28) {
            class276.method1889(-128, 10);
        } else {
            class276.method1889(arg0 ^ 0xFFFFFFE9, 30);
            if (class200.field3381 != null) {
                class170.field2772.method1693(227, false);
            }
        }
        class209.method1460(123);
        class176.method1239((byte) -94);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BIZII[Lsg;)V", line = 616)
    public static final void method1665(byte arg0, int arg1, boolean arg2, int arg3, int arg4, class191[] arg5) {
        field4057++;
        if (arg0 <= 84) {
            method1669(-64, 32, (class26) null, -57);
        }
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class191 var7 = arg5[var6];
            if (var7 != null && var7.field3074 == arg3) {
                class96.method769(arg2, arg4, var7, 1, arg1);
                class53.method341(arg4, 20205, arg1, var7);
                if (var7.field3073 > (var7.field3149 - var7.field3190)) {
                    var7.field3073 = var7.field3149 - var7.field3190;
                }
                if (var7.field3188 > var7.field3067 - var7.field3126) {
                    var7.field3188 = var7.field3067 - var7.field3126;
                }
                if (var7.field3188 < 0) {
                    var7.field3188 = 0;
                }
                if (var7.field3073 < 0) {
                    var7.field3073 = 0;
                }
                if (var7.field3068 == 0) {
                    class192.method1347(-1908822544, arg2, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(JI)Lmh;", line = 688)
    public static final class62 method1666(long arg0, int arg1) {
        class4.field33.setTime(new Date(arg0));
        int var3 = class4.field33.get(7);
        field4056++;
        int var4 = class4.field33.get(5);
        int var5 = class4.field33.get(2);
        int var6 = class4.field33.get(1);
        if (arg1 <= 49) {
            method1662((byte) -91);
        }
        int var7 = class4.field33.get(11);
        int var8 = class4.field33.get(12);
        int var9 = class4.field33.get(13);
        return class254.method1772(new class62[] { class306.field5256[var3 - 1], class244.field4148, class42.method284(var4 / 10, -123), class42.method284(var4 % 10, -125), class122.field2029, class169.field2739[var5], class122.field2029, class42.method284(var6, -123), class286.field4894, class42.method284(var7 / 10, -117), class42.method284(var7 % 10, -127), class163.field2646, class42.method284(var8 / 10, -123), class42.method284(var8 % 10, -123), class163.field2646, class42.method284(var9 / 10, -123), class42.method284(var9 % 10, -121), class41.field633 }, 0);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lmi;Z)Lrg;", line = 741)
    public static final class270 method1667(class92 arg0, boolean arg1) {
        field4055++;
        arg0.method702(-1);
        int var2 = arg0.method702(-1);
        class270 var3 = class196.method1377(-35, var2);
        var3.field4578 = arg0.method702(-1);
        int var4 = arg0.method702(-1);
        if (!arg1) {
            field4060 = (class38) null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method702(-1);
            var3.method8(arg0, var6, 127);
        }
        var3.method231((byte) 90);
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII)V", line = 785)
    public static final void method1668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4058++;
        if (arg3 < 110) {
            field4061 = (class62) null;
        }
        long var6 = class150.method1080(arg5, arg0, arg2);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int var9 = ((int) var6 & 0x7FB84) >> 14;
            int var10 = arg4;
            int var11 = (52736 - (arg2 * 512)) * 4 + (arg0 * 4) + 24624;
            if (var6 > 0L) {
                var10 = arg1;
            }
            int[] var12 = class280.field4795;
            int var13 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            class216 var14 = class252.method1755(var13, (byte) -65);
            if (var14.field3725 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var12[var11] = var10;
                        var12[var11 + 512] = var10;
                        var12[var11 + 1024] = var10;
                        var12[var11 + 1536] = var10;
                    } else if (var8 == 1) {
                        var12[var11] = var10;
                        var12[var11 + 1] = var10;
                        var12[var11 + 2] = var10;
                        var12[var11 + 3] = var10;
                    } else if (var8 == 2) {
                        var12[var11 + 3] = var10;
                        var12[var11 + 512 + 3] = var10;
                        var12[var11 + 3 + 1024] = var10;
                        var12[var11 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var12[var11 + 1536] = var10;
                        var12[var11 + 1 + 1536] = var10;
                        var12[var11 + 1536 + 2] = var10;
                        var12[var11 + 1539] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var12[var11] = var10;
                    } else if (var8 == 1) {
                        var12[var11 + 3] = var10;
                    } else if (var8 == 2) {
                        var12[var11 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var12[var11 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var12[var11] = var10;
                        var12[var11 + 512] = var10;
                        var12[var11 + 1024] = var10;
                        var12[var11 + 1536] = var10;
                    } else if (var8 == 0) {
                        var12[var11] = var10;
                        var12[var11 + 1] = var10;
                        var12[var11 + 2] = var10;
                        var12[var11 + 3] = var10;
                    } else if (var8 == 1) {
                        var12[var11 + 3] = var10;
                        var12[var11 + 515] = var10;
                        var12[var11 + 3 + 1024] = var10;
                        var12[var11 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var12[var11 + 1536] = var10;
                        var12[var11 + 1537] = var10;
                        var12[var11 + 1536 + 2] = var10;
                        var12[var11 + 1536 + 3] = var10;
                    }
                }
            } else {
                class61 var15 = null;
                if (!var14.field3685) {
                    var15 = class108.field1748[var14.field3725];
                } else if (var8 == 0) {
                    var15 = class108.field1748[var14.field3725];
                } else if (var8 == 1) {
                    var15 = class192.field3233[var14.field3725];
                } else if (var8 == 2) {
                    var15 = class212.field3567[var14.field3725];
                } else if (var8 == 3) {
                    var15 = class220.field3788[var14.field3725];
                }
                if (var15 != null) {
                    int var16 = (var14.field3669 * 4 - var15.field276) / 2;
                    int var17 = (var14.field3676 * 4 - var15.field261) / 2;
                    var15.method124(arg0 * 4 + var16 + 48, (-arg2 + 104 - var14.field3676) * 4 + 48 + var17);
                }
            }
        }
        long var18 = class240.method1682(arg5, arg0, arg2);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            int var22 = (int) var18 >> 14 & 0x1F;
            class216 var23 = class252.method1755(var21, (byte) -109);
            if (var23.field3725 != -1) {
                class61 var24 = null;
                if (!var23.field3685) {
                    var24 = class108.field1748[var23.field3725];
                } else if (var20 == 0) {
                    var24 = class108.field1748[var23.field3725];
                } else if (var20 == 1) {
                    var24 = class192.field3233[var23.field3725];
                } else if (var20 == 2) {
                    var24 = class212.field3567[var23.field3725];
                } else if (var20 == 3) {
                    var24 = class220.field3788[var23.field3725];
                }
                if (var24 != null) {
                    int var25 = (var23.field3676 * 4 - var24.field261) / 2;
                    int var26 = (var23.field3669 * 4 - var24.field276) / 2;
                    var24.method124(arg0 * 4 + (var26 + 48), (-arg2 + 104 - var23.field3676) * 4 + (48 - -var25));
                }
            } else if (var22 == 9) {
                int[] var27 = class280.field4795;
                int var28 = 15658734;
                int var29 = arg0 * 4 + (103 - arg2) * 512 * 4 + 24624;
                if (var18 > 0L) {
                    var28 = 15597568;
                }
                if (var20 == 0 || var20 == 2) {
                    var27[var29 + 1536] = var28;
                    var27[var29 + 1 + 1024] = var28;
                    var27[var29 + 514] = var28;
                    var27[var29 + 3] = var28;
                } else {
                    var27[var29] = var28;
                    var27[var29 + 513] = var28;
                    var27[var29 + 1024 + 2] = var28;
                    var27[var29 + 3 + 1536] = var28;
                }
            }
        }
        long var30 = class44.method290(arg5, arg0, arg2);
        if (var30 == 0L) {
            return;
        }
        int var32 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
        int var33 = ((int) var30 & 0x3CC318) >> 20;
        class216 var34 = class252.method1755(var32, (byte) -51);
        if (var34.field3725 == -1) {
            return;
        }
        class61 var35 = null;
        if (!var34.field3685) {
            var35 = class108.field1748[var34.field3725];
        } else if (var33 == 0) {
            var35 = class108.field1748[var34.field3725];
        } else if (var33 == 1) {
            var35 = class192.field3233[var34.field3725];
        } else if (var33 == 2) {
            var35 = class212.field3567[var34.field3725];
        } else if (var33 == 3) {
            var35 = class220.field3788[var34.field3725];
        }
        if (var35 != null) {
            int var36 = (var34.field3676 * 4 - var35.field261) / 2;
            int var37 = (var34.field3669 * 4 - var35.field276) / 2;
            var35.method124(arg0 * 4 + var37 + 48, (-arg2 + 104 + -var34.field3676) * 4 + var36 + 48);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILhi;I)[Lwj;", line = 1088)
    public static final class135[] method1669(int arg0, int arg1, class26 arg2, int arg3) {
        field4053++;
        if (class127.method951(arg2, arg3, 92, arg0)) {
            return arg1 > -10 ? (class135[]) null : class135.method1027((byte) -112);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIBI)V", line = 1123)
    public static final void method1670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field4054++;
        if (arg7 != -69) {
            return;
        }
        int var9 = arg2 - arg8;
        int var10 = arg6 - arg1;
        int var11 = (arg4 - arg3 << 16) / var10;
        int var12 = (arg0 - arg5 << 16) / var9;
        class284.method1936(arg6, arg5, arg3, false, var12, arg2, 0, arg1, arg8, 0, var11);
    }
}
