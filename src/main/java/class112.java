import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class112 extends class739 {

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    private int field1576 = 1;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    private int field1575 = 1;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "F")
    public static float field1579 = 0.0F;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "Lrf;")
    public static class749 field1580 = new class749();

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "F")
    public static float field1584 = 1024.0F;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public static int field1585 = -1;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public static void method811(byte arg0) {
        field1580 = null;
        if (arg0 != -22) {
            method813((String) null, 64);
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class112() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)Ljia;")
    public static final class336 method812(int arg0, int arg1) {
        ++field1583;
        if (~arg0 == -1) {
            if ((double) class664.field9492 == 3.0D) {
                return class713.field10039;
            }
            if ((double) class664.field9492 == 4.0D) {
                return class196.field2867;
            }
            if ((double) class664.field9492 == 6.0D) {
                return class611.field8741;
            }
            if ((double) class664.field9492 >= 8.0D) {
                return class748.field10424;
            }
        } else if (arg0 != 1) {
            if (arg0 == 2) {
                if ((double) class664.field9492 == 3.0D) {
                    return class126.field1743;
                }
                if ((double) class664.field9492 == 4.0D) {
                    return class157.field2257;
                }
                if ((double) class664.field9492 == 6.0D) {
                    return class417.field5972;
                }
                if ((double) class664.field9492 >= 8.0D) {
                    return class64.field1008;
                }
            }
        } else {
            if ((double) class664.field9492 == 3.0D) {
                return class611.field8741;
            }
            if ((double) class664.field9492 == 4.0D) {
                return class748.field10424;
            }
            if ((double) class664.field9492 == 6.0D) {
                return class126.field1743;
            }
            if ((double) class664.field9492 >= 8.0D) {
                return class157.field2257;
            }
        }
        if (arg1 != 1) {
            method812(76, 50);
        }
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)[[I")
    public final int[][] method113(int arg0, int arg1) {
        ++field1582;
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (super.field10328.field4727) {
            int var4 = this.field1576 + 1 + this.field1576;
            int var5 = 65536 / var4;
            int var6 = this.field1575 + 1 - -this.field1575;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field1576 + arg0; this.field1576 + arg0 >= var9; ++var9) {
                int[][] var19 = this.method4124(class311.field4223 & var9, 0, true);
                int[][] var20 = new int[3][class399.field5703];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field1575; ~this.field1575 <= ~var27; ++var27) {
                    int var37 = class423.field6029 & var27;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class399.field5703 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = var31 - this.field1575 & class423.field6029;
                    ++var31;
                    int var33 = var21 - var24[var32];
                    int var34 = var23 - var26[var32];
                    int var35 = var22 - var25[var32];
                    int var36 = class423.field6029 & this.field1575 + var31;
                    var22 = var25[var36] + var35;
                    var21 = var24[var36] + var33;
                    var23 = var26[var36] + var34;
                }
                var8[var9 - -this.field1576 - arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class399.field5703 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return arg1 != 8213 ? null : var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg2 != 1) {
            this.field1575 = 77;
        }
        ++field1578;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field10320 = ~arg0.method2886(true) == -2;
                }
            } else {
                this.field1576 = arg0.method2886(true);
            }
        } else {
            this.field1575 = arg0.method2886(true);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        ++field1577;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int var4 = this.field1576 + this.field1576 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field1575 + this.field1575 - -1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field1576; ~(this.field1576 + arg1) <= ~var9; ++var9) {
                int[] var13 = this.method4127(var9 & class311.field4223, 122, 0);
                int[] var14 = new int[class399.field5703];
                int var15 = 0;
                for (int var16 = -this.field1575; this.field1575 >= var16; ++var16) {
                    var15 += var13[class423.field6029 & var16];
                }
                int var17 = 0;
                while (~var17 > ~class399.field5703) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class423.field6029 & -this.field1575 + var17];
                    ++var17;
                    var15 = var13[this.field1575 + var17 & class423.field6029] + var18;
                }
                var8[this.field1576 + var9 + -arg1] = var14;
            }
            for (int var10 = 0; ~var10 > ~class399.field5703; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method813(String arg0, int arg1) {
        class145.method1013(arg0, (byte) -86, "", 0, 0, "", "");
        if (arg1 == 13172) {
            ++field1581;
        }
    }
}
