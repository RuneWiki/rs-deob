import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class76 {

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lu;")
    public static class135 field1792 = class87.method676((byte) -42, "mapdots");

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Ljc;")
    public static class65 field1789 = null;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lu;")
    private static class135 field1786 = class87.method676((byte) -125, "wave:");

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field1798 = 0;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lu;")
    private static class135 field1788 = class87.method676((byte) -78, "Classic");

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lu;")
    public static class135 field1787 = class87.method676((byte) -127, "::noclip");

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Lu;")
    public static class135 field1802 = field1786;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Lu;")
    public static class135 field1791 = class87.method676((byte) -88, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lu;")
    public static class135 field1797 = field1788;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Lu;")
    public static class135 field1801 = field1786;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "[Z")
    public static boolean[] field1800 = new boolean[5];

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lu;")
    public static class135 field1805 = class87.method676((byte) -109, "Menge eingeben:");

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lbc;")
    public static class11 field1790;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Lg;")
    public static class43 field1804;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Lae;")
    public static class6 field1796;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1803;

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class76() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([BLic;B)V")
    public final void method610(byte[] arg0, class59 arg1, byte arg2) {
        field1799++;
        if (arg1.field1495[arg1.field1485] != 31 || arg1.field1495[arg1.field1485 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1803 == null) {
            this.field1803 = new Inflater(true);
        }
        if (arg2 != 116) {
            field1800 = null;
        }
        try {
            this.field1803.setInput(arg1.field1495, arg1.field1485 + 10, -arg1.field1485 + -10 - 8 + arg1.field1495.length);
            this.field1803.inflate(arg0);
        } catch (Exception var4) {
            this.field1803.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1803.reset();
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(III)V")
    private class76(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static void method611(int arg0) {
        field1805 = null;
        field1792 = null;
        field1790 = null;
        field1802 = null;
        field1801 = null;
        field1796 = null;
        field1791 = null;
        field1800 = null;
        field1788 = null;
        field1804 = null;
        if (arg0 != -1) {
            method611(49);
        }
        field1787 = null;
        field1797 = null;
        field1786 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)Z")
    public static final boolean method612(byte arg0) {
        field1793++;
        try {
            if (class12.field290 == 2) {
                if (class39.field891 == null) {
                    class39.field891 = class121.method961(field1804, class126.field3001, class100.field2417);
                    if (class39.field891 == null) {
                        return false;
                    }
                }
                if (class129.field3102 == null) {
                    class129.field3102 = new class60(class97.field2353, class40.field924);
                }
                if (class17.field380.method1158(class129.field3102, 101, class60.field1518, class39.field891, 22050)) {
                    class17.field380.method1166((byte) 125);
                    class17.field380.method1157(1, class141.field3418);
                    class17.field380.method1164(class93.field2199, class39.field891, (byte) 120);
                    class39.field891 = null;
                    field1804 = null;
                    class12.field290 = 0;
                    class129.field3102 = null;
                    return true;
                }
            }
            if (arg0 <= 88) {
                field1791 = null;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class17.field380.method1147((byte) 92);
            class39.field891 = null;
            class129.field3102 = null;
            class12.field290 = 0;
            field1804 = null;
        }
        return false;
    }
}
