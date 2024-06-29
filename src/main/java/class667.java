import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class667 extends class379 {

    @OriginalMember(owner = "client!av", name = "m", descriptor = "Lifa;")
    public class450 field9164 = new class450();

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public static int field9162;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ILha;)V")
    public static final void method3744(int arg0, class66 arg1) {
        field9160++;
        if (arg0 == -17733 && class384.field4910 != class300.field3596.field808 && class107.field1351 != null && class397.method2329(class300.field3596.field808, -119, arg1)) {
            class384.field4910 = class300.field3596.field808;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)I")
    public static final int method3745(int arg0, int arg1) {
        if (arg1 == 6) {
            field9163++;
            return arg0 >>> 8;
        } else {
            return -21;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
    public static final void method3746(int arg0) {
        class569.field7805.method2115(0);
        if (arg0 == -5369) {
            field9162++;
            class749.field10399.method2115(0);
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(II)V")
    public static final void method3747(int arg0, int arg1) {
        if (arg1 != 19687) {
            method3746(6);
        }
        field9159++;
        class714 var2 = class350.method2072((long) arg0, 6, (byte) 126);
        var2.method4044((byte) -128);
    }
}
