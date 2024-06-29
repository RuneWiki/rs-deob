import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class181 {

    @OriginalMember(owner = "client!in", name = "c", descriptor = "Z")
    public boolean field2425 = true;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    private int field2427 = -1;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "Lup;")
    private class441 field2430;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "Lih;")
    private class330 field2426;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    private int field2431;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    private int field2424;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    private int field2428;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "Leq;")
    private class140 field2432;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "Lir;")
    private class217 field2429;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "[B")
    private static byte[] field2423 = new byte[16384];

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V", line = 4)
    private final void method1123(int arg0) {
        if (!this.field2425) {
            return;
        }
        this.field2425 = false;
        byte[] var2 = this.field2430.field6445;
        byte[] var3 = field2423;
        int var4 = 0;
        int var5 = this.field2430.field6450;
        int var6 = this.field2430.field6450 * this.field2424 + this.field2431;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field2432 != null && this.field2427 == var4) {
            this.field2425 = false;
            return;
        }
        this.field2427 = var4;
        int var9 = this.field2424 * var5 + this.field2431;
        int var10 = arg0;
        for (int var11 = -128; var11 < 0; var11++) {
            for (int var12 = -128; var12 < 0; var12++) {
                if (var2[var9] == 0) {
                    int var13 = 0;
                    if (var2[var9 - 1] != 0) {
                        var13++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var13++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var13++;
                    }
                    if (var2[var9 + var5] != 0) {
                        var13++;
                    }
                    var3[var10++] = (byte) (var13 * 17);
                } else {
                    var3[var10++] = 68;
                }
                var9++;
            }
            var9 += this.field2430.field6450 - 128;
        }
        if (this.field2432 == null) {
            this.field2432 = new class140(this.field2426, 3553, 6406, 128, 128, false, field2423, 6406, false);
            this.field2432.method944(false, false);
            this.field2432.method1390(true);
        } else {
            this.field2432.method941(0, 0, 128, 128, field2423, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lih;Lup;Lms;IIIII)V", line = 150)
    public class181(class330 arg0, class441 arg1, class448 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field2430 = arg1;
        this.field2426 = arg0;
        this.field2431 = arg6;
        this.field2424 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field4978 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field6542[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field2428 = var10;
        if (var10 <= 0) {
            this.field2432 = null;
        } else {
            class265 var17 = new class265(var10 * 2);
            if (this.field2426.field4797) {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field4978 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field6542[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method1693(var26[var27], (byte) 82);
                            }
                        }
                    }
                }
            } else {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field4978 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field6542[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method1715(677910600, var21[var22]);
                            }
                        }
                    }
                }
            }
            this.field2429 = this.field2426.method2049(5123, var17.field3879, var17.field3915, false);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V", line = 115)
    public final void method1124(boolean arg0) {
        this.method1125(this.field2428, (byte) -73, this.field2429);
        if (!arg0) {
            this.field2426 = (class330) null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IBLir;)V", line = 125)
    public final void method1125(int arg0, byte arg1, class217 arg2) {
        if (arg0 != 0) {
            this.method1123(0);
            int var4 = -107 % ((-arg1) / 46);
            this.field2426.method2186(this.field2432);
            this.field2426.method2100(arg2, 4, 0, arg0);
        }
    }
}
