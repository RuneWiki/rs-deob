import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class151 extends class200 {

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "[I")
    public static int[] field2749 = new int[2];

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "I")
    public static int field2751 = -1;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "Lid;")
    public static class149 field2757 = class60.method382(")4a=", (byte) 97);

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "Leg;")
    public static class225 field2755;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "[S")
    public static short[] field2753;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IJ)V")
    public static final void method1074(int arg0, long arg1) {
        ++field2754;
        if (arg1 > 0L) {
            if (arg0 <= -104) {
                if (arg1 % 10L == 0L) {
                    class45.method260(89, arg1 + -1L);
                    class45.method260(125, 1L);
                } else {
                    class45.method260(103, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (~arg2 == -1) {
            super.field3641 = arg0.method489((byte) 94) == 1;
        }
        if (!arg1) {
            method1075(-116);
        }
        ++field2758;
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
    public static void method1075(int arg0) {
        field2749 = null;
        field2753 = null;
        field2757 = null;
        field2755 = null;
        if (arg0 < 122) {
            method1075(-44);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
    public static final void method1076(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2750;
        int var5 = -39 / ((arg4 - -52) / 35);
        if (~class55.field993 == -2) {
            class176.field3230[class283.field5011 / 100].method263(class223.field3925 + -8, class136.field2506 - 8);
        }
        if (~class55.field993 == -3) {
            class176.field3230[class283.field5011 / 100 + 4].method263(class223.field3925 + -8, class136.field2506 - 8);
        }
        class188.method1285((byte) -20);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        if (arg1 != 55) {
            this.method26(-14, (byte) 16);
        }
        ++field2752;
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            int[] var4 = this.method1368(0, arg0, false);
            int[] var5 = this.method1368(1, arg0, false);
            int[] var6 = this.method1368(2, arg0, false);
            for (int var7 = 0; var7 < class137.field2515; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class151() {
        super(3, false);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        int[][] var3 = super.field3632.method965(arg1, 48);
        if (!arg0) {
            return null;
        } else {
            if (super.field3632.field2550) {
                int[] var4 = this.method1368(2, arg1, false);
                int[][] var5 = this.method1366(arg1, false, 0);
                int[][] var6 = this.method1366(arg1, false, 1);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; class137.field2515 > var16; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 == -4097) {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    } else if (~var17 == -1) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                }
            }
            ++field2759;
            return var3;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)Lec;")
    public static final class23 method1077(int arg0, int arg1, int arg2) {
        class231 var3 = class261.field4664[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field4047; ++var4) {
                class23 var5 = var3.field4061[var4];
                if ((var5.field338 >> 29 & 3L) == 2L && var5.field318 == arg1 && var5.field330 == arg2) {
                    return var5;
                }
            }
            return null;
        }
    }
}
