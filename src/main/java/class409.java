import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class409 extends class391 {

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    private int field5593;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    private int field5601;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    private int field5590;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    private int field5603;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    private int field5598;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    private int field5600;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    private int field5594;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    private int field5597;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "[S")
    public static short[] field5604;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    public static int field5607;

    static {
        new class151("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field5604 = new short[] { 11, 17, 5, 12, 48, 6, 3, 10 };
        new class151("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field5605 = 255;
        new class151("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field5606 = 0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V", line = 11)
    public final void method1255(int arg0, int arg1, int arg2) {
        int var4 = -7 % ((arg2 - -42) / 37);
        ++field5591;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)V", line = 28)
    public final void method1256(int arg0, int arg1, int arg2) {
        ++field5599;
        int var4 = this.field5601 * arg2 >> 12;
        int var5 = this.field5600 * arg1 >> 12;
        int var6 = this.field5593 * arg2 >> 12;
        int var7 = this.field5598 * arg1 >> 12;
        int var8 = this.field5597 * arg2 >> 12;
        if (arg0 != 9329) {
            this.field5594 = 43;
        }
        int var9 = this.field5594 * arg1 >> 12;
        int var10 = this.field5590 * arg2 >> 12;
        int var11 = this.field5603 * arg1 >> 12;
        class281.method1872(var10, var6, var7, var9, super.field5406, var8, var5, var11, 0, var4);
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 55)
    public class409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field5593 = arg2;
        this.field5601 = arg0;
        this.field5590 = arg6;
        this.field5603 = arg7;
        this.field5598 = arg3;
        this.field5600 = arg1;
        this.field5594 = arg5;
        this.field5597 = arg4;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(III)V", line = 71)
    public final void method1254(int arg0, int arg1, int arg2) {
        ++field5602;
        if (arg2 <= 120) {
            method2451(118, -71);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Z", line = 82)
    public static final boolean method2447(int arg0, byte arg1) {
        ++field5596;
        if (arg1 <= 71) {
            return false;
        } else {
            return ~arg0 == -1 || ~arg0 == -2 || arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V", line = 93)
    public static final void method2448(byte arg0) {
        class162.field2363.method1824(2545);
        ++field5592;
        class175.field2661.method1626(false);
        if (class296.field4177 != null) {
            class296.field4177.method690((byte) -9, class33.field338);
        }
        class204.field2997.method2692(0);
        class33.field338.setBackground(Color.black);
        class319.field4507 = -1;
        class162.field2363 = class183.method1304(class33.field338, 36);
        class175.field2661 = class61.method557(true, (byte) 89, class33.field338);
        int var1 = 58 % ((76 - arg0) / 40);
        if (class296.field4177 != null) {
            class296.field4177.method691((byte) 103, class33.field338);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V", line = 122)
    public static void method2449(int arg0) {
        field5604 = null;
        if (arg0 != -9831) {
            field5605 = 113;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 133)
    public static final void method2450(int arg0, int arg1, int arg2, Class arg3) {
        class52 var4 = class385.field5285[arg0][arg1][arg2];
        if (var4 != null) {
            for (class131 var5 = var4.field763; var5 != null; var5 = var5.field1796) {
                class325 var6 = var5.field1803;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field4535 == arg1 && var6.field4539 == arg2) {
                    class176.method1271(var6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lks;", line = 169)
    public static final class292 method2451(int arg0, int arg1) {
        ++field5595;
        if (arg0 < 18) {
            return null;
        } else {
            class292 var2 = (class292) class185.field2788.method917(-6700, (long) arg1);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class291.field4126.method2633(arg1, 0, -118);
                if (var3 != null && ~var3.length < -2) {
                    class292 var4 = class227.method1544(var3, (byte) 4);
                    class185.field2788.method922((long) arg1, 105, var4);
                    return var4;
                } else {
                    return null;
                }
            }
        }
    }
}
