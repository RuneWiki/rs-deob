import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class685 extends class404 {

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
    private int field9620;

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "I")
    private int field9621;

    @OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
    private int field9615;

    @OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
    private int field9623;

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "I")
    public static int field9618 = 0;

    @OriginalMember(owner = "client!uba", name = "s", descriptor = "[I")
    public static int[] field9624 = new int[1];

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "Lwp;")
    public static class453 field9619 = new class453(104, -1);

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "I")
    public static int field9616;

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "I")
    public static int field9617;

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!uba", name = "t", descriptor = "I")
    public static int field9625;

    @OriginalMember(owner = "client!uba", name = "u", descriptor = "I")
    public static int field9626;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
    public static void method3853(int arg0) {
        field9619 = null;
        if (arg0 != -17444) {
            method3853(122);
        }
        field9624 = null;
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IIIIII)V")
    public class685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field9620 = arg3;
        this.field9621 = arg0;
        this.field9615 = arg2;
        this.field9623 = arg1;
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(III)V")
    public final void method1912(int arg0, int arg1, int arg2) {
        ++field9625;
        int var4 = this.field9621 * arg1 >> 12;
        int var5 = this.field9615 * arg1 >> 12;
        int var6 = this.field9623 * arg0 >> 12;
        int var7 = this.field9620 * arg0 >> 12;
        if (arg2 != 4) {
            field9619 = null;
        }
        class647.method3622(var7, var6, super.field5064, 9761, var5, var4);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IBI)V")
    public final void method1911(int arg0, byte arg1, int arg2) {
        if (arg1 == -34) {
            ++field9626;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IILjava/lang/String;)Lqc;")
    public static final class353 method3854(int arg0, int arg1, String arg2) {
        ++field9616;
        class353 var3;
        try {
            var3 = (class353) Class.forName("ij").newInstance();
        } catch (Throwable var4) {
            var3 = new class342();
        }
        var3.field4502 = arg0;
        if (arg1 <= 26) {
            method3854(29, -82, (String) null);
        }
        var3.field4500 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)V")
    public final void method1910(int arg0, int arg1, int arg2) {
        ++field9622;
        if (arg1 != -21716) {
            this.field9620 = -107;
        }
    }
}
