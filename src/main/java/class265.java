import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public abstract class class265 extends class274 {

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field3904 = -1;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "[[B")
    public static byte[][] field3906 = new byte[1000][];

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "Lgk;")
    public static class331 field3911 = new class331("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "[I")
    public static int[] field3913 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "Lfa;")
    public static class156 field3912 = new class156(8);

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "Let;")
    public static class419 field3909;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "[[B")
    public static byte[][] field3914;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)Lim;")
    public abstract class401 method1708(int arg0);

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)V")
    public static final void method1709(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3907++;
        class472.field6970.field827 = 0;
        if (arg3 != 4) {
            method1713(true);
        }
        class472.field6970.method638(arg3 ^ 0xFB, class215.field3089.field3575);
        class472.field6970.method638(255, arg1);
        class472.field6970.method638(arg3 + 251, arg0);
        class472.field6970.method611((byte) 67, arg2);
        class472.field6970.method611((byte) 67, arg4);
        class4.field62 = 0;
        class175.field2485 = 0;
        class247.field3669 = -3;
        class72.field989 = 1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLjava/awt/Canvas;ILet;Lga;)Lya;")
    public static final class38 method1710(byte arg0, Canvas arg1, int arg2, class419 arg3, class277 arg4) {
        int var5 = 44 / ((arg0 - 36) / 37);
        field3905++;
        return new class163(arg2, arg1, arg4, arg3);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILiv;)Lob;")
    public static final class517 method1711(int arg0, class65 arg1) {
        field3910++;
        return arg0 == 2 ? new class517(arg1.method599((byte) 1), arg1.method599((byte) 1), arg1.method599((byte) 1), arg1.method599((byte) 1), arg1.method580((byte) 29), arg1.method580((byte) 29), arg1.method577(255)) : null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1712(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3908++;
        int var8 = -111 / ((arg2 - 25) / 33);
        int var9 = class332.method2034(class401.field5947, -24309, arg4, class471.field6963);
        int var10 = class332.method2034(class401.field5947, -24309, arg7, class471.field6963);
        int var11 = class332.method2034(class126.field1842, -24309, arg0, class72.field992);
        int var12 = class332.method2034(class126.field1842, -24309, arg6, class72.field992);
        int var13 = class332.method2034(class401.field5947, -24309, arg4 + arg3, class471.field6963);
        int var14 = class332.method2034(class401.field5947, -24309, arg7 - arg3, class471.field6963);
        for (int var15 = var9; var15 < var13; var15++) {
            class531.method3136(var11, 126, arg1, var12, class141.field1996[var15]);
        }
        for (int var16 = var10; var16 > var14; var16--) {
            class531.method3136(var11, -106, arg1, var12, class141.field1996[var16]);
        }
        int var17 = class332.method2034(class126.field1842, -24309, arg0 + arg3, class72.field992);
        int var18 = class332.method2034(class126.field1842, -24309, arg6 - arg3, class72.field992);
        for (int var19 = var13; var19 <= var14; var19++) {
            int[] var20 = class141.field1996[var19];
            class531.method3136(var11, -15, arg1, var17, var20);
            class531.method3136(var17, 123, arg5, var18, var20);
            class531.method3136(var18, -16, arg1, var12, var20);
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)V")
    public static void method1713(boolean arg0) {
        if (!arg0) {
            return;
        }
        field3911 = null;
        field3914 = null;
        field3913 = null;
        field3912 = null;
        field3906 = null;
        field3909 = null;
    }
}
