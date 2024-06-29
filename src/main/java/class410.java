import java.awt.Color;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class410 extends InputStream {

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Lcs;")
    public static class351 field5687 = new class351(16, 3);

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5688 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "S")
    public static short field5691 = 256;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "Ltm;")
    public static class112 field5692 = new class112(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)Z")
    public static final boolean method2404(int arg0) {
        field5686++;
        return ~class221.field3118 == arg0 ? class67.field1000 : true;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)V")
    public static final void method2405(int arg0, int arg1, int arg2) {
        field5690++;
        if (arg0 == 16) {
            class265 var3 = class440.method2554(arg2, arg0 - 14, 7);
            var3.method1675(false);
            var3.field3698 = arg1;
        }
    }

    @OriginalMember(owner = "client!cn", name = "read", descriptor = "()I")
    public final int read() {
        field5689++;
        class258.method1603(-649, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
    public static void method2406(byte arg0) {
        field5692 = null;
        field5687 = null;
        field5688 = null;
        if (arg0 < 84) {
            field5687 = null;
        }
    }
}
