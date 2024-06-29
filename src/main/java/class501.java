import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class501 {

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Z")
    public static boolean field6854 = false;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[Lpu;")
    public static class598[] field6855 = new class598[100];

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field6857 = 0;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Ljn;")
    public static class134 field6853;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2934(int arg0) {
        if (arg0 != 0) {
            method2934(-59);
        }
        field6856++;
        if (!class256.field3782) {
            class109.field1314 = true;
            class256.field3782 = true;
            class195.field2770 += (24.0F - class195.field2770) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 33)
    public static void method2935(int arg0) {
        field6855 = null;
        field6853 = null;
        if (arg0 != 100) {
            field6853 = null;
        }
    }
}
