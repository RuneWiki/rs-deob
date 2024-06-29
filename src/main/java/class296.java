import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class296 extends class297 {

    @OriginalMember(owner = "client!st", name = "k", descriptor = "Lvj;")
    public static class304 field3870 = new class304("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!st", name = "m", descriptor = "Lvj;")
    public static class304 field3872 = new class304(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!st", name = "r", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!st", name = "s", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V")
    public static void method1731(int arg0) {
        if (arg0 <= 104) {
            method1731(-42);
        }
        field3870 = null;
        field3872 = null;
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lbo;)V")
    public class296(class511 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
    public final void method246(int arg0) {
        super.field3881.method3015(arg0 + 7675, false);
        if (arg0 == 6) {
            ++field3866;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lnk;II)V")
    public final void method248(class501 arg0, int arg1, int arg2) {
        ++field3873;
        super.field3881.method2980(arg0, arg1 + 124);
        if (arg1 != 0) {
            field3868 = -11;
        }
        super.field3881.method2976((byte) 54, arg2);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(III)I")
    public static final int method1732(int arg0, int arg1, int arg2) {
        if (arg1 < 61) {
            return -128;
        } else {
            ++field3865;
            int var3 = arg2 * 57 + arg0;
            int var4 = var3 ^ var3 << 13;
            int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
            return 255 & var5 >> 19;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)V")
    public final void method241(boolean arg0, int arg1) {
        if (arg1 != -30965) {
            this.method244(-108, true);
        }
        ++field3871;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IZ)V")
    public final void method244(int arg0, boolean arg1) {
        ++field3867;
        super.field3881.method3015(7681, true);
        if (arg0 != 0) {
            this.method248((class501) null, -96, 22);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZII)V")
    public final void method245(boolean arg0, int arg1, int arg2) {
        ++field3874;
        if (!arg0) {
            method1731(14);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1733(String arg0, int arg1) {
        if (arg1 != 789221) {
            method1732(-110, -111, 46);
        }
        ++field3875;
        if (class265.field3506 != null) {
            class118.method822(-103, class95.field1418);
            ++class96.field1439;
            class193.field2708.method2200(7, class125.method912(arg0, 1));
            class193.field2708.method2216(arg0, arg1 + -789333);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)Z")
    public final boolean method240(boolean arg0) {
        if (arg0) {
            field3877 = 27;
        }
        ++field3876;
        return true;
    }
}
