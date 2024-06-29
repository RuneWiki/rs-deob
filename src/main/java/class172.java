import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class172 extends class649 {

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "[I")
    public static int[] field2943 = new int[8];

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lla;")
    public static class422 field2951;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)I")
    public final int method1358(int arg0) {
        ++field2944;
        return arg0 != 3 ? 1 : super.field9223;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ[B)I")
    public static final int method1359(int arg0, boolean arg1, byte[] arg2) {
        if (arg1) {
            method1360(78, true, -77);
        }
        ++field2947;
        return class486.method2953(0, arg0, -1, arg2);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        ++field2950;
        int var2 = 94 % ((-18 - arg0) / 50);
        return 0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZI)V")
    public static final void method1360(int arg0, boolean arg1, int arg2) {
        ++field2945;
        class118 var3 = class86.method755(true, 12, arg0);
        if (!arg1) {
            var3.method933((byte) 52);
            var3.field1811 = arg2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        if (arg0 == 1) {
            if (super.field9223 < 0 || ~super.field9223 < -5) {
                super.field9223 = this.method135(arg0 ^ 71);
            }
            ++field2949;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        if (arg0 != 18648) {
            field2951 = null;
        }
        ++field2948;
        return 1;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lhs;)V")
    public class172(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        super.field9223 = arg0;
        ++field2946;
        if (arg1 > -120) {
            field2943 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(ILhs;)V")
    public class172(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Z")
    public static final boolean method1361(int arg0, int arg1, int arg2) {
        if (arg1 >= -64) {
            method1361(83, 110, -26);
        }
        ++field2942;
        return (65536 & arg0) != 0;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
    public static void method1362(int arg0) {
        field2951 = null;
        field2943 = null;
        if (arg0 != 28484) {
            field2951 = null;
        }
    }
}
