import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lu;")
    public static class135 field96 = class87.method676((byte) -59, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "[J")
    public static long[] field99 = new long[100];

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Lu;")
    public static class135 field98 = class87.method676((byte) -87, "null");

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Lu;")
    public static class135 field104 = class87.method676((byte) -51, "blinken1:");

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Lu;")
    public static class135 field102 = null;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Z")
    public static boolean field103 = false;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lu;")
    private static class135 field107 = class87.method676((byte) -72, "Loaded input handler");

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lu;")
    public static class135 field100 = field107;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field109 = 0;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lg;")
    public static class43 field108;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method14(int arg0) {
        field100 = null;
        field99 = null;
        field96 = null;
        field98 = null;
        field108 = null;
        field107 = null;
        field102 = null;
        field104 = null;
        if (arg0 >= -73) {
            method15(true);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
    public static final void method15(boolean arg0) {
        field101++;
        if (!arg0) {
            method16(-113, null, -96, -3, true, -119);
        }
        if (class62.field1553 != 0 && class62.field1553 != 3 || class48.field1151 != 1) {
            return;
        }
        int var1 = class20.field470 - 9;
        int var2 = class139.field3389 - 550 - 25;
        if (var2 < 0 || var1 < 0 || var2 >= 146 || var1 >= 151) {
            return;
        }
        int var3 = class5.field126 + class22.field550 & 0x7FF;
        int var4 = class51.field1213[var3];
        int var5 = (class48.field1143 + 256) * var4 >> 8;
        var2 -= 73;
        int var6 = class51.field1203[var3];
        var1 -= 75;
        int var7 = (class48.field1143 + 256) * var6 >> 8;
        int var8 = var1 * var7 - var2 * var5 >> 11;
        int var9 = var1 * var5 + var2 * var7 >> 11;
        int var10 = class116.field2789.field173 + var9 >> 7;
        int var11 = class116.field2789.field172 - var8 >> 7;
        boolean var12 = class56.method432(1, 0, true, 0, var11, 0, var10, 0, 0, class116.field2789.field162[0], true, class116.field2789.field192[0]);
        if (!var12) {
            return;
        }
        class152.field3751.method452(var2, 255);
        class152.field3751.method452(var1, 255);
        class152.field3751.method451(class22.field550, (byte) 28);
        class152.field3751.method452(57, 255);
        class152.field3751.method452(class5.field126, 255);
        class152.field3751.method452(class48.field1143, 255);
        class152.field3751.method452(89, 255);
        class152.field3751.method451(class116.field2789.field173, (byte) 28);
        class152.field3751.method451(class116.field2789.field172, (byte) 28);
        class152.field3751.method452(class101.field2426, 255);
        class152.field3751.method452(63, 255);
        return;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILg;IIZI)V")
    public static final void method16(int arg0, class43 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class76.field1804 = arg1;
        class87.field2075 = 10000;
        class12.field290 = 1;
        class93.field2199 = arg4;
        field97++;
        class126.field3001 = arg2;
        class100.field2417 = arg0;
        class141.field3418 = arg5;
        if (arg3 < 82) {
            field99 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLba;)V")
    public static final void method17(byte arg0, class9 arg1) {
        field105++;
        if (arg1.field216 == 0) {
            return;
        }
        if (arg0 != 54) {
            field99 = null;
        }
        if (arg1.field227 != -1 && arg1.field227 < 32768) {
            class111 var2 = class96.field2340[arg1.field227];
            if (var2 != null) {
                int var3 = arg1.field173 - var2.field173;
                int var4 = arg1.field172 - var2.field172;
                if (var3 != 0 || var4 != 0) {
                    arg1.field213 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field227 >= 32768) {
            int var5 = arg1.field227 - 32768;
            if (class46.field1101 == var5) {
                var5 = 2047;
            }
            class145 var6 = class131.field3166[var5];
            if (var6 != null) {
                int var7 = arg1.field173 - var6.field173;
                int var8 = arg1.field172 - var6.field172;
                if (var7 != 0 || var8 != 0) {
                    arg1.field213 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field160 != 0 || arg1.field223 != 0) && (arg1.field195 == 0 || arg1.field218 > 0)) {
            int var9 = arg1.field173 - (arg1.field160 - class126.field3010 - class126.field3010) * 64;
            int var10 = arg1.field172 - (arg1.field223 - class76.field1795 - class76.field1795) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field213 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field223 = 0;
            arg1.field160 = 0;
        }
        int var11 = arg1.field213 - arg1.field230 & 0x7FF;
        if (var11 == 0) {
            arg1.field234 = 0;
            return;
        }
        arg1.field234++;
        if (var11 > 1024) {
            boolean var12 = true;
            arg1.field230 -= arg1.field216;
            if (var11 < arg1.field216 || var11 > 2048 - arg1.field216) {
                var12 = false;
                arg1.field230 = arg1.field213;
            }
            if (arg1.field232 == arg1.field159 && (arg1.field234 > 25 || var12)) {
                if (arg1.field217 == -1) {
                    arg1.field159 = arg1.field198;
                } else {
                    arg1.field159 = arg1.field217;
                }
            }
        } else {
            arg1.field230 += arg1.field216;
            boolean var13 = true;
            if (var11 < arg1.field216 || 2048 - arg1.field216 < var11) {
                arg1.field230 = arg1.field213;
                var13 = false;
            }
            if (arg1.field232 == arg1.field159 && (arg1.field234 > 25 || var13)) {
                if (arg1.field185 == -1) {
                    arg1.field159 = arg1.field198;
                } else {
                    arg1.field159 = arg1.field185;
                }
            }
        }
        arg1.field230 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIB)I")
    public static final int method18(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg1 & 0x3;
        field106++;
        if (arg3 != 123) {
            field98 = null;
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
    public static int method19(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
