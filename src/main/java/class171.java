import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class171 extends class576 {

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "Ljava/net/Socket;")
    private Socket field2439;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "Ldfa;")
    private class387 field2432;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "Ltb;")
    private class446 field2440;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "[Lcj;")
    public static class174[] field2433 = new class174[6];

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "[[I")
    public static int[][] field2434 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B[BII)I")
    public final int method1160(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 >= -22) {
            return -105;
        } else {
            field2436++;
            return this.field2432.method2215(false, arg2, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public final void method1161(byte arg0) {
        field2438++;
        this.field2432.method2214((byte) -121);
        if (arg0 > -44) {
            this.finalize();
        }
        this.field2440.method2513(-1);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(II)V")
    public static final void method1162(int arg0, int arg1) {
        field2429++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        if (arg1 <= 62) {
            method1162(82, 18);
        }
        class310.field4194 = arg0;
        class163.field2347 = new class514[class16.field218[class310.field4194] + 1];
        class348.field4634 = 0;
        class308.field4139 = 0;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)Z")
    public final boolean method1163(int arg0, int arg1) throws IOException {
        field2435++;
        int var3 = -55 / ((-arg0 - 87) / 36);
        return this.field2432.method2216((byte) 55, arg1);
    }

    @OriginalMember(owner = "client!dq", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1164(62);
        field2431++;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public final void method1164(int arg0) {
        try {
            this.field2439.close();
        } catch (IOException var2) {
        }
        field2437++;
        if (arg0 <= 53) {
            method1166(93);
        }
        this.field2432.method2217(33);
        this.field2440.method2516(true);
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class171(Socket arg0, int arg1) throws IOException {
        this.field2439 = arg0;
        this.field2439.setSoTimeout(30000);
        this.field2439.setTcpNoDelay(true);
        this.field2432 = new class387(this.field2439.getInputStream(), arg1);
        this.field2440 = new class446(this.field2439.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IBI[B)V")
    public final void method1165(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = -90 / ((21 - arg1) / 50);
        this.field2440.method2515(arg3, arg2, arg0, (byte) 59);
        field2430++;
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V")
    public static void method1166(int arg0) {
        field2433 = null;
        field2434 = null;
        if (arg0 != 19213) {
            method1166(-117);
        }
    }
}
