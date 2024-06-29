import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public abstract class class682 {

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "Lnv;")
    public class417 field9647;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "[I")
    public static int[] field9651 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    public static int field9652 = 0;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public static int field9648;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
    public static int field9649;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public static int field9650;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lig;I)Lcca;", line = 8)
    public static final class247 method3864(class244 arg0, int arg1) {
        field9650++;
        return arg1 == 8192 ? new class247(arg0.method1466((byte) 31), arg0.method1466((byte) 31), arg0.method1466((byte) 31), arg0.method1466((byte) 31), arg0.method1458((byte) 26), arg0.method1458((byte) 76), arg0.method1423(-70)) : null;
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V", line = 20)
    public static void method3865(int arg0) {
        if (arg0 == -1) {
            field9651 = null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lnv;)V", line = 29)
    public class682(class417 arg0) {
        this.field9647 = arg0;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(BI)V", line = 41)
    public static final void method3866(byte arg0, int arg1) {
        field9649++;
        class456 var2 = (class456) class228.field2651.method1754(false, (long) arg1);
        int var3 = -56 % (arg0 / 47);
        if (var2 != null) {
            var2.field6541 = !var2.field6541;
            var2.field6543.method3484(var2.field6541, -51);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
    public abstract void method288(int arg0);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IBI)V")
    public abstract void method289(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ltha;II)V")
    public abstract void method292(class292 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)Z")
    public abstract boolean method286(boolean arg0);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IZ)V")
    public abstract void method287(int arg0, boolean arg1);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(BZ)V")
    public abstract void method285(byte arg0, boolean arg1);
}
