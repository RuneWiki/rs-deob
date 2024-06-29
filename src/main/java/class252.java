import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class252 {

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "Lqa;")
    public static class338 field3759 = new class338();

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "[I")
    public static int[] field3763 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3764 = "scroll:";

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public int field3736;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public int field3738;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public int field3740;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public int field3743;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public int field3745;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public int field3747;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public int field3749;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public int field3750;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public int field3751;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public int field3752;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public int field3753;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public int field3754;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public int field3755;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public int field3760;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Lph;")
    public static class361 field3756;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3765;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "[[[Lbo;")
    public static class16[][][] field3762;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 15)
    public static final void method1845(int arg0) {
        field3758++;
        if (arg0 == 6) {
            class38.field561.method462(24);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Z", line = 28)
    public static final boolean method1846(int arg0) {
        field3744++;
        try {
            if (class131.field1889 == 2) {
                if (class146.field2104 == null) {
                    class146.field2104 = class301.method2130(class124.field1807, class217.field3195, class259.field3858);
                    if (class146.field2104 == null) {
                        return false;
                    }
                }
                if (class137.field1994 == null) {
                    class137.field1994 = new class344(class237.field3552, class266.field4060);
                }
                if (class256.field3833.method2320(class130.field1881, class146.field2104, -99, 22050, class137.field1994)) {
                    class256.field3833.method2313(arg0 ^ 0x3810);
                    class256.field3833.method2322(class261.field3970, (byte) 125);
                    class256.field3833.method2290(-27562, class31.field438, class146.field2104);
                    class124.field1807 = null;
                    class131.field1889 = 0;
                    class137.field1994 = null;
                    class146.field2104 = null;
                    return true;
                }
            }
            if (arg0 != 1) {
                method1852(false, 84, -92, (String) null);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class256.field3833.method2317(-110);
            class137.field1994 = null;
            class131.field1889 = 0;
            class124.field1807 = null;
            class146.field2104 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V", line = 77)
    public static void method1847(int arg0) {
        field3764 = null;
        field3763 = null;
        field3762 = (class16[][][]) null;
        if (arg0 != 0) {
            method1853(-23);
        }
        field3765 = null;
        field3756 = null;
        field3759 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lnf;ILjava/lang/Object;)V", line = 93)
    public static final void method1848(class61 arg0, int arg1, Object arg2) {
        field3733++;
        if (arg0.field883 == null) {
            return;
        }
        int var3 = 101 / ((51 - arg1) / 56);
        for (int var4 = 0; var4 < 50 && arg0.field883.peekEvent() != null; var4++) {
            class184.method1283(1L, 10);
        }
        if (arg2 != null) {
            arg0.field883.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIZ)V", line = 117)
    public static final void method1849(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        field3746++;
        if (class209.field3053 != arg0) {
            class251.field3721 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class251.field3721[var3] = (var3 << 12) / arg0;
            }
            class83.field1186 = arg0 * 32;
            class209.field3053 = arg0;
            class150.field2180 = arg0 - 1;
        }
        if (class184.field2642 == arg1) {
            return;
        }
        if (class209.field3053 == arg1) {
            class215.field3175 = class251.field3721;
        } else {
            class215.field3175 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class215.field3175[var4] = (var4 << 12) / arg1;
            }
        }
        class214.field3080 = arg1 - 1;
        class184.field2642 = arg1;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)Lbe;", line = 165)
    public static final class95 method1850(int arg0) {
        field3734++;
        class95 var1 = (class95) class203.field2978.method2386((byte) -115);
        if (var1 != null) {
            var1.method876(8);
            var1.method627(0);
            return var1;
        }
        if (arg0 != 0) {
            field3759 = (class338) null;
        }
        class95 var2;
        do {
            var2 = (class95) class274.field4153.method2386((byte) -84);
            if (var2 == null) {
                return null;
            }
            if (var2.method739(true) > class176.method1234(5574)) {
                return null;
            }
            var2.method876(arg0 ^ 0x8);
            var2.method627(0);
        } while ((var2.field1122 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIB)I", line = 208)
    public static final int method1851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg4;
            arg4 = var7;
        }
        if (arg6 <= 49) {
            return 126;
        }
        int var8 = arg0 & 0x3;
        field3737++;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 7 + 1 - arg5 - arg3;
        } else if (var8 == 2) {
            return 1 - (arg4 - 7) - arg1;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIILjava/lang/String;)Z", line = 245)
    public static final boolean method1852(boolean arg0, int arg1, int arg2, String arg3) {
        field3732++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        int var5 = 0;
        boolean var6 = false;
        if (arg1 != 19048) {
            return true;
        }
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var5 + var11;
            if ((var10 / arg2) != var5) {
                return false;
            }
            var5 = var10;
            var6 = true;
        }
        return var6;
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V", line = 325)
    public static final void method1853(int arg0) {
        field3735++;
        for (int var1 = arg0; var1 < class265.field4053; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class227.field3426[var1];
            }
            class228 var3 = class343.field5312[var2];
            if (var3 != null && var3.field5181 > 0) {
                var3.field5181--;
                if (var3.field5181 == 0) {
                    var3.field5138 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class166.field2384; var4++) {
            int var5 = class215.field3158[var4];
            class181 var6 = class300.field4495[var5];
            if (var6 != null && var6.field5181 > 0) {
                var6.field5181--;
                if (var6.field5181 == 0) {
                    var6.field5138 = null;
                }
            }
        }
    }
}
