import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class47 {

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "Lhga;")
    public static class158 field635 = new class158(81, 2);

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public static int field638 = -60;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "Lhga;")
    public static class158 field637 = new class158(79, 1);

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V")
    public static void method550(int arg0) {
        field637 = null;
        field635 = null;
        if (arg0 != 2) {
            method550(-17);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lbc;")
    public static final class335 method551(Canvas arg0, byte arg1) {
        field636++;
        try {
            Class var2 = Class.forName("ae");
            if (arg1 == -30) {
                class335 var3 = (class335) var2.getDeclaredConstructor().newInstance();
                var3.method1192(arg0, 35);
                return var3;
            } else {
                return null;
            }
        } catch (Throwable var5) {
            class140 var4 = new class140();
            var4.method1192(arg0, 35);
            return var4;
        }
    }
}
