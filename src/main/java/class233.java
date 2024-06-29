import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class233 {

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    private int field3899 = -1;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Z")
    public boolean field3898 = true;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "Lsq;")
    private class96 field3897;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    private int field3900;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    private int field3894;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Llb;")
    private class320 field3895;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    private int field3901;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Lmq;")
    private class295 field3892;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Lso;")
    private class274 field3893;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "Lai;")
    private class355 field3896;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "[B")
    private static byte[] field3891 = new byte[16384];

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 10)
    public final void method1651(int arg0) {
        if (arg0 > 48) {
            this.method1652(this.field3892, this.field3901, -29);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lmq;II)V", line = 24)
    private final void method1652(class295 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            return;
        }
        this.method1654(true);
        if (arg2 > -14) {
            field3891 = (byte[]) null;
        }
        this.field3897.method688(this.field3896);
        this.field3897.method646(arg0, 4, 0, arg1);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([BIII)V", line = 40)
    public final void method1653(byte[] arg0, int arg1, int arg2, int arg3) {
        this.field3893.method1696(arg1, arg0, arg3 * this.field3897.method649(arg1));
        this.method1652(this.field3893, arg3, arg2 ^ 0x6A5A);
        if (arg2 != -27199) {
            this.field3901 = -15;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V", line = 51)
    private final void method1654(boolean arg0) {
        if (!arg0) {
            this.method1651(127);
        }
        if (!this.field3898) {
            return;
        }
        this.field3898 = false;
        byte[] var2 = this.field3895.field4994;
        byte[] var3 = field3891;
        int var4 = 0;
        int var5 = this.field3895.field4993;
        int var6 = this.field3895.field4993 * this.field3894 + this.field3900;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field3896 != null && this.field3899 == var4) {
            this.field3898 = false;
            return;
        }
        this.field3899 = var4;
        int var9 = this.field3894 * var5 + this.field3900;
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
            var9 += this.field3895.field4993 - 128;
        }
        if (this.field3896 == null) {
            this.field3896 = new class355(this.field3897, 3553, 6406, 128, 128, false, field3891, 6406, false);
            this.field3896.method2309(false, false);
            this.field3896.method1980(true);
        } else {
            this.field3896.method2312(0, 0, 128, 128, field3891, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lsq;Llb;Lkg;IIIII)V", line = 166)
    public class233(class96 arg0, class320 arg1, class147 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3897 = arg0;
        this.field3900 = arg6;
        this.field3894 = arg7;
        this.field3895 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field2036 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field2292[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field3901 = var10;
        if (var10 > 0) {
            class186 var17 = new class186(var10 * 2);
            if (this.field3897.field1280) {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field2036 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field2292[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method1283(8, var21[var22] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field2036 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field2292[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method1319(124, var26[var27] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field3892 = this.field3897.method653(5123, var17.field3066, var17.field3044, false);
            this.field3893 = new class274(this.field3897, 5123, (byte[]) null, 1);
        } else {
            this.field3896 = null;
        }
    }
}
