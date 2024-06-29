import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class227 implements Runnable {

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "[Lit;")
    public volatile class422[] field3430 = new class422[2];

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Z")
    public volatile boolean field3433 = false;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Z")
    public volatile boolean field3431 = false;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Ldk;")
    public static class326 field3432;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "Lb;")
    public static class201 field3434;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lmj;")
    public class430 field3427;

    @OriginalMember(owner = "client!vk", name = "run", descriptor = "()V")
    public final void run() {
        this.field3431 = true;
        field3429++;
        try {
            while (!this.field3433) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class422 var2 = this.field3430[var1];
                    if (var2 != null) {
                        var2.method2475(117);
                    }
                }
                class111.method713(26, 10L);
                class170.method1054(this.field3427, (Object) null, 107);
            }
        } catch (Exception var9) {
            class267.method1641((String) null, var9, (byte) -87);
        } finally {
            Object var6 = null;
            this.field3431 = false;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V")
    public static void method1455(boolean arg0) {
        field3434 = null;
        field3432 = null;
        if (!arg0) {
            field3435 = 101;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILir;[[B)V")
    public static final void method1456(int arg0, class22 arg1, byte[][] arg2) {
        field3428++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg2[var5];
            if (var10 != null) {
                class276 var11 = new class276(var10);
                int var12 = class368.field5294[var5] >> 8;
                int var13 = class368.field5294[var5] & 0xFF;
                int var14 = var12 * 64 - class240.field3602;
                int var15 = var13 * 64 - class360.field5180;
                class164.method1027(false);
                arg1.method2288(class422.field5918, class360.field5180, (byte) 114, class240.field3602, var14, var11, var15);
                arg1.method151(class141.field1878, (byte) 117, var15, var14, var3, var11);
                if (!arg1.field5406 && (class310.field4388 / 8) == var12 && class242.field3622 / 8 == var13) {
                    if (var3[0] == -1) {
                        class146.field2100 = null;
                    } else {
                        class146.field2100 = class326.field4700.method2029(var3[2], var3[1], var3[0], 92, class230.field3481, var3[3]);
                        class153.field2288 = var3[4];
                    }
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class368.field5294[var6] >> 8) * 64 - class240.field3602;
            int var8 = (class368.field5294[var6] & 0xFF) * 64 - class360.field5180;
            byte[] var9 = arg2[var6];
            if (var9 == null && class242.field3622 < 800) {
                class164.method1027(false);
                arg1.method2290(var8, var7, 64, 64, 108);
            }
        }
        if (arg0 <= 58) {
            method1455(true);
        }
    }

    static {
        new class326("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field3432 = new class326("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");
    }
}
