import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class25 {

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Lce;")
    public static class126 field357 = class206.method1445(-7923, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "[[Lbi;")
    public static class201[][] field359;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BIILwd;III)V", line = 5)
    public static final void method120(byte arg0, int arg1, int arg2, class112 arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 * arg4 + arg6 * arg6;
        field354++;
        int var8 = -50 / ((2 - arg0) / 33);
        if (var7 > 360000) {
            return;
        }
        int var9 = Math.min(arg3.field1766 / 2, arg3.field1753 / 2);
        if (var7 <= (var9 * var9)) {
            class221.method1515(arg3, arg1, arg6, class313.field5337[arg5], true, arg4, arg2);
            return;
        }
        var9 -= 10;
        int var10 = class180.field3134 + class144.field2618 & 0x7FF;
        int var11 = class236.field3985[var10];
        int var12 = var11 * 256 / (class234.field3951 + 256);
        int var13 = class236.field3971[var10];
        int var14 = var13 * 256 / (class234.field3951 + 256);
        int var15 = arg6 * var14 - (arg4 * var12) >> 16;
        int var16 = arg4 * var14 + arg6 * var12 >> 16;
        double var17 = Math.atan2((double) var16, (double) var15);
        int var19 = (int) (Math.sin(var17) * (double) var9);
        int var20 = (int) (Math.cos(var17) * (double) var9);
        if (class56.field846) {
            ((class198) class103.field1643[arg5]).method1399(240, 240, (arg3.field1766 / 2 + arg1 + var19) * 16, (arg3.field1753 / 2 + arg2 - var20) * 16, (int) (var17 * 10430.378D), 4096);
        } else {
            ((class184) class103.field1643[arg5]).method1328(arg3.field1766 / 2 + arg1 + var19 - 10, arg3.field1753 / 2 + -var20 - 10 + arg2, 20, 20, 15, 15, var17, 256);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 61)
    public static final void method121(byte arg0) {
        if (arg0 > -124) {
            method123(false);
        }
        class75.field1208.method1178(-109);
        field355++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 91)
    public static final void method122(int arg0) {
        field356++;
        if (class267.field4522 == 0) {
            return;
        }
        try {
            if (++class224.field3788 > 2000) {
                if (class59.field953 != null) {
                    class59.field953.method1941((byte) 101);
                    class59.field953 = null;
                }
                if (class209.field3596 >= 1) {
                    class287.field4773 = -5;
                    class267.field4522 = 0;
                    return;
                }
                class224.field3788 = 0;
                class209.field3596++;
                class267.field4522 = 1;
                if (class63.field1069 == class239.field4040) {
                    class239.field4040 = class172.field3035;
                } else {
                    class239.field4040 = class63.field1069;
                }
            }
            if (class267.field4522 == 1) {
                class82.field1327 = class161.field2907.method1092(class239.field4040, class190.field3258, true);
                class267.field4522 = 2;
            }
            if (arg0 != -360001) {
                method123(false);
            }
            if (class267.field4522 == 2) {
                if (class82.field1327.field965 == 2) {
                    throw new IOException();
                }
                if (class82.field1327.field965 != 1) {
                    return;
                }
                class59.field953 = new class293((Socket) class82.field1327.field967, class161.field2907);
                class82.field1327 = null;
                class59.field953.method1945(class103.field1645.field2299, true, 0, class103.field1645.field2282);
                if (class118.field1993 != null) {
                    class118.field1993.method1048((byte) 106);
                }
                if (class125.field2109 != null) {
                    class125.field2109.method1048((byte) 114);
                }
                int var1 = class59.field953.method1938((byte) 41);
                if (class118.field1993 != null) {
                    class118.field1993.method1048((byte) 116);
                }
                if (class125.field2109 != null) {
                    class125.field2109.method1048((byte) 117);
                }
                if (var1 != 21) {
                    class267.field4522 = 0;
                    class287.field4773 = var1;
                    class59.field953.method1941((byte) -90);
                    class59.field953 = null;
                    return;
                }
                class267.field4522 = 3;
            }
            if (class267.field4522 == 3) {
                if (class59.field953.method1939((byte) 86) < 1) {
                    return;
                }
                class20.field273 = new class126[class59.field953.method1938((byte) 41)];
                class267.field4522 = 4;
            }
            if (class267.field4522 == 4) {
                if (class59.field953.method1939((byte) 86) < class20.field273.length * 8) {
                    return;
                }
                class227.field3834.field2299 = 0;
                class59.field953.method1935(0, class227.field3834.field2282, class20.field273.length * 8, arg0 + 360000);
                for (int var2 = 0; var2 < class20.field273.length; var2++) {
                    class20.field273[var2] = class250.method1696(false, class227.field3834.method939(-642283040));
                }
                class267.field4522 = 0;
                class287.field4773 = 21;
                class59.field953.method1941((byte) -72);
                class59.field953 = null;
                return;
            }
        } catch (IOException var4) {
            if (class59.field953 != null) {
                class59.field953.method1941((byte) -85);
                class59.field953 = null;
            }
            if (class209.field3596 < 1) {
                class224.field3788 = 0;
                class267.field4522 = 1;
                if (class63.field1069 == class239.field4040) {
                    class239.field4040 = class172.field3035;
                } else {
                    class239.field4040 = class63.field1069;
                }
                class209.field3596++;
            } else {
                class267.field4522 = 0;
                class287.field4773 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 245)
    public static void method123(boolean arg0) {
        field357 = null;
        field359 = (class201[][]) null;
        if (!arg0) {
            field357 = (class126) null;
        }
    }
}
