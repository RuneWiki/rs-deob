import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 {

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "Lt;")
    public static class35 field114 = class3.method28(false, "Bank");

    @OriginalMember(owner = "mapview!d", name = "i", descriptor = "Lt;")
    public static class35 field119 = class3.method28(false, "Prev page");

    @OriginalMember(owner = "mapview!d", name = "h", descriptor = "Lt;")
    public static class35 field118 = class3.method28(false, "Requesting ");

    @OriginalMember(owner = "mapview!d", name = "j", descriptor = "Z")
    public static boolean field120 = false;

    @OriginalMember(owner = "mapview!d", name = "k", descriptor = "Lt;")
    public static class35 field121 = class3.method28(false, "b12_full");

    @OriginalMember(owner = "mapview!d", name = "o", descriptor = "I")
    public static int field125 = 0;

    @OriginalMember(owner = "mapview!d", name = "m", descriptor = "Z")
    public static boolean field123 = true;

    @OriginalMember(owner = "mapview!d", name = "p", descriptor = "Lt;")
    public static class35 field126 = class3.method28(false, "Amulet Shop");

    @OriginalMember(owner = "mapview!d", name = "n", descriptor = "Z")
    public static volatile boolean field124 = false;

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "J")
    public long field112;

    @OriginalMember(owner = "mapview!d", name = "l", descriptor = "Lca;")
    public static class6 field122;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "Ld;")
    public class7 field111;

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "Ld;")
    public class7 field117;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lm;", line = 6)
    public static final class24 method52(Throwable arg0, String arg1) {
        class24 var2;
        if (arg0 instanceof class24) {
            var2 = (class24) arg0;
            var2.field270 = var2.field270 + ' ' + arg1;
        } else {
            var2 = new class24(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B)V", line = 58)
    public final void method53(byte arg0) {
        if (this.field117 == null) {
            return;
        }
        this.field117.field111 = this.field111;
        this.field111.field117 = this.field117;
        this.field111 = null;
        this.field117 = null;
        if (arg0 < 20) {
            this.method53((byte) 16);
        }
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(B)V", line = 87)
    public static void method54(byte arg0) {
        field118 = null;
        field122 = null;
        if (arg0 != -89) {
            method52(null, null);
        }
        field121 = null;
        field119 = null;
        field114 = null;
        field126 = null;
    }
}
