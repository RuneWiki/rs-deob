import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class66 {

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
    public static int field809 = 1;

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "[Ltt;")
    public static class78[] field808 = new class78[14];

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "[Z")
    public static boolean[] field807 = new boolean[8];

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "F")
    public static float field810;

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
    public static void method417(int arg0) {
        field808 = null;
        field807 = null;
        if (arg0 < 50) {
            field807 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)[Ltda;")
    public static final class546[] method418(int arg0) {
        field811++;
        return arg0 == 8 ? new class546[] { class143.field2007, class454.field6420, class537.field7986, class536.field7969, class374.field5182, class86.field1223, class272.field3844, class332.field4596, class146.field2112, class504.field7139, class52.field607, class393.field5404, class56.field664, class491.field6997 } : null;
    }
}
