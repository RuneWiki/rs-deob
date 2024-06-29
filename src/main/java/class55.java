import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class55 implements class4 {

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "Lvo;")
    private class345 field713;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "Ljava/lang/String;")
    private String field714;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "Lel;")
    public static class3 field715 = new class3();

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "S")
    public static short field716 = 320;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)V", line = 7)
    public static void method425(boolean arg0) {
        field715 = null;
        if (!arg0) {
            field715 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)Lsba;", line = 18)
    public final class387 method21(byte arg0) {
        if (arg0 != -44) {
            this.field713 = null;
        }
        field711++;
        return class387.field5668;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)I", line = 29)
    public final int method20(int arg0) {
        field712++;
        if (this.field713.method2068(this.field714, 0)) {
            return 100;
        } else {
            int var2 = -13 % ((-arg0 - 32) / 59);
            return 0;
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lvo;Ljava/lang/String;)V", line = 47)
    public class55(class345 arg0, String arg1) {
        this.field713 = arg0;
        this.field714 = arg1;
    }
}
