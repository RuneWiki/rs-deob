import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class306 {

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Z")
    public boolean field4143 = true;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    private int field4145 = -1;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    private int field4150;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Lhd;")
    private class17 field4149;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    private int field4142;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "Ldm;")
    private class110 field4141;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    private int field4148;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Lui;")
    private class366 field4144;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Loe;")
    private class231 field4147;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "[B")
    private static byte[] field4146 = new byte[16384];

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lui;ZI)V", line = 8)
    public final void method1973(class366 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field4143 = true;
        }
        if (arg2 != 0) {
            this.method1974((byte) 58);
            this.field4149.method207(this.field4147);
            this.field4149.method112(arg0, 4, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 25)
    private final void method1974(byte arg0) {
        if (!this.field4143) {
            return;
        }
        this.field4143 = false;
        byte[] var2 = this.field4141.field1589;
        byte[] var3 = field4146;
        int var4 = 0;
        int var5 = this.field4141.field1595;
        int var6 = this.field4141.field1595 * this.field4150 + this.field4142;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field4147 != null && this.field4145 == var4) {
            this.field4143 = false;
            return;
        }
        this.field4145 = var4;
        int var9 = -44 / ((arg0 + 29) / 48);
        int var10 = this.field4150 * var5 + this.field4142;
        int var11 = 0;
        for (int var12 = -128; var12 < 0; var12++) {
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var10] == 0) {
                    int var14 = 0;
                    if (var2[var10 - 1] != 0) {
                        var14++;
                    }
                    if (var2[var10 + 1] != 0) {
                        var14++;
                    }
                    if (var2[var10 - var5] != 0) {
                        var14++;
                    }
                    if (var2[var5 + var10] != 0) {
                        var14++;
                    }
                    var3[var11++] = (byte) (var14 * 17);
                } else {
                    var3[var11++] = 68;
                }
                var10++;
            }
            var10 += this.field4141.field1595 - 128;
        }
        if (this.field4147 == null) {
            this.field4147 = new class231(this.field4149, 3553, 6406, 128, 128, false, field4146, 6406, false);
            this.field4147.method1543(false, false);
            this.field4147.method17(true);
        } else {
            this.field4147.method1544(0, 0, 128, 128, field4146, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lhd;Ldm;Lag;IIIII)V", line = 150)
    public class306(class17 arg0, class110 arg1, class302 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4150 = arg7;
        this.field4149 = arg0;
        this.field4142 = arg6;
        this.field4141 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field5745 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field4067[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field4148 = var10;
        if (var10 > 0) {
            class289 var17 = new class289(var10 * 2);
            if (this.field4149.field292) {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field5745 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field4067[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method1877(true, var21[var22]);
                            }
                        }
                    }
                }
            } else {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field5745 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field4067[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method1842(-4, var26[var27]);
                            }
                        }
                    }
                }
            }
            this.field4144 = this.field4149.method128(5123, var17.field3882, var17.field3938, false);
        } else {
            this.field4147 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 137)
    public final void method1975(int arg0) {
        this.method1973(this.field4144, true, this.field4148);
        int var2 = -110 / ((arg0 - 3) / 45);
    }
}
