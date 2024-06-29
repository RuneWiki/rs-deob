import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class525 extends class727 {

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field7185;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Lqh;")
    private class74 field7183;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Lfq;")
    private class214 field7188;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Ljava/lang/String;")
    public static String field7190 = null;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "J")
    public static long field7191 = 0L;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "F")
    public static float field7189;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Lsca;")
    public static class49 field7184;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III[B)V", line = 7)
    public final void method3024(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg2 != 55) {
            this.field7188 = null;
        }
        this.field7188.method1417(arg0, arg3, 0, arg1);
        field7187++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Z", line = 19)
    public final boolean method3025(int arg0, int arg1) throws IOException {
        if (arg1 != 55) {
            this.method3029(-40);
        }
        field7186++;
        return this.field7183.method662(0, arg0);
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V", line = 31)
    public static void method3026(int arg0) {
        if (arg0 != 30000) {
            field7190 = null;
        }
        field7190 = null;
        field7184 = null;
    }

    @OriginalMember(owner = "client!pi", name = "finalize", descriptor = "()V", line = 43)
    protected final void finalize() {
        this.method3027(2);
        field7195++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 53)
    public final void method3027(int arg0) {
        try {
            this.field7185.close();
        } catch (IOException var2) {
        }
        if (arg0 != 2) {
            this.method3029(103);
        }
        field7193++;
        this.field7183.method659(false);
        this.field7188.method1416((byte) 40);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[BI)I", line = 73)
    public final int method3028(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field7192++;
        int var5 = -14 / ((10 - arg0) / 58);
        return this.field7183.method664(arg3, arg1, arg2, (byte) -110);
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 90)
    public final void method3029(int arg0) {
        this.field7183.method658(1160472800);
        field7194++;
        if (arg0 < -71) {
            this.field7188.method1418(-56);
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 102)
    public class525(Socket arg0, int arg1) throws IOException {
        this.field7185 = arg0;
        this.field7185.setSoTimeout(30000);
        this.field7185.setTcpNoDelay(true);
        this.field7183 = new class74(this.field7185.getInputStream(), arg1);
        this.field7188 = new class214(this.field7185.getOutputStream(), arg1);
    }
}
