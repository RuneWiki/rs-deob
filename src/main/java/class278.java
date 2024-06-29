import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class278 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public int field4873 = -1;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Lqk;")
    public static class207 field4879 = class24.method212(255, "<col=00ff80>");

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Lqk;")
    public static class207 field4876 = class24.method212(255, " autres options");

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Z")
    public static boolean field4884 = true;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "[S")
    public static short[] field4883 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Lof;")
    public class266 field4882;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "[I")
    public int[] field4880;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "[I")
    public static int[] field4881;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "[Lqk;")
    public class207[] field4886;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ldl;IIIIIIZ)V")
    public static final void method1888(class122 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2099.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field2099[var9] - class207.field3676;
            int var23 = arg0.field2110[var9] - class134.field2322;
            int var24 = arg0.field2116[var9] - class59.field1084;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field2114 != null) {
                class122.field2112[var9] = var25;
                class122.field2118[var9] = var28;
                class122.field2106[var9] = var29;
            }
            class122.field2113[var9] = (var25 << 9) / var29 + class257.field4599;
            class122.field2105[var9] = (var28 << 9) / var29 + class257.field4593;
        }
        class257.field4590 = 0;
        int var10 = arg0.field2108.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field2108[var11];
            int var13 = arg0.field2115[var11];
            int var14 = arg0.field2102[var11];
            int var15 = class122.field2113[var12];
            int var16 = class122.field2113[var13];
            int var17 = class122.field2113[var14];
            int var18 = class122.field2105[var12];
            int var19 = class122.field2105[var13];
            int var20 = class122.field2105[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class15.field243 && class94.method677(class257.field4599 + class180.field3234, class262.field4661 + class257.field4593, var18, var19, var20, var15, var16, var17)) {
                    class33.field665 = arg5;
                    class27.field559 = arg6;
                }
                if (!arg7) {
                    class257.field4592 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class257.field4604 || var16 > class257.field4604 || var17 > class257.field4604) {
                        class257.field4592 = true;
                    }
                    if (arg0.field2114 == null || arg0.field2114[var11] == -1) {
                        if (arg0.field2100[var11] != 12345678) {
                            class257.method1801(var18, var19, var20, var15, var16, var17, arg0.field2100[var11], arg0.field2111[var11], arg0.field2103[var11]);
                        }
                    } else if (!class261.field4655) {
                        int var21 = class257.field4602.method342(arg0.field2114[var11], 65535);
                        class257.method1801(var18, var19, var20, var15, var16, var17, class183.method1292(var21, arg0.field2100[var11]), class183.method1292(var21, arg0.field2111[var11]), class183.method1292(var21, arg0.field2103[var11]));
                    } else if (arg0.field2107) {
                        class257.method1782(var18, var19, var20, var15, var16, var17, arg0.field2100[var11], arg0.field2111[var11], arg0.field2103[var11], class122.field2112[0], class122.field2112[1], class122.field2112[3], class122.field2118[0], class122.field2118[1], class122.field2118[3], class122.field2106[0], class122.field2106[1], class122.field2106[3], arg0.field2114[var11]);
                    } else {
                        class257.method1782(var18, var19, var20, var15, var16, var17, arg0.field2100[var11], arg0.field2111[var11], arg0.field2103[var11], class122.field2112[var12], class122.field2112[var13], class122.field2112[var14], class122.field2118[var12], class122.field2118[var13], class122.field2118[var14], class122.field2106[var12], class122.field2106[var13], class122.field2106[var14], arg0.field2114[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method1889(int arg0) {
        field4881 = null;
        field4883 = null;
        if (arg0 >= -93) {
            method1890(34);
        }
        field4876 = null;
        field4879 = null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public static final void method1890(int arg0) {
        boolean var1 = true;
        class119.method851(22705, false);
        field4874++;
        class59.field1085 = 0;
        for (int var2 = 0; var2 < class88.field1591.length; var2++) {
            if (class127.field2219[var2] != -1 && class88.field1591[var2] == null) {
                class88.field1591[var2] = class13.field191.method705(class127.field2219[var2], 0, -1);
                if (class88.field1591[var2] == null) {
                    class59.field1085++;
                    var1 = false;
                }
            }
            if (class44.field877[var2] != -1 && class207.field3680[var2] == null) {
                class207.field3680[var2] = class13.field191.method709(0, (byte) -28, class157.field2790[var2], class44.field877[var2]);
                if (class207.field3680[var2] == null) {
                    var1 = false;
                    class59.field1085++;
                }
            }
            if (class27.field546 != null && class228.field4190[var2] == null && class27.field546[var2] != -1) {
                class228.field4190[var2] = class13.field191.method709(0, (byte) -28, class157.field2790[var2], class27.field546[var2]);
                if (class228.field4190[var2] == null) {
                    class59.field1085++;
                    var1 = false;
                }
            }
        }
        if (class202.field3570 == null) {
            if (class101.field1830 == null || !class241.field4401.method725(106, class105.method757(false, new class207[] { class101.field1830.field4557, class214.field3807 }))) {
                class202.field3570 = new class187(0);
            } else if (class241.field4401.method704(class105.method757(false, new class207[] { class101.field1830.field4557, class214.field3807 }), (byte) -127)) {
                class202.field3570 = class162.method1176(class105.method757(false, new class207[] { class101.field1830.field4557, class214.field3807 }), -24669, class241.field4401);
            } else {
                class59.field1085++;
                var1 = false;
            }
        }
        if (!var1) {
            class275.field4821 = 1;
            return;
        }
        boolean var3 = true;
        class260.field4633 = 0;
        for (int var4 = 0; var4 < class88.field1591.length; var4++) {
            byte[] var20 = class207.field3680[var4];
            if (var20 != null) {
                int var21 = (class207.field3685[var4] >> 8) * 64 - class21.field349;
                int var22 = (class207.field3685[var4] & 0xFF) * 64 - class180.field3231;
                if (class270.field4772) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class117.method839(var20, (byte) -127, var22, var21);
            }
        }
        if (!var3) {
            class275.field4821 = 2;
            return;
        }
        if (class275.field4821 != 0) {
            class284.method1926(class105.method757(false, new class207[] { class285.field4999, class4.field68 }), (byte) -111, true);
        }
        if (arg0 < 125) {
            field4884 = true;
        }
        class21.method129((byte) 8);
        class25.method213(-110);
        boolean var5 = false;
        class266.method1827(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class133.field2303[var6].method1124((byte) -114);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class271.field4791[var7][var18][var19] = 0;
                }
            }
        }
        class4.method24((byte) 123, false);
        class21.method129((byte) 8);
        System.gc();
        class119.method851(22705, true);
        class254.method1770((byte) 110, false);
        if (!class270.field4772) {
            class80.method604(false, -119);
            class119.method851(22705, true);
            class214.method1528(-1, false);
            if (class228.field4190 != null) {
                class187.method1307((byte) -88);
            }
        }
        if (class270.field4772) {
            class202.method1403((byte) -122, false);
            class119.method851(22705, true);
            class108.method786(11850, false);
        }
        class25.method213(-123);
        class119.method851(22705, true);
        class287.method1958(false, class133.field2303, false);
        class119.method851(22705, true);
        int var8 = class32.field647;
        if (var8 > class93.field1645) {
            var8 = class93.field1645;
        }
        if ((class93.field1645 - 1) > var8) {
            int var9 = class93.field1645 - 1;
        }
        if (class212.method1512(-96)) {
            class187.method1304(0);
        } else {
            class187.method1304(class32.field647);
        }
        class57.method422(125);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class223.method1580(var17, -99999999, var10);
            }
        }
        class191.method1330(-78);
        class21.method129((byte) 8);
        class177.method1264((byte) -19);
        class25.method213(-109);
        if (class272.field4794 != null && class98.field1738 != null && class250.field4524 == 25) {
            class165.field2911++;
            class261.field4645.method767(88, (byte) 121);
            class261.field4645.method1068(1057001181, 126);
        }
        if (!class270.field4772) {
            int var11 = (class89.field1602 - 6) / 8;
            int var12 = (class89.field1602 + 6) / 8;
            int var13 = (class199.field3500 - 6) / 8;
            int var14 = (class199.field3500 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= var14 + 1; var16++) {
                    if (var11 > var15 || var12 < var15 || var13 > var16 || var16 > var14) {
                        class13.field191.method728(class105.method757(false, new class207[] { class16.field257, class262.method1815(var15, (byte) -118), class265.field4705, class262.method1815(var16, (byte) -111) }), -25930);
                        class13.field191.method728(class105.method757(false, new class207[] { class74.field1364, class262.method1815(var15, (byte) 78), class265.field4705, class262.method1815(var16, (byte) -112) }), -25930);
                    }
                }
            }
        }
        if (class250.field4524 == 28) {
            class193.method1345(10, 10);
        } else {
            class193.method1345(10, 30);
            if (class98.field1738 != null) {
                class261.field4645.method767(125, (byte) 108);
            }
        }
        class196.method1360(121);
        class21.method129((byte) 8);
        class163.method1183(-33);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLqk;)I")
    public static final int method1891(byte arg0, class207 arg1) {
        if (arg0 == -113) {
            field4885++;
            return arg1.method1450((byte) 127) + 1;
        } else {
            return -99;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static final void method1892(byte arg0) {
        if (arg0 < 65) {
            field4877 = 55;
        }
        field4875++;
        class282.field4958.method1390((byte) 120);
        class182.field3245.method1390((byte) 121);
    }
}
