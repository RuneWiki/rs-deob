import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class165 {

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Lch;")
    public static class151 field2402;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "[I")
    public static int[] field2404;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Z")
    public static boolean field2399;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[I")
    public int[] field2400;

    static {
        new class151("Use", "Benutzen", "Utiliser", "Usar");
        field2403 = -2;
        field2402 = new class151("Drop", "Fallen lassen", "Poser", "Largar");
        field2404 = new int[5];
        new class151("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1212(boolean arg0) {
        field2404 = null;
        if (arg0) {
            field2406 = -33;
        }
        field2402 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method962(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method966(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V")
    public abstract void method964(int arg0, Graphics arg1, int arg2, int arg3, byte arg4, int arg5);
}
