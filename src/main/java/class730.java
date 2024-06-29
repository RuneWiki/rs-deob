import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class730 extends class264 {

    @OriginalMember(owner = "client!waa", name = "l", descriptor = "[I")
    public static int[] field10201 = new int[2];

    @OriginalMember(owner = "client!waa", name = "o", descriptor = "Lada;")
    public static class171 field10204 = new class171();

    @OriginalMember(owner = "client!waa", name = "s", descriptor = "F")
    public static float field10208;

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "I")
    public static int field10200;

    @OriginalMember(owner = "client!waa", name = "m", descriptor = "I")
    public static int field10202;

    @OriginalMember(owner = "client!waa", name = "n", descriptor = "I")
    public static int field10203;

    @OriginalMember(owner = "client!waa", name = "p", descriptor = "I")
    public static int field10205;

    @OriginalMember(owner = "client!waa", name = "q", descriptor = "I")
    public static int field10206;

    @OriginalMember(owner = "client!waa", name = "r", descriptor = "I")
    public static int field10207;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(B)V")
    public static void method4093(byte arg0) {
        field10201 = null;
        field10204 = null;
        if (arg0 != 90) {
            field10201 = null;
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lmfa;)V")
    public class730(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        if (arg0 != 112) {
            field10201 = null;
        }
        ++field10200;
        return 1;
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(B)I")
    public final int method4094(byte arg0) {
        ++field10203;
        return arg0 > -31 ? -49 : super.field3733;
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        ++field10206;
        if (super.field3731.method3639(true) == class23.field344) {
            super.field3733 = 2;
        }
        int var2 = -36 / ((1 - arg0) / 41);
        if (~super.field3733 > -1 || ~super.field3733 < -3) {
            super.field3733 = this.method663((byte) -38);
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        ++field10205;
        super.field3733 = arg1;
        if (arg0 > -114) {
            this.method666((byte) -24, -27);
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        if (arg0 != -38) {
            this.method659((byte) 81, 60);
        }
        ++field10202;
        return 1;
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(ILmfa;)V")
    public class730(int arg0, class640 arg1) {
        super(arg0, arg1);
    }
}
