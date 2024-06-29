import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class314 extends class194 {

    @OriginalMember(owner = "client!jr", name = "Z", descriptor = "I")
    private int field4236 = -1;

    @OriginalMember(owner = "client!jr", name = "Y", descriptor = "I")
    public static int field4235 = 0;

    @OriginalMember(owner = "client!jr", name = "I", descriptor = "Z")
    public static boolean field4219 = false;

    @OriginalMember(owner = "client!jr", name = "U", descriptor = "I")
    public static int field4231 = 16777215;

    @OriginalMember(owner = "client!jr", name = "T", descriptor = "[Z")
    public static boolean[] field4230 = new boolean[200];

    @OriginalMember(owner = "client!jr", name = "V", descriptor = "Lbb;")
    public static class270 field4232 = new class270();

    @OriginalMember(owner = "client!jr", name = "bb", descriptor = "I")
    public static int field4238 = 0;

    @OriginalMember(owner = "client!jr", name = "J", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!jr", name = "K", descriptor = "I")
    private int field4221;

    @OriginalMember(owner = "client!jr", name = "L", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!jr", name = "N", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!jr", name = "P", descriptor = "I")
    private int field4226;

    @OriginalMember(owner = "client!jr", name = "Q", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!jr", name = "R", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!jr", name = "S", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!jr", name = "X", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!jr", name = "ab", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!jr", name = "W", descriptor = "[I")
    private int[] field4233;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "(I)V")
    public static void method1977(int arg0) {
        field4230 = null;
        if (arg0 >= 73) {
            field4232 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)[[I")
    public final int[][] method59(int arg0, int arg1) {
        ++field4222;
        if (arg0 != -730) {
            this.method1199(-75);
        }
        int[][] var3 = super.field2283.method1667(arg1, -92);
        if (super.field2283.field3451) {
            int var4 = (~class250.field3286 != ~this.field4221 ? this.field4221 * arg1 / class250.field3286 : arg1) * this.field4226;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class138.field1579 == ~this.field4226) {
                for (int var8 = 0; class138.field1579 > var8; ++var8) {
                    int var9 = this.field4233[var4++];
                    var7[var8] = class191.method1183(var9, 255) << 4;
                    var6[var8] = class191.method1183(65280, var9) >> 4;
                    var5[var8] = class191.method1183(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; class138.field1579 > var10; ++var10) {
                    int var11 = this.field4226 * var10 / class138.field1579;
                    int var12 = this.field4233[var4 - -var11];
                    var7[var10] = class191.method1183(255, var12) << 4;
                    var6[var10] = class191.method1183(4080, var12 >> 4);
                    var5[var10] = class191.method1183(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZIIIZBII)V")
    public static final void method1978(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6, int arg7) {
        ++field4225;
        if (arg4 || ~class234.field3069 != ~arg3 || class108.field1296 != arg7 || class41.field488 != arg2 && !class98.method602(65280)) {
            class41.field488 = arg2;
            class234.field3069 = arg3;
            class108.field1296 = arg7;
            if (class98.method602(65280)) {
                class41.field488 = 0;
            }
            if (!arg0) {
                class259.method1637(25, (byte) 79);
            } else {
                class259.method1637(28, (byte) 79);
            }
            class190.method1179(0, class72.field894.method434(class373.field5057, -8192), true, class55.field636);
            int var8 = class278.field3608;
            class278.field3608 = (class234.field3069 - (class22.field232 >> 4)) * 8;
            int var9 = class129.field1432;
            class129.field1432 = (-(class196.field2329 >> 4) + class108.field1296) * 8;
            if (arg5 <= -113) {
                class112.field1312 = class224.method1373(class234.field3069 * 8, class108.field1296 * 8);
                class234.field3075 = null;
                int var10 = -var8 + class278.field3608;
                int var11 = -var9 + class129.field1432;
                if (arg0) {
                    class106.field1263 = 0;
                    int var12 = class22.field232 * 128 - 128;
                    int var13 = class196.field2329 * 128 + -128;
                    for (int var14 = 0; ~var14 > -32769; ++var14) {
                        class298 var15 = class220.field2726[var14];
                        if (var15 != null) {
                            var15.field1516 -= var10 * 128;
                            var15.field1514 -= var11 * 128;
                            if (~var15.field1516 <= -1 && var15.field1516 <= var12 && var15.field1514 >= 0 && var15.field1514 <= var13) {
                                boolean var16 = true;
                                for (int var17 = 0; ~var17 > -11; ++var17) {
                                    var15.field2480[var17] -= var10;
                                    var15.field2482[var17] -= var11;
                                    if (var15.field2480[var17] < 0 || var15.field2480[var17] >= class22.field232 || ~var15.field2482[var17] > -1 || var15.field2482[var17] >= class196.field2329) {
                                        var16 = false;
                                    }
                                }
                                if (!var16) {
                                    class220.field2726[var14].method1888((class307) null, 8);
                                    class220.field2726[var14] = null;
                                } else {
                                    class437.field5984[class106.field1263++] = var14;
                                }
                            } else {
                                class220.field2726[var14].method1888((class307) null, 8);
                                class220.field2726[var14] = null;
                            }
                        }
                    }
                } else {
                    for (int var18 = 0; ~var18 > -32769; ++var18) {
                        class298 var23 = class220.field2726[var18];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < 10; ++var24) {
                                var23.field2480[var24] -= var10;
                                var23.field2482[var24] -= var11;
                            }
                            var23.field1514 -= var11 * 128;
                            var23.field1516 -= var10 * 128;
                        }
                    }
                }
                for (int var19 = 0; ~var19 > -2049; ++var19) {
                    class131 var21 = class212.field2584[var19];
                    if (var21 != null) {
                        for (int var22 = 0; ~var22 > -11; ++var22) {
                            var21.field2480[var22] -= var10;
                            var21.field2482[var22] -= var11;
                        }
                        var21.field1516 -= var10 * 128;
                        var21.field1514 -= var11 * 128;
                    }
                }
                class43.field513 = arg2;
                class143.field1684.method842(false, arg6, (byte) 121, class43.field513, arg1);
                class226.method1392(var10, 2015383932, var11);
                for (class186 var20 = (class186) class432.field5895.method1690((byte) -118); var20 != null; var20 = (class186) class432.field5895.method1699((byte) 107)) {
                    var20.field2150 -= var10;
                    var20.field2157 -= var11;
                    if (~var20.field2150 > -1 || ~var20.field2157 > -1 || var20.field2150 >= class22.field232 || ~var20.field2157 <= ~class196.field2329) {
                        var20.method263(false);
                    }
                }
                class420.field5754 = 0;
                if (~class90.field1043 != -1) {
                    class249.field3276 -= var11;
                    class90.field1043 -= var10;
                }
                if (!arg0) {
                    if (~class320.field4294 != -5) {
                        class320.field4294 = 1;
                    } else {
                        class277.field3583 -= var10 * 128;
                        class347.field4725 -= var11 * 128;
                        class225.field2856 -= var10 * 128;
                        class374.field5069 -= var11 * 128;
                    }
                } else {
                    class277.field3586 -= var10;
                    class152.field1776 -= var11;
                    class66.field797 -= var11;
                    class287.field3784 -= var10 * 128;
                    class80.field979 -= var11 * 128;
                    class387.field5289 -= var10;
                    if (~Math.abs(var10) < ~class22.field232 || ~Math.abs(var11) < ~class196.field2329) {
                        class370.method2328((byte) 44);
                    }
                }
                class278.method1744(-29715);
                class281.method1773((byte) -122);
                class201.field2368.method1701(true);
                class180.field2094.method1701(true);
                class80.field974.method1843(64);
                class108.method647((byte) -104);
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILaq;)V")
    public static final void method1979(int arg0, class453 arg1) {
        ++field4220;
        if (class104.field1224) {
            ++class138.field1568;
            class427.field5837.method2162(false, 138);
            if (arg0 != -31891) {
                field4237 = -20;
            }
            class427.field5837.method1560(arg0 ^ 6753, arg1.field6475);
            class427.field5837.method1546(arg1.field6358, -1990920344);
            class427.field5837.method1560(arg0 ^ 6753, class357.field4844);
            class427.field5837.method1546(arg1.field6364, -1990920344);
            class427.field5837.method1592(class416.field5698, (byte) -52);
            class427.field5837.method1592(class62.field759, (byte) 87);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        ++field4223;
        int var4 = -38 / ((52 - arg1) / 61);
        if (~arg0 == -1) {
            this.field4236 = arg2.method1587((byte) -102);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BD)V")
    public static final void method1980(byte arg0, double arg1) {
        if (arg0 == 22) {
            if (class131.field1486 != arg1) {
                for (int var3 = 0; var3 < 256; ++var3) {
                    int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg1));
                    class104.field1220[var3] = ~var4 >= -256 ? var4 : 255;
                }
                class131.field1486 = arg1;
            }
            ++field4224;
        }
    }

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V")
    public final void method1206(int arg0) {
        super.method1206(arg0);
        ++field4234;
        this.field4233 = null;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(III)V")
    public final void method1202(int arg0, int arg1, int arg2) {
        super.method1202(arg0, arg1, arg2);
        ++field4229;
        if (~this.field4236 <= -1 && class267.field3446 != null) {
            int var4 = class267.field3446.method960(this.field4236, (byte) -40).field4856 ? 64 : 128;
            this.field4233 = class267.field3446.method965(-18, var4, this.field4236, 1.0F, var4, false);
            this.field4226 = var4;
            this.field4221 = var4;
        }
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)I")
    public final int method1199(int arg0) {
        ++field4227;
        return arg0 != -1 ? -13 : this.field4236;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
    public class314() {
        super(0, false);
    }
}
