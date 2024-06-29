import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class657 extends class204 {

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field9288;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "Lak;")
    private class49 field9286;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "Lgea;")
    private class84 field9283;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "Lrga;")
    public static class280 field9281 = new class280(19, 8);

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "Lsfa;")
    public static class291 field9285 = new class291();

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
    public static int field9291 = 1;

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "Lrga;")
    public static class280 field9290 = new class280(38, 7);

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public static int field9275;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field9276;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
    public static int field9279;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public static int field9280;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public static int field9282;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    public static int field9284;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
    public static int field9287;

    @OriginalMember(owner = "client!fr", name = "A", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "Lcv;")
    public static class635 field9289;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)I", line = 7)
    public static final int method3692(int arg0, int arg1, int arg2) {
        field9279++;
        int var3 = class549.method3030(arg0 + 91923, 4, arg1 + 45365, (byte) -115) + (class549.method3030(arg0 + 37821, 2, arg1 + 10294, (byte) -128) - 128 >> 1) + (class549.method3030(arg0, 1, arg1, (byte) -102) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return arg2 == 45365 ? var4 : 16;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 30)
    public final void method1229(int arg0) {
        if (arg0 != 0) {
            field9291 = 6;
        }
        field9282++;
        this.field9286.method308((byte) 51);
        this.field9283.method483(arg0 ^ 0x28D6);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI[BI)I", line = 42)
    public final int method1228(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field9284++;
        if (arg0 <= 39) {
            this.finalize();
        }
        return this.field9286.method312(49, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)V", line = 53)
    public final void method1235(int arg0) {
        try {
            this.field9288.close();
            if (arg0 != 0) {
                this.field9283 = null;
            }
        } catch (IOException var2) {
        }
        field9277++;
        this.field9286.method311(17575);
        this.field9283.method482(arg0 - 111);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IBILmc;)V", line = 69)
    public static final void method3693(int arg0, byte arg1, int arg2, class424 arg3) {
        class683.field9599[arg0][arg2] = arg3;
        int var4 = -22 / ((30 - arg1) / 34);
        field9280++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IB)Z", line = 81)
    public final boolean method1232(int arg0, byte arg1) throws IOException {
        int var3 = 125 % ((arg1 - 58) / 54);
        field9276++;
        return this.field9286.method310(arg0, (byte) -105);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V", line = 94)
    public static void method3694(byte arg0) {
        field9285 = null;
        field9289 = null;
        if (arg0 >= -24) {
            field9292 = -75;
        }
        field9290 = null;
        field9281 = null;
    }

    @OriginalMember(owner = "client!fr", name = "finalize", descriptor = "()V", line = 109)
    protected final void finalize() {
        this.method1235(0);
        field9275++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "([BIIB)V", line = 118)
    public final void method1230(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        this.field9283.method480(arg1, 0, arg0, arg2);
        field9278++;
        if (arg3 < 112) {
            method3694((byte) 89);
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 136)
    public class657(Socket arg0, int arg1) throws IOException {
        this.field9288 = arg0;
        this.field9288.setSoTimeout(30000);
        this.field9288.setTcpNoDelay(true);
        this.field9286 = new class49(this.field9288.getInputStream(), arg1);
        this.field9283 = new class84(this.field9288.getOutputStream(), arg1);
    }
}
