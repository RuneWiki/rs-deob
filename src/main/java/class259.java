import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class259 extends class96 {

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "Ldea;")
    public static class205 field3603 = new class205(512);

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    public static int field3607 = 0;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "[I")
    public static int[] field3606 = new int[8];

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "[I")
    public static int[] field3608 = new int[6];

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(Z)V")
    public static void method1662(boolean arg0) {
        field3608 = null;
        field3606 = null;
        field3603 = null;
        if (!arg0) {
            method1662(true);
        }
    }
}
