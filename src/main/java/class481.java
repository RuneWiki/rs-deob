import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public abstract class class481 extends class89 {

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public int field7029;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "Lhf;")
    public class272 field7026;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Lya;")
    public static class38 field7025;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method2932(int arg0) {
        field7025 = null;
        if (arg0 != -24296) {
            method2934(true, null, null);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lba;III[Z)V")
    public static final void method2933(class264 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class520.field7520 == class140.field1808) {
            return;
        }
        int var5 = class531.field7811[arg1].method396(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class143 var7 = class531.field7811[var6];
                if (var7 != null) {
                    var7.method387(arg0, arg2, var5 - var7.method396(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method909(int arg0);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)Z")
    public abstract boolean method910(byte arg0);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLga;Lqn;)V")
    public static final void method2934(boolean arg0, class278 arg1, class47 arg2) {
        class227.field2915 = arg1;
        class340.field4267 = arg2;
        field7027++;
        if (!arg0) {
            field7025 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lhf;I)V")
    public class481(class272 arg0, int arg1) {
        this.field7029 = arg1;
        this.field7026 = arg0;
    }
}
