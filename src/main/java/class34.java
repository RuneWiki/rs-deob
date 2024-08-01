import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class class34 extends class85 {

    @OriginalMember(owner = "dc", name = "S", descriptor = "I")
    private int field754 = 0;

    @OriginalMember(owner = "dc", name = "bb", descriptor = "I")
    private int field763 = 2000;

    @OriginalMember(owner = "dc", name = "U", descriptor = "I")
    private int field756 = 0;

    @OriginalMember(owner = "dc", name = "fb", descriptor = "I")
    private int field767 = 4096;

    @OriginalMember(owner = "dc", name = "mb", descriptor = "I")
    private int field774 = 16;

    @OriginalMember(owner = "dc", name = "Y", descriptor = "Llf;")
    public static class109 field760 = class35.method275("null", 2);

    @OriginalMember(owner = "dc", name = "hb", descriptor = "Llf;")
    private static class109 field769 = class35.method275(" ", 2);

    @OriginalMember(owner = "dc", name = "R", descriptor = "Llf;")
    public static class109 field753 = field769;

    @OriginalMember(owner = "dc", name = "ob", descriptor = "I")
    public static int field776 = 0;

    @OriginalMember(owner = "dc", name = "pb", descriptor = "I")
    public static int field777 = 50;

    @OriginalMember(owner = "dc", name = "W", descriptor = "[I")
    public static int[] field758 = new int[field777];

    @OriginalMember(owner = "dc", name = "Z", descriptor = "[I")
    public static int[] field761 = new int[field777];

    @OriginalMember(owner = "dc", name = "T", descriptor = "[I")
    public static int[] field755 = new int[field777];

    @OriginalMember(owner = "dc", name = "cb", descriptor = "[I")
    public static int[] field764 = new int[field777];

    @OriginalMember(owner = "dc", name = "gb", descriptor = "[Llf;")
    public static class109[] field768 = new class109[field777];

    @OriginalMember(owner = "dc", name = "Q", descriptor = "[I")
    public static int[] field752 = new int[field777];

    @OriginalMember(owner = "dc", name = "nb", descriptor = "[I")
    public static int[] field775 = new int[field777];

    @OriginalMember(owner = "dc", name = "jb", descriptor = "[I")
    public static int[] field771 = new int[field777];

    @OriginalMember(owner = "dc", name = "V", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "dc", name = "X", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "dc", name = "ab", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "dc", name = "db", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "dc", name = "eb", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "dc", name = "kb", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "dc", name = "lb", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "dc", name = "ib", descriptor = "Ldf;")
    public static class37 field770;

    @OriginalMember(owner = "dc", name = "d", descriptor = "(B)V")
    public static void method268(byte arg0) {
        field761 = null;
        field770 = null;
        field771 = null;
        if (arg0 != -87) {
            field777 = -91;
        }
        field775 = null;
        field755 = null;
        field753 = null;
        field760 = null;
        field769 = null;
        field758 = null;
        field752 = null;
        field768 = null;
        field764 = null;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method269(int arg0, int arg1, int arg2, long arg3) {
        class3 var5 = class78.field1550[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field31 != null && var5.field31.field183 == arg3) {
            return true;
        } else if (var5.field34 != null && var5.field34.field2054 == arg3) {
            return true;
        } else if (var5.field27 != null && var5.field27.field1030 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field13; ++var6) {
                if (var5.field17[var6].field949 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        if (arg0 > -49) {
            field770 = null;
        }
        ++field772;
        int[] var3 = super.field1736.method835(-314, arg1);
        if (super.field1736.field2253) {
            int var4 = this.field767 >> 1;
            int[][] var5 = super.field1736.method833((byte) -28);
            Random var6 = new Random((long) this.field754);
            for (int var7 = 0; ~this.field763 < ~var7; ++var7) {
                int var8 = ~this.field767 >= -1 ? this.field756 : this.field756 - var4 - -class123.method882(this.field767, var6, true);
                int var9 = class123.method882(class57.field1152, var6, true);
                int var10 = (4086 & var8) >> 4;
                int var11 = class123.method882(class38.field824, var6, true);
                int var12 = (class126.field2428[var10] * this.field774 >> 12) + var11;
                int var13 = (class109.field2173[var10] * this.field774 >> 12) + var9;
                int var14 = -var9 + var13;
                int var15 = -var11 + var12;
                if (var14 != 0 || ~var15 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 < var15;
                    if (var16) {
                        int var17 = var9;
                        int var18 = var13;
                        var9 = var11;
                        var11 = var17;
                        var13 = var12;
                        var12 = var18;
                    }
                    if (~var13 > ~var9) {
                        int var19 = var9;
                        int var20 = var11;
                        var9 = var13;
                        var11 = var12;
                        var13 = var19;
                        var12 = var20;
                    }
                    int var21 = var12 - var11;
                    int var22 = -var9 + var13;
                    int var23 = var11;
                    if (var21 < 0) {
                        var21 = -var21;
                    }
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 + -(class123.method882(4096, var6, true) >> 2);
                    int var27 = ~var11 > ~var12 ? 1 : -1;
                    for (int var28 = var9; ~var13 < ~var28; ++var28) {
                        var24 += var21;
                        int var29 = (-var9 + var28) * var25 + var26 + 1024;
                        int var30 = class150.field2892 & var23;
                        if (var24 > 0) {
                            var23 += var27;
                            var24 += -var22;
                        }
                        int var31 = var28 & class29.field624;
                        if (!var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "dc", name = "<init>", descriptor = "()V")
    public class34() {
        super(0, true);
    }

    @OriginalMember(owner = "dc", name = "e", descriptor = "(I)V")
    public static final void method270(int arg0) {
        ++field773;
        int var1 = class104.field2050;
        int var2 = class105.field2093;
        int var3 = class111.field2190;
        int var4 = 6116423;
        int var5 = class128.field2471;
        class11.method76(var1, var2, var3, var5, var4);
        class11.method76(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class11.method69(var1 + 1, var2 + 18, var3 - 2, var5 - 19, 0);
        class46.field957.method119(class184.field3465, var1 - -3, var2 + 14, var4, -1);
        if (arg0 > 86) {
            int var6 = class109.field2134;
            int var7 = class21.field479;
            for (int var8 = 0; ~var8 > ~class149.field2882; ++var8) {
                int var9 = 16777215;
                int var10 = (class149.field2882 + -1 + -var8) * 15 + var2 + 31;
                if (var7 > var1 && var7 < var1 + var3 && ~var6 < ~(var10 + -13) && ~var6 > ~(var10 + 3)) {
                    var9 = 16776960;
                }
                class46.field957.method119(class114.method843(var8, (byte) -49), var1 + 3, var10, var9, 0);
            }
            class182.method1240(class111.field2190, 0, class128.field2471, class104.field2050, class105.field2093);
        }
    }

    @OriginalMember(owner = "dc", name = "c", descriptor = "(I)V")
    public final void method199(int arg0) {
        ++field762;
        class179.method1217(127);
        if (arg0 != 25614) {
            method271((byte[]) null, -60, -109, -81, 25, -30, (class105[]) null);
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "([BIIIII[Llb;)V")
    public static final void method271(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class105[] arg6) {
        for (int var7 = 0; var7 < 4; ++var7) {
            for (int var12 = 0; ~var12 > -65; ++var12) {
                for (int var13 = 0; ~var13 > -65; ++var13) {
                    if (~(arg4 + var12) < -1 && arg4 + var12 < 103 && ~(arg5 - -var13) < -1 && ~(arg5 + var13) > -104) {
                        arg6[var7].field2069[arg4 + var12][arg5 + var13] = class170.method1140(arg6[var7].field2069[arg4 + var12][arg5 + var13], -16777217);
                    }
                }
            }
        }
        if (arg2 != 3752) {
            method269(-83, -55, -14, -35L);
        }
        ++field766;
        class86 var8 = new class86(arg0);
        for (int var9 = 0; ~var9 > -5; ++var9) {
            for (int var10 = 0; var10 < 64; ++var10) {
                for (int var11 = 0; var11 < 64; ++var11) {
                    class29.method238(var9, 120, arg3, 0, arg5 + var11, var10 - -arg4, arg1, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        ++field765;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            this.field767 = arg2.method569(true);
                        }
                    } else {
                        this.field756 = arg2.method569(true);
                    }
                } else {
                    this.field774 = arg2.method598((byte) 93);
                }
            } else {
                this.field763 = arg2.method569(true);
            }
        } else {
            this.field754 = arg2.method598((byte) 109);
        }
        if (arg0 >= -120) {
            this.method199(-16);
        }
    }

    @OriginalMember(owner = "dc", name = "f", descriptor = "(I)Z")
    public static final boolean method272(int arg0) {
        if (arg0 > -68) {
            return true;
        } else {
            ++field757;
            try {
                if (class84.field1711 == 2) {
                    if (class41.field871 == null) {
                        class41.field871 = class166.method1119(class16.field302, class72.field1394, class145.field2803);
                        if (class41.field871 == null) {
                            return false;
                        }
                    }
                    if (class85.field1733 == null) {
                        class85.field1733 = new class23(class13.field204, class117.field2313);
                    }
                    if (class67.field1309.method1182(103, class41.field871, class193.field3697, 22050, class85.field1733)) {
                        class67.field1309.method1180((byte) -75);
                        class67.field1309.method1192(class8.field109, (byte) -34);
                        class67.field1309.method1167(class88.field1839, (byte) -85, class41.field871);
                        class16.field302 = null;
                        class84.field1711 = 0;
                        class41.field871 = null;
                        class85.field1733 = null;
                        return true;
                    }
                }
            } catch (Exception var2) {
                var2.printStackTrace();
                class67.field1309.method1195((byte) 105);
                class85.field1733 = null;
                class41.field871 = null;
                class16.field302 = null;
                class84.field1711 = 0;
            }
            return false;
        }
    }
}
