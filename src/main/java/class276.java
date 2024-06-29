import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class276 extends class42 {

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "Ljava/lang/String;")
    public String field4120;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4118 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
    public static int field4122 = -1;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "Lqt;")
    public static class459 field4123 = new class459(48, 15);

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "Liu;")
    public static class415 field4124 = new class415(5000);

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)V")
    public static final void method1779(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 > -65) {
            field4123 = null;
        }
        field4119++;
        field4124.field7558 = 0;
        field4124.method3048(-2034159384, class195.field2844.field19);
        field4124.method3048(-2034159384, arg1);
        field4124.method3048(-2034159384, arg2);
        field4124.method3016(arg4, -85);
        field4124.method3016(arg0, -81);
        class329.field4840 = 1;
        class211.field3189 = 0;
        class513.field7457 = -3;
        class77.field1269 = 0;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method1780(int arg0) {
        field4118 = null;
        field4123 = null;
        if (arg0 != 15011) {
            field4122 = -122;
        }
        field4124 = null;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class276() {
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class276(String arg0, int arg1) {
        this.field4120 = arg0;
    }
}
