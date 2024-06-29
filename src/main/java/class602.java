import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class602 {

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lgh;")
    public static class54 field7654 = new class54(13, 0, 1, 0);

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field7655 = -1;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Z")
    public static boolean field7657 = false;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 10)
    public static void method3249(int arg0) {
        if (arg0 == 0) {
            field7654 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILuaa;)V", line = 24)
    public static final void method3250(int arg0, class391 arg1) {
        field7653++;
        if (arg0 != -28156) {
            return;
        }
        class391 var2 = class679.method3655(arg1, 0);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class372.field4550;
            var3 = class463.field6021;
        } else {
            var3 = var2.field5031;
            var4 = var2.field5117;
        }
        class310.method1828(var3, var4, false, 512, arg1);
        class102.method596(arg1, -5, var4, var3);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lhfa;B)Lhfa;")
    public abstract class728 method1608(class728 arg0, byte arg1);
}
