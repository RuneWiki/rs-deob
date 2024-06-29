import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field149 = 0;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "[I")
    public static int[] field150 = new int[5];

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static final void method65(int arg0) {
        class79.field1136.method1430(-1);
        field151++;
        if (arg0 > -74) {
            field149 = -23;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
    public static final void method66(int arg0, boolean arg1) {
        class248.field3960.method1425(arg0, -127);
        field148++;
        if (!arg1) {
            field149 = 122;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method67(byte arg0) {
        field150 = null;
        if (arg0 != 19) {
            field149 = -11;
        }
    }
}
