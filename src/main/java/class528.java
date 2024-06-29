import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class528 {

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Lqr;")
    private class65 field6999 = new class65(128);

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Lwu;")
    private class376 field7000;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Z")
    public static boolean field7004 = false;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "F")
    public static float field7009 = 0.0F;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Lqr;")
    public static class65 field6997 = new class65(8);

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "[S")
    public static short[] field7010 = new short[256];

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "[I")
    public static int[] field7007;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V", line = 12)
    public final void method2947(boolean arg0) {
        field7001++;
        class65 var2 = this.field6999;
        synchronized (this.field6999) {
            this.field6999.method561((byte) -78);
            if (!arg0) {
                field7004 = false;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 25)
    public static final void method2948(byte arg0) {
        if (arg0 != 46) {
            return;
        }
        field7006++;
        if (class341.field4807 == null) {
            return;
        }
        if (class24.field412) {
            class395.method2329(-787);
        }
        class277.field3864.method3876(28);
        class491.method2782();
        class586.method3207(-31736);
        class230.method1464(5123);
        class125.method990((byte) -125);
        class57.method378(-26894);
        if (class749.field10430 != null) {
            class749.field10430.method3764((byte) -21);
        }
        class45.method327((byte) 105);
        class1.method1(true);
        class225.method1440(1003);
        class466.method2638(-4);
        class26.method249(false, (byte) -128);
        for (int var1 = 0; var1 < 2048; var1++) {
            class383 var5 = class248.field3438[var1];
            if (var5 != null) {
                for (int var6 = 0; var6 < var5.field10315.length; var6++) {
                    var5.field10315[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class243.field3403; var2++) {
            class556 var3 = class302.field4281[var2].field2154;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field10315.length; var4++) {
                    var3.field10315[var4] = null;
                }
            }
        }
        class512.field6795 = null;
        class178.field2679 = null;
        class341.field4807.method487(58);
        class341.field4807 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)Z", line = 103)
    public static final boolean method2949(int arg0, int arg1, int arg2) {
        if (arg0 != 262144) {
            method2948((byte) -69);
        }
        field7005++;
        return class536.method2973(arg1, arg2, false) | (arg1 & 0x40000) != 0 || class548.method3062(arg2, 55, arg1);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)V", line = 115)
    public final void method2950(int arg0, byte arg1) {
        if (arg1 >= -42) {
            return;
        }
        field7008++;
        class65 var3 = this.field6999;
        synchronized (this.field6999) {
            this.field6999.method553(arg0, -15782);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)V", line = 128)
    public static void method2951(boolean arg0) {
        field6997 = null;
        if (!arg0) {
            method2951(true);
        }
        field7010 = null;
        field7007 = null;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V", line = 146)
    public final void method2952(byte arg0) {
        field6998++;
        class65 var2 = this.field6999;
        synchronized (this.field6999) {
            this.field6999.method558(0);
            if (arg0 != -105) {
                field7004 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)Lib;", line = 162)
    public final class155 method2953(int arg0, boolean arg1) {
        field7003++;
        class65 var3 = this.field6999;
        class155 var4;
        synchronized (this.field6999) {
            if (arg1) {
                field7010 = null;
            }
            var4 = (class155) this.field6999.method552(4, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field7000;
        byte[] var6;
        synchronized (this.field7000) {
            var6 = this.field7000.method2218((byte) 121, 1, arg0);
        }
        class155 var7 = new class155();
        if (var6 != null) {
            var7.method1124(new class677(var6), -113);
        }
        class65 var8 = this.field6999;
        synchronized (this.field6999) {
            this.field6999.method556((byte) 0, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lms;ILwu;)V", line = 196)
    public class528(class763 arg0, int arg1, class376 arg2) {
        this.field7000 = arg2;
        this.field7000.method2195(1, 0);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(Z)Z", line = 211)
    public static final boolean method2954(boolean arg0) throws IOException {
        field7002++;
        if (class209.field3089 == null) {
            return false;
        }
        if (class94.field1148 == null) {
            if (class617.field8247) {
                if (!class209.field3089.method1436(1, 1)) {
                    return false;
                }
                class209.field3089.method1435(class3.field63.field9399, 1, -127, 0);
                class574.field7540 = 0;
                class617.field8247 = false;
                class333.field4734++;
            }
            class3.field63.field9419 = 0;
            if (class3.field63.method1662(1682588262)) {
                if (!class209.field3089.method1436(1, 1)) {
                    return false;
                }
                class209.field3089.method1435(class3.field63.field9399, 1, -126, 1);
                class333.field4734++;
                class574.field7540 = 0;
            }
            class617.field8247 = true;
            class752[] var1 = class84.method651(-5);
            int var2 = class3.field63.method1657(-58);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class3.field63.field9419);
            }
            class94.field1148 = var1[var2];
            class732.field10143 = class94.field1148.field10490;
        }
        if (class732.field10143 == -1) {
            if (!class209.field3089.method1436(1, 1)) {
                return false;
            }
            class209.field3089.method1435(class3.field63.field9399, 1, -127, 0);
            class574.field7540 = 0;
            class333.field4734++;
            class732.field10143 = class3.field63.field9399[0] & 0xFF;
        }
        if (class732.field10143 == -2) {
            if (!class209.field3089.method1436(1, 2)) {
                return false;
            }
            class209.field3089.method1435(class3.field63.field9399, 2, -125, 0);
            class3.field63.field9419 = 0;
            class732.field10143 = class3.field63.method3807(-1);
            class574.field7540 = 0;
            class333.field4734 += 2;
        }
        if (class732.field10143 > 0) {
            if (!class209.field3089.method1436(1, class732.field10143)) {
                return false;
            }
            class3.field63.field9419 = 0;
            class209.field3089.method1435(class3.field63.field9399, class732.field10143, -128, 0);
            class333.field4734 += class732.field10143;
            class574.field7540 = 0;
        }
        class42.field552 = class513.field6809;
        class513.field6809 = class747.field10396;
        class747.field10396 = class94.field1148;
        if (class94.field1148 == class696.field9690) {
            class447.method2561(-12062);
            class272.method1633((byte) 77);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class2.field15) {
            int var3 = class3.field63.method3816(-102);
            int var4 = class3.field63.method3805((byte) 0);
            class447.method2561(-12062);
            class57.method379(var4, var3, 16);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class141.field2260) {
            int var5 = class3.field63.method3783((byte) -45);
            byte var6 = class3.field63.method3825(-124);
            class447.method2561(-12062);
            class223.method1427(var6, var5, (byte) 71);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class275.field3834) {
            class94.field1148 = null;
            return false;
        } else if (class94.field1148 == class60.field750) {
            class433.field5953 = class691.field9630;
            if (class732.field10143 == 0) {
                class31.field492 = null;
                class94.field1148 = null;
                class732.field10141 = null;
                class445.field6117 = null;
                class185.field2803 = 0;
                return true;
            }
            class445.field6117 = class3.field63.method3793(15598);
            boolean var7 = class3.field63.method3821((byte) 91) == 1;
            if (var7) {
                class3.field63.method3793(15598);
            }
            long var8 = class3.field63.method3820(1237129056);
            class31.field492 = class593.method3226(var8, 13754);
            class689.field9592 = class3.field63.method3811(66);
            int var10 = class3.field63.method3821((byte) -108);
            if (var10 == 255) {
                class94.field1148 = null;
                return true;
            }
            class185.field2803 = var10;
            class281[] var11 = new class281[100];
            for (int var12 = 0; var12 < class185.field2803; var12++) {
                var11[var12] = new class281();
                var11[var12].field3976 = class3.field63.method3793(15598);
                boolean var18 = class3.field63.method3821((byte) -102) == 1;
                if (var18) {
                    var11[var12].field3977 = class3.field63.method3793(15598);
                } else {
                    var11[var12].field3977 = var11[var12].field3976;
                }
                var11[var12].field3973 = class496.method2797(var11[var12].field3977, true);
                var11[var12].field3983 = class3.field63.method3807(-1);
                var11[var12].field3980 = class3.field63.method3811(104);
                var11[var12].field3972 = class3.field63.method3793(15598);
                if (var11[var12].field3977.equals(class472.field6475.field5334)) {
                    class670.field9146 = var11[var12].field3980;
                }
            }
            boolean var13 = false;
            int var14 = class185.field2803;
            while (var14 > 0) {
                boolean var15 = true;
                var14--;
                for (int var16 = 0; var16 < var14; var16++) {
                    if (var11[var16].field3973.compareTo(var11[var16 + 1].field3973) > 0) {
                        class281 var17 = var11[var16];
                        var11[var16] = var11[var16 + 1];
                        var15 = false;
                        var11[var16 + 1] = var17;
                    }
                }
                if (var15) {
                    break;
                }
            }
            class732.field10141 = var11;
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class11.field180) {
            int[] var19 = new int[4];
            for (int var20 = 0; var20 < 4; var20++) {
                var19[var20] = class3.field63.method3816(-102);
            }
            int var21 = class3.field63.method3782(128);
            int var22 = class3.field63.method3783((byte) -45);
            class134 var23 = (class134) class390.field5470.method2135((long) var21, (byte) 31);
            if (var23 != null) {
                class376.method2213((byte) 123, var19, var23.field2154, var22);
            }
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class225.field3206) {
            int var24 = class3.field63.method3805((byte) 0);
            class447.method2561(-12062);
            class8 var25 = (class8) class350.field4925.method2135((long) var24, (byte) 31);
            if (var25 != null) {
                class710.method3990(false, false, true, var25);
            }
            if (class420.field5787 != null) {
                class399.method2347(class420.field5787, 2260);
                class420.field5787 = null;
            }
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class171.field2621) {
            class3.field63.field9419 += 28;
            if (class3.field63.method3835(0)) {
                class427.method2466(class3.field63.field9419 - 28, class3.field63, 93);
            }
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class243.field3402) {
            boolean var26 = class3.field63.method3821((byte) -93) == 1;
            byte[] var27 = new byte[class732.field10143 - 1];
            class3.field63.method3801(var27, 0, class732.field10143 - 1, 114);
            class485.method2740(var26, -1, var27);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class551.field7270) {
            class698.method3932(class422.field5816, (byte) -42);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class595.field7744) {
            int var28 = class3.field63.method3791(true);
            int var29 = class3.field63.method3816(-120) << 2;
            int var30 = class3.field63.method3821((byte) 105);
            int var31 = class3.field63.method3821((byte) 96);
            int var32 = class3.field63.method3815((byte) -122);
            class447.method2561(-12062);
            class725.method4081(true, (byte) -118, var31, var28, var32, var29, var30);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class573.field7525) {
            int var33 = class3.field63.method3817(712071856);
            int var34 = class3.field63.method3799(!arg0);
            int var35 = class3.field63.method3810((byte) 97);
            class447.method2561(-12062);
            class213.method1401(var34, var35, var33, (byte) 119);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class307.field4414) {
            int var36 = class3.field63.method3807(-1);
            int var37 = class3.field63.method3821((byte) 122);
            boolean var38 = (var37 & 0x1) == 1;
            while (class3.field63.field9419 < class732.field10143) {
                int var39 = class3.field63.method3790((byte) 22);
                int var40 = class3.field63.method3807(-1);
                int var41 = 0;
                if (var40 != 0) {
                    var41 = class3.field63.method3821((byte) 121);
                    if (var41 == 255) {
                        var41 = class3.field63.method3799(false);
                    }
                }
                class470.method2649(var38, var39, var41, (byte) -107, var36, var40 - 1);
            }
            class475.field6511[class48.method346(class392.field5479++, 31)] = var36;
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class217.field3139) {
            int var42 = class3.field63.method3821((byte) -98);
            int var43 = var42 >> 5;
            int var44 = var42 & 0x1F;
            if (var44 == 0) {
                class27.field435[var43] = null;
                class94.field1148 = null;
                return true;
            }
            class317 var45 = new class317();
            var45.field4526 = var44;
            var45.field4524 = class3.field63.method3821((byte) -76);
            if (var45.field4524 >= 0 && var45.field4524 < class308.field4434.length) {
                if (var45.field4526 == 1 || var45.field4526 == 10) {
                    var45.field4521 = class3.field63.method3807(-1);
                    class3.field63.field9419 += 6;
                } else if (var45.field4526 >= 2 && var45.field4526 <= 6) {
                    if (var45.field4526 == 2) {
                        var45.field4516 = 256;
                        var45.field4520 = 256;
                    }
                    if (var45.field4526 == 3) {
                        var45.field4520 = 256;
                        var45.field4516 = 0;
                    }
                    if (var45.field4526 == 4) {
                        var45.field4520 = 256;
                        var45.field4516 = 512;
                    }
                    if (var45.field4526 == 5) {
                        var45.field4516 = 256;
                        var45.field4520 = 0;
                    }
                    if (var45.field4526 == 6) {
                        var45.field4516 = 256;
                        var45.field4520 = 512;
                    }
                    var45.field4526 = 2;
                    var45.field4517 = class3.field63.method3821((byte) -76);
                    var45.field4516 += class3.field63.method3807(-1) - class503.field6752 << 9;
                    var45.field4520 += class3.field63.method3807(-1) - class334.field4757 << 9;
                    var45.field4522 = class3.field63.method3821((byte) 122) << 2;
                    var45.field4525 = class3.field63.method3807(-1);
                }
                var45.field4515 = class3.field63.method3807(-1);
                if (var45.field4515 == 65535) {
                    var45.field4515 = -1;
                }
                class27.field435[var43] = var45;
            }
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class591.field7694) {
            int var46 = class3.field63.method3805((byte) 0);
            int var47 = class3.field63.method3777((byte) -126);
            int var48 = class3.field63.method3809(true);
            class447.method2561(-12062);
            class240.method1507(var46, (byte) 100, 5, var48, var47);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class676.field9377) {
            int var49 = class3.field63.method3777((byte) -105);
            if (class299.field4256 != var49) {
                class299.field4256 = var49;
                class182.method1258(class614.field8168, -1, -1);
            }
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class5.field128) {
            int var50 = class3.field63.method3821((byte) -21);
            int var51 = class3.field63.method3821((byte) 120);
            int var52 = class3.field63.method3783((byte) -45);
            int var53 = class3.field63.method3816(-119) << 2;
            int var54 = class3.field63.method3815((byte) -124);
            class447.method2561(-12062);
            class207.method1381(var50, var53, var54, var52, var51, -117);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class681.field9518) {
            class698.method3932(class375.field5198, (byte) -59);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class137.field2174) {
            class339.method2036(63, class367.field5144);
            class94.field1148 = null;
            return false;
        } else if (class94.field1148 == class734.field10158) {
            class131.field2144 = class3.field63.method3802(20198);
            class375.field5199 = class3.field63.method3821((byte) -61) == 1;
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class566.field7444) {
            class339.method2036(47, false);
            class94.field1148 = null;
            return false;
        } else if (class94.field1148 == class561.field7364) {
            class97.field1204 = 1;
            class241.field3387 = class691.field9630;
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class343.field4825) {
            int var55 = class3.field63.method3777((byte) -64);
            int var56 = class3.field63.method3805((byte) 0);
            class447.method2561(-12062);
            class8 var57 = (class8) class350.field4925.method2135((long) var56, (byte) 31);
            class8 var58 = (class8) class350.field4925.method2135((long) var55, (byte) 31);
            if (var58 != null) {
                class710.method3990(false, false, var57 == null || var57.field161 != var58.field161, var58);
            }
            if (var57 != null) {
                var57.method3564(true);
                class350.field4925.method2143(-1, var57, (long) var55);
            }
            class672 var59 = class21.method225(65535, var56);
            if (var59 != null) {
                class399.method2347(var59, 2260);
            }
            class672 var60 = class21.method225(65535, var55);
            if (var60 != null) {
                class399.method2347(var60, 2260);
                class312.method1914(true, (byte) 100, var60);
            }
            if (class443.field6101 != -1) {
                class2.method18(1, class443.field6101, (byte) 124);
            }
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class631.field8411) {
            class489.field6643 = class3.field63.method3821((byte) 82);
            class94.field1148 = null;
            class101.field1416 = class691.field9630;
            return true;
        } else if (class94.field1148 == class359.field5021) {
            class428.method2473((byte) -89);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class317.field4523) {
            String var61 = class3.field63.method3793(15598);
            String var62 = class747.method4184(-23, class284.method1764(class3.field63, (byte) 101));
            class494.method2789(0, var62, var61, (byte) -15, var61, var61, 6);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class668.field9115) {
            class402.method2367(class3.field63, class732.field10143, (byte) 58, class66.field828);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class411.field5698) {
            class107.method787(0);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class100.field1296) {
            class229.field3263 = class3.field63.method3771((byte) -10);
            class101.field1416 = class691.field9630;
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class104.field1433) {
            int var63 = class3.field63.method3807(-1);
            int var64 = class3.field63.method3826(-1893167880);
            class447.method2561(-12062);
            class243.method1515(var63, var64, -2);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class110.field1516) {
            class698.method3932(class470.field6437, (byte) -13);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class750.field10443) {
            int var65 = class3.field63.method3807(-1);
            if (var65 == 65535) {
                var65 = -1;
            }
            int var66 = class3.field63.method3821((byte) -18);
            int var67 = class3.field63.method3807(-1);
            int var68 = class3.field63.method3821((byte) 71);
            int var69 = class3.field63.method3807(-1);
            class594.method3228(var69, (byte) 46, var65, var67, var68, var66);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class143.field2289) {
            int var70 = class3.field63.method3809(true);
            String var71 = class3.field63.method3793(15598);
            class447.method2561(-12062);
            class4.method71(var70, 16504, var71);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class180.field2721) {
            class165.field2499 = class3.field63.method3768((byte) 97);
            if (class165.field2499 == 0 || class165.field2499 == 1) {
                class404.field5629 = true;
            }
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class57.field688) {
            class694.field9657 = class3.field63.method3821((byte) 99);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class555.field7293) {
            class698.method3932(class719.field10015, (byte) -13);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class111.field1617) {
            byte var72 = class3.field63.method3834(-8996);
            int var73 = class3.field63.method3807(-1);
            class74.field901.method4071(-126, var73, var72);
            class94.field1148 = null;
            return true;
        } else if (class94.field1148 == class390.field5471) {
            int var74 = class3.field63.method3799(false);
            int var75 = var74 >> 28 & 0x3;
            int var76 = var74 >> 14 & 0x3FFF;
            int var77 = var74 & 0x3FFF;
            int var78 = class3.field63.method3821((byte) 72);
            int var79 = var78 >> 2;
            int var80 = var78 & 0x3;
            int var81 = class48.field605[var79];
            int var82 = class3.field63.method3816(-106);
            int var83 = var77 - class334.field4757;
            int var84 = var76 - class503.field6752;
            if (var82 == 65535) {
                var82 = -1;
            }
            class686.method3864(-24938, var81, var83, var82, var84, var80, var75, var79);
            class94.field1148 = null;
            return true;
        } else {
            if (!arg0) {
                method2951(true);
            }
            if (class94.field1148 == class4.field117) {
                for (int var85 = 0; var85 < class248.field3438.length; var85++) {
                    if (class248.field3438[var85] != null) {
                        class248.field3438[var85].field10227 = null;
                        class248.field3438[var85].field10257 = -1;
                    }
                }
                for (int var86 = 0; var86 < class243.field3403; var86++) {
                    class302.field4281[var86].field2154.field10227 = null;
                    class302.field4281[var86].field2154.field10257 = -1;
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class480.field6580) {
                int var87 = class3.field63.method3821((byte) -73);
                boolean var88 = (var87 & 0x1) == 1;
                String var89 = class3.field63.method3793(15598);
                String var90 = class3.field63.method3793(15598);
                if (var90.equals("")) {
                    var90 = var89;
                }
                String var91 = class3.field63.method3793(15598);
                String var92 = class3.field63.method3793(15598);
                if (var92.equals("")) {
                    var92 = var91;
                }
                if (var88) {
                    for (int var93 = 0; var93 < class543.field7184; var93++) {
                        if (class310.field4452[var93].equals(var92)) {
                            class756.field10526[var93] = var89;
                            class310.field4452[var93] = var90;
                            class13.field202[var93] = var91;
                            class316.field4506[var93] = var92;
                            break;
                        }
                    }
                } else {
                    class756.field10526[class543.field7184] = var89;
                    class310.field4452[class543.field7184] = var90;
                    class13.field202[class543.field7184] = var91;
                    class316.field4506[class543.field7184] = var92;
                    class414.field5732[class543.field7184] = class48.method346(2, var87) == 2;
                    class543.field7184++;
                }
                class241.field3387 = class691.field9630;
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class260.field3628) {
                int var94 = class3.field63.method3816(-103);
                if (var94 == 65535) {
                    var94 = -1;
                }
                int var95 = class3.field63.method3826(-1893167880);
                int var96 = class3.field63.method3782(128);
                if (var96 == 65535) {
                    var96 = -1;
                }
                int var97 = class3.field63.method3782(128);
                class447.method2561(-12062);
                for (int var98 = var96; var98 <= var94; var98++) {
                    long var99 = ((long) var95 << 32) + (long) var98;
                    class200 var101 = (class200) class33.field501.method2135(var99, (byte) 31);
                    class200 var102;
                    if (var101 != null) {
                        var102 = new class200(var101.field3004, var97);
                        var101.method3564(true);
                    } else if (var98 == -1) {
                        var102 = new class200(class21.method225(65535, var95).field9265.field3004, var97);
                    } else {
                        var102 = new class200(0, var97);
                    }
                    class33.field501.method2143(-1, var102, var99);
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class223.field3164) {
                if (class239.method1501((byte) -14, class15.field215)) {
                    class397.field5539 = (int) ((float) class3.field63.method3807(-1) * 2.5F);
                } else {
                    class397.field5539 = class3.field63.method3807(-1) * 30;
                }
                class94.field1148 = null;
                class101.field1416 = class691.field9630;
                return true;
            } else if (class94.field1148 == class354.field4986) {
                int var103 = class3.field63.method3807(-1);
                class383 var104;
                if (class303.field4293 == var103) {
                    var104 = class472.field6475;
                } else {
                    var104 = class248.field3438[var103];
                }
                if (var104 == null) {
                    class94.field1148 = null;
                    return true;
                }
                int var105 = class3.field63.method3807(-1);
                int var106 = class3.field63.method3821((byte) 116);
                boolean var107 = (var105 & 0x8000) != 0;
                if (var104.field5334 != null && var104.field5333 != null) {
                    boolean var108 = false;
                    if (var106 <= 1) {
                        if (!var107 && !(!class375.field5199 || class662.field8730) || class433.field5956) {
                            var108 = true;
                        } else if (class36.method294(124, var104.field5334)) {
                            var108 = true;
                        }
                    }
                    if (!var108 && class328.field4681 == 0) {
                        int var109 = -1;
                        String var111;
                        if (var107) {
                            var105 &= 0x7FFF;
                            class617 var110 = class536.method2975((byte) -13, class3.field63);
                            var109 = var110.field8249;
                            var111 = var110.field8243.method2477(class3.field63, (byte) 113);
                        } else {
                            var111 = class747.method4184(-107, class284.method1764(class3.field63, (byte) 101));
                        }
                        var104.field10267 = var111.trim();
                        var104.field10294 = 150;
                        var104.field10271 = var105 >> 8;
                        var104.field10275 = var105 & 0xFF;
                        int var112;
                        if (var106 == 1 || var106 == 2) {
                            var112 = var107 ? 17 : 1;
                        } else {
                            var112 = var107 ? 17 : 2;
                        }
                        if (var106 == 2) {
                            class31.method272(null, var111, var104.field5339, 0, 85, var112, "<img=1>" + var104.method2264((byte) -115, false), "<img=1>" + var104.method2267(-116, true), var109);
                        } else if (var106 == 1) {
                            class31.method272(null, var111, var104.field5339, 0, 82, var112, "<img=0>" + var104.method2264((byte) 92, false), "<img=0>" + var104.method2267(-116, true), var109);
                        } else {
                            class31.method272(null, var111, var104.field5339, 0, 65, var112, var104.method2264((byte) 49, false), var104.method2267(-116, true), var109);
                        }
                    }
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class359.field5043) {
                int var113 = class3.field63.method3807(-1);
                if (var113 == 65535) {
                    var113 = -1;
                }
                int var114 = class3.field63.method3821((byte) -68);
                int var115 = class3.field63.method3807(-1);
                int var116 = class3.field63.method3821((byte) 77);
                class291.method1804(false, var116, var114, var113, 256, true, var115);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class50.field636) {
                class543.field7184 = class3.field63.method3821((byte) -55);
                for (int var117 = 0; var117 < class543.field7184; var117++) {
                    class756.field10526[var117] = class3.field63.method3793(15598);
                    class310.field4452[var117] = class3.field63.method3793(15598);
                    if (class310.field4452[var117].equals("")) {
                        class310.field4452[var117] = class756.field10526[var117];
                    }
                    class13.field202[var117] = class3.field63.method3793(15598);
                    class316.field4506[var117] = class3.field63.method3793(15598);
                    if (class316.field4506[var117].equals("")) {
                        class316.field4506[var117] = class13.field202[var117];
                    }
                    class414.field5732[var117] = false;
                }
                class94.field1148 = null;
                class241.field3387 = class691.field9630;
                return true;
            } else if (class94.field1148 == class526.field6979) {
                int var118 = class3.field63.method3799(!arg0);
                String var119 = class3.field63.method3793(15598);
                class447.method2561(-12062);
                class377.method2231(var119, var118, -120);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class128.field2103) {
                int var120 = class3.field63.method3799(false);
                class447.method2561(-12062);
                class240.method1507(-1, (byte) 100, 3, -1, var120);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class712.field9852) {
                boolean var121 = class3.field63.method3791(arg0) == 1;
                class447.method2561(-12062);
                class635.field8451 = var121;
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class648.field8616) {
                int var122 = class3.field63.method3783((byte) -45);
                int var123 = class3.field63.method3777((byte) -64);
                class447.method2561(-12062);
                class423.method2451(var122, (byte) 20, var123);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class392.field5480) {
                class257.field3520 = class3.field63.method3821((byte) -60);
                class53.field655 = class3.field63.method3811(39) << 3;
                class324.field4606 = class3.field63.method3768((byte) 102) << 3;
                for (class635 var124 = (class635) class649.field8627.method2144(arg0); var124 != null; var124 = (class635) class649.field8627.method2146(false)) {
                    int var127 = (int) (var124.field8680 >> 28 & 0x3L);
                    int var128 = (int) (var124.field8680 & 0x3FFFL);
                    int var129 = var128 - class503.field6752;
                    int var130 = (int) (var124.field8680 >> 14 & 0x3FFFL);
                    int var131 = var130 - class334.field4757;
                    if (class257.field3520 == var127 && class324.field4606 <= var129 && (class324.field4606 + 8) > var129 && class53.field655 <= var131 && var131 < class53.field655 + 8) {
                        var124.method3564(true);
                        if (var129 >= 0 && var131 >= 0 && class719.field10004 > var129 && var131 < class107.field1453) {
                            class709.method3985(var129, class257.field3520, var131, (byte) 28);
                        }
                    }
                }
                for (class302 var125 = (class302) class409.field5677.method21(2); var125 != null; var125 = (class302) class409.field5677.method9(-128)) {
                    if (class324.field4606 <= var125.field4286 && class324.field4606 + 8 > var125.field4286 && class53.field655 <= var125.field4289 && var125.field4289 < (class53.field655 + 8) && class257.field3520 == var125.field4283) {
                        var125.field4288 = true;
                    }
                }
                for (class302 var126 = (class302) class271.field3785.method21(2); var126 != null; var126 = (class302) class271.field3785.method9(-127)) {
                    if (var126.field4286 >= class324.field4606 && var126.field4286 < (class324.field4606 + 8) && var126.field4289 >= class53.field655 && var126.field4289 < class53.field655 + 8 && class257.field3520 == var126.field4283) {
                        var126.field4288 = true;
                    }
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class276.field3841) {
                int var132 = class3.field63.method3805((byte) 0);
                int var133 = class3.field63.method3782(128);
                class74.field901.method4071(57, var133, var132);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class427.field5893) {
                int var134 = class3.field63.method3807(-1);
                class447.method2561(-12062);
                class501.method2820(8718, var134);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class183.field2766) {
                class698.method3932(class631.field8409, (byte) -53);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class352.field4947) {
                int var135 = class3.field63.method3816(-113);
                if (var135 == 65535) {
                    var135 = -1;
                }
                int var136 = class3.field63.method3799(false);
                class447.method2561(-12062);
                class240.method1507(-1, (byte) 100, 1, var135, var136);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class178.field2680) {
                String var137 = class3.field63.method3793(15598);
                Object[] var138 = new Object[var137.length() + 1];
                for (int var139 = var137.length() - 1; var139 >= 0; var139--) {
                    if (var137.charAt(var139) == 's') {
                        var138[var139 + 1] = class3.field63.method3793(15598);
                    } else {
                        var138[var139 + 1] = Integer.valueOf(class3.field63.method3799(false));
                    }
                }
                var138[0] = Integer.valueOf(class3.field63.method3799(false));
                class447.method2561(-12062);
                class309 var140 = new class309();
                var140.field4439 = var138;
                class182.method1249(var140);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class225.field3203) {
                int var141 = class3.field63.method3807(-1);
                int var142 = class3.field63.method3821((byte) 69);
                class74.field901.method4074(var141, 104, var142);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class116.field1874) {
                class698.method3932(class9.field164, (byte) -38);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class14.field207) {
                int var143 = class3.field63.method3805((byte) 0);
                class447.method2561(-12062);
                class94.field1148 = null;
                if (var143 == -1) {
                    class12.field193 = -1;
                    class264.field3680 = -1;
                } else {
                    int var144 = var143 >> 14 & 0x3FFF;
                    int var145 = var143 & 0x3FFF;
                    int var146 = var144 - class503.field6752;
                    if (var146 < 0) {
                        var146 = 0;
                    } else if (var146 >= class719.field10004) {
                        var146 = class719.field10004;
                    }
                    int var147 = var145 - class334.field4757;
                    if (var147 < 0) {
                        var147 = 0;
                    } else if (class107.field1453 <= var147) {
                        var147 = class107.field1453;
                    }
                    class264.field3680 = (var146 << 9) + 256;
                    class12.field193 = (var147 << 9) + 256;
                }
                return true;
            } else if (class94.field1148 == class113.field1861) {
                int var148 = class3.field63.method3821((byte) 110);
                int var149 = class3.field63.method3809(true);
                class447.method2561(-12062);
                class636.method3490(var148, 66, var149, true);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class250.field3441) {
                class324.field4606 = class3.field63.method3825(-78) << 3;
                class53.field655 = class3.field63.method3768((byte) 104) << 3;
                class257.field3520 = class3.field63.method3815((byte) 42);
                while (class3.field63.field9419 < class732.field10143) {
                    class582 var150 = class716.method4008(-121)[class3.field63.method3821((byte) -123)];
                    class698.method3932(var150, (byte) -65);
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class322.field4586) {
                int var151 = class3.field63.method3799(false);
                int var152 = class3.field63.method3807(-1);
                if (var152 == 65535) {
                    var152 = -1;
                }
                int var153 = class3.field63.method3826(-1893167880);
                class447.method2561(-12062);
                class437.method2513(var151, var153, var152, (byte) -74);
                class597 var154 = class77.field948.method1165((byte) 68, var152);
                class719.method4029(var153, 21, var154.field7803, var154.field7768, var154.field7842);
                class621.method3418(var154.field7809, var154.field7772, var154.field7785, var153, -18978);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class427.field5881) {
                int var155 = class3.field63.method3815((byte) 88);
                int var156 = class3.field63.method3815((byte) 6);
                if (var155 == 255) {
                    var156 = -1;
                    var155 = -1;
                }
                class300.method1842(-94, var155, var156);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class445.field6115) {
                class671.method3702(31114, class3.field63, class732.field10143);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class343.field4827) {
                while (class3.field63.field9419 < class732.field10143) {
                    boolean var167 = class3.field63.method3821((byte) -101) == 1;
                    String var168 = class3.field63.method3793(15598);
                    String var169 = class3.field63.method3793(15598);
                    int var170 = class3.field63.method3807(-1);
                    int var171 = class3.field63.method3821((byte) 71);
                    String var172 = "";
                    boolean var173 = false;
                    if (var170 > 0) {
                        var172 = class3.field63.method3793(15598);
                        var173 = class3.field63.method3821((byte) 114) == 1;
                    }
                    for (int var174 = 0; var174 < client.field4355; var174++) {
                        if (var167) {
                            if (var169.equals(class549.field7252[var174])) {
                                class549.field7252[var174] = var168;
                                var168 = null;
                                class238.field3361[var174] = var169;
                                break;
                            }
                        } else if (var168.equals(class549.field7252[var174])) {
                            if (class458.field6255[var174] != var170) {
                                boolean var175 = true;
                                for (class22 var176 = (class22) class407.field5653.method3874((byte) 84); var176 != null; var176 = (class22) class407.field5653.method3868(-24951)) {
                                    if (var176.field396.equals(var168)) {
                                        if (var170 != 0 && var176.field397 == 0) {
                                            var176.method2815(-124);
                                            var175 = false;
                                        } else if (var170 == 0 && var176.field397 != 0) {
                                            var175 = false;
                                            var176.method2815(-120);
                                        }
                                    }
                                }
                                if (var175) {
                                    class407.field5653.method3870(new class22(var168, var170), 0);
                                }
                                class458.field6255[var174] = var170;
                            }
                            class238.field3361[var174] = var169;
                            class88.field1077[var174] = var172;
                            class575.field7555[var174] = var171;
                            var168 = null;
                            class661.field8720[var174] = var173;
                            break;
                        }
                    }
                    if (var168 != null && client.field4355 < 200) {
                        class549.field7252[client.field4355] = var168;
                        class238.field3361[client.field4355] = var169;
                        class458.field6255[client.field4355] = var170;
                        class88.field1077[client.field4355] = var172;
                        class575.field7555[client.field4355] = var171;
                        class661.field8720[client.field4355] = var173;
                        client.field4355++;
                    }
                }
                class97.field1204 = 2;
                class241.field3387 = class691.field9630;
                boolean var157 = false;
                int var158 = client.field4355;
                while (var158 > 0) {
                    boolean var159 = true;
                    var158--;
                    for (int var160 = 0; var160 < var158; var160++) {
                        if (class458.field6255[var160] != class284.field4030.field7338 && class458.field6255[var160 + 1] == class284.field4030.field7338 || class458.field6255[var160] == 0 && class458.field6255[var160 + 1] != 0) {
                            int var161 = class458.field6255[var160];
                            class458.field6255[var160] = class458.field6255[var160 + 1];
                            class458.field6255[var160 + 1] = var161;
                            String var162 = class88.field1077[var160];
                            class88.field1077[var160] = class88.field1077[var160 + 1];
                            class88.field1077[var160 + 1] = var162;
                            String var163 = class549.field7252[var160];
                            class549.field7252[var160] = class549.field7252[var160 + 1];
                            class549.field7252[var160 + 1] = var163;
                            String var164 = class238.field3361[var160];
                            class238.field3361[var160] = class238.field3361[var160 + 1];
                            class238.field3361[var160 + 1] = var164;
                            int var165 = class575.field7555[var160];
                            class575.field7555[var160] = class575.field7555[var160 + 1];
                            class575.field7555[var160 + 1] = var165;
                            boolean var166 = class661.field8720[var160];
                            class661.field8720[var160] = class661.field8720[var160 + 1];
                            var159 = false;
                            class661.field8720[var160 + 1] = var166;
                        }
                    }
                    if (var159) {
                        break;
                    }
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class183.field2778) {
                int var177 = class3.field63.method3805((byte) 0);
                int var178 = class3.field63.method3810((byte) 97);
                class447.method2561(-12062);
                class595.method3231((byte) 91, var178, var177);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class370.field5159) {
                class698.method3932(class599.field7851, (byte) -112);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class207.field3071) {
                int var179 = class3.field63.method3777((byte) -112);
                int var180 = class3.field63.method3782(128);
                class447.method2561(-12062);
                class660.method3581(var179, (byte) -111, var180);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class283.field4001) {
                class447.method2561(-12062);
                class265.method1605(-1);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class51.field644) {
                String var181 = class3.field63.method3793(15598);
                int var182 = class3.field63.method3807(-1);
                String var183 = class658.field8695.method3326(true, var182).method2477(class3.field63, (byte) 106);
                class31.method272(null, var183, var181, 0, 108, 19, var181, var181, var182);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class650.field8632) {
                class324.field4606 = class3.field63.method3811(43) << 3;
                class257.field3520 = class3.field63.method3815((byte) -121);
                class53.field655 = class3.field63.method3811(99) << 3;
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class79.field958) {
                int var184 = class3.field63.method3816(-106);
                int var185 = class3.field63.method3782(128);
                class447.method2561(-12062);
                class164.method1178(var184, var185, false, 0);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class6.field135) {
                int var186 = class3.field63.method3815((byte) -119);
                class447.method2561(-12062);
                class41.field550 = var186;
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class251.field3464) {
                String var187 = class3.field63.method3793(15598);
                boolean var188 = class3.field63.method3821((byte) -24) == 1;
                String var189;
                if (var188) {
                    var189 = class3.field63.method3793(15598);
                } else {
                    var189 = var187;
                }
                int var190 = class3.field63.method3807(-1);
                byte var191 = class3.field63.method3811(83);
                boolean var192 = false;
                if (var191 == -128) {
                    var192 = true;
                }
                if (var192) {
                    if (class185.field2803 == 0) {
                        class94.field1148 = null;
                        return true;
                    }
                    boolean var198 = false;
                    int var199;
                    for (var199 = 0; var199 < class185.field2803 && (!class732.field10141[var199].field3977.equals(var189) || class732.field10141[var199].field3983 != var190); var199++) {
                    }
                    if (class185.field2803 > var199) {
                        while ((class185.field2803 - 1) > var199) {
                            class732.field10141[var199] = class732.field10141[var199 + 1];
                            var199++;
                        }
                        class185.field2803--;
                        class732.field10141[class185.field2803] = null;
                    }
                } else {
                    String var193 = class3.field63.method3793(15598);
                    class281 var194 = new class281();
                    var194.field3976 = var187;
                    var194.field3977 = var189;
                    var194.field3973 = class496.method2797(var194.field3977, true);
                    var194.field3972 = var193;
                    var194.field3983 = var190;
                    var194.field3980 = var191;
                    int var195;
                    for (var195 = class185.field2803 - 1; var195 >= 0; var195--) {
                        int var196 = class732.field10141[var195].field3973.compareTo(var194.field3973);
                        if (var196 == 0) {
                            class732.field10141[var195].field3983 = var190;
                            class732.field10141[var195].field3980 = var191;
                            class732.field10141[var195].field3972 = var193;
                            if (var189.equals(class472.field6475.field5334)) {
                                class670.field9146 = var191;
                            }
                            class94.field1148 = null;
                            class433.field5953 = class691.field9630;
                            return true;
                        }
                        if (var196 < 0) {
                            break;
                        }
                    }
                    if (class185.field2803 >= class732.field10141.length) {
                        class94.field1148 = null;
                        return true;
                    }
                    for (int var197 = class185.field2803 - 1; var197 > var195; var197--) {
                        class732.field10141[var197 + 1] = class732.field10141[var197];
                    }
                    if (class185.field2803 == 0) {
                        class732.field10141 = new class281[100];
                    }
                    class732.field10141[var195 + 1] = var194;
                    class185.field2803++;
                    if (var189.equals(class472.field6475.field5334)) {
                        class670.field9146 = var191;
                    }
                }
                class433.field5953 = class691.field9630;
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class563.field7373) {
                int var200 = class3.field63.method3807(-1);
                if (var200 == 65535) {
                    var200 = -1;
                }
                int var201 = class3.field63.method3805((byte) 0);
                class447.method2561(-12062);
                class240.method1507(-1, (byte) 100, 2, var200, var201);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class305.field4386) {
                class643.field8558 = class732.field10143 > 2 ? class3.field63.method3793(15598) : class517.field6866.method2877(class713.field9854, (byte) -108);
                class721.field10041 = class732.field10143 > 0 ? class3.field63.method3807(-1) : -1;
                class94.field1148 = null;
                if (class721.field10041 == 65535) {
                    class721.field10041 = -1;
                }
                return true;
            } else if (class94.field1148 == class668.field9125) {
                int var202 = class3.field63.method3799(false);
                int var203 = class3.field63.method3809(true);
                int var204 = class3.field63.method3816(-112);
                class447.method2561(-12062);
                class397.method2331((byte) 91, var202, (var204 << 16) + var203);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class537.field7070) {
                int var205 = class3.field63.method3809(true);
                int var206 = class3.field63.method3805((byte) 0);
                int var207 = class3.field63.method3821((byte) 84);
                class447.method2561(-12062);
                class8 var208 = (class8) class350.field4925.method2135((long) var206, (byte) 31);
                if (var208 != null) {
                    class710.method3990(!arg0, false, var208.field161 != var205, var208);
                }
                class416.method2415(var207, var205, var206, (byte) -55, false);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class28.field436) {
                class719.field10021 = class3.field63.method3815((byte) 1);
                class730.field10124 = class3.field63.method3783((byte) -45);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class562.field7368) {
                int var209 = class3.field63.method3821((byte) -49);
                int var210 = class3.field63.method3799(false);
                int var211 = class3.field63.method3816(-113);
                int var212 = class3.field63.method3807(-1);
                int var213 = class3.field63.method3782(128);
                int var214 = class3.field63.method3783((byte) -45);
                int var215 = var214 & 0x7;
                int var216 = (var214 & 0x7A) >> 3;
                if (var216 == 15) {
                    var216 = -1;
                }
                if (var210 >> 30 != 0) {
                    int var246 = (var210 & 0x3C2D2CE3) >> 28;
                    int var247 = (var210 >> 14 & 0x3FFF) - class503.field6752;
                    int var248 = (var210 & 0x3FFF) - class334.field4757;
                    if (var247 >= 0 && var248 >= 0 && var247 < class719.field10004 && class107.field1453 > var248) {
                        int var249 = var247 * 512 + 256;
                        int var250 = var248 * 512 + 256;
                        int var251 = var246;
                        if (var246 < 3 && class498.method2810(-10387, var247, var248)) {
                            var251 = var246 + 1;
                        }
                        class628 var252 = new class628(var211, var213, class29.field474, var246, var251, var249, class153.method1118(var250, var249, 27, var246) - var212, var250, var247, var247, var248, var248, var215);
                        class141.field2256.method11(new class9(var252), -95);
                    }
                } else if (var210 >> 29 != 0) {
                    int var231 = var210 & 0xFFFF;
                    class134 var232 = (class134) class390.field5470.method2135((long) var231, (byte) 31);
                    if (var232 != null) {
                        class556 var233 = var232.field2154;
                        if (var211 == 65535) {
                            var211 = -1;
                        }
                        class463 var234 = var233.field10254[var209];
                        boolean var235 = true;
                        int var236 = var234.field6361;
                        if (var211 != -1 && var236 != -1) {
                            if (var211 == var236) {
                                class94 var237 = class226.field3216.method3929(var211, -1);
                                if (var237.field1132 && var237.field1140 != -1) {
                                    class456 var238 = class509.field6780.method663((byte) -90, var237.field1140);
                                    int var239 = var238.field6214;
                                    if (var239 == 0 || var239 == 2) {
                                        var235 = false;
                                    } else if (var239 == 1) {
                                        var235 = true;
                                    }
                                }
                            } else {
                                class94 var240 = class226.field3216.method3929(var211, -1);
                                class94 var241 = class226.field3216.method3929(var236, -1);
                                if (var240.field1140 != -1 && var241.field1140 != -1) {
                                    class456 var242 = class509.field6780.method663((byte) -90, var240.field1140);
                                    class456 var243 = class509.field6780.method663((byte) -90, var241.field1140);
                                    if (var243.field6213 > var242.field6213) {
                                        var235 = false;
                                    }
                                }
                            }
                        }
                        if (var235) {
                            var234.field6366 = 0;
                            var234.field6365 = 0;
                            var234.field6361 = var211;
                            var234.field6363 = var212;
                            var234.field6360 = 1;
                            var234.field6362 = class29.field474 + var213;
                            var234.field6368 = var216;
                            var234.field6364 = var215;
                            if (var234.field6362 > class29.field474) {
                                var234.field6366 = -1;
                            }
                            if (var234.field6361 == 65535) {
                                var234.field6361 = -1;
                            }
                            if (var234.field6361 != -1 && class29.field474 == var234.field6362) {
                                int var244 = class226.field3216.method3929(var234.field6361, -1).field1140;
                                if (var244 != -1) {
                                    class456 var245 = class509.field6780.method663((byte) -90, var244);
                                    if (var245 != null && var245.field6229 != null && !var233.field10252) {
                                        class514.method2871(var245, 0, var233, true);
                                    }
                                }
                            }
                        }
                    }
                } else if (var210 >> 28 != 0) {
                    int var217 = var210 & 0xFFFF;
                    class383 var218;
                    if (class303.field4293 == var217) {
                        var218 = class472.field6475;
                    } else {
                        var218 = class248.field3438[var217];
                    }
                    if (var218 != null) {
                        class463 var219 = var218.field10254[var209];
                        if (var211 == 65535) {
                            var211 = -1;
                        }
                        boolean var220 = true;
                        int var221 = var219.field6361;
                        if (var211 != -1 && var221 != -1) {
                            if (var211 == var221) {
                                class94 var222 = class226.field3216.method3929(var211, -1);
                                if (var222.field1132 && var222.field1140 != -1) {
                                    class456 var223 = class509.field6780.method663((byte) -90, var222.field1140);
                                    int var224 = var223.field6214;
                                    if (var224 == 0 || var224 == 2) {
                                        var220 = false;
                                    } else if (var224 == 1) {
                                        var220 = true;
                                    }
                                }
                            } else {
                                class94 var225 = class226.field3216.method3929(var211, -1);
                                class94 var226 = class226.field3216.method3929(var221, -1);
                                if (var225.field1140 != -1 && var226.field1140 != -1) {
                                    class456 var227 = class509.field6780.method663((byte) -90, var225.field1140);
                                    class456 var228 = class509.field6780.method663((byte) -90, var226.field1140);
                                    if (var228.field6213 > var227.field6213) {
                                        var220 = false;
                                    }
                                }
                            }
                        }
                        if (var220) {
                            var219.field6361 = var211;
                            var219.field6362 = class29.field474 + var213;
                            var219.field6363 = var212;
                            var219.field6368 = var216;
                            var219.field6364 = var215;
                            var219.field6366 = 0;
                            var219.field6360 = 1;
                            var219.field6365 = 0;
                            if (class29.field474 < var219.field6362) {
                                var219.field6366 = -1;
                            }
                            if (var219.field6361 == 65535) {
                                var219.field6361 = -1;
                            }
                            if (var219.field6361 != -1 && class29.field474 == var219.field6362) {
                                int var229 = class226.field3216.method3929(var219.field6361, -1).field1140;
                                if (var229 != -1) {
                                    class456 var230 = class509.field6780.method663((byte) -90, var229);
                                    if (var230 != null && var230.field6229 != null && !var218.field10252) {
                                        class514.method2871(var230, 0, var218, true);
                                    }
                                }
                            }
                        }
                    }
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class104.field1432) {
                int var253 = class3.field63.method3783((byte) -45);
                int var254 = class3.field63.method3807(-1);
                boolean var255 = (var253 & 0x1) == 1;
                class103.method766(var254, var255, 0);
                class475.field6511[class48.method346(31, class392.field5479++)] = var254;
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class55.field661) {
                int var256 = class3.field63.method3777((byte) -93);
                int var257 = class3.field63.method3807(-1);
                class447.method2561(-12062);
                class684.method3859(false, var257, var256);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class471.field6451) {
                class163.field2473 = class402.method2365(class3.field63.method3821((byte) -97), (byte) -59);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class347.field4864) {
                int var258 = class3.field63.method3807(-1);
                int var259 = class3.field63.method3807(-1);
                int var260 = class3.field63.method3807(-1);
                class447.method2561(-12062);
                if (class747.field10393[var258] != null) {
                    for (int var261 = var259; var261 < var260; var261++) {
                        int var262 = class3.field63.method3833(255);
                        if (var261 < class747.field10393[var258].length && class747.field10393[var258][var261] != null) {
                            class747.field10393[var258][var261].field9210 = var262;
                        }
                    }
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class759.field10561) {
                boolean var263 = class3.field63.method3821((byte) 125) == 1;
                String var264 = class3.field63.method3793(15598);
                String var265 = var264;
                if (var263) {
                    var265 = class3.field63.method3793(15598);
                }
                long var266 = class3.field63.method3820(1237129056);
                long var268 = (long) class3.field63.method3807(-1);
                long var270 = (long) class3.field63.method3833(255);
                int var272 = class3.field63.method3821((byte) 84);
                long var273 = (var268 << 32) + var270;
                boolean var275 = false;
                int var276 = 0;
                while (true) {
                    if (var276 >= 100) {
                        if (var272 <= 1) {
                            if (!(!class375.field5199 || class662.field8730) || class433.field5956) {
                                var275 = true;
                            } else if (class36.method294(124, var265)) {
                                var275 = true;
                            }
                        }
                        break;
                    }
                    if (class101.field1414[var276] == var273) {
                        var275 = true;
                        break;
                    }
                    var276++;
                }
                if (!var275 && class328.field4681 == 0) {
                    class101.field1414[class593.field7707] = var273;
                    class593.field7707 = (class593.field7707 + 1) % 100;
                    String var277 = class747.method4184(-84, class284.method1764(class3.field63, (byte) 101));
                    if (var272 == 2 || var272 == 3) {
                        class31.method272(class485.method2741((byte) -104, var266), var277, var264, 0, 113, 9, "<img=1>" + var265, "<img=1>" + var264, -1);
                    } else if (var272 == 1) {
                        class31.method272(class485.method2741((byte) -104, var266), var277, var264, 0, 125, 9, "<img=0>" + var265, "<img=0>" + var264, -1);
                    } else {
                        class31.method272(class485.method2741((byte) -104, var266), var277, var264, 0, 82, 9, var265, var264, -1);
                    }
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class428.field5898) {
                String var278 = class3.field63.method3793(15598);
                int var279 = class3.field63.method3807(-1);
                class447.method2561(-12062);
                class4.method71(var279, 16504, var278);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class446.field6123) {
                int var280 = class3.field63.method3782(128);
                if (var280 == 65535) {
                    var280 = -1;
                }
                int var281 = class3.field63.method3821((byte) 80);
                String var282 = class3.field63.method3793(15598);
                int var283 = class3.field63.method3821((byte) -76);
                if (var281 >= 1 && var281 <= 8) {
                    if (var282.equalsIgnoreCase("null")) {
                        var282 = null;
                    }
                    class44.field574[var281 - 1] = var282;
                    class343.field4826[var281 - 1] = var280;
                    class416.field5745[var281 - 1] = var283 == 0;
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class716.field9871) {
                int var284 = class3.field63.method3807(-1);
                int var285 = class3.field63.method3821((byte) 84);
                boolean var286 = (var285 & 0x1) == 1;
                class653.method3554(var284, var286, !arg0);
                int var287 = class3.field63.method3807(-1);
                for (int var288 = 0; var288 < var287; var288++) {
                    int var289 = class3.field63.method3791(arg0);
                    if (var289 == 255) {
                        var289 = class3.field63.method3799(false);
                    }
                    int var290 = class3.field63.method3816(-115);
                    class470.method2649(var286, var288, var289, (byte) -107, var284, var290 - 1);
                }
                class475.field6511[class48.method346(class392.field5479++, 31)] = var284;
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class434.field5976) {
                boolean var291 = class3.field63.method3821((byte) 69) == 1;
                String var292 = class3.field63.method3793(15598);
                String var293 = var292;
                if (var291) {
                    var293 = class3.field63.method3793(15598);
                }
                long var294 = (long) class3.field63.method3807(-1);
                long var296 = (long) class3.field63.method3833(255);
                int var298 = class3.field63.method3821((byte) -105);
                int var299 = class3.field63.method3807(-1);
                long var300 = (var294 << 32) + var296;
                boolean var302 = false;
                int var303 = 0;
                while (true) {
                    if (var303 >= 100) {
                        if (var298 <= 1 && class36.method294(-77, var293)) {
                            var302 = true;
                        }
                        break;
                    }
                    if (class101.field1414[var303] == var300) {
                        var302 = true;
                        break;
                    }
                    var303++;
                }
                if (!var302 && class328.field4681 == 0) {
                    class101.field1414[class593.field7707] = var300;
                    class593.field7707 = (class593.field7707 + 1) % 100;
                    String var304 = class658.field8695.method3326(arg0, var299).method2477(class3.field63, (byte) 118);
                    if (var298 == 2) {
                        class31.method272(null, var304, var292, 0, 99, 18, "<img=1>" + var293, "<img=1>" + var292, var299);
                    } else if (var298 == 1) {
                        class31.method272(null, var304, var292, 0, 102, 18, "<img=0>" + var293, "<img=0>" + var292, var299);
                    } else {
                        class31.method272(null, var304, var292, 0, 78, 18, var293, var292, var299);
                    }
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class103.field1428) {
                int var305 = class3.field63.method3790((byte) 22);
                int var306 = class3.field63.method3799(false);
                int var307 = class3.field63.method3821((byte) -84);
                String var308 = "";
                String var309 = var308;
                if ((var307 & 0x1) != 0) {
                    var308 = class3.field63.method3793(15598);
                    if ((var307 & 0x2) == 0) {
                        var309 = var308;
                    } else {
                        var309 = class3.field63.method3793(15598);
                    }
                }
                String var310 = class3.field63.method3793(15598);
                if (var305 == 99) {
                    class710.method3991(var310, (byte) 76);
                } else if (var309.equals("") || !class36.method294(-116, var309)) {
                    class494.method2789(var306, var310, var308, (byte) -15, var308, var309, var305);
                } else {
                    class94.field1148 = null;
                    return true;
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class392.field5473) {
                class698.method3932(class256.field3516, (byte) -40);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class540.field7154) {
                class698.method3932(class432.field5946, (byte) -69);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class506.field6763) {
                class698.method3932(class348.field4887, (byte) -111);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class316.field4512) {
                int var311 = class3.field63.method3815((byte) -114);
                int var312 = class3.field63.method3815((byte) 89);
                int var313 = class3.field63.method3783((byte) -45);
                int var314 = class3.field63.method3783((byte) -45);
                int var315 = class3.field63.method3816(-114);
                class447.method2561(-12062);
                class555.field7298[var314] = true;
                class433.field5964[var314] = var313;
                class468.field6425[var314] = var312;
                class462.field6359[var314] = var311;
                class114.field1867[var314] = var315;
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class708.field9802) {
                int var316 = class3.field63.method3816(-101);
                byte var317 = class3.field63.method3768((byte) 104);
                class447.method2561(-12062);
                class660.method3581(var317, (byte) -74, var316);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class420.field5782) {
                int var318 = class3.field63.method3809(true);
                int var319 = class3.field63.method3809(arg0);
                int var320 = class3.field63.method3807(-1);
                int var321 = class3.field63.method3826(-1893167880);
                class447.method2561(-12062);
                class240.method1507(var318, (byte) 100, 7, var319 | var320 << 16, var321);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class339.field4794) {
                int var322 = class3.field63.method3809(true);
                int var323 = class3.field63.method3791(arg0);
                class447.method2561(-12062);
                if (var323 == 2) {
                    class273.method1641(-15074);
                }
                class443.field6101 = var322;
                class100.method746(var322, (byte) 111);
                class411.method2400(false, -118);
                class182.method1251(class443.field6101);
                for (int var324 = 0; var324 < 100; var324++) {
                    class12.field192[var324] = true;
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class659.field8701) {
                if (class200.field3012 != null) {
                    class554.method3084(false, class411.field5711.field3901.method2537(arg0), -1, -1, -1);
                }
                byte[] var325 = new byte[class732.field10143];
                class3.field63.method1659(class732.field10143, var325, (byte) 113, 0);
                String var326 = class318.method1930(0, class732.field10143, var325, -87);
                class56.method374(var326, 0, class411.field5711.field3913.method3282(true) == 1, class66.field828, true);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class11.field177) {
                class698.method3932(class99.field1267, (byte) -29);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class546.field7222) {
                boolean var327 = class3.field63.method3821((byte) 70) == 1;
                String var328 = class3.field63.method3793(15598);
                String var329 = var328;
                if (var327) {
                    var329 = class3.field63.method3793(15598);
                }
                long var330 = (long) class3.field63.method3807(-1);
                long var332 = (long) class3.field63.method3833(255);
                int var334 = class3.field63.method3821((byte) -65);
                long var335 = (var330 << 32) + var332;
                boolean var337 = false;
                int var338 = 0;
                while (true) {
                    if (var338 >= 100) {
                        if (var334 <= 1) {
                            if (!(!class375.field5199 || class662.field8730) || class433.field5956) {
                                var337 = true;
                            } else if (class36.method294(-91, var329)) {
                                var337 = true;
                            }
                        }
                        break;
                    }
                    if (class101.field1414[var338] == var335) {
                        var337 = true;
                        break;
                    }
                    var338++;
                }
                if (!var337 && class328.field4681 == 0) {
                    class101.field1414[class593.field7707] = var335;
                    class593.field7707 = (class593.field7707 + 1) % 100;
                    String var339 = class747.method4184(-118, class284.method1764(class3.field63, (byte) 101));
                    if (var334 == 2) {
                        class31.method272(null, var339, var328, 0, 63, 7, "<img=1>" + var329, "<img=1>" + var328, -1);
                    } else if (var334 == 1) {
                        class31.method272(null, var339, var328, 0, 100, 7, "<img=0>" + var329, "<img=0>" + var328, -1);
                    } else {
                        class31.method272(null, var339, var328, 0, 62, 3, var329, var328, -1);
                    }
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class708.field9820) {
                boolean var340 = class3.field63.method3821((byte) 120) == 1;
                String var341 = class3.field63.method3793(15598);
                String var342 = var341;
                if (var340) {
                    var342 = class3.field63.method3793(15598);
                }
                long var343 = class3.field63.method3820(1237129056);
                long var345 = (long) class3.field63.method3807(-1);
                long var347 = (long) class3.field63.method3833(255);
                int var349 = class3.field63.method3821((byte) -59);
                int var350 = class3.field63.method3807(-1);
                long var351 = (var345 << 32) + var347;
                boolean var353 = false;
                int var354 = 0;
                while (true) {
                    if (var354 >= 100) {
                        if (var349 <= 1 && class36.method294(-80, var342)) {
                            var353 = true;
                        }
                        break;
                    }
                    if (class101.field1414[var354] == var351) {
                        var353 = true;
                        break;
                    }
                    var354++;
                }
                if (!var353 && class328.field4681 == 0) {
                    class101.field1414[class593.field7707] = var351;
                    class593.field7707 = (class593.field7707 + 1) % 100;
                    String var355 = class658.field8695.method3326(true, var350).method2477(class3.field63, (byte) 107);
                    if (var349 == 2) {
                        class31.method272(class485.method2741((byte) -104, var343), var355, var341, 0, 106, 20, "<img=1>" + var342, "<img=1>" + var341, var350);
                    } else if (var349 == 1) {
                        class31.method272(class485.method2741((byte) -104, var343), var355, var341, 0, 93, 20, "<img=0>" + var342, "<img=0>" + var341, var350);
                    } else {
                        class31.method272(class485.method2741((byte) -104, var343), var355, var341, 0, 105, 20, var342, var341, var350);
                    }
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class425.field5851) {
                class450.method2570(1830088036);
                class94.field1148 = null;
                return false;
            } else if (class94.field1148 == class704.field9763) {
                int var356 = class3.field63.method3799(false);
                class112.field1854 = class66.field828.method1299(var356, (byte) -23);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class164.field2487) {
                class74.field901.method4067(-12777);
                class94.field1148 = null;
                class142.field2265 += 32;
                return true;
            } else if (class94.field1148 == class256.field3514) {
                int var357 = class3.field63.method3791(true);
                int var358 = class3.field63.method3807(-1);
                if (var358 == 65535) {
                    var358 = -1;
                }
                int var359 = class3.field63.method3791(true);
                class104.method770(var358, var359, -95, var357);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class47.field599) {
                int var360 = class3.field63.method3769((byte) -23);
                int var361 = class3.field63.method3821((byte) 97);
                int var362 = class3.field63.method3807(-1);
                if (var362 == 65535) {
                    var362 = -1;
                }
                class661.method3585(64, var362, var361, var360);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class378.field5267) {
                class698.method3932(class307.field4424, (byte) -70);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class255.field3499) {
                int var363 = class3.field63.method3782(128);
                int var364 = class3.field63.method3782(128);
                int var365 = class3.field63.method3799(false);
                int var366 = class3.field63.method3816(-126);
                class447.method2561(-12062);
                class719.method4029(var365, 52, var364, var363, var366);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class47.field597) {
                int var367 = class3.field63.method3821((byte) -28);
                if (class3.field63.method3821((byte) 81) == 0) {
                    class369.field5148[var367] = new class612();
                } else {
                    class3.field63.field9419--;
                    class369.field5148[var367] = new class612(class3.field63);
                }
                class399.field5566 = class691.field9630;
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class105.field1436) {
                class362.method2153(-1, class3.field63.method3793(15598));
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class269.field3763) {
                int var368 = class3.field63.method3782(128);
                class447.method2561(-12062);
                class177.method1232(false, var368);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class51.field642) {
                boolean var369 = class3.field63.method3821((byte) -90) == 1;
                String var370 = class3.field63.method3793(15598);
                String var371 = var370;
                if (var369) {
                    var371 = class3.field63.method3793(15598);
                }
                int var372 = class3.field63.method3821((byte) -62);
                boolean var373 = false;
                if (var372 <= 1) {
                    if (!(!class375.field5199 || class662.field8730) || class433.field5956) {
                        var373 = true;
                    } else if (var372 <= 1 && class36.method294(-65, var371)) {
                        var373 = true;
                    }
                }
                if (!var373 && class328.field4681 == 0) {
                    String var374 = class747.method4184(-60, class284.method1764(class3.field63, (byte) 101));
                    if (var372 == 2) {
                        class31.method272(null, var374, var370, 0, 107, 24, "<img=1>" + var371, "<img=1>" + var370, -1);
                    } else if (var372 == 1) {
                        class31.method272(null, var374, var370, 0, 88, 24, "<img=0>" + var371, "<img=0>" + var370, -1);
                    } else {
                        class31.method272(null, var374, var370, 0, 87, 24, var371, var370, -1);
                    }
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class333.field4732) {
                int var375 = class3.field63.method3799(false);
                int var376 = class3.field63.method3809(true);
                class447.method2561(-12062);
                if (var376 == 65535) {
                    var376 = -1;
                }
                class79.method629(var375, var376, 16);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class739.field10202) {
                int var377 = class3.field63.method3782(128);
                if (var377 == 65535) {
                    var377 = -1;
                }
                int var378 = class3.field63.method3782(128);
                if (var378 == 65535) {
                    var378 = -1;
                }
                int var379 = class3.field63.method3805((byte) 0);
                int var380 = class3.field63.method3826(-1893167880);
                class447.method2561(-12062);
                for (int var381 = var378; var381 <= var377; var381++) {
                    long var382 = ((long) var379 << 32) + (long) var381;
                    class200 var384 = (class200) class33.field501.method2135(var382, (byte) 31);
                    class200 var385;
                    if (var384 != null) {
                        var385 = new class200(var380, var384.field2998);
                        var384.method3564(arg0);
                    } else if (var381 == -1) {
                        var385 = new class200(var380, class21.method225(65535, var379).field9265.field2998);
                    } else {
                        var385 = new class200(var380, -1);
                    }
                    class33.field501.method2143(-1, var385, var382);
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class702.field9748) {
                int var386 = class3.field63.method3777((byte) -89);
                class447.method2561(-12062);
                class240.method1507(0, (byte) 100, 5, class303.field4293, var386);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class734.field10157) {
                class698.method3932(class306.field4405, (byte) -16);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class745.field10374) {
                int var387 = class3.field63.method3826(-1893167880);
                int var388 = class3.field63.method3809(true);
                class447.method2561(-12062);
                class135.method1055(var388, var387, true);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class228.field3252) {
                boolean var389 = class3.field63.method3821((byte) -100) == 1;
                String var390 = class3.field63.method3793(15598);
                String var391 = var390;
                if (var389) {
                    var391 = class3.field63.method3793(15598);
                }
                int var392 = class3.field63.method3821((byte) 120);
                int var393 = class3.field63.method3807(-1);
                boolean var394 = false;
                if (var392 <= 1 && class36.method294(-94, var391)) {
                    var394 = true;
                }
                if (!var394 && class328.field4681 == 0) {
                    String var395 = class658.field8695.method3326(true, var393).method2477(class3.field63, (byte) 91);
                    if (var392 == 2) {
                        class31.method272(null, var395, var390, 0, 111, 25, "<img=1>" + var391, "<img=1>" + var390, var393);
                    } else if (var392 == 1) {
                        class31.method272(null, var395, var390, 0, 96, 25, "<img=0>" + var391, "<img=0>" + var390, var393);
                    } else {
                        class31.method272(null, var395, var390, 0, 125, 25, var391, var390, var393);
                    }
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class723.field10079) {
                class698.method3932(class172.field2633, (byte) -48);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class276.field3850) {
                int var396 = class3.field63.method3815((byte) 62);
                int var397 = class3.field63.method3799(false);
                int var398 = class3.field63.method3783((byte) -45);
                class101.field1415[var398] = var397;
                class91.field1104[var398] = var396;
                class520.field6940[var398] = 1;
                int var399 = class646.field8584[var398] - 1;
                for (int var400 = 0; var400 < var399; var400++) {
                    if (var397 >= class166.field2570[var400]) {
                        class520.field6940[var398] = var400 + 2;
                    }
                }
                class466.field6414[class48.method346(31, class471.field6449++)] = var398;
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class128.field2116) {
                int var401 = class3.field63.method3777((byte) -70);
                int var402 = class3.field63.method3782(128);
                class74.field901.method4074(var402, 115, var401);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class411.field5708) {
                class698.method3932(class436.field6012, (byte) -45);
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class218.field3144) {
                if (class443.field6101 != -1) {
                    class2.method18(0, class443.field6101, (byte) 121);
                }
                class94.field1148 = null;
                return true;
            } else if (class94.field1148 == class393.field5484) {
                class362.method2152(116);
                class94.field1148 = null;
                return false;
            } else if (class94.field1148 == class603.field7923) {
                int var403 = class3.field63.method3807(-1);
                if (var403 == 65535) {
                    var403 = -1;
                }
                int var404 = class3.field63.method3821((byte) 104);
                int var405 = class3.field63.method3807(-1);
                int var406 = class3.field63.method3821((byte) -77);
                int var407 = class3.field63.method3807(-1);
                class291.method1804(!arg0, var406, var404, var403, var407, false, var405);
                class94.field1148 = null;
                return true;
            } else {
                class135.method1056("T1 - " + (class94.field1148 == null ? -1 : class94.field1148.method4214((byte) -76)) + "," + (class513.field6809 == null ? -1 : class513.field6809.method4214((byte) -69)) + "," + (class42.field552 == null ? -1 : class42.field552.method4214((byte) -27)) + " - " + class732.field10143, null, 1);
                class339.method2036(71, false);
                return true;
            }
        }
    }
}
