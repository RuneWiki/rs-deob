import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class513 extends class309 {

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "Lka;")
    public static class331 field7471;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "[Lo;")
    public static class24[] field7468;

    static {
        new class305("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field7471 = new class331(2);
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(IIIIIF)V", line = 4)
    public class513(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IF)V", line = 15)
    public final void method362(int arg0, float arg1) {
        ++field7469;
        super.field4134 = arg1;
        int var3 = -8 / ((22 - arg0) / 50);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V", line = 33)
    public static void method3063(boolean arg0) {
        field7468 = null;
        if (arg0) {
            field7471 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZIII)I", line = 44)
    public static final int method3064(boolean arg0, int arg1, int arg2, int arg3) {
        ++field7470;
        if (~class181.field2356 > -101) {
            return -2;
        } else {
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            if (!arg0) {
                method3063(true);
            }
            int var6 = -class416.field6009 + arg1;
            int var7 = -class416.field6020 + arg3;
            for (class519 var8 = (class519) class416.field5994.method970(12); var8 != null; var8 = (class519) class416.field5994.method976((byte) 93)) {
                if (var8.field7646 == arg2) {
                    int var9 = var8.field7651;
                    int var10 = var8.field7648;
                    int var11 = class416.field6009 + var9 << 14 | class416.field6020 + var10;
                    int var12 = (-var9 + var6) * (-var9 + var6) + (-var10 + var7) * (-var10 + var7);
                    if (var4 < 0 || var5 > var12) {
                        var4 = var11;
                        var5 = var12;
                    }
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZ)V", line = 92)
    public final void method365(int arg0, int arg1, int arg2, boolean arg3) {
        super.field4143 = arg1;
        super.field4136 = arg2;
        super.field4142 = arg0;
        if (!arg3) {
            ++field7467;
        }
    }
}
