import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class709 extends class331 {

    @OriginalMember(owner = "client!gfa", name = "m", descriptor = "[Z")
    public static boolean[] field9971 = new boolean[100];

    @OriginalMember(owner = "client!gfa", name = "q", descriptor = "I")
    public static int field9975 = 0;

    @OriginalMember(owner = "client!gfa", name = "n", descriptor = "I")
    public static int field9972;

    @OriginalMember(owner = "client!gfa", name = "o", descriptor = "I")
    public static int field9973;

    @OriginalMember(owner = "client!gfa", name = "p", descriptor = "I")
    public static int field9974;

    @OriginalMember(owner = "client!gfa", name = "r", descriptor = "I")
    public static int field9976;

    @OriginalMember(owner = "client!gfa", name = "s", descriptor = "I")
    public static int field9977;

    @OriginalMember(owner = "client!gfa", name = "t", descriptor = "I")
    public static int field9978;

    @OriginalMember(owner = "client!gfa", name = "u", descriptor = "I")
    public static int field9979;

    @OriginalMember(owner = "client!gfa", name = "v", descriptor = "I")
    public static int field9980;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(Z)V")
    public static void method3916(boolean arg0) {
        if (!arg0) {
            field9971 = null;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(B)I")
    public final int method226(byte arg0) {
        ++field9976;
        if (arg0 != 13) {
            this.method226((byte) 39);
        }
        return super.field4203.method343((byte) 125).method359((byte) 79) > 1 ? 4 : 2;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method3917(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9972;
        long var6 = (long) (arg3 | (arg5 ? Integer.MIN_VALUE : 0));
        class464 var8 = (class464) class3.field26.method3248(var6, 0);
        if (var8 == null) {
            var8 = new class464();
            class3.field26.method3249(var6, var8, (byte) -79);
        }
        if (~arg4 <= ~var8.field6715.length) {
            int[] var9 = new int[arg4 + 1];
            int[] var10 = new int[arg4 - -1];
            for (int var11 = 0; ~var8.field6715.length < ~var11; ++var11) {
                var9[var11] = var8.field6715[var11];
                var10[var11] = var8.field6712[var11];
            }
            for (int var12 = var8.field6715.length; var12 < arg4; ++var12) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field6715 = var9;
            var8.field6712 = var10;
        }
        int var13 = 18 % ((arg2 - -68) / 42);
        var8.field6715[arg4] = arg0;
        var8.field6712[arg4] = arg1;
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(II)V")
    public final void method227(int arg0, int arg1) {
        ++field9978;
        if (arg0 < 113) {
            field9975 = -41;
        }
        super.field4202 = arg1;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IZI)Z")
    public static final boolean method3918(int arg0, boolean arg1, int arg2) {
        ++field9979;
        if (arg1) {
            method3918(-13, true, 47);
        }
        return (1024 & arg0) != 0;
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(B)I")
    public final int method3919(byte arg0) {
        ++field9977;
        return arg0 > -119 ? -50 : super.field4202;
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(ILts;)V")
    public class709(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lts;)V")
    public class709(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        ++field9974;
        return arg1 != 1 ? 122 : 1;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        if (super.field4202 < 0 && ~super.field4202 < -5) {
            super.field4202 = this.method226((byte) 13);
        }
        ++field9980;
        if (arg0 != -1959) {
            method3916(false);
        }
    }
}
