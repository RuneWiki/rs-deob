import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class153 {

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field3312 = 0;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lic;")
    private static class59 field3309 = class59.method433(0, "Your account is already logged in)3");

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lic;")
    public static class59 field3307 = field3309;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field3314 = 0;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Lic;")
    private static class59 field3317 = class59.method433(0, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lic;")
    private static class59 field3316 = class59.method433(0, "Players");

    @OriginalMember(owner = "client!w", name = "o", descriptor = "[Luc;")
    public static class142[] field3320 = new class142[50];

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lic;")
    public static class59 field3318 = field3317;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static volatile int field3321 = 0;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lic;")
    public static class59 field3319 = field3316;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lm;")
    public static class83 field3313 = new class83();

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field3324 = 0;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lic;")
    public static class59 field3323 = class59.method433(0, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Ljava/util/Random;")
    public static Random field3322 = new Random();

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Lic;")
    public static class59 field3325 = class59.method433(0, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Lic;")
    private static class59 field3327 = class59.method433(0, "Prepared sound engine");

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Lic;")
    public static class59 field3326 = field3327;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lfd;")
    public static class40 field3308;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1121(int arg0) {
        field3320 = null;
        field3325 = null;
        if (arg0 >= -59) {
            return;
        }
        field3323 = null;
        field3308 = null;
        field3317 = null;
        field3327 = null;
        field3316 = null;
        field3307 = null;
        field3309 = null;
        field3319 = null;
        field3318 = null;
        field3326 = null;
        field3322 = null;
        field3313 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)I")
    public static final int method1122(int arg0, int arg1, int arg2) {
        field3311++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 / 128;
        if (var3 < arg0) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method1123(boolean arg0, Object arg1, int arg2) {
        field3315++;
        if (arg1 == null) {
            return null;
        } else if (arg2 != 2) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class114.method920(-95, var3) : var3;
        } else if (arg1 instanceof class96) {
            class96 var4 = (class96) arg1;
            return var4.method792(false);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
