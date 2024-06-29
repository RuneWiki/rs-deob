import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class493 {

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Z")
    private static boolean field7007 = false;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    private static int field7006 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Ldc;")
    private static class302 field7005 = new class302();

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLp;)V", line = 3)
    public static final synchronized void method2818(boolean arg0, class52 arg1) {
        if (field7007) {
            return;
        }
        if (arg0) {
            method2819(-40, true);
        }
        if (field7006 <= 0) {
            arg1.method306(false);
        } else {
            class316 var2 = new class316();
            var2.field4614 = arg1;
            field7005.method1909(var2, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V", line = 28)
    public static final synchronized void method2819(int arg0, boolean arg1) {
        field7007 = arg1;
        int var2 = 19 / ((37 - arg0) / 32);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V", line = 39)
    public static final synchronized void method2820(boolean arg0) {
        while (true) {
            class316 var1 = (class316) field7005.method1902(121);
            if (var1 == null) {
                if (arg0) {
                    field7007 = false;
                    return;
                }
                return;
            }
            var1.field4614.method306(true);
            var1.method2360((byte) 66);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 60)
    public static final synchronized void method2821(int arg0) {
        field7006--;
        if (arg0 <= 117) {
            method2822(-52);
        }
        if (field7006 == 0) {
            method2820(false);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 77)
    public static final synchronized void method2822(int arg0) {
        field7006++;
        int var1 = -108 / ((arg0 + 6) / 33);
    }
}
