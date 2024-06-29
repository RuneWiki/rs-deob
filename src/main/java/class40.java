import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class40 {

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field677 = 0;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "Z")
    public static boolean field678 = true;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "[I")
    public static int[] field675 = new int[256];

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static void method353(int arg0) {
        field675 = null;
        if (arg0 < 80) {
            method355((byte) -66);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLha;)Lcj;")
    public static final class121 method354(byte arg0, class31 arg1) {
        class121 var2 = new class121();
        field676++;
        var2.field1827 = arg1.method260((byte) -67);
        var2.field1828 = class261.method1749(-127, var2.field1827);
        if (arg0 != -78) {
            method354((byte) 104, (class31) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public static final void method355(byte arg0) {
        class155.field2316.method1172((byte) 122);
        field679++;
        if (arg0 < 125) {
            method354((byte) 10, (class31) null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIILnh;IJ)Z")
    public static final boolean method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class55 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class171.method1230(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}
