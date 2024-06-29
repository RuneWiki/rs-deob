import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public abstract class class304 {

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "[I")
    public static int[] field3896;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "Z")
    public static boolean field3897;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field3895;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "Z")
    public static boolean field3892;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)I")
    public abstract int method1265(byte arg0);

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lft;B[[B)V")
    public static final void method1791(class4 arg0, byte arg1, byte[][] arg2) {
        field3894++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg2.length;
        if (arg1 != 103) {
            field3892 = false;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg2[var5];
            if (var10 != null) {
                class463 var11 = new class463(var10);
                int var12 = class79.field1025[var5] >> 8;
                int var13 = class79.field1025[var5] & 0xFF;
                int var14 = var12 * 64 - class441.field6317;
                int var15 = var13 * 64 - class320.field4064;
                class139.method946(arg1 - 4);
                arg0.method660((byte) -75, class172.field2185, var15, class320.field4064, var14, class441.field6317, var11);
                arg0.method23(var11, var14, var3, class33.field416, true, var15);
                if (!arg0.field978 && (class75.field963 / 8) == var12 && class169.field2170 / 8 == var13 && var3[0] != -1) {
                    class521.field7538 = class456.field6572.method747(var3[2], -17653, var3[1], var3[3], class375.field4840, var3[0]);
                    class293.field3756 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class79.field1025[var6] >> 8) * 64 - class441.field6317;
            int var8 = (class79.field1025[var6] & 0xFF) * 64 - class320.field4064;
            byte[] var9 = arg2[var6];
            if (var9 == null && class169.field2170 < 800) {
                class139.method946(127);
                arg0.method659(64, 64, 26135, var8, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
    public static void method1792(int arg0) {
        if (arg0 == 6435) {
            field3895 = null;
            field3896 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)I")
    public abstract int method1263(byte arg0);

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)C")
    public abstract char method1262(boolean arg0);

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)J")
    public abstract long method1264(boolean arg0);

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)Z")
    public abstract boolean method1258(int arg0);

    static {
        new class335("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field3896 = new int[] { -1, -1, 1, 1 };
        field3897 = false;
    }
}
