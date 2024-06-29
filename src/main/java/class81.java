import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class81 {

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lte;")
    public static class244 field1004 = new class244(64);

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field1007 = -1;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Lib;")
    public static class56 field1000;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "S")
    public short field1006;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Z")
    public boolean field1001;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Z")
    public boolean field1002;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Z")
    public boolean field1003;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Z")
    public boolean field1005;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method449(int arg0) {
        if (arg0 > -115) {
            field1007 = -113;
        }
        field1004 = null;
        field1000 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIILpb;IJ)Z")
    public static final boolean method450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class264 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class255.method1746(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}
