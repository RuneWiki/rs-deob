import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class108 {

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    private int field1761;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "J")
    private long field1757;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "[I")
    public static int[] field1762 = new int[256];

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static void method1018(byte arg0) {
        if (arg0 >= -20) {
            method1018((byte) -18);
        }
        field1762 = null;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)I")
    public final int method1019(byte arg0) {
        field1758++;
        return arg0 == 67 ? this.field1761 : 28;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILje;)V")
    private final void method1020(int arg0, class369 arg1) {
        this.field1757 |= (arg1.field5773 << this.field1761++ * class369.field5781);
        if (arg0 >= -90) {
            this.method1021((byte) -110, 99);
        }
        field1760++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)I")
    private final int method1021(byte arg0, int arg1) {
        field1756++;
        if (arg0 >= -99) {
            this.field1757 = 82L;
        }
        return (int) (this.field1757 >> class369.field5781 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Lje;")
    public final class369 method1022(int arg0, int arg1) {
        if (arg0 > -40) {
            return null;
        } else {
            field1759++;
            return class369.method2437((byte) 103, this.method1021((byte) -122, arg1));
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lje;)V")
    public class108(class369 arg0) {
        this.field1761 = 1;
        this.field1757 = arg0.field5773;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "([Lje;)V")
    public class108(class369[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method1020(-109, arg0[var2]);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1762[var0] = var1;
        }
    }
}
