import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class155 {

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Z")
    public boolean field2299 = true;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    private int field2302 = -1;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lmi;")
    private class315 field2300;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    private int field2301;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    private int field2307;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lrr;")
    private class223 field2304;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    private int field2305;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Lkh;")
    private class13 field2306;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Lhs;")
    private class196 field2298;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lig;")
    private class147 field2297;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "[B")
    private static byte[] field2303 = new byte[16384];

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public final void method970(int arg0) {
        this.method971(-116, this.field2298, this.field2305);
        int var2 = 50 % ((arg0 - 61) / 63);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILhs;I)V")
    private final void method971(int arg0, class196 arg1, int arg2) {
        if (arg0 >= -79) {
            this.method970(-103);
        }
        if (arg2 != 0) {
            this.method972(true);
            this.field2300.method1967(this.field2306);
            this.field2300.method1998(arg1, 4, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    private final void method972(boolean arg0) {
        if (!this.field2299) {
            return;
        }
        this.field2299 = false;
        byte[] var2 = this.field2304.field3384;
        byte[] var3 = field2303;
        int var4 = 0;
        int var5 = this.field2304.field3387;
        int var6 = this.field2304.field3387 * this.field2307 + this.field2301;
        if (!arg0) {
            return;
        }
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field2306 != null && this.field2302 == var4) {
            this.field2299 = false;
            return;
        }
        this.field2302 = var4;
        int var9 = this.field2301 + (this.field2307 * var5);
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
            var9 += this.field2304.field3387 - 128;
        }
        if (this.field2306 == null) {
            this.field2306 = new class13(this.field2300, 3553, 6406, 128, 128, false, field2303, 6406, false);
            this.field2306.method93(false, false);
            this.field2306.method2501(true);
        } else {
            this.field2306.method96(0, 0, 128, 128, field2303, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III[B)V")
    public final void method973(int arg0, int arg1, int arg2, byte[] arg3) {
        this.field2297.method930(arg2, arg3, this.field2300.method1999(arg2) * arg0);
        if (arg1 == 0) {
            this.method971(arg1 - 101, this.field2297, arg0);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lmi;Lrr;Lag;IIIII)V")
    public class155(class315 arg0, class223 arg1, class445 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field2300 = arg0;
        this.field2301 = arg6;
        this.field2307 = arg7;
        this.field2304 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field5967 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field6150[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field2305 = var10;
        if (var10 <= 0) {
            this.field2306 = null;
        } else {
            class276 var17 = new class276(var10 * 2);
            if (this.field2300.field4514) {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field5967 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field6150[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method1711(false, var21[var22] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field5967 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field6150[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method1691(var26[var27] & 0xFFFF, (byte) -116);
                            }
                        }
                    }
                }
            }
            this.field2298 = this.field2300.method1990(5123, var17.field4064, var17.field4021, false);
            this.field2297 = new class147(this.field2300, 5123, (byte[]) null, 1);
        }
    }
}
