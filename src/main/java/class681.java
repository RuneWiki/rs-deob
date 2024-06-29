import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class681 {

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
    private int field9602 = -1;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "Z")
    public boolean field9596 = false;

    @OriginalMember(owner = "client!raa", name = "t", descriptor = "B")
    public byte field9615 = 0;

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "I")
    private int field9601 = 0;

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "I")
    private int field9614 = 0;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
    private int field9610 = 0;

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
    private int field9607 = 128;

    @OriginalMember(owner = "client!raa", name = "z", descriptor = "I")
    private int field9621 = 128;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "I")
    public int field9611 = -1;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    private int field9597;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public static int field9598;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
    public int field9599;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
    public static int field9603;

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "I")
    public static int field9606;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
    public static int field9608;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
    public static int field9612;

    @OriginalMember(owner = "client!raa", name = "v", descriptor = "I")
    public static int field9617;

    @OriginalMember(owner = "client!raa", name = "w", descriptor = "I")
    public static int field9618;

    @OriginalMember(owner = "client!raa", name = "y", descriptor = "I")
    public static int field9620;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "Lfg;")
    public static class174 field9605;

    @OriginalMember(owner = "client!raa", name = "u", descriptor = "Lqm;")
    public class380 field9616;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "[S")
    private short[] field9600;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "[S")
    private short[] field9609;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "[S")
    private short[] field9613;

    @OriginalMember(owner = "client!raa", name = "x", descriptor = "[S")
    private short[] field9619;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lr;ILoj;IIII)Lda;", line = 3)
    public final class473 method3778(class564 arg0, int arg1, class541 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 > -69) {
            this.method3784(null, -47);
        }
        field9603++;
        return this.method3783(null, null, arg3, 0, arg0, arg2, (byte) 5, 0, arg4, false, arg5, arg1, -64, 0);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lnp;IB)V", line = 15)
    private final void method3779(class115 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field9597 = arg0.method643((byte) -77);
        } else if (arg1 == 2) {
            this.field9611 = arg0.method643((byte) -77);
        } else if (arg1 == 4) {
            this.field9621 = arg0.method643((byte) -77);
        } else if (arg1 == 5) {
            this.field9607 = arg0.method643((byte) -77);
        } else if (arg1 == 6) {
            this.field9601 = arg0.method643((byte) -77);
        } else if (arg1 == 7) {
            this.field9614 = arg0.method620((byte) -126);
        } else if (arg1 == 8) {
            this.field9610 = arg0.method620((byte) -128);
        } else if (arg1 == 9) {
            this.field9615 = 3;
            this.field9602 = 8224;
        } else if (arg1 == 10) {
            this.field9596 = true;
        } else if (arg1 == 11) {
            this.field9615 = 1;
        } else if (arg1 == 12) {
            this.field9615 = 4;
        } else if (arg1 == 13) {
            this.field9615 = 5;
        } else if (arg1 == 14) {
            this.field9615 = 2;
            this.field9602 = arg0.method620((byte) 110) * 256;
        } else if (arg1 == 15) {
            this.field9615 = 3;
            this.field9602 = arg0.method643((byte) -77);
        } else if (arg1 == 16) {
            this.field9615 = 3;
            this.field9602 = arg0.method631(false);
        } else if (arg1 == 40) {
            int var6 = arg0.method620((byte) -126);
            this.field9609 = new short[var6];
            this.field9613 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field9609[var7] = (short) arg0.method643((byte) -77);
                this.field9613[var7] = (short) arg0.method643((byte) -77);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method620((byte) 22);
            this.field9619 = new short[var4];
            this.field9600 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field9619[var5] = (short) arg0.method643((byte) -77);
                this.field9600[var5] = (short) arg0.method643((byte) -77);
            }
        }
        int var8 = 43 / ((arg2 - 55) / 59);
        field9617++;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILoj;Lr;IIII)Lda;", line = 137)
    public final class473 method3780(int arg0, class541 arg1, class564 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 >= -108) {
            this.field9601 = 111;
        }
        field9608++;
        return this.method3783(null, null, arg6, 0, arg2, arg1, (byte) 2, 0, arg4, false, arg5, arg0, -64, 0);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)V", line = 155)
    public static void method3781(boolean arg0) {
        field9605 = null;
        if (arg0) {
            field9604 = -72;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IILr;Loj;BIILi;IILi;IZ)Lda;", line = 169)
    public final class473 method3782(int arg0, int arg1, class564 arg2, class541 arg3, byte arg4, int arg5, int arg6, class274 arg7, int arg8, int arg9, class274 arg10, int arg11, boolean arg12) {
        field9598++;
        return arg4 == 2 ? this.method3783(arg10, arg7, arg5, arg9, arg2, arg3, (byte) 2, arg0, arg8, arg12, arg1, arg11, -64, arg6) : null;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Li;Li;IILr;Loj;BIIZIIII)Lda;", line = 187)
    private final class473 method3783(class274 arg0, class274 arg1, int arg2, int arg3, class564 arg4, class541 arg5, byte arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        field9612++;
        int var15 = arg11;
        class257 var16 = this.field9611 == -1 || arg10 == -1 ? null : arg5.method3043(this.field9611, -8191);
        boolean var17 = arg9 & this.field9615 != 0;
        if (var16 != null) {
            var15 = arg11 | var16.method1523(arg10, arg12 ^ 0xFFFFFF87, arg8, false);
        }
        if (var17) {
            var15 |= this.field9615 == 3 ? 7 : 2;
        }
        if (this.field9607 != 128) {
            var15 |= 0x2;
        }
        if (this.field9621 != 128 || this.field9601 != 0) {
            var15 |= 0x5;
        }
        class19 var18 = this.field9616.field5153;
        class473 var19;
        synchronized (this.field9616.field5153) {
            var19 = (class473) this.field9616.field5153.method78(arg12 ^ arg12, (long) (this.field9599 |= arg4.field8053 << 29));
        }
        if (var19 == null || arg4.method973(var19.method1861(), var15) != 0) {
            if (var19 != null) {
                var15 = arg4.method1004(var15, var19.method1861());
            }
            int var20 = var15;
            if (this.field9609 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field9619 != null) {
                var20 |= 0x8000;
            }
            class581 var21 = class331.method1919(0, (byte) -43, this.field9616.field5149, this.field9597);
            if (var21 == null) {
                return null;
            }
            if (var21.field8264 < 13) {
                var21.method3289(2, 56);
            }
            var19 = arg4.method1051(var21, var20, this.field9616.field5154, this.field9614 + 64, this.field9610 + 850);
            if (this.field9609 != null) {
                for (int var22 = 0; var22 < this.field9609.length; var22++) {
                    var19.method1882(this.field9609[var22], this.field9613[var22]);
                }
            }
            if (this.field9619 != null) {
                for (int var23 = 0; var23 < this.field9619.length; var23++) {
                    var19.method1906(this.field9619[var23], this.field9600[var23]);
                }
            }
            var19.method1907(var15);
            class19 var24 = this.field9616.field5153;
            synchronized (this.field9616.field5153) {
                this.field9616.field5153.method92(1, (long) (this.field9599 |= arg4.field8053 << 29), var19);
            }
        }
        class473 var25 = var16 == null ? var19.method1877(arg6, var15, true) : var16.method1524(arg6, (byte) -10, arg8, arg2, var19, arg10, 0, var15);
        if (this.field9621 != 128 || this.field9607 != 128) {
            var25.method1885(this.field9621, this.field9607, this.field9621);
        }
        if (this.field9601 != 0) {
            if (this.field9601 == 90) {
                var25.method1879(4096);
            }
            if (this.field9601 == 180) {
                var25.method1879(8192);
            }
            if (this.field9601 == 270) {
                var25.method1879(12288);
            }
        }
        if (var17) {
            var25.method1911(this.field9615, this.field9602, arg1, arg0, arg3, arg7, arg13);
        }
        var25.method1907(arg11);
        return var25;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lnp;I)V", line = 320)
    public final void method3784(class115 arg0, int arg1) {
        if (arg1 > -15) {
            this.method3783(null, null, -16, -24, null, null, (byte) -15, 68, -15, true, -125, 77, 97, 9);
        }
        while (true) {
            int var3 = arg0.method620((byte) -126);
            if (var3 == 0) {
                field9606++;
                return;
            }
            this.method3779(arg0, var3, (byte) -33);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V", line = 348)
    public static final void method3785(int arg0) {
        class140.field1549.method1947(-24139);
        field9620++;
        class108.field1166.method243(0);
        class338.field4252.method2551(true);
        class41.field407.setBackground(Color.black);
        class5.field58 = -1;
        class140.field1549 = class162.method880(class41.field407, true);
        if (arg0 >= -91) {
            field9605 = null;
        }
        class108.field1166 = class93.method476(60, class41.field407, true);
    }
}
