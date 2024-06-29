import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class452 {

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public int field5964;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Z")
    public static boolean field5967 = false;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Z")
    public static boolean field5965 = false;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "[I")
    public static int[] field5962;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "[Lf;")
    public static class532[] field5968;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5961++;
        if (arg6 < 512 || arg2 < 512 || (class703.field9886 * 512 - 1024) < arg6 || class431.field5789 * 512 - 1024 < arg2) {
            class289.field3821[0] = class289.field3821[1] = -1;
            return;
        }
        int var10 = class180.method1211(arg3, true, arg6, arg2) - arg0;
        class546.field7466.method356(arg1, 0, 0);
        class146.field1963.method1123(class546.field7466);
        class146.field1963.method1045(arg6, var10, arg2, class289.field3821);
        class546.field7466.method356(-arg1, 0, 0);
        class146.field1963.method1123(class546.field7466);
        if (arg9 != 512) {
            method2540(-37, 47, -31, 77, -105, -31, -121, -128, 44, -108);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method2541(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5969++;
        if ((class31.field440[arg4][arg3][arg1] & 0x2) != 0) {
            return true;
        } else if ((class31.field440[arg2][arg3][arg1] & 0x10) == 0) {
            return class229.method1418(arg3, (byte) -97, arg2, arg1) == arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)I")
    public static final int method2542(byte arg0) {
        if (arg0 > -48) {
            field5968 = null;
        }
        field5963++;
        return class310.field4194;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(I)V")
    public class452(int arg0) {
        this.field5964 = arg0;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
    public static void method2543(boolean arg0) {
        field5968 = null;
        field5962 = null;
        if (arg0) {
            method2540(84, 4, -113, 39, 64, -92, 9, 75, -66, 112);
        }
    }

    @OriginalMember(owner = "client!sk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5966++;
        throw new IllegalStateException();
    }
}
