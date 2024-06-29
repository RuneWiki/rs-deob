import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class691 implements class205 {

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "I")
    public int field9618;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "Lkr;")
    public static class602 field9616 = new class602(122, -2);

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
    public static int field9615;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
    public static int field9617;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    public static int field9619;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
    public static void method3910(int arg0) {
        if (arg0 >= -35) {
            field9619 = -38;
        }
        field9616 = null;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Z)Lww;")
    public final class288 method1206(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field9617++;
            return class318.field4422;
        }
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(I)V")
    public class691(int arg0) {
        this.field9618 = arg0;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IB)Lbk;")
    public static final class446 method3911(int arg0, byte arg1) {
        field9615++;
        if (arg1 >= -125) {
            return null;
        }
        class446[] var2 = class170.method1089(-77);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class446 var4 = var2[var3];
            if (var4.field6189 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
