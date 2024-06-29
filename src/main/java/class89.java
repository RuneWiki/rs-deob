import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class class89 {

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field1769 = 0;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1760 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Loh;")
    public static class263 field1773 = class253.method1681(-118, "l");

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Loh;")
    public static class263 field1770 = class253.method1681(-122, " <col=ffffff>");

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public int field1762;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public int field1766;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Lmc;")
    public static class192 field1771;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Z")
    public final boolean method627(int arg0) {
        field1764++;
        if (arg0 == 8) {
            return (this.field1766 & 0x8) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Z")
    public final boolean method628(int arg0) {
        if (arg0 > -71) {
            this.method631(31);
        }
        field1761++;
        return (this.field1766 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Z")
    public final boolean method629(byte arg0) {
        if (arg0 != 26) {
            this.method628(-87);
        }
        field1768++;
        return (this.field1766 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public static void method630(int arg0) {
        field1770 = null;
        field1760 = null;
        if (arg0 != 16) {
            field1760 = null;
        }
        field1771 = null;
        field1773 = null;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Z")
    public final boolean method631(int arg0) {
        field1767++;
        if (arg0 < 63) {
            return false;
        } else {
            return (this.field1766 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/String;)Loh;")
    public static final class263 method632(int arg0, String arg1) {
        field1763++;
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg1.getBytes();
        }
        class263 var3 = new class263();
        var3.field4591 = 0;
        var3.field4605 = var2;
        for (int var4 = arg0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field4591++] = var2[var4];
            }
        }
        return var3;
    }
}
