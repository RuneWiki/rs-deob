import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public class class373 extends class431 {

    @OriginalMember(owner = "client!kja", name = "Nb", descriptor = "I")
    public static int field5243 = 0;

    @OriginalMember(owner = "client!kja", name = "Kb", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!kja", name = "Lb", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!kja", name = "Mb", descriptor = "I")
    private int field5242;

    @OriginalMember(owner = "client!kja", name = "Pb", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!kja", name = "Qb", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!kja", name = "Rb", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!kja", name = "Sb", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!kja", name = "Tb", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!kja", name = "Ub", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!kja", name = "Vb", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!kja", name = "Wb", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!kja", name = "Xb", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!kja", name = "Yb", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!kja", name = "Ob", descriptor = "Ljf;")
    private class781 field5244;

    @OriginalMember(owner = "client!kja", name = "q", descriptor = "(B)V", line = 4)
    public final void method2220(byte arg0) {
        ++field5247;
        this.field5242 = super.field5983 * 8;
        if (arg0 > -112) {
            this.field5244 = null;
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(BLjf;)V", line = 17)
    public final void method2221(byte arg0, class781 arg1) {
        if (arg0 <= -76) {
            this.field5244 = arg1;
            ++field5241;
        }
    }

    @OriginalMember(owner = "client!kja", name = "j", descriptor = "(II)I", line = 29)
    public final int method2222(int arg0, int arg1) {
        ++field5252;
        int var3 = this.field5242 >> 3;
        int var4 = -(this.field5242 & 7) + arg0;
        this.field5242 += arg1;
        int var5 = 0;
        while (var4 < arg1) {
            var5 += (super.field6002[var3++] & class527.field7359[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (class527.field7359[var4] & super.field6002[var3]) + var5;
        } else {
            var6 = (super.field6002[var3] >> -arg1 + var4 & class527.field7359[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!kja", name = "c", descriptor = "(Z)V", line = 59)
    public final void method2223(boolean arg0) {
        ++field5251;
        super.field5983 = (this.field5242 - -7) / 8;
        if (arg0) {
            this.field5242 = 71;
        }
    }

    @OriginalMember(owner = "client!kja", name = "<init>", descriptor = "(I)V", line = 70)
    public class373(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kja", name = "w", descriptor = "(I)Z", line = 73)
    public final boolean method2224(int arg0) {
        if (arg0 != 1898356163) {
            this.method2220((byte) 5);
        }
        ++field5248;
        int var2 = super.field6002[super.field5983] - this.field5244.method4288(98) & 255;
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(I[I)V", line = 90)
    public final void method2225(int arg0, int[] arg1) {
        if (arg0 != 128) {
            this.field5242 = -100;
        }
        ++field5250;
        this.field5244 = new class781(arg1);
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(II[BI)V", line = 113)
    public final void method2226(int arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = arg1; ~arg3 < ~var5; ++var5) {
            arg2[arg0 + var5] = (byte) (super.field6002[super.field5983++] + -this.field5244.method4290((byte) 1));
        }
        ++field5240;
    }

    @OriginalMember(owner = "client!kja", name = "b", descriptor = "(Lha;I)V", line = 136)
    public static final void method2227(class475 arg0, int arg1) {
        ++field5254;
        if (arg1 >= -55) {
            method2227((class475) null, 45);
        }
        if (~class39.field454.method3732(256) != -1) {
            if (~class420.field5820.field9482.method2338(17539) == -1) {
                for (class474 var2 = (class474) class39.field454.method3731((byte) -68); var2 != null; var2 = (class474) class39.field454.method3729((byte) -112)) {
                    class422.field5873.method2940(false, var2.field6441, class71.field1124, var2.field6438, var2.field6442, !var2.field6443 ? null : class719.field10041.field207, var2.field6439, var2.field6440, (byte) 117, arg0, arg0, false);
                    var2.method4237(-1);
                }
                class31.method262((byte) -116);
            } else {
                if (class323.field4590 == null) {
                    Canvas var3 = new Canvas();
                    var3.setSize(36, 32);
                    class323.field4590 = class399.method2369(101, class570.field7914, 0, var3, 0, class425.field5903);
                    class352.field5013 = class323.field4590.method491(class119.method1053(class77.field1161, -6394, 0, class278.field4008), class418.method2472(class176.field2648, class278.field4008, 0), true);
                }
                for (class474 var4 = (class474) class39.field454.method3731((byte) -117); var4 != null; var4 = (class474) class39.field454.method3729((byte) 60)) {
                    class422.field5873.method2940(false, var4.field6441, class352.field5013, var4.field6438, var4.field6442, !var4.field6443 ? null : class719.field10041.field207, var4.field6439, var4.field6440, (byte) 117, arg0, class323.field4590, false);
                    var4.method4237(-1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kja", name = "r", descriptor = "(B)I", line = 189)
    public final int method2228(byte arg0) {
        int var2 = 40 % ((arg0 - 26) / 43);
        ++field5249;
        int var3 = 255 & super.field6002[super.field5983++] - this.field5244.method4290((byte) 1);
        return var3 < 128 ? var3 : (var3 + -128 << 8) + (255 & super.field6002[super.field5983++] - this.field5244.method4290((byte) 1));
    }

    @OriginalMember(owner = "client!kja", name = "g", descriptor = "(BI)I", line = 205)
    public final int method2229(byte arg0, int arg1) {
        ++field5245;
        if (arg0 <= 90) {
            this.method2230((byte) 96, 113);
        }
        return arg1 * 8 - this.field5242;
    }

    @OriginalMember(owner = "client!kja", name = "h", descriptor = "(BI)V", line = 220)
    public final void method2230(byte arg0, int arg1) {
        if (arg0 == 6) {
            super.field6002[super.field5983++] = (byte) (arg1 + this.field5244.method4290((byte) 1));
            ++field5253;
        }
    }
}
