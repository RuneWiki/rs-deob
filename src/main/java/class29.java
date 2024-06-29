import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class29 {

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lgd;")
    public static class40 field616 = class14.method90(false, "::hiddenbuttontest");

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field618 = 0;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lgd;")
    public static class40 field614 = class14.method90(false, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lgd;")
    public static class40 field615 = class14.method90(false, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field620 = 0;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Lgd;")
    public static class40 field628 = class14.method90(false, "titlebox");

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Lgd;")
    public static class40 field630 = class14.method90(false, "Name des Gegenstands eingeben:");

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lo;")
    public static class87 field624 = null;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Lgd;")
    public static class40 field621 = class14.method90(false, "@whi@");

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Lrc;")
    public static class104 field617;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "Lw;")
    public static class135 field632;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "[I")
    public static int[] field622;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lmb;I)V", line = 19)
    public static final void method184(class73 arg0, int arg1) {
        field631++;
        for (int var2 = 0; var2 < class31.field778.length; var2++) {
            class31.field778[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * Math.random() * 128.0D);
            class31.field778[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class4.field120[var15] = (class31.field778[var15 + 128] + class31.field778[var15 - 1] + class31.field778[var15 - -1] + class31.field778[var15 - 128]) / 4;
                }
            }
            int[] var13 = class31.field778;
            class31.field778 = class4.field120;
            class4.field120 = var13;
        }
        if (arg0 != null) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.field1712; var7++) {
                for (int var8 = 0; var8 < arg0.field1706; var8++) {
                    if (arg0.field1711[var6++] != 0) {
                        int var9 = var8 + arg0.field1707 + 16;
                        int var10 = arg0.field1709 + var7 + 16;
                        int var11 = (var10 << 7) + var9;
                        class31.field778[var11] = 0;
                    }
                }
            }
        }
        if (arg1 != 32069) {
            method184(null, -53);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V", line = 127)
    public static final void method185(byte arg0, int arg1) {
        field623++;
        class43.field1083 += arg1;
        if (arg0 != 54) {
            field628 = null;
        }
        while (class131.field3171 <= class43.field1083) {
            class55.field1421 -= class55.field1421 >> 2;
            class43.field1083 -= class131.field3171;
        }
        class55.field1421 -= arg1 * 1000;
        if (class55.field1421 < 0) {
            class55.field1421 = 0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lw;IILnd;)V", line = 148)
    public static final void method186(class135 arg0, int arg1, int arg2, class82 arg3) {
        class53 var4 = new class53();
        var4.field1344 = arg0;
        var4.field1340 = arg1;
        var4.field2647 = arg2;
        field619++;
        var4.field1339 = arg3;
        class89 var5 = class58.field1475;
        synchronized (class58.field1475) {
            class58.field1475.method589(var4, arg1 + 125);
        }
        class74.method502(-117);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 179)
    public static void method187(byte arg0) {
        field632 = null;
        field628 = null;
        field614 = null;
        field630 = null;
        field621 = null;
        field616 = null;
        int var1 = 80 / ((arg0 - 41) / 52);
        field617 = null;
        field622 = null;
        field615 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 214)
    public static final void method188(Component arg0, byte arg1) {
        if (arg1 >= -114) {
            method186(null, 94, 94, null);
        }
        arg0.removeKeyListener(class134.field3260);
        field613++;
        arg0.removeFocusListener(class134.field3260);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 227)
    public static final void method189(int arg0) {
        field626++;
        class8.field209 = false;
        if (arg0 != 7887591) {
            method186(null, 99, 98, null);
        }
        class124.field2912 = false;
    }
}
