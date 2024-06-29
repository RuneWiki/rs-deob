import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class43 extends class98 {

    @OriginalMember(owner = "client!le", name = "G", descriptor = "Z")
    private boolean field743 = false;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Z")
    private boolean field722 = false;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    private int field724 = 0;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    private int field759 = -32768;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    private int field757 = 0;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public int field739;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "I")
    private int field758;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "I")
    private int field762;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    private int field755;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    private int field747;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    private int field725;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "Ljb;")
    private class270 field748;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "S")
    public static short field723 = 32767;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "[I")
    public static int[] field733 = new int[2500];

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field730 = 0;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "Loa;")
    public static class99 field737 = class221.method1463(2844, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!le", name = "O", descriptor = "[I")
    public static int[] field751 = new int[32];

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "Loa;")
    public static class99 field763 = class221.method1463(2844, "Ablegen");

    @OriginalMember(owner = "client!le", name = "j", descriptor = "D")
    public double field720;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "D")
    private double field732;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "D")
    public double field735;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "D")
    public double field740;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "D")
    private double field745;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "D")
    private double field746;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "D")
    private double field750;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "D")
    private double field752;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
    private int field761;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Lkg;")
    private class136 field727;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()I")
    public final int method226() {
        field754++;
        return this.field759;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V")
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field729++;
        if (!this.field743) {
            class195 var6 = this.method324(false);
            if (var6 == null) {
                return;
            }
            this.method325(8265, var6);
        }
        if (this.field727 != null) {
            this.field727.method922(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method321(byte arg0) {
        field733 = null;
        field763 = null;
        field737 = null;
        if (arg0 <= 66) {
            field733 = null;
        }
        field751 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Z")
    public static final boolean method322(int arg0, int arg1) {
        field741++;
        if (arg1 == -18355) {
            return (arg0 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V")
    public final void method323(int arg0, int arg1) {
        this.field735 += this.field732 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field750;
        this.field722 = true;
        this.field740 += (double) arg1 * this.field745;
        field742++;
        this.field750 += (double) arg1 * this.field732;
        this.field720 += (double) arg1 * this.field752;
        this.field753 = (int) (Math.atan2(this.field745, this.field752) * 325.949D) + arg0 & 0x7FF;
        this.field761 = (int) (Math.atan2(this.field750, this.field746) * 325.949D) & 0x7FF;
        if (this.field748 == null) {
            return;
        }
        this.field757 += arg1;
        while (true) {
            do {
                do {
                    if (this.field748.field4749[this.field724] >= this.field757) {
                        return;
                    }
                    this.field757 -= this.field748.field4749[this.field724];
                    this.field724++;
                } while (this.field724 < this.field748.field4740.length);
                this.field724 -= this.field748.field4771;
            } while (this.field724 >= 0 && this.field724 < this.field748.field4740.length);
            this.field724 = 0;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)Lcl;")
    private final class195 method324(boolean arg0) {
        class180 var2 = class90.method610(this.field725, !arg0);
        field731++;
        if (arg0) {
            return null;
        }
        class195 var3 = var2.method1206(28, this.field724);
        if (var3 == null) {
            return null;
        } else {
            var3.method200(this.field761);
            return var3;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILcl;)V")
    private final void method325(int arg0, class195 arg1) {
        field728++;
        if (arg0 != 8265) {
            return;
        }
        class27 var3 = (class27) arg1;
        if ((this.field727 == null || this.field727.field2374) && (var3.field451 != null || var3.field472 != null)) {
            this.field727 = new class136(class56.field926, 1, 1);
        }
        if (this.field727 != null) {
            this.field727.method928(var3.field451, var3.field472, false, var3.field462, var3.field455, var3.field469);
        }
        this.field743 = true;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)V")
    public static final void method326(int arg0, boolean arg1) {
        if (arg0 == -32039) {
            class115.method780(class9.field75, arg1, class24.field373, -1412584499, class199.field3458);
            field738++;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIB)V")
    public final void method327(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (!this.field722) {
            double var6 = (double) (arg3 - this.field744);
            double var8 = (double) (arg1 - this.field762);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field740 = (double) this.field755 * var6 / var10 + (double) this.field744;
            this.field735 = (double) this.field758;
            this.field720 = (double) this.field755 * var8 / var10 + (double) this.field762;
        }
        double var12 = (double) (this.field734 + 1 - arg0);
        field736++;
        int var14 = 113 / ((49 - arg4) / 52);
        this.field752 = ((double) arg1 - this.field720) / var12;
        this.field745 = ((double) arg3 - this.field740) / var12;
        this.field746 = Math.sqrt(this.field752 * this.field752 + this.field745 * this.field745);
        if (!this.field722) {
            this.field750 = -this.field746 * Math.tan((double) this.field747 * 0.02454369D);
        }
        this.field732 = ((double) arg2 - this.field735 - this.field750 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIJILkg;)V")
    public final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class136 arg10) {
        field721++;
        class195 var13 = this.method324(false);
        if (var13 != null) {
            this.method325(8265, var13);
            var13.method233(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field727);
            this.field759 = var13.method226();
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field734 = arg6;
        this.field722 = false;
        this.field756 = arg10;
        this.field739 = arg5;
        this.field758 = arg4;
        this.field762 = arg3;
        this.field744 = arg2;
        this.field749 = arg1;
        this.field755 = arg8;
        this.field747 = arg7;
        this.field760 = arg9;
        this.field725 = arg0;
        int var12 = class90.method610(this.field725, true).field3137;
        if (var12 == -1) {
            this.field748 = null;
        } else {
            this.field748 = class38.method297(132, var12);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILjd;)V")
    public static final void method328(int arg0, class87 arg1) {
        class264.field4669 = 3;
        if (arg0 != 1182) {
            method321((byte) -97);
        }
        class273.method1818(-119, true);
        class262.field4636 = 127;
        class158.field2824 = 0;
        field726++;
        class164.field2876 = true;
        class42.field716 = true;
        class120.field2123 = true;
        class64.field1084 = true;
        class272.field4792 = true;
        class32.field578 = true;
        class160.field2839 = 255;
        class221.field3844 = 0;
        class186.field3294 = true;
        class63.field1072 = true;
        class242.field4197 = true;
        class5 var2 = null;
        class107.field1819 = true;
        class168.field3007 = true;
        class101.field1719 = 0;
        class221.field3838 = 2;
        class92.field1550 = 127;
        class65.field1102 = 0;
        class136.method924(2);
        class3.field34 = false;
        class229.field3961 = false;
        class165.field2895 = 0;
        class36.field628 = 0;
        try {
            class275 var3 = arg1.method590(-70, "runescape");
            while (var3.field4844 == 0) {
                class100.method711(0, 1L);
            }
            if (var3.field4844 == 1) {
                var2 = (class5) var3.field4843;
                byte[] var4 = new byte[(int) var2.method46(1)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method49(var4, 0, var4.length - var5, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class11.method71(new class261(var4), (byte) 57);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method47(false);
            }
        } catch (Exception var7) {
        }
    }
}
