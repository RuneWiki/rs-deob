import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class99 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Ljd;")
    public static class85 field1777 = class221.method1499(" zuerst von Ihrer Freunde)2Liste(Q", (byte) 106);

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field1784 = 0;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Ljd;")
    private static class85 field1781 = class221.method1499("Close", (byte) -74);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Ljd;")
    public static class85 field1778 = field1781;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1783 = 0;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "F")
    public static float field1779;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "[[[B")
    public static byte[][][] field1782;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "[[[Lck;")
    public static class208[][][] field1780;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method695(byte arg0) {
        if (arg0 >= -109) {
            field1778 = null;
        }
        field1778 = null;
        field1777 = null;
        field1782 = null;
        field1781 = null;
        field1780 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILge;)V")
    public static final void method696(int arg0, class68 arg1) {
        if (arg0 == 0) {
            field1786++;
            class31.field477 = arg1;
        }
    }
}
