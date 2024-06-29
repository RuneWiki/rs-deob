import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class161 extends class476 {

    @OriginalMember(owner = "client!s", name = "m", descriptor = "Lhi;")
    public static class45 field2435;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "[Lsv;")
    public static class319[] field2438;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public int field2432;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public int field2434;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Ldk;")
    public static class421 field2436;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[I")
    public int[] field2431;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "[I")
    public static int[] field2437;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method575(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public static void method1134(boolean arg0) {
        if (arg0) {
            method1135(null, 57, -19, -42, null);
        }
        field2437 = null;
        field2436 = null;
        field2438 = null;
        field2435 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Li;III[Z)V")
    public static final void method1135(class197 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class492.field7122 == class36.field554) {
            return;
        }
        int var5 = class348.field5000[arg1].method79(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class11 var7 = class348.field5000[var6];
                if (var7 != null) {
                    var7.method73(arg0, arg2, var5 - var7.method79(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method577(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([[[Lwr;I)V")
    public static final void method1136(class532[][][] arg0, int arg1) {
        int var2 = 0;
        if (arg1 != 6141) {
            field2438 = null;
        }
        while (arg0.length > var2) {
            class532[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class532 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field7838 instanceof class303) {
                            ((class303) var6.field7838).method165(-8698);
                        }
                        if (var6.field7833 instanceof class303) {
                            ((class303) var6.field7833).method165(arg1 ^ 0xFFFFC9FB);
                        }
                        if (var6.field7835 instanceof class303) {
                            ((class303) var6.field7835).method165(-8698);
                        }
                        if (var6.field7830 instanceof class303) {
                            ((class303) var6.field7830).method165(-8698);
                        }
                        if (var6.field7822 instanceof class303) {
                            ((class303) var6.field7822).method165(-8698);
                        }
                        for (class201 var7 = var6.field7828; var7 != null; var7 = var7.field2918) {
                            class434 var8 = var7.field2915;
                            if (var8 instanceof class303) {
                                ((class303) var8).method165(-8698);
                            }
                        }
                    }
                }
            }
            var2++;
        }
        field2433++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method576(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    static {
        new class157("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field2435 = new class45(43, 7);
        new class157(null, "der Spieler ist momentan nicht verfügbar.", null, null);
        new class301("", 73);
        field2438 = new class319[2048];
    }
}
