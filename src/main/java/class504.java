import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class504 extends class457 {

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Ljava/net/Socket;")
    private Socket field6289;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "Loo;")
    private class585 field6292;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lvn;")
    private class291 field6283;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "[Lmc;")
    public static class124[] field6294 = new class124[300];

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Ltr;")
    public static class273 field6287;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2750(String arg0, int arg1) {
        field6291++;
        if (arg1 != 10) {
            method2750(null, 110);
        }
        return class253.method1530(8042, true, 10, arg0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BII[B)I")
    public final int method2513(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 >= -104) {
            this.finalize();
        }
        field6284++;
        return this.field6292.method3243(arg3, -1, arg1, arg2);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[BIB)V")
    public final void method2515(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        int var5 = 74 / ((arg3 + 10) / 49);
        field6288++;
        this.field6283.method1747(arg2, arg0, (byte) 79, arg1);
    }

    @OriginalMember(owner = "client!rc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field6290++;
        this.method2511((byte) -115);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public final void method2511(byte arg0) {
        int var2 = -24 % ((arg0 - 1) / 35);
        field6293++;
        try {
            this.field6289.close();
        } catch (IOException var3) {
        }
        this.field6292.method3246(-94);
        this.field6283.method1748((byte) 127);
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
    public static void method2751(byte arg0) {
        field6294 = null;
        if (arg0 >= 97) {
            field6287 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public final void method2518(int arg0) {
        if (arg0 != 0) {
            this.finalize();
        }
        this.field6292.method3245(117);
        field6282++;
        this.field6283.method1745((byte) 90);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class504(Socket arg0, int arg1) throws IOException {
        this.field6289 = arg0;
        this.field6289.setSoTimeout(30000);
        this.field6289.setTcpNoDelay(true);
        this.field6292 = new class585(this.field6289.getInputStream(), arg1);
        this.field6283 = new class291(this.field6289.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z")
    public final boolean method2514(int arg0, int arg1) throws IOException {
        if (arg0 == -1) {
            field6286++;
            return this.field6292.method3247(arg1, arg0 ^ 0x3A55);
        } else {
            return true;
        }
    }
}
