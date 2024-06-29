import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class305 {

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "Lrc;")
    public static class108 field4327 = new class108(104, -2);

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public int field4331;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public int field4332;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public int field4333;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public int field4334;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "Laf;")
    public static class22 field4337;

    static {
        new class151("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILep;)V", line = 18)
    public static final void method1963(int arg0, class309 arg1) {
        field4326++;
        arg1.field4382 = null;
        int var2 = arg1.field4383.length;
        if (arg0 <= 124) {
            field4337 = null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field4383[var3].field919 = false;
        }
        class262[] var4 = class320.field4513;
        synchronized (class320.field4513) {
            if (var2 < class320.field4513.length && class165.field2404[var2] < 200) {
                class320.field4513[var2].method1765(123, arg1);
                int var10002 = class165.field2404[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V", line = 46)
    public static void method1964(boolean arg0) {
        if (arg0) {
            field4337 = null;
            field4327 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "([BI)[B", line = 58)
    public static final byte[] method1965(byte[] arg0, int arg1) {
        field4336++;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class214.method1449(arg0, arg1, var2, 0, arg0.length);
            return var2;
        }
    }
}
