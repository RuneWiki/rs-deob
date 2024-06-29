import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class432 {

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "Z")
    public boolean field6324 = true;

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "I")
    private int field6326 = -1;

    @OriginalMember(owner = "client!vaa", name = "i", descriptor = "Lok;")
    private class228 field6328;

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "Lfda;")
    private class289 field6321;

    @OriginalMember(owner = "client!vaa", name = "j", descriptor = "I")
    private int field6329;

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
    private int field6325;

    @OriginalMember(owner = "client!vaa", name = "o", descriptor = "I")
    private int field6334;

    @OriginalMember(owner = "client!vaa", name = "m", descriptor = "Lwn;")
    private class673 field6332;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "Lvu;")
    private class306 field6320;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "Ljca;")
    private class636 field6323;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "F")
    public static float field6322;

    @OriginalMember(owner = "client!vaa", name = "h", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!vaa", name = "k", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!vaa", name = "l", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!vaa", name = "n", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(III[B)V", line = 4)
    public final void method2574(int arg0, int arg1, int arg2, byte[] arg3) {
        field6333++;
        this.field6323.method1948(arg1 * this.field6328.method1553(arg2, 19), arg3, (byte) -54, arg2);
        this.method2576(this.field6323, arg1, 27247);
        if (arg0 >= -83) {
            this.method2574(91, 69, 121, null);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)V", line = 20)
    public final void method2575(boolean arg0) {
        if (!arg0) {
            field6322 = -1.4619077F;
        }
        this.method2576(this.field6320, this.field6334, 27247);
        field6330++;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lvu;II)V", line = 31)
    private final void method2576(class306 arg0, int arg1, int arg2) {
        field6327++;
        if (arg1 == 0) {
            return;
        }
        this.method2577(arg2 ^ 0x4F6);
        this.field6328.method1505(-2, this.field6332);
        this.field6328.method1522((byte) 31, 0, 4, arg0, arg1);
        if (arg2 != 27247) {
            this.field6332 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V", line = 50)
    private final void method2577(int arg0) {
        field6331++;
        if (!this.field6324) {
            return;
        }
        this.field6324 = false;
        byte[] var2 = this.field6321.field4291;
        byte[] var3 = this.field6328.field3553;
        int var4 = 0;
        int var5 = this.field6321.field4297;
        int var6 = this.field6325 + (this.field6321.field4297 * this.field6329);
        if (arg0 != 28313) {
            return;
        }
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field6332 != null && this.field6326 == var4) {
            this.field6324 = false;
            return;
        }
        this.field6326 = var4;
        int var8 = this.field6329 * var5 + this.field6325;
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var8 + var5] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field6321.field4297 - 128;
        }
        if (this.field6332 == null) {
            this.field6332 = new class673(this.field6328, 3553, 6406, 128, 128, false, this.field6328.field3553, 6406, false);
            this.field6332.method3736(-117, false, false);
            this.field6332.method3617((byte) 41, true);
        } else {
            this.field6332.method3732(this.field6328.field3553, -6577, 128, 0, 0, false, 0, 0, 6406, 128);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lok;Lfda;Lvfa;IIIII)V", line = 170)
    public class432(class228 arg0, class289 arg1, class623 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6328 = arg0;
        this.field6321 = arg1;
        this.field6329 = arg7;
        this.field6325 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field631 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field8710[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field6334 = var10;
        if (var10 <= 0) {
            this.field6332 = null;
        } else {
            class695 var14 = new class695(var10 * 2);
            if (this.field6328.field3514) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field631 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field8710[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method3852(false, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field631 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field8710[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method3843(var18[var19] & 0xFFFF, true);
                            }
                        }
                    }
                }
            }
            this.field6320 = this.field6328.method1526(false, var14.field9796, 5123, false, var14.field9761);
            this.field6323 = new class636(this.field6328, 5123, null, 1);
        }
    }
}
