import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class205 {

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lda;")
    public static class275 field3477 = null;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[I")
    public static int[] field3478 = new int[2];

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field3480 = 0;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Lda;")
    public class275 field3479;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[I")
    public static int[] field3475;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method1333(byte arg0) {
        if (arg0 >= -86) {
            method1334((byte) -8);
        }
        field3475 = null;
        field3477 = null;
        field3478 = null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
    public static final void method1334(byte arg0) {
        field3476++;
        Container var1;
        if (class276.field4821 != null) {
            var1 = class276.field4821;
        } else if (class165.field2870 == null) {
            var1 = class3.field24.field970;
        } else {
            var1 = class165.field2870;
        }
        class244.field4258 = var1.getSize().width;
        class63.field1054 = var1.getSize().height;
        if (class165.field2870 == var1) {
            Insets var2 = class165.field2870.getInsets();
            class244.field4258 -= var2.right + var2.left;
            class63.field1054 -= var2.top + var2.bottom;
        }
        if (class56.method353(true) < 2) {
            class42.field709 = 0;
            class19.field264 = (class244.field4258 - 765) / 2;
            class249.field4391 = 765;
            class212.field3587 = 503;
        } else {
            class212.field3587 = class63.field1054;
            class249.field4391 = class244.field4258;
            class42.field709 = 0;
            class19.field264 = 0;
        }
        class93.field1601.setSize(class249.field4391, class212.field3587);
        if (arg0 > -48) {
            field3478 = null;
        }
        if (class165.field2870 == var1) {
            Insets var3 = class165.field2870.getInsets();
            class93.field1601.setLocation(class19.field264 + var3.left, class42.field709 + var3.top);
        } else {
            class93.field1601.setLocation(class19.field264, class42.field709);
        }
        if (class166.field2881 != -1) {
            class23.method155((byte) -113, true);
        }
        class155.method1093(11076);
    }
}
