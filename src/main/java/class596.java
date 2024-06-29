import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class596 extends class107 {

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field8352;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Lsia;")
    private class767 field8355;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Lnj;")
    private class260 field8359;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field8354 = 0;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field8350;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field8351;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V", line = 5)
    public static final void method3394(int arg0) {
        field8350++;
        if (arg0 == 9) {
            class633.field8768 = true;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V", line = 18)
    public final void method917(int arg0) {
        field8357++;
        int var2 = -48 % ((69 - arg0) / 38);
        try {
            this.field8352.close();
        } catch (IOException var3) {
        }
        this.field8355.method4224((byte) 125);
        this.field8359.method1690(-1);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB[BI)I", line = 33)
    public final int method922(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field8360++;
        return arg1 == -65 ? this.field8355.method4222((byte) -85, arg2, arg0, arg3) : -77;
    }

    @OriginalMember(owner = "client!hj", name = "finalize", descriptor = "()V", line = 51)
    protected final void finalize() {
        field8356++;
        this.method917(-1);
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 59)
    public class596(Socket arg0, int arg1) throws IOException {
        this.field8352 = arg0;
        this.field8352.setSoTimeout(30000);
        this.field8352.setTcpNoDelay(true);
        this.field8355 = new class767(this.field8352.getInputStream(), arg1);
        this.field8359 = new class260(this.field8352.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)Z", line = 71)
    public final boolean method921(boolean arg0, int arg1) throws IOException {
        if (!arg0) {
            field8354 = 34;
        }
        field8353++;
        return this.field8355.method4221(arg1, -1);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)V", line = 82)
    public static final void method3395(int arg0, byte arg1) {
        field8362++;
        if (arg1 > 87) {
            class281 var2 = class54.method395((byte) -53, (long) arg0, 9);
            var2.method1818((byte) 93);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 96)
    public final void method916(int arg0) {
        field8351++;
        this.field8355.method4226(-116);
        if (arg0 != 38) {
            this.method917(25);
        }
        this.field8359.method1691((byte) 55);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZZIIIJLjava/lang/String;ILjava/lang/String;JBZI)V", line = 111)
    public static final void method3396(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, long arg5, String arg6, int arg7, String arg8, long arg9, byte arg10, boolean arg11, int arg12) {
        field8358++;
        if (class611.field8532 || class690.field9574 >= 500) {
            return;
        }
        if (arg10 != 34) {
            method3394(108);
        }
        int var15 = arg3 == -1 ? class335.field4516 : arg3;
        class534 var16 = new class534(arg8, arg6, var15, arg7, arg2, arg5, arg12, arg4, arg0, arg11, arg9, arg1);
        class14.method78(var16, 116);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZILmfa;IFIFFFF[BII)V", line = 130)
    public static final void method3397(boolean arg0, int arg1, class643 arg2, int arg3, float arg4, int arg5, float arg6, float arg7, float arg8, float arg9, byte[] arg10, int arg11, int arg12) {
        int var13 = 0;
        if (!arg0) {
            return;
        }
        while (var13 < arg5) {
            class255.method1675(arg11, arg12, arg8, arg3, var13, arg5, arg2, arg4, 2, arg6, arg7, arg1, arg10, arg9);
            arg12 += arg3 * arg11;
            var13++;
        }
        field8361++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II[BI)V", line = 150)
    public final void method919(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field8363++;
        if (arg1 != 8) {
            this.field8355 = null;
        }
        this.field8359.method1693(arg2, arg0, (byte) -33, arg3);
    }
}
