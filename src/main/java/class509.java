import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class509 {

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "I")
    public int field7066;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
    public int field7058;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
    public int field7064;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "B")
    public byte field7063;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public int field7060;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
    public int field7065;

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "[Z")
    public static boolean[] field7067 = new boolean[100];

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "[Lef;")
    public static class531[] field7069 = new class531[32];

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "Lbv;")
    public static class567 field7062 = new class567("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "F")
    public static float field7059;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "Lfc;")
    public class320 field7070;

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "Lar;")
    public class4 field7072;

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "Lnl;")
    public class532 field7068;

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "Lmn;")
    public class60 field7071;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)V")
    public static void method2861(byte arg0) {
        field7067 = null;
        if (arg0 != -127) {
            field7059 = -1.4121563F;
        }
        field7062 = null;
        field7069 = null;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Lnt;")
    public static final class453 method2862(Canvas arg0, boolean arg1) {
        field7061++;
        try {
            Class var2 = Class.forName("se");
            class453 var3 = (class453) var2.getDeclaredConstructor().newInstance();
            var3.method1289((byte) -72, arg0);
            if (!arg1) {
                field7059 = 1.2761995F;
            }
            return var3;
        } catch (Throwable var5) {
            class551 var4 = new class551();
            var4.method1289((byte) -72, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(BIIIII)V")
    public class509(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7066 = arg5;
        this.field7058 = arg2;
        this.field7064 = arg1;
        this.field7063 = arg0;
        this.field7060 = arg3;
        this.field7065 = arg4;
    }
}
