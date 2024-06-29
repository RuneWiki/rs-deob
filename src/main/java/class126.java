import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class126 {

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1859 = "Walk here";

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "[I")
    public static int[] field1855 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Z")
    public static boolean field1856 = true;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)Lgd;")
    public static final class149 method879(int arg0, byte arg1) {
        field1858++;
        class149 var2 = (class149) class24.field387.method945((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class280.field4305.method1605(arg1 ^ 0x31, arg0, 30);
        class149 var4 = new class149();
        if (arg1 != -75) {
            method879(-104, (byte) -120);
        }
        if (var3 != null) {
            var4.method1008(arg0, -1, new class54(var3));
        }
        class24.field387.method941(var4, (long) arg0, -8447);
        return var4;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Lob;")
    public static final class152 method880(int arg0, int arg1) {
        field1861++;
        class152 var2 = (class152) class15.field219.method945((long) arg1, true);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 1023) {
            class152 var3 = class253.method1724(class198.field2982, arg1, class197.field2981, (byte) 101, false);
            if (var3 != null) {
                class15.field219.method941(var3, (long) arg1, arg0 ^ 0xFFFFDCFE);
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method881(int arg0) {
        field1855 = null;
        field1859 = null;
        if (arg0 <= 19) {
            method879(71, (byte) -39);
        }
    }
}
