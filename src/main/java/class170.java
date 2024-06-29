import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class170 extends class76 {

    @OriginalMember(owner = "client!ji", name = "cb", descriptor = "I")
    private int field2925 = 0;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "I")
    private int field2922 = 0;

    @OriginalMember(owner = "client!ji", name = "hb", descriptor = "I")
    private int field2930 = 1;

    @OriginalMember(owner = "client!ji", name = "ib", descriptor = "Z")
    public static boolean field2931 = false;

    @OriginalMember(owner = "client!ji", name = "fb", descriptor = "Lia;")
    public static class257 field2928 = class28.method234(-27, "(R");

    @OriginalMember(owner = "client!ji", name = "jb", descriptor = "Z")
    public static boolean field2932 = false;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!ji", name = "bb", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!ji", name = "db", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!ji", name = "eb", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!ji", name = "gb", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!ji", name = "kb", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!ji", name = "lb", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
    public static final void method1164(boolean arg0) {
        ++field2926;
        if (class5.field114 != -1) {
            class104.method754(class5.field114, -1);
        }
        for (int var1 = 0; ~var1 > ~class44.field1030; ++var1) {
            if (class137.field2456[var1]) {
                class75.field1464[var1] = true;
            }
            class157.field2747[var1] = class137.field2456[var1];
            class137.field2456[var1] = false;
        }
        if (!arg0) {
            method1164(true);
        }
        class197.field3332 = -1;
        class108.field2013 = class7.field153;
        class41.field840 = -1;
        class241.field4189 = null;
        if (class5.field114 != -1) {
            class44.field1030 = 0;
            class114.method818(0, class5.field114, class12.field241, -1, 0, -80, class166.field2897, 0, 0);
        }
        class23.method186();
        class171.field2935 = 0;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class170() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(BI)I")
    public static final int method1165(byte arg0, int arg1) {
        if (arg0 != 18) {
            method1167(12);
        }
        ++field2934;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field2930 = arg0.method1051((byte) 101);
                }
            } else {
                this.field2922 = arg0.method1051((byte) 108);
            }
        } else {
            this.field2925 = arg0.method1051((byte) -101);
        }
        ++field2933;
        if (arg1 >= -86) {
            field2928 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZZ)V")
    public static final void method1166(boolean arg0, boolean arg1) {
        if (~(class137.field2441.field4177 >> 7) == ~class132.field2369 && class137.field2441.field4143 >> 7 == class186.field3228) {
            class132.field2369 = 0;
        }
        ++field2924;
        int var2 = class231.field3880;
        if (arg0) {
            var2 = 1;
        }
        if (arg1) {
            method1166(true, true);
        }
        for (int var3 = 0; ~var2 < ~var3; ++var3) {
            long var4;
            class180 var6;
            if (arg0) {
                var4 = 8791798054912L;
                var6 = class137.field2441;
            } else {
                var6 = class55.field1180[class132.field2362[var3]];
                var4 = (long) class132.field2362[var3] << 32;
            }
            if (var6 != null && var6.method1236(0)) {
                var6.field3136 = false;
                if ((class204.field3503 && class231.field3880 > 200 || class231.field3880 > 50) && !arg0 && var6.field4170 == var6.field4165) {
                    var6.field3136 = true;
                }
                int var7 = var6.field4143 >> 7;
                int var8 = var6.field4177 >> 7;
                if (var8 >= 0 && ~var8 > -105 && var7 >= 0 && ~var7 > -105) {
                    if (var6.field3106 != null && class7.field153 >= var6.field3131 && class7.field153 < var6.field3128) {
                        var6.field3136 = false;
                        var6.field4121 = class109.method803(class189.field3261, var6.field4143, (byte) -5, var6.field4177);
                        class134.method928(class189.field3261, var6.field4177, var6.field4143, var6.field4121, var6, var6.field4118, var4, var6.field3139, var6.field3111, var6.field3112, var6.field3130);
                    } else {
                        if (~(127 & var6.field4177) == -65 && (127 & var6.field4143) == 64) {
                            if (~class185.field3223[var8][var7] == ~class15.field328) {
                                continue;
                            }
                            class185.field3223[var8][var7] = class15.field328;
                        }
                        var6.field4121 = class109.method803(class189.field3261, var6.field4143, (byte) -59, var6.field4177);
                        class246.method1614(class189.field3261, var6.field4177, var6.field4143, var6.field4121, 60, var6, var6.field4118, var4, var6.field4142);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        ++field2929;
        if (super.field1467.field2980) {
            int var4 = class10.field197[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class96.field1807 > var6; ++var6) {
                int var7 = class137.field2457[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field2925 == 0) {
                    var9 = (-var4 + var7) * this.field2930;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field2930 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (~this.field2922 != -1) {
                    if (~this.field2922 == -3) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class205.field3514[(var12 & 4080) >> 4] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 != -9351) {
            this.field2922 = -126;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    public final void method209(byte arg0) {
        class251.method1645((byte) 105);
        ++field2921;
        if (arg0 != 111) {
            field2928 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "(I)V")
    public static void method1167(int arg0) {
        field2928 = null;
        if (arg0 != 11287) {
            method1168(false, (class180) null);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLib;)V")
    public static final void method1168(boolean arg0, class180 arg1) {
        if (!arg0) {
            method1167(-101);
        }
        class103 var2 = (class103) class79.field1553.method434((byte) -93, arg1.field3140.method1668(111));
        if (var2 != null) {
            if (var2.field1913 != null) {
                class78.field1504.method459(var2.field1913);
                var2.field1913 = null;
            }
            var2.method254(1);
        }
        ++field2927;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILmb;)[Lte;")
    public static final class184[] method1169(int arg0, int arg1, int arg2, class178 arg3) {
        ++field2923;
        if (arg0 != -2048) {
            field2931 = true;
        }
        return !class156.method1093(arg2, 83, arg1, arg3) ? null : class208.method1398((byte) 14);
    }
}
