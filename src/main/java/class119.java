import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class119 extends class200 {

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "Lqh;")
    public class179 field2116;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "Ldj;")
    public static class44 field2114 = class89.method650(255, "Fps:");

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field2119 = 0;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "Ldj;")
    private static class44 field2120 = class89.method650(255, "Drop");

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "Ldj;")
    public static class44 field2115 = field2120;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "Z")
    public static boolean field2121 = false;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "Lob;")
    public static class153 field2117 = new class153();

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "Ldj;")
    public static class44 field2123 = class89.method650(255, " loggt sich ein)3");

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "I")
    public static int field2124 = -1;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "Lsb;")
    public static class192 field2125;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "Ldj;")
    public static class44 field2122;

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lqh;)V")
    public class119(class179 arg0) {
        this.field2116 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)V")
    public static void method826(boolean arg0) {
        field2114 = null;
        if (arg0) {
            method826(false);
        }
        field2115 = null;
        field2122 = null;
        field2125 = null;
        field2123 = null;
        field2117 = null;
        field2120 = null;
    }
}
