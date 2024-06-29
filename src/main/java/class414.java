import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class414 {

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    private int field6222 = -1;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Z")
    public boolean field6228 = true;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    private int field6220;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "Lwha;")
    private class283 field6229;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    private int field6224;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lwh;")
    private class148 field6219;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    private int field6221;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Law;")
    private class76 field6215;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lgh;")
    private class550 field6218;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Lck;")
    private class644 field6226;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBLgh;)V")
    private final void method2622(int arg0, byte arg1, class550 arg2) {
        field6227++;
        if (arg0 == 0) {
            return;
        }
        this.method2626(-128);
        this.field6219.method1088(this.field6215, arg1 - 27763);
        this.field6219.method1064(false, 4, arg2, 0, arg0);
        if (arg1 != 14) {
            this.method2622(-2, (byte) 109, null);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BII[B)V")
    public final void method2623(byte arg0, int arg1, int arg2, byte[] arg3) {
        field6217++;
        this.field6226.method3212(this.field6219.method1057(arg1, (byte) 115) * arg2, arg3, 106, arg1);
        this.method2622(arg2, (byte) 14, this.field6226);
        if (arg0 != 91) {
            this.field6228 = false;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static final void method2624(int arg0) {
        field6216++;
        if (arg0 == 1 && !class749.field10477) {
            class749.field10477 = true;
            class504.field7168 = true;
            class32.field330 += (24.0F - class32.field330) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
    public final void method2625(boolean arg0) {
        if (arg0) {
            this.method2622(this.field6221, (byte) 14, this.field6218);
            field6225++;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    private final void method2626(int arg0) {
        field6223++;
        if (!this.field6228) {
            return;
        }
        this.field6228 = false;
        byte[] var2 = this.field6229.field4020;
        byte[] var3 = this.field6219.field2318;
        int var4 = 0;
        int var5 = this.field6229.field4015;
        int var6 = this.field6229.field4015 * this.field6224 + this.field6220;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field6215 != null && this.field6222 == var4) {
            this.field6228 = false;
            return;
        }
        this.field6222 = var4;
        int var8 = this.field6224 * var5 + this.field6220;
        int var9 = 0;
        for (int var10 = arg0; var10 < 0; var10++) {
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
            var8 += this.field6229.field4015 - 128;
        }
        if (this.field6215 == null) {
            this.field6215 = new class76(this.field6219, 3553, 6406, 128, 128, false, this.field6219.field2318, 6406, false);
            this.field6215.method636(false, 10497, false);
            this.field6215.method1362(true, arg0 + 1415);
        } else {
            this.field6215.method635(0, 128, this.field6219.field2318, 0, 128, 0, 6406, false, 0, 0);
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lwh;Lwha;Lmh;IIIII)V")
    public class414(class148 arg0, class283 arg1, class634 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6220 = arg6;
        this.field6229 = arg1;
        this.field6224 = arg7;
        this.field6219 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field3963 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field8889[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field6221 = var10;
        if (var10 <= 0) {
            this.field6215 = null;
        } else {
            class645 var14 = new class645(var10 * 2);
            if (this.field6219.field2211) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field3963 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field8889[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method3702(var18[var19] & 0xFFFF, (byte) -124);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field3963 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field8889[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method3758(var23[var24] & 0xFFFF, 1394247496);
                            }
                        }
                    }
                }
            }
            this.field6218 = this.field6219.method1079(false, var14.field9068, var14.field9084, 5123, -57);
            this.field6226 = new class644(this.field6219, 5123, null, 1);
        }
    }
}
