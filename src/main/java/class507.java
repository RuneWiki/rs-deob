import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class507 extends class530 {

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "I")
    public int field7413 = -1;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "[I")
    public static int[] field7412 = new int[13];

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "[I")
    public static int[] field7421 = new int[13];

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "Lgf;")
    public static class180 field7419 = new class180("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "Lvp;")
    public static class123 field7423 = new class123(54, 12);

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
    public int field7415;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "Lf;")
    public static class528 field7414;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "Ljava/lang/String;")
    public String field7416;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "Ljava/lang/String;")
    public String field7420;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "[J")
    public static long[] field7422;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIILqd;)V", line = 5)
    public static final void method2998(int arg0, int arg1, int arg2, class311 arg3) {
        class165 var4 = class524.method3094(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field2487 = arg3;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V", line = 11)
    public static void method2999(byte arg0) {
        field7422 = null;
        field7419 = null;
        field7423 = null;
        int var1 = 125 % ((arg0 - -67) / 49);
        field7421 = null;
        field7414 = null;
        field7412 = null;
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)Lbj;", line = 29)
    public final class159 method3000(int arg0) {
        if (arg0 > -12) {
            return null;
        } else {
            ++field7418;
            return class108.field1680[super.field7823];
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)Lnh;", line = 52)
    public static final class524 method3001(int arg0, int arg1, int arg2) {
        class165 var3 = class36.field545[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2484;
    }
}
