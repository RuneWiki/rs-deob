import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class524 extends class747 {

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "Ljava/net/Socket;")
    private Socket field7554;

    @OriginalMember(owner = "client!uba", name = "h", descriptor = "Lmm;")
    private class532 field7546;

    @OriginalMember(owner = "client!uba", name = "i", descriptor = "Lgl;")
    private class394 field7547;

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "[I")
    public static int[] field7550 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "Z")
    public static boolean field7555 = false;

    @OriginalMember(owner = "client!uba", name = "f", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!uba", name = "g", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!uba", name = "s", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(Z)V", line = 5)
    public static void method3113(boolean arg0) {
        if (arg0) {
            field7555 = true;
        }
        field7550 = null;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IB)Z", line = 16)
    public final boolean method3114(int arg0, byte arg1) throws IOException {
        if (arg1 < 124) {
            this.field7546 = null;
        }
        field7553++;
        return this.field7546.method3146(arg0, (byte) 87);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(III[B)V", line = 27)
    public final void method3115(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 >= 118) {
            field7551++;
            this.field7547.method2451((byte) 43, arg2, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)Lmo;", line = 41)
    public static final class733 method3116(int arg0, int arg1, int arg2) {
        class114 var3 = class488.field7062[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class733 var4 = var3.field1771;
            var3.field1771 = null;
            class542.method3172(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!uba", name = "finalize", descriptor = "()V", line = 53)
    protected final void finalize() {
        field7545++;
        this.method3118(25);
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 67)
    public class524(Socket arg0, int arg1) throws IOException {
        this.field7554 = arg0;
        this.field7554.setSoTimeout(30000);
        this.field7554.setTcpNoDelay(true);
        this.field7546 = new class532(this.field7554.getInputStream(), arg1);
        this.field7547 = new class394(this.field7554.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V", line = 83)
    public final void method3117(boolean arg0) {
        if (!arg0) {
            method3119(null, -45, null);
        }
        this.field7546.method3148(3665);
        field7556++;
        this.field7547.method2450((byte) 115);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V", line = 97)
    public final void method3118(int arg0) {
        try {
            this.field7554.close();
        } catch (IOException var2) {
        }
        if (arg0 == 25) {
            field7557++;
            this.field7546.method3144(7);
            this.field7547.method2452(arg0 + 1324);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lfea;I[[B)V", line = 113)
    public static final void method3119(class460 arg0, int arg1, byte[][] arg2) {
        field7548++;
        int var3 = class404.field5987.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg2[var4];
            if (var5 != null) {
                int var6 = (class205.field3445[var4] >> 8) * 64 - class265.field4123;
                int var7 = (class205.field3445[var4] & 0xFF) * 64 - class723.field10155;
                class493.method2998((byte) -115);
                arg0.method2817(class247.field3958, var7, class364.field5573, -1, var5, var6);
            }
        }
        if (arg1 != 16711680) {
            field7550 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IBI[B)I", line = 148)
    public final int method3120(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field7549++;
        if (arg1 != -36) {
            this.field7554 = null;
        }
        return this.field7546.method3150(arg1 ^ 0x27, arg0, arg3, arg2);
    }
}
