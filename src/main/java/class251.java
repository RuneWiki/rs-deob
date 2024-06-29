import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class251 extends class120 {

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "J")
    public static long field3922 = 0L;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "[S")
    public static short[] field3924 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field3917 = -1;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "Llm;")
    public static class150 field3923 = new class150(64);

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "I")
    public int field3927;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "Lki;")
    public class142 field3919;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "[B")
    public byte[] field3926;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)I")
    public final int method348(int arg0) {
        ++field3920;
        if (super.field1712) {
            return 0;
        } else {
            return arg0 >= -55 ? 58 : 100;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZIII)V")
    public static final void method1630(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field3925;
        for (class309 var5 = (class309) class153.field2128.method369((byte) -112); var5 != null; var5 = (class309) class153.field2128.method362(false)) {
            class85.method553(-121, arg4, var5, arg0, arg3, arg2);
        }
        for (class309 var6 = (class309) class75.field1056.method369((byte) -90); var6 != null; var6 = (class309) class75.field1056.method362(false)) {
            byte var11 = 1;
            class85 var12 = var6.field4966.method1685(0);
            if (~var6.field4966.field4102 != ~var12.field1201) {
                if (~var6.field4966.field4102 != ~var12.field1199 && ~var6.field4966.field4102 != ~var12.field1223 && var6.field4966.field4102 != var12.field1220 && ~var6.field4966.field4102 != ~var12.field1214) {
                    if (~var6.field4966.field4102 == ~var12.field1192 || ~var6.field4966.field4102 == ~var12.field1229 || ~var6.field4966.field4102 == ~var12.field1217 || ~var6.field4966.field4102 == ~var12.field1231) {
                        var11 = 3;
                    }
                } else {
                    var11 = 2;
                }
            } else {
                var11 = 0;
            }
            if (~var6.field4967 != ~var11) {
                int var13 = class157.method974(120, var6.field4966);
                if (var6.field4960 != var13) {
                    if (var6.field4979 != null) {
                        class116.field1671.method910(var6.field4979);
                        var6.field4979 = null;
                    }
                    var6.field4960 = var13;
                }
                var6.field4967 = var11;
            }
            var6.field4980 = var6.field4966.field4081;
            var6.field4969 = var6.field4966.field4081 - -(var6.field4966.method1683(-118) * 64);
            var6.field4971 = var6.field4966.field4140;
            var6.field4959 = var6.field4966.field4140 + 64 * var6.field4966.method1683(-74);
            class85.method553(-126, arg4, var6, arg0, arg3, arg2);
        }
        if (arg1) {
            field3922 = -8L;
        }
        for (class309 var7 = (class309) class274.field4357.method1458(0); var7 != null; var7 = (class309) class274.field4357.method1462(-10000001)) {
            byte var8 = 1;
            class85 var9 = var7.field4983.method1685(0);
            if (var7.field4983.field4102 == var9.field1201) {
                var8 = 0;
            } else if (var7.field4983.field4102 != var9.field1199 && ~var7.field4983.field4102 != ~var9.field1223 && var7.field4983.field4102 != var9.field1220 && ~var7.field4983.field4102 != ~var9.field1214) {
                if (var7.field4983.field4102 == var9.field1192 || ~var7.field4983.field4102 == ~var9.field1229 || var7.field4983.field4102 == var9.field1217 || var7.field4983.field4102 == var9.field1231) {
                    var8 = 3;
                }
            } else {
                var8 = 2;
            }
            if (~var7.field4967 != ~var8) {
                int var10 = class58.method366(3640, var7.field4983);
                if (var7.field4960 != var10) {
                    if (var7.field4979 != null) {
                        class116.field1671.method910(var7.field4979);
                        var7.field4979 = null;
                    }
                    var7.field4960 = var10;
                }
                var7.field4967 = var8;
            }
            var7.field4980 = var7.field4983.field4081;
            var7.field4969 = var7.field4983.field4081 - -(64 * var7.field4983.method1683(-120));
            var7.field4971 = var7.field4983.field4140;
            var7.field4959 = var7.field4983.field4140 + var7.field4983.method1683(-92) * 64;
            class85.method553(-124, arg4, var7, arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public static final void method1631(byte arg0) {
        class312.method2108(false, class8.field92);
        ++class274.field4356;
        ++field3916;
        if (class171.field2442 && class225.field3529) {
            int var1 = class17.field304;
            int var2 = class249.field3891;
            int var3 = var1 - class38.field579;
            int var4 = var2 - class252.field3944;
            if (class138.field1892 > var4) {
                var4 = class138.field1892;
            }
            if (var4 - -class8.field92.field2571 > class138.field1892 - -class276.field4384.field2571) {
                var4 = class138.field1892 + class276.field4384.field2571 + -class8.field92.field2571;
            }
            if (~class98.field1429 < ~var3) {
                var3 = class98.field1429;
            }
            if (~(class8.field92.field2529 + var3) < ~(class98.field1429 + class276.field4384.field2529)) {
                var3 = class98.field1429 - -class276.field4384.field2529 - class8.field92.field2529;
            }
            int var5 = -class169.field2412 + var4;
            int var6 = -class98.field1429 - -class276.field4384.field2644 + var3;
            int var7 = class8.field92.field2700;
            int var8 = var3 - field3917;
            int var9 = class276.field4384.field2701 + var4 + -class138.field1892;
            if (class8.field92.field2687 < class274.field4356 && (~var7 > ~var8 || ~var8 > ~(-var7) || var5 > var7 || var5 < -var7)) {
                class275.field4372 = true;
            }
            if (class8.field92.field2655 != null && class275.field4372) {
                class272 var10 = new class272();
                var10.field4330 = var6;
                var10.field4334 = var9;
                var10.field4337 = class8.field92;
                var10.field4340 = class8.field92.field2655;
                class160.method994((byte) -112, var10);
            }
            if (~class205.field3074 == -1) {
                if (class275.field4372) {
                    if (class8.field92.field2670 != null) {
                        class272 var11 = new class272();
                        var11.field4345 = class50.field713;
                        var11.field4337 = class8.field92;
                        var11.field4334 = var9;
                        var11.field4340 = class8.field92.field2670;
                        var11.field4330 = var6;
                        class160.method994((byte) -112, var11);
                    }
                    if (class50.field713 != null && client.method2038(class8.field92) != null) {
                        class231.field3614.method809(44, 0);
                        class231.field3614.method1385(class50.field713.field2576, true);
                        class231.field3614.method1381(class8.field92.field2545, -80);
                        ++class78.field1081;
                        class231.field3614.method1371(class8.field92.field2576, -72);
                        class231.field3614.method1375(class50.field713.field2545, -98);
                    }
                } else if ((class60.field835 == 1 || class147.method924(class179.field2721 + -1, true)) && class179.field2721 > 2) {
                    class160.method996((byte) -87);
                } else if (~class179.field2721 < -1) {
                    class37.method253((byte) -125);
                }
                class8.field92 = null;
            }
            if (arg0 > -65) {
                method1633((byte) 13);
            }
        } else {
            if (~class274.field4356 < -2) {
                class8.field92 = null;
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "(I)[B")
    public final byte[] method345(int arg0) {
        ++field3928;
        if (super.field1712) {
            throw new RuntimeException();
        } else {
            if (arg0 < 54) {
                method1631((byte) -49);
            }
            return this.field3926;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)V")
    public static final void method1632(byte arg0) {
        ++field3918;
        class157.field2162.method381((byte) 127);
        for (int var1 = 0; var1 < 32; ++var1) {
            class53.field751[var1] = 0L;
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class213.field3208[var2] = 0L;
        }
        class144.field1971 = 0;
        int var3 = 121 / ((40 - arg0) / 33);
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V")
    public static void method1633(byte arg0) {
        field3924 = null;
        field3923 = null;
        if (arg0 < 104) {
            method1632((byte) -20);
        }
    }
}
