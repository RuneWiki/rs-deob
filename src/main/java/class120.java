import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class120 extends class672 {

    @OriginalMember(owner = "client!jr", name = "Y", descriptor = "I")
    private int field1846 = 0;

    @OriginalMember(owner = "client!jr", name = "pb", descriptor = "I")
    private int field1863 = 0;

    @OriginalMember(owner = "client!jr", name = "W", descriptor = "I")
    private int field1844 = 0;

    @OriginalMember(owner = "client!jr", name = "Bb", descriptor = "Z")
    private boolean field1875 = false;

    @OriginalMember(owner = "client!jr", name = "U", descriptor = "I")
    private int field1842 = 0;

    @OriginalMember(owner = "client!jr", name = "Lb", descriptor = "I")
    private int field1885 = -1;

    @OriginalMember(owner = "client!jr", name = "tb", descriptor = "Z")
    private boolean field1867 = false;

    @OriginalMember(owner = "client!jr", name = "qb", descriptor = "Z")
    private boolean field1864;

    @OriginalMember(owner = "client!jr", name = "Gb", descriptor = "I")
    private int field1880;

    @OriginalMember(owner = "client!jr", name = "nb", descriptor = "I")
    public int field1861;

    @OriginalMember(owner = "client!jr", name = "Ib", descriptor = "I")
    public int field1882;

    @OriginalMember(owner = "client!jr", name = "ib", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!jr", name = "Z", descriptor = "I")
    private int field1847;

    @OriginalMember(owner = "client!jr", name = "Nb", descriptor = "I")
    private int field1887;

    @OriginalMember(owner = "client!jr", name = "vb", descriptor = "I")
    private int field1869;

    @OriginalMember(owner = "client!jr", name = "sb", descriptor = "I")
    private int field1866;

    @OriginalMember(owner = "client!jr", name = "X", descriptor = "I")
    private int field1845;

    @OriginalMember(owner = "client!jr", name = "Db", descriptor = "I")
    public int field1877;

    @OriginalMember(owner = "client!jr", name = "bb", descriptor = "Lpf;")
    private class607 field1849;

    @OriginalMember(owner = "client!jr", name = "yb", descriptor = "Z")
    public static boolean field1872 = false;

    @OriginalMember(owner = "client!jr", name = "ab", descriptor = "D")
    private double field1848;

    @OriginalMember(owner = "client!jr", name = "gb", descriptor = "D")
    private double field1854;

    @OriginalMember(owner = "client!jr", name = "hb", descriptor = "D")
    private double field1855;

    @OriginalMember(owner = "client!jr", name = "lb", descriptor = "D")
    private double field1859;

    @OriginalMember(owner = "client!jr", name = "mb", descriptor = "D")
    private double field1860;

    @OriginalMember(owner = "client!jr", name = "rb", descriptor = "D")
    private double field1865;

    @OriginalMember(owner = "client!jr", name = "xb", descriptor = "D")
    private double field1871;

    @OriginalMember(owner = "client!jr", name = "Eb", descriptor = "D")
    private double field1878;

    @OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!jr", name = "Q", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!jr", name = "R", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!jr", name = "S", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!jr", name = "T", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!jr", name = "V", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!jr", name = "db", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!jr", name = "eb", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!jr", name = "jb", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!jr", name = "kb", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!jr", name = "ob", descriptor = "I")
    private int field1862;

    @OriginalMember(owner = "client!jr", name = "ub", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!jr", name = "wb", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!jr", name = "zb", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!jr", name = "Ab", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!jr", name = "Cb", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!jr", name = "Fb", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!jr", name = "Hb", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!jr", name = "Jb", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!jr", name = "Kb", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!jr", name = "Mb", descriptor = "I")
    private int field1886;

    @OriginalMember(owner = "client!jr", name = "cb", descriptor = "Lmea;")
    public static class451 field1850;

    @OriginalMember(owner = "client!jr", name = "fb", descriptor = "Lcv;")
    private class593 field1853;

    @OriginalMember(owner = "client!jr", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field1853 != null) {
            this.field1853.method3451();
        }
        ++field1840;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)V")
    public final void method900(int arg0, int arg1) {
        this.field1865 += (double) arg1 * this.field1859;
        this.field1875 = true;
        this.field1854 += (double) arg1 * this.field1855;
        if (arg0 >= 25) {
            ++field1883;
            if (this.field1864) {
                this.field1860 = (double) (class702.method3970((int) this.field1865, super.field5755, -20103, (int) this.field1854) - this.field1847);
            } else if (this.field1887 != -1) {
                this.field1860 += this.field1848 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1871;
                this.field1871 += (double) arg1 * this.field1848;
            } else {
                this.field1860 += (double) arg1 * this.field1871;
            }
            this.field1862 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field1859, this.field1855)) + 8192;
            this.field1886 = (int) (2607.5945876176133D * Math.atan2(this.field1871, this.field1878)) & 16383;
            if (this.field1849 != null) {
                this.field1863 += arg1;
                while (true) {
                    do {
                        do {
                            if (this.field1849.field8494[this.field1844] >= this.field1863) {
                                return;
                            }
                            this.field1863 -= this.field1849.field8494[this.field1844];
                            ++this.field1844;
                            if (~this.field1849.field8492.length >= ~this.field1844) {
                                this.field1844 -= this.field1849.field8495;
                                if (~this.field1844 > -1 || ~this.field1849.field8492.length >= ~this.field1844) {
                                    this.field1844 = 0;
                                }
                            }
                            this.field1885 = this.field1844 + 1;
                        } while (~this.field1885 > ~this.field1849.field8492.length);
                        this.field1885 -= this.field1849.field8495;
                    } while (this.field1885 >= 0 && ~this.field1849.field8492.length < ~this.field1885);
                    this.field1885 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(Lha;I)Lrn;")
    public final class281 method901(class65 arg0, int arg1) {
        if (arg1 < 50) {
            this.method917(-8);
        }
        ++field1839;
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method902(int arg0, int arg1, int arg2, class65 arg3) {
        ++field1884;
        if (arg1 != -17458) {
            this.field1842 = 74;
        }
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V")
    public final void method903(int arg0) {
        ++field1841;
        if (arg0 != -772) {
            this.finalize();
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIII)V")
    public final void method904(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1873;
        if (!this.field1875) {
            double var6 = (double) (-super.field5742 + arg2);
            double var8 = (double) (-super.field5746 + arg4);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1854 = (double) this.field1845 * var8 / var10 + (double) super.field5746;
            this.field1865 = (double) this.field1845 * var6 / var10 + (double) super.field5742;
            if (!this.field1864) {
                this.field1860 = (double) super.field5741;
            } else {
                this.field1860 = (double) (class702.method3970((int) this.field1865, super.field5755, -20103, (int) this.field1854) + -this.field1847);
            }
        }
        if (arg0 != 2048) {
            this.field1871 = 0.5259040704010807D;
        }
        double var12 = (double) (-arg1 + this.field1882 + 1);
        this.field1859 = ((double) arg2 + -this.field1865) / var12;
        this.field1855 = ((double) arg4 - this.field1854) / var12;
        this.field1878 = Math.sqrt(this.field1859 * this.field1859 + this.field1855 * this.field1855);
        if (~this.field1887 != 0) {
            if (!this.field1875) {
                this.field1871 = -this.field1878 * Math.tan((double) this.field1887 * 0.02454369D);
            }
            this.field1848 = ((double) arg3 + -this.field1860 + -(this.field1871 * var12)) * 2.0D / (var12 * var12);
        } else {
            this.field1871 = ((double) arg3 + -this.field1860) / var12;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZLje;IIILha;I)V")
    public final void method905(boolean arg0, class421 arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6) {
        if (arg2 != 0) {
            this.method917(-82);
        }
        ++field1868;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
    public class120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, int arg14) {
        super(arg1, arg2, arg3, class702.method3970(arg3, arg1, -20103, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
        this.field1864 = arg13;
        this.field1880 = arg14;
        this.field1861 = arg6;
        this.field1882 = arg7;
        this.field1856 = arg12;
        this.field1847 = arg5;
        this.field1887 = arg8;
        this.field1869 = arg0;
        this.field1866 = arg10;
        this.field1845 = arg9;
        this.field1877 = arg11;
        this.field1875 = false;
        int var16 = class456.field6385.method2382(this.field1869, (byte) -127).field4040;
        if (var16 != -1) {
            this.field1849 = class563.field7993.method651(var16, (byte) 116);
        } else {
            this.field1849 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)Z")
    public final boolean method906(int arg0) {
        int var2 = 123 % ((arg0 - 11) / 35);
        ++field1879;
        return this.field1867;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lha;ILqja;Lka;)V")
    private final void method907(class65 arg0, int arg1, class326 arg2, class496 arg3) {
        if (arg1 != -26729) {
            this.method913(-113);
        }
        ++field1874;
        arg3.method66(arg2);
        class88[] var5 = arg3.method97();
        class378[] var6 = arg3.method103();
        if ((this.field1853 == null || this.field1853.field8349) && (var5 != null || var6 != null)) {
            this.field1853 = class593.method3449(class192.field2961, true);
        }
        if (this.field1853 != null) {
            this.field1853.method3457(arg0, (long) class192.field2961, var5, var6, false);
            this.field1853.method3458(super.field5755, super.field9368, super.field9371, super.field9364, super.field9360);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    public static void method908(int arg0) {
        field1850 = null;
        if (arg0 != 0) {
            field1872 = false;
        }
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(Z)Z")
    public final boolean method909(boolean arg0) {
        ++field1837;
        if (arg0) {
            this.field1862 = -69;
        }
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(Z)Z")
    public final boolean method910(boolean arg0) {
        ++field1838;
        if (!arg0) {
            this.method905(false, (class421) null, -37, 28, 45, (class65) null, -16);
        }
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
    public final void method911(byte arg0) {
        ++field1876;
        if (!this.field1875) {
            if (~this.field1866 != -1) {
                class330 var2 = null;
                if (this.field1866 >= 0) {
                    int var3 = this.field1866 - 1;
                    class205 var4 = (class205) class645.field9014.method2242((long) var3, -1);
                    if (var4 != null) {
                        var2 = var4.field3181;
                    }
                } else {
                    int var5 = -this.field1866 + -1;
                    if (~class250.field3689 == ~var5) {
                        var2 = class210.field3250;
                    } else {
                        var2 = class767.field10560[var5];
                    }
                }
                if (var2 != null) {
                    super.field5746 = var2.field5746;
                    super.field5742 = var2.field5742;
                    super.field5741 = class702.method3970(var2.field5742, super.field5755, -20103, var2.field5746) + -this.field1847;
                    if (~this.field1880 <= -1) {
                        class539 var6 = var2.method2096(0);
                        int var7 = 0;
                        int var8 = 0;
                        if (var6.field7785 != null && var6.field7785[this.field1880] != null) {
                            var8 += var6.field7785[this.field1880][2];
                            var7 += var6.field7785[this.field1880][0];
                        }
                        if (var6.field7751 != null && var6.field7751[this.field1880] != null) {
                            var7 += var6.field7751[this.field1880][0];
                            var8 += var6.field7751[this.field1880][2];
                        }
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var2.field4647.method4200((byte) -3);
                            int var10 = var9;
                            if (var2.field4605 != null && var2.field4605[this.field1880] != -1) {
                                var10 = var2.field4605[this.field1880];
                            }
                            int var11 = 16383 & -var9 + var10;
                            int var12 = class376.field5186[var11];
                            int var13 = class376.field5188[var11];
                            int var14 = var7 * var13 + var8 * var12 >> 14;
                            int var15 = var8 * var13 + -(var7 * var12) >> 14;
                            super.field5742 += var14;
                            super.field5746 += var15;
                        }
                    }
                }
            }
            int var17 = 67 % ((arg0 - 45) / 56);
        }
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(ILha;)V")
    public final void method912(int arg0, class65 arg1) {
        ++field1881;
        class496 var3 = this.method915(0, 456498569, arg1);
        if (var3 != null) {
            class326 var4 = arg1.method514();
            var4.method1888(this.field1886);
            var4.method1871(this.field1862);
            if (arg0 >= 52) {
                var4.method1878((int) this.field1865, (int) this.field1860, (int) this.field1854);
                this.field1842 = var3.method118();
                this.field1846 = var3.method75();
                this.method907(arg1, -26729, var4, var3);
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "(I)V")
    public final void method913(int arg0) {
        super.field9364 = super.field9360 = (short) ((int) (this.field1854 / 512.0D));
        if (arg0 == -13764) {
            super.field9368 = super.field9371 = (short) ((int) (this.field1865 / 512.0D));
            ++field1843;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V")
    public final void method914(boolean arg0) {
        if (!arg0) {
            this.field1863 = -86;
        }
        ++field1857;
        if (this.field1853 != null) {
            this.field1853.method3451();
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILha;)Lka;")
    private final class496 method915(int arg0, int arg1, class65 arg2) {
        ++field1852;
        class278 var4 = class456.field6385.method2382(this.field1869, (byte) -123);
        if (arg1 != 456498569) {
            this.field1861 = -119;
        }
        return var4.method1815(class563.field7993, this.field1885, this.field1844, arg0, this.field1863, (byte) -45, arg2);
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)I")
    public final int method916(boolean arg0) {
        ++field1851;
        return !arg0 ? -2 : this.field1842;
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)I")
    public final int method917(int arg0) {
        if (arg0 != -1760267218) {
            return -19;
        } else {
            ++field1870;
            return this.field1846;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lha;I)Lmaa;")
    public final class495 method918(class65 arg0, int arg1) {
        ++field1858;
        class496 var3 = this.method915(2048, arg1 ^ -456518329, arg0);
        if (var3 == null) {
            return null;
        } else {
            class326 var4 = arg0.method514();
            var4.method1888(this.field1886);
            if (arg1 != -30514) {
                this.field1878 = -1.3606380174773012D;
            }
            var4.method1871(this.field1862);
            var4.method1878((int) this.field1865, (int) this.field1860, (int) this.field1854);
            this.method907(arg0, arg1 + 3785, var4, var3);
            class495 var5 = class86.method652(false, 0, 1);
            if (!class576.field8120) {
                var3.method88(var4, var5.field7067[0], 0);
            } else {
                var3.method106(var4, var5.field7067[0], class740.field10205, 0);
            }
            if (this.field1853 != null) {
                class296 var6 = this.field1853.method3450();
                if (!class576.field8120) {
                    arg0.method504(var6);
                } else {
                    arg0.method541(var6, class740.field10205);
                }
            }
            this.field1867 = var3.method121();
            this.field1842 = var3.method118();
            this.field1846 = var3.method75();
            return var5;
        }
    }
}
