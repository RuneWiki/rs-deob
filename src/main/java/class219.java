import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class219 {

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "[S")
    public static short[] field3885 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "[Loh;")
    private static class263[] field3878 = new class263[1000];

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "[S")
    public static short[] field3883 = new short[256];

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "[I")
    public static int[] field3888 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Lue;")
    public static class86 field3881;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "[[[Lud;")
    public static class2[][][] field3887;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZIIILfa;I)V")
    public static final void method1490(boolean arg0, int arg1, int arg2, int arg3, class240 arg4, int arg5) {
        field3882++;
        if (class112.field2107 >= 50 || arg4.field4195 == null || arg2 >= arg4.field4195.length || arg4.field4195[arg2] == null) {
            return;
        }
        int var6 = arg4.field4195[arg2][0];
        int var7 = var6 >> 4 & 0x7;
        int var8 = var6 & 0xF;
        int var9 = var6 >> 8;
        if (arg4.field4195[arg2].length > 1) {
            int var10 = (int) ((double) arg4.field4195[arg2].length * Math.random());
            if (var10 > 0) {
                var9 = arg4.field4195[arg2][var10];
            }
        }
        if (var8 == 0) {
            if (arg0) {
                class95.method665(0, var9, 0, var7);
            }
        } else if (class214.field3798 != 0) {
            class55.field1154[class112.field2107] = var9;
            class35.field824[class112.field2107] = var7;
            int var11 = (arg5 - 64) / 128;
            int var12 = (arg1 + arg3) / 128;
            class24.field680[class112.field2107] = 0;
            class150.field2713[class112.field2107] = null;
            class243.field4294[class112.field2107] = (var11 << 16) + (var12 << 8) + var8;
            class112.field2107++;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lue;Lue;Z)I")
    public static final int method1491(class86 arg0, class86 arg1, boolean arg2) {
        field3884++;
        int var3 = 0;
        if (arg1.method602(class130.field2385, 0)) {
            var3++;
        }
        if (!arg2) {
            return -101;
        }
        if (arg1.method602(class36.field844, 0)) {
            var3++;
        }
        if (arg1.method602(class220.field3899, 0)) {
            var3++;
        }
        if (arg0.method602(class130.field2385, 0)) {
            var3++;
        }
        if (arg0.method602(class36.field844, 0)) {
            var3++;
        }
        if (arg0.method602(class220.field3899, 0)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Llf;")
    public static final class204 method1492(int arg0, int arg1) {
        class204 var2 = (class204) class224.field3949.method828(0, (long) arg0);
        if (arg1 != 8) {
            return null;
        }
        field3886++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class251.field4365.method596(31, class232.method1557((byte) 24, arg0), class19.method129(arg0, (byte) -2));
        class204 var4 = new class204();
        var4.field3668 = arg0;
        if (var3 != null) {
            var4.method1412((byte) 126, new class194(var3));
        }
        var4.method1413((byte) 124);
        class224.field3949.method826((long) arg0, 9815, var4);
        return var4;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([BII)I")
    public static final int method1493(byte[] arg0, int arg1, int arg2) {
        field3879++;
        if (arg2 != 0) {
            method1493((byte[]) null, -110, -103);
        }
        return class141.method936(0, (byte) -104, arg1, arg0);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static void method1494(int arg0) {
        field3888 = null;
        field3881 = null;
        field3887 = null;
        field3878 = null;
        field3885 = null;
        field3883 = null;
        if (arg0 != 1) {
            field3883 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILu;I)V")
    public static final void method1495(int arg0, class116 arg1, int arg2) {
        field3880++;
        Object[] var3 = arg1.field2173;
        int var4 = (Integer) var3[0];
        class113 var5 = class54.method347(var4, (byte) -100);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        byte var9 = -1;
        int[] var10 = var5.field2123;
        class106.field2003 = 0;
        int[] var11 = var5.field2112;
        try {
            int var12 = 0;
            class83.field1644 = new class263[var5.field2116];
            int var13 = 0;
            class8.field171 = new int[var5.field2117];
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg1.field2172;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg1.field2165;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg1.field2166 == null ? -1 : arg1.field2166.field537;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg1.field2167;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg1.field2166 == null ? -1 : arg1.field2166.field470;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg1.field2168 == null ? -1 : arg1.field2168.field537;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg1.field2168 == null ? -1 : arg1.field2168.field470;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg1.field2176;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg1.field2169;
                    }
                    class8.field171[var12++] = var15;
                } else if (var3[var14] instanceof class263) {
                    class263 var16 = (class263) var3[var14];
                    if (var16.method1788(arg2 - 42389, class32.field787)) {
                        var16 = arg1.field2174;
                    }
                    class83.field1644[var13++] = var16;
                }
            }
            int var17 = 0;
            if (arg2 != 16383) {
                field3881 = null;
            }
            label3639: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var475 = var11[var8];
                int var10000;
                if (var475 < 100) {
                    if (var475 == 0) {
                        class26.field700[var6++] = var10[var8];
                        continue;
                    }
                    if (var475 == 1) {
                        int var18 = var10[var8];
                        class26.field700[var6++] = class48.field1038[var18];
                        continue;
                    }
                    if (var475 == 2) {
                        int var19 = var10[var8];
                        var10000 = arg2 ^ 0x3FDA;
                        var6--;
                        class244.method1653(var10000, var19, class26.field700[var6]);
                        continue;
                    }
                    if (var475 == 3) {
                        field3878[var7++] = var5.field2113[var8];
                        continue;
                    }
                    if (var475 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var475 == 7) {
                        var6 -= 2;
                        if (class26.field700[var6 + 1] != class26.field700[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var475 == 8) {
                        var6 -= 2;
                        if (class26.field700[var6 + 1] == class26.field700[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var475 == 9) {
                        var6 -= 2;
                        if (class26.field700[var6] < class26.field700[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var475 == 10) {
                        var6 -= 2;
                        if (class26.field700[var6 + 1] < class26.field700[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var475 == 21) {
                        if (class106.field2003 == 0) {
                            return;
                        }
                        class269 var20 = class117.field2182[--class106.field2003];
                        var8 = var20.field4745;
                        class8.field171 = var20.field4740;
                        var5 = var20.field4743;
                        var10 = var5.field2123;
                        class83.field1644 = var20.field4748;
                        var11 = var5.field2112;
                        continue;
                    }
                    if (var475 == 25) {
                        int var21 = var10[var8];
                        class26.field700[var6++] = class196.method1338(var21, (byte) 37);
                        continue;
                    }
                    if (var475 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class61.method378(class26.field700[var6], var22, true);
                        continue;
                    }
                    if (var475 == 31) {
                        var6 -= 2;
                        if (class26.field700[var6 + 1] >= class26.field700[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var475 == 32) {
                        var6 -= 2;
                        if (class26.field700[var6 + 1] <= class26.field700[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var475 == 33) {
                        class26.field700[var6++] = class8.field171[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var475 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class8.field171[var10001] = class26.field700[var6];
                        continue;
                    }
                    if (var475 == 35) {
                        field3878[var7++] = class83.field1644[var10[var8]];
                        continue;
                    }
                    if (var475 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class83.field1644[var10001] = field3878[var7];
                        continue;
                    }
                    if (var475 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        class263 var24 = class106.method710(field3878, var23, var7, 28777);
                        field3878[var7++] = var24;
                        continue;
                    }
                    if (var475 == 38) {
                        var6--;
                        continue;
                    }
                    if (var475 == 39) {
                        var7--;
                        continue;
                    }
                    if (var475 == 40) {
                        int var25 = var10[var8];
                        class113 var26 = class54.method347(var25, (byte) -86);
                        int[] var27 = new int[var26.field2117];
                        class263[] var28 = new class263[var26.field2116];
                        for (int var29 = 0; var29 < var26.field2114; var29++) {
                            var27[var29] = class26.field700[var6 + var29 - var26.field2114];
                        }
                        for (int var30 = 0; var30 < var26.field2119; var30++) {
                            var28[var30] = field3878[var7 + var30 - var26.field2119];
                        }
                        var7 -= var26.field2119;
                        var6 -= var26.field2114;
                        class269 var31 = new class269();
                        var31.field4748 = class83.field1644;
                        var31.field4743 = var5;
                        var31.field4740 = class8.field171;
                        var31.field4745 = var8;
                        if (class106.field2003 >= class117.field2182.length) {
                            throw new RuntimeException();
                        }
                        class117.field2182[class106.field2003++] = var31;
                        var8 = -1;
                        class8.field171 = var27;
                        class83.field1644 = var28;
                        var5 = var26;
                        var10 = var26.field2123;
                        var11 = var26.field2112;
                        continue;
                    }
                    if (var475 == 42) {
                        class26.field700[var6++] = class157.field2822[var10[var8]];
                        continue;
                    }
                    if (var475 == 43) {
                        int var32 = var10[var8];
                        var6--;
                        class157.field2822[var32] = class26.field700[var6];
                        class28.method188(32160, var32);
                        continue;
                    }
                    if (var475 == 44) {
                        int var33 = var10[var8] >> 16;
                        int var34 = var10[var8] & 0xFFFF;
                        var6--;
                        int var35 = class26.field700[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            byte var36 = -1;
                            class225.field3971[var33] = var35;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label3639;
                                }
                                class170.field3119[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var475 == 45) {
                        int var38 = var10[var8];
                        var6--;
                        int var39 = class26.field700[var6];
                        if (var39 >= 0 && var39 < class225.field3971[var38]) {
                            class26.field700[var6++] = class170.field3119[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var475 == 46) {
                        var6 -= 2;
                        int var40 = var10[var8];
                        int var41 = class26.field700[var6];
                        if (var41 >= 0 && var41 < class225.field3971[var40]) {
                            class170.field3119[var40][var41] = class26.field700[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var475 == 47) {
                        class263 var42 = class177.field3250[var10[var8]];
                        if (var42 == null) {
                            var42 = class148.field2701;
                        }
                        field3878[var7++] = var42;
                        continue;
                    }
                    if (var475 == 48) {
                        int var43 = var10[var8];
                        var7--;
                        class177.field3250[var43] = field3878[var7];
                        class72.method457(var43, arg2 - 28320);
                        continue;
                    }
                    if (var475 == 51) {
                        class5 var44 = var5.field2118[var10[var8]];
                        var6--;
                        class182 var45 = (class182) var44.method31(-32665, (long) class26.field700[var6]);
                        if (var45 != null) {
                            var8 += var45.field3305;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var475 < 300) {
                    if (var475 == 100) {
                        var6 -= 3;
                        int var454 = class26.field700[var6 + 1];
                        int var455 = class26.field700[var6];
                        int var456 = class26.field700[var6 + 2];
                        if (var454 == 0) {
                            throw new RuntimeException();
                        }
                        class21 var457 = class8.method55(arg2 + 49152, var455);
                        if (var457.field589 == null) {
                            var457.field589 = new class21[var456 + 1];
                        }
                        if (var456 >= var457.field589.length) {
                            class21[] var458 = new class21[var456 + 1];
                            for (int var459 = 0; var459 < var457.field589.length; var459++) {
                                var458[var459] = var457.field589[var459];
                            }
                            var457.field589 = var458;
                        }
                        if (var456 > 0 && var457.field589[var456 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var456 - 1));
                        }
                        class21 var460 = new class21();
                        var460.field470 = var456;
                        var460.field536 = var460.field537 = var457.field537;
                        var460.field573 = true;
                        var460.field519 = var454;
                        var457.field589[var456] = var460;
                        if (var46) {
                            client.field2768 = var460;
                        } else {
                            class120.field2237 = var460;
                        }
                        class220.method1508(var457, (byte) -62);
                        continue;
                    }
                    if (var475 == 101) {
                        class21 var461 = var46 ? client.field2768 : class120.field2237;
                        if (var461.field470 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class21 var462 = class8.method55(arg2 + 49152, var461.field537);
                        var462.field589[var461.field470] = null;
                        class220.method1508(var462, (byte) -110);
                        continue;
                    }
                    if (var475 == 102) {
                        var10000 = arg2 ^ 0xC000;
                        var6--;
                        class21 var463 = class8.method55(var10000, class26.field700[var6]);
                        var463.field589 = null;
                        class220.method1508(var463, (byte) -109);
                        continue;
                    }
                    if (var475 == 200) {
                        var6 -= 2;
                        int var464 = class26.field700[var6];
                        int var465 = class26.field700[var6 + 1];
                        class21 var466 = class64.method394(var464, -1943367162, var465);
                        if (var466 != null && var465 != -1) {
                            class26.field700[var6++] = 1;
                            if (var46) {
                                client.field2768 = var466;
                            } else {
                                class120.field2237 = var466;
                            }
                            continue;
                        }
                        class26.field700[var6++] = 0;
                        continue;
                    }
                    if (var475 == 201) {
                        var6--;
                        int var467 = class26.field700[var6];
                        class21 var468 = class8.method55(65535, var467);
                        if (var468 == null) {
                            class26.field700[var6++] = 0;
                        } else {
                            class26.field700[var6++] = 1;
                            if (var46) {
                                client.field2768 = var468;
                            } else {
                                class120.field2237 = var468;
                            }
                        }
                        continue;
                    }
                } else if (var475 < 500) {
                    if (var475 == 403) {
                        var6 -= 2;
                        int var449 = class26.field700[var6];
                        if (var449 >= 7) {
                            var449 -= 7;
                        }
                        int var450 = class26.field700[var6 + 1];
                        class229.field4018.field2525.method139(var450, (byte) 123, var449);
                        continue;
                    }
                    if (var475 == 404) {
                        var6 -= 2;
                        int var451 = class26.field700[var6];
                        int var452 = class26.field700[var6 + 1];
                        class229.field4018.field2525.method147(-19652, var452, var451);
                        continue;
                    }
                    if (var475 == 410) {
                        var6--;
                        boolean var453 = class26.field700[var6] != 0;
                        class229.field4018.field2525.method142(-29615, var453);
                        continue;
                    }
                } else if (var475 >= 1000 && var475 < 1100 || var475 >= 2000 && var475 < 2100) {
                    class21 var443;
                    if (var475 >= 2000) {
                        var475 -= 1000;
                        var6--;
                        var443 = class8.method55(65535, class26.field700[var6]);
                    } else {
                        var443 = var46 ? client.field2768 : class120.field2237;
                    }
                    if (var475 == 1000) {
                        var6 -= 4;
                        var443.field551 = class26.field700[var6];
                        var443.field493 = class26.field700[var6 + 1];
                        int var444 = class26.field700[var6 + 2];
                        if (var444 < 0) {
                            var444 = 0;
                        } else if (var444 > 5) {
                            var444 = 5;
                        }
                        int var445 = class26.field700[var6 + 3];
                        if (var445 < 0) {
                            var445 = 0;
                        } else if (var445 > 5) {
                            var445 = 5;
                        }
                        var443.field604 = (byte) var445;
                        var443.field488 = (byte) var444;
                        class220.method1508(var443, (byte) -73);
                        class17.method124(var443, 127);
                        if (var443.field470 == -1) {
                            class194.method1319(var443.field537, -97);
                        }
                        continue;
                    }
                    if (var475 == 1001) {
                        var6 -= 4;
                        var443.field491 = class26.field700[var6];
                        var443.field541 = class26.field700[var6 + 1];
                        var443.field487 = 0;
                        var443.field565 = 0;
                        int var446 = class26.field700[var6 + 2];
                        if (var446 < 0) {
                            var446 = 0;
                        } else if (var446 > 4) {
                            var446 = 4;
                        }
                        int var447 = class26.field700[var6 + 3];
                        var443.field506 = (byte) var446;
                        if (var447 < 0) {
                            var447 = 0;
                        } else if (var447 > 4) {
                            var447 = 4;
                        }
                        var443.field578 = (byte) var447;
                        class220.method1508(var443, (byte) -97);
                        class17.method124(var443, 126);
                        if (var443.field519 == 0) {
                            class225.method1532(false, var443, -1);
                        }
                        continue;
                    }
                    if (var475 == 1003) {
                        var6--;
                        boolean var448 = class26.field700[var6] == 1;
                        if (var443.field563 != var448) {
                            var443.field563 = var448;
                            class220.method1508(var443, (byte) -87);
                        }
                        if (var443.field470 == -1) {
                            class276.method1876(var443.field537, (byte) 126);
                        }
                        continue;
                    }
                    if (var475 == 1004) {
                        var6 -= 2;
                        var443.field473 = class26.field700[var6];
                        var443.field472 = class26.field700[var6 + 1];
                        class220.method1508(var443, (byte) -124);
                        class17.method124(var443, 127);
                        if (var443.field519 == 0) {
                            class225.method1532(false, var443, -1);
                        }
                        continue;
                    }
                } else if (var475 >= 1100 && var475 < 1200 || var475 >= 2100 && var475 < 2200) {
                    class21 var440;
                    if (var475 >= 2000) {
                        var475 -= 1000;
                        var10000 = arg2 ^ 0xC000;
                        var6--;
                        var440 = class8.method55(var10000, class26.field700[var6]);
                    } else {
                        var440 = var46 ? client.field2768 : class120.field2237;
                    }
                    if (var475 == 1100) {
                        var6 -= 2;
                        var440.field591 = class26.field700[var6];
                        if (var440.field520 - var440.field539 < var440.field591) {
                            var440.field591 = var440.field520 - var440.field539;
                        }
                        if (var440.field591 < 0) {
                            var440.field591 = 0;
                        }
                        var440.field530 = class26.field700[var6 + 1];
                        if (var440.field530 > (var440.field503 - var440.field479)) {
                            var440.field530 = var440.field503 - var440.field479;
                        }
                        if (var440.field530 < 0) {
                            var440.field530 = 0;
                        }
                        class220.method1508(var440, (byte) -91);
                        if (var440.field470 == -1) {
                            class212.method1443((byte) -69, var440.field537);
                        }
                        continue;
                    }
                    if (var475 == 1101) {
                        var6--;
                        var440.field515 = class26.field700[var6];
                        class220.method1508(var440, (byte) -88);
                        if (var440.field470 == -1) {
                            class234.method1577(var440.field537, (byte) 78);
                        }
                        continue;
                    }
                    if (var475 == 1102) {
                        var6--;
                        var440.field507 = class26.field700[var6] == 1;
                        class220.method1508(var440, (byte) -61);
                        continue;
                    }
                    if (var475 == 1103) {
                        var6--;
                        var440.field567 = class26.field700[var6];
                        class220.method1508(var440, (byte) -87);
                        continue;
                    }
                    if (var475 == 1104) {
                        var6--;
                        var440.field475 = class26.field700[var6];
                        class220.method1508(var440, (byte) -107);
                        continue;
                    }
                    if (var475 == 1105) {
                        var6--;
                        var440.field605 = class26.field700[var6];
                        class220.method1508(var440, (byte) -105);
                        continue;
                    }
                    if (var475 == 1106) {
                        var6--;
                        var440.field483 = class26.field700[var6];
                        class220.method1508(var440, (byte) -60);
                        continue;
                    }
                    if (var475 == 1107) {
                        var6--;
                        var440.field607 = class26.field700[var6] == 1;
                        class220.method1508(var440, (byte) -68);
                        continue;
                    }
                    if (var475 == 1108) {
                        var440.field481 = 1;
                        var6--;
                        var440.field594 = class26.field700[var6];
                        class220.method1508(var440, (byte) -113);
                        if (var440.field470 == -1) {
                            class200.method1393(arg2 - 16423, var440.field537);
                        }
                        continue;
                    }
                    if (var475 == 1109) {
                        var6 -= 6;
                        var440.field555 = class26.field700[var6];
                        var440.field553 = class26.field700[var6 + 1];
                        var440.field495 = class26.field700[var6 + 2];
                        var440.field588 = class26.field700[var6 + 3];
                        var440.field582 = class26.field700[var6 + 4];
                        var440.field587 = class26.field700[var6 + 5];
                        class220.method1508(var440, (byte) -59);
                        if (var440.field470 == -1) {
                            class215.method1456(var440.field537, (byte) 78);
                            class236.method1581(var440.field537, arg2 - 16384);
                        }
                        continue;
                    }
                    if (var475 == 1110) {
                        var6--;
                        int var441 = class26.field700[var6];
                        if (var440.field623 != var441) {
                            var440.field623 = var441;
                            var440.field535 = 0;
                            var440.field614 = 0;
                            class220.method1508(var440, (byte) -87);
                        }
                        if (var440.field470 == -1) {
                            class276.method1874(5, var440.field537);
                        }
                        continue;
                    }
                    if (var475 == 1111) {
                        var6--;
                        var440.field598 = class26.field700[var6] == 1;
                        class220.method1508(var440, (byte) -62);
                        continue;
                    }
                    if (var475 == 1112) {
                        var7--;
                        class263 var442 = field3878[var7];
                        if (!var442.method1788(-26006, var440.field615)) {
                            var440.field615 = var442;
                            class220.method1508(var440, (byte) -104);
                        }
                        if (var440.field470 == -1) {
                            class111.method734((byte) -111, var440.field537);
                        }
                        continue;
                    }
                    if (var475 == 1113) {
                        var6--;
                        var440.field509 = class26.field700[var6];
                        class220.method1508(var440, (byte) -95);
                        continue;
                    }
                    if (var475 == 1114) {
                        var6 -= 3;
                        var440.field626 = class26.field700[var6];
                        var440.field524 = class26.field700[var6 + 1];
                        var440.field617 = class26.field700[var6 + 2];
                        class220.method1508(var440, (byte) -114);
                        continue;
                    }
                    if (var475 == 1115) {
                        var6--;
                        var440.field540 = class26.field700[var6] == 1;
                        class220.method1508(var440, (byte) -90);
                        continue;
                    }
                    if (var475 == 1116) {
                        var6--;
                        var440.field592 = class26.field700[var6];
                        class220.method1508(var440, (byte) -81);
                        continue;
                    }
                    if (var475 == 1117) {
                        var6--;
                        var440.field549 = class26.field700[var6];
                        class220.method1508(var440, (byte) -100);
                        continue;
                    }
                    if (var475 == 1118) {
                        var6--;
                        var440.field518 = class26.field700[var6] == 1;
                        class220.method1508(var440, (byte) -87);
                        continue;
                    }
                    if (var475 == 1119) {
                        var6--;
                        var440.field569 = class26.field700[var6] == 1;
                        class220.method1508(var440, (byte) -112);
                        continue;
                    }
                    if (var475 == 1120) {
                        var6 -= 2;
                        var440.field520 = class26.field700[var6];
                        var440.field503 = class26.field700[var6 + 1];
                        class220.method1508(var440, (byte) -100);
                        if (var440.field519 == 0) {
                            class225.method1532(false, var440, -1);
                        }
                        continue;
                    }
                    if (var475 == 1121) {
                        var6 -= 2;
                        class220.method1508(var440, (byte) -109);
                        continue;
                    }
                    if (var475 == 1122) {
                        var6--;
                        var440.field583 = class26.field700[var6] == 1;
                        class220.method1508(var440, (byte) -120);
                        continue;
                    }
                } else if (!(var475 < 1200 || var475 >= 1300) || !(var475 < 2200 || var475 >= 2300)) {
                    class21 var436;
                    if (var475 >= 2000) {
                        var475 -= 1000;
                        var6--;
                        var436 = class8.method55(65535, class26.field700[var6]);
                    } else {
                        var436 = var46 ? client.field2768 : class120.field2237;
                    }
                    class220.method1508(var436, (byte) -60);
                    if (var475 == 1200 || var475 == 1205) {
                        var6 -= 2;
                        int var437 = class26.field700[var6];
                        int var438 = class26.field700[var6 + 1];
                        if (var436.field470 == -1) {
                            class275.method1871(var436.field537, 113);
                            class215.method1456(var436.field537, (byte) -62);
                            class236.method1581(var436.field537, -1);
                        }
                        if (var437 == -1) {
                            var436.field620 = -1;
                            var436.field481 = 1;
                            var436.field594 = -1;
                        } else {
                            var436.field620 = var437;
                            var436.field508 = var438;
                            class72 var439 = class92.method649(-32508, var437);
                            var436.field555 = var439.field1505;
                            var436.field582 = var439.field1440;
                            var436.field553 = var439.field1456;
                            var436.field495 = var439.field1459;
                            var436.field587 = var439.field1448;
                            var436.field588 = var439.field1492;
                            if (var475 == 1205) {
                                var436.field608 = false;
                            } else {
                                var436.field608 = true;
                            }
                            if (var436.field487 > 0) {
                                var436.field587 = var436.field587 * 32 / var436.field487;
                            } else if (var436.field491 > 0) {
                                var436.field587 = var436.field587 * 32 / var436.field491;
                            }
                        }
                        continue;
                    }
                    if (var475 == 1201) {
                        var436.field481 = 2;
                        var6--;
                        var436.field594 = class26.field700[var6];
                        if (var436.field470 == -1) {
                            class200.method1393(-121, var436.field537);
                        }
                        continue;
                    }
                    if (var475 == 1202) {
                        var436.field481 = 3;
                        var436.field594 = class229.field4018.field2525.method138(arg2 - 16375);
                        if (var436.field470 == -1) {
                            class200.method1393(-46, var436.field537);
                        }
                        continue;
                    }
                    if (var475 == 1203) {
                        var436.field481 = 6;
                        var6--;
                        var436.field594 = class26.field700[var6];
                        if (var436.field470 == -1) {
                            class200.method1393(-65, var436.field537);
                        }
                        continue;
                    }
                    if (var475 == 1204) {
                        var436.field481 = 5;
                        var6--;
                        var436.field594 = class26.field700[var6];
                        if (var436.field470 == -1) {
                            class200.method1393(-121, var436.field537);
                        }
                        continue;
                    }
                } else if (var475 >= 1300 && var475 < 1400 || var475 >= 2300 && var475 < 2400) {
                    class21 var432;
                    if (var475 < 2000) {
                        var432 = var46 ? client.field2768 : class120.field2237;
                    } else {
                        var475 -= 1000;
                        var6--;
                        var432 = class8.method55(65535, class26.field700[var6]);
                    }
                    if (var475 == 1300) {
                        var6--;
                        int var433 = class26.field700[var6] - 1;
                        if (var433 >= 0 && var433 <= 9) {
                            var7--;
                            var432.method154(field3878[var7], 2045560231, var433);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var475 == 1301) {
                        var6 -= 2;
                        int var434 = class26.field700[var6 + 1];
                        int var435 = class26.field700[var6];
                        var432.field571 = class64.method394(var435, -1943367162, var434);
                        continue;
                    }
                    if (var475 == 1302) {
                        var6--;
                        var432.field525 = class26.field700[var6] == 1;
                        continue;
                    }
                    if (var475 == 1303) {
                        var6--;
                        var432.field590 = class26.field700[var6];
                        continue;
                    }
                    if (var475 == 1304) {
                        var6--;
                        var432.field505 = class26.field700[var6];
                        continue;
                    }
                    if (var475 == 1305) {
                        var7--;
                        var432.field477 = field3878[var7];
                        continue;
                    }
                    if (var475 == 1306) {
                        var7--;
                        var432.field548 = field3878[var7];
                        continue;
                    }
                    if (var475 == 1307) {
                        var432.field485 = null;
                        continue;
                    }
                } else {
                    if (var475 >= 1400 && var475 < 1500 || var475 >= 2400 && var475 < 2500) {
                        class21 var425;
                        if (var475 < 2000) {
                            var425 = var46 ? client.field2768 : class120.field2237;
                        } else {
                            var475 -= 1000;
                            var6--;
                            var425 = class8.method55(65535, class26.field700[var6]);
                        }
                        int[] var426 = null;
                        var7--;
                        class263 var427 = field3878[var7];
                        if (var427.method1740(arg2 ^ 0xFFFFC07D) > 0 && var427.method1784(var427.method1740(-123) - 1, 107) == 89) {
                            var6--;
                            int var428 = class26.field700[var6];
                            if (var428 > 0) {
                                var426 = new int[var428];
                                while (var428-- > 0) {
                                    var6--;
                                    var426[var428] = class26.field700[var6];
                                }
                            }
                            var427 = var427.method1763(arg2 ^ 0xFFFFC07B, var427.method1740(-126) - 1, 0);
                        }
                        Object[] var429 = new Object[var427.method1740(-126) + 1];
                        for (int var430 = var429.length - 1; var430 >= 1; var430--) {
                            if (var427.method1784(var430 - 1, arg2 + -16274) == 115) {
                                var7--;
                                var429[var430] = field3878[var7];
                            } else {
                                var6--;
                                var429[var430] = Integer.valueOf(class26.field700[var6]);
                            }
                        }
                        var6--;
                        int var431 = class26.field700[var6];
                        if (var431 == -1) {
                            var429 = null;
                        } else {
                            var429[0] = Integer.valueOf(var431);
                        }
                        if (var475 == 1400) {
                            var425.field552 = var429;
                        } else if (var475 == 1401) {
                            var425.field556 = var429;
                        } else if (var475 == 1402) {
                            var425.field538 = var429;
                        } else if (var475 == 1403) {
                            var425.field568 = var429;
                        } else if (var475 == 1404) {
                            var425.field597 = var429;
                        } else if (var475 == 1405) {
                            var425.field584 = var429;
                        } else if (var475 == 1406) {
                            var425.field521 = var429;
                        } else if (var475 == 1407) {
                            var425.field613 = var426;
                            var425.field522 = var429;
                        } else if (var475 == 1408) {
                            var425.field531 = var429;
                        } else if (var475 == 1409) {
                            var425.field492 = var429;
                        } else if (var475 == 1410) {
                            var425.field527 = var429;
                        } else if (var475 == 1411) {
                            var425.field562 = var429;
                        } else if (var475 == 1412) {
                            var425.field586 = var429;
                        } else if (var475 == 1414) {
                            var425.field546 = var429;
                            var425.field498 = var426;
                        } else if (var475 == 1415) {
                            var425.field497 = var426;
                            var425.field622 = var429;
                        } else if (var475 == 1416) {
                            var425.field610 = var429;
                        } else if (var475 == 1417) {
                            var425.field513 = var429;
                        } else if (var475 == 1418) {
                            var425.field600 = var429;
                        } else if (var475 == 1419) {
                            var425.field476 = var429;
                        } else if (var475 == 1420) {
                            var425.field628 = var429;
                        } else if (var475 == 1421) {
                            var425.field499 = var429;
                        } else if (var475 == 1422) {
                            var425.field631 = var429;
                        } else if (var475 == 1423) {
                            var425.field561 = var429;
                        } else if (var475 == 1424) {
                            var425.field609 = var429;
                        } else if (var475 == 1425) {
                            var425.field528 = var429;
                        } else if (var475 == 1426) {
                            var425.field471 = var429;
                        } else if (var475 == 1427) {
                            var425.field593 = var429;
                        } else if (var475 == 1428) {
                            var425.field510 = var429;
                            var425.field532 = var426;
                        } else if (var475 == 1429) {
                            var425.field595 = var429;
                            var425.field580 = var426;
                        }
                        var425.field570 = true;
                        continue;
                    }
                    if (var475 < 1600) {
                        class21 var47 = var46 ? client.field2768 : class120.field2237;
                        if (var475 == 1500) {
                            class26.field700[var6++] = var47.field523;
                            continue;
                        }
                        if (var475 == 1501) {
                            class26.field700[var6++] = var47.field547;
                            continue;
                        }
                        if (var475 == 1502) {
                            class26.field700[var6++] = var47.field539;
                            continue;
                        }
                        if (var475 == 1503) {
                            class26.field700[var6++] = var47.field479;
                            continue;
                        }
                        if (var475 == 1504) {
                            class26.field700[var6++] = var47.field563 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 1505) {
                            class26.field700[var6++] = var47.field536;
                            continue;
                        }
                    } else if (var475 < 1700) {
                        class21 var48 = var46 ? client.field2768 : class120.field2237;
                        if (var475 == 1600) {
                            class26.field700[var6++] = var48.field591;
                            continue;
                        }
                        if (var475 == 1601) {
                            class26.field700[var6++] = var48.field530;
                            continue;
                        }
                        if (var475 == 1602) {
                            field3878[var7++] = var48.field615;
                            continue;
                        }
                        if (var475 == 1603) {
                            class26.field700[var6++] = var48.field520;
                            continue;
                        }
                        if (var475 == 1604) {
                            class26.field700[var6++] = var48.field503;
                            continue;
                        }
                        if (var475 == 1605) {
                            class26.field700[var6++] = var48.field587;
                            continue;
                        }
                        if (var475 == 1606) {
                            class26.field700[var6++] = var48.field495;
                            continue;
                        }
                        if (var475 == 1607) {
                            class26.field700[var6++] = var48.field582;
                            continue;
                        }
                        if (var475 == 1608) {
                            class26.field700[var6++] = var48.field588;
                            continue;
                        }
                        if (var475 == 1609) {
                            class26.field700[var6++] = var48.field567;
                            continue;
                        }
                    } else if (var475 < 1800) {
                        class21 var424 = var46 ? client.field2768 : class120.field2237;
                        if (var475 == 1700) {
                            class26.field700[var6++] = var424.field620;
                            continue;
                        }
                        if (var475 == 1701) {
                            if (var424.field620 == -1) {
                                class26.field700[var6++] = 0;
                            } else {
                                class26.field700[var6++] = var424.field508;
                            }
                            continue;
                        }
                        if (var475 == 1702) {
                            class26.field700[var6++] = var424.field470;
                            continue;
                        }
                    } else if (var475 < 1900) {
                        class21 var422 = var46 ? client.field2768 : class120.field2237;
                        if (var475 == 1800) {
                            class26.field700[var6++] = class238.method1592(-479449948, client.method1005(var422));
                            continue;
                        }
                        if (var475 == 1801) {
                            var6--;
                            int var423 = class26.field700[var6];
                            int var477 = var423 - 1;
                            if (var422.field485 != null && var477 < var422.field485.length && var422.field485[var477] != null) {
                                field3878[var7++] = var422.field485[var477];
                                continue;
                            }
                            field3878[var7++] = class40.field906;
                            continue;
                        }
                        if (var475 == 1802) {
                            if (var422.field477 == null) {
                                field3878[var7++] = class40.field906;
                            } else {
                                field3878[var7++] = var422.field477;
                            }
                            continue;
                        }
                    } else if (var475 < 2600) {
                        var6--;
                        class21 var421 = class8.method55(65535, class26.field700[var6]);
                        if (var475 == 2500) {
                            class26.field700[var6++] = var421.field523;
                            continue;
                        }
                        if (var475 == 2501) {
                            class26.field700[var6++] = var421.field547;
                            continue;
                        }
                        if (var475 == 2502) {
                            class26.field700[var6++] = var421.field539;
                            continue;
                        }
                        if (var475 == 2503) {
                            class26.field700[var6++] = var421.field479;
                            continue;
                        }
                        if (var475 == 2504) {
                            class26.field700[var6++] = var421.field563 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 2505) {
                            class26.field700[var6++] = var421.field536;
                            continue;
                        }
                    } else if (var475 < 2700) {
                        var6--;
                        class21 var420 = class8.method55(65535, class26.field700[var6]);
                        if (var475 == 2600) {
                            class26.field700[var6++] = var420.field591;
                            continue;
                        }
                        if (var475 == 2601) {
                            class26.field700[var6++] = var420.field530;
                            continue;
                        }
                        if (var475 == 2602) {
                            field3878[var7++] = var420.field615;
                            continue;
                        }
                        if (var475 == 2603) {
                            class26.field700[var6++] = var420.field520;
                            continue;
                        }
                        if (var475 == 2604) {
                            class26.field700[var6++] = var420.field503;
                            continue;
                        }
                        if (var475 == 2605) {
                            class26.field700[var6++] = var420.field587;
                            continue;
                        }
                        if (var475 == 2606) {
                            class26.field700[var6++] = var420.field495;
                            continue;
                        }
                        if (var475 == 2607) {
                            class26.field700[var6++] = var420.field582;
                            continue;
                        }
                        if (var475 == 2608) {
                            class26.field700[var6++] = var420.field588;
                            continue;
                        }
                        if (var475 == 2609) {
                            class26.field700[var6++] = var420.field567;
                            continue;
                        }
                    } else if (var475 < 2800) {
                        if (var475 == 2700) {
                            var10000 = arg2 ^ 0xC000;
                            var6--;
                            class21 var49 = class8.method55(var10000, class26.field700[var6]);
                            class26.field700[var6++] = var49.field620;
                            continue;
                        }
                        if (var475 == 2701) {
                            var6--;
                            class21 var50 = class8.method55(65535, class26.field700[var6]);
                            if (var50.field620 == -1) {
                                class26.field700[var6++] = 0;
                            } else {
                                class26.field700[var6++] = var50.field508;
                            }
                            continue;
                        }
                        if (var475 == 2702) {
                            var6--;
                            int var51 = class26.field700[var6];
                            class266 var52 = (class266) class212.field3797.method31(-32665, (long) var51);
                            if (var52 == null) {
                                class26.field700[var6++] = 0;
                            } else {
                                class26.field700[var6++] = 1;
                            }
                            continue;
                        }
                        if (var475 == 2703) {
                            var6--;
                            class21 var53 = class8.method55(65535, class26.field700[var6]);
                            if (var53.field589 == null) {
                                class26.field700[var6++] = 0;
                                continue;
                            }
                            int var54 = var53.field589.length;
                            for (int var55 = 0; var55 < var53.field589.length; var55++) {
                                if (var53.field589[var55] == null) {
                                    var54 = var55;
                                    break;
                                }
                            }
                            class26.field700[var6++] = var54;
                            continue;
                        }
                        if (var475 == 2704 || var475 == 2705) {
                            var6 -= 2;
                            int var56 = class26.field700[var6 + 1];
                            int var57 = class26.field700[var6];
                            class266 var58 = (class266) class212.field3797.method31(-32665, (long) var57);
                            if (var58 != null && var58.field4641 == var56) {
                                class26.field700[var6++] = 1;
                                continue;
                            }
                            class26.field700[var6++] = 0;
                            continue;
                        }
                    } else if (var475 < 2900) {
                        var6--;
                        class21 var418 = class8.method55(65535, class26.field700[var6]);
                        if (var475 == 2800) {
                            class26.field700[var6++] = class238.method1592(-479449948, client.method1005(var418));
                            continue;
                        }
                        if (var475 == 2801) {
                            var6--;
                            int var419 = class26.field700[var6];
                            int var476 = var419 - 1;
                            if (var418.field485 != null && var418.field485.length > var476 && var418.field485[var476] != null) {
                                field3878[var7++] = var418.field485[var476];
                                continue;
                            }
                            field3878[var7++] = class40.field906;
                            continue;
                        }
                        if (var475 == 2802) {
                            if (var418.field477 == null) {
                                field3878[var7++] = class40.field906;
                            } else {
                                field3878[var7++] = var418.field477;
                            }
                            continue;
                        }
                    } else if (var475 < 3200) {
                        if (var475 == 3100) {
                            var7--;
                            class263 var403 = field3878[var7];
                            class120.method774(0, var403, -11292, class40.field906);
                            continue;
                        }
                        if (var475 == 3101) {
                            var6 -= 2;
                            class165.method1085(class229.field4018, -2662, class26.field700[var6], class26.field700[var6 + 1]);
                            continue;
                        }
                        if (var475 == 3103) {
                            class271.method1845(arg2 ^ 0x3FFF);
                            continue;
                        }
                        if (var475 == 3104) {
                            class17.field401++;
                            int var404 = 0;
                            var7--;
                            class263 var405 = field3878[var7];
                            if (var405.method1770((byte) -86)) {
                                var404 = var405.method1769(10);
                            }
                            class154.field2792.method1516(arg2 ^ 0x3F98, 178);
                            class154.field2792.method1286(arg2 ^ 0xFFFFEDDB, var404);
                            continue;
                        }
                        if (var475 == 3105) {
                            class28.field725++;
                            var7--;
                            class263 var406 = field3878[var7];
                            class154.field2792.method1516(-112, 129);
                            class154.field2792.method1272((byte) 29, var406.method1755(1));
                            continue;
                        }
                        if (var475 == 3106) {
                            var7--;
                            class263 var407 = field3878[var7];
                            class87.field1742++;
                            class154.field2792.method1516(66, 10);
                            class154.field2792.method1288((byte) -127, var407.method1740(-127) + 1);
                            class154.field2792.method1312(-95, var407);
                            continue;
                        }
                        if (var475 == 3107) {
                            var6--;
                            int var408 = class26.field700[var6];
                            var7--;
                            class263 var409 = field3878[var7];
                            class271.method1846(0, var409, var408);
                            continue;
                        }
                        if (var475 == 3108) {
                            var6 -= 3;
                            int var410 = class26.field700[var6 + 2];
                            int var411 = class26.field700[var6];
                            int var412 = class26.field700[var6 + 1];
                            class21 var413 = class8.method55(65535, var410);
                            class244.method1656(var412, var411, var413, -28373);
                            continue;
                        }
                        if (var475 == 3109) {
                            var6 -= 2;
                            int var414 = class26.field700[var6];
                            int var415 = class26.field700[var6 + 1];
                            class21 var416 = var46 ? client.field2768 : class120.field2237;
                            class244.method1656(var415, var414, var416, -28373);
                            continue;
                        }
                        if (var475 == 3110) {
                            class230.field4024++;
                            var6--;
                            int var417 = class26.field700[var6];
                            class154.field2792.method1516(arg2 - 16311, 143);
                            class154.field2792.method1276(var417, arg2 - 16478);
                            continue;
                        }
                    } else if (var475 < 3300) {
                        if (var475 == 3200) {
                            var6 -= 3;
                            class95.method665(0, class26.field700[var6], class26.field700[var6 + 2], class26.field700[var6 + 1]);
                            continue;
                        }
                        if (var475 == 3201) {
                            var6--;
                            class198.method1347(0, class26.field700[var6]);
                            continue;
                        }
                        if (var475 == 3202) {
                            var6 -= 2;
                            class2.method12(class26.field700[var6 + 1], class26.field700[var6], 65);
                            continue;
                        }
                    } else if (var475 < 3400) {
                        if (var475 == 3300) {
                            class26.field700[var6++] = class228.field4012;
                            continue;
                        }
                        if (var475 == 3301) {
                            var6 -= 2;
                            int var376 = class26.field700[var6 + 1];
                            int var377 = class26.field700[var6];
                            class26.field700[var6++] = class56.method358(false, var376, var377);
                            continue;
                        }
                        if (var475 == 3302) {
                            var6 -= 2;
                            int var378 = class26.field700[var6];
                            int var379 = class26.field700[var6 + 1];
                            class26.field700[var6++] = class114.method752(-95, var378, var379);
                            continue;
                        }
                        if (var475 == 3303) {
                            var6 -= 2;
                            int var380 = class26.field700[var6];
                            int var381 = class26.field700[var6 + 1];
                            class26.field700[var6++] = class61.method373(var380, (byte) 54, var381);
                            continue;
                        }
                        if (var475 == 3304) {
                            var6--;
                            int var382 = class26.field700[var6];
                            class26.field700[var6++] = class260.method1715(var382, -22675).field4461;
                            continue;
                        }
                        if (var475 == 3305) {
                            var6--;
                            int var383 = class26.field700[var6];
                            class26.field700[var6++] = class251.field4369[var383];
                            continue;
                        }
                        if (var475 == 3306) {
                            var6--;
                            int var384 = class26.field700[var6];
                            class26.field700[var6++] = class73.field1541[var384];
                            continue;
                        }
                        if (var475 == 3307) {
                            var6--;
                            int var385 = class26.field700[var6];
                            class26.field700[var6++] = class276.field4829[var385];
                            continue;
                        }
                        if (var475 == 3308) {
                            int var386 = class12.field321;
                            int var387 = (class229.field4018.field4688 >> 7) + class93.field1844;
                            int var388 = (class229.field4018.field4705 >> 7) + class142.field2596;
                            class26.field700[var6++] = (var386 << 28) - (-(var387 << 14) - var388);
                            continue;
                        }
                        if (var475 == 3309) {
                            var6--;
                            int var389 = class26.field700[var6];
                            class26.field700[var6++] = class263.method1777(268425274, var389) >> 14;
                            continue;
                        }
                        if (var475 == 3310) {
                            var6--;
                            int var390 = class26.field700[var6];
                            class26.field700[var6++] = var390 >> 28;
                            continue;
                        }
                        if (var475 == 3311) {
                            var6--;
                            int var391 = class26.field700[var6];
                            class26.field700[var6++] = class263.method1777(16383, var391);
                            continue;
                        }
                        if (var475 == 3312) {
                            class26.field700[var6++] = class86.field1698 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3313) {
                            var6 -= 2;
                            int var392 = class26.field700[var6] + 32768;
                            int var393 = class26.field700[var6 + 1];
                            class26.field700[var6++] = class56.method358(false, var393, var392);
                            continue;
                        }
                        if (var475 == 3314) {
                            var6 -= 2;
                            int var394 = class26.field700[var6] + 32768;
                            int var395 = class26.field700[var6 + 1];
                            class26.field700[var6++] = class114.method752(-94, var394, var395);
                            continue;
                        }
                        if (var475 == 3315) {
                            var6 -= 2;
                            int var396 = class26.field700[var6 + 1];
                            int var397 = class26.field700[var6] + 32768;
                            class26.field700[var6++] = class61.method373(var397, (byte) 54, var396);
                            continue;
                        }
                        if (var475 == 3316) {
                            if (class4.field82 < 2) {
                                class26.field700[var6++] = 0;
                            } else {
                                class26.field700[var6++] = class4.field82;
                            }
                            continue;
                        }
                        if (var475 == 3317) {
                            class26.field700[var6++] = class254.field4424;
                            continue;
                        }
                        if (var475 == 3318) {
                            class26.field700[var6++] = class7.field127;
                            continue;
                        }
                        if (var475 == 3321) {
                            class26.field700[var6++] = class86.field1724;
                            continue;
                        }
                        if (var475 == 3322) {
                            class26.field700[var6++] = class120.field2224;
                            continue;
                        }
                        if (var475 == 3323) {
                            if (class5.field90 >= 5 && class5.field90 <= 9) {
                                class26.field700[var6++] = 1;
                                continue;
                            }
                            class26.field700[var6++] = 0;
                            continue;
                        }
                        if (var475 == 3324) {
                            if (class5.field90 >= 5 && class5.field90 <= 9) {
                                class26.field700[var6++] = class5.field90;
                                continue;
                            }
                            class26.field700[var6++] = 0;
                            continue;
                        }
                        if (var475 == 3325) {
                            class26.field700[var6++] = class258.field4479 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3326) {
                            class26.field700[var6++] = class229.field4018.field2522;
                            continue;
                        }
                        if (var475 == 3327) {
                            class26.field700[var6++] = class229.field4018.field2525.field439 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3328) {
                            class26.field700[var6++] = class156.field2806 && !class85.field1670 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3329) {
                            class26.field700[var6++] = class134.field2451 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3330) {
                            var6--;
                            int var398 = class26.field700[var6];
                            class26.field700[var6++] = class96.method669(class38.method239(arg2, 16383), var398);
                            continue;
                        }
                        if (var475 == 3331) {
                            var6 -= 2;
                            int var399 = class26.field700[var6];
                            int var400 = class26.field700[var6 + 1];
                            class26.field700[var6++] = class171.method1128(false, var399, (byte) 12, var400);
                            continue;
                        }
                        if (var475 == 3332) {
                            var6 -= 2;
                            int var401 = class26.field700[var6];
                            int var402 = class26.field700[var6 + 1];
                            class26.field700[var6++] = class171.method1128(true, var401, (byte) 12, var402);
                            continue;
                        }
                        if (var475 == 3333) {
                            class26.field700[var6++] = class201.field3636;
                            continue;
                        }
                        if (var475 == 3335) {
                            class26.field700[var6++] = class17.field388;
                            continue;
                        }
                    } else if (var475 < 3500) {
                        if (var475 == 3400) {
                            var6 -= 2;
                            int var359 = class26.field700[var6];
                            int var360 = class26.field700[var6 + 1];
                            class36 var361 = class115.method757(1, var359);
                            field3878[var7++] = var361.method227(-108, var360);
                            continue;
                        }
                        if (var475 == 3408) {
                            var6 -= 4;
                            int var362 = class26.field700[var6];
                            int var363 = class26.field700[var6 + 1];
                            int var364 = class26.field700[var6 + 3];
                            int var365 = class26.field700[var6 + 2];
                            class36 var366 = class115.method757(arg2 ^ 0x3FFE, var365);
                            if (var366.field839 == var362 && var366.field847 == var363) {
                                if (var363 == 115) {
                                    field3878[var7++] = var366.method227(-110, var364);
                                } else {
                                    class26.field700[var6++] = var366.method226(90, var364);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var475 == 3409) {
                            var6 -= 3;
                            int var367 = class26.field700[var6];
                            int var368 = class26.field700[var6 + 2];
                            int var369 = class26.field700[var6 + 1];
                            if (var369 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class36 var370 = class115.method757(1, var369);
                            if (var370.field847 != var367) {
                                throw new RuntimeException("C3409-1");
                            }
                            class26.field700[var6++] = var370.method225((byte) 103, var368) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3410) {
                            var6--;
                            int var371 = class26.field700[var6];
                            var7--;
                            class263 var372 = field3878[var7];
                            if (var371 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class36 var373 = class115.method757(1, var371);
                            if (var373.field847 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class26.field700[var6++] = var373.method224(var372, 0) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3411) {
                            var6--;
                            int var374 = class26.field700[var6];
                            class36 var375 = class115.method757(1, var374);
                            class26.field700[var6++] = var375.field841.method34(class38.method239(arg2, 16296));
                            continue;
                        }
                    } else if (var475 < 3700) {
                        if (var475 == 3600) {
                            if (class60.field1232 == 0) {
                                class26.field700[var6++] = -2;
                            } else if (class60.field1232 == 1) {
                                class26.field700[var6++] = -1;
                            } else {
                                class26.field700[var6++] = class100.field1908;
                            }
                            continue;
                        }
                        if (var475 == 3601) {
                            var6--;
                            int var337 = class26.field700[var6];
                            if (class60.field1232 == 2 && var337 < class100.field1908) {
                                field3878[var7++] = class238.field4159[var337];
                                continue;
                            }
                            field3878[var7++] = class40.field906;
                            continue;
                        }
                        if (var475 == 3602) {
                            var6--;
                            int var338 = class26.field700[var6];
                            if (class60.field1232 == 2 && class100.field1908 > var338) {
                                class26.field700[var6++] = class92.field1812[var338];
                                continue;
                            }
                            class26.field700[var6++] = 0;
                            continue;
                        }
                        if (var475 == 3603) {
                            var6--;
                            int var339 = class26.field700[var6];
                            if (class60.field1232 == 2 && var339 < class100.field1908) {
                                class26.field700[var6++] = class268.field4726[var339];
                                continue;
                            }
                            class26.field700[var6++] = 0;
                            continue;
                        }
                        if (var475 == 3604) {
                            var7--;
                            class263 var340 = field3878[var7];
                            var6--;
                            int var341 = class26.field700[var6];
                            class143.method946(var340, 4163, var341);
                            continue;
                        }
                        if (var475 == 3605) {
                            var7--;
                            class263 var342 = field3878[var7];
                            class73.method475(-26279, var342.method1755(1));
                            continue;
                        }
                        if (var475 == 3606) {
                            var7--;
                            class263 var343 = field3878[var7];
                            class209.method1441(1, var343.method1755(1));
                            continue;
                        }
                        if (var475 == 3607) {
                            var7--;
                            class263 var344 = field3878[var7];
                            class191.method1256(-117, var344.method1755(1));
                            continue;
                        }
                        if (var475 == 3608) {
                            var7--;
                            class263 var345 = field3878[var7];
                            class182.method1212(var345.method1755(1), true);
                            continue;
                        }
                        if (var475 == 3609) {
                            var7--;
                            class263 var346 = field3878[var7];
                            if (var346.method1754((byte) 121, class143.field2611) || var346.method1754((byte) 103, class201.field3635)) {
                                var346 = var346.method1787(7, false);
                            }
                            class26.field700[var6++] = class159.method1050(var346, (byte) -3) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3610) {
                            var6--;
                            int var347 = class26.field700[var6];
                            if (class60.field1232 == 2 && class100.field1908 > var347) {
                                field3878[var7++] = class2.field30[var347];
                                continue;
                            }
                            field3878[var7++] = class40.field906;
                            continue;
                        }
                        if (var475 == 3611) {
                            if (class8.field146 == null) {
                                field3878[var7++] = class40.field906;
                            } else {
                                field3878[var7++] = class8.field146.method1761(122);
                            }
                            continue;
                        }
                        if (var475 == 3612) {
                            if (class8.field146 == null) {
                                class26.field700[var6++] = 0;
                            } else {
                                class26.field700[var6++] = class196.field3545;
                            }
                            continue;
                        }
                        if (var475 == 3613) {
                            var6--;
                            int var348 = class26.field700[var6];
                            if (class8.field146 != null && var348 < class196.field3545) {
                                field3878[var7++] = class225.field3970[var348].field411.method1761(122);
                                continue;
                            }
                            field3878[var7++] = class40.field906;
                            continue;
                        }
                        if (var475 == 3614) {
                            var6--;
                            int var349 = class26.field700[var6];
                            if (class8.field146 != null && class196.field3545 > var349) {
                                class26.field700[var6++] = class225.field3970[var349].field407;
                                continue;
                            }
                            class26.field700[var6++] = 0;
                            continue;
                        }
                        if (var475 == 3615) {
                            var6--;
                            int var350 = class26.field700[var6];
                            if (class8.field146 != null && var350 < class196.field3545) {
                                class26.field700[var6++] = class225.field3970[var350].field414;
                                continue;
                            }
                            class26.field700[var6++] = 0;
                            continue;
                        }
                        if (var475 == 3616) {
                            class26.field700[var6++] = class240.field4225;
                            continue;
                        }
                        if (var475 == 3617) {
                            var7--;
                            class263 var351 = field3878[var7];
                            class266.method1800(var351, (byte) 49);
                            continue;
                        }
                        if (var475 == 3618) {
                            class26.field700[var6++] = class145.field2649;
                            continue;
                        }
                        if (var475 == 3619) {
                            var7--;
                            class263 var352 = field3878[var7];
                            class190.method1244(var352.method1755(1), 123);
                            continue;
                        }
                        if (var475 == 3620) {
                            class79.method539(true);
                            continue;
                        }
                        if (var475 == 3621) {
                            if (class60.field1232 == 0) {
                                class26.field700[var6++] = -1;
                            } else {
                                class26.field700[var6++] = class31.field785;
                            }
                            continue;
                        }
                        if (var475 == 3622) {
                            var6--;
                            int var353 = class26.field700[var6];
                            if (class60.field1232 != 0 && class31.field785 > var353) {
                                field3878[var7++] = class233.method1565(37, class41.field909[var353]).method1761(arg2 - 16261);
                                continue;
                            }
                            field3878[var7++] = class40.field906;
                            continue;
                        }
                        if (var475 == 3623) {
                            var7--;
                            class263 var354 = field3878[var7];
                            if (var354.method1754((byte) -73, class143.field2611) || var354.method1754((byte) -87, class201.field3635)) {
                                var354 = var354.method1787(7, false);
                            }
                            class26.field700[var6++] = class22.method166(var354, (byte) 121) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3624) {
                            var6--;
                            int var355 = class26.field700[var6];
                            if (class225.field3970 != null && var355 < class196.field3545 && class225.field3970[var355].field411.method1766(-1, class229.field4018.field2508)) {
                                class26.field700[var6++] = 1;
                                continue;
                            }
                            class26.field700[var6++] = 0;
                            continue;
                        }
                        if (var475 == 3625) {
                            if (class214.field3802 == null) {
                                field3878[var7++] = class40.field906;
                            } else {
                                field3878[var7++] = class214.field3802.method1761(122);
                            }
                            continue;
                        }
                        if (var475 == 3626) {
                            var6--;
                            int var356 = class26.field700[var6];
                            if (class8.field146 != null && var356 < class196.field3545) {
                                field3878[var7++] = class225.field3970[var356].field409;
                                continue;
                            }
                            field3878[var7++] = class40.field906;
                            continue;
                        }
                        if (var475 == 3627) {
                            var6--;
                            int var357 = class26.field700[var6];
                            if (class60.field1232 == 2 && var357 >= 0 && class100.field1908 > var357) {
                                class26.field700[var6++] = class82.field1633[var357] ? 1 : 0;
                                continue;
                            }
                            class26.field700[var6++] = 0;
                            continue;
                        }
                        if (var475 == 3628) {
                            var7--;
                            class263 var358 = field3878[var7];
                            if (var358.method1754((byte) 47, class143.field2611) || var358.method1754((byte) -100, class201.field3635)) {
                                var358 = var358.method1787(7, false);
                            }
                            class26.field700[var6++] = class252.method1676(-1, var358);
                            continue;
                        }
                        if (var475 == 3629) {
                            class26.field700[var6++] = class232.field4064;
                            continue;
                        }
                    } else if (var475 < 4000) {
                        if (var475 == 3903) {
                            var6--;
                            int var323 = class26.field700[var6];
                            class26.field700[var6++] = class238.field4148[var323].method951(class38.method239(arg2, -16261));
                            continue;
                        }
                        if (var475 == 3904) {
                            var6--;
                            int var324 = class26.field700[var6];
                            class26.field700[var6++] = class238.field4148[var324].field2633;
                            continue;
                        }
                        if (var475 == 3905) {
                            var6--;
                            int var325 = class26.field700[var6];
                            class26.field700[var6++] = class238.field4148[var325].field2627;
                            continue;
                        }
                        if (var475 == 3906) {
                            var6--;
                            int var326 = class26.field700[var6];
                            class26.field700[var6++] = class238.field4148[var326].field2643;
                            continue;
                        }
                        if (var475 == 3907) {
                            var6--;
                            int var327 = class26.field700[var6];
                            class26.field700[var6++] = class238.field4148[var327].field2632;
                            continue;
                        }
                        if (var475 == 3908) {
                            var6--;
                            int var328 = class26.field700[var6];
                            class26.field700[var6++] = class238.field4148[var328].field2648;
                            continue;
                        }
                        if (var475 == 3910) {
                            var6--;
                            int var329 = class26.field700[var6];
                            int var330 = class238.field4148[var329].method954(true);
                            class26.field700[var6++] = var330 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3911) {
                            var6--;
                            int var331 = class26.field700[var6];
                            int var332 = class238.field4148[var331].method954(true);
                            class26.field700[var6++] = var332 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3912) {
                            var6--;
                            int var333 = class26.field700[var6];
                            int var334 = class238.field4148[var333].method954(true);
                            class26.field700[var6++] = var334 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 3913) {
                            var6--;
                            int var335 = class26.field700[var6];
                            int var336 = class238.field4148[var335].method954(true);
                            class26.field700[var6++] = var336 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var475 < 4100) {
                        if (var475 == 4000) {
                            var6 -= 2;
                            int var278 = class26.field700[var6];
                            int var279 = class26.field700[var6 + 1];
                            class26.field700[var6++] = var278 + var279;
                            continue;
                        }
                        if (var475 == 4001) {
                            var6 -= 2;
                            int var280 = class26.field700[var6];
                            int var281 = class26.field700[var6 + 1];
                            class26.field700[var6++] = var280 - var281;
                            continue;
                        }
                        if (var475 == 4002) {
                            var6 -= 2;
                            int var282 = class26.field700[var6 + 1];
                            int var283 = class26.field700[var6];
                            class26.field700[var6++] = var282 * var283;
                            continue;
                        }
                        if (var475 == 4003) {
                            var6 -= 2;
                            int var284 = class26.field700[var6];
                            int var285 = class26.field700[var6 + 1];
                            class26.field700[var6++] = var284 / var285;
                            continue;
                        }
                        if (var475 == 4004) {
                            var6--;
                            int var286 = class26.field700[var6];
                            class26.field700[var6++] = (int) (Math.random() * (double) var286);
                            continue;
                        }
                        if (var475 == 4005) {
                            var6--;
                            int var287 = class26.field700[var6];
                            class26.field700[var6++] = (int) (Math.random() * (double) (var287 + 1));
                            continue;
                        }
                        if (var475 == 4006) {
                            var6 -= 5;
                            int var288 = class26.field700[var6];
                            int var289 = class26.field700[var6 + 2];
                            int var290 = class26.field700[var6 + 1];
                            int var291 = class26.field700[var6 + 4];
                            int var292 = class26.field700[var6 + 3];
                            class26.field700[var6++] = var288 + ((var290 - var288) * (var291 - var289) / (var292 - var289));
                            continue;
                        }
                        if (var475 == 4007) {
                            var6 -= 2;
                            long var293 = (long) class26.field700[var6];
                            long var295 = (long) class26.field700[var6 + 1];
                            class26.field700[var6++] = (int) (var293 * var295 / 100L + var293);
                            continue;
                        }
                        if (var475 == 4008) {
                            var6 -= 2;
                            int var297 = class26.field700[var6];
                            int var298 = class26.field700[var6 + 1];
                            class26.field700[var6++] = class160.method1052(var297, 0x1 << var298);
                            continue;
                        }
                        if (var475 == 4009) {
                            var6 -= 2;
                            int var299 = class26.field700[var6 + 1];
                            int var300 = class26.field700[var6];
                            class26.field700[var6++] = class263.method1777(-(0x1 << var299) - 1, var300);
                            continue;
                        }
                        if (var475 == 4010) {
                            var6 -= 2;
                            int var301 = class26.field700[var6];
                            int var302 = class26.field700[var6 + 1];
                            class26.field700[var6++] = class263.method1777(0x1 << var302, var301) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var475 == 4011) {
                            var6 -= 2;
                            int var303 = class26.field700[var6 + 1];
                            int var304 = class26.field700[var6];
                            class26.field700[var6++] = var304 % var303;
                            continue;
                        }
                        if (var475 == 4012) {
                            var6 -= 2;
                            int var305 = class26.field700[var6 + 1];
                            int var306 = class26.field700[var6];
                            if (var306 == 0) {
                                class26.field700[var6++] = 0;
                            } else {
                                class26.field700[var6++] = (int) Math.pow((double) var306, (double) var305);
                            }
                            continue;
                        }
                        if (var475 == 4013) {
                            var6 -= 2;
                            int var307 = class26.field700[var6];
                            int var308 = class26.field700[var6 + 1];
                            if (var307 == 0) {
                                class26.field700[var6++] = 0;
                            } else if (var308 == 0) {
                                class26.field700[var6++] = Integer.MAX_VALUE;
                            } else {
                                class26.field700[var6++] = (int) Math.pow((double) var307, 1.0D / (double) var308);
                            }
                            continue;
                        }
                        if (var475 == 4014) {
                            var6 -= 2;
                            int var309 = class26.field700[var6];
                            int var310 = class26.field700[var6 + 1];
                            class26.field700[var6++] = class263.method1777(var310, var309);
                            continue;
                        }
                        if (var475 == 4015) {
                            var6 -= 2;
                            int var311 = class26.field700[var6];
                            int var312 = class26.field700[var6 + 1];
                            class26.field700[var6++] = class160.method1052(var312, var311);
                            continue;
                        }
                        if (var475 == 4016) {
                            var6 -= 2;
                            int var313 = class26.field700[var6];
                            int var314 = class26.field700[var6 + 1];
                            class26.field700[var6++] = var313 < var314 ? var313 : var314;
                            continue;
                        }
                        if (var475 == 4017) {
                            var6 -= 2;
                            int var315 = class26.field700[var6];
                            int var316 = class26.field700[var6 + 1];
                            class26.field700[var6++] = var316 >= var315 ? var316 : var315;
                            continue;
                        }
                        if (var475 == 4018) {
                            var6 -= 3;
                            long var317 = (long) class26.field700[var6];
                            long var319 = (long) class26.field700[var6 + 1];
                            long var321 = (long) class26.field700[var6 + 2];
                            class26.field700[var6++] = (int) (var317 * var321 / var319);
                            continue;
                        }
                    } else if (var475 < 4200) {
                        if (var475 == 4100) {
                            var7--;
                            class263 var59 = field3878[var7];
                            var6--;
                            int var60 = class26.field700[var6];
                            field3878[var7++] = class124.method797(arg2 - 16448, new class263[] { var59, class136.method891(-102, var60) });
                            continue;
                        }
                        if (var475 == 4101) {
                            var7 -= 2;
                            class263 var61 = field3878[var7 + 1];
                            class263 var62 = field3878[var7];
                            field3878[var7++] = class124.method797(arg2 - 16450, new class263[] { var62, var61 });
                            continue;
                        }
                        if (var475 == 4102) {
                            var7--;
                            class263 var63 = field3878[var7];
                            var6--;
                            int var64 = class26.field700[var6];
                            field3878[var7++] = class124.method797(-127, new class263[] { var63, class56.method354(var64, true, -1) });
                            continue;
                        }
                        if (var475 == 4103) {
                            var7--;
                            class263 var65 = field3878[var7];
                            field3878[var7++] = var65.method1768(false);
                            continue;
                        }
                        if (var475 == 4104) {
                            var6--;
                            int var66 = class26.field700[var6];
                            long var67 = ((long) var66 + 11745L) * 86400000L;
                            class240.field4199.setTime(new Date(var67));
                            int var69 = class240.field4199.get(5);
                            int var70 = class240.field4199.get(2);
                            int var71 = class240.field4199.get(1);
                            field3878[var7++] = class124.method797(-46, new class263[] { class136.method891(-56, var69), class198.field3578, class22.field652[var70], class198.field3578, class136.method891(arg2 - 16450, var71) });
                            continue;
                        }
                        if (var475 == 4105) {
                            var7 -= 2;
                            class263 var72 = field3878[var7];
                            class263 var73 = field3878[var7 + 1];
                            if (class229.field4018.field2525 != null && class229.field4018.field2525.field439) {
                                field3878[var7++] = var73;
                                continue;
                            }
                            field3878[var7++] = var72;
                            continue;
                        }
                        if (var475 == 4106) {
                            var6--;
                            int var74 = class26.field700[var6];
                            field3878[var7++] = class136.method891(arg2 - 16509, var74);
                            continue;
                        }
                        if (var475 == 4107) {
                            var7 -= 2;
                            class26.field700[var6++] = field3878[var7].method1749((byte) 65, field3878[var7 + 1]);
                            continue;
                        }
                        if (var475 == 4108) {
                            var6 -= 2;
                            var7--;
                            class263 var75 = field3878[var7];
                            int var76 = class26.field700[var6];
                            int var77 = class26.field700[var6 + 1];
                            byte[] var78 = class54.field1151.method596(119, var77, 0);
                            class192 var79 = new class192(var78);
                            var79.method423(class269.field4738, (int[]) null);
                            class26.field700[var6++] = var79.method406(var75, var76);
                            continue;
                        }
                        if (var475 == 4109) {
                            var7--;
                            class263 var80 = field3878[var7];
                            var6 -= 2;
                            int var81 = class26.field700[var6];
                            int var82 = class26.field700[var6 + 1];
                            byte[] var83 = class54.field1151.method596(arg2 - 16318, var82, 0);
                            class192 var84 = new class192(var83);
                            var84.method423(class269.field4738, (int[]) null);
                            class26.field700[var6++] = var84.method402(var80, var81);
                            continue;
                        }
                        if (var475 == 4110) {
                            var7 -= 2;
                            class263 var85 = field3878[var7 + 1];
                            class263 var86 = field3878[var7];
                            var6--;
                            if (class26.field700[var6] == 1) {
                                field3878[var7++] = var86;
                            } else {
                                field3878[var7++] = var85;
                            }
                            continue;
                        }
                        if (var475 == 4111) {
                            var7--;
                            class263 var87 = field3878[var7];
                            field3878[var7++] = class65.method417(var87);
                            continue;
                        }
                        if (var475 == 4112) {
                            var7--;
                            class263 var88 = field3878[var7];
                            var6--;
                            int var89 = class26.field700[var6];
                            if (var89 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field3878[var7++] = var88.method1746(0, var89);
                            continue;
                        }
                        if (var475 == 4113) {
                            var6--;
                            int var90 = class26.field700[var6];
                            class26.field700[var6++] = class271.method1847((byte) -74, var90) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 4114) {
                            var6--;
                            int var91 = class26.field700[var6];
                            class26.field700[var6++] = class191.method1252(var91, -49) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 4115) {
                            var6--;
                            int var92 = class26.field700[var6];
                            class26.field700[var6++] = class253.method1680(var92, (byte) -5) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 4116) {
                            var6--;
                            int var93 = class26.field700[var6];
                            class26.field700[var6++] = class126.method816(57, var93) ? 1 : 0;
                            continue;
                        }
                        if (var475 == 4117) {
                            var7--;
                            class263 var94 = field3878[var7];
                            if (var94 == null) {
                                class26.field700[var6++] = 0;
                            } else {
                                class26.field700[var6++] = var94.method1740(-123);
                            }
                            continue;
                        }
                        if (var475 == 4118) {
                            var6 -= 2;
                            var7--;
                            class263 var95 = field3878[var7];
                            int var96 = class26.field700[var6];
                            int var97 = class26.field700[var6 + 1];
                            field3878[var7++] = var95.method1763(-127, var97, var96);
                            continue;
                        }
                        if (var475 == 4119) {
                            boolean var98 = false;
                            var7--;
                            class263 var99 = field3878[var7];
                            class263 var100 = class7.method46(var99.method1740(-125), arg2 ^ 0x3FFE);
                            for (int var101 = 0; var99.method1740(arg2 - 16507) > var101; var101++) {
                                int var102 = var99.method1784(var101, 113);
                                if (var102 == 60) {
                                    var98 = true;
                                } else if (var102 == 62) {
                                    var98 = false;
                                } else if (!var98) {
                                    var100.method1757(var102, arg2 ^ 0xFFFFB9F9);
                                }
                            }
                            var100.method1782(79);
                            field3878[var7++] = var100;
                            continue;
                        }
                        if (var475 == 4120) {
                            var6 -= 2;
                            var7--;
                            class263 var103 = field3878[var7];
                            int var104 = class26.field700[var6];
                            int var105 = class26.field700[var6 + 1];
                            class26.field700[var6++] = var103.method1764(-1, var105, var104);
                            continue;
                        }
                        if (var475 == 4121) {
                            var7 -= 2;
                            class263 var106 = field3878[var7 + 1];
                            var6--;
                            int var107 = class26.field700[var6];
                            class263 var108 = field3878[var7];
                            class26.field700[var6++] = var108.method1765(var106, var107, false);
                            continue;
                        }
                        if (var475 == 4122) {
                            var6--;
                            int var109 = class26.field700[var6];
                            class26.field700[var6++] = class77.method529(var109, 0);
                            continue;
                        }
                        if (var475 == 4123) {
                            var6--;
                            int var110 = class26.field700[var6];
                            class26.field700[var6++] = class208.method1430((byte) 80, var110);
                            continue;
                        }
                    } else if (var475 < 4300) {
                        if (var475 == 4200) {
                            var6--;
                            int var259 = class26.field700[var6];
                            field3878[var7++] = class92.method649(-32508, var259).field1467;
                            continue;
                        }
                        if (var475 == 4201) {
                            var6 -= 2;
                            int var260 = class26.field700[var6 + 1];
                            int var261 = class26.field700[var6];
                            class72 var262 = class92.method649(-32508, var261);
                            if (var260 >= 1 && var260 <= 5 && var262.field1442[var260 - 1] != null) {
                                field3878[var7++] = var262.field1442[var260 - 1];
                                continue;
                            }
                            field3878[var7++] = class40.field906;
                            continue;
                        }
                        if (var475 == 4202) {
                            var6 -= 2;
                            int var263 = class26.field700[var6];
                            int var264 = class26.field700[var6 + 1];
                            class72 var265 = class92.method649(-32508, var263);
                            if (var264 >= 1 && var264 <= 5 && var265.field1502[var264 - 1] != null) {
                                field3878[var7++] = var265.field1502[var264 - 1];
                                continue;
                            }
                            field3878[var7++] = class40.field906;
                            continue;
                        }
                        if (var475 == 4203) {
                            var6--;
                            int var266 = class26.field700[var6];
                            class26.field700[var6++] = class92.method649(-32508, var266).field1460;
                            continue;
                        }
                        if (var475 == 4204) {
                            var6--;
                            int var267 = class26.field700[var6];
                            class26.field700[var6++] = class92.method649(-32508, var267).field1487 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 4205) {
                            var6--;
                            int var268 = class26.field700[var6];
                            class72 var269 = class92.method649(-32508, var268);
                            if (var269.field1507 == -1 && var269.field1478 >= 0) {
                                class26.field700[var6++] = var269.field1478;
                                continue;
                            }
                            class26.field700[var6++] = var268;
                            continue;
                        }
                        if (var475 == 4206) {
                            var6--;
                            int var270 = class26.field700[var6];
                            class72 var271 = class92.method649(arg2 - 48891, var270);
                            if (var271.field1507 >= 0 && var271.field1478 >= 0) {
                                class26.field700[var6++] = var271.field1478;
                                continue;
                            }
                            class26.field700[var6++] = var270;
                            continue;
                        }
                        if (var475 == 4207) {
                            var6--;
                            int var272 = class26.field700[var6];
                            class26.field700[var6++] = class92.method649(-32508, var272).field1500 ? 1 : 0;
                            continue;
                        }
                        if (var475 == 4208) {
                            var6 -= 2;
                            int var273 = class26.field700[var6];
                            int var274 = class26.field700[var6 + 1];
                            class174 var275 = class122.method788(var274, false);
                            if (var275.method1145(arg2 ^ 0xFFFF8A09)) {
                                field3878[var7++] = class92.method649(class38.method239(arg2, -16645), var273).method468(var274, 32517, var275.field3169);
                            } else {
                                class26.field700[var6++] = class92.method649(-32508, var273).method470(var274, var275.field3165, 121);
                            }
                            continue;
                        }
                        if (var475 == 4210) {
                            var7--;
                            class263 var276 = field3878[var7];
                            var6--;
                            int var277 = class26.field700[var6];
                            class49.method316(var276, var277 == 1, (byte) 53);
                            class26.field700[var6++] = class114.field2125;
                            continue;
                        }
                        if (var475 == 4211) {
                            if (class245.field4318 != null && class114.field2125 > class183.field3314) {
                                class26.field700[var6++] = class263.method1777(class245.field4318[class183.field3314++], 65535);
                                continue;
                            }
                            class26.field700[var6++] = -1;
                            continue;
                        }
                        if (var475 == 4212) {
                            class183.field3314 = 0;
                            continue;
                        }
                    } else if (var475 < 4400) {
                        if (var475 == 4300) {
                            var6 -= 2;
                            int var111 = class26.field700[var6];
                            int var112 = class26.field700[var6 + 1];
                            class174 var113 = class122.method788(var112, false);
                            if (var113.method1145(arg2 - 35337)) {
                                field3878[var7++] = method1492(var111, 8).method1411(var113.field3169, var112, false);
                            } else {
                                class26.field700[var6++] = method1492(var111, 8).method1416(var113.field3165, false, var112);
                            }
                            continue;
                        }
                        if (var475 == 4301) {
                            var6--;
                            int var114 = class26.field700[var6];
                            class26.field700[var6++] = method1492(var114, class38.method239(arg2, 16375)).field3706;
                            continue;
                        }
                        if (var475 == 4302) {
                            var6--;
                            int var115 = class26.field700[var6];
                            class26.field700[var6++] = method1492(var115, 8).field3700;
                            continue;
                        }
                        if (var475 == 4303) {
                            var6--;
                            int var116 = class26.field700[var6];
                            class26.field700[var6++] = method1492(var116, class38.method239(arg2, 16375)).field3679;
                            continue;
                        }
                        if (var475 == 4304) {
                            var6--;
                            int var117 = class26.field700[var6];
                            class26.field700[var6++] = method1492(var117, 8).field3696;
                            continue;
                        }
                        if (var475 == 4305) {
                            var6--;
                            int var118 = class26.field700[var6];
                            class26.field700[var6++] = method1492(var118, 8).field3661;
                            continue;
                        }
                        if (var475 == 4306) {
                            var6--;
                            int var119 = class26.field700[var6];
                            class26.field700[var6++] = method1492(var119, 8).field3692;
                            continue;
                        }
                        if (var475 == 4307) {
                            var6--;
                            int var120 = class26.field700[var6];
                            class26.field700[var6++] = method1492(var120, 8).field3688;
                            continue;
                        }
                    } else if (var475 < 4500) {
                        if (var475 == 4400) {
                            var6 -= 2;
                            int var121 = class26.field700[var6 + 1];
                            int var122 = class26.field700[var6];
                            class174 var123 = class122.method788(var121, false);
                            if (var123.method1145(-18954)) {
                                field3878[var7++] = class117.method763(var122, (byte) 39).method94((byte) -107, var121, var123.field3169);
                            } else {
                                class26.field700[var6++] = class117.method763(var122, (byte) -115).method96(class38.method239(arg2, 16257), var121, var123.field3165);
                            }
                            continue;
                        }
                    } else if (var475 >= 4600) {
                        if (var475 < 5100) {
                            if (var475 == 5000) {
                                class26.field700[var6++] = class11.field263;
                                continue;
                            }
                            if (var475 == 5001) {
                                class83.field1640++;
                                var6 -= 3;
                                class11.field263 = class26.field700[var6];
                                class82.field1627 = class26.field700[var6 + 1];
                                class85.field1681 = class26.field700[var6 + 2];
                                class154.field2792.method1516(-60, 121);
                                class154.field2792.method1288((byte) -95, class11.field263);
                                class154.field2792.method1288((byte) -103, class82.field1627);
                                class154.field2792.method1288((byte) -126, class85.field1681);
                                continue;
                            }
                            if (var475 == 5002) {
                                var7--;
                                class263 var191 = field3878[var7];
                                var6 -= 2;
                                int var192 = class26.field700[var6 + 1];
                                class37.field852++;
                                int var193 = class26.field700[var6];
                                class154.field2792.method1516(arg2 ^ 0xFFFFC061, 104);
                                class154.field2792.method1272((byte) 43, var191.method1755(1));
                                class154.field2792.method1288((byte) -43, var193 - 1);
                                class154.field2792.method1288((byte) -45, var192);
                                continue;
                            }
                            if (var475 == 5003) {
                                var6--;
                                int var194 = class26.field700[var6];
                                class263 var195 = null;
                                if (var194 < 100) {
                                    var195 = class244.field4310[var194];
                                }
                                if (var195 == null) {
                                    var195 = class40.field906;
                                }
                                field3878[var7++] = var195;
                                continue;
                            }
                            if (var475 == 5004) {
                                int var196 = -1;
                                var6--;
                                int var197 = class26.field700[var6];
                                if (var197 < 100 && class244.field4310[var197] != null) {
                                    var196 = class46.field998[var197];
                                }
                                class26.field700[var6++] = var196;
                                continue;
                            }
                            if (var475 == 5005) {
                                class26.field700[var6++] = class82.field1627;
                                continue;
                            }
                            if (var475 == 5008) {
                                var7--;
                                class263 var198 = field3878[var7];
                                if (var198.method1754((byte) -85, class93.field1826)) {
                                    class117.method765(4, var198);
                                    continue;
                                }
                                if (class4.field82 == 0 && (class156.field2806 && !class85.field1670 || class134.field2451)) {
                                    continue;
                                }
                                class205.field3722++;
                                class263 var199 = var198.method1768(false);
                                byte var200 = 0;
                                if (var199.method1754((byte) -84, class176.field3184)) {
                                    var200 = 0;
                                    var198 = var198.method1787(class176.field3184.method1740(-124), false);
                                } else if (var199.method1754((byte) -74, class189.field3398)) {
                                    var200 = 1;
                                    var198 = var198.method1787(class189.field3398.method1740(arg2 - 16509), false);
                                } else if (var199.method1754((byte) 31, class251.field4377)) {
                                    var200 = 2;
                                    var198 = var198.method1787(class251.field4377.method1740(-127), false);
                                } else if (var199.method1754((byte) -85, class33.field798)) {
                                    var198 = var198.method1787(class33.field798.method1740(-123), false);
                                    var200 = 3;
                                } else if (var199.method1754((byte) 117, class144.field2639)) {
                                    var200 = 4;
                                    var198 = var198.method1787(class144.field2639.method1740(arg2 ^ 0xFFFFC07B), false);
                                } else if (var199.method1754((byte) 74, class31.field778)) {
                                    var198 = var198.method1787(class31.field778.method1740(-123), false);
                                    var200 = 5;
                                } else if (var199.method1754((byte) 47, class122.field2265)) {
                                    var198 = var198.method1787(class122.field2265.method1740(arg2 - 16511), false);
                                    var200 = 6;
                                } else if (var199.method1754((byte) -117, class212.field3786)) {
                                    var198 = var198.method1787(class212.field3786.method1740(arg2 - 16509), false);
                                    var200 = 7;
                                } else if (var199.method1754((byte) 60, class120.field2228)) {
                                    var198 = var198.method1787(class120.field2228.method1740(-123), false);
                                    var200 = 8;
                                } else if (var199.method1754((byte) -81, class191.field3431)) {
                                    var200 = 9;
                                    var198 = var198.method1787(class191.field3431.method1740(-128), false);
                                } else if (var199.method1754((byte) 48, class50.field1066)) {
                                    var198 = var198.method1787(class50.field1066.method1740(arg2 ^ 0xFFFFC07E), false);
                                    var200 = 10;
                                } else if (var199.method1754((byte) -125, class22.field644)) {
                                    var200 = 11;
                                    var198 = var198.method1787(class22.field644.method1740(-123), false);
                                } else if (class17.field388 != 0) {
                                    if (var199.method1754((byte) -105, class176.field3179)) {
                                        var200 = 0;
                                        var198 = var198.method1787(class176.field3179.method1740(-124), false);
                                    } else if (var199.method1754((byte) -127, class189.field3400)) {
                                        var198 = var198.method1787(class189.field3400.method1740(-124), false);
                                        var200 = 1;
                                    } else if (var199.method1754((byte) -78, class251.field4362)) {
                                        var200 = 2;
                                        var198 = var198.method1787(class251.field4362.method1740(-126), false);
                                    } else if (var199.method1754((byte) -105, class33.field802)) {
                                        var200 = 3;
                                        var198 = var198.method1787(class33.field802.method1740(-125), false);
                                    } else if (var199.method1754((byte) -64, class144.field2642)) {
                                        var200 = 4;
                                        var198 = var198.method1787(class144.field2642.method1740(-125), false);
                                    } else if (var199.method1754((byte) -96, class31.field771)) {
                                        var200 = 5;
                                        var198 = var198.method1787(class31.field771.method1740(arg2 ^ 0xFFFFC07B), false);
                                    } else if (var199.method1754((byte) -124, class122.field2267)) {
                                        var198 = var198.method1787(class122.field2267.method1740(-123), false);
                                        var200 = 6;
                                    } else if (var199.method1754((byte) -104, class212.field3794)) {
                                        var198 = var198.method1787(class212.field3794.method1740(-126), false);
                                        var200 = 7;
                                    } else if (var199.method1754((byte) 31, class120.field2231)) {
                                        var200 = 8;
                                        var198 = var198.method1787(class120.field2231.method1740(arg2 - 16506), false);
                                    } else if (var199.method1754((byte) -84, class191.field3437)) {
                                        var200 = 9;
                                        var198 = var198.method1787(class191.field3437.method1740(-124), false);
                                    } else if (var199.method1754((byte) -82, class50.field1082)) {
                                        var200 = 10;
                                        var198 = var198.method1787(class50.field1082.method1740(-125), false);
                                    } else if (var199.method1754((byte) -64, class22.field639)) {
                                        var200 = 11;
                                        var198 = var198.method1787(class22.field639.method1740(-125), false);
                                    }
                                }
                                class263 var201 = var198.method1768(false);
                                byte var202 = 0;
                                if (var201.method1754((byte) 72, class3.field65)) {
                                    var202 = 1;
                                    var198 = var198.method1787(class3.field65.method1740(-128), false);
                                } else if (var201.method1754((byte) -128, class98.field1888)) {
                                    var202 = 2;
                                    var198 = var198.method1787(class98.field1888.method1740(-128), false);
                                } else if (var201.method1754((byte) 49, class214.field3808)) {
                                    var198 = var198.method1787(class214.field3808.method1740(-128), false);
                                    var202 = 3;
                                } else if (var201.method1754((byte) 123, class245.field4317)) {
                                    var198 = var198.method1787(class245.field4317.method1740(-126), false);
                                    var202 = 4;
                                } else if (var201.method1754((byte) 91, class116.field2171)) {
                                    var198 = var198.method1787(class116.field2171.method1740(-125), false);
                                    var202 = 5;
                                } else if (class17.field388 != 0) {
                                    if (var201.method1754((byte) 115, class3.field66)) {
                                        var198 = var198.method1787(class3.field66.method1740(-125), false);
                                        var202 = 1;
                                    } else if (var201.method1754((byte) -75, class98.field1884)) {
                                        var202 = 2;
                                        var198 = var198.method1787(class98.field1884.method1740(-124), false);
                                    } else if (var201.method1754((byte) -83, class214.field3803)) {
                                        var198 = var198.method1787(class214.field3803.method1740(arg2 - 16508), false);
                                        var202 = 3;
                                    } else if (var201.method1754((byte) 53, class245.field4320)) {
                                        var198 = var198.method1787(class245.field4320.method1740(-128), false);
                                        var202 = 4;
                                    } else if (var201.method1754((byte) -77, class116.field2178)) {
                                        var202 = 5;
                                        var198 = var198.method1787(class116.field2178.method1740(arg2 ^ 0xFFFFC07E), false);
                                    }
                                }
                                class154.field2792.method1516(123, 151);
                                class154.field2792.method1288((byte) -112, 0);
                                int var203 = class154.field2792.field3497;
                                class154.field2792.method1288((byte) -128, var200);
                                class154.field2792.method1288((byte) -21, var202);
                                class218.method1486(class154.field2792, true, var198);
                                class154.field2792.method1285((byte) -120, class154.field2792.field3497 - var203);
                                continue;
                            }
                            if (var475 == 5009) {
                                var7 -= 2;
                                class263 var204 = field3878[var7];
                                class263 var205 = field3878[var7 + 1];
                                if (class4.field82 != 0 || (!class156.field2806 || class85.field1670) && !class134.field2451) {
                                    class154.field2792.method1516(-105, 91);
                                    class154.field2792.method1288((byte) -4, 0);
                                    class91.field1792++;
                                    int var206 = class154.field2792.field3497;
                                    class154.field2792.method1272((byte) 11, var204.method1755(arg2 - 16382));
                                    class218.method1486(class154.field2792, true, var205);
                                    class154.field2792.method1285((byte) -125, class154.field2792.field3497 - var206);
                                }
                                continue;
                            }
                            if (var475 == 5010) {
                                var6--;
                                int var207 = class26.field700[var6];
                                class263 var208 = null;
                                if (var207 < 100) {
                                    var208 = class106.field2002[var207];
                                }
                                if (var208 == null) {
                                    var208 = class40.field906;
                                }
                                field3878[var7++] = var208;
                                continue;
                            }
                            if (var475 == 5011) {
                                var6--;
                                int var209 = class26.field700[var6];
                                class263 var210 = null;
                                if (var209 < 100) {
                                    var210 = class194.field3452[var209];
                                }
                                if (var210 == null) {
                                    var210 = class40.field906;
                                }
                                field3878[var7++] = var210;
                                continue;
                            }
                            if (var475 == 5012) {
                                var6--;
                                int var211 = class26.field700[var6];
                                int var212 = -1;
                                if (var211 < 100) {
                                    var212 = class18.field420[var211];
                                }
                                class26.field700[var6++] = var212;
                                continue;
                            }
                            if (var475 == 5015) {
                                class263 var213;
                                if (class229.field4018 == null || class229.field4018.field2508 == null) {
                                    var213 = class20.field461;
                                } else {
                                    var213 = class229.field4018.method896((byte) -80);
                                }
                                field3878[var7++] = var213;
                                continue;
                            }
                            if (var475 == 5016) {
                                class26.field700[var6++] = class85.field1681;
                                continue;
                            }
                            if (var475 == 5017) {
                                class26.field700[var6++] = class258.field4478;
                                continue;
                            }
                            if (var475 == 5050) {
                                var6--;
                                int var214 = class26.field700[var6];
                                field3878[var7++] = class14.method109((byte) -121, var214).field3762;
                                continue;
                            }
                            if (var475 == 5051) {
                                var6--;
                                int var215 = class26.field700[var6];
                                class208 var216 = class14.method109((byte) -108, var215);
                                if (var216.field3756 == null) {
                                    class26.field700[var6++] = 0;
                                } else {
                                    class26.field700[var6++] = var216.field3756.length;
                                }
                                continue;
                            }
                            if (var475 == 5052) {
                                var6 -= 2;
                                int var217 = class26.field700[var6];
                                int var218 = class26.field700[var6 + 1];
                                class208 var219 = class14.method109((byte) -113, var217);
                                int var220 = var219.field3756[var218];
                                class26.field700[var6++] = var220;
                                continue;
                            }
                            if (var475 == 5053) {
                                var6--;
                                int var221 = class26.field700[var6];
                                class208 var222 = class14.method109((byte) -119, var221);
                                if (var222.field3771 == null) {
                                    class26.field700[var6++] = 0;
                                } else {
                                    class26.field700[var6++] = var222.field3771.length;
                                }
                                continue;
                            }
                            if (var475 == 5054) {
                                var6 -= 2;
                                int var223 = class26.field700[var6];
                                int var224 = class26.field700[var6 + 1];
                                class26.field700[var6++] = class14.method109((byte) -19, var223).field3771[var224];
                                continue;
                            }
                            if (var475 == 5055) {
                                var6--;
                                int var225 = class26.field700[var6];
                                field3878[var7++] = class173.method1139((byte) -90, var225).method638((byte) -46);
                                continue;
                            }
                            if (var475 == 5056) {
                                var6--;
                                int var226 = class26.field700[var6];
                                class91 var227 = class173.method1139((byte) -90, var226);
                                if (var227.field1808 == null) {
                                    class26.field700[var6++] = 0;
                                } else {
                                    class26.field700[var6++] = var227.field1808.length;
                                }
                                continue;
                            }
                            if (var475 == 5057) {
                                var6 -= 2;
                                int var228 = class26.field700[var6];
                                int var229 = class26.field700[var6 + 1];
                                class26.field700[var6++] = class173.method1139((byte) -90, var228).field1808[var229];
                                continue;
                            }
                            if (var475 == 5058) {
                                class124.field2276 = new class160();
                                var6--;
                                class124.field2276.field2919 = class26.field700[var6];
                                class124.field2276.field2924 = class173.method1139((byte) -90, class124.field2276.field2919);
                                class124.field2276.field2923 = new int[class124.field2276.field2924.method640(arg2 ^ 0xFFFFC17C)];
                                continue;
                            }
                            if (var475 == 5059) {
                                class154.field2792.method1516(81, 88);
                                class154.field2792.method1288((byte) -67, 0);
                                int var230 = class154.field2792.field3497;
                                class154.field2792.method1288((byte) -46, 0);
                                class63.field1268++;
                                class154.field2792.method1276(class124.field2276.field2919, -123);
                                class124.field2276.field2924.method636(class154.field2792, arg2 ^ 0xFFFFC000, class124.field2276.field2923);
                                class154.field2792.method1285((byte) -114, class154.field2792.field3497 - var230);
                                continue;
                            }
                            if (var475 == 5060) {
                                var7--;
                                class263 var231 = field3878[var7];
                                class161.field2940++;
                                class154.field2792.method1516(arg2 - 16435, 202);
                                class154.field2792.method1288((byte) -97, 0);
                                int var232 = class154.field2792.field3497;
                                class154.field2792.method1272((byte) 44, var231.method1755(arg2 - 16382));
                                class154.field2792.method1276(class124.field2276.field2919, -105);
                                class124.field2276.field2924.method636(class154.field2792, arg2 ^ 0xFFFFC000, class124.field2276.field2923);
                                class154.field2792.method1285((byte) -123, class154.field2792.field3497 - var232);
                                continue;
                            }
                            if (var475 == 5061) {
                                class63.field1268++;
                                class154.field2792.method1516(-55, 88);
                                class154.field2792.method1288((byte) -24, 0);
                                int var233 = class154.field2792.field3497;
                                class154.field2792.method1288((byte) -23, 1);
                                class154.field2792.method1276(class124.field2276.field2919, arg2 - 16470);
                                class124.field2276.field2924.method636(class154.field2792, -1, class124.field2276.field2923);
                                class154.field2792.method1285((byte) -113, class154.field2792.field3497 - var233);
                                continue;
                            }
                            if (var475 == 5062) {
                                var6 -= 2;
                                int var234 = class26.field700[var6];
                                int var235 = class26.field700[var6 + 1];
                                class26.field700[var6++] = class14.method109((byte) -107, var234).field3767[var235];
                                continue;
                            }
                            if (var475 == 5063) {
                                var6 -= 2;
                                int var236 = class26.field700[var6];
                                int var237 = class26.field700[var6 + 1];
                                class26.field700[var6++] = class14.method109((byte) 117, var236).field3768[var237];
                                continue;
                            }
                            if (var475 == 5064) {
                                var6 -= 2;
                                int var238 = class26.field700[var6 + 1];
                                int var239 = class26.field700[var6];
                                if (var238 == -1) {
                                    class26.field700[var6++] = -1;
                                } else {
                                    class26.field700[var6++] = class14.method109((byte) 123, var239).method1436(var238, (byte) 120);
                                }
                                continue;
                            }
                            if (var475 == 5065) {
                                var6 -= 2;
                                int var240 = class26.field700[var6];
                                int var241 = class26.field700[var6 + 1];
                                if (var241 == -1) {
                                    class26.field700[var6++] = -1;
                                } else {
                                    class26.field700[var6++] = class14.method109((byte) -113, var240).method1434(var241, (byte) 119);
                                }
                                continue;
                            }
                            if (var475 == 5066) {
                                var6--;
                                int var242 = class26.field700[var6];
                                class26.field700[var6++] = class173.method1139((byte) -90, var242).method640(class38.method239(arg2, -16004));
                                continue;
                            }
                            if (var475 == 5067) {
                                var6 -= 2;
                                int var243 = class26.field700[var6 + 1];
                                int var244 = class26.field700[var6];
                                int var245 = class173.method1139((byte) -90, var244).method642(var243, -1);
                                class26.field700[var6++] = var245;
                                continue;
                            }
                            if (var475 == 5068) {
                                var6 -= 2;
                                int var246 = class26.field700[var6 + 1];
                                int var247 = class26.field700[var6];
                                class124.field2276.field2923[var247] = var246;
                                continue;
                            }
                            if (var475 == 5069) {
                                var6 -= 2;
                                int var248 = class26.field700[var6];
                                int var249 = class26.field700[var6 + 1];
                                class124.field2276.field2923[var248] = var249;
                                continue;
                            }
                            if (var475 == 5070) {
                                var6 -= 3;
                                int var250 = class26.field700[var6];
                                int var251 = class26.field700[var6 + 1];
                                int var252 = class26.field700[var6 + 2];
                                class91 var253 = class173.method1139((byte) -90, var250);
                                if (var253.method642(var251, -1) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class26.field700[var6++] = var253.method637((byte) -14, var252, var251);
                                continue;
                            }
                            if (var475 == 5071) {
                                var6--;
                                boolean var254 = class26.field700[var6] == 1;
                                var7--;
                                class263 var255 = field3878[var7];
                                class169.method1119(var254, var255, true);
                                class26.field700[var6++] = class114.field2125;
                                continue;
                            }
                            if (var475 == 5072) {
                                if (class245.field4318 != null && class183.field3314 < class114.field2125) {
                                    class26.field700[var6++] = class263.method1777(class245.field4318[class183.field3314++], 65535);
                                    continue;
                                }
                                class26.field700[var6++] = -1;
                                continue;
                            }
                            if (var475 == 5073) {
                                class183.field3314 = 0;
                                continue;
                            }
                        } else if (var475 < 5200) {
                            if (var475 == 5100) {
                                if (class248.field4342[86]) {
                                    class26.field700[var6++] = 1;
                                } else {
                                    class26.field700[var6++] = 0;
                                }
                                continue;
                            }
                            if (var475 == 5101) {
                                if (class248.field4342[82]) {
                                    class26.field700[var6++] = 1;
                                } else {
                                    class26.field700[var6++] = 0;
                                }
                                continue;
                            }
                            if (var475 == 5102) {
                                if (class248.field4342[81]) {
                                    class26.field700[var6++] = 1;
                                } else {
                                    class26.field700[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var475 < 5300) {
                            if (var475 == 5200) {
                                var6--;
                                class16.method119(705, class26.field700[var6]);
                                continue;
                            }
                            if (var475 == 5201) {
                                class26.field700[var6++] = class263.method1775((byte) -46);
                                continue;
                            }
                            if (var475 == 5202) {
                                var6--;
                                class127.method827(class26.field700[var6], (byte) -121);
                                continue;
                            }
                            if (var475 == 5203) {
                                var7--;
                                class120.method780((byte) 56, field3878[var7]);
                                continue;
                            }
                            if (var475 == 5204) {
                                field3878[var7 - 1] = class85.method569(field3878[var7 - 1], (byte) -86);
                                continue;
                            }
                            if (var475 == 5205) {
                                var7--;
                                class267.method1810((byte) -123, field3878[var7]);
                                continue;
                            }
                            if (var475 == 5206) {
                                var6--;
                                int var124 = class26.field700[var6];
                                class184 var125 = class162.method1064(var124 >> 14 & 0x3FFF, arg2 - 16382, var124 & 0x3FFF);
                                if (var125 == null) {
                                    field3878[var7++] = class40.field906;
                                } else {
                                    field3878[var7++] = var125.field3321;
                                }
                                continue;
                            }
                            if (var475 == 5207) {
                                var7--;
                                class184 var126 = class31.method205((byte) -3, field3878[var7]);
                                if (var126 != null && var126.field3339 != null) {
                                    field3878[var7++] = var126.field3339;
                                    continue;
                                }
                                field3878[var7++] = class40.field906;
                                continue;
                            }
                        } else if (var475 < 5400) {
                            if (var475 == 5300) {
                                var6 -= 2;
                                class26.field700[var6++] = 0;
                                continue;
                            }
                            if (var475 == 5301) {
                                continue;
                            }
                            if (var475 == 5302) {
                                class26.field700[var6++] = 0;
                                continue;
                            }
                            if (var475 == 5303) {
                                var6--;
                                class26.field700[var6++] = 0;
                                class26.field700[var6++] = 0;
                                continue;
                            }
                            if (var475 == 5305) {
                                byte var188 = -1;
                                class26.field700[var6++] = var188;
                                continue;
                            }
                            if (var475 == 5306) {
                                class26.field700[var6++] = class220.method1506((byte) -88);
                                continue;
                            }
                            if (var475 == 5307) {
                                var6--;
                                int var189 = class26.field700[var6];
                                if (var189 < 0 || var189 > 2) {
                                    var189 = 0;
                                }
                                class109.method725(-1, (byte) -114, -1, false, var189);
                                continue;
                            }
                            if (var475 == 5308) {
                                class26.field700[var6++] = class107.field2027;
                                continue;
                            }
                            if (var475 == 5309) {
                                var6--;
                                int var190 = class26.field700[var6];
                                if (var190 < 0 || var190 > 2) {
                                    var190 = 0;
                                }
                                class107.field2027 = var190;
                                class214.method1454(class95.field1867, (byte) -116);
                                continue;
                            }
                        } else if (var475 < 5500) {
                            if (var475 == 5400) {
                                class208.field3760++;
                                var7 -= 2;
                                class263 var167 = field3878[var7];
                                class263 var168 = field3878[var7 + 1];
                                var6--;
                                int var169 = class26.field700[var6];
                                class154.field2792.method1516(arg2 ^ 0x3FC4, 9);
                                class154.field2792.method1288((byte) -37, class169.method1118(-1, var167) + class169.method1118(-1, var168) + 1);
                                class154.field2792.method1312(-51, var167);
                                class154.field2792.method1312(arg2 - 16455, var168);
                                class154.field2792.method1288((byte) -110, var169);
                                continue;
                            }
                            if (var475 == 5401) {
                                var6 -= 2;
                                class41.field912[class26.field700[var6]] = (short) class35.method222(class26.field700[var6 + 1], true);
                                class66.method431(2088);
                                class96.method666(0);
                                class186.method1228((byte) 97);
                                class164.method1081(true);
                                class259.method1708((byte) -41);
                                continue;
                            }
                            if (var475 == 5405) {
                                var6 -= 2;
                                int var170 = class26.field700[var6];
                                int var171 = class26.field700[var6 + 1];
                                if (var170 >= 0 && var170 < 2) {
                                    class275.field4823[var170] = new int[var171 << 1][4];
                                }
                                continue;
                            }
                            if (var475 == 5406) {
                                var6 -= 7;
                                int var172 = class26.field700[var6 + 1] << 1;
                                int var173 = class26.field700[var6];
                                int var174 = class26.field700[var6 + 2];
                                int var175 = class26.field700[var6 + 4];
                                int var176 = class26.field700[var6 + 3];
                                int var177 = class26.field700[var6 + 5];
                                int var178 = class26.field700[var6 + 6];
                                if (var173 >= 0 && var173 < 2 && class275.field4823[var173] != null && var172 >= 0 && class275.field4823[var173].length > var172) {
                                    class275.field4823[var173][var172] = new int[] { class263.method1777(var174 >> 14, 16383) * 128, var176, class263.method1777(16383, var174) * 128, var178 };
                                    class275.field4823[var173][var172 + 1] = new int[] { (class263.method1777(var175, 268434832) >> 14) * 128, var177, class263.method1777(16383, var175) * 128 };
                                }
                                continue;
                            }
                            if (var475 == 5407) {
                                var6--;
                                int var179 = class275.field4823[class26.field700[var6]].length >> 1;
                                class26.field700[var6++] = var179;
                                continue;
                            }
                            if (var475 == 5411) {
                                if (class130.field2381 == null) {
                                    class125.method802(class151.method992(-22), arg2 - 16445, false);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var475 == 5419) {
                                class263 var180 = class40.field906;
                                if (class142.field2607 != null) {
                                    var180 = class26.method184(123, class142.field2607.field4118);
                                    try {
                                        if (class142.field2607.field4117 != null) {
                                            byte[] var181 = ((String) class142.field2607.field4117).getBytes("ISO-8859-1");
                                            var180 = class138.method903(-2378, var181.length, var181, 0);
                                        }
                                    } catch (UnsupportedEncodingException var473) {
                                    }
                                }
                                field3878[var7++] = var180;
                                continue;
                            }
                            if (var475 == 5420) {
                                class26.field700[var6++] = class262.field4547 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var475 == 5421) {
                                var6--;
                                boolean var182 = class26.field700[var6] == 1;
                                var7--;
                                class263 var183 = field3878[var7];
                                class263 var184 = class124.method797(-110, new class263[] { class151.method992(-122), var183 });
                                if (class130.field2381 == null && (!var182 || class262.field4547 == 3 || !class262.field4551.startsWith("win") || class72.field1513)) {
                                    class125.method802(var184, -73, var182);
                                    continue;
                                }
                                class148.field2696 = var184;
                                class29.field730 = var182;
                                class68.field1380 = class95.field1867.method1725(new String(var184.method1753(-1), "ISO-8859-1"), true);
                                continue;
                            }
                            if (var475 == 5422) {
                                var7 -= 2;
                                class263 var185 = field3878[var7 + 1];
                                class263 var186 = field3878[var7];
                                var6--;
                                int var187 = class26.field700[var6];
                                if (var186.method1740(arg2 - 16506) > 0) {
                                    if (class17.field398 == null) {
                                        class17.field398 = new class263[class3.field55[class136.field2475]];
                                    }
                                    class17.field398[var187] = var186;
                                }
                                if (var185.method1740(arg2 ^ 0xFFFFC07D) > 0) {
                                    if (class202.field3649 == null) {
                                        class202.field3649 = new class263[class3.field55[class136.field2475]];
                                    }
                                    class202.field3649[var187] = var185;
                                }
                                continue;
                            }
                            if (var475 == 5423) {
                                var7--;
                                field3878[var7].method1780((byte) -127);
                                continue;
                            }
                        } else if (var475 < 5600) {
                            if (var475 == 5500) {
                                var6 -= 4;
                                int var155 = class26.field700[var6];
                                int var156 = class26.field700[var6 + 1];
                                int var157 = class26.field700[var6 + 2];
                                int var158 = class26.field700[var6 + 3];
                                class105.method708(var158, false, var156, var157, (byte) 106, (var155 & 0x3FFF) - class142.field2596, (var155 >> 14 & 0x3FFF) - class93.field1844);
                                continue;
                            }
                            if (var475 == 5501) {
                                var6 -= 4;
                                int var159 = class26.field700[var6];
                                int var160 = class26.field700[var6 + 2];
                                int var161 = class26.field700[var6 + 1];
                                int var162 = class26.field700[var6 + 3];
                                class101.method683(128, var161, var160, var162, (var159 >> 14 & 0x3FFF) - class93.field1844, (var159 & 0x3FFF) + -class142.field2596);
                                continue;
                            }
                            if (var475 == 5502) {
                                var6 -= 6;
                                int var163 = class26.field700[var6];
                                if (var163 >= 2) {
                                    throw new RuntimeException();
                                }
                                class98.field1894 = var163;
                                int var164 = class26.field700[var6 + 1];
                                if (var164 + 1 >= class275.field4823[class98.field1894].length >> 1) {
                                    throw new RuntimeException();
                                }
                                class57.field1171 = var164;
                                class261.field4530 = 0;
                                class176.field3182 = class26.field700[var6 + 2];
                                class66.field1357 = class26.field700[var6 + 3];
                                int var165 = class26.field700[var6 + 4];
                                if (var165 >= 2) {
                                    throw new RuntimeException();
                                }
                                class20.field466 = var165;
                                int var166 = class26.field700[var6 + 5];
                                if (var166 + 1 >= class275.field4823[class20.field466].length >> 1) {
                                    throw new RuntimeException();
                                }
                                class181.field3284 = var166;
                                class89.field1772 = 3;
                                continue;
                            }
                            if (var475 == 5503) {
                                class173.method1142(arg2 ^ 0xFFFFC000);
                                continue;
                            }
                            if (var475 == 5504) {
                                var6 -= 2;
                                class256.field4464 = class26.field700[var6];
                                class241.field4230 = class26.field700[var6 + 1];
                                class9.method69((byte) -63);
                                continue;
                            }
                            if (var475 == 5505) {
                                class26.field700[var6++] = class256.field4464;
                                continue;
                            }
                            if (var475 == 5506) {
                                class26.field700[var6++] = class241.field4230;
                                continue;
                            }
                        } else if (var475 < 5700) {
                            if (var475 == 5600) {
                                var7 -= 2;
                                var6--;
                                int var151 = class26.field700[var6];
                                class263 var152 = field3878[var7];
                                class263 var153 = field3878[var7 + 1];
                                if (class271.field4786 == 10 && class11.field254 == 0 && class180.field3280 == 0 && class162.field2949 == 0 && class184.field3335 == 0) {
                                    class159.method1035(var152, (byte) -71, var151, var153);
                                }
                                continue;
                            }
                            if (var475 == 5601) {
                                class191.method1253((byte) 107);
                                continue;
                            }
                            if (var475 == 5602) {
                                if (class180.field3280 == 0) {
                                    class96.field1873 = -2;
                                }
                                continue;
                            }
                            if (var475 == 5603) {
                                var6 -= 4;
                                if (class271.field4786 == 10 && class11.field254 == 0 && class180.field3280 == 0 && class162.field2949 == 0 && class184.field3335 == 0) {
                                    class154.method1013(class26.field700[var6 + 2], class26.field700[var6 + 1], class26.field700[var6 + 3], class26.field700[var6], true);
                                }
                                continue;
                            }
                            if (var475 == 5604) {
                                var7--;
                                if (class271.field4786 == 10 && class11.field254 == 0 && class180.field3280 == 0 && class162.field2949 == 0 && class184.field3335 == 0) {
                                    class41.method259(false, field3878[var7].method1755(arg2 - 16382));
                                }
                                continue;
                            }
                            if (var475 == 5605) {
                                var7 -= 2;
                                var6 -= 4;
                                if (class271.field4786 == 10 && class11.field254 == 0 && class180.field3280 == 0 && class162.field2949 == 0 && class184.field3335 == 0) {
                                    class138.method901(class26.field700[var6 + 2], (byte) 93, class26.field700[var6 + 3], field3878[var7 + 1], class26.field700[var6 + 1], class26.field700[var6], field3878[var7].method1755(1));
                                }
                                continue;
                            }
                            if (var475 == 5606) {
                                if (class162.field2949 == 0) {
                                    class236.field4120 = -2;
                                }
                                continue;
                            }
                            if (var475 == 5607) {
                                class26.field700[var6++] = class96.field1873;
                                continue;
                            }
                            if (var475 == 5608) {
                                class26.field700[var6++] = class252.field4381;
                                continue;
                            }
                            if (var475 == 5609) {
                                class26.field700[var6++] = class236.field4120;
                                continue;
                            }
                            if (var475 == 5610) {
                                for (int var154 = 0; var154 < 5; var154++) {
                                    field3878[var7++] = var154 < class78.field1598.length ? class78.field1598[var154].method1761(122) : class40.field906;
                                }
                                class78.field1598 = null;
                                continue;
                            }
                            if (var475 == 5611) {
                                class26.field700[var6++] = class63.field1267;
                                continue;
                            }
                        } else if (var475 < 6100) {
                            if (var475 == 6001) {
                                var6--;
                                int var144 = class26.field700[var6];
                                if (var144 < 1) {
                                    var144 = 1;
                                }
                                if (var144 > 4) {
                                    var144 = 4;
                                }
                                class183.field3310 = var144;
                                if (class183.field3310 == 1) {
                                    class270.method1843(0.9F);
                                }
                                if (class183.field3310 == 2) {
                                    class270.method1843(0.8F);
                                }
                                if (class183.field3310 == 3) {
                                    class270.method1843(0.7F);
                                }
                                if (class183.field3310 == 4) {
                                    class270.method1843(0.6F);
                                }
                                class96.method666(0);
                                class214.method1454(class95.field1867, (byte) -124);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6002) {
                                var6--;
                                class159.method1043((byte) 122, class26.field700[var6] == 1);
                                class157.method1025((byte) 118);
                                class275.method1873(false);
                                class188.method1233(true);
                                class214.method1454(class95.field1867, (byte) -119);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6003) {
                                var6--;
                                class7.field135 = class26.field700[var6] == 1;
                                class188.method1233(true);
                                class214.method1454(class95.field1867, (byte) -126);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6005) {
                                var6--;
                                class146.field2670 = class26.field700[var6] == 1;
                                class275.method1873(false);
                                class214.method1454(class95.field1867, (byte) -128);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6006) {
                                var6--;
                                class101.field1930 = class26.field700[var6] == 1;
                                ((class8) class270.field4764).method49(!class101.field1930, 24722);
                                class214.method1454(class95.field1867, (byte) -127);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6007) {
                                var6--;
                                class159.field2896 = class26.field700[var6] == 1;
                                class214.method1454(class95.field1867, (byte) -123);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6008) {
                                var6--;
                                class1.field9 = class26.field700[var6] == 1;
                                class214.method1454(class95.field1867, (byte) -128);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6009) {
                                var6--;
                                class107.field2028 = class26.field700[var6] == 1;
                                class214.method1454(class95.field1867, (byte) -117);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6010) {
                                var6--;
                                class125.field2322 = class26.field700[var6] == 1;
                                class214.method1454(class95.field1867, (byte) -122);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6011) {
                                var6--;
                                int var145 = class26.field700[var6];
                                if (var145 < 0 || var145 > 2) {
                                    var145 = 0;
                                }
                                class277.field4853 = var145;
                                class214.method1454(class95.field1867, (byte) -116);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6012) {
                                var6--;
                                class126.field2331 = class26.field700[var6] == 1;
                                if (class183.field3310 == 1) {
                                    class270.method1843(0.9F);
                                }
                                if (class183.field3310 == 2) {
                                    class270.method1843(0.8F);
                                }
                                if (class183.field3310 == 3) {
                                    class270.method1843(0.7F);
                                }
                                if (class183.field3310 == 4) {
                                    class270.method1843(0.6F);
                                }
                                class275.method1873(false);
                                class214.method1454(class95.field1867, (byte) -128);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6014) {
                                var6--;
                                class17.field394 = class26.field700[var6] == 1;
                                class214.method1454(class95.field1867, (byte) -127);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6015) {
                                var6--;
                                class187.field3372 = class26.field700[var6] == 1;
                                class214.method1454(class95.field1867, (byte) -126);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6016) {
                                var6--;
                                int var146 = class26.field700[var6];
                                if (var146 < 0 || var146 > 2) {
                                    var146 = 0;
                                }
                                class60.field1239 = var146;
                                continue;
                            }
                            if (var475 == 6017) {
                                var6--;
                                class253.field4397 = class26.field700[var6] == 1;
                                class239.method1599(-1);
                                class214.method1454(class95.field1867, (byte) -127);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6018) {
                                var6--;
                                int var147 = class26.field700[var6];
                                if (var147 < 0) {
                                    var147 = 0;
                                }
                                if (var147 > 127) {
                                    var147 = 127;
                                }
                                class265.field4632 = var147;
                                class214.method1454(class95.field1867, (byte) -116);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6019) {
                                var6--;
                                int var148 = class26.field700[var6];
                                if (var148 < 0) {
                                    var148 = 0;
                                }
                                if (var148 > 255) {
                                    var148 = 255;
                                }
                                if (class95.field1866 != var148) {
                                    if (class95.field1866 == 0 && class186.field3358 != -1) {
                                        class237.method1586(false, class186.field3358, class142.field2609, var148, 0, -84);
                                        class143.field2612 = false;
                                    } else if (var148 == 0) {
                                        class93.method655(false);
                                        class143.field2612 = false;
                                    } else {
                                        class265.method1796(var148, arg2 ^ 0x3F80);
                                    }
                                    class95.field1866 = var148;
                                }
                                class214.method1454(class95.field1867, (byte) -122);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6020) {
                                var6--;
                                int var149 = class26.field700[var6];
                                if (var149 < 0) {
                                    var149 = 0;
                                }
                                if (var149 > 127) {
                                    var149 = 127;
                                }
                                class214.field3798 = var149;
                                class214.method1454(class95.field1867, (byte) -120);
                                class120.field2234 = false;
                                continue;
                            }
                            if (var475 == 6021) {
                                var6--;
                                class101.field1936 = class26.field700[var6] == 1;
                                class188.method1233(true);
                                continue;
                            }
                            if (var475 == 6024) {
                                var6--;
                                int var150 = class26.field700[var6];
                                if (var150 < 0 || var150 > 2) {
                                    var150 = 0;
                                }
                                class126.field2335 = var150;
                                class214.method1454(class95.field1867, (byte) -120);
                                continue;
                            }
                        } else if (var475 < 6200) {
                            if (var475 == 6101) {
                                class26.field700[var6++] = class183.field3310;
                                continue;
                            }
                            if (var475 == 6102) {
                                class26.field700[var6++] = class77.method526(-26670) ? 1 : 0;
                                continue;
                            }
                            if (var475 == 6103) {
                                class26.field700[var6++] = class7.field135 ? 1 : 0;
                                continue;
                            }
                            if (var475 == 6105) {
                                class26.field700[var6++] = class146.field2670 ? 1 : 0;
                                continue;
                            }
                            if (var475 == 6106) {
                                class26.field700[var6++] = class101.field1930 ? 1 : 0;
                                continue;
                            }
                            if (var475 == 6107) {
                                class26.field700[var6++] = class159.field2896 ? 1 : 0;
                                continue;
                            }
                            if (var475 == 6108) {
                                class26.field700[var6++] = class1.field9 ? 1 : 0;
                                continue;
                            }
                            if (var475 == 6109) {
                                class26.field700[var6++] = class107.field2028 ? 1 : 0;
                                continue;
                            }
                            if (var475 == 6110) {
                                class26.field700[var6++] = class125.field2322 ? 1 : 0;
                                continue;
                            }
                            if (var475 == 6111) {
                                class26.field700[var6++] = class277.field4853;
                                continue;
                            }
                            if (var475 == 6112) {
                                class26.field700[var6++] = class126.field2331 ? 1 : 0;
                                continue;
                            }
                            if (var475 == 6114) {
                                class26.field700[var6++] = class17.field394 ? 1 : 0;
                                continue;
                            }
                            if (var475 == 6115) {
                                class26.field700[var6++] = class187.field3372 ? 1 : 0;
                                continue;
                            }
                            if (var475 == 6116) {
                                class26.field700[var6++] = class60.field1239;
                                continue;
                            }
                            if (var475 == 6117) {
                                class26.field700[var6++] = class253.field4397 ? 1 : 0;
                                continue;
                            }
                            if (var475 == 6118) {
                                class26.field700[var6++] = class265.field4632;
                                continue;
                            }
                            if (var475 == 6119) {
                                class26.field700[var6++] = class95.field1866;
                                continue;
                            }
                            if (var475 == 6120) {
                                class26.field700[var6++] = class214.field3798;
                                continue;
                            }
                            if (var475 == 6121) {
                                class26.field700[var6++] = 0;
                                continue;
                            }
                            if (var475 == 6124) {
                                class26.field700[var6++] = class126.field2335;
                                continue;
                            }
                        } else if (var475 < 6300) {
                            if (var475 == 6200) {
                                var6 -= 2;
                                class187.field3373 = (short) class26.field700[var6];
                                if (class187.field3373 <= 0) {
                                    class187.field3373 = 256;
                                }
                                class162.field2953 = (short) class26.field700[var6 + 1];
                                if (class162.field2953 <= 0) {
                                    class162.field2953 = 205;
                                }
                                continue;
                            }
                            if (var475 == 6201) {
                                var6 -= 2;
                                class78.field1590 = (short) class26.field700[var6];
                                if (class78.field1590 <= 0) {
                                    class78.field1590 = 256;
                                }
                                class181.field3290 = (short) class26.field700[var6 + 1];
                                if (class181.field3290 <= 0) {
                                    class181.field3290 = 320;
                                }
                                continue;
                            }
                            if (var475 == 6202) {
                                var6 -= 4;
                                class16.field384 = (short) class26.field700[var6];
                                if (class16.field384 <= 0) {
                                    class16.field384 = 1;
                                }
                                client.field2764 = (short) class26.field700[var6 + 1];
                                if (client.field2764 <= 0) {
                                    client.field2764 = 32767;
                                } else if (client.field2764 < class16.field384) {
                                    client.field2764 = class16.field384;
                                }
                                class7.field132 = (short) class26.field700[var6 + 2];
                                if (class7.field132 <= 0) {
                                    class7.field132 = 1;
                                }
                                class151.field2734 = (short) class26.field700[var6 + 3];
                                if (class151.field2734 <= 0) {
                                    class151.field2734 = 32767;
                                } else if (class151.field2734 < class7.field132) {
                                    class151.field2734 = class7.field132;
                                }
                                continue;
                            }
                            if (var475 == 6203) {
                                class103.method694(false, class113.field2122.field539, class113.field2122.field479, 0, 0, (byte) -71);
                                class26.field700[var6++] = class146.field2666;
                                class26.field700[var6++] = class143.field2613;
                                continue;
                            }
                            if (var475 == 6204) {
                                class26.field700[var6++] = class78.field1590;
                                class26.field700[var6++] = class181.field3290;
                                continue;
                            }
                            if (var475 == 6205) {
                                class26.field700[var6++] = class187.field3373;
                                class26.field700[var6++] = class162.field2953;
                                continue;
                            }
                        } else if (var475 < 6400) {
                            if (var475 == 6300) {
                                class26.field700[var6++] = (int) (class25.method182(true) / 60000L);
                                continue;
                            }
                            if (var475 == 6301) {
                                class26.field700[var6++] = (int) (class25.method182(true) / 86400000L) - 11745;
                                continue;
                            }
                            if (var475 == 6302) {
                                var6 -= 3;
                                int var139 = class26.field700[var6 + 2];
                                int var140 = class26.field700[var6 + 1];
                                int var141 = class26.field700[var6];
                                class240.field4199.clear();
                                class240.field4199.set(11, 12);
                                class240.field4199.set(var139, var140, var141);
                                class26.field700[var6++] = (int) (class240.field4199.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var475 == 6303) {
                                class240.field4199.clear();
                                class240.field4199.setTime(new Date(class25.method182(true)));
                                class26.field700[var6++] = class240.field4199.get(1);
                                continue;
                            }
                            if (var475 == 6304) {
                                var6--;
                                int var142 = class26.field700[var6];
                                boolean var143 = true;
                                if (var142 < 0) {
                                    var143 = (var142 + 1) % 4 == 0;
                                } else if (var142 < 1582) {
                                    var143 = var142 % 4 == 0;
                                } else if (var142 % 4 != 0) {
                                    var143 = false;
                                } else if (var142 % 100 != 0) {
                                    var143 = true;
                                } else if ((var142 % 400) != 0) {
                                    var143 = false;
                                }
                                class26.field700[var6++] = var143 ? 1 : 0;
                                continue;
                            }
                        } else if (var475 < 6500) {
                            if (var475 == 6405) {
                                class26.field700[var6++] = class66.method426(-19233) ? 1 : 0;
                                continue;
                            }
                            if (var475 == 6406) {
                                class26.field700[var6++] = class48.method315((byte) -123) ? 1 : 0;
                                continue;
                            }
                        } else if (var475 < 6600) {
                            if (var475 == 6500) {
                                if (class271.field4786 == 10 && class11.field254 == 0 && class180.field3280 == 0 && class162.field2949 == 0) {
                                    class26.field700[var6++] = class3.method15(-2048) == -1 ? 0 : 1;
                                    continue;
                                }
                                class26.field700[var6++] = 1;
                                continue;
                            }
                            if (var475 == 6501) {
                                class130 var127 = class4.method23(0);
                                if (var127 == null) {
                                    class26.field700[var6++] = -1;
                                    class26.field700[var6++] = 0;
                                    field3878[var7++] = class40.field906;
                                    class26.field700[var6++] = 0;
                                    field3878[var7++] = class40.field906;
                                    class26.field700[var6++] = 0;
                                } else {
                                    class26.field700[var6++] = var127.field2397;
                                    class26.field700[var6++] = var127.field1766;
                                    field3878[var7++] = var127.field2395;
                                    class68 var128 = var127.method842(arg2 ^ 0x63B5);
                                    class26.field700[var6++] = var128.field1381;
                                    field3878[var7++] = var128.field1379;
                                    class26.field700[var6++] = var127.field1765;
                                }
                                continue;
                            }
                            if (var475 == 6502) {
                                class130 var129 = class257.method1703(-3249);
                                if (var129 == null) {
                                    class26.field700[var6++] = -1;
                                    class26.field700[var6++] = 0;
                                    field3878[var7++] = class40.field906;
                                    class26.field700[var6++] = 0;
                                    field3878[var7++] = class40.field906;
                                    class26.field700[var6++] = 0;
                                } else {
                                    class26.field700[var6++] = var129.field2397;
                                    class26.field700[var6++] = var129.field1766;
                                    field3878[var7++] = var129.field2395;
                                    class68 var130 = var129.method842(arg2 ^ 0x63B5);
                                    class26.field700[var6++] = var130.field1381;
                                    field3878[var7++] = var130.field1379;
                                    class26.field700[var6++] = var129.field1765;
                                }
                                continue;
                            }
                            if (var475 == 6503) {
                                var6--;
                                int var131 = class26.field700[var6];
                                if (class271.field4786 == 10 && class11.field254 == 0 && class180.field3280 == 0 && class162.field2949 == 0) {
                                    class26.field700[var6++] = class200.method1390((byte) 37, var131) ? 1 : 0;
                                    continue;
                                }
                                class26.field700[var6++] = 0;
                                continue;
                            }
                            if (var475 == 6504) {
                                var6--;
                                class232.field4061 = class26.field700[var6];
                                class214.method1454(class95.field1867, (byte) -124);
                                continue;
                            }
                            if (var475 == 6505) {
                                class26.field700[var6++] = class232.field4061;
                                continue;
                            }
                            if (var475 == 6506) {
                                var6--;
                                int var132 = class26.field700[var6];
                                class130 var133 = class249.method1671(1824, var132);
                                if (var133 == null) {
                                    class26.field700[var6++] = -1;
                                    field3878[var7++] = class40.field906;
                                    class26.field700[var6++] = 0;
                                    field3878[var7++] = class40.field906;
                                    class26.field700[var6++] = 0;
                                } else {
                                    class26.field700[var6++] = var133.field1766;
                                    field3878[var7++] = var133.field2395;
                                    class68 var134 = var133.method842(arg2 + 7243);
                                    class26.field700[var6++] = var134.field1381;
                                    field3878[var7++] = var134.field1379;
                                    class26.field700[var6++] = var133.field1765;
                                }
                                continue;
                            }
                            if (var475 == 6507) {
                                var6 -= 4;
                                int var135 = class26.field700[var6];
                                boolean var136 = class26.field700[var6 + 1] == 1;
                                int var137 = class26.field700[var6 + 2];
                                boolean var138 = class26.field700[var6 + 3] == 1;
                                class224.method1529(var137, var138, var135, var136, arg2 ^ 0x3FFF);
                                continue;
                            }
                        }
                    } else if (var475 == 4500) {
                        var6 -= 2;
                        int var256 = class26.field700[var6];
                        int var257 = class26.field700[var6 + 1];
                        class174 var258 = class122.method788(var257, false);
                        if (var258.method1145(-18954)) {
                            field3878[var7++] = class9.method67(var256, (byte) -51).method1055(var257, var258.field3169, -250);
                        } else {
                            class26.field700[var6++] = class9.method67(var256, (byte) -51).method1058(-125, var257, var258.field3165);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var474) {
            if (var5.field2120 == null) {
                if (class55.field1157 != 0) {
                    class120.method774(0, class205.field3727, -11292, class40.field906);
                }
                class137.method899(var474, "CS2 - scr:" + var5.field4226 + " op:" + var9, 46);
            } else {
                class263 var470 = class7.method46(30, 1);
                var470.method1760(true, class182.field3304).method1760(true, var5.field2120);
                for (int var471 = class106.field2003 - 1; var471 >= 0; var471--) {
                    var470.method1760(true, class275.field4817).method1760(true, class117.field2182[var471].field4743.field2120);
                }
                if (var9 == 40) {
                    int var472 = var10[var8];
                    var470.method1760(true, class11.field253).method1760(true, class136.method891(-88, var472));
                }
                if (class55.field1157 != 0) {
                    class120.method774(0, class124.method797(-79, new class263[] { class19.field422, var5.field2120 }), -11292, class40.field906);
                }
                class137.method899(var474, "CS2 - scr:" + var5.field4226 + " op:" + var9 + new String(var470.method1753(arg2 ^ 0xFFFFC000)), 46);
            }
        }
    }
}
