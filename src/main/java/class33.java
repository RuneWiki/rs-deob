import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class33 {

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "[F")
    public float[] field734 = new float[4];

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "Z")
    public boolean field749 = false;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public int field746;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Z")
    public boolean field729;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Z")
    public boolean field732;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public int field737;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "[S")
    public short[] field743;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    private int field739;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public int field742;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    public static int field751 = 2;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "F")
    public float field730;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "F")
    public float field747;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    private int field731;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    private int field735;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    private int field738;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    private int field745;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "Lvb;")
    public class63 field744;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "[Lre;")
    public static class308[] field736;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 5)
    private final void method238(byte arg0) {
        field728++;
        if (arg0 != -35) {
            field727 = -5;
        }
        int var2 = (this.field723 << 7) + 64;
        this.field730 = 1.0F / (float) (var2 * var2);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZII)V", line = 28)
    public final void method239(boolean arg0, int arg1, int arg2) {
        field740++;
        int var4 = this.field745 * arg1 / arg2 + this.field739 & 0x7FF;
        int var5 = this.field735;
        int var6;
        if (var5 == 1) {
            var6 = (class305.field4959[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class325.field5245[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field747 = (float) ((this.field738 * var6 >> 11) + this.field731) / 2048.0F;
        float var7 = this.field747 / 255.0F;
        this.field734[0] = var7 * (float) (class83.method613(this.field748, 16760323) >> 16);
        this.field734[2] = var7 * (float) class83.method613(this.field748, 255);
        this.field734[1] = (float) (class83.method613(65298, this.field748) >> 8) * var7;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V", line = 112)
    public final void method240(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field741++;
        this.field745 = arg0;
        this.field735 = arg1;
        this.field731 = arg3;
        if (arg2 > -82) {
            method243(-79);
        }
        this.field738 = arg4;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 162)
    private final void method241(int arg0) {
        int var2 = this.field742;
        if (var2 == 2) {
            this.field745 = 2048;
            this.field738 = 2048;
            this.field731 = 0;
            this.field735 = 1;
        } else if (var2 == 3) {
            this.field745 = 4096;
            this.field731 = 0;
            this.field738 = 2048;
            this.field735 = 1;
        } else if (var2 == 4) {
            this.field735 = 4;
            this.field738 = 2048;
            this.field731 = 0;
            this.field745 = 2048;
        } else if (var2 == 5) {
            this.field731 = 0;
            this.field745 = 8192;
            this.field738 = 2048;
            this.field735 = 4;
        } else if (var2 == 12) {
            this.field735 = 2;
            this.field731 = 0;
            this.field745 = 2048;
            this.field738 = 2048;
        } else if (var2 == 13) {
            this.field745 = 8192;
            this.field735 = 2;
            this.field731 = 0;
            this.field738 = 2048;
        } else if (var2 == 10) {
            this.field745 = 2048;
            this.field731 = 1536;
            this.field735 = 3;
            this.field738 = 512;
        } else if (var2 == 11) {
            this.field738 = 512;
            this.field745 = 4096;
            this.field731 = 1536;
            this.field735 = 3;
        } else if (var2 == 6) {
            this.field745 = 2048;
            this.field731 = 1280;
            this.field735 = 3;
            this.field738 = 768;
        } else if (var2 == 7) {
            this.field735 = 3;
            this.field731 = 1280;
            this.field738 = 768;
            this.field745 = 4096;
        } else if (var2 == 8) {
            this.field745 = 2048;
            this.field735 = 3;
            this.field731 = 1024;
            this.field738 = 1024;
        } else if (var2 == 9) {
            this.field738 = 1024;
            this.field745 = 4096;
            this.field731 = 1024;
            this.field735 = 3;
        } else if (var2 == 14) {
            this.field735 = 1;
            this.field745 = 2048;
            this.field738 = 768;
            this.field731 = 1280;
        } else if (var2 == 15) {
            this.field745 = 4096;
            this.field738 = 512;
            this.field731 = 1536;
            this.field735 = 1;
        } else if (var2 == 16) {
            this.field735 = 1;
            this.field738 = 256;
            this.field731 = 1792;
            this.field745 = 8192;
        } else {
            this.field731 = 0;
            this.field745 = 2048;
            this.field738 = 2048;
            this.field735 = 0;
        }
        int var3 = -58 / ((arg0 + 43) / 47);
        field725++;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 680)
    protected class33() {
        if (class325.field5245 == null) {
            class296.method2128(4);
        }
        this.method241(32);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Loe;)V", line = 690)
    public class33(class146 arg0) {
        if (class325.field5245 == null) {
            class296.method2128(4);
        }
        this.field746 = arg0.method1005((byte) 122);
        this.field729 = (this.field746 & 0x10) != 0;
        this.field732 = (this.field746 & 0x8) != 0;
        this.field746 &= 0x7;
        this.field750 = arg0.method989(73);
        this.field733 = arg0.method989(77);
        this.field737 = arg0.method989(72);
        this.field723 = arg0.method1005((byte) 122);
        this.method238((byte) -35);
        this.field743 = new short[this.field723 * 2 + 1];
        for (int var2 = 0; var2 < this.field743.length; var2++) {
            this.field743[var2] = (short) arg0.method989(93);
        }
        this.field748 = class305.field4956[arg0.method989(68)];
        int var3 = arg0.method1005((byte) 122);
        this.field739 = (var3 & 0xE0) << 3;
        this.field742 = var3 & 0x1F;
        if (this.field742 != 31) {
            this.method241(-109);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILg;I)V", line = 334)
    public static final void method242(int arg0, int arg1, int arg2, class181 arg3, int arg4) {
        field726++;
        if (arg2 != -28034) {
            field736 = (class308[]) null;
        }
        class119.method865(-4097);
        if (class241.field4016) {
            class337.method2385(arg4, arg1, arg3.field3024 + arg4, arg3.field2972 + arg1);
        } else {
            class270.method1891(arg4, arg1, arg3.field3024 + arg4, arg3.field2972 + arg1);
        }
        if (class174.field2885 != 2 && class174.field2885 != 5 && class180.field2960 != null) {
            int var5;
            int var6;
            int var7;
            int var8;
            if (class69.field1280 == 4) {
                var6 = class212.field3511;
                var5 = (int) class354.field5652 & 0x7FF;
                var7 = class250.field4114;
                var8 = 256;
            } else {
                var5 = (int) class354.field5652 + class192.field3253 & 0x7FF;
                var6 = class96.field1750.field213;
                var7 = class96.field1750.field199;
                var8 = class292.field4726 + 256;
            }
            int var9 = 464 - (var6 / 32);
            int var10 = var7 / 32 + 48;
            if (class241.field4016) {
                ((class265) class180.field2960).method1858(arg4, arg1, arg3.field3024, arg3.field2972, var10, var9, var5, var8, (class265) arg3.method1266(109, false));
            } else {
                ((class288) class180.field2960).method1300(arg4, arg1, arg3.field3024, arg3.field2972, var10, var9, var5, var8, arg3.field3015, arg3.field2973);
            }
            if (class75.field1362 != null) {
                for (int var11 = 0; var11 < class75.field1362.field562; var11++) {
                    if (class75.field1362.field564[var11] != null && (class75.field1362.field566[var11] >> 28) == class276.field4506) {
                        int var12 = (class75.field1362.field566[var11] & 0x3FFF) - class21.field543;
                        int var13 = (class75.field1362.field566[var11] >> 14 & 0x3FFF) - class272.field4426;
                        if (var13 >= 0 && var13 < 104 && var12 >= 0 && var12 < 104) {
                            int var14 = var12 * 4 + (2 - var6 / 32);
                            int var15 = var13 * 4 + 2 - (var7 / 32);
                            class34.method244(true, arg3, var14, arg1, var15, class75.field1362.field564[var11].field2219, arg4);
                        }
                    }
                }
            }
            for (int var16 = 0; var16 < class103.field1900; var16++) {
                int var17 = class7.field249[var16] * 4 + 2 - (var6 / 32);
                int var18 = class289.field4703[var16] * 4 + 2 - (var7 / 32);
                class238 var19 = class1.method7(class287.field4693[var16], 25);
                if (var19.field3937 != null) {
                    var19 = var19.method1651(-123);
                    if (var19 == null || var19.field3893 == -1) {
                        continue;
                    }
                }
                class34.method244(true, arg3, var17, arg1, var18, var19.field3893, arg4);
            }
            for (int var20 = 0; var20 < 104; var20++) {
                for (int var21 = 0; var21 < 104; var21++) {
                    class49 var22 = class99.field1810[class276.field4506][var20][var21];
                    if (var22 != null) {
                        int var23 = var20 * 4 + 2 - (var7 / 32);
                        int var24 = var21 * 4 + 2 - var6 / 32;
                        class30.method232(class320.field5211[0], arg3, var23, arg4, 1, var24, arg1);
                    }
                }
            }
            for (int var25 = 0; var25 < class255.field4184; var25++) {
                class314 var26 = class149.field2533[class23.field570[var25]];
                if (var26 != null && var26.method45((byte) -95)) {
                    class88 var27 = var26.field5107;
                    if (var27 != null && var27.field1552 != null) {
                        var27 = var27.method681((byte) 15);
                    }
                    if (var27 != null && var27.field1555 && var27.field1582) {
                        int var28 = var26.field199 / 32 - var7 / 32;
                        int var29 = var26.field213 / 32 - (var6 / 32);
                        if (var27.field1583 == -1) {
                            class30.method232(class320.field5211[1], arg3, var28, arg4, 1, var29, arg1);
                        } else {
                            class34.method244(true, arg3, var29, arg1, var28, var27.field1583, arg4);
                        }
                    }
                }
            }
            for (int var30 = 0; var30 < class252.field4144; var30++) {
                class98 var31 = class182.field3151[class22.field556[var30]];
                if (var31 != null && var31.method45((byte) -95)) {
                    int var32 = var31.field199 / 32 - var7 / 32;
                    int var33 = var31.field213 / 32 - var6 / 32;
                    boolean var34 = false;
                    for (int var35 = 0; var35 < class151.field2550; var35++) {
                        if (var31.field1779.equals(class91.field1610[var35]) && class336.field5345[var35] != 0) {
                            var34 = true;
                            break;
                        }
                    }
                    boolean var36 = false;
                    for (int var37 = 0; var37 < class293.field4739; var37++) {
                        if (var31.field1779.equals(class85.field1473[var37].field4605)) {
                            var36 = true;
                            break;
                        }
                    }
                    boolean var38 = false;
                    if (class96.field1750.field1782 != 0 && var31.field1782 != 0 && class96.field1750.field1782 == var31.field1782) {
                        var38 = true;
                    }
                    if (var34) {
                        class30.method232(class320.field5211[3], arg3, var32, arg4, 1, var33, arg1);
                    } else if (var36) {
                        class30.method232(class320.field5211[5], arg3, var32, arg4, 1, var33, arg1);
                    } else if (var38) {
                        class30.method232(class320.field5211[4], arg3, var32, arg4, 1, var33, arg1);
                    } else {
                        class30.method232(class320.field5211[2], arg3, var32, arg4, 1, var33, arg1);
                    }
                }
            }
            class68[] var39 = class120.field2140;
            for (int var40 = 0; var40 < var39.length; var40++) {
                class68 var41 = var39[var40];
                if (var41 != null && var41.field1253 != 0 && (class267.field4371 % 20) < 10) {
                    if (var41.field1253 == 1 && var41.field1264 >= 0 && class149.field2533.length > var41.field1264) {
                        class314 var42 = class149.field2533[var41.field1264];
                        if (var42 != null) {
                            int var43 = var42.field199 / 32 - (var7 / 32);
                            int var44 = var42.field213 / 32 - (var6 / 32);
                            class292.method2071(var41.field1274, 360000, var43, (byte) -34, arg3, var44, arg4, arg1);
                        }
                    }
                    if (var41.field1253 == 2) {
                        int var45 = (var41.field1257 - class21.field543) * 4 + 2 - var6 / 32;
                        int var46 = (var41.field1275 - class272.field4426) * 4 + 2 - (var7 / 32);
                        int var47 = var41.field1259 * 4;
                        int var48 = var47 * var47;
                        class292.method2071(var41.field1274, var48, var46, (byte) -114, arg3, var45, arg4, arg1);
                    }
                    if (var41.field1253 == 10 && var41.field1264 >= 0 && var41.field1264 < class182.field3151.length) {
                        class98 var49 = class182.field3151[var41.field1264];
                        if (var49 != null) {
                            int var50 = var49.field199 / 32 - (var7 / 32);
                            int var51 = var49.field213 / 32 - (var6 / 32);
                            class292.method2071(var41.field1274, 360000, var50, (byte) -56, arg3, var51, arg4, arg1);
                        }
                    }
                }
            }
            if (class69.field1280 != 4) {
                if (class92.field1637 != 0) {
                    int var52 = class92.field1637 * 4 + ((class96.field1750.method49((byte) -100) + -1) * 2) + 2 - (var7 / 32);
                    int var53 = class284.field4641 * 4 + class96.field1750.method49((byte) -112) * 2 + 2 - (var6 / 32) - 2;
                    class30.method232(class159.field2695[class275.field4492 ? 1 : 0], arg3, var52, arg4, 1, var53, arg1);
                }
                if (class241.field4016) {
                    class337.method2378(arg4 + (arg3.field3024 / 2) - 1, arg3.field2972 / 2 + -1 + arg1, 3, 3, 16777215);
                } else {
                    class270.method1894(arg3.field3024 / 2 + arg4 - 1, arg3.field2972 / 2 + (arg1 - 1), 3, 3, 16777215);
                }
            }
        } else if (class241.field4016) {
            class75 var54 = arg3.method1266(arg2 + 28141, false);
            if (var54 != null) {
                var54.method568(arg4, arg1);
            }
        } else {
            class270.method1896(arg4, arg1, 0, arg3.field3015, arg3.field2973);
        }
        class117.field2084[arg0] = true;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 658)
    public static void method243(int arg0) {
        if (arg0 != 7) {
            field724 = 6;
        }
        field736 = null;
    }
}
