import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class640 {

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public int field9309;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public int field9306;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public int field9307;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public int field9312;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "B")
    public byte field9304;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
    public int field9313;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "Leu;")
    public static class407 field9310;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public static int field9317;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "Z")
    public static volatile boolean field9316;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "Lvn;")
    public class260 field9308;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "Lmq;")
    public class433 field9311;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "Lke;")
    public class514 field9314;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "Lgj;")
    public class544 field9318;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public static void method3700(int arg0) {
        field9310 = null;
        if (arg0 != 6141) {
            method3701(48, -5, 3, 3);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIII)I")
    public static final int method3701(int arg0, int arg1, int arg2, int arg3) {
        field9305++;
        if (arg0 > 243) {
            arg3 >>= 0x4;
        } else if (arg0 > 217) {
            arg3 >>= 0x3;
        } else if (arg0 > 192) {
            arg3 >>= 0x2;
        } else if (arg0 > 179) {
            arg3 >>= 0x1;
        }
        int var4 = 124 % ((arg1 - 43) / 57);
        return (arg0 >> 1) + ((arg2 & 0xFF) >> 2 << 10) + (arg3 >> 5 << 7);
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(BIIIII)V")
    public class640(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9309 = arg1;
        this.field9306 = arg5;
        this.field9307 = arg2;
        this.field9312 = arg3;
        this.field9304 = arg0;
        this.field9313 = arg4;
    }

    static {
        new class104("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field9310 = new class407(0, 0);
        field9317 = -1;
        field9316 = false;
    }
}
