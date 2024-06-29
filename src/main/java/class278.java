import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class class278 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "F")
    public static float field4008 = 0.0F;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Lko;")
    public static class348 field4007 = new class348();

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "[I")
    public static int[] field4009;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)Lth;")
    public abstract class420 method1766(int arg0);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)Z")
    public abstract boolean method1767(int arg0, byte arg1);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
    public static void method1768(boolean arg0) {
        field4009 = null;
        if (!arg0) {
            field4007 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public abstract void method1769(byte arg0);

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public abstract void method1770(int arg0);
}
