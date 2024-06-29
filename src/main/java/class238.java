import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class238 {

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field3815 = 0;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "Lck;")
    public static class119 field3818 = class298.method1987((byte) 90, "n");

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field3816 = 0;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field3820 = 50;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public static int field3821 = -1;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "Luj;")
    public static class156 field3814 = new class156();

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lml;Z)V", line = 19)
    public static final void method1520(class134 arg0, boolean arg1) {
        class134 var2 = class110.method709(0, arg0);
        field3819++;
        if (!arg1) {
            return;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class131.field2000;
            var4 = class269.field4437;
        } else {
            var3 = var2.field2057;
            var4 = var2.field2180;
        }
        class185.method1175(arg0, false, var4, var3, 1);
        class195.method1257(arg0, (byte) -72, var3, var4);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V", line = 45)
    public static final void method1521(byte arg0) {
        field3817++;
        for (class32 var1 = (class32) class55.field877.method995(1836596936); var1 != null; var1 = (class32) class55.field877.method996(0)) {
            if (var1.field469) {
                var1.method239((byte) -119);
            }
        }
        if (arg0 < 108) {
            field3815 = -4;
        }
        for (class32 var2 = (class32) class95.field1461.method995(1836596936); var2 != null; var2 = (class32) class95.field1461.method996(0)) {
            if (var2.field469) {
                var2.method239((byte) -109);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 86)
    public static void method1522(int arg0) {
        field3818 = null;
        if (arg0 == 5879) {
            field3814 = null;
        }
    }
}
