import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class110 extends class44 {

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "[B")
    public static byte[] field1976 = new byte[520];

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Lnb;")
    public static class120 field1984 = new class120(200);

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public int field1978;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public int field1979;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public int field1980;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public int field1986;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    public int field1990;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
    public int field1992;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "I")
    public int field1995;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "Lme;")
    public static class114 field1987;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Lw;")
    public class199 field1975;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Lw;")
    public class199 field1977;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "Lih;")
    public class81 field1988;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "[I")
    public int[] field1985;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "[Lob;")
    public static class129[] field1991;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Z")
    public static final boolean method594(int arg0, int arg1) {
        field1993++;
        if (arg0 == 97) {
            return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public static void method595(int arg0) {
        field1984 = null;
        field1991 = null;
        field1976 = null;
        if (arg0 != -12818) {
            field1987 = null;
        }
        field1987 = null;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
    public final void method596(int arg0) {
        field1983++;
        int var2 = this.field1994;
        if (arg0 != -12585) {
            return;
        }
        class81 var3 = this.field1988.method403(false);
        if (var3 == null) {
            this.field1978 = 0;
            this.field1985 = null;
            this.field1981 = 0;
            this.field1994 = -1;
            this.field1995 = 0;
        } else {
            this.field1978 = var3.field1491;
            this.field1985 = var3.field1448;
            this.field1994 = var3.field1463;
            this.field1995 = var3.field1496 * 128;
            this.field1981 = var3.field1457;
        }
        if (this.field1994 != var2 && this.field1977 != null) {
            class184.field3634.method1133(this.field1977);
            this.field1977 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)Z")
    public static final boolean method597(byte arg0) {
        if (arg0 < 61) {
            return true;
        }
        field1989++;
        class194 var1 = class203.field3915;
        synchronized (class203.field3915) {
            if (class182.field3594 == class111.field2003) {
                return false;
            } else {
                class2.field43 = class161.field3225[class111.field2003];
                class89.field1653 = class59.field948[class111.field2003];
                class111.field2003 = class111.field2003 + 1 & 0x7F;
                return true;
            }
        }
    }
}
