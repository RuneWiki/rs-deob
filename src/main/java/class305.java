import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class305 extends class238 {

    @OriginalMember(owner = "client!caa", name = "q", descriptor = "Ljava/net/Socket;")
    private Socket field4140;

    @OriginalMember(owner = "client!caa", name = "p", descriptor = "Lik;")
    private class211 field4139;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "Lst;")
    private class436 field4131;

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!caa", name = "n", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!caa", name = "o", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V")
    public static final void method1844(byte arg0) {
        field4135++;
        if (arg0 != -23) {
            field4129 = -121;
        }
        class729.field10176.method562(1);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
    public final void method1436(int arg0) {
        this.field4139.method1176((byte) 126);
        if (arg0 != -1) {
            this.field4131 = null;
        }
        field4133++;
        this.field4131.method2473(true);
    }

    @OriginalMember(owner = "client!caa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1439(-17);
        field4130++;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "([BIII)I")
    public final int method1440(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field4134++;
        if (arg2 != 2047) {
            this.method1436(38);
        }
        return this.field4139.method1178(arg1, arg0, arg3, (byte) 59);
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
    public final void method1439(int arg0) {
        field4132++;
        try {
            if (arg0 >= -3) {
                this.field4140 = null;
            }
            this.field4140.close();
        } catch (IOException var2) {
        }
        this.field4139.method1177(85);
        this.field4131.method2476((byte) -117);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(II[BI)V")
    public final void method1434(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4138++;
        if (arg0 != -24305) {
            this.method1436(-21);
        }
        this.field4131.method2475(arg3, arg1, arg2, arg0 ^ 0x5EF4);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)Z")
    public final boolean method1435(int arg0, int arg1) throws IOException {
        if (arg0 != -1949) {
            method1844((byte) 112);
        }
        field4137++;
        return this.field4139.method1179(arg1, (byte) -124);
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class305(Socket arg0, int arg1) throws IOException {
        this.field4140 = arg0;
        this.field4140.setSoTimeout(30000);
        this.field4140.setTcpNoDelay(true);
        this.field4139 = new class211(this.field4140.getInputStream(), arg1);
        this.field4131 = new class436(this.field4140.getOutputStream(), arg1);
    }
}
