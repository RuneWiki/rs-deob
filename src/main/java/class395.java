import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public abstract class class395 extends class287 {

    @OriginalMember(owner = "client!po", name = "u", descriptor = "I")
    public int field5691;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "J")
    public static long field5687 = 0L;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(B)V")
    public static final void method2338(byte arg0) {
        field5689++;
        if (class33.field516) {
            return;
        }
        if (class76.field1075.field3649) {
            class496.field7236 = ((int) class496.field7236 - 17 & 0xFFFFFFF0);
        } else {
            class514.field7533 += (-12.0F - class514.field7533) / 2.0F;
        }
        class33.field516 = true;
        if (arg0 == 106) {
            class163.field2483 = true;
        }
    }

    @OriginalMember(owner = "client!po", name = "f", descriptor = "(I)Z")
    public abstract boolean method290(int arg0);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method2339(String arg0, boolean arg1, String arg2, String arg3) {
        if (arg1) {
            method2338((byte) -94);
        }
        field5690++;
        for (int var4 = arg3.indexOf(arg0); var4 != -1; var4 = arg3.indexOf(arg0, var4 + arg2.length())) {
            arg3 = arg3.substring(0, var4) + arg2 + arg3.substring(var4 + arg0.length());
        }
        return arg3;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2340(int arg0, String arg1) {
        field5688++;
        if (class347.field4994 == null) {
            return;
        }
        class502.field7340++;
        class274.method1602(14, class170.field2590);
        if (arg0 != -9480) {
            field5692 = 4;
        }
        class17.field275.method1891(false, class515.method3047((byte) -93, arg1));
        class17.field275.method1879(32767, arg1);
    }

    @OriginalMember(owner = "client!po", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method289(int arg0);

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(I)V")
    public class395(int arg0) {
        this.field5691 = arg0;
    }

    static {
        new class157("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        new class157("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
    }
}
