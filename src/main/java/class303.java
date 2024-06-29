import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class303 {

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "Lmba;")
    public static class646 field4285 = new class646();

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "[I")
    public static int[] field4287 = new int[1000];

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "[Ltj;")
    public static class687[] field4289 = new class687[8];

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!ofa", name = "g", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)Lbea;", line = 6)
    public static final class543 method1993(byte arg0) {
        field4288++;
        try {
            return new class389();
        } catch (Throwable var2) {
            if (arg0 > -74) {
                field4285 = null;
            }
            try {
                return (class543) Class.forName("mia").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class599();
            }
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Ljava/lang/String;CB)I", line = 38)
    public static final int method1994(String arg0, char arg1, byte arg2) {
        field4291++;
        int var3 = 0;
        int var4 = arg0.length();
        int var5 = 0;
        if (arg2 != -37) {
            field4287 = null;
        }
        while (var4 > var5) {
            if (arg1 == arg0.charAt(var5)) {
                var3++;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)V", line = 64)
    public static void method1995(int arg0) {
        field4289 = null;
        field4287 = null;
        if (arg0 != -347068888) {
            field4287 = null;
        }
        field4285 = null;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(FIIFIZFLkt;FIFI[B)V", line = 77)
    public static final void method1996(float arg0, int arg1, int arg2, float arg3, int arg4, boolean arg5, float arg6, class533 arg7, float arg8, int arg9, float arg10, int arg11, byte[] arg12) {
        field4290++;
        if (arg5) {
            for (int var13 = 0; var13 < arg11; var13++) {
                class699.method3952(2, arg4, arg0, var13, arg11, arg6, arg8, arg1, arg7, arg3, arg10, arg9, arg12, arg2);
                arg2 += arg4 * arg9;
            }
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IZ)I", line = 101)
    public static final int method1997(int arg0, boolean arg1) {
        field4286++;
        if (!arg1) {
            field4289 = null;
        }
        return arg0 >>> 8;
    }
}
