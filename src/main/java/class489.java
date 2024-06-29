import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class489 {

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "[I")
    private int[] field7143;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Ljp;")
    public static class55 field7142;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field7147;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lbn;")
    public static class307 field7140;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Lum;")
    public static class83 field7145;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "[[B")
    public static byte[][] field7139;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I")
    public final int method2951(int arg0, int arg1) {
        field7146++;
        if (arg0 < 66) {
            return -14;
        }
        int var3 = (this.field7143.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field7143[var4 - (-var4 - 1)];
            if (var5 == -1) {
                return -1;
            }
            if (this.field7143[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method2952(byte arg0) {
        field7139 = null;
        if (arg0 != -77) {
            field7140 = null;
        }
        field7140 = null;
        field7147 = null;
        field7145 = null;
        field7142 = null;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([I)V")
    public class489(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field7143 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field7143[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field7143[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field7143[var5 + var5] = arg0[var4];
            this.field7143[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ll;Ljava/awt/Canvas;IB)Lza;")
    public static final class299 method2953(class127 arg0, Canvas arg1, int arg2, byte arg3) {
        if (arg3 != -115) {
            method2952((byte) -117);
        }
        field7144++;
        return new class146(arg2, arg1, arg0);
    }

    static {
        new class179("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field7141 = 0;
        field7142 = new class55(24, 3);
        field7147 = new Rectangle[100];
        for (int var0 = 0; var0 < 100; var0++) {
            field7147[var0] = new Rectangle();
        }
    }
}
