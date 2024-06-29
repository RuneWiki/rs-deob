import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class110 {

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field1815 = -1;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "[I")
    public static int[] field1813 = new int[] { 5, 0, 15, -1, 0, 0, 0, 0, 0, 0, 0, 0, 9, 8, -1, 9, 0, 0, 0, 0, 12, 0, -1, 0, -2, 0, 0, 0, 3, 0, 0, -2, 0, -1, 0, 0, 0, 0, 3, 0, 4, 0, 0, 10, 0, -1, -2, 0, 0, 0, 0, 0, 0, -2, 0, 8, 2, 0, 10, 1, 0, 0, 0, 0, 6, -1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 8, 0, 0, 0, 0, 0, 4, 0, 6, 0, 15, 0, 12, 0, 28, 14, 3, 0, 0, 8, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 12, 1, 3, 0, 0, 0, 0, 0, 0, 0, -2, -1, -2, 0, 0, 0, 6, -1, 0, 0, 0, 0, 1, 0, 7, 0, 5, -2, 10, 0, 0, 0, 0, 2, 0, -1, 0, 0, 5, 0, 0, 6, 0, 0, 0, 0, -1, 6, 0, 0, 0, 10, 0, -2, 0, 8, 3, 3, -1, 8, 1, 0, 0, -1, 0, 7, 0, -1, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 6, 0, 0, 0, 0, 6, 0, 12, 0, 2, 0, 4, 1, 0, 0, 0, -1, 0, 0, 20, -2, 5, 0, 8, 0, -1, -2, 0, 0, 0, 14, 0, 0, 0, 0, 5, 6, -2, 7, -2, 0, 0, 2, 0, 0, 0, 0, 2, 0, 2, 0, 4, 0, 0, 7, -2 };

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    private int field1832;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "J")
    private long field1812;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "J")
    private long field1814;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field1811;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Z")
    public static boolean field1807;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Z")
    public boolean field1809;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "[I")
    private int[] field1821;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "[I")
    private int[] field1824;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "[Ljd;")
    public static class87[] field1819;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "[[I")
    private int[][] field1828;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)I")
    public final int method799(int arg0) {
        field1817++;
        if (arg0 == 16482) {
            return this.field1820 == -1 ? (this.field1821[11] << 5) + (this.field1821[8] << 10) + (this.field1824[0] << 25) + (this.field1824[4] << 20) + (this.field1821[0] << 15) + this.field1821[1] : class204.method1402((byte) 77, this.field1820).field1724 + 305419896;
        } else {
            return -25;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIB)V")
    public final void method800(int arg0, int arg1, byte arg2) {
        if (arg2 != -16) {
            this.field1828 = null;
        }
        field1831++;
        int var4 = class24.field395[arg1];
        if (this.field1821[var4] != 0 && class129.method917(arg0, (byte) -60) != null) {
            this.field1821[var4] = class220.method1495(arg0, Integer.MIN_VALUE);
            this.method802(arg2 ^ 0xFFFFFFAC);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILtg;ZI[Laj;IIIIILtg;)Loi;")
    public final class80 method801(int arg0, class181 arg1, boolean arg2, int arg3, class47[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class181 arg10) {
        field1826++;
        if (this.field1820 != -1) {
            return class204.method1402((byte) 77, this.field1820).method785(arg10, arg8, arg0, arg5, false, arg4, arg9, arg6, arg1, arg7);
        }
        long var12 = this.field1814;
        int[] var14 = this.field1821;
        if (arg1 != null && (arg1.field2850 >= 0 || arg1.field2835 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field1821[var15];
            }
            if (arg1.field2850 >= 0) {
                if (arg1.field2850 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class220.method1495(arg1.field2850, 1073741824);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg1.field2835 >= 0) {
                if (arg1.field2835 == 65535) {
                    var14[3] = 0;
                    var12 ^= 0xFFFFFFFFL;
                } else {
                    var14[3] = class220.method1495(1073741824, arg1.field2835);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class80 var16 = (class80) class260.field4134.method480(var12, 77);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var14[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var43) != 0 && !class129.method917(var43 & 0x3FFFFFFF, (byte) -60).method1165((byte) 103)) {
                        var17 = true;
                    }
                } else if (!class83.method595(var43 & 0x3FFFFFFF, -81).method86((byte) -112, this.field1809)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field1812 != -1L) {
                    var16 = (class80) class260.field4134.method480(this.field1812, 76);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class150[] var19 = new class150[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var14[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class150 var41 = class83.method595(var40 & 0x3FFFFFFF, -78).method101(-12923, this.field1809);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    } else if ((Integer.MIN_VALUE & var40) != 0) {
                        class150 var42 = class129.method917(var40 & 0x3FFFFFFF, (byte) -60).method1161((byte) 111);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    }
                }
                class252 var21 = null;
                if (this.field1832 != -1) {
                    var21 = class280.method1884((byte) -52, this.field1832);
                }
                if (var21 != null && var21.field4014 != null) {
                    for (int var22 = 0; var22 < var21.field4014.length; var22++) {
                        if (var21.field4014[var22] != null && var19[var22] != null) {
                            int var23 = var21.field4014[var22][0];
                            int var24 = var21.field4014[var22][1];
                            int var25 = var21.field4014[var22][2];
                            int var26 = var21.field4014[var22][3];
                            int var27 = var21.field4014[var22][4];
                            int var28 = var21.field4014[var22][5];
                            if (this.field1828 == null) {
                                this.field1828 = new int[var21.field4014.length][];
                            }
                            if (this.field1828[var22] == null) {
                                int[] var29 = this.field1828[var22] = new int[15];
                                if (var26 == 0 && var27 == 0 && var28 == 0) {
                                    var29[13] = -var24;
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[14] = -var25;
                                    var29[12] = -var23;
                                } else {
                                    int var30 = class69.field1137[var26] >> 1;
                                    int var31 = class69.field1147[var26] >> 1;
                                    int var32 = class69.field1137[var27] >> 1;
                                    int var33 = class69.field1147[var27] >> 1;
                                    int var34 = class69.field1137[var28] >> 1;
                                    int var35 = var31 * var34 + 16384 >> 15;
                                    int var36 = class69.field1147[var28] >> 1;
                                    var29[3] = var30 * var36 + 16384 >> 15;
                                    var29[2] = var30 * var33 + 16384 >> 15;
                                    var29[8] = var30 * var32 + 16384 >> 15;
                                    var29[5] = -var31;
                                    var29[4] = var30 * var34 + 16384 >> 15;
                                    int var37 = var31 * var36 + 16384 >> 15;
                                    var29[0] = var32 * var34 + var33 * var37 + 16384 >> 15;
                                    var29[7] = -var33 * -var36 + var32 * var35 + 16384 >> 15;
                                    var29[6] = -var33 * var34 + (var32 * var37) + 16384 >> 15;
                                    var29[1] = var33 * var35 + (-var36 * var32 + 16384) >> 15;
                                    var29[14] = var29[5] * -var24 + var29[2] * -var23 + var29[8] * -var25 + 16384 >> 15;
                                    var29[13] = var29[1] * -var23 + var29[4] * -var24 + var29[7] * -var25 + 16384 >> 15;
                                    var29[12] = var29[6] * -var25 + var29[3] * -var24 + (var29[0] * -var23 - -16384) >> 15;
                                }
                                var29[11] = var25;
                                var29[9] = var23;
                                var29[10] = var24;
                            }
                            if (var26 != 0 || var27 != 0 || var28 != 0) {
                                var19[var22].method1033(var26, var27, var28);
                            }
                            if (var23 != 0 || var24 != 0 || var25 != 0) {
                                var19[var22].method1040(var23, var24, var25);
                            }
                        }
                    }
                }
                class150 var38 = new class150(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (class149.field2392[var39].length > this.field1824[var39]) {
                        var38.method1036(class39.field734[var39], class149.field2392[var39][this.field1824[var39]]);
                    }
                    if (this.field1824[var39] < class222.field3688[var39].length) {
                        var38.method1036(class280.field4437[var39], class222.field3688[var39][this.field1824[var39]]);
                    }
                }
                var16 = var38.method1034(64, 850, -30, -50, -30);
                if (arg2) {
                    class260.field4134.method474(var12, (byte) 70, var16);
                    this.field1812 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg4 == null ? 0 : arg4.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg4[var49] != null) {
                class181 var72 = class49.method384(arg4[var49].field842, -89);
                if (var72.field2848 != null) {
                    var45 = true;
                    class67.field1109[var49] = var72;
                    int var73 = arg4[var49].field843;
                    int var74 = var72.field2848[var73];
                    int var75 = arg4[var49].field844;
                    class64.field1072[var49] = class186.method1264(var74 >>> 16, true);
                    int var76 = var74 & 0xFFFF;
                    class61.field1002[var49] = var76;
                    if (class64.field1072[var49] != null) {
                        var44 |= class64.field1072[var49].method920(var76, (byte) 121);
                        var47 |= class64.field1072[var49].method913(arg3 + 21059, var76);
                        var46 |= var72.field2830;
                    }
                    if ((var72.field2845 || class106.field1690) && var75 != -1 && var75 < var72.field2848.length) {
                        class282.field4466[var49] = var72.field2836[var73];
                        class33.field532[var49] = arg4[var49].field845;
                        int var77 = var72.field2848[var75];
                        class5.field66[var49] = class186.method1264(var77 >>> 16, true);
                        int var78 = var77 & 0xFFFF;
                        class278.field4386[var49] = var78;
                        if (class5.field66[var49] != null) {
                            var44 |= class5.field66[var49].method920(var78, (byte) 106);
                            var47 |= class5.field66[var49].method913(-114, var78);
                        }
                    } else {
                        class282.field4466[var49] = 0;
                        class33.field532[var49] = 0;
                        class5.field66[var49] = null;
                        class278.field4386[var49] = -1;
                    }
                }
            }
        }
        if (!var45 && arg1 == null && arg10 == null) {
            return var16;
        }
        if (arg3 != -21172) {
            this.field1824 = null;
        }
        int var50 = -1;
        int var51 = -1;
        class129 var52 = null;
        int var53 = 0;
        class129 var54 = null;
        if (arg1 != null) {
            int var55 = arg1.field2848[arg6];
            int var56 = var55 >>> 16;
            var52 = class186.method1264(var56, true);
            var50 = var55 & 0xFFFF;
            if (var52 != null) {
                var44 |= var52.method920(var50, (byte) 119);
                var47 |= var52.method913(-83, var50);
                var46 |= arg1.field2830;
            }
            if ((arg1.field2845 || class106.field1690) && arg8 != -1 && arg8 < arg1.field2848.length) {
                int var57 = arg1.field2848[arg8];
                var53 = arg1.field2836[arg6];
                int var58 = var57 >>> 16;
                var51 = var57 & 0xFFFF;
                if (var56 == var58) {
                    var54 = var52;
                } else {
                    var54 = class186.method1264(var51 >>> 16, true);
                }
                if (var54 != null) {
                    var44 |= var54.method920(var51, (byte) 126);
                    var47 |= var54.method913(-102, var51);
                }
            }
        }
        int var59 = -1;
        int var60 = -1;
        class129 var61 = null;
        int var62 = 0;
        class129 var63 = null;
        if (arg10 != null) {
            int var64 = arg10.field2848[arg7];
            int var65 = var64 >>> 16;
            var59 = var64 & 0xFFFF;
            var63 = class186.method1264(var65, true);
            if (var63 != null) {
                var44 |= var63.method920(var59, (byte) 122);
                var47 |= var63.method913(-96, var59);
                var46 |= arg10.field2830;
            }
            if ((arg10.field2845 || class106.field1690) && arg5 != -1 && arg5 < arg10.field2848.length) {
                int var66 = arg10.field2848[arg5];
                int var67 = var66 >>> 16;
                var62 = arg10.field2836[arg7];
                var60 = var66 & 0xFFFF;
                if (var65 == var67) {
                    var61 = var63;
                } else {
                    var61 = class186.method1264(var60 >>> 16, true);
                }
                if (var61 != null) {
                    var44 |= var61.method920(var60, (byte) 106);
                    var47 |= var61.method913(arg3 + 21079, var60);
                }
            }
        }
        class80 var68 = var16.method574(!var47, !var44, !var46);
        int var69 = 0;
        int var70 = 1;
        while (var69 < var48) {
            if (class64.field1072[var69] != null) {
                var68.method559(class64.field1072[var69], class61.field1002[var69], class5.field66[var69], class278.field4386[var69], class33.field532[var69] - 1, class282.field4466[var69], var70, class67.field1109[var69].field2830, this.field1828[var69]);
            }
            var70 <<= 0x1;
            var69++;
        }
        if (var52 != null && var63 != null) {
            var68.method573(var52, var50, var54, var51, arg9 - 1, var53, var63, var59, var61, var60, arg0 - 1, var62, arg1.field2857, arg10.field2830 | arg1.field2830);
        } else if (var52 != null) {
            var68.method566(var52, var50, var54, var51, arg9 - 1, var53, arg1.field2830);
        } else if (var63 != null) {
            var68.method566(var63, var59, var61, var60, arg0 - 1, var62, arg10.field2830);
        }
        for (int var71 = 0; var71 < var48; var71++) {
            class64.field1072[var71] = null;
            class5.field66[var71] = null;
            class67.field1109[var71] = null;
        }
        return var68;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    private final void method802(int arg0) {
        field1827++;
        long[] var2 = class262.field4152;
        long var3 = this.field1814;
        this.field1814 = -1L;
        this.field1814 = var2[(int) ((this.field1814 ^ (long) (this.field1832 >> 8)) & 0xFFL)] ^ this.field1814 >>> 8;
        if (arg0 < 35) {
            return;
        }
        this.field1814 = this.field1814 >>> 8 ^ var2[(int) (((long) this.field1832 ^ this.field1814) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1814 = this.field1814 >>> 8 ^ var2[(int) (((long) (this.field1821[var5] >> 24) ^ this.field1814) & 0xFFL)];
            this.field1814 = this.field1814 >>> 8 ^ var2[(int) ((this.field1814 ^ (long) (this.field1821[var5] >> 16)) & 0xFFL)];
            this.field1814 = var2[(int) ((this.field1814 ^ (long) (this.field1821[var5] >> 8)) & 0xFFL)] ^ this.field1814 >>> 8;
            this.field1814 = this.field1814 >>> 8 ^ var2[(int) ((this.field1814 ^ (long) this.field1821[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1814 = var2[(int) (((long) this.field1824[var6] ^ this.field1814) & 0xFFL)] ^ this.field1814 >>> 8;
        }
        this.field1814 = this.field1814 >>> 8 ^ var2[(int) ((this.field1814 ^ (long) (this.field1809 ? 1 : 0)) & 0xFFL)];
        if (var3 != 0L && this.field1814 != var3) {
            class260.field4134.method479(var3, -62);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lnb;I)V")
    public static final void method803(class207 arg0, int arg1) {
        arg0.field3396 = false;
        field1822++;
        if (arg0.field3338 != -1) {
            class181 var2 = class49.method384(arg0.field3338, -111);
            if (var2 == null || var2.field2848 == null) {
                arg0.field3338 = -1;
            } else {
                arg0.field3318++;
                if (arg0.field3331 < var2.field2848.length && var2.field2836[arg0.field3331] < arg0.field3318) {
                    arg0.field3331++;
                    arg0.field3318 = 1;
                    arg0.field3387++;
                    class132.method934((byte) 112, var2, arg0.field3389, arg0.field3341, arg0.field3331, class167.field2655 == arg0);
                }
                if (var2.field2848.length <= arg0.field3331) {
                    arg0.field3318 = 0;
                    arg0.field3331 = 0;
                    class132.method934((byte) 112, var2, arg0.field3389, arg0.field3341, arg0.field3331, class167.field2655 == arg0);
                }
                arg0.field3387 = arg0.field3331 + 1;
                if (var2.field2848.length <= arg0.field3387) {
                    arg0.field3387 = 0;
                }
            }
        }
        if (arg0.field3352 != -1 && arg0.field3348 <= class222.field3682) {
            int var3 = class277.method1862(arg0.field3352, 44).field3050;
            if (var3 == -1) {
                arg0.field3352 = -1;
            } else {
                class181 var4 = class49.method384(var3, 74);
                if (var4 == null || var4.field2848 == null) {
                    arg0.field3352 = -1;
                } else {
                    if (arg0.field3366 < 0) {
                        arg0.field3366 = 0;
                        class132.method934((byte) 112, var4, arg0.field3389, arg0.field3341, 0, class167.field2655 == arg0);
                    }
                    arg0.field3323++;
                    if (arg0.field3366 < var4.field2848.length && var4.field2836[arg0.field3366] < arg0.field3323) {
                        arg0.field3366++;
                        arg0.field3323 = 1;
                        class132.method934((byte) 112, var4, arg0.field3389, arg0.field3341, arg0.field3366, class167.field2655 == arg0);
                    }
                    if (var4.field2848.length <= arg0.field3366) {
                        arg0.field3352 = -1;
                    }
                    arg0.field3347 = arg0.field3366 + 1;
                    if (arg0.field3347 >= var4.field2848.length) {
                        arg0.field3347 = -1;
                    }
                }
            }
        }
        if (arg0.field3378 != -1 && arg0.field3406 <= 1) {
            class181 var5 = class49.method384(arg0.field3378, 87);
            if (var5.field2842 == 1 && arg0.field3346 > 0 && arg0.field3373 <= class222.field3682 && arg0.field3339 < class222.field3682) {
                arg0.field3406 = 1;
                return;
            }
        }
        if (arg0.field3378 != -1 && arg0.field3406 == 0) {
            class181 var6 = class49.method384(arg0.field3378, -93);
            if (var6 == null || var6.field2848 == null) {
                arg0.field3378 = -1;
            } else {
                arg0.field3354++;
                if (arg0.field3386 < var6.field2848.length && var6.field2836[arg0.field3386] < arg0.field3354) {
                    arg0.field3354 = 1;
                    arg0.field3386++;
                    class132.method934((byte) 112, var6, arg0.field3389, arg0.field3341, arg0.field3386, class167.field2655 == arg0);
                }
                if (var6.field2848.length <= arg0.field3386) {
                    arg0.field3386 -= var6.field2858;
                    arg0.field3312++;
                    if (arg0.field3312 >= var6.field2851) {
                        arg0.field3378 = -1;
                    } else if (arg0.field3386 >= 0 && arg0.field3386 < var6.field2848.length) {
                        class132.method934((byte) 112, var6, arg0.field3389, arg0.field3341, arg0.field3386, class167.field2655 == arg0);
                    } else {
                        arg0.field3378 = -1;
                    }
                }
                arg0.field3334 = arg0.field3386 + 1;
                if (arg0.field3334 >= var6.field2848.length) {
                    arg0.field3334 -= var6.field2858;
                    if (var6.field2851 <= arg0.field3312 + 1) {
                        arg0.field3334 = -1;
                    } else if (arg0.field3334 < 0 || arg0.field3334 >= var6.field2848.length) {
                        arg0.field3334 = -1;
                    }
                }
                arg0.field3396 = var6.field2856;
            }
        }
        if (arg0.field3406 > 0) {
            arg0.field3406--;
        }
        if (arg1 >= -122) {
            method808(52, 90, false);
        }
        for (int var7 = 0; var7 < arg0.field3363.length; var7++) {
            class47 var8 = arg0.field3363[var7];
            if (var8 != null) {
                if (var8.field850 > 0) {
                    var8.field850--;
                } else {
                    class181 var9 = class49.method384(var8.field842, -118);
                    if (var9 == null || var9.field2848 == null) {
                        arg0.field3363[var7] = null;
                    } else {
                        var8.field845++;
                        if (var8.field843 < var9.field2848.length && var8.field845 > var9.field2836[var8.field843]) {
                            var8.field843++;
                            var8.field845 = 1;
                            class132.method934((byte) 112, var9, arg0.field3389, arg0.field3341, var8.field843, class167.field2655 == arg0);
                        }
                        if (var8.field843 >= var9.field2848.length) {
                            var8.field843 -= var9.field2858;
                            var8.field841++;
                            if (var8.field841 >= var9.field2851) {
                                arg0.field3363[var7] = null;
                            } else if (var8.field843 >= 0 && var8.field843 < var9.field2848.length) {
                                class132.method934((byte) 112, var9, arg0.field3389, arg0.field3341, var8.field843, class167.field2655 == arg0);
                            } else {
                                arg0.field3363[var7] = null;
                            }
                        }
                        var8.field844 = var8.field843 + 1;
                        if (var8.field844 >= var9.field2848.length) {
                            var8.field844 -= var9.field2858;
                            if (var9.field2851 <= var8.field841 + 1) {
                                var8.field844 = -1;
                            } else if (var8.field844 < 0 || var8.field844 >= var9.field2848.length) {
                                var8.field844 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZB)V")
    public final void method804(boolean arg0, byte arg1) {
        if (arg1 <= 26) {
            this.field1821 = null;
        }
        field1816++;
        this.field1809 = arg0;
        this.method802(89);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
    public final void method805(int arg0, int arg1, int arg2) {
        field1823++;
        if (arg0 != 5) {
            this.method804(true, (byte) 62);
        }
        this.field1824[arg1] = arg2;
        this.method802(arg0 + 81);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIILtg;IIII)Loi;")
    public final class80 method806(int arg0, int arg1, int arg2, class181 arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = -29 / ((arg6 + 55) / 45);
        long var10 = (long) arg0 << 32 | (long) (arg2 << 16) | (long) arg7;
        field1818++;
        class80 var12 = (class80) class68.field1132.method480(var10, 116);
        if (var12 == null) {
            int var13 = 0;
            class150[] var14 = new class150[3];
            if (!class129.method917(arg7, (byte) -60).method1159(-13922) || !class129.method917(arg2, (byte) -60).method1159(-13922) || !class129.method917(arg0, (byte) -60).method1159(-13922)) {
                return null;
            }
            class150 var15 = class129.method917(arg7, (byte) -60).method1167((byte) -99);
            if (var15 != null) {
                var14[var13++] = var15;
            }
            class150 var16 = class129.method917(arg2, (byte) -60).method1167((byte) -104);
            if (var16 != null) {
                var14[var13++] = var16;
            }
            class150 var17 = class129.method917(arg0, (byte) -60).method1167((byte) -125);
            if (var17 != null) {
                var14[var13++] = var17;
            }
            class150 var18 = new class150(var14, var13);
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field1824[var19] < class149.field2392[var19].length) {
                    var18.method1036(class39.field734[var19], class149.field2392[var19][this.field1824[var19]]);
                }
                if (class222.field3688[var19].length > this.field1824[var19]) {
                    var18.method1036(class280.field4437[var19], class222.field3688[var19][this.field1824[var19]]);
                }
            }
            var12 = var18.method1034(64, 768, -50, -10, -50);
            class68.field1132.method474(var10, (byte) 82, var12);
        }
        if (arg3 != null) {
            var12 = arg3.method1229(arg4, arg1, -10611, arg5, var12);
        }
        return var12;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([IBII[IZ)V")
    public final void method807(int[] arg0, byte arg1, int arg2, int arg3, int[] arg4, boolean arg5) {
        field1808++;
        if (this.field1832 != arg3) {
            this.field1832 = arg3;
            this.field1828 = null;
        }
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class8.field100; var8++) {
                    class169 var9 = class129.method917(var8, (byte) -60);
                    if (var9 != null && !var9.field2685 && var9.field2675 == (arg5 ? class43.field799[var7] : class219.field3584[var7])) {
                        arg4[class24.field395[var7]] = class220.method1495(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        if (arg1 != -125) {
            return;
        }
        this.field1824 = arg0;
        this.field1809 = arg5;
        this.field1820 = arg2;
        this.field1821 = arg4;
        this.method802(69);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIZ)V")
    public static final void method808(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            class259 var3 = class213.method1464((byte) -104, arg1, 6);
            field1810++;
            var3.method1766(0);
            var3.field4128 = arg0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILtg;II)Loi;")
    public final class80 method809(int arg0, int arg1, class181 arg2, int arg3, int arg4) {
        field1829++;
        if (this.field1820 != -1) {
            return class204.method1402((byte) 77, this.field1820).method786(arg4, arg3, arg0, arg2, (byte) -127);
        }
        class80 var6 = (class80) class68.field1132.method480(this.field1814, 124);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field1821[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((var17 & Integer.MIN_VALUE) != 0 && !class129.method917(var17 & 0x3FFFFFFF, (byte) -60).method1159(-13922)) {
                        var7 = true;
                    }
                } else if (!class83.method595(var17 & 0x3FFFFFFF, -80).method87((byte) -128, this.field1809)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class150[] var9 = new class150[12];
            int var10 = 0;
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field1821[var11];
                if ((var14 & 0x40000000) != 0) {
                    class150 var15 = class83.method595(var14 & 0x3FFFFFFF, -71).method98(79, this.field1809);
                    if (var15 != null) {
                        var9[var10++] = var15;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class150 var16 = class129.method917(var14 & 0x3FFFFFFF, (byte) -60).method1167((byte) -121);
                    if (var16 != null) {
                        var9[var10++] = var16;
                    }
                }
            }
            class150 var12 = new class150(var9, var10);
            for (int var13 = 0; var13 < 5; var13++) {
                if (this.field1824[var13] < class149.field2392[var13].length) {
                    var12.method1036(class39.field734[var13], class149.field2392[var13][this.field1824[var13]]);
                }
                if (this.field1824[var13] < class222.field3688[var13].length) {
                    var12.method1036(class280.field4437[var13], class222.field3688[var13][this.field1824[var13]]);
                }
            }
            var6 = var12.method1034(64, 768, -50, -10, -50);
            class68.field1132.method474(this.field1814, (byte) 96, var6);
        }
        if (arg2 != null) {
            var6 = arg2.method1229(arg3, arg0, -10611, arg4, var6);
        }
        if (arg1 <= 55) {
            this.field1814 = -101L;
        }
        return var6;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    public static void method810(int arg0) {
        field1813 = null;
        field1811 = null;
        field1819 = null;
        if (arg0 >= -124) {
            method810(72);
        }
    }
}
