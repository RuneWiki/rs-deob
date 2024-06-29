import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class449 {

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public int field6250;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public int field6249;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public int field6260;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "B")
    public byte field6253;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public int field6258;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public int field6257;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Loi;")
    public static class169 field6244 = new class169("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "[B")
    public static byte[] field6255 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "[I")
    public static int[] field6254 = new int[2];

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Lbb;")
    public class309 field6248;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Los;")
    public class383 field6259;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lkl;")
    public class384 field6246;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Lhs;")
    public static class441 field6252;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Leb;")
    public class59 field6251;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)V")
    public static final void method2660(int arg0, byte arg1) {
        class32.field527 = arg0;
        field6242++;
        if (arg1 != 0) {
            field6255 = null;
        }
        class24.field429.method90((byte) -27);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
    public static final int method2661(int arg0) {
        field6247++;
        try {
            if (class504.field7406 == 0) {
                if (class57.field759 > (class173.method1134(true) - 5000L)) {
                    return 0;
                }
                class398.field5297 = class172.field2221.method2622(class512.field7541, class474.field6929, -1727);
                class93.field1303 = class173.method1134(true);
                class504.field7406 = 1;
            }
            if (class173.method1134(true) > class93.field1303 + 30000L) {
                return class74.method423(0, 1000);
            }
            if (class504.field7406 == 1) {
                if (class398.field5297.field3542 == 2) {
                    return class74.method423(arg0 - 2, 1001);
                }
                if (class398.field5297.field3542 != 1) {
                    return -1;
                }
                class286.field3643 = new class144((Socket) class398.field5297.field3541, class172.field2221);
                class398.field5297 = null;
                int var1 = 0;
                if (class503.field7399) {
                    var1 = class188.field2467;
                }
                class319.field4112.field1176 = 0;
                class319.field4112.method565(-99, class275.field3521.field195);
                class319.field4112.method572(arg0 - 125, var1);
                class286.field3643.method1001(0, (byte) -113, class319.field4112.field1223, class319.field4112.field1176);
                class114.method741((byte) 111);
                int var2 = class286.field3643.method1000((byte) 29);
                class114.method741((byte) 33);
                if (var2 != 0) {
                    return class74.method423(0, var2);
                }
                class504.field7406 = 2;
            }
            if (class504.field7406 == arg0) {
                if (class286.field3643.method1004(3) < 2) {
                    return -1;
                }
                class231.field2994 = class286.field3643.method1000((byte) 29);
                class231.field2994 <<= 0x8;
                class231.field2994 += class286.field3643.method1000((byte) 29);
                class504.field7406 = 3;
                class225.field2921 = 0;
                class286.field3661 = new byte[class231.field2994];
            }
            if (class504.field7406 != 3) {
                return -1;
            }
            int var3 = class286.field3643.method1004(3);
            if (var3 < 1) {
                return -1;
            }
            if ((class231.field2994 - class225.field2921) < var3) {
                var3 = class231.field2994 - class225.field2921;
            }
            class286.field3643.method1006(class286.field3661, var3, arg0 ^ 0xFFFFFF98, class225.field2921);
            class225.field2921 += var3;
            if (class225.field2921 < class231.field2994) {
                return -1;
            } else if (class157.method1062(-2, class286.field3661)) {
                class167.field2177 = new class311[class67.field831];
                int var4 = 0;
                for (int var5 = class166.field2152; var5 <= class116.field1632; var5++) {
                    class311 var6 = class129.method819(arg0 - 108, var5);
                    if (var6 != null) {
                        class167.field2177[var4++] = var6;
                    }
                }
                class432.field5950 = null;
                class457.field6376 = 0;
                class286.field3643.method1003(arg0 ^ 0x3);
                class286.field3661 = null;
                class218.field2805 = 0;
                class286.field3643 = null;
                class504.field7406 = 0;
                class57.field759 = class173.method1134(true);
                return 0;
            } else {
                return class74.method423(0, 1002);
            }
        } catch (IOException var7) {
            return class74.method423(0, 1003);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public static void method2662(int arg0) {
        field6254 = null;
        field6252 = null;
        if (arg0 != -1) {
            field6255 = null;
        }
        field6244 = null;
        field6255 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public static final void method2663(String arg0, int arg1, int arg2, int arg3, int arg4) {
        field6245++;
        class423 var5 = class520.method3091(arg1, (byte) 126, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field5779 != null) {
            class195 var6 = new class195();
            var6.field2516 = var5;
            var6.field2528 = arg4;
            var6.field2523 = var5.field5779;
            var6.field2533 = arg0;
            class490.method2928(var6);
        }
        boolean var7 = true;
        if (var5.field5800 != 0) {
            var7 = class27.method185(-87, var5);
        }
        if (!var7 || !client.method3037(var5).method1626(true, arg4 - 1)) {
            return;
        }
        if (arg4 == 1) {
            class260.field3297++;
            class420.method2472((byte) -101, class531.field7815);
            class266.method1651(var5.field5763, arg2, false, arg1);
        }
        if (arg3 == arg4) {
            class420.method2472((byte) -101, class183.field2407);
            class216.field2768++;
            class266.method1651(var5.field5763, arg2, false, arg1);
        }
        if (arg4 == 3) {
            class130.field1776++;
            class420.method2472((byte) -101, class215.field2741);
            class266.method1651(var5.field5763, arg2, false, arg1);
        }
        if (arg4 == 4) {
            class420.method2472((byte) -101, class444.field6175);
            class202.field2644++;
            class266.method1651(var5.field5763, arg2, false, arg1);
        }
        if (arg4 == 5) {
            class10.field135++;
            class420.method2472((byte) -101, class368.field4743);
            class266.method1651(var5.field5763, arg2, false, arg1);
        }
        if (arg4 == 6) {
            class393.field5141++;
            class420.method2472((byte) -101, class93.field1302);
            class266.method1651(var5.field5763, arg2, false, arg1);
        }
        if (arg4 == 7) {
            class420.method2472((byte) -101, class139.field1857);
            class264.field3344++;
            class266.method1651(var5.field5763, arg2, false, arg1);
        }
        if (arg4 == 8) {
            class420.method2472((byte) -101, class508.field7460);
            class243.field3123++;
            class266.method1651(var5.field5763, arg2, false, arg1);
        }
        if (arg4 == 9) {
            class36.field552++;
            class420.method2472((byte) -101, class124.field1716);
            class266.method1651(var5.field5763, arg2, false, arg1);
        }
        if (arg4 == 10) {
            class124.field1714++;
            class420.method2472((byte) -101, class451.field6284);
            class266.method1651(var5.field5763, arg2, false, arg1);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Z")
    public static final boolean method2664(int arg0, int arg1, int arg2) {
        field6243++;
        if (arg1 != -1) {
            method2662(-31);
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;I)Les;")
    public static final class472 method2665(Component arg0, int arg1) {
        field6256++;
        return arg1 == -5 ? new class234(arg0) : null;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(BIIIII)V")
    public class449(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6250 = arg4;
        this.field6249 = arg5;
        this.field6260 = arg1;
        this.field6253 = arg0;
        this.field6258 = arg3;
        this.field6257 = arg2;
    }
}
