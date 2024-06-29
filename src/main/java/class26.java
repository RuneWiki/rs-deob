import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class class26 {

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
    public static int[] field389 = new int[13];

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "[I")
    public static int[] field390 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Ljw;")
    public static class581 field386 = new class581(81, 8);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public static void method199(boolean arg0) {
        field386 = null;
        field389 = null;
        if (!arg0) {
            field390 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static final void method200(int arg0) {
        if (arg0 != 8) {
            field390 = null;
        }
        field387++;
        class778.method4305(-1);
        class130.field1934 = false;
    }
}
