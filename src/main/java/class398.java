import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class398 extends class424 {

    @OriginalMember(owner = "client!jn", name = "R", descriptor = "Z")
    public static boolean field5508 = false;

    @OriginalMember(owner = "client!jn", name = "P", descriptor = "Lca;")
    public static class416 field5506 = new class416();

    @OriginalMember(owner = "client!jn", name = "U", descriptor = "Lhc;")
    public static class368 field5511;

    @OriginalMember(owner = "client!jn", name = "V", descriptor = "Lcp;")
    public static class399 field5512;

    @OriginalMember(owner = "client!jn", name = "X", descriptor = "Lka;")
    public static class408 field5514;

    @OriginalMember(owner = "client!jn", name = "Y", descriptor = "[[[I")
    public static int[][][] field5515;

    @OriginalMember(owner = "client!jn", name = "L", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!jn", name = "N", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!jn", name = "O", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!jn", name = "Q", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!jn", name = "S", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!jn", name = "T", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!jn", name = "W", descriptor = "Lcr;")
    public static class191 field5513;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "(I)V")
    public static void method2464(int arg0) {
        field5506 = null;
        field5513 = null;
        field5515 = null;
        field5514 = null;
        if (arg0 == 9019) {
            field5512 = null;
            field5511 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
    public class398() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "(I)V")
    public static final void method2465(int arg0) {
        ++field5510;
        class408 var1 = class261.field3601;
        synchronized (class261.field3601) {
            class261.field3601.method2522((byte) 62);
        }
        if (arg0 == 0) {
            class408 var2 = class68.field965;
            synchronized (class68.field965) {
                class68.field965.method2522((byte) 27);
            }
            class408 var3 = class147.field2135;
            synchronized (class147.field2135) {
                class147.field2135.method2522((byte) 119);
            }
            class408 var4 = class326.field4433;
            synchronized (class326.field4433) {
                class326.field4433.method2522((byte) 14);
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(III)I")
    private final int method2466(int arg0, int arg1, int arg2) {
        ++field5507;
        int var4 = arg2 * 57 + arg1;
        int var5 = var4 ^ var4 << 1;
        if (arg0 < 8) {
            field5506 = null;
        }
        return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        ++field5504;
        if (arg1 != -10) {
            return null;
        } else {
            int[] var3 = super.field5892.method783(arg0, (byte) -32);
            if (super.field5892.field1427) {
                int var4 = class409.field5711[arg0];
                for (int var5 = 0; ~class303.field4135 < ~var5; ++var5) {
                    var3[var5] = this.method2466(59, class332.field4478[var5], var4) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILjq;)V")
    public static final void method2467(int arg0, class185 arg1) {
        ++field5503;
        if (arg1 instanceof class419) {
            class419 var2 = (class419) arg1;
            if (var2.field5807 != null) {
                class237.method1551(true, var2);
            }
        } else {
            if (!(arg1 instanceof class423)) {
                return;
            }
            class157.method1140(11532, (class423) arg1);
        }
        if (arg0 > -88) {
            field5514 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI)V")
    public static final void method2468(byte arg0, int arg1) {
        class408 var2 = class219.field3072;
        synchronized (class219.field3072) {
            class219.field3072.method2531(arg1, 112);
            if (arg0 <= 61) {
                field5508 = false;
            }
        }
        ++field5509;
        class408 var3 = class445.field6237;
        synchronized (class445.field6237) {
            class445.field6237.method2531(arg1, 112);
        }
        class408 var4 = class218.field3060;
        synchronized (class218.field3060) {
            class218.field3060.method2531(arg1, 112);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZIIIIIIIII)Z")
    public static final boolean method2469(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field5505;
        int var11 = class405.method2501(arg6, arg10, class241.field3412, class403.field5567[class343.field4623], class359.field4970.method1285(-69), class112.field1730, arg3, arg4, arg2, arg1, arg0, (byte) 121, arg5, arg7, arg8);
        if (~var11 > -2) {
            return false;
        } else {
            class93.field1300 = class241.field3412[var11 - 1];
            int var12 = -36 % ((34 - arg9) / 53);
            class233.field3265 = class112.field1730[var11 + -1];
            class399.field5526 = false;
            class49.method404(-119);
            return true;
        }
    }

    static {
        new class368("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field5511 = new class368("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");
        field5512 = new class399();
        field5514 = new class408(64);
        new class368("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field5515 = new int[2][][];
    }
}
