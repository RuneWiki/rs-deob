import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class232 extends class147 {

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public int field3212;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public int field3218;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public int field3214;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "Z")
    public boolean field3217;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public int field3213;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public int field3216;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "[I")
    public static int[] field3219;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Lsd;")
    public static class74 field3222;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static void method1279(int arg0) {
        if (arg0 != -1) {
            method1280((byte) 71);
        }
        field3219 = null;
        field3222 = null;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
    public static final void method1280(byte arg0) {
        field3215++;
        int var1 = -60 / ((arg0 + 2) / 62);
        for (class41 var2 = (class41) class56.field712.method802((byte) 121); var2 != null; var2 = (class41) class56.field712.method806((byte) 104)) {
            if (var2.field497 > 0) {
                var2.field497--;
            }
            if (var2.field497 != 0) {
                if (var2.field486 > 0) {
                    var2.field486--;
                }
                if (var2.field486 == 0 && var2.field495 >= 1 && var2.field490 >= 1 && (class159.field1895 - 2) >= var2.field495 && class289.field4316 - 2 >= var2.field490 && (var2.field481 < 0 || class85.method432(var2.field487, -6, var2.field481))) {
                    class214.method1202(var2.field483, -2, var2.field490, var2.field488, var2.field481, var2.field495, var2.field489, var2.field487, -1);
                    var2.field486 = -1;
                    if (var2.field485 == var2.field481 && var2.field485 == -1) {
                        var2.method702((byte) -114);
                    } else if (var2.field485 == var2.field481 && var2.field492 == var2.field483 && var2.field487 == var2.field482) {
                        var2.method702((byte) -114);
                    }
                }
            } else if (var2.field485 < 0 || class85.method432(var2.field482, -6, var2.field485)) {
                class214.method1202(var2.field492, -2, var2.field490, var2.field488, var2.field485, var2.field495, var2.field489, var2.field482, -1);
                var2.method702((byte) -114);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIIIIZ)V")
    public class232(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3212 = arg0;
        this.field3218 = arg1;
        this.field3214 = arg2;
        this.field3217 = arg5;
        this.field3213 = arg4;
        this.field3216 = arg3;
    }

    static {
        new class40("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field3219 = new int[250];
        field3220 = -1;
        field3221 = 0;
        field3222 = new class74(13, -2);
    }
}
