import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class132 extends class176 {

    @OriginalMember(owner = "client!as", name = "p", descriptor = "[I")
    public static int[] field2106 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    public static int field2109 = 0;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "Lml;")
    public static class325 field2111 = new class325(2, -1);

    @OriginalMember(owner = "client!as", name = "w", descriptor = "[Ldt;")
    public static class201[] field2113 = new class201[8];

    @OriginalMember(owner = "client!as", name = "v", descriptor = "Z")
    public static boolean field2112 = false;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "Llf;")
    public static class200 field2114 = new class200();

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "J")
    public long field2110;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "Las;")
    public class132 field2104;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "Las;")
    public class132 field2108;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "Lao;")
    public static class240 field2105;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V")
    public static void method894(byte arg0) {
        if (arg0 != -102) {
            field2114 = null;
        }
        field2106 = null;
        field2113 = null;
        field2111 = null;
        field2105 = null;
        field2114 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Z")
    public final boolean method895(boolean arg0) {
        if (arg0) {
            field2109 = -92;
        }
        field2103++;
        return this.field2108 != null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public final void method896(int arg0) {
        field2107++;
        if (this.field2108 == null) {
            return;
        }
        this.field2108.field2104 = this.field2104;
        this.field2104.field2108 = this.field2108;
        this.field2104 = null;
        if (arg0 != 0) {
            this.method895(false);
        }
        this.field2108 = null;
    }
}
