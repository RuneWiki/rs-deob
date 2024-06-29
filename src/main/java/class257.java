import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class257 {

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "Z")
    public boolean field3504 = true;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    private int field3512 = -1;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    private int field3511;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    private int field3503;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Llj;")
    private class565 field3498;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Llg;")
    private class378 field3505;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    private int field3500;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "Lcw;")
    private class164 field3507;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Lii;")
    private class514 field3502;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "Ler;")
    private class92 field3501;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field3508 = 104;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)I", line = 5)
    public static final int method1577(int arg0, int arg1, int arg2) {
        field3510++;
        return arg1 == arg2 || arg1 == 3 ? class286.field3944[arg0 & 0x3] : class36.field429[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZLii;)V", line = 17)
    private final void method1578(int arg0, boolean arg1, class514 arg2) {
        field3506++;
        if (arg0 == 0) {
            return;
        }
        this.method1580(0);
        this.field3498.method3206(this.field3507, (byte) 26);
        this.field3498.method3235(arg0, 0, arg2, false, 4);
        if (!arg1) {
            this.field3501 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([BIIZ)V", line = 40)
    public final void method1579(byte[] arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.method1578(-36, true, null);
        }
        this.field3501.method670(arg2 * this.field3498.method3165(arg1, 5123), -117, arg1, arg0);
        field3509++;
        this.method1578(arg2, arg3, this.field3501);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 58)
    private final void method1580(int arg0) {
        field3497++;
        if (!this.field3504) {
            return;
        }
        this.field3504 = false;
        byte[] var2 = this.field3505.field5056;
        byte[] var3 = this.field3498.field7985;
        int var4 = arg0;
        int var5 = this.field3505.field5046;
        int var6 = this.field3505.field5046 * this.field3503 + this.field3511;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field3507 != null && this.field3512 == var4) {
            this.field3504 = false;
            return;
        }
        this.field3512 = var4;
        int var8 = 0;
        int var9 = this.field3511 + (this.field3503 * var5);
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
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field3505.field5046 - 128;
        }
        if (this.field3507 == null) {
            this.field3507 = new class164(this.field3498, 3553, 6406, 128, 128, false, this.field3498.field7985, 6406, false);
            this.field3507.method1151(false, 42, false);
            this.field3507.method944((byte) -111, true);
        } else {
            this.field3507.method1146(6406, 0, false, 0, 0, 0, 128, (byte) 118, this.field3498.field7985, 128);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 167)
    public final void method1581(byte arg0) {
        this.method1578(this.field3500, true, this.field3502);
        field3499++;
        if (arg0 > -100) {
            this.field3498 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Llj;Llg;Lhca;IIIII)V", line = 188)
    public class257(class565 arg0, class378 arg1, class453 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3511 = arg6;
        this.field3503 = arg7;
        this.field3498 = arg0;
        this.field3505 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field446 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field6250[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field3500 = var10;
        if (var10 <= 0) {
            this.field3507 = null;
        } else {
            class501 var14 = new class501(var10 * 2);
            if (this.field3498.field7921) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field446 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field6250[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2837(var18[var19] & 0xFFFF, -2);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field446 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field6250[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2848((byte) -120, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field3502 = this.field3498.method3179(var14.field6855, 5123, var14.field6892, 2, false);
            this.field3501 = new class92(this.field3498, 5123, null, 1);
        }
    }
}
