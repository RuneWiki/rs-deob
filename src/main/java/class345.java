import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class345 extends class108 {

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    public int field4938 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
    public int field4943 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "I")
    public int field4940 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
    public int field4942 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public int field4941 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
    public int field4945 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
    public int field4948 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
    public int field4947 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "Lgb;")
    public class153 field4939;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "Lpp;")
    public static class464 field4944 = new class464(39, 7);

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)Z", line = 9)
    public final boolean method2097(int arg0, int arg1, int arg2) {
        if (arg0 != -7491) {
            return true;
        }
        field4946++;
        if (arg2 >= this.field4945 && arg2 <= this.field4943 && arg1 >= this.field4941 && arg1 <= this.field4948) {
            return true;
        } else {
            return this.field4942 <= arg2 && arg2 <= this.field4938 && arg1 >= this.field4940 && arg1 <= this.field4947;
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lgb;)V", line = 72)
    public class345(class153 arg0) {
        this.field4939 = arg0;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V", line = 63)
    public static void method2098(int arg0) {
        field4944 = null;
        if (arg0 != 39) {
            field4944 = null;
        }
    }
}
