import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class100 {

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1445 = null;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "Lfba;")
    public static class348 field1440 = new class348(4);

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "Z")
    public static boolean field1447 = false;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "[I")
    public static int[] field1449 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "[B")
    public byte[] field1444;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "[S")
    public short[] field1439;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "[S")
    public short[] field1442;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "[S")
    public short[] field1446;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public static final void method752(int arg0) {
        field1441++;
        if (class328.field4452 == 0) {
            return;
        }
        try {
            if ((++class523.field7602) > 2000) {
                if (class325.field4415 != null) {
                    class325.field4415.method1581(false);
                    class325.field4415 = null;
                }
                if (class316.field4264 >= 2) {
                    class328.field4452 = 0;
                    class306.field4163 = -5;
                    return;
                }
                class542.field7861.method3150((byte) -15);
                class523.field7602 = 0;
                class316.field4264++;
                class328.field4452 = 1;
            }
            if (class328.field4452 == 1) {
                class196.field2868 = class542.field7861.method3152(class345.field4749, (byte) -128);
                class328.field4452 = 2;
            }
            if (class328.field4452 == 2) {
                if (class196.field2868.field6198 == 2) {
                    throw new IOException();
                }
                if (class196.field2868.field6198 != 1) {
                    return;
                }
                class325.field4415 = class671.method3826((Socket) class196.field2868.field6200, 7500, 1);
                class196.field2868 = null;
                class521.method3165((byte) 114);
                class328.field4452 = 4;
            }
            if (class328.field4452 == 4) {
                if (!class325.field4415.method1579(1, 25562)) {
                    return;
                }
                class325.field4415.method1577(false, class352.field5213.field6800, 1, 0);
                int var1 = class352.field5213.field6800[0] & 0xFF;
                class328.field4452 = 0;
                class306.field4163 = var1;
                class325.field4415.method1581(false);
                class325.field4415 = null;
                return;
            }
        } catch (IOException var2) {
            if (class325.field4415 != null) {
                class325.field4415.method1581(false);
                class325.field4415 = null;
            }
            if (class316.field4264 < 2) {
                class542.field7861.method3150((byte) -15);
                class523.field7602 = 0;
                class316.field4264++;
                class328.field4452 = 1;
            } else {
                class306.field4163 = -4;
                class328.field4452 = 0;
            }
        }
        if (arg0 != -6913) {
            field1447 = true;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)I")
    public static final int method753(boolean arg0) {
        field1448++;
        byte var1;
        if (class597.field8492 < 96) {
            var1 = 1;
            class521.method3171(true, (byte) 21);
        } else {
            int var2 = class350.method2239(100);
            if (var2 <= 100) {
                var1 = 4;
                class693.method3910(2);
            } else if (var2 <= 500) {
                class353.method2246(true);
                var1 = 3;
            } else if (var2 > 1000) {
                var1 = 1;
                class521.method3171(true, (byte) 21);
            } else {
                class184.method1302(0);
                var1 = 2;
            }
        }
        if (!arg0) {
            field1445 = null;
        }
        if (class243.field3580.field7975.method3775(false) != 0) {
            class243.field3580.method3301(0, 24, class243.field3580.field8019);
            class403.method2449(false, 0, -78);
        }
        class23.method102((byte) -74);
        return var1;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(CI)Z")
    public static final boolean method754(char arg0, int arg1) {
        if (arg1 != 4194303) {
            field1445 = null;
        }
        field1443++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)V")
    public static void method755(int arg0) {
        if (arg0 < 88) {
            method754((char) 65434, 18);
        }
        field1440 = null;
        field1449 = null;
        field1445 = null;
    }
}
