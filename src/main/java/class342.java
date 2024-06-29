import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class342 {

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "[[Lfa;")
    private class232[][] field4807 = new class232[1600][64];

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "[I")
    private int[] field4811 = new int[8191];

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "[I")
    private int[] field4804 = new int[64];

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    private int field4816 = 0;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "[I")
    private int[] field4818 = new int[1600];

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "[[Lfa;")
    private class232[][] field4821 = new class232[64][768];

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Lhi;")
    private class203 field4813;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "Lcaa;")
    private class302 field4809;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lcaa;")
    private class302 field4815;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Lida;")
    private class234 field4803;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Lqe;")
    public static class465 field4802 = new class465(97, 6);

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "[I")
    public static int[] field4810 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "[[Ljava/lang/String;")
    public static String[][] field4812 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Lqe;")
    public static class465 field4814 = new class465(91, 8);

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lgt;II)V", line = 10)
    private final void method2163(class453 arg0, int arg1, int arg2) {
        class153.field2307 = arg0.field6493;
        field4800++;
        arg0.method2697(106, (float) arg2);
        arg0.method2708(0);
        arg0.method2770(arg1 ^ 0xD01, false);
        arg0.method2715(false, arg1 ^ 0xFFFFE042);
        arg0.method2711(-114);
        if (arg1 != 8191) {
            this.method2166(null, null, 31, false);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 28)
    public final void method2164(int arg0) {
        if (arg0 != 0) {
            this.field4816 = -55;
        }
        field4820++;
        this.field4809.method1496(false);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lgt;B)V", line = 39)
    public final void method2165(class453 arg0, byte arg1) {
        if (arg1 != 51) {
            field4819 = -86;
        }
        this.field4809.method1497(24, 786336, -29407);
        field4808++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lgt;Loo;IZ)V", line = 51)
    public final void method2166(class453 arg0, class624 arg1, int arg2, boolean arg3) {
        field4799++;
        if (arg0.field6446 == null) {
            return;
        }
        if (arg2 >= 0) {
            this.method2163(arg0, 8191, arg2);
        } else {
            this.method2171(arg0, true);
        }
        float var5 = arg0.field6446.field345;
        float var6 = arg0.field6446.field331;
        float var7 = arg0.field6446.field343;
        float var8 = arg0.field6446.field326;
        try {
            int var9 = 0;
            if (arg3) {
                this.field4821 = null;
            }
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class740 var12 = arg1.field8974.field5148;
            for (class740 var13 = var12.field10390; var13 != var12; var13 = var13.field10390) {
                class232 var14 = (class232) var13;
                int var15 = (int) ((float) (var14.field3300 >> 12) * var7 + (float) (var14.field3297 >> 12) * var5 + (float) (var14.field3295 >> 12) * var6 + var8);
                if (var10 > var15) {
                    var10 = var15;
                }
                this.field4811[var9++] = var15;
                if (var11 < var15) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 > 1600) {
                var17 = class621.method3590(var16, 4) + 1 - class656.field9235;
                var16 = (var16 >> var17) + 2;
            } else {
                var17 = 0;
                var16 += 2;
            }
            class740 var18 = var12.field10390;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field4816 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field4818[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field4804[var24] = 0;
                }
                while (var12 != var18) {
                    class232 var25 = (class232) var18;
                    if (var22) {
                        var22 = false;
                        var20 = var25.field3304;
                        var21 = var25.field3299;
                    }
                    if (var19 > 0 && (var25.field3304 != var20 || var25.field3299 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field4811[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field4818[var26] < 64) {
                            this.field4807[var26][this.field4818[var26]++] = var25;
                        } else {
                            label101: {
                                if (this.field4818[var26] == 64) {
                                    if (this.field4816 == 64) {
                                        break label101;
                                    }
                                    this.field4818[var26] += this.field4816++ + 1;
                                }
                                this.field4821[this.field4818[var26] - 1 - 64][this.field4804[this.field4818[var26] - 1 - 64]++] = var25;
                            }
                        }
                    }
                    var18 = var18.field10390;
                }
                arg0.method2728(false, false, (byte) 23, var20 >= 0 ? var20 : -1);
                if (var21 && class153.field2307 != arg0.field6493) {
                    arg0.method552(class153.field2307);
                } else if (arg0.field6493 != 1.0F) {
                    arg0.method552(1.0F);
                }
                this.method2169(arg0, 6182, var16);
            }
        } catch (Exception var27) {
        }
        this.method2170(arg0, (byte) -83);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 215)
    public static final String method2167(int arg0, long arg1) {
        field4817++;
        class173.field2506.setTime(new Date(arg1));
        int var3 = class173.field2506.get(7);
        int var4 = class173.field2506.get(5);
        int var5 = class173.field2506.get(2);
        int var6 = class173.field2506.get(1);
        int var7 = class173.field2506.get(11);
        if (arg0 <= 34) {
            field4819 = -112;
        }
        int var8 = class173.field2506.get(12);
        int var9 = class173.field2506.get(13);
        return class389.field5436[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class429.field6006[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lgt;)V", line = 709)
    public class342(class453 arg0) {
        this.field4813 = arg0.method1006(50, new class328[] { new class328(new class674[] { class674.field9457, class674.field9460, class674.field9462 }), new class328(class674.field9459) });
        this.field4809 = arg0.method1036((byte) -46, true);
        this.field4815 = arg0.method1036((byte) -41, false);
        this.field4815.method1497(12, 393168, -29407);
        this.field4803 = arg0.method1047(-34, false);
        this.field4803.method1600(49146, -107);
        Buffer var2 = this.field4803.method1599(true, (byte) 38);
        if (var2 != null) {
            Stream var3 = arg0.method2764(var2, (byte) -76);
            if (Stream.method3762()) {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3766(var5);
                    var3.method3766(var5 + 1);
                    var3.method3766(var5 + 2);
                    var3.method3766(var5 + 2);
                    var3.method3766(var5 + 3);
                    var3.method3766(var5);
                }
            } else {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3768(var7);
                    var3.method3768(var7 + 1);
                    var3.method3768(var7 + 2);
                    var3.method3768(var7 + 2);
                    var3.method3768(var7 + 3);
                    var3.method3768(var7);
                }
            }
            var3.method3761();
            this.field4803.method1601(-4);
        }
        Buffer var8 = this.field4815.method1492((byte) -20, true);
        if (var8 != null) {
            Stream var9 = arg0.method2764(var8, (byte) -76);
            if (Stream.method3762()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3774(0.0F);
                    var9.method3774(-1.0F);
                    var9.method3774(0.0F);
                    var9.method3774(0.0F);
                    var9.method3774(-1.0F);
                    var9.method3774(0.0F);
                    var9.method3774(0.0F);
                    var9.method3774(-1.0F);
                    var9.method3774(0.0F);
                    var9.method3774(0.0F);
                    var9.method3774(-1.0F);
                    var9.method3774(0.0F);
                }
            } else {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3770(0.0F);
                    var9.method3770(-1.0F);
                    var9.method3770(0.0F);
                    var9.method3770(0.0F);
                    var9.method3770(-1.0F);
                    var9.method3770(0.0F);
                    var9.method3770(0.0F);
                    var9.method3770(-1.0F);
                    var9.method3770(0.0F);
                    var9.method3770(0.0F);
                    var9.method3770(-1.0F);
                    var9.method3770(0.0F);
                }
            }
            var9.method3761();
            this.field4815.method1494(5069);
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 251)
    public static void method2168(int arg0) {
        field4814 = null;
        field4810 = null;
        if (arg0 != -21026) {
            field4819 = -107;
        }
        field4812 = null;
        field4802 = null;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lgt;II)V", line = 267)
    private final void method2169(class453 arg0, int arg1, int arg2) {
        field4806++;
        int var4 = 0;
        class25 var5 = arg0.method2742(arg1 - 6167);
        float var6 = var5.field360;
        float var7 = var5.field353;
        float var8 = var5.field315;
        float var9 = var5.field330;
        float var10 = var5.field367;
        if (arg1 != 6182) {
            this.field4803 = null;
        }
        float var11 = var5.field348;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field4809.method1492((byte) -20, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method2764(var21, (byte) -76);
        if (Stream.method3762()) {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field4818[var48] > 64 ? 64 : this.field4818[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class232 var63 = this.field4807[var48][var50];
                        int var64 = var63.field3303;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field3297 >> 12);
                        float var70 = (float) (var63.field3295 >> 12);
                        float var71 = (float) (var63.field3300 >> 12);
                        int var72 = var63.field3305 >> 12;
                        var22.method3774((float) (-var72) * var12 + var69);
                        var22.method3774((float) (-var72) * var13 + var70);
                        var22.method3774((float) (-var72) * var14 + var71);
                        if (arg0.field6498 == 0) {
                            var22.method3773(var65, var66, var67, var68);
                        } else {
                            var22.method3771(var65, var66, var67, var68);
                        }
                        var22.method3774(0.0F);
                        var22.method3774(0.0F);
                        var22.method3774((float) var72 * var15 + var69);
                        var22.method3774((float) var72 * var16 + var70);
                        var22.method3774((float) var72 * var17 + var71);
                        if (arg0.field6498 == 0) {
                            var22.method3773(var65, var66, var67, var68);
                        } else {
                            var22.method3771(var65, var66, var67, var68);
                        }
                        var22.method3774(1.0F);
                        var22.method3774(0.0F);
                        var22.method3774((float) var72 * var12 + var69);
                        var22.method3774((float) var72 * var13 + var70);
                        var22.method3774((float) var72 * var14 + var71);
                        if (arg0.field6498 == 0) {
                            var22.method3773(var65, var66, var67, var68);
                        } else {
                            var22.method3771(var65, var66, var67, var68);
                        }
                        var22.method3774(1.0F);
                        var22.method3774(1.0F);
                        var22.method3774((float) var72 * var18 + var69);
                        var22.method3774((float) var72 * var19 + var70);
                        var22.method3774((float) var72 * var20 + var71);
                        if (arg0.field6498 == 0) {
                            var22.method3773(var65, var66, var67, var68);
                        } else {
                            var22.method3771(var65, var66, var67, var68);
                        }
                        var22.method3774(0.0F);
                        var4++;
                        var22.method3774(1.0F);
                    }
                    if (this.field4818[var48] > 64) {
                        int var51 = this.field4818[var48] - 65;
                        for (int var52 = this.field4804[var51] - 1; var52 >= 0; var52--) {
                            class232 var53 = this.field4821[var51][var52];
                            int var54 = var53.field3303;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field3297 >> 12);
                            float var60 = (float) (var53.field3295 >> 12);
                            float var61 = (float) (var53.field3300 >> 12);
                            int var62 = var53.field3305 >> 12;
                            var22.method3774((float) (-var62) * var12 + var59);
                            var22.method3774((float) (-var62) * var13 + var60);
                            var22.method3774((float) (-var62) * var14 + var61);
                            if (arg0.field6498 == 0) {
                                var22.method3773(var55, var56, var57, var58);
                            } else {
                                var22.method3771(var55, var56, var57, var58);
                            }
                            var22.method3774(0.0F);
                            var22.method3774(0.0F);
                            var22.method3774((float) var62 * var15 + var59);
                            var22.method3774((float) var62 * var16 + var60);
                            var22.method3774((float) var62 * var17 + var61);
                            if (arg0.field6498 == 0) {
                                var22.method3773(var55, var56, var57, var58);
                            } else {
                                var22.method3771(var55, var56, var57, var58);
                            }
                            var22.method3774(1.0F);
                            var22.method3774(0.0F);
                            var22.method3774((float) var62 * var12 + var59);
                            var22.method3774((float) var62 * var13 + var60);
                            var22.method3774((float) var62 * var14 + var61);
                            if (arg0.field6498 == 0) {
                                var22.method3773(var55, var56, var57, var58);
                            } else {
                                var22.method3771(var55, var56, var57, var58);
                            }
                            var22.method3774(1.0F);
                            var22.method3774(1.0F);
                            var22.method3774((float) var62 * var18 + var59);
                            var22.method3774((float) var62 * var19 + var60);
                            var22.method3774((float) var62 * var20 + var61);
                            if (arg0.field6498 == 0) {
                                var22.method3773(var55, var56, var57, var58);
                            } else {
                                var22.method3771(var55, var56, var57, var58);
                            }
                            var22.method3774(0.0F);
                            var4++;
                            var22.method3774(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field4818[var23] <= 64 ? this.field4818[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class232 var38 = this.field4807[var23][var25];
                        int var39 = var38.field3303;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field3297 >> 12);
                        float var45 = (float) (var38.field3295 >> 12);
                        float var46 = (float) (var38.field3300 >> 12);
                        int var47 = var38.field3305 >> 12;
                        var22.method3770((float) (-var47) * var12 + var44);
                        var22.method3770((float) (-var47) * var13 + var45);
                        var22.method3770((float) (-var47) * var14 + var46);
                        if (arg0.field6498 == 0) {
                            var22.method3773(var40, var41, var42, var43);
                        } else {
                            var22.method3771(var40, var41, var42, var43);
                        }
                        var22.method3770(0.0F);
                        var22.method3770(0.0F);
                        var22.method3770((float) var47 * var15 + var44);
                        var22.method3770((float) var47 * var16 + var45);
                        var22.method3770((float) var47 * var17 + var46);
                        if (arg0.field6498 == 0) {
                            var22.method3773(var40, var41, var42, var43);
                        } else {
                            var22.method3771(var40, var41, var42, var43);
                        }
                        var22.method3770(1.0F);
                        var22.method3770(0.0F);
                        var22.method3770((float) var47 * var12 + var44);
                        var22.method3770((float) var47 * var13 + var45);
                        var22.method3770((float) var47 * var14 + var46);
                        if (arg0.field6498 == 0) {
                            var22.method3773(var40, var41, var42, var43);
                        } else {
                            var22.method3771(var40, var41, var42, var43);
                        }
                        var22.method3770(1.0F);
                        var22.method3770(1.0F);
                        var22.method3770((float) var47 * var18 + var44);
                        var22.method3770((float) var47 * var19 + var45);
                        var22.method3770((float) var47 * var20 + var46);
                        if (arg0.field6498 == 0) {
                            var22.method3773(var40, var41, var42, var43);
                        } else {
                            var22.method3771(var40, var41, var42, var43);
                        }
                        var22.method3770(0.0F);
                        var4++;
                        var22.method3770(1.0F);
                    }
                    if (this.field4818[var23] > 64) {
                        int var26 = this.field4818[var23] - 64 - 1;
                        for (int var27 = this.field4804[var26] - 1; var27 >= 0; var27--) {
                            class232 var28 = this.field4821[var26][var27];
                            int var29 = var28.field3303;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field3297 >> 12);
                            float var35 = (float) (var28.field3295 >> 12);
                            float var36 = (float) (var28.field3300 >> 12);
                            int var37 = var28.field3305 >> 12;
                            var22.method3770((float) (-var37) * var12 + var34);
                            var22.method3770((float) (-var37) * var13 + var35);
                            var22.method3770((float) (-var37) * var14 + var36);
                            if (arg0.field6498 == 0) {
                                var22.method3773(var30, var31, var32, var33);
                            } else {
                                var22.method3771(var30, var31, var32, var33);
                            }
                            var22.method3770(0.0F);
                            var22.method3770(0.0F);
                            var22.method3770((float) var37 * var15 + var34);
                            var22.method3770((float) var37 * var16 + var35);
                            var22.method3770((float) var37 * var17 + var36);
                            if (arg0.field6498 == 0) {
                                var22.method3773(var30, var31, var32, var33);
                            } else {
                                var22.method3771(var30, var31, var32, var33);
                            }
                            var22.method3770(1.0F);
                            var22.method3770(0.0F);
                            var22.method3770((float) var37 * var12 + var34);
                            var22.method3770((float) var37 * var13 + var35);
                            var22.method3770((float) var37 * var14 + var36);
                            if (arg0.field6498 == 0) {
                                var22.method3773(var30, var31, var32, var33);
                            } else {
                                var22.method3771(var30, var31, var32, var33);
                            }
                            var22.method3770(1.0F);
                            var22.method3770(1.0F);
                            var22.method3770((float) var37 * var18 + var34);
                            var22.method3770((float) var37 * var19 + var35);
                            var22.method3770((float) var37 * var20 + var36);
                            if (arg0.field6498 == 0) {
                                var22.method3773(var30, var31, var32, var33);
                            } else {
                                var22.method3771(var30, var31, var32, var33);
                            }
                            var22.method3770(0.0F);
                            var22.method3770(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method3761();
        if (this.field4809.method1494(arg1 - 1113)) {
            arg0.method1059(this.field4809, 0, -66);
            arg0.method1059(this.field4815, 1, -116);
            arg0.method1014(this.field4813, false);
            arg0.method1046(0, var4 * 4, this.field4803, (byte) -72, var4 * 2, class428.field5978, 0);
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lgt;B)V", line = 652)
    private final void method2170(class453 arg0, byte arg1) {
        field4801++;
        arg0.method2715(true, -83);
        arg0.method2770(4862, true);
        if (class153.field2307 != arg0.field6493) {
            arg0.method552(class153.field2307);
        }
        int var3 = 7 / ((arg1 + 6) / 48);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lgt;Z)V", line = 681)
    private final void method2171(class453 arg0, boolean arg1) {
        field4805++;
        class153.field2307 = arg0.field6493;
        if (!arg1) {
            field4819 = -126;
        }
        arg0.method2760(6);
        arg0.method2770(4862, false);
        arg0.method2715(false, -48);
        arg0.method2711(-66);
    }
}
