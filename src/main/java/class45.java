import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class45 extends class30 {

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
    public static int field544 = 13156520;

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "F")
    public static float field543;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!gp", name = "E", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!gp", name = "G", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILin;)Lin;")
    public static final class78 method376(int arg0, class78 arg1) {
        ++field546;
        class78 var2 = client.method1678(arg1);
        if (arg0 <= 86) {
            field543 = -1.8974932F;
        }
        if (var2 == null) {
            var2 = arg1.field1074;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg0 <= 100) {
            method377(-15, 74, 23, 108, (class201) null);
        }
        if (arg1 == 0) {
            super.field378 = arg2.method2874((byte) -75) == 1;
        }
        ++field547;
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
    public class45() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field548;
        int[][] var3 = super.field377.method3683(arg0, (byte) -51);
        if (arg1 != 7) {
            field543 = -0.035121527F;
        }
        if (super.field377.field9085) {
            int[] var4 = this.method294(arg0, 2, (byte) -96);
            int[][] var5 = this.method292(arg1 + 74, 0, arg0);
            int[][] var6 = this.method292(111, 1, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class31.field399; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (var17 != 0) {
                        int var18 = 4096 - var17;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field542;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (arg0 != 1) {
            field544 = -87;
        }
        if (super.field374.field9032) {
            int[] var4 = this.method294(arg1, 0, (byte) 109);
            int[] var5 = this.method294(arg1, 1, (byte) -113);
            int[] var6 = this.method294(arg1, 2, (byte) 118);
            for (int var7 = 0; var7 < class31.field399; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIILcu;)Z")
    public static final boolean method377(int arg0, int arg1, int arg2, int arg3, class201 arg4) {
        if (arg1 != -19539) {
            method377(23, 19, 9, -89, (class201) null);
        }
        ++field545;
        if (!class539.field7280) {
            return false;
        } else if (class676.field9648 < 100) {
            return false;
        } else if (!class469.method2648((byte) -112, arg3, arg0, arg2)) {
            return false;
        } else {
            int var5 = arg2 << class588.field8259;
            int var6 = arg3 << class588.field8259;
            int var7 = -1 + class409.field5812[arg0].method332(arg3, 1, arg2);
            int var8 = arg4.method217(117) + var7;
            if (arg4.field2850 == 1) {
                if (!class39.method350(var5, var6, var8, class631.field8750 + var6, var5, var7, true, var6, var8, var5)) {
                    return false;
                } else if (!class39.method350(var5, class631.field8750 + var6, var7, class631.field8750 + var6, var5, var7, true, var6, var8, var5)) {
                    return false;
                } else {
                    ++class452.field6236;
                    return true;
                }
            } else if (~arg4.field2850 == -3) {
                if (!class39.method350(class631.field8750 + var5, class631.field8750 + var6, var8, var6 - -class631.field8750, var5, var7, true, class631.field8750 + var6, var8, var5)) {
                    return false;
                } else if (!class39.method350(var5 - -class631.field8750, class631.field8750 + var6, var8, class631.field8750 + var6, var5, var7, true, class631.field8750 + var6, var7, class631.field8750 + var5)) {
                    return false;
                } else {
                    ++class452.field6236;
                    return true;
                }
            } else if (arg4.field2850 == 4) {
                if (!class39.method350(var5 - -class631.field8750, var6, var8, class631.field8750 + var6, class631.field8750 + var5, var7, true, var6, var8, class631.field8750 + var5)) {
                    return false;
                } else if (!class39.method350(class631.field8750 + var5, var6 - -class631.field8750, var7, class631.field8750 + var6, class631.field8750 + var5, var7, true, var6, var8, class631.field8750 + var5)) {
                    return false;
                } else {
                    ++class452.field6236;
                    return true;
                }
            } else if (arg4.field2850 == 8) {
                if (!class39.method350(class631.field8750 + var5, var6, var8, var6, var5, var7, true, var6, var8, var5)) {
                    return false;
                } else if (!class39.method350(class631.field8750 + var5, var6, var8, var6, var5, var7, true, var6, var7, var5 - -class631.field8750)) {
                    return false;
                } else {
                    ++class452.field6236;
                    return true;
                }
            } else if (arg4.field2850 == 16) {
                if (!class566.method3242(class265.field3586, (byte) -50, var7, var5, class265.field3586, var8, var6 - -class265.field3586)) {
                    return false;
                } else {
                    ++class452.field6236;
                    return true;
                }
            } else if (~arg4.field2850 == -33) {
                if (!class566.method3242(class265.field3586, (byte) -114, var7, class265.field3586 + var5, class265.field3586, var8, class265.field3586 + var6)) {
                    return false;
                } else {
                    ++class452.field6236;
                    return true;
                }
            } else if (~arg4.field2850 == -65) {
                if (!class566.method3242(class265.field3586, (byte) -49, var7, class265.field3586 + var5, class265.field3586, var8, var6)) {
                    return false;
                } else {
                    ++class452.field6236;
                    return true;
                }
            } else if (~arg4.field2850 == -129) {
                if (!class566.method3242(class265.field3586, (byte) -97, var7, var5, class265.field3586, var8, var6)) {
                    return false;
                } else {
                    ++class452.field6236;
                    return true;
                }
            } else {
                return true;
            }
        }
    }
}
