import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class279 {

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lpa;")
    public static class254 field3960;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "[Lnd;")
    public static class387[] field3962;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lof;")
    public static class446 field3963;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3965;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lip;")
    public static class508 field3966;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3961;

    static {
        new class446("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field3960 = new class254(12, 7);
        field3962 = new class387[4];
        field3964 = 0;
        field3963 = new class446("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");
        field3965 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field3966 = new class508("", 11);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I", line = 5)
    public static final int method1790(int arg0) {
        int var1 = 41 / ((arg0 + 51) / 50);
        field3961++;
        class330 var2 = class112.field1560;
        synchronized (class112.field1560) {
            return class112.field1560.method2137(0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 19)
    public static void method1791(byte arg0) {
        field3966 = null;
        field3963 = null;
        field3960 = null;
        int var1 = 94 % ((-arg0 - 18) / 62);
        field3962 = null;
        field3965 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIBI)I", line = 35)
    public static final int method1792(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3958++;
        int var5 = 65536 - class428.field6501[arg4 * 8192 / arg1] >> 1;
        if (arg3 <= 44) {
            field3964 = 3;
        }
        return ((65536 - var5) * arg0 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIB)V", line = 59)
    public static final void method1793(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3959++;
        class177 var5 = class344.method2229(10, arg1, (byte) 92);
        var5.method1191(119);
        var5.field2372 = arg0;
        var5.field2374 = arg2;
        int var6 = -44 % ((2 - arg4) / 41);
        var5.field2369 = arg3;
    }
}
