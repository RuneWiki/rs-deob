import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class303 {

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Ldb;")
    public static class102 field4754 = new class102(64);

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Z")
    public static boolean field4756 = false;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2158(byte arg0) {
        class36.field478.method702((byte) 126);
        if (arg0 < 29) {
            method2161(-29);
        }
        field4753++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I", line = 23)
    public static final int method2159(int arg0) {
        field4752++;
        try {
            if (arg0 != 420) {
                return 21;
            }
            if (class159.field2622 == 0) {
                if (class236.field3790 > class283.method2038((byte) 125) - 5000L) {
                    return 0;
                }
                class108.field1608 = class14.field159.method904(class245.field3877, 82, class147.field2281);
                class84.field1179 = class283.method2038((byte) 127);
                class159.field2622 = 1;
            }
            if (class283.method2038((byte) 127) > class84.field1179 + 30000L) {
                return class119.method833((byte) 118, 1000);
            }
            if (class159.field2622 == 1) {
                if (class108.field1608.field2661 == 2) {
                    return class119.method833((byte) 46, 1001);
                }
                if (class108.field1608.field2661 != 1) {
                    return -1;
                }
                class320.field4966 = new class15((Socket) class108.field1608.field2664, class14.field159);
                class108.field1608 = null;
                class194.field3175.field586 = 0;
                int var1 = 0;
                if (class103.field1507) {
                    var1 = class20.field297;
                }
                class194.field3175.method257(-2, 23);
                class194.field3175.method283((byte) -51, var1);
                class320.field4966.method85((byte) -100, class194.field3175.field586, class194.field3175.field573, 0);
                if (class198.field3225 != null) {
                    class198.field3225.method2219(108);
                }
                if (class49.field693 != null) {
                    class49.field693.method2219(96);
                }
                int var2 = class320.field4966.method86((byte) 118);
                if (class198.field3225 != null) {
                    class198.field3225.method2219(arg0 ^ 0x1FD);
                }
                if (class49.field693 != null) {
                    class49.field693.method2219(arg0 - 306);
                }
                if (var2 != 0) {
                    return class119.method833((byte) 34, var2);
                }
                class159.field2622 = 2;
            }
            if (class159.field2622 == 2) {
                if (class320.field4966.method87(arg0 + 4580) < 2) {
                    return -1;
                }
                class86.field1193 = class320.field4966.method86((byte) 118);
                class86.field1193 <<= 0x8;
                class86.field1193 += class320.field4966.method86((byte) 118);
                class159.field2622 = 3;
                class245.field3869 = 0;
                class256.field4082 = new byte[class86.field1193];
            }
            if (class159.field2622 != 3) {
                return -1;
            }
            int var3 = class320.field4966.method87(5000);
            if (var3 < 1) {
                return -1;
            }
            if (class86.field1193 - class245.field3869 < var3) {
                var3 = class86.field1193 - class245.field3869;
            }
            class320.field4966.method89(var3, true, class256.field4082, class245.field3869);
            class245.field3869 += var3;
            if (class245.field3869 < class86.field1193) {
                return -1;
            } else if (class318.method2237((byte) 32, class256.field4082)) {
                int var4 = 0;
                class340.field5293 = new class339[class24.field334];
                for (int var5 = class108.field1604; var5 <= class145.field2262; var5++) {
                    class339 var6 = class105.method719(127, var5);
                    if (var6 != null) {
                        class340.field5293[var4++] = var6;
                    }
                }
                class320.field4966.method91(-45);
                class320.field4966 = null;
                class256.field4082 = null;
                class159.field2622 = 0;
                class110.field1633 = 0;
                class236.field3790 = class283.method2038((byte) 127);
                return 0;
            } else {
                return class119.method833((byte) 72, 1002);
            }
        } catch (IOException var8) {
            return class119.method833((byte) 119, 1003);
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V", line = 159)
    public static void method2160(int arg0) {
        if (arg0 != 50) {
            method2158((byte) -69);
        }
        field4754 = null;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V", line = 170)
    public static final void method2161(int arg0) {
        class331 var1 = class63.field917;
        synchronized (class63.field917) {
            class184.field3061++;
            class99.field1446 = class320.field4967;
            int var2 = -86 % ((arg0 - 49) / 48);
            class70.field995 = class196.field3193;
            class233.field3738 = class177.field2954;
            class160.field2642 = class77.field1093;
            class105.field1542 = class274.field4414;
            class198.field3221 = class217.field3517;
            class226.field3608 = class297.field4692;
            class77.field1093 = 0;
        }
        field4755++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)Z", line = 201)
    public static final boolean method2162(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class20.field286 * arg3 + class157.field2606 * arg0 >> 16;
        int var6 = class157.field2606 * arg3 - class20.field286 * arg0 >> 16;
        int var7 = class259.field4143 * arg1 + class137.field2162 * var6 >> 16;
        int var8 = class137.field2162 * arg1 - class259.field4143 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class259.field4143 * arg2 + class137.field2162 * var6 >> 16;
        int var12 = class137.field2162 * arg2 - class259.field4143 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class74.field1050 && var13 < class74.field1050) {
            return false;
        } else if (var9 > class99.field1443 && var13 > class99.field1443) {
            return false;
        } else if (var10 < class100.field1458 && var14 < class100.field1458) {
            return false;
        } else {
            return var10 <= class207.field3414 || var14 <= class207.field3414;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V", line = 249)
    public static final void method2163(byte arg0) {
        int var1 = 26 % ((arg0 + 61) / 45);
        field4751++;
        class202.field3307.method707(0);
    }
}
