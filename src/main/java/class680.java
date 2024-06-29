import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class680 {

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    private int field9600 = -1;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    private int field9604 = 0;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lwba;")
    private class46 field9598 = new class46();

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Z")
    public boolean field9606 = false;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    private int field9603;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    private int field9597;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "[[[I")
    private int[][][] field9594;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "[Lkn;")
    private class688[] field9596;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field9605 = 0;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field9595;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field9602;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)[[[I", line = 4)
    public final int[][][] method3767(int arg0) {
        field9602++;
        if (this.field9603 != this.field9597) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 12 % ((arg0 - 1) / 63);
        for (int var3 = 0; var3 < this.field9603; var3++) {
            this.field9596[var3] = class135.field1982;
        }
        return this.field9594;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 26)
    public final void method3768(int arg0) {
        if (arg0 != -1) {
            method3770(112, -110, -103, null);
        }
        for (int var2 = 0; var2 < this.field9603; var2++) {
            this.field9594[var2][0] = null;
            this.field9594[var2][1] = null;
            this.field9594[var2][2] = null;
            this.field9594[var2] = null;
        }
        field9601++;
        this.field9594 = null;
        this.field9596 = null;
        this.field9598.method475(arg0 + 7);
        this.field9598 = null;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(III)V", line = 633)
    public class680(int arg0, int arg1, int arg2) {
        this.field9603 = arg0;
        this.field9597 = arg1;
        this.field9594 = new int[this.field9603][3][arg2];
        this.field9596 = new class688[this.field9597];
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[[I", line = 62)
    public final int[][] method3769(int arg0, int arg1) {
        if (arg1 != -26435) {
            field9605 = -68;
        }
        field9595++;
        if (this.field9603 == this.field9597) {
            this.field9606 = this.field9596[arg0] == null;
            this.field9596[arg0] = class135.field1982;
            return this.field9594[arg0];
        } else if (this.field9603 == 1) {
            this.field9606 = this.field9600 != arg0;
            this.field9600 = arg0;
            return this.field9594[0];
        } else {
            class688 var3 = this.field9596[arg0];
            if (var3 == null) {
                this.field9606 = true;
                if (this.field9604 >= this.field9603) {
                    class688 var4 = (class688) this.field9598.method471(0);
                    var3 = new class688(arg0, var4.field9684);
                    this.field9596[var4.field9691] = null;
                    var4.method3678(-1);
                } else {
                    var3 = new class688(arg0, this.field9604);
                    this.field9604++;
                }
                this.field9596[arg0] = var3;
            } else {
                this.field9606 = false;
            }
            this.field9598.method479((byte) -127, var3);
            return this.field9594[var3.field9684];
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIILr;)V", line = 129)
    public static final void method3770(int arg0, int arg1, int arg2, class166 arg3) {
        field9599++;
        if (arg1 < 0 || arg2 < 0 || class129.field1913 == 0 || class271.field4087 == 0) {
            return;
        }
        arg3.method184(class436.field6381, class621.field8660, class129.field1913, class271.field4087);
        arg3.method168(class294.field4327, class331.field4894, class129.field1913, class271.field4087);
        if (arg0 != 567050408) {
            method3770(-98, -33, 90, null);
        }
        class391 var4 = arg3.method100();
        var4.method240(class68.field1239, class24.field328, class66.field1224, class690.field9711, class520.field7324, class162.field2326);
        arg3.method155(var4);
        if (class420.field6108 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg3.method110();
            int var8 = (arg1 - class436.field6381) * var7 / class129.field1913;
            int var9 = (arg2 - class621.field8660) * var7 / class271.field4087;
            int var10 = arg3.method115();
            int var11 = (arg1 - class436.field6381) * var10 / class129.field1913;
            int var12 = (arg2 - class621.field8660) * var10 / class271.field4087;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method236(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method236(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 9;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 9;
                if (var20 > 0 && var22 > 0 && var20 < class199.field2812 && class232.field3611 > var22) {
                    int var23 = class648.field9106.field3019;
                    if (var23 < 3 && (class672.field9500[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class420.field6108[var23].method442(var19, true, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class648.field9106.method2553((byte) 97) - 1 << 8) + var19 >> 9;
                        var6 = var21 + (class648.field9106.method2553((byte) 103) - 1 << 8) >> 9;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class245.field3797 && (class435.field6357 & 0x40) != 0) {
                    class49 var24 = class639.method3557(class19.field223, class189.field2716, arg0 ^ 0x21CC80A9);
                    if (var24 == null) {
                        class272.method1794(103);
                    } else {
                        class605.method3404(var5, " ->", var6, true, 10, -1, false, -67, class484.field6876, 0L, class331.field4896);
                    }
                } else {
                    if (class673.field9519 == class586.field8208) {
                        class605.method3404(var5, "", var6, true, 2, -1, false, arg0 - 567050525, -1, 0L, class274.field4143.method1804(arg0 - 567043233, class512.field7203));
                    }
                    class605.method3404(var5, "", var6, true, 48, -1, false, arg0 ^ 0xDE337F6F, class696.field9826, 0L, class264.field4011);
                    class552.field7827++;
                }
            }
        }
        class392 var25 = class380.field5378;
        for (class549 var26 = (class549) var25.method2417(false); var26 != null; var26 = (class549) var25.method2414(true)) {
            if ((class164.field2359 || class648.field9106.field3019 == var26.field7712.field3019) && var26.method3106(arg1, arg3, (byte) -120, arg2)) {
                boolean var27 = false;
                boolean var28 = false;
                int var29;
                int var30;
                if ((var26.field7712 instanceof class454)) {
                    var29 = ((class454) var26.field7712).field6524;
                    var30 = ((class454) var26.field7712).field6521;
                } else {
                    var29 = var26.field7712.field3024 >> 9;
                    var30 = var26.field7712.field3029 >> 9;
                }
                if (var26.field7712 instanceof class491) {
                    class491 var31 = (class491) var26.field7712;
                    int var32 = var31.method2553((byte) 77);
                    if ((var32 & 0x1) == 0 && (var31.field3024 & 0x1FF) == 0 && (var31.field3029 & 0x1FF) == 0 || (var32 & 0x1) == 1 && (var31.field3024 & 0x1FF) == 256 && (var31.field3029 & 0x1FF) == 256) {
                        int var33 = var31.field3024 - (var31.method2553((byte) 82) - 1 << 8);
                        int var34 = var31.field3029 - (var31.method2553((byte) 127) - 1 << 8);
                        for (int var35 = 0; var35 < class217.field3042; var35++) {
                            class16 var42 = (class16) class189.field2723.method1405((long) class85.field1396[var35], (byte) -127);
                            if (var42 != null) {
                                class577 var43 = var42.field174;
                                if (class564.field7962 != var43.field6242 && var43.field6186) {
                                    int var44 = var43.field3024 - (var43.field8121.field8345 - 1 << 8);
                                    int var45 = var43.field3029 - (var43.field8121.field8345 - 1 << 8);
                                    if (var33 <= var44 && var43.field8121.field8345 <= var31.method2553((byte) 92) - (var44 - var33 >> 9) && var34 <= var45 && var43.field8121.field8345 <= (var31.method2553((byte) 74) - (var45 - var34 >> 9))) {
                                        class333.method2102(class648.field9106.field3019 != var26.field7712.field3019, var43, (byte) 68);
                                        var43.field6242 = class564.field7962;
                                    }
                                }
                            }
                        }
                        int var36 = class7.field65;
                        int[] var37 = class629.field8801;
                        for (int var38 = 0; var38 < var36; var38++) {
                            class491 var39 = class141.field2087[var37[var38]];
                            if (var39 != null && class564.field7962 != var39.field6242 && var31 != var39 && var39.field6186) {
                                int var40 = var39.field3024 - (var39.method2553((byte) 123) - 1 << 8);
                                int var41 = var39.field3029 - (var39.method2553((byte) 114) - 1 << 8);
                                if (var40 >= var33 && var39.method2553((byte) 106) <= var31.method2553((byte) 98) - (var40 - var33 >> 9) && var41 >= var34 && var39.method2553((byte) 111) <= (var31.method2553((byte) 74) - (var41 - var34 >> 9))) {
                                    class696.method3885(class648.field9106.field3019 != var26.field7712.field3019, (byte) 75, var39);
                                    var39.field6242 = class564.field7962;
                                }
                            }
                        }
                    }
                    if (class564.field7962 == var31.field6242) {
                        continue;
                    }
                    class696.method3885(class648.field9106.field3019 != var26.field7712.field3019, (byte) 75, var31);
                    var31.field6242 = class564.field7962;
                }
                if (var26.field7712 instanceof class577) {
                    class577 var46 = (class577) var26.field7712;
                    if (var46.field8121 != null) {
                        if ((var46.field8121.field8345 & 0x1) == 0 && (var46.field3024 & 0x1FF) == 0 && (var46.field3029 & 0x1FF) == 0 || (var46.field8121.field8345 & 0x1) == 1 && (var46.field3024 & 0x1FF) == 256 && (var46.field3029 & 0x1FF) == 256) {
                            int var47 = var46.field3024 - (var46.field8121.field8345 - 1 << 8);
                            int var48 = var46.field3029 - (var46.field8121.field8345 - 1 << 8);
                            for (int var49 = 0; var49 < class217.field3042; var49++) {
                                class16 var56 = (class16) class189.field2723.method1405((long) class85.field1396[var49], (byte) -95);
                                if (var56 != null) {
                                    class577 var57 = var56.field174;
                                    if (class564.field7962 != var57.field6242 && var46 != var57 && var57.field6186) {
                                        int var58 = var57.field3024 - (var57.field8121.field8345 - 1 << 8);
                                        int var59 = var57.field3029 - (var57.field8121.field8345 - 1 << 8);
                                        if (var47 <= var58 && var46.field8121.field8345 - (var58 - var47 >> 9) >= var57.field8121.field8345 && var59 >= var48 && var57.field8121.field8345 <= var46.field8121.field8345 - (var59 - var48 >> 9)) {
                                            class333.method2102(class648.field9106.field3019 != var26.field7712.field3019, var57, (byte) -64);
                                            var57.field6242 = class564.field7962;
                                        }
                                    }
                                }
                            }
                            int var50 = class7.field65;
                            int[] var51 = class629.field8801;
                            for (int var52 = 0; var52 < var50; var52++) {
                                class491 var53 = class141.field2087[var51[var52]];
                                if (var53 != null && class564.field7962 != var53.field6242 && var53.field6186) {
                                    int var54 = var53.field3024 - (var53.method2553((byte) 125) - 1 << 8);
                                    int var55 = var53.field3029 - (var53.method2553((byte) 78) - 1 << 8);
                                    if (var54 >= var47 && var53.method2553((byte) 112) <= (var46.field8121.field8345 - (var54 - var47 >> 9)) && var48 <= var55 && var53.method2553((byte) 75) <= (var46.field8121.field8345 - (var55 - var48 >> 9))) {
                                        class696.method3885(class648.field9106.field3019 != var26.field7712.field3019, (byte) 75, var53);
                                        var53.field6242 = class564.field7962;
                                    }
                                }
                            }
                        }
                        if (class564.field7962 == var46.field6242) {
                            continue;
                        }
                        class333.method2102(class648.field9106.field3019 != var26.field7712.field3019, var46, (byte) -116);
                        var46.field6242 = class564.field7962;
                    }
                }
                if (var26.field7712 instanceof class533) {
                    int var60 = class109.field1672 + var29;
                    int var61 = var30 + class203.field2874;
                    class44 var62 = (class44) class22.field296.method1405((long) (var60 | var26.field7712.field3019 << 28 | var61 << 14), (byte) -117);
                    if (var62 != null) {
                        for (class370 var63 = (class370) var62.field705.method471(arg0 - 567050408); var63 != null; var63 = (class370) var62.field705.method476(9397)) {
                            class186 var64 = class41.field682.method2228(var63.field5279, 0);
                            if (class245.field3797 && class648.field9106.field3019 == var26.field7712.field3019) {
                                class262 var65 = class642.field9054 == -1 ? null : class329.field4869.method3552(class642.field9054, -19);
                                if ((class435.field6357 & 0x1) != 0 && (var65 == null || var64.method1246(class642.field9054, var65.field3986, (byte) 20) != var65.field3986)) {
                                    class605.method3404(var29, class338.field4988 + " -> <col=ff9040>" + var64.field2629, var30, true, 3, -1, false, -16, class484.field6876, (long) var63.field5279, class331.field4896);
                                    class595.field8421++;
                                }
                            }
                            if (class648.field9106.field3019 == var26.field7712.field3019) {
                                String[] var66 = var64.field2642;
                                for (int var67 = 4; var67 >= 0; var67--) {
                                    if (var66 != null && var66[var67] != null) {
                                        byte var68 = 0;
                                        if (var67 == 0) {
                                            var68 = 18;
                                        }
                                        int var69 = class102.field1607;
                                        if (var67 == 1) {
                                            var68 = 20;
                                        }
                                        if (var67 == 2) {
                                            var68 = 12;
                                        }
                                        if (var67 == 3) {
                                            var68 = 17;
                                        }
                                        if (var64.field2665 == var67) {
                                            var69 = var64.field2620;
                                        }
                                        if (var67 == 4) {
                                            var68 = 8;
                                        }
                                        if (var64.field2619 == var67) {
                                            var69 = var64.field2652;
                                        }
                                        class605.method3404(var29, "<col=ff9040>" + var64.field2629, var30, true, var68, -1, false, arg0 ^ 0xDE337F06, var69, (long) var63.field5279, var66[var67]);
                                        class44.field707++;
                                    }
                                }
                            }
                            class126.field1885++;
                            class605.method3404(var29, "<col=ff9040>" + var64.field2629, var30, true, 1006, -1, class648.field9106.field3019 != var26.field7712.field3019, arg0 ^ 0xDE337F67, class231.field3602, (long) var63.field5279, class274.field4138.method1804(7175, class512.field7203));
                        }
                    }
                }
                if (var26.field7712 instanceof class614) {
                    class614 var70 = (class614) var26.field7712;
                    class550 var71 = class101.field1572.method2617((byte) -127, var70.method1179(true));
                    if (var71.field7781 != null) {
                        var71 = var71.method3124((byte) -85, class61.field1163);
                    }
                    if (var71 != null) {
                        if (class245.field3797 && class648.field9106.field3019 == var26.field7712.field3019) {
                            class262 var72 = class642.field9054 == -1 ? null : class329.field4869.method3552(class642.field9054, -22);
                            if ((class435.field6357 & 0x4) != 0 && (var72 == null || var71.method3116(false, var72.field3986, class642.field9054) != var72.field3986)) {
                                class605.method3404(var29, class338.field4988 + " -> <col=00ffff>" + var71.field7771, var30, true, 6, -1, false, arg0 - 567050464, class484.field6876, class519.method2965(var30, var70, var29, (byte) -107), class331.field4896);
                                class485.field6884++;
                            }
                        }
                        if (class648.field9106.field3019 == var26.field7712.field3019) {
                            String[] var73 = var71.field7793;
                            if (var73 != null) {
                                for (int var74 = 4; var74 >= 0; var74--) {
                                    if (var73[var74] != null) {
                                        short var75 = 0;
                                        if (var74 == 0) {
                                            var75 = 4;
                                        }
                                        int var76 = class102.field1607;
                                        if (var74 == 1) {
                                            var75 = 46;
                                        }
                                        if (var74 == 2) {
                                            var75 = 11;
                                        }
                                        if (var74 == 3) {
                                            var75 = 16;
                                        }
                                        if (var74 == 4) {
                                            var75 = 1009;
                                        }
                                        if (var71.field7801 == var74) {
                                            var76 = var71.field7751;
                                        }
                                        if (var71.field7770 == var74) {
                                            var76 = var71.field7730;
                                        }
                                        class605.method3404(var29, "<col=00ffff>" + var71.field7771, var30, true, var75, -1, false, -106, var76, class519.method2965(var30, var70, var29, (byte) -110), var73[var74]);
                                        class87.field1416++;
                                    }
                                }
                            }
                        }
                        class605.method3404(var29, "<col=00ffff>" + var71.field7771, var30, true, 1001, -1, class648.field9106.field3019 != var26.field7712.field3019, -37, class231.field3602, (long) var71.field7783, class274.field4138.method1804(7175, class512.field7203));
                        class521.field7338++;
                    }
                }
            }
        }
    }
}
