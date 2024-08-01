import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public abstract class class96 {

    @OriginalMember(owner = "kb", name = "a", descriptor = "[[I")
    public static int[][] field1952 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "kb", name = "c", descriptor = "[B")
    public static byte[] field1954 = new byte[520];

    @OriginalMember(owner = "kb", name = "d", descriptor = "Llf;")
    public static class109 field1955 = class35.method275("Ung-Ultige Session)2ID)3", 2);

    @OriginalMember(owner = "kb", name = "b", descriptor = "[[B")
    public static byte[][] field1953 = new byte[50][];

    @OriginalMember(owner = "kb", name = "e", descriptor = "Llf;")
    public static class109 field1956 = class35.method275(":trade:", 2);

    @OriginalMember(owner = "kb", name = "g", descriptor = "Llf;")
    private static class109 field1958 = class35.method275("Unexpected loginserver response)3", 2);

    @OriginalMember(owner = "kb", name = "i", descriptor = "Llf;")
    public static class109 field1960 = field1958;

    @OriginalMember(owner = "kb", name = "f", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "kb", name = "h", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "kb", name = "a", descriptor = "(B)V")
    public static void method685(byte arg0) {
        field1952 = null;
        field1955 = null;
        field1953 = null;
        if (arg0 <= 51) {
            method685((byte) 74);
        }
        field1956 = null;
        field1960 = null;
        field1958 = null;
        field1954 = null;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method686(Component arg0, int arg1);

    @OriginalMember(owner = "kb", name = "b", descriptor = "(B)I")
    public abstract int method687(byte arg0);

    @OriginalMember(owner = "kb", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method688(byte arg0, Component arg1);
}
