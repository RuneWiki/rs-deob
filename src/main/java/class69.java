import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class69 extends RuntimeException {

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1146;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Ljava/lang/String;")
    public String field1151;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Loa;")
    public static class99 field1144 = class221.method1463(2844, ")2");

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Loa;")
    public static class99 field1145 = class221.method1463(2844, "<)4col>");

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "[Lcf;")
    public static class93[] field1150 = new class93[28];

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Ltg;")
    public static class182 field1143;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "[[[B")
    public static byte[][][] field1148;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ltb;")
    public static final class69 method468(Throwable arg0, String arg1) {
        field1147++;
        class69 var2;
        if (arg0 instanceof class69) {
            var2 = (class69) arg0;
            var2.field1151 = var2.field1151 + ' ' + arg1;
        } else {
            var2 = new class69(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static void method469(byte arg0) {
        field1143 = null;
        field1148 = null;
        field1145 = null;
        if (arg0 != -12) {
            field1148 = null;
        }
        field1150 = null;
        field1144 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static final void method470(boolean arg0) {
        if (arg0) {
            field1142 = 54;
        }
        field1149++;
        class174.field3072++;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    private class69(Throwable arg0, String arg1) {
        this.field1146 = arg0;
        this.field1151 = arg1;
    }
}
