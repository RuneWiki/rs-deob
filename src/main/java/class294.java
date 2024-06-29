import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class294 extends class320 {

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    private int field4627 = -32768;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    private int field4631 = 0;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    private int field4647 = 0;

    @OriginalMember(owner = "client!gm", name = "Y", descriptor = "I")
    private int field4658 = -1;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "Z")
    private boolean field4652 = false;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public int field4629;

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
    private int field4651;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    private int field4644;

    @OriginalMember(owner = "client!gm", name = "Z", descriptor = "I")
    private int field4659;

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "I")
    private int field4637;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "I")
    public int field4650;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    private int field4628;

    @OriginalMember(owner = "client!gm", name = "bb", descriptor = "I")
    public int field4661;

    @OriginalMember(owner = "client!gm", name = "X", descriptor = "I")
    public int field4657;

    @OriginalMember(owner = "client!gm", name = "W", descriptor = "I")
    private int field4656;

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "Ljh;")
    private class269 field4649;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    public static int field4625 = 0;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4620 = "Started 3d Library";

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
    public static int field4638 = 0;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "D")
    private double field4622;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "D")
    public double field4630;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "D")
    public double field4632;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "D")
    private double field4634;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "D")
    private double field4641;

    @OriginalMember(owner = "client!gm", name = "U", descriptor = "D")
    public double field4654;

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "D")
    private double field4655;

    @OriginalMember(owner = "client!gm", name = "cb", descriptor = "D")
    private double field4662;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    private int field4624;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "I")
    public int field4653;

    @OriginalMember(owner = "client!gm", name = "ab", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "Lmf;")
    private class47 field4639;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "[[[B")
    public static byte[][][] field4640;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2064(byte arg0) {
        field4643++;
        class258.field3996.method1837(-119);
        if (arg0 >= -102) {
            method2066(-30);
        }
        class245.field3781.method1837(-114);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IZ)V", line = 17)
    public final void method2065(int arg0, boolean arg1) {
        field4623++;
        this.field4652 = true;
        this.field4654 += (double) arg0 * this.field4641;
        this.field4632 += (double) arg0 * this.field4622;
        if (this.field4644 == -1) {
            this.field4630 += (double) arg0 * this.field4655;
        } else {
            this.field4630 += this.field4662 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field4655;
            this.field4655 += (double) arg0 * this.field4662;
        }
        this.field4653 = (int) (Math.atan2(this.field4622, this.field4641) * 325.949D) + 1024 & 0x7FF;
        this.field4624 = (int) (Math.atan2(this.field4655, this.field4634) * 325.949D) & 0x7FF;
        if (this.field4649 != null) {
            this.field4647 += arg0;
            label44: while (true) {
                do {
                    do {
                        if (this.field4649.field4165[this.field4631] >= this.field4647) {
                            break label44;
                        }
                        this.field4647 -= this.field4649.field4165[this.field4631];
                        this.field4631++;
                        if (this.field4649.field4183.length <= this.field4631) {
                            this.field4631 -= this.field4649.field4174;
                            if (this.field4631 < 0 || this.field4649.field4183.length <= this.field4631) {
                                this.field4631 = 0;
                            }
                        }
                        this.field4658 = this.field4631 + 1;
                    } while (this.field4658 < this.field4649.field4183.length);
                    this.field4658 -= this.field4649.field4174;
                } while (this.field4658 >= 0 && this.field4649.field4183.length > this.field4658);
                this.field4658 = -1;
            }
        }
        if (arg1) {
            field4640 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()I", line = 69)
    public final int method207() {
        field4660++;
        return this.field4627;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIIIJILmf;)V", line = 78)
    public final void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10) {
        field4648++;
        class199 var13 = this.method2070((byte) 33);
        if (var13 != null) {
            var13.method203(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4639);
            this.field4627 = var13.method207();
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V", line = 100)
    public static void method2066(int arg0) {
        field4620 = null;
        if (arg0 == 2047) {
            field4640 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)V", line = 111)
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4642++;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 323)
    public class294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field4629 = arg10;
        this.field4651 = arg8;
        this.field4635 = arg9;
        this.field4644 = arg7;
        this.field4659 = arg2;
        this.field4637 = arg3;
        this.field4650 = arg5;
        this.field4628 = arg0;
        this.field4661 = arg6;
        this.field4657 = arg1;
        this.field4652 = false;
        this.field4656 = arg4;
        int var12 = class136.method1042((byte) 124, this.field4628).field1477;
        if (var12 == -1) {
            this.field4649 = null;
        } else {
            this.field4649 = class6.method28(var12, 2);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 129)
    public static final int method2067(String arg0, byte arg1) {
        int var2 = -79 % ((arg1 - 65) / 60);
        field4645++;
        return class232.method1674(10, true, arg0, true);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIZI)V", line = 142)
    public final void method2068(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!this.field4652) {
            double var6 = (double) (arg0 - this.field4659);
            double var8 = (double) (arg1 - this.field4637);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field4630 = (double) this.field4656;
            this.field4632 = (double) this.field4651 * var6 / var10 + (double) this.field4659;
            this.field4654 = (double) this.field4651 * var8 / var10 + (double) this.field4637;
        }
        if (arg3) {
            this.method207();
        }
        field4646++;
        double var12 = (double) (this.field4661 + 1 - arg4);
        this.field4641 = ((double) arg1 - this.field4654) / var12;
        this.field4622 = ((double) arg0 - this.field4632) / var12;
        this.field4634 = Math.sqrt(this.field4641 * this.field4641 + this.field4622 * this.field4622);
        if (this.field4644 == -1) {
            this.field4655 = ((double) arg2 - this.field4630) / var12;
        } else {
            if (!this.field4652) {
                this.field4655 = -this.field4634 * Math.tan((double) this.field4644 * 0.02454369D);
            }
            this.field4662 = ((double) arg2 - this.field4630 - this.field4655 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZLoj;IIII)Ljava/awt/Frame;", line = 224)
    public static final Frame method2069(boolean arg0, class325 arg1, int arg2, int arg3, int arg4, int arg5) {
        field4633++;
        if (!arg1.method2233(-22152)) {
            return null;
        }
        if (arg2 == 0) {
            class302[] var6 = class219.method1587(arg1, 76);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4754 == arg5 && var6[var8].field4751 == arg3 && (arg4 == 0 || var6[var8].field4755 == arg4) && (!var7 || var6[var8].field4749 > arg2)) {
                    var7 = true;
                    arg2 = var6[var8].field4749;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class21 var9 = arg1.method2221(arg4, (byte) 111, arg5, arg2, arg3);
        while (var9.field387 == 0) {
            class279.method1991(106, 10L);
        }
        Frame var10 = (Frame) var9.field391;
        if (!arg0) {
            field4621 = 6;
        }
        if (var10 == null) {
            return null;
        } else if (var9.field387 == 2) {
            class157.method1180(false, var10, arg1);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)Lfa;", line = 302)
    private final class199 method2070(byte arg0) {
        field4626++;
        class90 var2 = class136.method1042((byte) 110, this.field4628);
        class199 var3 = var2.method652(2026, this.field4631, this.field4647, this.field4658);
        if (var3 == null) {
            return null;
        } else {
            var3.method1132(this.field4624);
            int var4 = 105 / ((-arg0 - 64) / 57);
            return var3;
        }
    }
}
