import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public abstract class class16 extends class623 {

    @OriginalMember(owner = "client!tia", name = "v", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "client!tia", name = "u", descriptor = "[Luda;")
    public static class53[] field225 = new class53[2048];

    @OriginalMember(owner = "client!tia", name = "s", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!tia", name = "t", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "(I)V", line = 5)
    public static void method200(int arg0) {
        if (arg0 != 9458) {
            field225 = null;
        }
        field225 = null;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lha;I)V", line = 17)
    public static final void method201(class454 arg0, int arg1) {
        field223++;
        if (class118.field1431.method3122(667) == 0) {
            return;
        }
        if (arg1 < 5) {
            field225 = null;
        }
        if (class223.field2944.field633.method4191((byte) -120) == 0) {
            for (class189 var2 = (class189) class118.field1431.method3111(98); var2 != null; var2 = (class189) class118.field1431.method3116(-53)) {
                class190.field2488.method3954(var2.field2474, var2.field2483, var2.field2477 ? class339.field4374.field7665 : null, class524.field7408, var2.field2481, -1, var2.field2484, var2.field2479, false, arg0, arg0, false);
                var2.method3426((byte) -42);
            }
            class728.method4033(-35);
            return;
        }
        if (class754.field10517 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class754.field10517 = class522.method3004(class524.field7407, (byte) 118, class447.field6293, 0, var3, 0);
            class664.field9088 = class754.field10517.method156(class84.method595(-24181, class14.field199, class378.field5293, 0), class196.method1225(class645.field8897, class14.field199, 0), true);
        }
        for (class189 var4 = (class189) class118.field1431.method3111(66); var4 != null; var4 = (class189) class118.field1431.method3116(-41)) {
            class190.field2488.method3954(var4.field2474, var4.field2483, var4.field2477 ? class339.field4374.field7665 : null, class664.field9088, var4.field2481, -1, var4.field2484, var4.field2479, false, class754.field10517, arg0, false);
            var4.method3426((byte) -57);
        }
    }

    @OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(I)V", line = 76)
    public class16(int arg0) {
        this.field226 = arg0;
    }

    @OriginalMember(owner = "client!tia", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method202(int arg0);

    @OriginalMember(owner = "client!tia", name = "e", descriptor = "(I)Z")
    public abstract boolean method203(int arg0);
}
