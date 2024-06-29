import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class529 extends class761 implements class726 {

    @OriginalMember(owner = "client!bda", name = "s", descriptor = "I")
    private int field7508;

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!bda", name = "o", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!bda", name = "p", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!bda", name = "q", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!bda", name = "r", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(Z)I", line = 4)
    public final int method3071(boolean arg0) {
        ++field7505;
        return !arg0 ? 63 : this.field7508;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)I", line = 15)
    public final int method3072(boolean arg0) {
        if (!arg0) {
            this.field7508 = -70;
        }
        ++field7504;
        return super.field10486;
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lkv;I[BIZ)V", line = 27)
    public class529(class280 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7508 = arg1;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "([BIII)V", line = 35)
    public final void method3073(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method4195(arg1, arg0, true);
        ++field7507;
        if (arg3 > 72) {
            this.field7508 = arg2;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)J", line = 50)
    public final long method3074(byte arg0) {
        ++field7503;
        if (arg0 > -87) {
            this.method2013(-15);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lkv;ILjaclib/memory/Buffer;IZ)V", line = 61)
    public class529(class280 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7508 = arg1;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIBI)V", line = 70)
    public static final void method3075(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 == -4) {
            for (int var6 = arg3; ~var6 >= ~arg0; ++var6) {
                class382.method2347(arg5, class347.field5087[var6], arg1, 7, arg2);
            }
            ++field7502;
        }
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V", line = 89)
    public final void method2013(int arg0) {
        if (arg0 != 59838567) {
            this.field7508 = -4;
        }
        ++field7506;
        super.field10488.method1878(this, 0);
    }
}
