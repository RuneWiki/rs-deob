import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class252 {

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field4381 = 0;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "[I")
    public static int[] field4382 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field4380 = 0;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field4384 = 0;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field4386 = 0;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Ltf;")
    public static class104 field4378;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILoh;)I")
    public static final int method1676(int arg0, class263 arg1) {
        field4385++;
        if (arg1 == null) {
            return -1;
        } else if (arg0 == -1) {
            for (int var2 = 0; var2 < class100.field1908; var2++) {
                if (arg1.method1766(-1, class238.field4159[var2])) {
                    return var2;
                }
            }
            return -1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIBI)V")
    public static final void method1677(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4383++;
        int var5 = -103 / ((arg3 - 39) / 50);
        if (arg2 - arg4 >= class51.field1099 && (arg2 + arg4) <= class198.field3587 && class11.field249 <= (arg1 - arg4) && class276.field4831 >= arg1 + arg4) {
            class226.method1539(114, arg4, arg1, arg0, arg2);
        } else {
            class254.method1688(false, arg0, arg2, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method1678(byte arg0) {
        field4378 = null;
        if (arg0 >= 26) {
            field4382 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
    public static final void method1679(byte arg0) {
        field4379++;
        if (!class130.field2387) {
            return;
        }
        class21 var1 = class64.method394(class114.field2144, -1943367162, class5.field100);
        if (var1 != null && var1.field521 != null) {
            class116 var2 = new class116();
            var2.field2166 = var1;
            var2.field2173 = var1.field521;
            class182.method1211(var2, 112);
        }
        class130.field2387 = false;
        class220.method1508(var1, (byte) -116);
        if (arg0 < 123) {
            field4381 = -85;
        }
    }
}
