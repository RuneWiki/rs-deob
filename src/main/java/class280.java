import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class280 {

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4385 = "Loading title screen - ";

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Luf;")
    public static class176 field4384;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "[I")
    public static int[] field4381;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILf;)Ltb;")
    public static final class70 method1874(int arg0, class37 arg1) {
        if (arg0 != 0) {
            method1875(-81, 52, 98);
        }
        field4382++;
        return new class70(arg1.method306(arg0 + 99), arg1.method306(79), arg1.method306(59), arg1.method306(90), arg1.method306(arg0 ^ 0x5C), arg1.method306(arg0 + 119), arg1.method306(79), arg1.method306(79), arg1.method336(arg0 + 23362), arg1.method333((byte) -59));
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)J")
    public static final long method1875(int arg0, int arg1, int arg2) {
        class23 var3 = class255.field3907[arg0][arg1][arg2];
        return var3 == null || var3.field344 == null ? 0L : var3.field344.field3564;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZJI)V")
    public static final void method1876(boolean arg0, long arg1, int arg2) {
        field4383++;
        if (arg2 <= 113) {
            method1877((byte) -3);
        }
        if (arg1 == 0L) {
            return;
        }
        if (class132.field2037 >= 100) {
            class73.method567("", 0, class220.field3449, 43);
            return;
        }
        String var4 = class288.method1938(arg1, -113);
        for (int var5 = 0; var5 < class132.field2037; var5++) {
            if (class295.field4629[var5] == arg1) {
                class73.method567("", 0, var4 + class10.field206, 104);
                return;
            }
        }
        for (int var6 = 0; var6 < class262.field4100; var6++) {
            if (class231.field3603[var6] == arg1) {
                class73.method567("", 0, class191.field3037 + var4 + class121.field1867, 49);
                return;
            }
        }
        if (var4.equals(class261.field4058.field446)) {
            class73.method567("", 0, class209.field3251, 44);
            return;
        }
        class295.field4629[class132.field2037] = arg1;
        class107.field1711[class132.field2037] = class228.method1512(0, arg1);
        class130.field2025[class132.field2037++] = arg0;
        class195.field3074++;
        class65.field1027 = class141.field2178;
        class292.field4607.method1251(135, (byte) -61);
        class292.field4607.method337(2103219728, arg1);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method1877(byte arg0) {
        field4385 = null;
        field4384 = null;
        field4381 = null;
        if (arg0 < 45) {
            method1875(-125, -101, -117);
        }
    }
}
