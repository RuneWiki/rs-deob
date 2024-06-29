import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class439 extends class20 {

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Ljava/net/Socket;")
    private Socket field6093;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Lvea;")
    private class339 field6094;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Ldu;")
    private class425 field6090;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field6092 = 0;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lsv;")
    public static class570 field6096 = new class570(4, -1);

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Lhga;")
    public static class197 field6100;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public final void method182(int arg0) {
        field6097++;
        this.field6094.method2070(arg0 - 108);
        this.field6090.method2498(25860);
        if (arg0 != -1) {
            method2610(-109, -43, 16);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
    public final boolean method186(int arg0, int arg1) throws IOException {
        if (arg1 > -91) {
            this.field6094 = null;
        }
        field6086++;
        return this.field6094.method2072(arg0, 10033);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B[BII)V")
    public final void method181(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        this.field6090.method2497(arg1, arg2, -1, arg3);
        field6089++;
        if (arg0 >= -110) {
            this.field6094 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Ldc;")
    public static final class336 method2610(int arg0, int arg1, int arg2) {
        class172 var3 = class514.field7096[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class336 var4 = var3.field2603;
            var3.field2603 = null;
            class347.method2117(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method2611(int arg0, String arg1) {
        field6095++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != 8348) {
            field6100 = null;
        }
        for (int var2 = 0; var2 < class458.field6267; var2++) {
            if (arg1.equalsIgnoreCase(class460.field6286[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class482.field6621[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field6091++;
        this.method183((byte) 88);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[BII)I")
    public final int method185(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg3 > -18) {
            return -7;
        } else {
            field6087++;
            return this.field6094.method2075(arg0, arg1, arg2, (byte) -99);
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class439(Socket arg0, int arg1) throws IOException {
        this.field6093 = arg0;
        this.field6093.setSoTimeout(30000);
        this.field6093.setTcpNoDelay(true);
        this.field6094 = new class339(this.field6093.getInputStream(), arg1);
        this.field6090 = new class425(this.field6093.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
    public static void method2612(int arg0) {
        field6096 = null;
        int var1 = 106 / ((-arg0 - 27) / 34);
        field6100 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public final void method183(byte arg0) {
        field6088++;
        try {
            if (arg0 != 88) {
                field6100 = null;
            }
            this.field6093.close();
        } catch (IOException var2) {
        }
        this.field6094.method2074(false);
        this.field6090.method2501(arg0 ^ 0x58);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2613(int arg0, byte arg1, int arg2) {
        field6098++;
        if (arg1 > -92) {
            method2613(10, (byte) 89, 40);
        }
        return class724.method4019(arg2, arg0, false) & class562.method3277(arg2, arg0, (byte) -75);
    }
}
