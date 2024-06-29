import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class class272 extends class201 {

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "Ljd;")
    public static class85 field4814 = class221.method1499("Verbindung abgebrochen)3", (byte) 127);

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "Ljd;")
    private static class85 field4813 = class221.method1499("Prepared sound engine", (byte) 125);

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    public static int field4810 = 0;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "Ljd;")
    public static class85 field4812 = class221.method1499(")3runescape)3com", (byte) -106);

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "Ljd;")
    private static class85 field4817 = class221.method1499("Location", (byte) 111);

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "Ljd;")
    public static class85 field4806 = field4813;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "Ljd;")
    public static class85 field4815 = field4817;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "Ljd;")
    private static class85 field4819 = class221.method1499("level)2", (byte) 103);

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "Ljd;")
    public static class85 field4818 = field4819;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "Lge;")
    public static class68 field4807;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)I")
    public static final int method1856(int arg0, int arg1) {
        field4808++;
        if (arg1 > -115) {
            method1856(-44, 24);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V")
    public static void method1857(int arg0) {
        field4806 = null;
        field4814 = null;
        field4807 = null;
        field4817 = null;
        field4818 = null;
        field4812 = null;
        field4813 = null;
        if (arg0 != 26792) {
            method1856(106, 99);
        }
        field4819 = null;
        field4815 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)I")
    public static final int method1858(byte arg0, int arg1) {
        field4816++;
        if (arg0 != -12) {
            field4812 = null;
        }
        return (arg1 & 0x1DD98B) >> 18;
    }

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1299(int arg0);

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "(I)Z")
    public abstract boolean method1300(int arg0);
}
