import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class209 implements class17 {

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field2987 = -1;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field2986 = -1;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field2989 = 0;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "[Lsr;")
    public static class136[] field2990 = new class136[8];

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "[I")
    public static int[] field2993;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 3)
    public static void method1479(int arg0) {
        field2993 = null;
        if (arg0 != 8694) {
            method1479(-22);
        }
        field2990 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lqm;)V", line = 18)
    public static final void method1480(class78 arg0) {
        if (class153.field2273 >= 255) {
            return;
        }
        class282.field4039[class153.field2273] = arg0;
        class433.field6194[class153.field2273] = false;
        class153.field2273++;
        int var1 = arg0.field1010;
        if (arg0.field1008) {
            var1 = 0;
        }
        int var2 = arg0.field1010;
        if (arg0.field996) {
            var2 = class243.field3603 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field5647 + 64 - arg0.field5639 >> 7;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field5647 + arg0.field5639 - 64 >> 7;
            if (var6 >= class407.field5751) {
                var6 = class407.field5751 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field1001[var4++];
                int var9 = (var8 >>> 8) + (arg0.field5644 + 64 - arg0.field5639 >> 7);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class394.field5548) {
                    var10 = class394.field5548 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    int var12 = class115.field1487[var3][var11][var7];
                    if ((var12 & 0xFF) == 0) {
                        class115.field1487[var3][var11][var7] = var12 | class153.field2273;
                    } else if ((var12 & 0xFF00) == 0) {
                        class115.field1487[var3][var11][var7] = var12 | class153.field2273 << 8;
                    } else if ((var12 & 0xFF0000) == 0) {
                        class115.field1487[var3][var11][var7] = var12 | class153.field2273 << 16;
                    } else if ((var12 & 0xFF000000) == 0) {
                        class115.field1487[var3][var11][var7] = var12 | class153.field2273 << 24;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lg;", line = 108)
    public static final class87 method1481(int arg0, int arg1) {
        field2988++;
        class87 var2 = (class87) class425.field6069.method99(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class249.field3720.method643(29, arg1, true);
        class87 var4 = new class87();
        if (var3 != null) {
            var4.method520(arg1, 122, new class130(var3));
        }
        class425.field6069.method90(var4, (long) arg1, arg0 ^ arg0);
        return var4;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(CI)C", line = 130)
    public static final char method1482(char arg0, int arg1) {
        field2994++;
        if (arg1 == 402) {
            return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
        } else {
            return (char) 65441;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZJ[I)Ljava/lang/String;", line = 145)
    public final String method106(int arg0, boolean arg1, long arg2, int[] arg3) {
        field2985++;
        if (arg0 == 0) {
            class294 var6 = class445.method2772(arg3[0], 0);
            return var6.method1993((int) arg2, (byte) -119);
        } else if (arg0 == 1 || arg0 == 10) {
            class409 var7 = class167.method1202(!arg1, (int) arg2);
            return var7.field5871;
        } else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
            return class445.method2772(arg3[0], 0).method1993((int) arg2, (byte) -87);
        } else {
            if (arg1) {
                method1479(19);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)I", line = 182)
    public static int method1483(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V", line = 190)
    public static final void method1484(boolean arg0) {
        field2992++;
        class186.field2657 = new class223[class438.field6255.method633(2)][];
        if (!arg0) {
            method1486(-64, 35);
        }
        class189.field2713 = new boolean[class438.field6255.method633(2)];
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)I", line = 219)
    public static final int method1485(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 1667) {
            return -82;
        }
        field2984++;
        if (arg2 <= arg3) {
            return arg3 <= arg0 ? arg3 : arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(II)Lae;", line = 231)
    public static final class135 method1486(int arg0, int arg1) {
        field2991++;
        class15 var2 = class297.field4320;
        class135 var3;
        synchronized (class297.field4320) {
            var3 = (class135) class297.field4320.method99(true, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class323.field4706.method643(class204.method1428(arg0, arg1 ^ 0x70), class327.method2148(arg0, (byte) -78), true);
        class135 var5 = new class135();
        var5.field2084 = arg0;
        if (arg1 != 11) {
            method1484(true);
        }
        if (var4 != null) {
            var5.method1037(new class130(var4), 0);
        }
        class15 var6 = class297.field4320;
        synchronized (class297.field4320) {
            class297.field4320.method90(var5, (long) arg0, 0);
            return var5;
        }
    }
}
