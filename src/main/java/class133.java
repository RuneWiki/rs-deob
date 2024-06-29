import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class133 {

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public int field1951 = -1;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field1947 = 0;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static volatile int field1948 = -1;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "[I")
    public static int[] field1945 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1952 = "Connection lost.";

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Ldk;")
    public class283 field1950;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "[I")
    public int[] field1944;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field1946;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method816(byte arg0) {
        field1945 = null;
        field1952 = null;
        if (arg0 > -48) {
            method816((byte) -28);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIILrf;)V")
    public static final void method817(int arg0, int arg1, int arg2, class289 arg3) {
        field1954++;
        if (arg3.field4538 == arg0) {
            arg3.field4525 = arg3.field4440;
        } else if (arg3.field4538 == 1) {
            arg3.field4525 = (arg2 - arg3.field4444) / 2 + arg3.field4440;
        } else if (arg3.field4538 == 2) {
            arg3.field4525 = arg2 - arg3.field4444 - arg3.field4440;
        } else if (arg3.field4538 == 3) {
            arg3.field4525 = arg3.field4440 * arg2 >> 14;
        } else if (arg3.field4538 == 4) {
            arg3.field4525 = (arg3.field4440 * arg2 >> 14) + (arg2 - arg3.field4444) / 2;
        } else {
            arg3.field4525 = arg2 - (arg3.field4440 * arg2 >> 14) - arg3.field4444;
        }
        if (arg3.field4443 == 0) {
            arg3.field4468 = arg3.field4410;
        } else if (arg3.field4443 == 1) {
            arg3.field4468 = (arg1 - arg3.field4478) / 2 + arg3.field4410;
        } else if (arg3.field4443 == 2) {
            arg3.field4468 = arg1 - arg3.field4478 - arg3.field4410;
        } else if (arg3.field4443 == 3) {
            arg3.field4468 = arg3.field4410 * arg1 >> 14;
        } else if (arg3.field4443 == 4) {
            arg3.field4468 = (arg3.field4410 * arg1 >> 14) + (arg1 - arg3.field4478) / 2;
        } else {
            arg3.field4468 = arg1 - (arg3.field4410 * arg1 >> 14) - arg3.field4478;
        }
        if (!class64.field1009 || client.method972(arg3).field4049 == 0 && arg3.field4394 != 0) {
            return;
        }
        if (arg3.field4468 < 0) {
            arg3.field4468 = 0;
        } else if (arg3.field4478 + arg3.field4468 > arg1) {
            arg3.field4468 = arg1 - arg3.field4478;
        }
        if (arg3.field4525 < 0) {
            arg3.field4525 = 0;
        } else if (arg2 < (arg3.field4525 + arg3.field4444)) {
            arg3.field4525 = arg2 - arg3.field4444;
            return;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method818(int arg0, Component arg1) {
        field1953++;
        Method var2 = class12.field169;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class284.field4244);
        if (arg0 == -30864) {
            arg1.addFocusListener(class284.field4244);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)I")
    public static final int method819(byte arg0) {
        field1955++;
        int var1 = -34 % ((arg0 + 34) / 48);
        return class210.field3158.method1786((byte) -58);
    }
}
