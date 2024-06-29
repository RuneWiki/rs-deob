import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class292 extends class53 {

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Ljava/net/Socket;")
    private Socket field4603;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Lec;")
    private class215 field4599;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Lkv;")
    private class247 field4607;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field4608 = 0;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lri;")
    public static class97 field4604;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public final void method594(byte arg0) {
        field4602++;
        this.field4599.method1615(-1);
        int var2 = 13 / ((arg0 + 32) / 53);
        this.field4607.method1760((byte) 0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[BII)I")
    public final int method589(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4601++;
        int var5 = -106 / ((-arg0 - 59) / 35);
        return this.field4599.method1616(arg1, arg2, 20, arg3);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Z")
    public final boolean method593(int arg0, int arg1) throws IOException {
        if (arg1 >= -116) {
            this.method588(-81);
        }
        field4606++;
        return this.field4599.method1613(arg0, -127);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public static void method2055(byte arg0) {
        field4604 = null;
        int var1 = -66 % ((66 - arg0) / 59);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public final void method588(int arg0) {
        if (arg0 != 24331) {
            field4608 = -70;
        }
        field4600++;
        try {
            this.field4603.close();
        } catch (IOException var2) {
        }
        this.field4599.method1617(1);
        this.field4607.method1759((byte) 91);
    }

    @OriginalMember(owner = "client!ne", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method588(24331);
        field4605++;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class292(Socket arg0, int arg1) throws IOException {
        this.field4603 = arg0;
        this.field4603.setSoTimeout(30000);
        this.field4603.setTcpNoDelay(true);
        this.field4599 = new class215(this.field4603.getInputStream(), arg1);
        this.field4607 = new class247(this.field4603.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([BIII)V")
    public final void method592(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field4609++;
        if (arg2 == 8) {
            this.field4607.method1762(arg3, arg1, arg0, 1);
        }
    }
}
