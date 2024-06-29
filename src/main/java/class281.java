import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class281 {

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
    public int field3992 = 2048;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "I")
    public int field3993 = 0;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
    public int field3994 = 0;

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
    public int field3996 = 2048;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "Ltga;")
    public static class54 field3991 = new class54("LOCAL", 4);

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "[I")
    public static int[] field3995;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Leh;II)V")
    private final void method1747(class335 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3993 = arg0.method2034(255);
        } else if (arg1 == 2) {
            this.field3996 = arg0.method2001((byte) -83);
        } else if (arg1 == 3) {
            this.field3992 = arg0.method2001((byte) -83);
        } else if (arg1 == 4) {
            this.field3994 = arg0.method2022(arg2 ^ 0xFFFF8E5B);
        }
        field3990++;
        if (arg2 != 4) {
            method1749(28);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(III)Z")
    public static final boolean method1748(int arg0, int arg1, int arg2) {
        field3989++;
        if (arg0 != 11983) {
            field3995 = null;
        }
        return (arg2 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
    public static void method1749(int arg0) {
        field3995 = null;
        field3991 = null;
        if (arg0 > -16) {
            field3995 = null;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Leh;I)V")
    public final void method1750(class335 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2034(arg1 ^ 0xFF);
            if (var3 == 0) {
                if (arg1 != 0) {
                    return;
                }
                field3988++;
                return;
            }
            this.method1747(arg0, var3, 4);
        }
    }
}
