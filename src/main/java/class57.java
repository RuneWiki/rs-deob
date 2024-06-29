import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class57 extends class598 {

    @OriginalMember(owner = "client!qr", name = "S", descriptor = "I")
    private int field510 = -32768;

    @OriginalMember(owner = "client!qr", name = "T", descriptor = "I")
    private int field511 = -1;

    @OriginalMember(owner = "client!qr", name = "ib", descriptor = "I")
    private int field526 = 0;

    @OriginalMember(owner = "client!qr", name = "M", descriptor = "I")
    private int field504 = 0;

    @OriginalMember(owner = "client!qr", name = "qb", descriptor = "Z")
    private boolean field534 = false;

    @OriginalMember(owner = "client!qr", name = "ab", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!qr", name = "jb", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client!qr", name = "W", descriptor = "Z")
    private boolean field514;

    @OriginalMember(owner = "client!qr", name = "V", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "client!qr", name = "R", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!qr", name = "F", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client!qr", name = "rb", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "client!qr", name = "N", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!qr", name = "H", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "client!qr", name = "eb", descriptor = "Llk;")
    private class502 field522;

    @OriginalMember(owner = "client!qr", name = "lb", descriptor = "[Lvw;")
    public static class253[] field529 = new class253[2048];

    @OriginalMember(owner = "client!qr", name = "C", descriptor = "D")
    private double field495;

    @OriginalMember(owner = "client!qr", name = "E", descriptor = "D")
    private double field497;

    @OriginalMember(owner = "client!qr", name = "K", descriptor = "D")
    private double field503;

    @OriginalMember(owner = "client!qr", name = "O", descriptor = "D")
    private double field506;

    @OriginalMember(owner = "client!qr", name = "U", descriptor = "D")
    private double field512;

    @OriginalMember(owner = "client!qr", name = "db", descriptor = "D")
    private double field521;

    @OriginalMember(owner = "client!qr", name = "fb", descriptor = "D")
    private double field523;

    @OriginalMember(owner = "client!qr", name = "ob", descriptor = "D")
    private double field532;

    @OriginalMember(owner = "client!qr", name = "D", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!qr", name = "G", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!qr", name = "I", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!qr", name = "J", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!qr", name = "Q", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!qr", name = "X", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!qr", name = "Y", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!qr", name = "Z", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!qr", name = "bb", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!qr", name = "cb", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!qr", name = "gb", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!qr", name = "hb", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!qr", name = "kb", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!qr", name = "mb", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!qr", name = "nb", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!qr", name = "pb", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!qr", name = "sb", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!qr", name = "tb", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!qr", name = "ub", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!qr", name = "P", descriptor = "Lts;")
    private class455 field507;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method318(int arg0, class206 arg1, int arg2, int arg3) {
        if (arg0 != -21851) {
            return true;
        } else {
            ++field538;
            return false;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZLqa;Lr;)V")
    private final void method319(boolean arg0, class206 arg1, class157 arg2) {
        ++field531;
        if (arg0) {
            this.field514 = false;
        }
        class55[] var4 = arg2.method59();
        class348[] var5 = arg2.method78();
        if ((this.field507 == null || this.field507.field6266) && (var4 != null || var5 != null)) {
            this.field507 = class455.method2652(class335.field4358);
        }
        if (this.field507 != null) {
            this.field507.method2656(arg1, (long) class335.field4358, var4, var5, false);
            this.field507.method2662(super.field8660, super.field8653, super.field8663, super.field8650, super.field8654);
        }
    }

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "(I)Z")
    public final boolean method317(int arg0) {
        ++field501;
        if (arg0 != 64) {
            this.field498 = 18;
        }
        return false;
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(ILqa;)Loj;")
    public final class318 method320(int arg0, class206 arg1) {
        ++field537;
        if (arg0 != -1) {
            this.field503 = -0.6569346330132514D;
        }
        class157 var3 = this.method325(2048, arg0 + 1, arg1);
        if (var3 == null) {
            return null;
        } else {
            class163 var4 = arg1.method1126();
            var4.method659(this.field508);
            var4.method672(this.field524);
            var4.method655((int) this.field495, (int) this.field523, (int) this.field497);
            if (this.field507 != null) {
                class400 var5 = this.field507.method2650();
                arg1.method1177(var3, var5, var4, (class517) null, 0);
            } else {
                var3.method69(var4, (class517) null, 0);
            }
            this.field510 = var3.method74();
            this.method319(false, arg1, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "(B)V")
    public final void method321(byte arg0) {
        super.field8650 = super.field8654 = (short) ((int) (this.field497 / 128.0D));
        ++field533;
        super.field8653 = super.field8663 = (short) ((int) (this.field495 / 128.0D));
        if (arg0 < 37) {
            this.method321((byte) -1);
        }
    }

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "(I)I")
    public final int method322(int arg0) {
        if (arg0 != 64) {
            return 27;
        } else {
            ++field525;
            return this.field510;
        }
    }

    @OriginalMember(owner = "client!qr", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field507 != null) {
            this.field507.method2654();
        }
        ++field499;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
    public static void method323(int arg0) {
        if (arg0 != -8192) {
            method330((class17) null, (Canvas) null, 107);
        }
        field529 = null;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
    public final void method324(int arg0) {
        ++field515;
        if (this.field507 != null) {
            this.field507.method2654();
        }
        if (arg0 <= 43) {
            this.field534 = true;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZLoe;ILqa;III)V")
    public final void method312(boolean arg0, class170 arg1, int arg2, class206 arg3, int arg4, int arg5, int arg6) {
        ++field528;
        if (arg5 == 13915) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
    public class57(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, class426.method2400(-1, arg3, arg2, arg1) + -arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field518 = arg5;
        this.field527 = arg4;
        this.field514 = arg11;
        this.field513 = arg6;
        this.field509 = arg7;
        this.field534 = false;
        this.field498 = arg8;
        this.field535 = arg9;
        this.field505 = arg0;
        this.field500 = arg10;
        int var13 = class344.field4461.method1393(64, this.field505).field4667;
        if (~var13 != 0) {
            this.field522 = class393.field5190.method770(var13, -58);
        } else {
            this.field522 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IILqa;)Lr;")
    private final class157 method325(int arg0, int arg1, class206 arg2) {
        ++field516;
        if (arg1 != 0) {
            this.finalize();
        }
        class356 var4 = class344.field4461.method1393(arg1 + 64, this.field505);
        return var4.method2005(-21838, this.field504, this.field511, arg0, arg2, class393.field5190, this.field526);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILqa;)V")
    public final void method326(int arg0, class206 arg1) {
        if (arg0 == 29657) {
            ++field519;
            class157 var3 = this.method325(0, 0, arg1);
            if (var3 != null) {
                class163 var4 = arg1.method1126();
                var4.method659(this.field508);
                var4.method672(this.field524);
                var4.method655((int) this.field495, (int) this.field523, (int) this.field497);
                this.field510 = var3.method74();
                this.method319(false, arg1, var3);
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)V")
    public static final void method327(int arg0, boolean arg1) {
        ++field520;
        if (!arg1) {
            class557 var2 = class93.method564(3, -14073, arg0);
            var2.method3264(-1037624096);
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(ILqa;)Lso;")
    public final class398 method328(int arg0, class206 arg1) {
        ++field502;
        return arg0 != 12 ? null : null;
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(B)V")
    public final void method314(byte arg0) {
        ++field530;
        if (arg0 > 23) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIII)V")
    public final void method329(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -120 / ((-56 - arg2) / 51);
        ++field496;
        if (!this.field534) {
            double var7 = (double) (arg3 - super.field8661);
            double var9 = (double) (-super.field8652 + arg0);
            double var11 = Math.sqrt(var7 * var7 + var9 * var9);
            this.field495 = (double) this.field498 * var7 / var11 + (double) super.field8661;
            this.field497 = (double) this.field498 * var9 / var11 + (double) super.field8652;
            if (this.field514) {
                this.field523 = (double) (class426.method2400(-1, (int) this.field497, (int) this.field495, super.field8660) + -this.field527);
            } else {
                this.field523 = (double) super.field8649;
            }
        }
        double var13 = (double) (this.field513 + 1 + -arg4);
        this.field512 = ((double) arg3 - this.field495) / var13;
        this.field506 = ((double) arg0 - this.field497) / var13;
        this.field521 = Math.sqrt(this.field512 * this.field512 + this.field506 * this.field506);
        if (this.field509 != -1) {
            if (!this.field534) {
                this.field503 = -this.field521 * Math.tan((double) this.field509 * 0.02454369D);
            }
            this.field532 = ((double) arg1 + -this.field523 + -(this.field503 * var13)) * 2.0D / (var13 * var13);
        } else {
            this.field503 = ((double) arg1 - this.field523) / var13;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ln;Ljava/awt/Canvas;I)Lqa;")
    public static final class206 method330(class17 arg0, Canvas arg1, int arg2) {
        if (arg2 <= 97) {
            return null;
        } else {
            ++field536;
            return new class526(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)V")
    public final void method331(byte arg0, int arg1) {
        this.field495 += (double) arg1 * this.field512;
        this.field497 += (double) arg1 * this.field506;
        ++field517;
        this.field534 = true;
        if (this.field514) {
            this.field523 = (double) (class426.method2400(-1, (int) this.field497, (int) this.field495, super.field8660) + -this.field527);
        } else if (~this.field509 == 0) {
            this.field523 += (double) arg1 * this.field503;
        } else {
            this.field523 += this.field532 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field503;
            this.field503 += (double) arg1 * this.field532;
        }
        this.field524 = 16383 & (int) (Math.atan2(this.field512, this.field506) * 2607.5945876176133D) - -8192;
        if (arg0 < -31) {
            this.field508 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field503, this.field521));
            if (this.field522 != null) {
                this.field504 += arg1;
                while (true) {
                    do {
                        do {
                            if (this.field522.field6952[this.field526] >= this.field504) {
                                return;
                            }
                            this.field504 -= this.field522.field6952[this.field526];
                            ++this.field526;
                            if (this.field522.field6944.length <= this.field526) {
                                this.field526 -= this.field522.field6966;
                                if (this.field526 < 0 || ~this.field522.field6944.length >= ~this.field526) {
                                    this.field526 = 0;
                                }
                            }
                            this.field511 = this.field526 - -1;
                        } while (~this.field522.field6944.length < ~this.field511);
                        this.field511 -= this.field522.field6966;
                    } while (this.field511 >= 0 && ~this.field522.field6944.length < ~this.field511);
                    this.field511 = -1;
                }
            }
        }
    }
}
