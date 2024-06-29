import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class139 {

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Z")
    public static boolean field2162 = false;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2159 = 0;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Llc;")
    public static class385 field2161 = new class385();

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "[[Z")
    public static boolean[][] field2164 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 9)
    public static void method1014(int arg0) {
        if (arg0 >= -21) {
            method1014(26);
        }
        field2161 = null;
        field2164 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBIIII)V", line = 21)
    public static final void method1015(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2160++;
        if (arg3 == arg5) {
            class329.method2183((byte) 106, arg3, arg2, arg4, arg0);
            return;
        }
        if (class406.field6033 <= arg0 - arg3 && class185.field3005 >= (arg0 + arg3) && arg4 - arg5 >= class99.field1378 && (arg4 + arg5) <= class396.field5925) {
            class138.method1013(-1, arg2, arg0, arg4, arg3, arg5);
        } else {
            class231.method1642(arg0, arg3, 1653400929, arg2, arg4, arg5);
        }
        if (arg1 > -122) {
            field2159 = -23;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Laq;", line = 50)
    public static final class89 method1016(int arg0, int arg1, int arg2) {
        class232 var3 = class423.field6252[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3873;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 67)
    public static final void method1017(byte arg0) {
        field2163++;
        class52 var1 = class142.field2250;
        synchronized (class142.field2250) {
            class142.field2250.method336(87);
        }
        class52 var2 = class287.field4601;
        synchronized (class287.field4601) {
            class287.field4601.method336(86);
        }
        class392 var3 = class110.field1528;
        synchronized (class110.field1528) {
            if (arg0 > -20) {
                method1015(26, (byte) 33, -112, 108, -90, 27);
            }
            class110.field1528.method2477(-14264);
        }
    }
}
