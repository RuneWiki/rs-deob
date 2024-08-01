import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qa")
public class class149 extends class85 {

    @OriginalMember(owner = "qa", name = "R", descriptor = "I")
    private int field2869 = -1;

    @OriginalMember(owner = "qa", name = "X", descriptor = "[I")
    public static int[] field2875 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "qa", name = "U", descriptor = "Llf;")
    public static class109 field2872 = class35.method275("null", 2);

    @OriginalMember(owner = "qa", name = "V", descriptor = "[I")
    public static int[] field2873 = new int[50];

    @OriginalMember(owner = "qa", name = "ab", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2878 = new CRC32();

    @OriginalMember(owner = "qa", name = "cb", descriptor = "Leh;")
    public static class49 field2880 = new class49(4096);

    @OriginalMember(owner = "qa", name = "eb", descriptor = "I")
    public static int field2882 = 0;

    @OriginalMember(owner = "qa", name = "Q", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "qa", name = "S", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "qa", name = "T", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "qa", name = "Y", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "qa", name = "Z", descriptor = "I")
    public int field2877;

    @OriginalMember(owner = "qa", name = "bb", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "qa", name = "db", descriptor = "I")
    public int field2881;

    @OriginalMember(owner = "qa", name = "W", descriptor = "[I")
    public int[] field2874;

    @OriginalMember(owner = "qa", name = "d", descriptor = "(B)Z")
    public final boolean method1041(byte arg0) {
        ++field2868;
        if (this.field2874 != null) {
            return true;
        } else if (~this.field2869 <= -1) {
            class100 var2 = class162.method1102(class168.field3113, 0, this.field2869);
            var2.method714();
            this.field2881 = var2.field2008;
            this.field2874 = var2.field2007;
            this.field2877 = var2.field2009;
            return true;
        } else {
            return arg0 <= 104 ? false : false;
        }
    }

    @OriginalMember(owner = "qa", name = "a", descriptor = "(ZIIII)V")
    public static final void method1042(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class91 var5 = (class91) class148.field2854.method1230(107); var5 != null; var5 = (class91) class148.field2854.method1234(-1)) {
            if (var5.field1865 != -1 || var5.field1880 != null) {
                int var6 = 0;
                if (var5.field1878 < arg4) {
                    var6 += arg4 - var5.field1878;
                } else if (arg4 < var5.field1874) {
                    var6 += -arg4 + var5.field1874;
                }
                if (~arg3 >= ~var5.field1881) {
                    if (var5.field1863 > arg3) {
                        var6 += -arg3 + var5.field1863;
                    }
                } else {
                    var6 += -var5.field1881 + arg3;
                }
                if (var6 + -64 <= var5.field1882 && class170.field3196 != 0 && var5.field1885 == arg1) {
                    var6 -= 64;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    int var7 = (-var6 + var5.field1882) * class170.field3196 / var5.field1882;
                    if (var5.field1866 != null) {
                        var5.field1866.method619(var7);
                    } else if (var5.field1865 >= 0) {
                        class120 var8 = class120.method867(class136.field2625, var5.field1865, 0);
                        if (var8 != null) {
                            class94 var9 = var8.method868().method680(class7.field107);
                            class87 var10 = class87.method645(var9, 100, var7);
                            var10.method609(-1);
                            class144.field2772.method1196(var10);
                            var5.field1866 = var10;
                        }
                    }
                    if (var5.field1864 == null) {
                        if (var5.field1880 != null && ~(var5.field1873 -= arg2) >= -1) {
                            int var11 = (int) (Math.random() * (double) var5.field1880.length);
                            class120 var12 = class120.method867(class136.field2625, var5.field1880[var11], 0);
                            if (var12 != null) {
                                class94 var13 = var12.method868().method680(class7.field107);
                                class87 var14 = class87.method645(var13, 100, var7);
                                var14.method609(0);
                                class144.field2772.method1196(var14);
                                var5.field1873 = (int) ((double) (var5.field1884 - var5.field1879) * Math.random()) + var5.field1879;
                                var5.field1864 = var14;
                            }
                        }
                    } else {
                        var5.field1864.method619(var7);
                        if (!var5.field1864.method451((byte) -8)) {
                            var5.field1864 = null;
                        }
                    }
                } else {
                    if (var5.field1866 != null) {
                        class144.field2772.method1198(var5.field1866);
                        var5.field1866 = null;
                    }
                    if (var5.field1864 != null) {
                        class144.field2772.method1198(var5.field1864);
                        var5.field1864 = null;
                    }
                }
            }
        }
        ++field2871;
        if (!arg0) {
            method1043(4);
        }
    }

    @OriginalMember(owner = "qa", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        ++field2870;
        if (arg1 == 0) {
            this.field2869 = arg2.method569(true);
        }
        if (arg0 > -120) {
            field2878 = null;
        }
    }

    @OriginalMember(owner = "qa", name = "b", descriptor = "(II)[[I")
    public int[][] method29(int arg0, int arg1) {
        ++field2879;
        if (arg1 != 2177) {
            this.field2874 = null;
        }
        int[][] var3 = super.field1719.method673((byte) -127, arg0);
        if (super.field1719.field1926 && this.method1041((byte) 124)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = (~class38.field824 == ~this.field2881 ? arg0 : this.field2881 * arg0 / class38.field824) * this.field2877;
            int[] var7 = var3[2];
            if (~class57.field1152 != ~this.field2877) {
                for (int var8 = 0; ~var8 > ~class57.field1152; ++var8) {
                    int var9 = this.field2877 * var8 / class57.field1152;
                    int var10 = this.field2874[var6 - -var9];
                    var7[var8] = class170.method1140(4080, var10 << 4);
                    var5[var8] = class170.method1140(var10 >> 4, 4080);
                    var4[var8] = class170.method1140(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~class57.field1152 < ~var11; ++var11) {
                    int var12 = this.field2874[var6++];
                    var7[var11] = class170.method1140(255, var12) << 4;
                    var5[var11] = class170.method1140(4080, var12 >> 4);
                    var4[var11] = class170.method1140(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "qa", name = "<init>", descriptor = "()V")
    public class149() {
        super(0, false);
    }

    @OriginalMember(owner = "qa", name = "d", descriptor = "(I)I")
    public final int method547(int arg0) {
        ++field2876;
        if (arg0 != -1) {
            this.method29(-1, -23);
        }
        return this.field2869;
    }

    @OriginalMember(owner = "qa", name = "e", descriptor = "(I)V")
    public static void method1043(int arg0) {
        field2878 = null;
        field2875 = null;
        field2872 = null;
        field2873 = null;
        int var1 = -106 / ((-9 - arg0) / 35);
        field2880 = null;
    }
}
