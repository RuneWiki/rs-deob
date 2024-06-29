import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class435 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Z")
    public static boolean field6347;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Lqh;")
    public static class50 field6351;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lho;")
    public static class103 field6352;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6353;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Z")
    public static boolean field6354;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "J")
    public long field6348;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lpe;")
    public class435 field6344;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Lpe;")
    public class435 field6345;

    static {
        new class305("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field6347 = true;
        field6351 = new class50(8);
        field6352 = new class103(18, 3);
        field6353 = new Color[] { new Color(16777215), new Color(16777215) };
        field6354 = false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Z", line = 12)
    public final boolean method2673(int arg0) {
        if (arg0 >= -75) {
            this.method2674(true);
        }
        field6346++;
        return this.field6345 != null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V", line = 27)
    public final void method2674(boolean arg0) {
        field6350++;
        if (this.field6345 == null) {
            return;
        }
        this.field6345.field6344 = this.field6344;
        this.field6344.field6345 = this.field6345;
        this.field6344 = null;
        if (!arg0) {
            this.field6348 = -99L;
        }
        this.field6345 = null;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 50)
    public static void method2675(int arg0) {
        field6352 = null;
        field6351 = null;
        field6353 = null;
        if (arg0 != 16777215) {
            method2675(125);
        }
    }
}
