import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class33 extends class219 {

    @OriginalMember(owner = "client!mca", name = "v", descriptor = "Lcga;")
    public class505 field441;

    @OriginalMember(owner = "client!mca", name = "u", descriptor = "I")
    public static int field440 = 0;

    @OriginalMember(owner = "client!mca", name = "w", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!mca", name = "t", descriptor = "Lkf;")
    public static class263 field439;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(Z)V")
    public static void method230(boolean arg0) {
        if (arg0) {
            method230(true);
        }
        field439 = null;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)Z")
    public static final boolean method231(byte arg0) {
        field442++;
        class548 var1 = (class548) class600.field8464.method2508((byte) 126);
        if (var1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < var1.field7730; var2++) {
            if (var1.field7728[var2] != null && var1.field7728[var2].field5314 == 0) {
                return false;
            }
            if (var1.field7733[var2] != null && var1.field7733[var2].field5314 == 0) {
                return false;
            }
        }
        int var3 = 125 % ((-arg0 - 44) / 33);
        return true;
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lcga;)V")
    public class33(class505 arg0) {
        this.field441 = arg0;
    }
}
