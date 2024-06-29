import java.awt.Canvas;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class260 extends InputStream {

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field3938 = 0;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3943 = null;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field3945 = 20;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3941;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZZIIIBI)V", line = 16)
    public static final void method1875(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg0) {
            class250.method1805();
        }
        field3942++;
        if (class243.field3659 != null && (arg6 != 3 || class235.field3416 != arg4 || class154.field2127 != arg2)) {
            class244.method1756(class9.field131, -27740, class243.field3659);
            class243.field3659 = null;
        }
        if (arg6 == 3 && class243.field3659 == null) {
            class243.field3659 = class205.method1394(class9.field131, 0, 0, arg2, arg4, -31672);
            if (class243.field3659 != null) {
                class235.field3416 = arg4;
                class154.field2127 = arg2;
                class319.method2223(class9.field131, 24398);
            }
        }
        if (arg6 == 3 && class243.field3659 == null) {
            method1875(true, true, -1, arg3, -1, (byte) -128, class191.field2746);
            return;
        }
        Container var7;
        if (class243.field3659 != null) {
            var7 = class243.field3659;
        } else if (class329.field5029 == null) {
            var7 = class9.field131.field4179;
        } else {
            var7 = class329.field5029;
        }
        class73.field943 = var7.getSize().width;
        class138.field1938 = var7.getSize().height;
        if (class329.field5029 == var7) {
            Insets var8 = class329.field5029.getInsets();
            class73.field943 -= var8.left + var8.right;
            class138.field1938 -= var8.top + var8.bottom;
        }
        if (arg6 >= 2) {
            class81.field1043 = 0;
            class148.field2056 = 0;
            class188.field2712 = class73.field943;
            class314.field4847 = class138.field1938;
        } else {
            class314.field4847 = 503;
            class188.field2712 = 765;
            class148.field2056 = (class73.field943 - 765) / 2;
            class81.field1043 = 0;
        }
        if (arg1) {
            class345.method2380(-1, field3941);
            class89.method523(field3941, -76);
            if (class336.field5178 != null) {
                class336.field5178.method544(field3941, (byte) 127);
            }
            class90.field1132.method1028((byte) -119);
            class112.method771(-27335, field3941);
            class128.method858(-124, field3941);
            if (class336.field5178 != null) {
                class336.field5178.method545(120, field3941);
            }
        } else {
            if (class250.field3787) {
                class250.method1795(class188.field2712, class314.field4847);
            }
            field3941.setSize(class188.field2712, class314.field4847);
            if (class329.field5029 == var7) {
                Insets var9 = class329.field5029.getInsets();
                field3941.setLocation(class148.field2056 + var9.left, class81.field1043 + var9.top);
            } else {
                field3941.setLocation(class148.field2056, class81.field1043);
            }
        }
        if (arg6 == 0 && arg3 > 0) {
            class250.method1808(field3941);
        }
        if (arg0 && arg6 > 0) {
            field3941.setIgnoreRepaint(true);
            if (!class269.field4244) {
                class299.method2114();
                class72.field916 = null;
                class72.field916 = class17.method115(field3941, -1, class188.field2712, class314.field4847);
                class144.method969();
                if (class17.field236 == 5) {
                    class293.method2086(class88.field1097, -96, true);
                } else {
                    class23.method154((byte) -32, class163.field2251, false);
                }
                try {
                    Graphics var10 = field3941.getGraphics();
                    class72.field916.method909(var10, 0, 0, (byte) 71);
                } catch (Exception var15) {
                }
                class45.method269((byte) 13);
                if (arg3 == 0) {
                    class72.field916 = class17.method115(field3941, -1, 765, 503);
                } else {
                    class72.field916 = null;
                }
                class18 var12 = class9.field131.method1920(-19961, class90.field1132.getClass());
                while (var12.field238 == 0) {
                    class81.method485(100L, 1);
                }
                if (var12.field238 == 1) {
                    class269.field4244 = true;
                }
            }
            if (class269.field4244) {
                class250.method1811(field3941, class67.field878 * 2);
            }
        }
        if (!class250.field3787 && arg6 > 0) {
            method1875(true, true, -1, arg3, -1, (byte) 36, 0);
            return;
        }
        if (arg6 > 0 && arg3 == 0) {
            class323.field4966.setPriority(5);
            class72.field916 = null;
            class333.method2299();
            ((class63) class215.field3020).method386(true, 200);
            if (class162.field2241) {
                class215.method1486(0.7F);
            }
            if (class295.field4611 == null) {
                class295.field4611 = new class222[13][13];
            }
            class193.method1338(4, 104, 104);
            class178.method1227(104, 104);
            class222.method1527((byte) -58);
        } else if (arg6 == 0 && arg3 > 0) {
            class323.field4966.setPriority(1);
            class72.field916 = class17.method115(field3941, -1, 765, 503);
            class333.method2295();
            class274.method1975();
            ((class63) class215.field3020).method386(true, 20);
            if (class162.field2241) {
                if (class165.field2289 == 1) {
                    class215.method1486(0.9F);
                }
                if (class165.field2289 == 2) {
                    class215.method1486(0.8F);
                }
                if (class165.field2289 == 3) {
                    class215.method1486(0.7F);
                }
                if (class165.field2289 == 4) {
                    class215.method1486(0.6F);
                }
            }
            class245.method1764();
            class222.method1527((byte) -85);
        }
        class337.field5207 = !class339.method2348((byte) 69);
        if (arg0) {
            class106.method618(200);
        }
        if (arg6 < 2) {
            class309.field4783 = false;
        } else {
            class309.field4783 = true;
        }
        if (class146.field2031 != -1) {
            class112.method774(-27290, true);
        }
        if (class236.field3463 != null && (class17.field236 == 30 || class17.field236 == 25)) {
            class14.method97(false);
        }
        int var13 = 69 / ((arg5 + 48) / 55);
        for (int var14 = 0; var14 < 100; var14++) {
            class285.field4483[var14] = true;
        }
        class76.field970 = true;
    }

    @OriginalMember(owner = "client!rm", name = "read", descriptor = "()I", line = 259)
    public final int read() {
        class81.method485(30000L, 1);
        field3937++;
        return -1;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)V", line = 269)
    public static final void method1876(int arg0, byte arg1) {
        if (arg1 == 113) {
            field3944++;
            if (arg0 >= 0 && arg0 < class74.field960.length) {
                class74.field960[arg0] = !class74.field960[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V", line = 286)
    public static void method1877(boolean arg0) {
        if (!arg0) {
            field3945 = 35;
        }
        field3941 = null;
        field3943 = null;
    }
}
