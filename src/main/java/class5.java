import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class62 {

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    private int field41 = 585;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "Z")
    public static boolean field45 = true;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    public static int field43 = 13156520;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Lh;")
    public static class572 field40 = new class572("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "[F")
    public static float[] field46 = new float[16];

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field47 = 0;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "(I)V", line = 4)
    public static void method10(int arg0) {
        if (arg0 != -19712) {
            field47 = 82;
        }
        field46 = null;
        field40 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lgw;II)V", line = 19)
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field44;
        if (arg1 != -1) {
            field47 = -15;
        }
        if (arg2 == 0) {
            this.field41 = arg0.method1045(true);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 46)
    public class5() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lqa;BI)Z", line = 50)
    public static final boolean method12(class208 arg0, byte arg1, int arg2) {
        ++field38;
        int var3 = (class146.field2125 + -104) / 2;
        int var4 = (class410.field5609 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; ++var6) {
            for (int var57 = var4; ~(var4 + 104) < ~var57; ++var57) {
                for (int var58 = arg2; ~var58 >= -4; ++var58) {
                    if (class615.method3610(15488, arg2, var57, var6, var58)) {
                        int var59 = var58;
                        if (class111.method815(var6, (byte) 47, var57)) {
                            var59 = var58 - 1;
                        }
                        if (~var59 <= -1) {
                            var5 &= class69.method542(var57, var59, (byte) 20, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; var7.length > var8; ++var8) {
                var7[var8] = -16777216;
            }
            class302.field4155 = arg0.method466(var7, 0, 512, 512, 512);
            class261.method1658(-4654);
            int var9 = -16777216 | 238 - -((int) (Math.random() * 20.0D)) + -10 + (228 + (int) (20.0D * Math.random()) << 8) + (228 + (int) (Math.random() * 20.0D) << 16);
            int var10 = (int) (20.0D * Math.random()) + 228 << 16 | -16777216;
            if (arg1 != 24) {
                return true;
            } else {
                int var11 = (int) (8.0D * Math.random()) | (int) (8.0D * Math.random()) << 16 | (int) (8.0D * Math.random()) << 8;
                boolean[][] var12 = new boolean[class59.field743 + 1][class59.field743 + 1];
                for (int var13 = var3; var13 < var3 + 104; var13 += class59.field743) {
                    for (int var36 = var4; var36 < var4 + 104; var36 += class59.field743) {
                        int var37 = 0;
                        int var38 = 0;
                        int var39 = var13;
                        if (var13 > 0) {
                            var39 = var13 - 1;
                            var37 += 4;
                        }
                        int var40 = var36;
                        if (~var36 < -1) {
                            var40 = var36 - 1;
                        }
                        int var41 = class59.field743 + var13;
                        if (var41 < 104) {
                            ++var41;
                        }
                        int var42 = class59.field743 + var36;
                        if (~var42 > -105) {
                            ++var42;
                            var38 += 4;
                        }
                        arg0.method510(0, 0, class59.field743 * 4 + var37, class59.field743 * 4 + var38);
                        arg0.method421(-16777216);
                        for (int var43 = arg2; var43 <= 3; ++var43) {
                            for (int var50 = 0; ~class59.field743 <= ~var50; ++var50) {
                                for (int var56 = 0; ~var56 >= ~class59.field743; ++var56) {
                                    var12[var50][var56] = class615.method3610(15488, arg2, var40 + var56, var39 + var50, var43);
                                }
                            }
                            class207.field3077[var43].method581(0, 0, 1024, var39, var40, var41, var42, var12);
                            if (!class134.field1825) {
                                for (int var51 = -4; ~var51 > ~class59.field743; ++var51) {
                                    for (int var52 = -4; ~class59.field743 < ~var52; ++var52) {
                                        int var53 = var13 + var51;
                                        int var54 = var36 + var52;
                                        if (var53 >= var3 && var54 >= var4 && class615.method3610(arg1 + 15464, arg2, var54, var53, var43)) {
                                            int var55 = var43;
                                            if (class111.method815(var53, (byte) 45, var54)) {
                                                var55 = var43 - 1;
                                            }
                                            if (var55 >= 0) {
                                                class200.method1341(var55, arg0, var9, (class59.field743 - var52) * 4 + var38 + -4, var54, 262144, var37 - -(var51 * 4), var53, var10);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (class134.field1825) {
                            class37 var44 = class127.field1774[arg2];
                            for (int var45 = 0; var45 < class59.field743; ++var45) {
                                for (int var46 = 0; ~var46 > ~class59.field743; ++var46) {
                                    int var47 = var13 - -var45;
                                    int var48 = var36 + var46;
                                    int var49 = var44.field439[-var44.field435 + var47][var48 - var44.field458];
                                    if (~(var49 & 1076101120) == -1) {
                                        if ((var49 & 8388608) == 0) {
                                            if (~(var49 & 33554432) != -1) {
                                                arg0.method1376(-1713569622, var45 * 4 + var37 + 3, 4, (byte) -95, var38 - -((-var46 + class59.field743) * 4) - 4);
                                            } else if (~(var49 & 134217728) != -1) {
                                                arg0.method1371(var45 * 4 + var37, 4, 1, -1713569622, var38 + -4 - -((class59.field743 - var46) * 4) + 3);
                                            } else if ((var49 & 536870912) != 0) {
                                                arg0.method1376(-1713569622, var45 * 4 + var37, 4, (byte) -119, (-var46 + class59.field743) * 4 + var38 + -4);
                                            }
                                        } else {
                                            arg0.method1371(var45 * 4 + var37, 4, arg1 ^ 25, -1713569622, (-var46 + class59.field743) * 4 + var38 + -4);
                                        }
                                    } else {
                                        arg0.method1378(true, var45 * 4 + var37, -1713569622, 4, 4, (-var46 + class59.field743) * 4 + var38 + -4);
                                    }
                                }
                            }
                        }
                        arg0.method498(var37, var38, class59.field743 * 4, class59.field743 * 4, var11, 2);
                        class302.field4155.method320((-var3 + var13) * 4 + 48, -((-var4 + var36) * 4) + -(class59.field743 * 4) + 464, class59.field743 * 4, class59.field743 * 4, var37, var38);
                    }
                }
                arg0.method479();
                arg0.method421(-16777215);
                class504.method2996((byte) 121);
                class261.field3739 = 0;
                class89.field1335.method122((byte) 14);
                if (!class134.field1825) {
                    for (int var14 = var3; ~(var3 + 104) < ~var14; ++var14) {
                        for (int var20 = var4; var20 < var4 - -104; ++var20) {
                            for (int var21 = arg2; ~(arg2 - -1) <= ~var21 && var21 <= 3; ++var21) {
                                if (class615.method3610(15488, arg2, var20, var14, var21)) {
                                    class231 var22 = (class231) class440.method2560(var21, var14, var20);
                                    if (var22 == null) {
                                        var22 = (class231) class624.method3650(var21, var14, var20, class62.field790 != null ? class62.field790 : (class62.field790 = class62.method410("up")));
                                    }
                                    if (var22 == null) {
                                        var22 = (class231) class169.method1205(var21, var14, var20);
                                    }
                                    if (var22 == null) {
                                        var22 = (class231) class420.method2476(var21, var14, var20);
                                    }
                                    if (var22 != null) {
                                        class145 var23 = class216.field3172.method1505(-24044, var22.method183(-19248));
                                        if (!var23.field2059 || class106.field1534) {
                                            int var24 = var23.field2070;
                                            if (var23.field2028 != null) {
                                                for (int var25 = 0; ~var23.field2028.length < ~var25; ++var25) {
                                                    if (var23.field2028[var25] != -1) {
                                                        class145 var26 = class216.field3172.method1505(-24044, var23.field2028[var25]);
                                                        if (var26.field2070 >= 0) {
                                                            var24 = var26.field2070;
                                                        }
                                                    }
                                                }
                                            }
                                            if (var24 >= 0) {
                                                boolean var27 = false;
                                                if (var24 >= 0) {
                                                    class308 var28 = class440.field5876.method3058(var24, 0);
                                                    if (var28 != null && var28.field4261) {
                                                        var27 = true;
                                                    }
                                                }
                                                int var29 = var14;
                                                int var30 = var20;
                                                if (var27) {
                                                    int[][] var31 = class127.field1774[var21].field439;
                                                    int var32 = class127.field1774[var21].field435;
                                                    int var33 = class127.field1774[var21].field458;
                                                    for (int var34 = 0; ~var34 > -11; ++var34) {
                                                        int var35 = (int) (Math.random() * 4.0D);
                                                        if (~var35 == -1 && var29 > var3 && var29 > var14 + -3 && (2883848 & var31[-var32 + -1 + var29][var30 - var33]) == 0) {
                                                            --var29;
                                                        }
                                                        if (var35 == 1 && ~var29 > ~(var3 + 104 + -1) && ~var29 > ~(var14 + 3) && (var31[var29 - -1 + -var32][-var33 + var30] & 2883968) == 0) {
                                                            ++var29;
                                                        }
                                                        if (var35 == 2 && var30 > var4 && ~var30 < ~(var20 - 3) && (2883842 & var31[-var32 + var29][-var33 + var30 - 1]) == 0) {
                                                            --var30;
                                                        }
                                                        if (var35 == 3 && ~var30 > ~(var4 + 103) && var30 < var20 + 3 && ~(var31[-var32 + var29][-var33 + var30 + 1] & 2883872) == -1) {
                                                            ++var30;
                                                        }
                                                    }
                                                }
                                                class216.field3174[class261.field3739] = var23.field2049;
                                                class396.field5458[class261.field3739] = var29;
                                                class502.field7119[class261.field3739] = var30;
                                                ++class261.field3739;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class406.field5552 != null) {
                        class493.field7012.field4501 = 1;
                        class440.field5876.method3062(64, 36, 1024);
                        for (int var15 = 0; class406.field5552.field7138 > var15; ++var15) {
                            int var16 = class406.field5552.field7136[var15];
                            if (var16 >> 28 == class541.field8119.field8501) {
                                int var17 = (16383 & var16 >> 14) + -class473.field6687;
                                int var18 = (var16 & 16383) - class38.field463;
                                if (~var17 <= -1 && var17 < class146.field2125 && var18 >= 0 && ~var18 > ~class410.field5609) {
                                    class89.field1335.method131(new class556(var15), 0);
                                } else {
                                    class308 var19 = class440.field5876.method3058(class406.field5552.field7140[var15], 0);
                                    if (var19.field4250 != null && ~(var17 - -var19.field4254) <= -1 && var17 - -var19.field4234 < class146.field2125 && ~(var19.field4228 + var18) <= -1 && ~(var18 - -var19.field4236) > ~class410.field5609) {
                                        class89.field1335.method131(new class556(var15), 0);
                                    }
                                }
                            }
                        }
                        class440.field5876.method3062(64, 36, 128);
                        class493.field7012.field4501 = 2;
                        class493.field7012.method1969(false);
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)[I", line = 504)
    public final int[] method13(int arg0, int arg1) {
        if (arg1 != 656024161) {
            method12((class208) null, (byte) -61, 4);
        }
        ++field39;
        int[] var3 = super.field774.method3086(arg0, arg1 + -656024163);
        if (super.field774.field7499) {
            int var4 = class309.field4265[arg0];
            for (int var5 = 0; ~var5 > ~class438.field5847; ++var5) {
                int var6 = class200.field2965[var5];
                if (~var6 < ~this.field41 && var6 < 4096 - this.field41 && ~var4 < ~(-this.field41 + 2048) && this.field41 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field41 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (var6 > -this.field41 + 2048 && var6 < this.field41 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field41;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field41);
                } else if (this.field41 <= var4 && ~var4 >= ~(-this.field41 + 4096)) {
                    if (~this.field41 >= ~var6 && ~var6 >= ~(-this.field41 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field41 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field41;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field41 + 2048);
                }
            }
        }
        return var3;
    }
}
