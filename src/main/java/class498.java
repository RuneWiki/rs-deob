import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class498 extends class443 {

    @OriginalMember(owner = "client!on", name = "A", descriptor = "Ld;")
    public static class242 field7250 = new class242(20);

    @OriginalMember(owner = "client!on", name = "J", descriptor = "I")
    public static int field7257 = -1;

    @OriginalMember(owner = "client!on", name = "I", descriptor = "Lpu;")
    public static class179 field7256 = new class179("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!on", name = "K", descriptor = "I")
    public static int field7258 = 0;

    @OriginalMember(owner = "client!on", name = "C", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!on", name = "F", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!on", name = "G", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!on", name = "H", descriptor = "Ljp;")
    public static class55 field7255;

    @OriginalMember(owner = "client!on", name = "D", descriptor = "[B")
    private byte[] field7252;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BIB)V")
    public final void method2735(byte arg0, int arg1, byte arg2) {
        if (arg2 >= -21) {
            return;
        }
        field7254++;
        byte var4 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var5 = arg1 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field7252[var10001] = var4;
        this.field7252[var6] = var4;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IFFF)I")
    public static final int method2976(int arg0, float arg1, float arg2, float arg3) {
        field7251++;
        float var4 = arg3 < 0.0F ? -arg3 : arg3;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (arg0 <= 80) {
            return -79;
        }
        float var6 = arg1 < 0.0F ? -arg1 : arg1;
        if (var4 < var5 && var6 < var5) {
            return (arg2 > 0.0F) ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return arg1 > 0.0F ? 2 : 3;
        } else if (arg3 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
    public static void method2977(int arg0) {
        field7255 = null;
        if (arg0 == 2) {
            field7256 = null;
            field7250 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V")
    public class498() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(IIII)[B")
    public final byte[] method2978(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 25673) {
            this.field7252 = new byte[arg0 * arg2 * arg3 * 2];
            field7253++;
            this.method1177(arg3, arg0, arg2, arg1 ^ 0x2749);
            return this.field7252;
        } else {
            return null;
        }
    }

    static {
        new class179(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        new class179(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
    }
}
