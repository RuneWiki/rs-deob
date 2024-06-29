import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class226 extends class312 {

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    private int field3802 = -32768;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "Z")
    private boolean field3806 = false;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    private int field3797 = 0;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    private int field3800 = -1;

    @OriginalMember(owner = "client!am", name = "V", descriptor = "I")
    private int field3831 = 0;

    @OriginalMember(owner = "client!am", name = "ab", descriptor = "Z")
    private boolean field3836 = false;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    private int field3804;

    @OriginalMember(owner = "client!am", name = "H", descriptor = "I")
    public int field3817;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public int field3801;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    private int field3803;

    @OriginalMember(owner = "client!am", name = "fb", descriptor = "I")
    private int field3841;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public int field3810;

    @OriginalMember(owner = "client!am", name = "cb", descriptor = "I")
    private int field3838;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!am", name = "D", descriptor = "I")
    private int field3813;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "I")
    private int field3811;

    @OriginalMember(owner = "client!am", name = "W", descriptor = "I")
    public int field3832;

    @OriginalMember(owner = "client!am", name = "eb", descriptor = "Lck;")
    private class163 field3840;

    @OriginalMember(owner = "client!am", name = "U", descriptor = "Z")
    public static boolean field3830 = false;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "D")
    public double field3798;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "D")
    private double field3799;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "D")
    private double field3807;

    @OriginalMember(owner = "client!am", name = "I", descriptor = "D")
    public double field3818;

    @OriginalMember(owner = "client!am", name = "J", descriptor = "D")
    public double field3819;

    @OriginalMember(owner = "client!am", name = "O", descriptor = "D")
    private double field3824;

    @OriginalMember(owner = "client!am", name = "X", descriptor = "D")
    private double field3833;

    @OriginalMember(owner = "client!am", name = "Y", descriptor = "D")
    private double field3834;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "I")
    private int field3808;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!am", name = "E", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!am", name = "F", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!am", name = "G", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!am", name = "K", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!am", name = "M", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!am", name = "N", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!am", name = "P", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!am", name = "Q", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!am", name = "R", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!am", name = "S", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!am", name = "T", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!am", name = "Z", descriptor = "I")
    public int field3835;

    @OriginalMember(owner = "client!am", name = "bb", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!am", name = "L", descriptor = "Lge;")
    private class139 field3821;

    @OriginalMember(owner = "client!am", name = "db", descriptor = "[Lmd;")
    public static class273[] field3839;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BLvd;)I")
    public static final int method1597(byte arg0, class307 arg1) {
        field3815++;
        class54 var2 = arg1.field4960;
        if (var2.field904 != null) {
            var2 = var2.method343(-1);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 < 122) {
            field3839 = null;
        }
        int var3 = var2.field935;
        class190 var4 = arg1.method282(-1399);
        if (arg1.field782 == var4.field3072) {
            var3 = var2.field967;
        } else if (arg1.field782 == var4.field3082 || arg1.field782 == var4.field3056 || arg1.field782 == var4.field3084 || arg1.field782 == var4.field3051) {
            var3 = var2.field897;
        } else if (arg1.field782 == var4.field3061 || arg1.field782 == var4.field3059 || arg1.field782 == var4.field3060 || arg1.field782 == var4.field3041) {
            var3 = var2.field905;
        }
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BLud;)V")
    private final void method1598(byte arg0, class242 arg1) {
        class112 var3 = (class112) arg1;
        if ((this.field3821 == null || this.field3821.field2269) && (var3.field1847 != null || var3.field1878 != null)) {
            this.field3821 = new class139(class275.field4598, 1, 1);
        }
        if (this.field3821 != null) {
            this.field3821.method1027(var3.field1847, var3.field1878, false, var3.field1849, var3.field1874, var3.field1848);
        }
        if (arg0 > -100) {
            this.method930(-68, 127, -6, -111, -38);
        }
        this.field3806 = true;
        field3822++;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
    public static void method1599(int arg0) {
        if (arg0 == 2047) {
            field3839 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1600(int arg0, String arg1) {
        field3812++;
        if (arg0 != 5) {
            field3830 = true;
        }
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class76.field1296; var2++) {
            if (arg1.equalsIgnoreCase(class190.field3040[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(II)V")
    public final void method1601(int arg0, int arg1) {
        this.field3818 += (double) arg1 * this.field3807;
        this.field3819 += (double) arg1 * this.field3833;
        if (arg0 != 0) {
            this.field3802 = 85;
        }
        field3826++;
        if (this.field3813 == -1) {
            this.field3798 += (double) arg1 * this.field3824;
        } else {
            this.field3798 += this.field3799 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field3824;
            this.field3824 += (double) arg1 * this.field3799;
        }
        this.field3836 = true;
        this.field3835 = (int) (Math.atan2(this.field3833, this.field3807) * 325.949D) + 1024 & 0x7FF;
        this.field3808 = (int) (Math.atan2(this.field3824, this.field3834) * 325.949D) & 0x7FF;
        if (this.field3840 == null) {
            return;
        }
        this.field3797 += arg1;
        while (true) {
            do {
                do {
                    if (this.field3797 <= this.field3840.field2638[this.field3831]) {
                        return;
                    }
                    this.field3797 -= this.field3840.field2638[this.field3831];
                    this.field3831++;
                    if (this.field3840.field2639.length <= this.field3831) {
                        this.field3831 -= this.field3840.field2637;
                        if (this.field3831 < 0 || this.field3840.field2639.length <= this.field3831) {
                            this.field3831 = 0;
                        }
                    }
                    this.field3800 = this.field3831 + 1;
                } while (this.field3800 < this.field3840.field2639.length);
                this.field3800 -= this.field3840.field2637;
            } while (this.field3800 >= 0 && this.field3840.field2639.length > this.field3800);
            this.field3800 = -1;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIIIJILge;)V")
    public final void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class139 arg10) {
        class242 var13 = this.method1606((byte) -123);
        field3820++;
        if (var13 != null) {
            this.method1598((byte) -122, var13);
            var13.method852(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3821);
            this.field3802 = var13.method860();
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "()I")
    public final int method860() {
        field3805++;
        return this.field3802;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BIIII)V")
    public final void method1602(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field3836) {
            double var6 = (double) (arg2 - this.field3803);
            double var8 = (double) (arg1 - this.field3841);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3819 = (double) this.field3811 * var6 / var10 + (double) this.field3803;
            this.field3798 = (double) this.field3838;
            this.field3818 = (double) this.field3811 * var8 / var10 + (double) this.field3841;
        }
        field3829++;
        if (arg0 >= -109) {
            method1600(-63, (String) null);
        }
        double var12 = (double) (this.field3817 - (arg3 - 1));
        this.field3833 = ((double) arg2 - this.field3819) / var12;
        this.field3807 = ((double) arg1 - this.field3818) / var12;
        this.field3834 = Math.sqrt(this.field3833 * this.field3833 + this.field3807 * this.field3807);
        if (this.field3813 == -1) {
            this.field3824 = ((double) arg4 - this.field3798) / var12;
        } else {
            if (!this.field3836) {
                this.field3824 = -this.field3834 * Math.tan((double) this.field3813 * 0.02454369D);
            }
            this.field3799 = ((double) arg4 - this.field3798 - this.field3824 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIB)V")
    public static final void method1603(int arg0, int arg1, int arg2, byte arg3) {
        field3816++;
        if (arg3 >= -96) {
            field3839 = null;
        }
        class87 var4 = class31.method197((byte) -79, arg2, arg0, arg1);
        if (var4 == null) {
            return;
        }
        class162.field2630 = new String[var4.field1446];
        class41.field607 = new int[var4.field1451];
        if (var4.field1443 == 15 || var4.field1443 == 17 || var4.field1443 == 16) {
            int var5 = 0;
            int var6 = 0;
            if (class27.field471 != null) {
                var6 = class27.field471.field3424;
                var5 = class27.field471.field3368;
            }
            class41.field607[0] = class96.field1558 - var5;
            class41.field607[1] = class87.field1448 - var6;
        }
        class186.method1345(var4, 0, 200000);
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(IIIII)V")
    public final void method930(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3823++;
        if (!this.field3806) {
            class242 var6 = this.method1606((byte) -127);
            if (var6 == null) {
                return;
            }
            this.method1598((byte) -112, var6);
        }
        if (this.field3821 != null) {
            this.field3821.method1033(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(B)V")
    public static final void method1604(byte arg0) {
        field3827++;
        class46.method295((byte) 112, 5);
        class152.method1161(5, false);
        class232.method1667(114, 5);
        class189.method1368(-13655, 5);
        class36.method223(5, 449960425);
        class22.method145((byte) -75, 5);
        class142.method1055((byte) 38, 5);
        class283.method1974(5, -124);
        int var1 = -84 / ((arg0 + 35) / 44);
        class28.method179(55, 5);
        class284.method1987(-1690092664, 5);
        class208.method1459(5, (byte) 75);
        class73.method518(5, false);
        class69.method477(5, 3206);
        class299.method2051(5, 11276);
        class50.method323((byte) -69, 5);
        class25.method163((byte) 33, 5);
        class1.method10((byte) 95, 5);
        class155.method1176(-27219, 5);
        class207.method1457(50, (byte) 3);
        class255.method1840(-1, 5);
        class84.method590(false, 5);
        class290.field4775.method98(1, 5);
        class125.field2100.method98(1, 5);
        class84.field1388.method98(1, 5);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lab;Ljava/lang/String;I)I")
    public static final int method1605(class249 arg0, String arg1, int arg2) {
        field3825++;
        int var3 = arg0.field4160;
        if (arg2 == -28537) {
            byte[] var4 = class311.method2101((byte) 106, arg1);
            arg0.method1791(var4.length, -16);
            arg0.field4160 += class196.field3166.method90(arg0.field4160, arg2 - 916200915, 0, var4.length, arg0.field4182, var4);
            return arg0.field4160 - var3;
        } else {
            return 36;
        }
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(B)Lud;")
    private final class242 method1606(byte arg0) {
        field3837++;
        int var2 = -122 / ((-arg0 - 86) / 35);
        class84 var3 = class258.method1847(-120, this.field3804);
        class242 var4 = var3.method592(this.field3800, -104, this.field3831, this.field3797);
        if (var4 == null) {
            return null;
        } else {
            var4.method840(this.field3808);
            return var4;
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3804 = arg0;
        this.field3836 = false;
        this.field3817 = arg6;
        this.field3801 = arg10;
        this.field3803 = arg2;
        this.field3841 = arg3;
        this.field3810 = arg5;
        this.field3838 = arg4;
        this.field3809 = arg9;
        this.field3813 = arg7;
        this.field3811 = arg8;
        this.field3832 = arg1;
        int var12 = class258.method1847(-122, this.field3804).field1404;
        if (var12 == -1) {
            this.field3840 = null;
        } else {
            this.field3840 = class34.method211(var12, 3);
        }
    }
}
