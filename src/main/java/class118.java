import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class118 extends class145 {

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field3090 = 0;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "[Lrc;")
    public static class121[] field3092 = new class121[32768];

    @OriginalMember(owner = "client!r", name = "I", descriptor = "Lfc;")
    private static class39 field3095 = class90.method774("Location", -123);

    @OriginalMember(owner = "client!r", name = "G", descriptor = "Lfc;")
    public static class39 field3093 = class90.method774("<col=00ff00>", -111);

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field3091 = 0;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "Lfc;")
    public static class39 field3096 = class90.method774("Ihr Spielkonto wurde deaktiviert)3", -82);

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Lfc;")
    public static class39 field3087 = field3095;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "Lfc;")
    private static class39 field3098 = class90.method774("Loading ignore list", -82);

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Lfc;")
    public static class39 field3085 = field3098;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "J")
    public static long field3084;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "Lr;")
    public class118 field3089;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "Lr;")
    public class118 field3097;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)[Lue;", line = 45)
    public static final class141[] method1021(int arg0) {
        field3094++;
        class141[] var1 = new class141[class70.field1650];
        if (arg0 != 6662) {
            method1022(true);
        }
        for (int var2 = 0; var2 < class70.field1650; var2++) {
            class141 var3 = var1[var2] = new class141();
            var3.field3542 = class1.field3;
            var3.field3548 = class44.field1189;
            var3.field3547 = class131.field3287[var2];
            var3.field3545 = class72.field1686[var2];
            var3.field3543 = class101.field2515[var2];
            var3.field3546 = class115.field3026[var2];
            var3.field3549 = class1.field27;
            var3.field3544 = class15.field395[var2];
        }
        class114.method994(125);
        return var1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V", line = 77)
    public static void method1022(boolean arg0) {
        field3093 = null;
        field3095 = null;
        field3087 = null;
        field3096 = null;
        field3092 = null;
        if (arg0) {
            field3085 = null;
            field3098 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V", line = 124)
    public final void method1023(byte arg0) {
        field3088++;
        int var2 = -16 % ((-arg0 - 62) / 36);
        if (this.field3089 != null) {
            this.field3089.field3097 = this.field3097;
            this.field3097.field3089 = this.field3089;
            this.field3089 = null;
            this.field3097 = null;
        }
    }
}
