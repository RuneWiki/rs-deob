import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class355 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2239(int arg0, int arg1, byte arg2) {
        if (arg2 == -106) {
            field5501++;
            return class408.method2490(arg1, (byte) 58, arg0) || class170.method1196(arg1, 45056, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLqa;)V")
    public static final void method2240(byte arg0, class496 arg1) {
        field5500++;
        if (arg0 != 115) {
            return;
        }
        if (class207.field2923) {
            class103.method694(arg1, (byte) 113);
        } else {
            class460.method2762(arg1, -1);
        }
    }
}
