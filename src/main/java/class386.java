import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public abstract class class386 extends class499 {

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "[I")
    public static int[] field5426 = new int[32];

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field5428 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "F")
    public static float field5431;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)V")
    public static void method2216(byte arg0) {
        field5428 = null;
        if (arg0 == 17) {
            field5426 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I")
    public abstract int method2217(int arg0);

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BII)V")
    public static final void method2218(byte arg0, int arg1, int arg2) {
        field5427++;
        if (arg0 >= -33) {
            method2216((byte) -24);
        }
        if (class341.field4700 == class288.field3885) {
            if (!class173.method1072(arg2, 1, 1, false, 0, 0, (byte) 126, -2, arg1)) {
                class173.method1072(arg2, 1, 1, false, 0, 0, (byte) 126, -3, arg1);
            }
        } else if (!class173.method1072(arg2, 1, 1, false, 0, 0, (byte) 126, -3, arg1)) {
            class173.method1072(arg2, 1, 1, false, 0, 0, (byte) 126, -2, arg1);
        }
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)J")
    public abstract long method2219(int arg0);

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)I")
    public abstract int method2220(int arg0);

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)I")
    public abstract int method2221(int arg0);

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)V")
    public static final void method2222(boolean arg0) {
        class473.field6914 = null;
        class472.field6901 = null;
        class157.field2237 = null;
        class323.field4452 = null;
        class125.field1724 = null;
        class321.field4442 = null;
        class461.field6703 = null;
        class482.field7076 = null;
        field5430++;
        if (arg0) {
            field5428 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method2223(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (class382.field5379 <= arg1 && arg3 <= class175.field2497 && class343.field4727 <= arg2 && class54.field753 >= arg4) {
            if (arg6 == 1) {
                class336.method1866(arg0, arg1, (byte) -120, arg3, arg2, arg4);
            } else {
                class76.method565(arg2, 44, arg3, arg1, arg4, arg0, arg6);
            }
        } else if (arg6 == 1) {
            class197.method1219(arg1, arg0, arg3, arg4, false, arg2);
        } else {
            class270.method1544(arg0, arg4, arg6, -104, arg3, arg1, arg2);
        }
        if (arg5 == -19) {
            field5429++;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBI)I")
    public static final int method2224(int arg0, byte arg1, int arg2) {
        field5432++;
        if (arg1 != 74) {
            method2223(14, 48, -29, 50, 50, (byte) -34, -99);
        }
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg0 - var3;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field5426[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
