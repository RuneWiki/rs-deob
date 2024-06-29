import java.util.Hashtable;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class186 extends class377 {

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    private int field2192 = 5;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    private int field2196 = 5;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "[S")
    private short[] field2197 = new short[512];

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    private int field2203 = 2048;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    private int field2201 = 2;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
    private int field2194 = 1;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
    private int field2202 = 0;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "[B")
    private byte[] field2199 = new byte[512];

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field2198 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field2190 = new Hashtable();

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "Lal;")
    public static class90 field2195;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "[J")
    public static long[] field2191;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field2196 = arg2.method3097((byte) 12);
                                }
                            } else {
                                this.field2192 = arg2.method3097((byte) 12);
                            }
                        } else {
                            this.field2194 = arg2.method3097((byte) 12);
                        }
                    } else {
                        this.field2201 = arg2.method3097((byte) 12);
                    }
                } else {
                    this.field2203 = arg2.method3031(-1);
                }
            } else {
                this.field2202 = arg2.method3097((byte) 12);
            }
        } else {
            this.field2192 = this.field2196 = arg2.method3097((byte) 12);
        }
        ++field2200;
        int var5 = 31 % ((13 - arg1) / 55);
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V")
    public final void method91(byte arg0) {
        this.field2199 = class492.method2668(this.field2202, 84);
        ++field2205;
        if (arg0 < 52) {
            this.method88(118, 82);
        }
        this.method1107(false);
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class186() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILoa;B)V")
    public static final void method1105(int arg0, int arg1, class650 arg2, byte arg3) {
        ++field2206;
        if (arg1 >= 0 && ~arg0 <= -1 && class704.field9857 != 0 && ~class660.field8966 != -1) {
            arg2.method450(class522.field6611, class270.field3419, class704.field9857, class660.field8966);
            arg2.method403(class502.field6256, class576.field7412, class704.field9857, class660.field8966);
            class396 var4 = arg2.method431();
            var4.method581(class380.field4876, class130.field1572, class95.field1240, class504.field6285, class142.field1728, class189.field2244);
            arg2.method490(var4);
            if (class252.field3250 != null) {
                int var5 = -1;
                int var6 = -1;
                int var7 = arg2.method423();
                int var8 = (-class522.field6611 + arg1) * var7 / class704.field9857;
                int var9 = (-class270.field3419 + arg0) * var7 / class660.field8966;
                int var10 = arg2.method461();
                int var11 = (-class522.field6611 + arg1) * var10 / class704.field9857;
                int var12 = (arg0 - class270.field3419) * var10 / class660.field8966;
                int[] var13 = new int[] { var8, var9, var7 };
                var4.method578(var13);
                int[] var14 = new int[] { var11, var12, var10 };
                var4.method578(var14);
                float var15 = 0.0F;
                int var16 = var14[0] - var13[0];
                int var17 = var14[1] - var13[1];
                int var18 = var14[2] + -var13[2];
                while (var15 < 1.0F) {
                    int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                    int var20 = var19 >> 9;
                    int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                    int var22 = var21 >> 9;
                    if (var20 > 0 && ~var22 < -1 && var20 < class85.field1090 && ~var22 > ~class656.field8932) {
                        int var23 = class67.field815.field8010;
                        if (var23 < 3 && ~(class234.field3033[1][var20][var22] & 2) != -1) {
                            ++var23;
                        }
                        if ((float) class252.field3250[var23].method194(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                            var5 = var19 - -(-1 + class67.field815.method210(false) << 8) >> 9;
                            var6 = (-1 + class67.field815.method210(false) << 8) + var21 >> 9;
                            break;
                        }
                    }
                    var15 = (float) ((double) var15 + 0.01D);
                }
                if (~var5 != 0 && var6 != -1) {
                    if (class37.field542 && ~(64 & class458.field5709) != -1) {
                        class337 var24 = class680.method3758(true, class168.field1978, class112.field1383);
                        if (var24 != null) {
                            class688.method3802(false, true, -1, 45, 0, class467.field5794, 0L, " ->", var6, class7.field74, var5);
                        } else {
                            class167.method1012(99);
                        }
                    } else {
                        if (class341.field4353 == class237.field3061) {
                            class688.method3802(false, true, -1, 8, 0, class671.field9141.method3726((byte) 55, class71.field912), 0L, "", var6, -1, var5);
                        }
                        class688.method3802(false, true, -1, 9, 0, class691.field9587, 0L, "", var6, class151.field1802, var5);
                        ++class549.field6879;
                    }
                }
            }
            int var25 = -34 % ((arg3 - -30) / 36);
            class285 var26 = class14.field136;
            for (class686 var27 = (class686) var26.method1715((byte) 121); var27 != null; var27 = (class686) var26.method1712((byte) -8)) {
                if ((class47.field634 || class67.field815.field8010 == var27.field9367) && var27.method3783(arg0, arg1, arg2, 0)) {
                    if (var27.field9364 instanceof class365) {
                        class365 var28 = (class365) var27.field9364;
                        int var29 = var28.method210(false);
                        if ((1 & var29) == 0 && ~(511 & var28.field8018) == -1 && ~(var28.field8011 & 511) == -1 || ~(1 & var29) == -2 && (var28.field8018 & 511) == 256 && (511 & var28.field8011) == 256) {
                            int var30 = var28.field8018 + -(-1 + var28.method210(false) << 8);
                            int var31 = var28.field8011 + -(-1 + var28.method210(false) << 8);
                            for (int var32 = 0; ~var32 > ~class99.field1276; ++var32) {
                                class704 var39 = (class704) class168.field1973.method3828((long) class352.field4562[var32], (byte) -91);
                                if (var39 != null) {
                                    class506 var40 = var39.field9854;
                                    if (class665.field9027 != var40.field422 && var40.field446) {
                                        int var41 = -(var40.field6326.field9495 + -1 << 8) + var40.field8018;
                                        int var42 = var40.field8011 - (var40.field6326.field9495 + -1 << 8);
                                        if (var41 >= var30 && ~var40.field6326.field9495 >= ~(-(-var30 + var41 >> 9) + var28.method210(false)) && var31 <= var42 && var40.field6326.field9495 <= var28.method210(false) - (-var31 + var42 >> 9)) {
                                            class612.method3428(var40, 25555, ~class67.field815.field8010 != ~var27.field9367);
                                            var40.field422 = class665.field9027;
                                        }
                                    }
                                }
                            }
                            int var33 = class149.field1788;
                            int[] var34 = class95.field1239;
                            for (int var35 = 0; var33 > var35; ++var35) {
                                class365 var36 = class132.field1601[var34[var35]];
                                if (var36 != null && class665.field9027 != var36.field422 && var28 != var36 && var36.field446) {
                                    int var37 = var36.field8018 - (var36.method210(false) + -1 << 8);
                                    int var38 = var36.field8011 + -(var36.method210(false) + -1 << 8);
                                    if (~var30 >= ~var37 && ~var36.method210(false) >= ~(-(var37 - var30 >> 9) + var28.method210(false)) && ~var38 <= ~var31 && ~var36.method210(false) >= ~(var28.method210(false) + -(-var31 + var38 >> 9))) {
                                        class189.method1123(-116, var36, class67.field815.field8010 != var27.field9367);
                                        var36.field422 = class665.field9027;
                                    }
                                }
                            }
                        }
                        if (class665.field9027 == var28.field422) {
                            continue;
                        }
                        class189.method1123(-85, var28, ~class67.field815.field8010 != ~var27.field9367);
                        var28.field422 = class665.field9027;
                    }
                    if (var27.field9364 instanceof class506) {
                        class506 var43 = (class506) var27.field9364;
                        if (var43.field6326 != null) {
                            if (~(1 & var43.field6326.field9495) == -1 && ~(511 & var43.field8018) == -1 && ~(511 & var43.field8011) == -1 || (var43.field6326.field9495 & 1) == 1 && (var43.field8018 & 511) == 256 && ~(var43.field8011 & 511) == -257) {
                                int var44 = -(var43.field6326.field9495 + -1 << 8) + var43.field8018;
                                int var45 = -(var43.field6326.field9495 + -1 << 8) + var43.field8011;
                                for (int var46 = 0; ~class99.field1276 < ~var46; ++var46) {
                                    class704 var53 = (class704) class168.field1973.method3828((long) class352.field4562[var46], (byte) -91);
                                    if (var53 != null) {
                                        class506 var54 = var53.field9854;
                                        if (~class665.field9027 != ~var54.field422 && var43 != var54 && var54.field446) {
                                            int var55 = -(var54.field6326.field9495 - 1 << 8) + var54.field8018;
                                            int var56 = -(var54.field6326.field9495 + -1 << 8) + var54.field8011;
                                            if (var44 <= var55 && ~(var43.field6326.field9495 - (-var44 + var55 >> 9)) <= ~var54.field6326.field9495 && var56 >= var45 && ~var54.field6326.field9495 >= ~(-(-var45 + var56 >> 9) + var43.field6326.field9495)) {
                                                class612.method3428(var54, 25555, ~class67.field815.field8010 != ~var27.field9367);
                                                var54.field422 = class665.field9027;
                                            }
                                        }
                                    }
                                }
                                int var47 = class149.field1788;
                                int[] var48 = class95.field1239;
                                for (int var49 = 0; var49 < var47; ++var49) {
                                    class365 var50 = class132.field1601[var48[var49]];
                                    if (var50 != null && ~class665.field9027 != ~var50.field422 && var50.field446) {
                                        int var51 = var50.field8018 + -(-1 + var50.method210(false) << 8);
                                        int var52 = var50.field8011 - (-1 + var50.method210(false) << 8);
                                        if (~var51 <= ~var44 && ~var50.method210(false) >= ~(-(-var44 + var51 >> 9) + var43.field6326.field9495) && ~var45 >= ~var52 && ~var50.method210(false) >= ~(var43.field6326.field9495 - (-var45 + var52 >> 9))) {
                                            class189.method1123(-64, var50, ~class67.field815.field8010 != ~var27.field9367);
                                            var50.field422 = class665.field9027;
                                        }
                                    }
                                }
                            }
                            if (class665.field9027 == var43.field422) {
                                continue;
                            }
                            class612.method3428(var43, 25555, ~class67.field815.field8010 != ~var27.field9367);
                            var43.field422 = class665.field9027;
                        }
                    }
                    if (var27.field9364 instanceof class3) {
                        int var57 = class227.field2938 + var27.field9366;
                        int var58 = var27.field9362 - -class522.field6612;
                        class62 var59 = (class62) class370.field4774.method3828((long) (var27.field9367 << 28 | var58 << 14 | var57), (byte) -91);
                        if (var59 != null) {
                            for (class40 var60 = (class40) var59.field766.method1911(7); var60 != null; var60 = (class40) var59.field766.method1903((byte) 45)) {
                                class68 var61 = class504.field6287.method1628(var60.field580, (byte) -112);
                                if (class37.field542 && class67.field815.field8010 == var27.field9367) {
                                    class362 var62 = class696.field9644 != -1 ? class46.field617.method1403(class696.field9644, 64) : null;
                                    if ((class458.field5709 & 1) != 0 && (var62 == null || var61.method534(var62.field4635, 12645, class696.field9644) != var62.field4635)) {
                                        ++class245.field3168;
                                        class688.method3802(false, true, -1, 46, 0, class467.field5794, (long) var60.field580, class351.field4540 + " -> <col=ff9040>" + var61.field879, var27.field9362, class7.field74, var27.field9366);
                                    }
                                }
                                if (~class67.field815.field8010 == ~var27.field9367) {
                                    String[] var63 = var61.field885;
                                    for (int var64 = 4; ~var64 <= -1; --var64) {
                                        if (var63 != null && var63[var64] != null) {
                                            byte var65 = 0;
                                            if (var64 == 0) {
                                                var65 = 21;
                                            }
                                            int var66 = class428.field5404;
                                            if (~var64 == -2) {
                                                var65 = 16;
                                            }
                                            if (~var64 == -3) {
                                                var65 = 49;
                                            }
                                            if (~var64 == -4) {
                                                var65 = 12;
                                            }
                                            if (var64 == 4) {
                                                var65 = 18;
                                            }
                                            if (~var61.field896 == ~var64) {
                                                var66 = var61.field852;
                                            }
                                            if (var61.field845 == var64) {
                                                var66 = var61.field869;
                                            }
                                            ++class345.field4409;
                                            class688.method3802(false, true, -1, var65, 0, var63[var64], (long) var60.field580, "<col=ff9040>" + var61.field879, var27.field9362, var66, var27.field9366);
                                        }
                                    }
                                }
                                class688.method3802(~class67.field815.field8010 != ~var27.field9367, true, -1, 1009, 0, class671.field9136.method3726((byte) 108, class71.field912), (long) var60.field580, "<col=ff9040>" + var61.field879, var27.field9362, class268.field3390, var27.field9366);
                                ++class505.field6295;
                            }
                        }
                    }
                    if (var27.field9364 instanceof class310) {
                        class310 var67 = (class310) var27.field9364;
                        class687 var68 = class232.field3017.method2358(0, var67.method131((byte) -97));
                        if (var68.field9421 != null) {
                            var68 = var68.method3800(class327.field4084, (byte) -73);
                        }
                        if (var68 != null) {
                            if (class37.field542 && ~class67.field815.field8010 == ~var27.field9367) {
                                class362 var69 = class696.field9644 == -1 ? null : class46.field617.method1403(class696.field9644, 64);
                                if (~(4 & class458.field5709) != -1 && (var69 == null || var68.method3799(var69.field4635, -1, class696.field9644) != var69.field4635)) {
                                    ++class132.field1604;
                                    class688.method3802(false, true, -1, 50, 0, class467.field5794, class55.method398(var67, var27.field9366, var27.field9362, (byte) 76), class351.field4540 + " -> <col=00ffff>" + var68.field9402, var27.field9362, class7.field74, var27.field9366);
                                }
                            }
                            if (class67.field815.field8010 == var27.field9367) {
                                String[] var70 = var68.field9412;
                                if (var70 != null) {
                                    for (int var71 = 4; var71 >= 0; --var71) {
                                        if (var70[var71] != null) {
                                            short var72 = 0;
                                            if (var71 == 0) {
                                                var72 = 23;
                                            }
                                            int var73 = class428.field5404;
                                            if (var71 == 1) {
                                                var72 = 15;
                                            }
                                            if (~var71 == -3) {
                                                var72 = 20;
                                            }
                                            if (~var71 == -4) {
                                                var72 = 11;
                                            }
                                            if (var68.field9438 == var71) {
                                                var73 = var68.field9431;
                                            }
                                            if (~var71 == -5) {
                                                var72 = 1004;
                                            }
                                            if (var68.field9422 == var71) {
                                                var73 = var68.field9441;
                                            }
                                            class688.method3802(false, true, -1, var72, 0, var70[var71], class55.method398(var67, var27.field9366, var27.field9362, (byte) 111), "<col=00ffff>" + var68.field9402, var27.field9362, var73, var27.field9366);
                                            ++class631.field8562;
                                        }
                                    }
                                }
                            }
                            class688.method3802(class67.field815.field8010 != var27.field9367, true, -1, 1011, 0, class671.field9136.method3726((byte) 50, class71.field912), (long) var68.field9408, "<col=00ffff>" + var68.field9402, var27.field9362, class268.field3390, var27.field9366);
                            ++class664.field9020;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V")
    public static void method1106(int arg0) {
        field2195 = null;
        field2191 = null;
        field2198 = null;
        field2190 = null;
        if (arg0 <= 68) {
            method1105(20, 36, (class650) null, (byte) -90);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        ++field2193;
        int[] var3 = super.field4842.method2772(arg0, (byte) -121);
        if (super.field4842.field6354) {
            int var4 = class596.field8003[arg0] * this.field2196 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class528.field6661; ++var7) {
                class124.field1514 = Integer.MAX_VALUE;
                class16.field162 = Integer.MAX_VALUE;
                class357.field4608 = Integer.MAX_VALUE;
                class637.field8623 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class136.field1654[var7] * this.field2192);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = 255 & this.field2199[(~this.field2196 < ~var11 ? var11 : var11 - this.field2196) & 255];
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = (255 & this.field2199[(var14 >= this.field2192 ? -this.field2192 + var14 : var14) + var13 & 255]) * 2;
                        int var10001 = -(var14 << 12);
                        int var28 = var15 + 1;
                        int var16 = var8 + var10001 + -this.field2197[var15];
                        int var17 = -this.field2197[var28] + var4 + -(var11 << 12);
                        int var18 = this.field2194;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var17 >= 0 ? var17 : -var17) + (var16 < 0 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 - -var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 < 0 ? -var17 : var17;
                                int var26 = ~var16 > -1 ? -var16 : var16;
                                var19 = ~var26 < ~var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class637.field8623 > var19) {
                            class124.field1514 = class16.field162;
                            class16.field162 = class357.field4608;
                            class357.field4608 = class637.field8623;
                            class637.field8623 = var19;
                        } else if (class357.field4608 <= var19) {
                            if (var19 < class16.field162) {
                                class124.field1514 = class16.field162;
                                class16.field162 = var19;
                            } else if (class124.field1514 > var19) {
                                class124.field1514 = var19;
                            }
                        } else {
                            class124.field1514 = class16.field162;
                            class16.field162 = class357.field4608;
                            class357.field4608 = var19;
                        }
                    }
                }
                int var12 = this.field2201;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class637.field8623 + class357.field4608;
                                }
                            } else {
                                var3[var7] = class124.field1514;
                            }
                        } else {
                            var3[var7] = class16.field162;
                        }
                    } else {
                        var3[var7] = class357.field4608;
                    }
                } else {
                    var3[var7] = class637.field8623;
                }
            }
        }
        int var27 = 65 % ((5 - arg1) / 53);
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
    private final void method1107(boolean arg0) {
        ++field2204;
        Random var2 = new Random((long) this.field2202);
        if (!arg0) {
            this.field2197 = new short[512];
            if (~this.field2203 < -1) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field2197[var3] = (short) class396.method2241(0, this.field2203, var2);
                }
            }
        }
    }
}
