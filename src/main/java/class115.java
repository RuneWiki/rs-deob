import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public abstract class class115 extends class232 {

    @OriginalMember(owner = "client!el", name = "R", descriptor = "Z")
    public volatile boolean field1856 = true;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "Z")
    public static boolean field1846 = false;

    @OriginalMember(owner = "client!el", name = "L", descriptor = "Z")
    public static boolean field1851 = false;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "Lok;")
    public static class146 field1853 = class235.method1724(-12908, "lila:");

    @OriginalMember(owner = "client!el", name = "P", descriptor = "Lok;")
    public static class146 field1855 = class235.method1724(-12908, "(U3");

    @OriginalMember(owner = "client!el", name = "K", descriptor = "I")
    public static int field1850 = 0;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "Lld;")
    public static class118 field1854 = new class118(32);

    @OriginalMember(owner = "client!el", name = "S", descriptor = "Lok;")
    public static class146 field1857 = class235.method1724(-12908, "rect_debug=");

    @OriginalMember(owner = "client!el", name = "F", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "Z")
    public boolean field1847;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "Z")
    public boolean field1849;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Loh;Loh;Loh;B)V", line = 15)
    public static final void method780(class15 arg0, class15 arg1, class15 arg2, byte arg3) {
        int var4 = -112 / ((-arg3) / 53);
        class182.field3049 = arg1;
        field1845++;
        class265.field4558 = arg0;
        class182.field3047 = arg2;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V", line = 62)
    public static void method781(boolean arg0) {
        field1854 = null;
        field1855 = null;
        field1853 = null;
        if (arg0) {
            method780((class15) null, (class15) null, (class15) null, (byte) 17);
        }
        field1857 = null;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(I)I")
    public abstract int method703(int arg0);

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(I)[B")
    public abstract byte[] method706(int arg0);
}
