import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class20 implements class759 {

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lbt;")
    private class48 field347;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Ljava/lang/String;")
    private String field346;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)I", line = 5)
    public final int method230(int arg0) {
        field345++;
        if (arg0 != -6635) {
            this.field346 = null;
        }
        return this.field347.method459(this.field346, (byte) 120) ? 100 : 0;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lbt;Ljava/lang/String;)V", line = 20)
    public class20(class48 arg0, String arg1) {
        this.field347 = arg0;
        this.field346 = arg1;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)Lsg;", line = 30)
    public final class418 method231(int arg0) {
        if (arg0 != -27990) {
            this.field347 = null;
        }
        field348++;
        return class418.field5450;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)Z", line = 41)
    public static final boolean method232(boolean arg0) {
        if (arg0) {
            method232(false);
        }
        field349++;
        if (class427.field5651 == null) {
            return false;
        } else {
            if (class427.field5651.field1029 >= 2000) {
                class427.field5651.field1029 -= 2000;
            }
            return class427.field5651.field1029 == 1003;
        }
    }
}
