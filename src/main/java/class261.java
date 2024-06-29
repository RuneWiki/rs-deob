import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class261 {

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "[I")
    public static int[] field3545 = new int[3];

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
    public static int field3546 = 0;

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "Llh;")
    public static class487 field3548 = new class487(59, 4);

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "Lqv;")
    public static class410 field3549;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "Ljava/awt/Image;")
    public static Image field3550;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lmw;I)V", line = 4)
    public static final void method1597(class455 arg0, int arg1) {
        field3547++;
        int var2 = 0;
        int var3 = 17 / ((-arg1 - 29) / 50);
        while (class356.field4729 > var2) {
            int var4 = class494.field6740[var2];
            class677 var5 = class671.field9407[var4];
            int var6 = arg0.method2874((byte) -75);
            if ((var6 & 0x20) != 0) {
                var6 += arg0.method2874((byte) -75) << 8;
            }
            if ((var6 & 0x1000) != 0) {
                var6 += arg0.method2874((byte) -75) << 16;
            }
            class40.method359(arg0, var5, var6, (byte) -52, var4);
            var2++;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V", line = 45)
    public static void method1598(int arg0) {
        field3545 = null;
        if (arg0 != -21174) {
            field3545 = null;
        }
        field3549 = null;
        field3548 = null;
        field3550 = null;
    }
}
