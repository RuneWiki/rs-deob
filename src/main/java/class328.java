import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class328 {

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "[I")
    public static int[] field4216 = new int[32];

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "[Lf;")
    public static class404[] field4215;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public static void method1950(boolean arg0) {
        field4216 = null;
        if (arg0) {
            method1952(-45, 79, true);
        }
        field4215 = null;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)Z")
    public static final boolean method1951(boolean arg0) {
        if (arg0) {
            field4215 = null;
        }
        field4214++;
        return class271.field3433 > 0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIZ)V")
    public static final void method1952(int arg0, int arg1, boolean arg2) {
        field4211++;
        class378 var3 = class188.method1235(arg2, (byte) -127, arg1);
        if (var3 != null) {
            for (int var4 = arg0; var4 < var3.field4901.length; var4++) {
                var3.field4901[var4] = -1;
                var3.field4905[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B[BII)[B")
    public static final byte[] method1953(byte arg0, byte[] arg1, int arg2, int arg3) {
        field4212++;
        byte[] var4 = new byte[arg2];
        if (arg0 <= 24) {
            method1951(true);
        }
        class526.method3113(arg1, arg3, var4, 0, arg2);
        return var4;
    }
}
