import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class277 extends class194 {

    @OriginalMember(owner = "client!no", name = "w", descriptor = "I")
    private int field3740;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    private int field3739;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "I")
    private int field3738;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "I")
    private int field3737;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "[[I")
    public static int[][] field3736 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "Lak;")
    public static class221 field3731;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "[[[B")
    public static byte[][][] field3734;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V", line = 3)
    public final void method594(int arg0, int arg1, int arg2) {
        if (arg0 < -29) {
            ++field3732;
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(IIIIII)V", line = 13)
    public class277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3740 = arg0;
        this.field3739 = arg2;
        this.field3738 = arg3;
        this.field3737 = arg1;
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(III)V", line = 28)
    public final void method592(int arg0, int arg1, int arg2) {
        ++field3728;
        if (arg0 != 50000) {
            this.method594(63, -34, 125);
        }
        int var4 = this.field3740 * arg1 >> 12;
        int var5 = this.field3739 * arg1 >> 12;
        int var6 = this.field3737 * arg2 >> 12;
        int var7 = this.field3738 * arg2 >> 12;
        class69.method600(super.field2788, var4, var5, var7, var6, (byte) -113);
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V", line = 50)
    public static void method1773(int arg0) {
        field3734 = null;
        field3731 = null;
        field3736 = null;
        if (arg0 != 25518) {
            method1773(-48);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIB)V", line = 62)
    public final void method593(int arg0, int arg1, byte arg2) {
        ++field3729;
        if (arg2 <= 5) {
            field3736 = null;
        }
    }
}
