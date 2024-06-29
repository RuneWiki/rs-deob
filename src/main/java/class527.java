import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class527 extends class435 {

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "Ljava/lang/String;")
    public String field7719;

    @OriginalMember(owner = "client!dw", name = "s", descriptor = "Ljn;")
    public static class117 field7721 = new class117(8);

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZFFF)I", line = 9)
    public static final int method3100(boolean arg0, float arg1, float arg2, float arg3) {
        field7720++;
        float var4 = (arg2 < 0.0F) ? -arg2 : arg2;
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        if (!arg0) {
            field7721 = null;
        }
        float var6 = arg3 < 0.0F ? -arg3 : arg3;
        if (var5 > var4 && var6 < var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return arg3 > 0.0F ? 2 : 3;
        } else if ((arg2 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V", line = 52)
    public static void method3101(byte arg0) {
        field7721 = null;
        if (arg0 > -114) {
            field7721 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V", line = 64)
    public class527() {
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 67)
    public class527(String arg0) {
        this.field7719 = arg0;
    }
}
