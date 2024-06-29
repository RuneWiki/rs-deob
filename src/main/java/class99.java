import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class99 extends class386 {

    @OriginalMember(owner = "client!qca", name = "H", descriptor = "I")
    private int field1329 = 16;

    @OriginalMember(owner = "client!qca", name = "J", descriptor = "I")
    private int field1331 = 2000;

    @OriginalMember(owner = "client!qca", name = "E", descriptor = "I")
    private int field1326 = 4096;

    @OriginalMember(owner = "client!qca", name = "F", descriptor = "I")
    private int field1327 = 0;

    @OriginalMember(owner = "client!qca", name = "N", descriptor = "I")
    private int field1335 = 0;

    @OriginalMember(owner = "client!qca", name = "O", descriptor = "Z")
    public static boolean field1336 = false;

    @OriginalMember(owner = "client!qca", name = "K", descriptor = "I")
    public static int field1332 = 0;

    @OriginalMember(owner = "client!qca", name = "G", descriptor = "Lvg;")
    public static class49 field1328 = new class49();

    @OriginalMember(owner = "client!qca", name = "P", descriptor = "Lgfa;")
    public static class696 field1337 = new class696(8, 0, 4, 1);

    @OriginalMember(owner = "client!qca", name = "D", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!qca", name = "I", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!qca", name = "L", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!qca", name = "M", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "()V")
    public class99() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
    public final void method358(int arg0) {
        if (arg0 >= 0) {
            ++field1330;
            class265.method1609((byte) -109);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ILrda;[I[I[I)V")
    public static final void method744(int arg0, class613 arg1, int[] arg2, int[] arg3, int[] arg4) {
        if (arg0 != -1) {
            field1328 = null;
        }
        ++field1334;
        for (int var5 = 0; ~var5 > ~arg3.length; ++var5) {
            int var6 = arg3[var5];
            int var7 = arg2[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && ~arg1.field2642.length < ~var9; ++var9) {
                if (~(var7 & 1) != -1) {
                    if (var6 == -1) {
                        arg1.field2642[var9] = null;
                    } else {
                        class282 var10 = class195.field2367.method3273(var6, ~arg0);
                        int var11 = var10.field3828;
                        class153 var12 = arg1.field2642[var9];
                        if (var12 != null) {
                            if (var12.field1891 == var6) {
                                if (~var11 == -1) {
                                    var12 = arg1.field2642[var9] = null;
                                } else if (~var11 != -2) {
                                    if (var11 == 2) {
                                        var12.field1885 = 0;
                                    }
                                } else {
                                    var12.field1892 = 1;
                                    var12.field1885 = 0;
                                    var12.field1886 = 0;
                                    var12.field1889 = var8;
                                    var12.field1894 = 0;
                                    if (!arg1.field2597) {
                                        class563.method3294((byte) -50, var10, arg1, 0);
                                    }
                                }
                            } else if (~var10.field3823 <= ~class195.field2367.method3273(var12.field1891, 0).field3823) {
                                var12 = arg1.field2642[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class153 var13 = arg1.field2642[var9] = new class153();
                            var13.field1892 = 1;
                            var13.field1886 = 0;
                            var13.field1894 = 0;
                            var13.field1889 = var8;
                            var13.field1885 = 0;
                            var13.field1891 = var6;
                            if (!arg1.field2597) {
                                class563.method3294((byte) -107, var10, arg1, 0);
                            }
                        }
                    }
                }
                var7 >>>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field1325;
        if (arg1 > 111) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        if (arg0 != 3) {
                            if (arg0 == 4) {
                                this.field1326 = arg2.method2260(-76);
                            }
                        } else {
                            this.field1327 = arg2.method2260(-62);
                        }
                    } else {
                        this.field1329 = arg2.method2229(255);
                    }
                } else {
                    this.field1331 = arg2.method2260(-61);
                }
            } else {
                this.field1335 = arg2.method2229(255);
            }
        }
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(Z)V")
    public static void method745(boolean arg0) {
        if (arg0) {
            field1328 = null;
        }
        field1337 = null;
        field1328 = null;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field1333;
        int[] var3 = super.field5140.method1564(arg0, true);
        int var4 = -25 % ((arg1 - 13) / 40);
        if (super.field5140.field3482) {
            int var5 = this.field1326 >> 1;
            int[][] var6 = super.field5140.method1563(-2);
            Random var7 = new Random((long) this.field1335);
            for (int var8 = 0; ~var8 > ~this.field1331; ++var8) {
                int var9 = this.field1326 <= 0 ? this.field1327 : -var5 + this.field1327 + class517.method3062(var7, 26100, this.field1326);
                int var10 = (var9 & 4092) >> 4;
                int var11 = class517.method3062(var7, 26100, class599.field8643);
                int var12 = class517.method3062(var7, 26100, class365.field4914);
                int var13 = var11 - -(class197.field2400[var10] * this.field1329 >> 12);
                int var14 = (class276.field3778[var10] * this.field1329 >> 12) + var12;
                int var15 = var14 - var12;
                int var16 = var13 - var11;
                if (var16 != 0 || ~var15 != -1) {
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var17 = var15 > var16;
                    if (var17) {
                        int var18 = var11;
                        int var19 = var13;
                        var11 = var12;
                        var13 = var14;
                        var12 = var18;
                        var14 = var19;
                    }
                    if (var13 < var11) {
                        int var20 = var11;
                        int var21 = var12;
                        var11 = var13;
                        var12 = var14;
                        var13 = var20;
                        var14 = var21;
                    }
                    int var22 = var12;
                    int var23 = var13 - var11;
                    int var24 = -var12 + var14;
                    int var25 = -var23 / 2;
                    int var26 = 2048 / var23;
                    int var27 = -(class517.method3062(var7, 26100, 4096) >> 2) + 1024;
                    int var28 = var14 > var12 ? 1 : -1;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    for (int var29 = var11; var29 < var13; ++var29) {
                        int var30 = var27 + 1024 - -((-var11 + var29) * var26);
                        int var31 = class276.field3782 & var29;
                        int var32 = var22 & class206.field2474;
                        var25 += var24;
                        if (var17) {
                            var6[var32][var31] = var30;
                        } else {
                            var6[var31][var32] = var30;
                        }
                        if (~var25 < -1) {
                            var25 += -var23;
                            var22 += var28;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
