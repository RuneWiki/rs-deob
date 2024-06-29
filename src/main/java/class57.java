import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class57 extends class13 {

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    private int field773 = 409;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    private int field775 = 4096;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    private int field774 = 4096;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    private int field780 = 4096;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "[I")
    private int[] field781 = new int[3];

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public static int field776 = -1;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "[[[I")
    public static int[][][] field783;

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class57() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg1 < 50) {
            this.field775 = -119;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg0.method208(27308);
                            this.field781[0] = class387.method2454(var5 << 4, 267386880);
                            this.field781[1] = class387.method2454(var5, 65280) >> 4;
                            this.field781[2] = class387.method2454(0, var5 >> 12);
                        }
                    } else {
                        this.field775 = arg0.method174(255);
                    }
                } else {
                    this.field774 = arg0.method174(255);
                }
            } else {
                this.field780 = arg0.method174(255);
            }
        } else {
            this.field773 = arg0.method174(255);
        }
        ++field778;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lms;B)V")
    public static final void method460(class453 arg0, byte arg1) {
        ++field777;
        int var2 = arg0.field6403;
        if (arg1 != 119) {
            field783 = null;
        }
        if (var2 == 327) {
            arg0.field6465 = 150;
            arg0.field6456 = 16383 & (int) (Math.sin((double) class276.field3837 / 40.0D) * 256.0D);
            arg0.field6445 = 5;
            arg0.field6323 = -1;
        } else if (var2 == 328) {
            if (class412.field5841.field1922 == null) {
                arg0.field6323 = 0;
                arg0.field6332 = 0;
            } else {
                arg0.field6465 = 150;
                arg0.field6456 = (int) (Math.sin((double) class276.field3837 / 40.0D) * 256.0D) & 2047;
                arg0.field6445 = 5;
                arg0.field6323 = 2047;
                arg0.field6332 = class413.method2590((byte) 113, class412.field5841.field1922);
                arg0.field6371 = class412.field5841.field5297;
                arg0.field6427 = class412.field5841.field5270;
                arg0.field6421 = 0;
                arg0.field6399 = class412.field5841.field5273;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
    public static void method461(int arg0) {
        field783 = null;
        if (arg0 >= -101) {
            field783 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[[I")
    public final int[][] method222(int arg0, int arg1) {
        ++field784;
        int[][] var3 = super.field256.method1930(arg1, (byte) 127);
        if (arg0 != -27832) {
            this.method31((class11) null, (byte) -81, 72);
        }
        if (super.field256.field4154) {
            int[][] var4 = this.method227(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class269.field3751; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field781[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field773) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field781[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field773) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field781[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field773 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field775 * var12 >> 12;
                            var9[var11] = this.field774 * var14 >> 12;
                            var10[var11] = this.field780 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
