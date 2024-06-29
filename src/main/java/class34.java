import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class class34 extends class203 {

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public int field533;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "[I")
    public static int[] field527;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "[I")
    public static int[] field532;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "[B")
    public static byte[] field529;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "[[Z")
    public static boolean[][] field528;

    static {
        new class442("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field527 = new int[500];
        field532 = new int[2500];
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(I)V", line = 6)
    public static void method333(int arg0) {
        if (arg0 == 16987) {
            field528 = null;
            field532 = null;
            field527 = null;
            field529 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(B)Lwj;", line = 20)
    public static final class224 method334(byte arg0) {
        field535++;
        try {
            if (arg0 != -80) {
                method334((byte) -42);
            }
            return (class224) Class.forName("va").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII)V", line = 44)
    public static final void method335(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 << 3;
        int var5 = arg1 << 3;
        field524++;
        int var6 = arg2 << 3;
        if (class128.field1807 == 2) {
            class329.field4568 = var6;
            class369.field5199 = var5;
            class155.field2192 = var4;
        }
        if (arg0 >= -2) {
            method337(true, (byte) -10);
        }
        class24.field416 = (float) var6;
        class333.field4599 = (float) var5;
        class3.method14((byte) 126);
        class128.field1806 = true;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BZI)V", line = 73)
    public static final void method336(byte arg0, boolean arg1, int arg2) {
        field531++;
        if (arg2 == 0) {
            class64.field949 = class345.method2183(class304.field4191, -108, class241.field3426, arg2, class163.field2253, class403.field5720 * 2);
        } else {
            if (arg1) {
                class64.field949 = class345.method2183(class304.field4191, -120, class241.field3426, 0, class163.field2253, 0);
                class64.field949.method114(0);
                class337 var3 = class282.method1837(class260.field3643, class157.field2215, (byte) 124, 0);
                class357 var4 = class64.field949.method76(var3, class238.method1617(class212.field2969, class157.field2215, 0), true);
                class427.method2692(var4, 105, true, class80.field1149.method2763(-113, class210.field2935));
                class64.field949.method118();
                class21.method281(0);
                class64.field949.method2190(false);
            }
            try {
                class64.field949 = class345.method2183(class304.field4191, -125, class241.field3426, arg2, class163.field2253, class403.field5720 * 2);
            } catch (Throwable var7) {
                arg2 = 0;
                class64.field949 = class345.method2183(class304.field4191, -125, class241.field3426, 0, class163.field2253, 0);
            }
        }
        if (class64.field949.method93()) {
            class423 var5 = class64.field949.method65(134217728);
            class64.field949.method77(var5);
        }
        class326.field4462 = arg2;
        class141.method970(255);
        if (!class64.field949.method69()) {
            class13.field264 = 1;
        }
        class64.field949.method94(class13.field264);
        if (arg0 <= 92) {
            method334((byte) -99);
        }
        class64.field949.method110(0);
        class335.field4613 = class64.field949.method101();
        class423.field5985 = class64.field949.method101();
        int var6 = (int) ((double) class211.field2954 * 34.46D);
        if (class64.field949.method91()) {
            var6 += 128;
        }
        class64.field949.method47(50, var6);
        class64.field949.method55(!class414.field5867);
        if (class64.field949.method140()) {
            class173.method1137(-127, class288.field4049);
        }
        class148.field2094 = !class51.method428(-1);
        class126.method858(class290.field4061 >> 3, class211.field2954 >> 3, class64.field949, false);
        class9.method146(-22904);
        class328.field4537 = false;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIII)V", line = 160)
    public class34(int arg0, int arg1, int arg2, int arg3) {
        this.field533 = arg0;
        this.field525 = arg2;
        this.field523 = arg3;
        this.field534 = arg1;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZB)V", line = 171)
    public static final void method337(boolean arg0, byte arg1) {
        field526++;
        if (arg1 <= 61) {
            field536 = -91;
        }
        class288.field4044 = arg0;
        class148.field2094 = !class51.method428(-1);
    }
}
