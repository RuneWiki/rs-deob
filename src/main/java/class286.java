import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class286 {

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    private int field4302 = -1;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "Z")
    public boolean field4300 = true;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    private int field4307;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    private int field4304;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "Lam;")
    private class76 field4306;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "Lse;")
    private class282 field4299;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    private int field4305;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "Loa;")
    private class121 field4303;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "Lrd;")
    private class323 field4301;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "[B")
    private static byte[] field4298 = new byte[16384];

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILrd;I)V", line = 4)
    public final void method1944(int arg0, class323 arg1, int arg2) {
        if (arg0 == 0) {
            return;
        }
        if (arg2 != 1004) {
            this.method1945(true);
        }
        this.method1946(128);
        this.field4299.method1915(this.field4303);
        this.field4299.method1891(arg1, 4, 0, arg0);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V", line = 19)
    public final void method1945(boolean arg0) {
        this.method1944(this.field4305, this.field4301, 1004);
        if (!arg0) {
            this.method1944(-75, (class323) null, 11);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 30)
    private final void method1946(int arg0) {
        if (!this.field4300) {
            return;
        }
        this.field4300 = false;
        byte[] var2 = this.field4306.field1052;
        byte[] var3 = field4298;
        int var4 = 0;
        if (arg0 != 128) {
            return;
        }
        int var5 = this.field4306.field1048;
        int var6 = this.field4306.field1048 * this.field4304 + this.field4307;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field4303 != null && this.field4302 == var4) {
            this.field4300 = false;
            return;
        }
        this.field4302 = var4;
        int var9 = this.field4304 * var5 + this.field4307;
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
            var9 += this.field4306.field1048 - 128;
        }
        if (this.field4303 == null) {
            this.field4303 = new class121(this.field4299, 3553, 6406, 128, 128, false, field4298, 6406, false);
            this.field4303.method872(false, false);
            this.field4303.method2277(true);
        } else {
            this.field4303.method869(0, 0, 128, 128, field4298, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lse;Lam;Lsb;IIIII)V", line = 154)
    public class286(class282 arg0, class76 arg1, class153 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4307 = arg6;
        this.field4304 = arg7;
        this.field4306 = arg1;
        this.field4299 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field2681 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field1931[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field4305 = var10;
        if (var10 <= 0) {
            this.field4303 = null;
        } else {
            class341 var17 = new class341(var10 * 2);
            if (this.field4299.field4232) {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field2681 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field1931[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method2250(false, var21[var22]);
                            }
                        }
                    }
                }
            } else {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field2681 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field1931[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method2206(64, var26[var27]);
                            }
                        }
                    }
                }
            }
            this.field4301 = this.field4299.method1882(5123, var17.field5042, var17.field5049, false);
        }
    }
}
