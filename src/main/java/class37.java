import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class37 extends class539 {

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Z")
    public static boolean field501 = false;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lq;")
    public static class391 field500;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(FI)F")
    public static final float method173(float arg0, int arg1) {
        field499++;
        return arg1 == 10 ? arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) : -0.80190885F;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method174(int arg0) {
        if (arg0 != 10) {
            field500 = null;
        }
        field500 = null;
    }
}
