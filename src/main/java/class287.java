import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class287 {

    @OriginalMember(owner = "client!n", name = "c", descriptor = "[I")
    public static int[] field5016 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field5022 = 0;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Z")
    public static boolean field5017 = false;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field5020 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lsf;")
    public static class108 field5025 = class140.method973(255, "Memory after cleanup=");

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Lsf;")
    public static class108 field5023 = class140.method973(255, "ondulation:");

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
    public static boolean field5018 = true;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 19)
    public static final void method2052(byte arg0) {
        field5015++;
        if (class288.field5038 == 0) {
            return;
        }
        try {
            if ((++class105.field1825) > 1500) {
                if (class14.field161 != null) {
                    class14.field161.method1487(13881);
                    class14.field161 = null;
                }
                if (class84.field1318 >= 1) {
                    class211.field3766 = -5;
                    class288.field5038 = 0;
                    return;
                }
                class84.field1318++;
                class105.field1825 = 0;
                if (class69.field1081 == class206.field3703) {
                    class206.field3703 = class160.field2881;
                } else {
                    class206.field3703 = class69.field1081;
                }
                class288.field5038 = 1;
            }
            if (arg0 != -28) {
                return;
            }
            if (class288.field5038 == 1) {
                class93.field1489 = class289.field5052.method970(class329.field5624, class206.field3703, (byte) -103);
                class288.field5038 = 2;
            }
            if (class288.field5038 == 2) {
                if (class93.field1489.field3686 == 2) {
                    throw new IOException();
                }
                if (class93.field1489.field3686 != 1) {
                    return;
                }
                class14.field161 = new class216((Socket) class93.field1489.field3685, class289.field5052);
                class93.field1489 = null;
                class14.field161.method1483(class256.field4471.field4314, 0, false, class256.field4471.field4338);
                if (class308.field5347 != null) {
                    class308.field5347.method1406((byte) 66);
                }
                if (class261.field4601 != null) {
                    class261.field4601.method1406((byte) 66);
                }
                int var1 = class14.field161.method1482((byte) 125);
                if (class308.field5347 != null) {
                    class308.field5347.method1406((byte) 66);
                }
                if (class261.field4601 != null) {
                    class261.field4601.method1406((byte) 66);
                }
                if (var1 != 101) {
                    class211.field3766 = var1;
                    class288.field5038 = 0;
                    class14.field161.method1487(13881);
                    class14.field161 = null;
                    return;
                }
                class288.field5038 = 3;
            }
            if (class288.field5038 == 3) {
                if (class14.field161.method1486(7) < 2) {
                    return;
                }
                int var2 = class14.field161.method1482((byte) 125) << 8 | class14.field161.method1482((byte) 126);
                class286.method2047(var2, (byte) 84);
                if (class182.field3334 != -1) {
                    class288.field5038 = 0;
                    class14.field161.method1487(arg0 + 13909);
                    class14.field161 = null;
                    class134.method919(-1);
                    return;
                }
                class288.field5038 = 0;
                class211.field3766 = 6;
                class14.field161.method1487(arg0 + 13909);
                class14.field161 = null;
                return;
            }
        } catch (IOException var4) {
            if (class14.field161 != null) {
                class14.field161.method1487(13881);
                class14.field161 = null;
            }
            if (class84.field1318 >= 1) {
                class211.field3766 = -4;
                class288.field5038 = 0;
            } else {
                class84.field1318++;
                if (class69.field1081 == class206.field3703) {
                    class206.field3703 = class160.field2881;
                } else {
                    class206.field3703 = class69.field1081;
                }
                class105.field1825 = 0;
                class288.field5038 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lcb;I)V", line = 178)
    public static final void method2053(class286 arg0, int arg1) {
        if (arg1 <= 5) {
            method2054((byte) 68);
        }
        field5021++;
        class213.method1470(200000, -26586, arg0);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V", line = 196)
    public static void method2054(byte arg0) {
        field5025 = null;
        field5016 = null;
        if (arg0 == 52) {
            field5023 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V", line = 214)
    public static final void method2055(int arg0, int arg1) {
        field5019++;
        for (class184 var2 = class69.field1075.method1672(0); var2 != null; var2 = class69.field1075.method1678(-119)) {
            if (((long) arg0) == (var2.field3375 >> 48 & 0xFFFFL)) {
                var2.method1325(arg1 - 8004);
            }
        }
        if (arg1 != 8004) {
            field5016 = (int[]) null;
        }
    }
}
