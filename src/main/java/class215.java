import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class215 extends class177 {

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "Lqk;")
    public class57 field3641;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "Ltf;")
    public static class242 field3644 = new class242(64);

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "Lbe;")
    private static class283 field3646 = class153.method941(-38, "Checking for updates )2 ");

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "Lbe;")
    public static class283 field3649 = class153.method941(126, "null");

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "[I")
    public static int[] field3647 = new int[500];

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "Lbe;")
    public static class283 field3650 = field3646;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "Lbe;")
    public static class283 field3653 = class153.method941(-47, "<)4col>");

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "(I)V", line = 5)
    public static final void method1419(int arg0) {
        field3651++;
        class87.field1471 = class127.method796(0, 8, 4, 0.4F, 8, true, 2048, 35);
        if (arg0 < 86) {
            field3647 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[F", line = 23)
    public static final float[] method1420(int arg0, int arg1) {
        if (arg0 != 32270) {
            return (float[]) null;
        }
        field3642++;
        float var2 = class59.method383() + class59.method391();
        int var3 = class59.method385();
        float var4 = (float) ((var3 & 0xFF1D) >> 8) / 255.0F;
        float var5 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        class89.field1510[3] = 1.0F;
        float var6 = 0.58823526F;
        class89.field1510[1] = var2 * var6 * var4 * ((float) class178.method1174(255, arg1 >> 8) / 255.0F);
        class89.field1510[0] = var2 * (float) (class178.method1174(arg1, 16775436) >> 16) / 255.0F * var5 * var6;
        float var7 = (float) (var3 & 0xFF) / 255.0F;
        class89.field1510[2] = var6 * var7 * ((float) class178.method1174(arg1, 255) / 255.0F) * var2;
        return class89.field1510;
    }

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "(I)V", line = 50)
    public static void method1421(int arg0) {
        field3644 = null;
        field3647 = null;
        field3653 = null;
        field3646 = null;
        if (arg0 < 6) {
            field3649 = (class283) null;
        }
        field3650 = null;
        field3649 = null;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lqk;)V", line = 64)
    public class215(class57 arg0) {
        this.field3641 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZZJI)Lbe;", line = 80)
    public static final class283 method1422(boolean arg0, boolean arg1, long arg2, int arg3) {
        field3643++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var5 = 1;
        for (long var6 = arg2 / (long) arg3; var6 != 0L; var6 /= (long) arg3) {
            var5++;
        }
        int var8 = var5;
        if (arg2 < 0L || arg1) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg2 < 0L) {
            var9[0] = 45;
        } else if (arg1) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var11 = (int) (arg2 % (long) arg3);
            arg2 /= (long) arg3;
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - (var10 + 1)] = (byte) (var11 + 48);
        }
        class283 var12 = new class283();
        if (!arg0) {
            field3650 = (class283) null;
        }
        var12.field4812 = var8;
        var12.field4843 = var9;
        return var12;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)Z", line = 144)
    public static final boolean method1423(byte arg0) throws IOException {
        field3645++;
        if (class263.field4484 == null) {
            return false;
        }
        int var1 = class263.field4484.method1284(arg0 - 114);
        if (var1 == 0) {
            return false;
        }
        if (class163.field2688 == -1) {
            var1--;
            class263.field4484.method1279(0, class262.field4462.field3879, 1, -115);
            class262.field4462.field3905 = 0;
            class163.field2688 = class262.field4462.method623(arg0 - 241);
            class260.field4419 = class112.field1896[class163.field2688];
        }
        if (class260.field4419 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class263.field4484.method1279(0, class262.field4462.field3879, 1, -90);
            class260.field4419 = class262.field4462.field3879[0] & 0xFF;
        }
        if (class260.field4419 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class263.field4484.method1279(0, class262.field4462.field3879, 2, -118);
            class262.field4462.field3905 = 0;
            class260.field4419 = class262.field4462.method1496(true);
        }
        if (arg0 != 113) {
            method1422(true, true, -4L, 120);
        }
        if (class260.field4419 > var1) {
            return false;
        }
        class262.field4462.field3905 = 0;
        class263.field4484.method1279(0, class262.field4462.field3879, class260.field4419, arg0 ^ 0xFFFFFFD5);
        class145.field2394 = 0;
        class182.field3130 = class284.field4854;
        class284.field4854 = class255.field4308;
        class255.field4308 = class163.field2688;
        if (class163.field2688 == 155) {
            int var349 = class262.field4462.method1537(2);
            int var350 = class262.field4462.method1496(true);
            if (var349 == 65535) {
                var349 = -1;
            }
            int var351 = class262.field4462.method1528(true);
            if (class162.method985(true, var350)) {
                class232.method1566(var349, true, var351, 2);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 133) {
            class57.field774 = class262.field4462.method1543(255);
            class89.field1513 = class262.field4462.method1545(-128);
            for (int var2 = class89.field1513; var2 < class89.field1513 + 8; var2++) {
                for (int var3 = class57.field774; var3 < (class57.field774 + 8); var3++) {
                    if (class177.field3046[class61.field850][var2][var3] != null) {
                        class177.field3046[class61.field850][var2][var3] = null;
                        class172.method1091(var2, var3, 64);
                    }
                }
            }
            for (class91 var4 = (class91) class153.field2518.method1812((byte) 64); var4 != null; var4 = (class91) class153.field2518.method1813((byte) 80)) {
                if (var4.field1540 >= class89.field1513 && (class89.field1513 + 8) > var4.field1540 && var4.field1531 >= class57.field774 && var4.field1531 < class57.field774 + 8 && class61.field850 == var4.field1535) {
                    var4.field1534 = 0;
                }
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 8) {
            int var345 = class262.field4462.method1522((byte) 43);
            int var346 = class262.field4462.method1537(2);
            int var347 = class262.field4462.method1496(true);
            int var348 = class262.field4462.method1508((byte) -110);
            if (class162.method985(true, var347)) {
                class232.method1566(var345 << 16 | var346, true, var348, 7);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 144) {
            int var5 = class262.field4462.method1496(true);
            byte var6 = class262.field4462.method1527(0);
            class237.method1582((byte) 122, var5, var6);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 125) {
            class195.field3330 = class260.field4419 / 8;
            for (int var7 = 0; var7 < class195.field3330; var7++) {
                class110.field1854[var7] = class262.field4462.method1495((byte) 79);
                class127.field2102[var7] = class232.method1567(class110.field1854[var7], -84);
            }
            class163.field2688 = -1;
            class141.field2359 = class252.field4284;
            return true;
        } else if (class163.field2688 == 23) {
            class63.method407(false, arg0 - 105);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 50) {
            class257.field4332 = class262.field4462.method1535((byte) 82);
            class141.field2359 = class252.field4284;
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 149) {
            int var8 = class262.field4462.method1496(true);
            int var9 = class262.field4462.method1545(-128);
            int var10 = class262.field4462.method1496(true);
            class60 var11 = class33.field493[var8];
            if (var11 != null) {
                class107.method713(var10, var9, false, var11);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 225) {
            int var12 = class262.field4462.method1534(false);
            int var13 = class262.field4462.method1537(2);
            class141.method892(var13, 196, var12);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 210) {
            int var340 = class262.field4462.method1496(true);
            class283 var341 = class262.field4462.method1549(true);
            Object[] var342 = new Object[var341.method1925((byte) -44) + 1];
            for (int var343 = var341.method1925((byte) -44) - 1; var343 >= 0; var343--) {
                if (var341.method1928(var343, (byte) -84) == 115) {
                    var342[var343 + 1] = class262.field4462.method1549(true);
                } else {
                    var342[var343 + 1] = Integer.valueOf(class262.field4462.method1528(true));
                }
            }
            var342[0] = Integer.valueOf(class262.field4462.method1528(true));
            if (class162.method985(true, var340)) {
                class231 var344 = new class231();
                var344.field3919 = var342;
                class194.method1253(var344, arg0 + 21145);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 109) {
            class55.method358(-2, class262.field4462.method1549(true));
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 20) {
            class283 var14 = class262.field4462.method1549(true);
            int var15 = class262.field4462.method1496(true);
            int var16 = class262.field4462.method1522((byte) 43);
            if (class162.method985(true, var16)) {
                class30.method205(var15, var14, arg0 ^ 0x614D);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 121) {
            int var332 = class262.field4462.method1528(true);
            int var333 = class262.field4462.method1496(true);
            class69 var334;
            if (var332 >= 0) {
                var334 = class65.method418(-8429, var332);
            } else {
                var334 = null;
            }
            if (var334 != null) {
                for (int var335 = 0; var335 < var334.field1073.length; var335++) {
                    var334.field1073[var335] = 0;
                    var334.field973[var335] = 0;
                }
            }
            if (var332 < -70000) {
                var333 += 32768;
            }
            class138.method856(arg0 ^ 0x71, var333);
            int var336 = class262.field4462.method1496(true);
            for (int var337 = 0; var337 < var336; var337++) {
                int var338 = class262.field4462.method1541((byte) -127);
                int var339 = class262.field4462.method1525(-118);
                if (var339 == 255) {
                    var339 = class262.field4462.method1521(-119);
                }
                if (var334 != null && var337 < var334.field1073.length) {
                    var334.field1073[var337] = var338;
                    var334.field973[var337] = var339;
                }
                class38.method242(var337, var333, 0, var339, var338 - 1);
            }
            if (var334 != null) {
                class272.method1834(var334, arg0 ^ 0x71);
            }
            class290.method1981(arg0 ^ 0x7C);
            class40.field570[class178.method1174(31, class24.field366++)] = class178.method1174(var333, 32767);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 40) {
            int var329 = class262.field4462.method1525(-42);
            int var330 = class262.field4462.method1545(arg0 ^ 0xFFFFFFF1);
            class283 var331 = class262.field4462.method1549(true);
            if (var330 >= 1 && var330 <= 8) {
                if (var331.method1910(arg0 ^ 0x3F80, class35.field524)) {
                    var331 = null;
                }
                class12.field121[var330 - 1] = var331;
                class122.field2029[var330 - 1] = var329 == 0;
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 57) {
            if (class260.field4419 == 0) {
                class180.field3114 = class227.field3820;
            } else {
                class180.field3114 = class262.field4462.method1549(true);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 44) {
            if (class1.field2 != null) {
                class143.method903((byte) -104);
            }
            byte[] var17 = new byte[class260.field4419];
            class262.field4462.method616(class260.field4419, 0, var17, 0);
            class283 var18 = class219.method1440(159, class260.field4419, var17, 0);
            if (class164.field2711 == null && class19.field230 == 2 || !class251.field4263.startsWith("win") || class97.field1626) {
                class226.method1482(var18, true, -17397);
            } else {
                class278.field4651 = var18;
                class38.field550 = true;
                class92.field1548 = class150.field2460.method1709(arg0 - 15, new String(var18.method1933((byte) 123), "ISO-8859-1"));
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 107) {
            int var328 = class262.field4462.method1541((byte) -128);
            class130.method815((byte) 16, var328);
            class40.field570[class178.method1174(31, class24.field366++)] = class178.method1174(var328, 32767);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 153) {
            int var324 = class262.field4462.method1535((byte) 125);
            int var325 = class262.field4462.method1496(true);
            int var326 = class262.field4462.method1537(2);
            if (class162.method985(true, var325)) {
                if (var324 == 2) {
                    class176.method1162((byte) 49);
                }
                class82.field1397 = var326;
                class221.method1452(false, var326);
                class89.method578((byte) 122, false);
                class24.method172(class82.field1397, 0);
                for (int var327 = 0; var327 < 100; var327++) {
                    class201.field3434[var327] = true;
                }
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 151) {
            class89.field1513 = class262.field4462.method1543(255);
            class57.field774 = class262.field4462.method1543(255);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 18) {
            int var321 = class262.field4462.method1525(arg0 + 12);
            int var322 = class262.field4462.method1525(123);
            int var323 = class262.field4462.method1535((byte) 81);
            class61.field850 = var321 >> 1;
            class213.field3624.method1241((byte) -124, (var321 & 0x1) == 1, var322, var323);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 90) {
            long var19 = class262.field4462.method1495((byte) 79);
            int var21 = class262.field4462.method1496(true);
            int var22 = class262.field4462.method1535((byte) 123);
            boolean var23 = true;
            if (var19 < 0L) {
                var19 &= Long.MAX_VALUE;
                var23 = false;
            }
            class283 var24 = class213.field3616;
            if (var21 > 0) {
                var24 = class262.field4462.method1549(true);
            }
            class283 var25 = class232.method1567(var19, 122).method1901(arg0 ^ 0xF8E);
            for (int var26 = 0; var26 < class103.field1748; var26++) {
                if (class160.field2622[var26] == var19) {
                    if (class194.field3321[var26] != var21) {
                        class194.field3321[var26] = var21;
                        if (var21 > 0) {
                            class60.method394(5, class299.method2022(new class283[] { var25, class248.field4234 }, (byte) 68), class213.field3616, (byte) 69);
                        }
                        if (var21 == 0) {
                            class60.method394(5, class299.method2022(new class283[] { var25, class282.field4763 }, (byte) 90), class213.field3616, (byte) 32);
                        }
                    }
                    class16.field190[var26] = var24;
                    var25 = null;
                    class42.field586[var26] = var22;
                    class245.field4166[var26] = var23;
                    break;
                }
            }
            if (var25 != null && class103.field1748 < 200) {
                class160.field2622[class103.field1748] = var19;
                class143.field2372[class103.field1748] = var25;
                class194.field3321[class103.field1748] = var21;
                class16.field190[class103.field1748] = var24;
                class42.field586[class103.field1748] = var22;
                class245.field4166[class103.field1748] = var23;
                class103.field1748++;
            }
            class141.field2359 = class252.field4284;
            boolean var27 = false;
            int var28 = class103.field1748;
            while (var28 > 0) {
                var28--;
                boolean var29 = true;
                for (int var30 = 0; var30 < var28; var30++) {
                    if (class194.field3321[var30] != class160.field2639 && class194.field3321[var30 + 1] == class160.field2639 || class194.field3321[var30] == 0 && class194.field3321[var30 + 1] != 0) {
                        var29 = false;
                        int var31 = class194.field3321[var30];
                        class194.field3321[var30] = class194.field3321[var30 + 1];
                        class194.field3321[var30 + 1] = var31;
                        class283 var32 = class16.field190[var30];
                        class16.field190[var30] = class16.field190[var30 + 1];
                        class16.field190[var30 + 1] = var32;
                        class283 var33 = class143.field2372[var30];
                        class143.field2372[var30] = class143.field2372[var30 + 1];
                        class143.field2372[var30 + 1] = var33;
                        long var34 = class160.field2622[var30];
                        class160.field2622[var30] = class160.field2622[var30 + 1];
                        class160.field2622[var30 + 1] = var34;
                        int var36 = class42.field586[var30];
                        class42.field586[var30] = class42.field586[var30 + 1];
                        class42.field586[var30 + 1] = var36;
                        boolean var37 = class245.field4166[var30];
                        class245.field4166[var30] = class245.field4166[var30 + 1];
                        class245.field4166[var30 + 1] = var37;
                    }
                }
                if (var29) {
                    break;
                }
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 247) {
            int var316 = class262.field4462.method1535((byte) 80);
            int var317 = class262.field4462.method1535((byte) 75);
            int var318 = class262.field4462.method1496(true);
            int var319 = class262.field4462.method1535((byte) 108);
            int var320 = class262.field4462.method1535((byte) 94);
            class280.method1871(var316, var317, var319, -377, var318, var320);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 74) {
            int var315 = class262.field4462.method1535((byte) 107);
            if (class262.field4462.method1535((byte) 90) == 0) {
                class241.field4062[var315] = new class245();
            } else {
                class262.field4462.field3905--;
                class241.field4062[var315] = new class245(class262.field4462);
            }
            class163.field2688 = -1;
            class23.field350 = class252.field4284;
            return true;
        } else if (class163.field2688 == 168) {
            int var38 = class262.field4462.method1522((byte) 43);
            int var39 = class262.field4462.method1537(2);
            int var40 = class262.field4462.method1534(false);
            if (var38 == 65535) {
                var38 = -1;
            }
            int var41 = class262.field4462.method1522((byte) 43);
            if (var41 == 65535) {
                var41 = -1;
            }
            int var42 = class262.field4462.method1528(true);
            if (class162.method985(true, var39)) {
                for (int var43 = var38; var43 <= var41; var43++) {
                    long var44 = ((long) var42 << 32) + (long) var43;
                    class86 var46 = class110.field1857.method1612(var44, 106);
                    if (var46 != null) {
                        var46.method557((byte) -89);
                    }
                    class110.field1857.method1611(new class119(var40), -1, var44);
                }
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 142) {
            int var312 = class262.field4462.method1496(true);
            if (var312 == 65535) {
                var312 = -1;
            }
            int var313 = class262.field4462.method1535((byte) 97);
            int var314 = class262.field4462.method1496(true);
            class282.method1893(var312, var314, true, var313);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 146) {
            int var47 = class262.field4462.method1496(true);
            if (var47 == 65535) {
                var47 = -1;
            }
            int var48 = class262.field4462.method1528(true);
            int var49 = class262.field4462.method1522((byte) 43);
            if (class162.method985(true, var49)) {
                class232.method1566(var47, true, var48, 1);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 75) {
            int var50 = class262.field4462.method1535((byte) 107);
            int var51 = class262.field4462.method1535((byte) 127);
            int var52 = class262.field4462.method1535((byte) 111);
            int var53 = class262.field4462.method1535((byte) 108);
            int var54 = class262.field4462.method1496(true);
            class121.field2018[var50] = true;
            class44.field603[var50] = var51;
            class207.field3561[var50] = var52;
            class247.field4200[var50] = var53;
            class31.field479[var50] = var54;
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 218) {
            int var305 = class262.field4462.method1496(true);
            if (var305 == 65535) {
                var305 = -1;
            }
            int var306 = class262.field4462.method1534(false);
            int var307 = class262.field4462.method1541((byte) -128);
            int var308 = class262.field4462.method1521(-118);
            if (class162.method985(true, var307)) {
                class69 var309 = class65.method418(-8429, var306);
                if (var309.field1121) {
                    class22.method164(var305, (byte) 26, var308, var306);
                    class304 var310 = class103.method676(var305, -1);
                    class20.method128(var306, var310.field5150, true, var310.field5132, var310.field5134);
                    class294.method1989(var310.field5169, var306, var310.field5163, var310.field5196, (byte) 47);
                } else if (var305 == -1) {
                    class163.field2688 = -1;
                    var309.field1072 = 0;
                    return true;
                } else {
                    class304 var311 = class103.method676(var305, arg0 - 114);
                    var309.field977 = var311.field5132;
                    var309.field1007 = var311.field5134 * 100 / var308;
                    var309.field1072 = 4;
                    var309.field1057 = var305;
                    var309.field1099 = var311.field5150;
                    class272.method1834(var309, arg0 ^ 0x71);
                }
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 187) {
            int var55 = class262.field4462.method1496(true);
            int var56 = class262.field4462.method1522((byte) 43);
            int var57 = class262.field4462.method1528(true);
            if (class162.method985(true, var55)) {
                class229.method1523(var56, var57, -127);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 21) {
            long var302 = class262.field4462.method1495((byte) 79);
            class283 var304 = class244.method1661(class109.method723(class262.field4462, (byte) 60).method1944(3511));
            class60.method394(6, var304, class232.method1567(var302, -36).method1901(4095), (byte) 33);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 165) {
            class1.method8(class150.field2460, (byte) 36, class260.field4419, class262.field4462);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 159) {
            int var58 = class262.field4462.method1537(arg0 - 111);
            int var59 = class262.field4462.method1534(false);
            class237.method1582((byte) 125, var58, var59);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 7) {
            int var300 = class262.field4462.method1541((byte) -127);
            int var301 = class262.field4462.method1545(-128);
            class141.method892(var300, 196, var301);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 59) {
            int var295 = class262.field4462.method1522((byte) 43);
            int var296 = class262.field4462.method1522((byte) 43);
            int var297 = class262.field4462.method1541((byte) -127);
            int var298 = class262.field4462.method1522((byte) 43);
            int var299 = class262.field4462.method1534(false);
            if (class162.method985(true, var296)) {
                class20.method128(var299, var295, true, var298, var297);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 15) {
            int var284 = class262.field4462.method1545(-128);
            int var285 = var284 >> 2;
            int var286 = var284 & 0x3;
            int var287 = class177.field3040[var285];
            int var288 = class262.field4462.method1521(-103);
            int var289 = var288 >> 28 & 0x3;
            int var290 = (var288 & 0xFFFC53C) >> 14;
            int var291 = var288 & 0x3FFF;
            int var292 = class262.field4462.method1537(2);
            int var293 = var290 - class214.field3637;
            int var294 = var291 - class107.field1833;
            if (var292 == 65535) {
                var292 = -1;
            }
            class107.method709(var286, var292, var294, var285, var289, var287, (byte) -99, var293);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 231) {
            class284.method1953(true);
            class163.field2688 = -1;
            return false;
        } else if (class163.field2688 == 0) {
            for (int var282 = 0; var282 < class149.field2436.length; var282++) {
                if (class149.field2436[var282] != null) {
                    class149.field2436[var282].field1192 = -1;
                }
            }
            for (int var283 = 0; var283 < class33.field493.length; var283++) {
                if (class33.field493[var283] != null) {
                    class33.field493[var283].field1192 = -1;
                }
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 101) {
            int var60 = class262.field4462.method1522((byte) 43);
            if (var60 == 65535) {
                var60 = -1;
            }
            class23.method167(-127, var60);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 97) {
            int var61 = class262.field4462.method1514(true);
            int var62 = class262.field4462.method1541((byte) -127);
            if (var62 == 65535) {
                var62 = -1;
            }
            class123.method775(var61, -19954, var62);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 45) {
            class213.field3623 = class252.field4284;
            long var270 = class262.field4462.method1495((byte) 79);
            if (var270 == 0L) {
                class228.field3836 = null;
                class124.field2070 = null;
                class118.field1982 = 0;
                class149.field2434 = null;
                class163.field2688 = -1;
                return true;
            }
            long var272 = class262.field4462.method1495((byte) 79);
            class228.field3836 = class232.method1567(var272, -101);
            class149.field2434 = class232.method1567(var270, 125);
            class7.field80 = class262.field4462.method1497(false);
            int var274 = class262.field4462.method1535((byte) 81);
            if (var274 == 255) {
                class163.field2688 = -1;
                return true;
            }
            class24[] var275 = new class24[100];
            class118.field1982 = var274;
            for (int var276 = 0; var276 < class118.field1982; var276++) {
                var275[var276] = new class24();
                var275[var276].field1445 = class262.field4462.method1495((byte) 79);
                var275[var276].field360 = class232.method1567(var275[var276].field1445, -62);
                var275[var276].field371 = class262.field4462.method1496(true);
                var275[var276].field369 = class262.field4462.method1497(false);
                var275[var276].field363 = class262.field4462.method1549(true);
                if (class184.field3174 == var275[var276].field1445) {
                    class122.field2038 = var275[var276].field369;
                }
            }
            boolean var277 = false;
            int var278 = class118.field1982;
            while (var278 > 0) {
                boolean var279 = true;
                var278--;
                for (int var280 = 0; var280 < var278; var280++) {
                    if (var275[var280].field360.method1917(var275[var280 + 1].field360, (byte) -47) > 0) {
                        class24 var281 = var275[var280];
                        var279 = false;
                        var275[var280] = var275[var280 + 1];
                        var275[var280 + 1] = var281;
                    }
                }
                if (var279) {
                    break;
                }
            }
            class163.field2688 = -1;
            class124.field2070 = var275;
            return true;
        } else if (class163.field2688 == 14) {
            long var63 = class262.field4462.method1495((byte) 79);
            class262.field4462.method1497(false);
            long var65 = class262.field4462.method1495((byte) 79);
            long var67 = (long) class262.field4462.method1496(true);
            long var69 = (long) class262.field4462.method1551(arg0 ^ 0x74);
            int var71 = class262.field4462.method1535((byte) 114);
            long var72 = (var67 << 32) + var69;
            boolean var74 = false;
            int var75 = 0;
            label1188: while (true) {
                if (var75 >= 100) {
                    if (var71 <= 1) {
                        if (class68.field964 == 1 || class222.field3732 == 1) {
                            var74 = true;
                        } else {
                            for (int var76 = 0; var76 < class195.field3330; var76++) {
                                if (class110.field1854[var76] == var63) {
                                    var74 = true;
                                    break label1188;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class89.field1505[var75] == var72) {
                    var74 = true;
                    break;
                }
                var75++;
            }
            if (!var74 && class37.field539 == 0) {
                class89.field1505[class220.field3707] = var72;
                class220.field3707 = (class220.field3707 + 1) % 100;
                class283 var77 = class244.method1661(class109.method723(class262.field4462, (byte) 60).method1944(3511));
                if (var71 == 2 || var71 == 3) {
                    class48.method280((byte) 115, var77, 9, class299.method2022(new class283[] { class225.field3767, class232.method1567(var63, arg0 ^ 0xF).method1901(arg0 + 3982) }, (byte) 116), class232.method1567(var65, -42).method1901(4095));
                } else if (var71 == 1) {
                    class48.method280((byte) -45, var77, 9, class299.method2022(new class283[] { class87.field1477, class232.method1567(var63, 125).method1901(4095) }, (byte) 109), class232.method1567(var65, -63).method1901(4095));
                } else {
                    class48.method280((byte) -97, var77, 9, class232.method1567(var63, 126).method1901(arg0 + 3982), class232.method1567(var65, -18).method1901(4095));
                }
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 16) {
            class157.method964(95);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 228) {
            class166.field2772 = class262.field4462.method1535((byte) 97);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 242) {
            class290.method1981(arg0 - 1);
            int var266 = class262.field4462.method1521(-122);
            int var267 = class262.field4462.method1543(255);
            int var268 = class262.field4462.method1535((byte) 95);
            class34.field513[var267] = var266;
            class269.field4548[var267] = var268;
            class7.field70[var267] = 1;
            for (int var269 = 0; var269 < 98; var269++) {
                if (var266 >= class298.field5048[var269]) {
                    class7.field70[var267] = var269 + 2;
                }
            }
            class162.field2651[class178.method1174(31, class30.field445++)] = var267;
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 54) {
            int var78 = class262.field4462.method1522((byte) 43);
            int var79 = class262.field4462.method1522((byte) 43);
            int var80 = class262.field4462.method1522((byte) 43);
            int var81 = class262.field4462.method1508((byte) -121);
            if (class162.method985(true, var80)) {
                class157.method969(var81, 126, (var79 << 16) + var78);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 160 || class163.field2688 == 175 || class163.field2688 == 252 || class163.field2688 == 118 || class163.field2688 == 30 || class163.field2688 == 60 || class163.field2688 == 106 || class163.field2688 == 99 || class163.field2688 == 85 || class163.field2688 == 89 || class163.field2688 == 248 || class163.field2688 == 196) {
            class222.method1461((byte) 46);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 3) {
            for (int var82 = 0; var82 < class6.field63.length; var82++) {
                if (class67.field934[var82] != class6.field63[var82]) {
                    class6.field63[var82] = class67.field934[var82];
                    class42.method255(var82, -10);
                    class177.field3052[class178.method1174(class237.field3970++, 31)] = var82;
                }
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 93) {
            int var83 = class262.field4462.method1528(true);
            int var84 = class262.field4462.method1496(true);
            class69 var85;
            if (var83 < 0) {
                var85 = null;
            } else {
                var85 = class65.method418(-8429, var83);
            }
            if (var83 < -70000) {
                var84 += 32768;
            }
            while (class262.field4462.field3905 < class260.field4419) {
                int var86 = class262.field4462.method1557(255);
                int var87 = class262.field4462.method1496(true);
                int var88 = 0;
                if (var87 != 0) {
                    var88 = class262.field4462.method1535((byte) 93);
                    if (var88 == 255) {
                        var88 = class262.field4462.method1528(true);
                    }
                }
                if (var85 != null && var86 >= 0 && var86 < var85.field1073.length) {
                    var85.field1073[var86] = var87;
                    var85.field973[var86] = var88;
                }
                class38.method242(var86, var84, 0, var88, var87 - 1);
            }
            if (var85 != null) {
                class272.method1834(var85, arg0 ^ 0x71);
            }
            class290.method1981(-118);
            class40.field570[class178.method1174(class24.field366++, 31)] = class178.method1174(var84, 32767);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 139) {
            int var89 = class262.field4462.method1541((byte) -128);
            int var90 = class262.field4462.method1522((byte) 43);
            int var91 = class262.field4462.method1534(false);
            int var92 = class262.field4462.method1496(true);
            if ((var91 >> 30) != 0) {
                int var93 = (var91 & 0x3E6AC8D9) >> 28;
                int var94 = ((var91 & 0xFFFF86F) >> 14) - class214.field3637;
                int var95 = (var91 & 0x3FFF) - class107.field1833;
                if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                    int var96 = var95 * 128 + 64;
                    int var97 = var94 * 128 + 64;
                    class301 var98 = new class301(var89, var93, var97, var96, class42.method254(var93, var96, var97, -20341) - var90, var92, class75.field1309);
                    class259.field4412.method1809(new class296(var98), (byte) -119);
                }
            } else if (var91 >> 29 != 0) {
                int var99 = var91 & 0xFFFF;
                class60 var100 = class33.field493[var99];
                if (var100 != null) {
                    var100.field1211 = var89;
                    if (var100.field1211 == 65535) {
                        var100.field1211 = -1;
                    }
                    var100.field1206 = 0;
                    var100.field1165 = 0;
                    var100.field1175 = var90;
                    var100.field1215 = class75.field1309 + var92;
                    if (var100.field1215 > class75.field1309) {
                        var100.field1206 = -1;
                    }
                    if (var100.field1211 != -1 && class75.field1309 == var100.field1215) {
                        int var101 = class259.method1750((byte) 100, var100.field1211).field2831;
                        if (var101 != -1) {
                            class157 var102 = class132.method821(128, var101);
                            if (var102 != null && var102.field2578 != null) {
                                class141.method888(arg0 ^ 0x71, var102, var100.field1210, false, 0, var100.field1193);
                            }
                        }
                    }
                }
            } else if (var91 >> 28 != 0) {
                int var103 = var91 & 0xFFFF;
                class191 var104;
                if (class213.field3622 == var103) {
                    var104 = class213.field3624;
                } else {
                    var104 = class149.field2436[var103];
                }
                if (var104 != null) {
                    var104.field1211 = var89;
                    if (var104.field1211 == 65535) {
                        var104.field1211 = -1;
                    }
                    var104.field1165 = 0;
                    var104.field1215 = class75.field1309 + var92;
                    var104.field1206 = 0;
                    if (var104.field1215 > class75.field1309) {
                        var104.field1206 = -1;
                    }
                    var104.field1175 = var90;
                    if (var104.field1211 != -1 && class75.field1309 == var104.field1215) {
                        int var105 = class259.method1750((byte) 98, var104.field1211).field2831;
                        if (var105 != -1) {
                            class157 var106 = class132.method821(128, var105);
                            if (var106 != null && var106.field2578 != null) {
                                class141.method888(0, var106, var104.field1210, class213.field3624 == var104, 0, var104.field1193);
                            }
                        }
                    }
                }
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 72) {
            int var107 = class262.field4462.method1528(true);
            int var108 = class262.field4462.method1504(-43);
            int var109 = class262.field4462.method1537(arg0 ^ 0x73);
            if (class162.method985(true, var109)) {
                class15.method84(var107, false, var108);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 135) {
            int var263 = class262.field4462.method1534(false);
            int var264 = class262.field4462.method1537(arg0 - 111);
            if (class162.method985(true, var264)) {
                int var265 = 0;
                if (class213.field3624.field3277 != null) {
                    var265 = class213.field3624.field3277.method1778(arg0 ^ 0xC915A708);
                }
                class232.method1566(var265, true, var263, 3);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 104) {
            int var260 = class262.field4462.method1528(true);
            class283 var261 = class262.field4462.method1549(true);
            int var262 = class262.field4462.method1537(arg0 ^ 0x73);
            if (class162.method985(true, var262)) {
                class254.method1719(3858, var260, var261);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 162) {
            int var258 = class262.field4462.method1541((byte) -127);
            int var259 = class262.field4462.method1541((byte) -127);
            class203.field3477 = var259;
            class172.field2908 = var258;
            class261.method1762(25063);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 35) {
            int var110 = class262.field4462.method1541((byte) -127);
            int var111 = class262.field4462.method1496(true);
            int var112 = class262.field4462.method1521(arg0 - 240);
            if (class162.method985(true, var111)) {
                class103.method678(var112, var110, 12);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 115) {
            class107.method710((byte) -118, class262.field4462);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 217) {
            class290.method1981(-126);
            class104.field1801 = class262.field4462.method1535((byte) 123);
            class163.field2688 = -1;
            class279.field4662 = class252.field4284;
            return true;
        } else if (class163.field2688 == 131) {
            boolean var113 = false;
            long var114 = class262.field4462.method1495((byte) 79);
            long var116 = (long) class262.field4462.method1496(true);
            long var118 = (long) class262.field4462.method1551(117);
            long var120 = (var116 << 32) + var118;
            int var122 = class262.field4462.method1535((byte) 88);
            int var123 = 0;
            label1216: while (true) {
                if (var123 < 100) {
                    if (class89.field1505[var123] != var120) {
                        var123++;
                        continue;
                    }
                    var113 = true;
                    break;
                }
                if (var122 <= 1) {
                    if (class68.field964 == 1 || class222.field3732 == 1) {
                        var113 = true;
                    } else {
                        for (int var124 = 0; var124 < class195.field3330; var124++) {
                            if (class110.field1854[var124] == var114) {
                                var113 = true;
                                break label1216;
                            }
                        }
                    }
                }
                break;
            }
            if (!var113 && class37.field539 == 0) {
                class89.field1505[class220.field3707] = var120;
                class220.field3707 = (class220.field3707 + 1) % 100;
                class283 var125 = class244.method1661(class109.method723(class262.field4462, (byte) 60).method1944(3511));
                if (var122 == 2 || var122 == 3) {
                    class60.method394(7, var125, class299.method2022(new class283[] { class225.field3767, class232.method1567(var114, 47).method1901(4095) }, (byte) 9), (byte) 91);
                } else if (var122 == 1) {
                    class60.method394(7, var125, class299.method2022(new class283[] { class87.field1477, class232.method1567(var114, 125).method1901(4095) }, (byte) 19), (byte) 59);
                } else {
                    class60.method394(3, var125, class232.method1567(var114, -82).method1901(4095), (byte) 56);
                }
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 119) {
            if (class82.field1397 != -1) {
                class99.method654(class82.field1397, 0, (byte) 23);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 240) {
            int var251 = class262.field4462.method1496(true);
            int var252 = class262.field4462.method1508((byte) -98);
            int var253 = class262.field4462.method1508((byte) -100);
            if (class162.method985(true, var251)) {
                class159 var254 = (class159) class58.field805.method1612((long) var253, 118);
                class159 var255 = (class159) class58.field805.method1612((long) var252, 103);
                if (var255 != null) {
                    class25.method173(var254 == null || var254.field2600 != var255.field2600, arg0 - 112, var255);
                }
                if (var254 != null) {
                    var254.method557((byte) -89);
                    class58.field805.method1611(var254, -1, (long) var252);
                }
                class69 var256 = class65.method418(-8429, var253);
                if (var256 != null) {
                    class272.method1834(var256, arg0 - 113);
                }
                class69 var257 = class65.method418(arg0 - 8542, var252);
                if (var257 != null) {
                    class272.method1834(var257, 0);
                    class245.method1668(true, var257, 0);
                }
                if (class82.field1397 != -1) {
                    class99.method654(class82.field1397, 1, (byte) -83);
                }
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 223) {
            class94.method602(915);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 236) {
            class283 var126 = class262.field4462.method1549(true);
            if (var126.method1945(-123, class297.field5030)) {
                class283 var127 = var126.method1936(arg0 - 176, 0, var126.method1951(class183.field3139, (byte) 22));
                long var128 = var127.method1929((byte) -24);
                boolean var130 = false;
                for (int var131 = 0; var131 < class195.field3330; var131++) {
                    if (class110.field1854[var131] == var128) {
                        var130 = true;
                        break;
                    }
                }
                if (!var130 && class37.field539 == 0) {
                    class60.method394(4, class24.field365, var127, (byte) 77);
                }
            } else if (var126.method1945(arg0 ^ 0xFFFFFFF2, class30.field456)) {
                class283 var161 = var126.method1936(-63, 0, var126.method1951(class183.field3139, (byte) 22));
                long var162 = var161.method1929((byte) -24);
                boolean var164 = false;
                for (int var165 = 0; var165 < class195.field3330; var165++) {
                    if (class110.field1854[var165] == var162) {
                        var164 = true;
                        break;
                    }
                }
                if (!var164 && class37.field539 == 0) {
                    class283 var166 = var126.method1936(-63, var126.method1951(class183.field3139, (byte) 22) + 1, var126.method1925((byte) -44) + -9);
                    class60.method394(8, var166, var161, (byte) 99);
                }
            } else if (var126.method1945(-123, class236.field3958)) {
                class283 var132 = var126.method1936(-63, 0, var126.method1951(class183.field3139, (byte) 22));
                long var133 = var132.method1929((byte) -24);
                boolean var135 = false;
                for (int var136 = 0; var136 < class195.field3330; var136++) {
                    if (class110.field1854[var136] == var133) {
                        var135 = true;
                        break;
                    }
                }
                if (!var135 && class37.field539 == 0) {
                    class60.method394(10, class213.field3616, var132, (byte) 55);
                }
            } else if (var126.method1945(-128, class184.field3167)) {
                class283 var160 = var126.method1936(-63, 0, var126.method1951(class184.field3167, (byte) 22));
                class60.method394(11, var160, class213.field3616, (byte) 111);
            } else if (var126.method1945(-125, class159.field2606)) {
                class283 var137 = var126.method1936(-63, 0, var126.method1951(class159.field2606, (byte) 22));
                if (class37.field539 == 0) {
                    class60.method394(12, var137, class213.field3616, (byte) 31);
                }
            } else if (var126.method1945(arg0 ^ 0xFFFFFFF5, class254.field4297)) {
                class283 var138 = var126.method1936(arg0 - 176, 0, var126.method1951(class254.field4297, (byte) 22));
                if (class37.field539 == 0) {
                    class60.method394(13, var138, class213.field3616, (byte) 50);
                }
            } else if (var126.method1945(-121, class24.field362)) {
                boolean var155 = false;
                class283 var156 = var126.method1936(-63, 0, var126.method1951(class183.field3139, (byte) 22));
                long var157 = var156.method1929((byte) -24);
                for (int var159 = 0; var159 < class195.field3330; var159++) {
                    if (class110.field1854[var159] == var157) {
                        var155 = true;
                        break;
                    }
                }
                if (!var155 && class37.field539 == 0) {
                    class60.method394(14, class213.field3616, var156, (byte) 98);
                }
            } else if (var126.method1945(arg0 ^ 0xFFFFFFF7, class172.field2934)) {
                class283 var150 = var126.method1936(-63, 0, var126.method1951(class183.field3139, (byte) 22));
                long var151 = var150.method1929((byte) -24);
                boolean var153 = false;
                for (int var154 = 0; var154 < class195.field3330; var154++) {
                    if (class110.field1854[var154] == var151) {
                        var153 = true;
                        break;
                    }
                }
                if (!var153 && class37.field539 == 0) {
                    class60.method394(15, class213.field3616, var150, (byte) 57);
                }
            } else if (var126.method1945(arg0 ^ 0xFFFFFFF0, class111.field1874)) {
                class283 var139 = var126.method1936(arg0 ^ 0xFFFFFFB0, 0, var126.method1951(class183.field3139, (byte) 22));
                long var140 = var139.method1929((byte) -24);
                boolean var142 = false;
                for (int var143 = 0; var143 < class195.field3330; var143++) {
                    if (class110.field1854[var143] == var140) {
                        var142 = true;
                        break;
                    }
                }
                if (!var142 && class37.field539 == 0) {
                    class60.method394(16, class213.field3616, var139, (byte) 53);
                }
            } else if (var126.method1945(-128, class87.field1473)) {
                class283 var144 = var126.method1936(arg0 - 176, 0, var126.method1951(class183.field3139, (byte) 22));
                boolean var145 = false;
                long var146 = var144.method1929((byte) -24);
                for (int var148 = 0; var148 < class195.field3330; var148++) {
                    if (class110.field1854[var148] == var146) {
                        var145 = true;
                        break;
                    }
                }
                if (!var145 && class37.field539 == 0) {
                    class283 var149 = var126.method1936(-63, var126.method1951(class183.field3139, (byte) 22) + 1, var126.method1925((byte) -44) - 9);
                    class60.method394(21, var149, var144, (byte) 66);
                }
            } else {
                class60.method394(0, var126, class213.field3616, (byte) 78);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 245) {
            class283 var167 = class262.field4462.method1549(true);
            int var168 = class262.field4462.method1496(true);
            int var169 = class262.field4462.method1496(true);
            if (class162.method985(true, var169)) {
                class30.method205(var168, var167, arg0 + 24779);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 123) {
            long var170 = class262.field4462.method1495((byte) 79);
            int var172 = class262.field4462.method1496(true);
            boolean var173 = false;
            if ((var170 & Long.MIN_VALUE) != 0L) {
                var173 = true;
            }
            byte var174 = class262.field4462.method1497(false);
            if (var173) {
                if (class118.field1982 == 0) {
                    class163.field2688 = -1;
                    return true;
                }
                long var175 = var170 & Long.MAX_VALUE;
                boolean var177 = false;
                int var178;
                for (var178 = 0; class118.field1982 > var178 && (class124.field2070[var178].field1445 != var175 || class124.field2070[var178].field371 != var172); var178++) {
                }
                if (class118.field1982 > var178) {
                    while (var178 < (class118.field1982 - 1)) {
                        class124.field2070[var178] = class124.field2070[var178 + 1];
                        var178++;
                    }
                    class118.field1982--;
                    class124.field2070[class118.field1982] = null;
                }
            } else {
                class283 var179 = class262.field4462.method1549(true);
                class24 var180 = new class24();
                var180.field1445 = var170;
                var180.field360 = class232.method1567(var180.field1445, -51);
                var180.field363 = var179;
                var180.field371 = var172;
                var180.field369 = var174;
                int var181;
                for (var181 = class118.field1982 - 1; var181 >= 0; var181--) {
                    int var182 = class124.field2070[var181].field360.method1917(var180.field360, (byte) -47);
                    if (var182 == 0) {
                        class124.field2070[var181].field371 = var172;
                        class124.field2070[var181].field369 = var174;
                        class124.field2070[var181].field363 = var179;
                        if (class184.field3174 == var170) {
                            class122.field2038 = var174;
                        }
                        class163.field2688 = -1;
                        class213.field3623 = class252.field4284;
                        return true;
                    }
                    if (var182 < 0) {
                        break;
                    }
                }
                if (class124.field2070.length <= class118.field1982) {
                    class163.field2688 = -1;
                    return true;
                }
                for (int var183 = class118.field1982 - 1; var183 > var181; var183--) {
                    class124.field2070[var183 + 1] = class124.field2070[var183];
                }
                if (class118.field1982 == 0) {
                    class124.field2070 = new class24[100];
                }
                class124.field2070[var181 + 1] = var180;
                if (class184.field3174 == var170) {
                    class122.field2038 = var174;
                }
                class118.field1982++;
            }
            class163.field2688 = -1;
            class213.field3623 = class252.field4284;
            return true;
        } else if (class163.field2688 == 136) {
            int var248 = class262.field4462.method1543(255);
            int var249 = class262.field4462.method1496(true);
            int var250 = class262.field4462.method1508((byte) -128);
            if (class162.method985(true, var249)) {
                class227.method1485(var248, var250, (byte) 120);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 197) {
            int var243 = class262.field4462.method1535((byte) 98);
            int var244 = class262.field4462.method1535((byte) 104);
            int var245 = class262.field4462.method1496(true);
            int var246 = class262.field4462.method1535((byte) 70);
            int var247 = class262.field4462.method1535((byte) 95);
            class31.method213(128, var244, var247, var245, true, var243, var246);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 24) {
            int var240 = class262.field4462.method1535((byte) 69);
            int var241 = var240 >> 6;
            class290 var242 = new class290();
            var242.field4907 = var240 & 0x3F;
            var242.field4925 = class262.field4462.method1535((byte) 112);
            if (var242.field4925 >= 0 && var242.field4925 < class54.field751.length) {
                if (var242.field4907 == 1 || var242.field4907 == 10) {
                    var242.field4908 = class262.field4462.method1496(true);
                    class262.field4462.field3905 += 3;
                } else if (var242.field4907 >= 2 && var242.field4907 <= 6) {
                    if (var242.field4907 == 2) {
                        var242.field4914 = 64;
                        var242.field4927 = 64;
                    }
                    if (var242.field4907 == 3) {
                        var242.field4914 = 64;
                        var242.field4927 = 0;
                    }
                    if (var242.field4907 == 4) {
                        var242.field4914 = 64;
                        var242.field4927 = 128;
                    }
                    if (var242.field4907 == 5) {
                        var242.field4914 = 0;
                        var242.field4927 = 64;
                    }
                    if (var242.field4907 == 6) {
                        var242.field4914 = 128;
                        var242.field4927 = 64;
                    }
                    var242.field4907 = 2;
                    var242.field4919 = class262.field4462.method1496(true);
                    var242.field4916 = class262.field4462.method1496(true);
                    var242.field4910 = class262.field4462.method1535((byte) 96);
                }
                var242.field4922 = class262.field4462.method1496(true);
                if (var242.field4922 == 65535) {
                    var242.field4922 = -1;
                }
                class38.field555[var241] = var242;
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 195) {
            int var237 = class262.field4462.method1522((byte) 43);
            int var238 = class262.field4462.method1541((byte) -127);
            int var239 = class262.field4462.method1535((byte) 96);
            if (class162.method985(true, var238)) {
                class33.method221(-103, var239, var237);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 208) {
            long var221 = class262.field4462.method1495((byte) 79);
            class262.field4462.method1497(false);
            long var223 = class262.field4462.method1495((byte) 79);
            long var225 = (long) class262.field4462.method1496(true);
            long var227 = (long) class262.field4462.method1551(-122);
            long var229 = (var225 << 32) + var227;
            boolean var231 = false;
            int var232 = class262.field4462.method1535((byte) 84);
            int var233 = class262.field4462.method1496(true);
            int var234 = 0;
            label1395: while (true) {
                if (var234 >= 100) {
                    if (var232 <= 1) {
                        for (int var235 = 0; var235 < class195.field3330; var235++) {
                            if (class110.field1854[var235] == var221) {
                                var231 = true;
                                break label1395;
                            }
                        }
                    }
                    break;
                }
                if (class89.field1505[var234] == var229) {
                    var231 = true;
                    break;
                }
                var234++;
            }
            if (!var231 && class37.field539 == 0) {
                class89.field1505[class220.field3707] = var229;
                class220.field3707 = (class220.field3707 + 1) % 100;
                class283 var236 = class205.method1316(var233, 99).method2084(class262.field4462, arg0 + 4);
                if (var232 == 2 || var232 == 3) {
                    class252.method1716(var233, 20, class232.method1567(var223, -100).method1901(arg0 + 3982), arg0 - 17, var236, class299.method2022(new class283[] { class225.field3767, class232.method1567(var221, 54).method1901(4095) }, (byte) 117));
                } else if (var232 == 1) {
                    class252.method1716(var233, 20, class232.method1567(var223, 123).method1901(4095), 46, var236, class299.method2022(new class283[] { class87.field1477, class232.method1567(var221, -116).method1901(arg0 ^ 0xF8E) }, (byte) 62));
                } else {
                    class252.method1716(var233, 20, class232.method1567(var223, arg0 + 8).method1901(4095), 114, var236, class232.method1567(var221, 1).method1901(4095));
                }
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 237) {
            int var184 = class262.field4462.method1496(true);
            int var185 = class262.field4462.method1528(true);
            if (class162.method985(true, var184)) {
                class159 var186 = (class159) class58.field805.method1612((long) var185, arg0 - 10);
                if (var186 != null) {
                    class25.method173(true, 1, var186);
                }
                if (class69.field1034 != null) {
                    class272.method1834(class69.field1034, 0);
                    class69.field1034 = null;
                }
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 227) {
            class88.field1496 = 0;
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 167) {
            class302.field5115 = class262.field4462.method1522((byte) 43) * 30;
            class279.field4662 = class252.field4284;
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 220) {
            long var217 = class262.field4462.method1495((byte) 79);
            int var219 = class262.field4462.method1496(true);
            class283 var220 = class205.method1316(var219, 99).method2084(class262.field4462, arg0 ^ 0x26);
            class252.method1716(var219, 19, (class283) null, 42, var220, class232.method1567(var217, -24).method1901(4095));
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 76) {
            class297.field5029 = class262.field4462.method1535((byte) 110);
            class187.field3203 = class262.field4462.method1535((byte) 107);
            class159.field2598 = class262.field4462.method1535((byte) 76);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 103) {
            int var187 = class262.field4462.method1504(-76);
            int var188 = class262.field4462.method1532((byte) -128);
            int var189 = class262.field4462.method1541((byte) -128);
            int var190 = class262.field4462.method1508((byte) -110);
            if (class162.method985(true, var189)) {
                class15.method86(var190, var187, 908, var188);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 211) {
            class70.method459((byte) -73);
            class290.method1981(-122);
            class237.field3970 += 32;
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 116) {
            class290.method1981(66);
            class269.field4552 = class262.field4462.method1507(121);
            class279.field4662 = class252.field4284;
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 98) {
            int var191 = class262.field4462.method1521(-121);
            int var192 = class262.field4462.method1541((byte) -127);
            int var193 = class262.field4462.method1522((byte) 43);
            if (class162.method985(true, var193)) {
                class33.method221(-124, var191, var192);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 9) {
            long var203 = class262.field4462.method1495((byte) 79);
            long var205 = (long) class262.field4462.method1496(true);
            long var207 = (long) class262.field4462.method1551(53);
            int var209 = class262.field4462.method1535((byte) 96);
            int var210 = class262.field4462.method1496(true);
            boolean var211 = false;
            long var212 = (var205 << 32) + var207;
            int var214 = 0;
            label1369: while (true) {
                if (var214 >= 100) {
                    if (var209 <= 1) {
                        for (int var215 = 0; var215 < class195.field3330; var215++) {
                            if (class110.field1854[var215] == var203) {
                                var211 = true;
                                break label1369;
                            }
                        }
                    }
                    break;
                }
                if (class89.field1505[var214] == var212) {
                    var211 = true;
                    break;
                }
                var214++;
            }
            if (!var211 && class37.field539 == 0) {
                class89.field1505[class220.field3707] = var212;
                class220.field3707 = (class220.field3707 + 1) % 100;
                class283 var216 = class205.method1316(var210, 123).method2084(class262.field4462, arg0 + 9);
                if (var209 == 2) {
                    class252.method1716(var210, 18, (class283) null, 25, var216, class299.method2022(new class283[] { class225.field3767, class232.method1567(var203, arg0 ^ 0x55).method1901(4095) }, (byte) 23));
                } else if (var209 == 1) {
                    class252.method1716(var210, 18, (class283) null, 70, var216, class299.method2022(new class283[] { class87.field1477, class232.method1567(var203, arg0 - 163).method1901(4095) }, (byte) 27));
                } else {
                    class252.method1716(var210, 18, (class283) null, 36, var216, class232.method1567(var203, 124).method1901(4095));
                }
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 67) {
            class63.method407(true, arg0 ^ 0x79);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 105) {
            class40.method250(true);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 171) {
            int var198 = class262.field4462.method1525(arg0 + 6);
            int var199 = class262.field4462.method1528(true);
            int var200 = class262.field4462.method1522((byte) 43);
            int var201 = class262.field4462.method1537(2);
            if (class162.method985(true, var200)) {
                class159 var202 = (class159) class58.field805.method1612((long) var199, 100);
                if (var202 != null) {
                    class25.method173(var202.field2600 != var201, arg0 - 112, var202);
                }
                class10.method55(var199, 15, var201, var198);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 180) {
            int var195 = class262.field4462.method1534(false);
            class69 var196 = class65.method418(-8429, var195);
            for (int var197 = 0; var197 < var196.field1073.length; var197++) {
                var196.field1073[var197] = -1;
                var196.field1073[var197] = 0;
            }
            class272.method1834(var196, 0);
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 96) {
            class57.field774 = class262.field4462.method1535((byte) 76);
            class89.field1513 = class262.field4462.method1525(95);
            while (class260.field4419 > class262.field4462.field3905) {
                class163.field2688 = class262.field4462.method1535((byte) 91);
                class222.method1461((byte) 63);
            }
            class163.field2688 = -1;
            return true;
        } else if (class163.field2688 == 233) {
            int var194 = class262.field4462.method1508((byte) -112);
            class270.field4561 = class150.field2460.method1698(var194, arg0 - 84);
            class163.field2688 = -1;
            return true;
        } else {
            class296.method2011(true, "T1 - " + class163.field2688 + "," + class284.field4854 + "," + class182.field3130 + " - " + class260.field4419, (Throwable) null);
            class284.method1953(true);
            return true;
        }
    }
}
