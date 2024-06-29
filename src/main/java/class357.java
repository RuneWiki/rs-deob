import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class357 {

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Z")
    public boolean field5562 = true;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    private int field5565 = -1;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lih;")
    private class214 field5555;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lqj;")
    private class391 field5556;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    private int field5563;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    private int field5553;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    private int field5558;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lah;")
    private class187 field5554;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Loi;")
    private class43 field5566;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lac;")
    private class498 field5557;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lln;")
    public static class169 field5561;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBIII)I")
    public static final int method2288(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field5567++;
        int var5 = 65536 - class46.field755[arg2 * 8192 / arg0] >> 1;
        int var6 = 14 / ((36 - arg1) / 46);
        return ((65536 - var5) * arg4 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Loi;IZ)V")
    private final void method2289(class43 arg0, int arg1, boolean arg2) {
        field5569++;
        if (arg1 != 0) {
            this.method2292(!arg2);
            this.field5555.method1471(arg2, this.field5554);
            this.field5555.method1407(arg1, (byte) -108, 4, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZII[B)V")
    public final void method2290(boolean arg0, int arg1, int arg2, byte[] arg3) {
        this.field5557.method314(arg2, 107, arg3, this.field5555.method1462((byte) 91, arg2) * arg1);
        field5559++;
        this.method2289(this.field5557, arg1, arg0);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II[III)V")
    public static final void method2291(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field5568++;
        if (arg4 != -1) {
            method2291(-126, 8, null, -103, -90);
        }
        arg0--;
        int var13 = arg3 - 1;
        int var5 = var13 - 7;
        while (var5 > arg0) {
            int var6 = arg0 + 1;
            arg2[var6] = arg1;
            int var7 = var6 + 1;
            arg2[var7] = arg1;
            int var8 = var7 + 1;
            arg2[var8] = arg1;
            int var9 = var8 + 1;
            arg2[var9] = arg1;
            int var10 = var9 + 1;
            arg2[var10] = arg1;
            int var11 = var10 + 1;
            arg2[var11] = arg1;
            int var12 = var11 + 1;
            arg2[var12] = arg1;
            arg0 = var12 + 1;
            arg2[arg0] = arg1;
        }
        while (var13 > arg0) {
            arg0++;
            arg2[arg0] = arg1;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    private final void method2292(boolean arg0) {
        field5560++;
        if (!this.field5562) {
            return;
        }
        this.field5562 = arg0;
        byte[] var2 = this.field5556.field5986;
        byte[] var3 = this.field5555.field3744;
        int var4 = 0;
        int var5 = this.field5556.field5994;
        int var6 = this.field5553 + (this.field5556.field5994 * this.field5563);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field5554 != null && this.field5565 == var4) {
            this.field5562 = false;
            return;
        }
        this.field5565 = var4;
        int var8 = 0;
        int var9 = this.field5563 * var5 + this.field5553;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var9 + var5] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field5556.field5994 - 128;
        }
        if (this.field5554 == null) {
            this.field5554 = new class187(this.field5555, 3553, 6406, 128, 128, false, this.field5555.field3744, 6406, false);
            this.field5554.method1262(-1, false, false);
            this.field5554.method1208(true, -101);
        } else {
            this.field5554.method1268(128, (byte) 125, false, 0, this.field5555.field3744, 128, 6406, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method2293(byte arg0) {
        if (arg0 > -126) {
            method2288(26, (byte) 42, 91, 12, -64);
        }
        field5561 = null;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lih;Lqj;Lgk;IIIII)V")
    public class357(class214 arg0, class391 arg1, class412 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field5555 = arg0;
        this.field5556 = arg1;
        this.field5563 = arg7;
        this.field5553 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field3801 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field6243[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field5558 = var10;
        if (var10 <= 0) {
            this.field5554 = null;
        } else {
            class23 var14 = new class23(var10 * 2);
            if (this.field5555.field3708) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field3801 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field6243[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method182(var23[var24] & 0xFFFF, 65);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field3801 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field6243[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method154(var18[var19] & 0xFFFF, -857932536);
                            }
                        }
                    }
                }
            }
            this.field5566 = this.field5555.method1480(var14.field302, false, 5123, 71, var14.field301);
            this.field5557 = new class498(this.field5555, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public final void method2294(int arg0) {
        field5564++;
        if (arg0 != 26236) {
            this.field5555 = null;
        }
        this.method2289(this.field5566, this.field5558, true);
    }
}
