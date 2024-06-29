import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class549 {

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
    public static int field7508 = 0;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "[S")
    public static short[] field7509;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIILr;II[[[BIIII)V")
    public static final void method3073(int arg0, int arg1, int arg2, int arg3, int arg4, class562 arg5, int arg6, int arg7, byte[][][] arg8, int arg9, int arg10, int arg11, int arg12) {
        field7510++;
        if (arg0 == 0 || arg12 == 0) {
            return;
        }
        if (arg0 == 9) {
            arg10 = arg10 + 1 & 0x3;
            arg0 = 1;
        }
        if (arg0 == 10) {
            arg10 = arg10 + 3 & 0x3;
            arg0 = 1;
        }
        if (arg0 == 11) {
            arg0 = 8;
            arg10 = arg10 + 3 & 0x3;
        }
        arg5.method1066(arg9, arg2, arg4, arg3, arg11, arg7, arg8[arg0 - 1][arg10], arg12, arg6);
        if (arg1 != 1) {
            field7509 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
    public static void method3074(int arg0) {
        if (arg0 >= 95) {
            field7509 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)Z")
    public final boolean method3075(int arg0) {
        if (arg0 != -1) {
            method3076(-33, false);
        }
        field7506++;
        return class687.field9702 == this | class492.field6794 == this;
    }

    @OriginalMember(owner = "client!uda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7507++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZ)V")
    public static final void method3076(int arg0, boolean arg1) {
        if (!arg1) {
            field7505++;
            class256 var2 = class592.method3279((byte) -109, 6, arg0);
            var2.method1546((byte) -103);
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(III)Lse;")
    public static final class207 method3077(int arg0, int arg1, int arg2) {
        if (class153.field2168[arg0][arg1][arg2] == null) {
            boolean var3 = class153.field2168[0][arg1][arg2] != null && class153.field2168[0][arg1][arg2].field2771 != null;
            if (var3 && arg0 >= class171.field2428 - 1) {
                return null;
            }
            class361.method2113(arg0, arg1, arg2);
        }
        return class153.field2168[arg0][arg1][arg2];
    }
}
