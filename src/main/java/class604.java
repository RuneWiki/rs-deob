import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class604 extends class175 {

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 5)
    public class604() {
        super(0, true);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V", line = 10)
    public static final void method3374(int arg0, int arg1) {
        ++field8194;
        class7.field54 = 100;
        class672.field9007 = arg0;
        class163.field2163 = -1;
        class419.field6021 = 3;
        if (arg1 != -6791) {
            method3374(-117, -106);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BII)Z", line = 24)
    public static final boolean method3375(byte arg0, int arg1, int arg2) {
        if (arg0 <= 98) {
            return false;
        } else {
            ++field8195;
            return class625.method3461(arg2, arg1, 256) || class87.method695(arg1, arg2, 32);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)[I", line = 35)
    public final int[] method47(boolean arg0, int arg1) {
        ++field8196;
        if (!arg0) {
            method3374(-93, -37);
        }
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            class421.method2532(var3, 0, class598.field8136, class456.field6536[arg1]);
        }
        return var3;
    }
}
