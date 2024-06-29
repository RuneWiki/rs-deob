import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class345 extends class192 {

    @OriginalMember(owner = "client!up", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field5021;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "Lue;")
    private class453 field5030;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "Ltr;")
    private class309 field5031;

    @OriginalMember(owner = "client!up", name = "l", descriptor = "[B")
    public static byte[] field5029 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "Low;")
    public static class89 field5023;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I[BII)I")
    public final int method1248(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg2 < 33) {
            field5029 = null;
        }
        field5027++;
        return this.field5030.method2727(arg0, arg3, 7041, arg1);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "([BIII)V")
    public final void method1243(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        this.field5031.method1898(arg1, arg0, arg2, arg3 ^ 0xFFFF92DC);
        if (arg3 != -27985) {
            method2125(-58);
        }
        field5032++;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)Z")
    public final boolean method1246(int arg0, int arg1) throws IOException {
        field5025++;
        if (arg1 != -25354) {
            method2125(-41);
        }
        return this.field5030.method2729(arg0, (byte) 125);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIBI)V")
    public static final void method2124(int arg0, int arg1, byte arg2, int arg3) {
        field5028++;
        if (arg2 != -30) {
            method2125(2);
        }
        int var4 = class94.field1158.field280 * arg3 >> 8;
        if (arg1 == -1 && !class579.field8531) {
            class232.method1514(false);
        } else if (arg1 != -1 && (class17.field155 != arg1 || !class188.method1229((byte) -64)) && var4 != 0 && !class579.field8531) {
            class281.method1770(false, arg1, var4, class524.field7765, arg0, false, 0);
        }
        class17.field155 = arg1;
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
    public static void method2125(int arg0) {
        field5029 = null;
        field5023 = null;
        int var1 = 123 / ((32 - arg0) / 63);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
    public final void method1244(int arg0) {
        field5020++;
        this.field5030.method2726(127);
        if (arg0 != 0) {
            this.field5031 = null;
        }
        this.field5031.method1897((byte) -20);
    }

    @OriginalMember(owner = "client!up", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field5024++;
        this.method1247((byte) 124);
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(B)V")
    public final void method1247(byte arg0) {
        field5022++;
        try {
            this.field5021.close();
        } catch (IOException var2) {
        }
        if (arg0 > 44) {
            this.field5030.method2725(0);
            this.field5031.method1900(1);
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class345(Socket arg0, int arg1) throws IOException {
        this.field5021 = arg0;
        this.field5021.setSoTimeout(30000);
        this.field5021.setTcpNoDelay(true);
        this.field5030 = new class453(this.field5021.getInputStream(), arg1);
        this.field5031 = new class309(this.field5021.getOutputStream(), arg1);
    }
}
