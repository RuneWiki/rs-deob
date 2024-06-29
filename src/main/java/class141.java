import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class141 extends class499 {

    @OriginalMember(owner = "client!rp", name = "v", descriptor = "Z")
    private boolean field1845 = false;

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "Z")
    private boolean field1849;

    @OriginalMember(owner = "client!rp", name = "A", descriptor = "[Llha;")
    private class445[] field1850;

    @OriginalMember(owner = "client!rp", name = "C", descriptor = "[[I")
    public static int[][] field1852 = new int[6][];

    @OriginalMember(owner = "client!rp", name = "t", descriptor = "Lrn;")
    public static class633 field1843 = new class633(3, -1);

    @OriginalMember(owner = "client!rp", name = "E", descriptor = "Z")
    public static boolean field1854 = true;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!rp", name = "u", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!rp", name = "w", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!rp", name = "x", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!rp", name = "y", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!rp", name = "B", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!rp", name = "D", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZZ)V")
    public final void method202(boolean arg0, boolean arg1) {
        super.field6405.method3759(arg1, class137.field1820, class174.field2285);
        ++field1847;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V")
    public final void method205(int arg0) {
        ++field1844;
        if (this.field1845) {
            super.field6405.method3712(-14720, 1);
            super.field6405.method3756(10, (class132) null);
            super.field6405.method1158(class148.field1894, 87);
            super.field6405.method3754(false);
            if (this.field1849) {
                super.field6405.method3759(false, class137.field1820, class137.field1820);
                super.field6405.method3736(class171.field2262, 0, (byte) -88);
                super.field6405.method3718(0, class171.field2262, arg0 ^ 1);
            } else {
                super.field6405.method3759(false, class137.field1820, class137.field1820);
                super.field6405.method3736(class171.field2262, 0, (byte) -88);
                super.field6405.method3712(-14720, 2);
                super.field6405.method3759(false, class137.field1820, class137.field1820);
                super.field6405.method3736(class171.field2262, 0, (byte) -88);
                super.field6405.method3736(class13.field134, 1, (byte) -88);
                super.field6405.method3718(0, class171.field2262, 1);
                super.field6405.method3756(10, (class132) null);
            }
            super.field6405.method3712(-14720, 0);
            this.field1845 = false;
        } else {
            super.field6405.method3718(0, class171.field2262, 1);
        }
        if (arg0 != 0) {
            field1852 = null;
        }
        super.field6405.method3759(false, class137.field1820, class137.field1820);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IZ)V")
    public final void method201(int arg0, boolean arg1) {
        if (arg0 == 91) {
            if (this.field1850 != null && arg1) {
                super.field6405.method3712(arg0 ^ -14629, 1);
                super.field6405.method1158(class469.field6108, 116);
                class588 var3 = super.field6405.method3763(1);
                var3.method463(1024);
                super.field6405.method3744(71, class514.field6557);
                if (this.field1849) {
                    super.field6405.method3759(false, class177.field2325, class174.field2285);
                    super.field6405.method1205(0, 66, class171.field2262, true, false);
                    super.field6405.method3718(0, class436.field5734, 1);
                } else {
                    super.field6405.method3759(false, class174.field2285, class137.field1820);
                    super.field6405.method3736(class13.field134, 0, (byte) -88);
                    super.field6405.method3712(-14720, 2);
                    super.field6405.method3759(false, class177.field2325, class174.field2285);
                    super.field6405.method3736(class13.field134, 0, (byte) -88);
                    super.field6405.method1205(1, 45, class13.field134, true, false);
                    super.field6405.method3718(0, class436.field5734, 1);
                    super.field6405.method3756(10, super.field6405.field9128);
                }
                super.field6405.method3712(arg0 + -14811, 0);
                this.field1845 = true;
            } else {
                super.field6405.method3718(0, class436.field5734, arg0 ^ 90);
            }
            ++field1848;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)Z")
    public final boolean method200(boolean arg0) {
        ++field1841;
        return !arg0 ? true : true;
    }

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "(I)V")
    public static final void method802(int arg0) {
        ++field1851;
        if (arg0 > -17) {
            field1852 = null;
        }
        class624.field7930.method2919(0);
    }

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "(I)Leka;")
    public static final class654 method803(int arg0) {
        ++field1842;
        if (arg0 < 20) {
            field1843 = null;
        }
        return class687.field8841;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BII)V")
    public final void method204(byte arg0, int arg1, int arg2) {
        if (this.field1845) {
            super.field6405.method3712(-14720, 1);
            super.field6405.method3756(10, this.field1850[arg2 - 1]);
            super.field6405.method3712(-14720, 0);
        }
        ++field1846;
        if (arg0 <= 11) {
            this.method202(false, true);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILsfa;I)V")
    public final void method206(int arg0, class132 arg1, int arg2) {
        if (arg2 == 26917) {
            ++field1840;
            super.field6405.method3756(10, arg1);
            super.field6405.method3740(arg0, 106);
        }
    }

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "(B)V")
    public static void method804(byte arg0) {
        if (arg0 != -99) {
            field1843 = null;
        }
        field1852 = null;
        field1843 = null;
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lgd;)V")
    public class141(class696 arg0) {
        super(arg0);
        if (arg0.field9125) {
            this.field1849 = arg0.field9167 < 3;
            int var2 = this.field1849 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (~var14 == -2) {
                            var15 = var13;
                        } else if (var14 != 2) {
                            if (var14 != 3) {
                                if (var14 != 4) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = -var12;
                            }
                        } else {
                            var15 = var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field1850 = new class445[3];
            this.field1850[0] = super.field6405.method1182(var4, 64, false, -21313);
            this.field1850[1] = super.field6405.method1182(var5, 64, false, -21313);
            this.field1850[2] = super.field6405.method1182(var3, 64, false, -21313);
        }
    }
}
