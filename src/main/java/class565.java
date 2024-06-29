import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class565 extends class666 {

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "Ljava/net/Socket;")
    private Socket field7624;

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "Lgl;")
    private class550 field7627;

    @OriginalMember(owner = "client!aaa", name = "p", descriptor = "Lcf;")
    private class553 field7632;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!aaa", name = "l", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!aaa", name = "m", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!aaa", name = "n", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!aaa", name = "o", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BI)Z")
    public final boolean method3124(byte arg0, int arg1) throws IOException {
        field7625++;
        if (arg0 != 118) {
            this.finalize();
        }
        return this.field7627.method3027(0, arg1);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)I")
    public static final int method3125(int arg0, int arg1) {
        field7623++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (~arg1 <= arg0) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "([BZII)V")
    public final void method3126(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        this.field7632.method3039(arg2, -2, arg3, arg0);
        if (!arg1) {
            field7629++;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
    public final void method3127(int arg0) {
        field7630++;
        try {
            this.field7624.close();
        } catch (IOException var3) {
        }
        this.field7627.method3023(13593);
        this.field7632.method3040((byte) -82);
        int var2 = 25 % ((47 - arg0) / 53);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V")
    public final void method3128(byte arg0) {
        field7626++;
        this.field7627.method3022(0);
        if (arg0 < -84) {
            this.field7632.method3041((byte) -67);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class565(Socket arg0, int arg1) throws IOException {
        this.field7624 = arg0;
        this.field7624.setSoTimeout(30000);
        this.field7624.setTcpNoDelay(true);
        this.field7627 = new class550(this.field7624.getInputStream(), arg1);
        this.field7632 = new class553(this.field7624.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIB[B)I")
    public final int method3129(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field7622++;
        int var5 = -5 % ((arg2 + 39) / 41);
        return this.field7627.method3026(arg1, false, arg3, arg0);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lpj;Lpj;Lpj;Lpj;B)V")
    public static final void method3130(class132 arg0, class132 arg1, class132 arg2, class132 arg3, byte arg4) {
        class173.field2598 = arg0;
        class138.field1939 = arg3;
        if (arg4 != -128) {
            field7621 = -64;
        }
        field7628++;
        class317.field4709 = arg2;
        class117.field1559 = arg1;
        class676.field9545 = new class140[class138.field1939.method917((byte) -74)][];
        class552.field7488 = new boolean[class138.field1939.method917((byte) -74)];
    }

    @OriginalMember(owner = "client!aaa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method3127(-64);
        field7631++;
    }
}
