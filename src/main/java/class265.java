import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class265 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Loa;")
    public static class99 field4684 = class221.method1463(2844, "::fps ");

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Loa;")
    private static class99 field4688 = class221.method1463(2844, " more options");

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Loa;")
    public static class99 field4690 = field4688;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Loa;")
    public static class99 field4685 = class221.method1463(2844, "1");

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field4691 = 0;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "[Lde;")
    public static class109[] field4692;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class57 var7 = new class57();
        var7.field944 = arg1 / 128;
        var7.field953 = arg2 / 128;
        var7.field942 = arg3 / 128;
        var7.field938 = arg4 / 128;
        var7.field936 = arg0;
        var7.field933 = arg1;
        var7.field945 = arg2;
        var7.field946 = arg3;
        var7.field949 = arg4;
        var7.field950 = arg5;
        var7.field951 = arg6;
        class94.field1592[class60.field1003++] = var7;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ltg;B)V")
    public static final void method1765(class182 arg0, byte arg1) {
        field4687++;
        class138.field2427 = arg0;
        class55.field900 = class138.field2427.method1233(16, false);
        int var2 = -73 % ((arg1 + 65) / 57);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1766(Component arg0, byte arg1) {
        arg0.removeMouseListener(class205.field3552);
        field4686++;
        if (arg1 != -46) {
            field4688 = null;
        }
        arg0.removeMouseMotionListener(class205.field3552);
        arg0.removeFocusListener(class205.field3552);
        class185.field3282 = 0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public static void method1767(boolean arg0) {
        field4688 = null;
        field4684 = null;
        field4685 = null;
        field4692 = null;
        field4690 = null;
        if (!arg0) {
            field4685 = null;
        }
    }
}
