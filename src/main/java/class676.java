import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class676 {

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[F")
    public static float[] field9412 = new float[4];

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field9411;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIB)Z", line = 3)
    public static final boolean method3884(int arg0, int arg1, byte arg2) {
        field9411++;
        if (arg2 > -108) {
            field9412 = null;
        }
        if (arg1 >= 1000 && arg0 < 1000) {
            return true;
        } else if (arg1 >= 1000 || arg0 >= 1000) {
            return arg1 >= 1000 && arg0 >= 1000;
        } else if (class67.method596((byte) -91, arg0)) {
            return true;
        } else {
            return !class67.method596((byte) -91, arg1);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Lho;", line = 37)
    public static final class150 method3885(int arg0, int arg1, int arg2) {
        if (arg0 != 1000) {
            method3884(-114, 57, (byte) 101);
        }
        field9410++;
        class150 var3 = (class150) class647.field9122.method2287((long) arg1 << 32 | (long) arg2, (byte) -117);
        if (var3 == null) {
            var3 = new class150(arg1, arg2);
            class647.field9122.method2278((byte) -41, var3.field2810, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 58)
    public static void method3886(int arg0) {
        field9412 = null;
        if (arg0 != -27249) {
            field9412 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Luda;", line = 70)
    public static final class453 method3887(int arg0) {
        field9409++;
        if (arg0 != -1001) {
            return null;
        }
        try {
            return new class200();
        } catch (Throwable var2) {
            try {
                return (class453) Class.forName("us").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class212();
            }
        }
    }
}
