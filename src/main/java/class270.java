import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class270 extends class215 {

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    public static int field4793 = 255;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "Ljd;")
    public static class85 field4790 = class221.method1499("Lade Schrifts-=tze )2 ", (byte) -86);

    @OriginalMember(owner = "client!p", name = "T", descriptor = "Z")
    public static boolean field4792 = false;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    public int field4795;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "Lok;")
    public class38 field4797;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "[B")
    public byte[] field4789;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)I")
    public final int method694(byte arg0) {
        ++field4791;
        if (arg0 > -18) {
            return 104;
        } else {
            return super.field3776 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(Z)V")
    public static void method1852(boolean arg0) {
        field4790 = null;
        if (arg0) {
            field4792 = false;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)[B")
    public final byte[] method691(byte arg0) {
        ++field4794;
        if (super.field3776) {
            throw new RuntimeException();
        } else {
            return arg0 > -57 ? null : this.field4789;
        }
    }

    @OriginalMember(owner = "client!p", name = "h", descriptor = "(I)V")
    public static final void method1853(int arg0) {
        class49.field871 = null;
        class152.field2597 = null;
        class229.field3964 = null;
        class66.field1222 = null;
        class128.field2253 = null;
        ++field4796;
        if (arg0 != 100) {
            field4790 = null;
        }
        class228.field3954 = null;
        class151.field2557 = null;
        class264.field4718 = null;
        class105.field1846 = null;
        class242.field4154 = null;
        class82.field1496 = null;
    }
}
