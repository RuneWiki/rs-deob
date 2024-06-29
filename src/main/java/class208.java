import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class208 {

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "Z")
    public boolean field3397 = false;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "[I")
    public static int[] field3399 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "Z")
    public static boolean field3403 = false;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "Z")
    public static boolean field3408 = false;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field3407 = 0;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "[I")
    public static int[] field3411 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public int field3398;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "Lea;")
    public static class217 field3405;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "[Lug;")
    public static class321[] field3410;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lim;IB)V", line = 10)
    public final void method1519(class192 arg0, int arg1, byte arg2) {
        if (arg2 != -80) {
            field3411 = (int[]) null;
        }
        field3396++;
        while (true) {
            int var4 = arg0.method1399(arg2 - 1172389704);
            if (var4 == 0) {
                return;
            }
            this.method1520(arg0, arg1, (byte) 73, var4);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lim;IBI)V", line = 31)
    private final void method1520(class192 arg0, int arg1, byte arg2, int arg3) {
        field3406++;
        if (arg3 == 1) {
            this.field3398 = arg0.method1396(-73);
        } else if (arg3 == 2) {
            this.field3409 = arg0.method1378(false);
        } else if (arg3 == 3) {
            this.field3397 = true;
        } else if (arg3 == 4) {
            this.field3398 = -1;
        }
        if (arg2 <= 23) {
            field3403 = false;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V", line = 59)
    public static final void method1521(int arg0, int arg1) {
        field3400++;
        class179 var2 = class319.method2220(arg0, (byte) -127, 9);
        var2.method1239(true);
        if (arg1 != 10034) {
            method1521(24, 112);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V", line = 89)
    public static void method1522(byte arg0) {
        field3405 = null;
        field3411 = null;
        if (arg0 != -123) {
            method1521(102, -83);
        }
        field3399 = null;
        field3410 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZI)Lag;", line = 114)
    public final class123 method1523(int arg0, boolean arg1, int arg2) {
        class123 var4 = (class123) class302.field4719.method1619((long) ((arg1 ? 262144 : 0) | this.field3398 | arg2 << 16), 101);
        field3402++;
        if (var4 != null) {
            return var4;
        }
        class324.field5063.method246(false, this.field3398);
        class123 var5 = class81.method599((byte) 73, this.field3398, 0, class324.field5063);
        if (var5 != null) {
            var5.method850(class281.field4430, class31.field439, class313.field4881);
            var5.field4028 = var5.field4039;
            var5.field4027 = var5.field4037;
            if (arg1) {
                var5.method859();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method855();
            }
            class302.field4719.method1621((long) ((arg1 ? 262144 : 0) | arg2 << 16 | this.field3398), -128, var5);
        }
        return arg0 == 23985 ? var5 : (class123) null;
    }
}
