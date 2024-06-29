import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class446 {

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public int field5821 = class346.method2009((byte) -70);

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public int field5830;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "Ljava/lang/String;")
    public String field5823;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "Ljava/lang/String;")
    public String field5832;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Ljava/lang/String;")
    public String field5828;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "Ljava/lang/String;")
    public String field5825;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    public int field5835;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "Ljava/lang/String;")
    public String field5829;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public int field5833;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public int field5827;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "Lrn;")
    public static class633 field5819 = new class633(13, 4);

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V")
    public final void method2552(String arg0, String arg1, int arg2, String arg3, int arg4, int arg5, String arg6, String arg7, int arg8) {
        this.field5821 = class346.method2009((byte) -70);
        field5824++;
        this.field5833 = arg2;
        this.field5827 = class693.field8900;
        this.field5835 = arg4;
        if (arg5 != 27932) {
            return;
        }
        this.field5823 = arg1;
        this.field5830 = arg8;
        this.field5828 = arg3;
        this.field5829 = arg7;
        this.field5832 = arg6;
        this.field5825 = arg0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V")
    public static void method2553(boolean arg0) {
        field5819 = null;
        if (arg0) {
            field5819 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB[Ljava/awt/Rectangle;)V")
    public static final void method2554(int arg0, byte arg1, Rectangle[] arg2) throws class15 {
        if (arg1 > -99) {
            field5819 = null;
        }
        if (class596.field7567 == 1) {
            class699.field9263.method931(arg2, arg0, class340.field4159, class329.field4033);
        } else {
            class699.field9263.method931(arg2, arg0, 0, 0);
        }
        field5820++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIBII)V")
    public static final void method2555(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (class498.field6390 <= arg5 && class30.field274 >= arg6 && class80.field1131 <= arg2 && arg0 <= class405.field5375) {
            if (arg1 == 1) {
                class659.method3590(arg3, arg5, arg6, 260, arg2, arg0);
            } else {
                class120.method712(arg5, arg3, arg0, arg1, arg6, arg2, -109);
            }
        } else if (arg1 == 1) {
            class154.method873(arg3, arg2, arg0, arg6, true, arg5);
        } else {
            class283.method1730((byte) -109, arg5, arg3, arg0, arg1, arg2, arg6);
        }
        field5831++;
        if (arg4 > -22) {
            method2557(43, 53, null, 62);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public static final void method2556(int arg0) {
        class282.field3647++;
        field5822++;
        class13 var1 = class659.method3587(class68.field909, arg0 + 98, class302.field3815);
        var1.field130.method1491(arg0 ^ 0xFFFFFF7F, class400.method2313((byte) -101));
        var1.field130.method1541(374, class372.field4550);
        var1.field130.method1541(arg0 + 374, class463.field6021);
        var1.field130.method1491(arg0 - 129, class485.field6252.field6939.method3350(false));
        class116.method679(var1, arg0);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II[BI)[B")
    public static final byte[] method2557(int arg0, int arg1, byte[] arg2, int arg3) {
        field5834++;
        if (arg1 <= 124) {
            return null;
        } else {
            byte[] var4 = new byte[arg3];
            class642.method3480(arg2, arg0, var4, 0, arg3);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2558(String arg0, String arg1, String arg2, int arg3) {
        field5826++;
        if (arg3 == -21295) {
            for (int var4 = arg0.indexOf(arg1); var4 != -1; var4 = arg0.indexOf(arg1, arg2.length() + var4)) {
                arg0 = arg0.substring(0, var4) + arg2 + arg0.substring(var4 + arg1.length());
            }
            return arg0;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class446(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field5830 = arg6;
        this.field5823 = arg5;
        this.field5832 = arg2;
        this.field5828 = arg3;
        this.field5825 = arg7;
        this.field5835 = arg1;
        this.field5829 = arg4;
        this.field5833 = arg0;
        this.field5827 = class693.field8900;
    }
}
