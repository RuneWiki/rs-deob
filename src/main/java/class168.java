import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class168 extends class8 {

    @OriginalMember(owner = "client!va", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field2777 = new String[500];

    @OriginalMember(owner = "client!va", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2778 = "cyan:";

    @OriginalMember(owner = "client!va", name = "O", descriptor = "Ldb;")
    public static class102 field2779 = new class102(16);

    @OriginalMember(owner = "client!va", name = "R", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2782 = Calendar.getInstance();

    @OriginalMember(owner = "client!va", name = "P", descriptor = "C")
    private char field2780;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public int field2773;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Ljava/lang/String;")
    public String field2776;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIZI[Log;B)V", line = 12)
    public static final void method1224(int arg0, int arg1, boolean arg2, int arg3, class157[] arg4, byte arg5) {
        field2775++;
        int var6 = 0;
        if (arg5 != 14) {
            method1226(26);
        }
        while (var6 < arg4.length) {
            class157 var7 = arg4[var6];
            if (var7 != null && var7.field2463 == arg3) {
                class224.method1594(arg2, arg1, var7, arg0, 0);
                class8.method41(arg1, arg0, arg5 - 14, var7);
                if (var7.field2591 > (var7.field2528 - var7.field2520)) {
                    var7.field2591 = var7.field2528 - var7.field2520;
                }
                if (var7.field2591 < 0) {
                    var7.field2591 = 0;
                }
                if (var7.field2499 > var7.field2597 - var7.field2468) {
                    var7.field2499 = var7.field2597 - var7.field2468;
                }
                if (var7.field2499 < 0) {
                    var7.field2499 = 0;
                }
                if (var7.field2478 == 0) {
                    class109.method758(arg2, var7, 27);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIJ)Z", line = 60)
    public static final boolean method1225(int arg0, int arg1, int arg2, long arg3) {
        class204 var5 = class324.field5032[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3364 != null && var5.field3364.field3595 == arg3) {
            return true;
        } else if (var5.field3342 != null && var5.field3342.field488 == arg3) {
            return true;
        } else if (var5.field3347 != null && var5.field3347.field1729 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3360; var6++) {
                if (var5.field3343[var6].field2358 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V", line = 88)
    public static void method1226(int arg0) {
        if (arg0 != -2390) {
            field2778 = (String) null;
        }
        field2782 = null;
        field2778 = null;
        field2779 = null;
        field2777 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLjj;I)V", line = 101)
    private final void method1227(boolean arg0, class44 arg1, int arg2) {
        field2772++;
        if (arg0) {
            return;
        }
        if (arg2 == 1) {
            this.field2780 = class213.method1534(arg1.method246((byte) -77), -117);
        } else if (arg2 == 2) {
            this.field2773 = arg1.method238((byte) 82);
        } else if (arg2 == 5) {
            this.field2776 = arg1.method265(0);
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)Z", line = 130)
    public final boolean method1228(int arg0) {
        if (arg0 != 16) {
            method1224(-83, 65, false, 117, (class157[]) null, (byte) -15);
        }
        field2781++;
        return this.field2780 == 's';
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjj;)V", line = 148)
    public final void method1229(int arg0, class44 arg1) {
        if (arg0 != -3105) {
            field2782 = (Calendar) null;
        }
        field2774++;
        while (true) {
            int var3 = arg1.method286((byte) -75);
            if (var3 == 0) {
                return;
            }
            this.method1227(false, arg1, var3);
        }
    }
}
