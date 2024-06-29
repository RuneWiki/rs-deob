import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class182 extends class59 {

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    private int field3452 = 0;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    private int field3454 = 4096;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    private int field3455 = 0;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    private int field3458 = 16;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "I")
    private int field3460 = 2000;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "[Lnf;")
    public static class123[] field3451 = new class123[2048];

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "[Lcb;")
    public static class22[] field3453 = new class22[256];

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    public static volatile int field3448 = 0;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "Lsd;")
    public static class166 field3447 = class135.method935("leuchten1:", 0);

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "I")
    public static int field3459 = 0;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "Lb;")
    public static class11 field3457 = new class11(64);

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "[Lsd;")
    public static class166[] field3462 = new class166[500];

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "Lsd;")
    public static class166 field3463 = class135.method935("jolt", 0);

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        ++field3449;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            this.field3454 = arg0.method405(2);
                        }
                    } else {
                        this.field3452 = arg0.method405(2);
                    }
                } else {
                    this.field3458 = arg0.method400(255);
                }
            } else {
                this.field3460 = arg0.method405(2);
            }
        } else {
            this.field3455 = arg0.method400(255);
        }
        if (arg1 < 18) {
            this.method41((class53) null, (byte) -68, 18);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
    public static void method1233(boolean arg0) {
        field3457 = null;
        field3463 = null;
        field3453 = null;
        field3447 = null;
        field3462 = null;
        if (arg0) {
            field3451 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class182() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        if (arg1 > -124) {
            this.field3458 = 52;
        }
        ++field3450;
        int[] var3 = super.field1219.method721(arg0, -126);
        if (super.field1219.field1816) {
            int var4 = this.field3454 >> 1;
            int[][] var5 = super.field1219.method722(102);
            Random var6 = new Random((long) this.field3455);
            for (int var7 = 0; this.field3460 > var7; ++var7) {
                int var8 = this.field3454 <= 0 ? this.field3452 : this.field3452 - (-class12.method75(var6, (byte) -126, this.field3454) - -var4);
                int var9 = 255 & var8 >> 4;
                int var10 = class12.method75(var6, (byte) -126, class98.field1879);
                int var11 = class12.method75(var6, (byte) -126, class171.field3285);
                int var12 = (class92.field1808[var9] * this.field3458 >> 12) + var10;
                int var13 = (class63.field1316[var9] * this.field3458 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var12 = var13;
                        var13 = var18;
                        var11 = var17;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = -var10 + var12;
                    int var22 = -var11 + var13;
                    int var23 = var11;
                    if (var22 < 0) {
                        var22 = -var22;
                    }
                    int var24 = -var21 / 2;
                    int var25 = 2048 / var21;
                    int var26 = -(class12.method75(var6, (byte) -128, 4096) >> 2) + 1024;
                    int var27 = var11 >= var13 ? -1 : 1;
                    for (int var28 = var10; var28 < var12; ++var28) {
                        var24 += var22;
                        int var29 = class187.field3571 & var28;
                        int var30 = (-var10 + var28) * var25 + var26 + 1024;
                        int var31 = class137.field2679 & var23;
                        if (var16) {
                            var5[var31][var29] = var30;
                        } else {
                            var5[var29][var31] = var30;
                        }
                        if (var24 > 0) {
                            var23 += var27;
                            var24 += -var21;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IJ)V")
    public static final void method1234(int arg0, long arg1) {
        if (arg0 != 1024) {
            method1234(10, -27L);
        }
        ++field3461;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    public final void method287(int arg0) {
        class92.method718(true);
        ++field3456;
        if (arg0 != 23459) {
            this.method36(82, (byte) 9);
        }
    }
}
