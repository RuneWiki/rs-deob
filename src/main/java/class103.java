import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class103 extends class261 {

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public volatile int field1948 = -1;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "Ljava/lang/String;")
    public volatile String field1950;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Lwm;")
    public static class399 field1951 = new class399(4);

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "[I")
    public static int[] field1952 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "Ls;")
    public static class186 field1953 = new class186(62, 6);

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Lbj;")
    public static class162 field1954 = new class162(4, -1);

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field1955 = 0;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 12)
    public class103(String arg0) {
        this.field1950 = arg0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZIIII)V", line = 20)
    public static final void method898(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < 1) {
            arg5 = 1;
        }
        field1949++;
        if (arg2 < 1) {
            arg2 = 1;
        }
        int var6 = arg5 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class434.field6469 + ((class224.field3511 - class434.field6469) * var6 / 100);
        if (class86.field1766 > var7) {
            var7 = class86.field1766;
        } else if (var7 > class52.field1121) {
            var7 = class52.field1121;
        }
        int var8 = arg5 * var7 * 512 / (arg2 * 334);
        if (arg0 < 90) {
            method898(-51, false, 17, 6, -20, -71);
        }
        if (var8 < class375.field5493) {
            short var9 = class375.field5493;
            var7 = arg2 * 334 * var9 / (arg5 * 512);
            if (var7 > class52.field1121) {
                var7 = class52.field1121;
                int var10 = arg5 * var7 * 512 / (var9 * 334);
                int var11 = (arg2 - var10) / 2;
                if (arg1) {
                    class262.field4006.method321();
                    class262.field4006.method1809(arg4, arg3, -16777216, arg5, var11, -7456);
                    class262.field4006.method1809(arg4, arg3 + arg2 - var11, -16777216, arg5, var11, -7456);
                }
                arg2 -= var11 * 2;
                arg3 += var11;
            }
        } else if (class482.field7113 < var8) {
            short var12 = class482.field7113;
            var7 = arg2 * var12 * 334 / (arg5 * 512);
            if (class86.field1766 > var7) {
                var7 = class86.field1766;
                int var13 = arg2 * var12 * 334 / (var7 * 512);
                int var14 = (arg5 - var13) / 2;
                if (arg1) {
                    class262.field4006.method321();
                    class262.field4006.method1809(arg4, arg3, -16777216, var14, arg2, -7456);
                    class262.field4006.method1809(arg4 + arg5 - var14, arg3, -16777216, var14, arg2, -7456);
                }
                arg5 -= var14 * 2;
                arg4 += var14;
            }
        }
        class107.field1975 = (short) arg2;
        class460.field6858 = arg3;
        class36.field545 = arg5 * var7 / 334;
        class9.field136 = arg4;
        class410.field6199 = (short) arg5;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V", line = 121)
    public static void method899(byte arg0) {
        field1951 = null;
        field1952 = null;
        field1953 = null;
        if (arg0 != 91) {
            field1953 = null;
        }
        field1954 = null;
    }
}
