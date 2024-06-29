import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class26 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public int field262;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field267 = 0;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Lvu;")
    public static class677 field263 = new class677();

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BIIII)Z")
    public static final boolean method147(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field266++;
        if ((class434.field6341[0][arg4][arg1] & 0x2) != 0) {
            return true;
        } else if (arg0 >= -18) {
            return true;
        } else if ((class434.field6341[arg3][arg4][arg1] & 0x10) == 0) {
            return arg2 == class474.method2880(arg4, 1, arg1, arg3);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static final void method148(int arg0) {
        field265++;
        class362.field5473 = arg0;
        class407.field6032 = arg0;
        class540.field7713 = arg0;
        class98.field1464 = arg0;
    }

    @OriginalMember(owner = "client!vj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field264++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public static void method149(int arg0) {
        field263 = null;
        if (arg0 != -2127) {
            method148(117);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(II)V")
    public class26(int arg0, int arg1) {
        this.field262 = arg1;
    }
}
