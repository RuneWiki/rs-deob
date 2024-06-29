import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class508 extends OutputStream {

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "Lqp;")
    public static class586 field7553 = new class586(74, 4);

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "[F")
    public static float[] field7555 = new float[16];

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "Lnj;")
    public static class487 field7554 = new class487("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
    public static final void method3036(byte arg0) {
        class625.field9163 = null;
        if (arg0 != 5) {
            field7553 = null;
        }
        field7551++;
        class42.method221(0, 0, class522.field7735, 0, (byte) 22, class540.field8007, 0, -1, class337.field4944);
        if (class625.field9163 != null) {
            class585.method3418(0, class522.field7735, class182.field2787, class533.field7896.field4638, class19.field176, class625.field9163, class337.field4944, -1412584499, 0, -31);
            class625.field9163 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field7550++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IBII)I")
    public static final int method3037(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        int var5 = -69 / ((arg1 - 35) / 32);
        field7552++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(B)V")
    public static void method3038(byte arg0) {
        if (arg0 != -115) {
            field7555 = null;
        }
        field7553 = null;
        field7555 = null;
        field7554 = null;
    }
}
