import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class409 {

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Ljava/lang/String;")
    public String field5774;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Ljava/lang/String;")
    public String field5777;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Ljava/lang/String;")
    public String field5772;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field5773 = 0;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lee;")
    public static class676 field5775 = new class676();

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field5778 = -1;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 3)
    public static void method2360(byte arg0) {
        if (arg0 != 49) {
            method2360((byte) -9);
        }
        field5775 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLjava/awt/Component;)Lfa;", line = 15)
    public static final class236 method2361(byte arg0, Component arg1) {
        if (arg0 != 10) {
            method2361((byte) 67, null);
        }
        field5776++;
        return new class266(arg1);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V", line = 32)
    public static final void method2362(byte arg0) {
        int var1 = 53 / ((-arg0 - 62) / 35);
        field5771++;
        if (!class420.field5888) {
            return;
        }
        while (true) {
            while (class11.field66 < class688.field9635.length) {
                class695 var2 = class688.field9635[class11.field66];
                if (var2 != null && var2.field9707 == -1) {
                    if (class264.field3463 == null) {
                        class264.field3463 = class185.field2255.method81(90, var2.field9712);
                    }
                    int var3 = class264.field3463.field5191;
                    if (var3 == -1) {
                        return;
                    }
                    class264.field3463 = null;
                    class11.field66++;
                    var2.field9707 = var3;
                } else {
                    class11.field66++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 72)
    public class409(String arg0, String arg1, String arg2) {
        this.field5774 = arg2;
        this.field5777 = arg0;
        this.field5772 = arg1;
    }
}
