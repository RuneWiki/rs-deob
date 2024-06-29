import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class class159 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Lcu;")
    public static class145 field2349 = new class145(20, 8);

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field2359 = 10;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Lvj;")
    public static class304 field2357 = new class304("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public int field2351;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public int field2352;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Lgd;")
    public static class224 field2353;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method1083(int arg0) {
        if (arg0 == 0) {
            field2360++;
            return (this.field2354 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)Z", line = 16)
    public final boolean method1084(byte arg0) {
        int var2 = 26 % ((-arg0 - 69) / 47);
        field2358++;
        return (this.field2354 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V", line = 31)
    public static void method1085(byte arg0) {
        field2353 = null;
        field2349 = null;
        int var1 = 32 / ((arg0 + 54) / 59);
        field2357 = null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)Z", line = 43)
    public final boolean method1086(int arg0) {
        if (arg0 <= 30) {
            return false;
        } else {
            field2350++;
            return (this.field2354 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lmd;B)Lpg;", line = 55)
    public static final class513 method1087(class379 arg0, byte arg1) {
        if (arg1 == -63) {
            field2356++;
            return new class513(arg0.method2202(arg1 - 26309), arg0.method2202(-26372), arg0.method2202(arg1 ^ 0x673D), arg0.method2202(-26372), arg0.method2249((byte) 105), arg0.method2238(255));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)Z", line = 76)
    public final boolean method1088(boolean arg0) {
        field2355++;
        if (arg0) {
            return (this.field2354 & 0x2) != 0;
        } else {
            return true;
        }
    }
}
