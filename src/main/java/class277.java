import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class277 extends class108 {

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    private int field4814 = -32768;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    private int field4826 = 0;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "Z")
    private boolean field4835 = false;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "I")
    private int field4850 = 0;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    private int field4831;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    private int field4841;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public int field4813;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public int field4847;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public int field4818;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    private int field4824;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    private int field4840;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    private int field4842;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public int field4845;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public int field4815;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    private int field4820;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "Lpk;")
    private class67 field4833;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field4822 = 0;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field4832 = 0;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "Lmb;")
    public static class96 field4844 = class243.method1708("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", (byte) 114);

    @OriginalMember(owner = "client!f", name = "O", descriptor = "Lmb;")
    public static class96 field4843 = class243.method1708("Lade Sprites )2 ", (byte) 124);

    @OriginalMember(owner = "client!f", name = "j", descriptor = "D")
    private double field4812;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "D")
    private double field4816;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "D")
    public double field4821;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "D")
    public double field4823;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "D")
    private double field4827;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "D")
    private double field4830;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "D")
    public double field4838;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "D")
    private double field4839;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public int field4829;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    private int field4836;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "Lnh;")
    public static class276 field4849;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lff;IIIIZI)V")
    public static final void method1875(class3 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class103.field1736 = arg5;
        class33.field551 = arg3;
        class249.field4308 = 1;
        class85.field1436 = arg0;
        field4819++;
        if (arg6 > -15) {
            field4849 = null;
        }
        class269.field4690 = arg1;
        class141.field2525 = arg4;
        class74.field1295 = arg2;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
    public static void method1876(byte arg0) {
        field4849 = null;
        if (arg0 >= -7) {
            method1879(-23, -79, 64);
        }
        field4843 = null;
        field4844 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBIII)V")
    public final void method1877(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4828++;
        if (!this.field4835) {
            double var6 = (double) (arg0 - this.field4820);
            double var8 = (double) (arg3 - this.field4824);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field4823 = (double) this.field4842 * var8 / var10 + (double) this.field4824;
            this.field4838 = (double) this.field4841;
            this.field4821 = (double) this.field4842 * var6 / var10 + (double) this.field4820;
        }
        double var12 = (double) (this.field4818 + 1 - arg4);
        this.field4827 = ((double) arg0 - this.field4821) / var12;
        this.field4816 = ((double) arg3 - this.field4823) / var12;
        if (arg1 != -8) {
            this.field4813 = -90;
        }
        this.field4839 = Math.sqrt(this.field4827 * this.field4827 + this.field4816 * this.field4816);
        if (!this.field4835) {
            this.field4830 = -this.field4839 * Math.tan((double) this.field4831 * 0.02454369D);
        }
        this.field4812 = ((double) arg2 - this.field4838 - (this.field4830 * var12)) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Lra;")
    private final class35 method1878(int arg0) {
        class183 var2 = class146.method1082(this.field4840, (byte) -127);
        if (arg0 != 2) {
            field4822 = -83;
        }
        field4834++;
        class35 var3 = var2.method1290(this.field4826, 125);
        if (var3 == null) {
            return null;
        } else {
            var3.method272(this.field4836);
            return var3;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(III)Lsb;")
    public static final class105 method1879(int arg0, int arg1, int arg2) {
        class187 var3 = class259.field4487[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class105 var4 = var3.field3269;
            var3.field3269 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field4837++;
        class35 var11 = this.method1878(2);
        if (var11 != null) {
            var11.method52(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4814 = var11.method50();
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()I")
    public final int method50() {
        field4846++;
        return this.field4814;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
    public final void method1880(int arg0, int arg1) {
        this.field4835 = true;
        this.field4823 += (double) arg1 * this.field4816;
        if (arg0 < 22) {
            method1879(100, 112, -109);
        }
        this.field4838 += this.field4812 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field4830;
        this.field4821 += (double) arg1 * this.field4827;
        field4848++;
        this.field4830 += (double) arg1 * this.field4812;
        this.field4829 = (int) (Math.atan2(this.field4827, this.field4816) * 325.949D) + 1024 & 0x7FF;
        this.field4836 = (int) (Math.atan2(this.field4830, this.field4839) * 325.949D) & 0x7FF;
        if (this.field4833 == null) {
            return;
        }
        this.field4850 += arg1;
        while (true) {
            do {
                do {
                    if (this.field4850 <= this.field4833.field1143[this.field4826]) {
                        return;
                    }
                    this.field4850 -= this.field4833.field1143[this.field4826];
                    this.field4826++;
                } while (this.field4833.field1140.length > this.field4826);
                this.field4826 -= this.field4833.field1149;
            } while (this.field4826 >= 0 && this.field4833.field1140.length > this.field4826);
            this.field4826 = 0;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lw;IIB)V")
    public static final void method1881(class107 arg0, int arg1, int arg2, byte arg3) {
        field4825++;
        if (class159.field2803 != 0 && class159.field2803 != 3 || !arg0.method803(127)) {
            return;
        }
        int var4 = 68 / ((69 - arg3) / 55);
        int var5 = arg0.field1891[arg1];
        if (arg2 < var5 || arg2 > (arg0.field1973[arg1] + var5)) {
            return;
        }
        int var6 = arg2 - arg0.field1856 / 2;
        int var7 = class235.field4033 + class21.field343 & 0x7FF;
        int var8 = class240.field4162[var7];
        int var9 = (class222.field3800 + 256) * var8 >> 8;
        int var10 = arg1 - arg0.field1919 / 2;
        int var11 = class240.field4176[var7];
        int var12 = (class222.field3800 + 256) * var11 >> 8;
        int var13 = var10 * var12 - var6 * var9 >> 11;
        int var14 = var9 * var10 + (var6 * var12) >> 11;
        int var15 = class236.field4047.field4511 + var14 >> 7;
        int var16 = class236.field4047.field4533 - var13 >> 7;
        if (class254.field4389 > 0 && class233.field3990[82] && class233.field3990[81]) {
            class213.method1480(class196.field3383 + var15, class225.field3832 + var16, -5, class216.field3712);
            return;
        }
        boolean var17 = class2.method12(0, class236.field4047.field4566[0], var16, (byte) -73, 0, true, 1, class236.field4047.field4528[0], 0, 0, 0, var15);
        if (!var17) {
            return;
        }
        class140.field2505.method1652(var6, (byte) 41);
        class140.field2505.method1652(var10, (byte) 41);
        class140.field2505.method1632(true, class235.field4033);
        class140.field2505.method1652(57, (byte) 41);
        class140.field2505.method1652(class21.field343, (byte) 41);
        class140.field2505.method1652(class222.field3800, (byte) 41);
        class140.field2505.method1652(89, (byte) 41);
        class140.field2505.method1632(true, class236.field4047.field4511);
        class140.field2505.method1632(true, class236.field4047.field4533);
        class140.field2505.method1652(client.field1983, (byte) 41);
        class140.field2505.method1652(63, (byte) 41);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field4831 = arg7;
        this.field4841 = arg4;
        this.field4813 = arg5;
        this.field4835 = false;
        this.field4847 = arg1;
        this.field4818 = arg6;
        this.field4824 = arg3;
        this.field4840 = arg0;
        this.field4842 = arg8;
        this.field4845 = arg10;
        this.field4815 = arg9;
        this.field4820 = arg2;
        int var12 = class146.method1082(this.field4840, (byte) -117).field3175;
        if (var12 == -1) {
            this.field4833 = null;
        } else {
            this.field4833 = class189.method1332(var12, 2);
        }
    }
}
