import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class142 {

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "[I")
    private int[] field2226;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "[I")
    private int[] field2220;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "[I")
    public static int[] field2225 = new int[32768];

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Z")
    public static boolean field2216 = false;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "[I")
    public static int[] field2222 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    private int field2218;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    private int field2219;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    private int field2221;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    private int field2227;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "Lak;")
    public static class172 field2223;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
    public static int[] field2212;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)I", line = 5)
    public final int method1046(int arg0) {
        if ((this.field2218--) == 0) {
            this.method1051(9746);
            this.field2218 = 255;
        }
        field2224++;
        int var2 = -38 / ((-arg0 - 30) / 46);
        return this.field2226[this.field2218];
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILjava/lang/String;)I", line = 29)
    public static final int method1047(int arg0, String arg1) {
        if (arg0 != -23595) {
            method1048(-36, 44, 98);
        }
        field2214++;
        return class99.method677(10, arg1, arg0 + 23645, true);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)Lgg;", line = 44)
    public static final class38 method1048(int arg0, int arg1, int arg2) {
        class204 var3 = class324.field5032[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class38 var4 = var3.field3342;
            var3.field3342 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 63)
    public static final void method1049(byte arg0) {
        int var1 = 0;
        if (arg0 < 59) {
            return;
        }
        while (class135.field2148 > var1) {
            int var10002 = class105.field1541[var1]--;
            if (class105.field1541[var1] >= -10) {
                label91: {
                    class171 var3 = class343.field5333[var1];
                    if (var3 == null) {
                        var3 = class171.method1267(class128.field1997, class193.field3153[var1], 0);
                        if (var3 == null) {
                            break label91;
                        }
                        class105.field1541[var1] += var3.method1266();
                        class343.field5333[var1] = var3;
                    }
                    if (class105.field1541[var1] < 0) {
                        label94: {
                            int var4;
                            if (class111.field1651[var1] == 0) {
                                var4 = class8.field116[var1] * class261.field4169 >> 8;
                            } else {
                                int var5 = (class111.field1651[var1] & 0xFF) * 128;
                                int var6 = (class111.field1651[var1] & 0xFF88A1) >> 16;
                                int var7 = var6 * 128 + 64 - class191.field3129.field4255;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = (class111.field1651[var1] & 0xFFCC) >> 8;
                                int var9 = var8 * 128 + 64 - class191.field3129.field4264;
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var7 + var9 - 128;
                                if (var10 > var5) {
                                    class105.field1541[var1] = -100;
                                    break label94;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var4 = (var5 - var10) * class8.field116[var1] * class174.field2883 / var5 >> 8;
                            }
                            if (var4 > 0) {
                                class125 var11 = var3.method1268().method911(class333.field5184);
                                class272 var12 = class272.method1931(var11, 100, var4);
                                var12.method1959(class265.field4285[var1] - 1);
                                class191.field3127.method120(var12);
                            }
                            class105.field1541[var1] = -100;
                        }
                    }
                }
            } else {
                class135.field2148--;
                for (int var2 = var1; var2 < class135.field2148; var2++) {
                    class193.field3153[var2] = class193.field3153[var2 + 1];
                    class343.field5333[var2] = class343.field5333[var2 + 1];
                    class265.field4285[var2] = class265.field4285[var2 + 1];
                    class105.field1541[var2] = class105.field1541[var2 + 1];
                    class111.field1651[var2] = class111.field1651[var2 + 1];
                    class8.field116[var2] = class8.field116[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        field2229++;
        if (class137.field2164 && !class11.method61(0)) {
            if (class210.field3447 != 0 && class108.field1584 != -1) {
                class10.method54(false, 0, 10000, class243.field3846, class108.field1584, class210.field3447);
            }
            class137.field2164 = false;
        } else if (class210.field3447 != 0 && class108.field1584 != -1 && !class11.method61(0)) {
            class194.field3175.method2375(185, 0);
            class309.field4824++;
            class194.field3175.method283((byte) -51, class108.field1584);
            class108.field1584 = -1;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZIIIBI)V", line = 189)
    public static final void method1050(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field2217++;
        if (arg4 != 113) {
            return;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (class232.field3690) {
            int var6 = arg2 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class213.field3478 - class310.field4839) * var6 / 100 + class310.field4839;
            if (var7 < class225.field3592) {
                var7 = class225.field3592;
            } else if (class4.field70 < var7) {
                var7 = class4.field70;
            }
            int var8 = arg2 * var7 * 512 / (arg3 * 334);
            if (var8 < client.field1663) {
                short var12 = client.field1663;
                var7 = arg3 * var12 * 334 / (arg2 * 512);
                if (var7 > class4.field70) {
                    var7 = class4.field70;
                    int var13 = arg2 * var7 * 512 / (var12 * 334);
                    int var14 = (arg3 - var13) / 2;
                    if (arg0) {
                        class75.method508();
                        class75.method505(arg5, arg1, var14, arg2, 0);
                        class75.method505(arg3 + arg5 - var14, arg1, var14, arg2, 0);
                    }
                    arg5 += var14;
                    arg3 -= var14 * 2;
                }
            } else if (var8 > class184.field3059) {
                short var9 = class184.field3059;
                var7 = var9 * 334 * arg3 / (arg2 * 512);
                if (class225.field3592 > var7) {
                    var7 = class225.field3592;
                    int var10 = var9 * 334 * arg3 / (var7 * 512);
                    int var11 = (arg2 - var10) / 2;
                    if (arg0) {
                        class75.method508();
                        class75.method505(arg5, arg1, arg3, var11, 0);
                        class75.method505(arg5, arg1 + arg2 - var11, arg3, var11, 0);
                    }
                    arg1 += var11;
                    arg2 -= var11 * 2;
                }
            }
            class153.field2357 = arg2 * var7 / 334;
        }
        class8.field117 = (short) arg2;
        class340.field5289 = (short) arg3;
        class295.field4680 = arg1;
        class229.field3657 = arg5;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V", line = 287)
    private final void method1051(int arg0) {
        this.field2221 += ++this.field2227;
        if (arg0 != 9746) {
            this.field2219 = -28;
        }
        field2230++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2220[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2219 ^= this.field2219 << 13;
                } else {
                    this.field2219 ^= this.field2219 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2219 ^= this.field2219 << 2;
            } else {
                this.field2219 ^= this.field2219 >>> 16;
            }
            this.field2219 += this.field2220[var2 + 128 & 0xFF];
            int var4;
            this.field2220[var2] = var4 = this.field2221 + this.field2219 + this.field2220[client.method767(var3 >> 2, 255)];
            this.field2226[var2] = this.field2221 = this.field2220[client.method767(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V", line = 329)
    public static void method1052(int arg0) {
        field2222 = null;
        field2212 = null;
        field2223 = null;
        field2225 = null;
        if (arg0 < 36) {
            field2212 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Log;", line = 343)
    public static final class157 method1053(int arg0, int arg1) {
        field2213++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & arg1;
        if (class221.field3547[var2] == null || class221.field3547[var2][var3] == null) {
            boolean var4 = class263.method1875(arg1 - 65441, var2);
            if (!var4) {
                return null;
            }
        }
        return class221.field3547[var2][var3];
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V", line = 371)
    private class142() {
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V", line = 375)
    public static final void method1054(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2228++;
        if (class179.field2976 == 1) {
            class60.field837[class247.field3900 / 100].method375(class21.field304 - 8, class334.field5195 + -8);
        }
        if (class179.field2976 == 2) {
            class60.field837[class247.field3900 / 100 + 4].method375(class21.field304 - 8, class334.field5195 + -8);
        }
        class195.method1436(68);
        int var5 = -102 / ((17 - arg0) / 62);
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "([I)V", line = 399)
    public class142(int[] arg0) {
        this.field2226 = new int[256];
        this.field2220 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2226[var2] = arg0[var2];
        }
        this.method1055(22833);
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V", line = 424)
    private final void method1055(int arg0) {
        field2211++;
        if (arg0 != 22833) {
            this.field2221 = 45;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var5 + var14;
            int var16 = var7 + var12;
            int var17 = var16 ^ var12 << 8;
            int var18 = var12 + var15;
            int var19 = var4 + var17;
            var6 = var18 ^ var15 >>> 16;
            int var20 = var3 + var6;
            int var21 = var15 + var19;
            var5 = var21 ^ var19 << 10;
            int var22 = var19 + var20;
            int var23 = var2 + var5;
            var4 = var22 ^ var20 >>> 4;
            int var24 = var4 + var11;
            int var25 = var20 + var23;
            var3 = var25 ^ var23 << 8;
            int var26 = var23 + var24;
            var2 = var26 ^ var24 >>> 9;
            var7 = var2 + var17;
            var8 = var3 + var14;
            var9 = var8 + var24;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field2226[var27 + 2] + var7;
            int var29 = this.field2226[var27 + 7] + var2;
            int var30 = this.field2226[var27 + 6] + var3;
            int var31 = this.field2226[var27 + 3] + var6;
            int var32 = this.field2226[var27] + var9;
            int var33 = this.field2226[var27 + 4] + var5;
            int var34 = this.field2226[var27 + 1] + var8;
            int var35 = this.field2226[var27 + 5] + var4;
            int var36 = var32 ^ var34 << 11;
            int var37 = var31 + var36;
            int var38 = var28 + var34;
            int var39 = var38 ^ var28 >>> 2;
            int var40 = var28 + var37;
            int var41 = var33 + var39;
            int var42 = var40 ^ var37 << 8;
            int var43 = var37 + var41;
            int var44 = var35 + var42;
            var6 = var43 ^ var41 >>> 16;
            int var45 = var6 + var30;
            int var46 = var41 + var44;
            var5 = var46 ^ var44 << 10;
            int var47 = var5 + var29;
            int var48 = var44 + var45;
            var4 = var48 ^ var45 >>> 4;
            int var49 = var4 + var36;
            int var50 = var45 + var47;
            var3 = var50 ^ var47 << 8;
            var8 = var3 + var39;
            int var51 = var47 + var49;
            var2 = var51 ^ var49 >>> 9;
            var9 = var8 + var49;
            this.field2220[var27] = var9;
            var7 = var2 + var42;
            this.field2220[var27 + 1] = var8;
            this.field2220[var27 + 2] = var7;
            this.field2220[var27 + 3] = var6;
            this.field2220[var27 + 4] = var5;
            this.field2220[var27 + 5] = var4;
            this.field2220[var27 + 6] = var3;
            this.field2220[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field2220[var52] + var9;
            int var54 = this.field2220[var52 + 7] + var2;
            int var55 = this.field2220[var52 + 4] + var5;
            int var56 = this.field2220[var52 + 5] + var4;
            int var57 = this.field2220[var52 + 3] + var6;
            int var58 = this.field2220[var52 + 1] + var8;
            int var59 = var53 ^ var58 << 11;
            int var60 = var57 + var59;
            int var61 = this.field2220[var52 + 2] + var7;
            int var62 = this.field2220[var52 + 6] + var3;
            int var63 = var58 + var61;
            int var64 = var63 ^ var61 >>> 2;
            int var65 = var55 + var64;
            int var66 = var60 + var61;
            int var67 = var66 ^ var60 << 8;
            int var68 = var60 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var56 + var67;
            int var70 = var6 + var62;
            int var71 = var65 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var5 + var54;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var75 = var4 + var59;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
            this.field2220[var52] = var9;
            this.field2220[var52 + 1] = var8;
            this.field2220[var52 + 2] = var7;
            this.field2220[var52 + 3] = var6;
            this.field2220[var52 + 4] = var5;
            this.field2220[var52 + 5] = var4;
            this.field2220[var52 + 6] = var3;
            this.field2220[var52 + 7] = var2;
        }
        this.method1051(9746);
        this.field2218 = 256;
    }
}
