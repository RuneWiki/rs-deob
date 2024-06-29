import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class483 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[[B")
    public static byte[][] field6918 = new byte[250][];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lsl;")
    public static class427 field6916 = new class427(16);

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[[[B")
    public static byte[][][] field6917;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method2923(int arg0) {
        field6918 = null;
        field6916 = null;
        if (arg0 != -26096) {
            method2923(-110);
        }
        field6917 = null;
    }
}
