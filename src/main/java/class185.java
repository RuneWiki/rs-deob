import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class185 extends class393 {

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public int field2514;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public int field2515;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "Ljava/lang/String;")
    public static String field2521 = "Loading interfaces - ";

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "Lqj;")
    public static class238 field2509;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(IIII)Loo;", line = 9)
    public static final class384 method1138(int arg0, int arg1, int arg2, int arg3) {
        field2510++;
        int var4 = arg2 | arg0 << 8;
        class384 var5 = (class384) class318.field4545.method2319(-12, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class127.field1692.method1466(class127.field1692.method1480((byte) -121, var4), arg3 - 1679818700);
        if (var6 == null) {
            int var8 = arg2 | arg1 + 65536 << 8;
            class384 var9 = (class384) class318.field4545.method2319(-12, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class127.field1692.method1466(class127.field1692.method1480((byte) 125, var8), arg3 ^ 0x641FFF05);
            if (var10 == null) {
                int var12 = arg2 | 0xFFFF00;
                class384 var13 = (class384) class318.field4545.method2319(-12, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class127.field1692.method1466(class127.field1692.method1480((byte) -47, var12), -116);
                if (var14 == null) {
                    if (arg3 != 1679818576) {
                        field2509 = null;
                    }
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class384 var15 = class374.method2476(var14, arg3 ^ 0x9BE000AE);
                    var15.field5738 = arg2;
                    class318.field4545.method2318(var15, false, (long) var12 << 16);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class384 var11 = class374.method2476(var10, -2);
                var11.field5738 = arg2;
                class318.field4545.method2318(var11, false, (long) var8 << 16);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class384 var7 = class374.method2476(var6, -2);
            var7.field5738 = arg2;
            class318.field4545.method2318(var7, false, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 82)
    public static final String method1139(int arg0, boolean arg1) {
        field2508++;
        if (arg1) {
            method1147((Component) null, 108);
        }
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class300.field4295 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class74.field1004 + "</col>";
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(Z)Z", line = 104)
    public final boolean method1140(boolean arg0) {
        field2506++;
        if (arg0) {
            field2509 = null;
        }
        return ((this.field2514 & 0x2EAA42) >> 21) != 0;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)Z", line = 117)
    public final boolean method1141(int arg0, byte arg1) {
        field2511++;
        if (arg1 > -101) {
            field2509 = null;
        }
        return (this.field2514 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)Z", line = 128)
    public final boolean method1142(int arg0) {
        field2520++;
        if (arg0 != -1) {
            this.method1146((byte) -21);
        }
        return ((this.field2514 & 0x55F65FB5) >> 30) != 0;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)Z", line = 141)
    public final boolean method1143(int arg0) {
        int var2 = -24 % ((59 - arg0) / 41);
        field2516++;
        return ((this.field2514 & 0x1FA3C81F) >> 28) != 0;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(B)Z", line = 151)
    public final boolean method1144(byte arg0) {
        if (arg0 == 47) {
            field2519++;
            return (this.field2514 >> 31 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)Z", line = 168)
    public final boolean method1145(int arg0) {
        field2505++;
        if (arg0 == -1) {
            return (this.field2514 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(B)Z", line = 179)
    public final boolean method1146(byte arg0) {
        field2518++;
        if (arg0 > -106) {
            return false;
        } else {
            return (this.field2514 >> 22 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 190)
    public static final void method1147(Component arg0, int arg1) {
        if (arg1 != 1023) {
            return;
        }
        arg0.removeMouseListener(class126.field1672);
        field2507++;
        arg0.removeMouseMotionListener(class126.field1672);
        arg0.removeFocusListener(class126.field1672);
        class179.field2363 = 0;
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)I", line = 210)
    public final int method1148(int arg0) {
        field2512++;
        int var2 = -9 / ((arg0 - 44) / 53);
        return (this.field2514 & 0x1F873D) >> 18;
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(B)I", line = 223)
    public final int method1149(byte arg0) {
        int var2 = 72 % ((-arg0 - 6) / 61);
        field2513++;
        return class423.method2723(this.field2514, (byte) 113);
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(II)V", line = 232)
    public class185(int arg0, int arg1) {
        this.field2514 = arg0;
        this.field2515 = arg1;
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)V", line = 243)
    public static final void method1150(int arg0) {
        class24 var1 = class258.field3761;
        synchronized (class258.field3761) {
            class258.field3761.method204((byte) 56);
            if (arg0 <= 8) {
                method1139(-119, true);
            }
        }
        field2517++;
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "(I)V", line = 258)
    public static void method1151(int arg0) {
        field2509 = null;
        field2521 = null;
        if (arg0 != -1502590576) {
            method1138(-67, 52, 30, 105);
        }
    }
}
