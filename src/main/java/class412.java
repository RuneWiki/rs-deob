import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class412 {

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "[I")
    private int[] field5637 = new int[1600];

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "[I")
    private int[] field5641 = new int[64];

    @OriginalMember(owner = "client!kca", name = "m", descriptor = "[I")
    private int[] field5645 = new int[8191];

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "[[Lbd;")
    private class484[][] field5636 = new class484[64][768];

    @OriginalMember(owner = "client!kca", name = "q", descriptor = "[[Lbd;")
    private class484[][] field5649 = new class484[1600][64];

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "I")
    private int field5642 = 0;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "Lija;")
    private class161 field5639;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "Lwba;")
    private class601 field5640;

    @OriginalMember(owner = "client!kca", name = "s", descriptor = "Lwba;")
    private class601 field5651;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "Lvv;")
    private class463 field5634;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!kca", name = "k", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!kca", name = "l", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!kca", name = "n", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!kca", name = "o", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!kca", name = "r", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IILmj;)V", line = 5)
    private final void method2422(int arg0, int arg1, class114 arg2) {
        field5650++;
        int var4 = 0;
        class742 var5 = arg2.method1018(70);
        float var6 = var5.field10270;
        float var7 = var5.field10303;
        float var8 = var5.field10287;
        float var9 = var5.field10273;
        float var10 = var5.field10264;
        float var11 = var5.field10298;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        if (arg0 <= 123) {
            return;
        }
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field5640.method39(true, 62);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg2.method1007(1, var21);
        if (Stream.method2263()) {
            for (int var23 = arg1 - 1; var23 >= 0; var23--) {
                int var24 = this.field5637[var23] <= 64 ? this.field5637[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class484 var38 = this.field5649[var23][var25];
                        int var39 = var38.field6683;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field6681 >> 12);
                        float var45 = (float) (var38.field6684 >> 12);
                        float var46 = (float) (var38.field6685 >> 12);
                        int var47 = var38.field6689 >> 12;
                        var22.method2251((float) (-var47) * var12 + var44);
                        var22.method2251((float) (-var47) * var13 + var45);
                        var22.method2251((float) (-var47) * var14 + var46);
                        if (arg2.field1920 == 0) {
                            var22.method2253(var40, var41, var42, var43);
                        } else {
                            var22.method2257(var40, var41, var42, var43);
                        }
                        var22.method2251(0.0F);
                        var22.method2251(0.0F);
                        var22.method2251((float) var47 * var15 + var44);
                        var22.method2251((float) var47 * var16 + var45);
                        var22.method2251((float) var47 * var17 + var46);
                        if (arg2.field1920 == 0) {
                            var22.method2253(var40, var41, var42, var43);
                        } else {
                            var22.method2257(var40, var41, var42, var43);
                        }
                        var22.method2251(1.0F);
                        var22.method2251(0.0F);
                        var22.method2251((float) var47 * var12 + var44);
                        var22.method2251((float) var47 * var13 + var45);
                        var22.method2251((float) var47 * var14 + var46);
                        if (arg2.field1920 == 0) {
                            var22.method2253(var40, var41, var42, var43);
                        } else {
                            var22.method2257(var40, var41, var42, var43);
                        }
                        var22.method2251(1.0F);
                        var22.method2251(1.0F);
                        var22.method2251((float) var47 * var18 + var44);
                        var22.method2251((float) var47 * var19 + var45);
                        var22.method2251((float) var47 * var20 + var46);
                        if (arg2.field1920 == 0) {
                            var22.method2253(var40, var41, var42, var43);
                        } else {
                            var22.method2257(var40, var41, var42, var43);
                        }
                        var22.method2251(0.0F);
                        var22.method2251(1.0F);
                        var4++;
                    }
                    if (this.field5637[var23] > 64) {
                        int var26 = this.field5637[var23] - 65;
                        for (int var27 = this.field5641[var26] - 1; var27 >= 0; var27--) {
                            class484 var28 = this.field5636[var26][var27];
                            int var29 = var28.field6683;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field6681 >> 12);
                            float var35 = (float) (var28.field6684 >> 12);
                            float var36 = (float) (var28.field6685 >> 12);
                            int var37 = var28.field6689 >> 12;
                            var22.method2251((float) (-var37) * var12 + var34);
                            var22.method2251((float) (-var37) * var13 + var35);
                            var22.method2251((float) (-var37) * var14 + var36);
                            if (arg2.field1920 == 0) {
                                var22.method2253(var30, var31, var32, var33);
                            } else {
                                var22.method2257(var30, var31, var32, var33);
                            }
                            var22.method2251(0.0F);
                            var22.method2251(0.0F);
                            var22.method2251((float) var37 * var15 + var34);
                            var22.method2251((float) var37 * var16 + var35);
                            var22.method2251((float) var37 * var17 + var36);
                            if (arg2.field1920 == 0) {
                                var22.method2253(var30, var31, var32, var33);
                            } else {
                                var22.method2257(var30, var31, var32, var33);
                            }
                            var22.method2251(1.0F);
                            var22.method2251(0.0F);
                            var22.method2251((float) var37 * var12 + var34);
                            var22.method2251((float) var37 * var13 + var35);
                            var22.method2251((float) var37 * var14 + var36);
                            if (arg2.field1920 == 0) {
                                var22.method2253(var30, var31, var32, var33);
                            } else {
                                var22.method2257(var30, var31, var32, var33);
                            }
                            var22.method2251(1.0F);
                            var22.method2251(1.0F);
                            var22.method2251((float) var37 * var18 + var34);
                            var22.method2251((float) var37 * var19 + var35);
                            var22.method2251((float) var37 * var20 + var36);
                            if (arg2.field1920 == 0) {
                                var22.method2253(var30, var31, var32, var33);
                            } else {
                                var22.method2257(var30, var31, var32, var33);
                            }
                            var22.method2251(0.0F);
                            var22.method2251(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg1 - 1; var48 >= 0; var48--) {
                int var49 = this.field5637[var48] <= 64 ? this.field5637[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class484 var63 = this.field5649[var48][var50];
                        int var64 = var63.field6683;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field6681 >> 12);
                        float var70 = (float) (var63.field6684 >> 12);
                        float var71 = (float) (var63.field6685 >> 12);
                        int var72 = var63.field6689 >> 12;
                        var22.method2258((float) (-var72) * var12 + var69);
                        var22.method2258((float) (-var72) * var13 + var70);
                        var22.method2258((float) (-var72) * var14 + var71);
                        if (arg2.field1920 == 0) {
                            var22.method2253(var65, var66, var67, var68);
                        } else {
                            var22.method2257(var65, var66, var67, var68);
                        }
                        var22.method2258(0.0F);
                        var22.method2258(0.0F);
                        var22.method2258((float) var72 * var15 + var69);
                        var22.method2258((float) var72 * var16 + var70);
                        var22.method2258((float) var72 * var17 + var71);
                        if (arg2.field1920 == 0) {
                            var22.method2253(var65, var66, var67, var68);
                        } else {
                            var22.method2257(var65, var66, var67, var68);
                        }
                        var22.method2258(1.0F);
                        var22.method2258(0.0F);
                        var22.method2258((float) var72 * var12 + var69);
                        var22.method2258((float) var72 * var13 + var70);
                        var22.method2258((float) var72 * var14 + var71);
                        if (arg2.field1920 == 0) {
                            var22.method2253(var65, var66, var67, var68);
                        } else {
                            var22.method2257(var65, var66, var67, var68);
                        }
                        var22.method2258(1.0F);
                        var22.method2258(1.0F);
                        var22.method2258((float) var72 * var18 + var69);
                        var22.method2258((float) var72 * var19 + var70);
                        var22.method2258((float) var72 * var20 + var71);
                        if (arg2.field1920 == 0) {
                            var22.method2253(var65, var66, var67, var68);
                        } else {
                            var22.method2257(var65, var66, var67, var68);
                        }
                        var22.method2258(0.0F);
                        var4++;
                        var22.method2258(1.0F);
                    }
                    if (this.field5637[var48] > 64) {
                        int var51 = this.field5637[var48] - 65;
                        for (int var52 = this.field5641[var51] - 1; var52 >= 0; var52--) {
                            class484 var53 = this.field5636[var51][var52];
                            int var54 = var53.field6683;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field6681 >> 12);
                            float var60 = (float) (var53.field6684 >> 12);
                            float var61 = (float) (var53.field6685 >> 12);
                            int var62 = var53.field6689 >> 12;
                            var22.method2258((float) (-var62) * var12 + var59);
                            var22.method2258((float) (-var62) * var13 + var60);
                            var22.method2258((float) (-var62) * var14 + var61);
                            if (arg2.field1920 == 0) {
                                var22.method2253(var55, var56, var57, var58);
                            } else {
                                var22.method2257(var55, var56, var57, var58);
                            }
                            var22.method2258(0.0F);
                            var22.method2258(0.0F);
                            var22.method2258((float) var62 * var15 + var59);
                            var22.method2258((float) var62 * var16 + var60);
                            var22.method2258((float) var62 * var17 + var61);
                            if (arg2.field1920 == 0) {
                                var22.method2253(var55, var56, var57, var58);
                            } else {
                                var22.method2257(var55, var56, var57, var58);
                            }
                            var22.method2258(1.0F);
                            var22.method2258(0.0F);
                            var22.method2258((float) var62 * var12 + var59);
                            var22.method2258((float) var62 * var13 + var60);
                            var22.method2258((float) var62 * var14 + var61);
                            if (arg2.field1920 == 0) {
                                var22.method2253(var55, var56, var57, var58);
                            } else {
                                var22.method2257(var55, var56, var57, var58);
                            }
                            var22.method2258(1.0F);
                            var22.method2258(1.0F);
                            var22.method2258((float) var62 * var18 + var59);
                            var22.method2258((float) var62 * var19 + var60);
                            var22.method2258((float) var62 * var20 + var61);
                            if (arg2.field1920 == 0) {
                                var22.method2253(var55, var56, var57, var58);
                            } else {
                                var22.method2257(var55, var56, var57, var58);
                            }
                            var22.method2258(0.0F);
                            var4++;
                            var22.method2258(1.0F);
                        }
                    }
                }
            }
        }
        var22.method2255();
        if (this.field5640.method36(6740)) {
            arg2.method71((byte) -43, 0, this.field5640);
            arg2.method71((byte) -43, 1, this.field5651);
            arg2.method89(this.field5639, 127);
            arg2.method140(0, var4 * 4, this.field5634, class710.field9929, 0, 0, var4 * 2);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILmj;ILgka;)V", line = 391)
    public final void method2423(int arg0, class114 arg1, int arg2, class667 arg3) {
        field5643++;
        if (arg1.field1843 == null) {
            return;
        }
        if (arg0 < 0) {
            this.method2424(arg2 ^ 0xFFFFF250, arg1);
        } else {
            this.method2430(arg0, (byte) 52, arg1);
        }
        float var5 = arg1.field1843.field10305;
        float var6 = arg1.field1843.field10267;
        float var7 = arg1.field1843.field10307;
        float var8 = arg1.field1843.field10278;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            if (arg2 != -17047) {
                return;
            }
            int var11 = 0;
            class155 var12 = arg3.field9377.field4973;
            for (class155 var13 = var12.field2450; var13 != var12; var13 = var13.field2450) {
                class484 var14 = (class484) var13;
                int var15 = (int) ((float) (var14.field6685 >> 12) * var7 + (float) (var14.field6684 >> 12) * var6 + (float) (var14.field6681 >> 12) * var5 + var8);
                this.field5645[var9++] = var15;
                if (var11 < var15) {
                    var11 = var15;
                }
                if (var15 < var10) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 <= 1600) {
                var17 = 0;
                var16 += 2;
            } else {
                var17 = class269.method1718(var16, 0) + 1 - class545.field7560;
                var16 = (var16 >> var17) + 2;
            }
            class155 var18 = var12.field2450;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field5642 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field5637[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field5641[var24] = 0;
                }
                while (var12 != var18) {
                    class484 var25 = (class484) var18;
                    if (var22) {
                        var20 = var25.field6687;
                        var21 = var25.field6690;
                        var22 = false;
                    }
                    if (var19 > 0 && (var25.field6687 != var20 || var25.field6690 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field5645[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field5637[var26] < 64) {
                            this.field5649[var26][this.field5637[var26]++] = var25;
                        } else {
                            label100: {
                                if (this.field5637[var26] == 64) {
                                    if (this.field5642 == 64) {
                                        break label100;
                                    }
                                    this.field5637[var26] += this.field5642++ + 1;
                                }
                                this.field5636[this.field5637[var26] - 65][this.field5641[this.field5637[var26] - 64 - 1]++] = var25;
                            }
                        }
                    }
                    var18 = var18.field2450;
                }
                arg1.method963(var20 < 0 ? -1 : var20, false, (byte) -124, false);
                if (var21 && class630.field8927 != arg1.field1867) {
                    arg1.method516(class630.field8927);
                } else if (arg1.field1867 != 1.0F) {
                    arg1.method516(1.0F);
                }
                this.method2422(arg2 ^ 0xFFFFBD17, var16, arg1);
            }
        } catch (Exception var27) {
        }
        this.method2429((byte) -33, arg1);
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lmj;)V", line = 690)
    public class412(class114 arg0) {
        this.field5639 = arg0.method126(10, new class249[] { new class249(new class664[] { class664.field9349, class664.field9351, class664.field9353 }), new class249(class664.field9350) });
        this.field5640 = arg0.method135(true, 0);
        this.field5651 = arg0.method135(false, 0);
        this.field5651.method41(393168, (byte) -114, 12);
        this.field5634 = arg0.method84(-107, false);
        this.field5634.method602(17154, 49146);
        Buffer var2 = this.field5634.method1440(true, -15169);
        if (var2 != null) {
            Stream var3 = arg0.method1007(1, var2);
            if (Stream.method2263()) {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method2259(var5);
                    var3.method2259(var5 + 1);
                    var3.method2259(var5 + 2);
                    var3.method2259(var5 + 2);
                    var3.method2259(var5 + 3);
                    var3.method2259(var5);
                }
            } else {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method2252(var7);
                    var3.method2252(var7 + 1);
                    var3.method2252(var7 + 2);
                    var3.method2252(var7 + 2);
                    var3.method2252(var7 + 3);
                    var3.method2252(var7);
                }
            }
            var3.method2255();
            this.field5634.method1441(32416);
        }
        Buffer var8 = this.field5651.method39(true, 79);
        if (var8 != null) {
            Stream var9 = arg0.method1007(1, var8);
            if (Stream.method2263()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method2251(0.0F);
                    var9.method2251(-1.0F);
                    var9.method2251(0.0F);
                    var9.method2251(0.0F);
                    var9.method2251(-1.0F);
                    var9.method2251(0.0F);
                    var9.method2251(0.0F);
                    var9.method2251(-1.0F);
                    var9.method2251(0.0F);
                    var9.method2251(0.0F);
                    var9.method2251(-1.0F);
                    var9.method2251(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method2258(0.0F);
                    var9.method2258(-1.0F);
                    var9.method2258(0.0F);
                    var9.method2258(0.0F);
                    var9.method2258(-1.0F);
                    var9.method2258(0.0F);
                    var9.method2258(0.0F);
                    var9.method2258(-1.0F);
                    var9.method2258(0.0F);
                    var9.method2258(0.0F);
                    var9.method2258(-1.0F);
                    var9.method2258(0.0F);
                }
            }
            var9.method2255();
            this.field5651.method36(6740);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILmj;)V", line = 566)
    private final void method2424(int arg0, class114 arg1) {
        class630.field8927 = arg1.field1867;
        field5648++;
        arg1.method989(-125);
        arg1.method1000(false, -125);
        arg1.method960(false, arg0 ^ arg0);
        arg1.method977((byte) -68);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lmj;B)V", line = 578)
    public final void method2425(class114 arg0, byte arg1) {
        if (arg1 < -83) {
            field5644++;
            this.field5640.method41(786336, (byte) -124, 24);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V", line = 591)
    public final void method2426(byte arg0) {
        field5638++;
        this.field5640.method32(16479);
        if (arg0 != 95) {
            this.method2426((byte) -107);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)Ljg;", line = 602)
    public static final class770 method2427(int arg0) {
        field5635++;
        if (class751.field10432 == null || class379.field5312 == null) {
            return null;
        }
        class770 var1 = (class770) class379.field5312.method3957(-110);
        if (arg0 <= 71) {
            return null;
        }
        while (var1 != null) {
            class548 var2 = class751.field10415.method4105(var1.field10634, -66);
            if (var2 != null && var2.field7603 && var2.method3168((byte) -118, class751.field10417)) {
                return var1;
            }
            var1 = (class770) class379.field5312.method3957(-124);
        }
        return null;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 646)
    public static final void method2428(String arg0, int arg1) {
        System.out.println("Error: " + class486.method2857((byte) -92, "%0a", "\n", arg0));
        field5647++;
        if (arg1 == -1) {
            ;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(BLmj;)V", line = 657)
    private final void method2429(byte arg0, class114 arg1) {
        arg1.method960(true, 0);
        field5633++;
        arg1.method1000(true, -125);
        if (class630.field8927 != arg1.field1867) {
            arg1.method516(class630.field8927);
        }
        if (arg0 != -33) {
            this.method2429((byte) 43, null);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IBLmj;)V", line = 675)
    private final void method2430(int arg0, byte arg1, class114 arg2) {
        field5646++;
        int var4 = 58 % ((-arg1 - 9) / 61);
        class630.field8927 = arg2.field1867;
        arg2.method966((float) arg0, (byte) 126);
        arg2.method954(0);
        arg2.method1000(false, -125);
        arg2.method960(false, 0);
        arg2.method977((byte) -68);
    }
}
