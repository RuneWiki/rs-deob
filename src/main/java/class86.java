import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class86 extends class324 {

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Lkca;")
    public static class73 field971 = new class73(49, 4);

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "Lrq;")
    public static class296 field984;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "Lqf;")
    public class593 field976;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "Lqf;")
    public class593 field983;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "Ljava/lang/String;")
    public String field975;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "Z")
    public boolean field981;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "[Ljava/lang/Object;")
    public Object[] field985;

    static {
        new class474("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field984 = new class296();
        field986 = -1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 12)
    public static void method554(int arg0) {
        field984 = null;
        field971 = null;
        if (arg0 >= -121) {
            method554(6);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I[BII[BIIII)V", line = 35)
    public static final void method555(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field974++;
        int var9 = -(arg6 >> 2);
        int var10 = -(arg6 & 0x3);
        if (arg2 > -97) {
            method555(-57, null, 25, 64, null, -121, 92, 126, 76);
        }
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg1[var10001] = (byte) (arg1[var10001] - arg4[arg5++]);
                int var14 = arg7++;
                arg1[var14] = (byte) (arg1[var14] - arg4[arg5++]);
                int var15 = arg7++;
                arg1[var15] = (byte) (arg1[var15] - arg4[arg5++]);
                int var16 = arg7++;
                arg1[var16] = (byte) (arg1[var16] - arg4[arg5++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg1[var10001] = (byte) (arg1[var10001] - arg4[arg5++]);
            }
            arg5 += arg8;
            arg7 += arg3;
        }
    }
}
