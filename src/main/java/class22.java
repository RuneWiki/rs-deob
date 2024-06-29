import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class22 {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Z")
    public boolean field301 = true;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    private int field306 = -1;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Lpg;")
    private class293 field300;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Lcg;")
    private class393 field307;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lpq;")
    private class46 field305;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lio;")
    private class104 field302;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lsd;")
    private class237 field303;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[B")
    private static byte[] field304 = new byte[16384];

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    private final void method141(int arg0) {
        if (!this.field301) {
            return;
        }
        this.field301 = false;
        byte[] var2 = this.field300.field4455;
        byte[] var3 = field304;
        int var4 = 0;
        int var5 = this.field300.field4457;
        int var6 = this.field300.field4457 * this.field298 + this.field308;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (arg0 != 18082) {
            this.method144(21);
        }
        if (this.field305 != null && this.field306 == var4) {
            this.field301 = false;
            return;
        }
        this.field306 = var4;
        int var9 = this.field308 + (this.field298 * var5);
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
            var9 += this.field300.field4457 - 128;
        }
        if (this.field305 == null) {
            this.field305 = new class46(this.field307, 3553, 6406, 128, 128, false, field304, 6406, false);
            this.field305.method258(false, false);
            this.field305.method2001(true);
        } else {
            this.field305.method259(0, 0, 128, 128, field304, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lio;II)V")
    private final void method142(class104 arg0, int arg1, int arg2) {
        if (~arg2 != arg1) {
            this.method141(arg1 + 18083);
            this.field307.method2460(this.field305);
            this.field307.method2458(arg0, 4, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[BB)V")
    public final void method143(int arg0, int arg1, byte[] arg2, byte arg3) {
        if (arg3 <= 83) {
            this.method142((class104) null, -102, -85);
        }
        this.field303.method655(arg1, arg2, this.field307.method2485(arg1) * arg0);
        this.method142(this.field303, -1, arg0);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public final void method144(int arg0) {
        int var2 = 112 % ((-arg0 - 3) / 63);
        this.method142(this.field302, -1, this.field299);
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lcg;Lpg;Lpj;IIIII)V")
    public class22(class393 arg0, class293 arg1, class156 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field300 = arg1;
        this.field298 = arg7;
        this.field307 = arg0;
        this.field308 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field1906 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field2164[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field299 = var10;
        if (var10 <= 0) {
            this.field305 = null;
        } else {
            class385 var17 = new class385(var10 * 2);
            if (this.field307.field5879) {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field1906 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field2164[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method2377(var26[var27] & 0xFFFF, -46);
                            }
                        }
                    }
                }
            } else {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field1906 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field2164[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method2329(var21[var22] & 0xFFFF, -81);
                            }
                        }
                    }
                }
            }
            this.field302 = this.field307.method2470(5123, var17.field5685, var17.field5666, false);
            this.field303 = new class237(this.field307, 5123, (byte[]) null, 1);
        }
    }
}
