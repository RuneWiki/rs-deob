import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class656 extends class308 {

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "Ljava/net/Socket;")
    private Socket field8458;

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "Lkb;")
    private class791 field8451;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "Lfb;")
    private class698 field8452;

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "I")
    public static int field8457 = 0;

    @OriginalMember(owner = "client!nca", name = "n", descriptor = "Luw;")
    public static class208 field8462 = new class208(68, 7);

    @OriginalMember(owner = "client!nca", name = "r", descriptor = "Ljava/lang/String;")
    public static String field8466 = "";

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
    public static int field8459;

    @OriginalMember(owner = "client!nca", name = "l", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!nca", name = "m", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!nca", name = "o", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!nca", name = "p", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "[Lbha;")
    public static class318[] field8454;

    @OriginalMember(owner = "client!nca", name = "q", descriptor = "[[I")
    public static int[][] field8465;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "(I)V", line = 4)
    public static final void method3578(int arg0) {
        field8453++;
        if (arg0 != 2048) {
            field8454 = null;
        }
        class20.field189 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            class26.field229[var1] = null;
            class282.field3657[var1] = 1;
            class420.field5533[var1] = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IB)Z", line = 27)
    public final boolean method1814(int arg0, byte arg1) throws IOException {
        int var3 = 93 / ((arg1 + 3) / 36);
        field8463++;
        return this.field8451.method4330(-1, arg0);
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)V", line = 43)
    public final void method1815(int arg0) {
        field8464++;
        this.field8451.method4329((byte) -108);
        if (arg0 > -98) {
            field8462 = null;
        }
        this.field8452.method3792((byte) 100);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "([BIII)V", line = 55)
    public final void method1816(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        this.field8452.method3795(arg3, (byte) 127, arg2, arg0);
        field8455++;
        if (arg1 != 76) {
            method3578(34);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IB[BI)I", line = 68)
    public final int method1818(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field8460++;
        if (arg1 != 52) {
            field8457 = 33;
        }
        return this.field8451.method4332(arg3, (byte) 86, arg2, arg0);
    }

    @OriginalMember(owner = "client!nca", name = "finalize", descriptor = "()V", line = 84)
    protected final void finalize() {
        this.method1817(-105);
        field8461++;
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 91)
    public class656(Socket arg0, int arg1) throws IOException {
        this.field8458 = arg0;
        this.field8458.setSoTimeout(30000);
        this.field8458.setTcpNoDelay(true);
        this.field8451 = new class791(this.field8458.getInputStream(), arg1);
        this.field8452 = new class698(this.field8458.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(I)V", line = 107)
    public final void method1817(int arg0) {
        field8459++;
        try {
            this.field8458.close();
        } catch (IOException var2) {
        }
        this.field8451.method4328((byte) 20);
        this.field8452.method3796((byte) -123);
        if (arg0 > -104) {
            field8466 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "(I)V", line = 124)
    public static void method3579(int arg0) {
        field8462 = null;
        field8466 = null;
        field8454 = null;
        field8465 = null;
        if (arg0 != 30000) {
            field8457 = 27;
        }
    }
}
