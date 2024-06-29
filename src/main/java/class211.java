import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class211 extends class107 {

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    private int field3371 = 4096;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    private int field3369 = 0;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3368 = "";

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3367 = null;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field3370 = 0;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Lgi;")
    public static class164 field3362;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "[I")
    public static int[] field3364;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z[BI)I")
    public static final int method1451(boolean arg0, byte[] arg1, int arg2) {
        if (!arg0) {
            return 85;
        } else {
            ++field3372;
            return class215.method1479(0, arg1, true, arg2);
        }
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V")
    public static void method1452(int arg0) {
        if (arg0 <= 62) {
            field3367 = null;
        }
        field3368 = null;
        field3364 = null;
        field3362 = null;
        field3367 = null;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class211() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field3366;
        int var3 = -20 / ((-34 - arg0) / 49);
        int[] var4 = super.field1661.method894(114, arg1);
        if (super.field1661.field2115) {
            int[] var5 = this.method756(0, arg1, -29053);
            for (int var6 = 0; var6 < class24.field443; ++var6) {
                int var7 = var5[var6];
                var4[var6] = ~var7 <= ~this.field3369 && this.field3371 >= var7 ? 4096 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field3371 = arg1.method1837(252);
            }
        } else {
            this.field3369 = arg1.method1837(252);
        }
        ++field3365;
        if (arg2 != 28) {
            field3367 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)I")
    public static final int method1453(int arg0, int arg1) {
        if (arg1 < 72) {
            method1454((int[]) null, -5, -18, 101, -58, 2);
        }
        ++field3373;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([IIIIII)V")
    public static final void method1454(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class116 var6 = class307.field4991[arg3][arg4][arg5];
        if (var6 != null) {
            class9 var7 = var6.field1783;
            if (var7 == null) {
                class283 var10 = var6.field1772;
                if (var10 != null) {
                    int var11 = var10.field4596;
                    int var12 = var10.field4580;
                    int var13 = var10.field4594;
                    int var14 = var10.field4586;
                    int[] var15 = class284.field4600[var11];
                    int[] var16 = class310.field5008[var12];
                    int var17 = 0;
                    if (var13 != 0) {
                        for (int var18 = 0; var18 < 4; ++var18) {
                            arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                            arg1 += arg2;
                        }
                    } else {
                        for (int var19 = 0; var19 < 4; ++var19) {
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 1] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 2] = var14;
                            }
                            if (var15[var16[var17++]] != 0) {
                                arg0[arg1 + 3] = var14;
                            }
                            arg1 += arg2;
                        }
                    }
                }
            } else {
                int var8 = var7.field194;
                if (var8 != 0) {
                    for (int var9 = 0; var9 < 4; ++var9) {
                        arg0[arg1] = var8;
                        arg0[arg1 + 1] = var8;
                        arg0[arg1 + 2] = var8;
                        arg0[arg1 + 3] = var8;
                        arg1 += arg2;
                    }
                }
            }
        }
    }
}
