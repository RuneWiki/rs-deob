import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class187 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Lic;")
    public static class138 field3269 = class3.method53((byte) 76);

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field3272 = -1;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/awt/Component;ZII)Ldb;")
    public static final class17 method1275(Component arg0, boolean arg1, int arg2, int arg3) {
        field3270++;
        try {
            Class var4 = Class.forName("sf");
            class17 var5 = (class17) var4.getDeclaredConstructor().newInstance();
            var5.method155(arg0, arg2, (byte) 16, arg3);
            if (!arg1) {
                method1275((Component) null, true, -24, 27);
            }
            return var5;
        } catch (Throwable var7) {
            class241 var6 = new class241();
            var6.method155(arg0, arg2, (byte) 16, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static void method1276(int arg0) {
        field3269 = null;
        if (arg0 != 1815744214) {
            field3272 = -86;
        }
    }
}
