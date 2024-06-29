import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class227 extends class51 {

    @OriginalMember(owner = "client!e", name = "G", descriptor = "Lhi;")
    private static class82 field3925 = class95.method664((byte) -105, "Loaded fonts");

    @OriginalMember(owner = "client!e", name = "J", descriptor = "Lhi;")
    public static class82 field3928 = field3925;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "Lhi;")
    public static class82 field3924 = class95.method664((byte) -67, "::breakcon");

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "Z")
    public static boolean field3935 = false;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    public static int field3939 = 0;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public int field3923;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public int field3927;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "Lhi;")
    public class82 field3931;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)V", line = 5)
    public final void method1616(int arg0) {
        field3937++;
        if (arg0 != 64) {
            this.method1624((byte) 113);
        }
        this.field824 |= Long.MIN_VALUE;
        if (this.method1621(arg0 + 1914033888) == 0L) {
            class200.field3439.method800((byte) -44, this);
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)V", line = 37)
    public static void method1617(byte arg0) {
        field3924 = null;
        field3928 = null;
        field3925 = null;
        int var1 = -80 % ((34 - arg0) / 61);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLum;)V", line = 48)
    public static final void method1618(boolean arg0, class222 arg1) {
        class197.field3377 = class60.method395(class129.field2251, 0, arg1, (byte) -10);
        field3936++;
        class27.field362 = new class186[class197.field3377.length];
        class272.field4584 = new class186[class197.field3377.length];
        class16.field147 = new class186[class197.field3377.length];
        for (int var2 = 0; var2 < class197.field3377.length; var2++) {
            class197.field3377[var2].method1280();
            class27.field362[var2] = class197.field3377[var2].method1281();
            class197.field3377[var2].method1280();
            class272.field4584[var2] = class197.field3377[var2].method1281();
            class197.field3377[var2].method1280();
            class16.field147[var2] = class197.field3377[var2].method1281();
            class197.field3377[var2].method1280();
        }
        class166.field2903 = class35.method267((byte) -30, class294.field4925, 0, arg1);
        class99.field1779 = class139.method945(64, 0, class124.field2170, arg1);
        class166.field2908 = class139.method945(64, 0, class34.field525, arg1);
        class44.field762 = class139.method945(64, 0, class214.field3736, arg1);
        class259.field4430 = class139.method945(64, 0, class79.field1338, arg1);
        class290.field4872 = class255.method1827(class139.field2385, arg1, true, 0);
        class20.field261 = class255.method1827(class129.field2250, arg1, true, 0);
        class265.field4528 = class241.method1730((byte) -56, class149.field2530, 0, arg1);
        class160.field2802 = class255.method1827(class236.field4103, arg1, !arg0, 0);
        class42.field745 = class255.method1827(class55.field879, arg1, true, 0);
        class84.field1512 = class238.method1678(3738, class9.field69, arg1, 0);
        class193.field3278 = class238.method1678(3738, class134.field2324, arg1, 0);
        class21.field283.method118(class193.field3278, (int[]) null);
        class138.field2364.method118(class193.field3278, (int[]) null);
        class253.field4354.method118(class193.field3278, (int[]) null);
        if (class147.field2485) {
            class248.field4291 = class60.method395(class243.field4230, 0, arg1, (byte) -10);
            for (int var3 = 0; var3 < class248.field4291.length; var3++) {
                class248.field4291[var3].method1278();
            }
        }
        class303 var4 = class237.method1675(0, arg0, arg1, class83.field1489);
        var4.method2097();
        if (class147.field2485) {
            class55.field877 = new class210(var4);
        } else {
            class55.field877 = var4;
        }
        class303[] var5 = class35.method267((byte) -30, class93.field1700, 0, arg1);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method2097();
        }
        if (class147.field2485) {
            class68.field1061 = new class86[var5.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class68.field1061[var7] = new class210(var5[var7]);
            }
        } else {
            class68.field1061 = var5;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        int var11 = (int) (Math.random() * 41.0D) - 20;
        for (int var12 = 0; var12 < class166.field2903.length; var12++) {
            class166.field2903[var12].method2098(var8 + var11, var10 - -var11, var9 + var11);
        }
        class197.field3377[0].method1277(var8 + var11, var10 + var11, var9 + var11);
        if (class147.field2485) {
            class60.field949 = new class86[class166.field2903.length];
            for (int var13 = 0; var13 < class166.field2903.length; var13++) {
                class60.field949[var13] = new class210(class166.field2903[var13]);
            }
        } else {
            class60.field949 = class166.field2903;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(II)V", line = 160)
    public class227(int arg0, int arg1) {
        this.field2418 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V", line = 173)
    public static final void method1619(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 30586) {
            return;
        }
        for (class241 var5 = (class241) class164.field2871.method1936(arg0 - 14413); var5 != null; var5 = (class241) class164.field2871.method1926((byte) 90)) {
            class216.method1540(var5, (byte) -108, arg2, arg4, arg3, arg1);
        }
        for (class241 var6 = (class241) class131.field2276.method1936(16173); var6 != null; var6 = (class241) class131.field2276.method1926((byte) 90)) {
            byte var7 = 1;
            if (var6.field4191.field1703 == var6.field4191.field1668) {
                var7 = 0;
            } else if (var6.field4191.field1668 == var6.field4191.field1667) {
                var7 = 2;
            }
            if (var6.field4173 != var7) {
                int var8 = class195.method1360(var6.field4191, -1308789364);
                if (var6.field4178 != var8) {
                    if (var6.field4181 != null) {
                        class219.field3803.method882(var6.field4181);
                        var6.field4181 = null;
                    }
                    var6.field4178 = var8;
                }
                var6.field4173 = var7;
            }
            var6.field4192 = var6.field4191.field1685;
            var6.field4184 = var6.field4191.field1685 + var6.field4191.method520(true) * 64;
            var6.field4196 = var6.field4191.field1689;
            var6.field4193 = var6.field4191.field1689 + (var6.field4191.method520(true) * 64);
            class216.method1540(var6, (byte) -103, arg2, arg4, arg3, arg1);
        }
        field3938++;
        for (class241 var9 = (class241) class38.field642.method502((byte) -104); var9 != null; var9 = (class241) class38.field642.method494(true)) {
            byte var10 = 1;
            if (var9.field4177.field1703 == var9.field4177.field1668) {
                var10 = 0;
            } else if (var9.field4177.field1668 == var9.field4177.field1667) {
                var10 = 2;
            }
            if (var9.field4173 != var10) {
                int var11 = class23.method155(var9.field4177, false);
                if (var9.field4178 != var11) {
                    if (var9.field4181 != null) {
                        class219.field3803.method882(var9.field4181);
                        var9.field4181 = null;
                    }
                    var9.field4178 = var11;
                }
                var9.field4173 = var10;
            }
            var9.field4192 = var9.field4177.field1685;
            var9.field4184 = var9.field4177.field1685 + (var9.field4177.method520(true) * 64);
            var9.field4196 = var9.field4177.field1689;
            var9.field4193 = var9.field4177.field1689 + var9.field4177.method520(true) * 64;
            class216.method1540(var9, (byte) -123, arg2, arg4, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)I", line = 287)
    public final int method1620(byte arg0) {
        if (arg0 <= 118) {
            method1623(true);
        }
        field3932++;
        return (int) this.field2418;
    }

    @OriginalMember(owner = "client!e", name = "h", descriptor = "(I)J", line = 298)
    public final long method1621(int arg0) {
        field3930++;
        if (arg0 != 1914033952) {
            field3924 = (class82) null;
        }
        return this.field824 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)I", line = 309)
    public final int method1622(boolean arg0) {
        field3933++;
        if (!arg0) {
            this.method1616(-48);
        }
        return (int) (this.field2418 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)V", line = 324)
    public static final void method1623(boolean arg0) {
        class139.field2380.method2168(0);
        field3926++;
        if (!arg0) {
            method1623(true);
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(B)V", line = 335)
    public final void method1624(byte arg0) {
        this.field824 = this.field824 & Long.MIN_VALUE | class57.method391(19211) + 500L;
        field3934++;
        if (arg0 == -101) {
            class221.field3822.method800((byte) -99, this);
        }
    }
}
