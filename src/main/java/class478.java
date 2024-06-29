import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class478 extends class371 implements class401 {

    @OriginalMember(owner = "client!uda", name = "j", descriptor = "I")
    private int field6635;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "Z")
    public static boolean field6629 = true;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)I", line = 5)
    public final int method2504(int arg0) {
        if (arg0 != 4180) {
            this.field6635 = -112;
        }
        ++field6633;
        return 0;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)I", line = 17)
    public final int method2502(byte arg0) {
        ++field6628;
        int var2 = 2 % ((29 - arg0) / 63);
        return this.field6635;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)J", line = 27)
    public final long method2503(int arg0) {
        ++field6634;
        if (arg0 != 1932) {
            this.field6635 = 21;
        }
        return super.field5374.getAddress();
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(B)V", line = 40)
    public static final void method2789(byte arg0) {
        if (arg0 < 19) {
            method2790(88, (byte) 47);
        }
        for (int var1 = 0; var1 < class40.field637; ++var1) {
            int var2 = class402.method2505(class40.field637, var1 - -class781.field10707, -126) * class704.field9863;
            for (int var3 = 0; ~class704.field9863 < ~var3; ++var3) {
                int var4 = var2 + class402.method2505(class704.field9863, class405.field5877 + var3, -126);
                if (~class462.field6396[var4] == ~class37.field575) {
                    class205.field2686[var4].method2188(0, 0, class639.field8876, class462.field6403, class639.field8876 * var3, class462.field6403 * var1, true, true);
                }
            }
        }
        ++field6632;
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Ldia;I[BI)V", line = 84)
    public class478(class246 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6635 = arg1;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "([BIII)V", line = 92)
    public final void method2501(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field6631;
        this.method2304(arg0, arg3);
        if (arg2 != 30463) {
            field6629 = false;
        }
        this.field6635 = arg1;
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Ldia;ILjaclib/memory/Buffer;)V", line = 104)
    public class478(class246 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field6635 = arg1;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IB)V", line = 113)
    public static final void method2790(int arg0, byte arg1) {
        if (arg1 == 6) {
            ++field6630;
            class326.field4748 = arg0;
        }
    }
}
