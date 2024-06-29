import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class333 {

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Z")
    public boolean field4564 = true;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    private int field4569 = -1;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    private int field4565;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Lc;")
    private class461 field4563;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Lqi;")
    private class458 field4566;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    private int field4568;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    private int field4562;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Lai;")
    private class201 field4561;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Lhm;")
    private class28 field4571;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Lkb;")
    private class57 field4567;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "[B")
    private static byte[] field4570 = new byte[16384];

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILhm;I)V")
    private final void method1980(int arg0, class28 arg1, int arg2) {
        if (arg0 != arg2) {
            this.method1981((byte) -29);
            this.field4566.method2692(this.field4561);
            this.field4566.method2673(arg1, 4, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    private final void method1981(byte arg0) {
        if (!this.field4564) {
            return;
        }
        if (arg0 != -29) {
            this.method1983((byte[]) null, -27, (byte) -86, -88);
        }
        this.field4564 = false;
        byte[] var2 = this.field4563.field6494;
        byte[] var3 = field4570;
        int var4 = 0;
        int var5 = this.field4563.field6492;
        int var6 = this.field4565 + (this.field4563.field6492 * this.field4568);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field4561 != null && this.field4569 == var4) {
            this.field4564 = false;
            return;
        }
        this.field4569 = var4;
        int var9 = 0;
        int var10 = this.field4568 * var5 + this.field4565;
        for (int var11 = -128; var11 < 0; var11++) {
            for (int var12 = -128; var12 < 0; var12++) {
                if (var2[var10] == 0) {
                    int var13 = 0;
                    if (var2[var10 - 1] != 0) {
                        var13++;
                    }
                    if (var2[var10 + 1] != 0) {
                        var13++;
                    }
                    if (var2[var10 - var5] != 0) {
                        var13++;
                    }
                    if (var2[var5 + var10] != 0) {
                        var13++;
                    }
                    var3[var9++] = (byte) (var13 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var10++;
            }
            var10 += this.field4563.field6492 - 128;
        }
        if (this.field4561 == null) {
            this.field4561 = new class201(this.field4566, 3553, 6406, 128, 128, false, field4570, 6406, false);
            this.field4561.method1279(false, false);
            this.field4561.method1168(true);
        } else {
            this.field4561.method1277(0, 0, 128, 128, field4570, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public final void method1982(int arg0) {
        this.method1980(0, this.field4571, this.field4562);
        if (arg0 != -12850) {
            this.method1980(-11, (class28) null, -79);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([BIBI)V")
    public final void method1983(byte[] arg0, int arg1, byte arg2, int arg3) {
        this.field4567.method233(arg3, arg0, arg1 * this.field4566.method2656(arg3));
        if (arg2 <= 38) {
            this.method1983((byte[]) null, 103, (byte) 102, 41);
        }
        this.method1980(0, this.field4567, arg1);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lqi;Lc;Lch;IIIII)V")
    public class333(class458 arg0, class461 arg1, class223 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4565 = arg6;
        this.field4563 = arg1;
        this.field4566 = arg0;
        this.field4568 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field3729 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field3141[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field4562 = var10;
        if (var10 <= 0) {
            this.field4561 = null;
        } else {
            class425 var17 = new class425(var10 * 2);
            if (this.field4566.field6400) {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field3729 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field3141[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method2462(var21[var22] & 0xFFFF, (byte) -123);
                            }
                        }
                    }
                }
            } else {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field3729 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field3141[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method2506(var26[var27] & 0xFFFF, (byte) 82);
                            }
                        }
                    }
                }
            }
            this.field4571 = this.field4566.method2645(5123, var17.field5886, var17.field5830, false);
            this.field4567 = new class57(this.field4566, 5123, (byte[]) null, 1);
        }
    }
}
