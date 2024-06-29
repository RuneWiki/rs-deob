import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class714 extends class592 implements class227 {

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    private int field10124;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "Ljf;")
    public static class640 field10126 = new class640(11, -1);

    @OriginalMember(owner = "client!to", name = "x", descriptor = "Lqk;")
    public static class148 field10130 = new class148(75, 6);

    @OriginalMember(owner = "client!to", name = "y", descriptor = "[Lek;")
    public static class599[] field10131 = null;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field10119;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field10120;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public static int field10121;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public static int field10122;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public static int field10123;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    public static int field10125;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public static int field10127;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public static int field10128;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "I")
    public static int field10129;

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lep;ILjaclib/memory/Buffer;IZ)V")
    public class714(class371 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field10124 = arg1;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)I")
    public final int method1473(int arg0) {
        ++field10129;
        if (arg0 != -30695) {
            method4029(-120, -3);
        }
        return this.field10124;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
    public static void method4025(int arg0) {
        field10130 = null;
        field10126 = null;
        field10131 = null;
        int var1 = -106 % ((30 - arg0) / 52);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)J")
    public final long method1472(byte arg0) {
        if (arg0 > -75) {
            return -27L;
        } else {
            ++field10125;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIII)I")
    public static final int method4026(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field10119;
        int var5 = arg4 & 15;
        if (arg3 != 34962) {
            field10130 = null;
        }
        int var6 = var5 < 8 ? arg0 : arg1;
        int var7 = ~var5 > -5 ? arg1 : (~var5 != -13 && var5 != 14 ? arg2 : arg0);
        return ((var5 & 1) == 0 ? var6 : -var6) + ((2 & var5) != 0 ? -var7 : var7);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BC)Z")
    public static final boolean method4027(byte arg0, char arg1) {
        ++field10120;
        int var2 = -76 % ((arg0 - -22) / 51);
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lep;I[BIZ)V")
    public class714(class371 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field10124 = arg1;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "([IBILkda;)Liha;")
    public static final class611 method4028(int[] arg0, byte arg1, int arg2, class64 arg3) {
        int var4 = 67 % ((17 - arg1) / 32);
        ++field10122;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        float[][] var8 = null;
        if (arg3.field897 != null) {
            int var9 = arg3.field850;
            int[] var10 = new int[var9];
            int[] var11 = new int[var9];
            int[] var12 = new int[var9];
            int[] var13 = new int[var9];
            int[] var14 = new int[var9];
            int[] var15 = new int[var9];
            for (int var16 = 0; ~var16 > ~var9; ++var16) {
                var10[var16] = Integer.MAX_VALUE;
                var11[var16] = -2147483647;
                var12[var16] = Integer.MAX_VALUE;
                var13[var16] = -2147483647;
                var14[var16] = Integer.MAX_VALUE;
                var15[var16] = -2147483647;
            }
            for (int var17 = 0; ~arg2 < ~var17; ++var17) {
                int var24 = arg0[var17];
                if (~arg3.field897[var24] != 0) {
                    int var25 = 255 & arg3.field897[var24];
                    for (int var26 = 0; var26 < 3; ++var26) {
                        short var27;
                        if (~var26 != -1) {
                            if (~var26 == -2) {
                                var27 = arg3.field865[var24];
                            } else {
                                var27 = arg3.field852[var24];
                            }
                        } else {
                            var27 = arg3.field863[var24];
                        }
                        int var28 = arg3.field876[var27];
                        int var29 = arg3.field887[var27];
                        int var30 = arg3.field884[var27];
                        if (var10[var25] > var28) {
                            var10[var25] = var28;
                        }
                        if (var11[var25] < var28) {
                            var11[var25] = var28;
                        }
                        if (~var29 > ~var12[var25]) {
                            var12[var25] = var29;
                        }
                        if (var29 > var13[var25]) {
                            var13[var25] = var29;
                        }
                        if (var30 < var14[var25]) {
                            var14[var25] = var30;
                        }
                        if (var30 > var15[var25]) {
                            var15[var25] = var30;
                        }
                    }
                }
            }
            var5 = new int[var9];
            var6 = new int[var9];
            var8 = new float[var9][];
            var7 = new int[var9];
            for (int var18 = 0; var9 > var18; ++var18) {
                byte var19 = arg3.field867[var18];
                if (var19 > 0) {
                    var5[var18] = (var10[var18] + var11[var18]) / 2;
                    var6[var18] = (var12[var18] + var13[var18]) / 2;
                    var7[var18] = (var14[var18] + var15[var18]) / 2;
                    float var21;
                    float var22;
                    float var23;
                    if (var19 == 1) {
                        int var20 = arg3.field862[var18];
                        if (~var20 == -1) {
                            var21 = 1.0F;
                            var22 = 1.0F;
                        } else if (~var20 >= -1) {
                            var21 = (float) (-var20) / 1024.0F;
                            var22 = 1.0F;
                        } else {
                            var22 = (float) var20 / 1024.0F;
                            var21 = 1.0F;
                        }
                        var23 = 64.0F / (float) arg3.field889[var18];
                    } else if (var19 != 2) {
                        var22 = (float) arg3.field856[var18] / 1024.0F;
                        var23 = (float) arg3.field889[var18] / 1024.0F;
                        var21 = (float) arg3.field862[var18] / 1024.0F;
                    } else {
                        var22 = 64.0F / (float) arg3.field856[var18];
                        var21 = 64.0F / (float) arg3.field862[var18];
                        var23 = 64.0F / (float) arg3.field889[var18];
                    }
                    var8[var18] = class405.method2457(var22, arg3.field898[var18], 0, arg3.field847[var18], arg3.field899[var18], var23, var21, class136.method878(arg3.field894[var18], 255));
                }
            }
        }
        return new class611(var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BII[B)V")
    public final void method1471(byte arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 == 100) {
            ++field10121;
            this.method3518(arg2, arg0 + 34940, arg3);
            this.field10124 = arg1;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
    public final int method1470(int arg0) {
        ++field10127;
        return arg0 != 10059 ? 0 : super.field8534;
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V")
    public final void method3178(int arg0) {
        ++field10128;
        if (arg0 == 34963) {
            super.field8540.method2205(this, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)V")
    public static final void method4029(int arg0, int arg1) {
        if (arg1 == -19135) {
            ++field10123;
            class118 var2 = class126.method814(true, arg0, 9);
            var2.method778(arg1 + 47105);
        }
    }
}
