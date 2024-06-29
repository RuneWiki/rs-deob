import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class692 extends class387 {

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    private int field9716 = 0;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "Lgb;")
    public static class163 field9717 = new class163();

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "[I")
    public static int[] field9719 = new int[2];

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "[Z")
    public static boolean[] field9720 = new boolean[100];

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "Lwa;")
    public static class661 field9718 = new class661(8);

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "F")
    public static float field9721;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
    public static void method3814(int arg0) {
        field9720 = null;
        field9717 = null;
        field9719 = null;
        field9718 = null;
        if (arg0 != -30391) {
            field9717 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZI)V")
    public final void method155(boolean arg0, int arg1) {
        ++field9715;
        if (arg1 != -3563) {
            field9720 = null;
        }
        int var3 = super.field5214.field400.method1426(class267.field3329, super.field5216.method312(), -1) + super.field5214.field402;
        int var4 = super.field5214.field401.method3625(super.field5216.method304(), class87.field873, 0) - -super.field5214.field392;
        super.field5216.method2999((float) (super.field5216.method312() / 2 + var3), (float) (super.field5216.method304() / 2 + var4), 4096, this.field9716);
        this.field9716 += ((class345) super.field5214).field4640;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Ltf;Lji;)V")
    public class692(class701 arg0, class345 arg1) {
        super(arg0, arg1);
    }
}
