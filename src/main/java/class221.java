import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class221 extends class445 {

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "Ljava/lang/String;")
    public String field2943;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "[Loe;")
    public static class121[] field2941 = new class121[32768];

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field2942 = 0;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "[Ltf;")
    public static class177[] field2945;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)I")
    public static final int method1252(int arg0) {
        field2946++;
        class76 var1 = class142.field2052;
        synchronized (class142.field2052) {
            if (arg0 != -32119) {
                field2942 = 108;
            }
            return class142.field2052.method494(65280);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
    public static void method1253(byte arg0) {
        field2941 = null;
        if (arg0 > -34) {
            field2942 = -26;
        }
        field2945 = null;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class221() {
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class221(String arg0) {
        this.field2943 = arg0;
    }
}
