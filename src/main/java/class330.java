import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class330 extends class145 {

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "I")
    private int field4744 = 0;

    @OriginalMember(owner = "client!tm", name = "H", descriptor = "I")
    private int field4746 = 2000;

    @OriginalMember(owner = "client!tm", name = "P", descriptor = "I")
    private int field4753 = 0;

    @OriginalMember(owner = "client!tm", name = "M", descriptor = "I")
    private int field4750 = 16;

    @OriginalMember(owner = "client!tm", name = "T", descriptor = "I")
    private int field4757 = 4096;

    @OriginalMember(owner = "client!tm", name = "E", descriptor = "[Lgg;")
    public static class151[] field4743 = new class151[6];

    @OriginalMember(owner = "client!tm", name = "S", descriptor = "I")
    public static int field4756 = -1;

    @OriginalMember(owner = "client!tm", name = "J", descriptor = "F")
    public static float field4748;

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!tm", name = "L", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!tm", name = "N", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!tm", name = "O", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!tm", name = "Q", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!tm", name = "R", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!tm", name = "I", descriptor = "Lkea;")
    public static class203 field4747;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I")
    public static final int method2151(int arg0, int arg1) {
        ++field4751;
        int var2 = 56 % ((-17 - arg0) / 62);
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2152(int arg0, boolean arg1) {
        ++field4749;
        if (arg1) {
            return false;
        } else {
            return arg0 == 1 || arg0 == 3 || arg0 == 5;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field4752;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int var4 = this.field4757 >> 1;
            int[][] var5 = super.field1779.method2077((byte) 93);
            Random var6 = new Random((long) this.field4744);
            for (int var7 = 0; var7 < this.field4746; ++var7) {
                int var8 = ~this.field4757 < -1 ? -var4 + this.field4753 + class107.method659(var6, false, this.field4757) : this.field4753;
                int var9 = (4090 & var8) >> 4;
                int var10 = class107.method659(var6, arg0, class647.field9368);
                int var11 = class107.method659(var6, false, class441.field6574);
                int var12 = var10 - -(class215.field2959[var9] * this.field4750 >> 12);
                int var13 = (class101.field1202[var9] * this.field4750 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class107.method659(var6, false, 4096) >> 2);
                    int var27 = ~var11 <= ~var13 ? -1 : 1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = var28 & class619.field8980;
                        int var31 = class444.field6649 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        if (arg0) {
            method2154(109, 91, (byte) 66);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "(I)V")
    public static void method2153(int arg0) {
        field4747 = null;
        field4743 = null;
        if (arg0 >= -87) {
            field4756 = 66;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (arg1 >= -67) {
            field4743 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            this.field4757 = arg2.method1220(-78);
                        }
                    } else {
                        this.field4753 = arg2.method1220(-126);
                    }
                } else {
                    this.field4750 = arg2.method1177(255);
                }
            } else {
                this.field4746 = arg2.method1220(-104);
            }
        } else {
            this.field4744 = arg2.method1177(255);
        }
        ++field4755;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(IIB)Z")
    public static final boolean method2154(int arg0, int arg1, byte arg2) {
        ++field4745;
        if (arg2 != 29) {
            field4743 = null;
        }
        return (544 & arg0) == 544 | (24 & arg0) != 0;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
    public class330() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "(I)V")
    public final void method145(int arg0) {
        class315.method2072((byte) -12);
        ++field4754;
        int var2 = 7 % ((-46 - arg0) / 45);
    }
}
