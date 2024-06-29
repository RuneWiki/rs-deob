import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class508 {

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lpg;")
    private class333 field7413;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "J")
    public long field7411;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Lnf;")
    public static class28 field7414;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Lrb;")
    public static class283 field7416;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Lkc;")
    public static class157 field7417;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "[I")
    public static int[] field7420;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field7421;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Z")
    public static boolean field7419;

    static {
        new class157("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field7414 = new class28(5000);
        field7416 = new class283(100, -2);
        field7417 = new class157("K", "T", "K", "K");
        field7420 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field7421 = new String[100];
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 12)
    public static final void method3008(int arg0, byte arg1, String arg2) {
        field7415++;
        class314 var3 = class177.method1213(false, 3, arg0);
        var3.method1808(-7412);
        var3.field4244 = arg2;
        if (arg1 != -88) {
            field7414 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)V", line = 28)
    public static final void method3009(int arg0, int arg1, int arg2, int arg3) {
        class532 var4 = class103.field1632[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class63 var5 = var4.field7833;
        class63 var6 = var4.field7835;
        if (var5 != null) {
            var5.field915 = var5.field915 * arg3 / (0x10 << class295.field3991 - 7);
            var5.field908 = var5.field908 * arg3 / (0x10 << class295.field3991 - 7);
        }
        if (var6 != null) {
            var6.field915 = var6.field915 * arg3 / (0x10 << class295.field3991 - 7);
            var6.field908 = var6.field908 * arg3 / (0x10 << class295.field3991 - 7);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 52)
    public static void method3010(int arg0) {
        field7421 = null;
        field7414 = null;
        field7416 = null;
        if (arg0 == 3) {
            field7417 = null;
            field7420 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(IIII)I", line = 66)
    public static final int method3011(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            method3010(-22);
        }
        field7412++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V", line = 88)
    public static final void method3012(String arg0, int arg1, String arg2) {
        class481.field6957 = arg2;
        field7410++;
        class518.field7611 = arg0;
        if (arg1 != -16759) {
            method3012(null, -6, null);
        }
        if (class225.field3176 != 3 && class481.field6957.equals("") || class518.field7611.equals("")) {
            class355.method2122(127, 3);
            return;
        }
        if (class225.field3176 != 1) {
            class331.field4505 = 0;
            class307.field4171 = -1;
        }
        class66.field954 = false;
        class355.method2122(arg1 ^ 0x4172, -3);
        class526.field7681 = 0;
        class120.field1877 = 0;
        class516.field7579 = 1;
    }

    @OriginalMember(owner = "client!bc", name = "finalize", descriptor = "()V", line = 122)
    protected final void finalize() throws Throwable {
        this.field7413.method2014(0, this.field7411);
        field7409++;
        super.finalize();
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lpg;JI)V", line = 130)
    public class508(class333 arg0, long arg1, int arg2) {
        this.field7413 = arg0;
        this.field7411 = arg1;
    }
}
