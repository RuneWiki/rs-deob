import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class208 {

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Ljf;")
    public static class229 field3607 = class212.method1457((byte) 81, ":");

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field3612 = 0;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lnf;")
    public static class67 field3613 = null;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "Ljf;")
    public static class229 field3615 = class212.method1457((byte) 66, "www");

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Lbj;")
    public static class55 field3611;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Z")
    public static boolean field3608;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLnf;)Ljf;", line = 4)
    public static final class229 method1441(byte arg0, class67 arg1) {
        field3609++;
        int var2 = -109 / ((-arg0 - 31) / 34);
        if (class93.method651((byte) 108, client.method1820(arg1)) == 0) {
            return null;
        } else if (arg1.field1291 == null || arg1.field1291.method1644(true).method1626(-105) == 0) {
            return class131.field2317 ? class241.field4260 : null;
        } else {
            return arg1.field1291;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLpk;)V", line = 35)
    public static final void method1442(byte arg0, class112 arg1) {
        field3605++;
        if (arg1.field2004 == 0) {
            return;
        }
        if (arg0 != 115) {
            method1445((byte) 102);
        }
        if (arg1.field1966 != -1 && arg1.field1966 < 32768) {
            class331 var2 = class331.field5637[arg1.field1966];
            if (var2 != null) {
                int var3 = arg1.field2028 - var2.field2028;
                int var4 = arg1.field1983 - var2.field1983;
                if (var4 != 0 || var3 != 0) {
                    arg1.field1964 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1966 >= 32768) {
            int var5 = arg1.field1966 - 32768;
            if (class112.field1963 == var5) {
                var5 = 2047;
            }
            class33 var6 = class192.field3334[var5];
            if (var6 != null) {
                int var7 = arg1.field1983 - var6.field1983;
                int var8 = arg1.field2028 - var6.field2028;
                if (var7 != 0 || var8 != 0) {
                    arg1.field1964 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field2009 != 0 || arg1.field1978 != 0) && (arg1.field2006 == 0 || arg1.field2005 > 0)) {
            int var9 = arg1.field1983 - ((arg1.field2009 - class258.field4503 - class258.field4503) * 64 - ((arg1.method299(true) - 1) * 64));
            int var10 = arg1.field2028 - ((arg1.field1978 - class213.field3649 + -class213.field3649) * 64 + 64 - (arg1.method299(true) * 64));
            if (var9 != 0 || var10 != 0) {
                arg1.field1964 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field1978 = 0;
            arg1.field2009 = 0;
        }
        int var11 = arg1.field1964 - arg1.field1987 & 0x7FF;
        if (var11 == 0) {
            arg1.field1965 = 0;
            return;
        }
        arg1.field1965++;
        if (var11 <= 1024) {
            arg1.field1987 += arg1.field2004;
            boolean var12 = true;
            if (arg1.field2004 > var11 || var11 > (2048 - arg1.field2004)) {
                arg1.field1987 = arg1.field1964;
                var12 = false;
            }
            if (arg1.field2025 == arg1.field1986 && (arg1.field1965 > 25 || var12)) {
                if (arg1.field1994 == -1) {
                    arg1.field2025 = arg1.field1981;
                } else {
                    arg1.field2025 = arg1.field1994;
                }
            }
        } else {
            arg1.field1987 -= arg1.field2004;
            boolean var13 = true;
            if (arg1.field2004 > var11 || (2048 - arg1.field2004) < var11) {
                arg1.field1987 = arg1.field1964;
                var13 = false;
            }
            if (arg1.field2025 == arg1.field1986 && (arg1.field1965 > 25 || var13)) {
                if (arg1.field2027 == -1) {
                    arg1.field2025 = arg1.field1981;
                } else {
                    arg1.field2025 = arg1.field2027;
                }
            }
        }
        arg1.field1987 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZ)V", line = 159)
    public static final void method1443(byte arg0, boolean arg1) {
        field3610++;
        class18.method179((byte) 101);
        if (arg0 != 23 || class325.field5482 != 30 && class325.field5482 != 25) {
            return;
        }
        class182.field3149++;
        if (class182.field3149 < 50 && !arg1) {
            return;
        }
        class182.field3149 = 0;
        if (!class244.field4338 && class160.field2720 != null) {
            class307.field5193++;
            class84.field1608.method1397(106, arg0 ^ 0x17);
            try {
                class160.field2720.method1428(22974, class84.field1608.field195, class84.field1608.field174, 0);
                class84.field1608.field195 = 0;
            } catch (IOException var3) {
                class244.field4338 = true;
            }
        }
        class18.method179((byte) 101);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILek;)Z", line = 203)
    public static final boolean method1444(int arg0, int arg1, int arg2, class185 arg3) {
        byte[] var4 = arg3.method1275(arg0, arg2, -5211);
        field3616++;
        if (arg1 != -28236) {
            return true;
        } else if (var4 == null) {
            return false;
        } else {
            class278.method1957(var4, 112);
            return true;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V", line = 223)
    public static void method1445(byte arg0) {
        field3607 = null;
        field3615 = null;
        if (arg0 <= 101) {
            method1441((byte) -40, (class67) null);
        }
        field3611 = null;
        field3613 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZ)V", line = 236)
    public static final void method1446(int arg0, int arg1, boolean arg2) {
        class189.field3304 = class127.field2269 + (class254.field4432 - 1) - arg1;
        field3606++;
        class132.field2325 = arg0 - class290.field4953;
        int var3 = class132.field2325 - ((int) ((float) class329.field5589.field1258 / class235.field4060));
        int var4 = (int) ((float) class329.field5589.field1258 / class235.field4060) + class132.field2325;
        if (var3 < 0) {
            class132.field2325 = (int) ((float) class329.field5589.field1258 / class235.field4060);
        }
        int var5 = class189.field3304 - ((int) ((float) class329.field5589.field1295 / class235.field4060));
        if (var4 > class113.field2037) {
            class132.field2325 = class113.field2037 - ((int) ((float) class329.field5589.field1258 / class235.field4060));
        }
        if (arg2) {
            return;
        }
        int var6 = (int) ((float) class329.field5589.field1295 / class235.field4060) + class189.field3304;
        if (var5 < 0) {
            class189.field3304 = (int) ((float) class329.field5589.field1295 / class235.field4060);
        }
        if (var6 > class254.field4432) {
            class189.field3304 = class254.field4432 - ((int) ((float) class329.field5589.field1295 / class235.field4060));
        }
    }
}
