import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class50 {

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Z")
    public boolean field657 = true;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    private int field656 = -1;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    private int field660;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Lic;")
    private class454 field663;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lbf;")
    private class344 field662;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    private int field664;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    private int field665;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lal;")
    private class58 field659;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lfd;")
    private class337 field658;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lve;")
    private class319 field661;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "[B")
    private static byte[] field666 = new byte[16384];

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lbf;Lic;Lah;IIIII)V", line = 164)
    public class50(class344 arg0, class454 arg1, class238 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field660 = arg6;
        this.field663 = arg1;
        this.field662 = arg0;
        this.field664 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field2410 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field3130[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field665 = var10;
        if (var10 <= 0) {
            this.field659 = null;
        } else {
            class32 var17 = new class32(var10 * 2);
            if (this.field662.field4721) {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field2410 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field3130[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method229(var21[var22] & 0xFFFF, 1309449544);
                            }
                        }
                    }
                }
            } else {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field2410 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field3130[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method231(85, var26[var27] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field658 = this.field662.method2078(5123, var17.field472, var17.field456, false);
            this.field661 = new class319(this.field662, 5123, (byte[]) null, 1);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 10)
    public final void method351(byte arg0) {
        if (arg0 >= -73) {
            this.field659 = (class58) null;
        }
        this.method352(1, this.field658, this.field665);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILfd;I)V", line = 32)
    private final void method352(int arg0, class337 arg1, int arg2) {
        if (arg2 == 0) {
            return;
        }
        this.method354(-1);
        this.field662.method2106(this.field659);
        if (arg0 != 1) {
            this.field661 = (class319) null;
        }
        this.field662.method2033(arg1, 4, 0, arg2);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BIII)V", line = 48)
    public final void method353(byte[] arg0, int arg1, int arg2, int arg3) {
        this.field661.method127(arg1, arg0, this.field662.method2008(arg1) * arg3);
        if (arg2 != 5586) {
            this.method351((byte) 26);
        }
        this.method352(arg2 - 5585, this.field661, arg3);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 59)
    private final void method354(int arg0) {
        if (!this.field657) {
            return;
        }
        this.field657 = false;
        byte[] var2 = this.field663.field6157;
        byte[] var3 = field666;
        int var4 = 0;
        int var5 = this.field663.field6164;
        int var6 = this.field660 + (this.field663.field6164 * this.field664);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field659 != null && this.field656 == var4) {
            this.field657 = false;
        } else if (arg0 == -1) {
            this.field656 = var4;
            int var9 = this.field664 * var5 + this.field660;
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
                        if (var2[var9 + var5] != 0) {
                            var13++;
                        }
                        var3[var10++] = (byte) (var13 * 17);
                    } else {
                        var3[var10++] = 68;
                    }
                    var9++;
                }
                var9 += this.field663.field6164 - 128;
            }
            if (this.field659 == null) {
                this.field659 = new class58(this.field662, 3553, 6406, 128, 128, false, field666, 6406, false);
                this.field659.method415(false, false);
                this.field659.method2370(true);
            } else {
                this.field659.method412(0, 0, 128, 128, field666, 6406, 0, 0, false);
            }
        }
    }
}
