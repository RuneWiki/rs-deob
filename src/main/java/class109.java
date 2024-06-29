import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class109 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Ldc;")
    public static class37 field1888 = class185.method1233((byte) 86, "(U5");

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field1891 = 0;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Ldc;")
    public static class37 field1895 = class185.method1233((byte) 86, "Texturen geladen)3");

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field1896 = 0;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Ldc;")
    public static class37 field1899 = null;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Ldc;")
    public static class37 field1900 = class185.method1233((byte) 86, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Ldc;")
    public static class37 field1898 = class185.method1233((byte) 86, "Nehmen");

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Ldc;")
    public static class37 field1897 = class185.method1233((byte) 86, "Lade)3)3)3");

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Lqh;")
    public static class182 field1889;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Z")
    public static final boolean method709(int arg0, int arg1) {
        if (arg0 != -1) {
            method709(22, 69);
        }
        field1893++;
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BJ)V")
    public static final void method710(byte arg0, long arg1) {
        if (arg0 > -55) {
            return;
        }
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field1890++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method711(int arg0) {
        field1889 = null;
        field1888 = null;
        field1895 = null;
        field1900 = null;
        field1899 = null;
        field1898 = null;
        field1897 = null;
        if (arg0 >= -66) {
            field1899 = null;
        }
    }
}
