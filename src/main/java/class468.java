import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class468 extends class181 {

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public int field6770 = -1;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "Lkc;")
    public static class157 field6769 = new class157("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public int field6762;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "Ldk;")
    public static class421 field6768;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "Ljava/lang/String;")
    public String field6766;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "Ljava/lang/String;")
    public String field6767;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)Lov;", line = 3)
    public final class279 method2720(int arg0) {
        if (arg0 != -13708) {
            this.field6766 = null;
        }
        ++field6765;
        return class475.field6869[super.field2690];
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V", line = 14)
    public static final void method2721(int arg0) {
        ++field6764;
        class236.method1442(35);
        class71.method568(class76.field1075.field3656, false, 2, 22050);
        class223.field3146 = class399.method2362(class415.field6025, 22050, class346.field4985, arg0, arg0 ^ -95);
        class223.field3146.method3020(class63.field920, (byte) 87);
        class515.field7534 = class399.method2362(class415.field6025, 2048, class346.field4985, 1, -98);
        class515.field7534.method3020(class290.field3924, (byte) 87);
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)V", line = 33)
    public static void method2722(int arg0) {
        if (arg0 < -51) {
            field6769 = null;
            field6768 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 50)
    public static final String method2723(long arg0, int arg1) {
        ++field6763;
        if (arg0 > 0L && arg0 < 6582952005840035281L) {
            if (~(arg0 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 90 % ((arg1 - -35) / 37);
                int var4 = 0;
                for (long var5 = arg0; var5 != 0L; var5 /= 37L) {
                    ++var4;
                }
                StringBuffer var7 = new StringBuffer(var4);
                while (arg0 != 0L) {
                    long var8 = arg0;
                    arg0 /= 37L;
                    var7.append(class197.field2895[(int) (var8 - arg0 * 37L)]);
                }
                return var7.reverse().toString();
            }
        } else {
            return null;
        }
    }
}
