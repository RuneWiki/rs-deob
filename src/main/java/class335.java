import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class335 {

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    private int field4754;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public int field4770;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public int field4765;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "B")
    public byte field4766;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public int field4753;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field4759 = 999999;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public static int field4772 = 0;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "[I")
    public static int[] field4773 = new int[2];

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public int field4750;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public int field4751;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public int field4752;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public int field4755;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public int field4758;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public int field4761;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public int field4762;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public int field4764;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public int field4771;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Lpi;")
    public class335 field4756;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)Lpi;")
    public final class335 method2055(int arg0, int arg1, int arg2, int arg3) {
        field4763++;
        return arg3 == 999999 ? new class335(this.field4754, arg2, arg1, arg0, this.field4766) : null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method2056(int arg0) {
        field4773 = null;
        int var1 = -77 % ((arg0 - 48) / 61);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)Z")
    public static final boolean method2057(int arg0, int arg1, int arg2) {
        field4767++;
        if (arg0 != 0) {
            method2059(-119, 84, null, -77, null);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIB)V")
    public class335(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4754 = arg0;
        this.field4770 = arg2;
        this.field4765 = arg1;
        this.field4766 = arg4;
        this.field4753 = arg3;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)Lqw;")
    public final class623 method2058(int arg0) {
        if (arg0 > -85) {
            method2059(23, -29, null, 91, null);
        }
        field4757++;
        return class25.method221(-60, this.field4754);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILow;ILha;)V")
    public static final void method2059(int arg0, int arg1, class665 arg2, int arg3, class475 arg4) {
        class148.field2381.method3735(-4676);
        field4769++;
        if (class495.field6801) {
            return;
        }
        if (arg0 != 0) {
            method2057(117, 27, -49);
        }
        for (class770 var5 = (class770) arg2.method3731((byte) -125); var5 != null; var5 = (class770) arg2.method3729((byte) -113)) {
            class548 var6 = class751.field10415.method4105(var5.field10634, -115);
            if (class329.method2001(var6, -105)) {
                boolean var7 = class144.method1152(arg4, var6, (byte) -112, var5, arg1, arg3);
                if (var7) {
                    class780.method4285(var5, arg4, var6, 126);
                }
            }
        }
    }
}
