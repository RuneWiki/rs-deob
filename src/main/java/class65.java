import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 {

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Lfc;")
    public static class39 field1569 = class90.method774("Unerwartete Antwort vom Anmelde)2Server)3", -97);

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Lfc;")
    private static class39 field1563 = class90.method774("Connecting to friendserver", -91);

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Lfc;")
    public static class39 field1566 = field1563;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Lfc;")
    private static class39 field1570 = class90.method774("Connection timed out)3", -81);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lfc;")
    public static class39 field1560 = class90.method774("<col=c0ff00>", -116);

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lfc;")
    public static class39 field1561 = field1570;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Ldc;")
    public static class25 field1564;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "[[Lob;")
    public static class99[][] field1571;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 29)
    public static void method627(int arg0) {
        field1560 = null;
        field1564 = null;
        field1569 = null;
        field1561 = null;
        field1571 = null;
        field1563 = null;
        if (arg0 != -418514552) {
            method628((byte) -11, 126, 108, 61);
        }
        field1570 = null;
        field1566 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIII)I", line = 64)
    public static final int method628(byte arg0, int arg1, int arg2, int arg3) {
        field1567++;
        int var4 = 256 - arg3;
        if (arg0 < 14) {
            method628((byte) -4, -125, -5, -105);
        }
        return ((arg1 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg3 & 0xFF0000) + ((arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg3 & 0xFF00FF00) >> 8;
    }
}
