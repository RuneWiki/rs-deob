import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class689 extends class634 {

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "Ljava/net/Socket;")
    private Socket field9607;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "Lwv;")
    private class792 field9617;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "Lnha;")
    private class525 field9615;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "[F")
    public static float[] field9610 = new float[4];

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field9606;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public static int field9608;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
    public static int field9609;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
    public static int field9611;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    public static int field9612;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public static int field9613;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field9614;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public static int field9616;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "I")
    public static int field9619;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "[Loq;")
    public static class230[] field9618;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "[Z")
    public static boolean[] field9604;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)Z", line = 7)
    public final boolean method3633(int arg0, int arg1) throws IOException {
        field9619++;
        if (arg1 != 10) {
            method3913((byte) -42);
        }
        return this.field9617.method4334(arg0, arg1 - 10);
    }

    @OriginalMember(owner = "client!vp", name = "finalize", descriptor = "()V", line = 18)
    protected final void finalize() {
        this.method3634(22654);
        field9612++;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(B)V", line = 26)
    public static void method3913(byte arg0) {
        field9618 = null;
        field9610 = null;
        field9604 = null;
        if (arg0 != -1) {
            method3913((byte) -31);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIBLpq;[I[I)Lkn;", line = 40)
    public static final class339 method3914(int arg0, int arg1, byte arg2, class194 arg3, int[] arg4, int[] arg5) {
        if (arg2 != -1) {
            return null;
        }
        field9605++;
        byte[] var6 = new byte[arg0 * arg1];
        for (int var7 = 0; var7 < arg0; var7++) {
            int var8 = arg1 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class339(arg3, arg1, arg0, var6);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V", line = 70)
    public final void method3632(int arg0) {
        field9616++;
        if (arg0 != 0) {
            field9618 = null;
        }
        this.field9617.method4333((byte) 115);
        this.field9615.method3126(-112);
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V", line = 87)
    public final void method3634(int arg0) {
        field9611++;
        try {
            if (arg0 != 22654) {
                field9608 = 113;
            }
            this.field9607.close();
        } catch (IOException var2) {
        }
        this.field9617.method4337(-1);
        this.field9615.method3127((byte) 126);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I[BII)I", line = 105)
    public final int method3640(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field9606++;
        if (arg3 != -49) {
            this.field9607 = null;
        }
        return this.field9617.method4335(-4423, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II[BB)V", line = 119)
    public final void method3637(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        if (arg3 != 64) {
            field9604 = null;
        }
        this.field9615.method3125(0, arg0, arg2, arg1);
        field9614++;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 133)
    public class689(Socket arg0, int arg1) throws IOException {
        this.field9607 = arg0;
        this.field9607.setSoTimeout(30000);
        this.field9607.setTcpNoDelay(true);
        this.field9617 = new class792(this.field9607.getInputStream(), arg1);
        this.field9615 = new class525(this.field9607.getOutputStream(), arg1);
    }
}
