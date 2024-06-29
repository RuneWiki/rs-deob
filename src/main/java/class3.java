import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 {

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static volatile int field50 = 0;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "J")
    public static long field46 = 0L;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "[S")
    public static short[] field57 = new short[256];

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lwm;")
    public static class152 field49 = class157.method1048(" de votre liste noire)3", 120);

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Lwm;")
    private static class152 field58 = class157.method1048("Loaded wordpack", 108);

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lwm;")
    public static class152 field56 = field58;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Lah;")
    public static class205 field55;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "[Z")
    public static boolean[] field48;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V", line = 11)
    public static final void method11(int arg0, int arg1, int arg2) {
        field53++;
        class303 var3 = class90.method589(false, arg2, arg0);
        var3.method2117((byte) 71);
        var3.field5219 = arg1;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 24)
    public static final void method12(byte arg0) {
        field47++;
        if (class18.field250 == 0) {
            return;
        }
        try {
            int var1 = 6 / ((arg0 + 53) / 32);
            if ((++class172.field2745) > 1500) {
                if (class265.field4477 != null) {
                    class265.field4477.method1239((byte) -85);
                    class265.field4477 = null;
                }
                if (class30.field506 >= 1) {
                    class184.field2930 = -5;
                    class18.field250 = 0;
                    return;
                }
                class30.field506++;
                if (class80.field1120 == class127.field1811) {
                    class80.field1120 = class210.field3420;
                } else {
                    class80.field1120 = class127.field1811;
                }
                class18.field250 = 1;
                class172.field2745 = 0;
            }
            if (class18.field250 == 1) {
                class11.field142 = class34.field572.method962(class80.field1120, class223.field3628, (byte) -71);
                class18.field250 = 2;
            }
            if (class18.field250 == 2) {
                if (class11.field142.field2980 == 2) {
                    throw new IOException();
                }
                if (class11.field142.field2980 != 1) {
                    return;
                }
                class265.field4477 = new class186((Socket) class11.field142.field2977, class34.field572);
                class11.field142 = null;
                class265.field4477.method1237(true, 0, class245.field4102.field4946, class245.field4102.field4950);
                if (class270.field4629 != null) {
                    class270.field4629.method1676(-3091);
                }
                if (class224.field3646 != null) {
                    class224.field3646.method1676(-3091);
                }
                int var2 = class265.field4477.method1235(-119);
                if (class270.field4629 != null) {
                    class270.field4629.method1676(-3091);
                }
                if (class224.field3646 != null) {
                    class224.field3646.method1676(-3091);
                }
                if (var2 != 101) {
                    class18.field250 = 0;
                    class184.field2930 = var2;
                    class265.field4477.method1239((byte) -54);
                    class265.field4477 = null;
                    return;
                }
                class18.field250 = 3;
            }
            if (class18.field250 == 3) {
                if (class265.field4477.method1238(1) >= 2) {
                    int var3 = class265.field4477.method1235(-116) << 8 | class265.field4477.method1235(-114);
                    class210.method1417(50000, var3);
                    if (class314.field5443 != -1) {
                        class18.field250 = 0;
                        class265.field4477.method1239((byte) -116);
                        class265.field4477 = null;
                        class239.method1637(11765);
                        return;
                    }
                    class184.field2930 = 6;
                    class18.field250 = 0;
                    class265.field4477.method1239((byte) -46);
                    class265.field4477 = null;
                    return;
                }
                return;
            }
        } catch (IOException var5) {
            if (class265.field4477 != null) {
                class265.field4477.method1239((byte) -61);
                class265.field4477 = null;
            }
            if (class30.field506 >= 1) {
                class184.field2930 = -4;
                class18.field250 = 0;
            } else {
                class30.field506++;
                class18.field250 = 1;
                if (class80.field1120 == class127.field1811) {
                    class80.field1120 = class210.field3420;
                } else {
                    class80.field1120 = class127.field1811;
                }
                class172.field2745 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ)V", line = 189)
    public static final void method13(int arg0, int arg1, boolean arg2) {
        field51++;
        class183.field2920 = arg0 - class252.field4335;
        int var3 = class183.field2920 - ((int) ((float) class252.field4341.field1876 / class41.field660));
        class208.field3392 = class197.field3160 - (arg1 - (class26.field446 - 1));
        int var4 = (int) ((float) class252.field4341.field1921 / class41.field660) + class208.field3392;
        int var5 = (int) ((float) class252.field4341.field1876 / class41.field660) + class183.field2920;
        int var6 = class208.field3392 - ((int) ((float) class252.field4341.field1921 / class41.field660));
        if (var6 < 0) {
            class208.field3392 = (int) ((float) class252.field4341.field1921 / class41.field660);
        }
        if (var4 > class26.field446) {
            class208.field3392 = class26.field446 - ((int) ((float) class252.field4341.field1921 / class41.field660));
        }
        if (var3 < 0) {
            class183.field2920 = (int) ((float) class252.field4341.field1876 / class41.field660);
        }
        if (class239.field3921 < var5) {
            class183.field2920 = class239.field3921 - (int) ((float) class252.field4341.field1876 / class41.field660);
        }
        if (!arg2) {
            field48 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 223)
    public static void method14(int arg0) {
        field55 = null;
        field58 = null;
        field57 = null;
        field49 = null;
        field56 = null;
        field48 = null;
        if (arg0 != 2) {
            method13(-74, 95, true);
        }
    }
}
