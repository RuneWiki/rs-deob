import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class83 {

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "B")
    private byte field1518;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public int field1512;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public int field1523;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public int field1507;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Ljd;")
    public static class85 field1509 = class221.method1499("Hierhin gehen", (byte) 110);

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "Ljd;")
    private static class85 field1508 = class221.method1499("Members only world", (byte) -58);

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "S")
    public static short field1517 = 32767;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "Ljd;")
    public static class85 field1521 = field1508;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Ljd;")
    public static class85 field1520 = class221.method1499("titlebg", (byte) 107);

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field1513 = 100;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "J")
    public static long field1525 = 0L;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
    public static boolean field1514;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method571(byte arg0) {
        field1509 = null;
        field1508 = null;
        field1521 = null;
        field1520 = null;
        if (arg0 != -68) {
            method574((String) null, 28);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I")
    public final int method572(int arg0) {
        if (arg0 == -2684) {
            field1515++;
            return this.field1518 & 0x7;
        } else {
            return 53;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)I")
    public final int method573(int arg0) {
        if (arg0 != -9) {
            this.field1512 = 76;
        }
        field1522++;
        return (this.field1518 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class83() {
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lik;)V")
    public class83(class247 arg0) {
        this.field1518 = arg0.method1690(true);
        this.field1519 = arg0.method1694((byte) -100);
        this.field1512 = arg0.method1712(6357);
        this.field1516 = arg0.method1712(6357);
        this.field1523 = arg0.method1712(6357);
        this.field1507 = arg0.method1712(6357);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/String;I)Ljd;")
    public static final class85 method574(String arg0, int arg1) {
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        class85 var3 = new class85();
        var3.field1548 = var2;
        field1511++;
        if (arg1 >= -99) {
            method571((byte) 108);
        }
        var3.field1538 = 0;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field1538++] = var2[var4];
            }
        }
        return var3;
    }
}
