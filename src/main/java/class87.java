import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class87 extends InputStream {

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "[B")
    public static byte[] field1587 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "S")
    public static short field1585 = 320;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field1588 = 0;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "[[B")
    public static byte[][] field1590 = new byte[250][];

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Lvf;")
    public static class265 field1591 = method582(-46, "Liste der Welten geladen");

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Z")
    public static boolean field1589;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method581(int arg0) {
        field1591 = null;
        field1590 = null;
        int var1 = -58 / ((arg0 - 81) / 42);
        field1587 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/lang/String;)Lvf;")
    public static final class265 method582(int arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        field1584++;
        int var3 = var2.length;
        class265 var4 = new class265();
        var4.field4643 = new byte[var3];
        int var5 = 0;
        if (arg0 != -46) {
            field1589 = true;
        }
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field4643[var4.field4640++] = (byte) (var7 + var6 * 43 - 48 - 1720);
            } else if (var6 != 0) {
                var4.field4643[var4.field4640++] = (byte) var6;
            }
        }
        var4.method1809((byte) 118);
        return var4.method1788(19);
    }

    @OriginalMember(owner = "client!ji", name = "read", descriptor = "()I")
    public final int read() {
        field1583++;
        class19.method136(1, 30000L);
        return -1;
    }
}
