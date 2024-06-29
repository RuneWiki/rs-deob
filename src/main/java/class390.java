import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class390 {

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
    public static int field5225 = -1;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5226 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "I")
    public static int field5229 = 0;

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "Lga;")
    public static class332 field5228;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)V")
    public static final void method2252(int arg0, int arg1) {
        if (arg0 != -1) {
            field5229 = 122;
        }
        field5227++;
        class474.field6605 = new int[arg1];
        class302.field3994 = new int[arg1];
        class62.field780 = new int[arg1];
        class323.field4355 = new int[arg1];
        class699.field9859 = new int[arg1];
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILi;)V")
    public static final void method2253(int arg0, class270 arg1) {
        class246.field3214[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V")
    public static void method2254(boolean arg0) {
        if (!arg0) {
            field5229 = 33;
        }
        field5228 = null;
        field5226 = null;
    }
}
