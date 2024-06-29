import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class40 extends class37 {

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field805 = 0;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field806 = 1;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Lo;")
    public static class84 field807 = class15.method124("Unable to find ", 255);

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "[Ld;")
    public static class19[] field817 = new class19[5];

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field814 = 2;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field818 = 99;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field815 = 1;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field808 = 0;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field820 = -1;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "Lud;")
    public static class118 field813;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "Lo;")
    public class84 field819;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)Lae;", line = 29)
    public static final class6 method352(byte arg0, int arg1) {
        field809++;
        class6 var2 = (class6) class25.field410.method737((long) arg1, (byte) -75);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class78.field1653.method909((byte) -124, arg1, 14);
        class6 var4 = new class6();
        if (arg0 > -17) {
            field815 = -97;
        }
        if (var3 != null) {
            var4.method41(new class27(var3), (byte) -127);
        }
        class25.field410.method744(-121, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V", line = 56)
    public static void method353(byte arg0) {
        field813 = null;
        if (arg0 != 111) {
            method354(-125);
        }
        field817 = null;
        field807 = null;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I", line = 68)
    public static final int method354(int arg0) {
        if (arg0 != 22987) {
            method355(null, 90, null);
        }
        field804++;
        return class67.field1472++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lo;ILeb;)I", line = 80)
    public static final int method355(class84 arg0, int arg1, class27 arg2) {
        field816++;
        if (arg1 <= 106) {
            field808 = -43;
        }
        int var3 = arg2.field482;
        arg2.method218(arg0.field1906, (byte) -47);
        arg2.field482 += class116.field2541.method684(arg0.field1869, arg0.field1906, arg2.field502, 0, (byte) -96, arg2.field482);
        return arg2.field482 - var3;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)Z", line = 97)
    public static final boolean method356(byte arg0) {
        long var1 = System.currentTimeMillis();
        field810++;
        int var3 = (int) (var1 - class37.field721);
        if (var3 > 200) {
            var3 = 200;
        }
        class37.field721 = var1;
        class71.field1491 += var3;
        if (class112.field2435 == 0 && class115.field2495 == 0 && class51.field1091 == 0 && class3.field33 == 0) {
            return true;
        }
        if (arg0 <= 7) {
            method356((byte) -21);
        }
        if (class37.field722 == null) {
            return false;
        }
        try {
            if (class71.field1491 > 30000) {
                throw new IOException();
            }
            while (class115.field2495 < 20 && class3.field33 > 0) {
                class48 var4 = (class48) class112.field2423.method60((byte) -102);
                class27 var5 = new class27(4);
                var5.method226(-9646, 1);
                var5.method211((byte) -48, (int) var4.field731);
                class37.field722.method396(var5.field502, 4, 0, true);
                class89.field2019.method71(126, var4, var4.field731);
                class3.field33--;
                class115.field2495++;
            }
            while (class112.field2435 < 20 && class51.field1091 > 0) {
                class48 var6 = (class48) class86.field1959.method674(-1);
                class27 var7 = new class27(4);
                var7.method226(-9646, 0);
                var7.method211((byte) -48, (int) var6.field731);
                class37.field722.method396(var7.field502, 4, 0, true);
                var6.method461(55);
                class42.field852.method71(126, var6, var6.field731);
                class51.field1091--;
                class112.field2435++;
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = class37.field722.method393(0);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                class71.field1491 = 0;
                byte var10 = 0;
                if (class109.field2373 == null) {
                    var10 = 8;
                } else if (class12.field242 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - class116.field2514.field482;
                    if (var9 < var11) {
                        var11 = var9;
                    }
                    class37.field722.method390(class116.field2514.field482, var11, (byte) 84, class116.field2514.field502);
                    if (class8.field158 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            class116.field2514.field502[class116.field2514.field482 + var12] = (byte) class82.method595(class116.field2514.field502[class116.field2514.field482 + var12], class8.field158);
                        }
                    }
                    class116.field2514.field482 += var11;
                    if (class116.field2514.field482 < var10) {
                        break;
                    }
                    if (class109.field2373 == null) {
                        class116.field2514.field482 = 0;
                        int var13 = class116.field2514.method231(255);
                        int var14 = class116.field2514.method227(127);
                        int var15 = class116.field2514.method231(255);
                        int var16 = class116.field2514.method251((byte) 105);
                        long var17 = (long) ((var13 << 16) + var14);
                        class48 var19 = (class48) class89.field2019.method66(120, var17);
                        class112.field2426 = true;
                        if (var19 == null) {
                            var19 = (class48) class42.field852.method66(126, var17);
                            class112.field2426 = false;
                        }
                        if (var19 == null) {
                            throw new IOException();
                        }
                        class109.field2373 = var19;
                        int var20 = var15 == 0 ? 5 : 9;
                        class35.field693 = new class27(class109.field2373.field1002 + var20 + var16);
                        class35.field693.method226(-9646, var15);
                        class35.field693.method248(var16, -2147393384);
                        class116.field2514.field482 = 0;
                        class12.field242 = 8;
                    } else if (class12.field242 == 0) {
                        if (class116.field2514.field502[0] == -1) {
                            class12.field242 = 1;
                            class116.field2514.field482 = 0;
                        } else {
                            class109.field2373 = null;
                        }
                    }
                } else {
                    int var21 = class35.field693.field502.length - class109.field2373.field1002;
                    int var22 = 512 - class12.field242;
                    if (var22 > var21 - class35.field693.field482) {
                        var22 = var21 - class35.field693.field482;
                    }
                    if (var9 < var22) {
                        var22 = var9;
                    }
                    class37.field722.method390(class35.field693.field482, var22, (byte) 127, class35.field693.field502);
                    if (class8.field158 != 0) {
                        for (int var23 = 0; var23 < var22; var23++) {
                            class35.field693.field502[class35.field693.field482 + var23] = (byte) class82.method595(class35.field693.field502[class35.field693.field482 + var23], class8.field158);
                        }
                    }
                    class35.field693.field482 += var22;
                    class12.field242 += var22;
                    if (class35.field693.field482 == var21) {
                        if (class109.field2373.field731 == 16711935L) {
                            class49.field1066 = class35.field693;
                            for (int var24 = 0; var24 < 256; var24++) {
                                class5 var25 = class101.field2162[var24];
                                if (var25 != null) {
                                    class49.field1066.field482 = var24 * 4 + 5;
                                    int var26 = class49.field1066.method251((byte) 105);
                                    var25.method30(true, var26);
                                }
                            }
                        } else {
                            class122.field2711.reset();
                            class122.field2711.update(class35.field693.field502, 0, var21);
                            int var27 = (int) class122.field2711.getValue();
                            if (class109.field2373.field1005 != var27) {
                                try {
                                    class37.field722.method395(-9098);
                                } catch (Exception var29) {
                                }
                                class8.field158 = (byte) (Math.random() * 255.0D + 1.0D);
                                class37.field722 = null;
                                class84.field1916++;
                                return false;
                            }
                            class84.field1916 = 0;
                            class120.field2658 = 0;
                            class109.field2373.field1004.method29(class35.field693.field502, class112.field2426, (class109.field2373.field731 & 0xFF0000L) == 16711680L, (int) (class109.field2373.field731 & 0xFFFFL), 117);
                        }
                        class109.field2373.method333(0);
                        class35.field693 = null;
                        class12.field242 = 0;
                        class109.field2373 = null;
                        if (class112.field2426) {
                            class115.field2495--;
                        } else {
                            class112.field2435--;
                        }
                    } else {
                        if (class12.field242 != 512) {
                            break;
                        }
                        class12.field242 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var30) {
            try {
                class37.field722.method395(-9098);
            } catch (Exception var28) {
            }
            class120.field2658++;
            class37.field722 = null;
            return false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V", line = 402)
    public static final void method357(int arg0) {
        field811++;
        if (class79.field1686 > 0) {
            class73.method551(-77);
        } else {
            class8.method63(40, false);
            if (arg0 == -19030) {
                class42.field862 = class82.field1764;
            }
        }
    }
}
