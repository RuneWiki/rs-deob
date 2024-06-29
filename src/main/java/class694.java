import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class694 extends class395 {

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    private int field9632 = 0;

    @OriginalMember(owner = "client!si", name = "hb", descriptor = "Z")
    private boolean field9648 = false;

    @OriginalMember(owner = "client!si", name = "Ab", descriptor = "I")
    private int field9667 = 0;

    @OriginalMember(owner = "client!si", name = "zb", descriptor = "I")
    private int field9666 = 0;

    @OriginalMember(owner = "client!si", name = "Pb", descriptor = "Z")
    private boolean field9682 = false;

    @OriginalMember(owner = "client!si", name = "qb", descriptor = "I")
    private int field9657 = 0;

    @OriginalMember(owner = "client!si", name = "Qb", descriptor = "I")
    private int field9683 = -1;

    @OriginalMember(owner = "client!si", name = "vb", descriptor = "I")
    private int field9662;

    @OriginalMember(owner = "client!si", name = "mb", descriptor = "Z")
    private boolean field9653;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    public int field9630;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "I")
    private int field9643;

    @OriginalMember(owner = "client!si", name = "Db", descriptor = "I")
    public int field9670;

    @OriginalMember(owner = "client!si", name = "tb", descriptor = "I")
    private int field9660;

    @OriginalMember(owner = "client!si", name = "yb", descriptor = "I")
    private int field9665;

    @OriginalMember(owner = "client!si", name = "kb", descriptor = "I")
    public int field9651;

    @OriginalMember(owner = "client!si", name = "eb", descriptor = "I")
    public int field9645;

    @OriginalMember(owner = "client!si", name = "pb", descriptor = "I")
    private int field9656;

    @OriginalMember(owner = "client!si", name = "nb", descriptor = "I")
    private int field9654;

    @OriginalMember(owner = "client!si", name = "Eb", descriptor = "Lpia;")
    private class57 field9671;

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "D")
    private double field9639;

    @OriginalMember(owner = "client!si", name = "ib", descriptor = "D")
    private double field9649;

    @OriginalMember(owner = "client!si", name = "ob", descriptor = "D")
    private double field9655;

    @OriginalMember(owner = "client!si", name = "wb", descriptor = "D")
    private double field9663;

    @OriginalMember(owner = "client!si", name = "Fb", descriptor = "D")
    private double field9672;

    @OriginalMember(owner = "client!si", name = "Gb", descriptor = "D")
    private double field9673;

    @OriginalMember(owner = "client!si", name = "Jb", descriptor = "D")
    private double field9676;

    @OriginalMember(owner = "client!si", name = "Mb", descriptor = "D")
    private double field9679;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "I")
    private int field9633;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "I")
    public static int field9635;

    @OriginalMember(owner = "client!si", name = "W", descriptor = "I")
    public static int field9637;

    @OriginalMember(owner = "client!si", name = "X", descriptor = "I")
    public static int field9638;

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "I")
    public static int field9640;

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "I")
    public static int field9642;

    @OriginalMember(owner = "client!si", name = "db", descriptor = "I")
    public static int field9644;

    @OriginalMember(owner = "client!si", name = "fb", descriptor = "I")
    public static int field9646;

    @OriginalMember(owner = "client!si", name = "gb", descriptor = "I")
    public static int field9647;

    @OriginalMember(owner = "client!si", name = "jb", descriptor = "I")
    public static int field9650;

    @OriginalMember(owner = "client!si", name = "lb", descriptor = "I")
    public static int field9652;

    @OriginalMember(owner = "client!si", name = "rb", descriptor = "I")
    public static int field9658;

    @OriginalMember(owner = "client!si", name = "sb", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!si", name = "ub", descriptor = "I")
    public static int field9661;

    @OriginalMember(owner = "client!si", name = "xb", descriptor = "I")
    private int field9664;

    @OriginalMember(owner = "client!si", name = "Bb", descriptor = "I")
    public static int field9668;

    @OriginalMember(owner = "client!si", name = "Cb", descriptor = "I")
    public static int field9669;

    @OriginalMember(owner = "client!si", name = "Hb", descriptor = "I")
    public static int field9674;

    @OriginalMember(owner = "client!si", name = "Ib", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!si", name = "Kb", descriptor = "I")
    public static int field9677;

    @OriginalMember(owner = "client!si", name = "Lb", descriptor = "I")
    public static int field9678;

    @OriginalMember(owner = "client!si", name = "Nb", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!si", name = "Ob", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "Lfd;")
    public static class298 field9641;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "Lnha;")
    private class689 field9636;

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V", line = 579)
    public class694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, int arg14) {
        super(arg1, arg2, arg3, -arg5 + class737.method4102((byte) 19, arg3, arg4, arg1), arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
        this.field9662 = arg8;
        this.field9653 = arg13;
        this.field9630 = arg11;
        this.field9643 = arg9;
        this.field9670 = arg12;
        this.field9660 = arg10;
        this.field9648 = false;
        this.field9665 = arg0;
        this.field9651 = arg7;
        this.field9645 = arg6;
        this.field9656 = arg5;
        this.field9654 = arg14;
        int var16 = class129.field1776.method4073(-7428, this.field9665).field596;
        if (var16 != -1) {
            this.field9671 = class607.field8188.method3001(-12575, var16);
        } else {
            this.field9671 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lha;I)Lua;", line = 19)
    public final class3 method660(class548 arg0, int arg1) {
        ++field9678;
        class284 var3 = this.method3918(arg1 + 1, arg0, 2048);
        if (var3 == null) {
            return null;
        } else {
            class744 var4 = arg0.method1404();
            var4.method880(this.field9633);
            var4.method890(this.field9664);
            var4.method882((int) this.field9655, (int) this.field9676, (int) this.field9673);
            this.method3922(var3, arg0, arg1 ^ -8860, var4);
            class3 var5 = class682.method3841(1, false, 28389);
            if (!class301.field4261) {
                var3.method1686(var4, var5.field18[0], 0);
            } else {
                var3.method1682(var4, var5.field18[0], class3.field30, 0);
            }
            if (this.field9636 != null) {
                class100 var6 = this.field9636.method3895();
                if (!class301.field4261) {
                    arg0.method1413(var6);
                } else {
                    arg0.method1479(var6, class3.field30);
                }
            }
            this.field9682 = var3.method1673();
            if (arg1 != -1) {
                method3921(12, (String) null, -90, (class664) null);
            }
            this.field9657 = var3.method1668();
            this.field9632 = var3.method1697();
            return var5;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)Z", line = 64)
    public final boolean method642(byte arg0) {
        ++field9659;
        return arg0 != 2 ? false : false;
    }

    @OriginalMember(owner = "client!si", name = "m", descriptor = "(I)V", line = 75)
    public final void method641(int arg0) {
        ++field9668;
        if (arg0 <= 91) {
            this.field9662 = -108;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Lha;B)Liha;", line = 86)
    public final class613 method653(class548 arg0, byte arg1) {
        if (arg1 != 13) {
            method3917(-51);
        }
        ++field9658;
        return null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(III)V", line = 97)
    public static final void method3916(int arg0, int arg1, int arg2) {
        ++field9634;
        if (arg1 != 16383) {
            method3917(55);
        }
        class346 var3 = class299.method1976(0, 15, 0);
        var3.method2209(arg1 + -16128);
        var3.field4916 = arg0;
        var3.field4926 = arg2;
    }

    @OriginalMember(owner = "client!si", name = "finalize", descriptor = "()V", line = 114)
    protected final void finalize() {
        ++field9646;
        if (this.field9636 != null) {
            this.field9636.method3891();
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 125)
    public static final void method3917(int arg0) {
        ++field9680;
        class453.field6283.method1457((0.7F + 0.1F * (float) class332.field4707.field4780.method3040(arg0 ^ arg0)) * 1.1523438F);
        class453.field6283.method1498(class191.field2598, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class453.field6283.method1474(class623.field8404, -1, 0);
        class453.field6283.method1391(class731.field10162);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILha;I)Lka;", line = 139)
    private final class284 method3918(int arg0, class548 arg1, int arg2) {
        ++field9669;
        if (arg0 != 0) {
            this.method653((class548) null, (byte) -114);
        }
        class46 var4 = class129.field1776.method4073(-7428, this.field9665);
        return var4.method255(class607.field8188, this.field9667, (byte) 82, this.field9666, arg2, this.field9683, arg1);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 152)
    public static void method3919(boolean arg0) {
        if (arg0) {
            field9641 = null;
        }
        field9641 = null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 164)
    public final void method3920(int arg0) {
        ++field9642;
        if (!this.field9648) {
            if (this.field9660 != arg0) {
                class515 var2 = null;
                if (~this.field9660 > -1) {
                    int var3 = -this.field9660 + -1;
                    if (~class145.field2037 == ~var3) {
                        var2 = class388.field5601;
                    } else {
                        var2 = class251.field3675[var3];
                    }
                } else {
                    int var4 = this.field9660 - 1;
                    class234 var5 = (class234) class372.field5245.method812(arg0 ^ 119, (long) var4);
                    if (var5 != null) {
                        var2 = var5.field3471;
                    }
                }
                if (var2 != null) {
                    super.field4410 = var2.field4410;
                    super.field4418 = var2.field4418;
                    super.field4413 = class737.method4102((byte) 19, var2.field4410, var2.field4418, super.field4408) - this.field9656;
                    if (~this.field9654 <= -1) {
                        class32 var6 = var2.method3084((byte) -92);
                        int var7 = 0;
                        int var8 = 0;
                        if (var6.field403 != null && var6.field403[this.field9654] != null) {
                            var7 += var6.field403[this.field9654][0];
                            var8 += var6.field403[this.field9654][2];
                        }
                        if (var6.field428 != null && var6.field428[this.field9654] != null) {
                            var8 += var6.field428[this.field9654][2];
                            var7 += var6.field428[this.field9654][0];
                        }
                        if (~var7 != -1 || var8 != 0) {
                            int var9 = var2.field7125.method168(false);
                            int var10 = var9;
                            if (var2.field7128 != null && var2.field7128[this.field9654] != -1) {
                                var10 = var2.field7128[this.field9654];
                            }
                            int var11 = -var9 + var10 & 16383;
                            int var12 = class24.field312[var11];
                            int var13 = class24.field308[var11];
                            int var14 = var8 * var12 - -(var7 * var13) >> 14;
                            int var15 = var8 * var13 - var7 * var12 >> 14;
                            super.field4418 += var15;
                            super.field4410 += var14;
                        }
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILjava/lang/String;ILdw;)Lie;", line = 257)
    public static final class193 method3921(int arg0, String arg1, int arg2, class664 arg3) {
        ++field9674;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class90.field1273, arg2);
        if (class90.field1273[0] == 0) {
            if (~class90.field1273[0] == -1) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class90.field1273, 1);
            if (~class90.field1273[1] < -2) {
                byte[] var6 = new byte[class90.field1273[1]];
                OpenGL.glGetInfoLogARB(var4, class90.field1273[1], class90.field1273, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class90.field1273[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class193(arg3, var4, arg0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lka;Lha;ILih;)V", line = 293)
    private final void method3922(class284 arg0, class548 arg1, int arg2, class744 arg3) {
        arg0.method1661(arg3);
        ++field9677;
        class44[] var5 = arg0.method1662();
        if (arg2 != 8859) {
            this.method641(-37);
        }
        class491[] var6 = arg0.method1688();
        if ((this.field9636 == null || this.field9636.field9588) && (var5 != null || var6 != null)) {
            this.field9636 = class689.method3884(class483.field6741, true);
        }
        if (this.field9636 != null) {
            this.field9636.method3882(arg1, (long) class483.field6741, var5, var6, false);
            this.field9636.method3892(super.field4408, super.field5680, super.field5683, super.field5673, super.field5679);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZI)V", line = 320)
    public final void method3923(boolean arg0, int arg1) {
        this.field9673 += (double) arg1 * this.field9639;
        this.field9648 = arg0;
        ++field9631;
        this.field9655 += (double) arg1 * this.field9649;
        if (!this.field9653) {
            if (~this.field9662 == 0) {
                this.field9676 += (double) arg1 * this.field9663;
            } else {
                this.field9676 += this.field9672 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field9663;
                this.field9663 += (double) arg1 * this.field9672;
            }
        } else {
            this.field9676 = (double) (class737.method4102((byte) 19, (int) this.field9655, (int) this.field9673, super.field4408) + -this.field9656);
        }
        this.field9664 = (int) (Math.atan2(this.field9649, this.field9639) * 2607.5945876176133D) + 8192 & 16383;
        this.field9633 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field9663, this.field9679));
        if (this.field9671 != null) {
            this.field9666 += arg1;
            while (true) {
                do {
                    do {
                        if (this.field9671.field813[this.field9667] >= this.field9666) {
                            return;
                        }
                        this.field9666 -= this.field9671.field813[this.field9667];
                        ++this.field9667;
                        if (~this.field9671.field821.length >= ~this.field9667) {
                            this.field9667 -= this.field9671.field806;
                            if (this.field9667 < 0 || this.field9667 >= this.field9671.field821.length) {
                                this.field9667 = 0;
                            }
                        }
                        this.field9683 = this.field9667 + 1;
                    } while (~this.field9671.field821.length < ~this.field9683);
                    this.field9683 -= this.field9671.field806;
                } while (this.field9683 >= 0 && ~this.field9683 > ~this.field9671.field821.length);
                this.field9683 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "h", descriptor = "(I)Z", line = 376)
    public final boolean method783(int arg0) {
        if (arg0 != 0) {
            this.method3926((byte) 106);
        }
        ++field9652;
        return false;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(B)I", line = 396)
    public final int method793(byte arg0) {
        if (arg0 != -86) {
            return 14;
        } else {
            ++field9637;
            return this.field9632;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLha;)V", line = 407)
    public final void method659(boolean arg0, class548 arg1) {
        ++field9661;
        class284 var3 = this.method3918(0, arg1, 0);
        if (!arg0) {
            if (var3 != null) {
                class744 var4 = arg1.method1404();
                var4.method880(this.field9633);
                var4.method890(this.field9664);
                var4.method882((int) this.field9655, (int) this.field9676, (int) this.field9673);
                this.field9657 = var3.method1668();
                this.field9632 = var3.method1697();
                this.method3922(var3, arg1, 8859, var4);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(III)Z", line = 431)
    public static final boolean method3924(int arg0, int arg1, int arg2) {
        ++field9644;
        if (arg2 != 2048) {
            field9641 = null;
        }
        return ~(arg1 & 2048) != -1 && (55 & arg0) != 0;
    }

    @OriginalMember(owner = "client!si", name = "n", descriptor = "(I)I", line = 442)
    public final int method790(int arg0) {
        ++field9638;
        if (arg0 != -11692) {
            this.field9648 = false;
        }
        return this.field9657;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIII)V", line = 454)
    public final void method3925(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field9648) {
            double var6 = (double) (arg2 - super.field4410);
            double var8 = (double) (-super.field4418 + arg4);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field9673 = (double) this.field9643 * var8 / var10 + (double) super.field4418;
            this.field9655 = (double) this.field9643 * var6 / var10 + (double) super.field4410;
            if (!this.field9653) {
                this.field9676 = (double) super.field4413;
            } else {
                this.field9676 = (double) (class737.method4102((byte) 19, (int) this.field9655, (int) this.field9673, super.field4408) + -this.field9656);
            }
        }
        ++field9640;
        if (arg1 <= 113) {
            method3921(-19, (String) null, 110, (class664) null);
        }
        double var12 = (double) (-arg3 + this.field9651 + 1);
        this.field9639 = ((double) arg4 - this.field9673) / var12;
        this.field9649 = ((double) arg2 - this.field9655) / var12;
        this.field9679 = Math.sqrt(this.field9649 * this.field9649 + this.field9639 * this.field9639);
        if (~this.field9662 == 0) {
            this.field9663 = ((double) arg0 - this.field9676) / var12;
        } else {
            if (!this.field9648) {
                this.field9663 = -this.field9679 * Math.tan((double) this.field9662 * 0.02454369D);
            }
            this.field9672 = ((double) arg0 - this.field9676 + -(this.field9663 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLha;ZILuq;II)V", line = 510)
    public final void method648(byte arg0, class548 arg1, boolean arg2, int arg3, class318 arg4, int arg5, int arg6) {
        if (arg0 <= -8) {
            ++field9650;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!si", name = "l", descriptor = "(I)Z", line = 531)
    public final boolean method785(int arg0) {
        if (arg0 > -117) {
            method3919(false);
        }
        ++field9681;
        return this.field9682;
    }

    @OriginalMember(owner = "client!si", name = "p", descriptor = "(I)V", line = 547)
    public final void method2468(int arg0) {
        super.field5673 = super.field5679 = (short) ((int) (this.field9673 / 512.0D));
        super.field5680 = super.field5683 = (short) ((int) (this.field9655 / 512.0D));
        int var2 = 74 / ((arg0 - -71) / 41);
        ++field9635;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V", line = 558)
    public final void method3926(byte arg0) {
        ++field9647;
        if (this.field9636 != null) {
            this.field9636.method3891();
        }
        if (arg0 > -126) {
            this.field9656 = -29;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILha;IB)Z", line = 608)
    public final boolean method644(int arg0, class548 arg1, int arg2, byte arg3) {
        if (arg3 >= -58) {
            return false;
        } else {
            ++field9675;
            return false;
        }
    }
}
