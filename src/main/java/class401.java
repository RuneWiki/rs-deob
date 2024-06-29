import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class401 {

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field5906 = -60;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "Lrca;")
    public static class418 field5904 = new class418("LIVE", 0);

    @OriginalMember(owner = "client!io", name = "d", descriptor = "[I")
    public static int[] field5907 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!io", name = "b", descriptor = "Lft;")
    public static class4 field5905;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static void method2450(int arg0) {
        if (arg0 != 13503) {
            method2450(-97);
        }
        field5905 = null;
        field5907 = null;
        field5904 = null;
    }
}
