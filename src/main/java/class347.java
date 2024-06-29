import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class347 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "[I")
    private int[] field4854 = new int[1600];

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "[I")
    private int[] field4856 = new int[8191];

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "[[Ldi;")
    private class128[][] field4867 = new class128[1600][64];

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    private int field4870 = 0;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "[I")
    private int[] field4866 = new int[64];

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "[[Ldi;")
    private class128[][] field4878 = new class128[64][768];

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lld;")
    private class171 field4853;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Lam;")
    private class633 field4860;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Lam;")
    private class633 field4859;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "Lrh;")
    private class268 field4865;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "Lhda;")
    public static class752 field4864 = new class752(98, -1);

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field4872 = new String[100];

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "[I")
    public static int[] field4875 = new int[14];

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field4871 = -1;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "[[[I")
    public static int[][][] field4869 = new int[2][][];

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field4876 = 0;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static void method2071(int arg0) {
        field4864 = null;
        if (arg0 != -16766) {
            method2071(48);
        }
        field4872 = null;
        field4869 = null;
        field4875 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lrv;Luj;II)V")
    public final void method2072(class111 arg0, class388 arg1, int arg2, int arg3) {
        field4863++;
        if (arg0.field1719 == null) {
            return;
        }
        if (arg2 < 0) {
            this.method2078(arg0, true);
        } else {
            this.method2076(arg0, -1, arg2);
        }
        float var5 = arg0.field1719.field8199;
        float var6 = arg0.field1719.field8215;
        float var7 = arg0.field1719.field8225;
        float var8 = arg0.field1719.field8177;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = arg3;
            class324 var12 = arg1.field5411.field232;
            for (class324 var13 = var12.field4601; var13 != var12; var13 = var13.field4601) {
                class128 var14 = (class128) var13;
                int var15 = (int) ((float) (var14.field2111 >> 12) * var7 + (float) (var14.field2110 >> 12) * var5 + (float) (var14.field2107 >> 12) * var6 + var8);
                this.field4856[var9++] = var15;
                if (var10 > var15) {
                    var10 = var15;
                }
                if (var15 > var11) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = (class384.method2276(125, var16) - class381.field5292) + 1;
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class324 var19 = var12.field4601;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field4870 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field4854[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field4866[var24] = 0;
                }
                while (var12 != var19) {
                    class128 var25 = (class128) var19;
                    if (var22) {
                        var20 = var25.field2115;
                        var22 = false;
                        var21 = var25.field2114;
                    }
                    if (var18 > 0 && (var25.field2115 != var20 || var25.field2114 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field4856[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field4854[var26] >= 64) {
                            label101: {
                                if (this.field4854[var26] == 64) {
                                    if (this.field4870 == 64) {
                                        break label101;
                                    }
                                    this.field4854[var26] += this.field4870++ + 1;
                                }
                                this.field4878[this.field4854[var26] - 1 - 64][this.field4866[this.field4854[var26] - 64 - 1]++] = var25;
                            }
                        } else {
                            this.field4867[var26][this.field4854[var26]++] = var25;
                        }
                    }
                    var19 = var19.field4601;
                }
                arg0.method856(var20 >= 0 ? var20 : -1, 51, false, false);
                if (var21 && class610.field8133 != arg0.field1742) {
                    arg0.method486(class610.field8133);
                } else if (arg0.field1742 != 1.0F) {
                    arg0.method486(1.0F);
                }
                this.method2077(arg0, 0, var16);
            }
        } catch (Exception var27) {
        }
        this.method2075(7160, arg0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILrv;)V")
    public final void method2073(int arg0, class111 arg1) {
        this.field4860.method2603(24, -30987, 786336);
        field4873++;
        if (arg0 <= 90) {
            this.method2078(null, false);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLkn;)V")
    public static final void method2074(byte arg0, class742 arg1) {
        field4877++;
        int var2 = 15 % ((-arg0 - 68) / 43);
        boolean var3 = false;
        if (class29.field474 == arg1.field10273 || arg1.field10257 == -1 || arg1.field10237 != 0) {
            var3 = true;
        } else {
            class456 var4 = class509.field6780.method663((byte) -90, arg1.field10257);
            if (var4.field6227 || arg1.field10279 + 1 > var4.field6225[arg1.field10233]) {
                var3 = true;
            }
        }
        if (var3) {
            int var5 = arg1.field10273 - arg1.field10231;
            int var6 = class29.field474 - arg1.field10231;
            int var7 = arg1.field10230 * 512 + arg1.method2256(-1) * 256;
            int var8 = arg1.field10241 * 512 + (arg1.method2256(-1) * 256);
            int var9 = arg1.field10235 * 512 + arg1.method2256(-1) * 256;
            int var10 = arg1.field10228 * 512 + arg1.method2256(-1) * 256;
            arg1.field3505 = ((var5 - var6) * var7 + var6 * var9) / var5;
            arg1.field3502 = ((var5 - var6) * var8 + (var6 * var10)) / var5;
        }
        arg1.field10313 = 0;
        if (arg1.field10274 == 0) {
            arg1.method4143((byte) -17, 8192, false);
        }
        if (arg1.field10274 == 1) {
            arg1.method4143((byte) -17, 12288, false);
        }
        if (arg1.field10274 == 2) {
            arg1.method4143((byte) -17, 0, false);
        }
        if (arg1.field10274 == 3) {
            arg1.method4143((byte) -17, 4096, false);
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(ILrv;)V")
    private final void method2075(int arg0, class111 arg1) {
        field4857++;
        arg1.method844((byte) 36, true);
        if (arg0 == 7160) {
            arg1.method918((byte) 123, true);
            if (class610.field8133 != arg1.field1742) {
                arg1.method486(class610.field8133);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lrv;II)V")
    private final void method2076(class111 arg0, int arg1, int arg2) {
        field4858++;
        class610.field8133 = arg0.field1742;
        arg0.method871((float) arg2, -106);
        if (arg1 == -1) {
            arg0.method946((byte) -53);
            arg0.method918((byte) 70, false);
            arg0.method844((byte) 36, false);
            arg0.method897(arg1 ^ 0xFFFFA7E8);
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lrv;II)V")
    private final void method2077(class111 arg0, int arg1, int arg2) {
        field4874++;
        int var4 = arg1;
        class615 var5 = arg0.method913((byte) 17);
        float var6 = var5.field8182;
        float var7 = var5.field8221;
        float var8 = var5.field8197;
        float var9 = var5.field8184;
        float var10 = var5.field8208;
        float var11 = var5.field8195;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field4860.method2599(-4448, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method820((byte) -20, var21);
        if (Stream.method3739()) {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field4854[var48] <= 64 ? this.field4854[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class128 var63 = this.field4867[var48][var50];
                        int var64 = var63.field2113;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field2110 >> 12);
                        float var70 = (float) (var63.field2107 >> 12);
                        float var71 = (float) (var63.field2111 >> 12);
                        int var72 = var63.field2112 >> 12;
                        var22.method3733((float) (-var72) * var12 + var69);
                        var22.method3733((float) (-var72) * var13 + var70);
                        var22.method3733((float) (-var72) * var14 + var71);
                        if (arg0.field1823 == 0) {
                            var22.method3744(var65, var66, var67, var68);
                        } else {
                            var22.method3740(var65, var66, var67, var68);
                        }
                        var22.method3733(0.0F);
                        var22.method3733(0.0F);
                        var22.method3733((float) var72 * var15 + var69);
                        var22.method3733((float) var72 * var16 + var70);
                        var22.method3733((float) var72 * var17 + var71);
                        if (arg0.field1823 == 0) {
                            var22.method3744(var65, var66, var67, var68);
                        } else {
                            var22.method3740(var65, var66, var67, var68);
                        }
                        var22.method3733(1.0F);
                        var22.method3733(0.0F);
                        var22.method3733((float) var72 * var12 + var69);
                        var22.method3733((float) var72 * var13 + var70);
                        var22.method3733((float) var72 * var14 + var71);
                        if (arg0.field1823 == 0) {
                            var22.method3744(var65, var66, var67, var68);
                        } else {
                            var22.method3740(var65, var66, var67, var68);
                        }
                        var22.method3733(1.0F);
                        var22.method3733(1.0F);
                        var22.method3733((float) var72 * var18 + var69);
                        var22.method3733((float) var72 * var19 + var70);
                        var22.method3733((float) var72 * var20 + var71);
                        if (arg0.field1823 == 0) {
                            var22.method3744(var65, var66, var67, var68);
                        } else {
                            var22.method3740(var65, var66, var67, var68);
                        }
                        var22.method3733(0.0F);
                        var4++;
                        var22.method3733(1.0F);
                    }
                    if (this.field4854[var48] > 64) {
                        int var51 = this.field4854[var48] - 65;
                        for (int var52 = this.field4866[var51] - 1; var52 >= 0; var52--) {
                            class128 var53 = this.field4878[var51][var52];
                            int var54 = var53.field2113;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field2110 >> 12);
                            float var60 = (float) (var53.field2107 >> 12);
                            float var61 = (float) (var53.field2111 >> 12);
                            int var62 = var53.field2112 >> 12;
                            var22.method3733((float) (-var62) * var12 + var59);
                            var22.method3733((float) (-var62) * var13 + var60);
                            var22.method3733((float) (-var62) * var14 + var61);
                            if (arg0.field1823 == 0) {
                                var22.method3744(var55, var56, var57, var58);
                            } else {
                                var22.method3740(var55, var56, var57, var58);
                            }
                            var22.method3733(0.0F);
                            var22.method3733(0.0F);
                            var22.method3733((float) var62 * var15 + var59);
                            var22.method3733((float) var62 * var16 + var60);
                            var22.method3733((float) var62 * var17 + var61);
                            if (arg0.field1823 == 0) {
                                var22.method3744(var55, var56, var57, var58);
                            } else {
                                var22.method3740(var55, var56, var57, var58);
                            }
                            var22.method3733(1.0F);
                            var22.method3733(0.0F);
                            var22.method3733((float) var62 * var12 + var59);
                            var22.method3733((float) var62 * var13 + var60);
                            var22.method3733((float) var62 * var14 + var61);
                            if (arg0.field1823 == 0) {
                                var22.method3744(var55, var56, var57, var58);
                            } else {
                                var22.method3740(var55, var56, var57, var58);
                            }
                            var22.method3733(1.0F);
                            var22.method3733(1.0F);
                            var22.method3733((float) var62 * var18 + var59);
                            var22.method3733((float) var62 * var19 + var60);
                            var22.method3733((float) var62 * var20 + var61);
                            if (arg0.field1823 == 0) {
                                var22.method3744(var55, var56, var57, var58);
                            } else {
                                var22.method3740(var55, var56, var57, var58);
                            }
                            var22.method3733(0.0F);
                            var4++;
                            var22.method3733(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field4854[var23] > 64 ? 64 : this.field4854[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class128 var38 = this.field4867[var23][var25];
                        int var39 = var38.field2113;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field2110 >> 12);
                        float var45 = (float) (var38.field2107 >> 12);
                        float var46 = (float) (var38.field2111 >> 12);
                        int var47 = var38.field2112 >> 12;
                        var22.method3741((float) (-var47) * var12 + var44);
                        var22.method3741((float) (-var47) * var13 + var45);
                        var22.method3741((float) (-var47) * var14 + var46);
                        if (arg0.field1823 == 0) {
                            var22.method3744(var40, var41, var42, var43);
                        } else {
                            var22.method3740(var40, var41, var42, var43);
                        }
                        var22.method3741(0.0F);
                        var22.method3741(0.0F);
                        var22.method3741((float) var47 * var15 + var44);
                        var22.method3741((float) var47 * var16 + var45);
                        var22.method3741((float) var47 * var17 + var46);
                        if (arg0.field1823 == 0) {
                            var22.method3744(var40, var41, var42, var43);
                        } else {
                            var22.method3740(var40, var41, var42, var43);
                        }
                        var22.method3741(1.0F);
                        var22.method3741(0.0F);
                        var22.method3741((float) var47 * var12 + var44);
                        var22.method3741((float) var47 * var13 + var45);
                        var22.method3741((float) var47 * var14 + var46);
                        if (arg0.field1823 == 0) {
                            var22.method3744(var40, var41, var42, var43);
                        } else {
                            var22.method3740(var40, var41, var42, var43);
                        }
                        var22.method3741(1.0F);
                        var22.method3741(1.0F);
                        var22.method3741((float) var47 * var18 + var44);
                        var22.method3741((float) var47 * var19 + var45);
                        var22.method3741((float) var47 * var20 + var46);
                        if (arg0.field1823 == 0) {
                            var22.method3744(var40, var41, var42, var43);
                        } else {
                            var22.method3740(var40, var41, var42, var43);
                        }
                        var22.method3741(0.0F);
                        var4++;
                        var22.method3741(1.0F);
                    }
                    if (this.field4854[var23] > 64) {
                        int var26 = this.field4854[var23] - 64 - 1;
                        for (int var27 = this.field4866[var26] - 1; var27 >= 0; var27--) {
                            class128 var28 = this.field4878[var26][var27];
                            int var29 = var28.field2113;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field2110 >> 12);
                            float var35 = (float) (var28.field2107 >> 12);
                            float var36 = (float) (var28.field2111 >> 12);
                            int var37 = var28.field2112 >> 12;
                            var22.method3741((float) (-var37) * var12 + var34);
                            var22.method3741((float) (-var37) * var13 + var35);
                            var22.method3741((float) (-var37) * var14 + var36);
                            if (arg0.field1823 == 0) {
                                var22.method3744(var30, var31, var32, var33);
                            } else {
                                var22.method3740(var30, var31, var32, var33);
                            }
                            var22.method3741(0.0F);
                            var22.method3741(0.0F);
                            var22.method3741((float) var37 * var15 + var34);
                            var22.method3741((float) var37 * var16 + var35);
                            var22.method3741((float) var37 * var17 + var36);
                            if (arg0.field1823 == 0) {
                                var22.method3744(var30, var31, var32, var33);
                            } else {
                                var22.method3740(var30, var31, var32, var33);
                            }
                            var22.method3741(1.0F);
                            var22.method3741(0.0F);
                            var22.method3741((float) var37 * var12 + var34);
                            var22.method3741((float) var37 * var13 + var35);
                            var22.method3741((float) var37 * var14 + var36);
                            if (arg0.field1823 == 0) {
                                var22.method3744(var30, var31, var32, var33);
                            } else {
                                var22.method3740(var30, var31, var32, var33);
                            }
                            var22.method3741(1.0F);
                            var22.method3741(1.0F);
                            var22.method3741((float) var37 * var18 + var34);
                            var22.method3741((float) var37 * var19 + var35);
                            var22.method3741((float) var37 * var20 + var36);
                            if (arg0.field1823 == 0) {
                                var22.method3744(var30, var31, var32, var33);
                            } else {
                                var22.method3740(var30, var31, var32, var33);
                            }
                            var22.method3741(0.0F);
                            var4++;
                            var22.method3741(1.0F);
                        }
                    }
                }
            }
        }
        var22.method3734();
        if (this.field4860.method2601(-13472)) {
            arg0.method825(0, 8, this.field4860);
            arg0.method825(1, 8, this.field4859);
            arg0.method898(this.field4853, (byte) -15);
            arg0.method900(this.field4865, class322.field4583, var4 * 2, 0, var4 * 4, 0, -229);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lrv;Z)V")
    private final void method2078(class111 arg0, boolean arg1) {
        field4855++;
        class610.field8133 = arg0.field1742;
        arg0.method944((byte) -77);
        arg0.method918((byte) 112, false);
        arg0.method844((byte) 36, false);
        arg0.method897(22551);
        if (!arg1) {
            this.field4866 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public final void method2079(byte arg0) {
        field4868++;
        if (arg0 > -53) {
            this.field4878 = null;
        }
        this.field4860.method588(false);
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lrv;)V")
    public class347(class111 arg0) {
        this.field4853 = arg0.method899((byte) -120, new class502[] { new class502(new class143[] { class143.field2281, class143.field2283, class143.field2285 }), new class502(class143.field2282) });
        this.field4860 = arg0.method904(33, true);
        this.field4859 = arg0.method904(43, false);
        this.field4859.method2603(12, -30987, 393168);
        this.field4865 = arg0.method818(-23469, false);
        this.field4865.method585(49146, (byte) 102);
        Buffer var2 = this.field4865.method587(30907, true);
        if (var2 != null) {
            Stream var3 = arg0.method820((byte) -20, var2);
            if (Stream.method3739()) {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3735(var5);
                    var3.method3735(var5 + 1);
                    var3.method3735(var5 + 2);
                    var3.method3735(var5 + 2);
                    var3.method3735(var5 + 3);
                    var3.method3735(var5);
                }
            } else {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3737(var7);
                    var3.method3737(var7 + 1);
                    var3.method3737(var7 + 2);
                    var3.method3737(var7 + 2);
                    var3.method3737(var7 + 3);
                    var3.method3737(var7);
                }
            }
            var3.method3734();
            this.field4865.method586(-17694);
        }
        Buffer var8 = this.field4859.method2599(-4448, true);
        if (var8 != null) {
            Stream var9 = arg0.method820((byte) -20, var8);
            if (Stream.method3739()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3733(0.0F);
                    var9.method3733(-1.0F);
                    var9.method3733(0.0F);
                    var9.method3733(0.0F);
                    var9.method3733(-1.0F);
                    var9.method3733(0.0F);
                    var9.method3733(0.0F);
                    var9.method3733(-1.0F);
                    var9.method3733(0.0F);
                    var9.method3733(0.0F);
                    var9.method3733(-1.0F);
                    var9.method3733(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3741(0.0F);
                    var9.method3741(-1.0F);
                    var9.method3741(0.0F);
                    var9.method3741(0.0F);
                    var9.method3741(-1.0F);
                    var9.method3741(0.0F);
                    var9.method3741(0.0F);
                    var9.method3741(-1.0F);
                    var9.method3741(0.0F);
                    var9.method3741(0.0F);
                    var9.method3741(-1.0F);
                    var9.method3741(0.0F);
                }
            }
            var9.method3734();
            this.field4859.method2601(-13472);
        }
    }
}
