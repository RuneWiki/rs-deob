import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class10 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lpk;")
    public static class133 field116 = new class133();

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIII)V", line = 4)
    public static final void method66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field118++;
        if (arg5 == arg7) {
            class170.method1198(arg2, arg5, arg3, arg4, arg0, arg1, true);
            return;
        }
        if (class72.field992 <= (arg2 - arg5) && arg2 + arg5 <= class126.field1842 && arg4 - arg7 >= class471.field6963 && class401.field5947 >= arg4 + arg7) {
            class101.method861(arg4, arg7, arg5, arg0, -124, arg1, arg2, arg3);
        } else {
            class88.method777(arg2, arg0, arg5, arg3, arg7, arg4, arg1, (byte) -112);
        }
        if (arg6 != 19173) {
            method69((byte) -18, null, -99);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 37)
    public static void method67(int arg0) {
        if (arg0 > -48) {
            field116 = null;
        }
        field116 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/String;)J", line = 47)
    public static final long method68(int arg0, String arg1) {
        field119++;
        int var2 = arg1.length();
        long var3 = (long) arg0;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B[BI)[B", line = 66)
    public static final byte[] method69(byte arg0, byte[] arg1, int arg2) {
        if (arg0 != 106) {
            method67(-123);
        }
        field117++;
        byte[] var3 = new byte[arg2];
        class201.method1412(arg1, 0, var3, 0, arg2);
        return var3;
    }
}
