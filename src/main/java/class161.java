import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class161 extends class189 {

    @OriginalMember(owner = "client!rh", name = "kb", descriptor = "[I")
    public static int[] field3318 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!rh", name = "jb", descriptor = "I")
    public static int field3317 = 0;

    @OriginalMember(owner = "client!rh", name = "mb", descriptor = "I")
    public static int field3320 = 0;

    @OriginalMember(owner = "client!rh", name = "pb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3323 = Calendar.getInstance();

    @OriginalMember(owner = "client!rh", name = "ub", descriptor = "Lgg;")
    private static class63 field3328 = class116.method911(43, "Select a world");

    @OriginalMember(owner = "client!rh", name = "rb", descriptor = "Lgg;")
    public static class63 field3325 = field3328;

    @OriginalMember(owner = "client!rh", name = "gb", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!rh", name = "hb", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!rh", name = "ib", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!rh", name = "lb", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!rh", name = "nb", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!rh", name = "ob", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!rh", name = "qb", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!rh", name = "sb", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!rh", name = "tb", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!rh", name = "vb", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field3329;
            int[] var3 = super.field3825.method681(arg1, (byte) -48);
            if (super.field3825.field1840) {
                int[] var4 = this.method1245(0, arg1, 11433);
                for (int var5 = 0; ~class54.field1430 < ~var5; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 <= 32) {
            this.method90(106, 25);
        }
        if (~arg0 == -1) {
            super.field3811 = ~arg2.method64(31790) == -2;
        }
        ++field3324;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)V")
    public static void method1098(byte arg0) {
        if (arg0 == -64) {
            field3328 = null;
            field3323 = null;
            field3318 = null;
            field3325 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(B)V")
    public static final void method1099(byte arg0) {
        class127.field2810 = -1;
        class136.field2933 = -1;
        class112.field2531 = 0;
        ++field3322;
        class124.field2736 = -1;
        class90.field2117 = 0;
        class88.field2073 = 0;
        class19.field442 = 0;
        class166.field3404 = 0;
        class188.field3796 = false;
        class164.field3367 = -1;
        class106.field2418 = 0;
        class141.field3031.field54 = 0;
        class167.field3437.field54 = 0;
        for (int var1 = 0; ~class33.field806.length < ~var1; ++var1) {
            if (class33.field806[var1] != null) {
                class33.field806[var1].field1132 = -1;
            }
        }
        for (int var2 = 0; ~class55.field1458.length < ~var2; ++var2) {
            if (class55.field1458[var2] != null) {
                class55.field1458[var2].field1132 = -1;
            }
        }
        class100.method838(5);
        class121.method931(30, 1);
        if (arg0 > -32) {
            method1100((class47) null, (byte) -94);
        }
        for (int var3 = 0; ~var3 > -101; ++var3) {
            class135.field2927[var3] = true;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Leh;B)V")
    public static final void method1100(class47 arg0, byte arg1) {
        if (arg1 != 79) {
            field3328 = null;
        }
        ++field3315;
        if (arg0.field1115 != 0) {
            if (arg0.field1132 != -1 && ~arg0.field1132 > -32769) {
                class6 var2 = class55.field1458[arg0.field1132];
                if (var2 != null) {
                    int var3 = arg0.field1144 - var2.field1144;
                    int var4 = -var2.field1141 + arg0.field1141;
                    if (~var4 != -1 || ~var3 != -1) {
                        arg0.field1129 = 2047 & (int) (325.949D * Math.atan2((double) var4, (double) var3));
                    }
                }
            }
            if (arg0.field1132 >= 32768) {
                int var5 = arg0.field1132 + -32768;
                if (~class50.field1216 == ~var5) {
                    var5 = 2047;
                }
                class62 var6 = class33.field806[var5];
                if (var6 != null) {
                    int var7 = -var6.field1141 + arg0.field1141;
                    int var8 = -var6.field1144 + arg0.field1144;
                    if (var7 != 0 || var8 != 0) {
                        arg0.field1129 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field1165 != 0 || ~arg0.field1120 != -1) && (arg0.field1154 == 0 || arg0.field1148 > 0)) {
                int var9 = -((-class3.field110 + arg0.field1165 + -class3.field110) * 64) + arg0.field1141;
                int var10 = -((-class38.field921 + arg0.field1120 - class38.field921) * 64) + arg0.field1144;
                if (var9 != 0 || var10 != 0) {
                    arg0.field1129 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
                }
                arg0.field1120 = 0;
                arg0.field1165 = 0;
            }
            int var11 = 2047 & arg0.field1129 - arg0.field1104;
            if (~var11 == -1) {
                arg0.field1146 = 0;
            } else {
                ++arg0.field1146;
                if (var11 <= 1024) {
                    arg0.field1104 += arg0.field1115;
                    boolean var12 = true;
                    if (~var11 > ~arg0.field1115 || -arg0.field1115 + 2048 < var11) {
                        arg0.field1104 = arg0.field1129;
                        var12 = false;
                    }
                    if (~arg0.field1110 == ~arg0.field1108 && (~arg0.field1146 < -26 || var12)) {
                        if (~arg0.field1136 != 0) {
                            arg0.field1108 = arg0.field1136;
                        } else {
                            arg0.field1108 = arg0.field1113;
                        }
                    }
                } else {
                    arg0.field1104 -= arg0.field1115;
                    boolean var13 = true;
                    if (~var11 > ~arg0.field1115 || ~var11 < ~(-arg0.field1115 + 2048)) {
                        arg0.field1104 = arg0.field1129;
                        var13 = false;
                    }
                    if (arg0.field1110 == arg0.field1108 && (arg0.field1146 > 25 || var13)) {
                        if (arg0.field1160 != -1) {
                            arg0.field1108 = arg0.field1160;
                        } else {
                            arg0.field1108 = arg0.field1113;
                        }
                    }
                }
                arg0.field1104 &= 2047;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZJ)V")
    public static final void method1101(boolean arg0, long arg1) {
        ++field3326;
        if (~arg1 != -1L) {
            for (int var3 = 0; var3 < class99.field2338; ++var3) {
                if (class11.field264[var3] == arg1) {
                    --class99.field2338;
                    for (int var4 = var3; ~class99.field2338 < ~var4; ++var4) {
                        class11.field264[var4] = class11.field264[var4 + 1];
                        class140.field3001[var4] = class140.field3001[var4 + 1];
                    }
                    ++class118.field2631;
                    client.field705 = class72.field1807;
                    class141.field3031.method854(79, true);
                    class141.field3031.method32((byte) 72, arg1);
                    break;
                }
            }
            if (!arg0) {
                method1098((byte) -101);
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class161() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        ++field3316;
        if (arg1 < 34) {
            this.method83(-79, 0);
        }
        int[][] var3 = super.field3808.method237(-1, arg0);
        if (super.field3808.field561) {
            int[][] var4 = this.method1244((byte) 20, arg0, 0);
            int[] var5 = var3[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; ~var11 > ~class54.field1430; ++var11) {
                var10[var11] = -var6[var11] + 4096;
                var5[var11] = -var8[var11] + 4096;
                var9[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }
}
