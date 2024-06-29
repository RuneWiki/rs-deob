import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public abstract class class256 {

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "Lvj;")
    public static class304 field3378 = new class304("M", "M", "M", "M");

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "[F")
    public static float[] field3380 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "[I")
    public static int[] field3379;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
    public abstract void method309(byte arg0);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public static void method1542(int arg0) {
        field3380 = null;
        if (arg0 == 0) {
            field3378 = null;
            field3379 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IB)Z")
    public abstract boolean method305(int arg0, byte arg1);

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)Ldb;")
    public abstract class210 method311(byte arg0);

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
    public abstract void method307(int arg0);
}
