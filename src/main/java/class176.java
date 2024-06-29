import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class176 {

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lre;")
    public class282 field2878 = new class282();

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2873 = 0;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Z")
    public static boolean field2877 = false;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Z")
    public static boolean field2881 = false;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Loj;")
    public static class246 field2880 = new class246();

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2882 = "Drop";

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lfl;")
    public static class85 field2872;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public final void method1286(byte arg0) {
        if (arg0 > -90) {
            return;
        }
        field2879++;
        while (true) {
            class282 var2 = this.field2878.field4503;
            if (this.field2878 == var2) {
                return;
            }
            var2.method1894(false);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static final void method1287(int arg0) {
        field2874++;
        if (arg0 < 74) {
            method1288(92);
        }
        class233.field3742.method1255(-98);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method1288(int arg0) {
        if (arg0 != -9025) {
            method1290(84);
        }
        field2880 = null;
        field2872 = null;
        field2882 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLre;)V")
    public final void method1289(byte arg0, class282 arg1) {
        if (arg0 <= 117) {
            return;
        }
        if (arg1.field4501 != null) {
            arg1.method1894(false);
        }
        arg1.field4503 = this.field2878;
        arg1.field4501 = this.field2878.field4501;
        field2875++;
        arg1.field4501.field4503 = arg1;
        arg1.field4503.field4501 = arg1;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)I")
    public static final int method1290(int arg0) {
        if (arg0 != 23032) {
            method1290(88);
        }
        field2876++;
        return 6;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class176() {
        this.field2878.field4503 = this.field2878;
        this.field2878.field4501 = this.field2878;
    }
}
