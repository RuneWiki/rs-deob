import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 extends class160 {

    @OriginalMember(owner = "client!n", name = "W", descriptor = "S")
    public static short field242 = 32767;

    @OriginalMember(owner = "client!n", name = "cb", descriptor = "Z")
    public static boolean field248 = false;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "F")
    public static float field244 = 0.0F;

    @OriginalMember(owner = "client!n", name = "eb", descriptor = "I")
    public static int field250 = 0;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    private int field240;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!n", name = "bb", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!n", name = "db", descriptor = "I")
    private int field249;

    @OriginalMember(owner = "client!n", name = "fb", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public static final void method157(boolean arg0) {
        ++field239;
        while (class236.field3814.method539((byte) 79, class53.field804) >= 11) {
            int var1 = class236.field3814.method535(11, 104);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class210.field3267[var1] == null) {
                var2 = true;
                class210.field3267[var1] = new class236();
                if (class132.field2075[var1] != null) {
                    class210.field3267[var1].method1621(class132.field2075[var1], 0);
                }
            }
            class99.field1660[class137.field2110++] = var1;
            class236 var3 = class210.field3267[var1];
            var3.field2279 = class192.field2978;
            int var4 = class236.field3814.method535(1, 104);
            if (~var4 == -2) {
                class244.field3972[class141.field2155++] = var1;
            }
            int var5 = class236.field3814.method535(5, 104);
            if (~var5 < -16) {
                var5 -= 32;
            }
            int var6 = class148.field2335[class236.field3814.method535(3, 104)];
            if (var2) {
                var3.field2257 = var3.field2275 = var6;
            }
            int var7 = class236.field3814.method535(1, 104);
            int var8 = class236.field3814.method535(5, 104);
            if (~var8 < -16) {
                var8 -= 32;
            }
            var3.method1622(class283.field4473.field2271[0] - -var5, 0, var7 == 1, class283.field4473.field2268[0] + var8);
        }
        if (!arg0) {
            class236.field3814.method538(9721);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        ++field247;
        if (arg1 >= 11) {
            if (~arg2 == -1) {
                this.method159(arg0.method671(127), -11922);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(IZ)Lra;")
    public static final class238 method158(int arg0, boolean arg1) {
        class238 var2 = (class238) class190.field2945.method1887(0, (long) arg0);
        ++field251;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class30.field430.method1590(class90.method691((byte) -76, arg0), (byte) -25, class81.method583(-36, arg0));
            if (!arg1) {
                return null;
            } else {
                class238 var4 = new class238();
                var4.field3856 = arg0;
                if (var3 != null) {
                    var4.method1637(new class88(var3), (byte) -118);
                }
                class190.field2945.method1886(-113, (long) arg0, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(II)V")
    private final void method159(int arg0, int arg1) {
        ++field246;
        this.field249 = (arg0 & 16711680) >> 12;
        this.field241 = (255 & arg0) << 4;
        if (arg1 != -11922) {
            field248 = false;
        }
        this.field240 = (arg0 & 65280) >> 4;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class16() {
        this(0);
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(III)I")
    public static final int method160(int arg0, int arg1, int arg2) {
        if (arg1 != 3339) {
            method158(-83, true);
        }
        ++field243;
        class53 var3 = (class53) class291.field4590.method285((long) arg0, 13821);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; ~var5 > ~var3.field813.length; ++var5) {
                if (~var3.field800[var5] == ~arg2) {
                    var4 += var3.field813[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        ++field245;
        if (!arg1) {
            this.field241 = -63;
        }
        int[][] var3 = super.field2476.method839(false, arg0);
        if (super.field2476.field1950) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; class240.field3896 > var7; ++var7) {
                var4[var7] = this.field249;
                var6[var7] = this.field240;
                var5[var7] = this.field241;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(I)V")
    private class16(int arg0) {
        super(0, false);
        this.method159(arg0, -11922);
    }
}
