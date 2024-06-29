import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class60 {

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lwl;")
    public static class452 field776;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[[Z")
    public static boolean[][] field774;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static final void method328(int arg0) {
        field775++;
        if (class90.field1277 != null) {
            return;
        }
        int var1 = class184.field2777;
        int var2 = class113.field1498;
        int var3 = class71.field933 - class221.field3368 - var1;
        if (arg0 != 0) {
            field774 = null;
        }
        int var4 = class204.field3063 - var2 - class161.field2232;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class143.field1914 == null) {
                var5 = class79.field1043.field3583;
            } else {
                var5 = class143.field1914;
            }
            int var6 = 0;
            int var7 = 0;
            if (class143.field1914 == var5) {
                Insets var8 = class143.field1914.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class204.field3063);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class71.field933, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class71.field933 - var3, var7, var3, class204.field3063);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class204.field3063 + var7 - var4, class71.field933, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
    public static final void method329(int arg0, int arg1) {
        class318.field4811 = -1;
        field777++;
        if (arg0 == 37) {
            class223.field3385 = 3.0F;
        } else if (arg0 == 50) {
            class223.field3385 = 4.0F;
        } else if (arg0 == 75) {
            class223.field3385 = 6.0F;
        } else if (arg0 == 100) {
            class223.field3385 = 8.0F;
        } else if (arg0 == 200) {
            class223.field3385 = 16.0F;
        }
        class318.field4811 = -1;
        if (arg1 <= 78) {
            field774 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public static void method330(int arg0) {
        field776 = null;
        field774 = null;
        if (arg0 != 10) {
            method329(60, -124);
        }
    }

    static {
        new class151("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field776 = new class452(23, 10);
        new class151("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }
}
