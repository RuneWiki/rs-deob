import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class63 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field1085 = 0;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Lok;")
    public static class146 field1087 = class235.method1724(-12908, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field1090 = 0;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[I")
    public static int[] field1092 = new int[32];

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field1091 = 0;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field1093 = 0;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[[B")
    public static byte[][] field1089;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 10)
    public static void method487(int arg0) {
        field1089 = (byte[][]) null;
        field1087 = null;
        field1092 = null;
        if (arg0 != 0) {
            method487(-56);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLwe;)Lne;", line = 36)
    public static final class229 method488(byte arg0, class47 arg1) {
        field1086++;
        if (arg0 != -120) {
            method487(-46);
        }
        return new class229(arg1.method343(26167), arg1.method343(arg0 ^ 0xFFFF99BF), arg1.method343(26167), arg1.method343(26167), arg1.method389((byte) 51), arg1.method389((byte) 126), arg1.method368(-119));
    }
}
