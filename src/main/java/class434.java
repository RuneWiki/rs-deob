import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class434 {

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public int field5947 = 0;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public int field5950 = 0;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Ljp;")
    private class236 field5948 = new class236(64);

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Llu;")
    private class500 field5953 = null;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lpc;")
    private class473 field5949;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lpc;")
    private class473 field5951;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Lcu;")
    public static class145 field5955;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lcu;")
    public static class145 field5956;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Lto;")
    public static class8 field5954;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([IIJLra;)Ljava/lang/String;")
    public final String method2502(int[] arg0, int arg1, long arg2, class70 arg3) {
        field5952++;
        if (this.field5953 != null) {
            String var6 = this.field5953.method717(arg0, arg3, arg1 ^ 0xFFFFCB1E, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        return arg1 == 32767 ? Long.toString(arg2) : null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method2503(int arg0) {
        field5954 = null;
        field5955 = null;
        field5956 = null;
        if (arg0 != 32768) {
            method2503(-68);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Lrn;")
    public final class174 method2504(byte arg0, int arg1) {
        field5946++;
        class174 var3 = (class174) this.field5948.method1456((long) arg1, 119);
        if (arg0 != 60) {
            return null;
        } else if (var3 == null) {
            byte[] var4;
            if (arg1 >= 32768) {
                var4 = this.field5951.method2708(1, arg1 & 0x7FFF, (byte) 54);
            } else {
                var4 = this.field5949.method2708(1, arg1, (byte) 54);
            }
            class174 var5 = new class174();
            var5.field2543 = this;
            if (var4 != null) {
                var5.method1174(-4, new class379(var4));
            }
            if (arg1 >= 32768) {
                var5.method1169(false);
            }
            this.field5948.method1462(var5, (long) arg1, -19);
            return var5;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(ILpc;Lpc;Llu;)V")
    public class434(int arg0, class473 arg1, class473 arg2, class500 arg3) {
        this.field5953 = arg3;
        this.field5949 = arg1;
        this.field5951 = arg2;
        if (this.field5949 != null) {
            this.field5947 = this.field5949.method2710(1, (byte) -119);
        }
        if (this.field5951 != null) {
            this.field5950 = this.field5951.method2710(1, (byte) -115);
        }
    }

    static {
        new class304("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field5955 = new class145(22, -1);
        field5956 = new class145(6, 7);
    }
}
