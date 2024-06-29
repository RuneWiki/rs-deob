import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class88 extends OutputStream {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Lqd;")
    public static class40 field1588 = class147.method1106(" loggt sich ein)3", (byte) -57);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Lqd;")
    public static class40 field1589 = class147.method1106("Lade Texturen )2 ", (byte) -84);

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lqd;")
    private static class40 field1596 = class147.method1106("Continue", (byte) -121);

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lqd;")
    private static class40 field1597 = class147.method1106("scroll:", (byte) -101);

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lqd;")
    public static class40 field1590 = field1596;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Lqd;")
    public static class40 field1592 = field1597;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lqd;")
    public static class40 field1591 = field1597;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[[B")
    public static byte[][] field1595;

    @OriginalMember(owner = "client!he", name = "write", descriptor = "(I)V", line = 13)
    public final void write(int arg0) throws IOException {
        field1593++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 29)
    public static void method685(byte arg0) {
        field1595 = (byte[][]) null;
        field1589 = null;
        field1591 = null;
        field1597 = null;
        int var1 = -18 / ((52 - arg0) / 55);
        field1596 = null;
        field1592 = null;
        field1588 = null;
        field1590 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)I", line = 65)
    public static int method686(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
