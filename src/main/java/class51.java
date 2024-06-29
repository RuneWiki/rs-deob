import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class51 extends class256 {

    @OriginalMember(owner = "client!lj", name = "ec", descriptor = "I")
    public int field725 = -1;

    @OriginalMember(owner = "client!lj", name = "Zb", descriptor = "I")
    public int field720 = 0;

    @OriginalMember(owner = "client!lj", name = "bc", descriptor = "Z")
    public boolean field722 = false;

    @OriginalMember(owner = "client!lj", name = "nc", descriptor = "I")
    public int field734 = -1;

    @OriginalMember(owner = "client!lj", name = "cc", descriptor = "I")
    public int field723 = 0;

    @OriginalMember(owner = "client!lj", name = "vc", descriptor = "I")
    public int field742 = 0;

    @OriginalMember(owner = "client!lj", name = "ic", descriptor = "I")
    public int field729 = 0;

    @OriginalMember(owner = "client!lj", name = "yc", descriptor = "I")
    public int field745 = -1;

    @OriginalMember(owner = "client!lj", name = "sc", descriptor = "I")
    public int field739 = -1;

    @OriginalMember(owner = "client!lj", name = "uc", descriptor = "S")
    private short field741 = 0;

    @OriginalMember(owner = "client!lj", name = "Gc", descriptor = "I")
    public int field753 = 0;

    @OriginalMember(owner = "client!lj", name = "Ic", descriptor = "S")
    private short field755 = 0;

    @OriginalMember(owner = "client!lj", name = "pc", descriptor = "I")
    public int field736 = -1;

    @OriginalMember(owner = "client!lj", name = "Jc", descriptor = "I")
    private int field756 = 0;

    @OriginalMember(owner = "client!lj", name = "jc", descriptor = "I")
    public int field730 = 0;

    @OriginalMember(owner = "client!lj", name = "Cc", descriptor = "I")
    public int field749 = -1;

    @OriginalMember(owner = "client!lj", name = "lc", descriptor = "I")
    public int field732 = 0;

    @OriginalMember(owner = "client!lj", name = "Fc", descriptor = "[Lsf;")
    public static class108[] field752 = new class108[100];

    @OriginalMember(owner = "client!lj", name = "dc", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!lj", name = "fc", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!lj", name = "gc", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "client!lj", name = "hc", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!lj", name = "kc", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!lj", name = "mc", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!lj", name = "oc", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!lj", name = "qc", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!lj", name = "rc", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!lj", name = "wc", descriptor = "I")
    public int field743;

    @OriginalMember(owner = "client!lj", name = "xc", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!lj", name = "Ac", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!lj", name = "Bc", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!lj", name = "Dc", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!lj", name = "Ec", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!lj", name = "Hc", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!lj", name = "Lc", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!lj", name = "Mc", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!lj", name = "Nc", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!lj", name = "Kc", descriptor = "Lsf;")
    public class108 field757;

    @OriginalMember(owner = "client!lj", name = "zc", descriptor = "Lke;")
    public class113 field746;

    @OriginalMember(owner = "client!lj", name = "ac", descriptor = "Ljm;")
    public class240 field721;

    @OriginalMember(owner = "client!lj", name = "tc", descriptor = "[Lt;")
    public static class257[] field740;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()I", line = 5)
    public final int method95() {
        field731++;
        return this.field4488;
    }

    @OriginalMember(owner = "client!lj", name = "finalize", descriptor = "()V", line = 21)
    protected final void finalize() {
        if (this.field4468 != null) {
            this.field4468.method1158();
        }
        field737++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIII)V", line = 38)
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field754++;
        if (!this.field4481) {
            if (this.field721 == null) {
                return;
            }
            class272 var6 = this.field4492 != -1 && this.field4521 == 0 ? class149.method1063(this.field4492, -18767) : null;
            class272 var7 = this.field4472 == -1 || this.field722 || this.field4472 == this.field4455 && var6 != null ? null : class149.method1063(this.field4472, -18767);
            class113 var8 = this.field721.method1666(var7, this.field4453, -1, false, this.field4499, var6);
            if (var8 == null) {
                return;
            }
            this.method1811(16705, var8);
        }
        if (this.field4468 != null) {
            this.field4468.method1157(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)Lsf;", line = 77)
    public final class108 method359(int arg0) {
        class108 var2 = this.field757;
        if (class242.field4222 != null) {
            var2 = class117.method833(new class108[] { class242.field4222[this.field756], var2 }, false);
        }
        if (arg0 != 12) {
            this.method363((byte) 86);
        }
        field748++;
        if (class271.field4736 != null) {
            var2 = class117.method833(new class108[] { var2, class271.field4736[this.field756] }, false);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V", line = 100)
    public static void method360(int arg0) {
        field752 = null;
        if (arg0 != 100) {
            method364(46);
        }
        field740 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lrm;I)V", line = 128)
    public final void method361(class249 arg0, int arg1) {
        arg0.field4314 = 0;
        field759++;
        int var3 = arg0.method1731(true);
        if ((var3 & 0x2) == 2) {
            this.field755 = (short) (arg0.method1731(true) << 2);
            this.field741 = (short) (arg0.method1731(true) << 2);
        } else {
            this.field755 = 0;
            this.field741 = 0;
        }
        if (arg1 != 60723746) {
            this.method365(93, 98, 111, (class165) null, -98, 97, -53, 23, 17, -88, 63, (class113) null, -35, -51, -90);
        }
        int var4 = var3 & 0x1;
        int var5 = -1;
        int var6 = super.method363((byte) 73);
        boolean var7 = (var3 & 0x4) != 0;
        this.method1810(((var3 & 0x3F) >> 3) + 1, -122);
        this.field756 = (var3 & 0xEF) >> 6;
        this.field4452 += (this.method363((byte) 84) - var6) * 64;
        this.field4457 += (this.method363((byte) -56) - var6) * 64;
        this.field734 = arg0.method1721((byte) 102);
        this.field749 = arg0.method1721((byte) 41);
        int[] var8 = new int[12];
        this.field723 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg0.method1731(true);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method1731(true);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var5 = arg0.method1712(-1);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class196.field3543[var12 - 32768];
                    var8[var9] = class242.method1674(1073741824, var13);
                    int var14 = class144.method994(true, var13).field2563;
                    if (var14 != 0) {
                        this.field723 = var14;
                    }
                } else {
                    var8[var9] = class242.method1674(var12 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg0.method1731(true);
            if (var17 < 0 || class215.field3819[var16].length <= var17) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field4455 = arg0.method1712(arg1 - 60723747);
        if (this.field4455 == 65535) {
            this.field4455 = -1;
        }
        this.field4496 = arg0.method1712(arg1 - 60723747);
        if (this.field4496 == 65535) {
            this.field4496 = -1;
        }
        this.field4465 = this.field4496;
        this.field4449 = arg0.method1712(-1);
        if (this.field4449 == 65535) {
            this.field4449 = -1;
        }
        this.field4470 = arg0.method1712(-1);
        if (this.field4470 == 65535) {
            this.field4470 = -1;
        }
        this.field4490 = arg0.method1712(arg1 ^ 0xFC616DDD);
        if (this.field4490 == 65535) {
            this.field4490 = -1;
        }
        this.field4497 = arg0.method1712(-1);
        if (this.field4497 == 65535) {
            this.field4497 = -1;
        }
        this.field4483 = arg0.method1712(-1);
        if (this.field4483 == 65535) {
            this.field4483 = -1;
        }
        long var18 = arg0.method1764((byte) -116);
        this.field757 = class330.method2259((byte) -103, var18).method755(8975);
        this.field720 = arg0.method1731(true);
        if (var7) {
            this.field732 = arg0.method1712(-1);
            this.field730 = this.field720;
            this.field736 = -1;
        } else {
            this.field732 = 0;
            this.field730 = arg0.method1731(true);
            this.field736 = arg0.method1731(true);
            if (this.field736 == 255) {
                this.field736 = -1;
            }
        }
        int var20 = this.field753;
        this.field753 = arg0.method1731(true);
        if (this.field753 == 0) {
            class274.method1982((byte) -90, this);
        } else {
            int var21 = this.field725;
            int var22 = this.field745;
            int var23 = this.field739;
            this.field725 = arg0.method1712(-1);
            this.field739 = arg0.method1712(-1);
            this.field745 = arg0.method1712(-1);
            if (this.field753 != var20 || this.field725 != var21 || this.field739 != var23 || this.field745 != var22) {
                class157.method1094(true, this);
            }
        }
        if (this.field721 == null) {
            this.field721 = new class240();
        }
        int var24 = this.field721.field4181;
        this.field721.method1659(Integer.MIN_VALUE, var5, var8, var4 == 1, var15);
        if (var5 != var24) {
            this.field4452 = this.field4498[0] * 128 + (this.method363((byte) 71) * 64);
            this.field4457 = this.field4482[0] * 128 + (this.method363((byte) -81) * 64);
        }
        if (this.field4468 != null) {
            this.field4468.method1155();
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZII)V", line = 321)
    public final void method362(int arg0, boolean arg1, int arg2, int arg3) {
        super.method1804(arg2, arg1, arg3, this.method363((byte) -64), 16852);
        if (arg0 != -17550) {
            this.field733 = -92;
        }
        field760++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)I", line = 350)
    public final int method363(byte arg0) {
        field728++;
        int var2 = -59 / ((arg0 - 8) / 38);
        return this.field721 == null || this.field721.field4181 == -1 ? super.method363((byte) -77) : class57.method397(0, this.field721.field4181).field2381;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIIIJILac;)V", line = 379)
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class165 arg10) {
        field744++;
        if (this.field721 == null) {
            return;
        }
        class272 var13 = this.field4492 != -1 && this.field4521 == 0 ? class149.method1063(this.field4492, -18767) : null;
        class272 var14 = this.field4472 == -1 || this.field722 || this.field4472 == this.field4455 && var13 != null ? null : class149.method1063(this.field4472, -18767);
        class113 var15 = this.field721.method1666(var14, this.field4453, -1, true, this.field4499, var13);
        int var16 = class29.method208(0);
        if (class231.field4051 && class88.field1398 < 96 && var16 > 50) {
            class315.method2193(99);
        }
        if (class96.field1532 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (var17 > class169.field3034) {
                class274.field4822[class169.field3034] = new byte[102400];
                class169.field3034++;
            }
            while (class169.field3034 > var17) {
                class169.field3034--;
                class274.field4822[class169.field3034] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field4488 = var15.method95();
        if (class180.field3280 && (this.field721.field4181 == -1 || class57.method397(0, this.field721.field4181).field2374)) {
            class113 var18 = class64.method441(arg0, -1153, this.field4457, 0, this.field4479, var15, 160, var14 == null ? this.field4453 : this.field4499, var14 == null ? var13 : var14, this.field4464, 240, 0, 1, this.field4452);
            if (class231.field4051) {
                float var19 = class231.method1592();
                float var20 = class231.method1575();
                class231.method1591();
                class231.method1593(var19, var20 - 150.0F);
                var18.method98(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class165) null);
                class231.method1570();
                class231.method1593(var19, var20);
            } else {
                var18.method98(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class165) null);
            }
        }
        if (class95.field1513 == this) {
            for (int var21 = class121.field2075.length - 1; var21 >= 0; var21--) {
                class295 var22 = class121.field2075[var21];
                if (var22 != null && var22.field5145 != -1) {
                    if (var22.field5146 == 1 && var22.field5139 >= 0 && class159.field2863.length > var22.field5139) {
                        class45 var23 = class159.field2863[var22.field5139];
                        if (var23 != null) {
                            int var24 = var23.field4457 / 32 - (class95.field1513.field4457 / 32);
                            int var25 = var23.field4452 / 32 - (class95.field1513.field4452 / 32);
                            this.method365(arg4, arg6, var25, (class165) null, arg3, arg9, -24769, arg5, arg1, arg7, var24, var15, var22.field5145, arg2, arg0);
                        }
                    }
                    if (var22.field5146 == 2) {
                        int var26 = (var22.field5141 - class137.field2421) * 4 + 2 - class95.field1513.field4457 / 32;
                        int var27 = (var22.field5148 - class305.field5295) * 4 + 2 - (class95.field1513.field4452 / 32);
                        this.method365(arg4, arg6, var27, (class165) null, arg3, arg9, -24769, arg5, arg1, arg7, var26, var15, var22.field5145, arg2, arg0);
                    }
                    if (var22.field5146 == 10 && var22.field5139 >= 0 && var22.field5139 < class96.field1558.length) {
                        class51 var28 = class96.field1558[var22.field5139];
                        if (var28 != null) {
                            int var29 = var28.field4452 / 32 - (class95.field1513.field4452 / 32);
                            int var30 = var28.field4457 / 32 - (class95.field1513.field4457 / 32);
                            this.method365(arg4, arg6, var29, (class165) null, arg3, arg9, -24769, arg5, arg1, arg7, var30, var15, var22.field5145, arg2, arg0);
                        }
                    }
                }
            }
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        if (this.field755 != 0 && this.field741 != 0) {
            short var34 = this.field755;
            int var35 = class263.field4649[arg0];
            short var36 = this.field741;
            int var37 = class263.field4653[arg0];
            int var38 = -var34 / 2;
            int var39 = -var36 / 2;
            int var40 = var35 * var38 + var37 * var39 >> 16;
            int var41 = var35 * var39 - (var37 * var38) >> 16;
            int var42 = class45.method321(111, this.field4457 + var41, this.field4452 + var40, class295.field5159);
            int var43 = -var36 / 2;
            int var44 = var34 / 2;
            int var45 = var35 * var44 + var37 * var43 >> 16;
            int var46 = var35 * var43 - (var37 * var44) >> 16;
            int var47 = -var34 / 2;
            int var48 = var34 / 2;
            int var49 = class45.method321(115, this.field4457 + var46, this.field4452 + var45, class295.field5159);
            int var50 = var36 / 2;
            int var51 = var35 * var47 + var37 * var50 >> 16;
            int var52 = var36 / 2;
            int var53 = var35 * var50 - var37 * var47 >> 16;
            int var54 = var35 * var48 + var37 * var52 >> 16;
            int var55 = class45.method321(-49, this.field4457 + var53, this.field4452 + var51, class295.field5159);
            int var56 = var35 * var52 - (var37 * var48) >> 16;
            int var57 = class45.method321(-48, this.field4457 + var56, this.field4452 + var54, class295.field5159);
            int var58 = var49 > var42 ? var42 : var49;
            int var59 = var42 + var57;
            if (var59 > var49 + var55) {
                var59 = var49 + var55;
            }
            int var60 = var55 < var57 ? var55 : var57;
            var31 = (int) (Math.atan2((double) (var58 - var60), (double) var36) * 325.95D) & 0x7FF;
            int var61 = var55 > var42 ? var42 : var55;
            int var62 = var49 >= var57 ? var57 : var49;
            if (var31 != 0) {
                var15.method307(var31);
            }
            var32 = (int) (Math.atan2((double) (var61 - var62), (double) var34) * 325.95D) & 0x7FF;
            if (var32 != 0) {
                var15.method290(var32);
            }
            var33 = (var59 >> 1) - this.field4464;
            if (var33 != 0) {
                var15.method312(0, var33, 0);
            }
        }
        class113 var63 = null;
        if (!this.field722 && this.field4500 != -1 && this.field4450 != -1) {
            class305 var64 = class152.method1074((byte) 91, this.field4500);
            var63 = var64.method2144(27, this.field4450);
            if (var63 != null) {
                var63.method312(0, -this.field4517, 0);
                if (var64.field5294) {
                    if (var31 != 0) {
                        var63.method307(var31);
                    }
                    if (var32 != 0) {
                        var63.method290(var32);
                    }
                    if (var33 != 0) {
                        var63.method312(0, var33, 0);
                    }
                }
            }
        }
        class113 var65 = null;
        if (!this.field722 && this.field746 != null) {
            if (this.field742 <= class116.field2000) {
                this.field746 = null;
            }
            if (class116.field2000 >= this.field729 && this.field742 > class116.field2000) {
                var65 = this.field746;
                var65.method312(this.field743 - this.field4452, -this.field4464 + this.field733, this.field727 - this.field4457);
                if (this.field4486 == 512) {
                    var65.method299();
                } else if (this.field4486 == 1024) {
                    var65.method297();
                } else if (this.field4486 == 1536) {
                    var65.method316();
                }
            }
        }
        if (class231.field4051) {
            this.method1811(16705, var15);
            var15.field1950 = true;
            var15.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4468);
            if (var63 != null) {
                if (this.field4468 != null) {
                    class148 var66 = (class148) var63;
                    this.field4468.method1141(var66.field2678, var66.field2658, true, var66.field2679, var66.field2692, var66.field2674);
                }
                var63.field1950 = true;
                var63.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4468);
            }
        } else {
            if (var63 != null) {
                var15 = ((class44) var15).method294(var63);
            }
            if (var65 != null) {
                var15 = ((class44) var15).method294(var65);
            }
            this.method1811(16705, var15);
            var15.field1950 = true;
            var15.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4468);
        }
        if (var65 == null) {
            return;
        }
        if (this.field4486 == 512) {
            var65.method316();
        } else if (this.field4486 == 1024) {
            var65.method297();
        } else if (this.field4486 == 1536) {
            var65.method299();
        }
        var65.method312(this.field4452 - this.field743, -this.field733 + this.field4464, this.field4457 - this.field727);
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V", line = 717)
    public static final void method364(int arg0) {
        class291.method2087(arg0 + 743903089);
        field735++;
        class328.method2243(-4);
        class237.method1636((byte) -96);
        class171.method1187((byte) -100);
        class283.method2033(-798165300);
        class270.method1949(arg0 ^ 0x2C570F6F);
        class64.method447(127);
        class103.method712(-13128);
        class330.method2260(arg0 + 743931528);
        class295.method2100(true);
        if (arg0 != -743903088) {
            return;
        }
        class200.method1416(-66);
        class191.method1356((byte) 84);
        client.method1812(true);
        class240.method1663(-94);
        class293.field5122.method644((byte) 112);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)Z", line = 746)
    public final boolean method319(boolean arg0) {
        field747++;
        if (this.field721 == null) {
            return false;
        } else if (arg0) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIILac;IIIIIIILke;III)V", line = 764)
    private final void method365(int arg0, int arg1, int arg2, class165 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class113 arg11, int arg12, int arg13, int arg14) {
        field726++;
        if (arg6 != -24769) {
            return;
        }
        int var16 = arg2 * arg2 + arg10 * arg10;
        if (var16 < 16 || var16 > 360000) {
            return;
        }
        int var17 = (int) (Math.atan2((double) arg2, (double) arg10) * 325.949D) & 0x7FF;
        class113 var18 = class246.method1691(this.field4452, this.field4464, var17, -14431, arg12, this.field4457, arg11);
        if (var18 == null) {
            return;
        }
        if (!class231.field4051) {
            var18.method98(0, arg8, arg13, arg4, arg0, arg7, arg1, arg9, -1L, arg5, arg3);
            return;
        }
        float var19 = class231.method1592();
        float var20 = class231.method1575();
        class231.method1591();
        class231.method1593(var19, var20 - 150.0F);
        var18.method98(0, arg8, arg13, arg4, arg0, arg7, arg1, arg9, -1L, arg5, arg3);
        class231.method1570();
        class231.method1593(var19, var20);
    }
}
