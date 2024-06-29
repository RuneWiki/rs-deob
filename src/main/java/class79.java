import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class79 extends class212 {

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "Lsc;")
    public static class181 field1280 = class149.method967(255, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
    public static int field1279 = 0;

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "Lsc;")
    private static class181 field1286 = class149.method967(255, "http:)4)4advert)3runescape)3com)4banner)3ws?size=729");

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "Lsc;")
    public static class181 field1277 = field1286;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "Lsc;")
    public static class181 field1284 = class149.method967(255, "cookiehost");

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!vd", name = "fb", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        ++field1287;
        if (arg1 < 25) {
            field1285 = 4;
        }
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            int[] var4 = this.method1405(arg0, 0, 7);
            int[] var5 = this.method1405(arg0, 1, 110);
            int[] var6 = this.method1405(arg0, 2, 29);
            for (int var7 = 0; class26.field452 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 != -1) {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        ++field1276;
        int[][] var3 = super.field3645.method1352(arg0, -118);
        if (super.field3645.field3477) {
            int[] var4 = this.method1405(arg0, 2, 119);
            int[][] var5 = this.method1410(arg0, 0, (byte) -33);
            int[][] var6 = this.method1410(arg0, 1, (byte) -99);
            int[] var7 = var3[1];
            int[] var8 = var5[0];
            int[] var9 = var5[1];
            int[] var10 = var3[0];
            int[] var11 = var3[2];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[2];
            int[] var15 = var6[0];
            for (int var16 = 0; ~class26.field452 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var10[var16] = var8[var16];
                    var7[var16] = var9[var16];
                    var11[var16] = var12[var16];
                } else if (~var17 == -1) {
                    var10[var16] = var15[var16];
                    var7[var16] = var13[var16];
                    var11[var16] = var14[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var10[var16] = var8[var16] * var17 - -(var15[var16] * var18) >> 12;
                    var7[var16] = var9[var16] * var17 + var13[var16] * var18 >> 12;
                    var11[var16] = var12[var16] * var17 - -(var14[var16] * var18) >> 12;
                }
            }
        }
        if (arg1 != 16383) {
            method555((class230) null, -93);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class79() {
        super(3, false);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            super.field3651 = ~arg0.method1516((byte) 82) == -2;
        }
        ++field1281;
        if (arg2 != -3) {
            field1277 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)V")
    public static void method553(byte arg0) {
        field1286 = null;
        field1284 = null;
        field1280 = null;
        if (arg0 < -126) {
            field1277 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(IB)V")
    public static final void method554(int arg0, byte arg1) {
        ++field1282;
        class13.field262 += arg0 * 128;
        if (class13.field262 > class239.field4151.length) {
            int var2 = (int) (12.0D * Math.random());
            class13.field262 -= class239.field4151.length;
            class132.method854(arg1 ^ 55, class241.field4193[var2]);
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = (var3 - arg0) * 128;
        int var6 = arg0 * 128;
        for (int var7 = 0; var5 > var7; ++var7) {
            int var26 = class128.field2121[var4 + var6] - class239.field4151[class239.field4151.length - 1 & class13.field262 + var4] * arg0 / 6;
            if (~var26 > -1) {
                var26 = 0;
            }
            class128.field2121[var4++] = var26;
        }
        int var8 = -arg0 + var3;
        if (arg1 != 125) {
            method554(82, (byte) 81);
        }
        while (var8 < var3) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; ++var24) {
                int var25 = (int) (Math.random() * 100.0D);
                if (~var25 > -51 && ~var24 < -11 && ~var24 > -119) {
                    class128.field2121[var24 - -var23] = 255;
                } else {
                    class128.field2121[var23 + var24] = 0;
                }
            }
            ++var8;
        }
        for (int var9 = 0; ~var9 > ~(var3 - arg0); ++var9) {
            class108.field1767[var9] = class108.field1767[arg0 + var9];
        }
        for (int var10 = -arg0 + var3; var3 > var10; ++var10) {
            class108.field1767[var10] = (int) (16.0D * Math.sin((double) class9.field166 / 14.0D) + Math.sin((double) class9.field166 / 15.0D) * 14.0D + Math.sin((double) class9.field166 / 16.0D) * 12.0D);
            ++class9.field166;
        }
        class178.field3120 += arg0;
        int var11 = ((class237.field4125 & 1) + arg0) / 2;
        if (~var11 < -1) {
            for (int var12 = 0; var12 < class178.field3120; ++var12) {
                int var21 = (int) (124.0D * Math.random()) + 2;
                int var22 = 128 + (int) (Math.random() * 128.0D);
                class128.field2121[(var22 << 7) + var21] = 192;
            }
            class178.field3120 = 0;
            for (int var13 = 0; var13 < var3; ++var13) {
                int var18 = var13 * 128;
                int var19 = 0;
                for (int var20 = -var11; ~var20 > -129; ++var20) {
                    if (var20 - -var11 < 128) {
                        var19 += class128.field2121[var20 - -var18 + var11];
                    }
                    if (~(var20 + -1 + -var11) <= -1) {
                        var19 -= class128.field2121[var20 - (-var18 - -1 - -var11)];
                    }
                    if (~var20 <= -1) {
                        class127.field2103[var18 + var20] = var19 / (var11 * 2 + 1);
                    }
                }
            }
            for (int var14 = 0; var14 < 128; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; var16 < var3; ++var16) {
                    int var17 = var16 * 128;
                    if (var3 > var11 + var16) {
                        var15 += class127.field2103[var11 * 128 + (var14 - -var17)];
                    }
                    if (var16 - (var11 + 1) >= 0) {
                        var15 -= class127.field2103[var14 - (-var17 + 128) - var11 * 128];
                    }
                    if (~var16 <= -1) {
                        class128.field2121[var14 + var17] = var15 / (var11 * 2 + 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lvf;I)V")
    public static final void method555(class230 arg0, int arg1) {
        ++field1283;
        while (true) {
            while (~arg0.field3933 > ~arg0.field3977.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (~arg0.method1516((byte) 82) == -2) {
                    var4 = arg0.method1516((byte) 82);
                    var2 = true;
                    var3 = arg0.method1516((byte) 82);
                }
                int var5 = arg0.method1516((byte) 82);
                int var6 = arg0.method1516((byte) 82);
                int var7 = var5 * 64 - class265.field4625;
                int var8 = -(var6 * 64) - (-class164.field2786 - (class222.field3840 + -1));
                if (var7 >= 0 && ~(var8 + -63) <= -1 && class62.field967 > var7 + 63 && var8 < class222.field3840) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; ++var11) {
                        for (int var12 = 0; var12 < 64; ++var12) {
                            if (!var2 || var11 >= var4 * 8 && ~(var4 * 8 + 8) < ~var11 && ~(var3 * 8) >= ~var12 && var12 < var3 * 8 + 8) {
                                byte var13 = arg0.method1563(-255688184);
                                if (~var13 != -1) {
                                    if (class83.field1327[var9][var10] == null) {
                                        class83.field1327[var9][var10] = new byte[4096];
                                    }
                                    class83.field1327[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1563(-255688184);
                                    if (class126.field2095[var9][var10] == null) {
                                        class126.field2095[var9][var10] = new byte[4096];
                                    }
                                    class126.field2095[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; ~var15 > ~(var2 ? 64 : 4096); ++var15) {
                        byte var16 = arg0.method1563(-255688184);
                        if (~var16 != -1) {
                            ++arg0.field3933;
                        }
                    }
                }
            }
            if (arg1 != -1) {
                field1279 = -52;
                return;
            }
            return;
        }
    }
}
