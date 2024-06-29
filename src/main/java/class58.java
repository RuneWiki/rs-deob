import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class58 {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field698 = 0;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Ljava/lang/String;")
    public static String field701 = "Unable to find ";

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Ljava/awt/Image;")
    public static Image field705;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "[Lcc;")
    public static class263[] field706;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "[[Lgj;")
    public static class245[][] field703;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 4)
    public static final boolean method337(String arg0, int arg1) {
        field700++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 >= 0) {
            field698 = 79;
        }
        for (int var2 = 0; var2 < class74.field954; var2++) {
            if (arg0.equalsIgnoreCase(class76.field965[var2])) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class118.field1664.field1496)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLg;)V", line = 39)
    public static final void method338(byte arg0, class170 arg1) {
        field702++;
        int var2 = arg1.field2454 - class38.field463;
        int var3 = arg1.field2377 * 128 + (arg1.method748(false) * 64);
        int var4 = arg1.field2414 * 128 + (arg1.method748(false) * 64);
        arg1.field2419 = 0;
        arg1.field2357 += (var4 - arg1.field2357) / var2;
        if (arg1.field2427 == 0) {
            arg1.field2387 = 1024;
        }
        arg1.field2392 += (var3 - arg1.field2392) / var2;
        if (arg0 < 76) {
            method337((String) null, -17);
        }
        if (arg1.field2427 == 1) {
            arg1.field2387 = 1536;
        }
        if (arg1.field2427 == 2) {
            arg1.field2387 = 0;
        }
        if (arg1.field2427 == 3) {
            arg1.field2387 = 512;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 87)
    public static void method339(int arg0) {
        field701 = null;
        field703 = (class245[][]) null;
        field706 = null;
        field705 = null;
        if (arg0 != 0) {
            method339(105);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lp;I)V", line = 100)
    public static final void method340(class107 arg0, int arg1) {
        field699++;
        if (arg0.field1388.length - arg0.field1400 < 1) {
            return;
        }
        int var2 = arg0.method661(-1);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg0.field1388.length - arg0.field1400) {
            return;
        }
        class165.field2289 = arg0.method661(-1);
        if (class165.field2289 < 1) {
            class165.field2289 = 1;
        } else if (class165.field2289 > 4) {
            class165.field2289 = 4;
        }
        class275.method1981(-97, arg0.method661(arg1 ^ -128) == 1);
        class238.field3539 = arg0.method661(-1) == 1;
        class90.field1124 = arg0.method661(arg1 - 128) == 1;
        class117.field1661 = arg0.method661(arg1 - 128) == 1;
        class240.field3616 = arg0.method661(-1) == 1;
        class321.field4926 = arg0.method661(-1) == 1;
        class229.field3332 = arg0.method661(-1) == 1;
        class272.field4269 = arg0.method661(arg1 - 128) == 1;
        class345.field5352 = arg0.method661(arg1 - 128);
        if (class345.field5352 > 2) {
            class345.field5352 = 2;
        }
        if (var2 >= 2) {
            class162.field2241 = arg0.method661(-1) == 1;
        } else {
            class162.field2241 = arg0.method661(-1) == 1;
            arg0.method661(-1);
        }
        class172.field2481 = arg0.method661(-1) == 1;
        class177.field2567 = arg0.method661(-1) == 1;
        class285.field4465 = arg0.method661(-1);
        if (class285.field4465 > 2) {
            class285.field4465 = 2;
        }
        class67.field878 = class285.field4465;
        class54.field668 = arg0.method661(-1) == 1;
        class259.field3934 = arg0.method661(-1);
        if (class259.field3934 > 127) {
            class259.field3934 = 127;
        }
        class225.field3192 = arg0.method661(-1);
        class261.field3947 = arg0.method661(arg1 ^ 0xFFFFFF80);
        if (class261.field3947 > arg1) {
            class261.field3947 = 127;
        }
        if (var2 >= 1) {
            class235.field3416 = arg0.method624(14612);
            class154.field2127 = arg0.method624(14612);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method661(-1);
        }
        if (var2 >= 4) {
            int var4 = arg0.method661(arg1 - 128);
            if (class340.field5274 < 96) {
                var4 = 0;
            }
            class274.method1978(var4);
        }
        if (var2 >= 5) {
            class337.field5215 = arg0.method676(true);
        }
        if (var2 >= 6) {
            class191.field2746 = arg0.method661(-1);
        }
        if (var2 >= 7) {
            class305.field4732 = arg0.method661(-1) == 1;
        }
        if (var2 >= 8) {
            class258.field3925 = arg0.method661(-1) == 1;
        }
        if (var2 >= 9) {
            class163.field2260 = arg0.method661(-1);
        }
        if (var2 >= 10) {
            class308.field4759 = arg0.method661(-1) != 0;
        }
        if (var2 >= 11) {
            class296.field4614 = arg0.method661(-1) != 0;
        }
    }
}
