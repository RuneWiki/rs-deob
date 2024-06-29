import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class103 extends class33 {

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    private int field1900 = -1;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "Laf;")
    public static class7 field1903 = new class7(30);

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "Lrd;")
    private static class173 field1910 = class133.method843("Loading title screen )2 ", -102);

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "Lrd;")
    public static class173 field1909 = field1910;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "Lrd;")
    public static class173 field1913 = class133.method843("Versteckt", 115);

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "Lrd;")
    private static class173 field1919 = class133.method843("You can(Wt add yourself to your own ignore list)3", -93);

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "Lrd;")
    public static class173 field1921 = field1919;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "Lrd;")
    private static class173 field1911 = class133.method843("World", -69);

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "Lrd;")
    public static class173 field1915 = field1911;

    @OriginalMember(owner = "client!kd", name = "ib", descriptor = "Lrd;")
    public static class173 field1922 = field1911;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
    public int field1917;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "Ldg;")
    public static class38 field1918;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "[I")
    public int[] field1901;

    @OriginalMember(owner = "client!kd", name = "jb", descriptor = "[[I")
    public static int[][] field1923;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)I")
    public final int method264(int arg0) {
        ++field1912;
        if (arg0 > -116) {
            this.method177(-99, -98, (class121) null);
        }
        return this.field1900;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZIII)V")
    public static final void method638(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field1916;
        if (class166.field3206 != arg1 || class150.field2850 != arg5 || ~class203.field3951 != ~arg3 && class107.field2003) {
            class150.field2850 = arg5;
            class166.field3206 = arg1;
            class203.field3951 = arg3;
            if (!class107.field2003) {
                class203.field3951 = 0;
            }
            class148.method978(25, 8780);
            class140.method876(class221.field4252, true, -14911);
            int var6 = class43.field874;
            class43.field874 = arg5 * 8 + -48;
            int var7 = class108.field2024;
            class108.field2024 = (arg1 - 6) * 8;
            int var8 = -var7 + class108.field2024;
            int var9 = class108.field2024;
            int var10 = -var6 + class43.field874;
            int var11 = class43.field874;
            for (int var12 = 0; var12 < 32768; ++var12) {
                class120 var28 = client.field632[var12];
                if (var28 != null) {
                    for (int var29 = 0; ~var29 > -11; ++var29) {
                        var28.field2764[var29] -= var8;
                        var28.field2814[var29] -= var10;
                    }
                    var28.field2820 -= var8 * 128;
                    var28.field2801 -= var10 * 128;
                }
            }
            for (int var13 = 0; ~var13 > -2049; ++var13) {
                class212 var26 = class183.field3600[var13];
                if (var26 != null) {
                    for (int var27 = 0; ~var27 > -11; ++var27) {
                        var26.field2764[var27] -= var8;
                        var26.field2814[var27] -= var10;
                    }
                    var26.field2801 -= var10 * 128;
                    var26.field2820 -= var8 * 128;
                }
            }
            class172.field3347 = arg3;
            class175.field3447.method970(128, arg2, arg0, arg4);
            byte var14 = 0;
            byte var15 = 104;
            byte var16 = 0;
            byte var17 = 1;
            byte var18 = 104;
            byte var19 = 1;
            if (var10 < 0) {
                var18 = -1;
                var16 = 103;
                var19 = -1;
            }
            if (~var8 > -1) {
                var14 = 103;
                var15 = -1;
                var17 = -1;
            }
            for (int var20 = var14; var15 != var20; var20 += var17) {
                for (int var22 = var16; var18 != var22; var22 += var19) {
                    int var23 = var20 - -var8;
                    int var24 = var10 + var22;
                    for (int var25 = 0; var25 < 4; ++var25) {
                        if (var23 >= 0 && ~var24 <= -1 && var23 < 104 && var24 < 104) {
                            class160.field2985[var25][var20][var22] = class160.field2985[var25][var23][var24];
                        } else {
                            class160.field2985[var25][var20][var22] = null;
                        }
                    }
                }
            }
            for (class189 var21 = (class189) class108.field2017.method915(-1); var21 != null; var21 = (class189) class108.field2017.method910((byte) 88)) {
                var21.field3707 -= var8;
                var21.field3681 -= var10;
                if (var21.field3707 < 0 || ~var21.field3681 > -1 || ~var21.field3707 <= -105 || ~var21.field3681 <= -105) {
                    var21.method824((byte) -127);
                }
            }
            class111.field2070 = false;
            class34.field746 = -1;
            if (class55.field1094 != 0) {
                class193.field3759 -= var10;
                class55.field1094 -= var8;
            }
            class73.field1421 = 0;
            class170.field3281.method916((byte) 110);
            class184.field3609.method916((byte) 110);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)Lqf;")
    public static final class165 method639(int arg0, boolean arg1) {
        ++field1904;
        if (!arg1) {
            method639(-118, false);
        }
        int var2 = 65535 & arg0;
        int var3 = arg0 >> 16;
        if (class63.field1232[var3] == null || class63.field1232[var3][var2] == null) {
            boolean var4 = class212.method1389(-125, var3);
            if (!var4) {
                return null;
            }
        }
        return class63.field1232[var3][var2];
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)[[I")
    public int[][] method178(int arg0, int arg1) {
        ++field1907;
        int[][] var3 = super.field731.method1340(-110, arg1);
        if (super.field731.field3925 && this.method640(85)) {
            int[] var4 = var3[2];
            int var5 = this.field1917 * (class99.field1802 == this.field1906 ? arg1 : this.field1906 * arg1 / class99.field1802);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            if (class117.field2173 == this.field1917) {
                for (int var8 = 0; ~var8 > ~class117.field2173; ++var8) {
                    int var9 = this.field1901[var5++];
                    var4[var8] = class209.method1383(4080, var9 << 4);
                    var7[var8] = class209.method1383(4080, var9 >> 4);
                    var6[var8] = class209.method1383(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; ~class117.field2173 < ~var10; ++var10) {
                    int var11 = this.field1917 * var10 / class117.field2173;
                    int var12 = this.field1901[var5 - -var11];
                    var4[var10] = class209.method1383(var12 << 4, 4080);
                    var7[var10] = class209.method1383(var12 >> 4, 4080);
                    var6[var10] = class209.method1383(var12, 16711680) >> 12;
                }
            }
        }
        return arg0 <= 112 ? null : var3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (~arg0 == -1) {
            this.field1900 = arg2.method755((byte) -75);
        }
        if (arg1 < -99) {
            ++field1914;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class103() {
        super(0, false);
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)Z")
    public final boolean method640(int arg0) {
        ++field1920;
        if (this.field1901 != null) {
            return true;
        } else {
            if (arg0 < 0) {
                field1915 = null;
            }
            if (~this.field1900 <= -1) {
                class180 var2 = class133.method848(class169.field3276, this.field1900, -1);
                var2.method1211();
                this.field1901 = var2.field3546;
                this.field1906 = var2.field3543;
                this.field1917 = var2.field3547;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V")
    public static void method641(int arg0) {
        field1919 = null;
        field1903 = null;
        field1921 = null;
        field1913 = null;
        field1922 = null;
        field1909 = null;
        field1911 = null;
        field1915 = null;
        field1918 = null;
        if (arg0 != -105) {
            method639(58, true);
        }
        field1923 = null;
        field1910 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
    public final void method261(byte arg0) {
        super.method261((byte) 88);
        this.field1901 = null;
        ++field1902;
        if (arg0 < 16) {
            field1921 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLbc;ZIII)V")
    public static final void method642(boolean arg0, class14 arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class12.field192 = arg1;
        class55.field1097 = 1;
        if (arg2) {
            method641(26);
        }
        class58.field1145 = 10000;
        class193.field3749 = arg0;
        class134.field2535 = arg4;
        ++field1905;
        class28.field570 = arg3;
        class194.field3761 = arg5;
    }
}
