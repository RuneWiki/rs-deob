import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class110 extends class210 {

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    private int field1693;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "I")
    private int field1707;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
    private int field1708;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "I")
    private int field1704;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "[J")
    public static long[] field1697 = new long[1000];

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "[I")
    public static int[] field1694 = new int[5];

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "I")
    public static int field1709 = 0;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "Lde;")
    public static class113 field1705;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "[[[Lud;")
    public static class2[][][] field1695;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBI)V")
    public final void method502(int arg0, byte arg1, int arg2) {
        ++field1702;
        int var4 = this.field1708 * arg2 >> 12;
        if (arg1 <= 72) {
            this.field1708 = -32;
        }
        int var5 = this.field1693 * arg0 >> 12;
        int var6 = this.field1704 * arg0 >> 12;
        int var7 = this.field1707 * arg2 >> 12;
        class203.method1429(var7, var6, var4, (byte) -127, var5, super.field3241);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)V")
    public final void method504(int arg0, int arg1, int arg2) {
        ++field1700;
        int var4 = this.field1708 * arg1 >> 12;
        int var5 = this.field1707 * arg1 >> 12;
        int var6 = this.field1704 * arg0 >> 12;
        int var7 = this.field1693 * arg0 >> 12;
        class181.method1294(super.field3247, super.field3241, super.field3242, var7, var4, (byte) 118, var6, var5);
        if (arg2 > -8) {
            field1705 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(IIIIIII)V")
    public class110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1693 = arg3;
        this.field1707 = arg2;
        this.field1708 = arg0;
        this.field1704 = arg1;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static void method818(int arg0) {
        field1705 = null;
        field1695 = null;
        field1697 = null;
        if (arg0 != 1878896812) {
            field1697 = null;
        }
        field1694 = null;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(Z)Z")
    public static final boolean method819(boolean arg0) {
        ++field1699;
        return arg0 ? true : class122.field1835;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)I")
    public static final int method820(byte arg0) {
        if (arg0 <= 6) {
            field1697 = null;
        }
        ++field1696;
        return 6;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IJ)V")
    public static final void method821(int arg0, long arg1) {
        ++field1698;
        if (arg0 <= -5) {
            if (arg1 != 0L) {
                ++class276.field4395;
                class240.field3826.method1762(228, true);
                class240.field3826.method313(-6968, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(III)V")
    public final void method499(int arg0, int arg1, int arg2) {
        ++field1701;
        int var4 = this.field1708 * arg2 >> 12;
        int var5 = this.field1707 * arg2 >> 12;
        int var6 = this.field1704 * arg0 >> 12;
        if (arg1 == -20) {
            int var7 = this.field1693 * arg0 >> 12;
            class296.method1979(super.field3242, var6, var4, (byte) -122, var5, super.field3247, var7);
        }
    }
}
