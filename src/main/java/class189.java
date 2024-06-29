import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class189 extends class136 {

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "[B")
    public byte[] field3660;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "Li;")
    public static class88 field3663 = class208.method1425(105, "leuchten3:");

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field3661 = -1;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "Li;")
    private static class88 field3665 = class208.method1425(105, "Continue");

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "Li;")
    public static class88 field3667 = field3665;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)V")
    public static final void method1317(byte arg0) {
        int var1 = -65 / ((arg0 - 11) / 57);
        field3664++;
        if (class150.field2917 > class59.field1110) {
            class59.field1110 += class59.field1110 / 30.0D;
            if (class59.field1110 > class150.field2917) {
                class59.field1110 = class150.field2917;
            }
            class245.method1606(0);
        } else if (class150.field2917 < class59.field1110) {
            class59.field1110 -= class59.field1110 / 30.0D;
            if (class150.field2917 > class59.field1110) {
                class59.field1110 = class150.field2917;
            }
            class245.method1606(0);
        }
        if (field3661 == -1 || class34.field594 == -1) {
            return;
        }
        int var2 = field3661 - class126.field2332;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        int var3 = class34.field594 - class157.field3035;
        if (var3 < 2 || var3 > 2) {
            var3 >>= 0x4;
        }
        class157.field3035 += var3;
        class126.field2332 += var2;
        if (var2 == 0 && var3 == 0) {
            field3661 = -1;
            class34.field594 = -1;
        }
        class245.method1606(0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLnb;Lnb;)V")
    public static final void method1318(byte arg0, class144 arg1, class144 arg2) {
        if (arg0 < 110) {
            field3667 = null;
        }
        class62.field1146 = arg1;
        field3668++;
        class66.field1199 = arg2;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
    public static void method1319(int arg0) {
        field3667 = null;
        field3663 = null;
        if (arg0 != -1400) {
            method1318((byte) 18, null, null);
        }
        field3665 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLnb;Ldg;Lnb;B)V")
    public static final void method1320(boolean arg0, class144 arg1, class41 arg2, class144 arg3, byte arg4) {
        class156.field3010 = arg3;
        field3666++;
        class142.field2625 = arg0;
        class236.field4402 = arg1;
        if (arg4 == 17) {
            int var5 = class236.field4402.method942((byte) -100) - 1;
            class202.field3857 = var5 * 256 + class236.field4402.method944(arg4 + 111, var5);
            class180.field3573 = arg2;
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)V")
    public static final void method1321(byte arg0) {
        field3662++;
        if (class20.field319 == null) {
            return;
        }
        if (class228.field4278 < 10) {
            if (!class130.field2442.method956(-128, class20.field319)) {
                class228.field4278 = class130.field2442.method959(class20.field319, (byte) 116) / 10;
                return;
            }
            class228.field4278 = 10;
        }
        if (class228.field4278 != 10) {
            if (arg0 < 124) {
                field3665 = null;
            }
            if (class228.field4278 == 20) {
                class161.method1087(-3131, class130.field2442.method962(0, class20.field319, client.field570));
                class228.field4278 = 30;
                class108.method740(false);
            } else if (class228.field4278 == 30) {
                class150.method1031(class130.field2442.method962(0, class20.field319, class21.field325), 4607);
                class228.field4278 = 50;
                class108.method740(false);
            } else if (class228.field4278 == 50) {
                class218.method1475(class130.field2442.method962(0, class20.field319, class223.field4210), 113);
                class228.field4278 = 70;
                class108.method740(false);
            } else if (class228.field4278 == 70) {
                class143.method939(class130.field2442.method962(0, class20.field319, class170.field3256), (byte) -96);
                class228.field4278 = 90;
                class108.method740(false);
            } else {
                class90.method659(class130.field2442.method962(0, class20.field319, class25.field404), (byte) -121);
                if (class228.field4278 == 90) {
                    class12.field175 = new class75(11, true, class154.field2977);
                    class118.field2149 = new class75(12, true, class154.field2977);
                    class236.field4399 = new class75(14, true, class154.field2977);
                    class196.field3764 = new class75(17, true, class154.field2977);
                    class167.field3207 = new class75(19, true, class154.field2977);
                    class166.field3201 = new class75(22, true, class154.field2977);
                    class231.field4327 = new class75(26, true, class154.field2977);
                    class227.field4252 = new class75(30, true, class154.field2977);
                    class228.field4278 = 100;
                }
                field3661 = -1;
                class228.field4278 = 100;
                class34.field594 = -1;
                class108.method740(false);
                System.gc();
            }
            return;
        }
        class46 var1 = new class46(class130.field2442.method962(0, class20.field319, class80.field1444));
        int var2 = var1.method301(101);
        int var3 = var1.method301(82);
        int var4 = var1.method301(68);
        int var5 = var1.method301(47);
        int var6 = var1.method301(72);
        int var7 = var1.method301(71);
        class119.field2183 = var3 * 64;
        class16.field239 = var2 * 64;
        class59.field1110 = 8.0D;
        class150.field2917 = 8.0D;
        class54.field1009 = new int[class151.field2925 + 1];
        class44.field760 = (var5 - var3) * 64 + 64;
        class109.field1990 = (var4 + 1 - var2) * 64;
        int var8 = class190.field3681 + (class240.field4458.field4123 >> 7) - class119.field2183;
        int var9 = (class240.field4458.field4138 >> 7) + class223.field4214 - class16.field239;
        int var10 = var9 + (int) (Math.random() * 10.0D) - 5;
        int var11 = var8 + (int) (Math.random() * 10.0D) - 5;
        int var12 = class44.field760 >> 6;
        int var13 = class109.field1990 >> 6;
        class216.field4054 = new byte[var13][var12][];
        class7.field105 = new byte[var13][var12][];
        class105.field1914 = new int[var13][var12][];
        class97.field1788 = new byte[var13][var12][];
        class220.field4168 = new byte[var13][var12][];
        int var14 = class70.field1270 >> 1;
        class117.field2128 = new byte[var13][var12][];
        if (var10 >= 0 && var10 < class109.field1990 && var11 >= 0 && class44.field760 > var11) {
            class157.field3035 = class44.field760 - var11;
            class126.field2332 = var10;
        } else {
            class157.field3035 = class119.field2183 + class44.field760 - var7 * 64;
            class126.field2332 = var6 * 64 - class16.field239;
        }
        int var15 = class218.field4088 >> 2 << 10;
        class48.field895 = new int[var13][var12][];
        class208.field3953 = new byte[var13][var12][];
        for (int var16 = 0; var16 < class151.field2925; var16++) {
            class7 var17 = class101.method706(var16, true);
            if (var17 != null) {
                int var18 = var17.field98;
                if (var18 >= 0 && !class173.field3358.method436(var18, (byte) -97)) {
                    var18 = -1;
                }
                int var22;
                if (var17.field104 >= 0) {
                    int var19 = var17.field104;
                    int var20 = (var19 & 0x7F) + var14;
                    if (var20 < 0) {
                        var20 = 0;
                    } else if (var20 > 127) {
                        var20 = 127;
                    }
                    int var21 = (var19 & 0x380) + ((var15 + var19 & 0xFC00) + var20);
                    var22 = class173.field3351[class31.method202(12345678, 96, var21)];
                } else if (var18 >= 0) {
                    var22 = class173.field3351[class31.method202(12345678, 96, class173.field3358.method438(125, var18))];
                } else if (var17.field111 == -1) {
                    var22 = -1;
                } else {
                    int var23 = var17.field111;
                    int var24 = (var23 & 0x7F) + var14;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > 127) {
                        var24 = 127;
                    }
                    int var25 = (var15 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                    var22 = class173.field3351[class31.method202(12345678, 96, var25)];
                }
                class54.field1009[var16 + 1] = var22;
            }
        }
        class228.field4278 = 20;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1322(int arg0, int arg1, int arg2, int arg3) {
        if (class239.method1583(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class104.method720(var4 + 1, class62.field1137[arg0][arg1][arg2] + arg3, var5 + 1) && class104.method720(var4 + 128 - 1, class62.field1137[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class104.method720(var4 + 128 - 1, class62.field1137[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class104.method720(var4 + 1, class62.field1137[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B)V")
    public class189(byte[] arg0) {
        this.field3660 = arg0;
    }
}
