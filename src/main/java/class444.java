import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class444 {

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "Leca;")
    public static class704 field6468 = new class704();

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
    public static int field6469 = -1;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
    public int field6465;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "I")
    public int field6467;

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "I")
    public int field6470;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
    public static void method2632(int arg0) {
        field6468 = null;
        if (arg0 <= 44) {
            field6469 = -94;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lmo;B)V")
    public final void method2633(class695 arg0, byte arg1) {
        field6464++;
        while (true) {
            int var3 = arg0.method3826(false);
            if (var3 == 0) {
                if (arg1 == -93) {
                    return;
                } else {
                    method2632(-2);
                    return;
                }
            }
            this.method2634(arg0, false, var3);
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lmo;ZI)V")
    private final void method2634(class695 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field6467 = arg0.method3847((byte) 118);
            this.field6465 = arg0.method3826(false);
            this.field6470 = arg0.method3826(arg1);
        }
        if (!arg1) {
            field6466++;
        }
    }
}
