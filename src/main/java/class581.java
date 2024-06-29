import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class581 extends class164 {

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "Lkga;")
    private class506 field8464;

    @OriginalMember(owner = "client!pda", name = "A", descriptor = "I")
    public int field8471;

    @OriginalMember(owner = "client!pda", name = "w", descriptor = "J")
    private long field8467;

    @OriginalMember(owner = "client!pda", name = "u", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!pda", name = "v", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!pda", name = "x", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!pda", name = "y", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!pda", name = "C", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIBI)V")
    public static final void method3383(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field8469++;
        if (arg3 != -63) {
            method3384(-123, -4, 99, 45, 0);
        }
        if (class546.field7934 == 1) {
            class196.field2377[class25.field595 / 100].method3924(class52.field848 - 8, class136.field1731 + -8);
        }
        if (class546.field7934 == 2) {
            class196.field2377[(class25.field595 / 100) + 4].method3924(class52.field848 - 8, class136.field1731 + -8);
        }
        class152.method980(107);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIII)V")
    public static final void method3384(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 7) {
            return;
        }
        if (class587.field8513 <= (arg1 - arg0) && class221.field2866 >= (arg0 + arg1) && arg4 - arg0 >= class598.field8632 && class288.field3883 >= arg4 + arg0) {
            class651.method3663(8, arg1, arg0, arg3, arg4);
        } else {
            class580.method3381(arg1, (byte) -122, arg4, arg0, arg3);
        }
        field8470++;
    }

    @OriginalMember(owner = "client!pda", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8472++;
        this.method3386(false);
        super.finalize();
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)J")
    public final long method3385(byte arg0) {
        field8466++;
        if (arg0 > -108) {
            this.field8467 = 81L;
        }
        return this.field8467;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Z)V")
    private final void method3386(boolean arg0) {
        field8468++;
        if (this.field8467 > 0L) {
            this.field8464.field7096.releasePbuffer(this.field8467);
            this.field8467 = 0L;
        }
        if (arg0) {
            this.field8467 = 34L;
        }
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lkga;II)V")
    public class581(class506 arg0, int arg1, int arg2) {
        this.field8464 = arg0;
        this.field8471 = arg1 * arg2;
        this.field8467 = this.field8464.field7096.createPbuffer(arg1, arg2);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIIIII)I")
    public static final int method3387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 0x3;
        field8465++;
        if (arg1 != 31100) {
            return -56;
        }
        if ((arg3 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg4;
            arg4 = var8;
        }
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return arg0;
        } else if (var7 == 2) {
            return 8 - arg5 - arg6;
        } else {
            return 1 + 7 - (arg4 + arg0);
        }
    }
}
