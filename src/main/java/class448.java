import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public abstract class class448 extends class272 {

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "Lwt;")
    public class186 field6193;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "I")
    public int field6197;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "I")
    public static int field6194 = -1;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lkr;IILnp;Z)V")
    public static final void method2613(class486 arg0, int arg1, int arg2, class313 arg3, boolean arg4) {
        class65.field839.method2838((byte) 107);
        field6195++;
        if (class264.field3850) {
            return;
        }
        if (arg4) {
            field6194 = 26;
        }
        for (class80 var5 = (class80) arg0.method2843(1123227612); var5 != null; var5 = (class80) arg0.method2842(1673506446)) {
            class19 var6 = class395.field5604.method490(36, var5.field980);
            if (class120.method741(31, var6)) {
                boolean var7 = class359.method2227(var5, arg2, true, arg3, var6, arg1);
                if (var7) {
                    class275.method1682(var5, 75, arg3, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method863(boolean arg0);

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)V")
    public static final void method2614(int arg0, int arg1, int arg2) {
        boolean var3 = class330.field4786[0][arg1][arg2] != null && class330.field4786[0][arg1][arg2].field1088 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class330.field4786[var4][arg1][arg2] == null) {
                class88 var5 = class330.field4786[var4][arg1][arg2] = new class88(var4, arg1, arg2);
                if (var3) {
                    var5.field1080++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBI)I")
    public static final int method2615(int arg0, byte arg1, int arg2) {
        field6196++;
        if (arg1 != -77) {
            field6194 = -34;
        }
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(B)Z")
    public abstract boolean method862(byte arg0);

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lwt;I)V")
    public class448(class186 arg0, int arg1) {
        this.field6193 = arg0;
        this.field6197 = arg1;
    }
}
