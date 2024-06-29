import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class263 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lwi;")
    public static class340 field3652 = new class340(13, 0, 1, 0);

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field3675 = 0;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Lcm;")
    public static class449 field3658 = new class449(29, 7);

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "Lui;")
    public static class375 field3676 = new class375("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "B")
    public byte field3655;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "B")
    public byte field3656;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "B")
    public byte field3660;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "B")
    public byte field3661;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "B")
    public byte field3664;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "B")
    public byte field3671;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "B")
    public byte field3673;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public int field3659;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public int field3666;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "S")
    public short field3668;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Z")
    public boolean field3653;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Z")
    public boolean field3654;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "Z")
    public boolean field3663;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Z")
    public boolean field3665;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "Z")
    public boolean field3667;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "Z")
    public boolean field3669;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "Z")
    public boolean field3670;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "Z")
    public boolean field3672;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "Z")
    public boolean field3674;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljb;I)Ljava/lang/String;")
    public static final String method1694(class499 arg0, int arg1) {
        int var2 = 28 / ((-arg1 - 6) / 41);
        field3657++;
        if (client.method450(arg0).method2394(true) == 0) {
            return null;
        } else if (arg0.field7406 == null || arg0.field7406.trim().length() == 0) {
            return class197.field2788 ? "Hidden-use" : null;
        } else {
            return arg0.field7406;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static void method1695(int arg0) {
        field3652 = null;
        field3676 = null;
        int var1 = 111 / ((arg0 - 34) / 62);
        field3658 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljb;IZ)Ljava/lang/String;")
    public static final String method1696(class499 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field3676 = null;
        }
        field3662++;
        if (!client.method450(arg0).method2398(arg1, -27896) && arg0.field7381 == null) {
            return null;
        } else if (arg0.field7439 == null || arg0.field7439.length <= arg1 || arg0.field7439[arg1] == null || arg0.field7439[arg1].trim().length() == 0) {
            return class197.field2788 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field7439[arg1];
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Z")
    public static final boolean method1697(int arg0, int arg1, int arg2) {
        int var3 = class470.field6873[arg0][arg1][arg2];
        if (-class168.field2444 == var3) {
            return false;
        } else if (class168.field2444 == var3) {
            return true;
        } else {
            int var4 = arg1 << class386.field5882;
            int var5 = arg2 << class386.field5882;
            if (class421.method2537(var4 + 1, class455.field6683[arg0].method849(arg1, arg2), var5 + 1) && class421.method2537(class215.field2995 + var4 - 1, class455.field6683[arg0].method849(arg1 + 1, arg2), var5 + 1) && class421.method2537(class215.field2995 + var4 - 1, class455.field6683[arg0].method849(arg1 + 1, arg2 + 1), class215.field2995 + var5 - 1) && class421.method2537(var4 + 1, class455.field6683[arg0].method849(arg1, arg2 + 1), class215.field2995 + var5 - 1) && class421.method2537(class380.field5804 + var4, class455.field6683[arg0].method849(arg1, arg2), var5 + 1) && class421.method2537(class215.field2995 + var4 - 1, class455.field6683[arg0].method849(arg1 + 1, arg2), class380.field5804 + var5) && class421.method2537(class380.field5804 + var4, class455.field6683[arg0].method849(arg1, arg2 + 1), class215.field2995 + var5 - 1) && class421.method2537(class215.field2995 + var4 - 1, class455.field6683[arg0].method849(arg1, arg2), class380.field5804 + var5) && class421.method2537(class380.field5804 + var4, class455.field6683[arg0].method849(arg1, arg2), class380.field5804 + var5)) {
                class470.field6873[arg0][arg1][arg2] = class168.field2444;
                return true;
            } else {
                class470.field6873[arg0][arg1][arg2] = -class168.field2444;
                return false;
            }
        }
    }
}
