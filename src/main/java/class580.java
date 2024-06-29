import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class580 extends class605 {

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field8075;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "Lwl;")
    private class623 field8082;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "Lko;")
    private class241 field8072;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field8073 = 0;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "Lgo;")
    public static class377 field8074 = class181.method1110(256);

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "I")
    public static int field8079;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "I")
    public static int field8080;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "Lkr;")
    public static class329 field8084;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIB[B)V")
    public final void method3265(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        this.field8072.method1501(arg0, -1, arg1, arg3);
        if (arg2 > 61) {
            field8076++;
        }
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(B)V")
    public static void method3266(byte arg0) {
        field8074 = null;
        if (arg0 != -117) {
            method3266((byte) 70);
        }
        field8084 = null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(III[B)I")
    public final int method3267(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field8080++;
        return arg0 == -25750 ? this.field8082.method3598(arg3, (byte) 28, arg2, arg1) : 107;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)V")
    public static final void method3268(boolean arg0) {
        if (arg0) {
            class199.field2605 = class319.field4403;
            class501.field6947 = class353.field4949;
        } else {
            class199.field2605 = class497.field6933;
            class501.field6947 = class50.field672;
        }
        class183.field2341 = class199.field2605.length;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
    public final void method3269(byte arg0) {
        field8079++;
        this.field8082.method3591(121);
        this.field8072.method1498(64);
        if (arg0 != 63) {
            field8074 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field8078++;
        this.method3271((byte) 110);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)Z")
    public final boolean method3270(int arg0, int arg1) throws IOException {
        int var3 = 20 / ((-arg0 - 46) / 43);
        field8077++;
        return this.field8082.method3596(arg1, -1);
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)V")
    public final void method3271(byte arg0) {
        try {
            this.field8075.close();
        } catch (IOException var2) {
        }
        field8081++;
        if (arg0 != 110) {
            this.method3269((byte) -5);
        }
        this.field8082.method3597((byte) 31);
        this.field8072.method1499((byte) 107);
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class580(Socket arg0, int arg1) throws IOException {
        this.field8075 = arg0;
        this.field8075.setSoTimeout(30000);
        this.field8075.setTcpNoDelay(true);
        this.field8082 = new class623(this.field8075.getInputStream(), arg1);
        this.field8072 = new class241(this.field8075.getOutputStream(), arg1);
    }
}
