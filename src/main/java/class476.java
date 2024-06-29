import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class476 {

    @OriginalMember(owner = "client!po", name = "g", descriptor = "Lid;")
    public static class224 field6808 = new class224("", 11);

    @OriginalMember(owner = "client!po", name = "h", descriptor = "Lbv;")
    public static class567 field6809 = new class567("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field6810 = -1;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "Lpo;")
    public class476 field6804;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "Lpo;")
    public class476 field6806;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)I", line = 8)
    public static final int method2752(int arg0, int arg1, int arg2) {
        field6803++;
        int var3 = arg0 >> 31 & arg2 - 1;
        if (arg1 != -319880324) {
            method2756(-126, null);
        }
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 22)
    public final void method2753(int arg0) {
        field6807++;
        if (arg0 != 0) {
            method2754((byte) -57, -127, 44);
        }
        if (this.field6804 != null) {
            this.field6804.field6806 = this.field6806;
            this.field6806.field6804 = this.field6804;
            this.field6806 = null;
            this.field6804 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BII)Z", line = 40)
    public static final boolean method2754(byte arg0, int arg1, int arg2) {
        if (arg0 == -67) {
            field6805++;
            return class563.method3210(arg1, arg0 ^ 0x22, arg2) || class435.method2588(arg2, arg1, arg0 - 24);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V", line = 53)
    public static void method2755(int arg0) {
        int var1 = 2 / ((arg0 + 76) / 39);
        field6808 = null;
        field6809 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILaj;)V", line = 66)
    public static final void method2756(int arg0, class261 arg1) {
        arg1.method1655(6924);
        field6802++;
        int var2 = class323.field4670;
        class400 var3 = class644.field9367 = class39.field536[var2] = new class400();
        var3.field1555 = var2;
        int var4 = arg1.method1660(65, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFF50B) >> 14;
        int var7 = var4 & 0x3FFF;
        var3.field1571[0] = var6 - class382.field5687;
        var3.field5108 = (var3.field1571[0] << 7) + (var3.method781((byte) -84) << 6);
        var3.field1572[0] = var7 - class597.field8500;
        var3.field5109 = (var3.field1572[0] << 7) + (var3.method781((byte) -115) << 6);
        class545.field7583 = var3.field5116 = var5;
        if (class514.field7115[var2] != null) {
            var3.method2448(class514.field7115[var2], (byte) -79);
        }
        class43.field586 = 0;
        class343.field4927[class43.field586++] = var2;
        class185.field2688[var2] = 0;
        class418.field6154 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method1660(-126, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFFC9) >> 8;
                int var12 = var9 & 0xFF;
                class537 var13 = class641.field9293[var8] = new class537();
                var13.field7494 = (var10 << 28) + (var11 << 14) + var12;
                var13.field7491 = 0;
                var13.field7490 = false;
                var13.field7492 = -1;
                class302.field4368[class418.field6154++] = var8;
                class185.field2688[var8] = 0;
            }
        }
        arg1.method1668((byte) -40);
        if (arg0 < 33) {
            method2755(32);
        }
    }
}
