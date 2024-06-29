import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class306 extends class338 {

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public int field4144;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field4146 = 0;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBLjava/lang/String;Llh;)Ldj;", line = 6)
    public static final class304 method1797(int arg0, byte arg1, String arg2, class450 arg3) {
        field4147++;
        if (arg0 == 0) {
            return arg3.method2777((byte) -36, arg2);
        } else if (arg0 == 1) {
            try {
                class245.method1311(new Object[] { (new URL(arg3.field6532.getCodeBase(), arg2)).toString() }, "openjs", 3953, arg3.field6532);
                class304 var4 = new class304();
                var4.field4123 = 1;
                return var4;
            } catch (Throwable var10) {
                class304 var5 = new class304();
                var5.field4123 = 2;
                return var5;
            }
        } else {
            if (arg1 < 29) {
                field4143 = 107;
            }
            if (arg0 == 2) {
                try {
                    arg3.field6532.getAppletContext().showDocument(new URL(arg3.field6532.getCodeBase(), arg2), "_blank");
                    class304 var6 = new class304();
                    var6.field4123 = 1;
                    return var6;
                } catch (Exception var11) {
                    class304 var7 = new class304();
                    var7.field4123 = 2;
                    return var7;
                }
            } else if (arg0 == 3) {
                try {
                    class245.method1313(arg3.field6532, (byte) -121, "loggedout");
                } catch (Throwable var13) {
                }
                try {
                    arg3.field6532.getAppletContext().showDocument(new URL(arg3.field6532.getCodeBase(), arg2), "_top");
                    class304 var8 = new class304();
                    var8.field4123 = 1;
                    return var8;
                } catch (Exception var12) {
                    class304 var9 = new class304();
                    var9.field4123 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Z", line = 84)
    public static final boolean method1798(int arg0, int arg1) {
        if (arg1 != 9055) {
            field4143 = -54;
        }
        field4145++;
        if (arg0 == 28 || arg0 == 34 || arg0 == 39 || arg0 == 6 || arg0 == 57) {
            return true;
        } else if (arg0 == 29 || arg0 == 60 || arg0 == 1003) {
            return true;
        } else if (arg0 == 15 || arg0 == 32 || arg0 == 5 || arg0 == 13 || arg0 == 1) {
            return true;
        } else {
            return arg0 == 51 || arg0 == 59 || arg0 == 1001 || arg0 == 16;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lam;Lbf;Lam;I)V", line = 112)
    public static final void method1799(class286 arg0, class326 arg1, class286 arg2, int arg3) {
        class272.field3683 = arg0;
        class106.field1312 = arg2;
        class428.field6291 = arg1;
        field4148++;
        if (arg3 != 1) {
            return;
        }
        if (class272.field3683 != null) {
            class263.field3599 = class272.field3683.method1691(1, 0);
        }
        if (class106.field1312 != null) {
            class429.field6294 = class106.field1312.method1691(1, 0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(II)V", line = 132)
    public class306(int arg0, int arg1) {
        this.field4144 = arg0;
        this.field4142 = arg1;
    }
}
