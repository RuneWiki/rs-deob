import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ra")
public class class158 extends class85 {

    @OriginalMember(owner = "ra", name = "V", descriptor = "I")
    private int field2970;

    @OriginalMember(owner = "ra", name = "T", descriptor = "Llf;")
    public static class109 field2968 = class35.method275("<col=ffff00>", 2);

    @OriginalMember(owner = "ra", name = "X", descriptor = "Llf;")
    public static class109 field2972 = class35.method275("null", 2);

    @OriginalMember(owner = "ra", name = "Y", descriptor = "Z")
    public static boolean field2973 = false;

    @OriginalMember(owner = "ra", name = "bb", descriptor = "I")
    public static int field2976 = 0;

    @OriginalMember(owner = "ra", name = "R", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "ra", name = "S", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "ra", name = "U", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "ra", name = "W", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "ra", name = "Z", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "ra", name = "ab", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "ra", name = "Q", descriptor = "Ldf;")
    public static class37 field2965;

    @OriginalMember(owner = "ra", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg1 == 0) {
            this.field2970 = (arg2.method598((byte) 101) << 12) / 255;
        }
        if (arg0 >= -120) {
            this.method87(-60, -64);
        }
        ++field2966;
    }

    @OriginalMember(owner = "ra", name = "e", descriptor = "(I)V")
    public static void method1075(int arg0) {
        field2968 = null;
        if (arg0 != -4) {
            method1075(76);
        }
        field2965 = null;
        field2972 = null;
    }

    @OriginalMember(owner = "ra", name = "b", descriptor = "(Z)V")
    public static final void method1076(boolean arg0) {
        ++field2974;
        if (class74.field1423[98]) {
            class199.field3794 += (-class199.field3794 + 12) / 2;
        } else if (!class74.field1423[99]) {
            class199.field3794 /= 2;
        } else {
            class199.field3794 += (-12 - class199.field3794) / 2;
        }
        if (class74.field1423[96]) {
            class174.field3298 += (-class174.field3298 + -24) / 2;
        } else if (!class74.field1423[97]) {
            class174.field3298 /= 2;
        } else {
            class174.field3298 += (24 - class174.field3298) / 2;
        }
        class142.field2742 += class199.field3794 / 2;
        class69.field1343 = 2047 & class174.field3298 / 2 + class69.field1343;
        int var1 = class59.field1172 + class157.field2955.field3549;
        if (class142.field2742 < 128) {
            class142.field2742 = 128;
        }
        int var2 = class174.field3300 + class157.field2955.field3609;
        if (arg0) {
            method1076(true);
        }
        if (class142.field2742 > 383) {
            class142.field2742 = 383;
        }
        if (class12.field189 - var1 < -500 || ~(-var1 + class12.field189) < -501 || -var2 + class1.field5 < -500 || ~(-var2 + class1.field5) < -501) {
            class1.field5 = var2;
            class12.field189 = var1;
        }
        if (~class12.field189 != ~var1) {
            class12.field189 += (-class12.field189 + var1) / 16;
        }
        if (class1.field5 != var2) {
            class1.field5 += (-class1.field5 + var2) / 16;
        }
        int var3 = class1.field5 >> 7;
        int var4 = class12.field189 >> 7;
        int var5 = class19.method180(class1.field5, arg0, class72.field1405, class12.field189);
        int var6 = 0;
        if (~var4 < -4 && ~var3 < -4 && ~var4 > -101 && var3 < 100) {
            for (int var7 = var4 + -4; var4 + 4 >= var7; ++var7) {
                for (int var8 = var3 + -4; ~var8 >= ~(var3 + 4); ++var8) {
                    int var9 = class72.field1405;
                    if (~var9 > -4 && (2 & class88.field1827[1][var7][var8]) == 2) {
                        ++var9;
                    }
                    int var10 = -class184.field3448[var9][var7][var8] + var5;
                    if (var10 > var6) {
                        var6 = var10;
                    }
                }
            }
        }
        int var11 = var6 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (~var11 > -32769) {
            var11 = 32768;
        }
        if (var11 <= class9.field128) {
            if (class9.field128 > var11) {
                class9.field128 += (-class9.field128 + var11) / 80;
                return;
            }
        } else {
            class9.field128 += (-class9.field128 + var11) / 24;
        }
    }

    @OriginalMember(owner = "ra", name = "<init>", descriptor = "()V")
    public class158() {
        this(4096);
    }

    @OriginalMember(owner = "ra", name = "c", descriptor = "(II)Z")
    public static final boolean method1077(int arg0, int arg1) {
        ++field2967;
        if (arg0 != 610157134) {
            field2965 = null;
        }
        return (arg1 & 610157134) >> 29 != 0;
    }

    @OriginalMember(owner = "ra", name = "a", descriptor = "(IB)Lvg;")
    public static final class200 method1078(int arg0, byte arg1) {
        ++field2971;
        if (arg1 < 111) {
            return null;
        } else {
            int var2 = arg0 >> 16;
            int var3 = 65535 & arg0;
            if (class169.field3146[var2] == null || class169.field3146[var2][var3] == null) {
                boolean var4 = class185.method1253(false, var2);
                if (!var4) {
                    return null;
                }
            }
            return class169.field3146[var2][var3];
        }
    }

    @OriginalMember(owner = "ra", name = "<init>", descriptor = "(I)V")
    private class158(int arg0) {
        super(0, true);
        this.field2970 = 4096;
        this.field2970 = arg0;
    }

    @OriginalMember(owner = "ra", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        if (arg0 >= -49) {
            return null;
        } else {
            int[] var3 = super.field1736.method835(-314, arg1);
            ++field2969;
            if (super.field1736.field2253) {
                class122.method877(var3, 0, class57.field1152, this.field2970);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "ra", name = "a", descriptor = "(Led;)V")
    public static final void method1079(class45 arg0) {
        for (int var1 = arg0.field947; var1 <= arg0.field927; ++var1) {
            for (int var2 = arg0.field932; var2 <= arg0.field944; ++var2) {
                class3 var3 = class78.field1550[arg0.field939][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field13; ++var4) {
                        if (var3.field17[var4] == arg0) {
                            --var3.field13;
                            for (int var5 = var4; var5 < var3.field13; ++var5) {
                                var3.field17[var5] = var3.field17[var5 + 1];
                                var3.field28[var5] = var3.field28[var5 + 1];
                            }
                            var3.field17[var3.field13] = null;
                            break;
                        }
                    }
                    var3.field21 = 0;
                    for (int var6 = 0; var6 < var3.field13; ++var6) {
                        var3.field21 |= var3.field28[var6];
                    }
                }
            }
        }
    }
}
