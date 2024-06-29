import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class521 extends class320 {

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Ljava/lang/String;")
    public String field7736;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field7735 = 0;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Lpi;")
    public static class342 field7738 = new class342("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Lko;")
    public static class347 field7739 = new class347("WIP", 2);

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "F")
    public static float field7733;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "[I")
    public static int[] field7737;

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V", line = 8)
    public class521() {
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)[Lef;", line = 12)
    public static final class335[] method3107(byte arg0) {
        int var1 = -44 / ((56 - arg0) / 33);
        field7734++;
        return new class335[] { class463.field6936, class129.field2049, class64.field1094, class367.field5547, class399.field6020, class318.field4780, class429.field6378, class530.field7801, class60.field1057, class130.field2064, class503.field7416, class370.field5605, class183.field2750, class247.field3562 };
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 24)
    public class521(String arg0) {
        this.field7736 = arg0;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V", line = 33)
    public static void method3108(int arg0) {
        field7739 = null;
        if (arg0 != 0) {
            method3108(-47);
        }
        field7737 = null;
        field7738 = null;
    }
}
