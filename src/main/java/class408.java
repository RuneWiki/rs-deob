import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class408 {

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "J")
    private long field5756 = -1L;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "J")
    private long field5760 = -1L;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    private int field5759 = 0;

    @OriginalMember(owner = "client!lv", name = "s", descriptor = "Lfn;")
    private class124 field5772;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "J")
    private long field5761;

    @OriginalMember(owner = "client!lv", name = "p", descriptor = "J")
    private long field5769;

    @OriginalMember(owner = "client!lv", name = "q", descriptor = "[B")
    private byte[] field5770;

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "[B")
    private byte[] field5767;

    @OriginalMember(owner = "client!lv", name = "r", descriptor = "J")
    private long field5771;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!lv", name = "o", descriptor = "I")
    private int field5768;

    @OriginalMember(owner = "client!lv", name = "t", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!lv", name = "u", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!lv", name = "v", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!lv", name = "w", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "J")
    private long field5763;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
    private final void method2328(int arg0) throws IOException {
        field5757++;
        if (arg0 != -1242767576) {
            method2330(124, 106, null, 40);
        }
        this.field5768 = 0;
        if (this.field5771 != this.field5763) {
            this.field5772.method883(this.field5771, (byte) -42);
            this.field5763 = this.field5771;
        }
        this.field5760 = this.field5771;
        while (this.field5768 < this.field5770.length) {
            int var2 = this.field5770.length - this.field5768;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5772.method884((byte) -40, this.field5768, var2, this.field5770);
            if (var3 == -1) {
                break;
            }
            this.field5768 += var3;
            this.field5763 += var3;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II[BZ)V")
    public final void method2329(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field5766++;
        try {
            if (this.field5769 < this.field5771 + ((long) arg0)) {
                this.field5769 = (long) arg0 + this.field5771;
            }
            if (this.field5756 != -1L && (this.field5756 > this.field5771 || (long) this.field5759 + this.field5756 < this.field5771)) {
                this.method2338((byte) 47);
            }
            if (this.field5756 != -1L && (long) arg0 + this.field5771 > (long) this.field5767.length + this.field5756) {
                int var5 = (int) ((long) this.field5767.length + this.field5756 - this.field5771);
                class282.method1706(arg2, arg1, this.field5767, (int) (this.field5771 - this.field5756), var5);
                this.field5771 += var5;
                arg1 += var5;
                arg0 -= var5;
                this.field5759 = this.field5767.length;
                this.method2338((byte) 47);
            }
            if (this.field5767.length >= arg0) {
                if (arg3) {
                    method2335(null, 126);
                }
                if (arg0 > 0) {
                    if (this.field5756 == -1L) {
                        this.field5756 = this.field5771;
                    }
                    class282.method1706(arg2, arg1, this.field5767, (int) (this.field5771 - this.field5756), arg0);
                    this.field5771 += arg0;
                    if (((long) this.field5759) < (this.field5771 - this.field5756)) {
                        this.field5759 = (int) (this.field5771 - this.field5756);
                    }
                }
            } else {
                if (this.field5771 != this.field5763) {
                    this.field5772.method883(this.field5771, (byte) 101);
                    this.field5763 = this.field5771;
                }
                this.field5772.method880(arg2, 1, arg1, arg0);
                this.field5763 += arg0;
                if (this.field5763 > this.field5761) {
                    this.field5761 = this.field5763;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field5771 >= this.field5760 && this.field5771 < this.field5760 + ((long) this.field5768)) {
                    var6 = this.field5771;
                } else if (this.field5760 >= this.field5771 && this.field5760 < (long) arg0 + this.field5771) {
                    var6 = this.field5760;
                }
                if (this.field5771 + ((long) arg0) > this.field5760 && ((long) arg0 + this.field5771) <= ((long) this.field5768 + this.field5760)) {
                    var8 = this.field5771 + ((long) arg0);
                } else if (this.field5771 < (long) this.field5768 + this.field5760 && (long) arg0 + this.field5771 >= this.field5760 - -((long) this.field5768)) {
                    var8 = (long) this.field5768 + this.field5760;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class282.method1706(arg2, (int) (var6 + (long) arg1 - this.field5771), this.field5770, (int) (var6 - this.field5760), var10);
                }
                this.field5771 += arg0;
            }
        } catch (IOException var12) {
            this.field5763 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IILoa;I)V")
    public static final void method2330(int arg0, int arg1, class638 arg2, int arg3) {
        field5773++;
        if (~arg0 > arg3 || arg1 < 0 || class538.field7300 == 0 || class391.field5475 == 0) {
            return;
        }
        arg2.method404(class139.field1946, class604.field8398, class538.field7300, class391.field5475);
        arg2.method442(class17.field251, class495.field6814, class538.field7300, class391.field5475);
        class391 var4 = arg2.method459();
        var4.method1290(class126.field1757, class388.field5441, class22.field309, class319.field4728, class192.field2838, class99.field1354);
        arg2.method446(var4);
        if (class31.field369 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg2.method451();
            int var8 = (arg0 - class139.field1946) * var7 / class538.field7300;
            int var9 = (arg1 - class604.field8398) * var7 / class391.field5475;
            int var10 = arg2.method474();
            int var11 = (arg0 - class139.field1946) * var10 / class538.field7300;
            int var12 = (arg1 - class604.field8398) * var10 / class391.field5475;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method1289(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method1289(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 9;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 9;
                if (var20 > 0 && var22 > 0 && class86.field1185 > var20 && var22 < class526.field7212) {
                    int var23 = class253.field3576.field520;
                    if (var23 < 3 && (class246.field3501[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class31.field369[var23].method267(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class253.field3576.method1722((byte) -124) - 1 << 8) + var19 >> 9;
                        var6 = var21 + (class253.field3576.method1722((byte) -124) - 1 << 8) >> 9;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class457.field6455 && (class414.field5858 & 0x40) != 0) {
                    class140 var24 = class474.method2695(-12025, class677.field9549, class366.field5205);
                    if (var24 == null) {
                        class651.method3622(-1);
                    } else {
                        class92.method678(" ->", var5, 58, -1, var6, 0L, class561.field7575, true, class281.field3927, (byte) -74, false);
                    }
                } else {
                    if (class350.field5045 == class158.field2374) {
                        class92.method678("", var5, 6, -1, var6, 0L, -1, true, class9.field161.method42(class666.field9377, 19572), (byte) -74, false);
                    }
                    class92.method678("", var5, 21, -1, var6, 0L, class584.field8148, true, class354.field5078, (byte) -74, false);
                    class534.field7270++;
                }
            }
        }
        class663 var25 = class91.field1210;
        for (class60 var26 = (class60) var25.method3676((byte) 102); var26 != null; var26 = (class60) var25.method3682(-18176)) {
            if ((class503.field6880 || class253.field3576.field520 == var26.field813) && var26.method506(0, arg0, arg1, arg2)) {
                if (var26.field817 instanceof class286) {
                    class286 var27 = (class286) var26.field817;
                    int var28 = var27.method1722((byte) -128);
                    if ((var28 & 0x1) == 0 && (var27.field509 & 0x1FF) == 0 && (var27.field514 & 0x1FF) == 0 || (var28 & 0x1) == 1 && (var27.field509 & 0x1FF) == 256 && (var27.field514 & 0x1FF) == 256) {
                        int var29 = var27.field509 - (var27.method1722((byte) -122) - 1 << 8);
                        int var30 = var27.field514 - (var27.method1722((byte) -123) - 1 << 8);
                        for (int var31 = 0; var31 < class602.field8365; var31++) {
                            class178 var38 = (class178) class323.field4762.method2061(-17305, (long) class594.field8262[var31]);
                            if (var38 != null) {
                                class225 var39 = var38.field2634;
                                if (class239.field3440 != var39.field6410 && var39.field6461) {
                                    int var40 = var39.field509 - (var39.field3245.field2463 - 1 << 8);
                                    int var41 = var39.field514 - (var39.field3245.field2463 - 1 << 8);
                                    if (var29 <= var40 && var39.field3245.field2463 <= (var27.method1722((byte) -120) - (var40 - var29 >> 9)) && var41 >= var30 && var39.field3245.field2463 <= (var27.method1722((byte) -128) - (var41 - var30 >> 9))) {
                                        class46.method253(class253.field3576.field520 != var26.field813, var39, true);
                                        var39.field6410 = class239.field3440;
                                    }
                                }
                            }
                        }
                        int var32 = class64.field851;
                        int[] var33 = class53.field759;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class286 var35 = class495.field6821[var33[var34]];
                            if (var35 != null && class239.field3440 != var35.field6410 && var27 != var35 && var35.field6461) {
                                int var36 = var35.field509 - (var35.method1722((byte) -126) - 1 << 8);
                                int var37 = var35.field514 - (var35.method1722((byte) -123) - 1 << 8);
                                if (var36 >= var29 && var35.method1722((byte) -121) <= (var27.method1722((byte) -122) - (var36 - var29 >> 9)) && var37 >= var30 && var35.method1722((byte) -121) <= var27.method1722((byte) -121) - (var37 - var30 >> 9)) {
                                    class150.method1057(-1, class253.field3576.field520 != var26.field813, var35);
                                    var35.field6410 = class239.field3440;
                                }
                            }
                        }
                    }
                    if (class239.field3440 == var27.field6410) {
                        continue;
                    }
                    class150.method1057(arg3, class253.field3576.field520 != var26.field813, var27);
                    var27.field6410 = class239.field3440;
                }
                if (var26.field817 instanceof class225) {
                    class225 var42 = (class225) var26.field817;
                    if (var42.field3245 != null) {
                        if ((var42.field3245.field2463 & 0x1) == 0 && (var42.field509 & 0x1FF) == 0 && (var42.field514 & 0x1FF) == 0 || (var42.field3245.field2463 & 0x1) == 1 && (var42.field509 & 0x1FF) == 256 && (var42.field514 & 0x1FF) == 256) {
                            int var43 = var42.field509 - (var42.field3245.field2463 - 1 << 8);
                            int var44 = var42.field514 - (var42.field3245.field2463 - 1 << 8);
                            for (int var45 = 0; var45 < class602.field8365; var45++) {
                                class178 var52 = (class178) class323.field4762.method2061(-17305, (long) class594.field8262[var45]);
                                if (var52 != null) {
                                    class225 var53 = var52.field2634;
                                    if (class239.field3440 != var53.field6410 && var42 != var53 && var53.field6461) {
                                        int var54 = var53.field509 - (var53.field3245.field2463 - 1 << 8);
                                        int var55 = var53.field514 - (var53.field3245.field2463 - 1 << 8);
                                        if (var43 <= var54 && var42.field3245.field2463 - (var54 - var43 >> 9) >= var53.field3245.field2463 && var44 <= var55 && (var42.field3245.field2463 - (var55 - var44 >> 9)) >= var53.field3245.field2463) {
                                            class46.method253(class253.field3576.field520 != var26.field813, var53, true);
                                            var53.field6410 = class239.field3440;
                                        }
                                    }
                                }
                            }
                            int var46 = class64.field851;
                            int[] var47 = class53.field759;
                            for (int var48 = 0; var48 < var46; var48++) {
                                class286 var49 = class495.field6821[var47[var48]];
                                if (var49 != null && class239.field3440 != var49.field6410 && var49.field6461) {
                                    int var50 = var49.field509 - (var49.method1722((byte) -121) - 1 << 8);
                                    int var51 = var49.field514 - (var49.method1722((byte) -121) - 1 << 8);
                                    if (var43 <= var50 && var49.method1722((byte) -123) <= var42.field3245.field2463 - (var50 - var43 >> 9) && var44 <= var51 && var49.method1722((byte) -124) <= (var42.field3245.field2463 - (var51 - var44 >> 9))) {
                                        class150.method1057(arg3, class253.field3576.field520 != var26.field813, var49);
                                        var49.field6410 = class239.field3440;
                                    }
                                }
                            }
                        }
                        if (class239.field3440 == var42.field6410) {
                            continue;
                        }
                        class46.method253(class253.field3576.field520 != var26.field813, var42, true);
                        var42.field6410 = class239.field3440;
                    }
                }
                if (var26.field817 instanceof class689) {
                    int var56 = var26.field814 + class511.field6989;
                    int var57 = class124.field1726 + var26.field820;
                    class435 var58 = (class435) class179.field2656.method2061(-17305, (long) (var56 | var26.field813 << 28 | var57 << 14));
                    if (var58 != null) {
                        for (class13 var59 = (class13) var58.field6146.method1284(0); var59 != null; var59 = (class13) var58.field6146.method1281(arg3 ^ 0xFFFFFFFD)) {
                            class257 var60 = class648.field9184.method3064(var59.field216, arg3 - 50);
                            if (class457.field6455 && class253.field3576.field520 == var26.field813) {
                                class374 var61 = class36.field449 == -1 ? null : class324.field4784.method2171((byte) -80, class36.field449);
                                if ((class414.field5858 & 0x1) != 0 && (var61 == null || var60.method1580(false, class36.field449, var61.field5300) != var61.field5300)) {
                                    class92.method678(class73.field1010 + " -> <col=ff9040>" + var60.field3655, var26.field814, 3, -1, var26.field820, (long) var59.field216, class561.field7575, true, class281.field3927, (byte) -74, false);
                                    class139.field1948++;
                                }
                            }
                            if (class253.field3576.field520 == var26.field813) {
                                String[] var62 = var60.field3654;
                                for (int var63 = 4; var63 >= 0; var63--) {
                                    if (var62 != null && var62[var63] != null) {
                                        byte var64 = 0;
                                        if (var63 == 0) {
                                            var64 = 4;
                                        }
                                        int var65 = class258.field3691;
                                        if (var63 == 1) {
                                            var64 = 17;
                                        }
                                        if (var63 == 2) {
                                            var64 = 57;
                                        }
                                        if (var63 == 3) {
                                            var64 = 8;
                                        }
                                        if (var60.field3646 == var63) {
                                            var65 = var60.field3623;
                                        }
                                        if (var63 == 4) {
                                            var64 = 9;
                                        }
                                        if (var60.field3616 == var63) {
                                            var65 = var60.field3613;
                                        }
                                        class277.field3884++;
                                        class92.method678("<col=ff9040>" + var60.field3655, var26.field814, var64, -1, var26.field820, (long) var59.field216, var65, true, var62[var63], (byte) -74, false);
                                    }
                                }
                            }
                            class92.method678("<col=ff9040>" + var60.field3655, var26.field814, 1009, -1, var26.field820, (long) var59.field216, class299.field4461, true, class9.field156.method42(class666.field9377, 19572), (byte) -74, class253.field3576.field520 != var26.field813);
                            class299.field4463++;
                        }
                    }
                }
                if (var26.field817 instanceof class147) {
                    class147 var66 = (class147) var26.field817;
                    class620 var67 = class164.field2499.method2013(var66.method554(-18971), false);
                    if (var67.field8623 != null) {
                        var67 = var67.method3450(arg3 ^ 0x69, class195.field2888);
                    }
                    if (var67 != null) {
                        if (class457.field6455 && class253.field3576.field520 == var26.field813) {
                            class374 var68 = class36.field449 == -1 ? null : class324.field4784.method2171((byte) -80, class36.field449);
                            if ((class414.field5858 & 0x4) != 0 && (var68 == null || var67.method3461(class36.field449, -1, var68.field5300) != var68.field5300)) {
                                class83.field1159++;
                                class92.method678(class73.field1010 + " -> <col=00ffff>" + var67.field8628, var26.field814, 18, -1, var26.field820, class540.method2978(var26.field814, var66, var26.field820, (byte) -113), class561.field7575, true, class281.field3927, (byte) -74, false);
                            }
                        }
                        if (class253.field3576.field520 == var26.field813) {
                            String[] var69 = var67.field8575;
                            if (var69 != null) {
                                for (int var70 = 4; var70 >= 0; var70--) {
                                    if (var69[var70] != null) {
                                        short var71 = 0;
                                        int var72 = class258.field3691;
                                        if (var70 == 0) {
                                            var71 = 45;
                                        }
                                        if (var70 == 1) {
                                            var71 = 13;
                                        }
                                        if (var70 == 2) {
                                            var71 = 20;
                                        }
                                        if (var70 == 3) {
                                            var71 = 47;
                                        }
                                        if (var67.field8580 == var70) {
                                            var72 = var67.field8597;
                                        }
                                        if (var70 == 4) {
                                            var71 = 1008;
                                        }
                                        if (var67.field8637 == var70) {
                                            var72 = var67.field8624;
                                        }
                                        class92.method678("<col=00ffff>" + var67.field8628, var26.field814, var71, -1, var26.field820, class540.method2978(var26.field814, var66, var26.field820, (byte) -124), var72, true, var69[var70], (byte) -74, false);
                                        class72.field994++;
                                    }
                                }
                            }
                        }
                        class175.field2609++;
                        class92.method678("<col=00ffff>" + var67.field8628, var26.field814, 1007, -1, var26.field820, (long) var67.field8621, class299.field4461, true, class9.field156.method42(class666.field9377, 19572), (byte) -74, class253.field3576.field520 != var26.field813);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)Ljava/io/File;")
    private final File method2331(byte arg0) {
        int var2 = 33 % ((-arg0 - 5) / 51);
        field5765++;
        return this.field5772.method878(0);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B[B)V")
    public final void method2332(byte arg0, byte[] arg1) throws IOException {
        if (arg0 == -60) {
            this.method2334(arg1, -124, 0, arg1.length);
            field5764++;
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)J")
    public final long method2333(int arg0) {
        field5762++;
        if (arg0 != -1) {
            this.field5772 = null;
        }
        return this.field5769;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "([BIII)V")
    public final void method2334(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5758++;
        try {
            if (arg0.length < (arg2 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (arg1 > -111) {
                return;
            }
            if (this.field5756 != -1L && this.field5756 <= this.field5771 && (long) arg3 + this.field5771 <= this.field5756 - -((long) this.field5759)) {
                class282.method1706(this.field5767, (int) (this.field5771 - this.field5756), arg0, arg2, arg3);
                this.field5771 += arg3;
                return;
            }
            long var5 = this.field5771;
            int var7 = arg2;
            int var8 = arg3;
            if (this.field5771 >= this.field5760 && this.field5771 < (long) this.field5768 + this.field5760) {
                int var9 = (int) ((long) this.field5768 + this.field5760 - this.field5771);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class282.method1706(this.field5770, (int) (this.field5771 - this.field5760), arg0, arg2, var9);
                this.field5771 += var9;
                arg2 += var9;
                arg3 -= var9;
            }
            if (this.field5770.length < arg3) {
                this.field5772.method883(this.field5771, (byte) 125);
                this.field5763 = this.field5771;
                while (arg3 > 0) {
                    int var11 = this.field5772.method884((byte) -40, arg2, arg3, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 += var11;
                    this.field5763 += var11;
                    this.field5771 += var11;
                    arg3 -= var11;
                }
            } else if (arg3 > 0) {
                this.method2328(-1242767576);
                int var10 = arg3;
                if (this.field5768 < arg3) {
                    var10 = this.field5768;
                }
                class282.method1706(this.field5770, 0, arg0, arg2, var10);
                this.field5771 += var10;
                arg3 -= var10;
                arg2 += var10;
            }
            if (this.field5756 != -1L) {
                if (this.field5756 > this.field5771 && arg3 > 0) {
                    int var12 = arg2 + ((int) (this.field5756 - this.field5771));
                    if (var12 > arg2 + arg3) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg2) {
                        arg0[arg2++] = 0;
                        arg3--;
                        this.field5771++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field5756 && var5 + ((long) var8) > this.field5756) {
                    var13 = this.field5756;
                } else if (var5 >= this.field5756 && (long) this.field5759 + this.field5756 > var5) {
                    var13 = var5;
                }
                if (var5 < (long) this.field5759 + this.field5756 && (var5 + ((long) var8)) >= ((long) this.field5759 + this.field5756)) {
                    var15 = this.field5756 + ((long) this.field5759);
                } else if (this.field5756 < var5 + ((long) var8) && ((long) this.field5759 + this.field5756) >= ((long) var8 + var5)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class282.method1706(this.field5767, (int) (var13 - this.field5756), arg0, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field5771) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field5771));
                        this.field5771 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5763 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Ljr;I)V")
    public static final void method2335(class96 arg0, int arg1) {
        field5774++;
        int var2 = arg0.method733((byte) 121);
        class545.field7383 = new class621[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class545.field7383[var3] = new class621();
            class545.field7383[var3].field8653 = arg0.method733((byte) 99);
            class545.field7383[var3].field8654 = arg0.method698(3);
        }
        class535.field7286 = arg0.method733((byte) 91);
        class271.field3830 = arg0.method733((byte) 110);
        class455.field6351 = arg0.method733((byte) 122);
        class558.field7545 = new class233[class271.field3830 - (class535.field7286 - 1)];
        if (arg1 != 7016) {
            method2330(-102, -124, null, -52);
        }
        for (int var4 = 0; var4 < class455.field6351; var4++) {
            int var5 = arg0.method733((byte) 95);
            class233 var6 = class558.field7545[var5] = new class233();
            var6.field1953 = arg0.method718(81);
            var6.field1952 = arg0.method714(false);
            var6.field3304 = class535.field7286 + var5;
            var6.field3313 = arg0.method698(arg1 - 7013);
            var6.field3308 = arg0.method698(3);
        }
        class440.field6204 = arg0.method714(false);
        class206.field3049 = true;
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)V")
    public final void method2336(int arg0) throws IOException {
        field5755++;
        this.method2338((byte) 47);
        this.field5772.method886(true);
        int var2 = -110 / ((arg0 + 72) / 33);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IJ)V")
    public final void method2337(int arg0, long arg1) throws IOException {
        field5775++;
        if (arg1 < (long) arg0) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2331((byte) 100));
        }
        this.field5771 = arg1;
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(B)V")
    private final void method2338(byte arg0) throws IOException {
        if (this.field5756 != -1L) {
            if (this.field5763 != this.field5756) {
                this.field5772.method883(this.field5756, (byte) 111);
                this.field5763 = this.field5756;
            }
            this.field5772.method880(this.field5767, 1, 0, this.field5759);
            this.field5763 += this.field5759;
            if (this.field5761 < this.field5763) {
                this.field5761 = this.field5763;
            }
            long var2 = -1L;
            if (this.field5760 <= this.field5756 && this.field5756 < ((long) this.field5768 + this.field5760)) {
                var2 = this.field5756;
            } else if (this.field5756 <= this.field5760 && this.field5760 < (long) this.field5759 + this.field5756) {
                var2 = this.field5760;
            }
            long var4 = -1L;
            if (this.field5760 < this.field5756 + ((long) this.field5759) && (long) this.field5768 + this.field5760 >= (long) this.field5759 + this.field5756) {
                var4 = (long) this.field5759 + this.field5756;
            } else if ((long) this.field5768 + this.field5760 > this.field5756 && (long) this.field5759 + this.field5756 >= this.field5760 - -((long) this.field5768)) {
                var4 = this.field5760 + ((long) this.field5768);
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class282.method1706(this.field5767, (int) (var2 - this.field5756), this.field5770, (int) (var2 - this.field5760), var6);
            }
            this.field5759 = 0;
            this.field5756 = -1L;
        }
        if (arg0 != 47) {
            this.field5756 = -35L;
        }
        field5754++;
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lfn;II)V")
    public class408(class124 arg0, int arg1, int arg2) throws IOException {
        this.field5772 = arg0;
        this.field5769 = this.field5761 = arg0.method882(-113);
        this.field5770 = new byte[arg1];
        this.field5767 = new byte[arg2];
        this.field5771 = 0L;
    }
}
