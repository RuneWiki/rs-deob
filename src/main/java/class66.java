import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class66 {

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "Z")
    public boolean field910 = true;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    private int field908 = -1;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "Lnm;")
    private class254 field909;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    private int field913;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "Lmk;")
    private class354 field906;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    private int field903;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    private int field904;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Lhi;")
    private class41 field905;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "Lgs;")
    private class407 field912;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "Lbb;")
    private class289 field911;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "[B")
    private static byte[] field907 = new byte[16384];

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    private final void method596(int arg0) {
        if (!this.field910) {
            return;
        }
        this.field910 = false;
        if (arg0 != -30720) {
            this.method599(35);
        }
        byte[] var2 = this.field906.field5376;
        byte[] var3 = field907;
        int var4 = 0;
        int var5 = this.field906.field5379;
        int var6 = this.field913 + (this.field906.field5379 * this.field903);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field905 != null && this.field908 == var4) {
            this.field910 = false;
            return;
        }
        this.field908 = var4;
        int var9 = this.field913 + (this.field903 * var5);
        int var10 = 0;
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
                    if (var2[var5 + var9] != 0) {
                        var13++;
                    }
                    var3[var10++] = (byte) (var13 * 17);
                } else {
                    var3[var10++] = 68;
                }
                var9++;
            }
            var9 += this.field906.field5379 - 128;
        }
        if (this.field905 == null) {
            this.field905 = new class41(this.field909, 3553, 6406, 128, 128, false, field907, 6406, false);
            this.field905.method312(false, false);
            this.field905.method228(true);
        } else {
            this.field905.method310(0, 0, 128, 128, field907, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lgs;IB)V")
    private final void method597(class407 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            return;
        }
        this.method596(-30720);
        this.field909.method1653(this.field905);
        this.field909.method1664(arg0, 4, 0, arg1);
        if (arg2 != -49) {
            this.field913 = -43;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II[BZ)V")
    public final void method598(int arg0, int arg1, byte[] arg2, boolean arg3) {
        this.field911.method1528(arg0, arg2, this.field909.method1642(arg0) * arg1);
        this.method597(this.field911, arg1, (byte) -49);
        if (arg3) {
            this.method598(-1, -100, (byte[]) null, true);
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
    public final void method599(int arg0) {
        if (arg0 > -121) {
            this.method599(-95);
        }
        this.method597(this.field912, this.field904, (byte) -49);
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lnm;Lmk;Llg;IIIII)V")
    public class66(class254 arg0, class354 arg1, class22 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field909 = arg0;
        this.field913 = arg6;
        this.field906 = arg1;
        this.field903 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field686 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field283[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field904 = var10;
        if (var10 <= 0) {
            this.field905 = null;
        } else {
            class446 var17 = new class446(var10 * 2);
            if (this.field909.field3742) {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field686 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field283[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method2592(var21[var22] & 0xFFFF, (byte) -103);
                            }
                        }
                    }
                }
            } else {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field686 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field283[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method2623(var26[var27] & 0xFFFF, (byte) -59);
                            }
                        }
                    }
                }
            }
            this.field912 = this.field909.method1670(5123, var17.field6316, var17.field6315, false);
            this.field911 = new class289(this.field909, 5123, (byte[]) null, 1);
        }
    }
}
