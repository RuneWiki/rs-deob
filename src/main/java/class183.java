import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class183 extends class28 {

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    private final int field3363;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    private final int field3365;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    private final int field3377;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    private final int field3369;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "Lli;")
    private static class185 field3362 = class245.method1649("Allocating memory", 122);

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "Lli;")
    public static class185 field3368 = field3362;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "F")
    public static float field3366;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "Lhi;")
    public static class250 field3359;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "Lhi;")
    public static class250 field3378;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "Lkc;")
    public static class29 field3370;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "[Lda;")
    public static class101[] field3375;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "[Lcg;")
    public static class34[] field3376;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)Lsi;")
    public static final class273 method1288(byte arg0, int arg1) {
        ++field3372;
        class273 var2 = (class273) class80.field1402.method82(127, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class47.field771.method1688(0, arg1, 16);
            int var4 = -118 / ((-84 - arg0) / 34);
            class273 var5 = new class273();
            if (var3 != null) {
                var5.method1870(new class118(var3), 119);
            }
            class80.field1402.method84(81, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIZZIII)V")
    public static final void method1289(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        ++field3373;
        class134.field2403 = arg6;
        class207.field3794 = arg4;
        if (arg2) {
            class66.field1151 = arg0;
            class119.field2179 = arg1;
            class158.field3002 = arg5;
            if (arg3 && class66.field1151 >= 100) {
                class113.field2039 = class119.field2179 * 128 + 64;
                class268.field4745 = class134.field2403 * 128 + 64;
                class7.field157 = class236.method1606(74, class268.field4745, class113.field2039, class265.field4703) + -class207.field3794;
            }
            class211.field3848 = 2;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([BI)V")
    public static final void method1290(byte[] arg0, int arg1) {
        class118 var2 = new class118(arg0);
        var2.field2155 = arg0.length - 2;
        class27.field457 = var2.method827(255);
        class258.field4591 = new int[class27.field457];
        class145.field2766 = new int[class27.field457];
        ++field3374;
        class267.field4734 = new boolean[class27.field457];
        class174.field3182 = new byte[class27.field457][];
        class55.field940 = new int[class27.field457];
        class71.field1241 = new byte[class27.field457][];
        class249.field4418 = new int[class27.field457];
        var2.field2155 = arg0.length - 7 + -(class27.field457 * 8);
        class87.field1716 = var2.method827(arg1 ^ 255);
        class210.field3839 = var2.method827(255);
        int var3 = (var2.method867(false) & 255) - -1;
        for (int var4 = 0; var4 < class27.field457; ++var4) {
            class145.field2766[var4] = var2.method827(255);
        }
        for (int var5 = 0; ~var5 > ~class27.field457; ++var5) {
            class249.field4418[var5] = var2.method827(255);
        }
        for (int var6 = 0; class27.field457 > var6; ++var6) {
            class55.field940[var6] = var2.method827(255);
        }
        for (int var7 = 0; var7 < class27.field457; ++var7) {
            class258.field4591[var7] = var2.method827(255);
        }
        var2.field2155 = arg0.length - (class27.field457 * 8 + 7 - -((var3 + -1) * 3));
        class211.field3842 = new int[var3];
        for (int var8 = 1; ~var3 < ~var8; ++var8) {
            class211.field3842[var8] = var2.method873((byte) -102);
            if (~class211.field3842[var8] == -1) {
                class211.field3842[var8] = 1;
            }
        }
        var2.field2155 = arg1;
        for (int var9 = 0; var9 < class27.field457; ++var9) {
            int var10 = class55.field940[var9];
            int var11 = class258.field4591[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class174.field3182[var9] = var13;
            byte[] var14 = new byte[var12];
            boolean var15 = false;
            class71.field1241[var9] = var14;
            int var16 = var2.method867(false);
            if (~(var16 & 1) == -1) {
                for (int var17 = 0; var12 > var17; ++var17) {
                    var13[var17] = var2.method838(arg1 + 1275919136);
                }
                if (~(var16 & 2) != -1) {
                    for (int var18 = 0; ~var12 < ~var18; ++var18) {
                        byte var19 = var14[var18] = var2.method838(1275919136);
                        var15 |= ~var19 != 0;
                    }
                }
            } else {
                int var20 = 0;
                label97: while (true) {
                    if (var10 <= var20) {
                        if (~(2 & var16) == -1) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (~var21 <= ~var10) {
                                break label97;
                            }
                            for (int var22 = 0; ~var11 < ~var22; ++var22) {
                                byte var23 = var14[var21 - -(var10 * var22)] = var2.method838(1275919136);
                                var15 |= ~var23 != 0;
                            }
                            ++var21;
                        }
                    }
                    for (int var24 = 0; var11 > var24; ++var24) {
                        var13[var20 - -(var10 * var24)] = var2.method838(1275919136);
                    }
                    ++var20;
                }
            }
            class267.field4734[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)V")
    public final void method175(int arg0, int arg1, int arg2) {
        int var4 = this.field3369 * arg2 >> 12;
        int var5 = this.field3363 * arg2 >> 12;
        int var6 = this.field3377 * arg1 >> 12;
        ++field3361;
        if (arg0 != 30792) {
            method1288((byte) -87, -108);
        }
        int var7 = this.field3365 * arg1 >> 12;
        class130.method931(-88, var5, super.field464, var6, var4, var7);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public static void method1291(int arg0) {
        field3375 = null;
        field3376 = null;
        if (arg0 != -9740) {
            method1289(-53, 1, false, false, -48, -80, 107);
        }
        field3362 = null;
        field3378 = null;
        field3368 = null;
        field3359 = null;
        field3370 = null;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(III)V")
    public final void method182(int arg0, int arg1, int arg2) {
        ++field3364;
        int var4 = this.field3369 * arg2 >> 12;
        int var5 = this.field3377 * arg0 >> 12;
        int var6 = this.field3363 * arg2 >> 12;
        int var7 = -77 / ((arg1 - 50) / 61);
        int var8 = this.field3365 * arg0 >> 12;
        class72.method469(var8, var4, super.field480, super.field466, super.field464, var5, -5198, var6);
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(III)V")
    public static final void method1292(int arg0, int arg1, int arg2) {
        class182.field3349.method577(arg2, 0);
        ++class149.field2818;
        class182.field3349.method856(31133, arg0);
        ++field3371;
        class182.field3349.method833(arg1, (byte) 126);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(III)V")
    public final void method176(int arg0, int arg1, int arg2) {
        ++field3367;
        if (arg0 <= 119) {
            field3376 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIIIII)V")
    public class183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3363 = arg2;
        this.field3365 = arg3;
        this.field3377 = arg1;
        this.field3369 = arg0;
    }
}
