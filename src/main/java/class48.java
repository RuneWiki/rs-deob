import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class48 extends class407 implements class56 {

    @OriginalMember(owner = "client!td", name = "H", descriptor = "Z")
    private boolean field724;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "B")
    private byte field742;

    @OriginalMember(owner = "client!td", name = "jb", descriptor = "S")
    private short field751;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "B")
    private byte field746;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "Z")
    private boolean field729;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "B")
    private byte field734;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "Z")
    private boolean field744;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "Z")
    private boolean field728;

    @OriginalMember(owner = "client!td", name = "db", descriptor = "Lc;")
    private class308 field745;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "Lqb;")
    public class257 field726;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "Ljava/lang/String;")
    public static String field727 = "Close";

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "Z")
    public static boolean field743 = false;

    @OriginalMember(owner = "client!td", name = "hb", descriptor = "I")
    public static int field749 = 0;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "Ljava/util/Calendar;")
    public static Calendar field739 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!td", name = "mb", descriptor = "I")
    public static int field754 = 0;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!td", name = "kb", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!td", name = "lb", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "[I")
    public static int[] field735;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)I", line = 7)
    public final int method116(int arg0) {
        ++field731;
        if (arg0 != 24186) {
            this.method118((class298) null, -107);
        }
        return 65535 & this.field751;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V", line = 18)
    public final void method124(int arg0) {
        if (arg0 > 26) {
            if (this.field726 != null) {
                this.field726.method1686();
            }
            ++field738;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)Z", line = 32)
    public final boolean method107(byte arg0) {
        ++field753;
        return arg0 <= 119 ? false : this.field729;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLtj;BI)Ljl;", line = 43)
    private final class373 method340(boolean arg0, class298 arg1, byte arg2, int arg3) {
        if (arg2 >= -96) {
            this.field726 = null;
        }
        ++field736;
        class212 var5 = class372.method2447(this.field751 & 65535, (byte) -123);
        class193 var6;
        class193 var7;
        if (!this.field744) {
            var6 = class142.field1804[this.field742];
            if (this.field742 < 3) {
                var7 = class142.field1804[this.field742 - -1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class142.field1804[0];
            var6 = class370.field5469[this.field742];
        }
        return var5.method1406(super.field5930, arg0, this.field734 == 11 ? this.field746 + 4 : this.field746, (byte) -91, arg3, ~this.field734 == -12 ? 10 : this.field734, super.field5932, var7, arg1, var6, super.field5921);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLtj;)V", line = 74)
    public final void method126(byte arg0, class298 arg1) {
        ++field747;
        if (arg0 != 50) {
            this.method344((byte) 89, -28, (class298) null);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lfb;I)V", line = 88)
    public static final void method341(class341 arg0, int arg1) {
        ++field741;
        if (arg1 != -9581) {
            field721 = 21;
        }
        int var2 = arg0.method2223(-1);
        class242.field3401 = new class322[var2];
        for (int var3 = 0; var2 > var3; ++var3) {
            class242.field3401[var3] = new class322();
            class242.field3401[var3].field4791 = arg0.method2223(-1);
            class242.field3401[var3].field4792 = arg0.method2255(-4182);
        }
        class269.field3988 = arg0.method2223(-1);
        class373.field5498 = arg0.method2223(arg1 ^ 9580);
        class230.field3156 = arg0.method2223(-1);
        class53.field823 = new class184[class373.field5498 + 1 + -class269.field3988];
        for (int var4 = 0; ~var4 > ~class230.field3156; ++var4) {
            int var5 = arg0.method2223(arg1 + 9580);
            class184 var6 = class53.field823[var5] = new class184();
            var6.field5949 = arg0.method2233((byte) 104);
            var6.field5950 = arg0.method2232(-30);
            var6.field2478 = var5 - -class269.field3988;
            var6.field2474 = arg0.method2255(-4182);
            var6.field2467 = arg0.method2255(-4182);
        }
        class390.field5705 = arg0.method2232(123);
        class322.field4797 = true;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)I", line = 135)
    public final int method121(int arg0) {
        if (arg0 != 28024) {
            field749 = 3;
        }
        ++field722;
        return this.field746;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ltj;IB)Lqb;", line = 147)
    public final class257 method117(class298 arg0, int arg1, byte arg2) {
        if (arg2 <= 42) {
            return null;
        } else {
            ++field730;
            return this.method344((byte) 122, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)I", line = 159)
    public final int method342(int arg0) {
        ++field750;
        if (arg0 != 0) {
            this.method107((byte) -83);
        }
        return this.field726 != null ? this.field726.method1672() / 4 : 15;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)I", line = 172)
    public final int method122(byte arg0) {
        ++field732;
        if (arg0 > -103) {
            this.method111(-87, (class298) null);
        }
        return this.field734;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ltj;I)Lri;", line = 188)
    public final class372 method118(class298 arg0, int arg1) {
        ++field740;
        if (this.field726 == null) {
            return null;
        } else {
            class118 var3 = arg0.method519();
            var3.method274(super.field5921, super.field5932, super.field5930);
            class372 var4 = null;
            if (arg1 != 18630) {
                return null;
            } else {
                if (this.field724) {
                    var4 = class384.method2492(1, (byte) 109);
                }
                this.field726.method1661(var3, var4 != null ? var4.field5481[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "i", descriptor = "(I)V", line = 224)
    public static void method343(int arg0) {
        field735 = null;
        field727 = null;
        int var1 = 12 / ((-58 - arg0) / 59);
        field739 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILtj;)V", line = 235)
    public final void method111(int arg0, class298 arg1) {
        if (arg0 <= -68) {
            ++field733;
            Object var3 = null;
            class308 var5;
            if (this.field745 == null && this.field728) {
                class373 var4 = this.method340(true, arg1, (byte) -114, 131072);
                var5 = var4 == null ? null : var4.field5496;
            } else {
                var5 = this.field745;
                this.field745 = null;
            }
            if (var5 != null) {
                class108.method818(var5, this.field742, super.field5921, super.field5930, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Z", line = 262)
    public final boolean method125(int arg0) {
        ++field748;
        if (arg0 >= -112) {
            method343(71);
        }
        return this.field728;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BILtj;)Lqb;", line = 276)
    private final class257 method344(byte arg0, int arg1, class298 arg2) {
        ++field737;
        if (this.field726 != null && ~arg2.method465(this.field726.method1690(), arg1) == -1) {
            return this.field726;
        } else {
            if (arg0 <= 72) {
                this.method107((byte) -44);
            }
            class373 var4 = this.method340(false, arg2, (byte) -100, arg1);
            return var4 != null ? var4.field5505 : null;
        }
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)I", line = 297)
    public final int method345(int arg0) {
        ++field723;
        if (arg0 < 14) {
            return -125;
        } else {
            return this.field726 != null ? this.field726.method1688() : 0;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILtj;II)Z", line = 310)
    public final boolean method120(int arg0, class298 arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            return false;
        } else {
            ++field752;
            class257 var5 = this.method344((byte) 107, 65536, arg1);
            if (var5 != null) {
                class118 var6 = arg1.method519();
                var6.method274(super.field5921, super.field5932, super.field5930);
                return var5.method1698(arg2, arg0, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V", line = 332)
    public final void method114(int arg0) {
        if (arg0 != 2) {
            this.field728 = false;
        }
        ++field719;
        this.field729 = false;
        if (this.field726 != null) {
            this.field726.method1662(-32769 & this.field726.method1690());
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILtj;BIZLkm;I)V", line = 347)
    public final void method112(int arg0, class298 arg1, byte arg2, int arg3, boolean arg4, class402 arg5, int arg6) {
        int var8 = -90 / ((arg2 - 46) / 45);
        ++field718;
        if (!(arg5 instanceof class106)) {
            if (arg5 instanceof class48) {
                class48 var9 = (class48) arg5;
                if (this.field726 != null && var9.field726 != null) {
                    this.field726.method1668(var9.field726, arg6, arg3, arg0, arg4);
                    return;
                }
            }
        } else {
            class106 var10 = (class106) arg5;
            if (this.field726 == null || var10.field1386 == null) {
                return;
            }
            this.field726.method1668(var10.field1386, arg6, arg3, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!td", name = "j", descriptor = "(I)V", line = 377)
    public static final void method346(int arg0) {
        class51 var1 = class257.field3768;
        synchronized (class257.field3768) {
            if (arg0 != 1024) {
                field739 = null;
            }
            class257.field3768.method372(121);
        }
        ++field720;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ltj;Lqr;IIIIIZIIIIIIZ)V", line = 394)
    public class48(class298 arg0, class212 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field2901 == 1, class399.method2566(-32094, arg13, arg12));
        this.field724 = ~arg1.field2932 != -1;
        this.field742 = (byte) arg3;
        this.field751 = (short) arg1.field2942;
        this.field746 = (byte) arg13;
        this.field729 = arg14;
        this.field734 = (byte) arg12;
        this.field744 = arg7;
        this.field728 = arg0.method434() && arg1.field2927 && !this.field744 && class330.field4863 != 0;
        int var16 = 1024;
        if (this.field729) {
            var16 |= 32768;
        }
        class373 var17 = this.method340(this.field728, arg0, (byte) -119, var16);
        if (var17 != null) {
            this.field745 = var17.field5496;
            this.field726 = var17.field5505;
            if (this.field729) {
                this.field726 = this.field726.method1676((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(ILtj;)V", line = 430)
    public final void method108(int arg0, class298 arg1) {
        ++field725;
        if (arg0 >= -8) {
            this.method125(67);
        }
        Object var3 = null;
        class308 var5;
        if (this.field745 == null && this.field728) {
            class373 var4 = this.method340(true, arg1, (byte) -100, 131072);
            var5 = var4 == null ? null : var4.field5496;
        } else {
            var5 = this.field745;
            this.field745 = null;
        }
        if (var5 != null) {
            class215.method1412(var5, this.field742, super.field5921, super.field5930, (boolean[]) null);
        }
    }
}
