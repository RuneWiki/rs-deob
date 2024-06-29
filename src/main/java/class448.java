import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class448 extends class155 implements class250 {

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "I")
    private int field5838;

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "[[B")
    public static byte[][] field5841 = new byte[1000][];

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "[I")
    public static int[] field5837 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!qq", name = "x", descriptor = "Lgp;")
    public static class576 field5845 = new class576(5, 1);

    @OriginalMember(owner = "client!qq", name = "y", descriptor = "Lgh;")
    public static class54 field5846 = new class54(8, 0, 4, 1);

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "Lhu;")
    public static class238 field5847 = new class238();

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!qq", name = "w", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "[I")
    public static int[] field5848;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIZ[B)V")
    public final void method1630(int arg0, int arg1, boolean arg2, byte[] arg3) {
        this.method876((byte) -102, arg3, arg1);
        ++field5844;
        if (arg2) {
            this.field5838 = arg0;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lck;I[BIZ)V")
    public class448(class733 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field5838 = arg1;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I")
    public final int method1632(int arg0) {
        ++field5842;
        return arg0 >= -92 ? -127 : this.field5838;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)Z")
    public static final boolean method2563(int arg0, byte arg1) {
        if (arg1 != -66) {
            field5847 = null;
        }
        ++field5843;
        return ~arg0 == -1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(B)V")
    public final void method877(byte arg0) {
        ++field5836;
        super.field1968.method3919(-107, this);
        int var2 = -108 / ((-43 - arg0) / 55);
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V")
    public static void method2564(int arg0) {
        field5848 = null;
        field5841 = null;
        field5847 = null;
        field5845 = null;
        field5846 = null;
        field5837 = null;
        if (arg0 != 18987) {
            field5848 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)J")
    public final long method1629(int arg0) {
        if (arg0 != 24497) {
            field5841 = null;
        }
        ++field5840;
        return 0L;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)I")
    public final int method1631(byte arg0) {
        ++field5839;
        return arg0 > -79 ? -80 : super.field1971;
    }
}
