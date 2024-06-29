import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class298 extends class223 {

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "I")
    private int field4802;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "[J")
    public static long[] field4800 = new long[256];

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    public static int field4803 = -1;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "Z")
    public static boolean field4809;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "[I")
    public static int[] field4810;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "Lef;")
    public static class227 field4808;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        int[] var3 = super.field3588.method1611(0, arg1);
        if (super.field3588.field3722) {
            class81.method633(var3, 0, class250.field4008, this.field4802);
        }
        ++field4799;
        if (arg0 < 14) {
            this.method40((byte) -79, -77);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field4802 = (arg0.method265(-90) << 12) / 255;
        }
        if (arg2 != 102) {
            field4810 = null;
        }
        ++field4801;
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
    public static final void method1999(int arg0) {
        if (arg0 < 26) {
            method2001(false);
        }
        ++field4804;
        for (class307 var1 = (class307) class241.field3841.method6(-120); var1 != null; var1 = (class307) class241.field3841.method11((byte) 52)) {
            class37 var2 = var1.field4923;
            if (~class130.field1941 == ~var2.field649 && !var2.field656) {
                if (~class41.field686 <= ~var2.field645) {
                    var2.method344(-32768, class209.field3230);
                    if (var2.field656) {
                        var1.method995((byte) 121);
                    } else {
                        class147.method1071(var2.field649, var2.field642, var2.field650, var2.field639, 60, var2, 0, -1L, false);
                    }
                }
            } else {
                var1.method995((byte) -126);
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I)V")
    public class298(int arg0) {
        super(0, true);
        this.field4802 = 4096;
        this.field4802 = arg0;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class298() {
        this(4096);
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(B)V")
    public static final void method2000(byte arg0) {
        ++field4805;
        if (class222.field3571 == null || class214.field3290 == null) {
            class214.field3290 = new int[256];
            class222.field3571 = new int[256];
            for (int var1 = 0; ~var1 > -257; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class222.field3571[var1] = (int) (Math.sin(var2) * 4096.0D);
                class214.field3290[var1] = (int) (4096.0D * Math.cos(var2));
            }
        }
        if (arg0 >= -85) {
            method2001(false);
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)V")
    public static void method2001(boolean arg0) {
        field4808 = null;
        field4810 = null;
        if (!arg0) {
            field4806 = -122;
        }
        field4800 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lgk;B)I")
    public static final int method2002(class161 arg0, byte arg1) {
        ++field4798;
        class95 var2 = arg0.field2421;
        if (var2.field1547 != null) {
            var2 = var2.method741(101);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field1486;
        class241 var4 = arg0.method1982((byte) -30);
        if (arg0.field4736 == var4.field3872) {
            var3 = var2.field1554;
        } else if (arg0.field4736 != var4.field3844 && arg0.field4736 != var4.field3855 && arg0.field4736 != var4.field3843 && ~arg0.field4736 != ~var4.field3842) {
            if (arg0.field4736 == var4.field3835 || arg0.field4736 == var4.field3840 || ~arg0.field4736 == ~var4.field3837 || ~arg0.field4736 == ~var4.field3834) {
                var3 = var2.field1504;
            }
        } else {
            var3 = var2.field1500;
        }
        return arg1 != 99 ? -83 : var3;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if ((1L & var1) != 1L) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                }
            }
            field4800[var0] = var1;
        }
        field4807 = 0;
        field4806 = 0;
        field4809 = false;
        field4810 = new int[] { 1, -1, -1, 1 };
    }
}
