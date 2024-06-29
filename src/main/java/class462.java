import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class462 extends class100 {

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Lec;")
    public static class40 field6509 = new class40("K", "T", "K", "K");

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public static int field6513 = 503;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "Lpn;")
    public static class72 field6517 = new class72(80, 4);

    @OriginalMember(owner = "client!h", name = "G", descriptor = "Lec;")
    public static class40 field6520 = new class40(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public int field6507;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public int field6511;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public int field6512;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "J")
    public long field6510;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(B)I")
    public final int method488(byte arg0) {
        if (arg0 <= 5) {
            return 109;
        } else {
            field6506++;
            return this.field6512;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)I")
    public static final int method2719(int arg0) {
        field6518++;
        if (class484.field6868 == null) {
            if (!class385.field5517 && class223.field3099 > 0) {
                if (class224.field3100 && class308.field4529.method1689((byte) -118, 81) && class223.field3099 > 2) {
                    return ((class158) class485.field6882.field1985.field1777.field1777).field1888;
                }
                return ((class158) class485.field6882.field1985.field1777).field1888;
            }
            int var1 = class278.field3966.method837(-1);
            int var2 = class278.field3966.method838(arg0 ^ 0xFFFFFFE9);
            int var3 = class150.field1822;
            int var4 = class274.field3913;
            int var5 = class345.field4933;
            if (var1 > var3 && var1 < (var3 + var5)) {
                int var6 = -1;
                for (int var7 = 0; var7 < class223.field3099; var7++) {
                    if (class371.field5311) {
                        int var12 = var4 - (-((class223.field3099 - var7 - 1) * 16) - 33);
                        if (var2 > var12 - 13 && var2 <= (var12 + 3)) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class223.field3099 - var7 - 1) * 16 + (var4 + 31);
                        if ((var11 - 13) < var2 && var2 <= var11 + 3) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class432 var9 = new class432(class485.field6882);
                    for (class158 var10 = (class158) var9.method2583(0); var10 != null; var10 = (class158) var9.method2582((byte) -128)) {
                        if (var8++ == var6) {
                            return var10.field1888;
                        }
                    }
                }
            }
        }
        if (arg0 != 16) {
            field6509 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(B)I")
    public static final int method2720(byte arg0) {
        field6508++;
        try {
            if (class112.field1379 == 0) {
                if (class434.method2591(-19310) - 5000L < class176.field2129) {
                    return 0;
                }
                class187.field2527 = class42.field512.method2175(class302.field4488, (byte) 127, class104.field1258);
                class448.field6362 = class434.method2591(-19310);
                class112.field1379 = 1;
            }
            if (class434.method2591(-19310) > (class448.field6362 + 30000L)) {
                return class428.method2551(1000, 0);
            }
            if (class112.field1379 == 1) {
                if (class187.field2527.field5759 == 2) {
                    return class428.method2551(1001, 0);
                }
                if (class187.field2527.field5759 != 1) {
                    return -1;
                }
                class322.field4655 = new class142((Socket) class187.field2527.field5755, class42.field512);
                class187.field2527 = null;
                int var1 = 0;
                if (class470.field6631) {
                    var1 = class486.field6893;
                }
                class230.field3185.field2206 = 0;
                class230.field3185.method909(class214.field2955.field4563, -1);
                class230.field3185.method897(var1, -106);
                class322.field4655.method675(class230.field3185.field2206, 0, (byte) 65, class230.field3185.field2159);
                if (class46.field594 != null) {
                    class46.field594.method2655((byte) 106);
                }
                if (class460.field6501 != null) {
                    class460.field6501.method2655((byte) 106);
                }
                int var2 = class322.field4655.method673(-2101);
                if (class46.field594 != null) {
                    class46.field594.method2655((byte) 106);
                }
                if (class460.field6501 != null) {
                    class460.field6501.method2655((byte) 106);
                }
                if (var2 != 0) {
                    return class428.method2551(var2, 0);
                }
                class112.field1379 = 2;
            }
            if (class112.field1379 == 2) {
                if (class322.field4655.method676((byte) 110) < 2) {
                    return -1;
                }
                class401.field5717 = class322.field4655.method673(-2101);
                class401.field5717 <<= 0x8;
                class401.field5717 += class322.field4655.method673(-2101);
                class422.field6098 = 0;
                class112.field1379 = 3;
                class329.field4738 = new byte[class401.field5717];
            }
            if (class112.field1379 != 3) {
                int var7 = -4 % ((arg0 + 81) / 33);
                return -1;
            }
            int var3 = class322.field4655.method676((byte) 96);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class401.field5717 - class422.field6098) {
                var3 = class401.field5717 - class422.field6098;
            }
            class322.field4655.method672(class329.field4738, class422.field6098, (byte) -92, var3);
            class422.field6098 += var3;
            if (class422.field6098 < class401.field5717) {
                return -1;
            } else if (class474.method2807(class329.field4738, 0)) {
                class28.field368 = new class239[class362.field5219];
                int var4 = 0;
                for (int var5 = class345.field4935; var5 <= class148.field1792; var5++) {
                    class239 var6 = class199.method1090(128, var5);
                    if (var6 != null) {
                        class28.field368[var4++] = var6;
                    }
                }
                class76.field916 = 0;
                class346.field4947 = null;
                class322.field4655.method669(5000);
                class322.field4655 = null;
                class112.field1379 = 0;
                class159.field1899 = 0;
                class329.field4738 = null;
                class176.field2129 = class434.method2591(-19310);
                return 0;
            } else {
                return class428.method2551(1002, 0);
            }
        } catch (IOException var8) {
            return class428.method2551(1003, 0);
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(B)I")
    public final int method487(byte arg0) {
        field6516++;
        if (arg0 != 96) {
            field6517 = null;
        }
        return this.field6507;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)J")
    public final long method489(boolean arg0) {
        if (!arg0) {
            this.method490(-105);
        }
        field6515++;
        return this.field6510;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V")
    public static void method2721(boolean arg0) {
        field6509 = null;
        field6517 = null;
        field6520 = null;
        if (arg0) {
            field6509 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BILjava/lang/String;Z)Z")
    public static final boolean method2722(byte arg0, int arg1, String arg2, boolean arg3) {
        field6519++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        if (arg0 < 77) {
            method2720((byte) 44);
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg1 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)I")
    public final int method490(int arg0) {
        if (arg0 != 0) {
            this.method488((byte) 14);
        }
        field6514++;
        return this.field6511;
    }
}
