import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class456 extends class328 {

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    private int field6736;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    private int field6739;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    private int field6741;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    private int field6744;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "[[S")
    public static short[][] field6747 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "Lvq;")
    public static class24 field6748 = new class24(55, 3);

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "Ltg;")
    public static class304 field6749 = new class304();

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "[I")
    public static int[] field6751 = new int[2];

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "Lnr;")
    public static class450 field6750;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIBIIIII)V", line = 5)
    public static final void method2824(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6738;
        class265 var10 = null;
        for (class265 var11 = (class265) class276.field4087.method2478(1603); var11 != null; var11 = (class265) class276.field4087.method2486((byte) -82)) {
            if (var11.field3927 == arg8 && ~var11.field3937 == ~arg0 && var11.field3915 == arg5 && ~var11.field3929 == ~arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class265();
            var10.field3929 = arg7;
            var10.field3915 = arg5;
            var10.field3927 = arg8;
            var10.field3937 = arg0;
            class230.method1567(var10, true);
            class276.field4087.method2484(0, var10);
        }
        var10.field3917 = arg1;
        var10.field3938 = arg9;
        var10.field3928 = arg6;
        if (arg4 > -107) {
            field6749 = null;
        }
        var10.field3926 = arg3;
        var10.field3934 = arg2;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lct;I)V", line = 49)
    public static final void method2825(class104 arg0, int arg1) {
        ++field6735;
        if (arg1 >= -62) {
            method2824(10, -125, -101, 45, (byte) -49, 16, 29, 80, -36, 99);
        }
        class55.field677 = arg0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BII)V", line = 63)
    public final void method328(byte arg0, int arg1, int arg2) {
        ++field6737;
        int var4 = this.field6739 * arg2 >> 12;
        if (arg0 != 20) {
            this.method328((byte) -34, -25, 118);
        }
        int var5 = this.field6741 * arg2 >> 12;
        int var6 = this.field6744 * arg1 >> 12;
        int var7 = this.field6736 * arg1 >> 12;
        class403.method2516(var7, -1, var4, var6, var5, super.field4883);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lct;Lct;B)V", line = 83)
    public static final void method2826(class104 arg0, class104 arg1, byte arg2) {
        ++field6746;
        if (arg2 < 96) {
            field6749 = null;
        }
        class90.field1111 = arg0;
        class307.field4537 = arg1;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V", line = 95)
    public static void method2827(int arg0) {
        field6747 = null;
        field6751 = null;
        field6748 = null;
        field6750 = null;
        if (arg0 < 9) {
            method2824(52, 0, 79, 87, (byte) 30, -50, 117, 119, 23, 57);
        }
        field6749 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V", line = 113)
    public final void method325(int arg0, int arg1, int arg2) {
        ++field6745;
        int var4 = this.field6739 * arg2 >> 12;
        if (arg0 != 0) {
            this.method325(-40, 41, -82);
        }
        int var5 = this.field6741 * arg2 >> 12;
        int var6 = this.field6744 * arg1 >> 12;
        int var7 = this.field6736 * arg1 >> 12;
        class165.method1089(super.field4883, var4, super.field4884, arg0 ^ -11473, var6, super.field4880, var5, var7);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)V", line = 132)
    public final void method330(int arg0, int arg1, int arg2) {
        ++field6742;
        int var4 = this.field6739 * arg1 >> 12;
        int var5 = this.field6741 * arg1 >> 12;
        if (arg2 != 0) {
            method2824(-89, 123, 97, -101, (byte) -47, 92, 101, 92, -43, -32);
        }
        int var6 = this.field6744 * arg0 >> 12;
        int var7 = this.field6736 * arg0 >> 12;
        class74.method523(var7, -2, var5, var4, super.field4880, var6, super.field4884);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V", line = 151)
    public static final void method2828(int arg0, int arg1) {
        class417.field6024.method2300(arg1, true);
        ++field6740;
        if (arg0 != -2145393524) {
            method2828(105, 15);
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIIII)V", line = 165)
    public class456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6736 = arg3;
        this.field6739 = arg0;
        this.field6741 = arg2;
        this.field6744 = arg1;
    }
}
