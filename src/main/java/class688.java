import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class688 extends class23 {

    @OriginalMember(owner = "client!bca", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field9204;

    @OriginalMember(owner = "client!bca", name = "h", descriptor = "Lnfa;")
    private class706 field9197;

    @OriginalMember(owner = "client!bca", name = "p", descriptor = "Lqs;")
    private class628 field9205;

    @OriginalMember(owner = "client!bca", name = "i", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!bca", name = "m", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!bca", name = "n", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!bca", name = "q", descriptor = "I")
    public static int field9206;

    @OriginalMember(owner = "client!bca", name = "r", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "Lcr;")
    public static class598 field9200;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BI)Z", line = 3)
    public final boolean method133(byte arg0, int arg1) throws IOException {
        field9199++;
        if (arg0 != 77) {
            field9200 = null;
        }
        return this.field9197.method3923(-120, arg1);
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IB[BI)V", line = 16)
    public final void method137(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        this.field9205.method3472(arg2, -8990, arg0, arg3);
        if (arg1 <= 54) {
            method3773((byte) -15);
        }
        field9202++;
    }

    @OriginalMember(owner = "client!bca", name = "finalize", descriptor = "()V", line = 29)
    protected final void finalize() {
        this.method138(-66);
        field9201++;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BI[BI)I", line = 37)
    public final int method135(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 == -74) {
            field9207++;
            return this.field9197.method3922(arg3, arg1, -112, arg2);
        } else {
            return -108;
        }
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(B)V", line = 48)
    public static void method3773(byte arg0) {
        if (arg0 <= -113) {
            field9200 = null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)Z", line = 59)
    public static final boolean method3774(int arg0, int arg1, int arg2) {
        if (arg2 != 1024) {
            field9200 = null;
        }
        field9206++;
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V", line = 74)
    public final void method136(int arg0) {
        int var2 = -107 % ((-arg0 - 31) / 36);
        field9198++;
        this.field9197.method3925(-111);
        this.field9205.method3469(89);
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)V", line = 85)
    public final void method138(int arg0) {
        try {
            this.field9204.close();
        } catch (IOException var2) {
        }
        field9203++;
        if (arg0 >= -12) {
            method3773((byte) 9);
        }
        this.field9197.method3926((byte) 90);
        this.field9205.method3470(1);
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 103)
    public class688(Socket arg0, int arg1) throws IOException {
        this.field9204 = arg0;
        this.field9204.setSoTimeout(30000);
        this.field9204.setTcpNoDelay(true);
        this.field9197 = new class706(this.field9204.getInputStream(), arg1);
        this.field9205 = new class628(this.field9204.getOutputStream(), arg1);
    }
}
