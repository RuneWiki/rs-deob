import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class130 extends class264 {

    @OriginalMember(owner = "client!ku", name = "N", descriptor = "I")
    private int field1774 = 1;

    @OriginalMember(owner = "client!ku", name = "V", descriptor = "I")
    private int field1782 = 0;

    @OriginalMember(owner = "client!ku", name = "bb", descriptor = "[B")
    private byte[] field1788 = new byte[512];

    @OriginalMember(owner = "client!ku", name = "U", descriptor = "I")
    private int field1781 = 5;

    @OriginalMember(owner = "client!ku", name = "cb", descriptor = "I")
    private int field1789 = 2048;

    @OriginalMember(owner = "client!ku", name = "db", descriptor = "[S")
    private short[] field1790 = new short[512];

    @OriginalMember(owner = "client!ku", name = "gb", descriptor = "I")
    private int field1793 = 5;

    @OriginalMember(owner = "client!ku", name = "Z", descriptor = "I")
    private int field1786 = 2;

    @OriginalMember(owner = "client!ku", name = "Q", descriptor = "Z")
    public static boolean field1777 = true;

    @OriginalMember(owner = "client!ku", name = "X", descriptor = "[C")
    public static char[] field1784 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ku", name = "R", descriptor = "[[S")
    public static short[][] field1778 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!ku", name = "T", descriptor = "F")
    public static float field1780;

    @OriginalMember(owner = "client!ku", name = "O", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ku", name = "S", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!ku", name = "Y", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ku", name = "ab", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ku", name = "eb", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ku", name = "fb", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ku", name = "P", descriptor = "Lnl;")
    public static class435 field1776;

    @OriginalMember(owner = "client!ku", name = "W", descriptor = "Ljava/lang/String;")
    public static String field1783;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(BLkk;I)V")
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field1781 = arg1.method1172((byte) -112);
                                }
                            } else {
                                this.field1793 = arg1.method1172((byte) -108);
                            }
                        } else {
                            this.field1774 = arg1.method1172((byte) 102);
                        }
                    } else {
                        this.field1786 = arg1.method1172((byte) 67);
                    }
                } else {
                    this.field1789 = arg1.method1134(-16848);
                }
            } else {
                this.field1782 = arg1.method1172((byte) 99);
            }
        } else {
            this.field1793 = this.field1781 = arg1.method1172((byte) -108);
        }
        if (arg0 > 31) {
            ++field1775;
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)V")
    private final void method973(byte arg0) {
        ++field1791;
        Random var2 = new Random((long) this.field1782);
        this.field1790 = new short[512];
        if (arg0 > 118) {
            if (~this.field1789 < -1) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field1790[var3] = (short) class424.method2524(var2, this.field1789, (byte) -117);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "(I)V")
    public static void method974(int arg0) {
        if (arg0 <= 2) {
            field1777 = false;
        }
        field1778 = null;
        field1784 = null;
        field1776 = null;
        field1783 = null;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lkk;B)V")
    public static final void method975(class161 arg0, byte arg1) {
        ++field1792;
        if (arg1 >= -118) {
            method975((class161) null, (byte) -43);
        }
        for (int var2 = 0; ~class267.field3921 < ~var2; ++var2) {
            int var3 = arg0.method1133(0);
            int var4 = arg0.method1134(-16848);
            if (~var4 == -65536) {
                var4 = -1;
            }
            if (class162.field2364[var3] != null) {
                class162.field2364[var3].field3073 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field1779;
        if (arg1 != 21034) {
            method974(-85);
        }
        int[] var3 = super.field3808.method958((byte) 107, arg0);
        if (super.field3808.field1732) {
            int var4 = class379.field5216[arg0] * this.field1781 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class478.field6792; ++var7) {
                class368.field5072 = Integer.MAX_VALUE;
                class103.field1445 = Integer.MAX_VALUE;
                class149.field2058 = Integer.MAX_VALUE;
                class340.field4706 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class151.field2084[var7] * this.field1793);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = this.field1788[(var11 >= this.field1781 ? -this.field1781 + var11 : var11) & 255] & 255;
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = 2 * (255 & this.field1788[255 & (~var14 > ~this.field1793 ? var14 : -this.field1793 + var14) + var13]);
                        int var10000 = -(var14 << 12) + var8;
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field1790[var15];
                        int var17 = -this.field1790[var27] - (var11 << 12) + var4;
                        int var18 = this.field1774;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (var16 >= 0 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = var16 < 0 ? -var16 : var16;
                                var19 = ~var26 >= ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class340.field4706 > var19) {
                            class368.field5072 = class103.field1445;
                            class103.field1445 = class149.field2058;
                            class149.field2058 = class340.field4706;
                            class340.field4706 = var19;
                        } else if (class149.field2058 <= var19) {
                            if (class103.field1445 <= var19) {
                                if (~class368.field5072 < ~var19) {
                                    class368.field5072 = var19;
                                }
                            } else {
                                class368.field5072 = class103.field1445;
                                class103.field1445 = var19;
                            }
                        } else {
                            class368.field5072 = class103.field1445;
                            class103.field1445 = class149.field2058;
                            class149.field2058 = var19;
                        }
                    }
                }
                int var12 = this.field1786;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = class149.field2058 - class340.field4706;
                                }
                            } else {
                                var3[var7] = class368.field5072;
                            }
                        } else {
                            var3[var7] = class103.field1445;
                        }
                    } else {
                        var3[var7] = class149.field2058;
                    }
                } else {
                    var3[var7] = class340.field4706;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "(I)V")
    public final void method95(int arg0) {
        this.field1788 = class4.method29(this.field1782, (byte) -20);
        ++field1787;
        this.method973((byte) 126);
        if (arg0 != -8) {
            this.field1781 = -5;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I[S[Ljava/lang/String;II)V")
    public static final void method976(int arg0, short[] arg1, String[] arg2, int arg3, int arg4) {
        ++field1785;
        if (arg3 == 542) {
            if (~arg4 < ~arg0) {
                int var5 = (arg0 + arg4) / 2;
                int var6 = arg0;
                String var7 = arg2[var5];
                arg2[var5] = arg2[arg4];
                arg2[arg4] = var7;
                short var8 = arg1[var5];
                arg1[var5] = arg1[arg4];
                arg1[arg4] = var8;
                for (int var9 = arg0; ~arg4 < ~var9; ++var9) {
                    if (var7 == null || arg2[var9] != null && ~(1 & var9) < ~arg2[var9].compareTo(var7)) {
                        String var10 = arg2[var9];
                        arg2[var9] = arg2[var6];
                        arg2[var6] = var10;
                        short var11 = arg1[var9];
                        arg1[var9] = arg1[var6];
                        arg1[var6++] = var11;
                    }
                }
                arg2[arg4] = arg2[var6];
                arg2[var6] = var7;
                arg1[arg4] = arg1[var6];
                arg1[var6] = var8;
                method976(arg0, arg1, arg2, 542, var6 - 1);
                method976(var6 - -1, arg1, arg2, 542, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
    public class130() {
        super(0, true);
    }
}
