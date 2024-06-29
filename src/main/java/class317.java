import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class317 extends class59 {

    @OriginalMember(owner = "client!am", name = "z", descriptor = "I")
    public int field5357;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "I")
    public int field5360;

    @OriginalMember(owner = "client!am", name = "E", descriptor = "Lbc;")
    public static class302 field5361 = null;

    @OriginalMember(owner = "client!am", name = "G", descriptor = "[B")
    public static byte[] field5362 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!am", name = "B", descriptor = "Lok;")
    public static class41 field5359 = class137.method956("Sprites geladen)3", 45);

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public static int field5353 = 0;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!am", name = "H", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "Lmh;")
    public static class65 field5358;

    @OriginalMember(owner = "client!am", name = "I", descriptor = "Z")
    public static boolean field5364;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(I)V", line = 4)
    public static void method2184(int arg0) {
        field5359 = null;
        if (arg0 > -88) {
            method2188(-65);
        }
        field5361 = null;
        field5362 = null;
        field5358 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZIII)V", line = 17)
    public static final void method2185(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg2) {
            return;
        }
        field5356++;
        int var8 = arg1 + 1;
        class269.method1908(19, class239.field3829[arg1], arg0, arg5, arg3);
        int var9 = arg4 - 1;
        class269.method1908(19, class239.field3829[arg4], arg0, arg5, arg3);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class239.field3829[var6];
            var7[arg3] = var7[arg5] = arg0;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILof;II)V", line = 40)
    public static final void method2186(int arg0, int arg1, class245 arg2, int arg3, int arg4) {
        if (arg1 < 11) {
            field5364 = false;
        }
        field5355++;
        if (class62.field913 == arg2 || class98.field1432 >= 400) {
            return;
        }
        class41 var5;
        if (arg2.field3945 == 0) {
            boolean var6 = true;
            if (class62.field913.field3935 != -1 && arg2.field3935 != -1) {
                int var7 = class62.field913.field3942 > arg2.field3942 ? class62.field913.field3942 : arg2.field3942;
                int var8 = class62.field913.field3935 < arg2.field3935 ? class62.field913.field3935 : arg2.field3935;
                int var9 = var7 * 10 / 100 + var8 + 5;
                int var10 = class62.field913.field3942 - arg2.field3942;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var9 < var10) {
                    var6 = false;
                }
            }
            if (arg2.field3934 > arg2.field3942) {
                var5 = class187.method1346(new class41[] { arg2.method1755(1774), var6 ? class105.method726(true, class62.field913.field3942, arg2.field3942) : class146.field2230, class288.field4671, class208.field3364, class1.method4(arg2.field3942, (byte) 51), class156.field2464, class1.method4(arg2.field3934 - arg2.field3942, (byte) 36), class298.field4832 }, 0);
            } else {
                var5 = class187.method1346(new class41[] { arg2.method1755(1774), var6 ? class105.method726(true, class62.field913.field3942, arg2.field3942) : class146.field2230, class288.field4671, class208.field3364, class1.method4(arg2.field3942, (byte) 100), class298.field4832 }, 0);
            }
        } else {
            var5 = class187.method1346(new class41[] { arg2.method1755(1774), class288.field4671, class250.field3985, class1.method4(arg2.field3945, (byte) 120), class298.field4832 }, 0);
        }
        if (class101.field1445 == 1) {
            class3.field40++;
            class79.method565((long) arg0, class187.method1346(new class41[] { class74.field1096, class24.field367, var5 }, 0), (byte) 110, (short) 4, arg4, class18.field237, arg3);
        } else if (!class128.field1901) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class240.field3843[var11] != null) {
                    class171.field2758++;
                    short var12 = 0;
                    boolean var13 = false;
                    if (class110.field1564 == 0 && class240.field3843[var11].method306(class176.field2864, 27080)) {
                        if (class62.field913.field3942 < arg2.field3942) {
                            var12 = 2000;
                        }
                        if (class62.field913.field3925 != 0 && arg2.field3925 != 0) {
                            if (class62.field913.field3925 == arg2.field3925) {
                                var12 = 2000;
                            } else {
                                var12 = 0;
                            }
                        }
                    } else if (class265.field4206[var11]) {
                        var12 = 2000;
                    }
                    short var14 = class192.field3105[var11];
                    short var15 = (short) (var12 + var14);
                    class79.method565((long) arg0, class187.method1346(new class41[] { class146.field2230, var5 }, 0), (byte) 126, var15, arg4, class240.field3843[var11], arg3);
                }
            }
        } else if ((class193.field3108 & 0x8) == 8) {
            class79.method565((long) arg0, class187.method1346(new class41[] { class126.field1871, class24.field367, var5 }, 0), (byte) 114, (short) 28, arg4, class94.field1389, arg3);
            class119.field1756++;
        }
        for (int var16 = 0; var16 < class98.field1432; var16++) {
            if (class296.field4780[var16] == 36) {
                class203.field3286[var16] = class187.method1346(new class41[] { class146.field2230, var5 }, 0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(I)V", line = 166)
    public static final void method2187(int arg0) {
        class5.field49 = 0;
        class116.field1679 = -1;
        field5363++;
        class295.field4770 = -1;
        class131.field1962 = -1;
        class162.field2573 = -1;
        class57.field816 = 0;
        class1.field7 = 0;
        class98.field1432 = 0;
        class38.field586 = 0;
        class251.field3993 = false;
        class285.field4642.field1640 = 0;
        class164.field2597.field1640 = 0;
        class124.field1846 = 0;
        for (int var1 = 0; var1 < class246.field3955.length; var1++) {
            if (class246.field3955[var1] != null) {
                class246.field3955[var1].field4335 = -1;
            }
        }
        for (int var2 = 0; var2 < class216.field3471.length; var2++) {
            if (class216.field3471[var2] != null) {
                class216.field3471[var2].field4335 = -1;
            }
        }
        class241.method1731(62838176);
        class28.field416 = arg0;
        class282.method1991(-8, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class195.field3151[var3] = true;
        }
        class278.method1966(arg0 ^ 0x48);
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(I)V", line = 230)
    public static final void method2188(int arg0) {
        field5354++;
        if (~class45.field707 > arg0) {
            class45.field707 = 0;
            class245.field3909 = -1;
            class296.field4788 = -1;
        }
        if (class66.field1004 < class45.field707) {
            class245.field3909 = -1;
            class45.field707 = class66.field1004;
            class296.field4788 = -1;
        }
        if (class110.field1565 < 0) {
            class296.field4788 = -1;
            class245.field3909 = -1;
            class110.field1565 = 0;
        }
        if (class110.field1565 > class212.field3414) {
            class245.field3909 = -1;
            class110.field1565 = class212.field3414;
            class296.field4788 = -1;
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(II)V", line = 276)
    public class317(int arg0, int arg1) {
        this.field5357 = arg0;
        this.field5360 = arg1;
    }
}
