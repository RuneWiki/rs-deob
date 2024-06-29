import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class25 extends class59 {

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "Ljava/net/Socket;")
    private Socket field902;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "Lem;")
    private class207 field903;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "Laf;")
    private class404 field912;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "Lqfa;")
    public static class85 field911 = null;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field914;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(Z)Lho;")
    public static final class135 method478(boolean arg0) {
        if (!arg0) {
            field911 = null;
        }
        field909++;
        return class325.field4769 < class366.field5422.length ? class366.field5422[class325.field4769++] : null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)Z")
    public final boolean method479(int arg0, int arg1) throws IOException {
        field906++;
        return arg0 < 114 ? true : this.field903.method1454(-7053, arg1);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "([BBII)I")
    public final int method480(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field907++;
        return arg1 <= 52 ? 112 : this.field903.method1455(arg3, arg0, arg2, 0);
    }

    @OriginalMember(owner = "client!ir", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method481(true);
        field905++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        try {
            this.field902.close();
        } catch (IOException var2) {
        }
        field904++;
        if (!arg0) {
            this.method482((byte) 85);
        }
        this.field903.method1456(-64);
        this.field912.method2466(false);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)V")
    public final void method482(byte arg0) {
        field908++;
        this.field903.method1453(122);
        int var2 = -90 % ((69 - arg0) / 38);
        this.field912.method2465(-1);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
    public static final void method483(int arg0) {
        class363.field5394 = null;
        class598.field8574 = null;
        class173.field2851 = null;
        class381.field5638 = null;
        class468.field6621 = null;
        class357.field5336 = null;
        class513.field7239 = null;
        class419.field6046 = null;
        class515.field7295 = null;
        class592.field8516 = null;
        class367.field5445 = null;
        class542.field7569 = null;
        field910++;
        class288.field4300 = null;
        class47.field1141 = null;
        class660.field9508 = null;
        class284.field4222 = null;
        class342.field5098 = null;
        if (arg0 < 90) {
            field911 = null;
        }
        class311.field4630 = null;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
    public static void method484(int arg0) {
        field914 = null;
        field911 = null;
        if (arg0 != -1) {
            method478(true);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II[BB)V")
    public final void method485(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        this.field912.method2464(arg2, arg1, arg0, true);
        field901++;
        if (arg3 != -107) {
            this.method481(true);
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)V")
    public static final void method486(int arg0, int arg1) {
        if (arg0 >= 42) {
            field900++;
            class260.field3821 = 1000000000L / (long) arg1;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZII)Z")
    public static final boolean method487(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return false;
        } else {
            field913++;
            return class420.method2546((byte) 32, arg2, arg1) & ((arg2 & 0x2000) != 0 | class457.method2742(arg2, -110, arg1) | class149.method1178(arg1, -49, arg2));
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class25(Socket arg0, int arg1) throws IOException {
        this.field902 = arg0;
        this.field902.setSoTimeout(30000);
        this.field902.setTcpNoDelay(true);
        this.field903 = new class207(this.field902.getInputStream(), arg1);
        this.field912 = new class404(this.field902.getOutputStream(), arg1);
    }
}
