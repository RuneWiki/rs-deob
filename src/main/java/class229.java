import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class229 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Lsa;")
    public class92 field4187 = new class92();

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lng;")
    public static class139 field4186 = new class139(5);

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Ltb;")
    public static class192 field4189 = new class192();

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "[[B")
    public static byte[][] field4197 = new byte[1000][];

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "Lnl;")
    public static class26 field4196;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "Ldl;")
    public static class32 field4195;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Lgf;")
    public static class7 field4192;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4194;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "[Lqg;")
    public static class211[] field4190;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
    public static void method1562(boolean arg0) {
        field4197 = null;
        field4195 = null;
        field4192 = null;
        field4196 = null;
        field4194 = null;
        field4186 = null;
        field4190 = null;
        if (arg0) {
            field4196 = null;
        }
        field4189 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public final void method1563(int arg0) {
        field4188++;
        while (true) {
            class92 var2 = this.field4187.field1650;
            if (this.field4187 == var2) {
                if (arg0 <= 108) {
                    return;
                } else {
                    return;
                }
            }
            var2.method522((byte) -74);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lsa;I)V")
    public final void method1564(class92 arg0, int arg1) {
        if (arg0.field1659 != null) {
            arg0.method522((byte) -74);
        }
        arg0.field1659 = this.field4187.field1659;
        field4185++;
        arg0.field1650 = this.field4187;
        if (arg1 != 1000) {
            field4190 = null;
        }
        arg0.field1659.field1650 = arg0;
        arg0.field1650.field1659 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class229() {
        this.field4187.field1659 = this.field4187;
        this.field4187.field1650 = this.field4187;
    }
}
