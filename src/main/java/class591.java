import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class591 implements class690 {

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Ljava/lang/String;")
    private String field8234;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Lkha;")
    private class687 field8233;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "F")
    public static float field8230 = 0.0F;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field8232 = 0;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field8235;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Lam;", line = 5)
    public final class309 method650(byte arg0) {
        field8235++;
        if (arg0 != 8) {
            field8232 = 0;
        }
        return class309.field3950;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)I", line = 19)
    public final int method648(byte arg0) {
        field8231++;
        if (arg0 >= -101) {
            field8232 = -4;
        }
        return this.field8233.method3825(this.field8234, (byte) -126) ? 100 : this.field8233.method3823(this.field8234, 0);
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lkha;Ljava/lang/String;)V", line = 39)
    public class591(class687 arg0, String arg1) {
        this.field8234 = arg1;
        this.field8233 = arg0;
    }
}
