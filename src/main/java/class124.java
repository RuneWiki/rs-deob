import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class124 extends class260 {

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    private int field2279 = 4096;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "Z")
    private boolean field2288 = true;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "Loh;")
    private static class263 field2277 = class253.method1681(-126, "Loading sprites )2 ");

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "Loh;")
    public static class263 field2280 = class253.method1681(-118, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "Loh;")
    public static class263 field2281 = field2277;

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "Loh;")
    public static class263 field2286 = class253.method1681(-128, "Fertigkeit: ");

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "Loh;")
    public static class263 field2285 = class253.method1681(-124, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "Lek;")
    public static class160 field2276;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "[I")
    public static int[] field2283;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        ++field2278;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field2288 = ~arg2.method1301(-8317) == -2;
            }
        } else {
            this.field2279 = arg2.method1294((byte) 3);
        }
        if (arg1 != 5701) {
            method795(-64);
        }
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V")
    public static void method793(int arg0) {
        field2280 = null;
        field2286 = null;
        field2285 = null;
        field2276 = null;
        if (arg0 > -115) {
            method797(48, (class263[]) null);
        }
        field2277 = null;
        field2281 = null;
        field2283 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IJ)Loh;")
    public static final class263 method794(int arg0, long arg1) {
        ++field2289;
        class259.field4493.setTime(new Date(arg1));
        int var3 = class259.field4493.get(7);
        int var4 = class259.field4493.get(5);
        int var5 = class259.field4493.get(2);
        int var6 = class259.field4493.get(1);
        if (arg0 > -116) {
            method796(-128, 89);
        }
        int var7 = class259.field4493.get(11);
        int var8 = class259.field4493.get(12);
        int var9 = class259.field4493.get(13);
        return method797(-94, new class263[] { class101.field1937[var3 - 1], class6.field117, class136.method891(-120, var4 / 10), class136.method891(-57, var4 % 10), class52.field1114, class106.field2008[var5], class52.field1114, class136.method891(-92, var6), class5.field88, class136.method891(-57, var7 / 10), class136.method891(-101, var7 % 10), class72.field1481, class136.method891(-114, var8 / 10), class136.method891(-103, var8 % 10), class72.field1481, class136.method891(-55, var9 / 10), class136.method891(-125, var9 % 10), class239.field4180 });
    }

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "(I)V")
    public static final void method795(int arg0) {
        class261.method1719(0, false);
        class117.field2183 = 0;
        ++field2290;
        boolean var1 = true;
        for (int var2 = 0; ~class78.field1587.length < ~var2; ++var2) {
            if (~class51.field1104[var2] != 0 && class78.field1587[var2] == null) {
                class78.field1587[var2] = class190.field3413.method596(41, class51.field1104[var2], 0);
                if (class78.field1587[var2] == null) {
                    ++class117.field2183;
                    var1 = false;
                }
            }
            if (class205.field3733[var2] != -1 && class233.field4077[var2] == null) {
                class233.field4077[var2] = class190.field3413.method588(class248.field4333[var2], -1, 0, class205.field3733[var2]);
                if (class233.field4077[var2] == null) {
                    ++class117.field2183;
                    var1 = false;
                }
            }
            if (class146.field2679 != null && class195.field3543[var2] == null && class146.field2679[var2] != -1) {
                class195.field3543[var2] = class190.field3413.method588(class248.field4333[var2], -1, 0, class146.field2679[var2]);
                if (class195.field3543[var2] == null) {
                    var1 = false;
                    ++class117.field2183;
                }
            }
        }
        if (class27.field714 == null) {
            if (class19.field426 != null && class196.field3547.method572(method797(-44, new class263[] { class19.field426.field3321, class162.field2955 }), 15913)) {
                if (class196.field3547.method594(true, method797(-115, new class263[] { class19.field426.field3321, class162.field2955 }))) {
                    class27.field714 = class136.method888(method797(-49, new class263[] { class19.field426.field3321, class162.field2955 }), class196.field3547, true);
                } else {
                    ++class117.field2183;
                    var1 = false;
                }
            } else {
                class27.field714 = new class14(0);
            }
        }
        if (!var1) {
            class50.field1065 = 1;
        } else {
            boolean var3 = true;
            class122.field2270 = 0;
            for (int var4 = 0; var4 < class78.field1587.length; ++var4) {
                byte[] var20 = class233.field4077[var4];
                if (var20 != null) {
                    int var21 = (class128.field2370[var4] & 255) * 64 + -class142.field2596;
                    int var22 = (class128.field2370[var4] >> 8) * 64 + -class93.field1844;
                    if (class265.field4635) {
                        var21 = 10;
                        var22 = 10;
                    }
                    var3 &= class118.method766(var20, var22, var21, 256);
                }
            }
            if (!var3) {
                class50.field1065 = 2;
            } else if (arg0 <= -96) {
                if (class50.field1065 != 0) {
                    class93.method656(-19472, method797(-121, new class263[] { class127.field2359, class137.field2533 }), true);
                }
                class61.method371((byte) 77);
                class94.method659(104);
                boolean var5 = false;
                class116.method759(4, 104, 104, 25, var5);
                for (int var6 = 0; ~var6 > -5; ++var6) {
                    class103.field1954[var6].method490(-82);
                }
                for (int var7 = 0; var7 < 4; ++var7) {
                    for (int var18 = 0; ~var18 > -105; ++var18) {
                        for (int var19 = 0; ~var19 > -105; ++var19) {
                            class77.field1576[var7][var18][var19] = 0;
                        }
                    }
                }
                class220.method1500(false, 107);
                class61.method371((byte) 77);
                System.gc();
                class261.method1719(0, true);
                class94.method658(false, true);
                if (!class265.field4635) {
                    class1.method2(false, 6);
                    class261.method1719(0, true);
                    class139.method906(1, false);
                    if (class195.field3543 != null) {
                        class23.method175((byte) 120);
                    }
                }
                if (class265.field4635) {
                    class20.method141(false, false);
                    class261.method1719(0, true);
                    class39.method245(false, 19617);
                }
                class94.method659(104);
                class261.method1719(0, true);
                class256.method1698(128, class103.field1954, false);
                class261.method1719(0, true);
                int var8 = class51.field1100;
                if (var8 > class12.field321) {
                    var8 = class12.field321;
                }
                if (~var8 > ~(class12.field321 + -1)) {
                    int var9 = class12.field321 + -1;
                }
                if (!class77.method526(-26670)) {
                    class265.method1793(class51.field1100);
                } else {
                    class265.method1793(0);
                }
                class128.method832(2);
                for (int var10 = 0; var10 < 104; ++var10) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        class184.method1217(1610612736, var10, var17);
                    }
                }
                class188.method1233(true);
                class61.method371((byte) 77);
                class217.method1474(true);
                class94.method659(104);
                if (class130.field2381 != null && class166.field3023 != null && ~class271.field4786 == -26) {
                    ++class238.field4163;
                    class154.field2792.method1516(-43, 193);
                    class154.field2792.method1286(-11740, 1057001181);
                }
                if (!class265.field4635) {
                    int var11 = (class3.field68 + -6) / 8;
                    int var12 = (class3.field68 + 6) / 8;
                    int var13 = (class145.field2654 - 6) / 8;
                    int var14 = (class145.field2654 - -6) / 8;
                    for (int var15 = var11 + -1; ~var15 >= ~(var12 + 1); ++var15) {
                        for (int var16 = var13 + -1; var14 + 1 >= var16; ++var16) {
                            if (var15 < var11 || ~var15 < ~var12 || ~var13 < ~var16 || var16 > var14) {
                                class190.field3413.method571((byte) 99, method797(-106, new class263[] { class229.field4021, class136.method891(-94, var15), class188.field3388, class136.method891(-116, var16) }));
                                class190.field3413.method571((byte) 56, method797(-52, new class263[] { class89.field1773, class136.method891(-94, var15), class188.field3388, class136.method891(-56, var16) }));
                            }
                        }
                    }
                }
                if (class271.field4786 != 28) {
                    class244.method1659(30, 26473);
                    if (class166.field3023 != null) {
                        class154.field2792.method1516(-79, 206);
                    }
                } else {
                    class244.method1659(10, 26473);
                }
                class169.method1120(-1);
                class61.method371((byte) 77);
                class251.method1675((byte) 115);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        ++field2287;
        if (arg1 != 5) {
            this.field2279 = -66;
        }
        int[][] var3 = super.field4509.method1667(arg0, 0);
        if (super.field4509.field4346) {
            int[] var4 = this.method1711(arg0 + -1 & class277.field4846, 0, false);
            int[] var5 = this.method1711(arg0, 0, false);
            int[] var6 = this.method1711(class277.field4846 & arg0 + 1, 0, false);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class49.field1052; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2279;
                int var12 = (var5[var10 + 1 & class166.field3024] + -var5[class166.field3024 & var10 + -1]) * this.field2279;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var11 / var17;
                    var20 = 16777216 / var17;
                    var19 = var12 / var17;
                }
                if (this.field2288) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class124() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(II)V")
    public static final void method796(int arg0, int arg1) {
        ++field2284;
        if (arg0 == 26052) {
            if (arg1 != 0) {
                if (arg1 == 1) {
                    class185.method1224((byte) -52);
                } else if (~arg1 != -3) {
                    throw new RuntimeException();
                } else {
                    class63.method384((byte) 79);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[Loh;)Loh;")
    public static final class263 method797(int arg0, class263[] arg1) {
        ++field2282;
        if (arg0 >= -40) {
            field2277 = null;
        }
        if (~arg1.length > -3) {
            throw new IllegalArgumentException();
        } else {
            return class106.method710(arg1, arg1.length, 0, 28777);
        }
    }
}
