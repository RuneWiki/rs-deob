import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class226 extends class553 {

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public int field2633;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public int field2636;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field2635 = -1;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "[I")
    public static int[] field2637 = new int[6];

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lps;Lft;IIIIIIIIII)V")
    public class226(class105 arg0, class4 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field2633 = arg10;
        this.field2636 = arg11;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Lwj;")
    public static final class415 method1385(int arg0, int arg1, int arg2) {
        field2639++;
        class415 var3 = new class415();
        var3.field5425 = arg0 + 5 + 1;
        var3.field5435 = -1;
        var3.field5415 = -1;
        var3.field5424 = arg1 + 6;
        if (arg2 > -22) {
            method1387(true);
        }
        var3.field5428 = new int[var3.field5425][var3.field5424];
        var3.method2487(19666);
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1386(int arg0, int arg1, boolean arg2) {
        field2634++;
        if (!arg2) {
            method1386(-11, -26, false);
        }
        return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public static void method1387(boolean arg0) {
        if (arg0) {
            field2637 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)Llf;")
    public final class251 method94(int arg0) {
        field2640++;
        if (arg0 != 1024) {
            this.field2633 = -100;
        }
        return class308.field3823;
    }
}
