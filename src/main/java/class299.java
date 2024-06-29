import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class299 extends class426 {

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field4108;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "Lgo;")
    private class536 field4101;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "Luba;")
    private class365 field4102;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public static int field4105 = 0;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!jp", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4104++;
        this.method1830(-119);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(III[B)V")
    public final void method1829(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field4103++;
        if (arg1 != 82) {
            this.finalize();
        }
        this.field4102.method2198(arg2, arg3, arg0, (byte) -75);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    public final void method1830(int arg0) {
        try {
            this.field4108.close();
        } catch (IOException var3) {
        }
        field4106++;
        this.field4101.method3248(-1);
        this.field4102.method2197(-1);
        int var2 = -120 / ((-arg0 - 59) / 59);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZI)Z")
    public final boolean method1831(boolean arg0, int arg1) throws IOException {
        field4109++;
        if (arg0) {
            this.field4101 = null;
        }
        return this.field4101.method3249(-103, arg1);
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V")
    public final void method1832(byte arg0) {
        field4100++;
        this.field4101.method3250((byte) -108);
        if (arg0 == -121) {
            this.field4102.method2196((byte) -105);
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class299(Socket arg0, int arg1) throws IOException {
        this.field4108 = arg0;
        this.field4108.setSoTimeout(30000);
        this.field4108.setTcpNoDelay(true);
        this.field4101 = new class536(this.field4108.getInputStream(), arg1);
        this.field4102 = new class365(this.field4108.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB[BI)I")
    public final int method1833(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field4099++;
        return arg1 == 3 ? this.field4101.method3245(arg3, arg0, (byte) 120, arg2) : -110;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIZ)V")
    public static final void method1834(int arg0, int arg1, boolean arg2) {
        field4107++;
        if (arg1 != 30000) {
            field4105 = 34;
        }
        class38 var3 = class487.method2920(arg2, arg1 - 16007, arg0);
        if (var3 != null) {
            var3.method2457(-8422);
        }
    }
}
