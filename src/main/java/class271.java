import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class271 extends class226 {

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    private int field4698 = 0;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    private int field4709 = -32768;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    private int field4715 = 0;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    private int field4714 = -1;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "Lvd;")
    private class127 field4718 = null;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    private int field4713 = -1;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "Z")
    private boolean field4703 = true;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
    private int field4722 = 0;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    private int field4706;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    private int field4692;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    private int field4699;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    private int field4700;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "I")
    private int field4705;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    private int field4694;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "Laj;")
    private class1 field4695;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "I")
    private int field4719;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    private int field4691;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "Z")
    public static boolean field4693 = true;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "[I")
    public static int[] field4707 = new int[1000];

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Lmh;")
    public static class128 field4690 = class22.method156(124, " loggt sich aus)3");

    @OriginalMember(owner = "client!n", name = "K", descriptor = "Lmh;")
    public static class128 field4708 = class22.method156(122, "0(U");

    @OriginalMember(owner = "client!n", name = "U", descriptor = "Lmh;")
    public static class128 field4717 = class22.method156(124, "(Udns");

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "Z")
    public static boolean field4721 = false;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILdj;Lue;Ldj;Z)V", line = 4)
    public static final void method1905(int arg0, class314 arg1, class14 arg2, class314 arg3, boolean arg4) {
        class210.field3727 = arg1;
        field4710++;
        class45.field910 = arg4;
        class257.field4419 = arg3;
        int var5 = class210.field3727.method2152((byte) -113) - 1;
        class212.field3752 = var5 * 256 + class210.field3727.method2146((byte) -50, var5);
        if (arg0 != -4537) {
            method1905(48, (class314) null, (class14) null, (class314) null, false);
        }
        class303.field5135 = arg2;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)Ljm;", line = 32)
    private final class226 method1906(byte arg0) {
        if (arg0 == -69) {
            field4704++;
            return this.method1910(false, true);
        } else {
            return (class226) null;
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V", line = 45)
    public static void method1907(int arg0) {
        if (arg0 == 128) {
            field4690 = null;
            field4707 = null;
            field4717 = null;
            field4708 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIIIJ)V", line = 76)
    public final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field4697++;
        class226 var11 = this.method1906((byte) -69);
        if (var11 != null) {
            var11.method201(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4709 = var11.method204();
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIIIIIZLjm;)V", line = 408)
    public class271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class226 arg8) {
        this.field4706 = arg0;
        this.field4692 = arg3;
        this.field4699 = arg2;
        this.field4700 = arg5;
        this.field4705 = arg1;
        this.field4694 = arg4;
        if (class247.field4247 && arg8 != null) {
            if (arg8 instanceof class271) {
                ((class271) arg8).method1911(12876);
            } else {
                class38 var10 = class239.method1629((byte) -79, this.field4706);
                if (var10.field817 != null) {
                    var10 = var10.method258(-122);
                }
                if (var10 != null) {
                    class72.method480(this.field4699, this.field4700, this.field4692, var10, 0, this.field4694, 0, -1, this.field4705);
                }
            }
        }
        if (arg6 != -1) {
            this.field4695 = class167.method1091(125, arg6);
            this.field4719 = class293.field5011 - 1;
            this.field4691 = 0;
            if (this.field4695.field5 == 0 && arg8 != null && arg8 instanceof class271) {
                class271 var11 = (class271) arg8;
                if (this.field4695 == var11.field4695) {
                    this.field4691 = var11.field4691;
                    this.field4719 = var11.field4719;
                    return;
                }
            }
            if (arg7 && this.field4695.field26 != -1) {
                this.field4691 = (int) ((double) this.field4695.field8.length * Math.random());
                this.field4719 -= (int) (Math.random() * (double) this.field4695.field7[this.field4691]);
            }
        }
        if (class247.field4247 && arg8 != null) {
            this.method1910(true, true);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZ)Lem;", line = 99)
    public static final class10 method1908(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1905(-41, (class314) null, (class14) null, (class314) null, false);
        }
        class10 var3 = class233.method1606(true, arg0);
        field4702++;
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field348 == null || arg1 >= var3.field348.length) {
            return null;
        } else {
            return var3.field348[arg1];
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(III)V", line = 118)
    private final void method1909(int arg0, int arg1, int arg2) {
        if (arg0 > -52) {
            return;
        }
        field4701++;
        if (this.field4695 == null) {
            return;
        }
        int var4 = class293.field5011 - this.field4719;
        if (var4 > 100 && this.field4695.field26 > 0) {
            int var5 = this.field4695.field8.length - this.field4695.field26;
            while (var5 > this.field4691 && this.field4695.field7[this.field4691] < var4) {
                var4 -= this.field4695.field7[this.field4691];
                this.field4691++;
            }
            if (var5 <= this.field4691) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field4695.field8.length; var7++) {
                    var6 += this.field4695.field7[var7];
                }
                var4 %= var6;
            }
        }
        label60: {
            do {
                do {
                    if (this.field4695.field7[this.field4691] >= var4) {
                        break label60;
                    }
                    class171.method1143(arg1, 120, this.field4695, false, this.field4691, arg2);
                    var4 -= this.field4695.field7[this.field4691];
                    this.field4691++;
                } while (this.field4695.field8.length > this.field4691);
                this.field4691 -= this.field4695.field26;
            } while (this.field4691 >= 0 && this.field4691 < this.field4695.field8.length);
            this.field4695 = null;
        }
        this.field4719 = class293.field5011 - var4;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZZ)Ljm;", line = 180)
    private final class226 method1910(boolean arg0, boolean arg1) {
        field4711++;
        boolean var3 = class267.field4626 != class250.field4334;
        class38 var4 = class239.method1629((byte) 94, this.field4706);
        if (var4.field817 != null) {
            var4 = var4.method258(113);
        }
        if (var4 == null) {
            if (class247.field4247 && !var3) {
                this.method1911(12876);
            }
            return null;
        }
        int var5 = this.field4699 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field778;
            var6 = var4.field758;
        } else {
            var6 = var4.field778;
            var7 = var4.field758;
        }
        int var8 = (var7 + 1 >> 1) + this.field4694;
        int var9 = (var7 >> 1) + this.field4694;
        int var10 = this.field4700 + (var6 >> 1);
        if (!arg1) {
            this.method201(102, 81, 91, 20, -75, 85, 121, 76, -112L);
        }
        int var11 = (var6 + 1 >> 1) + this.field4700;
        this.method1909(-86, var10 * 128, var9 * 128);
        boolean var12 = !var3 && var4.field806 && (this.field4713 != var4.field819 || this.field4714 != this.field4691 && class182.field3197 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int var13 = (this.field4694 << 7) + (var7 << 6);
        int var14 = (this.field4700 << 7) + (var6 << 6);
        int[][] var15 = class250.field4334[this.field4692];
        int var16 = var15[var8][var10] + var15[var9][var10] + var15[var8][var11] + var15[var9][var11] >> 2;
        int[][] var17 = (int[][]) null;
        if (var3) {
            var17 = class267.field4626[0];
        } else if (this.field4692 < 3) {
            var17 = class250.field4334[this.field4692 + 1];
        }
        if (class247.field4247 && var12) {
            class312.method2128(this.field4718, this.field4715, this.field4698, this.field4722);
        }
        boolean var18 = this.field4718 == null;
        class285 var19;
        if (this.field4695 == null) {
            var19 = var4.method262(var16, this.field4699, var18 ? class175.field3097 : this.field4718, var15, false, this.field4705, var14, 127, var17, var13, var12);
        } else {
            var19 = var4.method261(this.field4695, -11, var12, var17, var18 ? class175.field3097 : this.field4718, this.field4699, var15, this.field4705, var14, this.field4691, var13, var16);
        }
        if (var19 == null) {
            return null;
        }
        if (class247.field4247 && var12) {
            if (var18) {
                class175.field3097 = var19.field4892;
            }
            int var20 = 0;
            if (this.field4692 != 0) {
                int[][] var21 = class250.field4334[0];
                var20 = var16 - (var21[var8][var10] + var21[var9][var10] - (-var21[var8][var11] + -var21[var9][var11]) >> 2);
            }
            class127 var22 = var19.field4892;
            if (this.field4703 && class312.method2127(var22, var13, var20, var14)) {
                this.field4703 = false;
            }
            if (!this.field4703) {
                class312.method2125(var22, var13, var20, var14);
                this.field4718 = var22;
                if (var18) {
                    class175.field3097 = null;
                }
                this.field4698 = var20;
                this.field4715 = var13;
                this.field4722 = var14;
            }
            this.field4713 = var4.field819;
            this.field4714 = this.field4691;
        }
        return var19.field4893;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()I", line = 315)
    public final int method204() {
        field4696++;
        return this.field4709;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V", line = 347)
    public final void method1553(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class247.field4247) {
            this.method1910(true, true);
        } else {
            this.method1909(-89, (arg2 + (arg4 - arg2 >> 1)) * 128 + 64, ((-arg3 + arg0 >> 1) + arg3) * 128 + 64);
        }
        field4720++;
        int var6 = -21 % ((-arg1 - 49) / 58);
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V", line = 370)
    public final void method1911(int arg0) {
        field4716++;
        if (arg0 != 12876) {
            this.method1911(-121);
        }
        if (this.field4718 != null) {
            class312.method2128(this.field4718, this.field4715, this.field4698, this.field4722);
        }
        this.field4714 = -1;
        this.field4718 = null;
        this.field4713 = -1;
    }
}
