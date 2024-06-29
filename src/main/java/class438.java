import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class438 extends class214 {

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
    private int field5995 = 1;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    private int field6000 = 2048;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "[S")
    private short[] field6001 = new short[512];

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    private int field6002 = 2;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
    private int field5999 = 5;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "[B")
    private byte[] field6003 = new byte[512];

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
    private int field5994 = 0;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
    private int field6009 = 5;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "Lfn;")
    public static class52 field6007 = new class52(56, -1);

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "[[S")
    public static short[][] field6008 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "Ltm;")
    public static class112 field6011 = new class112("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "[[I")
    public static int[][] field6013 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "[Ljava/lang/String;")
    public static String[] field6012;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIILes;)V")
    public static final void method2543(int arg0, int arg1, int arg2, int arg3, class75 arg4) {
        ++field6005;
        int var5 = -29 / ((-28 - arg1) / 62);
        class318 var6 = arg4.method517(-90);
        int var7 = 16383 & arg4.field1075 - arg4.field1076.field1030;
        if (~arg2 != 0) {
            if (arg4.field1096 == -1 || ~var7 > -10241 && ~var7 < -2049) {
                if (var7 == 0 && arg4.field1099 <= 25) {
                    if (arg2 == 2 && var6.field4348 != -1) {
                        arg4.field1089 = var6.field4348;
                    } else if (arg2 == 0 && var6.field4350 != -1) {
                        arg4.field1089 = var6.field4350;
                    } else {
                        arg4.field1089 = var6.field4342;
                    }
                    arg4.field1127 = false;
                } else {
                    if (arg2 == 2 && var6.field4348 != -1) {
                        if (~arg3 > -1 && var6.field4345 != -1) {
                            arg4.field1089 = var6.field4345;
                        } else if (~arg3 < -1 && var6.field4332 != -1) {
                            arg4.field1089 = var6.field4332;
                        } else {
                            arg4.field1089 = var6.field4348;
                        }
                    } else if (~arg2 == -1 && var6.field4350 != -1) {
                        if (arg3 < 0 && ~var6.field4355 != 0) {
                            arg4.field1089 = var6.field4355;
                        } else if (arg3 > 0 && ~var6.field4340 != 0) {
                            arg4.field1089 = var6.field4340;
                        } else {
                            arg4.field1089 = var6.field4350;
                        }
                    } else if (arg3 < 0 && ~var6.field4330 != 0) {
                        arg4.field1089 = var6.field4330;
                    } else if (arg3 > 0 && ~var6.field4359 != 0) {
                        arg4.field1089 = var6.field4359;
                    } else {
                        arg4.field1089 = var6.field4342;
                    }
                    arg4.field1127 = false;
                }
            } else {
                int var8 = class227.field3210[arg0] + -arg4.field1076.field1030 & 16383;
                if (~arg2 == -3 && ~var6.field4348 != 0) {
                    if (var8 > 2048 && ~var8 >= -6145 && ~var6.field4352 != 0) {
                        arg4.field1089 = var6.field4352;
                    } else if (var8 >= 10240 && var8 < 14336 && var6.field4317 != -1) {
                        arg4.field1089 = var6.field4317;
                    } else if (~var8 < -6145 && ~var8 > -10241 && var6.field4312 != -1) {
                        arg4.field1089 = var6.field4312;
                    } else {
                        arg4.field1089 = var6.field4348;
                    }
                } else if (arg2 == 0 && ~var6.field4350 != 0) {
                    if (var8 > 2048 && var8 <= 6144 && var6.field4329 != -1) {
                        arg4.field1089 = var6.field4329;
                    } else if (~var8 <= -10241 && var8 < 14336 && var6.field4315 != -1) {
                        arg4.field1089 = var6.field4315;
                    } else if (~var8 < -6145 && ~var8 > -10241 && ~var6.field4357 != 0) {
                        arg4.field1089 = var6.field4357;
                    } else {
                        arg4.field1089 = var6.field4350;
                    }
                } else if (~var8 < -2049 && ~var8 >= -6145 && var6.field4351 != -1) {
                    arg4.field1089 = var6.field4351;
                } else if (var8 >= 10240 && ~var8 > -14337 && ~var6.field4337 != 0) {
                    arg4.field1089 = var6.field4337;
                } else if (~var8 < -6145 && var8 < 10240 && var6.field4318 != -1) {
                    arg4.field1089 = var6.field4318;
                } else {
                    arg4.field1089 = var6.field4342;
                }
                arg4.field1127 = false;
            }
        } else if (var7 == 0 && arg4.field1099 <= 25) {
            if (!arg4.field1127 || !var6.method1924((byte) -66, arg4.field1089)) {
                arg4.field1089 = var6.method1917(-13087);
                arg4.field1127 = ~arg4.field1089 != 0;
            }
        } else {
            arg4.field1127 = false;
            if (~arg3 > -1 && ~var6.field4349 != 0) {
                arg4.field1089 = var6.field4349;
            } else if (arg3 > 0 && ~var6.field4311 != 0) {
                arg4.field1089 = var6.field4311;
            } else {
                arg4.field1089 = var6.field4342;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        if (arg0 != 123) {
            field6012 = null;
        }
        ++field5997;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (super.field3024.field6135) {
            int var4 = class56.field909[arg1] * this.field6009 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class399.field5585 < ~var7; ++var7) {
                class175.field2580 = Integer.MAX_VALUE;
                class382.field5419 = Integer.MAX_VALUE;
                class148.field2099 = Integer.MAX_VALUE;
                class66.field982 = Integer.MAX_VALUE;
                int var8 = class436.field5989[var7] * this.field5999 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; ~var11 >= ~var6; ++var11) {
                    int var13 = this.field6003[255 & (~var11 <= ~this.field6009 ? var11 - this.field6009 : var11)] & 255;
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = (255 & this.field6003[255 & (~this.field5999 >= ~var14 ? -this.field5999 + var14 : var14) + var13]) * 2;
                        int var10001 = var14 << 12;
                        int var27 = var15 + 1;
                        int var16 = var8 - (var10001 + this.field6001[var15]);
                        int var17 = -(var11 << 12) + var4 + -this.field6001[var27];
                        int var18 = this.field5995;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var16 >= 0 ? var16 : -var16) + (var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 > -1 ? -var17 : var17;
                                int var26 = var16 < 0 ? -var16 : var16;
                                var19 = var26 <= var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class66.field982 > var19) {
                            class175.field2580 = class382.field5419;
                            class382.field5419 = class148.field2099;
                            class148.field2099 = class66.field982;
                            class66.field982 = var19;
                        } else if (class148.field2099 > var19) {
                            class175.field2580 = class382.field5419;
                            class382.field5419 = class148.field2099;
                            class148.field2099 = var19;
                        } else if (~var19 > ~class382.field5419) {
                            class175.field2580 = class382.field5419;
                            class382.field5419 = var19;
                        } else if (var19 < class175.field2580) {
                            class175.field2580 = var19;
                        }
                    }
                }
                int var12 = this.field6002;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = class148.field2099 - class66.field982;
                                }
                            } else {
                                var3[var7] = class175.field2580;
                            }
                        } else {
                            var3[var7] = class382.field5419;
                        }
                    } else {
                        var3[var7] = class148.field2099;
                    }
                } else {
                    var3[var7] = class66.field982;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field6009 = arg0.method2503(true);
                                }
                            } else {
                                this.field5999 = arg0.method2503(true);
                            }
                        } else {
                            this.field5995 = arg0.method2503(true);
                        }
                    } else {
                        this.field6002 = arg0.method2503(true);
                    }
                } else {
                    this.field6000 = arg0.method2508(true);
                }
            } else {
                this.field5994 = arg0.method2503(true);
            }
        } else {
            this.field5999 = this.field6009 = arg0.method2503(true);
        }
        if (arg1 > -114) {
            method2545(-96);
        }
        ++field5996;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class438() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
    public final void method12(int arg0) {
        this.field6003 = class350.method2094(this.field5994, (byte) -119);
        ++field5998;
        this.method2547((byte) -112);
        if (arg0 != 27108) {
            this.method14((byte) -110, 5);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lca;ZIII)V")
    public static final void method2544(class155 arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field6004;
        long var5 = (long) (arg3 | arg4 << 28 | arg2 << 14);
        class418 var7 = (class418) class135.field1898.method2614(var5, -78);
        if (var7 == null) {
            class418 var8 = new class418();
            class135.field1898.method2620(var5, var8, false);
            var8.field5749.method1553((byte) -105, arg0);
        } else {
            if (arg1) {
                field6011 = null;
            }
            class164 var9 = class58.field918.method344(arg0.field2233, 31757);
            int var10 = var9.field2393;
            if (~var9.field2401 == -2) {
                var10 = (arg0.field2240 + 1) * var10;
            }
            for (class155 var11 = (class155) var7.field5749.method1544(-91); var11 != null; var11 = (class155) var7.field5749.method1546((byte) -42)) {
                class164 var12 = class58.field918.method344(var11.field2233, 31757);
                int var13 = var12.field2393;
                if (var12.field2401 == 1) {
                    var13 = (var11.field2240 + 1) * var13;
                }
                if (var10 > var13) {
                    class67.method471(arg0, var11, 2047);
                    return;
                }
            }
            var7.field5749.method1553((byte) -125, arg0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V")
    public static void method2545(int arg0) {
        field6008 = null;
        field6007 = null;
        field6013 = null;
        field6011 = null;
        field6012 = null;
        if (arg0 != 684) {
            method2546(-68, -123, -19, 38, -60, -80, 103);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class479.method2824(arg6, (byte) -59);
        ++field6010;
        int var7 = 0;
        int var8 = -arg2 + arg6;
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        if (arg1 <= 86) {
            method2543(86, 26, 28, 93, (class75) null);
        }
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class2.field16[arg3];
        int var16 = -var8 + arg5;
        int var17 = arg5 + var8;
        class80.method554(var15, 115, arg0, var16, -arg6 + arg5);
        class80.method554(var15, 91, arg4, var17, var16);
        class80.method554(var15, 103, arg0, arg5 + arg6, var17);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (~var12 <= -1 && ~var11 <= -2) {
                client.field5498[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (~var10 <= -1) {
                --var9;
                if (~var9 <= ~var8) {
                    int[] var18 = class2.field16[arg3 - -var9];
                    int[] var19 = class2.field16[-var9 + arg3];
                    int var20 = arg5 + var7;
                    int var21 = -var7 + arg5;
                    class80.method554(var18, 105, arg0, var20, var21);
                    class80.method554(var19, 117, arg0, var20, var21);
                } else {
                    int[] var22 = class2.field16[arg3 + var9];
                    int[] var23 = class2.field16[-var9 + arg3];
                    int var24 = client.field5498[var9];
                    int var25 = arg5 + var7;
                    int var26 = -var7 + arg5;
                    int var27 = arg5 + var24;
                    int var28 = -var24 + arg5;
                    class80.method554(var22, 111, arg0, var28, var26);
                    class80.method554(var22, 110, arg4, var27, var28);
                    class80.method554(var22, 92, arg0, var25, var27);
                    class80.method554(var23, 103, arg0, var28, var26);
                    class80.method554(var23, 104, arg4, var27, var28);
                    class80.method554(var23, 111, arg0, var25, var27);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class2.field16[arg3 - -var7];
            int[] var30 = class2.field16[-var7 + arg3];
            int var31 = arg5 + var9;
            int var32 = -var9 + arg5;
            if (~var7 > ~var8) {
                int var33 = var11 >= var7 ? var11 : client.field5498[var7];
                int var34 = arg5 + var33;
                int var35 = arg5 - var33;
                class80.method554(var29, 98, arg0, var35, var32);
                class80.method554(var29, 120, arg4, var34, var35);
                class80.method554(var29, 111, arg0, var31, var34);
                class80.method554(var30, 123, arg0, var35, var32);
                class80.method554(var30, 99, arg4, var34, var35);
                class80.method554(var30, 107, arg0, var31, var34);
            } else {
                class80.method554(var29, 113, arg0, var31, var32);
                class80.method554(var30, 108, arg0, var31, var32);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    private final void method2547(byte arg0) {
        if (arg0 >= -8) {
            this.field5995 = -3;
        }
        ++field6006;
        Random var2 = new Random((long) this.field5994);
        this.field6001 = new short[512];
        if (~this.field6000 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field6001[var3] = (short) class10.method100((byte) -66, this.field6000, var2);
            }
        }
    }
}
