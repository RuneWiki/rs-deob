import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class155 extends class112 {

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    private int field2461 = 1;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
    private int field2470 = 1;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "[I")
    public static int[] field2464 = new int[2500];

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "Lwm;")
    public static class152 field2468 = class157.method1048(" )2> <col=00ffff>", 109);

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field2459 = 0;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "Lah;")
    public static class205 field2472;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lv;III)V", line = 6)
    public static final void method1034(class73 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class112.field1595) {
            class34 var4 = class287.field4857[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field558 != null && var4.field558.field1684.method497()) {
                arg0.method494(var4.field558.field1684, 128, 0, 0, true);
            }
        }
        if (arg3 < class112.field1595) {
            class34 var5 = class287.field4857[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field558 != null && var5.field558.field1684.method497()) {
                arg0.method494(var5.field558.field1684, 0, 0, 128, true);
            }
        }
        if (arg2 < class112.field1595 && arg3 < class97.field1394) {
            class34 var6 = class287.field4857[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field558 != null && var6.field558.field1684.method497()) {
                arg0.method494(var6.field558.field1684, 128, 0, 128, true);
            }
        }
        if (arg2 < class112.field1595 && arg3 > 0) {
            class34 var7 = class287.field4857[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field558 != null && var7.field558.field1684.method497()) {
                arg0.method494(var7.field558.field1684, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILhi;)V", line = 72)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg1 == 0) {
            this.field2461 = arg2.method2011(-53);
        } else if (arg1 == 1) {
            this.field2470 = arg2.method2011(-70);
        } else if (arg1 == 2) {
            this.field1591 = arg2.method2011(-52) == 1;
        }
        if (arg0 != 31164) {
            field2462 = 42;
        }
        field2467++;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V", line = 104)
    public static final void method1035(int arg0, int arg1) {
        field2458++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class26.field445[arg1];
        int var3 = class273.field4688[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var4 = class64.field955[arg1];
        int var5 = (int) class208.field3391[arg1];
        long var6 = class208.field3391[arg1];
        if (var3 == 43) {
            class127 var49 = class132.method837(var2, var4, 0);
            if (var49 != null) {
                class233.method1601(6132);
                class84 var50 = client.method1759(var49);
                class40.method284(var50.method545(-105), 32768, var49.field1872, var49.field1772, var4, var2, var50.field1170);
                class268.field4527 = 0;
                class62.field942 = class213.method1442(var49, -15415);
                if (class62.field942 == null) {
                    class62.field942 = class97.field1386;
                }
                if (var49.field1794) {
                    class279.field4775 = class195.method1307(new class152[] { var49.field1801, class30.field495 }, (byte) 29);
                } else {
                    class279.field4775 = class195.method1307(new class152[] { class110.field1556, var49.field1932, class30.field495 }, (byte) 29);
                }
            }
            return;
        }
        if (var3 == 59) {
            if (var5 == 0) {
                class117.method772(class23.field400, var2, var4);
            } else if (var5 == 1) {
                if (class148.field2263 > 0 && class216.field3515[82] && class216.field3515[81]) {
                    class269.method1842(class199.field3226 + var4, class272.field4670 + var2, class23.field400, -6810);
                } else if (class272.method1869(0, class85.field1176.field4188[0], 1, 0, 0, var4, 0, class85.field1176.field4245[0], 111, var2, true, 0)) {
                    class245.field4102.method1980(false, class164.field2599);
                    class245.field4102.method1980(false, class268.field4529);
                    class245.field4102.method1994(class272.field4645, 2921);
                    class245.field4102.method1980(false, 57);
                    class245.field4102.method1980(false, class202.field3262);
                    class245.field4102.method1980(false, class130.field1980);
                    class245.field4102.method1980(false, 89);
                    class245.field4102.method1994(class85.field1176.field4162, 2921);
                    class245.field4102.method1994(class85.field1176.field4231, 2921);
                    class245.field4102.method1980(false, class226.field3671);
                    class245.field4102.method1980(false, 63);
                }
            }
        }
        if (var3 == 21) {
            class245.field4102.method1065(252, -127);
            class240.field3932++;
            class245.field4102.method1967(var4, -1303690792);
            class245.field4102.method1983((byte) -105, class93.field1329);
            class245.field4102.method1963((byte) -78, class172.field2758);
            class245.field4102.method2018(var2, 128);
        }
        if (var3 == 1001) {
            class57.field878 = 0;
            class279.field4765 = class62.field944;
            class211.field3429 = class193.field3066;
            class38.field632 = 2;
            class4 var8 = class40.field649[var5];
            if (var8 != null) {
                class242 var9 = var8.field72;
                if (var9.field4011 != null) {
                    var9 = var9.method1650(4);
                }
                if (var9 != null) {
                    class245.field4102.method1065(7, 125);
                    class148.field2308++;
                    class245.field4102.method1994(var9.field3988, 2921);
                }
            }
        }
        if (arg0 <= 96) {
            method1035(-32, 40);
        }
        if (var3 == 46) {
            boolean var10 = true;
            class127 var11 = class11.method54(false, var4);
            if (var11.field1887 > 0) {
                var10 = class8.method42(-206, var11);
            }
            if (var10) {
                class245.field4102.method1065(139, 6);
                class163.field2577++;
                class245.field4102.method1967(var4, -1303690792);
            }
        }
        if (var3 == 34) {
            class163.field2587++;
            if (class256.field4410 == 1) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var4, 0, class85.field1176.field4245[0], 117, var2, false, 1);
            } else {
                boolean var12 = class272.method1869(0, class85.field1176.field4188[0], 2, 0, 0, var4, 0, class85.field1176.field4245[0], 88, var2, false, 0);
                if (!var12) {
                    class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var4, 0, class85.field1176.field4245[0], 115, var2, false, 1);
                }
            }
            class279.field4765 = class62.field944;
            class211.field3429 = class193.field3066;
            class38.field632 = 2;
            class57.field878 = 0;
            class245.field4102.method1065(175, 127);
            class245.field4102.method1963((byte) -78, var5);
            class245.field4102.method2018(class199.field3226 + var4, 128);
            class245.field4102.method1996(0, class272.field4670 + var2);
        }
        if (var3 == 31) {
            class245.field4102.method1065(195, -34);
            class273.field4693++;
            class245.field4102.method1994(var5, 2921);
            class245.field4102.method1983((byte) -97, var4);
            class245.field4102.method1996(0, var2);
            class199.field3207 = 0;
            class205.field3357 = class11.method54(false, var4);
            class61.field929 = var2;
        }
        if (var3 == 1003) {
            class310.field5309++;
            class31.method239(var2, 0, var4, var6);
            class245.field4102.method1065(234, -39);
            class245.field4102.method1996(0, var2 + class272.field4670);
            class245.field4102.method1963((byte) -78, var4 + class199.field3226);
            class245.field4102.method1994((int) (var6 >>> 32) & Integer.MAX_VALUE, 2921);
        }
        if (var3 == 50) {
            class12 var14 = class22.field380[var5];
            if (var14 != null) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var14.field4245[0], 0, class85.field1176.field4245[0], 99, var14.field4188[0], false, 1);
                class57.field878 = 0;
                class38.field632 = 2;
                class185.field2940++;
                class211.field3429 = class193.field3066;
                class279.field4765 = class62.field944;
                class245.field4102.method1065(57, 33);
                class245.field4102.method2018(var5, 128);
            }
        }
        if (var3 == 32) {
            class11.field135++;
            if (class256.field4410 == 1) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var4, 0, class85.field1176.field4245[0], 81, var2, false, 1);
            } else {
                boolean var15 = class272.method1869(0, class85.field1176.field4188[0], 2, 0, 0, var4, 0, class85.field1176.field4245[0], 96, var2, false, 0);
                if (!var15) {
                    class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var4, 0, class85.field1176.field4245[0], 120, var2, false, 1);
                }
            }
            class57.field878 = 0;
            class38.field632 = 2;
            class279.field4765 = class62.field944;
            class211.field3429 = class193.field3066;
            class245.field4102.method1065(107, -117);
            class245.field4102.method1994(var5, 2921);
            class245.field4102.method1963((byte) -78, class272.field4670 + var2);
            class245.field4102.method1994(class199.field3226 + var4, 2921);
        }
        if (var3 == 51) {
            class25.field426++;
            class245.field4102.method1065(124, 123);
            class245.field4102.method1983((byte) -128, var4);
            class245.field4102.method2018(var5, 128);
            class245.field4102.method1963((byte) -78, var2);
            class199.field3207 = 0;
            class205.field3357 = class11.method54(false, var4);
            class61.field929 = var2;
        }
        if (var3 == 18) {
            class245.field4102.method1065(189, -98);
            class244.field4059++;
            class245.field4102.method1996(0, var5);
            class245.field4102.method2018(var2, 128);
            class245.field4102.method1967(var4, -1303690792);
            class199.field3207 = 0;
            class205.field3357 = class11.method54(false, var4);
            class61.field929 = var2;
        }
        if (var3 == 1005) {
            class211.field3429 = class193.field3066;
            class279.field4765 = class62.field944;
            class148.field2275++;
            class57.field878 = 0;
            class38.field632 = 2;
            class245.field4102.method1065(22, -56);
            class245.field4102.method1996(0, var5);
        }
        if (var3 == 6) {
            class12 var17 = class22.field380[var5];
            if (var17 != null) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var17.field4245[0], 0, class85.field1176.field4245[0], 100, var17.field4188[0], false, 1);
                class176.field2834++;
                class279.field4765 = class62.field944;
                class57.field878 = 0;
                class38.field632 = 2;
                class211.field3429 = class193.field3066;
                class245.field4102.method1065(188, -96);
                class245.field4102.method1994(var5, 2921);
            }
        }
        if (var3 == 14) {
            if (var5 == 0) {
                class10.field131 = 1;
                class117.method772(class23.field400, var2, var4);
            } else if (class148.field2263 > 0 && class216.field3515[82] && class216.field3515[81]) {
                class269.method1842(class199.field3226 + var4, class272.field4670 + var2, class23.field400, -6810);
            } else {
                class84.field1163++;
                class245.field4102.method1065(12, 126);
                class245.field4102.method1994(class199.field3226 + var4, 2921);
                class245.field4102.method1963((byte) -78, class272.field4670 + var2);
            }
        }
        if (var3 == 20) {
            class12 var18 = class22.field380[var5];
            if (var18 != null) {
                class15.field208++;
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var18.field4245[0], 0, class85.field1176.field4245[0], 107, var18.field4188[0], false, 1);
                class211.field3429 = class193.field3066;
                class38.field632 = 2;
                class57.field878 = 0;
                class279.field4765 = class62.field944;
                class245.field4102.method1065(140, 127);
                class245.field4102.method1994(var5, 2921);
            }
        }
        if (var3 == 30) {
            class12 var19 = class22.field380[var5];
            if (var19 != null) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var19.field4245[0], 0, class85.field1176.field4245[0], 97, var19.field4188[0], false, 1);
                class279.field4765 = class62.field944;
                class230.field3748++;
                class38.field632 = 2;
                class211.field3429 = class193.field3066;
                class57.field878 = 0;
                class245.field4102.method1065(190, -59);
                class245.field4102.method1994(var5, 2921);
            }
        }
        if (var3 == 15) {
            class245.field4102.method1065(244, -24);
            class142.field2183++;
            class245.field4102.method2018(var5, 128);
            class245.field4102.method2018(var2, 128);
            class245.field4102.method2010(var4, -3);
            class199.field3207 = 0;
            class205.field3357 = class11.method54(false, var4);
            class61.field929 = var2;
        }
        if (var3 == 36 || var3 == 1002) {
            class282.method1912(class55.field864[arg1], var4, var2, (byte) -50, var5);
        }
        if (var3 == 29) {
            class208.field3401++;
            class245.field4102.method1065(207, -38);
            class245.field4102.method1963((byte) -78, var5);
            class245.field4102.method2019((byte) -61, var4);
            class245.field4102.method1994(var2, 2921);
            class199.field3207 = 0;
            class205.field3357 = class11.method54(false, var4);
            class61.field929 = var2;
        }
        if (var3 == 28) {
            class4 var20 = class40.field649[var5];
            if (var20 != null) {
                class50.field780++;
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var20.field4245[0], 0, class85.field1176.field4245[0], 85, var20.field4188[0], false, 1);
                class211.field3429 = class193.field3066;
                class38.field632 = 2;
                class57.field878 = 0;
                class279.field4765 = class62.field944;
                class245.field4102.method1065(8, -70);
                class245.field4102.method1996(0, var5);
            }
        }
        if (var3 == 22) {
            class223.field3633++;
            boolean var21 = class272.method1869(0, class85.field1176.field4188[0], 2, 0, 0, var4, 0, class85.field1176.field4245[0], 127, var2, false, 0);
            if (!var21) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var4, 0, class85.field1176.field4245[0], 98, var2, false, 1);
            }
            class38.field632 = 2;
            class211.field3429 = class193.field3066;
            class57.field878 = 0;
            class279.field4765 = class62.field944;
            class245.field4102.method1065(128, 2);
            class245.field4102.method1963((byte) -78, class272.field4670 + var2);
            class245.field4102.method2018(class199.field3226 + var4, 128);
            class245.field4102.method1963((byte) -78, var5);
            class245.field4102.method2010(class93.field1329, -3);
            class245.field4102.method1996(0, class172.field2758);
        }
        if (var3 == 13) {
            class12 var23 = class22.field380[var5];
            if (var23 != null) {
                class284.field4830++;
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var23.field4245[0], 0, class85.field1176.field4245[0], 116, var23.field4188[0], false, 1);
                class211.field3429 = class193.field3066;
                class57.field878 = 0;
                class38.field632 = 2;
                class279.field4765 = class62.field944;
                class245.field4102.method1065(88, 8);
                class245.field4102.method1996(0, var5);
            }
        }
        if (var3 == 1006) {
            class127 var24 = class11.method54(false, var4);
            if (var24 == null || var24.field1837[var2] < 100000) {
                class148.field2275++;
                class245.field4102.method1065(22, -64);
                class245.field4102.method1996(0, var5);
            } else {
                class245.method1687(class201.field3252, 0, class195.method1307(new class152[] { class38.method280(101, var24.field1837[var2]), class230.field3750, class189.method1253((byte) 117, var5).field5393 }, (byte) 29), -1);
            }
            class199.field3207 = 0;
            class205.field3357 = class11.method54(false, var4);
            class61.field929 = var2;
        }
        if (var3 == 10) {
            class163.field2577++;
            class245.field4102.method1065(139, 11);
            class245.field4102.method1967(var4, -1303690792);
            class127 var25 = class11.method54(false, var4);
            if (var25.field1920 != null && var25.field1920[0][0] == 5) {
                int var26 = var25.field1920[0][1];
                if (class249.field4227[var26] != var25.field1894[0]) {
                    class249.field4227[var26] = var25.field1894[0];
                    class127.method815(-2, var26);
                }
            }
        }
        if (var3 == 5) {
            class146.field2233++;
            class31.method239(var2, 0, var4, var6);
            class245.field4102.method1065(98, -44);
            class245.field4102.method1996(0, class272.field4670 + var2);
            class245.field4102.method1994((int) (var6 >>> 32) & Integer.MAX_VALUE, 2921);
            class245.field4102.method2018(class199.field3226 + var4, 128);
        }
        if (var3 == 35) {
            class12 var27 = class22.field380[var5];
            if (var27 != null) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var27.field4245[0], 0, class85.field1176.field4245[0], 116, var27.field4188[0], false, 1);
                class211.field3429 = class193.field3066;
                class298.field5151++;
                class57.field878 = 0;
                class38.field632 = 2;
                class279.field4765 = class62.field944;
                class245.field4102.method1065(123, -26);
                class245.field4102.method1996(0, var5);
            }
        }
        if (var3 == 37) {
            class12 var28 = class22.field380[var5];
            if (var28 != null) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var28.field4245[0], 0, class85.field1176.field4245[0], 88, var28.field4188[0], false, 1);
                class279.field4765 = class62.field944;
                class38.field632 = 2;
                class211.field3429 = class193.field3066;
                class297.field5128++;
                class57.field878 = 0;
                class245.field4102.method1065(249, 125);
                class245.field4102.method1996(0, var5);
            }
        }
        if (var3 == 9) {
            class245.field4102.method1065(1, 15);
            class245.field4083++;
            class245.field4102.method1967(var4, -1303690792);
            class245.field4102.method1996(0, var2);
            class245.field4102.method1963((byte) -78, var5);
            class199.field3207 = 0;
            class205.field3357 = class11.method54(false, var4);
            class61.field929 = var2;
        }
        if (var3 == 38) {
            class12 var29 = class22.field380[var5];
            if (var29 != null) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var29.field4245[0], 0, class85.field1176.field4245[0], 125, var29.field4188[0], false, 1);
                class279.field4765 = class62.field944;
                class307.field5282++;
                class211.field3429 = class193.field3066;
                class57.field878 = 0;
                class38.field632 = 2;
                class245.field4102.method1065(182, -68);
                class245.field4102.method1963((byte) -78, class172.field2758);
                class245.field4102.method1983((byte) -128, class93.field1329);
                class245.field4102.method1994(var5, 2921);
            }
        }
        if (var3 == 40) {
            class31.method239(var2, 0, var4, var6);
            class77.field1093++;
            class245.field4102.method1065(173, 125);
            class245.field4102.method1996(0, class199.field3226 + var4);
            class245.field4102.method2018(class272.field4670 + var2, 128);
            class245.field4102.method1994(Integer.MAX_VALUE & (int) (var6 >>> 32), 2921);
        }
        if (var3 == 23) {
            class12 var30 = class22.field380[var5];
            if (var30 != null) {
                class8.field105++;
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var30.field4245[0], 0, class85.field1176.field4245[0], 87, var30.field4188[0], false, 1);
                class279.field4765 = class62.field944;
                class57.field878 = 0;
                class38.field632 = 2;
                class211.field3429 = class193.field3066;
                class245.field4102.method1065(39, 123);
                class245.field4102.method2018(class227.field3683, 128);
                class245.field4102.method1963((byte) -78, var5);
                class245.field4102.method1983((byte) -75, class69.field1011);
                class245.field4102.method2018(class302.field5205, 128);
            }
        }
        if (var3 == 47) {
            class245.field4102.method1065(89, -53);
            class245.field4102.method1994(var2, 2921);
            class245.field4102.method1994(var5, 2921);
            class245.field4102.method1967(var4, -1303690792);
            class199.field3212++;
            class199.field3207 = 0;
            class205.field3357 = class11.method54(false, var4);
            class61.field929 = var2;
        }
        if (var3 == 48) {
            class245.field4102.method1065(41, 123);
            class245.field4102.method2018(var5, 128);
            class245.field4102.method2010(var4, -3);
            class131.field2002++;
            class245.field4102.method1967(class93.field1329, -1303690792);
            class245.field4102.method2018(var2, 128);
            class245.field4102.method2018(class172.field2758, 128);
            class199.field3207 = 0;
            class205.field3357 = class11.method54(false, var4);
            class61.field929 = var2;
        }
        if (var3 == 7 && class31.method239(var2, 0, var4, var6)) {
            class245.field4102.method1065(95, 124);
            class245.field4102.method1996(0, class199.field3226 + var4);
            class131.field1995++;
            class245.field4102.method1967(class69.field1011, -1303690792);
            class245.field4102.method1996(0, class302.field5205);
            class245.field4102.method1996(0, class227.field3683);
            class245.field4102.method1994(var2 + class272.field4670, 2921);
            class245.field4102.method1996(0, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var3 == 26) {
            class4 var31 = class40.field649[var5];
            if (var31 != null) {
                class82.field1147++;
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var31.field4245[0], 0, class85.field1176.field4245[0], 79, var31.field4188[0], false, 1);
                class211.field3429 = class193.field3066;
                class279.field4765 = class62.field944;
                class38.field632 = 2;
                class57.field878 = 0;
                class245.field4102.method1065(52, 126);
                class245.field4102.method1963((byte) -78, var5);
            }
        }
        if (var3 == 16) {
            class233.method1601(6132);
            class127 var32 = class11.method54(false, var4);
            class227.field3683 = var2;
            class69.field1011 = var4;
            class302.field5205 = var5;
            class268.field4527 = 1;
            class272.method1868(22889, var32);
            class141.field2142 = class195.method1307(new class152[] { class179.field2844, class189.method1253((byte) 112, var5).field5393, class30.field495 }, (byte) 29);
            if (class141.field2142 == null) {
                class141.field2142 = class163.field2573;
            }
            return;
        }
        if (var3 == 41) {
            class311.method2154(8);
        }
        if (var3 == 19 && class127.field1858 == null) {
            class227.method1565(true, var4, var2);
            class127.field1858 = class132.method837(var2, var4, 0);
            class272.method1868(22889, class127.field1858);
        }
        if (var3 == 12) {
            class245.field4102.method1065(139, -79);
            class245.field4102.method1967(var4, -1303690792);
            class163.field2577++;
            class127 var33 = class11.method54(false, var4);
            if (var33.field1920 != null && var33.field1920[0][0] == 5) {
                int var34 = var33.field1920[0][1];
                class249.field4227[var34] = 1 - class249.field4227[var34];
                class127.method815(-2, var34);
            }
        }
        if (var3 == 25) {
            class4 var35 = class40.field649[var5];
            if (var35 != null) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var35.field4245[0], 0, class85.field1176.field4245[0], 103, var35.field4188[0], false, 1);
                class57.field878 = 0;
                class279.field4765 = class62.field944;
                class211.field3429 = class193.field3066;
                class118.field1678++;
                class38.field632 = 2;
                class245.field4102.method1065(20, 13);
                class245.field4102.method1994(class172.field2758, 2921);
                class245.field4102.method2018(var5, 128);
                class245.field4102.method1983((byte) -92, class93.field1329);
            }
        }
        if (var3 == 17) {
            class4 var36 = class40.field649[var5];
            if (var36 != null) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var36.field4245[0], 0, class85.field1176.field4245[0], 103, var36.field4188[0], false, 1);
                class120.field1697++;
                class38.field632 = 2;
                class211.field3429 = class193.field3066;
                class279.field4765 = class62.field944;
                class57.field878 = 0;
                class245.field4102.method1065(10, 124);
                class245.field4102.method1994(var5, 2921);
            }
        }
        if (var3 == 24) {
            if (class256.field4410 == 1) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var4, 0, class85.field1176.field4245[0], 83, var2, false, 1);
            } else {
                boolean var37 = class272.method1869(0, class85.field1176.field4188[0], 2, 0, 0, var4, 0, class85.field1176.field4245[0], 118, var2, false, 0);
                if (!var37) {
                    class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var4, 0, class85.field1176.field4245[0], 93, var2, false, 1);
                }
            }
            class279.field4765 = class62.field944;
            class57.field878 = 0;
            class211.field3429 = class193.field3066;
            class298.field5149++;
            class38.field632 = 2;
            class245.field4102.method1065(115, 125);
            class245.field4102.method1963((byte) -78, var4 + class199.field3226);
            class245.field4102.method1994(var5, 2921);
            class245.field4102.method1963((byte) -78, class272.field4670 + var2);
        }
        if (var3 == 11) {
            class245.field4102.method1065(164, -42);
            class245.field4102.method2018(var2, 128);
            class245.field4102.method1996(0, var5);
            class98.field1411++;
            class245.field4102.method1967(var4, -1303690792);
            class245.field4102.method1963((byte) -78, class227.field3683);
            class245.field4102.method1967(class69.field1011, -1303690792);
            class245.field4102.method1996(0, class302.field5205);
            class199.field3207 = 0;
            class205.field3357 = class11.method54(false, var4);
            class61.field929 = var2;
        }
        if (var3 == 57) {
            if (class256.field4410 == 1) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var4, 0, class85.field1176.field4245[0], 118, var2, false, 1);
            } else {
                boolean var39 = class272.method1869(0, class85.field1176.field4188[0], 2, 0, 0, var4, 0, class85.field1176.field4245[0], 119, var2, false, 0);
                if (!var39) {
                    class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var4, 0, class85.field1176.field4245[0], 83, var2, false, 1);
                }
            }
            class211.field3429 = class193.field3066;
            class279.field4765 = class62.field944;
            class130.field1974++;
            class38.field632 = 2;
            class57.field878 = 0;
            class245.field4102.method1065(109, 125);
            class245.field4102.method2018(var2 + class272.field4670, 128);
            class245.field4102.method1996(0, class199.field3226 + var4);
            class245.field4102.method2018(var5, 128);
        }
        if (var3 == 45) {
            class4 var41 = class40.field649[var5];
            if (var41 != null) {
                field2466++;
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var41.field4245[0], 0, class85.field1176.field4245[0], 110, var41.field4188[0], false, 1);
                class279.field4765 = class62.field944;
                class57.field878 = 0;
                class38.field632 = 2;
                class211.field3429 = class193.field3066;
                class245.field4102.method1065(203, 123);
                class245.field4102.method1994(var5, 2921);
            }
        }
        if (var3 == 3) {
            if (class256.field4410 == 1) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var4, 0, class85.field1176.field4245[0], 120, var2, false, 1);
            } else {
                boolean var42 = class272.method1869(0, class85.field1176.field4188[0], 2, 0, 0, var4, 0, class85.field1176.field4245[0], 83, var2, false, 0);
                if (!var42) {
                    class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var4, 0, class85.field1176.field4245[0], 126, var2, false, 1);
                }
            }
            class38.field632 = 2;
            class211.field3429 = class193.field3066;
            class4.field63++;
            class279.field4765 = class62.field944;
            class57.field878 = 0;
            class245.field4102.method1065(174, 125);
            class245.field4102.method1963((byte) -78, var5);
            class245.field4102.method2018(var4 + class199.field3226, 128);
            class245.field4102.method1994(var2 + class272.field4670, 2921);
        }
        if (var3 == 4 && class31.method239(var2, 0, var4, var6)) {
            class245.field4102.method1065(233, 127);
            class245.field4102.method1963((byte) -78, class172.field2758);
            class77.field1096++;
            class245.field4102.method1994(class272.field4670 + var2, 2921);
            class245.field4102.method1963((byte) -78, class199.field3226 + var4);
            class245.field4102.method2018(Integer.MAX_VALUE & (int) (var6 >>> 32), 128);
            class245.field4102.method2010(class93.field1329, -3);
        }
        if (var3 == 8) {
            class12 var44 = class22.field380[var5];
            if (var44 != null) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var44.field4245[0], 0, class85.field1176.field4245[0], 108, var44.field4188[0], false, 1);
                class45.field719++;
                class57.field878 = 0;
                class211.field3429 = class193.field3066;
                class279.field4765 = class62.field944;
                class38.field632 = 2;
                class245.field4102.method1065(220, -31);
                class245.field4102.method2018(var5, 128);
            }
        }
        if (var3 == 1007) {
            class51.field785++;
            class279.field4765 = class62.field944;
            class57.field878 = 0;
            class211.field3429 = class193.field3066;
            class38.field632 = 2;
            class245.field4102.method1065(161, 125);
            class245.field4102.method2018(var5, 128);
        }
        if (var3 == 58) {
            class279.field4770++;
            boolean var45 = class272.method1869(0, class85.field1176.field4188[0], 2, 0, 0, var4, 0, class85.field1176.field4245[0], 102, var2, false, 0);
            if (!var45) {
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var4, 0, class85.field1176.field4245[0], 114, var2, false, 1);
            }
            class38.field632 = 2;
            class279.field4765 = class62.field944;
            class211.field3429 = class193.field3066;
            class57.field878 = 0;
            class245.field4102.method1065(33, 127);
            class245.field4102.method1996(0, class272.field4670 + var2);
            class245.field4102.method1994(var5, 2921);
            class245.field4102.method2018(class199.field3226 + var4, 128);
            class245.field4102.method1996(0, class302.field5205);
            class245.field4102.method2018(class227.field3683, 128);
            class245.field4102.method2010(class69.field1011, -3);
        }
        if (var3 == 44) {
            if (var5 == 0) {
                class194.field3098 = 1;
                class117.method772(class23.field400, var2, var4);
            } else if (var5 == 1) {
                class245.field4102.method1065(255, 127);
                class193.field3082++;
                class245.field4102.method1967(class93.field1329, -1303690792);
                class245.field4102.method1963((byte) -78, class199.field3226 + var4);
                class245.field4102.method1994(class272.field4670 + var2, 2921);
                class245.field4102.method1963((byte) -78, class172.field2758);
            }
        }
        if (var3 == 1) {
            class25.field427++;
            class245.field4102.method1065(243, 125);
            class245.field4102.method1996(0, var5);
            class245.field4102.method1963((byte) -78, var2);
            class245.field4102.method2019((byte) -123, var4);
            class199.field3207 = 0;
            class205.field3357 = class11.method54(false, var4);
            class61.field929 = var2;
        }
        if (var3 == 49) {
            class31.method239(var2, 0, var4, var6);
            class135.field2073++;
            class245.field4102.method1065(206, 125);
            class245.field4102.method2018(class272.field4670 + var2, 128);
            class245.field4102.method1996(0, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class245.field4102.method1994(class199.field3226 + var4, 2921);
        }
        if (var3 == 33) {
            class245.field4102.method1065(235, -28);
            class253.field4375++;
            class245.field4102.method1963((byte) -78, var2);
            class245.field4102.method1996(0, var5);
            class245.field4102.method2019((byte) -53, var4);
            class199.field3207 = 0;
            class205.field3357 = class11.method54(false, var4);
            class61.field929 = var2;
        }
        if (var3 == 2) {
            class26.field443++;
            class31.method239(var2, 0, var4, var6);
            class245.field4102.method1065(2, -97);
            class245.field4102.method1963((byte) -78, class272.field4670 + var2);
            class245.field4102.method1994(class199.field3226 + var4, 2921);
            class245.field4102.method2018(Integer.MAX_VALUE & (int) (var6 >>> 32), 128);
        }
        if (var3 == 39) {
            class184.field2929++;
            class245.field4102.method1065(238, 127);
            class245.field4102.method1996(0, var2);
            class245.field4102.method1996(0, var5);
            class245.field4102.method2019((byte) -113, var4);
            class199.field3207 = 0;
            class205.field3357 = class11.method54(false, var4);
            class61.field929 = var2;
        }
        if (var3 == 42) {
            class4 var47 = class40.field649[var5];
            if (var47 != null) {
                class80.field1117++;
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var47.field4245[0], 0, class85.field1176.field4245[0], 79, var47.field4188[0], false, 1);
                class211.field3429 = class193.field3066;
                class38.field632 = 2;
                class279.field4765 = class62.field944;
                class57.field878 = 0;
                class245.field4102.method1065(158, -70);
                class245.field4102.method1994(var5, 2921);
            }
        }
        if (var3 == 60) {
            class4 var48 = class40.field649[var5];
            if (var48 != null) {
                class173.field2774++;
                class272.method1869(0, class85.field1176.field4188[0], 2, 0, 1, var48.field4245[0], 0, class85.field1176.field4245[0], 125, var48.field4188[0], false, 1);
                class57.field878 = 0;
                class211.field3429 = class193.field3066;
                class279.field4765 = class62.field944;
                class38.field632 = 2;
                class245.field4102.method1065(120, -68);
                class245.field4102.method1963((byte) -78, class302.field5205);
                class245.field4102.method1967(class69.field1011, -1303690792);
                class245.field4102.method1963((byte) -78, class227.field3683);
                class245.field4102.method1994(var5, 2921);
            }
        }
        if (class268.field4527 != 0) {
            class268.field4527 = 0;
            class272.method1868(22889, class11.method54(false, class69.field1011));
        }
        if (class125.field1762) {
            class233.method1601(6132);
        }
        if (class205.field3357 != null && class199.field3207 == 0) {
            class272.method1868(22889, class205.field3357);
        }
    }

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "(I)V", line = 1176)
    public static void method1036(int arg0) {
        field2472 = null;
        field2464 = null;
        field2468 = null;
        if (arg0 <= 2) {
            method1036(71);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIZZ)V", line = 1189)
    public static final void method1037(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field2463++;
        class127.field1797 = arg1;
        class92.field1299 = arg2;
        if (arg5) {
            method1036(89);
        }
        class17.field241 = arg0;
        class310.field5307 = arg4;
        class290.field4931 = arg3;
        if (arg6 && class92.field1299 >= 100) {
            class224.field3639 = class310.field5307 * 128 + 64;
            class80.field1129 = class17.field241 * 128 + 64;
            class27.field470 = class154.method1031(79, class224.field3639, class23.field400, class80.field1129) - class127.field1797;
        }
        class28.field485 = 2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)[I", line = 1220)
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -3) {
            field2468 = (class152) null;
        }
        int[] var3 = this.field1585.method1952(arg1, (byte) 88);
        field2460++;
        if (this.field1585.field4935) {
            int var4 = this.field2470 + this.field2470 + 1;
            int var5 = this.field2461 + this.field2461 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field2470; var9 <= (this.field2470 + arg1); var9++) {
                int[] var10 = this.method751(var9 & class275.field4712, (byte) 107, 0);
                int[] var11 = new int[class58.field889];
                int var12 = 0;
                for (int var13 = -this.field2461; var13 <= this.field2461; var13++) {
                    var12 += var10[var13 & class251.field4304];
                }
                int var14 = 0;
                while (class58.field889 > var14) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[var14 - this.field2461 & class251.field4304];
                    var14++;
                    var12 = var10[this.field2461 + var14 & class251.field4304] + var15;
                }
                var8[this.field2470 + var9 - arg1] = var11;
            }
            for (int var16 = 0; var16 < class58.field889; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var6 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)[[I", line = 1306)
    public final int[][] method55(int arg0, boolean arg1) {
        field2471++;
        int[][] var3 = this.field1594.method656((byte) -74, arg0);
        if (this.field1594.field1402) {
            int var4 = this.field2470 + this.field2470 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field2461 + this.field2461 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field2470; var9 <= this.field2470 + arg0; var9++) {
                int[][] var10 = this.method750(0, (byte) -17, class275.field4712 & var9);
                int[][] var11 = new int[3][class58.field889];
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field2461; var18 <= this.field2461; var18++) {
                    int var19 = class251.field4304 & var18;
                    var12 += var16[var19];
                    var14 += var17[var19];
                    var13 += var15[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[1];
                int[] var22 = var11[2];
                int var23 = 0;
                while (class58.field889 > var23) {
                    var20[var23] = var7 * var13 >> 16;
                    var21[var23] = var7 * var12 >> 16;
                    var22[var23] = var7 * var14 >> 16;
                    int var24 = class251.field4304 & var23 - this.field2461;
                    int var25 = var14 - var17[var24];
                    int var26 = var13 - var15[var24];
                    var23++;
                    int var27 = var12 - var16[var24];
                    int var28 = class251.field4304 & this.field2461 + var23;
                    var13 = var15[var28] + var26;
                    var14 = var17[var28] + var25;
                    var12 = var16[var28] + var27;
                }
                var8[this.field2470 + var9 - arg0] = var11;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[2];
            int[] var31 = var3[1];
            for (int var32 = 0; var32 < class58.field889; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var33 += var37[0][var32];
                    var35 += var37[1][var32];
                    var34 += var37[2][var32];
                }
                var29[var32] = var5 * var33 >> 16;
                var31[var32] = var5 * var35 >> 16;
                var30[var32] = var5 * var34 >> 16;
            }
        }
        if (arg1) {
            this.field2470 = 88;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 1443)
    public class155() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIBIII)V", line = 1460)
    public static final void method1038(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2465++;
        int var6 = (arg4 - 32) * arg4 / arg5;
        class34.field562[0].method1572(arg1, arg3);
        if (var6 < 8) {
            var6 = 8;
        }
        if (arg2 != 23) {
            field2462 = -5;
        }
        int var7 = (arg4 - var6 - 32) * arg0 / (arg5 - arg4);
        class34.field562[1].method1572(arg1, arg3 + arg4 - 16);
        if (!class217.field3516) {
            class96.method635(arg1, arg3 + 16, 16, arg4 - 32, class147.field2255);
            class96.method635(arg1, arg3 + var7 + 16, 16, var6, class229.field3739);
            class96.method630(arg1, arg3 + var7 + 16, var6, class195.field3119);
            class96.method630(arg1 + 1, arg3 - (-16 - var7), var6, class195.field3119);
            class96.method647(arg1, arg3 + var7 + 16, 16, class195.field3119);
            class96.method647(arg1, arg3 + var7 + 17, 16, class195.field3119);
            class96.method630(arg1 + 15, arg3 - -16 + var7, var6, class4.field68);
            class96.method630(arg1 + 14, arg3 + 17 + var7, var6 - 1, class4.field68);
            class96.method647(arg1, arg3 + var7 + var6 + 15, 16, class4.field68);
            class96.method647(arg1 + 1, var7 + 14 + var6 + arg3, 15, class4.field68);
            return;
        }
        class13.method78(arg1, arg3 + 16, 16, arg4 - 32, class147.field2255);
        class13.method78(arg1, arg3 - (-var7 - 16), 16, var6, class229.field3739);
        class13.method75(arg1, arg3 + var7 + 16, var6, class195.field3119);
        class13.method75(arg1 + 1, arg3 - -16 + var7, var6, class195.field3119);
        class13.method80(arg1, arg3 + var7 + 16, 16, class195.field3119);
        class13.method80(arg1, arg3 + var7 + 17, 16, class195.field3119);
        class13.method75(arg1 + 15, var7 + 16 + arg3, var6, class4.field68);
        class13.method75(arg1 + 14, arg3 + 17 + var7, var6 - 1, class4.field68);
        class13.method80(arg1, var7 + arg3 + var6 + 15, 16, class4.field68);
        class13.method80(arg1 + 1, arg3 - -var6 + 14 + var7, 15, class4.field68);
    }
}
