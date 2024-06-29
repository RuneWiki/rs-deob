import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class384 extends class666 {

    @OriginalMember(owner = "client!un", name = "F", descriptor = "Z")
    public static boolean field5139 = false;

    @OriginalMember(owner = "client!un", name = "E", descriptor = "Lpr;")
    public static class407 field5138 = new class407(49, 0);

    @OriginalMember(owner = "client!un", name = "D", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!un", name = "G", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!un", name = "H", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!un", name = "I", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (arg2) {
            if (arg0 == 0) {
                super.field9465 = arg1.method2541(55) == 1;
            }
            ++field5141;
        }
    }

    @OriginalMember(owner = "client!un", name = "h", descriptor = "(I)V")
    public static void method2109(int arg0) {
        field5138 = null;
        if (arg0 != 2) {
            method2109(-122);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[I")
    public final int[] method122(int arg0, int arg1) {
        ++field5140;
        if (arg0 >= -21) {
            method2109(6);
        }
        int[] var3 = super.field9466.method1811(arg1, 84);
        if (super.field9466.field4172) {
            int[] var4 = this.method3739(0, -126, arg1);
            int[] var5 = this.method3739(1, -121, arg1);
            int[] var6 = this.method3739(2, -126, arg1);
            for (int var7 = 0; class501.field7222 > var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (~var8 != -1) {
                    var3[var7] = var4[var7] * var8 - -((4096 - var8) * var5[var7]) >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
    public class384() {
        super(3, false);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(II)I")
    public static final int method2110(int arg0, int arg1) {
        if (arg1 != 0) {
            field5139 = true;
        }
        ++field5137;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1251(int arg0, byte arg1) {
        ++field5142;
        int[][] var3 = super.field9471.method3639(13, arg0);
        if (super.field9471.field9180) {
            int[] var4 = this.method3739(2, -120, arg0);
            int[][] var5 = this.method3737(arg0, 0, 3);
            int[][] var6 = this.method3737(arg0, 1, 3);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class501.field7222; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (~var17 != -1) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
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
        if (arg1 != 98) {
            this.method1251(-59, (byte) -77);
        }
        return var3;
    }
}
