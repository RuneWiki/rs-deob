import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class207 {

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "Lkl;")
    public static class338 field2507;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "[I")
    public static int[] field2508;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "Lfa;")
    public static class347 field2509;

    static {
        new class72("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field2507 = new class338(5000);
        field2508 = new int[5];
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 3)
    public static final String method1264(String arg0, int arg1) {
        field2503++;
        String var2 = class346.method2200(class412.method2551(arg0, (byte) -121), (byte) -4);
        if (arg1 != 7507) {
            field2508 = null;
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)[B", line = 33)
    public static final synchronized byte[] method1265(int arg0, byte arg1) {
        field2504++;
        if (arg1 != -122) {
            return null;
        } else if (arg0 == 100 && class56.field651 > 0) {
            byte[] var2 = class70.field875[--class56.field651];
            class70.field875[class56.field651] = null;
            return var2;
        } else if (arg0 == 5000 && class393.field5355 > 0) {
            byte[] var3 = class378.field5154[--class393.field5355];
            class378.field5154[class393.field5355] = null;
            return var3;
        } else if (arg0 == 30000 && class282.field3684 > 0) {
            byte[] var4 = class259.field3344[--class282.field3684];
            class259.field3344[class282.field3684] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V", line = 71)
    public static void method1266(boolean arg0) {
        if (arg0) {
            field2508 = null;
            field2509 = null;
            field2507 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(IB)Llf;", line = 84)
    public static final class437 method1267(int arg0, byte arg1) {
        field2505++;
        class365 var2 = class131.field1494;
        class437 var3;
        synchronized (class131.field1494) {
            var3 = (class437) class131.field1494.method2295((long) arg0, (byte) 74);
        }
        if (var3 != null) {
            return var3;
        }
        if (arg1 >= -68) {
            method1265(-113, (byte) -99);
        }
        byte[] var4 = class223.field2800.method1794(5860, 32, arg0);
        class437 var5 = new class437();
        if (var4 != null) {
            var5.method2667(-4427, new class242(var4));
        }
        var5.method2668((byte) 78);
        class365 var6 = class131.field1494;
        synchronized (class131.field1494) {
            class131.field1494.method2294(var5, (byte) 60, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[Lc;)V", line = 114)
    public static final void method1268(int arg0, class436[] arg1) {
        field2502++;
        class28.field323 = arg1.length;
        class192.field2257 = new int[class28.field323 + 10];
        class53.field621 = new class436[class28.field323 + 10];
        class114.method666(arg1, 0, class53.field621, 0, class28.field323);
        if (arg0 != -16998) {
            field2509 = null;
        }
        for (int var2 = 0; var2 < class28.field323; var2++) {
            class192.field2257[var2] = class53.field621[var2].method236();
        }
        for (int var3 = class28.field323; var3 < class53.field621.length; var3++) {
            class192.field2257[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 146)
    public static final void method1269(byte arg0) {
        if (arg0 == 9) {
            class306.field4104 = new class270();
            field2506++;
        }
    }
}
