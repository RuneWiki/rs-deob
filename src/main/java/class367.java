import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class367 implements class707 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Ljava/lang/String;")
    private String field5099;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Z")
    public static boolean field5101 = false;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field5105 = 4;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field5103 = 0;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Z")
    private boolean field5100;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Z")
    public final boolean method2296(int arg0) {
        field5102++;
        int var2 = -116 / ((arg0 + 39) / 40);
        return this.field5100;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class367(String arg0) {
        this.field5099 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I")
    public final int method2065(int arg0) {
        if (arg0 != -6765) {
            this.method2296(-66);
        }
        field5104++;
        int var2 = class326.method2090(this.field5099, true);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field5100 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Llj;")
    public final class633 method2067(int arg0) {
        if (arg0 == -5905) {
            field5107++;
            return class633.field8889;
        } else {
            return null;
        }
    }
}
