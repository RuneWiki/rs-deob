import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class691 {

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "[I")
    public static int[] field9756 = new int[1000];

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "Llk;")
    public static class545 field9760 = null;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "F")
    public static float field9759;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public int field9753;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field9758;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "Lvg;")
    public class49 field9755;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "Ldw;")
    public static class669 field9754;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "[I")
    public int[] field9757;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
    public static final void method3869(int arg0) {
        field9758++;
        class140.field2463.method143(((float) class527.field7429.field2647 * 0.1F + 0.7F) * 1.1523438F);
        class140.field2463.method95(class540.field7551, 0.69921875F, 1.2F, -200.0F, (float) arg0, -200.0F);
        class140.field2463.method152(class205.field3144, -1, 0);
        class140.field2463.method165(class614.field8933);
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
    public static void method3870(int arg0) {
        int var1 = -1 / ((arg0 - 60) / 43);
        field9754 = null;
        field9760 = null;
        field9756 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)I")
    public static int method3871(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
