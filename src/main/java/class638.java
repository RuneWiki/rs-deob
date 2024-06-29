import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class638 extends class471 {

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "Ljava/net/Socket;")
    private Socket field9255;

    @OriginalMember(owner = "client!lv", name = "v", descriptor = "Ldu;")
    private class533 field9265;

    @OriginalMember(owner = "client!lv", name = "w", descriptor = "Lda;")
    private class431 field9266;

    @OriginalMember(owner = "client!lv", name = "x", descriptor = "Lbv;")
    public static class567 field9267 = new class567("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
    public static int field9256;

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!lv", name = "p", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!lv", name = "q", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!lv", name = "r", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!lv", name = "s", descriptor = "I")
    public static int field9262;

    @OriginalMember(owner = "client!lv", name = "t", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!lv", name = "u", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!lv", name = "y", descriptor = "I")
    public static int field9268;

    @OriginalMember(owner = "client!lv", name = "o", descriptor = "[I")
    public static int[] field9258;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(III[B)I", line = 8)
    public final int method2741(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field9268++;
        if (arg0 != -1) {
            this.finalize();
        }
        return this.field9265.method3014(5320, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILoh;ZILpa;Lha;II)V", line = 19)
    public static final void method3684(int arg0, class549 arg1, boolean arg2, int arg3, class593 arg4, class116 arg5, int arg6, int arg7) {
        field9257++;
        if (arg5 == null) {
            return;
        }
        int var8;
        if (class377.field5547 == 4) {
            var8 = (int) class523.field7256 & 0x3FFF;
        } else {
            var8 = (int) class523.field7256 + class495.field6941 & 0x3FFF;
        }
        int var9 = Math.max(arg1.field7678 / 2, arg1.field7776 / 2) + 10;
        int var10 = arg0 * arg0 + arg3 * arg3;
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class285.field4154[var8];
        int var12 = class285.field4152[var8];
        if (arg2) {
            return;
        }
        if (class377.field5547 != 4) {
            var12 = var12 * 256 / (class353.field5042 + 256);
            var11 = var11 * 256 / (class353.field5042 + 256);
        }
        int var13 = arg0 * var12 + arg3 * var11 >> 15;
        int var14 = arg3 * var12 - arg0 * var11 >> 15;
        arg5.method663(arg1.field7678 / 2 + var13 + (arg6 - arg5.method955() / 2), -var14 + arg1.field7776 / 2 + arg7 + -(arg5.method960() / 2), arg4, arg6, arg7);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(III[B)V", line = 66)
    public final void method2733(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != 3) {
            field9267 = null;
        }
        field9261++;
        this.field9266.method2567(arg1, (byte) 73, arg3, arg2);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V", line = 78)
    public final void method2737(int arg0) {
        field9264++;
        this.field9265.method3015(0);
        this.field9266.method2565((byte) 24);
        if (arg0 < 36) {
            method3685((byte) -93);
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(II)Z", line = 92)
    public final boolean method2739(int arg0, int arg1) throws IOException {
        if (arg1 == 544) {
            field9256++;
            return this.field9265.method3009(false, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lv", name = "finalize", descriptor = "()V", line = 104)
    protected final void finalize() {
        field9259++;
        this.method2743((byte) 67);
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(B)V", line = 112)
    public static void method3685(byte arg0) {
        int var1 = 30 / ((-arg0 - 30) / 49);
        field9258 = null;
        field9267 = null;
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 121)
    public class638(Socket arg0, int arg1) throws IOException {
        this.field9255 = arg0;
        this.field9255.setSoTimeout(30000);
        this.field9255.setTcpNoDelay(true);
        this.field9265 = new class533(this.field9255.getInputStream(), arg1);
        this.field9266 = new class431(this.field9255.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V", line = 134)
    public final void method2743(byte arg0) {
        try {
            this.field9255.close();
        } catch (IOException var3) {
        }
        field9263++;
        this.field9265.method3010(-125);
        int var2 = 23 % ((-arg0 - 68) / 41);
        this.field9266.method2566((byte) -118);
    }
}
