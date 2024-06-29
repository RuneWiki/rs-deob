import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public class class440 {

    @OriginalMember(owner = "client!mja", name = "f", descriptor = "Llf;")
    private class250 field6336;

    @OriginalMember(owner = "client!mja", name = "d", descriptor = "J")
    public long field6334;

    @OriginalMember(owner = "client!mja", name = "b", descriptor = "I")
    public static int field6332 = 0;

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!mja", name = "c", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!mja", name = "e", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(Luq;Lbr;Ltga;Luq;BLuq;)Z")
    public static final boolean method2628(class172 arg0, class414 arg1, class64 arg2, class172 arg3, byte arg4, class172 arg5) {
        class626.field8486 = arg0;
        field6333++;
        class548.field7572 = arg5;
        class714.field9734 = new int[16];
        class311.field4406 = arg2;
        class208.field2682 = arg3;
        class129.field1778 = arg1;
        int var6 = -59 / ((11 - arg4) / 37);
        for (int var7 = 0; var7 < 16; var7++) {
            class714.field9734[var7] = 255;
        }
        return true;
    }

    @OriginalMember(owner = "client!mja", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6335++;
        this.field6336.method1573(this.field6334, false);
        super.finalize();
    }

    @OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Llf;JI)V")
    public class440(class250 arg0, long arg1, int arg2) {
        this.field6336 = arg0;
        this.field6334 = arg1;
    }
}
