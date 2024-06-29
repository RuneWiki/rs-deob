import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class753 {

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "Law;")
    public static class76 field10498 = new class76();

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
    public static int field10493;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "I")
    public int field10494;

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
    public static int field10496;

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "I")
    public int field10497;

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "I")
    public int field10499;

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "Lwu;")
    public static class376 field10500;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "Z")
    public boolean field10495;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method4217(int arg0, int arg1, int arg2) {
        field10493++;
        if (((arg0 & arg2) != 0 | class549.method3069(127, arg1, arg0)) || class545.method3051(arg1, arg0, 0)) {
            return true;
        } else {
            return (arg1 & 0x37) == 0 && class439.method2531(arg0, 80, arg1);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIII)Z", line = 21)
    public static final boolean method4218(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10496++;
        if ((arg3 & class184.field2782[0][arg0][arg2]) != 0) {
            return true;
        } else if ((class184.field2782[arg4][arg0][arg2] & 0x10) == 0) {
            return class534.method2969(arg4, false, arg2, arg0) == arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z)V", line = 43)
    public static void method4219(boolean arg0) {
        if (!arg0) {
            method4219(true);
        }
        field10498 = null;
        field10500 = null;
    }
}
