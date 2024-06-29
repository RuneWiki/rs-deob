import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class312 extends class339 {

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "[I")
    public static int[] field4169 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "Lhn;")
    public static class509 field4168 = new class509(8);

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
    public static void method1858(int arg0) {
        field4169 = null;
        if (arg0 != -6174) {
            field4170 = -69;
        }
        field4168 = null;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B[BZ)Ljava/lang/Object;")
    public static final Object method1859(byte arg0, byte[] arg1, boolean arg2) {
        field4171++;
        if (arg1 == null) {
            return null;
        } else if (arg0 < 120) {
            return null;
        } else {
            if (arg1.length > 136 && !class520.field7664) {
                try {
                    class520 var3 = (class520) Class.forName("np").getDeclaredConstructor().newInstance();
                    var3.method1984(arg1, false);
                    return var3;
                } catch (Throwable var4) {
                    class520.field7664 = true;
                }
            }
            return arg2 ? class380.method2319(1, arg1) : arg1;
        }
    }
}
