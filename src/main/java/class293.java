import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class293 extends class83 {

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    private int field3971 = 1024;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    private int field3972 = 1024;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
    private int field3978 = 0;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    private int field3969 = 1024;

    @OriginalMember(owner = "client!kf", name = "db", descriptor = "I")
    private int field3986 = 2048;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    private int field3968 = 0;

    @OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
    private int field3981 = 819;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    private int field3970 = 409;

    @OriginalMember(owner = "client!kf", name = "bb", descriptor = "I")
    private int field3984 = 1024;

    @OriginalMember(owner = "client!kf", name = "hb", descriptor = "Z")
    public static boolean field3990 = false;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "[[S")
    public static short[][] field3974 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!kf", name = "fb", descriptor = "Z")
    public static boolean field3988 = false;

    @OriginalMember(owner = "client!kf", name = "ib", descriptor = "I")
    public static int field3991 = 0;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    private int field3967;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!kf", name = "eb", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!kf", name = "gb", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!kf", name = "cb", descriptor = "Lal;")
    public static class369 field3985;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method37(int arg0, int arg1) {
        if (arg0 != 2) {
            this.field3967 = -19;
        }
        ++field3976;
        int[] var3 = super.field916.method1813(arg1, (byte) 122);
        if (super.field916.field4174) {
            int[][] var4 = super.field916.method1811((byte) -121);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class420.field6139 * this.field3969 >> 12;
            int var15 = class420.field6139 * this.field3986 >> 12;
            int var16 = class91.field1047 * this.field3970 >> 12;
            int var17 = class91.field1047 * this.field3981 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            } else {
                this.field3967 = class420.field6139 / 8 * this.field3971 >> 12;
                int var18 = class420.field6139 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field3968);
                while (true) {
                    while (true) {
                        int var22 = var14 - -class409.method2546(18992, var21, -var14 + var15);
                        int var23 = var16 - -class409.method2546(arg0 + 18990, var21, -var16 + var17);
                        int var24 = var8 + var22;
                        if (class420.field6139 < var24) {
                            var24 = class420.field6139;
                            var22 = -var8 + class420.field6139;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (~var29 > -1) {
                                var29 += class420.field6139;
                            }
                            if (class420.field6139 < var29) {
                                var29 -= class420.field6139;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var29 <= ~var30[0] && var29 <= var30[1]) {
                                    var25 = var27[2];
                                    if (~var9 != ~var26) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class420.field6139;
                                        }
                                        if (~var31 < ~class420.field6139) {
                                            var31 -= class420.field6139;
                                        }
                                        for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var9 - -var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; var28 >= var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 <= ~var29) {
                                                    if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class420.field6139;
                                                    } else {
                                                        var39 = Math.min(var29, var37);
                                                        var38 = 0;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method1730(var7 + var38, var4, var21, -13652, var25 - var35, var35, -var38 + var39);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var28;
                                ++var26;
                                if (var12 <= var26) {
                                    var26 = 0;
                                }
                            }
                        }
                        if (~class91.field1047 > ~(var25 - -var23)) {
                            var23 = -var25 + class91.field1047;
                        } else {
                            var10 = false;
                        }
                        if (class420.field6139 != var24) {
                            int[] var41 = var19[var13++];
                            var41[1] = var24;
                            var41[0] = var8;
                            var41[2] = var23 + var25;
                            this.method1730(var6 + var8, var4, var21, -13652, var23, var25, var22);
                            var8 = var24;
                        } else {
                            this.method1730(var8 - -var6, var4, var21, -13652, var23, var25, var22);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[2] = var23 + var25;
                            var42[0] = var8;
                            var42[1] = var24;
                            int[][] var43 = var20;
                            var20 = var19;
                            var19 = var43;
                            var12 = var13;
                            var13 = 0;
                            var7 = var6;
                            var6 = class409.method2546(arg0 + 18990, var21, class420.field6139);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class420.field6139 + var5;
                            }
                            if (~class420.field6139 > ~var44) {
                                var44 -= class420.field6139;
                            }
                            var9 = 0;
                            var11 = false;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var45[0] >= ~var44 && var45[1] >= var44) {
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(DI)V", line = 270)
    public static final void method1724(double arg0, int arg1) {
        if (arg1 <= 111) {
            field3985 = null;
        }
        ++field3979;
        if (class298.field4064 != arg0) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class173.field2168[var3] = var4 > 255 ? 255 : var4;
            }
            class298.field4064 = arg0;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V", line = 298)
    public final void method120(boolean arg0) {
        if (arg0) {
            method1729(-121);
        }
        ++field3973;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)Z", line = 308)
    public static final boolean method1725(byte arg0, int arg1) {
        ++field3983;
        if (arg1 != 40 && ~arg1 != -51 && arg1 != 37 && arg1 != 30 && ~arg1 != -13) {
            int var2 = 121 / ((-83 - arg0) / 35);
            return arg1 == 48 || arg1 == 20 || ~arg1 == -1012;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 770)
    public class293() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V", line = 330)
    public static void method1726(int arg0) {
        int var1 = 26 / ((arg0 - -31) / 63);
        field3985 = null;
        field3974 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLtq;)V", line = 342)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        int var4 = -77 / ((arg1 - -27) / 50);
        ++field3989;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (arg0 != 7) {
                                        if (arg0 == 8) {
                                            this.field3984 = arg2.method1374(-2);
                                        }
                                    } else {
                                        this.field3972 = arg2.method1374(-2);
                                    }
                                } else {
                                    this.field3978 = arg2.method1350(31351);
                                }
                            } else {
                                this.field3971 = arg2.method1374(-2);
                            }
                        } else {
                            this.field3981 = arg2.method1374(-2);
                        }
                    } else {
                        this.field3970 = arg2.method1374(-2);
                    }
                } else {
                    this.field3986 = arg2.method1374(-2);
                }
            } else {
                this.field3969 = arg2.method1374(-2);
            }
        } else {
            this.field3968 = arg2.method1350(31351);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(ZI)V", line = 457)
    public static final void method1727(boolean arg0, int arg1) {
        if (arg0) {
            if (class272.field3680 != -1) {
                class301.method1780(class272.field3680, (byte) -59);
            }
            for (class141 var2 = (class141) class337.field4495.method315((byte) -74); var2 != null; var2 = (class141) class337.field4495.method310(-84)) {
                if (!var2.method1970(-2)) {
                    var2 = (class141) class337.field4495.method315((byte) -68);
                    if (var2 == null) {
                        break;
                    }
                }
                class89.method494(false, var2, true, false);
            }
            class272.field3680 = -1;
            class337.field4495 = new class58(8);
            class63.method340((byte) 125);
            class272.field3680 = class145.field1870;
            class149.method798(false, false);
            class84.method458((byte) -111);
            class277.method1524(class272.field3680);
        }
        ++field3977;
        class69.method396(0);
        class373.field5205 = -1;
        class314.method1819(class12.field116, -110);
        class427.field6264 = new class158();
        class427.field6264.field154 = 6656;
        class427.field6264.field152 = 6656;
        class427.field6264.field6119[0] = 52;
        int var3 = 99 % ((-8 - arg1) / 63);
        class180.field2272 = 0;
        class127.field1633 = 0;
        class427.field6264.field6109[0] = 52;
        if (class294.field3993 == 2) {
            class127.field1633 = class324.field4324 << 7;
            class180.field2272 = class330.field4397 << 7;
        } else {
            class289.method1710(4602);
        }
        class232.method1258(95);
        if (~class127.field1633 != -1 && class180.field2272 != 0) {
            class209.method1135(-108);
            class352.method2159(28, (byte) 65);
        } else {
            class352.method2159(10, (byte) 65);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(BI)I", line = 527)
    public static final int method1728(byte arg0, int arg1) {
        if (arg0 < 36) {
            field3990 = true;
        }
        ++field3980;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V", line = 547)
    public static final void method1729(int arg0) {
        if (arg0 == 940) {
            class344.field4615.method606((byte) 94);
            ++field3982;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[[ILjava/util/Random;IIII)V", line = 559)
    private final void method1730(int arg0, int[][] arg1, Random arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3987;
        int var8 = this.field3984 > 0 ? -class409.method2546(arg3 ^ -32612, arg2, this.field3984) + 4096 : 4096;
        int var9 = this.field3972 * this.field3967 >> 12;
        if (arg3 == -13652) {
            int var10 = this.field3967 - (var9 <= 0 ? 0 : class409.method2546(18992, arg2, var9));
            if (class420.field6139 <= arg0) {
                arg0 -= class420.field6139;
            }
            if (var10 > 0) {
                if (~arg4 < -1 && arg6 > 0) {
                    int var11 = arg6 / 2;
                    int var12 = arg4 / 2;
                    int var13 = var11 < var10 ? var11 : var10;
                    int var14 = ~var12 > ~var10 ? var12 : var10;
                    int var15 = arg0 + var13;
                    int var16 = arg6 - var13 * 2;
                    for (int var17 = 0; ~arg4 < ~var17; ++var17) {
                        int[] var18 = arg1[arg5 + var17];
                        if (~var14 < ~var17) {
                            int var19 = var8 * var17 / var14;
                            if (this.field3978 != 0) {
                                for (int var20 = 0; var20 < var13; ++var20) {
                                    int var21 = var8 * var20 / var13;
                                    var18[class262.method1461(arg0 + var20, class213.field2881)] = var18[class262.method1461(class213.field2881, arg0 - 1 + -var20 + arg6)] = ~var21 > ~var19 ? var21 : var19;
                                }
                            } else {
                                for (int var22 = 0; var13 > var22; ++var22) {
                                    int var24 = var8 * var22 / var13;
                                    var18[class262.method1461(class213.field2881, arg0 + var22)] = var18[class262.method1461(class213.field2881, arg0 + arg6 + -var22 + -1)] = var19 * var24 >> 12;
                                }
                            }
                            if (~(var15 + var16) >= ~class420.field6139) {
                                class358.method2180(var18, var15, var16, var19);
                            } else {
                                int var23 = -var15 + class420.field6139;
                                class358.method2180(var18, var15, var23, var19);
                                class358.method2180(var18, 0, var16 - var23, var19);
                            }
                        } else {
                            int var25 = -var17 - 1 + arg4;
                            if (var25 < var14) {
                                int var26 = var8 * var25 / var14;
                                if (~this.field3978 != -1) {
                                    for (int var27 = 0; var27 < var13; ++var27) {
                                        int var28 = var8 * var27 / var13;
                                        var18[class262.method1461(class213.field2881, arg0 + var27)] = var18[class262.method1461(class213.field2881, -var27 + arg6 + -1 + arg0)] = ~var28 <= ~var26 ? var26 : var28;
                                    }
                                } else {
                                    for (int var29 = 0; var29 < var13; ++var29) {
                                        int var31 = var8 * var29 / var13;
                                        var18[class262.method1461(arg0 - -var29, class213.field2881)] = var18[class262.method1461(arg0 - -arg6 + -var29 + -1, class213.field2881)] = var26 * var31 >> 12;
                                    }
                                }
                                if (class420.field6139 >= var15 + var16) {
                                    class358.method2180(var18, var15, var16, var26);
                                } else {
                                    int var30 = -var15 + class420.field6139;
                                    class358.method2180(var18, var15, var30, var26);
                                    class358.method2180(var18, 0, -var30 + var16, var26);
                                }
                            } else {
                                for (int var32 = 0; var13 > var32; ++var32) {
                                    var18[class262.method1461(class213.field2881, arg0 - -var32)] = var18[class262.method1461(class213.field2881, arg0 + arg6 + -1 + -var32)] = var8 * var32 / var13;
                                }
                                if (~class420.field6139 <= ~(var15 + var16)) {
                                    class358.method2180(var18, var15, var16, var8);
                                } else {
                                    int var33 = -var15 + class420.field6139;
                                    class358.method2180(var18, var15, var33, var8);
                                    class358.method2180(var18, 0, var16 - var33, var8);
                                }
                            }
                        }
                    }
                }
            } else if (class420.field6139 < arg0 + arg6) {
                int var34 = -arg0 + class420.field6139;
                for (int var35 = 0; var35 < arg4; ++var35) {
                    int[] var36 = arg1[arg5 + var35];
                    class358.method2180(var36, arg0, var34, var8);
                    class358.method2180(var36, 0, -var34 + arg6, var8);
                }
            } else {
                for (int var37 = 0; var37 < arg4; ++var37) {
                    class358.method2180(arg1[arg5 + var37], arg0, arg6, var8);
                }
            }
        }
    }
}
