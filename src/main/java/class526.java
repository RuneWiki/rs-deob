import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class526 {

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "Lad;")
    private class669 field7717;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public int field7714;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field7715 = -60;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method3098(boolean arg0) {
        class246.field3574.method936(-121);
        field7716++;
        if (!arg0) {
            field7715 = -47;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)V", line = 22)
    public static final void method3099(int arg0, int arg1, int arg2) {
        boolean var3 = class541.field7946[0][arg1][arg2] != null && class541.field7946[0][arg1][arg2].field4098 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class541.field7946[var4][arg1][arg2] == null) {
                class293 var5 = class541.field7946[var4][arg1][arg2] = new class293(var4);
                if (var3) {
                    var5.field4101++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "finalize", descriptor = "()V", line = 42)
    protected final void finalize() throws Throwable {
        field7718++;
        this.field7717.method3777(0, this.field7714);
        super.finalize();
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lad;II)V", line = 54)
    public class526(class669 arg0, int arg1, int arg2) {
        this.field7717 = arg0;
        this.field7714 = arg2;
    }
}
