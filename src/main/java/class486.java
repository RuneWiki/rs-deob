import java.applet.Applet;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class486 extends class80 {

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Ljava/net/Socket;")
    private Socket field6572;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Ltg;")
    private class215 field6575;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "Lnd;")
    private class510 field6577;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Ljava/applet/Applet;")
    public static Applet field6574;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILr;)V")
    public static final void method2721(int arg0, int arg1, class170 arg2) {
        if (class684.field9622) {
            arg0 = 0;
            class684.field9622 = false;
        }
        field6576++;
        if (class642.field8623 == null || !class642.field8623.method1160(245, arg2)) {
            class642.field8623 = arg2;
            class210.field2997 = class681.method3802(-23600);
            class583.field7739 = arg0;
            class300.field4196 = arg0;
            if (class300.field4196 == 0) {
                class169.method1154(111);
            } else {
                class2.field21 = class526.field7010;
                class456.field6196 = class30.field484;
                class415.field5679 = class38.field575;
                class681.field9601 = class127.field2137;
                class194.field2840 = class417.field5708;
                class90.field1375 = class58.field825;
                class319.field4370 = class296.field4182;
                class191.field2813 = class456.field6197;
                class235.field3315 = class247.field3444;
                class651.field8815 = class680.field9591;
            }
        }
        if (arg1 != -31417) {
            field6574 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III[B)I")
    public final int method632(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field6581++;
        return arg0 > -21 ? 2 : this.field6575.method1375(arg2, arg1, 69, arg3);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Z")
    public final boolean method635(int arg0, int arg1) throws IOException {
        int var3 = 126 % ((15 - arg1) / 59);
        field6580++;
        return this.field6575.method1376(119, arg0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public final void method633(int arg0) {
        try {
            this.field6572.close();
            if (arg0 != 9) {
                field6582 = -70;
            }
        } catch (IOException var2) {
        }
        field6579++;
        this.field6575.method1372(arg0 ^ 0xFFFFFFF6);
        this.field6577.method2831((byte) -71);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IJ)V")
    public static final void method2722(int arg0, long arg1) {
        field6570++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == (long) arg0) {
            class51.method347(arg1 - 1L, 22);
            class51.method347(1L, 93);
        } else {
            class51.method347(arg1, 66);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lw;III[Z)Z")
    public static final boolean method2723(class276 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class467.field6283 != class218.field3099) {
            int var6 = class684.field9625[arg1].method200(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class139 var8 = class684.field9625[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method200(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method203(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method198(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method633(9);
        field6578++;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public final void method634(int arg0) {
        this.field6575.method1373((byte) 113);
        field6573++;
        this.field6577.method2829(1);
        int var2 = 107 % ((arg0 + 82) / 44);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([BZII)V")
    public final void method631(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        if (!arg1) {
            this.field6577.method2834(arg3, arg0, true, arg2);
            field6571++;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static void method2724(byte arg0) {
        field6574 = null;
        int var1 = 13 / ((arg0 + 12) / 43);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class486(Socket arg0, int arg1) throws IOException {
        this.field6572 = arg0;
        this.field6572.setSoTimeout(30000);
        this.field6572.setTcpNoDelay(true);
        this.field6575 = new class215(this.field6572.getInputStream(), arg1);
        this.field6577 = new class510(this.field6572.getOutputStream(), arg1);
    }
}
