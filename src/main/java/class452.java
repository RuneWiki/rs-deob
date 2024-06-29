import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class452 extends class115 {

    @OriginalMember(owner = "client!jea", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field6678;

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "Laaa;")
    private class619 field6674;

    @OriginalMember(owner = "client!jea", name = "n", descriptor = "Lhw;")
    private class131 field6677;

    @OriginalMember(owner = "client!jea", name = "p", descriptor = "Lmia;")
    public static class63 field6679 = new class63(43, 3);

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!jea", name = "l", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!jea", name = "q", descriptor = "J")
    public static long field6680;

    @OriginalMember(owner = "client!jea", name = "r", descriptor = "[Lpga;")
    public static class536[] field6681;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I[BII)I", line = 3)
    public final int method853(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != 4) {
            this.finalize();
        }
        field6676++;
        return this.field6674.method3565(arg3, arg2, arg1, (byte) -127);
    }

    @OriginalMember(owner = "client!jea", name = "finalize", descriptor = "()V", line = 14)
    protected final void finalize() {
        this.method850(2);
        field6671++;
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(Z)V", line = 24)
    public static void method2771(boolean arg0) {
        if (arg0) {
            method2771(false);
        }
        field6679 = null;
        field6681 = null;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IZ)Z", line = 39)
    public final boolean method852(int arg0, boolean arg1) throws IOException {
        if (arg1) {
            return true;
        } else {
            field6672++;
            return this.field6674.method3566(97, arg0);
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)V", line = 51)
    public final void method846(boolean arg0) {
        field6669++;
        this.field6674.method3564((byte) -70);
        if (!arg0) {
            this.finalize();
        }
        this.field6677.method928(5);
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V", line = 63)
    public final void method850(int arg0) {
        field6673++;
        if (arg0 != 2) {
            return;
        }
        try {
            this.field6678.close();
        } catch (IOException var2) {
        }
        this.field6674.method3563((byte) -37);
        this.field6677.method933(false);
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 81)
    public static final String method2772(String arg0, int arg1) {
        if (arg1 != 3) {
            method2772(null, 124);
        }
        field6670++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 131)
    public class452(Socket arg0, int arg1) throws IOException {
        this.field6678 = arg0;
        this.field6678.setSoTimeout(30000);
        this.field6678.setTcpNoDelay(true);
        this.field6674 = new class619(this.field6678.getInputStream(), arg1);
        this.field6677 = new class131(this.field6678.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I[BII)V", line = 143)
    public final void method849(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6675++;
        if (arg3 != -6197) {
            method2771(true);
        }
        this.field6677.method927(arg0, arg2, arg1, (byte) -89);
    }
}
