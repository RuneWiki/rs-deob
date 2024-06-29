import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class534 extends class173 {

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "Lla;")
    public static class319 field7848 = new class319(63, 5);

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "Laa;")
    public static class341 field7851;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "[Z")
    public static boolean[] field7852;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 9)
    public static void method3158(int arg0) {
        field7851 = null;
        field7852 = null;
        field7848 = null;
        if (arg0 != 0) {
            field7851 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V", line = 22)
    public static final void method3159(int arg0) {
        field7850++;
        if (class351.field5430 == 0) {
            return;
        }
        try {
            if ((++class290.field4252) > 2000) {
                if (class374.field5695 != null) {
                    class374.field5695.method1934((byte) -39);
                    class374.field5695 = null;
                }
                if (class439.field6620 >= 1) {
                    class351.field5430 = 0;
                    class342.field5272 = -5;
                    return;
                }
                class439.field6620++;
                class355.field5495.field2608 = !class355.field5495.field2608;
                class351.field5430 = 1;
                class290.field4252 = 0;
            }
            if (arg0 > -127) {
                field7852 = null;
            }
            if (class351.field5430 == 1) {
                class375.field5696 = class312.field4572.method2991(class355.field5495.method1315(-111), class355.field5495.field2603, 1);
                class351.field5430 = 2;
            }
            if (class351.field5430 == 2) {
                if (class375.field5696.field3322 == 2) {
                    throw new IOException();
                }
                if (class375.field5696.field3322 != 1) {
                    return;
                }
                class374.field5695 = class5.method26((Socket) class375.field5696.field3324, 5000, 32194);
                class375.field5696 = null;
                class374.field5695.method1936(class538.field7879.field2185, true, class538.field7879.field2219, 0);
                class351.field5430 = 4;
            }
            if (class351.field5430 == 4) {
                if (!class374.field5695.method1929((byte) -82, 1)) {
                    return;
                }
                class374.field5695.method1931(class409.field6214.field2219, 1, 32, 0);
                int var1 = class409.field6214.field2219[0] & 0xFF;
                if (var1 != 21) {
                    class342.field5272 = var1;
                    class351.field5430 = 0;
                    class374.field5695.method1934((byte) -46);
                    class374.field5695 = null;
                    return;
                }
                class351.field5430 = 5;
            }
            if (class351.field5430 == 5) {
                if (!class374.field5695.method1929((byte) -82, 1)) {
                    return;
                }
                class374.field5695.method1931(class409.field6214.field2219, 1, 32, 0);
                class351.field5430 = 6;
                class301.field4420 = new String[class409.field6214.field2219[0] & 0xFF];
            }
            if (class351.field5430 == 6 && class374.field5695.method1929((byte) -82, class301.field4420.length * 8)) {
                class409.field6214.field2185 = 0;
                class374.field5695.method1931(class409.field6214.field2219, class301.field4420.length * 8, 32, 0);
                for (int var2 = 0; var2 < class301.field4420.length; var2++) {
                    class301.field4420[var2] = class362.method2314((byte) 115, class409.field6214.method1078((byte) 82));
                }
                class351.field5430 = 0;
                class342.field5272 = 21;
                class374.field5695.method1934((byte) -97);
                class374.field5695 = null;
            }
        } catch (IOException var3) {
            if (class374.field5695 != null) {
                class374.field5695.method1934((byte) -84);
                class374.field5695 = null;
            }
            if (class439.field6620 >= 1) {
                class351.field5430 = 0;
                class342.field5272 = -4;
            } else {
                class439.field6620++;
                class290.field4252 = 0;
                class351.field5430 = 1;
                class355.field5495.field2608 = !class355.field5495.field2608;
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V", line = 168)
    public static final void method3160(boolean arg0) {
        field7849++;
        if (arg0) {
            method3160(false);
        }
        class330 var1 = class112.field1560;
        synchronized (class112.field1560) {
            class112.field1560.method2135(0);
        }
        class330 var2 = class491.field7249;
        synchronized (class491.field7249) {
            class491.field7249.method2135(0);
        }
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)V", line = 196)
    public static final void method3161(byte arg0) {
        class480.field7082.method1405(16);
        if (arg0 >= -20) {
            method3158(-107);
        }
        field7853++;
        class406.field6164 = 1;
        class445.field6686 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III[B)I", line = 213)
    public static final int method3162(int arg0, int arg1, int arg2, byte[] arg3) {
        field7847++;
        int var4 = -1;
        if (arg0 <= 91) {
            method3162(110, 123, 54, null);
        }
        for (int var5 = arg1; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class251.field3487[(var4 ^ arg3[var5]) & 0xFF];
        }
        return ~var4;
    }
}
