import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class473 extends class83 implements class204 {

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    private int field6526;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    public static int field6523 = -1;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "Lmt;")
    public static class419 field6527 = new class419(14, 0, 4, 1);

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "Laj;")
    public static class333 field6529;

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "Lrq;")
    public static class372 field6534;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZI[B)V", line = 3)
    public final void method1373(int arg0, boolean arg1, int arg2, byte[] arg3) {
        this.method691(arg3, 17199, arg0);
        ++field6525;
        this.field6526 = arg2;
        if (!arg1) {
            field6523 = 106;
        }
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(B)V", line = 18)
    public static void method2777(byte arg0) {
        field6527 = null;
        if (arg0 <= -13) {
            field6529 = null;
            field6534 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(Z)V", line = 30)
    public static final void method2778(boolean arg0) {
        ++field6532;
        if (class182.field2413 == null) {
            class182.field2413 = new int[65536];
            double var1 = Math.random() * 0.03D - 0.015D + 0.7D;
            if (arg0) {
                field6527 = null;
            }
            int var3 = 0;
            for (int var4 = 0; ~var4 > -513; ++var4) {
                float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                float var6 = (float) (var4 & 7) / 8.0F + 0.0625F;
                for (int var7 = 0; var7 < 128; ++var7) {
                    float var8 = (float) var7 / 128.0F;
                    float var9 = 0.0F;
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    float var12 = var5 / 60.0F;
                    int var13 = (int) var12;
                    int var14 = var13 % 6;
                    float var15 = var12 - (float) var13;
                    float var16 = (-var6 + 1.0F) * var8;
                    float var17 = (1.0F - var6 * var15) * var8;
                    float var18 = (1.0F - (-var15 + 1.0F) * var6) * var8;
                    if (var14 == 0) {
                        var10 = var18;
                        var9 = var8;
                        var11 = var16;
                    } else if (~var14 != -2) {
                        if (~var14 == -3) {
                            var11 = var18;
                            var10 = var8;
                            var9 = var16;
                        } else if (var14 != 3) {
                            if (var14 == 4) {
                                var10 = var16;
                                var11 = var8;
                                var9 = var18;
                            } else if (~var14 == -6) {
                                var11 = var17;
                                var9 = var8;
                                var10 = var16;
                            }
                        } else {
                            var11 = var8;
                            var9 = var16;
                            var10 = var17;
                        }
                    } else {
                        var11 = var16;
                        var10 = var8;
                        var9 = var17;
                    }
                    float var19 = (float) Math.pow((double) var9, var1);
                    float var20 = (float) Math.pow((double) var10, var1);
                    float var21 = (float) Math.pow((double) var11, var1);
                    int var22 = (int) (var19 * 256.0F);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = -16777216 - -var24 + (var22 << 16) + (var23 << 8);
                    class182.field2413[var3++] = var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLbba;)V", line = 153)
    public static final void method2779(byte arg0, class124 arg1) {
        ++field6531;
        boolean var2 = false;
        if (arg0 != 75) {
            field6529 = null;
        }
        if (class100.field1401 != arg1.field1803 && ~arg1.field1827 != 0 && ~arg1.field1829 == -1) {
            class489 var3 = class6.field65.method1034(arg1.field1827, arg0 ^ 75);
            if (var3.field6792 || ~(arg1.field1806 + 1) < ~var3.field6773[arg1.field1795]) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = arg1.field1803 - arg1.field1836;
            int var5 = class100.field1401 - arg1.field1836;
            int var6 = arg1.field1814 * 512 - -(arg1.method655(-126) * 256);
            int var7 = arg1.field1841 * 512 + 256 * arg1.method655(-125);
            int var8 = arg1.field1791 * 512 - -(256 * arg1.method655(-125));
            int var9 = arg1.field1874 * 512 - -(arg1.method655(-125) * 256);
            arg1.field2259 = ((-var5 + var4) * var7 + var5 * var9) / var4;
            arg1.field2257 = ((-var5 + var4) * var6 + var5 * var8) / var4;
        }
        arg1.field1881 = 0;
        if (arg1.field1830 == 0) {
            arg1.method1021(16383, false, 8192);
        }
        if (~arg1.field1830 == -2) {
            arg1.method1021(16383, false, 12288);
        }
        if (arg1.field1830 == 2) {
            arg1.method1021(16383, false, 0);
        }
        if (~arg1.field1830 == -4) {
            arg1.method1021(16383, false, 4096);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)I", line = 216)
    public final int method1374(byte arg0) {
        ++field6524;
        return arg0 >= -41 ? -91 : this.field6526;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)I", line = 229)
    public final int method1376(boolean arg0) {
        if (arg0) {
            return 78;
        } else {
            ++field6528;
            return super.field1171;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)J", line = 240)
    public final long method1375(int arg0) {
        ++field6533;
        if (arg0 != 23163) {
            this.field6526 = -20;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Ldia;I[BIZ)V", line = 252)
    public class473(class246 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field6526 = arg1;
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V", line = 261)
    public final void method694(int arg0) {
        ++field6530;
        int var2 = -9 / ((arg0 - -20) / 60);
        super.field1170.method1652(-128, this);
    }
}
