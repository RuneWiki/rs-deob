import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class396 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Lvh;")
    public static class125 field5727 = new class125(8, 0);

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "Leda;")
    public static class116 field5737 = new class116(83, -2);

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "Lau;")
    public static class692 field5740 = new class692();

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public int field5733;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    private int field5734;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public int field5736;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Lvba;")
    public class376 field5730;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "Z")
    public static boolean field5741;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "[I")
    public static int[] field5728;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)V", line = 3)
    public static final void method2404(int arg0, int arg1, int arg2) {
        field5732++;
        if (class564.field8256 == 1) {
            class583.method3372(false, arg2, arg1, class225.field3367);
        } else if (class564.field8256 == 2) {
            class391.method2380(arg2, (byte) -96, arg1);
        }
        if (arg0 != -15896) {
            method2408(-16);
        }
        class564.field8256 = 0;
        class225.field3367 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILek;)V", line = 23)
    private final void method2405(int arg0, int arg1, class465 arg2) {
        if (arg0 == arg1) {
            this.field5734 = arg2.method2755((byte) -110);
        } else if (arg1 == 2) {
            this.field5736 = arg2.method2705(-85);
            this.field5733 = arg2.method2705(-99);
        }
        field5729++;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lek;B)V", line = 47)
    public final void method2406(class465 arg0, byte arg1) {
        field5738++;
        while (true) {
            int var3 = arg0.method2705(-22);
            if (var3 == 0) {
                if (arg1 > -18) {
                    this.field5734 = -12;
                    return;
                } else {
                    return;
                }
            }
            this.method2405(1, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Lfda;", line = 78)
    public final synchronized class628 method2407(int arg0) {
        field5735++;
        class628 var2 = (class628) this.field5730.field5215.method941((long) this.field5734, arg0 ^ arg0);
        if (var2 != null) {
            return var2;
        }
        class628 var3 = class628.method3550(this.field5730.field5210, this.field5734, 0);
        if (var3 != null) {
            this.field5730.field5215.method949((long) this.field5734, true, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 108)
    public static void method2408(int arg0) {
        field5727 = null;
        field5740 = null;
        field5737 = null;
        field5728 = null;
        if (arg0 != -1) {
            field5741 = true;
        }
    }
}
