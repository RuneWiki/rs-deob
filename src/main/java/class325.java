import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class325 {

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field4740 = 0;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILcr;Ljava/awt/Component;II)Lfl;", line = 6)
    public static final class648 method2085(int arg0, class112 arg1, Component arg2, int arg3, int arg4) {
        field4739++;
        if (class519.field7166 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class648 var5 = (class648) Class.forName("cda").getDeclaredConstructor().newInstance();
                var5.field9179 = arg0;
                var5.field9158 = new int[(class129.field1643 ? 2 : 1) * 256];
                var5.method469(arg2);
                var5.field9185 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field9185 > 16384) {
                    var5.field9185 = 16384;
                }
                var5.method465(var5.field9185);
                if (class553.field7560 > 0 && class357.field5184 == null) {
                    class357.field5184 = new class267();
                    class357.field5184.field3665 = arg1;
                    arg1.method612(class553.field7560, class357.field5184, (byte) 84);
                }
                if (class357.field5184 != null) {
                    if (class357.field5184.field3660[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class357.field5184.field3660[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                if (arg3 < 24) {
                    field4740 = -115;
                }
                try {
                    class435 var6 = new class435(arg1, arg4);
                    var6.field9179 = arg0;
                    var6.field9158 = new int[(class129.field1643 ? 2 : 1) * 256];
                    var6.method469(arg2);
                    var6.field9185 = 16384;
                    var6.method465(var6.field9185);
                    if (class553.field7560 > 0 && class357.field5184 == null) {
                        class357.field5184 = new class267();
                        class357.field5184.field3665 = arg1;
                        arg1.method612(class553.field7560, class357.field5184, (byte) 127);
                    }
                    if (class357.field5184 != null) {
                        if (class357.field5184.field3660[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class357.field5184.field3660[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class648();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIILrq;I)V", line = 94)
    public static final void method2086(int arg0, int arg1, int arg2, int arg3, int arg4, class39 arg5, int arg6) {
        if (arg3 <= 52) {
            method2087(100, -82, 71);
        }
        field4737++;
        class93.method519(0, arg0, arg1, arg2, arg5.field3925, arg5.field3929, arg6, arg4, arg5.field3917, (byte) 98);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(III)Z", line = 109)
    public static final boolean method2087(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            field4738++;
            return (arg2 & 0x800) != 0;
        } else {
            return false;
        }
    }
}
