import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class34 {

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "Lof;")
    public static class328 field344 = new class328(20);

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    public static int field350 = 0;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "Lss;")
    public static class213 field352 = new class213("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    public static int field354 = 4;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "[S")
    public static short[] field357 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "[I")
    public static int[] field355 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public int field348;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "Lvn;")
    public static class141 field353;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "Z")
    public boolean field345;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static void method214(int arg0) {
        field355 = null;
        field344 = null;
        field357 = null;
        field352 = null;
        field353 = null;
        if (arg0 > -84) {
            method214(48);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
    public static final void method215(int arg0, String arg1, boolean arg2, String arg3, String arg4, String arg5, int arg6, int arg7) {
        field347++;
        for (int var8 = 99; var8 > 0; var8--) {
            class226.field3778[var8] = class226.field3778[var8 - 1];
            class293.field4630[var8] = class293.field4630[var8 - 1];
            class361.field5597[var8] = class361.field5597[var8 - 1];
            class93.field1353[var8] = class93.field1353[var8 - 1];
            class266.field4281[var8] = class266.field4281[var8 - 1];
            class102.field1488[var8] = class102.field1488[var8 - 1];
            class204.field3122[var8] = class204.field3122[var8 - 1];
        }
        class226.field3778[0] = arg6;
        class361.field5597[0] = arg5;
        class293.field4630[0] = arg7;
        class93.field1353[0] = arg4;
        class266.field4281[0] = arg1;
        if (!arg2) {
            method214(-107);
        }
        class102.field1488[0] = arg3;
        class32.field332 = class387.field5910;
        class204.field3122[0] = arg0;
        class419.field6353++;
    }
}
