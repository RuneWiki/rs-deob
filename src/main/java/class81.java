import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class81 extends class170 {

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public static int field1126 = 0;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "Lhc;")
    public static class368 field1125 = new class368("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "Lij;")
    public static class316 field1127;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "[I")
    public static int[] field1124;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method653(int arg0);

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)Z")
    public abstract boolean method654(byte arg0);

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
    public static void method655(int arg0) {
        field1127 = null;
        field1124 = null;
        if (arg0 != 0) {
            method657(79, -121, 87, 98, 98, -5);
        }
        field1125 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[B)I")
    public static final int method656(int arg0, int arg1, byte[] arg2) {
        if (arg0 <= 114) {
            return 57;
        } else {
            field1123++;
            return class313.method1893(arg2, arg1, 0, (byte) 74);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
    public static final void method657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1129++;
        if (arg2 == arg3) {
            class156.method1136((byte) 68, arg5, arg1, arg4, arg2);
            return;
        }
        if (arg0 < 36) {
            field1127 = null;
        }
        if (class80.field1119 <= arg4 - arg2 && arg2 + arg4 <= class430.field6003 && arg1 - arg3 >= class143.field2090 && (arg1 + arg3) <= class42.field543) {
            class132.method988(3, arg1, arg4, arg3, arg5, arg2);
        } else {
            class13.method64(arg2, arg3, true, arg4, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1128++;
        if (arg6 == -8345 && class387.method2400(arg0, 176)) {
            client.method1649(class103.field1425[arg0], -1, arg2, arg7, arg3, arg9, arg1, arg8, arg4, arg5);
        }
    }
}
