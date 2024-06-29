import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class234 {

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
    public int field3398 = 1;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "C")
    public char field3397;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "Lgga;")
    public static class513 field3395;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "Lpj;")
    public static class764 field3399;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
    public static void method1590(int arg0) {
        if (arg0 != 0) {
            method1590(79);
        }
        field3395 = null;
        field3399 = null;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lol;I)V")
    public final void method1591(class431 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2557(arg1 ^ 0x3A50);
            if (var3 == 0) {
                if (arg1 != 1) {
                    return;
                }
                field3400++;
                return;
            }
            this.method1592(arg0, var3, -17293);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lol;II)V")
    private final void method1592(class431 arg0, int arg1, int arg2) {
        if (arg2 != -17293) {
            this.field3398 = 114;
        }
        if (arg1 == 1) {
            this.field3397 = class478.method2834((byte) -57, arg0.method2529(92));
        } else if (arg1 == 2) {
            this.field3398 = 0;
        }
        field3396++;
    }
}
