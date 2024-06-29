import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class250 extends class242 {

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    private int field4379 = 4096;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    private int field4382 = 2000;

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "I")
    private int field4388 = 0;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    private int field4381 = 0;

    @OriginalMember(owner = "client!fe", name = "ib", descriptor = "I")
    private int field4393 = 16;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "[I")
    public static int[] field4376 = new int[2048];

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "Z")
    public static boolean field4377 = false;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field4378 = 0;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "Z")
    public static boolean field4380 = false;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "[I")
    public static int[] field4385 = new int[4096];

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "[I")
    public static int[] field4384 = new int[1000];

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!fe", name = "hb", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!fe", name = "gb", descriptor = "Lig;")
    public static class9 field4391;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIBIII)V")
    public static final void method1686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        if (arg4 == arg5 && arg1 == arg9 && ~arg2 == ~arg3 && ~arg7 == ~arg8) {
            class211.method1413(arg1, arg5, arg3, false, arg0, arg8);
        } else {
            int var10 = arg5;
            int var11 = arg5 * 3;
            int var12 = arg1 * 3;
            int var13 = arg4 * 3;
            int var14 = arg7 * 3;
            int var15 = arg9 * 3;
            int var16 = arg2 * 3;
            int var17 = arg1;
            int var18 = -arg5 + arg3 + -var16 + var13;
            int var19 = -arg1 + arg8 + -var14 + var15;
            int var20 = -var13 + var11 + -var13 + var16;
            int var21 = -var15 + var14 + var12 - var15;
            int var22 = -var12 + var15;
            int var23 = -var11 + var13;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var20 * var25;
                int var29 = var21 * var25;
                int var30 = var19 * var26;
                int var31 = var23 * var24;
                int var32 = var22 * var24;
                int var33 = (var27 + var28 - -var31 >> 12) + arg5;
                int var34 = (var29 + var32 + var30 >> 12) + arg1;
                class211.method1413(var17, var10, var33, false, arg0, var34);
                var17 = var34;
                var10 = var33;
            }
        }
        ++field4387;
        if (arg6 != 15) {
            field4378 = 40;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class250() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)Z")
    public static final boolean method1687(int arg0, int arg1) {
        ++field4386;
        if (arg0 != -8651) {
            field4377 = false;
        }
        return ~((3487743 & arg1) >> 21) != -1;
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V")
    public final void method111(int arg0) {
        class252.method1696(-78);
        ++field4383;
        if (arg0 <= 122) {
            this.field4379 = 26;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)V")
    public static final void method1688(int arg0, boolean arg1) {
        if (arg0 >= 0) {
            field4384 = null;
        }
        ++field4392;
        class92.field1501 = arg1;
        class86.field1422 = !class215.method1436(104);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
    public static void method1689(boolean arg0) {
        field4384 = null;
        field4385 = null;
        field4376 = null;
        field4391 = null;
        if (arg0) {
            field4384 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        ++field4390;
        int[] var3 = super.field4251.method1417((byte) 114, arg0);
        if (super.field4251.field3655) {
            int var4 = this.field4379 >> 1;
            int[][] var5 = super.field4251.method1420(0);
            Random var6 = new Random((long) this.field4388);
            for (int var7 = 0; var7 < this.field4382; ++var7) {
                int var8 = ~this.field4379 >= -1 ? this.field4381 : this.field4381 + -var4 + class47.method352(1, var6, this.field4379);
                int var9 = class47.method352(1, var6, class264.field4654);
                int var10 = class47.method352(1, var6, class25.field486);
                int var11 = var8 >> 4 & 255;
                int var12 = (class201.field3516[var11] * this.field4393 >> 12) + var10;
                int var13 = var9 - -(class90.field1459[var11] * this.field4393 >> 12);
                int var14 = var12 - var10;
                int var15 = -var9 + var13;
                if (~var15 != -1 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var9;
                        var9 = var10;
                        var10 = var17;
                        int var18 = var13;
                        var13 = var12;
                        var12 = var18;
                    }
                    if (var13 < var9) {
                        int var19 = var9;
                        int var20 = var10;
                        var10 = var12;
                        var9 = var13;
                        var12 = var20;
                        var13 = var19;
                    }
                    int var21 = var10;
                    int var22 = -var9 + var13;
                    int var23 = -var10 + var12;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class47.method352(1, var6, 4096) >> 2);
                    int var27 = ~var10 <= ~var12 ? -1 : 1;
                    for (int var28 = var9; ~var28 > ~var13; ++var28) {
                        var24 += var23;
                        int var29 = var28 & class230.field3968;
                        int var30 = (-var9 + var28) * var25 + 1024 + var26;
                        int var31 = class29.field540 & var21;
                        if (~var24 < -1) {
                            var21 += var27;
                            var24 += -var22;
                        }
                        if (var16) {
                            var5[var31][var29] = var30;
                        } else {
                            var5[var29][var31] = var30;
                        }
                    }
                }
            }
        }
        int var32 = 111 % ((arg1 - 73) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            this.field4379 = arg2.method193((byte) 77);
                        }
                    } else {
                        this.field4381 = arg2.method193((byte) 77);
                    }
                } else {
                    this.field4393 = arg2.method189((byte) -103);
                }
            } else {
                this.field4382 = arg2.method193((byte) 77);
            }
        } else {
            this.field4388 = arg2.method189((byte) -103);
        }
        if (arg0 >= -119) {
            this.field4388 = 50;
        }
        ++field4389;
    }
}
