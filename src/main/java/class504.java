import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class504 extends class37 {

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
    private int field7619;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    private int field7611;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    private int field7609;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    private int field7610;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "Loe;")
    public static class127 field7616 = new class127(40, 16);

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "Loq;")
    public static class231 field7621 = new class231("", 10);

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "Lbg;")
    public static class310 field7622 = new class310(11, 8);

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "Z")
    public static boolean field7624 = false;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "Lqi;")
    public static class382 field7623 = new class382("WTQA", 2);

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "F")
    public static float field7608;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "Llt;")
    public static class458 field7613;

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IIIIIII)V")
    public class504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field7619 = arg3;
        this.field7611 = arg2;
        this.field7609 = arg1;
        this.field7610 = arg0;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIB)V")
    public final void method30(int arg0, int arg1, byte arg2) {
        ++field7612;
        int var4 = this.field7610 * arg0 >> 12;
        int var5 = -38 / ((arg2 - 36) / 36);
        int var6 = this.field7611 * arg0 >> 12;
        int var7 = this.field7609 * arg1 >> 12;
        int var8 = this.field7619 * arg1 >> 12;
        class352.method2148(super.field497, var6, var7, 14134, var4, var8);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIII)V")
    public static final void method3016(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 <= 74) {
            field7613 = null;
        }
        ++field7617;
        for (int var6 = arg1; ~arg2 <= ~var6; ++var6) {
            class78.method566(class69.field1212[var6], arg3, arg0, -7, arg4);
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
    public static final void method3017(int arg0) {
        if (arg0 == 0) {
            if (client.field2992 != 10 && client.field2992 != 28) {
                int var1 = class286.field4329.field2232[0] >> 3;
                int var2 = class286.field4329.field2239[0] >> 3;
                if (var1 >= 0 && var1 < class150.field2422 >> 3 && ~var2 <= -1 && ~(class21.field272 >> 3) < ~var2) {
                    class105.method771(5000, var2, 16711935, var1);
                } else {
                    class105.method771(0, class21.field272 >> 4, arg0 + 16711935, class150.field2422 >> 4);
                }
            } else {
                class105.method771(5000, class290.field4403 >> 10, arg0 + 16711935, class243.field3655 >> 10);
            }
            ++field7614;
            class450.method2686(914352296);
            class307.method1845(arg0 ^ 4765);
            class419.method2457(false);
            class432.method2531((byte) -56);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
    public final void method36(int arg0, int arg1, int arg2) {
        ++field7618;
        if (arg0 != 1) {
            field7622 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(III)V")
    public final void method32(int arg0, int arg1, int arg2) {
        ++field7620;
        int var4 = this.field7610 * arg2 >> 12;
        if (arg1 == 10) {
            int var5 = this.field7611 * arg2 >> 12;
            int var6 = this.field7609 * arg0 >> 12;
            int var7 = this.field7619 * arg0 >> 12;
            class397.method2358(var4, var7, 1105117192, super.field497, super.field501, var6, super.field500, var5);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
    public static void method3018(byte arg0) {
        field7622 = null;
        field7613 = null;
        field7621 = null;
        field7623 = null;
        field7616 = null;
        if (arg0 < 112) {
            method3017(-56);
        }
    }
}
