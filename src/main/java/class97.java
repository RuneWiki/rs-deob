import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class97 extends class81 {

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "Lpd;")
    public class3 field1972;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "[I")
    public static int[] field1969 = new int[500];

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "Lsg;")
    public static class30 field1975 = class167.method1221((byte) 33, "<col=ff0000>");

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "Lsg;")
    public static class30 field1977 = class167.method1221((byte) 33, "0(U");

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "[I")
    public static int[] field1978 = new int[32];

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "[I")
    public static int[] field1974;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
    public static final void method793(int arg0) {
        if (arg0 != 2) {
            method793(83);
        }
        field1971++;
        if (class119.field2322 == 0) {
            return;
        }
        try {
            if ((++class254.field4493) > 2000) {
                if (class175.field3261 != null) {
                    class175.field3261.method1516(-124);
                    class175.field3261 = null;
                }
                if (class190.field3456 >= 1) {
                    class119.field2322 = 0;
                    class227.field4065 = -5;
                    return;
                }
                if (class241.field4309 == class101.field2056) {
                    class101.field2056 = class135.field2637;
                } else {
                    class101.field2056 = class241.field4309;
                }
                class119.field2322 = 1;
                class190.field3456++;
                class254.field4493 = 0;
            }
            if (class119.field2322 == 1) {
                class2.field36 = class190.field3452.method602(arg0 ^ 0xFFFFBF6A, class101.field2056, class197.field3564);
                class119.field2322 = 2;
            }
            if (class119.field2322 == 2) {
                if (class2.field36.field493 == 2) {
                    throw new IOException();
                }
                if (class2.field36.field493 != 1) {
                    return;
                }
                class175.field3261 = new class212((Socket) class2.field36.field492, class190.field3452);
                class2.field36 = null;
                class175.field3261.method1509(class196.field3553.field124, 0, class196.field3553.field146, true);
                if (class11.field217 != null) {
                    class11.field217.method499(125);
                }
                if (class149.field2843 != null) {
                    class149.field2843.method499(arg0 ^ 0x7F);
                }
                int var1 = class175.field3261.method1515(0);
                if (class11.field217 != null) {
                    class11.field217.method499(109);
                }
                if (class149.field2843 != null) {
                    class149.field2843.method499(arg0 + 124);
                }
                if (var1 != 21) {
                    class227.field4065 = var1;
                    class119.field2322 = 0;
                    class175.field3261.method1516(-112);
                    class175.field3261 = null;
                    return;
                }
                class119.field2322 = 3;
            }
            if (class119.field2322 == 3) {
                if (class175.field3261.method1508(arg0 - 2) < 1) {
                    return;
                }
                class166.field3054 = new class30[class175.field3261.method1515(0)];
                class119.field2322 = 4;
            }
            if (class119.field2322 == 4 && class175.field3261.method1508(0) >= (class166.field3054.length * 8)) {
                class59.field1289.field146 = 0;
                class175.field3261.method1510(0, class59.field1289.field124, class166.field3054.length * 8, (byte) -6);
                for (int var2 = 0; var2 < class166.field3054.length; var2++) {
                    class166.field3054[var2] = class197.method1422(class59.field1289.method101(class186.method1344(arg0, -118)), -127);
                }
                class119.field2322 = 0;
                class227.field4065 = 21;
                class175.field3261.method1516(-114);
                class175.field3261 = null;
            }
        } catch (IOException var3) {
            if (class175.field3261 != null) {
                class175.field3261.method1516(-120);
                class175.field3261 = null;
            }
            if (class190.field3456 >= 1) {
                class227.field4065 = -4;
                class119.field2322 = 0;
            } else {
                class190.field3456++;
                class119.field2322 = 1;
                if (class241.field4309 == class101.field2056) {
                    class101.field2056 = class135.field2637;
                } else {
                    class101.field2056 = class241.field4309;
                }
                class254.field4493 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
    public static final void method794(int arg0, boolean arg1) {
        if (!arg1) {
            method797((class31) null, -117, 87, true, -29);
        }
        field1973++;
        class24.field465 = 1000 / arg0;
    }

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "(I)Laa;")
    public static final class8 method795(int arg0) {
        field1970++;
        class8 var1 = new class8(30);
        var1.method76(arg0 ^ 0x14BC, 7);
        var1.method76(arg0 ^ 0x14BC, class123.field2416);
        if (arg0 != 5) {
            field1969 = null;
        }
        var1.method76(arg0 ^ 0x14BC, class13.field238 ? 1 : 0);
        var1.method76(5305, class238.field4243 ? 1 : 0);
        var1.method76(5305, class197.field3569 ? 1 : 0);
        var1.method76(5305, class185.field3392 ? 1 : 0);
        var1.method76(arg0 + 5300, class39.field928 ? 1 : 0);
        var1.method76(arg0 + 5300, class261.field4610 ? 1 : 0);
        var1.method76(arg0 + 5300, class104.field2102 ? 1 : 0);
        var1.method76(5305, class113.field2240 ? 1 : 0);
        var1.method76(5305, class22.field409);
        var1.method76(5305, class209.field3755 ? 1 : 0);
        var1.method76(5305, class50.field1136 ? 1 : 0);
        var1.method76(5305, class177.field3277 ? 1 : 0);
        var1.method76(arg0 + 5300, class117.field2316);
        var1.method76(arg0 + 5300, class142.field2749 ? 1 : 0);
        var1.method76(5305, class169.field3184);
        var1.method76(5305, class246.field4382);
        var1.method76(5305, class169.field3185);
        var1.method97(class224.field4020, (byte) -2);
        var1.method97(class82.field1755, (byte) -2);
        var1.method76(5305, 2);
        var1.method57(class90.field1818, 97);
        var1.method76(5305, class40.field998);
        var1.method76(5305, class180.field3333 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lpd;)V")
    public class97(class3 arg0) {
        this.field1972 = arg0;
    }

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "(I)V")
    public static void method796(int arg0) {
        field1974 = null;
        if (arg0 == 0) {
            field1978 = null;
            field1977 = null;
            field1975 = null;
            field1969 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ldl;IIZI)V")
    public static final void method797(class31 arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 != -31014) {
            field1969 = null;
        }
        int var5 = arg0.field728;
        if (arg0.field637 == 0) {
            arg0.field728 = arg0.field660;
        } else if (arg0.field637 == 1) {
            arg0.field728 = arg2 - arg0.field660;
        } else if (arg0.field637 == 2) {
            arg0.field728 = arg0.field660 * arg2 >> 14;
        } else if (arg0.field637 == 3) {
            if (arg0.field655 == 2) {
                arg0.field728 = arg0.field660 * 32 + ((arg0.field660 - 1) * arg0.field782);
            } else if (arg0.field655 == 7) {
                arg0.field728 = (arg0.field660 - 1) * arg0.field782 + arg0.field660 * 115;
            }
        }
        field1976++;
        int var6 = arg0.field670;
        if (arg0.field727 == 0) {
            arg0.field670 = arg0.field682;
        } else if (arg0.field727 == 1) {
            arg0.field670 = arg1 - arg0.field682;
        } else if (arg0.field727 == 2) {
            arg0.field670 = arg0.field682 * arg1 >> 14;
        } else if (arg0.field727 == 3) {
            if (arg0.field655 == 2) {
                arg0.field670 = (arg0.field682 - 1) * arg0.field771 + arg0.field682 * 32;
            } else if (arg0.field655 == 7) {
                arg0.field670 = (arg0.field682 - 1) * arg0.field771 + arg0.field682 * 12;
            }
        }
        if (arg0.field637 == 4) {
            arg0.field728 = arg0.field670 * arg0.field635 / arg0.field761;
        }
        if (arg0.field727 == 4) {
            arg0.field670 = arg0.field761 * arg0.field728 / arg0.field635;
        }
        if (class96.field1959 && (client.method1498(arg0) != 0 || arg0.field655 == 0)) {
            if (arg0.field670 < 5 && arg0.field728 < 5) {
                arg0.field670 = 5;
                arg0.field728 = 5;
            } else {
                if (arg0.field670 <= 0) {
                    arg0.field670 = 5;
                }
                if (arg0.field728 <= 0) {
                    arg0.field728 = 5;
                }
            }
        }
        if (arg0.field664 == 1337) {
            class130.field2558 = arg0;
        }
        if (arg3 && arg0.field706 != null && arg0.field728 != var5 || arg0.field670 != var6) {
            class183 var7 = new class183();
            var7.field3369 = arg0;
            var7.field3363 = arg0.field706;
            class52.field1163.method477(var7, (byte) 6);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1978[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
