import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class305 extends class397 implements class510 {

    @OriginalMember(owner = "client!pba", name = "u", descriptor = "I")
    private int field4524;

    @OriginalMember(owner = "client!pba", name = "p", descriptor = "[I")
    public static int[] field4519 = new int[200];

    @OriginalMember(owner = "client!pba", name = "q", descriptor = "Lkj;")
    public static class527 field4520 = new class527(13, 6);

    @OriginalMember(owner = "client!pba", name = "w", descriptor = "[I")
    public static int[] field4526 = new int[2048];

    @OriginalMember(owner = "client!pba", name = "v", descriptor = "[I")
    public static int[] field4525 = new int[13];

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!pba", name = "m", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!pba", name = "n", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!pba", name = "o", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!pba", name = "r", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!pba", name = "s", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!pba", name = "t", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)I")
    public final int method1997(int arg0) {
        int var2 = -13 % ((-74 - arg0) / 37);
        ++field4521;
        return this.field4524;
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)V")
    public final void method266(int arg0) {
        if (arg0 >= 31) {
            super.field5790.method43(this, -26418);
            ++field4518;
        }
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lus;I[BIZ)V")
    public class305(class1 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4524 = arg1;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IB)Z")
    public static final boolean method1998(int arg0, byte arg1) {
        ++field4517;
        if (arg0 != -14094) {
            return false;
        } else {
            int var2 = 255 & arg1;
            if (var2 == 0) {
                return false;
            } else {
                return var2 < 128 || var2 >= 160 || ~class343.field5108[var2 + -128] != -1;
            }
        }
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lus;ILjaclib/memory/Buffer;IZ)V")
    public class305(class1 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4524 = arg1;
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)I")
    public final int method1999(byte arg0) {
        ++field4516;
        if (arg0 != -71) {
            field4526 = null;
        }
        return super.field5787;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "([BIIB)V")
    public final void method2000(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -55) {
            field4525 = null;
        }
        this.method2445(arg1, arg0, (byte) -116);
        ++field4522;
        this.field4524 = arg2;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)J")
    public final long method2001(byte arg0) {
        ++field4523;
        if (arg0 > -97) {
            field4525 = null;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "(I)V")
    public static void method2002(int arg0) {
        field4519 = null;
        field4526 = null;
        field4525 = null;
        if (arg0 == -1) {
            field4520 = null;
        }
    }
}
