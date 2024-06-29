import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class172 extends class173 implements class562 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    private int field2670;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)J", line = 4)
    public final long method1217(byte arg0) {
        int var2 = 73 % ((-32 - arg0) / 46);
        ++field2671;
        return super.field2675.getAddress();
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lte;I[BI)V", line = 14)
    public class172(class527 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field2670 = arg1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)I", line = 24)
    public final int method1218(int arg0) {
        if (arg0 > -99) {
            return 25;
        } else {
            ++field2672;
            return this.field2670;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)I", line = 35)
    public final int method1219(byte arg0) {
        if (arg0 > -65) {
            this.method1217((byte) 113);
        }
        ++field2673;
        return 0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[BI)V", line = 53)
    public final void method1220(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 == -27252) {
            ++field2669;
            this.method1221(arg2, arg1);
            this.field2670 = arg0;
        }
    }
}
