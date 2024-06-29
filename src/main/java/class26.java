import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class26 {

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Lgj;")
    public class659 field259 = new class659();

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field261 = 0;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Z")
    public static boolean field262 = false;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Lgj;")
    private class659 field263;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field257;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)Lgj;", line = 3)
    public final class659 method146(byte arg0) {
        field255++;
        class659 var2 = this.field263;
        if (this.field259 == var2) {
            this.field263 = null;
            return null;
        }
        this.field263 = var2.field8885;
        if (arg0 != 97) {
            field261 = 54;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZLjava/lang/String;JIILjava/lang/String;JZIIIZ)V", line = 27)
    public static final void method147(int arg0, boolean arg1, String arg2, long arg3, int arg4, int arg5, String arg6, long arg7, boolean arg8, int arg9, int arg10, int arg11, boolean arg12) {
        field254++;
        if (!class677.field9075 && class269.field3929 < 500) {
            int var15 = arg10 == arg11 ? class2.field22 : arg11;
            class478 var16 = new class478(arg2, arg6, var15, arg4, arg0, arg3, arg9, arg5, arg1, arg12, arg7, arg8);
            class738.method4068(var16, (byte) -15);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", line = 44)
    public static final void method148(int arg0, String arg1, int arg2, String arg3, int arg4, String arg5, String arg6) {
        if (arg2 >= -61) {
            field257 = null;
        }
        field252++;
        class648.method3598(-1, arg1, arg0, null, arg4, arg5, -1, arg6, arg3);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 57)
    public static void method149(int arg0) {
        if (arg0 != -13971) {
            field261 = -76;
        }
        field257 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILgj;)V", line = 67)
    public final void method150(int arg0, class659 arg1) {
        field264++;
        if (arg1.field8887 != null) {
            arg1.method3659(1);
        }
        arg1.field8885 = this.field259;
        arg1.field8887 = this.field259.field8887;
        arg1.field8887.field8885 = arg1;
        if (arg0 == 0) {
            arg1.field8885.field8887 = arg1;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)I", line = 92)
    public final int method151(int arg0) {
        field251++;
        int var2 = 0;
        if (arg0 != 500) {
            return 8;
        }
        class659 var3 = this.field259.field8885;
        while (this.field259 != var3) {
            var3 = var3.field8885;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)Lgj;", line = 114)
    public final class659 method152(byte arg0) {
        field256++;
        if (arg0 != -13) {
            method147(-25, false, null, 80L, -86, -118, null, -80L, true, 3, 18, 1, true);
        }
        class659 var2 = this.field259.field8885;
        if (this.field259 == var2) {
            this.field263 = null;
            return null;
        } else {
            this.field263 = var2.field8885;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V", line = 137)
    public final void method153(int arg0) {
        field253++;
        while (true) {
            class659 var2 = this.field259.field8885;
            if (this.field259 == var2) {
                this.field263 = null;
                if (arg0 <= 24) {
                    field262 = false;
                    return;
                } else {
                    return;
                }
            }
            var2.method3659(1);
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)Ljava/lang/String;", line = 159)
    public static final String method154(int arg0) {
        field260++;
        if (arg0 < 53) {
            return null;
        } else if (class677.field9075 || class191.field2474 == null) {
            return "";
        } else if ((class191.field2474.field6720 == null || class191.field2474.field6720.length() == 0) && class191.field2474.field6704 != null && class191.field2474.field6704.length() > 0) {
            return class191.field2474.field6704;
        } else {
            return class191.field2474.field6720;
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)Lgj;", line = 183)
    public final class659 method155(int arg0) {
        if (arg0 <= 96) {
            return null;
        }
        field258++;
        class659 var2 = this.field259.field8885;
        if (this.field259 == var2) {
            return null;
        } else {
            var2.method3659(1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 212)
    public class26() {
        this.field259.field8885 = this.field259;
        this.field259.field8887 = this.field259;
    }
}
