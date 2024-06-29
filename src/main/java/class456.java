import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class456 extends class505 {

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "B")
    public byte field6634 = 5;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "[I")
    public static int[] field6639 = new int[100];

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "Ltr;")
    public static class195 field6642;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "[B")
    public static byte[] field6643;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "Loe;")
    public static class137 field6644;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public int field6631;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    public int field6632;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public int field6633;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public int field6638;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public int field6640;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public int field6641;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "Z")
    public boolean field6635;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V")
    public static void method2770(byte arg0) {
        field6642 = null;
        field6644 = null;
        field6643 = null;
        field6639 = null;
        int var1 = 107 % ((64 - arg0) / 61);
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)V")
    public static final void method2771(int arg0) {
        field6637++;
        if (class168.field2489 != null) {
            return;
        }
        int var1 = class13.field195;
        int var2 = class415.field6197;
        int var3 = class468.field6769 - class80.field1163 - var1;
        int var4 = class173.field2593 - class76.field1105 - var2;
        if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
            try {
                Container var5;
                if (class281.field4281 == null) {
                    var5 = class360.field5349.field5199;
                } else {
                    var5 = class281.field4281;
                }
                int var6 = 0;
                int var7 = 0;
                if (class281.field4281 == var5) {
                    Insets var8 = class281.field4281.getInsets();
                    var6 = var8.left;
                    var7 = var8.top;
                }
                Graphics var9 = var5.getGraphics();
                var9.setColor(Color.black);
                if (var1 > 0) {
                    var9.fillRect(var6, var7, var1, class173.field2593);
                }
                if (var2 > 0) {
                    var9.fillRect(var6, var7, class468.field6769, var2);
                }
                if (var3 > 0) {
                    var9.fillRect(class468.field6769 + var6 - var3, var7, var3, class173.field2593);
                }
                if (var4 > 0) {
                    var9.fillRect(var6, var7 + class173.field2593 - var4, class468.field6769, var4);
                }
            } catch (Exception var10) {
            }
        }
        if (arg0 != 0) {
            field6639 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)Z")
    public static final boolean method2772(int arg0, int arg1, int arg2) {
        field6636++;
        if (arg0 < 42) {
            return true;
        } else if (((arg2 & 0x10000) != 0 | class379.method2380(arg2, arg1, 16384)) || class501.method2971((byte) 112, arg1, arg2)) {
            return true;
        } else {
            return (arg1 & 0x37) == 0 && class262.method1748(arg2, (byte) 99, arg1);
        }
    }

    static {
        new class234("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field6642 = new class195(12, 3);
        field6643 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
        new class234("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field6644 = new class137();
    }
}
