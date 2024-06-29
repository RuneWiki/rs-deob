import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class252 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field3535 = 0;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "[Lvb;")
    public static class178[] field3537 = new class178[1024];

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public static final void method1554(int arg0) {
        field3538++;
        if (arg0 != -32219) {
            method1554(104);
        }
        class587.field8203.method2060(0);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
    public static final void method1555(int arg0) {
        field3536++;
        if (arg0 != 1) {
            method1556(false);
        }
        class113 var1 = (class113) class441.field6211.method1270((byte) -25);
        boolean var2 = class612.field8489 != null || class556.field7519 > 0;
        if (var2) {
            class569.field7653 = 1;
        }
        if (class46.field689 && class531.field7246.method666(50, 81) && class315.field4697 > 2) {
            if (var2) {
                class466.field6559 = (class345) class487.field6761.field2826.field7306.field7306;
            } else {
                class21.method107(var1.method840(117), false, var1.method847(-1), (class345) class487.field6761.field2826.field7306.field7306);
            }
        } else if (var2) {
            class466.field6559 = (class345) class487.field6761.field2826.field7306;
        } else {
            class21.method107(var1.method840(109), false, var1.method847(-1), (class345) class487.field6761.field2826.field7306);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V")
    public static void method1556(boolean arg0) {
        if (!arg0) {
            field3537 = null;
        }
        field3537 = null;
    }
}
