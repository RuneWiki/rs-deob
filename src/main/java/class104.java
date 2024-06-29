import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class104 extends class167 {

    @OriginalMember(owner = "client!jf", name = "eb", descriptor = "I")
    private int field1900 = -1;

    @OriginalMember(owner = "client!jf", name = "hb", descriptor = "Lkh;")
    private static class117 field1903 = class224.method1450((byte) -91, "glow1:");

    @OriginalMember(owner = "client!jf", name = "ib", descriptor = "Lkh;")
    public static class117 field1904 = field1903;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "Lkh;")
    public static class117 field1890 = field1903;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "Lge;")
    public static class71 field1895 = new class71(64);

    @OriginalMember(owner = "client!jf", name = "kb", descriptor = "Leg;")
    public static class52 field1906 = new class52(5000);

    @OriginalMember(owner = "client!jf", name = "lb", descriptor = "Lkh;")
    public static class117 field1907 = class224.method1450((byte) 107, " x ");

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!jf", name = "cb", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!jf", name = "db", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!jf", name = "fb", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!jf", name = "gb", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!jf", name = "jb", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!jf", name = "mb", descriptor = "Lnb;")
    public static class144 field1908;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "[I")
    public int[] field1892;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)Z")
    public final boolean method698(int arg0) {
        if (arg0 != 2) {
            return false;
        } else {
            ++field1899;
            if (this.field1892 != null) {
                return true;
            } else if (this.field1900 >= 0) {
                class144 var2 = class24.method210(class140.field2558, this.field1900, -1);
                var2.method970();
                this.field1902 = var2.field731;
                this.field1901 = var2.field733;
                this.field1892 = var2.field2602;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V")
    public static final void method699(int arg0) {
        if (~class139.field2532 > -129) {
            class139.field2532 = 128;
        }
        if (class139.field2532 > 383) {
            class139.field2532 = 383;
        }
        client.field776 &= 2047;
        ++field1896;
        if (arg0 != 65280) {
            method699(-53);
        }
        int var1 = class48.field1010 >> 7;
        int var2 = 0;
        int var3 = class246.field4536 >> 7;
        int var4 = class186.method1265(true, class246.field4536, class203.field3675, class48.field1010);
        if (var1 > 3 && var3 > 3 && ~var1 > -101 && var3 < 100) {
            for (int var5 = var1 + -4; var1 + 4 >= var5; ++var5) {
                for (int var6 = var3 + -4; ~var6 >= ~(var3 + 4); ++var6) {
                    int var7 = class203.field3675;
                    if (~var7 > -4 && (2 & class233.field4200[1][var5][var6]) == 2) {
                        ++var7;
                    }
                    int var8 = -class156.field2839[var7][var5][var6] + var4;
                    if (~var2 > ~var8) {
                        var2 = var8;
                    }
                }
            }
        }
        int var9 = var2 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class56.field1162 >= var9) {
            if (var9 < class56.field1162) {
                class56.field1162 += (-class56.field1162 + var9) / 80;
                return;
            }
        } else {
            class56.field1162 += (-class56.field1162 + var9) / 24;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)I")
    public static final int method700(int arg0, int arg1, int arg2, int arg3) {
        ++field1894;
        int var4 = arg2 & 3;
        if (arg3 != -20984) {
            field1908 = null;
        }
        if (var4 == 0) {
            return arg0;
        } else if (~var4 == -2) {
            return -arg1 + 7;
        } else {
            return var4 == 2 ? -arg0 + 7 : arg1;
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(B)I")
    public final int method701(byte arg0) {
        ++field1891;
        int var2 = 22 % ((14 - arg0) / 60);
        return this.field1900;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[[I")
    public int[][] method116(int arg0, int arg1) {
        ++field1898;
        if (arg1 != -9179) {
            return null;
        } else {
            int[][] var3 = super.field3022.method1148(arg0, arg1 ^ -479);
            if (super.field3022.field2957 && this.method698(2)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int var6 = this.field1902 * (~class57.field1185 != ~this.field1901 ? this.field1901 * arg0 / class57.field1185 : arg0);
                int[] var7 = var3[2];
                if (class115.field2146 != this.field1902) {
                    for (int var8 = 0; ~var8 > ~class115.field2146; ++var8) {
                        int var9 = this.field1902 * var8 / class115.field2146;
                        int var10 = this.field1892[var6 + var9];
                        var7[var8] = class209.method1370(4080, var10 << 4);
                        var5[var8] = class209.method1370(65280, var10) >> 4;
                        var4[var8] = class209.method1370(var10 >> 12, 4080);
                    }
                } else {
                    for (int var11 = 0; ~var11 > ~class115.field2146; ++var11) {
                        int var12 = this.field1892[var6++];
                        var7[var11] = class209.method1370(var12, 255) << 4;
                        var5[var11] = class209.method1370(var12, 65280) >> 4;
                        var4[var11] = class209.method1370(4080, var12 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Component;III)Llj;")
    public static final class130 method702(Component arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 3) {
            field1895 = null;
        }
        ++field1893;
        try {
            Class var4 = Class.forName("m");
            class130 var5 = (class130) var4.newInstance();
            var5.method35(true, arg3, arg1, arg0);
            return var5;
        } catch (Throwable var7) {
            class5 var6 = new class5();
            var6.method35(true, arg3, arg1, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            this.field1900 = arg0.method1049((byte) 114);
        }
        ++field1897;
        if (arg1) {
            this.field1902 = 104;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class104() {
        super(0, false);
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
    public final void method525(int arg0) {
        super.method525(arg0);
        ++field1905;
        this.field1892 = null;
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(B)V")
    public static void method703(byte arg0) {
        field1908 = null;
        field1907 = null;
        if (arg0 <= 18) {
            field1907 = null;
        }
        field1903 = null;
        field1906 = null;
        field1895 = null;
        field1890 = null;
        field1904 = null;
    }
}
