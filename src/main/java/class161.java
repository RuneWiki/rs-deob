import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class161 extends class222 {

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    private int field2905 = 0;

    @OriginalMember(owner = "client!ch", name = "eb", descriptor = "I")
    private int field2913 = 0;

    @OriginalMember(owner = "client!ch", name = "kb", descriptor = "I")
    private int field2919 = 20;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "I")
    private int field2907 = 1365;

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "Lsb;")
    public static class98 field2911 = class47.method368("Clientscript error in: ", 0);

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
    public static int field2909 = 0;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "Lsb;")
    public static class98 field2910 = class47.method368("; Max)2Age=", 0);

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "Lsb;")
    public static class98 field2912 = class47.method368("welle:", 0);

    @OriginalMember(owner = "client!ch", name = "hb", descriptor = "[I")
    public static int[] field2916 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ch", name = "mb", descriptor = "Lsb;")
    private static class98 field2921 = class47.method368("Choose Option", 0);

    @OriginalMember(owner = "client!ch", name = "ob", descriptor = "Lsb;")
    public static class98 field2923 = field2921;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!ch", name = "fb", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!ch", name = "gb", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!ch", name = "ib", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!ch", name = "jb", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!ch", name = "lb", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!ch", name = "nb", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZJI)Lsb;")
    public static final class98 method1168(int arg0, boolean arg1, long arg2, int arg3) {
        ++field2918;
        if (arg0 >= 2 && ~arg0 >= -37) {
            long var5 = arg2 / (long) arg0;
            int var7 = 1;
            while (var5 != 0L) {
                ++var7;
                var5 /= (long) arg0;
            }
            int var8 = var7;
            if (arg2 < 0L || arg1) {
                var8 = var7 + 1;
            }
            byte[] var9 = new byte[var8];
            if (~arg2 <= -1L) {
                if (arg1) {
                    var9[0] = 43;
                }
            } else {
                var9[0] = 45;
            }
            for (int var10 = arg3; ~var7 < ~var10; ++var10) {
                int var12 = (int) (arg2 % (long) arg0);
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 9) {
                    var12 += 39;
                }
                arg2 /= (long) arg0;
                var9[-var10 + -1 + var8] = (byte) (var12 + 48);
            }
            class98 var11 = new class98();
            var11.field1733 = var9;
            var11.field1694 = var8;
            return var11;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2916 = null;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field2913 = arg0.method1487(61);
                    }
                } else {
                    this.field2905 = arg0.method1487(107);
                }
            } else {
                this.field2919 = arg0.method1487(68);
            }
        } else {
            this.field2907 = arg0.method1487(106);
        }
        ++field2917;
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V")
    public static void method1169(int arg0) {
        if (arg0 == -697077844) {
            field2911 = null;
            field2912 = null;
            field2921 = null;
            field2910 = null;
            field2923 = null;
            field2916 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field2908;
        if (arg0 <= 35) {
            field2916 = null;
        }
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            for (int var4 = 0; var4 < class13.field253; ++var4) {
                int var5 = (class261.field4577[var4] << 12) / this.field2907 + this.field2905;
                int var6 = (class214.field3639[arg1] << 12) / this.field2907 + this.field2913;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && ~this.field2919 < ~var13) {
                    ++var13;
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = var11 - var12 - -var7;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = this.field2919 - 1 > var13 ? (var13 << 12) / this.field2919 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class161() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(B)V")
    public static final void method1170(byte arg0) {
        ++field2920;
        class106 var1 = class71.field1129;
        synchronized (class71.field1129) {
            class81.field1433 = class258.field4548;
            class75.field1322 = class99.field1742;
            ++class134.field2366;
            class199.field3426 = class98.field1703;
            if (arg0 != 122) {
                method1170((byte) 18);
            }
            class48.field810 = class117.field2108;
            class139.field2471 = class106.field1906;
            class250.field4384 = class185.field3185;
            class85.field1499 = class21.field381;
            class117.field2108 = 0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lpb;Lpb;Z)V")
    public static final void method1171(class235 arg0, class235 arg1, boolean arg2) {
        ++field2906;
        if (arg1.field4067 != null) {
            arg1.method1611((byte) 44);
        }
        if (!arg2) {
            method1168(-45, true, 61L, 14);
        }
        arg1.field4069 = arg0;
        arg1.field4067 = arg0.field4067;
        arg1.field4067.field4069 = arg1;
        arg1.field4069.field4067 = arg1;
    }
}
