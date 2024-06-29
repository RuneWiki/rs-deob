import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class28 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lwm;")
    public static class152 field474 = class157.method1048("(U0a )2 via: ", 93);

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field477 = -2;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Z")
    public static boolean field481 = false;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field483 = 0;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lbi;")
    public static class84 field479 = new class84(0, -1);

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Z")
    public static boolean field484 = true;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static volatile int field486 = -1;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field487 = 0;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field488 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILah;)V", line = 8)
    public static final void method224(int arg0, class205 arg1) {
        if (arg0 < 41) {
            method224(-115, (class205) null);
        }
        field482++;
        class30.field507 = arg1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 20)
    public static void method225(byte arg0) {
        field479 = null;
        field474 = null;
        if (arg0 <= 24) {
            field474 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[B", line = 33)
    public static final byte[] method226(int arg0, int arg1) {
        field478++;
        if (arg1 != 255) {
            method227(-31, (class205) null);
        }
        class20 var2 = (class20) class63.field948.method1663((long) arg0, (byte) -17);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class137.method870(var4, var7, (byte) -112);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class20(var3);
            class63.field948.method1662(var2, (long) arg0, -74);
        }
        return var2.field269;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(ILah;)I", line = 108)
    public static final int method227(int arg0, class205 arg1) {
        if (arg0 != 512) {
            method229(-26, (class152) null);
        }
        field480++;
        int var2 = 0;
        if (arg1.method1361(-1, class180.field2871)) {
            var2++;
        }
        if (arg1.method1361(-1, class48.field753)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V", line = 127)
    public static final void method228(int arg0, int arg1) {
        field475++;
        if (arg1 >= 76) {
            class227.field3678.method1617(arg0, 50);
            class120.field1695.method1617(arg0, 50);
            class320.field5588.method1617(arg0, 50);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILwm;)V", line = 141)
    public static final void method229(int arg0, class152 arg1) {
        class92.method607(true, false);
        int var2 = -17 % ((arg0 + 55) / 47);
        class114.method761(arg1, 0);
        field476++;
    }
}
