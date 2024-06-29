import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class489 extends class498 {

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public int field6835;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public int field6840;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "Lza;")
    public static class290 field6839;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "Lht;")
    public static class418 field6837;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Lfw;")
    public static class41 field6838;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method2820(boolean arg0) {
        field6841++;
        class38.method209(40, class4.field81.field1433, 2, 22050);
        class424.field5978 = new class75();
        class424.field5978.method571(128, 9, arg0);
        class85.field1065 = class86.method624(class268.field3914, 22050, 8950, class487.field6799, 0);
        class85.field1065.method1324(121, class424.field5978);
        class336.method2008(class424.field5978, (byte) 104, class524.field7713, class39.field420, class477.field6643);
        class518.field7619 = class86.method624(class268.field3914, 2048, 8950, class487.field6799, 1);
        class138.field1810 = new class398();
        class518.field7619.method1324(121, class138.field1810);
        class338.field4882 = new class367(22050, class289.field4225);
        class487.field6798 = class75.field927.method429("scape main", -1);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)V", line = 23)
    public static final void method2821(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6836++;
        if (arg2 != -2) {
            return;
        }
        if (arg6 >= class392.field5514 && class518.field7624 >= arg3 && arg1 >= class303.field4422 && class353.field5062 >= arg4) {
            if (arg5 == 1) {
                class289.method1785(arg4, arg0, (byte) 110, arg1, arg6, arg3);
            } else {
                class35.method201(arg5, arg2 ^ 0xFFFFFFFC, arg4, arg6, arg3, arg1, arg0);
            }
        } else if (arg5 == 1) {
            class428.method2532(arg0, arg2 + 102, arg1, arg6, arg3, arg4);
        } else {
            class168.method1054(71, arg3, arg6, arg0, arg4, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 63)
    public static void method2822(int arg0) {
        if (arg0 == -2) {
            field6839 = null;
            field6838 = null;
            field6837 = null;
        }
    }
}
