import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class94 {

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field1778 = 0;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field1780 = 0;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field1775 = 0;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field1785 = 0;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Lsf;")
    public static class33 field1772 = new class33();

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "[I")
    public static int[] field1770;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "[[[B")
    public static byte[][][] field1781;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
    public static final void method686(int arg0, int arg1, int arg2) {
        if (class26.field513 != 0 && arg2 != -1) {
            class57.method437(false, class26.field513, class40.field831, arg2, 0, arg1 - 681);
            class246.field4259 = true;
        }
        field1779++;
        if (arg1 != -20579) {
            method691((class164) null, 32, (byte) -1);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method687(int arg0) {
        field1770 = null;
        field1781 = null;
        field1772 = null;
        if (arg0 != -3571) {
            method693(-110, (byte) 33);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Llc;")
    public static final class90 method688(byte arg0) {
        field1777++;
        if (arg0 > -29) {
            method687(69);
        }
        class155 var1 = new class155(class20.field427, class9.field184, class57.field1212[0], class154.field2701[0], class72.field1411[0], class193.field3287[0], class137.field2454[0], class3.field92);
        class126.method875(false);
        return var1;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IJ)Lia;")
    public static final class257 method689(int arg0, long arg1) {
        class76.field1474.setTime(new Date(arg1));
        field1783++;
        int var3 = class76.field1474.get(7);
        if (arg0 != 10) {
            method693(-127, (byte) -60);
        }
        int var4 = class76.field1474.get(5);
        int var5 = class76.field1474.get(2);
        int var6 = class76.field1474.get(1);
        int var7 = class76.field1474.get(11);
        int var8 = class76.field1474.get(12);
        int var9 = class76.field1474.get(13);
        return class233.method1528(new class257[] { class39.field774[var3 - 1], class135.field2417, class111.method808(arg0, var4 / 10), class111.method808(10, var4 % 10), class201.field3445, class11.field217[var5], class201.field3445, class111.method808(10, var6), class230.field3866, class111.method808(10, var7 / 10), class111.method808(10, var7 % 10), class195.field3306, class111.method808(10, var8 / 10), class111.method808(10, var8 % 10), class195.field3306, class111.method808(arg0, var9 / 10), class111.method808(10, var9 % 10), class144.field2527 }, 0);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIZLme;)V")
    public static final void method690(int arg0, int arg1, boolean arg2, class44 arg3) {
        field1776++;
        if (class78.field1516 != null || class216.field3663 || arg3 == null || class115.method820(-2154, arg3) == null) {
            return;
        }
        class78.field1516 = arg3;
        class239.field4110 = class115.method820(-2154, arg3);
        class205.field3515 = arg0;
        class80.field1561 = 0;
        client.field1541 = arg2;
        class161.field2823 = arg1;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lo;IB)V")
    public static final void method691(class164 arg0, int arg1, byte arg2) {
        field1782++;
        Object[] var3 = arg0.field2867;
        int var4 = (Integer) var3[0];
        class19 var5 = class135.method934(2048, var4);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        class211.field3614 = 0;
        int var7 = -1;
        int[] var8 = var5.field398;
        int var9 = 0;
        byte var10 = -1;
        int[] var11 = var5.field395;
        try {
            class253.field4355 = new class257[var5.field412];
            int var12 = 0;
            int var13 = 0;
            class27.field526 = new int[var5.field396];
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg0.field2862;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field2863;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field2864 == null ? -1 : arg0.field2864.field935;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field2858;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field2864 == null ? -1 : arg0.field2864.field890;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field2865 == null ? -1 : arg0.field2865.field935;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field2865 == null ? -1 : arg0.field2865.field890;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field2868;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field2859;
                    }
                    class27.field526[var12++] = var16;
                } else if (var3[var14] instanceof class257) {
                    class257 var15 = (class257) var3[var14];
                    if (var15.method1706(class260.field4517, -1)) {
                        var15 = arg0.field2860;
                    }
                    class253.field4355[var13++] = var15;
                }
            }
            if (arg2 < 111) {
                method693(112, (byte) 123);
            }
            int var17 = 0;
            label3283: while (true) {
                var17++;
                if (var17 > arg1) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var434 = var8[var7];
                if (var434 < 100) {
                    if (var434 == 0) {
                        class3.field89[var6++] = var11[var7];
                        continue;
                    }
                    if (var434 == 1) {
                        int var18 = var11[var7];
                        class3.field89[var6++] = class117.field2100[var18];
                        continue;
                    }
                    if (var434 == 2) {
                        int var19 = var11[var7];
                        var6--;
                        class213.method1433(class3.field89[var6], var19, 256);
                        continue;
                    }
                    if (var434 == 3) {
                        class140.field2496[var9++] = var5.field410[var7];
                        continue;
                    }
                    if (var434 == 6) {
                        var7 += var11[var7];
                        continue;
                    }
                    if (var434 == 7) {
                        var6 -= 2;
                        if (class3.field89[var6 + 1] != class3.field89[var6]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var434 == 8) {
                        var6 -= 2;
                        if (class3.field89[var6 + 1] == class3.field89[var6]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var434 == 9) {
                        var6 -= 2;
                        if (class3.field89[var6] < class3.field89[var6 + 1]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var434 == 10) {
                        var6 -= 2;
                        if (class3.field89[var6 + 1] < class3.field89[var6]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var434 == 21) {
                        if (class211.field3614 == 0) {
                            return;
                        }
                        class225 var20 = class189.field3258[--class211.field3614];
                        class27.field526 = var20.field3782;
                        var7 = var20.field3784;
                        var5 = var20.field3783;
                        class253.field4355 = var20.field3774;
                        var8 = var5.field398;
                        var11 = var5.field395;
                        continue;
                    }
                    if (var434 == 25) {
                        int var21 = var11[var7];
                        class3.field89[var6++] = class230.method1500(-105, var21);
                        continue;
                    }
                    if (var434 == 27) {
                        int var22 = var11[var7];
                        var6--;
                        class146.method990(var22, class3.field89[var6], (byte) -121);
                        continue;
                    }
                    if (var434 == 31) {
                        var6 -= 2;
                        if (class3.field89[var6 + 1] >= class3.field89[var6]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var434 == 32) {
                        var6 -= 2;
                        if (class3.field89[var6 + 1] <= class3.field89[var6]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var434 == 33) {
                        class3.field89[var6++] = class27.field526[var11[var7]];
                        continue;
                    }
                    int var10001;
                    if (var434 == 34) {
                        var10001 = var11[var7];
                        var6--;
                        class27.field526[var10001] = class3.field89[var6];
                        continue;
                    }
                    if (var434 == 35) {
                        class140.field2496[var9++] = class253.field4355[var11[var7]];
                        continue;
                    }
                    if (var434 == 36) {
                        var10001 = var11[var7];
                        var9--;
                        class253.field4355[var10001] = class140.field2496[var9];
                        continue;
                    }
                    if (var434 == 37) {
                        int var23 = var11[var7];
                        var9 -= var23;
                        class257 var24 = class70.method532(var23, class140.field2496, true, var9);
                        class140.field2496[var9++] = var24;
                        continue;
                    }
                    if (var434 == 38) {
                        var6--;
                        continue;
                    }
                    if (var434 == 39) {
                        var9--;
                        continue;
                    }
                    if (var434 == 40) {
                        int var25 = var11[var7];
                        class19 var26 = class135.method934(2048, var25);
                        int[] var27 = new int[var26.field396];
                        class257[] var28 = new class257[var26.field412];
                        for (int var29 = 0; var29 < var26.field408; var29++) {
                            var27[var29] = class3.field89[var6 + var29 - var26.field408];
                        }
                        for (int var30 = 0; var30 < var26.field406; var30++) {
                            var28[var30] = class140.field2496[var9 + var30 - var26.field406];
                        }
                        var9 -= var26.field406;
                        var6 -= var26.field408;
                        class225 var31 = new class225();
                        var31.field3782 = class27.field526;
                        var31.field3783 = var5;
                        var31.field3774 = class253.field4355;
                        var31.field3784 = var7;
                        if (class189.field3258.length <= class211.field3614) {
                            throw new RuntimeException();
                        }
                        class189.field3258[class211.field3614++] = var31;
                        var7 = -1;
                        class27.field526 = var27;
                        class253.field4355 = var28;
                        var5 = var26;
                        var11 = var26.field395;
                        var8 = var26.field398;
                        continue;
                    }
                    if (var434 == 42) {
                        class3.field89[var6++] = class221.field3740[var11[var7]];
                        continue;
                    }
                    if (var434 == 43) {
                        int var32 = var11[var7];
                        var6--;
                        class221.field3740[var32] = class3.field89[var6];
                        client.method586(-85, var32);
                        continue;
                    }
                    if (var434 == 44) {
                        int var33 = var11[var7] >> 16;
                        int var34 = var11[var7] & 0xFFFF;
                        var6--;
                        int var35 = class3.field89[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class102.field1892[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label3283;
                                }
                                class198.field3342[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var434 == 45) {
                        int var38 = var11[var7];
                        var6--;
                        int var39 = class3.field89[var6];
                        if (var39 >= 0 && class102.field1892[var38] > var39) {
                            class3.field89[var6++] = class198.field3342[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var434 == 46) {
                        var6 -= 2;
                        int var40 = var11[var7];
                        int var41 = class3.field89[var6];
                        if (var41 >= 0 && class102.field1892[var40] > var41) {
                            class198.field3342[var40][var41] = class3.field89[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var434 == 47) {
                        class257 var42 = class133.field2385[var11[var7]];
                        if (var42 == null) {
                            var42 = class89.field1717;
                        }
                        class140.field2496[var9++] = var42;
                        continue;
                    }
                    if (var434 == 48) {
                        int var43 = var11[var7];
                        var9--;
                        class133.field2385[var43] = class140.field2496[var9];
                        class205.method1377(var43, (byte) 122);
                        continue;
                    }
                    if (var434 == 51) {
                        class56 var44 = var5.field413[var11[var7]];
                        var6--;
                        class220 var45 = (class220) var44.method434((byte) -93, (long) class3.field89[var6]);
                        if (var45 != null) {
                            var7 += var45.field3726;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var11[var7] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var434 < 300) {
                    if (var434 == 100) {
                        var6 -= 3;
                        int var413 = class3.field89[var6 + 2];
                        int var414 = class3.field89[var6 + 1];
                        int var415 = class3.field89[var6];
                        if (var414 == 0) {
                            throw new RuntimeException();
                        }
                        class44 var416 = class221.method1456(var415, (byte) -123);
                        if (var416.field1015 == null) {
                            var416.field1015 = new class44[var413 + 1];
                        }
                        if (var416.field1015.length <= var413) {
                            class44[] var417 = new class44[var413 + 1];
                            for (int var418 = 0; var418 < var416.field1015.length; var418++) {
                                var417[var418] = var416.field1015[var418];
                            }
                            var416.field1015 = var417;
                        }
                        if (var413 > 0 && var416.field1015[var413 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var413 - 1));
                        }
                        class44 var419 = new class44();
                        var419.field890 = var413;
                        var419.field871 = var414;
                        var419.field990 = true;
                        var419.field885 = var419.field935 = var416.field935;
                        var416.field1015[var413] = var419;
                        if (var46) {
                            class231.field3884 = var419;
                        } else {
                            class83.field1608 = var419;
                        }
                        class257.method1718(false, var416);
                        continue;
                    }
                    if (var434 == 101) {
                        class44 var420 = var46 ? class231.field3884 : class83.field1608;
                        if (var420.field890 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class44 var421 = class221.method1456(var420.field935, (byte) -110);
                        var421.field1015[var420.field890] = null;
                        class257.method1718(false, var421);
                        continue;
                    }
                    if (var434 == 102) {
                        var6--;
                        class44 var422 = class221.method1456(class3.field89[var6], (byte) -91);
                        var422.field1015 = null;
                        class257.method1718(false, var422);
                        continue;
                    }
                    if (var434 == 200) {
                        var6 -= 2;
                        int var423 = class3.field89[var6 + 1];
                        int var424 = class3.field89[var6];
                        class44 var425 = class148.method996(var424, -1, var423);
                        if (var425 != null && var423 != -1) {
                            class3.field89[var6++] = 1;
                            if (var46) {
                                class231.field3884 = var425;
                            } else {
                                class83.field1608 = var425;
                            }
                            continue;
                        }
                        class3.field89[var6++] = 0;
                        continue;
                    }
                    if (var434 == 201) {
                        var6--;
                        int var426 = class3.field89[var6];
                        class44 var427 = class221.method1456(var426, (byte) -51);
                        if (var427 == null) {
                            class3.field89[var6++] = 0;
                        } else {
                            class3.field89[var6++] = 1;
                            if (var46) {
                                class231.field3884 = var427;
                            } else {
                                class83.field1608 = var427;
                            }
                        }
                        continue;
                    }
                } else if (var434 < 500) {
                    if (var434 == 403) {
                        var6 -= 2;
                        int var408 = class3.field89[var6];
                        if (var408 >= 7) {
                            var408 -= 7;
                        }
                        int var409 = class3.field89[var6 + 1];
                        class137.field2441.field3108.method1607(var409, var408, -6453);
                        continue;
                    }
                    if (var434 == 404) {
                        var6 -= 2;
                        int var410 = class3.field89[var6];
                        int var411 = class3.field89[var6 + 1];
                        class137.field2441.field3108.method1603(var410, var411, 6324);
                        continue;
                    }
                    if (var434 == 410) {
                        var6--;
                        boolean var412 = class3.field89[var6] != 0;
                        class137.field2441.field3108.method1598(var412, 0);
                        continue;
                    }
                } else if (!(var434 < 1000 || var434 >= 1100) || !(var434 < 2000 || var434 >= 2100)) {
                    class44 var402;
                    if (var434 >= 2000) {
                        var6--;
                        var402 = class221.method1456(class3.field89[var6], (byte) -33);
                        var434 -= 1000;
                    } else {
                        var402 = var46 ? class231.field3884 : class83.field1608;
                    }
                    if (var434 == 1000) {
                        var6 -= 4;
                        var402.field979 = class3.field89[var6];
                        var402.field877 = class3.field89[var6 + 1];
                        int var403 = class3.field89[var6 + 2];
                        if (var403 < 0) {
                            var403 = 0;
                        } else if (var403 > 5) {
                            var403 = 5;
                        }
                        int var404 = class3.field89[var6 + 3];
                        var402.field931 = (byte) var403;
                        if (var404 < 0) {
                            var404 = 0;
                        } else if (var404 > 5) {
                            var404 = 5;
                        }
                        var402.field918 = (byte) var404;
                        class257.method1718(false, var402);
                        class191.method1295(250, var402);
                        continue;
                    }
                    if (var434 == 1001) {
                        var6 -= 4;
                        var402.field1019 = class3.field89[var6];
                        var402.field912 = class3.field89[var6 + 1];
                        var402.field884 = 0;
                        var402.field987 = 0;
                        int var405 = class3.field89[var6 + 3];
                        int var406 = class3.field89[var6 + 2];
                        if (var406 < 0) {
                            var406 = 0;
                        } else if (var406 > 4) {
                            var406 = 4;
                        }
                        if (var405 < 0) {
                            var405 = 0;
                        } else if (var405 > 4) {
                            var405 = 4;
                        }
                        var402.field950 = (byte) var406;
                        var402.field864 = (byte) var405;
                        class257.method1718(false, var402);
                        if (var402.field871 == 0) {
                            class229.method1496(false, (byte) -73, var402);
                        }
                        class191.method1295(250, var402);
                        continue;
                    }
                    if (var434 == 1003) {
                        var6--;
                        boolean var407 = class3.field89[var6] == 1;
                        if (var407 != var402.field970) {
                            var402.field970 = var407;
                            class257.method1718(false, var402);
                        }
                        continue;
                    }
                    if (var434 == 1004) {
                        var6 -= 2;
                        var402.field921 = class3.field89[var6];
                        var402.field872 = class3.field89[var6 + 1];
                        class257.method1718(false, var402);
                        if (var402.field871 == 0) {
                            class229.method1496(false, (byte) 117, var402);
                        }
                        class191.method1295(250, var402);
                        continue;
                    }
                } else if (var434 >= 1100 && var434 < 1200 || var434 >= 2100 && var434 < 2200) {
                    class44 var399;
                    if (var434 >= 2000) {
                        var6--;
                        var399 = class221.method1456(class3.field89[var6], (byte) -93);
                        var434 -= 1000;
                    } else {
                        var399 = var46 ? class231.field3884 : class83.field1608;
                    }
                    if (var434 == 1100) {
                        var6 -= 2;
                        var399.field992 = class3.field89[var6];
                        if (var399.field992 > var399.field991 - var399.field926) {
                            var399.field992 = var399.field991 - var399.field926;
                        }
                        if (var399.field992 < 0) {
                            var399.field992 = 0;
                        }
                        var399.field873 = class3.field89[var6 + 1];
                        if ((var399.field947 - var399.field981) < var399.field873) {
                            var399.field873 = var399.field947 - var399.field981;
                        }
                        if (var399.field873 < 0) {
                            var399.field873 = 0;
                        }
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1101) {
                        var6--;
                        var399.field1018 = class3.field89[var6];
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1102) {
                        var6--;
                        var399.field941 = class3.field89[var6] == 1;
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1103) {
                        var6--;
                        var399.field940 = class3.field89[var6];
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1104) {
                        var6--;
                        var399.field937 = class3.field89[var6];
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1105) {
                        var6--;
                        var399.field956 = class3.field89[var6];
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1106) {
                        var6--;
                        var399.field1007 = class3.field89[var6];
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1107) {
                        var6--;
                        var399.field920 = class3.field89[var6] == 1;
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1108) {
                        var399.field959 = 1;
                        var6--;
                        var399.field930 = class3.field89[var6];
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1109) {
                        var6 -= 6;
                        var399.field901 = class3.field89[var6];
                        var399.field961 = class3.field89[var6 + 1];
                        var399.field870 = class3.field89[var6 + 2];
                        var399.field966 = class3.field89[var6 + 3];
                        var399.field968 = class3.field89[var6 + 4];
                        var399.field995 = class3.field89[var6 + 5];
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1110) {
                        var6--;
                        int var400 = class3.field89[var6];
                        if (var399.field878 != var400) {
                            var399.field955 = 0;
                            var399.field903 = 0;
                            var399.field878 = var400;
                            class257.method1718(false, var399);
                        }
                        continue;
                    }
                    if (var434 == 1111) {
                        var6--;
                        var399.field1016 = class3.field89[var6] == 1;
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1112) {
                        var9--;
                        class257 var401 = class140.field2496[var9];
                        if (!var401.method1706(var399.field965, -1)) {
                            var399.field965 = var401;
                            class257.method1718(false, var399);
                        }
                        continue;
                    }
                    if (var434 == 1113) {
                        var6--;
                        var399.field1000 = class3.field89[var6];
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1114) {
                        var6 -= 3;
                        var399.field876 = class3.field89[var6];
                        var399.field983 = class3.field89[var6 + 1];
                        var399.field866 = class3.field89[var6 + 2];
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1115) {
                        var6--;
                        var399.field916 = class3.field89[var6] == 1;
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1116) {
                        var6--;
                        var399.field1028 = class3.field89[var6];
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1117) {
                        var6--;
                        var399.field964 = class3.field89[var6];
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1118) {
                        var6--;
                        var399.field913 = class3.field89[var6] == 1;
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1119) {
                        var6--;
                        var399.field1003 = class3.field89[var6] == 1;
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1120) {
                        var6 -= 2;
                        var399.field991 = class3.field89[var6];
                        var399.field947 = class3.field89[var6 + 1];
                        class257.method1718(false, var399);
                        if (var399.field871 == 0) {
                            class229.method1496(false, (byte) 120, var399);
                        }
                        continue;
                    }
                    if (var434 == 1121) {
                        var6 -= 2;
                        class257.method1718(false, var399);
                        continue;
                    }
                    if (var434 == 1122) {
                        var6--;
                        var399.field1001 = class3.field89[var6] == 1;
                        class257.method1718(false, var399);
                        continue;
                    }
                } else if (var434 >= 1200 && var434 < 1300 || var434 >= 2200 && var434 < 2300) {
                    class44 var395;
                    if (var434 < 2000) {
                        var395 = var46 ? class231.field3884 : class83.field1608;
                    } else {
                        var434 -= 1000;
                        var6--;
                        var395 = class221.method1456(class3.field89[var6], (byte) -34);
                    }
                    class257.method1718(false, var395);
                    if (var434 == 1200 || var434 == 1205) {
                        var6 -= 2;
                        int var396 = class3.field89[var6 + 1];
                        int var397 = class3.field89[var6];
                        if (var397 == -1) {
                            var395.field933 = -1;
                            var395.field959 = 1;
                            var395.field930 = -1;
                        } else {
                            var395.field963 = var396;
                            var395.field933 = var397;
                            class14 var398 = class156.method1090(var397, 0);
                            var395.field968 = var398.field274;
                            var395.field995 = var398.field285;
                            var395.field961 = var398.field324;
                            var395.field966 = var398.field292;
                            if (var395.field987 > 0) {
                                var395.field995 = var395.field995 * 32 / var395.field987;
                            } else if (var395.field1019 > 0) {
                                var395.field995 = var395.field995 * 32 / var395.field1019;
                            }
                            var395.field901 = var398.field299;
                            var395.field870 = var398.field305;
                            if (var434 == 1205) {
                                var395.field919 = false;
                            } else {
                                var395.field919 = true;
                            }
                        }
                        continue;
                    }
                    if (var434 == 1201) {
                        var395.field959 = 2;
                        var6--;
                        var395.field930 = class3.field89[var6];
                        continue;
                    }
                    if (var434 == 1202) {
                        var395.field959 = 3;
                        var395.field930 = class137.field2441.field3108.method1605(-18557);
                        continue;
                    }
                    if (var434 == 1203) {
                        var395.field959 = 6;
                        var6--;
                        var395.field930 = class3.field89[var6];
                        continue;
                    }
                    if (var434 == 1204) {
                        var395.field959 = 5;
                        var6--;
                        var395.field930 = class3.field89[var6];
                        continue;
                    }
                } else if ((var434 < 1300 || var434 >= 1400) && (var434 < 2300 || var434 >= 2400)) {
                    if (var434 >= 1400 && var434 < 1500 || var434 >= 2400 && var434 < 2500) {
                        class44 var51;
                        if (var434 < 2000) {
                            var51 = var46 ? class231.field3884 : class83.field1608;
                        } else {
                            var6--;
                            var51 = class221.method1456(class3.field89[var6], (byte) -75);
                            var434 -= 1000;
                        }
                        var9--;
                        class257 var52 = class140.field2496[var9];
                        int[] var53 = null;
                        if (var52.method1679((byte) 94) > 0 && var52.method1688(93, var52.method1679((byte) -126) - 1) == 89) {
                            var6--;
                            int var54 = class3.field89[var6];
                            if (var54 > 0) {
                                var53 = new int[var54];
                                while (var54-- > 0) {
                                    var6--;
                                    var53[var54] = class3.field89[var6];
                                }
                            }
                            var52 = var52.method1713(48, 0, var52.method1679((byte) 65) - 1);
                        }
                        Object[] var55 = new Object[var52.method1679((byte) 72) + 1];
                        for (int var56 = var55.length - 1; var56 >= 1; var56--) {
                            if (var52.method1688(91, var56 - 1) == 115) {
                                var9--;
                                var55[var56] = class140.field2496[var9];
                            } else {
                                var6--;
                                var55[var56] = Integer.valueOf(class3.field89[var6]);
                            }
                        }
                        var6--;
                        int var57 = class3.field89[var6];
                        if (var57 == -1) {
                            var55 = null;
                        } else {
                            var55[0] = Integer.valueOf(var57);
                        }
                        var51.field883 = true;
                        if (var434 == 1400) {
                            var51.field904 = var55;
                        } else if (var434 == 1401) {
                            var51.field868 = var55;
                        } else if (var434 == 1402) {
                            var51.field897 = var55;
                        } else if (var434 == 1403) {
                            var51.field922 = var55;
                        } else if (var434 == 1404) {
                            var51.field1021 = var55;
                        } else if (var434 == 1405) {
                            var51.field988 = var55;
                        } else if (var434 == 1406) {
                            var51.field996 = var55;
                        } else if (var434 == 1407) {
                            var51.field893 = var55;
                            var51.field1009 = var53;
                        } else if (var434 == 1408) {
                            var51.field915 = var55;
                        } else if (var434 == 1409) {
                            var51.field1017 = var55;
                        } else if (var434 == 1410) {
                            var51.field902 = var55;
                        } else if (var434 == 1411) {
                            var51.field891 = var55;
                        } else if (var434 == 1412) {
                            var51.field978 = var55;
                        } else if (var434 == 1414) {
                            var51.field1002 = var55;
                            var51.field932 = var53;
                        } else if (var434 == 1415) {
                            var51.field984 = var53;
                            var51.field869 = var55;
                        } else if (var434 == 1416) {
                            var51.field944 = var55;
                        } else if (var434 == 1417) {
                            var51.field977 = var55;
                        } else if (var434 == 1418) {
                            var51.field874 = var55;
                        } else if (var434 == 1419) {
                            var51.field895 = var55;
                        } else if (var434 == 1420) {
                            var51.field986 = var55;
                        } else if (var434 == 1421) {
                            var51.field952 = var55;
                        } else if (var434 == 1422) {
                            var51.field882 = var55;
                        } else if (var434 == 1423) {
                            var51.field879 = var55;
                        } else if (var434 == 1424) {
                            var51.field908 = var55;
                        } else if (var434 == 1425) {
                            var51.field960 = var55;
                        } else if (var434 == 1426) {
                            var51.field942 = var55;
                        } else if (var434 == 1427) {
                            var51.field962 = var55;
                        } else if (var434 == 1428) {
                            var51.field934 = var53;
                            var51.field911 = var55;
                        } else if (var434 == 1429) {
                            var51.field905 = var53;
                            var51.field875 = var55;
                        }
                        continue;
                    }
                    if (var434 < 1600) {
                        class44 var394 = var46 ? class231.field3884 : class83.field1608;
                        if (var434 == 1500) {
                            class3.field89[var6++] = var394.field1025;
                            continue;
                        }
                        if (var434 == 1501) {
                            class3.field89[var6++] = var394.field928;
                            continue;
                        }
                        if (var434 == 1502) {
                            class3.field89[var6++] = var394.field926;
                            continue;
                        }
                        if (var434 == 1503) {
                            class3.field89[var6++] = var394.field981;
                            continue;
                        }
                        if (var434 == 1504) {
                            class3.field89[var6++] = var394.field970 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 1505) {
                            class3.field89[var6++] = var394.field885;
                            continue;
                        }
                    } else if (var434 < 1700) {
                        class44 var58 = var46 ? class231.field3884 : class83.field1608;
                        if (var434 == 1600) {
                            class3.field89[var6++] = var58.field992;
                            continue;
                        }
                        if (var434 == 1601) {
                            class3.field89[var6++] = var58.field873;
                            continue;
                        }
                        if (var434 == 1602) {
                            class140.field2496[var9++] = var58.field965;
                            continue;
                        }
                        if (var434 == 1603) {
                            class3.field89[var6++] = var58.field991;
                            continue;
                        }
                        if (var434 == 1604) {
                            class3.field89[var6++] = var58.field947;
                            continue;
                        }
                        if (var434 == 1605) {
                            class3.field89[var6++] = var58.field995;
                            continue;
                        }
                        if (var434 == 1606) {
                            class3.field89[var6++] = var58.field870;
                            continue;
                        }
                        if (var434 == 1607) {
                            class3.field89[var6++] = var58.field968;
                            continue;
                        }
                        if (var434 == 1608) {
                            class3.field89[var6++] = var58.field966;
                            continue;
                        }
                        if (var434 == 1609) {
                            class3.field89[var6++] = var58.field940;
                            continue;
                        }
                    } else if (var434 < 1800) {
                        class44 var59 = var46 ? class231.field3884 : class83.field1608;
                        if (var434 == 1700) {
                            class3.field89[var6++] = var59.field933;
                            continue;
                        }
                        if (var434 == 1701) {
                            if (var59.field933 == -1) {
                                class3.field89[var6++] = 0;
                            } else {
                                class3.field89[var6++] = var59.field963;
                            }
                            continue;
                        }
                        if (var434 == 1702) {
                            class3.field89[var6++] = var59.field890;
                            continue;
                        }
                    } else if (var434 < 1900) {
                        class44 var60 = var46 ? class231.field3884 : class83.field1608;
                        if (var434 == 1800) {
                            class3.field89[var6++] = class137.method946(client.method590(var60), (byte) -95);
                            continue;
                        }
                        if (var434 == 1801) {
                            var6--;
                            int var61 = class3.field89[var6];
                            int var435 = var61 - 1;
                            if (var60.field887 != null && var60.field887.length > var435 && var60.field887[var435] != null) {
                                class140.field2496[var9++] = var60.field887[var435];
                                continue;
                            }
                            class140.field2496[var9++] = class195.field3302;
                            continue;
                        }
                        if (var434 == 1802) {
                            if (var60.field923 == null) {
                                class140.field2496[var9++] = class195.field3302;
                            } else {
                                class140.field2496[var9++] = var60.field923;
                            }
                            continue;
                        }
                    } else if (var434 < 2600) {
                        var6--;
                        class44 var393 = class221.method1456(class3.field89[var6], (byte) -90);
                        if (var434 == 2500) {
                            class3.field89[var6++] = var393.field1025;
                            continue;
                        }
                        if (var434 == 2501) {
                            class3.field89[var6++] = var393.field928;
                            continue;
                        }
                        if (var434 == 2502) {
                            class3.field89[var6++] = var393.field926;
                            continue;
                        }
                        if (var434 == 2503) {
                            class3.field89[var6++] = var393.field981;
                            continue;
                        }
                        if (var434 == 2504) {
                            class3.field89[var6++] = var393.field970 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 2505) {
                            class3.field89[var6++] = var393.field885;
                            continue;
                        }
                    } else if (var434 < 2700) {
                        var6--;
                        class44 var392 = class221.method1456(class3.field89[var6], (byte) -84);
                        if (var434 == 2600) {
                            class3.field89[var6++] = var392.field992;
                            continue;
                        }
                        if (var434 == 2601) {
                            class3.field89[var6++] = var392.field873;
                            continue;
                        }
                        if (var434 == 2602) {
                            class140.field2496[var9++] = var392.field965;
                            continue;
                        }
                        if (var434 == 2603) {
                            class3.field89[var6++] = var392.field991;
                            continue;
                        }
                        if (var434 == 2604) {
                            class3.field89[var6++] = var392.field947;
                            continue;
                        }
                        if (var434 == 2605) {
                            class3.field89[var6++] = var392.field995;
                            continue;
                        }
                        if (var434 == 2606) {
                            class3.field89[var6++] = var392.field870;
                            continue;
                        }
                        if (var434 == 2607) {
                            class3.field89[var6++] = var392.field968;
                            continue;
                        }
                        if (var434 == 2608) {
                            class3.field89[var6++] = var392.field966;
                            continue;
                        }
                        if (var434 == 2609) {
                            class3.field89[var6++] = var392.field940;
                            continue;
                        }
                    } else if (var434 < 2800) {
                        if (var434 == 2700) {
                            var6--;
                            class44 var62 = class221.method1456(class3.field89[var6], (byte) -84);
                            class3.field89[var6++] = var62.field933;
                            continue;
                        }
                        if (var434 == 2701) {
                            var6--;
                            class44 var63 = class221.method1456(class3.field89[var6], (byte) -111);
                            if (var63.field933 == -1) {
                                class3.field89[var6++] = 0;
                            } else {
                                class3.field89[var6++] = var63.field963;
                            }
                            continue;
                        }
                        if (var434 == 2702) {
                            var6--;
                            int var64 = class3.field89[var6];
                            class157 var65 = (class157) class136.field2426.method434((byte) -93, (long) var64);
                            if (var65 == null) {
                                class3.field89[var6++] = 0;
                            } else {
                                class3.field89[var6++] = 1;
                            }
                            continue;
                        }
                        if (var434 == 2703) {
                            var6--;
                            class44 var66 = class221.method1456(class3.field89[var6], (byte) -91);
                            if (var66.field1015 == null) {
                                class3.field89[var6++] = 0;
                                continue;
                            }
                            int var67 = var66.field1015.length;
                            for (int var68 = 0; var68 < var66.field1015.length; var68++) {
                                if (var66.field1015[var68] == null) {
                                    var67 = var68;
                                    break;
                                }
                            }
                            class3.field89[var6++] = var67;
                            continue;
                        }
                        if (var434 == 2704 || var434 == 2705) {
                            var6 -= 2;
                            int var69 = class3.field89[var6];
                            int var70 = class3.field89[var6 + 1];
                            class157 var71 = (class157) class136.field2426.method434((byte) -93, (long) var69);
                            if (var71 != null && var71.field2746 == var70) {
                                class3.field89[var6++] = 1;
                                continue;
                            }
                            class3.field89[var6++] = 0;
                            continue;
                        }
                    } else if (var434 < 2900) {
                        var6--;
                        class44 var390 = class221.method1456(class3.field89[var6], (byte) -114);
                        if (var434 == 2800) {
                            class3.field89[var6++] = class137.method946(client.method590(var390), (byte) 113);
                            continue;
                        }
                        if (var434 == 2801) {
                            var6--;
                            int var391 = class3.field89[var6];
                            int var436 = var391 - 1;
                            if (var390.field887 != null && var390.field887.length > var436 && var390.field887[var436] != null) {
                                class140.field2496[var9++] = var390.field887[var436];
                                continue;
                            }
                            class140.field2496[var9++] = class195.field3302;
                            continue;
                        }
                        if (var434 == 2802) {
                            if (var390.field923 == null) {
                                class140.field2496[var9++] = class195.field3302;
                            } else {
                                class140.field2496[var9++] = var390.field923;
                            }
                            continue;
                        }
                    } else if (var434 < 3200) {
                        if (var434 == 3100) {
                            var9--;
                            class257 var72 = class140.field2496[var9];
                            class197.method1317(-80, 0, var72, class195.field3302);
                            continue;
                        }
                        if (var434 == 3101) {
                            var6 -= 2;
                            class120.method845((byte) 50, class3.field89[var6 + 1], class3.field89[var6], class137.field2441);
                            continue;
                        }
                        if (var434 == 3103) {
                            class189.method1274(false);
                            continue;
                        }
                        if (var434 == 3104) {
                            var9--;
                            class257 var73 = class140.field2496[var9];
                            class71.field1397++;
                            int var74 = 0;
                            if (var73.method1697(54)) {
                                var74 = var73.method1708((byte) -92);
                            }
                            class205.field3524.method908(false, 162);
                            class205.field3524.method1066(-1687589720, var74);
                            continue;
                        }
                        if (var434 == 3105) {
                            class44.field924++;
                            var9--;
                            class257 var75 = class140.field2496[var9];
                            class205.field3524.method908(false, 229);
                            class205.field3524.method1044(false, var75.method1668(-45));
                            continue;
                        }
                        if (var434 == 3106) {
                            class68.field1370++;
                            var9--;
                            class257 var76 = class140.field2496[var9];
                            class205.field3524.method908(false, 86);
                            class205.field3524.method1023(13195, var76.method1679((byte) 104) + 1);
                            class205.field3524.method1068(var76, 0);
                            continue;
                        }
                        if (var434 == 3107) {
                            var6--;
                            int var77 = class3.field89[var6];
                            var9--;
                            class257 var78 = class140.field2496[var9];
                            class68.method520((byte) 55, var78, var77);
                            continue;
                        }
                        if (var434 == 3108) {
                            var6 -= 3;
                            int var79 = class3.field89[var6];
                            int var80 = class3.field89[var6 + 1];
                            int var81 = class3.field89[var6 + 2];
                            class44 var82 = class221.method1456(var81, (byte) -87);
                            method690(var80, var79, false, var82);
                            continue;
                        }
                        if (var434 == 3109) {
                            var6 -= 2;
                            class44 var83 = var46 ? class231.field3884 : class83.field1608;
                            int var84 = class3.field89[var6];
                            int var85 = class3.field89[var6 + 1];
                            method690(var85, var84, false, var83);
                            continue;
                        }
                        if (var434 == 3110) {
                            var6--;
                            int var86 = class3.field89[var6];
                            class205.field3524.method908(false, 123);
                            class68.field1365++;
                            class205.field3524.method1065(var86, 1210792072);
                            continue;
                        }
                    } else if (var434 < 3300) {
                        if (var434 == 3200) {
                            var6 -= 3;
                            class239.method1572(class3.field89[var6 + 2], class3.field89[var6 + 1], class3.field89[var6], true);
                            continue;
                        }
                        if (var434 == 3201) {
                            var6--;
                            class56.method432(0, class3.field89[var6]);
                            continue;
                        }
                        if (var434 == 3202) {
                            var6 -= 2;
                            method686(class3.field89[var6 + 1], -20579, class3.field89[var6]);
                            continue;
                        }
                    } else if (var434 < 3400) {
                        if (var434 == 3300) {
                            class3.field89[var6++] = class7.field153;
                            continue;
                        }
                        if (var434 == 3301) {
                            var6 -= 2;
                            int var87 = class3.field89[var6];
                            int var88 = class3.field89[var6 + 1];
                            class3.field89[var6++] = class158.method1101(false, var87, var88);
                            continue;
                        }
                        if (var434 == 3302) {
                            var6 -= 2;
                            int var89 = class3.field89[var6];
                            int var90 = class3.field89[var6 + 1];
                            class3.field89[var6++] = class179.method1230(var89, var90, (byte) 42);
                            continue;
                        }
                        if (var434 == 3303) {
                            var6 -= 2;
                            int var91 = class3.field89[var6 + 1];
                            int var92 = class3.field89[var6];
                            class3.field89[var6++] = class238.method1567(14909, var91, var92);
                            continue;
                        }
                        if (var434 == 3304) {
                            var6--;
                            int var93 = class3.field89[var6];
                            class3.field89[var6++] = class221.method1460(false, var93).field1424;
                            continue;
                        }
                        if (var434 == 3305) {
                            var6--;
                            int var94 = class3.field89[var6];
                            class3.field89[var6++] = class53.field1156[var94];
                            continue;
                        }
                        if (var434 == 3306) {
                            var6--;
                            int var95 = class3.field89[var6];
                            class3.field89[var6++] = class239.field4106[var95];
                            continue;
                        }
                        if (var434 == 3307) {
                            var6--;
                            int var96 = class3.field89[var6];
                            class3.field89[var6++] = class248.field4274[var96];
                            continue;
                        }
                        if (var434 == 3308) {
                            int var97 = class189.field3261;
                            int var98 = (class137.field2441.field4177 >> 7) + class244.field4232;
                            int var99 = (class137.field2441.field4143 >> 7) + class231.field3878;
                            class3.field89[var6++] = (var97 << 28) + var99 + (var98 << 14);
                            continue;
                        }
                        if (var434 == 3309) {
                            var6--;
                            int var100 = class3.field89[var6];
                            class3.field89[var6++] = class30.method252(268422777, var100) >> 14;
                            continue;
                        }
                        if (var434 == 3310) {
                            var6--;
                            int var101 = class3.field89[var6];
                            class3.field89[var6++] = var101 >> 28;
                            continue;
                        }
                        if (var434 == 3311) {
                            var6--;
                            int var102 = class3.field89[var6];
                            class3.field89[var6++] = class30.method252(16383, var102);
                            continue;
                        }
                        if (var434 == 3312) {
                            class3.field89[var6++] = class68.field1363 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3313) {
                            var6 -= 2;
                            int var103 = class3.field89[var6 + 1];
                            int var104 = class3.field89[var6] + 32768;
                            class3.field89[var6++] = class158.method1101(false, var104, var103);
                            continue;
                        }
                        if (var434 == 3314) {
                            var6 -= 2;
                            int var105 = class3.field89[var6 + 1];
                            int var106 = class3.field89[var6] + 32768;
                            class3.field89[var6++] = class179.method1230(var106, var105, (byte) -72);
                            continue;
                        }
                        if (var434 == 3315) {
                            var6 -= 2;
                            int var107 = class3.field89[var6] + 32768;
                            int var108 = class3.field89[var6 + 1];
                            class3.field89[var6++] = class238.method1567(14909, var108, var107);
                            continue;
                        }
                        if (var434 == 3316) {
                            if (class59.field1244 >= 2) {
                                class3.field89[var6++] = class59.field1244;
                            } else {
                                class3.field89[var6++] = 0;
                            }
                            continue;
                        }
                        if (var434 == 3317) {
                            class3.field89[var6++] = class166.field2900;
                            continue;
                        }
                        if (var434 == 3318) {
                            class3.field89[var6++] = class151.field2598;
                            continue;
                        }
                        if (var434 == 3321) {
                            class3.field89[var6++] = class33.field650;
                            continue;
                        }
                        if (var434 == 3322) {
                            class3.field89[var6++] = class255.field4365;
                            continue;
                        }
                        if (var434 == 3323) {
                            if (class174.field2976 >= 5 && class174.field2976 <= 9) {
                                class3.field89[var6++] = 1;
                                continue;
                            }
                            class3.field89[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3324) {
                            if (class174.field2976 >= 5 && class174.field2976 <= 9) {
                                class3.field89[var6++] = class174.field2976;
                                continue;
                            }
                            class3.field89[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3325) {
                            if (class74.field1436 <= 0) {
                                class3.field89[var6++] = 0;
                            } else {
                                class3.field89[var6++] = 1;
                            }
                            continue;
                        }
                        if (var434 == 3326) {
                            class3.field89[var6++] = class137.field2441.field3115;
                            continue;
                        }
                        if (var434 == 3327) {
                            class3.field89[var6++] = class137.field2441.field3108.field4226 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3328) {
                            class3.field89[var6++] = class87.field1673;
                            continue;
                        }
                        if (var434 == 3329) {
                            class3.field89[var6++] = class201.field3444;
                            continue;
                        }
                    } else if (var434 < 3500) {
                        if (var434 == 3400) {
                            var6 -= 2;
                            int var109 = class3.field89[var6];
                            int var110 = class3.field89[var6 + 1];
                            class81 var111 = class179.method1229(var109, 877891460);
                            class140.field2496[var9++] = var111.method604((byte) 74, var110);
                            continue;
                        }
                        if (var434 == 3408) {
                            var6 -= 4;
                            int var112 = class3.field89[var6];
                            int var113 = class3.field89[var6 + 1];
                            int var114 = class3.field89[var6 + 2];
                            int var115 = class3.field89[var6 + 3];
                            class81 var116 = class179.method1229(var114, 877891460);
                            if (var116.field1576 == var112 && var116.field1582 == var113) {
                                if (var113 == 115) {
                                    class140.field2496[var9++] = var116.method604((byte) 74, var115);
                                } else {
                                    class3.field89[var6++] = var116.method611(var115, (byte) -56);
                                }
                                continue;
                            }
                            if (var113 == 115) {
                                class140.field2496[var9++] = class89.field1717;
                            } else {
                                class3.field89[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var434 < 3700) {
                        if (var434 == 3600) {
                            if (class76.field1492 == 0) {
                                class3.field89[var6++] = -2;
                            } else if (class76.field1492 == 1) {
                                class3.field89[var6++] = -1;
                            } else {
                                class3.field89[var6++] = class138.field2462;
                            }
                            continue;
                        }
                        if (var434 == 3601) {
                            var6--;
                            int var368 = class3.field89[var6];
                            if (class76.field1492 == 2 && class138.field2462 > var368) {
                                class140.field2496[var9++] = class185.field3218[var368];
                                continue;
                            }
                            class140.field2496[var9++] = class195.field3302;
                            continue;
                        }
                        if (var434 == 3602) {
                            var6--;
                            int var369 = class3.field89[var6];
                            if (class76.field1492 == 2 && class138.field2462 > var369) {
                                class3.field89[var6++] = class80.field1568[var369];
                                continue;
                            }
                            class3.field89[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3603) {
                            var6--;
                            int var370 = class3.field89[var6];
                            if (class76.field1492 == 2 && var370 < class138.field2462) {
                                class3.field89[var6++] = class55.field1182[var370];
                                continue;
                            }
                            class3.field89[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3604) {
                            var9--;
                            class257 var371 = class140.field2496[var9];
                            var6--;
                            int var372 = class3.field89[var6];
                            class206.method1389((byte) 39, var372, var371);
                            continue;
                        }
                        if (var434 == 3605) {
                            var9--;
                            class257 var373 = class140.field2496[var9];
                            class199.method1338(var373.method1668(-127), 0);
                            continue;
                        }
                        if (var434 == 3606) {
                            var9--;
                            class257 var374 = class140.field2496[var9];
                            class72.method541(var374.method1668(-102), (byte) 124);
                            continue;
                        }
                        if (var434 == 3607) {
                            var9--;
                            class257 var375 = class140.field2496[var9];
                            class149.method1005(var375.method1668(112), -107);
                            continue;
                        }
                        if (var434 == 3608) {
                            var9--;
                            class257 var376 = class140.field2496[var9];
                            class259.method1729(var376.method1668(119), (byte) 40);
                            continue;
                        }
                        if (var434 == 3609) {
                            var9--;
                            class257 var377 = class140.field2496[var9];
                            if (var377.method1673(class26.field508, (byte) 97) || var377.method1673(class252.field4336, (byte) 124)) {
                                var377 = var377.method1674(7, 255);
                            }
                            class3.field89[var6++] = class149.method1007((byte) -96, var377) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3610) {
                            var6--;
                            int var378 = class3.field89[var6];
                            if (class76.field1492 == 2 && var378 < class138.field2462) {
                                class140.field2496[var9++] = client.field1536[var378];
                                continue;
                            }
                            class140.field2496[var9++] = class195.field3302;
                            continue;
                        }
                        if (var434 == 3611) {
                            if (class96.field1803 == null) {
                                class140.field2496[var9++] = class195.field3302;
                            } else {
                                class140.field2496[var9++] = class96.field1803.method1717(-111);
                            }
                            continue;
                        }
                        if (var434 == 3612) {
                            if (class96.field1803 == null) {
                                class3.field89[var6++] = 0;
                            } else {
                                class3.field89[var6++] = class78.field1508;
                            }
                            continue;
                        }
                        if (var434 == 3613) {
                            var6--;
                            int var379 = class3.field89[var6];
                            if (class96.field1803 != null && var379 < class78.field1508) {
                                class140.field2496[var9++] = class121.field2177[var379].field3209.method1717(-109);
                                continue;
                            }
                            class140.field2496[var9++] = class195.field3302;
                            continue;
                        }
                        if (var434 == 3614) {
                            var6--;
                            int var380 = class3.field89[var6];
                            if (class96.field1803 != null && var380 < class78.field1508) {
                                class3.field89[var6++] = class121.field2177[var380].field3208;
                                continue;
                            }
                            class3.field89[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3615) {
                            var6--;
                            int var381 = class3.field89[var6];
                            if (class96.field1803 != null && var381 < class78.field1508) {
                                class3.field89[var6++] = class121.field2177[var381].field3212;
                                continue;
                            }
                            class3.field89[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3616) {
                            class3.field89[var6++] = class1.field5;
                            continue;
                        }
                        if (var434 == 3617) {
                            var9--;
                            class257 var382 = class140.field2496[var9];
                            class161.method1119(var382, true);
                            continue;
                        }
                        if (var434 == 3618) {
                            class3.field89[var6++] = class207.field3550;
                            continue;
                        }
                        if (var434 == 3619) {
                            var9--;
                            class257 var383 = class140.field2496[var9];
                            class115.method822(0, var383.method1668(-45));
                            continue;
                        }
                        if (var434 == 3620) {
                            class201.method1351(-117);
                            continue;
                        }
                        if (var434 == 3621) {
                            if (class76.field1492 == 0) {
                                class3.field89[var6++] = -1;
                            } else {
                                class3.field89[var6++] = class185.field3215;
                            }
                            continue;
                        }
                        if (var434 == 3622) {
                            var6--;
                            int var384 = class3.field89[var6];
                            if (class76.field1492 != 0 && var384 < class185.field3215) {
                                class140.field2496[var9++] = class199.method1334((byte) -93, class175.field2981[var384]).method1717(-96);
                                continue;
                            }
                            class140.field2496[var9++] = class195.field3302;
                            continue;
                        }
                        if (var434 == 3623) {
                            var9--;
                            class257 var385 = class140.field2496[var9];
                            if (var385.method1673(class26.field508, (byte) 77) || var385.method1673(class252.field4336, (byte) 94)) {
                                var385 = var385.method1674(7, 255);
                            }
                            class3.field89[var6++] = class202.method1358(var385, true) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3624) {
                            var6--;
                            int var386 = class3.field89[var6];
                            if (class121.field2177 != null && class78.field1508 > var386 && class121.field2177[var386].field3209.method1681((byte) -106, class137.field2441.field3140)) {
                                class3.field89[var6++] = 1;
                                continue;
                            }
                            class3.field89[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3625) {
                            if (class133.field2376 == null) {
                                class140.field2496[var9++] = class195.field3302;
                            } else {
                                class140.field2496[var9++] = class133.field2376.method1717(-105);
                            }
                            continue;
                        }
                        if (var434 == 3626) {
                            var6--;
                            int var387 = class3.field89[var6];
                            if (class96.field1803 != null && class78.field1508 > var387) {
                                class140.field2496[var9++] = class121.field2177[var387].field3207;
                                continue;
                            }
                            class140.field2496[var9++] = class195.field3302;
                            continue;
                        }
                        if (var434 == 3627) {
                            var6--;
                            int var388 = class3.field89[var6];
                            if (class76.field1492 == 2 && var388 >= 0 && var388 < class138.field2462) {
                                class3.field89[var6++] = class91.field1744[var388] ? 1 : 0;
                                continue;
                            }
                            class3.field89[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3628) {
                            var9--;
                            class257 var389 = class140.field2496[var9];
                            if (var389.method1673(class26.field508, (byte) 126) || var389.method1673(class252.field4336, (byte) 47)) {
                                var389 = var389.method1674(7, 255);
                            }
                            class3.field89[var6++] = class16.method160((byte) 121, var389);
                            continue;
                        }
                    } else if (var434 < 4000) {
                        if (var434 == 3903) {
                            var6--;
                            int var354 = class3.field89[var6];
                            class3.field89[var6++] = class34.field674[var354].method1414((byte) -116);
                            continue;
                        }
                        if (var434 == 3904) {
                            var6--;
                            int var355 = class3.field89[var6];
                            class3.field89[var6++] = class34.field674[var355].field3592;
                            continue;
                        }
                        if (var434 == 3905) {
                            var6--;
                            int var356 = class3.field89[var6];
                            class3.field89[var6++] = class34.field674[var356].field3589;
                            continue;
                        }
                        if (var434 == 3906) {
                            var6--;
                            int var357 = class3.field89[var6];
                            class3.field89[var6++] = class34.field674[var357].field3593;
                            continue;
                        }
                        if (var434 == 3907) {
                            var6--;
                            int var358 = class3.field89[var6];
                            class3.field89[var6++] = class34.field674[var358].field3597;
                            continue;
                        }
                        if (var434 == 3908) {
                            var6--;
                            int var359 = class3.field89[var6];
                            class3.field89[var6++] = class34.field674[var359].field3594;
                            continue;
                        }
                        if (var434 == 3910) {
                            var6--;
                            int var360 = class3.field89[var6];
                            int var361 = class34.field674[var360].method1412(false);
                            class3.field89[var6++] = var361 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3911) {
                            var6--;
                            int var362 = class3.field89[var6];
                            int var363 = class34.field674[var362].method1412(false);
                            class3.field89[var6++] = var363 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3912) {
                            var6--;
                            int var364 = class3.field89[var6];
                            int var365 = class34.field674[var364].method1412(false);
                            class3.field89[var6++] = var365 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3913) {
                            var6--;
                            int var366 = class3.field89[var6];
                            int var367 = class34.field674[var366].method1412(false);
                            class3.field89[var6++] = var367 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var434 < 4100) {
                        if (var434 == 4000) {
                            var6 -= 2;
                            int var309 = class3.field89[var6];
                            int var310 = class3.field89[var6 + 1];
                            class3.field89[var6++] = var309 + var310;
                            continue;
                        }
                        if (var434 == 4001) {
                            var6 -= 2;
                            int var311 = class3.field89[var6];
                            int var312 = class3.field89[var6 + 1];
                            class3.field89[var6++] = var311 - var312;
                            continue;
                        }
                        if (var434 == 4002) {
                            var6 -= 2;
                            int var313 = class3.field89[var6 + 1];
                            int var314 = class3.field89[var6];
                            class3.field89[var6++] = var313 * var314;
                            continue;
                        }
                        if (var434 == 4003) {
                            var6 -= 2;
                            int var315 = class3.field89[var6 + 1];
                            int var316 = class3.field89[var6];
                            class3.field89[var6++] = var316 / var315;
                            continue;
                        }
                        if (var434 == 4004) {
                            var6--;
                            int var317 = class3.field89[var6];
                            class3.field89[var6++] = (int) ((double) var317 * Math.random());
                            continue;
                        }
                        if (var434 == 4005) {
                            var6--;
                            int var318 = class3.field89[var6];
                            class3.field89[var6++] = (int) (Math.random() * (double) (var318 + 1));
                            continue;
                        }
                        if (var434 == 4006) {
                            var6 -= 5;
                            int var319 = class3.field89[var6];
                            int var320 = class3.field89[var6 + 1];
                            int var321 = class3.field89[var6 + 2];
                            int var322 = class3.field89[var6 + 3];
                            int var323 = class3.field89[var6 + 4];
                            class3.field89[var6++] = var319 + ((var320 - var319) * (var323 - var321) / (var322 - var321));
                            continue;
                        }
                        if (var434 == 4007) {
                            var6 -= 2;
                            long var324 = (long) class3.field89[var6 + 1];
                            long var326 = (long) class3.field89[var6];
                            class3.field89[var6++] = (int) (var324 * var326 / 100L + var326);
                            continue;
                        }
                        if (var434 == 4008) {
                            var6 -= 2;
                            int var328 = class3.field89[var6];
                            int var329 = class3.field89[var6 + 1];
                            class3.field89[var6++] = class198.method1332(var328, 0x1 << var329);
                            continue;
                        }
                        if (var434 == 4009) {
                            var6 -= 2;
                            int var330 = class3.field89[var6];
                            int var331 = class3.field89[var6 + 1];
                            class3.field89[var6++] = class30.method252(var330, -(0x1 << var331) - 1);
                            continue;
                        }
                        if (var434 == 4010) {
                            var6 -= 2;
                            int var332 = class3.field89[var6];
                            int var333 = class3.field89[var6 + 1];
                            class3.field89[var6++] = class30.method252(var332, 0x1 << var333) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var434 == 4011) {
                            var6 -= 2;
                            int var334 = class3.field89[var6];
                            int var335 = class3.field89[var6 + 1];
                            class3.field89[var6++] = var334 % var335;
                            continue;
                        }
                        if (var434 == 4012) {
                            var6 -= 2;
                            int var336 = class3.field89[var6];
                            int var337 = class3.field89[var6 + 1];
                            if (var336 == 0) {
                                class3.field89[var6++] = 0;
                            } else {
                                class3.field89[var6++] = (int) Math.pow((double) var336, (double) var337);
                            }
                            continue;
                        }
                        if (var434 == 4013) {
                            var6 -= 2;
                            int var338 = class3.field89[var6];
                            int var339 = class3.field89[var6 + 1];
                            if (var338 == 0) {
                                class3.field89[var6++] = 0;
                            } else if (var339 == 0) {
                                class3.field89[var6++] = Integer.MAX_VALUE;
                            } else {
                                class3.field89[var6++] = (int) Math.pow((double) var338, 1.0D / (double) var339);
                            }
                            continue;
                        }
                        if (var434 == 4014) {
                            var6 -= 2;
                            int var340 = class3.field89[var6 + 1];
                            int var341 = class3.field89[var6];
                            class3.field89[var6++] = class30.method252(var340, var341);
                            continue;
                        }
                        if (var434 == 4015) {
                            var6 -= 2;
                            int var342 = class3.field89[var6];
                            int var343 = class3.field89[var6 + 1];
                            class3.field89[var6++] = class198.method1332(var342, var343);
                            continue;
                        }
                        if (var434 == 4016) {
                            var6 -= 2;
                            int var344 = class3.field89[var6 + 1];
                            int var345 = class3.field89[var6];
                            class3.field89[var6++] = var345 >= var344 ? var344 : var345;
                            continue;
                        }
                        if (var434 == 4017) {
                            var6 -= 2;
                            int var346 = class3.field89[var6];
                            int var347 = class3.field89[var6 + 1];
                            class3.field89[var6++] = var346 > var347 ? var346 : var347;
                            continue;
                        }
                        if (var434 == 4018) {
                            var6 -= 3;
                            long var348 = (long) class3.field89[var6 + 1];
                            long var350 = (long) class3.field89[var6 + 2];
                            long var352 = (long) class3.field89[var6];
                            class3.field89[var6++] = (int) (var350 * var352 / var348);
                            continue;
                        }
                    } else if (var434 < 4200) {
                        if (var434 == 4100) {
                            var9--;
                            class257 var257 = class140.field2496[var9];
                            var6--;
                            int var258 = class3.field89[var6];
                            class140.field2496[var9++] = class233.method1528(new class257[] { var257, class111.method808(10, var258) }, 0);
                            continue;
                        }
                        if (var434 == 4101) {
                            var9 -= 2;
                            class257 var259 = class140.field2496[var9];
                            class257 var260 = class140.field2496[var9 + 1];
                            class140.field2496[var9++] = class233.method1528(new class257[] { var259, var260 }, 0);
                            continue;
                        }
                        if (var434 == 4102) {
                            var9--;
                            class257 var261 = class140.field2496[var9];
                            var6--;
                            int var262 = class3.field89[var6];
                            class140.field2496[var9++] = class233.method1528(new class257[] { var261, class207.method1395(true, var262, -8222) }, 0);
                            continue;
                        }
                        if (var434 == 4103) {
                            var9--;
                            class257 var263 = class140.field2496[var9];
                            class140.field2496[var9++] = var263.method1710(68);
                            continue;
                        }
                        if (var434 == 4104) {
                            var6--;
                            int var264 = class3.field89[var6];
                            long var265 = ((long) var264 + 11745L) * 86400000L;
                            class33.field636.setTime(new Date(var265));
                            int var267 = class33.field636.get(5);
                            int var268 = class33.field636.get(2);
                            int var269 = class33.field636.get(1);
                            class140.field2496[var9++] = class233.method1528(new class257[] { class111.method808(10, var267), class125.field2242, class35.field707[var268], class125.field2242, class111.method808(10, var269) }, 0);
                            continue;
                        }
                        if (var434 == 4105) {
                            var9 -= 2;
                            class257 var270 = class140.field2496[var9];
                            class257 var271 = class140.field2496[var9 + 1];
                            if (class137.field2441.field3108 != null && class137.field2441.field3108.field4226) {
                                class140.field2496[var9++] = var271;
                                continue;
                            }
                            class140.field2496[var9++] = var270;
                            continue;
                        }
                        if (var434 == 4106) {
                            var6--;
                            int var272 = class3.field89[var6];
                            class140.field2496[var9++] = class111.method808(10, var272);
                            continue;
                        }
                        if (var434 == 4107) {
                            var9 -= 2;
                            class3.field89[var6++] = class140.field2496[var9].method1670(class140.field2496[var9 + 1], 189);
                            continue;
                        }
                        if (var434 == 4108) {
                            var6 -= 2;
                            int var273 = class3.field89[var6];
                            int var274 = class3.field89[var6 + 1];
                            var9--;
                            class257 var275 = class140.field2496[var9];
                            byte[] var276 = class115.field2072.method1197(0, var274, -2);
                            class240 var277 = new class240(var276);
                            var277.method774(class9.field179, (int[]) null);
                            class3.field89[var6++] = var277.method781(var275, var273);
                            continue;
                        }
                        if (var434 == 4109) {
                            var6 -= 2;
                            var9--;
                            class257 var278 = class140.field2496[var9];
                            int var279 = class3.field89[var6 + 1];
                            int var280 = class3.field89[var6];
                            byte[] var281 = class115.field2072.method1197(0, var279, -2);
                            class240 var282 = new class240(var281);
                            var282.method774(class9.field179, (int[]) null);
                            class3.field89[var6++] = var282.method776(var278, var280);
                            continue;
                        }
                        if (var434 == 4110) {
                            var9 -= 2;
                            class257 var283 = class140.field2496[var9 + 1];
                            class257 var284 = class140.field2496[var9];
                            var6--;
                            if (class3.field89[var6] == 1) {
                                class140.field2496[var9++] = var284;
                            } else {
                                class140.field2496[var9++] = var283;
                            }
                            continue;
                        }
                        if (var434 == 4111) {
                            var9--;
                            class257 var285 = class140.field2496[var9];
                            class140.field2496[var9++] = class107.method770(var285);
                            continue;
                        }
                        if (var434 == 4112) {
                            var9--;
                            class257 var286 = class140.field2496[var9];
                            var6--;
                            int var287 = class3.field89[var6];
                            if (var287 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class140.field2496[var9++] = var286.method1686(var287, (byte) 107);
                            continue;
                        }
                        if (var434 == 4113) {
                            var6--;
                            int var288 = class3.field89[var6];
                            class3.field89[var6++] = class199.method1336((byte) 117, var288) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4114) {
                            var6--;
                            int var289 = class3.field89[var6];
                            class3.field89[var6++] = class251.method1644(32350, var289) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4115) {
                            var6--;
                            int var290 = class3.field89[var6];
                            class3.field89[var6++] = class183.method1249(var290, -672) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4116) {
                            var6--;
                            int var291 = class3.field89[var6];
                            class3.field89[var6++] = class76.method556((byte) -108, var291) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4117) {
                            var9--;
                            class257 var292 = class140.field2496[var9];
                            if (var292 == null) {
                                class3.field89[var6++] = 0;
                            } else {
                                class3.field89[var6++] = var292.method1679((byte) -22);
                            }
                            continue;
                        }
                        if (var434 == 4118) {
                            var9--;
                            class257 var293 = class140.field2496[var9];
                            var6 -= 2;
                            int var294 = class3.field89[var6];
                            int var295 = class3.field89[var6 + 1];
                            class140.field2496[var9++] = var293.method1713(48, var294, var295);
                            continue;
                        }
                        if (var434 == 4119) {
                            var9--;
                            class257 var296 = class140.field2496[var9];
                            class257 var297 = class54.method416(0, var296.method1679((byte) -41));
                            boolean var298 = false;
                            for (int var299 = 0; var296.method1679((byte) 107) > var299; var299++) {
                                int var300 = var296.method1688(104, var299);
                                if (var300 == 60) {
                                    var298 = true;
                                } else if (var300 == 62) {
                                    var298 = false;
                                } else if (!var298) {
                                    var297.method1703(var300, 123);
                                }
                            }
                            var297.method1714((byte) -126);
                            class140.field2496[var9++] = var297;
                            continue;
                        }
                        if (var434 == 4120) {
                            var6 -= 2;
                            var9--;
                            class257 var301 = class140.field2496[var9];
                            int var302 = class3.field89[var6];
                            int var303 = class3.field89[var6 + 1];
                            class3.field89[var6++] = var301.method1705(var302, (byte) -70, var303);
                            continue;
                        }
                        if (var434 == 4121) {
                            var9 -= 2;
                            class257 var304 = class140.field2496[var9 + 1];
                            class257 var305 = class140.field2496[var9];
                            var6--;
                            int var306 = class3.field89[var6];
                            class3.field89[var6++] = var305.method1669(-5936, var306, var304);
                            continue;
                        }
                        if (var434 == 4122) {
                            var6--;
                            int var307 = class3.field89[var6];
                            class3.field89[var6++] = class89.method661(var307, 159);
                            continue;
                        }
                        if (var434 == 4123) {
                            var6--;
                            int var308 = class3.field89[var6];
                            class3.field89[var6++] = class239.method1574(var308, true);
                            continue;
                        }
                    } else if (var434 < 4300) {
                        if (var434 == 4200) {
                            var6--;
                            int var238 = class3.field89[var6];
                            class140.field2496[var9++] = class156.method1090(var238, 0).field295;
                            continue;
                        }
                        if (var434 == 4201) {
                            var6 -= 2;
                            int var239 = class3.field89[var6 + 1];
                            int var240 = class3.field89[var6];
                            class14 var241 = class156.method1090(var240, 0);
                            if (var239 >= 1 && var239 <= 5 && var241.field293[var239 - 1] != null) {
                                class140.field2496[var9++] = var241.field293[var239 - 1];
                                continue;
                            }
                            class140.field2496[var9++] = class195.field3302;
                            continue;
                        }
                        if (var434 == 4202) {
                            var6 -= 2;
                            int var242 = class3.field89[var6 + 1];
                            int var243 = class3.field89[var6];
                            class14 var244 = class156.method1090(var243, 0);
                            if (var242 >= 1 && var242 <= 5 && var244.field317[var242 - 1] != null) {
                                class140.field2496[var9++] = var244.field317[var242 - 1];
                                continue;
                            }
                            class140.field2496[var9++] = class195.field3302;
                            continue;
                        }
                        if (var434 == 4203) {
                            var6--;
                            int var245 = class3.field89[var6];
                            class3.field89[var6++] = class156.method1090(var245, 0).field300;
                            continue;
                        }
                        if (var434 == 4204) {
                            var6--;
                            int var246 = class3.field89[var6];
                            class3.field89[var6++] = class156.method1090(var246, 0).field255 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4205) {
                            var6--;
                            int var247 = class3.field89[var6];
                            class14 var248 = class156.method1090(var247, 0);
                            if (var248.field287 == -1 && var248.field262 >= 0) {
                                class3.field89[var6++] = var248.field262;
                                continue;
                            }
                            class3.field89[var6++] = var247;
                            continue;
                        }
                        if (var434 == 4206) {
                            var6--;
                            int var249 = class3.field89[var6];
                            class14 var250 = class156.method1090(var249, 0);
                            if (var250.field287 >= 0 && var250.field262 >= 0) {
                                class3.field89[var6++] = var250.field262;
                                continue;
                            }
                            class3.field89[var6++] = var249;
                            continue;
                        }
                        if (var434 == 4207) {
                            var6--;
                            int var251 = class3.field89[var6];
                            class3.field89[var6++] = class156.method1090(var251, 0).field309 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4208) {
                            var6 -= 2;
                            int var252 = class3.field89[var6];
                            int var253 = class3.field89[var6 + 1];
                            class125 var254 = class259.method1727(var253, 11);
                            if (var254.method869(true)) {
                                class140.field2496[var9++] = class156.method1090(var252, 0).method147(var253, (byte) -76, var254.field2248);
                            } else {
                                class3.field89[var6++] = class156.method1090(var252, 0).method137((byte) 111, var254.field2237, var253);
                            }
                            continue;
                        }
                        if (var434 == 4210) {
                            var6--;
                            int var255 = class3.field89[var6];
                            var9--;
                            class257 var256 = class140.field2496[var9];
                            class14.method138(var256, (byte) -101, var255 == 1);
                            class3.field89[var6++] = class213.field3643;
                            continue;
                        }
                        if (var434 == 4211) {
                            if (class222.field3751 != null && class213.field3643 > class236.field4044) {
                                class3.field89[var6++] = class30.method252(class222.field3751[class236.field4044++], 65535);
                                continue;
                            }
                            class3.field89[var6++] = -1;
                            continue;
                        }
                        if (var434 == 4212) {
                            class236.field4044 = 0;
                            continue;
                        }
                    } else if (var434 < 4400) {
                        if (var434 == 4300) {
                            var6 -= 2;
                            int var117 = class3.field89[var6 + 1];
                            int var118 = class3.field89[var6];
                            class125 var119 = class259.method1727(var117, 11);
                            if (var119.method869(true)) {
                                class140.field2496[var9++] = class92.method682(true, var118).method1331(var117, (byte) 117, var119.field2248);
                            } else {
                                class3.field89[var6++] = class92.method682(true, var118).method1322(var119.field2237, var117, -61);
                            }
                            continue;
                        }
                    } else if (var434 >= 4500) {
                        if (var434 < 4600) {
                            if (var434 == 4500) {
                                var6 -= 2;
                                int var120 = class3.field89[var6];
                                int var121 = class3.field89[var6 + 1];
                                class125 var122 = class259.method1727(var121, 11);
                                if (var122.method869(true)) {
                                    class140.field2496[var9++] = class46.method357(var120, 1557).method572((byte) -119, var121, var122.field2248);
                                } else {
                                    class3.field89[var6++] = class46.method357(var120, 1557).method576(-6983, var121, var122.field2237);
                                }
                                continue;
                            }
                        } else if (var434 < 5100) {
                            if (var434 == 5000) {
                                class3.field89[var6++] = class197.field3329;
                                continue;
                            }
                            if (var434 == 5001) {
                                var6 -= 3;
                                class197.field3329 = class3.field89[var6];
                                class238.field4098++;
                                class172.field2946 = class3.field89[var6 + 1];
                                class45.field1041 = class3.field89[var6 + 2];
                                class205.field3524.method908(false, 172);
                                class205.field3524.method1023(13195, class197.field3329);
                                class205.field3524.method1023(13195, class172.field2946);
                                class205.field3524.method1023(13195, class45.field1041);
                                continue;
                            }
                            if (var434 == 5002) {
                                class175.field2993++;
                                var6 -= 2;
                                var9--;
                                class257 var123 = class140.field2496[var9];
                                int var124 = class3.field89[var6 + 1];
                                int var125 = class3.field89[var6];
                                class205.field3524.method908(false, 191);
                                class205.field3524.method1044(false, var123.method1668(112));
                                class205.field3524.method1023(13195, var125 - 1);
                                class205.field3524.method1023(13195, var124);
                                continue;
                            }
                            if (var434 == 5003) {
                                var6--;
                                int var126 = class3.field89[var6];
                                class257 var127 = null;
                                if (var126 < 100) {
                                    var127 = class129.field2303[var126];
                                }
                                if (var127 == null) {
                                    var127 = class195.field3302;
                                }
                                class140.field2496[var9++] = var127;
                                continue;
                            }
                            if (var434 == 5004) {
                                var6--;
                                int var128 = class3.field89[var6];
                                int var129 = -1;
                                if (var128 < 100 && class129.field2303[var128] != null) {
                                    var129 = class38.field762[var128];
                                }
                                class3.field89[var6++] = var129;
                                continue;
                            }
                            if (var434 == 5005) {
                                class3.field89[var6++] = class172.field2946;
                                continue;
                            }
                            if (var434 == 5008) {
                                var9--;
                                class257 var130 = class140.field2496[var9];
                                if (var130.method1673(class79.field1551, (byte) 78)) {
                                    class145.method979(var130, 1);
                                    continue;
                                }
                                if (class59.field1244 == 0 && (class87.field1673 == 1 || class201.field3444 == 1)) {
                                    continue;
                                }
                                class116.field2086++;
                                class257 var131 = var130.method1710(68);
                                byte var132 = 0;
                                if (var131.method1673(class56.field1198, (byte) 54)) {
                                    var132 = 0;
                                    var130 = var130.method1674(class56.field1198.method1679((byte) -68), 255);
                                } else if (var131.method1673(class30.field571, (byte) 117)) {
                                    var130 = var130.method1674(class30.field571.method1679((byte) -65), 255);
                                    var132 = 1;
                                } else if (var131.method1673(class18.field390, (byte) 120)) {
                                    var132 = 2;
                                    var130 = var130.method1674(class18.field390.method1679((byte) 69), 255);
                                } else if (var131.method1673(class30.field574, (byte) 76)) {
                                    var132 = 3;
                                    var130 = var130.method1674(class30.field574.method1679((byte) -64), 255);
                                } else if (var131.method1673(class140.field2494, (byte) 114)) {
                                    var132 = 4;
                                    var130 = var130.method1674(class140.field2494.method1679((byte) 63), 255);
                                } else if (var131.method1673(class224.field3764, (byte) 84)) {
                                    var132 = 5;
                                    var130 = var130.method1674(class224.field3764.method1679((byte) 60), 255);
                                } else if (var131.method1673(class76.field1470, (byte) 60)) {
                                    var132 = 6;
                                    var130 = var130.method1674(class76.field1470.method1679((byte) -96), 255);
                                } else if (var131.method1673(client.field1534, (byte) 89)) {
                                    var130 = var130.method1674(client.field1534.method1679((byte) 94), 255);
                                    var132 = 7;
                                } else if (var131.method1673(class195.field3300, (byte) 61)) {
                                    var132 = 8;
                                    var130 = var130.method1674(class195.field3300.method1679((byte) -73), 255);
                                } else if (var131.method1673(class259.field4494, (byte) 72)) {
                                    var130 = var130.method1674(class259.field4494.method1679((byte) 101), 255);
                                    var132 = 9;
                                } else if (var131.method1673(class208.field3557, (byte) 91)) {
                                    var132 = 10;
                                    var130 = var130.method1674(class208.field3557.method1679((byte) 70), 255);
                                } else if (var131.method1673(class256.field4390, (byte) 83)) {
                                    var130 = var130.method1674(class256.field4390.method1679((byte) -51), 255);
                                    var132 = 11;
                                } else if (class227.field3822 != 0) {
                                    if (var131.method1673(class56.field1203, (byte) 116)) {
                                        var132 = 0;
                                        var130 = var130.method1674(class56.field1203.method1679((byte) -41), 255);
                                    } else if (var131.method1673(class30.field579, (byte) 100)) {
                                        var132 = 1;
                                        var130 = var130.method1674(class30.field579.method1679((byte) -27), 255);
                                    } else if (var131.method1673(class18.field389, (byte) 34)) {
                                        var130 = var130.method1674(class18.field389.method1679((byte) -78), 255);
                                        var132 = 2;
                                    } else if (var131.method1673(class30.field563, (byte) 101)) {
                                        var132 = 3;
                                        var130 = var130.method1674(class30.field563.method1679((byte) 99), 255);
                                    } else if (var131.method1673(class140.field2493, (byte) 51)) {
                                        var130 = var130.method1674(class140.field2493.method1679((byte) 72), 255);
                                        var132 = 4;
                                    } else if (var131.method1673(class224.field3761, (byte) 59)) {
                                        var130 = var130.method1674(class224.field3761.method1679((byte) -102), 255);
                                        var132 = 5;
                                    } else if (var131.method1673(class76.field1465, (byte) 58)) {
                                        var132 = 6;
                                        var130 = var130.method1674(class76.field1465.method1679((byte) 123), 255);
                                    } else if (var131.method1673(client.field1524, (byte) 78)) {
                                        var132 = 7;
                                        var130 = var130.method1674(client.field1524.method1679((byte) -29), 255);
                                    } else if (var131.method1673(class195.field3304, (byte) 54)) {
                                        var132 = 8;
                                        var130 = var130.method1674(class195.field3304.method1679((byte) -30), 255);
                                    } else if (var131.method1673(class259.field4493, (byte) 103)) {
                                        var130 = var130.method1674(class259.field4493.method1679((byte) -74), 255);
                                        var132 = 9;
                                    } else if (var131.method1673(class208.field3564, (byte) 81)) {
                                        var130 = var130.method1674(class208.field3564.method1679((byte) 108), 255);
                                        var132 = 10;
                                    } else if (var131.method1673(class256.field4389, (byte) 61)) {
                                        var132 = 11;
                                        var130 = var130.method1674(class256.field4389.method1679((byte) -20), 255);
                                    }
                                }
                                byte var133 = 0;
                                class257 var134 = var130.method1710(87);
                                if (var134.method1673(class250.field4309, (byte) 43)) {
                                    var133 = 1;
                                    var130 = var130.method1674(class250.field4309.method1679((byte) 84), 255);
                                } else if (var134.method1673(class160.field2809, (byte) 38)) {
                                    var133 = 2;
                                    var130 = var130.method1674(class160.field2809.method1679((byte) -39), 255);
                                } else if (var134.method1673(class35.field712, (byte) 58)) {
                                    var133 = 3;
                                    var130 = var130.method1674(class35.field712.method1679((byte) 86), 255);
                                } else if (var134.method1673(class156.field2723, (byte) 80)) {
                                    var130 = var130.method1674(class156.field2723.method1679((byte) -67), 255);
                                    var133 = 4;
                                } else if (var134.method1673(class78.field1495, (byte) 104)) {
                                    var130 = var130.method1674(class78.field1495.method1679((byte) -80), 255);
                                    var133 = 5;
                                } else if (class227.field3822 != 0) {
                                    if (var134.method1673(class250.field4313, (byte) 116)) {
                                        var133 = 1;
                                        var130 = var130.method1674(class250.field4313.method1679((byte) -106), 255);
                                    } else if (var134.method1673(class160.field2811, (byte) 37)) {
                                        var130 = var130.method1674(class160.field2811.method1679((byte) 89), 255);
                                        var133 = 2;
                                    } else if (var134.method1673(class35.field695, (byte) 58)) {
                                        var130 = var130.method1674(class35.field695.method1679((byte) 112), 255);
                                        var133 = 3;
                                    } else if (var134.method1673(class156.field2722, (byte) 97)) {
                                        var133 = 4;
                                        var130 = var130.method1674(class156.field2722.method1679((byte) -16), 255);
                                    } else if (var134.method1673(class78.field1509, (byte) 122)) {
                                        var130 = var130.method1674(class78.field1509.method1679((byte) 102), 255);
                                        var133 = 5;
                                    }
                                }
                                class205.field3524.method908(false, 169);
                                class205.field3524.method1023(13195, 0);
                                int var135 = class205.field3524.field2677;
                                class205.field3524.method1023(13195, var132);
                                class205.field3524.method1023(13195, var133);
                                class257.method1677(97, class205.field3524, var130);
                                class205.field3524.method1074(-55, class205.field3524.field2677 - var135);
                                continue;
                            }
                            if (var434 == 5009) {
                                var9 -= 2;
                                class257 var136 = class140.field2496[var9];
                                class257 var137 = class140.field2496[var9 + 1];
                                if (class59.field1244 != 0 || class87.field1673 != 1 && class201.field3444 != 1) {
                                    class205.field3524.method908(false, 121);
                                    class205.field3524.method1023(13195, 0);
                                    class15.field331++;
                                    int var138 = class205.field3524.field2677;
                                    class205.field3524.method1044(false, var136.method1668(-83));
                                    class257.method1677(-58, class205.field3524, var137);
                                    class205.field3524.method1074(108, class205.field3524.field2677 - var138);
                                }
                                continue;
                            }
                            if (var434 == 5010) {
                                var6--;
                                int var139 = class3.field89[var6];
                                class257 var140 = null;
                                if (var139 < 100) {
                                    var140 = class68.field1362[var139];
                                }
                                if (var140 == null) {
                                    var140 = class195.field3302;
                                }
                                class140.field2496[var9++] = var140;
                                continue;
                            }
                            if (var434 == 5011) {
                                var6--;
                                int var141 = class3.field89[var6];
                                class257 var142 = null;
                                if (var141 < 100) {
                                    var142 = class87.field1689[var141];
                                }
                                if (var142 == null) {
                                    var142 = class195.field3302;
                                }
                                class140.field2496[var9++] = var142;
                                continue;
                            }
                            if (var434 == 5012) {
                                var6--;
                                int var143 = class3.field89[var6];
                                int var144 = -1;
                                if (var143 < 100) {
                                    var144 = class53.field1146[var143];
                                }
                                class3.field89[var6++] = var144;
                                continue;
                            }
                            if (var434 == 5015) {
                                class257 var145;
                                if (class137.field2441 == null || class137.field2441.field3140 == null) {
                                    var145 = class17.field376;
                                } else {
                                    var145 = class137.field2441.field3140;
                                }
                                class140.field2496[var9++] = var145;
                                continue;
                            }
                            if (var434 == 5016) {
                                class3.field89[var6++] = class45.field1041;
                                continue;
                            }
                            if (var434 == 5017) {
                                class3.field89[var6++] = class89.field1703;
                                continue;
                            }
                            if (var434 == 5050) {
                                var6--;
                                int var146 = class3.field89[var6];
                                class140.field2496[var9++] = class229.method1490(32768, var146).field2784;
                                continue;
                            }
                            if (var434 == 5051) {
                                var6--;
                                int var147 = class3.field89[var6];
                                class159 var148 = class229.method1490(32768, var147);
                                if (var148.field2799 == null) {
                                    class3.field89[var6++] = 0;
                                } else {
                                    class3.field89[var6++] = var148.field2799.length;
                                }
                                continue;
                            }
                            if (var434 == 5052) {
                                var6 -= 2;
                                int var149 = class3.field89[var6];
                                int var150 = class3.field89[var6 + 1];
                                class159 var151 = class229.method1490(32768, var149);
                                int var152 = var151.field2799[var150];
                                class3.field89[var6++] = var152;
                                continue;
                            }
                            if (var434 == 5053) {
                                var6--;
                                int var153 = class3.field89[var6];
                                class159 var154 = class229.method1490(32768, var153);
                                if (var154.field2792 == null) {
                                    class3.field89[var6++] = 0;
                                } else {
                                    class3.field89[var6++] = var154.field2792.length;
                                }
                                continue;
                            }
                            if (var434 == 5054) {
                                var6 -= 2;
                                int var155 = class3.field89[var6];
                                int var156 = class3.field89[var6 + 1];
                                class3.field89[var6++] = class229.method1490(32768, var155).field2792[var156];
                                continue;
                            }
                            if (var434 == 5055) {
                                var6--;
                                int var157 = class3.field89[var6];
                                class140.field2496[var9++] = class38.method307(32768, var157).method1381(-15168);
                                continue;
                            }
                            if (var434 == 5056) {
                                var6--;
                                int var158 = class3.field89[var6];
                                class206 var159 = class38.method307(32768, var158);
                                if (var159.field3543 == null) {
                                    class3.field89[var6++] = 0;
                                } else {
                                    class3.field89[var6++] = var159.field3543.length;
                                }
                                continue;
                            }
                            if (var434 == 5057) {
                                var6 -= 2;
                                int var160 = class3.field89[var6 + 1];
                                int var161 = class3.field89[var6];
                                class3.field89[var6++] = class38.method307(32768, var161).field3543[var160];
                                continue;
                            }
                            if (var434 == 5058) {
                                class252.field4338 = new class259();
                                var6--;
                                class252.field4338.field4496 = class3.field89[var6];
                                class252.field4338.field4505 = class38.method307(32768, class252.field4338.field4496);
                                class252.field4338.field4499 = new int[class252.field4338.field4505.method1385(-101)];
                                continue;
                            }
                            if (var434 == 5059) {
                                class205.field3524.method908(false, 242);
                                class205.field3524.method1023(13195, 0);
                                int var162 = class205.field3524.field2677;
                                class148.field2570++;
                                class205.field3524.method1023(13195, 0);
                                class205.field3524.method1065(class252.field4338.field4496, 1210792072);
                                class252.field4338.field4505.method1390(class205.field3524, -1, class252.field4338.field4499);
                                class205.field3524.method1074(-68, class205.field3524.field2677 - var162);
                                continue;
                            }
                            if (var434 == 5060) {
                                class165.field2875++;
                                var9--;
                                class257 var163 = class140.field2496[var9];
                                class205.field3524.method908(false, 134);
                                class205.field3524.method1023(13195, 0);
                                int var164 = class205.field3524.field2677;
                                class205.field3524.method1044(false, var163.method1668(-94));
                                class205.field3524.method1065(class252.field4338.field4496, 1210792072);
                                class252.field4338.field4505.method1390(class205.field3524, -1, class252.field4338.field4499);
                                class205.field3524.method1074(123, class205.field3524.field2677 - var164);
                                continue;
                            }
                            if (var434 == 5061) {
                                class148.field2570++;
                                class205.field3524.method908(false, 242);
                                class205.field3524.method1023(13195, 0);
                                int var165 = class205.field3524.field2677;
                                class205.field3524.method1023(13195, 1);
                                class205.field3524.method1065(class252.field4338.field4496, 1210792072);
                                class252.field4338.field4505.method1390(class205.field3524, -1, class252.field4338.field4499);
                                class205.field3524.method1074(124, class205.field3524.field2677 - var165);
                                continue;
                            }
                            if (var434 == 5062) {
                                var6 -= 2;
                                int var166 = class3.field89[var6];
                                int var167 = class3.field89[var6 + 1];
                                class3.field89[var6++] = class229.method1490(32768, var166).field2798[var167];
                                continue;
                            }
                            if (var434 == 5063) {
                                var6 -= 2;
                                int var168 = class3.field89[var6];
                                int var169 = class3.field89[var6 + 1];
                                class3.field89[var6++] = class229.method1490(32768, var168).field2788[var169];
                                continue;
                            }
                            if (var434 == 5064) {
                                var6 -= 2;
                                int var170 = class3.field89[var6];
                                int var171 = class3.field89[var6 + 1];
                                if (var171 == -1) {
                                    class3.field89[var6++] = -1;
                                } else {
                                    class3.field89[var6++] = class229.method1490(32768, var170).method1108(var171, (byte) 59);
                                }
                                continue;
                            }
                            if (var434 == 5065) {
                                var6 -= 2;
                                int var172 = class3.field89[var6];
                                int var173 = class3.field89[var6 + 1];
                                if (var173 == -1) {
                                    class3.field89[var6++] = -1;
                                } else {
                                    class3.field89[var6++] = class229.method1490(32768, var172).method1111((byte) -111, var173);
                                }
                                continue;
                            }
                            if (var434 == 5066) {
                                var6--;
                                int var174 = class3.field89[var6];
                                class3.field89[var6++] = class38.method307(32768, var174).method1385(-83);
                                continue;
                            }
                            if (var434 == 5067) {
                                var6 -= 2;
                                int var175 = class3.field89[var6 + 1];
                                int var176 = class3.field89[var6];
                                int var177 = class38.method307(32768, var176).method1388((byte) -1, var175);
                                class3.field89[var6++] = var177;
                                continue;
                            }
                            if (var434 == 5068) {
                                var6 -= 2;
                                int var178 = class3.field89[var6];
                                int var179 = class3.field89[var6 + 1];
                                class252.field4338.field4499[var178] = var179;
                                continue;
                            }
                            if (var434 == 5069) {
                                var6 -= 2;
                                int var180 = class3.field89[var6];
                                int var181 = class3.field89[var6 + 1];
                                class252.field4338.field4499[var180] = var181;
                                continue;
                            }
                            if (var434 == 5070) {
                                var6 -= 3;
                                int var182 = class3.field89[var6];
                                int var183 = class3.field89[var6 + 1];
                                int var184 = class3.field89[var6 + 2];
                                class206 var185 = class38.method307(32768, var182);
                                if (var185.method1388((byte) -1, var183) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class3.field89[var6++] = var185.method1386(var184, (byte) -27, var183);
                                continue;
                            }
                        } else if (var434 < 5200) {
                            if (var434 == 5100) {
                                if (class39.field793[86]) {
                                    class3.field89[var6++] = 1;
                                } else {
                                    class3.field89[var6++] = 0;
                                }
                                continue;
                            }
                            if (var434 == 5101) {
                                if (class39.field793[82]) {
                                    class3.field89[var6++] = 1;
                                } else {
                                    class3.field89[var6++] = 0;
                                }
                                continue;
                            }
                            if (var434 == 5102) {
                                if (class39.field793[81]) {
                                    class3.field89[var6++] = 1;
                                } else {
                                    class3.field89[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var434 < 5300) {
                            if (var434 == 5200) {
                                var6--;
                                class55.method419((byte) -67, class3.field89[var6]);
                                continue;
                            }
                            if (var434 == 5201) {
                                class3.field89[var6++] = class143.method975((byte) 98);
                                continue;
                            }
                            if (var434 == 5202) {
                                var6--;
                                class76.method558(true, class3.field89[var6]);
                                continue;
                            }
                            if (var434 == 5203) {
                                var9--;
                                class53.method409(-1, class140.field2496[var9]);
                                continue;
                            }
                            if (var434 == 5204) {
                                class140.field2496[var9 - 1] = class8.method110(class140.field2496[var9 - 1], 112);
                                continue;
                            }
                            if (var434 == 5205) {
                                var9--;
                                class79.method597(-121, class140.field2496[var9]);
                                continue;
                            }
                        } else if (var434 >= 5400) {
                            if (var434 < 5500) {
                                if (var434 == 5400) {
                                    var9 -= 2;
                                    class257 var217 = class140.field2496[var9];
                                    var6--;
                                    int var218 = class3.field89[var6];
                                    field1771++;
                                    class257 var219 = class140.field2496[var9 + 1];
                                    class205.field3524.method908(false, 206);
                                    class205.field3524.method1023(13195, class221.method1458((byte) 108, var217) + class221.method1458((byte) 79, var219) + 1);
                                    class205.field3524.method1068(var217, 0);
                                    class205.field3524.method1068(var219, 0);
                                    class205.field3524.method1023(13195, var218);
                                    continue;
                                }
                                if (var434 == 5401) {
                                    var6 -= 2;
                                    class117.field2096[class3.field89[var6]] = (short) class245.method1611(122, class3.field89[var6 + 1]);
                                    class33.method276((byte) 70);
                                    class195.method1310(0);
                                    class178.method1194(false);
                                    class32.method272(true);
                                    class244.method1601(768);
                                    continue;
                                }
                                if (var434 == 5402) {
                                    var9 -= 2;
                                    class17.field376 = class140.field2496[var9];
                                    class17.field377 = class140.field2496[var9 + 1];
                                    if (class217.field3675 != 10) {
                                        continue;
                                    }
                                    if (!class17.field376.method1706(class195.field3302, -1) && !class17.field377.method1706(class195.field3302, -1)) {
                                        class209.method1404((byte) -38, 20);
                                        continue;
                                    }
                                    class42.field852 = 3;
                                    continue;
                                }
                                if (var434 == 5403) {
                                    class3.field89[var6++] = class42.field852;
                                    continue;
                                }
                                if (var434 == 5404) {
                                    class3.field89[var6++] = class64.field1303 / 60;
                                    continue;
                                }
                                if (var434 == 5405) {
                                    var6 -= 2;
                                    int var220 = class3.field89[var6];
                                    int var221 = class3.field89[var6 + 1];
                                    if (var220 >= 0 && var220 < 2) {
                                        class21.field443[var220] = new int[var221 << 1][4];
                                    }
                                    continue;
                                }
                                if (var434 == 5406) {
                                    var6 -= 7;
                                    int var222 = class3.field89[var6 + 1] << 1;
                                    int var223 = class3.field89[var6];
                                    int var224 = class3.field89[var6 + 3];
                                    int var225 = class3.field89[var6 + 4];
                                    int var226 = class3.field89[var6 + 6];
                                    int var227 = class3.field89[var6 + 2];
                                    int var228 = class3.field89[var6 + 5];
                                    if (var223 >= 0 && var223 < 2 && class21.field443[var223] != null && var222 >= 0 && class21.field443[var223].length > var222) {
                                        class21.field443[var223][var222] = new int[] { (class30.method252(var227, 268423936) >> 14) * 128, var224, class30.method252(var227, 16383) * 128, var226 };
                                        class21.field443[var223][var222 + 1] = new int[] { class30.method252(16383, var225 >> 14) * 128, var228, class30.method252(16383, var225) * 128 };
                                    }
                                    continue;
                                }
                                if (var434 == 5407) {
                                    var6--;
                                    int var229 = class21.field443[class3.field89[var6]].length >> 1;
                                    class3.field89[var6++] = var229;
                                    continue;
                                }
                                if (var434 == 5408) {
                                    class3.field89[var6++] = 0;
                                    continue;
                                }
                                if (var434 == 5409) {
                                    class16.method162(-64);
                                    continue;
                                }
                                if (var434 == 5411) {
                                    if (class220.field3728 == null) {
                                        class78.method574(class205.method1378((byte) -28), 65, false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var434 == 5412) {
                                    var6 -= 4;
                                    if (class183.field3184 == 0) {
                                        class44.method351(class3.field89[var6 + 2], (byte) 117, class3.field89[var6], class3.field89[var6 + 1], class3.field89[var6 + 3]);
                                    }
                                    continue;
                                }
                                if (var434 == 5413) {
                                    class3.field89[var6++] = class138.field2471;
                                    continue;
                                }
                                if (var434 == 5414) {
                                    var9--;
                                    if (class183.field3184 == 0) {
                                        class25.method223(class140.field2496[var9].method1668(125), (byte) 106);
                                    }
                                    continue;
                                }
                                if (var434 == 5415) {
                                    class3.field89[var6++] = class76.field1493;
                                    continue;
                                }
                                if (var434 == 5416) {
                                    var6 -= 4;
                                    var9 -= 2;
                                    if (class183.field3184 == 0) {
                                        class227.method1485(class3.field89[var6], class140.field2496[var9 + 1], class3.field89[var6 + 3], class3.field89[var6 + 2], class140.field2496[var9].method1668(126), class3.field89[var6 + 1], (byte) -114);
                                    }
                                    continue;
                                }
                                if (var434 == 5417) {
                                    class3.field89[var6++] = class133.field2377;
                                    continue;
                                }
                                if (var434 == 5418) {
                                    for (int var230 = 0; var230 < 5; var230++) {
                                        class140.field2496[var9++] = class189.field3259.length > var230 ? class189.field3259[var230] : class195.field3302;
                                    }
                                    class189.field3259 = null;
                                    continue;
                                }
                                if (var434 == 5419) {
                                    class257 var231 = class195.field3302;
                                    if (class75.field1455 != null) {
                                        var231 = class46.method361(class75.field1455.field2998, true);
                                        try {
                                            if (class75.field1455.field3001 != null) {
                                                byte[] var232 = ((String) class75.field1455.field3001).getBytes("ISO-8859-1");
                                                var231 = class55.method422(-29067, var232.length, 0, var232);
                                            }
                                        } catch (UnsupportedEncodingException var432) {
                                        }
                                    }
                                    class140.field2496[var9++] = var231;
                                    continue;
                                }
                                if (var434 == 5420) {
                                    class3.field89[var6++] = class59.field1249 == 2 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 5421) {
                                    var9--;
                                    class257 var233 = class140.field2496[var9];
                                    var6--;
                                    boolean var234 = class3.field89[var6] == 1;
                                    class78.method574(class233.method1528(new class257[] { class205.method1378((byte) -28), var233 }, 0), 65, var234);
                                    continue;
                                }
                            } else if (var434 < 5600) {
                                if (var434 == 5500) {
                                    var6 -= 4;
                                    int var205 = class3.field89[var6 + 2];
                                    int var206 = class3.field89[var6 + 1];
                                    int var207 = class3.field89[var6 + 3];
                                    int var208 = class3.field89[var6];
                                    class41.method331((byte) 111, (var208 >> 14 & 0x3FFF) - class244.field4232, var207, (var208 & 0x3FFF) - class231.field3878, var206, false, var205);
                                    continue;
                                }
                                if (var434 == 5501) {
                                    var6 -= 4;
                                    int var209 = class3.field89[var6 + 1];
                                    int var210 = class3.field89[var6];
                                    int var211 = class3.field89[var6 + 2];
                                    int var212 = class3.field89[var6 + 3];
                                    class79.method596((var210 & 0x3FFF) - class231.field3878, ((var210 & 0xFFFE53C) >> 14) + -class244.field4232, var212, var211, var209, (byte) 124);
                                    continue;
                                }
                                if (var434 == 5502) {
                                    var6 -= 6;
                                    int var213 = class3.field89[var6];
                                    if (var213 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class238.field4094 = var213;
                                    int var214 = class3.field89[var6 + 1];
                                    if (class21.field443[class238.field4094].length >> 1 <= var214 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class222.field3755 = var214;
                                    class143.field2506 = 0;
                                    class198.field3357 = class3.field89[var6 + 2];
                                    class156.field2742 = class3.field89[var6 + 3];
                                    int var215 = class3.field89[var6 + 4];
                                    if (var215 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class197.field3326 = var215;
                                    int var216 = class3.field89[var6 + 5];
                                    if ((var216 + 1) >= (class21.field443[class197.field3326].length >> 1)) {
                                        throw new RuntimeException();
                                    }
                                    class224.field3766 = 3;
                                    class2.field22 = var216;
                                    continue;
                                }
                                if (var434 == 5503) {
                                    class59.method447((byte) 34);
                                    continue;
                                }
                            } else if (var434 < 6100) {
                                if (var434 == 6001) {
                                    var6--;
                                    int var191 = class3.field89[var6];
                                    if (var191 < 1) {
                                        var191 = 1;
                                    }
                                    if (var191 > 4) {
                                        var191 = 4;
                                    }
                                    class30.field566 = var191;
                                    if (class30.field566 == 1) {
                                        class101.method729(0.9F);
                                    }
                                    if (class30.field566 == 2) {
                                        class101.method729(0.8F);
                                    }
                                    if (class30.field566 == 3) {
                                        class101.method729(0.7F);
                                    }
                                    if (class30.field566 == 4) {
                                        class101.method729(0.6F);
                                    }
                                    class195.method1310(0);
                                    class250.method1632(class72.field1404, 59);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6002) {
                                    var6--;
                                    class133.method925((byte) -18, class3.field89[var6] == 1);
                                    class29.method238(false);
                                    class26.method228((byte) 95);
                                    if (class69.method524((byte) 16) && class72.field1409) {
                                        byte var192 = (byte) (class15.field328 - 4 & 0xFF);
                                        if (class199.field3411 == null) {
                                            class199.field3411 = new byte[4][104][104];
                                        }
                                        for (int var193 = 0; var193 < 4; var193++) {
                                            for (int var194 = 0; var194 < 104; var194++) {
                                                for (int var195 = 0; var195 < 104; var195++) {
                                                    class199.field3411[var193][var194][var195] = var192;
                                                }
                                            }
                                        }
                                    }
                                    class250.method1632(class72.field1404, 64);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6003) {
                                    var6--;
                                    class72.field1409 = class3.field89[var6] == 1;
                                    if (class69.method524((byte) 36) && class72.field1409) {
                                        if (class199.field3411 == null) {
                                            class199.field3411 = new byte[4][104][104];
                                        }
                                        byte var196 = (byte) (class15.field328 - 4 & 0xFF);
                                        for (int var197 = 0; var197 < 4; var197++) {
                                            for (int var198 = 0; var198 < 104; var198++) {
                                                for (int var199 = 0; var199 < 104; var199++) {
                                                    class199.field3411[var197][var198][var199] = var196;
                                                }
                                            }
                                        }
                                    }
                                    class250.method1632(class72.field1404, 65);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6005) {
                                    var6--;
                                    class133.field2387 = class3.field89[var6] == 1;
                                    class26.method228((byte) 94);
                                    class250.method1632(class72.field1404, 99);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6006) {
                                    var6--;
                                    class2.field62 = class3.field89[var6] == 1;
                                    ((class5) class101.field1870).method100(-80, !class2.field62);
                                    class250.method1632(class72.field1404, 49);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6007) {
                                    var6--;
                                    class204.field3503 = class3.field89[var6] == 1;
                                    class250.method1632(class72.field1404, 78);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6008) {
                                    var6--;
                                    class169.field2918 = class3.field89[var6] == 1;
                                    class250.method1632(class72.field1404, 91);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6009) {
                                    var6--;
                                    class152.field2649 = class3.field89[var6] == 1;
                                    class250.method1632(class72.field1404, 107);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6010) {
                                    var6--;
                                    class19.field399 = class3.field89[var6] == 1;
                                    class250.method1632(class72.field1404, 54);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6011) {
                                    var6--;
                                    int var200 = class3.field89[var6];
                                    if (var200 < 0 || var200 > 2) {
                                        var200 = 0;
                                    }
                                    class25.field488 = var200;
                                    class250.method1632(class72.field1404, 80);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6012) {
                                    var6--;
                                    class209.field3573 = class3.field89[var6] == 1;
                                    if (class30.field566 == 1) {
                                        class101.method729(0.9F);
                                    }
                                    if (class30.field566 == 2) {
                                        class101.method729(0.8F);
                                    }
                                    if (class30.field566 == 3) {
                                        class101.method729(0.7F);
                                    }
                                    if (class30.field566 == 4) {
                                        class101.method729(0.6F);
                                    }
                                    class26.method228((byte) 90);
                                    class250.method1632(class72.field1404, 52);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6014) {
                                    var6--;
                                    class179.field3093 = class3.field89[var6] == 1;
                                    class250.method1632(class72.field1404, 104);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6015) {
                                    var6--;
                                    class81.field1574 = class3.field89[var6] == 1;
                                    class250.method1632(class72.field1404, 86);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6016) {
                                    var6--;
                                    int var201 = class3.field89[var6];
                                    if (var201 < 0 || var201 > 2) {
                                        var201 = 0;
                                    }
                                    class238.field4089 = var201;
                                    class250.method1632(class72.field1404, 70);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6017) {
                                    var6--;
                                    class2.field45 = class3.field89[var6] == 1;
                                    class78.method570(false);
                                    class250.method1632(class72.field1404, 47);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6018) {
                                    var6--;
                                    int var202 = class3.field89[var6];
                                    if (var202 < 0) {
                                        var202 = 0;
                                    }
                                    if (var202 > 127) {
                                        var202 = 127;
                                    }
                                    class38.field747 = var202;
                                    class250.method1632(class72.field1404, 112);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6019) {
                                    var6--;
                                    int var203 = class3.field89[var6];
                                    if (var203 < 0) {
                                        var203 = 0;
                                    }
                                    if (var203 > 255) {
                                        var203 = 255;
                                    }
                                    if (class26.field513 != var203) {
                                        if (class26.field513 == 0 && class124.field2228 != -1) {
                                            class57.method437(false, var203, class259.field4502, class124.field2228, 0, -21260);
                                            class246.field4259 = false;
                                        } else if (var203 == 0) {
                                            class31.method266(53);
                                            class246.field4259 = false;
                                        } else {
                                            class249.method1629(var203, 4927);
                                        }
                                        class26.field513 = var203;
                                    }
                                    class250.method1632(class72.field1404, 83);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6020) {
                                    var6--;
                                    int var204 = class3.field89[var6];
                                    if (var204 < 0) {
                                        var204 = 0;
                                    }
                                    if (var204 > 127) {
                                        var204 = 127;
                                    }
                                    class99.field1830 = var204;
                                    class250.method1632(class72.field1404, 53);
                                    class95.field1789 = false;
                                    continue;
                                }
                                if (var434 == 6021) {
                                    var6--;
                                    class185.field3213 = class3.field89[var6] == 1;
                                    continue;
                                }
                            } else if (var434 < 6200) {
                                if (var434 == 6101) {
                                    class3.field89[var6++] = class30.field566;
                                    continue;
                                }
                                if (var434 == 6102) {
                                    class3.field89[var6++] = class69.method524((byte) 3) ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6103) {
                                    class3.field89[var6++] = class72.field1409 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6105) {
                                    class3.field89[var6++] = class133.field2387 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6106) {
                                    class3.field89[var6++] = class2.field62 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6107) {
                                    class3.field89[var6++] = class204.field3503 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6108) {
                                    class3.field89[var6++] = class169.field2918 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6109) {
                                    class3.field89[var6++] = class152.field2649 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6110) {
                                    class3.field89[var6++] = class19.field399 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6111) {
                                    class3.field89[var6++] = class25.field488;
                                    continue;
                                }
                                if (var434 == 6112) {
                                    class3.field89[var6++] = class209.field3573 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6114) {
                                    class3.field89[var6++] = class179.field3093 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6115) {
                                    class3.field89[var6++] = class81.field1574 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6116) {
                                    class3.field89[var6++] = class238.field4089;
                                    continue;
                                }
                                if (var434 == 6117) {
                                    class3.field89[var6++] = class2.field45 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6118) {
                                    class3.field89[var6++] = class38.field747;
                                    continue;
                                }
                                if (var434 == 6119) {
                                    class3.field89[var6++] = class26.field513;
                                    continue;
                                }
                                if (var434 == 6120) {
                                    class3.field89[var6++] = class99.field1830;
                                    continue;
                                }
                                if (var434 == 6121) {
                                    class3.field89[var6++] = 0;
                                    continue;
                                }
                            } else if (var434 < 6300) {
                                if (var434 == 6200) {
                                    var6 -= 2;
                                    class219.field3711 = (short) class3.field89[var6];
                                    if (class219.field3711 <= 0) {
                                        class219.field3711 = 256;
                                    }
                                    class233.field3947 = (short) class3.field89[var6 + 1];
                                    if (class233.field3947 <= 0) {
                                        class233.field3947 = 205;
                                    }
                                    continue;
                                }
                                if (var434 == 6201) {
                                    var6 -= 2;
                                    class213.field3638 = (short) class3.field89[var6];
                                    if (class213.field3638 <= 0) {
                                        class213.field3638 = 256;
                                    }
                                    class38.field758 = (short) class3.field89[var6 + 1];
                                    if (class38.field758 <= 0) {
                                        class38.field758 = 320;
                                    }
                                    continue;
                                }
                                if (var434 == 6202) {
                                    var6 -= 4;
                                    class146.field2551 = (short) class3.field89[var6];
                                    if (class146.field2551 <= 0) {
                                        class146.field2551 = 1;
                                    }
                                    class133.field2386 = (short) class3.field89[var6 + 1];
                                    if (class133.field2386 <= 0) {
                                        class133.field2386 = 32767;
                                    } else if (class146.field2551 > class133.field2386) {
                                        class133.field2386 = class146.field2551;
                                    }
                                    class172.field2954 = (short) class3.field89[var6 + 2];
                                    if (class172.field2954 <= 0) {
                                        class172.field2954 = 1;
                                    }
                                    class183.field3191 = (short) class3.field89[var6 + 3];
                                    if (class183.field3191 <= 0) {
                                        class183.field3191 = 32767;
                                    } else if (class183.field3191 < class172.field2954) {
                                        class183.field3191 = class172.field2954;
                                    }
                                    continue;
                                }
                                if (var434 == 6203) {
                                    class37.method300(0, 0, class243.field4206.field926, class243.field4206.field981, 0, false);
                                    class3.field89[var6++] = class187.field3241;
                                    class3.field89[var6++] = class104.field1940;
                                    continue;
                                }
                                if (var434 == 6204) {
                                    class3.field89[var6++] = class213.field3638;
                                    class3.field89[var6++] = class38.field758;
                                    continue;
                                }
                                if (var434 == 6205) {
                                    class3.field89[var6++] = class219.field3711;
                                    class3.field89[var6++] = class233.field3947;
                                    continue;
                                }
                            } else if (var434 < 6400) {
                                if (var434 == 6300) {
                                    class3.field89[var6++] = (int) (class80.method600(-54) / 60000L);
                                    continue;
                                }
                                if (var434 == 6301) {
                                    class3.field89[var6++] = (int) (class80.method600(-94) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var434 == 6302) {
                                    var6 -= 3;
                                    int var186 = class3.field89[var6];
                                    int var187 = class3.field89[var6 + 2];
                                    int var188 = class3.field89[var6 + 1];
                                    class33.field636.clear();
                                    class33.field636.set(11, 12);
                                    class33.field636.set(var187, var188, var186);
                                    class3.field89[var6++] = (int) (class33.field636.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var434 == 6303) {
                                    class33.field636.clear();
                                    class33.field636.setTime(new Date(class80.method600(-109)));
                                    class3.field89[var6++] = class33.field636.get(1);
                                    continue;
                                }
                                if (var434 == 6304) {
                                    var6--;
                                    int var189 = class3.field89[var6];
                                    boolean var190 = true;
                                    if (var189 < 0) {
                                        var190 = (var189 + 1) % 4 == 0;
                                    } else if (var189 < 1582) {
                                        var190 = (var189 % 4) == 0;
                                    } else if (var189 % 4 != 0) {
                                        var190 = false;
                                    } else if ((var189 % 100) != 0) {
                                        var190 = true;
                                    } else if (var189 % 400 != 0) {
                                        var190 = false;
                                    }
                                    class3.field89[var6++] = var190 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var434 == 5304) {
                            class3.field89[var6++] = 0;
                            continue;
                        }
                    } else if (var434 == 4400) {
                        var6 -= 2;
                        int var235 = class3.field89[var6];
                        int var236 = class3.field89[var6 + 1];
                        class125 var237 = class259.method1727(var236, 11);
                        if (var237.method869(true)) {
                            class140.field2496[var9++] = class5.method96(var235, false).method1539(var236, -1, var237.field2248);
                        } else {
                            class3.field89[var6++] = class5.method96(var235, false).method1529(var237.field2237, var236, (byte) -29);
                        }
                        continue;
                    }
                } else {
                    class44 var47;
                    if (var434 < 2000) {
                        var47 = var46 ? class231.field3884 : class83.field1608;
                    } else {
                        var6--;
                        var47 = class221.method1456(class3.field89[var6], (byte) -100);
                        var434 -= 1000;
                    }
                    if (var434 == 1300) {
                        var6--;
                        int var48 = class3.field89[var6] - 1;
                        if (var48 >= 0 && var48 <= 9) {
                            var9--;
                            var47.method339(0, var48, class140.field2496[var9]);
                            continue;
                        }
                        var9--;
                        continue;
                    }
                    if (var434 == 1301) {
                        var6 -= 2;
                        int var49 = class3.field89[var6 + 1];
                        int var50 = class3.field89[var6];
                        var47.field862 = class148.method996(var50, -1, var49);
                        continue;
                    }
                    if (var434 == 1302) {
                        var6--;
                        var47.field1006 = class3.field89[var6] == 1;
                        continue;
                    }
                    if (var434 == 1303) {
                        var6--;
                        var47.field993 = class3.field89[var6];
                        continue;
                    }
                    if (var434 == 1304) {
                        var6--;
                        var47.field1023 = class3.field89[var6];
                        continue;
                    }
                    if (var434 == 1305) {
                        var9--;
                        var47.field923 = class140.field2496[var9];
                        continue;
                    }
                    if (var434 == 1306) {
                        var9--;
                        var47.field914 = class140.field2496[var9];
                        continue;
                    }
                    if (var434 == 1307) {
                        var47.field887 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var433) {
            if (var5.field401 == null) {
                if (class165.field2879 != 0) {
                    class197.method1317(-71, 0, class154.field2709, class195.field3302);
                }
                class198.method1325("CS2 - scr:" + var5.field573 + " op:" + var10, var433, -45);
            } else {
                class257 var429 = class54.method416(0, 30);
                var429.method1684(-35, class92.field1756).method1684(-35, var5.field401);
                for (int var430 = class211.field3614 - 1; var430 >= 0; var430--) {
                    var429.method1684(-35, class135.field2413).method1684(-35, class189.field3258[var430].field3783.field401);
                }
                if (var10 == 40) {
                    int var431 = var11[var7];
                    var429.method1684(-35, class124.field2229).method1684(-35, class111.method808(10, var431));
                }
                if (class165.field2879 != 0) {
                    class197.method1317(-79, 0, class233.method1528(new class257[] { class229.field3850, var5.field401 }, 0), class195.field3302);
                }
                class198.method1325("CS2 - scr:" + var5.field573 + " op:" + var10 + new String(var429.method1667((byte) 32)), var433, -60);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([IBIII)V")
    public static final void method692(int[] arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1784++;
        arg2--;
        int var12 = arg4 - 1;
        int var5 = var12 - 7;
        while (arg2 < var5) {
            int var7 = arg2 + 1;
            arg0[var7] = arg3;
            int var8 = var7 + 1;
            arg0[var8] = arg3;
            int var9 = var8 + 1;
            arg0[var9] = arg3;
            int var10 = var9 + 1;
            arg0[var10] = arg3;
            int var11 = var10 + 1;
            arg0[var11] = arg3;
            int var13 = var11 + 1;
            arg0[var13] = arg3;
            int var14 = var13 + 1;
            arg0[var14] = arg3;
            arg2 = var14 + 1;
            arg0[arg2] = arg3;
        }
        int var6 = 15 % ((arg1 + 75) / 47);
        while (var12 > arg2) {
            arg2++;
            arg0[arg2] = arg3;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)Lqh;")
    public static final class205 method693(int arg0, byte arg1) {
        field1774++;
        class205 var2 = (class205) class80.field1560.method836(-114, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        class205 var3 = class62.method471(false, arg0, class203.field3493, class152.field2634, -25023);
        if (var3 != null) {
            class80.field1560.method832(var3, (long) arg0, 0);
        }
        int var4 = -15 / ((arg1 + 18) / 43);
        return var3;
    }
}
