import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class302 {

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field4704 = 0;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field4708 = 0;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "[Z")
    public static boolean[] field4702 = new boolean[100];

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field4710 = -1;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "[[I")
    public static int[][] field4707 = new int[5][5000];

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lpa;")
    public static class2 field4709;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2127(int arg0) {
        field4703++;
        if (class148.field2354 == arg0) {
            return;
        }
        try {
            if ((++class172.field2609) > 2000) {
                if (class147.field2352 != null) {
                    class147.field2352.method1527(95);
                    class147.field2352 = null;
                }
                if (class212.field3217 >= 1) {
                    class148.field2354 = 0;
                    class285.field4527 = -5;
                    return;
                }
                class212.field3217++;
                if (class43.field490 == class10.field111) {
                    class10.field111 = class345.field5479;
                } else {
                    class10.field111 = class43.field490;
                }
                class172.field2609 = 0;
                class148.field2354 = 1;
            }
            if (class148.field2354 == 1) {
                class24.field282 = class156.field2451.method166((byte) 70, class61.field726, class10.field111);
                class148.field2354 = 2;
            }
            if (class148.field2354 == 2) {
                if (class24.field282.field2419 == 2) {
                    throw new IOException();
                }
                if (class24.field282.field2419 != 1) {
                    return;
                }
                class147.field2352 = new class220((Socket) class24.field282.field2421, class156.field2451);
                class24.field282 = null;
                class147.field2352.method1532(class328.field5282.field2295, 0, arg0 ^ 0x3C, class328.field5282.field2260);
                if (class192.field2881 != null) {
                    class192.field2881.method1412(false);
                }
                if (class273.field4330 != null) {
                    class273.field4330.method1412(false);
                }
                int var1 = class147.field2352.method1528(-29741);
                if (class192.field2881 != null) {
                    class192.field2881.method1412(false);
                }
                if (class273.field4330 != null) {
                    class273.field4330.method1412(false);
                }
                if (var1 != 21) {
                    class148.field2354 = 0;
                    class285.field4527 = var1;
                    class147.field2352.method1527(101);
                    class147.field2352 = null;
                    return;
                }
                class148.field2354 = 3;
            }
            if (class148.field2354 == 3) {
                if (class147.field2352.method1531((byte) -85) < 1) {
                    return;
                }
                class19.field233 = new String[class147.field2352.method1528(-29741)];
                class148.field2354 = 4;
            }
            if (class148.field2354 == 4) {
                if (class147.field2352.method1531((byte) 1) < class19.field233.length * 8) {
                    return;
                }
                class282.field4499.field2295 = 0;
                class147.field2352.method1536(0, class19.field233.length * 8, (byte) -57, class282.field4499.field2260);
                for (int var2 = 0; var2 < class19.field233.length; var2++) {
                    class19.field233[var2] = class230.method1597(class282.field4499.method1013((byte) -70), (byte) -65);
                }
                class148.field2354 = 0;
                class285.field4527 = 21;
                class147.field2352.method1527(72);
                class147.field2352 = null;
                return;
            }
        } catch (IOException var4) {
            if (class147.field2352 != null) {
                class147.field2352.method1527(91);
                class147.field2352 = null;
            }
            if (class212.field3217 >= 1) {
                class285.field4527 = -4;
                class148.field2354 = 0;
            } else {
                class172.field2609 = 0;
                class148.field2354 = 1;
                if (class43.field490 == class10.field111) {
                    class10.field111 = class345.field5479;
                } else {
                    class10.field111 = class43.field490;
                }
                class212.field3217++;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 165)
    public static final void method2128(int arg0) {
        if (arg0 != 2) {
            method2129(63);
        }
        class348.field5519.method378(0);
        field4711++;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 176)
    public static final void method2129(int arg0) {
        class38.field437 = false;
        class58.field684 = 0;
        class246.field3866 = -1;
        class132.field1906 = -1;
        class4.field42 = -1;
        class74.field924 = arg0;
        class328.field5282.field2295 = 0;
        class242.field3732 = 0;
        class191.field2869 = 0;
        class296.field4668 = -1;
        class282.field4499.field2295 = 0;
        field4706++;
        class210.method1463(123);
        for (int var1 = 0; var1 < class105.field1443.length; var1++) {
            if (class105.field1443[var1] != null) {
                class105.field1443[var1].field3792 = -1;
            }
        }
        for (int var2 = 0; var2 < class251.field3974.length; var2++) {
            if (class251.field3974[var2] != null) {
                class251.field3974[var2].field3792 = -1;
            }
        }
        class187.method1285(32);
        class120.field1667 = 1;
        class219.method1525((byte) -102, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            field4702[var3] = true;
        }
        class30.method215((byte) 122);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 242)
    public static void method2130(byte arg0) {
        if (arg0 != -107) {
            method2128(16);
        }
        field4707 = (int[][]) null;
        field4702 = null;
        field4709 = null;
    }
}
