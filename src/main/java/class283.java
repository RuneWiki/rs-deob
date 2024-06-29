import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class283 {

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public int field4347;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public int field4345;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public int field4344;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public int field4346;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field4343 = -2;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Leg;")
    public static class188 field4351 = new class188(64);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lvg;")
    public static class342 field4349;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Ljava/awt/Font;")
    public static Font field4342;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)I", line = 11)
    public static final int method1857(int arg0, boolean arg1) {
        if (arg1) {
            field4351 = (class188) null;
        }
        field4348++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 24)
    public static void method1858(int arg0) {
        if (arg0 > -98) {
            field4349 = (class342) null;
        }
        field4351 = null;
        field4342 = null;
        field4349 = null;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V", line = 39)
    public class283() {
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lqd;)V", line = 50)
    public class283(class283 arg0) {
        this.field4347 = arg0.field4347;
        this.field4345 = arg0.field4345;
        this.field4344 = arg0.field4344;
        this.field4346 = arg0.field4346;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[IJZ)Ljava/lang/String;", line = 62)
    public static final String method1859(int arg0, int[] arg1, long arg2, boolean arg3) {
        if (!arg3) {
            return (String) null;
        }
        field4350++;
        if (class196.field2941 != null) {
            String var5 = class196.field2941.method32(arg1, arg2, arg0, -11);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg2);
    }
}
