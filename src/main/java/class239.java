import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class239 extends class112 {

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    private int field3913 = 1;

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "I")
    private int field3923 = 1;

    @OriginalMember(owner = "client!fj", name = "ab", descriptor = "I")
    private int field3929 = 204;

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "Lwm;")
    public static class152 field3922 = class157.method1048("blaugr-Un:", 122);

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "Lwm;")
    public static class152 field3920 = class157.method1048("Ausw-=hlen", 121);

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "I")
    public static int field3919 = 2;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!fj", name = "V", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!fj", name = "W", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!fj", name = "X", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!fj", name = "Y", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!fj", name = "bb", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "Lbe;")
    public static class297 field3914;

    @OriginalMember(owner = "client!fj", name = "Z", descriptor = "[Lhj;")
    public static class29[] field3928;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(BI)V", line = 5)
    public static final void method1635(byte arg0, int arg1) {
        field3924++;
        class223.field3631.method1617(arg1, 50);
        if (arg0 != 53) {
            method1635((byte) -15, 1);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILah;Lah;)V", line = 18)
    public static final void method1636(int arg0, class205 arg1, class205 arg2) {
        class110.field1557 = arg1;
        field3927++;
        int var3 = -31 / ((28 - arg0) / 49);
        class41.field656 = arg2;
    }

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "(I)V", line = 29)
    public static final void method1637(int arg0) {
        class196.field3147 = false;
        class184.field2930 = -3;
        class179.field2852 = 0;
        class296.field5055 = 0;
        if (arg0 == 11765) {
            class4.field60 = 0;
            field3917++;
            class37.field618 = 1;
            class192.field3021 = -1;
        }
    }

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "(I)V", line = 47)
    public static void method1638(int arg0) {
        int var1 = -116 % ((arg0 + 26) / 38);
        field3920 = null;
        field3914 = null;
        field3928 = null;
        field3922 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)[I", line = 71)
    public final int[] method53(byte arg0, int arg1) {
        field3930++;
        int[] var3 = this.field1585.method1952(arg1, (byte) 120);
        if (arg0 != -3) {
            method1637(8);
        }
        if (this.field1585.field4935) {
            for (int var4 = 0; var4 < class58.field889; var4++) {
                int var5 = class114.field1620[arg1];
                int var6 = class131.field1992[var4];
                int var7 = this.field3923 * var6 >> 12;
                int var8 = this.field3913 * var5 >> 12;
                int var9 = var6 % (4096 / this.field3923) * this.field3923;
                int var10 = var5 % (4096 / this.field3913) * this.field3913;
                if (var10 < this.field3929) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field3929) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field3929 > var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILhi;)V", line = 156)
    public final void method52(int arg0, int arg1, class291 arg2) {
        field3925++;
        if (arg1 == 0) {
            this.field3923 = arg2.method2011(-25);
        } else if (arg1 == 1) {
            this.field3913 = arg2.method2011(-76);
        } else if (arg1 == 2) {
            this.field3929 = arg2.method2021((byte) 74);
        }
        if (arg0 != 31164) {
            field3914 = (class297) null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V", line = 626)
    public class239() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BIIIIII)V", line = 217)
    public static final void method1639(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class268.field4527 == 0) {
            int var7 = class104.field1496;
            int var8 = class265.field4469;
            int var9 = class100.field1464;
            int var10 = (arg2 - arg4) * (var9 - var7) / arg6 + var7;
            int var11 = class77.field1092;
            int var12 = (arg3 - arg1) * (var11 - var8) / arg5 + var8;
            if (class125.field1762 && (field3926 & 0x40) != 0) {
                class127 var13 = class132.method837(class172.field2758, class93.field1329, arg0 + 40);
                if (var13 == null) {
                    class233.method1601(arg0 + 6172);
                } else {
                    class146.method915(-112, (short) 44, class208.field3393, var10, class169.field2648, 0L, var12, class62.field942);
                }
            } else {
                if (class256.field4410 == 1) {
                    class146.method915(121, (short) 14, -1, var10, class201.field3252, 0L, var12, class23.field406);
                }
                class155.field2469++;
                class146.method915(-114, (short) 59, -1, var10, class201.field3252, 0L, var12, class219.field3564);
            }
        }
        field3915++;
        long var14 = -1L;
        if (arg0 != -40) {
            method1638(-74);
        }
        for (int var16 = 0; var16 < class303.field5213; var16++) {
            long var17 = class287.field4855[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 29 & 0x3;
            int var21 = (int) var17 >> 7 & 0x7F;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var20 == 2 && class81.method536(class23.field400, var19, var21, var17)) {
                    class270 var23 = class242.method1656(var22, true);
                    if (var23.field4592 != null) {
                        var23 = var23.method1845(true);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class268.field4527 == 1) {
                        class37.field605++;
                        class146.method915(arg0 ^ 0x4D, (short) 7, class241.field3944, var19, class195.method1307(new class152[] { class141.field2142, class155.field2468, var23.field4589 }, (byte) 29), var17, var21, class147.field2260);
                    } else if (class125.field1762) {
                        class45 var24 = class324.field5660 == -1 ? null : class162.method1088(class324.field5660, (byte) 124);
                        if ((field3926 & 0x4) != 0 && (var24 == null || var23.method1853(var24.field720, (byte) 30, class324.field5660) != var24.field720)) {
                            class33.field544++;
                            class146.method915(71, (short) 4, class208.field3393, var19, class195.method1307(new class152[] { class279.field4775, class155.field2468, var23.field4589 }, (byte) 29), var17, var21, class62.field942);
                        }
                    } else {
                        class41.field663++;
                        class152[] var25 = var23.field4540;
                        if (class256.field4418) {
                            var25 = class85.method557(var25, false);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    short var27 = 0;
                                    int var28 = -1;
                                    if (var26 == 0) {
                                        var27 = 2;
                                    }
                                    if (var23.field4551 == var26) {
                                        var28 = var23.field4579;
                                    }
                                    class66.field993++;
                                    if (var26 == 1) {
                                        var27 = 5;
                                    }
                                    if (var23.field4608 == var26) {
                                        var28 = var23.field4620;
                                    }
                                    if (var26 == 2) {
                                        var27 = 49;
                                    }
                                    if (var26 == 3) {
                                        var27 = 40;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1003;
                                    }
                                    class146.method915(69, var27, var28, var19, class195.method1307(new class152[] { class278.field4758, var23.field4589 }, (byte) 29), var17, var21, var25[var26]);
                                }
                            }
                        }
                        class146.method915(-116, (short) 1007, class127.field1799, var19, class195.method1307(new class152[] { class278.field4758, var23.field4589 }, (byte) 29), (long) var23.field4604, var21, class86.field1204);
                    }
                }
                if (var20 == 1) {
                    class4 var29 = class40.field649[var22];
                    if ((var29.field72.field3984 & 0x1) == 0 && (var29.field4162 & 0x7F) == 0 && (var29.field4231 & 0x7F) == 0 || (var29.field72.field3984 & 0x1) == 1 && (var29.field4162 & 0x7F) == 64 && (var29.field4231 & 0x7F) == 64) {
                        int var30 = var29.field4231 - ((var29.field72.field3984 - 1) * 64);
                        int var31 = var29.field4162 + 64 - (var29.field72.field3984 * 64);
                        for (int var32 = 0; var32 < class233.field3826; var32++) {
                            class4 var33 = class40.field649[class97.field1403[var32]];
                            if (var33 != null && !var33.field4207 && var29 != var33 && var33.field4255) {
                                int var34 = var33.field4162 - ((var33.field72.field3984 - 1) * 64);
                                int var35 = var33.field4231 - ((var33.field72.field3984 - 1) * 64);
                                if (var34 >= var31 && var29.field72.field3984 - (var34 - var31 >> 7) >= var33.field72.field3984 && var35 >= var30 && var33.field72.field3984 <= (var29.field72.field3984 - (var35 - var30 >> 7))) {
                                    class194.method1300(var33.field72, var21, 0, var19, class97.field1403[var32]);
                                    var33.field4207 = true;
                                }
                            }
                        }
                        for (int var36 = 0; var36 < class194.field3114; var36++) {
                            class12 var37 = class22.field380[class325.field5670[var36]];
                            if (var37 != null && !var37.field4207 && var37.field4255) {
                                int var38 = var37.field4162 - ((var37.method67(-4391) - 1) * 64);
                                int var39 = var37.field4231 - ((var37.method67(-4391) - 1) * 64);
                                if (var38 >= var31 && var37.method67(-4391) <= var29.field72.field3984 - (var38 - var31 >> 7) && var39 >= var30 && var37.method67(-4391) <= var29.field72.field3984 - (var39 - var30 >> 7)) {
                                    class204.method1349(class325.field5670[var36], var37, var21, var19, true);
                                    var37.field4207 = true;
                                }
                            }
                        }
                    }
                    if (var29.field4207) {
                        continue;
                    }
                    class194.method1300(var29.field72, var21, 0, var19, var22);
                    var29.field4207 = true;
                }
                if (var20 == 0) {
                    class12 var40 = class22.field380[var22];
                    if ((var40.field4162 & 0x7F) == 64 && (var40.field4231 & 0x7F) == 64) {
                        int var41 = var40.field4162 - ((var40.method67(-4391) - 1) * 64);
                        int var42 = var40.field4231 - (var40.method67(-4391) - 1) * 64;
                        for (int var43 = 0; var43 < class233.field3826; var43++) {
                            class4 var44 = class40.field649[class97.field1403[var43]];
                            if (var44 != null && !var44.field4207 && var44.field4255) {
                                int var45 = var44.field4231 + 64 - var44.field72.field3984 * 64;
                                int var46 = var44.field4162 + 64 - (var44.field72.field3984 * 64);
                                if (var41 <= var46 && var44.field72.field3984 <= (var40.method67(-4391) - (var46 - var41 >> 7)) && var45 >= var42 && var44.field72.field3984 <= (var40.method67(arg0 ^ 0x1101) - (var45 - var42 >> 7))) {
                                    class194.method1300(var44.field72, var21, 0, var19, class97.field1403[var43]);
                                    var44.field4207 = true;
                                }
                            }
                        }
                        for (int var47 = 0; var47 < class194.field3114; var47++) {
                            class12 var48 = class22.field380[class325.field5670[var47]];
                            if (var48 != null && !var48.field4207 && var40 != var48 && var48.field4255) {
                                int var49 = var48.field4162 - ((var48.method67(-4391) - 1) * 64);
                                int var50 = var48.field4231 + 64 - (var48.method67(arg0 ^ 0x1101) * 64);
                                if (var49 >= var41 && var48.method67(-4391) <= (var40.method67(-4391) - (var49 - var41 >> 7)) && var50 >= var42 && var48.method67(-4391) <= var40.method67(-4391) - (var50 - var42 >> 7)) {
                                    class204.method1349(class325.field5670[var47], var48, var21, var19, true);
                                    var48.field4207 = true;
                                }
                            }
                        }
                    }
                    if (var40.field4207) {
                        continue;
                    }
                    class204.method1349(var22, var40, var21, var19, true);
                    var40.field4207 = true;
                }
                if (var20 == 3) {
                    class183 var51 = class205.field3353[class23.field400][var19][var21];
                    if (var51 != null) {
                        for (class230 var52 = (class230) var51.method1217(arg0 ^ 0xFFFFFFB0); var52 != null; var52 = (class230) var51.method1219(16)) {
                            int var53 = var52.field3756.field2071;
                            class312 var54 = class189.method1253((byte) 96, var53);
                            if (class268.field4527 == 1) {
                                class146.method915(65, (short) 58, class241.field3944, var19, class195.method1307(new class152[] { class141.field2142, class184.field2927, var54.field5393 }, (byte) 29), (long) var53, var21, class147.field2260);
                                class215.field3489++;
                            } else if (class125.field1762) {
                                class45 var55 = class324.field5660 == -1 ? null : class162.method1088(class324.field5660, (byte) 116);
                                if ((field3926 & 0x1) != 0 && (var55 == null || var54.method2178((byte) -66, var55.field720, class324.field5660) != var55.field720)) {
                                    class146.method915(-90, (short) 22, class208.field3393, var19, class195.method1307(new class152[] { class279.field4775, class184.field2927, var54.field5393 }, (byte) 29), (long) var53, var21, class62.field942);
                                    class118.field1674++;
                                }
                            } else {
                                class152[] var56 = var54.field5385;
                                if (class256.field4418) {
                                    var56 = class85.method557(var56, false);
                                }
                                class219.field3568++;
                                for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var56 != null && var56[var57] != null) {
                                        class94.field1336++;
                                        int var58 = -1;
                                        if (var54.field5371 == var57) {
                                            var58 = var54.field5379;
                                        }
                                        if (var54.field5341 == var57) {
                                            var58 = var54.field5396;
                                        }
                                        byte var59 = 0;
                                        if (var57 == 0) {
                                            var59 = 24;
                                        }
                                        if (var57 == 1) {
                                            var59 = 57;
                                        }
                                        if (var57 == 2) {
                                            var59 = 3;
                                        }
                                        if (var57 == 3) {
                                            var59 = 34;
                                        }
                                        if (var57 == 4) {
                                            var59 = 32;
                                        }
                                        class146.method915(124, var59, var58, var19, class195.method1307(new class152[] { class179.field2844, var54.field5393 }, (byte) 29), (long) var53, var21, var56[var57]);
                                    }
                                }
                                class146.method915(-113, (short) 1005, class127.field1799, var19, class195.method1307(new class152[] { class179.field2844, var54.field5393 }, (byte) 29), (long) var53, var21, class86.field1204);
                            }
                        }
                    }
                }
            }
        }
    }
}
