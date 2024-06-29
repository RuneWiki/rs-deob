import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class110 {

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lad;")
    private class5 field2124 = new class5();

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Led;")
    public static class43 field2115 = class191.method1219("bevor Sie den Vorgang wiederholen)3", false);

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Led;")
    public static class43 field2127 = class191.method1219("", false);

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Led;")
    public static class43 field2119 = field2127;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Led;")
    public static class43 field2126 = class191.method1219("Begeben Sie sich in ein freies Gebiet)1 um", false);

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Led;")
    public static class43 field2123 = class191.method1219("Sie haben gerade eine andere Welt verlassen)3", false);

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Led;")
    private static class43 field2122 = class191.method1219("Your profile will be transferred in:", false);

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Led;")
    public static class43 field2129 = field2122;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "Led;")
    private static class43 field2132 = class191.method1219("Invalid username or password)3", false);

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Led;")
    private static class43 field2133 = class191.method1219("K", false);

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Led;")
    public static class43 field2120 = field2133;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Led;")
    public static class43 field2121 = field2133;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Led;")
    public static class43 field2134 = class191.method1219("<col=40ff00>", false);

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Led;")
    public static class43 field2125 = field2132;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)Lad;")
    public final class5 method680(int arg0) {
        field2118++;
        if (arg0 != 554) {
            this.method685((byte) -37);
        }
        class5 var2 = this.field2124.field110;
        return this.field2124 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILad;)V")
    public final void method681(int arg0, class5 arg1) {
        if (arg1.field105 != null) {
            arg1.method30(13);
        }
        arg1.field110 = this.field2124;
        field2131++;
        arg1.field105 = this.field2124.field105;
        arg1.field105.field110 = arg1;
        if (arg0 == 17545) {
            arg1.field110.field105 = arg1;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static void method682(boolean arg0) {
        field2126 = null;
        field2134 = null;
        field2120 = null;
        field2115 = null;
        field2132 = null;
        field2123 = null;
        if (arg0) {
            field2123 = null;
        }
        field2119 = null;
        field2121 = null;
        field2127 = null;
        field2129 = null;
        field2125 = null;
        field2122 = null;
        field2133 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lad;B)V")
    public final void method683(class5 arg0, byte arg1) {
        if (arg1 <= 82) {
            method682(false);
        }
        if (arg0.field105 != null) {
            arg0.method30(13);
        }
        arg0.field110 = this.field2124.field110;
        arg0.field105 = this.field2124;
        arg0.field105.field110 = arg0;
        field2117++;
        arg0.field110.field105 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static final void method684(byte arg0) {
        class116.field2260.method1108((byte) -90);
        field2128++;
        if (arg0 != -116) {
            field2121 = null;
        }
        class86.field1678.method1108((byte) -90);
        class148.field3016.method1108((byte) -90);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)Lad;")
    public final class5 method685(byte arg0) {
        field2116++;
        class5 var2 = this.field2124.field110;
        int var3 = -39 / ((-arg0 - 38) / 50);
        if (this.field2124 == var2) {
            return null;
        } else {
            var2.method30(13);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class110() {
        this.field2124.field105 = this.field2124;
        this.field2124.field110 = this.field2124;
    }
}
