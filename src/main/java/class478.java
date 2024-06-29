import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class class478 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public int field6877 = 2;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Z")
    public boolean field6875 = true;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Z")
    public boolean field6880 = true;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public int field6893 = 0;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "Z")
    public boolean field6894 = false;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Z")
    public boolean field6888 = true;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public int field6901 = 2;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "Z")
    public boolean field6900 = true;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Z")
    public boolean field6897 = true;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public int field6903 = 127;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Z")
    public boolean field6887 = true;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public int field6902 = 0;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Z")
    public boolean field6884 = true;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public int field6905 = 0;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "Z")
    public boolean field6907 = true;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public int field6878 = 0;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public int field6881 = 2;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "Z")
    public boolean field6898 = false;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public int field6895 = 2;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Z")
    public boolean field6890 = true;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "Z")
    public boolean field6896 = true;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public int field6876 = 0;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Z")
    public boolean field6892 = true;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
    public int field6904 = 0;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public int field6912 = 127;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public int field6899 = 255;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public int field6909 = 1;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "Z")
    public boolean field6914 = true;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "Z")
    public boolean field6911 = true;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public int field6913 = 3;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "[F")
    public static float[] field6882 = new float[4];

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Z")
    public boolean field6886;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "Z")
    public boolean field6908;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 10)
    public static void method2790(byte arg0) {
        if (arg0 == 71) {
            field6882 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZZIII)V", line = 44)
    public static final void method2791(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field6889++;
        if (!arg0 && class134.field1714 == arg4 && class454.field6612 == arg2 && class355.field5121 == class234.field3290 || class118.field1533.method2961(class293.field4174, 29)) {
            return;
        }
        class454.field6612 = arg2;
        class134.field1714 = arg4;
        class234.field3290 = class355.field5121;
        if (class118.field1533.method2961(class293.field4174, arg3 - 99)) {
            class234.field3290 = 0;
        }
        if (arg1) {
            class319.method1921(15508, 28);
        } else {
            class319.method1921(15508, 25);
        }
        class475.method2783(class181.field2587, class489.field7488.method1220(2969, class81.field1122), true, 6);
        int var5 = class455.field6637;
        int var6 = class223.field3158;
        class455.field6637 = (class134.field1714 - (class362.field5442 >> 4)) * 8;
        if (arg3 != 128) {
            return;
        }
        class223.field3158 = (class454.field6612 - (class203.field2813 >> 4)) * 8;
        class134.field1713 = class249.method1554(class134.field1714 * 8, class454.field6612 * 8);
        class191.field2706 = null;
        int var7 = class455.field6637 - var5;
        int var8 = class223.field3158 - var6;
        if (arg1) {
            class339.field4942 = 0;
            int var12 = (class362.field5442 - 1) * 128;
            int var13 = class203.field2813 * 128 - 128;
            for (int var14 = 0; var14 < 32768; var14++) {
                class139 var22 = class504.field7697[var14];
                if (var22 != null) {
                    var22.field2959 -= var7 * 128;
                    var22.field2966 -= var8 * 128;
                    if (var22.field2959 >= 0 && var22.field2959 <= var12 && var22.field2966 >= 0 && var22.field2966 <= var13) {
                        boolean var23 = true;
                        for (int var24 = 0; var24 < 10; var24++) {
                            var22.field4279[var24] -= var7;
                            var22.field4282[var24] -= var8;
                            if (var22.field4279[var24] < 0 || var22.field4279[var24] >= class362.field5442 || var22.field4282[var24] < 0 || var22.field4282[var24] >= class203.field2813) {
                                var23 = false;
                            }
                        }
                        if (var23) {
                            class263.field3749[class339.field4942++] = var14;
                        } else {
                            class504.field7697[var14].method876(0, null);
                            class504.field7697[var14] = null;
                        }
                    } else {
                        class504.field7697[var14].method876(0, null);
                        class504.field7697[var14] = null;
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < 32768; var9++) {
                class139 var10 = class504.field7697[var9];
                if (var10 != null) {
                    for (int var11 = 0; var11 < 10; var11++) {
                        var10.field4279[var11] -= var7;
                        var10.field4282[var11] -= var8;
                    }
                    var10.field2959 -= var7 * 128;
                    var10.field2966 -= var8 * 128;
                }
            }
        }
        for (int var15 = 0; var15 < 2048; var15++) {
            class313 var20 = class262.field3742[var15];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field4279[var21] -= var7;
                    var20.field4282[var21] -= var8;
                }
                var20.field2966 -= var8 * 128;
                var20.field2959 -= var7 * 128;
            }
        }
        class434[] var16 = class254.field3662;
        for (int var17 = 0; var17 < var16.length; var17++) {
            class434 var19 = var16[var17];
            if (var19 != null) {
                var19.field6360 -= var7 * 128;
                var19.field6362 -= var8 * 128;
            }
        }
        class345.method2079(true, var7, var8);
        for (class234 var18 = (class234) class117.field1517.method2096(-21400); var18 != null; var18 = (class234) class117.field1517.method2084((byte) 19)) {
            var18.field3280 -= var8;
            var18.field3283 -= var7;
            if (class247.field3542 != 3 && (var18.field3283 < 0 || var18.field3280 < 0 || var18.field3283 >= class362.field5442 || class203.field2813 <= var18.field3280)) {
                var18.method536(false);
            }
        }
        if (class495.field7547 != 0) {
            class495.field7547 -= var7;
            class2.field33 -= var8;
        }
        class276.method1695(false);
        if (arg1) {
            class282.field4026 -= var8 * 128;
            class142.field1851 -= var8;
            class350.field5085 -= var8;
            class205.field2843 -= var7 * 128;
            class293.field4173 -= var7;
            class167.field2190 -= var7;
            if (Math.abs(var7) > class362.field5442 || Math.abs(var8) > class203.field2813) {
                class428.method2551(-50);
            }
        } else if (class306.field4454 == 4) {
            class318.field4665 -= var7 * 128;
            class356.field5150 -= var8 * 128;
            class365.field5493 -= var7 * 128;
            class52.field780 -= var8 * 128;
        } else {
            class306.field4454 = 1;
        }
        class427.method2544((byte) 105);
        class428.method2552(18583);
        class488.field7470.method2089(328);
        class286.field4086.method2089(arg3 ^ 0x1C8);
        class238.field3325.method247(arg3 - 15115);
        class212.method1315(0);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)Z", line = 306)
    public static final boolean method2792(int arg0, byte arg1) {
        if (arg1 != -87) {
            method2796(-88, 22, false, (byte) 74);
        }
        field6883++;
        if (arg0 == 3 || arg0 == 17 || arg0 == 12 || arg0 == 49 || arg0 == 1010) {
            return true;
        } else {
            return arg0 == 23 || arg0 == 1002;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V", line = 328)
    public static final void method2793(byte arg0) {
        field6906++;
        if (class465.field6737 == -1) {
            return;
        }
        int var1 = class137.field1797.method2038(9);
        int var2 = class137.field1797.method2044((byte) -86);
        class270 var3 = (class270) class265.field3759.method2096(-21400);
        if (var3 != null) {
            var1 = var3.method1018(-30361);
            var2 = var3.method1019((byte) -73);
        }
        if (arg0 < 62) {
            method2795(26, -125, 110);
        }
        class235.method1426(class223.field3156, 0, var2, class465.field6737, 0, -121, 0, 0, class207.field2874, var1);
        if (class26.field431 != null) {
            class341.method2067(var2, var1, -3);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 362)
    public static final void method2794(int arg0) {
        field6891++;
        if (arg0 != 1) {
            field6882 = null;
        }
        class5 var1 = class381.field5675;
        synchronized (class381.field5675) {
            class381.field5675.method38((byte) -39);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Let;", line = 376)
    public static final class403 method2795(int arg0, int arg1, int arg2) {
        class468 var3 = class358.field5312[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6778;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIZB)I", line = 457)
    public static final int method2796(int arg0, int arg1, boolean arg2, byte arg3) {
        if (arg3 != -98) {
            method2794(-44);
        }
        field6910++;
        class220 var4 = class224.method1384(arg2, true, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field3101.length; var6++) {
                if (var4.field3097[var6] == arg0) {
                    var5 += var4.field3101[var6];
                }
            }
            return var5;
        }
    }
}
