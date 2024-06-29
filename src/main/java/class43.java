import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class43 extends class23 {

    @OriginalMember(owner = "client!di", name = "T", descriptor = "I")
    private int field725 = 4096;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    public static int field723 = -1;

    @OriginalMember(owner = "client!di", name = "cb", descriptor = "Li;")
    public static class88 field734 = class208.method1425(105, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!di", name = "Z", descriptor = "Li;")
    public static class88 field731 = class208.method1425(105, ":trade:");

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "Lbe;")
    public static class17 field732 = new class17();

    @OriginalMember(owner = "client!di", name = "hb", descriptor = "Z")
    public static boolean field739 = false;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!di", name = "U", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!di", name = "V", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!di", name = "W", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!di", name = "X", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!di", name = "db", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!di", name = "fb", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!di", name = "gb", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!di", name = "bb", descriptor = "Lnb;")
    public static class144 field733;

    @OriginalMember(owner = "client!di", name = "eb", descriptor = "[Llj;")
    public static class130[] field736;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        if (arg1 < 19) {
            field734 = null;
        }
        ++field735;
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            int[] var4 = this.method120(class220.field4160 & arg0 + -1, false, 0);
            int[] var5 = this.method120(arg0, false, 0);
            int[] var6 = this.method120(arg0 + 1 & class220.field4160, false, 0);
            for (int var7 = 0; class70.field1276 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field725;
                int var9 = (var5[var7 + 1 & class45.field789] - var5[class45.field789 & var7 + -1]) * this.field725;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + 4096 - -var13) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.field725 = arg0.method301(46);
        }
        if (arg1 == -3) {
            ++field726;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)V")
    public static final void method277(byte arg0, int arg1) {
        if (~arg1 == -38) {
            class150.field2917 = 3.0D;
        } else if (~arg1 == -51) {
            class150.field2917 = 4.0D;
        } else if (~arg1 != -76) {
            class150.field2917 = 8.0D;
        } else {
            class150.field2917 = 6.0D;
        }
        ++field730;
        if (arg0 != 53) {
            field731 = null;
        }
        class34.field594 = -1;
        class34.field594 = -1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZB)V")
    public static final void method278(boolean arg0, byte arg1) {
        class137.field2557 = arg0;
        int var2 = 100 % ((arg1 - -62) / 49);
        ++field737;
        if (!class137.field2557) {
            int var3 = (-class230.field4314.field831 + class228.field4272) / 16;
            class17.field268 = new int[var3][4];
            for (int var4 = 0; ~var3 < ~var4; ++var4) {
                for (int var15 = 0; var15 < 4; ++var15) {
                    class17.field268[var4][var15] = class230.field4314.method299(48);
                }
            }
            int var5 = class230.field4314.method349(true);
            boolean var6 = false;
            int var7 = class230.field4314.method302(255);
            int var8 = class230.field4314.method301(93);
            int var9 = class230.field4314.method352(24758);
            int var10 = class230.field4314.method301(42);
            class128.field2404 = new int[var3];
            class146.field2733 = new int[var3];
            class45.field774 = new byte[var3][];
            class27.field453 = new int[var3];
            class167.field3223 = new byte[var3][];
            int var11 = 0;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && ~(var5 / 8) == -49) {
                var6 = true;
            }
            if (~(var8 / 8) == -49 && var5 / 8 == 148) {
                var6 = true;
            }
            for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; ++var12) {
                for (int var13 = (var5 - 6) / 8; ~((var5 + 6) / 8) <= ~var13; ++var13) {
                    int var14 = (var12 << 8) + var13;
                    if (!var6 || ~var13 != -50 && ~var13 != -150 && var13 != 147 && ~var12 != -51 && (~var12 != -50 || var13 != 47)) {
                        class146.field2733[var11] = var14;
                        class27.field453[var11] = class27.field451.method966(class166.method1142(new class88[] { class212.field4020, class170.method1214(var12, -113), class50.field933, class170.method1214(var13, -128) }, -3), (byte) -3);
                        class128.field2404[var11] = class27.field451.method966(class166.method1142(new class88[] { class106.field1930, class170.method1214(var12, 94), class50.field933, class170.method1214(var13, -125) }, -3), (byte) -3);
                    } else {
                        class146.field2733[var11] = var14;
                        class27.field453[var11] = -1;
                        class128.field2404[var11] = -1;
                    }
                    ++var11;
                }
            }
            class120.method822(var9, var10, var8, var5, (byte) 120, var7);
        } else {
            int var16 = class230.field4314.method347(26119);
            int var17 = class230.field4314.method343(62);
            int var18 = class230.field4314.method302(255);
            class230.field4314.method34(8);
            for (int var19 = 0; var19 < 4; ++var19) {
                for (int var36 = 0; ~var36 > -14; ++var36) {
                    for (int var37 = 0; var37 < 13; ++var37) {
                        int var38 = class230.field4314.method28(1, -315);
                        if (~var38 == -2) {
                            class111.field2026[var19][var36][var37] = class230.field4314.method28(26, -315);
                        } else {
                            class111.field2026[var19][var36][var37] = -1;
                        }
                    }
                }
            }
            class230.field4314.method35(8);
            int var20 = (-class230.field4314.field831 + class228.field4272) / 16;
            class17.field268 = new int[var20][4];
            for (int var21 = 0; ~var20 < ~var21; ++var21) {
                for (int var35 = 0; var35 < 4; ++var35) {
                    class17.field268[var21][var35] = class230.field4314.method323((byte) -58);
                }
            }
            int var22 = class230.field4314.method343(66);
            int var23 = class230.field4314.method301(122);
            class27.field453 = new int[var20];
            class128.field2404 = new int[var20];
            class167.field3223 = new byte[var20][];
            class146.field2733 = new int[var20];
            class45.field774 = new byte[var20][];
            int var24 = 0;
            for (int var25 = 0; ~var25 > -5; ++var25) {
                for (int var26 = 0; ~var26 > -14; ++var26) {
                    for (int var27 = 0; ~var27 > -14; ++var27) {
                        int var28 = class111.field2026[var25][var26][var27];
                        if (~var28 != 0) {
                            int var29 = var28 >> 3 & 2047;
                            int var30 = 1023 & var28 >> 14;
                            int var31 = (var30 / 8 << 8) + var29 / 8;
                            for (int var32 = 0; ~var32 > ~var24; ++var32) {
                                if (~class146.field2733[var32] == ~var31) {
                                    var31 = -1;
                                    break;
                                }
                            }
                            if (var31 != -1) {
                                class146.field2733[var24] = var31;
                                int var33 = (var31 & 65478) >> 8;
                                int var34 = 255 & var31;
                                class27.field453[var24] = class27.field451.method966(class166.method1142(new class88[] { class212.field4020, class170.method1214(var33, 47), class50.field933, class170.method1214(var34, 34) }, -3), (byte) -3);
                                class128.field2404[var24] = class27.field451.method966(class166.method1142(new class88[] { class106.field1930, class170.method1214(var33, 47), class50.field933, class170.method1214(var34, -85) }, -3), (byte) -3);
                                ++var24;
                            }
                        }
                    }
                }
            }
            class120.method822(var16, var18, var17, var23, (byte) 116, var22);
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(B)Z")
    public static final boolean method279(byte arg0) {
        ++field729;
        class53 var1 = class166.field3190;
        synchronized (class166.field3190) {
            if (arg0 != 31) {
                method278(true, (byte) -120);
            }
            if (~class48.field898 == ~class203.field3860) {
                return false;
            } else {
                class137.field2558 = class174.field3440[class203.field3860];
                class219.field4150 = class105.field1910[class203.field3860];
                class203.field3860 = class203.field3860 + 1 & 127;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)V")
    public static void method280(int arg0) {
        field736 = null;
        field734 = null;
        field731 = null;
        field733 = null;
        if (arg0 != -19580) {
            field732 = null;
        }
        field732 = null;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
    public class43() {
        super(1, true);
    }
}
